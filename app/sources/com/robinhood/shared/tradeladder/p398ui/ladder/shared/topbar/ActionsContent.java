package com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.tradeladder.C40888R;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ActionsContent.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0081\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a;\u0010\u0015\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0006X\u008a\u008e\u0002"}, m3636d2 = {"FLATTEN_BUTTON_IDENTIFIER", "", "FLATTEN_CANCEL_IDENTIFIER", "ActionsContent", "", "isFlattenButtonVisible", "", "isFlattenButtonEnabled", "isFlattenLoading", "flattenAlertContent", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/FlattenAlertContent;", "onSettingsClicked", "Lkotlin/Function0;", "onFlattenClicked", "showFtuxTooltip", "showFlattenOrdersTooltip", "showNextPostTradeFtuxTooltipState", "dismissFtuxTooltip", "modifier", "Landroidx/compose/ui/Modifier;", "(ZZZLcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/FlattenAlertContent;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "FlattenAlert", "onDismiss", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/FlattenAlertContent;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FlattenAlertPreview", "(Landroidx/compose/runtime/Composer;I)V", "FlattenAlertLoadingPreview", "lib-trade-ladder_externalDebug", "showingFlattenConfirmation", "showingFlattenUnavailable"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ActionsContent {
    private static final String FLATTEN_BUTTON_IDENTIFIER = "EQUITIES_LADDER_FLATTEN_BUTTON";
    private static final String FLATTEN_CANCEL_IDENTIFIER = "EQUITIES_LADDER_FLATTEN_CANCEL";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionsContent$lambda$16(boolean z, boolean z2, boolean z3, FlattenAlertContent flattenAlertContent, Function0 function0, Function0 function02, boolean z4, boolean z5, Function0 function03, Function0 function04, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        ActionsContent(z, z2, z3, flattenAlertContent, function0, function02, z4, z5, function03, function04, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlattenAlert$lambda$24(FlattenAlertContent flattenAlertContent, boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        FlattenAlert(flattenAlertContent, z, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlattenAlertLoadingPreview$lambda$26(int i, Composer composer, int i2) {
        FlattenAlertLoadingPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlattenAlertPreview$lambda$25(int i, Composer composer, int i2) {
        FlattenAlertPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActionsContent(final boolean z, final boolean z2, final boolean z3, final FlattenAlertContent flattenAlertContent, final Function0<Unit> onSettingsClicked, final Function0<Unit> onFlattenClicked, final boolean z4, final boolean z5, final Function0<Unit> showNextPostTradeFtuxTooltipState, final Function0<Unit> dismissFtuxTooltip, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        final Modifier modifier2;
        int i8;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Modifier modifier3;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        int i9;
        CoroutineScope coroutineScope;
        Composer composer3;
        boolean z6;
        Object objRememberedValue4;
        Object objRememberedValue5;
        long jM21427getFg30d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onSettingsClicked, "onSettingsClicked");
        Intrinsics.checkNotNullParameter(onFlattenClicked, "onFlattenClicked");
        Intrinsics.checkNotNullParameter(showNextPostTradeFtuxTooltipState, "showNextPostTradeFtuxTooltipState");
        Intrinsics.checkNotNullParameter(dismissFtuxTooltip, "dismissFtuxTooltip");
        Composer composerStartRestartGroup = composer.startRestartGroup(154571481);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(flattenAlertContent) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onSettingsClicked) ? 16384 : 8192;
            }
            int i10 = i4;
            if ((i3 & 32) == 0) {
                i5 = i10 | 196608;
            } else if ((i & 196608) == 0) {
                i5 = i10 | (composerStartRestartGroup.changedInstance(onFlattenClicked) ? 131072 : 65536);
            } else {
                i5 = i10;
            }
            if ((i3 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i5 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
            }
            if ((i3 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    i5 |= composerStartRestartGroup.changed(z5) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i5 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(showNextPostTradeFtuxTooltipState) ? 67108864 : 33554432;
                }
                if ((i3 & 512) != 0) {
                    i5 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(dismissFtuxTooltip) ? 536870912 : 268435456;
                }
                i6 = i5;
                i7 = i3 & 1024;
                if (i7 != 0) {
                    modifier2 = modifier;
                    i8 = i2 | 6;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 6) == 0) {
                        i8 = i2 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
                    } else {
                        i8 = i2;
                    }
                }
                if ((i6 & 306783379) == 306783378 && (i8 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer3 = composerStartRestartGroup;
                } else {
                    Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(154571481, i6, i8, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContent (ActionsContent.kt:57)");
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 != companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    modifier3 = modifier4;
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1986433010);
                    if (z) {
                        composer2 = composerStartRestartGroup;
                        i9 = i6;
                        coroutineScope = coroutineScope2;
                    } else {
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        ActionsContent2 actionsContent2 = ActionsContent2.INSTANCE;
                        Function2<Composer, Integer, Unit> function2M26286getLambda$1422770365$lib_trade_ladder_externalDebug = actionsContent2.m26286getLambda$1422770365$lib_trade_ladder_externalDebug();
                        i9 = i6;
                        composer2 = composerStartRestartGroup;
                        coroutineScope = coroutineScope2;
                        Modifier modifierPopupAutodismissTooltip$default = ModifiersKt.popupAutodismissTooltip$default(companion4, z5, coroutineScope, showNextPostTradeFtuxTooltipState, 0L, function2M26286getLambda$1422770365$lib_trade_ladder_externalDebug, 8, null);
                        boolean zActionsContent$lambda$4 = ActionsContent$lambda$4(snapshotState2);
                        composer2.startReplaceGroup(5004770);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ActionsContent.ActionsContent$lambda$11$lambda$7$lambda$6(snapshotState2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierPopupAutodismissTooltip$default2 = ModifiersKt.popupAutodismissTooltip$default(modifierPopupAutodismissTooltip$default, zActionsContent$lambda$4, coroutineScope, (Function0) objRememberedValue6, 0L, actionsContent2.getLambda$1099628956$lib_trade_ladder_externalDebug(), 8, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierPopupAutodismissTooltip$default2);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.NO_VALUE_24);
                        String strStringResource = StringResources_androidKt.stringResource(C40888R.string.flatten_label, composer2, 0);
                        if (z2) {
                            composer2.startReplaceGroup(-942827862);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-942754423);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        long j = jM21427getFg30d7_KjU;
                        Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(PaddingKt.m5142padding3ABfNKs(companion4, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, FLATTEN_BUTTON_IDENTIFIER, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                        composer2.startReplaceGroup(-1746271574);
                        boolean z7 = (i9 & 112) == 32;
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (z7 || objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ActionsContent.ActionsContent$lambda$11$lambda$10$lambda$9$lambda$8(z2, snapshotState, snapshotState2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        composer2.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, j, modifierAutoLogEvents$default, (Function0) objRememberedValue7, false, composer2, BentoIcon4.Size24.$stable, 32);
                        composer2.endNode();
                    }
                    composer2.endReplaceGroup();
                    Composer composer4 = composer2;
                    BentoIconButton2.m20641BentoIconButtoncqYvz4g(onSettingsClicked, new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.CONTROLS_24), StringResources_androidKt.stringResource(C40888R.string.ladder_settings_label, composer2, 0), ModifiersKt.popupAutodismissTooltip$default(Modifier.INSTANCE, z4, coroutineScope, dismissFtuxTooltip, 0L, ActionsContent2.INSTANCE.getLambda$1370133491$lib_trade_ladder_externalDebug(), 8, null), BentoIconButton4.Type.Secondary, false, null, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU()), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(40)), false, composer4, ((i9 >> 12) & 14) | 805330944 | (BentoIconButton4.Icon.HeroSize24.$stable << 3), 0, 1248);
                    composer3 = composer4;
                    composer3.endNode();
                    if (!ActionsContent$lambda$1(snapshotState) || z3) {
                        composer3.startReplaceGroup(-1633490746);
                        z6 = (i9 & 458752) == 131072;
                        objRememberedValue4 = composer3.rememberedValue();
                        if (!z6 || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ActionsContent.ActionsContent$lambda$13$lambda$12(onFlattenClicked, snapshotState);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        Function0 function0 = (Function0) objRememberedValue4;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(5004770);
                        objRememberedValue5 = composer3.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ActionsContent.ActionsContent$lambda$15$lambda$14(snapshotState);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceGroup();
                        modifier2 = modifier3;
                        FlattenAlert(flattenAlertContent, z3, function0, (Function0) objRememberedValue5, composer3, ((i9 >> 9) & 14) | 3072 | ((i9 >> 3) & 112));
                    } else {
                        modifier2 = modifier3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ActionsContent.ActionsContent$lambda$16(z, z2, z3, flattenAlertContent, onSettingsClicked, onFlattenClicked, z4, z5, showNextPostTradeFtuxTooltipState, dismissFtuxTooltip, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 12582912;
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i6 = i5;
            i7 = i3 & 1024;
            if (i7 != 0) {
            }
            if ((i6 & 306783379) == 306783378) {
                if (i7 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                CoroutineScope coroutineScope22 = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 != companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(start2, companion22.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                modifier3 = modifier4;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1986433010);
                    if (z) {
                    }
                    composer2.endReplaceGroup();
                    Composer composer42 = composer2;
                    BentoIconButton2.m20641BentoIconButtoncqYvz4g(onSettingsClicked, new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.CONTROLS_24), StringResources_androidKt.stringResource(C40888R.string.ladder_settings_label, composer2, 0), ModifiersKt.popupAutodismissTooltip$default(Modifier.INSTANCE, z4, coroutineScope, dismissFtuxTooltip, 0L, ActionsContent2.INSTANCE.getLambda$1370133491$lib_trade_ladder_externalDebug(), 8, null), BentoIconButton4.Type.Secondary, false, null, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU()), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(40)), false, composer42, ((i9 >> 12) & 14) | 805330944 | (BentoIconButton4.Icon.HeroSize24.$stable << 3), 0, 1248);
                    composer3 = composer42;
                    composer3.endNode();
                    if (ActionsContent$lambda$1(snapshotState)) {
                        composer3.startReplaceGroup(-1633490746);
                        if ((i9 & 458752) == 131072) {
                        }
                        objRememberedValue4 = composer3.rememberedValue();
                        if (!z6) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ActionsContent.ActionsContent$lambda$13$lambda$12(onFlattenClicked, snapshotState);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                            Function0 function02 = (Function0) objRememberedValue4;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(5004770);
                            objRememberedValue5 = composer3.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                            }
                            composer3.endReplaceGroup();
                            modifier2 = modifier3;
                            FlattenAlert(flattenAlertContent, z3, function02, (Function0) objRememberedValue5, composer3, ((i9 >> 9) & 14) | 3072 | ((i9 >> 3) & 112));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 16) == 0) {
        }
        int i102 = i4;
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i6 = i5;
        i7 = i3 & 1024;
        if (i7 != 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void ActionsContent$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void ActionsContent$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionsContent$lambda$11$lambda$7$lambda$6(SnapshotState snapshotState) {
        ActionsContent$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final boolean ActionsContent$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean ActionsContent$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionsContent$lambda$11$lambda$10$lambda$9$lambda$8(boolean z, SnapshotState snapshotState, SnapshotState snapshotState2) {
        if (z) {
            ActionsContent$lambda$2(snapshotState, true);
        } else {
            ActionsContent$lambda$5(snapshotState2, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionsContent$lambda$13$lambda$12(Function0 function0, SnapshotState snapshotState) {
        function0.invoke();
        ActionsContent$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionsContent$lambda$15$lambda$14(SnapshotState snapshotState) {
        ActionsContent$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    public static final void FlattenAlert(final FlattenAlertContent flattenAlertContent, boolean z, final Function0<Unit> onFlattenClicked, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final boolean z2 = z;
        Intrinsics.checkNotNullParameter(onFlattenClicked, "onFlattenClicked");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1480208438);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(flattenAlertContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onFlattenClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1480208438, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.FlattenAlert (ActionsContent.kt:166)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ALERT, FLATTEN_BUTTON_IDENTIFIER, null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            String strStringResource = StringResources_androidKt.stringResource(C40888R.string.ladder_flatten_dialog_title, composerStartRestartGroup, 0);
            BentoAlertDialog2.Body annotated = flattenAlertContent != null ? new BentoAlertDialog2.Body.Annotated(flattenAlertContent.getAnnotatedString(), flattenAlertContent.getInlineContent()) : null;
            composerStartRestartGroup.startReplaceGroup(-846108788);
            if (annotated == null) {
                annotated = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C40888R.string.ladder_flatten_dialog_desc, composerStartRestartGroup, 0));
            }
            BentoAlertDialog2.Body body = annotated;
            composerStartRestartGroup.endReplaceGroup();
            String strStringResource2 = StringResources_androidKt.stringResource(C40888R.string.ladder_flatten_yes_label, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ActionsContent.FlattenAlert$lambda$19$lambda$18(userInteractionEventDescriptor, current, onFlattenClicked);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2;
            boolean z3 = false;
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue, null, null, null, z, 28, null);
            z2 = z;
            String strStringResource3 = StringResources_androidKt.stringResource(C40888R.string.ladder_flatten_no_label, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i4 = i3 & 112;
            int i5 = i3 & 7168;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | (i4 == 32) | composerStartRestartGroup.changedInstance(current) | (i5 == 2048);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ActionsContent.FlattenAlert$lambda$21$lambda$20(z2, userInteractionEventDescriptor, current, onDismiss);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance3 = (i4 == 32) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current);
            if (i5 == 2048) {
                z3 = true;
            }
            boolean z4 = zChangedInstance3 | z3;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ActionsContent.FlattenAlert$lambda$23$lambda$22(z2, userInteractionEventDescriptor, current, onDismiss);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            int i6 = BentoAlertDialog2.Body.$stable << 3;
            int i7 = BentoAlertButton.$stable;
            composer2 = composerStartRestartGroup;
            BentoAlertDialog.BentoAlertDialog(strStringResource, body, bentoAlertButton, modifierAutoLogEvents$default, bentoAlertButton2, null, false, null, function0, composer2, i6 | (i7 << 6) | (i7 << 12), 224);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ActionsContent.FlattenAlert$lambda$24(flattenAlertContent, z2, onFlattenClicked, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlattenAlert$lambda$19$lambda$18(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.CONTINUE_BUTTON, FLATTEN_BUTTON_IDENTIFIER, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlattenAlert$lambda$21$lambda$20(boolean z, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Function0 function0) {
        if (!z) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.CANCEL_CONFIRMATION_ALERT, FLATTEN_CANCEL_IDENTIFIER, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlattenAlert$lambda$23$lambda$22(boolean z, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Function0 function0) {
        if (!z) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.CANCEL_CONFIRMATION_ALERT, FLATTEN_CANCEL_IDENTIFIER, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void FlattenAlertPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1743908617);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1743908617, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.FlattenAlertPreview (ActionsContent.kt:236)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ActionsContent2.INSTANCE.m26288getLambda$949283665$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ActionsContent.FlattenAlertPreview$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FlattenAlertLoadingPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(300949351);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(300949351, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.FlattenAlertLoadingPreview (ActionsContent.kt:254)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ActionsContent2.INSTANCE.m26287getLambda$1655571281$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ActionsContentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ActionsContent.FlattenAlertLoadingPreview$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
