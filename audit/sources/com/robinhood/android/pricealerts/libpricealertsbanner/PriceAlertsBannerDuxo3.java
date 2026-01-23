package com.robinhood.android.pricealerts.libpricealertsbanner;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PriceAlertsBannerDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo", m3645f = "PriceAlertsBannerDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "isValidPriceAboveAlert$lib_price_alerts_banner_externalDebug")
/* renamed from: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$isValidPriceAboveAlert$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PriceAlertsBannerDuxo3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PriceAlertsBannerDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceAlertsBannerDuxo3(PriceAlertsBannerDuxo priceAlertsBannerDuxo, Continuation<? super PriceAlertsBannerDuxo3> continuation) {
        super(continuation);
        this.this$0 = priceAlertsBannerDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isValidPriceAboveAlert$lib_price_alerts_banner_externalDebug(null, null, null, this);
    }
}
