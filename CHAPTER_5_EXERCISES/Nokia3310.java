package chapterFive;

import java.util.Scanner;

public class Nokia3310 {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    }


    private static void displayMenu() {
        String mainMenu = """
              1 --> Phone book
              2 --> Messages
              3 --> Chat
              4 --> Call register
              5 --> Tones
              6 --> Settings
              7 --> Call divert
              8 --> Games
              9 --> Calculator
              10 --> Reminders
              11 -->Clock
              12 -->Profiles
              13 -->SIM Services
              """;
        System.out.println(mainMenu);
        int menu = input.nextInt();
        switch (menu){
            case 1:
                displayPhoneBook();
                break;
            case 2:
                displayMessages();

                break;
            case 3:
                System.out.println("Chat");
                break;

            case 4:
                displayCallRegister();
                 break;

            case 5:
                displayTones();

                break;

            case 6:
                displaySettings();

                break;

            case 7:
                System.out.println("Call divert");
                break;

            case 8:
                System.out.println("Games");
                break;

            case 9:
                System.out.println("Calculator");
                break;

            case 10:
                System.out.println("Reminders");
                break;

            case 11:
                displayClock();

                break;

            case 12:
                System.out.println("Profile");
                break;
            case 13:
                System.out.println("SIM Services");
                break;
        }


    }

    private static void displayClock() {
        System.out.println("Clock");
        String clock = """
                        
                        1 -> Alarm clock
                        2 -> Clock setting
                        3 -> Date setting
                        4 -> Stopwatch
                        5 -> Countdown timer
                        6 -> Auto-update of date and time
                        
                        """;

        System.out.println(clock);
        int clockMenu = input.nextInt();
        switch (clockMenu){

            case 1:
                System.out.println("Alarm clock");
                break;
            case 2:
                System.out.println("Clock setting");
                break;
            case 3:
                System.out.println("Date setting");
                break;
            case 4:
                System.out.println("Stopwatch");
                break;
            case 5:
                System.out.println("Countdown timer");
                break;
            case 6:
                System.out.println("Auto-update of date and time");
                break;
        }
    }

    private static void displaySettings() {
        System.out.println("Settings");
        String settings = """
                        1 -> Call settings
                        2 -> Phone settings
                        3 -> Security settings
                        4 -> Restore factory settings
                        """;
        System.out.println(settings);
        int settingsMenu = input.nextInt();
        switch (settingsMenu) {

            case 1:
                System.out.println("Call settings");
                String callSettings = """
                                1 -> Automatic redial
                                2 -> Speed dialling
                                3 -> Call waiting options
                                4 -> Own number sending
                                5 -> Phone line in use
                                6 -> Automatic answer
                                """;
                System.out.println(callSettings);
                int callSettingsMenu = input.nextInt();
                switch(callSettingsMenu){

                    case 1:
                        System.out.println("Automatic redial");
                        break;
                    case 2:
                        System.out.println("Speed dialling");
                        break;
                    case 3:
                        System.out.println("Call waiting options");
                        break;
                    case 4:
                        System.out.println("Own number sending");
                        break;
                    case 5:
                        System.out.println("Phone line in use");
                        break;
                    case 6:
                        System.out.println("Automatic answer");
                        break;

                }

                break;
            case 2:
                System.out.println("Phone settings");
                String phoneSettings = """
                                1 -> Language
                                2 -> Cell info display
                                3 -> Welcome note
                                4 -> Network selection
                                5 -> Lights
                                6 -> Confirm SIM service options
                                
                                """;
                System.out.println(phoneSettings);
                int phoneSettingsMenu = input.nextInt();
                switch(phoneSettingsMenu){

                    case 1:
                        System.out.println("Language");
                        break;
                    case 2:
                        System.out.println("Cell info display");
                        break;
                    case 3:
                        System.out.println("Welcome note");
                        break;
                    case 4:
                        System.out.println("Network selection");
                        break;
                    case 5:
                        System.out.println("Lights");
                        break;
                    case 6:
                        System.out.println("Confirm SIM service options");

                }
                break;

            case 3:
                System.out.println("Security settings");
                String securitySettings = """
                                
                                1 -> PIN code request
                                2 -> Call barring service
                                3 -> Fixed dialling
                                4 -> Closed user group
                                5 -> Phone security
                                6 -> Change access codes
                                
                                """;
                System.out.println(securitySettings);
                int securitySettingsMenu = input.nextInt();
                switch(securitySettingsMenu){

                    case 1:
                        System.out.println("PIN code request");
                        break;
                    case 2:
                        System.out.println("Call barring service");
                        break;
                    case 3:
                        System.out.println("Fixed dialling");
                        break;
                    case 4:
                        System.out.println(" Closed user group");
                        break;
                    case 5:
                        System.out.println("Phone security");
                        break;
                    case 6:
                        System.out.println("Change access codes");
                        break;

                }
                break;

            case 4:
                System.out.println("Restore factory settings");
                break;

        }
    }

    private static void displayTones() {
        System.out.println("Tones");
        String tones = """
                        1 -> Ringing tone
                        2 -> Ringing volume
                        3 -> Incoming call alert
                        4 -> Composer
                        5 -> Message alert tone
                        6 -> Keypad tones
                        7 -> Warning and Game tone
                        8 -> Vibrating alert
                        9 -> Screen saver
                             	
                        """;
        System.out.println(tones);
        int tonesMenu = input.nextInt();
        switch (tonesMenu){

            case 1:
                System.out.println("Ringing tone");
                break;
            case 2:
                System.out.println("Ringing volume");
                break;
            case 3:
                System.out.println("Incoming call alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert tone");
                break;
            case 6:
                System.out.println("Keypad tones");
                break;
            case 7:
                System.out.println("Warning and Game tone");
                break;
            case 8:
                System.out.println("Vibrating alert");
                break;
            case 9:
                System.out.println("Screen saver");

        }
    }

    private static void displayCallRegister() {
        System.out.println("Call register");
        String callRegisterMenu = """
                        
                        1 -> Missed calls
                        2 -> Received calls
                        3 -> Dialled numbers
                        4 -> Erase recent call lists
                        5 -> Show call duration
                        6 -> Show call costs
                        7 -> Call cost settings
                        8 -> Prepaid credit
                        
                        """;

        System.out.println(callRegisterMenu);
        int callRegister = input.nextInt();
        switch (callRegister){
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
            case 5:
                System.out.println("Show call duration");
                String showCallDuration = """
                                1 -> Last call duration
                                2 -> All calls' duration
                                3 -> Received calls' duration
                                4 -> Dialled calls' duration
                                5 -> Clear timers
                                
                                """;
                System.out.println(showCallDuration);
                int showCallDurationMenu = input.nextInt();
                switch (showCallDurationMenu){

                    case 1:
                        System.out.println("Last call duration");
                        break;
                    case 2:
                        System.out.println("All calls' duration");
                        break;
                    case 3:
                        System.out.println("Received calls' duration");
                        break;
                    case 4:
                        System.out.println("Dialled calls' duration");
                        break;
                    case 5:
                        System.out.println("Clear timers");
                }

                break;
            case 6:
                System.out.println("Show call costs");
                String showCallCosts = """
                                1 -> Last call cost
                                2 -> All calls' cost
                                3 -> Clear counters
                                """;
                System.out.println(showCallCosts);
                int showCallCostsMenu = input.nextInt();
                switch(showCallCostsMenu){
                    case 1:
                        System.out.println("Last call cost");
                        break;
                    case 2:
                        System.out.println("All calls' cost");
                        break;
                    case 3:
                        System.out.println("Clear counters");
                }

                break;
            case 7:
                System.out.println("Call cost settings");
                String callCostSettings = """
                                1 -> Call cost limit
                                2 -> Show costs in
                                
                                """;
                System.out.println(callCostSettings);
                int callCostSettingsMenu = input.nextInt();
                switch (callCostSettingsMenu){

                    case 1:
                        System.out.println("Call cost limit");
                        break;
                    case 2:
                        System.out.println("Show costs in");
                }

                break;
            case 8:
                System.out.println("Prepaid credit");

        }
    }

    private static void displayMessages() {
        System.out.println("Messages");
        String messageMenu = """
                     1 -> Write messages
                     2 -> Inbox
                     3 -> Outbox
                     4 -> Picture messages
                     5 -> Templates
                     6 -> Smileys
                     7 -> Message Settings
                     8 -> Info service
                     9 -> Voice mailbox number
                     10-> Service command editor
                     """;

        System.out.println(messageMenu);
        int message = input.nextInt();

        switch(message){
            case 1:
                System.out.println("Write messages");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture messages");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smileys");
                break;
            case 7:
                System.out.println("Message Settings");
                String messageSettings = """
                                1 -> Set
                                2 -> Common
                                """;

                System.out.println(messageSettings);
                int messageSettingsOption = input.nextInt();

                switch(messageSettingsOption) {
                    case 1:
                        System.out.println("Set");
                        String set = """
                                        1 -> Message Centre number
                                        2 -> Message sent as
                                        3 -> Message validity
                                        """;
                        System.out.println(set);
                        int setOptions = input.nextInt();
                        switch (setOptions) {
                            case 1:
                                System.out.println("Message Centre number");
                                break;
                            case 2:
                                System.out.println("Message sent as");
                                break;
                            case 3:
                                System.out.println("Message validity");

                        }
                        break;
                    case 2:
                        System.out.println("Common");
                        String common = """
                                        1 -> Delivery reports
                                        2 -> Reply via same centre
                                        3 -> Character support
                                        """;
                        System.out.println(common);
                        int commonOptions = input.nextInt();
                        switch (commonOptions) {
                            case 1:
                                System.out.println("Delivery reports");
                                break;
                            case 2:
                                System.out.println("Reply via same centre");
                                break;
                            case 3:
                                System.out.println("Character support");
                        }

                        break;
                }
            case 8:
                System.out.println("Info service");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service command editor");
        }
    }

    private static void displayPhoneBook() {
        System.out.println("Phone book");
        String phoneBookMenu = """
                        1 -> Search
                        2 -> Service Nos
                        3 -> Add Name
                        4 -> Erase
                        5 -> Edit
                        6 -> Assign tone
                        7 -> Send b'card
                        8 -> Options
                        9 -> Speed Dials
                        10 -> Voice Tags
                        """;
        System.out.println(phoneBookMenu);
        int phoneBook = input.nextInt();
        switch (phoneBook){
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos");
                break;
            case 3:
                System.out.println("Add Name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign tone");
                break;
            case 7:
                System.out.println("Send b'card");
                break;
            case 8:
                System.out.println("Options");
                String options = """
                            1 -> Type of View
                            2 -> Memory status
                            """;
                System.out.println(options);
                int phoneOptions = input.nextInt();
                switch (phoneOptions){
                    case 1:
                        System.out.println("Type of view");
                        break;
                    case 2:
                        System.out.println("Memory status");
                }
                break;
            case 9:
                System.out.println("Speed Dials");
                break;
            case 10:
                System.out.println("Voice Tags");
        }
    }
}
