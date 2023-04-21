    package domain;
    import java.time.LocalDate;
    public class Mentoring extends Content{
        private LocalDate hourWorked;
        @Override
        public double calculateXp() {
        return XP_DEFAULT + 20d;
        }

        public Mentoring(){

          }
          public LocalDate getHourWorked() {
            return hourWorked;
        }

        public void setHourWorked(LocalDate hourWorked) {
            this.hourWorked = hourWorked;
        }

        @Override
        public String toString() {
            return "Mentoring{" +
                    "title='" + getTitle() + '\'' +
                    ", description='" + getDescription() + '\'' +
                    ", hourWorked=" + hourWorked +
                    '}';
        }
    }
