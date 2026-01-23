package com.robinhood.android.transfers.p271ui.max;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.CreateTransferAccountDto;
import bff_money_movement.service.p019v1.GetTransferValidationRequestDto;
import bff_money_movement.service.p019v1.GetTransferValidationResponseDto;
import bff_money_movement.service.p019v1.TransferStateDto;
import bff_money_movement.service.p019v1.TransferValidationErrorDetailsDto;
import com.robinhood.android.lib.transfers.util.IdlConverters;
import com.robinhood.android.transfers.p271ui.max.ManagedValidationResult;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"runManagedValidationCheck", "Lcom/robinhood/android/transfers/ui/max/ManagedValidationResult;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo;", "state", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState;", "inReviewState", "", "(Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo;Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateTransferDuxoKt {

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxoKt", m3645f = "CreateTransferDuxo.kt", m3646l = {2430}, m3647m = "runManagedValidationCheck")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxoKt$runManagedValidationCheck$1 */
    static final class C306711 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C306711(Continuation<? super C306711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreateTransferDuxoKt.runManagedValidationCheck(null, null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object runManagedValidationCheck(CreateTransferDuxo createTransferDuxo, CreateTransferViewState createTransferViewState, boolean z, Continuation<? super ManagedValidationResult> continuation) {
        C306711 c306711;
        TransferStateDto transferStateDto;
        ManagementInfo managementInfo;
        ManagementInfo managementInfo2;
        if (continuation instanceof C306711) {
            c306711 = (C306711) continuation;
            int i = c306711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c306711.label = i - Integer.MIN_VALUE;
            } else {
                c306711 = new C306711(continuation);
            }
        }
        Object objGetTransferValidation = c306711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c306711.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetTransferValidation);
                TransferAccount sourceAccount = createTransferViewState.getSourceAccount();
                ManagementType management_type = (sourceAccount == null || (managementInfo2 = sourceAccount.getManagementInfo()) == null) ? null : managementInfo2.getManagement_type();
                TransferAccount sinkAccount = createTransferViewState.getSinkAccount();
                if (CollectionsKt.listOf((Object[]) new ManagementType[]{management_type, (sinkAccount == null || (managementInfo = sinkAccount.getManagementInfo()) == null) ? null : managementInfo.getManagement_type()}).contains(ManagementType.MANAGED)) {
                    createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxoKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreateTransferDuxoKt.runManagedValidationCheck$lambda$0((CreateTransferViewState) obj);
                        }
                    });
                    BffMoneyMovementService bffMoneyMovementService = createTransferDuxo.getBffMoneyMovementService();
                    if (z) {
                        transferStateDto = TransferStateDto.TRANSFER_STATE_REVIEW;
                    } else {
                        transferStateDto = TransferStateDto.TRANSFER_STATE_EDIT;
                    }
                    TransferStateDto transferStateDto2 = transferStateDto;
                    MoneyDto moneyDto = new MoneyDto(IdlDecimal2.toIdlDecimal(createTransferViewState.getAmount()), CurrencyDto.USD);
                    TransferAccount sourceAccount2 = createTransferViewState.getSourceAccount();
                    CreateTransferAccountDto transferAccountDto = sourceAccount2 != null ? IdlConverters.toTransferAccountDto(sourceAccount2) : null;
                    TransferAccount sinkAccount2 = createTransferViewState.getSinkAccount();
                    GetTransferValidationRequestDto getTransferValidationRequestDto = new GetTransferValidationRequestDto(transferStateDto2, null, moneyDto, transferAccountDto, sinkAccount2 != null ? IdlConverters.toTransferAccountDto(sinkAccount2) : null, 2, null);
                    c306711.L$0 = createTransferDuxo;
                    c306711.label = 1;
                    objGetTransferValidation = bffMoneyMovementService.GetTransferValidation(getTransferValidationRequestDto, c306711);
                    if (objGetTransferValidation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxoKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreateTransferDuxoKt.runManagedValidationCheck$lambda$1((CreateTransferViewState) obj);
                        }
                    });
                    return ManagedValidationResult.Continue.INSTANCE;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createTransferDuxo = (CreateTransferDuxo) c306711.L$0;
                ResultKt.throwOnFailure(objGetTransferValidation);
            }
            createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxoKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxoKt.runManagedValidationCheck$lambda$2((CreateTransferViewState) obj);
                }
            });
            final TransferValidationErrorDetailsDto error_details = ((GetTransferValidationResponseDto) objGetTransferValidation).getError_details();
            if (error_details != null) {
                createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxoKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferDuxoKt.runManagedValidationCheck$lambda$4$lambda$3(error_details, (CreateTransferViewState) obj);
                    }
                });
                ManagedValidationResult.ValidationErrorsWereDisplayed validationErrorsWereDisplayed = ManagedValidationResult.ValidationErrorsWereDisplayed.INSTANCE;
                if (validationErrorsWereDisplayed != null) {
                    return validationErrorsWereDisplayed;
                }
            }
            return ManagedValidationResult.Continue.INSTANCE;
        } catch (Exception e) {
            createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxoKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxoKt.runManagedValidationCheck$lambda$5((CreateTransferViewState) obj);
                }
            });
            return new ManagedValidationResult.ExceptionOccuredDuringValidation(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState runManagedValidationCheck$lambda$0(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, true, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -16385, -1, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState runManagedValidationCheck$lambda$1(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -16385, -1, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState runManagedValidationCheck$lambda$2(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -16385, -1, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState runManagedValidationCheck$lambda$4$lambda$3(TransferValidationErrorDetailsDto transferValidationErrorDetailsDto, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, new UiEvent(transferValidationErrorDetailsDto), false, null, false, false, -1, -1, 253951, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState runManagedValidationCheck$lambda$5(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -16385, -1, 262143, null);
    }
}
