package com.robinhood.android.equities.taxlots.table;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCell4;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TaxLotShareAndCheckBoxCell.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$3$1$1", m3645f = "TaxLotShareAndCheckBoxCell.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$3$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class TaxLotShareAndCheckBoxCell5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Boolean> $invalidNumberOfShares$delegate;
    final /* synthetic */ Function1<BigDecimal, Unit> $invalidNumberOfSharesCallback;
    final /* synthetic */ TaxLotsShareAndCheckBoxCell $taxLotsShareAndCheckBoxCell;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TaxLotShareAndCheckBoxCell5(Function1<? super BigDecimal, Unit> function1, TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell, SnapshotState4<Boolean> snapshotState4, Continuation<? super TaxLotShareAndCheckBoxCell5> continuation) {
        super(2, continuation);
        this.$invalidNumberOfSharesCallback = function1;
        this.$taxLotsShareAndCheckBoxCell = taxLotsShareAndCheckBoxCell;
        this.$invalidNumberOfShares$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TaxLotShareAndCheckBoxCell5(this.$invalidNumberOfSharesCallback, this.$taxLotsShareAndCheckBoxCell, this.$invalidNumberOfShares$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TaxLotShareAndCheckBoxCell5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (TaxLotShareAndCheckBoxCell4.C149593.invoke$lambda$5(this.$invalidNumberOfShares$delegate)) {
                this.$invalidNumberOfSharesCallback.invoke(this.$taxLotsShareAndCheckBoxCell.getOriginalShareValue());
            } else {
                this.$invalidNumberOfSharesCallback.invoke(null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
