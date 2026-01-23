package com.robinhood.android.acats.retries.activity;

import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: AcatsRetriesActivityStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u0010R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesActivityStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/store/StoreBundle;)V", "viewStateRelay", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesViewState;", "viewStateStream", "Lkotlinx/coroutines/flow/StateFlow;", "getViewStateStream", "()Lkotlinx/coroutines/flow/StateFlow;", "updateViewState", "", "viewState", "(Lcom/robinhood/android/acats/retries/activity/AcatsRetriesViewState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsRetriesActivityStore extends Store {
    public static final int $stable = 8;
    private final StateFlow2<AcatsRetriesViewState> viewStateRelay;
    private final StateFlow<AcatsRetriesViewState> viewStateStream;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsRetriesActivityStore(StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        StateFlow2<AcatsRetriesViewState> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
        this.viewStateRelay = stateFlow2MutableStateFlow;
        this.viewStateStream = stateFlow2MutableStateFlow;
    }

    public final StateFlow<AcatsRetriesViewState> getViewStateStream() {
        return this.viewStateStream;
    }

    public final Object updateViewState(AcatsRetriesViewState acatsRetriesViewState, Continuation<? super Unit> continuation) {
        Object objEmit = this.viewStateRelay.emit(acatsRetriesViewState, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }
}
