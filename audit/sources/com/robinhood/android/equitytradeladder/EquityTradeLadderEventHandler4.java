package com.robinhood.android.equitytradeladder;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.equitytradeladder.EquityTradeLadderEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityTradeLadderEventHandler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$15$1", m3645f = "EquityTradeLadderEventHandler.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$15$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityTradeLadderEventHandler4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ SnapshotState<EquityTradeLadderEvent.Snackbar> $snackbarEvent$delegate;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderEventHandler4(SnapshotState<EquityTradeLadderEvent.Snackbar> snapshotState, CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, Continuation<? super EquityTradeLadderEventHandler4> continuation) {
        super(2, continuation);
        this.$snackbarEvent$delegate = snapshotState;
        this.$coroutineScope = coroutineScope;
        this.$snackbarHostState = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityTradeLadderEventHandler4(this.$snackbarEvent$delegate, this.$coroutineScope, this.$snackbarHostState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityTradeLadderEventHandler4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderEvent.Snackbar snackbarEquityTradeLadderEventHandler$lambda$34 = EquityTradeLadderEventHandler.EquityTradeLadderEventHandler$lambda$34(this.$snackbarEvent$delegate);
            if (snackbarEquityTradeLadderEventHandler$lambda$34 != null) {
                CoroutineScope coroutineScope = this.$coroutineScope;
                SnackbarHostState snackbarHostState = this.$snackbarHostState;
                SnapshotState<EquityTradeLadderEvent.Snackbar> snapshotState = this.$snackbarEvent$delegate;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new EquityTradeLadderEventHandler5(snackbarHostState, snackbarEquityTradeLadderEventHandler$lambda$34, snapshotState, null), 3, null);
                snapshotState.setValue(null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
