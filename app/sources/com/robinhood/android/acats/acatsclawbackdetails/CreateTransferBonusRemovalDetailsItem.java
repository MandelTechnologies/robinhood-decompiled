package com.robinhood.android.acats.acatsclawbackdetails;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferBonusRemovalDetails.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsItem;", "", "title", "", "contentMarkdown", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getContentMarkdown", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-acats-clawback-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class CreateTransferBonusRemovalDetailsItem {
    public static final int $stable = 0;
    private final String contentMarkdown;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateTransferBonusRemovalDetailsItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CreateTransferBonusRemovalDetailsItem copy$default(CreateTransferBonusRemovalDetailsItem createTransferBonusRemovalDetailsItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createTransferBonusRemovalDetailsItem.title;
        }
        if ((i & 2) != 0) {
            str2 = createTransferBonusRemovalDetailsItem.contentMarkdown;
        }
        return createTransferBonusRemovalDetailsItem.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContentMarkdown() {
        return this.contentMarkdown;
    }

    public final CreateTransferBonusRemovalDetailsItem copy(String title, String contentMarkdown) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contentMarkdown, "contentMarkdown");
        return new CreateTransferBonusRemovalDetailsItem(title, contentMarkdown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTransferBonusRemovalDetailsItem)) {
            return false;
        }
        CreateTransferBonusRemovalDetailsItem createTransferBonusRemovalDetailsItem = (CreateTransferBonusRemovalDetailsItem) other;
        return Intrinsics.areEqual(this.title, createTransferBonusRemovalDetailsItem.title) && Intrinsics.areEqual(this.contentMarkdown, createTransferBonusRemovalDetailsItem.contentMarkdown);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.contentMarkdown.hashCode();
    }

    public String toString() {
        return "CreateTransferBonusRemovalDetailsItem(title=" + this.title + ", contentMarkdown=" + this.contentMarkdown + ")";
    }

    public CreateTransferBonusRemovalDetailsItem(String title, String contentMarkdown) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contentMarkdown, "contentMarkdown");
        this.title = title;
        this.contentMarkdown = contentMarkdown;
    }

    public /* synthetic */ CreateTransferBonusRemovalDetailsItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getContentMarkdown() {
        return this.contentMarkdown;
    }
}
