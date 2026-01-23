package com.robinhood.tooltips;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: DefaultTooltipManager.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.tooltips.DefaultTooltipManager$reposition$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DefaultTooltipManager5 implements Function1<TooltipData, Unit> {
    final /* synthetic */ DefaultTooltipManager this$0;

    DefaultTooltipManager5(DefaultTooltipManager defaultTooltipManager) {
        this.this$0 = defaultTooltipManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TooltipData tooltipData) {
        invoke2(tooltipData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TooltipData tooltipData) {
        this.this$0.getDuxo().removeTooltip(tooltipData.getId());
    }
}
