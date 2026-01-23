package com.robinhood.android.debitcard.linking.p098ui;

import android.view.View;
import com.robinhood.android.debitcard.linking.databinding.FragmentDebitCardVerificationInfoBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardVerificationInfoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class DebitCardVerificationInfoFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDebitCardVerificationInfoBinding> {
    public static final DebitCardVerificationInfoFragment2 INSTANCE = new DebitCardVerificationInfoFragment2();

    DebitCardVerificationInfoFragment2() {
        super(1, FragmentDebitCardVerificationInfoBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardVerificationInfoBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDebitCardVerificationInfoBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDebitCardVerificationInfoBinding.bind(p0);
    }
}
