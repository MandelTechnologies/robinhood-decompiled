package com.robinhood.shared.crypto.transfer;

import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent;", "", "NavigateEvent", "Upsell", "Error", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$Upsell;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CryptoTransferEvent {

    /* compiled from: CryptoTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent;", "<init>", "()V", "Loading", "Enrollment", "Receive", "Send", "Finish", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent$Enrollment;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent$Finish;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent$Loading;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent$Receive;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent$Send;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class NavigateEvent implements CryptoTransferEvent {
        public static final int $stable = 0;

        public /* synthetic */ NavigateEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private NavigateEvent() {
        }

        /* compiled from: CryptoTransferEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent$Loading;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading extends NavigateEvent {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -1093938867;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
                super(null);
            }
        }

        /* compiled from: CryptoTransferEvent.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent$Enrollment;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent;", "enrollmentState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "<init>", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;Lcom/robinhood/models/api/transfer/CryptoTransferAction;)V", "getEnrollmentState", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "getAction", "()Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Enrollment extends NavigateEvent {
            public static final int $stable = 0;
            private final CryptoTransferAction action;
            private final ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState;

            public static /* synthetic */ Enrollment copy$default(Enrollment enrollment, ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction cryptoTransferAction, int i, Object obj) {
                if ((i & 1) != 0) {
                    enrollmentState = enrollment.enrollmentState;
                }
                if ((i & 2) != 0) {
                    cryptoTransferAction = enrollment.action;
                }
                return enrollment.copy(enrollmentState, cryptoTransferAction);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiCryptoTransferConfig.TransferStates.EnrollmentState getEnrollmentState() {
                return this.enrollmentState;
            }

            /* renamed from: component2, reason: from getter */
            public final CryptoTransferAction getAction() {
                return this.action;
            }

            public final Enrollment copy(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction action) {
                Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
                Intrinsics.checkNotNullParameter(action, "action");
                return new Enrollment(enrollmentState, action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Enrollment)) {
                    return false;
                }
                Enrollment enrollment = (Enrollment) other;
                return this.enrollmentState == enrollment.enrollmentState && this.action == enrollment.action;
            }

            public int hashCode() {
                return (this.enrollmentState.hashCode() * 31) + this.action.hashCode();
            }

            public String toString() {
                return "Enrollment(enrollmentState=" + this.enrollmentState + ", action=" + this.action + ")";
            }

            public final ApiCryptoTransferConfig.TransferStates.EnrollmentState getEnrollmentState() {
                return this.enrollmentState;
            }

            public final CryptoTransferAction getAction() {
                return this.action;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Enrollment(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction action) {
                super(null);
                Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
                Intrinsics.checkNotNullParameter(action, "action");
                this.enrollmentState = enrollmentState;
                this.action = action;
            }
        }

        /* compiled from: CryptoTransferEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent$Receive;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Receive extends NavigateEvent {
            public static final int $stable = 8;
            private final UUID currencyPairId;

            public static /* synthetic */ Receive copy$default(Receive receive, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = receive.currencyPairId;
                }
                return receive.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getCurrencyPairId() {
                return this.currencyPairId;
            }

            public final Receive copy(UUID currencyPairId) {
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                return new Receive(currencyPairId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Receive) && Intrinsics.areEqual(this.currencyPairId, ((Receive) other).currencyPairId);
            }

            public int hashCode() {
                return this.currencyPairId.hashCode();
            }

            public String toString() {
                return "Receive(currencyPairId=" + this.currencyPairId + ")";
            }

            public final UUID getCurrencyPairId() {
                return this.currencyPairId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Receive(UUID currencyPairId) {
                super(null);
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                this.currencyPairId = currencyPairId;
            }
        }

        /* compiled from: CryptoTransferEvent.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent$Send;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent;", "currencyPairId", "Ljava/util/UUID;", "sendState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$SendState;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$SendState;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getSendState", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$SendState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Send extends NavigateEvent {
            public static final int $stable = 8;
            private final UUID currencyPairId;
            private final ApiCryptoTransferConfig.TransferStates.SendState sendState;

            public static /* synthetic */ Send copy$default(Send send, UUID uuid, ApiCryptoTransferConfig.TransferStates.SendState sendState, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = send.currencyPairId;
                }
                if ((i & 2) != 0) {
                    sendState = send.sendState;
                }
                return send.copy(uuid, sendState);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getCurrencyPairId() {
                return this.currencyPairId;
            }

            /* renamed from: component2, reason: from getter */
            public final ApiCryptoTransferConfig.TransferStates.SendState getSendState() {
                return this.sendState;
            }

            public final Send copy(UUID currencyPairId, ApiCryptoTransferConfig.TransferStates.SendState sendState) {
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                Intrinsics.checkNotNullParameter(sendState, "sendState");
                return new Send(currencyPairId, sendState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Send)) {
                    return false;
                }
                Send send = (Send) other;
                return Intrinsics.areEqual(this.currencyPairId, send.currencyPairId) && this.sendState == send.sendState;
            }

            public int hashCode() {
                return (this.currencyPairId.hashCode() * 31) + this.sendState.hashCode();
            }

            public String toString() {
                return "Send(currencyPairId=" + this.currencyPairId + ", sendState=" + this.sendState + ")";
            }

            public final UUID getCurrencyPairId() {
                return this.currencyPairId;
            }

            public final ApiCryptoTransferConfig.TransferStates.SendState getSendState() {
                return this.sendState;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Send(UUID currencyPairId, ApiCryptoTransferConfig.TransferStates.SendState sendState) {
                super(null);
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                Intrinsics.checkNotNullParameter(sendState, "sendState");
                this.currencyPairId = currencyPairId;
                this.sendState = sendState;
            }
        }

        /* compiled from: CryptoTransferEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent$Finish;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$NavigateEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Finish extends NavigateEvent {
            public static final int $stable = 0;
            public static final Finish INSTANCE = new Finish();

            public boolean equals(Object other) {
                return this == other || (other instanceof Finish);
            }

            public int hashCode() {
                return -350759326;
            }

            public String toString() {
                return "Finish";
            }

            private Finish() {
                super(null);
            }
        }
    }

    /* compiled from: CryptoTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$Upsell;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent;", "deeplink", "", "<init>", "(Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Upsell implements CryptoTransferEvent {
        public static final int $stable = 0;
        private final String deeplink;

        public static /* synthetic */ Upsell copy$default(Upsell upsell, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upsell.deeplink;
            }
            return upsell.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Upsell copy(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new Upsell(deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Upsell) && Intrinsics.areEqual(this.deeplink, ((Upsell) other).deeplink);
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        public String toString() {
            return "Upsell(deeplink=" + this.deeplink + ")";
        }

        public Upsell(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }
    }

    /* compiled from: CryptoTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements CryptoTransferEvent {
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

        public Error(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
