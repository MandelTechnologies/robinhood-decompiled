package com.robinhood.shared.order.type.timeInForce;

import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectTimeInForceDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDataState;", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceViewState;", "<init>", "()V", "reduce", "dataState", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceStateProvider, reason: use source file name */
/* loaded from: classes6.dex */
public final class SelectTimeInForceDuxo2 implements StateProvider<SelectTimeInForceDataState, SelectTimeInForceViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SelectTimeInForceViewState reduce(SelectTimeInForceDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new SelectTimeInForceViewState(dataState.getRows(), dataState.getSelectedTimeInForce$lib_order_type_externalDebug());
    }
}
