package com.robinhood.android.search.newsfeed.videoplayer;

import com.robinhood.android.newsfeed.extensions.NewsFeedInstruments;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.models.newsfeed.p334db.NewsFeedContent;
import com.robinhood.models.newsfeed.p334db.NewsFeedElementTemplate;
import com.robinhood.models.newsfeed.p334db.NewsFeedMedia;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import okhttp3.HttpUrl;
import p479j$.time.Instant;

/* compiled from: NewsFeedVideoPlayerViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B1\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u001a\u001a\u00020\u000f*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J3\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u001eHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerViewState;", "", "elements", "", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "endedVideoIds", "", "Ljava/util/UUID;", "videosLoadingState", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerViewState$VideosLoadingState;", "<init>", "(Ljava/util/List;Ljava/util/Set;Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerViewState$VideosLoadingState;)V", "getVideosLoadingState", "()Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerViewState$VideosLoadingState;", "videos", "Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "getVideos", "()Ljava/util/List;", "showLoading", "", "getShowLoading", "()Z", "showContent", "getShowContent", "showError", "getShowError", "toViewState", "Lcom/robinhood/models/newsfeed/db/NewsFeedContent$Video;", "parentElement", "parentRank", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "VideosLoadingState", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class NewsFeedVideoPlayerViewState {
    public static final int $stable = 8;
    private final List<NewsFeedElement> elements;
    private final Set<UUID> endedVideoIds;
    private final VideosLoadingState videosLoadingState;

    public NewsFeedVideoPlayerViewState() {
        this(null, null, null, 7, null);
    }

    private final List<NewsFeedElement> component1() {
        return this.elements;
    }

    private final Set<UUID> component2() {
        return this.endedVideoIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsFeedVideoPlayerViewState copy$default(NewsFeedVideoPlayerViewState newsFeedVideoPlayerViewState, List list, Set set, VideosLoadingState videosLoadingState, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsFeedVideoPlayerViewState.elements;
        }
        if ((i & 2) != 0) {
            set = newsFeedVideoPlayerViewState.endedVideoIds;
        }
        if ((i & 4) != 0) {
            videosLoadingState = newsFeedVideoPlayerViewState.videosLoadingState;
        }
        return newsFeedVideoPlayerViewState.copy(list, set, videosLoadingState);
    }

    /* renamed from: component3, reason: from getter */
    public final VideosLoadingState getVideosLoadingState() {
        return this.videosLoadingState;
    }

    public final NewsFeedVideoPlayerViewState copy(List<NewsFeedElement> elements, Set<UUID> endedVideoIds, VideosLoadingState videosLoadingState) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(endedVideoIds, "endedVideoIds");
        Intrinsics.checkNotNullParameter(videosLoadingState, "videosLoadingState");
        return new NewsFeedVideoPlayerViewState(elements, endedVideoIds, videosLoadingState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsFeedVideoPlayerViewState)) {
            return false;
        }
        NewsFeedVideoPlayerViewState newsFeedVideoPlayerViewState = (NewsFeedVideoPlayerViewState) other;
        return Intrinsics.areEqual(this.elements, newsFeedVideoPlayerViewState.elements) && Intrinsics.areEqual(this.endedVideoIds, newsFeedVideoPlayerViewState.endedVideoIds) && this.videosLoadingState == newsFeedVideoPlayerViewState.videosLoadingState;
    }

    public int hashCode() {
        return (((this.elements.hashCode() * 31) + this.endedVideoIds.hashCode()) * 31) + this.videosLoadingState.hashCode();
    }

    public String toString() {
        return "NewsFeedVideoPlayerViewState(elements=" + this.elements + ", endedVideoIds=" + this.endedVideoIds + ", videosLoadingState=" + this.videosLoadingState + ")";
    }

    public NewsFeedVideoPlayerViewState(List<NewsFeedElement> elements, Set<UUID> endedVideoIds, VideosLoadingState videosLoadingState) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(endedVideoIds, "endedVideoIds");
        Intrinsics.checkNotNullParameter(videosLoadingState, "videosLoadingState");
        this.elements = elements;
        this.endedVideoIds = endedVideoIds;
        this.videosLoadingState = videosLoadingState;
    }

    public /* synthetic */ NewsFeedVideoPlayerViewState(List list, Set set, VideosLoadingState videosLoadingState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? SetsKt.emptySet() : set, (i & 4) != 0 ? VideosLoadingState.LOADING : videosLoadingState);
    }

    public final VideosLoadingState getVideosLoadingState() {
        return this.videosLoadingState;
    }

    public final List<Video> getVideos() {
        final Ref.IntRef intRef = new Ref.IntRef();
        return SequencesKt.toList(SequencesKt.flatMap(SequencesKt.filter(CollectionsKt.asSequence(this.elements), new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NewsFeedVideoPlayerViewState._get_videos_$lambda$0((NewsFeedElement) obj));
            }
        }), new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerViewState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedVideoPlayerViewState._get_videos_$lambda$2(this.f$0, intRef, (NewsFeedElement) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_videos_$lambda$0(NewsFeedElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element.getTemplates().contains(NewsFeedElementTemplate.VIDEO_REGULAR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence _get_videos_$lambda$2(final NewsFeedVideoPlayerViewState newsFeedVideoPlayerViewState, final Ref.IntRef intRef, final NewsFeedElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(element.getContents()), new Function1<Object, Boolean>() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerViewState$_get_videos_$lambda$2$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof NewsFeedContent.Video);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return SequencesKt.map(sequenceFilter, new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerViewState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedVideoPlayerViewState._get_videos_$lambda$2$lambda$1(this.f$0, element, intRef, (NewsFeedContent.Video) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Video _get_videos_$lambda$2$lambda$1(NewsFeedVideoPlayerViewState newsFeedVideoPlayerViewState, NewsFeedElement newsFeedElement, Ref.IntRef intRef, NewsFeedContent.Video it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i = intRef.element;
        intRef.element = i + 1;
        return newsFeedVideoPlayerViewState.toViewState(it, newsFeedElement, i);
    }

    public final boolean getShowLoading() {
        return this.videosLoadingState == VideosLoadingState.LOADING;
    }

    public final boolean getShowContent() {
        return this.videosLoadingState == VideosLoadingState.LOADED;
    }

    public final boolean getShowError() {
        return this.videosLoadingState == VideosLoadingState.FAILED;
    }

    private final Video toViewState(NewsFeedContent.Video video, NewsFeedElement newsFeedElement, int i) {
        List<RelatedInstrument> listTakeRelatedInstruments = NewsFeedInstruments.takeRelatedInstruments(video.getRelatedInstruments(), 2);
        UUID id = video.getId();
        UUID id2 = newsFeedElement.getId();
        String serverValue = NewsFeedElementTemplate.VIDEO_REGULAR.getServerValue();
        String category = newsFeedElement.getCategory();
        String serverContentType = video.getServerContentType();
        String title = video.getTitle();
        HttpUrl url = video.getUrl();
        RelatedInstrument relatedInstrument = (RelatedInstrument) CollectionsKt.getOrNull(listTakeRelatedInstruments, 0);
        RelatedInstrument relatedInstrument2 = (RelatedInstrument) CollectionsKt.getOrNull(listTakeRelatedInstruments, 1);
        String source = video.getSource();
        Instant publishedAt = video.getPublishedAt();
        NewsFeedMedia thumbnail = video.getThumbnail();
        return new Video(id, id2, serverValue, category, i, serverContentType, title, url, relatedInstrument, relatedInstrument2, source, publishedAt, thumbnail != null ? thumbnail.getImageUrl() : null, video.getCaptions(), this.endedVideoIds.contains(video.getId()));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsFeedVideoPlayerViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerViewState$VideosLoadingState;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "LOADED", "FAILED", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class VideosLoadingState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VideosLoadingState[] $VALUES;
        public static final VideosLoadingState LOADING = new VideosLoadingState("LOADING", 0);
        public static final VideosLoadingState LOADED = new VideosLoadingState("LOADED", 1);
        public static final VideosLoadingState FAILED = new VideosLoadingState("FAILED", 2);

        private static final /* synthetic */ VideosLoadingState[] $values() {
            return new VideosLoadingState[]{LOADING, LOADED, FAILED};
        }

        public static EnumEntries<VideosLoadingState> getEntries() {
            return $ENTRIES;
        }

        private VideosLoadingState(String str, int i) {
        }

        static {
            VideosLoadingState[] videosLoadingStateArr$values = $values();
            $VALUES = videosLoadingStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(videosLoadingStateArr$values);
        }

        public static VideosLoadingState valueOf(String str) {
            return (VideosLoadingState) Enum.valueOf(VideosLoadingState.class, str);
        }

        public static VideosLoadingState[] values() {
            return (VideosLoadingState[]) $VALUES.clone();
        }
    }
}
