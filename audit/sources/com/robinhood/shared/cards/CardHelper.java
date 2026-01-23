package com.robinhood.shared.cards;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.redesigninvesting.streamlined.investing.experiment.StreamlinedInvestingExperiment;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CardStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.IacCardImpressionLimiter;
import com.robinhood.models.card.api.ApiCard;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.shared.cards.NotificationCard;
import com.robinhood.shared.cards.prefs.PromptedForReviewPref;
import com.robinhood.shared.cards.prefs.TopCardRhIdPref;
import com.robinhood.store.base.PortfolioStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.RhProcessLifecycleOwner2;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Duration;

/* compiled from: CardHelper.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB#\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0016J\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020F0E2\u0006\u0010G\u001a\u00020HJ*\u0010I\u001a\b\u0012\u0004\u0012\u00020F0E2\u0006\u0010G\u001a\u00020H2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0002J0\u0010N\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010R\u001a\u00020?2\b\u0010L\u001a\u0004\u0018\u00010MH\u0002J\u0016\u0010S\u001a\u00020?2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0PH\u0002J\u0018\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0P*\b\u0012\u0004\u0012\u00020Q0PH\u0002J4\u0010U\u001a\u00020A2\u0006\u0010G\u001a\u00020H2\u0010\u0010V\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030X0W2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010Y\u001a\u00020ZH\u0002J\u0010\u0010[\u001a\u00020A2\u0006\u0010\\\u001a\u00020FH\u0002J\b\u0010]\u001a\u00020^H\u0016J\b\u0010_\u001a\u00020AH\u0016J\u0006\u0010`\u001a\u00020AJT\u0010a\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020Q b*\n\u0012\u0004\u0012\u00020Q\u0018\u00010P0P b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020Q b*\n\u0012\u0004\u0012\u00020Q\u0018\u00010P0P\u0018\u00010E0E*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0P0EH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b3\u0010,\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010c\u001a\u00020?*\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006f"}, m3636d2 = {"Lcom/robinhood/shared/cards/CardHelper;", "Lcom/robinhood/android/common/util/CardManager;", "Lcom/robinhood/utils/ProcessLifecycleObserver;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "cardImpressionLimiter", "Lcom/robinhood/librobinhood/data/store/IacCardImpressionLimiter;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/utils/RhProcessLifecycleOwner;Lcom/robinhood/librobinhood/data/store/IacCardImpressionLimiter;)V", "portfolioStore", "Lcom/robinhood/store/base/PortfolioStore;", "getPortfolioStore", "()Lcom/robinhood/store/base/PortfolioStore;", "setPortfolioStore", "(Lcom/robinhood/store/base/PortfolioStore;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "getCardStore", "()Lcom/robinhood/librobinhood/data/store/CardStore;", "setCardStore", "(Lcom/robinhood/librobinhood/data/store/CardStore;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "getUserPrefs", "()Landroid/content/SharedPreferences;", "setUserPrefs", "(Landroid/content/SharedPreferences;)V", "topCardRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "getTopCardRhIdPref$annotations", "()V", "getTopCardRhIdPref", "()Lcom/robinhood/prefs/StringPreference;", "setTopCardRhIdPref", "(Lcom/robinhood/prefs/StringPreference;)V", "promptedForReviewPref", "Lcom/robinhood/prefs/LongPreference;", "getPromptedForReviewPref$annotations", "getPromptedForReviewPref", "()Lcom/robinhood/prefs/LongPreference;", "setPromptedForReviewPref", "(Lcom/robinhood/prefs/LongPreference;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "shouldQueryNetwork", "", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "getCardStack", "Lio/reactivex/Observable;", "Lcom/robinhood/shared/cards/NotificationCard$Stack;", "context", "Landroid/content/Context;", "getLocalCardStack", "networkException", "", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/db/Portfolio;", "generateNotificationCards", "serverCards", "", "Lcom/robinhood/models/card/db/Card;", "fromLocal", "shouldAppendLocalCards", "filterUnsupportedCards", "appendLowPriorityClientSideCardsBeforeFixedCards", "notificationCards", "", "Lcom/robinhood/shared/cards/NotificationCard;", "loadId", "", "processListForAnalytics", "clientStack", "invalidateCards", "Lio/reactivex/Completable;", "invalidateCardsBestEffort", "resetIacCardImpressionLimiter", "checkExperimentAndFilterCards", "kotlin.jvm.PlatformType", "isUpOverTwoPercentToday", "(Lcom/robinhood/models/db/Portfolio;)Z", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CardHelper implements CardManager, RhProcessLifecycleOwner2 {
    public AnalyticsLogger analytics;
    private final IacCardImpressionLimiter cardImpressionLimiter;
    public CardStore cardStore;
    private final CoroutineScope coroutineScope;
    public ExperimentsStore experimentsStore;
    public Navigator navigator;
    public PortfolioStore portfolioStore;
    public LongPreference promptedForReviewPref;
    private boolean shouldQueryNetwork;
    public StringPreference topCardRhIdPref;

    @UserPrefs
    public SharedPreferences userPrefs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @PromptedForReviewPref
    public static /* synthetic */ void getPromptedForReviewPref$annotations() {
    }

    @TopCardRhIdPref
    public static /* synthetic */ void getTopCardRhIdPref$annotations() {
    }

    public CardHelper(@RootCoroutineScope CoroutineScope coroutineScope, RhProcessLifecycleOwner rhProcessLifecycleOwner, IacCardImpressionLimiter cardImpressionLimiter) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        Intrinsics.checkNotNullParameter(cardImpressionLimiter, "cardImpressionLimiter");
        this.coroutineScope = coroutineScope;
        this.cardImpressionLimiter = cardImpressionLimiter;
        rhProcessLifecycleOwner.register(this);
    }

    public final PortfolioStore getPortfolioStore() {
        PortfolioStore portfolioStore = this.portfolioStore;
        if (portfolioStore != null) {
            return portfolioStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("portfolioStore");
        return null;
    }

    public final void setPortfolioStore(PortfolioStore portfolioStore) {
        Intrinsics.checkNotNullParameter(portfolioStore, "<set-?>");
        this.portfolioStore = portfolioStore;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final CardStore getCardStore() {
        CardStore cardStore = this.cardStore;
        if (cardStore != null) {
            return cardStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardStore");
        return null;
    }

    public final void setCardStore(CardStore cardStore) {
        Intrinsics.checkNotNullParameter(cardStore, "<set-?>");
        this.cardStore = cardStore;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final SharedPreferences getUserPrefs() {
        SharedPreferences sharedPreferences = this.userPrefs;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException(SharedPreferencesModule.USER_PREFS_NAME);
        return null;
    }

    public final void setUserPrefs(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.userPrefs = sharedPreferences;
    }

    public final StringPreference getTopCardRhIdPref() {
        StringPreference stringPreference = this.topCardRhIdPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("topCardRhIdPref");
        return null;
    }

    public final void setTopCardRhIdPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.topCardRhIdPref = stringPreference;
    }

    public final LongPreference getPromptedForReviewPref() {
        LongPreference longPreference = this.promptedForReviewPref;
        if (longPreference != null) {
            return longPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("promptedForReviewPref");
        return null;
    }

    public final void setPromptedForReviewPref(LongPreference longPreference) {
        Intrinsics.checkNotNullParameter(longPreference, "<set-?>");
        this.promptedForReviewPref = longPreference;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.shouldQueryNetwork = true;
    }

    public final Observable<NotificationCard.Stack> getCardStack(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Observable observableDefaultIfEmpty = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{Experiment.REVIEW_PROMPT_KILLSWITCH.INSTANCE}, false, null, 6, null).flatMap(new Function() { // from class: com.robinhood.shared.cards.CardHelper$getCardStack$portfolioObservable$1
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply(((Boolean) obj).booleanValue());
            }

            public final ObservableSource<? extends Optional<Portfolio>> apply(boolean z) {
                boolean z2 = Duration.ofMillis(System.currentTimeMillis() - this.this$0.getPromptedForReviewPref().get()).compareTo(PromptForReviewNotificationCard.INSTANCE.getPROMPT_INTERVAL()) > 0;
                if (!z && z2 && GooglePlay.INSTANCE.isSupportedByDevice(context)) {
                    return this.this$0.getPortfolioStore().getIndividualAccountPortfolioOptional();
                }
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        }).take(500L, TimeUnit.MILLISECONDS).take(1L).defaultIfEmpty(Optional2.INSTANCE);
        if (this.shouldQueryNetwork) {
            Observable<NotificationCard.Stack> observableFlatMap = observableDefaultIfEmpty.flatMap(new Function() { // from class: com.robinhood.shared.cards.CardHelper.getCardStack.1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends NotificationCard.Stack> apply(Optional<Portfolio> optional) {
                    Intrinsics.checkNotNullParameter(optional, "<destruct>");
                    final Portfolio portfolioComponent1 = optional.component1();
                    CardHelper cardHelper = CardHelper.this;
                    Observable<List<Card>> observableFilter = cardHelper.getCardStore().getNetworkCards().filter(new Predicate() { // from class: com.robinhood.shared.cards.CardHelper.getCardStack.1.1
                        @Override // io.reactivex.functions.Predicate
                        public final boolean test(List<?> p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            return !p0.isEmpty();
                        }
                    });
                    final CardHelper cardHelper2 = CardHelper.this;
                    Observable<List<Card>> observableDoOnNext = observableFilter.doOnNext(new Consumer() { // from class: com.robinhood.shared.cards.CardHelper.getCardStack.1.2
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(List<Card> list) {
                            cardHelper2.shouldQueryNetwork = false;
                            cardHelper2.getTopCardRhIdPref().delete();
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
                    Observable observableCheckExperimentAndFilterCards = cardHelper.checkExperimentAndFilterCards(observableDoOnNext);
                    final CardHelper cardHelper3 = CardHelper.this;
                    final Context context2 = context;
                    Observable<T> observableDefaultIfEmpty2 = observableCheckExperimentAndFilterCards.map(new Function() { // from class: com.robinhood.shared.cards.CardHelper.getCardStack.1.3
                        @Override // io.reactivex.functions.Function
                        public final NotificationCard.Stack apply(List<Card> cards) {
                            Intrinsics.checkNotNullParameter(cards, "cards");
                            return cardHelper3.generateNotificationCards(context2, cards, false, portfolioComponent1);
                        }
                    }).defaultIfEmpty(new NotificationCard.Stack(CollectionsKt.emptyList(), false));
                    final CardHelper cardHelper4 = CardHelper.this;
                    final Context context3 = context;
                    return observableDefaultIfEmpty2.onErrorResumeNext(new Function() { // from class: com.robinhood.shared.cards.CardHelper.getCardStack.1.4
                        @Override // io.reactivex.functions.Function
                        public final ObservableSource<? extends NotificationCard.Stack> apply(Throwable throwable) {
                            Intrinsics.checkNotNullParameter(throwable, "throwable");
                            return cardHelper4.getLocalCardStack(context3, throwable, portfolioComponent1);
                        }
                    });
                }
            });
            Intrinsics.checkNotNull(observableFlatMap);
            return observableFlatMap;
        }
        getCardStore().refresh(false);
        Observable<NotificationCard.Stack> observableFlatMap2 = observableDefaultIfEmpty.flatMap(new Function() { // from class: com.robinhood.shared.cards.CardHelper.getCardStack.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends NotificationCard.Stack> apply(Optional<Portfolio> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                return CardHelper.this.getLocalCardStack(context, null, optional.component1());
            }
        });
        Intrinsics.checkNotNull(observableFlatMap2);
        return observableFlatMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<NotificationCard.Stack> getLocalCardStack(final Context context, Throwable networkException, final Portfolio portfolio) {
        Observable observableJust;
        Observable<List<Card>> observableFilter = getCardStore().getLocalCards().take(5L, TimeUnit.SECONDS).take(1L).filter(new Predicate() { // from class: com.robinhood.shared.cards.CardHelper.getLocalCardStack.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(List<Card> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return !p0.isEmpty();
            }
        });
        if (networkException != null) {
            observableJust = Observable.error(networkException);
            Intrinsics.checkNotNull(observableJust);
        } else {
            observableJust = Observable.just(new ArrayList(0));
            Intrinsics.checkNotNull(observableJust);
        }
        Observable<List<Card>> observableSwitchIfEmpty = observableFilter.switchIfEmpty(observableJust);
        Intrinsics.checkNotNullExpressionValue(observableSwitchIfEmpty, "switchIfEmpty(...)");
        Observable map = checkExperimentAndFilterCards(observableSwitchIfEmpty).map(new Function() { // from class: com.robinhood.shared.cards.CardHelper.getLocalCardStack.2
            @Override // io.reactivex.functions.Function
            public final NotificationCard.Stack apply(List<Card> cards) {
                Intrinsics.checkNotNullParameter(cards, "cards");
                return CardHelper.this.generateNotificationCards(context, cards, true, portfolio);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationCard.Stack generateNotificationCards(Context context, List<Card> serverCards, boolean fromLocal, Portfolio portfolio) {
        ArrayList arrayList = new ArrayList();
        List<Card> listFilterUnsupportedCards = filterUnsupportedCards(serverCards);
        boolean zShouldAppendLocalCards = shouldAppendLocalCards(listFilterUnsupportedCards);
        Card card = (Card) CollectionsKt.firstOrNull((List) serverCards);
        String loadId = card != null ? card.getLoadId() : null;
        if (loadId == null) {
            loadId = "";
        }
        boolean z = false;
        for (Card card2 : listFilterUnsupportedCards) {
            if (card2.getFixed() && !z && zShouldAppendLocalCards) {
                appendLowPriorityClientSideCardsBeforeFixedCards(context, arrayList, portfolio, loadId);
                z = true;
            }
            arrayList.add(new ServerCard(context, card2, true ^ card2.getFixed()));
        }
        if (!z && zShouldAppendLocalCards) {
            appendLowPriorityClientSideCardsBeforeFixedCards(context, arrayList, portfolio, loadId);
        }
        NotificationCard.Stack stack = new NotificationCard.Stack(arrayList, fromLocal);
        processListForAnalytics(stack);
        return stack;
    }

    private final boolean shouldAppendLocalCards(List<Card> serverCards) {
        return serverCards.size() > 1 || (serverCards.size() == 1 && !((Card) CollectionsKt.first((List) serverCards)).getFixed());
    }

    private final List<Card> filterUnsupportedCards(List<Card> list) {
        String strNullIfEmpty;
        Uri uri;
        List<Card> mutableList = CollectionsKt.toMutableList((Collection) list);
        Iterator<Card> it = mutableList.iterator();
        while (it.hasNext()) {
            Card next = it.next();
            String deeplinkUri = next.getDeeplinkUri();
            if (deeplinkUri != null && (strNullIfEmpty = StringsKt.nullIfEmpty(deeplinkUri)) != null && (uri = Uri.parse(strNullIfEmpty)) != null && !getNavigator().isDeepLinkSupported(uri) && !next.getShowIfUnsupported()) {
                it.remove();
            }
        }
        return mutableList;
    }

    private final void appendLowPriorityClientSideCardsBeforeFixedCards(Context context, List<NotificationCard<?>> notificationCards, Portfolio portfolio, String loadId) {
        if (portfolio == null || !isUpOverTwoPercentToday(portfolio)) {
            return;
        }
        notificationCards.add(new PromptForReviewNotificationCard(context, loadId, true));
    }

    private final void processListForAnalytics(NotificationCard.Stack clientStack) {
        String str;
        List<NotificationCard<?>> notificationCards = clientStack.getNotificationCards();
        int size = notificationCards.size();
        for (int i = 0; i < size; i++) {
            NotificationCard<?> notificationCard = notificationCards.get(i);
            if (notificationCard instanceof BaseAnalyticsNotificationCard) {
                ((BaseAnalyticsNotificationCard) notificationCard).setDepth(size - i);
            }
        }
        if (clientStack.isFromLocal()) {
            str = AnalyticsStrings.NOTIF_STACK_EVENT_CACHED_LOAD;
        } else {
            str = AnalyticsStrings.NOTIF_STACK_EVENT_LOAD;
        }
        String str2 = str;
        int topCardIndex = INSTANCE.getTopCardIndex(getTopCardRhIdPref().get(), notificationCards);
        if (size > 0) {
            NotificationCard<?> notificationCard2 = notificationCards.get(topCardIndex);
            BaseAnalyticsNotificationCard baseAnalyticsNotificationCard = notificationCard2 instanceof BaseAnalyticsNotificationCard ? (BaseAnalyticsNotificationCard) notificationCard2 : null;
            getAnalytics().logNotificationStack(str2, size - topCardIndex, notificationCard2.getType(), baseAnalyticsNotificationCard != null ? baseAnalyticsNotificationCard.getCardId() : null, baseAnalyticsNotificationCard != null ? baseAnalyticsNotificationCard.getLoadId() : null, baseAnalyticsNotificationCard != null ? baseAnalyticsNotificationCard.getReviewSummary() : null, baseAnalyticsNotificationCard != null ? baseAnalyticsNotificationCard.getDeeplinkUri() : null, baseAnalyticsNotificationCard != null ? baseAnalyticsNotificationCard.getEntityId() : null);
            return;
        }
        getAnalytics().logNotificationStack(str2, 0, null, null, null, null, null, null);
    }

    @Override // com.robinhood.android.common.util.CardManager
    public Completable invalidateCards() {
        this.shouldQueryNetwork = true;
        Completable completableFromAction = Completable.fromAction(new Action() { // from class: com.robinhood.shared.cards.CardHelper.invalidateCards.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                CardHelper.this.getCardStore().deleteCards();
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction(...)");
        return completableFromAction;
    }

    @Override // com.robinhood.android.common.util.CardManager
    public void invalidateCardsBestEffort() {
        Completable completableSubscribeOn = invalidateCards().onErrorComplete().subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "subscribeOn(...)");
        ScopedSubscriptionKt.subscribeIn(completableSubscribeOn, this.coroutineScope);
    }

    public final void resetIacCardImpressionLimiter() {
        this.cardImpressionLimiter.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<List<Card>> checkExperimentAndFilterCards(Observable<List<Card>> observable) {
        return observable.flatMap(new Function() { // from class: com.robinhood.shared.cards.CardHelper.checkExperimentAndFilterCards.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<Card>> apply(final List<Card> cards) {
                Intrinsics.checkNotNullParameter(cards, "cards");
                final List listListOf = CollectionsKt.listOf((Object[]) new ApiCard.CardCategory[]{ApiCard.CardCategory.CRITICAL_ALERTS, ApiCard.CardCategory.NEW_USER_STATE});
                return ExperimentsProvider.DefaultImpls.streamState$default(CardHelper.this.getExperimentsStore(), new Experiment[]{StreamlinedInvestingExperiment.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.shared.cards.CardHelper.checkExperimentAndFilterCards.1.1
                    @Override // io.reactivex.functions.Function
                    public final List<Card> apply(Boolean shouldFilterCards) {
                        Intrinsics.checkNotNullParameter(shouldFilterCards, "shouldFilterCards");
                        if (shouldFilterCards.booleanValue()) {
                            List<Card> list = cards;
                            Intrinsics.checkNotNull(list);
                            List<ApiCard.CardCategory> list2 = listListOf;
                            ArrayList arrayList = new ArrayList();
                            for (T t : list) {
                                if (list2.contains(((Card) t).getCategory())) {
                                    arrayList.add(t);
                                }
                            }
                            return arrayList;
                        }
                        List<Card> list3 = cards;
                        Intrinsics.checkNotNull(list3);
                        return list3;
                    }
                });
            }
        });
    }

    private final boolean isUpOverTwoPercentToday(Portfolio portfolio) {
        return BigDecimals7.gte(portfolio.getEquity(), BigDecimals7.safeMultiply(portfolio.getAdjustedEquityPreviousClose(), new BigDecimal("1.02")));
    }

    /* compiled from: CardHelper.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/cards/CardHelper$Companion;", "", "<init>", "()V", "getTopCardIndex", "", "topCardRhId", "", "cards", "", "Lcom/robinhood/shared/cards/NotificationCard;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getTopCardIndex(String topCardRhId, List<? extends NotificationCard<?>> cards) {
            Intrinsics.checkNotNullParameter(cards, "cards");
            if (topCardRhId == null) {
                return 0;
            }
            Iterator<? extends NotificationCard<?>> it = cards.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                NotificationCard<?> next = it.next();
                if ((next instanceof ServerCard) && Intrinsics.areEqual(((ServerCard) next).getCard().getId(), topCardRhId)) {
                    break;
                }
                i++;
            }
            return RangesKt.coerceAtLeast(i, 0);
        }
    }
}
