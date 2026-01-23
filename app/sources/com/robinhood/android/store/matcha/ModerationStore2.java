package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiCreateAbuseReportRequest;
import com.robinhood.api.matcha.MatchaApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ModerationStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.store.matcha.ModerationStore$createAbuseReport$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ModerationStore2 extends FunctionReferenceImpl implements Function2<ApiCreateAbuseReportRequest, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    ModerationStore2(Object obj) {
        super(2, obj, MatchaApi.class, "createAbuseReport", "createAbuseReport(Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiCreateAbuseReportRequest apiCreateAbuseReportRequest, Continuation<? super Unit> continuation) {
        return ((MatchaApi) this.receiver).createAbuseReport(apiCreateAbuseReportRequest, continuation);
    }
}
