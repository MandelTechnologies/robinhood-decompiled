package com.robinhood.shared.order.type.education;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CryptoOrderTypeEducationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationEvent;", "", "<init>", "()V", "OnContinue", "PopBackStack", "Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationEvent$OnContinue;", "Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationEvent$PopBackStack;", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationEvent, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class CryptoOrderTypeEducationDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ CryptoOrderTypeEducationDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoOrderTypeEducationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationEvent$OnContinue;", "Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationEvent$OnContinue */
    public static final /* data */ class OnContinue extends CryptoOrderTypeEducationDuxo2 {
        public static final int $stable = 0;
        public static final OnContinue INSTANCE = new OnContinue();

        public boolean equals(Object other) {
            return this == other || (other instanceof OnContinue);
        }

        public int hashCode() {
            return -646515487;
        }

        public String toString() {
            return "OnContinue";
        }

        private OnContinue() {
            super(null);
        }
    }

    private CryptoOrderTypeEducationDuxo2() {
    }

    /* compiled from: CryptoOrderTypeEducationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationEvent$PopBackStack;", "Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationEvent$PopBackStack */
    public static final /* data */ class PopBackStack extends CryptoOrderTypeEducationDuxo2 {
        public static final int $stable = 0;
        public static final PopBackStack INSTANCE = new PopBackStack();

        public boolean equals(Object other) {
            return this == other || (other instanceof PopBackStack);
        }

        public int hashCode() {
            return 221806859;
        }

        public String toString() {
            return "PopBackStack";
        }

        private PopBackStack() {
            super(null);
        }
    }
}
