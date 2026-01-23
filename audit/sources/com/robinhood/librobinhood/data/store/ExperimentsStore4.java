package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.librobinhood.data.fetcher.ExperimentFetcher;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.utils.Optional;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ExperimentsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "", "Lcom/robinhood/models/db/KaizenExperiment;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$experimentsEndpoint$1", m3645f = "ExperimentsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$experimentsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ExperimentsStore4 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Optional<? extends List<? extends KaizenExperiment>>>, Object> {
    int label;
    final /* synthetic */ ExperimentsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExperimentsStore4(ExperimentsStore experimentsStore, Continuation<? super ExperimentsStore4> continuation) {
        super(2, continuation);
        this.this$0 = experimentsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExperimentsStore4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Optional<? extends List<? extends KaizenExperiment>>> continuation) {
        return ((ExperimentsStore4) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ExperimentFetcher experimentFetcher = this.this$0.experimentFetcher;
        this.label = 1;
        Object objFetchKaizenExperiments = experimentFetcher.fetchKaizenExperiments(this);
        return objFetchKaizenExperiments == coroutine_suspended ? coroutine_suspended : objFetchKaizenExperiments;
    }
}
