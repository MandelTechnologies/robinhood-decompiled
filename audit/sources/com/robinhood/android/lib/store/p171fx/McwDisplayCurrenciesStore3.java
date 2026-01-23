package com.robinhood.android.lib.store.p171fx;

import com.robinhood.models.p325fx.p326db.DisplayCurrency;
import com.robinhood.models.p325fx.p326db.McwDisplayCurrencies;
import java.util.ArrayList;
import java.util.List;
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
import microgram.contracts.mcw_fx_rates.proto.p499v1.DisplayFxRate;
import microgram.contracts.mcw_fx_rates.proto.p499v1.GetFxRatesRequestDto;
import microgram.contracts.mcw_fx_rates.proto.p499v1.GetFxRatesResponseDto;
import microgram.contracts.mcw_fx_rates.proto.p499v1.McwFxRatesService;

/* compiled from: McwDisplayCurrenciesStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/fx/db/McwDisplayCurrencies;", "request", "Lmicrogram/contracts/mcw_fx_rates/proto/v1/GetFxRatesRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.fx.McwDisplayCurrenciesStore$mcwFxRatesEndpoint$2", m3645f = "McwDisplayCurrenciesStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.fx.McwDisplayCurrenciesStore$mcwFxRatesEndpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
final class McwDisplayCurrenciesStore3 extends ContinuationImpl7 implements Function2<GetFxRatesRequestDto, Continuation<? super McwDisplayCurrencies>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ McwDisplayCurrenciesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    McwDisplayCurrenciesStore3(McwDisplayCurrenciesStore mcwDisplayCurrenciesStore, Continuation<? super McwDisplayCurrenciesStore3> continuation) {
        super(2, continuation);
        this.this$0 = mcwDisplayCurrenciesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        McwDisplayCurrenciesStore3 mcwDisplayCurrenciesStore3 = new McwDisplayCurrenciesStore3(this.this$0, continuation);
        mcwDisplayCurrenciesStore3.L$0 = obj;
        return mcwDisplayCurrenciesStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetFxRatesRequestDto getFxRatesRequestDto, Continuation<? super McwDisplayCurrencies> continuation) {
        return ((McwDisplayCurrenciesStore3) create(getFxRatesRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetFxRatesRequestDto getFxRatesRequestDto = (GetFxRatesRequestDto) this.L$0;
            McwFxRatesService mcwFxRatesService = this.this$0.mcwFxRatesService;
            this.label = 1;
            obj = mcwFxRatesService.GetFxRates(getFxRatesRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List<DisplayFxRate> display_fx_rates = ((GetFxRatesResponseDto) obj).toProto().getDisplay_fx_rates();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(display_fx_rates, 10));
        for (DisplayFxRate displayFxRate : display_fx_rates) {
            arrayList.add(new DisplayCurrency(displayFxRate.getSymbol(), displayFxRate.getLabel(), displayFxRate.getCurrency_code_display(), displayFxRate.getCurrency()));
        }
        return new McwDisplayCurrencies(0, arrayList, 1, null);
    }
}
