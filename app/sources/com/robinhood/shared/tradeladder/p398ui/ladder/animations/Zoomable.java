package com.robinhood.shared.tradeladder.p398ui.ladder.animations;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Zoomable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u001aY\u0010\u000e\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a?\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\u000e\u0010\u0015\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "zoomCenter", "zoomDistance", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "maxOffsetDp", "influenceRangeDp", "deadZoneRadiusDp", "Lkotlin/Function0;", "", "content", "Zoomable-eiMxS0Y", "(Ljava/lang/Float;Ljava/lang/Float;Landroidx/compose/ui/Modifier;FFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Zoomable", "itemCenterY", "maxOffsetPx", "deadZoneRadiusPx", "influenceRangePx", "calculateYOffset", "(FFFFFF)F", "currentOffsetY", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.animations.ZoomableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Zoomable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Zoomable_eiMxS0Y$lambda$14(Float f, Float f2, Modifier modifier, float f3, float f4, float f5, Function2 function2, int i, int i2, Composer composer, int i3) {
        m26092ZoomableeiMxS0Y(f, f2, modifier, f3, f4, f5, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* renamed from: Zoomable-eiMxS0Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26092ZoomableeiMxS0Y(final Float f, final Float f2, Modifier modifier, float f3, float f4, float f5, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float fM7995constructorimpl;
        int i5;
        float f6;
        int i6;
        float fM7995constructorimpl2;
        float fM7995constructorimpl3;
        float f7;
        Object objRememberedValue;
        Composer.Companion companion;
        Density density;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        boolean zChanged3;
        Object objRememberedValue4;
        int i7;
        ?? r8;
        Modifier modifierGraphicsLayer;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final float f8;
        final float f9;
        boolean z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1568846399);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    fM7995constructorimpl = f3;
                    i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        f6 = f4;
                        i3 |= composerStartRestartGroup.changed(f6) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        fM7995constructorimpl2 = f5;
                    } else {
                        fM7995constructorimpl2 = f5;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(fM7995constructorimpl2) ? 131072 : 65536;
                        }
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(50);
                        }
                        fM7995constructorimpl3 = i5 == 0 ? C2002Dp.m7995constructorimpl(300) : f6;
                        if (i6 != 0) {
                            fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(20);
                        }
                        f7 = fM7995constructorimpl2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1568846399, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.animations.Zoomable (Zoomable.kt:41)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged = ((i3 & 7168) != 2048) | composerStartRestartGroup.changed(density);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = Float.valueOf(density.mo5016toPx0680j_4(fM7995constructorimpl));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final float fFloatValue = ((Number) objRememberedValue2).floatValue();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged2 = ((57344 & i3) != 16384) | composerStartRestartGroup.changed(density);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = Float.valueOf(density.mo5016toPx0680j_4(fM7995constructorimpl3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        final float fFloatValue2 = ((Number) objRememberedValue3).floatValue();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged3 = composerStartRestartGroup.changed(density) | ((458752 & i3) != 131072);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = Float.valueOf(density.mo5016toPx0680j_4(f7));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        final float fFloatValue3 = ((Number) objRememberedValue4).floatValue();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-127841653);
                        if (!Intrinsics.areEqual(f2, 0.0f) || f == null || f2 == null) {
                            i7 = i3;
                            r8 = 0;
                            modifierGraphicsLayer = Modifier.INSTANCE;
                        } else {
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            boolean zChanged4 = composerStartRestartGroup.changed(fFloatValue) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | composerStartRestartGroup.changed(fFloatValue3) | composerStartRestartGroup.changed(fFloatValue2);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                                i7 = i3;
                                z = false;
                                Function1 function1 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.animations.ZoomableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Zoomable.Zoomable_eiMxS0Y$lambda$10$lambda$9(fFloatValue, f, f2, fFloatValue3, fFloatValue2, snapshotFloatState2, (LayoutCoordinates) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function1);
                                objRememberedValue5 = function1;
                            } else {
                                i7 = i3;
                                z = false;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue5);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.animations.ZoomableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Zoomable.Zoomable_eiMxS0Y$lambda$12$lambda$11(snapshotFloatState2, (GraphicsLayerScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierOnGloballyPositioned, (Function1) objRememberedValue6);
                            r8 = z;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierThen = modifier2.then(modifierGraphicsLayer);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r8);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r8);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 18) & 14));
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f8 = fM7995constructorimpl3;
                        f9 = f7;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        f8 = f6;
                        f9 = fM7995constructorimpl2;
                    }
                    final Modifier modifier3 = modifier2;
                    final float f10 = fM7995constructorimpl;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.animations.ZoomableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Zoomable.Zoomable_eiMxS0Y$lambda$14(f, f2, modifier3, f10, f8, f9, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                f6 = f4;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    f7 = fM7995constructorimpl2;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    final SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = ((i3 & 7168) != 2048) | composerStartRestartGroup.changed(density);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = Float.valueOf(density.mo5016toPx0680j_4(fM7995constructorimpl));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        final float fFloatValue4 = ((Number) objRememberedValue2).floatValue();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged2 = ((57344 & i3) != 16384) | composerStartRestartGroup.changed(density);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = Float.valueOf(density.mo5016toPx0680j_4(fM7995constructorimpl3));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            final float fFloatValue22 = ((Number) objRememberedValue3).floatValue();
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged3 = composerStartRestartGroup.changed(density) | ((458752 & i3) != 131072);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged3) {
                                objRememberedValue4 = Float.valueOf(density.mo5016toPx0680j_4(f7));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                final float fFloatValue32 = ((Number) objRememberedValue4).floatValue();
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-127841653);
                                if (Intrinsics.areEqual(f2, 0.0f)) {
                                    i7 = i3;
                                    r8 = 0;
                                    modifierGraphicsLayer = Modifier.INSTANCE;
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifierThen2 = modifier2.then(modifierGraphicsLayer);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r8);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r8);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        content.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 18) & 14));
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        f8 = fM7995constructorimpl3;
                                        f9 = f7;
                                    }
                                }
                            }
                        }
                    }
                }
                final Modifier modifier32 = modifier2;
                final float f102 = fM7995constructorimpl;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fM7995constructorimpl = f3;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            f6 = f4;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            final Modifier modifier322 = modifier2;
            final float f1022 = fM7995constructorimpl;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        fM7995constructorimpl = f3;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        f6 = f4;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        final Modifier modifier3222 = modifier2;
        final float f10222 = fM7995constructorimpl;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Zoomable_eiMxS0Y$lambda$10$lambda$9(float f, Float f2, Float f3, float f4, float f5, SnapshotFloatState2 snapshotFloatState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotFloatState2.setFloatValue(calculateYOffset(Float.intBitsToFloat((int) (LayoutCoordinates2.positionInParent(coordinates) & 4294967295L)) + (((int) (coordinates.mo7241getSizeYbymL2g() & 4294967295L)) / 2.0f), f, f2.floatValue(), f3.floatValue(), f4, f5));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Zoomable_eiMxS0Y$lambda$12$lambda$11(SnapshotFloatState2 snapshotFloatState2, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(snapshotFloatState2.getFloatValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float calculateYOffset(float f, float f2, float f3, float f4, float f5, float f6) {
        float fCoerceIn;
        float fAbs;
        float f7 = f - f3;
        float fAbs2 = Math.abs(f7);
        if (fAbs2 <= f5) {
            return 0.0f;
        }
        float fCoerceAtLeast = RangesKt.coerceAtLeast(fAbs2 - f5, 0.0f);
        if (f6 > f5) {
            float f8 = f6 - f5;
            fCoerceIn = f8 <= 0.0f ? 1.0f : RangesKt.coerceIn(fCoerceAtLeast / f8, 0.0f, 1.0f);
        } else if (fAbs2 <= f5) {
            fCoerceIn = 0.0f;
        }
        float fCoerceIn2 = f2 * RangesKt.coerceIn(f4, -1.0f, 1.0f) * fCoerceIn;
        if (f7 < 0.0f) {
            if (f4 > 0.0f) {
                fAbs = Math.abs(fCoerceIn2);
            } else {
                return Math.abs(fCoerceIn2);
            }
        } else {
            if (f4 > 0.0f) {
                return Math.abs(fCoerceIn2);
            }
            fAbs = Math.abs(fCoerceIn2);
        }
        return -fAbs;
    }
}
