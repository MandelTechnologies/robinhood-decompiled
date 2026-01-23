package com.robinhood.android.beneficiaries.p067ui.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BeneficiaryDetailCompose.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt$BeneficiaryDetailCompose$1$1$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class BeneficiaryDetailCompose4 extends FunctionReferenceImpl implements Function0<Unit> {
    BeneficiaryDetailCompose4(Object obj) {
        super(0, obj, BeneficiaryDetailCompose.class, "onClickDeleteBeneficiary", "onClickDeleteBeneficiary()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BeneficiaryDetailCompose) this.receiver).onClickDeleteBeneficiary();
    }
}
