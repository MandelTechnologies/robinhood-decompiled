package com.robinhood.android.crypto.p094ui.detail.position;

import com.robinhood.android.crypto.p094ui.detail.position.views.CryptoPositionRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPositionSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$3$1$3$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class CryptoPositionSection5 extends FunctionReferenceImpl implements Function1<CryptoPositionRowState.TooltipType, Unit> {
    CryptoPositionSection5(Object obj) {
        super(1, obj, CryptoPositionDuxo.class, "onTooltipClicked", "onTooltipClicked(Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoPositionRowState.TooltipType tooltipType) {
        invoke2(tooltipType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoPositionRowState.TooltipType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoPositionDuxo) this.receiver).onTooltipClicked(p0);
    }
}
