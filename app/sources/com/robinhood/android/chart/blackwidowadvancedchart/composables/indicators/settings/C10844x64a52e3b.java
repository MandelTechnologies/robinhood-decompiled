package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorTooltipDto;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndicatorSettingsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsTitle$indicatorDescription$1 */
/* loaded from: classes7.dex */
final class C10844x64a52e3b implements Function3<String, Composer, Integer, Unit> {
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ IndicatorStateDto $indicator;
    final /* synthetic */ SnapshotState<Boolean> $showDescriptionPopup$delegate;

    C10844x64a52e3b(IndicatorStateDto indicatorStateDto, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState<Boolean> snapshotState) {
        this.$indicator = indicatorStateDto;
        this.$eventLogger = eventLogger;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$showDescriptionPopup$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
        invoke(str, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(String it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749402879, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsTitle.<anonymous> (IndicatorSettingsScreen.kt:439)");
        }
        IndicatorTooltipDto tooltip = this.$indicator.getTooltip();
        if (tooltip != null) {
            final IndicatorStateDto indicatorStateDto = this.$indicator;
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            final SnapshotState<Boolean> snapshotState = this.$showDescriptionPopup$delegate;
            UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, indicatorStateDto.getTitle() + "_description");
            Boolean boolValueOf = Boolean.valueOf(IndicatorSettingsScreenKt.IndicatorSettingsTitle$lambda$7(snapshotState));
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsTitle$indicatorDescription$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C10844x64a52e3b.invoke$lambda$4$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(modifierTestTag, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : (Function0) objRememberedValue, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : PopupPositioning.BELOW, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.rememberComposableLambda(-1405852472, true, new C10845x15aeb296(tooltip, uriHandler), composer, 54));
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.QUESTION_24);
            long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(eventLogger) | composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(indicatorStateDto);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsTitle$indicatorDescription$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C10844x64a52e3b.invoke$lambda$4$lambda$3$lambda$2(eventLogger, userInteractionEventDescriptor, indicatorStateDto, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, modifierM26519popupTooltipBgaGok8, (Function0) objRememberedValue2, false, composer, BentoIcon4.Size24.$stable | 48, 32);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1$lambda$0(SnapshotState snapshotState) {
        IndicatorSettingsScreenKt.IndicatorSettingsTitle$lambda$8(snapshotState, !IndicatorSettingsScreenKt.IndicatorSettingsTitle$lambda$7(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, IndicatorStateDto indicatorStateDto, SnapshotState snapshotState) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, "ChartSettingsBottomSheetDisclosure", null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, indicatorStateDto.getId(), null, null, null, 0.0d, null, null, 32511, null).getContext(), false, 41, null);
        IndicatorSettingsScreenKt.IndicatorSettingsTitle$lambda$8(snapshotState, !IndicatorSettingsScreenKt.IndicatorSettingsTitle$lambda$7(snapshotState));
        return Unit.INSTANCE;
    }
}
