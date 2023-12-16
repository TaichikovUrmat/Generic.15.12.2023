public class User  {

        private String username;
        private String email;
        private String firstName;
        private String lastName;
        private int age;




        // Конструктор класса
        public User(String username, String email, String firstName, String lastName, int age) {
            this.username = username;
            this.email = email;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        // Геттертердер жана toString методу
        // Геттертердерди камтыктаган болгону жана база катарына чыгарып берилген болгону сызып берилип турган.
        // Мысалы, базада окууу ушул курстун аты менен колдонсо билетти окууу жана жана базада туруктуу чектердин аныктымасы менен чыгарып берилип турган болгону.

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", email='" + email + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

