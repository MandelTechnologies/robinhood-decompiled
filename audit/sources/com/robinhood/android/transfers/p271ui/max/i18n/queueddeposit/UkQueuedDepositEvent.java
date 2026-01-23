package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkQueuedDepositEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent;", "", "TrueLayerMandateAuthorized", "TrueLayerMandateNotAuthorized", "TrueLayerMandateFailed", "ProcessTrueLayerMandate", "NavigateAfterStandardDepositCreation", "Error", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$Error;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$NavigateAfterStandardDepositCreation;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$ProcessTrueLayerMandate;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$TrueLayerMandateAuthorized;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$TrueLayerMandateFailed;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$TrueLayerMandateNotAuthorized;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface UkQueuedDepositEvent {

    /* compiled from: UkQueuedDepositEvent.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$TrueLayerMandateAuthorized;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "postTransferPage", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;)V", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getPostTransferPage", "()Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TrueLayerMandateAuthorized implements UkQueuedDepositEvent {
        public static final int $stable = 8;
        private final Context eventContext;
        private final UiPostTransferPage.UkQueuedDeposit postTransferPage;

        public static /* synthetic */ TrueLayerMandateAuthorized copy$default(TrueLayerMandateAuthorized trueLayerMandateAuthorized, Context context, UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit, int i, Object obj) {
            if ((i & 1) != 0) {
                context = trueLayerMandateAuthorized.eventContext;
            }
            if ((i & 2) != 0) {
                ukQueuedDeposit = trueLayerMandateAuthorized.postTransferPage;
            }
            return trueLayerMandateAuthorized.copy(context, ukQueuedDeposit);
        }

        /* renamed from: component1, reason: from getter */
        public final Context getEventContext() {
            return this.eventContext;
        }

        /* renamed from: component2, reason: from getter */
        public final UiPostTransferPage.UkQueuedDeposit getPostTransferPage() {
            return this.postTransferPage;
        }

        public final TrueLayerMandateAuthorized copy(Context eventContext, UiPostTransferPage.UkQueuedDeposit postTransferPage) {
            Intrinsics.checkNotNullParameter(postTransferPage, "postTransferPage");
            return new TrueLayerMandateAuthorized(eventContext, postTransferPage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrueLayerMandateAuthorized)) {
                return false;
            }
            TrueLayerMandateAuthorized trueLayerMandateAuthorized = (TrueLayerMandateAuthorized) other;
            return Intrinsics.areEqual(this.eventContext, trueLayerMandateAuthorized.eventContext) && Intrinsics.areEqual(this.postTransferPage, trueLayerMandateAuthorized.postTransferPage);
        }

        public int hashCode() {
            Context context = this.eventContext;
            return ((context == null ? 0 : context.hashCode()) * 31) + this.postTransferPage.hashCode();
        }

        public String toString() {
            return "TrueLayerMandateAuthorized(eventContext=" + this.eventContext + ", postTransferPage=" + this.postTransferPage + ")";
        }

        public TrueLayerMandateAuthorized(Context context, UiPostTransferPage.UkQueuedDeposit postTransferPage) {
            Intrinsics.checkNotNullParameter(postTransferPage, "postTransferPage");
            this.eventContext = context;
            this.postTransferPage = postTransferPage;
        }

        public final Context getEventContext() {
            return this.eventContext;
        }

        public final UiPostTransferPage.UkQueuedDeposit getPostTransferPage() {
            return this.postTransferPage;
        }
    }

    /* compiled from: UkQueuedDepositEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$TrueLayerMandateNotAuthorized;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TrueLayerMandateNotAuthorized implements UkQueuedDepositEvent {
        public static final int $stable = 0;
        public static final TrueLayerMandateNotAuthorized INSTANCE = new TrueLayerMandateNotAuthorized();

        public boolean equals(Object other) {
            return this == other || (other instanceof TrueLayerMandateNotAuthorized);
        }

        public int hashCode() {
            return -1654345239;
        }

        public String toString() {
            return "TrueLayerMandateNotAuthorized";
        }

        private TrueLayerMandateNotAuthorized() {
        }
    }

    /* compiled from: UkQueuedDepositEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$TrueLayerMandateFailed;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TrueLayerMandateFailed implements UkQueuedDepositEvent {
        public static final int $stable = 0;
        public static final TrueLayerMandateFailed INSTANCE = new TrueLayerMandateFailed();

        public boolean equals(Object other) {
            return this == other || (other instanceof TrueLayerMandateFailed);
        }

        public int hashCode() {
            return -1358533758;
        }

        public String toString() {
            return "TrueLayerMandateFailed";
        }

        private TrueLayerMandateFailed() {
        }
    }

    /* compiled from: UkQueuedDepositEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$ProcessTrueLayerMandate;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent;", "mandateId", "", "resourceToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMandateId", "()Ljava/lang/String;", "getResourceToken", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ProcessTrueLayerMandate implements UkQueuedDepositEvent {
        public static final int $stable = 0;
        private final String mandateId;
        private final String resourceToken;

        public static /* synthetic */ ProcessTrueLayerMandate copy$default(ProcessTrueLayerMandate processTrueLayerMandate, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = processTrueLayerMandate.mandateId;
            }
            if ((i & 2) != 0) {
                str2 = processTrueLayerMandate.resourceToken;
            }
            return processTrueLayerMandate.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMandateId() {
            return this.mandateId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getResourceToken() {
            return this.resourceToken;
        }

        public final ProcessTrueLayerMandate copy(String mandateId, String resourceToken) {
            Intrinsics.checkNotNullParameter(mandateId, "mandateId");
            Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
            return new ProcessTrueLayerMandate(mandateId, resourceToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProcessTrueLayerMandate)) {
                return false;
            }
            ProcessTrueLayerMandate processTrueLayerMandate = (ProcessTrueLayerMandate) other;
            return Intrinsics.areEqual(this.mandateId, processTrueLayerMandate.mandateId) && Intrinsics.areEqual(this.resourceToken, processTrueLayerMandate.resourceToken);
        }

        public int hashCode() {
            return (this.mandateId.hashCode() * 31) + this.resourceToken.hashCode();
        }

        public String toString() {
            return "ProcessTrueLayerMandate(mandateId=" + this.mandateId + ", resourceToken=" + this.resourceToken + ")";
        }

        public ProcessTrueLayerMandate(String mandateId, String resourceToken) {
            Intrinsics.checkNotNullParameter(mandateId, "mandateId");
            Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
            this.mandateId = mandateId;
            this.resourceToken = resourceToken;
        }

        public final String getMandateId() {
            return this.mandateId;
        }

        public final String getResourceToken() {
            return this.resourceToken;
        }
    }

    /* compiled from: UkQueuedDepositEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$NavigateAfterStandardDepositCreation;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent;", "response", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;)V", "getResponse", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateAfterStandardDepositCreation implements UkQueuedDepositEvent {
        public static final int $stable = 8;
        private final ApiCreateTransferResponse response;

        public static /* synthetic */ NavigateAfterStandardDepositCreation copy$default(NavigateAfterStandardDepositCreation navigateAfterStandardDepositCreation, ApiCreateTransferResponse apiCreateTransferResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCreateTransferResponse = navigateAfterStandardDepositCreation.response;
            }
            return navigateAfterStandardDepositCreation.copy(apiCreateTransferResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCreateTransferResponse getResponse() {
            return this.response;
        }

        public final NavigateAfterStandardDepositCreation copy(ApiCreateTransferResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new NavigateAfterStandardDepositCreation(response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateAfterStandardDepositCreation) && Intrinsics.areEqual(this.response, ((NavigateAfterStandardDepositCreation) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "NavigateAfterStandardDepositCreation(response=" + this.response + ")";
        }

        public NavigateAfterStandardDepositCreation(ApiCreateTransferResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
        }

        public final ApiCreateTransferResponse getResponse() {
            return this.response;
        }
    }

    /* compiled from: UkQueuedDepositEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent$Error;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements UkQueuedDepositEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
