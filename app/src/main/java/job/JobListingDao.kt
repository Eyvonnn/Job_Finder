package job

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface JobListingDao {
    @Insert
    suspend fun insertJobListing(jobListing: JobListing)

    @Query("SELECT * FROM job_listings")
    suspend fun getAllJobListings(): List<JobListing>

    // Add more query methods as needed
}
