package com.robinhood.android.newsfeed.model;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.lists.models.shared.p298db.SizedUrlHolder;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.newsfeed.p334db.NewsFeedElementTemplate;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p479j$.time.Instant;

/* compiled from: Content.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018\u0082\u0001\b!\"#$%&'(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Content;", "", "<init>", "()V", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "rank", "", "getRank", "()I", "parentElement", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "getParentElement", "()Lcom/robinhood/android/newsfeed/model/ParentElement;", "analyticsId", "getAnalyticsId", "analyticsContentType", "", "getAnalyticsContentType", "()Ljava/lang/String;", "isInCarousel", "", "()Z", "Article", "EmbeddedArticle", "Instrument", "Video", "ListPreview", "EducationSeries", "MarketUpdates", "MarketIndicator", "Lcom/robinhood/android/newsfeed/model/Content$Article;", "Lcom/robinhood/android/newsfeed/model/Content$EducationSeries;", "Lcom/robinhood/android/newsfeed/model/Content$EmbeddedArticle;", "Lcom/robinhood/android/newsfeed/model/Content$Instrument;", "Lcom/robinhood/android/newsfeed/model/Content$ListPreview;", "Lcom/robinhood/android/newsfeed/model/Content$MarketIndicator;", "Lcom/robinhood/android/newsfeed/model/Content$MarketUpdates;", "Lcom/robinhood/android/newsfeed/model/Content$Video;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class Content {
    public static final int $stable = 0;

    public /* synthetic */ Content(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getAnalyticsContentType();

    public abstract UUID getAnalyticsId();

    public abstract UUID getId();

    public abstract ParentElement getParentElement();

    public abstract int getRank();

    private Content() {
    }

    public final boolean isInCarousel() {
        return Intrinsics.areEqual(getParentElement().getTemplate(), NewsFeedElementTemplate.CAROUSEL.getServerValue());
    }

    /* compiled from: Content.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b3\u0010(J\u0010\u00104\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b6\u00107J¾\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b:\u0010%J\u0010\u0010;\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b;\u0010!J\u001a\u0010>\u001a\u00020\u00182\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bG\u0010%R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bH\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bJ\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bL\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bM\u0010*R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\bO\u0010-R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bP\u0010-R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bQ\u0010%R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bR\u0010%R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bT\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\bU\u0010(R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\b\u0019\u00105R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010W\u001a\u0004\bX\u00107R\u001a\u0010Y\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010@\u001a\u0004\bZ\u0010\u001f¨\u0006["}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Content$Article;", "Lcom/robinhood/android/newsfeed/model/Content;", "Ljava/util/UUID;", "id", "", "rank", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "parentElement", "", "analyticsContentType", "title", "Lokhttp3/HttpUrl;", "url", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "firstInstrument", "secondInstrument", "Lcom/robinhood/android/newsfeed/model/RelatedAsset;", "firstAsset", "secondAsset", "relatedInstrumentEducationTourId", "source", "j$/time/Instant", "publishedAt", "previewImageUrl", "", "isHero", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "logoAssetName", "<init>", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Lcom/robinhood/android/newsfeed/model/RelatedAsset;Lcom/robinhood/android/newsfeed/model/RelatedAsset;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lokhttp3/HttpUrl;ZLcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "component1", "()Ljava/util/UUID;", "component2", "()I", "component3", "()Lcom/robinhood/android/newsfeed/model/ParentElement;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lokhttp3/HttpUrl;", "component7", "()Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "component8", "component9", "()Lcom/robinhood/android/newsfeed/model/RelatedAsset;", "component10", "component11", "component12", "component13", "()Lj$/time/Instant;", "component14", "component15", "()Z", "component16", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "copy", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Lcom/robinhood/android/newsfeed/model/RelatedAsset;Lcom/robinhood/android/newsfeed/model/RelatedAsset;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lokhttp3/HttpUrl;ZLcom/robinhood/android/libdesignsystem/serverui/IconAsset;)Lcom/robinhood/android/newsfeed/model/Content$Article;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "I", "getRank", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "getParentElement", "Ljava/lang/String;", "getAnalyticsContentType", "getTitle", "Lokhttp3/HttpUrl;", "getUrl", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "getFirstInstrument", "getSecondInstrument", "Lcom/robinhood/android/newsfeed/model/RelatedAsset;", "getFirstAsset", "getSecondAsset", "getRelatedInstrumentEducationTourId", "getSource", "Lj$/time/Instant;", "getPublishedAt", "getPreviewImageUrl", "Z", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getLogoAssetName", "analyticsId", "getAnalyticsId", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Article extends Content {
        public static final int $stable = 8;
        private final String analyticsContentType;
        private final UUID analyticsId;
        private final RelatedAsset firstAsset;
        private final RelatedInstrument firstInstrument;
        private final UUID id;
        private final boolean isHero;
        private final ServerToBentoAssetMapper2 logoAssetName;
        private final ParentElement parentElement;
        private final HttpUrl previewImageUrl;
        private final Instant publishedAt;
        private final int rank;
        private final String relatedInstrumentEducationTourId;
        private final RelatedAsset secondAsset;
        private final RelatedInstrument secondInstrument;
        private final String source;
        private final String title;
        private final HttpUrl url;

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final RelatedAsset getSecondAsset() {
            return this.secondAsset;
        }

        /* renamed from: component11, reason: from getter */
        public final String getRelatedInstrumentEducationTourId() {
            return this.relatedInstrumentEducationTourId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component13, reason: from getter */
        public final Instant getPublishedAt() {
            return this.publishedAt;
        }

        /* renamed from: component14, reason: from getter */
        public final HttpUrl getPreviewImageUrl() {
            return this.previewImageUrl;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getIsHero() {
            return this.isHero;
        }

        /* renamed from: component16, reason: from getter */
        public final ServerToBentoAssetMapper2 getLogoAssetName() {
            return this.logoAssetName;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final ParentElement getParentElement() {
            return this.parentElement;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        /* renamed from: component7, reason: from getter */
        public final RelatedInstrument getFirstInstrument() {
            return this.firstInstrument;
        }

        /* renamed from: component8, reason: from getter */
        public final RelatedInstrument getSecondInstrument() {
            return this.secondInstrument;
        }

        /* renamed from: component9, reason: from getter */
        public final RelatedAsset getFirstAsset() {
            return this.firstAsset;
        }

        public final Article copy(UUID id, int rank, ParentElement parentElement, String analyticsContentType, String title, HttpUrl url, RelatedInstrument firstInstrument, RelatedInstrument secondInstrument, RelatedAsset firstAsset, RelatedAsset secondAsset, String relatedInstrumentEducationTourId, String source, Instant publishedAt, HttpUrl previewImageUrl, boolean isHero, ServerToBentoAssetMapper2 logoAssetName) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
            return new Article(id, rank, parentElement, analyticsContentType, title, url, firstInstrument, secondInstrument, firstAsset, secondAsset, relatedInstrumentEducationTourId, source, publishedAt, previewImageUrl, isHero, logoAssetName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Article)) {
                return false;
            }
            Article article = (Article) other;
            return Intrinsics.areEqual(this.id, article.id) && this.rank == article.rank && Intrinsics.areEqual(this.parentElement, article.parentElement) && Intrinsics.areEqual(this.analyticsContentType, article.analyticsContentType) && Intrinsics.areEqual(this.title, article.title) && Intrinsics.areEqual(this.url, article.url) && Intrinsics.areEqual(this.firstInstrument, article.firstInstrument) && Intrinsics.areEqual(this.secondInstrument, article.secondInstrument) && Intrinsics.areEqual(this.firstAsset, article.firstAsset) && Intrinsics.areEqual(this.secondAsset, article.secondAsset) && Intrinsics.areEqual(this.relatedInstrumentEducationTourId, article.relatedInstrumentEducationTourId) && Intrinsics.areEqual(this.source, article.source) && Intrinsics.areEqual(this.publishedAt, article.publishedAt) && Intrinsics.areEqual(this.previewImageUrl, article.previewImageUrl) && this.isHero == article.isHero && this.logoAssetName == article.logoAssetName;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.parentElement.hashCode()) * 31) + this.analyticsContentType.hashCode()) * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31;
            RelatedInstrument relatedInstrument = this.firstInstrument;
            int iHashCode2 = (iHashCode + (relatedInstrument == null ? 0 : relatedInstrument.hashCode())) * 31;
            RelatedInstrument relatedInstrument2 = this.secondInstrument;
            int iHashCode3 = (iHashCode2 + (relatedInstrument2 == null ? 0 : relatedInstrument2.hashCode())) * 31;
            RelatedAsset relatedAsset = this.firstAsset;
            int iHashCode4 = (iHashCode3 + (relatedAsset == null ? 0 : relatedAsset.hashCode())) * 31;
            RelatedAsset relatedAsset2 = this.secondAsset;
            int iHashCode5 = (iHashCode4 + (relatedAsset2 == null ? 0 : relatedAsset2.hashCode())) * 31;
            String str = this.relatedInstrumentEducationTourId;
            int iHashCode6 = (((((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + this.source.hashCode()) * 31) + this.publishedAt.hashCode()) * 31;
            HttpUrl httpUrl = this.previewImageUrl;
            int iHashCode7 = (((iHashCode6 + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31) + Boolean.hashCode(this.isHero)) * 31;
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.logoAssetName;
            return iHashCode7 + (serverToBentoAssetMapper2 != null ? serverToBentoAssetMapper2.hashCode() : 0);
        }

        public String toString() {
            return "Article(id=" + this.id + ", rank=" + this.rank + ", parentElement=" + this.parentElement + ", analyticsContentType=" + this.analyticsContentType + ", title=" + this.title + ", url=" + this.url + ", firstInstrument=" + this.firstInstrument + ", secondInstrument=" + this.secondInstrument + ", firstAsset=" + this.firstAsset + ", secondAsset=" + this.secondAsset + ", relatedInstrumentEducationTourId=" + this.relatedInstrumentEducationTourId + ", source=" + this.source + ", publishedAt=" + this.publishedAt + ", previewImageUrl=" + this.previewImageUrl + ", isHero=" + this.isHero + ", logoAssetName=" + this.logoAssetName + ")";
        }

        public /* synthetic */ Article(UUID uuid, int i, ParentElement parentElement, String str, String str2, HttpUrl httpUrl, RelatedInstrument relatedInstrument, RelatedInstrument relatedInstrument2, RelatedAsset relatedAsset, RelatedAsset relatedAsset2, String str3, String str4, Instant instant, HttpUrl httpUrl2, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i, parentElement, str, str2, httpUrl, relatedInstrument, relatedInstrument2, relatedAsset, relatedAsset2, (i2 & 1024) != 0 ? null : str3, str4, instant, httpUrl2, z, serverToBentoAssetMapper2);
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public int getRank() {
            return this.rank;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public ParentElement getParentElement() {
            return this.parentElement;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public String getAnalyticsContentType() {
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

        public final RelatedAsset getFirstAsset() {
            return this.firstAsset;
        }

        public final RelatedAsset getSecondAsset() {
            return this.secondAsset;
        }

        public final String getRelatedInstrumentEducationTourId() {
            return this.relatedInstrumentEducationTourId;
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

        public final boolean isHero() {
            return this.isHero;
        }

        public final ServerToBentoAssetMapper2 getLogoAssetName() {
            return this.logoAssetName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Article(UUID id, int i, ParentElement parentElement, String analyticsContentType, String title, HttpUrl url, RelatedInstrument relatedInstrument, RelatedInstrument relatedInstrument2, RelatedAsset relatedAsset, RelatedAsset relatedAsset2, String str, String source, Instant publishedAt, HttpUrl httpUrl, boolean z, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
            this.id = id;
            this.rank = i;
            this.parentElement = parentElement;
            this.analyticsContentType = analyticsContentType;
            this.title = title;
            this.url = url;
            this.firstInstrument = relatedInstrument;
            this.secondInstrument = relatedInstrument2;
            this.firstAsset = relatedAsset;
            this.secondAsset = relatedAsset2;
            this.relatedInstrumentEducationTourId = str;
            this.source = source;
            this.publishedAt = publishedAt;
            this.previewImageUrl = httpUrl;
            this.isHero = z;
            this.logoAssetName = serverToBentoAssetMapper2;
            this.analyticsId = getId();
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getAnalyticsId() {
            return this.analyticsId;
        }
    }

    /* compiled from: Content.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0090\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b.\u0010\u001fJ\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010\u001bJ\u001a\u00102\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u001fR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b<\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b?\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bA\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010)R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\b\u0015\u0010+R\u001a\u0010G\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\bH\u0010\u0019¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Content$EmbeddedArticle;", "Lcom/robinhood/android/newsfeed/model/Content;", "Ljava/util/UUID;", "id", "", "rank", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "parentElement", "", "analyticsContentType", "title", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "firstInstrument", "secondInstrument", "relatedInstrumentEducationTourId", "source", "j$/time/Instant", "publishedAt", "Lokhttp3/HttpUrl;", "previewImageUrl", "", "isHero", "<init>", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lokhttp3/HttpUrl;Z)V", "component1", "()Ljava/util/UUID;", "component2", "()I", "component3", "()Lcom/robinhood/android/newsfeed/model/ParentElement;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "component7", "component8", "component9", "component10", "()Lj$/time/Instant;", "component11", "()Lokhttp3/HttpUrl;", "component12", "()Z", "copy", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lokhttp3/HttpUrl;Z)Lcom/robinhood/android/newsfeed/model/Content$EmbeddedArticle;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "I", "getRank", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "getParentElement", "Ljava/lang/String;", "getAnalyticsContentType", "getTitle", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "getFirstInstrument", "getSecondInstrument", "getRelatedInstrumentEducationTourId", "getSource", "Lj$/time/Instant;", "getPublishedAt", "Lokhttp3/HttpUrl;", "getPreviewImageUrl", "Z", "analyticsId", "getAnalyticsId", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EmbeddedArticle extends Content {
        public static final int $stable = 8;
        private final String analyticsContentType;
        private final UUID analyticsId;
        private final RelatedInstrument firstInstrument;
        private final UUID id;
        private final boolean isHero;
        private final ParentElement parentElement;
        private final HttpUrl previewImageUrl;
        private final Instant publishedAt;
        private final int rank;
        private final String relatedInstrumentEducationTourId;
        private final RelatedInstrument secondInstrument;
        private final String source;
        private final String title;

        public static /* synthetic */ EmbeddedArticle copy$default(EmbeddedArticle embeddedArticle, UUID uuid, int i, ParentElement parentElement, String str, String str2, RelatedInstrument relatedInstrument, RelatedInstrument relatedInstrument2, String str3, String str4, Instant instant, HttpUrl httpUrl, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = embeddedArticle.id;
            }
            if ((i2 & 2) != 0) {
                i = embeddedArticle.rank;
            }
            if ((i2 & 4) != 0) {
                parentElement = embeddedArticle.parentElement;
            }
            if ((i2 & 8) != 0) {
                str = embeddedArticle.analyticsContentType;
            }
            if ((i2 & 16) != 0) {
                str2 = embeddedArticle.title;
            }
            if ((i2 & 32) != 0) {
                relatedInstrument = embeddedArticle.firstInstrument;
            }
            if ((i2 & 64) != 0) {
                relatedInstrument2 = embeddedArticle.secondInstrument;
            }
            if ((i2 & 128) != 0) {
                str3 = embeddedArticle.relatedInstrumentEducationTourId;
            }
            if ((i2 & 256) != 0) {
                str4 = embeddedArticle.source;
            }
            if ((i2 & 512) != 0) {
                instant = embeddedArticle.publishedAt;
            }
            if ((i2 & 1024) != 0) {
                httpUrl = embeddedArticle.previewImageUrl;
            }
            if ((i2 & 2048) != 0) {
                z = embeddedArticle.isHero;
            }
            HttpUrl httpUrl2 = httpUrl;
            boolean z2 = z;
            String str5 = str4;
            Instant instant2 = instant;
            RelatedInstrument relatedInstrument3 = relatedInstrument2;
            String str6 = str3;
            String str7 = str2;
            RelatedInstrument relatedInstrument4 = relatedInstrument;
            return embeddedArticle.copy(uuid, i, parentElement, str, str7, relatedInstrument4, relatedInstrument3, str6, str5, instant2, httpUrl2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final Instant getPublishedAt() {
            return this.publishedAt;
        }

        /* renamed from: component11, reason: from getter */
        public final HttpUrl getPreviewImageUrl() {
            return this.previewImageUrl;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getIsHero() {
            return this.isHero;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final ParentElement getParentElement() {
            return this.parentElement;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final RelatedInstrument getFirstInstrument() {
            return this.firstInstrument;
        }

        /* renamed from: component7, reason: from getter */
        public final RelatedInstrument getSecondInstrument() {
            return this.secondInstrument;
        }

        /* renamed from: component8, reason: from getter */
        public final String getRelatedInstrumentEducationTourId() {
            return this.relatedInstrumentEducationTourId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final EmbeddedArticle copy(UUID id, int rank, ParentElement parentElement, String analyticsContentType, String title, RelatedInstrument firstInstrument, RelatedInstrument secondInstrument, String relatedInstrumentEducationTourId, String source, Instant publishedAt, HttpUrl previewImageUrl, boolean isHero) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
            return new EmbeddedArticle(id, rank, parentElement, analyticsContentType, title, firstInstrument, secondInstrument, relatedInstrumentEducationTourId, source, publishedAt, previewImageUrl, isHero);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmbeddedArticle)) {
                return false;
            }
            EmbeddedArticle embeddedArticle = (EmbeddedArticle) other;
            return Intrinsics.areEqual(this.id, embeddedArticle.id) && this.rank == embeddedArticle.rank && Intrinsics.areEqual(this.parentElement, embeddedArticle.parentElement) && Intrinsics.areEqual(this.analyticsContentType, embeddedArticle.analyticsContentType) && Intrinsics.areEqual(this.title, embeddedArticle.title) && Intrinsics.areEqual(this.firstInstrument, embeddedArticle.firstInstrument) && Intrinsics.areEqual(this.secondInstrument, embeddedArticle.secondInstrument) && Intrinsics.areEqual(this.relatedInstrumentEducationTourId, embeddedArticle.relatedInstrumentEducationTourId) && Intrinsics.areEqual(this.source, embeddedArticle.source) && Intrinsics.areEqual(this.publishedAt, embeddedArticle.publishedAt) && Intrinsics.areEqual(this.previewImageUrl, embeddedArticle.previewImageUrl) && this.isHero == embeddedArticle.isHero;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.parentElement.hashCode()) * 31) + this.analyticsContentType.hashCode()) * 31) + this.title.hashCode()) * 31;
            RelatedInstrument relatedInstrument = this.firstInstrument;
            int iHashCode2 = (iHashCode + (relatedInstrument == null ? 0 : relatedInstrument.hashCode())) * 31;
            RelatedInstrument relatedInstrument2 = this.secondInstrument;
            int iHashCode3 = (iHashCode2 + (relatedInstrument2 == null ? 0 : relatedInstrument2.hashCode())) * 31;
            String str = this.relatedInstrumentEducationTourId;
            int iHashCode4 = (((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.source.hashCode()) * 31) + this.publishedAt.hashCode()) * 31;
            HttpUrl httpUrl = this.previewImageUrl;
            return ((iHashCode4 + (httpUrl != null ? httpUrl.hashCode() : 0)) * 31) + Boolean.hashCode(this.isHero);
        }

        public String toString() {
            return "EmbeddedArticle(id=" + this.id + ", rank=" + this.rank + ", parentElement=" + this.parentElement + ", analyticsContentType=" + this.analyticsContentType + ", title=" + this.title + ", firstInstrument=" + this.firstInstrument + ", secondInstrument=" + this.secondInstrument + ", relatedInstrumentEducationTourId=" + this.relatedInstrumentEducationTourId + ", source=" + this.source + ", publishedAt=" + this.publishedAt + ", previewImageUrl=" + this.previewImageUrl + ", isHero=" + this.isHero + ")";
        }

        public /* synthetic */ EmbeddedArticle(UUID uuid, int i, ParentElement parentElement, String str, String str2, RelatedInstrument relatedInstrument, RelatedInstrument relatedInstrument2, String str3, String str4, Instant instant, HttpUrl httpUrl, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i, parentElement, str, str2, relatedInstrument, relatedInstrument2, (i2 & 128) != 0 ? null : str3, str4, instant, httpUrl, z);
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public int getRank() {
            return this.rank;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public ParentElement getParentElement() {
            return this.parentElement;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        public final String getTitle() {
            return this.title;
        }

        public final RelatedInstrument getFirstInstrument() {
            return this.firstInstrument;
        }

        public final RelatedInstrument getSecondInstrument() {
            return this.secondInstrument;
        }

        public final String getRelatedInstrumentEducationTourId() {
            return this.relatedInstrumentEducationTourId;
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

        public final boolean isHero() {
            return this.isHero;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmbeddedArticle(UUID id, int i, ParentElement parentElement, String analyticsContentType, String title, RelatedInstrument relatedInstrument, RelatedInstrument relatedInstrument2, String str, String source, Instant publishedAt, HttpUrl httpUrl, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
            this.id = id;
            this.rank = i;
            this.parentElement = parentElement;
            this.analyticsContentType = analyticsContentType;
            this.title = title;
            this.firstInstrument = relatedInstrument;
            this.secondInstrument = relatedInstrument2;
            this.relatedInstrumentEducationTourId = str;
            this.source = source;
            this.publishedAt = publishedAt;
            this.previewImageUrl = httpUrl;
            this.isHero = z;
            this.analyticsId = getId();
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getAnalyticsId() {
            return this.analyticsId;
        }
    }

    /* compiled from: Content.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Content$Instrument;", "Lcom/robinhood/android/newsfeed/model/Content;", "id", "Ljava/util/UUID;", "rank", "", "parentElement", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "analyticsContentType", "", "instrumentId", "name", "symbol", "<init>", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getRank", "()I", "getParentElement", "()Lcom/robinhood/android/newsfeed/model/ParentElement;", "getAnalyticsContentType", "()Ljava/lang/String;", "getInstrumentId", "getName", "getSymbol", "analyticsId", "getAnalyticsId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Instrument extends Content {
        public static final int $stable = 8;
        private final String analyticsContentType;
        private final UUID analyticsId;
        private final UUID id;
        private final UUID instrumentId;
        private final String name;
        private final ParentElement parentElement;
        private final int rank;
        private final String symbol;

        public static /* synthetic */ Instrument copy$default(Instrument instrument, UUID uuid, int i, ParentElement parentElement, String str, UUID uuid2, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = instrument.id;
            }
            if ((i2 & 2) != 0) {
                i = instrument.rank;
            }
            if ((i2 & 4) != 0) {
                parentElement = instrument.parentElement;
            }
            if ((i2 & 8) != 0) {
                str = instrument.analyticsContentType;
            }
            if ((i2 & 16) != 0) {
                uuid2 = instrument.instrumentId;
            }
            if ((i2 & 32) != 0) {
                str2 = instrument.name;
            }
            if ((i2 & 64) != 0) {
                str3 = instrument.symbol;
            }
            String str4 = str2;
            String str5 = str3;
            UUID uuid3 = uuid2;
            ParentElement parentElement2 = parentElement;
            return instrument.copy(uuid, i, parentElement2, str, uuid3, str4, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final ParentElement getParentElement() {
            return this.parentElement;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final Instrument copy(UUID id, int rank, ParentElement parentElement, String analyticsContentType, UUID instrumentId, String name, String symbol) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            return new Instrument(id, rank, parentElement, analyticsContentType, instrumentId, name, symbol);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Instrument)) {
                return false;
            }
            Instrument instrument = (Instrument) other;
            return Intrinsics.areEqual(this.id, instrument.id) && this.rank == instrument.rank && Intrinsics.areEqual(this.parentElement, instrument.parentElement) && Intrinsics.areEqual(this.analyticsContentType, instrument.analyticsContentType) && Intrinsics.areEqual(this.instrumentId, instrument.instrumentId) && Intrinsics.areEqual(this.name, instrument.name) && Intrinsics.areEqual(this.symbol, instrument.symbol);
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.parentElement.hashCode()) * 31) + this.analyticsContentType.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.symbol.hashCode();
        }

        public String toString() {
            return "Instrument(id=" + this.id + ", rank=" + this.rank + ", parentElement=" + this.parentElement + ", analyticsContentType=" + this.analyticsContentType + ", instrumentId=" + this.instrumentId + ", name=" + this.name + ", symbol=" + this.symbol + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public int getRank() {
            return this.rank;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public ParentElement getParentElement() {
            return this.parentElement;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getName() {
            return this.name;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Instrument(UUID id, int i, ParentElement parentElement, String analyticsContentType, UUID instrumentId, String name, String symbol) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.id = id;
            this.rank = i;
            this.parentElement = parentElement;
            this.analyticsContentType = analyticsContentType;
            this.instrumentId = instrumentId;
            this.name = name;
            this.symbol = symbol;
            this.analyticsId = instrumentId;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getAnalyticsId() {
            return this.analyticsId;
        }
    }

    /* compiled from: Content.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010$J\u0010\u0010-\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b/\u0010.J¤\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b2\u0010!J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010\u001dJ\u001a\u00106\u001a\u00020\u00152\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b@\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bE\u0010&R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bF\u0010!R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bH\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bI\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bJ\u0010$R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bL\u0010.R\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010K\u001a\u0004\b\u0017\u0010.R\u001a\u0010M\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u00108\u001a\u0004\bN\u0010\u001b¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Content$Video;", "Lcom/robinhood/android/newsfeed/model/Content;", "Ljava/util/UUID;", "id", "", "rank", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "parentElement", "", "analyticsContentType", "title", "Lokhttp3/HttpUrl;", "url", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "firstInstrument", "secondInstrument", "source", "j$/time/Instant", "publishedAt", "previewImageUrl", "captions", "", "audioEnabled", "isHero", "<init>", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Ljava/lang/String;Lj$/time/Instant;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;ZZ)V", "component1", "()Ljava/util/UUID;", "component2", "()I", "component3", "()Lcom/robinhood/android/newsfeed/model/ParentElement;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lokhttp3/HttpUrl;", "component7", "()Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "component8", "component9", "component10", "()Lj$/time/Instant;", "component11", "component12", "component13", "()Z", "component14", "copy", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Lcom/robinhood/android/newsfeed/model/RelatedInstrument;Ljava/lang/String;Lj$/time/Instant;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;ZZ)Lcom/robinhood/android/newsfeed/model/Content$Video;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "I", "getRank", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "getParentElement", "Ljava/lang/String;", "getAnalyticsContentType", "getTitle", "Lokhttp3/HttpUrl;", "getUrl", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "getFirstInstrument", "getSecondInstrument", "getSource", "Lj$/time/Instant;", "getPublishedAt", "getPreviewImageUrl", "getCaptions", "Z", "getAudioEnabled", "analyticsId", "getAnalyticsId", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Video extends Content {
        public static final int $stable = 8;
        private final String analyticsContentType;
        private final UUID analyticsId;
        private final boolean audioEnabled;
        private final HttpUrl captions;
        private final RelatedInstrument firstInstrument;
        private final UUID id;
        private final boolean isHero;
        private final ParentElement parentElement;
        private final HttpUrl previewImageUrl;
        private final Instant publishedAt;
        private final int rank;
        private final RelatedInstrument secondInstrument;
        private final String source;
        private final String title;
        private final HttpUrl url;

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final Instant getPublishedAt() {
            return this.publishedAt;
        }

        /* renamed from: component11, reason: from getter */
        public final HttpUrl getPreviewImageUrl() {
            return this.previewImageUrl;
        }

        /* renamed from: component12, reason: from getter */
        public final HttpUrl getCaptions() {
            return this.captions;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getIsHero() {
            return this.isHero;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final ParentElement getParentElement() {
            return this.parentElement;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        /* renamed from: component7, reason: from getter */
        public final RelatedInstrument getFirstInstrument() {
            return this.firstInstrument;
        }

        /* renamed from: component8, reason: from getter */
        public final RelatedInstrument getSecondInstrument() {
            return this.secondInstrument;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Video copy(UUID id, int rank, ParentElement parentElement, String analyticsContentType, String title, HttpUrl url, RelatedInstrument firstInstrument, RelatedInstrument secondInstrument, String source, Instant publishedAt, HttpUrl previewImageUrl, HttpUrl captions, boolean audioEnabled, boolean isHero) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
            return new Video(id, rank, parentElement, analyticsContentType, title, url, firstInstrument, secondInstrument, source, publishedAt, previewImageUrl, captions, audioEnabled, isHero);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return Intrinsics.areEqual(this.id, video.id) && this.rank == video.rank && Intrinsics.areEqual(this.parentElement, video.parentElement) && Intrinsics.areEqual(this.analyticsContentType, video.analyticsContentType) && Intrinsics.areEqual(this.title, video.title) && Intrinsics.areEqual(this.url, video.url) && Intrinsics.areEqual(this.firstInstrument, video.firstInstrument) && Intrinsics.areEqual(this.secondInstrument, video.secondInstrument) && Intrinsics.areEqual(this.source, video.source) && Intrinsics.areEqual(this.publishedAt, video.publishedAt) && Intrinsics.areEqual(this.previewImageUrl, video.previewImageUrl) && Intrinsics.areEqual(this.captions, video.captions) && this.audioEnabled == video.audioEnabled && this.isHero == video.isHero;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.parentElement.hashCode()) * 31) + this.analyticsContentType.hashCode()) * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31;
            RelatedInstrument relatedInstrument = this.firstInstrument;
            int iHashCode2 = (iHashCode + (relatedInstrument == null ? 0 : relatedInstrument.hashCode())) * 31;
            RelatedInstrument relatedInstrument2 = this.secondInstrument;
            int iHashCode3 = (((((iHashCode2 + (relatedInstrument2 == null ? 0 : relatedInstrument2.hashCode())) * 31) + this.source.hashCode()) * 31) + this.publishedAt.hashCode()) * 31;
            HttpUrl httpUrl = this.previewImageUrl;
            int iHashCode4 = (iHashCode3 + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31;
            HttpUrl httpUrl2 = this.captions;
            return ((((iHashCode4 + (httpUrl2 != null ? httpUrl2.hashCode() : 0)) * 31) + Boolean.hashCode(this.audioEnabled)) * 31) + Boolean.hashCode(this.isHero);
        }

        public String toString() {
            return "Video(id=" + this.id + ", rank=" + this.rank + ", parentElement=" + this.parentElement + ", analyticsContentType=" + this.analyticsContentType + ", title=" + this.title + ", url=" + this.url + ", firstInstrument=" + this.firstInstrument + ", secondInstrument=" + this.secondInstrument + ", source=" + this.source + ", publishedAt=" + this.publishedAt + ", previewImageUrl=" + this.previewImageUrl + ", captions=" + this.captions + ", audioEnabled=" + this.audioEnabled + ", isHero=" + this.isHero + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public int getRank() {
            return this.rank;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public ParentElement getParentElement() {
            return this.parentElement;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public String getAnalyticsContentType() {
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

        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        public final boolean isHero() {
            return this.isHero;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Video(UUID id, int i, ParentElement parentElement, String analyticsContentType, String title, HttpUrl url, RelatedInstrument relatedInstrument, RelatedInstrument relatedInstrument2, String source, Instant publishedAt, HttpUrl httpUrl, HttpUrl httpUrl2, boolean z, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
            this.id = id;
            this.rank = i;
            this.parentElement = parentElement;
            this.analyticsContentType = analyticsContentType;
            this.title = title;
            this.url = url;
            this.firstInstrument = relatedInstrument;
            this.secondInstrument = relatedInstrument2;
            this.source = source;
            this.publishedAt = publishedAt;
            this.previewImageUrl = httpUrl;
            this.captions = httpUrl2;
            this.audioEnabled = z;
            this.isHero = z2;
            this.analyticsId = getId();
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getAnalyticsId() {
            return this.analyticsId;
        }
    }

    /* compiled from: Content.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0011HÆ\u0003Jc\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010/\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\"R\u0014\u0010#\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Content$ListPreview;", "Lcom/robinhood/android/newsfeed/model/Content;", "id", "Ljava/util/UUID;", "rank", "", "parentElement", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "analyticsContentType", "", "displayName", "imageUrls", "Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "itemCount", "isBadged", "", "<init>", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;Lcom/robinhood/models/api/ApiCuratedList$OwnerType;IZ)V", "getId", "()Ljava/util/UUID;", "getRank", "()I", "getParentElement", "()Lcom/robinhood/android/newsfeed/model/ParentElement;", "getAnalyticsContentType", "()Ljava/lang/String;", "getDisplayName", "getImageUrls", "()Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;", "getOwnerType", "()Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "getItemCount", "()Z", "analyticsId", "getAnalyticsId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ListPreview extends Content {
        public static final int $stable = 8;
        private final String analyticsContentType;
        private final UUID analyticsId;
        private final String displayName;
        private final UUID id;
        private final SizedUrlHolder imageUrls;
        private final boolean isBadged;
        private final int itemCount;
        private final ApiCuratedList.OwnerType ownerType;
        private final ParentElement parentElement;
        private final int rank;

        public static /* synthetic */ ListPreview copy$default(ListPreview listPreview, UUID uuid, int i, ParentElement parentElement, String str, String str2, SizedUrlHolder sizedUrlHolder, ApiCuratedList.OwnerType ownerType, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                uuid = listPreview.id;
            }
            if ((i3 & 2) != 0) {
                i = listPreview.rank;
            }
            if ((i3 & 4) != 0) {
                parentElement = listPreview.parentElement;
            }
            if ((i3 & 8) != 0) {
                str = listPreview.analyticsContentType;
            }
            if ((i3 & 16) != 0) {
                str2 = listPreview.displayName;
            }
            if ((i3 & 32) != 0) {
                sizedUrlHolder = listPreview.imageUrls;
            }
            if ((i3 & 64) != 0) {
                ownerType = listPreview.ownerType;
            }
            if ((i3 & 128) != 0) {
                i2 = listPreview.itemCount;
            }
            if ((i3 & 256) != 0) {
                z = listPreview.isBadged;
            }
            int i4 = i2;
            boolean z2 = z;
            SizedUrlHolder sizedUrlHolder2 = sizedUrlHolder;
            ApiCuratedList.OwnerType ownerType2 = ownerType;
            String str3 = str2;
            ParentElement parentElement2 = parentElement;
            return listPreview.copy(uuid, i, parentElement2, str, str3, sizedUrlHolder2, ownerType2, i4, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final ParentElement getParentElement() {
            return this.parentElement;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component6, reason: from getter */
        public final SizedUrlHolder getImageUrls() {
            return this.imageUrls;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiCuratedList.OwnerType getOwnerType() {
            return this.ownerType;
        }

        /* renamed from: component8, reason: from getter */
        public final int getItemCount() {
            return this.itemCount;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsBadged() {
            return this.isBadged;
        }

        public final ListPreview copy(UUID id, int rank, ParentElement parentElement, String analyticsContentType, String displayName, SizedUrlHolder imageUrls, ApiCuratedList.OwnerType ownerType, int itemCount, boolean isBadged) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            return new ListPreview(id, rank, parentElement, analyticsContentType, displayName, imageUrls, ownerType, itemCount, isBadged);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListPreview)) {
                return false;
            }
            ListPreview listPreview = (ListPreview) other;
            return Intrinsics.areEqual(this.id, listPreview.id) && this.rank == listPreview.rank && Intrinsics.areEqual(this.parentElement, listPreview.parentElement) && Intrinsics.areEqual(this.analyticsContentType, listPreview.analyticsContentType) && Intrinsics.areEqual(this.displayName, listPreview.displayName) && Intrinsics.areEqual(this.imageUrls, listPreview.imageUrls) && this.ownerType == listPreview.ownerType && this.itemCount == listPreview.itemCount && this.isBadged == listPreview.isBadged;
        }

        public int hashCode() {
            return (((((((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.parentElement.hashCode()) * 31) + this.analyticsContentType.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.imageUrls.hashCode()) * 31) + this.ownerType.hashCode()) * 31) + Integer.hashCode(this.itemCount)) * 31) + Boolean.hashCode(this.isBadged);
        }

        public String toString() {
            return "ListPreview(id=" + this.id + ", rank=" + this.rank + ", parentElement=" + this.parentElement + ", analyticsContentType=" + this.analyticsContentType + ", displayName=" + this.displayName + ", imageUrls=" + this.imageUrls + ", ownerType=" + this.ownerType + ", itemCount=" + this.itemCount + ", isBadged=" + this.isBadged + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public int getRank() {
            return this.rank;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public ParentElement getParentElement() {
            return this.parentElement;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final SizedUrlHolder getImageUrls() {
            return this.imageUrls;
        }

        public final ApiCuratedList.OwnerType getOwnerType() {
            return this.ownerType;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public final boolean isBadged() {
            return this.isBadged;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListPreview(UUID id, int i, ParentElement parentElement, String analyticsContentType, String displayName, SizedUrlHolder imageUrls, ApiCuratedList.OwnerType ownerType, int i2, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            this.id = id;
            this.rank = i;
            this.parentElement = parentElement;
            this.analyticsContentType = analyticsContentType;
            this.displayName = displayName;
            this.imageUrls = imageUrls;
            this.ownerType = ownerType;
            this.itemCount = i2;
            this.isBadged = z;
            this.analyticsId = getId();
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getAnalyticsId() {
            return this.analyticsId;
        }
    }

    /* compiled from: Content.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JK\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Content$EducationSeries;", "Lcom/robinhood/android/newsfeed/model/Content;", "id", "Ljava/util/UUID;", "rank", "", "parentElement", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "analyticsContentType", "", "title", "lessons", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "<init>", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/util/UUID;", "getRank", "()I", "getParentElement", "()Lcom/robinhood/android/newsfeed/model/ParentElement;", "getAnalyticsContentType", "()Ljava/lang/String;", "getTitle", "getLessons", "()Ljava/util/List;", "analyticsId", "getAnalyticsId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EducationSeries extends Content {
        public static final int $stable = 8;
        private final String analyticsContentType;
        private final UUID analyticsId;
        private final UUID id;
        private final List<EducationLessonPreview> lessons;
        private final ParentElement parentElement;
        private final int rank;
        private final String title;

        public static /* synthetic */ EducationSeries copy$default(EducationSeries educationSeries, UUID uuid, int i, ParentElement parentElement, String str, String str2, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = educationSeries.id;
            }
            if ((i2 & 2) != 0) {
                i = educationSeries.rank;
            }
            if ((i2 & 4) != 0) {
                parentElement = educationSeries.parentElement;
            }
            if ((i2 & 8) != 0) {
                str = educationSeries.analyticsContentType;
            }
            if ((i2 & 16) != 0) {
                str2 = educationSeries.title;
            }
            if ((i2 & 32) != 0) {
                list = educationSeries.lessons;
            }
            String str3 = str2;
            List list2 = list;
            return educationSeries.copy(uuid, i, parentElement, str, str3, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final ParentElement getParentElement() {
            return this.parentElement;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<EducationLessonPreview> component6() {
            return this.lessons;
        }

        public final EducationSeries copy(UUID id, int rank, ParentElement parentElement, String analyticsContentType, String title, List<EducationLessonPreview> lessons) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(lessons, "lessons");
            return new EducationSeries(id, rank, parentElement, analyticsContentType, title, lessons);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EducationSeries)) {
                return false;
            }
            EducationSeries educationSeries = (EducationSeries) other;
            return Intrinsics.areEqual(this.id, educationSeries.id) && this.rank == educationSeries.rank && Intrinsics.areEqual(this.parentElement, educationSeries.parentElement) && Intrinsics.areEqual(this.analyticsContentType, educationSeries.analyticsContentType) && Intrinsics.areEqual(this.title, educationSeries.title) && Intrinsics.areEqual(this.lessons, educationSeries.lessons);
        }

        public int hashCode() {
            return (((((((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.parentElement.hashCode()) * 31) + this.analyticsContentType.hashCode()) * 31) + this.title.hashCode()) * 31) + this.lessons.hashCode();
        }

        public String toString() {
            return "EducationSeries(id=" + this.id + ", rank=" + this.rank + ", parentElement=" + this.parentElement + ", analyticsContentType=" + this.analyticsContentType + ", title=" + this.title + ", lessons=" + this.lessons + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public int getRank() {
            return this.rank;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public ParentElement getParentElement() {
            return this.parentElement;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<EducationLessonPreview> getLessons() {
            return this.lessons;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EducationSeries(UUID id, int i, ParentElement parentElement, String analyticsContentType, String title, List<EducationLessonPreview> lessons) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(lessons, "lessons");
            this.id = id;
            this.rank = i;
            this.parentElement = parentElement;
            this.analyticsContentType = analyticsContentType;
            this.title = title;
            this.lessons = lessons;
            this.analyticsId = getId();
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getAnalyticsId() {
            return this.analyticsId;
        }
    }

    /* compiled from: Content.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJV\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0014J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0018R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b/\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001dR\u001a\u00104\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010\u0012¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Content$MarketUpdates;", "Lcom/robinhood/android/newsfeed/model/Content;", "Ljava/util/UUID;", "id", "", "rank", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "parentElement", "", "analyticsContentType", "title", "j$/time/Instant", "publishedAt", "Lcom/robinhood/contentful/markdown/MarkdownContent;", CarResultComposable2.BODY, "<init>", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/contentful/markdown/MarkdownContent;)V", "component1", "()Ljava/util/UUID;", "component2", "()I", "component3", "()Lcom/robinhood/android/newsfeed/model/ParentElement;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lj$/time/Instant;", "component7", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "copy", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/contentful/markdown/MarkdownContent;)Lcom/robinhood/android/newsfeed/model/Content$MarketUpdates;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "I", "getRank", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "getParentElement", "Ljava/lang/String;", "getAnalyticsContentType", "getTitle", "Lj$/time/Instant;", "getPublishedAt", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "getBody", "analyticsId", "getAnalyticsId", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarketUpdates extends Content {
        public static final int $stable = 8;
        private final String analyticsContentType;
        private final UUID analyticsId;
        private final MarkdownContent body;
        private final UUID id;
        private final ParentElement parentElement;
        private final Instant publishedAt;
        private final int rank;
        private final String title;

        public static /* synthetic */ MarketUpdates copy$default(MarketUpdates marketUpdates, UUID uuid, int i, ParentElement parentElement, String str, String str2, Instant instant, MarkdownContent markdownContent, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = marketUpdates.id;
            }
            if ((i2 & 2) != 0) {
                i = marketUpdates.rank;
            }
            if ((i2 & 4) != 0) {
                parentElement = marketUpdates.parentElement;
            }
            if ((i2 & 8) != 0) {
                str = marketUpdates.analyticsContentType;
            }
            if ((i2 & 16) != 0) {
                str2 = marketUpdates.title;
            }
            if ((i2 & 32) != 0) {
                instant = marketUpdates.publishedAt;
            }
            if ((i2 & 64) != 0) {
                markdownContent = marketUpdates.body;
            }
            Instant instant2 = instant;
            MarkdownContent markdownContent2 = markdownContent;
            String str3 = str2;
            ParentElement parentElement2 = parentElement;
            return marketUpdates.copy(uuid, i, parentElement2, str, str3, instant2, markdownContent2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final ParentElement getParentElement() {
            return this.parentElement;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getPublishedAt() {
            return this.publishedAt;
        }

        /* renamed from: component7, reason: from getter */
        public final MarkdownContent getBody() {
            return this.body;
        }

        public final MarketUpdates copy(UUID id, int rank, ParentElement parentElement, String analyticsContentType, String title, Instant publishedAt, MarkdownContent body) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
            Intrinsics.checkNotNullParameter(body, "body");
            return new MarketUpdates(id, rank, parentElement, analyticsContentType, title, publishedAt, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketUpdates)) {
                return false;
            }
            MarketUpdates marketUpdates = (MarketUpdates) other;
            return Intrinsics.areEqual(this.id, marketUpdates.id) && this.rank == marketUpdates.rank && Intrinsics.areEqual(this.parentElement, marketUpdates.parentElement) && Intrinsics.areEqual(this.analyticsContentType, marketUpdates.analyticsContentType) && Intrinsics.areEqual(this.title, marketUpdates.title) && Intrinsics.areEqual(this.publishedAt, marketUpdates.publishedAt) && Intrinsics.areEqual(this.body, marketUpdates.body);
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.parentElement.hashCode()) * 31) + this.analyticsContentType.hashCode()) * 31) + this.title.hashCode()) * 31) + this.publishedAt.hashCode()) * 31) + this.body.hashCode();
        }

        public String toString() {
            return "MarketUpdates(id=" + this.id + ", rank=" + this.rank + ", parentElement=" + this.parentElement + ", analyticsContentType=" + this.analyticsContentType + ", title=" + this.title + ", publishedAt=" + this.publishedAt + ", body=" + this.body + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public int getRank() {
            return this.rank;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public ParentElement getParentElement() {
            return this.parentElement;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Instant getPublishedAt() {
            return this.publishedAt;
        }

        public final MarkdownContent getBody() {
            return this.body;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketUpdates(UUID id, int i, ParentElement parentElement, String analyticsContentType, String title, Instant publishedAt, MarkdownContent body) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
            Intrinsics.checkNotNullParameter(body, "body");
            this.id = id;
            this.rank = i;
            this.parentElement = parentElement;
            this.analyticsContentType = analyticsContentType;
            this.title = title;
            this.publishedAt = publishedAt;
            this.body = body;
            this.analyticsId = getId();
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getAnalyticsId() {
            return this.analyticsId;
        }
    }

    /* compiled from: Content.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/Content$MarketIndicator;", "Lcom/robinhood/android/newsfeed/model/Content;", "id", "Ljava/util/UUID;", "rank", "", "parentElement", "Lcom/robinhood/android/newsfeed/model/ParentElement;", "analyticsContentType", "", AnnotatedPrivateKey.LABEL, "indicatorType", "indicatorKey", "<init>", "(Ljava/util/UUID;ILcom/robinhood/android/newsfeed/model/ParentElement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getRank", "()I", "getParentElement", "()Lcom/robinhood/android/newsfeed/model/ParentElement;", "getAnalyticsContentType", "()Ljava/lang/String;", "getLabel", "getIndicatorType", "getIndicatorKey", "analyticsId", "getAnalyticsId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarketIndicator extends Content {
        public static final String CRYPTO_TYPE = "currency_pair";
        public static final String MARKET_INDEX_TYPE = "bonfire_market_index";
        private final String analyticsContentType;
        private final UUID analyticsId;
        private final UUID id;
        private final String indicatorKey;
        private final String indicatorType;
        private final String label;
        private final ParentElement parentElement;
        private final int rank;
        public static final int $stable = 8;

        public static /* synthetic */ MarketIndicator copy$default(MarketIndicator marketIndicator, UUID uuid, int i, ParentElement parentElement, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = marketIndicator.id;
            }
            if ((i2 & 2) != 0) {
                i = marketIndicator.rank;
            }
            if ((i2 & 4) != 0) {
                parentElement = marketIndicator.parentElement;
            }
            if ((i2 & 8) != 0) {
                str = marketIndicator.analyticsContentType;
            }
            if ((i2 & 16) != 0) {
                str2 = marketIndicator.label;
            }
            if ((i2 & 32) != 0) {
                str3 = marketIndicator.indicatorType;
            }
            if ((i2 & 64) != 0) {
                str4 = marketIndicator.indicatorKey;
            }
            String str5 = str3;
            String str6 = str4;
            String str7 = str2;
            ParentElement parentElement2 = parentElement;
            return marketIndicator.copy(uuid, i, parentElement2, str, str7, str5, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component3, reason: from getter */
        public final ParentElement getParentElement() {
            return this.parentElement;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component6, reason: from getter */
        public final String getIndicatorType() {
            return this.indicatorType;
        }

        /* renamed from: component7, reason: from getter */
        public final String getIndicatorKey() {
            return this.indicatorKey;
        }

        public final MarketIndicator copy(UUID id, int rank, ParentElement parentElement, String analyticsContentType, String label, String indicatorType, String indicatorKey) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(indicatorType, "indicatorType");
            Intrinsics.checkNotNullParameter(indicatorKey, "indicatorKey");
            return new MarketIndicator(id, rank, parentElement, analyticsContentType, label, indicatorType, indicatorKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketIndicator)) {
                return false;
            }
            MarketIndicator marketIndicator = (MarketIndicator) other;
            return Intrinsics.areEqual(this.id, marketIndicator.id) && this.rank == marketIndicator.rank && Intrinsics.areEqual(this.parentElement, marketIndicator.parentElement) && Intrinsics.areEqual(this.analyticsContentType, marketIndicator.analyticsContentType) && Intrinsics.areEqual(this.label, marketIndicator.label) && Intrinsics.areEqual(this.indicatorType, marketIndicator.indicatorType) && Intrinsics.areEqual(this.indicatorKey, marketIndicator.indicatorKey);
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.rank)) * 31) + this.parentElement.hashCode()) * 31) + this.analyticsContentType.hashCode()) * 31) + this.label.hashCode()) * 31) + this.indicatorType.hashCode()) * 31) + this.indicatorKey.hashCode();
        }

        public String toString() {
            return "MarketIndicator(id=" + this.id + ", rank=" + this.rank + ", parentElement=" + this.parentElement + ", analyticsContentType=" + this.analyticsContentType + ", label=" + this.label + ", indicatorType=" + this.indicatorType + ", indicatorKey=" + this.indicatorKey + ")";
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public int getRank() {
            return this.rank;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public ParentElement getParentElement() {
            return this.parentElement;
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public String getAnalyticsContentType() {
            return this.analyticsContentType;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getIndicatorType() {
            return this.indicatorType;
        }

        public final String getIndicatorKey() {
            return this.indicatorKey;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketIndicator(UUID id, int i, ParentElement parentElement, String analyticsContentType, String label, String indicatorType, String indicatorKey) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parentElement, "parentElement");
            Intrinsics.checkNotNullParameter(analyticsContentType, "analyticsContentType");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(indicatorType, "indicatorType");
            Intrinsics.checkNotNullParameter(indicatorKey, "indicatorKey");
            this.id = id;
            this.rank = i;
            this.parentElement = parentElement;
            this.analyticsContentType = analyticsContentType;
            this.label = label;
            this.indicatorType = indicatorType;
            this.indicatorKey = indicatorKey;
            this.analyticsId = getId();
        }

        @Override // com.robinhood.android.newsfeed.model.Content
        public UUID getAnalyticsId() {
            return this.analyticsId;
        }
    }
}
