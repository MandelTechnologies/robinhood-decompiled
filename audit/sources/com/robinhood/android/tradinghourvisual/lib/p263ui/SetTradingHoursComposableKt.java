package com.robinhood.android.tradinghourvisual.lib.p263ui;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.Instant;

/* compiled from: SetTradingHoursComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0091\u0001\u0010\u0012\u001a\u00020\u00112\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m3636d2 = {"Lkotlinx/collections/immutable/ImmutableList;", "", "leftEdgeText", "rightEdgeText", "leftBoundaryText", "rightBoundaryText", "Landroidx/compose/ui/graphics/Color;", "gradient", "", "numPegs", "j$/time/Instant", "leftEdgeInstant", "rightEdgeInstant", "Lkotlin/Pair;", "selectedMarketHoursOpenClose", "Landroidx/compose/ui/Modifier;", "modifier", "", "SetTradingHoursComposable", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ILj$/time/Instant;Lj$/time/Instant;Lkotlin/Pair;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ANIMATION_TIME", "I", "", "leftAnimatedProgress", "rightAnimatedProgress", "lib-trade-hour-visualizer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SetTradingHoursComposableKt {
    public static final int ANIMATION_TIME = 250;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SetTradingHoursComposable$lambda$3(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5, int i, Instant instant, Instant instant2, Tuples2 tuples2, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        SetTradingHoursComposable(immutableList, immutableList2, immutableList3, immutableList4, immutableList5, i, instant, instant2, tuples2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SetTradingHoursComposable(final ImmutableList<String> leftEdgeText, final ImmutableList<String> rightEdgeText, final ImmutableList<String> leftBoundaryText, final ImmutableList<String> rightBoundaryText, final ImmutableList<Color> gradient, final int i, final Instant leftEdgeInstant, final Instant rightEdgeInstant, final Tuples2<Instant, Instant> tuples2, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        Instant second;
        Instant first;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(leftEdgeText, "leftEdgeText");
        Intrinsics.checkNotNullParameter(rightEdgeText, "rightEdgeText");
        Intrinsics.checkNotNullParameter(leftBoundaryText, "leftBoundaryText");
        Intrinsics.checkNotNullParameter(rightBoundaryText, "rightBoundaryText");
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        Intrinsics.checkNotNullParameter(leftEdgeInstant, "leftEdgeInstant");
        Intrinsics.checkNotNullParameter(rightEdgeInstant, "rightEdgeInstant");
        Composer composerStartRestartGroup = composer.startRestartGroup(-93135558);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(leftEdgeText) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(rightEdgeText) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(leftBoundaryText) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(rightBoundaryText) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(gradient) ? 16384 : 8192;
        }
        if ((i3 & 32) == 0) {
            if ((i2 & 196608) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(leftEdgeInstant) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(rightEdgeInstant) ? 8388608 : 4194304;
            }
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(tuples2) ? 67108864 : 33554432;
            }
            i5 = i3 & 512;
            if (i5 == 0) {
                i4 |= 805306368;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i2 & 805306368) == 0) {
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                }
            }
            if ((i4 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-93135558, i4, -1, "com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposable (SetTradingHoursComposable.kt:53)");
                }
                float fCalculateForwardDistanceFrom = (tuples2 != null || (first = tuples2.getFirst()) == null) ? 0.0f : InstantExtension.calculateForwardDistanceFrom(first, leftEdgeInstant, rightEdgeInstant, true);
                float fCalculateForwardDistanceFrom2 = (tuples2 != null || (second = tuples2.getSecond()) == null) ? 1.0f : InstantExtension.calculateForwardDistanceFrom(second, leftEdgeInstant, rightEdgeInstant, false);
                final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(fCalculateForwardDistanceFrom, AnimationSpecKt.tween$default(250, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                final SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(fCalculateForwardDistanceFrom2, AnimationSpecKt.tween$default(250, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                boolean z = (tuples2 == null ? tuples2.getFirst() : null) != null || tuples2.getSecond() == null;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                final float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM();
                final float fM21595getXsmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM();
                final float fM7995constructorimpl = C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21597getXxsmallD9Ej5fM() / 2);
                final float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21597getXxsmallD9Ej5fM() / 4);
                final float fM21595getXsmallD9Ej5fM2 = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM();
                final float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(-bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM());
                final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                final float fMo5012toDpu2uoSUM = density.mo5012toDpu2uoSUM(1.0f);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                Modifier modifier5 = modifier4;
                final boolean z2 = z;
                composer2 = composerStartRestartGroup;
                BoxWithConstraints.BoxWithConstraints(modifierFillMaxWidth$default, null, false, ComposableLambda3.rememberComposableLambda(-1976929264, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt.SetTradingHoursComposable.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer3, Integer num) {
                        invoke(boxWithConstraints4, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer3, int i7) {
                        int i8;
                        float f;
                        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                        final SnapshotState snapshotState;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i7 & 6) == 0) {
                            i8 = i7 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i8 = i7;
                        }
                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1976929264, i8, -1, "com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposable.<anonymous> (SetTradingHoursComposable.kt:89)");
                        }
                        final float fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM(Constraints.m7975getMaxWidthimpl(BoxWithConstraints.getConstraints()));
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer3.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
                        composer3.endReplaceGroup();
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final boolean z3 = z2;
                        final ImmutableList<String> immutableList = leftBoundaryText;
                        final float f2 = fM7995constructorimpl3;
                        final Density density2 = density;
                        final ImmutableList<String> immutableList2 = rightBoundaryText;
                        float f3 = fM7995constructorimpl;
                        final float f4 = fM21593getSmallD9Ej5fM;
                        final float f5 = fM21595getXsmallD9Ej5fM;
                        final ImmutableList<Color> immutableList3 = gradient;
                        final float f6 = fMo5012toDpu2uoSUM;
                        final ImmutableList<String> immutableList4 = leftEdgeText;
                        final ImmutableList<String> immutableList5 = rightEdgeText;
                        final SnapshotState4<Float> snapshotState4 = snapshotState4AnimateFloatAsState;
                        final SnapshotState4<Float> snapshotState42 = snapshotState4AnimateFloatAsState2;
                        final int i9 = i;
                        final float f7 = fM7995constructorimpl2;
                        final float f8 = fM21595getXsmallD9Ej5fM2;
                        composer3.startReplaceGroup(-1003410150);
                        composer3.startReplaceGroup(212064437);
                        composer3.endReplaceGroup();
                        Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Measurer2(density3);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        final Measurer2 measurer2 = (Measurer2) objRememberedValue3;
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new ConstraintLayoutScope();
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue4;
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            f = f3;
                            objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue5);
                        } else {
                            f = f3;
                        }
                        final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue5;
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue6;
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                            composer3.updateRememberedValue(objRememberedValue7);
                        }
                        final SnapshotState snapshotState6 = (SnapshotState) objRememberedValue7;
                        boolean zChangedInstance = composer3.changedInstance(measurer2);
                        final int i10 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        boolean zChanged = zChangedInstance | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        Object objRememberedValue8 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = new MeasurePolicy() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i11);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i11);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i11);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i11);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    snapshotState6.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i10);
                                    snapshotState5.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                        }
                                    }, 4, null);
                                }
                            };
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            snapshotState = snapshotState5;
                            composer3.updateRememberedValue(objRememberedValue8);
                        } else {
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            snapshotState = snapshotState5;
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue8;
                        Object objRememberedValue9 = composer3.rememberedValue();
                        if (objRememberedValue9 == companion.getEmpty()) {
                            objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                    constraintSetForInlineDsl.setKnownDirty(true);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue9);
                        }
                        final Function0 function0 = (Function0) objRememberedValue9;
                        boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                        Object objRememberedValue10 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue10 == companion.getEmpty()) {
                            objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$4
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue10);
                        }
                        final float f9 = f;
                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default2, false, (Function1) objRememberedValue10, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:25:0x0133  */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x019c  */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x01c6  */
                            /* JADX WARN: Removed duplicated region for block: B:40:0x022e  */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x0292  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(Composer composer4, int i11) {
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor;
                                int i12;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2;
                                int i13;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
                                boolean zChanged2;
                                Object objRememberedValue11;
                                boolean zChanged3;
                                Object objRememberedValue12;
                                boolean zChanged4;
                                Object objRememberedValue13;
                                boolean zChanged5;
                                Object objRememberedValue14;
                                boolean zChanged6;
                                Object objRememberedValue15;
                                if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i11, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState6.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                composer4.startReplaceGroup(2101160121);
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope2.createGuidelineFromStart(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$0(snapshotState4));
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart2 = constraintLayoutScope2.createGuidelineFromStart(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$1(snapshotState42));
                                float value = (((C2002Dp) snapshotState2.getValue()).getValue() / 2.0f) / fMo5013toDpu2uoSUM;
                                float value2 = 1 - ((((C2002Dp) snapshotState3.getValue()).getValue() / 2.0f) / fMo5013toDpu2uoSUM);
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart3 = constraintLayoutScope2.createGuidelineFromStart(Math.max(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$0(snapshotState4), value));
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart4 = constraintLayoutScope2.createGuidelineFromStart(Math.min(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$1(snapshotState42), value2));
                                composer4.startReplaceGroup(-624937487);
                                if (z3) {
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component5;
                                    constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component6;
                                    verticalAnchor = verticalAnchorCreateGuidelineFromStart2;
                                    i12 = helpersHashCode;
                                    constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                    verticalAnchor2 = verticalAnchorCreateGuidelineFromStart;
                                    i13 = -1633490746;
                                } else {
                                    ImmutableList immutableList6 = immutableList;
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(f2);
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChanged7 = composer4.changed(verticalAnchorCreateGuidelineFromStart3) | composer4.changed(constraintLayoutBaseScope4Component7);
                                    Object objRememberedValue16 = composer4.rememberedValue();
                                    if (zChanged7) {
                                        constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component5;
                                    } else {
                                        constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component5;
                                        if (objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue16);
                                        composer4.startReplaceGroup(-1633490746);
                                        zChanged2 = composer4.changed(density2);
                                        objRememberedValue11 = composer4.rememberedValue();
                                        if (!zChanged2 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue11 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$2$1(snapshotState2, density2);
                                            composer4.updateRememberedValue(objRememberedValue11);
                                        }
                                        composer4.endReplaceGroup();
                                        constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                        constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component6;
                                        i12 = helpersHashCode;
                                        constraintLayoutBaseScope4 = constraintLayoutBaseScope44;
                                        i13 = -1633490746;
                                        TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList6, centerHorizontally, horizontalOrVerticalM5089spacedBy0680j_4, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue11), null, null, composer4, 48, 48);
                                        ImmutableList immutableList7 = immutableList2;
                                        Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(f2);
                                        composer4.startReplaceGroup(-1633490746);
                                        zChanged3 = composer4.changed(verticalAnchorCreateGuidelineFromStart4) | composer4.changed(constraintLayoutBaseScope4Component8);
                                        objRememberedValue12 = composer4.rememberedValue();
                                        if (!zChanged3 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue12 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$3$1(verticalAnchorCreateGuidelineFromStart4, constraintLayoutBaseScope4Component8);
                                            composer4.updateRememberedValue(objRememberedValue12);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12);
                                        composer4.startReplaceGroup(-1633490746);
                                        zChanged4 = composer4.changed(density2);
                                        objRememberedValue13 = composer4.rememberedValue();
                                        if (!zChanged4 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue13 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$4$1(snapshotState3, density2);
                                            composer4.updateRememberedValue(objRememberedValue13);
                                        }
                                        composer4.endReplaceGroup();
                                        TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList7, centerHorizontally2, horizontalOrVerticalM5089spacedBy0680j_42, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs2, (Function1) objRememberedValue13), null, null, composer4, 48, 48);
                                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, f9), f4);
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i14 = BentoTheme.$stable;
                                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs, bentoTheme2.getColors(composer4, i14).m21425getFg0d7_KjU(), null, 2, null);
                                        composer4.startReplaceGroup(-1746271574);
                                        verticalAnchor2 = verticalAnchorCreateGuidelineFromStart;
                                        constraintLayoutBaseScope4Component1 = constraintLayoutBaseScope4Component1;
                                        zChanged5 = composer4.changed(verticalAnchor2) | composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                        objRememberedValue14 = composer4.rememberedValue();
                                        if (!zChanged5 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue14 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$5$1(verticalAnchor2, constraintLayoutBaseScope4Component1, f5);
                                            composer4.updateRememberedValue(objRememberedValue14);
                                        }
                                        composer4.endReplaceGroup();
                                        BoxKt.Box(TestTag3.testTag(constraintLayoutScope2.constrainAs(modifierM4872backgroundbw27NRU$default, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue14), Tags.LEFT_EDGE_BAR.getString()), composer4, 0);
                                        Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, f9), f4), bentoTheme2.getColors(composer4, i14).m21425getFg0d7_KjU(), null, 2, null);
                                        composer4.startReplaceGroup(-1746271574);
                                        verticalAnchor = verticalAnchorCreateGuidelineFromStart2;
                                        zChanged6 = composer4.changed(verticalAnchor) | composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                        objRememberedValue15 = composer4.rememberedValue();
                                        if (!zChanged6 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue15 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$6$1(verticalAnchor, constraintLayoutBaseScope4Component1, f5);
                                            composer4.updateRememberedValue(objRememberedValue15);
                                        }
                                        composer4.endReplaceGroup();
                                        BoxKt.Box(TestTag3.testTag(constraintLayoutScope2.constrainAs(modifierM4872backgroundbw27NRU$default2, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue15), Tags.RIGHT_EDGE_BAR.getString()), composer4, 0);
                                    }
                                    objRememberedValue16 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$1$1(verticalAnchorCreateGuidelineFromStart3, constraintLayoutBaseScope4Component7);
                                    composer4.updateRememberedValue(objRememberedValue16);
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue16);
                                    composer4.startReplaceGroup(-1633490746);
                                    zChanged2 = composer4.changed(density2);
                                    objRememberedValue11 = composer4.rememberedValue();
                                    if (!zChanged2) {
                                        objRememberedValue11 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$2$1(snapshotState2, density2);
                                        composer4.updateRememberedValue(objRememberedValue11);
                                        composer4.endReplaceGroup();
                                        constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                        constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component6;
                                        i12 = helpersHashCode;
                                        constraintLayoutBaseScope4 = constraintLayoutBaseScope44;
                                        i13 = -1633490746;
                                        TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList6, centerHorizontally, horizontalOrVerticalM5089spacedBy0680j_4, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs3, (Function1) objRememberedValue11), null, null, composer4, 48, 48);
                                        ImmutableList immutableList72 = immutableList2;
                                        Alignment.Horizontal centerHorizontally22 = companion2.getCenterHorizontally();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_422 = arrangement.m5089spacedBy0680j_4(f2);
                                        composer4.startReplaceGroup(-1633490746);
                                        zChanged3 = composer4.changed(verticalAnchorCreateGuidelineFromStart4) | composer4.changed(constraintLayoutBaseScope4Component8);
                                        objRememberedValue12 = composer4.rememberedValue();
                                        if (!zChanged3) {
                                            objRememberedValue12 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$3$1(verticalAnchorCreateGuidelineFromStart4, constraintLayoutBaseScope4Component8);
                                            composer4.updateRememberedValue(objRememberedValue12);
                                            composer4.endReplaceGroup();
                                            Modifier modifierConstrainAs22 = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12);
                                            composer4.startReplaceGroup(-1633490746);
                                            zChanged4 = composer4.changed(density2);
                                            objRememberedValue13 = composer4.rememberedValue();
                                            if (!zChanged4) {
                                                objRememberedValue13 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$4$1(snapshotState3, density2);
                                                composer4.updateRememberedValue(objRememberedValue13);
                                                composer4.endReplaceGroup();
                                                TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList72, centerHorizontally22, horizontalOrVerticalM5089spacedBy0680j_422, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs22, (Function1) objRememberedValue13), null, null, composer4, 48, 48);
                                                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, f9), f4);
                                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                                int i142 = BentoTheme.$stable;
                                                Modifier modifierM4872backgroundbw27NRU$default3 = Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs2, bentoTheme22.getColors(composer4, i142).m21425getFg0d7_KjU(), null, 2, null);
                                                composer4.startReplaceGroup(-1746271574);
                                                verticalAnchor2 = verticalAnchorCreateGuidelineFromStart;
                                                constraintLayoutBaseScope4Component1 = constraintLayoutBaseScope4Component1;
                                                zChanged5 = composer4.changed(verticalAnchor2) | composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                                objRememberedValue14 = composer4.rememberedValue();
                                                if (!zChanged5) {
                                                    objRememberedValue14 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$5$1(verticalAnchor2, constraintLayoutBaseScope4Component1, f5);
                                                    composer4.updateRememberedValue(objRememberedValue14);
                                                    composer4.endReplaceGroup();
                                                    BoxKt.Box(TestTag3.testTag(constraintLayoutScope2.constrainAs(modifierM4872backgroundbw27NRU$default3, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue14), Tags.LEFT_EDGE_BAR.getString()), composer4, 0);
                                                    Modifier modifierM4872backgroundbw27NRU$default22 = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, f9), f4), bentoTheme22.getColors(composer4, i142).m21425getFg0d7_KjU(), null, 2, null);
                                                    composer4.startReplaceGroup(-1746271574);
                                                    verticalAnchor = verticalAnchorCreateGuidelineFromStart2;
                                                    zChanged6 = composer4.changed(verticalAnchor) | composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                                    objRememberedValue15 = composer4.rememberedValue();
                                                    if (!zChanged6) {
                                                        objRememberedValue15 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$6$1(verticalAnchor, constraintLayoutBaseScope4Component1, f5);
                                                        composer4.updateRememberedValue(objRememberedValue15);
                                                        composer4.endReplaceGroup();
                                                        BoxKt.Box(TestTag3.testTag(constraintLayoutScope2.constrainAs(modifierM4872backgroundbw27NRU$default22, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue15), Tags.RIGHT_EDGE_BAR.getString()), composer4, 0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                composer4.endReplaceGroup();
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                int i15 = BentoTheme.$stable;
                                Modifier modifierBorder$default = BorderKt.border$default(Background3.background$default(SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composer4, i15).m21593getSmallD9Ej5fM()), Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, immutableList3, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), BorderStroke2.m4886BorderStrokecXLIe8U(f6, bentoTheme3.getColors(composer4, i15).m21425getFg0d7_KjU()), null, 2, null);
                                composer4.startReplaceGroup(i13);
                                boolean zChanged8 = composer4.changed(verticalAnchor2) | composer4.changed(verticalAnchor);
                                Object objRememberedValue17 = composer4.rememberedValue();
                                if (zChanged8 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue17 = new C29964xd11e65b9(verticalAnchor2, verticalAnchor);
                                    composer4.updateRememberedValue(objRememberedValue17);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierConstrainAs4 = constraintLayoutScope2.constrainAs(modifierBorder$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue17);
                                Modifier modifierM5156height3ABfNKs3 = SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composer4, i15).m21593getSmallD9Ej5fM());
                                composer4.startReplaceGroup(i13);
                                boolean zChanged9 = composer4.changed(verticalAnchor2) | composer4.changed(verticalAnchor);
                                Object objRememberedValue18 = composer4.rememberedValue();
                                if (zChanged9 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue18 = new C29965xf4740c42(verticalAnchor2, verticalAnchor);
                                    composer4.updateRememberedValue(objRememberedValue18);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierConstrainAs5 = constraintLayoutScope2.constrainAs(modifierM5156height3ABfNKs3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue18);
                                if (z3) {
                                    modifierConstrainAs4 = modifierConstrainAs5;
                                }
                                BoxKt.Box(modifierConstrainAs4, composer4, 0);
                                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                composer4.startReplaceGroup(5004770);
                                boolean zChanged10 = composer4.changed(constraintLayoutBaseScope4Component1);
                                Object objRememberedValue19 = composer4.rememberedValue();
                                if (zChanged10 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue19 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$7$1(constraintLayoutBaseScope4Component1);
                                    composer4.updateRememberedValue(objRememberedValue19);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierConstrainAs6 = constraintLayoutScope2.constrainAs(modifierFillMaxWidth$default3, constraintLayoutBaseScope43, (Function1) objRememberedValue19);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composer4, 6);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs6);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                composer4.startReplaceGroup(-1520526513);
                                for (int i16 = 0; i16 < i9; i16++) {
                                    BoxKt.Box(TestTag3.testTag(row6.align(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f7), f8), BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU(), null, 2, null), Alignment.INSTANCE.getBottom()), Tags.PEG.getString()), composer4, 0);
                                }
                                composer4.endReplaceGroup();
                                composer4.endNode();
                                Alignment.Companion companion6 = Alignment.INSTANCE;
                                Alignment.Horizontal start = companion6.getStart();
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_43 = arrangement2.m5089spacedBy0680j_4(f2);
                                BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                int i17 = BentoTheme.$stable;
                                long jM21427getFg30d7_KjU = bentoTheme4.getColors(composer4, i17).m21427getFg30d7_KjU();
                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                composer4.startReplaceGroup(i13);
                                boolean zChanged11 = composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                Object objRememberedValue20 = composer4.rememberedValue();
                                if (zChanged11 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue20 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$9$1(constraintLayoutBaseScope4Component1, f5);
                                    composer4.updateRememberedValue(objRememberedValue20);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierConstrainAs7 = constraintLayoutScope2.constrainAs(companion7, constraintLayoutBaseScope4, (Function1) objRememberedValue20);
                                TextAlign.Companion companion8 = TextAlign.INSTANCE;
                                TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList4, start, horizontalOrVerticalM5089spacedBy0680j_43, modifierConstrainAs7, Color.m6701boximpl(jM21427getFg30d7_KjU), TextAlign.m7912boximpl(companion8.m7924getStarte0LSkKk()), composer4, 48, 0);
                                Alignment.Horizontal end = companion6.getEnd();
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_44 = arrangement2.m5089spacedBy0680j_4(f2);
                                long jM21427getFg30d7_KjU2 = bentoTheme4.getColors(composer4, i17).m21427getFg30d7_KjU();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChanged12 = composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                Object objRememberedValue21 = composer4.rememberedValue();
                                if (zChanged12 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue21 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$10$1(constraintLayoutBaseScope4Component1, f5);
                                    composer4.updateRememberedValue(objRememberedValue21);
                                }
                                composer4.endReplaceGroup();
                                TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList5, end, horizontalOrVerticalM5089spacedBy0680j_44, constraintLayoutScope2.constrainAs(companion7, constraintLayoutBaseScope42, (Function1) objRememberedValue21), Color.m6701boximpl(jM21427getFg30d7_KjU2), TextAlign.m7912boximpl(companion8.m7920getEnde0LSkKk()), composer4, 48, 0);
                                composer4.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != i12) {
                                    EffectsKt.SideEffect(function0, composer4, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), measurePolicy, composer3, 48, 0);
                        composer3.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$3(leftEdgeText, rightEdgeText, leftBoundaryText, rightBoundaryText, gradient, i, leftEdgeInstant, rightEdgeInstant, tuples2, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 196608;
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (tuples2 != null) {
                if (tuples2 != null) {
                    final SnapshotState4<Float> snapshotState4AnimateFloatAsState3 = AnimateAsState.animateFloatAsState(fCalculateForwardDistanceFrom, AnimationSpecKt.tween$default(250, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                    final SnapshotState4<Float> snapshotState4AnimateFloatAsState22 = AnimateAsState.animateFloatAsState(fCalculateForwardDistanceFrom2, AnimationSpecKt.tween$default(250, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                    if ((tuples2 == null ? tuples2.getFirst() : null) != null) {
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i62 = BentoTheme.$stable;
                        final float fM21593getSmallD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM();
                        final float fM21595getXsmallD9Ej5fM3 = bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM();
                        final float fM7995constructorimpl4 = C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21597getXxsmallD9Ej5fM() / 2);
                        final float fM7995constructorimpl22 = C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21597getXxsmallD9Ej5fM() / 4);
                        final float fM21595getXsmallD9Ej5fM22 = bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM();
                        final float fM7995constructorimpl32 = C2002Dp.m7995constructorimpl(-bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM());
                        final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        final float fMo5012toDpu2uoSUM2 = density2.mo5012toDpu2uoSUM(1.0f);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        Modifier modifier52 = modifier4;
                        final boolean z22 = z;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraints.BoxWithConstraints(modifierFillMaxWidth$default2, null, false, ComposableLambda3.rememberComposableLambda(-1976929264, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt.SetTradingHoursComposable.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer3, Integer num) {
                                invoke(boxWithConstraints4, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer3, int i7) {
                                int i8;
                                float f;
                                final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                                final SnapshotState snapshotState;
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                if ((i7 & 6) == 0) {
                                    i8 = i7 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                } else {
                                    i8 = i7;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1976929264, i8, -1, "com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposable.<anonymous> (SetTradingHoursComposable.kt:89)");
                                }
                                final float fMo5013toDpu2uoSUM = density2.mo5013toDpu2uoSUM(Constraints.m7975getMaxWidthimpl(BoxWithConstraints.getConstraints()));
                                composer3.startReplaceGroup(1849434622);
                                Object objRememberedValue = composer3.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
                                composer3.endReplaceGroup();
                                Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                final boolean z3 = z22;
                                final ImmutableList immutableList = leftBoundaryText;
                                final float f2 = fM7995constructorimpl32;
                                final Density density22 = density2;
                                final ImmutableList immutableList2 = rightBoundaryText;
                                float f3 = fM7995constructorimpl4;
                                final float f4 = fM21593getSmallD9Ej5fM2;
                                final float f5 = fM21595getXsmallD9Ej5fM3;
                                final ImmutableList immutableList3 = gradient;
                                final float f6 = fMo5012toDpu2uoSUM2;
                                final ImmutableList immutableList4 = leftEdgeText;
                                final ImmutableList immutableList5 = rightEdgeText;
                                final SnapshotState4 snapshotState4 = snapshotState4AnimateFloatAsState3;
                                final SnapshotState4 snapshotState42 = snapshotState4AnimateFloatAsState22;
                                final int i9 = i;
                                final float f7 = fM7995constructorimpl22;
                                final float f8 = fM21595getXsmallD9Ej5fM22;
                                composer3.startReplaceGroup(-1003410150);
                                composer3.startReplaceGroup(212064437);
                                composer3.endReplaceGroup();
                                Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Measurer2(density3);
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                final Measurer2 measurer2 = (Measurer2) objRememberedValue3;
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new ConstraintLayoutScope();
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue4;
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                    f = f3;
                                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                } else {
                                    f = f3;
                                }
                                final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue5;
                                Object objRememberedValue6 = composer3.rememberedValue();
                                if (objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                    composer3.updateRememberedValue(objRememberedValue6);
                                }
                                final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue6;
                                Object objRememberedValue7 = composer3.rememberedValue();
                                if (objRememberedValue7 == companion.getEmpty()) {
                                    objRememberedValue7 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                    composer3.updateRememberedValue(objRememberedValue7);
                                }
                                final SnapshotState snapshotState6 = (SnapshotState) objRememberedValue7;
                                boolean zChangedInstance = composer3.changedInstance(measurer2);
                                final int i10 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                boolean zChanged = zChangedInstance | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                                Object objRememberedValue8 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue8 == companion.getEmpty()) {
                                    objRememberedValue8 = new MeasurePolicy() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$2
                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i11);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i11);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i11);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i11);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        /* renamed from: measure-3p2s80s */
                                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                            final Map linkedHashMap = new LinkedHashMap();
                                            snapshotState6.getValue();
                                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i10);
                                            snapshotState5.getValue();
                                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                            final Measurer2 measurer22 = measurer2;
                                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    invoke2(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                    snapshotState = snapshotState5;
                                    composer3.updateRememberedValue(objRememberedValue8);
                                } else {
                                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                                    snapshotState = snapshotState5;
                                }
                                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue8;
                                Object objRememberedValue9 = composer3.rememberedValue();
                                if (objRememberedValue9 == companion.getEmpty()) {
                                    objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                            constraintSetForInlineDsl.setKnownDirty(true);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue9);
                                }
                                final Function0 function0 = (Function0) objRememberedValue9;
                                boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                                Object objRememberedValue10 = composer3.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue10 == companion.getEmpty()) {
                                    objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$4
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue10);
                                }
                                final float f9 = f;
                                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default22, false, (Function1) objRememberedValue10, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradinghourvisual.lib.ui.SetTradingHoursComposableKt$SetTradingHoursComposable$1$invoke$$inlined$ConstraintLayout$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:25:0x0133  */
                                    /* JADX WARN: Removed duplicated region for block: B:30:0x019c  */
                                    /* JADX WARN: Removed duplicated region for block: B:35:0x01c6  */
                                    /* JADX WARN: Removed duplicated region for block: B:40:0x022e  */
                                    /* JADX WARN: Removed duplicated region for block: B:45:0x0292  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(Composer composer4, int i11) {
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor;
                                        int i12;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2;
                                        int i13;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
                                        boolean zChanged2;
                                        Object objRememberedValue11;
                                        boolean zChanged3;
                                        Object objRememberedValue12;
                                        boolean zChanged4;
                                        Object objRememberedValue13;
                                        boolean zChanged5;
                                        Object objRememberedValue14;
                                        boolean zChanged6;
                                        Object objRememberedValue15;
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1200550679, i11, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                        }
                                        snapshotState6.setValue(Unit.INSTANCE);
                                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                        constraintLayoutScope.reset();
                                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                        composer4.startReplaceGroup(2101160121);
                                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope2.createGuidelineFromStart(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$0(snapshotState4));
                                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart2 = constraintLayoutScope2.createGuidelineFromStart(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$1(snapshotState42));
                                        float value = (((C2002Dp) snapshotState2.getValue()).getValue() / 2.0f) / fMo5013toDpu2uoSUM;
                                        float value2 = 1 - ((((C2002Dp) snapshotState3.getValue()).getValue() / 2.0f) / fMo5013toDpu2uoSUM);
                                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart3 = constraintLayoutScope2.createGuidelineFromStart(Math.max(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$0(snapshotState4), value));
                                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart4 = constraintLayoutScope2.createGuidelineFromStart(Math.min(SetTradingHoursComposableKt.SetTradingHoursComposable$lambda$1(snapshotState42), value2));
                                        composer4.startReplaceGroup(-624937487);
                                        if (z3) {
                                            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component5;
                                            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component6;
                                            verticalAnchor = verticalAnchorCreateGuidelineFromStart2;
                                            i12 = helpersHashCode;
                                            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                            verticalAnchor2 = verticalAnchorCreateGuidelineFromStart;
                                            i13 = -1633490746;
                                        } else {
                                            ImmutableList immutableList6 = immutableList;
                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(f2);
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            composer4.startReplaceGroup(-1633490746);
                                            boolean zChanged7 = composer4.changed(verticalAnchorCreateGuidelineFromStart3) | composer4.changed(constraintLayoutBaseScope4Component7);
                                            Object objRememberedValue16 = composer4.rememberedValue();
                                            if (zChanged7) {
                                                constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component5;
                                            } else {
                                                constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component5;
                                                if (objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                }
                                                composer4.endReplaceGroup();
                                                Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue16);
                                                composer4.startReplaceGroup(-1633490746);
                                                zChanged2 = composer4.changed(density22);
                                                objRememberedValue11 = composer4.rememberedValue();
                                                if (!zChanged2 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue11 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$2$1(snapshotState2, density22);
                                                    composer4.updateRememberedValue(objRememberedValue11);
                                                }
                                                composer4.endReplaceGroup();
                                                constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component6;
                                                i12 = helpersHashCode;
                                                constraintLayoutBaseScope4 = constraintLayoutBaseScope44;
                                                i13 = -1633490746;
                                                TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList6, centerHorizontally, horizontalOrVerticalM5089spacedBy0680j_4, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs3, (Function1) objRememberedValue11), null, null, composer4, 48, 48);
                                                ImmutableList immutableList72 = immutableList2;
                                                Alignment.Horizontal centerHorizontally22 = companion2.getCenterHorizontally();
                                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_422 = arrangement.m5089spacedBy0680j_4(f2);
                                                composer4.startReplaceGroup(-1633490746);
                                                zChanged3 = composer4.changed(verticalAnchorCreateGuidelineFromStart4) | composer4.changed(constraintLayoutBaseScope4Component8);
                                                objRememberedValue12 = composer4.rememberedValue();
                                                if (!zChanged3 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue12 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$3$1(verticalAnchorCreateGuidelineFromStart4, constraintLayoutBaseScope4Component8);
                                                    composer4.updateRememberedValue(objRememberedValue12);
                                                }
                                                composer4.endReplaceGroup();
                                                Modifier modifierConstrainAs22 = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12);
                                                composer4.startReplaceGroup(-1633490746);
                                                zChanged4 = composer4.changed(density22);
                                                objRememberedValue13 = composer4.rememberedValue();
                                                if (!zChanged4 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue13 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$4$1(snapshotState3, density22);
                                                    composer4.updateRememberedValue(objRememberedValue13);
                                                }
                                                composer4.endReplaceGroup();
                                                TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList72, centerHorizontally22, horizontalOrVerticalM5089spacedBy0680j_422, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs22, (Function1) objRememberedValue13), null, null, composer4, 48, 48);
                                                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, f9), f4);
                                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                                int i142 = BentoTheme.$stable;
                                                Modifier modifierM4872backgroundbw27NRU$default3 = Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs2, bentoTheme22.getColors(composer4, i142).m21425getFg0d7_KjU(), null, 2, null);
                                                composer4.startReplaceGroup(-1746271574);
                                                verticalAnchor2 = verticalAnchorCreateGuidelineFromStart;
                                                constraintLayoutBaseScope4Component1 = constraintLayoutBaseScope4Component1;
                                                zChanged5 = composer4.changed(verticalAnchor2) | composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                                objRememberedValue14 = composer4.rememberedValue();
                                                if (!zChanged5 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue14 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$5$1(verticalAnchor2, constraintLayoutBaseScope4Component1, f5);
                                                    composer4.updateRememberedValue(objRememberedValue14);
                                                }
                                                composer4.endReplaceGroup();
                                                BoxKt.Box(TestTag3.testTag(constraintLayoutScope2.constrainAs(modifierM4872backgroundbw27NRU$default3, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue14), Tags.LEFT_EDGE_BAR.getString()), composer4, 0);
                                                Modifier modifierM4872backgroundbw27NRU$default22 = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, f9), f4), bentoTheme22.getColors(composer4, i142).m21425getFg0d7_KjU(), null, 2, null);
                                                composer4.startReplaceGroup(-1746271574);
                                                verticalAnchor = verticalAnchorCreateGuidelineFromStart2;
                                                zChanged6 = composer4.changed(verticalAnchor) | composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                                objRememberedValue15 = composer4.rememberedValue();
                                                if (!zChanged6 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue15 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$6$1(verticalAnchor, constraintLayoutBaseScope4Component1, f5);
                                                    composer4.updateRememberedValue(objRememberedValue15);
                                                }
                                                composer4.endReplaceGroup();
                                                BoxKt.Box(TestTag3.testTag(constraintLayoutScope2.constrainAs(modifierM4872backgroundbw27NRU$default22, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue15), Tags.RIGHT_EDGE_BAR.getString()), composer4, 0);
                                            }
                                            objRememberedValue16 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$1$1(verticalAnchorCreateGuidelineFromStart3, constraintLayoutBaseScope4Component7);
                                            composer4.updateRememberedValue(objRememberedValue16);
                                            composer4.endReplaceGroup();
                                            Modifier modifierConstrainAs32 = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue16);
                                            composer4.startReplaceGroup(-1633490746);
                                            zChanged2 = composer4.changed(density22);
                                            objRememberedValue11 = composer4.rememberedValue();
                                            if (!zChanged2) {
                                                objRememberedValue11 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$2$1(snapshotState2, density22);
                                                composer4.updateRememberedValue(objRememberedValue11);
                                                composer4.endReplaceGroup();
                                                constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component4;
                                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component6;
                                                i12 = helpersHashCode;
                                                constraintLayoutBaseScope4 = constraintLayoutBaseScope44;
                                                i13 = -1633490746;
                                                TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList6, centerHorizontally, horizontalOrVerticalM5089spacedBy0680j_4, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs32, (Function1) objRememberedValue11), null, null, composer4, 48, 48);
                                                ImmutableList immutableList722 = immutableList2;
                                                Alignment.Horizontal centerHorizontally222 = companion2.getCenterHorizontally();
                                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4222 = arrangement.m5089spacedBy0680j_4(f2);
                                                composer4.startReplaceGroup(-1633490746);
                                                zChanged3 = composer4.changed(verticalAnchorCreateGuidelineFromStart4) | composer4.changed(constraintLayoutBaseScope4Component8);
                                                objRememberedValue12 = composer4.rememberedValue();
                                                if (!zChanged3) {
                                                    objRememberedValue12 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$3$1(verticalAnchorCreateGuidelineFromStart4, constraintLayoutBaseScope4Component8);
                                                    composer4.updateRememberedValue(objRememberedValue12);
                                                    composer4.endReplaceGroup();
                                                    Modifier modifierConstrainAs222 = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12);
                                                    composer4.startReplaceGroup(-1633490746);
                                                    zChanged4 = composer4.changed(density22);
                                                    objRememberedValue13 = composer4.rememberedValue();
                                                    if (!zChanged4) {
                                                        objRememberedValue13 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$4$1(snapshotState3, density22);
                                                        composer4.updateRememberedValue(objRememberedValue13);
                                                        composer4.endReplaceGroup();
                                                        TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList722, centerHorizontally222, horizontalOrVerticalM5089spacedBy0680j_4222, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs222, (Function1) objRememberedValue13), null, null, composer4, 48, 48);
                                                        Modifier modifierM5156height3ABfNKs22 = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, f9), f4);
                                                        BentoTheme bentoTheme222 = BentoTheme.INSTANCE;
                                                        int i1422 = BentoTheme.$stable;
                                                        Modifier modifierM4872backgroundbw27NRU$default32 = Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs22, bentoTheme222.getColors(composer4, i1422).m21425getFg0d7_KjU(), null, 2, null);
                                                        composer4.startReplaceGroup(-1746271574);
                                                        verticalAnchor2 = verticalAnchorCreateGuidelineFromStart;
                                                        constraintLayoutBaseScope4Component1 = constraintLayoutBaseScope4Component1;
                                                        zChanged5 = composer4.changed(verticalAnchor2) | composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                                        objRememberedValue14 = composer4.rememberedValue();
                                                        if (!zChanged5) {
                                                            objRememberedValue14 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$5$1(verticalAnchor2, constraintLayoutBaseScope4Component1, f5);
                                                            composer4.updateRememberedValue(objRememberedValue14);
                                                            composer4.endReplaceGroup();
                                                            BoxKt.Box(TestTag3.testTag(constraintLayoutScope2.constrainAs(modifierM4872backgroundbw27NRU$default32, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue14), Tags.LEFT_EDGE_BAR.getString()), composer4, 0);
                                                            Modifier modifierM4872backgroundbw27NRU$default222 = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, f9), f4), bentoTheme222.getColors(composer4, i1422).m21425getFg0d7_KjU(), null, 2, null);
                                                            composer4.startReplaceGroup(-1746271574);
                                                            verticalAnchor = verticalAnchorCreateGuidelineFromStart2;
                                                            zChanged6 = composer4.changed(verticalAnchor) | composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                                            objRememberedValue15 = composer4.rememberedValue();
                                                            if (!zChanged6) {
                                                                objRememberedValue15 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$6$1(verticalAnchor, constraintLayoutBaseScope4Component1, f5);
                                                                composer4.updateRememberedValue(objRememberedValue15);
                                                                composer4.endReplaceGroup();
                                                                BoxKt.Box(TestTag3.testTag(constraintLayoutScope2.constrainAs(modifierM4872backgroundbw27NRU$default222, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue15), Tags.RIGHT_EDGE_BAR.getString()), composer4, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                        int i15 = BentoTheme.$stable;
                                        Modifier modifierBorder$default = BorderKt.border$default(Background3.background$default(SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composer4, i15).m21593getSmallD9Ej5fM()), Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, immutableList3, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), BorderStroke2.m4886BorderStrokecXLIe8U(f6, bentoTheme3.getColors(composer4, i15).m21425getFg0d7_KjU()), null, 2, null);
                                        composer4.startReplaceGroup(i13);
                                        boolean zChanged8 = composer4.changed(verticalAnchor2) | composer4.changed(verticalAnchor);
                                        Object objRememberedValue17 = composer4.rememberedValue();
                                        if (zChanged8 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue17 = new C29964xd11e65b9(verticalAnchor2, verticalAnchor);
                                            composer4.updateRememberedValue(objRememberedValue17);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs4 = constraintLayoutScope2.constrainAs(modifierBorder$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue17);
                                        Modifier modifierM5156height3ABfNKs3 = SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composer4, i15).m21593getSmallD9Ej5fM());
                                        composer4.startReplaceGroup(i13);
                                        boolean zChanged9 = composer4.changed(verticalAnchor2) | composer4.changed(verticalAnchor);
                                        Object objRememberedValue18 = composer4.rememberedValue();
                                        if (zChanged9 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue18 = new C29965xf4740c42(verticalAnchor2, verticalAnchor);
                                            composer4.updateRememberedValue(objRememberedValue18);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs5 = constraintLayoutScope2.constrainAs(modifierM5156height3ABfNKs3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue18);
                                        if (z3) {
                                            modifierConstrainAs4 = modifierConstrainAs5;
                                        }
                                        BoxKt.Box(modifierConstrainAs4, composer4, 0);
                                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChanged10 = composer4.changed(constraintLayoutBaseScope4Component1);
                                        Object objRememberedValue19 = composer4.rememberedValue();
                                        if (zChanged10 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue19 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$7$1(constraintLayoutBaseScope4Component1);
                                            composer4.updateRememberedValue(objRememberedValue19);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs6 = constraintLayoutScope2.constrainAs(modifierFillMaxWidth$default3, constraintLayoutBaseScope43, (Function1) objRememberedValue19);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composer4, 6);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs6);
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        composer4.startReplaceGroup(-1520526513);
                                        for (int i16 = 0; i16 < i9; i16++) {
                                            BoxKt.Box(TestTag3.testTag(row6.align(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f7), f8), BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU(), null, 2, null), Alignment.INSTANCE.getBottom()), Tags.PEG.getString()), composer4, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        Alignment.Companion companion6 = Alignment.INSTANCE;
                                        Alignment.Horizontal start = companion6.getStart();
                                        Arrangement arrangement2 = Arrangement.INSTANCE;
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_43 = arrangement2.m5089spacedBy0680j_4(f2);
                                        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                        int i17 = BentoTheme.$stable;
                                        long jM21427getFg30d7_KjU = bentoTheme4.getColors(composer4, i17).m21427getFg30d7_KjU();
                                        Modifier.Companion companion7 = Modifier.INSTANCE;
                                        composer4.startReplaceGroup(i13);
                                        boolean zChanged11 = composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                        Object objRememberedValue20 = composer4.rememberedValue();
                                        if (zChanged11 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue20 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$9$1(constraintLayoutBaseScope4Component1, f5);
                                            composer4.updateRememberedValue(objRememberedValue20);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs7 = constraintLayoutScope2.constrainAs(companion7, constraintLayoutBaseScope4, (Function1) objRememberedValue20);
                                        TextAlign.Companion companion8 = TextAlign.INSTANCE;
                                        TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList4, start, horizontalOrVerticalM5089spacedBy0680j_43, modifierConstrainAs7, Color.m6701boximpl(jM21427getFg30d7_KjU), TextAlign.m7912boximpl(companion8.m7924getStarte0LSkKk()), composer4, 48, 0);
                                        Alignment.Horizontal end = companion6.getEnd();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_44 = arrangement2.m5089spacedBy0680j_4(f2);
                                        long jM21427getFg30d7_KjU2 = bentoTheme4.getColors(composer4, i17).m21427getFg30d7_KjU();
                                        composer4.startReplaceGroup(-1633490746);
                                        boolean zChanged12 = composer4.changed(constraintLayoutBaseScope4Component1) | composer4.changed(f5);
                                        Object objRememberedValue21 = composer4.rememberedValue();
                                        if (zChanged12 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue21 = new SetTradingHoursComposableKt$SetTradingHoursComposable$1$1$10$1(constraintLayoutBaseScope4Component1, f5);
                                            composer4.updateRememberedValue(objRememberedValue21);
                                        }
                                        composer4.endReplaceGroup();
                                        TextToColumnComposable.m19504TextToColumnrX12GvU(immutableList5, end, horizontalOrVerticalM5089spacedBy0680j_44, constraintLayoutScope2.constrainAs(companion7, constraintLayoutBaseScope42, (Function1) objRememberedValue21), Color.m6701boximpl(jM21427getFg30d7_KjU2), TextAlign.m7912boximpl(companion8.m7920getEnde0LSkKk()), composer4, 48, 0);
                                        composer4.endReplaceGroup();
                                        if (constraintLayoutScope.getHelpersHashCode() != i12) {
                                            EffectsKt.SideEffect(function0, composer4, 6);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), measurePolicy, composer3, 48, 0);
                                composer3.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SetTradingHoursComposable$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SetTradingHoursComposable$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }
}
