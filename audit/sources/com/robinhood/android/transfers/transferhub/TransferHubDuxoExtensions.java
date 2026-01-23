package com.robinhood.android.transfers.transferhub;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.transfers.TransfersHubDuxo;
import com.robinhood.android.transfers.TransfersHubViewState;
import com.robinhood.android.transfers.contracts.InternalTransferSelection;
import com.robinhood.android.transfers.contracts.LimitsHubDetails;
import com.robinhood.android.transfers.contracts.RecurringDepositsHub;
import com.robinhood.android.transfers.contracts.RecurringDepositsListKey;
import com.robinhood.android.transfers.contracts.RecurringMaxTransfer;
import com.robinhood.android.transfers.transferhub.TransferHubEvent;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.transfers.hub.contracts.TransferConfigResponse;
import com.robinhood.transfers.hub.contracts.TransferHubConfigurationManagedService;
import com.robinhood.transfers.hub.contracts.TransferHubItemClickIdentifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TransferHubDuxoExtensions.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\n\u001aB\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"getPrefillTransferInfo", "Lcom/robinhood/android/transfers/transferhub/PrefillTransferInfo;", "configService", "Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService;", "rhsAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "rhyAccount", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "isWithdrawal", "", "(Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/RhyAccount;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapEvent", "", "Lcom/robinhood/android/transfers/TransfersHubDuxo;", "identifier", "Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;", "isInRecurringExtraCashExperiment", "(Lcom/robinhood/android/transfers/TransfersHubDuxo;Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/RhyAccount;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.transferhub.TransferHubDuxoExtensionsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferHubDuxoExtensions {

    /* compiled from: TransferHubDuxoExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.transferhub.TransferHubDuxoExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferHubItemClickIdentifier.values().length];
            try {
                iArr[TransferHubItemClickIdentifier.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferHubItemClickIdentifier.WITHDRAWAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferHubItemClickIdentifier.RECURRING_DEPOSITS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferHubItemClickIdentifier.TRANSFER_ACCOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransferHubItemClickIdentifier.MOVE_MONEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransferHubItemClickIdentifier.WIRE_TRANSFER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransferHubItemClickIdentifier.RETIREMENT_ACCOUNT_TRANSFER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TransferHubItemClickIdentifier.DIRECT_DEPOSITS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TransferHubItemClickIdentifier.LIMITS_HUB.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TransferHubItemClickIdentifier.TRANSFER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TransferHubItemClickIdentifier.TRANSFER_CRYPTO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: TransferHubDuxoExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.transferhub.TransferHubDuxoExtensionsKt", m3645f = "TransferHubDuxoExtensions.kt", m3646l = {22}, m3647m = "getPrefillTransferInfo")
    /* renamed from: com.robinhood.android.transfers.transferhub.TransferHubDuxoExtensionsKt$getPrefillTransferInfo$1 */
    static final class C305571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C305571(Continuation<? super C305571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferHubDuxoExtensions.getPrefillTransferInfo(null, null, null, false, this);
        }
    }

    /* compiled from: TransferHubDuxoExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.transferhub.TransferHubDuxoExtensionsKt", m3645f = "TransferHubDuxoExtensions.kt", m3646l = {43, 56}, m3647m = "mapEvent")
    /* renamed from: com.robinhood.android.transfers.transferhub.TransferHubDuxoExtensionsKt$mapEvent$1 */
    static final class C305581 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C305581(Continuation<? super C305581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferHubDuxoExtensions.mapEvent(null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getPrefillTransferInfo(TransferHubConfigurationManagedService transferHubConfigurationManagedService, TransferAccount transferAccount, RhyAccount rhyAccount, boolean z, Continuation<? super TransferHubEvent2> continuation) {
        C305571 c305571;
        if (continuation instanceof C305571) {
            c305571 = (C305571) continuation;
            int i = c305571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c305571.label = i - Integer.MIN_VALUE;
            } else {
                c305571 = new C305571(continuation);
            }
        }
        Object transferScreenPrefillData = c305571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c305571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(transferScreenPrefillData);
            boolean z2 = transferAccount != null;
            boolean z3 = rhyAccount != null;
            c305571.label = 1;
            transferScreenPrefillData = transferHubConfigurationManagedService.getTransferScreenPrefillData(z, z2, z3, c305571);
            if (transferScreenPrefillData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(transferScreenPrefillData);
        }
        TransferConfigResponse transferConfigResponse = (TransferConfigResponse) transferScreenPrefillData;
        ApiTransferAccount.TransferAccountType.Companion companion = ApiTransferAccount.TransferAccountType.INSTANCE;
        return new TransferHubEvent2(companion.fromServerValue(transferConfigResponse.getSource()), companion.fromServerValue(transferConfigResponse.getSink()));
    }

    static /* synthetic */ Object getPrefillTransferInfo$default(TransferHubConfigurationManagedService transferHubConfigurationManagedService, TransferAccount transferAccount, RhyAccount rhyAccount, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            transferAccount = null;
        }
        if ((i & 4) != 0) {
            rhyAccount = null;
        }
        return getPrefillTransferInfo(transferHubConfigurationManagedService, transferAccount, rhyAccount, z, continuation);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
    
        if (r1 == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010c, code lost:
    
        if (r1 == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010e, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object mapEvent(TransfersHubDuxo transfersHubDuxo, TransferHubItemClickIdentifier transferHubItemClickIdentifier, TransferHubConfigurationManagedService transferHubConfigurationManagedService, TransferAccount transferAccount, RhyAccount rhyAccount, boolean z, Continuation<? super Unit> continuation) {
        C305581 c305581;
        TransferHubEvent.RecurringDeposit recurringDeposit;
        if (continuation instanceof C305581) {
            c305581 = (C305581) continuation;
            int i = c305581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c305581.label = i - Integer.MIN_VALUE;
            } else {
                c305581 = new C305581(continuation);
            }
        }
        Object prefillTransferInfo = c305581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c305581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(prefillTransferInfo);
            switch (WhenMappings.$EnumSwitchMapping$0[transferHubItemClickIdentifier.ordinal()]) {
                case 1:
                    c305581.L$0 = transfersHubDuxo;
                    c305581.label = 1;
                    prefillTransferInfo = getPrefillTransferInfo(transferHubConfigurationManagedService, transferAccount, rhyAccount, false, c305581);
                    break;
                case 2:
                    c305581.L$0 = transfersHubDuxo;
                    c305581.label = 2;
                    prefillTransferInfo = getPrefillTransferInfo(transferHubConfigurationManagedService, transferAccount, rhyAccount, true, c305581);
                    break;
                case 3:
                    TransfersHubViewState value = transfersHubDuxo.getStateFlow().getValue();
                    if (z) {
                        recurringDeposit = new TransferHubEvent.RecurringDeposit(null, new RecurringDepositsHub(false, 1, null), 1, null);
                    } else if (value.getHasAutomaticDeposits() || value.isUserInAutoDepositRecurringHookExperiment()) {
                        recurringDeposit = new TransferHubEvent.RecurringDeposit(new RecurringDepositsListKey(null, null, 3, null), null, 2, null);
                    } else {
                        recurringDeposit = new TransferHubEvent.RecurringDeposit(null, new RecurringMaxTransfer(null, null, 3, null), 1, null);
                    }
                    transfersHubDuxo.submit(recurringDeposit);
                    break;
                case 4:
                    transfersHubDuxo.submit(TransferHubEvent.NavigateToAcatsIn.INSTANCE);
                    break;
                case 5:
                    transfersHubDuxo.submit(TransferHubEvent.NavigateToMoneyMovement.INSTANCE);
                    break;
                case 6:
                    transfersHubDuxo.submit(TransferHubEvent.NavigateToWires.INSTANCE);
                    break;
                case 7:
                    transfersHubDuxo.submit(TransferHubEvent.NavigateToRetirementAccountTransfer.INSTANCE);
                    break;
                case 8:
                    transfersHubDuxo.submit(TransferHubEvent.NavigateToDirectDeposits.INSTANCE);
                    break;
                case 9:
                    transfersHubDuxo.submit(new TransferHubEvent.Intent(new HostIntentKey.ShowFragmentInStandaloneRdsActivity(LimitsHubDetails.INSTANCE, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null)));
                    break;
                case 10:
                    transfersHubDuxo.submit(new TransferHubEvent.Intent(new HostIntentKey.ShowFragmentInStandaloneRdsActivity(InternalTransferSelection.INSTANCE, false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null)));
                    break;
                case 11:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (i2 == 1) {
            transfersHubDuxo = (TransfersHubDuxo) c305581.L$0;
            ResultKt.throwOnFailure(prefillTransferInfo);
            transfersHubDuxo.submit(new TransferHubEvent.NavigateToDeposits((TransferHubEvent2) prefillTransferInfo));
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transfersHubDuxo = (TransfersHubDuxo) c305581.L$0;
            ResultKt.throwOnFailure(prefillTransferInfo);
            transfersHubDuxo.submit(new TransferHubEvent.NavigateToWithdrawals((TransferHubEvent2) prefillTransferInfo));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object mapEvent$default(TransfersHubDuxo transfersHubDuxo, TransferHubItemClickIdentifier transferHubItemClickIdentifier, TransferHubConfigurationManagedService transferHubConfigurationManagedService, TransferAccount transferAccount, RhyAccount rhyAccount, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            transferAccount = null;
        }
        if ((i & 8) != 0) {
            rhyAccount = null;
        }
        return mapEvent(transfersHubDuxo, transferHubItemClickIdentifier, transferHubConfigurationManagedService, transferAccount, rhyAccount, z, continuation);
    }
}
