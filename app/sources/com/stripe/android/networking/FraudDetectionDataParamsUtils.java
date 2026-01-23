package com.stripe.android.networking;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FraudDetectionDataParamsUtils.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\tJ6\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;", "", "()V", "addFraudDetectionData", "", "", "params", "fraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "addFraudDetectionData$payments_core_release", "stripeIntentParams", "key", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class FraudDetectionDataParamsUtils {
    public final Map<String, ?> addFraudDetectionData$payments_core_release(Map<String, ?> params, FraudDetectionData fraudDetectionData) {
        Object next;
        Map<String, ?> mapAddFraudDetectionData;
        Intrinsics.checkNotNullParameter(params, "params");
        Iterator it = SetsKt.setOf((Object[]) new String[]{"source_data", "payment_method_data"}).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (params.containsKey((String) next)) {
                break;
            }
        }
        String str = (String) next;
        return (str == null || (mapAddFraudDetectionData = addFraudDetectionData(params, str, fraudDetectionData)) == null) ? params : mapAddFraudDetectionData;
    }

    private final Map<String, ?> addFraudDetectionData(Map<String, ?> stripeIntentParams, String key, FraudDetectionData fraudDetectionData) {
        Object obj = stripeIntentParams.get(key);
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            Map<String, String> params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
            if (params == null) {
                params = MapsKt.emptyMap();
            }
            Map<String, ?> mapPlus = MapsKt.plus(stripeIntentParams, MapsKt.mapOf(Tuples4.m3642to(key, MapsKt.plus(map, params))));
            if (mapPlus != null) {
                return mapPlus;
            }
        }
        return stripeIntentParams;
    }
}
