package com.robinhood.android.acatsin.partials.option;

import com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetEvent;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInPartialOptionAssetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$validateOptionContract$3$1", m3645f = "AcatsInPartialOptionAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$validateOptionContract$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInPartialOptionAssetDuxo4 extends ContinuationImpl7 implements Function2<AcatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState>, Object> {

    /* renamed from: $t */
    final /* synthetic */ Throwable f3879$t;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsInPartialOptionAssetDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInPartialOptionAssetDuxo4(Throwable th, AcatsInPartialOptionAssetDuxo acatsInPartialOptionAssetDuxo, Continuation<? super AcatsInPartialOptionAssetDuxo4> continuation) {
        super(2, continuation);
        this.f3879$t = th;
        this.this$0 = acatsInPartialOptionAssetDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInPartialOptionAssetDuxo4 acatsInPartialOptionAssetDuxo4 = new AcatsInPartialOptionAssetDuxo4(this.f3879$t, this.this$0, continuation);
        acatsInPartialOptionAssetDuxo4.L$0 = obj;
        return acatsInPartialOptionAssetDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInPartialOptionAssetDataState acatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState> continuation) {
        return ((AcatsInPartialOptionAssetDuxo4) create(acatsInPartialOptionAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsInPartialOptionAssetDataState acatsInPartialOptionAssetDataState = (AcatsInPartialOptionAssetDataState) this.L$0;
        Integer httpStatusCode = Throwables.getHttpStatusCode(this.f3879$t);
        if (httpStatusCode != null && httpStatusCode.intValue() == 404) {
            this.this$0.submit(AcatsInPartialOptionAssetEvent.OptionValidationFailureEvent.INSTANCE);
            return AcatsInPartialOptionAssetDataState.copy$default(acatsInPartialOptionAssetDataState, null, null, null, null, null, null, null, null, null, false, 511, null);
        }
        this.this$0.submit(new AcatsInPartialOptionAssetEvent.NetworkErrorEvent(this.f3879$t));
        return AcatsInPartialOptionAssetDataState.copy$default(acatsInPartialOptionAssetDataState, null, null, null, null, null, null, null, null, null, false, 511, null);
    }
}
