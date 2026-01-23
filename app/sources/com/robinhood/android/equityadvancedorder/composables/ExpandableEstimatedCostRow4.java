package com.robinhood.android.equityadvancedorder.composables;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.models.api.ApiSalesTax;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExpandableEstimatedCostRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$ExpandableEstimatedCostRow$1$1", m3645f = "ExpandableEstimatedCostRow.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$ExpandableEstimatedCostRow$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ExpandableEstimatedCostRow4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $expandable$delegate;
    final /* synthetic */ EquityOrderFormRowState.ExpandableEstimatedCost $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpandableEstimatedCostRow4(EquityOrderFormRowState.ExpandableEstimatedCost expandableEstimatedCost, SnapshotState<Boolean> snapshotState, Continuation<? super ExpandableEstimatedCostRow4> continuation) {
        super(2, continuation);
        this.$state = expandableEstimatedCost;
        this.$expandable$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExpandableEstimatedCostRow4(this.$state, this.$expandable$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExpandableEstimatedCostRow4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$state.m13754getEstimatedTotalFeesxLWZpok() != null) {
            if (Result.m28555isFailureimpl(this.$state.m13754getEstimatedTotalFeesxLWZpok().getValue())) {
                ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$2(this.$expandable$delegate, true);
            } else if (Result.m28556isSuccessimpl(this.$state.m13754getEstimatedTotalFeesxLWZpok().getValue())) {
                Object value = this.$state.m13754getEstimatedTotalFeesxLWZpok().getValue();
                if (Result.m28555isFailureimpl(value)) {
                    value = null;
                }
                if (BigDecimals7.isZero((BigDecimal) value)) {
                    ImmutableList<ApiSalesTax> salesTaxes = this.$state.getSalesTaxes();
                    if (salesTaxes != null && !salesTaxes.isEmpty()) {
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
