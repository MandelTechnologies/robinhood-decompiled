package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import bonfire.proto.idl.crypto.p033v1.GetCurrencyPairAccountSwitcherRequestDto;
import bonfire.proto.idl.crypto.p033v1.GetCurrencyPairAccountSwitcherResponseDto;
import com.robinhood.models.crypto.p314db.CryptoCurrencyPairAccountSwitcher;
import com.robinhood.models.crypto.p314db.CryptoCurrencyPairAccountSwitcher2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCurrencyPairAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;", "currencyPairId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore$accountSwitcherForCurrencyPairEndpoint$1", m3645f = "CryptoCurrencyPairAccountSwitcherStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore$accountSwitcherForCurrencyPairEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoCurrencyPairAccountSwitcherStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super CryptoCurrencyPairAccountSwitcher>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoCurrencyPairAccountSwitcherStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCurrencyPairAccountSwitcherStore2(CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, Continuation<? super CryptoCurrencyPairAccountSwitcherStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoCurrencyPairAccountSwitcherStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoCurrencyPairAccountSwitcherStore2 cryptoCurrencyPairAccountSwitcherStore2 = new CryptoCurrencyPairAccountSwitcherStore2(this.this$0, continuation);
        cryptoCurrencyPairAccountSwitcherStore2.L$0 = obj;
        return cryptoCurrencyPairAccountSwitcherStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super CryptoCurrencyPairAccountSwitcher> continuation) {
        return ((CryptoCurrencyPairAccountSwitcherStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            CryptoService cryptoService = this.this$0.cryptoService;
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            GetCurrencyPairAccountSwitcherRequestDto getCurrencyPairAccountSwitcherRequestDto = new GetCurrencyPairAccountSwitcherRequestDto(string2);
            this.label = 1;
            obj = cryptoService.GetCurrencyPairAccountSwitcher(getCurrencyPairAccountSwitcherRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return CryptoCurrencyPairAccountSwitcher2.toDbModel((GetCurrencyPairAccountSwitcherResponseDto) obj);
    }
}
