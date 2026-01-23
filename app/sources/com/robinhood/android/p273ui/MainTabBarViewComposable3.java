package com.robinhood.android.p273ui;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.compose.bento.component.BentoTabBar2;
import com.robinhood.compose.bento.component.BentoTabBarState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainTabBarViewComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"MainTabBarComposable", "", "duxo", "Lcom/robinhood/android/ui/MainTabBarDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "doAfterTabSelected", "Lkotlin/Function1;", "Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "(Lcom/robinhood/android/ui/MainTabBarDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-tab-ui_externalDebug", "viewState", "Lcom/robinhood/android/ui/MainTabBarViewState;", "showWatchlistTooltip", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.ui.MainTabBarViewComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class MainTabBarViewComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainTabBarComposable$lambda$14(MainTabBarDuxo mainTabBarDuxo, Modifier modifier, WindowInsets windowInsets, Function1 function1, int i, int i2, Composer composer, int i3) {
        MainTabBarComposable(mainTabBarDuxo, modifier, windowInsets, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainTabBarComposable$lambda$1$lambda$0(BentoTabBarState.Tab it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainTabBarComposable(final MainTabBarDuxo duxo, Modifier modifier, WindowInsets windowInsets, Function1<? super BentoTabBarState.Tab, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        WindowInsets windowInsets2;
        int i4;
        Function1<? super BentoTabBarState.Tab, Unit> function12;
        Modifier modifier3;
        WindowInsets windowInsetsWindowInsets$default;
        int i5;
        WindowInsets windowInsets3;
        final Function1<? super BentoTabBarState.Tab, Unit> function13;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        ImmutableList<BentoTabBarState.Tab> tabs;
        final EventLogger current;
        final Screen screen;
        boolean zChanged;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged2;
        Object objRememberedValue3;
        boolean zChangedInstance;
        Object objRememberedValue4;
        boolean zChangedInstance2;
        Object objRememberedValue5;
        final WindowInsets windowInsets4;
        final Modifier modifier4;
        final Function1<? super BentoTabBarState.Tab, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1896124752);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    windowInsets2 = windowInsets;
                    int i7 = composerStartRestartGroup.changed(windowInsets2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    windowInsets2 = windowInsets;
                }
                i3 |= i7;
            } else {
                windowInsets2 = windowInsets;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    windowInsets4 = windowInsets2;
                    function14 = function12;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) == 0) {
                            windowInsetsWindowInsets$default = WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null);
                            i3 &= -897;
                        } else {
                            windowInsetsWindowInsets$default = windowInsets2;
                        }
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return MainTabBarViewComposable3.MainTabBarComposable$lambda$1$lambda$0((BentoTabBarState.Tab) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            WindowInsets windowInsets5 = windowInsetsWindowInsets$default;
                            i5 = i3;
                            windowInsets3 = windowInsets5;
                            function13 = (Function1) objRememberedValue6;
                        } else {
                            WindowInsets windowInsets6 = windowInsetsWindowInsets$default;
                            i5 = i3;
                            windowInsets3 = windowInsets6;
                            function13 = function12;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                        function13 = function12;
                        i5 = i3;
                        windowInsets3 = windowInsets2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1896124752, i5, -1, "com.robinhood.android.ui.MainTabBarComposable (MainTabBarViewComposable.kt:30)");
                    }
                    int i8 = i5;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    tabs = MainTabBarComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle).getTabBarState().getTabs();
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(tabs) | composerStartRestartGroup.changedInstance(current);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new MainTabBarViewComposable4(tabs, current, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(tabs, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean boolValueOf = Boolean.valueOf(MainTabBarComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle).getShowWatchlistTabTooltip());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged2 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new MainTabBarViewComposable5(snapshotState4CollectAsStateWithLifecycle, snapshotState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                    BentoTabBarState tabBarState = MainTabBarComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle).getTabBarState();
                    float fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(duxo) | ((i8 & 7168) != 2048);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function2() { // from class: com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return MainTabBarViewComposable3.MainTabBarComposable$lambda$9$lambda$8(current, duxo, function13, snapshotState4CollectAsStateWithLifecycle, ((Integer) obj).intValue(), (BentoTabBarState.Tab) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function2 function2 = (Function2) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen) | composerStartRestartGroup.changedInstance(duxo);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function2() { // from class: com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return MainTabBarViewComposable3.MainTabBarComposable$lambda$13$lambda$12(snapshotState, current, screen, duxo, ((Integer) obj).intValue(), (BentoTabBarState.Tab) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier3;
                    WindowInsets windowInsets7 = windowInsets3;
                    BentoTabBar2.m20711BentoTabBarjIwJxvA(tabBarState, function2, modifier5, fM21592getMediumD9Ej5fM, windowInsets7, (Function2) objRememberedValue5, composerStartRestartGroup, BentoTabBarState.$stable | ((i8 << 3) & 896) | ((i8 << 6) & 57344), 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets4 = windowInsets7;
                    modifier4 = modifier5;
                    function14 = function13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MainTabBarViewComposable3.MainTabBarComposable$lambda$14(duxo, modifier4, windowInsets4, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function12 = function1;
            if ((i3 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    if (i4 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i5;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    tabs = MainTabBarComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle).getTabBarState().getTabs();
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(tabs) | composerStartRestartGroup.changedInstance(current);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new MainTabBarViewComposable4(tabs, current, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(tabs, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        Boolean boolValueOf2 = Boolean.valueOf(MainTabBarComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle).getShowWatchlistTabTooltip());
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged2 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = new MainTabBarViewComposable5(snapshotState4CollectAsStateWithLifecycle, snapshotState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                            BentoTabBarState tabBarState2 = MainTabBarComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle).getTabBarState();
                            float fM21592getMediumD9Ej5fM2 = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(duxo) | ((i82 & 7168) != 2048);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue4 = new Function2() { // from class: com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return MainTabBarViewComposable3.MainTabBarComposable$lambda$9$lambda$8(current, duxo, function13, snapshotState4CollectAsStateWithLifecycle, ((Integer) obj).intValue(), (BentoTabBarState.Tab) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                Function2 function22 = (Function2) objRememberedValue4;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen) | composerStartRestartGroup.changedInstance(duxo);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance2) {
                                    objRememberedValue5 = new Function2() { // from class: com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return MainTabBarViewComposable3.MainTabBarComposable$lambda$13$lambda$12(snapshotState, current, screen, duxo, ((Integer) obj).intValue(), (BentoTabBarState.Tab) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifier52 = modifier3;
                                    WindowInsets windowInsets72 = windowInsets3;
                                    BentoTabBar2.m20711BentoTabBarjIwJxvA(tabBarState2, function22, modifier52, fM21592getMediumD9Ej5fM2, windowInsets72, (Function2) objRememberedValue5, composerStartRestartGroup, BentoTabBarState.$stable | ((i82 << 3) & 896) | ((i82 << 6) & 57344), 0);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    windowInsets4 = windowInsets72;
                                    modifier4 = modifier52;
                                    function14 = function13;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainTabBarComposable$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier MainTabBarComposable$lambda$13$lambda$12(final SnapshotState snapshotState, final EventLogger eventLogger, final Screen screen, final MainTabBarDuxo mainTabBarDuxo, int i, BentoTabBarState.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        if (tab == BentoTabBarState.Tab.WATCHLIST_REDESIGN) {
            Modifier.Companion companion = Modifier.INSTANCE;
            Boolean boolValueOf = Boolean.valueOf(MainTabBarComposable$lambda$5(snapshotState));
            Function0 function0 = new Function0() { // from class: com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainTabBarViewComposable3.MainTabBarComposable$lambda$13$lambda$12$lambda$10(eventLogger, screen, mainTabBarDuxo, snapshotState);
                }
            };
            Function0 function02 = new Function0() { // from class: com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainTabBarViewComposable3.MainTabBarComposable$lambda$13$lambda$12$lambda$11(eventLogger, screen, mainTabBarDuxo);
                }
            };
            PopupPositioning popupPositioning = PopupPositioning.ABOVE;
            Duration.Companion companion2 = Duration.INSTANCE;
            return PopupTooltipKt.m26519popupTooltipBgaGok8(companion, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf, (16232 & 2) != 0 ? 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0051: RETURN 
                  (wrap:androidx.compose.ui.Modifier:0x004d: INVOKE 
                  (r5v0 'companion' androidx.compose.ui.Modifier$Companion)
                  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (16232 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:63) java.lang.Boolean.TRUE java.lang.Boolean) : (r6v0 'boolValueOf' java.lang.Boolean))
                  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000c: ARITH (16232 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:67) call: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5.<init>():void type: CONSTRUCTOR) : (r7v0 'function0' kotlin.jvm.functions.Function0))
                  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0019: ARITH (16232 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:71) call: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6.<init>():void type: CONSTRUCTOR) : (r8v0 'function02' kotlin.jvm.functions.Function0))
                  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0026: ARITH (16232 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:75) call: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                  (wrap:com.robinhood.tooltips.popup.PopupPositioning:?: TERNARY null = ((wrap:int:0x0033: ARITH (16232 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: SGET  A[WRAPPED] (LINE:83) com.robinhood.tooltips.popup.PopupPositioning.FREE com.robinhood.tooltips.popup.PopupPositioning) : (r10v0 'popupPositioning' com.robinhood.tooltips.popup.PopupPositioning))
                  (wrap:kotlin.time.Duration:?: TERNARY null = ((wrap:int:0x003d: ARITH (16232 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.time.Duration) : (wrap:kotlin.time.Duration:0x0032: INVOKE 
                  (wrap:long:0x002e: INVOKE 
                  (5 int)
                  (wrap:kotlin.time.DurationUnit:0x002c: SGET  A[WRAPPED] kotlin.time.DurationUnit.SECONDS kotlin.time.DurationUnit)
                 STATIC call: kotlin.time.DurationKt.toDuration(int, kotlin.time.DurationUnit):long A[MD:(int, kotlin.time.DurationUnit):long (m), WRAPPED])
                 STATIC call: kotlin.time.Duration.box-impl(long):kotlin.time.Duration A[MD:(long):kotlin.time.Duration (m), WRAPPED]))
                  (wrap:kotlin.time.Duration:?: TERNARY null = ((wrap:int:0x0046: ARITH (16232 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.time.Duration) : (null kotlin.time.Duration))
                  (wrap:float:?: TERNARY null = ((wrap:int:0x004e: ARITH (16232 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0054: INVOKE (0 int) STATIC call: androidx.compose.ui.unit.Dp.constructor-impl(float):float A[MD:(float):float (m), WRAPPED] (LINE:113)) : (0.0f float))
                  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (16232 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : false)
                  (wrap:float:?: TERNARY null = ((wrap:int:0x0063: ARITH (16232 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0068: INVOKE (0 int) STATIC call: androidx.compose.ui.unit.Dp.constructor-impl(float):float A[MD:(float):float (m), WRAPPED] (LINE:113)) : (0.0f float))
                  (wrap:float:?: TERNARY null = ((wrap:int:0x006f: ARITH (16232 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0078: INVOKE (0 int) STATIC call: androidx.compose.ui.unit.Dp.constructor-impl(float):float A[MD:(float):float (m), WRAPPED] (LINE:113)) : (0.0f float))
                  (wrap:androidx.compose.ui.unit.Dp:?: TERNARY null = ((wrap:int:0x007c: ARITH (16232 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null androidx.compose.ui.unit.Dp) : (null androidx.compose.ui.unit.Dp))
                  (wrap:androidx.compose.animation.EnterTransition:?: TERNARY null = ((wrap:int:0x0084: ARITH (16232 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008e: INVOKE 
                  (wrap:androidx.compose.animation.EnterTransition$Companion:0x0088: SGET  A[WRAPPED] (LINE:110) androidx.compose.animation.EnterTransition.Companion androidx.compose.animation.EnterTransition$Companion)
                 VIRTUAL call: androidx.compose.animation.EnterTransition.Companion.getNone():androidx.compose.animation.EnterTransition A[MD:():androidx.compose.animation.EnterTransition (m), WRAPPED] (LINE:110)) : (null androidx.compose.animation.EnterTransition))
                  (wrap:androidx.compose.animation.ExitTransition:?: TERNARY null = ((wrap:int:0x0092: ARITH (16232 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009c: INVOKE 
                  (wrap:androidx.compose.animation.ExitTransition$Companion:0x0096: SGET  A[WRAPPED] (LINE:114) androidx.compose.animation.ExitTransition.Companion androidx.compose.animation.ExitTransition$Companion)
                 VIRTUAL call: androidx.compose.animation.ExitTransition.Companion.getNone():androidx.compose.animation.ExitTransition A[MD:():androidx.compose.animation.ExitTransition (m), WRAPPED] (LINE:114)) : (null androidx.compose.animation.ExitTransition))
                  (wrap:kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x0038: INVOKE 
                  (wrap:com.robinhood.android.ui.ComposableSingletons$MainTabBarViewComposableKt:0x0036: SGET  A[WRAPPED] (LINE:63) com.robinhood.android.ui.ComposableSingletons$MainTabBarViewComposableKt.INSTANCE com.robinhood.android.ui.ComposableSingletons$MainTabBarViewComposableKt)
                 VIRTUAL call: com.robinhood.android.ui.ComposableSingletons$MainTabBarViewComposableKt.getLambda$-599613037$feature_tab_ui_externalDebug():kotlin.jvm.functions.Function2 A[MD:():kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> (m), WRAPPED] (LINE:63))
                 STATIC call: com.robinhood.tooltips.popup.PopupTooltipKt.popupTooltip-BgaGok8(androidx.compose.ui.Modifier, java.lang.Boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.robinhood.tooltips.popup.PopupPositioning, kotlin.time.Duration, kotlin.time.Duration, float, boolean, float, float, androidx.compose.ui.unit.Dp, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, kotlin.jvm.functions.Function2):androidx.compose.ui.Modifier A[MD:(androidx.compose.ui.Modifier, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, com.robinhood.tooltips.popup.PopupPositioning, kotlin.time.Duration, kotlin.time.Duration, float, boolean, float, float, androidx.compose.ui.unit.Dp, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>):androidx.compose.ui.Modifier (m), WRAPPED] (LINE:59))
                 (LINE:59) in method: com.robinhood.android.ui.MainTabBarViewComposableKt.MainTabBarComposable$lambda$13$lambda$12(androidx.compose.runtime.MutableState, com.robinhood.analytics.EventLogger, com.robinhood.rosetta.eventlogging.Screen, com.robinhood.android.ui.MainTabBarDuxo, int, com.robinhood.compose.bento.component.BentoTabBarState$Tab):androidx.compose.ui.Modifier, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 23 more
                */
            /*
                r0 = r24
                r1 = r25
                r2 = r26
                r3 = r28
                java.lang.String r4 = "tab"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
                com.robinhood.compose.bento.component.BentoTabBarState$Tab r4 = com.robinhood.compose.bento.component.BentoTabBarState.Tab.WATCHLIST_REDESIGN
                if (r3 != r4) goto L52
                androidx.compose.ui.Modifier$Companion r5 = androidx.compose.p011ui.Modifier.INSTANCE
                boolean r3 = MainTabBarComposable$lambda$5(r23)
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
                com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda4 r7 = new com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda4
                r3 = r23
                r7.<init>()
                com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda5 r8 = new com.robinhood.android.ui.MainTabBarViewComposableKt$$ExternalSyntheticLambda5
                r8.<init>()
                com.robinhood.tooltips.popup.PopupPositioning r10 = com.robinhood.tooltips.popup.PopupPositioning.ABOVE
                kotlin.time.Duration$Companion r0 = kotlin.time.Duration.INSTANCE
                r0 = 5
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnitJvm.SECONDS
                long r0 = kotlin.time.Duration3.toDuration(r0, r1)
                kotlin.time.Duration r11 = kotlin.time.Duration.m28726boximpl(r0)
                com.robinhood.android.ui.ComposableSingletons$MainTabBarViewComposableKt r0 = com.robinhood.android.p273ui.MainTabBarViewComposable.INSTANCE
                kotlin.jvm.functions.Function2 r20 = r0.m20012getLambda$599613037$feature_tab_ui_externalDebug()
                r21 = 16328(0x3fc8, float:2.288E-41)
                r22 = 0
                r9 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                androidx.compose.ui.Modifier r0 = com.robinhood.tooltips.popup.PopupTooltipKt.m26520popupTooltipBgaGok8$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return r0
            L52:
                androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p011ui.Modifier.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.p273ui.MainTabBarViewComposable3.MainTabBarComposable$lambda$13$lambda$12(androidx.compose.runtime.MutableState, com.robinhood.analytics.EventLogger, com.robinhood.rosetta.eventlogging.Screen, com.robinhood.android.ui.MainTabBarDuxo, int, com.robinhood.compose.bento.component.BentoTabBarState$Tab):androidx.compose.ui.Modifier");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit MainTabBarComposable$lambda$13$lambda$12$lambda$10(EventLogger eventLogger, Screen screen, MainTabBarDuxo mainTabBarDuxo, SnapshotState snapshotState) {
            MainTabBarComposable$lambda$6(snapshotState, false);
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, "watchlist_new_tab_tooltip", null, 4, null), null, null, false, 57, null);
            mainTabBarDuxo.onWatchlistTooltipAppear();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit MainTabBarComposable$lambda$13$lambda$12$lambda$11(EventLogger eventLogger, Screen screen, MainTabBarDuxo mainTabBarDuxo) {
            EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, "watchlist_new_tab_tooltip", null, 4, null), null, null, 25, null);
            mainTabBarDuxo.onWatchlistTooltipAppear();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MainTabBarViewState MainTabBarComposable$lambda$2(SnapshotState4<MainTabBarViewState> snapshotState4) {
            return snapshotState4.getValue();
        }

        private static final boolean MainTabBarComposable$lambda$5(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit MainTabBarComposable$lambda$9$lambda$8(EventLogger eventLogger, MainTabBarDuxo mainTabBarDuxo, Function1 function1, SnapshotState4 snapshotState4, int i, BentoTabBarState.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.TAB, tab.getAnalyticsTabName(), null, 4, null), null, null, false, 59, null);
            if (i != MainTabBarComposable$lambda$2(snapshotState4).getTabBarState().getSelectedIndex()) {
                MainTabBarDuxo.onTabSelected$default(mainTabBarDuxo, tab, false, 2, null);
                function1.invoke(tab);
            } else {
                mainTabBarDuxo.onCurrentTabReselected();
            }
            return Unit.INSTANCE;
        }
    }
