package builder;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    private String address;
    private String phoneNumber;
    private String linkedUrl;
    private String githubUrl;
    private String fbUrl;

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.email = builder.email;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.linkedUrl = builder.linkedUrl;
        this.githubUrl = builder.githubUrl;
        this.fbUrl = builder.fbUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLinkedUrl() {
        return linkedUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getFbUrl() {
        return fbUrl;
    }

    static class Builder {
        private String firstName;
        private String lastName;
        private String gender;
        private String email;
        private int age;
        private String address;
        private String phoneNumber;
        private String linkedUrl;
        private String githubUrl;
        private String fbUrl;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setLinkedUrl(String linkedUrl) {
            this.linkedUrl = linkedUrl;
            return this;
        }

        public Builder setGithubUrl(String githubUrl) {
            this.githubUrl = githubUrl;
            return this;
        }

        public Builder setFbUrl(String fbUrl) {
            this.fbUrl = fbUrl;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

