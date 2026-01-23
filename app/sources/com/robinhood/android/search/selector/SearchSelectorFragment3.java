package com.robinhood.android.search.selector;

import android.view.View;
import com.robinhood.android.search.selector.databinding.FragmentSearchSelectorBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchSelectorFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.selector.SearchSelectorFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SearchSelectorFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentSearchSelectorBinding> {
    public static final SearchSelectorFragment3 INSTANCE = new SearchSelectorFragment3();

    SearchSelectorFragment3() {
        super(1, FragmentSearchSelectorBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/search/selector/databinding/FragmentSearchSelectorBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSearchSelectorBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSearchSelectorBinding.bind(p0);
    }
}
