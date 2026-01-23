package com.robinhood.shared.portfolio.listsswipenux;

import android.content.SharedPreferences;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.WatchlistPositionsTabSwipeToTradeRegionGate;
import com.robinhood.android.regiongate.WatchlistTabRegionGate;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.shared.store.history.HistoryStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: SwipeNuxModule.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxModule;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "preferences", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "provideEquityWatchlistSwipeNuxProvider", "(Landroid/content/SharedPreferences;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/store/history/HistoryStore;Lj$/time/Clock;)Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "provideFuturesPositionsSwipeNuxProvider", "lib-lists-swipe-nux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SwipeNuxModule {
    public static final SwipeNuxModule INSTANCE = new SwipeNuxModule();

    private SwipeNuxModule() {
    }

    @SwipeContextKey(context = SwipeContext.EQUITY_WATCHLIST)
    public final SwipeNuxProvider provideEquityWatchlistSwipeNuxProvider(@UserPrefs SharedPreferences preferences, final RegionGateProvider regionGateProvider, HistoryStore historyStore, Clock clock) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        SwipeContext swipeContext = SwipeContext.EQUITY_WATCHLIST;
        return new SwipeNuxProvider(swipeContext, new StringPreference(preferences, swipeContext.getPrefixKey() + "_peek_last_shown", null, null, 12, null), new IntPreference(preferences, swipeContext.getPrefixKey() + "_peek_count", 0, 4, null), new StringPreference(preferences, swipeContext.getPrefixKey() + "_last_swipe", null, null, 12, null), new StringPreference(preferences, swipeContext.getPrefixKey() + "_tooltip_last_shown", null, null, 12, null), new SwipeNuxGateProvider() { // from class: com.robinhood.shared.portfolio.listsswipenux.SwipeNuxModule.provideEquityWatchlistSwipeNuxProvider.1
            @Override // com.robinhood.shared.portfolio.listsswipenux.SwipeNuxGateProvider
            public final Flow<Boolean> isSwipeNuxEnabled() {
                return FlowKt.flowCombine(regionGateProvider.streamRegionGateStateFlow(WatchlistPositionsTabSwipeToTradeRegionGate.INSTANCE, false), regionGateProvider.streamRegionGateStateFlow(WatchlistTabRegionGate.INSTANCE, false), new AnonymousClass1(null));
            }

            /* compiled from: SwipeNuxModule.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "inPositionRegionGate", "inTabRegionGate"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.listsswipenux.SwipeNuxModule$provideEquityWatchlistSwipeNuxProvider$1$1", m3645f = "SwipeNuxModule.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.portfolio.listsswipenux.SwipeNuxModule$provideEquityWatchlistSwipeNuxProvider$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
                /* synthetic */ boolean Z$0;
                /* synthetic */ boolean Z$1;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
                    return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.Z$0 = z;
                    anonymousClass1.Z$1 = z2;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return boxing.boxBoolean(this.Z$0 || this.Z$1);
                }
            }
        }, regionGateProvider, historyStore, clock, false, 512, null);
    }

    @SwipeContextKey(context = SwipeContext.FUTURES_POSITIONS)
    public final SwipeNuxProvider provideFuturesPositionsSwipeNuxProvider(@UserPrefs SharedPreferences preferences, RegionGateProvider regionGateProvider, HistoryStore historyStore, Clock clock) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        SwipeContext swipeContext = SwipeContext.FUTURES_POSITIONS;
        return new SwipeNuxProvider(swipeContext, new StringPreference(preferences, swipeContext.getPrefixKey() + "_peek_last_shown", null, null, 12, null), new IntPreference(preferences, swipeContext.getPrefixKey() + "_peek_count", 0, 4, null), new StringPreference(preferences, swipeContext.getPrefixKey() + "_last_swipe", null, null, 12, null), new StringPreference(preferences, swipeContext.getPrefixKey() + "_tooltip_last_shown", null, null, 12, null), new SwipeNuxGateProvider() { // from class: com.robinhood.shared.portfolio.listsswipenux.SwipeNuxModule.provideFuturesPositionsSwipeNuxProvider.1
            @Override // com.robinhood.shared.portfolio.listsswipenux.SwipeNuxGateProvider
            public final Flow<Boolean> isSwipeNuxEnabled() {
                return FlowKt.flowOf(Boolean.TRUE);
            }
        }, regionGateProvider, historyStore, clock, false);
    }
}
