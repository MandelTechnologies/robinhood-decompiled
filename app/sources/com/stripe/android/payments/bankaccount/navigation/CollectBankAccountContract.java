package com.stripe.android.payments.bankaccount.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.Bundle2;
import androidx.view.result.contract.ActivityResultContract;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.bankaccount.p417ui.CollectBankAccountActivity;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountContract.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u000e\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "Companion", "Result", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class CollectBankAccountContract extends ActivityResultContract<Args, CollectBankAccountResultInternal> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) CollectBankAccountActivity.class).putExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args", input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public CollectBankAccountResultInternal parseResult(int resultCode, Intent intent) {
        Result result;
        CollectBankAccountResultInternal collectBankAccountResult = (intent == null || (result = (Result) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result")) == null) ? null : result.getCollectBankAccountResult();
        return collectBankAccountResult == null ? new CollectBankAccountResultInternal.Failed(new IllegalArgumentException("Failed to retrieve a CollectBankAccountResult.")) : collectBankAccountResult;
    }

    /* compiled from: CollectBankAccountContract.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\u0005\u0019\u001a\u001b\u001c\u001dB?\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0018\u0010\u000f\u0082\u0001\u0004\u001e\u001f !¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "Landroid/os/Parcelable;", "", "publishableKey", "stripeAccountId", "clientSecret", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "attachToIntent", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;ZLjava/lang/String;)V", "Ljava/lang/String;", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "getClientSecret", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "Z", "getAttachToIntent", "()Z", "getHostedSurface", "Companion", "ForDeferredPaymentIntent", "ForDeferredSetupIntent", "ForPaymentIntent", "ForSetupIntent", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class Args implements Parcelable {
        private final boolean attachToIntent;
        private final String clientSecret;
        private final CollectBankAccountLauncher configuration;
        private final String hostedSurface;
        private final String publishableKey;
        private final String stripeAccountId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Args(String str, String str2, String str3, CollectBankAccountLauncher collectBankAccountLauncher, boolean z, String str4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, collectBankAccountLauncher, z, str4);
        }

        private Args(String str, String str2, String str3, CollectBankAccountLauncher collectBankAccountLauncher, boolean z, String str4) {
            this.publishableKey = str;
            this.stripeAccountId = str2;
            this.clientSecret = str3;
            this.configuration = collectBankAccountLauncher;
            this.attachToIntent = z;
            this.hostedSurface = str4;
        }

        public String getPublishableKey() {
            return this.publishableKey;
        }

        public String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public String getClientSecret() {
            return this.clientSecret;
        }

        public CollectBankAccountLauncher getConfiguration() {
            return this.configuration;
        }

        public boolean getAttachToIntent() {
            return this.attachToIntent;
        }

        public String getHostedSurface() {
            return this.hostedSurface;
        }

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b'\u0010\u000e¨\u0006("}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "", "publishableKey", "stripeAccountId", "clientSecret", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "attachToIntent", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "getClientSecret", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "Z", "getAttachToIntent", "()Z", "getHostedSurface", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class ForPaymentIntent extends Args {
            public static final Parcelable.Creator<ForPaymentIntent> CREATOR = new Creator();
            private final boolean attachToIntent;
            private final String clientSecret;
            private final CollectBankAccountLauncher configuration;
            private final String hostedSurface;
            private final String publishableKey;
            private final String stripeAccountId;

            /* compiled from: CollectBankAccountContract.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ForPaymentIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForPaymentIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ForPaymentIntent(parcel.readString(), parcel.readString(), parcel.readString(), (CollectBankAccountLauncher) parcel.readParcelable(ForPaymentIntent.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForPaymentIntent[] newArray(int i) {
                    return new ForPaymentIntent[i];
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
                if (!(other instanceof ForPaymentIntent)) {
                    return false;
                }
                ForPaymentIntent forPaymentIntent = (ForPaymentIntent) other;
                return Intrinsics.areEqual(this.publishableKey, forPaymentIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forPaymentIntent.stripeAccountId) && Intrinsics.areEqual(this.clientSecret, forPaymentIntent.clientSecret) && Intrinsics.areEqual(this.configuration, forPaymentIntent.configuration) && this.attachToIntent == forPaymentIntent.attachToIntent && Intrinsics.areEqual(this.hostedSurface, forPaymentIntent.hostedSurface);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.clientSecret.hashCode()) * 31) + this.configuration.hashCode()) * 31) + Boolean.hashCode(this.attachToIntent)) * 31;
                String str2 = this.hostedSurface;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "ForPaymentIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", clientSecret=" + this.clientSecret + ", configuration=" + this.configuration + ", attachToIntent=" + this.attachToIntent + ", hostedSurface=" + this.hostedSurface + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeString(this.clientSecret);
                parcel.writeParcelable(this.configuration, flags);
                parcel.writeInt(this.attachToIntent ? 1 : 0);
                parcel.writeString(this.hostedSurface);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getClientSecret() {
                return this.clientSecret;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountLauncher getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForPaymentIntent(String publishableKey, String str, String clientSecret, CollectBankAccountLauncher configuration, boolean z, String str2) {
                super(publishableKey, str, clientSecret, configuration, z, str2, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.clientSecret = clientSecret;
                this.configuration = configuration;
                this.attachToIntent = z;
                this.hostedSurface = str2;
            }
        }

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b'\u0010\u000e¨\u0006("}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "", "publishableKey", "stripeAccountId", "clientSecret", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "attachToIntent", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "getClientSecret", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "Z", "getAttachToIntent", "()Z", "getHostedSurface", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class ForSetupIntent extends Args {
            public static final Parcelable.Creator<ForSetupIntent> CREATOR = new Creator();
            private final boolean attachToIntent;
            private final String clientSecret;
            private final CollectBankAccountLauncher configuration;
            private final String hostedSurface;
            private final String publishableKey;
            private final String stripeAccountId;

            /* compiled from: CollectBankAccountContract.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ForSetupIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForSetupIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ForSetupIntent(parcel.readString(), parcel.readString(), parcel.readString(), (CollectBankAccountLauncher) parcel.readParcelable(ForSetupIntent.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForSetupIntent[] newArray(int i) {
                    return new ForSetupIntent[i];
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
                if (!(other instanceof ForSetupIntent)) {
                    return false;
                }
                ForSetupIntent forSetupIntent = (ForSetupIntent) other;
                return Intrinsics.areEqual(this.publishableKey, forSetupIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forSetupIntent.stripeAccountId) && Intrinsics.areEqual(this.clientSecret, forSetupIntent.clientSecret) && Intrinsics.areEqual(this.configuration, forSetupIntent.configuration) && this.attachToIntent == forSetupIntent.attachToIntent && Intrinsics.areEqual(this.hostedSurface, forSetupIntent.hostedSurface);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.clientSecret.hashCode()) * 31) + this.configuration.hashCode()) * 31) + Boolean.hashCode(this.attachToIntent)) * 31;
                String str2 = this.hostedSurface;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "ForSetupIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", clientSecret=" + this.clientSecret + ", configuration=" + this.configuration + ", attachToIntent=" + this.attachToIntent + ", hostedSurface=" + this.hostedSurface + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeString(this.clientSecret);
                parcel.writeParcelable(this.configuration, flags);
                parcel.writeInt(this.attachToIntent ? 1 : 0);
                parcel.writeString(this.hostedSurface);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getClientSecret() {
                return this.clientSecret;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountLauncher getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForSetupIntent(String publishableKey, String str, String clientSecret, CollectBankAccountLauncher configuration, boolean z, String str2) {
                super(publishableKey, str, clientSecret, configuration, z, str2, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.clientSecret = clientSecret;
                this.configuration = configuration;
                this.attachToIntent = z;
                this.hostedSurface = str2;
            }
        }

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b&\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b'\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b(\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b)\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b-\u0010\u0011¨\u0006."}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "", "publishableKey", "stripeAccountId", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "hostedSurface", "elementsSessionId", "customerId", "onBehalfOf", "", "amount", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getHostedSurface", "getElementsSessionId", "getCustomerId", "getOnBehalfOf", "Ljava/lang/Integer;", "getAmount", "()Ljava/lang/Integer;", "getCurrency", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class ForDeferredPaymentIntent extends Args {
            public static final Parcelable.Creator<ForDeferredPaymentIntent> CREATOR = new Creator();
            private final Integer amount;
            private final CollectBankAccountLauncher configuration;
            private final String currency;
            private final String customerId;
            private final String elementsSessionId;
            private final String hostedSurface;
            private final String onBehalfOf;
            private final String publishableKey;
            private final String stripeAccountId;

            /* compiled from: CollectBankAccountContract.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ForDeferredPaymentIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForDeferredPaymentIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ForDeferredPaymentIntent(parcel.readString(), parcel.readString(), (CollectBankAccountLauncher) parcel.readParcelable(ForDeferredPaymentIntent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForDeferredPaymentIntent[] newArray(int i) {
                    return new ForDeferredPaymentIntent[i];
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
                if (!(other instanceof ForDeferredPaymentIntent)) {
                    return false;
                }
                ForDeferredPaymentIntent forDeferredPaymentIntent = (ForDeferredPaymentIntent) other;
                return Intrinsics.areEqual(this.publishableKey, forDeferredPaymentIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forDeferredPaymentIntent.stripeAccountId) && Intrinsics.areEqual(this.configuration, forDeferredPaymentIntent.configuration) && Intrinsics.areEqual(this.hostedSurface, forDeferredPaymentIntent.hostedSurface) && Intrinsics.areEqual(this.elementsSessionId, forDeferredPaymentIntent.elementsSessionId) && Intrinsics.areEqual(this.customerId, forDeferredPaymentIntent.customerId) && Intrinsics.areEqual(this.onBehalfOf, forDeferredPaymentIntent.onBehalfOf) && Intrinsics.areEqual(this.amount, forDeferredPaymentIntent.amount) && Intrinsics.areEqual(this.currency, forDeferredPaymentIntent.currency);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.configuration.hashCode()) * 31;
                String str2 = this.hostedSurface;
                int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.elementsSessionId.hashCode()) * 31;
                String str3 = this.customerId;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.onBehalfOf;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.amount;
                int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                String str5 = this.currency;
                return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
            }

            public String toString() {
                return "ForDeferredPaymentIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", configuration=" + this.configuration + ", hostedSurface=" + this.hostedSurface + ", elementsSessionId=" + this.elementsSessionId + ", customerId=" + this.customerId + ", onBehalfOf=" + this.onBehalfOf + ", amount=" + this.amount + ", currency=" + this.currency + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeParcelable(this.configuration, flags);
                parcel.writeString(this.hostedSurface);
                parcel.writeString(this.elementsSessionId);
                parcel.writeString(this.customerId);
                parcel.writeString(this.onBehalfOf);
                Integer num = this.amount;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
                parcel.writeString(this.currency);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountLauncher getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            public final String getElementsSessionId() {
                return this.elementsSessionId;
            }

            public final String getCustomerId() {
                return this.customerId;
            }

            public final String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            public final Integer getAmount() {
                return this.amount;
            }

            public final String getCurrency() {
                return this.currency;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForDeferredPaymentIntent(String publishableKey, String str, CollectBankAccountLauncher configuration, String str2, String elementsSessionId, String str3, String str4, Integer num, String str5) {
                super(publishableKey, str, null, configuration, false, str2, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.configuration = configuration;
                this.hostedSurface = str2;
                this.elementsSessionId = elementsSessionId;
                this.customerId = str3;
                this.onBehalfOf = str4;
                this.amount = num;
                this.currency = str5;
            }
        }

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b$\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b%\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b&\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b'\u0010\u000e¨\u0006("}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "", "publishableKey", "stripeAccountId", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "hostedSurface", "elementsSessionId", "customerId", "onBehalfOf", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getHostedSurface", "getElementsSessionId", "getCustomerId", "getOnBehalfOf", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class ForDeferredSetupIntent extends Args {
            public static final Parcelable.Creator<ForDeferredSetupIntent> CREATOR = new Creator();
            private final CollectBankAccountLauncher configuration;
            private final String customerId;
            private final String elementsSessionId;
            private final String hostedSurface;
            private final String onBehalfOf;
            private final String publishableKey;
            private final String stripeAccountId;

            /* compiled from: CollectBankAccountContract.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ForDeferredSetupIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForDeferredSetupIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ForDeferredSetupIntent(parcel.readString(), parcel.readString(), (CollectBankAccountLauncher) parcel.readParcelable(ForDeferredSetupIntent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForDeferredSetupIntent[] newArray(int i) {
                    return new ForDeferredSetupIntent[i];
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
                if (!(other instanceof ForDeferredSetupIntent)) {
                    return false;
                }
                ForDeferredSetupIntent forDeferredSetupIntent = (ForDeferredSetupIntent) other;
                return Intrinsics.areEqual(this.publishableKey, forDeferredSetupIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forDeferredSetupIntent.stripeAccountId) && Intrinsics.areEqual(this.configuration, forDeferredSetupIntent.configuration) && Intrinsics.areEqual(this.hostedSurface, forDeferredSetupIntent.hostedSurface) && Intrinsics.areEqual(this.elementsSessionId, forDeferredSetupIntent.elementsSessionId) && Intrinsics.areEqual(this.customerId, forDeferredSetupIntent.customerId) && Intrinsics.areEqual(this.onBehalfOf, forDeferredSetupIntent.onBehalfOf);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.configuration.hashCode()) * 31;
                String str2 = this.hostedSurface;
                int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.elementsSessionId.hashCode()) * 31;
                String str3 = this.customerId;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.onBehalfOf;
                return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                return "ForDeferredSetupIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", configuration=" + this.configuration + ", hostedSurface=" + this.hostedSurface + ", elementsSessionId=" + this.elementsSessionId + ", customerId=" + this.customerId + ", onBehalfOf=" + this.onBehalfOf + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeParcelable(this.configuration, flags);
                parcel.writeString(this.hostedSurface);
                parcel.writeString(this.elementsSessionId);
                parcel.writeString(this.customerId);
                parcel.writeString(this.onBehalfOf);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountLauncher getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            public final String getElementsSessionId() {
                return this.elementsSessionId;
            }

            public final String getCustomerId() {
                return this.customerId;
            }

            public final String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForDeferredSetupIntent(String publishableKey, String str, CollectBankAccountLauncher configuration, String str2, String elementsSessionId, String str3, String str4) {
                super(publishableKey, str, null, configuration, false, str2, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.configuration = configuration;
                this.hostedSurface = str2;
                this.elementsSessionId = elementsSessionId;
                this.customerId = str3;
                this.onBehalfOf = str4;
            }
        }

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "intent", "Landroid/content/Intent;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args");
            }
        }
    }

    /* compiled from: CollectBankAccountContract.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Result;", "Landroid/os/Parcelable;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "collectBankAccountResult", "<init>", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "getCollectBankAccountResult", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        private final CollectBankAccountResultInternal collectBankAccountResult;

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Result((CollectBankAccountResultInternal) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
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
            return (other instanceof Result) && Intrinsics.areEqual(this.collectBankAccountResult, ((Result) other).collectBankAccountResult);
        }

        public int hashCode() {
            return this.collectBankAccountResult.hashCode();
        }

        public String toString() {
            return "Result(collectBankAccountResult=" + this.collectBankAccountResult + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.collectBankAccountResult, flags);
        }

        public Result(CollectBankAccountResultInternal collectBankAccountResult) {
            Intrinsics.checkNotNullParameter(collectBankAccountResult, "collectBankAccountResult");
            this.collectBankAccountResult = collectBankAccountResult;
        }

        public final CollectBankAccountResultInternal getCollectBankAccountResult() {
            return this.collectBankAccountResult;
        }

        public final Bundle toBundle() {
            return Bundle2.bundleOf(Tuples4.m3642to("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result", this));
        }
    }
}
