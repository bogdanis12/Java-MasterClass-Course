public class Person {
//    private String firstName;
//    private String lastName;
//    private int age;
//    public String getFirstName(){
//        return firstName;
//    }
//    public String getLastName(){
//        return lastName;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setFirstName(String firstName){
//        this.firstName = firstName;
//    }
//    public void setLastName(String lastName){
//        this.lastName = lastName;
//    }
//    public void setAge(int age){
//        this.age = age;
//        if(age < 0 || age > 100){
//            this.age = 0;
//        }
//        else{
//            this.age = age;
//        }
//    }
//    public boolean isTeen(){
//        if(this.age > 12 || this.age <20){
//            return true;
//        }
//        return false;
//    }
//    public String getFullName(){
//        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
//            return "";
//        }
//        else if(this.firstName.isEmpty()){
//            return lastName;
//        }
//        else{
//            return firstName;
//        }
//        return this.firstName + " " + this.lastName;
//    }
    private String firstName;
    private String lastName;
    private int age;

    //instance methods

    //set method
    public void setFirstName(String firstName) { //METHOD-1
        this.firstName = firstName;
    }
    public void setLastName(String lastName) { //METHOD-2
        this.lastName = lastName;
    }
    public void setAge(int age) { //METHOD-3
        this.age = age;
        if(age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    //get method
    public String getFirstName() { //METHOD-1 : getMethod
        return this.firstName;
    }
    public String getLastName() { //METHOD-2 : getMethod
        return this.lastName;
    }
    public int getAge() { //METHOD-3 : getMethod
        return this.age;
    }

    //METHOD-4
    public boolean isTeen() {
        return (this.age > 12 && this.age < 20) ; //returns true
    }

    //METHOD-5
    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else if (this.firstName.isEmpty()) {
            return lastName;
        } else if (this.lastName.isEmpty()) {
            return firstName;
        }
        return firstName + " " + lastName;
    }
}


