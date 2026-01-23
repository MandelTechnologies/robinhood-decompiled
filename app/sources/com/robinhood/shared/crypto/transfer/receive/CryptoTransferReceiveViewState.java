package com.robinhood.shared.crypto.transfer.receive;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.ApiCryptoTransferDepositDetails;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoTransferReceiveViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState;", "", "<init>", "()V", "Loading", "SecuritySetupRequired", "PendingEnrollment", "FailedEnrollment", "Success", "Error", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Error;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$FailedEnrollment;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Loading;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$PendingEnrollment;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$SecuritySetupRequired;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoTransferReceiveViewState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoTransferReceiveViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoTransferReceiveViewState() {
    }

    /* compiled from: CryptoTransferReceiveViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Loading;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoTransferReceiveViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1905089336;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: CryptoTransferReceiveViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$SecuritySetupRequired;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState;", "enrollmentState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "<init>", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;)V", "getEnrollmentState", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SecuritySetupRequired extends CryptoTransferReceiveViewState {
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

    /* compiled from: CryptoTransferReceiveViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$PendingEnrollment;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingEnrollment extends CryptoTransferReceiveViewState {
        public static final int $stable = 0;
        public static final PendingEnrollment INSTANCE = new PendingEnrollment();

        public boolean equals(Object other) {
            return this == other || (other instanceof PendingEnrollment);
        }

        public int hashCode() {
            return 62203639;
        }

        public String toString() {
            return "PendingEnrollment";
        }

        private PendingEnrollment() {
            super(null);
        }
    }

    /* compiled from: CryptoTransferReceiveViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$FailedEnrollment;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FailedEnrollment extends CryptoTransferReceiveViewState {
        public static final int $stable = 0;
        public static final FailedEnrollment INSTANCE = new FailedEnrollment();

        public boolean equals(Object other) {
            return this == other || (other instanceof FailedEnrollment);
        }

        public int hashCode() {
            return 477129893;
        }

        public String toString() {
            return "FailedEnrollment";
        }

        private FailedEnrollment() {
            super(null);
        }
    }

    /* compiled from: CryptoTransferReceiveViewState.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00019Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00100\u001a\u00020\u0013HÆ\u0003Jy\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006:"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState;", "currencyCode", "", "currencyId", "Ljava/util/UUID;", "title", "Lcom/robinhood/utils/resource/StringResource;", PlaceTypes.ADDRESS, "addressTag", "disclaimer", "networkChip", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success$NetworkChip;", "allAddresses", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails$ApiCryptoTransferDepositDetail;", "initialWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "tipsSheetContent", "Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success$NetworkChip;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent;)V", "getCurrencyCode", "()Ljava/lang/String;", "getCurrencyId", "()Ljava/util/UUID;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getAddress", "getAddressTag", "getDisclaimer", "getNetworkChip", "()Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success$NetworkChip;", "getAllAddresses", "()Lkotlinx/collections/immutable/ImmutableList;", "getInitialWarningSheet", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "getTipsSheetContent", "()Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "NetworkChip", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends CryptoTransferReceiveViewState {
        public static final int $stable = 8;
        private final String address;
        private final String addressTag;
        private final ImmutableList<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> allAddresses;
        private final String currencyCode;
        private final UUID currencyId;
        private final StringResource disclaimer;
        private final CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet;
        private final NetworkChip networkChip;
        private final TipsSheetContent2 tipsSheetContent;
        private final StringResource title;

        public static /* synthetic */ Success copy$default(Success success, String str, UUID uuid, StringResource stringResource, String str2, String str3, StringResource stringResource2, NetworkChip networkChip, ImmutableList immutableList, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, TipsSheetContent2 tipsSheetContent2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.currencyCode;
            }
            if ((i & 2) != 0) {
                uuid = success.currencyId;
            }
            if ((i & 4) != 0) {
                stringResource = success.title;
            }
            if ((i & 8) != 0) {
                str2 = success.address;
            }
            if ((i & 16) != 0) {
                str3 = success.addressTag;
            }
            if ((i & 32) != 0) {
                stringResource2 = success.disclaimer;
            }
            if ((i & 64) != 0) {
                networkChip = success.networkChip;
            }
            if ((i & 128) != 0) {
                immutableList = success.allAddresses;
            }
            if ((i & 256) != 0) {
                warning = success.initialWarningSheet;
            }
            if ((i & 512) != 0) {
                tipsSheetContent2 = success.tipsSheetContent;
            }
            CryptoTransferConfig.TransferWarnings.Stage.Warning warning2 = warning;
            TipsSheetContent2 tipsSheetContent22 = tipsSheetContent2;
            NetworkChip networkChip2 = networkChip;
            ImmutableList immutableList2 = immutableList;
            String str4 = str3;
            StringResource stringResource3 = stringResource2;
            return success.copy(str, uuid, stringResource, str2, str4, stringResource3, networkChip2, immutableList2, warning2, tipsSheetContent22);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component10, reason: from getter */
        public final TipsSheetContent2 getTipsSheetContent() {
            return this.tipsSheetContent;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCurrencyId() {
            return this.currencyId;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAddressTag() {
            return this.addressTag;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getDisclaimer() {
            return this.disclaimer;
        }

        /* renamed from: component7, reason: from getter */
        public final NetworkChip getNetworkChip() {
            return this.networkChip;
        }

        public final ImmutableList<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> component8() {
            return this.allAddresses;
        }

        /* renamed from: component9, reason: from getter */
        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getInitialWarningSheet() {
            return this.initialWarningSheet;
        }

        public final Success copy(String currencyCode, UUID currencyId, StringResource title, String address, String addressTag, StringResource disclaimer, NetworkChip networkChip, ImmutableList<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> allAddresses, CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet, TipsSheetContent2 tipsSheetContent) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(currencyId, "currencyId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(allAddresses, "allAddresses");
            Intrinsics.checkNotNullParameter(tipsSheetContent, "tipsSheetContent");
            return new Success(currencyCode, currencyId, title, address, addressTag, disclaimer, networkChip, allAddresses, initialWarningSheet, tipsSheetContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.currencyCode, success.currencyCode) && Intrinsics.areEqual(this.currencyId, success.currencyId) && Intrinsics.areEqual(this.title, success.title) && Intrinsics.areEqual(this.address, success.address) && Intrinsics.areEqual(this.addressTag, success.addressTag) && Intrinsics.areEqual(this.disclaimer, success.disclaimer) && Intrinsics.areEqual(this.networkChip, success.networkChip) && Intrinsics.areEqual(this.allAddresses, success.allAddresses) && Intrinsics.areEqual(this.initialWarningSheet, success.initialWarningSheet) && Intrinsics.areEqual(this.tipsSheetContent, success.tipsSheetContent);
        }

        public int hashCode() {
            int iHashCode = ((((((this.currencyCode.hashCode() * 31) + this.currencyId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.address.hashCode()) * 31;
            String str = this.addressTag;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.disclaimer.hashCode()) * 31;
            NetworkChip networkChip = this.networkChip;
            int iHashCode3 = (((iHashCode2 + (networkChip == null ? 0 : networkChip.hashCode())) * 31) + this.allAddresses.hashCode()) * 31;
            CryptoTransferConfig.TransferWarnings.Stage.Warning warning = this.initialWarningSheet;
            return ((iHashCode3 + (warning != null ? warning.hashCode() : 0)) * 31) + this.tipsSheetContent.hashCode();
        }

        public String toString() {
            return "Success(currencyCode=" + this.currencyCode + ", currencyId=" + this.currencyId + ", title=" + this.title + ", address=" + this.address + ", addressTag=" + this.addressTag + ", disclaimer=" + this.disclaimer + ", networkChip=" + this.networkChip + ", allAddresses=" + this.allAddresses + ", initialWarningSheet=" + this.initialWarningSheet + ", tipsSheetContent=" + this.tipsSheetContent + ")";
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final UUID getCurrencyId() {
            return this.currencyId;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final String getAddress() {
            return this.address;
        }

        public final String getAddressTag() {
            return this.addressTag;
        }

        public final StringResource getDisclaimer() {
            return this.disclaimer;
        }

        public final NetworkChip getNetworkChip() {
            return this.networkChip;
        }

        public final ImmutableList<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> getAllAddresses() {
            return this.allAddresses;
        }

        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getInitialWarningSheet() {
            return this.initialWarningSheet;
        }

        public final TipsSheetContent2 getTipsSheetContent() {
            return this.tipsSheetContent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String currencyCode, UUID currencyId, StringResource title, String address, String str, StringResource disclaimer, NetworkChip networkChip, ImmutableList<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> allAddresses, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, TipsSheetContent2 tipsSheetContent) {
            super(null);
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(currencyId, "currencyId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(allAddresses, "allAddresses");
            Intrinsics.checkNotNullParameter(tipsSheetContent, "tipsSheetContent");
            this.currencyCode = currencyCode;
            this.currencyId = currencyId;
            this.title = title;
            this.address = address;
            this.addressTag = str;
            this.disclaimer = disclaimer;
            this.networkChip = networkChip;
            this.allAddresses = allAddresses;
            this.initialWarningSheet = warning;
            this.tipsSheetContent = tipsSheetContent;
        }

        /* compiled from: CryptoTransferReceiveViewState.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success$NetworkChip;", "", "text", "", "logoUrlLight", "logoUrlDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getLogoUrlLight", "getLogoUrlDark", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NetworkChip {
            public static final int $stable = 0;
            private final String logoUrlDark;
            private final String logoUrlLight;
            private final String text;

            public static /* synthetic */ NetworkChip copy$default(NetworkChip networkChip, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = networkChip.text;
                }
                if ((i & 2) != 0) {
                    str2 = networkChip.logoUrlLight;
                }
                if ((i & 4) != 0) {
                    str3 = networkChip.logoUrlDark;
                }
                return networkChip.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final String getLogoUrlLight() {
                return this.logoUrlLight;
            }

            /* renamed from: component3, reason: from getter */
            public final String getLogoUrlDark() {
                return this.logoUrlDark;
            }

            public final NetworkChip copy(String text, String logoUrlLight, String logoUrlDark) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(logoUrlLight, "logoUrlLight");
                Intrinsics.checkNotNullParameter(logoUrlDark, "logoUrlDark");
                return new NetworkChip(text, logoUrlLight, logoUrlDark);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NetworkChip)) {
                    return false;
                }
                NetworkChip networkChip = (NetworkChip) other;
                return Intrinsics.areEqual(this.text, networkChip.text) && Intrinsics.areEqual(this.logoUrlLight, networkChip.logoUrlLight) && Intrinsics.areEqual(this.logoUrlDark, networkChip.logoUrlDark);
            }

            public int hashCode() {
                return (((this.text.hashCode() * 31) + this.logoUrlLight.hashCode()) * 31) + this.logoUrlDark.hashCode();
            }

            public String toString() {
                return "NetworkChip(text=" + this.text + ", logoUrlLight=" + this.logoUrlLight + ", logoUrlDark=" + this.logoUrlDark + ")";
            }

            public NetworkChip(String text, String logoUrlLight, String logoUrlDark) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(logoUrlLight, "logoUrlLight");
                Intrinsics.checkNotNullParameter(logoUrlDark, "logoUrlDark");
                this.text = text;
                this.logoUrlLight = logoUrlLight;
                this.logoUrlDark = logoUrlDark;
            }

            public final String getText() {
                return this.text;
            }

            public final String getLogoUrlLight() {
                return this.logoUrlLight;
            }

            public final String getLogoUrlDark() {
                return this.logoUrlDark;
            }
        }
    }

    /* compiled from: CryptoTransferReceiveViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Error;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends CryptoTransferReceiveViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 2060425988;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
            super(null);
        }
    }
}
