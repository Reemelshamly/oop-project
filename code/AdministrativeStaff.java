
public class AdministrativeStaff {
        private int StaffID;
        private String name;
        private String role;
        public AdministrativeStaff(int staffID, String name, String role) {
            super();
            StaffID = staffID;
            this.name = name;
            this.role = role;
        }
        public int getStaffID() {
            return StaffID;
        }
        public void setStaffID(int staffID) {
            StaffID = staffID;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }
        
    }