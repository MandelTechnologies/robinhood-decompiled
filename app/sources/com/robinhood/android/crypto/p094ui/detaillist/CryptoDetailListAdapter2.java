package com.robinhood.android.crypto.p094ui.detaillist;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.jakewharton.rxbinding3.viewpager2.RxViewPager2;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailListAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"observeCurrentPosition", "Lio/reactivex/Observable;", "", "Landroidx/viewpager2/widget/ViewPager2;", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListAdapterKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoDetailListAdapter2 {
    public static final Observable<Integer> observeCurrentPosition(final ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        Observable<Integer> observableFilter = RxViewPager2.pageSelections(viewPager2).filter(new Predicate() { // from class: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListAdapterKt.observeCurrentPosition.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                return (adapter != null ? adapter.getSize() : 0) > 0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        return observableFilter;
    }
}
