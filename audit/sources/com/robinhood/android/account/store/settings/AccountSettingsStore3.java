package com.robinhood.android.account.store.settings;

import bonfire.proto.idl.accounts.p028v1.AccountNumbersResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lbonfire/proto/idl/accounts/v1/AccountNumbersResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.account.store.settings.AccountSettingsStore$accountNumbersEndpoint$2", m3645f = "AccountSettingsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.account.store.settings.AccountSettingsStore$accountNumbersEndpoint$2, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountSettingsStore3 extends ContinuationImpl7 implements Function2<AccountNumbersResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountSettingsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSettingsStore3(AccountSettingsStore accountSettingsStore, Continuation<? super AccountSettingsStore3> continuation) {
        super(2, continuation);
        this.this$0 = accountSettingsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountSettingsStore3 accountSettingsStore3 = new AccountSettingsStore3(this.this$0, continuation);
        accountSettingsStore3.L$0 = obj;
        return accountSettingsStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountNumbersResponseDto accountNumbersResponseDto, Continuation<? super Unit> continuation) {
        return ((AccountSettingsStore3) create(accountNumbersResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.accountNumbersCache.setValue((AccountNumbersResponseDto) this.L$0);
        return Unit.INSTANCE;
    }
}
