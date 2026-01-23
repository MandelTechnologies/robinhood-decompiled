package com.robinhood.android.redesigninvesting.store.volatility;

import com.robinhood.android.redesigninvesting.models.highlights.volatility.api.ApiFundamentalRisk;
import com.robinhood.android.redesigninvesting.models.highlights.volatility.p233db.FundamentalRisk;
import com.robinhood.android.redesigninvesting.models.highlights.volatility.p233db.FundamentalRisk2;
import com.robinhood.android.redesigninvesting.models.highlights.volatility.p233db.FundamentalRiskDao;
import com.robinhood.models.PaginatedResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FundamentalRiskStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "risks", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/redesigninvesting/models/highlights/volatility/api/ApiFundamentalRisk;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.volatility.FundamentalRiskStore$endpoint$2", m3645f = "FundamentalRiskStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.store.volatility.FundamentalRiskStore$endpoint$2, reason: use source file name */
/* loaded from: classes5.dex */
final class FundamentalRiskStore3 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiFundamentalRisk>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FundamentalRiskStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FundamentalRiskStore3(FundamentalRiskStore fundamentalRiskStore, Continuation<? super FundamentalRiskStore3> continuation) {
        super(2, continuation);
        this.this$0 = fundamentalRiskStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FundamentalRiskStore3 fundamentalRiskStore3 = new FundamentalRiskStore3(this.this$0, continuation);
        fundamentalRiskStore3.L$0 = obj;
        return fundamentalRiskStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiFundamentalRisk> paginatedResult, Continuation<? super Unit> continuation) {
        return ((FundamentalRiskStore3) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiFundamentalRisk> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiFundamentalRisk>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
            FundamentalRiskDao fundamentalRiskDao = this.this$0.dao;
            List<ApiFundamentalRisk> results = paginatedResult.getResults();
            ArrayList arrayList = new ArrayList();
            for (ApiFundamentalRisk apiFundamentalRisk : results) {
                FundamentalRisk dbModel = apiFundamentalRisk != null ? FundamentalRisk2.toDbModel(apiFundamentalRisk) : null;
                if (dbModel != null) {
                    arrayList.add(dbModel);
                }
            }
            fundamentalRiskDao.insert(arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
