package com.robinhood.shared.crypto.contracts.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferVerificationIntentKey.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000b\f\rR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;", "getLoggingContext", "()Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;", "verificationId", "Ljava/util/UUID;", "getVerificationId", "()Ljava/util/UUID;", "Withdrawal", "Deeplink", "LoggingContext", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$Deeplink;", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$Withdrawal;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface CryptoTransferVerificationIntentKey extends IntentKey, Parcelable {
    LoggingContext getLoggingContext();

    UUID getVerificationId();

    /* compiled from: CryptoTransferVerificationIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static NavigationType getNavigationType(CryptoTransferVerificationIntentKey cryptoTransferVerificationIntentKey) {
            return IntentKey.DefaultImpls.getNavigationType(cryptoTransferVerificationIntentKey);
        }
    }

    /* compiled from: CryptoTransferVerificationIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$Withdrawal;", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey;", "Landroid/os/Parcelable;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;", "verificationId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;Ljava/util/UUID;)V", "getLoggingContext", "()Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;", "getVerificationId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Withdrawal implements CryptoTransferVerificationIntentKey, Parcelable {
        public static final Parcelable.Creator<Withdrawal> CREATOR = new Creator();
        private final LoggingContext loggingContext;
        private final UUID verificationId;

        /* compiled from: CryptoTransferVerificationIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Withdrawal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Withdrawal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Withdrawal(LoggingContext.CREATOR.createFromParcel(parcel), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Withdrawal[] newArray(int i) {
                return new Withdrawal[i];
            }
        }

        public static /* synthetic */ Withdrawal copy$default(Withdrawal withdrawal, LoggingContext loggingContext, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                loggingContext = withdrawal.loggingContext;
            }
            if ((i & 2) != 0) {
                uuid = withdrawal.verificationId;
            }
            return withdrawal.copy(loggingContext, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final LoggingContext getLoggingContext() {
            return this.loggingContext;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getVerificationId() {
            return this.verificationId;
        }

        public final Withdrawal copy(LoggingContext loggingContext, UUID verificationId) {
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            Intrinsics.checkNotNullParameter(verificationId, "verificationId");
            return new Withdrawal(loggingContext, verificationId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Withdrawal)) {
                return false;
            }
            Withdrawal withdrawal = (Withdrawal) other;
            return Intrinsics.areEqual(this.loggingContext, withdrawal.loggingContext) && Intrinsics.areEqual(this.verificationId, withdrawal.verificationId);
        }

        public int hashCode() {
            return (this.loggingContext.hashCode() * 31) + this.verificationId.hashCode();
        }

        public String toString() {
            return "Withdrawal(loggingContext=" + this.loggingContext + ", verificationId=" + this.verificationId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.loggingContext.writeToParcel(dest, flags);
            dest.writeSerializable(this.verificationId);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public Withdrawal(LoggingContext loggingContext, UUID verificationId) {
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            Intrinsics.checkNotNullParameter(verificationId, "verificationId");
            this.loggingContext = loggingContext;
            this.verificationId = verificationId;
        }

        @Override // com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey
        public LoggingContext getLoggingContext() {
            return this.loggingContext;
        }

        @Override // com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey
        public UUID getVerificationId() {
            return this.verificationId;
        }
    }

    /* compiled from: CryptoTransferVerificationIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$Deeplink;", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey;", "Landroid/os/Parcelable;", "transferId", "Ljava/util/UUID;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;", "verificationId", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;Ljava/util/UUID;)V", "getTransferId", "()Ljava/util/UUID;", "getLoggingContext", "()Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;", "getVerificationId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Deeplink implements CryptoTransferVerificationIntentKey, Parcelable {
        public static final Parcelable.Creator<Deeplink> CREATOR = new Creator();
        private final LoggingContext loggingContext;
        private final UUID transferId;
        private final UUID verificationId;

        /* compiled from: CryptoTransferVerificationIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Deeplink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Deeplink createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink((UUID) parcel.readSerializable(), LoggingContext.CREATOR.createFromParcel(parcel), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Deeplink[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, UUID uuid, LoggingContext loggingContext, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = deeplink.transferId;
            }
            if ((i & 2) != 0) {
                loggingContext = deeplink.loggingContext;
            }
            if ((i & 4) != 0) {
                uuid2 = deeplink.verificationId;
            }
            return deeplink.copy(uuid, loggingContext, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getTransferId() {
            return this.transferId;
        }

        /* renamed from: component2, reason: from getter */
        public final LoggingContext getLoggingContext() {
            return this.loggingContext;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getVerificationId() {
            return this.verificationId;
        }

        public final Deeplink copy(UUID transferId, LoggingContext loggingContext, UUID verificationId) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            Intrinsics.checkNotNullParameter(verificationId, "verificationId");
            return new Deeplink(transferId, loggingContext, verificationId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Deeplink)) {
                return false;
            }
            Deeplink deeplink = (Deeplink) other;
            return Intrinsics.areEqual(this.transferId, deeplink.transferId) && Intrinsics.areEqual(this.loggingContext, deeplink.loggingContext) && Intrinsics.areEqual(this.verificationId, deeplink.verificationId);
        }

        public int hashCode() {
            return (((this.transferId.hashCode() * 31) + this.loggingContext.hashCode()) * 31) + this.verificationId.hashCode();
        }

        public String toString() {
            return "Deeplink(transferId=" + this.transferId + ", loggingContext=" + this.loggingContext + ", verificationId=" + this.verificationId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.transferId);
            this.loggingContext.writeToParcel(dest, flags);
            dest.writeSerializable(this.verificationId);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public Deeplink(UUID transferId, LoggingContext loggingContext, UUID verificationId) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            Intrinsics.checkNotNullParameter(verificationId, "verificationId");
            this.transferId = transferId;
            this.loggingContext = loggingContext;
            this.verificationId = verificationId;
        }

        public final UUID getTransferId() {
            return this.transferId;
        }

        @Override // com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey
        public LoggingContext getLoggingContext() {
            return this.loggingContext;
        }

        @Override // com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey
        public UUID getVerificationId() {
            return this.verificationId;
        }
    }

    /* compiled from: CryptoTransferVerificationIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;", "Landroid/os/Parcelable;", "currencyId", "Ljava/util/UUID;", "sessionId", "transferId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V", "getCurrencyId", "()Ljava/util/UUID;", "getSessionId", "getTransferId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class LoggingContext implements Parcelable {
        public static final Parcelable.Creator<LoggingContext> CREATOR = new Creator();
        private final UUID currencyId;
        private final UUID sessionId;
        private final UUID transferId;

        /* compiled from: CryptoTransferVerificationIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<LoggingContext> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoggingContext createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoggingContext((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoggingContext[] newArray(int i) {
                return new LoggingContext[i];
            }
        }

        public static /* synthetic */ LoggingContext copy$default(LoggingContext loggingContext, UUID uuid, UUID uuid2, UUID uuid3, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = loggingContext.currencyId;
            }
            if ((i & 2) != 0) {
                uuid2 = loggingContext.sessionId;
            }
            if ((i & 4) != 0) {
                uuid3 = loggingContext.transferId;
            }
            return loggingContext.copy(uuid, uuid2, uuid3);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyId() {
            return this.currencyId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getSessionId() {
            return this.sessionId;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getTransferId() {
            return this.transferId;
        }

        public final LoggingContext copy(UUID currencyId, UUID sessionId, UUID transferId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            return new LoggingContext(currencyId, sessionId, transferId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoggingContext)) {
                return false;
            }
            LoggingContext loggingContext = (LoggingContext) other;
            return Intrinsics.areEqual(this.currencyId, loggingContext.currencyId) && Intrinsics.areEqual(this.sessionId, loggingContext.sessionId) && Intrinsics.areEqual(this.transferId, loggingContext.transferId);
        }

        public int hashCode() {
            UUID uuid = this.currencyId;
            return ((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.transferId.hashCode();
        }

        public String toString() {
            return "LoggingContext(currencyId=" + this.currencyId + ", sessionId=" + this.sessionId + ", transferId=" + this.transferId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyId);
            dest.writeSerializable(this.sessionId);
            dest.writeSerializable(this.transferId);
        }

        public LoggingContext(UUID uuid, UUID sessionId, UUID transferId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            this.currencyId = uuid;
            this.sessionId = sessionId;
            this.transferId = transferId;
        }

        public final UUID getCurrencyId() {
            return this.currencyId;
        }

        public final UUID getSessionId() {
            return this.sessionId;
        }

        public final UUID getTransferId() {
            return this.transferId;
        }
    }
}
