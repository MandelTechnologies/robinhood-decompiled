package com.robinhood.android.transfers.p271ui.p272v2.additionaldata;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.CreateTransferAccountDto;
import bff_money_movement.service.p019v1.GetTransferEligibilityRequestDto;
import bff_money_movement.service.p019v1.GetTransferEligibilityResponseDto;
import bff_money_movement.service.p019v1.TransferFrequencyDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.transfers.util.IdlConverters;
import com.robinhood.android.transfers.p271ui.p272v2.additionaldata.CreateTransferV2AdditionalDataClient;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import rosetta.payment_hub.p540v1.service.TransferTypeDto;

/* compiled from: CreateTransferV2AdditionalDataClient.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient$getAdditionalData$2$1$1", m3645f = "CreateTransferV2AdditionalDataClient.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient$getAdditionalData$2$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateTransferV2AdditionalDataClient2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FlowCollector<CreateTransferV2AdditionalDataClient.AdditionalDataState> $$this$flow;
    final /* synthetic */ CreateTransferV2AdditionalDataClient.Request $this_with;
    int label;
    final /* synthetic */ CreateTransferV2AdditionalDataClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CreateTransferV2AdditionalDataClient2(CreateTransferV2AdditionalDataClient createTransferV2AdditionalDataClient, CreateTransferV2AdditionalDataClient.Request request, FlowCollector<? super CreateTransferV2AdditionalDataClient.AdditionalDataState> flowCollector, Continuation<? super CreateTransferV2AdditionalDataClient2> continuation) {
        super(2, continuation);
        this.this$0 = createTransferV2AdditionalDataClient;
        this.$this_with = request;
        this.$$this$flow = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferV2AdditionalDataClient2(this.this$0, this.$this_with, this.$$this$flow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTransferV2AdditionalDataClient2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r1.emit(r4, r12) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r13.emit(r1, r12) != r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable unused) {
            FlowCollector<CreateTransferV2AdditionalDataClient.AdditionalDataState> flowCollector = this.$$this$flow;
            CreateTransferV2AdditionalDataClient.AdditionalDataState.RfpEligibilityLoaded rfpEligibilityLoaded = new CreateTransferV2AdditionalDataClient.AdditionalDataState.RfpEligibilityLoaded(false, null);
            this.label = 3;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BffMoneyMovementService bffMoneyMovementService = this.this$0.bffMoneyMovementService;
            TransferTypeDto transferTypeDto = IdlConverters.toTransferTypeDto(this.this$0.getTransferType$feature_transfers_externalRelease(this.$this_with));
            TransferAccount sourceAccount = this.$this_with.getSourceAccount();
            CreateTransferAccountDto transferAccountDto = sourceAccount != null ? IdlConverters.toTransferAccountDto(sourceAccount) : null;
            TransferAccount sinkAccount = this.$this_with.getSinkAccount();
            GetTransferEligibilityRequestDto getTransferEligibilityRequestDto = new GetTransferEligibilityRequestDto(transferTypeDto, transferAccountDto, sinkAccount != null ? IdlConverters.toTransferAccountDto(sinkAccount) : null, new MoneyDto(IdlDecimal2.toIdlDecimal(this.$this_with.getAmount()), CurrencyDto.USD), TransferFrequencyDto.TRANSFER_FREQUENCY_ONCE);
            this.label = 1;
            obj = bffMoneyMovementService.GetTransferEligibility(getTransferEligibilityRequestDto, this);
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        GetTransferEligibilityResponseDto getTransferEligibilityResponseDto = (GetTransferEligibilityResponseDto) obj;
        FlowCollector<CreateTransferV2AdditionalDataClient.AdditionalDataState> flowCollector2 = this.$$this$flow;
        CreateTransferV2AdditionalDataClient.AdditionalDataState.RfpEligibilityLoaded rfpEligibilityLoaded2 = new CreateTransferV2AdditionalDataClient.AdditionalDataState.RfpEligibilityLoaded(getTransferEligibilityResponseDto.is_eligible(), getTransferEligibilityResponseDto.getLocalized_message());
        this.label = 2;
    }
}
