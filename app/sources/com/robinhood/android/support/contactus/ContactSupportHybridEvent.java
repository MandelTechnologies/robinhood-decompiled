package com.robinhood.android.support.contactus;

import com.robinhood.android.lib.webview.WebError;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactSupportHybridEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent;", "", "ShowSupportHub", "Loading", "Loaded", "Failed", "Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent$Failed;", "Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent$Loaded;", "Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent$Loading;", "Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent$ShowSupportHub;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ContactSupportHybridEvent {

    /* compiled from: ContactSupportHybridEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent$ShowSupportHub;", "Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSupportHub implements ContactSupportHybridEvent {
        public static final int $stable = 0;
        public static final ShowSupportHub INSTANCE = new ShowSupportHub();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowSupportHub);
        }

        public int hashCode() {
            return -1833752667;
        }

        public String toString() {
            return "ShowSupportHub";
        }

        private ShowSupportHub() {
        }
    }

    /* compiled from: ContactSupportHybridEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent$Loading;", "Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements ContactSupportHybridEvent {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 66269530;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: ContactSupportHybridEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent$Loaded;", "Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent;", "inquiryId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInquiryId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements ContactSupportHybridEvent {
        public static final int $stable = 8;
        private final UUID inquiryId;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = loaded.inquiryId;
            }
            return loaded.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final Loaded copy(UUID inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            return new Loaded(inquiryId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.inquiryId, ((Loaded) other).inquiryId);
        }

        public int hashCode() {
            return this.inquiryId.hashCode();
        }

        public String toString() {
            return "Loaded(inquiryId=" + this.inquiryId + ")";
        }

        public Loaded(UUID inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            this.inquiryId = inquiryId;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }
    }

    /* compiled from: ContactSupportHybridEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent$Failed;", "Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent;", "reason", "Lcom/robinhood/android/lib/webview/WebError$InquiryCreationException;", "<init>", "(Lcom/robinhood/android/lib/webview/WebError$InquiryCreationException;)V", "getReason", "()Lcom/robinhood/android/lib/webview/WebError$InquiryCreationException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failed implements ContactSupportHybridEvent {
        public static final int $stable = 8;
        private final WebError.InquiryCreationException reason;

        public static /* synthetic */ Failed copy$default(Failed failed, WebError.InquiryCreationException inquiryCreationException, int i, Object obj) {
            if ((i & 1) != 0) {
                inquiryCreationException = failed.reason;
            }
            return failed.copy(inquiryCreationException);
        }

        /* renamed from: component1, reason: from getter */
        public final WebError.InquiryCreationException getReason() {
            return this.reason;
        }

        public final Failed copy(WebError.InquiryCreationException reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Failed(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.reason, ((Failed) other).reason);
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Failed(reason=" + this.reason + ")";
        }

        public Failed(WebError.InquiryCreationException reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public final WebError.InquiryCreationException getReason() {
            return this.reason;
        }
    }
}
