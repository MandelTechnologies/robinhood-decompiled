package com.robinhood.android.crypto.tab.p093ui.header;

import com.robinhood.models.serverdriven.experimental.api.Direction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHomeHeaderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$3$1", m3645f = "CryptoHomeHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.tab.ui.header.CryptoHomeHeaderDuxo$onResume$3$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeHeaderDuxo3 extends ContinuationImpl7 implements Function2<CryptoHomeHeaderDataState, Continuation<? super CryptoHomeHeaderDataState>, Object> {
    final /* synthetic */ Direction $pageDirection;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeHeaderDuxo3(Direction direction, Continuation<? super CryptoHomeHeaderDuxo3> continuation) {
        super(2, continuation);
        this.$pageDirection = direction;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHomeHeaderDuxo3 cryptoHomeHeaderDuxo3 = new CryptoHomeHeaderDuxo3(this.$pageDirection, continuation);
        cryptoHomeHeaderDuxo3.L$0 = obj;
        return cryptoHomeHeaderDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoHomeHeaderDataState cryptoHomeHeaderDataState, Continuation<? super CryptoHomeHeaderDataState> continuation) {
        return ((CryptoHomeHeaderDuxo3) create(cryptoHomeHeaderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoHomeHeaderDataState.copy$default((CryptoHomeHeaderDataState) this.L$0, null, null, this.$pageDirection, false, false, null, null, 123, null);
    }
}
