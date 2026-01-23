package com.robinhood.android.verification.account;

import com.robinhood.models.p355ui.PhoneNumber;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggedOutAccountDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001a¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/verification/account/LoggedOutAccountDetailViewState;", "", "inquiryId", "Ljava/util/UUID;", "email", "", "phoneNumber", "Lcom/robinhood/models/ui/PhoneNumber;", "phoneNumberMaxLength", "", "showEmailWarning", "", "showPhoneWarning", "isSubmitting", "isSubmitButtonClickable", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/ui/PhoneNumber;IZZZZ)V", "getInquiryId", "()Ljava/util/UUID;", "getEmail", "()Ljava/lang/String;", "getPhoneNumber", "()Lcom/robinhood/models/ui/PhoneNumber;", "getPhoneNumberMaxLength", "()I", "getShowEmailWarning", "()Z", "getShowPhoneWarning", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class LoggedOutAccountDetailViewState {
    public static final int $stable = 8;
    private final String email;
    private final UUID inquiryId;
    private final boolean isSubmitButtonClickable;
    private final boolean isSubmitting;
    private final PhoneNumber phoneNumber;
    private final int phoneNumberMaxLength;
    private final boolean showEmailWarning;
    private final boolean showPhoneWarning;

    public static /* synthetic */ LoggedOutAccountDetailViewState copy$default(LoggedOutAccountDetailViewState loggedOutAccountDetailViewState, UUID uuid, String str, PhoneNumber phoneNumber, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = loggedOutAccountDetailViewState.inquiryId;
        }
        if ((i2 & 2) != 0) {
            str = loggedOutAccountDetailViewState.email;
        }
        if ((i2 & 4) != 0) {
            phoneNumber = loggedOutAccountDetailViewState.phoneNumber;
        }
        if ((i2 & 8) != 0) {
            i = loggedOutAccountDetailViewState.phoneNumberMaxLength;
        }
        if ((i2 & 16) != 0) {
            z = loggedOutAccountDetailViewState.showEmailWarning;
        }
        if ((i2 & 32) != 0) {
            z2 = loggedOutAccountDetailViewState.showPhoneWarning;
        }
        if ((i2 & 64) != 0) {
            z3 = loggedOutAccountDetailViewState.isSubmitting;
        }
        if ((i2 & 128) != 0) {
            z4 = loggedOutAccountDetailViewState.isSubmitButtonClickable;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z;
        boolean z8 = z2;
        return loggedOutAccountDetailViewState.copy(uuid, str, phoneNumber, i, z7, z8, z5, z6);
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
    public final int getPhoneNumberMaxLength() {
        return this.phoneNumberMaxLength;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowEmailWarning() {
        return this.showEmailWarning;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowPhoneWarning() {
        return this.showPhoneWarning;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSubmitting() {
        return this.isSubmitting;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsSubmitButtonClickable() {
        return this.isSubmitButtonClickable;
    }

    public final LoggedOutAccountDetailViewState copy(UUID inquiryId, String email, PhoneNumber phoneNumber, int phoneNumberMaxLength, boolean showEmailWarning, boolean showPhoneWarning, boolean isSubmitting, boolean isSubmitButtonClickable) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return new LoggedOutAccountDetailViewState(inquiryId, email, phoneNumber, phoneNumberMaxLength, showEmailWarning, showPhoneWarning, isSubmitting, isSubmitButtonClickable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoggedOutAccountDetailViewState)) {
            return false;
        }
        LoggedOutAccountDetailViewState loggedOutAccountDetailViewState = (LoggedOutAccountDetailViewState) other;
        return Intrinsics.areEqual(this.inquiryId, loggedOutAccountDetailViewState.inquiryId) && Intrinsics.areEqual(this.email, loggedOutAccountDetailViewState.email) && Intrinsics.areEqual(this.phoneNumber, loggedOutAccountDetailViewState.phoneNumber) && this.phoneNumberMaxLength == loggedOutAccountDetailViewState.phoneNumberMaxLength && this.showEmailWarning == loggedOutAccountDetailViewState.showEmailWarning && this.showPhoneWarning == loggedOutAccountDetailViewState.showPhoneWarning && this.isSubmitting == loggedOutAccountDetailViewState.isSubmitting && this.isSubmitButtonClickable == loggedOutAccountDetailViewState.isSubmitButtonClickable;
    }

    public int hashCode() {
        return (((((((((((((this.inquiryId.hashCode() * 31) + this.email.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + Integer.hashCode(this.phoneNumberMaxLength)) * 31) + Boolean.hashCode(this.showEmailWarning)) * 31) + Boolean.hashCode(this.showPhoneWarning)) * 31) + Boolean.hashCode(this.isSubmitting)) * 31) + Boolean.hashCode(this.isSubmitButtonClickable);
    }

    public String toString() {
        return "LoggedOutAccountDetailViewState(inquiryId=" + this.inquiryId + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", phoneNumberMaxLength=" + this.phoneNumberMaxLength + ", showEmailWarning=" + this.showEmailWarning + ", showPhoneWarning=" + this.showPhoneWarning + ", isSubmitting=" + this.isSubmitting + ", isSubmitButtonClickable=" + this.isSubmitButtonClickable + ")";
    }

    public LoggedOutAccountDetailViewState(UUID inquiryId, String email, PhoneNumber phoneNumber, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.inquiryId = inquiryId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.phoneNumberMaxLength = i;
        this.showEmailWarning = z;
        this.showPhoneWarning = z2;
        this.isSubmitting = z3;
        this.isSubmitButtonClickable = z4;
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public final int getPhoneNumberMaxLength() {
        return this.phoneNumberMaxLength;
    }

    public final boolean getShowEmailWarning() {
        return this.showEmailWarning;
    }

    public final boolean getShowPhoneWarning() {
        return this.showPhoneWarning;
    }

    public final boolean isSubmitting() {
        return this.isSubmitting;
    }

    public final boolean isSubmitButtonClickable() {
        return this.isSubmitButtonClickable;
    }
}
