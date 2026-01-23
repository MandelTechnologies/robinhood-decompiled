package com.robinhood.utils.p409ui.edge2edge;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OverrideSystemBarsStyle.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"OverrideSystemBarsStyle", "", "isLight", "", "(ZLandroidx/compose/runtime/Composer;I)V", "OverrideStatusBarStyle", "OverrideNavigationBarStyle", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class OverrideSystemBarsStyle {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverrideNavigationBarStyle$lambda$10(boolean z, int i, Composer composer, int i2) {
        OverrideNavigationBarStyle(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverrideNavigationBarStyle$lambda$14(boolean z, int i, Composer composer, int i2) {
        OverrideNavigationBarStyle(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverrideStatusBarStyle$lambda$5(boolean z, int i, Composer composer, int i2) {
        OverrideStatusBarStyle(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverrideStatusBarStyle$lambda$9(boolean z, int i, Composer composer, int i2) {
        OverrideStatusBarStyle(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverrideSystemBarsStyle$lambda$0(boolean z, int i, Composer composer, int i2) {
        OverrideSystemBarsStyle(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverrideSystemBarsStyle$lambda$4(boolean z, int i, Composer composer, int i2) {
        OverrideSystemBarsStyle(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OverrideSystemBarsStyle(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1435706424);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1435706424, i2, -1, "com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyle (OverrideSystemBarsStyle.kt:9)");
            }
            final EdgeToEdgeHost edgeToEdgeHost = (EdgeToEdgeHost) composerStartRestartGroup.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
            if (edgeToEdgeHost == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OverrideSystemBarsStyle.OverrideSystemBarsStyle$lambda$0(z, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i3 = i2 & 14;
            boolean zChangedInstance = (i3 == 4) | composerStartRestartGroup.changedInstance(edgeToEdgeHost);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OverrideSystemBarsStyle.OverrideSystemBarsStyle$lambda$3$lambda$2(edgeToEdgeHost, z, (LifecycleStartStopEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LifecycleEffectKt.LifecycleStartEffect(boolValueOf, (LifecycleOwner) null, (Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i3, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OverrideSystemBarsStyle.OverrideSystemBarsStyle$lambda$4(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleStopOrDisposeEffectResult OverrideSystemBarsStyle$lambda$3$lambda$2(final EdgeToEdgeHost edgeToEdgeHost, boolean z, final LifecycleStartStopEffectScope LifecycleStartEffect) {
        Intrinsics.checkNotNullParameter(LifecycleStartEffect, "$this$LifecycleStartEffect");
        edgeToEdgeHost.overrideSystemBarsStyle(z);
        return new LifecycleStopOrDisposeEffectResult() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$OverrideSystemBarsStyle$lambda$3$lambda$2$$inlined$onStopOrDispose$1
            @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
            public void runStopOrDisposeEffect() {
                edgeToEdgeHost.resetSystemBarsStyleOverride();
            }
        };
    }

    public static final void OverrideStatusBarStyle(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-80883526);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-80883526, i2, -1, "com.robinhood.utils.ui.edge2edge.OverrideStatusBarStyle (OverrideSystemBarsStyle.kt:23)");
            }
            final EdgeToEdgeHost edgeToEdgeHost = (EdgeToEdgeHost) composerStartRestartGroup.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
            if (edgeToEdgeHost == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OverrideSystemBarsStyle.OverrideStatusBarStyle$lambda$5(z, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i3 = i2 & 14;
            boolean zChangedInstance = (i3 == 4) | composerStartRestartGroup.changedInstance(edgeToEdgeHost);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OverrideSystemBarsStyle.OverrideStatusBarStyle$lambda$8$lambda$7(edgeToEdgeHost, z, (LifecycleStartStopEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LifecycleEffectKt.LifecycleStartEffect(boolValueOf, (LifecycleOwner) null, (Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i3, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OverrideSystemBarsStyle.OverrideStatusBarStyle$lambda$9(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleStopOrDisposeEffectResult OverrideStatusBarStyle$lambda$8$lambda$7(final EdgeToEdgeHost edgeToEdgeHost, boolean z, final LifecycleStartStopEffectScope LifecycleStartEffect) {
        Intrinsics.checkNotNullParameter(LifecycleStartEffect, "$this$LifecycleStartEffect");
        edgeToEdgeHost.overrideStatusBarStyle(z);
        return new LifecycleStopOrDisposeEffectResult() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$OverrideStatusBarStyle$lambda$8$lambda$7$$inlined$onStopOrDispose$1
            @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
            public void runStopOrDisposeEffect() {
                edgeToEdgeHost.resetStatusBarStyleOverride();
            }
        };
    }

    public static final void OverrideNavigationBarStyle(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(285333340);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(285333340, i2, -1, "com.robinhood.utils.ui.edge2edge.OverrideNavigationBarStyle (OverrideSystemBarsStyle.kt:37)");
            }
            final EdgeToEdgeHost edgeToEdgeHost = (EdgeToEdgeHost) composerStartRestartGroup.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
            if (edgeToEdgeHost == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OverrideSystemBarsStyle.OverrideNavigationBarStyle$lambda$10(z, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i3 = i2 & 14;
            boolean zChangedInstance = (i3 == 4) | composerStartRestartGroup.changedInstance(edgeToEdgeHost);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OverrideSystemBarsStyle.OverrideNavigationBarStyle$lambda$13$lambda$12(edgeToEdgeHost, z, (LifecycleStartStopEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LifecycleEffectKt.LifecycleStartEffect(boolValueOf, (LifecycleOwner) null, (Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i3, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OverrideSystemBarsStyle.OverrideNavigationBarStyle$lambda$14(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleStopOrDisposeEffectResult OverrideNavigationBarStyle$lambda$13$lambda$12(final EdgeToEdgeHost edgeToEdgeHost, boolean z, final LifecycleStartStopEffectScope LifecycleStartEffect) {
        Intrinsics.checkNotNullParameter(LifecycleStartEffect, "$this$LifecycleStartEffect");
        edgeToEdgeHost.overrideNavigationBarStyle(z);
        return new LifecycleStopOrDisposeEffectResult() { // from class: com.robinhood.utils.ui.edge2edge.OverrideSystemBarsStyleKt$OverrideNavigationBarStyle$lambda$13$lambda$12$$inlined$onStopOrDispose$1
            @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
            public void runStopOrDisposeEffect() {
                edgeToEdgeHost.resetNavigationBarStyleOverride();
            }
        };
    }
}
