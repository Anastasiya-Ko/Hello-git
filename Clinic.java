package com.lawaWeb;

import java.util.*;

public class Clinic {


    static class Patient {

        long snils;
        String name;
        String address;

        public Patient(long snils, String name, String address) {
            this.snils = snils;
            this.name = name;
            this.address = address;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Patient.class.getSimpleName() + "[", "]")
                    .add("snils=" + snils)
                    .add("name='" + name + "'")
                    .add("address='" + address + "'")
                    .toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Patient patient = (Patient) o;
            return snils == patient.snils;
        }

        @Override
        public int hashCode() {
            return Objects.hash(snils);
        }
    }

    public static void main(String[] args) {
        ArrayList<Patient> array = new ArrayList<>();
        HashSet<Patient> hash = new HashSet<>();
        Patient patient1 = new Patient(123169356, "Bob", "Russia");
        Patient patient2 = new Patient(153691267, "Tod", "China");
        Patient patient3 = new Patient(123169356, "Rob", "USA");

        array.add(patient1);
        array.add(patient2);
        array.add(patient3);

        hash.add(patient1);
        hash.add(patient2);
        hash.add(patient3);

        System.out.println(array);
        System.out.println(hash);
    }
}
