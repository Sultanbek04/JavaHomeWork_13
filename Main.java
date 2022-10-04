package com.google.lesson_07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Konstantinopol 2356", "London", 00000);
        ArrayList<User> users = new ArrayList<User>();

        User user1 = new User("Arman", "Absadyk", address1, new String[]{"1111-111", "2222-222"});


        users.add(user1);

        String projectName = "footBook";
        Project project = new Project(projectName, users);
//        Project project2 = new Project(project);
//        project.getDevelopers().get(0).getPhoneNumbers()[0] = "3";

        Project copy = project.clone();
        System.out.println(copy);
        copy.getDevelopers().get(0).getPhoneNumbers()[0] = "100";
        System.out.println(project.getDevelopers().get(0).getPhoneNumbers()[0]);
        System.out.println(project.getDevelopers().get(0).getPhoneNumbers()[0]);
//        System.out.println(project.getDevelopers().get(0).getPhoneNumbers()[0]);
//        System.out.println(project2.getDevelopers().get(0).getPhoneNumbers()[0]);
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        try {
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//            objectOutputStream.writeObject(project);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        try {
//            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
//            Project copy = (Project) objectInputStream.readObject();
//            copy.getDevelopers().get(0).getPhoneNumbers()[0]="7777";
//            System.out.println(project.getDevelopers().get(0).getPhoneNumbers()[0]);
//            System.out.println(copy.getDevelopers().get(0).getPhoneNumbers()[0]);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


//        Collections.sort(users, Comparator.comparing(User::getFirstName).thenComparing(User::getLastName));
//        // Collections.sort(users, (o1, o2) -> o1.getAddress().getCity().compareTo(o2.getAddress().getCity()));
//        for (User user :
//                users) {
//            System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getAddress().getCity());
//        }
//
//        Calculator calculator = (x, y) -> {
//            return Math.pow(x, y);
//        };
//        System.out.println(calculator.execute(2, 8));
    }
}
