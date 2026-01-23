package com.robinhood.android.search.newsfeed.videoplayer;

import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.ParentElement;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import p479j$.time.Instant;

/* compiled from: NewsFeedVideoPlayerViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b/\u0010(J\u0012\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b0\u0010(J\u0010\u00101\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b1\u00102J®\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b6\u0010$J\u001a\u00108\u001a\u00020\u00162\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b>\u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b?\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010$R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\bB\u0010!R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\bC\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bH\u0010*R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\bI\u0010!R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bK\u0010.R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bL\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bM\u0010(R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010N\u001a\u0004\bO\u00102¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "", "Ljava/util/UUID;", "id", "parentElementId", "", "parentTemplate", "parentCategory", "", "parentRank", "analyticsContentType", "title", "Lokhttp3/HttpUrl;", "url", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "firstInstrument", "secondInstrument", "source", "j$/time/Instant", "publishedAt", "previewImageUrl", "captions", "", "showReplay", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Ljava/lang/String;Lj$/time/Instant;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Z)V", "Lcom/robinhood/android/newsfeed/model/Content$Video;", "toContentVideo", "()Lcom/robinhood/android/newsfeed/model/Content$Video;", "component1", "()Ljava/util/UUID;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()I", "component6", "component7", "component8", "()Lokhttp3/HttpUrl;", "component9", "()Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "component10", "component11", "component12", "()Lj$/time/Instant;", "component13", "component14", "component15", "()Z", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Ljava/lang/String;Lj$/time/Instant;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Z)Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "getParentElementId", "Ljava/lang/String;", "getParentTemplate", "getParentCategory", "I", "getParentRank", "getAnalyticsContentType", "getTitle", "Lokhttp3/HttpUrl;", "getUrl", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "getFirstInstrument", "getSecondInstrument", "getSource", "Lj$/time/Instant;", "getPublishedAt", "getPreviewImageUrl", "getCaptions", "Z", "getShowReplay", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Video {
    public static final int $stable = 8;
    private final String analyticsContentType;
    private final HttpUrl captions;
    private final RelatedInstrument firstInstrument;
    private final UUID id;
    private final String parentCategory;
    private final UUID parentElementId;
    private final int parentRank;
    private final String parentTemplate;
    private final HttpUrl previewImageUrl;
    private final Instant publishedAt;
    private final RelatedInstrument secondInstrument;
    private final boolean showReplay;
    private final String source;
    private final String title;
    private final HttpUrl url;

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final RelatedInstrument getSecondInstrument() {
        return this.secondInstrument;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component12, reason: from getter */
    public final Instant getPublishedAt() {
        return this.publishedAt;
    }

    /* renamed from: component13, reason: from getter */
    public final HttpUrl getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    /* renamed from: component14, reason: from getter */
    public final HttpUrl getCaptions() {
        return this.captions;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShowReplay() {
        return this.showReplay;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getParentElementId() {
        return this.parentElementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getParentTemplate() {
        return this.parentTemplate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getParentCategory() {
        return this.parentCategory;
    }

    /* renamed from: component5, reason: from getter */
    public final int getParentRank() {
        return this.parentRank;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAnalyticsContentType() {
        return this.analyticsContentType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component8, reason: from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    /* renamed from: component9, reason: from getter */
    public final RelatedInstrument getFirstInstrument() {
        return this.firstInstrument;
    }

    public final Video copy(UUID id, UUID parentElementId, String parentTemplate, String parentCategory, int parentRank, String analyticsContentType, String title, HttpUrl url, RelatedInstrument firstInstrument, RelatedInstrument secondInstrument, String source, Instant publishedAt, HttpUrl previewImageUrl, HttpUrl captions, boolean showReplay) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parentElementId, "parentElementId");
        Intrinsics.checkNotNullParameter(parentTemplate, "parentTemplate");
        Intrinsics.checkNotNullParameter(parentCategory, "parentCategory");
        Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
        return new Video(id, parentElementId, parentTemplate, parentCategory, parentRank, analyticsContentType, title, url, firstInstrument, secondInstrument, source, publishedAt, previewImageUrl, captions, showReplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Video)) {
            return false;
        }
        Video video = (Video) other;
        return Intrinsics.areEqual(this.id, video.id) && Intrinsics.areEqual(this.parentElementId, video.parentElementId) && Intrinsics.areEqual(this.parentTemplate, video.parentTemplate) && Intrinsics.areEqual(this.parentCategory, video.parentCategory) && this.parentRank == video.parentRank && Intrinsics.areEqual(this.analyticsContentType, video.analyticsContentType) && Intrinsics.areEqual(this.title, video.title) && Intrinsics.areEqual(this.url, video.url) && Intrinsics.areEqual(this.firstInstrument, video.firstInstrument) && Intrinsics.areEqual(this.secondInstrument, video.secondInstrument) && Intrinsics.areEqual(this.source, video.source) && Intrinsics.areEqual(this.publishedAt, video.publishedAt) && Intrinsics.areEqual(this.previewImageUrl, video.previewImageUrl) && Intrinsics.areEqual(this.captions, video.captions) && this.showReplay == video.showReplay;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.id.hashCode() * 31) + this.parentElementId.hashCode()) * 31) + this.parentTemplate.hashCode()) * 31) + this.parentCategory.hashCode()) * 31) + Integer.hashCode(this.parentRank)) * 31) + this.analyticsContentType.hashCode()) * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31;
        RelatedInstrument relatedInstrument = this.firstInstrument;
        int iHashCode2 = (iHashCode + (relatedInstrument == null ? 0 : relatedInstrument.hashCode())) * 31;
        RelatedInstrument relatedInstrument2 = this.secondInstrument;
        int iHashCode3 = (((((iHashCode2 + (relatedInstrument2 == null ? 0 : relatedInstrument2.hashCode())) * 31) + this.source.hashCode()) * 31) + this.publishedAt.hashCode()) * 31;
        HttpUrl httpUrl = this.previewImageUrl;
        int iHashCode4 = (iHashCode3 + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31;
        HttpUrl httpUrl2 = this.captions;
        return ((iHashCode4 + (httpUrl2 != null ? httpUrl2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showReplay);
    }

    public String toString() {
        return "Video(id=" + this.id + ", parentElementId=" + this.parentElementId + ", parentTemplate=" + this.parentTemplate + ", parentCategory=" + this.parentCategory + ", parentRank=" + this.parentRank + ", analyticsContentType=" + this.analyticsContentType + ", title=" + this.title + ", url=" + this.url + ", firstInstrument=" + this.firstInstrument + ", secondInstrument=" + this.secondInstrument + ", source=" + this.source + ", publishedAt=" + this.publishedAt + ", previewImageUrl=" + this.previewImageUrl + ", captions=" + this.captions + ", showReplay=" + this.showReplay + ")";
    }

    public Video(UUID id, UUID parentElementId, String parentTemplate, String parentCategory, int i, String analyticsContentType, String title, HttpUrl url, RelatedInstrument relatedInstrument, RelatedInstrument relatedInstrument2, String source, Instant publishedAt, HttpUrl httpUrl, HttpUrl httpUrl2, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parentElementId, "parentElementId");
        Intrinsics.checkNotNullParameter(parentTemplate, "parentTemplate");
        Intrinsics.checkNotNullParameter(parentCategory, "parentCategory");
        Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
        this.id = id;
        this.parentElementId = parentElementId;
        this.parentTemplate = parentTemplate;
        this.parentCategory = parentCategory;
        this.parentRank = i;
        this.analyticsContentType = analyticsContentType;
        this.title = title;
        this.url = url;
        this.firstInstrument = relatedInstrument;
        this.secondInstrument = relatedInstrument2;
        this.source = source;
        this.publishedAt = publishedAt;
        this.previewImageUrl = httpUrl;
        this.captions = httpUrl2;
        this.showReplay = z;
    }

    public final UUID getId() {
        return this.id;
    }

    public final UUID getParentElementId() {
        return this.parentElementId;
    }

    public final String getParentTemplate() {
        return this.parentTemplate;
    }

    public final String getParentCategory() {
        return this.parentCategory;
    }

    public final int getParentRank() {
        return this.parentRank;
    }

    public final String getAnalyticsContentType() {
        return this.analyticsContentType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final HttpUrl getUrl() {
        return this.url;
    }

    public final RelatedInstrument getFirstInstrument() {
        return this.firstInstrument;
    }

    public final RelatedInstrument getSecondInstrument() {
        return this.secondInstrument;
    }

    public final String getSource() {
        return this.source;
    }

    public final Instant getPublishedAt() {
        return this.publishedAt;
    }

    public final HttpUrl getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    public final HttpUrl getCaptions() {
        return this.captions;
    }

    public final boolean getShowReplay() {
        return this.showReplay;
    }

    public final Content.Video toContentVideo() {
        return new Content.Video(this.id, 0, new ParentElement(this.parentElementId, this.parentTemplate, this.parentCategory, this.parentRank, 1), this.analyticsContentType, this.title, this.url, this.firstInstrument, this.secondInstrument, this.source, this.publishedAt, this.previewImageUrl, this.captions, true, false);
    }
}
