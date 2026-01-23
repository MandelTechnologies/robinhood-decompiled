package com.robinhood.android.common.portfolio.position;

import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionListItemComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class PositionListItemComposableKt$PositionListItemComposable$5$1 extends FunctionReferenceImpl implements Function1<PositionInstrumentType, Unit> {
    PositionListItemComposableKt$PositionListItemComposable$5$1(Object obj) {
        super(1, obj, PositionListItemDuxo.class, "onSwipe", "onSwipe(Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PositionInstrumentType positionInstrumentType) {
        invoke2(positionInstrumentType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PositionInstrumentType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PositionListItemDuxo) this.receiver).onSwipe(p0);
    }
}
