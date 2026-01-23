package com.robinhood.android.listsoptions.optionwatchlist;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionWatchlistHubContentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment$onViewCreated$8$3, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class OptionWatchlistHubContentFragment8 extends FunctionReferenceImpl implements Function1<LinearLayoutManager, Integer> {
    OptionWatchlistHubContentFragment8(Object obj) {
        super(1, obj, OptionWatchlistHubContentFragment.class, "getSelectedItemIndex", "getSelectedItemIndex(Landroidx/recyclerview/widget/LinearLayoutManager;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(LinearLayoutManager p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Integer.valueOf(((OptionWatchlistHubContentFragment) this.receiver).getSelectedItemIndex(p0));
    }
}
