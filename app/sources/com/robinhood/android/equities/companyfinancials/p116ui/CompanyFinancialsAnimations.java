package com.robinhood.android.equities.companyfinancials.p116ui;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors3;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.robinhood.utils.p409ui.animation.Animators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.ChartFillDto;
import rh_server_driven_ui.p531v1.ChartFillStyleDto;
import rh_server_driven_ui.p531v1.CornerDto;
import rh_server_driven_ui.p531v1.CornerRadiusInfoDto;
import rh_server_driven_ui.p531v1.DotChartFillStyleDto;
import rh_server_driven_ui.p531v1.PointDto;
import rh_server_driven_ui.p531v1.RoundedSolidChartFillStyleDto;

/* compiled from: CompanyFinancialsAnimations.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u0002\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000f\u001a3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0015\u001a?\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0003¢\u0006\u0002\u0010\u001c\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001d²\u0006\u0010\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"PointDtoTwoWayConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Lrh_server_driven_ui/v1/PointDto;", "Landroidx/compose/animation/core/AnimationVector2D;", "getPointDtoTwoWayConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "animatable", "Landroidx/compose/animation/core/Animatable;", "animateSduiDotFillList", "Lkotlinx/collections/immutable/ImmutableList;", "Lrh_server_driven_ui/v1/ChartFillDto;", "targetDots", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;I)Lkotlinx/collections/immutable/ImmutableList;", "animateSduiBarFillList", "targetFills", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Lkotlinx/collections/immutable/ImmutableList;", "animateSduiBarFill", "targetFill", "(Lrh_server_driven_ui/v1/ChartFillDto;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;I)Lrh_server_driven_ui/v1/ChartFillDto;", "animateBarFillAsState", "Landroidx/compose/runtime/State;", "", "targetPoints", "hasAllRoundedCorners", "", "(Lkotlinx/collections/immutable/ImmutableList;ZLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "lib-company-financials_externalDebug", "animatedPoints"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CompanyFinancialsAnimations {
    private static final TwoWayConverter<PointDto, AnimationVectors3> PointDtoTwoWayConverter = VectorConvertersKt.TwoWayConverter(new Function1() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return CompanyFinancialsAnimations.PointDtoTwoWayConverter$lambda$0((PointDto) obj);
        }
    }, new Function1() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return CompanyFinancialsAnimations.PointDtoTwoWayConverter$lambda$1((AnimationVectors3) obj);
        }
    });

    public static final TwoWayConverter<PointDto, AnimationVectors3> getPointDtoTwoWayConverter() {
        return PointDtoTwoWayConverter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVectors3 PointDtoTwoWayConverter$lambda$0(PointDto point) {
        Intrinsics.checkNotNullParameter(point, "point");
        return new AnimationVectors3(point.getX(), point.getY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PointDto PointDtoTwoWayConverter$lambda$1(AnimationVectors3 vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return new PointDto(vector.getV1(), vector.getV2(), null, 4, null);
    }

    public static final Animatable<PointDto, AnimationVectors3> animatable(PointDto pointDto) {
        Intrinsics.checkNotNullParameter(pointDto, "<this>");
        return new Animatable<>(pointDto, PointDtoTwoWayConverter, null, null, 12, null);
    }

    public static final ImmutableList<ChartFillDto> animateSduiBarFillList(ImmutableList<ChartFillDto> targetFills, AnimationSpec<PointDto> animationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(targetFills, "targetFills");
        composer.startReplaceGroup(747026467);
        if ((i2 & 2) != 0) {
            animationSpec = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(747026467, i, -1, "com.robinhood.android.equities.companyfinancials.ui.animateSduiBarFillList (CompanyFinancialsAnimations.kt:84)");
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(targetFills, 10));
        Iterator<ChartFillDto> it = targetFills.iterator();
        while (it.hasNext()) {
            arrayList.add(animateSduiBarFill(it.next(), animationSpec, composer, i & 112));
        }
        ImmutableList<ChartFillDto> immutableList = extensions2.toImmutableList(arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return immutableList;
    }

    private static final List<PointDto> animateSduiBarFill$lambda$8(SnapshotState4<? extends List<PointDto>> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final ChartFillDto animateSduiBarFill(ChartFillDto targetFill, AnimationSpec<PointDto> animationSpec, Composer composer, int i) {
        RoundedSolidChartFillStyleDto rounded_solid_color;
        CornerRadiusInfoDto corner_radius_info;
        List<CornerDto> rounded_corners;
        Intrinsics.checkNotNullParameter(targetFill, "targetFill");
        composer.startReplaceGroup(582989457);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(582989457, i, -1, "com.robinhood.android.equities.companyfinancials.ui.animateSduiBarFill (CompanyFinancialsAnimations.kt:94)");
        }
        ImmutableList immutableList = extensions2.toImmutableList(targetFill.getPoints());
        if (immutableList.size() != 4) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return targetFill;
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CompanyFinancialsAnimations.animateSduiBarFill$lambda$7$lambda$6((PointDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        String strJoinToString$default = CollectionsKt.joinToString$default(immutableList, null, null, null, 0, null, (Function1) objRememberedValue, 31, null);
        ChartFillStyleDto style = targetFill.getStyle();
        boolean z = false;
        if (style != null && (rounded_solid_color = style.getRounded_solid_color()) != null && (corner_radius_info = rounded_solid_color.getCorner_radius_info()) != null && (rounded_corners = corner_radius_info.getRounded_corners()) != null && rounded_corners.size() == 4) {
            z = true;
        }
        composer.startMovableGroup(1907136514, strJoinToString$default);
        ChartFillDto chartFillDtoCopy$default = ChartFillDto.copy$default(targetFill, null, null, animateSduiBarFill$lambda$8(animateBarFillAsState(immutableList, z, animationSpec, composer, (i << 3) & 896)), null, 11, null);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return chartFillDtoCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence animateSduiBarFill$lambda$7$lambda$6(PointDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getX() + "," + it.getY();
    }

    private static final SnapshotState4<List<PointDto>> animateBarFillAsState(ImmutableList<PointDto> immutableList, boolean z, AnimationSpec<PointDto> animationSpec, Composer composer, int i) {
        Object objMutableStateListOf;
        composer.startReplaceGroup(1560400688);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1560400688, i, -1, "com.robinhood.android.equities.companyfinancials.ui.animateBarFillAsState (CompanyFinancialsAnimations.kt:121)");
        }
        AnimationSpec<PointDto> animationSpecSnap$default = (!Animators.INSTANCE.animationsEnabled((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())) || animationSpec == null) ? AnimationSpecKt.snap$default(0, 1, null) : animationSpec;
        PointDto pointDto = immutableList.get(0);
        PointDto pointDto2 = immutableList.get(1);
        PointDto pointDto3 = immutableList.get(2);
        PointDto pointDto4 = immutableList.get(3);
        float y = (pointDto4.getY() + pointDto3.getY()) / 2.0f;
        float y2 = (pointDto.getY() + pointDto4.getY()) / 2.0f;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(immutableList);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (z) {
                objMutableStateListOf = SnapshotStateKt.mutableStateListOf(animatable(new PointDto(pointDto.getX(), y2, null, 4, null)), animatable(new PointDto(pointDto2.getX(), y2, null, 4, null)), animatable(new PointDto(pointDto3.getX(), y2, null, 4, null)), animatable(new PointDto(pointDto4.getX(), y2, null, 4, null)));
            } else {
                objMutableStateListOf = SnapshotStateKt.mutableStateListOf(animatable(new PointDto(pointDto.getX(), y, null, 4, null)), animatable(new PointDto(pointDto2.getX(), y, null, 4, null)), animatable(pointDto3), animatable(pointDto4));
            }
            objRememberedValue = objMutableStateListOf;
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsAnimationsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CompanyFinancialsAnimations.animateBarFillAsState$lambda$12$lambda$11(snapshotStateList);
                }
            });
            composer.updateRememberedValue(objRememberedValue2);
        }
        SnapshotState4<List<PointDto>> snapshotState4 = (SnapshotState4) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean zChanged2 = ((((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32) | composer.changed(snapshotStateList) | composer.changedInstance(pointDto) | composer.changedInstance(animationSpecSnap$default) | composer.changedInstance(pointDto2) | composer.changedInstance(pointDto3) | composer.changedInstance(pointDto4);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            Object companyFinancialsAnimations2 = new CompanyFinancialsAnimations2(z, snapshotStateList, pointDto, animationSpecSnap$default, pointDto2, pointDto3, pointDto4, null);
            composer.updateRememberedValue(companyFinancialsAnimations2);
            objRememberedValue3 = companyFinancialsAnimations2;
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(immutableList, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4;
    }

    public static final ImmutableList<ChartFillDto> animateSduiDotFillList(ImmutableList<ChartFillDto> targetDots, AnimationSpec<Float> animationSpec, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(targetDots, "targetDots");
        composer.startReplaceGroup(1143605977);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1143605977, i, -1, "com.robinhood.android.equities.companyfinancials.ui.animateSduiDotFillList (CompanyFinancialsAnimations.kt:36)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = Animatable2.Animatable$default(1.0f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        Animatable animatable = (Animatable) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(animationSpec) | composer.changedInstance(animatable);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new CompanyFinancialsAnimations3(animationSpec, animatable, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(animationSpec, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, (i >> 3) & 14);
        int size = targetDots.size() / 2;
        int iCoerceIn = RangesKt.coerceIn((int) (((Number) animatable.getValue()).floatValue() * size), 0, size);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(targetDots, 10));
        int i2 = 0;
        for (ChartFillDto chartFillDto : targetDots) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ChartFillDto chartFillDtoCopy$default = chartFillDto;
            ChartFillStyleDto style = chartFillDtoCopy$default.getStyle();
            if (style != null) {
                ChartFillStyleDto.StyleDetailsDto style_details = style.getStyle_details();
                ChartFillStyleDto.StyleDetailsDto.Dot dot = style_details instanceof ChartFillStyleDto.StyleDetailsDto.Dot ? (ChartFillStyleDto.StyleDetailsDto.Dot) style_details : null;
                if (dot != null) {
                    boolean z = true;
                    if (i2 >= size ? i2 - size >= iCoerceIn : i2 >= iCoerceIn) {
                        z = false;
                    }
                    chartFillDtoCopy$default = ChartFillDto.copy$default(chartFillDtoCopy$default, null, style.copy(dot.copy(DotChartFillStyleDto.copy$default(dot.getValue(), null, 0.0f, z ? 1.0f : 0.0f, 3, null))), null, null, 13, null);
                }
            }
            arrayList.add(chartFillDtoCopy$default);
            i2 = i3;
        }
        ImmutableList<ChartFillDto> immutableList = extensions2.toImmutableList(arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return immutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List animateBarFillAsState$lambda$12$lambda$11(SnapshotStateList snapshotStateList) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapshotStateList, 10));
        Iterator<T> it = snapshotStateList.iterator();
        while (it.hasNext()) {
            arrayList.add((PointDto) ((Animatable) it.next()).getValue());
        }
        return arrayList;
    }
}
