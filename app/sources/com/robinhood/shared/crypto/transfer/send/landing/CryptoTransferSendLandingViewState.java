package com.robinhood.shared.crypto.transfer.send.landing;

import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.shared.crypto.transfer.unified.QrScannerState;
import com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendLandingViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState;", "", "<init>", "()V", "Loading", "SecuritySetupRequired", "PendingEnrollment", "FailedEnrollment", "Success", "Error", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$Error;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$FailedEnrollment;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$Loading;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$PendingEnrollment;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$SecuritySetupRequired;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$Success;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoTransferSendLandingViewState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoTransferSendLandingViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoTransferSendLandingViewState() {
    }

    /* compiled from: CryptoTransferSendLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$Loading;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoTransferSendLandingViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -991014454;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: CryptoTransferSendLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$SecuritySetupRequired;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState;", "enrollmentState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "<init>", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;)V", "getEnrollmentState", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SecuritySetupRequired extends CryptoTransferSendLandingViewState {
        public static final int $stable = 0;
        private final ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState;

        public static /* synthetic */ SecuritySetupRequired copy$default(SecuritySetupRequired securitySetupRequired, ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, int i, Object obj) {
            if ((i & 1) != 0) {
                enrollmentState = securitySetupRequired.enrollmentState;
            }
            return securitySetupRequired.copy(enrollmentState);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCryptoTransferConfig.TransferStates.EnrollmentState getEnrollmentState() {
            return this.enrollmentState;
        }

        public final SecuritySetupRequired copy(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState) {
            Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
            return new SecuritySetupRequired(enrollmentState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SecuritySetupRequired) && this.enrollmentState == ((SecuritySetupRequired) other).enrollmentState;
        }

        public int hashCode() {
            return this.enrollmentState.hashCode();
        }

        public String toString() {
            return "SecuritySetupRequired(enrollmentState=" + this.enrollmentState + ")";
        }

        public final ApiCryptoTransferConfig.TransferStates.EnrollmentState getEnrollmentState() {
            return this.enrollmentState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecuritySetupRequired(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState) {
            super(null);
            Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
            this.enrollmentState = enrollmentState;
        }
    }

    /* compiled from: CryptoTransferSendLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$PendingEnrollment;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingEnrollment extends CryptoTransferSendLandingViewState {
        public static final int $stable = 0;
        public static final PendingEnrollment INSTANCE = new PendingEnrollment();

        public boolean equals(Object other) {
            return this == other || (other instanceof PendingEnrollment);
        }

        public int hashCode() {
            return 1296600841;
        }

        public String toString() {
            return "PendingEnrollment";
        }

        private PendingEnrollment() {
            super(null);
        }
    }

    /* compiled from: CryptoTransferSendLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$FailedEnrollment;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FailedEnrollment extends CryptoTransferSendLandingViewState {
        public static final int $stable = 0;
        public static final FailedEnrollment INSTANCE = new FailedEnrollment();

        public boolean equals(Object other) {
            return this == other || (other instanceof FailedEnrollment);
        }

        public int hashCode() {
            return 2040969811;
        }

        public String toString() {
            return "FailedEnrollment";
        }

        private FailedEnrollment() {
            super(null);
        }
    }

    /* compiled from: CryptoTransferSendLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J_\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u000eHÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$Success;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState;", "currencyId", "Ljava/util/UUID;", "title", "Lcom/robinhood/utils/resource/StringResource;", "qrScannerState", "Lcom/robinhood/shared/crypto/transfer/unified/QrScannerState;", "tipsSheetContent", "Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent$Send;", "initialWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "submitWarningSheet", "maxAddressLength", "", "addressTag", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/transfer/unified/QrScannerState;Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent$Send;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;ILcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;)V", "getCurrencyId", "()Ljava/util/UUID;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getQrScannerState", "()Lcom/robinhood/shared/crypto/transfer/unified/QrScannerState;", "getTipsSheetContent", "()Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent$Send;", "getInitialWarningSheet", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "getSubmitWarningSheet", "getMaxAddressLength", "()I", "getAddressTag", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends CryptoTransferSendLandingViewState {
        public static final int $stable = 8;
        private final CryptoTransferConfig.TransferAddressTag addressTag;
        private final UUID currencyId;
        private final CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet;
        private final int maxAddressLength;
        private final QrScannerState qrScannerState;
        private final CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet;
        private final TipsSheetContent2.Send tipsSheetContent;
        private final StringResource title;

        public static /* synthetic */ Success copy$default(Success success, UUID uuid, StringResource stringResource, QrScannerState qrScannerState, TipsSheetContent2.Send send, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, CryptoTransferConfig.TransferWarnings.Stage.Warning warning2, int i, CryptoTransferConfig.TransferAddressTag transferAddressTag, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = success.currencyId;
            }
            if ((i2 & 2) != 0) {
                stringResource = success.title;
            }
            if ((i2 & 4) != 0) {
                qrScannerState = success.qrScannerState;
            }
            if ((i2 & 8) != 0) {
                send = success.tipsSheetContent;
            }
            if ((i2 & 16) != 0) {
                warning = success.initialWarningSheet;
            }
            if ((i2 & 32) != 0) {
                warning2 = success.submitWarningSheet;
            }
            if ((i2 & 64) != 0) {
                i = success.maxAddressLength;
            }
            if ((i2 & 128) != 0) {
                transferAddressTag = success.addressTag;
            }
            int i3 = i;
            CryptoTransferConfig.TransferAddressTag transferAddressTag2 = transferAddressTag;
            CryptoTransferConfig.TransferWarnings.Stage.Warning warning3 = warning;
            CryptoTransferConfig.TransferWarnings.Stage.Warning warning4 = warning2;
            return success.copy(uuid, stringResource, qrScannerState, send, warning3, warning4, i3, transferAddressTag2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyId() {
            return this.currencyId;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final QrScannerState getQrScannerState() {
            return this.qrScannerState;
        }

        /* renamed from: component4, reason: from getter */
        public final TipsSheetContent2.Send getTipsSheetContent() {
            return this.tipsSheetContent;
        }

        /* renamed from: component5, reason: from getter */
        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getInitialWarningSheet() {
            return this.initialWarningSheet;
        }

        /* renamed from: component6, reason: from getter */
        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getSubmitWarningSheet() {
            return this.submitWarningSheet;
        }

        /* renamed from: component7, reason: from getter */
        public final int getMaxAddressLength() {
            return this.maxAddressLength;
        }

        /* renamed from: component8, reason: from getter */
        public final CryptoTransferConfig.TransferAddressTag getAddressTag() {
            return this.addressTag;
        }

        public final Success copy(UUID currencyId, StringResource title, QrScannerState qrScannerState, TipsSheetContent2.Send tipsSheetContent, CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet, CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet, int maxAddressLength, CryptoTransferConfig.TransferAddressTag addressTag) {
            Intrinsics.checkNotNullParameter(currencyId, "currencyId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(qrScannerState, "qrScannerState");
            Intrinsics.checkNotNullParameter(tipsSheetContent, "tipsSheetContent");
            return new Success(currencyId, title, qrScannerState, tipsSheetContent, initialWarningSheet, submitWarningSheet, maxAddressLength, addressTag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.currencyId, success.currencyId) && Intrinsics.areEqual(this.title, success.title) && Intrinsics.areEqual(this.qrScannerState, success.qrScannerState) && Intrinsics.areEqual(this.tipsSheetContent, success.tipsSheetContent) && Intrinsics.areEqual(this.initialWarningSheet, success.initialWarningSheet) && Intrinsics.areEqual(this.submitWarningSheet, success.submitWarningSheet) && this.maxAddressLength == success.maxAddressLength && Intrinsics.areEqual(this.addressTag, success.addressTag);
        }

        public int hashCode() {
            int iHashCode = ((((((this.currencyId.hashCode() * 31) + this.title.hashCode()) * 31) + this.qrScannerState.hashCode()) * 31) + this.tipsSheetContent.hashCode()) * 31;
            CryptoTransferConfig.TransferWarnings.Stage.Warning warning = this.initialWarningSheet;
            int iHashCode2 = (iHashCode + (warning == null ? 0 : warning.hashCode())) * 31;
            CryptoTransferConfig.TransferWarnings.Stage.Warning warning2 = this.submitWarningSheet;
            int iHashCode3 = (((iHashCode2 + (warning2 == null ? 0 : warning2.hashCode())) * 31) + Integer.hashCode(this.maxAddressLength)) * 31;
            CryptoTransferConfig.TransferAddressTag transferAddressTag = this.addressTag;
            return iHashCode3 + (transferAddressTag != null ? transferAddressTag.hashCode() : 0);
        }

        public String toString() {
            return "Success(currencyId=" + this.currencyId + ", title=" + this.title + ", qrScannerState=" + this.qrScannerState + ", tipsSheetContent=" + this.tipsSheetContent + ", initialWarningSheet=" + this.initialWarningSheet + ", submitWarningSheet=" + this.submitWarningSheet + ", maxAddressLength=" + this.maxAddressLength + ", addressTag=" + this.addressTag + ")";
        }

        public final UUID getCurrencyId() {
            return this.currencyId;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final QrScannerState getQrScannerState() {
            return this.qrScannerState;
        }

        public final TipsSheetContent2.Send getTipsSheetContent() {
            return this.tipsSheetContent;
        }

        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getInitialWarningSheet() {
            return this.initialWarningSheet;
        }

        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getSubmitWarningSheet() {
            return this.submitWarningSheet;
        }

        public final int getMaxAddressLength() {
            return this.maxAddressLength;
        }

        public final CryptoTransferConfig.TransferAddressTag getAddressTag() {
            return this.addressTag;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UUID currencyId, StringResource title, QrScannerState qrScannerState, TipsSheetContent2.Send tipsSheetContent, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, CryptoTransferConfig.TransferWarnings.Stage.Warning warning2, int i, CryptoTransferConfig.TransferAddressTag transferAddressTag) {
            super(null);
            Intrinsics.checkNotNullParameter(currencyId, "currencyId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(qrScannerState, "qrScannerState");
            Intrinsics.checkNotNullParameter(tipsSheetContent, "tipsSheetContent");
            this.currencyId = currencyId;
            this.title = title;
            this.qrScannerState = qrScannerState;
            this.tipsSheetContent = tipsSheetContent;
            this.initialWarningSheet = warning;
            this.submitWarningSheet = warning2;
            this.maxAddressLength = i;
            this.addressTag = transferAddressTag;
        }
    }

    /* compiled from: CryptoTransferSendLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$Error;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends CryptoTransferSendLandingViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -2067722730;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
            super(null);
        }
    }
}
