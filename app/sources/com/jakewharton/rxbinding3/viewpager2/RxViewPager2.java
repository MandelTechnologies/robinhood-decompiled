package com.jakewharton.rxbinding3.viewpager2;

import androidx.viewpager2.widget.ViewPager2;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.Metadata;

@Metadata(m3635d1 = {"com/jakewharton/rxbinding3/viewpager2/RxViewPager2__PageSelectedObservableKt"}, m3636d2 = {}, m3637k = 4, m3638mv = {1, 4, 0})
/* loaded from: classes27.dex */
public final class RxViewPager2 {
    public static final InitialValueObservable<Integer> pageSelections(ViewPager2 viewPager2) {
        return PageSelectedObservable3.pageSelections(viewPager2);
    }
}
