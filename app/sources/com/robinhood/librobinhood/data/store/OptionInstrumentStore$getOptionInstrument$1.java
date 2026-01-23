package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiOptionInstrument;
import io.reactivex.Completable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: OptionInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionInstrument;", "optionInstrumentId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionInstrumentStore$getOptionInstrument$1", m3645f = "OptionInstrumentStore.kt", m3646l = {53, EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class OptionInstrumentStore$getOptionInstrument$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiOptionInstrument>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionInstrumentStore$getOptionInstrument$1(OptionInstrumentStore optionInstrumentStore, Continuation<? super OptionInstrumentStore$getOptionInstrument$1> continuation) {
        super(2, continuation);
        this.this$0 = optionInstrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionInstrumentStore$getOptionInstrument$1 optionInstrumentStore$getOptionInstrument$1 = new OptionInstrumentStore$getOptionInstrument$1(this.this$0, continuation);
        optionInstrumentStore$getOptionInstrument$1.L$0 = obj;
        return optionInstrumentStore$getOptionInstrument$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiOptionInstrument> continuation) {
        return ((OptionInstrumentStore$getOptionInstrument$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            OptionsApi optionsApi = this.this$0.optionsApi;
            this.label = 1;
            obj = optionsApi.getOptionInstrument(uuid, this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ApiOptionInstrument apiOptionInstrument = (ApiOptionInstrument) this.L$0;
            ResultKt.throwOnFailure(obj);
            return apiOptionInstrument;
        }
        ResultKt.throwOnFailure(obj);
        ApiOptionInstrument apiOptionInstrument2 = (ApiOptionInstrument) obj;
        Completable completablePingOptionChainsCompletable$default = OptionChainStore.pingOptionChainsCompletable$default(this.this$0.optionChainStore, CollectionsKt.listOf(apiOptionInstrument2.getChain_id()), false, 2, null);
        this.L$0 = apiOptionInstrument2;
        this.label = 2;
        return RxAwait3.await(completablePingOptionChainsCompletable$default, this) == coroutine_suspended ? coroutine_suspended : apiOptionInstrument2;
    }
}
