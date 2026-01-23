package com.robinhood.shared.trade.crypto.p397ui.taxLots.strategy;

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
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.shared.trade.crypto.C40095R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: CryptoTaxLotStrategySelectionBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aM\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\"\u0016\u0010\u000e\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"CryptoTaxLotStrategySelectionBottomSheetComposable", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "onStrategyTapped", "Lkotlin/Function1;", "Lnummus/v1/TaxLotStrategyTypeDto;", "taxLotStrategySelectionRowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/strategy/TaxLotStrategySelectionRowState;", "onContinue", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Lkotlin/jvm/functions/Function1;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TAX_LOT_STRATEGY_SELECTION_STRATEGY_LOADING_ROW_TEST_TAG", "", "getTAX_LOT_STRATEGY_SELECTION_STRATEGY_LOADING_ROW_TEST_TAG$annotations", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.strategy.CryptoTaxLotStrategySelectionBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTaxLotStrategySelectionBottomSheetComposable3 {
    public static final String TAX_LOT_STRATEGY_SELECTION_STRATEGY_LOADING_ROW_TEST_TAG = "crypto_tax_lot_strategy_selection_strategy_loading_row_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotStrategySelectionBottomSheetComposable$lambda$5(RhModalBottomSheet5 rhModalBottomSheet5, Function1 function1, ImmutableList immutableList, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTaxLotStrategySelectionBottomSheetComposable(rhModalBottomSheet5, function1, immutableList, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: getTAX_LOT_STRATEGY_SELECTION_STRATEGY_LOADING_ROW_TEST_TAG$annotations */
    public static /* synthetic */ void m2934x8ea9a8ba() {
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTaxLotStrategySelectionBottomSheetComposable(final RhModalBottomSheet5 rhModalBottomSheet5, final Function1<? super TaxLotStrategyTypeDto, Unit> onStrategyTapped, final ImmutableList<TaxLotStrategySelectionRowState> immutableList, final Function0<Unit> onContinue, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(onStrategyTapped, "onStrategyTapped");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(1327575848);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onStrategyTapped) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 2048 : 1024;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9361) == 9360 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1327575848, i3, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.strategy.CryptoTaxLotStrategySelectionBottomSheetComposable (CryptoTaxLotStrategySelectionBottomSheetComposable.kt:37)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                int i6 = i3;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_strategy_selection_bottom_sheet_title, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, 48, 0, 8120);
                Composer composer2 = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                if (immutableList != null || immutableList.isEmpty()) {
                    composer2.startReplaceGroup(2085139712);
                    for (TaxLotStrategySelectionRowState taxLotStrategySelectionRowState : immutableList) {
                        BentoSelectionRowState state = taxLotStrategySelectionRowState.getState();
                        final TaxLotStrategyTypeDto type2 = taxLotStrategySelectionRowState.getType();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Component.ComponentType componentType = Component.ComponentType.ROW;
                        String json_value = type2.getJson_value();
                        if (json_value == null) {
                            json_value = "";
                        }
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, json_value, null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, "tax_lot_strategy", null, 4, null), null, null, null, null, 30, null), 15, null), false, false, false, true, false, null, 110, null);
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged = composer2.changed(type2.ordinal()) | ((i6 & 112) == 32);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.strategy.CryptoTaxLotStrategySelectionBottomSheetComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTaxLotStrategySelectionBottomSheetComposable3.m2933x8aac544d(onStrategyTapped, type2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        BentoSelectionRow2.BentoSelectionRow(modifierAutoLogEvents$default, state, (Function0) objRememberedValue, composer2, BentoSelectionRowState.$stable << 3, 0);
                    }
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(2084279276);
                    for (int i7 = 0; i7 < 5; i7++) {
                        Composer composer3 = composer2;
                        LocalShowPlaceholder.Loadable(true, TestTag3.testTag(Modifier.INSTANCE, TAX_LOT_STRATEGY_SELECTION_STRATEGY_LOADING_ROW_TEST_TAG + i7), null, CryptoTaxLotStrategySelectionBottomSheetComposable.INSTANCE.m26045getLambda$1350160202$feature_trade_crypto_externalDebug(), composer3, 3078, 4);
                        composer2 = composer3;
                    }
                    composer2.endReplaceGroup();
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer2, i8).m21592getMediumD9Ej5fM()), composer2, 0);
                Composer composer4 = composer2;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_strategy_selection_bottom_sheet_footer, composer2, 0), SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.m6701boximpl(bentoTheme2.getColors(composer2, i8).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i8).getTextS(), composer4, 48, 0, 8120);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer4, i8).m21592getMediumD9Ej5fM()), composer4, 0);
                BentoButtonKt.m20586BentoButtonEikTQX8(onContinue, StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_strategy_selection_bottom_sheet_cta, composer4, 0), ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, "tax_lot_strategy", null, 4, null), null, null, null, null, 30, null), 15, null), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer4, ((i6 >> 9) & 14) | 24576, 0, 8168);
                composerStartRestartGroup = composer4;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.strategy.CryptoTaxLotStrategySelectionBottomSheetComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTaxLotStrategySelectionBottomSheetComposable3.CryptoTaxLotStrategySelectionBottomSheetComposable$lambda$5(rhModalBottomSheet5, onStrategyTapped, immutableList, onContinue, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9361) == 9360) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default2, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion5.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                int i62 = i3;
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_strategy_selection_bottom_sheet_title, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, 48, 0, 8120);
                Composer composer22 = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme3.getSpacing(composer22, i52).m21592getMediumD9Ej5fM()), composer22, 0);
                if (immutableList != null) {
                    if (immutableList != null || immutableList.isEmpty()) {
                    }
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i82 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, bentoTheme22.getSpacing(composer22, i82).m21592getMediumD9Ej5fM()), composer22, 0);
                    Composer composer42 = composer22;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_strategy_selection_bottom_sheet_footer, composer22, 0), SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), Color.m6701boximpl(bentoTheme22.getColors(composer22, i82).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer22, i82).getTextS(), composer42, 48, 0, 8120);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, bentoTheme22.getSpacing(composer42, i82).m21592getMediumD9Ej5fM()), composer42, 0);
                    BentoButtonKt.m20586BentoButtonEikTQX8(onContinue, StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_strategy_selection_bottom_sheet_cta, composer42, 0), ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer42.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, "tax_lot_strategy", null, 4, null), null, null, null, null, 30, null), 15, null), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer42, ((i62 >> 9) & 14) | 24576, 0, 8168);
                    composerStartRestartGroup = composer42;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTaxLotStrategySelectionBottomSheetComposable$lambda$4$lambda$3$lambda$2$lambda$1 */
    public static final Unit m2933x8aac544d(Function1 function1, TaxLotStrategyTypeDto taxLotStrategyTypeDto) {
        function1.invoke(taxLotStrategyTypeDto);
        return Unit.INSTANCE;
    }
}
