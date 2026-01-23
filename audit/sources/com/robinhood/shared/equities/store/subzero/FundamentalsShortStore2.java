package com.robinhood.shared.equities.store.subzero;

import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.shared.equities.store.subzero.FundamentalsShortStore;
import com.robinhood.shared.equities.subzero.ApiFundamentalsShort;
import com.robinhood.shared.equities.subzero.ApiFundamentalsShortData;
import com.robinhood.shared.equities.subzero.ApiFundamentalsShortResponseList;
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
import p479j$.time.LocalDate;

/* compiled from: FundamentalsShortStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShortData;", "request", "Lcom/robinhood/shared/equities/store/subzero/FundamentalsShortStore$FundamentalsShortRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.equities.store.subzero.FundamentalsShortStore$getFundamentalsShort$1", m3645f = "FundamentalsShortStore.kt", m3646l = {27}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.equities.store.subzero.FundamentalsShortStore$getFundamentalsShort$1, reason: use source file name */
/* loaded from: classes6.dex */
final class FundamentalsShortStore2 extends ContinuationImpl7 implements Function2<FundamentalsShortStore.FundamentalsShortRequest, Continuation<? super List<? extends ApiFundamentalsShortData>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FundamentalsShortStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FundamentalsShortStore2(FundamentalsShortStore fundamentalsShortStore, Continuation<? super FundamentalsShortStore2> continuation) {
        super(2, continuation);
        this.this$0 = fundamentalsShortStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FundamentalsShortStore2 fundamentalsShortStore2 = new FundamentalsShortStore2(this.this$0, continuation);
        fundamentalsShortStore2.L$0 = obj;
        return fundamentalsShortStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FundamentalsShortStore.FundamentalsShortRequest fundamentalsShortRequest, Continuation<? super List<ApiFundamentalsShortData>> continuation) {
        return ((FundamentalsShortStore2) create(fundamentalsShortRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FundamentalsShortStore.FundamentalsShortRequest fundamentalsShortRequest, Continuation<? super List<? extends ApiFundamentalsShortData>> continuation) {
        return invoke2(fundamentalsShortRequest, (Continuation<? super List<ApiFundamentalsShortData>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        List<ApiFundamentalsShort> data;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FundamentalsShortStore.FundamentalsShortRequest fundamentalsShortRequest = (FundamentalsShortStore.FundamentalsShortRequest) this.L$0;
            EquitiesBrokeback equitiesBrokeback = this.this$0.brokeback;
            List<String> instrumentIds = fundamentalsShortRequest.getInstrumentIds();
            LocalDate startDate = fundamentalsShortRequest.getStartDate();
            LocalDate endDate = fundamentalsShortRequest.getEndDate();
            this.label = 1;
            obj = equitiesBrokeback.getFundamentalsShort(instrumentIds, startDate, endDate, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiFundamentalsShortResponseList apiFundamentalsShortResponseList = (ApiFundamentalsShortResponseList) obj;
        if (apiFundamentalsShortResponseList == null || (data = apiFundamentalsShortResponseList.getData()) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ApiFundamentalsShort apiFundamentalsShort : data) {
            ApiFundamentalsShortData data2 = apiFundamentalsShort != null ? apiFundamentalsShort.getData() : null;
            if (data2 != null) {
                arrayList.add(data2);
            }
        }
        return arrayList;
    }
}
