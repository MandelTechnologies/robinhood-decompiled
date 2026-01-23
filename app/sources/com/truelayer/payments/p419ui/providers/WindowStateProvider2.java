package com.truelayer.payments.p419ui.providers;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.truelayer.payments.p419ui.utils.Converters3;
import com.truelayer.payments.p419ui.utils.Navigation2;
import com.truelayer.payments.p419ui.utils.Navigation4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WindowStateProvider.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0081\u0001\u0010\u000f\u001a\u00020\r2b\b\u0002\u0010\u0007\u001a\\\u0012\u0004\u0012\u00020\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\n¢\u0006\u0002\b\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016*¸\u0001\b\u0000\u0010\u0017\"X\u0012\u0004\u0012\u00020\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000b2X\u0012\u0004\u0012\u00020\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000b¨\u0006\u001a²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lkotlin/Function4;", "Landroidx/compose/ui/Modifier;", "Lcom/truelayer/payments/ui/utils/NavigationRoute;", "Lkotlin/ParameterName;", "name", "state", "Landroidx/compose/animation/core/Transition;", NavTransition2.KEY_TRANSITION, "Lcom/truelayer/payments/ui/utils/Direction;", "direction", "Lcom/truelayer/payments/ui/providers/NavigationTransitionType;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/Function0;", "", "content", "WindowStateProvider", "(Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/truelayer/payments/ui/providers/WindowState;", "LocalWindowState", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalWindowState", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "NavigationTransitionType", "Landroidx/compose/ui/unit/Dp;", "topBarHeight", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.providers.WindowStateProviderKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class WindowStateProvider2 {
    private static final CompositionLocal6<WindowState> LocalWindowState = CompositionLocal3.staticCompositionLocalOf(new Function0<WindowState>() { // from class: com.truelayer.payments.ui.providers.WindowStateProviderKt$LocalWindowState$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final WindowState invoke() {
            return new WindowState(0.0f, 0.0f, 0.0f, null, null, 31, null);
        }
    });

    public static final CompositionLocal6<WindowState> getLocalWindowState() {
        return LocalWindowState;
    }

    public static final void WindowStateProvider(final Function4<? super Modifier, ? super Navigation4, ? super Transition<Navigation4>, ? super Navigation2, ? extends Modifier> function4, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1855310831);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function4) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                function4 = new Function4<Modifier, Navigation4, Transition<Navigation4>, Navigation2, Modifier.Companion>() { // from class: com.truelayer.payments.ui.providers.WindowStateProviderKt.WindowStateProvider.1
                    @Override // kotlin.jvm.functions.Function4
                    public final Modifier.Companion invoke(Modifier modifier, Navigation4 navigation4, Transition<Navigation4> transition, Navigation2 navigation2) {
                        Intrinsics.checkNotNullParameter(modifier, "$this$null");
                        Intrinsics.checkNotNullParameter(navigation4, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(transition, "<anonymous parameter 1>");
                        Intrinsics.checkNotNullParameter(navigation2, "<anonymous parameter 2>");
                        return Modifier.INSTANCE;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1855310831, i3, -1, "com.truelayer.payments.ui.providers.WindowStateProvider (WindowStateProvider.kt:51)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceableGroup(-969622042);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), SnapshotStateKt.structuralEqualityPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            BoxWithConstraints.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambda3.composableLambda(composerStartRestartGroup, 55508731, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.providers.WindowStateProviderKt.WindowStateProvider.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i5 & 14) == 0) {
                        i5 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((i5 & 91) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(55508731, i5, -1, "com.truelayer.payments.ui.providers.WindowStateProvider.<anonymous> (WindowStateProvider.kt:56)");
                        }
                        CompositionLocal6<WindowState> localWindowState = WindowStateProvider2.getLocalWindowState();
                        float fMo5102getMaxHeightD9Ej5fM = BoxWithConstraints.mo5102getMaxHeightD9Ej5fM();
                        float fMo5103getMaxWidthD9Ej5fM = BoxWithConstraints.mo5103getMaxWidthD9Ej5fM();
                        float fWindowStateProvider$lambda$1 = WindowStateProvider2.WindowStateProvider$lambda$1(snapshotState);
                        composer2.startReplaceableGroup(1428629723);
                        boolean zChanged = composer2.changed(density);
                        final Density density2 = density;
                        final SnapshotState<C2002Dp> snapshotState2 = snapshotState;
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<IntSize, Unit>() { // from class: com.truelayer.payments.ui.providers.WindowStateProviderKt$WindowStateProvider$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                    m27083invokeozmzZPI(intSize.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                public final void m27083invokeozmzZPI(long j) {
                                    WindowStateProvider2.WindowStateProvider$lambda$2(snapshotState2, Converters3.intoDp(IntSize.m8059getHeightimpl(j), density2));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CompositionLocal3.CompositionLocalProvider(localWindowState.provides(new WindowState(fMo5103getMaxWidthD9Ej5fM, fMo5102getMaxHeightD9Ej5fM, fWindowStateProvider$lambda$1, (Function1) objRememberedValue2, function4, null)), content, composer2, ProvidedValue.$stable);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.providers.WindowStateProviderKt.WindowStateProvider.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    WindowStateProvider2.WindowStateProvider(function4, content, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WindowStateProvider$lambda$2(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WindowStateProvider$lambda$1(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }
}
