package com.robinhood.android.transfers;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TransfersHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/TransfersHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$1$1", m3645f = "TransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$1$1 extends ContinuationImpl7 implements Function2<TransfersHubViewState, Continuation<? super TransfersHubViewState>, Object> {
    final /* synthetic */ boolean $isAcatsRegionGateSupported;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$1$1(boolean z, Continuation<? super TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$1$1> continuation) {
        super(2, continuation);
        this.$isAcatsRegionGateSupported = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$1$1 transfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$1$1 = new TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$1$1(this.$isAcatsRegionGateSupported, continuation);
        transfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$1$1.L$0 = obj;
        return transfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransfersHubViewState transfersHubViewState, Continuation<? super TransfersHubViewState> continuation) {
        return ((TransfersHubDuxo$useFallbackNonOrderedSubscriptionPattern$1$1) create(transfersHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TransfersHubViewState transfersHubViewState = (TransfersHubViewState) this.L$0;
        return transfersHubViewState.copy((16255 & 1) != 0 ? transfersHubViewState.achRelationships : null, (16255 & 2) != 0 ? transfersHubViewState.activeDebitCardInstruments : null, (16255 & 4) != 0 ? transfersHubViewState.hasAutomaticDeposits : false, (16255 & 8) != 0 ? transfersHubViewState.isCashManagementEnabled : false, (16255 & 16) != 0 ? transfersHubViewState.hasRhyAccount : false, (16255 & 32) != 0 ? transfersHubViewState.pendingHistoryItems : null, (16255 & 64) != 0 ? transfersHubViewState.historyItems : null, (16255 & 128) != 0 ? transfersHubViewState.isUserInAutoDepositRecurringHookExperiment : false, (16255 & 256) != 0 ? transfersHubViewState.isInWithdrawableCashInfoExperiment : false, (16255 & 512) != 0 ? transfersHubViewState.isAcatsRegionGateSupported : this.$isAcatsRegionGateSupported, (16255 & 1024) != 0 ? transfersHubViewState.acatsBonusInfo : null, (16255 & 2048) != 0 ? transfersHubViewState.isInRetirementTransferExperiment : false, (16255 & 4096) != 0 ? transfersHubViewState.transferHubMicrogramSource : null, (16255 & 8192) != 0 ? transfersHubViewState.isLoading : false);
    }
}
