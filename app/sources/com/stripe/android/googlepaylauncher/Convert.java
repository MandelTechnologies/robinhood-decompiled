package com.stripe.android.googlepaylauncher;

import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.googlepaylauncher.BillingAddressConfig;
import com.stripe.android.googlepaylauncher.BillingAddressConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Convert.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"convert", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.googlepaylauncher.ConvertKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Convert {

    /* compiled from: Convert.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.googlepaylauncher.ConvertKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BillingAddressConfig.Format.values().length];
            try {
                iArr[BillingAddressConfig.Format.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillingAddressConfig.Format.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BillingAddressConfig.Format.values().length];
            try {
                iArr2[BillingAddressConfig.Format.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BillingAddressConfig.Format.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final GooglePayJsonFactory.BillingAddressParameters convert(BillingAddressConfig billingAddressConfig) {
        GooglePayJsonFactory.BillingAddressParameters.Format format2;
        Intrinsics.checkNotNullParameter(billingAddressConfig, "<this>");
        boolean isRequired = billingAddressConfig.getIsRequired();
        int i = WhenMappings.$EnumSwitchMapping$0[billingAddressConfig.getFormat().ordinal()];
        if (i == 1) {
            format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
        }
        return new GooglePayJsonFactory.BillingAddressParameters(isRequired, format2, billingAddressConfig.getIsPhoneNumberRequired());
    }

    public static final GooglePayJsonFactory.BillingAddressParameters convert(BillingAddressConfig billingAddressConfig) {
        GooglePayJsonFactory.BillingAddressParameters.Format format2;
        Intrinsics.checkNotNullParameter(billingAddressConfig, "<this>");
        boolean isRequired = billingAddressConfig.getIsRequired();
        int i = WhenMappings.$EnumSwitchMapping$1[billingAddressConfig.getFormat().ordinal()];
        if (i == 1) {
            format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
        }
        return new GooglePayJsonFactory.BillingAddressParameters(isRequired, format2, billingAddressConfig.getIsPhoneNumberRequired());
    }
}
