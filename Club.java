class Club {
    static String clubName = "Tech Innovators";
    String memberName;

    public Club(String memberName) {
        this.memberName = memberName;
    }

    static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }

    void displayMemberDetails() {
        System.out.println("Member Name: " + memberName + " | Club: " + clubName);
    }

    public static void main(String[] args) {
        Club.displayClubName(); 

        Club member1 = new Club("Alice");
        Club member2 = new Club("Bob");
        Club member3 = new Club("Charlie");

        member1.displayMemberDetails();
        member2.displayMemberDetails();
        member3.displayMemberDetails();

        Club.clubName = "AI Enthusiasts"; 

        System.out.println("\nAfter Changing Club Name:\n");
        Club.displayClubName();
        member1.displayMemberDetails();
        member2.displayMemberDetails();
        member3.displayMemberDetails();
    }
}
