package com.robinhood.agreements;

import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentiAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.agreements.IdentiAgreementFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class IdentiAgreementFragment2 extends FunctionReferenceImpl implements Function1<IdentiAgreementEvent, Unit> {
    IdentiAgreementFragment2(Object obj) {
        super(1, obj, IdentiAgreementFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IdentiAgreementEvent identiAgreementEvent) {
        invoke2(identiAgreementEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IdentiAgreementEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((IdentiAgreementFragment) this.receiver).handleEvent(p0);
    }
}
