package com.robinhood.android.pathfinder.corepages.checkboxpage;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import java.util.concurrent.TimeUnit;
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

/* compiled from: CheckboxConfirmPageComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageComposableKt$CheckboxConfirmPageComposable$1$1", m3645f = "CheckboxConfirmPageComposable.kt", m3646l = {54}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageComposableKt$CheckboxConfirmPageComposable$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class CheckboxConfirmPageComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Boolean> $allChecked$delegate;
    final /* synthetic */ int $delayTime;
    final /* synthetic */ SnapshotState<Boolean> $hasDelayPassed$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckboxConfirmPageComposable2(int i, SnapshotState<Boolean> snapshotState, SnapshotState4<Boolean> snapshotState4, Continuation<? super CheckboxConfirmPageComposable2> continuation) {
        super(2, continuation);
        this.$delayTime = i;
        this.$hasDelayPassed$delegate = snapshotState;
        this.$allChecked$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckboxConfirmPageComposable2(this.$delayTime, this.$hasDelayPassed$delegate, this.$allChecked$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CheckboxConfirmPageComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!CheckboxConfirmPageComposable.CheckboxConfirmPageComposable$lambda$6(this.$hasDelayPassed$delegate) && CheckboxConfirmPageComposable.CheckboxConfirmPageComposable$lambda$4(this.$allChecked$delegate)) {
                long millis = TimeUnit.SECONDS.toMillis(this.$delayTime);
                this.label = 1;
                if (DelayKt.delay(millis, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CheckboxConfirmPageComposable.CheckboxConfirmPageComposable$lambda$7(this.$hasDelayPassed$delegate, true);
        return Unit.INSTANCE;
    }
}
