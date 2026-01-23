package com.robinhood.android.rothconversion;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RothConversionInfo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rothconversion.RothConversionInfoKt$RothConversionInfo$1$1$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RothConversionInfo2 extends FunctionReferenceImpl implements Function0<Unit> {
    RothConversionInfo2(Object obj) {
        super(0, obj, RothConversionInfoPager3.class, "retryLoad", "retryLoad()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RothConversionInfoPager3) this.receiver).retryLoad();
    }
}
