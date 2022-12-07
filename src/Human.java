public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    Human(String name,int yearOfBirth,String town,String jobTitle){
        this.name = name;
        this.town = town;
        if (yearOfBirth>=0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.jobTitle = jobTitle;
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
        System.out.println("Привет! Меня зовут "+ getName() + " Я из города "+ getTown()+" Я родился в "
                +getYearOfBirth()+" году. Я работаю на должности "+getJobTitle());
    }
}
