package com.robinhood.android.transfers.p271ui.p272v2;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintSet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel5;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4$1", m3645f = "ConstraintLayout.kt", m3646l = {779, 789}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$invoke$lambda$3$$inlined$ConstraintLayout$2 */
/* loaded from: classes9.dex */
public final class C31116x37ecbe94 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnimationSpec $animateChangesSpec;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ SnapshotIntState2 $direction;
    final /* synthetic */ SnapshotState $endConstraint$delegate;
    final /* synthetic */ Function0 $finishedAnimationListener;
    final /* synthetic */ Animatable $progress;
    final /* synthetic */ SnapshotState $startConstraint$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31116x37ecbe94(Channel channel, SnapshotIntState2 snapshotIntState2, Animatable animatable, AnimationSpec animationSpec, Function0 function0, SnapshotState snapshotState, SnapshotState snapshotState2, Continuation continuation) {
        super(2, continuation);
        this.$channel = channel;
        this.$direction = snapshotIntState2;
        this.$progress = animatable;
        this.$animateChangesSpec = animationSpec;
        this.$finishedAnimationListener = function0;
        this.$startConstraint$delegate = snapshotState;
        this.$endConstraint$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C31116x37ecbe94(this.$channel, this.$direction, this.$progress, this.$animateChangesSpec, this.$finishedAnimationListener, this.$startConstraint$delegate, this.$endConstraint$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C31116x37ecbe94) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, null, r10, 12, null) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ab -> B:7:0x0016). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:12:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Channel3 it;
        Channel3 channel3;
        Object objHasNext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = this.$channel.iterator();
            this.L$0 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext == coroutine_suspended) {
            }
        } else if (i == 1) {
            channel3 = (Channel3) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel3 = (Channel3) this.L$0;
            ResultKt.throwOnFailure(obj);
            C31116x37ecbe94 c31116x37ecbe94 = this;
            it = channel3;
            SnapshotIntState2 snapshotIntState2 = c31116x37ecbe94.$direction;
            snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() == 1 ? 0 : 1);
            Function0 function0 = c31116x37ecbe94.$finishedAnimationListener;
            if (function0 != null) {
                function0.invoke();
            }
            this.L$0 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            channel3 = it;
            obj = objHasNext;
            if (!((Boolean) obj).booleanValue()) {
                ConstraintSet constraintSet = (ConstraintSet) channel3.next();
                ConstraintSet constraintSet2 = (ConstraintSet) Channel5.m28806getOrNullimpl(this.$channel.mo28799tryReceivePtdJZtk());
                if (constraintSet2 != null) {
                    constraintSet = constraintSet2;
                }
                if (Intrinsics.areEqual(constraintSet, this.$direction.getIntValue() == 1 ? ConstraintLayoutKt.m8144ConstraintLayout$lambda17(this.$startConstraint$delegate) : ConstraintLayoutKt.m8146ConstraintLayout$lambda20(this.$endConstraint$delegate))) {
                    it = channel3;
                    this.L$0 = it;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == coroutine_suspended) {
                    }
                } else {
                    if (this.$direction.getIntValue() != 1) {
                        this.$startConstraint$delegate.setValue(constraintSet);
                    } else {
                        this.$endConstraint$delegate.setValue(constraintSet);
                    }
                    Animatable animatable = this.$progress;
                    Float fBoxFloat = boxing.boxFloat(this.$direction.getIntValue());
                    AnimationSpec animationSpec = this.$animateChangesSpec;
                    this.L$0 = channel3;
                    this.label = 2;
                    c31116x37ecbe94 = this;
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
