package com.robinhood.android.advisory.dashboard.overview;

import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CursorDataExtensions.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0013\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\t*\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0011\u0010\b\u001a\u00020\u000b*\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"reduceCursorDataForPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "point", "Lcom/robinhood/android/charts/model/Point;", "boldedForCursorData", "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "bolded", "Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "(Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "Lcom/robinhood/android/charts/cursor/CursorData;", "(Lcom/robinhood/android/charts/cursor/CursorData;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/cursor/CursorData;", "lib-advisory-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.CursorDataExtensionsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CursorDataExtensions {
    public static final Point reduceCursorDataForPoint(PerformanceChartModel performanceChartModel, com.robinhood.android.charts.model.Point point) {
        Object next;
        Object next2;
        Point closestHorizontalPoint;
        Point closestHorizontalPoint2;
        Intrinsics.checkNotNullParameter(performanceChartModel, "<this>");
        Intrinsics.checkNotNullParameter(point, "point");
        Iterator<T> it = performanceChartModel.getLines().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Line) next).is_primary()) {
                break;
            }
        }
        Line line = (Line) next;
        Iterator<T> it2 = performanceChartModel.getLines().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (!((Line) next2).is_primary()) {
                break;
            }
        }
        Line line2 = (Line) next2;
        if (line == null || (closestHorizontalPoint = PerformanceChartReadyComposable.getClosestHorizontalPoint(line, point)) == null) {
            return null;
        }
        CursorData cursor_data = (line2 == null || (closestHorizontalPoint2 = PerformanceChartReadyComposable.getClosestHorizontalPoint(line2, point)) == null) ? null : closestHorizontalPoint2.getCursor_data();
        if (cursor_data == null) {
            return closestHorizontalPoint;
        }
        CursorData cursor_data2 = closestHorizontalPoint.getCursor_data();
        return Point.copy$default(closestHorizontalPoint, 0.0f, 0.0f, cursor_data2 != null ? CursorData.copy$default(cursor_data2, null, null, cursor_data.getSecondary_label(), null, null, null, cursor_data.getSecondary_value(), null, null, null, 955, null) : null, 3, null);
    }

    public static final TextStyle boldedForCursorData(TextStyle textStyle, Composer composer, int i) {
        composer.startReplaceGroup(731976263);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(731976263, i, -1, "com.robinhood.android.advisory.dashboard.overview.boldedForCursorData (CursorDataExtensions.kt:34)");
        }
        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textStyle == null ? ((Styles) composer.consume(Styles2.getLocalStyles())).getText(composer, 0).getStyle() : textStyle, 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textStyleM7655copyp1EtxEg$default;
    }

    public static final CursorData.SubDisplayText bolded(CursorData.SubDisplayText subDisplayText, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(subDisplayText, "<this>");
        composer.startReplaceGroup(687426104);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(687426104, i, -1, "com.robinhood.android.advisory.dashboard.overview.bolded (CursorDataExtensions.kt:40)");
        }
        CursorData.SubDisplayText subDisplayTextCopy$default = CursorData.SubDisplayText.copy$default(subDisplayText, CursorData.IconDisplayText.m11999copyiJQMabo$default(subDisplayText.getMain(), null, 0L, null, null, boldedForCursorData(subDisplayText.getMain().getStyle(), composer, 0), 15, null), null, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return subDisplayTextCopy$default;
    }

    public static final com.robinhood.android.charts.cursor.CursorData bolded(com.robinhood.android.charts.cursor.CursorData cursorData, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(cursorData, "<this>");
        composer.startReplaceGroup(-1052005928);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1052005928, i, -1, "com.robinhood.android.advisory.dashboard.overview.bolded (CursorDataExtensions.kt:49)");
        }
        CursorData.SubDisplayText secondaryValue = cursorData.getSecondaryValue();
        composer.startReplaceGroup(-1660378784);
        CursorData.SubDisplayText subDisplayTextBolded = secondaryValue == null ? null : bolded(secondaryValue, composer, CursorData.SubDisplayText.$stable);
        composer.endReplaceGroup();
        CursorData.SubDisplayText tertiaryValue = cursorData.getTertiaryValue();
        com.robinhood.android.charts.cursor.CursorData cursorDataCopy$default = com.robinhood.android.charts.cursor.CursorData.copy$default(cursorData, null, null, subDisplayTextBolded, tertiaryValue != null ? bolded(tertiaryValue, composer, CursorData.SubDisplayText.$stable) : null, null, null, 51, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cursorDataCopy$default;
    }
}
