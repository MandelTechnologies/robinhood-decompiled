package com.robinhood.api.utils;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;

/* compiled from: ApiExperimentManager.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/api/utils/ApiExperimentManager;", "", "shouldEnableFullExtendedHours", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Empty", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface ApiExperimentManager {
    Object shouldEnableFullExtendedHours(Continuation<? super Boolean> continuation);

    /* compiled from: ApiExperimentManager.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/api/utils/ApiExperimentManager$Empty;", "Lcom/robinhood/api/utils/ApiExperimentManager;", "<init>", "()V", "shouldEnableFullExtendedHours", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Empty implements ApiExperimentManager {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // com.robinhood.api.utils.ApiExperimentManager
        public Object shouldEnableFullExtendedHours(Continuation<? super Boolean> continuation) {
            return boxing.boxBoolean(false);
        }
    }
}
