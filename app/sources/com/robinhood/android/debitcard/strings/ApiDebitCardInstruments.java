package com.robinhood.android.debitcard.strings;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.moneymovement.strings.C22208R;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetails;
import com.robinhood.models.api.bonfire.paymentinstruments.CardNetworkType;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiDebitCardInstruments.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002¨\u0006\u0007"}, m3636d2 = {"getDisplayTitle", "", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;", "resources", "Landroid/content/res/Resources;", "getStatusRes", "", "lib-debitcard-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.debitcard.strings.ApiDebitCardInstrumentsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ApiDebitCardInstruments {

    /* compiled from: ApiDebitCardInstruments.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.debitcard.strings.ApiDebitCardInstrumentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CardNetworkType.values().length];
            try {
                iArr[CardNetworkType.DISCOVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardNetworkType.MASTERCARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardNetworkType.VISA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardNetworkType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentInstrumentStatus.values().length];
            try {
                iArr2[PaymentInstrumentStatus.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PaymentInstrumentStatus.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PaymentInstrumentStatus.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PaymentInstrumentStatus.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PaymentInstrumentStatus.DISABLED_ACCOUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PaymentInstrumentStatus.EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[PaymentInstrumentStatus.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[PaymentInstrumentStatus.PENDING_ACTIVATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[PaymentInstrumentStatus.PENDING_DELETION.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[PaymentInstrumentStatus.VERIFIED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[PaymentInstrumentStatus.PENDING_KYC.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[PaymentInstrumentStatus.PENDING_KYC_UNDER_REVIEW.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[PaymentInstrumentStatus.MANUAL_REVIEW.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[PaymentInstrumentStatus.PENDING_VERIFICATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[PaymentInstrumentStatus.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String getDisplayTitle(ApiPaymentInstrument apiPaymentInstrument, Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(apiPaymentInstrument, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        ApiPaymentInstrumentDetails payment_instrument_details = apiPaymentInstrument.getPayment_instrument_details();
        Intrinsics.checkNotNull(payment_instrument_details, "null cannot be cast to non-null type com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetails.DebitCard");
        ApiPaymentInstrumentDetails.DebitCard debitCard = (ApiPaymentInstrumentDetails.DebitCard) payment_instrument_details;
        int i2 = C13932R.string.debit_card_display_title_template;
        int i3 = WhenMappings.$EnumSwitchMapping$0[debitCard.getCard_network_type().ordinal()];
        if (i3 == 1) {
            i = C13932R.string.discover;
        } else if (i3 == 2) {
            i = C13932R.string.mastercard;
        } else if (i3 == 3) {
            i = C13932R.string.visa;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11048R.string.general_label_unknown;
        }
        String string2 = resources.getString(i2, resources.getString(i), debitCard.getLast4());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final int getStatusRes(ApiPaymentInstrument apiPaymentInstrument) {
        Intrinsics.checkNotNullParameter(apiPaymentInstrument, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[apiPaymentInstrument.getPayment_instrument_status().ordinal()]) {
            case 1:
                return C13932R.string.general_label_new;
            case 2:
                return C11048R.string.general_label_verified;
            case 3:
                return C11048R.string.general_label_deleted;
            case 4:
            case 5:
                return C11048R.string.general_label_disabled;
            case 6:
                return C11048R.string.general_label_inactive;
            case 7:
                return C11048R.string.general_label_failed;
            case 8:
            case 9:
            case 10:
                return C11048R.string.general_label_pending;
            case 11:
            case 12:
            case 13:
                return C11048R.string.general_label_inactive;
            case 14:
                return C22208R.string.label_unverified;
            case 15:
                return C11048R.string.general_label_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
