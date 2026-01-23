package com.robinhood.android.doc.serverdriven.country;

import com.robinhood.android.doc.experiments.ServerDrivenDocRequestsNewCountryPickerExperiment;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SddrCountryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.country.SddrCountryDuxo$onCreate$1$inExperiment$1", m3645f = "SddrCountryDuxo.kt", m3646l = {42}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.doc.serverdriven.country.SddrCountryDuxo$onCreate$1$inExperiment$1, reason: use source file name */
/* loaded from: classes7.dex */
final class SddrCountryDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ SddrCountryDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SddrCountryDuxo2(SddrCountryDuxo sddrCountryDuxo, Continuation<? super SddrCountryDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = sddrCountryDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SddrCountryDuxo2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((SddrCountryDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{ServerDrivenDocRequestsNewCountryPickerExperiment.INSTANCE}, false, null, 6, null);
        this.label = 1;
        Object objFirst = FlowKt.first(flowStreamStateFlow$default, this);
        return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
    }
}
