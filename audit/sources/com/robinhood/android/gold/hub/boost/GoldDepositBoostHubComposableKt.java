package com.robinhood.android.gold.hub.boost;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.paging.Pager;
import androidx.paging.PagingData;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems5;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.HistoryRow4;
import com.robinhood.android.common.history.p082ui.HistoryRowsCallbacks;
import com.robinhood.android.gold.hub.C17785R;
import com.robinhood.android.gold.hub.CylinderBarConstants;
import com.robinhood.android.gold.hub.GoldHubComposableKt;
import com.robinhood.android.gold.hub.GoldHubCylinderChartComposableKt;
import com.robinhood.android.gold.hub.animations.AnimatedAmountContentComposable;
import com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState;
import com.robinhood.android.gold.lib.hub.api.ApiGoldEarningsCylinderChartSegment;
import com.robinhood.android.gold.lib.hub.api.GoldDepositBoostHubPayoutInfo;
import com.robinhood.android.gold.lib.hub.api.GoldDepositBoostHubPayoutSection;
import com.robinhood.android.gold.lib.hub.api.GoldEarningsSourceRow;
import com.robinhood.android.gold.lib.hub.api.GoldSegmentedControl;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoBanner2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextButton2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GoldDepositBoostHubAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.flow.Flow;

