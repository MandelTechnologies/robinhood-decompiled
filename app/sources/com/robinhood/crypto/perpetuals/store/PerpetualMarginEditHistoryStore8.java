package com.robinhood.crypto.perpetuals.store;

import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualAccount;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMarginEdit;
import com.robinhood.shared.crypto.utils.UpdatedAtGteUtil;
import crypto_perpetuals.service.p440v1.ListMarginEditsRequestDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PerpetualMarginEditHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$refreshAll$1", m3645f = "PerpetualMarginEditHistoryStore.kt", m3646l = {211}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$refreshAll$1, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualMarginEditHistoryStore8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PerpetualMarginEditHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualMarginEditHistoryStore8(PerpetualMarginEditHistoryStore perpetualMarginEditHistoryStore, Continuation<? super PerpetualMarginEditHistoryStore8> continuation) {
        super(2, continuation);
        this.this$0 = perpetualMarginEditHistoryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerpetualMarginEditHistoryStore8(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PerpetualMarginEditHistoryStore8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.distinctUntilChanged(this.this$0.accountStore.streamPerpetualAccount()));
            final PerpetualMarginEditHistoryStore perpetualMarginEditHistoryStore = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$refreshAll$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((PerpetualAccount) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(PerpetualAccount perpetualAccount, Continuation<? super Unit> continuation) {
                    PaginatedEndpoint.DefaultImpls.refreshAllPages$default(perpetualMarginEditHistoryStore.paginatedMarginEditEndpoint, new ListMarginEditsRequestDto(null, UpdatedAtGteUtil.getUpdatedAtGte(perpetualMarginEditHistoryStore.dao.getLatestUpdatedAt(), perpetualMarginEditHistoryStore.getLastUpdatedAtManager().getLastUpdatedAt(PerpetualMarginEdit.class)), null, null, 13, null), false, 2, null);
                    perpetualMarginEditHistoryStore.contractStore.refreshAll();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
