package com.robinhood.shared.taxLots;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.shared.taxLots.TaxLotTableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TaxLotsTable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.taxLots.TaxLotsTableKt$TaxLotTable$3$1", m3645f = "TaxLotsTable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class TaxLotsTableKt$TaxLotTable$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Boolean> $reachedBottom$delegate;
    final /* synthetic */ Function0<Unit> $requestNextPage;
    final /* synthetic */ TaxLotTableState<T> $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxLotsTableKt$TaxLotTable$3$1(TaxLotTableState<T> taxLotTableState, Function0<Unit> function0, SnapshotState4<Boolean> snapshotState4, Continuation<? super TaxLotsTableKt$TaxLotTable$3$1> continuation) {
        super(2, continuation);
        this.$state = taxLotTableState;
        this.$requestNextPage = function0;
        this.$reachedBottom$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TaxLotsTableKt$TaxLotTable$3$1(this.$state, this.$requestNextPage, this.$reachedBottom$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TaxLotsTableKt$TaxLotTable$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (TaxLotsTableKt.TaxLotTable$lambda$2(this.$reachedBottom$delegate)) {
                Object obj2 = this.$state;
                TaxLotTableState.Loaded loaded = obj2 instanceof TaxLotTableState.Loaded ? (TaxLotTableState.Loaded) obj2 : null;
                if (loaded != null && loaded.getHasNextPage()) {
                    this.$requestNextPage.invoke();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
