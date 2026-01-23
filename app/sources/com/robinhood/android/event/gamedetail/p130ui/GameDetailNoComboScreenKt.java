package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.event.gamedetail.GameDetailViewState;
import com.robinhood.android.event.gamedetail.builders.TitleState;
import com.robinhood.android.event.gamedetail.callbacks.GdpV1UiCallbacks;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailBottomSheetState;
import com.robinhood.android.event.gamedetail.p130ui.GameDetailNoComboScreenKt;
import com.robinhood.android.event.gamedetail.p130ui.toolbar.GameDetailAppBar;
import com.robinhood.android.futures.charts.EventContractChartArg;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailNoComboScreen.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ai\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"GameDetailNoComboScreen", "", "viewState", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState;", "topBarScrollState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "contentListState", "Landroidx/compose/foundation/lazy/LazyListState;", "isScrolled", "", "showDisplayDataSheet", "callbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpV1UiCallbacks;", "onBack", "Lkotlin/Function0;", "onShowDisplayDataSheetChanged", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/gamedetail/GameDetailViewState;Lcom/robinhood/compose/bento/component/TopBarScrollState;Landroidx/compose/foundation/lazy/LazyListState;ZZLcom/robinhood/android/event/gamedetail/callbacks/GdpV1UiCallbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class GameDetailNoComboScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailNoComboScreen$lambda$3(GameDetailViewState gameDetailViewState, TopBarScrollState topBarScrollState, LazyListState lazyListState, boolean z, boolean z2, GdpV1UiCallbacks gdpV1UiCallbacks, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GameDetailNoComboScreen(gameDetailViewState, topBarScrollState, lazyListState, z, z2, gdpV1UiCallbacks, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailNoComboScreen(final GameDetailViewState viewState, final TopBarScrollState topBarScrollState, final LazyListState contentListState, final boolean z, final boolean z2, final GdpV1UiCallbacks callbacks, final Function0<Unit> onBack, final Function1<? super Boolean, Unit> onShowDisplayDataSheetChanged, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        Modifier modifier2;
        boolean z5;
        Object objRememberedValue;
        boolean z6;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        Intrinsics.checkNotNullParameter(contentListState, "contentListState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onShowDisplayDataSheetChanged, "onShowDisplayDataSheetChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(384735767);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(contentListState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= (i & 262144) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onBack) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onShowDisplayDataSheetChanged) ? 8388608 : 4194304;
                }
                i4 = i2 & 256;
                if (i4 != 0) {
                    i3 |= 100663296;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                    }
                }
                if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(384735767, i3, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreen (GameDetailNoComboScreen.kt:38)");
                    }
                    GameDetailBottomSheetState bottomSheetState = viewState.getBottomSheetState();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i5 = 458752 & i3;
                    z5 = i5 != 131072 || ((i3 & 262144) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new C16360x99d744b(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z6 = i5 != 131072 || ((i3 & 262144) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z6 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GameDetailNoComboScreenKt.GameDetailNoComboScreen$lambda$2$lambda$1(callbacks);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolderRememberBottomSheetStateHolder = GameDetailBottomSheetStateHolder4.rememberBottomSheetStateHolder(bottomSheetState, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
                    MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState = MultiModeBottomSheetScaffoldKt.rememberMultiModeBottomSheetScaffoldState(gameDetailBottomSheetStateHolderRememberBottomSheetStateHolder.getBottomSheetState(), null, composerStartRestartGroup, MultiModeSheetState.$stable, 2);
                    EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    composer2 = composerStartRestartGroup;
                    MultiModeBottomSheetScaffoldKt.m24809MultiModeBottomSheetScaffoldA036w5U(ComposableLambda3.rememberComposableLambda(304023660, true, new C163561(gameDetailBottomSheetStateHolderRememberBottomSheetStateHolder, viewState, callbacks), composerStartRestartGroup, 54), modifier5, multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState, 0.0f, RectangleShape2.getRectangleShape(), 0.0f, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), 0L, 0.0f, C2002Dp.m7995constructorimpl(12), null, ComposableLambda3.rememberComposableLambda(-1548070236, true, new C163572(gameDetailBottomSheetStateHolderRememberBottomSheetStateHolder), composerStartRestartGroup, 54), true, ComposableLambda3.rememberComposableLambda(1143438178, true, new C163583(viewState, z3, topBarScrollState, onBack, callbacks, current, onShowDisplayDataSheetChanged, contentListState), composerStartRestartGroup, 54), null, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(163895329, true, new C163594(callbacks, viewState, contentListState, z4, onShowDisplayDataSheetChanged), composerStartRestartGroup, 54), composer2, ((i3 >> 21) & 112) | 805330950, 12586416, 83368);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GameDetailNoComboScreenKt.GameDetailNoComboScreen$lambda$3(viewState, topBarScrollState, contentListState, z, z2, callbacks, onBack, onShowDisplayDataSheetChanged, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z4 = z2;
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i4 = i2 & 256;
            if (i4 != 0) {
            }
            if ((i3 & 38347923) != 38347922) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                GameDetailBottomSheetState bottomSheetState2 = viewState.getBottomSheetState();
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i52 = 458752 & i3;
                if (i52 != 131072) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z5) {
                        objRememberedValue = new C16360x99d744b(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Function0 function02 = (Function0) ((KFunction) objRememberedValue);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if (i52 != 131072) {
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z6) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return GameDetailNoComboScreenKt.GameDetailNoComboScreen$lambda$2$lambda$1(callbacks);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolderRememberBottomSheetStateHolder2 = GameDetailBottomSheetStateHolder4.rememberBottomSheetStateHolder(bottomSheetState2, function02, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
                                MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState2 = MultiModeBottomSheetScaffoldKt.rememberMultiModeBottomSheetScaffoldState(gameDetailBottomSheetStateHolderRememberBottomSheetStateHolder2.getBottomSheetState(), null, composerStartRestartGroup, MultiModeSheetState.$stable, 2);
                                EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i62 = BentoTheme.$stable;
                                Modifier modifier52 = modifier4;
                                composer2 = composerStartRestartGroup;
                                MultiModeBottomSheetScaffoldKt.m24809MultiModeBottomSheetScaffoldA036w5U(ComposableLambda3.rememberComposableLambda(304023660, true, new C163561(gameDetailBottomSheetStateHolderRememberBottomSheetStateHolder2, viewState, callbacks), composerStartRestartGroup, 54), modifier52, multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState2, 0.0f, RectangleShape2.getRectangleShape(), 0.0f, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), 0L, 0.0f, C2002Dp.m7995constructorimpl(12), null, ComposableLambda3.rememberComposableLambda(-1548070236, true, new C163572(gameDetailBottomSheetStateHolderRememberBottomSheetStateHolder2), composerStartRestartGroup, 54), true, ComposableLambda3.rememberComposableLambda(1143438178, true, new C163583(viewState, z3, topBarScrollState, onBack, callbacks, current2, onShowDisplayDataSheetChanged, contentListState), composerStartRestartGroup, 54), null, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(163895329, true, new C163594(callbacks, viewState, contentListState, z4, onShowDisplayDataSheetChanged), composerStartRestartGroup, 54), composer2, ((i3 >> 21) & 112) | 805330950, 12586416, 83368);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        if ((i2 & 16) != 0) {
        }
        z4 = z2;
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i4 = i2 & 256;
        if (i4 != 0) {
        }
        if ((i3 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailNoComboScreen$lambda$2$lambda$1(GdpV1UiCallbacks gdpV1UiCallbacks) {
        gdpV1UiCallbacks.onPositionSelected(null);
        return Unit.INSTANCE;
    }

    /* compiled from: GameDetailNoComboScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$GameDetailNoComboScreen$3 */
    static final class C163583 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ GdpV1UiCallbacks $callbacks;
        final /* synthetic */ LazyListState $contentListState;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ boolean $isScrolled;
        final /* synthetic */ Function0<Unit> $onBack;
        final /* synthetic */ Function1<Boolean, Unit> $onShowDisplayDataSheetChanged;
        final /* synthetic */ TopBarScrollState $topBarScrollState;
        final /* synthetic */ GameDetailViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C163583(GameDetailViewState gameDetailViewState, boolean z, TopBarScrollState topBarScrollState, Function0<Unit> function0, GdpV1UiCallbacks gdpV1UiCallbacks, EventLogger eventLogger, Function1<? super Boolean, Unit> function1, LazyListState lazyListState) {
            this.$viewState = gameDetailViewState;
            this.$isScrolled = z;
            this.$topBarScrollState = topBarScrollState;
            this.$onBack = function0;
            this.$callbacks = gdpV1UiCallbacks;
            this.$eventLogger = eventLogger;
            this.$onShowDisplayDataSheetChanged = function1;
            this.$contentListState = lazyListState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1143438178, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreen.<anonymous> (GameDetailNoComboScreen.kt:55)");
            }
            TitleState titleState = this.$viewState.getTitleState();
            boolean showSettingsSection = this.$viewState.getShowSettingsSection();
            boolean z = this.$isScrolled;
            boolean showDivider = this.$topBarScrollState.getShowDivider();
            Function0<Unit> function0 = this.$onBack;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$callbacks);
            final GameDetailViewState gameDetailViewState = this.$viewState;
            final GdpV1UiCallbacks gdpV1UiCallbacks = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$GameDetailNoComboScreen$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GameDetailNoComboScreenKt.C163583.invoke$lambda$1$lambda$0(gameDetailViewState, gdpV1UiCallbacks);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$viewState) | composer.changed(this.$onShowDisplayDataSheetChanged);
            final EventLogger eventLogger = this.$eventLogger;
            final GameDetailViewState gameDetailViewState2 = this.$viewState;
            final Function1<Boolean, Unit> function1 = this.$onShowDisplayDataSheetChanged;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$GameDetailNoComboScreen$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GameDetailNoComboScreenKt.C163583.invoke$lambda$3$lambda$2(eventLogger, gameDetailViewState2, function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            GameDetailAppBar.GameDetailAppBar(titleState, showSettingsSection, z, showDivider, function0, function02, (Function0) objRememberedValue2, TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, this.$contentListState, this.$topBarScrollState), composer, StringResource.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(GameDetailViewState gameDetailViewState, GdpV1UiCallbacks gdpV1UiCallbacks) {
            ImmutableList<UUID> contractIdsForChart;
            DisplaySpan span;
            UUID eventId = gameDetailViewState.getEventId();
            if (eventId != null && (contractIdsForChart = gameDetailViewState.getContractIdsForChart()) != null) {
                EventContractChartArg chartArgs = gameDetailViewState.getChartArgs();
                if (chartArgs == null || (span = chartArgs.getSpan()) == null) {
                    return Unit.INSTANCE;
                }
                gdpV1UiCallbacks.onStartPipMode(eventId, contractIdsForChart, span);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, GameDetailViewState gameDetailViewState, Function1 function1) {
            GameDetailComboScreen2.logSettingClick(eventLogger, gameDetailViewState.getShowAmericanOdds());
            function1.invoke(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GameDetailNoComboScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$GameDetailNoComboScreen$1 */
    static final class C163561 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ GdpV1UiCallbacks $callbacks;
        final /* synthetic */ GameDetailBottomSheetStateHolder $sheetStateHolder;
        final /* synthetic */ GameDetailViewState $viewState;

        C163561(GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolder, GameDetailViewState gameDetailViewState, GdpV1UiCallbacks gdpV1UiCallbacks) {
            this.$sheetStateHolder = gameDetailBottomSheetStateHolder;
            this.$viewState = gameDetailViewState;
            this.$callbacks = gdpV1UiCallbacks;
        }

        public final void invoke(Column5 MultiModeBottomSheetScaffold, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(MultiModeBottomSheetScaffold, "$this$MultiModeBottomSheetScaffold");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(304023660, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreen.<anonymous> (GameDetailNoComboScreen.kt:94)");
            }
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(this.$sheetStateHolder.getBottomSheetWrapperHeight())), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            GameDetailViewState gameDetailViewState = this.$viewState;
            final GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolder = this.$sheetStateHolder;
            Object obj = this.$callbacks;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            GameDetailBottomSheetState bottomSheetState = gameDetailViewState.getBottomSheetState();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(gameDetailBottomSheetStateHolder);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$GameDetailNoComboScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GameDetailNoComboScreenKt.C163561.invoke$lambda$6$lambda$2$lambda$1(gameDetailBottomSheetStateHolder, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function2 function2 = (Function2) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(obj);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new GameDetailNoComboScreenKt$GameDetailNoComboScreen$1$2$2$1(obj);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(obj);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new GameDetailNoComboScreenKt$GameDetailNoComboScreen$1$2$3$1(obj);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Function1 function12 = (Function1) ((KFunction) objRememberedValue3);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(obj);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new GameDetailNoComboScreenKt$GameDetailNoComboScreen$1$2$4$1(obj);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            GameDetailTradeSlip.GameDetailTradeSlip(bottomSheetState, function2, function1, function12, (Function0) ((KFunction) objRememberedValue4), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$2$lambda$1(GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolder, int i, int i2) {
            gameDetailBottomSheetStateHolder.updateSheetHeights(SheetHeights.copy$default(gameDetailBottomSheetStateHolder.getSheetHeights(), 0, i, i2, 1, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GameDetailNoComboScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$GameDetailNoComboScreen$2 */
    static final class C163572 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ GameDetailBottomSheetStateHolder $sheetStateHolder;

        C163572(GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolder) {
            this.$sheetStateHolder = gameDetailBottomSheetStateHolder;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1548070236, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreen.<anonymous> (GameDetailNoComboScreen.kt:82)");
            }
            BottomSheetDefaults bottomSheetDefaults = BottomSheetDefaults.INSTANCE;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$sheetStateHolder);
            final GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolder = this.$sheetStateHolder;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$GameDetailNoComboScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailNoComboScreenKt.C163572.invoke$lambda$1$lambda$0(gameDetailBottomSheetStateHolder, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            bottomSheetDefaults.m5711DragHandlelgZ2HuY(OnRemeasuredModifier2.onSizeChanged(companion, (Function1) objRememberedValue), 0.0f, 0.0f, null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU(), composer, 196608, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolder, IntSize intSize) {
            if (gameDetailBottomSheetStateHolder.getSheetHeights().getDragHandleHeight() == 0) {
                gameDetailBottomSheetStateHolder.updateSheetHeights(SheetHeights.copy$default(gameDetailBottomSheetStateHolder.getSheetHeights(), (int) (intSize.getPackedValue() & 4294967295L), 0, 0, 6, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GameDetailNoComboScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$GameDetailNoComboScreen$4 */
    static final class C163594 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ GdpV1UiCallbacks $callbacks;
        final /* synthetic */ LazyListState $contentListState;
        final /* synthetic */ Function1<Boolean, Unit> $onShowDisplayDataSheetChanged;
        final /* synthetic */ boolean $showDisplayDataSheet;
        final /* synthetic */ GameDetailViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C163594(GdpV1UiCallbacks gdpV1UiCallbacks, GameDetailViewState gameDetailViewState, LazyListState lazyListState, boolean z, Function1<? super Boolean, Unit> function1) {
            this.$callbacks = gdpV1UiCallbacks;
            this.$viewState = gameDetailViewState;
            this.$contentListState = lazyListState;
            this.$showDisplayDataSheet = z;
            this.$onShowDisplayDataSheetChanged = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(163895329, i2, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreen.<anonymous> (GameDetailNoComboScreen.kt:117)");
            }
            GdpV1UiCallbacks gdpV1UiCallbacks = this.$callbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(gdpV1UiCallbacks);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$1$1(gdpV1UiCallbacks);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            GdpV1UiCallbacks gdpV1UiCallbacks2 = this.$callbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(gdpV1UiCallbacks2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$2$1(gdpV1UiCallbacks2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composer.endReplaceGroup();
            GdpV1UiCallbacks gdpV1UiCallbacks3 = this.$callbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(gdpV1UiCallbacks3);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$3$1(gdpV1UiCallbacks3);
                composer.updateRememberedValue(objRememberedValue3);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue3;
            composer.endReplaceGroup();
            GdpV1UiCallbacks gdpV1UiCallbacks4 = this.$callbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(gdpV1UiCallbacks4);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$4$1(gdpV1UiCallbacks4);
                composer.updateRememberedValue(objRememberedValue4);
            }
            KFunction kFunction4 = (KFunction) objRememberedValue4;
            composer.endReplaceGroup();
            GdpV1UiCallbacks gdpV1UiCallbacks5 = this.$callbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(gdpV1UiCallbacks5);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$5$1(gdpV1UiCallbacks5);
                composer.updateRememberedValue(objRememberedValue5);
            }
            KFunction kFunction5 = (KFunction) objRememberedValue5;
            composer.endReplaceGroup();
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
            GameDetailViewState gameDetailViewState = this.$viewState;
            GdpV1UiCallbacks gdpV1UiCallbacks6 = this.$callbacks;
            LazyListState lazyListState = this.$contentListState;
            boolean z = this.$showDisplayDataSheet;
            Function1 function1 = (Function1) kFunction;
            Function1 function12 = (Function1) kFunction2;
            Function1 function13 = (Function1) kFunction3;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onShowDisplayDataSheetChanged);
            final Function1<Boolean, Unit> function14 = this.$onShowDisplayDataSheetChanged;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GameDetailNoComboScreenKt.C163594.invoke$lambda$6$lambda$5(function14);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            GameDetailContentKt.GameDetailContent(gameDetailViewState, gdpV1UiCallbacks6, gdpV1UiCallbacks6, gdpV1UiCallbacks6, lazyListState, z, function1, function12, function13, null, (Function0) objRememberedValue6, (Function1) kFunction4, (Function0) kFunction5, modifierPadding, composer, 805306368, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(Function1 function1) {
            function1.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }
}
