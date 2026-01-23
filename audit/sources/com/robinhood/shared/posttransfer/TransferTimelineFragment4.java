package com.robinhood.shared.posttransfer;

import com.robinhood.shared.posttransfer.TransferTimelineFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TransferTimelineFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.posttransfer.TransferTimelineFragment$onViewCreated$2$3, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class TransferTimelineFragment4 extends FunctionReferenceImpl implements Function0<Unit> {
    TransferTimelineFragment4(Object obj) {
        super(0, obj, TransferTimelineFragment.Callbacks.class, "onContinueClick", "onContinueClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((TransferTimelineFragment.Callbacks) this.receiver).onContinueClick();
    }
}
