package com.robinhood.android.gold.hub.animations;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingFunctions;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.material.TextKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AnimatedYOffsetCharacterComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"AnimatedYOffsetCharacterComposable", "", "character", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "durationMillis", "", "delayMillis", "initialOffsetValue", "", "targetOffsetValue", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "easing", "Landroidx/compose/animation/core/Easing;", "AnimatedYOffsetCharacterComposable-zYA1wlE", "(CLandroidx/compose/ui/text/TextStyle;IIFFLandroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/animation/core/Easing;Landroidx/compose/runtime/Composer;II)V", "feature-gold-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.hub.animations.AnimatedYOffsetCharacterComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AnimatedYOffsetCharacterComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedYOffsetCharacterComposable_zYA1wlE$lambda$2(char c, TextStyle textStyle, int i, int i2, float f, float f2, Modifier modifier, Color color, Easing easing, int i3, int i4, Composer composer, int i5) {
        m15048AnimatedYOffsetCharacterComposablezYA1wlE(c, textStyle, i, i2, f, f2, modifier, color, easing, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* renamed from: AnimatedYOffsetCharacterComposable-zYA1wlE, reason: not valid java name */
    public static final void m15048AnimatedYOffsetCharacterComposablezYA1wlE(final char c, final TextStyle textStyle, final int i, final int i2, final float f, final float f2, Modifier modifier, Color color, Easing easing, Composer composer, final int i3, final int i4) {
        char c2;
        int i5;
        int i6;
        int i7;
        float f3;
        Modifier modifier2;
        Color color2;
        Easing easeInOut;
        Easing easing2;
        Composer composer2;
        final Color color3;
        final Easing easing3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Composer composerStartRestartGroup = composer.startRestartGroup(81351655);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
            c2 = c;
        } else if ((i3 & 6) == 0) {
            c2 = c;
            i5 = (composerStartRestartGroup.changed(c2) ? 4 : 2) | i3;
        } else {
            c2 = c;
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
            i6 = i;
        } else {
            i6 = i;
            if ((i3 & 384) == 0) {
                i5 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
            }
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
            i7 = i2;
        } else {
            i7 = i2;
            if ((i3 & 3072) == 0) {
                i5 |= composerStartRestartGroup.changed(i7) ? 2048 : 1024;
            }
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i5 |= 196608;
            f3 = f2;
        } else {
            f3 = f2;
            if ((i3 & 196608) == 0) {
                i5 |= composerStartRestartGroup.changed(f3) ? 131072 : 65536;
            }
        }
        int i8 = i4 & 64;
        if (i8 != 0) {
            i5 |= 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i3 & 1572864) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
        }
        int i9 = i4 & 128;
        if (i9 != 0) {
            i5 |= 12582912;
            color2 = color;
        } else {
            color2 = color;
            if ((i3 & 12582912) == 0) {
                i5 |= composerStartRestartGroup.changed(color2) ? 8388608 : 4194304;
            }
        }
        if ((i3 & 100663296) == 0) {
            if ((i4 & 256) == 0) {
                easeInOut = easing;
                int i10 = composerStartRestartGroup.changed(easeInOut) ? 67108864 : 33554432;
                i5 |= i10;
            } else {
                easeInOut = easing;
            }
            i5 |= i10;
        } else {
            easeInOut = easing;
        }
        if ((i5 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i9 != 0) {
                    color2 = null;
                }
                if ((i4 & 256) != 0) {
                    i5 &= -234881025;
                    easeInOut = EasingFunctions.getEaseInOut();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 256) != 0) {
                    i5 &= -234881025;
                }
            }
            Modifier modifier4 = modifier2;
            Color color4 = color2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81351655, i5, -1, "com.robinhood.android.gold.hub.animations.AnimatedYOffsetCharacterComposable (AnimatedYOffsetCharacterComposable.kt:31)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = Animatable2.Animatable$default(f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i5 & 458752) == 131072) | composerStartRestartGroup.changedInstance(animatable) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | ((((234881024 & i5) ^ 100663296) > 67108864 && composerStartRestartGroup.changed(easeInOut)) || (i5 & 100663296) == 67108864);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                Easing easing4 = easeInOut;
                AnimatedYOffsetCharacterComposable2 animatedYOffsetCharacterComposable2 = new AnimatedYOffsetCharacterComposable2(animatable, f3, i6, i7, easing4, null);
                easing2 = easing4;
                composerStartRestartGroup.updateRememberedValue(animatedYOffsetCharacterComposable2);
                objRememberedValue2 = animatedYOffsetCharacterComposable2;
            } else {
                easing2 = easeInOut;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            String strValueOf = String.valueOf(c2);
            composerStartRestartGroup.startReplaceGroup(869552174);
            long jM22031getColor0d7_KjU = color4 == null ? ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).m22031getColor0d7_KjU() : color4.getValue();
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m5665Text4IGK_g(strValueOf, OffsetKt.m5125offsetVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl(((Number) animatable.getValue()).floatValue()), 1, null), jM22031getColor0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, (i5 << 15) & 3670016, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            color3 = color4;
            easing3 = easing2;
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            easing3 = easeInOut;
            modifier3 = modifier2;
            color3 = color2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.animations.AnimatedYOffsetCharacterComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnimatedYOffsetCharacterComposable.AnimatedYOffsetCharacterComposable_zYA1wlE$lambda$2(c, textStyle, i, i2, f, f2, modifier3, color3, easing3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
