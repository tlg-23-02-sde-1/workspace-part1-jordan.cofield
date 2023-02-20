package edu.snooze;

/*
 * System or "business class" to model the workings of an alarm clock.
 * This class definition has no main() method - most classes don't.
 */
class AlarmClock {
    // Class-level ("static") fields
    // There is only one copy of these, and they live up in that class-wide common area
    // NOT in each instance (AlarmClock object)
    // Static means "shared"
    // Final means "fixed" (constant)
    public static final int MIN_INTERVAL = 1; // "class constants"
    public static final int MAX_INTERVAL = 20; //

    // attributes or properties, in Java these are called "fields" or "instance variables"
    private int snoozeInterval = 5; // default value when client doesn't specify one
    private int repeat = 10;        // number of times it goes off (before giving up on you)

    // constructors
    public AlarmClock() {
        // no-op or perhaps we sync the time in here
    }

    public AlarmClock(int SnoozeInterval) {
        this(); // delegate to no-arg ctor above (e.g., for time sync)
        setSnoozeInterval(snoozeInterval);
    }

    public AlarmClock (int snoozeInterval, int repeat) {
        this(snoozeInterval); // delegate to ctor above for snoozeInterval
        setRepeat(repeat);    // handle repeat myself, by delegating to its setter
    }

    // functions ("methods" in Java) what can AlarmClock objects DO?
    public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    // "accessor" methods - provide "controlled access" to the object's internal (private) data
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // data constraint: must be [1-20'] (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        } else {
            System.out.println("Invalid snooze interval: " + snoozeInterval +
                    ", must be in range " + MIN_INTERVAL + "-" + MAX_INTERVAL);
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public int getMinInterval() {
        return MIN_INTERVAL;
    }

    public int getMaxInterval() {
        return MAX_INTERVAL;
    }

    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }
}
