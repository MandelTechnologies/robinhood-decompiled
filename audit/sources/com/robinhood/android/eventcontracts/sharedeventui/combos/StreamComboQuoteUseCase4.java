package com.robinhood.android.eventcontracts.sharedeventui.combos;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StreamComboQuoteUseCase.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount;", "", "Default", "NotionalBased", "QuantityBased", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount$Default;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount$NotionalBased;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount$QuantityBased;", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboRequestAmount, reason: use source file name */
/* loaded from: classes3.dex */
public interface StreamComboQuoteUseCase4 {

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount$Default;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboRequestAmount$Default */
    public static final /* data */ class Default implements StreamComboQuoteUseCase4 {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();

        public boolean equals(Object other) {
            return this == other || (other instanceof Default);
        }

        public int hashCode() {
            return -457797443;
        }

        public String toString() {
            return "Default";
        }

        private Default() {
        }
    }

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount$NotionalBased;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount;", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboRequestAmount$NotionalBased, reason: from toString */
    public static final /* data */ class NotionalBased implements StreamComboQuoteUseCase4 {
        public static final int $stable = 8;
        private final BigDecimal amount;

        /* JADX WARN: Multi-variable type inference failed */
        public NotionalBased() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotionalBased copy$default(NotionalBased notionalBased, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = notionalBased.amount;
            }
            return notionalBased.copy(bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final NotionalBased copy(BigDecimal amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new NotionalBased(amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotionalBased) && Intrinsics.areEqual(this.amount, ((NotionalBased) other).amount);
        }

        public int hashCode() {
            return this.amount.hashCode();
        }

        public String toString() {
            return "NotionalBased(amount=" + this.amount + ")";
        }

        public NotionalBased(BigDecimal amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.amount = amount;
        }

        public /* synthetic */ NotionalBased(BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BigDecimal.TEN : bigDecimal);
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }
    }

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount$QuantityBased;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount;", "quantity", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getQuantity", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboRequestAmount$QuantityBased, reason: from toString */
    public static final /* data */ class QuantityBased implements StreamComboQuoteUseCase4 {
        public static final int $stable = 8;
        private final BigDecimal quantity;

        public static /* synthetic */ QuantityBased copy$default(QuantityBased quantityBased, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = quantityBased.quantity;
            }
            return quantityBased.copy(bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final QuantityBased copy(BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            return new QuantityBased(quantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QuantityBased) && Intrinsics.areEqual(this.quantity, ((QuantityBased) other).quantity);
        }

        public int hashCode() {
            return this.quantity.hashCode();
        }

        public String toString() {
            return "QuantityBased(quantity=" + this.quantity + ")";
        }

        public QuantityBased(BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.quantity = quantity;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }
    }
}
