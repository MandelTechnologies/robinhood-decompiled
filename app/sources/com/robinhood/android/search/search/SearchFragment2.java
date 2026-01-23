package com.robinhood.android.search.search;

import android.view.View;
import com.robinhood.android.search.databinding.FragmentSearchBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.search.SearchFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SearchFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSearchBinding> {
    public static final SearchFragment2 INSTANCE = new SearchFragment2();

    SearchFragment2() {
        super(1, FragmentSearchBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/databinding/FragmentSearchBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSearchBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSearchBinding.bind(p0);
    }
}
