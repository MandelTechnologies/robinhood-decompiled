package com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows;

import android.annotation.SuppressLint;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderRowPriceText.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001aY\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\u00020\t*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\u00020\u001e*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\r\u0010!\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\"\u001a\r\u0010$\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\"\u001a\r\u0010%\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\"\u001a\r\u0010&\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\"¨\u0006'²\u0006\n\u0010(\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"lastPriceRowPillBackground", "Landroidx/compose/ui/Modifier;", "isLastPriceRow", "", "LadderRowPriceText", "", "priceText", "", "rowIndex", "", "middleIndex", "targetRotation", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "isVisible", "bold", "modifier", "LadderRowPriceText-mxsUjTo", "(Ljava/lang/String;IIFJZZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "measureWidth", "Landroidx/compose/ui/text/TextMeasurer;", "text", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measureWidth--hBUhpc", "(Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;J)I", "measureMaxWidthInDp", "Landroidx/compose/ui/unit/Dp;", "measureMaxWidthInDp-uDk-uXs", "(Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/runtime/Composer;I)F", "PreviewLadderRowPriceText", "(Landroidx/compose/runtime/Composer;I)V", "PreviewLadderRowPriceText_not_last_price_and_not_bold", "PreviewLadderRowPriceText_target_rotation_90", "PreviewLadderRowPriceText_target_rotation_180", "PreviewLadderRowPriceText_not_visible", "lib-trade-ladder_externalDebug", "displayText", "pendingText", "isAnimating"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class LadderRowPriceTextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRowPriceText_mxsUjTo$lambda$15(String str, int i, int i2, float f, long j, boolean z, boolean z2, boolean z3, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        m26209LadderRowPriceTextmxsUjTo(str, i, i2, f, j, z, z2, z3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderRowPriceText$lambda$17(int i, Composer composer, int i2) {
        PreviewLadderRowPriceText(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderRowPriceText_not_last_price_and_not_bold$lambda$18(int i, Composer composer, int i2) {
        PreviewLadderRowPriceText_not_last_price_and_not_bold(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderRowPriceText_not_visible$lambda$21(int i, Composer composer, int i2) {
        PreviewLadderRowPriceText_not_visible(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderRowPriceText_target_rotation_180$lambda$20(int i, Composer composer, int i2) {
        PreviewLadderRowPriceText_target_rotation_180(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderRowPriceText_target_rotation_90$lambda$19(int i, Composer composer, int i2) {
        PreviewLadderRowPriceText_target_rotation_90(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final Modifier lastPriceRowPillBackground(Modifier modifier, final boolean z) {
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt.lastPriceRowPillBackground.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Modifier modifierM5144paddingVpY3zN4$default;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(1071248708);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1071248708, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.lastPriceRowPillBackground.<anonymous> (LadderRowPriceText.kt:40)");
                }
                if (z) {
                    composer.startReplaceGroup(1963287051);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    modifierM5144paddingVpY3zN4$default = PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(PaddingKt.m5144paddingVpY3zN4$default(composed, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM())), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21597getXxsmallD9Ej5fM());
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1963620890);
                    modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(composed, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM5144paddingVpY3zN4$default;
            }
        }, 1, null);
    }

    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    /* renamed from: LadderRowPriceText-mxsUjTo, reason: not valid java name */
    public static final void m26209LadderRowPriceTextmxsUjTo(final String priceText, final int i, final int i2, final float f, final long j, final boolean z, final boolean z2, final boolean z3, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        Object objAnimatable$default;
        int i6;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object objMutableStateOf$default;
        SnapshotState snapshotState;
        Animatable animatable;
        SnapshotState snapshotState2;
        int i7;
        final Animatable animatable2;
        SnapshotState snapshotState3;
        int i8;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1544951019);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(priceText) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i5 |= 196608;
        } else if ((i3 & 196608) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((i4 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        if ((i4 & 128) != 0) {
            i5 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
        }
        int i9 = i4 & 256;
        if (i9 != 0) {
            i5 |= 100663296;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i3 & 100663296) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            }
        }
        if ((i5 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1544951019, i5, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceText (LadderRowPriceText.kt:65)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objAnimatable$default = Animatable2.Animatable$default(f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objAnimatable$default);
            } else {
                objAnimatable$default = objRememberedValue2;
            }
            Animatable animatable3 = (Animatable) objAnimatable$default;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i10 = i5 & 14;
            boolean z4 = i10 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == companion.getEmpty()) {
                i6 = 2;
                snapshotMutationPolicy = null;
                objMutableStateOf$default = SnapshotState3.mutableStateOf$default(priceText, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
            } else {
                objMutableStateOf$default = objRememberedValue3;
                i6 = 2;
                snapshotMutationPolicy = null;
            }
            SnapshotState snapshotState4 = (SnapshotState) objMutableStateOf$default;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i6, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            SnapshotState snapshotState5 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            SnapshotState snapshotState6 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState4) | (i10 == 4);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new LadderRowPriceTextKt$LadderRowPriceText$1$1(priceText, snapshotState4, snapshotState5, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(priceText, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, i10);
            Object value = animatable3.getValue();
            String strLadderRowPriceText_mxsUjTo$lambda$5 = LadderRowPriceText_mxsUjTo$lambda$5(snapshotState5);
            Boolean boolValueOf = Boolean.valueOf(LadderRowPriceText_mxsUjTo$lambda$8(snapshotState6));
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable3) | composerStartRestartGroup.changed(snapshotState4);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                snapshotState = snapshotState4;
                objRememberedValue7 = new LadderRowPriceTextKt$LadderRowPriceText$2$1(animatable3, snapshotState5, snapshotState6, snapshotState, null);
                animatable = animatable3;
                snapshotState2 = snapshotState6;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                snapshotState = snapshotState4;
                animatable = animatable3;
                snapshotState2 = snapshotState6;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(value, strLadderRowPriceText_mxsUjTo$lambda$5, boolValueOf, (Function2) objRememberedValue7, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1360708905);
            if (((Number) animatable.getTargetValue()).floatValue() == f) {
                animatable2 = animatable;
                snapshotState3 = snapshotState;
                i8 = 5004770;
            } else {
                int iCoerceAtMost = RangesKt.coerceAtMost(Math.abs(i - i2), 10) * 17;
                Float fValueOf = Float.valueOf(f);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(iCoerceAtMost) | composerStartRestartGroup.changedInstance(animatable) | ((i5 & 7168) == 2048);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                    i7 = i5;
                    animatable2 = animatable;
                    snapshotState3 = snapshotState;
                    i8 = 5004770;
                    objRememberedValue8 = new LadderRowPriceTextKt$LadderRowPriceText$3$1(coroutineScope, iCoerceAtMost, animatable2, f, snapshotState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    i7 = i5;
                    animatable2 = animatable;
                    snapshotState3 = snapshotState;
                    i8 = 5004770;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, (i7 >> 9) & 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(AnimationModifier.animateContentSize$default(modifier4, null, null, 3, null), j, null, 2, null);
            composerStartRestartGroup.startReplaceGroup(i8);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(animatable2);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LadderRowPriceTextKt.LadderRowPriceText_mxsUjTo$lambda$14$lambda$13(animatable2, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BoxWithConstraints.BoxWithConstraints(lastPriceRowPillBackground(GraphicsLayerModifier6.graphicsLayer(modifierM4872backgroundbw27NRU$default, (Function1) objRememberedValue9), z), null, false, ComposableLambda3.rememberComposableLambda(-2019054271, true, new LadderRowPriceTextKt$LadderRowPriceText$5(z3, animatable2, z2, snapshotState3), composerStartRestartGroup, 54), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowPriceTextKt.LadderRowPriceText_mxsUjTo$lambda$15(priceText, i, i2, f, j, z, z2, z3, modifier3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LadderRowPriceText_mxsUjTo$lambda$9(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String LadderRowPriceText_mxsUjTo$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String LadderRowPriceText_mxsUjTo$lambda$5(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LadderRowPriceText_mxsUjTo$lambda$8(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRowPriceText_mxsUjTo$lambda$14$lambda$13(Animatable animatable, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationY(((Number) animatable.getValue()).floatValue());
        graphicsLayer.setCameraDistance(graphicsLayer.getDensity() * 12.0f);
        return Unit.INSTANCE;
    }

    /* renamed from: measureWidth--hBUhpc, reason: not valid java name */
    private static final int m26212measureWidthhBUhpc(TextMeasurer textMeasurer, String str, TextStyle textStyle, long j) {
        return (int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, str, textStyle, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, j, null, null, null, false, 960, null).getSize() >> 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: measureMaxWidthInDp-uDk-uXs, reason: not valid java name */
    public static final float m26211measureMaxWidthInDpuDkuXs(TextMeasurer textMeasurer, String str, TextStyle textStyle, long j, Composer composer, int i) {
        composer.startReplaceGroup(-1344708833);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344708833, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.measureMaxWidthInDp (LadderRowPriceText.kt:173)");
        }
        float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(m26212measureWidthhBUhpc(textMeasurer, str, textStyle, j));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fMo5013toDpu2uoSUM;
    }

    public static final void PreviewLadderRowPriceText(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1424464944);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1424464944, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.PreviewLadderRowPriceText (LadderRowPriceText.kt:181)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LadderRowPriceTextKt.INSTANCE.m26186getLambda$1947062392$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowPriceTextKt.PreviewLadderRowPriceText$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewLadderRowPriceText_not_last_price_and_not_bold(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-71923075);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-71923075, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.PreviewLadderRowPriceText_not_last_price_and_not_bold (LadderRowPriceText.kt:198)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LadderRowPriceTextKt.INSTANCE.m26185getLambda$1733422539$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowPriceTextKt.PreviewLadderRowPriceText_not_last_price_and_not_bold$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewLadderRowPriceText_target_rotation_90(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1001005705);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1001005705, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.PreviewLadderRowPriceText_target_rotation_90 (LadderRowPriceText.kt:215)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LadderRowPriceTextKt.INSTANCE.m26187getLambda$478114863$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowPriceTextKt.PreviewLadderRowPriceText_target_rotation_90$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewLadderRowPriceText_target_rotation_180(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(514670375);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(514670375, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.PreviewLadderRowPriceText_target_rotation_180 (LadderRowPriceText.kt:232)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LadderRowPriceTextKt.INSTANCE.getLambda$1906573023$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowPriceTextKt.PreviewLadderRowPriceText_target_rotation_180$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewLadderRowPriceText_not_visible(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1374616425);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1374616425, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.PreviewLadderRowPriceText_not_visible (LadderRowPriceText.kt:249)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LadderRowPriceTextKt.INSTANCE.getLambda$1707015247$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowPriceTextKt.PreviewLadderRowPriceText_not_visible$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
