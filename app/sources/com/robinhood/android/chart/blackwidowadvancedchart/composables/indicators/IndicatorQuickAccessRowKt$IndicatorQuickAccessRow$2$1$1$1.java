package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.IndicatorQuickAccessState;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndicatorQuickAccessRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ Function0<Unit> $onTemplateClicked;
    final /* synthetic */ IndicatorQuickAccessState $state;

    IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$1(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, HapticFeedback hapticFeedback, Function0<Unit> function0, IndicatorQuickAccessState indicatorQuickAccessState) {
        this.$eventLogger = eventLogger;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$hapticFeedback = hapticFeedback;
        this.$onTemplateClicked = function0;
        this.$state = indicatorQuickAccessState;
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
            ComposerKt.traceEventStart(-1426288721, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorQuickAccessRow.kt:106)");
        }
        Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(150), 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onTemplateClicked);
        final EventLogger eventLogger = this.$eventLogger;
        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
        final HapticFeedback hapticFeedback = this.$hapticFeedback;
        final Function0<Unit> function0 = this.$onTemplateClicked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$1.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, hapticFeedback, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        final IndicatorQuickAccessState indicatorQuickAccessState = this.$state;
        IndicatorQuickAccessRowKt.m11905IndicatorPill1Kfb2uI(jM21373getBg30d7_KjU, jM21371getBg0d7_KjU, (Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(1651157473, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$1.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                invoke(row5, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Row5 IndicatorPill, Composer composer2, int i3) {
                int i4;
                Intrinsics.checkNotNullParameter(IndicatorPill, "$this$IndicatorPill");
                if ((i3 & 6) == 0) {
                    i4 = i3 | (composer2.changed(IndicatorPill) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i4 & 19) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1651157473, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorQuickAccessRow.kt:123)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierWeight = IndicatorPill.weight(companion, 1.0f, false);
                TemplateDto selectedTemplate = indicatorQuickAccessState.getSelectedTemplate();
                String name = selectedTemplate != null ? selectedTemplate.getName() : null;
                composer2.startReplaceGroup(1919404463);
                if (name == null) {
                    name = StringResources_androidKt.stringResource(C10963R.string.no_sets_selected_text, composer2, 0);
                }
                composer2.endReplaceGroup();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(name, modifierWeight, Color.m6701boximpl(bentoTheme2.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composer2, i5).getTextS(), composer2, 817889280, 0, 7544);
                float f = 4;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16), null, bentoTheme2.getColors(composer2, i5).m21425getFg0d7_KjU(), OffsetKt.m5125offsetVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composer2, i5).m21593getSmallD9Ej5fM() - C2002Dp.m7995constructorimpl(f)), 0.0f, 0.0f, 0.0f, 14, null), C2002Dp.m7995constructorimpl(f), 0.0f, 2, null), null, false, composer2, BentoIcon4.Size16.$stable | 48, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), modifierM5176widthInVpY3zN4$default, null, composer, 27648, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, HapticFeedback hapticFeedback, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.PILL, IndicatorQuickAccessRowKt.INDICATORS_ROW_SET, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        function0.invoke();
        return Unit.INSTANCE;
    }
}
