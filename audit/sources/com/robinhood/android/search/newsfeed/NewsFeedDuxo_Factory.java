package com.robinhood.android.search.newsfeed;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.search.newsfeed.view.util.TimeProvider;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsEligibilityStore;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bõ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/NewsFeedDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/search/newsfeed/NewsFeedDuxo;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "newsFeedElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "recsEligibilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsEligibilityStore;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "userProgressStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "timeProvider", "Lcom/robinhood/android/search/newsfeed/view/util/TimeProvider;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "listChipBadgeSeenPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "startedEducationLessonsPref", "Lcom/robinhood/prefs/StringPreference;", "educationLessonsFirstShownTimestampPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class NewsFeedDuxo_Factory implements Factory<NewsFeedDuxo> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<StringPreference> educationLessonsFirstShownTimestampPref;
    private final Provider<EducationLessonsStore> educationLessonsStore;
    private final Provider<IacInfoBannerStore> iacInfoBannerStore;
    private final Provider<StringToBooleanMapPreference> listChipBadgeSeenPref;
    private final Provider<LazyMoshi> moshi;
    private final Provider<NewsFeedElementStore> newsFeedElementStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<RecommendationsEligibilityStore> recsEligibilityStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<StringPreference> startedEducationLessonsPref;
    private final Provider<TimeProvider> timeProvider;
    private final Provider<EducationUserProgressStore> userProgressStore;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final NewsFeedDuxo_Factory create(Provider<AnalyticsLogger> provider, Provider<NewsFeedElementStore> provider2, Provider<PerformanceLogger> provider3, Provider<IacInfoBannerStore> provider4, Provider<RecommendationsEligibilityStore> provider5, Provider<EducationLessonsStore> provider6, Provider<EducationUserProgressStore> provider7, Provider<UserStore> provider8, Provider<TimeProvider> provider9, Provider<LazyMoshi> provider10, Provider<StringToBooleanMapPreference> provider11, Provider<StringPreference> provider12, Provider<StringPreference> provider13, Provider<SavedStateHandle> provider14, Provider<DispatcherProvider> provider15, Provider<RxFactory> provider16, Provider<RxGlobalErrorHandler> provider17) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    @JvmStatic
    public static final NewsFeedDuxo newInstance(AnalyticsLogger analyticsLogger, NewsFeedElementStore newsFeedElementStore, PerformanceLogger performanceLogger, IacInfoBannerStore iacInfoBannerStore, RecommendationsEligibilityStore recommendationsEligibilityStore, EducationLessonsStore educationLessonsStore, EducationUserProgressStore educationUserProgressStore, UserStore userStore, TimeProvider timeProvider, LazyMoshi lazyMoshi, StringToBooleanMapPreference stringToBooleanMapPreference, StringPreference stringPreference, StringPreference stringPreference2, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(analyticsLogger, newsFeedElementStore, performanceLogger, iacInfoBannerStore, recommendationsEligibilityStore, educationLessonsStore, educationUserProgressStore, userStore, timeProvider, lazyMoshi, stringToBooleanMapPreference, stringPreference, stringPreference2, savedStateHandle);
    }

    public NewsFeedDuxo_Factory(Provider<AnalyticsLogger> analytics, Provider<NewsFeedElementStore> newsFeedElementStore, Provider<PerformanceLogger> performanceLogger, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<RecommendationsEligibilityStore> recsEligibilityStore, Provider<EducationLessonsStore> educationLessonsStore, Provider<EducationUserProgressStore> userProgressStore, Provider<UserStore> userStore, Provider<TimeProvider> timeProvider, Provider<LazyMoshi> moshi, Provider<StringToBooleanMapPreference> listChipBadgeSeenPref, Provider<StringPreference> startedEducationLessonsPref, Provider<StringPreference> educationLessonsFirstShownTimestampPref, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(newsFeedElementStore, "newsFeedElementStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(recsEligibilityStore, "recsEligibilityStore");
        Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
        Intrinsics.checkNotNullParameter(userProgressStore, "userProgressStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(listChipBadgeSeenPref, "listChipBadgeSeenPref");
        Intrinsics.checkNotNullParameter(startedEducationLessonsPref, "startedEducationLessonsPref");
        Intrinsics.checkNotNullParameter(educationLessonsFirstShownTimestampPref, "educationLessonsFirstShownTimestampPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.analytics = analytics;
        this.newsFeedElementStore = newsFeedElementStore;
        this.performanceLogger = performanceLogger;
        this.iacInfoBannerStore = iacInfoBannerStore;
        this.recsEligibilityStore = recsEligibilityStore;
        this.educationLessonsStore = educationLessonsStore;
        this.userProgressStore = userProgressStore;
        this.userStore = userStore;
        this.timeProvider = timeProvider;
        this.moshi = moshi;
        this.listChipBadgeSeenPref = listChipBadgeSeenPref;
        this.startedEducationLessonsPref = startedEducationLessonsPref;
        this.educationLessonsFirstShownTimestampPref = educationLessonsFirstShownTimestampPref;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public NewsFeedDuxo get() {
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        NewsFeedElementStore newsFeedElementStore = this.newsFeedElementStore.get();
        Intrinsics.checkNotNullExpressionValue(newsFeedElementStore, "get(...)");
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        IacInfoBannerStore iacInfoBannerStore = this.iacInfoBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(iacInfoBannerStore, "get(...)");
        RecommendationsEligibilityStore recommendationsEligibilityStore = this.recsEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(recommendationsEligibilityStore, "get(...)");
        EducationLessonsStore educationLessonsStore = this.educationLessonsStore.get();
        Intrinsics.checkNotNullExpressionValue(educationLessonsStore, "get(...)");
        EducationUserProgressStore educationUserProgressStore = this.userProgressStore.get();
        Intrinsics.checkNotNullExpressionValue(educationUserProgressStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        TimeProvider timeProvider = this.timeProvider.get();
        Intrinsics.checkNotNullExpressionValue(timeProvider, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        StringToBooleanMapPreference stringToBooleanMapPreference = this.listChipBadgeSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToBooleanMapPreference, "get(...)");
        StringPreference stringPreference = this.startedEducationLessonsPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.educationLessonsFirstShownTimestampPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        NewsFeedDuxo newsFeedDuxoNewInstance = companion.newInstance(analyticsLogger, newsFeedElementStore, performanceLogger, iacInfoBannerStore, recommendationsEligibilityStore, educationLessonsStore, educationUserProgressStore, userStore, timeProvider, lazyMoshi, stringToBooleanMapPreference, stringPreference, stringPreference2, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(newsFeedDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(newsFeedDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(newsFeedDuxoNewInstance, rxGlobalErrorHandler);
        return newsFeedDuxoNewInstance;
    }

    /* compiled from: NewsFeedDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jö\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0007H\u0007Jx\u0010(\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0007¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/NewsFeedDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/search/newsfeed/NewsFeedDuxo_Factory;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "newsFeedElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "recsEligibilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsEligibilityStore;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "userProgressStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "timeProvider", "Lcom/robinhood/android/search/newsfeed/view/util/TimeProvider;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "listChipBadgeSeenPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "startedEducationLessonsPref", "Lcom/robinhood/prefs/StringPreference;", "educationLessonsFirstShownTimestampPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/search/newsfeed/NewsFeedDuxo;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NewsFeedDuxo_Factory create(Provider<AnalyticsLogger> analytics, Provider<NewsFeedElementStore> newsFeedElementStore, Provider<PerformanceLogger> performanceLogger, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<RecommendationsEligibilityStore> recsEligibilityStore, Provider<EducationLessonsStore> educationLessonsStore, Provider<EducationUserProgressStore> userProgressStore, Provider<UserStore> userStore, Provider<TimeProvider> timeProvider, Provider<LazyMoshi> moshi, Provider<StringToBooleanMapPreference> listChipBadgeSeenPref, Provider<StringPreference> startedEducationLessonsPref, Provider<StringPreference> educationLessonsFirstShownTimestampPref, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(newsFeedElementStore, "newsFeedElementStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            Intrinsics.checkNotNullParameter(recsEligibilityStore, "recsEligibilityStore");
            Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
            Intrinsics.checkNotNullParameter(userProgressStore, "userProgressStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(listChipBadgeSeenPref, "listChipBadgeSeenPref");
            Intrinsics.checkNotNullParameter(startedEducationLessonsPref, "startedEducationLessonsPref");
            Intrinsics.checkNotNullParameter(educationLessonsFirstShownTimestampPref, "educationLessonsFirstShownTimestampPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new NewsFeedDuxo_Factory(analytics, newsFeedElementStore, performanceLogger, iacInfoBannerStore, recsEligibilityStore, educationLessonsStore, userProgressStore, userStore, timeProvider, moshi, listChipBadgeSeenPref, startedEducationLessonsPref, educationLessonsFirstShownTimestampPref, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final NewsFeedDuxo newInstance(AnalyticsLogger analytics, NewsFeedElementStore newsFeedElementStore, PerformanceLogger performanceLogger, IacInfoBannerStore iacInfoBannerStore, RecommendationsEligibilityStore recsEligibilityStore, EducationLessonsStore educationLessonsStore, EducationUserProgressStore userProgressStore, UserStore userStore, TimeProvider timeProvider, LazyMoshi moshi, StringToBooleanMapPreference listChipBadgeSeenPref, StringPreference startedEducationLessonsPref, StringPreference educationLessonsFirstShownTimestampPref, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(newsFeedElementStore, "newsFeedElementStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            Intrinsics.checkNotNullParameter(recsEligibilityStore, "recsEligibilityStore");
            Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
            Intrinsics.checkNotNullParameter(userProgressStore, "userProgressStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(listChipBadgeSeenPref, "listChipBadgeSeenPref");
            Intrinsics.checkNotNullParameter(startedEducationLessonsPref, "startedEducationLessonsPref");
            Intrinsics.checkNotNullParameter(educationLessonsFirstShownTimestampPref, "educationLessonsFirstShownTimestampPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new NewsFeedDuxo(analytics, newsFeedElementStore, performanceLogger, iacInfoBannerStore, recsEligibilityStore, educationLessonsStore, userProgressStore, userStore, timeProvider, moshi, listChipBadgeSeenPref, startedEducationLessonsPref, educationLessonsFirstShownTimestampPref, savedStateHandle);
        }
    }
}
