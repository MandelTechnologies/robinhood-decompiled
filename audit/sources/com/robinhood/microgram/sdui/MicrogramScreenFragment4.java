package com.robinhood.microgram.sdui;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.microgram.sdui.MicrogramScreenFragment;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MicrogramScreenFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenFragment$ComposeContent$2$9$1", m3645f = "MicrogramScreenFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.microgram.sdui.MicrogramScreenFragment$ComposeContent$2$9$1, reason: use source file name */
/* loaded from: classes13.dex */
final class MicrogramScreenFragment4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EdgeToEdgeHost $edgeToEdgeSupport;
    final /* synthetic */ SnapshotState<Boolean> $isSystemBarStyleLight$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MicrogramScreenFragment4(SnapshotState<Boolean> snapshotState, EdgeToEdgeHost edgeToEdgeHost, Continuation<? super MicrogramScreenFragment4> continuation) {
        super(2, continuation);
        this.$isSystemBarStyleLight$delegate = snapshotState;
        this.$edgeToEdgeSupport = edgeToEdgeHost;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MicrogramScreenFragment4(this.$isSystemBarStyleLight$delegate, this.$edgeToEdgeSupport, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MicrogramScreenFragment4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Boolean boolInvoke$lambda$1 = MicrogramScreenFragment.C350382.invoke$lambda$1(this.$isSystemBarStyleLight$delegate);
            if (boolInvoke$lambda$1 != null) {
                EdgeToEdgeHost edgeToEdgeHost = this.$edgeToEdgeSupport;
                boolean zBooleanValue = boolInvoke$lambda$1.booleanValue();
                if (edgeToEdgeHost != null) {
                    edgeToEdgeHost.overrideSystemBarsStyle(zBooleanValue);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
