package com.robinhood.lib.sweep.enrollment;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.gold.GoldApi;
import com.robinhood.models.api.bonfire.ApiSweepSplash;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SweepEnrollmentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiSweepSplash;", "accountNumber", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore$getSweepSplashEndpoint$1", m3645f = "SweepEnrollmentStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes27.dex */
final class SweepEnrollmentStore$getSweepSplashEndpoint$1 extends ContinuationImpl7 implements Function2<Optional<? extends String>, Continuation<? super ApiSweepSplash>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SweepEnrollmentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SweepEnrollmentStore$getSweepSplashEndpoint$1(SweepEnrollmentStore sweepEnrollmentStore, Continuation<? super SweepEnrollmentStore$getSweepSplashEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = sweepEnrollmentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SweepEnrollmentStore$getSweepSplashEndpoint$1 sweepEnrollmentStore$getSweepSplashEndpoint$1 = new SweepEnrollmentStore$getSweepSplashEndpoint$1(this.this$0, continuation);
        sweepEnrollmentStore$getSweepSplashEndpoint$1.L$0 = obj;
        return sweepEnrollmentStore$getSweepSplashEndpoint$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<String> optional, Continuation<? super ApiSweepSplash> continuation) {
        return ((SweepEnrollmentStore$getSweepSplashEndpoint$1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends String> optional, Continuation<? super ApiSweepSplash> continuation) {
        return invoke2((Optional<String>) optional, continuation);
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
        Optional optional = (Optional) this.L$0;
        GoldApi goldApi = this.this$0.goldApi;
        String str = (String) optional.getOrNull();
        this.label = 1;
        Object sweepFlowSplash = goldApi.getSweepFlowSplash(str, this);
        return sweepFlowSplash == coroutine_suspended ? coroutine_suspended : sweepFlowSplash;
    }
}
