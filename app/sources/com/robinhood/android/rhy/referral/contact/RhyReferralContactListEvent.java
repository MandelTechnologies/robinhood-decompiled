package com.robinhood.android.rhy.referral.contact;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralContactListEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent;", "", "InviteContact", "ShareLink", "ShowInviteMoreDialog", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent$InviteContact;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent$ShareLink;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent$ShowInviteMoreDialog;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RhyReferralContactListEvent {

    /* compiled from: RhyReferralContactListEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent$InviteContact;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent;", "contact", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactRow;", "text", "", "<init>", "(Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactRow;Ljava/lang/String;)V", "getContact", "()Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactRow;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InviteContact implements RhyReferralContactListEvent {
        public static final int $stable = 8;
        private final RhyReferralContactRow contact;
        private final String text;

        public static /* synthetic */ InviteContact copy$default(InviteContact inviteContact, RhyReferralContactRow rhyReferralContactRow, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                rhyReferralContactRow = inviteContact.contact;
            }
            if ((i & 2) != 0) {
                str = inviteContact.text;
            }
            return inviteContact.copy(rhyReferralContactRow, str);
        }

        /* renamed from: component1, reason: from getter */
        public final RhyReferralContactRow getContact() {
            return this.contact;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final InviteContact copy(RhyReferralContactRow contact, String text) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            Intrinsics.checkNotNullParameter(text, "text");
            return new InviteContact(contact, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InviteContact)) {
                return false;
            }
            InviteContact inviteContact = (InviteContact) other;
            return Intrinsics.areEqual(this.contact, inviteContact.contact) && Intrinsics.areEqual(this.text, inviteContact.text);
        }

        public int hashCode() {
            return (this.contact.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            return "InviteContact(contact=" + this.contact + ", text=" + this.text + ")";
        }

        public InviteContact(RhyReferralContactRow contact, String text) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            Intrinsics.checkNotNullParameter(text, "text");
            this.contact = contact;
            this.text = text;
        }

        public final RhyReferralContactRow getContact() {
            return this.contact;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: RhyReferralContactListEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent$ShareLink;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShareLink implements RhyReferralContactListEvent {
        public static final int $stable = 0;
        private final String text;

        public static /* synthetic */ ShareLink copy$default(ShareLink shareLink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareLink.text;
            }
            return shareLink.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final ShareLink copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ShareLink(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShareLink) && Intrinsics.areEqual(this.text, ((ShareLink) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "ShareLink(text=" + this.text + ")";
        }

        public ShareLink(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: RhyReferralContactListEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent$ShowInviteMoreDialog;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowInviteMoreDialog implements RhyReferralContactListEvent {
        public static final int $stable = 0;
        private final String text;

        public static /* synthetic */ ShowInviteMoreDialog copy$default(ShowInviteMoreDialog showInviteMoreDialog, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showInviteMoreDialog.text;
            }
            return showInviteMoreDialog.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final ShowInviteMoreDialog copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ShowInviteMoreDialog(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowInviteMoreDialog) && Intrinsics.areEqual(this.text, ((ShowInviteMoreDialog) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "ShowInviteMoreDialog(text=" + this.text + ")";
        }

        public ShowInviteMoreDialog(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }
}
