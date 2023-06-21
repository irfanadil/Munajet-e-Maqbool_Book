package dua.munajat.maqbool.screens.scrolltype

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dua.munajat.maqbool.R
import com.dua.munajat.maqbool.databinding.FragmentScrollDirectionBinding


class SelectPageScrollDirectionFragment : Fragment() {

    private var _binding: FragmentScrollDirectionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       // val notificationsViewModel = ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentScrollDirectionBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.horizontalBtn.setOnClickListener{
           findNavController().navigate(R.id.action_page_scroll_direction_to_navigation_dua_list , bundleOf( "scrollType" to 0))
        }

        binding.verticalBtn.setOnClickListener{
            findNavController().navigate(R.id.action_page_scroll_direction_to_navigation_dua_list , bundleOf("scrollType" to 1))
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}