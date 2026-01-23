package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar3;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.StreamPlanSelectionContentResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldUnifiedPlanSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$Loaded$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldUnifiedPlanSelectionComposable4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<Action, Unit> $onAction;
    final /* synthetic */ StreamPlanSelectionContentResponse $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    GoldUnifiedPlanSelectionComposable4(StreamPlanSelectionContentResponse streamPlanSelectionContentResponse, Function1<? super Action, Unit> function1) {
        this.$this_with = streamPlanSelectionContentResponse;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091019452, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:111)");
        }
        Cta cta = this.$this_with.getCta();
        String text = cta != null ? cta.getText() : null;
        String disclosure_markdown = this.$this_with.getDisclosure_markdown();
        GoldUnifiedBottomBar3 goldUnifiedBottomBar3 = Intrinsics.areEqual(this.$this_with.getDisable_sparkle_button_styling(), Boolean.TRUE) ? GoldUnifiedBottomBar3.ACHROMATIC : GoldUnifiedBottomBar3.GOLD_SPARKLE;
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onAction) | composer.changedInstance(this.$this_with);
        final Function1<Action, Unit> function1 = this.$onAction;
        final StreamPlanSelectionContentResponse streamPlanSelectionContentResponse = this.$this_with;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$Loaded$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldUnifiedPlanSelectionComposable4.invoke$lambda$1$lambda$0(function1, streamPlanSelectionContentResponse);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        GoldUnifiedBottomBar.GoldUnifiedBottomBar(text, (Function0) objRememberedValue, GoldUnifiedPlanSelectionComposable.PlanSelectionCtaTestTag, null, disclosure_markdown, false, false, goldUnifiedBottomBar3, null, null, composer, 384, 872);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, StreamPlanSelectionContentResponse streamPlanSelectionContentResponse) {
        Cta cta = streamPlanSelectionContentResponse.getCta();
        function1.invoke(cta != null ? cta.getAction() : null);
        return Unit.INSTANCE;
    }
}
