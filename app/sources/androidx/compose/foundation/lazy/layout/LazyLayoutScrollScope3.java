package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationState2;
import androidx.compose.animation.core.AnimationState3;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.foundation.internal.InlineClassHelper;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: LazyLayoutScrollScope.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, m3636d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "isItemVisible", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;I)Z", "scrollOffset", "numOfItemsForTeleport", "Landroidx/compose/ui/unit/Density;", "density", "", "animateScrollToItem", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "TargetDistance", "F", "BoundDistance", "MinimumDistance", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LazyLayoutScrollScope3 {
    private static final float TargetDistance = C2002Dp.m7995constructorimpl(2500);
    private static final float BoundDistance = C2002Dp.m7995constructorimpl(1500);
    private static final float MinimumDistance = C2002Dp.m7995constructorimpl(50);

    /* compiled from: LazyLayoutScrollScope.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", m3645f = "LazyLayoutScrollScope.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m3647m = "animateScrollToItem")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1 */
    static final class C12741 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C12741(Continuation<? super C12741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyLayoutScrollScope3.animateScrollToItem(null, 0, 0, 0, null, this);
        }
    }

    public static final boolean isItemVisible(LazyLayoutScrollScope lazyLayoutScrollScope, int i) {
        return i <= lazyLayoutScrollScope.getLastVisibleItemIndex() && lazyLayoutScrollScope.getFirstVisibleItemIndex() <= i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:(1:(2:39|40))|(1:(16:51|53|(1:55)(1:56)|57|(1:59)(1:61)|60|108|62|63|122|64|65|112|66|(8:69|18|118|70|71|114|35|(4:37|39|40|(0)(4:42|116|43|(1:46))))|99)(1:52))(0)|45|53|(0)(0)|57|(0)(0)|60|108|62|63|122|64|65|112|66|(0)|99) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e4, code lost:
    
        r21 = r5;
        r2 = r17;
        r14 = r18;
        r9 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea A[Catch: ItemFoundInScroll -> 0x01ed, TryCatch #5 {ItemFoundInScroll -> 0x01ed, blocks: (B:35:0x00e6, B:37:0x00ea, B:39:0x00f0, B:53:0x0121, B:57:0x015d), top: B:114:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r8v16, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01b6 -> B:18:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateScrollToItem(LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2, int i3, Density density, Continuation<? super Unit> continuation) {
        C12741 c12741;
        float f;
        final LazyLayoutScrollScope lazyLayoutScrollScope2;
        int i4;
        int i5;
        int i6;
        float fMo5016toPx0680j_4;
        float fMo5016toPx0680j_42;
        float fMo5016toPx0680j_43;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        final int i7;
        final int i8;
        final float f2;
        final Ref.IntRef intRef;
        float f3;
        C12741 c127412;
        float f4;
        int i9;
        int i10;
        LazyLayoutScrollScope lazyLayoutScrollScope3;
        AnimationState animationStateCopy$default;
        Float fBoxFloat;
        int i11;
        Function1<AnimationState2<Float, AnimationVectors2>, Unit> function1;
        LazyLayoutScrollScope lazyLayoutScrollScope4;
        int i12;
        int i13;
        C12741 c127413;
        int iCalculateDistanceTo$default;
        float fMax;
        final float f5;
        AnimationState animationState;
        Float fBoxFloat2;
        boolean z;
        Function1<AnimationState2<Float, AnimationVectors2>, Unit> function12;
        int i14;
        if (continuation instanceof C12741) {
            c12741 = (C12741) continuation;
            int i15 = c12741.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c12741.label = i15 - Integer.MIN_VALUE;
            } else {
                c12741 = new C12741(continuation);
            }
        }
        Object obj = c12741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i16 = c12741.label;
        int i17 = 0;
        int i18 = 1;
        if (i16 == 0) {
            f = 0.0f;
            ResultKt.throwOnFailure(obj);
            if (!(((float) i) >= 0.0f)) {
                InlineClassHelper.throwIllegalArgumentException("Index should be non-negative");
            }
            try {
                fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(TargetDistance);
                fMo5016toPx0680j_42 = density.mo5016toPx0680j_4(BoundDistance);
                fMo5016toPx0680j_43 = density.mo5016toPx0680j_4(MinimumDistance);
                booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                objectRef = new Ref.ObjectRef();
                objectRef.element = AnimationState3.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
            } catch (LazyLayoutScrollScope2 e) {
                e = e;
                lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                i4 = 0;
            }
            if (isItemVisible(lazyLayoutScrollScope, i)) {
                lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                i4 = 0;
                try {
                    throw new LazyLayoutScrollScope2(LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope2, i, 0, 2, null), (AnimationState) objectRef.element);
                } catch (LazyLayoutScrollScope2 e2) {
                    e = e2;
                    i5 = i2;
                    i6 = i;
                    animationStateCopy$default = AnimationState3.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                    final float itemOffset = e.getItemOffset() + i5;
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    fBoxFloat = boxing.boxFloat(itemOffset);
                    if (((Number) animationStateCopy$default.getVelocity()).floatValue() != f) {
                    }
                    function1 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                            invoke2(animationState2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                            float f6 = itemOffset;
                            float fCoerceAtLeast = 0.0f;
                            if (f6 > 0.0f) {
                                fCoerceAtLeast = RangesKt.coerceAtMost(animationState2.getValue().floatValue(), itemOffset);
                            } else if (f6 < 0.0f) {
                                fCoerceAtLeast = RangesKt.coerceAtLeast(animationState2.getValue().floatValue(), itemOffset);
                            }
                            float f7 = fCoerceAtLeast - floatRef.element;
                            if (f7 != lazyLayoutScrollScope2.scrollBy(f7) || fCoerceAtLeast != animationState2.getValue().floatValue()) {
                                animationState2.cancelAnimation();
                            }
                            floatRef.element += f7;
                        }
                    };
                    c12741.L$0 = lazyLayoutScrollScope2;
                    c12741.L$1 = null;
                    c12741.L$2 = null;
                    c12741.L$3 = null;
                    c12741.I$0 = i6;
                    c12741.I$1 = i5;
                    c12741.label = 2;
                    if (SuspendAnimation.animateTo$default(animationStateCopy$default, fBoxFloat, null, i11 ^ 1, function1, c12741, 2, null) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            }
            try {
                int i19 = i > lazyLayoutScrollScope.getFirstVisibleItemIndex() ? 1 : 0;
                Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.element = 1;
                i7 = i2;
                i8 = i3;
                f2 = fMo5016toPx0680j_42;
                intRef = intRef2;
                f3 = fMo5016toPx0680j_4;
                c127412 = c12741;
                f4 = fMo5016toPx0680j_43;
                i9 = i;
                i10 = i19;
                lazyLayoutScrollScope3 = lazyLayoutScrollScope;
                if (booleanRef.element) {
                }
            } catch (LazyLayoutScrollScope2 e3) {
                e = e3;
                lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                i5 = i2;
                i6 = i;
                i4 = 0;
                animationStateCopy$default = AnimationState3.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                final float itemOffset2 = e.getItemOffset() + i5;
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                fBoxFloat = boxing.boxFloat(itemOffset2);
                if (((Number) animationStateCopy$default.getVelocity()).floatValue() != f) {
                }
                function1 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                        invoke2(animationState2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                        float f6 = itemOffset2;
                        float fCoerceAtLeast = 0.0f;
                        if (f6 > 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtMost(animationState2.getValue().floatValue(), itemOffset2);
                        } else if (f6 < 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtLeast(animationState2.getValue().floatValue(), itemOffset2);
                        }
                        float f7 = fCoerceAtLeast - floatRef2.element;
                        if (f7 != lazyLayoutScrollScope2.scrollBy(f7) || fCoerceAtLeast != animationState2.getValue().floatValue()) {
                            animationState2.cancelAnimation();
                        }
                        floatRef2.element += f7;
                    }
                };
                c12741.L$0 = lazyLayoutScrollScope2;
                c12741.L$1 = null;
                c12741.L$2 = null;
                c12741.L$3 = null;
                c12741.I$0 = i6;
                c12741.I$1 = i5;
                c12741.label = 2;
                if (SuspendAnimation.animateTo$default(animationStateCopy$default, fBoxFloat, null, i11 ^ 1, function1, c12741, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = c12741.I$1;
            i13 = c12741.I$0;
            lazyLayoutScrollScope4 = (LazyLayoutScrollScope) c12741.L$0;
            ResultKt.throwOnFailure(obj);
            lazyLayoutScrollScope4.snapToItem(i13, i12);
            return Unit.INSTANCE;
        }
        i10 = c12741.I$3;
        float f6 = c12741.F$2;
        float f7 = c12741.F$1;
        f3 = c12741.F$0;
        int i20 = c12741.I$2;
        int i21 = c12741.I$1;
        i6 = c12741.I$0;
        Ref.IntRef intRef3 = (Ref.IntRef) c12741.L$3;
        f = 0.0f;
        Ref.ObjectRef objectRef2 = (Ref.ObjectRef) c12741.L$2;
        Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) c12741.L$1;
        LazyLayoutScrollScope lazyLayoutScrollScope5 = (LazyLayoutScrollScope) c12741.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            objectRef = objectRef2;
            booleanRef = booleanRef2;
            f2 = f7;
            i14 = i20;
            i7 = i21;
            c127412 = c12741;
            f4 = f6;
            lazyLayoutScrollScope3 = lazyLayoutScrollScope5;
            i9 = i6;
        } catch (LazyLayoutScrollScope2 e4) {
            e = e4;
            lazyLayoutScrollScope2 = lazyLayoutScrollScope5;
            i4 = 0;
            i5 = i21;
        }
        try {
            try {
                intRef3.element++;
            } catch (LazyLayoutScrollScope2 e5) {
                e = e5;
                i6 = i9;
                c127413 = c127412;
                i5 = i7;
                lazyLayoutScrollScope2 = lazyLayoutScrollScope3;
            }
            i8 = i14;
            intRef = intRef3;
            i17 = 0;
            i18 = 1;
        } catch (LazyLayoutScrollScope2 e6) {
            e = e6;
            i6 = i9;
            c12741 = c127412;
            i5 = i7;
            i4 = 0;
            lazyLayoutScrollScope2 = lazyLayoutScrollScope3;
            animationStateCopy$default = AnimationState3.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
            final float itemOffset22 = e.getItemOffset() + i5;
            final Ref.FloatRef floatRef22 = new Ref.FloatRef();
            fBoxFloat = boxing.boxFloat(itemOffset22);
            if (((Number) animationStateCopy$default.getVelocity()).floatValue() != f) {
            }
            function1 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                    invoke2(animationState2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                    float f62 = itemOffset22;
                    float fCoerceAtLeast = 0.0f;
                    if (f62 > 0.0f) {
                        fCoerceAtLeast = RangesKt.coerceAtMost(animationState2.getValue().floatValue(), itemOffset22);
                    } else if (f62 < 0.0f) {
                        fCoerceAtLeast = RangesKt.coerceAtLeast(animationState2.getValue().floatValue(), itemOffset22);
                    }
                    float f72 = fCoerceAtLeast - floatRef22.element;
                    if (f72 != lazyLayoutScrollScope2.scrollBy(f72) || fCoerceAtLeast != animationState2.getValue().floatValue()) {
                        animationState2.cancelAnimation();
                    }
                    floatRef22.element += f72;
                }
            };
            c12741.L$0 = lazyLayoutScrollScope2;
            c12741.L$1 = null;
            c12741.L$2 = null;
            c12741.L$3 = null;
            c12741.I$0 = i6;
            c12741.I$1 = i5;
            c12741.label = 2;
            if (SuspendAnimation.animateTo$default(animationStateCopy$default, fBoxFloat, null, i11 ^ 1, function1, c12741, 2, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (booleanRef.element && lazyLayoutScrollScope3.getItemCount() > 0) {
            try {
                try {
                    iCalculateDistanceTo$default = LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope3, i9, i17, 2, null) + i7;
                } catch (LazyLayoutScrollScope2 e7) {
                    e = e7;
                    c127413 = c127412;
                }
            } catch (LazyLayoutScrollScope2 e8) {
                e = e8;
                c12741 = c127413;
                i4 = 0;
                animationStateCopy$default = AnimationState3.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                final float itemOffset222 = e.getItemOffset() + i5;
                final Ref.FloatRef floatRef222 = new Ref.FloatRef();
                fBoxFloat = boxing.boxFloat(itemOffset222);
                if (((Number) animationStateCopy$default.getVelocity()).floatValue() != f) {
                }
                function1 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                        invoke2(animationState2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                        float f62 = itemOffset222;
                        float fCoerceAtLeast = 0.0f;
                        if (f62 > 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtMost(animationState2.getValue().floatValue(), itemOffset222);
                        } else if (f62 < 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtLeast(animationState2.getValue().floatValue(), itemOffset222);
                        }
                        float f72 = fCoerceAtLeast - floatRef222.element;
                        if (f72 != lazyLayoutScrollScope2.scrollBy(f72) || fCoerceAtLeast != animationState2.getValue().floatValue()) {
                            animationState2.cancelAnimation();
                        }
                        floatRef222.element += f72;
                    }
                };
                c12741.L$0 = lazyLayoutScrollScope2;
                c12741.L$1 = null;
                c12741.L$2 = null;
                c12741.L$3 = null;
                c12741.I$0 = i6;
                c12741.I$1 = i5;
                c12741.label = 2;
                if (SuspendAnimation.animateTo$default(animationStateCopy$default, fBoxFloat, null, i11 ^ 1, function1, c12741, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (Math.abs(iCalculateDistanceTo$default) < f3) {
                if (i10 != 0) {
                    f5 = f3;
                    objectRef.element = AnimationState3.copy$default((AnimationState) objectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                    final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    animationState = (AnimationState) objectRef.element;
                    fBoxFloat2 = boxing.boxFloat(f5);
                    z = (((Number) ((AnimationState) objectRef.element).getVelocity()).floatValue() != f ? i18 : i17) ^ i18;
                    final boolean z2 = i10 == 0 ? i18 : i17;
                    final LazyLayoutScrollScope lazyLayoutScrollScope6 = lazyLayoutScrollScope3;
                    final int i22 = i9;
                    final Ref.BooleanRef booleanRef3 = booleanRef;
                    final Ref.ObjectRef objectRef3 = objectRef;
                    function12 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                            invoke2(animationState2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                            float fCoerceAtLeast;
                            if (!LazyLayoutScrollScope3.isItemVisible(lazyLayoutScrollScope6, i22)) {
                                if (f5 > 0.0f) {
                                    fCoerceAtLeast = RangesKt.coerceAtMost(animationState2.getValue().floatValue(), f5);
                                } else {
                                    fCoerceAtLeast = RangesKt.coerceAtLeast(animationState2.getValue().floatValue(), f5);
                                }
                                float f8 = fCoerceAtLeast - floatRef3.element;
                                float fScrollBy = lazyLayoutScrollScope6.scrollBy(f8);
                                if (!LazyLayoutScrollScope3.isItemVisible(lazyLayoutScrollScope6, i22) && !LazyLayoutScrollScope3.animateScrollToItem$isOvershot(z2, lazyLayoutScrollScope6, i22, i7)) {
                                    if (f8 != fScrollBy) {
                                        animationState2.cancelAnimation();
                                        booleanRef3.element = false;
                                        return;
                                    }
                                    floatRef3.element += f8;
                                    if (z2) {
                                        if (animationState2.getValue().floatValue() > f2) {
                                            animationState2.cancelAnimation();
                                        }
                                    } else if (animationState2.getValue().floatValue() < (-f2)) {
                                        animationState2.cancelAnimation();
                                    }
                                    if (z2) {
                                        if (intRef.element >= 2) {
                                            int lastVisibleItemIndex = i22 - lazyLayoutScrollScope6.getLastVisibleItemIndex();
                                            int i23 = i8;
                                            if (lastVisibleItemIndex > i23) {
                                                lazyLayoutScrollScope6.snapToItem(i22 - i23, 0);
                                            }
                                        }
                                    } else if (intRef.element >= 2) {
                                        int firstVisibleItemIndex = lazyLayoutScrollScope6.getFirstVisibleItemIndex();
                                        int i24 = i22;
                                        int i25 = firstVisibleItemIndex - i24;
                                        int i26 = i8;
                                        if (i25 > i26) {
                                            lazyLayoutScrollScope6.snapToItem(i24 + i26, 0);
                                        }
                                    }
                                }
                            }
                            if (LazyLayoutScrollScope3.animateScrollToItem$isOvershot(z2, lazyLayoutScrollScope6, i22, i7)) {
                                lazyLayoutScrollScope6.snapToItem(i22, i7);
                                booleanRef3.element = false;
                                animationState2.cancelAnimation();
                                return;
                            }
                            if (LazyLayoutScrollScope3.isItemVisible(lazyLayoutScrollScope6, i22)) {
                                throw new LazyLayoutScrollScope2(LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope6, i22, 0, 2, null), objectRef3.element);
                            }
                        }
                    };
                    lazyLayoutScrollScope2 = lazyLayoutScrollScope6;
                    i6 = i22;
                    float f8 = f2;
                    intRef3 = intRef;
                    i14 = i8;
                    i5 = i7;
                    c127412.L$0 = lazyLayoutScrollScope2;
                    c127412.L$1 = booleanRef3;
                    c127412.L$2 = objectRef3;
                    c127412.L$3 = intRef3;
                    c127412.I$0 = i6;
                    c127412.I$1 = i5;
                    c127412.I$2 = i14;
                    c127412.F$0 = f3;
                    c127412.F$1 = f8;
                    c127412.F$2 = f4;
                    c127412.I$3 = i10;
                    c127412.label = 1;
                    c127413 = c127412;
                    if (SuspendAnimation.animateTo$default(animationState, fBoxFloat2, null, z, function12, c127413, 2, null) != coroutine_suspended) {
                        objectRef = objectRef3;
                        booleanRef = booleanRef3;
                        lazyLayoutScrollScope3 = lazyLayoutScrollScope2;
                        c127412 = c127413;
                        f2 = f8;
                        i7 = i5;
                        i9 = i6;
                        intRef3.element++;
                        i8 = i14;
                        intRef = intRef3;
                        i17 = 0;
                        i18 = 1;
                        if (booleanRef.element) {
                            iCalculateDistanceTo$default = LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope3, i9, i17, 2, null) + i7;
                            if (Math.abs(iCalculateDistanceTo$default) < f3) {
                                try {
                                    fMax = Math.max(Math.abs(iCalculateDistanceTo$default), f4);
                                    if (i10 == 0) {
                                        fMax = -fMax;
                                    }
                                } catch (LazyLayoutScrollScope2 e9) {
                                    e = e9;
                                    i6 = i9;
                                    c12741 = c127412;
                                    i4 = i17;
                                    i5 = i7;
                                    lazyLayoutScrollScope2 = lazyLayoutScrollScope3;
                                    animationStateCopy$default = AnimationState3.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                    final float itemOffset2222 = e.getItemOffset() + i5;
                                    final Ref.FloatRef floatRef2222 = new Ref.FloatRef();
                                    fBoxFloat = boxing.boxFloat(itemOffset2222);
                                    if (((Number) animationStateCopy$default.getVelocity()).floatValue() != f) {
                                    }
                                    function1 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem.6
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                                            invoke2(animationState2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                                            float f62 = itemOffset2222;
                                            float fCoerceAtLeast = 0.0f;
                                            if (f62 > 0.0f) {
                                                fCoerceAtLeast = RangesKt.coerceAtMost(animationState2.getValue().floatValue(), itemOffset2222);
                                            } else if (f62 < 0.0f) {
                                                fCoerceAtLeast = RangesKt.coerceAtLeast(animationState2.getValue().floatValue(), itemOffset2222);
                                            }
                                            float f72 = fCoerceAtLeast - floatRef2222.element;
                                            if (f72 != lazyLayoutScrollScope2.scrollBy(f72) || fCoerceAtLeast != animationState2.getValue().floatValue()) {
                                                animationState2.cancelAnimation();
                                            }
                                            floatRef2222.element += f72;
                                        }
                                    };
                                    c12741.L$0 = lazyLayoutScrollScope2;
                                    c12741.L$1 = null;
                                    c12741.L$2 = null;
                                    c12741.L$3 = null;
                                    c12741.I$0 = i6;
                                    c12741.I$1 = i5;
                                    c12741.label = 2;
                                    if (SuspendAnimation.animateTo$default(animationStateCopy$default, fBoxFloat, null, i11 ^ 1, function1, c12741, 2, null) != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                fMax = -f3;
            }
            f5 = fMax;
            objectRef.element = AnimationState3.copy$default((AnimationState) objectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
            final Ref.FloatRef floatRef32 = new Ref.FloatRef();
            animationState = (AnimationState) objectRef.element;
            fBoxFloat2 = boxing.boxFloat(f5);
            z = (((Number) ((AnimationState) objectRef.element).getVelocity()).floatValue() != f ? i18 : i17) ^ i18;
            if (i10 == 0) {
            }
            final LazyLayoutScrollScope lazyLayoutScrollScope62 = lazyLayoutScrollScope3;
            final int i222 = i9;
            final Ref.BooleanRef booleanRef32 = booleanRef;
            final Ref.ObjectRef<AnimationState<Float, AnimationVectors2>> objectRef32 = objectRef;
            function12 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                    invoke2(animationState2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                    float fCoerceAtLeast;
                    if (!LazyLayoutScrollScope3.isItemVisible(lazyLayoutScrollScope62, i222)) {
                        if (f5 > 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtMost(animationState2.getValue().floatValue(), f5);
                        } else {
                            fCoerceAtLeast = RangesKt.coerceAtLeast(animationState2.getValue().floatValue(), f5);
                        }
                        float f82 = fCoerceAtLeast - floatRef32.element;
                        float fScrollBy = lazyLayoutScrollScope62.scrollBy(f82);
                        if (!LazyLayoutScrollScope3.isItemVisible(lazyLayoutScrollScope62, i222) && !LazyLayoutScrollScope3.animateScrollToItem$isOvershot(z2, lazyLayoutScrollScope62, i222, i7)) {
                            if (f82 != fScrollBy) {
                                animationState2.cancelAnimation();
                                booleanRef32.element = false;
                                return;
                            }
                            floatRef32.element += f82;
                            if (z2) {
                                if (animationState2.getValue().floatValue() > f2) {
                                    animationState2.cancelAnimation();
                                }
                            } else if (animationState2.getValue().floatValue() < (-f2)) {
                                animationState2.cancelAnimation();
                            }
                            if (z2) {
                                if (intRef.element >= 2) {
                                    int lastVisibleItemIndex = i222 - lazyLayoutScrollScope62.getLastVisibleItemIndex();
                                    int i23 = i8;
                                    if (lastVisibleItemIndex > i23) {
                                        lazyLayoutScrollScope62.snapToItem(i222 - i23, 0);
                                    }
                                }
                            } else if (intRef.element >= 2) {
                                int firstVisibleItemIndex = lazyLayoutScrollScope62.getFirstVisibleItemIndex();
                                int i24 = i222;
                                int i25 = firstVisibleItemIndex - i24;
                                int i26 = i8;
                                if (i25 > i26) {
                                    lazyLayoutScrollScope62.snapToItem(i24 + i26, 0);
                                }
                            }
                        }
                    }
                    if (LazyLayoutScrollScope3.animateScrollToItem$isOvershot(z2, lazyLayoutScrollScope62, i222, i7)) {
                        lazyLayoutScrollScope62.snapToItem(i222, i7);
                        booleanRef32.element = false;
                        animationState2.cancelAnimation();
                        return;
                    }
                    if (LazyLayoutScrollScope3.isItemVisible(lazyLayoutScrollScope62, i222)) {
                        throw new LazyLayoutScrollScope2(LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope62, i222, 0, 2, null), objectRef32.element);
                    }
                }
            };
            lazyLayoutScrollScope2 = lazyLayoutScrollScope62;
            i6 = i222;
            float f82 = f2;
            intRef3 = intRef;
            i14 = i8;
            i5 = i7;
            c127412.L$0 = lazyLayoutScrollScope2;
            c127412.L$1 = booleanRef32;
            c127412.L$2 = objectRef32;
            c127412.L$3 = intRef3;
            c127412.I$0 = i6;
            c127412.I$1 = i5;
            c127412.I$2 = i14;
            c127412.F$0 = f3;
            c127412.F$1 = f82;
            c127412.F$2 = f4;
            c127412.I$3 = i10;
            c127412.label = 1;
            c127413 = c127412;
            if (SuspendAnimation.animateTo$default(animationState, fBoxFloat2, null, z, function12, c127413, 2, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        animationStateCopy$default = AnimationState3.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        final float itemOffset22222 = e.getItemOffset() + i5;
        final Ref.FloatRef floatRef22222 = new Ref.FloatRef();
        fBoxFloat = boxing.boxFloat(itemOffset22222);
        i11 = ((Number) animationStateCopy$default.getVelocity()).floatValue() != f ? 1 : i4;
        function1 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                invoke2(animationState2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                float f62 = itemOffset22222;
                float fCoerceAtLeast = 0.0f;
                if (f62 > 0.0f) {
                    fCoerceAtLeast = RangesKt.coerceAtMost(animationState2.getValue().floatValue(), itemOffset22222);
                } else if (f62 < 0.0f) {
                    fCoerceAtLeast = RangesKt.coerceAtLeast(animationState2.getValue().floatValue(), itemOffset22222);
                }
                float f72 = fCoerceAtLeast - floatRef22222.element;
                if (f72 != lazyLayoutScrollScope2.scrollBy(f72) || fCoerceAtLeast != animationState2.getValue().floatValue()) {
                    animationState2.cancelAnimation();
                }
                floatRef22222.element += f72;
            }
        };
        c12741.L$0 = lazyLayoutScrollScope2;
        c12741.L$1 = null;
        c12741.L$2 = null;
        c12741.L$3 = null;
        c12741.I$0 = i6;
        c12741.I$1 = i5;
        c12741.label = 2;
        if (SuspendAnimation.animateTo$default(animationStateCopy$default, fBoxFloat, null, i11 ^ 1, function1, c12741, 2, null) != coroutine_suspended) {
            lazyLayoutScrollScope4 = lazyLayoutScrollScope2;
            i12 = i5;
            i13 = i6;
            lazyLayoutScrollScope4.snapToItem(i13, i12);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animateScrollToItem$isOvershot(boolean z, LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2) {
        if (z) {
            if (lazyLayoutScrollScope.getFirstVisibleItemIndex() > i) {
                return true;
            }
            return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() > i2;
        }
        if (lazyLayoutScrollScope.getFirstVisibleItemIndex() < i) {
            return true;
        }
        return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() < i2;
    }
}
