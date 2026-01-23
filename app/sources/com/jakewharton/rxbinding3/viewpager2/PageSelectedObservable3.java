package com.jakewharton.rxbinding3.viewpager2;

import androidx.viewpager2.widget.ViewPager2;
import com.jakewharton.rxbinding3.InitialValueObservable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PageSelectedObservable.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, m3636d2 = {"pageSelections", "Lcom/jakewharton/rxbinding3/InitialValueObservable;", "", "Landroidx/viewpager2/widget/ViewPager2;", "rxbinding-viewpager2_release"}, m3637k = 5, m3638mv = {1, 1, 15}, m3641xs = "com/jakewharton/rxbinding3/viewpager2/RxViewPager2")
/* renamed from: com.jakewharton.rxbinding3.viewpager2.RxViewPager2__PageSelectedObservableKt, reason: use source file name */
/* loaded from: classes27.dex */
final /* synthetic */ class PageSelectedObservable3 {
    public static final InitialValueObservable<Integer> pageSelections(ViewPager2 pageSelections) {
        Intrinsics.checkParameterIsNotNull(pageSelections, "$this$pageSelections");
        return new PageSelectedObservable(pageSelections);
    }
}
