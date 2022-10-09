package com.example.nest.screensQuiz.guesswho

import androidx.fragment.app.Fragment

class GuessWhoFragment : Fragment() {
// TODO: check out later
//    companion object {
//        fun newInstance() = GuessWhoFragment()
//    }

//    private var _binding: FragmentGuesswhoBinding? = null
//
//    private val binding get() = _binding!!
//
//    private val viewModel: GuessWhoViewModel by viewModels()
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//
//        _binding = FragmentGuesswhoBinding.inflate(inflater, container, false)
////        binding.guessWho = viewModel
////        binding.lifecycleOwner = this
//
//
//
//        return binding.root
//
//    }

    override fun onDestroyView() {
        super.onDestroyView()
//        _binding = null
    }
}