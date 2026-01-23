package com.robinhood.android.lib.accountswitcher.sdui;

import com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherEvent;
import com.robinhood.models.p320db.Account;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: SduiAccountSwitcherDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherDuxo$onAccountSelected$1", m3645f = "SduiAccountSwitcherDuxo.kt", m3646l = {59}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherDuxo$onAccountSelected$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SduiAccountSwitcherDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    int label;
    final /* synthetic */ SduiAccountSwitcherDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SduiAccountSwitcherDuxo2(SduiAccountSwitcherDuxo sduiAccountSwitcherDuxo, String str, Continuation<? super SduiAccountSwitcherDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = sduiAccountSwitcherDuxo;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SduiAccountSwitcherDuxo2(this.this$0, this.$accountNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SduiAccountSwitcherDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Observable<Account> observableStreamAccount = this.this$0.accountProvider.streamAccount(this.$accountNumber);
            this.label = 1;
            obj = RxAwait3.awaitFirst(observableStreamAccount, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.submit(new SduiAccountSwitcherEvent.AccountSelected(this.$accountNumber, ((Account) obj).getBrokerageAccountType()));
        return Unit.INSTANCE;
    }
}
