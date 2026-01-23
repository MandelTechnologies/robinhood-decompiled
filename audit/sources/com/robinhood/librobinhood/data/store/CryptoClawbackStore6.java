package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.api.rewards.ApiCryptoClawbackDetails;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoClawbackStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/rewards/ApiCryptoClawbackDetails;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoClawbackStore$paginatedEndpoint$1", m3645f = "CryptoClawbackStore.kt", m3646l = {69, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoClawbackStore$paginatedEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoClawbackStore6 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiCryptoClawbackDetails>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoClawbackStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoClawbackStore6(CryptoClawbackStore cryptoClawbackStore, Continuation<? super CryptoClawbackStore6> continuation) {
        super(2, continuation);
        this.this$0 = cryptoClawbackStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoClawbackStore6 cryptoClawbackStore6 = new CryptoClawbackStore6(this.this$0, continuation);
        cryptoClawbackStore6.L$0 = obj;
        return cryptoClawbackStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiCryptoClawbackDetails>> continuation) {
        return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiCryptoClawbackDetails>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiCryptoClawbackDetails>> continuation) {
        return ((CryptoClawbackStore6) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r7 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PaginationCursor paginationCursor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            paginationCursor = (PaginationCursor) ((Tuples2) this.L$0).component2();
            Flow<Boolean> flowStreamDepositMatchEuExperiment = this.this$0.cryptoExperimentsStore.streamDepositMatchEuExperiment();
            this.L$0 = paginationCursor;
            this.label = 1;
            obj = FlowKt.first(flowStreamDepositMatchEuExperiment, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (PaginatedResult) obj;
        }
        paginationCursor = (PaginationCursor) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            NummusApi nummusApi = this.this$0.nummus;
            String value = paginationCursor != null ? paginationCursor.getValue() : null;
            this.L$0 = null;
            this.label = 2;
            obj = nummusApi.getClawbacks(value, this);
        } else {
            return new PaginatedResult(CollectionsKt.emptyList(), null, null, 6, null);
        }
    }
}
