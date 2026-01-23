package com.robinhood.android.fund.breakdown;

import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.models.p320db.bonfire.etp.EtpHolding;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: FocusedHoldingTable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.fund.breakdown.FocusedHoldingTableKt$FocusedHoldingTable$2$1", m3645f = "FocusedHoldingTable.kt", m3646l = {64}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.fund.breakdown.FocusedHoldingTableKt$FocusedHoldingTable$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FocusedHoldingTable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EtpHolding $focusedHolding;
    final /* synthetic */ SnapshotState<Boolean> $headerRowVisible$delegate;
    final /* synthetic */ SnapshotIntState2 $visibleVehicleIndex$delegate;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusedHoldingTable3(EtpHolding etpHolding, SnapshotState<Boolean> snapshotState, SnapshotIntState2 snapshotIntState2, Continuation<? super FocusedHoldingTable3> continuation) {
        super(2, continuation);
        this.$focusedHolding = etpHolding;
        this.$headerRowVisible$delegate = snapshotState;
        this.$visibleVehicleIndex$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FocusedHoldingTable3(this.$focusedHolding, this.$headerRowVisible$delegate, this.$visibleVehicleIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FocusedHoldingTable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:20:0x005c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int size;
        SnapshotIntState2 snapshotIntState2;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (FocusedHoldingTable.FocusedHoldingTable$lambda$1(this.$headerRowVisible$delegate)) {
                this.$visibleVehicleIndex$delegate.setIntValue(-1);
                List<EtpHolding.Vehicle> vehicles = this.$focusedHolding.getVehicles();
                size = vehicles != null ? vehicles.size() : 1;
                snapshotIntState2 = this.$visibleVehicleIndex$delegate;
                i = 0;
                if (i < size) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = this.I$2;
        int i3 = this.I$1;
        size = this.I$0;
        snapshotIntState2 = (SnapshotIntState2) this.L$0;
        ResultKt.throwOnFailure(obj);
        snapshotIntState2.setIntValue(i);
        i = i3 + 1;
        if (i < size) {
            this.L$0 = snapshotIntState2;
            this.I$0 = size;
            this.I$1 = i;
            this.I$2 = i;
            this.label = 1;
            if (DelayKt.delay(83L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i3 = i;
            snapshotIntState2.setIntValue(i);
            i = i3 + 1;
            if (i < size) {
            }
        }
        return Unit.INSTANCE;
    }
}
