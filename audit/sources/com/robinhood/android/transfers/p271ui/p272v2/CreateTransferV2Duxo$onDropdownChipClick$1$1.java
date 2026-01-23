package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.p271ui.p272v2.accounts.MicrogramConverters2;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.transfers.accounts.contracts.AccountSelectionBottomSheetService;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onDropdownChipClick$1$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {1072}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CreateTransferV2Duxo$onDropdownChipClick$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreateTransferV2DataState $state;
    int label;
    final /* synthetic */ CreateTransferV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferV2Duxo$onDropdownChipClick$1$1(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2Duxo$onDropdownChipClick$1$1> continuation) {
        super(2, continuation);
        this.this$0 = createTransferV2Duxo;
        this.$state = createTransferV2DataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferV2Duxo$onDropdownChipClick$1$1(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTransferV2Duxo$onDropdownChipClick$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountSelectionBottomSheetService accountSelectionBottomSheetService = this.this$0.accountSelectionService;
            TransferAccountDirection transferAccountDirection = TransferAccountDirection.SOURCE;
            TransferDirectionV2 direction = this.$state.getDirection();
            ApiCreateTransferRequest2 adjustedFrequency = CreateTransferV2DataState2.getAdjustedFrequency(this.$state);
            BigDecimal amount = this.$state.getAmount();
            String fromAccountId = this.$state.getFromAccountId();
            String toAccountId = this.$state.getToAccountId();
            IraContributionQuestionnaireResult.IraContribution iraContribution = this.$state.getIraContribution();
            IraContributionType iraContributionType = iraContribution != null ? iraContribution.getIraContributionType() : null;
            MAXTransferContext.EntryPoint entryPoint = this.this$0.getTransferConfiguration().getEntryPoint();
            this.label = 1;
            if (MicrogramConverters2.launchBottomSheet(accountSelectionBottomSheetService, transferAccountDirection, direction, adjustedFrequency, amount, (16 & 16) != 0 ? Currencies.USD : null, entryPoint, fromAccountId, toAccountId, iraContributionType, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
