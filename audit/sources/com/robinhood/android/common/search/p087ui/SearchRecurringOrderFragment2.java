package com.robinhood.android.common.search.p087ui;

import android.view.View;
import com.robinhood.android.common.search.databinding.FragmentSearchRecurringOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchRecurringOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.search.ui.SearchRecurringOrderFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class SearchRecurringOrderFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSearchRecurringOrderBinding> {
    public static final SearchRecurringOrderFragment2 INSTANCE = new SearchRecurringOrderFragment2();

    SearchRecurringOrderFragment2() {
        super(1, FragmentSearchRecurringOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/search/databinding/FragmentSearchRecurringOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSearchRecurringOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSearchRecurringOrderBinding.bind(p0);
    }
}
