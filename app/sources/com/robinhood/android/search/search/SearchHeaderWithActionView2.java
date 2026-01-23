package com.robinhood.android.search.search;

import android.view.View;
import com.robinhood.android.search.databinding.MergeSearchHeaderWithActionViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchHeaderWithActionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.search.SearchHeaderWithActionView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SearchHeaderWithActionView2 extends FunctionReferenceImpl implements Function1<View, MergeSearchHeaderWithActionViewBinding> {
    public static final SearchHeaderWithActionView2 INSTANCE = new SearchHeaderWithActionView2();

    SearchHeaderWithActionView2() {
        super(1, MergeSearchHeaderWithActionViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/databinding/MergeSearchHeaderWithActionViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeSearchHeaderWithActionViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeSearchHeaderWithActionViewBinding.bind(p0);
    }
}