/* compiled from: GoldDepositBoostHubComposable.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001at\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\u008a\u0001\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010\u00192\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001c\u001a+\u0010\u001d\u001a\u00020\u00012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010\u00192\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u001e\u001a-\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020!2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\"\u001a#\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0003¢\u0006\u0002\u0010&\u001a.\u0010'\u001a\u00020\u0001*\u00020(2\u0018\u0010\u0018\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001b0\u001aj\u0002`)\u0018\u00010\u00192\u0006\u0010*\u001a\u00020\nH\u0000¨\u0006+"}, m3636d2 = {"GoldDepositBoostHubComposable", "", "state", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "depositHubActionHandler", "Lcom/robinhood/models/serverdriven/experimental/api/GoldDepositBoostHubAction;", "historyRowsCallbacks", "Lcom/robinhood/android/common/history/ui/HistoryRowsCallbacks;", "onBackClick", "Lkotlin/Function0;", "switchTab", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "newTabIndex", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/common/history/ui/HistoryRowsCallbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GoldDepositBoostHub", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState$Loaded;", "historyItems", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "(Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState$Loaded;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/common/history/ui/HistoryRowsCallbacks;Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HistorySection", "(Landroidx/paging/compose/LazyPagingItems;Lcom/robinhood/android/common/history/ui/HistoryRowsCallbacks;Landroidx/compose/runtime/Composer;I)V", "GoldHubEarningsRow", "earningRow", "Lcom/robinhood/android/gold/lib/hub/api/GoldEarningsSourceRow;", "(Lcom/robinhood/android/gold/lib/hub/api/GoldEarningsSourceRow;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PayoutsSection", "payoutSection", "Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;", "(Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;I)V", "historySection", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "callbacks", "feature-gold-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldDepositBoostHubComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldDepositBoostHub$lambda$2(GoldDepositBoostHubViewState.Loaded loaded, SduiActionHandler sduiActionHandler, SduiActionHandler sduiActionHandler2, HistoryRowsCallbacks historyRowsCallbacks, LazyPagingItems lazyPagingItems, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldDepositBoostHub(loaded, sduiActionHandler, sduiActionHandler2, historyRowsCallbacks, lazyPagingItems, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldDepositBoostHubComposable$lambda$0(GoldDepositBoostHubViewState goldDepositBoostHubViewState, SduiActionHandler sduiActionHandler, SduiActionHandler sduiActionHandler2, HistoryRowsCallbacks historyRowsCallbacks, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldDepositBoostHubComposable(goldDepositBoostHubViewState, sduiActionHandler, sduiActionHandler2, historyRowsCallbacks, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHubEarningsRow$lambda$9(GoldEarningsSourceRow goldEarningsSourceRow, SduiActionHandler sduiActionHandler, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldHubEarningsRow(goldEarningsSourceRow, sduiActionHandler, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistorySection$lambda$5(LazyPagingItems lazyPagingItems, HistoryRowsCallbacks historyRowsCallbacks, int i, Composer composer, int i2) {
        HistorySection(lazyPagingItems, historyRowsCallbacks, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PayoutsSection$lambda$17(GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection, SduiActionHandler sduiActionHandler, int i, Composer composer, int i2) {
        PayoutsSection(goldDepositBoostHubPayoutSection, sduiActionHandler, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldDepositBoostHubComposable(final GoldDepositBoostHubViewState state, final SduiActionHandler<? super GenericAction> actionHandler, final SduiActionHandler<? super GoldDepositBoostHubAction> depositHubActionHandler, final HistoryRowsCallbacks historyRowsCallbacks, final Function0<Unit> onBackClick, final Function1<? super Integer, Unit> switchTab, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(depositHubActionHandler, "depositHubActionHandler");
        Intrinsics.checkNotNullParameter(historyRowsCallbacks, "historyRowsCallbacks");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(switchTab, "switchTab");
        Composer composerStartRestartGroup = composer.startRestartGroup(-275476367);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(depositHubActionHandler) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(historyRowsCallbacks) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(switchTab) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-275476367, i3, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposable (GoldDepositBoostHubComposable.kt:84)");
                }
                SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1), Color.INSTANCE.m6716getBlack0d7_KjU(), false, null, 4, null);
                final Modifier modifier5 = modifier4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1012293562, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt.GoldDepositBoostHubComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1012293562, i5, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposable.<anonymous> (GoldDepositBoostHubComposable.kt:88)");
                        }
                        GoldDepositBoostHubViewState goldDepositBoostHubViewState = state;
                        if (Intrinsics.areEqual(goldDepositBoostHubViewState, GoldDepositBoostHubViewState.Loading.INSTANCE)) {
                            composer2.startReplaceGroup(2022934826);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier5);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierNavigationBarsPadding);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, true, true, composer2, 3456, 3);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        } else {
                            if (goldDepositBoostHubViewState instanceof GoldDepositBoostHubViewState.Loaded) {
                                composer2.startReplaceGroup(2023363308);
                                Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager = ((GoldDepositBoostHubViewState.Loaded) state).getHistoryPager();
                                Flow<PagingData<StatefulHistoryEvent<HistoryEvent>>> flow = historyPager != null ? historyPager.getFlow() : null;
                                composer2.startReplaceGroup(2143481248);
                                LazyPagingItems lazyPagingItemsCollectAsLazyPagingItems = flow != null ? LazyPagingItems5.collectAsLazyPagingItems(flow, null, composer2, 0, 1) : null;
                                composer2.endReplaceGroup();
                                GoldDepositBoostHubComposableKt.GoldDepositBoostHub((GoldDepositBoostHubViewState.Loaded) state, actionHandler, depositHubActionHandler, historyRowsCallbacks, lazyPagingItemsCollectAsLazyPagingItems, onBackClick, switchTab, modifier5, composer2, LazyPagingItems.$stable << 12, 0);
                                composer2.endReplaceGroup();
                            } else {
                                if (!(goldDepositBoostHubViewState instanceof GoldDepositBoostHubViewState.Error)) {
                                    composer2.startReplaceGroup(2143464563);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(2143498901);
                                GoldHubComposableKt.GoldHubFailed(null, composer2, 0, 1);
                                composer2.endReplaceGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldDepositBoostHubComposableKt.GoldDepositBoostHubComposable$lambda$0(state, actionHandler, depositHubActionHandler, historyRowsCallbacks, onBackClick, switchTab, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1), Color.INSTANCE.m6716getBlack0d7_KjU(), false, null, 4, null);
            final Modifier modifier52 = modifier4;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1012293562, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt.GoldDepositBoostHubComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1012293562, i5, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposable.<anonymous> (GoldDepositBoostHubComposable.kt:88)");
                    }
                    GoldDepositBoostHubViewState goldDepositBoostHubViewState = state;
                    if (Intrinsics.areEqual(goldDepositBoostHubViewState, GoldDepositBoostHubViewState.Loading.INSTANCE)) {
                        composer2.startReplaceGroup(2022934826);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier52);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierNavigationBarsPadding);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, true, true, composer2, 3456, 3);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    } else {
                        if (goldDepositBoostHubViewState instanceof GoldDepositBoostHubViewState.Loaded) {
                            composer2.startReplaceGroup(2023363308);
                            Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager = ((GoldDepositBoostHubViewState.Loaded) state).getHistoryPager();
                            Flow<PagingData<StatefulHistoryEvent<HistoryEvent>>> flow = historyPager != null ? historyPager.getFlow() : null;
                            composer2.startReplaceGroup(2143481248);
                            LazyPagingItems lazyPagingItemsCollectAsLazyPagingItems = flow != null ? LazyPagingItems5.collectAsLazyPagingItems(flow, null, composer2, 0, 1) : null;
                            composer2.endReplaceGroup();
                            GoldDepositBoostHubComposableKt.GoldDepositBoostHub((GoldDepositBoostHubViewState.Loaded) state, actionHandler, depositHubActionHandler, historyRowsCallbacks, lazyPagingItemsCollectAsLazyPagingItems, onBackClick, switchTab, modifier52, composer2, LazyPagingItems.$stable << 12, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(goldDepositBoostHubViewState instanceof GoldDepositBoostHubViewState.Error)) {
                                composer2.startReplaceGroup(2143464563);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(2143498901);
                            GoldHubComposableKt.GoldHubFailed(null, composer2, 0, 1);
                            composer2.endReplaceGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldDepositBoostHub(final GoldDepositBoostHubViewState.Loaded loaded, final SduiActionHandler<? super GenericAction> sduiActionHandler, final SduiActionHandler<? super GoldDepositBoostHubAction> sduiActionHandler2, final HistoryRowsCallbacks historyRowsCallbacks, final LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> lazyPagingItems, final Function0<Unit> function0, final Function1<? super Integer, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final SduiActionHandler<? super GoldDepositBoostHubAction> sduiActionHandler3;
        HistoryRowsCallbacks historyRowsCallbacks2;
        Function0<Unit> function02;
        Function1<? super Integer, Unit> function12;
        int i4;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1279168621);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            sduiActionHandler3 = sduiActionHandler2;
        } else {
            sduiActionHandler3 = sduiActionHandler2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(sduiActionHandler3) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            historyRowsCallbacks2 = historyRowsCallbacks;
        } else {
            historyRowsCallbacks2 = historyRowsCallbacks;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(historyRowsCallbacks2) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(lazyPagingItems) : composerStartRestartGroup.changedInstance(lazyPagingItems) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
            }
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else {
            if ((i & 1572864) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1279168621, i3, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub (GoldDepositBoostHubComposable.kt:130)");
                    }
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1813001129, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$1
                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i5) {
                            int i6;
                            BentoTheme bentoTheme;
                            SduiActionHandler<GenericAction> sduiActionHandler4;
                            GoldDepositBoostHubViewState.Loaded loaded2;
                            int i7;
                            Composer composer4 = composer3;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i5 & 17) == 16 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1813001129, i5, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:134)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer4, 6, 1);
                            GoldDepositBoostHubViewState.Loaded loaded3 = loaded;
                            SduiActionHandler<GenericAction> sduiActionHandler5 = sduiActionHandler;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM()), composer4, 0);
                            String disclosureMarkdownToShow = loaded3.getDisclosureMarkdownToShow();
                            composer4.startReplaceGroup(1668426222);
                            if (disclosureMarkdownToShow == null) {
                                bentoTheme = bentoTheme2;
                                sduiActionHandler4 = sduiActionHandler5;
                                i6 = i8;
                                loaded2 = loaded3;
                                i7 = 0;
                            } else {
                                BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                                TextStyle textS = bentoTheme2.getTypography(composer4, i8).getTextS();
                                long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer4, i8).m21426getFg20d7_KjU();
                                long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composer4, i8).m21426getFg20d7_KjU();
                                i6 = i8;
                                bentoTheme = bentoTheme2;
                                sduiActionHandler4 = sduiActionHandler5;
                                loaded2 = loaded3;
                                i7 = 0;
                                composer4 = composer3;
                                BentoMarkdownText2.BentoMarkdownText(disclosureMarkdownToShow, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(textS, TextAlign.INSTANCE.m7919getCentere0LSkKk(), jM21426getFg20d7_KjU, jM21426getFg20d7_KjU2, false, composer3, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, MarkdownStyle.$stable << 6, 26);
                            }
                            composer4.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer4, i6).m21590getDefaultD9Ej5fM()), composer4, i7);
                            final Button<GenericAction> ctaToShow = loaded2.getCtaToShow();
                            composer4.startReplaceGroup(1668446122);
                            if (ctaToShow != null) {
                                SduiActionHandler3.ProvideActionHandler(sduiActionHandler4, ComposableLambda3.rememberComposableLambda(-1039234650, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$1$1$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i9) {
                                        if ((i9 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1039234650, i9, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:150)");
                                        }
                                        SduiButton2.SduiButton(ctaToShow, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer5, 48, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, 48);
                            }
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                            invoke(bentoButtonBar3, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54);
                    final HistoryRowsCallbacks historyRowsCallbacks3 = historyRowsCallbacks2;
                    final Function0<Unit> function03 = function02;
                    final Function1<? super Integer, Unit> function13 = function12;
                    final Modifier modifier5 = modifier4;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(557256644, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$2
                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(557256644, i5, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:159)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                            final Function0<Unit> function04 = function03;
                            final GoldDepositBoostHubViewState.Loaded loaded2 = loaded;
                            LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> lazyPagingItems2 = lazyPagingItems;
                            HistoryRowsCallbacks historyRowsCallbacks4 = historyRowsCallbacks3;
                            final Function1<Integer, Unit> function14 = function13;
                            final SduiActionHandler<GenericAction> sduiActionHandler4 = sduiActionHandler;
                            SduiActionHandler<GoldDepositBoostHubAction> sduiActionHandler5 = sduiActionHandler3;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
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
                            Function2<Composer, Integer, Unit> lambda$1193683841$feature_gold_hub_externalDebug = ComposableSingletons$GoldDepositBoostHubComposableKt.INSTANCE.getLambda$1193683841$feature_gold_hub_externalDebug();
                            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-504399443, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$2$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i6) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i6 & 6) == 0) {
                                        i6 |= (i6 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-504399443, i6, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:163)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova()), function04, composer4, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1193683841$feature_gold_hub_externalDebug, null, composableLambdaRememberComposableLambda3, null, null, false, false, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).getJet()), 0L, null, composer3, 390, 0, 1786);
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer3, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1124261728, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$2$1$2$1
                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1124261728, i7, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:177)");
                                    }
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i8 = BentoTheme.$stable;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme2.getColors(composer4, i8).m21371getBg0d7_KjU(), null, 2, null);
                                    GoldDepositBoostHubViewState.Loaded loaded3 = loaded2;
                                    Function1<Integer, Unit> function15 = function14;
                                    SduiActionHandler<GenericAction> sduiActionHandler6 = sduiActionHandler4;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM4872backgroundbw27NRU$default);
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(loaded3.getGoldDepositBoost().getTitle(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composer4, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i8).getTextM(), composer4, 0, 0, 8188);
                                    Composer composer5 = composer4;
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer5, i8).m21595getXsmallD9Ej5fM()), composer5, 0);
                                    AnimatedAmountContentComposable.AnimatedAmountContentComposable(loaded3.getGoldDepositBoost().getAmount(), CylinderBarConstants.TOTAL_ANIMATION_DURATION_SINGLE, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composer5, 6, 1), composer5, 48, 0);
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer5, i8).m21590getDefaultD9Ej5fM()), composer5, 0);
                                    composer5.startReplaceGroup(1770288280);
                                    if (loaded3.getShowSegmentedControl()) {
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer5, i8).m21593getSmallD9Ej5fM()), composer5, 0);
                                        List<GoldSegmentedControl> segmentedControl = loaded3.getGoldDepositBoost().getSegmentedControl();
                                        composer5.startReplaceGroup(1770293985);
                                        if (segmentedControl != null) {
                                            List<GoldSegmentedControl> list = segmentedControl;
                                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                            Iterator<T> it = list.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(new Segment(null, ((GoldSegmentedControl) it.next()).getTitle(), null, 5, null));
                                            }
                                            BentoSegmentedControl2.BentoSegmentedControl(arrayList, loaded3.getCurrentTab().getIndex(), function15, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer5, 6, 1), false, composer5, 0, 16);
                                            composer5 = composer5;
                                        }
                                        composer5.endReplaceGroup();
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer5, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer5, 0);
                                    }
                                    composer5.endReplaceGroup();
                                    composer5.startReplaceGroup(1770314180);
                                    List<ApiGoldEarningsCylinderChartSegment> chartDataToShow = loaded3.getChartDataToShow();
                                    if (chartDataToShow != null && !chartDataToShow.isEmpty()) {
                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme3.getSpacing(composer5, i9).m21590getDefaultD9Ej5fM()), composer5, 0);
                                        GoldHubCylinderChartComposableKt.m15035GoldHubCylinderChartComposableDzVHIIc(extensions2.toPersistentList(loaded3.getChartDataToShow()), PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_tracker_cylinder_chart_height, composer5, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion6, 0.0f, composer5, 6, 1), true, composer4, 3072, 0);
                                        composer5 = composer4;
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme3.getSpacing(composer5, i9).m21592getMediumD9Ej5fM()), composer5, 0);
                                    }
                                    composer5.endReplaceGroup();
                                    List<GoldEarningsSourceRow> earningsRowListToShow = loaded3.getEarningsRowListToShow();
                                    composer5.startReplaceGroup(1770337623);
                                    if (earningsRowListToShow != null) {
                                        Iterator<T> it2 = earningsRowListToShow.iterator();
                                        while (it2.hasNext()) {
                                            GoldDepositBoostHubComposableKt.GoldHubEarningsRow((GoldEarningsSourceRow) it2.next(), sduiActionHandler6, null, composer5, 0, 4);
                                        }
                                    }
                                    composer5.endReplaceGroup();
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer5, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer5, 0);
                                    composer5.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                            final InfoBanner<GenericAction> bannerToShow = loaded2.getBannerToShow();
                            composer3.startReplaceGroup(1498587857);
                            if (bannerToShow != null) {
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer3, i6).m21592getMediumD9Ej5fM()), composer3, 0);
                                SduiActionHandler3.ProvideActionHandler(sduiActionHandler4, ComposableLambda3.rememberComposableLambda(-1518514770, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$2$1$2$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1518514770, i7, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:229)");
                                        }
                                        SduiInfoBanner2.SduiInfoBanner(bannerToShow, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer4, 6, 1), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 48);
                            }
                            composer3.endReplaceGroup();
                            GoldDepositBoostHubPayoutSection payoutsToShow = loaded2.getPayoutsToShow();
                            composer3.startReplaceGroup(1498602807);
                            if (payoutsToShow != null) {
                                GoldDepositBoostHubComposableKt.PayoutsSection(payoutsToShow, sduiActionHandler5, composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            GoldDepositBoostHubComposableKt.HistorySection(lazyPagingItems2, historyRowsCallbacks4, composer3, LazyPagingItems.$stable);
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54);
                    composer2 = composerStartRestartGroup;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composer2, 3456, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GoldDepositBoostHubComposableKt.GoldDepositBoostHub$lambda$2(loaded, sduiActionHandler, sduiActionHandler2, historyRowsCallbacks, lazyPagingItems, function0, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            modifier2 = modifier;
            if ((4793491 & i3) != 4793490) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-1813001129, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$1
                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i5) {
                        int i6;
                        BentoTheme bentoTheme;
                        SduiActionHandler<GenericAction> sduiActionHandler4;
                        GoldDepositBoostHubViewState.Loaded loaded2;
                        int i7;
                        Composer composer4 = composer3;
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813001129, i5, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:134)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer4, 6, 1);
                        GoldDepositBoostHubViewState.Loaded loaded3 = loaded;
                        SduiActionHandler<GenericAction> sduiActionHandler5 = sduiActionHandler;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM()), composer4, 0);
                        String disclosureMarkdownToShow = loaded3.getDisclosureMarkdownToShow();
                        composer4.startReplaceGroup(1668426222);
                        if (disclosureMarkdownToShow == null) {
                            bentoTheme = bentoTheme2;
                            sduiActionHandler4 = sduiActionHandler5;
                            i6 = i8;
                            loaded2 = loaded3;
                            i7 = 0;
                        } else {
                            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                            TextStyle textS = bentoTheme2.getTypography(composer4, i8).getTextS();
                            long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer4, i8).m21426getFg20d7_KjU();
                            long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composer4, i8).m21426getFg20d7_KjU();
                            i6 = i8;
                            bentoTheme = bentoTheme2;
                            sduiActionHandler4 = sduiActionHandler5;
                            loaded2 = loaded3;
                            i7 = 0;
                            composer4 = composer3;
                            BentoMarkdownText2.BentoMarkdownText(disclosureMarkdownToShow, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(textS, TextAlign.INSTANCE.m7919getCentere0LSkKk(), jM21426getFg20d7_KjU, jM21426getFg20d7_KjU2, false, composer3, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, MarkdownStyle.$stable << 6, 26);
                        }
                        composer4.endReplaceGroup();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer4, i6).m21590getDefaultD9Ej5fM()), composer4, i7);
                        final Button<? extends GenericAction> ctaToShow = loaded2.getCtaToShow();
                        composer4.startReplaceGroup(1668446122);
                        if (ctaToShow != null) {
                            SduiActionHandler3.ProvideActionHandler(sduiActionHandler4, ComposableLambda3.rememberComposableLambda(-1039234650, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$1$1$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i9) {
                                    if ((i9 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1039234650, i9, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:150)");
                                    }
                                    SduiButton2.SduiButton(ctaToShow, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer5, 48, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), composer4, 48);
                        }
                        composer4.endReplaceGroup();
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                        invoke(bentoButtonBar3, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54);
                final HistoryRowsCallbacks historyRowsCallbacks32 = historyRowsCallbacks2;
                final Function0<Unit> function032 = function02;
                final Function1<? super Integer, Unit> function132 = function12;
                final Modifier modifier52 = modifier4;
                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(557256644, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$2
                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(557256644, i5, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:159)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier52, 0.0f, 1, null);
                        final Function0<Unit> function04 = function032;
                        final GoldDepositBoostHubViewState.Loaded loaded2 = loaded;
                        LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> lazyPagingItems2 = lazyPagingItems;
                        HistoryRowsCallbacks historyRowsCallbacks4 = historyRowsCallbacks32;
                        final Function1<? super Integer, Unit> function14 = function132;
                        final SduiActionHandler<? super GenericAction> sduiActionHandler4 = sduiActionHandler;
                        SduiActionHandler<GoldDepositBoostHubAction> sduiActionHandler5 = sduiActionHandler3;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
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
                        Function2<Composer, Integer, Unit> lambda$1193683841$feature_gold_hub_externalDebug = ComposableSingletons$GoldDepositBoostHubComposableKt.INSTANCE.getLambda$1193683841$feature_gold_hub_externalDebug();
                        ComposableLambda composableLambdaRememberComposableLambda32 = ComposableLambda3.rememberComposableLambda(-504399443, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$2$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i6) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i6 & 6) == 0) {
                                    i6 |= (i6 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-504399443, i6, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:163)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova()), function04, composer4, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1193683841$feature_gold_hub_externalDebug, null, composableLambdaRememberComposableLambda32, null, null, false, false, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).getJet()), 0L, null, composer3, 390, 0, 1786);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer3, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1124261728, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$2$1$2$1
                            public final void invoke(Composer composer4, int i7) {
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1124261728, i7, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:177)");
                                }
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme2.getColors(composer4, i8).m21371getBg0d7_KjU(), null, 2, null);
                                GoldDepositBoostHubViewState.Loaded loaded3 = loaded2;
                                Function1<Integer, Unit> function15 = function14;
                                SduiActionHandler<GenericAction> sduiActionHandler6 = sduiActionHandler4;
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM4872backgroundbw27NRU$default);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor3);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(loaded3.getGoldDepositBoost().getTitle(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composer4, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i8).getTextM(), composer4, 0, 0, 8188);
                                Composer composer5 = composer4;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer5, i8).m21595getXsmallD9Ej5fM()), composer5, 0);
                                AnimatedAmountContentComposable.AnimatedAmountContentComposable(loaded3.getGoldDepositBoost().getAmount(), CylinderBarConstants.TOTAL_ANIMATION_DURATION_SINGLE, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composer5, 6, 1), composer5, 48, 0);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer5, i8).m21590getDefaultD9Ej5fM()), composer5, 0);
                                composer5.startReplaceGroup(1770288280);
                                if (loaded3.getShowSegmentedControl()) {
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer5, i8).m21593getSmallD9Ej5fM()), composer5, 0);
                                    List<GoldSegmentedControl> segmentedControl = loaded3.getGoldDepositBoost().getSegmentedControl();
                                    composer5.startReplaceGroup(1770293985);
                                    if (segmentedControl != null) {
                                        List<GoldSegmentedControl> list = segmentedControl;
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                        Iterator<T> it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(new Segment(null, ((GoldSegmentedControl) it.next()).getTitle(), null, 5, null));
                                        }
                                        BentoSegmentedControl2.BentoSegmentedControl(arrayList, loaded3.getCurrentTab().getIndex(), function15, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer5, 6, 1), false, composer5, 0, 16);
                                        composer5 = composer5;
                                    }
                                    composer5.endReplaceGroup();
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer5, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer5, 0);
                                }
                                composer5.endReplaceGroup();
                                composer5.startReplaceGroup(1770314180);
                                List<ApiGoldEarningsCylinderChartSegment> chartDataToShow = loaded3.getChartDataToShow();
                                if (chartDataToShow != null && !chartDataToShow.isEmpty()) {
                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme3.getSpacing(composer5, i9).m21590getDefaultD9Ej5fM()), composer5, 0);
                                    GoldHubCylinderChartComposableKt.m15035GoldHubCylinderChartComposableDzVHIIc(extensions2.toPersistentList(loaded3.getChartDataToShow()), PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_tracker_cylinder_chart_height, composer5, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion6, 0.0f, composer5, 6, 1), true, composer4, 3072, 0);
                                    composer5 = composer4;
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme3.getSpacing(composer5, i9).m21592getMediumD9Ej5fM()), composer5, 0);
                                }
                                composer5.endReplaceGroup();
                                List<GoldEarningsSourceRow> earningsRowListToShow = loaded3.getEarningsRowListToShow();
                                composer5.startReplaceGroup(1770337623);
                                if (earningsRowListToShow != null) {
                                    Iterator<T> it2 = earningsRowListToShow.iterator();
                                    while (it2.hasNext()) {
                                        GoldDepositBoostHubComposableKt.GoldHubEarningsRow((GoldEarningsSourceRow) it2.next(), sduiActionHandler6, null, composer5, 0, 4);
                                    }
                                }
                                composer5.endReplaceGroup();
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer5, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer5, 0);
                                composer5.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        final InfoBanner<? extends GenericAction> bannerToShow = loaded2.getBannerToShow();
                        composer3.startReplaceGroup(1498587857);
                        if (bannerToShow != null) {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer3, i6).m21592getMediumD9Ej5fM()), composer3, 0);
                            SduiActionHandler3.ProvideActionHandler(sduiActionHandler4, ComposableLambda3.rememberComposableLambda(-1518514770, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$GoldDepositBoostHub$1$2$1$2$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1518514770, i7, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHub.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:229)");
                                    }
                                    SduiInfoBanner2.SduiInfoBanner(bannerToShow, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer4, 6, 1), composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                        }
                        composer3.endReplaceGroup();
                        GoldDepositBoostHubPayoutSection payoutsToShow = loaded2.getPayoutsToShow();
                        composer3.startReplaceGroup(1498602807);
                        if (payoutsToShow != null) {
                            GoldDepositBoostHubComposableKt.PayoutsSection(payoutsToShow, sduiActionHandler5, composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        GoldDepositBoostHubComposableKt.HistorySection(lazyPagingItems2, historyRowsCallbacks4, composer3, LazyPagingItems.$stable);
                        composer3.endNode();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                        invoke(boxScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54);
                composer2 = composerStartRestartGroup;
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda22, composer2, 3456, 3);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function12 = function1;
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HistorySection(final LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> lazyPagingItems, final HistoryRowsCallbacks historyRowsCallbacks, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1384433509);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(lazyPagingItems) : composerStartRestartGroup.changedInstance(lazyPagingItems) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(historyRowsCallbacks) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1384433509, i2, -1, "com.robinhood.android.gold.hub.boost.HistorySection (GoldDepositBoostHubComposable.kt:252)");
            }
            boolean z = false;
            Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(Modifier.INSTANCE, 0.0f, PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_history_section_max_height, composerStartRestartGroup, 0), 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(lazyPagingItems))) {
                z = true;
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(historyRowsCallbacks) | z;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldDepositBoostHubComposableKt.HistorySection$lambda$4$lambda$3(lazyPagingItems, historyRowsCallbacks, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM5158heightInVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldDepositBoostHubComposableKt.HistorySection$lambda$5(lazyPagingItems, historyRowsCallbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistorySection$lambda$4$lambda$3(LazyPagingItems lazyPagingItems, final HistoryRowsCallbacks historyRowsCallbacks, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$GoldDepositBoostHubComposableKt.INSTANCE.getLambda$1286100858$feature_gold_hub_externalDebug(), 3, null);
        historySection(LazyColumn, lazyPagingItems, historyRowsCallbacks);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1214397071, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$HistorySection$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                long solLight;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1214397071, i, -1, "com.robinhood.android.gold.hub.boost.HistorySection.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:272)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
                HistoryRowsCallbacks historyRowsCallbacks2 = historyRowsCallbacks;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(historyRowsCallbacks2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new GoldDepositBoostHubComposableKt$HistorySection$1$1$1$1$1(historyRowsCallbacks2);
                    composer.updateRememberedValue(objRememberedValue);
                }
                KFunction kFunction = (KFunction) objRememberedValue;
                composer.endReplaceGroup();
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_show_all, composer, 0);
                if (bentoTheme.getColors(composer, i2).getIsDay()) {
                    composer.startReplaceGroup(-1593290635);
                    solLight = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1593224977);
                    solLight = bentoTheme.getColors(composer, i2).getSolLight();
                    composer.endReplaceGroup();
                }
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) kFunction, strStringResource, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), null, null, false, Color.m6701boximpl(solLight), composer, 0, 56);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldHubEarningsRow(final GoldEarningsSourceRow earningRow, final SduiActionHandler<? super GenericAction> actionHandler, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jM21425getFg0d7_KjU;
        final GenericAction action;
        Modifier modifierM4893clickableXHw0xAI$default;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(earningRow, "earningRow");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-793361518);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(earningRow) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-793361518, i3, -1, "com.robinhood.android.gold.hub.boost.GoldHubEarningsRow (GoldDepositBoostHubComposable.kt:293)");
                }
                if (!StringsKt.equals(earningRow.getType(), "pending", true)) {
                    composerStartRestartGroup.startReplaceGroup(172317131);
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(172359756);
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                final long j = jM21425getFg0d7_KjU;
                action = earningRow.getAction();
                composerStartRestartGroup.startReplaceGroup(2083772617);
                if (action != null) {
                    modifierM4893clickableXHw0xAI$default = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(actionHandler) | composerStartRestartGroup.changedInstance(action);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GoldDepositBoostHubComposableKt.GoldHubEarningsRow$lambda$8$lambda$7$lambda$6(actionHandler, action);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, (Function0) objRememberedValue, 7, null);
                }
                Modifier modifier4 = modifier2;
                Modifier modifier5 = modifierM4893clickableXHw0xAI$default;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(modifier5 != null ? modifier4 : modifier5, null, ComposableLambda3.rememberComposableLambda(-492496562, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt.GoldHubEarningsRow.1
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
                            ComposerKt.traceEventStart(-492496562, i5, -1, "com.robinhood.android.gold.hub.boost.GoldHubEarningsRow.<anonymous> (GoldDepositBoostHubComposable.kt:308)");
                        }
                        AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(earningRow.getAssetPath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer3, 0, 62);
                        ContentScale fillBounds = ContentScale.INSTANCE.getFillBounds();
                        ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_tracker_earning_row_asset_size, composer3, 0)), Alignment.INSTANCE.getCenter(), fillBounds, 0.0f, (ColorFilter) null, composer3, 27696, 96);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(307077967, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt.GoldHubEarningsRow.2
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
                            ComposerKt.traceEventStart(307077967, i5, -1, "com.robinhood.android.gold.hub.boost.GoldHubEarningsRow.<anonymous> (GoldDepositBoostHubComposable.kt:321)");
                        }
                        BentoText2.m20747BentoText38GnDrw(earningRow.getDescription(), null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1906227025, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt.GoldHubEarningsRow.3
                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1906227025, i5, -1, "com.robinhood.android.gold.hub.boost.GoldHubEarningsRow.<anonymous> (GoldDepositBoostHubComposable.kt:328)");
                        }
                        Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                        GoldEarningsSourceRow goldEarningsSourceRow = earningRow;
                        long j2 = j;
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
                        String amount = goldEarningsSourceRow.getAmount();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        TextStyle textM = bentoTheme.getTypography(composer3, i6).getTextM();
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(amount, null, Color.m6701boximpl(j2), null, null, null, TextAlign.m7912boximpl(companion3.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8122);
                        String pendingEarningsText = goldEarningsSourceRow.getPendingEarningsText();
                        composer3.startReplaceGroup(-1011321315);
                        if (pendingEarningsText != null) {
                            BentoText2.m20747BentoText38GnDrw(pendingEarningsText, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 0, 0, 8122);
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
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1589165742, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt.GoldHubEarningsRow.4
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
                            ComposerKt.traceEventStart(-1589165742, i5, -1, "com.robinhood.android.gold.hub.boost.GoldHubEarningsRow.<anonymous> (GoldDepositBoostHubComposable.kt:346)");
                        }
                        ServerToBentoAssetMapper2 trailingIcon = earningRow.getTrailingIcon();
                        if (trailingIcon != null) {
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(trailingIcon), trailingIcon.toString(), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable, 56);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), true, false, false, null, composer2, 14355840, 0, 1810);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldDepositBoostHubComposableKt.GoldHubEarningsRow$lambda$9(earningRow, actionHandler, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!StringsKt.equals(earningRow.getType(), "pending", true)) {
            }
            final long j2 = jM21425getFg0d7_KjU;
            action = earningRow.getAction();
            composerStartRestartGroup.startReplaceGroup(2083772617);
            if (action != null) {
            }
            Modifier modifier42 = modifier2;
            Modifier modifier52 = modifierM4893clickableXHw0xAI$default;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(modifier52 != null ? modifier42 : modifier52, null, ComposableLambda3.rememberComposableLambda(-492496562, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt.GoldHubEarningsRow.1
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
                        ComposerKt.traceEventStart(-492496562, i5, -1, "com.robinhood.android.gold.hub.boost.GoldHubEarningsRow.<anonymous> (GoldDepositBoostHubComposable.kt:308)");
                    }
                    AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(earningRow.getAssetPath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer3, 0, 62);
                    ContentScale fillBounds = ContentScale.INSTANCE.getFillBounds();
                    ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_tracker_earning_row_asset_size, composer3, 0)), Alignment.INSTANCE.getCenter(), fillBounds, 0.0f, (ColorFilter) null, composer3, 27696, 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(307077967, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt.GoldHubEarningsRow.2
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
                        ComposerKt.traceEventStart(307077967, i5, -1, "com.robinhood.android.gold.hub.boost.GoldHubEarningsRow.<anonymous> (GoldDepositBoostHubComposable.kt:321)");
                    }
                    BentoText2.m20747BentoText38GnDrw(earningRow.getDescription(), null, Color.m6701boximpl(j2), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1906227025, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt.GoldHubEarningsRow.3
                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1906227025, i5, -1, "com.robinhood.android.gold.hub.boost.GoldHubEarningsRow.<anonymous> (GoldDepositBoostHubComposable.kt:328)");
                    }
                    Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                    GoldEarningsSourceRow goldEarningsSourceRow = earningRow;
                    long j22 = j2;
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
                    String amount = goldEarningsSourceRow.getAmount();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    TextStyle textM = bentoTheme.getTypography(composer3, i6).getTextM();
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(amount, null, Color.m6701boximpl(j22), null, null, null, TextAlign.m7912boximpl(companion3.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8122);
                    String pendingEarningsText = goldEarningsSourceRow.getPendingEarningsText();
                    composer3.startReplaceGroup(-1011321315);
                    if (pendingEarningsText != null) {
                        BentoText2.m20747BentoText38GnDrw(pendingEarningsText, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 0, 0, 8122);
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
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1589165742, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt.GoldHubEarningsRow.4
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
                        ComposerKt.traceEventStart(-1589165742, i5, -1, "com.robinhood.android.gold.hub.boost.GoldHubEarningsRow.<anonymous> (GoldDepositBoostHubComposable.kt:346)");
                    }
                    ServerToBentoAssetMapper2 trailingIcon = earningRow.getTrailingIcon();
                    if (trailingIcon != null) {
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(trailingIcon), trailingIcon.toString(), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable, 56);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), true, false, false, null, composer2, 14355840, 0, 1810);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHubEarningsRow$lambda$8$lambda$7$lambda$6(SduiActionHandler sduiActionHandler, GenericAction genericAction) {
        sduiActionHandler.mo15941handle(genericAction);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PayoutsSection(final GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection, SduiActionHandler<? super GoldDepositBoostHubAction> sduiActionHandler, Composer composer, final int i) {
        final SduiActionHandler<? super GoldDepositBoostHubAction> sduiActionHandler2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1272059944);
        int i2 = (i & 6) == 0 ? i | (composerStartRestartGroup.changedInstance(goldDepositBoostHubPayoutSection) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1272059944, i2, -1, "com.robinhood.android.gold.hub.boost.PayoutsSection (GoldDepositBoostHubComposable.kt:362)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(goldDepositBoostHubPayoutSection.getTitle(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8186);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            String descriptionMarkdown = goldDepositBoostHubPayoutSection.getDescriptionMarkdown();
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), 0, bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 18);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uriHandler);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldDepositBoostHubComposableKt.PayoutsSection$lambda$16$lambda$15$lambda$11$lambda$10(uriHandler, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoMarkdownText2.BentoMarkdownText(descriptionMarkdown, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, MarkdownStyle.$stable << 6, 10);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1639406861);
            for (GoldDepositBoostHubPayoutInfo goldDepositBoostHubPayoutInfo : goldDepositBoostHubPayoutSection.getPayouts()) {
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
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
                Composer composer2 = composerStartRestartGroup;
                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(goldDepositBoostHubPayoutInfo.getAssetPath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer2, 0, 62), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_payout_asset_width, composer2, 0)), PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_payout_asset_height, composer2, 0)), companion3.getCenter(), ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 27696, 96);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion4, bentoTheme2.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                BentoText2.m20747BentoText38GnDrw(goldDepositBoostHubPayoutInfo.getDate(), null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8186);
                Spacer2.Spacer(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composer2, 0);
                BentoText2.m20747BentoText38GnDrw(goldDepositBoostHubPayoutInfo.getAmount(), null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8122);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            final TextButton<GoldDepositBoostHubAction> cta = goldDepositBoostHubPayoutSection.getCta();
            composerStartRestartGroup.startReplaceGroup(1639456044);
            if (cta == null) {
                sduiActionHandler2 = sduiActionHandler;
            } else {
                sduiActionHandler2 = sduiActionHandler;
                SduiActionHandler3.ProvideActionHandler(sduiActionHandler2, ComposableLambda3.rememberComposableLambda(-842105708, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$PayoutsSection$1$1$3$1
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
                            ComposerKt.traceEventStart(-842105708, i6, -1, "com.robinhood.android.gold.hub.boost.PayoutsSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostHubComposable.kt:420)");
                        }
                        SduiTextButton2.SduiTextButton(cta, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 48);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            Unit unit2 = Unit.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            sduiActionHandler2 = sduiActionHandler;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldDepositBoostHubComposableKt.PayoutsSection$lambda$17(goldDepositBoostHubPayoutSection, sduiActionHandler2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PayoutsSection$lambda$16$lambda$15$lambda$11$lambda$10(UriHandler uriHandler, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        uriHandler.openUri(uri);
        return Unit.INSTANCE;
    }

    public static final void historySection(LazyListScope lazyListScope, LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> lazyPagingItems, final HistoryRowsCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (lazyPagingItems == null || lazyPagingItems.getItemCount() <= 0) {
            return;
        }
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, RangesKt.coerceAtMost(lazyPagingItems.getItemCount(), 2));
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
        Iterator<Integer> it = primitiveRanges2Until.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyPagingItems.get(((PrimitiveIterators6) it).nextInt()));
        }
        final Function2 function2 = new Function2() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GoldDepositBoostHubComposableKt.historySection$lambda$19(((Integer) obj).intValue(), (StatefulHistoryEvent) obj2);
            }
        };
        lazyListScope.items(arrayList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$historySection$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(Integer.valueOf(i), arrayList.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$historySection$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                arrayList.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt$historySection$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
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
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                StatefulHistoryEvent statefulHistoryEvent = (StatefulHistoryEvent) arrayList.get(i);
                composer.startReplaceGroup(363588263);
                HistoryRow4.HistoryRow(statefulHistoryEvent, callbacks, null, false, false, String.valueOf(i), null, composer, 24576, 76);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object historySection$lambda$19(int i, StatefulHistoryEvent statefulHistoryEvent) {
        HistoryEvent historyEvent;
        UUID id;
        return (statefulHistoryEvent == null || (historyEvent = statefulHistoryEvent.getHistoryEvent()) == null || (id = historyEvent.getId()) == null) ? Integer.valueOf(i) : id;
    }
}
