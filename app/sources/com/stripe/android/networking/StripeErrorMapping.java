package com.stripe.android.networking;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.R$string;
import com.stripe.android.core.StripeError;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StripeErrorMapping.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\b\u001a\u00020\f*\u00020\f2\u0006\u0010\n\u001a\u00020\u0006H\u0000\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\r"}, m3636d2 = {"shouldFallBackToLocalizedError", "", "getShouldFallBackToLocalizedError", "()Z", "mapErrorCodeToLocalizedMessage", "", "Landroid/content/Context;", "code", "withLocalizedMessage", "Lcom/stripe/android/core/StripeError;", "context", "Lcom/stripe/android/model/PaymentIntent$Error;", "Lcom/stripe/android/model/SetupIntent$Error;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.networking.StripeErrorMappingKt, reason: use source file name */
/* loaded from: classes22.dex */
public final class StripeErrorMapping {
    public static final StripeError withLocalizedMessage(StripeError stripeError, Context context) {
        String message;
        String str;
        Intrinsics.checkNotNullParameter(stripeError, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!getShouldFallBackToLocalizedError() && (message = stripeError.getMessage()) != null) {
            str = message;
            return StripeError.copy$default(stripeError, null, str, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        }
        String strMapErrorCodeToLocalizedMessage = mapErrorCodeToLocalizedMessage(context, stripeError.getCode());
        str = strMapErrorCodeToLocalizedMessage;
        return StripeError.copy$default(stripeError, null, str, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    public static final PaymentIntent.Error withLocalizedMessage(PaymentIntent.Error error, Context context) {
        String message;
        String str;
        Intrinsics.checkNotNullParameter(error, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!getShouldFallBackToLocalizedError() && (message = error.getMessage()) != null) {
            str = message;
            return PaymentIntent.Error.copy$default(error, null, null, null, null, str, null, null, null, 239, null);
        }
        String strMapErrorCodeToLocalizedMessage = mapErrorCodeToLocalizedMessage(context, error.getCode());
        str = strMapErrorCodeToLocalizedMessage;
        return PaymentIntent.Error.copy$default(error, null, null, null, null, str, null, null, null, 239, null);
    }

    public static final SetupIntent.Error withLocalizedMessage(SetupIntent.Error error, Context context) {
        String message;
        String str;
        Intrinsics.checkNotNullParameter(error, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!getShouldFallBackToLocalizedError() && (message = error.getMessage()) != null) {
            str = message;
            return SetupIntent.Error.copy$default(error, null, null, null, str, null, null, null, 119, null);
        }
        String strMapErrorCodeToLocalizedMessage = mapErrorCodeToLocalizedMessage(context, error.getCode());
        str = strMapErrorCodeToLocalizedMessage;
        return SetupIntent.Error.copy$default(error, null, null, null, str, null, null, null, 119, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String mapErrorCodeToLocalizedMessage(Context context, String str) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str != null) {
            switch (str.hashCode()) {
                case -2011738994:
                    if (!str.equals("generic_decline")) {
                        numValueOf = null;
                        break;
                    } else {
                        numValueOf = Integer.valueOf(R$string.stripe_generic_decline);
                        break;
                    }
                case -1109249604:
                    if (str.equals("invalid_expiry_month")) {
                        numValueOf = Integer.valueOf(com.stripe.android.uicore.R$string.stripe_invalid_expiry_month);
                        break;
                    }
                    break;
                case -952840184:
                    if (str.equals("invalid_cvc")) {
                        numValueOf = Integer.valueOf(R$string.stripe_invalid_cvc);
                        break;
                    }
                    break;
                case -857379549:
                    if (str.equals("incorrect_number")) {
                        numValueOf = Integer.valueOf(R$string.stripe_invalid_card_number);
                        break;
                    }
                    break;
                case -822522913:
                    if (str.equals("invalid_owner_name")) {
                        numValueOf = Integer.valueOf(R$string.stripe_invalid_owner_name);
                        break;
                    }
                    break;
                case -343766564:
                    if (str.equals("processing_error")) {
                        numValueOf = Integer.valueOf(R$string.stripe_processing_error);
                        break;
                    }
                    break;
                case -308669807:
                    if (str.equals("invalid_number")) {
                        numValueOf = Integer.valueOf(R$string.stripe_invalid_card_number);
                        break;
                    }
                    break;
                case 147203197:
                    if (str.equals("card_declined")) {
                        numValueOf = Integer.valueOf(R$string.stripe_card_declined);
                        break;
                    }
                    break;
                case 657301889:
                    if (str.equals("invalid_expiry_year")) {
                        numValueOf = Integer.valueOf(com.stripe.android.uicore.R$string.stripe_invalid_expiry_year);
                        break;
                    }
                    break;
                case 1436957674:
                    if (str.equals("expired_card")) {
                        numValueOf = Integer.valueOf(R$string.stripe_expired_card);
                        break;
                    }
                    break;
                case 1737231027:
                    if (str.equals("invalid_bank_account_iban")) {
                        numValueOf = Integer.valueOf(R$string.stripe_invalid_bank_account_iban);
                        break;
                    }
                    break;
                case 2037370550:
                    if (str.equals("incorrect_cvc")) {
                        numValueOf = Integer.valueOf(R$string.stripe_invalid_cvc);
                        break;
                    }
                    break;
            }
        }
        if (numValueOf != null) {
            return context.getString(numValueOf.intValue());
        }
        return null;
    }

    private static final boolean getShouldFallBackToLocalizedError() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale locale2 = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!Intrinsics.areEqual(lowerCase, "es")) {
            return false;
        }
        String country = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        String lowerCase2 = country.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return !Intrinsics.areEqual(lowerCase2, "es");
    }
}
