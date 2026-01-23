package com.robinhood.android.investFlow.core;

import io.reactivex.Observable;
import kotlin.Metadata;

/* compiled from: InvestFlowCoreDataProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/investFlow/core/InvestFlowCoreDataProvider;", "", "coreDataObservable", "Lio/reactivex/Observable;", "Lcom/robinhood/android/investFlow/core/InvestFlowCoreData;", "getCoreDataObservable", "()Lio/reactivex/Observable;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface InvestFlowCoreDataProvider {
    Observable<InvestFlowCoreData> getCoreDataObservable();
}
