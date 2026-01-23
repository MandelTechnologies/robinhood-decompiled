package com.robinhood.android.common.options.tradebar;

import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.models.p320db.Account;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionsDetailPageTradebarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onStart$1$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class OptionsDetailPageTradebarDuxo4 extends ContinuationImpl7 implements Function2<OptionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState>, Object> {
    final /* synthetic */ List<Account> $accounts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsDetailPageTradebarDuxo4(List<Account> list, Continuation<? super OptionsDetailPageTradebarDuxo4> continuation) {
        super(2, continuation);
        this.$accounts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionsDetailPageTradebarDuxo4 optionsDetailPageTradebarDuxo4 = new OptionsDetailPageTradebarDuxo4(this.$accounts, continuation);
        optionsDetailPageTradebarDuxo4.L$0 = obj;
        return optionsDetailPageTradebarDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState> continuation) {
        return ((OptionsDetailPageTradebarDuxo4) create(optionsDetailPageTradebarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsDetailPageTradebarDataState.GlobalData invokeSuspend$lambda$0(List list, OptionsDetailPageTradebarDataState.GlobalData globalData) {
        return OptionsDetailPageTradebarDataState.GlobalData.copy$default(globalData, list, null, null, null, false, false, 62, null);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState = (OptionsDetailPageTradebarDataState) this.L$0;
        final List<Account> list = this.$accounts;
        return optionsDetailPageTradebarDataState.copyGlobalData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onStart$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return OptionsDetailPageTradebarDuxo4.invokeSuspend$lambda$0(list, (OptionsDetailPageTradebarDataState.GlobalData) obj2);
            }
        });
    }
}
