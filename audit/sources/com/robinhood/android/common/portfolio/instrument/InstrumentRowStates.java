package com.robinhood.android.common.portfolio.instrument;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.android.instrumentrow.InstrumentRowState;
import com.robinhood.android.instrumentrow.models.BackgroundColor;
import com.robinhood.android.instrumentrow.models.Text;
import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InstrumentRowStates.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"instrumentRowState", "Lcom/robinhood/android/instrumentrow/InstrumentRowState;", "isDisplayValueLoading", "", "shouldShowDisplayStringsAsText", "subValue", "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails$TextDisplay;", "subtitle", "title", "value", "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails$ValueDisplay;", "chart", "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails$Chart;", "metadataId", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "accountNumber", "", "isStale", "iconDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "(ZZLcom/robinhood/android/models/portfolio/InstrumentListItemDetails$TextDisplay;Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails$TextDisplay;Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails$TextDisplay;Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails$ValueDisplay;Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails$Chart;Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Ljava/lang/String;ZLcom/robinhood/models/serverdriven/experimental/api/Direction;Landroidx/compose/runtime/Composer;III)Lcom/robinhood/android/instrumentrow/InstrumentRowState;", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.instrument.InstrumentRowStatesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class InstrumentRowStates {
    public static final InstrumentRowState instrumentRowState(boolean z, boolean z2, InstrumentDetails3.TextDisplay subValue, InstrumentDetails3.TextDisplay subtitle, InstrumentDetails3.TextDisplay title, InstrumentDetails3.ValueDisplay value, InstrumentDetails3.Chart chart, UUID uuid, InstrumentType instrumentType, String str, boolean z3, Direction direction, Composer composer, int i, int i2, int i3) {
        ThemedColor color;
        long jM18896toComposeColorDefaultediJQMabo;
        long jM18896toComposeColorDefaultediJQMabo2;
        Intrinsics.checkNotNullParameter(subValue, "subValue");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        composer.startReplaceGroup(1955559677);
        InstrumentDetails3.Chart chart2 = (i3 & 64) != 0 ? null : chart;
        UUID uuid2 = (i3 & 128) != 0 ? null : uuid;
        InstrumentType instrumentType2 = (i3 & 256) != 0 ? null : instrumentType;
        String str2 = (i3 & 512) != 0 ? null : str;
        boolean z4 = (i3 & 1024) != 0 ? false : z3;
        Direction direction2 = (i3 & 2048) != 0 ? null : direction;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1955559677, i, i2, "com.robinhood.android.common.portfolio.instrument.instrumentRowState (InstrumentRowStates.kt:29)");
        }
        Text text = new Text(title.getValue(), SduiColors2.m18896toComposeColorDefaultediJQMabo(title.getColor(), 0L, composer, 0, 1), null);
        Text text2 = new Text(subtitle.getValue(), SduiColors2.m18896toComposeColorDefaultediJQMabo(subtitle.getColor(), 0L, composer, 0, 1), null);
        String value2 = value.getText().getValue();
        if (z2) {
            color = title.getColor();
        } else {
            color = value.getText().getColor();
        }
        Text text3 = new Text(value2, SduiColors2.m18896toComposeColorDefaultediJQMabo(color, 0L, composer, 0, 1), null);
        Text text4 = (!z2 || StringsKt.isBlank(subValue.getValue())) ? null : new Text(subValue.getValue(), SduiColors2.m18896toComposeColorDefaultediJQMabo(subValue.getColor(), 0L, composer, 0, 1), null);
        if (z4) {
            composer.startReplaceGroup(1143323768);
            jM18896toComposeColorDefaultediJQMabo = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1143375166);
            jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(value.getBackgroundColor(), 0L, composer, 0, 1);
            composer.endReplaceGroup();
        }
        if (z4) {
            composer.startReplaceGroup(1143481496);
            jM18896toComposeColorDefaultediJQMabo2 = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1143533700);
            jM18896toComposeColorDefaultediJQMabo2 = SduiColors2.m18896toComposeColorDefaultediJQMabo(value.getBorderColor(), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), composer, 0, 0);
            composer.endReplaceGroup();
        }
        BackgroundColor backgroundColor = new BackgroundColor(jM18896toComposeColorDefaultediJQMabo, jM18896toComposeColorDefaultediJQMabo2, null);
        List<ChartLine> chartLines = chart2 != null ? chart2.getChartLines() : null;
        InstrumentRowState instrumentRowState = new InstrumentRowState(uuid2, instrumentType2, str2, text, text2, text3, text4, backgroundColor, chartLines != null ? SduiChartMappersKt.m18604mapSdcSegmentedLinesRxXgDco(chartLines, C2002Dp.m7995constructorimpl((float) 1.5d), null, composer, 48, 4) : null, z, !z2, 1, false, false, false, direction2, 28672, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return instrumentRowState;
    }
}
