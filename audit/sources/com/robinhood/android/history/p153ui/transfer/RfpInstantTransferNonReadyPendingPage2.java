package com.robinhood.android.history.p153ui.transfer;

import android.text.SpannedString;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout8;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RfpInstantTransferNonReadyPendingPage.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"RfpInstantTransferNonReadyPendingPage", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/history/ui/transfer/RfpInstantTransferNonReadyPendingPageData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/history/ui/transfer/RfpInstantTransferNonReadyPendingPageData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.history.ui.transfer.RfpInstantTransferNonReadyPendingPageKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class RfpInstantTransferNonReadyPendingPage2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RfpInstantTransferNonReadyPendingPage$lambda$2(RfpInstantTransferNonReadyPendingPageData rfpInstantTransferNonReadyPendingPageData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RfpInstantTransferNonReadyPendingPage(rfpInstantTransferNonReadyPendingPageData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RfpInstantTransferNonReadyPendingPage(final RfpInstantTransferNonReadyPendingPageData data, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(489857310);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(489857310, i3, -1, "com.robinhood.android.history.ui.transfer.RfpInstantTransferNonReadyPendingPage (RfpInstantTransferNonReadyPendingPage.kt:49)");
                }
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(data);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.history.ui.transfer.RfpInstantTransferNonReadyPendingPageKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RfpInstantTransferNonReadyPendingPage2.RfpInstantTransferNonReadyPendingPage$lambda$1$lambda$0(data, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                LazyDslKt.LazyColumn(modifierFillMaxHeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.history.ui.transfer.RfpInstantTransferNonReadyPendingPageKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RfpInstantTransferNonReadyPendingPage2.RfpInstantTransferNonReadyPendingPage$lambda$2(data, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(data);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.history.ui.transfer.RfpInstantTransferNonReadyPendingPageKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RfpInstantTransferNonReadyPendingPage2.RfpInstantTransferNonReadyPendingPage$lambda$1$lambda$0(data, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                LazyDslKt.LazyColumn(modifierFillMaxHeight$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RfpInstantTransferNonReadyPendingPage$lambda$1$lambda$0(final RfpInstantTransferNonReadyPendingPageData rfpInstantTransferNonReadyPendingPageData, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1941676531, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.RfpInstantTransferNonReadyPendingPageKt$RfpInstantTransferNonReadyPendingPage$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                int i2;
                float f;
                int i3;
                BentoTheme bentoTheme;
                int i4;
                Modifier.Companion companion;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1941676531, i, -1, "com.robinhood.android.history.ui.transfer.RfpInstantTransferNonReadyPendingPage.<anonymous>.<anonymous>.<anonymous> (RfpInstantTransferNonReadyPendingPage.kt:56)");
                }
                String amountText = rfpInstantTransferNonReadyPendingPageData.getAmountText();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                TextStyle displayCapsuleLarge = bentoTheme2.getTypography(composer, i5).getDisplayCapsuleLarge();
                long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer, i5).m21425getFg0d7_KjU();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(amountText, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme2.getSpacing(composer, i5).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 12, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(rfpInstantTransferNonReadyPendingPageData.getSubHeadingText(), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme2.getSpacing(composer, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, bentoTheme2.getSpacing(composer, i5).m21590getDefaultD9Ej5fM(), 6, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i5).getTextM(), composer, 0, 0, 8184);
                Composer composer2 = composer;
                BentoSettingsRowKt.BentoSettingsRow((Modifier) null, StringResources_androidKt.stringResource(C18359R.string.rfp_status_header, composer2, 0), rfpInstantTransferNonReadyPendingPageData.getStatusText(), (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer2, 1572864, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
                BentoSettingsRowKt.BentoSettingsRow((Modifier) null, StringResources_androidKt.stringResource(C18359R.string.rfp_from_header, composer2, 0), rfpInstantTransferNonReadyPendingPageData.getFromText(), (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer2, 1572864, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
                BentoSettingsRowKt.BentoSettingsRow((Modifier) null, StringResources_androidKt.stringResource(C18359R.string.rfp_to_header, composer2, 0), rfpInstantTransferNonReadyPendingPageData.getToText(), (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer2, 1572864, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
                Money requestedAmount = rfpInstantTransferNonReadyPendingPageData.getRequestedAmount();
                composer2.startReplaceGroup(1935383113);
                if (requestedAmount != null) {
                    BentoSettingsRowKt.BentoSettingsRow((Modifier) null, StringResources_androidKt.stringResource(C18359R.string.rfp_requested_amount_header, composer2, 0), Money.format$default(requestedAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null), (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer2, 1572864, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                BentoSettingsRowKt.BentoSettingsRow((Modifier) null, StringResources_androidKt.stringResource(C18359R.string.rfp_initiated_header, composer2, 0), rfpInstantTransferNonReadyPendingPageData.getInitiatedText(), (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer2, 1572864, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
                BentoSettingsRowKt.BentoSettingsRow((Modifier) null, StringResources_androidKt.stringResource(C18359R.string.rfp_last_updated_header, composer2, 0), rfpInstantTransferNonReadyPendingPageData.getLastUpdatedText(), (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer2, 1572864, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
                final GoldDepositBoostTransferDetail goldDepositBoost = rfpInstantTransferNonReadyPendingPageData.getGoldDepositBoost();
                composer2.startReplaceGroup(1935408070);
                if (goldDepositBoost == null) {
                    i2 = 6;
                    f = 0.0f;
                    i3 = 1;
                    bentoTheme = bentoTheme2;
                    i4 = i5;
                    companion = companion2;
                } else {
                    final String amountTitle = goldDepositBoost.getAmountTitle();
                    final String amountText2 = goldDepositBoost.getAmountText();
                    composer2.startReplaceGroup(1935413326);
                    if (amountTitle == null || amountText2 == null) {
                        i2 = 6;
                        f = 0.0f;
                        i3 = 1;
                        bentoTheme = bentoTheme2;
                        i4 = i5;
                        companion = companion2;
                    } else {
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM(), 1, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        companion = companion2;
                        BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(-1147880274, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.RfpInstantTransferNonReadyPendingPageKt$RfpInstantTransferNonReadyPendingPage$1$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1147880274, i6, -1, "com.robinhood.android.history.ui.transfer.RfpInstantTransferNonReadyPendingPage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RfpInstantTransferNonReadyPendingPage.kt:114)");
                                }
                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                TextStyle textS = bentoTheme3.getTypography(composer3, i7).getTextS();
                                long jM21426getFg20d7_KjU = bentoTheme3.getColors(composer3, i7).m21426getFg20d7_KjU();
                                BentoText2.m20747BentoText38GnDrw(amountTitle, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, textS, composer3, 817889280, 0, 7546);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), ComposableLambda3.rememberComposableLambda(-1581033779, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.RfpInstantTransferNonReadyPendingPageKt$RfpInstantTransferNonReadyPendingPage$1$1$1$2$1$2
                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1581033779, i6, -1, "com.robinhood.android.history.ui.transfer.RfpInstantTransferNonReadyPendingPage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RfpInstantTransferNonReadyPendingPage.kt:123)");
                                }
                                String str = amountText2;
                                GoldDepositBoostTransferDetail goldDepositBoostTransferDetail = goldDepositBoost;
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Companion companion6 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion6.getTop(), composer3, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion5);
                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion7.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                long jM21425getFg0d7_KjU2 = bentoTheme3.getColors(composer3, i7).m21425getFg0d7_KjU();
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, null, composer3, 817889280, 0, 15738);
                                ServerToBentoAssetMapper2 iconAsset = goldDepositBoostTransferDetail.getIconAsset();
                                composer3.startReplaceGroup(1883745004);
                                if (iconAsset != null) {
                                    IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(iconAsset.getResourceId(), composer3, 0), (String) null, row6.align(companion5, companion6.getCenterVertically()), bentoTheme3.getColors(composer3, i7).getSolLight(), composer3, 48, 0);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), null, null, false, true, false, null, composer, 113273856, 0, 1639);
                        composer2 = composer;
                        String detailText = goldDepositBoost.getDetailText();
                        composer2.startReplaceGroup(308455376);
                        if (detailText == null) {
                            bentoTheme = bentoTheme2;
                            i4 = i5;
                            f = 0.0f;
                            i3 = 1;
                            i2 = 6;
                        } else {
                            i4 = i5;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer2, i4).m21593getSmallD9Ej5fM()), composer2, 0);
                            i2 = 6;
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer2, 6, 1);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer2, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            bentoTheme = bentoTheme2;
                            f = 0.0f;
                            i3 = 1;
                            BentoMarkdownText2.BentoMarkdownText(detailText, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer2, i4).getTextS(), 0, bentoTheme2.getColors(composer2, i4).m21426getFg20d7_KjU(), 0L, false, composer2, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
                            composer2 = composer;
                            composer2.endNode();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                    }
                    composer2.endReplaceGroup();
                    Unit unit3 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                SpannedString disclosureText = rfpInstantTransferNonReadyPendingPageData.getDisclosureText();
                if (disclosureText != null) {
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, f, composer2, i2, i3);
                    BentoTheme bentoTheme3 = bentoTheme;
                    BentoSpannedText.m21106BentoSpannedTextTHkziT8(disclosureText, PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ2, 0.0f, bentoTheme3.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 5, null), null, null, 0, null, 0, 0, null, composer, 0, 508);
                    Unit unit4 = Unit.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }
}
