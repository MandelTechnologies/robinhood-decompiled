package com.robinhood.android.advisory.projection.chart;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Point;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChartComponents.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00018Bk\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\"\u001a\u00020#*\u00020$H\u0017¢\u0006\u0002\u0010%J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010)\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010\u0018J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J|\u0010/\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u000fHÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/chart/PianoKeysAnnotation;", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "percentile5Points", "", "Lcom/robinhood/android/charts/model/Point;", "percentile95Points", "medianPoints", "gap", "Landroidx/compose/ui/unit/Dp;", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "isDay", "", "selectedBarIndex", "", "drawLayer", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;FLandroidx/compose/animation/core/AnimationSpec;ZILjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPercentile5Points", "()Ljava/util/List;", "getPercentile95Points", "getMedianPoints", "getGap-D9Ej5fM", "()F", "F", "getLineRevealAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "()Z", "getSelectedBarIndex", "()I", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component3", "component4", "component4-D9Ej5fM", "component5", "component6", "component7", "component8", "copy", "copy-hGBTI10", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;FLandroidx/compose/animation/core/AnimationSpec;ZILjava/lang/Float;)Lcom/robinhood/android/advisory/projection/chart/PianoKeysAnnotation;", "equals", "other", "", "hashCode", "toString", "", "BarState", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class PianoKeysAnnotation implements ChartAnnotation {
    public static final int $stable = 8;
    private final Float drawLayer;
    private final float gap;
    private final boolean isDay;
    private final AnimationSpec<Float> lineRevealAnimationSpec;
    private final List<Point> medianPoints;
    private final List<Point> percentile5Points;
    private final List<Point> percentile95Points;
    private final int selectedBarIndex;

    public /* synthetic */ PianoKeysAnnotation(List list, List list2, List list3, float f, AnimationSpec animationSpec, boolean z, int i, Float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, f, animationSpec, z, i, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$9(PianoKeysAnnotation pianoKeysAnnotation, BoxScope boxScope, int i, Composer composer, int i2) {
        pianoKeysAnnotation.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: copy-hGBTI10$default, reason: not valid java name */
    public static /* synthetic */ PianoKeysAnnotation m11222copyhGBTI10$default(PianoKeysAnnotation pianoKeysAnnotation, List list, List list2, List list3, float f, AnimationSpec animationSpec, boolean z, int i, Float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = pianoKeysAnnotation.percentile5Points;
        }
        if ((i2 & 2) != 0) {
            list2 = pianoKeysAnnotation.percentile95Points;
        }
        if ((i2 & 4) != 0) {
            list3 = pianoKeysAnnotation.medianPoints;
        }
        if ((i2 & 8) != 0) {
            f = pianoKeysAnnotation.gap;
        }
        if ((i2 & 16) != 0) {
            animationSpec = pianoKeysAnnotation.lineRevealAnimationSpec;
        }
        if ((i2 & 32) != 0) {
            z = pianoKeysAnnotation.isDay;
        }
        if ((i2 & 64) != 0) {
            i = pianoKeysAnnotation.selectedBarIndex;
        }
        if ((i2 & 128) != 0) {
            f2 = pianoKeysAnnotation.drawLayer;
        }
        int i3 = i;
        Float f3 = f2;
        AnimationSpec animationSpec2 = animationSpec;
        boolean z2 = z;
        return pianoKeysAnnotation.m11224copyhGBTI10(list, list2, list3, f, animationSpec2, z2, i3, f3);
    }

    public final List<Point> component1() {
        return this.percentile5Points;
    }

    public final List<Point> component2() {
        return this.percentile95Points;
    }

    public final List<Point> component3() {
        return this.medianPoints;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getGap() {
        return this.gap;
    }

    public final AnimationSpec<Float> component5() {
        return this.lineRevealAnimationSpec;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsDay() {
        return this.isDay;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSelectedBarIndex() {
        return this.selectedBarIndex;
    }

    /* renamed from: component8, reason: from getter */
    public final Float getDrawLayer() {
        return this.drawLayer;
    }

    /* renamed from: copy-hGBTI10, reason: not valid java name */
    public final PianoKeysAnnotation m11224copyhGBTI10(List<Point> percentile5Points, List<Point> percentile95Points, List<Point> medianPoints, float gap, AnimationSpec<Float> lineRevealAnimationSpec, boolean isDay, int selectedBarIndex, Float drawLayer) {
        Intrinsics.checkNotNullParameter(percentile5Points, "percentile5Points");
        Intrinsics.checkNotNullParameter(percentile95Points, "percentile95Points");
        Intrinsics.checkNotNullParameter(medianPoints, "medianPoints");
        return new PianoKeysAnnotation(percentile5Points, percentile95Points, medianPoints, gap, lineRevealAnimationSpec, isDay, selectedBarIndex, drawLayer, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PianoKeysAnnotation)) {
            return false;
        }
        PianoKeysAnnotation pianoKeysAnnotation = (PianoKeysAnnotation) other;
        return Intrinsics.areEqual(this.percentile5Points, pianoKeysAnnotation.percentile5Points) && Intrinsics.areEqual(this.percentile95Points, pianoKeysAnnotation.percentile95Points) && Intrinsics.areEqual(this.medianPoints, pianoKeysAnnotation.medianPoints) && C2002Dp.m7997equalsimpl0(this.gap, pianoKeysAnnotation.gap) && Intrinsics.areEqual(this.lineRevealAnimationSpec, pianoKeysAnnotation.lineRevealAnimationSpec) && this.isDay == pianoKeysAnnotation.isDay && this.selectedBarIndex == pianoKeysAnnotation.selectedBarIndex && Intrinsics.areEqual((Object) this.drawLayer, (Object) pianoKeysAnnotation.drawLayer);
    }

    public int hashCode() {
        int iHashCode = ((((((this.percentile5Points.hashCode() * 31) + this.percentile95Points.hashCode()) * 31) + this.medianPoints.hashCode()) * 31) + C2002Dp.m7998hashCodeimpl(this.gap)) * 31;
        AnimationSpec<Float> animationSpec = this.lineRevealAnimationSpec;
        int iHashCode2 = (((((iHashCode + (animationSpec == null ? 0 : animationSpec.hashCode())) * 31) + Boolean.hashCode(this.isDay)) * 31) + Integer.hashCode(this.selectedBarIndex)) * 31;
        Float f = this.drawLayer;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        return "PianoKeysAnnotation(percentile5Points=" + this.percentile5Points + ", percentile95Points=" + this.percentile95Points + ", medianPoints=" + this.medianPoints + ", gap=" + C2002Dp.m7999toStringimpl(this.gap) + ", lineRevealAnimationSpec=" + this.lineRevealAnimationSpec + ", isDay=" + this.isDay + ", selectedBarIndex=" + this.selectedBarIndex + ", drawLayer=" + this.drawLayer + ")";
    }

    public /* synthetic */ PianoKeysAnnotation(List list, List list2, List list3, float f, AnimationSpec animationSpec, boolean z, int i, Float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i2 & 8) != 0 ? C2002Dp.m7995constructorimpl(2) : f, (i2 & 16) != 0 ? null : animationSpec, (i2 & 32) != 0 ? true : z, i, (i2 & 128) != 0 ? null : f2, null);
    }

    private PianoKeysAnnotation(List<Point> percentile5Points, List<Point> percentile95Points, List<Point> medianPoints, float f, AnimationSpec<Float> animationSpec, boolean z, int i, Float f2) {
        Intrinsics.checkNotNullParameter(percentile5Points, "percentile5Points");
        Intrinsics.checkNotNullParameter(percentile95Points, "percentile95Points");
        Intrinsics.checkNotNullParameter(medianPoints, "medianPoints");
        this.percentile5Points = percentile5Points;
        this.percentile95Points = percentile95Points;
        this.medianPoints = medianPoints;
        this.gap = f;
        this.lineRevealAnimationSpec = animationSpec;
        this.isDay = z;
        this.selectedBarIndex = i;
        this.drawLayer = f2;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
        ChartAnnotation.DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
    }

    public final List<Point> getPercentile5Points() {
        return this.percentile5Points;
    }

    public final List<Point> getPercentile95Points() {
        return this.percentile95Points;
    }

    public final List<Point> getMedianPoints() {
        return this.medianPoints;
    }

    /* renamed from: getGap-D9Ej5fM, reason: not valid java name */
    public final float m11225getGapD9Ej5fM() {
        return this.gap;
    }

    public final AnimationSpec<Float> getLineRevealAnimationSpec() {
        return this.lineRevealAnimationSpec;
    }

    public final boolean isDay() {
        return this.isDay;
    }

    public final int getSelectedBarIndex() {
        return this.selectedBarIndex;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public Float getDrawLayer() {
        return this.drawLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChartComponents.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/chart/PianoKeysAnnotation$BarState;", "", "verticalAnim", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "started", "", "<init>", "(Landroidx/compose/animation/core/Animatable;Z)V", "getVerticalAnim", "()Landroidx/compose/animation/core/Animatable;", "getStarted", "()Z", "setStarted", "(Z)V", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class BarState {
        private boolean started;
        private final Animatable<Float, AnimationVectors2> verticalAnim;

        public BarState(Animatable<Float, AnimationVectors2> verticalAnim, boolean z) {
            Intrinsics.checkNotNullParameter(verticalAnim, "verticalAnim");
            this.verticalAnim = verticalAnim;
            this.started = z;
        }

        public final Animatable<Float, AnimationVectors2> getVerticalAnim() {
            return this.verticalAnim;
        }

        public final boolean getStarted() {
            return this.started;
        }

        public final void setStarted(boolean z) {
            this.started = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    @Override // com.robinhood.android.charts.model.ChartAnnotation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Content(final BoxScope boxScope, Composer composer, final int i) {
        final int i2;
        final List list;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1962979364);
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1962979364, i3, -1, "com.robinhood.android.advisory.projection.chart.PianoKeysAnnotation.Content (ChartComponents.kt:136)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (this.lineRevealAnimationSpec != null) {
                composerStartRestartGroup.startReplaceGroup(-1156314348);
                List<Point> list2 = this.medianPoints;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new PianoKeysAnnotation$Content$1$1(animatable, this, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(list2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1156172616);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new PianoKeysAnnotation$Content$2$1(animatable, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            final float fFloatValue = ((Number) animatable.getValue()).floatValue();
            int iMin = Math.min(this.percentile5Points.size(), Math.min(this.percentile95Points.size(), this.medianPoints.size()));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(iMin);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                Object obj = objRememberedValue4;
                if (objRememberedValue4 == companion.getEmpty()) {
                    ArrayList arrayList = new ArrayList(iMin);
                    for (int i4 = 0; i4 < iMin; i4++) {
                        arrayList.add(new BarState(Animatable2.Animatable$default(0.0f, 0.0f, 2, null), false));
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                List list3 = (List) obj;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(iMin) | composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(list3);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    i2 = iMin;
                    list = list3;
                    PianoKeysAnnotation$Content$3$1 pianoKeysAnnotation$Content$3$1 = new PianoKeysAnnotation$Content$3$1(animatable, i2, this, list, null);
                    composerStartRestartGroup.updateRememberedValue(pianoKeysAnnotation$Content$3$1);
                    objRememberedValue5 = pianoKeysAnnotation$Content$3$1;
                } else {
                    i2 = iMin;
                    list = list3;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(list, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                long lightShadowColor = this.isDay ? AdvisoryChartColorPalette.getLightShadowColor() : AdvisoryChartColorPalette.getDarkShadowColor();
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(i2) | composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changed(lightShadowColor);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    final long j = lightShadowColor;
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.PianoKeysAnnotation$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PianoKeysAnnotation.Content$lambda$8$lambda$7(this.f$0, i2, fFloatValue, list, j, (DrawScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue6 = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierMatchParentSize, (Function1) objRememberedValue6, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.chart.PianoKeysAnnotation$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PianoKeysAnnotation.Content$lambda$9(this.f$0, boxScope, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$8$lambda$7(PianoKeysAnnotation pianoKeysAnnotation, int i, float f, List list, long j, DrawScope drawScope) throws Throwable {
        DrawContext drawContext;
        long j2;
        DrawContext drawContext2;
        long j3;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        Brush brushM6682verticalGradient8A3gB4$default;
        float f9;
        int i3;
        PianoKeysAnnotation pianoKeysAnnotation2 = pianoKeysAnnotation;
        int i4 = i;
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        char c = ' ';
        float fIntBitsToFloat = i4 > 0 ? (Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) - ((i4 - 1) * Canvas.mo5016toPx0680j_4(pianoKeysAnnotation2.gap))) / i4 : 0.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) * f;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        int iM6700getIntersectrtfAjoo = ClipOp.INSTANCE.m6700getIntersectrtfAjoo();
        DrawContext drawContext3 = Canvas.getDrawContext();
        long jMo6936getSizeNHjbRc = drawContext3.mo6936getSizeNHjbRc();
        drawContext3.getCanvas().save();
        try {
            drawContext3.getTransform().mo6939clipRectN_I0leg(0.0f, 0.0f, fIntBitsToFloat2, fIntBitsToFloat3, iM6700getIntersectrtfAjoo);
            int i5 = 0;
            while (i5 < i4) {
                try {
                    Point point = pianoKeysAnnotation2.percentile5Points.get(i5);
                    Point point2 = pianoKeysAnnotation2.percentile95Points.get(i5);
                    Point point3 = pianoKeysAnnotation2.medianPoints.get(i5);
                    char c2 = c;
                    float x = (point3.getX() * Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> c2))) - (fIntBitsToFloat / 2);
                    float f10 = x + fIntBitsToFloat;
                    float fMin = Math.min(point.getY(), 0.95f);
                    float fMin2 = Math.min(point2.getY(), 1.0f);
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) * (1.0f - fMin);
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) * (1.0f - fMin2);
                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) * (1.0f - point3.getY());
                    float fFloatValue = ((BarState) list.get(i5)).getVerticalAnim().getValue().floatValue();
                    float f11 = fIntBitsToFloat6 + ((fIntBitsToFloat5 - fIntBitsToFloat6) * fFloatValue);
                    float f12 = fIntBitsToFloat6 + (fFloatValue * (fIntBitsToFloat4 - fIntBitsToFloat6));
                    if (i5 == pianoKeysAnnotation2.selectedBarIndex && f == 1.0f) {
                        Rect rect = new Rect(x, 0.0f, f10, Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)));
                        float f13 = fIntBitsToFloat;
                        SolidColor solidColor = new SolidColor(pianoKeysAnnotation2.isDay ? AdvisoryChartColorPalette.getLightHighlightBackground() : AdvisoryChartColorPalette.getDarkHighlightBackground(), null);
                        drawContext = drawContext3;
                        try {
                            drawContext2 = drawContext;
                            f2 = f13;
                            f4 = x;
                            j3 = jMo6936getSizeNHjbRc;
                            f5 = f11;
                            f6 = f12;
                            i2 = i5;
                            f3 = 1.0f;
                        } catch (Throwable th) {
                            th = th;
                            j3 = jMo6936getSizeNHjbRc;
                            j2 = j3;
                            drawContext.getCanvas().restore();
                            drawContext.mo6937setSizeuvyYCjk(j2);
                            throw th;
                        }
                        try {
                            DrawScope.m6957drawRectAsUm42w$default(Canvas, solidColor, rect.m6560getTopLeftF1C5BW0(), rect.m6559getSizeNHjbRc(), 0.0f, null, null, 0, 120, null);
                        } catch (Throwable th2) {
                            th = th2;
                            drawContext = drawContext2;
                            j2 = j3;
                            drawContext.getCanvas().restore();
                            drawContext.mo6937setSizeuvyYCjk(j2);
                            throw th;
                        }
                    } else {
                        f2 = fIntBitsToFloat;
                        drawContext2 = drawContext3;
                        i2 = i5;
                        f3 = 1.0f;
                        j3 = jMo6936getSizeNHjbRc;
                        f4 = x;
                        f5 = f11;
                        f6 = f12;
                    }
                    Rect rect2 = new Rect(f4, f5, f10, f6);
                    int i6 = i2;
                    if (i6 != pianoKeysAnnotation.selectedBarIndex || f != f3) {
                        f7 = f6;
                        f8 = f5;
                        if (pianoKeysAnnotation.isDay) {
                            brushM6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(AdvisoryChartColorPalette.getLightBarTop()), Color.m6701boximpl(AdvisoryChartColorPalette.getLightBarMiddle()), Color.m6701boximpl(AdvisoryChartColorPalette.getLightBarBottom())}), f8, f7, 0, 8, (Object) null);
                        } else {
                            brushM6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(AdvisoryChartColorPalette.getDarkBarTop()), Color.m6701boximpl(AdvisoryChartColorPalette.getDarkBarMiddle()), Color.m6701boximpl(AdvisoryChartColorPalette.getDarkBarBottom())}), f8, f7, 0, 8, (Object) null);
                            f9 = f7;
                            i3 = i6;
                            DrawScope.m6957drawRectAsUm42w$default(drawScope, brushM6682verticalGradient8A3gB4$default, rect2.m6560getTopLeftF1C5BW0(), rect2.m6559getSizeNHjbRc(), 0.0f, null, null, 0, 120, null);
                            float fMo5016toPx0680j_4 = drawScope.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(3));
                            float fCoerceAtMost = RangesKt.coerceAtMost(fMo5016toPx0680j_4, f9 - f8);
                            Brush.Companion companion = Brush.INSTANCE;
                            Color colorM6701boximpl = Color.m6701boximpl(j);
                            Color.Companion companion2 = Color.INSTANCE;
                            float f14 = f8;
                            DrawScope.m6957drawRectAsUm42w$default(drawScope, Brush.Companion.m6682verticalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, Color.m6701boximpl(companion2.m6725getTransparent0d7_KjU())}), f8, f8 + fCoerceAtMost, 0, 8, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(f4) << c2) | (Float.floatToRawIntBits(f14) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << c2) | (Float.floatToRawIntBits(fCoerceAtMost) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                            DrawScope.m6957drawRectAsUm42w$default(drawScope, Brush.Companion.m6682verticalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion2.m6725getTransparent0d7_KjU()), Color.m6701boximpl(j)}), f9 - fCoerceAtMost, f9, 0, 8, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(f4) << c2) | (Float.floatToRawIntBits(r30) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << c2) | (Float.floatToRawIntBits(fCoerceAtMost) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                            float f15 = f2;
                            float f16 = f4;
                            DrawScope.m6957drawRectAsUm42w$default(drawScope, Brush.Companion.m6676horizontalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(j), Color.m6701boximpl(companion2.m6725getTransparent0d7_KjU())}), f16, f4 + RangesKt.coerceAtMost(fMo5016toPx0680j_4, f15), 0, 8, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(f16) << c2) | (Float.floatToRawIntBits(f14) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(r2) << c2) | (Float.floatToRawIntBits(r3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                            float fCoerceAtMost2 = RangesKt.coerceAtMost(fMo5016toPx0680j_4, f15);
                            float f17 = f10 - fCoerceAtMost2;
                            DrawScope.m6957drawRectAsUm42w$default(drawScope, Brush.Companion.m6676horizontalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion2.m6725getTransparent0d7_KjU()), Color.m6701boximpl(j)}), f17, f17 + fCoerceAtMost2, 0, 8, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(f17) << c2) | (Float.floatToRawIntBits(f14) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(fCoerceAtMost2) << c2) | (Float.floatToRawIntBits(r3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                            i5 = i3 + 1;
                            pianoKeysAnnotation2 = pianoKeysAnnotation;
                            Canvas = drawScope;
                            fIntBitsToFloat = f15;
                            drawContext3 = drawContext2;
                            c = c2;
                            jMo6936getSizeNHjbRc = j3;
                            i4 = i;
                        }
                    } else if (pianoKeysAnnotation.isDay) {
                        f7 = f6;
                        f8 = f5;
                        brushM6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(AdvisoryChartColorPalette.getLightHighlightTop()), Color.m6701boximpl(AdvisoryChartColorPalette.getLightHighlightBottom())}), f8, f7, 0, 8, (Object) null);
                    } else {
                        f7 = f6;
                        f8 = f5;
                        brushM6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(AdvisoryChartColorPalette.getDarkHighlightTop()), Color.m6701boximpl(AdvisoryChartColorPalette.getDarkHighlightBottom())}), f8, f7, 0, 8, (Object) null);
                    }
                    i3 = i6;
                    f9 = f7;
                    DrawScope.m6957drawRectAsUm42w$default(drawScope, brushM6682verticalGradient8A3gB4$default, rect2.m6560getTopLeftF1C5BW0(), rect2.m6559getSizeNHjbRc(), 0.0f, null, null, 0, 120, null);
                    float fMo5016toPx0680j_42 = drawScope.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(3));
                    float fCoerceAtMost3 = RangesKt.coerceAtMost(fMo5016toPx0680j_42, f9 - f8);
                    Brush.Companion companion3 = Brush.INSTANCE;
                    Color colorM6701boximpl2 = Color.m6701boximpl(j);
                    Color.Companion companion22 = Color.INSTANCE;
                    float f142 = f8;
                    DrawScope.m6957drawRectAsUm42w$default(drawScope, Brush.Companion.m6682verticalGradient8A3gB4$default(companion3, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl2, Color.m6701boximpl(companion22.m6725getTransparent0d7_KjU())}), f8, f8 + fCoerceAtMost3, 0, 8, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(f4) << c2) | (Float.floatToRawIntBits(f142) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << c2) | (Float.floatToRawIntBits(fCoerceAtMost3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                    DrawScope.m6957drawRectAsUm42w$default(drawScope, Brush.Companion.m6682verticalGradient8A3gB4$default(companion3, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion22.m6725getTransparent0d7_KjU()), Color.m6701boximpl(j)}), f9 - fCoerceAtMost3, f9, 0, 8, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(f4) << c2) | (Float.floatToRawIntBits(r30) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << c2) | (Float.floatToRawIntBits(fCoerceAtMost3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                    float f152 = f2;
                    float f162 = f4;
                    DrawScope.m6957drawRectAsUm42w$default(drawScope, Brush.Companion.m6676horizontalGradient8A3gB4$default(companion3, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(j), Color.m6701boximpl(companion22.m6725getTransparent0d7_KjU())}), f162, f4 + RangesKt.coerceAtMost(fMo5016toPx0680j_42, f152), 0, 8, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(f162) << c2) | (Float.floatToRawIntBits(f142) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(r2) << c2) | (Float.floatToRawIntBits(r3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                    float fCoerceAtMost22 = RangesKt.coerceAtMost(fMo5016toPx0680j_42, f152);
                    float f172 = f10 - fCoerceAtMost22;
                    DrawScope.m6957drawRectAsUm42w$default(drawScope, Brush.Companion.m6676horizontalGradient8A3gB4$default(companion3, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion22.m6725getTransparent0d7_KjU()), Color.m6701boximpl(j)}), f172, f172 + fCoerceAtMost22, 0, 8, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(f172) << c2) | (Float.floatToRawIntBits(f142) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(fCoerceAtMost22) << c2) | (Float.floatToRawIntBits(r3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                    i5 = i3 + 1;
                    pianoKeysAnnotation2 = pianoKeysAnnotation;
                    Canvas = drawScope;
                    fIntBitsToFloat = f152;
                    drawContext3 = drawContext2;
                    c = c2;
                    jMo6936getSizeNHjbRc = j3;
                    i4 = i;
                } catch (Throwable th3) {
                    th = th3;
                    drawContext2 = drawContext3;
                    j3 = jMo6936getSizeNHjbRc;
                }
            }
            DrawContext drawContext4 = drawContext3;
            drawContext4.getCanvas().restore();
            drawContext4.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            th = th4;
            drawContext = drawContext3;
            j2 = jMo6936getSizeNHjbRc;
        }
    }
}
