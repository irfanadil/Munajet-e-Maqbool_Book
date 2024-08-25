package book.qabool.munajat.index

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import book.qabool.munajat.databinding.ActivityIndexBinding

class IndexActivity : AppCompatActivity()  {

    private lateinit var binding: ActivityIndexBinding

    //private val viewModel: HostViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIndexBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }



}