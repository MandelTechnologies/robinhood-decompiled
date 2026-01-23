package com.robinhood.android.incentives.wonka;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.service_incentives_wonka.proto.p504v1.ContinueTransferRequestDto;
import microgram.contracts.service_incentives_wonka.proto.p504v1.ContinueTransferResponseDto;
import microgram.contracts.service_incentives_wonka.proto.p504v1.ExitTransferFlowRequestDto;
import microgram.contracts.service_incentives_wonka.proto.p504v1.ExitTransferFlowResponseDto;
import microgram.contracts.service_incentives_wonka.proto.p504v1.IncentivesWonkaService;
import microgram.contracts.service_incentives_wonka.proto.p504v1.PromotionUnlockedRequestDto;
import microgram.contracts.service_incentives_wonka.proto.p504v1.PromotionUnlockedResponseDto;
import timber.log.Timber;

/* compiled from: RealWonkaService.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/incentives/wonka/RealWonkaService;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;)V", "transferInteractionHandler", "Lcom/robinhood/android/incentives/wonka/TransferInteractionHandler;", "PromotionUnlocked", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/PromotionUnlockedResponseDto;", "request", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/PromotionUnlockedRequestDto;", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/PromotionUnlockedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureCachedInterestRateIsRefreshed", "", "ContinueTransfer", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ContinueTransferResponseDto;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ContinueTransferRequestDto;", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/ContinueTransferRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ExitTransferFlow", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ExitTransferFlowResponseDto;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ExitTransferFlowRequestDto;", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/ExitTransferFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTransferInteractionHandler", "handler", "lib-wonka_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class RealWonkaService implements IncentivesWonkaService {
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsInterestStore sweepsInterestStore;
    private TransferInteractionHandler transferInteractionHandler;

    public Object ContinueTransfer(Request<ContinueTransferRequestDto> request, Continuation<? super Response<ContinueTransferResponseDto>> continuation) {
        return IncentivesWonkaService.DefaultImpls.ContinueTransfer(this, request, continuation);
    }

    public Object ExitTransferFlow(Request<ExitTransferFlowRequestDto> request, Continuation<? super Response<ExitTransferFlowResponseDto>> continuation) {
        return IncentivesWonkaService.DefaultImpls.ExitTransferFlow(this, request, continuation);
    }

    public Object PromotionUnlocked(Request<PromotionUnlockedRequestDto> request, Continuation<? super Response<PromotionUnlockedResponseDto>> continuation) {
        return IncentivesWonkaService.DefaultImpls.PromotionUnlocked(this, request, continuation);
    }

    public RealWonkaService(SweepsInterestStore sweepsInterestStore, SweepEnrollmentStore sweepEnrollmentStore) {
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        this.sweepsInterestStore = sweepsInterestStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
    }

    @Override // microgram.contracts.service_incentives_wonka.proto.p504v1.IncentivesWonkaService
    public Object PromotionUnlocked(PromotionUnlockedRequestDto promotionUnlockedRequestDto, Continuation<? super PromotionUnlockedResponseDto> continuation) {
        ensureCachedInterestRateIsRefreshed();
        return new PromotionUnlockedResponseDto();
    }

    private final void ensureCachedInterestRateIsRefreshed() {
        Timber.INSTANCE.mo3350d("ensureCachedInterestRateIsRefreshed()", new Object[0]);
        this.sweepsInterestStore.refreshNoAccountNumber(true);
        SweepEnrollmentStore.refreshSweepSplash$default(this.sweepEnrollmentStore, null, true, 1, null);
    }

    @Override // microgram.contracts.service_incentives_wonka.proto.p504v1.IncentivesWonkaService
    public Object ContinueTransfer(ContinueTransferRequestDto continueTransferRequestDto, Continuation<? super ContinueTransferResponseDto> continuation) {
        TransferInteractionHandler transferInteractionHandler = this.transferInteractionHandler;
        if (transferInteractionHandler != null) {
            transferInteractionHandler.onTransferContinueRequested();
        }
        return new ContinueTransferResponseDto();
    }

    @Override // microgram.contracts.service_incentives_wonka.proto.p504v1.IncentivesWonkaService
    public Object ExitTransferFlow(ExitTransferFlowRequestDto exitTransferFlowRequestDto, Continuation<? super ExitTransferFlowResponseDto> continuation) {
        TransferInteractionHandler transferInteractionHandler = this.transferInteractionHandler;
        if (transferInteractionHandler != null) {
            transferInteractionHandler.onTransferExitRequested();
        }
        return new ExitTransferFlowResponseDto();
    }

    public final void updateTransferInteractionHandler(TransferInteractionHandler handler) {
        this.transferInteractionHandler = handler;
    }
}
