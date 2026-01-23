package com.robinhood.android.aura;

import android.os.Build;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.Focusable2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Blur;
import androidx.compose.p011ui.draw.Blur3;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.aura.ChartAuraType;
import com.robinhood.android.aura.StaticChartAura;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StaticChartAura.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\nX\u008a\u008e\u0002"}, m3636d2 = {"StaticChartAura", "", "auraType", "Lcom/robinhood/android/aura/ChartAuraType;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/aura/ChartAuraType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StaticImageChartAura", "lib-aura_externalDebug", "measuredHeight", "Landroidx/compose/ui/unit/Dp;", "measuredWidth"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.aura.StaticChartAuraKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class StaticChartAura {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaticChartAura$lambda$0(ChartAuraType chartAuraType, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StaticChartAura(chartAuraType, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaticImageChartAura$lambda$1(ChartAuraType chartAuraType, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StaticImageChartAura(chartAuraType, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void StaticChartAura(final ChartAuraType auraType, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(auraType, "auraType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-756042933);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(auraType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-756042933, i3, -1, "com.robinhood.android.aura.StaticChartAura (StaticChartAura.kt:26)");
            }
            if (Build.VERSION.SDK_INT >= 31) {
                composerStartRestartGroup.startReplaceGroup(-466336698);
                Crossfade.Crossfade(auraType, (Modifier) null, (FiniteAnimationSpec<Float>) null, "aura", ComposableLambda3.rememberComposableLambda(1318093054, true, new C96201(modifier), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 27648, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-465235144);
                StaticImageChartAura(auraType, Focusable2.focusable$default(modifier, false, null, 2, null), composerStartRestartGroup, i3 & 14, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.aura.StaticChartAuraKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StaticChartAura.StaticChartAura$lambda$0(auraType, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: StaticChartAura.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.aura.StaticChartAuraKt$StaticChartAura$1 */
    static final class C96201 implements Function3<ChartAuraType, Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;

        C96201(Modifier modifier) {
            this.$modifier = modifier;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ChartAuraType chartAuraType, Composer composer, Integer num) {
            invoke(chartAuraType, composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final void invoke$lambda$2(SnapshotState<C2002Dp> snapshotState, float f) {
            snapshotState.setValue(C2002Dp.m7993boximpl(f));
        }

        private static final void invoke$lambda$5(SnapshotState<C2002Dp> snapshotState, float f) {
            snapshotState.setValue(C2002Dp.m7993boximpl(f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(Density density, SnapshotState snapshotState, SnapshotState snapshotState2, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            invoke$lambda$2(snapshotState, density.mo5013toDpu2uoSUM((int) (it.mo7241getSizeYbymL2g() & 4294967295L)));
            invoke$lambda$5(snapshotState2, density.mo5013toDpu2uoSUM((int) (it.mo7241getSizeYbymL2g() >> 32)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10(ChartAuraType chartAuraType, SnapshotState snapshotState, SnapshotState snapshotState2, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Tuples2[] tuples2Arr = (Tuples2[]) chartAuraType.getColors().toArray(new Tuples2[0]);
            AngledLinearGradient angledLinearGradientM11342angledLinearGradient3YTHUZs$default = AngledLinearGradient2.m11342angledLinearGradient3YTHUZs$default((Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length), chartAuraType.getStaticAngleInDegrees(), 0, 4, null);
            float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(invoke$lambda$1(snapshotState) * 3.0f) / 8.0f));
            long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_4) & 4294967295L));
            float fMo5016toPx0680j_42 = Canvas.mo5016toPx0680j_4(invoke$lambda$4(snapshotState2));
            float fMo5016toPx0680j_43 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(invoke$lambda$1(snapshotState) / 4));
            DrawScope.m6957drawRectAsUm42w$default(Canvas, angledLinearGradientM11342angledLinearGradient3YTHUZs$default, jM6535constructorimpl, Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_43) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            return Unit.INSTANCE;
        }

        private static final float invoke$lambda$1(SnapshotState<C2002Dp> snapshotState) {
            return snapshotState.getValue().getValue();
        }

        private static final float invoke$lambda$4(SnapshotState<C2002Dp> snapshotState) {
            return snapshotState.getValue().getValue();
        }

        public final void invoke(final ChartAuraType type2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(type2, "type");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1318093054, i, -1, "com.robinhood.android.aura.StaticChartAura.<anonymous> (StaticChartAura.kt:29)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(30)), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(30)), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Focusable2.focusable$default(this.$modifier, false, null, 2, null), 0.0f, 1, null);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(density);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.aura.StaticChartAuraKt$StaticChartAura$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StaticChartAura.C96201.invoke$lambda$9$lambda$8(density, snapshotState, snapshotState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Modifier modifierM6448blurF8QBwvs = Blur.m6448blurF8QBwvs(OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue3), C2002Dp.m7995constructorimpl(invoke$lambda$1(snapshotState) / 4), Blur3.INSTANCE.m6457getUnboundedGoahg());
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(type2);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.aura.StaticChartAuraKt$StaticChartAura$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StaticChartAura.C96201.invoke$lambda$11$lambda$10(type2, snapshotState, snapshotState2, (DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            Canvas2.Canvas(modifierM6448blurF8QBwvs, (Function1) objRememberedValue4, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void StaticImageChartAura(ChartAuraType auraType, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final ChartAuraType chartAuraType;
        Intrinsics.checkNotNullParameter(auraType, "auraType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1216213426);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(auraType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1216213426, i3, -1, "com.robinhood.android.aura.StaticImageChartAura (StaticChartAura.kt:58)");
            }
            chartAuraType = auraType;
            Crossfade.Crossfade(chartAuraType, (Modifier) null, (FiniteAnimationSpec<Float>) null, "aura", ComposableLambda3.rememberComposableLambda(-686808864, true, new Function3<ChartAuraType, Composer, Integer, Unit>() { // from class: com.robinhood.android.aura.StaticChartAuraKt.StaticImageChartAura.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ChartAuraType chartAuraType2, Composer composer2, Integer num) {
                    invoke(chartAuraType2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ChartAuraType type2, Composer composer2, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(type2, "type");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-686808864, i5, -1, "com.robinhood.android.aura.StaticImageChartAura.<anonymous> (StaticChartAura.kt:61)");
                    }
                    if (Intrinsics.areEqual(type2, ChartAuraType.Negative.INSTANCE)) {
                        i6 = C9618R.drawable.chart_negative;
                    } else if (Intrinsics.areEqual(type2, ChartAuraType.Neutral.INSTANCE)) {
                        i6 = C9618R.drawable.chart_neutral;
                    } else {
                        if (!Intrinsics.areEqual(type2, ChartAuraType.Positive.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i6 = C9618R.drawable.chart_positive;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i6, composer2, 0), "", Focusable2.focusable$default(modifier, false, null, 2, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 27648, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            chartAuraType = auraType;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.aura.StaticChartAuraKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StaticChartAura.StaticImageChartAura$lambda$1(chartAuraType, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
