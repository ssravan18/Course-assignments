package javaCoding;

import java.util.EnumMap;
import java.util.EnumSet;

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

enum Activity{
	HIKING, SWIMMING, SKIING, PUMPKIN_CRAVING
}

public class SeasonalActivityOrganizer {

    private EnumMap<Season, EnumSet<Activity>> seasonActivities;

    public SeasonalActivityOrganizer() {
        seasonActivities = new EnumMap<>(Season.class);
        
//        seasonActivities.put(Season.SPRING, EnumSet.of(Activity.HIKING));
//        seasonActivities.put(Season.SUMMER, EnumSet.of(Activity.HIKING, Activity.SWIMMING));
//        seasonActivities.put(Season.AUTUMN, EnumSet.of(Activity.HIKING, Activity.PUMPKIN_CRAVING));
//        seasonActivities.put(Season.WINTER, EnumSet.of(Activity.SKIING));
    }

    public EnumSet<Activity> getActivitiesForSeason(Season season) {
        EnumSet<Activity> activities = seasonActivities.get(season);
        if (activities == null) {
            throw new IllegalArgumentException("Unknown season: " + season);
        }
        return activities;
    }
    
    public EnumSet<Activity> addActivityForSeason(Activity activity, Season season) {
        EnumSet<Activity> activities = seasonActivities.get(season);
        if (activities == null) {
            activities = EnumSet.noneOf(Activity.class);
            seasonActivities.put(season, activities);
        }
        activities.add(activity);
        return activities;
    }
    
    public EnumSet<Activity> removeActivityFromAllSeasons(Activity activity) {
        for (Season season : seasonActivities.keySet()) {
            seasonActivities.get(season).remove(activity);
        }
        EnumSet<Activity> allActivities = EnumSet.noneOf(Activity.class);
        for (EnumSet<Activity> activities : seasonActivities.values()) {
            allActivities.addAll(activities);
        }
        return allActivities;
    }
    
    public EnumSet<Activity> getAllActivities() {
        EnumSet<Activity> allActivities = EnumSet.noneOf(Activity.class);
        for (EnumSet<Activity> activities : seasonActivities.values()) {
            allActivities.addAll(activities);
        }
        return allActivities;
    }

    public static void main(String[] args) {
        SeasonalActivityOrganizer organizer = new SeasonalActivityOrganizer();

        try {
        	organizer.addActivityForSeason(Activity.HIKING, Season.SPRING);
        	organizer.addActivityForSeason(Activity.SWIMMING, Season.SUMMER);
        	organizer.addActivityForSeason(Activity.SKIING, Season.WINTER);
        	
        	System.out.println(organizer.getAllActivities());
        	
        	System.out.println(organizer.getActivitiesForSeason(Season.SPRING));
        	System.out.println(organizer.getActivitiesForSeason(Season.SUMMER));
        	System.out.println(organizer.getActivitiesForSeason(Season.WINTER));
        	
        	organizer.removeActivityFromAllSeasons(Activity.HIKING);
        	
        	System.out.println(organizer.getActivitiesForSeason(Season.SPRING));
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}