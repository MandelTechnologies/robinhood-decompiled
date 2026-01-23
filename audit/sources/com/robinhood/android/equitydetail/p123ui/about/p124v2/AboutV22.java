package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AboutV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Kt$AboutV2$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class AboutV22 extends FunctionReferenceImpl implements Function0<Unit> {
    AboutV22(Object obj) {
        super(0, obj, AboutV2Duxo.class, "onAboutTextOverflow", "onAboutTextOverflow$feature_equity_detail_externalDebug()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AboutV2Duxo) this.receiver).onAboutTextOverflow$feature_equity_detail_externalDebug();
    }
}
