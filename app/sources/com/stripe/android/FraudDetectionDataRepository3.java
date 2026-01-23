package com.stripe.android;

import com.stripe.android.core.networking.ResponseJson;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.model.parsers.FraudDetectionDataJsonParser;
import com.stripe.android.networking.FraudDetectionData;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FraudDetectionDataRepository.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"fraudDetectionJsonParser", "Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser;", "timestampSupplier", "Lkotlin/Function0;", "", "fraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "Lcom/stripe/android/core/networking/StripeResponse;", "", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.FraudDetectionDataRepositoryKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class FraudDetectionDataRepository3 {
    private static final FraudDetectionDataJsonParser fraudDetectionJsonParser;
    private static final Function0<Long> timestampSupplier;

    static {
        FraudDetectionDataRepository4 fraudDetectionDataRepository4 = new Function0<Long>() { // from class: com.stripe.android.FraudDetectionDataRepositoryKt$timestampSupplier$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(Calendar.getInstance().getTimeInMillis());
            }
        };
        timestampSupplier = fraudDetectionDataRepository4;
        fraudDetectionJsonParser = new FraudDetectionDataJsonParser(fraudDetectionDataRepository4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FraudDetectionData fraudDetectionData(StripeResponse<String> stripeResponse) {
        if (!stripeResponse.getIsOk()) {
            stripeResponse = null;
        }
        if (stripeResponse != null) {
            return fraudDetectionJsonParser.parse(ResponseJson.responseJson(stripeResponse));
        }
        return null;
    }
}
