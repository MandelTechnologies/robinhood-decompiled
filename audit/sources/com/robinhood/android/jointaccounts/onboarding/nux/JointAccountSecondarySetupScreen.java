package com.robinhood.android.jointaccounts.onboarding.nux;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreen;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.jointaccounts.api.confirmation.ApiSecondarySetupViewModel;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.store.AsyncResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: JointAccountSecondarySetupScreen.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001aG\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00042\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0003¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"SecondarySetupLoadingTestTag", "", "SecondarySetupErrorTestTag", "LoadedJointAccountSecondarySetupScreen", "", "state", "Lcom/robinhood/android/jointaccounts/onboarding/nux/SecondarySetupViewState;", "onShareClicked", "Lkotlin/Function1;", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiSecondarySetupViewModel$ShareViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/jointaccounts/onboarding/nux/SecondarySetupViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "JointAccountSecondarySetupScreen", "Lcom/robinhood/store/AsyncResult;", "onRetryClicked", "Lkotlin/Function0;", "(Lcom/robinhood/store/AsyncResult;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewJointAccountSecondarySetupScreen", "(Lcom/robinhood/store/AsyncResult;Landroidx/compose/runtime/Composer;I)V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class JointAccountSecondarySetupScreen {
    public static final String SecondarySetupErrorTestTag = "secondary_setup_error";
    public static final String SecondarySetupLoadingTestTag = "secondary_setup_loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JointAccountSecondarySetupScreen$lambda$1(AsyncResult asyncResult, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        JointAccountSecondarySetupScreen(asyncResult, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedJointAccountSecondarySetupScreen$lambda$0(SecondarySetupViewState secondarySetupViewState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedJointAccountSecondarySetupScreen(secondarySetupViewState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewJointAccountSecondarySetupScreen$lambda$2(AsyncResult asyncResult, int i, Composer composer, int i2) {
        PreviewJointAccountSecondarySetupScreen(asyncResult, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedJointAccountSecondarySetupScreen(SecondarySetupViewState secondarySetupViewState, final Function1<? super ApiSecondarySetupViewModel.ShareViewModel, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        SecondarySetupViewState secondarySetupViewState2;
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(226088026);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            secondarySetupViewState2 = secondarySetupViewState;
        } else if ((i & 6) == 0) {
            secondarySetupViewState2 = secondarySetupViewState;
            i3 = (composerStartRestartGroup.changedInstance(secondarySetupViewState2) ? 4 : 2) | i;
        } else {
            secondarySetupViewState2 = secondarySetupViewState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(226088026, i3, -1, "com.robinhood.android.jointaccounts.onboarding.nux.LoadedJointAccountSecondarySetupScreen (JointAccountSecondarySetupScreen.kt:54)");
                }
                ApiSecondarySetupViewModel viewModel = secondarySetupViewState2.getViewModel();
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_HELP_CO_OWNER, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, secondarySetupViewState2.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1484644111, true, new C201291(modifier3, viewModel, UtilKt.getIconAsset(viewModel.getShare_view_model().getMobile_icon()), function1), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final SecondarySetupViewState secondarySetupViewState3 = secondarySetupViewState2;
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return JointAccountSecondarySetupScreen.LoadedJointAccountSecondarySetupScreen$lambda$0(secondarySetupViewState3, function1, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ApiSecondarySetupViewModel viewModel2 = secondarySetupViewState2.getViewModel();
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_HELP_CO_OWNER, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, secondarySetupViewState2.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1484644111, true, new C201291(modifier3, viewModel2, UtilKt.getIconAsset(viewModel2.getShare_view_model().getMobile_icon()), function1), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: JointAccountSecondarySetupScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt$LoadedJointAccountSecondarySetupScreen$1 */
    static final class C201291 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ServerToBentoAssetMapper2 $iconAsset;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<ApiSecondarySetupViewModel.ShareViewModel, Unit> $onShareClicked;
        final /* synthetic */ ApiSecondarySetupViewModel $viewModel;

        /* JADX WARN: Multi-variable type inference failed */
        C201291(Modifier modifier, ApiSecondarySetupViewModel apiSecondarySetupViewModel, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Function1<? super ApiSecondarySetupViewModel.ShareViewModel, Unit> function1) {
            this.$modifier = modifier;
            this.$viewModel = apiSecondarySetupViewModel;
            this.$iconAsset = serverToBentoAssetMapper2;
            this.$onShareClicked = function1;
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
                ComposerKt.traceEventStart(1484644111, i, -1, "com.robinhood.android.jointaccounts.onboarding.nux.LoadedJointAccountSecondarySetupScreen.<anonymous> (JointAccountSecondarySetupScreen.kt:67)");
            }
            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null);
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$viewModel);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.$iconAsset;
            boolean zChanged = composer.changed(serverToBentoAssetMapper2 != null ? serverToBentoAssetMapper2.ordinal() : -1) | zChangedInstance | composer.changed(this.$onShareClicked);
            final ApiSecondarySetupViewModel apiSecondarySetupViewModel = this.$viewModel;
            final ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = this.$iconAsset;
            final Function1<ApiSecondarySetupViewModel.ShareViewModel, Unit> function1 = this.$onShareClicked;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt$LoadedJointAccountSecondarySetupScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return JointAccountSecondarySetupScreen.C201291.invoke$lambda$1$lambda$0(apiSecondarySetupViewModel, serverToBentoAssetMapper22, function1, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierLogScreenTransitions$default, null, paddingValuesM5137PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ApiSecondarySetupViewModel apiSecondarySetupViewModel, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Function1 function1, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1833481316, true, new JointAccountSecondarySetupScreen2(apiSecondarySetupViewModel, serverToBentoAssetMapper2, function1)), 3, null);
            SduiColumns.sduiItems(LazyColumn, extensions2.toImmutableList(apiSecondarySetupViewModel.getMobile_post_share_row_content()), GenericAction.class, null, null, HorizontalPadding.Default);
            return Unit.INSTANCE;
        }
    }

    public static final void JointAccountSecondarySetupScreen(final AsyncResult<SecondarySetupViewState> state, final Function1<? super ApiSecondarySetupViewModel.ShareViewModel, Unit> onShareClicked, final Function0<Unit> onRetryClicked, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onShareClicked, "onShareClicked");
        Intrinsics.checkNotNullParameter(onRetryClicked, "onRetryClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(385320567);
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
            i3 |= composerStartRestartGroup.changedInstance(onShareClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRetryClicked) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(385320567, i3, -1, "com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreen (JointAccountSecondarySetupScreen.kt:120)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1103539444, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt.JointAccountSecondarySetupScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1103539444, i5, -1, "com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreen.<anonymous> (JointAccountSecondarySetupScreen.kt:122)");
                    }
                    final AsyncResult<SecondarySetupViewState> asyncResult = state;
                    final Modifier modifier2 = modifier;
                    final Function0<Unit> function0 = onRetryClicked;
                    final Function1<ApiSecondarySetupViewModel.ShareViewModel, Unit> function1 = onShareClicked;
                    GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(42899998, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt.JointAccountSecondarySetupScreen.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(42899998, i6, -1, "com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreen.<anonymous>.<anonymous> (JointAccountSecondarySetupScreen.kt:123)");
                            }
                            AsyncResult<SecondarySetupViewState> asyncResult2 = asyncResult;
                            if (asyncResult2 instanceof AsyncResult.Failure) {
                                composer3.startReplaceGroup(-1866336443);
                                ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(modifier2, JointAccountSecondarySetupScreen.SecondarySetupErrorTestTag), function0, 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                composer3.endReplaceGroup();
                            } else if (asyncResult2 instanceof AsyncResult.Loading) {
                                composer3.startReplaceGroup(-1866063581);
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(TestTag3.testTag(modifier2, JointAccountSecondarySetupScreen.SecondarySetupLoadingTestTag), 0.0f, 1, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, false, 2, composer3, 3120, 5);
                                composer3.endNode();
                                composer3.endReplaceGroup();
                            } else {
                                if (!(asyncResult2 instanceof AsyncResult.Success)) {
                                    composer3.startReplaceGroup(-1722773323);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(-1865550004);
                                JointAccountSecondarySetupScreen.LoadedJointAccountSecondarySetupScreen((SecondarySetupViewState) ((AsyncResult.Success) asyncResult).getValue(), function1, modifier2, composer3, 0, 0);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 24576, 15);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountSecondarySetupScreen.JointAccountSecondarySetupScreen$lambda$1(state, onShareClicked, onRetryClicked, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewJointAccountSecondarySetupScreen(final AsyncResult<SecondarySetupViewState> asyncResult, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1551057657);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(asyncResult) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1551057657, i2, -1, "com.robinhood.android.jointaccounts.onboarding.nux.PreviewJointAccountSecondarySetupScreen (JointAccountSecondarySetupScreen.kt:161)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE)}, ComposableLambda3.rememberComposableLambda(1770098759, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt.PreviewJointAccountSecondarySetupScreen.1

                /* compiled from: JointAccountSecondarySetupScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt$PreviewJointAccountSecondarySetupScreen$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ AsyncResult<SecondarySetupViewState> $state;

                    AnonymousClass1(AsyncResult<SecondarySetupViewState> asyncResult) {
                        this.$state = asyncResult;
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
                            ComposerKt.traceEventStart(106741647, i, -1, "com.robinhood.android.jointaccounts.onboarding.nux.PreviewJointAccountSecondarySetupScreen.<anonymous>.<anonymous> (JointAccountSecondarySetupScreen.kt:167)");
                        }
                        AsyncResult<SecondarySetupViewState> asyncResult = this.$state;
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt$PreviewJointAccountSecondarySetupScreen$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return JointAccountSecondarySetupScreen.C201311.AnonymousClass1.invoke$lambda$1$lambda$0((ApiSecondarySetupViewModel.ShareViewModel) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt$PreviewJointAccountSecondarySetupScreen$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        JointAccountSecondarySetupScreen.JointAccountSecondarySetupScreen(asyncResult, function1, (Function0) objRememberedValue2, null, composer, 432, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(ApiSecondarySetupViewModel.ShareViewModel it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1770098759, i3, -1, "com.robinhood.android.jointaccounts.onboarding.nux.PreviewJointAccountSecondarySetupScreen.<anonymous> (JointAccountSecondarySetupScreen.kt:166)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(106741647, true, new AnonymousClass1(asyncResult), composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountSecondarySetupScreen.PreviewJointAccountSecondarySetupScreen$lambda$2(asyncResult, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
