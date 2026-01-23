package com.robinhood.android.crypto.p094ui.detail.position;

import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPositionSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$3$1$2$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class CryptoPositionSection4 extends FunctionReferenceImpl implements Function1<CryptoPositionState.PositionBannerType, Unit> {
    CryptoPositionSection4(Object obj) {
        super(1, obj, CryptoPositionDuxo.class, "onPositionBannerClicked", "onPositionBannerClicked(Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoPositionState.PositionBannerType positionBannerType) {
        invoke2(positionBannerType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoPositionState.PositionBannerType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoPositionDuxo) this.receiver).onPositionBannerClicked(p0);
    }
}
