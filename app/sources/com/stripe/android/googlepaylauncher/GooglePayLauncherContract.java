package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.Bundle2;
import androidx.view.result.contract.ActivityResultContract;
import com.stripe.android.googlepaylauncher.GooglePayLauncher3;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: GooglePayLauncherContract.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u000e\u000f\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "Companion", "PaymentIntentArgs", "SetupIntentArgs", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class GooglePayLauncherContract extends ActivityResultContract<Args, GooglePayLauncher3> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) GooglePayLauncherActivity.class).putExtras(input.toBundle$payments_core_release());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public GooglePayLauncher3 parseResult(int resultCode, Intent intent) {
        GooglePayLauncher3 googlePayLauncher3 = intent != null ? (GooglePayLauncher3) intent.getParcelableExtra("extra_result") : null;
        return googlePayLauncher3 == null ? new GooglePayLauncher3.Failed(new IllegalStateException("Error while processing result from Google Pay.")) : googlePayLauncher3;
    }

    /* compiled from: GooglePayLauncherContract.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "", "clientSecret", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "config", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getClientSecret$payments_core_release", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "getConfig$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "getLabel$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class PaymentIntentArgs extends Args {
        public static final Parcelable.Creator<PaymentIntentArgs> CREATOR = new Creator();
        private final String clientSecret;
        private final Config config;
        private final String label;

        /* compiled from: GooglePayLauncherContract.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentIntentArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentIntentArgs(parcel.readString(), Config.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntentArgs[] newArray(int i) {
                return new PaymentIntentArgs[i];
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
            if (!(other instanceof PaymentIntentArgs)) {
                return false;
            }
            PaymentIntentArgs paymentIntentArgs = (PaymentIntentArgs) other;
            return Intrinsics.areEqual(this.clientSecret, paymentIntentArgs.clientSecret) && Intrinsics.areEqual(this.config, paymentIntentArgs.config) && Intrinsics.areEqual(this.label, paymentIntentArgs.label);
        }

        public int hashCode() {
            int iHashCode = ((this.clientSecret.hashCode() * 31) + this.config.hashCode()) * 31;
            String str = this.label;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PaymentIntentArgs(clientSecret=" + this.clientSecret + ", config=" + this.config + ", label=" + this.label + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.clientSecret);
            this.config.writeToParcel(parcel, flags);
            parcel.writeString(this.label);
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        /* renamed from: getClientSecret$payments_core_release, reason: from getter */
        public String getClientSecret() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        /* renamed from: getConfig$payments_core_release, reason: from getter */
        public Config getConfig() {
            return this.config;
        }

        /* renamed from: getLabel$payments_core_release, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public PaymentIntentArgs(String clientSecret, Config config, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(config, "config");
            this.clientSecret = clientSecret;
            this.config = config;
            this.label = str;
        }
    }

    /* compiled from: GooglePayLauncherContract.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\"\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b&\u0010\r¨\u0006'"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "", "clientSecret", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "config", "currencyCode", "", "amount", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getClientSecret$payments_core_release", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "getConfig$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "getCurrencyCode$payments_core_release", "Ljava/lang/Long;", "getAmount$payments_core_release", "()Ljava/lang/Long;", "getLabel$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SetupIntentArgs extends Args {
        public static final Parcelable.Creator<SetupIntentArgs> CREATOR = new Creator();
        private final Long amount;
        private final String clientSecret;
        private final Config config;
        private final String currencyCode;
        private final String label;

        /* compiled from: GooglePayLauncherContract.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SetupIntentArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetupIntentArgs(parcel.readString(), Config.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntentArgs[] newArray(int i) {
                return new SetupIntentArgs[i];
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
            if (!(other instanceof SetupIntentArgs)) {
                return false;
            }
            SetupIntentArgs setupIntentArgs = (SetupIntentArgs) other;
            return Intrinsics.areEqual(this.clientSecret, setupIntentArgs.clientSecret) && Intrinsics.areEqual(this.config, setupIntentArgs.config) && Intrinsics.areEqual(this.currencyCode, setupIntentArgs.currencyCode) && Intrinsics.areEqual(this.amount, setupIntentArgs.amount) && Intrinsics.areEqual(this.label, setupIntentArgs.label);
        }

        public int hashCode() {
            int iHashCode = ((((this.clientSecret.hashCode() * 31) + this.config.hashCode()) * 31) + this.currencyCode.hashCode()) * 31;
            Long l = this.amount;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.label;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "SetupIntentArgs(clientSecret=" + this.clientSecret + ", config=" + this.config + ", currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", label=" + this.label + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.clientSecret);
            this.config.writeToParcel(parcel, flags);
            parcel.writeString(this.currencyCode);
            Long l = this.amount;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeString(this.label);
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        /* renamed from: getClientSecret$payments_core_release, reason: from getter */
        public String getClientSecret() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        /* renamed from: getConfig$payments_core_release, reason: from getter */
        public Config getConfig() {
            return this.config;
        }

        /* renamed from: getCurrencyCode$payments_core_release, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: getAmount$payments_core_release, reason: from getter */
        public final Long getAmount() {
            return this.amount;
        }

        /* renamed from: getLabel$payments_core_release, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public SetupIntentArgs(String clientSecret, Config config, String currencyCode, Long l, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.clientSecret = clientSecret;
            this.config = config;
            this.currencyCode = currencyCode;
            this.amount = l;
            this.label = str;
        }
    }

    /* compiled from: GooglePayLauncherContract.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "Landroid/os/Parcelable;", "()V", "clientSecret", "", "getClientSecret$payments_core_release", "()Ljava/lang/String;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "getConfig$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "toBundle", "Landroid/os/Bundle;", "toBundle$payments_core_release", "Companion", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class Args implements Parcelable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ Args(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getClientSecret$payments_core_release */
        public abstract String getClientSecret();

        /* renamed from: getConfig$payments_core_release */
        public abstract Config getConfig();

        private Args() {
        }

        public final Bundle toBundle$payments_core_release() {
            return Bundle2.bundleOf(Tuples4.m3642to("extra_args", this));
        }

        /* compiled from: GooglePayLauncherContract.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args$Companion;", "", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "intent", "Landroid/content/Intent;", "fromIntent$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent$payments_core_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_args");
            }
        }
    }
}
