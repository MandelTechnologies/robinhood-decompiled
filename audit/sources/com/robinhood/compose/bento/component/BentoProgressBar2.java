package com.robinhood.compose.bento.component;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.StrokeCap;
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
import com.robinhood.android.plt.PltModifiers;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ProgressBarStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoProgressBar.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001aI\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aO\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"ProgressBarAnimationLabel", "", "BentoProgressBar", "", "progress", "", "modifier", "Landroidx/compose/ui/Modifier;", "numberOfSegments", "", "activeColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "animate", "", "BentoProgressBar-jB83MbM", "(FLandroidx/compose/ui/Modifier;IJJZLandroidx/compose/runtime/Composer;II)V", "BentoIndeterminateProgressBar", "show", "BentoIndeterminateProgressBar-eaDK9VM", "(Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/runtime/Composer;II)V", "activeSegment", "segmentProgress", "BentoProgressBar-nBX6wN0", "(IFILandroidx/compose/ui/Modifier;JJZLandroidx/compose/runtime/Composer;II)V", "BentoProgressBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoProgressBarKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoProgressBar2 {
    private static final String ProgressBarAnimationLabel = "progress_bar_anim";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoIndeterminateProgressBar_eaDK9VM$lambda$6(Modifier modifier, boolean z, long j, long j2, int i, int i2, Composer composer, int i3) {
        m20697BentoIndeterminateProgressBareaDK9VM(modifier, z, j, j2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoProgressBarPreview$lambda$8(int i, Composer composer, int i2) {
        BentoProgressBarPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BentoProgressBar_jB83MbM$lambda$4$lambda$1$lambda$0(float f, float f2, float f3, float f4, float f5) {
        if (f >= f2) {
            return 1.0f;
        }
        if (f <= f3) {
            return 0.0f;
        }
        return f4 / f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoProgressBar_jB83MbM$lambda$5(float f, Modifier modifier, int i, long j, long j2, boolean z, int i2, int i3, Composer composer, int i4) {
        m20698BentoProgressBarjB83MbM(f, modifier, i, j, j2, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoProgressBar_nBX6wN0$lambda$7(int i, float f, int i2, Modifier modifier, long j, long j2, boolean z, int i3, int i4, Composer composer, int i5) {
        m20699BentoProgressBarnBX6wN0(i, f, i2, modifier, j, j2, z, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* renamed from: BentoProgressBar-jB83MbM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20698BentoProgressBarjB83MbM(final float f, Modifier modifier, int i, long j, long j2, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        long jM21900getActiveColor0d7_KjU;
        long jM21901getBackgroundColor0d7_KjU;
        int i7;
        boolean z2;
        boolean z3;
        Composer composer2;
        float fFloatValue;
        final boolean z4;
        final int i8;
        final long j3;
        final long j4;
        final Modifier modifier3;
        float f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2116321950);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    jM21900getActiveColor0d7_KjU = j;
                    i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(jM21900getActiveColor0d7_KjU)) ? 2048 : 1024;
                } else {
                    jM21900getActiveColor0d7_KjU = j;
                }
                if ((i2 & 24576) == 0) {
                    jM21901getBackgroundColor0d7_KjU = j2;
                    i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(jM21901getBackgroundColor0d7_KjU)) ? 16384 : 8192;
                } else {
                    jM21901getBackgroundColor0d7_KjU = j2;
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                    if ((196608 & i2) == 0) {
                        z2 = z;
                        i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                i6 = 1;
                            }
                            if ((i3 & 8) != 0) {
                                jM21900getActiveColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getProgressBarStyle(composerStartRestartGroup, 0).getColors().m21900getActiveColor0d7_KjU();
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                jM21901getBackgroundColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getProgressBarStyle(composerStartRestartGroup, 0).getColors().m21901getBackgroundColor0d7_KjU();
                                i4 &= -57345;
                            }
                            if (i7 == 0) {
                            }
                            long j5 = jM21901getBackgroundColor0d7_KjU;
                            long j6 = jM21900getActiveColor0d7_KjU;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116321950, i4, -1, "com.robinhood.compose.bento.component.BentoProgressBar (BentoProgressBar.kt:40)");
                            }
                            if (i6 <= 0) {
                                throw new IllegalStateException("Check failed.");
                            }
                            if (0.0f > f || f > 1.0f) {
                                throw new IllegalStateException("Check failed.");
                            }
                            ProgressBarStyle.Spacing spacing = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getProgressBarStyle(composerStartRestartGroup, 0).getSpacing();
                            composerStartRestartGroup.startReplaceGroup(2029119946);
                            if (z3) {
                                composer2 = composerStartRestartGroup;
                                fFloatValue = AnimateAsState.animateFloatAsState(f, AnimationSpecKt.tween$default(0, 0, new CubicBezierEasing(0.17f, 0.17f, 0.1f, 1.0f), 3, null), 0.0f, ProgressBarAnimationLabel, null, composerStartRestartGroup, (i4 & 14) | 3120, 20).getValue().floatValue();
                            } else {
                                composer2 = composerStartRestartGroup;
                                fFloatValue = f;
                            }
                            composer2.endReplaceGroup();
                            int i10 = i4 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(spacing.m21907getSegmentSpacingD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier2);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            boolean z5 = z3;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Modifier modifier4 = modifier2;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            composer2.startReplaceGroup(1177269290);
                            int i11 = 0;
                            while (i11 < i6) {
                                float f3 = i6;
                                final float f4 = i11 / f3;
                                i11++;
                                final float f5 = i11 / f3;
                                final float f6 = f5 - f4;
                                final float f7 = fFloatValue - f4;
                                Row6 row62 = row6;
                                composer2.startReplaceGroup(-1224400529);
                                boolean zChanged = composer2.changed(fFloatValue) | composer2.changed(f5) | composer2.changed(f4) | composer2.changed(f7) | composer2.changed(f6);
                                final float f8 = fFloatValue;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.BentoProgressBarKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Float.valueOf(BentoProgressBar2.BentoProgressBar_jB83MbM$lambda$4$lambda$1$lambda$0(f8, f5, f4, f7, f6));
                                        }
                                    };
                                    f2 = f8;
                                    composer2.updateRememberedValue(objRememberedValue);
                                } else {
                                    f2 = f8;
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer2.endReplaceGroup();
                                float f9 = f2;
                                Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(Row5.weight$default(row62, SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, spacing.m21906getHeightD9Ej5fM()), 1.0f, false, 2, null), false, null, 3, null);
                                int iM6848getButtKaPHkGw = StrokeCap.INSTANCE.m6848getButtKaPHkGw();
                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                                composer2.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoProgressBarKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return BentoProgressBar2.BentoProgressBar_jB83MbM$lambda$4$lambda$3$lambda$2((DrawScope) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                ProgressIndicatorKt.m5923LinearProgressIndicatorGJbTh5U(function0, modifierWithBentoPlaceholder$default, j6, j5, iM6848getButtKaPHkGw, fM7995constructorimpl, (Function1) objRememberedValue2, composer2, (i10 & 896) | 1769472 | (i10 & 7168), 0);
                                fFloatValue = f9;
                                row6 = row62;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z4 = z5;
                            i8 = i6;
                            j3 = j6;
                            j4 = j5;
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                        }
                        long j52 = jM21901getBackgroundColor0d7_KjU;
                        long j62 = jM21900getActiveColor0d7_KjU;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (i6 <= 0) {
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        i8 = i6;
                        j3 = jM21900getActiveColor0d7_KjU;
                        j4 = jM21901getBackgroundColor0d7_KjU;
                        z4 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoProgressBarKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoProgressBar2.BentoProgressBar_jB83MbM$lambda$5(f, modifier3, i8, j3, j4, z4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 196608;
                z2 = z;
                if ((74899 & i4) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i9 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        z3 = i7 == 0 ? z2 : true;
                        long j522 = jM21901getBackgroundColor0d7_KjU;
                        long j622 = jM21900getActiveColor0d7_KjU;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (i6 <= 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            z2 = z;
            if ((74899 & i4) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        z2 = z;
        if ((74899 & i4) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoProgressBar_jB83MbM$lambda$4$lambda$3$lambda$2(DrawScope LinearProgressIndicator) {
        Intrinsics.checkNotNullParameter(LinearProgressIndicator, "$this$LinearProgressIndicator");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: BentoIndeterminateProgressBar-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20697BentoIndeterminateProgressBareaDK9VM(Modifier modifier, boolean z, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        long jM21900getActiveColor0d7_KjU;
        long j3;
        final Modifier modifier3;
        boolean z3;
        long jM21901getBackgroundColor0d7_KjU;
        final boolean z4;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(926140218);
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
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    jM21900getActiveColor0d7_KjU = j;
                    int i6 = composerStartRestartGroup.changed(jM21900getActiveColor0d7_KjU) ? 256 : 128;
                    i3 |= i6;
                } else {
                    jM21900getActiveColor0d7_KjU = j;
                }
                i3 |= i6;
            } else {
                jM21900getActiveColor0d7_KjU = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j2;
                    int i7 = composerStartRestartGroup.changed(j3) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    j3 = j2;
                }
                i3 |= i7;
            } else {
                j3 = j2;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    z3 = i5 == 0 ? true : z2;
                    if ((i2 & 4) != 0) {
                        jM21900getActiveColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getProgressBarStyle(composerStartRestartGroup, 0).getColors().m21900getActiveColor0d7_KjU();
                        i3 &= -897;
                    }
                    if ((i2 & 8) == 0) {
                        i3 &= -7169;
                        jM21901getBackgroundColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getProgressBarStyle(composerStartRestartGroup, 0).getColors().m21901getBackgroundColor0d7_KjU();
                    }
                    long j6 = jM21900getActiveColor0d7_KjU;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(926140218, i3, -1, "com.robinhood.compose.bento.component.BentoIndeterminateProgressBar (BentoProgressBar.kt:100)");
                    }
                    ProgressIndicatorKt.m5924LinearProgressIndicatorrIrjwxo(ModifiersKt.isInvisible(PltModifiers.recordLoadingState$default(modifier3, z3, null, 2, null), !z3), j6, jM21901getBackgroundColor0d7_KjU, 0, 0.0f, composerStartRestartGroup, (i3 >> 3) & 1008, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z3;
                    j4 = j6;
                    j5 = jM21901getBackgroundColor0d7_KjU;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                    z3 = z2;
                }
                jM21901getBackgroundColor0d7_KjU = j3;
                long j62 = jM21900getActiveColor0d7_KjU;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProgressIndicatorKt.m5924LinearProgressIndicatorrIrjwxo(ModifiersKt.isInvisible(PltModifiers.recordLoadingState$default(modifier3, z3, null, 2, null), !z3), j62, jM21901getBackgroundColor0d7_KjU, 0, 0.0f, composerStartRestartGroup, (i3 >> 3) & 1008, 24);
                if (ComposerKt.isTraceInProgress()) {
                }
                z4 = z3;
                j4 = j62;
                j5 = jM21901getBackgroundColor0d7_KjU;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z4 = z2;
                j4 = jM21900getActiveColor0d7_KjU;
                j5 = j3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoProgressBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoProgressBar2.BentoIndeterminateProgressBar_eaDK9VM$lambda$6(modifier3, z4, j4, j5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) == 0) {
                    jM21901getBackgroundColor0d7_KjU = j3;
                }
                long j622 = jM21900getActiveColor0d7_KjU;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProgressIndicatorKt.m5924LinearProgressIndicatorrIrjwxo(ModifiersKt.isInvisible(PltModifiers.recordLoadingState$default(modifier3, z3, null, 2, null), !z3), j622, jM21901getBackgroundColor0d7_KjU, 0, 0.0f, composerStartRestartGroup, (i3 >> 3) & 1008, 24);
                if (ComposerKt.isTraceInProgress()) {
                }
                z4 = z3;
                j4 = j622;
                j5 = jM21901getBackgroundColor0d7_KjU;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /* renamed from: BentoProgressBar-nBX6wN0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20699BentoProgressBarnBX6wN0(final int i, final float f, final int i2, Modifier modifier, long j, long j2, boolean z, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        long jM21900getActiveColor0d7_KjU;
        long jM21901getBackgroundColor0d7_KjU;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        final Modifier modifier3;
        long j3;
        long j4;
        final long j5;
        final long j6;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(885228921);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        int i8 = i4 & 8;
        if (i8 != 0) {
            i5 |= 3072;
        } else {
            if ((i3 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 24576) != 0) {
                if ((i4 & 16) == 0) {
                    jM21900getActiveColor0d7_KjU = j;
                    int i9 = composerStartRestartGroup.changed(jM21900getActiveColor0d7_KjU) ? 16384 : 8192;
                    i5 |= i9;
                } else {
                    jM21900getActiveColor0d7_KjU = j;
                }
                i5 |= i9;
            } else {
                jM21900getActiveColor0d7_KjU = j;
            }
            if ((196608 & i3) != 0) {
                jM21901getBackgroundColor0d7_KjU = j2;
                i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(jM21901getBackgroundColor0d7_KjU)) ? 131072 : 65536;
            } else {
                jM21901getBackgroundColor0d7_KjU = j2;
            }
            i6 = i4 & 64;
            if (i6 != 0) {
                if ((1572864 & i3) == 0) {
                    z2 = z;
                    i5 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                }
                if ((599187 & i5) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 16) != 0) {
                            jM21900getActiveColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getProgressBarStyle(composerStartRestartGroup, 0).getColors().m21900getActiveColor0d7_KjU();
                            i5 &= -57345;
                        }
                        if ((i4 & 32) != 0) {
                            jM21901getBackgroundColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getProgressBarStyle(composerStartRestartGroup, 0).getColors().m21901getBackgroundColor0d7_KjU();
                            i5 &= -458753;
                        }
                        if (i6 == 0) {
                            z3 = true;
                            i7 = i5;
                            modifier3 = modifier2;
                            j3 = jM21900getActiveColor0d7_KjU;
                            j4 = jM21901getBackgroundColor0d7_KjU;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(885228921, i7, -1, "com.robinhood.compose.bento.component.BentoProgressBar (BentoProgressBar.kt:121)");
                        }
                        float f2 = i2;
                        float f3 = i / f2;
                        float f4 = f3 + ((((i + 1) / f2) - f3) * f);
                        int i10 = ((i7 >> 6) & 112) | (i7 & 896);
                        int i11 = i7 >> 3;
                        m20698BentoProgressBarjB83MbM(f4, modifier3, i2, j3, j4, z3, composerStartRestartGroup, (i11 & 458752) | i10 | (i11 & 7168) | (57344 & i11), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = j3;
                        j6 = j4;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                        }
                    }
                    i7 = i5;
                    modifier3 = modifier2;
                    j3 = jM21900getActiveColor0d7_KjU;
                    j4 = jM21901getBackgroundColor0d7_KjU;
                    z3 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    float f22 = i2;
                    float f32 = i / f22;
                    float f42 = f32 + ((((i + 1) / f22) - f32) * f);
                    int i102 = ((i7 >> 6) & 112) | (i7 & 896);
                    int i112 = i7 >> 3;
                    m20698BentoProgressBarjB83MbM(f42, modifier3, i2, j3, j4, z3, composerStartRestartGroup, (i112 & 458752) | i102 | (i112 & 7168) | (57344 & i112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j5 = j3;
                    j6 = j4;
                    z4 = z3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = jM21900getActiveColor0d7_KjU;
                    j6 = jM21901getBackgroundColor0d7_KjU;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoProgressBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoProgressBar2.BentoProgressBar_nBX6wN0$lambda$7(i, f, i2, modifier3, j5, j6, z4, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 1572864;
            z2 = z;
            if ((599187 & i5) != 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i8 != 0) {
                    }
                    if ((i4 & 16) != 0) {
                    }
                    if ((i4 & 32) != 0) {
                    }
                    if (i6 == 0) {
                        i7 = i5;
                        modifier3 = modifier2;
                        j3 = jM21900getActiveColor0d7_KjU;
                        j4 = jM21901getBackgroundColor0d7_KjU;
                        z3 = z2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    float f222 = i2;
                    float f322 = i / f222;
                    float f422 = f322 + ((((i + 1) / f222) - f322) * f);
                    int i1022 = ((i7 >> 6) & 112) | (i7 & 896);
                    int i1122 = i7 >> 3;
                    m20698BentoProgressBarjB83MbM(f422, modifier3, i2, j3, j4, z3, composerStartRestartGroup, (i1122 & 458752) | i1022 | (i1122 & 7168) | (57344 & i1122), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j5 = j3;
                    j6 = j4;
                    z4 = z3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 24576) != 0) {
        }
        if ((196608 & i3) != 0) {
        }
        i6 = i4 & 64;
        if (i6 != 0) {
        }
        z2 = z;
        if ((599187 & i5) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void BentoProgressBarPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1675916158);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1675916158, i, -1, "com.robinhood.compose.bento.component.BentoProgressBarPreview (BentoProgressBar.kt:139)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoProgressBar3.INSTANCE.getLambda$608886218$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoProgressBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoProgressBar2.BentoProgressBarPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
