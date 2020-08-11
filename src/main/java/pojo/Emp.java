package pojo;

public class Emp {
    private String empName;
    private Integer empage;

    public Emp(String empName, Integer empage) {
        this.empName = empName;
        this.empage = empage;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpage() {
        return empage;
    }

    public void setEmpage(Integer empage) {
        this.empage = empage;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", empage=" + empage +
                '}';
    }
}
