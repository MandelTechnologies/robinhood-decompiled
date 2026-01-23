package com.robinhood.android.securitycenter.p251ui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SecurityCenterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$onResume$4$1", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$onResume$4$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SecurityCenterDuxo5 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
    final /* synthetic */ boolean $killswitchEnabled;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecurityCenterDuxo5(boolean z, Continuation<? super SecurityCenterDuxo5> continuation) {
        super(2, continuation);
        this.$killswitchEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityCenterDuxo5 securityCenterDuxo5 = new SecurityCenterDuxo5(this.$killswitchEnabled, continuation);
        securityCenterDuxo5.L$0 = obj;
        return securityCenterDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
        return ((SecurityCenterDuxo5) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SecurityCenterDataState.copy$default((SecurityCenterDataState) this.L$0, false, false, false, null, !this.$killswitchEnabled, false, false, null, false, false, false, 2031, null);
    }
}
