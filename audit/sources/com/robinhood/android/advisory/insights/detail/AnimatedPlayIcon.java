package com.robinhood.android.advisory.insights.detail;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
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
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AnimatedPlayIcon.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a]\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"AnimatedPlayIcon", "", "isAnimating", "", "modifier", "Landroidx/compose/ui/Modifier;", "size", "Landroidx/compose/ui/unit/Dp;", "barColor", "Landroidx/compose/ui/graphics/Color;", "barWidth", "barSpacing", "staticRatios", "Lkotlinx/collections/immutable/PersistentList;", "", "delays", "", "duration", "", "AnimatedPlayIcon-j_RGq7M", "(ZLandroidx/compose/ui/Modifier;FJFFLkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;ILandroidx/compose/runtime/Composer;II)V", "AnimatedPlayBars", "AnimatedPlayBars-KGZNzQ8", "(ZJFFLkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-insights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.insights.detail.AnimatedPlayIconKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AnimatedPlayIcon {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedPlayBars_KGZNzQ8$lambda$9(boolean z, long j, float f, float f2, ImmutableList3 immutableList3, ImmutableList3 immutableList32, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        m11052AnimatedPlayBarsKGZNzQ8(z, j, f, f2, immutableList3, immutableList32, i, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedPlayIcon_j_RGq7M$lambda$1(boolean z, Modifier modifier, float f, long j, float f2, float f3, ImmutableList3 immutableList3, ImmutableList3 immutableList32, int i, int i2, int i3, Composer composer, int i4) {
        m11053AnimatedPlayIconj_RGq7M(z, modifier, f, j, f2, f3, immutableList3, immutableList32, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* renamed from: AnimatedPlayIcon-j_RGq7M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11053AnimatedPlayIconj_RGq7M(final boolean z, Modifier modifier, float f, long j, float f2, float f3, ImmutableList3<Float> immutableList3, ImmutableList3<Long> immutableList32, int i, Composer composer, final int i2, final int i3) {
        boolean z2;
        int i4;
        Modifier modifier2;
        int i5;
        float fM7995constructorimpl;
        long j2;
        int i6;
        float fM7995constructorimpl2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long jM21425getFg0d7_KjU;
        int i13;
        ImmutableList3<Float> immutableList33;
        float f4;
        float f5;
        int i14;
        int i15;
        long j3;
        ImmutableList3<Long> immutableList34;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        final float f6;
        final long j4;
        final float f7;
        final float f8;
        final ImmutableList3<Float> immutableList35;
        final ImmutableList3<Long> immutableList36;
        final int i16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Float fValueOf = Float.valueOf(0.4f);
        Composer composerStartRestartGroup = composer.startRestartGroup(2136992210);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i2 & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
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
                    fM7995constructorimpl = f;
                    i4 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        j2 = j;
                        int i18 = composerStartRestartGroup.changed(j2) ? 2048 : 1024;
                        i4 |= i18;
                    } else {
                        j2 = j;
                    }
                    i4 |= i18;
                } else {
                    j2 = j;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        fM7995constructorimpl2 = f2;
                        i4 |= composerStartRestartGroup.changed(fM7995constructorimpl2) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(f3) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(immutableList3) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else {
                        if ((i2 & 12582912) == 0) {
                            i10 = i9;
                            i4 |= composerStartRestartGroup.changed(immutableList32) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 == 0) {
                            if ((i2 & 100663296) == 0) {
                                i12 = i11;
                                i4 |= composerStartRestartGroup.changed(i) ? 67108864 : 33554432;
                            }
                            if ((i4 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    f4 = f3;
                                    immutableList33 = immutableList3;
                                    i13 = i;
                                    f5 = fM7995constructorimpl2;
                                    i14 = 12582912;
                                    i15 = 2136992210;
                                    immutableList34 = immutableList32;
                                    j3 = j2;
                                } else {
                                    if (i17 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i5 != 0) {
                                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(24);
                                    }
                                    if ((i3 & 8) == 0) {
                                        jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                                        i4 &= -7169;
                                    } else {
                                        jM21425getFg0d7_KjU = j2;
                                    }
                                    if (i6 != 0) {
                                        fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(2);
                                    }
                                    float fM7995constructorimpl3 = i7 == 0 ? C2002Dp.m7995constructorimpl(3) : f3;
                                    ImmutableList3<Float> immutableList3PersistentListOf = i8 == 0 ? extensions2.persistentListOf(fValueOf, Float.valueOf(1.0f), Float.valueOf(0.7f), fValueOf) : immutableList3;
                                    ImmutableList3<Long> immutableList3PersistentListOf2 = i10 == 0 ? extensions2.persistentListOf(0L, 400L, 200L, 300L) : immutableList32;
                                    if (i12 == 0) {
                                        immutableList33 = immutableList3PersistentListOf;
                                        f4 = fM7995constructorimpl3;
                                        i13 = 300;
                                    } else {
                                        i13 = i;
                                        immutableList33 = immutableList3PersistentListOf;
                                        f4 = fM7995constructorimpl3;
                                    }
                                    f5 = fM7995constructorimpl2;
                                    i14 = 12582912;
                                    i15 = 2136992210;
                                    j3 = jM21425getFg0d7_KjU;
                                    immutableList34 = immutableList3PersistentListOf2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i15, i4, -1, "com.robinhood.android.advisory.insights.detail.AnimatedPlayIcon (AnimatedPlayIcon.kt:37)");
                                }
                                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(modifier2, fM7995constructorimpl);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                int i19 = i14;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                int i20 = i4 >> 6;
                                composer2 = composerStartRestartGroup;
                                m11052AnimatedPlayBarsKGZNzQ8(z2, j3, f5, f4, immutableList33, immutableList34, i13, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, (i4 & 14) | i19 | (i20 & 112) | (i20 & 896) | (i20 & 7168) | (57344 & i20) | (458752 & i20) | (i20 & 3670016), 0);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                f6 = fM7995constructorimpl;
                                j4 = j3;
                                f7 = f5;
                                f8 = f4;
                                immutableList35 = immutableList33;
                                immutableList36 = immutableList34;
                                i16 = i13;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                f8 = f3;
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                f6 = fM7995constructorimpl;
                                j4 = j2;
                                f7 = fM7995constructorimpl2;
                                immutableList35 = immutableList3;
                                immutableList36 = immutableList32;
                                i16 = i;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AnimatedPlayIconKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return AnimatedPlayIcon.AnimatedPlayIcon_j_RGq7M$lambda$1(z, modifier3, f6, j4, f7, f8, immutableList35, immutableList36, i16, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 100663296;
                        i12 = i11;
                        if ((i4 & 38347923) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0) {
                                if (i17 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if ((i3 & 8) == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                f5 = fM7995constructorimpl2;
                                i14 = 12582912;
                                i15 = 2136992210;
                                j3 = jM21425getFg0d7_KjU;
                                immutableList34 = immutableList3PersistentListOf2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(modifier2, fM7995constructorimpl);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs2);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                int i192 = i14;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    int i202 = i4 >> 6;
                                    composer2 = composerStartRestartGroup;
                                    m11052AnimatedPlayBarsKGZNzQ8(z2, j3, f5, f4, immutableList33, immutableList34, i13, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, (i4 & 14) | i192 | (i202 & 112) | (i202 & 896) | (i202 & 7168) | (57344 & i202) | (458752 & i202) | (i202 & 3670016), 0);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier2;
                                    f6 = fM7995constructorimpl;
                                    j4 = j3;
                                    f7 = f5;
                                    f8 = f4;
                                    immutableList35 = immutableList33;
                                    immutableList36 = immutableList34;
                                    i16 = i13;
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i10 = i9;
                    i11 = i3 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i4 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                fM7995constructorimpl2 = f2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i4 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fM7995constructorimpl = f;
            if ((i2 & 3072) == 0) {
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            fM7995constructorimpl2 = f2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i4 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        fM7995constructorimpl = f;
        if ((i2 & 3072) == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        fM7995constructorimpl2 = f2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i4 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /* renamed from: AnimatedPlayBars-KGZNzQ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11052AnimatedPlayBarsKGZNzQ8(final boolean z, final long j, final float f, final float f2, final ImmutableList3<Float> staticRatios, final ImmutableList3<Long> immutableList3, final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        final Modifier modifier2;
        final Density density;
        final List arrayList;
        Composer composer2;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        ImmutableList3<Long> delays = immutableList3;
        int i6 = i;
        Intrinsics.checkNotNullParameter(staticRatios, "staticRatios");
        Intrinsics.checkNotNullParameter(delays, "delays");
        Composer composerStartRestartGroup = composer.startRestartGroup(416975419);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(f) ? 256 : 128;
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changed(staticRatios) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(delays) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(i6) ? 1048576 : 524288;
                }
                i5 = i3 & 128;
                if (i5 != 0) {
                    i4 |= 12582912;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                    }
                }
                if ((i4 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(416975419, i4, -1, "com.robinhood.android.advisory.insights.detail.AnimatedPlayBars (AnimatedPlayIcon.kt:62)");
                    }
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransition4.rememberInfiniteTransition("pulsing_bar_infinite_transition", composerStartRestartGroup, 6, 0);
                    composerStartRestartGroup.startReplaceGroup(1281432866);
                    if (z) {
                        arrayList = staticRatios;
                    } else {
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(staticRatios, 10));
                        int i7 = 0;
                        for (Float f3 : staticRatios) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            float fFloatValue = f3.floatValue();
                            Composer composer3 = composerStartRestartGroup;
                            InfiniteTransition infiniteTransition = infiniteTransitionRememberInfiniteTransition;
                            List list = arrayList;
                            list.add(Float.valueOf(InfiniteTransition4.animateFloat(infiniteTransition, fFloatValue, 0.1f, AnimationSpecKt.m4814infiniteRepeatable9IiC70o(AnimationSpecKt.tween$default(i6, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Reverse, StartOffset.m4829constructorimpl$default((int) ((i7 < 0 || i7 >= delays.size()) ? 0L : delays.get(i7)).longValue(), 0, 2, null)), "bar_animation_" + i7, composer3, InfiniteTransition.$stable | 384 | (InfiniteRepeatableSpec.$stable << 9), 0).getValue().floatValue()));
                            delays = immutableList3;
                            i6 = i;
                            composerStartRestartGroup = composer3;
                            arrayList = list;
                            infiniteTransitionRememberInfiniteTransition = infiniteTransition;
                            i7 = i8;
                        }
                    }
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifier2, C2002Dp.m7995constructorimpl(3), C2002Dp.m7995constructorimpl(2));
                    composer2.startReplaceGroup(-1224400529);
                    zChanged = composer2.changed(density) | ((i4 & 896) != 256) | ((i4 & 7168) != 2048) | composer2.changedInstance(arrayList) | ((i4 & 112) != 32);
                    objRememberedValue = composer2.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AnimatedPlayIconKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AnimatedPlayIcon.AnimatedPlayBars_KGZNzQ8$lambda$8$lambda$7(density, arrayList, f, f2, j, (DrawScope) obj);
                            }
                        };
                        composer2.updateRememberedValue(function1);
                        objRememberedValue = function1;
                    }
                    composer2.endReplaceGroup();
                    Canvas2.Canvas(modifierM5143paddingVpY3zN4, (Function1) objRememberedValue, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AnimatedPlayIconKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AnimatedPlayIcon.AnimatedPlayBars_KGZNzQ8$lambda$9(z, j, f, f2, staticRatios, immutableList3, i, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            i5 = i3 & 128;
            if (i5 != 0) {
            }
            if ((i4 & 4793491) == 4793490) {
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransition4.rememberInfiniteTransition("pulsing_bar_infinite_transition", composerStartRestartGroup, 6, 0);
                composerStartRestartGroup.startReplaceGroup(1281432866);
                if (z) {
                }
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifier2, C2002Dp.m7995constructorimpl(3), C2002Dp.m7995constructorimpl(2));
                composer2.startReplaceGroup(-1224400529);
                zChanged = composer2.changed(density) | ((i4 & 896) != 256) | ((i4 & 7168) != 2048) | composer2.changedInstance(arrayList) | ((i4 & 112) != 32);
                objRememberedValue = composer2.rememberedValue();
                if (!zChanged) {
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AnimatedPlayIconKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AnimatedPlayIcon.AnimatedPlayBars_KGZNzQ8$lambda$8$lambda$7(density, arrayList, f, f2, j, (DrawScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(function12);
                    objRememberedValue = function12;
                    composer2.endReplaceGroup();
                    Canvas2.Canvas(modifierM5143paddingVpY3zN42, (Function1) objRememberedValue, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        i5 = i3 & 128;
        if (i5 != 0) {
        }
        if ((i4 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedPlayBars_KGZNzQ8$lambda$8$lambda$7(Density density, List list, float f, float f2, long j, DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(f);
        float fMo5016toPx0680j_42 = density.mo5016toPx0680j_4(f2);
        float fMo5016toPx0680j_43 = fIntBitsToFloat2 - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(4));
        float size = fIntBitsToFloat - ((list.size() * fMo5016toPx0680j_4) + ((r0 - 1) * fMo5016toPx0680j_42));
        float f3 = 2;
        float f4 = size / f3;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue() * fMo5016toPx0680j_43;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) / f3;
            float f5 = fFloatValue / f3;
            float f6 = (fIntBitsToFloat3 + f5) - (fIntBitsToFloat3 - f5);
            float f7 = f3;
            DrawScope.m6958drawRectnJ9OG0$default(Canvas, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(f4 + (i * (fMo5016toPx0680j_4 + fMo5016toPx0680j_42))) << 32) | (Float.floatToRawIntBits(r5) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            Canvas = drawScope;
            i = i2;
            f3 = f7;
        }
        return Unit.INSTANCE;
    }
}
