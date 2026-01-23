package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations;

import android.net.Uri;
import com.salesforce.android.smi.common.internal.util.URLUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CitationLink.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationLink;", "", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CitationLink {
    private final transient Uri uri;
    private final String url;

    public static /* synthetic */ CitationLink copy$default(CitationLink citationLink, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = citationLink.url;
        }
        return citationLink.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final CitationLink copy(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new CitationLink(url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CitationLink) && Intrinsics.areEqual(this.url, ((CitationLink) other).url);
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "CitationLink(url=" + this.url + ")";
    }

    public CitationLink(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.uri = URLUtils.INSTANCE.getToUriOrNull(url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final Uri getUri() {
        return this.uri;
    }
}
