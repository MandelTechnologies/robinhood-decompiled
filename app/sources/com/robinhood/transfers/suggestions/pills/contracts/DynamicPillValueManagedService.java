package com.robinhood.transfers.suggestions.pills.contracts;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: DynamicPillValueManagedService.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006JN\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0011JH\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService;", "", "accept", "", "response", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveAmounts", "", "Lcom/robinhood/transfers/suggestions/pills/contracts/SuggestedAmount;", "source", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;", "sink", "entryPoint", "amount", "currency", "initialPrefilledAmount", "(Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePillValues", "", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "mg.dynamicpills")
/* loaded from: classes12.dex */
public interface DynamicPillValueManagedService {
    Object accept(String str, Continuation<? super Boolean> continuation);

    Object resolveAmounts(MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String str, String str2, String str3, String str4, Continuation<? super List<SuggestedAmount>> continuation);

    Object updatePillValues(MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String str, String str2, String str3, String str4, Continuation<? super Unit> continuation);

    /* compiled from: DynamicPillValueManagedService.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object updatePillValues$default(DynamicPillValueManagedService dynamicPillValueManagedService, MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String str, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePillValues");
            }
            if ((i & 1) != 0) {
                microgramTransferAccount = null;
            }
            if ((i & 2) != 0) {
                microgramTransferAccount2 = null;
            }
            return dynamicPillValueManagedService.updatePillValues(microgramTransferAccount, microgramTransferAccount2, str, str2, str3, str4, continuation);
        }

        public static /* synthetic */ Object resolveAmounts$default(DynamicPillValueManagedService dynamicPillValueManagedService, MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String str, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveAmounts");
            }
            if ((i & 1) != 0) {
                microgramTransferAccount = null;
            }
            if ((i & 2) != 0) {
                microgramTransferAccount2 = null;
            }
            return dynamicPillValueManagedService.resolveAmounts(microgramTransferAccount, microgramTransferAccount2, str, str2, str3, str4, continuation);
        }
    }
}
