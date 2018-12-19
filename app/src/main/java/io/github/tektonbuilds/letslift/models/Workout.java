package io.github.tektonbuilds.letslift.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "workouts")
public class Workout {
    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "date")
    private String date;

    @ColumnInfo(name = "min_reps")
    private int minReps;

    @ColumnInfo(name = "max_reps")
    private int maxReps;

    @ColumnInfo(name = "weight") // lb
    private int weight;

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMinReps() {
        return minReps;
    }

    public void setMinReps(int minReps) {
        this.minReps = minReps;
    }

    public int getMaxReps() {
        return maxReps;
    }

    public void setMaxReps(int maxReps) {
        this.maxReps = maxReps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
