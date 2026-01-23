package com.robinhood.android.inbox.p156ui.thread;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: ThreadDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ExternalAction;", "", "text", "", "subtitle", "url", "Lokhttp3/HttpUrl;", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lokhttp3/HttpUrl;)V", "getText", "()Ljava/lang/CharSequence;", "getSubtitle", "getUrl", "()Lokhttp3/HttpUrl;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ExternalAction {
    private final CharSequence subtitle;
    private final CharSequence text;
    private final HttpUrl url;

    public static /* synthetic */ ExternalAction copy$default(ExternalAction externalAction, CharSequence charSequence, CharSequence charSequence2, HttpUrl httpUrl, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = externalAction.text;
        }
        if ((i & 2) != 0) {
            charSequence2 = externalAction.subtitle;
        }
        if ((i & 4) != 0) {
            httpUrl = externalAction.url;
        }
        return externalAction.copy(charSequence, charSequence2, httpUrl);
    }

    /* renamed from: component1, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    public final ExternalAction copy(CharSequence text, CharSequence subtitle, HttpUrl url) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(url, "url");
        return new ExternalAction(text, subtitle, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalAction)) {
            return false;
        }
        ExternalAction externalAction = (ExternalAction) other;
        return Intrinsics.areEqual(this.text, externalAction.text) && Intrinsics.areEqual(this.subtitle, externalAction.subtitle) && Intrinsics.areEqual(this.url, externalAction.url);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        CharSequence charSequence = this.text;
        CharSequence charSequence2 = this.subtitle;
        return "ExternalAction(text=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", url=" + this.url + ")";
    }

    public ExternalAction(CharSequence text, CharSequence subtitle, HttpUrl url) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(url, "url");
        this.text = text;
        this.subtitle = subtitle;
        this.url = url;
    }

    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final HttpUrl getUrl() {
        return this.url;
    }
}
