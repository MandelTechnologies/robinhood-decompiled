package com.robinhood.librobinhood.data.store;

import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.Throwables;
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
import nummus.p512v1.AccountPreferenceRetrieveRequestDto;
import nummus.p512v1.AccountPreferenceRetrieveResponseDto;
import nummus.p512v1.RestNummusService;

/* compiled from: CryptoAccountPreferencesStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Either;", "Lnummus/v1/AccountPreferenceRetrieveResponseDto;", "Lnummus/v1/AccountPreferencePutResponseDto;", "requestDto", "Lnummus/v1/AccountPreferenceRetrieveRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore$accountPreferencesEndpoint$1", m3645f = "CryptoAccountPreferencesStore.kt", m3646l = {49, 48, 56, 55}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore$accountPreferencesEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoAccountPreferencesStore4 extends ContinuationImpl7 implements Function2<AccountPreferenceRetrieveRequestDto, Continuation<? super Either<? extends AccountPreferenceRetrieveResponseDto, ? extends AccountPreferencePutResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CryptoAccountPreferencesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAccountPreferencesStore4(CryptoAccountPreferencesStore cryptoAccountPreferencesStore, Continuation<? super CryptoAccountPreferencesStore4> continuation) {
        super(2, continuation);
        this.this$0 = cryptoAccountPreferencesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoAccountPreferencesStore4 cryptoAccountPreferencesStore4 = new CryptoAccountPreferencesStore4(this.this$0, continuation);
        cryptoAccountPreferencesStore4.L$0 = obj;
        return cryptoAccountPreferencesStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AccountPreferenceRetrieveRequestDto accountPreferenceRetrieveRequestDto, Continuation<? super Either<? extends AccountPreferenceRetrieveResponseDto, ? extends AccountPreferencePutResponseDto>> continuation) {
        return invoke2(accountPreferenceRetrieveRequestDto, (Continuation<? super Either<AccountPreferenceRetrieveResponseDto, AccountPreferencePutResponseDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AccountPreferenceRetrieveRequestDto accountPreferenceRetrieveRequestDto, Continuation<? super Either<AccountPreferenceRetrieveResponseDto, AccountPreferencePutResponseDto>> continuation) {
        return ((CryptoAccountPreferencesStore4) create(accountPreferenceRetrieveRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r10 == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        RestNummusService restNummusService;
        AccountPreferenceRetrieveRequestDto accountPreferenceRetrieveRequestDto;
        RestNummusService restNummusService2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            Integer httpStatusCode = Throwables.getHttpStatusCode(e);
            if (httpStatusCode != null && httpStatusCode.intValue() == 404) {
                restNummusService = this.this$0.nummusService;
                CryptoAccountPreferencesStore cryptoAccountPreferencesStore = this.this$0;
                this.L$0 = restNummusService;
                this.L$1 = null;
                this.label = 3;
                obj = cryptoAccountPreferencesStore.getCryptoAccountId(this);
                if (obj != coroutine_suspended) {
                }
            } else {
                throw e;
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            accountPreferenceRetrieveRequestDto = (AccountPreferenceRetrieveRequestDto) this.L$0;
            RestNummusService restNummusService3 = this.this$0.nummusService;
            CryptoAccountPreferencesStore cryptoAccountPreferencesStore2 = this.this$0;
            this.L$0 = restNummusService3;
            this.L$1 = accountPreferenceRetrieveRequestDto;
            this.label = 1;
            Object cryptoAccountId = cryptoAccountPreferencesStore2.getCryptoAccountId(this);
            if (cryptoAccountId == coroutine_suspended) {
                return coroutine_suspended;
            }
            restNummusService2 = restNummusService3;
            obj = cryptoAccountId;
        } else if (i == 1) {
            accountPreferenceRetrieveRequestDto = (AccountPreferenceRetrieveRequestDto) this.L$1;
            restNummusService2 = (RestNummusService) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return new Either.Left(obj);
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new Either.Right(obj);
            }
            restNummusService = (RestNummusService) this.L$0;
            ResultKt.throwOnFailure(obj);
            AccountPreferencePutRequestDto accountPreferencePutRequestDto = new AccountPreferencePutRequestDto((String) obj, null, 2, null);
            this.L$0 = null;
            this.label = 4;
            obj = restNummusService.AccountPreferencePut(accountPreferencePutRequestDto, this);
        }
        AccountPreferenceRetrieveRequestDto accountPreferenceRetrieveRequestDtoCopy = accountPreferenceRetrieveRequestDto.copy((String) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = restNummusService2.AccountPreferenceRetrieve(accountPreferenceRetrieveRequestDtoCopy, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return new Either.Left(obj);
    }
}
