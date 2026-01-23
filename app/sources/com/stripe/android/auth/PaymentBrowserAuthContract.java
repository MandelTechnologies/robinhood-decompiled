package com.stripe.android.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.Bundle2;
import androidx.view.result.contract.ActivityResultContract;
import com.adjust.sdk.Constants;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.stripe3ds2.init.p418ui.StripeToolbarCustomization;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentBrowserAuthContract.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PaymentBrowserAuthContract extends ActivityResultContract<Args, Unvalidated> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Class cls;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        boolean z = !input.getForceInAppWebView() && (input.hasDefaultReturnUrl$payments_core_release(DefaultReturnUrl.INSTANCE.create(context)) || input.getIsInstantApp());
        Bundle bundle = input.toBundle();
        if (z) {
            cls = StripeBrowserLauncherActivity.class;
        } else if (!z) {
            cls = PaymentAuthWebViewActivity.class;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public Unvalidated parseResult(int resultCode, Intent intent) {
        Unvalidated paymentFlowResult = intent != null ? (Unvalidated) intent.getParcelableExtra("extra_args") : null;
        if (paymentFlowResult == null) {
            return new Unvalidated(null, 0, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
        return paymentFlowResult;
    }

    /* compiled from: PaymentBrowserAuthContract.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0080\b\u0018\u0000 G2\u00020\u0001:\u0001GB\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J°\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010'J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010'R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010+R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b>\u0010+R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b?\u0010:R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b@\u0010:R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\bD\u0010+R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b\u0012\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\bE\u0010+R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\bF\u0010:¨\u0006H"}, m3636d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Landroid/os/Parcelable;", "", "objectId", "", "requestCode", "clientSecret", "url", "returnUrl", "", "enableLogging", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "toolbarCustomization", "stripeAccountId", "shouldCancelSource", "shouldCancelIntentOnUserNavigation", "statusBarColor", "publishableKey", "isInstantApp", Constants.REFERRER, "forceInAppWebView", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Z)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Lcom/stripe/android/payments/DefaultReturnUrl;", "defaultReturnUrl", "hasDefaultReturnUrl$payments_core_release", "(Lcom/stripe/android/payments/DefaultReturnUrl;)Z", "hasDefaultReturnUrl", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Z)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getObjectId", "I", "getRequestCode", "getClientSecret", "getUrl", "getReturnUrl", "Z", "getEnableLogging", "()Z", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "getToolbarCustomization", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "getStripeAccountId", "getShouldCancelSource", "getShouldCancelIntentOnUserNavigation", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "getPublishableKey", "getReferrer", "getForceInAppWebView", "CREATOR", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private final String clientSecret;
        private final boolean enableLogging;
        private final boolean forceInAppWebView;
        private final boolean isInstantApp;
        private final String objectId;
        private final String publishableKey;
        private final String referrer;
        private final int requestCode;
        private final String returnUrl;
        private final boolean shouldCancelIntentOnUserNavigation;
        private final boolean shouldCancelSource;
        private final Integer statusBarColor;
        private final String stripeAccountId;
        private final StripeToolbarCustomization toolbarCustomization;
        private final String url;

        /* renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public final Args copy(String objectId, int requestCode, String clientSecret, String url, String returnUrl, boolean enableLogging, StripeToolbarCustomization toolbarCustomization, String stripeAccountId, boolean shouldCancelSource, boolean shouldCancelIntentOnUserNavigation, Integer statusBarColor, String publishableKey, boolean isInstantApp, String referrer, boolean forceInAppWebView) {
            Intrinsics.checkNotNullParameter(objectId, "objectId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            return new Args(objectId, requestCode, clientSecret, url, returnUrl, enableLogging, toolbarCustomization, stripeAccountId, shouldCancelSource, shouldCancelIntentOnUserNavigation, statusBarColor, publishableKey, isInstantApp, referrer, forceInAppWebView);
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
            return Intrinsics.areEqual(this.objectId, args.objectId) && this.requestCode == args.requestCode && Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Intrinsics.areEqual(this.url, args.url) && Intrinsics.areEqual(this.returnUrl, args.returnUrl) && this.enableLogging == args.enableLogging && Intrinsics.areEqual(this.toolbarCustomization, args.toolbarCustomization) && Intrinsics.areEqual(this.stripeAccountId, args.stripeAccountId) && this.shouldCancelSource == args.shouldCancelSource && this.shouldCancelIntentOnUserNavigation == args.shouldCancelIntentOnUserNavigation && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && Intrinsics.areEqual(this.publishableKey, args.publishableKey) && this.isInstantApp == args.isInstantApp && Intrinsics.areEqual(this.referrer, args.referrer) && this.forceInAppWebView == args.forceInAppWebView;
        }

        public int hashCode() {
            int iHashCode = ((((((this.objectId.hashCode() * 31) + Integer.hashCode(this.requestCode)) * 31) + this.clientSecret.hashCode()) * 31) + this.url.hashCode()) * 31;
            String str = this.returnUrl;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enableLogging)) * 31;
            StripeToolbarCustomization stripeToolbarCustomization = this.toolbarCustomization;
            int iHashCode3 = (iHashCode2 + (stripeToolbarCustomization == null ? 0 : stripeToolbarCustomization.hashCode())) * 31;
            String str2 = this.stripeAccountId;
            int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.shouldCancelSource)) * 31) + Boolean.hashCode(this.shouldCancelIntentOnUserNavigation)) * 31;
            Integer num = this.statusBarColor;
            int iHashCode5 = (((((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.publishableKey.hashCode()) * 31) + Boolean.hashCode(this.isInstantApp)) * 31;
            String str3 = this.referrer;
            return ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.forceInAppWebView);
        }

        public String toString() {
            return "Args(objectId=" + this.objectId + ", requestCode=" + this.requestCode + ", clientSecret=" + this.clientSecret + ", url=" + this.url + ", returnUrl=" + this.returnUrl + ", enableLogging=" + this.enableLogging + ", toolbarCustomization=" + this.toolbarCustomization + ", stripeAccountId=" + this.stripeAccountId + ", shouldCancelSource=" + this.shouldCancelSource + ", shouldCancelIntentOnUserNavigation=" + this.shouldCancelIntentOnUserNavigation + ", statusBarColor=" + this.statusBarColor + ", publishableKey=" + this.publishableKey + ", isInstantApp=" + this.isInstantApp + ", referrer=" + this.referrer + ", forceInAppWebView=" + this.forceInAppWebView + ")";
        }

        public Args(String objectId, int i, String clientSecret, String url, String str, boolean z, StripeToolbarCustomization stripeToolbarCustomization, String str2, boolean z2, boolean z3, Integer num, String publishableKey, boolean z4, String str3, boolean z5) {
            Intrinsics.checkNotNullParameter(objectId, "objectId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            this.objectId = objectId;
            this.requestCode = i;
            this.clientSecret = clientSecret;
            this.url = url;
            this.returnUrl = str;
            this.enableLogging = z;
            this.toolbarCustomization = stripeToolbarCustomization;
            this.stripeAccountId = str2;
            this.shouldCancelSource = z2;
            this.shouldCancelIntentOnUserNavigation = z3;
            this.statusBarColor = num;
            this.publishableKey = publishableKey;
            this.isInstantApp = z4;
            this.referrer = str3;
            this.forceInAppWebView = z5;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Args(java.lang.String r20, int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, com.stripe.android.stripe3ds2.init.p418ui.StripeToolbarCustomization r26, java.lang.String r27, boolean r28, boolean r29, java.lang.Integer r30, java.lang.String r31, boolean r32, java.lang.String r33, boolean r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
            /*
                r19 = this;
                r0 = r35
                r1 = r0 & 16
                r2 = 0
                if (r1 == 0) goto L9
                r8 = r2
                goto Lb
            L9:
                r8 = r24
            Lb:
                r1 = r0 & 32
                r3 = 0
                if (r1 == 0) goto L12
                r9 = r3
                goto L14
            L12:
                r9 = r25
            L14:
                r1 = r0 & 64
                if (r1 == 0) goto L1a
                r10 = r2
                goto L1c
            L1a:
                r10 = r26
            L1c:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L22
                r11 = r2
                goto L24
            L22:
                r11 = r27
            L24:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L2a
                r12 = r3
                goto L2c
            L2a:
                r12 = r28
            L2c:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L33
                r1 = 1
                r13 = r1
                goto L35
            L33:
                r13 = r29
            L35:
                r1 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r1 == 0) goto L3c
                r17 = r2
                goto L3e
            L3c:
                r17 = r33
            L3e:
                r0 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r0 == 0) goto L55
                r18 = r3
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                r14 = r30
                r15 = r31
                r16 = r32
                r3 = r19
                goto L67
            L55:
                r18 = r34
                r3 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                r14 = r30
                r15 = r31
                r16 = r32
            L67:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.auth.PaymentBrowserAuthContract.Args.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization, java.lang.String, boolean, boolean, java.lang.Integer, java.lang.String, boolean, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final StripeToolbarCustomization getToolbarCustomization() {
            return this.toolbarCustomization;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final boolean getShouldCancelSource() {
            return this.shouldCancelSource;
        }

        public final boolean getShouldCancelIntentOnUserNavigation() {
            return this.shouldCancelIntentOnUserNavigation;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        /* renamed from: isInstantApp, reason: from getter */
        public final boolean getIsInstantApp() {
            return this.isInstantApp;
        }

        public final String getReferrer() {
            return this.referrer;
        }

        public final boolean getForceInAppWebView() {
            return this.forceInAppWebView;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Args(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String str = string2 == null ? "" : string2;
            int i = parcel.readInt();
            String string3 = parcel.readString();
            String str2 = string3 == null ? "" : string3;
            String string4 = parcel.readString();
            String str3 = string4 == null ? "" : string4;
            String string5 = parcel.readString();
            boolean z2 = true;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            StripeToolbarCustomization stripeToolbarCustomization = (StripeToolbarCustomization) parcel.readParcelable(StripeToolbarCustomization.class.getClassLoader());
            String string6 = parcel.readString();
            boolean z3 = parcel.readByte() != 0 ? z : false;
            boolean z4 = parcel.readByte() != 0 ? z : false;
            Object value = parcel.readValue(Integer.TYPE.getClassLoader());
            Integer num = value instanceof Integer ? (Integer) value : null;
            String string7 = parcel.readString();
            this(str, i, str2, str3, string5, z2, stripeToolbarCustomization, string6, z3, z4, num, string7 == null ? "" : string7, parcel.readByte() != 0 ? z : false, parcel.readString(), parcel.readByte() != 0 ? z : false);
        }

        public final boolean hasDefaultReturnUrl$payments_core_release(DefaultReturnUrl defaultReturnUrl) {
            Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
            return Intrinsics.areEqual(this.returnUrl, defaultReturnUrl.getValue());
        }

        public final Bundle toBundle() {
            return Bundle2.bundleOf(Tuples4.m3642to("extra_args", this));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.objectId);
            parcel.writeInt(this.requestCode);
            parcel.writeString(this.clientSecret);
            parcel.writeString(this.url);
            parcel.writeString(this.returnUrl);
            parcel.writeByte(this.enableLogging ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.toolbarCustomization, flags);
            parcel.writeString(this.stripeAccountId);
            parcel.writeByte(this.shouldCancelSource ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.shouldCancelIntentOnUserNavigation ? (byte) 1 : (byte) 0);
            parcel.writeValue(this.statusBarColor);
            parcel.writeString(this.publishableKey);
            parcel.writeByte(this.isInstantApp ? (byte) 1 : (byte) 0);
            parcel.writeString(this.referrer);
            parcel.writeByte(this.forceInAppWebView ? (byte) 1 : (byte) 0);
        }

        /* compiled from: PaymentBrowserAuthContract.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: com.stripe.android.auth.PaymentBrowserAuthContract$Args$CREATOR, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<Args> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Args[] newArray(int size) {
                return new Args[size];
            }
        }
    }

    /* compiled from: PaymentBrowserAuthContract.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$Companion;", "", "()V", "EXTRA_ARGS", "", "parseArgs", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "intent", "Landroid/content/Intent;", "parseArgs$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Args parseArgs$payments_core_release(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return (Args) intent.getParcelableExtra("extra_args");
        }
    }
}
