package com.robinhood.android.slip.onboarding.agreements;

import android.view.View;
import com.robinhood.android.slip.databinding.RowSlipAgreementLinksBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipAgreementLinkRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.agreements.SlipAgreementLinkRow$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SlipAgreementLinkRow2 extends FunctionReferenceImpl implements Function1<View, RowSlipAgreementLinksBinding> {
    public static final SlipAgreementLinkRow2 INSTANCE = new SlipAgreementLinkRow2();

    SlipAgreementLinkRow2() {
        super(1, RowSlipAgreementLinksBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/slip/databinding/RowSlipAgreementLinksBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final RowSlipAgreementLinksBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return RowSlipAgreementLinksBinding.bind(p0);
    }
}
