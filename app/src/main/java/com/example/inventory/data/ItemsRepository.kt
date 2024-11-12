import com.example.inventory.data.Item
import kotlinx.coroutines.flow.Flow

/**
 * Name: Made Narayan Dananjaya
 * Nim: 225150207111034
 *
 * Comment:
 * 1. Mendefinisikan fungsi `getAllItemsStream` yang mengembalikan `Flow` berisi
 *    daftar `Item` untuk membaca semua item dari sumber data.
 * 2. Mendefinisikan fungsi `getItemStream` yang mengembalikan `Flow` berisi
 *    objek `Item` atau `null`, sesuai dengan `id` yang diberikan.
 * 3. Mendefinisikan fungsi `insertItem` sebagai fungsi suspensi untuk menambah
 *    `Item` baru ke dalam sumber data.
 * 4. Mendefinisikan fungsi `deleteItem` sebagai fungsi suspensi untuk menghapus
 *    `Item` dari sumber data.
 * 5. Mendefinisikan fungsi `updateItem` sebagai fungsi suspensi untuk
 *    memperbarui data `Item` di sumber data.
 */

interface ItemsRepository {
    /**
     * Retrieve all the items from the the given data source.
     */
    fun getAllItemsStream(): Flow<List<Item>>

    /**
     * Retrieve an item from the given data source that matches with the [id].
     */
    fun getItemStream(id: Int): Flow<Item?>

    /**
     * Insert item in the data source
     */
    suspend fun insertItem(item: Item)

    /**
     * Delete item from the data source
     */
    suspend fun deleteItem(item: Item)

    /**
     * Update item in the data source
     */
    suspend fun updateItem(item: Item)
}