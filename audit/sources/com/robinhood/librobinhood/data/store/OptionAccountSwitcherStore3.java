package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsAccountSwitcherBonfireApi;
import com.robinhood.models.api.accountswitcher.ApiOptionsAccountSwitcherLeg;
import com.robinhood.models.api.accountswitcher.ApiOptionsAccountSwitcherResponse2;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher2;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", "request", "Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore$optionsAccountSwitcherEndpoint$2", m3645f = "OptionAccountSwitcherStore.kt", m3646l = {44, 47, 50, 54}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore$optionsAccountSwitcherEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionAccountSwitcherStore3 extends ContinuationImpl7 implements Function2<OptionsAccountSwitcherId, Continuation<? super OptionsAccountSwitcher>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionAccountSwitcherStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionAccountSwitcherStore3(OptionAccountSwitcherStore optionAccountSwitcherStore, Continuation<? super OptionAccountSwitcherStore3> continuation) {
        super(2, continuation);
        this.this$0 = optionAccountSwitcherStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionAccountSwitcherStore3 optionAccountSwitcherStore3 = new OptionAccountSwitcherStore3(this.this$0, continuation);
        optionAccountSwitcherStore3.L$0 = obj;
        return optionAccountSwitcherStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionsAccountSwitcherId optionsAccountSwitcherId, Continuation<? super OptionsAccountSwitcher> continuation) {
        return ((OptionAccountSwitcherStore3) create(optionsAccountSwitcherId, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        OptionsAccountSwitcherId optionsAccountSwitcherId;
        ApiOptionsAccountSwitcherResponse2 apiOptionsAccountSwitcherResponse2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OptionsAccountSwitcherId optionsAccountSwitcherId2 = (OptionsAccountSwitcherId) this.L$0;
            if (optionsAccountSwitcherId2 instanceof OptionsAccountSwitcherId.AggregatePositionId) {
                OptionsAccountSwitcherBonfireApi optionsAccountSwitcherBonfireApi = this.this$0.optionsAccountSwitcherApi;
                UUID aggregatePositionId = ((OptionsAccountSwitcherId.AggregatePositionId) optionsAccountSwitcherId2).getAggregatePositionId();
                this.L$0 = optionsAccountSwitcherId2;
                this.label = 1;
                Object optionsAccountSwitcherWithAggregatePositionId = optionsAccountSwitcherBonfireApi.getOptionsAccountSwitcherWithAggregatePositionId(aggregatePositionId, this);
                if (optionsAccountSwitcherWithAggregatePositionId != coroutine_suspended) {
                    optionsAccountSwitcherId = optionsAccountSwitcherId2;
                    obj = optionsAccountSwitcherWithAggregatePositionId;
                    apiOptionsAccountSwitcherResponse2 = (ApiOptionsAccountSwitcherResponse2) obj;
                }
            } else if (optionsAccountSwitcherId2 instanceof OptionsAccountSwitcherId.InstrumentId) {
                OptionsAccountSwitcherBonfireApi optionsAccountSwitcherBonfireApi2 = this.this$0.optionsAccountSwitcherApi;
                UUID optionsInstrumentId = ((OptionsAccountSwitcherId.InstrumentId) optionsAccountSwitcherId2).getOptionsInstrumentId();
                this.L$0 = optionsAccountSwitcherId2;
                this.label = 2;
                Object optionsAccountSwitcherWithInstrumentId = optionsAccountSwitcherBonfireApi2.getOptionsAccountSwitcherWithInstrumentId(optionsInstrumentId, this);
                if (optionsAccountSwitcherWithInstrumentId != coroutine_suspended) {
                    optionsAccountSwitcherId = optionsAccountSwitcherId2;
                    obj = optionsAccountSwitcherWithInstrumentId;
                    apiOptionsAccountSwitcherResponse2 = (ApiOptionsAccountSwitcherResponse2) obj;
                }
            } else if (optionsAccountSwitcherId2 instanceof OptionsAccountSwitcherId.StrategyCode) {
                OptionsAccountSwitcherBonfireApi optionsAccountSwitcherBonfireApi3 = this.this$0.optionsAccountSwitcherApi;
                String strategyCode = ((OptionsAccountSwitcherId.StrategyCode) optionsAccountSwitcherId2).getStrategyCode();
                this.L$0 = optionsAccountSwitcherId2;
                this.label = 3;
                Object optionsAccountSwitcherWithStrategyCode = optionsAccountSwitcherBonfireApi3.getOptionsAccountSwitcherWithStrategyCode(strategyCode, this);
                if (optionsAccountSwitcherWithStrategyCode != coroutine_suspended) {
                    optionsAccountSwitcherId = optionsAccountSwitcherId2;
                    obj = optionsAccountSwitcherWithStrategyCode;
                    apiOptionsAccountSwitcherResponse2 = (ApiOptionsAccountSwitcherResponse2) obj;
                }
            } else if (optionsAccountSwitcherId2 instanceof OptionsAccountSwitcherId.OrderForm) {
                LazyMoshi lazyMoshi = this.this$0.moshi;
                Types types = Types.INSTANCE;
                JsonAdapter jsonAdapterAdapter = lazyMoshi.adapter(new TypeToken<List<? extends ApiOptionsAccountSwitcherLeg>>() { // from class: com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore$optionsAccountSwitcherEndpoint$2$invokeSuspend$$inlined$getAdapter$1
                }.getType());
                OptionsAccountSwitcherBonfireApi optionsAccountSwitcherBonfireApi4 = this.this$0.optionsAccountSwitcherApi;
                OptionsAccountSwitcherId.OrderForm orderForm = (OptionsAccountSwitcherId.OrderForm) optionsAccountSwitcherId2;
                UUID chainId = orderForm.getChainId();
                String json = jsonAdapterAdapter.toJson(orderForm.getLegs());
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.L$0 = optionsAccountSwitcherId2;
                this.label = 4;
                Object optionsAccountSwitcherWithChainIdAndLegs = optionsAccountSwitcherBonfireApi4.getOptionsAccountSwitcherWithChainIdAndLegs(chainId, json, this);
                if (optionsAccountSwitcherWithChainIdAndLegs != coroutine_suspended) {
                    optionsAccountSwitcherId = optionsAccountSwitcherId2;
                    obj = optionsAccountSwitcherWithChainIdAndLegs;
                    apiOptionsAccountSwitcherResponse2 = (ApiOptionsAccountSwitcherResponse2) obj;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            optionsAccountSwitcherId = (OptionsAccountSwitcherId) this.L$0;
            ResultKt.throwOnFailure(obj);
            apiOptionsAccountSwitcherResponse2 = (ApiOptionsAccountSwitcherResponse2) obj;
        } else if (i == 2) {
            optionsAccountSwitcherId = (OptionsAccountSwitcherId) this.L$0;
            ResultKt.throwOnFailure(obj);
            apiOptionsAccountSwitcherResponse2 = (ApiOptionsAccountSwitcherResponse2) obj;
        } else if (i == 3) {
            optionsAccountSwitcherId = (OptionsAccountSwitcherId) this.L$0;
            ResultKt.throwOnFailure(obj);
            apiOptionsAccountSwitcherResponse2 = (ApiOptionsAccountSwitcherResponse2) obj;
        } else {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            optionsAccountSwitcherId = (OptionsAccountSwitcherId) this.L$0;
            ResultKt.throwOnFailure(obj);
            apiOptionsAccountSwitcherResponse2 = (ApiOptionsAccountSwitcherResponse2) obj;
        }
        return OptionsAccountSwitcher2.toDbModel(apiOptionsAccountSwitcherResponse2, optionsAccountSwitcherId);
    }
}
