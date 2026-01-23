package com.robinhood.shared.posttransfer;

import com.robinhood.shared.posttransfer.TransferInstantAvailabilityFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TransferInstantAvailabilityFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.posttransfer.TransferInstantAvailabilityFragment$onViewCreated$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class TransferInstantAvailabilityFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    TransferInstantAvailabilityFragment3(Object obj) {
        super(0, obj, TransferInstantAvailabilityFragment.Callbacks.class, "onContinueClick", "onContinueClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((TransferInstantAvailabilityFragment.Callbacks) this.receiver).onContinueClick();
    }
}
