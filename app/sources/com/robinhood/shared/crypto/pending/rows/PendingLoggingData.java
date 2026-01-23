package com.robinhood.shared.crypto.pending.rows;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PendingSection.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/rows/PendingLoggingData;", "", "orderRowEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "showAllCtaEventDescriptor", "<init>", "(Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "getOrderRowEventDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getShowAllCtaEventDescriptor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-pending-rows_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PendingLoggingData {
    public static final int $stable = 8;
    private final UserInteractionEventDescriptor orderRowEventDescriptor;
    private final UserInteractionEventDescriptor showAllCtaEventDescriptor;

    /* JADX WARN: Multi-variable type inference failed */
    public PendingLoggingData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PendingLoggingData copy$default(PendingLoggingData pendingLoggingData, UserInteractionEventDescriptor userInteractionEventDescriptor, UserInteractionEventDescriptor userInteractionEventDescriptor2, int i, Object obj) {
        if ((i & 1) != 0) {
            userInteractionEventDescriptor = pendingLoggingData.orderRowEventDescriptor;
        }
        if ((i & 2) != 0) {
            userInteractionEventDescriptor2 = pendingLoggingData.showAllCtaEventDescriptor;
        }
        return pendingLoggingData.copy(userInteractionEventDescriptor, userInteractionEventDescriptor2);
    }

    /* renamed from: component1, reason: from getter */
    public final UserInteractionEventDescriptor getOrderRowEventDescriptor() {
        return this.orderRowEventDescriptor;
    }

    /* renamed from: component2, reason: from getter */
    public final UserInteractionEventDescriptor getShowAllCtaEventDescriptor() {
        return this.showAllCtaEventDescriptor;
    }

    public final PendingLoggingData copy(UserInteractionEventDescriptor orderRowEventDescriptor, UserInteractionEventDescriptor showAllCtaEventDescriptor) {
        return new PendingLoggingData(orderRowEventDescriptor, showAllCtaEventDescriptor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingLoggingData)) {
            return false;
        }
        PendingLoggingData pendingLoggingData = (PendingLoggingData) other;
        return Intrinsics.areEqual(this.orderRowEventDescriptor, pendingLoggingData.orderRowEventDescriptor) && Intrinsics.areEqual(this.showAllCtaEventDescriptor, pendingLoggingData.showAllCtaEventDescriptor);
    }

    public int hashCode() {
        UserInteractionEventDescriptor userInteractionEventDescriptor = this.orderRowEventDescriptor;
        int iHashCode = (userInteractionEventDescriptor == null ? 0 : userInteractionEventDescriptor.hashCode()) * 31;
        UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.showAllCtaEventDescriptor;
        return iHashCode + (userInteractionEventDescriptor2 != null ? userInteractionEventDescriptor2.hashCode() : 0);
    }

    public String toString() {
        return "PendingLoggingData(orderRowEventDescriptor=" + this.orderRowEventDescriptor + ", showAllCtaEventDescriptor=" + this.showAllCtaEventDescriptor + ")";
    }

    public PendingLoggingData(UserInteractionEventDescriptor userInteractionEventDescriptor, UserInteractionEventDescriptor userInteractionEventDescriptor2) {
        this.orderRowEventDescriptor = userInteractionEventDescriptor;
        this.showAllCtaEventDescriptor = userInteractionEventDescriptor2;
    }

    public /* synthetic */ PendingLoggingData(UserInteractionEventDescriptor userInteractionEventDescriptor, UserInteractionEventDescriptor userInteractionEventDescriptor2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userInteractionEventDescriptor, (i & 2) != 0 ? null : userInteractionEventDescriptor2);
    }

    public final UserInteractionEventDescriptor getOrderRowEventDescriptor() {
        return this.orderRowEventDescriptor;
    }

    public final UserInteractionEventDescriptor getShowAllCtaEventDescriptor() {
        return this.showAllCtaEventDescriptor;
    }
}
