package com.robinhood.shared.crypto.transfer.unified.sheet;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TipsSheetContent.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"TestTagTransferTipsSheet", "", "TransferTipsSheetContent", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "state", "Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TipsSheetContent {
    public static final String TestTagTransferTipsSheet = "transfer_tips_sheet";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferTipsSheetContent$lambda$6(RhModalBottomSheet5 rhModalBottomSheet5, TipsSheetContent2 tipsSheetContent2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TransferTipsSheetContent(rhModalBottomSheet5, tipsSheetContent2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x036f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransferTipsSheetContent(RhModalBottomSheet5 rhModalBottomSheet5, TipsSheetContent2 state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        int i5;
        StringResource transferLimitsSubtitle;
        int i6;
        int i7;
        boolean z;
        Object objRememberedValue;
        boolean z2;
        final TipsSheetContent2 tipsSheetContent2;
        boolean z3;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final RhModalBottomSheet5 rhModalBottomSheet52 = rhModalBottomSheet5;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet52, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1390731047);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet52) : composerStartRestartGroup.changedInstance(rhModalBottomSheet52) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1390731047, i3, -1, "com.robinhood.shared.crypto.transfer.unified.sheet.TransferTipsSheetContent (TipsSheetContent.kt:42)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(TestTag3.testTag(modifier4, TestTagTransferTipsSheet), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
                String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfers_tip_sheet_title, composerStartRestartGroup, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_tips_sheet_compat_title, composerStartRestartGroup, 0);
                StringResource compatibilitySubtitle = state.getCompatibilitySubtitle();
                int i10 = StringResource.$stable;
                String string2 = StringResource2.getString(compatibilitySubtitle, composerStartRestartGroup, i10);
                BentoValuePropRow2.Icon icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.COPY_24, null, 2, null);
                BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Top;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                int i11 = BentoValuePropRow2.Icon.$stable;
                BentoValuePropRow3.BentoValuePropRow(strStringResource2, string2, icon, bentoValuePropRow, modifierFillMaxWidth$default, composerStartRestartGroup, (i11 << 6) | 27648, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_tips_sheet_one_way_title, composerStartRestartGroup, 0);
                if (!state.isRhc()) {
                    i5 = C37934R.string.crypto_unified_tips_sheet_one_way_subtitle_rhc;
                } else {
                    i5 = C37934R.string.crypto_unified_tips_sheet_one_way_subtitle;
                }
                BentoValuePropRow3.BentoValuePropRow(strStringResource3, StringResources_androidKt.stringResource(i5, composerStartRestartGroup, 0), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.ARROW_RIGHT_24, null, 2, null), bentoValuePropRow, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, (i11 << 6) | 27648, 0);
                BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37934R.string.crypto_unified_tips_sheet_small_title, composerStartRestartGroup, 0), StringResource2.getString(state.getStartSmallSubtitle(), composerStartRestartGroup, i10), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.RISK_AND_UNCERTAINTY_24, null, 2, null), bentoValuePropRow, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, (i11 << 6) | 27648, 0);
                transferLimitsSubtitle = state.getTransferLimitsSubtitle();
                composerStartRestartGroup.startReplaceGroup(556537546);
                if (transferLimitsSubtitle != null) {
                    BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37934R.string.crypto_unified_tips_sheet_limits_title, composerStartRestartGroup, 0), StringResource2.getString(transferLimitsSubtitle, composerStartRestartGroup, i10), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.TRANSFERS_24, null, 2, null), bentoValuePropRow, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, (i11 << 6) | 27648, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                if (!state.isRhc()) {
                    i6 = C37934R.string.crypto_unified_tips_sheet_primary_cta_rhc;
                } else {
                    i6 = C37934R.string.crypto_unified_tips_sheet_primary_cta;
                }
                String strStringResource4 = StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0);
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                i7 = i4 & 14;
                z = i7 != 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet52));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TipsSheetContent.TransferTipsSheetContent$lambda$5$lambda$2$lambda$1(rhModalBottomSheet52);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource4, modifierM5144paddingVpY3zN4$default, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                boolean z4 = false;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                String strStringResource5 = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composerStartRestartGroup, 0);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 2, null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                if (i7 == 4) {
                    if ((i4 & 8) != 0) {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                        if (composerStartRestartGroup.changedInstance(rhModalBottomSheet52)) {
                        }
                        boolean zChangedInstance = z2 | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                        if ((i4 & 112) == 32) {
                            if ((i4 & 64) != 0) {
                                tipsSheetContent2 = state;
                                if (composerStartRestartGroup.changedInstance(tipsSheetContent2)) {
                                }
                            } else {
                                tipsSheetContent2 = state;
                            }
                            z3 = zChangedInstance | z4;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContentKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TipsSheetContent.TransferTipsSheetContent$lambda$5$lambda$4$lambda$3(rhModalBottomSheet52, navigator, context, tipsSheetContent2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource5, modifierM5146paddingqDBjuR0$default, null, type3, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } else {
                            tipsSheetContent2 = state;
                        }
                        z4 = true;
                        z3 = zChangedInstance | z4;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z3) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContentKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TipsSheetContent.TransferTipsSheetContent$lambda$5$lambda$4$lambda$3(rhModalBottomSheet52, navigator, context, tipsSheetContent2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource5, modifierM5146paddingqDBjuR0$default, null, type3, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier5;
                        }
                    } else {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                    }
                    z2 = false;
                    boolean zChangedInstance2 = z2 | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    if ((i4 & 112) == 32) {
                    }
                    z4 = true;
                    z3 = zChangedInstance2 | z4;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z3) {
                    }
                } else {
                    rhModalBottomSheet52 = rhModalBottomSheet5;
                }
                z2 = true;
                boolean zChangedInstance22 = z2 | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                if ((i4 & 112) == 32) {
                }
                z4 = true;
                z3 = zChangedInstance22 | z4;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                tipsSheetContent2 = state;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final TipsSheetContent2 tipsSheetContent22 = tipsSheetContent2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TipsSheetContent.TransferTipsSheetContent$lambda$6(rhModalBottomSheet52, tipsSheetContent22, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(TestTag3.testTag(modifier4, TestTagTransferTipsSheet), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
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
                String strStringResource6 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfers_tip_sheet_title, composerStartRestartGroup, 0);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i92 = BentoTheme.$stable;
                Modifier modifier52 = modifier4;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource6, PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i92).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                String strStringResource22 = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_tips_sheet_compat_title, composerStartRestartGroup, 0);
                StringResource compatibilitySubtitle2 = state.getCompatibilitySubtitle();
                int i102 = StringResource.$stable;
                String string22 = StringResource2.getString(compatibilitySubtitle2, composerStartRestartGroup, i102);
                BentoValuePropRow2.Icon icon2 = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.COPY_24, null, 2, null);
                BentoValuePropRow bentoValuePropRow2 = BentoValuePropRow.Top;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                int i112 = BentoValuePropRow2.Icon.$stable;
                BentoValuePropRow3.BentoValuePropRow(strStringResource22, string22, icon2, bentoValuePropRow2, modifierFillMaxWidth$default2, composerStartRestartGroup, (i112 << 6) | 27648, 0);
                String strStringResource32 = StringResources_androidKt.stringResource(C37934R.string.crypto_unified_tips_sheet_one_way_title, composerStartRestartGroup, 0);
                if (!state.isRhc()) {
                }
                BentoValuePropRow3.BentoValuePropRow(strStringResource32, StringResources_androidKt.stringResource(i5, composerStartRestartGroup, 0), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.ARROW_RIGHT_24, null, 2, null), bentoValuePropRow2, SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), composerStartRestartGroup, (i112 << 6) | 27648, 0);
                BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37934R.string.crypto_unified_tips_sheet_small_title, composerStartRestartGroup, 0), StringResource2.getString(state.getStartSmallSubtitle(), composerStartRestartGroup, i102), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.RISK_AND_UNCERTAINTY_24, null, 2, null), bentoValuePropRow2, SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), composerStartRestartGroup, (i112 << 6) | 27648, 0);
                transferLimitsSubtitle = state.getTransferLimitsSubtitle();
                composerStartRestartGroup.startReplaceGroup(556537546);
                if (transferLimitsSubtitle != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                BentoButtons.Type type22 = BentoButtons.Type.Primary;
                if (!state.isRhc()) {
                }
                String strStringResource42 = StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0);
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                i7 = i4 & 14;
                if (i7 != 4) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TipsSheetContent.TransferTipsSheetContent$lambda$5$lambda$2$lambda$1(rhModalBottomSheet52);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource42, modifierM5144paddingVpY3zN4$default2, null, type22, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        boolean z42 = false;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        BentoButtons.Type type32 = BentoButtons.Type.Secondary;
                        String strStringResource52 = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composerStartRestartGroup, 0);
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM(), 2, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        if (i7 == 4) {
                        }
                        z2 = true;
                        boolean zChangedInstance222 = z2 | composerStartRestartGroup.changedInstance(navigator2) | composerStartRestartGroup.changedInstance(context2);
                        if ((i4 & 112) == 32) {
                        }
                        z42 = true;
                        z3 = zChangedInstance222 | z42;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z3) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferTipsSheetContent$lambda$5$lambda$2$lambda$1(RhModalBottomSheet5 rhModalBottomSheet5) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferTipsSheetContent$lambda$5$lambda$4$lambda$3(RhModalBottomSheet5 rhModalBottomSheet5, Navigator navigator, Context context, TipsSheetContent2 tipsSheetContent2) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        StringResource learnMoreUrl = tipsSheetContent2.getLearnMoreUrl();
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, context, learnMoreUrl.getText(resources).toString());
        return Unit.INSTANCE;
    }
}
