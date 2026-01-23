package com.robinhood.android.instrumentrow;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.instrumentrow.models.BackgroundColor;
import com.robinhood.android.instrumentrow.models.Text;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PspRow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0007¢\u0006\u0002\u0010\r\u001a'\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u001c\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u001d"}, m3636d2 = {"PspRowHeight", "Landroidx/compose/ui/unit/Dp;", "F", "PspRowFillCornerRadius", "PspRowBorderWidth", "PspRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/instrumentrow/PspRowState;", "onTrailingTextClicked", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/instrumentrow/PspRowState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PspRowStart", "primaryText", "Lcom/robinhood/android/instrumentrow/models/Text;", "secondaryText", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/instrumentrow/models/Text;Lcom/robinhood/android/instrumentrow/models/Text;Landroidx/compose/runtime/Composer;II)V", "PspRowEnd", "trailingTextColor", "Landroidx/compose/ui/graphics/Color;", "trailingTextBackgroundColor", "Lcom/robinhood/android/instrumentrow/models/BackgroundColor;", "onClick", "PspRowEnd-sW7UJKQ", "(Landroidx/compose/ui/Modifier;JLcom/robinhood/android/instrumentrow/models/BackgroundColor;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PspRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-instrument-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.instrumentrow.PspRowKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PspRow3 {
    private static final float PspRowHeight = C2002Dp.m7995constructorimpl(80);
    private static final float PspRowFillCornerRadius = C2002Dp.m7995constructorimpl(6);
    private static final float PspRowBorderWidth = C2002Dp.m7995constructorimpl(1);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PspRow$lambda$4(Modifier modifier, PspRowState pspRowState, Function0 function0, int i, int i2, Composer composer, int i3) {
        PspRow(modifier, pspRowState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PspRowEnd_sW7UJKQ$lambda$8(Modifier modifier, long j, BackgroundColor backgroundColor, Function0 function0, int i, int i2, Composer composer, int i3) {
        m15341PspRowEndsW7UJKQ(modifier, j, backgroundColor, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PspRowPreview$lambda$9(int i, Composer composer, int i2) {
        PspRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PspRowStart$lambda$6(Modifier modifier, Text text, Text text2, int i, int i2, Composer composer, int i3) {
        PspRowStart(modifier, text, text2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PspRow(Modifier modifier, final PspRowState state, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        int i4;
        final Modifier modifier3;
        Function0<Unit> function03;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1482858996);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (i6 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.instrumentrow.PspRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function03 = (Function0) objRememberedValue;
                } else {
                    function03 = function02;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1482858996, i4, -1, "com.robinhood.android.instrumentrow.PspRow (PspRow.kt:54)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion3, PspRowHeight), 0.0f, 1, null);
                BentoBaseRowLayout8 bentoBaseRowLayout8 = BentoBaseRowLayout8.INSTANCE;
                Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoBaseRowLayout8.m21050getPaddingHorizontalD9Ej5fM(), bentoBaseRowLayout8.m21051getPaddingVerticalD9Ej5fM()), companion.getCenterStart());
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                PspRowStart(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), state.getPrimaryText(), state.getSecondaryText(), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                Function0<Unit> function05 = function03;
                m15341PspRowEndsW7UJKQ(boxScopeInstance.align(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoBaseRowLayout8.m21050getPaddingHorizontalD9Ej5fM(), 0.0f, 11, null), companion.getCenterEnd()), state.m15345getTrailingTextColor0d7_KjU(), state.getTrailingTextBackgroundColor(), function05, composerStartRestartGroup, (i4 << 3) & 7168, 0);
                Divider2.m5581DivideroMI9zvI(boxScopeInstance.align(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), companion.getBottomStart()), bentoTheme.getColors(composerStartRestartGroup, i7).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composerStartRestartGroup, 384, 8);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function04 = function05;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                function04 = function02;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.instrumentrow.PspRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PspRow3.PspRow$lambda$4(modifier3, state, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        function02 = function0;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion32, PspRowHeight), 0.0f, 1, null);
                BentoBaseRowLayout8 bentoBaseRowLayout82 = BentoBaseRowLayout8.INSTANCE;
                Modifier modifierAlign2 = boxScopeInstance2.align(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default2, bentoBaseRowLayout82.m21050getPaddingHorizontalD9Ej5fM(), bentoBaseRowLayout82.m21051getPaddingVerticalD9Ej5fM()), companion4.getCenterStart());
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    PspRowStart(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), state.getPrimaryText(), state.getSecondaryText(), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    Function0<Unit> function052 = function03;
                    m15341PspRowEndsW7UJKQ(boxScopeInstance2.align(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, bentoBaseRowLayout82.m21050getPaddingHorizontalD9Ej5fM(), 0.0f, 11, null), companion4.getCenterEnd()), state.m15345getTrailingTextColor0d7_KjU(), state.getTrailingTextBackgroundColor(), function052, composerStartRestartGroup, (i4 << 3) & 7168, 0);
                    Divider2.m5581DivideroMI9zvI(boxScopeInstance2.align(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 0.0f, 2, null), companion4.getBottomStart()), bentoTheme2.getColors(composerStartRestartGroup, i72).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composerStartRestartGroup, 384, 8);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function04 = function052;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PspRowStart(Modifier modifier, final Text text, final Text text2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Text text3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-649906332);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                text3 = text;
                i3 |= composerStartRestartGroup.changed(text3) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(text2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649906332, i3, -1, "com.robinhood.android.instrumentrow.PspRowStart (PspRow.kt:103)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String value = text3.getValue();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                    long jM15355getColor0d7_KjU = text3.m15355getColor0d7_KjU();
                    TextOverflow.Companion companion2 = TextOverflow.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(value, null, Color.m6701boximpl(jM15355getColor0d7_KjU), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composer2, 817889280, 0, 7546);
                    BentoText2.m20747BentoText38GnDrw(text2.getValue(), null, Color.m6701boximpl(text2.m15355getColor0d7_KjU()), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 817889280, 0, 7546);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.instrumentrow.PspRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PspRow3.PspRowStart$lambda$6(modifier3, text, text2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            if ((i3 & 147) == 146) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    String value2 = text3.getValue();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM();
                    long jM15355getColor0d7_KjU2 = text3.m15355getColor0d7_KjU();
                    TextOverflow.Companion companion22 = TextOverflow.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(value2, null, Color.m6701boximpl(jM15355getColor0d7_KjU2), null, null, null, null, companion22.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM2, composer2, 817889280, 0, 7546);
                    BentoText2.m20747BentoText38GnDrw(text2.getValue(), null, Color.m6701boximpl(text2.m15355getColor0d7_KjU()), null, null, null, null, companion22.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composer2, 817889280, 0, 7546);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        text3 = text;
        if ((i2 & 4) != 0) {
        }
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: PspRowEnd-sW7UJKQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m15341PspRowEndsW7UJKQ(Modifier modifier, final long j, BackgroundColor backgroundColor, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        final BackgroundColor backgroundColor2;
        Function0<Unit> function02;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(747240407);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                backgroundColor2 = backgroundColor;
                i3 |= composerStartRestartGroup.changed(backgroundColor2) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(747240407, i3, -1, "com.robinhood.android.instrumentrow.PspRowEnd (PspRow.kt:128)");
                    }
                    float f = PspRowFillCornerRadius;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(BorderKt.m4876borderxT4_qwU(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(modifier3, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f)), false, null, null, function02, 7, null), PspRowBorderWidth, backgroundColor2.m15350getBorderColor0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f)), backgroundColor2.m15351getFillColor0d7_KjU(), null, 2, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM4872backgroundbw27NRU$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    int i6 = (i3 << 3) & 896;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.GIFT_12), "Gift", j2, null, null, false, composerStartRestartGroup, 48 | BentoIcon4.Size12.$stable | i6, 56);
                    BentoText2.m20747BentoText38GnDrw(" View", null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i6 | 6, 0, 16378);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.instrumentrow.PspRowKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PspRow3.PspRowEnd_sW7UJKQ$lambda$8(modifier3, j, backgroundColor2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                float f2 = PspRowFillCornerRadius;
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(BorderKt.m4876borderxT4_qwU(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(modifier3, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f2)), false, null, null, function02, 7, null), PspRowBorderWidth, backgroundColor2.m15350getBorderColor0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f2)), backgroundColor2.m15351getFillColor0d7_KjU(), null, 2, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierM4872backgroundbw27NRU$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM());
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    int i62 = (i3 << 3) & 896;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.GIFT_12), "Gift", j2, null, null, false, composerStartRestartGroup, 48 | BentoIcon4.Size12.$stable | i62, 56);
                    BentoText2.m20747BentoText38GnDrw(" View", null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i62 | 6, 0, 16378);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        backgroundColor2 = backgroundColor;
        if ((i2 & 8) != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void PspRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-33484825);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-33484825, i, -1, "com.robinhood.android.instrumentrow.PspRowPreview (PspRow.kt:159)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, PspRow.INSTANCE.m15333getLambda$1556052177$lib_instrument_row_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.instrumentrow.PspRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PspRow3.PspRowPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
