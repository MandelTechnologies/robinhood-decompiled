package com.robinhood.android.search.newsfeed;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.education.contracts.NewsFeed;
import com.robinhood.android.education.contracts.NewsfeedDisclosureKey;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.NewsFeedDuxo;
import com.robinhood.android.search.newsfeed.NewsFeedViewState;
import com.robinhood.android.search.newsfeed.view.NewsfeedHeaderChange;
import com.robinhood.android.search.newsfeed.view.util.TimeProvider;
import com.robinhood.android.search.prefs.CuratedListChipBadgeSeenPref;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsEligibilityStore;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.newsfeed.p334db.NewsFeedLocation;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.prefs.annotation.EducationLessonsFirstShownTimestampPref;
import com.robinhood.prefs.annotation.StartedEducationLessonsPref;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.models.p387db.bonfire.education.EducationUserProgress;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: NewsFeedDuxo.kt */
@Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001MB\u007f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J\r\u0010-\u001a\u00020+H\u0001¢\u0006\u0002\b.J\u0006\u0010/\u001a\u00020+J\u000e\u00100\u001a\u00020+2\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u00020+2\u0006\u00104\u001a\u000205J\u0014\u00106\u001a\u00020+2\f\u00107\u001a\b\u0012\u0004\u0012\u00020908J\u0014\u0010:\u001a\u00020+2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&08J\u001a\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u0002022\b\b\u0002\u0010?\u001a\u000202H\u0002J\u0016\u0010@\u001a\u00020+2\u0006\u0010A\u001a\u0002052\u0006\u0010B\u001a\u00020CJ\u000e\u0010D\u001a\u00020+2\u0006\u0010A\u001a\u000205J\u0014\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G080FH\u0002J\u001d\u0010H\u001a\u0004\u0018\u00010I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020K08H\u0002¢\u0006\u0002\u0010LR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020)0(0$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/NewsFeedDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/search/newsfeed/NewsFeedViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "newsFeedElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "recsEligibilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsEligibilityStore;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "userProgressStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "timeProvider", "Lcom/robinhood/android/search/newsfeed/view/util/TimeProvider;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "listChipBadgeSeenPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "startedEducationLessonsPref", "Lcom/robinhood/prefs/StringPreference;", "educationLessonsFirstShownTimestampPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsEligibilityStore;Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/search/newsfeed/view/util/TimeProvider;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/prefs/StringToBooleanMapPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "stringSetAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "stringLongMapAdapter", "", "", "onCreate", "", "onResume", "subscribeToHeaderChangesPerLocale", "subscribeToHeaderChangesPerLocale$feature_search_externalRelease", "refreshNewsFeed", "enableAutoplayVideoAudio", "enabled", "", "markListChipBadgeSeen", "listId", "Ljava/util/UUID;", "markEducationLessonsAppeared", "lessons", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "loadUserProgress", "trackingIds", "measuredRefresh", "Lio/reactivex/Completable;", "force", "firstLoad", "tapInfoBanner", "receiptUuid", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;", "dismissInfoBanner", "streamNewsFeedElementsByLocation", "Lio/reactivex/Observable;", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "getScrollTargetIndex", "", "elements", "Lcom/robinhood/android/newsfeed/model/Element;", "(Ljava/util/List;)Ljava/lang/Integer;", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedDuxo extends OldBaseDuxo<NewsFeedViewState> implements HasSavedState {
    private final AnalyticsLogger analytics;
    private final StringPreference educationLessonsFirstShownTimestampPref;
    private final EducationLessonsStore educationLessonsStore;
    private final IacInfoBannerStore iacInfoBannerStore;
    private final StringToBooleanMapPreference listChipBadgeSeenPref;
    private final NewsFeedElementStore newsFeedElementStore;
    private final PerformanceLogger performanceLogger;
    private final RecommendationsEligibilityStore recsEligibilityStore;
    private final SavedStateHandle savedStateHandle;
    private final StringPreference startedEducationLessonsPref;
    private final JsonAdapter<Map<String, Long>> stringLongMapAdapter;
    private final JsonAdapter<Set<String>> stringSetAdapter;
    private final TimeProvider timeProvider;
    private final EducationUserProgressStore userProgressStore;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NewsFeedDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewsFeed.TargetSection.values().length];
            try {
                iArr[NewsFeed.TargetSection.MARKET_INDICATORS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedDuxo(AnalyticsLogger analytics, NewsFeedElementStore newsFeedElementStore, PerformanceLogger performanceLogger, IacInfoBannerStore iacInfoBannerStore, RecommendationsEligibilityStore recsEligibilityStore, EducationLessonsStore educationLessonsStore, EducationUserProgressStore userProgressStore, UserStore userStore, TimeProvider timeProvider, LazyMoshi moshi, @CuratedListChipBadgeSeenPref StringToBooleanMapPreference listChipBadgeSeenPref, @StartedEducationLessonsPref StringPreference startedEducationLessonsPref, @EducationLessonsFirstShownTimestampPref StringPreference educationLessonsFirstShownTimestampPref, SavedStateHandle savedStateHandle) {
        super(new NewsFeedViewState(null, null, false, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 262143, null), null, 2, null);
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
        this.analytics = analytics;
        this.newsFeedElementStore = newsFeedElementStore;
        this.performanceLogger = performanceLogger;
        this.iacInfoBannerStore = iacInfoBannerStore;
        this.recsEligibilityStore = recsEligibilityStore;
        this.educationLessonsStore = educationLessonsStore;
        this.userProgressStore = userProgressStore;
        this.userStore = userStore;
        this.timeProvider = timeProvider;
        this.listChipBadgeSeenPref = listChipBadgeSeenPref;
        this.startedEducationLessonsPref = startedEducationLessonsPref;
        this.educationLessonsFirstShownTimestampPref = educationLessonsFirstShownTimestampPref;
        this.savedStateHandle = savedStateHandle;
        Types types = Types.INSTANCE;
        this.stringSetAdapter = moshi.adapter(new TypeToken<Set<? extends String>>() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$special$$inlined$getAdapter$1
        }.getType());
        this.stringLongMapAdapter = moshi.adapter(new TypeToken<Map<String, ? extends Long>>() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$special$$inlined$getAdapter$2
        }.getType());
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.onCreate$lambda$1(this.f$0, (NewsFeedViewState) obj);
            }
        });
        Observable observableTake = measuredRefresh(false, true).toSingleDefault(Unit.INSTANCE).flatMapObservable(new Function() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<List<NewsFeedElement>, Throwable>> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return NewsFeedDuxo.this.streamNewsFeedElementsByLocation().map(new Function() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo.onCreate.2.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<List<NewsFeedElement>, Throwable> apply(List<NewsFeedElement> it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Tuples4.m3642to(it2, null);
                    }
                });
            }
        }).onErrorResumeNext(new Function() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<List<NewsFeedElement>, Throwable>> apply(final Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                if (Throwables.isNetworkRelated(t)) {
                    return NewsFeedDuxo.this.streamNewsFeedElementsByLocation().map(new Function() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo.onCreate.3.1
                        @Override // io.reactivex.functions.Function
                        public final Tuples2<List<NewsFeedElement>, Throwable> apply(List<NewsFeedElement> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Tuples4.m3642to(it, t);
                        }
                    });
                }
                return Observable.error(t);
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.onCreate$lambda$3(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState onCreate$lambda$1(final NewsFeedDuxo newsFeedDuxo, NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, false, null, new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.onCreate$lambda$1$lambda$0(this.f$0, (List) obj);
            }
        }, null, null, null, null, null, null, false, null, null, null, null, 262079, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer onCreate$lambda$1$lambda$0(NewsFeedDuxo newsFeedDuxo, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return newsFeedDuxo.getScrollTargetIndex(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(NewsFeedDuxo newsFeedDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        final List list = (List) objComponent1;
        final Throwable th = (Throwable) tuples2.component2();
        newsFeedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.onCreate$lambda$3$lambda$2(list, th, (NewsFeedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState onCreate$lambda$3$lambda$2(List list, Throwable th, NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, list, null, true, th, false, null, null, null, null, null, null, null, null, false, null, null, NewsFeedViewState.RecyclerViewItemsFetched.copy$default(applyMutation.getRecyclerViewItemsFetched(), false, true, 1, null), null, 196594, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        final Set<String> setEmptySet;
        final Map<String, Long> mapEmptyMap;
        super.onResume();
        measuredRefresh$default(this, false, false, 2, null);
        LifecycleHost.DefaultImpls.bind$default(this, streamNewsFeedElementsByLocation(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.onResume$lambda$5(this.f$0, (List) obj);
            }
        });
        String str = this.startedEducationLessonsPref.get();
        if (str == null || (setEmptySet = this.stringSetAdapter.fromJson(str)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        String str2 = this.educationLessonsFirstShownTimestampPref.get();
        if (str2 == null || (mapEmptyMap = this.stringLongMapAdapter.fromJson(str2)) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.onResume$lambda$7(this.f$0, setEmptySet, mapEmptyMap, (NewsFeedViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, IacInfoBannerStore.streamBatch$default(this.iacInfoBannerStore, CollectionsKt.listOf(IacInfoBannerLocation.INFO_BANNER_BROWSE_TAB_MOBILE_TOP_LEVEL), null, null, null, null, null, null, null, null, null, null, 2046, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.onResume$lambda$9(this.f$0, (List) obj);
            }
        });
        Observable observableOnErrorReturnItem = this.recsEligibilityStore.getEligibility().toObservable().map(new Function() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Boolean isEligible) {
                Intrinsics.checkNotNullParameter(isEligible, "isEligible");
                return isEligible;
            }
        }).onErrorReturnItem(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorReturnItem, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.onResume$lambda$11(this.f$0, (Boolean) obj);
            }
        });
        subscribeToHeaderChangesPerLocale$feature_search_externalRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(NewsFeedDuxo newsFeedDuxo, final List elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        newsFeedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.onResume$lambda$5$lambda$4(elements, (NewsFeedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState onResume$lambda$5$lambda$4(List list, NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, list, null, false, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 262142, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState onResume$lambda$7(NewsFeedDuxo newsFeedDuxo, Set set, Map map, NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, false, null, null, null, null, newsFeedDuxo.listChipBadgeSeenPref.getValues(), set, null, map, false, null, null, null, null, 256511, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(NewsFeedDuxo newsFeedDuxo, final List infoBanners) {
        Intrinsics.checkNotNullParameter(infoBanners, "infoBanners");
        newsFeedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.onResume$lambda$9$lambda$8(infoBanners, (NewsFeedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState onResume$lambda$9$lambda$8(List list, NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, false, null, null, null, null, null, null, null, null, false, list, null, null, null, 245759, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(NewsFeedDuxo newsFeedDuxo, final Boolean bool) {
        newsFeedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.onResume$lambda$11$lambda$10(bool, (NewsFeedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState onResume$lambda$11$lambda$10(Boolean bool, NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, false, null, null, null, null, null, null, null, null, bool.booleanValue(), null, null, NewsFeedViewState.RecyclerViewItemsFetched.copy$default(applyMutation.getRecyclerViewItemsFetched(), true, false, 2, null), null, 188415, null);
    }

    public final void subscribeToHeaderChangesPerLocale$feature_search_externalRelease() {
        Observable<User> observableDistinctUntilChanged = this.userStore.getUser().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.subscribeToHeaderChangesPerLocale$lambda$13(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToHeaderChangesPerLocale$lambda$13(NewsFeedDuxo newsFeedDuxo, User user) {
        final NewsfeedHeaderChange newsfeedHeaderChange;
        CountryCode.Supported locality = user.getOrigin().getLocality();
        if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedStates.INSTANCE)) {
            newsfeedHeaderChange = new NewsfeedHeaderChange(true, C27909R.string.news_feed_header_title_us, NewsfeedDisclosureKey.INSTANCE.defaultForUs());
        } else if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            newsfeedHeaderChange = new NewsfeedHeaderChange(false, C27909R.string.news_feed_header_title_gb, NewsfeedDisclosureKey.INSTANCE.defaultForGb());
        } else {
            newsfeedHeaderChange = new NewsfeedHeaderChange(false, 0, null, 7, null);
        }
        newsFeedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.subscribeToHeaderChangesPerLocale$lambda$13$lambda$12(newsfeedHeaderChange, (NewsFeedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState subscribeToHeaderChangesPerLocale$lambda$13$lambda$12(NewsfeedHeaderChange newsfeedHeaderChange, NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, false, null, null, null, null, null, null, null, null, false, null, null, null, new UiEvent(newsfeedHeaderChange), 131071, null);
    }

    public final void refreshNewsFeed() {
        Completable completableSwitchMapCompletable = getStates().take(1L).switchMapCompletable(new C280441());
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedDuxo.refreshNewsFeed$lambda$15(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.refreshNewsFeed$lambda$17(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: NewsFeedDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.newsfeed.NewsFeedDuxo$refreshNewsFeed$1 */
    static final class C280441<T, R> implements Function {
        C280441() {
        }

        @Override // io.reactivex.functions.Function
        public final CompletableSource apply(NewsFeedViewState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state.getShowInitialLoadErrorMessage()) {
                NewsFeedDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$refreshNewsFeed$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NewsFeedDuxo.C280441.apply$lambda$0((NewsFeedViewState) obj);
                    }
                });
            }
            return NewsFeedDuxo.measuredRefresh$default(NewsFeedDuxo.this, true, false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NewsFeedViewState apply$lambda$0(NewsFeedViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 262131, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshNewsFeed$lambda$15(NewsFeedDuxo newsFeedDuxo) {
        newsFeedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.refreshNewsFeed$lambda$15$lambda$14((NewsFeedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState refreshNewsFeed$lambda$15$lambda$14(NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, null, null, true, null, false, null, null, new UiEvent(Unit.INSTANCE), null, null, null, null, null, false, null, null, null, null, 262011, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshNewsFeed$lambda$17(NewsFeedDuxo newsFeedDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        newsFeedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.refreshNewsFeed$lambda$17$lambda$16(t, (NewsFeedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState refreshNewsFeed$lambda$17$lambda$16(Throwable th, NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, null, null, true, th, false, null, null, null, new UiEvent(th), null, null, null, null, false, null, null, null, null, 261875, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState enableAutoplayVideoAudio$lambda$18(boolean z, NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, z, null, null, null, null, null, null, null, null, false, null, null, null, null, 262127, null);
    }

    public final void enableAutoplayVideoAudio(final boolean enabled) {
        applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.enableAutoplayVideoAudio$lambda$18(enabled, (NewsFeedViewState) obj);
            }
        });
    }

    public final void markListChipBadgeSeen(UUID listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        StringToBooleanMapPreference stringToBooleanMapPreference = this.listChipBadgeSeenPref;
        stringToBooleanMapPreference.setValues(MapsKt.plus(stringToBooleanMapPreference.getValues(), Tuples4.m3642to(listId.toString(), Boolean.TRUE)));
        applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.markListChipBadgeSeen$lambda$19(this.f$0, (NewsFeedViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState markListChipBadgeSeen$lambda$19(NewsFeedDuxo newsFeedDuxo, NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, false, null, null, null, null, newsFeedDuxo.listChipBadgeSeenPref.getValues(), null, null, null, false, null, null, null, null, 261631, null);
    }

    public final void markEducationLessonsAppeared(List<EducationLessonPreview> lessons) {
        Intrinsics.checkNotNullParameter(lessons, "lessons");
        this.educationLessonsStore.setLessonsAppearanceTimestamps(lessons);
    }

    public final void loadUserProgress(List<String> trackingIds) {
        Intrinsics.checkNotNullParameter(trackingIds, "trackingIds");
        EducationUserProgressStore.refreshUserProgressByTrackingIds$default(this.userProgressStore, trackingIds, null, EducationUserProgress.ContentType.LESSON, false, 2, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.userProgressStore.streamUserProgressByTrackingIds(trackingIds), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.loadUserProgress$lambda$21(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadUserProgress$lambda$21(NewsFeedDuxo newsFeedDuxo, final List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        newsFeedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.loadUserProgress$lambda$21$lambda$20(it, (NewsFeedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState loadUserProgress$lambda$21$lambda$20(List list, NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, false, list, null, null, null, null, null, null, null, false, null, null, null, null, 262111, null);
    }

    static /* synthetic */ Completable measuredRefresh$default(NewsFeedDuxo newsFeedDuxo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return newsFeedDuxo.measuredRefresh(z, z2);
    }

    private final Completable measuredRefresh(final boolean force, final boolean firstLoad) {
        final long jElapsedRealtime = this.timeProvider.elapsedRealtime();
        if (firstLoad) {
            PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.BROWSE_NEWSFEED, null, null, null, 14, null);
        }
        Completable completableCache = this.newsFeedElementStore.refresh(force, NewsFeedLocation.BROWSE.toString()).cache();
        Intrinsics.checkNotNull(completableCache);
        LifecycleHost.DefaultImpls.bind$default(this, completableCache, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedDuxo.measuredRefresh$lambda$23(firstLoad, this, jElapsedRealtime, force);
            }
        }, new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedDuxo.measuredRefresh$lambda$25(firstLoad, this, force, (Throwable) obj);
            }
        });
        return completableCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measuredRefresh$lambda$23(boolean z, NewsFeedDuxo newsFeedDuxo, long j, boolean z2) {
        if (z) {
            PerformanceLogger.DefaultImpls.completeMetric$default(newsFeedDuxo.performanceLogger, PerformanceMetricEventData.Name.BROWSE_NEWSFEED, null, 2, null);
        }
        float fElapsedRealtime = (newsFeedDuxo.timeProvider.elapsedRealtime() - j) / 1000.0f;
        if (fElapsedRealtime > 1.0f) {
            AnalyticsLogger analyticsLogger = newsFeedDuxo.analytics;
            String str = String.format("%.4f", Arrays.copyOf(new Object[]{Float.valueOf(fElapsedRealtime)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            analyticsLogger.logError(AnalyticsStrings.ERROR_HIGH_LATENCY, str);
        }
        if (z2) {
            newsFeedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewsFeedDuxo.measuredRefresh$lambda$23$lambda$22((NewsFeedViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState measuredRefresh$lambda$23$lambda$22(NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, false, null, null, new UiEvent(Unit.INSTANCE), null, null, null, null, null, false, null, null, null, null, 262015, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measuredRefresh$lambda$25(boolean z, NewsFeedDuxo newsFeedDuxo, boolean z2, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z) {
            PerformanceLogger.DefaultImpls.failMetric$default(newsFeedDuxo.performanceLogger, PerformanceMetricEventData.Name.BROWSE_NEWSFEED, null, 2, null);
        }
        if (z2) {
            newsFeedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewsFeedDuxo.measuredRefresh$lambda$25$lambda$24((NewsFeedViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedViewState measuredRefresh$lambda$25$lambda$24(NewsFeedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, false, null, null, new UiEvent(Unit.INSTANCE), null, null, null, null, null, false, null, null, null, null, 262015, null);
    }

    public final void tapInfoBanner(UUID receiptUuid, GenericAction.DeeplinkAction action) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(action, "action");
        LifecycleHost.DefaultImpls.bind$default(this, this.iacInfoBannerStore.postTapped(receiptUuid, action.getUri().toString()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    public final void dismissInfoBanner(UUID receiptUuid) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Completable completableSwitchMapCompletable = getStates().take(1L).switchMapCompletable(new C280401(receiptUuid));
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    /* compiled from: NewsFeedDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.newsfeed.NewsFeedDuxo$dismissInfoBanner$1 */
    static final class C280401<T, R> implements Function {
        final /* synthetic */ UUID $receiptUuid;

        C280401(UUID uuid) {
            this.$receiptUuid = uuid;
        }

        @Override // io.reactivex.functions.Function
        public final CompletableSource apply(NewsFeedViewState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            List<IacInfoBanner> iacInfoBanners = state.getIacInfoBanners();
            UUID uuid = this.$receiptUuid;
            final ArrayList arrayList = new ArrayList();
            for (T t : iacInfoBanners) {
                if (!Intrinsics.areEqual(((IacInfoBanner) t).getReceiptUuid(), uuid)) {
                    arrayList.add(t);
                }
            }
            NewsFeedDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.NewsFeedDuxo$dismissInfoBanner$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewsFeedDuxo.C280401.apply$lambda$1(arrayList, (NewsFeedViewState) obj);
                }
            });
            return NewsFeedDuxo.this.iacInfoBannerStore.postDismissed(this.$receiptUuid, IacDismissMethod.PASSIVE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NewsFeedViewState apply$lambda$1(List list, NewsFeedViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return NewsFeedViewState.copy$default(applyMutation, null, null, false, null, false, null, null, null, null, null, null, null, null, false, list, null, null, null, 245759, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<List<NewsFeedElement>> streamNewsFeedElementsByLocation() {
        return this.newsFeedElementStore.streamNewsFeedElements(NewsFeedLocation.BROWSE.toString());
    }

    private final Integer getScrollTargetIndex(List<? extends Element> elements) {
        NewsFeed.TargetSection targetSection = ((NewsFeed) INSTANCE.getArgs((HasSavedState) this)).getTargetSection();
        if (targetSection == null || WhenMappings.$EnumSwitchMapping$0[targetSection.ordinal()] != 1) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Element.MarketIndicators.class);
        Iterator<? extends Element> it = elements.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (orCreateKotlinClass.isInstance(it.next())) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* compiled from: NewsFeedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/NewsFeedDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/search/newsfeed/NewsFeedDuxo;", "Lcom/robinhood/android/education/contracts/NewsFeed;", "<init>", "()V", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<NewsFeedDuxo, NewsFeed> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NewsFeed getArgs(SavedStateHandle savedStateHandle) {
            return (NewsFeed) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NewsFeed getArgs(NewsFeedDuxo newsFeedDuxo) {
            return (NewsFeed) DuxoCompanion.DefaultImpls.getArgs(this, newsFeedDuxo);
        }
    }
}
