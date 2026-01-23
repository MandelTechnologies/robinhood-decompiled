package com.truelayer.payments.p419ui.components.animators;

import androidx.compose.animation.core.Transition;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.truelayer.payments.p419ui.theme.Transitions4;
import com.truelayer.payments.p419ui.utils.Navigation2;
import com.truelayer.payments.p419ui.utils.Navigation4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NavigationAnimator.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a¸\u0001\u0010\u0012\u001a\u00020\u0010\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052`\b\u0002\u0010\u000e\u001aZ\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\r2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/NavigationRoute;", "T", "next", "Lcom/truelayer/payments/ui/utils/Direction;", "direction", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "state", "Landroidx/compose/animation/core/Transition;", NavTransition2.KEY_TRANSITION, "Lkotlin/ExtensionFunctionType;", "animator", "Lkotlin/Function1;", "", "content", "NavigationAnimator", "(Lcom/truelayer/payments/ui/utils/NavigationRoute;Lcom/truelayer/payments/ui/utils/Direction;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.animators.NavigationAnimatorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class NavigationAnimator {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends Navigation4> void NavigationAnimator(final T next, final Navigation2 direction, Modifier modifier, Function4<? super Modifier, ? super T, ? super Transition<Navigation4>, ? super Navigation2, ? extends Modifier> function4, final Function3<? super T, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        int i4;
        final Function4<? super Modifier, ? super T, ? super Transition<Navigation4>, ? super Navigation2, ? extends Modifier> function42;
        Modifier modifier3;
        boolean z;
        boolean z2;
        Object objRememberedValue;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2143846630);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(next) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(direction) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    function42 = function4;
                    i3 |= composerStartRestartGroup.changedInstance(function42) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
                }
                if ((46811 & i3) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        function42 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2143846630, i3, -1, "com.truelayer.payments.ui.components.animators.NavigationAnimator (NavigationAnimator.kt:26)");
                    }
                    if (direction != Navigation2.Back) {
                        modifier3 = modifier5;
                        z = true;
                    } else {
                        modifier3 = modifier5;
                        z = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(192721740);
                    z2 = ((i3 & 7168) != 2048) | ((i3 & 112) == 32);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function3<Modifier, T, Transition<T>, Modifier>() { // from class: com.truelayer.payments.ui.components.animators.NavigationAnimatorKt$NavigationAnimator$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/Modifier;TT;Landroidx/compose/animation/core/Transition<TT;>;)Landroidx/compose/ui/Modifier; */
                            @Override // kotlin.jvm.functions.Function3
                            public final Modifier invoke(Modifier CrossAnimator, Navigation4 current, Transition transition) {
                                Modifier modifierInvoke;
                                Intrinsics.checkNotNullParameter(CrossAnimator, "$this$CrossAnimator");
                                Intrinsics.checkNotNullParameter(current, "current");
                                Intrinsics.checkNotNullParameter(transition, "transition");
                                Function4<Modifier, T, Transition<Navigation4>, Navigation2, Modifier> function43 = function42;
                                return (function43 == null || (modifierInvoke = function43.invoke(CrossAnimator, current, transition, direction)) == null) ? Transitions4.themedNavigationTransition(CrossAnimator, current, transition, direction) : modifierInvoke;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ComposableLambda composableLambda = ComposableLambda3.composableLambda(composerStartRestartGroup, -1758914876, true, new Function3<T, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.animators.NavigationAnimatorKt.NavigationAnimator.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer2, Integer num) {
                            invoke((Navigation4) obj, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Incorrect types in method signature: (TT;Landroidx/compose/runtime/Composer;I)V */
                        public final void invoke(Navigation4 route, Composer composer2, int i6) {
                            Intrinsics.checkNotNullParameter(route, "route");
                            if ((i6 & 14) == 0) {
                                i6 |= composer2.changed(route) ? 4 : 2;
                            }
                            if ((i6 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1758914876, i6, -1, "com.truelayer.payments.ui.components.animators.NavigationAnimator.<anonymous> (NavigationAnimator.kt:39)");
                            }
                            content.invoke(route, composer2, Integer.valueOf((i6 & 14) | (i3 & 8)));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i6 = (i3 & 896) | (i3 & 8) | 24576 | (i3 & 14);
                    Modifier modifier6 = modifier3;
                    CrossAnimator2.CrossAnimator(next, (Function3) objRememberedValue, modifier6, z, composableLambda, composerStartRestartGroup, i6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                }
                final Function4<? super Modifier, ? super T, ? super Transition<Navigation4>, ? super Navigation2, ? extends Modifier> function43 = function42;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.animators.NavigationAnimatorKt.NavigationAnimator.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Incorrect types in method signature: (TT;Lcom/truelayer/payments/ui/utils/Direction;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4<-Landroidx/compose/ui/Modifier;-TT;-Landroidx/compose/animation/core/Transition<Lcom/truelayer/payments/ui/utils/NavigationRoute;>;-Lcom/truelayer/payments/ui/utils/Direction;+Landroidx/compose/ui/Modifier;>;Lkotlin/jvm/functions/Function3<-TT;-Landroidx/compose/runtime/Composer;-Ljava/lang/Integer;Lkotlin/Unit;>;II)V */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            NavigationAnimator.NavigationAnimator(next, direction, modifier4, function43, content, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function42 = function4;
            if ((i2 & 16) != 0) {
            }
            if ((46811 & i3) != 9362) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (direction != Navigation2.Back) {
                }
                composerStartRestartGroup.startReplaceableGroup(192721740);
                z2 = ((i3 & 7168) != 2048) | ((i3 & 112) == 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2) {
                    objRememberedValue = new Function3<Modifier, T, Transition<T>, Modifier>() { // from class: com.truelayer.payments.ui.components.animators.NavigationAnimatorKt$NavigationAnimator$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/Modifier;TT;Landroidx/compose/animation/core/Transition<TT;>;)Landroidx/compose/ui/Modifier; */
                        @Override // kotlin.jvm.functions.Function3
                        public final Modifier invoke(Modifier CrossAnimator, Navigation4 current, Transition transition) {
                            Modifier modifierInvoke;
                            Intrinsics.checkNotNullParameter(CrossAnimator, "$this$CrossAnimator");
                            Intrinsics.checkNotNullParameter(current, "current");
                            Intrinsics.checkNotNullParameter(transition, "transition");
                            Function4<Modifier, T, Transition<Navigation4>, Navigation2, Modifier> function432 = function42;
                            return (function432 == null || (modifierInvoke = function432.invoke(CrossAnimator, current, transition, direction)) == null) ? Transitions4.themedNavigationTransition(CrossAnimator, current, transition, direction) : modifierInvoke;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceableGroup();
                    ComposableLambda composableLambda2 = ComposableLambda3.composableLambda(composerStartRestartGroup, -1758914876, true, new Function3<T, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.animators.NavigationAnimatorKt.NavigationAnimator.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer2, Integer num) {
                            invoke((Navigation4) obj, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Incorrect types in method signature: (TT;Landroidx/compose/runtime/Composer;I)V */
                        public final void invoke(Navigation4 route, Composer composer2, int i62) {
                            Intrinsics.checkNotNullParameter(route, "route");
                            if ((i62 & 14) == 0) {
                                i62 |= composer2.changed(route) ? 4 : 2;
                            }
                            if ((i62 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1758914876, i62, -1, "com.truelayer.payments.ui.components.animators.NavigationAnimator.<anonymous> (NavigationAnimator.kt:39)");
                            }
                            content.invoke(route, composer2, Integer.valueOf((i62 & 14) | (i3 & 8)));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i62 = (i3 & 896) | (i3 & 8) | 24576 | (i3 & 14);
                    Modifier modifier62 = modifier3;
                    CrossAnimator2.CrossAnimator(next, (Function3) objRememberedValue, modifier62, z, composableLambda2, composerStartRestartGroup, i62, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier62;
                }
            }
            final Function4 function432 = function42;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function42 = function4;
        if ((i2 & 16) != 0) {
        }
        if ((46811 & i3) != 9362) {
        }
        final Function4 function4322 = function42;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
