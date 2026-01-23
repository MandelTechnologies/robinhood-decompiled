package com.robinhood.compose.common;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
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
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DotProgressIndicators.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"DotProgressIndicators", "", "dotProgressIndicatorState", "Lcom/robinhood/compose/common/DotProgressIndicatorState;", "modifier", "Landroidx/compose/ui/Modifier;", "activeColor", "Landroidx/compose/ui/graphics/Color;", "inactiveColor", "indicatorShape", "Landroidx/compose/ui/graphics/Shape;", "itemSpacing", "Landroidx/compose/ui/unit/Dp;", "indicatorSize", "DotProgressIndicators-TLPNkOs", "(Lcom/robinhood/compose/common/DotProgressIndicatorState;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "rememberDotProgressIndicatorState", "activeCount", "", "totalCount", "(IILandroidx/compose/runtime/Composer;II)Lcom/robinhood/compose/common/DotProgressIndicatorState;", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.DotProgressIndicatorsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class DotProgressIndicators2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DotProgressIndicators_TLPNkOs$lambda$2(DotProgressIndicators dotProgressIndicators, Modifier modifier, long j, long j2, Shape shape, float f, float f2, int i, int i2, Composer composer, int i3) {
        m21644DotProgressIndicatorsTLPNkOs(dotProgressIndicators, modifier, j, j2, shape, f, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010e  */
    /* renamed from: DotProgressIndicators-TLPNkOs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21644DotProgressIndicatorsTLPNkOs(final DotProgressIndicators dotProgressIndicatorState, Modifier modifier, final long j, final long j2, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        Shape circleShape;
        int i4;
        float fM7995constructorimpl;
        int i5;
        float f3;
        float fM7995constructorimpl2;
        float f4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int totalCount;
        int i6;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(dotProgressIndicatorState, "dotProgressIndicatorState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1030713768);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(dotProgressIndicatorState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                j3 = j2;
            } else {
                j3 = j2;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(j3) ? 2048 : 1024;
                }
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    circleShape = shape;
                    int i8 = composerStartRestartGroup.changed(circleShape) ? 16384 : 8192;
                    i3 |= i8;
                } else {
                    circleShape = shape;
                }
                i3 |= i8;
            } else {
                circleShape = shape;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    fM7995constructorimpl = f;
                    i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        f3 = f2;
                        i3 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                circleShape = RoundedCornerShape2.getCircleShape();
                            }
                            if (i4 != 0) {
                                fM7995constructorimpl = C2002Dp.m7995constructorimpl(24);
                            }
                            if (i5 == 0) {
                                fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(12);
                                f4 = fM7995constructorimpl;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1030713768, i3, -1, "com.robinhood.compose.common.DotProgressIndicators (DotProgressIndicators.kt:34)");
                            }
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(f4), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            float f6 = f4;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Background3.m4872backgroundbw27NRU$default(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, fM7995constructorimpl2), j3, null, 2, null), C2002Dp.m7995constructorimpl(1), j, circleShape);
                            composerStartRestartGroup.startReplaceGroup(-770578452);
                            totalCount = dotProgressIndicatorState.getTotalCount();
                            i6 = 0;
                            while (i6 < totalCount) {
                                BoxKt.Box(i6 <= dotProgressIndicatorState.getActiveCount() - 1 ? modifierM4876borderxT4_qwU.then(Background3.m4871backgroundbw27NRU(Modifier.INSTANCE, j, circleShape)) : modifierM4876borderxT4_qwU, composerStartRestartGroup, 0);
                                i6++;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f5 = fM7995constructorimpl2;
                            fM7995constructorimpl = f6;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        f4 = fM7995constructorimpl;
                        fM7995constructorimpl2 = f3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(f4), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        float f62 = f4;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            Modifier modifierM4876borderxT4_qwU2 = BorderKt.m4876borderxT4_qwU(Background3.m4872backgroundbw27NRU$default(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, fM7995constructorimpl2), j3, null, 2, null), C2002Dp.m7995constructorimpl(1), j, circleShape);
                            composerStartRestartGroup.startReplaceGroup(-770578452);
                            totalCount = dotProgressIndicatorState.getTotalCount();
                            i6 = 0;
                            while (i6 < totalCount) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f5 = fM7995constructorimpl2;
                            fM7995constructorimpl = f62;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        f5 = f3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        final Shape shape2 = circleShape;
                        final float f7 = fM7995constructorimpl;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.DotProgressIndicatorsKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return DotProgressIndicators2.DotProgressIndicators_TLPNkOs$lambda$2(dotProgressIndicatorState, modifier3, j, j2, shape2, f7, f5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                f3 = f2;
                if ((i3 & 599187) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                            f4 = fM7995constructorimpl;
                            fM7995constructorimpl2 = f3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(f4), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        float f622 = f4;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting()) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fM7995constructorimpl = f;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            f3 = f2;
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        fM7995constructorimpl = f;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        f3 = f2;
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final DotProgressIndicators rememberDotProgressIndicatorState(final int i, final int i2, Composer composer, int i3, int i4) {
        composer.startReplaceGroup(1965745397);
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1965745397, i3, -1, "com.robinhood.compose.common.rememberDotProgressIndicatorState (DotProgressIndicators.kt:91)");
        }
        Object[] objArr = new Object[0];
        Saver<DotProgressIndicators, Object> saver = DotProgressIndicators.INSTANCE.getSaver();
        composer.startReplaceGroup(-1633490746);
        boolean z = ((((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i2)) || (i3 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.DotProgressIndicatorsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DotProgressIndicators2.rememberDotProgressIndicatorState$lambda$4$lambda$3(i, i2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        DotProgressIndicators dotProgressIndicators = (DotProgressIndicators) RememberSaveable.m6426rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return dotProgressIndicators;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DotProgressIndicators rememberDotProgressIndicatorState$lambda$4$lambda$3(int i, int i2) {
        return new DotProgressIndicators(i, i2);
    }
}
