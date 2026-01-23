package com.robinhood.android.transfers.p271ui.max.wires;

import android.net.Uri;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: WireRoutingDetailsInputEvent.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "", "ValidationSuccess", "ValidationFailure", "TellerError", "NavigateToScamPrevention", "ReportScam", "NavigateToTransferScreen", "ReturnSelectedAccountResult", "LaunchFormDuxo", "LogEvent", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LaunchFormDuxo;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$NavigateToScamPrevention;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$NavigateToTransferScreen;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$ReportScam;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$ReturnSelectedAccountResult;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$TellerError;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$ValidationFailure;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$ValidationSuccess;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface WireRoutingDetailsInputEvent {

    /* compiled from: WireRoutingDetailsInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$ValidationSuccess;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "routingNumber", "", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRoutingNumber", "()Ljava/lang/String;", "getAccountNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationSuccess implements WireRoutingDetailsInputEvent {
        public static final int $stable = 0;
        private final String accountNumber;
        private final String routingNumber;

        public static /* synthetic */ ValidationSuccess copy$default(ValidationSuccess validationSuccess, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validationSuccess.routingNumber;
            }
            if ((i & 2) != 0) {
                str2 = validationSuccess.accountNumber;
            }
            return validationSuccess.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ValidationSuccess copy(String routingNumber, String accountNumber) {
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new ValidationSuccess(routingNumber, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationSuccess)) {
                return false;
            }
            ValidationSuccess validationSuccess = (ValidationSuccess) other;
            return Intrinsics.areEqual(this.routingNumber, validationSuccess.routingNumber) && Intrinsics.areEqual(this.accountNumber, validationSuccess.accountNumber);
        }

        public int hashCode() {
            return (this.routingNumber.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "ValidationSuccess(routingNumber=" + this.routingNumber + ", accountNumber=" + this.accountNumber + ")";
        }

        public ValidationSuccess(String routingNumber, String accountNumber) {
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.routingNumber = routingNumber;
            this.accountNumber = accountNumber;
        }

        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: WireRoutingDetailsInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$ValidationFailure;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "alert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "<init>", "(Lcom/robinhood/models/serverdriven/db/GenericAlert;)V", "getAlert", "()Lcom/robinhood/models/serverdriven/db/GenericAlert;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationFailure implements WireRoutingDetailsInputEvent {
        public static final int $stable = 8;
        private final GenericAlert alert;

        public static /* synthetic */ ValidationFailure copy$default(ValidationFailure validationFailure, GenericAlert genericAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlert = validationFailure.alert;
            }
            return validationFailure.copy(genericAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final GenericAlert getAlert() {
            return this.alert;
        }

        public final ValidationFailure copy(GenericAlert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new ValidationFailure(alert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidationFailure) && Intrinsics.areEqual(this.alert, ((ValidationFailure) other).alert);
        }

        public int hashCode() {
            return this.alert.hashCode();
        }

        public String toString() {
            return "ValidationFailure(alert=" + this.alert + ")";
        }

        public ValidationFailure(GenericAlert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final GenericAlert getAlert() {
            return this.alert;
        }
    }

    /* compiled from: WireRoutingDetailsInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$TellerError;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TellerError implements WireRoutingDetailsInputEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ TellerError copy$default(TellerError tellerError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = tellerError.throwable;
            }
            return tellerError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final TellerError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new TellerError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TellerError) && Intrinsics.areEqual(this.throwable, ((TellerError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "TellerError(throwable=" + this.throwable + ")";
        }

        public TellerError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: WireRoutingDetailsInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$NavigateToScamPrevention;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "scamPreventionPageSource", "Lmicrogram/android/RemoteMicrogramApplication;", "<init>", "(Lmicrogram/android/RemoteMicrogramApplication;)V", "getScamPreventionPageSource", "()Lmicrogram/android/RemoteMicrogramApplication;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToScamPrevention implements WireRoutingDetailsInputEvent {
        public static final int $stable = 8;
        private final RemoteMicrogramApplication scamPreventionPageSource;

        public static /* synthetic */ NavigateToScamPrevention copy$default(NavigateToScamPrevention navigateToScamPrevention, RemoteMicrogramApplication remoteMicrogramApplication, int i, Object obj) {
            if ((i & 1) != 0) {
                remoteMicrogramApplication = navigateToScamPrevention.scamPreventionPageSource;
            }
            return navigateToScamPrevention.copy(remoteMicrogramApplication);
        }

        /* renamed from: component1, reason: from getter */
        public final RemoteMicrogramApplication getScamPreventionPageSource() {
            return this.scamPreventionPageSource;
        }

        public final NavigateToScamPrevention copy(RemoteMicrogramApplication scamPreventionPageSource) {
            Intrinsics.checkNotNullParameter(scamPreventionPageSource, "scamPreventionPageSource");
            return new NavigateToScamPrevention(scamPreventionPageSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToScamPrevention) && Intrinsics.areEqual(this.scamPreventionPageSource, ((NavigateToScamPrevention) other).scamPreventionPageSource);
        }

        public int hashCode() {
            return this.scamPreventionPageSource.hashCode();
        }

        public String toString() {
            return "NavigateToScamPrevention(scamPreventionPageSource=" + this.scamPreventionPageSource + ")";
        }

        public NavigateToScamPrevention(RemoteMicrogramApplication scamPreventionPageSource) {
            Intrinsics.checkNotNullParameter(scamPreventionPageSource, "scamPreventionPageSource");
            this.scamPreventionPageSource = scamPreventionPageSource;
        }

        public final RemoteMicrogramApplication getScamPreventionPageSource() {
            return this.scamPreventionPageSource;
        }
    }

    /* compiled from: WireRoutingDetailsInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$ReportScam;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReportScam implements WireRoutingDetailsInputEvent {
        public static final int $stable = 8;
        private final Uri uri;

        public static /* synthetic */ ReportScam copy$default(ReportScam reportScam, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = reportScam.uri;
            }
            return reportScam.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final ReportScam copy(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new ReportScam(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReportScam) && Intrinsics.areEqual(this.uri, ((ReportScam) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "ReportScam(uri=" + this.uri + ")";
        }

        public ReportScam(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }

    /* compiled from: WireRoutingDetailsInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$NavigateToTransferScreen;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "from", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "to", "id", "", "routingNumber", "accountNumber", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFrom", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getTo", "getId", "()Ljava/lang/String;", "getRoutingNumber", "getAccountNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToTransferScreen implements WireRoutingDetailsInputEvent {
        public static final int $stable = 0;
        private final String accountNumber;
        private final ApiTransferAccount.TransferAccountType from;
        private final String id;
        private final String routingNumber;
        private final ApiTransferAccount.TransferAccountType to;

        public static /* synthetic */ NavigateToTransferScreen copy$default(NavigateToTransferScreen navigateToTransferScreen, ApiTransferAccount.TransferAccountType transferAccountType, ApiTransferAccount.TransferAccountType transferAccountType2, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccountType = navigateToTransferScreen.from;
            }
            if ((i & 2) != 0) {
                transferAccountType2 = navigateToTransferScreen.to;
            }
            if ((i & 4) != 0) {
                str = navigateToTransferScreen.id;
            }
            if ((i & 8) != 0) {
                str2 = navigateToTransferScreen.routingNumber;
            }
            if ((i & 16) != 0) {
                str3 = navigateToTransferScreen.accountNumber;
            }
            String str4 = str3;
            String str5 = str;
            return navigateToTransferScreen.copy(transferAccountType, transferAccountType2, str5, str2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiTransferAccount.TransferAccountType getFrom() {
            return this.from;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiTransferAccount.TransferAccountType getTo() {
            return this.to;
        }

        /* renamed from: component3, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final NavigateToTransferScreen copy(ApiTransferAccount.TransferAccountType from, ApiTransferAccount.TransferAccountType to, String id, String routingNumber, String accountNumber) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            Intrinsics.checkNotNullParameter(id, "id");
            return new NavigateToTransferScreen(from, to, id, routingNumber, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToTransferScreen)) {
                return false;
            }
            NavigateToTransferScreen navigateToTransferScreen = (NavigateToTransferScreen) other;
            return this.from == navigateToTransferScreen.from && this.to == navigateToTransferScreen.to && Intrinsics.areEqual(this.id, navigateToTransferScreen.id) && Intrinsics.areEqual(this.routingNumber, navigateToTransferScreen.routingNumber) && Intrinsics.areEqual(this.accountNumber, navigateToTransferScreen.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((((this.from.hashCode() * 31) + this.to.hashCode()) * 31) + this.id.hashCode()) * 31;
            String str = this.routingNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.accountNumber;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "NavigateToTransferScreen(from=" + this.from + ", to=" + this.to + ", id=" + this.id + ", routingNumber=" + this.routingNumber + ", accountNumber=" + this.accountNumber + ")";
        }

        public NavigateToTransferScreen(ApiTransferAccount.TransferAccountType from, ApiTransferAccount.TransferAccountType to, String id, String str, String str2) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            Intrinsics.checkNotNullParameter(id, "id");
            this.from = from;
            this.to = to;
            this.id = id;
            this.routingNumber = str;
            this.accountNumber = str2;
        }

        public final ApiTransferAccount.TransferAccountType getFrom() {
            return this.from;
        }

        public final ApiTransferAccount.TransferAccountType getTo() {
            return this.to;
        }

        public final String getId() {
            return this.id;
        }

        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: WireRoutingDetailsInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$ReturnSelectedAccountResult;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReturnSelectedAccountResult implements WireRoutingDetailsInputEvent {
        public static final int $stable = 0;
        private final String id;

        public static /* synthetic */ ReturnSelectedAccountResult copy$default(ReturnSelectedAccountResult returnSelectedAccountResult, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = returnSelectedAccountResult.id;
            }
            return returnSelectedAccountResult.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final ReturnSelectedAccountResult copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new ReturnSelectedAccountResult(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReturnSelectedAccountResult) && Intrinsics.areEqual(this.id, ((ReturnSelectedAccountResult) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "ReturnSelectedAccountResult(id=" + this.id + ")";
        }

        public ReturnSelectedAccountResult(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: WireRoutingDetailsInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LaunchFormDuxo;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LaunchFormDuxo implements WireRoutingDetailsInputEvent {
        public static final int $stable = 0;
        public static final LaunchFormDuxo INSTANCE = new LaunchFormDuxo();

        private LaunchFormDuxo() {
        }
    }

    /* compiled from: WireRoutingDetailsInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "ScreenAppearScamPrevention", "ScreenAppearV2", "ContinueTap", "ScreenAppearConfirm", "ConfirmContinue", "ConfirmCheckbox", "AcknowledgeScamPrevention", "ReportAScam", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$AcknowledgeScamPrevention;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ConfirmCheckbox;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ConfirmContinue;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ContinueTap;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ReportAScam;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ScreenAppearConfirm;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ScreenAppearScamPrevention;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ScreenAppearV2;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface LogEvent extends WireRoutingDetailsInputEvent {

        /* compiled from: WireRoutingDetailsInputEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ScreenAppearScamPrevention;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ScreenAppearScamPrevention implements LogEvent {
            public static final int $stable = 0;
            public static final ScreenAppearScamPrevention INSTANCE = new ScreenAppearScamPrevention();

            public boolean equals(Object other) {
                return this == other || (other instanceof ScreenAppearScamPrevention);
            }

            public int hashCode() {
                return -2116599566;
            }

            public String toString() {
                return "ScreenAppearScamPrevention";
            }

            private ScreenAppearScamPrevention() {
            }
        }

        /* compiled from: WireRoutingDetailsInputEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ScreenAppearV2;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ScreenAppearV2 implements LogEvent {
            public static final int $stable = 0;
            public static final ScreenAppearV2 INSTANCE = new ScreenAppearV2();

            public boolean equals(Object other) {
                return this == other || (other instanceof ScreenAppearV2);
            }

            public int hashCode() {
                return 1984777634;
            }

            public String toString() {
                return "ScreenAppearV2";
            }

            private ScreenAppearV2() {
            }
        }

        /* compiled from: WireRoutingDetailsInputEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ContinueTap;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ContinueTap implements LogEvent {
            public static final int $stable = 0;
            public static final ContinueTap INSTANCE = new ContinueTap();

            public boolean equals(Object other) {
                return this == other || (other instanceof ContinueTap);
            }

            public int hashCode() {
                return -104582793;
            }

            public String toString() {
                return "ContinueTap";
            }

            private ContinueTap() {
            }
        }

        /* compiled from: WireRoutingDetailsInputEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ScreenAppearConfirm;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ScreenAppearConfirm implements LogEvent {
            public static final int $stable = 0;
            public static final ScreenAppearConfirm INSTANCE = new ScreenAppearConfirm();

            public boolean equals(Object other) {
                return this == other || (other instanceof ScreenAppearConfirm);
            }

            public int hashCode() {
                return 1823158106;
            }

            public String toString() {
                return "ScreenAppearConfirm";
            }

            private ScreenAppearConfirm() {
            }
        }

        /* compiled from: WireRoutingDetailsInputEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ConfirmContinue;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ConfirmContinue implements LogEvent {
            public static final int $stable = 0;
            public static final ConfirmContinue INSTANCE = new ConfirmContinue();

            public boolean equals(Object other) {
                return this == other || (other instanceof ConfirmContinue);
            }

            public int hashCode() {
                return -753603070;
            }

            public String toString() {
                return "ConfirmContinue";
            }

            private ConfirmContinue() {
            }
        }

        /* compiled from: WireRoutingDetailsInputEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ConfirmCheckbox;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ConfirmCheckbox implements LogEvent {
            public static final int $stable = 0;
            public static final ConfirmCheckbox INSTANCE = new ConfirmCheckbox();

            public boolean equals(Object other) {
                return this == other || (other instanceof ConfirmCheckbox);
            }

            public int hashCode() {
                return 1350491422;
            }

            public String toString() {
                return "ConfirmCheckbox";
            }

            private ConfirmCheckbox() {
            }
        }

        /* compiled from: WireRoutingDetailsInputEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$AcknowledgeScamPrevention;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AcknowledgeScamPrevention implements LogEvent {
            public static final int $stable = 0;
            public static final AcknowledgeScamPrevention INSTANCE = new AcknowledgeScamPrevention();

            public boolean equals(Object other) {
                return this == other || (other instanceof AcknowledgeScamPrevention);
            }

            public int hashCode() {
                return 1528238403;
            }

            public String toString() {
                return "AcknowledgeScamPrevention";
            }

            private AcknowledgeScamPrevention() {
            }
        }

        /* compiled from: WireRoutingDetailsInputEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent$ReportAScam;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent$LogEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReportAScam implements LogEvent {
            public static final int $stable = 0;
            public static final ReportAScam INSTANCE = new ReportAScam();

            public boolean equals(Object other) {
                return this == other || (other instanceof ReportAScam);
            }

            public int hashCode() {
                return 752855460;
            }

            public String toString() {
                return "ReportAScam";
            }

            private ReportAScam() {
            }
        }
    }
}
