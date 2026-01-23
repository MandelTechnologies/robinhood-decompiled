package com.robinhood.android.search.newsfeed.embeddedarticle;

import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.newsfeed.p334db.NewsFeedEmbeddedContent;
import com.robinhood.models.newsfeed.p334db.NewsFeedInstrument;
import com.robinhood.models.newsfeed.p334db.NewsFeedMedia;
import com.robinhood.models.p320db.Quote;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewsFeedEmbeddedContentViewState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÂ\u0003J+\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020 HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState;", "", "contentState", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState;", "firstQuote", "Lcom/robinhood/models/db/Quote;", "secondQuote", "<init>", "(Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Quote;)V", "getContentState", "()Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState;", "content", "Lcom/robinhood/models/newsfeed/db/NewsFeedEmbeddedContent;", "getContent", "()Lcom/robinhood/models/newsfeed/db/NewsFeedEmbeddedContent;", "bannerLogo", "Lcom/robinhood/models/newsfeed/db/NewsFeedEmbeddedContent$BannerLogo;", "getBannerLogo", "()Lcom/robinhood/models/newsfeed/db/NewsFeedEmbeddedContent$BannerLogo;", "headerMedia", "Lcom/robinhood/models/newsfeed/db/NewsFeedMedia;", "getHeaderMedia", "()Lcom/robinhood/models/newsfeed/db/NewsFeedMedia;", "firstRelatedInstrumentAndQuote", "Lkotlin/Pair;", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "getFirstRelatedInstrumentAndQuote", "()Lkotlin/Pair;", "secondRelatedInstrumentAndQuote", "getSecondRelatedInstrumentAndQuote", "getRelatedInstrument", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ContentState", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class NewsFeedEmbeddedContentViewState {
    public static final int $stable = 8;
    private final ContentState contentState;
    private final Quote firstQuote;
    private final Quote secondQuote;

    public NewsFeedEmbeddedContentViewState() {
        this(null, null, null, 7, null);
    }

    /* renamed from: component2, reason: from getter */
    private final Quote getFirstQuote() {
        return this.firstQuote;
    }

    /* renamed from: component3, reason: from getter */
    private final Quote getSecondQuote() {
        return this.secondQuote;
    }

    public static /* synthetic */ NewsFeedEmbeddedContentViewState copy$default(NewsFeedEmbeddedContentViewState newsFeedEmbeddedContentViewState, ContentState contentState, Quote quote, Quote quote2, int i, Object obj) {
        if ((i & 1) != 0) {
            contentState = newsFeedEmbeddedContentViewState.contentState;
        }
        if ((i & 2) != 0) {
            quote = newsFeedEmbeddedContentViewState.firstQuote;
        }
        if ((i & 4) != 0) {
            quote2 = newsFeedEmbeddedContentViewState.secondQuote;
        }
        return newsFeedEmbeddedContentViewState.copy(contentState, quote, quote2);
    }

    /* renamed from: component1, reason: from getter */
    public final ContentState getContentState() {
        return this.contentState;
    }

    public final NewsFeedEmbeddedContentViewState copy(ContentState contentState, Quote firstQuote, Quote secondQuote) {
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        return new NewsFeedEmbeddedContentViewState(contentState, firstQuote, secondQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsFeedEmbeddedContentViewState)) {
            return false;
        }
        NewsFeedEmbeddedContentViewState newsFeedEmbeddedContentViewState = (NewsFeedEmbeddedContentViewState) other;
        return Intrinsics.areEqual(this.contentState, newsFeedEmbeddedContentViewState.contentState) && Intrinsics.areEqual(this.firstQuote, newsFeedEmbeddedContentViewState.firstQuote) && Intrinsics.areEqual(this.secondQuote, newsFeedEmbeddedContentViewState.secondQuote);
    }

    public int hashCode() {
        int iHashCode = this.contentState.hashCode() * 31;
        Quote quote = this.firstQuote;
        int iHashCode2 = (iHashCode + (quote == null ? 0 : quote.hashCode())) * 31;
        Quote quote2 = this.secondQuote;
        return iHashCode2 + (quote2 != null ? quote2.hashCode() : 0);
    }

    public String toString() {
        return "NewsFeedEmbeddedContentViewState(contentState=" + this.contentState + ", firstQuote=" + this.firstQuote + ", secondQuote=" + this.secondQuote + ")";
    }

    public NewsFeedEmbeddedContentViewState(ContentState contentState, Quote quote, Quote quote2) {
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        this.contentState = contentState;
        this.firstQuote = quote;
        this.secondQuote = quote2;
    }

    public /* synthetic */ NewsFeedEmbeddedContentViewState(ContentState contentState, Quote quote, Quote quote2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ContentState.Loading.INSTANCE : contentState, (i & 2) != 0 ? null : quote, (i & 4) != 0 ? null : quote2);
    }

    public final ContentState getContentState() {
        return this.contentState;
    }

    public final NewsFeedEmbeddedContent getContent() {
        ContentState contentState = this.contentState;
        ContentState.Success success = contentState instanceof ContentState.Success ? (ContentState.Success) contentState : null;
        if (success != null) {
            return success.getContent();
        }
        return null;
    }

    public final NewsFeedEmbeddedContent.BannerLogo getBannerLogo() {
        NewsFeedEmbeddedContent content = getContent();
        if (content != null) {
            return content.getBannerLogo();
        }
        return null;
    }

    public final NewsFeedMedia getHeaderMedia() {
        NewsFeedEmbeddedContent content = getContent();
        if (content != null) {
            return content.getMedia();
        }
        return null;
    }

    public final Tuples2<RelatedInstrument, Quote> getFirstRelatedInstrumentAndQuote() {
        RelatedInstrument relatedInstrument = getRelatedInstrument(0);
        if (relatedInstrument != null) {
            return Tuples4.m3642to(relatedInstrument, this.firstQuote);
        }
        return null;
    }

    public final Tuples2<RelatedInstrument, Quote> getSecondRelatedInstrumentAndQuote() {
        RelatedInstrument relatedInstrument = getRelatedInstrument(1);
        if (relatedInstrument != null) {
            return Tuples4.m3642to(relatedInstrument, this.secondQuote);
        }
        return null;
    }

    private final RelatedInstrument getRelatedInstrument(int index) {
        List<NewsFeedInstrument> relatedInstruments;
        NewsFeedInstrument newsFeedInstrument;
        NewsFeedEmbeddedContent content = getContent();
        if (content == null || (relatedInstruments = content.getRelatedInstruments()) == null || (newsFeedInstrument = (NewsFeedInstrument) CollectionsKt.getOrNull(relatedInstruments, index)) == null) {
            return null;
        }
        return new RelatedInstrument(newsFeedInstrument.getInstrumentId(), newsFeedInstrument.getSymbol());
    }

    /* compiled from: NewsFeedEmbeddedContentViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState;", "", "<init>", "()V", "Loading", "Failed", "Success", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState$Failed;", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState$Loading;", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState$Success;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ContentState {
        public static final int $stable = 0;

        public /* synthetic */ ContentState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: NewsFeedEmbeddedContentViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState$Loading;", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState;", "<init>", "()V", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends ContentState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private ContentState() {
        }

        /* compiled from: NewsFeedEmbeddedContentViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState$Failed;", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState;", "<init>", "()V", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Failed extends ContentState {
            public static final int $stable = 0;
            public static final Failed INSTANCE = new Failed();

            private Failed() {
                super(null);
            }
        }

        /* compiled from: NewsFeedEmbeddedContentViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState$Success;", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState$ContentState;", "content", "Lcom/robinhood/models/newsfeed/db/NewsFeedEmbeddedContent;", "<init>", "(Lcom/robinhood/models/newsfeed/db/NewsFeedEmbeddedContent;)V", "getContent", "()Lcom/robinhood/models/newsfeed/db/NewsFeedEmbeddedContent;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Success extends ContentState {
            public static final int $stable = 8;
            private final NewsFeedEmbeddedContent content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(NewsFeedEmbeddedContent content) {
                super(null);
                Intrinsics.checkNotNullParameter(content, "content");
                this.content = content;
            }

            public final NewsFeedEmbeddedContent getContent() {
                return this.content;
            }
        }
    }
}
