package com.robinhood.shared.crypto.transfer.send.address.host;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendAddressHostViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostViewState;", "", "isRhc", "", "entryType", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostViewState$EntryType;", "isProtectionSheetLoading", "<init>", "(ZLcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostViewState$EntryType;Z)V", "()Z", "getEntryType", "()Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostViewState$EntryType;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "EntryType", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSendAddressHostViewState {
    public static final int $stable = 0;
    private final EntryType entryType;
    private final boolean isProtectionSheetLoading;
    private final boolean isRhc;

    public static /* synthetic */ CryptoTransferSendAddressHostViewState copy$default(CryptoTransferSendAddressHostViewState cryptoTransferSendAddressHostViewState, boolean z, EntryType entryType, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoTransferSendAddressHostViewState.isRhc;
        }
        if ((i & 2) != 0) {
            entryType = cryptoTransferSendAddressHostViewState.entryType;
        }
        if ((i & 4) != 0) {
            z2 = cryptoTransferSendAddressHostViewState.isProtectionSheetLoading;
        }
        return cryptoTransferSendAddressHostViewState.copy(z, entryType, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRhc() {
        return this.isRhc;
    }

    /* renamed from: component2, reason: from getter */
    public final EntryType getEntryType() {
        return this.entryType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsProtectionSheetLoading() {
        return this.isProtectionSheetLoading;
    }

    public final CryptoTransferSendAddressHostViewState copy(boolean isRhc, EntryType entryType, boolean isProtectionSheetLoading) {
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        return new CryptoTransferSendAddressHostViewState(isRhc, entryType, isProtectionSheetLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSendAddressHostViewState)) {
            return false;
        }
        CryptoTransferSendAddressHostViewState cryptoTransferSendAddressHostViewState = (CryptoTransferSendAddressHostViewState) other;
        return this.isRhc == cryptoTransferSendAddressHostViewState.isRhc && this.entryType == cryptoTransferSendAddressHostViewState.entryType && this.isProtectionSheetLoading == cryptoTransferSendAddressHostViewState.isProtectionSheetLoading;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isRhc) * 31) + this.entryType.hashCode()) * 31) + Boolean.hashCode(this.isProtectionSheetLoading);
    }

    public String toString() {
        return "CryptoTransferSendAddressHostViewState(isRhc=" + this.isRhc + ", entryType=" + this.entryType + ", isProtectionSheetLoading=" + this.isProtectionSheetLoading + ")";
    }

    public CryptoTransferSendAddressHostViewState(boolean z, EntryType entryType, boolean z2) {
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        this.isRhc = z;
        this.entryType = entryType;
        this.isProtectionSheetLoading = z2;
    }

    public final boolean isRhc() {
        return this.isRhc;
    }

    public final EntryType getEntryType() {
        return this.entryType;
    }

    public final boolean isProtectionSheetLoading() {
        return this.isProtectionSheetLoading;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTransferSendAddressHostViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostViewState$EntryType;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "DEFAULT", "SAVED_ADDRESS", "ALLOWLIST", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryType[] $VALUES;
        public static final EntryType LOADING = new EntryType("LOADING", 0);
        public static final EntryType DEFAULT = new EntryType("DEFAULT", 1);
        public static final EntryType SAVED_ADDRESS = new EntryType("SAVED_ADDRESS", 2);
        public static final EntryType ALLOWLIST = new EntryType("ALLOWLIST", 3);

        private static final /* synthetic */ EntryType[] $values() {
            return new EntryType[]{LOADING, DEFAULT, SAVED_ADDRESS, ALLOWLIST};
        }

        public static EnumEntries<EntryType> getEntries() {
            return $ENTRIES;
        }

        private EntryType(String str, int i) {
        }

        static {
            EntryType[] entryTypeArr$values = $values();
            $VALUES = entryTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryTypeArr$values);
        }

        public static EntryType valueOf(String str) {
            return (EntryType) Enum.valueOf(EntryType.class, str);
        }

        public static EntryType[] values() {
            return (EntryType[]) $VALUES.clone();
        }
    }
}
