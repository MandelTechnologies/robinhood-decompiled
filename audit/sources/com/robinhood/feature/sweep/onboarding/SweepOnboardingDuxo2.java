package com.robinhood.feature.sweep.onboarding;

import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: SweepOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.feature.sweep.onboarding.SweepOnboardingDuxo$onCreate$1$interestRates$1", m3645f = "SweepOnboardingDuxo.kt", m3646l = {98}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.feature.sweep.onboarding.SweepOnboardingDuxo$onCreate$1$interestRates$1, reason: use source file name */
/* loaded from: classes15.dex */
final class SweepOnboardingDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SweepsInterest>, Object> {
    final /* synthetic */ String $accountNumber;
    int label;
    final /* synthetic */ SweepOnboardingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SweepOnboardingDuxo2(SweepOnboardingDuxo sweepOnboardingDuxo, String str, Continuation<? super SweepOnboardingDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = sweepOnboardingDuxo;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SweepOnboardingDuxo2(this.this$0, this.$accountNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SweepsInterest> continuation) {
        return ((SweepOnboardingDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Observable<Optional<SweepsInterest>> observableStream = this.this$0.sweepsInterestStore.stream(this.$accountNumber);
        Intrinsics.checkNotNullExpressionValue(observableStream, "stream(...)");
        Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(observableStream);
        this.label = 1;
        Object objAwaitFirst = RxAwait3.awaitFirst(observableFilterIsPresent, this);
        return objAwaitFirst == coroutine_suspended ? coroutine_suspended : objAwaitFirst;
    }
}
