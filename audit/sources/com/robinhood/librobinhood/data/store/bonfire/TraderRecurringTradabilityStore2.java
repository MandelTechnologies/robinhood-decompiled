package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.models.api.bonfire.ApiInstrumentRecurringTradability;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability2;
import com.robinhood.recurring.models.api.ApiAssetType;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: TraderRecurringTradabilityStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$newEndpoint$1", m3645f = "TraderRecurringTradabilityStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 59}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$newEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TraderRecurringTradabilityStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends ApiAssetType, ? extends UUID>, Continuation<? super InstrumentRecurringTradability>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TraderRecurringTradabilityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderRecurringTradabilityStore2(TraderRecurringTradabilityStore traderRecurringTradabilityStore, Continuation<? super TraderRecurringTradabilityStore2> continuation) {
        super(2, continuation);
        this.this$0 = traderRecurringTradabilityStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TraderRecurringTradabilityStore2 traderRecurringTradabilityStore2 = new TraderRecurringTradabilityStore2(this.this$0, continuation);
        traderRecurringTradabilityStore2.L$0 = obj;
        return traderRecurringTradabilityStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiAssetType, ? extends UUID> tuples2, Continuation<? super InstrumentRecurringTradability> continuation) {
        return invoke2((Tuples2<? extends ApiAssetType, UUID>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends ApiAssetType, UUID> tuples2, Continuation<? super InstrumentRecurringTradability> continuation) {
        return ((TraderRecurringTradabilityStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ApiAssetType apiAssetType;
        UUID uuid;
        String str;
        UUID uuid2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                apiAssetType = (ApiAssetType) tuples2.component1();
                UUID uuid3 = (UUID) tuples2.component2();
                this.this$0.accountProvider.refresh(false);
                Single<String> singleFirstOrError = this.this$0.accountProvider.streamIndividualAccountNumber().firstOrError();
                Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
                this.L$0 = apiAssetType;
                this.L$1 = uuid3;
                this.label = 1;
                Object objAwait = RxAwait3.await(singleFirstOrError, this);
                if (objAwait != coroutine_suspended) {
                    uuid = uuid3;
                    obj = objAwait;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uuid2 = (UUID) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    return InstrumentRecurringTradability2.toDbModel((ApiInstrumentRecurringTradability) obj);
                } catch (Exception unused) {
                    return new InstrumentRecurringTradability(uuid2, true, null);
                }
            }
            uuid = (UUID) this.L$1;
            apiAssetType = (ApiAssetType) this.L$0;
            ResultKt.throwOnFailure(obj);
            RecurringApi recurringApi = this.this$0.recurringApi;
            Intrinsics.checkNotNull(str);
            this.L$0 = uuid;
            this.L$1 = null;
            this.label = 2;
            obj = recurringApi.getRecurringTradability(apiAssetType, uuid, str, this);
            if (obj != coroutine_suspended) {
                uuid2 = uuid;
                return InstrumentRecurringTradability2.toDbModel((ApiInstrumentRecurringTradability) obj);
            }
            return coroutine_suspended;
        } catch (Exception unused2) {
            uuid2 = uuid;
            return new InstrumentRecurringTradability(uuid2, true, null);
        }
        str = (String) obj;
    }
}
