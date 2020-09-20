import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Candidate {
    String id;
    String name;
    String age;
    String address;
    String interestedCategory;
    String mobileNumber;
    Date date = new Date();

    public List<List<String>> listCandidates = new ArrayList<>();


    public Candidate() {
        // Constructor
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.interestedCategory = interestedCategory;
        this.mobileNumber = mobileNumber;
    }

    public void newCandidate() {
        // Add a new candidate
        System.out.println(new Timestamp(date.getTime()) + " ----------------------------------------------------------------------------------------------");
        // Scan data
        Scanner sc = new Scanner(System.in);
        // Create an array for new candidate
        List<String> candidate = new ArrayList<>();
        String inputId = "";
        do {
            System.out.println("Please enter the id:");
            inputId = sc.nextLine();
        } while (isSetCandidate(inputId));

        this.id = inputId;
        candidate.add(inputId);

        System.out.println("Please enter the name:");
        this.name = sc.nextLine();
        candidate.add(this.name);

        System.out.println("Please enter the age:");
        this.age = sc.nextLine();
        candidate.add(age);

        System.out.println("Please enter the address:");
        this.address = sc.nextLine();
        candidate.add(this.address);

        String option = "";
        List<String> options = new ArrayList<>();
        options.add("1");
        options.add("2");
        options.add("3");
        do {
            // Uncomment to debug validation
            //System.out.println("contains: "+ options.contains(option));
            System.out.println("Please enter the the corresponding number for the interested category showed in the below format:");
            System.out.println("1-For Football, 2-for Boxing, 3-for Dance");
            option = sc.nextLine();
            switch (option) {
                case "1": {
                    // Football
                    System.out.println("Football was selected successfully");
                    this.interestedCategory = option;
                    candidate.add(this.interestedCategory);
                    football(candidate);
                    break;
                }
                case "2": {
                    // Boxing
                    System.out.println("Boxing was selected successfully");
                    this.interestedCategory = option;
                    candidate.add(this.interestedCategory);
                    boxing(candidate);
                    break;
                }
                case "3": {
                    // Dance
                    System.out.println("Dance was selected successfully");
                    this.interestedCategory = option;
                    candidate.add(this.interestedCategory);
                    dance(candidate);
                    break;
                }
                default:
                    System.out.println(option + " is not a valid category");
                    System.out.println("Please try again adding 1,2 or 3");
                    break;
            }

        } while (!options.contains(option));

        System.out.println("Please enter the Mobile Number");
        this.mobileNumber = sc.nextLine();
        candidate.add(mobileNumber);

        // Add thea array to bi-dimensional list
        listCandidates.add(candidate);

        // Display candidate added
        displayCandidate(candidate);
    }


    public void displayCandidate(List<String> arrayCandidate) {
        // Print array
        System.out.println(new Timestamp(date.getTime()) + " ----------------------------------------------------------------------------------------------");
        System.out.println("Candidate:");
        // Uncomment to debug category
        // System.out.println(arrayCandidate.get(4));
        // Football
        if (arrayCandidate.get(4).equals("1")) {
            System.out.println("Id is : " + arrayCandidate.get(0));
            System.out.println("Name is : " + arrayCandidate.get(1));
            System.out.println("Age is : " + arrayCandidate.get(2));
            System.out.println("Address is : " + arrayCandidate.get(3));
            System.out.println("Interested Category is : " + getInterestedCategory(arrayCandidate.get(4)));
            System.out.println("Position: " + arrayCandidate.get(5));
            System.out.println("Mobile Number is : " + arrayCandidate.get(6));
            // Boxing
        } else if (arrayCandidate.get(4).equals("2")) {
            System.out.println("Id is : " + arrayCandidate.get(0));
            System.out.println("Name is : " + arrayCandidate.get(1));
            System.out.println("Age is : " + arrayCandidate.get(2));
            System.out.println("Address is : " + arrayCandidate.get(3));
            System.out.println("Interested Category is : " + getInterestedCategory(arrayCandidate.get(4)));
            System.out.println("Weight: " + arrayCandidate.get(5));
            System.out.println("height: " + arrayCandidate.get(6));
            System.out.println("Mobile number is : " + arrayCandidate.get(7));
            // Dance
        } else if (arrayCandidate.get(4).equals("3")) {
            System.out.println("Id is : " + arrayCandidate.get(0));
            System.out.println("Name is : " + arrayCandidate.get(1));
            System.out.println("Age is : " + arrayCandidate.get(2));
            System.out.println("Address is : " + arrayCandidate.get(3));
            System.out.println("Interested Category is : " + getInterestedCategory(arrayCandidate.get(4)));
            System.out.println("Position: " + arrayCandidate.get(5));
            System.out.println("Mobile Number is : " + arrayCandidate.get(6));
        }
    }

    public String getInterestedCategory(String category) {
        switch (category) {
            case "1": {
                // Football
                category = "Football";
                break;
            }
            case "2": {
                // Boxing
                category = "Boxing";
                break;
            }
            case "3": {
                // Dance
                category = "Dance";
                break;
            }
        }

        return category;
    }

    public void football(List<String> candidate_list) {
        String position;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the position");
        position = sc.nextLine();
        candidate_list.add(position);

    }

    public void boxing(List<String> candidate_list) {
        String weight;
        String height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the weight");
        weight = sc.nextLine();
        candidate_list.add(weight);

        System.out.println("Please enter the height");
        height = sc.nextLine();
        candidate_list.add(height);
    }

    public void dance(List<String> candidate_list) {
        String genre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the genre");
        genre = sc.nextLine();
        candidate_list.add(genre);
    }

    public void displayAllCandidates() {
        // Print all Candidates
        System.out.println(new Timestamp(date.getTime()) + " ----------------------------------------------------------------------------------------------");
        System.out.println("All Candidates");
        // Enhanced mode
        // for (List<String> listCandidate : listCandidates) {
        for (int i = 0; i < listCandidates.size(); i++) {
            displayCandidate(listCandidates.get(i));
            System.out.println();
        }
    }

    public void getCandidate(String id) {
        boolean isSet = false;
        if (listCandidates.size() <= 0) {
            System.out.println("There are not candidates registered, please add one");
        }else{
            for (int i = 0; i < listCandidates.size(); i++) {
                    if (listCandidates.get(i).get(0).equals(id)) {
                        // Uncomment to debug
                        //System.out.println(listCandidates.get(i));
                        displayCandidate(listCandidates.get(i));
                        isSet = true;
                    }
            }
        }
        if (!isSet){
            System.out.println("id: "+id + " was not found, try using a different one");
        }
    }

    public boolean isSetCandidate(String id) {
        boolean isSet = false;
        for (int i = 0; i < listCandidates.size(); i++) {
            if (listCandidates.get(i).get(0).equals(id)) {
                // Uncomment to debug
                //System.out.println(listCandidates.get(i));
                isSet = true;
            }
        }

        if (isSet) {
            System.out.println("id: "+id + " already exists");
            System.out.println("Please try using a different one");
        }
        return isSet;
    }


}