package com.robinhood.shared.crypto.staking.staking.input;

import com.robinhood.models.api.CryptoApiErrorResponse;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.shared.crypto.p375ui.amountInputView.CryptoAmountInputEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingInputEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent;", "", "<init>", "()V", "AmountInputEvent", "InputError", "Error", "OrderRequested", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$AmountInputEvent;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$Error;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$InputError;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$OrderRequested;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoStakingInputEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoStakingInputEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoStakingInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$AmountInputEvent;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent;", "cryptoAmountInputEvent", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;", "<init>", "(Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;)V", "getCryptoAmountInputEvent", "()Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;", "ModeChangedEvent", "ShakeInputEvent", "ForceRedrawEvent", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$AmountInputEvent$ForceRedrawEvent;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$AmountInputEvent$ModeChangedEvent;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$AmountInputEvent$ShakeInputEvent;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class AmountInputEvent extends CryptoStakingInputEvent {
        public static final int $stable = 8;
        private final CryptoAmountInputEvent cryptoAmountInputEvent;

        public /* synthetic */ AmountInputEvent(CryptoAmountInputEvent cryptoAmountInputEvent, DefaultConstructorMarker defaultConstructorMarker) {
            this(cryptoAmountInputEvent);
        }

        /* compiled from: CryptoStakingInputEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$AmountInputEvent$ModeChangedEvent;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$AmountInputEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ModeChangedEvent extends AmountInputEvent {
            public static final ModeChangedEvent INSTANCE = new ModeChangedEvent();
            public static final int $stable = 8;

            public boolean equals(Object other) {
                return this == other || (other instanceof ModeChangedEvent);
            }

            public int hashCode() {
                return 233430748;
            }

            public String toString() {
                return "ModeChangedEvent";
            }

            private ModeChangedEvent() {
                super(CryptoAmountInputEvent.ModeChangedEvent.INSTANCE, null);
            }
        }

        private AmountInputEvent(CryptoAmountInputEvent cryptoAmountInputEvent) {
            super(null);
            this.cryptoAmountInputEvent = cryptoAmountInputEvent;
        }

        public final CryptoAmountInputEvent getCryptoAmountInputEvent() {
            return this.cryptoAmountInputEvent;
        }

        /* compiled from: CryptoStakingInputEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$AmountInputEvent$ShakeInputEvent;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$AmountInputEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShakeInputEvent extends AmountInputEvent {
            public static final ShakeInputEvent INSTANCE = new ShakeInputEvent();
            public static final int $stable = 8;

            public boolean equals(Object other) {
                return this == other || (other instanceof ShakeInputEvent);
            }

            public int hashCode() {
                return -1112956701;
            }

            public String toString() {
                return "ShakeInputEvent";
            }

            private ShakeInputEvent() {
                super(CryptoAmountInputEvent.ShakeInputEvent.INSTANCE, null);
            }
        }

        /* compiled from: CryptoStakingInputEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$AmountInputEvent$ForceRedrawEvent;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$AmountInputEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ForceRedrawEvent extends AmountInputEvent {
            public static final ForceRedrawEvent INSTANCE = new ForceRedrawEvent();
            public static final int $stable = 8;

            public boolean equals(Object other) {
                return this == other || (other instanceof ForceRedrawEvent);
            }

            public int hashCode() {
                return 1676797003;
            }

            public String toString() {
                return "ForceRedrawEvent";
            }

            private ForceRedrawEvent() {
                super(CryptoAmountInputEvent.ForceRedrawEvent.INSTANCE, null);
            }
        }
    }

    private CryptoStakingInputEvent() {
    }

    /* compiled from: CryptoStakingInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$InputError;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent;", "inputError", "Lcom/robinhood/models/api/CryptoApiErrorResponse;", "<init>", "(Lcom/robinhood/models/api/CryptoApiErrorResponse;)V", "getInputError", "()Lcom/robinhood/models/api/CryptoApiErrorResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InputError extends CryptoStakingInputEvent {
        public static final int $stable = 8;
        private final CryptoApiErrorResponse inputError;

        public static /* synthetic */ InputError copy$default(InputError inputError, CryptoApiErrorResponse cryptoApiErrorResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoApiErrorResponse = inputError.inputError;
            }
            return inputError.copy(cryptoApiErrorResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoApiErrorResponse getInputError() {
            return this.inputError;
        }

        public final InputError copy(CryptoApiErrorResponse inputError) {
            Intrinsics.checkNotNullParameter(inputError, "inputError");
            return new InputError(inputError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InputError) && Intrinsics.areEqual(this.inputError, ((InputError) other).inputError);
        }

        public int hashCode() {
            return this.inputError.hashCode();
        }

        public String toString() {
            return "InputError(inputError=" + this.inputError + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputError(CryptoApiErrorResponse inputError) {
            super(null);
            Intrinsics.checkNotNullParameter(inputError, "inputError");
            this.inputError = inputError;
        }

        public final CryptoApiErrorResponse getInputError() {
            return this.inputError;
        }
    }

    /* compiled from: CryptoStakingInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$Error;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends CryptoStakingInputEvent {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: CryptoStakingInputEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent$OrderRequested;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "idempotencyId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;Ljava/util/UUID;)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "getIdempotencyId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderRequested extends CryptoStakingInputEvent {
        public static final int $stable = 8;
        private final UUID idempotencyId;
        private final UiCryptoStakingOrderModel order;

        public static /* synthetic */ OrderRequested copy$default(OrderRequested orderRequested, UiCryptoStakingOrderModel uiCryptoStakingOrderModel, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoStakingOrderModel = orderRequested.order;
            }
            if ((i & 2) != 0) {
                uuid = orderRequested.idempotencyId;
            }
            return orderRequested.copy(uiCryptoStakingOrderModel, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoStakingOrderModel getOrder() {
            return this.order;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getIdempotencyId() {
            return this.idempotencyId;
        }

        public final OrderRequested copy(UiCryptoStakingOrderModel order, UUID idempotencyId) {
            Intrinsics.checkNotNullParameter(order, "order");
            Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
            return new OrderRequested(order, idempotencyId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderRequested)) {
                return false;
            }
            OrderRequested orderRequested = (OrderRequested) other;
            return Intrinsics.areEqual(this.order, orderRequested.order) && Intrinsics.areEqual(this.idempotencyId, orderRequested.idempotencyId);
        }

        public int hashCode() {
            return (this.order.hashCode() * 31) + this.idempotencyId.hashCode();
        }

        public String toString() {
            return "OrderRequested(order=" + this.order + ", idempotencyId=" + this.idempotencyId + ")";
        }

        public final UiCryptoStakingOrderModel getOrder() {
            return this.order;
        }

        public final UUID getIdempotencyId() {
            return this.idempotencyId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderRequested(UiCryptoStakingOrderModel order, UUID idempotencyId) {
            super(null);
            Intrinsics.checkNotNullParameter(order, "order");
            Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
            this.order = order;
            this.idempotencyId = idempotencyId;
        }
    }
}
