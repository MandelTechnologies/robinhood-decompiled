package com.robinhood.android.crypto.tab.p093ui;

import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$6$1 extends FunctionReferenceImpl implements Function1<InstrumentDisplayType, Unit> {
    CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$6$1(Object obj) {
        super(1, obj, CryptoHomeDuxo.class, "changeInstrumentDisplayType", "changeInstrumentDisplayType(Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InstrumentDisplayType instrumentDisplayType) {
        invoke2(instrumentDisplayType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InstrumentDisplayType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoHomeDuxo) this.receiver).changeInstrumentDisplayType(p0);
    }
}
