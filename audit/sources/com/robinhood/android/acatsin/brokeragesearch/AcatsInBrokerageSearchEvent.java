package com.robinhood.android.acatsin.brokeragesearch;

import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInBrokerageSearchEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent;", "", "<init>", "()V", "Error", "BrokerageSelected", "ManualEntryBrokerageEntrySelected", "AccountIneligibleEvent", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent$AccountIneligibleEvent;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent$BrokerageSelected;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent$Error;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent$ManualEntryBrokerageEntrySelected;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsInBrokerageSearchEvent {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInBrokerageSearchEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AcatsInBrokerageSearchEvent() {
    }

    /* compiled from: AcatsInBrokerageSearchEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent$Error;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends AcatsInBrokerageSearchEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: AcatsInBrokerageSearchEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent$BrokerageSelected;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent;", "brokerage", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiBrokerage;)V", "getBrokerage", "()Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BrokerageSelected extends AcatsInBrokerageSearchEvent {
        public static final int $stable = 8;
        private final ApiBrokerage brokerage;

        public static /* synthetic */ BrokerageSelected copy$default(BrokerageSelected brokerageSelected, ApiBrokerage apiBrokerage, int i, Object obj) {
            if ((i & 1) != 0) {
                apiBrokerage = brokerageSelected.brokerage;
            }
            return brokerageSelected.copy(apiBrokerage);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiBrokerage getBrokerage() {
            return this.brokerage;
        }

        public final BrokerageSelected copy(ApiBrokerage brokerage) {
            Intrinsics.checkNotNullParameter(brokerage, "brokerage");
            return new BrokerageSelected(brokerage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BrokerageSelected) && Intrinsics.areEqual(this.brokerage, ((BrokerageSelected) other).brokerage);
        }

        public int hashCode() {
            return this.brokerage.hashCode();
        }

        public String toString() {
            return "BrokerageSelected(brokerage=" + this.brokerage + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BrokerageSelected(ApiBrokerage brokerage) {
            super(null);
            Intrinsics.checkNotNullParameter(brokerage, "brokerage");
            this.brokerage = brokerage;
        }

        public final ApiBrokerage getBrokerage() {
            return this.brokerage;
        }
    }

    /* compiled from: AcatsInBrokerageSearchEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent$ManualEntryBrokerageEntrySelected;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ManualEntryBrokerageEntrySelected extends AcatsInBrokerageSearchEvent {
        public static final int $stable = 0;
        public static final ManualEntryBrokerageEntrySelected INSTANCE = new ManualEntryBrokerageEntrySelected();

        public boolean equals(Object other) {
            return this == other || (other instanceof ManualEntryBrokerageEntrySelected);
        }

        public int hashCode() {
            return -772034955;
        }

        public String toString() {
            return "ManualEntryBrokerageEntrySelected";
        }

        private ManualEntryBrokerageEntrySelected() {
            super(null);
        }
    }

    /* compiled from: AcatsInBrokerageSearchEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent$AccountIneligibleEvent;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent;", "alert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "<init>", "(Lcom/robinhood/models/serverdriven/db/GenericAlert;)V", "getAlert", "()Lcom/robinhood/models/serverdriven/db/GenericAlert;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountIneligibleEvent extends AcatsInBrokerageSearchEvent {
        public static final int $stable = 8;
        private final GenericAlert alert;

        public static /* synthetic */ AccountIneligibleEvent copy$default(AccountIneligibleEvent accountIneligibleEvent, GenericAlert genericAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlert = accountIneligibleEvent.alert;
            }
            return accountIneligibleEvent.copy(genericAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final GenericAlert getAlert() {
            return this.alert;
        }

        public final AccountIneligibleEvent copy(GenericAlert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new AccountIneligibleEvent(alert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountIneligibleEvent) && Intrinsics.areEqual(this.alert, ((AccountIneligibleEvent) other).alert);
        }

        public int hashCode() {
            return this.alert.hashCode();
        }

        public String toString() {
            return "AccountIneligibleEvent(alert=" + this.alert + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountIneligibleEvent(GenericAlert alert) {
            super(null);
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final GenericAlert getAlert() {
            return this.alert;
        }
    }
}
