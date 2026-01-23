package com.robinhood.android.advanced.alert;

import com.robinhood.models.advanced.alert.p302db.AdvancedAlert;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvancedAlertDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advanced/alert/AdvancedAlertDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertDuxo$toggleIndicatorAdvancedAlert$1$1", m3645f = "AdvancedAlertDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$toggleIndicatorAdvancedAlert$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AdvancedAlertDuxo6 extends ContinuationImpl7 implements Function2<AdvancedAlertDataState, Continuation<? super AdvancedAlertDataState>, Object> {
    final /* synthetic */ AdvancedAlert $newAlert;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedAlertDuxo6(AdvancedAlert advancedAlert, Continuation<? super AdvancedAlertDuxo6> continuation) {
        super(2, continuation);
        this.$newAlert = advancedAlert;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedAlertDuxo6 advancedAlertDuxo6 = new AdvancedAlertDuxo6(this.$newAlert, continuation);
        advancedAlertDuxo6.L$0 = obj;
        return advancedAlertDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdvancedAlertDataState advancedAlertDataState, Continuation<? super AdvancedAlertDataState> continuation) {
        return ((AdvancedAlertDuxo6) create(advancedAlertDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AdvancedAlertDataState.copy$default((AdvancedAlertDataState) this.L$0, this.$newAlert, null, null, false, null, null, 62, null);
    }
}
