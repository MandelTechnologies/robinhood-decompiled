package com.robinhood.android.event.history.p131ui.settlement;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.event.history.C16405R;
import com.robinhood.android.event.history.extensions.StringResources;
import com.robinhood.android.event.history.p131ui.settlement.EventCashSettlementDetailDuxo3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CashSettlementContent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"CashSettlementContent", "", "state", "Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState$Loaded;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-event-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.history.ui.settlement.CashSettlementContentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CashSettlementContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CashSettlementContent$lambda$5(EventCashSettlementDetailDuxo3.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CashSettlementContent(loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashSettlementContent(final EventCashSettlementDetailDuxo3.Loaded state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        StringResource pageSubtitle;
        int i4;
        Modifier.Companion companion;
        ?? r0;
        int i5;
        String eventName;
        ?? r14;
        StringResource realizedPnlLabel;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1510319253);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1510319253, i3, -1, "com.robinhood.android.event.history.ui.settlement.CashSettlementContent (CashSettlementContent.kt:26)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierVerticalScroll$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 7, null);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                StringResource pageTitle = state.getPageTitle();
                int i8 = StringResource.$stable;
                String text = StringResources.getText(pageTitle, composerStartRestartGroup, i8);
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(text, PaddingKt.m5145paddingqDBjuR0(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(0), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                composer2 = composerStartRestartGroup;
                pageSubtitle = state.getPageSubtitle();
                composer2.startReplaceGroup(-746688524);
                if (pageSubtitle != null) {
                    i4 = i7;
                    companion = companion4;
                    r0 = 0;
                    i5 = 2;
                } else {
                    i4 = i7;
                    companion = companion4;
                    r0 = 0;
                    i5 = 2;
                    BentoText2.m20747BentoText38GnDrw(StringResources.getText(pageSubtitle, composer2, i8), PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 0, 0, 8188);
                    composer2 = composer2;
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                eventName = state.getEventName();
                composer2.startReplaceGroup(-746679771);
                if (eventName != null) {
                    r14 = 0;
                } else {
                    r14 = 0;
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_payout_detail_event_name_label, composer2, 0), r0, i5, r0), null, null, null, new AnnotatedString(eventName, r0, i5, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, BentoDataRowState.$stable, 6);
                    Unit unit2 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_payout_detail_account_label, composer2, r14), r0, i5, r0), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_payout_detail_account_value, composer2, r14), r0, i5, r0), null, null, null, null, false, false, 4061, null);
                int i9 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composer2, i9, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_payout_detail_settlement_time_label, composer2, r14), r0, i5, r0), null, null, null, new AnnotatedString(state.getSettlementTime(), r0, i5, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i9, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_payout_detail_settlement_price_label, composer2, r14), r0, i5, r0), null, null, null, new AnnotatedString(state.getSettlementPrice(), r0, i5, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i9, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_payout_detail_quantity_label, composer2, r14), r0, i5, r0), null, null, null, new AnnotatedString(state.getQuantity(), r0, i5, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i9, 6);
                realizedPnlLabel = state.getRealizedPnlLabel();
                composer2.startReplaceGroup(-746635546);
                if (realizedPnlLabel != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources.getText(realizedPnlLabel, composer2, i8), r0, i5, r0), null, null, null, new AnnotatedString(state.getRealizedPnlValue(), r0, i5, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i9, 6);
                    Unit unit3 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                int i10 = i4;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i10).m21592getMediumD9Ej5fM(), 0.0f, i5, r0);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), r14);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, r14);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Composer composer3 = composer2;
                BentoMarkdownText2.BentoMarkdownText(StringResources_androidKt.stringResource(C16405R.string.gated_options_event_history_disclaimer_markdown, composer2, r14), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i10).getTextS(), 0, bentoTheme.getColors(composer2, i10).m21426getFg20d7_KjU(), 0L, false, composer3, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.history.ui.settlement.CashSettlementContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CashSettlementContent.CashSettlementContent$lambda$5(state, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierVerticalScroll$default2, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 7, null);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                StringResource pageTitle2 = state.getPageTitle();
                int i82 = StringResource.$stable;
                String text2 = StringResources.getText(pageTitle2, composerStartRestartGroup, i82);
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleMedium();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(text2, PaddingKt.m5145paddingqDBjuR0(companion42, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(0), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21595getXsmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8188);
                composer2 = composerStartRestartGroup;
                pageSubtitle = state.getPageSubtitle();
                composer2.startReplaceGroup(-746688524);
                if (pageSubtitle != null) {
                }
                composer2.endReplaceGroup();
                eventName = state.getEventName();
                composer2.startReplaceGroup(-746679771);
                if (eventName != null) {
                }
                composer2.endReplaceGroup();
                BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_payout_detail_account_label, composer2, r14), r0, i5, r0), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_payout_detail_account_value, composer2, r14), r0, i5, r0), null, null, null, null, false, false, 4061, null);
                int i92 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState2, null, null, composer2, i92, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_payout_detail_settlement_time_label, composer2, r14), r0, i5, r0), null, null, null, new AnnotatedString(state.getSettlementTime(), r0, i5, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i92, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_payout_detail_settlement_price_label, composer2, r14), r0, i5, r0), null, null, null, new AnnotatedString(state.getSettlementPrice(), r0, i5, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i92, 6);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16405R.string.event_payout_detail_quantity_label, composer2, r14), r0, i5, r0), null, null, null, new AnnotatedString(state.getQuantity(), r0, i5, r0), null, null, null, null, false, false, 4061, null), null, null, composer2, i92, 6);
                realizedPnlLabel = state.getRealizedPnlLabel();
                composer2.startReplaceGroup(-746635546);
                if (realizedPnlLabel != null) {
                }
                composer2.endReplaceGroup();
                int i102 = i4;
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer2, i102).m21592getMediumD9Ej5fM(), 0.0f, i5, r0);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), r14);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, r14);
                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Composer composer32 = composer2;
                    BentoMarkdownText2.BentoMarkdownText(StringResources_androidKt.stringResource(C16405R.string.gated_options_event_history_disclaimer_markdown, composer2, r14), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer2, i102).getTextS(), 0, bentoTheme2.getColors(composer2, i102).m21426getFg20d7_KjU(), 0L, false, composer32, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer32, MarkdownStyle.$stable << 6, 26);
                    composerStartRestartGroup = composer32;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
