package com.robinhood.android.portfolio.pnlhub.p216ui;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import com.adjust.sdk.network.ErrorCodes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.linking.MobileLinkingDeeplinkConstants;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.android.portfolio.pnl.p215ui.UiProfitAndLossTradeGroup;
import com.robinhood.android.portfolio.pnlhub.PnlHubDataState2;
import com.robinhood.android.portfolio.pnlhub.PnlHubTradeListDisclosureState;
import com.robinhood.android.portfolio.pnlhub.PnlHubViewState;
import com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState;
import com.robinhood.android.portfolio.pnlhub.p216ui.crypto.PnlHubListTradeItemCryptoRow;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.datetime.format.InstantFormatter;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Instant;

/* compiled from: PnlHubListComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u001ay\u0010\u0011\u001a\u00020\f*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aÑ\u0001\u0010\u001f\u001a\u00020\f*\u00020\u00002\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042<\u0010\u001e\u001a8\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001c0\u0013¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\f0\u00182\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\nH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010%\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020#2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b%\u0010&\u001ag\u0010)\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020#2<\u0010\u001e\u001a8\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001c0\u0013¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\f0\u0018H\u0007¢\u0006\u0004\b)\u0010*\u001a=\u0010+\u001a\u00020\f*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\nH\u0000¢\u0006\u0004\b+\u0010,\u001a\u001d\u0010.\u001a\u00020\f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0001¢\u0006\u0004\b.\u0010/\u001a\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\u0007H\u0001¢\u0006\u0004\b1\u00102\u001a%\u00105\u001a\u00020\u0004*\u0004\u0018\u0001032\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\u0001¢\u0006\u0004\b5\u00106\u001a#\u00108\u001a\u00020\u0004*\u0002072\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\u0001¢\u0006\u0004\b8\u00109\u001aA\u0010>\u001a\u00020\f2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040:2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b>\u0010?\u001a\u0013\u0010@\u001a\u00020\u0016*\u00020\u0016H\u0000¢\u0006\u0004\b@\u0010A\"\u0014\u0010C\u001a\u00020B8\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010D\"\u0014\u0010E\u001a\u00020\u00168\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010F\"\u0014\u0010G\u001a\u00020\u00168\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010F\"\u0014\u0010H\u001a\u00020\u00168\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010F\"\u0014\u0010I\u001a\u00020\u00168\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010F¨\u0006J"}, m3636d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "tradeItems", "", "showAllButtonVisible", "disclosureRowVisible", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState;", "tradeListDisclosureState", "showDebouncedLoadingSpinner", "Lkotlin/Function1;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "", "onBottomSheetStateChange", "Lkotlin/Function0;", "onShowAllButtonClicked", "updateDebouncedLoadingSpinner", "profitAndLossTradeFlattenedList", "(Landroidx/compose/foundation/lazy/LazyListScope;Landroidx/paging/compose/LazyPagingItems;ZZLcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "Lcom/robinhood/android/portfolio/pnl/ui/UiProfitAndLossTradeGroup;", "tradeGroups", "", "expandedGroupId", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "groupId", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "assetClasses", "onGroupToggled", "profitAndLossTradeGroupedList", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Landroidx/paging/compose/LazyPagingItems;Ljava/lang/String;ZZLcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "isGroupedTradeItem", "Landroidx/compose/ui/Modifier;", "modifier", "PnlHubListTradeItemRow", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "collapsed", MobileLinkingDeeplinkConstants.group_id_param, "PnlHubListTradeGroupRow", "(ZLcom/robinhood/android/portfolio/pnl/ui/UiProfitAndLossTradeGroup;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "profitAndLossTradeListLoadingSpinner", "(Landroidx/compose/foundation/lazy/LazyListScope;Landroidx/paging/compose/LazyPagingItems;ZLkotlin/jvm/functions/Function1;)V", "onClick", "PnlHubListShowAllButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "state", "PnlHubListDisclosureRow", "(Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;", "collectedTradeItems", "shouldShowEmptyState", "(Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;Landroidx/paging/compose/LazyPagingItems;Landroidx/compose/runtime/Composer;I)Z", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState$Ready;", "isShowAllButtonVisible", "(Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState$Ready;Landroidx/paging/compose/LazyPagingItems;Landroidx/compose/runtime/Composer;I)Z", "Lkotlinx/coroutines/flow/Flow;", "refreshTradeItemsFlow", "j$/time/Instant", "updateTradeItemsLastRefreshedTimestamp", "RefreshTradeItemsEffect", "(Landroidx/paging/compose/LazyPagingItems;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "capitalizeFirstLetter", "(Ljava/lang/String;)Ljava/lang/String;", "", "PNL_HUB_LIST_SHOW_ALL_THRESHOLD", "I", "PNL_HUB_LIST_SHOW_ALL_BUTTON_TEST_TAG", "Ljava/lang/String;", "PNL_HUB_LIST_DISCLOSURE_ROW_TEST_TAG", "PNL_HUB_LIST_DISCLOSURE_ROW_WITH_URL_LINK_TEST_TAG", "PNL_HUB_LIST_SHOW_ALL_IDENTIFIER", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubListComposable {
    public static final String PNL_HUB_LIST_DISCLOSURE_ROW_TEST_TAG = "pnl_hub_list_disclosure_row_test_tag";
    public static final String PNL_HUB_LIST_DISCLOSURE_ROW_WITH_URL_LINK_TEST_TAG = "pnl_hub_list_disclosure_row_with_link_test_tag";
    public static final String PNL_HUB_LIST_SHOW_ALL_BUTTON_TEST_TAG = "pnl_hub_list_show_all_button_test_tag";
    public static final String PNL_HUB_LIST_SHOW_ALL_IDENTIFIER = "show_all";
    public static final int PNL_HUB_LIST_SHOW_ALL_THRESHOLD = 10;

    /* compiled from: PnlHubListComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetClass.values().length];
            try {
                iArr[AssetClass.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetClass.FOREX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubListDisclosureRow$lambda$12(PnlHubTradeListDisclosureState pnlHubTradeListDisclosureState, int i, Composer composer, int i2) {
        PnlHubListDisclosureRow(pnlHubTradeListDisclosureState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubListShowAllButton$lambda$9(Function0 function0, int i, Composer composer, int i2) {
        PnlHubListShowAllButton(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubListTradeGroupRow$lambda$6(boolean z, UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        PnlHubListTradeGroupRow(z, uiProfitAndLossTradeGroup, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubListTradeItemRow$lambda$3(ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        PnlHubListTradeItemRow(profitAndLossTradeItem, z, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RefreshTradeItemsEffect$lambda$13(LazyPagingItems lazyPagingItems, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        RefreshTradeItemsEffect(lazyPagingItems, flow, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RefreshTradeItemsEffect$lambda$17(LazyPagingItems lazyPagingItems, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        RefreshTradeItemsEffect(lazyPagingItems, flow, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void profitAndLossTradeFlattenedList(LazyListScope lazyListScope, final LazyPagingItems<ProfitAndLossTradeItem> lazyPagingItems, final boolean z, boolean z2, final PnlHubTradeListDisclosureState tradeListDisclosureState, boolean z3, final Function1<? super PnlHubDataState2, Unit> onBottomSheetStateChange, final Function0<Unit> onShowAllButtonClicked, Function1<? super Boolean, Unit> updateDebouncedLoadingSpinner) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(tradeListDisclosureState, "tradeListDisclosureState");
        Intrinsics.checkNotNullParameter(onBottomSheetStateChange, "onBottomSheetStateChange");
        Intrinsics.checkNotNullParameter(onShowAllButtonClicked, "onShowAllButtonClicked");
        Intrinsics.checkNotNullParameter(updateDebouncedLoadingSpinner, "updateDebouncedLoadingSpinner");
        if (lazyPagingItems == null || lazyPagingItems.getItemCount() == 0) {
            return;
        }
        LazyListScope.items$default(lazyListScope, lazyPagingItems.getItemCount(), null, null, ComposableLambda3.composableLambdaInstance(1949901833, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.profitAndLossTradeFlattenedList.1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 48) == 0) {
                    i2 |= composer.changed(i) ? 32 : 16;
                }
                if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1949901833, i2, -1, "com.robinhood.android.portfolio.pnlhub.ui.profitAndLossTradeFlattenedList.<anonymous> (PnlHubListComposable.kt:74)");
                }
                if (z && i >= 10) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                ProfitAndLossTradeItem profitAndLossTradeItem = lazyPagingItems.get(i);
                if (profitAndLossTradeItem == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    PnlHubListComposable.PnlHubListTradeItemRow(profitAndLossTradeItem, false, null, onBottomSheetStateChange, composer, 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
        }), 6, null);
        if (z) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1217883552, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.profitAndLossTradeFlattenedList.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1217883552, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.profitAndLossTradeFlattenedList.<anonymous> (PnlHubListComposable.kt:86)");
                    }
                    PnlHubListComposable.PnlHubListShowAllButton(onShowAllButtonClicked, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        } else {
            profitAndLossTradeListLoadingSpinner(lazyListScope, lazyPagingItems, z3, updateDebouncedLoadingSpinner);
        }
        if (z2) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1419975487, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.profitAndLossTradeFlattenedList.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1419975487, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.profitAndLossTradeFlattenedList.<anonymous> (PnlHubListComposable.kt:96)");
                    }
                    PnlHubListComposable.PnlHubListDisclosureRow(tradeListDisclosureState, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
    }

    public static final void profitAndLossTradeGroupedList(LazyListScope lazyListScope, List<UiProfitAndLossTradeGroup> list, final LazyPagingItems<ProfitAndLossTradeItem> lazyPagingItems, String str, boolean z, boolean z2, final PnlHubTradeListDisclosureState tradeListDisclosureState, boolean z3, final Function2<? super String, ? super List<? extends AssetClass>, Unit> onGroupToggled, final Function1<? super PnlHubDataState2, Unit> onBottomSheetStateChange, final Function0<Unit> onShowAllButtonClicked, Function1<? super Boolean, Unit> updateDebouncedLoadingSpinner) {
        LazyListScope lazyListScope2 = lazyListScope;
        Intrinsics.checkNotNullParameter(lazyListScope2, "<this>");
        Intrinsics.checkNotNullParameter(tradeListDisclosureState, "tradeListDisclosureState");
        Intrinsics.checkNotNullParameter(onGroupToggled, "onGroupToggled");
        Intrinsics.checkNotNullParameter(onBottomSheetStateChange, "onBottomSheetStateChange");
        Intrinsics.checkNotNullParameter(onShowAllButtonClicked, "onShowAllButtonClicked");
        Intrinsics.checkNotNullParameter(updateDebouncedLoadingSpinner, "updateDebouncedLoadingSpinner");
        List<UiProfitAndLossTradeGroup> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup = (UiProfitAndLossTradeGroup) obj;
            if (!z || i < 10) {
                boolean zAreEqual = Intrinsics.areEqual(str, uiProfitAndLossTradeGroup.getId());
                final boolean z4 = !zAreEqual;
                LazyListScope.stickyHeader$default(lazyListScope2, null, null, ComposableLambda3.composableLambdaInstance(-1092248162, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$profitAndLossTradeGroupedList$1$1
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope stickyHeader, int i3, Composer composer, int i4) {
                        Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                        if ((i4 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1092248162, i4, -1, "com.robinhood.android.portfolio.pnlhub.ui.profitAndLossTradeGroupedList.<anonymous>.<anonymous> (PnlHubListComposable.kt:124)");
                        }
                        PnlHubListComposable.PnlHubListTradeGroupRow(z4, uiProfitAndLossTradeGroup, null, onGroupToggled, composer, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                if (!zAreEqual || lazyPagingItems == null) {
                    lazyListScope2 = lazyListScope;
                } else {
                    lazyListScope2 = lazyListScope;
                    LazyListScope.items$default(lazyListScope2, lazyPagingItems.getItemCount(), null, null, ComposableLambda3.composableLambdaInstance(1264295725, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$profitAndLossTradeGroupedList$1$2
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope items, int i3, Composer composer, int i4) {
                            Intrinsics.checkNotNullParameter(items, "$this$items");
                            if ((i4 & 48) == 0) {
                                i4 |= composer.changed(i3) ? 32 : 16;
                            }
                            if ((i4 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1264295725, i4, -1, "com.robinhood.android.portfolio.pnlhub.ui.profitAndLossTradeGroupedList.<anonymous>.<anonymous> (PnlHubListComposable.kt:128)");
                            }
                            ProfitAndLossTradeItem profitAndLossTradeItem = lazyPagingItems.get(i3);
                            if (profitAndLossTradeItem == null) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                PnlHubListComposable.PnlHubListTradeItemRow(profitAndLossTradeItem, true, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), onBottomSheetStateChange, composer, 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }
                    }), 6, null);
                    profitAndLossTradeListLoadingSpinner(lazyListScope2, lazyPagingItems, z3, updateDebouncedLoadingSpinner);
                    i = i2;
                }
            }
            i = i2;
        }
        if (z) {
            LazyListScope.item$default(lazyListScope2, null, null, ComposableLambda3.composableLambdaInstance(448011176, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.profitAndLossTradeGroupedList.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(448011176, i3, -1, "com.robinhood.android.portfolio.pnlhub.ui.profitAndLossTradeGroupedList.<anonymous> (PnlHubListComposable.kt:141)");
                    }
                    PnlHubListComposable.PnlHubListShowAllButton(onShowAllButtonClicked, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        if (z2) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(311983879, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.profitAndLossTradeGroupedList.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(311983879, i3, -1, "com.robinhood.android.portfolio.pnlhub.ui.profitAndLossTradeGroupedList.<anonymous> (PnlHubListComposable.kt:146)");
                    }
                    PnlHubListComposable.PnlHubListDisclosureRow(tradeListDisclosureState, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlHubListTradeItemRow(final ProfitAndLossTradeItem item, final boolean z, Modifier modifier, final Function1<? super PnlHubDataState2, Unit> onBottomSheetStateChange, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int i4;
        Modifier modifier4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onBottomSheetStateChange, "onBottomSheetStateChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1601235514);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onBottomSheetStateChange) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1601235514, i3, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListTradeItemRow (PnlHubListComposable.kt:157)");
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[item.getAssetClass().ordinal()];
                if (i4 != 1 || i4 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-1189026927);
                    modifier4 = modifier3;
                    PnlHubListTradeItemCryptoRow.PnlHubListTradeItemCryptoRow(item, z, modifier4, onBottomSheetStateChange, composerStartRestartGroup, i3 & 8190, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1795205140);
                    final Money realizedReturn = item.getRealizedReturn();
                    if (realizedReturn == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(item);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PnlHubListComposable.PnlHubListTradeItemRow$lambda$2$lambda$1(onBottomSheetStateChange, item);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier3, false, null, null, (Function0) objRememberedValue, 7, null), null, null, ComposableLambda3.rememberComposableLambda(-2013020216, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.PnlHubListTradeItemRow.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            String strCapitalizeFirstLetter;
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2013020216, i6, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListTradeItemRow.<anonymous> (PnlHubListComposable.kt:177)");
                            }
                            if (z) {
                                strCapitalizeFirstLetter = PnlHubListComposable.capitalizeFirstLetter(item.getDisplayName());
                            } else {
                                strCapitalizeFirstLetter = item.getSymbol() + PlaceholderUtils.XXShortPlaceholderText + item.getDisplayName();
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(strCapitalizeFirstLetter, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1769483353, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.PnlHubListTradeItemRow.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1769483353, i6, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListTradeItemRow.<anonymous> (PnlHubListComposable.kt:188)");
                            }
                            String str = InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) item.getCloseTimestamp());
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-1282409627, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.PnlHubListTradeItemRow.4
                        public final void invoke(Composer composer2, int i6) {
                            ProfitAndLossTradeItem profitAndLossTradeItem;
                            String str;
                            long jM21452getNegative0d7_KjU;
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1282409627, i6, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListTradeItemRow.<anonymous> (PnlHubListComposable.kt:195)");
                            }
                            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                            Money money = realizedReturn;
                            ProfitAndLossTradeItem profitAndLossTradeItem2 = item;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer2, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            if (money.isZero()) {
                                profitAndLossTradeItem = profitAndLossTradeItem2;
                                str = Money.format$default(money, null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null);
                            } else {
                                profitAndLossTradeItem = profitAndLossTradeItem2;
                                str = Formats.getCurrencyDeltaFormat().format(money.getDecimalValue());
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 0, 0, 8186);
                            String str2 = profitAndLossTradeItem.getRealizedReturnPercentage().signum() == 0 ? Formats.getLeadingZeroesHundredthPercentFormat().format(profitAndLossTradeItem.getRealizedReturnPercentage()) : Formats.getPercentDeltaWithHundredthDecimalFormat().format(profitAndLossTradeItem.getRealizedReturnPercentage());
                            TextStyle textS = bentoTheme.getTypography(composer2, i7).getTextS();
                            if (profitAndLossTradeItem.getRealizedReturnPercentage().signum() == 0) {
                                composer2.startReplaceGroup(403497983);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                                composer2.endReplaceGroup();
                            } else if (profitAndLossTradeItem.getRealizedReturnPercentage().compareTo(BigDecimal.ZERO) > 0) {
                                composer2.startReplaceGroup(403640025);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i7).m21456getPositive0d7_KjU();
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(403735257);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i7).m21452getNegative0d7_KjU();
                                composer2.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8186);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), false, false, false, null, composerStartRestartGroup, 1600512, 0, 1958);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier4 = modifier3;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PnlHubListComposable.PnlHubListTradeItemRow$lambda$3(item, z, modifier5, onBottomSheetStateChange, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[item.getAssetClass().ordinal()];
            if (i4 != 1) {
                composerStartRestartGroup.startReplaceGroup(-1189026927);
                modifier4 = modifier3;
                PnlHubListTradeItemCryptoRow.PnlHubListTradeItemCryptoRow(item, z, modifier4, onBottomSheetStateChange, composerStartRestartGroup, i3 & 8190, 0);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier5 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubListTradeItemRow$lambda$2$lambda$1(Function1 function1, ProfitAndLossTradeItem profitAndLossTradeItem) {
        function1.invoke(new PnlHubDataState2.TradeDetail(profitAndLossTradeItem));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlHubListTradeGroupRow(boolean z, UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup, Modifier modifier, final Function2<? super String, ? super List<? extends AssetClass>, Unit> onGroupToggled, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final boolean z2 = z;
        final UiProfitAndLossTradeGroup group = uiProfitAndLossTradeGroup;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(onGroupToggled, "onGroupToggled");
        Composer composerStartRestartGroup = composer.startRestartGroup(1617704249);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(group) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onGroupToggled) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1617704249, i3, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListTradeGroupRow (PnlHubListComposable.kt:237)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier4, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                Modifier modifier5 = modifier4;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(group) | composerStartRestartGroup.changedInstance(current) | ((i3 & 7168) == 2048);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PnlHubListComposable.PnlHubListTradeGroupRow$lambda$5$lambda$4(userInteractionEventDescriptor, z2, group, current, onGroupToggled);
                        }
                    };
                    z2 = z2;
                    group = group;
                    composerStartRestartGroup.updateRememberedValue(function0);
                    objRememberedValue = function0;
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null), null, ComposableLambda3.rememberComposableLambda(457970429, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.PnlHubListTradeGroupRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(457970429, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListTradeGroupRow.<anonymous> (PnlHubListComposable.kt:261)");
                        }
                        BentoIcon2.m20644BentoIconFU0evQE(z2 ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16) : new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_DOWN_16), null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1813497316, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.PnlHubListTradeGroupRow.3
                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813497316, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListTradeGroupRow.<anonymous> (PnlHubListComposable.kt:272)");
                        }
                        UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup2 = group;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String displayName = uiProfitAndLossTradeGroup2.getDisplayName();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(displayName, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25819R.string.pnl_hub_list_trade_group_size, new Object[]{Integer.valueOf(uiProfitAndLossTradeGroup2.getGroupSize())}, composer3, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
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
                }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(-37965959, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.PnlHubListTradeGroupRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        long jM21452getNegative0d7_KjU;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-37965959, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListTradeGroupRow.<anonymous> (PnlHubListComposable.kt:286)");
                        }
                        if (group.getNullOutGroupPnl()) {
                            composer3.startReplaceGroup(-1467437142);
                            String strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_group_pnl_unavailable_text, composer3, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1467134055);
                            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                            UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup2 = group;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String str = uiProfitAndLossTradeGroup2.getRealizedReturn().isZero() ? Money.format$default(uiProfitAndLossTradeGroup2.getRealizedReturn(), null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null) : Formats.getCurrencyDeltaFormat().format(uiProfitAndLossTradeGroup2.getRealizedReturn().getDecimalValue());
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8186);
                            String str2 = uiProfitAndLossTradeGroup2.getRealizedReturnPercentage().toBigDecimalOrThrow().signum() == 0 ? Formats.getLeadingZeroesHundredthPercentFormat().format(uiProfitAndLossTradeGroup2.getRealizedReturnPercentage().toBigDecimalOrThrow()) : Formats.getPercentDeltaWithHundredthDecimalFormat().format(uiProfitAndLossTradeGroup2.getRealizedReturnPercentage().toBigDecimalOrThrow());
                            TextStyle textS = bentoTheme2.getTypography(composer3, i7).getTextS();
                            if (uiProfitAndLossTradeGroup2.getRealizedReturnPercentage().toBigDecimalOrThrow().signum() == 0) {
                                composer3.startReplaceGroup(-928902825);
                                jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer3, i7).m21425getFg0d7_KjU();
                                composer3.endReplaceGroup();
                            } else if (uiProfitAndLossTradeGroup2.getRealizedReturnPercentage().toBigDecimalOrThrow().compareTo(BigDecimal.ZERO) > 0) {
                                composer3.startReplaceGroup(-928745903);
                                jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer3, i7).m21456getPositive0d7_KjU();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-928658607);
                                jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer3, i7).m21452getNegative0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8186);
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), false, false, false, null, composer2, 1576320, 0, 1970);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PnlHubListComposable.PnlHubListTradeGroupRow$lambda$6(z2, group, modifier3, onGroupToggled, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier4, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            Modifier modifier52 = modifier4;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(group) | composerStartRestartGroup.changedInstance(current) | ((i3 & 7168) == 2048);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                Function0 function02 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PnlHubListComposable.PnlHubListTradeGroupRow$lambda$5$lambda$4(userInteractionEventDescriptor, z2, group, current, onGroupToggled);
                    }
                };
                z2 = z2;
                group = group;
                composerStartRestartGroup.updateRememberedValue(function02);
                objRememberedValue = function02;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default2, false, null, null, (Function0) objRememberedValue, 7, null), null, ComposableLambda3.rememberComposableLambda(457970429, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.PnlHubListTradeGroupRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(457970429, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListTradeGroupRow.<anonymous> (PnlHubListComposable.kt:261)");
                        }
                        BentoIcon2.m20644BentoIconFU0evQE(z2 ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16) : new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_DOWN_16), null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1813497316, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.PnlHubListTradeGroupRow.3
                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813497316, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListTradeGroupRow.<anonymous> (PnlHubListComposable.kt:272)");
                        }
                        UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup2 = group;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String displayName = uiProfitAndLossTradeGroup2.getDisplayName();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(displayName, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25819R.string.pnl_hub_list_trade_group_size, new Object[]{Integer.valueOf(uiProfitAndLossTradeGroup2.getGroupSize())}, composer3, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
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
                }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(-37965959, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.PnlHubListTradeGroupRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        long jM21452getNegative0d7_KjU;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-37965959, i5, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListTradeGroupRow.<anonymous> (PnlHubListComposable.kt:286)");
                        }
                        if (group.getNullOutGroupPnl()) {
                            composer3.startReplaceGroup(-1467437142);
                            String strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_group_pnl_unavailable_text, composer3, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1467134055);
                            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                            UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup2 = group;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String str = uiProfitAndLossTradeGroup2.getRealizedReturn().isZero() ? Money.format$default(uiProfitAndLossTradeGroup2.getRealizedReturn(), null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null) : Formats.getCurrencyDeltaFormat().format(uiProfitAndLossTradeGroup2.getRealizedReturn().getDecimalValue());
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8186);
                            String str2 = uiProfitAndLossTradeGroup2.getRealizedReturnPercentage().toBigDecimalOrThrow().signum() == 0 ? Formats.getLeadingZeroesHundredthPercentFormat().format(uiProfitAndLossTradeGroup2.getRealizedReturnPercentage().toBigDecimalOrThrow()) : Formats.getPercentDeltaWithHundredthDecimalFormat().format(uiProfitAndLossTradeGroup2.getRealizedReturnPercentage().toBigDecimalOrThrow());
                            TextStyle textS = bentoTheme2.getTypography(composer3, i7).getTextS();
                            if (uiProfitAndLossTradeGroup2.getRealizedReturnPercentage().toBigDecimalOrThrow().signum() == 0) {
                                composer3.startReplaceGroup(-928902825);
                                jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer3, i7).m21425getFg0d7_KjU();
                                composer3.endReplaceGroup();
                            } else if (uiProfitAndLossTradeGroup2.getRealizedReturnPercentage().toBigDecimalOrThrow().compareTo(BigDecimal.ZERO) > 0) {
                                composer3.startReplaceGroup(-928745903);
                                jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer3, i7).m21456getPositive0d7_KjU();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-928658607);
                                jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer3, i7).m21452getNegative0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8186);
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), false, false, false, null, composer2, 1576320, 0, 1970);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubListTradeGroupRow$lambda$5$lambda$4(UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z, UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup, EventLogger eventLogger, Function2 function2) {
        UserInteractionEventData.Action action;
        Screen screen = userInteractionEventDescriptor.getScreen();
        if (z) {
            action = UserInteractionEventData.Action.EXPAND;
        } else {
            action = UserInteractionEventData.Action.COLLAPSE;
        }
        UserInteractionEventData.Action action2 = action;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action2, screen, new Component(Component.ComponentType.ROW, "group_by_" + uiProfitAndLossTradeGroup.getDisplayName(), null, 4, null), null, null, false, 56, null);
        function2.invoke(uiProfitAndLossTradeGroup.getId(), uiProfitAndLossTradeGroup.getAssetClasses());
        return Unit.INSTANCE;
    }

    public static final void profitAndLossTradeListLoadingSpinner(LazyListScope lazyListScope, LazyPagingItems<ProfitAndLossTradeItem> tradeItems, final boolean z, final Function1<? super Boolean, Unit> updateDebouncedLoadingSpinner) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(tradeItems, "tradeItems");
        Intrinsics.checkNotNullParameter(updateDebouncedLoadingSpinner, "updateDebouncedLoadingSpinner");
        final boolean z2 = (tradeItems.getLoadState().getRefresh() instanceof LoadState.Loading) || (tradeItems.getLoadState().getAppend() instanceof LoadState.Loading);
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(396869256, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt.profitAndLossTradeListLoadingSpinner.1
            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(396869256, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.profitAndLossTradeListLoadingSpinner.<anonymous> (PnlHubListComposable.kt:342)");
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(updateDebouncedLoadingSpinner) | composer.changed(z2);
                Function1<Boolean, Unit> function1 = updateDebouncedLoadingSpinner;
                boolean z3 = z2;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new PnlHubListComposable6(function1, z3, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 0);
                if (z) {
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5151S, 0L, composer, 48, 5);
                    composer.endNode();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }), 3, null);
    }

    public static final void PnlHubListShowAllButton(final Function0<Unit> onClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1452714072);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1452714072, i2, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListShowAllButton (PnlHubListComposable.kt:363)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, PNL_HUB_LIST_SHOW_ALL_BUTTON_TEST_TAG);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 12, null);
            String strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_list_show_all_button_text, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PnlHubListComposable.PnlHubListShowAllButton$lambda$8$lambda$7(userInteractionEventDescriptor, current, onClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, null, false, null, composerStartRestartGroup, 0, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PnlHubListComposable.PnlHubListShowAllButton$lambda$9(onClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubListShowAllButton$lambda$8$lambda$7(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.EXPAND, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, PNL_HUB_LIST_SHOW_ALL_IDENTIFIER, null, 4, null), null, null, false, 56, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void PnlHubListDisclosureRow(final PnlHubTradeListDisclosureState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-538405636);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-538405636, i2, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubListDisclosureRow (PnlHubListComposable.kt:389)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
            if (state instanceof PnlHubTradeListDisclosureState.Disclosure) {
                composerStartRestartGroup.startReplaceGroup(2060951269);
                Modifier modifierTestTag = TestTag3.testTag(modifierM5146paddingqDBjuR0$default, PNL_HUB_LIST_DISCLOSURE_ROW_TEST_TAG);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(((PnlHubTradeListDisclosureState.Disclosure) state).getTextId(), composerStartRestartGroup, 0), modifierTestTag, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(state instanceof PnlHubTradeListDisclosureState.DisclosureWithUrlLink)) {
                    composerStartRestartGroup.startReplaceGroup(-2011729215);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(2061315860);
                PnlHubTradeListDisclosureState.DisclosureWithUrlLink disclosureWithUrlLink = (PnlHubTradeListDisclosureState.DisclosureWithUrlLink) state;
                final String strStringResource = StringResources_androidKt.stringResource(disclosureWithUrlLink.getUrlLinkId(), composerStartRestartGroup, 0);
                Modifier modifierTestTag2 = TestTag3.testTag(modifierM5146paddingqDBjuR0$default, PNL_HUB_LIST_DISCLOSURE_ROW_WITH_URL_LINK_TEST_TAG);
                String strStringResource2 = StringResources_androidKt.stringResource(disclosureWithUrlLink.getTextId(), composerStartRestartGroup, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(disclosureWithUrlLink.getSubstringLinkTextId(), composerStartRestartGroup, 0);
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PnlHubListComposable.PnlHubListDisclosureRow$lambda$11$lambda$10(context, strStringResource);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextWithLink.m20753BentoTextWithSubstringLinkXkG1Q0A(strStringResource2, strStringResource3, (Function0) objRememberedValue, modifierTestTag2, jM21426getFg20d7_KjU, 0L, textS, 0, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PnlHubListComposable.PnlHubListDisclosureRow$lambda$12(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubListDisclosureRow$lambda$11$lambda$10(Context context, String str) {
        WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean shouldShowEmptyState(ProfitAndLossTradeListState profitAndLossTradeListState, LazyPagingItems<ProfitAndLossTradeItem> lazyPagingItems, Composer composer, int i) {
        CombinedLoadStates loadState;
        composer.startReplaceGroup(-1114912944);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1114912944, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.shouldShowEmptyState (PnlHubListComposable.kt:431)");
        }
        boolean zIsEmpty = false;
        if (!(((lazyPagingItems == null || (loadState = lazyPagingItems.getLoadState()) == null) ? null : loadState.getRefresh()) instanceof LoadState.Loading)) {
            if (profitAndLossTradeListState instanceof ProfitAndLossTradeListState.Flattened) {
                if (lazyPagingItems == null || lazyPagingItems.getItemCount() == 0) {
                    zIsEmpty = true;
                }
            } else if (profitAndLossTradeListState instanceof ProfitAndLossTradeListState.Grouped) {
                zIsEmpty = ((ProfitAndLossTradeListState.Grouped) profitAndLossTradeListState).getTradeGroups().isEmpty();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return zIsEmpty;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isShowAllButtonVisible(PnlHubViewState.Ready ready, LazyPagingItems<ProfitAndLossTradeItem> lazyPagingItems, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(ready, "<this>");
        composer.startReplaceGroup(-334260196);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-334260196, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.isShowAllButtonVisible (PnlHubListComposable.kt:451)");
        }
        boolean z = false;
        if (ready.getHasClickedShowAllButton()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return false;
        }
        ProfitAndLossTradeListState tradeListState = ready.getTradeListState();
        if (tradeListState instanceof ProfitAndLossTradeListState.Flattened) {
            if (lazyPagingItems != null && lazyPagingItems.getItemCount() > 10) {
                z = true;
            }
        } else if (tradeListState instanceof ProfitAndLossTradeListState.Grouped) {
            if (((ProfitAndLossTradeListState.Grouped) ready.getTradeListState()).getTradeGroups().size() > 10) {
            }
        } else if (tradeListState != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return z;
    }

    public static final void RefreshTradeItemsEffect(final LazyPagingItems<ProfitAndLossTradeItem> lazyPagingItems, final Flow<Boolean> refreshTradeItemsFlow, final Function1<? super Instant, Unit> updateTradeItemsLastRefreshedTimestamp, Composer composer, final int i) {
        int i2;
        Object obj;
        final LifecycleOwner lifecycleOwner;
        Intrinsics.checkNotNullParameter(refreshTradeItemsFlow, "refreshTradeItemsFlow");
        Intrinsics.checkNotNullParameter(updateTradeItemsLastRefreshedTimestamp, "updateTradeItemsLastRefreshedTimestamp");
        Composer composerStartRestartGroup = composer.startRestartGroup(-803020550);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(lazyPagingItems) : composerStartRestartGroup.changedInstance(lazyPagingItems) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(refreshTradeItemsFlow) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(updateTradeItemsLastRefreshedTimestamp) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-803020550, i2, -1, "com.robinhood.android.portfolio.pnlhub.ui.RefreshTradeItemsEffect (PnlHubListComposable.kt:477)");
            }
            if (lazyPagingItems == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return PnlHubListComposable.RefreshTradeItemsEffect$lambda$13(lazyPagingItems, refreshTradeItemsFlow, updateTradeItemsLastRefreshedTimestamp, i, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i3 = i2 & 14;
            boolean zChangedInstance = (i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(lazyPagingItems))) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(refreshTradeItemsFlow) | ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(lifecycleOwner2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                lifecycleOwner = lifecycleOwner2;
                obj = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PnlHubListComposable.RefreshTradeItemsEffect$lambda$16$lambda$15(coroutineScope, lifecycleOwner, refreshTradeItemsFlow, lazyPagingItems, updateTradeItemsLastRefreshedTimestamp, (DisposableEffectScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue2;
                lifecycleOwner = lifecycleOwner2;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(lazyPagingItems, lifecycleOwner, (Function1) obj, composerStartRestartGroup, LazyPagingItems.$stable | i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PnlHubListComposable.RefreshTradeItemsEffect$lambda$17(lazyPagingItems, refreshTradeItemsFlow, updateTradeItemsLastRefreshedTimestamp, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult RefreshTradeItemsEffect$lambda$16$lambda$15(CoroutineScope coroutineScope, final LifecycleOwner lifecycleOwner, Flow flow, LazyPagingItems lazyPagingItems, Function1 function1, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PnlHubListComposable2(flow, lazyPagingItems, function1, null), 3, null);
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$RefreshTradeItemsEffect$2$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_START) {
                    jobLaunch$default.start();
                } else if (event == Lifecycle.Event.ON_STOP) {
                    Job.DefaultImpls.cancel$default(jobLaunch$default, null, 1, null);
                }
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubListComposableKt$RefreshTradeItemsEffect$lambda$16$lambda$15$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Job.DefaultImpls.cancel$default(jobLaunch$default, null, 1, null);
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    public static final String capitalizeFirstLetter(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(str.charAt(0));
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        sb.append((Object) upperCase);
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }
}
