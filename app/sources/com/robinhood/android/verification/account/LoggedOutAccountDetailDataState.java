package com.robinhood.android.verification.account;

import com.robinhood.models.p355ui.PhoneNumber;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggedOutAccountDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDataState;", "", "inquiryId", "Ljava/util/UUID;", "email", "", "phoneNumber", "Lcom/robinhood/models/ui/PhoneNumber;", "isRefreshingInquiry", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/ui/PhoneNumber;Z)V", "getInquiryId", "()Ljava/util/UUID;", "getEmail", "()Ljava/lang/String;", "getPhoneNumber", "()Lcom/robinhood/models/ui/PhoneNumber;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class LoggedOutAccountDetailDataState {
    public static final int $stable = 8;
    private final String email;
    private final UUID inquiryId;
    private final boolean isRefreshingInquiry;
    private final PhoneNumber phoneNumber;

    public static /* synthetic */ LoggedOutAccountDetailDataState copy$default(LoggedOutAccountDetailDataState loggedOutAccountDetailDataState, UUID uuid, String str, PhoneNumber phoneNumber, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = loggedOutAccountDetailDataState.inquiryId;
        }
        if ((i & 2) != 0) {
            str = loggedOutAccountDetailDataState.email;
        }
        if ((i & 4) != 0) {
            phoneNumber = loggedOutAccountDetailDataState.phoneNumber;
        }
        if ((i & 8) != 0) {
            z = loggedOutAccountDetailDataState.isRefreshingInquiry;
        }
        return loggedOutAccountDetailDataState.copy(uuid, str, phoneNumber, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRefreshingInquiry() {
        return this.isRefreshingInquiry;
    }

    public final LoggedOutAccountDetailDataState copy(UUID inquiryId, String email, PhoneNumber phoneNumber, boolean isRefreshingInquiry) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return new LoggedOutAccountDetailDataState(inquiryId, email, phoneNumber, isRefreshingInquiry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoggedOutAccountDetailDataState)) {
            return false;
        }
        LoggedOutAccountDetailDataState loggedOutAccountDetailDataState = (LoggedOutAccountDetailDataState) other;
        return Intrinsics.areEqual(this.inquiryId, loggedOutAccountDetailDataState.inquiryId) && Intrinsics.areEqual(this.email, loggedOutAccountDetailDataState.email) && Intrinsics.areEqual(this.phoneNumber, loggedOutAccountDetailDataState.phoneNumber) && this.isRefreshingInquiry == loggedOutAccountDetailDataState.isRefreshingInquiry;
    }

    public int hashCode() {
        return (((((this.inquiryId.hashCode() * 31) + this.email.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + Boolean.hashCode(this.isRefreshingInquiry);
    }

    public String toString() {
        return "LoggedOutAccountDetailDataState(inquiryId=" + this.inquiryId + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", isRefreshingInquiry=" + this.isRefreshingInquiry + ")";
    }

    public LoggedOutAccountDetailDataState(UUID inquiryId, String email, PhoneNumber phoneNumber, boolean z) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.inquiryId = inquiryId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isRefreshingInquiry = z;
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public /* synthetic */ LoggedOutAccountDetailDataState(UUID uuid, String str, PhoneNumber phoneNumber, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? PhoneNumber.INSTANCE.getUS_EMPTY() : phoneNumber, (i & 8) != 0 ? false : z);
    }

    public final String getEmail() {
        return this.email;
    }

    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public final boolean isRefreshingInquiry() {
        return this.isRefreshingInquiry;
    }
}
