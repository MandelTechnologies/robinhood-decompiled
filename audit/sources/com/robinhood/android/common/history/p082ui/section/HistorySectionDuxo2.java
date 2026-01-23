package com.robinhood.android.common.history.p082ui.section;

import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: HistorySectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/history/ui/section/HistorySectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.history.ui.section.HistorySectionDuxo$onCreate$1$2$1$1", m3645f = "HistorySectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.history.ui.section.HistorySectionDuxo$onCreate$1$2$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class HistorySectionDuxo2 extends ContinuationImpl7 implements Function2<HistorySectionDataState, Continuation<? super HistorySectionDataState>, Object> {
    final /* synthetic */ List<StatefulHistoryEvent<HistoryEvent>> $historyEvents;
    final /* synthetic */ HistorySectionState $inputState;
    final /* synthetic */ HistorySectionDataState $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HistorySectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HistorySectionDuxo2(HistorySectionDuxo historySectionDuxo, HistorySectionState historySectionState, List<? extends StatefulHistoryEvent<? extends HistoryEvent>> list, HistorySectionDataState historySectionDataState, Continuation<? super HistorySectionDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = historySectionDuxo;
        this.$inputState = historySectionState;
        this.$historyEvents = list;
        this.$it = historySectionDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HistorySectionDuxo2 historySectionDuxo2 = new HistorySectionDuxo2(this.this$0, this.$inputState, this.$historyEvents, this.$it, continuation);
        historySectionDuxo2.L$0 = obj;
        return historySectionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HistorySectionDataState historySectionDataState, Continuation<? super HistorySectionDataState> continuation) {
        return ((HistorySectionDuxo2) create(historySectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            HistorySectionDataState historySectionDataState = (HistorySectionDataState) this.L$0;
            Set allAccountIds = this.this$0.getAllAccountIds(this.$inputState.getStaticFilter());
            boolean z = true;
            if (allAccountIds != null) {
                allAccountIds.size();
            }
            if (allAccountIds != null && allAccountIds.isEmpty()) {
                return HistorySectionDataState.copy$default(historySectionDataState, false, null, true, null, 0, 27, null);
            }
            UUID uuid = allAccountIds != null ? (UUID) CollectionsKt.first(allAccountIds) : null;
            if (this.$inputState.getHideFooterBelowDisplayCount() && this.$historyEvents.size() <= this.$inputState.getDisplayCount()) {
                z = false;
            }
            return historySectionDataState.copy(z, this.$it.updateHistoryItemsForId(uuid, this.$historyEvents), false, uuid, this.$inputState.getDisplayCount());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
