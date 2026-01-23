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
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$10$1$1$1$1", m3645f = "CreateTransferDuxo.kt", m3646l = {385, 386}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CreateTransferDuxo$onCreate$10$1$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $it;
    final /* synthetic */ CreateTransferViewState $this_applyMutation;
    int label;
    final /* synthetic */ CreateTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferDuxo$onCreate$10$1$1$1$1(CreateTransferDuxo createTransferDuxo, String str, CreateTransferViewState createTransferViewState, Continuation<? super CreateTransferDuxo$onCreate$10$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = createTransferDuxo;
        this.$it = str;
        this.$this_applyMutation = createTransferViewState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferDuxo$onCreate$10$1$1$1$1(this.this$0, this.$it, this.$this_applyMutation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTransferDuxo$onCreate$10$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r12 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r3.updatePillValues(r4, r5, r6, r7, r8, r1, r11) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DynamicPillValueManagedService dynamicPillValueManagedService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DynamicPillValueManagedService dynamicPillValueManagedService2 = this.this$0.managedPillService;
            if (dynamicPillValueManagedService2 == null) {
                dynamicPillValueManagedService = this.this$0.managedPillService;
                if (dynamicPillValueManagedService != null) {
                    TransferAccount sourceAccount = this.$this_applyMutation.getSourceAccount();
                    MicrogramTransferAccount microgramPillAccount = sourceAccount != null ? PillConversions.toMicrogramPillAccount(sourceAccount) : null;
                    TransferAccount sinkAccount = this.$this_applyMutation.getSinkAccount();
                    MicrogramTransferAccount microgramPillAccount2 = sinkAccount != null ? PillConversions.toMicrogramPillAccount(sinkAccount) : null;
                    String lowerCase = this.$this_applyMutation.getTransferConfiguration().getEntryPoint().name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    String plainString = this.$this_applyMutation.getAmount().toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                    String currencyCode = Currencies.USD.getCurrencyCode();
                    Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
                    BigDecimal amount = ((BaseCreateTransferFragment.Args) CreateTransferDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getTransferConfiguration().getAmount();
                    String plainString2 = amount != null ? amount.toPlainString() : null;
                    this.label = 2;
                }
                return Unit.INSTANCE;
            }
            String str = this.$it;
            this.label = 1;
            obj = dynamicPillValueManagedService2.accept(str, this);
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        dynamicPillValueManagedService = this.this$0.managedPillService;
        if (dynamicPillValueManagedService != null) {
        }
        return Unit.INSTANCE;
    }
}
