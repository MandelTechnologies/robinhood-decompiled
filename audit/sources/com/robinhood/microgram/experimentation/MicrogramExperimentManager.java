package com.robinhood.microgram.experimentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: MicrogramExperimentManager.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager;", "", "logExposure", "", "experimentName", "", "variant", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "variationForExperiment", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "mg.experimentation")
/* loaded from: classes13.dex */
public interface MicrogramExperimentManager {
    Object logExposure(String str, String str2, Continuation<? super Unit> continuation);

    Object variationForExperiment(String str, boolean z, Continuation<? super String> continuation);

    /* compiled from: MicrogramExperimentManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object variationForExperiment$default(MicrogramExperimentManager microgramExperimentManager, String str, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: variationForExperiment");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return microgramExperimentManager.variationForExperiment(str, z, continuation);
        }
    }
}
