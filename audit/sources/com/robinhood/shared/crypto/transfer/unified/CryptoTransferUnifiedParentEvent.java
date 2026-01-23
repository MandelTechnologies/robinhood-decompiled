package com.robinhood.shared.crypto.transfer.unified;

import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferUnifiedParentEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent;", "", "Navigate", "Error", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent$Navigate;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CryptoTransferUnifiedParentEvent {

    /* compiled from: CryptoTransferUnifiedParentEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent$Navigate;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent;", "useSavedAddressesFlow", "", "getUseSavedAddressesFlow", "()Z", "AddressEntry", "Unified", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent$Navigate$AddressEntry;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent$Navigate$Unified;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Navigate extends CryptoTransferUnifiedParentEvent {
        boolean getUseSavedAddressesFlow();

        /* compiled from: CryptoTransferUnifiedParentEvent.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent$Navigate$AddressEntry;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent$Navigate;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "initialWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "submitWarningSheet", "addressTagConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "maxAddressLength", "", "useSavedAddressesFlow", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;IZ)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getInitialWarningSheet", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "getSubmitWarningSheet", "getAddressTagConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "getMaxAddressLength", "()I", "getUseSavedAddressesFlow", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AddressEntry implements Navigate {
            public static final int $stable = 8;
            private final CryptoTransferConfig.TransferAddressTag addressTagConfig;
            private final CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet;
            private final int maxAddressLength;
            private final CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet;
            private final UiCurrencyPair uiCurrencyPair;
            private final boolean useSavedAddressesFlow;

            public static /* synthetic */ AddressEntry copy$default(AddressEntry addressEntry, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, CryptoTransferConfig.TransferWarnings.Stage.Warning warning2, CryptoTransferConfig.TransferAddressTag transferAddressTag, int i, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    uiCurrencyPair = addressEntry.uiCurrencyPair;
                }
                if ((i2 & 2) != 0) {
                    warning = addressEntry.initialWarningSheet;
                }
                if ((i2 & 4) != 0) {
                    warning2 = addressEntry.submitWarningSheet;
                }
                if ((i2 & 8) != 0) {
                    transferAddressTag = addressEntry.addressTagConfig;
                }
                if ((i2 & 16) != 0) {
                    i = addressEntry.maxAddressLength;
                }
                if ((i2 & 32) != 0) {
                    z = addressEntry.useSavedAddressesFlow;
                }
                int i3 = i;
                boolean z2 = z;
                return addressEntry.copy(uiCurrencyPair, warning, warning2, transferAddressTag, i3, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCurrencyPair getUiCurrencyPair() {
                return this.uiCurrencyPair;
            }

            /* renamed from: component2, reason: from getter */
            public final CryptoTransferConfig.TransferWarnings.Stage.Warning getInitialWarningSheet() {
                return this.initialWarningSheet;
            }

            /* renamed from: component3, reason: from getter */
            public final CryptoTransferConfig.TransferWarnings.Stage.Warning getSubmitWarningSheet() {
                return this.submitWarningSheet;
            }

            /* renamed from: component4, reason: from getter */
            public final CryptoTransferConfig.TransferAddressTag getAddressTagConfig() {
                return this.addressTagConfig;
            }

            /* renamed from: component5, reason: from getter */
            public final int getMaxAddressLength() {
                return this.maxAddressLength;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getUseSavedAddressesFlow() {
                return this.useSavedAddressesFlow;
            }

            public final AddressEntry copy(UiCurrencyPair uiCurrencyPair, CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet, CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet, CryptoTransferConfig.TransferAddressTag addressTagConfig, int maxAddressLength, boolean useSavedAddressesFlow) {
                Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
                return new AddressEntry(uiCurrencyPair, initialWarningSheet, submitWarningSheet, addressTagConfig, maxAddressLength, useSavedAddressesFlow);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddressEntry)) {
                    return false;
                }
                AddressEntry addressEntry = (AddressEntry) other;
                return Intrinsics.areEqual(this.uiCurrencyPair, addressEntry.uiCurrencyPair) && Intrinsics.areEqual(this.initialWarningSheet, addressEntry.initialWarningSheet) && Intrinsics.areEqual(this.submitWarningSheet, addressEntry.submitWarningSheet) && Intrinsics.areEqual(this.addressTagConfig, addressEntry.addressTagConfig) && this.maxAddressLength == addressEntry.maxAddressLength && this.useSavedAddressesFlow == addressEntry.useSavedAddressesFlow;
            }

            public int hashCode() {
                int iHashCode = this.uiCurrencyPair.hashCode() * 31;
                CryptoTransferConfig.TransferWarnings.Stage.Warning warning = this.initialWarningSheet;
                int iHashCode2 = (iHashCode + (warning == null ? 0 : warning.hashCode())) * 31;
                CryptoTransferConfig.TransferWarnings.Stage.Warning warning2 = this.submitWarningSheet;
                int iHashCode3 = (iHashCode2 + (warning2 == null ? 0 : warning2.hashCode())) * 31;
                CryptoTransferConfig.TransferAddressTag transferAddressTag = this.addressTagConfig;
                return ((((iHashCode3 + (transferAddressTag != null ? transferAddressTag.hashCode() : 0)) * 31) + Integer.hashCode(this.maxAddressLength)) * 31) + Boolean.hashCode(this.useSavedAddressesFlow);
            }

            public String toString() {
                return "AddressEntry(uiCurrencyPair=" + this.uiCurrencyPair + ", initialWarningSheet=" + this.initialWarningSheet + ", submitWarningSheet=" + this.submitWarningSheet + ", addressTagConfig=" + this.addressTagConfig + ", maxAddressLength=" + this.maxAddressLength + ", useSavedAddressesFlow=" + this.useSavedAddressesFlow + ")";
            }

            public AddressEntry(UiCurrencyPair uiCurrencyPair, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, CryptoTransferConfig.TransferWarnings.Stage.Warning warning2, CryptoTransferConfig.TransferAddressTag transferAddressTag, int i, boolean z) {
                Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
                this.uiCurrencyPair = uiCurrencyPair;
                this.initialWarningSheet = warning;
                this.submitWarningSheet = warning2;
                this.addressTagConfig = transferAddressTag;
                this.maxAddressLength = i;
                this.useSavedAddressesFlow = z;
            }

            public final UiCurrencyPair getUiCurrencyPair() {
                return this.uiCurrencyPair;
            }

            public final CryptoTransferConfig.TransferWarnings.Stage.Warning getInitialWarningSheet() {
                return this.initialWarningSheet;
            }

            public final CryptoTransferConfig.TransferWarnings.Stage.Warning getSubmitWarningSheet() {
                return this.submitWarningSheet;
            }

            public final CryptoTransferConfig.TransferAddressTag getAddressTagConfig() {
                return this.addressTagConfig;
            }

            public final int getMaxAddressLength() {
                return this.maxAddressLength;
            }

            @Override // com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentEvent.Navigate
            public boolean getUseSavedAddressesFlow() {
                return this.useSavedAddressesFlow;
            }
        }

        /* compiled from: CryptoTransferUnifiedParentEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent$Navigate$Unified;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent$Navigate;", "useSavedAddressesFlow", "", "<init>", "(Z)V", "getUseSavedAddressesFlow", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Unified implements Navigate {
            public static final int $stable = 0;
            private final boolean useSavedAddressesFlow;

            public static /* synthetic */ Unified copy$default(Unified unified, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = unified.useSavedAddressesFlow;
                }
                return unified.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getUseSavedAddressesFlow() {
                return this.useSavedAddressesFlow;
            }

            public final Unified copy(boolean useSavedAddressesFlow) {
                return new Unified(useSavedAddressesFlow);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unified) && this.useSavedAddressesFlow == ((Unified) other).useSavedAddressesFlow;
            }

            public int hashCode() {
                return Boolean.hashCode(this.useSavedAddressesFlow);
            }

            public String toString() {
                return "Unified(useSavedAddressesFlow=" + this.useSavedAddressesFlow + ")";
            }

            public Unified(boolean z) {
                this.useSavedAddressesFlow = z;
            }

            @Override // com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentEvent.Navigate
            public boolean getUseSavedAddressesFlow() {
                return this.useSavedAddressesFlow;
            }
        }
    }

    /* compiled from: CryptoTransferUnifiedParentEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements CryptoTransferUnifiedParentEvent {
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
