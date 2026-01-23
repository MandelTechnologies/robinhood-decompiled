package com.robinhood.shared.education.p377ui.home;

import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.shared.models.p387db.bonfire.education.EducationUserProgress;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationHome;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationHomeData;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSeries;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import okhttp3.HttpUrl;

/* compiled from: EducationHomeViewState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000245B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÂ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÂ\u0003J\t\u0010.\u001a\u00020\nHÂ\u0003J7\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0016HÖ\u0001J\t\u00103\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0014R\u0013\u0010)\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b*\u0010\u001e¨\u00066"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/home/EducationHomeViewState;", "", "status", "Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status;", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "userProgressList", "", "Lcom/robinhood/shared/models/db/bonfire/education/EducationUserProgress;", "hasViewedLesson", "", "<init>", "(Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status;Lcom/robinhood/android/designsystem/style/DayNightOverlay;Ljava/util/List;Z)V", "getStatus", "()Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status;", EducationSource.EDUCATION_SOURCE_EDUCATION_HOME, "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationHome;", "lessonsTrackingIds", "", "getLessonsTrackingIds", "()Ljava/util/List;", "foregroundColor", "", "getForegroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "backgroundColor", "getBackgroundColor", "title", "getTitle", "()Ljava/lang/String;", "educationHomeIdentifier", "getEducationHomeIdentifier", "userProgressMap", "", "series", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSeries;", "getSeries", "lessons", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "getLessons", "exitSurveyEvent", "getExitSurveyEvent", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Status", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class EducationHomeViewState {
    private static final EducationHomeViewState loadingMock;
    private final Integer backgroundColor;
    private final DayNightOverlay dayNightOverlay;
    private final EducationHome educationHome;
    private final String educationHomeIdentifier;
    private final Integer foregroundColor;
    private final boolean hasViewedLesson;
    private final List<EducationLessonPreview> lessons;
    private final List<String> lessonsTrackingIds;
    private final List<EducationSeries> series;
    private final Status status;
    private final String title;
    private final List<EducationUserProgress> userProgressList;
    private final Map<String, Integer> userProgressMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EducationHomeViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EducationHomeViewState() {
        this(null, null, null, false, 15, null);
    }

    /* renamed from: component2, reason: from getter */
    private final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    private final List<EducationUserProgress> component3() {
        return this.userProgressList;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getHasViewedLesson() {
        return this.hasViewedLesson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EducationHomeViewState copy$default(EducationHomeViewState educationHomeViewState, Status status, DayNightOverlay dayNightOverlay, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            status = educationHomeViewState.status;
        }
        if ((i & 2) != 0) {
            dayNightOverlay = educationHomeViewState.dayNightOverlay;
        }
        if ((i & 4) != 0) {
            list = educationHomeViewState.userProgressList;
        }
        if ((i & 8) != 0) {
            z = educationHomeViewState.hasViewedLesson;
        }
        return educationHomeViewState.copy(status, dayNightOverlay, list, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final EducationHomeViewState copy(Status status, DayNightOverlay dayNightOverlay, List<EducationUserProgress> userProgressList, boolean hasViewedLesson) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        Intrinsics.checkNotNullParameter(userProgressList, "userProgressList");
        return new EducationHomeViewState(status, dayNightOverlay, userProgressList, hasViewedLesson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationHomeViewState)) {
            return false;
        }
        EducationHomeViewState educationHomeViewState = (EducationHomeViewState) other;
        return Intrinsics.areEqual(this.status, educationHomeViewState.status) && this.dayNightOverlay == educationHomeViewState.dayNightOverlay && Intrinsics.areEqual(this.userProgressList, educationHomeViewState.userProgressList) && this.hasViewedLesson == educationHomeViewState.hasViewedLesson;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.dayNightOverlay.hashCode()) * 31) + this.userProgressList.hashCode()) * 31) + Boolean.hashCode(this.hasViewedLesson);
    }

    public String toString() {
        return "EducationHomeViewState(status=" + this.status + ", dayNightOverlay=" + this.dayNightOverlay + ", userProgressList=" + this.userProgressList + ", hasViewedLesson=" + this.hasViewedLesson + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EducationHomeViewState(Status status, DayNightOverlay dayNightOverlay, List<EducationUserProgress> userProgressList, boolean z) {
        List<String> listDistinct;
        EducationHomeData homeData;
        Integer numValueOf;
        EducationHomeData homeData2;
        Integer numValueOf2;
        List<EducationSeries> listEmptyList;
        List<EducationSeries> series;
        EducationHomeData homeData3;
        EducationHomeData homeData4;
        EducationHomeData homeData5;
        EducationHomeData homeData6;
        List<EducationSeries> series2;
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        Intrinsics.checkNotNullParameter(userProgressList, "userProgressList");
        this.status = status;
        this.dayNightOverlay = dayNightOverlay;
        this.userProgressList = userProgressList;
        this.hasViewedLesson = z;
        String analyticsId = null;
        Status.Success success = status instanceof Status.Success ? (Status.Success) status : null;
        EducationHome educationHome = success != null ? success.getEducationHome() : null;
        this.educationHome = educationHome;
        if (educationHome == null || (series2 = educationHome.getSeries()) == null) {
            listDistinct = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = series2.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((EducationSeries) it.next()).getLessons());
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((EducationLessonPreview) it2.next()).getTrackingId());
            }
            listDistinct = CollectionsKt.distinct(arrayList2);
        }
        this.lessonsTrackingIds = listDistinct;
        DayNightOverlay dayNightOverlay2 = this.dayNightOverlay;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[dayNightOverlay2.ordinal()];
        if (i == 1) {
            EducationHome educationHome2 = this.educationHome;
            if (educationHome2 != null && (homeData = educationHome2.getHomeData()) != null) {
                numValueOf = Integer.valueOf(homeData.getDayForegroundColor());
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            EducationHome educationHome3 = this.educationHome;
            numValueOf = (educationHome3 == null || (homeData6 = educationHome3.getHomeData()) == null) ? null : Integer.valueOf(homeData6.getNightForegroundColor());
        }
        this.foregroundColor = numValueOf;
        int i2 = iArr[this.dayNightOverlay.ordinal()];
        if (i2 == 1) {
            EducationHome educationHome4 = this.educationHome;
            if (educationHome4 != null && (homeData2 = educationHome4.getHomeData()) != null) {
                numValueOf2 = Integer.valueOf(homeData2.getDayBackgroundColor());
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            EducationHome educationHome5 = this.educationHome;
            numValueOf2 = (educationHome5 == null || (homeData5 = educationHome5.getHomeData()) == null) ? null : Integer.valueOf(homeData5.getNightBackgroundColor());
        }
        this.backgroundColor = numValueOf2;
        EducationHome educationHome6 = this.educationHome;
        String title = (educationHome6 == null || (homeData4 = educationHome6.getHomeData()) == null) ? null : homeData4.getTitle();
        this.title = title == null ? "" : title;
        EducationHome educationHome7 = this.educationHome;
        if (educationHome7 != null && (homeData3 = educationHome7.getHomeData()) != null) {
            analyticsId = homeData3.getAnalyticsId();
        }
        this.educationHomeIdentifier = analyticsId != null ? analyticsId : "";
        List<EducationUserProgress> list = this.userProgressList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (EducationUserProgress educationUserProgress : list) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(educationUserProgress.getTrackingId(), Integer.valueOf(educationUserProgress.getPercentComplete()));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        this.userProgressMap = linkedHashMap;
        EducationHome educationHome8 = this.educationHome;
        if (educationHome8 == null || (series = educationHome8.getSeries()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            List<EducationSeries> list2 = series;
            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (EducationSeries educationSeries : list2) {
                List<EducationLessonPreview> lessons = educationSeries.getLessons();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(lessons, 10));
                for (EducationLessonPreview educationLessonPreview : lessons) {
                    Integer num = this.userProgressMap.get(educationLessonPreview.getTrackingId());
                    arrayList3.add(EducationLessonPreview.copy$default(educationLessonPreview, null, null, null, 0, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, num != null && num.intValue() == 100, false, 0, 458751, null));
                }
                listEmptyList.add(EducationSeries.copy$default(educationSeries, null, null, null, null, null, arrayList3, 31, null));
            }
        }
        this.series = listEmptyList;
        ArrayList arrayList4 = new ArrayList();
        Iterator<T> it3 = listEmptyList.iterator();
        while (it3.hasNext()) {
            CollectionsKt.addAll(arrayList4, ((EducationSeries) it3.next()).getLessons());
        }
        this.lessons = arrayList4;
    }

    public /* synthetic */ EducationHomeViewState(Status status, DayNightOverlay dayNightOverlay, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Status.Loading.INSTANCE : status, (i & 2) != 0 ? DayNightOverlay.DAY : dayNightOverlay, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? false : z);
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<String> getLessonsTrackingIds() {
        return this.lessonsTrackingIds;
    }

    public final Integer getForegroundColor() {
        return this.foregroundColor;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getEducationHomeIdentifier() {
        return this.educationHomeIdentifier;
    }

    public final List<EducationSeries> getSeries() {
        return this.series;
    }

    public final List<EducationLessonPreview> getLessons() {
        return this.lessons;
    }

    public final String getExitSurveyEvent() {
        EducationHome educationHome = this.educationHome;
        if (educationHome == null) {
            return null;
        }
        if (this.hasViewedLesson) {
            return educationHome.getHomeData().getViewedLessonSurveyEvent();
        }
        return educationHome.getHomeData().getNotViewedLessonSurveyEvent();
    }

    /* compiled from: EducationHomeViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status;", "", "<init>", "()V", "Loading", "Success", "Failure", "Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status$Failure;", "Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status$Loading;", "Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status$Success;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Status {
        public static final int $stable = 0;

        public /* synthetic */ Status(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: EducationHomeViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status$Loading;", "Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading extends Status {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -604239206;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
                super(null);
            }
        }

        private Status() {
        }

        /* compiled from: EducationHomeViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status$Success;", "Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status;", EducationSource.EDUCATION_SOURCE_EDUCATION_HOME, "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationHome;", "<init>", "(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationHome;)V", "getEducationHome", "()Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationHome;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Status {
            public static final int $stable = 8;
            private final EducationHome educationHome;

            public static /* synthetic */ Success copy$default(Success success, EducationHome educationHome, int i, Object obj) {
                if ((i & 1) != 0) {
                    educationHome = success.educationHome;
                }
                return success.copy(educationHome);
            }

            /* renamed from: component1, reason: from getter */
            public final EducationHome getEducationHome() {
                return this.educationHome;
            }

            public final Success copy(EducationHome educationHome) {
                Intrinsics.checkNotNullParameter(educationHome, "educationHome");
                return new Success(educationHome);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.educationHome, ((Success) other).educationHome);
            }

            public int hashCode() {
                return this.educationHome.hashCode();
            }

            public String toString() {
                return "Success(educationHome=" + this.educationHome + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(EducationHome educationHome) {
                super(null);
                Intrinsics.checkNotNullParameter(educationHome, "educationHome");
                this.educationHome = educationHome;
            }

            public final EducationHome getEducationHome() {
                return this.educationHome;
            }
        }

        /* compiled from: EducationHomeViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status$Failure;", "Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Status;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends Status {
            public static final int $stable = 0;
            public static final Failure INSTANCE = new Failure();

            public boolean equals(Object other) {
                return this == other || (other instanceof Failure);
            }

            public int hashCode() {
                return -2027463960;
            }

            public String toString() {
                return "Failure";
            }

            private Failure() {
                super(null);
            }
        }
    }

    /* compiled from: EducationHomeViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/home/EducationHomeViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/shared/education/ui/home/EducationHomeViewState;", "getLoadingMock$feature_education_externalDebug", "()Lcom/robinhood/shared/education/ui/home/EducationHomeViewState;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EducationHomeViewState getLoadingMock$feature_education_externalDebug() {
            return EducationHomeViewState.loadingMock;
        }
    }

    static {
        List listListOf = CollectionsKt.listOf((Object[]) new EducationLesson.LessonTemplateType[]{EducationLesson.LessonTemplateType.STANDARD, EducationLesson.LessonTemplateType.CARD_STACK});
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        EducationLessonPreview educationLessonPreview = new EducationLessonPreview("", "", "", 0, listListOf, "------------", "------------", 0, 0, 0, 0, 0, companion.get("https://127.0.0.1"), companion.get("https://127.0.0.1"), null, null, false, false, 0, 294912, null);
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
        Iterator<Integer> it = primitiveRanges2Until.iterator();
        while (it.hasNext()) {
            ((PrimitiveIterators6) it).nextInt();
            arrayList.add(educationLessonPreview);
        }
        EducationSeries educationSeries = new EducationSeries("", "", null, "------------", "------------", arrayList, 4, null);
        EducationHomeData educationHomeData = new EducationHomeData("", "", "------------", 0, 0, 0, 0, null, null);
        PrimitiveRanges2 primitiveRanges2Until2 = RangesKt.until(0, 2);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until2, 10));
        Iterator<Integer> it2 = primitiveRanges2Until2.iterator();
        while (it2.hasNext()) {
            ((PrimitiveIterators6) it2).nextInt();
            arrayList2.add(educationSeries);
        }
        loadingMock = new EducationHomeViewState(new Status.Success(new EducationHome(educationHomeData, arrayList2)), DayNightOverlay.DAY, CollectionsKt.listOf(new EducationUserProgress("", EducationUserProgress.ContentType.LESSON, EducationUserProgress.StatusType.ENGAGED, 0)), false);
    }
}
