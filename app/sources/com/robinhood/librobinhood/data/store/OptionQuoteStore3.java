package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.dao.OptionQuoteDao;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.LocalDate;

/* compiled from: OptionQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/robinhood/models/db/OptionInstrumentQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionQuoteStore$getQuotesForChainPaginated$1$1", m3645f = "OptionQuoteStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionQuoteStore$getQuotesForChainPaginated$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionQuoteStore3 extends ContinuationImpl7 implements Function2<FlowCollector<? super List<? extends OptionInstrumentQuote>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ LocalDate $expirationDate;
    final /* synthetic */ UUID $optionChainId;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionQuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionQuoteStore3(OptionQuoteStore optionQuoteStore, UUID uuid, LocalDate localDate, Continuation<? super OptionQuoteStore3> continuation) {
        super(2, continuation);
        this.this$0 = optionQuoteStore;
        this.$optionChainId = uuid;
        this.$expirationDate = localDate;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionQuoteStore3 optionQuoteStore3 = new OptionQuoteStore3(this.this$0, this.$optionChainId, this.$expirationDate, continuation);
        optionQuoteStore3.L$0 = obj;
        return optionQuoteStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends OptionInstrumentQuote>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<OptionInstrumentQuote>>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<OptionInstrumentQuote>> flowCollector, Continuation<? super Unit> continuation) {
        return ((OptionQuoteStore3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (r6.emit(r12, r11) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0070 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        int i;
        int i2;
        OptionQuoteStore3 optionQuoteStore3;
        FlowCollector flowCollector2;
        int i3;
        int size;
        int i4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            i = 0;
            i2 = 35;
            if (i2 != 35) {
            }
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = this.I$1;
                size = this.I$0;
                flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = i4;
                i2 = size;
                flowCollector = flowCollector2;
                if (i2 != 35) {
                    OptionQuoteDao optionQuoteDao = this.this$0.dao;
                    UUID uuid = this.$optionChainId;
                    LocalDate localDate = this.$expirationDate;
                    this.L$0 = flowCollector;
                    this.I$0 = i;
                    this.label = 1;
                    optionQuoteStore3 = this;
                    Object optionQuotesPaginated = optionQuoteDao.getOptionQuotesPaginated(uuid, localDate, 35, i, optionQuoteStore3);
                    if (optionQuotesPaginated != coroutine_suspended) {
                        flowCollector2 = flowCollector;
                        obj = optionQuotesPaginated;
                        i3 = i;
                        List list = (List) obj;
                        size = list.size();
                        i4 = i3 + 35;
                        optionQuoteStore3.L$0 = flowCollector2;
                        optionQuoteStore3.I$0 = size;
                        optionQuoteStore3.I$1 = i4;
                        optionQuoteStore3.label = 2;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            i3 = this.I$0;
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            optionQuoteStore3 = this;
            flowCollector2 = flowCollector3;
            List list2 = (List) obj;
            size = list2.size();
            i4 = i3 + 35;
            optionQuoteStore3.L$0 = flowCollector2;
            optionQuoteStore3.I$0 = size;
            optionQuoteStore3.I$1 = i4;
            optionQuoteStore3.label = 2;
        }
    }
}
