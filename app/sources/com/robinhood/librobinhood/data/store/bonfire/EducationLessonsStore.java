package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.education.EducationApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.CompletedEducationLessonsPref;
import com.robinhood.prefs.annotation.EducationLessonsFirstShownTimestampPref;
import com.robinhood.prefs.annotation.StartedEducationLessonsPref;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationClaimRewardResult;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationEarnability;
import com.robinhood.shared.models.api.bonfire.education.lesson.ApiEducationHome;
import com.robinhood.shared.models.api.bonfire.education.lesson.ApiEducationLesson;
import com.robinhood.shared.models.api.bonfire.education.lesson.ApiEducationSeries;
import com.robinhood.shared.models.dao.EducationHomeDao;
import com.robinhood.shared.models.dao.EducationLessonDao;
import com.robinhood.shared.models.dao.EducationSeriesDao;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationHome;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSeries;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Either;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: EducationLessonsStore.kt */
@Metadata(m3635d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,J\u0016\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*J\u0016\u00100\u001a\u0002012\u0006\u0010/\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*J\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030,2\u0006\u0010/\u001a\u00020\u0017J\u0014\u00104\u001a\b\u0012\u0004\u0012\u000203052\u0006\u0010/\u001a\u00020\u0017J\u001e\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*J\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020:0,2\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u0017J\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020:0<2\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u0017J\u0016\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020*J\u0016\u0010@\u001a\u00020 2\u0006\u0010>\u001a\u00020\u00172\u0006\u0010A\u001a\u00020*J\u0014\u0010B\u001a\u00020 2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DJ,\u0010F\u001a\b\u0012\u0004\u0012\u00020H0G2\u001e\u0010I\u001a\u001a\u0012\n\u0012\b\u0018\u00010\u0017j\u0002`K\u0012\n\u0012\b\u0018\u00010\u0017j\u0002`L0JJ\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020N0G2\u0006\u00107\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001a0\u00190\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020#0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "Lcom/robinhood/store/Store;", "educationApi", "Lcom/robinhood/android/api/education/EducationApi;", "startedEducationLessonsPref", "Lcom/robinhood/prefs/StringPreference;", "completedEducationLessonsPref", "educationLessonsFirstShownTimestampPref", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "homeDao", "Lcom/robinhood/shared/models/dao/EducationHomeDao;", "seriesDao", "Lcom/robinhood/shared/models/dao/EducationSeriesDao;", "lessonDao", "Lcom/robinhood/shared/models/dao/EducationLessonDao;", "<init>", "(Lcom/robinhood/android/api/education/EducationApi;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/shared/models/dao/EducationHomeDao;Lcom/robinhood/shared/models/dao/EducationSeriesDao;Lcom/robinhood/shared/models/dao/EducationLessonDao;)V", "stringSetAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "stringLongMapAdapter", "", "", "completedLessonIds", "getCompletedLessonIds", "()Ljava/util/Set;", "homeEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/shared/models/api/bonfire/education/lesson/ApiEducationHome;", "seriesEndpoint", "Lcom/robinhood/shared/models/api/bonfire/education/lesson/ApiEducationSeries;", "lessonEndpoint", "Lcom/robinhood/librobinhood/data/store/bonfire/LessonParams;", "Lcom/robinhood/shared/models/api/bonfire/education/lesson/ApiEducationLesson;", "refreshEducationHome", "Lio/reactivex/Completable;", "force", "", "streamEducationHome", "Lio/reactivex/Observable;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationHome;", "fetchEducationSeries", "seriesId", "refreshEducationSeries", "Lkotlinx/coroutines/Job;", "streamEducationSeries", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSeries;", "coStreamEducationSeries", "Lkotlinx/coroutines/flow/Flow;", "refreshEducationLesson", "lessonId", "source", "streamEducationLesson", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;", "streamEducationLessonMaybe", "Lio/reactivex/Maybe;", "setLessonStarted", "trackingId", "isStarted", "setLessonCompletion", "isComplete", "setLessonsAppearanceTimestamps", "lessons", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "fetchLessonEarnability", "Lio/reactivex/Single;", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationEarnability;", "lessonIdOrAssetId", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/librobinhood/data/store/bonfire/lessonId;", "Lcom/robinhood/librobinhood/data/store/bonfire/assetId;", "claimLessonReward", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationClaimRewardResult;", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class EducationLessonsStore extends Store {
    private final StringPreference completedEducationLessonsPref;
    private final EducationApi educationApi;
    private final StringPreference educationLessonsFirstShownTimestampPref;
    private final EducationHomeDao homeDao;
    private final Endpoint<Unit, ApiEducationHome> homeEndpoint;
    private final EducationLessonDao lessonDao;
    private final Endpoint<LessonParams, ApiEducationLesson> lessonEndpoint;
    private final EducationSeriesDao seriesDao;
    private final Endpoint<String, ApiEducationSeries> seriesEndpoint;
    private final StringPreference startedEducationLessonsPref;
    private final JsonAdapter<Map<String, Long>> stringLongMapAdapter;
    private final JsonAdapter<Set<String>> stringSetAdapter;

    public final Single<ApiEducationEarnability> fetchLessonEarnability(Either<String, String> lessonIdOrAssetId) {
        Intrinsics.checkNotNullParameter(lessonIdOrAssetId, "lessonIdOrAssetId");
        if (!(lessonIdOrAssetId instanceof Either.Left)) {
            if (!(lessonIdOrAssetId instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            return RxFactory.DefaultImpls.rxSingle$default(this, null, new EducationLessonsStore$fetchLessonEarnability$2$1(this, (String) ((Either.Right) lessonIdOrAssetId).getValue(), null), 1, null);
        }
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new EducationLessonsStore$fetchLessonEarnability$1$1(this, (String) ((Either.Left) lessonIdOrAssetId).getValue(), null), 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationLessonsStore(EducationApi educationApi, @StartedEducationLessonsPref StringPreference startedEducationLessonsPref, @CompletedEducationLessonsPref StringPreference completedEducationLessonsPref, @EducationLessonsFirstShownTimestampPref StringPreference educationLessonsFirstShownTimestampPref, LazyMoshi moshi, StoreBundle storeBundle, EducationHomeDao homeDao, EducationSeriesDao seriesDao, EducationLessonDao lessonDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(educationApi, "educationApi");
        Intrinsics.checkNotNullParameter(startedEducationLessonsPref, "startedEducationLessonsPref");
        Intrinsics.checkNotNullParameter(completedEducationLessonsPref, "completedEducationLessonsPref");
        Intrinsics.checkNotNullParameter(educationLessonsFirstShownTimestampPref, "educationLessonsFirstShownTimestampPref");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(homeDao, "homeDao");
        Intrinsics.checkNotNullParameter(seriesDao, "seriesDao");
        Intrinsics.checkNotNullParameter(lessonDao, "lessonDao");
        this.educationApi = educationApi;
        this.startedEducationLessonsPref = startedEducationLessonsPref;
        this.completedEducationLessonsPref = completedEducationLessonsPref;
        this.educationLessonsFirstShownTimestampPref = educationLessonsFirstShownTimestampPref;
        this.homeDao = homeDao;
        this.seriesDao = seriesDao;
        this.lessonDao = lessonDao;
        Types types = Types.INSTANCE;
        this.stringSetAdapter = moshi.adapter(new TypeToken<Set<? extends String>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$special$$inlined$getAdapter$1
        }.getType());
        this.stringLongMapAdapter = moshi.adapter(new TypeToken<Map<String, Long>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$special$$inlined$getAdapter$2
        }.getType());
        Endpoint.Companion companion = Endpoint.INSTANCE;
        EducationLessonsStore$homeEndpoint$1 educationLessonsStore$homeEndpoint$1 = new EducationLessonsStore$homeEndpoint$1(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        EducationLessonsStore$homeEndpoint$2 educationLessonsStore$homeEndpoint$2 = new EducationLessonsStore$homeEndpoint$2(this, null);
        Clock clock = storeBundle.getClock();
        Durations durations = Durations.INSTANCE;
        this.homeEndpoint = companion.create(educationLessonsStore$homeEndpoint$1, logoutKillswitch, educationLessonsStore$homeEndpoint$2, clock, new DefaultStaleDecider(durations.getTHIRTY_MINUTES(), storeBundle.getClock()));
        this.seriesEndpoint = companion.create(new EducationLessonsStore$seriesEndpoint$1(educationApi), getLogoutKillswitch(), new EducationLessonsStore$seriesEndpoint$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getTHIRTY_MINUTES(), storeBundle.getClock()));
        this.lessonEndpoint = companion.createWithParams(new EducationLessonsStore$lessonEndpoint$1(this, null), getLogoutKillswitch(), new EducationLessonsStore$lessonEndpoint$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getTHIRTY_MINUTES(), storeBundle.getClock()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> getCompletedLessonIds() {
        Set<String> setFromJson;
        String str = this.completedEducationLessonsPref.get();
        return (str == null || (setFromJson = this.stringSetAdapter.fromJson(str)) == null) ? SetsKt.emptySet() : setFromJson;
    }

    /* compiled from: EducationLessonsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$refreshEducationHome$1", m3645f = "EducationLessonsStore.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$refreshEducationHome$1 */
    static final class C344961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C344961(Continuation<? super C344961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EducationLessonsStore.this.new C344961(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = EducationLessonsStore.this.homeEndpoint;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Completable refreshEducationHome(boolean force) {
        if (force) {
            return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344961(null), 1, null);
        }
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344972(null), 1, null);
    }

    /* compiled from: EducationLessonsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$refreshEducationHome$2", m3645f = "EducationLessonsStore.kt", m3646l = {95}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$refreshEducationHome$2 */
    static final class C344972 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C344972(Continuation<? super C344972> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EducationLessonsStore.this.new C344972(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = EducationLessonsStore.this.homeEndpoint;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (Endpoint.DefaultImpls.fetch$default(endpoint, unit, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Observable<EducationHome> streamEducationHome() {
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.homeDao.get())));
    }

    /* compiled from: EducationLessonsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$fetchEducationSeries$1", m3645f = "EducationLessonsStore.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$fetchEducationSeries$1 */
    static final class C344941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $seriesId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344941(String str, Continuation<? super C344941> continuation) {
            super(2, continuation);
            this.$seriesId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EducationLessonsStore.this.new C344941(this.$seriesId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = EducationLessonsStore.this.seriesEndpoint;
                String str = this.$seriesId;
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Completable fetchEducationSeries(String seriesId, boolean force) {
        Intrinsics.checkNotNullParameter(seriesId, "seriesId");
        if (force) {
            return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344941(seriesId, null), 1, null);
        }
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344952(seriesId, null), 1, null);
    }

    /* compiled from: EducationLessonsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$fetchEducationSeries$2", m3645f = "EducationLessonsStore.kt", m3646l = {108}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$fetchEducationSeries$2 */
    static final class C344952 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $seriesId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344952(String str, Continuation<? super C344952> continuation) {
            super(2, continuation);
            this.$seriesId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EducationLessonsStore.this.new C344952(this.$seriesId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344952) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = EducationLessonsStore.this.seriesEndpoint;
                String str = this.$seriesId;
                this.label = 1;
                if (Endpoint.DefaultImpls.fetch$default(endpoint, str, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Job refreshEducationSeries(String seriesId, boolean force) {
        Intrinsics.checkNotNullParameter(seriesId, "seriesId");
        return Endpoint.DefaultImpls.refresh$default(this.seriesEndpoint, seriesId, force, null, 4, null);
    }

    public final Observable<EducationSeries> streamEducationSeries(String seriesId) {
        Intrinsics.checkNotNullParameter(seriesId, "seriesId");
        return asObservable(coStreamEducationSeries(seriesId));
    }

    public final Flow<EducationSeries> coStreamEducationSeries(String seriesId) {
        Intrinsics.checkNotNullParameter(seriesId, "seriesId");
        return takeWhileLoggedIn(FlowKt.filterNotNull(this.seriesDao.get(seriesId)));
    }

    /* compiled from: EducationLessonsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$refreshEducationLesson$1", m3645f = "EducationLessonsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$refreshEducationLesson$1 */
    static final class C344981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $lessonId;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344981(String str, String str2, Continuation<? super C344981> continuation) {
            super(2, continuation);
            this.$lessonId = str;
            this.$source = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EducationLessonsStore.this.new C344981(this.$lessonId, this.$source, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = EducationLessonsStore.this.lessonEndpoint;
                LessonParams lessonParams = new LessonParams(this.$lessonId, this.$source);
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, lessonParams, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Completable refreshEducationLesson(String lessonId, String source, boolean force) {
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        Intrinsics.checkNotNullParameter(source, "source");
        if (force) {
            return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344981(lessonId, source, null), 1, null);
        }
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344992(lessonId, source, null), 1, null);
    }

    /* compiled from: EducationLessonsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$refreshEducationLesson$2", m3645f = "EducationLessonsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$refreshEducationLesson$2 */
    static final class C344992 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $lessonId;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344992(String str, String str2, Continuation<? super C344992> continuation) {
            super(2, continuation);
            this.$lessonId = str;
            this.$source = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EducationLessonsStore.this.new C344992(this.$lessonId, this.$source, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344992) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = EducationLessonsStore.this.lessonEndpoint;
                LessonParams lessonParams = new LessonParams(this.$lessonId, this.$source);
                this.label = 1;
                if (Endpoint.DefaultImpls.fetch$default(endpoint, lessonParams, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Observable<EducationLesson> streamEducationLesson(String lessonId, String source) {
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        Intrinsics.checkNotNullParameter(source, "source");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.lessonDao.get(lessonId, source))));
    }

    public final Maybe<EducationLesson> streamEducationLessonMaybe(String lessonId, String source) {
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        Intrinsics.checkNotNullParameter(source, "source");
        final Flow flowTake = FlowKt.take(this.lessonDao.get(lessonId, source), 1);
        Maybe<EducationLesson> maybeFirstElement = asObservable(takeWhileLoggedIn(new Flow<EducationLesson>() { // from class: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$streamEducationLessonMaybe$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super EducationLesson> flowCollector, Continuation continuation) {
                Object objCollect = flowTake.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$streamEducationLessonMaybe$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$streamEducationLessonMaybe$$inlined$mapNotNull$1$2", m3645f = "EducationLessonsStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$streamEducationLessonMaybe$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        EducationLesson educationLesson = (EducationLesson) obj;
                        if (educationLesson != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(educationLesson, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        })).firstElement();
        Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "firstElement(...)");
        return maybeFirstElement;
    }

    public final void setLessonStarted(String trackingId, boolean isStarted) {
        Set<String> setEmptySet;
        Set<String> setMinus;
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        String str = this.startedEducationLessonsPref.get();
        if (str == null || (setEmptySet = this.stringSetAdapter.fromJson(str)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        if (isStarted) {
            setMinus = SetsKt.plus(setEmptySet, trackingId);
        } else {
            setMinus = SetsKt.minus(setEmptySet, trackingId);
        }
        this.startedEducationLessonsPref.set(this.stringSetAdapter.toJson(setMinus));
    }

    public final void setLessonCompletion(String trackingId, boolean isComplete) {
        Set<String> setMinus;
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        if (isComplete) {
            setMinus = SetsKt.plus(getCompletedLessonIds(), trackingId);
        } else {
            setMinus = SetsKt.minus(getCompletedLessonIds(), trackingId);
        }
        this.completedEducationLessonsPref.set(this.stringSetAdapter.toJson(setMinus));
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C345001(trackingId, isComplete, null), 3, null);
    }

    /* compiled from: EducationLessonsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$setLessonCompletion$1", m3645f = "EducationLessonsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$setLessonCompletion$1 */
    static final class C345001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isComplete;
        final /* synthetic */ String $trackingId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345001(String str, boolean z, Continuation<? super C345001> continuation) {
            super(2, continuation);
            this.$trackingId = str;
            this.$isComplete = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EducationLessonsStore.this.new C345001(this.$trackingId, this.$isComplete, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C345001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EducationLessonDao educationLessonDao = EducationLessonsStore.this.lessonDao;
                String str = this.$trackingId;
                boolean z = this.$isComplete;
                this.label = 1;
                if (educationLessonDao.updateLessonCompletion(str, z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void setLessonsAppearanceTimestamps(List<EducationLessonPreview> lessons) {
        Map<String, Long> linkedHashMap;
        Intrinsics.checkNotNullParameter(lessons, "lessons");
        if (lessons.isEmpty()) {
            return;
        }
        String str = this.educationLessonsFirstShownTimestampPref.get();
        if (str == null || (linkedHashMap = this.stringLongMapAdapter.fromJson(str)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        Iterator<T> it = lessons.iterator();
        while (it.hasNext()) {
            linkedHashMap.putIfAbsent(((EducationLessonPreview) it.next()).getTrackingId(), Long.valueOf(System.currentTimeMillis()));
        }
        this.educationLessonsFirstShownTimestampPref.set(this.stringLongMapAdapter.toJson(linkedHashMap));
    }

    /* compiled from: EducationLessonsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationClaimRewardResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$claimLessonReward$1", m3645f = "EducationLessonsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore$claimLessonReward$1 */
    static final class C344931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiEducationClaimRewardResult>, Object> {
        final /* synthetic */ String $lessonId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344931(String str, Continuation<? super C344931> continuation) {
            super(2, continuation);
            this.$lessonId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EducationLessonsStore.this.new C344931(this.$lessonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiEducationClaimRewardResult> continuation) {
            return ((C344931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            EducationApi educationApi = EducationLessonsStore.this.educationApi;
            String str = this.$lessonId;
            this.label = 1;
            Object objClaimLearnAndEarnReward = educationApi.claimLearnAndEarnReward(str, AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO, this);
            return objClaimLearnAndEarnReward == coroutine_suspended ? coroutine_suspended : objClaimLearnAndEarnReward;
        }
    }

    public final Single<ApiEducationClaimRewardResult> claimLessonReward(String lessonId) {
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344931(lessonId, null), 1, null);
    }
}
