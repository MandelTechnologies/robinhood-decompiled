package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.FocusInteraction2;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.focus.FocusTargetModifierNode;
import androidx.compose.p011ui.focus.FocusTargetModifierNode2;
import androidx.compose.p011ui.focus.Focusability;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.PinnableContainer;
import androidx.compose.p011ui.layout.PinnableContainer2;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode2;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p011ui.node.ObserverModifierNode;
import androidx.compose.p011ui.node.ObserverModifierNode2;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNode2;
import androidx.compose.p011ui.node.TraversableNode;
import androidx.compose.p011ui.node.TraversableNode3;
import androidx.compose.p011ui.relocation.BringIntoViewModifierNode2;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job4;

/* compiled from: Focusable.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u00019B1\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0002\u0010\u000fJ\b\u0010%\u001a\u00020\u000eH\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\u000eH\u0002J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0019H\u0016J\b\u0010/\u001a\u00020\u000eH\u0016J\b\u00100\u001a\u00020\u000eH\u0016J\n\u00101\u001a\u0004\u0018\u000102H\u0002J\u0010\u00103\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\f\u00104\u001a\u00020\u000e*\u000205H\u0016J\u0014\u00106\u001a\u00020\u000e*\u00020\b2\u0006\u00107\u001a\u000208H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006:"}, m3636d2 = {"Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "focusability", "Landroidx/compose/ui/focus/Focusability;", "onFocusChange", "Lkotlin/Function1;", "", "", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "focusTargetNode", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "focusedBoundsObserver", "Landroidx/compose/foundation/FocusedBoundsObserverNode;", "getFocusedBoundsObserver", "()Landroidx/compose/foundation/FocusedBoundsObserverNode;", "focusedInteraction", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "globalLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "pinnedHandle", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "requestFocus", "Lkotlin/Function0;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "traverseKey", "", "getTraverseKey", "()Ljava/lang/Object;", "disposeInteractionSource", "emitInteraction", "isFocused", "notifyObserverWhenAttached", "onFocusStateChange", "previousState", "Landroidx/compose/ui/focus/FocusState;", "currentState", "onGloballyPositioned", "coordinates", "onObservedReadsChanged", "onReset", "retrievePinnableContainer", "Landroidx/compose/ui/layout/PinnableContainer;", "update", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "emitWithFallback", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "TraverseKey", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.FocusableNode, reason: use source file name */
/* loaded from: classes.dex */
public final class Focusable3 extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {
    private final FocusTargetModifierNode focusTargetNode;
    private FocusInteraction focusedInteraction;
    private LayoutCoordinates globalLayoutCoordinates;
    private InteractionSource3 interactionSource;
    private final Function1<Boolean, Unit> onFocusChange;
    private PinnableContainer.PinnedHandle pinnedHandle;
    private Function0<Boolean> requestFocus;
    private final boolean shouldAutoInvalidate;
    private static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    public /* synthetic */ Focusable3(InteractionSource3 interactionSource3, int i, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource3, i, function1);
    }

    public /* synthetic */ Focusable3(InteractionSource3 interactionSource3, int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource3, (i2 & 2) != 0 ? Focusability.INSTANCE.m6513getAlwaysLCbbffg() : i, (i2 & 4) != 0 ? null : function1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Focusable3(InteractionSource3 interactionSource3, int i, Function1<? super Boolean, Unit> function1) {
        this.interactionSource = interactionSource3;
        this.onFocusChange = function1;
        this.focusTargetNode = (FocusTargetModifierNode) delegate(FocusTargetModifierNode2.m6501FocusTargetModifierNodePYyLHbc(i, new Focusable5(this)));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* compiled from: Focusable.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Landroidx/compose/foundation/FocusableNode$TraverseKey;", "", "()V", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.foundation.FocusableNode$TraverseKey */
    /* loaded from: classes4.dex */
    private static final class TraverseKey {
        public /* synthetic */ TraverseKey(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TraverseKey() {
        }
    }

    @Override // androidx.compose.p011ui.node.TraversableNode
    public Object getTraverseKey() {
        return TraverseKey;
    }

    private final FocusedBounds getFocusedBoundsObserver() {
        if (getIsAttached()) {
            TraversableNode traversableNodeFindNearestAncestor = TraversableNode3.findNearestAncestor(this, FocusedBounds.INSTANCE);
            if (traversableNodeFindNearestAncestor instanceof FocusedBounds) {
                return (FocusedBounds) traversableNodeFindNearestAncestor;
            }
        }
        return null;
    }

    public final void update(InteractionSource3 interactionSource) {
        if (Intrinsics.areEqual(this.interactionSource, interactionSource)) {
            return;
        }
        disposeInteractionSource();
        this.interactionSource = interactionSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState previousState, FocusState currentState) {
        boolean zIsFocused;
        if (getIsAttached() && (zIsFocused = currentState.isFocused()) != previousState.isFocused()) {
            Function1<Boolean, Unit> function1 = this.onFocusChange;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(zIsFocused));
            }
            if (zIsFocused) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C10421(null), 3, null);
                PinnableContainer pinnableContainerRetrievePinnableContainer = retrievePinnableContainer();
                this.pinnedHandle = pinnableContainerRetrievePinnableContainer != null ? pinnableContainerRetrievePinnableContainer.pin() : null;
                notifyObserverWhenAttached();
            } else {
                PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
                if (pinnedHandle != null) {
                    pinnedHandle.release();
                }
                this.pinnedHandle = null;
                FocusedBounds focusedBoundsObserver = getFocusedBoundsObserver();
                if (focusedBoundsObserver != null) {
                    focusedBoundsObserver.onFocusBoundsChanged(null);
                }
            }
            SemanticsModifierNode2.invalidateSemantics(this);
            emitInteraction(zIsFocused);
        }
    }

    /* compiled from: Focusable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.FocusableNode$onFocusStateChange$1", m3645f = "Focusable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.FocusableNode$onFocusStateChange$1 */
    /* loaded from: classes4.dex */
    static final class C10421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C10421(Continuation<? super C10421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Focusable3.this.new C10421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Focusable3 focusable3 = Focusable3.this;
                this.label = 1;
                if (BringIntoViewModifierNode2.bringIntoView$default(focusable3, null, this, 1, null) == coroutine_suspended) {
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

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.focusTargetNode.getFocusState().isFocused());
        if (this.requestFocus == null) {
            this.requestFocus = new Function0<Boolean>() { // from class: androidx.compose.foundation.FocusableNode.applySemantics.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(FocusTargetModifierNode.m6499requestFocus3ESFkO8$default(Focusable3.this.focusTargetNode, 0, 1, null));
                }
            };
        }
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, this.requestFocus, 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
    }

    @Override // androidx.compose.p011ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        PinnableContainer pinnableContainerRetrievePinnableContainer = retrievePinnableContainer();
        if (this.focusTargetNode.getFocusState().isFocused()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.pinnedHandle = pinnableContainerRetrievePinnableContainer != null ? pinnableContainerRetrievePinnableContainer.pin() : null;
        }
    }

    @Override // androidx.compose.p011ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        this.globalLayoutCoordinates = coordinates;
        if (this.focusTargetNode.getFocusState().isFocused()) {
            if (coordinates.isAttached()) {
                notifyObserverWhenAttached();
                return;
            }
            FocusedBounds focusedBoundsObserver = getFocusedBoundsObserver();
            if (focusedBoundsObserver != null) {
                focusedBoundsObserver.onFocusBoundsChanged(null);
            }
        }
    }

    private final PinnableContainer retrievePinnableContainer() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ObserverModifierNode2.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.FocusableNode.retrievePinnableContainer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                objectRef.element = CompositionLocalConsumerModifierNode2.currentValueOf(this, PinnableContainer2.getLocalPinnableContainer());
            }
        });
        return (PinnableContainer) objectRef.element;
    }

    private final void notifyObserverWhenAttached() {
        FocusedBounds focusedBoundsObserver;
        LayoutCoordinates layoutCoordinates = this.globalLayoutCoordinates;
        if (layoutCoordinates != null) {
            Intrinsics.checkNotNull(layoutCoordinates);
            if (!layoutCoordinates.isAttached() || (focusedBoundsObserver = getFocusedBoundsObserver()) == null) {
                return;
            }
            focusedBoundsObserver.onFocusBoundsChanged(this.globalLayoutCoordinates);
        }
    }

    private final void emitInteraction(boolean isFocused) {
        InteractionSource3 interactionSource3 = this.interactionSource;
        if (interactionSource3 != null) {
            if (isFocused) {
                FocusInteraction focusInteraction = this.focusedInteraction;
                if (focusInteraction != null) {
                    emitWithFallback(interactionSource3, new FocusInteraction2(focusInteraction));
                    this.focusedInteraction = null;
                }
                FocusInteraction focusInteraction2 = new FocusInteraction();
                emitWithFallback(interactionSource3, focusInteraction2);
                this.focusedInteraction = focusInteraction2;
                return;
            }
            FocusInteraction focusInteraction3 = this.focusedInteraction;
            if (focusInteraction3 != null) {
                emitWithFallback(interactionSource3, new FocusInteraction2(focusInteraction3));
                this.focusedInteraction = null;
            }
        }
    }

    private final void disposeInteractionSource() {
        FocusInteraction focusInteraction;
        InteractionSource3 interactionSource3 = this.interactionSource;
        if (interactionSource3 != null && (focusInteraction = this.focusedInteraction) != null) {
            interactionSource3.tryEmit(new FocusInteraction2(focusInteraction));
        }
        this.focusedInteraction = null;
    }

    private final void emitWithFallback(final InteractionSource3 interactionSource3, final Interaction interaction) {
        if (getIsAttached()) {
            Job job = (Job) getCoroutineScope().getCoroutineContext().get(Job.INSTANCE);
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C10411(interactionSource3, interaction, job != null ? job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.FocusableNode$emitWithFallback$handler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    interactionSource3.tryEmit(interaction);
                }
            }) : null, null), 3, null);
        } else {
            interactionSource3.tryEmit(interaction);
        }
    }

    /* compiled from: Focusable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", m3645f = "Focusable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.FocusableNode$emitWithFallback$1 */
    /* loaded from: classes4.dex */
    static final class C10411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Job4 $handler;
        final /* synthetic */ Interaction $interaction;
        final /* synthetic */ InteractionSource3 $this_emitWithFallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10411(InteractionSource3 interactionSource3, Interaction interaction, Job4 job4, Continuation<? super C10411> continuation) {
            super(2, continuation);
            this.$this_emitWithFallback = interactionSource3;
            this.$interaction = interaction;
            this.$handler = job4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10411(this.$this_emitWithFallback, this.$interaction, this.$handler, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InteractionSource3 interactionSource3 = this.$this_emitWithFallback;
                Interaction interaction = this.$interaction;
                this.label = 1;
                if (interactionSource3.emit(interaction, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Job4 job4 = this.$handler;
            if (job4 != null) {
                job4.dispose();
            }
            return Unit.INSTANCE;
        }
    }
}
