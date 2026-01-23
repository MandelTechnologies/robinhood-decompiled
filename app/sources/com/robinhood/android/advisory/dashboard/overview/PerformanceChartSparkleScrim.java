package com.robinhood.android.advisory.dashboard.overview;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Dot;
import com.robinhood.android.charts.model.Fill;
import com.robinhood.android.charts.model.Line;
import com.robinhood.android.charts.model.Point;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.shared.compose.color.LinearGradientColor;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PerformanceChartSparkleScrim.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"buildSparkleScrim", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "point", "Lcom/robinhood/android/charts/model/Point;", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "(Lcom/robinhood/android/charts/model/Point;Lcom/robinhood/models/serverdriven/experimental/api/Direction;Landroidx/compose/runtime/Composer;I)Lkotlinx/collections/immutable/ImmutableList;", "lib-advisory-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.PerformanceChartSparkleScrimKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PerformanceChartSparkleScrim {

    /* compiled from: PerformanceChartSparkleScrim.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.PerformanceChartSparkleScrimKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ImmutableList<ChartAnnotation> buildSparkleScrim(Point point, Direction direction, Composer composer, int i) {
        List listListOf;
        long jM21456getPositive0d7_KjU;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(direction, "direction");
        composer.startReplaceGroup(1934026225);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1934026225, i, -1, "com.robinhood.android.advisory.dashboard.overview.buildSparkleScrim (PerformanceChartSparkleScrim.kt:31)");
        }
        List listListOf2 = CollectionsKt.listOf((Object[]) new Point[]{new Point(point.getX(), -0.01f), new Point(point.getX(), 1.01f), new Point(1.0f, 1.01f), new Point(1.0f, -0.01f)});
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Fill.SolidFill solidFill = new Fill.SolidFill(listListOf2, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), 0.75f, fValueOf2, null);
        float fMo5016toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(36));
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[direction.ordinal()];
        if (i3 == 1) {
            composer.startReplaceGroup(-1121606462);
            listListOf = bentoTheme.getColors(composer, i2).getIsDay() ? CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color2.Color(855689221))), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color2.Color(12842300)))}) : CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color2.Color(869136944))), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color2.Color(7967772)))});
            composer.endReplaceGroup();
        } else {
            if (i3 != 2) {
                composer.startReplaceGroup(-1121607744);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1121593374);
            listListOf = bentoTheme.getColors(composer, i2).getIsDay() ? CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color2.Color(2297473701L))), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color2.Color(16777215)))}) : CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color2.Color(872370176))), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color2.Color(16777215)))});
            composer.endReplaceGroup();
        }
        Fill.RadialGradientFill radialGradientFill = new Fill.RadialGradientFill(point, fMo5016toPx0680j_4, listListOf, 16, Float.valueOf(2.0f));
        Line line = new Line(CollectionsKt.listOf((Object[]) new Point[]{Point.copy$default(point, 0.0f, 0.0f, 1, null), Point.copy$default(point, 0.0f, 1.0f, 1, null)}), ((Styles) composer.consume(Styles2.getLocalStyles())).getChart(composer, 0).m21727getScrubLineColor0d7_KjU(), new LinearGradientColor(0.0f, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(Float.valueOf(-0.5f), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU())), Tuples4.m3642to(Float.valueOf(point.getY() - 0.5f), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU())), Tuples4.m3642to(Float.valueOf(point.getY()), Color.m6701boximpl(((Styles) composer.consume(Styles2.getLocalStyles())).getChart(composer, 0).m21727getScrubLineColor0d7_KjU())), Tuples4.m3642to(Float.valueOf(point.getY() + 0.5f), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU())), Tuples4.m3642to(Float.valueOf(1.5f), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU()))})), new Stroke(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1)), 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), StrokeJoin.INSTANCE.m6857getRoundLxFBmk8(), null, 18, null), null, fValueOf, 16, null);
        float fMo5016toPx0680j_42 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(4));
        int i4 = iArr[direction.ordinal()];
        if (i4 == 1) {
            composer.startReplaceGroup(-408133690);
            jM21456getPositive0d7_KjU = bentoTheme.getColors(composer, i2).getIsDay() ? bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU() : BentoColor.INSTANCE.m21137getBlackWidowNewTennis0d7_KjU();
            composer.endReplaceGroup();
        } else {
            if (i4 != 2) {
                composer.startReplaceGroup(-1121545885);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1121537095);
            jM21456getPositive0d7_KjU = bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        }
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(solidFill, radialGradientFill, line, new Dot(point, fMo5016toPx0680j_42, jM21456getPositive0d7_KjU, Float.valueOf(3.0f), null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return immutableList3PersistentListOf;
    }
}
