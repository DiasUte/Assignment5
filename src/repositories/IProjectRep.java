package repositories;

import entities.Project;
import java.util.List;

public interface IProjectRep {
    boolean addProject(Project pro);
    List<Project> showAllProjects();
    Project showOneProject(int id);

}
