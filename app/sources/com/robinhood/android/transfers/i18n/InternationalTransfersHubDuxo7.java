package com.robinhood.android.transfers.i18n;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.Account;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InternationalTransfersHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$7$1", m3645f = "InternationalTransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$7$1, reason: use source file name */
/* loaded from: classes9.dex */
final class InternationalTransfersHubDuxo7 extends ContinuationImpl7 implements Function2<InternationalTransfersHubDataState, Continuation<? super InternationalTransfersHubDataState>, Object> {
    final /* synthetic */ List<Account> $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternationalTransfersHubDuxo7(List<Account> list, Continuation<? super InternationalTransfersHubDuxo7> continuation) {
        super(2, continuation);
        this.$it = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternationalTransfersHubDuxo7 internationalTransfersHubDuxo7 = new InternationalTransfersHubDuxo7(this.$it, continuation);
        internationalTransfersHubDuxo7.L$0 = obj;
        return internationalTransfersHubDuxo7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternationalTransfersHubDataState internationalTransfersHubDataState, Continuation<? super InternationalTransfersHubDataState> continuation) {
        return ((InternationalTransfersHubDuxo7) create(internationalTransfersHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InternationalTransfersHubDataState.copy$default((InternationalTransfersHubDataState) this.L$0, null, null, null, null, null, null, false, this.$it, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }
}
