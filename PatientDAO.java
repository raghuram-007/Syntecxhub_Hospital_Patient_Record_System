import java.sql.*;

public class PatientDAO {

    // ADD PATIENT
    public void addPatient(String name, int age, String gender, String contact, String history) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO patients(name, age, gender, contact, medical_history) VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, gender);
            ps.setString(4, contact);
            ps.setString(5, history);
            ps.executeUpdate();
            System.out.println("✅ Patient Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW PATIENTS
    public void viewPatients() {
        try (Connection con = DBConnection.getConnection()) {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM patients");
            System.out.println("ID | Name | Age | Gender | Contact | Medical History");
            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " | " +
                    rs.getString(2) + " | " +
                    rs.getInt(3) + " | " +
                    rs.getString(4) + " | " +
                    rs.getString(5) + " | " +
                    rs.getString(6)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE MEDICAL HISTORY
    public void updateMedicalHistory(int id, String history) {
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps =
                con.prepareStatement("UPDATE patients SET medical_history=? WHERE patient_id=?");
            ps.setString(1, history);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("✅ Medical History Updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
