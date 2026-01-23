package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import bonfire.proto.idl.crypto.p033v1.GetCryptoCategoriesRequestDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoCategoriesResponseDto;
import com.robinhood.librobinhood.data.store.CryptoExploreCategoryStore;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreCategories;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreCategories2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoExploreCategoryStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "it", "Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore$ExploreCategoryRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoExploreCategoryStore$cryptoExploreCategoryEndpoint$1", m3645f = "CryptoExploreCategoryStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoExploreCategoryStore$cryptoExploreCategoryEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoExploreCategoryStore2 extends ContinuationImpl7 implements Function2<CryptoExploreCategoryStore.ExploreCategoryRequest, Continuation<? super CryptoExploreCategories>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoExploreCategoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoExploreCategoryStore2(CryptoExploreCategoryStore cryptoExploreCategoryStore, Continuation<? super CryptoExploreCategoryStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoExploreCategoryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoExploreCategoryStore2 cryptoExploreCategoryStore2 = new CryptoExploreCategoryStore2(this.this$0, continuation);
        cryptoExploreCategoryStore2.L$0 = obj;
        return cryptoExploreCategoryStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoExploreCategoryStore.ExploreCategoryRequest exploreCategoryRequest, Continuation<? super CryptoExploreCategories> continuation) {
        return ((CryptoExploreCategoryStore2) create(exploreCategoryRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CryptoExploreCategoryStore.ExploreCategoryRequest exploreCategoryRequest;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoExploreCategoryStore.ExploreCategoryRequest exploreCategoryRequest2 = (CryptoExploreCategoryStore.ExploreCategoryRequest) this.L$0;
            CryptoService cryptoService = this.this$0.cryptoService;
            GetCryptoCategoriesRequestDto getCryptoCategoriesRequestDto = new GetCryptoCategoriesRequestDto(exploreCategoryRequest2.getLocation().getServerValue(), exploreCategoryRequest2.getAssetType().getServerValue());
            this.L$0 = exploreCategoryRequest2;
            this.label = 1;
            Object objGetCryptoCategories = cryptoService.GetCryptoCategories(getCryptoCategoriesRequestDto, this);
            if (objGetCryptoCategories == coroutine_suspended) {
                return coroutine_suspended;
            }
            exploreCategoryRequest = exploreCategoryRequest2;
            obj = objGetCryptoCategories;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            exploreCategoryRequest = (CryptoExploreCategoryStore.ExploreCategoryRequest) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return CryptoExploreCategories2.toDbModel((GetCryptoCategoriesResponseDto) obj, exploreCategoryRequest.getAssetType(), exploreCategoryRequest.getLocation());
    }
}
