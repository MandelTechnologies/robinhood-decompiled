package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.init.p418ui.StripeUiCustomization;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentAuthConfig.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0004\n\t\u000b\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/PaymentAuthConfig;", "", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "stripe3ds2Config", "<init>", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;)V", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "getStripe3ds2Config$payments_core_release", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "Companion", "Builder", "Stripe3ds2Config", "Stripe3ds2UiCustomization", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PaymentAuthConfig {
    private static PaymentAuthConfig instance;
    private final Stripe3ds2Config stripe3ds2Config;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final PaymentAuthConfig DEFAULT = new Builder().set3ds2Config(new Stripe3ds2Config.Builder().build()).build();

    public /* synthetic */ PaymentAuthConfig(Stripe3ds2Config stripe3ds2Config, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripe3ds2Config);
    }

    private PaymentAuthConfig(Stripe3ds2Config stripe3ds2Config) {
        this.stripe3ds2Config = stripe3ds2Config;
    }

    /* renamed from: getStripe3ds2Config$payments_core_release, reason: from getter */
    public final Stripe3ds2Config getStripe3ds2Config() {
        return this.stripe3ds2Config;
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/PaymentAuthConfig$Builder;", "", "()V", "stripe3ds2Config", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "build", "Lcom/stripe/android/PaymentAuthConfig;", "set3ds2Config", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Builder {
        private Stripe3ds2Config stripe3ds2Config;

        public final Builder set3ds2Config(Stripe3ds2Config stripe3ds2Config) {
            Intrinsics.checkNotNullParameter(stripe3ds2Config, "stripe3ds2Config");
            this.stripe3ds2Config = stripe3ds2Config;
            return this;
        }

        public final PaymentAuthConfig build() {
            Stripe3ds2Config stripe3ds2Config = this.stripe3ds2Config;
            if (stripe3ds2Config != null) {
                return new PaymentAuthConfig(stripe3ds2Config, null);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u001b\b\u0000\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "Landroid/os/Parcelable;", "", "timeout", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "uiCustomization", "<init>", "(ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)V", "", "checkValidTimeout", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getTimeout$payments_core_release", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "getUiCustomization$payments_core_release", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "Companion", "Builder", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Stripe3ds2Config implements Parcelable {
        private final int timeout;
        private final Stripe3ds2UiCustomization uiCustomization;
        public static final int $stable = 8;
        public static final Parcelable.Creator<Stripe3ds2Config> CREATOR = new Creator();

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Stripe3ds2Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2Config createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stripe3ds2Config(parcel.readInt(), Stripe3ds2UiCustomization.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2Config[] newArray(int i) {
                return new Stripe3ds2Config[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stripe3ds2Config)) {
                return false;
            }
            Stripe3ds2Config stripe3ds2Config = (Stripe3ds2Config) other;
            return this.timeout == stripe3ds2Config.timeout && Intrinsics.areEqual(this.uiCustomization, stripe3ds2Config.uiCustomization);
        }

        public int hashCode() {
            return (Integer.hashCode(this.timeout) * 31) + this.uiCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2Config(timeout=" + this.timeout + ", uiCustomization=" + this.uiCustomization + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.timeout);
            this.uiCustomization.writeToParcel(parcel, flags);
        }

        public Stripe3ds2Config(int i, Stripe3ds2UiCustomization uiCustomization) {
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            this.timeout = i;
            this.uiCustomization = uiCustomization;
            checkValidTimeout(i);
        }

        /* renamed from: getTimeout$payments_core_release, reason: from getter */
        public final int getTimeout() {
            return this.timeout;
        }

        /* renamed from: getUiCustomization$payments_core_release, reason: from getter */
        public final Stripe3ds2UiCustomization getUiCustomization() {
            return this.uiCustomization;
        }

        private final void checkValidTimeout(int timeout) {
            if (timeout < 5 || timeout > 99) {
                throw new IllegalArgumentException("Timeout value must be between 5 and 99, inclusive");
            }
        }

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;", "", "<init>", "()V", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "build", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "", "timeout", "I", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "uiCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Builder {
            private int timeout = 5;
            private Stripe3ds2UiCustomization uiCustomization = new Stripe3ds2UiCustomization.Builder().build();

            public final Stripe3ds2Config build() {
                return new Stripe3ds2Config(this.timeout, this.uiCustomization);
            }
        }
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "Landroid/os/Parcelable;", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "getUiCustomization", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "Builder", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Stripe3ds2UiCustomization implements Parcelable {
        public static final Parcelable.Creator<Stripe3ds2UiCustomization> CREATOR = new Creator();
        private final StripeUiCustomization uiCustomization;

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Stripe3ds2UiCustomization> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2UiCustomization createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stripe3ds2UiCustomization((StripeUiCustomization) parcel.readParcelable(Stripe3ds2UiCustomization.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2UiCustomization[] newArray(int i) {
                return new Stripe3ds2UiCustomization[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe3ds2UiCustomization) && Intrinsics.areEqual(this.uiCustomization, ((Stripe3ds2UiCustomization) other).uiCustomization);
        }

        public int hashCode() {
            return this.uiCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2UiCustomization(uiCustomization=" + this.uiCustomization + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.uiCustomization, flags);
        }

        public Stripe3ds2UiCustomization(StripeUiCustomization uiCustomization) {
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            this.uiCustomization = uiCustomization;
        }

        public final StripeUiCustomization getUiCustomization() {
            return this.uiCustomization;
        }

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V", "()V", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "build", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Builder {
            private final StripeUiCustomization uiCustomization;
            public static final int $stable = 8;

            private Builder(StripeUiCustomization stripeUiCustomization) {
                this.uiCustomization = stripeUiCustomization;
            }

            public Builder() {
                this(new StripeUiCustomization());
            }

            public final Stripe3ds2UiCustomization build() {
                return new Stripe3ds2UiCustomization(this.uiCustomization);
            }
        }
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/PaymentAuthConfig$Companion;", "", "<init>", "()V", "Lcom/stripe/android/PaymentAuthConfig;", "get", "()Lcom/stripe/android/PaymentAuthConfig;", "DEFAULT", "Lcom/stripe/android/PaymentAuthConfig;", "instance", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PaymentAuthConfig get() {
            PaymentAuthConfig paymentAuthConfig = PaymentAuthConfig.instance;
            return paymentAuthConfig == null ? PaymentAuthConfig.DEFAULT : paymentAuthConfig;
        }
    }
}
