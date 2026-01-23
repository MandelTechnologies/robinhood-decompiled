package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.GetAccioAccountRequestDto;
import bff_money_movement.service.p019v1.GetAccioAccountResponseDto;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GetAccioAccounts.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lbff_money_movement/service/v1/GetAccioAccountResponseDto;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.GetAccioAccountsKt$getAccioAccounts$2$1$1", m3645f = "GetAccioAccounts.kt", m3646l = {17}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.GetAccioAccountsKt$getAccioAccounts$2$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class GetAccioAccounts2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super GetAccioAccountResponseDto>, Object> {
    final /* synthetic */ String $id;
    final /* synthetic */ BffMoneyMovementService $this_getAccioAccounts;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAccioAccounts2(BffMoneyMovementService bffMoneyMovementService, String str, Continuation<? super GetAccioAccounts2> continuation) {
        super(2, continuation);
        this.$this_getAccioAccounts = bffMoneyMovementService;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetAccioAccounts2(this.$this_getAccioAccounts, this.$id, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GetAccioAccountResponseDto> continuation) {
        return ((GetAccioAccounts2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BffMoneyMovementService bffMoneyMovementService = this.$this_getAccioAccounts;
                GetAccioAccountRequestDto getAccioAccountRequestDto = new GetAccioAccountRequestDto(this.$id, null, null, null, 14, null);
                this.label = 1;
                obj = bffMoneyMovementService.GetAccioAccount(getAccioAccountRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (GetAccioAccountResponseDto) obj;
        } catch (Throwable th) {
            if (Throwables.isNetworkRelated(th)) {
                return null;
            }
            throw th;
        }
    }
}
