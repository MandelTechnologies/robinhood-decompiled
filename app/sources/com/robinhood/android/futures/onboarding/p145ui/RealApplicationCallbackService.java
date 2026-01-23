package com.robinhood.android.futures.onboarding.p145ui;

import com.robinhood.futures.application.contracts.ApplicationCallbackService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: RealApplicationCallbackService.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/RealApplicationCallbackService;", "Lcom/robinhood/futures/application/contracts/ApplicationCallbackService;", "<init>", "()V", "delegate", "getDelegate", "()Lcom/robinhood/futures/application/contracts/ApplicationCallbackService;", "setDelegate", "(Lcom/robinhood/futures/application/contracts/ApplicationCallbackService;)V", "continueFromFuturesInvestorProfile", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class RealApplicationCallbackService implements ApplicationCallbackService {
    public static final int $stable = 8;
    private ApplicationCallbackService delegate;

    public final ApplicationCallbackService getDelegate() {
        return this.delegate;
    }

    public final void setDelegate(ApplicationCallbackService applicationCallbackService) {
        this.delegate = applicationCallbackService;
    }

    @Override // com.robinhood.futures.application.contracts.ApplicationCallbackService
    public Object continueFromFuturesInvestorProfile(Continuation<? super Unit> continuation) {
        ApplicationCallbackService applicationCallbackService = this.delegate;
        if (applicationCallbackService == null) {
            return Unit.INSTANCE;
        }
        Object objContinueFromFuturesInvestorProfile = applicationCallbackService.continueFromFuturesInvestorProfile(continuation);
        return objContinueFromFuturesInvestorProfile == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objContinueFromFuturesInvestorProfile : Unit.INSTANCE;
    }
}
