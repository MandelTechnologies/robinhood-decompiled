package com.robinhood.shared.common.compose.multimodebottomsheet;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MultiModeSheetState.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001DBY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000e\u0010\u0011J\u0006\u0010\u001f\u001a\u00020 J \u0010!\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020 H\u0086@¢\u0006\u0002\u0010#J|\u0010$\u001a\u00020\r2l\u0010%\u001ah\b\u0001\u0012\u0004\u0012\u00020'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050(¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110 ¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110 ¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0.\u0012\u0006\u0012\u0004\u0018\u00010\u00010&¢\u0006\u0002\b/H\u0086@¢\u0006\u0002\u00100J\u0018\u00101\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\r2\u0006\u0010\"\u001a\u00020 H\u0080@¢\u0006\u0004\b5\u00106J\b\u0010C\u001a\u00020\u0003H\u0002R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\b8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017*\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR \u00107\u001a\b\u0012\u0004\u0012\u00020\u000508X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010-\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006E"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "", "density", "Landroidx/compose/ui/unit/Density;", "initialValue", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "availableValuesState", "Landroidx/compose/runtime/State;", "Lkotlinx/collections/immutable/ImmutableList;", "confirmValueChange", "Lkotlin/Function1;", "", "onValueChangeSettled", "", "<init>", "(Landroidx/compose/ui/unit/Density;Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "availableValues", "(Landroidx/compose/ui/unit/Density;Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getAvailableValuesState", "()Landroidx/compose/runtime/State;", "getAvailableValues$lib_compose_multi_mode_bottom_sheet_externalDebug$delegate", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;)Ljava/lang/Object;", "getAvailableValues$lib_compose_multi_mode_bottom_sheet_externalDebug", "()Lkotlinx/collections/immutable/ImmutableList;", "currentValue", "getCurrentValue", "()Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "targetValue", "getTargetValue", "isVisible", "()Z", "requireOffset", "", "animateTo", "velocity", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceDrag", "block", "Lkotlin/Function5;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/AnchoredDragScope;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;", "Lkotlin/ParameterName;", "name", "anchors", "lastVelocity", "offset", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "snapTo$lib_compose_multi_mode_bottom_sheet_externalDebug", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settle", "settle$lib_compose_multi_mode_bottom_sheet_externalDebug", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anchoredDraggableState", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeAnchoredDraggableState;", "getAnchoredDraggableState$lib_compose_multi_mode_bottom_sheet_externalDebug", "()Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeAnchoredDraggableState;", "setAnchoredDraggableState$lib_compose_multi_mode_bottom_sheet_externalDebug", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeAnchoredDraggableState;)V", "getOffset$lib_compose_multi_mode_bottom_sheet_externalDebug", "()Ljava/lang/Float;", "getDensity$lib_compose_multi_mode_bottom_sheet_externalDebug", "()Landroidx/compose/ui/unit/Density;", "setDensity$lib_compose_multi_mode_bottom_sheet_externalDebug", "(Landroidx/compose/ui/unit/Density;)V", "requireDensity", "Companion", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class MultiModeSheetState {
    private MultiModeAnchoredDraggableState<MultiModeSheetState2> anchoredDraggableState;
    private final SnapshotState4<ImmutableList<MultiModeSheetState2>> availableValuesState;
    private Density density;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiModeSheetState(Density density, MultiModeSheetState2 initialValue, SnapshotState4<? extends ImmutableList<? extends MultiModeSheetState2>> availableValuesState, Function1<? super MultiModeSheetState2, Boolean> confirmValueChange, Function1<? super MultiModeSheetState2, Unit> onValueChangeSettled) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(availableValuesState, "availableValuesState");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        Intrinsics.checkNotNullParameter(onValueChangeSettled, "onValueChangeSettled");
        this.availableValuesState = availableValuesState;
        this.anchoredDraggableState = new MultiModeAnchoredDraggableState<>(initialValue, new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(MultiModeSheetState.anchoredDraggableState$lambda$5(this.f$0, ((Float) obj).floatValue()));
            }
        }, new Function0() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(MultiModeSheetState.anchoredDraggableState$lambda$7(this.f$0));
            }
        }, new SpringSpec(0.0f, 0.0f, null, 7, null), confirmValueChange, onValueChangeSettled);
    }

    public /* synthetic */ MultiModeSheetState(Density density, MultiModeSheetState2 multiModeSheetState2, SnapshotState4 snapshotState4, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, (i & 2) != 0 ? MultiModeSheetState2.Hidden.INSTANCE : multiModeSheetState2, (SnapshotState4<? extends ImmutableList<? extends MultiModeSheetState2>>) snapshotState4, (Function1<? super MultiModeSheetState2, Boolean>) ((i & 8) != 0 ? new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MultiModeSheetState._init_$lambda$0((MultiModeSheetState2) obj));
            }
        } : function1), (Function1<? super MultiModeSheetState2, Unit>) ((i & 16) != 0 ? new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiModeSheetState._init_$lambda$1((MultiModeSheetState2) obj);
            }
        } : function12));
    }

    public final SnapshotState4<ImmutableList<MultiModeSheetState2>> getAvailableValuesState() {
        return this.availableValuesState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public /* synthetic */ MultiModeSheetState(Density density, MultiModeSheetState2 multiModeSheetState2, ImmutableList immutableList, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, (i & 2) != 0 ? MultiModeSheetState2.Hidden.INSTANCE : multiModeSheetState2, (ImmutableList<? extends MultiModeSheetState2>) ((i & 4) != 0 ? extensions2.persistentListOf(MultiModeSheetState2.Hidden.INSTANCE, MultiModeSheetState2.Expanded.INSTANCE) : immutableList), (Function1<? super MultiModeSheetState2, Boolean>) ((i & 8) != 0 ? new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MultiModeSheetState._init_$lambda$2((MultiModeSheetState2) obj));
            }
        } : function1), (Function1<? super MultiModeSheetState2, Unit>) ((i & 16) != 0 ? new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiModeSheetState._init_$lambda$3((MultiModeSheetState2) obj);
            }
        } : function12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiModeSheetState(Density density, MultiModeSheetState2 initialValue, ImmutableList<? extends MultiModeSheetState2> availableValues, Function1<? super MultiModeSheetState2, Boolean> confirmValueChange, Function1<? super MultiModeSheetState2, Unit> onValueChangeSettled) {
        this(density, initialValue, SnapshotState3.mutableStateOf$default(availableValues, null, 2, null), confirmValueChange, onValueChangeSettled);
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(availableValues, "availableValues");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        Intrinsics.checkNotNullParameter(onValueChangeSettled, "onValueChangeSettled");
    }

    /* renamed from: getAvailableValues$lib_compose_multi_mode_bottom_sheet_externalDebug */
    public final ImmutableList<MultiModeSheetState2> m2764xea28fa74() {
        return this.availableValuesState.getValue();
    }

    public final MultiModeSheetState2 getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final MultiModeSheetState2 getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isVisible() {
        return !Intrinsics.areEqual(this.anchoredDraggableState.getCurrentValue(), MultiModeSheetState2.Hidden.INSTANCE);
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public static /* synthetic */ Object animateTo$default(MultiModeSheetState multiModeSheetState, MultiModeSheetState2 multiModeSheetState2, float f, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            f = multiModeSheetState.anchoredDraggableState.getLastVelocity();
        }
        return multiModeSheetState.animateTo(multiModeSheetState2, f, continuation);
    }

    public final Object animateTo(MultiModeSheetState2 multiModeSheetState2, float f, Continuation<? super Unit> continuation) {
        Object objAnimateTo = MultiModeAnchoredDraggableKt.animateTo(this.anchoredDraggableState, multiModeSheetState2, f, continuation);
        return objAnimateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    /* compiled from: MultiModeSheetState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/AnchoredDragScope;", "anchors", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "lastVelocity", "", "offset"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState$forceDrag$2", m3645f = "MultiModeSheetState.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState$forceDrag$2 */
    static final class C374312 extends ContinuationImpl7 implements Function5<AnchoredDragScope, MultiModeDraggableAnchors<MultiModeSheetState2>, Float, Float, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function5<AnchoredDragScope, MultiModeDraggableAnchors<MultiModeSheetState2>, Float, Float, Continuation<? super Unit>, Object> $block;
        /* synthetic */ float F$0;
        /* synthetic */ float F$1;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C374312(Function5<? super AnchoredDragScope, ? super MultiModeDraggableAnchors<MultiModeSheetState2>, ? super Float, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function5, Continuation<? super C374312> continuation) {
            super(5, continuation);
            this.$block = function5;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, MultiModeDraggableAnchors<MultiModeSheetState2> multiModeDraggableAnchors, float f, float f2, Continuation<? super Unit> continuation) {
            C374312 c374312 = new C374312(this.$block, continuation);
            c374312.L$0 = anchoredDragScope;
            c374312.L$1 = multiModeDraggableAnchors;
            c374312.F$0 = f;
            c374312.F$1 = f2;
            return c374312.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, MultiModeDraggableAnchors<MultiModeSheetState2> multiModeDraggableAnchors, Float f, Float f2, Continuation<? super Unit> continuation) {
            return invoke(anchoredDragScope, multiModeDraggableAnchors, f.floatValue(), f2.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                MultiModeDraggableAnchors<MultiModeSheetState2> multiModeDraggableAnchors = (MultiModeDraggableAnchors) this.L$1;
                float f = this.F$0;
                float f2 = this.F$1;
                Function5<AnchoredDragScope, MultiModeDraggableAnchors<MultiModeSheetState2>, Float, Float, Continuation<? super Unit>, Object> function5 = this.$block;
                Float fBoxFloat = boxing.boxFloat(f);
                Float fBoxFloat2 = boxing.boxFloat(f2);
                this.L$0 = null;
                this.label = 1;
                if (function5.invoke(anchoredDragScope, multiModeDraggableAnchors, fBoxFloat, fBoxFloat2, this) == coroutine_suspended) {
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

    public final Object forceDrag(Function5<? super AnchoredDragScope, ? super MultiModeDraggableAnchors<MultiModeSheetState2>, ? super Float, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function5, Continuation<? super Unit> continuation) {
        Object objForceDrag = MultiModeAnchoredDraggableKt.forceDrag(this.anchoredDraggableState, new C374312(function5, null), continuation);
        return objForceDrag == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objForceDrag : Unit.INSTANCE;
    }

    public final Object snapTo$lib_compose_multi_mode_bottom_sheet_externalDebug(MultiModeSheetState2 multiModeSheetState2, Continuation<? super Unit> continuation) {
        Object objSnapTo = MultiModeAnchoredDraggableKt.snapTo(this.anchoredDraggableState, multiModeSheetState2, continuation);
        return objSnapTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public final Object settle$lib_compose_multi_mode_bottom_sheet_externalDebug(float f, Continuation<? super Unit> continuation) {
        Object obj = this.anchoredDraggableState.settle(f, continuation);
        return obj == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }

    /* renamed from: getAnchoredDraggableState$lib_compose_multi_mode_bottom_sheet_externalDebug */
    public final MultiModeAnchoredDraggableState<MultiModeSheetState2> m2763xe9eec44d() {
        return this.anchoredDraggableState;
    }

    /* renamed from: setAnchoredDraggableState$lib_compose_multi_mode_bottom_sheet_externalDebug */
    public final void m2765x5618c559(MultiModeAnchoredDraggableState<MultiModeSheetState2> multiModeAnchoredDraggableState) {
        Intrinsics.checkNotNullParameter(multiModeAnchoredDraggableState, "<set-?>");
        this.anchoredDraggableState = multiModeAnchoredDraggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float anchoredDraggableState$lambda$5(MultiModeSheetState multiModeSheetState, float f) {
        return multiModeSheetState.requireDensity().mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(56));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float anchoredDraggableState$lambda$7(MultiModeSheetState multiModeSheetState) {
        return multiModeSheetState.requireDensity().mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(125));
    }

    public final Float getOffset$lib_compose_multi_mode_bottom_sheet_externalDebug() {
        return Float.valueOf(this.anchoredDraggableState.getOffset());
    }

    /* renamed from: getDensity$lib_compose_multi_mode_bottom_sheet_externalDebug, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity$lib_compose_multi_mode_bottom_sheet_externalDebug(Density density) {
        this.density = density;
    }

    private final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
    }

    /* compiled from: MultiModeSheetState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J^\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState$Companion;", "", "<init>", "()V", "saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetState;", "", "availableValuesState", "Landroidx/compose/runtime/State;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "confirmValueChange", "Lkotlin/Function1;", "", "onValueChangeSettled", "", "density", "Landroidx/compose/ui/unit/Density;", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Saver saver$default(Companion companion, SnapshotState4 snapshotState4, Function1 function1, Function1 function12, Density density, int i, Object obj) {
            if ((i & 4) != 0) {
                function12 = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MultiModeSheetState.Companion.saver$lambda$0((MultiModeSheetState2) obj2);
                    }
                };
            }
            return companion.saver(snapshotState4, function1, function12, density);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit saver$lambda$0(MultiModeSheetState2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        public final Saver<MultiModeSheetState, List<Object>> saver(final SnapshotState4<? extends ImmutableList<? extends MultiModeSheetState2>> availableValuesState, final Function1<? super MultiModeSheetState2, Boolean> confirmValueChange, final Function1<? super MultiModeSheetState2, Unit> onValueChangeSettled, final Density density) {
            Intrinsics.checkNotNullParameter(availableValuesState, "availableValuesState");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(onValueChangeSettled, "onValueChangeSettled");
            Intrinsics.checkNotNullParameter(density, "density");
            return Saver2.Saver(new Function2() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiModeSheetState.Companion.saver$lambda$2((Saver5) obj, (MultiModeSheetState) obj2);
                }
            }, new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MultiModeSheetState.Companion.saver$lambda$3(density, availableValuesState, confirmValueChange, onValueChangeSettled, (List) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List saver$lambda$2(Saver5 Saver, MultiModeSheetState state) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(state, "state");
            return MultiModeSheetState2.INSTANCE.getSaver().save(Saver, state.getCurrentValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MultiModeSheetState saver$lambda$3(Density density, SnapshotState4 snapshotState4, Function1 function1, Function1 function12, List savedValue) {
            Intrinsics.checkNotNullParameter(savedValue, "savedValue");
            MultiModeSheetState2 multiModeSheetState2Restore = MultiModeSheetState2.INSTANCE.getSaver().restore(savedValue);
            if (multiModeSheetState2Restore == null) {
                multiModeSheetState2Restore = MultiModeSheetState2.Hidden.INSTANCE;
            }
            return new MultiModeSheetState(density, multiModeSheetState2Restore, (SnapshotState4<? extends ImmutableList<? extends MultiModeSheetState2>>) snapshotState4, (Function1<? super MultiModeSheetState2, Boolean>) function1, (Function1<? super MultiModeSheetState2, Unit>) function12);
        }
    }
}
