package com.salesforce.android.smi.common.api;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.salesforce.android.smi.common.api.Result;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Result.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aC\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\"#\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"T", "R", "Lcom/salesforce/android/smi/common/api/Result;", "Lkotlin/Function1;", "block", "map", "(Lcom/salesforce/android/smi/common/api/Result;Lkotlin/jvm/functions/Function1;)Lcom/salesforce/android/smi/common/api/Result;", "getData", "(Lcom/salesforce/android/smi/common/api/Result;)Ljava/lang/Object;", WebsocketGatewayConstants.DATA_KEY, "common_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ResultKt {
    public static final <T> T getData(Result<? extends T> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Result.Success success = result instanceof Result.Success ? (Result.Success) result : null;
        if (success != null) {
            return (T) success.getData();
        }
        return null;
    }

    public static final <T, R> Result<R> map(Result<? extends T> result, Function1<? super T, ? extends Result<? extends R>> block) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Result.Loading loading = Result.Loading.INSTANCE;
        if (Intrinsics.areEqual(result, loading)) {
            return loading;
        }
        Result.Empty empty = Result.Empty.INSTANCE;
        if (Intrinsics.areEqual(result, empty)) {
            return empty;
        }
        if (result instanceof Result.Error) {
            return new Result.Error(((Result.Error) result).getException());
        }
        if (result instanceof Result.Success) {
            return block.invoke((Object) ((Result.Success) result).getData());
        }
        throw new NoWhenBranchMatchedException();
    }
}
