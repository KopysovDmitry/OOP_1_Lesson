public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;
    private String  error = "Данные некорректны";

    Human(String name,int yearOfBirth,String town,String jobTitle){
        if (this.name != null && !this.name.isEmpty() && !this.name.isBlank()){
            this.name = name;
        } else {
            this.name = "Данные некорректны";
        }
        if (town != null && !town.isEmpty() && !town.isBlank()){
            this.town = town;
        } else {
            this.town = "Данные некорректны";
        }
        if (yearOfBirth>=0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()){
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "Данные некорректны";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    void greetings(){
        if ( name.equals(error) || town.equals(error) || jobTitle.equals(error)) {
        }else {
            System.out.println("Привет! Меня зовут " + getName() + " Я из города " + getTown() + " Я родился в "
                    + getYearOfBirth() + " году. Я работаю на должности " + getJobTitle());
        }
    }
}
