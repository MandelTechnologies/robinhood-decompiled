package com.robinhood.android.event.detail.builders;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BreakingNewsInputData.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/detail/builders/BreakingNewsInputData;", "", "eventId", "Ljava/util/UUID;", "accountNumber", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getEventId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BreakingNewsInputData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID eventId;

    public static /* synthetic */ BreakingNewsInputData copy$default(BreakingNewsInputData breakingNewsInputData, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = breakingNewsInputData.eventId;
        }
        if ((i & 2) != 0) {
            str = breakingNewsInputData.accountNumber;
        }
        return breakingNewsInputData.copy(uuid, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BreakingNewsInputData copy(UUID eventId, String accountNumber) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return new BreakingNewsInputData(eventId, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreakingNewsInputData)) {
            return false;
        }
        BreakingNewsInputData breakingNewsInputData = (BreakingNewsInputData) other;
        return Intrinsics.areEqual(this.eventId, breakingNewsInputData.eventId) && Intrinsics.areEqual(this.accountNumber, breakingNewsInputData.accountNumber);
    }

    public int hashCode() {
        int iHashCode = this.eventId.hashCode() * 31;
        String str = this.accountNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BreakingNewsInputData(eventId=" + this.eventId + ", accountNumber=" + this.accountNumber + ")";
    }

    public BreakingNewsInputData(UUID eventId, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.eventId = eventId;
        this.accountNumber = str;
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
