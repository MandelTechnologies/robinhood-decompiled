package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.retrofit.Nummus;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCryptoOrder;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Some;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
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
import p479j$.time.Instant;

/* compiled from: CryptoOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCryptoOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoOrderStore$refreshAll$1$1$1", m3645f = "CryptoOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$refreshAll$1$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoOrderStore7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiCryptoOrder>>, Object> {
    final /* synthetic */ Optional<CryptoAccount> $account;
    final /* synthetic */ String $cursor;
    final /* synthetic */ Instant $updatedAtGte;
    int label;
    final /* synthetic */ CryptoOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderStore7(CryptoOrderStore cryptoOrderStore, String str, Instant instant, Optional<CryptoAccount> optional, Continuation<? super CryptoOrderStore7> continuation) {
        super(2, continuation);
        this.this$0 = cryptoOrderStore;
        this.$cursor = str;
        this.$updatedAtGte = instant;
        this.$account = optional;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoOrderStore7(this.this$0, this.$cursor, this.$updatedAtGte, this.$account, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiCryptoOrder>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiCryptoOrder>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiCryptoOrder>> continuation) {
        return ((CryptoOrderStore7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Nummus nummus2 = this.this$0.nummus;
        String str = this.$cursor;
        Instant instant = this.$updatedAtGte;
        try {
            uuid = StringsKt.toUuid(((CryptoAccount) ((Some) this.$account).getValue()).getId());
        } catch (IllegalArgumentException unused) {
            uuid = null;
        }
        this.label = 1;
        Object objFetchOrders = nummus2.fetchOrders(str, instant, uuid, this);
        return objFetchOrders == coroutine_suspended ? coroutine_suspended : objFetchOrders;
    }
}
