package com.robinhood.android.crypto.tab.p093ui.appbar;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.crypto.p314db.home.CryptoHomeState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHomeAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarDuxo$onStart$2$1", m3645f = "CryptoHomeAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.tab.ui.appbar.CryptoHomeAppBarDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeAppBarDuxo3 extends ContinuationImpl7 implements Function2<CryptoHomeAppBarDataState, Continuation<? super CryptoHomeAppBarDataState>, Object> {
    final /* synthetic */ CryptoHomeState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeAppBarDuxo3(CryptoHomeState cryptoHomeState, Continuation<? super CryptoHomeAppBarDuxo3> continuation) {
        super(2, continuation);
        this.$state = cryptoHomeState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHomeAppBarDuxo3 cryptoHomeAppBarDuxo3 = new CryptoHomeAppBarDuxo3(this.$state, continuation);
        cryptoHomeAppBarDuxo3.L$0 = obj;
        return cryptoHomeAppBarDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoHomeAppBarDataState cryptoHomeAppBarDataState, Continuation<? super CryptoHomeAppBarDataState> continuation) {
        return ((CryptoHomeAppBarDuxo3) create(cryptoHomeAppBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoHomeAppBarDataState.copy$default((CryptoHomeAppBarDataState) this.L$0, null, null, null, null, null, this.$state, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }
}
