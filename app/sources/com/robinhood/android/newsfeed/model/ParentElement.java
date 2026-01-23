package com.robinhood.android.newsfeed.model;

import com.robinhood.android.util.notification.RhGcmListenerService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParentElement.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/ParentElement;", "", "elementId", "Ljava/util/UUID;", "template", "", RhGcmListenerService.EXTRA_CATEGORY, "rank", "", "contentCount", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;II)V", "getElementId", "()Ljava/util/UUID;", "getTemplate", "()Ljava/lang/String;", "getCategory", "getRank", "()I", "getContentCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ParentElement {
    public static final int $stable = 8;
    private final String category;
    private final int contentCount;
    private final UUID elementId;
    private final int rank;
    private final String template;

    public static /* synthetic */ ParentElement copy$default(ParentElement parentElement, UUID uuid, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            uuid = parentElement.elementId;
        }
        if ((i3 & 2) != 0) {
            str = parentElement.template;
        }
        if ((i3 & 4) != 0) {
            str2 = parentElement.category;
        }
        if ((i3 & 8) != 0) {
            i = parentElement.rank;
        }
        if ((i3 & 16) != 0) {
            i2 = parentElement.contentCount;
        }
        int i4 = i2;
        String str3 = str2;
        return parentElement.copy(uuid, str, str3, i, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getElementId() {
        return this.elementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTemplate() {
        return this.template;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component5, reason: from getter */
    public final int getContentCount() {
        return this.contentCount;
    }

    public final ParentElement copy(UUID elementId, String template, String category, int rank, int contentCount) {
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(category, "category");
        return new ParentElement(elementId, template, category, rank, contentCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParentElement)) {
            return false;
        }
        ParentElement parentElement = (ParentElement) other;
        return Intrinsics.areEqual(this.elementId, parentElement.elementId) && Intrinsics.areEqual(this.template, parentElement.template) && Intrinsics.areEqual(this.category, parentElement.category) && this.rank == parentElement.rank && this.contentCount == parentElement.contentCount;
    }

    public int hashCode() {
        return (((((((this.elementId.hashCode() * 31) + this.template.hashCode()) * 31) + this.category.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.contentCount);
    }

    public String toString() {
        return "ParentElement(elementId=" + this.elementId + ", template=" + this.template + ", category=" + this.category + ", rank=" + this.rank + ", contentCount=" + this.contentCount + ")";
    }

    public ParentElement(UUID elementId, String template, String category, int i, int i2) {
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(category, "category");
        this.elementId = elementId;
        this.template = template;
        this.category = category;
        this.rank = i;
        this.contentCount = i2;
    }

    public final UUID getElementId() {
        return this.elementId;
    }

    public final String getTemplate() {
        return this.template;
    }

    public final String getCategory() {
        return this.category;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getContentCount() {
        return this.contentCount;
    }
}
