package com.robinhood.android.common.search;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.p320db.Position5;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InvestmentSearchLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a \u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0015\u001a\u00020\u0016\u001a-\u0010\u0017\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0019\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"CheckedMeta", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "getCheckedMeta", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "rowState", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "Lcom/robinhood/android/common/search/SearchItem;", "getRowState", "(Lcom/robinhood/android/common/search/SearchItem;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "SearchItemComposable", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onItemClicked", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/common/search/SearchItem;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "investmentSearchItems", "Landroidx/compose/foundation/lazy/LazyListScope;", "items", "", "callbacks", "Lcom/robinhood/android/common/search/InvestmentSearchCallbacks;", "InvestmentSearchLazyColumn", "Lkotlinx/collections/immutable/ImmutableList;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/common/search/InvestmentSearchCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-investment-search_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class InvestmentSearchLazyColumn2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentSearchLazyColumn$lambda$17(ImmutableList immutableList, InvestmentSearchLazyColumn investmentSearchLazyColumn, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestmentSearchLazyColumn(immutableList, investmentSearchLazyColumn, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchItemComposable$lambda$12(SearchItem searchItem, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        SearchItemComposable(searchItem, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final BentoBaseRowState.Meta getCheckedMeta() {
        return new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.BUBBLE_CHECKED_24, "selected", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null);
    }

    @JvmName
    public static final BentoBaseRowState getRowState(SearchItem searchItem, Composer composer, int i) throws Resources.NotFoundException {
        BentoBaseRowState bentoBaseRowState;
        BentoBaseRowState bentoBaseRowState2;
        String symbol;
        Intrinsics.checkNotNullParameter(searchItem, "<this>");
        composer.startReplaceGroup(98153300);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(98153300, i, -1, "com.robinhood.android.common.search.<get-rowState> (InvestmentSearchLazyColumn.kt:37)");
        }
        if (searchItem instanceof SearchItem.InstrumentResult) {
            composer.startReplaceGroup(-163956423);
            composer.endReplaceGroup();
            SearchItem.InstrumentResult instrumentResult = (SearchItem.InstrumentResult) searchItem;
            String simpleName = instrumentResult.getInstrument().getSimpleName();
            if (simpleName == null) {
                simpleName = instrumentResult.getInstrument().getName();
            }
            bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, simpleName, instrumentResult.getInstrument().getSymbol(), (String) null, instrumentResult.isChecked() ? getCheckedMeta() : null, (BentoBaseRowState.End) null, instrumentResult.isEnabled(), false, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, (DefaultConstructorMarker) null);
        } else {
            if (searchItem instanceof SearchItem.InstrumentPositionResult) {
                composer.startReplaceGroup(-163947044);
                SearchItem.InstrumentPositionResult instrumentPositionResult = (SearchItem.InstrumentPositionResult) searchItem;
                String simpleName2 = instrumentPositionResult.getInstrument().getSimpleName();
                if (simpleName2 == null) {
                    simpleName2 = instrumentPositionResult.getInstrument().getName();
                }
                String str = simpleName2;
                if (Position5.getHasPosition(instrumentPositionResult.getPosition())) {
                    symbol = StringResources_androidKt.stringResource(C11798R.string.search_instrument_position_secondary_text, new Object[]{instrumentPositionResult.getInstrument().getSymbol(), Formats.getLowPrecisionUnitFormat().format(Position5.getPositionDisplayQuantity(instrumentPositionResult.getPosition()))}, composer, 0);
                } else {
                    symbol = instrumentPositionResult.getInstrument().getSymbol();
                }
                bentoBaseRowState2 = new BentoBaseRowState((BentoBaseRowState.Start) null, str, symbol, (String) null, instrumentPositionResult.isChecked() ? getCheckedMeta() : null, (BentoBaseRowState.End) null, instrumentPositionResult.isEnabled(), false, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, (DefaultConstructorMarker) null);
                composer.endReplaceGroup();
            } else if (searchItem instanceof SearchItem.CryptoResult) {
                composer.startReplaceGroup(-786753272);
                composer.endReplaceGroup();
                SearchItem.CryptoResult cryptoResult = (SearchItem.CryptoResult) searchItem;
                bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, cryptoResult.getCurrency().getName(), cryptoResult.getCurrency().getCode(), (String) null, cryptoResult.isChecked() ? getCheckedMeta() : null, (BentoBaseRowState.End) null, cryptoResult.isEnabled(), false, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, (DefaultConstructorMarker) null);
            } else if (searchItem instanceof SearchItem.CryptoHoldingResult) {
                composer.startReplaceGroup(-163918536);
                SearchItem.CryptoHoldingResult cryptoHoldingResult = (SearchItem.CryptoHoldingResult) searchItem;
                bentoBaseRowState2 = new BentoBaseRowState((BentoBaseRowState.Start) null, cryptoHoldingResult.getCurrency().getName(), StringResources_androidKt.stringResource(C11798R.string.search_instrument_position_secondary_text, new Object[]{cryptoHoldingResult.getCurrency().getCode(), Formats.getLowPrecisionUnitFormat().format(cryptoHoldingResult.getQuantity())}, composer, 0), (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.f2779x59907a3d, (DefaultConstructorMarker) null);
                composer.endReplaceGroup();
            } else if (searchItem instanceof SearchItem.RurSavingsChoice) {
                composer.startReplaceGroup(-163907873);
                composer.endReplaceGroup();
                SearchItem.RurSavingsChoice rurSavingsChoice = (SearchItem.RurSavingsChoice) searchItem;
                bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.TextPog(((Object) rurSavingsChoice.getInterestRate()) + "%", null, null, null, 14, null), rurSavingsChoice.getPrimaryText().toString(), rurSavingsChoice.getSecondaryText().toString(), (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
            } else {
                if (!(searchItem instanceof SearchItem.Disclaimer) && !(searchItem instanceof SearchItem.SearchHeader) && !(searchItem instanceof SearchItem.SearchHeaderWithIcon) && !(searchItem instanceof SearchItem.SearchLearnMoreRow)) {
                    composer.startReplaceGroup(-163956436);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-163896116);
                composer.endReplaceGroup();
                throw new IllegalStateException(("Search item " + searchItem + " cannot resolve to a bento row").toString());
            }
            bentoBaseRowState = bentoBaseRowState2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchItemComposable(final SearchItem searchItem, final Function1<? super SearchItem, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int i4;
        boolean z;
        Object objRememberedValue;
        Modifier modifier4;
        final Modifier modifier5;
        Modifier modifier6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(954959429);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(searchItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(954959429, i3, -1, "com.robinhood.android.common.search.SearchItemComposable (InvestmentSearchLazyColumn.kt:95)");
                }
                if (!(searchItem instanceof SearchItem.InstrumentPositionResult) || (searchItem instanceof SearchItem.InstrumentResult) || (searchItem instanceof SearchItem.CryptoHoldingResult) || (searchItem instanceof SearchItem.CryptoResult) || (searchItem instanceof SearchItem.RurSavingsChoice)) {
                    int i6 = i3;
                    Modifier modifier7 = modifier3;
                    boolean z2 = true;
                    composerStartRestartGroup.startReplaceGroup(-666631429);
                    i4 = i6 & 14;
                    BentoBaseRowState rowState = getRowState(searchItem, composerStartRestartGroup, i4);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z3 = (i6 & 112) != 32;
                    if (i4 != 4) {
                        z2 = false;
                    }
                    z = z3 | z2;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InvestmentSearchLazyColumn2.SearchItemComposable$lambda$4$lambda$3(function1, searchItem);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifier7, rowState, false, false, false, 0L, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), composerStartRestartGroup, ((i6 >> 6) & 14) | (BentoBaseRowState.$stable << 3), 60);
                    modifier4 = modifier7;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else if (searchItem instanceof SearchItem.SearchHeader) {
                    composerStartRestartGroup.startReplaceGroup(-666359125);
                    String string2 = ((SearchItem.SearchHeader) searchItem).getHeaderText().toString();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                    modifier4 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(string2, PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM(), 5, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 24576, 0, 8168);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    Modifier modifier8 = modifier3;
                    if (searchItem instanceof SearchItem.SearchHeaderWithIcon) {
                        composerStartRestartGroup.startReplaceGroup(-665799947);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier8, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21595getXsmallD9Ej5fM(), 5, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        SearchItem.SearchHeaderWithIcon searchHeaderWithIcon = (SearchItem.SearchHeaderWithIcon) searchItem;
                        int i9 = i3;
                        boolean z4 = true;
                        modifier6 = modifier8;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(searchHeaderWithIcon.getHeaderTextRes(), composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i8).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i8).getTextS(), composerStartRestartGroup, 24576, 0, 8170);
                        composerStartRestartGroup = composerStartRestartGroup;
                        BentoIcon4.Size16 size16 = new BentoIcon4.Size16(searchHeaderWithIcon.getIconAsset());
                        String contentDescription = searchHeaderWithIcon.getContentDescription();
                        long jM21426getFg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i8).m21426getFg20d7_KjU();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean z5 = (i9 & 112) == 32;
                        if ((i9 & 14) != 4) {
                            z4 = false;
                        }
                        boolean z6 = z5 | z4;
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z6 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InvestmentSearchLazyColumn2.SearchItemComposable$lambda$7$lambda$6$lambda$5(function1, searchItem);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size16, contentDescription, jM21426getFg20d7_KjU, null, Haptics.hapticClick((Function0) objRememberedValue2, composerStartRestartGroup, 0), false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 40);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        int i10 = i3;
                        if (searchItem instanceof SearchItem.Disclaimer) {
                            composerStartRestartGroup.startReplaceGroup(-664724681);
                            SearchItem.Disclaimer disclaimer = (SearchItem.Disclaimer) searchItem;
                            String strStringResource = StringResources_androidKt.stringResource(disclaimer.getMessageRes(), composerStartRestartGroup, 0);
                            String strStringResource2 = StringResources_androidKt.stringResource(disclaimer.getButtonTextRes(), composerStartRestartGroup, 0);
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            long jM21426getFg20d7_KjU2 = bentoTheme3.getColors(composerStartRestartGroup, i11).m21426getFg20d7_KjU();
                            TextStyle textS = bentoTheme3.getTypography(composerStartRestartGroup, i11).getTextS();
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier8, bentoTheme3.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, (i10 >> 6) & 14, 0);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean z7 = ((i10 & 112) == 32) | ((i10 & 14) == 4);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z7 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InvestmentSearchLazyColumn2.SearchItemComposable$lambda$9$lambda$8(function1, searchItem);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            modifier4 = modifier8;
                            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, strStringResource2, (Function0) objRememberedValue3, modifierM21623defaultHorizontalPaddingrAjV9yQ2, jM21426getFg20d7_KjU2, 0L, textS, 0, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (!(searchItem instanceof SearchItem.SearchLearnMoreRow)) {
                                composerStartRestartGroup.startReplaceGroup(-1406982058);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-664197464);
                            SearchItem.SearchLearnMoreRow searchLearnMoreRow = (SearchItem.SearchLearnMoreRow) searchItem;
                            String string3 = searchLearnMoreRow.getLearnMoreStr().toString();
                            String learnMoreBtnStr = searchLearnMoreRow.getLearnMoreBtnStr();
                            BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                            int i12 = BentoTheme.$stable;
                            long jM21426getFg20d7_KjU3 = bentoTheme4.getColors(composerStartRestartGroup, i12).m21426getFg20d7_KjU();
                            TextStyle textS2 = bentoTheme4.getTypography(composerStartRestartGroup, i12).getTextS();
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier8, bentoTheme4.getSpacing(composerStartRestartGroup, i12).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, (i10 >> 6) & 14, 0);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean z8 = ((i10 & 112) == 32) | ((i10 & 14) == 4);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (z8 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InvestmentSearchLazyColumn2.SearchItemComposable$lambda$11$lambda$10(function1, searchItem);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            modifier6 = modifier8;
                            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(string3, learnMoreBtnStr, (Function0) objRememberedValue4, modifierM21623defaultHorizontalPaddingrAjV9yQ3, jM21426getFg20d7_KjU3, 0L, textS2, 0, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                    }
                    modifier4 = modifier6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestmentSearchLazyColumn2.SearchItemComposable$lambda$12(searchItem, function1, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (searchItem instanceof SearchItem.InstrumentPositionResult) {
                int i62 = i3;
                Modifier modifier72 = modifier3;
                boolean z22 = true;
                composerStartRestartGroup.startReplaceGroup(-666631429);
                i4 = i62 & 14;
                BentoBaseRowState rowState2 = getRowState(searchItem, composerStartRestartGroup, i4);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                if ((i62 & 112) != 32) {
                }
                if (i4 != 4) {
                }
                z = z3 | z22;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestmentSearchLazyColumn2.SearchItemComposable$lambda$4$lambda$3(function1, searchItem);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifier72, rowState2, false, false, false, 0L, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), composerStartRestartGroup, ((i62 >> 6) & 14) | (BentoBaseRowState.$stable << 3), 60);
                    modifier4 = modifier72;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier5 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchItemComposable$lambda$4$lambda$3(Function1 function1, SearchItem searchItem) {
        function1.invoke(searchItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchItemComposable$lambda$7$lambda$6$lambda$5(Function1 function1, SearchItem searchItem) {
        function1.invoke(searchItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchItemComposable$lambda$9$lambda$8(Function1 function1, SearchItem searchItem) {
        function1.invoke(searchItem);
        return Unit.INSTANCE;
    }

    public static final void investmentSearchItems(LazyListScope lazyListScope, final List<? extends SearchItem> items, final InvestmentSearchLazyColumn callbacks) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        final C11794xa2c3d442 c11794xa2c3d442 = new Function1() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$investmentSearchItems$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(SearchItem searchItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((SearchItem) obj);
            }
        };
        lazyListScope.items(items.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$investmentSearchItems$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c11794xa2c3d442.invoke(items.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$investmentSearchItems$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) throws Resources.NotFoundException {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) throws Resources.NotFoundException {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                SearchItem searchItem = (SearchItem) items.get(i);
                composer.startReplaceGroup(1987833119);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(callbacks);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InvestmentSearchLazyColumn3(callbacks);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                InvestmentSearchLazyColumn2.SearchItemComposable(searchItem, (Function1) ((KFunction) objRememberedValue), null, composer, 0, 4);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchItemComposable$lambda$11$lambda$10(Function1 function1, SearchItem searchItem) {
        function1.invoke(searchItem);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentSearchLazyColumn(final ImmutableList<? extends SearchItem> items, final InvestmentSearchLazyColumn callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1051215437);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(items) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1051215437, i3, -1, "com.robinhood.android.common.search.InvestmentSearchLazyColumn (InvestmentSearchLazyColumn.kt:209)");
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & 14) != 4) | ((i3 & 112) == 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestmentSearchLazyColumn2.InvestmentSearchLazyColumn$lambda$16$lambda$15(items, callbacks, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                LazyDslKt.LazyColumn(modifier5, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 14, 510);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestmentSearchLazyColumn2.InvestmentSearchLazyColumn$lambda$17(items, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            z = ((i3 & 14) != 4) | ((i3 & 112) == 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.search.InvestmentSearchLazyColumnKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestmentSearchLazyColumn2.InvestmentSearchLazyColumn$lambda$16$lambda$15(items, callbacks, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                LazyDslKt.LazyColumn(modifier52, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 14, 510);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentSearchLazyColumn$lambda$16$lambda$15(ImmutableList immutableList, InvestmentSearchLazyColumn investmentSearchLazyColumn, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        investmentSearchItems(LazyColumn, immutableList, investmentSearchLazyColumn);
        return Unit.INSTANCE;
    }
}
