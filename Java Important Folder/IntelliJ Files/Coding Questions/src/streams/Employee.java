package src.streams;

class Employee {
    private String name;
    private String location;
    private String role;

    public Employee(String name, String location, String role) {
        this.name = name;
        this.location = location;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
