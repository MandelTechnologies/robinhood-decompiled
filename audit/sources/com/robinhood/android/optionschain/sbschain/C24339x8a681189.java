package com.robinhood.android.optionschain.sbschain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$2$3$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C24339x8a681189 extends FunctionReferenceImpl implements Function0<Unit> {
    C24339x8a681189(Object obj) {
        super(0, obj, OptionSideBySideChainDuxo.class, "dismissSwitchBackToClassicChainTooltip", "dismissSwitchBackToClassicChainTooltip()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OptionSideBySideChainDuxo) this.receiver).dismissSwitchBackToClassicChainTooltip();
    }
}
