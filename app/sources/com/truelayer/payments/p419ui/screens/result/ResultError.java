package com.truelayer.payments.p419ui.screens.result;

import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResultScreen.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/result/ResultError;", "Lcom/truelayer/payments/ui/screens/result/ResultScreen;", "result", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "(Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;)V", "getResult", "()Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ResultError implements ResultScreen {
    public static final int $stable = 0;
    private final ProcessorResult.Failure result;

    public static /* synthetic */ ResultError copy$default(ResultError resultError, ProcessorResult.Failure failure, int i, Object obj) {
        if ((i & 1) != 0) {
            failure = resultError.result;
        }
        return resultError.copy(failure);
    }

    /* renamed from: component1, reason: from getter */
    public final ProcessorResult.Failure getResult() {
        return this.result;
    }

    public final ResultError copy(ProcessorResult.Failure result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new ResultError(result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResultError) && Intrinsics.areEqual(this.result, ((ResultError) other).result);
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return "ResultError(result=" + this.result + ")";
    }

    public ResultError(ProcessorResult.Failure result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    public final ProcessorResult.Failure getResult() {
        return this.result;
    }
}
