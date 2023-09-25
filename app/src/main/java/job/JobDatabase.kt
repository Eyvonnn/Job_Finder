package job

// AppDatabase.kt
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [JobListing::class], version = 1)
abstract class JobDatabase : RoomDatabase() {
    abstract fun JobListingDao(): JobListingDao
}
