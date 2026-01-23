package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import com.robinhood.models.api.ApiPreviouslySignedAgreements;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOneClickAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState$Error;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState$Loading;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState$Success;", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class SlipOneClickAgreementViewState {
    public static final int $stable = 0;

    public /* synthetic */ SlipOneClickAgreementViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SlipOneClickAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState$Loading;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends SlipOneClickAgreementViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -167002861;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private SlipOneClickAgreementViewState() {
    }

    /* compiled from: SlipOneClickAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState$Success;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState;", "slipAgreements", "", "Lcom/robinhood/models/api/ApiPreviouslySignedAgreements$AgreementRow;", "summaryTitle", "", "summaryItems", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getSlipAgreements", "()Ljava/util/List;", "getSummaryTitle", "()Ljava/lang/String;", "getSummaryItems", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends SlipOneClickAgreementViewState {
        public static final int $stable = 8;
        private final List<ApiPreviouslySignedAgreements.AgreementRow> slipAgreements;
        private final List<UIComponent<GenericAction>> summaryItems;
        private final String summaryTitle;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, String str, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = success.slipAgreements;
            }
            if ((i & 2) != 0) {
                str = success.summaryTitle;
            }
            if ((i & 4) != 0) {
                list2 = success.summaryItems;
            }
            return success.copy(list, str, list2);
        }

        public final List<ApiPreviouslySignedAgreements.AgreementRow> component1() {
            return this.slipAgreements;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSummaryTitle() {
            return this.summaryTitle;
        }

        public final List<UIComponent<GenericAction>> component3() {
            return this.summaryItems;
        }

        public final Success copy(List<ApiPreviouslySignedAgreements.AgreementRow> slipAgreements, String summaryTitle, List<? extends UIComponent<? extends GenericAction>> summaryItems) {
            Intrinsics.checkNotNullParameter(slipAgreements, "slipAgreements");
            Intrinsics.checkNotNullParameter(summaryTitle, "summaryTitle");
            Intrinsics.checkNotNullParameter(summaryItems, "summaryItems");
            return new Success(slipAgreements, summaryTitle, summaryItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.slipAgreements, success.slipAgreements) && Intrinsics.areEqual(this.summaryTitle, success.summaryTitle) && Intrinsics.areEqual(this.summaryItems, success.summaryItems);
        }

        public int hashCode() {
            return (((this.slipAgreements.hashCode() * 31) + this.summaryTitle.hashCode()) * 31) + this.summaryItems.hashCode();
        }

        public String toString() {
            return "Success(slipAgreements=" + this.slipAgreements + ", summaryTitle=" + this.summaryTitle + ", summaryItems=" + this.summaryItems + ")";
        }

        public /* synthetic */ Success(List list, String str, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, str, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
        }

        public final List<ApiPreviouslySignedAgreements.AgreementRow> getSlipAgreements() {
            return this.slipAgreements;
        }

        public final String getSummaryTitle() {
            return this.summaryTitle;
        }

        public final List<UIComponent<GenericAction>> getSummaryItems() {
            return this.summaryItems;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Success(List<ApiPreviouslySignedAgreements.AgreementRow> slipAgreements, String summaryTitle, List<? extends UIComponent<? extends GenericAction>> summaryItems) {
            super(null);
            Intrinsics.checkNotNullParameter(slipAgreements, "slipAgreements");
            Intrinsics.checkNotNullParameter(summaryTitle, "summaryTitle");
            Intrinsics.checkNotNullParameter(summaryItems, "summaryItems");
            this.slipAgreements = slipAgreements;
            this.summaryTitle = summaryTitle;
            this.summaryItems = summaryItems;
        }
    }

    /* compiled from: SlipOneClickAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState$Error;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState;", "exception", "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends SlipOneClickAgreementViewState {
        public static final int $stable = 8;
        private final Throwable exception;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.exception;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }

        public final Error copy(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new Error(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.exception, ((Error) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.exception + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public final Throwable getException() {
            return this.exception;
        }
    }
}
