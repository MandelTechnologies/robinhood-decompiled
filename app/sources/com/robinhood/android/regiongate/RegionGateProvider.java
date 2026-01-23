package com.robinhood.android.regiongate;

import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RegionGateProvider.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H&J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/regiongate/RegionGateProvider;", "", "getRegionGateState", "", "regionGate", "Lcom/robinhood/android/regiongate/RegionGate;", "trigger", "(Lcom/robinhood/android/regiongate/RegionGate;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRegionGateStateByName", "regionGateName", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamRegionGateState", "Lio/reactivex/Observable;", "streamRegionGateStateFlow", "Lkotlinx/coroutines/flow/Flow;", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface RegionGateProvider {
    Object getRegionGateState(RegionGate regionGate, boolean z, Continuation<? super Boolean> continuation);

    @MicrogramOnlyUsageRegionGateApi
    Object getRegionGateStateByName(String str, boolean z, Continuation<? super Boolean> continuation);

    Observable<Boolean> streamRegionGateState(RegionGate regionGate, boolean trigger);

    Flow<Boolean> streamRegionGateStateFlow(RegionGate regionGate, boolean trigger);

    /* compiled from: RegionGateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getRegionGateState$default(RegionGateProvider regionGateProvider, RegionGate regionGate, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRegionGateState");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return regionGateProvider.getRegionGateState(regionGate, z, continuation);
        }

        public static /* synthetic */ Object getRegionGateStateByName$default(RegionGateProvider regionGateProvider, String str, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRegionGateStateByName");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return regionGateProvider.getRegionGateStateByName(str, z, continuation);
        }

        public static /* synthetic */ Observable streamRegionGateState$default(RegionGateProvider regionGateProvider, RegionGate regionGate, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: streamRegionGateState");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return regionGateProvider.streamRegionGateState(regionGate, z);
        }

        public static /* synthetic */ Flow streamRegionGateStateFlow$default(RegionGateProvider regionGateProvider, RegionGate regionGate, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: streamRegionGateStateFlow");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return regionGateProvider.streamRegionGateStateFlow(regionGate, z);
        }
    }
}
