package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.optionschain.view.OptionChainTooltipBanner3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$1$1$7$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C24348x380b4de8 extends FunctionReferenceImpl implements Function1<OptionChainTooltipBanner3, Unit> {
    C24348x380b4de8(Object obj) {
        super(1, obj, OptionSideBySideChainDuxo.class, "onTopTooltipBannerDismiss", "onTopTooltipBannerDismiss(Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OptionChainTooltipBanner3 optionChainTooltipBanner3) {
        invoke2(optionChainTooltipBanner3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OptionChainTooltipBanner3 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionSideBySideChainDuxo) this.receiver).onTopTooltipBannerDismiss(p0);
    }
}
