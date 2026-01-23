package com.robinhood.android.crypto.tab.p093ui.power;

import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoBuyingPowerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerDuxo$onResume$1$1", m3645f = "CryptoBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoBuyingPowerDuxo3 extends ContinuationImpl7 implements Function2<CryptoBuyingPowerDataState, Continuation<? super CryptoBuyingPowerDataState>, Object> {
    final /* synthetic */ CryptoBuyingPower $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoBuyingPowerDuxo3(CryptoBuyingPower cryptoBuyingPower, Continuation<? super CryptoBuyingPowerDuxo3> continuation) {
        super(2, continuation);
        this.$it = cryptoBuyingPower;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoBuyingPowerDuxo3 cryptoBuyingPowerDuxo3 = new CryptoBuyingPowerDuxo3(this.$it, continuation);
        cryptoBuyingPowerDuxo3.L$0 = obj;
        return cryptoBuyingPowerDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoBuyingPowerDataState cryptoBuyingPowerDataState, Continuation<? super CryptoBuyingPowerDataState> continuation) {
        return ((CryptoBuyingPowerDuxo3) create(cryptoBuyingPowerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoBuyingPowerDataState.copy$default((CryptoBuyingPowerDataState) this.L$0, this.$it, false, 2, null);
    }
}
