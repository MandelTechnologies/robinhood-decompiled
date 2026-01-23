package com.robinhood.android.lib.trade.util;

import com.robinhood.android.common.contracts.CarContract;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HandleCarResult.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0000¨\u0006\u0006"}, m3636d2 = {"handleCarResult", "", "result", "Lcom/robinhood/android/common/contracts/CarContract$Result;", "finish", "Lkotlin/Function0;", "feature-lib-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.trade.util.HandleCarResultKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class HandleCarResult {
    public static final void handleCarResult(CarContract.Result result, Function0<Unit> finish) {
        Intrinsics.checkNotNullParameter(finish, "finish");
        if (Intrinsics.areEqual(result, CarContract.Result.Cancelled.INSTANCE) || result == null) {
            finish.invoke();
            return;
        }
        if (result instanceof CarContract.Result.Completed) {
            if (((CarContract.Result.Completed) result).getPassed()) {
                return;
            }
            finish.invoke();
        } else {
            if (!(result instanceof CarContract.Result.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, ((CarContract.Result.Error) result).getError(), false, null, 6, null);
        }
    }
}
