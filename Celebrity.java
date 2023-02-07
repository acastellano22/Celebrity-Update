class Celebrity {

    private String name;
    private String gender;
    private String occupation;
    private String age;
    private String hairColor;

    public Celebrity(String name, String gender, String occupation, String age, String hairColor) {
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        this.age = age;
        this.hairColor = hairColor;

    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getOccupation() {
        return this.occupation;
    }
    
    public String getAge() {
        return this.age;
    }

    public String getHairColor() {
        return this.hairColor;
    }
}