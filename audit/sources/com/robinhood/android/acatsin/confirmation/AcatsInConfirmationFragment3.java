package com.robinhood.android.acatsin.confirmation;

import com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AcatsInConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.confirmation.AcatsInConfirmationFragment$onViewCreated$1$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInConfirmationFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    AcatsInConfirmationFragment3(Object obj) {
        super(0, obj, AcatsInConfirmationContract.Callbacks.class, "onConfirmationDoneClicked", "onConfirmationDoneClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AcatsInConfirmationContract.Callbacks) this.receiver).onConfirmationDoneClicked();
    }
}
