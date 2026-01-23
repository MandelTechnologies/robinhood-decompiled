package com.truelayer.payments.core.domain.payments;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecentAdditionalInput.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;", "", "inputId", "", "value", "lastUsedDate", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "getInputId", "()Ljava/lang/String;", "getLastUsedDate", "()Ljava/util/Date;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RecentAdditionalInput {
    private final String inputId;
    private final Date lastUsedDate;
    private final String value;

    public static /* synthetic */ RecentAdditionalInput copy$default(RecentAdditionalInput recentAdditionalInput, String str, String str2, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentAdditionalInput.inputId;
        }
        if ((i & 2) != 0) {
            str2 = recentAdditionalInput.value;
        }
        if ((i & 4) != 0) {
            date = recentAdditionalInput.lastUsedDate;
        }
        return recentAdditionalInput.copy(str, str2, date);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInputId() {
        return this.inputId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getLastUsedDate() {
        return this.lastUsedDate;
    }

    public final RecentAdditionalInput copy(String inputId, String value, Date lastUsedDate) {
        Intrinsics.checkNotNullParameter(inputId, "inputId");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(lastUsedDate, "lastUsedDate");
        return new RecentAdditionalInput(inputId, value, lastUsedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentAdditionalInput)) {
            return false;
        }
        RecentAdditionalInput recentAdditionalInput = (RecentAdditionalInput) other;
        return Intrinsics.areEqual(this.inputId, recentAdditionalInput.inputId) && Intrinsics.areEqual(this.value, recentAdditionalInput.value) && Intrinsics.areEqual(this.lastUsedDate, recentAdditionalInput.lastUsedDate);
    }

    public int hashCode() {
        return (((this.inputId.hashCode() * 31) + this.value.hashCode()) * 31) + this.lastUsedDate.hashCode();
    }

    public String toString() {
        return "RecentAdditionalInput(inputId=" + this.inputId + ", value=" + this.value + ", lastUsedDate=" + this.lastUsedDate + ")";
    }

    public RecentAdditionalInput(String inputId, String value, Date lastUsedDate) {
        Intrinsics.checkNotNullParameter(inputId, "inputId");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(lastUsedDate, "lastUsedDate");
        this.inputId = inputId;
        this.value = value;
        this.lastUsedDate = lastUsedDate;
    }

    public final String getInputId() {
        return this.inputId;
    }

    public final String getValue() {
        return this.value;
    }

    public final Date getLastUsedDate() {
        return this.lastUsedDate;
    }
}
