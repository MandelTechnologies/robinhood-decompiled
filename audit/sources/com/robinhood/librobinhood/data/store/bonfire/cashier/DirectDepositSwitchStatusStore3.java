package com.robinhood.librobinhood.data.store.bonfire.cashier;

import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.models.api.cashier.ApiDirectDepositSwitchStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: DirectDepositSwitchStatusStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.cashier.DirectDepositSwitchStatusStore$endpoint$2", m3645f = "DirectDepositSwitchStatusStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.cashier.DirectDepositSwitchStatusStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class DirectDepositSwitchStatusStore3 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Cashier $cashier;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositSwitchStatusStore3(Cashier cashier, Continuation<? super DirectDepositSwitchStatusStore3> continuation) {
        super(2, continuation);
        this.$cashier = cashier;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DirectDepositSwitchStatusStore3(this.$cashier, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Boolean> continuation) {
        return ((DirectDepositSwitchStatusStore3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Cashier cashier = this.$cashier;
            this.label = 1;
            obj = cashier.getDirectDepositSwitchStatus(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxBoolean(((ApiDirectDepositSwitchStatus) obj).getHas_setup_direct_deposit());
    }
}
