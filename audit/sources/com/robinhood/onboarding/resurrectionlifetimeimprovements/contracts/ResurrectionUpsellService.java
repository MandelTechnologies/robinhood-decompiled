package com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: ResurrectionUpsellService.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService;", "", "resurrectionTakeoverUpsellModel", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;", "upsellIdentifier", "", "source", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldShowPostDepositUpsell", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resurrectionUpsellWasShown", "", "loggingModel", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingModel;", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@ManagedServices(serviceName = "ResurrectionUpsellService")
/* loaded from: classes22.dex */
public interface ResurrectionUpsellService {
    Object resurrectionTakeoverUpsellModel(String str, String str2, Continuation<? super ResurrectionUpsellModel> continuation);

    Object resurrectionUpsellWasShown(ResurrectionUpsellLoggingModel resurrectionUpsellLoggingModel, Continuation<? super Unit> continuation);

    Object shouldShowPostDepositUpsell(String str, Continuation<? super Boolean> continuation);

    /* compiled from: ResurrectionUpsellService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object resurrectionTakeoverUpsellModel$default(ResurrectionUpsellService resurrectionUpsellService, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resurrectionTakeoverUpsellModel");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return resurrectionUpsellService.resurrectionTakeoverUpsellModel(str, str2, continuation);
        }
    }
}
