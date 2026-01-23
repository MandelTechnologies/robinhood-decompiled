package com.robinhood.android.equitydetail.p123ui.extensions;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"nestedScrollableLazyRow", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ModifiersKt {
    public static final Modifier nestedScrollableLazyRow(Modifier modifier, final LazyListState state) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.equitydetail.ui.extensions.ModifiersKt.nestedScrollableLazyRow.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-1082217163);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1082217163, i, -1, "com.robinhood.android.equitydetail.ui.extensions.nestedScrollableLazyRow.<anonymous> (Modifiers.kt:24)");
                }
                final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
                final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                Modifier.Companion companion = Modifier.INSTANCE;
                Boolean bool = Boolean.TRUE;
                final LazyListState lazyListState = state;
                Modifier modifierThen = composed.then(SuspendingPointerInputFilterKt.pointerInput(companion, bool, new PointerInputEventHandler() { // from class: com.robinhood.android.equitydetail.ui.extensions.ModifiersKt.nestedScrollableLazyRow.1.1

                    /* compiled from: Modifiers.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.extensions.ModifiersKt$nestedScrollableLazyRow$1$1$1", m3645f = "Modifiers.kt", m3646l = {33}, m3647m = "invokeSuspend")
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equitydetail.ui.extensions.ModifiersKt$nestedScrollableLazyRow$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C499541 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Ref.FloatRef $initialX;
                        final /* synthetic */ Ref.FloatRef $initialY;
                        final /* synthetic */ LazyListState $state;
                        final /* synthetic */ int $touchSlop;
                        final /* synthetic */ View $view;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C499541(View view, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, int i, LazyListState lazyListState, Continuation<? super C499541> continuation) {
                            super(2, continuation);
                            this.$view = view;
                            this.$initialX = floatRef;
                            this.$initialY = floatRef2;
                            this.$touchSlop = i;
                            this.$state = lazyListState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C499541 c499541 = new C499541(this.$view, this.$initialX, this.$initialY, this.$touchSlop, this.$state, continuation);
                            c499541.L$0 = obj;
                            return c499541;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                            return ((C499541) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                            /*
                                r13 = this;
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r1 = r13.label
                                r2 = 1
                                if (r1 == 0) goto L1b
                                if (r1 != r2) goto L13
                                java.lang.Object r1 = r13.L$0
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                                kotlin.ResultKt.throwOnFailure(r14)
                                goto L30
                            L13:
                                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r14.<init>(r0)
                                throw r14
                            L1b:
                                kotlin.ResultKt.throwOnFailure(r14)
                                java.lang.Object r14 = r13.L$0
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r14
                                r1 = r14
                            L23:
                                androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.p011ui.input.pointer.PointerEventPass.Initial
                                r13.L$0 = r1
                                r13.label = r2
                                java.lang.Object r14 = r1.awaitPointerEvent(r14, r13)
                                if (r14 != r0) goto L30
                                return r0
                            L30:
                                androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.p011ui.input.pointer.PointerEvent) r14
                                int r3 = r14.getType()
                                androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.p011ui.input.pointer.PointerEventType.INSTANCE
                                int r5 = r4.m7160getPress7fucELk()
                                boolean r5 = androidx.compose.p011ui.input.pointer.PointerEventType.m7156equalsimpl0(r3, r5)
                                r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
                                r8 = 32
                                if (r5 == 0) goto L7d
                                android.view.View r3 = r13.$view
                                android.view.ViewParent r3 = r3.getParent()
                                r3.requestDisallowInterceptTouchEvent(r2)
                                java.util.List r14 = r14.getChanges()
                                java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r14)
                                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r14
                                if (r14 == 0) goto L23
                                kotlin.jvm.internal.Ref$FloatRef r3 = r13.$initialX
                                kotlin.jvm.internal.Ref$FloatRef r4 = r13.$initialY
                                long r9 = r14.getPosition()
                                long r8 = r9 >> r8
                                int r5 = (int) r8
                                float r5 = java.lang.Float.intBitsToFloat(r5)
                                r3.element = r5
                                long r8 = r14.getPosition()
                                long r5 = r8 & r6
                                int r14 = (int) r5
                                float r14 = java.lang.Float.intBitsToFloat(r14)
                                r4.element = r14
                                goto L23
                            L7d:
                                int r4 = r4.m7159getMove7fucELk()
                                boolean r3 = androidx.compose.p011ui.input.pointer.PointerEventType.m7156equalsimpl0(r3, r4)
                                if (r3 == 0) goto L23
                                java.util.List r14 = r14.getChanges()
                                java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r14)
                                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r14
                                if (r14 == 0) goto L23
                                kotlin.jvm.internal.Ref$FloatRef r3 = r13.$initialX
                                kotlin.jvm.internal.Ref$FloatRef r4 = r13.$initialY
                                int r5 = r13.$touchSlop
                                android.view.View r9 = r13.$view
                                androidx.compose.foundation.lazy.LazyListState r10 = r13.$state
                                long r11 = r14.getPreviousPosition()
                                long r11 = r11 >> r8
                                int r8 = (int) r11
                                float r8 = java.lang.Float.intBitsToFloat(r8)
                                float r3 = r3.element
                                float r8 = r8 - r3
                                long r11 = r14.getPreviousPosition()
                                long r6 = r6 & r11
                                int r14 = (int) r6
                                float r14 = java.lang.Float.intBitsToFloat(r14)
                                float r3 = r4.element
                                float r14 = r14 - r3
                                float r3 = java.lang.Math.abs(r8)
                                r4 = 2
                                float r4 = (float) r4
                                float r3 = r3 / r4
                                float r14 = java.lang.Math.abs(r14)
                                float r4 = (float) r5
                                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                                if (r5 > 0) goto Lcb
                                int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                                if (r4 <= 0) goto L23
                            Lcb:
                                int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
                                if (r14 <= 0) goto Ld9
                                android.view.ViewParent r14 = r9.getParent()
                                r3 = 0
                                r14.requestDisallowInterceptTouchEvent(r3)
                                goto L23
                            Ld9:
                                boolean r14 = r10.getCanScrollBackward()
                                if (r14 != 0) goto Le5
                                boolean r14 = r10.getCanScrollForward()
                                if (r14 == 0) goto L23
                            Le5:
                                android.view.ViewParent r14 = r9.getParent()
                                r14.requestDisallowInterceptTouchEvent(r2)
                                goto L23
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.equitydetail.p123ui.extensions.ModifiersKt.C154871.AnonymousClass1.C499541.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                        Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C499541(view, floatRef, floatRef2, scaledTouchSlop, lazyListState, null), continuation);
                        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                    }
                }));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null);
    }
}
