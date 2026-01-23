package com.robinhood.shared.order.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.shared.order.type.OrderTypeDestinations3;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeDestinations.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/order/type/OrderTypeEducationDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/shared/order/type/OrderTypeEducationDest$Args;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Args", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.OrderTypeEducationDest, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeDestinations extends ComposableDestinationWithArgs<Args> {
    public static final OrderTypeDestinations INSTANCE = new OrderTypeDestinations();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<OrderTypeDestinations> CREATOR = new Creator();

    /* compiled from: OrderTypeDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.OrderTypeEducationDest$Creator */
    public static final class Creator implements Parcelable.Creator<OrderTypeDestinations> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderTypeDestinations createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return OrderTypeDestinations.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderTypeDestinations[] newArray(int i) {
            return new OrderTypeDestinations[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private OrderTypeDestinations() {
        super("order_type_education_dest", Args.class, null, null, null, 28, null);
    }

    /* compiled from: OrderTypeDestinations.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/order/type/OrderTypeEducationDest$Args;", "Landroid/os/Parcelable;", "priceInputArgs", "Lcom/robinhood/shared/order/type/OrderTypePriceInputDest$Args;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "popBackStackOnContinue", "", "<init>", "(Lcom/robinhood/shared/order/type/OrderTypePriceInputDest$Args;Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;Z)V", "getPriceInputArgs", "()Lcom/robinhood/shared/order/type/OrderTypePriceInputDest$Args;", "getConfiguration", "()Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "getPopBackStackOnContinue", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.OrderTypeEducationDest$Args, reason: from toString */
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration;
        private final boolean popBackStackOnContinue;
        private final OrderTypeDestinations3.Args priceInputArgs;

        /* compiled from: OrderTypeDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.order.type.OrderTypeEducationDest$Args$Creator */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(OrderTypeDestinations3.Args.CREATOR.createFromParcel(parcel), (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OrderTypeDestinations3.Args args2, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                args2 = args.priceInputArgs;
            }
            if ((i & 2) != 0) {
                orderTypeEducationConfiguration = args.configuration;
            }
            if ((i & 4) != 0) {
                z = args.popBackStackOnContinue;
            }
            return args.copy(args2, orderTypeEducationConfiguration, z);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderTypeDestinations3.Args getPriceInputArgs() {
            return this.priceInputArgs;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getPopBackStackOnContinue() {
            return this.popBackStackOnContinue;
        }

        public final Args copy(OrderTypeDestinations3.Args priceInputArgs, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration, boolean popBackStackOnContinue) {
            Intrinsics.checkNotNullParameter(priceInputArgs, "priceInputArgs");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new Args(priceInputArgs, configuration, popBackStackOnContinue);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.priceInputArgs, args.priceInputArgs) && Intrinsics.areEqual(this.configuration, args.configuration) && this.popBackStackOnContinue == args.popBackStackOnContinue;
        }

        public int hashCode() {
            return (((this.priceInputArgs.hashCode() * 31) + this.configuration.hashCode()) * 31) + Boolean.hashCode(this.popBackStackOnContinue);
        }

        public String toString() {
            return "Args(priceInputArgs=" + this.priceInputArgs + ", configuration=" + this.configuration + ", popBackStackOnContinue=" + this.popBackStackOnContinue + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.priceInputArgs.writeToParcel(dest, flags);
            dest.writeParcelable(this.configuration, flags);
            dest.writeInt(this.popBackStackOnContinue ? 1 : 0);
        }

        public Args(OrderTypeDestinations3.Args priceInputArgs, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration, boolean z) {
            Intrinsics.checkNotNullParameter(priceInputArgs, "priceInputArgs");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.priceInputArgs = priceInputArgs;
            this.configuration = configuration;
            this.popBackStackOnContinue = z;
        }

        public final OrderTypeDestinations3.Args getPriceInputArgs() {
            return this.priceInputArgs;
        }

        public final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration getConfiguration() {
            return this.configuration;
        }

        public final boolean getPopBackStackOnContinue() {
            return this.popBackStackOnContinue;
        }
    }
}
