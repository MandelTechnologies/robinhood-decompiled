package com.robinhood.android.investmentstracker.extensions;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import bff_money_movement.service.p019v1.AxisDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerColorStopDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentPerformanceGraphDataDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerGradientDataDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerPerformanceChartLineDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerRuleMarkDto;
import bff_money_movement.service.p019v1.Point2DDto;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.overlay.OverlayPosition;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.compose.color.LinearGradientColor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GraphExtensions.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00060\u0004\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00060\u0004\u001a\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u000e¨\u0006\u000f"}, m3636d2 = {"toGradientColor", "Lcom/robinhood/shared/compose/color/LinearGradientColor;", "Lbff_money_movement/service/v1/InvestmentsTrackerGradientDataDto;", "getHorizontalLines", "", "Lcom/robinhood/android/charts/segmented/SegmentedLine;", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMarkDto;", "getHorizontalOverlays", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/charts/overlay/ChartOverlay;", "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "getVerticalLines", "getLines", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphDataDto;", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.extensions.GraphExtensionsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GraphExtensions {
    public static final LinearGradientColor toGradientColor(InvestmentsTrackerGradientDataDto investmentsTrackerGradientDataDto) {
        Intrinsics.checkNotNullParameter(investmentsTrackerGradientDataDto, "<this>");
        float angle = (float) investmentsTrackerGradientDataDto.getAngle();
        List<InvestmentsTrackerColorStopDto> color_stops = investmentsTrackerGradientDataDto.getColor_stops();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(color_stops, 10));
        for (InvestmentsTrackerColorStopDto investmentsTrackerColorStopDto : color_stops) {
            arrayList.add(new Tuples2(Float.valueOf((float) investmentsTrackerColorStopDto.getStop()), Color.m6701boximpl(Color2.Color(android.graphics.Color.parseColor(investmentsTrackerColorStopDto.getColor())))));
        }
        return new LinearGradientColor(angle, arrayList);
    }

    public static final List<SegmentedLine> getHorizontalLines(List<InvestmentsTrackerRuleMarkDto> list) {
        long jM6716getBlack0d7_KjU;
        List<InvestmentsTrackerColorStopDto> color_stops;
        InvestmentsTrackerColorStopDto investmentsTrackerColorStopDto;
        String color;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList<InvestmentsTrackerRuleMarkDto> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InvestmentsTrackerRuleMarkDto) obj).getAxis() == AxisDto.f296Y) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (InvestmentsTrackerRuleMarkDto investmentsTrackerRuleMarkDto : arrayList) {
            if (investmentsTrackerRuleMarkDto.getGradient() == null) {
                throw new NullPointerException("Unexpected null gradient received for rule mark line " + investmentsTrackerRuleMarkDto);
            }
            List listListOf = CollectionsKt.listOf((Object[]) new Point[]{new Point(0.0f, (float) investmentsTrackerRuleMarkDto.getValue()), new Point(1.0f, (float) investmentsTrackerRuleMarkDto.getValue())});
            InvestmentsTrackerGradientDataDto gradient = investmentsTrackerRuleMarkDto.getGradient();
            if (gradient != null && (color_stops = gradient.getColor_stops()) != null && (investmentsTrackerColorStopDto = (InvestmentsTrackerColorStopDto) CollectionsKt.first((List) color_stops)) != null && (color = investmentsTrackerColorStopDto.getColor()) != null) {
                jM6716getBlack0d7_KjU = Color2.Color(android.graphics.Color.parseColor(color));
            } else {
                jM6716getBlack0d7_KjU = Color.INSTANCE.m6716getBlack0d7_KjU();
            }
            arrayList2.add(new SegmentedLine.Dotted(CollectionsKt.listOf(new SegmentedLine.Segment((List<Point>) listListOf, new SegmentedLine.Style.Dotted(jM6716getBlack0d7_KjU, 0.01f, null))), 0.01f, Float.valueOf(1.0f)));
        }
        return arrayList2;
    }

    public static final ImmutableList3<Overlays> getHorizontalOverlays(List<InvestmentsTrackerRuleMarkDto> list, final SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        ArrayList<InvestmentsTrackerRuleMarkDto> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InvestmentsTrackerRuleMarkDto) obj).getAxis() == AxisDto.f296Y) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (final InvestmentsTrackerRuleMarkDto investmentsTrackerRuleMarkDto : arrayList) {
            arrayList2.add(new Overlays(new OverlayPosition(new Point(((float) investmentsTrackerRuleMarkDto.getEnd()) - 0.03f, (float) investmentsTrackerRuleMarkDto.getValue()), OverlayPosition.HorizontalAlignment.RIGHT, OverlayPosition.VerticalAlignment.TOP), false, false, ComposableLambda3.composableLambdaInstance(-1398073662, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.extensions.GraphExtensionsKt$getHorizontalOverlays$2$1
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
                        ComposerKt.traceEventStart(-1398073662, i, -1, "com.robinhood.android.investmentstracker.extensions.getHorizontalOverlays.<anonymous>.<anonymous> (GraphExtensions.kt:97)");
                    }
                    String valueOrStars = securityFilter.getValueOrStars(investmentsTrackerRuleMarkDto.getLabel());
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(valueOrStars, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 6, null));
        }
        return extensions2.toPersistentList(arrayList2);
    }

    public static final List<SegmentedLine> getVerticalLines(List<InvestmentsTrackerRuleMarkDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList<InvestmentsTrackerRuleMarkDto> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InvestmentsTrackerRuleMarkDto) obj).getAxis() == AxisDto.f295X) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (InvestmentsTrackerRuleMarkDto investmentsTrackerRuleMarkDto : arrayList) {
            InvestmentsTrackerGradientDataDto gradient = investmentsTrackerRuleMarkDto.getGradient();
            if (gradient == null) {
                throw new NullPointerException("Unexpected null gradient received for rule mark line " + investmentsTrackerRuleMarkDto);
            }
            arrayList2.add(new SegmentedLine.Default(CollectionsKt.listOf(new SegmentedLine.Segment((List<Point>) CollectionsKt.listOf((Object[]) new Point[]{new Point((float) investmentsTrackerRuleMarkDto.getValue(), 0.0f), new Point((float) investmentsTrackerRuleMarkDto.getValue(), 1.0f)}), new SegmentedLine.Style.Solid(Color.INSTANCE.m6725getTransparent0d7_KjU(), toGradientColor(gradient), C2002Dp.m7995constructorimpl(1), StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), null))), null, 2, null));
        }
        return arrayList2;
    }

    public static final List<SegmentedLine> getLines(InvestmentsTrackerComponentPerformanceGraphDataDto investmentsTrackerComponentPerformanceGraphDataDto) {
        Intrinsics.checkNotNullParameter(investmentsTrackerComponentPerformanceGraphDataDto, "<this>");
        List<InvestmentsTrackerPerformanceChartLineDto> lines = investmentsTrackerComponentPerformanceGraphDataDto.getLines();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lines, 10));
        for (InvestmentsTrackerPerformanceChartLineDto investmentsTrackerPerformanceChartLineDto : lines) {
            List<Point2DDto> points = investmentsTrackerPerformanceChartLineDto.getPoints();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
            for (Point2DDto point2DDto : points) {
                arrayList2.add(new Point((float) point2DDto.getX(), (float) point2DDto.getY()));
            }
            arrayList.add(new SegmentedLine.Segment(arrayList2, new SegmentedLine.Style.Solid(Color2.Color(android.graphics.Color.parseColor(investmentsTrackerPerformanceChartLineDto.getColor())), null, C2002Dp.m7995constructorimpl(2), StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), 2, null)));
        }
        return CollectionsKt.listOf(new SegmentedLine.Default(arrayList, null, 2, null));
    }
}
