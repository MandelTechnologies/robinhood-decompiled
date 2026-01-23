package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SliderKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier4;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OpacitySlider.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\u0005X\u008a\u008e\u0002"}, m3636d2 = {"OpacitySlider", "", "lineColor", "Landroidx/compose/ui/graphics/Color;", "opacity", "", "onValueChange", "Lkotlin/Function1;", "OpacitySlider-3J-VO9M", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "internalOpacity"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.OpacitySliderKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class OpacitySlider4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpacitySlider_3J_VO9M$lambda$15(long j, float f, Function1 function1, int i, Composer composer, int i2) {
        m11926OpacitySlider3JVO9M(j, f, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: OpacitySlider-3J-VO9M, reason: not valid java name */
    public static final void m11926OpacitySlider3JVO9M(final long j, final float f, final Function1<? super Float, Unit> onValueChange, Composer composer, final int i) {
        int i2;
        float f2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1231503864);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            f2 = f;
            i2 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onValueChange) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1231503864, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.OpacitySlider (OpacitySlider.kt:41)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(f2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final float fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl((float) 2.5d));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            final float fM21591getLargeD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM();
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(BorderKt.m4876borderxT4_qwU(companion2, C2002Dp.m7995constructorimpl((float) 0.5d), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), RoundedCornerShape2.getCircleShape()), 0.0f, 1, null), fM21591getLargeD9Ej5fM);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i4 = i2 & 14;
            boolean zChanged = (i4 == 4) | composerStartRestartGroup.changed(fM21591getLargeD9Ej5fM);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.OpacitySliderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OpacitySlider4.OpacitySlider_3J_VO9M$lambda$14$lambda$5$lambda$4(j, fM21591getLargeD9Ej5fM, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierM5156height3ABfNKs, (Function1) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.OpacitySliderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OpacitySlider4.OpacitySlider_3J_VO9M$lambda$14$lambda$7$lambda$6((GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierDrawBehind, (Function1) objRememberedValue3);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChanged2 = (i4 == 4) | composerStartRestartGroup.changed(fM21591getLargeD9Ej5fM) | composerStartRestartGroup.changed(fMo5016toPx0680j_4);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.OpacitySliderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OpacitySlider4.OpacitySlider_3J_VO9M$lambda$14$lambda$9$lambda$8(j, fM21591getLargeD9Ej5fM, fMo5016toPx0680j_4, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifierGraphicsLayer, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            float floatValue = snapshotFloatState2.getFloatValue();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.OpacitySliderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OpacitySlider4.OpacitySlider_3J_VO9M$lambda$14$lambda$11$lambda$10(snapshotFloatState2, ((Float) obj).floatValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function1 function1 = (Function1) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.OpacitySliderKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OpacitySlider4.OpacitySlider_3J_VO9M$lambda$14$lambda$13$lambda$12(onValueChange, snapshotFloatState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            OpacitySlider opacitySlider = OpacitySlider.INSTANCE;
            composer2 = composerStartRestartGroup;
            SliderKt.Slider(floatValue, function1, modifierFillMaxWidth$default, false, (Function0) objRememberedValue6, null, null, 0, opacitySlider.m1792x9a8205d2(), opacitySlider.m1793xcb8129f(), null, composer2, 905970096, 0, 1256);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.OpacitySliderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OpacitySlider4.OpacitySlider_3J_VO9M$lambda$15(j, f, onValueChange, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpacitySlider_3J_VO9M$lambda$14$lambda$5$lambda$4(long j, float f, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        Brush brushM6679linearGradientmHitzGk$default = Brush.Companion.m6679linearGradientmHitzGk$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(j))}, 0L, 0L, 0, 14, (Object) null);
        float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f / 2));
        long jM6528constructorimpl = CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_4) & 4294967295L));
        float fMo5016toPx0680j_42 = drawBehind.mo5016toPx0680j_4(f);
        DrawScope.m6959drawRoundRectZuiqVtQ$default(drawBehind, brushM6679linearGradientmHitzGk$default, 0L, Size.m6575constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32))) << 32) | (4294967295L & Float.floatToRawIntBits(fMo5016toPx0680j_42))), jM6528constructorimpl, 0.0f, null, null, 0, EnumC7081g.f2778x3356acf6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpacitySlider_3J_VO9M$lambda$14$lambda$7$lambda$6(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.mo6762setCompositingStrategyaDBOjCE(GraphicsLayerModifier4.INSTANCE.m6750getOffscreenNrFUSI());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpacitySlider_3J_VO9M$lambda$14$lambda$9$lambda$8(long j, float f, float f2, DrawScope Canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        int iM6666getSrc0nO6VwU = BlendMode.INSTANCE.m6666getSrc0nO6VwU();
        Brush.Companion companion = Brush.INSTANCE;
        Float fValueOf = Float.valueOf(0.0f);
        BentoColor bentoColor = BentoColor.INSTANCE;
        Brush brushM6679linearGradientmHitzGk$default = Brush.Companion.m6679linearGradientmHitzGk$default(companion, new Tuples2[]{Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoColor.m21319getNightJet0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(j))}, 0L, 0L, 0, 14, (Object) null);
        int i5 = 2;
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f / 2));
        DrawScope.m6959drawRoundRectZuiqVtQ$default(Canvas, brushM6679linearGradientmHitzGk$default, 0L, Size.m6575constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(Canvas.mo5016toPx0680j_4(f)) & 4294967295L)), CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_4) & 4294967295L)), 0.0f, null, null, iM6666getSrc0nO6VwU, 114, null);
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) / f2);
        int iIntBitsToFloat2 = (int) (Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) / f2);
        long jM21319getNightJet0d7_KjU = bentoColor.m21319getNightJet0d7_KjU();
        if (iIntBitsToFloat >= 0) {
            int i6 = 0;
            while (true) {
                if (iIntBitsToFloat2 >= 0) {
                    int i7 = 0;
                    while (true) {
                        int iM6651getDstIn0nO6VwU = BlendMode.INSTANCE.m6651getDstIn0nO6VwU();
                        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(i7 * f2) & 4294967295L) | (Float.floatToRawIntBits(i6 * f2) << 32));
                        long jM6725getTransparent0d7_KjU = (i6 + i7) % i5 == 0 ? jM21319getNightJet0d7_KjU : Color.INSTANCE.m6725getTransparent0d7_KjU();
                        int i8 = i7;
                        i = iIntBitsToFloat2;
                        i2 = i6;
                        i4 = iIntBitsToFloat;
                        DrawScope.m6958drawRectnJ9OG0$default(Canvas, jM6725getTransparent0d7_KjU, jM6535constructorimpl, Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), 0.0f, null, null, iM6651getDstIn0nO6VwU, 56, null);
                        if (i8 == i) {
                            break;
                        }
                        i7 = i8 + 1;
                        iIntBitsToFloat2 = i;
                        i6 = i2;
                        iIntBitsToFloat = i4;
                        i5 = 2;
                    }
                    i3 = i4;
                } else {
                    i = iIntBitsToFloat2;
                    i2 = i6;
                    i3 = iIntBitsToFloat;
                }
                if (i2 == i3) {
                    break;
                }
                i6 = i2 + 1;
                iIntBitsToFloat = i3;
                iIntBitsToFloat2 = i;
                i5 = 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpacitySlider_3J_VO9M$lambda$14$lambda$11$lambda$10(SnapshotFloatState2 snapshotFloatState2, float f) {
        snapshotFloatState2.setFloatValue(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpacitySlider_3J_VO9M$lambda$14$lambda$13$lambda$12(Function1 function1, SnapshotFloatState2 snapshotFloatState2) {
        function1.invoke(Float.valueOf(snapshotFloatState2.getFloatValue()));
        return Unit.INSTANCE;
    }
}
