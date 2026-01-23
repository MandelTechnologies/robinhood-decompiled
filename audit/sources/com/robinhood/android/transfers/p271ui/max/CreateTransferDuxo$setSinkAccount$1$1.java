package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService;
import com.robinhood.transfers.suggestions.pills.contracts.MicrogramTransferAccount;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$setSinkAccount$1$1", m3645f = "CreateTransferDuxo.kt", m3646l = {1774}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CreateTransferDuxo$setSinkAccount$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransferAccount $account;
    final /* synthetic */ TransferAccount $newSourceAccount;
    final /* synthetic */ CreateTransferViewState $this_applyMutation;
    int label;
    final /* synthetic */ CreateTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferDuxo$setSinkAccount$1$1(CreateTransferDuxo createTransferDuxo, TransferAccount transferAccount, TransferAccount transferAccount2, CreateTransferViewState createTransferViewState, Continuation<? super CreateTransferDuxo$setSinkAccount$1$1> continuation) {
        super(2, continuation);
        this.this$0 = createTransferDuxo;
        this.$newSourceAccount = transferAccount;
        this.$account = transferAccount2;
        this.$this_applyMutation = createTransferViewState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferDuxo$setSinkAccount$1$1(this.this$0, this.$newSourceAccount, this.$account, this.$this_applyMutation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTransferDuxo$setSinkAccount$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DynamicPillValueManagedService dynamicPillValueManagedService = this.this$0.managedPillService;
            if (dynamicPillValueManagedService != null) {
                TransferAccount transferAccount = this.$newSourceAccount;
                MicrogramTransferAccount microgramPillAccount = transferAccount != null ? PillConversions.toMicrogramPillAccount(transferAccount) : null;
                TransferAccount transferAccount2 = this.$account;
                MicrogramTransferAccount microgramPillAccount2 = transferAccount2 != null ? PillConversions.toMicrogramPillAccount(transferAccount2) : null;
                String lowerCase = this.$this_applyMutation.getTransferConfiguration().getEntryPoint().name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String plainString = this.$this_applyMutation.getAmount().toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                String currencyCode = Currencies.USD.getCurrencyCode();
                Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
                BigDecimal amount = ((BaseCreateTransferFragment.Args) CreateTransferDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getTransferConfiguration().getAmount();
                String plainString2 = amount != null ? amount.toPlainString() : null;
                this.label = 1;
                if (dynamicPillValueManagedService.updatePillValues(microgramPillAccount, microgramPillAccount2, lowerCase, plainString, currencyCode, plainString2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
