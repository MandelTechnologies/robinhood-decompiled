package com.robinhood.android.chart.blackwidowadvancedchart.composables.templates;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SelectTemplateBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1$1$1$2 */
/* loaded from: classes7.dex */
final class C10902xd795970 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ Function0<Unit> $onCreateTemplate;

    C10902xd795970(HapticFeedback hapticFeedback, Function0<Unit> function0) {
        this.$hapticFeedback = hapticFeedback;
        this.$onCreateTemplate = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1264685597, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelectTemplateBottomSheet.kt:120)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(BorderKt.m4876borderxT4_qwU(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM())), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM())), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onCreateTemplate);
        final HapticFeedback hapticFeedback = this.$hapticFeedback;
        final Function0<Unit> function0 = this.$onCreateTemplate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.SelectTemplateBottomSheetKt$SelectTemplateBottomSheet$1$1$1$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C10902xd795970.invoke$lambda$1$lambda$0(hapticFeedback, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null), Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.ROW, SelectTemplateBottomSheetKt.INDICATOR_SETS_BOTTOM_SHEET_CREATE_SET, null, 4, null), null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, null, 32766, null), false, false, false, true, false, null, 110, null);
        ComposableSingletons$SelectTemplateBottomSheetKt composableSingletons$SelectTemplateBottomSheetKt = ComposableSingletons$SelectTemplateBottomSheetKt.INSTANCE;
        BentoBaseRowLayout.BentoBaseRowLayout(modifierAutoLogEvents$default, null, composableSingletons$SelectTemplateBottomSheetKt.m1797xac292961(), composableSingletons$SelectTemplateBottomSheetKt.m1800xfa2e9af3(), null, null, null, false, false, false, null, composer, 3456, 0, 2034);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(HapticFeedback hapticFeedback, Function0 function0) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        function0.invoke();
        return Unit.INSTANCE;
    }
}
