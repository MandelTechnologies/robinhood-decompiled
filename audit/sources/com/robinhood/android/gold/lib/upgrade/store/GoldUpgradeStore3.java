package com.robinhood.android.gold.lib.upgrade.store;

import com.robinhood.android.gold.lib.upgrade.api.ApiGoldSweepAgreementsFlow;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlowQueryParams;
import com.robinhood.android.gold.lib.upgrade.api.GoldUpgradeApi;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldUpgradeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldSweepAgreementsFlow;", "<destruct>", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlowQueryParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore$goldSweepAgreementsEndpoint$2", m3645f = "GoldUpgradeStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore$goldSweepAgreementsEndpoint$2, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldUpgradeStore3 extends ContinuationImpl7 implements Function2<ApiGoldUpgradeFlowQueryParams, Continuation<? super Result<? extends ApiGoldSweepAgreementsFlow>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldUpgradeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldUpgradeStore3(GoldUpgradeStore goldUpgradeStore, Continuation<? super GoldUpgradeStore3> continuation) {
        super(2, continuation);
        this.this$0 = goldUpgradeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldUpgradeStore3 goldUpgradeStore3 = new GoldUpgradeStore3(this.this$0, continuation);
        goldUpgradeStore3.L$0 = obj;
        return goldUpgradeStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ApiGoldUpgradeFlowQueryParams apiGoldUpgradeFlowQueryParams, Continuation<? super Result<ApiGoldSweepAgreementsFlow>> continuation) {
        return ((GoldUpgradeStore3) create(apiGoldUpgradeFlowQueryParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ApiGoldUpgradeFlowQueryParams apiGoldUpgradeFlowQueryParams, Continuation<? super Result<? extends ApiGoldSweepAgreementsFlow>> continuation) {
        return invoke2(apiGoldUpgradeFlowQueryParams, (Continuation<? super Result<ApiGoldSweepAgreementsFlow>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String feature = ((ApiGoldUpgradeFlowQueryParams) this.L$0).getFeature();
                GoldUpgradeStore goldUpgradeStore = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                GoldUpgradeApi goldUpgradeApi = goldUpgradeStore.goldUpgradeApi;
                this.label = 1;
                obj = goldUpgradeApi.getGoldSweepAgreements(feature, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ApiGoldSweepAgreementsFlow) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m28549boximpl(objM28550constructorimpl);
    }
}
