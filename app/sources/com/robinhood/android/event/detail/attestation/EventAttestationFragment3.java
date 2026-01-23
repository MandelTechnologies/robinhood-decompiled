package com.robinhood.android.event.detail.attestation;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventAttestationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventAttestationFragment3 extends FunctionReferenceImpl implements Function1<UiAgreementWithContent, Unit> {
    EventAttestationFragment3(Object obj) {
        super(1, obj, EventAttestationDuxo.class, "onAgreeClicked", "onAgreeClicked(Lcom/robinhood/android/agreements/models/UiAgreementWithContent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UiAgreementWithContent uiAgreementWithContent) {
        invoke2(uiAgreementWithContent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UiAgreementWithContent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventAttestationDuxo) this.receiver).onAgreeClicked(p0);
    }
}
