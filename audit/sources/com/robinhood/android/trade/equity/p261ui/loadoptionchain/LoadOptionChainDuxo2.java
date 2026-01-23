package com.robinhood.android.trade.equity.p261ui.loadoptionchain;

import com.robinhood.android.trade.equity.p261ui.loadoptionchain.LoadOptionChainViewState;
import com.robinhood.models.p355ui.UiOptionChain;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: LoadOptionChainDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.loadoptionchain.LoadOptionChainDuxo$onCreate$3$1", m3645f = "LoadOptionChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.equity.ui.loadoptionchain.LoadOptionChainDuxo$onCreate$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class LoadOptionChainDuxo2 extends ContinuationImpl7 implements Function2<LoadOptionChainViewState, Continuation<? super LoadOptionChainViewState>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ UUID $instrumentId;
    final /* synthetic */ UiOptionChain $optionChain;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadOptionChainDuxo2(UiOptionChain uiOptionChain, UUID uuid, String str, Continuation<? super LoadOptionChainDuxo2> continuation) {
        super(2, continuation);
        this.$optionChain = uiOptionChain;
        this.$instrumentId = uuid;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LoadOptionChainDuxo2(this.$optionChain, this.$instrumentId, this.$accountNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LoadOptionChainViewState loadOptionChainViewState, Continuation<? super LoadOptionChainViewState> continuation) {
        return ((LoadOptionChainDuxo2) create(loadOptionChainViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$optionChain == null) {
            return LoadOptionChainViewState.Error.INSTANCE;
        }
        return new LoadOptionChainViewState.Loaded(this.$instrumentId, this.$optionChain, this.$accountNumber);
    }
}
