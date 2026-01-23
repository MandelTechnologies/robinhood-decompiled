package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetector2;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextFieldPressGestureFilter.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¨\u0006\n"}, m3636d2 = {"tapPressTextFieldModifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "onTap", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt, reason: use source file name */
/* loaded from: classes.dex */
public final class TextFieldPressGestureFilter {
    public static final Modifier tapPressTextFieldModifier(Modifier modifier, final InteractionSource3 interactionSource3, boolean z, final Function1<? super Offset, Unit> function1) {
        return z ? ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceGroup(-102778667);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-102778667, i, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                final SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, 0);
                Object obj = interactionSource3;
                boolean zChanged = composer.changed(obj);
                final InteractionSource3 interactionSource32 = interactionSource3;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            final SnapshotState<PressInteraction.Press> snapshotState2 = snapshotState;
                            final InteractionSource3 interactionSource33 = interactionSource32;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    PressInteraction.Press press = (PressInteraction.Press) snapshotState2.getValue();
                                    if (press != null) {
                                        PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                                        InteractionSource3 interactionSource34 = interactionSource33;
                                        if (interactionSource34 != null) {
                                            interactionSource34.tryEmit(cancel);
                                        }
                                        snapshotState2.setValue(null);
                                    }
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.DisposableEffect(obj, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                InteractionSource3 interactionSource33 = interactionSource3;
                boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(interactionSource3) | composer.changed(snapshotState4RememberUpdatedState);
                final InteractionSource3 interactionSource34 = interactionSource3;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1

                        /* compiled from: TextFieldPressGestureFilter.kt */
                        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", m3645f = "TextFieldPressGestureFilter.kt", m3646l = {67}, m3647m = "invokeSuspend")
                        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 */
                        static final class C13731 extends ContinuationImpl7 implements Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> {
                            final /* synthetic */ InteractionSource3 $interactionSource;
                            final /* synthetic */ SnapshotState<PressInteraction.Press> $pressedInteraction;
                            final /* synthetic */ CoroutineScope $scope;
                            /* synthetic */ long J$0;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C13731(CoroutineScope coroutineScope, SnapshotState<PressInteraction.Press> snapshotState, InteractionSource3 interactionSource3, Continuation<? super C13731> continuation) {
                                super(3, continuation);
                                this.$scope = coroutineScope;
                                this.$pressedInteraction = snapshotState;
                                this.$interactionSource = interactionSource3;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector2 tapGestureDetector2, Offset offset, Continuation<? super Unit> continuation) {
                                return m5430invoked4ec7I(tapGestureDetector2, offset.getPackedValue(), continuation);
                            }

                            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                            public final Object m5430invoked4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
                                C13731 c13731 = new C13731(this.$scope, this.$pressedInteraction, this.$interactionSource, continuation);
                                c13731.L$0 = tapGestureDetector2;
                                c13731.J$0 = j;
                                return c13731.invokeSuspend(Unit.INSTANCE);
                            }

                            /* compiled from: TextFieldPressGestureFilter.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", m3645f = "TextFieldPressGestureFilter.kt", m3646l = {60, 64}, m3647m = "invokeSuspend")
                            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name */
                            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ InteractionSource3 $interactionSource;
                                final /* synthetic */ long $it;
                                final /* synthetic */ SnapshotState<PressInteraction.Press> $pressedInteraction;
                                Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(SnapshotState<PressInteraction.Press> snapshotState, long j, InteractionSource3 interactionSource3, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$pressedInteraction = snapshotState;
                                    this.$it = j;
                                    this.$interactionSource = interactionSource3;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$pressedInteraction, this.$it, this.$interactionSource, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invokeSuspend(Object obj) {
                                    SnapshotState<PressInteraction.Press> snapshotState;
                                    SnapshotState<PressInteraction.Press> snapshotState2;
                                    PressInteraction.Press press;
                                    InteractionSource3 interactionSource3;
                                    PressInteraction.Press press2;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        PressInteraction.Press value = this.$pressedInteraction.getValue();
                                        if (value != null) {
                                            InteractionSource3 interactionSource32 = this.$interactionSource;
                                            snapshotState = this.$pressedInteraction;
                                            PressInteraction.Cancel cancel = new PressInteraction.Cancel(value);
                                            if (interactionSource32 != null) {
                                                this.L$0 = snapshotState;
                                                this.label = 1;
                                                if (interactionSource32.emit(cancel, this) != coroutine_suspended) {
                                                    snapshotState2 = snapshotState;
                                                }
                                            }
                                            snapshotState.setValue(null);
                                            press = new PressInteraction.Press(this.$it, null);
                                            interactionSource3 = this.$interactionSource;
                                            if (interactionSource3 != null) {
                                                this.L$0 = press;
                                                this.label = 2;
                                                if (interactionSource3.emit(press, this) != coroutine_suspended) {
                                                    press2 = press;
                                                    press = press2;
                                                }
                                            }
                                            this.$pressedInteraction.setValue(press);
                                            return Unit.INSTANCE;
                                        }
                                        press = new PressInteraction.Press(this.$it, null);
                                        interactionSource3 = this.$interactionSource;
                                        if (interactionSource3 != null) {
                                        }
                                        this.$pressedInteraction.setValue(press);
                                        return Unit.INSTANCE;
                                        return coroutine_suspended;
                                    }
                                    if (i != 1) {
                                        if (i != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        press2 = (PressInteraction.Press) this.L$0;
                                        ResultKt.throwOnFailure(obj);
                                        press = press2;
                                        this.$pressedInteraction.setValue(press);
                                        return Unit.INSTANCE;
                                    }
                                    snapshotState2 = (SnapshotState) this.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    snapshotState = snapshotState2;
                                    snapshotState.setValue(null);
                                    press = new PressInteraction.Press(this.$it, null);
                                    interactionSource3 = this.$interactionSource;
                                    if (interactionSource3 != null) {
                                    }
                                    this.$pressedInteraction.setValue(press);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    TapGestureDetector2 tapGestureDetector2 = (TapGestureDetector2) this.L$0;
                                    BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new AnonymousClass1(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, null);
                                    this.label = 1;
                                    obj = tapGestureDetector2.tryAwaitRelease(this);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new AnonymousClass2(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, null);
                                return Unit.INSTANCE;
                            }

                            /* compiled from: TextFieldPressGestureFilter.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", m3645f = "TextFieldPressGestureFilter.kt", m3646l = {76}, m3647m = "invokeSuspend")
                            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ InteractionSource3 $interactionSource;
                                final /* synthetic */ SnapshotState<PressInteraction.Press> $pressedInteraction;
                                final /* synthetic */ boolean $success;
                                Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass2(SnapshotState<PressInteraction.Press> snapshotState, boolean z, InteractionSource3 interactionSource3, Continuation<? super AnonymousClass2> continuation) {
                                    super(2, continuation);
                                    this.$pressedInteraction = snapshotState;
                                    this.$success = z;
                                    this.$interactionSource = interactionSource3;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass2(this.$pressedInteraction, this.$success, this.$interactionSource, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    SnapshotState<PressInteraction.Press> snapshotState;
                                    Interaction cancel;
                                    SnapshotState<PressInteraction.Press> snapshotState2;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        PressInteraction.Press value = this.$pressedInteraction.getValue();
                                        if (value != null) {
                                            boolean z = this.$success;
                                            InteractionSource3 interactionSource3 = this.$interactionSource;
                                            snapshotState = this.$pressedInteraction;
                                            if (z) {
                                                cancel = new PressInteraction.Release(value);
                                            } else {
                                                cancel = new PressInteraction.Cancel(value);
                                            }
                                            if (interactionSource3 != null) {
                                                this.L$0 = snapshotState;
                                                this.label = 1;
                                                if (interactionSource3.emit(cancel, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                snapshotState2 = snapshotState;
                                            }
                                            snapshotState.setValue(null);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    snapshotState2 = (SnapshotState) this.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    snapshotState = snapshotState2;
                                    snapshotState.setValue(null);
                                    return Unit.INSTANCE;
                                }
                            }
                        }

                        @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            C13731 c13731 = new C13731(coroutineScope, snapshotState, interactionSource34, null);
                            final SnapshotState4<Function1<Offset, Unit>> snapshotState4 = snapshotState4RememberUpdatedState;
                            Object objDetectTapAndPress = TapGestureDetector4.detectTapAndPress(pointerInputScope, c13731, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                    m5431invokek4lQ0M(offset.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                public final void m5431invokek4lQ0M(long j) {
                                    snapshotState4.getValue().invoke(Offset.m6534boximpl(j));
                                }
                            }, continuation);
                            return objDetectTapAndPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapAndPress : Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, interactionSource33, (PointerInputEventHandler) objRememberedValue4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierPointerInput;
            }
        }, 1, null) : modifier;
    }
}
