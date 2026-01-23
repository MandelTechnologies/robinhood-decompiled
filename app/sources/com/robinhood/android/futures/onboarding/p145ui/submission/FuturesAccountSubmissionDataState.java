package com.robinhood.android.futures.onboarding.p145ui.submission;

import com.robinhood.android.models.futures.p192ui.CreateFuturesAccountResult;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAccountSubmissionDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\nJ\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionDataState;", "", "result", "Lkotlin/Result;", "Lcom/robinhood/android/models/futures/ui/CreateFuturesAccountResult;", "<init>", "(Lkotlin/Result;)V", "getResult-xLWZpok", "()Lkotlin/Result;", "component1", "component1-xLWZpok", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesAccountSubmissionDataState {
    public static final int $stable = 8;
    private final Result<CreateFuturesAccountResult> result;

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesAccountSubmissionDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesAccountSubmissionDataState copy$default(FuturesAccountSubmissionDataState futuresAccountSubmissionDataState, Result result, int i, Object obj) {
        if ((i & 1) != 0) {
            result = futuresAccountSubmissionDataState.result;
        }
        return futuresAccountSubmissionDataState.copy(result);
    }

    /* renamed from: component1-xLWZpok, reason: not valid java name */
    public final Result<CreateFuturesAccountResult> m14713component1xLWZpok() {
        return this.result;
    }

    public final FuturesAccountSubmissionDataState copy(Result<? extends CreateFuturesAccountResult> result) {
        return new FuturesAccountSubmissionDataState(result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FuturesAccountSubmissionDataState) && Intrinsics.areEqual(this.result, ((FuturesAccountSubmissionDataState) other).result);
    }

    public int hashCode() {
        Result<CreateFuturesAccountResult> result = this.result;
        if (result == null) {
            return 0;
        }
        return Result.m28554hashCodeimpl(result.getValue());
    }

    public String toString() {
        return "FuturesAccountSubmissionDataState(result=" + this.result + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesAccountSubmissionDataState(Result<? extends CreateFuturesAccountResult> result) {
        this.result = result;
    }

    public /* synthetic */ FuturesAccountSubmissionDataState(Result result, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : result);
    }

    /* renamed from: getResult-xLWZpok, reason: not valid java name */
    public final Result<CreateFuturesAccountResult> m14714getResultxLWZpok() {
        return this.result;
    }
}
