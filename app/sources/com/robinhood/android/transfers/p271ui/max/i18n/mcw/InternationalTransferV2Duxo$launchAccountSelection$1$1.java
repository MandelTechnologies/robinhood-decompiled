package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.p271ui.p272v2.accounts.MicrogramConverters2;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.transfers.accounts.contracts.AccountSelectionBottomSheetService;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InternationalTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Duxo$launchAccountSelection$1$1", m3645f = "InternationalTransferV2Duxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InternationalTransferV2Duxo$launchAccountSelection$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransferAccountDirection $accountDirection;
    final /* synthetic */ InternationalTransferV2DataState $state;
    int label;
    final /* synthetic */ InternationalTransferV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternationalTransferV2Duxo$launchAccountSelection$1$1(InternationalTransferV2Duxo internationalTransferV2Duxo, InternationalTransferV2DataState internationalTransferV2DataState, TransferAccountDirection transferAccountDirection, Continuation<? super InternationalTransferV2Duxo$launchAccountSelection$1$1> continuation) {
        super(2, continuation);
        this.this$0 = internationalTransferV2Duxo;
        this.$state = internationalTransferV2DataState;
        this.$accountDirection = transferAccountDirection;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternationalTransferV2Duxo$launchAccountSelection$1$1(this.this$0, this.$state, this.$accountDirection, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternationalTransferV2Duxo$launchAccountSelection$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountSelectionBottomSheetService accountSelectionBottomSheetService = this.this$0.accountSelectionService;
            TransferDirectionV2 transferDirection = this.$state.getTransferDirection();
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = ApiCreateTransferRequest2.ONCE;
            BigDecimal decimalValue = this.$state.getAmount().getDecimalValue();
            Currency currency = this.$state.getAmount().getCurrency();
            TransferAccount sourceAccount = InternationalTransferV2StateProvider2.getSourceAccount(this.$state);
            String accountId = sourceAccount != null ? sourceAccount.getAccountId() : null;
            TransferAccount sinkAccount = InternationalTransferV2StateProvider2.getSinkAccount(this.$state);
            String accountId2 = sinkAccount != null ? sinkAccount.getAccountId() : null;
            MAXTransferContext.EntryPoint entryPoint = this.$state.getEntryPoint();
            TransferAccountDirection transferAccountDirection = this.$accountDirection;
            this.label = 1;
            if (MicrogramConverters2.launchBottomSheet(accountSelectionBottomSheetService, transferAccountDirection, transferDirection, apiCreateTransferRequest2, decimalValue, currency, entryPoint, accountId, accountId2, null, this) == coroutine_suspended) {
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
