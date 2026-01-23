package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.education.EducationApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.models.dao.EducationHomeDao;
import com.robinhood.shared.models.dao.EducationLessonDao;
import com.robinhood.shared.models.dao.EducationSeriesDao;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "educationApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/education/EducationApi;", "startedEducationLessonsPref", "Lcom/robinhood/prefs/StringPreference;", "completedEducationLessonsPref", "educationLessonsFirstShownTimestampPref", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "homeDao", "Lcom/robinhood/shared/models/dao/EducationHomeDao;", "seriesDao", "Lcom/robinhood/shared/models/dao/EducationSeriesDao;", "lessonDao", "Lcom/robinhood/shared/models/dao/EducationLessonDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EducationLessonsStore_Factory implements Factory<EducationLessonsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<StringPreference> completedEducationLessonsPref;
    private final Provider<EducationApi> educationApi;
    private final Provider<StringPreference> educationLessonsFirstShownTimestampPref;
    private final Provider<EducationHomeDao> homeDao;
    private final Provider<EducationLessonDao> lessonDao;
    private final Provider<LazyMoshi> moshi;
    private final Provider<EducationSeriesDao> seriesDao;
    private final Provider<StringPreference> startedEducationLessonsPref;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final EducationLessonsStore_Factory create(Provider<EducationApi> provider, Provider<StringPreference> provider2, Provider<StringPreference> provider3, Provider<StringPreference> provider4, Provider<LazyMoshi> provider5, Provider<StoreBundle> provider6, Provider<EducationHomeDao> provider7, Provider<EducationSeriesDao> provider8, Provider<EducationLessonDao> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final EducationLessonsStore newInstance(EducationApi educationApi, StringPreference stringPreference, StringPreference stringPreference2, StringPreference stringPreference3, LazyMoshi lazyMoshi, StoreBundle storeBundle, EducationHomeDao educationHomeDao, EducationSeriesDao educationSeriesDao, EducationLessonDao educationLessonDao) {
        return INSTANCE.newInstance(educationApi, stringPreference, stringPreference2, stringPreference3, lazyMoshi, storeBundle, educationHomeDao, educationSeriesDao, educationLessonDao);
    }

    public EducationLessonsStore_Factory(Provider<EducationApi> educationApi, Provider<StringPreference> startedEducationLessonsPref, Provider<StringPreference> completedEducationLessonsPref, Provider<StringPreference> educationLessonsFirstShownTimestampPref, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle, Provider<EducationHomeDao> homeDao, Provider<EducationSeriesDao> seriesDao, Provider<EducationLessonDao> lessonDao) {
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
        this.moshi = moshi;
        this.storeBundle = storeBundle;
        this.homeDao = homeDao;
        this.seriesDao = seriesDao;
        this.lessonDao = lessonDao;
    }

    @Override // javax.inject.Provider
    public EducationLessonsStore get() {
        Companion companion = INSTANCE;
        EducationApi educationApi = this.educationApi.get();
        Intrinsics.checkNotNullExpressionValue(educationApi, "get(...)");
        StringPreference stringPreference = this.startedEducationLessonsPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.completedEducationLessonsPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        StringPreference stringPreference3 = this.educationLessonsFirstShownTimestampPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference3, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        EducationHomeDao educationHomeDao = this.homeDao.get();
        Intrinsics.checkNotNullExpressionValue(educationHomeDao, "get(...)");
        EducationSeriesDao educationSeriesDao = this.seriesDao.get();
        Intrinsics.checkNotNullExpressionValue(educationSeriesDao, "get(...)");
        EducationLessonDao educationLessonDao = this.lessonDao.get();
        Intrinsics.checkNotNullExpressionValue(educationLessonDao, "get(...)");
        return companion.newInstance(educationApi, stringPreference, stringPreference2, stringPreference3, lazyMoshi, storeBundle, educationHomeDao, educationSeriesDao, educationLessonDao);
    }

    /* compiled from: EducationLessonsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JP\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore_Factory;", "educationApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/education/EducationApi;", "startedEducationLessonsPref", "Lcom/robinhood/prefs/StringPreference;", "completedEducationLessonsPref", "educationLessonsFirstShownTimestampPref", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "homeDao", "Lcom/robinhood/shared/models/dao/EducationHomeDao;", "seriesDao", "Lcom/robinhood/shared/models/dao/EducationSeriesDao;", "lessonDao", "Lcom/robinhood/shared/models/dao/EducationLessonDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EducationLessonsStore_Factory create(Provider<EducationApi> educationApi, Provider<StringPreference> startedEducationLessonsPref, Provider<StringPreference> completedEducationLessonsPref, Provider<StringPreference> educationLessonsFirstShownTimestampPref, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle, Provider<EducationHomeDao> homeDao, Provider<EducationSeriesDao> seriesDao, Provider<EducationLessonDao> lessonDao) {
            Intrinsics.checkNotNullParameter(educationApi, "educationApi");
            Intrinsics.checkNotNullParameter(startedEducationLessonsPref, "startedEducationLessonsPref");
            Intrinsics.checkNotNullParameter(completedEducationLessonsPref, "completedEducationLessonsPref");
            Intrinsics.checkNotNullParameter(educationLessonsFirstShownTimestampPref, "educationLessonsFirstShownTimestampPref");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(homeDao, "homeDao");
            Intrinsics.checkNotNullParameter(seriesDao, "seriesDao");
            Intrinsics.checkNotNullParameter(lessonDao, "lessonDao");
            return new EducationLessonsStore_Factory(educationApi, startedEducationLessonsPref, completedEducationLessonsPref, educationLessonsFirstShownTimestampPref, moshi, storeBundle, homeDao, seriesDao, lessonDao);
        }

        @JvmStatic
        public final EducationLessonsStore newInstance(EducationApi educationApi, StringPreference startedEducationLessonsPref, StringPreference completedEducationLessonsPref, StringPreference educationLessonsFirstShownTimestampPref, LazyMoshi moshi, StoreBundle storeBundle, EducationHomeDao homeDao, EducationSeriesDao seriesDao, EducationLessonDao lessonDao) {
            Intrinsics.checkNotNullParameter(educationApi, "educationApi");
            Intrinsics.checkNotNullParameter(startedEducationLessonsPref, "startedEducationLessonsPref");
            Intrinsics.checkNotNullParameter(completedEducationLessonsPref, "completedEducationLessonsPref");
            Intrinsics.checkNotNullParameter(educationLessonsFirstShownTimestampPref, "educationLessonsFirstShownTimestampPref");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(homeDao, "homeDao");
            Intrinsics.checkNotNullParameter(seriesDao, "seriesDao");
            Intrinsics.checkNotNullParameter(lessonDao, "lessonDao");
            return new EducationLessonsStore(educationApi, startedEducationLessonsPref, completedEducationLessonsPref, educationLessonsFirstShownTimestampPref, moshi, storeBundle, homeDao, seriesDao, lessonDao);
        }
    }
}
