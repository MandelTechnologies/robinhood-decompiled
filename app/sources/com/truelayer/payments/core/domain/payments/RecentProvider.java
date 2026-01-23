package com.truelayer.payments.core.domain.payments;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecentProvider.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/RecentProvider;", "", "id", "", "lastUsedDate", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "getLastUsedDate", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RecentProvider {
    private final String id;
    private final Date lastUsedDate;

    public static /* synthetic */ RecentProvider copy$default(RecentProvider recentProvider, String str, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentProvider.id;
        }
        if ((i & 2) != 0) {
            date = recentProvider.lastUsedDate;
        }
        return recentProvider.copy(str, date);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getLastUsedDate() {
        return this.lastUsedDate;
    }

    public final RecentProvider copy(String id, Date lastUsedDate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(lastUsedDate, "lastUsedDate");
        return new RecentProvider(id, lastUsedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentProvider)) {
            return false;
        }
        RecentProvider recentProvider = (RecentProvider) other;
        return Intrinsics.areEqual(this.id, recentProvider.id) && Intrinsics.areEqual(this.lastUsedDate, recentProvider.lastUsedDate);
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.lastUsedDate.hashCode();
    }

    public String toString() {
        return "RecentProvider(id=" + this.id + ", lastUsedDate=" + this.lastUsedDate + ")";
    }

    public RecentProvider(String id, Date lastUsedDate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(lastUsedDate, "lastUsedDate");
        this.id = id;
        this.lastUsedDate = lastUsedDate;
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ RecentProvider(String str, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Date() : date);
    }

    public final Date getLastUsedDate() {
        return this.lastUsedDate;
    }
}
