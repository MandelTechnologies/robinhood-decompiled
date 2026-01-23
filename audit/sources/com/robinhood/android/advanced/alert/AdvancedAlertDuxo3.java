package com.robinhood.android.advanced.alert;

import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
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
@DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertDuxo$fetchUiResource$2$1", m3645f = "AdvancedAlertDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$fetchUiResource$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AdvancedAlertDuxo3 extends ContinuationImpl7 implements Function2<AdvancedAlertDataState, Continuation<? super AdvancedAlertDataState>, Object> {
    final /* synthetic */ AlertHubUiResources $uiResource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedAlertDuxo3(AlertHubUiResources alertHubUiResources, Continuation<? super AdvancedAlertDuxo3> continuation) {
        super(2, continuation);
        this.$uiResource = alertHubUiResources;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedAlertDuxo3 advancedAlertDuxo3 = new AdvancedAlertDuxo3(this.$uiResource, continuation);
        advancedAlertDuxo3.L$0 = obj;
        return advancedAlertDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdvancedAlertDataState advancedAlertDataState, Continuation<? super AdvancedAlertDataState> continuation) {
        return ((AdvancedAlertDuxo3) create(advancedAlertDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AdvancedAlertDataState.copy$default((AdvancedAlertDataState) this.L$0, null, this.$uiResource, null, false, null, null, 61, null);
    }
}
