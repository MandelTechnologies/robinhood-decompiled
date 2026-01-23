package com.robinhood.android.slip.onboarding.agreements;

import android.view.View;
import com.robinhood.android.slip.databinding.RowSlipAgreementBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipAgreementRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.agreements.SlipAgreementRow$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SlipAgreementRow2 extends FunctionReferenceImpl implements Function1<View, RowSlipAgreementBinding> {
    public static final SlipAgreementRow2 INSTANCE = new SlipAgreementRow2();

    SlipAgreementRow2() {
        super(1, RowSlipAgreementBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/slip/databinding/RowSlipAgreementBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final RowSlipAgreementBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return RowSlipAgreementBinding.bind(p0);
    }
}
