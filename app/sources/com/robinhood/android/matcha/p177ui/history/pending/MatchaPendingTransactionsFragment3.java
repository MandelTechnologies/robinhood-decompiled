package com.robinhood.android.matcha.p177ui.history.pending;

import android.view.View;
import com.robinhood.android.matcha.databinding.FragmentMatchaPendingTransactionsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaPendingTransactionsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaPendingTransactionsFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentMatchaPendingTransactionsBinding> {
    public static final MatchaPendingTransactionsFragment3 INSTANCE = new MatchaPendingTransactionsFragment3();

    MatchaPendingTransactionsFragment3() {
        super(1, FragmentMatchaPendingTransactionsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/matcha/databinding/FragmentMatchaPendingTransactionsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMatchaPendingTransactionsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMatchaPendingTransactionsBinding.bind(p0);
    }
}
