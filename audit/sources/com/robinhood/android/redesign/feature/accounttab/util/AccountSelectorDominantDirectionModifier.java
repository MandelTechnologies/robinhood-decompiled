package com.robinhood.android.redesign.feature.accounttab.util;

import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: AccountSelectorDominantDirectionModifier.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001aA\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¨\u0006\f"}, m3636d2 = {"dominantDirectionDetector", "Landroidx/compose/ui/Modifier;", "horizontalBiasRatio", "", "minMovementThreshold", "onDirectionDetected", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isHorizontal", "", "feature-account-selector_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorDominantDirectionModifierKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSelectorDominantDirectionModifier {
    public static /* synthetic */ Modifier dominantDirectionDetector$default(Modifier modifier, float f, float f2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 2.5f;
        }
        if ((i & 2) != 0) {
            f2 = 10.0f;
        }
        return dominantDirectionDetector(modifier, f, f2, function1);
    }

    public static final Modifier dominantDirectionDetector(Modifier modifier, final float f, final float f2, final Function1<? super Boolean, Unit> onDirectionDetected) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onDirectionDetected, "onDirectionDetected");
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Float.valueOf(f), Float.valueOf(f2), new PointerInputEventHandler() { // from class: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorDominantDirectionModifierKt.dominantDirectionDetector.1

            /* compiled from: AccountSelectorDominantDirectionModifier.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorDominantDirectionModifierKt$dominantDirectionDetector$1$1", m3645f = "AccountSelectorDominantDirectionModifier.kt", m3646l = {29, 36}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorDominantDirectionModifierKt$dominantDirectionDetector$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ float $horizontalBiasRatio;
                final /* synthetic */ float $minMovementThreshold;
                final /* synthetic */ Function1<Boolean, Unit> $onDirectionDetected;
                float F$0;
                float F$1;
                int I$0;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(float f, float f2, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$minMovementThreshold = f;
                    this.$horizontalBiasRatio = f2;
                    this.$onDirectionDetected = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$minMovementThreshold, this.$horizontalBiasRatio, this.$onDirectionDetected, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
                
                    if (r15 != r0) goto L18;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass1 anonymousClass1;
                    AwaitPointerEventScope awaitPointerEventScope;
                    float fIntBitsToFloat;
                    float fIntBitsToFloat2;
                    AwaitPointerEventScope awaitPointerEventScope2;
                    int i;
                    Object next;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope3;
                        this.label = 1;
                        anonymousClass1 = this;
                        if (TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope3, false, null, anonymousClass1, 2, null) != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope3;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = this.I$0;
                        fIntBitsToFloat = this.F$1;
                        fIntBitsToFloat2 = this.F$0;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        anonymousClass1 = this;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        Iterator<T> it = pointerEvent.getChanges().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            PointerInputChange pointerInputChange = (PointerInputChange) next;
                            if (pointerInputChange.getPressed() && PointerEventKt.positionChanged(pointerInputChange)) {
                                break;
                            }
                        }
                        PointerInputChange pointerInputChange2 = (PointerInputChange) next;
                        if (pointerInputChange2 != null && i == 0) {
                            long jM6546minusMKHz9U = Offset.m6546minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition());
                            fIntBitsToFloat2 += Float.intBitsToFloat((int) (jM6546minusMKHz9U >> 32));
                            fIntBitsToFloat += Float.intBitsToFloat((int) (jM6546minusMKHz9U & 4294967295L));
                            float fAbs = Math.abs(fIntBitsToFloat2);
                            float fAbs2 = Math.abs(fIntBitsToFloat);
                            Timber.INSTANCE.tag("PointerInput").mo3350d("accumulated=[" + fIntBitsToFloat2 + ", " + fIntBitsToFloat + "]", new Object[0]);
                            float f = anonymousClass1.$minMovementThreshold;
                            if (fAbs > f || fAbs2 > f) {
                                anonymousClass1.$onDirectionDetected.invoke(boxing.boxBoolean(fAbs > fAbs2 * anonymousClass1.$horizontalBiasRatio));
                                i = 1;
                            }
                        }
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        if (!(changes instanceof Collection) || !changes.isEmpty()) {
                            Iterator<T> it2 = changes.iterator();
                            while (it2.hasNext()) {
                                if (((PointerInputChange) it2.next()).getPressed()) {
                                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                                    anonymousClass1.L$0 = awaitPointerEventScope2;
                                    anonymousClass1.F$0 = fIntBitsToFloat2;
                                    anonymousClass1.F$1 = fIntBitsToFloat;
                                    anonymousClass1.I$0 = i;
                                    anonymousClass1.label = 2;
                                    obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                                }
                            }
                        }
                        anonymousClass1.$onDirectionDetected.invoke(boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                    fIntBitsToFloat = 0.0f;
                    fIntBitsToFloat2 = 0.0f;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    i = 0;
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    anonymousClass1.L$0 = awaitPointerEventScope2;
                    anonymousClass1.F$0 = fIntBitsToFloat2;
                    anonymousClass1.F$1 = fIntBitsToFloat;
                    anonymousClass1.I$0 = i;
                    anonymousClass1.label = 2;
                    obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, this);
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new AnonymousClass1(f2, f, onDirectionDetected, null), continuation);
                return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
            }
        });
    }
}
