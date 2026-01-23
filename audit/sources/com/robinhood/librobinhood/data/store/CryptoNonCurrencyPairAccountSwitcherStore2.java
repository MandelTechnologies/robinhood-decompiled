package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import bonfire.proto.idl.crypto.p033v1.GetNonCurrencyPairAccountSwitcherRequestDto;
import bonfire.proto.idl.crypto.p033v1.GetNonCurrencyPairAccountSwitcherResponseDto;
import com.robinhood.models.crypto.p314db.CryptoNonCurrencyPairAccountSwitcher;
import com.robinhood.models.crypto.p314db.CryptoNonCurrencyPairAccountSwitcher2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoNonCurrencyPairAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/CryptoNonCurrencyPairAccountSwitcher;", "currencyPairId", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore$accountSwitcherForNonCurrencyPairEndpoint$1", m3645f = "CryptoNonCurrencyPairAccountSwitcherStore.kt", m3646l = {35}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore$accountSwitcherForNonCurrencyPairEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoNonCurrencyPairAccountSwitcherStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super CryptoNonCurrencyPairAccountSwitcher>, Object> {
    int label;
    final /* synthetic */ CryptoNonCurrencyPairAccountSwitcherStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoNonCurrencyPairAccountSwitcherStore2(CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore, Continuation<? super CryptoNonCurrencyPairAccountSwitcherStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoNonCurrencyPairAccountSwitcherStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoNonCurrencyPairAccountSwitcherStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super CryptoNonCurrencyPairAccountSwitcher> continuation) {
        return ((CryptoNonCurrencyPairAccountSwitcherStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoService cryptoService = this.this$0.cryptoService;
            GetNonCurrencyPairAccountSwitcherRequestDto getNonCurrencyPairAccountSwitcherRequestDto = new GetNonCurrencyPairAccountSwitcherRequestDto();
            this.label = 1;
            obj = cryptoService.GetNonCurrencyPairAccountSwitcher(getNonCurrencyPairAccountSwitcherRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return CryptoNonCurrencyPairAccountSwitcher2.toDbModel((GetNonCurrencyPairAccountSwitcherResponseDto) obj);
    }
}
