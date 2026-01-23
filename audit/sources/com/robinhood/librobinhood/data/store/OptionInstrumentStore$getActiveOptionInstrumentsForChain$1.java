package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiOptionInstrument;
import com.robinhood.models.p320db.OptionContractType;
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
import p479j$.time.LocalDate;

/* compiled from: OptionInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionInstrument;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/GetActiveOptionInstrumentsForChainParams;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionInstrumentStore$getActiveOptionInstrumentsForChain$1", m3645f = "OptionInstrumentStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionInstrumentStore$getActiveOptionInstrumentsForChain$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends GetActiveOptionInstrumentsForChainParams, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiOptionInstrument>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionInstrumentStore$getActiveOptionInstrumentsForChain$1(OptionInstrumentStore optionInstrumentStore, Continuation<? super OptionInstrumentStore$getActiveOptionInstrumentsForChain$1> continuation) {
        super(2, continuation);
        this.this$0 = optionInstrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionInstrumentStore$getActiveOptionInstrumentsForChain$1 optionInstrumentStore$getActiveOptionInstrumentsForChain$1 = new OptionInstrumentStore$getActiveOptionInstrumentsForChain$1(this.this$0, continuation);
        optionInstrumentStore$getActiveOptionInstrumentsForChain$1.L$0 = obj;
        return optionInstrumentStore$getActiveOptionInstrumentsForChain$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends GetActiveOptionInstrumentsForChainParams, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiOptionInstrument>> continuation) {
        return invoke2((Tuples2<GetActiveOptionInstrumentsForChainParams, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiOptionInstrument>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<GetActiveOptionInstrumentsForChainParams, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiOptionInstrument>> continuation) {
        return ((OptionInstrumentStore$getActiveOptionInstrumentsForChain$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        GetActiveOptionInstrumentsForChainParams getActiveOptionInstrumentsForChainParams = (GetActiveOptionInstrumentsForChainParams) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        UUID optionChainId = getActiveOptionInstrumentsForChainParams.getOptionChainId();
        OptionContractType optionContractType = getActiveOptionInstrumentsForChainParams.getOptionContractType();
        LocalDate expirationDates = getActiveOptionInstrumentsForChainParams.getExpirationDates();
        OptionsApi optionsApi = this.this$0.optionsApi;
        String serverValue = optionContractType != null ? optionContractType.getServerValue() : null;
        String string2 = expirationDates.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object activeOptionInstrumentsForChain = optionsApi.getActiveOptionInstrumentsForChain(optionChainId, serverValue, string2, value, 1000, this);
        return activeOptionInstrumentsForChain == coroutine_suspended ? coroutine_suspended : activeOptionInstrumentsForChain;
    }
}
