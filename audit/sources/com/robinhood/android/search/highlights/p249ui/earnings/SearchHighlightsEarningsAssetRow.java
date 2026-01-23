package com.robinhood.android.search.highlights.p249ui.earnings;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.highlights.p249ui.market.SearchHighlightMarketPerformance;
import com.robinhood.android.search.highlights.util.SearchHighlightNavigation;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;

/* compiled from: SearchHighlightsEarningsAssetRow.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightEarningsItem;", "earningsItem", "", "accountNumber", "Landroidx/compose/ui/Modifier;", "modifier", "", "SearchHighlightsEarningsAssetRow", "(Lj$/time/Clock;Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightEarningsItem;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningsAssetRowKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightsEarningsAssetRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightsEarningsAssetRow$lambda$9(Clock clock, SearchHighlightEarningsItem searchHighlightEarningsItem, String str, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        SearchHighlightsEarningsAssetRow(clock, searchHighlightEarningsItem, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchHighlightsEarningsAssetRow(Clock clock, SearchHighlightEarningsItem searchHighlightEarningsItem, final String str, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        final Navigator navigator;
        final Context context;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        String displayName;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        Composer composer2;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        StringResource earningsEpsStatusOrNull;
        Clock clock2;
        boolean zChanged2;
        Object objRememberedValue3;
        StringResource actualEpsOrNull;
        StringResource stringResource;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final SearchHighlightEarningsItem earningsItem = searchHighlightEarningsItem;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(earningsItem, "earningsItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(1704919656);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(clock) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(earningsItem) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1704919656, i3, -1, "com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningsAssetRow (SearchHighlightsEarningsAssetRow.kt:37)");
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                UUID id = earningsItem.getAssetQuote().getId();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(id);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), null, null, new Component(null, "RD_SEARCH_EARNINGS_" + earningsItem.getAssetQuote().getId(), null, 5, null), null, 45, null);
                    composerStartRestartGroup.updateRememberedValue(userInteractionEventDescriptor);
                    objRememberedValue = userInteractionEventDescriptor;
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(earningsItem);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningsAssetRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchHighlightsEarningsAssetRow.SearchHighlightsEarningsAssetRow$lambda$2$lambda$1(navigator, context, earningsItem, str);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier2;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, (Function0) objRememberedValue2, 7, null), userInteractionEventDescriptor2, true, false, false, true, false, null, 108, null), 0.0f, composerStartRestartGroup, 0, 1);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 54);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                displayName = earningsItem.getAssetQuote().getDisplayName();
                if (displayName == null) {
                    displayName = "——";
                }
                BentoText2.m20747BentoText38GnDrw(displayName, null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composerStartRestartGroup, 817889280, 0, 15742);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(6)), companion.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(searchHighlightEarningsItem.getAssetQuote().getSymbol(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                composer2 = composerStartRestartGroup;
                SearchHighlightMarketPerformance.SearchHighlightDelta(searchHighlightEarningsItem.getAssetQuote(), null, null, composer2, 0, 6);
                composer2.endNode();
                composer2.endNode();
                Spacer2.Spacer(SizeKt.m5176widthInVpY3zN4$default(companion3, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer2, 0);
                Modifier modifierWeight$default2 = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getEnd(), composer2, 54);
                currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default2);
                Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor5);
                }
                composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash5 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
                earningsEpsStatusOrNull = UtilsKt.getEarningsEpsStatusOrNull(searchHighlightEarningsItem.getEps());
                composer2.startReplaceGroup(1631106678);
                if (earningsEpsStatusOrNull != null) {
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getText(earningsEpsStatusOrNull, composer2, StringResource.$stable).toString(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i5).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 0, 0, 8188);
                    composer2 = composer2;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM()), composer2, 0);
                }
                composer2.endReplaceGroup();
                Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                composer2.startReplaceGroup(-1746271574);
                earningsItem = searchHighlightEarningsItem;
                clock2 = clock;
                zChanged2 = composer2.changed(earningsItem) | composer2.changed(clock2) | composer2.changed(resources);
                objRememberedValue3 = composer2.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    actualEpsOrNull = UtilsKt.getActualEpsOrNull(earningsItem.getEps());
                    if (actualEpsOrNull != null) {
                        Intrinsics.checkNotNull(resources);
                        objRememberedValue3 = UtilsKt.getDisplayDateOfEarnings(resources, clock2, earningsItem.getCall(), earningsItem.getReport());
                    } else {
                        objRememberedValue3 = actualEpsOrNull;
                    }
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                stringResource = (StringResource) objRememberedValue3;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1631137180);
                if (stringResource != null) {
                    Composer composer4 = composer2;
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getText(stringResource, composer2, StringResource.$stable).toString(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer4, 0, 0, 8186);
                    composer2 = composer4;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endNode();
                composer3 = composer2;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i5).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 5);
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                clock2 = clock;
                composer3 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Clock clock3 = clock2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningsAssetRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SearchHighlightsEarningsAssetRow.SearchHighlightsEarningsAssetRow$lambda$9(clock3, earningsItem, str, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            UUID id2 = earningsItem.getAssetQuote().getId();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(id2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                UserInteractionEventDescriptor userInteractionEventDescriptor3 = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), null, null, new Component(null, "RD_SEARCH_EARNINGS_" + earningsItem.getAssetQuote().getId(), null, 5, null), null, 45, null);
                composerStartRestartGroup.updateRememberedValue(userInteractionEventDescriptor3);
                objRememberedValue = userInteractionEventDescriptor3;
                UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(earningsItem);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningsAssetRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchHighlightsEarningsAssetRow.SearchHighlightsEarningsAssetRow$lambda$2$lambda$1(navigator, context, earningsItem, str);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier42 = modifier2;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, (Function0) objRememberedValue2, 7, null), userInteractionEventDescriptor22, true, false, false, true, false, null, 108, null), 0.0f, composerStartRestartGroup, 0, 1);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap6, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier6, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            Modifier modifierWeight$default3 = Row5.weight$default(row62, companion32, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 54);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default3);
                            Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting()) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                                displayName = earningsItem.getAssetQuote().getDisplayName();
                                if (displayName == null) {
                                }
                                BentoText2.m20747BentoText38GnDrw(displayName, null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composerStartRestartGroup, 817889280, 0, 15742);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(6)), companion4.getCenterVertically(), composerStartRestartGroup, 54);
                                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                                Function0<ComposeUiNode> constructor42 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash4 = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl4.getInserting()) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion22.getSetModifier());
                                    BentoText2.m20747BentoText38GnDrw(searchHighlightEarningsItem.getAssetQuote().getSymbol(), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                                    composer2 = composerStartRestartGroup;
                                    SearchHighlightMarketPerformance.SearchHighlightDelta(searchHighlightEarningsItem.getAssetQuote(), null, null, composer2, 0, 6);
                                    composer2.endNode();
                                    composer2.endNode();
                                    Spacer2.Spacer(SizeKt.m5176widthInVpY3zN4$default(companion32, bentoTheme2.getSpacing(composer2, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer2, 0);
                                    Modifier modifierWeight$default22 = Row5.weight$default(row62, companion32, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getEnd(), composer2, 54);
                                    currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap52 = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default22);
                                    Function0<ComposeUiNode> constructor52 = companion22.getConstructor();
                                    if (composer2.getApplier() == null) {
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                    }
                                    composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy32, companion22.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion22.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash5 = companion22.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl5.getInserting()) {
                                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                        Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion22.getSetModifier());
                                        earningsEpsStatusOrNull = UtilsKt.getEarningsEpsStatusOrNull(searchHighlightEarningsItem.getEps());
                                        composer2.startReplaceGroup(1631106678);
                                        if (earningsEpsStatusOrNull != null) {
                                        }
                                        composer2.endReplaceGroup();
                                        Resources resources2 = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                        composer2.startReplaceGroup(-1746271574);
                                        earningsItem = searchHighlightEarningsItem;
                                        clock2 = clock;
                                        zChanged2 = composer2.changed(earningsItem) | composer2.changed(clock2) | composer2.changed(resources2);
                                        objRememberedValue3 = composer2.rememberedValue();
                                        if (!zChanged2) {
                                            actualEpsOrNull = UtilsKt.getActualEpsOrNull(earningsItem.getEps());
                                            if (actualEpsOrNull != null) {
                                            }
                                            composer2.updateRememberedValue(objRememberedValue3);
                                            stringResource = (StringResource) objRememberedValue3;
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(1631137180);
                                            if (stringResource != null) {
                                            }
                                            composer2.endReplaceGroup();
                                            composer2.endNode();
                                            composer2.endNode();
                                            composer3 = composer2;
                                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composer2, i52).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 5);
                                            composer3.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            modifier3 = modifier42;
                                        }
                                    }
                                }
                            }
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
    public static final Unit SearchHighlightsEarningsAssetRow$lambda$2$lambda$1(Navigator navigator, Context context, SearchHighlightEarningsItem searchHighlightEarningsItem, String str) {
        SearchHighlightNavigation.navigateToDetailPage(navigator, context, searchHighlightEarningsItem.getAssetQuote(), str);
        return Unit.INSTANCE;
    }
}
