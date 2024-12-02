import java.util.Date;
public class Case {
    enum Status {
        Won,Cold,Ongoing,Lost
    }
        private int caseID;
        private String caseType;
        private Status CaseStatus;
        private Date startDate;
        private Date endDate;
        public Case(int caseID, String caseType, Date endDate) {
            super();
            this.caseID = caseID;
            this.caseType = caseType;
            this.CaseStatus = Status.Ongoing;
            //nefham el status.ongoing
            this.startDate = new Date();
            this.endDate = endDate;
        }
        public Status getCaseStatus() {
            return CaseStatus;
        }
        public int getCaseID() {
            return caseID;
        }
        public void setCaseID(int caseID) {
            this.caseID = caseID;
        }
        public String getCaseType() {
            return caseType;
        }
        public void setCaseType(String caseType) {
            this.caseType = caseType;
        }
        public Status getStatus() {
            return CaseStatus;
        }
        public void setStatus(Status status) {
            this.CaseStatus = status;
        }
        public Date getEndDate() {
            return endDate;
        }
        public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }
        public Date getStartDate() {
            return startDate;
        }
}