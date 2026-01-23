package com.robinhood.android.futures.onboarding.p145ui.submission;

import com.robinhood.android.futures.onboarding.p145ui.submission.FuturesAccountSubmissionDuxo4;
import com.robinhood.android.models.futures.p192ui.CreateFuturesAccountResult;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAccountSubmissionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionDataState;", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAccountSubmissionDuxo3 implements StateProvider<FuturesAccountSubmissionDataState, FuturesAccountSubmissionDuxo4> {
    public static final int $stable = 0;
    public static final FuturesAccountSubmissionDuxo3 INSTANCE = new FuturesAccountSubmissionDuxo3();

    private FuturesAccountSubmissionDuxo3() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesAccountSubmissionDuxo4 reduce(FuturesAccountSubmissionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.m14714getResultxLWZpok() == null) {
            return FuturesAccountSubmissionDuxo4.Submitting.INSTANCE;
        }
        if (Result.m28555isFailureimpl(dataState.m14714getResultxLWZpok().getValue())) {
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(dataState.m14714getResultxLWZpok().getValue());
            Intrinsics.checkNotNull(thM28553exceptionOrNullimpl);
            return new FuturesAccountSubmissionDuxo4.NetworkError(thM28553exceptionOrNullimpl);
        }
        Object value = dataState.m14714getResultxLWZpok().getValue();
        ResultKt.throwOnFailure(value);
        return new FuturesAccountSubmissionDuxo4.Success((CreateFuturesAccountResult) value);
    }
}
