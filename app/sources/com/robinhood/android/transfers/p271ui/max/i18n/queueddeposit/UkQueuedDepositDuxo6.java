package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositDuxo;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositEvent;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.p419ui.models.ProcessorStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UkQueuedDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, m3636d2 = {"toDuxoEvent", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent;", "Lcom/truelayer/payments/ui/models/ProcessorStatus;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "dataState", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult;", "duxo", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxoKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UkQueuedDepositDuxo6 {

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProcessorStatus.values().length];
            try {
                iArr[ProcessorStatus.AuthorizationRequired.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProcessorStatus.Authorizing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProcessorStatus.Executed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProcessorStatus.Settled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProcessorStatus.Revoked.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProcessorStatus.Failed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProcessorStatus.Authorized.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UkQueuedDepositEvent toDuxoEvent(ProcessorStatus processorStatus, UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit, UkQueuedDepositDataState ukQueuedDepositDataState) {
        switch (WhenMappings.$EnumSwitchMapping$0[processorStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return UkQueuedDepositEvent.TrueLayerMandateNotAuthorized.INSTANCE;
            case 6:
                return UkQueuedDepositEvent.TrueLayerMandateFailed.INSTANCE;
            case 7:
                return new UkQueuedDepositEvent.TrueLayerMandateAuthorized(ukQueuedDepositDataState.getUserInteractionEventDescriptor().getContext(), ukQueuedDeposit);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UkQueuedDepositEvent toDuxoEvent(UkQueuedDepositDuxo.SubmitDepositResult submitDepositResult, UkQueuedDepositDuxo ukQueuedDepositDuxo) {
        if (submitDepositResult instanceof UkQueuedDepositDuxo.SubmitDepositResult.QueuedDepositCreated) {
            UiPostTransferPage.UkQueuedDeposit uiModel = UiPostTransferPage2.toUiModel(((UkQueuedDepositDuxo.SubmitDepositResult.QueuedDepositCreated) submitDepositResult).getResponse());
            ukQueuedDepositDuxo.setPendingPostTransferPage$feature_transfers_externalRelease(uiModel);
            return new UkQueuedDepositEvent.ProcessTrueLayerMandate(uiModel.getMandateId(), uiModel.getResourceToken());
        }
        if (submitDepositResult instanceof UkQueuedDepositDuxo.SubmitDepositResult.StandardDepositCreated) {
            return new UkQueuedDepositEvent.NavigateAfterStandardDepositCreation(((UkQueuedDepositDuxo.SubmitDepositResult.StandardDepositCreated) submitDepositResult).getResponse());
        }
        if (!(submitDepositResult instanceof UkQueuedDepositDuxo.SubmitDepositResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        return new UkQueuedDepositEvent.Error(((UkQueuedDepositDuxo.SubmitDepositResult.Error) submitDepositResult).getThrowable());
    }
}
