package com.truelayer.payments.p419ui.providers;

import androidx.compose.animation.core.Transition;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.IntSize;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.truelayer.payments.p419ui.utils.Navigation2;
import com.truelayer.payments.p419ui.utils.Navigation4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WindowStateProvider.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012b\b\u0002\u0010\n\u001a\\\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\u0014¢\u0006\u0002\b\u0015¢\u0006\u0002\u0010\u0016J\u0016\u0010 \u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0016\u0010\"\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0018J\u0016\u0010$\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0018J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003Jc\u0010'\u001a\\\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\u0014¢\u0006\u0002\b\u0015HÆ\u0003J«\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072b\b\u0002\u0010\n\u001a\\\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\u0014¢\u0006\u0002\b\u0015HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018Rk\u0010\n\u001a\\\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\u0014¢\u0006\u0002\b\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001f\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, m3636d2 = {"Lcom/truelayer/payments/ui/providers/WindowState;", "", "width", "Landroidx/compose/ui/unit/Dp;", "height", "topBarHeight", "setTopBar", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", NavTransition2.KEY_TRANSITION, "Lkotlin/Function4;", "Landroidx/compose/ui/Modifier;", "Lcom/truelayer/payments/ui/utils/NavigationRoute;", "Lkotlin/ParameterName;", "name", "state", "Landroidx/compose/animation/core/Transition;", "Lcom/truelayer/payments/ui/utils/Direction;", "direction", "Lcom/truelayer/payments/ui/providers/NavigationTransitionType;", "Lkotlin/ExtensionFunctionType;", "(FFFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeight-D9Ej5fM", "()F", "F", "getSetTopBar", "()Lkotlin/jvm/functions/Function1;", "getTopBarHeight-D9Ej5fM", "getTransition", "()Lkotlin/jvm/functions/Function4;", "getWidth-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component5", "copy", "copy-Ynw60rg", "(FFFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)Lcom/truelayer/payments/ui/providers/WindowState;", "equals", "", "other", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class WindowState {
    public static final int $stable = 0;
    private final float height;
    private final Function1<IntSize, Unit> setTopBar;
    private final float topBarHeight;
    private final Function4<Modifier, Navigation4, Transition<Navigation4>, Navigation2, Modifier> transition;
    private final float width;

    public /* synthetic */ WindowState(float f, float f2, float f3, Function1 function1, Function4 function4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, function1, function4);
    }

    /* renamed from: copy-Ynw60rg$default, reason: not valid java name */
    public static /* synthetic */ WindowState m27074copyYnw60rg$default(WindowState windowState, float f, float f2, float f3, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = windowState.width;
        }
        if ((i & 2) != 0) {
            f2 = windowState.height;
        }
        if ((i & 4) != 0) {
            f3 = windowState.topBarHeight;
        }
        if ((i & 8) != 0) {
            function1 = windowState.setTopBar;
        }
        if ((i & 16) != 0) {
            function4 = windowState.transition;
        }
        Function4 function42 = function4;
        float f4 = f3;
        return windowState.m27078copyYnw60rg(f, f2, f4, function1, function42);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopBarHeight() {
        return this.topBarHeight;
    }

    public final Function1<IntSize, Unit> component4() {
        return this.setTopBar;
    }

    public final Function4<Modifier, Navigation4, Transition<Navigation4>, Navigation2, Modifier> component5() {
        return this.transition;
    }

    /* renamed from: copy-Ynw60rg, reason: not valid java name */
    public final WindowState m27078copyYnw60rg(float width, float height, float topBarHeight, Function1<? super IntSize, Unit> setTopBar, Function4<? super Modifier, ? super Navigation4, ? super Transition<Navigation4>, ? super Navigation2, ? extends Modifier> transition) {
        Intrinsics.checkNotNullParameter(setTopBar, "setTopBar");
        Intrinsics.checkNotNullParameter(transition, "transition");
        return new WindowState(width, height, topBarHeight, setTopBar, transition, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WindowState)) {
            return false;
        }
        WindowState windowState = (WindowState) other;
        return C2002Dp.m7997equalsimpl0(this.width, windowState.width) && C2002Dp.m7997equalsimpl0(this.height, windowState.height) && C2002Dp.m7997equalsimpl0(this.topBarHeight, windowState.topBarHeight) && Intrinsics.areEqual(this.setTopBar, windowState.setTopBar) && Intrinsics.areEqual(this.transition, windowState.transition);
    }

    public int hashCode() {
        return (((((((C2002Dp.m7998hashCodeimpl(this.width) * 31) + C2002Dp.m7998hashCodeimpl(this.height)) * 31) + C2002Dp.m7998hashCodeimpl(this.topBarHeight)) * 31) + this.setTopBar.hashCode()) * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "WindowState(width=" + C2002Dp.m7999toStringimpl(this.width) + ", height=" + C2002Dp.m7999toStringimpl(this.height) + ", topBarHeight=" + C2002Dp.m7999toStringimpl(this.topBarHeight) + ", setTopBar=" + this.setTopBar + ", transition=" + this.transition + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private WindowState(float f, float f2, float f3, Function1<? super IntSize, Unit> setTopBar, Function4<? super Modifier, ? super Navigation4, ? super Transition<Navigation4>, ? super Navigation2, ? extends Modifier> transition) {
        Intrinsics.checkNotNullParameter(setTopBar, "setTopBar");
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.width = f;
        this.height = f2;
        this.topBarHeight = f3;
        this.setTopBar = setTopBar;
        this.transition = transition;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m27081getWidthD9Ej5fM() {
        return this.width;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m27079getHeightD9Ej5fM() {
        return this.height;
    }

    /* renamed from: getTopBarHeight-D9Ej5fM, reason: not valid java name */
    public final float m27080getTopBarHeightD9Ej5fM() {
        return this.topBarHeight;
    }

    public final Function1<IntSize, Unit> getSetTopBar() {
        return this.setTopBar;
    }

    public final Function4<Modifier, Navigation4, Transition<Navigation4>, Navigation2, Modifier> getTransition() {
        return this.transition;
    }

    public /* synthetic */ WindowState(float f, float f2, float f3, Function1 function1, Function4 function4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2002Dp.m7995constructorimpl(0) : f, (i & 2) != 0 ? C2002Dp.m7995constructorimpl(0) : f2, (i & 4) != 0 ? C2002Dp.m7995constructorimpl(0) : f3, (i & 8) != 0 ? new Function1<IntSize, Unit>() { // from class: com.truelayer.payments.ui.providers.WindowState.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                m27082invokeozmzZPI(intSize.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m27082invokeozmzZPI(long j) {
                throw new IllegalStateException("Component must be wrapped in `WindowStateProvider`.");
            }
        } : function1, (i & 16) != 0 ? new Function4<Modifier, Navigation4, Transition<Navigation4>, Navigation2, Modifier.Companion>() { // from class: com.truelayer.payments.ui.providers.WindowState.2
            @Override // kotlin.jvm.functions.Function4
            public final Modifier.Companion invoke(Modifier modifier, Navigation4 navigation4, Transition<Navigation4> transition, Navigation2 navigation2) {
                Intrinsics.checkNotNullParameter(modifier, "$this$null");
                Intrinsics.checkNotNullParameter(navigation4, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(transition, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(navigation2, "<anonymous parameter 2>");
                return Modifier.INSTANCE;
            }
        } : function4, null);
    }
}
