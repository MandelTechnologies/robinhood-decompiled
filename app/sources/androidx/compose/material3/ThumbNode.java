package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNode2;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Switch.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001bJ&\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, m3636d2 = {"Landroidx/compose/material3/ThumbNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "checked", "", "(Landroidx/compose/foundation/interaction/InteractionSource;Z)V", "getChecked", "()Z", "setChecked", "(Z)V", "initialOffset", "", "initialSize", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/InteractionSource;)V", "isPressed", "offsetAnim", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "sizeAnim", "onAttach", "", "update", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ThumbNode extends Modifier.Node implements LayoutModifierNode {
    private boolean checked;
    private float initialOffset = Float.NaN;
    private float initialSize = Float.NaN;
    private InteractionSource interactionSource;
    private boolean isPressed;
    private Animatable<Float, AnimationVectors2> offsetAnim;
    private Animatable<Float, AnimationVectors2> sizeAnim;

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void setInteractionSource(InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public ThumbNode(InteractionSource interactionSource, boolean z) {
        this.interactionSource = interactionSource;
        this.checked = z;
    }

    /* compiled from: Switch.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.material3.ThumbNode$onAttach$1", m3645f = "Switch.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ThumbNode$onAttach$1 */
    static final class C17081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C17081(Continuation<? super C17081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ThumbNode.this.new C17081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Ref.IntRef intRef = new Ref.IntRef();
                Flow<Interaction> interactions = ThumbNode.this.getInteractionSource().getInteractions();
                final ThumbNode thumbNode = ThumbNode.this;
                FlowCollector<? super Interaction> flowCollector = new FlowCollector() { // from class: androidx.compose.material3.ThumbNode.onAttach.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Interaction) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
                        if (interaction instanceof PressInteraction.Press) {
                            intRef.element++;
                        } else if (interaction instanceof PressInteraction.Release) {
                            Ref.IntRef intRef2 = intRef;
                            intRef2.element--;
                        } else if (interaction instanceof PressInteraction.Cancel) {
                            Ref.IntRef intRef3 = intRef;
                            intRef3.element--;
                        }
                        boolean z = intRef.element > 0;
                        if (thumbNode.isPressed != z) {
                            thumbNode.isPressed = z;
                            LayoutModifierNode2.invalidateMeasurement(thumbNode);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (interactions.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C17081(null), 3, null);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo4771measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float thumbDiameter;
        boolean z = (measurable.maxIntrinsicHeight(Constraints.m7975getMaxWidthimpl(j)) == 0 || measurable.maxIntrinsicWidth(Constraints.m7974getMaxHeightimpl(j)) == 0) ? false : true;
        if (this.isPressed) {
            thumbDiameter = SwitchTokens.INSTANCE.m6295getPressedHandleWidthD9Ej5fM();
        } else if (z || this.checked) {
            thumbDiameter = SwitchKt.getThumbDiameter();
        } else {
            thumbDiameter = SwitchKt.getUncheckedThumbDiameter();
        }
        float fMo5016toPx0680j_4 = measureScope.mo5016toPx0680j_4(thumbDiameter);
        Animatable<Float, AnimationVectors2> animatable = this.sizeAnim;
        int iFloatValue = (int) (animatable != null ? animatable.getValue().floatValue() : fMo5016toPx0680j_4);
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(Constraints.INSTANCE.m7984fixedJhjzzOo(iFloatValue, iFloatValue));
        final float fMo5016toPx0680j_42 = measureScope.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(SwitchKt.SwitchHeight - measureScope.mo5012toDpu2uoSUM(fMo5016toPx0680j_4)) / 2.0f));
        float fMo5016toPx0680j_43 = measureScope.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(SwitchKt.SwitchWidth - SwitchKt.getThumbDiameter()) - SwitchKt.ThumbPadding));
        boolean z2 = this.isPressed;
        if (z2 && this.checked) {
            fMo5016toPx0680j_42 = fMo5016toPx0680j_43 - measureScope.mo5016toPx0680j_4(SwitchTokens.INSTANCE.m6299getTrackOutlineWidthD9Ej5fM());
        } else if (z2 && !this.checked) {
            fMo5016toPx0680j_42 = measureScope.mo5016toPx0680j_4(SwitchTokens.INSTANCE.m6299getTrackOutlineWidthD9Ej5fM());
        } else if (this.checked) {
            fMo5016toPx0680j_42 = fMo5016toPx0680j_43;
        }
        Animatable<Float, AnimationVectors2> animatable2 = this.sizeAnim;
        if (!Intrinsics.areEqual(animatable2 != null ? animatable2.getTargetValue() : null, fMo5016toPx0680j_4)) {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, fMo5016toPx0680j_4, null), 3, null);
        }
        Animatable<Float, AnimationVectors2> animatable3 = this.offsetAnim;
        if (!Intrinsics.areEqual(animatable3 != null ? animatable3.getTargetValue() : null, fMo5016toPx0680j_42)) {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new ThumbNode$measure$2(this, fMo5016toPx0680j_42, null), 3, null);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = fMo5016toPx0680j_4;
            this.initialOffset = fMo5016toPx0680j_42;
        }
        return MeasureScope.layout$default(measureScope, iFloatValue, iFloatValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ThumbNode$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable placeable = placeableMo7239measureBRTryo0;
                Animatable animatable4 = this.offsetAnim;
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (int) (animatable4 != null ? ((Number) animatable4.getValue()).floatValue() : fMo5016toPx0680j_42), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void update() {
        if (this.sizeAnim == null && !Float.isNaN(this.initialSize)) {
            this.sizeAnim = Animatable2.Animatable$default(this.initialSize, 0.0f, 2, null);
        }
        if (this.offsetAnim != null || Float.isNaN(this.initialOffset)) {
            return;
        }
        this.offsetAnim = Animatable2.Animatable$default(this.initialOffset, 0.0f, 2, null);
    }
}
