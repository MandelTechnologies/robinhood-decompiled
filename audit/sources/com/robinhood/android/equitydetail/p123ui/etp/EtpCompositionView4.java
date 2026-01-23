package com.robinhood.android.equitydetail.p123ui.etp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EtpCompositionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$onAttachedToWindow$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EtpCompositionView4 extends FunctionReferenceImpl implements Function0<Unit> {
    EtpCompositionView4(Object obj) {
        super(0, obj, EtpCompositionDuxo.class, "toggleBondsExpanded", "toggleBondsExpanded()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EtpCompositionDuxo) this.receiver).toggleBondsExpanded();
    }
}
