package com.robinhood.android.iav.p154ui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PlaidConnectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoDS;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidConnectionDuxo$onCreate$2$1", m3645f = "PlaidConnectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class PlaidConnectionDuxo2 extends ContinuationImpl7 implements Function2<PlaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS>, Object> {
    final /* synthetic */ boolean $isGoldBackupBillingMember;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlaidConnectionDuxo2(boolean z, Continuation<? super PlaidConnectionDuxo2> continuation) {
        super(2, continuation);
        this.$isGoldBackupBillingMember = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaidConnectionDuxo2 plaidConnectionDuxo2 = new PlaidConnectionDuxo2(this.$isGoldBackupBillingMember, continuation);
        plaidConnectionDuxo2.L$0 = obj;
        return plaidConnectionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PlaidConnectionDuxoDS plaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS> continuation) {
        return ((PlaidConnectionDuxo2) create(plaidConnectionDuxoDS, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PlaidConnectionDuxoDS.copy$default((PlaidConnectionDuxoDS) this.L$0, false, false, null, false, false, false, null, null, null, false, this.$isGoldBackupBillingMember, false, 3071, null);
    }
}
