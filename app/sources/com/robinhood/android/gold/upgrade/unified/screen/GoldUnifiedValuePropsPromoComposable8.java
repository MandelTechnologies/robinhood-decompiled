package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.StreamValuePropsPromoContentResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldUnifiedValuePropsPromoComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$Loaded$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldUnifiedValuePropsPromoComposable8 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<Action, Unit> $onAction;
    final /* synthetic */ StreamValuePropsPromoContentResponse $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    GoldUnifiedValuePropsPromoComposable8(StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse, Function1<? super Action, Unit> function1) {
        this.$this_with = streamValuePropsPromoContentResponse;
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
            ComposerKt.traceEventStart(-1751176431, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedValuePropsPromoComposable.kt:179)");
        }
        Cta cta = this.$this_with.getCta();
        String text = cta != null ? cta.getText() : null;
        String cta_disclosure_markdown = this.$this_with.getCta_disclosure_markdown();
        Cta secondary_cta = this.$this_with.getSecondary_cta();
        String text2 = secondary_cta != null ? secondary_cta.getText() : null;
        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onAction) | composer.changedInstance(this.$this_with);
        final Function1<Action, Unit> function1 = this.$onAction;
        final StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse = this.$this_with;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$Loaded$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldUnifiedValuePropsPromoComposable8.invoke$lambda$1$lambda$0(function1, streamValuePropsPromoContentResponse);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged2 = composer.changed(this.$onAction) | composer.changedInstance(this.$this_with);
        final Function1<Action, Unit> function12 = this.$onAction;
        final StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse2 = this.$this_with;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$Loaded$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldUnifiedValuePropsPromoComposable8.invoke$lambda$3$lambda$2(function12, streamValuePropsPromoContentResponse2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        GoldUnifiedBottomBar.GoldUnifiedBottomBar(text, function0, GoldUnifiedValuePropsPromoComposable.ValuePropsPromoCtaTestTag, modifierNavigationBarsPadding, cta_disclosure_markdown, false, false, null, text2, (Function0) objRememberedValue2, composer, 384, 224);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse) {
        Cta cta = streamValuePropsPromoContentResponse.getCta();
        function1.invoke(cta != null ? cta.getAction() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function1 function1, StreamValuePropsPromoContentResponse streamValuePropsPromoContentResponse) {
        Cta secondary_cta = streamValuePropsPromoContentResponse.getSecondary_cta();
        function1.invoke(secondary_cta != null ? secondary_cta.getAction() : null);
        return Unit.INSTANCE;
    }
}
