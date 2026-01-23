package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.Transformable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerEventType;
import androidx.compose.p011ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;

/* compiled from: Transformable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u000b\u001a*\u0010\u0013\u001a\u00020\u0012*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0016\u001a\u00020\t*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u0004\u0018\u00010\t*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0018\u0010\u0017\u001a>\u0010\u001a\u001a\u00020\u0012*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bH\u0082@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "", "lockRotationOnZoomPan", "enabled", "transformable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;ZZ)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "canPan", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;Lkotlin/jvm/functions/Function1;ZZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "channel", "Landroidx/compose/foundation/gestures/ScrollConfig;", "scrollConfig", "", "detectZoomByCtrlMouseScroll", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlinx/coroutines/channels/Channel;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "awaitFirstCtrlMouseScroll", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitCtrlMouseScrollOrNull", "panZoomLock", "detectZoom", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.gestures.TransformableKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class Transformable3 {

    /* compiled from: Transformable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TransformableKt", m3645f = "Transformable.kt", m3646l = {EnumC7081g.f2774x74902ae0}, m3647m = "awaitCtrlMouseScrollOrNull")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 */
    static final class C11491 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11491(Continuation<? super C11491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Transformable3.awaitCtrlMouseScrollOrNull(null, null, this);
        }
    }

    /* compiled from: Transformable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TransformableKt", m3645f = "Transformable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE}, m3647m = "awaitFirstCtrlMouseScroll")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 */
    static final class C11501 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11501(Continuation<? super C11501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Transformable3.awaitFirstCtrlMouseScroll(null, null, this);
        }
    }

    /* compiled from: Transformable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TransformableKt", m3645f = "Transformable.kt", m3646l = {337, 339, 385}, m3647m = "detectZoom")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 */
    static final class C11511 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C11511(Continuation<? super C11511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Transformable3.detectZoom(null, false, null, null, this);
        }
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, boolean z, boolean z2) {
        return transformable(modifier, transformableState, new Function1<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableKt.transformable.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
                return m5053invokek4lQ0M(offset.getPackedValue());
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final Boolean m5053invokek4lQ0M(long j) {
                return Boolean.TRUE;
            }
        }, z, z2);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, Function1<? super Offset, Boolean> function1, boolean z, boolean z2) {
        return modifier.then(new Transformable2(transformableState, function1, z, z2));
    }

    /* compiled from: Transformable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", m3645f = "Transformable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2 */
    static final class C11522 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<Transformable> $channel;
        final /* synthetic */ CoroutineContext $currentContext;
        final /* synthetic */ ScrollConfig $scrollConfig;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11522(CoroutineContext coroutineContext, ScrollConfig scrollConfig, Channel<Transformable> channel, Continuation<? super C11522> continuation) {
            super(2, continuation);
            this.$currentContext = coroutineContext;
            this.$scrollConfig = scrollConfig;
            this.$channel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11522 c11522 = new C11522(this.$currentContext, this.$scrollConfig, this.$channel, continuation);
            c11522.L$0 = obj;
            return c11522;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C11522) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        
            if (r13 == r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: all -> 0x0017, TRY_ENTER, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:26:0x008c, B:28:0x0090, B:23:0x0055, B:19:0x003b, B:22:0x0048, B:14:0x0027), top: B:35:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:26:0x008c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            long packedValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    if (!JobKt.isActive(this.$currentContext)) {
                    }
                } else if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    packedValue = ((Offset) obj).getPackedValue();
                    this.$channel.mo8337trySendJP2dKIU(Transformable.TransformStarted.INSTANCE);
                    this.$channel.mo8337trySendJP2dKIU(new Transformable.TransformDelta((float) Math.pow(2.0f, Float.intBitsToFloat((int) (packedValue & 4294967295L)) / 545.0f), Offset.INSTANCE.m6553getZeroF1C5BW0(), 0.0f, null));
                    ScrollConfig scrollConfig = this.$scrollConfig;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 2;
                    obj = Transformable3.awaitCtrlMouseScrollOrNull(awaitPointerEventScope, scrollConfig, this);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Offset offset = (Offset) obj;
                    if (offset != null) {
                        packedValue = offset.getPackedValue();
                        this.$channel.mo8337trySendJP2dKIU(new Transformable.TransformDelta((float) Math.pow(2.0f, Float.intBitsToFloat((int) (packedValue & 4294967295L)) / 545.0f), Offset.INSTANCE.m6553getZeroF1C5BW0(), 0.0f, null));
                        ScrollConfig scrollConfig2 = this.$scrollConfig;
                        this.L$0 = awaitPointerEventScope;
                        this.label = 2;
                        obj = Transformable3.awaitCtrlMouseScrollOrNull(awaitPointerEventScope, scrollConfig2, this);
                    } else {
                        this.$channel.mo8337trySendJP2dKIU(Transformable.TransformStopped.INSTANCE);
                        if (!JobKt.isActive(this.$currentContext)) {
                            ScrollConfig scrollConfig3 = this.$scrollConfig;
                            this.L$0 = awaitPointerEventScope;
                            this.label = 1;
                            obj = Transformable3.awaitFirstCtrlMouseScroll(awaitPointerEventScope, scrollConfig3, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            packedValue = ((Offset) obj).getPackedValue();
                            this.$channel.mo8337trySendJP2dKIU(Transformable.TransformStarted.INSTANCE);
                            this.$channel.mo8337trySendJP2dKIU(new Transformable.TransformDelta((float) Math.pow(2.0f, Float.intBitsToFloat((int) (packedValue & 4294967295L)) / 545.0f), Offset.INSTANCE.m6553getZeroF1C5BW0(), 0.0f, null));
                            ScrollConfig scrollConfig22 = this.$scrollConfig;
                            this.L$0 = awaitPointerEventScope;
                            this.label = 2;
                            obj = Transformable3.awaitCtrlMouseScrollOrNull(awaitPointerEventScope, scrollConfig22, this);
                        } else {
                            return Unit.INSTANCE;
                        }
                    }
                }
            } catch (Throwable th) {
                this.$channel.mo8337trySendJP2dKIU(Transformable.TransformStopped.INSTANCE);
                throw th;
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFirstCtrlMouseScroll(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, kotlin.coroutines.Continuation<? super androidx.compose.p011ui.geometry.Offset> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.Transformable3.C11501
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = (androidx.compose.foundation.gestures.Transformable3.C11501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.L$1
            androidx.compose.foundation.gestures.ScrollConfig r5 = (androidx.compose.foundation.gestures.ScrollConfig) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r6
            kotlin.ResultKt.throwOnFailure(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L4c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.ResultKt.throwOnFailure(r7)
        L3f:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = awaitCtrlMouseScrollOrNull(r5, r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.p011ui.geometry.Offset) r7
            if (r7 == 0) goto L3f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.Transformable3.awaitFirstCtrlMouseScroll(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitCtrlMouseScrollOrNull(AwaitPointerEventScope awaitPointerEventScope, ScrollConfig scrollConfig, Continuation<? super Offset> continuation) {
        C11491 c11491;
        if (continuation instanceof C11491) {
            c11491 = (C11491) continuation;
            int i = c11491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11491.label = i - Integer.MIN_VALUE;
            } else {
                c11491 = new C11491(continuation);
            }
        }
        Object objAwaitPointerEvent$default = c11491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11491.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitPointerEvent$default);
            c11491.L$0 = awaitPointerEventScope;
            c11491.L$1 = scrollConfig;
            c11491.label = 1;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, c11491, 1, null);
            if (objAwaitPointerEvent$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scrollConfig = (ScrollConfig) c11491.L$1;
            awaitPointerEventScope = (AwaitPointerEventScope) c11491.L$0;
            ResultKt.throwOnFailure(objAwaitPointerEvent$default);
        }
        PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
        if (!PointerEvent_androidKt.m7164isCtrlPressed5xRPYO0(pointerEvent.getKeyboardModifiers()) || !PointerEventType.m7156equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m7162getScroll7fucELk())) {
            return null;
        }
        long jMo4959calculateMouseWheelScroll8xgXZGE = scrollConfig.mo4959calculateMouseWheelScroll8xgXZGE(awaitPointerEventScope, pointerEvent, awaitPointerEventScope.mo7138getSizeYbymL2g());
        if (Offset.m6540equalsimpl0(jMo4959calculateMouseWheelScroll8xgXZGE, Offset.INSTANCE.m6553getZeroF1C5BW0())) {
            return null;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i3 = 0; i3 < size; i3++) {
            changes.get(i3).consume();
        }
        return Offset.m6534boximpl(jMo4959calculateMouseWheelScroll8xgXZGE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02c0, code lost:
    
        if (r6 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02c2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c7 A[EDGE_INSN: B:103:0x02c7->B:92:0x02c7 BREAK  A[LOOP:0: B:86:0x02b2->B:91:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02da  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0294 -> B:85:0x02a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object detectZoom(AwaitPointerEventScope awaitPointerEventScope, boolean z, Channel<Transformable> channel, Function1<? super Offset, Boolean> function1, Continuation<? super Unit> continuation) {
        C11511 c11511;
        Channel<Transformable> channel2;
        Function1<? super Offset, Boolean> function12;
        boolean z2;
        float f;
        long j;
        int i;
        int i2;
        float f2;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super Offset, Boolean> function13;
        AwaitPointerEventScope awaitPointerEventScope3;
        float f4;
        float f5;
        Channel<Transformable> channel3;
        int size;
        int i3;
        int i4;
        C11511 c115112;
        float f6;
        long j2;
        int i5;
        int i6;
        C11511 c115113;
        Object objAwaitPointerEvent;
        float f7;
        int i7;
        int i8;
        Channel<Transformable> channel4;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerEvent pointerEvent;
        float f8;
        float f9;
        long j3;
        int size2;
        int i9;
        int size3;
        int i10;
        int size4;
        int i11;
        if (continuation instanceof C11511) {
            c11511 = (C11511) continuation;
            int i12 = c11511.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c11511.label = i12 - Integer.MIN_VALUE;
            } else {
                c11511 = new C11511(continuation);
            }
        }
        C11511 c115114 = c11511;
        Object objAwaitPointerEvent$default = c115114.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c115114.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objAwaitPointerEvent$default);
            long jM6553getZeroF1C5BW0 = Offset.INSTANCE.m6553getZeroF1C5BW0();
            float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
            c115114.L$0 = awaitPointerEventScope;
            channel2 = channel;
            c115114.L$1 = channel2;
            function12 = function1;
            c115114.L$2 = function12;
            z2 = z;
            c115114.Z$0 = z2;
            c115114.F$0 = 0.0f;
            c115114.F$1 = 1.0f;
            c115114.J$0 = jM6553getZeroF1C5BW0;
            c115114.I$0 = 0;
            c115114.F$2 = touchSlop;
            c115114.I$1 = 0;
            c115114.label = 1;
            if (TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope, false, null, c115114, 2, null) != coroutine_suspended) {
                f = touchSlop;
                j = jM6553getZeroF1C5BW0;
                i = 0;
                i2 = 0;
                f2 = 1.0f;
                f3 = 0.0f;
                awaitPointerEventScope2 = awaitPointerEventScope;
            }
            return coroutine_suspended;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = c115114.I$2;
                i7 = c115114.I$1;
                f7 = c115114.F$2;
                i8 = c115114.I$0;
                j2 = c115114.J$0;
                float f10 = c115114.F$1;
                f3 = c115114.F$0;
                boolean z3 = c115114.Z$0;
                pointerEvent = (PointerEvent) c115114.L$3;
                Function1<? super Offset, Boolean> function14 = (Function1) c115114.L$2;
                Channel<Transformable> channel5 = (Channel) c115114.L$1;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) c115114.L$0;
                ResultKt.throwOnFailure(objAwaitPointerEvent$default);
                f2 = f10;
                channel4 = channel5;
                awaitPointerEventScope4 = awaitPointerEventScope5;
                function12 = function14;
                z2 = z3;
                c115113 = c115114;
                objAwaitPointerEvent = objAwaitPointerEvent$default;
                List<PointerInputChange> changes = ((PointerEvent) objAwaitPointerEvent).getChanges();
                size3 = changes.size();
                Object obj = coroutine_suspended;
                i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                        break;
                    }
                    if (changes.get(i10).isConsumed()) {
                        break;
                    }
                    i10++;
                }
                boolean z4 = false;
                if (i4 == 0 && !z4) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    size4 = changes2.size();
                    for (i11 = 0; i11 < size4; i11++) {
                        if (changes2.get(i11).getPressed()) {
                            i = i7;
                            f = f7;
                            i2 = i8;
                            c115114 = c115113;
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            coroutine_suspended = obj;
                            channel2 = channel4;
                            j = j2;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            i = c115114.I$1;
            f = c115114.F$2;
            i2 = c115114.I$0;
            j = c115114.J$0;
            float f11 = c115114.F$1;
            float f12 = c115114.F$0;
            boolean z5 = c115114.Z$0;
            Function1<? super Offset, Boolean> function15 = (Function1) c115114.L$2;
            Channel<Transformable> channel6 = (Channel) c115114.L$1;
            AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) c115114.L$0;
            ResultKt.throwOnFailure(objAwaitPointerEvent$default);
            f5 = f11;
            channel3 = channel6;
            z2 = z5;
            f4 = f12;
            function13 = function15;
            awaitPointerEventScope3 = awaitPointerEventScope6;
            PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
            size = changes3.size();
            int i14 = i;
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i4 = 0;
                    break;
                }
                if (changes3.get(i3).isConsumed()) {
                    i4 = 1;
                    break;
                }
                i3++;
            }
            if (i4 != 0) {
                float fCalculateZoom = TransformGestureDetector.calculateZoom(pointerEvent2);
                float fCalculateRotation = TransformGestureDetector.calculateRotation(pointerEvent2);
                float f13 = f5;
                float f14 = f4;
                long jCalculatePan = TransformGestureDetector.calculatePan(pointerEvent2);
                if (i2 == 0) {
                    float f15 = f13 * fCalculateZoom;
                    float f16 = f14 + fCalculateRotation;
                    long jM6547plusMKHz9U = Offset.m6547plusMKHz9U(j, jCalculatePan);
                    int i15 = i2;
                    float fCalculateCentroidSize = TransformGestureDetector.calculateCentroidSize(pointerEvent2, false);
                    float fAbs = Math.abs(1 - f15) * fCalculateCentroidSize;
                    float fAbs2 = Math.abs(((3.1415927f * f16) * fCalculateCentroidSize) / 180.0f);
                    float fM6541getDistanceimpl = Offset.m6541getDistanceimpl(jM6547plusMKHz9U);
                    if (fAbs > f || fAbs2 > f || (fM6541getDistanceimpl > f && function13.invoke(Offset.m6534boximpl(jCalculatePan)).booleanValue())) {
                        i6 = (!z2 || fAbs2 >= f) ? 0 : 1;
                        channel3.mo8337trySendJP2dKIU(Transformable.TransformStarted.INSTANCE);
                        i5 = 1;
                        f8 = f15;
                        f9 = f16;
                    } else {
                        i6 = i14;
                        f8 = f15;
                        f9 = f16;
                        i5 = i15;
                    }
                    j3 = jM6547plusMKHz9U;
                } else {
                    f8 = f13;
                    f9 = f14;
                    j3 = j;
                    i5 = i2;
                    i6 = i14;
                }
                if (i5 == 0) {
                    c115112 = c115114;
                } else {
                    float f17 = i6 != 0 ? 0.0f : fCalculateRotation;
                    if (f17 == 0.0f && fCalculateZoom == 1.0f) {
                        c115112 = c115114;
                        if (!Offset.m6540equalsimpl0(jCalculatePan, Offset.INSTANCE.m6553getZeroF1C5BW0()) && function13.invoke(Offset.m6534boximpl(jCalculatePan)).booleanValue()) {
                        }
                        List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                        size2 = changes4.size();
                        for (i9 = 0; i9 < size2; i9++) {
                            PointerInputChange pointerInputChange = changes4.get(i9);
                            if (PointerEventKt.positionChanged(pointerInputChange)) {
                                pointerInputChange.consume();
                            }
                        }
                    } else {
                        c115112 = c115114;
                    }
                    channel3.mo8337trySendJP2dKIU(new Transformable.TransformDelta(fCalculateZoom, jCalculatePan, f17, null));
                    List<PointerInputChange> changes42 = pointerEvent2.getChanges();
                    size2 = changes42.size();
                    while (i9 < size2) {
                    }
                }
                j2 = j3;
                f6 = f8;
                f3 = f9;
            } else {
                int i16 = i2;
                c115112 = c115114;
                channel3.mo8337trySendJP2dKIU(Transformable.TransformStopped.INSTANCE);
                f6 = f5;
                f3 = f4;
                j2 = j;
                i5 = i16;
                i6 = i14;
            }
            PointerEventPass pointerEventPass = PointerEventPass.Final;
            c115113 = c115112;
            c115113.L$0 = awaitPointerEventScope3;
            c115113.L$1 = channel3;
            c115113.L$2 = function13;
            c115113.L$3 = pointerEvent2;
            c115113.Z$0 = z2;
            c115113.F$0 = f3;
            c115113.F$1 = f6;
            c115113.J$0 = j2;
            c115113.I$0 = i5;
            c115113.F$2 = f;
            c115113.I$1 = i6;
            c115113.I$2 = i4;
            c115113.label = 3;
            objAwaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, c115113);
            if (objAwaitPointerEvent != coroutine_suspended) {
                float f18 = f6;
                f7 = f;
                i7 = i6;
                i8 = i5;
                channel4 = channel3;
                f2 = f18;
                awaitPointerEventScope4 = awaitPointerEventScope3;
                function12 = function13;
                pointerEvent = pointerEvent2;
                List<PointerInputChange> changes5 = ((PointerEvent) objAwaitPointerEvent).getChanges();
                size3 = changes5.size();
                Object obj2 = coroutine_suspended;
                i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                    }
                    i10++;
                }
                boolean z42 = false;
                if (i4 == 0) {
                    List<PointerInputChange> changes22 = pointerEvent.getChanges();
                    size4 = changes22.size();
                    while (i11 < size4) {
                    }
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        i = c115114.I$1;
        f = c115114.F$2;
        i2 = c115114.I$0;
        j = c115114.J$0;
        f2 = c115114.F$1;
        f3 = c115114.F$0;
        boolean z6 = c115114.Z$0;
        function12 = (Function1) c115114.L$2;
        Channel<Transformable> channel7 = (Channel) c115114.L$1;
        awaitPointerEventScope2 = (AwaitPointerEventScope) c115114.L$0;
        ResultKt.throwOnFailure(objAwaitPointerEvent$default);
        z2 = z6;
        channel2 = channel7;
        c115114.L$0 = awaitPointerEventScope2;
        c115114.L$1 = channel2;
        c115114.L$2 = function12;
        c115114.L$3 = null;
        c115114.Z$0 = z2;
        c115114.F$0 = f3;
        c115114.F$1 = f2;
        c115114.J$0 = j;
        c115114.I$0 = i2;
        c115114.F$2 = f;
        c115114.I$1 = i;
        c115114.label = 2;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, c115114, 1, null);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
            float f19 = f3;
            f5 = f2;
            channel3 = channel2;
            f4 = f19;
            AwaitPointerEventScope awaitPointerEventScope7 = awaitPointerEventScope2;
            function13 = function12;
            awaitPointerEventScope3 = awaitPointerEventScope7;
            PointerEvent pointerEvent22 = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes32 = pointerEvent22.getChanges();
            size = changes32.size();
            int i142 = i;
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (i4 != 0) {
            }
            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
            c115113 = c115112;
            c115113.L$0 = awaitPointerEventScope3;
            c115113.L$1 = channel3;
            c115113.L$2 = function13;
            c115113.L$3 = pointerEvent22;
            c115113.Z$0 = z2;
            c115113.F$0 = f3;
            c115113.F$1 = f6;
            c115113.J$0 = j2;
            c115113.I$0 = i5;
            c115113.F$2 = f;
            c115113.I$1 = i6;
            c115113.I$2 = i4;
            c115113.label = 3;
            objAwaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass2, c115113);
            if (objAwaitPointerEvent != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectZoomByCtrlMouseScroll(PointerInputScope pointerInputScope, Channel<Transformable> channel, ScrollConfig scrollConfig, Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C11522(continuation.getContext(), scrollConfig, channel, null), continuation);
        return objAwaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }
}
