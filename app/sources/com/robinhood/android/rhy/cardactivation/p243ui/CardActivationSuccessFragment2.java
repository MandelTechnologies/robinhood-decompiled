package com.robinhood.android.rhy.cardactivation.p243ui;

import android.view.View;
import com.robinhood.android.rhy.cardactivation.databinding.FragmentCardActivationSuccessBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardActivationSuccessFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class CardActivationSuccessFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCardActivationSuccessBinding> {
    public static final CardActivationSuccessFragment2 INSTANCE = new CardActivationSuccessFragment2();

    CardActivationSuccessFragment2() {
        super(1, FragmentCardActivationSuccessBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhy/cardactivation/databinding/FragmentCardActivationSuccessBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCardActivationSuccessBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCardActivationSuccessBinding.bind(p0);
    }
}
