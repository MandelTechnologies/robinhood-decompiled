package com.robinhood.shared.crypto.buttonBar;

import com.adjust.sdk.network.ErrorCodes;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoButtonBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$updateLoading$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$updateLoading$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoButtonBarDuxo4 extends ContinuationImpl7 implements Function2<CryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState>, Object> {
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ String $label;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoButtonBarDuxo4(boolean z, String str, Continuation<? super CryptoButtonBarDuxo4> continuation) {
        super(2, continuation);
        this.$isLoading = z;
        this.$label = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoButtonBarDuxo4 cryptoButtonBarDuxo4 = new CryptoButtonBarDuxo4(this.$isLoading, this.$label, continuation);
        cryptoButtonBarDuxo4.L$0 = obj;
        return cryptoButtonBarDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoButtonBarDataState cryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState> continuation) {
        return ((CryptoButtonBarDuxo4) create(cryptoButtonBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoButtonBarDataState cryptoButtonBarDataState = (CryptoButtonBarDataState) this.L$0;
        List mutableList = CollectionsKt.toMutableList((Collection) cryptoButtonBarDataState.getLoadingButtonLabels$lib_crypto_button_bar_externalDebug());
        if (this.$isLoading) {
            mutableList.add(this.$label);
        } else {
            mutableList.remove(this.$label);
        }
        return CryptoButtonBarDataState.copy$default(cryptoButtonBarDataState, null, null, null, null, extensions2.toImmutableList(mutableList), false, null, null, null, null, ErrorCodes.IO_EXCEPTION, null);
    }
}
