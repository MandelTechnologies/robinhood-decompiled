package com.robinhood.android.rollover401k.steps.finder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Finder401kScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt$Finder401kScreen$1$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class Finder401kScreen9 extends FunctionReferenceImpl implements Function0<Unit> {
    Finder401kScreen9(Object obj) {
        super(0, obj, Finder401kDuxo.class, "onExit", "onExit()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((Finder401kDuxo) this.receiver).onExit();
    }
}
