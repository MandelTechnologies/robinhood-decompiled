package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.richLink;

import android.net.Uri;
import com.salesforce.android.smi.common.internal.util.URLUtils;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.titleItem.TitleItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkItem.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/richLink/LinkItem;", "", "url", "", "titleItem", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleLinkItem;", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleLinkItem;)V", "getUrl", "()Ljava/lang/String;", "getTitleItem", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$TitleLinkItem;", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LinkItem {
    private final TitleItem.TitleLinkItem titleItem;
    private final transient Uri uri;
    private final String url;

    public static /* synthetic */ LinkItem copy$default(LinkItem linkItem, String str, TitleItem.TitleLinkItem titleLinkItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkItem.url;
        }
        if ((i & 2) != 0) {
            titleLinkItem = linkItem.titleItem;
        }
        return linkItem.copy(str, titleLinkItem);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final TitleItem.TitleLinkItem getTitleItem() {
        return this.titleItem;
    }

    public final LinkItem copy(String url, TitleItem.TitleLinkItem titleItem) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(titleItem, "titleItem");
        return new LinkItem(url, titleItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkItem)) {
            return false;
        }
        LinkItem linkItem = (LinkItem) other;
        return Intrinsics.areEqual(this.url, linkItem.url) && Intrinsics.areEqual(this.titleItem, linkItem.titleItem);
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + this.titleItem.hashCode();
    }

    public String toString() {
        return "LinkItem(url=" + this.url + ", titleItem=" + this.titleItem + ")";
    }

    public LinkItem(String url, TitleItem.TitleLinkItem titleItem) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(titleItem, "titleItem");
        this.url = url;
        this.titleItem = titleItem;
        this.uri = URLUtils.INSTANCE.getToUriOrNull(url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final TitleItem.TitleLinkItem getTitleItem() {
        return this.titleItem;
    }

    public final Uri getUri() {
        return this.uri;
    }
}
