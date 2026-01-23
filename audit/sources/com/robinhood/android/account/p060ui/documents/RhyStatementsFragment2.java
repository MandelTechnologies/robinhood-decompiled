package com.robinhood.android.account.p060ui.documents;

import android.view.View;
import com.robinhood.android.account.overview.databinding.FragmentRhyStatementsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyStatementsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.ui.documents.RhyStatementsFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class RhyStatementsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyStatementsBinding> {
    public static final RhyStatementsFragment2 INSTANCE = new RhyStatementsFragment2();

    RhyStatementsFragment2() {
        super(1, FragmentRhyStatementsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/account/overview/databinding/FragmentRhyStatementsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyStatementsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyStatementsBinding.bind(p0);
    }
}
