package com.github.purofle.nmsl.ui.feature.download

import com.github.purofle.nmsl.game.download.Version
import com.github.purofle.nmsl.utils.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject


class DownloadViewModel @Inject constructor(
    // 现在应该用不着
): ViewModel() {
//    ArrayList<Version>
    private val _versions = MutableStateFlow(arrayListOf<Version>())
    val versions: StateFlow<ArrayList<Version>> = _versions
}