package com.example.bbj2012.bgspringfield;

/**
 * Created by bbj2012 on 5/3/2016.
 */
public class BGTopics {
    private String name;
    private String description;

    public static final BGTopics[] topics = {
            new BGTopics("Events", "\nInvest to Invest\nThe Invest to Invest program was created " +
                    "in order to generate a new source of funds for the youth programs of the Boys " +
                    "& Girls Clubs of Springfield, serve as a tool to teach business basics to Club " +
                    "members, and provide a friendly competitive venue for the Invest to Invest " +
                    "Group members."),
            new BGTopics("Programs","\nYouth of the Year\n" +
                    "Torch Clubs (preteen community service club)\n" +
                    "Keystone Clubs (teen community service club)\n" +
                    "Community Service projects\n" +
                    "Special events (American Heritage day, Martin Luther King celebration,etc)"),
            new BGTopics("Volunteer info","\nEach Unit has a Learning Center which is equipped with " +
                    "computers and libraries. The Learning Centers enable program staff and " +
                    "volunteers to assist members with homework, computer and keyboarding skills, " +
                    "and provide overall academic support.\n" +
                    "\n" +
                    "We also have many other areas for volunteers to help out in! Game Room, Art " +
                    "Room, Music Room, Technology Room, Teen Center, Pre-Teen Center, Dance/Fitness" +
                    " Room and our Gyms! Our Musgrave Club even has 2 gyms and an indoor heated swimming pool!\n" +
                    "\n" +
                    "We also serve a free meal each day! It is also free for volunteers and staff." +
                    " The kids LOVE to have someone to sit and eat with them and ask about" +
                    " their day!")
    };

    private BGTopics(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.name;
    }
}
