package com.robinhood.shared.microgram.common.services;

import com.robinhood.analytics.experiments.ExperimentExposureLogger;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.microgram.experimentation.MicrogramExperimentManager;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RealMicrogramExperimentManager.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/microgram/common/services/RealMicrogramExperimentManager;", "Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager;", "experimentProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "exposureLogger", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "<init>", "(Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;)V", "logExposure", "", "experimentName", "", "variant", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "variationForExperiment", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-common-services_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class RealMicrogramExperimentManager implements MicrogramExperimentManager {
    private final ExperimentsProvider experimentProvider;
    private final ExperimentExposureLogger exposureLogger;

    /* compiled from: RealMicrogramExperimentManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.microgram.common.services.RealMicrogramExperimentManager", m3645f = "RealMicrogramExperimentManager.kt", m3646l = {31}, m3647m = "variationForExperiment")
    /* renamed from: com.robinhood.shared.microgram.common.services.RealMicrogramExperimentManager$variationForExperiment$1 */
    static final class C391861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C391861(Continuation<? super C391861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealMicrogramExperimentManager.this.variationForExperiment(null, false, this);
        }
    }

    public RealMicrogramExperimentManager(ExperimentsProvider experimentProvider, ExperimentExposureLogger exposureLogger) {
        Intrinsics.checkNotNullParameter(experimentProvider, "experimentProvider");
        Intrinsics.checkNotNullParameter(exposureLogger, "exposureLogger");
        this.experimentProvider = experimentProvider;
        this.exposureLogger = exposureLogger;
    }

    @Override // com.robinhood.microgram.experimentation.MicrogramExperimentManager
    public Object logExposure(String str, String str2, Continuation<? super Unit> continuation) {
        this.exposureLogger.logExposure(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.microgram.experimentation.MicrogramExperimentManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object variationForExperiment(String str, boolean z, Continuation<? super String> continuation) {
        C391861 c391861;
        if (continuation instanceof C391861) {
            c391861 = (C391861) continuation;
            int i = c391861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c391861.label = i - Integer.MIN_VALUE;
            } else {
                c391861 = new C391861(continuation);
            }
        }
        Object objFirst = c391861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c391861.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<String> flowCoStreamVariation = this.experimentProvider.coStreamVariation(str, z);
            c391861.label = 1;
            objFirst = FlowKt.first(flowCoStreamVariation, c391861);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        String str2 = (String) objFirst;
        return str2 == null ? KaizenExperiment.VARIATION_CONTROL : str2;
    }
}
