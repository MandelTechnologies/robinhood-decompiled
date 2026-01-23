package com.robinhood.android.retirement.partnerships.matchhub;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RetirementMatchHubScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.partnerships.matchhub.RetirementMatchHubScreenKt$MatchHubScreen$2$1$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RetirementMatchHubScreen6 extends FunctionReferenceImpl implements Function0<Unit> {
    RetirementMatchHubScreen6(Object obj) {
        super(0, obj, RetirementMatchHubScreen3.class, "onBackClick", "onBackClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RetirementMatchHubScreen3) this.receiver).onBackClick();
    }
}
