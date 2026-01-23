package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListParams;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewSection5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.event.gamedetail.GameDetailViewState;
import com.robinhood.android.event.gamedetail.callbacks.ChartCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks;
import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.android.event.gamedetail.components.GameDetailPrepacks3;
import com.robinhood.android.event.gamedetail.components.PrepacksState;
import com.robinhood.android.event.gamedetail.p130ui.chart.GameDetailChartKt;
import com.robinhood.android.event.gamedetail.p130ui.position.GameDetailPositionRowState;
import com.robinhood.android.event.gamedetail.p130ui.props.PlayerPropsSection;
import com.robinhood.android.event.gamedetail.p130ui.props.PlayerPropsState;
import com.robinhood.android.event.gamedetail.p130ui.toolbar.GameDetailDisplayDataBottomSheet;
import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.android.eventcontracts.sharedeventui.EventDetailTradingProhibitionsSection;
import com.robinhood.android.eventcontracts.sharedeventui.timeline.EventTimelineSection2;
import com.robinhood.android.eventcontracts.sharedeventui.util.EventContractHistoryFilterState;
import com.robinhood.android.futures.sharedfuturesui.MarketClosedHeader;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailContent.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0096\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00030\u00112!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00030\u00112!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00030\u00112#\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\b\b\u0002\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\u0010\"\u001a\u0014\u0010#\u001a\u00020\u0003*\u00020$2\u0006\u0010%\u001a\u00020\u000fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"FadeAnimationSpeed", "", "GameDetailContent", "", "viewState", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState;", "callbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;", "chartCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;", "commonCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "showDisplayDataSheet", "", "onPositionSelected", "Lkotlin/Function1;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "contractId", "onContractSelected", "Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "contractOptionData", "onContractUnSelected", "onContractLongPress", "onDataSheetDismissed", "Lkotlin/Function0;", "onPropCategoryClick", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "onPropsViewAllToggle", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/gamedetail/GameDetailViewState;Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;Landroidx/compose/foundation/lazy/LazyListState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "logAmericanOddsChange", "Lcom/robinhood/analytics/EventLogger;", "isChecked", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class GameDetailContentKt {
    private static final int FadeAnimationSpeed = 1000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailContent$lambda$17(GameDetailViewState gameDetailViewState, GameDetailScreenCallbacks gameDetailScreenCallbacks, ChartCallbacks chartCallbacks, GdpCommonCallbacks gdpCommonCallbacks, LazyListState lazyListState, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function1 function15, Function0 function02, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        GameDetailContent(gameDetailViewState, gameDetailScreenCallbacks, chartCallbacks, gdpCommonCallbacks, lazyListState, z, function1, function12, function13, function14, function0, function15, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailContent(final GameDetailViewState viewState, final GameDetailScreenCallbacks callbacks, final ChartCallbacks chartCallbacks, final GdpCommonCallbacks commonCallbacks, final LazyListState listState, final boolean z, final Function1<? super UUID, Unit> onPositionSelected, final Function1<? super ContractOptionData, Unit> onContractSelected, final Function1<? super ContractOptionData, Unit> onContractUnSelected, final Function1<? super ContractOptionData, Unit> function1, final Function0<Unit> onDataSheetDismissed, final Function1<? super Integer, Unit> onPropCategoryClick, final Function0<Unit> onPropsViewAllToggle, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        ImmutableList<GameDetailPositionRowState> positions;
        Function1<LazyListScope, Unit> function1GameDetailPositions;
        final EventContractHistoryFilterState historyFilter;
        Function1<LazyListScope, Unit> function1HistoryPreviewSection;
        Composer composer2;
        int currentCompositeKeyHash;
        Modifier modifier2;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        GameDetailScreenCallbacks gameDetailScreenCallbacks;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        int i8;
        Composer composer3;
        int i9;
        EventLogger eventLogger;
        FiniteAnimationSpec finiteAnimationSpec;
        boolean z4;
        int i10;
        final GameDetailViewState gameDetailViewState;
        Object objRememberedValue2;
        Composer.Companion companion;
        Object objRememberedValue3;
        final GdpCommonCallbacks gdpCommonCallbacks;
        boolean z5;
        final EventLogger eventLogger2;
        boolean zChangedInstance;
        Object objRememberedValue4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Intrinsics.checkNotNullParameter(commonCallbacks, "commonCallbacks");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(onPositionSelected, "onPositionSelected");
        Intrinsics.checkNotNullParameter(onContractSelected, "onContractSelected");
        Intrinsics.checkNotNullParameter(onContractUnSelected, "onContractUnSelected");
        Intrinsics.checkNotNullParameter(onDataSheetDismissed, "onDataSheetDismissed");
        Intrinsics.checkNotNullParameter(onPropCategoryClick, "onPropCategoryClick");
        Intrinsics.checkNotNullParameter(onPropsViewAllToggle, "onPropsViewAllToggle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1036937032);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i15 = i4;
        if ((i3 & 4) != 0) {
            i15 |= 384;
        } else if ((i & 384) == 0) {
            i15 |= (i & 512) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i15 |= 3072;
        } else if ((i & 3072) == 0) {
            i15 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(commonCallbacks) : composerStartRestartGroup.changedInstance(commonCallbacks) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i15 |= 24576;
        } else if ((i & 24576) == 0) {
            i15 |= composerStartRestartGroup.changed(listState) ? 16384 : 8192;
        }
        if ((i3 & 32) == 0) {
            i14 = (196608 & i) == 0 ? composerStartRestartGroup.changed(z) ? 131072 : 65536 : 196608;
            if ((i3 & 64) != 0) {
                i13 = (1572864 & i) == 0 ? composerStartRestartGroup.changedInstance(onPositionSelected) ? 1048576 : 524288 : 1572864;
                if ((i3 & 128) == 0) {
                    i12 = (12582912 & i) == 0 ? composerStartRestartGroup.changedInstance(onContractSelected) ? 8388608 : 4194304 : 12582912;
                    if ((i3 & 256) != 0) {
                        i11 = (100663296 & i) == 0 ? composerStartRestartGroup.changedInstance(onContractUnSelected) ? 67108864 : 33554432 : 100663296;
                        if ((i3 & 512) != 0) {
                            i15 |= 805306368;
                        } else {
                            if ((805306368 & i) == 0) {
                                i15 |= composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i5 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i5 = i2 | (composerStartRestartGroup.changedInstance(onDataSheetDismissed) ? 4 : 2);
                            } else {
                                i5 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i5 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i5 |= composerStartRestartGroup.changedInstance(onPropCategoryClick) ? 32 : 16;
                            }
                            if ((i3 & 4096) == 0) {
                                i5 |= 384;
                            } else {
                                if ((i2 & 384) == 0) {
                                    i5 |= composerStartRestartGroup.changedInstance(onPropsViewAllToggle) ? 256 : 128;
                                }
                                i6 = i3 & 8192;
                                if (i6 == 0) {
                                    i7 = i6;
                                    if ((i2 & 3072) == 0) {
                                        i5 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
                                    }
                                    if ((i15 & 306783379) != 306783378 && (i5 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        gameDetailViewState = viewState;
                                        gdpCommonCallbacks = commonCallbacks;
                                    } else {
                                        Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1036937032, i15, i5, "com.robinhood.android.event.gamedetail.ui.GameDetailContent (GameDetailContent.kt:75)");
                                        }
                                        GameDetailViewState.PositionState positionState = viewState.getPositionState();
                                        positions = positionState == null ? positionState.getPositions() : null;
                                        composerStartRestartGroup.startReplaceGroup(-64046936);
                                        if (positions != null) {
                                            function1GameDetailPositions = null;
                                        } else {
                                            composerStartRestartGroup.startReplaceGroup(5004770);
                                            boolean z6 = (3670016 & i15) == 1048576;
                                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (z6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return GameDetailContentKt.GameDetailContent$lambda$2$lambda$1$lambda$0(onPositionSelected, (UUID) obj);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            function1GameDetailPositions = GameDetailPositions4.GameDetailPositions(positions, (Function1) objRememberedValue5, composerStartRestartGroup, 0);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        final EventContractHistoryFilterState upcomingActivityFilter = viewState.getUpcomingActivityFilter();
                                        composerStartRestartGroup.startReplaceGroup(-64040846);
                                        Function1<LazyListScope, Unit> function1HistoryPreviewSection2 = upcomingActivityFilter != null ? null : HistoryPreviewSection5.historyPreviewSection(upcomingActivityFilter.getListParams(), false, ComposableSingletons$GameDetailContentKt.INSTANCE.getLambda$1369788271$feature_game_detail_externalDebug(), ComposableLambda3.rememberComposableLambda(1401347888, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$upcomingActivitySection$1$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer4, Integer num) {
                                                invoke(lazyItemScope, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(LazyItemScope historyPreviewSection, Composer composer4, int i16) {
                                                Intrinsics.checkNotNullParameter(historyPreviewSection, "$this$historyPreviewSection");
                                                if ((i16 & 17) == 16 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1401347888, i16, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous> (GameDetailContent.kt:87)");
                                                }
                                                HistoryRowsKt.DefaultHistoryFooter(null, null, upcomingActivityFilter.getFooterKey(), composer4, 0, 3);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), null, "gdp_upcoming_activity_preview_", null, composerStartRestartGroup, HistoryPreviewListParams.$stable | 200112, 80);
                                        composerStartRestartGroup.endReplaceGroup();
                                        historyFilter = viewState.getHistoryFilter();
                                        composerStartRestartGroup.startReplaceGroup(-64026940);
                                        if (historyFilter != null) {
                                            composer2 = composerStartRestartGroup;
                                            function1HistoryPreviewSection = null;
                                        } else {
                                            function1HistoryPreviewSection = HistoryPreviewSection5.historyPreviewSection(historyFilter.getListParams(), false, ComposableSingletons$GameDetailContentKt.INSTANCE.m14223getLambda$901874962$feature_game_detail_externalDebug(), ComposableLambda3.rememberComposableLambda(-1357707537, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$previewHistorySection$1$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer4, Integer num) {
                                                    invoke(lazyItemScope, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope historyPreviewSection, Composer composer4, int i16) {
                                                    Intrinsics.checkNotNullParameter(historyPreviewSection, "$this$historyPreviewSection");
                                                    if ((i16 & 17) == 16 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1357707537, i16, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous> (GameDetailContent.kt:97)");
                                                    }
                                                    HistoryRowsKt.DefaultHistoryFooter(null, null, historyFilter.getFooterKey(), composer4, 0, 3);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composerStartRestartGroup, 54), null, "gdp_history_preview_", null, composerStartRestartGroup, HistoryPreviewListParams.$stable | 200112, 80);
                                            composer2 = composerStartRestartGroup;
                                        }
                                        composer2.endReplaceGroup();
                                        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier3);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        modifier2 = modifier3;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer2.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.useNode();
                                        } else {
                                            composer2.createNode(constructor);
                                        }
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer2.startReplaceGroup(-1224400529);
                                        int i16 = i15 & 7168;
                                        boolean zChangedInstance2 = composer2.changedInstance(viewState) | ((i15 & 896) != 256 || ((i15 & 512) != 0 && composer2.changedInstance(chartCallbacks))) | composer2.changed(function1HistoryPreviewSection2) | composer2.changed(function1GameDetailPositions) | ((29360128 & i15) != 8388608) | ((234881024 & i15) != 67108864) | ((1879048192 & i15) != 536870912) | ((i5 & 112) != 32) | ((i5 & 896) != 256) | composer2.changed(function1HistoryPreviewSection) | (i16 != 2048 || ((i15 & 4096) != 0 && composer2.changedInstance(commonCallbacks)));
                                        if ((i15 & 112) == 32) {
                                            if ((i15 & 64) != 0) {
                                                gameDetailScreenCallbacks = callbacks;
                                                if (composer2.changedInstance(gameDetailScreenCallbacks)) {
                                                }
                                                z3 = zChangedInstance2 | z2;
                                                objRememberedValue = composer2.rememberedValue();
                                                if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    i8 = i5;
                                                    final Function1<LazyListScope, Unit> function12 = function1GameDetailPositions;
                                                    final Function1<LazyListScope, Unit> function13 = function1HistoryPreviewSection;
                                                    composer3 = composer2;
                                                    i9 = i15;
                                                    eventLogger = current;
                                                    finiteAnimationSpec = null;
                                                    z4 = false;
                                                    i10 = i16;
                                                    final GameDetailScreenCallbacks gameDetailScreenCallbacks2 = gameDetailScreenCallbacks;
                                                    final Function1<LazyListScope, Unit> function14 = function1HistoryPreviewSection2;
                                                    Function1 function15 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return GameDetailContentKt.GameDetailContent$lambda$16$lambda$9$lambda$8(function14, function12, viewState, function13, chartCallbacks, onContractSelected, onContractUnSelected, function1, onPropCategoryClick, onPropsViewAllToggle, commonCallbacks, gameDetailScreenCallbacks2, (LazyListScope) obj);
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(function15);
                                                    objRememberedValue = function15;
                                                } else {
                                                    i8 = i5;
                                                    composer3 = composer2;
                                                    i9 = i15;
                                                    eventLogger = current;
                                                    finiteAnimationSpec = null;
                                                    z4 = false;
                                                    i10 = i16;
                                                }
                                                composer3.endReplaceGroup();
                                                composerStartRestartGroup = composer3;
                                                gameDetailViewState = viewState;
                                                LazyDslKt.LazyColumn(null, listState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i9 >> 9) & 112, 509);
                                                Modifier modifierAlign = boxScopeInstance.align(Modifier.INSTANCE, companion2.getBottomCenter());
                                                boolean z7 = gameDetailViewState.getMarketClosedBanner() == null ? true : z4;
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                companion = Composer.INSTANCE;
                                                if (objRememberedValue2 == companion.getEmpty()) {
                                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$$ExternalSyntheticLambda2
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return Integer.valueOf(GameDetailContentKt.GameDetailContent$lambda$16$lambda$11$lambda$10(((Integer) obj).intValue()));
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(finiteAnimationSpec, (Function1) objRememberedValue2, 1, finiteAnimationSpec);
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue3 == companion.getEmpty()) {
                                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return Integer.valueOf(GameDetailContentKt.GameDetailContent$lambda$16$lambda$13$lambda$12(((Integer) obj).intValue()));
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                AnimatedVisibilityKt.AnimatedVisibility(z7, modifierAlign, enterTransitionSlideInVertically$default, EnterExitTransitionKt.slideOutVertically$default(finiteAnimationSpec, (Function1) objRememberedValue3, 1, finiteAnimationSpec), (String) null, ComposableLambda3.rememberComposableLambda(-2144810986, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$1$4
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                                        invoke(animatedVisibilityScope, composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i17) {
                                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2144810986, i17, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous> (GameDetailContent.kt:265)");
                                                        }
                                                        StringResource marketClosedBanner = gameDetailViewState.getMarketClosedBanner();
                                                        if (marketClosedBanner != null) {
                                                            MarketClosedHeader.MarketClosedHeader(marketClosedBanner, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer4, StringResource.$stable | 48, 0);
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
                                                composerStartRestartGroup.startReplaceGroup(-1018259746);
                                                if (z) {
                                                    gdpCommonCallbacks = commonCallbacks;
                                                } else {
                                                    boolean showAmericanOdds = gameDetailViewState.getShowAmericanOdds();
                                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                                    if (i10 != 2048) {
                                                        gdpCommonCallbacks = commonCallbacks;
                                                        if ((i9 & 4096) == 0 || !composerStartRestartGroup.changedInstance(gdpCommonCallbacks)) {
                                                            z5 = z4;
                                                        }
                                                        eventLogger2 = eventLogger;
                                                        zChangedInstance = composerStartRestartGroup.changedInstance(eventLogger2) | z5;
                                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                        if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                                                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$$ExternalSyntheticLambda4
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    return GameDetailContentKt.GameDetailContent$lambda$16$lambda$15$lambda$14(gdpCommonCallbacks, eventLogger2, ((Boolean) obj).booleanValue());
                                                                }
                                                            };
                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                        }
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        GameDetailDisplayDataBottomSheet.GameDetailDisplayDataBottomSheet((Function1) objRememberedValue4, onDataSheetDismissed, showAmericanOdds, null, null, composerStartRestartGroup, (i8 << 3) & 112, 24);
                                                    } else {
                                                        gdpCommonCallbacks = commonCallbacks;
                                                    }
                                                    z5 = true;
                                                    eventLogger2 = eventLogger;
                                                    zChangedInstance = composerStartRestartGroup.changedInstance(eventLogger2) | z5;
                                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                    if (!zChangedInstance) {
                                                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$$ExternalSyntheticLambda4
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                return GameDetailContentKt.GameDetailContent$lambda$16$lambda$15$lambda$14(gdpCommonCallbacks, eventLogger2, ((Boolean) obj).booleanValue());
                                                            }
                                                        };
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        GameDetailDisplayDataBottomSheet.GameDetailDisplayDataBottomSheet((Function1) objRememberedValue4, onDataSheetDismissed, showAmericanOdds, null, null, composerStartRestartGroup, (i8 << 3) & 112, 24);
                                                    }
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                composerStartRestartGroup.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                gameDetailScreenCallbacks = callbacks;
                                            }
                                            z2 = false;
                                            z3 = zChangedInstance2 | z2;
                                            objRememberedValue = composer2.rememberedValue();
                                            if (z3) {
                                                i8 = i5;
                                                final Function1 function122 = function1GameDetailPositions;
                                                final Function1 function132 = function1HistoryPreviewSection;
                                                composer3 = composer2;
                                                i9 = i15;
                                                eventLogger = current;
                                                finiteAnimationSpec = null;
                                                z4 = false;
                                                i10 = i16;
                                                final GameDetailScreenCallbacks gameDetailScreenCallbacks22 = gameDetailScreenCallbacks;
                                                final Function1 function142 = function1HistoryPreviewSection2;
                                                Function1 function152 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return GameDetailContentKt.GameDetailContent$lambda$16$lambda$9$lambda$8(function142, function122, viewState, function132, chartCallbacks, onContractSelected, onContractUnSelected, function1, onPropCategoryClick, onPropsViewAllToggle, commonCallbacks, gameDetailScreenCallbacks22, (LazyListScope) obj);
                                                    }
                                                };
                                                composer3.updateRememberedValue(function152);
                                                objRememberedValue = function152;
                                                composer3.endReplaceGroup();
                                                composerStartRestartGroup = composer3;
                                                gameDetailViewState = viewState;
                                                LazyDslKt.LazyColumn(null, listState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i9 >> 9) & 112, 509);
                                                Modifier modifierAlign2 = boxScopeInstance.align(Modifier.INSTANCE, companion2.getBottomCenter());
                                                if (gameDetailViewState.getMarketClosedBanner() == null) {
                                                }
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                companion = Composer.INSTANCE;
                                                if (objRememberedValue2 == companion.getEmpty()) {
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                EnterTransition enterTransitionSlideInVertically$default2 = EnterExitTransitionKt.slideInVertically$default(finiteAnimationSpec, (Function1) objRememberedValue2, 1, finiteAnimationSpec);
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue3 == companion.getEmpty()) {
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                AnimatedVisibilityKt.AnimatedVisibility(z7, modifierAlign2, enterTransitionSlideInVertically$default2, EnterExitTransitionKt.slideOutVertically$default(finiteAnimationSpec, (Function1) objRememberedValue3, 1, finiteAnimationSpec), (String) null, ComposableLambda3.rememberComposableLambda(-2144810986, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$1$4
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                                        invoke(animatedVisibilityScope, composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i17) {
                                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2144810986, i17, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous> (GameDetailContent.kt:265)");
                                                        }
                                                        StringResource marketClosedBanner = gameDetailViewState.getMarketClosedBanner();
                                                        if (marketClosedBanner != null) {
                                                            MarketClosedHeader.MarketClosedHeader(marketClosedBanner, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer4, StringResource.$stable | 48, 0);
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
                                                composerStartRestartGroup.startReplaceGroup(-1018259746);
                                                if (z) {
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                composerStartRestartGroup.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                            }
                                        } else {
                                            gameDetailScreenCallbacks = callbacks;
                                        }
                                        z2 = true;
                                        z3 = zChangedInstance2 | z2;
                                        objRememberedValue = composer2.rememberedValue();
                                        if (z3) {
                                        }
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        final GdpCommonCallbacks gdpCommonCallbacks2 = gdpCommonCallbacks;
                                        final GameDetailViewState gameDetailViewState2 = gameDetailViewState;
                                        final Modifier modifier4 = modifier2;
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return GameDetailContentKt.GameDetailContent$lambda$17(gameDetailViewState2, callbacks, chartCallbacks, gdpCommonCallbacks2, listState, z, onPositionSelected, onContractSelected, onContractUnSelected, function1, onDataSheetDismissed, onPropCategoryClick, onPropsViewAllToggle, modifier4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i5 |= 3072;
                                i7 = i6;
                                if ((i15 & 306783379) != 306783378) {
                                    if (i7 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    GameDetailViewState.PositionState positionState2 = viewState.getPositionState();
                                    if (positionState2 == null) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-64046936);
                                    if (positions != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    final EventContractHistoryFilterState upcomingActivityFilter2 = viewState.getUpcomingActivityFilter();
                                    composerStartRestartGroup.startReplaceGroup(-64040846);
                                    if (upcomingActivityFilter2 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    historyFilter = viewState.getHistoryFilter();
                                    composerStartRestartGroup.startReplaceGroup(-64026940);
                                    if (historyFilter != null) {
                                    }
                                    composer2.endReplaceGroup();
                                    EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                                    Alignment.Companion companion22 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifier3);
                                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                    modifier2 = modifier3;
                                    Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                                    if (composer2.getApplier() == null) {
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        composer2.startReplaceGroup(-1224400529);
                                        if ((i15 & 896) != 256) {
                                            int i162 = i15 & 7168;
                                            if (i162 != 2048) {
                                                boolean zChangedInstance22 = composer2.changedInstance(viewState) | ((i15 & 896) != 256 || ((i15 & 512) != 0 && composer2.changedInstance(chartCallbacks))) | composer2.changed(function1HistoryPreviewSection2) | composer2.changed(function1GameDetailPositions) | ((29360128 & i15) != 8388608) | ((234881024 & i15) != 67108864) | ((1879048192 & i15) != 536870912) | ((i5 & 112) != 32) | ((i5 & 896) != 256) | composer2.changed(function1HistoryPreviewSection) | (i162 != 2048 || ((i15 & 4096) != 0 && composer2.changedInstance(commonCallbacks)));
                                                if ((i15 & 112) == 32) {
                                                }
                                                z2 = true;
                                                z3 = zChangedInstance22 | z2;
                                                objRememberedValue = composer2.rememberedValue();
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
                            i6 = i3 & 8192;
                            if (i6 == 0) {
                            }
                            if ((i15 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        if ((i3 & 4096) == 0) {
                        }
                        i6 = i3 & 8192;
                        if (i6 == 0) {
                        }
                        if ((i15 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i15 |= i11;
                    if ((i3 & 512) != 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    if ((i3 & 4096) == 0) {
                    }
                    i6 = i3 & 8192;
                    if (i6 == 0) {
                    }
                    if ((i15 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i15 |= i12;
                if ((i3 & 256) != 0) {
                }
                i15 |= i11;
                if ((i3 & 512) != 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                i6 = i3 & 8192;
                if (i6 == 0) {
                }
                if ((i15 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i15 |= i13;
            if ((i3 & 128) == 0) {
            }
            i15 |= i12;
            if ((i3 & 256) != 0) {
            }
            i15 |= i11;
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            i6 = i3 & 8192;
            if (i6 == 0) {
            }
            if ((i15 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i15 |= i14;
        if ((i3 & 64) != 0) {
        }
        i15 |= i13;
        if ((i3 & 128) == 0) {
        }
        i15 |= i12;
        if ((i3 & 256) != 0) {
        }
        i15 |= i11;
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        i6 = i3 & 8192;
        if (i6 == 0) {
        }
        if ((i15 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailContent$lambda$2$lambda$1$lambda$0(Function1 function1, UUID uuid) {
        function1.invoke(uuid);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailContent$lambda$16$lambda$9$lambda$8(Function1 function1, Function1 function12, final GameDetailViewState gameDetailViewState, Function1 function13, final ChartCallbacks chartCallbacks, final Function1 function14, final Function1 function15, final Function1 function16, final Function1 function17, final Function0 function0, GdpCommonCallbacks gdpCommonCallbacks, GameDetailScreenCallbacks gameDetailScreenCallbacks, LazyListScope LazyColumn) {
        final Function1 function18;
        final Function1 function19;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1194924819, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$1$1$1$1
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
                    ComposerKt.traceEventStart(1194924819, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GameDetailContent.kt:107)");
                }
                InfoBannerComponent.InfoBannerComponent(gameDetailViewState.getIndividualAccountNumber(), IacInfoBannerLocation.INFO_BANNER_EVENTS_DETAIL_PAGE_MOBILE_TOP_LEVEL, null, gameDetailViewState.getEventId(), null, null, null, null, null, null, null, null, null, composer, 48, 0, 8180);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1692034634, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$1$1$1$2
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
                    ComposerKt.traceEventStart(1692034634, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GameDetailContent.kt:115)");
                }
                GameDetailDuelContractsHeader3.GameDetailDuelContractsHeader(gameDetailViewState.getHeaderState(), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        ComposableSingletons$GameDetailContentKt composableSingletons$GameDetailContentKt = ComposableSingletons$GameDetailContentKt.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$GameDetailContentKt.getLambda$1930901067$feature_game_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-2125199796, true, new GameDetailContentKt$GameDetailContent$1$1$1$3(gameDetailViewState)), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1886333363, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$1$1$1$4
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
                    ComposerKt.traceEventStart(-1886333363, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GameDetailContent.kt:149)");
                }
                GameDetailChartKt.GameDetailChart(gameDetailViewState.getChartState(), gameDetailViewState.getVolumeState(), chartCallbacks, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(36), 7, null), composer, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        if (function1 != null) {
            function1.invoke(LazyColumn);
        }
        if (function12 != null) {
            function12.invoke(LazyColumn);
        }
        final GameDetailViewState.SixBoxState sixBoxState = gameDetailViewState.getSixBoxState();
        if (sixBoxState != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(704111726, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$1$1$1$5$1
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
                        ComposerKt.traceEventStart(704111726, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GameDetailContent.kt:165)");
                    }
                    GameSixBox.GameSixBox(sixBoxState, function14, function15, function16, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 1, null), composer, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        final PlayerPropsState playerPropsState = gameDetailViewState.getPlayerPropsState();
        if (playerPropsState != null) {
            function18 = function14;
            function19 = function15;
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1613815645, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$1$1$1$6$1
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
                        ComposerKt.traceEventStart(1613815645, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GameDetailContent.kt:177)");
                    }
                    PlayerPropsSection.PlayerPropsSection(playerPropsState, function17, function14, function15, function16, function0, ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), new UserInteractionEventDescriptor(EventAnalyticsString.GAME_DETAIL_PAGE_PROPS_HEADER, null, null, null, new Component(Component.ComponentType.SECTION_HEADER, EventAnalyticsString.GAME_DETAIL_PAGE_PROPS_HEADER, null, 4, null), null, 46, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), composer, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        } else {
            function18 = function14;
            function19 = function15;
        }
        final PrepacksState prepacksState = gameDetailViewState.getPrepacksState();
        if (prepacksState != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(774047874, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$1$1$1$7$1
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
                        ComposerKt.traceEventStart(774047874, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GameDetailContent.kt:202)");
                    }
                    GameDetailPrepacks3.GameDetailPrepacks(prepacksState, function18, function19, ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), new UserInteractionEventDescriptor(EventAnalyticsString.GAME_DETAIL_PAGE_PREPACKS_HEADER, null, null, null, new Component(Component.ComponentType.SECTION_HEADER, EventAnalyticsString.GAME_DETAIL_PAGE_PREPACKS_HEADER, null, 4, null), null, 46, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), composer, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1647466930, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$1$1$1$8
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
                    ComposerKt.traceEventStart(-1647466930, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GameDetailContent.kt:223)");
                }
                EventTimelineSection2.EventContractTimelineSection(gameDetailViewState.getTimeline(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        if (function13 != null) {
            function13.invoke(LazyColumn);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1408600497, true, new GameDetailContentKt$GameDetailContent$1$1$1$9(gameDetailViewState, gdpCommonCallbacks, gameDetailScreenCallbacks)), 3, null);
        if (gameDetailViewState.getTradingProhibitionRules() != null && (!r0.isEmpty())) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1899966354, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$1$1$1$10
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
                        ComposerKt.traceEventStart(-1899966354, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GameDetailContent.kt:245)");
                    }
                    EventDetailTradingProhibitionsSection.EventDetailTradingProhibitionsSection(gameDetailViewState.getTradingProhibitionRules(), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 1, null), composer, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$GameDetailContentKt.m14222getLambda$1169734064$feature_game_detail_externalDebug(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GameDetailContent$lambda$16$lambda$11$lambda$10(int i) {
        return i / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GameDetailContent$lambda$16$lambda$13$lambda$12(int i) {
        return i / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailContent$lambda$16$lambda$15$lambda$14(GdpCommonCallbacks gdpCommonCallbacks, EventLogger eventLogger, boolean z) {
        gdpCommonCallbacks.onAmericanOddsChanged(z);
        logAmericanOddsChange(eventLogger, z);
        return Unit.INSTANCE;
    }

    private static final void logAmericanOddsChange(EventLogger eventLogger, boolean z) {
        UserInteractionEventData.Action action;
        Screen screen = new Screen(Screen.Name.GAME_DETAIL_PAGE, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.TOGGLE, EventAnalyticsString.GAME_DETAIL_PAGE_AMERICAN_ODDS_TOGGLE, null, 4, null);
        if (z) {
            action = UserInteractionEventData.Action.TOGGLE_ON;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            action = UserInteractionEventData.Action.TOGGLE_OFF;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, null, false, 56, null);
    }
}
