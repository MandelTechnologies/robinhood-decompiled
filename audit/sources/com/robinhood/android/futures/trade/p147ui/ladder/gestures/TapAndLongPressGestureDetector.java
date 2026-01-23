package com.robinhood.android.futures.trade.p147ui.ladder.gestures;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.TapGestureDetector2;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.TapAndLongPressGestureDetector;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TapAndLongPressGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¨\u0006\u000b"}, m3636d2 = {"tapAndLongPressGestureDetector", "Landroidx/compose/ui/Modifier;", "indication", "Landroidx/compose/foundation/Indication;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onTap", "Lkotlin/Function0;", "", "onLongPress", "onLongPressRelease", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.gestures.TapAndLongPressGestureDetectorKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class TapAndLongPressGestureDetector {
    public static final Modifier tapAndLongPressGestureDetector(Modifier modifier, Indication indication, InteractionSource3 interactionSource, Function0<Unit> onTap, Function0<Unit> onLongPress, Function0<Unit> onLongPressRelease) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Intrinsics.checkNotNullParameter(onLongPress, "onLongPress");
        Intrinsics.checkNotNullParameter(onLongPressRelease, "onLongPressRelease");
        return SuspendingPointerInputFilterKt.pointerInput(IndicationKt.indication(modifier, interactionSource, indication), Unit.INSTANCE, new C175921(onLongPress, interactionSource, onLongPressRelease, onTap));
    }

    /* compiled from: TapAndLongPressGestureDetector.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.gestures.TapAndLongPressGestureDetectorKt$tapAndLongPressGestureDetector$1 */
    static final class C175921 implements PointerInputEventHandler {
        final /* synthetic */ InteractionSource3 $interactionSource;
        final /* synthetic */ Function0<Unit> $onLongPress;
        final /* synthetic */ Function0<Unit> $onLongPressRelease;
        final /* synthetic */ Function0<Unit> $onTap;

        C175921(Function0<Unit> function0, InteractionSource3 interactionSource3, Function0<Unit> function02, Function0<Unit> function03) {
            this.$onLongPress = function0;
            this.$interactionSource = interactionSource3;
            this.$onLongPressRelease = function02;
            this.$onTap = function03;
        }

        @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            final Function0<Unit> function0 = this.$onLongPress;
            Function1 function1 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.gestures.TapAndLongPressGestureDetectorKt$tapAndLongPressGestureDetector$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TapAndLongPressGestureDetector.C175921.invoke$lambda$0(function0, (Offset) obj);
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$interactionSource, this.$onLongPressRelease, null);
            final Function0<Unit> function02 = this.$onTap;
            Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, function1, anonymousClass2, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.gestures.TapAndLongPressGestureDetectorKt$tapAndLongPressGestureDetector$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TapAndLongPressGestureDetector.C175921.invoke$lambda$1(function02, (Offset) obj);
                }
            }, continuation, 1, null);
            return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
        }

        /* compiled from: TapAndLongPressGestureDetector.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.gestures.TapAndLongPressGestureDetectorKt$tapAndLongPressGestureDetector$1$2", m3645f = "TapAndLongPressGestureDetector.kt", m3646l = {33, 34, 36}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.gestures.TapAndLongPressGestureDetectorKt$tapAndLongPressGestureDetector$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> {
            final /* synthetic */ InteractionSource3 $interactionSource;
            final /* synthetic */ Function0<Unit> $onLongPressRelease;
            /* synthetic */ long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InteractionSource3 interactionSource3, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.$interactionSource = interactionSource3;
                this.$onLongPressRelease = function0;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector2 tapGestureDetector2, Offset offset, Continuation<? super Unit> continuation) {
                return m14908invoked4ec7I(tapGestureDetector2, offset.getPackedValue(), continuation);
            }

            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final Object m14908invoked4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$interactionSource, this.$onLongPressRelease, continuation);
                anonymousClass2.L$0 = tapGestureDetector2;
                anonymousClass2.J$0 = j;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
            
                if (r9.emit(r3, r8) != r0) goto L22;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                PressInteraction.Press press;
                TapGestureDetector2 tapGestureDetector2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TapGestureDetector2 tapGestureDetector22 = (TapGestureDetector2) this.L$0;
                    press = new PressInteraction.Press(this.J$0, null);
                    InteractionSource3 interactionSource3 = this.$interactionSource;
                    this.L$0 = tapGestureDetector22;
                    this.L$1 = press;
                    this.label = 1;
                    if (interactionSource3.emit(press, this) != coroutine_suspended) {
                        tapGestureDetector2 = tapGestureDetector22;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    press = (PressInteraction.Press) this.L$1;
                    tapGestureDetector2 = (TapGestureDetector2) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    press = (PressInteraction.Press) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.$onLongPressRelease.invoke();
                    InteractionSource3 interactionSource32 = this.$interactionSource;
                    PressInteraction.Release release = new PressInteraction.Release(press);
                    this.L$0 = null;
                    this.label = 3;
                }
                this.L$0 = press;
                this.L$1 = null;
                this.label = 2;
                if (tapGestureDetector2.tryAwaitRelease(this) != coroutine_suspended) {
                    this.$onLongPressRelease.invoke();
                    InteractionSource3 interactionSource322 = this.$interactionSource;
                    PressInteraction.Release release2 = new PressInteraction.Release(press);
                    this.L$0 = null;
                    this.label = 3;
                }
                return coroutine_suspended;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1(Function0 function0, Offset offset) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(Function0 function0, Offset offset) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }
}
