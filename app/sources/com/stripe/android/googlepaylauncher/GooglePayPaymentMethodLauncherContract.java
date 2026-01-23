package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.result.contract.ActivityResultContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayPaymentMethodLauncherContract.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class GooglePayPaymentMethodLauncherContract extends ActivityResultContract<Args, GooglePayPaymentMethodLauncher3> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) GooglePayPaymentMethodLauncherActivity.class).putExtras(GooglePayPaymentMethodLauncherContract2.toV2(input).toBundle$payments_core_release());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public GooglePayPaymentMethodLauncher3 parseResult(int resultCode, Intent intent) {
        GooglePayPaymentMethodLauncher3 googlePayPaymentMethodLauncher3 = intent != null ? (GooglePayPaymentMethodLauncher3) intent.getParcelableExtra("extra_result") : null;
        return googlePayPaymentMethodLauncher3 == null ? new GooglePayPaymentMethodLauncher3.Failed(new IllegalArgumentException("Could not parse a valid result."), 1) : googlePayPaymentMethodLauncher3;
    }

    /* compiled from: GooglePayPaymentMethodLauncherContract.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002()B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "Landroid/os/Parcelable;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "config", "", "currencyCode", "", "amount", "transactionId", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;", "injectionParams", "<init>", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "getConfig$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "Ljava/lang/String;", "getCurrencyCode$payments_core_release", "I", "getAmount$payments_core_release", "getTransactionId$payments_core_release", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;", "getInjectionParams$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;", "Companion", "InjectionParams", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private final int amount;
        private final Config config;
        private final String currencyCode;
        private final InjectionParams injectionParams;
        private final String transactionId;
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        /* compiled from: GooglePayPaymentMethodLauncherContract.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(Config.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : InjectionParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
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
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.currencyCode, args.currencyCode) && this.amount == args.amount && Intrinsics.areEqual(this.transactionId, args.transactionId) && Intrinsics.areEqual(this.injectionParams, args.injectionParams);
        }

        public int hashCode() {
            int iHashCode = ((((this.config.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + Integer.hashCode(this.amount)) * 31;
            String str = this.transactionId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            InjectionParams injectionParams = this.injectionParams;
            return iHashCode2 + (injectionParams != null ? injectionParams.hashCode() : 0);
        }

        public String toString() {
            return "Args(config=" + this.config + ", currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", transactionId=" + this.transactionId + ", injectionParams=" + this.injectionParams + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.config.writeToParcel(parcel, flags);
            parcel.writeString(this.currencyCode);
            parcel.writeInt(this.amount);
            parcel.writeString(this.transactionId);
            InjectionParams injectionParams = this.injectionParams;
            if (injectionParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                injectionParams.writeToParcel(parcel, flags);
            }
        }

        public Args(Config config, String currencyCode, int i, String str, InjectionParams injectionParams) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.config = config;
            this.currencyCode = currencyCode;
            this.amount = i;
            this.transactionId = str;
            this.injectionParams = injectionParams;
        }

        /* renamed from: getConfig$payments_core_release, reason: from getter */
        public final Config getConfig() {
            return this.config;
        }

        /* renamed from: getCurrencyCode$payments_core_release, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: getAmount$payments_core_release, reason: from getter */
        public final int getAmount() {
            return this.amount;
        }

        /* renamed from: getTransactionId$payments_core_release, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        /* compiled from: GooglePayPaymentMethodLauncherContract.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b$\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b%\u0010\r¨\u0006&"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;", "Landroid/os/Parcelable;", "", "injectorKey", "", "productUsage", "", "enableLogging", "publishableKey", "stripeAccountId", "<init>", "(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getInjectorKey", "Ljava/util/Set;", "getProductUsage", "()Ljava/util/Set;", "Z", "getEnableLogging", "()Z", "getPublishableKey", "getStripeAccountId", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class InjectionParams implements Parcelable {
            public static final Parcelable.Creator<InjectionParams> CREATOR = new Creator();
            private final boolean enableLogging;
            private final String injectorKey;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final String stripeAccountId;

            /* compiled from: GooglePayPaymentMethodLauncherContract.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<InjectionParams> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InjectionParams createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new InjectionParams(string2, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InjectionParams[] newArray(int i) {
                    return new InjectionParams[i];
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
                if (!(other instanceof InjectionParams)) {
                    return false;
                }
                InjectionParams injectionParams = (InjectionParams) other;
                return Intrinsics.areEqual(this.injectorKey, injectionParams.injectorKey) && Intrinsics.areEqual(this.productUsage, injectionParams.productUsage) && this.enableLogging == injectionParams.enableLogging && Intrinsics.areEqual(this.publishableKey, injectionParams.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, injectionParams.stripeAccountId);
            }

            public int hashCode() {
                int iHashCode = ((((((this.injectorKey.hashCode() * 31) + this.productUsage.hashCode()) * 31) + Boolean.hashCode(this.enableLogging)) * 31) + this.publishableKey.hashCode()) * 31;
                String str = this.stripeAccountId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "InjectionParams(injectorKey=" + this.injectorKey + ", productUsage=" + this.productUsage + ", enableLogging=" + this.enableLogging + ", publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.injectorKey);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
                parcel.writeInt(this.enableLogging ? 1 : 0);
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
            }

            public InjectionParams(String injectorKey, Set<String> productUsage, boolean z, String publishableKey, String str) {
                Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                this.injectorKey = injectorKey;
                this.productUsage = productUsage;
                this.enableLogging = z;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
            }
        }
    }
}
