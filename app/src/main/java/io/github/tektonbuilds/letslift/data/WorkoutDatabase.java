package io.github.tektonbuilds.letslift.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import io.github.tektonbuilds.letslift.interfaces.WorkoutDao;
import io.github.tektonbuilds.letslift.models.Workout;

/**
 * Note: RoomDatabase instance is expensive, so you have to keep it as a singleton.
 *     entities: defines the related entities of the current database. If you have more than one, you can separate by comma.
 *     version: defines the database version
 */
@Database(entities = {Workout.class}, version = 1)
public abstract class WorkoutDatabase extends RoomDatabase {
    public abstract WorkoutDao workoutDao();
}
