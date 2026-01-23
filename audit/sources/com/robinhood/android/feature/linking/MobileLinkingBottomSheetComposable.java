package com.robinhood.android.feature.linking;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MobileLinkingBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"MobileLinkingBottomSheetComposable", "", "fragmentContainerId", "", "onFinish", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-mobile-linking_externalDebug", "offsetPx", "", "animatedOffsetPx", "isDragging", "", "isVisible"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class MobileLinkingBottomSheetComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MobileLinkingBottomSheetComposable$lambda$21(int i, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        MobileLinkingBottomSheetComposable(i, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MobileLinkingBottomSheetComposable(final int i, final Function0<Unit> onFinish, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotFloatState2 snapshotFloatState2;
        final SnapshotState4<Integer> snapshotState4AnimateIntAsState;
        float fMo5012toDpu2uoSUM;
        float fM7995constructorimpl;
        float fMo5016toPx0680j_4;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue3;
        final float f;
        SnapshotState snapshotState2;
        final SnapshotFloatState2 snapshotFloatState22;
        Object objRememberedValue4;
        SnapshotState4 snapshotState4;
        boolean z;
        Object objRememberedValue5;
        boolean zChanged2;
        Object objRememberedValue6;
        boolean zChanged3;
        Object objRememberedValue7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z2;
        Object objRememberedValue8;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Composer composerStartRestartGroup = composer.startRestartGroup(-254757432);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onFinish) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 == 0) {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-254757432, i4, -1, "com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposable (MobileLinkingBottomSheetComposable.kt:44)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                snapshotState4AnimateIntAsState = AnimateAsState.animateIntAsState(MathKt.roundToInt(RangesKt.coerceAtLeast(snapshotFloatState2.getFloatValue(), 0.0f)), null, null, null, composerStartRestartGroup, 0, 14);
                fMo5012toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5012toDpu2uoSUM(snapshotFloatState2.getFloatValue());
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
                fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(MobileLinkingBottomSheetComposable$lambda$7(snapshotState));
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(fMo5012toDpu2uoSUM) | composerStartRestartGroup.changed(fM7995constructorimpl) | composerStartRestartGroup.changed(fMo5016toPx0680j_4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new MobileLinkingBottomSheetComposable2(fMo5012toDpu2uoSUM, fM7995constructorimpl, fMo5016toPx0680j_4, snapshotState, snapshotFloatState2, null);
                    f = fMo5016toPx0680j_4;
                    snapshotState2 = snapshotState;
                    snapshotFloatState22 = snapshotFloatState2;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    f = fMo5016toPx0680j_4;
                    snapshotState2 = snapshotState;
                    snapshotFloatState22 = snapshotFloatState2;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(MobileLinkingBottomSheetComposable.MobileLinkingBottomSheetComposable$lambda$11$lambda$10(f, snapshotFloatState22));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotState4 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf2 = Boolean.valueOf(MobileLinkingBottomSheetComposable$lambda$12(snapshotState4));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = (i4 & 112) != 32;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new MobileLinkingBottomSheetComposable3(onFinish, snapshotState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(snapshotState4AnimateIntAsState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MobileLinkingBottomSheetComposable.MobileLinkingBottomSheetComposable$lambda$15$lambda$14(snapshotState4AnimateIntAsState, (Density) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOffset = OffsetKt.offset(modifier5, (Function1) objRememberedValue6);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged3 = composerStartRestartGroup.changed(f);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new MobileLinkingBottomSheetComposable4(snapshotState2, f, snapshotFloatState22);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierOffset, unit, (PointerInputEventHandler) objRememberedValue7);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                float f2 = 16;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), RoundedCornerShape2.m5329RoundedCornerShapea9UjIt4$default(C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2), 0.0f, 0.0f, 12, null)), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z2 = (i4 & 14) != 4;
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MobileLinkingBottomSheetComposable.MobileLinkingBottomSheetComposable$lambda$20$lambda$19$lambda$18(i, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue8, modifierM4872backgroundbw27NRU$default, null, composerStartRestartGroup, 0, 4);
                composer2 = composerStartRestartGroup;
                BoxKt.Box(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE)), composer2, 6);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MobileLinkingBottomSheetComposable.MobileLinkingBottomSheetComposable$lambda$21(i, onFinish, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        modifier2 = modifier;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier52 = modifier4;
            snapshotState4AnimateIntAsState = AnimateAsState.animateIntAsState(MathKt.roundToInt(RangesKt.coerceAtLeast(snapshotFloatState2.getFloatValue(), 0.0f)), null, null, null, composerStartRestartGroup, 0, 14);
            fMo5012toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5012toDpu2uoSUM(snapshotFloatState2.getFloatValue());
            fM7995constructorimpl = C2002Dp.m7995constructorimpl(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
            fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf3 = Boolean.valueOf(MobileLinkingBottomSheetComposable$lambda$7(snapshotState));
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChanged = composerStartRestartGroup.changed(fMo5012toDpu2uoSUM) | composerStartRestartGroup.changed(fM7995constructorimpl) | composerStartRestartGroup.changed(fMo5016toPx0680j_4);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new MobileLinkingBottomSheetComposable2(fMo5012toDpu2uoSUM, fM7995constructorimpl, fMo5016toPx0680j_4, snapshotState, snapshotFloatState2, null);
                f = fMo5016toPx0680j_4;
                snapshotState2 = snapshotState;
                snapshotFloatState22 = snapshotFloatState2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf22 = Boolean.valueOf(MobileLinkingBottomSheetComposable$lambda$12(snapshotState4));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                if ((i4 & 112) != 32) {
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue5 = new MobileLinkingBottomSheetComposable3(onFinish, snapshotState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged2 = composerStartRestartGroup.changed(snapshotState4AnimateIntAsState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MobileLinkingBottomSheetComposable.MobileLinkingBottomSheetComposable$lambda$15$lambda$14(snapshotState4AnimateIntAsState, (Density) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOffset2 = OffsetKt.offset(modifier52, (Function1) objRememberedValue6);
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChanged3 = composerStartRestartGroup.changed(f);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged3) {
                            objRememberedValue7 = new MobileLinkingBottomSheetComposable4(snapshotState2, f, snapshotFloatState22);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierOffset2, unit2, (PointerInputEventHandler) objRememberedValue7);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput2);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                float f22 = 16;
                                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null), RoundedCornerShape2.m5329RoundedCornerShapea9UjIt4$default(C2002Dp.m7995constructorimpl(f22), C2002Dp.m7995constructorimpl(f22), 0.0f, 0.0f, 12, null)), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                if ((i4 & 14) != 4) {
                                }
                                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                if (!z2) {
                                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return MobileLinkingBottomSheetComposable.MobileLinkingBottomSheetComposable$lambda$20$lambda$19$lambda$18(i, (Context) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                    composerStartRestartGroup.endReplaceGroup();
                                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue8, modifierM4872backgroundbw27NRU$default2, null, composerStartRestartGroup, 0, 4);
                                    composer2 = composerStartRestartGroup;
                                    BoxKt.Box(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE)), composer2, 6);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MobileLinkingBottomSheetComposable$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MobileLinkingBottomSheetComposable$lambda$11$lambda$10(float f, SnapshotFloatState2 snapshotFloatState2) {
        return snapshotFloatState2.getFloatValue() < f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset MobileLinkingBottomSheetComposable$lambda$15$lambda$14(SnapshotState4 snapshotState4, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((MobileLinkingBottomSheetComposable$lambda$3(snapshotState4) & 4294967295L) | (0 << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MobileLinkingBottomSheetComposable$lambda$12(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final int MobileLinkingBottomSheetComposable$lambda$3(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MobileLinkingBottomSheetComposable$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FragmentContainerLayout MobileLinkingBottomSheetComposable$lambda$20$lambda$19$lambda$18(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FragmentContainerLayout fragmentContainerLayout = new FragmentContainerLayout(context, null, 2, null);
        fragmentContainerLayout.setId(i);
        return fragmentContainerLayout;
    }
}
