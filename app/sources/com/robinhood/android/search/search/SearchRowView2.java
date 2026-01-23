package com.robinhood.android.search.search;

import android.view.View;
import com.robinhood.android.search.databinding.MergeRowSearchViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.search.SearchRowView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SearchRowView2 extends FunctionReferenceImpl implements Function1<View, MergeRowSearchViewBinding> {
    public static final SearchRowView2 INSTANCE = new SearchRowView2();

    SearchRowView2() {
        super(1, MergeRowSearchViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/databinding/MergeRowSearchViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRowSearchViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRowSearchViewBinding.bind(p0);
    }
}
