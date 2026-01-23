package com.robinhood.android.accountcenter.views;

import android.net.Uri;
import com.robinhood.lists.models.shared.p298db.SizedUrlHolder;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/InsightItem;", "", "id", "", "title", "Lcom/robinhood/models/serverdriven/db/RichText;", "description", "deeplink", "Landroid/net/Uri;", "imageUrls", "Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/serverdriven/db/RichText;Landroid/net/Uri;Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lcom/robinhood/models/serverdriven/db/RichText;", "getDescription", "getDeeplink", "()Landroid/net/Uri;", "getImageUrls", "()Lcom/robinhood/lists/models/shared/db/SizedUrlHolder;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class InsightItem {
    public static final int $stable = 8;
    private final Uri deeplink;
    private final RichText description;
    private final String id;
    private final SizedUrlHolder imageUrls;
    private final RichText title;

    public static /* synthetic */ InsightItem copy$default(InsightItem insightItem, String str, RichText richText, RichText richText2, Uri uri, SizedUrlHolder sizedUrlHolder, int i, Object obj) {
        if ((i & 1) != 0) {
            str = insightItem.id;
        }
        if ((i & 2) != 0) {
            richText = insightItem.title;
        }
        if ((i & 4) != 0) {
            richText2 = insightItem.description;
        }
        if ((i & 8) != 0) {
            uri = insightItem.deeplink;
        }
        if ((i & 16) != 0) {
            sizedUrlHolder = insightItem.imageUrls;
        }
        SizedUrlHolder sizedUrlHolder2 = sizedUrlHolder;
        RichText richText3 = richText2;
        return insightItem.copy(str, richText, richText3, uri, sizedUrlHolder2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final RichText getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final RichText getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final Uri getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component5, reason: from getter */
    public final SizedUrlHolder getImageUrls() {
        return this.imageUrls;
    }

    public final InsightItem copy(String id, RichText title, RichText description, Uri deeplink, SizedUrlHolder imageUrls) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        return new InsightItem(id, title, description, deeplink, imageUrls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsightItem)) {
            return false;
        }
        InsightItem insightItem = (InsightItem) other;
        return Intrinsics.areEqual(this.id, insightItem.id) && Intrinsics.areEqual(this.title, insightItem.title) && Intrinsics.areEqual(this.description, insightItem.description) && Intrinsics.areEqual(this.deeplink, insightItem.deeplink) && Intrinsics.areEqual(this.imageUrls, insightItem.imageUrls);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        Uri uri = this.deeplink;
        return ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.imageUrls.hashCode();
    }

    public String toString() {
        return "InsightItem(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", deeplink=" + this.deeplink + ", imageUrls=" + this.imageUrls + ")";
    }

    public InsightItem(String id, RichText title, RichText description, Uri uri, SizedUrlHolder imageUrls) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        this.id = id;
        this.title = title;
        this.description = description;
        this.deeplink = uri;
        this.imageUrls = imageUrls;
    }

    public final String getId() {
        return this.id;
    }

    public final RichText getTitle() {
        return this.title;
    }

    public final RichText getDescription() {
        return this.description;
    }

    public final Uri getDeeplink() {
        return this.deeplink;
    }

    public final SizedUrlHolder getImageUrls() {
        return this.imageUrls;
    }
}
