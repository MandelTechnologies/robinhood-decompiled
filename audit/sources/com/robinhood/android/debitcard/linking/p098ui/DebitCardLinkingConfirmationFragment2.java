package com.robinhood.android.debitcard.linking.p098ui;

import android.view.View;
import com.robinhood.android.debitcard.linking.databinding.FragmentDebitCardLinkingConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardLinkingConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingConfirmationFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class DebitCardLinkingConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDebitCardLinkingConfirmationBinding> {
    public static final DebitCardLinkingConfirmationFragment2 INSTANCE = new DebitCardLinkingConfirmationFragment2();

    DebitCardLinkingConfirmationFragment2() {
        super(1, FragmentDebitCardLinkingConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardLinkingConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDebitCardLinkingConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDebitCardLinkingConfirmationBinding.bind(p0);
    }
}
