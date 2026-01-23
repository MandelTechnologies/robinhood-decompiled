package com.robinhood.android.transfers.p271ui.max.wires;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: WireRoutingDetailsInputFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$ComposeContent$4$2$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class WireRoutingDetailsInputFragment5 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    WireRoutingDetailsInputFragment5(Object obj) {
        super(1, obj, WireRoutingDetailsInputDuxo.class, "onAgreementCheckChange", "onAgreementCheckChange(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((WireRoutingDetailsInputDuxo) this.receiver).onAgreementCheckChange(z);
    }
}
