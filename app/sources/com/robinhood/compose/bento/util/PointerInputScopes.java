package com.robinhood.compose.bento.util;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.util.PointerInputScopes;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: PointerInputScopes.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086@¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086@¢\u0006\u0002\u0010\u0006\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\nH\u0082@¢\u0006\u0002\u0010\u000b\u001aQ\u0010\f\u001a\u00020\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u0004H\u0086@¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"detectTap", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onTap", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapUnconsumed", "waitForUpOrCancellationInitial", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectVerticalDragUnconsumed", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDrag", "", "Lkotlin/ParameterName;", "name", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.util.PointerInputScopesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class PointerInputScopes {

    /* compiled from: PointerInputScopes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.compose.bento.util.PointerInputScopesKt", m3645f = "PointerInputScopes.kt", m3646l = {82, 94}, m3647m = "waitForUpOrCancellationInitial")
    /* renamed from: com.robinhood.compose.bento.util.PointerInputScopesKt$waitForUpOrCancellationInitial$1 */
    static final class C326641 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C326641(Continuation<? super C326641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PointerInputScopes.waitForUpOrCancellationInitial(null, this);
        }
    }

    /* compiled from: PointerInputScopes.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.compose.bento.util.PointerInputScopesKt$detectTap$2", m3645f = "PointerInputScopes.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.compose.bento.util.PointerInputScopesKt$detectTap$2 */
    static final class C326612 extends ContinuationImpl7 implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        final /* synthetic */ PointerInputScopes2 $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C326612(PointerInputScopes2 pointerInputScopes2, Function1<? super Offset, Unit> function1, Continuation<? super C326612> continuation) {
            super(2, continuation);
            this.$pressScope = pointerInputScopes2;
            this.$onTap = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C326612 c326612 = new C326612(this.$pressScope, this.$onTap, continuation);
            c326612.L$0 = obj;
            return c326612;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C326612) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PointerInputScopes.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.compose.bento.util.PointerInputScopesKt$detectTap$2$1", m3645f = "PointerInputScopes.kt", m3646l = {36}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.compose.bento.util.PointerInputScopesKt$detectTap$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$forEachGesture;
            final /* synthetic */ Function1<Offset, Unit> $onTap;
            final /* synthetic */ PointerInputScopes2 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(PointerInputScopes2 pointerInputScopes2, PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$pressScope = pointerInputScopes2;
                this.$$this$forEachGesture = pointerInputScope;
                this.$onTap = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$pressScope, this.$$this$forEachGesture, this.$onTap, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$pressScope.reset();
                    PointerInputScope pointerInputScope = this.$$this$forEachGesture;
                    C506531 c506531 = new C506531(this.$pressScope, this.$onTap, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c506531, this) == coroutine_suspended) {
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

            /* compiled from: PointerInputScopes.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.compose.bento.util.PointerInputScopesKt$detectTap$2$1$1", m3645f = "PointerInputScopes.kt", m3646l = {37, 39}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.compose.bento.util.PointerInputScopesKt$detectTap$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506531 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1<Offset, Unit> $onTap;
                final /* synthetic */ PointerInputScopes2 $pressScope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C506531(PointerInputScopes2 pointerInputScopes2, Function1<? super Offset, Unit> function1, Continuation<? super C506531> continuation) {
                    super(2, continuation);
                    this.$pressScope = pointerInputScopes2;
                    this.$onTap = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506531 c506531 = new C506531(this.$pressScope, this.$onTap, continuation);
                    c506531.L$0 = obj;
                    return c506531;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((C506531) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
                
                    if (r11 == r0) goto L19;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    C506531 c506531;
                    AwaitPointerEventScope awaitPointerEventScope;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope2;
                        this.label = 1;
                        c506531 = this;
                        obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, null, c506531, 2, null);
                        if (obj != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        c506531 = this;
                        PointerInputChange pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            c506531.$pressScope.cancel();
                        } else {
                            c506531.$pressScope.release();
                            c506531.$onTap.invoke(Offset.m6534boximpl(pointerInputChange.getPosition()));
                        }
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c506531 = this;
                    PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2.getPressed() != pointerInputChange2.getPreviousPressed()) {
                        pointerInputChange2.consume();
                    }
                    c506531.L$0 = null;
                    c506531.label = 2;
                    obj = PointerInputScopes.waitForUpOrCancellationInitial(awaitPointerEventScope, this);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pressScope, (PointerInputScope) this.L$0, this.$onTap, null);
                this.label = 1;
                if (CoroutineScope2.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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

    public static final Object detectTap(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object objForEachGesture = ForEachGesture.forEachGesture(pointerInputScope, new C326612(new PointerInputScopes2(pointerInputScope), function1, null), continuation);
        return objForEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objForEachGesture : Unit.INSTANCE;
    }

    /* compiled from: PointerInputScopes.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.compose.bento.util.PointerInputScopesKt$detectTapUnconsumed$2", m3645f = "PointerInputScopes.kt", m3646l = {62}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.compose.bento.util.PointerInputScopesKt$detectTapUnconsumed$2 */
    static final class C326622 extends ContinuationImpl7 implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        final /* synthetic */ PointerInputScopes2 $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C326622(PointerInputScopes2 pointerInputScopes2, Function1<? super Offset, Unit> function1, Continuation<? super C326622> continuation) {
            super(2, continuation);
            this.$pressScope = pointerInputScopes2;
            this.$onTap = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C326622 c326622 = new C326622(this.$pressScope, this.$onTap, continuation);
            c326622.L$0 = obj;
            return c326622;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C326622) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PointerInputScopes.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.compose.bento.util.PointerInputScopesKt$detectTapUnconsumed$2$1", m3645f = "PointerInputScopes.kt", m3646l = {64}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.compose.bento.util.PointerInputScopesKt$detectTapUnconsumed$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$forEachGesture;
            final /* synthetic */ Function1<Offset, Unit> $onTap;
            final /* synthetic */ PointerInputScopes2 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(PointerInputScopes2 pointerInputScopes2, PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$pressScope = pointerInputScopes2;
                this.$$this$forEachGesture = pointerInputScope;
                this.$onTap = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$pressScope, this.$$this$forEachGesture, this.$onTap, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$pressScope.reset();
                    PointerInputScope pointerInputScope = this.$$this$forEachGesture;
                    C506541 c506541 = new C506541(this.$pressScope, this.$onTap, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c506541, this) == coroutine_suspended) {
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

            /* compiled from: PointerInputScopes.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.compose.bento.util.PointerInputScopesKt$detectTapUnconsumed$2$1$1", m3645f = "PointerInputScopes.kt", m3646l = {66, EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.compose.bento.util.PointerInputScopesKt$detectTapUnconsumed$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506541 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1<Offset, Unit> $onTap;
                final /* synthetic */ PointerInputScopes2 $pressScope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C506541(PointerInputScopes2 pointerInputScopes2, Function1<? super Offset, Unit> function1, Continuation<? super C506541> continuation) {
                    super(2, continuation);
                    this.$pressScope = pointerInputScopes2;
                    this.$onTap = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506541 c506541 = new C506541(this.$pressScope, this.$onTap, continuation);
                    c506541.L$0 = obj;
                    return c506541;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((C506541) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
                
                    if (r11 == r0) goto L16;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    C506541 c506541;
                    AwaitPointerEventScope awaitPointerEventScope;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope2;
                        this.label = 1;
                        c506541 = this;
                        if (TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, null, c506541, 2, null) != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        c506541 = this;
                        PointerInputChange pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            c506541.$pressScope.cancel();
                        } else {
                            c506541.$pressScope.release();
                            c506541.$onTap.invoke(Offset.m6534boximpl(pointerInputChange.getPosition()));
                        }
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c506541 = this;
                    c506541.L$0 = null;
                    c506541.label = 2;
                    obj = PointerInputScopes.waitForUpOrCancellationInitial(awaitPointerEventScope, this);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pressScope, (PointerInputScope) this.L$0, this.$onTap, null);
                this.label = 1;
                if (CoroutineScope2.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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

    public static final Object detectTapUnconsumed(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object objForEachGesture = ForEachGesture.forEachGesture(pointerInputScope, new C326622(new PointerInputScopes2(pointerInputScope), function1, null), continuation);
        return objForEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objForEachGesture : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[PHI: r13 r14
      0x0053: PHI (r13v1 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
      (r13v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
      (r13v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
     binds: [B:18:0x0050, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r14v2 java.lang.Object) = (r14v8 java.lang.Object), (r14v1 java.lang.Object) binds: [B:18:0x0050, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:36:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitForUpOrCancellationInitial(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
        C326641 c326641;
        int size;
        int i;
        if (continuation instanceof C326641) {
            c326641 = (C326641) continuation;
            int i2 = c326641.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c326641.label = i2 - Integer.MIN_VALUE;
            } else {
                c326641 = new C326641(continuation);
            }
        }
        Object objAwaitPointerEvent = c326641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c326641.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwaitPointerEvent);
            PointerEventPass pointerEventPass = PointerEventPass.Initial;
            c326641.L$0 = awaitPointerEventScope;
            c326641.label = 1;
            objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, c326641);
            if (objAwaitPointerEvent != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            awaitPointerEventScope = (AwaitPointerEventScope) c326641.L$0;
            ResultKt.throwOnFailure(objAwaitPointerEvent);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            while (i < size) {
            }
            return pointerEvent.getChanges().get(0);
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        awaitPointerEventScope = (AwaitPointerEventScope) c326641.L$0;
        ResultKt.throwOnFailure(objAwaitPointerEvent);
        List<PointerInputChange> changes2 = ((PointerEvent) objAwaitPointerEvent).getChanges();
        int size2 = changes2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (changes2.get(i4).isConsumed()) {
                return null;
            }
        }
        PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
        c326641.L$0 = awaitPointerEventScope;
        c326641.label = 1;
        objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, c326641);
        if (objAwaitPointerEvent != coroutine_suspended) {
            PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent;
            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
            size = changes3.size();
            for (i = 0; i < size; i++) {
                if (!PointerEventKt.changedToUp(changes3.get(i))) {
                    List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                    int size3 = changes4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        PointerInputChange pointerInputChange = changes4.get(i5);
                        if (pointerInputChange.isConsumed() || PointerEventKt.m7154isOutOfBoundsjwHxaWs(pointerInputChange, awaitPointerEventScope.mo7138getSizeYbymL2g(), awaitPointerEventScope.mo7137getExtendedTouchPaddingNHjbRc())) {
                            break;
                        }
                    }
                    PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                    c326641.L$0 = awaitPointerEventScope;
                    c326641.label = 2;
                    objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass3, c326641);
                }
            }
            return pointerEvent2.getChanges().get(0);
        }
        return coroutine_suspended;
    }

    /* compiled from: PointerInputScopes.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.compose.bento.util.PointerInputScopesKt$detectVerticalDragUnconsumed$2", m3645f = "PointerInputScopes.kt", m3646l = {111, 114, 119}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.bento.util.PointerInputScopesKt$detectVerticalDragUnconsumed$2 */
    static final class C326632 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Float, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function0<Unit> $onDragStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C326632(Function0<Unit> function0, Function1<? super Float, Unit> function1, Function0<Unit> function02, Continuation<? super C326632> continuation) {
            super(2, continuation);
            this.$onDragStart = function0;
            this.$onDrag = function1;
            this.$onDragEnd = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C326632 c326632 = new C326632(this.$onDragStart, this.$onDrag, this.$onDragEnd, continuation);
            c326632.L$0 = obj;
            return c326632;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C326632) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
        
            if (r12 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            if (r12 == r0) goto L25;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0081 -> B:26:0x0084). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C326632 c326632;
            AwaitPointerEventScope awaitPointerEventScope;
            PointerInputChange pointerInputChange;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope2;
                this.label = 1;
                c326632 = this;
                obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, null, c326632, 2, null);
                if (obj != coroutine_suspended) {
                    awaitPointerEventScope = awaitPointerEventScope2;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                c326632 = this;
            } else {
                if (i == 2) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c326632 = this;
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                    }
                    c326632.$onDragEnd.invoke();
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                c326632 = this;
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null && pointerInputChange.getPressed()) {
                    c326632.$onDrag.invoke(boxing.boxFloat(Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) & 4294967295L))));
                }
                if (pointerInputChange != null || !pointerInputChange.getPressed()) {
                    c326632.$onDragEnd.invoke();
                    return Unit.INSTANCE;
                }
                long id = pointerInputChange.getId();
                c326632.L$0 = awaitPointerEventScope;
                c326632.label = 3;
                obj = DragGestureDetectorKt.m4977awaitVerticalDragOrCancellationrnUCldI(awaitPointerEventScope, id, this);
            }
            c326632.$onDragStart.invoke();
            long id2 = ((PointerInputChange) obj).getId();
            final Function1<Float, Unit> function1 = c326632.$onDrag;
            Function2 function2 = new Function2() { // from class: com.robinhood.compose.bento.util.PointerInputScopesKt$detectVerticalDragUnconsumed$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PointerInputScopes.C326632.invokeSuspend$lambda$0(function1, (PointerInputChange) obj2, ((Float) obj3).floatValue());
                }
            };
            c326632.L$0 = awaitPointerEventScope;
            c326632.label = 2;
            obj = DragGestureDetectorKt.m4978awaitVerticalTouchSlopOrCancellationjO51t88(awaitPointerEventScope, id2, function2, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Function1 function1, PointerInputChange pointerInputChange, float f) {
            function1.invoke(Float.valueOf(f));
            return Unit.INSTANCE;
        }
    }

    public static final Object detectVerticalDragUnconsumed(PointerInputScope pointerInputScope, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Float, Unit> function1, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C326632(function0, function1, function02, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }
}
