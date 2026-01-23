package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.runtime.SnapshotState;
import java.util.concurrent.CancellationException;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: TableSpreadOverlay.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$TableSpreadOverlayInline$2$1", m3645f = "TableSpreadOverlay.kt", m3646l = {66, 85, 86, 87, 93, 97}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$TableSpreadOverlayInline$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class TableSpreadOverlay2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $borderAnimationAlpha;
    final /* synthetic */ SnapshotState<Boolean> $borderAnimationInProgress$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $borderAnimationProgress;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $gradientAlpha;
    final /* synthetic */ boolean $isDay;
    final /* synthetic */ Function0<Unit> $onBorderAnimationFinished;
    final /* synthetic */ boolean $showBorderAnimation;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TableSpreadOverlay2(boolean z, Animatable<Float, AnimationVectors2> animatable, Function0<Unit> function0, Animatable<Float, AnimationVectors2> animatable2, boolean z2, SnapshotState<Boolean> snapshotState, Animatable<Float, AnimationVectors2> animatable3, Continuation<? super TableSpreadOverlay2> continuation) {
        super(2, continuation);
        this.$showBorderAnimation = z;
        this.$borderAnimationAlpha = animatable;
        this.$onBorderAnimationFinished = function0;
        this.$gradientAlpha = animatable2;
        this.$isDay = z2;
        this.$borderAnimationInProgress$delegate = snapshotState;
        this.$borderAnimationProgress = animatable3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TableSpreadOverlay2 tableSpreadOverlay2 = new TableSpreadOverlay2(this.$showBorderAnimation, this.$borderAnimationAlpha, this.$onBorderAnimationFinished, this.$gradientAlpha, this.$isDay, this.$borderAnimationInProgress$delegate, this.$borderAnimationProgress, continuation);
        tableSpreadOverlay2.L$0 = obj;
        return tableSpreadOverlay2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TableSpreadOverlay2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        if (r12.snapTo(r1, r11) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        if (r12.snapTo(r1, r11) != r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[Catch: CancellationException -> 0x00e7, PHI: r1
      0x00b5: PHI (r1v18 kotlinx.coroutines.Job) = (r1v15 kotlinx.coroutines.Job), (r1v20 kotlinx.coroutines.Job) binds: [B:30:0x00b2, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {CancellationException -> 0x00e7, blocks: (B:7:0x0018, B:8:0x001d, B:35:0x00c1, B:11:0x0026, B:32:0x00b5, B:14:0x0033, B:29:0x00a7, B:17:0x003c, B:25:0x0067, B:20:0x0049, B:22:0x004d, B:36:0x00cc), top: B:44:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Job jobLaunch$default;
        Job job;
        Job job2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (CancellationException unused) {
            TableSpreadOverlay.TableSpreadOverlayInline_UR9CgXA$lambda$7(this.$borderAnimationInProgress$delegate, false);
            Animatable<Float, AnimationVectors2> animatable = this.$gradientAlpha;
            Float fBoxFloat = boxing.boxFloat(TableSpreadOverlay.getDefaultGradientAlpha(this.$isDay));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 6;
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (this.$showBorderAnimation) {
                    TableSpreadOverlay.TableSpreadOverlayInline_UR9CgXA$lambda$7(this.$borderAnimationInProgress$delegate, true);
                    Animatable<Float, AnimationVectors2> animatable2 = this.$borderAnimationAlpha;
                    Float fBoxFloat2 = boxing.boxFloat(1.0f);
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (animatable2.snapTo(fBoxFloat2, this) != coroutine_suspended) {
                        CoroutineScope coroutineScope2 = coroutineScope;
                        jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new TableSpreadOverlay4(this.$borderAnimationProgress, null), 3, null);
                        Job jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new TableSpreadOverlay3(this.$borderAnimationAlpha, null), 3, null);
                        Job jobLaunch$default3 = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new TableSpreadOverlay5(this.$gradientAlpha, this.$isDay, null), 3, null);
                        this.L$0 = jobLaunch$default2;
                        this.L$1 = jobLaunch$default3;
                        this.label = 2;
                        if (jobLaunch$default.join(this) == coroutine_suspended) {
                            job = jobLaunch$default2;
                            job2 = jobLaunch$default3;
                            this.L$0 = job2;
                            this.L$1 = null;
                            this.label = 3;
                            if (job.join(this) == coroutine_suspended) {
                                this.L$0 = null;
                                this.label = 4;
                                if (job2.join(this) == coroutine_suspended) {
                                }
                                TableSpreadOverlay.TableSpreadOverlayInline_UR9CgXA$lambda$7(this.$borderAnimationInProgress$delegate, false);
                                this.$onBorderAnimationFinished.invoke();
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } else {
                    TableSpreadOverlay.TableSpreadOverlayInline_UR9CgXA$lambda$7(this.$borderAnimationInProgress$delegate, false);
                    Animatable<Float, AnimationVectors2> animatable3 = this.$gradientAlpha;
                    Float fBoxFloat3 = boxing.boxFloat(TableSpreadOverlay.getDefaultGradientAlpha(this.$isDay));
                    this.label = 5;
                    break;
                }
                return coroutine_suspended;
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope22 = coroutineScope;
                jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new TableSpreadOverlay4(this.$borderAnimationProgress, null), 3, null);
                Job jobLaunch$default22 = BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new TableSpreadOverlay3(this.$borderAnimationAlpha, null), 3, null);
                Job jobLaunch$default32 = BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new TableSpreadOverlay5(this.$gradientAlpha, this.$isDay, null), 3, null);
                this.L$0 = jobLaunch$default22;
                this.L$1 = jobLaunch$default32;
                this.label = 2;
                if (jobLaunch$default.join(this) == coroutine_suspended) {
                }
                break;
            case 2:
                job2 = (Job) this.L$1;
                job = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = job2;
                this.L$1 = null;
                this.label = 3;
                if (job.join(this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                job2 = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 4;
                if (job2.join(this) == coroutine_suspended) {
                }
                TableSpreadOverlay.TableSpreadOverlayInline_UR9CgXA$lambda$7(this.$borderAnimationInProgress$delegate, false);
                this.$onBorderAnimationFinished.invoke();
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                TableSpreadOverlay.TableSpreadOverlayInline_UR9CgXA$lambda$7(this.$borderAnimationInProgress$delegate, false);
                this.$onBorderAnimationFinished.invoke();
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
