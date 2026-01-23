package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.Bundle2;
import androidx.view.result.contract.ActivityResultContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher3;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: GooglePayPaymentMethodLauncherContractV2.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class GooglePayPaymentMethodLauncherContractV2 extends ActivityResultContract<Args, GooglePayPaymentMethodLauncher3> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) GooglePayPaymentMethodLauncherActivity.class).putExtras(input.toBundle$payments_core_release());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public GooglePayPaymentMethodLauncher3 parseResult(int resultCode, Intent intent) {
        GooglePayPaymentMethodLauncher3 googlePayPaymentMethodLauncher3 = intent != null ? (GooglePayPaymentMethodLauncher3) intent.getParcelableExtra("extra_result") : null;
        return googlePayPaymentMethodLauncher3 == null ? new GooglePayPaymentMethodLauncher3.Failed(new IllegalArgumentException("Could not parse a valid result."), 1) : googlePayPaymentMethodLauncher3;
    }

    /* compiled from: GooglePayPaymentMethodLauncherContractV2.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b)\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b*\u0010\u0011¨\u0006,"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "Landroid/os/Parcelable;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "config", "", "currencyCode", "", "amount", AnnotatedPrivateKey.LABEL, "transactionId", "<init>", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle$payments_core_release", "()Landroid/os/Bundle;", "toBundle", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "getConfig$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "Ljava/lang/String;", "getCurrencyCode$payments_core_release", "J", "getAmount$payments_core_release", "()J", "getLabel$payments_core_release", "getTransactionId$payments_core_release", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private final long amount;
        private final Config config;
        private final String currencyCode;
        private final String label;
        private final String transactionId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        /* compiled from: GooglePayPaymentMethodLauncherContractV2.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(Config.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
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
            return Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.currencyCode, args.currencyCode) && this.amount == args.amount && Intrinsics.areEqual(this.label, args.label) && Intrinsics.areEqual(this.transactionId, args.transactionId);
        }

        public int hashCode() {
            int iHashCode = ((((this.config.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + Long.hashCode(this.amount)) * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.transactionId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(config=" + this.config + ", currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", label=" + this.label + ", transactionId=" + this.transactionId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.config.writeToParcel(parcel, flags);
            parcel.writeString(this.currencyCode);
            parcel.writeLong(this.amount);
            parcel.writeString(this.label);
            parcel.writeString(this.transactionId);
        }

        public Args(Config config, String currencyCode, long j, String str, String str2) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.config = config;
            this.currencyCode = currencyCode;
            this.amount = j;
            this.label = str;
            this.transactionId = str2;
        }

        public /* synthetic */ Args(Config googlePayPaymentMethodLauncher2, String str, long j, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(googlePayPaymentMethodLauncher2, str, j, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
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
        public final long getAmount() {
            return this.amount;
        }

        /* renamed from: getLabel$payments_core_release, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: getTransactionId$payments_core_release, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        public final Bundle toBundle$payments_core_release() {
            return Bundle2.bundleOf(Tuples4.m3642to("extra_args", this));
        }

        /* compiled from: GooglePayPaymentMethodLauncherContractV2.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args$Companion;", "", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "intent", "Landroid/content/Intent;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
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
