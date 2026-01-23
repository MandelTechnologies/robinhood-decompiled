package com.stripe.android.payments.core.authentication.threeds2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.Bundle2;
import androidx.view.result.contract.ActivityResultContract;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stripe3ds2TransactionContract.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class Stripe3ds2TransactionContract extends ActivityResultContract<Args, Unvalidated> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) Stripe3ds2TransactionActivity.class).putExtras(input.toBundle());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public Unvalidated parseResult(int resultCode, Intent intent) {
        return Unvalidated.INSTANCE.fromIntent(intent);
    }

    /* compiled from: Stripe3ds2TransactionContract.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001FBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010\u001aR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010AR\u0011\u0010E\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006G"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Landroid/os/Parcelable;", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "config", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "nextActionData", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "", "enableLogging", "", "statusBarColor", "", "publishableKey", "", "productUsage", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;Lcom/stripe/android/core/networking/ApiRequest$Options;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/Set;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "getConfig", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "Lcom/stripe/android/model/StripeIntent;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getRequestOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "Z", "getEnableLogging", "()Z", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getPublishableKey", "Ljava/util/Set;", "getProductUsage", "()Ljava/util/Set;", "Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "getFingerprint", "()Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "fingerprint", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private final PaymentAuthConfig.Stripe3ds2Config config;
        private final boolean enableLogging;
        private final StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData;
        private final Set<String> productUsage;
        private final String publishableKey;
        private final ApiRequest.Options requestOptions;
        private final SdkTransactionId sdkTransactionId;
        private final Integer statusBarColor;
        private final StripeIntent stripeIntent;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        /* compiled from: Stripe3ds2TransactionContract.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                SdkTransactionId sdkTransactionId = (SdkTransactionId) parcel.readParcelable(Args.class.getClassLoader());
                PaymentAuthConfig.Stripe3ds2Config stripe3ds2ConfigCreateFromParcel = PaymentAuthConfig.Stripe3ds2Config.CREATOR.createFromParcel(parcel);
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(Args.class.getClassLoader());
                StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2CreateFromParcel = StripeIntent.NextActionData.SdkData.Use3DS2.CREATOR.createFromParcel(parcel);
                ApiRequest.Options options = (ApiRequest.Options) parcel.readParcelable(Args.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string2 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new Args(sdkTransactionId, stripe3ds2ConfigCreateFromParcel, stripeIntent, use3DS2CreateFromParcel, options, z, numValueOf, string2, linkedHashSet);
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
            return Intrinsics.areEqual(this.sdkTransactionId, args.sdkTransactionId) && Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.stripeIntent, args.stripeIntent) && Intrinsics.areEqual(this.nextActionData, args.nextActionData) && Intrinsics.areEqual(this.requestOptions, args.requestOptions) && this.enableLogging == args.enableLogging && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && Intrinsics.areEqual(this.publishableKey, args.publishableKey) && Intrinsics.areEqual(this.productUsage, args.productUsage);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.sdkTransactionId.hashCode() * 31) + this.config.hashCode()) * 31) + this.stripeIntent.hashCode()) * 31) + this.nextActionData.hashCode()) * 31) + this.requestOptions.hashCode()) * 31) + Boolean.hashCode(this.enableLogging)) * 31;
            Integer num = this.statusBarColor;
            return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.publishableKey.hashCode()) * 31) + this.productUsage.hashCode();
        }

        public String toString() {
            return "Args(sdkTransactionId=" + this.sdkTransactionId + ", config=" + this.config + ", stripeIntent=" + this.stripeIntent + ", nextActionData=" + this.nextActionData + ", requestOptions=" + this.requestOptions + ", enableLogging=" + this.enableLogging + ", statusBarColor=" + this.statusBarColor + ", publishableKey=" + this.publishableKey + ", productUsage=" + this.productUsage + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.sdkTransactionId, flags);
            this.config.writeToParcel(parcel, flags);
            parcel.writeParcelable(this.stripeIntent, flags);
            this.nextActionData.writeToParcel(parcel, flags);
            parcel.writeParcelable(this.requestOptions, flags);
            parcel.writeInt(this.enableLogging ? 1 : 0);
            Integer num = this.statusBarColor;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.publishableKey);
            Set<String> set = this.productUsage;
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
        }

        public Args(SdkTransactionId sdkTransactionId, PaymentAuthConfig.Stripe3ds2Config config, StripeIntent stripeIntent, StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData, ApiRequest.Options requestOptions, boolean z, Integer num, String publishableKey, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            Intrinsics.checkNotNullParameter(nextActionData, "nextActionData");
            Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            this.sdkTransactionId = sdkTransactionId;
            this.config = config;
            this.stripeIntent = stripeIntent;
            this.nextActionData = nextActionData;
            this.requestOptions = requestOptions;
            this.enableLogging = z;
            this.statusBarColor = num;
            this.publishableKey = publishableKey;
            this.productUsage = productUsage;
        }

        public final SdkTransactionId getSdkTransactionId() {
            return this.sdkTransactionId;
        }

        public final PaymentAuthConfig.Stripe3ds2Config getConfig() {
            return this.config;
        }

        public final StripeIntent getStripeIntent() {
            return this.stripeIntent;
        }

        public final StripeIntent.NextActionData.SdkData.Use3DS2 getNextActionData() {
            return this.nextActionData;
        }

        public final ApiRequest.Options getRequestOptions() {
            return this.requestOptions;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final Set<String> getProductUsage() {
            return this.productUsage;
        }

        public final Stripe3ds2Fingerprint getFingerprint() {
            return new Stripe3ds2Fingerprint(this.nextActionData);
        }

        public final Bundle toBundle() {
            return Bundle2.bundleOf(Tuples4.m3642to("extra_args", this));
        }

        /* compiled from: Stripe3ds2TransactionContract.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args$Companion;", "", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "intent", "Landroid/content/Intent;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_args");
            }
        }
    }
}
