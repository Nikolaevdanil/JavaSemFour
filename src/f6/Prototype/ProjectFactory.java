package f6.Prototype;

public class ProjectFactory {
    Project project;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectFactory(Project project) {
        this.project = project;

    }
    Project copyProject(){
        return (Project) project.copy();
    }

}
