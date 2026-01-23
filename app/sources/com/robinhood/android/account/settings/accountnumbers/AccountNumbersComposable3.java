package com.robinhood.android.account.settings.accountnumbers;

import bonfire.proto.idl.accounts.p028v1.AccountNumbersActionDto;
import com.robinhood.utils.compose.ClipboardUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountNumbersComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt$AccountNumbersScreen$2$dtoActionHandler$1$handle$1", m3645f = "AccountNumbersComposable.kt", m3646l = {67}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.account.settings.accountnumbers.AccountNumbersComposableKt$AccountNumbersScreen$2$dtoActionHandler$1$handle$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountNumbersComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountNumbersActionDto.ActionDto $action;
    final /* synthetic */ ClipboardUtil $clipboardUtil;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountNumbersComposable3(ClipboardUtil clipboardUtil, AccountNumbersActionDto.ActionDto actionDto, Continuation<? super AccountNumbersComposable3> continuation) {
        super(2, continuation);
        this.$clipboardUtil = clipboardUtil;
        this.$action = actionDto;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountNumbersComposable3(this.$clipboardUtil, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountNumbersComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ClipboardUtil clipboardUtil = this.$clipboardUtil;
            String account_number = ((AccountNumbersActionDto.ActionDto.CopyText) this.$action).getValue().getAccount_number();
            this.label = 1;
            if (ClipboardUtil.copyToClipboardWithHapticFeedback$default(clipboardUtil, account_number, false, this, 2, null) == coroutine_suspended) {
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
