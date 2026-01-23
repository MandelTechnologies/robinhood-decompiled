package com.robinhood.android.futures.eventbrackets.screen.tournament;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.futures.eventbrackets.p141ui.Bracket2;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketHeightCalculationUtils;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketNavigationInfo3;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketRoundData;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketState;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketState7;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketState8;
import com.robinhood.android.futures.eventbrackets.p141ui.EventsList4;
import com.robinhood.android.futures.eventbrackets.p141ui.LoadingCardStack3;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: EventTournamentBracketTabContent.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001aT\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"EventTournamentBracketTabContent", "", "navigationState", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;", "viewState", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketViewState;", "contentBottomPadding", "Landroidx/compose/ui/unit/Dp;", "onCardClick", "Lkotlin/Function1;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "cardId", "modifier", "Landroidx/compose/ui/Modifier;", "EventTournamentBracketTabContent-TN_CM5M", "(Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketViewState;FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ALL_GAMES_TAB_INDEX", "", "LIVE_GAMES_TAB_INDEX", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketTabContentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventTournamentBracketTabContent3 {
    public static final int ALL_GAMES_TAB_INDEX = 0;
    private static final int LIVE_GAMES_TAB_INDEX = 1;

    /* compiled from: EventTournamentBracketTabContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketTabContentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventsTournamentBracketViewState2.values().length];
            try {
                iArr[EventsTournamentBracketViewState2.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventsTournamentBracketViewState2.BRACKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventTournamentBracketTabContent_TN_CM5M$lambda$0(BracketNavigationInfo3 bracketNavigationInfo3, EventsTournamentBracketViewState eventsTournamentBracketViewState, float f, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14600EventTournamentBracketTabContentTN_CM5M(bracketNavigationInfo3, eventsTournamentBracketViewState, f, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventTournamentBracketTabContent_TN_CM5M$lambda$3(BracketNavigationInfo3 bracketNavigationInfo3, EventsTournamentBracketViewState eventsTournamentBracketViewState, float f, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14600EventTournamentBracketTabContentTN_CM5M(bracketNavigationInfo3, eventsTournamentBracketViewState, f, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /* renamed from: EventTournamentBracketTabContent-TN_CM5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14600EventTournamentBracketTabContentTN_CM5M(final BracketNavigationInfo3 navigationState, final EventsTournamentBracketViewState viewState, final float f, final Function1<? super UUID, Unit> onCardClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        BracketState bracketStateRememberBracketState;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-453051927);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(navigationState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCardClick) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-453051927, i4, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketTabContent (EventTournamentBracketTabContent.kt:27)");
                }
                composerStartRestartGroup.startReplaceGroup(-1591196340);
                if (!viewState.getShowContentLoading()) {
                    LoadingCardStack3.LoadingCardStack(modifier4, composerStartRestartGroup, (i4 >> 12) & 14, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier5 = modifier4;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketTabContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EventTournamentBracketTabContent3.EventTournamentBracketTabContent_TN_CM5M$lambda$0(navigationState, viewState, f, onCardClick, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier6 = modifier4;
                composerStartRestartGroup.endReplaceGroup();
                final int iMo5010roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5010roundToPx0680j_4(f);
                composerStartRestartGroup.startReplaceGroup(-1591187248);
                if (viewState.getAllDataViewMode() == EventsTournamentBracketViewState2.BRACKET) {
                    final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    int initialRoundIndex = viewState.getInitialRoundIndex();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(iMo5010roundToPx0680j_4);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new BracketState7() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketTabContentKt$EventTournamentBracketTabContent$bracketState$1$1
                            @Override // com.robinhood.android.futures.eventbrackets.p141ui.BracketState7
                            public final int calculateRoundHeightPx(int i6) {
                                BracketRoundData bracketRoundData = (BracketRoundData) CollectionsKt.getOrNull(viewState.getAllRounds(), i6);
                                return BracketHeightCalculationUtils.cardsTotalHeightPx(density, bracketRoundData != null ? bracketRoundData.getNumberOfCards() : 0) + iMo5010roundToPx0680j_4;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    bracketStateRememberBracketState = BracketState8.rememberBracketState(initialRoundIndex, navigationState, null, null, (BracketState7) objRememberedValue, composerStartRestartGroup, (i4 << 3) & 112, 12);
                } else {
                    bracketStateRememberBracketState = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1591169375);
                LazyListState lazyListStateRememberLazyListState = viewState.getAllDataViewMode() == EventsTournamentBracketViewState2.LIST ? LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3) : null;
                composerStartRestartGroup.endReplaceGroup();
                BracketState bracketState = bracketStateRememberBracketState;
                LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                int selectedTabIndex = viewState.getSelectedTabIndex();
                if (selectedTabIndex != 0) {
                    if (selectedTabIndex == 1) {
                        composerStartRestartGroup.startReplaceGroup(-2079884783);
                        EventsList4.m14653EventsListosbwsH8(lazyListStateRememberLazyListState2, viewState.getLiveGames(), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), onCardClick, Modifier.INSTANCE, EventTournamentBracketTabContent.INSTANCE.m14597getLambda$1930348449$feature_event_brackets_externalDebug(), composerStartRestartGroup, (i4 & 7168) | 221184, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-2079502119);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    modifier3 = modifier6;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-2081354865);
                    EventsTournamentBracketViewState2 allDataViewMode = viewState.getAllDataViewMode();
                    int i6 = allDataViewMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[allDataViewMode.ordinal()];
                    if (i6 == -1) {
                        modifier3 = modifier6;
                        composerStartRestartGroup.startReplaceGroup(-2080017897);
                        LoadingCardStack3.LoadingCardStack(modifier3, composerStartRestartGroup, (i4 >> 12) & 14, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i6 == 1) {
                        modifier3 = modifier6;
                        composerStartRestartGroup.startReplaceGroup(-2081296151);
                        if (lazyListStateRememberLazyListState != null) {
                            int i7 = i4 << 3;
                            EventsList4.m14651AllEventsListjIwJxvA(lazyListStateRememberLazyListState, viewState.getAllRounds(), navigationState, C2002Dp.m7995constructorimpl(f + BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), onCardClick, modifier3, composerStartRestartGroup, ((i4 << 6) & 896) | (57344 & i7) | (i7 & 458752), 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i6 != 2) {
                            composerStartRestartGroup.startReplaceGroup(-1591160709);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-2080722279);
                        if (viewState.getAllRounds().isEmpty()) {
                            composerStartRestartGroup.startReplaceGroup(-2080685265);
                            LoadingCardStack3.LoadingCardStack(modifier6, composerStartRestartGroup, (i4 >> 12) & 14, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            modifier3 = modifier6;
                        } else if (bracketState != null) {
                            composerStartRestartGroup.startReplaceGroup(-2080566194);
                            ImmutableList3<BracketRoundData> allRounds = viewState.getAllRounds();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            modifier3 = modifier6;
                            Bracket2.m14627BracketTN_CM5M(bracketState, allRounds, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM() + f), onCardClick, SizeKt.fillMaxSize$default(PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), composerStartRestartGroup, i4 & 7168, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            modifier3 = modifier6;
                            composerStartRestartGroup.startReplaceGroup(-2080063591);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier7 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventTournamentBracketTabContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventTournamentBracketTabContent3.EventTournamentBracketTabContent_TN_CM5M$lambda$3(navigationState, viewState, f, onCardClick, modifier7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1591196340);
            if (!viewState.getShowContentLoading()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
