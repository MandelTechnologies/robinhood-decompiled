package com.robinhood.android.feature.margincallresolve;

import com.robinhood.android.feature.margincallresolve.DayTradeResolveState3;
import com.robinhood.android.lib.margincallresolve.api.models.ApiDayTradeCallView;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayTradeResolveState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveDataState;", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState;", "<init>", "()V", "reduce", "dataState", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margincallresolve.DayTradeResolveStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class DayTradeResolveState2 implements StateProvider<DayTradeResolveDataState, DayTradeResolveState3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public DayTradeResolveState3 reduce(DayTradeResolveDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getThrowable() != null) {
            return new DayTradeResolveState3.Error(dataState.getThrowable());
        }
        ApiDayTradeCallView dayTradeCallView = dataState.getDayTradeCallView();
        if (dayTradeCallView != null && dayTradeCallView.getHasActionableDayTradeCall()) {
            return new DayTradeResolveState3.InDayTradeCall(dataState.getDayTradeCallView());
        }
        ApiDayTradeCallView dayTradeCallView2 = dataState.getDayTradeCallView();
        if (dayTradeCallView2 != null && !dayTradeCallView2.getHasActionableDayTradeCall()) {
            return new DayTradeResolveState3.NotInDayTradeCall(dataState.getDayTradeCallView());
        }
        return DayTradeResolveState3.Loading.INSTANCE;
    }
}
