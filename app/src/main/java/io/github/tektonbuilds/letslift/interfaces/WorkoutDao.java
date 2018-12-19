package io.github.tektonbuilds.letslift.interfaces;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import io.github.tektonbuilds.letslift.models.Workout;

@Dao
public interface WorkoutDao {

    @Query("SELECT * FROM workouts")
    List<Workout> getAll();

    @Query("SELECT * FROM workouts WHERE name LIKE :name LIMIT 1")
    Workout findByName(String name);

    @Insert
    void insertAll(List<Workout> workouts);

    @Update
    void update(Workout workout);

    @Delete
    void delete(Workout workout);
}
