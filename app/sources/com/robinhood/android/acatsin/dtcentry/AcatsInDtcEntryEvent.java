package com.robinhood.android.acatsin.dtcentry;

import com.robinhood.models.acats.p299db.p300ui.UiAcatsValidationResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInDtcEntryEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryEvent;", "", "<init>", "()V", "ValidationResponseEvent", "NetworkErrorEvent", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryEvent$NetworkErrorEvent;", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryEvent$ValidationResponseEvent;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsInDtcEntryEvent {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInDtcEntryEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AcatsInDtcEntryEvent() {
    }

    /* compiled from: AcatsInDtcEntryEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryEvent$ValidationResponseEvent;", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryEvent;", "response", "Lcom/robinhood/models/acats/db/ui/UiAcatsValidationResponse;", "dtcNumber", "", "<init>", "(Lcom/robinhood/models/acats/db/ui/UiAcatsValidationResponse;Ljava/lang/String;)V", "getResponse", "()Lcom/robinhood/models/acats/db/ui/UiAcatsValidationResponse;", "getDtcNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationResponseEvent extends AcatsInDtcEntryEvent {
        public static final int $stable = 8;
        private final String dtcNumber;
        private final UiAcatsValidationResponse response;

        public static /* synthetic */ ValidationResponseEvent copy$default(ValidationResponseEvent validationResponseEvent, UiAcatsValidationResponse uiAcatsValidationResponse, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uiAcatsValidationResponse = validationResponseEvent.response;
            }
            if ((i & 2) != 0) {
                str = validationResponseEvent.dtcNumber;
            }
            return validationResponseEvent.copy(uiAcatsValidationResponse, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UiAcatsValidationResponse getResponse() {
            return this.response;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDtcNumber() {
            return this.dtcNumber;
        }

        public final ValidationResponseEvent copy(UiAcatsValidationResponse response, String dtcNumber) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new ValidationResponseEvent(response, dtcNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationResponseEvent)) {
                return false;
            }
            ValidationResponseEvent validationResponseEvent = (ValidationResponseEvent) other;
            return Intrinsics.areEqual(this.response, validationResponseEvent.response) && Intrinsics.areEqual(this.dtcNumber, validationResponseEvent.dtcNumber);
        }

        public int hashCode() {
            int iHashCode = this.response.hashCode() * 31;
            String str = this.dtcNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ValidationResponseEvent(response=" + this.response + ", dtcNumber=" + this.dtcNumber + ")";
        }

        public final UiAcatsValidationResponse getResponse() {
            return this.response;
        }

        public final String getDtcNumber() {
            return this.dtcNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationResponseEvent(UiAcatsValidationResponse response, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
            this.dtcNumber = str;
        }
    }

    /* compiled from: AcatsInDtcEntryEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryEvent$NetworkErrorEvent;", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NetworkErrorEvent extends AcatsInDtcEntryEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ NetworkErrorEvent copy$default(NetworkErrorEvent networkErrorEvent, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = networkErrorEvent.error;
            }
            return networkErrorEvent.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final NetworkErrorEvent copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new NetworkErrorEvent(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkErrorEvent) && Intrinsics.areEqual(this.error, ((NetworkErrorEvent) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "NetworkErrorEvent(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkErrorEvent(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
