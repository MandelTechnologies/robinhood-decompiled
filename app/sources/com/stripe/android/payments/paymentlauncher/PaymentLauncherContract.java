package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.Bundle2;
import androidx.view.result.contract.ActivityResultContract;
import com.stripe.android.model.ConfirmStripeIntentParams;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentLauncherContract.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class PaymentLauncherContract extends ActivityResultContract<Args, InternalPaymentResult> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) PaymentLauncherConfirmationActivity.class).putExtras(input.toBundle());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public InternalPaymentResult parseResult(int resultCode, Intent intent) {
        return InternalPaymentResult.INSTANCE.fromIntent(intent);
    }

    /* compiled from: PaymentLauncherContract.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 !2\u00020\u0001:\u0004!\"#$BE\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0001\u0003%&'¨\u0006("}, m3636d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "Landroid/os/Parcelable;", "", "publishableKey", "stripeAccountId", "", "enableLogging", "", "productUsage", "includePaymentSheetNextHandlers", "", "statusBarColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLjava/lang/Integer;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Ljava/lang/String;", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "Z", "getEnableLogging", "()Z", "Ljava/util/Set;", "getProductUsage", "()Ljava/util/Set;", "getIncludePaymentSheetNextHandlers", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "Companion", "IntentConfirmationArgs", "PaymentIntentNextActionArgs", "SetupIntentNextActionArgs", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class Args implements Parcelable {
        private final boolean enableLogging;
        private final boolean includePaymentSheetNextHandlers;
        private final Set<String> productUsage;
        private final String publishableKey;
        private Integer statusBarColor;
        private final String stripeAccountId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Args(String str, String str2, boolean z, Set set, boolean z2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, set, z2, num);
        }

        private Args(String str, String str2, boolean z, Set<String> set, boolean z2, Integer num) {
            this.publishableKey = str;
            this.stripeAccountId = str2;
            this.enableLogging = z;
            this.productUsage = set;
            this.includePaymentSheetNextHandlers = z2;
            this.statusBarColor = num;
        }

        public String getPublishableKey() {
            return this.publishableKey;
        }

        public String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public boolean getEnableLogging() {
            return this.enableLogging;
        }

        public Set<String> getProductUsage() {
            return this.productUsage;
        }

        public boolean getIncludePaymentSheetNextHandlers() {
            return this.includePaymentSheetNextHandlers;
        }

        public Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final Bundle toBundle() {
            return Bundle2.bundleOf(Tuples4.m3642to("extra_args", this));
        }

        /* compiled from: PaymentLauncherContract.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, m3636d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "", "publishableKey", "stripeAccountId", "", "enableLogging", "", "productUsage", "includePaymentSheetNextHandlers", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "confirmStripeIntentParams", "", "statusBarColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "Z", "getEnableLogging", "()Z", "Ljava/util/Set;", "getProductUsage", "()Ljava/util/Set;", "getIncludePaymentSheetNextHandlers", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "getConfirmStripeIntentParams", "()Lcom/stripe/android/model/ConfirmStripeIntentParams;", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class IntentConfirmationArgs extends Args {
            public static final Parcelable.Creator<IntentConfirmationArgs> CREATOR = new Creator();
            private final ConfirmStripeIntentParams confirmStripeIntentParams;
            private final boolean enableLogging;
            private final boolean includePaymentSheetNextHandlers;
            private final Set<String> productUsage;
            private final String publishableKey;
            private Integer statusBarColor;
            private final String stripeAccountId;

            /* compiled from: PaymentLauncherContract.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<IntentConfirmationArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IntentConfirmationArgs createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    boolean z2 = true;
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new IntentConfirmationArgs(string2, string3, z2, linkedHashSet, parcel.readInt() != 0 ? z : false, (ConfirmStripeIntentParams) parcel.readParcelable(IntentConfirmationArgs.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IntentConfirmationArgs[] newArray(int i) {
                    return new IntentConfirmationArgs[i];
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
                if (!(other instanceof IntentConfirmationArgs)) {
                    return false;
                }
                IntentConfirmationArgs intentConfirmationArgs = (IntentConfirmationArgs) other;
                return Intrinsics.areEqual(this.publishableKey, intentConfirmationArgs.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, intentConfirmationArgs.stripeAccountId) && this.enableLogging == intentConfirmationArgs.enableLogging && Intrinsics.areEqual(this.productUsage, intentConfirmationArgs.productUsage) && this.includePaymentSheetNextHandlers == intentConfirmationArgs.includePaymentSheetNextHandlers && Intrinsics.areEqual(this.confirmStripeIntentParams, intentConfirmationArgs.confirmStripeIntentParams) && Intrinsics.areEqual(this.statusBarColor, intentConfirmationArgs.statusBarColor);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enableLogging)) * 31) + this.productUsage.hashCode()) * 31) + Boolean.hashCode(this.includePaymentSheetNextHandlers)) * 31) + this.confirmStripeIntentParams.hashCode()) * 31;
                Integer num = this.statusBarColor;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "IntentConfirmationArgs(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", enableLogging=" + this.enableLogging + ", productUsage=" + this.productUsage + ", includePaymentSheetNextHandlers=" + this.includePaymentSheetNextHandlers + ", confirmStripeIntentParams=" + this.confirmStripeIntentParams + ", statusBarColor=" + this.statusBarColor + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
                parcel.writeInt(this.includePaymentSheetNextHandlers ? 1 : 0);
                parcel.writeParcelable(this.confirmStripeIntentParams, flags);
                Integer num = this.statusBarColor;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Set<String> getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getIncludePaymentSheetNextHandlers() {
                return this.includePaymentSheetNextHandlers;
            }

            public final ConfirmStripeIntentParams getConfirmStripeIntentParams() {
                return this.confirmStripeIntentParams;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IntentConfirmationArgs(String publishableKey, String str, boolean z, Set<String> productUsage, boolean z2, ConfirmStripeIntentParams confirmStripeIntentParams, Integer num) {
                super(publishableKey, str, z, productUsage, z2, num, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(confirmStripeIntentParams, "confirmStripeIntentParams");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z;
                this.productUsage = productUsage;
                this.includePaymentSheetNextHandlers = z2;
                this.confirmStripeIntentParams = confirmStripeIntentParams;
                this.statusBarColor = num;
            }
        }

        /* compiled from: PaymentLauncherContract.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b(\u0010\u0010R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, m3636d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "", "publishableKey", "stripeAccountId", "", "enableLogging", "", "productUsage", "includePaymentSheetNextHandlers", "paymentIntentClientSecret", "", "statusBarColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLjava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "Z", "getEnableLogging", "()Z", "Ljava/util/Set;", "getProductUsage", "()Ljava/util/Set;", "getIncludePaymentSheetNextHandlers", "getPaymentIntentClientSecret", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class PaymentIntentNextActionArgs extends Args {
            public static final Parcelable.Creator<PaymentIntentNextActionArgs> CREATOR = new Creator();
            private final boolean enableLogging;
            private final boolean includePaymentSheetNextHandlers;
            private final String paymentIntentClientSecret;
            private final Set<String> productUsage;
            private final String publishableKey;
            private Integer statusBarColor;
            private final String stripeAccountId;

            /* compiled from: PaymentLauncherContract.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<PaymentIntentNextActionArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentNextActionArgs createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    boolean z2 = true;
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new PaymentIntentNextActionArgs(string2, string3, z2, linkedHashSet, parcel.readInt() != 0 ? z : false, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentNextActionArgs[] newArray(int i) {
                    return new PaymentIntentNextActionArgs[i];
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
                if (!(other instanceof PaymentIntentNextActionArgs)) {
                    return false;
                }
                PaymentIntentNextActionArgs paymentIntentNextActionArgs = (PaymentIntentNextActionArgs) other;
                return Intrinsics.areEqual(this.publishableKey, paymentIntentNextActionArgs.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, paymentIntentNextActionArgs.stripeAccountId) && this.enableLogging == paymentIntentNextActionArgs.enableLogging && Intrinsics.areEqual(this.productUsage, paymentIntentNextActionArgs.productUsage) && this.includePaymentSheetNextHandlers == paymentIntentNextActionArgs.includePaymentSheetNextHandlers && Intrinsics.areEqual(this.paymentIntentClientSecret, paymentIntentNextActionArgs.paymentIntentClientSecret) && Intrinsics.areEqual(this.statusBarColor, paymentIntentNextActionArgs.statusBarColor);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enableLogging)) * 31) + this.productUsage.hashCode()) * 31) + Boolean.hashCode(this.includePaymentSheetNextHandlers)) * 31) + this.paymentIntentClientSecret.hashCode()) * 31;
                Integer num = this.statusBarColor;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "PaymentIntentNextActionArgs(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", enableLogging=" + this.enableLogging + ", productUsage=" + this.productUsage + ", includePaymentSheetNextHandlers=" + this.includePaymentSheetNextHandlers + ", paymentIntentClientSecret=" + this.paymentIntentClientSecret + ", statusBarColor=" + this.statusBarColor + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
                parcel.writeInt(this.includePaymentSheetNextHandlers ? 1 : 0);
                parcel.writeString(this.paymentIntentClientSecret);
                Integer num = this.statusBarColor;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Set<String> getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getIncludePaymentSheetNextHandlers() {
                return this.includePaymentSheetNextHandlers;
            }

            public final String getPaymentIntentClientSecret() {
                return this.paymentIntentClientSecret;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentIntentNextActionArgs(String publishableKey, String str, boolean z, Set<String> productUsage, boolean z2, String paymentIntentClientSecret, Integer num) {
                super(publishableKey, str, z, productUsage, z2, num, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z;
                this.productUsage = productUsage;
                this.includePaymentSheetNextHandlers = z2;
                this.paymentIntentClientSecret = paymentIntentClientSecret;
                this.statusBarColor = num;
            }
        }

        /* compiled from: PaymentLauncherContract.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b(\u0010\u0010R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, m3636d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "", "publishableKey", "stripeAccountId", "", "enableLogging", "", "productUsage", "includePaymentSheetNextHandlers", "setupIntentClientSecret", "", "statusBarColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLjava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "Z", "getEnableLogging", "()Z", "Ljava/util/Set;", "getProductUsage", "()Ljava/util/Set;", "getIncludePaymentSheetNextHandlers", "getSetupIntentClientSecret", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class SetupIntentNextActionArgs extends Args {
            public static final Parcelable.Creator<SetupIntentNextActionArgs> CREATOR = new Creator();
            private final boolean enableLogging;
            private final boolean includePaymentSheetNextHandlers;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final String setupIntentClientSecret;
            private Integer statusBarColor;
            private final String stripeAccountId;

            /* compiled from: PaymentLauncherContract.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<SetupIntentNextActionArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentNextActionArgs createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    boolean z2 = true;
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new SetupIntentNextActionArgs(string2, string3, z2, linkedHashSet, parcel.readInt() != 0 ? z : false, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentNextActionArgs[] newArray(int i) {
                    return new SetupIntentNextActionArgs[i];
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
                if (!(other instanceof SetupIntentNextActionArgs)) {
                    return false;
                }
                SetupIntentNextActionArgs setupIntentNextActionArgs = (SetupIntentNextActionArgs) other;
                return Intrinsics.areEqual(this.publishableKey, setupIntentNextActionArgs.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, setupIntentNextActionArgs.stripeAccountId) && this.enableLogging == setupIntentNextActionArgs.enableLogging && Intrinsics.areEqual(this.productUsage, setupIntentNextActionArgs.productUsage) && this.includePaymentSheetNextHandlers == setupIntentNextActionArgs.includePaymentSheetNextHandlers && Intrinsics.areEqual(this.setupIntentClientSecret, setupIntentNextActionArgs.setupIntentClientSecret) && Intrinsics.areEqual(this.statusBarColor, setupIntentNextActionArgs.statusBarColor);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enableLogging)) * 31) + this.productUsage.hashCode()) * 31) + Boolean.hashCode(this.includePaymentSheetNextHandlers)) * 31) + this.setupIntentClientSecret.hashCode()) * 31;
                Integer num = this.statusBarColor;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "SetupIntentNextActionArgs(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", enableLogging=" + this.enableLogging + ", productUsage=" + this.productUsage + ", includePaymentSheetNextHandlers=" + this.includePaymentSheetNextHandlers + ", setupIntentClientSecret=" + this.setupIntentClientSecret + ", statusBarColor=" + this.statusBarColor + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
                parcel.writeInt(this.includePaymentSheetNextHandlers ? 1 : 0);
                parcel.writeString(this.setupIntentClientSecret);
                Integer num = this.statusBarColor;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Set<String> getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public boolean getIncludePaymentSheetNextHandlers() {
                return this.includePaymentSheetNextHandlers;
            }

            public final String getSetupIntentClientSecret() {
                return this.setupIntentClientSecret;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupIntentNextActionArgs(String publishableKey, String str, boolean z, Set<String> productUsage, boolean z2, String setupIntentClientSecret, Integer num) {
                super(publishableKey, str, z, productUsage, z2, num, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z;
                this.productUsage = productUsage;
                this.includePaymentSheetNextHandlers = z2;
                this.setupIntentClientSecret = setupIntentClientSecret;
                this.statusBarColor = num;
            }
        }

        /* compiled from: PaymentLauncherContract.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$Companion;", "", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "intent", "Landroid/content/Intent;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
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
