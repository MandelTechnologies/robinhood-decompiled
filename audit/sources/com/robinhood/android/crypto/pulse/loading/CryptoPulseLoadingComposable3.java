package com.robinhood.android.crypto.pulse.loading;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoPulseLoadingComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"CryptoPulseLoadingComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoPulseLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-pulse_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.pulse.loading.CryptoPulseLoadingComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPulseLoadingComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseLoadingComposable$lambda$4(Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoPulseLoadingComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseLoadingPreview$lambda$5(int i, Composer composer, int i2) {
        CryptoPulseLoadingPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CryptoPulseLoadingComposable(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1061169261);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1061169261, i3, -1, "com.robinhood.android.crypto.pulse.loading.CryptoPulseLoadingComposable (CryptoPulseLoadingComposable.kt:24)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            final long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
            final long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), 0.33f, 0.0f, 0.0f, 0.0f, 14, null);
            final float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
            final float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged = composerStartRestartGroup.changed(fM21590getDefaultD9Ej5fM) | composerStartRestartGroup.changed(jM6705copywmQWz5c$default) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.pulse.loading.CryptoPulseLoadingComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoPulseLoadingComposable3.CryptoPulseLoadingComposable$lambda$3$lambda$1$lambda$0(fM21590getDefaultD9Ej5fM, fM7995constructorimpl, jM6705copywmQWz5c$default, jM21371getBg0d7_KjU, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifierFillMaxSize$default2, (Function1) objRememberedValue, composerStartRestartGroup, 6);
            Modifier modifierAlign = boxScopeInstance.align(companion3, companion.getCenter());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_robinhood, null, false, BentoPogSize.Hero, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()), composerStartRestartGroup, 1575936, 22);
            ProgressIndicatorKt.m5922CircularProgressIndicatorLxG7B9w(SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(100)), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), C2002Dp.m7995constructorimpl(2), 0L, 0, composerStartRestartGroup, 390, 24);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.pulse.loading.CryptoPulseLoadingComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPulseLoadingComposable3.CryptoPulseLoadingComposable$lambda$4(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseLoadingComposable$lambda$3$lambda$1$lambda$0(float f, float f2, long j, long j2, DrawScope drawScope) {
        long j3;
        float f3;
        int i;
        int i2;
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(f);
        float fMo5016toPx0680j_42 = Canvas.mo5016toPx0680j_4(f2);
        float f4 = fMo5016toPx0680j_4 + (2 * fMo5016toPx0680j_42);
        long j4 = 4294967295L;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) / f4);
        int iIntBitsToFloat2 = (int) (Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) / f4);
        if (iIntBitsToFloat >= 0) {
            int i3 = 0;
            while (true) {
                if (iIntBitsToFloat2 >= 0) {
                    int i4 = 0;
                    while (true) {
                        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits((i3 * f4) + fMo5016toPx0680j_42) & j4) | (Float.floatToRawIntBits((i4 * f4) + fMo5016toPx0680j_42) << 32));
                        int i5 = i4;
                        f3 = f4;
                        j3 = j4;
                        i = iIntBitsToFloat2;
                        i2 = i3;
                        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, fMo5016toPx0680j_42, jM6535constructorimpl, 0.0f, null, null, 0, 120, null);
                        if (i5 == i) {
                            break;
                        }
                        i4 = i5 + 1;
                        Canvas = drawScope;
                        iIntBitsToFloat2 = i;
                        i3 = i2;
                        f4 = f3;
                        j4 = j3;
                    }
                } else {
                    f3 = f4;
                    j3 = j4;
                    i = iIntBitsToFloat2;
                    i2 = i3;
                }
                if (i2 == iIntBitsToFloat) {
                    break;
                }
                i3 = i2 + 1;
                Canvas = drawScope;
                iIntBitsToFloat2 = i;
                f4 = f3;
                j4 = j3;
            }
        } else {
            j3 = 4294967295L;
        }
        DrawScope.m6957drawRectAsUm42w$default(drawScope, Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(j2, 1.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, Float.intBitsToFloat((int) (drawScope.mo6963getSizeNHjbRc() & j3)), 0, 8, (Object) null), 0L, drawScope.mo6963getSizeNHjbRc(), 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        return Unit.INSTANCE;
    }

    private static final void CryptoPulseLoadingPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(629647297);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(629647297, i, -1, "com.robinhood.android.crypto.pulse.loading.CryptoPulseLoadingPreview (CryptoPulseLoadingComposable.kt:89)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoPulseLoadingComposable.INSTANCE.getLambda$1397817721$feature_crypto_pulse_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.pulse.loading.CryptoPulseLoadingComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPulseLoadingComposable3.CryptoPulseLoadingPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
