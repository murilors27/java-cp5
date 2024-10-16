package model;

import java.util.Date;

public class Claim {
    private String description;
    private Date occurrenceDate;

    public Claim(String description, Date occurrenceDate) {
        this.description = description;
        this.occurrenceDate = occurrenceDate;
    }

    public String getDescription() {
        return description;
    }

    public Date getOccurrenceDate() {
        return occurrenceDate;
    }
}
