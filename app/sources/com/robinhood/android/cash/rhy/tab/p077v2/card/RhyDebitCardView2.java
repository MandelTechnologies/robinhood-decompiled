package com.robinhood.android.cash.rhy.tab.p077v2.card;

import android.view.View;
import com.robinhood.android.cash.rhy.tab.databinding.MergeRhyDebitCardViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyDebitCardView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.card.RhyDebitCardView$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RhyDebitCardView2 extends FunctionReferenceImpl implements Function1<View, MergeRhyDebitCardViewBinding> {
    public static final RhyDebitCardView2 INSTANCE = new RhyDebitCardView2();

    RhyDebitCardView2() {
        super(1, MergeRhyDebitCardViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyDebitCardViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRhyDebitCardViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRhyDebitCardViewBinding.bind(p0);
    }
}
