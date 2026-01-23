package com.robinhood.android.optionschain.sbschain;

import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$1$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C24336xfdbf1839 extends FunctionReferenceImpl implements Function1<MultiModeSheetState2, Unit> {
    C24336xfdbf1839(Object obj) {
        super(1, obj, OptionSideBySideChainDuxo.class, "onBottomSheetStateUpdated", "onBottomSheetStateUpdated(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MultiModeSheetState2 multiModeSheetState2) {
        invoke2(multiModeSheetState2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MultiModeSheetState2 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionSideBySideChainDuxo) this.receiver).onBottomSheetStateUpdated(p0);
    }
}
