package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.theme.BentoTheme;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.StreamConfirmationContentResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldUnifiedConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$Loaded$1$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldUnifiedConfirmationComposable5 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
    final /* synthetic */ Function1<Action, Unit> $onAction;
    final /* synthetic */ StreamConfirmationContentResponse $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    GoldUnifiedConfirmationComposable5(StreamConfirmationContentResponse streamConfirmationContentResponse, Function1<? super Action, Unit> function1) {
        this.$this_with = streamConfirmationContentResponse;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
        invoke(bentoButtonBar3, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(42702120, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedConfirmationComposable.kt:103)");
        }
        Cta cta = this.$this_with.getCta();
        String text = cta != null ? cta.getText() : null;
        String cta_disclosure = this.$this_with.getCta_disclosure();
        Cta secondary_cta = this.$this_with.getSecondary_cta();
        String text2 = secondary_cta != null ? secondary_cta.getText() : null;
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$this_with) | composer.changed(this.$onAction);
        final StreamConfirmationContentResponse streamConfirmationContentResponse = this.$this_with;
        final Function1<Action, Unit> function1 = this.$onAction;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$Loaded$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldUnifiedConfirmationComposable5.invoke$lambda$2$lambda$1(streamConfirmationContentResponse, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.$this_with) | composer.changed(this.$onAction);
        final StreamConfirmationContentResponse streamConfirmationContentResponse2 = this.$this_with;
        final Function1<Action, Unit> function12 = this.$onAction;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$Loaded$1$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldUnifiedConfirmationComposable5.invoke$lambda$5$lambda$4(streamConfirmationContentResponse2, function12);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        GoldUnifiedBottomBar.GoldUnifiedBottomBar(text, function0, GoldUnifiedConfirmationComposable3.ConfirmationPrimaryCtaTestTag, modifierM4872backgroundbw27NRU$default, cta_disclosure, false, false, null, text2, (Function0) objRememberedValue2, composer, 384, 224);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(StreamConfirmationContentResponse streamConfirmationContentResponse, Function1 function1) {
        Action action;
        Cta cta = streamConfirmationContentResponse.getCta();
        if (cta != null && (action = cta.getAction()) != null) {
            function1.invoke(action);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(StreamConfirmationContentResponse streamConfirmationContentResponse, Function1 function1) {
        Action action;
        Cta secondary_cta = streamConfirmationContentResponse.getSecondary_cta();
        if (secondary_cta != null && (action = secondary_cta.getAction()) != null) {
            function1.invoke(action);
        }
        return Unit.INSTANCE;
    }
}
