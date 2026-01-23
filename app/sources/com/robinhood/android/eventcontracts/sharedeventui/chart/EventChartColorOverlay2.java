package com.robinhood.android.eventcontracts.sharedeventui.chart;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventChartColorOverlay.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;", "colorOverlay", "Lkotlin/Function0;", "", "content", "ProvideEventChartColors", "(Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartColorOverlayKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventChartColorOverlay2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideEventChartColors$lambda$0(EventChartColorOverlay eventChartColorOverlay, Function2 function2, int i, Composer composer, int i2) {
        ProvideEventChartColors(eventChartColorOverlay, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ProvideEventChartColors(final EventChartColorOverlay eventChartColorOverlay, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(208090186);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(eventChartColorOverlay) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(208090186, i2, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.ProvideEventChartColors (EventChartColorOverlay.kt:21)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoColors colors = bentoTheme.getColors(composerStartRestartGroup, i3);
            DayNightColor c1ThemedColor = eventChartColorOverlay != null ? eventChartColorOverlay.getC1ThemedColor() : null;
            composerStartRestartGroup.startReplaceGroup(-1888787505);
            Color colorM6701boximpl = c1ThemedColor == null ? null : Color.m6701boximpl(c1ThemedColor.getColor(composerStartRestartGroup, 0));
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1888788380);
            long c1 = colorM6701boximpl == null ? bentoTheme.getColors(composerStartRestartGroup, i3).getC1() : colorM6701boximpl.getValue();
            composerStartRestartGroup.endReplaceGroup();
            DayNightColor c2ThemedColor = eventChartColorOverlay != null ? eventChartColorOverlay.getC2ThemedColor() : null;
            composerStartRestartGroup.startReplaceGroup(-1888785169);
            Color colorM6701boximpl2 = c2ThemedColor == null ? null : Color.m6701boximpl(c2ThemedColor.getColor(composerStartRestartGroup, 0));
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1888786044);
            long c2 = colorM6701boximpl2 == null ? bentoTheme.getColors(composerStartRestartGroup, i3).getC2() : colorM6701boximpl2.getValue();
            composerStartRestartGroup.endReplaceGroup();
            DayNightColor c3ThemedColor = eventChartColorOverlay != null ? eventChartColorOverlay.getC3ThemedColor() : null;
            composerStartRestartGroup.startReplaceGroup(-1888782833);
            Color colorM6701boximpl3 = c3ThemedColor == null ? null : Color.m6701boximpl(c3ThemedColor.getColor(composerStartRestartGroup, 0));
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1888783708);
            long c3 = colorM6701boximpl3 == null ? bentoTheme.getColors(composerStartRestartGroup, i3).getC3() : colorM6701boximpl3.getValue();
            composerStartRestartGroup.endReplaceGroup();
            DayNightColor c4ThemedColor = eventChartColorOverlay != null ? eventChartColorOverlay.getC4ThemedColor() : null;
            composerStartRestartGroup.startReplaceGroup(-1888780497);
            Color colorM6701boximpl4 = c4ThemedColor == null ? null : Color.m6701boximpl(c4ThemedColor.getColor(composerStartRestartGroup, 0));
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1888781372);
            long c4 = colorM6701boximpl4 == null ? bentoTheme.getColors(composerStartRestartGroup, i3).getC4() : colorM6701boximpl4.getValue();
            composerStartRestartGroup.endReplaceGroup();
            DayNightColor c5ThemedColor = eventChartColorOverlay != null ? eventChartColorOverlay.getC5ThemedColor() : null;
            composerStartRestartGroup.startReplaceGroup(-1888778161);
            Color colorM6701boximpl5 = c5ThemedColor != null ? Color.m6701boximpl(c5ThemedColor.getColor(composerStartRestartGroup, 0)) : null;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1888779036);
            long c5 = colorM6701boximpl5 == null ? bentoTheme.getColors(composerStartRestartGroup, i3).getC5() : colorM6701boximpl5.getValue();
            composerStartRestartGroup.endReplaceGroup();
            BentoThemeOverlays.CustomColorsOverlay(BentoColors.m21357copy0oIltwM$default(colors, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c1, c2, c3, c4, c5, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, null, null, null, null, null, null, 0L, 0L, 0L, -1, -1, -7937, 1048575, null), content, composerStartRestartGroup, i2 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartColorOverlayKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventChartColorOverlay2.ProvideEventChartColors$lambda$0(eventChartColorOverlay, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
