package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: MarginInvestingInfoStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.margin.MarginInvestingInfoStore$getEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MarginInvestingInfoStore2 extends FunctionReferenceImpl implements Function2<ApiMarginInvestingInfo, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    MarginInvestingInfoStore2(Object obj) {
        super(2, obj, SharedFlow2.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMarginInvestingInfo apiMarginInvestingInfo, Continuation<? super Unit> continuation) {
        return ((SharedFlow2) this.receiver).emit(apiMarginInvestingInfo, continuation);
    }
}
