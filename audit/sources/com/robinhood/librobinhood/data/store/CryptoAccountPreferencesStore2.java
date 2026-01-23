package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import nummus.p512v1.AccountPreferencePutRequestDto;
import nummus.p512v1.AccountPreferencePutResponseDto;
import nummus.p512v1.RestNummusService;

/* compiled from: CryptoAccountPreferencesStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lnummus/v1/AccountPreferencePutResponseDto;", "requestDto", "Lnummus/v1/AccountPreferencePutRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore$accountPreferencePutEndpoint$1", m3645f = "CryptoAccountPreferencesStore.kt", m3646l = {80, 79}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore$accountPreferencePutEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoAccountPreferencesStore2 extends ContinuationImpl7 implements Function2<AccountPreferencePutRequestDto, Continuation<? super AccountPreferencePutResponseDto>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CryptoAccountPreferencesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAccountPreferencesStore2(CryptoAccountPreferencesStore cryptoAccountPreferencesStore, Continuation<? super CryptoAccountPreferencesStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoAccountPreferencesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoAccountPreferencesStore2 cryptoAccountPreferencesStore2 = new CryptoAccountPreferencesStore2(this.this$0, continuation);
        cryptoAccountPreferencesStore2.L$0 = obj;
        return cryptoAccountPreferencesStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountPreferencePutRequestDto accountPreferencePutRequestDto, Continuation<? super AccountPreferencePutResponseDto> continuation) {
        return ((CryptoAccountPreferencesStore2) create(accountPreferencePutRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        AccountPreferencePutRequestDto accountPreferencePutRequestDto;
        RestNummusService restNummusService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            accountPreferencePutRequestDto = (AccountPreferencePutRequestDto) this.L$0;
            RestNummusService restNummusService2 = this.this$0.nummusService;
            CryptoAccountPreferencesStore cryptoAccountPreferencesStore = this.this$0;
            this.L$0 = restNummusService2;
            this.L$1 = accountPreferencePutRequestDto;
            this.label = 1;
            Object cryptoAccountId = cryptoAccountPreferencesStore.getCryptoAccountId(this);
            if (cryptoAccountId != coroutine_suspended) {
                restNummusService = restNummusService2;
                obj = cryptoAccountId;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        accountPreferencePutRequestDto = (AccountPreferencePutRequestDto) this.L$1;
        restNummusService = (RestNummusService) this.L$0;
        ResultKt.throwOnFailure(obj);
        AccountPreferencePutRequestDto accountPreferencePutRequestDtoCopy$default = AccountPreferencePutRequestDto.copy$default(accountPreferencePutRequestDto, (String) obj, null, 2, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objAccountPreferencePut = restNummusService.AccountPreferencePut(accountPreferencePutRequestDtoCopy$default, this);
        return objAccountPreferencePut == coroutine_suspended ? coroutine_suspended : objAccountPreferencePut;
    }
}
