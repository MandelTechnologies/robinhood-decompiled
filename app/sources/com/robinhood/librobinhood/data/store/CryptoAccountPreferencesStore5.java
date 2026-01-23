package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CryptoAccountPreferenceDao;
import com.robinhood.models.crypto.p314db.CryptoAccountPreferences;
import com.robinhood.models.crypto.p314db.CryptoAccountPreferences2;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import nummus.p512v1.AccountPreferencePutResponseDto;
import nummus.p512v1.AccountPreferenceRetrieveResponseDto;

/* compiled from: CryptoAccountPreferencesStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "either", "Lcom/robinhood/utils/Either;", "Lnummus/v1/AccountPreferenceRetrieveResponseDto;", "Lnummus/v1/AccountPreferencePutResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore$accountPreferencesEndpoint$2", m3645f = "CryptoAccountPreferencesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore$accountPreferencesEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoAccountPreferencesStore5 extends ContinuationImpl7 implements Function2<Either<? extends AccountPreferenceRetrieveResponseDto, ? extends AccountPreferencePutResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoAccountPreferencesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAccountPreferencesStore5(CryptoAccountPreferencesStore cryptoAccountPreferencesStore, Continuation<? super CryptoAccountPreferencesStore5> continuation) {
        super(2, continuation);
        this.this$0 = cryptoAccountPreferencesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoAccountPreferencesStore5 cryptoAccountPreferencesStore5 = new CryptoAccountPreferencesStore5(this.this$0, continuation);
        cryptoAccountPreferencesStore5.L$0 = obj;
        return cryptoAccountPreferencesStore5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Either<AccountPreferenceRetrieveResponseDto, AccountPreferencePutResponseDto> either, Continuation<? super Unit> continuation) {
        return ((CryptoAccountPreferencesStore5) create(either, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Either<? extends AccountPreferenceRetrieveResponseDto, ? extends AccountPreferencePutResponseDto> either, Continuation<? super Unit> continuation) {
        return invoke2((Either<AccountPreferenceRetrieveResponseDto, AccountPreferencePutResponseDto>) either, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CryptoAccountPreferences dbModel;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Either either = (Either) this.L$0;
            CryptoAccountPreferenceDao cryptoAccountPreferenceDao = this.this$0.cryptoAccountPreferencesDao;
            if (!(either instanceof Either.Left)) {
                if (!(either instanceof Either.Right)) {
                    throw new NoWhenBranchMatchedException();
                }
                dbModel = CryptoAccountPreferences2.toDbModel((AccountPreferencePutResponseDto) ((Either.Right) either).getValue());
            } else {
                dbModel = CryptoAccountPreferences2.toDbModel((AccountPreferenceRetrieveResponseDto) ((Either.Left) either).getValue());
            }
            cryptoAccountPreferenceDao.insert((CryptoAccountPreferenceDao) dbModel);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
