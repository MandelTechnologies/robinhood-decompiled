package com.robinhood.android.advisory.tlh.summary;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardViewState;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowState;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: TaxLossHarvestingSummaryScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.summary.ComposableSingletons$TaxLossHarvestingSummaryScreenKt$lambda$928457323$1, reason: use source file name */
/* loaded from: classes7.dex */
final class TaxLossHarvestingSummaryScreen2 implements Function2<Composer, Integer, Unit> {
    public static final TaxLossHarvestingSummaryScreen2 INSTANCE = new TaxLossHarvestingSummaryScreen2();

    TaxLossHarvestingSummaryScreen2() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(Composer composer, int i) {
        int i2 = 2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(928457323, i, -1, "com.robinhood.android.advisory.tlh.summary.ComposableSingletons$TaxLossHarvestingSummaryScreenKt.lambda$928457323.<anonymous> (TaxLossHarvestingSummaryScreen.kt:234)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        ColorDto colorDto = ColorDto.COLOR_POSITIVE;
        TaxLossHarvestDashboard.Status status = new TaxLossHarvestDashboard.Status("Enabled", new ThemedColorDto(colorDto, colorDto), "We'll sell as many managed holdings as possible to maximize your potential tax savings.", new TaxLossHarvestDashboard.Cta("Customize", TaxLossHarvestDashboard.CtaAction.DISABLE, true, null, null, null));
        Timeline.Status status2 = Timeline.Status.ONGOING;
        TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader = null;
        String str = null;
        boolean z = false;
        String str2 = "Tax loss harvesting";
        String str3 = "We'll maximize your tax savings once a year by offsetting gains with losses. [Lear more]()";
        Object[] objArr = 0 == true ? 1 : 0;
        TaxLossHarvestDashboardViewState taxLossHarvestDashboardViewState = new TaxLossHarvestDashboardViewState(str2, str3, status, new TaxLossHarvestDashboardViewState.TimelineState("What to expect", extensions2.persistentListOf(new TaxLossHarvestDashboardViewState.TimelineState.TimelineRow(new BentoTimelineRowState(status2, Timeline.Position.TOP, "All year long", null, null, "We strategically choose which shares to sell to minimize your taxable gains as we trade.", null, null, null, false, null, null, null, null, false, false, 0, false, 0, false, false, false, null, null, 16777176, null), null, i2, 0 == true ? 1 : 0), new TaxLossHarvestDashboardViewState.TimelineState.TimelineRow(new BentoTimelineRowState(status2, Timeline.Position.BETWEEN, "Nov 15–Dec 23", null, null, "You can review your est savings. You may have the option to offset gains from other accounts.", null, null, null, false, null, null, null, null, false, false, 0, false, 0, false, false, false, null, null, 16777176, null), null, i2, 0 == true ? 1 : 0), new TaxLossHarvestDashboardViewState.TimelineState.TimelineRow(new BentoTimelineRowState(Timeline.Status.INCOMPLETE, Timeline.Position.BOTTOM, "Dec 24–31", null, null, "We’ll harvest losses as soon as you review your estimated savings or starting Dec 24.", null, null, null, false, null, null, null, null, false, false, 0, false, 0, false, false, false, null, null, 16777176, null), null, i2, 0 == true ? 1 : 0))), gainsAndLossesSectionHeader, objArr, str, z, null, null, 896, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.summary.ComposableSingletons$TaxLossHarvestingSummaryScreenKt$lambda$928457323$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLossHarvestingSummaryScreen2.invoke$lambda$1$lambda$0((TaxLossHarvestDashboard.Cta) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        TaxLossHarvestingSummaryScreen3.TaxLossHarvestDashboardComposable(taxLossHarvestDashboardViewState, (Function1) objRememberedValue, modifierM4872backgroundbw27NRU$default, composer, 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TaxLossHarvestDashboard.Cta it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
