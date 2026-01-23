package com.robinhood.shared.trade.crypto.p397ui.fee.event;

import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CryptoFeeUiEventProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/event/EntryPoint;", "T", "", "<init>", "()V", "CryptoQuoteOrder", "CryptoOrder", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/EntryPoint$CryptoOrder;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/EntryPoint$CryptoQuoteOrder;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.event.EntryPoint, reason: use source file name */
/* loaded from: classes12.dex */
public abstract class CryptoFeeUiEventProvider3<T> {
    public static final int $stable = 0;

    public /* synthetic */ CryptoFeeUiEventProvider3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoFeeUiEventProvider.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/event/EntryPoint$CryptoQuoteOrder;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/EntryPoint;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/EventType$CryptoQuoteOrder;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.event.EntryPoint$CryptoQuoteOrder */
    public static final /* data */ class CryptoQuoteOrder extends CryptoFeeUiEventProvider3<CryptoFeeUiEventProvider4.CryptoQuoteOrder> {
        public static final int $stable = 0;
        public static final CryptoQuoteOrder INSTANCE = new CryptoQuoteOrder();

        public boolean equals(Object other) {
            return this == other || (other instanceof CryptoQuoteOrder);
        }

        public int hashCode() {
            return -409174692;
        }

        public String toString() {
            return "CryptoQuoteOrder";
        }

        private CryptoQuoteOrder() {
            super(null);
        }
    }

    private CryptoFeeUiEventProvider3() {
    }

    /* compiled from: CryptoFeeUiEventProvider.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/event/EntryPoint$CryptoOrder;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/EntryPoint;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/EventType$CryptoOrder;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.event.EntryPoint$CryptoOrder */
    public static final /* data */ class CryptoOrder extends CryptoFeeUiEventProvider3<CryptoFeeUiEventProvider4.CryptoOrder> {
        public static final int $stable = 0;
        public static final CryptoOrder INSTANCE = new CryptoOrder();

        public boolean equals(Object other) {
            return this == other || (other instanceof CryptoOrder);
        }

        public int hashCode() {
            return 1691139556;
        }

        public String toString() {
            return "CryptoOrder";
        }

        private CryptoOrder() {
            super(null);
        }
    }
}
