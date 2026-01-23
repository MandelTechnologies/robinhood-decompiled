package com.robinhood.android.jointaccounts.onboarding.outro.created;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationCtaDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchJointAccountCreatedResponseDto;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.jointaccounts.onboarding.Components5;
import com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreen4;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.store.AsyncResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: JointAccountCreatedScreen.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a-\u0010\f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"JointAccountCreatedLoadingTag", "", "JointAccountCreatedErrorTag", "JointAccountCreatedLoadedScreen", "", "state", "Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedViewState;", "callbacks", "Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedViewState;Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "JointAccountCreatedScreen", "Lcom/robinhood/store/AsyncResult;", "(Lcom/robinhood/store/AsyncResult;Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class JointAccountCreatedScreen4 {
    public static final String JointAccountCreatedErrorTag = "joint_account_created_error";
    public static final String JointAccountCreatedLoadingTag = "joint_account_created_loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JointAccountCreatedLoadedScreen$lambda$1(JointAccountCreatedViewState jointAccountCreatedViewState, JointAccountCreatedScreen3 jointAccountCreatedScreen3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        JointAccountCreatedLoadedScreen(jointAccountCreatedViewState, jointAccountCreatedScreen3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JointAccountCreatedScreen$lambda$5(AsyncResult asyncResult, JointAccountCreatedScreen3 jointAccountCreatedScreen3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        JointAccountCreatedScreen(asyncResult, jointAccountCreatedScreen3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void JointAccountCreatedLoadedScreen(final JointAccountCreatedViewState state, final JointAccountCreatedScreen3 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        SystemUiController systemUiControllerRememberSystemUiController;
        long jM21255getDayXrayLight0d7_KjU;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(87764516);
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
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
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
                    ComposerKt.traceEventStart(87764516, i3, -1, "com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedLoadedScreen (JointAccountCreatedScreen.kt:53)");
                }
                FetchJointAccountCreatedResponseDto.ViewModelDto view_model = state.getResponse().getView_model();
                systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                jM21255getDayXrayLight0d7_KjU = BentoColor.INSTANCE.m21255getDayXrayLight0d7_KjU();
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_POST_CREATION, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, state.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(-2013541287, true, new C201381(modifier3, view_model, callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21255getDayXrayLight0d7_KjU);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new JointAccountCreatedScreen6(systemUiControllerRememberSystemUiController, jM21255getDayXrayLight0d7_KjU, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return JointAccountCreatedScreen4.JointAccountCreatedLoadedScreen$lambda$1(state, callbacks, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            FetchJointAccountCreatedResponseDto.ViewModelDto view_model2 = state.getResponse().getView_model();
            systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
            jM21255getDayXrayLight0d7_KjU = BentoColor.INSTANCE.m21255getDayXrayLight0d7_KjU();
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_POST_CREATION, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, state.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(-2013541287, true, new C201381(modifier3, view_model2, callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21255getDayXrayLight0d7_KjU);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new JointAccountCreatedScreen6(systemUiControllerRememberSystemUiController, jM21255getDayXrayLight0d7_KjU, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult JointAccountCreatedScreen$lambda$4$lambda$3(final SystemUiController systemUiController, final long j, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreenKt$JointAccountCreatedScreen$lambda$4$lambda$3$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
            }
        };
    }

    /* compiled from: JointAccountCreatedScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreenKt$JointAccountCreatedLoadedScreen$1 */
    static final class C201381 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ JointAccountCreatedScreen3 $callbacks;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ FetchJointAccountCreatedResponseDto.ViewModelDto $viewModel;

        C201381(Modifier modifier, FetchJointAccountCreatedResponseDto.ViewModelDto viewModelDto, JointAccountCreatedScreen3 jointAccountCreatedScreen3) {
            this.$modifier = modifier;
            this.$viewModel = viewModelDto;
            this.$callbacks = jointAccountCreatedScreen3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            String hero_url;
            String body_text;
            String title;
            String title_text;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2013541287, i, -1, "com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedLoadedScreen.<anonymous> (JointAccountCreatedScreen.kt:70)");
            }
            Modifier modifier = this.$modifier;
            final FetchJointAccountCreatedResponseDto.ViewModelDto viewModelDto = this.$viewModel;
            final JointAccountCreatedScreen3 jointAccountCreatedScreen3 = this.$callbacks;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            if (viewModelDto == null || (hero_url = viewModelDto.getHero_url()) == null) {
                hero_url = "";
            }
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(jointAccountCreatedScreen3);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new JointAccountCreatedScreen5(jointAccountCreatedScreen3);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Components5.JointAccountOnboardingHeroHeader(hero_url, companion.getCenter(), (Function0) ((KFunction) objRememberedValue), Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer, 48, 0);
            Modifier modifierWeight$default = Column5.weight$default(column6, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierWeight$default);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i2).getJet(), 0.0f, composer, 0, 5);
            BentoText2.m20747BentoText38GnDrw((viewModelDto == null || (title_text = viewModelDto.getTitle_text()) == null) ? "" : title_text, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), composer, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getBookCoverCapsuleSmall(), composer, 0, 0, 8188);
            if (viewModelDto == null || (body_text = viewModelDto.getBody_text()) == null) {
                body_text = "";
            }
            BentoText2.m20747BentoText38GnDrw(body_text, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
            composer.endNode();
            composer.endNode();
            AccountCreationCtaDto cta = viewModelDto != null ? viewModelDto.getCta() : null;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(jointAccountCreatedScreen3) | composer.changedInstance(viewModelDto);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreenKt$JointAccountCreatedLoadedScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return JointAccountCreatedScreen4.C201381.invoke$lambda$5$lambda$4$lambda$3(jointAccountCreatedScreen3, viewModelDto);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, (cta == null || (title = cta.getTitle()) == null) ? "" : title, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(JointAccountCreatedScreen3 jointAccountCreatedScreen3, FetchJointAccountCreatedResponseDto.ViewModelDto viewModelDto) {
            String cta_deeplink;
            if (viewModelDto == null || (cta_deeplink = viewModelDto.getCta_deeplink()) == null) {
                cta_deeplink = "";
            }
            jointAccountCreatedScreen3.onCtaClicked(cta_deeplink);
            return Unit.INSTANCE;
        }
    }

    public static final void JointAccountCreatedScreen(final AsyncResult<JointAccountCreatedViewState> state, final JointAccountCreatedScreen3 callbacks, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1554024463);
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
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1554024463, i3, -1, "com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreen (JointAccountCreatedScreen.kt:126)");
            }
            final long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            final SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2006925436, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreenKt.JointAccountCreatedScreen.1
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
                        ComposerKt.traceEventStart(2006925436, i5, -1, "com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreen.<anonymous> (JointAccountCreatedScreen.kt:130)");
                    }
                    AsyncResult<JointAccountCreatedViewState> asyncResult = state;
                    if (asyncResult instanceof AsyncResult.Failure) {
                        composer2.startReplaceGroup(-1923985277);
                        JointAccountCreatedScreen3 jointAccountCreatedScreen3 = callbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged = composer2.changed(jointAccountCreatedScreen3);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new JointAccountCreatedScreen7(jointAccountCreatedScreen3);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifier2 = modifier;
                        final JointAccountCreatedScreen3 jointAccountCreatedScreen32 = callbacks;
                        Components5.m15755JointAccountOnboardingScaffoldzcDBAo0((Function0) ((KFunction) objRememberedValue), modifier2, false, 0L, 0L, false, 0L, ComposableLambda3.rememberComposableLambda(423569567, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreenKt.JointAccountCreatedScreen.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i6 & 6) == 0) {
                                    i7 = (composer3.changed(paddingValues) ? 4 : 2) | i6;
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(423569567, i7, -1, "com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreen.<anonymous>.<anonymous> (JointAccountCreatedScreen.kt:136)");
                                }
                                JointAccountCreatedScreen3 jointAccountCreatedScreen33 = jointAccountCreatedScreen32;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged2 = composer3.changed(jointAccountCreatedScreen33);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new JointAccountCreatedScreen8(jointAccountCreatedScreen33);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), JointAccountCreatedScreen4.JointAccountCreatedErrorTag), (Function0) ((KFunction) objRememberedValue2), 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        composer2.endReplaceGroup();
                    } else if (asyncResult instanceof AsyncResult.Loading) {
                        composer2.startReplaceGroup(-1923436422);
                        JointAccountCreatedScreen3 jointAccountCreatedScreen33 = callbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged2 = composer2.changed(jointAccountCreatedScreen33);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new JointAccountCreatedScreen9(jointAccountCreatedScreen33);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        Components5.m15755JointAccountOnboardingScaffoldzcDBAo0((Function0) ((KFunction) objRememberedValue2), modifier, false, 0L, 0L, false, 0L, JointAccountCreatedScreen.INSTANCE.m2146x22c85fbb(), composer2, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(asyncResult instanceof AsyncResult.Success)) {
                            composer2.startReplaceGroup(215029786);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-1922946746);
                        JointAccountCreatedScreen4.JointAccountCreatedLoadedScreen((JointAccountCreatedViewState) ((AsyncResult.Success) state).getValue(), callbacks, WindowInsetsPadding_androidKt.navigationBarsPadding(modifier), composer2, 0, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return JointAccountCreatedScreen4.JointAccountCreatedScreen$lambda$4$lambda$3(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountCreatedScreen4.JointAccountCreatedScreen$lambda$5(state, callbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
