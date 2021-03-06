package employee;

import notification.NotificationDTO;

public class Technican extends  Employee {

    public Technican(int id, String fullName, String externalId, EmployeeType employeeType) {
        super(id, fullName, externalId, employeeType);
    }

    @Override
    public void update(NotificationDTO notificationDTO) {
        notification.add(notificationDTO);
    }
}
