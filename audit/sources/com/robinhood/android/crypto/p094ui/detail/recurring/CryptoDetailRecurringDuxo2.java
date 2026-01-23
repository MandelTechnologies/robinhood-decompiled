package com.robinhood.android.crypto.p094ui.detail.recurring;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoDetailRecurringDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$5$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$5$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoDetailRecurringDuxo2 extends ContinuationImpl7 implements Function2<CryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState>, Object> {
    final /* synthetic */ boolean $regionGate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoDetailRecurringDuxo2(boolean z, Continuation<? super CryptoDetailRecurringDuxo2> continuation) {
        super(2, continuation);
        this.$regionGate = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoDetailRecurringDuxo2 cryptoDetailRecurringDuxo2 = new CryptoDetailRecurringDuxo2(this.$regionGate, continuation);
        cryptoDetailRecurringDuxo2.L$0 = obj;
        return cryptoDetailRecurringDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoDetailRecurringDataState cryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState> continuation) {
        return ((CryptoDetailRecurringDuxo2) create(cryptoDetailRecurringDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoDetailRecurringDataState.copy$default((CryptoDetailRecurringDataState) this.L$0, null, null, null, null, this.$regionGate, false, false, null, null, null, null, 2031, null);
    }
}
