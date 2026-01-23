package com.robinhood.store.util;

import com.robinhood.android.eventcontracts.experiments.EventContractsPredictionMarketsTestingExperiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.ProcessInvariantExperiment;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PredictionMarketsRequestHeaderDelegate.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "<init>", "(Lcom/robinhood/experiments/ExperimentsProvider;)V", "buildRequestHeader", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.util.PredictionMarketsRequestHeaderPlugin, reason: use source file name */
/* loaded from: classes12.dex */
public final class PredictionMarketsRequestHeaderDelegate2 {
    private final ExperimentsProvider experimentsProvider;

    /* compiled from: PredictionMarketsRequestHeaderDelegate.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.util.PredictionMarketsRequestHeaderPlugin", m3645f = "PredictionMarketsRequestHeaderDelegate.kt", m3646l = {15}, m3647m = "buildRequestHeader")
    /* renamed from: com.robinhood.store.util.PredictionMarketsRequestHeaderPlugin$buildRequestHeader$1 */
    static final class C416371 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C416371(Continuation<? super C416371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PredictionMarketsRequestHeaderDelegate2.this.buildRequestHeader(this);
        }
    }

    public PredictionMarketsRequestHeaderDelegate2(ExperimentsProvider experimentsProvider) {
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        this.experimentsProvider = experimentsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buildRequestHeader(Continuation<? super Map<String, String>> continuation) {
        C416371 c416371;
        if (continuation instanceof C416371) {
            c416371 = (C416371) continuation;
            int i = c416371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c416371.label = i - Integer.MIN_VALUE;
            } else {
                c416371 = new C416371(continuation);
            }
        }
        C416371 c4163712 = c416371;
        Object state$default = c4163712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4163712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(state$default);
            ExperimentsProvider experimentsProvider = this.experimentsProvider;
            ProcessInvariantExperiment[] processInvariantExperimentArr = {EventContractsPredictionMarketsTestingExperiment.INSTANCE};
            c4163712.label = 1;
            state$default = ExperimentsProvider.DefaultImpls.getState$default(experimentsProvider, processInvariantExperimentArr, false, null, c4163712, 6, null);
            if (state$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(state$default);
        }
        if (((Boolean) state$default).booleanValue()) {
            return MapsKt.mapOf(Tuples4.m3642to("Rh-Prediction-Markets-Testing", "true"));
        }
        return MapsKt.emptyMap();
    }
}
