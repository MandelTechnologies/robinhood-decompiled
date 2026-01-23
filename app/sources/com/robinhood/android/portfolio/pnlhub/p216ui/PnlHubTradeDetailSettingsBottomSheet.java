package com.robinhood.android.portfolio.pnlhub.p216ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.portfolio.pnlhub.PnlHubDataState4;
import com.robinhood.android.portfolio.pnlhub.PnlHubTradeDetailSettings;
import com.robinhood.android.portfolio.pnlhub.PnlHubViewState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PositionsSortOptionsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PnlHubTradeDetailSettingsBottomSheet.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u0012\u0010\r\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002\u001a\u0012\u0010\u000f\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002\u001a\u001a\u0010\u0010\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"SETTINGS_GROUP_BY_BOTTOM_SHEET", "", "SETTINGS_SORT_ROW_BOTTOM_SHEET", "PnlHubTradeDetailSettingsBottomSheet", "", "viewState", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState$Ready;", "onTradeDetailSettingsSave", "Lkotlin/Function1;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;", "onTradeDetailSettingsBannerDismiss", "Lkotlin/Function0;", "(Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState$Ready;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "dismissBanner", "Landroidx/compose/runtime/MutableState;", "groupBySymbol", "sortBy", "sortKey", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSortSettings;", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheetKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubTradeDetailSettingsBottomSheet {
    public static final String SETTINGS_GROUP_BY_BOTTOM_SHEET = "group_by_symbol_toggle";
    public static final String SETTINGS_SORT_ROW_BOTTOM_SHEET = "%s_sort_row";

    /* compiled from: PnlHubTradeDetailSettingsBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheetKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PnlHubDataState4.values().length];
            try {
                iArr[PnlHubDataState4.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubTradeDetailSettingsBottomSheet$lambda$12(PnlHubViewState.Ready ready, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        PnlHubTradeDetailSettingsBottomSheet(ready, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PnlHubTradeDetailSettingsBottomSheet(final PnlHubViewState.Ready viewState, Function1<? super PnlHubTradeDetailSettings, Unit> onTradeDetailSettingsSave, final Function0<Unit> onTradeDetailSettingsBannerDismiss, Composer composer, final int i) {
        int i2;
        final SnapshotState snapshotState;
        final Function1<? super PnlHubTradeDetailSettings, Unit> function1;
        final SnapshotState snapshotState2;
        final PnlHubDataState4 pnlHubDataState4;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        final Resources resources;
        EventLogger eventLogger;
        final SnapshotState snapshotState3;
        long jM21373getBg30d7_KjU;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onTradeDetailSettingsSave, "onTradeDetailSettingsSave");
        Intrinsics.checkNotNullParameter(onTradeDetailSettingsBannerDismiss, "onTradeDetailSettingsBannerDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(626271865);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTradeDetailSettingsSave) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTradeDetailSettingsBannerDismiss) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function1 = onTradeDetailSettingsSave;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626271865, i2, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheet (PnlHubTradeDetailSettingsBottomSheet.kt:47)");
            }
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(viewState.getTradeDetailSettings(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState4 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 5, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion3.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            SnapshotState snapshotState5 = snapshotState4;
            EventLogger eventLogger2 = current;
            int i4 = i2;
            UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25819R.string.pnl_hub_trade_detail_settings_title, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-103911961);
            if (((PnlHubTradeDetailSettings) snapshotState5.getValue()).getShowBanner()) {
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 2, null);
                String strStringResource = StringResources_androidKt.stringResource(viewState.getPnlUpdatesEnabled() ? (viewState.isCryptoPnlHubEnabled() && viewState.getOptionsSupported()) ? C25819R.string.f4845x6829f64b : (!viewState.isCryptoPnlHubEnabled() || viewState.getOptionsSupported()) ? C25819R.string.closed_pnl_hub_trade_detail_settings_banner : C25819R.string.gated_crypto_closed_pnl_hub_trade_detail_settings_banner_crypto : (viewState.isCryptoPnlHubEnabled() && viewState.getOptionsSupported()) ? C25819R.string.f4847x3e1f11a0 : (!viewState.isCryptoPnlHubEnabled() || viewState.getOptionsSupported()) ? C25819R.string.pnl_hub_trade_detail_settings_banner : C25819R.string.gated_crypto_pnl_hub_trade_detail_settings_banner_crypto, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z = (i4 & 896) == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue2 == companion.getEmpty()) {
                    snapshotState3 = snapshotState5;
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PnlHubTradeDetailSettingsBottomSheet.PnlHubTradeDetailSettingsBottomSheet$lambda$11$lambda$3$lambda$2(onTradeDetailSettingsBannerDismiss, snapshotState3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    snapshotState3 = snapshotState5;
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
                if (bentoTheme.getColors(composerStartRestartGroup, i3).getIsDay()) {
                    composerStartRestartGroup.startReplaceGroup(1075672354);
                    jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1075738818);
                    jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                snapshotState5 = snapshotState3;
                i4 = i4;
                BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierM5146paddingqDBjuR0$default2, strStringResource, null, null, null, function0, jM21425getFg0d7_KjU, jM21373getBg30d7_KjU, composerStartRestartGroup, 3072, 20);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25819R.string.pnl_hub_trade_detail_settings_sort_title, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 6, null), null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0, 0, 8188);
            Composer composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(-103827723);
            Iterator<PnlHubDataState4> it = PnlHubDataState4.getEntries().iterator();
            while (it.hasNext()) {
                final PnlHubDataState4 next = it.next();
                Modifier.Companion companion5 = Modifier.INSTANCE;
                String str = String.format(SETTINGS_SORT_ROW_BOTTOM_SHEET, Arrays.copyOf(new Object[]{next.name()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                Modifier modifierTestTag = TestTag3.testTag(companion5, str);
                boolean z2 = (((PnlHubTradeDetailSettings) snapshotState5.getValue()).getGroupBySymbol() && next == PnlHubDataState4.DATE) ? false : true;
                composer2.startReplaceGroup(-1224400529);
                final UserInteractionEventDescriptor userInteractionEventDescriptor4 = userInteractionEventDescriptor3;
                final EventLogger eventLogger3 = eventLogger2;
                boolean zChanged = composer2.changed(next.ordinal()) | composer2.changedInstance(userInteractionEventDescriptor4) | composer2.changedInstance(resources2) | composer2.changedInstance(eventLogger3);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    final Resources resources3 = resources2;
                    final SnapshotState snapshotState6 = snapshotState5;
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PnlHubTradeDetailSettingsBottomSheet.m2381xee9dcc20(snapshotState6, next, userInteractionEventDescriptor4, resources3, eventLogger3);
                        }
                    };
                    snapshotState2 = snapshotState6;
                    pnlHubDataState4 = next;
                    userInteractionEventDescriptor = userInteractionEventDescriptor4;
                    resources = resources3;
                    eventLogger = eventLogger3;
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    userInteractionEventDescriptor = userInteractionEventDescriptor4;
                    snapshotState2 = snapshotState5;
                    pnlHubDataState4 = next;
                    resources = resources2;
                    eventLogger = eventLogger3;
                }
                composer2.endReplaceGroup();
                snapshotState5 = snapshotState2;
                Composer composer3 = composer2;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifierTestTag, z2, null, null, (Function0) objRememberedValue3, 6, null), null, null, ComposableLambda3.rememberComposableLambda(92861646, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheetKt$PnlHubTradeDetailSettingsBottomSheet$1$3$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i5) {
                        long jM21425getFg0d7_KjU2;
                        if ((i5 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(92861646, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheet.<anonymous>.<anonymous>.<anonymous> (PnlHubTradeDetailSettingsBottomSheet.kt:152)");
                        }
                        StringResource sortName = pnlHubDataState4.getSortName();
                        Resources resources4 = resources;
                        Intrinsics.checkNotNull(resources4);
                        String string2 = sortName.getText(resources4).toString();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        TextStyle textM = bentoTheme2.getTypography(composer4, i6).getTextM();
                        if (snapshotState2.getValue().getGroupBySymbol() && pnlHubDataState4 == PnlHubDataState4.DATE) {
                            composer4.startReplaceGroup(482698023);
                            jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer4, i6).m21427getFg30d7_KjU();
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(482780328);
                            jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer4, i6).m21425getFg0d7_KjU();
                            composer4.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer4, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, null, ComposableLambda3.rememberComposableLambda(1126551723, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheetKt$PnlHubTradeDetailSettingsBottomSheet$1$3$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i5) {
                        if ((i5 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1126551723, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheet.<anonymous>.<anonymous>.<anonymous> (PnlHubTradeDetailSettingsBottomSheet.kt:165)");
                        }
                        if (snapshotState2.getValue().getCurrentSortKey() == pnlHubDataState4) {
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(snapshotState2.getValue().getDirection() == PositionsSortOptionsContext.SortDirection.ASC ? ServerToBentoAssetMapper2.ARROW_UP_16 : ServerToBentoAssetMapper2.ARROW_DOWN_16), "", BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer4, BentoIcon4.Size16.$stable | 48, 56);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), false, false, false, null, composer3, 1575936, 0, 1974);
                it = it;
                userInteractionEventDescriptor3 = userInteractionEventDescriptor;
                eventLogger2 = eventLogger;
                composer2 = composer3;
                resources2 = resources;
            }
            final EventLogger eventLogger4 = eventLogger2;
            final UserInteractionEventDescriptor userInteractionEventDescriptor5 = userInteractionEventDescriptor3;
            composer2.endReplaceGroup();
            Modifier.Companion companion6 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Composer composer4 = composer2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25819R.string.pnl_hub_trade_detail_settings_group_title, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(companion6, bentoTheme2.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i5).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), 4, null), null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer2, i5).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 8188);
            Modifier modifierTestTag2 = TestTag3.testTag(companion6, SETTINGS_GROUP_BY_BOTTOM_SHEET);
            BentoToggleRowState bentoToggleRowState = new BentoToggleRowState(null, StringResources_androidKt.stringResource(C25819R.string.pnl_hub_trade_detail_sort_key_symbol, composer4, 0), null, false, ((PnlHubTradeDetailSettings) snapshotState5.getValue()).getGroupBySymbol(), null, null, false, false, false, ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, null);
            composer4.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer4.changedInstance(userInteractionEventDescriptor5) | composer4.changedInstance(eventLogger4);
            Object objRememberedValue4 = composer4.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                snapshotState = snapshotState5;
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PnlHubTradeDetailSettingsBottomSheet.PnlHubTradeDetailSettingsBottomSheet$lambda$11$lambda$8$lambda$7(snapshotState, userInteractionEventDescriptor5, eventLogger4, ((Boolean) obj).booleanValue());
                    }
                };
                composer4.updateRememberedValue(objRememberedValue4);
            } else {
                snapshotState = snapshotState5;
            }
            composer4.endReplaceGroup();
            BentoToggleRow3.BentoToggleRow(bentoToggleRowState, (Function1) objRememberedValue4, modifierTestTag2, composer4, BentoToggleRowState.$stable | 384, 0);
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), bentoTheme2.getSpacing(composer4, i5).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer4, i5).m21590getDefaultD9Ej5fM());
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer4, i5).m21425getFg0d7_KjU();
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer4, 0);
            composer4.startReplaceGroup(-1633490746);
            boolean z3 = (i4 & 112) == 32;
            Object objRememberedValue5 = composer4.rememberedValue();
            if (z3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                function1 = onTradeDetailSettingsSave;
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PnlHubTradeDetailSettingsBottomSheet.m2380xa479006c(function1, snapshotState);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue5);
            } else {
                function1 = onTradeDetailSettingsSave;
            }
            composer4.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue5, strStringResource2, modifierM5143paddingVpY3zN4, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, false, null, composer4, 0, 0, 8056);
            composerStartRestartGroup = composer4;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubTradeDetailSettingsBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PnlHubTradeDetailSettingsBottomSheet.PnlHubTradeDetailSettingsBottomSheet$lambda$12(viewState, function1, onTradeDetailSettingsBannerDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubTradeDetailSettingsBottomSheet$lambda$11$lambda$3$lambda$2(Function0 function0, SnapshotState snapshotState) {
        function0.invoke();
        dismissBanner(snapshotState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PnlHubTradeDetailSettingsBottomSheet$lambda$11$lambda$6$lambda$5$lambda$4 */
    public static final Unit m2381xee9dcc20(SnapshotState snapshotState, PnlHubDataState4 pnlHubDataState4, UserInteractionEventDescriptor userInteractionEventDescriptor, Resources resources, EventLogger eventLogger) {
        UserInteractionEventData.Action action;
        sortBy(snapshotState, pnlHubDataState4);
        Screen screen = userInteractionEventDescriptor.getScreen();
        if (((PnlHubTradeDetailSettings) snapshotState.getValue()).getDirection() == PositionsSortOptionsContext.SortDirection.ASC) {
            action = UserInteractionEventData.Action.SORT_ASCENDING;
        } else {
            action = UserInteractionEventData.Action.SORT_DESCENDING;
        }
        UserInteractionEventData.Action action2 = action;
        Component.ComponentType componentType = Component.ComponentType.PNL_SETTINGS;
        StringResource sortName = pnlHubDataState4.getSortName();
        Intrinsics.checkNotNull(resources);
        EventLogger.DefaultImpls.logTap$default(eventLogger, action2, screen, new Component(componentType, sortName.getText(resources).toString(), null, 4, null), null, null, false, 56, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubTradeDetailSettingsBottomSheet$lambda$11$lambda$8$lambda$7(SnapshotState snapshotState, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, boolean z) {
        if (!((PnlHubTradeDetailSettings) snapshotState.getValue()).getGroupBySymbol()) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.GROUP_BY, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.PNL_SETTINGS, "symbol", null, 4, null), null, null, false, 56, null);
        }
        groupBySymbol(snapshotState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PnlHubTradeDetailSettingsBottomSheet$lambda$11$lambda$10$lambda$9 */
    public static final Unit m2380xa479006c(Function1 function1, SnapshotState snapshotState) {
        function1.invoke(snapshotState.getValue());
        return Unit.INSTANCE;
    }

    private static final void dismissBanner(SnapshotState<PnlHubTradeDetailSettings> snapshotState) {
        snapshotState.setValue(PnlHubTradeDetailSettings.copy$default(snapshotState.getValue(), null, null, false, false, 7, null));
    }

    private static final void groupBySymbol(SnapshotState<PnlHubTradeDetailSettings> snapshotState) {
        PnlHubTradeDetailSettings pnlHubTradeDetailSettingsCopy$default;
        if (!snapshotState.getValue().getGroupBySymbol()) {
            if (snapshotState.getValue().getCurrentSortKey() == PnlHubDataState4.DATE) {
                sortBy(snapshotState, PnlHubDataState4.SYMBOL);
                pnlHubTradeDetailSettingsCopy$default = PnlHubTradeDetailSettings.copy$default(snapshotState.getValue(), null, null, true, false, 11, null);
            } else {
                pnlHubTradeDetailSettingsCopy$default = PnlHubTradeDetailSettings.copy$default(snapshotState.getValue(), null, null, true, false, 11, null);
            }
        } else {
            pnlHubTradeDetailSettingsCopy$default = PnlHubTradeDetailSettings.copy$default(snapshotState.getValue(), null, null, false, false, 11, null);
        }
        snapshotState.setValue(pnlHubTradeDetailSettingsCopy$default);
    }

    private static final void sortBy(SnapshotState<PnlHubTradeDetailSettings> snapshotState, PnlHubDataState4 pnlHubDataState4) {
        PnlHubTradeDetailSettings pnlHubTradeDetailSettingsCopy$default;
        if (pnlHubDataState4 == snapshotState.getValue().getCurrentSortKey()) {
            PnlHubTradeDetailSettings value = snapshotState.getValue();
            PositionsSortOptionsContext.SortDirection direction = snapshotState.getValue().getDirection();
            PositionsSortOptionsContext.SortDirection sortDirection = PositionsSortOptionsContext.SortDirection.ASC;
            if (direction == sortDirection) {
                sortDirection = PositionsSortOptionsContext.SortDirection.DSC;
            }
            pnlHubTradeDetailSettingsCopy$default = PnlHubTradeDetailSettings.copy$default(value, null, sortDirection, false, false, 13, null);
        } else if (WhenMappings.$EnumSwitchMapping$0[pnlHubDataState4.ordinal()] == 1) {
            pnlHubTradeDetailSettingsCopy$default = PnlHubTradeDetailSettings.copy$default(snapshotState.getValue(), pnlHubDataState4, PositionsSortOptionsContext.SortDirection.ASC, false, false, 12, null);
        } else {
            pnlHubTradeDetailSettingsCopy$default = PnlHubTradeDetailSettings.copy$default(snapshotState.getValue(), pnlHubDataState4, PositionsSortOptionsContext.SortDirection.DSC, false, false, 12, null);
        }
        snapshotState.setValue(pnlHubTradeDetailSettingsCopy$default);
    }
}
