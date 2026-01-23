package com.robinhood.android.matcha.p177ui.amount;

import android.view.View;
import com.robinhood.android.matcha.databinding.FragmentMatchaAmountInputBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaAmountInputFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaAmountInputFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMatchaAmountInputBinding> {
    public static final MatchaAmountInputFragment2 INSTANCE = new MatchaAmountInputFragment2();

    MatchaAmountInputFragment2() {
        super(1, FragmentMatchaAmountInputBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/matcha/databinding/FragmentMatchaAmountInputBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMatchaAmountInputBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMatchaAmountInputBinding.bind(p0);
    }
}
