package com.robinhood.shared.crypto.transfer.send.address.host;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendAddressHostEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent;", "", "Continue", "Error", "ShowInitialWarningSheet", "ShowAllowlistPrimer", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent$Continue;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent$ShowAllowlistPrimer;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent$ShowInitialWarningSheet;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CryptoTransferSendAddressHostEvent {

    /* compiled from: CryptoTransferSendAddressHostEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent$Continue;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent;", PlaceTypes.ADDRESS, "", "supportedNetworks", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;)V", "getAddress", "()Ljava/lang/String;", "getSupportedNetworks", "()Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Continue implements CryptoTransferSendAddressHostEvent {
        public static final int $stable = 8;
        private final String address;
        private final ApiCryptoSupportedNetworks supportedNetworks;

        public static /* synthetic */ Continue copy$default(Continue r0, String str, ApiCryptoSupportedNetworks apiCryptoSupportedNetworks, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.address;
            }
            if ((i & 2) != 0) {
                apiCryptoSupportedNetworks = r0.supportedNetworks;
            }
            return r0.copy(str, apiCryptoSupportedNetworks);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCryptoSupportedNetworks getSupportedNetworks() {
            return this.supportedNetworks;
        }

        public final Continue copy(String address, ApiCryptoSupportedNetworks supportedNetworks) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new Continue(address, supportedNetworks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Continue)) {
                return false;
            }
            Continue r5 = (Continue) other;
            return Intrinsics.areEqual(this.address, r5.address) && Intrinsics.areEqual(this.supportedNetworks, r5.supportedNetworks);
        }

        public int hashCode() {
            int iHashCode = this.address.hashCode() * 31;
            ApiCryptoSupportedNetworks apiCryptoSupportedNetworks = this.supportedNetworks;
            return iHashCode + (apiCryptoSupportedNetworks == null ? 0 : apiCryptoSupportedNetworks.hashCode());
        }

        public String toString() {
            return "Continue(address=" + this.address + ", supportedNetworks=" + this.supportedNetworks + ")";
        }

        public Continue(String address, ApiCryptoSupportedNetworks apiCryptoSupportedNetworks) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
            this.supportedNetworks = apiCryptoSupportedNetworks;
        }

        public final String getAddress() {
            return this.address;
        }

        public final ApiCryptoSupportedNetworks getSupportedNetworks() {
            return this.supportedNetworks;
        }
    }

    /* compiled from: CryptoTransferSendAddressHostEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements CryptoTransferSendAddressHostEvent {
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

    /* compiled from: CryptoTransferSendAddressHostEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent$ShowInitialWarningSheet;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent;", "initialWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "<init>", "(Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;)V", "getInitialWarningSheet", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowInitialWarningSheet implements CryptoTransferSendAddressHostEvent {
        public static final int $stable = 8;
        private final CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet;

        public static /* synthetic */ ShowInitialWarningSheet copy$default(ShowInitialWarningSheet showInitialWarningSheet, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, int i, Object obj) {
            if ((i & 1) != 0) {
                warning = showInitialWarningSheet.initialWarningSheet;
            }
            return showInitialWarningSheet.copy(warning);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getInitialWarningSheet() {
            return this.initialWarningSheet;
        }

        public final ShowInitialWarningSheet copy(CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet) {
            Intrinsics.checkNotNullParameter(initialWarningSheet, "initialWarningSheet");
            return new ShowInitialWarningSheet(initialWarningSheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowInitialWarningSheet) && Intrinsics.areEqual(this.initialWarningSheet, ((ShowInitialWarningSheet) other).initialWarningSheet);
        }

        public int hashCode() {
            return this.initialWarningSheet.hashCode();
        }

        public String toString() {
            return "ShowInitialWarningSheet(initialWarningSheet=" + this.initialWarningSheet + ")";
        }

        public ShowInitialWarningSheet(CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet) {
            Intrinsics.checkNotNullParameter(initialWarningSheet, "initialWarningSheet");
            this.initialWarningSheet = initialWarningSheet;
        }

        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getInitialWarningSheet() {
            return this.initialWarningSheet;
        }
    }

    /* compiled from: CryptoTransferSendAddressHostEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent$ShowAllowlistPrimer;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAllowlistPrimer implements CryptoTransferSendAddressHostEvent {
        public static final int $stable = 0;
        public static final ShowAllowlistPrimer INSTANCE = new ShowAllowlistPrimer();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowAllowlistPrimer);
        }

        public int hashCode() {
            return -887324239;
        }

        public String toString() {
            return "ShowAllowlistPrimer";
        }

        private ShowAllowlistPrimer() {
        }
    }
}
