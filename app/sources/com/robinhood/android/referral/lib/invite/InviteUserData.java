package com.robinhood.android.referral.lib.invite;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InviteUserData.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/invite/InviteUserData;", "", "contact", "", "messageBody", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContact", "()Ljava/lang/String;", "getMessageBody", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InviteUserData {
    public static final int $stable = 0;
    private final String contact;
    private final String messageBody;

    public static /* synthetic */ InviteUserData copy$default(InviteUserData inviteUserData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inviteUserData.contact;
        }
        if ((i & 2) != 0) {
            str2 = inviteUserData.messageBody;
        }
        return inviteUserData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContact() {
        return this.contact;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessageBody() {
        return this.messageBody;
    }

    public final InviteUserData copy(String contact, String messageBody) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(messageBody, "messageBody");
        return new InviteUserData(contact, messageBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteUserData)) {
            return false;
        }
        InviteUserData inviteUserData = (InviteUserData) other;
        return Intrinsics.areEqual(this.contact, inviteUserData.contact) && Intrinsics.areEqual(this.messageBody, inviteUserData.messageBody);
    }

    public int hashCode() {
        return (this.contact.hashCode() * 31) + this.messageBody.hashCode();
    }

    public String toString() {
        return "InviteUserData(contact=" + this.contact + ", messageBody=" + this.messageBody + ")";
    }

    public InviteUserData(String contact, String messageBody) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(messageBody, "messageBody");
        this.contact = contact;
        this.messageBody = messageBody;
    }

    public final String getContact() {
        return this.contact;
    }

    public final String getMessageBody() {
        return this.messageBody;
    }
}
