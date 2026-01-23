package com.robinhood.android.wires.p278ui;

import com.robinhood.android.wires.p278ui.OutgoingWiresInfoFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OutgoingWiresInfoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.wires.ui.OutgoingWiresInfoFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes16.dex */
/* synthetic */ class OutgoingWiresInfoFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    OutgoingWiresInfoFragment2(Object obj) {
        super(0, obj, OutgoingWiresInfoFragment.Callbacks.class, "onContinuePastOutgoingWiresInfo", "onContinuePastOutgoingWiresInfo()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OutgoingWiresInfoFragment.Callbacks) this.receiver).onContinuePastOutgoingWiresInfo();
    }
}
