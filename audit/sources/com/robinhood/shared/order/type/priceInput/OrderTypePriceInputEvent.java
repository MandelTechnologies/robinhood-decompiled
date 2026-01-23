package com.robinhood.shared.order.type.priceInput;

import com.robinhood.android.navigation.compose.destination.ComposeNav;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypePriceInputEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputEvent;", "", "<init>", "()V", "Navigate", "HandlePerpetualsError", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputEvent$HandlePerpetualsError;", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputEvent$Navigate;", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class OrderTypePriceInputEvent {
    public static final int $stable = 0;

    public /* synthetic */ OrderTypePriceInputEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OrderTypePriceInputEvent() {
    }

    /* compiled from: OrderTypePriceInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputEvent$Navigate;", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputEvent;", "composeNav", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "<init>", "(Lcom/robinhood/android/navigation/compose/destination/ComposeNav;)V", "getComposeNav", "()Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Navigate extends OrderTypePriceInputEvent {
        public static final int $stable = ComposeNav.$stable;
        private final ComposeNav composeNav;

        public static /* synthetic */ Navigate copy$default(Navigate navigate, ComposeNav composeNav, int i, Object obj) {
            if ((i & 1) != 0) {
                composeNav = navigate.composeNav;
            }
            return navigate.copy(composeNav);
        }

        /* renamed from: component1, reason: from getter */
        public final ComposeNav getComposeNav() {
            return this.composeNav;
        }

        public final Navigate copy(ComposeNav composeNav) {
            Intrinsics.checkNotNullParameter(composeNav, "composeNav");
            return new Navigate(composeNav);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Navigate) && Intrinsics.areEqual(this.composeNav, ((Navigate) other).composeNav);
        }

        public int hashCode() {
            return this.composeNav.hashCode();
        }

        public String toString() {
            return "Navigate(composeNav=" + this.composeNav + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Navigate(ComposeNav composeNav) {
            super(null);
            Intrinsics.checkNotNullParameter(composeNav, "composeNav");
            this.composeNav = composeNav;
        }

        public final ComposeNav getComposeNav() {
            return this.composeNav;
        }
    }

    /* compiled from: OrderTypePriceInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputEvent$HandlePerpetualsError;", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HandlePerpetualsError extends OrderTypePriceInputEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ HandlePerpetualsError copy$default(HandlePerpetualsError handlePerpetualsError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = handlePerpetualsError.throwable;
            }
            return handlePerpetualsError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final HandlePerpetualsError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new HandlePerpetualsError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandlePerpetualsError) && Intrinsics.areEqual(this.throwable, ((HandlePerpetualsError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "HandlePerpetualsError(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlePerpetualsError(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
