package com.robinhood.android.gold.hub.animations;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.EasingFunctions;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AnimatedStringComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0097\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\f*\u00020\u001bH\u0002¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"AnimatedStringComposable", "", "initialString", "", "updatedString", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "animationDirection", "Lcom/robinhood/android/gold/hub/animations/AnimatedStringDirection;", "characterDurationMillis", "", "totalAnimationDurationMillis", "alphaAnimationDurationMillis", "alignment", "Landroidx/compose/ui/Alignment;", "textColor", "Landroidx/compose/ui/graphics/Color;", "initialStringDelayMillis", "updatedStringDelayMillis", "animatedCharDelayMillis", "mergeDescendants", "", "AnimatedStringComposable-53OSo0s", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/hub/animations/AnimatedStringDirection;IIILandroidx/compose/ui/Alignment;Landroidx/compose/ui/graphics/Color;IIIZLandroidx/compose/runtime/Composer;III)V", "framesToMillis", "", "feature-gold-hub_externalDebug", "shouldInitialTextExist"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AnimatedStringComposable {

    /* compiled from: AnimatedStringComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimatedStringComposable3.values().length];
            try {
                iArr[AnimatedStringComposable3.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimatedStringComposable3.RTL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedStringComposable_53OSo0s$lambda$16(String str, String str2, TextStyle textStyle, Modifier modifier, AnimatedStringComposable3 animatedStringComposable3, int i, int i2, int i3, Alignment alignment, Color color, int i4, int i5, int i6, boolean z, int i7, int i8, int i9, Composer composer, int i10) {
        m15047AnimatedStringComposable53OSo0s(str, str2, textStyle, modifier, animatedStringComposable3, i, i2, i3, alignment, color, i4, i5, i6, z, composer, RecomposeScopeImpl4.updateChangedFlags(i7 | 1), RecomposeScopeImpl4.updateChangedFlags(i8), i9);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:353:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* renamed from: AnimatedStringComposable-53OSo0s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15047AnimatedStringComposable53OSo0s(final String initialString, final String updatedString, final TextStyle textStyle, Modifier modifier, AnimatedStringComposable3 animatedStringComposable3, int i, int i2, int i3, Alignment alignment, Color color, int i4, int i5, int i6, boolean z, Composer composer, final int i7, final int i8, final int i9) {
        int i10;
        Modifier modifier2;
        int i11;
        int i12;
        int i13;
        int i14;
        final int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Modifier modifier3;
        AnimatedStringComposable3 animatedStringComposable32;
        int iFramesToMillis;
        final Alignment topStart;
        Color color2;
        int i24;
        int i25;
        int i26;
        int length;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z2;
        AnimatedStringComposable3 animatedStringComposable33;
        int i31;
        Object objRememberedValue;
        Composer.Companion companion;
        Color color3;
        int i32;
        final Animatable animatable;
        Object objRememberedValue2;
        int i33;
        Animatable animatable2;
        Object objRememberedValue3;
        SnapshotState4 snapshotState4;
        boolean zChangedInstance;
        Object objRememberedValue4;
        Animatable animatable3;
        int i34;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Color color4;
        Composer composer2;
        boolean z3;
        Object objRememberedValue5;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i35;
        final Color color5;
        final int i36;
        final int i37;
        final int i38;
        final AnimatedStringComposable3 animatedStringComposable34;
        final int i39;
        final Modifier modifier4;
        final boolean z4;
        final int i40;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(initialString, "initialString");
        Intrinsics.checkNotNullParameter(updatedString, "updatedString");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-619826968);
        if ((i9 & 1) != 0) {
            i10 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(initialString) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i7 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(updatedString) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i7 & 384) == 0) {
            i10 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
        }
        int i41 = i9 & 8;
        if (i41 != 0) {
            i10 |= 3072;
        } else {
            if ((i7 & 3072) == 0) {
                modifier2 = modifier;
                i10 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i11 = i9 & 16;
            if (i11 == 0) {
                i10 |= 24576;
            } else if ((i7 & 24576) == 0) {
                i10 |= composerStartRestartGroup.changed(animatedStringComposable3 == null ? -1 : animatedStringComposable3.ordinal()) ? 16384 : 8192;
            }
            i12 = i9 & 32;
            if (i12 == 0) {
                i10 |= 196608;
                i13 = i;
            } else {
                i13 = i;
                if ((i7 & 196608) == 0) {
                    i10 |= composerStartRestartGroup.changed(i13) ? 131072 : 65536;
                }
            }
            if ((i7 & 1572864) != 0) {
                i14 = i2;
                i10 |= ((i9 & 64) == 0 && composerStartRestartGroup.changed(i14)) ? 1048576 : 524288;
            } else {
                i14 = i2;
            }
            if ((i7 & 12582912) != 0) {
                if ((i9 & 128) == 0) {
                    i15 = i3;
                    int i42 = composerStartRestartGroup.changed(i15) ? 8388608 : 4194304;
                    i10 |= i42;
                } else {
                    i15 = i3;
                }
                i10 |= i42;
            } else {
                i15 = i3;
            }
            i16 = i9 & 256;
            if (i16 == 0) {
                i10 |= 100663296;
            } else if ((i7 & 100663296) == 0) {
                i10 |= composerStartRestartGroup.changed(alignment) ? 67108864 : 33554432;
            }
            i17 = i9 & 512;
            if (i17 != 0) {
                if ((i7 & 805306368) == 0) {
                    i18 = i17;
                    i10 |= composerStartRestartGroup.changed(color) ? 536870912 : 268435456;
                }
                i19 = i9 & 1024;
                if (i19 != 0) {
                    i21 = i8 | 6;
                    i20 = i19;
                } else if ((i8 & 6) == 0) {
                    i20 = i19;
                    i21 = i8 | (composerStartRestartGroup.changed(i4) ? 4 : 2);
                } else {
                    i20 = i19;
                    i21 = i8;
                }
                if ((i8 & 48) == 0) {
                    i21 |= ((i9 & 2048) == 0 && composerStartRestartGroup.changed(i5)) ? 32 : 16;
                }
                if ((i8 & 384) == 0) {
                    i21 |= ((i9 & 4096) == 0 && composerStartRestartGroup.changed(i6)) ? 256 : 128;
                }
                int i43 = i21;
                i22 = i9 & 8192;
                if (i22 != 0) {
                    i23 = i43 | 3072;
                } else if ((i8 & 3072) == 0) {
                    i23 = i43 | (composerStartRestartGroup.changed(z) ? 2048 : 1024);
                } else {
                    i23 = i43;
                }
                if ((i10 & 306783379) == 306783378 && (i23 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    animatedStringComposable34 = animatedStringComposable3;
                    topStart = alignment;
                    color5 = color;
                    i38 = i6;
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    i40 = i14;
                    i37 = i13;
                    i36 = i4;
                    i39 = i5;
                    z4 = z;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i7 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i41 == 0 ? Modifier.INSTANCE : modifier2;
                        animatedStringComposable32 = i11 == 0 ? AnimatedStringComposable3.LTR : animatedStringComposable3;
                        if (i12 != 0) {
                            i13 = 500;
                        }
                        if ((i9 & 64) == 0) {
                            iFramesToMillis = framesToMillis(17.0f);
                            i10 &= -3670017;
                        } else {
                            iFramesToMillis = i14;
                        }
                        if ((i9 & 128) != 0) {
                            i10 &= -29360129;
                            i15 = iFramesToMillis;
                        }
                        topStart = i16 == 0 ? Alignment.INSTANCE.getTopStart() : alignment;
                        color2 = i18 == 0 ? null : color;
                        i24 = i20 == 0 ? 0 : i4;
                        if ((i9 & 2048) == 0) {
                            i25 = i23 & (-113);
                            i26 = i24;
                        } else {
                            i25 = i23;
                            i26 = i5;
                        }
                        int i44 = i26;
                        if ((i9 & 4096) == 0) {
                            length = (iFramesToMillis - i13) / (initialString.length() + updatedString.length());
                            i25 &= -897;
                        } else {
                            length = i6;
                        }
                        if (i22 == 0) {
                            i27 = length;
                            i28 = i25;
                            i29 = i10;
                            z2 = false;
                            i30 = i44;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                animatedStringComposable33 = animatedStringComposable32;
                                i31 = iFramesToMillis;
                            } else {
                                animatedStringComposable33 = animatedStringComposable32;
                                i31 = iFramesToMillis;
                                ComposerKt.traceEventStart(-619826968, i29, i28, "com.robinhood.android.gold.hub.animations.AnimatedStringComposable (AnimatedStringComposable.kt:61)");
                            }
                            int i45 = i28;
                            int i46 = i29;
                            float fMo5015toPxR2X_6o = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5015toPxR2X_6o(textStyle.m7662getFontSizeXSAIIZE());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue != companion.getEmpty()) {
                                color3 = color2;
                                i32 = 2;
                                Animatable animatableAnimatable$default = Animatable2.Animatable$default(1.0f, 0.0f, 2, null);
                                composerStartRestartGroup.updateRememberedValue(animatableAnimatable$default);
                                objRememberedValue = animatableAnimatable$default;
                            } else {
                                color3 = color2;
                                i32 = 2;
                            }
                            animatable = (Animatable) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            i33 = i24;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = Animatable2.Animatable$default(0.0f, 0.0f, i32, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            animatable2 = (Animatable) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Boolean.valueOf(AnimatedStringComposable.AnimatedStringComposable_53OSo0s$lambda$4$lambda$3(animatable));
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            snapshotState4 = (SnapshotState4) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            Unit unit = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = ((((i46 & 29360128) ^ 12582912) <= 8388608 && composerStartRestartGroup.changed(i15)) || (i46 & 12582912) == 8388608) | composerStartRestartGroup.changedInstance(animatable) | ((i45 & 14) == 4) | composerStartRestartGroup.changedInstance(animatable2) | ((((i45 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(i30)) || (i45 & 48) == 32);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new AnimatedStringComposable2(animatable, i15, i33, animatable2, i30, null);
                                animatable3 = animatable;
                                i34 = i33;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                animatable3 = animatable;
                                i34 = i33;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i47 = i30;
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                            int i48 = i46 >> 9;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Modifier modifier5 = modifier3;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor);
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            int i49 = i15;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-222652863);
                            if (AnimatedStringComposable_53OSo0s$lambda$5(snapshotState4)) {
                                color4 = color3;
                                composer2 = composerStartRestartGroup;
                            } else {
                                Modifier modifierClip = Clip.clip(Alpha.alpha(Modifier.INSTANCE, ((Number) animatable3.getValue()).floatValue()), RectangleShape2.getRectangleShape());
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean z5 = (i46 & 14) == 4;
                                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (z5 || objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AnimatedStringComposable.AnimatedStringComposable_53OSo0s$lambda$15$lambda$8$lambda$7(initialString, (SemanticsPropertyReceiver) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierSemantics = SemanticsModifier6.semantics(modifierClip, z2, (Function1) objRememberedValue6);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics);
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
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier2, companion2.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(1632078282);
                                int length2 = 0;
                                int i50 = 0;
                                while (i50 < initialString.length()) {
                                    char cCharAt = initialString.charAt(i50);
                                    int i51 = length2 + 1;
                                    int i52 = WhenMappings.$EnumSwitchMapping$0[animatedStringComposable33.ordinal()];
                                    if (i52 != 1) {
                                        if (i52 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        length2 = (initialString.length() - 1) - length2;
                                    }
                                    Composer composer3 = composerStartRestartGroup;
                                    AnimatedYOffsetCharacterComposable.m15048AnimatedYOffsetCharacterComposablezYA1wlE(cCharAt, textStyle, i13, (length2 * i27) + i34, 0.0f, -fMo5015toPxR2X_6o, null, color3, null, composer3, (i48 & 896) | ((i46 >> 3) & 112) | 24576 | ((i46 >> 6) & 29360128), EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
                                    i50++;
                                    composerStartRestartGroup = composer3;
                                    length2 = i51;
                                }
                                color4 = color3;
                                composer2 = composerStartRestartGroup;
                                composer2.endReplaceGroup();
                                composer2.endNode();
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierClip2 = Clip.clip(Alpha.alpha(Modifier.INSTANCE, ((Number) animatable2.getValue()).floatValue()), RectangleShape2.getRectangleShape());
                            composer2.startReplaceGroup(5004770);
                            z3 = (i46 & 112) != 32;
                            objRememberedValue5 = composer2.rememberedValue();
                            if (!z3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AnimatedStringComposable.AnimatedStringComposable_53OSo0s$lambda$15$lambda$12$lambda$11(updatedString, (SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue5);
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierSemantics2 = SemanticsModifier6.semantics(modifierClip2, z2, (Function1) objRememberedValue5);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierSemantics2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.useNode();
                            } else {
                                composer2.createNode(constructor3);
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier3, companion3.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            composer2.startReplaceGroup(-667254436);
                            i35 = 0;
                            int length3 = 0;
                            while (i35 < updatedString.length()) {
                                char cCharAt2 = updatedString.charAt(i35);
                                int i53 = length3 + 1;
                                int i54 = WhenMappings.$EnumSwitchMapping$0[animatedStringComposable33.ordinal()];
                                if (i54 != 1) {
                                    if (i54 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    length3 = (updatedString.length() - 1) - length3;
                                }
                                float f = fMo5015toPxR2X_6o;
                                AnimatedYOffsetCharacterComposable.m15048AnimatedYOffsetCharacterComposablezYA1wlE(cCharAt2, textStyle, i13, i47 + (length3 * i27), f, 0.0f, null, color4, EasingFunctions.getEaseOut(), composer2, ((i46 >> 3) & 112) | 196608 | (i48 & 896) | ((i46 >> 6) & 29360128), 64);
                                i35++;
                                fMo5015toPxR2X_6o = f;
                                length3 = i53;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            color5 = color4;
                            i36 = i34;
                            i37 = i13;
                            i38 = i27;
                            animatedStringComposable34 = animatedStringComposable33;
                            i39 = i47;
                            modifier4 = modifier5;
                            i15 = i49;
                            z4 = z2;
                            i40 = i31;
                        } else {
                            i27 = length;
                            i28 = i25;
                            i29 = i10;
                            i30 = i44;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i9 & 64) != 0) {
                            i10 &= -3670017;
                        }
                        if ((i9 & 128) != 0) {
                            i10 &= -29360129;
                        }
                        if ((i9 & 2048) != 0) {
                            i23 &= -113;
                        }
                        if ((i9 & 4096) != 0) {
                            i23 &= -897;
                        }
                        animatedStringComposable32 = animatedStringComposable3;
                        topStart = alignment;
                        i24 = i4;
                        i27 = i6;
                        i28 = i23;
                        i29 = i10;
                        modifier3 = modifier2;
                        iFramesToMillis = i14;
                        color2 = color;
                        i30 = i5;
                    }
                    z2 = z;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i452 = i28;
                    int i462 = i29;
                    float fMo5015toPxR2X_6o2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5015toPxR2X_6o(textStyle.m7662getFontSizeXSAIIZE());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue != companion.getEmpty()) {
                    }
                    animatable = (Animatable) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    i33 = i24;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    animatable2 = (Animatable) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    snapshotState4 = (SnapshotState4) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    if (((i462 & 29360128) ^ 12582912) <= 8388608) {
                        if (((i452 & 112) ^ 48) > 32) {
                            zChangedInstance = ((((i462 & 29360128) ^ 12582912) <= 8388608 && composerStartRestartGroup.changed(i15)) || (i462 & 12582912) == 8388608) | composerStartRestartGroup.changedInstance(animatable) | ((i452 & 14) == 4) | composerStartRestartGroup.changedInstance(animatable2) | ((((i452 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(i30)) || (i452 & 48) == 32);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue4 = new AnimatedStringComposable2(animatable, i15, i33, animatable2, i30, null);
                                animatable3 = animatable;
                                i34 = i33;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                int i472 = i30;
                                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                                int i482 = i462 >> 9;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                Modifier modifier52 = modifier3;
                                Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                int i492 = i15;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(-222652863);
                                    if (AnimatedStringComposable_53OSo0s$lambda$5(snapshotState4)) {
                                    }
                                    composer2.endReplaceGroup();
                                    Modifier modifierClip22 = Clip.clip(Alpha.alpha(Modifier.INSTANCE, ((Number) animatable2.getValue()).floatValue()), RectangleShape2.getRectangleShape());
                                    composer2.startReplaceGroup(5004770);
                                    if ((i462 & 112) != 32) {
                                    }
                                    objRememberedValue5 = composer2.rememberedValue();
                                    if (!z3) {
                                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AnimatedStringComposable.AnimatedStringComposable_53OSo0s$lambda$15$lambda$12$lambda$11(updatedString, (SemanticsPropertyReceiver) obj);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue5);
                                        composer2.endReplaceGroup();
                                        Modifier modifierSemantics22 = SemanticsModifier6.semantics(modifierClip22, z2, (Function1) objRememberedValue5);
                                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierSemantics22);
                                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                        if (composer2.getApplier() == null) {
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                        }
                                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion32.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl2.getInserting()) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier32, companion32.getSetModifier());
                                            Row6 row622 = Row6.INSTANCE;
                                            composer2.startReplaceGroup(-667254436);
                                            i35 = 0;
                                            int length32 = 0;
                                            while (i35 < updatedString.length()) {
                                            }
                                            composer2.endReplaceGroup();
                                            composer2.endNode();
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            color5 = color4;
                                            i36 = i34;
                                            i37 = i13;
                                            i38 = i27;
                                            animatedStringComposable34 = animatedStringComposable33;
                                            i39 = i472;
                                            modifier4 = modifier52;
                                            i15 = i492;
                                            z4 = z2;
                                            i40 = i31;
                                        }
                                    }
                                }
                            }
                        } else {
                            zChangedInstance = ((((i462 & 29360128) ^ 12582912) <= 8388608 && composerStartRestartGroup.changed(i15)) || (i462 & 12582912) == 8388608) | composerStartRestartGroup.changedInstance(animatable) | ((i452 & 14) == 4) | composerStartRestartGroup.changedInstance(animatable2) | ((((i452 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(i30)) || (i452 & 48) == 32);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AnimatedStringComposable.AnimatedStringComposable_53OSo0s$lambda$16(initialString, updatedString, textStyle, modifier4, animatedStringComposable34, i37, i40, i15, topStart, color5, i36, i39, i38, z4, i7, i8, i9, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i10 |= 805306368;
            i18 = i17;
            i19 = i9 & 1024;
            if (i19 != 0) {
            }
            if ((i8 & 48) == 0) {
            }
            if ((i8 & 384) == 0) {
            }
            int i432 = i21;
            i22 = i9 & 8192;
            if (i22 != 0) {
            }
            if ((i10 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i7 & 1) != 0) {
                    if (i41 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i9 & 64) == 0) {
                    }
                    if ((i9 & 128) != 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if ((i9 & 2048) == 0) {
                    }
                    int i442 = i26;
                    if ((i9 & 4096) == 0) {
                    }
                    if (i22 == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i11 = i9 & 16;
        if (i11 == 0) {
        }
        i12 = i9 & 32;
        if (i12 == 0) {
        }
        if ((i7 & 1572864) != 0) {
        }
        if ((i7 & 12582912) != 0) {
        }
        i16 = i9 & 256;
        if (i16 == 0) {
        }
        i17 = i9 & 512;
        if (i17 != 0) {
        }
        i18 = i17;
        i19 = i9 & 1024;
        if (i19 != 0) {
        }
        if ((i8 & 48) == 0) {
        }
        if ((i8 & 384) == 0) {
        }
        int i4322 = i21;
        i22 = i9 & 8192;
        if (i22 != 0) {
        }
        if ((i10 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AnimatedStringComposable_53OSo0s$lambda$4$lambda$3(Animatable animatable) {
        return ((Number) animatable.getValue()).floatValue() > 0.0f;
    }

    private static final boolean AnimatedStringComposable_53OSo0s$lambda$5(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedStringComposable_53OSo0s$lambda$15$lambda$8$lambda$7(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str + " is animating out");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedStringComposable_53OSo0s$lambda$15$lambda$12$lambda$11(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str + " is animating in");
        return Unit.INSTANCE;
    }

    private static final int framesToMillis(float f) {
        return MathKt.roundToInt((f / 60.0f) * 1000);
    }
}
