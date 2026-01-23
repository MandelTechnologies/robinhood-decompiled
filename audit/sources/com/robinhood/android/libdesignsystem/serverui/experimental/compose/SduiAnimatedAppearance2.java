package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.AnimatedAppearanceDto;

/* compiled from: SduiAnimatedAppearance.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$SduiAnimatedAppearance$1$1", m3645f = "SduiAnimatedAppearance.kt", m3646l = {52, 69}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedAppearanceKt$SduiAnimatedAppearance$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SduiAnimatedAppearance2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnimatedAppearanceDto $component;
    final /* synthetic */ SnapshotState<Boolean> $showAnimatedVisibility$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SduiAnimatedAppearance2(AnimatedAppearanceDto animatedAppearanceDto, SnapshotState<Boolean> snapshotState, Continuation<? super SduiAnimatedAppearance2> continuation) {
        super(2, continuation);
        this.$component = animatedAppearanceDto;
        this.$showAnimatedVisibility$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SduiAnimatedAppearance2(this.$component, this.$showAnimatedVisibility$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SduiAnimatedAppearance2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1, r10) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay((r5 + r7) + r3, r10) != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Double duration;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!SduiAnimatedAppearance.SduiAnimatedAppearance$lambda$2(this.$showAnimatedVisibility$delegate)) {
                this.label = 1;
            } else {
                if (this.$component.getDisappearing_animation_data() != null && this.$component.getDisappeared_state() != null) {
                    AnimatedAppearanceDto.AnimationDataDto animation_data = this.$component.getAnimation_data();
                    long jConvert = animation_data == null ? (long) Duration.INSTANCE.convert(animation_data.getDelay(), DurationUnitJvm.SECONDS, DurationUnitJvm.MILLISECONDS) : 0L;
                    AnimatedAppearanceDto.AnimationDataDto animation_data2 = this.$component.getAnimation_data();
                    long jConvert2 = (animation_data2 != null || (duration = animation_data2.getDuration()) == null) ? 300L : (long) Duration.INSTANCE.convert(duration.doubleValue(), DurationUnitJvm.SECONDS, DurationUnitJvm.MILLISECONDS);
                    AnimatedAppearanceDto.AnimationDataDto disappearing_animation_data = this.$component.getDisappearing_animation_data();
                    long jConvert3 = disappearing_animation_data != null ? (long) Duration.INSTANCE.convert(disappearing_animation_data.getDelay(), DurationUnitJvm.SECONDS, DurationUnitJvm.MILLISECONDS) : 0L;
                    this.label = 2;
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SduiAnimatedAppearance.SduiAnimatedAppearance$lambda$3(this.$showAnimatedVisibility$delegate, false);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        SduiAnimatedAppearance.SduiAnimatedAppearance$lambda$3(this.$showAnimatedVisibility$delegate, true);
        if (this.$component.getDisappearing_animation_data() != null) {
            AnimatedAppearanceDto.AnimationDataDto animation_data3 = this.$component.getAnimation_data();
            if (animation_data3 == null) {
            }
            AnimatedAppearanceDto.AnimationDataDto animation_data22 = this.$component.getAnimation_data();
            if (animation_data22 != null) {
                AnimatedAppearanceDto.AnimationDataDto disappearing_animation_data2 = this.$component.getDisappearing_animation_data();
                if (disappearing_animation_data2 != null) {
                }
                this.label = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
