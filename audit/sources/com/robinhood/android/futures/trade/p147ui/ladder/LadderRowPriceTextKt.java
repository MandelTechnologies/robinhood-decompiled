package com.robinhood.android.futures.trade.p147ui.ladder;

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
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001aa\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\n*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a3\u0010\u001e\u001a\u00020\u001f*\u00020\u00162\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\"\u0010#\u001a\r\u0010$\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010%\u001a\r\u0010'\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010%\u001a\r\u0010(\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010%¨\u0006)"}, m3636d2 = {"lastPriceRowPillBackground", "Landroidx/compose/ui/Modifier;", "isLastPriceRow", "", "LadderRowPriceText", "", "priceText", "", "pnLText", "rowIndex", "", "middleIndex", "targetRotation", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "isVisible", "bold", "modifier", "LadderRowPriceText-Yod850M", "(Ljava/lang/String;Ljava/lang/String;IIFJZZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "measureWidth", "Landroidx/compose/ui/text/TextMeasurer;", "text", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measureWidth--hBUhpc", "(Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;J)I", "measureMaxWidthInDp", "Landroidx/compose/ui/unit/Dp;", "first", "second", "measureMaxWidthInDp-WeOhcdQ", "(Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/runtime/Composer;I)F", "PreviewLadderRowPriceText_same_length_for_price_and_pnl", "(Landroidx/compose/runtime/Composer;I)V", "PreviewLadderRowPriceText_not_last_price_and_not_bold", "PreviewLadderRowPriceText_target_rotation_180", "PreviewLadderRowPriceText_not_visible", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LadderRowPriceTextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRowPriceText_Yod850M$lambda$4(String str, String str2, int i, int i2, float f, long j, boolean z, boolean z2, boolean z3, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        m14833LadderRowPriceTextYod850M(str, str2, i, i2, f, j, z, z2, z3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderRowPriceText_not_last_price_and_not_bold$lambda$7(int i, Composer composer, int i2) {
        PreviewLadderRowPriceText_not_last_price_and_not_bold(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderRowPriceText_not_visible$lambda$9(int i, Composer composer, int i2) {
        PreviewLadderRowPriceText_not_visible(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderRowPriceText_same_length_for_price_and_pnl$lambda$6(int i, Composer composer, int i2) {
        PreviewLadderRowPriceText_same_length_for_price_and_pnl(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderRowPriceText_target_rotation_180$lambda$8(int i, Composer composer, int i2) {
        PreviewLadderRowPriceText_target_rotation_180(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final Modifier lastPriceRowPillBackground(Modifier modifier, final boolean z) {
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceTextKt.lastPriceRowPillBackground.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Modifier modifierM5144paddingVpY3zN4$default;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(1008131958);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1008131958, i, -1, "com.robinhood.android.futures.trade.ui.ladder.lastPriceRowPillBackground.<anonymous> (LadderRowPriceText.kt:36)");
                }
                if (z) {
                    composer.startReplaceGroup(-1447103847);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    modifierM5144paddingVpY3zN4$default = PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(PaddingKt.m5144paddingVpY3zN4$default(composed, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM())), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21597getXxsmallD9Ej5fM());
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1446770008);
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

    /* JADX WARN: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.animation.core.FiniteAnimationSpec, java.lang.Object, kotlin.jvm.functions.Function2] */
    /* renamed from: LadderRowPriceText-Yod850M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14833LadderRowPriceTextYod850M(final String priceText, final String pnLText, final int i, final int i2, final float f, final long j, final boolean z, final boolean z2, final boolean z3, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Animatable animatable;
        int i7;
        Object ladderRowPriceTextKt$LadderRowPriceText$1$1;
        final Animatable animatable2;
        boolean z4;
        boolean z5;
        ?? r3;
        boolean zChangedInstance;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(pnLText, "pnLText");
        Composer composerStartRestartGroup = composer.startRestartGroup(2026401260);
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
            i5 |= composerStartRestartGroup.changed(pnLText) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i5 |= 196608;
        } else if ((i3 & 196608) == 0) {
            i5 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((i4 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((i4 & 128) != 0) {
            i5 |= 12582912;
        } else {
            if ((i3 & 12582912) == 0) {
                i5 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
            }
            if ((i4 & 256) != 0) {
                if ((i3 & 100663296) == 0) {
                    i5 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
                }
                i6 = i4 & 512;
                if (i6 != 0) {
                    i5 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i5 |= composerStartRestartGroup.changed(modifier) ? 536870912 : 268435456;
                }
                if ((i5 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2026401260, i5, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceText (LadderRowPriceText.kt:61)");
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = Animatable2.Animatable$default(f, 0.0f, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    animatable = (Animatable) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1751439270);
                    if (((Number) animatable.getTargetValue()).floatValue() != f) {
                        animatable2 = animatable;
                        r3 = 0;
                        z5 = true;
                    } else {
                        int iCoerceAtMost = RangesKt.coerceAtMost(Math.abs(i - i2), 10) * 17;
                        Float fValueOf = Float.valueOf(f);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance2 = ((i5 & 57344) == 16384) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(iCoerceAtMost);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                            i7 = i5;
                            animatable2 = animatable;
                            z4 = false;
                            z5 = true;
                            ladderRowPriceTextKt$LadderRowPriceText$1$1 = new LadderRowPriceTextKt$LadderRowPriceText$1$1(coroutineScope, animatable2, f, iCoerceAtMost, null);
                            composerStartRestartGroup.updateRememberedValue(ladderRowPriceTextKt$LadderRowPriceText$1$1);
                        } else {
                            i7 = i5;
                            animatable2 = animatable;
                            z5 = true;
                            ladderRowPriceTextKt$LadderRowPriceText$1$1 = objRememberedValue4;
                            z4 = false;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) ladderRowPriceTextKt$LadderRowPriceText$1$1, composerStartRestartGroup, (i7 >> 12) & 14);
                        r3 = z4;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(AnimationModifier.animateContentSize$default(modifier3, r3, r3, 3, r3), j, null, 2, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(animatable2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceTextKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LadderRowPriceTextKt.LadderRowPriceText_Yod850M$lambda$3$lambda$2(animatable2, (GraphicsLayerScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierLastPriceRowPillBackground = lastPriceRowPillBackground(GraphicsLayerModifier6.graphicsLayer(modifierM4872backgroundbw27NRU$default, (Function1) objRememberedValue3), z);
                    Modifier modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraints.BoxWithConstraints(modifierLastPriceRowPillBackground, null, false, ComposableLambda3.rememberComposableLambda(-1351605310, z5, new LadderRowPriceTextKt$LadderRowPriceText$3(z3, priceText, pnLText, animatable2, z2), composerStartRestartGroup, 54), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceTextKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LadderRowPriceTextKt.LadderRowPriceText_Yod850M$lambda$4(priceText, pnLText, i, i2, f, j, z, z2, z3, modifier2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 100663296;
            i6 = i4 & 512;
            if (i6 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                animatable = (Animatable) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1751439270);
                if (((Number) animatable.getTargetValue()).floatValue() != f) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(AnimationModifier.animateContentSize$default(modifier3, r3, r3, 3, r3), j, null, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(animatable2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceTextKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LadderRowPriceTextKt.LadderRowPriceText_Yod850M$lambda$3$lambda$2(animatable2, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierLastPriceRowPillBackground2 = lastPriceRowPillBackground(GraphicsLayerModifier6.graphicsLayer(modifierM4872backgroundbw27NRU$default2, (Function1) objRememberedValue3), z);
                    Modifier modifier42 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraints.BoxWithConstraints(modifierLastPriceRowPillBackground2, null, false, ComposableLambda3.rememberComposableLambda(-1351605310, z5, new LadderRowPriceTextKt$LadderRowPriceText$3(z3, priceText, pnLText, animatable2, z2), composerStartRestartGroup, 54), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i4 & 256) != 0) {
        }
        i6 = i4 & 512;
        if (i6 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRowPriceText_Yod850M$lambda$3$lambda$2(Animatable animatable, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationY(((Number) animatable.getValue()).floatValue());
        graphicsLayer.setCameraDistance(graphicsLayer.getDensity() * 12.0f);
        return Unit.INSTANCE;
    }

    /* renamed from: measureWidth--hBUhpc, reason: not valid java name */
    private static final int m14836measureWidthhBUhpc(TextMeasurer textMeasurer, String str, TextStyle textStyle, long j) {
        return (int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, str, textStyle, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, j, null, null, null, false, 960, null).getSize() >> 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: measureMaxWidthInDp-WeOhcdQ, reason: not valid java name */
    public static final float m14835measureMaxWidthInDpWeOhcdQ(TextMeasurer textMeasurer, String str, String str2, TextStyle textStyle, long j, Composer composer, int i) {
        composer.startReplaceGroup(623757290);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(623757290, i, -1, "com.robinhood.android.futures.trade.ui.ladder.measureMaxWidthInDp (LadderRowPriceText.kt:143)");
        }
        float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(Math.max(m14836measureWidthhBUhpc(textMeasurer, str, textStyle, j), m14836measureWidthhBUhpc(textMeasurer, str2, textStyle, j)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fMo5013toDpu2uoSUM;
    }

    public static final void PreviewLadderRowPriceText_same_length_for_price_and_pnl(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-23373041);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-23373041, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewLadderRowPriceText_same_length_for_price_and_pnl (LadderRowPriceText.kt:153)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LadderRowPriceTextKt.INSTANCE.getLambda$175936087$feature_futures_trade_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceTextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowPriceTextKt.PreviewLadderRowPriceText_same_length_for_price_and_pnl$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewLadderRowPriceText_not_last_price_and_not_bold(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2032675299);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2032675299, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewLadderRowPriceText_not_last_price_and_not_bold (LadderRowPriceText.kt:171)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LadderRowPriceTextKt.INSTANCE.getLambda$783171429$feature_futures_trade_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceTextKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowPriceTextKt.PreviewLadderRowPriceText_not_last_price_and_not_bold$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewLadderRowPriceText_target_rotation_180(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1193630259);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1193630259, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewLadderRowPriceText_target_rotation_180 (LadderRowPriceText.kt:189)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LadderRowPriceTextKt.INSTANCE.m14768getLambda$92435589$feature_futures_trade_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceTextKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowPriceTextKt.PreviewLadderRowPriceText_target_rotation_180$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewLadderRowPriceText_not_visible(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-954681661);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-954681661, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewLadderRowPriceText_not_visible (LadderRowPriceText.kt:207)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LadderRowPriceTextKt.INSTANCE.m14767getLambda$398807029$feature_futures_trade_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowPriceTextKt.PreviewLadderRowPriceText_not_visible$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
