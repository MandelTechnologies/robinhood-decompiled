package com.robinhood.librobinhood.data.store.bonfire;

import acats_aggregation.service.p001v1.FeeReimbursementsHistoryItemDto;
import acats_aggregation.service.p001v1.FeeReimbursementsHistoryResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AcatsReimbursementExperiment;
import com.robinhood.models.acats.p299db.dao.AcatsReimbursementDao;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: AcatsReimbursementStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$acatsReimbursementsListEndpoint$2", m3645f = "AcatsReimbursementStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$acatsReimbursementsListEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AcatsReimbursementStore4 extends ContinuationImpl7 implements Function2<FeeReimbursementsHistoryResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsReimbursementStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsReimbursementStore4(AcatsReimbursementStore acatsReimbursementStore, Continuation<? super AcatsReimbursementStore4> continuation) {
        super(2, continuation);
        this.this$0 = acatsReimbursementStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsReimbursementStore4 acatsReimbursementStore4 = new AcatsReimbursementStore4(this.this$0, continuation);
        acatsReimbursementStore4.L$0 = obj;
        return acatsReimbursementStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FeeReimbursementsHistoryResponseDto feeReimbursementsHistoryResponseDto, Continuation<? super Unit> continuation) {
        return ((AcatsReimbursementStore4) create(feeReimbursementsHistoryResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        FeeReimbursementsHistoryResponseDto feeReimbursementsHistoryResponseDto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FeeReimbursementsHistoryResponseDto feeReimbursementsHistoryResponseDto2 = (FeeReimbursementsHistoryResponseDto) this.L$0;
            Single singleFirst = ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{AcatsReimbursementExperiment.INSTANCE}, false, null, 6, null).first(boxing.boxBoolean(false));
            Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
            this.L$0 = feeReimbursementsHistoryResponseDto2;
            this.label = 1;
            Object objAwait = RxAwait3.await(singleFirst, this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            feeReimbursementsHistoryResponseDto = feeReimbursementsHistoryResponseDto2;
            obj = objAwait;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            feeReimbursementsHistoryResponseDto = (FeeReimbursementsHistoryResponseDto) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            AcatsReimbursementDao acatsReimbursementDao = this.this$0.dao;
            List<FeeReimbursementsHistoryItemDto> results = feeReimbursementsHistoryResponseDto.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(AcatsReimbursementStore7.toDbModel((FeeReimbursementsHistoryItemDto) it.next()));
            }
            acatsReimbursementDao.insert(arrayList);
        }
        return Unit.INSTANCE;
    }
}
