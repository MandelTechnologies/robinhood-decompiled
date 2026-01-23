package com.robinhood.android.search.highlights.p249ui;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
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
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import search_coprocessor.p542v1.SectionTitleDto;

/* compiled from: SearchHighlightsTitle.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0001¢\u0006\u0002\u0010\b\"\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u0001X\u008a\u008e\u0002"}, m3636d2 = {"hasInfoIcon", "", "Lsearch_coprocessor/v1/SectionTitleDto;", "getHasInfoIcon", "(Lsearch_coprocessor/v1/SectionTitleDto;)Z", "SearchHighlightsTitle", "", "sectionTitle", "(Lsearch_coprocessor/v1/SectionTitleDto;Landroidx/compose/runtime/Composer;I)V", "lib-search-highlights_externalDebug", "showAlert"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.SearchHighlightsTitleKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightsTitle {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightsTitle$lambda$12(SectionTitleDto sectionTitleDto, int i, Composer composer, int i2) {
        SearchHighlightsTitle(sectionTitleDto, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final boolean getHasInfoIcon(SectionTitleDto sectionTitleDto) {
        return Intrinsics.areEqual(sectionTitleDto != null ? sectionTitleDto.getAccessory_icon() : null, ServerToBentoAssetMapper2.INFO_16.getServerValue());
    }

    public static final void SearchHighlightsTitle(final SectionTitleDto sectionTitle, Composer composer, final int i) {
        int i2;
        Tuples2 tuples2M3642to;
        Object obj;
        final SnapshotState snapshotState;
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Composer composerStartRestartGroup = composer.startRestartGroup(1742317891);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(sectionTitle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1742317891, i2, -1, "com.robinhood.android.search.highlights.ui.SearchHighlightsTitle (SearchHighlightsTitle.kt:41)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean hasInfoIcon = getHasInfoIcon(sectionTitle);
            String accessory_icon = sectionTitle.getAccessory_icon();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            TextStyle textL = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextL();
            FontWeight.Companion companion2 = FontWeight.INSTANCE;
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textL, 0L, 0L, companion2.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
            if (hasInfoIcon) {
                composerStartRestartGroup.startReplaceGroup(712957118);
                tuples2M3642to = Tuples4.m3642to(Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), C2002Dp.m7993boximpl(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(713027581);
                tuples2M3642to = Tuples4.m3642to(Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21427getFg30d7_KjU()), C2002Dp.m7993boximpl(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM()));
                composerStartRestartGroup.endReplaceGroup();
            }
            Tuples2 tuples2 = tuples2M3642to;
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(12), 7, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion4.getCenterVertically();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(sectionTitle) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                snapshotState = snapshotState2;
                obj = new Function0() { // from class: com.robinhood.android.search.highlights.ui.SearchHighlightsTitleKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchHighlightsTitle.SearchHighlightsTitle$lambda$7$lambda$5$lambda$4(current, sectionTitle, snapshotState, navigator, context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue2;
                snapshotState = snapshotState2;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, (Function0) obj, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(sectionTitle.getText(), null, null, null, companion2.getBold(), null, null, 0, false, 0, 0, null, 0, textStyleM7655copyp1EtxEg$default, composerStartRestartGroup, 24576, 0, 8174);
            composerStartRestartGroup = composerStartRestartGroup;
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(accessory_icon);
            composerStartRestartGroup.startReplaceGroup(1404079592);
            if (serverToBentoAssetMapper2FromServerValue != null) {
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, ((C2002Dp) tuples2.getSecond()).getValue()), composerStartRestartGroup, 0);
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2FromServerValue), null, ((Color) tuples2.getFirst()).getValue(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (SearchHighlightsTitle$lambda$1(snapshotState)) {
                String disclosure_title = sectionTitle.getDisclosure_title();
                String str = disclosure_title == null ? "" : disclosure_title;
                String disclosure_message = sectionTitle.getDisclosure_message();
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(disclosure_message != null ? disclosure_message : "");
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_okay, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.search.highlights.ui.SearchHighlightsTitleKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchHighlightsTitle.SearchHighlightsTitle$lambda$9$lambda$8(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource, (Function0) objRememberedValue3);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.search.highlights.ui.SearchHighlightsTitleKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchHighlightsTitle.SearchHighlightsTitle$lambda$11$lambda$10(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertDialog.BentoAlertDialog(str, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue4, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.SearchHighlightsTitleKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SearchHighlightsTitle.SearchHighlightsTitle$lambda$12(sectionTitle, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final void SearchHighlightsTitle$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightsTitle$lambda$7$lambda$5$lambda$4(EventLogger eventLogger, SectionTitleDto sectionTitleDto, SnapshotState snapshotState, Navigator navigator, Context context) {
        String disclosure_message;
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), new Component(null, "RD_SEARCH_HEADER_" + sectionTitleDto.getId(), null, 5, null), null, null, false, 57, null);
        String disclosure_title = sectionTitleDto.getDisclosure_title();
        if (disclosure_title != null && disclosure_title.length() != 0 && (disclosure_message = sectionTitleDto.getDisclosure_message()) != null && disclosure_message.length() != 0) {
            SearchHighlightsTitle$lambda$2(snapshotState, true);
        } else {
            String deeplink = sectionTitleDto.getDeeplink();
            if (deeplink != null) {
                Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(deeplink), null, null, false, null, 60, null);
            }
        }
        return Unit.INSTANCE;
    }

    private static final boolean SearchHighlightsTitle$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightsTitle$lambda$9$lambda$8(SnapshotState snapshotState) {
        SearchHighlightsTitle$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightsTitle$lambda$11$lambda$10(SnapshotState snapshotState) {
        SearchHighlightsTitle$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }
}
