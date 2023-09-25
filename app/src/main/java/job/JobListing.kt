package job

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "job_listings")
data class JobListing(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    val location: String
)
