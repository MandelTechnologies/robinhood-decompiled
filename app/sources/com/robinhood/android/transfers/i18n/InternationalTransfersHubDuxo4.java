package com.robinhood.android.transfers.i18n;

import androidx.paging.PagedList;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
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
@DebugMetadata(m3644c = "com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$3$1", m3645f = "InternationalTransfersHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class InternationalTransfersHubDuxo4 extends ContinuationImpl7 implements Function2<InternationalTransfersHubDataState, Continuation<? super InternationalTransfersHubDataState>, Object> {
    final /* synthetic */ PagedList<StatefulHistoryEvent<HistoryEvent>> $completedHistoryItems;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternationalTransfersHubDuxo4(PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, Continuation<? super InternationalTransfersHubDuxo4> continuation) {
        super(2, continuation);
        this.$completedHistoryItems = pagedList;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternationalTransfersHubDuxo4 internationalTransfersHubDuxo4 = new InternationalTransfersHubDuxo4(this.$completedHistoryItems, continuation);
        internationalTransfersHubDuxo4.L$0 = obj;
        return internationalTransfersHubDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternationalTransfersHubDataState internationalTransfersHubDataState, Continuation<? super InternationalTransfersHubDataState> continuation) {
        return ((InternationalTransfersHubDuxo4) create(internationalTransfersHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InternationalTransfersHubDataState.copy$default((InternationalTransfersHubDataState) this.L$0, null, null, this.$completedHistoryItems, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }
}
