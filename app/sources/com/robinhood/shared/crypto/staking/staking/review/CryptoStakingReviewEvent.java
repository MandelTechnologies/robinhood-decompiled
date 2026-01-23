package com.robinhood.shared.crypto.staking.staking.review;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.shared.crypto.p375ui.amountInputView.CryptoAmountInputEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingReviewEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent;", "", "<init>", "()V", "ReviewEvent", "OrderSubmissionSuccess", "Error", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent$Error;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent$OrderSubmissionSuccess;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent$ReviewEvent;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoStakingReviewEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoStakingReviewEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoStakingReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent$ReviewEvent;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent;", "cryptoAmountInputEvent", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;", "<init>", "(Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;)V", "getCryptoAmountInputEvent", "()Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;", "ForceRedrawEvent", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent$ReviewEvent$ForceRedrawEvent;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ReviewEvent extends CryptoStakingReviewEvent {
        public static final int $stable = 8;
        private final CryptoAmountInputEvent cryptoAmountInputEvent;

        public /* synthetic */ ReviewEvent(CryptoAmountInputEvent cryptoAmountInputEvent, DefaultConstructorMarker defaultConstructorMarker) {
            this(cryptoAmountInputEvent);
        }

        /* compiled from: CryptoStakingReviewEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent$ReviewEvent$ForceRedrawEvent;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent$ReviewEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ForceRedrawEvent extends ReviewEvent {
            public static final ForceRedrawEvent INSTANCE = new ForceRedrawEvent();
            public static final int $stable = 8;

            public boolean equals(Object other) {
                return this == other || (other instanceof ForceRedrawEvent);
            }

            public int hashCode() {
                return 1432799383;
            }

            public String toString() {
                return "ForceRedrawEvent";
            }

            private ForceRedrawEvent() {
                super(CryptoAmountInputEvent.ForceRedrawEvent.INSTANCE, null);
            }
        }

        private ReviewEvent(CryptoAmountInputEvent cryptoAmountInputEvent) {
            super(null);
            this.cryptoAmountInputEvent = cryptoAmountInputEvent;
        }

        public final CryptoAmountInputEvent getCryptoAmountInputEvent() {
            return this.cryptoAmountInputEvent;
        }
    }

    private CryptoStakingReviewEvent() {
    }

    /* compiled from: CryptoStakingReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent$OrderSubmissionSuccess;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "<init>", "(Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderSubmissionSuccess extends CryptoStakingReviewEvent {
        public static final int $stable = 8;
        private final UiCryptoStakingOrderModel order;

        public static /* synthetic */ OrderSubmissionSuccess copy$default(OrderSubmissionSuccess orderSubmissionSuccess, UiCryptoStakingOrderModel uiCryptoStakingOrderModel, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoStakingOrderModel = orderSubmissionSuccess.order;
            }
            return orderSubmissionSuccess.copy(uiCryptoStakingOrderModel);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoStakingOrderModel getOrder() {
            return this.order;
        }

        public final OrderSubmissionSuccess copy(UiCryptoStakingOrderModel order) {
            Intrinsics.checkNotNullParameter(order, "order");
            return new OrderSubmissionSuccess(order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderSubmissionSuccess) && Intrinsics.areEqual(this.order, ((OrderSubmissionSuccess) other).order);
        }

        public int hashCode() {
            return this.order.hashCode();
        }

        public String toString() {
            return "OrderSubmissionSuccess(order=" + this.order + ")";
        }

        public final UiCryptoStakingOrderModel getOrder() {
            return this.order;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderSubmissionSuccess(UiCryptoStakingOrderModel order) {
            super(null);
            Intrinsics.checkNotNullParameter(order, "order");
            this.order = order;
        }
    }

    /* compiled from: CryptoStakingReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent$Error;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends CryptoStakingReviewEvent {
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

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }
}
