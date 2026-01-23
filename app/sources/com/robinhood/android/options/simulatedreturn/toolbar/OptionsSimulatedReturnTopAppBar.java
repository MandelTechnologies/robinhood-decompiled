package com.robinhood.android.options.simulatedreturn.toolbar;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.options.tradebar.C11453R;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnUtils;
import com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBar;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsSimulatedReturnTopAppBar.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"OptionsSimulatedReturnTopAppBar", "", "state", "Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState;", "topBarScrollState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "onBack", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onToolbarMenuItemTapped", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "(Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState;Lcom/robinhood/compose/bento/component/TopBarScrollState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-options-simulated-return_externalDebug", "titleStyle", "Landroidx/compose/ui/text/TextStyle;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBarKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnTopAppBar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnTopAppBar$lambda$3(OptionsSimulatedReturnToolbarState optionsSimulatedReturnToolbarState, TopBarScrollState topBarScrollState, Function0 function0, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        OptionsSimulatedReturnTopAppBar(optionsSimulatedReturnToolbarState, topBarScrollState, function0, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsSimulatedReturnTopAppBar(final OptionsSimulatedReturnToolbarState state, final TopBarScrollState topBarScrollState, final Function0<Unit> onBack, Modifier modifier, final Function1<? super FragmentKey, Unit> onToolbarMenuItemTapped, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onToolbarMenuItemTapped, "onToolbarMenuItemTapped");
        Composer composerStartRestartGroup = composer.startRestartGroup(1988807993);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onToolbarMenuItemTapped) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1988807993, i3, -1, "com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBar (OptionsSimulatedReturnTopAppBar.kt:28)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(textM, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-106487956, true, new C237581(state, textM, textS, (SnapshotState) objRememberedValue), composerStartRestartGroup, 54), PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), ComposableLambda3.rememberComposableLambda(-1959883624, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBarKt.OptionsSimulatedReturnTopAppBar.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i6 & 6) == 0) {
                            i6 |= (i6 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1959883624, i6, -1, "com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBar.<anonymous> (OptionsSimulatedReturnTopAppBar.kt:35)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBack, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1774526423, true, new C237603(state, onToolbarMenuItemTapped), composerStartRestartGroup, 54), null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer2, 3462, 0, 1968);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsSimulatedReturnTopAppBar.OptionsSimulatedReturnTopAppBar$lambda$3(state, topBarScrollState, onBack, modifier3, onToolbarMenuItemTapped, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM();
            TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier42 = modifier2;
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-106487956, true, new C237581(state, textM2, textS2, (SnapshotState) objRememberedValue), composerStartRestartGroup, 54), PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), ComposableLambda3.rememberComposableLambda(-1959883624, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBarKt.OptionsSimulatedReturnTopAppBar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i6 & 6) == 0) {
                        i6 |= (i6 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1959883624, i6, -1, "com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBar.<anonymous> (OptionsSimulatedReturnTopAppBar.kt:35)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBack, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1774526423, true, new C237603(state, onToolbarMenuItemTapped), composerStartRestartGroup, 54), null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer2, 3462, 0, 1968);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: OptionsSimulatedReturnTopAppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBarKt$OptionsSimulatedReturnTopAppBar$1 */
    static final class C237581 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TextStyle $mediumTitleStyle;
        final /* synthetic */ TextStyle $smallTitleStyle;
        final /* synthetic */ OptionsSimulatedReturnToolbarState $state;
        final /* synthetic */ SnapshotState<TextStyle> $titleStyle$delegate;

        C237581(OptionsSimulatedReturnToolbarState optionsSimulatedReturnToolbarState, TextStyle textStyle, TextStyle textStyle2, SnapshotState<TextStyle> snapshotState) {
            this.$state = optionsSimulatedReturnToolbarState;
            this.$mediumTitleStyle = textStyle;
            this.$smallTitleStyle = textStyle2;
            this.$titleStyle$delegate = snapshotState;
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
                ComposerKt.traceEventStart(-106487956, i, -1, "com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBar.<anonymous> (OptionsSimulatedReturnTopAppBar.kt:40)");
            }
            String string2 = this.$state.getTitle().toString();
            long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            TextStyle textStyleOptionsSimulatedReturnTopAppBar$lambda$1 = OptionsSimulatedReturnTopAppBar.OptionsSimulatedReturnTopAppBar$lambda$1(this.$titleStyle$delegate);
            int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
            Color colorM6701boximpl = Color.m6701boximpl(jM21425getFg0d7_KjU);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$mediumTitleStyle) | composer.changed(this.$smallTitleStyle);
            final TextStyle textStyle = this.$mediumTitleStyle;
            final TextStyle textStyle2 = this.$smallTitleStyle;
            final SnapshotState<TextStyle> snapshotState = this.$titleStyle$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBarKt$OptionsSimulatedReturnTopAppBar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsSimulatedReturnTopAppBar.C237581.invoke$lambda$1$lambda$0(textStyle, textStyle2, snapshotState, (TextLayoutResult) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(string2, null, colorM6701boximpl, null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, (Function1) objRememberedValue, 0, textStyleOptionsSimulatedReturnTopAppBar$lambda$1, composer, 817889280, 0, 5498);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(TextStyle textStyle, TextStyle textStyle2, SnapshotState snapshotState, TextLayoutResult textLayoutResult) {
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            if (textLayoutResult.isLineEllipsized(0) && Intrinsics.areEqual(OptionsSimulatedReturnTopAppBar.OptionsSimulatedReturnTopAppBar$lambda$1(snapshotState), textStyle)) {
                OptionsSimulatedReturnTopAppBar.OptionsSimulatedReturnTopAppBar$lambda$2(snapshotState, textStyle2);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OptionsSimulatedReturnTopAppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBarKt$OptionsSimulatedReturnTopAppBar$3 */
    static final class C237603 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ Function1<FragmentKey, Unit> $onToolbarMenuItemTapped;
        final /* synthetic */ OptionsSimulatedReturnToolbarState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C237603(OptionsSimulatedReturnToolbarState optionsSimulatedReturnToolbarState, Function1<? super FragmentKey, Unit> function1) {
            this.$state = optionsSimulatedReturnToolbarState;
            this.$onToolbarMenuItemTapped = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1774526423, i, -1, "com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBar.<anonymous> (OptionsSimulatedReturnTopAppBar.kt:57)");
            }
            composer.startReplaceGroup(217876707);
            boolean z = this.$state.getViewUnderlier() == null || (this.$state.getViewUnderlier().getShouldHideForNormalDevices() && !OptionsSimulatedReturnUtils.isDeviceSmallForOptionsSimulatedReturn(composer, 0));
            composer.endReplaceGroup();
            if (z) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onToolbarMenuItemTapped) | composer.changedInstance(this.$state);
            final Function1<FragmentKey, Unit> function1 = this.$onToolbarMenuItemTapped;
            final OptionsSimulatedReturnToolbarState optionsSimulatedReturnToolbarState = this.$state;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBarKt$OptionsSimulatedReturnTopAppBar$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsSimulatedReturnTopAppBar.C237603.invoke$lambda$1$lambda$0(function1, optionsSimulatedReturnToolbarState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
            String strStringResource = StringResources_androidKt.stringResource(C11453R.string.option_detail_underlying_trade_bar_link_label, new Object[]{this.$state.getViewUnderlier().getSymbol()}, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM4893clickableXHw0xAI$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 817913856, 0, 7528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, OptionsSimulatedReturnToolbarState optionsSimulatedReturnToolbarState) {
            function1.invoke(optionsSimulatedReturnToolbarState.getViewUnderlier().getUnderlyingFragmentKey());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle OptionsSimulatedReturnTopAppBar$lambda$1(SnapshotState<TextStyle> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionsSimulatedReturnTopAppBar$lambda$2(SnapshotState<TextStyle> snapshotState, TextStyle textStyle) {
        snapshotState.setValue(textStyle);
    }
}
