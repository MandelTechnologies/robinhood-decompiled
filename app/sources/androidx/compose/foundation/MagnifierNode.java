package androidx.compose.foundation;

import android.view.View;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.DelegatableNode_androidKt;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.compose.p011ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p011ui.node.ObserverModifierNode;
import androidx.compose.p011ui.node.ObserverModifierNode2;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Dp5;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel5;

/* compiled from: Magnifier.android.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u009b\u0001\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0092\u0001\u0010\"\u001a\u00020\r2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t2\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u001dJ\u0013\u0010'\u001a\u00020\r*\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020\r*\u00020-H\u0016¢\u0006\u0004\b.\u0010/R3\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R5\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00100\u001a\u0004\b5\u00102\"\u0004\b6\u00104R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u00104R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u00109\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R(\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u00109\u001a\u0004\bJ\u0010;\"\u0004\bK\u0010=R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010>\u001a\u0004\bL\u0010@\"\u0004\bM\u0010BR\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR/\u0010a\u001a\u0004\u0018\u00010)2\b\u0010[\u001a\u0004\u0018\u00010)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010,R\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001c\u0010e\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\be\u0010CR\u001e\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bg\u0010hR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001a\u0010m\u001a\u00020\b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bl\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006n"}, m3636d2 = {"Landroidx/compose/foundation/MagnifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "recreateMagnifier", "()V", "updateMagnifier", "updateSizeIfNecessary", "update-5F03MCQ", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "update", "onAttach", "onDetach", "onObservedReadsChanged", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Lkotlin/jvm/functions/Function1;", "getSourceCenter", "()Lkotlin/jvm/functions/Function1;", "setSourceCenter", "(Lkotlin/jvm/functions/Function1;)V", "getMagnifierCenter", "setMagnifierCenter", "getOnSizeChanged", "setOnSizeChanged", "F", "getZoom", "()F", "setZoom", "(F)V", "Z", "getUseTextDefault", "()Z", "setUseTextDefault", "(Z)V", "J", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "getCornerRadius-D9Ej5fM", "setCornerRadius-0680j_4", "getElevation-D9Ej5fM", "setElevation-0680j_4", "getClippingEnabled", "setClippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "getPlatformMagnifierFactory", "()Landroidx/compose/foundation/PlatformMagnifierFactory;", "setPlatformMagnifierFactory", "(Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/foundation/PlatformMagnifier;", "magnifier", "Landroidx/compose/foundation/PlatformMagnifier;", "<set-?>", "layoutCoordinates$delegate", "Landroidx/compose/runtime/MutableState;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "layoutCoordinates", "Landroidx/compose/runtime/State;", "anchorPositionInRootState", "Landroidx/compose/runtime/State;", "sourceCenterInRoot", "Landroidx/compose/ui/unit/IntSize;", "previousSize", "Landroidx/compose/ui/unit/IntSize;", "Lkotlinx/coroutines/channels/Channel;", "drawSignalChannel", "Lkotlinx/coroutines/channels/Channel;", "getAnchorPositionInRoot-F1C5BW0", "anchorPositionInRoot", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    private SnapshotState4<Offset> anchorPositionInRootState;
    private boolean clippingEnabled;
    private float cornerRadius;
    private Density density;
    private Channel<Unit> drawSignalChannel;
    private float elevation;

    /* renamed from: layoutCoordinates$delegate, reason: from kotlin metadata */
    private final SnapshotState layoutCoordinates;
    private PlatformMagnifier magnifier;
    private Function1<? super Density, Offset> magnifierCenter;
    private Function1<? super Dp5, Unit> onSizeChanged;
    private PlatformMagnifierFactory platformMagnifierFactory;
    private IntSize previousSize;
    private long size;
    private Function1<? super Density, Offset> sourceCenter;
    private long sourceCenterInRoot;
    private boolean useTextDefault;
    private View view;
    private float zoom;

    public /* synthetic */ MagnifierNode(Function1 function1, Function1 function12, Function1 function13, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f, z, j, f2, f3, z2, platformMagnifierFactory);
    }

    private MagnifierNode(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, Function1<? super Dp5, Unit> function13, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = function1;
        this.magnifierCenter = function12;
        this.onSizeChanged = function13;
        this.zoom = f;
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f2;
        this.elevation = f3;
        this.clippingEnabled = z2;
        this.platformMagnifierFactory = platformMagnifierFactory;
        this.layoutCoordinates = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.sourceCenterInRoot = Offset.INSTANCE.m6552getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getLayoutCoordinates() {
        return (LayoutCoordinates) this.layoutCoordinates.getValue();
    }

    private final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates.setValue(layoutCoordinates);
    }

    /* renamed from: getAnchorPositionInRoot-F1C5BW0, reason: not valid java name */
    private final long m4913getAnchorPositionInRootF1C5BW0() {
        if (this.anchorPositionInRootState == null) {
            this.anchorPositionInRootState = SnapshotStateKt.derivedStateOf(new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierNode$anchorPositionInRoot$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.m6534boximpl(m4915invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m4915invokeF1C5BW0() {
                    LayoutCoordinates layoutCoordinates = this.this$0.getLayoutCoordinates();
                    return layoutCoordinates != null ? LayoutCoordinates2.positionInRoot(layoutCoordinates) : Offset.INSTANCE.m6552getUnspecifiedF1C5BW0();
                }
            });
        }
        SnapshotState4<Offset> snapshotState4 = this.anchorPositionInRootState;
        return snapshotState4 != null ? snapshotState4.getValue().getPackedValue() : Offset.INSTANCE.m6552getUnspecifiedF1C5BW0();
    }

    /* renamed from: update-5F03MCQ, reason: not valid java name */
    public final void m4914update5F03MCQ(Function1<? super Density, Offset> sourceCenter, Function1<? super Density, Offset> magnifierCenter, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, Function1<? super Dp5, Unit> onSizeChanged, PlatformMagnifierFactory platformMagnifierFactory) {
        float f = this.zoom;
        long j = this.size;
        float f2 = this.cornerRadius;
        boolean z = this.useTextDefault;
        float f3 = this.elevation;
        boolean z2 = this.clippingEnabled;
        PlatformMagnifierFactory platformMagnifierFactory2 = this.platformMagnifierFactory;
        View view = this.view;
        Density density = this.density;
        this.sourceCenter = sourceCenter;
        this.magnifierCenter = magnifierCenter;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.onSizeChanged = onSizeChanged;
        this.platformMagnifierFactory = platformMagnifierFactory;
        View viewRequireView = DelegatableNode_androidKt.requireView(this);
        Density densityRequireDensity = DelegatableNode2.requireDensity(this);
        if (this.magnifier != null && ((!Magnifier_androidKt.equalsIncludingNaN(zoom, f) && !platformMagnifierFactory.getCanUpdateZoom()) || !Dp5.m8022equalsimpl0(size, j) || !C2002Dp.m7997equalsimpl0(cornerRadius, f2) || !C2002Dp.m7997equalsimpl0(elevation, f3) || useTextDefault != z || clippingEnabled != z2 || !Intrinsics.areEqual(platformMagnifierFactory, platformMagnifierFactory2) || !Intrinsics.areEqual(viewRequireView, view) || !Intrinsics.areEqual(densityRequireDensity, density))) {
            recreateMagnifier();
        }
        updateMagnifier();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.drawSignalChannel = Channel4.Channel$default(0, null, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new C10501(null), 1, null);
    }

    /* compiled from: Magnifier.android.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.MagnifierNode$onAttach$1", m3645f = "Magnifier.android.kt", m3646l = {382, 386}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MagnifierNode$onAttach$1 */
    /* loaded from: classes4.dex */
    static final class C10501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C10501(Continuation<? super C10501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MagnifierNode.this.new C10501(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            if (androidx.compose.runtime.MonotonicFrameClock2.withFrameMillis(r5, r4) == r0) goto L20;
         */
        /* JADX WARN: Path cross not found for [B:13:0x0029, B:16:0x0032], limit reached: 23 */
        /* JADX WARN: Path cross not found for [B:16:0x0032, B:13:0x0029], limit reached: 23 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0038 -> B:11:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0042 -> B:21:0x0045). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Channel channel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                channel = MagnifierNode.this.drawSignalChannel;
                if (channel != null) {
                }
                if (MagnifierNode.this.magnifier != null) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                if (MagnifierNode.this.magnifier != null) {
                }
                return coroutine_suspended;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlatformMagnifier platformMagnifier = MagnifierNode.this.magnifier;
            if (platformMagnifier != null) {
                platformMagnifier.updateContent();
            }
            channel = MagnifierNode.this.drawSignalChannel;
            if (channel != null) {
                this.label = 1;
                if (channel.receive(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (MagnifierNode.this.magnifier != null) {
                channel = MagnifierNode.this.drawSignalChannel;
                if (channel != null) {
                }
                if (MagnifierNode.this.magnifier != null) {
                }
            } else {
                AnonymousClass1 anonymousClass1 = new Function1<Long, Unit>() { // from class: androidx.compose.foundation.MagnifierNode.onAttach.1.1
                    public final void invoke(long j) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                        invoke(l.longValue());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 2;
            }
            return coroutine_suspended;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.magnifier = null;
    }

    @Override // androidx.compose.p011ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNode2.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.MagnifierNode.onObservedReadsChanged.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MagnifierNode.this.updateMagnifier();
            }
        });
    }

    private final void recreateMagnifier() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View viewRequireView = this.view;
        if (viewRequireView == null) {
            viewRequireView = DelegatableNode_androidKt.requireView(this);
        }
        View view = viewRequireView;
        this.view = view;
        Density densityRequireDensity = this.density;
        if (densityRequireDensity == null) {
            densityRequireDensity = DelegatableNode2.requireDensity(this);
        }
        Density density = densityRequireDensity;
        this.density = density;
        this.magnifier = this.platformMagnifierFactory.mo4922createnHHXs2Y(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density, this.zoom);
        updateSizeIfNecessary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateMagnifier() {
        long jM6552getUnspecifiedF1C5BW0;
        Density densityRequireDensity = this.density;
        if (densityRequireDensity == null) {
            densityRequireDensity = DelegatableNode2.requireDensity(this);
            this.density = densityRequireDensity;
        }
        long packedValue = this.sourceCenter.invoke(densityRequireDensity).getPackedValue();
        if ((packedValue & 9223372034707292159L) != 9205357640488583168L && (m4913getAnchorPositionInRootF1C5BW0() & 9223372034707292159L) != 9205357640488583168L) {
            this.sourceCenterInRoot = Offset.m6547plusMKHz9U(m4913getAnchorPositionInRootF1C5BW0(), packedValue);
            Function1<? super Density, Offset> function1 = this.magnifierCenter;
            if (function1 != null) {
                Offset offsetM6534boximpl = Offset.m6534boximpl(function1.invoke(densityRequireDensity).getPackedValue());
                if ((offsetM6534boximpl.getPackedValue() & 9223372034707292159L) == 9205357640488583168L) {
                    offsetM6534boximpl = null;
                }
                if (offsetM6534boximpl != null) {
                    jM6552getUnspecifiedF1C5BW0 = Offset.m6547plusMKHz9U(m4913getAnchorPositionInRootF1C5BW0(), offsetM6534boximpl.getPackedValue());
                } else {
                    jM6552getUnspecifiedF1C5BW0 = Offset.INSTANCE.m6552getUnspecifiedF1C5BW0();
                }
            }
            long j = jM6552getUnspecifiedF1C5BW0;
            if (this.magnifier == null) {
                recreateMagnifier();
            }
            PlatformMagnifier platformMagnifier = this.magnifier;
            if (platformMagnifier != null) {
                platformMagnifier.mo4921updateWko1d7g(this.sourceCenterInRoot, j, this.zoom);
            }
            updateSizeIfNecessary();
            return;
        }
        this.sourceCenterInRoot = Offset.INSTANCE.m6552getUnspecifiedF1C5BW0();
        PlatformMagnifier platformMagnifier2 = this.magnifier;
        if (platformMagnifier2 != null) {
            platformMagnifier2.dismiss();
        }
    }

    private final void updateSizeIfNecessary() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null || IntSize.m8057equalsimpl(platformMagnifier.mo4920getSizeYbymL2g(), this.previousSize)) {
            return;
        }
        Function1<? super Dp5, Unit> function1 = this.onSizeChanged;
        if (function1 != null) {
            function1.invoke(Dp5.m8017boximpl(density.mo5014toDpSizekrfVVM(IntSize2.m8067toSizeozmzZPI(platformMagnifier.mo4920getSizeYbymL2g()))));
        }
        this.previousSize = IntSize.m8055boximpl(platformMagnifier.mo4920getSizeYbymL2g());
    }

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        Channel<Unit> channel = this.drawSignalChannel;
        if (channel != null) {
            Channel5.m28802boximpl(channel.mo8337trySendJP2dKIU(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.p011ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        setLayoutCoordinates(coordinates);
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(Magnifier_androidKt.getMagnifierPositionInRoot(), new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierNode.applySemantics.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Offset invoke() {
                return Offset.m6534boximpl(m4916invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m4916invokeF1C5BW0() {
                return MagnifierNode.this.sourceCenterInRoot;
            }
        });
    }
}
