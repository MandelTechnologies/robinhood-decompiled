package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderConfirmationEvent.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent;", "", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "Close", "OpenOrderDetail", "OpenCostDetail", "ShowFeeDefinitionBottomSheet", "ShowTradeBonusBottomSheet", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$Close;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$OpenCostDetail;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$OpenOrderDetail;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$ShowTradeBonusBottomSheet;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoOrderConfirmationEvent {
    public static final int $stable = 8;
    private final UiCryptoOrder order;

    public /* synthetic */ CryptoOrderConfirmationEvent(UiCryptoOrder uiCryptoOrder, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiCryptoOrder);
    }

    private CryptoOrderConfirmationEvent(UiCryptoOrder uiCryptoOrder) {
        this.order = uiCryptoOrder;
    }

    public UiCryptoOrder getOrder() {
        return this.order;
    }

    /* compiled from: CryptoOrderConfirmationEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u001b\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$Close;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "isOrderFilled", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Z)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "()Z", "NotificationUpsell", "Deeplink", "Default", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$Close$Deeplink;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$Close$Default;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$Close$NotificationUpsell;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Close extends CryptoOrderConfirmationEvent {
        public static final int $stable = 8;
        private final boolean isOrderFilled;
        private final UiCryptoOrder order;

        public /* synthetic */ Close(UiCryptoOrder uiCryptoOrder, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiCryptoOrder, z);
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationEvent
        public UiCryptoOrder getOrder() {
            return this.order;
        }

        /* renamed from: isOrderFilled, reason: from getter */
        public boolean getIsOrderFilled() {
            return this.isOrderFilled;
        }

        private Close(UiCryptoOrder uiCryptoOrder, boolean z) {
            super(uiCryptoOrder, null);
            this.order = uiCryptoOrder;
            this.isOrderFilled = z;
        }

        /* compiled from: CryptoOrderConfirmationEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$Close$NotificationUpsell;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$Close;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "isOrderFilled", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Z)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NotificationUpsell extends Close {
            public static final int $stable = 8;
            private final boolean isOrderFilled;
            private final UiCryptoOrder order;

            public static /* synthetic */ NotificationUpsell copy$default(NotificationUpsell notificationUpsell, UiCryptoOrder uiCryptoOrder, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCryptoOrder = notificationUpsell.order;
                }
                if ((i & 2) != 0) {
                    z = notificationUpsell.isOrderFilled;
                }
                return notificationUpsell.copy(uiCryptoOrder, z);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCryptoOrder getOrder() {
                return this.order;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsOrderFilled() {
                return this.isOrderFilled;
            }

            public final NotificationUpsell copy(UiCryptoOrder order, boolean isOrderFilled) {
                return new NotificationUpsell(order, isOrderFilled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotificationUpsell)) {
                    return false;
                }
                NotificationUpsell notificationUpsell = (NotificationUpsell) other;
                return Intrinsics.areEqual(this.order, notificationUpsell.order) && this.isOrderFilled == notificationUpsell.isOrderFilled;
            }

            public int hashCode() {
                UiCryptoOrder uiCryptoOrder = this.order;
                return ((uiCryptoOrder == null ? 0 : uiCryptoOrder.hashCode()) * 31) + Boolean.hashCode(this.isOrderFilled);
            }

            public String toString() {
                return "NotificationUpsell(order=" + this.order + ", isOrderFilled=" + this.isOrderFilled + ")";
            }

            @Override // com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationEvent.Close, com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationEvent
            public UiCryptoOrder getOrder() {
                return this.order;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationEvent.Close
            /* renamed from: isOrderFilled */
            public boolean getIsOrderFilled() {
                return this.isOrderFilled;
            }

            public NotificationUpsell(UiCryptoOrder uiCryptoOrder, boolean z) {
                super(uiCryptoOrder, z, null);
                this.order = uiCryptoOrder;
                this.isOrderFilled = z;
            }
        }

        /* compiled from: CryptoOrderConfirmationEvent.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$Close$Deeplink;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$Close;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "isOrderFilled", "", "deeplinkUri", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;ZLjava/lang/String;)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "()Z", "getDeeplinkUri", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Deeplink extends Close {
            public static final int $stable = 8;
            private final String deeplinkUri;
            private final boolean isOrderFilled;
            private final UiCryptoOrder order;

            public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, UiCryptoOrder uiCryptoOrder, boolean z, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCryptoOrder = deeplink.order;
                }
                if ((i & 2) != 0) {
                    z = deeplink.isOrderFilled;
                }
                if ((i & 4) != 0) {
                    str = deeplink.deeplinkUri;
                }
                return deeplink.copy(uiCryptoOrder, z, str);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCryptoOrder getOrder() {
                return this.order;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsOrderFilled() {
                return this.isOrderFilled;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDeeplinkUri() {
                return this.deeplinkUri;
            }

            public final Deeplink copy(UiCryptoOrder order, boolean isOrderFilled, String deeplinkUri) {
                Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
                return new Deeplink(order, isOrderFilled, deeplinkUri);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Deeplink)) {
                    return false;
                }
                Deeplink deeplink = (Deeplink) other;
                return Intrinsics.areEqual(this.order, deeplink.order) && this.isOrderFilled == deeplink.isOrderFilled && Intrinsics.areEqual(this.deeplinkUri, deeplink.deeplinkUri);
            }

            public int hashCode() {
                UiCryptoOrder uiCryptoOrder = this.order;
                return ((((uiCryptoOrder == null ? 0 : uiCryptoOrder.hashCode()) * 31) + Boolean.hashCode(this.isOrderFilled)) * 31) + this.deeplinkUri.hashCode();
            }

            public String toString() {
                return "Deeplink(order=" + this.order + ", isOrderFilled=" + this.isOrderFilled + ", deeplinkUri=" + this.deeplinkUri + ")";
            }

            @Override // com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationEvent.Close, com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationEvent
            public UiCryptoOrder getOrder() {
                return this.order;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationEvent.Close
            /* renamed from: isOrderFilled */
            public boolean getIsOrderFilled() {
                return this.isOrderFilled;
            }

            public final String getDeeplinkUri() {
                return this.deeplinkUri;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Deeplink(UiCryptoOrder uiCryptoOrder, boolean z, String deeplinkUri) {
                super(uiCryptoOrder, z, null);
                Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
                this.order = uiCryptoOrder;
                this.isOrderFilled = z;
                this.deeplinkUri = deeplinkUri;
            }
        }

        /* compiled from: CryptoOrderConfirmationEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$Close$Default;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$Close;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "isOrderFilled", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Z)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Default extends Close {
            public static final int $stable = 8;
            private final boolean isOrderFilled;
            private final UiCryptoOrder order;

            public static /* synthetic */ Default copy$default(Default r0, UiCryptoOrder uiCryptoOrder, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCryptoOrder = r0.order;
                }
                if ((i & 2) != 0) {
                    z = r0.isOrderFilled;
                }
                return r0.copy(uiCryptoOrder, z);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCryptoOrder getOrder() {
                return this.order;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsOrderFilled() {
                return this.isOrderFilled;
            }

            public final Default copy(UiCryptoOrder order, boolean isOrderFilled) {
                return new Default(order, isOrderFilled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Default)) {
                    return false;
                }
                Default r5 = (Default) other;
                return Intrinsics.areEqual(this.order, r5.order) && this.isOrderFilled == r5.isOrderFilled;
            }

            public int hashCode() {
                UiCryptoOrder uiCryptoOrder = this.order;
                return ((uiCryptoOrder == null ? 0 : uiCryptoOrder.hashCode()) * 31) + Boolean.hashCode(this.isOrderFilled);
            }

            public String toString() {
                return "Default(order=" + this.order + ", isOrderFilled=" + this.isOrderFilled + ")";
            }

            @Override // com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationEvent.Close, com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationEvent
            public UiCryptoOrder getOrder() {
                return this.order;
            }

            @Override // com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationEvent.Close
            /* renamed from: isOrderFilled */
            public boolean getIsOrderFilled() {
                return this.isOrderFilled;
            }

            public Default(UiCryptoOrder uiCryptoOrder, boolean z) {
                super(uiCryptoOrder, z, null);
                this.order = uiCryptoOrder;
                this.isOrderFilled = z;
            }
        }
    }

    /* compiled from: CryptoOrderConfirmationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$OpenOrderDetail;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenOrderDetail extends CryptoOrderConfirmationEvent {
        public static final int $stable = 8;
        private final UiCryptoOrder order;

        public static /* synthetic */ OpenOrderDetail copy$default(OpenOrderDetail openOrderDetail, UiCryptoOrder uiCryptoOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoOrder = openOrderDetail.order;
            }
            return openOrderDetail.copy(uiCryptoOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoOrder getOrder() {
            return this.order;
        }

        public final OpenOrderDetail copy(UiCryptoOrder order) {
            Intrinsics.checkNotNullParameter(order, "order");
            return new OpenOrderDetail(order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenOrderDetail) && Intrinsics.areEqual(this.order, ((OpenOrderDetail) other).order);
        }

        public int hashCode() {
            return this.order.hashCode();
        }

        public String toString() {
            return "OpenOrderDetail(order=" + this.order + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenOrderDetail(UiCryptoOrder order) {
            super(order, null);
            Intrinsics.checkNotNullParameter(order, "order");
            this.order = order;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationEvent
        public UiCryptoOrder getOrder() {
            return this.order;
        }
    }

    /* compiled from: CryptoOrderConfirmationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$OpenCostDetail;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenCostDetail extends CryptoOrderConfirmationEvent {
        public static final int $stable = 8;
        private final UiCryptoOrder order;

        public static /* synthetic */ OpenCostDetail copy$default(OpenCostDetail openCostDetail, UiCryptoOrder uiCryptoOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoOrder = openCostDetail.order;
            }
            return openCostDetail.copy(uiCryptoOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoOrder getOrder() {
            return this.order;
        }

        public final OpenCostDetail copy(UiCryptoOrder order) {
            Intrinsics.checkNotNullParameter(order, "order");
            return new OpenCostDetail(order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenCostDetail) && Intrinsics.areEqual(this.order, ((OpenCostDetail) other).order);
        }

        public int hashCode() {
            return this.order.hashCode();
        }

        public String toString() {
            return "OpenCostDetail(order=" + this.order + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenCostDetail(UiCryptoOrder order) {
            super(order, null);
            Intrinsics.checkNotNullParameter(order, "order");
            this.order = order;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationEvent
        public UiCryptoOrder getOrder() {
            return this.order;
        }
    }

    /* compiled from: CryptoOrderConfirmationEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "args", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "getArgs", "()Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFeeDefinitionBottomSheet extends CryptoOrderConfirmationEvent {
        public static final int $stable = 8;
        private final CryptoFeeDefinitionBottomSheetFragment.Args args;
        private final UiCryptoOrder order;

        public static /* synthetic */ ShowFeeDefinitionBottomSheet copy$default(ShowFeeDefinitionBottomSheet showFeeDefinitionBottomSheet, UiCryptoOrder uiCryptoOrder, CryptoFeeDefinitionBottomSheetFragment.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoOrder = showFeeDefinitionBottomSheet.order;
            }
            if ((i & 2) != 0) {
                args = showFeeDefinitionBottomSheet.args;
            }
            return showFeeDefinitionBottomSheet.copy(uiCryptoOrder, args);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoOrder getOrder() {
            return this.order;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoFeeDefinitionBottomSheetFragment.Args getArgs() {
            return this.args;
        }

        public final ShowFeeDefinitionBottomSheet copy(UiCryptoOrder order, CryptoFeeDefinitionBottomSheetFragment.Args args) {
            Intrinsics.checkNotNullParameter(order, "order");
            Intrinsics.checkNotNullParameter(args, "args");
            return new ShowFeeDefinitionBottomSheet(order, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowFeeDefinitionBottomSheet)) {
                return false;
            }
            ShowFeeDefinitionBottomSheet showFeeDefinitionBottomSheet = (ShowFeeDefinitionBottomSheet) other;
            return Intrinsics.areEqual(this.order, showFeeDefinitionBottomSheet.order) && Intrinsics.areEqual(this.args, showFeeDefinitionBottomSheet.args);
        }

        public int hashCode() {
            return (this.order.hashCode() * 31) + this.args.hashCode();
        }

        public String toString() {
            return "ShowFeeDefinitionBottomSheet(order=" + this.order + ", args=" + this.args + ")";
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationEvent
        public UiCryptoOrder getOrder() {
            return this.order;
        }

        public final CryptoFeeDefinitionBottomSheetFragment.Args getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFeeDefinitionBottomSheet(UiCryptoOrder order, CryptoFeeDefinitionBottomSheetFragment.Args args) {
            super(order, null);
            Intrinsics.checkNotNullParameter(order, "order");
            Intrinsics.checkNotNullParameter(args, "args");
            this.order = order;
            this.args = args;
        }
    }

    /* compiled from: CryptoOrderConfirmationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "isEstimate", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Z)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTradeBonusBottomSheet extends CryptoOrderConfirmationEvent {
        public static final int $stable = 8;
        private final boolean isEstimate;
        private final UiCryptoOrder order;

        public static /* synthetic */ ShowTradeBonusBottomSheet copy$default(ShowTradeBonusBottomSheet showTradeBonusBottomSheet, UiCryptoOrder uiCryptoOrder, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoOrder = showTradeBonusBottomSheet.order;
            }
            if ((i & 2) != 0) {
                z = showTradeBonusBottomSheet.isEstimate;
            }
            return showTradeBonusBottomSheet.copy(uiCryptoOrder, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoOrder getOrder() {
            return this.order;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEstimate() {
            return this.isEstimate;
        }

        public final ShowTradeBonusBottomSheet copy(UiCryptoOrder order, boolean isEstimate) {
            Intrinsics.checkNotNullParameter(order, "order");
            return new ShowTradeBonusBottomSheet(order, isEstimate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowTradeBonusBottomSheet)) {
                return false;
            }
            ShowTradeBonusBottomSheet showTradeBonusBottomSheet = (ShowTradeBonusBottomSheet) other;
            return Intrinsics.areEqual(this.order, showTradeBonusBottomSheet.order) && this.isEstimate == showTradeBonusBottomSheet.isEstimate;
        }

        public int hashCode() {
            return (this.order.hashCode() * 31) + Boolean.hashCode(this.isEstimate);
        }

        public String toString() {
            return "ShowTradeBonusBottomSheet(order=" + this.order + ", isEstimate=" + this.isEstimate + ")";
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationEvent
        public UiCryptoOrder getOrder() {
            return this.order;
        }

        public final boolean isEstimate() {
            return this.isEstimate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTradeBonusBottomSheet(UiCryptoOrder order, boolean z) {
            super(order, null);
            Intrinsics.checkNotNullParameter(order, "order");
            this.order = order;
            this.isEstimate = z;
        }
    }
}
