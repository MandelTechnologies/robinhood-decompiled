package com.robinhood.android.search.newsfeed;

import com.robinhood.android.newsfeed.extensions.NewsFeedElements;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.search.newsfeed.view.NewsfeedHeaderChange;
import com.robinhood.models.newsfeed.p334db.NewsFeedContent;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.shared.models.api.bonfire.education.lesson.ApiLessonPreview;
import com.robinhood.shared.models.p387db.bonfire.education.EducationUserProgress;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: NewsFeedViewState.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0001dB¯\u0002\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u0018\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001d0\u0018\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0014¢\u0006\u0004\b&\u0010'J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u00032\u0006\u0010J\u001a\u00020\u0012H\u0002J \u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010L\u001a\u00020\u0012H\u0002J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J\t\u0010O\u001a\u00020\tHÂ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u0010Q\u001a\u00020\tHÂ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÂ\u0003J\u001f\u0010S\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0010HÂ\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014HÆ\u0003J\u0015\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u0018HÆ\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006HÆ\u0003J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006HÆ\u0003J\u0015\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001d0\u0018HÆ\u0003J\t\u0010Z\u001a\u00020\tHÆ\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020 0\u0003HÆ\u0003J\u0011\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014HÆ\u0003J\t\u0010]\u001a\u00020#HÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0014HÆ\u0003J±\u0002\u0010_\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001d0\u00182\b\b\u0002\u0010\u001e\u001a\u00020\t2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\b\b\u0002\u0010\"\u001a\u00020#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0014HÆ\u0001J\u0013\u0010`\u001a\u00020\t2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020\u0012HÖ\u0001J\t\u0010c\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u0018¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001d0\u0018¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010)\"\u0004\b6\u00107R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u000e\u0010=\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u001a\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010A\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bB\u00102R\u0011\u0010C\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0013\u0010E\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bF\u0010G¨\u0006e"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/NewsFeedViewState;", "", "feedElements", "", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "filteredContentIds", "", "Ljava/util/UUID;", "initialLoadComplete", "", "initialLoadError", "", "autoplayVideoAudioEnabled", "educationUserProgressList", "Lcom/robinhood/shared/models/db/bonfire/education/EducationUserProgress;", "getScrollTargetIndex", "Lkotlin/Function1;", "Lcom/robinhood/android/newsfeed/model/Element;", "", "manualRefreshCompleteEvent", "Lcom/robinhood/udf/UiEvent;", "", "manualRefreshErrorEvent", "curatedListChipBadgesSeen", "", "", "startedEducationLessonIds", "completedEducationLessonIds", "educationLessonsFirstShownTimestamps", "", "shouldShowRecommendationsCard", "iacInfoBanners", "Lcom/robinhood/models/db/IacInfoBanner;", "scrollToTargetEvent", "recyclerViewItemsFetched", "Lcom/robinhood/android/search/newsfeed/NewsFeedViewState$RecyclerViewItemsFetched;", "newsfeedHeaderChangeEvent", "Lcom/robinhood/android/search/newsfeed/view/NewsfeedHeaderChange;", "<init>", "(Ljava/util/List;Ljava/util/Set;ZLjava/lang/Throwable;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;ZLjava/util/List;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/search/newsfeed/NewsFeedViewState$RecyclerViewItemsFetched;Lcom/robinhood/udf/UiEvent;)V", "getManualRefreshCompleteEvent", "()Lcom/robinhood/udf/UiEvent;", "getManualRefreshErrorEvent", "getCuratedListChipBadgesSeen", "()Ljava/util/Map;", "getStartedEducationLessonIds", "()Ljava/util/Set;", "getCompletedEducationLessonIds", "getEducationLessonsFirstShownTimestamps", "getShouldShowRecommendationsCard", "()Z", "getIacInfoBanners", "()Ljava/util/List;", "getScrollToTargetEvent", "setScrollToTargetEvent", "(Lcom/robinhood/udf/UiEvent;)V", "getRecyclerViewItemsFetched", "()Lcom/robinhood/android/search/newsfeed/NewsFeedViewState$RecyclerViewItemsFetched;", "getNewsfeedHeaderChangeEvent", "elements", "getElements", "showPopularListsCarousel", "educationTrackingIds", "getEducationTrackingIds", "educationUserProgressMap", "showInitialLoading", "getShowInitialLoading", "showInitialLoadErrorMessage", "getShowInitialLoadErrorMessage", "iacInfoBannerData", "getIacInfoBannerData", "()Lcom/robinhood/models/db/IacInfoBanner;", "getRecommendationsCardElement", "Lcom/robinhood/android/newsfeed/model/Element$RecommendationsCard;", "rank", "toElements", "rankOffset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "toString", "RecyclerViewItemsFetched", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class NewsFeedViewState {
    public static final int $stable = 8;
    private final boolean autoplayVideoAudioEnabled;
    private final Set<String> completedEducationLessonIds;
    private final Map<String, Boolean> curatedListChipBadgesSeen;
    private final Map<String, Long> educationLessonsFirstShownTimestamps;
    private final List<String> educationTrackingIds;
    private final List<EducationUserProgress> educationUserProgressList;
    private final Map<String, Integer> educationUserProgressMap;
    private final List<Element> elements;
    private final List<NewsFeedElement> feedElements;
    private final Set<UUID> filteredContentIds;
    private final Function1<List<? extends Element>, Integer> getScrollTargetIndex;
    private final IacInfoBanner iacInfoBannerData;
    private final List<IacInfoBanner> iacInfoBanners;
    private final boolean initialLoadComplete;
    private final Throwable initialLoadError;
    private final UiEvent<Unit> manualRefreshCompleteEvent;
    private final UiEvent<Throwable> manualRefreshErrorEvent;
    private final UiEvent<NewsfeedHeaderChange> newsfeedHeaderChangeEvent;
    private final RecyclerViewItemsFetched recyclerViewItemsFetched;
    private UiEvent<Integer> scrollToTargetEvent;
    private final boolean shouldShowRecommendationsCard;
    private final boolean showInitialLoadErrorMessage;
    private final boolean showInitialLoading;
    private final boolean showPopularListsCarousel;
    private final Set<String> startedEducationLessonIds;

    public NewsFeedViewState() {
        this(null, null, false, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 262143, null);
    }

    private final List<NewsFeedElement> component1() {
        return this.feedElements;
    }

    private final Set<UUID> component2() {
        return this.filteredContentIds;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getInitialLoadComplete() {
        return this.initialLoadComplete;
    }

    /* renamed from: component4, reason: from getter */
    private final Throwable getInitialLoadError() {
        return this.initialLoadError;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getAutoplayVideoAudioEnabled() {
        return this.autoplayVideoAudioEnabled;
    }

    private final List<EducationUserProgress> component6() {
        return this.educationUserProgressList;
    }

    private final Function1<List<? extends Element>, Integer> component7() {
        return this.getScrollTargetIndex;
    }

    public static /* synthetic */ NewsFeedViewState copy$default(NewsFeedViewState newsFeedViewState, List list, Set set, boolean z, Throwable th, boolean z2, List list2, Function1 function1, UiEvent uiEvent, UiEvent uiEvent2, Map map, Set set2, Set set3, Map map2, boolean z3, List list3, UiEvent uiEvent3, RecyclerViewItemsFetched recyclerViewItemsFetched, UiEvent uiEvent4, int i, Object obj) {
        UiEvent uiEvent5;
        RecyclerViewItemsFetched recyclerViewItemsFetched2;
        List list4 = (i & 1) != 0 ? newsFeedViewState.feedElements : list;
        Set set4 = (i & 2) != 0 ? newsFeedViewState.filteredContentIds : set;
        boolean z4 = (i & 4) != 0 ? newsFeedViewState.initialLoadComplete : z;
        Throwable th2 = (i & 8) != 0 ? newsFeedViewState.initialLoadError : th;
        boolean z5 = (i & 16) != 0 ? newsFeedViewState.autoplayVideoAudioEnabled : z2;
        List list5 = (i & 32) != 0 ? newsFeedViewState.educationUserProgressList : list2;
        Function1 function12 = (i & 64) != 0 ? newsFeedViewState.getScrollTargetIndex : function1;
        UiEvent uiEvent6 = (i & 128) != 0 ? newsFeedViewState.manualRefreshCompleteEvent : uiEvent;
        UiEvent uiEvent7 = (i & 256) != 0 ? newsFeedViewState.manualRefreshErrorEvent : uiEvent2;
        Map map3 = (i & 512) != 0 ? newsFeedViewState.curatedListChipBadgesSeen : map;
        Set set5 = (i & 1024) != 0 ? newsFeedViewState.startedEducationLessonIds : set2;
        Set set6 = (i & 2048) != 0 ? newsFeedViewState.completedEducationLessonIds : set3;
        Map map4 = (i & 4096) != 0 ? newsFeedViewState.educationLessonsFirstShownTimestamps : map2;
        boolean z6 = (i & 8192) != 0 ? newsFeedViewState.shouldShowRecommendationsCard : z3;
        List list6 = list4;
        List list7 = (i & 16384) != 0 ? newsFeedViewState.iacInfoBanners : list3;
        UiEvent uiEvent8 = (i & 32768) != 0 ? newsFeedViewState.scrollToTargetEvent : uiEvent3;
        RecyclerViewItemsFetched recyclerViewItemsFetched3 = (i & 65536) != 0 ? newsFeedViewState.recyclerViewItemsFetched : recyclerViewItemsFetched;
        if ((i & 131072) != 0) {
            recyclerViewItemsFetched2 = recyclerViewItemsFetched3;
            uiEvent5 = newsFeedViewState.newsfeedHeaderChangeEvent;
        } else {
            uiEvent5 = uiEvent4;
            recyclerViewItemsFetched2 = recyclerViewItemsFetched3;
        }
        return newsFeedViewState.copy(list6, set4, z4, th2, z5, list5, function12, uiEvent6, uiEvent7, map3, set5, set6, map4, z6, list7, uiEvent8, recyclerViewItemsFetched2, uiEvent5);
    }

    public final Map<String, Boolean> component10() {
        return this.curatedListChipBadgesSeen;
    }

    public final Set<String> component11() {
        return this.startedEducationLessonIds;
    }

    public final Set<String> component12() {
        return this.completedEducationLessonIds;
    }

    public final Map<String, Long> component13() {
        return this.educationLessonsFirstShownTimestamps;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShouldShowRecommendationsCard() {
        return this.shouldShowRecommendationsCard;
    }

    public final List<IacInfoBanner> component15() {
        return this.iacInfoBanners;
    }

    public final UiEvent<Integer> component16() {
        return this.scrollToTargetEvent;
    }

    /* renamed from: component17, reason: from getter */
    public final RecyclerViewItemsFetched getRecyclerViewItemsFetched() {
        return this.recyclerViewItemsFetched;
    }

    public final UiEvent<NewsfeedHeaderChange> component18() {
        return this.newsfeedHeaderChangeEvent;
    }

    public final UiEvent<Unit> component8() {
        return this.manualRefreshCompleteEvent;
    }

    public final UiEvent<Throwable> component9() {
        return this.manualRefreshErrorEvent;
    }

    public final NewsFeedViewState copy(List<NewsFeedElement> feedElements, Set<UUID> filteredContentIds, boolean initialLoadComplete, Throwable initialLoadError, boolean autoplayVideoAudioEnabled, List<EducationUserProgress> educationUserProgressList, Function1<? super List<? extends Element>, Integer> getScrollTargetIndex, UiEvent<Unit> manualRefreshCompleteEvent, UiEvent<Throwable> manualRefreshErrorEvent, Map<String, Boolean> curatedListChipBadgesSeen, Set<String> startedEducationLessonIds, Set<String> completedEducationLessonIds, Map<String, Long> educationLessonsFirstShownTimestamps, boolean shouldShowRecommendationsCard, List<IacInfoBanner> iacInfoBanners, UiEvent<Integer> scrollToTargetEvent, RecyclerViewItemsFetched recyclerViewItemsFetched, UiEvent<NewsfeedHeaderChange> newsfeedHeaderChangeEvent) {
        Intrinsics.checkNotNullParameter(feedElements, "feedElements");
        Intrinsics.checkNotNullParameter(filteredContentIds, "filteredContentIds");
        Intrinsics.checkNotNullParameter(educationUserProgressList, "educationUserProgressList");
        Intrinsics.checkNotNullParameter(curatedListChipBadgesSeen, "curatedListChipBadgesSeen");
        Intrinsics.checkNotNullParameter(startedEducationLessonIds, "startedEducationLessonIds");
        Intrinsics.checkNotNullParameter(completedEducationLessonIds, "completedEducationLessonIds");
        Intrinsics.checkNotNullParameter(educationLessonsFirstShownTimestamps, "educationLessonsFirstShownTimestamps");
        Intrinsics.checkNotNullParameter(iacInfoBanners, "iacInfoBanners");
        Intrinsics.checkNotNullParameter(recyclerViewItemsFetched, "recyclerViewItemsFetched");
        return new NewsFeedViewState(feedElements, filteredContentIds, initialLoadComplete, initialLoadError, autoplayVideoAudioEnabled, educationUserProgressList, getScrollTargetIndex, manualRefreshCompleteEvent, manualRefreshErrorEvent, curatedListChipBadgesSeen, startedEducationLessonIds, completedEducationLessonIds, educationLessonsFirstShownTimestamps, shouldShowRecommendationsCard, iacInfoBanners, scrollToTargetEvent, recyclerViewItemsFetched, newsfeedHeaderChangeEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsFeedViewState)) {
            return false;
        }
        NewsFeedViewState newsFeedViewState = (NewsFeedViewState) other;
        return Intrinsics.areEqual(this.feedElements, newsFeedViewState.feedElements) && Intrinsics.areEqual(this.filteredContentIds, newsFeedViewState.filteredContentIds) && this.initialLoadComplete == newsFeedViewState.initialLoadComplete && Intrinsics.areEqual(this.initialLoadError, newsFeedViewState.initialLoadError) && this.autoplayVideoAudioEnabled == newsFeedViewState.autoplayVideoAudioEnabled && Intrinsics.areEqual(this.educationUserProgressList, newsFeedViewState.educationUserProgressList) && Intrinsics.areEqual(this.getScrollTargetIndex, newsFeedViewState.getScrollTargetIndex) && Intrinsics.areEqual(this.manualRefreshCompleteEvent, newsFeedViewState.manualRefreshCompleteEvent) && Intrinsics.areEqual(this.manualRefreshErrorEvent, newsFeedViewState.manualRefreshErrorEvent) && Intrinsics.areEqual(this.curatedListChipBadgesSeen, newsFeedViewState.curatedListChipBadgesSeen) && Intrinsics.areEqual(this.startedEducationLessonIds, newsFeedViewState.startedEducationLessonIds) && Intrinsics.areEqual(this.completedEducationLessonIds, newsFeedViewState.completedEducationLessonIds) && Intrinsics.areEqual(this.educationLessonsFirstShownTimestamps, newsFeedViewState.educationLessonsFirstShownTimestamps) && this.shouldShowRecommendationsCard == newsFeedViewState.shouldShowRecommendationsCard && Intrinsics.areEqual(this.iacInfoBanners, newsFeedViewState.iacInfoBanners) && Intrinsics.areEqual(this.scrollToTargetEvent, newsFeedViewState.scrollToTargetEvent) && Intrinsics.areEqual(this.recyclerViewItemsFetched, newsFeedViewState.recyclerViewItemsFetched) && Intrinsics.areEqual(this.newsfeedHeaderChangeEvent, newsFeedViewState.newsfeedHeaderChangeEvent);
    }

    public int hashCode() {
        int iHashCode = ((((this.feedElements.hashCode() * 31) + this.filteredContentIds.hashCode()) * 31) + Boolean.hashCode(this.initialLoadComplete)) * 31;
        Throwable th = this.initialLoadError;
        int iHashCode2 = (((((iHashCode + (th == null ? 0 : th.hashCode())) * 31) + Boolean.hashCode(this.autoplayVideoAudioEnabled)) * 31) + this.educationUserProgressList.hashCode()) * 31;
        Function1<List<? extends Element>, Integer> function1 = this.getScrollTargetIndex;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.manualRefreshCompleteEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.manualRefreshErrorEvent;
        int iHashCode5 = (((((((((((((iHashCode4 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + this.curatedListChipBadgesSeen.hashCode()) * 31) + this.startedEducationLessonIds.hashCode()) * 31) + this.completedEducationLessonIds.hashCode()) * 31) + this.educationLessonsFirstShownTimestamps.hashCode()) * 31) + Boolean.hashCode(this.shouldShowRecommendationsCard)) * 31) + this.iacInfoBanners.hashCode()) * 31;
        UiEvent<Integer> uiEvent3 = this.scrollToTargetEvent;
        int iHashCode6 = (((iHashCode5 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31) + this.recyclerViewItemsFetched.hashCode()) * 31;
        UiEvent<NewsfeedHeaderChange> uiEvent4 = this.newsfeedHeaderChangeEvent;
        return iHashCode6 + (uiEvent4 != null ? uiEvent4.hashCode() : 0);
    }

    public String toString() {
        return "NewsFeedViewState(feedElements=" + this.feedElements + ", filteredContentIds=" + this.filteredContentIds + ", initialLoadComplete=" + this.initialLoadComplete + ", initialLoadError=" + this.initialLoadError + ", autoplayVideoAudioEnabled=" + this.autoplayVideoAudioEnabled + ", educationUserProgressList=" + this.educationUserProgressList + ", getScrollTargetIndex=" + this.getScrollTargetIndex + ", manualRefreshCompleteEvent=" + this.manualRefreshCompleteEvent + ", manualRefreshErrorEvent=" + this.manualRefreshErrorEvent + ", curatedListChipBadgesSeen=" + this.curatedListChipBadgesSeen + ", startedEducationLessonIds=" + this.startedEducationLessonIds + ", completedEducationLessonIds=" + this.completedEducationLessonIds + ", educationLessonsFirstShownTimestamps=" + this.educationLessonsFirstShownTimestamps + ", shouldShowRecommendationsCard=" + this.shouldShowRecommendationsCard + ", iacInfoBanners=" + this.iacInfoBanners + ", scrollToTargetEvent=" + this.scrollToTargetEvent + ", recyclerViewItemsFetched=" + this.recyclerViewItemsFetched + ", newsfeedHeaderChangeEvent=" + this.newsfeedHeaderChangeEvent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsFeedViewState(List<NewsFeedElement> feedElements, Set<UUID> filteredContentIds, boolean z, Throwable th, boolean z2, List<EducationUserProgress> educationUserProgressList, Function1<? super List<? extends Element>, Integer> function1, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2, Map<String, Boolean> curatedListChipBadgesSeen, Set<String> startedEducationLessonIds, Set<String> completedEducationLessonIds, Map<String, Long> educationLessonsFirstShownTimestamps, boolean z3, List<IacInfoBanner> iacInfoBanners, UiEvent<Integer> uiEvent3, RecyclerViewItemsFetched recyclerViewItemsFetched, UiEvent<NewsfeedHeaderChange> uiEvent4) {
        List<Element> elements;
        Intrinsics.checkNotNullParameter(feedElements, "feedElements");
        Intrinsics.checkNotNullParameter(filteredContentIds, "filteredContentIds");
        Intrinsics.checkNotNullParameter(educationUserProgressList, "educationUserProgressList");
        Intrinsics.checkNotNullParameter(curatedListChipBadgesSeen, "curatedListChipBadgesSeen");
        Intrinsics.checkNotNullParameter(startedEducationLessonIds, "startedEducationLessonIds");
        Intrinsics.checkNotNullParameter(completedEducationLessonIds, "completedEducationLessonIds");
        Intrinsics.checkNotNullParameter(educationLessonsFirstShownTimestamps, "educationLessonsFirstShownTimestamps");
        Intrinsics.checkNotNullParameter(iacInfoBanners, "iacInfoBanners");
        Intrinsics.checkNotNullParameter(recyclerViewItemsFetched, "recyclerViewItemsFetched");
        this.feedElements = feedElements;
        this.filteredContentIds = filteredContentIds;
        this.initialLoadComplete = z;
        this.initialLoadError = th;
        this.autoplayVideoAudioEnabled = z2;
        this.educationUserProgressList = educationUserProgressList;
        this.getScrollTargetIndex = function1;
        this.manualRefreshCompleteEvent = uiEvent;
        this.manualRefreshErrorEvent = uiEvent2;
        this.curatedListChipBadgesSeen = curatedListChipBadgesSeen;
        this.startedEducationLessonIds = startedEducationLessonIds;
        this.completedEducationLessonIds = completedEducationLessonIds;
        this.educationLessonsFirstShownTimestamps = educationLessonsFirstShownTimestamps;
        this.shouldShowRecommendationsCard = z3;
        this.iacInfoBanners = iacInfoBanners;
        this.scrollToTargetEvent = uiEvent3;
        this.recyclerViewItemsFetched = recyclerViewItemsFetched;
        this.newsfeedHeaderChangeEvent = uiEvent4;
        this.showPopularListsCarousel = true;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = feedElements.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((NewsFeedElement) it.next()).getContents());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof NewsFeedContent.EducationSeries) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList3, ((NewsFeedContent.EducationSeries) it2.next()).getLessons());
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((ApiLessonPreview) it3.next()).getTrackingId());
        }
        this.educationTrackingIds = CollectionsKt.distinct(arrayList4);
        List<EducationUserProgress> list = this.educationUserProgressList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (EducationUserProgress educationUserProgress : list) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(educationUserProgress.getTrackingId(), Integer.valueOf(educationUserProgress.getPercentComplete()));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        this.educationUserProgressMap = linkedHashMap;
        if (this.shouldShowRecommendationsCard) {
            if (this.feedElements.isEmpty()) {
                elements = getRecommendationsCardElement(0);
            } else {
                List<NewsFeedElement> listSubList = this.feedElements.subList(0, 1);
                List<NewsFeedElement> list2 = this.feedElements;
                elements = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) toElements(listSubList, 0), (Iterable) getRecommendationsCardElement(1)), (Iterable) toElements(list2.subList(1, list2.size()), 2));
            }
        } else {
            elements = toElements(this.feedElements, 0);
        }
        this.elements = elements;
        Function1<List<? extends Element>, Integer> function12 = this.getScrollTargetIndex;
        if (function12 != null) {
            Integer numInvoke = function12.invoke(elements);
            if (this.recyclerViewItemsFetched.getAllFetched() && numInvoke != null) {
                UiEvent<Integer> uiEvent5 = this.scrollToTargetEvent;
                this.scrollToTargetEvent = uiEvent5 == null ? new UiEvent<>(numInvoke) : uiEvent5;
            }
        }
        this.showInitialLoading = !this.initialLoadComplete && elements.isEmpty();
        this.showInitialLoadErrorMessage = this.initialLoadError != null && elements.isEmpty();
        this.iacInfoBannerData = IacInfoBanners.findByLocation(this.iacInfoBanners, IacInfoBannerLocation.INFO_BANNER_BROWSE_TAB_MOBILE_TOP_LEVEL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ NewsFeedViewState(List list, Set set, boolean z, Throwable th, boolean z2, List list2, Function1 function1, UiEvent uiEvent, UiEvent uiEvent2, Map map, Set set2, Set set3, Map map2, boolean z3, List list3, UiEvent uiEvent3, RecyclerViewItemsFetched recyclerViewItemsFetched, UiEvent uiEvent4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List list4;
        Set set4;
        boolean z4;
        UiEvent uiEvent5;
        RecyclerViewItemsFetched recyclerViewItemsFetched2;
        List listEmptyList = (i & 1) != 0 ? CollectionsKt.emptyList() : list;
        Set setEmptySet = (i & 2) != 0 ? SetsKt.emptySet() : set;
        boolean z5 = (i & 4) != 0 ? false : z;
        Throwable th2 = (i & 8) != 0 ? null : th;
        boolean z6 = (i & 16) != 0 ? false : z2;
        List listEmptyList2 = (i & 32) != 0 ? CollectionsKt.emptyList() : list2;
        Function1 function12 = (i & 64) != 0 ? null : function1;
        UiEvent uiEvent6 = (i & 128) != 0 ? null : uiEvent;
        UiEvent uiEvent7 = (i & 256) != 0 ? null : uiEvent2;
        Map mapEmptyMap = (i & 512) != 0 ? MapsKt.emptyMap() : map;
        Set setEmptySet2 = (i & 1024) != 0 ? SetsKt.emptySet() : set2;
        Set setEmptySet3 = (i & 2048) != 0 ? SetsKt.emptySet() : set3;
        Map mapEmptyMap2 = (i & 4096) != 0 ? MapsKt.emptyMap() : map2;
        boolean z7 = (i & 8192) != 0 ? false : z3;
        List listEmptyList3 = (i & 16384) != 0 ? CollectionsKt.emptyList() : list3;
        UiEvent uiEvent8 = (i & 32768) != 0 ? null : uiEvent3;
        if ((i & 65536) != 0) {
            list4 = listEmptyList;
            set4 = setEmptySet;
            z4 = z5;
            boolean z8 = false;
            uiEvent5 = null;
            recyclerViewItemsFetched2 = new RecyclerViewItemsFetched(z8, z8, 3, 0 == true ? 1 : 0);
        } else {
            list4 = listEmptyList;
            set4 = setEmptySet;
            z4 = z5;
            uiEvent5 = null;
            recyclerViewItemsFetched2 = recyclerViewItemsFetched;
        }
        this(list4, set4, z4, th2, z6, listEmptyList2, function12, uiEvent6, uiEvent7, mapEmptyMap, setEmptySet2, setEmptySet3, mapEmptyMap2, z7, listEmptyList3, uiEvent8, recyclerViewItemsFetched2, (i & 131072) != 0 ? uiEvent5 : uiEvent4);
    }

    public final UiEvent<Unit> getManualRefreshCompleteEvent() {
        return this.manualRefreshCompleteEvent;
    }

    public final UiEvent<Throwable> getManualRefreshErrorEvent() {
        return this.manualRefreshErrorEvent;
    }

    public final Map<String, Boolean> getCuratedListChipBadgesSeen() {
        return this.curatedListChipBadgesSeen;
    }

    public final Set<String> getStartedEducationLessonIds() {
        return this.startedEducationLessonIds;
    }

    public final Set<String> getCompletedEducationLessonIds() {
        return this.completedEducationLessonIds;
    }

    public final Map<String, Long> getEducationLessonsFirstShownTimestamps() {
        return this.educationLessonsFirstShownTimestamps;
    }

    public final boolean getShouldShowRecommendationsCard() {
        return this.shouldShowRecommendationsCard;
    }

    public final List<IacInfoBanner> getIacInfoBanners() {
        return this.iacInfoBanners;
    }

    public final UiEvent<Integer> getScrollToTargetEvent() {
        return this.scrollToTargetEvent;
    }

    public final void setScrollToTargetEvent(UiEvent<Integer> uiEvent) {
        this.scrollToTargetEvent = uiEvent;
    }

    public final RecyclerViewItemsFetched getRecyclerViewItemsFetched() {
        return this.recyclerViewItemsFetched;
    }

    public final UiEvent<NewsfeedHeaderChange> getNewsfeedHeaderChangeEvent() {
        return this.newsfeedHeaderChangeEvent;
    }

    /* compiled from: NewsFeedViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/NewsFeedViewState$RecyclerViewItemsFetched;", "", "shouldShowRecommendationsCardFetched", "", "feedElementsFetched", "<init>", "(ZZ)V", "getShouldShowRecommendationsCardFetched", "()Z", "getFeedElementsFetched", "allFetched", "getAllFetched", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RecyclerViewItemsFetched {
        public static final int $stable = 0;
        private final boolean feedElementsFetched;
        private final boolean shouldShowRecommendationsCardFetched;

        /* JADX WARN: Illegal instructions before constructor call */
        public RecyclerViewItemsFetched() {
            boolean z = false;
            this(z, z, 3, null);
        }

        public static /* synthetic */ RecyclerViewItemsFetched copy$default(RecyclerViewItemsFetched recyclerViewItemsFetched, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = recyclerViewItemsFetched.shouldShowRecommendationsCardFetched;
            }
            if ((i & 2) != 0) {
                z2 = recyclerViewItemsFetched.feedElementsFetched;
            }
            return recyclerViewItemsFetched.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldShowRecommendationsCardFetched() {
            return this.shouldShowRecommendationsCardFetched;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFeedElementsFetched() {
            return this.feedElementsFetched;
        }

        public final RecyclerViewItemsFetched copy(boolean shouldShowRecommendationsCardFetched, boolean feedElementsFetched) {
            return new RecyclerViewItemsFetched(shouldShowRecommendationsCardFetched, feedElementsFetched);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecyclerViewItemsFetched)) {
                return false;
            }
            RecyclerViewItemsFetched recyclerViewItemsFetched = (RecyclerViewItemsFetched) other;
            return this.shouldShowRecommendationsCardFetched == recyclerViewItemsFetched.shouldShowRecommendationsCardFetched && this.feedElementsFetched == recyclerViewItemsFetched.feedElementsFetched;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.shouldShowRecommendationsCardFetched) * 31) + Boolean.hashCode(this.feedElementsFetched);
        }

        public String toString() {
            return "RecyclerViewItemsFetched(shouldShowRecommendationsCardFetched=" + this.shouldShowRecommendationsCardFetched + ", feedElementsFetched=" + this.feedElementsFetched + ")";
        }

        public RecyclerViewItemsFetched(boolean z, boolean z2) {
            this.shouldShowRecommendationsCardFetched = z;
            this.feedElementsFetched = z2;
        }

        public /* synthetic */ RecyclerViewItemsFetched(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public final boolean getShouldShowRecommendationsCardFetched() {
            return this.shouldShowRecommendationsCardFetched;
        }

        public final boolean getFeedElementsFetched() {
            return this.feedElementsFetched;
        }

        public final boolean getAllFetched() {
            return this.shouldShowRecommendationsCardFetched && this.feedElementsFetched;
        }
    }

    public final List<Element> getElements() {
        return this.elements;
    }

    public final List<String> getEducationTrackingIds() {
        return this.educationTrackingIds;
    }

    public final boolean getShowInitialLoading() {
        return this.showInitialLoading;
    }

    public final boolean getShowInitialLoadErrorMessage() {
        return this.showInitialLoadErrorMessage;
    }

    public final IacInfoBanner getIacInfoBannerData() {
        return this.iacInfoBannerData;
    }

    private final List<Element.RecommendationsCard> getRecommendationsCardElement(int rank) {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return CollectionsKt.listOf(new Element.RecommendationsCard(uuidRandomUUID, rank));
    }

    private final List<Element> toElements(List<NewsFeedElement> list, int i) {
        return NewsFeedElements.toElements$default(list, this.filteredContentIds, true, this.autoplayVideoAudioEnabled, this.showPopularListsCarousel, true, this.curatedListChipBadgesSeen, this.startedEducationLessonIds, this.educationLessonsFirstShownTimestamps, this.educationUserProgressMap, i, null, 1024, null);
    }
}
