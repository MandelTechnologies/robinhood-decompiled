package com.robinhood.android.crypto.p094ui.detail.newsfeed.section;

import com.robinhood.android.markdown.compose.MarkdownText4;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* compiled from: NewsfeedComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b*\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b+\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b\f\u0010\u0019¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/newsfeed/section/NewsfeedRowState;", "", "Ljava/util/UUID;", "id", "", MarkdownText4.TagImageUrl, "j$/time/Duration", "publishedAt", "source", "title", "url", "", "isLoading", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lj$/time/Duration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "()Lj$/time/Duration;", "component4", "component5", "component6", "component7", "()Z", "copy", "(Ljava/util/UUID;Ljava/lang/String;Lj$/time/Duration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/robinhood/android/crypto/ui/detail/newsfeed/section/NewsfeedRowState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "Ljava/lang/String;", "getImageUrl", "Lj$/time/Duration;", "getPublishedAt", "getSource", "getTitle", "getUrl", "Z", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewsfeedRowState {
    public static final int $stable = 8;
    private final UUID id;
    private final String imageUrl;
    private final boolean isLoading;
    private final Duration publishedAt;
    private final String source;
    private final String title;
    private final String url;

    public static /* synthetic */ NewsfeedRowState copy$default(NewsfeedRowState newsfeedRowState, UUID uuid, String str, Duration duration, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = newsfeedRowState.id;
        }
        if ((i & 2) != 0) {
            str = newsfeedRowState.imageUrl;
        }
        if ((i & 4) != 0) {
            duration = newsfeedRowState.publishedAt;
        }
        if ((i & 8) != 0) {
            str2 = newsfeedRowState.source;
        }
        if ((i & 16) != 0) {
            str3 = newsfeedRowState.title;
        }
        if ((i & 32) != 0) {
            str4 = newsfeedRowState.url;
        }
        if ((i & 64) != 0) {
            z = newsfeedRowState.isLoading;
        }
        String str5 = str4;
        boolean z2 = z;
        String str6 = str3;
        Duration duration2 = duration;
        return newsfeedRowState.copy(uuid, str, duration2, str2, str6, str5, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final Duration getPublishedAt() {
        return this.publishedAt;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final NewsfeedRowState copy(UUID id, String imageUrl, Duration publishedAt, String source, String title, String url, boolean isLoading) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        return new NewsfeedRowState(id, imageUrl, publishedAt, source, title, url, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsfeedRowState)) {
            return false;
        }
        NewsfeedRowState newsfeedRowState = (NewsfeedRowState) other;
        return Intrinsics.areEqual(this.id, newsfeedRowState.id) && Intrinsics.areEqual(this.imageUrl, newsfeedRowState.imageUrl) && Intrinsics.areEqual(this.publishedAt, newsfeedRowState.publishedAt) && Intrinsics.areEqual(this.source, newsfeedRowState.source) && Intrinsics.areEqual(this.title, newsfeedRowState.title) && Intrinsics.areEqual(this.url, newsfeedRowState.url) && this.isLoading == newsfeedRowState.isLoading;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.imageUrl;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.publishedAt.hashCode()) * 31) + this.source.hashCode()) * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "NewsfeedRowState(id=" + this.id + ", imageUrl=" + this.imageUrl + ", publishedAt=" + this.publishedAt + ", source=" + this.source + ", title=" + this.title + ", url=" + this.url + ", isLoading=" + this.isLoading + ")";
    }

    public NewsfeedRowState(UUID id, String str, Duration publishedAt, String source, String title, String url, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        this.id = id;
        this.imageUrl = str;
        this.publishedAt = publishedAt;
        this.source = source;
        this.title = title;
        this.url = url;
        this.isLoading = z;
    }

    public /* synthetic */ NewsfeedRowState(UUID uuid, String str, Duration duration, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, duration, str2, str3, str4, (i & 64) != 0 ? false : z);
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Duration getPublishedAt() {
        return this.publishedAt;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
