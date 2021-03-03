package repositories;

import entities.Project;
import java.util.List;

public interface IProjectRep {
    // Add project to DBMS
    boolean addProject(Project pro);

    // SHow all projects from DBMS
    List<Project> showAllProjects();

    // Show one project by id from DBMS
    Project showOneProject(int id);

}
