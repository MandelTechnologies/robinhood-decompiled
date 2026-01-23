package com.robinhood.android.trade.options.bidaskbar;

import android.content.Context;
import android.util.TypedValue;
import androidx.compose.foundation.Canvas2;
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
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.android.trade.options.OptionOrderSmallDeviceUtil;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarViewState5;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOrderBidAskBarComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\r\u001a\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002\"\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"OptionOrderBidAskBar", "", "state", "Lcom/robinhood/android/trade/options/bidaskbar/OptionOrderBidAskBarViewState;", "onCanvasWidthUpdated", "Lkotlin/Function1;", "", "onDebugBidValueChanged", "", "onDebugMarkValueChanged", "modifier", "Landroidx/compose/ui/Modifier;", "onDebugAskValueChanged", "(Lcom/robinhood/android/trade/options/bidaskbar/OptionOrderBidAskBarViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "dpToFloat", "context", "Landroid/content/Context;", "dpValue", "WHOLE_BID_ASK_BAR_AREA_HEIGHT_DP", "BID_ASK_BAR_WIDTH_DP", "BID_ASK_BAR_TICK_ARROW_HEIGHT_DP", "BID_ASK_BAR_TICK_ARROW_WIDTH_DP", "BID_ASK_BAR_LINE_AND_TICK_ARROW_PADDING_DP", "LIMIT_PRICE_TICK_WIDTH_DP", "LIMIT_PRICE_TICK_HEIGHT_DP", "MARK_TICK_WIDTH_DP", "MARK_TICK_HEIGHT_DP", "LIMIT_PRICE_TICK_HANDLE_LENGTH_DP", "LIMIT_PRICE_TICK_HANDLE_WIDTH_DP", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderBidAskBarComposable {
    private static final float BID_ASK_BAR_LINE_AND_TICK_ARROW_PADDING_DP = 6.0f;
    private static final float BID_ASK_BAR_TICK_ARROW_HEIGHT_DP = 10.0f;
    private static final float BID_ASK_BAR_TICK_ARROW_WIDTH_DP = 7.0f;
    private static final float BID_ASK_BAR_WIDTH_DP = 8.0f;
    private static final float LIMIT_PRICE_TICK_HANDLE_LENGTH_DP = 4.0f;
    private static final float LIMIT_PRICE_TICK_HANDLE_WIDTH_DP = 1.0f;
    private static final float LIMIT_PRICE_TICK_HEIGHT_DP = 14.0f;
    private static final float LIMIT_PRICE_TICK_WIDTH_DP = 8.0f;
    private static final float MARK_TICK_HEIGHT_DP = 12.0f;
    private static final float MARK_TICK_WIDTH_DP = 4.0f;
    private static final float WHOLE_BID_ASK_BAR_AREA_HEIGHT_DP = 64.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOrderBidAskBar$lambda$9(OptionOrderBidAskBarViewState optionOrderBidAskBarViewState, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, Function1 function14, int i, int i2, Composer composer, int i3) {
        OptionOrderBidAskBar(optionOrderBidAskBarViewState, function1, function12, function13, modifier, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOrderBidAskBar(final OptionOrderBidAskBarViewState state, final Function1<? super Float, Unit> onCanvasWidthUpdated, final Function1<? super String, Unit> onDebugBidValueChanged, final Function1<? super String, Unit> onDebugMarkValueChanged, Modifier modifier, final Function1<? super String, Unit> onDebugAskValueChanged, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final float fDpToFloat;
        final long jM21373getBg30d7_KjU;
        final float fDpToFloat2;
        final float fDpToFloat3;
        final float fDpToFloat4;
        final float fDpToFloat5;
        final float fDpToFloat6;
        final float fDpToFloat7;
        final long jM21427getFg30d7_KjU;
        final long jM21456getPositive0d7_KjU;
        final long jM6727getWhite0d7_KjU;
        final float fDpToFloat8;
        final float fDpToFloat9;
        final float f;
        final float f2;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companion;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier modifierFillMaxSize$default;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Modifier modifier3;
        Modifier.Companion companion2;
        Composer composer2;
        Composer composer3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onCanvasWidthUpdated, "onCanvasWidthUpdated");
        Intrinsics.checkNotNullParameter(onDebugBidValueChanged, "onDebugBidValueChanged");
        Intrinsics.checkNotNullParameter(onDebugMarkValueChanged, "onDebugMarkValueChanged");
        Intrinsics.checkNotNullParameter(onDebugAskValueChanged, "onDebugAskValueChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(1099359323);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCanvasWidthUpdated) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDebugBidValueChanged) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDebugMarkValueChanged) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDebugAskValueChanged) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1099359323, i3, -1, "com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBar (OptionOrderBidAskBarComposable.kt:37)");
                }
                fDpToFloat = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 8.0f);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier6 = modifier5;
                jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU();
                fDpToFloat2 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 8.0f);
                fDpToFloat3 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), LIMIT_PRICE_TICK_HEIGHT_DP);
                fDpToFloat4 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 4.0f);
                fDpToFloat5 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 1.0f);
                fDpToFloat6 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 4.0f);
                fDpToFloat7 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), MARK_TICK_HEIGHT_DP);
                jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU();
                jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                jM6727getWhite0d7_KjU = Color.INSTANCE.m6727getWhite0d7_KjU();
                int i6 = i3;
                fDpToFloat8 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), BID_ASK_BAR_TICK_ARROW_WIDTH_DP);
                fDpToFloat9 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 10.0f);
                float fDpToFloat10 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), BID_ASK_BAR_LINE_AND_TICK_ARROW_PADDING_DP);
                float f3 = !Intrinsics.areEqual(state.getLimitPriceTickState(), OptionOrderBidAskBarViewState5.ArrowStart.INSTANCE) ? (fDpToFloat / 2) + fDpToFloat8 + fDpToFloat10 : fDpToFloat / 2;
                f = !Intrinsics.areEqual(state.getLimitPriceTickState(), OptionOrderBidAskBarViewState5.ArrowEnd.INSTANCE) ? (fDpToFloat / 2) + fDpToFloat8 + fDpToFloat10 : fDpToFloat / 2;
                f2 = f3;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier6, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i6 & 112) != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionOrderBidAskBarComposable.OptionOrderBidAskBar$lambda$1$lambda$0(onCanvasWidthUpdated, (IntSize) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(OnRemeasuredModifier2.onSizeChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue), 0.0f, 0.0f, 0.0f, OptionOrderSmallDeviceUtil.getOptionOrderRowVerticalPadding(composerStartRestartGroup, 0), 7, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(WHOLE_BID_ASK_BAR_AREA_HEIGHT_DP)), 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29757R.string.option_order_bid_label, composerStartRestartGroup, 0), boxScopeInstance.align(companion, companion3.getTopStart()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(state.getMarkLabel(), boxScopeInstance.align(companion, companion3.getTopCenter()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29757R.string.option_order_ask_label, composerStartRestartGroup, 0), boxScopeInstance.align(companion, companion3.getTopEnd()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(state.getBidValue(), boxScopeInstance.align(companion, companion3.getBottomStart()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(state.getMarkValue(), boxScopeInstance.align(companion, companion3.getBottomCenter()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(state.getAskValue(), boxScopeInstance.align(companion, companion3.getBottomEnd()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changed(fDpToFloat8) | composerStartRestartGroup.changed(fDpToFloat9) | composerStartRestartGroup.changed(jM21456getPositive0d7_KjU) | composerStartRestartGroup.changed(f2) | composerStartRestartGroup.changed(f) | composerStartRestartGroup.changed(jM21373getBg30d7_KjU) | composerStartRestartGroup.changed(fDpToFloat) | composerStartRestartGroup.changed(fDpToFloat7) | composerStartRestartGroup.changed(jM21427getFg30d7_KjU) | composerStartRestartGroup.changed(fDpToFloat6) | composerStartRestartGroup.changed(fDpToFloat2) | composerStartRestartGroup.changed(fDpToFloat3) | composerStartRestartGroup.changed(fDpToFloat4) | composerStartRestartGroup.changed(fDpToFloat5);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    modifier3 = modifierFillMaxSize$default;
                    companion2 = companion;
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionOrderBidAskBarComposable.OptionOrderBidAskBar$lambda$8$lambda$6$lambda$5$lambda$4(state, jM21456getPositive0d7_KjU, f2, f, jM21373getBg30d7_KjU, fDpToFloat, fDpToFloat7, jM21427getFg30d7_KjU, fDpToFloat6, fDpToFloat2, fDpToFloat3, fDpToFloat4, fDpToFloat5, jM6727getWhite0d7_KjU, fDpToFloat8, fDpToFloat9, (DrawScope) obj);
                        }
                    };
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifierFillMaxSize$default;
                    companion2 = companion;
                }
                composer2.endReplaceGroup();
                Canvas2.Canvas(modifier3, (Function1) objRememberedValue2, composer2, 6);
                composer2.endNode();
                composer2.startReplaceGroup(-1778199581);
                if (state.getShowDebug()) {
                    composer3 = composer2;
                } else {
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer2, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier.Companion companion5 = companion2;
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion5);
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoTextInput4.BentoTextInput(state.getDebugBidText(), onDebugBidValueChanged, Row5.weight$default(row6, companion5, 1.0f, false, 2, null), null, StringResources_androidKt.stringResource(C29757R.string.option_order_bid_label, composer2, 0), null, null, null, null, null, null, null, null, false, false, composer2, (i6 >> 3) & 112, 0, 32744);
                    BentoTextInput4.BentoTextInput(state.getDebugMarkText(), onDebugMarkValueChanged, Row5.weight$default(row6, companion5, 1.0f, false, 2, null), null, StringResources_androidKt.stringResource(C29757R.string.option_order_mark_label, composer2, 0), null, null, null, null, null, null, null, null, false, false, composer2, (i6 >> 6) & 112, 0, 32744);
                    BentoTextInput4.BentoTextInput(state.getDebugAskText(), onDebugAskValueChanged, Row5.weight$default(row6, companion5, 1.0f, false, 2, null), null, StringResources_androidKt.stringResource(C29757R.string.option_order_ask_label, composer2, 0), null, null, null, null, null, null, null, null, false, false, composer2, (i6 >> 12) & 112, 0, 32744);
                    composer3 = composer2;
                    composer3.endNode();
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionOrderBidAskBarComposable.OptionOrderBidAskBar$lambda$9(state, onCanvasWidthUpdated, onDebugBidValueChanged, onDebugMarkValueChanged, modifier4, onDebugAskValueChanged, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            fDpToFloat = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 8.0f);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifier62 = modifier5;
            jM21373getBg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU();
            fDpToFloat2 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 8.0f);
            fDpToFloat3 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), LIMIT_PRICE_TICK_HEIGHT_DP);
            fDpToFloat4 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 4.0f);
            fDpToFloat5 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 1.0f);
            fDpToFloat6 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 4.0f);
            fDpToFloat7 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), MARK_TICK_HEIGHT_DP);
            jM21427getFg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i52).m21427getFg30d7_KjU();
            jM21456getPositive0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i52).m21456getPositive0d7_KjU();
            jM6727getWhite0d7_KjU = Color.INSTANCE.m6727getWhite0d7_KjU();
            int i62 = i3;
            fDpToFloat8 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), BID_ASK_BAR_TICK_ARROW_WIDTH_DP);
            fDpToFloat9 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 10.0f);
            float fDpToFloat102 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), BID_ASK_BAR_LINE_AND_TICK_ARROW_PADDING_DP);
            if (!Intrinsics.areEqual(state.getLimitPriceTickState(), OptionOrderBidAskBarViewState5.ArrowStart.INSTANCE)) {
            }
            f = !Intrinsics.areEqual(state.getLimitPriceTickState(), OptionOrderBidAskBarViewState5.ArrowEnd.INSTANCE) ? (fDpToFloat / 2) + fDpToFloat8 + fDpToFloat102 : fDpToFloat / 2;
            f2 = f3;
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier62, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i62 & 112) != 32) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionOrderBidAskBarComposable.OptionOrderBidAskBar$lambda$1$lambda$0(onCanvasWidthUpdated, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(OnRemeasuredModifier2.onSizeChanged(modifierFillMaxWidth$default3, (Function1) objRememberedValue), 0.0f, 0.0f, 0.0f, OptionOrderSmallDeviceUtil.getOptionOrderRowVerticalPadding(composerStartRestartGroup, 0), 7, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion32 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion42.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion42.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(WHOLE_BID_ASK_BAR_AREA_HEIGHT_DP)), 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default22);
                    Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29757R.string.option_order_bid_label, composerStartRestartGroup, 0), boxScopeInstance2.align(companion, companion32.getTopStart()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                        BentoText2.m20747BentoText38GnDrw(state.getMarkLabel(), boxScopeInstance2.align(companion, companion32.getTopCenter()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29757R.string.option_order_ask_label, composerStartRestartGroup, 0), boxScopeInstance2.align(companion, companion32.getTopEnd()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                        BentoText2.m20747BentoText38GnDrw(state.getBidValue(), boxScopeInstance2.align(companion, companion32.getBottomStart()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                        BentoText2.m20747BentoText38GnDrw(state.getMarkValue(), boxScopeInstance2.align(companion, companion32.getBottomCenter()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                        BentoText2.m20747BentoText38GnDrw(state.getAskValue(), boxScopeInstance2.align(companion, companion32.getBottomEnd()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                        modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changed(fDpToFloat8) | composerStartRestartGroup.changed(fDpToFloat9) | composerStartRestartGroup.changed(jM21456getPositive0d7_KjU) | composerStartRestartGroup.changed(f2) | composerStartRestartGroup.changed(f) | composerStartRestartGroup.changed(jM21373getBg30d7_KjU) | composerStartRestartGroup.changed(fDpToFloat) | composerStartRestartGroup.changed(fDpToFloat7) | composerStartRestartGroup.changed(jM21427getFg30d7_KjU) | composerStartRestartGroup.changed(fDpToFloat6) | composerStartRestartGroup.changed(fDpToFloat2) | composerStartRestartGroup.changed(fDpToFloat3) | composerStartRestartGroup.changed(fDpToFloat4) | composerStartRestartGroup.changed(fDpToFloat5);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            modifier3 = modifierFillMaxSize$default;
                            companion2 = companion;
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return OptionOrderBidAskBarComposable.OptionOrderBidAskBar$lambda$8$lambda$6$lambda$5$lambda$4(state, jM21456getPositive0d7_KjU, f2, f, jM21373getBg30d7_KjU, fDpToFloat, fDpToFloat7, jM21427getFg30d7_KjU, fDpToFloat6, fDpToFloat2, fDpToFloat3, fDpToFloat4, fDpToFloat5, jM6727getWhite0d7_KjU, fDpToFloat8, fDpToFloat9, (DrawScope) obj);
                                }
                            };
                            composer2 = composerStartRestartGroup;
                            composer2.updateRememberedValue(objRememberedValue2);
                            composer2.endReplaceGroup();
                            Canvas2.Canvas(modifier3, (Function1) objRememberedValue2, composer2, 6);
                            composer2.endNode();
                            composer2.startReplaceGroup(-1778199581);
                            if (state.getShowDebug()) {
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier62;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOrderBidAskBar$lambda$1$lambda$0(Function1 function1, IntSize intSize) {
        function1.invoke(Float.valueOf((int) (intSize.getPackedValue() >> 32)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOrderBidAskBar$lambda$8$lambda$6$lambda$5$lambda$4(OptionOrderBidAskBarViewState optionOrderBidAskBarViewState, long j, float f, float f2, long j2, float f3, float f4, long j3, float f5, float f6, float f7, float f8, float f9, long j4, float f10, float f11, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        if (optionOrderBidAskBarViewState.getLimitPriceTickState() instanceof OptionOrderBidAskBarViewState5.ArrowStart) {
            Path Path = AndroidPath_androidKt.Path();
            float f12 = 2;
            float f13 = fIntBitsToFloat / f12;
            Path.moveTo(0.0f, f13);
            float f14 = f11 / f12;
            Path.lineTo(f10, f13 + f14);
            Path.lineTo(f10, f13 - f14);
            Path.close();
            DrawScope.m6955drawPathLG529CI$default(Canvas, Path, j, 0.0f, null, null, 0, 60, null);
        }
        if (optionOrderBidAskBarViewState.getLimitPriceTickState() instanceof OptionOrderBidAskBarViewState5.ArrowEnd) {
            Path Path2 = AndroidPath_androidKt.Path();
            float f15 = 2;
            float f16 = fIntBitsToFloat / f15;
            Path2.moveTo(optionOrderBidAskBarViewState.getCanvasWidth(), f16);
            float f17 = f11 / f15;
            Path2.lineTo(optionOrderBidAskBarViewState.getCanvasWidth() - f10, f16 + f17);
            Path2.lineTo(optionOrderBidAskBarViewState.getCanvasWidth() - f10, f16 - f17);
            Path2.close();
            DrawScope.m6955drawPathLG529CI$default(Canvas, Path2, j, 0.0f, null, null, 0, 60, null);
        }
        float f18 = 2;
        float f19 = fIntBitsToFloat / f18;
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L));
        long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(optionOrderBidAskBarViewState.getCanvasWidth() - f2) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L));
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j2, jM6535constructorimpl, jM6535constructorimpl2, f3, companion.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        if (optionOrderBidAskBarViewState.getShowMarkTick()) {
            float f20 = f4 / f18;
            DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j3, Offset.m6535constructorimpl((Float.floatToRawIntBits(optionOrderBidAskBarViewState.getCanvasWidth() / f18) << 32) | (Float.floatToRawIntBits(f19 - f20) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(f20 + f19) & 4294967295L) | (Float.floatToRawIntBits(optionOrderBidAskBarViewState.getCanvasWidth() / f18) << 32)), f5, companion.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        }
        if (optionOrderBidAskBarViewState.getLimitPriceTickState() instanceof OptionOrderBidAskBarViewState5.TickPosition) {
            float percent = (f6 / f18) + (((OptionOrderBidAskBarViewState5.TickPosition) optionOrderBidAskBarViewState.getLimitPriceTickState()).getPercent() * (optionOrderBidAskBarViewState.getCanvasWidth() - f6));
            float f21 = f7 / f18;
            DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(percent) << 32) | (Float.floatToRawIntBits(f19 - f21) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(percent) << 32) | (Float.floatToRawIntBits(f21 + f19) & 4294967295L)), f6, companion.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            float f22 = f8 / f18;
            float f23 = percent - f22;
            float f24 = f19 - f9;
            DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j4, Offset.m6535constructorimpl((Float.floatToRawIntBits(f23) << 32) | (Float.floatToRawIntBits(f24) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(r21) << 32) | (Float.floatToRawIntBits(f24) & 4294967295L)), f9, companion.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            float f25 = f19 + f9;
            DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j4, Offset.m6535constructorimpl((Float.floatToRawIntBits(f23) << 32) | (Float.floatToRawIntBits(f25) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(f25) & 4294967295L) | (Float.floatToRawIntBits(percent + f22) << 32)), f9, companion.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        }
        return Unit.INSTANCE;
    }

    private static final float dpToFloat(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
