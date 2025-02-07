package list;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    protected Map<String, Medication> medicationMap;

    public Pharmacy() {
        medicationMap = new HashMap<String, Medication>();
    }

    int getCount() {
        return medicationMap.size();
    }

    public void save(Medication medication) {
        medicationMap.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        return medicationMap.getOrDefault(medicationName, null);
    }

    public void  delete(String medicationName) {
        medicationMap.remove(medicationName);
    }

    public void printAllMedications() {
        for (Medication medication : medicationMap.values())
            System.out.println(medication);
    }
}
