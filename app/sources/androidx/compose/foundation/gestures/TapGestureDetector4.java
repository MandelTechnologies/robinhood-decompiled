package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.TapGestureDetector;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.p011ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.PointerType;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* compiled from: TapGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u008d\u0001\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u0003*\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0016\u001a\u00020\u0003*\u00020\u00002/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017\u001a(\u0010\u001c\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010 \u001a\u00020\u0018*\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!\u001a \u0010\"\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\"\u0010#\u001a\u001e\u0010%\u001a\u00020$*\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b%\u0010#\u001aN\u0010-\u001a\u00020'*\u00020&2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2'\u0010,\u001a#\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0+¢\u0006\u0002\b\nH\u0002¢\u0006\u0004\b-\u0010.\";\u0010/\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\"\u001a\u00105\u001a\u00020)8BX\u0082\u0004¢\u0006\f\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onPress", "onTap", "detectTapGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "consumeUntilUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "firstUp", "awaitSecondDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapAndPress", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requireUnconsumed", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "awaitFirstDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "onlyPrimaryMouseButton", "isChangedToDown", "(Landroidx/compose/ui/input/pointer/PointerEvent;ZZ)Z", "waitForUpOrCancellation", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/LongPressResult;", "waitForLongPress", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "resetJob", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "block", "launchAwaitingReset", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/Job;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "NoPressGesture", "Lkotlin/jvm/functions/Function3;", "getCoroutineStartForCurrentDispatchBehavior", "()Lkotlinx/coroutines/CoroutineStart;", "getCoroutineStartForCurrentDispatchBehavior$annotations", "()V", "coroutineStartForCurrentDispatchBehavior", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class TapGestureDetector4 {
    private static final Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> NoPressGesture = new TapGestureDetector5(null);

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m3645f = "TapGestureDetector.kt", m3646l = {EnumC7081g.f2776x87e624cb}, m3647m = "awaitFirstDown")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 */
    static final class C11402 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C11402(Continuation<? super C11402> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetector4.awaitFirstDown(null, false, null, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m3645f = "TapGestureDetector.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m3647m = "consumeUntilUp")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 */
    static final class C11421 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11421(Continuation<? super C11421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetector4.consumeUntilUp(null, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m3645f = "TapGestureDetector.kt", m3646l = {384}, m3647m = "waitForLongPress")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 */
    static final class C11461 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11461(Continuation<? super C11461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetector4.waitForLongPress(null, null, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m3645f = "TapGestureDetector.kt", m3646l = {352, 366}, m3647m = "waitForUpOrCancellation")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 */
    static final class C11482 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11482(Continuation<? super C11482> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetector4.waitForUpOrCancellation(null, null, this);
        }
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function12 = null;
        }
        if ((i & 4) != 0) {
            function3 = NoPressGesture;
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        return detectTapGestures(pointerInputScope, function1, function12, function3, function13, continuation);
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", m3645f = "TapGestureDetector.kt", m3646l = {104}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2 */
    static final class C11442 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
        final /* synthetic */ Function1<Offset, Unit> $onLongPress;
        final /* synthetic */ Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> $onPress;
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        final /* synthetic */ PointerInputScope $this_detectTapGestures;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11442(PointerInputScope pointerInputScope, Function3<? super TapGestureDetector2, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, Continuation<? super C11442> continuation) {
            super(2, continuation);
            this.$this_detectTapGestures = pointerInputScope;
            this.$onPress = function3;
            this.$onLongPress = function1;
            this.$onDoubleTap = function12;
            this.$onTap = function13;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11442 c11442 = new C11442(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
            c11442.L$0 = obj;
            return c11442;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11442) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                TapGestureDetector3 tapGestureDetector3 = new TapGestureDetector3(this.$this_detectTapGestures);
                PointerInputScope pointerInputScope = this.$this_detectTapGestures;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, tapGestureDetector3, null);
                this.label = 1;
                if (ForEachGesture.awaitEachGesture(pointerInputScope, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: TapGestureDetector.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", m3645f = "TapGestureDetector.kt", m3646l = {105, 116, 119, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 167, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
            final /* synthetic */ Function1<Offset, Unit> $onLongPress;
            final /* synthetic */ Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> $onPress;
            final /* synthetic */ Function1<Offset, Unit> $onTap;
            final /* synthetic */ TapGestureDetector3 $pressScope;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineScope coroutineScope, Function3<? super TapGestureDetector2, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, TapGestureDetector3 tapGestureDetector3, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.$onPress = function3;
                this.$onLongPress = function1;
                this.$onDoubleTap = function12;
                this.$onTap = function13;
                this.$pressScope = tapGestureDetector3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
            
                if (r1 == r6) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
            
                if (androidx.compose.foundation.gestures.TapGestureDetector4.consumeUntilUp(r2, r22) == r6) goto L80;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x025c  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0273  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                Object objAwaitFirstDown$default;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerInputChange pointerInputChange;
                Job job;
                Object objWaitForLongPress$default;
                Object objWaitForUpOrCancellation$default;
                PointerInputChange finalUpChange;
                Job jobLaunchAwaitingReset$default;
                Object objAwaitSecondDown;
                TapGestureDetector tapGestureDetector;
                PointerInputChange pointerInputChange2;
                Object objWaitForLongPress$default2;
                Job job2;
                PointerInputChange pointerInputChange3;
                AwaitPointerEventScope awaitPointerEventScope3;
                Object objWaitForUpOrCancellation$default2;
                Job job3;
                PointerInputChange pointerInputChange4;
                PointerInputChange finalUpChange2;
                Job job4;
                TapGestureDetector tapGestureDetector2;
                Job job5;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope;
                        this.label = 1;
                        objAwaitFirstDown$default = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 3, null);
                        if (objAwaitFirstDown$default != coroutine_suspended) {
                            awaitPointerEventScope2 = awaitPointerEventScope;
                            pointerInputChange = (PointerInputChange) objAwaitFirstDown$default;
                            pointerInputChange.consume();
                            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, TapGestureDetector4.getCoroutineStartForCurrentDispatchBehavior(), new TapGestureDetector7(this.$pressScope, null), 1, null);
                            if (this.$onPress != TapGestureDetector4.NoPressGesture) {
                                TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, jobLaunch$default, null, new C494601(this.$onPress, this.$pressScope, pointerInputChange, null), 2, null);
                            }
                            job = jobLaunch$default;
                            if (this.$onLongPress != null) {
                                this.L$0 = awaitPointerEventScope2;
                                this.L$1 = job;
                                this.label = 2;
                                objWaitForUpOrCancellation$default = TapGestureDetector4.waitForUpOrCancellation$default(awaitPointerEventScope2, null, this, 1, null);
                                break;
                            } else {
                                this.L$0 = awaitPointerEventScope2;
                                this.L$1 = pointerInputChange;
                                this.L$2 = job;
                                this.label = 3;
                                objWaitForLongPress$default = TapGestureDetector4.waitForLongPress$default(awaitPointerEventScope2, null, this, 1, null);
                                if (objWaitForLongPress$default != coroutine_suspended) {
                                    tapGestureDetector = (TapGestureDetector) objWaitForLongPress$default;
                                    if (!Intrinsics.areEqual(tapGestureDetector, TapGestureDetector.Success.INSTANCE)) {
                                        this.$onLongPress.invoke(Offset.m6534boximpl(pointerInputChange.getPosition()));
                                        this.L$0 = job;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 4;
                                        break;
                                    } else {
                                        if (tapGestureDetector instanceof TapGestureDetector.Released) {
                                            finalUpChange = ((TapGestureDetector.Released) tapGestureDetector).getFinalUpChange();
                                        } else {
                                            if (!(tapGestureDetector instanceof TapGestureDetector.Canceled)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            finalUpChange = null;
                                        }
                                        Job job6 = job;
                                        if (finalUpChange != null) {
                                            jobLaunchAwaitingReset$default = TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, job6, null, new AnonymousClass3(this.$pressScope, null), 2, null);
                                        } else {
                                            finalUpChange.consume();
                                            jobLaunchAwaitingReset$default = TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, job6, null, new AnonymousClass4(this.$pressScope, null), 2, null);
                                        }
                                        if (finalUpChange != null) {
                                            if (this.$onDoubleTap == null) {
                                                Function1<Offset, Unit> function1 = this.$onTap;
                                                if (function1 != null) {
                                                    function1.invoke(Offset.m6534boximpl(finalUpChange.getPosition()));
                                                }
                                            } else {
                                                this.L$0 = awaitPointerEventScope2;
                                                this.L$1 = finalUpChange;
                                                this.L$2 = jobLaunchAwaitingReset$default;
                                                this.label = 5;
                                                objAwaitSecondDown = TapGestureDetector4.awaitSecondDown(awaitPointerEventScope2, finalUpChange, this);
                                                if (objAwaitSecondDown != coroutine_suspended) {
                                                    pointerInputChange2 = (PointerInputChange) objAwaitSecondDown;
                                                    if (pointerInputChange2 != null) {
                                                        Function1<Offset, Unit> function12 = this.$onTap;
                                                        if (function12 != null) {
                                                            function12.invoke(Offset.m6534boximpl(finalUpChange.getPosition()));
                                                        }
                                                    } else {
                                                        Job jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, TapGestureDetector4.getCoroutineStartForCurrentDispatchBehavior(), new AnonymousClass5(jobLaunchAwaitingReset$default, this.$pressScope, null), 1, null);
                                                        if (this.$onPress != TapGestureDetector4.NoPressGesture) {
                                                            TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, jobLaunch$default2, null, new AnonymousClass6(this.$onPress, this.$pressScope, pointerInputChange2, null), 2, null);
                                                        }
                                                        if (this.$onLongPress == null) {
                                                            this.L$0 = jobLaunch$default2;
                                                            this.L$1 = finalUpChange;
                                                            this.L$2 = null;
                                                            this.label = 6;
                                                            objWaitForUpOrCancellation$default2 = TapGestureDetector4.waitForUpOrCancellation$default(awaitPointerEventScope2, null, this, 1, null);
                                                            if (objWaitForUpOrCancellation$default2 != coroutine_suspended) {
                                                                PointerInputChange pointerInputChange5 = finalUpChange;
                                                                job3 = jobLaunch$default2;
                                                                pointerInputChange4 = pointerInputChange5;
                                                                finalUpChange2 = (PointerInputChange) objWaitForUpOrCancellation$default2;
                                                                job4 = job3;
                                                                if (finalUpChange2 != null) {
                                                                    finalUpChange2.consume();
                                                                    TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, job4, null, new AnonymousClass7(this.$pressScope, null), 2, null);
                                                                    this.$onDoubleTap.invoke(Offset.m6534boximpl(finalUpChange2.getPosition()));
                                                                } else {
                                                                    TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, job4, null, new AnonymousClass8(this.$pressScope, null), 2, null);
                                                                    Function1<Offset, Unit> function13 = this.$onTap;
                                                                    if (function13 != null) {
                                                                        function13.invoke(Offset.m6534boximpl(pointerInputChange4.getPosition()));
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            this.L$0 = awaitPointerEventScope2;
                                                            this.L$1 = jobLaunch$default2;
                                                            this.L$2 = finalUpChange;
                                                            this.L$3 = pointerInputChange2;
                                                            this.label = 7;
                                                            objWaitForLongPress$default2 = TapGestureDetector4.waitForLongPress$default(awaitPointerEventScope2, null, this, 1, null);
                                                            if (objWaitForLongPress$default2 != coroutine_suspended) {
                                                                AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope2;
                                                                job2 = jobLaunch$default2;
                                                                pointerInputChange3 = pointerInputChange2;
                                                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                                                tapGestureDetector2 = (TapGestureDetector) objWaitForLongPress$default2;
                                                                if (Intrinsics.areEqual(tapGestureDetector2, TapGestureDetector.Success.INSTANCE)) {
                                                                    if (tapGestureDetector2 instanceof TapGestureDetector.Released) {
                                                                        job4 = job2;
                                                                        finalUpChange2 = ((TapGestureDetector.Released) tapGestureDetector2).getFinalUpChange();
                                                                        pointerInputChange4 = finalUpChange;
                                                                    } else {
                                                                        if (!(tapGestureDetector2 instanceof TapGestureDetector.Canceled)) {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                        pointerInputChange4 = finalUpChange;
                                                                        job4 = job2;
                                                                        finalUpChange2 = null;
                                                                    }
                                                                    if (finalUpChange2 != null) {
                                                                    }
                                                                } else {
                                                                    this.$onLongPress.invoke(Offset.m6534boximpl(pointerInputChange3.getPosition()));
                                                                    this.L$0 = job2;
                                                                    this.L$1 = null;
                                                                    this.L$2 = null;
                                                                    this.L$3 = null;
                                                                    this.label = 8;
                                                                    if (TapGestureDetector4.consumeUntilUp(awaitPointerEventScope3, this) != coroutine_suspended) {
                                                                        job5 = job2;
                                                                        TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, job5, null, new TapGestureDetector8(this.$pressScope, null), 2, null);
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objAwaitFirstDown$default = obj;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerInputChange = (PointerInputChange) objAwaitFirstDown$default;
                        pointerInputChange.consume();
                        Job jobLaunch$default3 = BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, TapGestureDetector4.getCoroutineStartForCurrentDispatchBehavior(), new TapGestureDetector7(this.$pressScope, null), 1, null);
                        if (this.$onPress != TapGestureDetector4.NoPressGesture) {
                        }
                        job = jobLaunch$default3;
                        if (this.$onLongPress != null) {
                        }
                        return coroutine_suspended;
                    case 2:
                        job = (Job) this.L$1;
                        AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope2 = awaitPointerEventScope5;
                        objWaitForUpOrCancellation$default = obj;
                        finalUpChange = (PointerInputChange) objWaitForUpOrCancellation$default;
                        Job job62 = job;
                        if (finalUpChange != null) {
                        }
                        if (finalUpChange != null) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        job = (Job) this.L$2;
                        pointerInputChange = (PointerInputChange) this.L$1;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objWaitForLongPress$default = obj;
                        tapGestureDetector = (TapGestureDetector) objWaitForLongPress$default;
                        if (!Intrinsics.areEqual(tapGestureDetector, TapGestureDetector.Success.INSTANCE)) {
                        }
                        break;
                    case 4:
                        job = (Job) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, job, null, new AnonymousClass2(this.$pressScope, null), 2, null);
                        return Unit.INSTANCE;
                    case 5:
                        jobLaunchAwaitingReset$default = (Job) this.L$2;
                        finalUpChange = (PointerInputChange) this.L$1;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objAwaitSecondDown = obj;
                        pointerInputChange2 = (PointerInputChange) objAwaitSecondDown;
                        if (pointerInputChange2 != null) {
                        }
                        break;
                    case 6:
                        pointerInputChange4 = (PointerInputChange) this.L$1;
                        job3 = (Job) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objWaitForUpOrCancellation$default2 = obj;
                        finalUpChange2 = (PointerInputChange) objWaitForUpOrCancellation$default2;
                        job4 = job3;
                        if (finalUpChange2 != null) {
                        }
                        return Unit.INSTANCE;
                    case 7:
                        pointerInputChange3 = (PointerInputChange) this.L$3;
                        finalUpChange = (PointerInputChange) this.L$2;
                        job2 = (Job) this.L$1;
                        awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objWaitForLongPress$default2 = obj;
                        tapGestureDetector2 = (TapGestureDetector) objWaitForLongPress$default2;
                        if (Intrinsics.areEqual(tapGestureDetector2, TapGestureDetector.Success.INSTANCE)) {
                        }
                        break;
                    case 8:
                        Job job7 = (Job) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        job5 = job7;
                        TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, job5, null, new TapGestureDetector8(this.$pressScope, null), 2, null);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", m3645f = "TapGestureDetector.kt", m3646l = {110}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C494601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> $onPress;
                final /* synthetic */ TapGestureDetector3 $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C494601(Function3<? super TapGestureDetector2, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, TapGestureDetector3 tapGestureDetector3, PointerInputChange pointerInputChange, Continuation<? super C494601> continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = tapGestureDetector3;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C494601(this.$onPress, this.$pressScope, this.$down, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C494601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> function3 = this.$onPress;
                        TapGestureDetector3 tapGestureDetector3 = this.$pressScope;
                        Offset offsetM6534boximpl = Offset.m6534boximpl(this.$down.getPosition());
                        this.label = 1;
                        if (function3.invoke(tapGestureDetector3, offsetM6534boximpl, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", m3645f = "TapGestureDetector.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ TapGestureDetector3 $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(TapGestureDetector3 tapGestureDetector3, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$pressScope = tapGestureDetector3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$pressScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$pressScope.release();
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", m3645f = "TapGestureDetector.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ TapGestureDetector3 $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(TapGestureDetector3 tapGestureDetector3, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$pressScope = tapGestureDetector3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.$pressScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$pressScope.cancel();
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", m3645f = "TapGestureDetector.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ TapGestureDetector3 $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(TapGestureDetector3 tapGestureDetector3, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.$pressScope = tapGestureDetector3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(this.$pressScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$pressScope.release();
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", m3645f = "TapGestureDetector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
            static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Job $cancelOrReleaseJob;
                final /* synthetic */ TapGestureDetector3 $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(Job job, TapGestureDetector3 tapGestureDetector3, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.$cancelOrReleaseJob = job;
                    this.$pressScope = tapGestureDetector3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$cancelOrReleaseJob, this.$pressScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
                
                    if (r5.reset(r4) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Job job = this.$cancelOrReleaseJob;
                        this.label = 1;
                        if (job.join(this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    TapGestureDetector3 tapGestureDetector3 = this.$pressScope;
                    this.label = 2;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", m3645f = "TapGestureDetector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
            static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> $onPress;
                final /* synthetic */ TapGestureDetector3 $pressScope;
                final /* synthetic */ PointerInputChange $secondDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass6(Function3<? super TapGestureDetector2, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, TapGestureDetector3 tapGestureDetector3, PointerInputChange pointerInputChange, Continuation<? super AnonymousClass6> continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = tapGestureDetector3;
                    this.$secondDown = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass6(this.$onPress, this.$pressScope, this.$secondDown, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> function3 = this.$onPress;
                        TapGestureDetector3 tapGestureDetector3 = this.$pressScope;
                        Offset offsetM6534boximpl = Offset.m6534boximpl(this.$secondDown.getPosition());
                        this.label = 1;
                        if (function3.invoke(tapGestureDetector3, offsetM6534boximpl, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", m3645f = "TapGestureDetector.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
            static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ TapGestureDetector3 $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass7(TapGestureDetector3 tapGestureDetector3, Continuation<? super AnonymousClass7> continuation) {
                    super(2, continuation);
                    this.$pressScope = tapGestureDetector3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass7(this.$pressScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$pressScope.release();
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", m3645f = "TapGestureDetector.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
            static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ TapGestureDetector3 $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass8(TapGestureDetector3 tapGestureDetector3, Continuation<? super AnonymousClass8> continuation) {
                    super(2, continuation);
                    this.$pressScope = tapGestureDetector3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass8(this.$pressScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$pressScope.cancel();
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static final Object detectTapGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function3<? super TapGestureDetector2, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function13, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C11442(pointerInputScope, function3, function12, function1, function13, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[LOOP:0: B:19:0x0053->B:20:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object consumeUntilUp(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        C11421 c11421;
        int size;
        int i;
        int i2;
        int size2;
        if (continuation instanceof C11421) {
            c11421 = (C11421) continuation;
            int i3 = c11421.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c11421.label = i3 - Integer.MIN_VALUE;
            } else {
                c11421 = new C11421(continuation);
            }
        }
        Object objAwaitPointerEvent$default = c11421.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c11421.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objAwaitPointerEvent$default);
            c11421.L$0 = awaitPointerEventScope;
            c11421.label = 1;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, c11421, 1, null);
            if (objAwaitPointerEvent$default == coroutine_suspended) {
            }
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i = 0;
            while (i2 < size) {
            }
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            size2 = changes2.size();
            while (i < size2) {
            }
            return Unit.INSTANCE;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        awaitPointerEventScope = (AwaitPointerEventScope) c11421.L$0;
        ResultKt.throwOnFailure(objAwaitPointerEvent$default);
        PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent$default;
        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
        size = changes3.size();
        i = 0;
        for (i2 = 0; i2 < size; i2++) {
            changes3.get(i2).consume();
        }
        List<PointerInputChange> changes22 = pointerEvent2.getChanges();
        size2 = changes22.size();
        while (i < size2) {
            if (changes22.get(i).getPressed()) {
                c11421.L$0 = awaitPointerEventScope;
                c11421.label = 1;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, c11421, 1, null);
                if (objAwaitPointerEvent$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PointerEvent pointerEvent22 = (PointerEvent) objAwaitPointerEvent$default;
                List<PointerInputChange> changes32 = pointerEvent22.getChanges();
                size = changes32.size();
                i = 0;
                while (i2 < size) {
                }
                List<PointerInputChange> changes222 = pointerEvent22.getChanges();
                size2 = changes222.size();
                while (i < size2) {
                }
            } else {
                i++;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", m3645f = "TapGestureDetector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2 */
    static final class C11412 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
        final /* synthetic */ PointerInputChange $firstUp;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11412(PointerInputChange pointerInputChange, Continuation<? super C11412> continuation) {
            super(2, continuation);
            this.$firstUp = pointerInputChange;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11412 c11412 = new C11412(this.$firstUp, continuation);
            c11412.L$0 = obj;
            return c11412;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
            return ((C11412) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:12:0x0047). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                long r3 = r11.J$0
                java.lang.Object r1 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r12)
                r5 = r1
                goto L47
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r12
                androidx.compose.ui.input.pointer.PointerInputChange r1 = r11.$firstUp
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.ViewConfiguration r1 = r12.getViewConfiguration()
                long r5 = r1.getDoubleTapMinTimeMillis()
                long r3 = r3 + r5
                r5 = r12
            L35:
                r11.L$0 = r5
                r11.J$0 = r3
                r11.label = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r8 = r11
                java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetector4.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L47
                return r0
            L47:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r12
                long r6 = r12.getUptimeMillis()
                int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r1 < 0) goto L35
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetector4.C11412.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, Continuation<? super PointerInputChange> continuation) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new C11412(pointerInputChange, null), continuation);
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", m3645f = "TapGestureDetector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2 */
    static final class C11432 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> $onPress;
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        final /* synthetic */ TapGestureDetector3 $pressScope;
        final /* synthetic */ PointerInputScope $this_detectTapAndPress;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11432(PointerInputScope pointerInputScope, Function3<? super TapGestureDetector2, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, TapGestureDetector3 tapGestureDetector3, Continuation<? super C11432> continuation) {
            super(2, continuation);
            this.$this_detectTapAndPress = pointerInputScope;
            this.$onPress = function3;
            this.$onTap = function1;
            this.$pressScope = tapGestureDetector3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11432 c11432 = new C11432(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, continuation);
            c11432.L$0 = obj;
            return c11432;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TapGestureDetector.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", m3645f = "TapGestureDetector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> $onPress;
            final /* synthetic */ Function1<Offset, Unit> $onTap;
            final /* synthetic */ TapGestureDetector3 $pressScope;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineScope coroutineScope, Function3<? super TapGestureDetector2, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, TapGestureDetector3 tapGestureDetector3, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.$onPress = function3;
                this.$onTap = function1;
                this.$pressScope = tapGestureDetector3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
            
                if (r0 == r6) goto L19;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                Object objAwaitFirstDown$default;
                Job job;
                Object objWaitForUpOrCancellation$default;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, TapGestureDetector4.getCoroutineStartForCurrentDispatchBehavior(), new TapGestureDetector6(this.$pressScope, null), 1, null);
                    this.L$0 = awaitPointerEventScope;
                    this.L$1 = jobLaunch$default;
                    this.label = 1;
                    objAwaitFirstDown$default = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 3, null);
                    if (objAwaitFirstDown$default != coroutine_suspended) {
                        job = jobLaunch$default;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Job job2 = (Job) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    job = job2;
                    objWaitForUpOrCancellation$default = obj;
                    PointerInputChange pointerInputChange = (PointerInputChange) objWaitForUpOrCancellation$default;
                    if (pointerInputChange == null) {
                        TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, job, null, new AnonymousClass2(this.$pressScope, null), 2, null);
                    } else {
                        pointerInputChange.consume();
                        TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, job, null, new AnonymousClass3(this.$pressScope, null), 2, null);
                        Function1<Offset, Unit> function1 = this.$onTap;
                        if (function1 != null) {
                            function1.invoke(Offset.m6534boximpl(pointerInputChange.getPosition()));
                        }
                    }
                    return Unit.INSTANCE;
                }
                Job job3 = (Job) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                job = job3;
                awaitPointerEventScope = awaitPointerEventScope2;
                objAwaitFirstDown$default = obj;
                PointerInputChange pointerInputChange2 = (PointerInputChange) objAwaitFirstDown$default;
                pointerInputChange2.consume();
                if (this.$onPress != TapGestureDetector4.NoPressGesture) {
                    TapGestureDetector4.launchAwaitingReset$default(this.$$this$coroutineScope, job, null, new C494591(this.$onPress, this.$pressScope, pointerInputChange2, null), 2, null);
                }
                this.L$0 = job;
                this.L$1 = null;
                this.label = 2;
                objWaitForUpOrCancellation$default = TapGestureDetector4.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", m3645f = "TapGestureDetector.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C494591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> $onPress;
                final /* synthetic */ TapGestureDetector3 $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C494591(Function3<? super TapGestureDetector2, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, TapGestureDetector3 tapGestureDetector3, PointerInputChange pointerInputChange, Continuation<? super C494591> continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = tapGestureDetector3;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C494591(this.$onPress, this.$pressScope, this.$down, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C494591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> function3 = this.$onPress;
                        TapGestureDetector3 tapGestureDetector3 = this.$pressScope;
                        Offset offsetM6534boximpl = Offset.m6534boximpl(this.$down.getPosition());
                        this.label = 1;
                        if (function3.invoke(tapGestureDetector3, offsetM6534boximpl, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", m3645f = "TapGestureDetector.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ TapGestureDetector3 $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(TapGestureDetector3 tapGestureDetector3, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$pressScope = tapGestureDetector3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$pressScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$pressScope.cancel();
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", m3645f = "TapGestureDetector.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ TapGestureDetector3 $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(TapGestureDetector3 tapGestureDetector3, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$pressScope = tapGestureDetector3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.$pressScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$pressScope.release();
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.$onPress, this.$onTap, this.$pressScope, null);
                this.label = 1;
                if (ForEachGesture.awaitEachGesture(pointerInputScope, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object detectTapAndPress(PointerInputScope pointerInputScope, Function3<? super TapGestureDetector2, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C11432(pointerInputScope, function3, function1, new TapGestureDetector3(pointerInputScope), null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFirstDown(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r7, boolean r8, androidx.compose.p011ui.input.pointer.PointerEventPass r9, kotlin.coroutines.Continuation<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.TapGestureDetector4.C11402
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetector4.C11402) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.p011ui.input.pointer.PointerEventPass) r8
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.ResultKt.throwOnFailure(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L51
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.ResultKt.throwOnFailure(r10)
        L42:
            r0.L$0 = r7
            r0.L$1 = r9
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r10 = r7.awaitPointerEvent(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p011ui.input.pointer.PointerEvent) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = isChangedToDown$default(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L42
            java.util.List r7 = r10.getChanges()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetector4.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z, pointerEventPass, continuation);
    }

    static /* synthetic */ boolean isChangedToDown$default(PointerEvent pointerEvent, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = TapGestureDetector_androidKt.firstDownRefersToPrimaryMouseButtonOnly();
        }
        return isChangedToDown(pointerEvent, z, z2);
    }

    private static final boolean isChangedToDown(PointerEvent pointerEvent, boolean z, boolean z2) {
        if (z2) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!PointerType.m7203equalsimpl0(changes.get(i).getType(), PointerType.INSTANCE.m7207getMouseT8wyACA())) {
                        break;
                    }
                    i++;
                } else if (!PointerEvent_androidKt.m7165isPrimaryPressedaHzCxE(pointerEvent.getButtons())) {
                    return false;
                }
            }
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            PointerInputChange pointerInputChange = changes2.get(i2);
            if (!(z ? PointerEventKt.changedToDown(pointerInputChange) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c6 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitForUpOrCancellation(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation<? super PointerInputChange> continuation) {
        C11482 c11482;
        AwaitPointerEventScope awaitPointerEventScope2;
        C11482 c114822;
        PointerEventPass pointerEventPass2;
        AwaitPointerEventScope awaitPointerEventScope3;
        PointerEventPass pointerEventPass3;
        int size;
        int i;
        Object objAwaitPointerEvent;
        if (continuation instanceof C11482) {
            c11482 = (C11482) continuation;
            int i2 = c11482.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c11482.label = i2 - Integer.MIN_VALUE;
            } else {
                c11482 = new C11482(continuation);
            }
        }
        Object objAwaitPointerEvent2 = c11482.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c11482.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwaitPointerEvent2);
            awaitPointerEventScope2 = awaitPointerEventScope;
            c114822 = c11482;
            pointerEventPass2 = pointerEventPass;
            c114822.L$0 = awaitPointerEventScope2;
            c114822.L$1 = pointerEventPass2;
            c114822.label = 1;
            objAwaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, c114822);
            if (objAwaitPointerEvent != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            pointerEventPass3 = (PointerEventPass) c11482.L$1;
            awaitPointerEventScope3 = (AwaitPointerEventScope) c11482.L$0;
            ResultKt.throwOnFailure(objAwaitPointerEvent2);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent2;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            while (i < size) {
            }
            return pointerEvent.getChanges().get(0);
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pointerEventPass3 = (PointerEventPass) c11482.L$1;
        awaitPointerEventScope3 = (AwaitPointerEventScope) c11482.L$0;
        ResultKt.throwOnFailure(objAwaitPointerEvent2);
        PointerEventPass pointerEventPass4 = pointerEventPass3;
        c114822 = c11482;
        pointerEventPass2 = pointerEventPass4;
        List<PointerInputChange> changes2 = ((PointerEvent) objAwaitPointerEvent2).getChanges();
        int size2 = changes2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (changes2.get(i4).isConsumed()) {
                return null;
            }
        }
        awaitPointerEventScope2 = awaitPointerEventScope3;
        c114822.L$0 = awaitPointerEventScope2;
        c114822.L$1 = pointerEventPass2;
        c114822.label = 1;
        objAwaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, c114822);
        if (objAwaitPointerEvent != coroutine_suspended) {
            awaitPointerEventScope3 = awaitPointerEventScope2;
            objAwaitPointerEvent2 = objAwaitPointerEvent;
            C11482 c114823 = c114822;
            pointerEventPass3 = pointerEventPass2;
            c11482 = c114823;
            PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent2;
            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
            size = changes3.size();
            for (i = 0; i < size; i++) {
                if (!PointerEventKt.changedToUp(changes3.get(i))) {
                    List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                    int size3 = changes4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        PointerInputChange pointerInputChange = changes4.get(i5);
                        if (pointerInputChange.isConsumed() || PointerEventKt.m7154isOutOfBoundsjwHxaWs(pointerInputChange, awaitPointerEventScope3.mo7138getSizeYbymL2g(), awaitPointerEventScope3.mo7137getExtendedTouchPaddingNHjbRc())) {
                            break;
                        }
                    }
                    PointerEventPass pointerEventPass5 = PointerEventPass.Final;
                    c11482.L$0 = awaitPointerEventScope3;
                    c11482.L$1 = pointerEventPass3;
                    c11482.label = 2;
                    objAwaitPointerEvent2 = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass5, c11482);
                }
            }
            return pointerEvent2.getChanges().get(0);
        }
        return coroutine_suspended;
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitForLongPress(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation<? super TapGestureDetector> continuation) {
        C11461 c11461;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C11461) {
            c11461 = (C11461) continuation;
            int i = c11461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11461.label = i - Integer.MIN_VALUE;
            } else {
                c11461 = new C11461(continuation);
            }
        }
        Object obj = c11461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11461.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = TapGestureDetector.Canceled.INSTANCE;
                long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                C11472 c11472 = new C11472(pointerEventPass, objectRef2, null);
                c11461.L$0 = objectRef2;
                c11461.label = 1;
                if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, c11472, c11461) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) c11461.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return objectRef.element;
        } catch (PointerEventTimeoutCancellationException unused) {
            return TapGestureDetector.Success.INSTANCE;
        }
    }

    public static /* synthetic */ Object waitForLongPress$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForLongPress(awaitPointerEventScope, pointerEventPass, continuation);
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", m3645f = "TapGestureDetector.kt", m3646l = {386, 409}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 */
    static final class C11472 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerEventPass $pass;
        final /* synthetic */ Ref.ObjectRef<TapGestureDetector> $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11472(PointerEventPass pointerEventPass, Ref.ObjectRef<TapGestureDetector> objectRef, Continuation<? super C11472> continuation) {
            super(2, continuation);
            this.$pass = pointerEventPass;
            this.$result = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11472 c11472 = new C11472(this.$pass, this.$result, continuation);
            c11472.L$0 = obj;
            return c11472;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C11472) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(r14) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            r13.$result.element = androidx.compose.foundation.gestures.TapGestureDetector.Success.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        
            r14 = r14.getChanges();
            r5 = r14.size();
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        
            if (r6 >= r5) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        
            r7 = r14.get(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        
            if (r7.isConsumed() != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        
            if (androidx.compose.p011ui.input.pointer.PointerEventKt.m7154isOutOfBoundsjwHxaWs(r7, r1.mo7138getSizeYbymL2g(), r1.mo7137getExtendedTouchPaddingNHjbRc()) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
        
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
        
            r13.$result.element = androidx.compose.foundation.gestures.TapGestureDetector.Canceled.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        
            r14 = androidx.compose.p011ui.input.pointer.PointerEventPass.Final;
            r13.L$0 = r1;
            r13.label = 2;
            r14 = r1.awaitPointerEvent(r14, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        
            if (r14 != r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
        
            r13.$result.element = androidx.compose.foundation.gestures.TapGestureDetector.Canceled.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d7 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v2, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
        /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.compose.foundation.gestures.LongPressResult$Success] */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.foundation.gestures.LongPressResult$Released] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a7 -> B:34:0x00aa). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            int size;
            int i;
            Object objAwaitPointerEvent;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                PointerEventPass pointerEventPass = this.$pass;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, this);
                if (objAwaitPointerEvent != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                i = 0;
                while (true) {
                    if (i < size) {
                    }
                    i++;
                }
                return coroutine_suspended;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            List<PointerInputChange> changes2 = ((PointerEvent) obj).getChanges();
            int size2 = changes2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (changes2.get(i3).isConsumed()) {
                    break;
                }
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            PointerEventPass pointerEventPass2 = this.$pass;
            this.L$0 = awaitPointerEventScope;
            this.label = 1;
            objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
            if (objAwaitPointerEvent != coroutine_suspended) {
                awaitPointerEventScope2 = awaitPointerEventScope;
                obj = objAwaitPointerEvent;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                size = changes3.size();
                i = 0;
                while (true) {
                    if (i < size) {
                        if (!PointerEventKt.changedToUp(changes3.get(i))) {
                            break;
                        }
                        i++;
                    } else {
                        this.$result.element = new TapGestureDetector.Released(pointerEvent2.getChanges().get(0));
                        break;
                    }
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineStart getCoroutineStartForCurrentDispatchBehavior() {
        if (ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled) {
            return CoroutineStart.UNDISPATCHED;
        }
        return CoroutineStart.DEFAULT;
    }

    static /* synthetic */ Job launchAwaitingReset$default(CoroutineScope coroutineScope, Job job, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineStart = getCoroutineStartForCurrentDispatchBehavior();
        }
        return launchAwaitingReset(coroutineScope, job, coroutineStart, function2);
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", m3645f = "TapGestureDetector.kt", m3646l = {HttpStatusCode.BAD_GATEWAY_502, 504}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1 */
    static final class C11451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Job $resetJob;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11451(Job job, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C11451> continuation) {
            super(2, continuation);
            this.$resetJob = job;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11451 c11451 = new C11451(this.$resetJob, this.$block, continuation);
            c11451.L$0 = obj;
            return c11451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled) {
                    Job job = this.$resetJob;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (job.join(this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
            this.L$0 = null;
            this.label = 2;
        }
    }

    private static final Job launchAwaitingReset(CoroutineScope coroutineScope, Job job, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new C11451(job, function2, null), 1, null);
    }
}
