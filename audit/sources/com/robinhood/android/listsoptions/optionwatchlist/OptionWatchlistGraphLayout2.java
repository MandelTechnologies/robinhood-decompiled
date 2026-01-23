package com.robinhood.android.listsoptions.optionwatchlist;

import android.view.View;
import com.robinhood.android.listsoptions.databinding.MergeOptionWatchlistGraphLayoutBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionWatchlistGraphLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistGraphLayout$bindings$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class OptionWatchlistGraphLayout2 extends FunctionReferenceImpl implements Function1<View, MergeOptionWatchlistGraphLayoutBinding> {
    public static final OptionWatchlistGraphLayout2 INSTANCE = new OptionWatchlistGraphLayout2();

    OptionWatchlistGraphLayout2() {
        super(1, MergeOptionWatchlistGraphLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/listsoptions/databinding/MergeOptionWatchlistGraphLayoutBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionWatchlistGraphLayoutBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionWatchlistGraphLayoutBinding.bind(p0);
    }
}
