package com.stripe.android.networking;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FraudDetectionDataRequestFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestFactory;", "Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fraudDetectionDataRequestParamsFactory", "Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;", "(Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/networking/FraudDetectionDataRequest;", "arg", "Lcom/stripe/android/networking/FraudDetectionData;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.networking.DefaultFraudDetectionDataRequestFactory, reason: use source file name */
/* loaded from: classes22.dex */
public final class FraudDetectionDataRequestFactory2 implements FraudDetectionDataRequestFactory {
    private final FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory;

    public FraudDetectionDataRequestFactory2(FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory) {
        Intrinsics.checkNotNullParameter(fraudDetectionDataRequestParamsFactory, "fraudDetectionDataRequestParamsFactory");
        this.fraudDetectionDataRequestParamsFactory = fraudDetectionDataRequestParamsFactory;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FraudDetectionDataRequestFactory2(Context context) {
        this(new FraudDetectionDataRequestParamsFactory(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.stripe.android.networking.FraudDetectionDataRequestFactory
    public FraudDetectionDataRequest create(FraudDetectionData arg) {
        Map mapCreateParams$payments_core_release = this.fraudDetectionDataRequestParamsFactory.createParams$payments_core_release(arg);
        String guid = arg != null ? arg.getGuid() : null;
        if (guid == null) {
            guid = "";
        }
        return new FraudDetectionDataRequest(mapCreateParams$payments_core_release, guid);
    }
}
