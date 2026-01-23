package com.robinhood.android.optionsupgrade;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposable;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionOnboardingDisclosureComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a7\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\u000f\u001a)\u0010\u0010\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"OptionOnboardingDisclosureComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDuxo;", "onDismissLoadingErrorDialog", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AgreementWithButton", "viewState", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureViewState;", "initialHasReviewedDisclosure", "", "onAgreeClicked", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureViewState;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LoadingErrorDialog", "onRetry", "onDismissed", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SigningErrorDialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-options-upgrade_externalDebug", "hasReviewedDisclosure"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingDisclosureComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgreementWithButton$lambda$6(OptionOnboardingDisclosureViewState optionOnboardingDisclosureViewState, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        AgreementWithButton(optionOnboardingDisclosureViewState, modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingErrorDialog$lambda$7(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        LoadingErrorDialog(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingDisclosureComposable$lambda$1(Modifier modifier, OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo, Function0 function0, int i, int i2, Composer composer, int i3) {
        OptionOnboardingDisclosureComposable(modifier, optionOnboardingDisclosureDuxo, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SigningErrorDialog$lambda$8(Function0 function0, int i, Composer composer, int i2) {
        SigningErrorDialog(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOnboardingDisclosureComposable(final Modifier modifier, final OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo, final Function0<Unit> onDismissLoadingErrorDialog, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onDismissLoadingErrorDialog, "onDismissLoadingErrorDialog");
        Composer composerStartRestartGroup = composer.startRestartGroup(548789568);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(optionOnboardingDisclosureDuxo)) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissLoadingErrorDialog) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionOnboardingDisclosureDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt$OptionOnboardingDisclosureComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt$OptionOnboardingDisclosureComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    optionOnboardingDisclosureDuxo = (OptionOnboardingDisclosureDuxo) baseDuxo;
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(548789568, i3, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposable (OptionOnboardingDisclosureComposable.kt:36)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(optionOnboardingDisclosureDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(47467659, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt.OptionOnboardingDisclosureComposable.1

                    /* compiled from: OptionOnboardingDisclosureComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt$OptionOnboardingDisclosureComposable$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[OptionOnboardingDisclosureStates.values().length];
                            try {
                                iArr[OptionOnboardingDisclosureStates.NONE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[OptionOnboardingDisclosureStates.LOADING_ERROR.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[OptionOnboardingDisclosureStates.SIGNING_ERROR.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

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
                            ComposerKt.traceEventStart(47467659, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposable.<anonymous> (OptionOnboardingDisclosureComposable.kt:40)");
                        }
                        OptionOnboardingDisclosureViewState optionOnboardingDisclosureViewStateOptionOnboardingDisclosureComposable$lambda$0 = OptionOnboardingDisclosureComposable.OptionOnboardingDisclosureComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo2 = optionOnboardingDisclosureDuxo;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(optionOnboardingDisclosureDuxo2);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new OptionOnboardingDisclosureComposable5(optionOnboardingDisclosureDuxo2);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        OptionOnboardingDisclosureComposable.AgreementWithButton(optionOnboardingDisclosureViewStateOptionOnboardingDisclosureComposable$lambda$0, modifier, false, (Function0) ((KFunction) objRememberedValue2), composer2, 0, 4);
                        int i6 = WhenMappings.$EnumSwitchMapping$0[OptionOnboardingDisclosureComposable.OptionOnboardingDisclosureComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getErrorDialog().ordinal()];
                        if (i6 == 1) {
                            composer2.startReplaceGroup(-1628212433);
                            composer2.endReplaceGroup();
                        } else if (i6 == 2) {
                            composer2.startReplaceGroup(-1628210698);
                            OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo3 = optionOnboardingDisclosureDuxo;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer2.changedInstance(optionOnboardingDisclosureDuxo3);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new OptionOnboardingDisclosureComposable6(optionOnboardingDisclosureDuxo3);
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            OptionOnboardingDisclosureComposable.LoadingErrorDialog((Function0) ((KFunction) objRememberedValue3), onDismissLoadingErrorDialog, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (i6 != 3) {
                                composer2.startReplaceGroup(-1628214172);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-1628204789);
                            OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo4 = optionOnboardingDisclosureDuxo;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance4 = composer2.changedInstance(optionOnboardingDisclosureDuxo4);
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new OptionOnboardingDisclosureComposable7(optionOnboardingDisclosureDuxo4);
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceGroup();
                            OptionOnboardingDisclosureComposable.SigningErrorDialog((Function0) ((KFunction) objRememberedValue4), composer2, 0);
                            composer2.endReplaceGroup();
                        }
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
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<OptionOnboardingDisclosureViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(optionOnboardingDisclosureDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(47467659, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt.OptionOnboardingDisclosureComposable.1

                    /* compiled from: OptionOnboardingDisclosureComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt$OptionOnboardingDisclosureComposable$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[OptionOnboardingDisclosureStates.values().length];
                            try {
                                iArr[OptionOnboardingDisclosureStates.NONE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[OptionOnboardingDisclosureStates.LOADING_ERROR.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[OptionOnboardingDisclosureStates.SIGNING_ERROR.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

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
                            ComposerKt.traceEventStart(47467659, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposable.<anonymous> (OptionOnboardingDisclosureComposable.kt:40)");
                        }
                        OptionOnboardingDisclosureViewState optionOnboardingDisclosureViewStateOptionOnboardingDisclosureComposable$lambda$0 = OptionOnboardingDisclosureComposable.OptionOnboardingDisclosureComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                        OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo2 = optionOnboardingDisclosureDuxo;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(optionOnboardingDisclosureDuxo2);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new OptionOnboardingDisclosureComposable5(optionOnboardingDisclosureDuxo2);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        OptionOnboardingDisclosureComposable.AgreementWithButton(optionOnboardingDisclosureViewStateOptionOnboardingDisclosureComposable$lambda$0, modifier, false, (Function0) ((KFunction) objRememberedValue2), composer2, 0, 4);
                        int i6 = WhenMappings.$EnumSwitchMapping$0[OptionOnboardingDisclosureComposable.OptionOnboardingDisclosureComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getErrorDialog().ordinal()];
                        if (i6 == 1) {
                            composer2.startReplaceGroup(-1628212433);
                            composer2.endReplaceGroup();
                        } else if (i6 == 2) {
                            composer2.startReplaceGroup(-1628210698);
                            OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo3 = optionOnboardingDisclosureDuxo;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer2.changedInstance(optionOnboardingDisclosureDuxo3);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new OptionOnboardingDisclosureComposable6(optionOnboardingDisclosureDuxo3);
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            OptionOnboardingDisclosureComposable.LoadingErrorDialog((Function0) ((KFunction) objRememberedValue3), onDismissLoadingErrorDialog, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (i6 != 3) {
                                composer2.startReplaceGroup(-1628214172);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-1628204789);
                            OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo4 = optionOnboardingDisclosureDuxo;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance4 = composer2.changedInstance(optionOnboardingDisclosureDuxo4);
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new OptionOnboardingDisclosureComposable7(optionOnboardingDisclosureDuxo4);
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceGroup();
                            OptionOnboardingDisclosureComposable.SigningErrorDialog((Function0) ((KFunction) objRememberedValue4), composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        final Modifier modifier2 = modifier;
        final OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo2 = optionOnboardingDisclosureDuxo;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingDisclosureComposable.OptionOnboardingDisclosureComposable$lambda$1(modifier2, optionOnboardingDisclosureDuxo2, onDismissLoadingErrorDialog, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AgreementWithButton(OptionOnboardingDisclosureViewState optionOnboardingDisclosureViewState, Modifier modifier, boolean z, final Function0<Unit> onAgreeClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Object objRememberedValue;
        Composer.Companion companion;
        final ScrollState scrollStateRememberScrollState;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue3;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final OptionOnboardingDisclosureViewState viewState = optionOnboardingDisclosureViewState;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onAgreeClicked, "onAgreeClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1035489254);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
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
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onAgreeClicked) ? 2048 : 1024;
                }
                i5 = i3;
                if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035489254, i5, -1, "com.robinhood.android.optionsupgrade.AgreementWithButton (OptionOnboardingDisclosureComposable.kt:66)");
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean boolValueOf = Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
                    Boolean boolValueOf2 = Boolean.valueOf(viewState.getMarkdown() != null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = ((i5 & 14) != 4) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new OptionOnboardingDisclosureComposable2(viewState, scrollStateRememberScrollState, snapshotState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
                    viewState = optionOnboardingDisclosureViewState;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier4, false, ComposableLambda3.rememberComposableLambda(1142652177, true, new C249182(coroutineScope, scrollStateRememberScrollState, optionOnboardingDisclosureViewState, snapshotState, onAgreeClicked), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(720413694, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt.AgreementWithButton.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                            invoke(boxScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i7) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i7 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(720413694, i7, -1, "com.robinhood.android.optionsupgrade.AgreementWithButton.<anonymous> (OptionOnboardingDisclosureComposable.kt:79)");
                            }
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ScrollKt.verticalScroll$default(Modifier.INSTANCE, scrollStateRememberScrollState, false, null, false, 14, null), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                            OptionOnboardingDisclosureViewState optionOnboardingDisclosureViewState2 = viewState;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String markdown = optionOnboardingDisclosureViewState2.getMarkdown();
                            if (markdown == null) {
                                markdown = "";
                            }
                            BentoMarkdownText2.BentoMarkdownText(markdown, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 3) & 14) | 3456, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z3 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionOnboardingDisclosureComposable.AgreementWithButton$lambda$6(viewState, modifier3, z3, onAgreeClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i2 & 8) != 0) {
            }
            i5 = i3;
            if ((i5 & 1171) != 1170) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf3 = Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
                Boolean boolValueOf22 = Boolean.valueOf(viewState.getMarkdown() != null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = ((i5 & 14) != 4) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue3 = new OptionOnboardingDisclosureComposable2(viewState, scrollStateRememberScrollState, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf3, boolValueOf22, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
                    viewState = optionOnboardingDisclosureViewState;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier4, false, ComposableLambda3.rememberComposableLambda(1142652177, true, new C249182(coroutineScope2, scrollStateRememberScrollState, optionOnboardingDisclosureViewState, snapshotState, onAgreeClicked), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(720413694, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt.AgreementWithButton.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                            invoke(boxScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i7) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i7 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(720413694, i7, -1, "com.robinhood.android.optionsupgrade.AgreementWithButton.<anonymous> (OptionOnboardingDisclosureComposable.kt:79)");
                            }
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ScrollKt.verticalScroll$default(Modifier.INSTANCE, scrollStateRememberScrollState, false, null, false, 14, null), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                            OptionOnboardingDisclosureViewState optionOnboardingDisclosureViewState2 = viewState;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String markdown = optionOnboardingDisclosureViewState2.getMarkdown();
                            if (markdown == null) {
                                markdown = "";
                            }
                            BentoMarkdownText2.BentoMarkdownText(markdown, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 3) & 14) | 3456, 2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    z3 = z4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 8) != 0) {
        }
        i5 = i3;
        if ((i5 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AgreementWithButton$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AgreementWithButton$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOnboardingDisclosureViewState OptionOnboardingDisclosureComposable$lambda$0(SnapshotState4<OptionOnboardingDisclosureViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: OptionOnboardingDisclosureComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt$AgreementWithButton$2 */
    static final class C249182 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $hasReviewedDisclosure$delegate;
        final /* synthetic */ Function0<Unit> $onAgreeClicked;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ OptionOnboardingDisclosureViewState $viewState;

        C249182(CoroutineScope coroutineScope, ScrollState scrollState, OptionOnboardingDisclosureViewState optionOnboardingDisclosureViewState, SnapshotState<Boolean> snapshotState, Function0<Unit> function0) {
            this.$scope = coroutineScope;
            this.$scrollState = scrollState;
            this.$viewState = optionOnboardingDisclosureViewState;
            this.$hasReviewedDisclosure$delegate = snapshotState;
            this.$onAgreeClicked = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1142652177, i, -1, "com.robinhood.android.optionsupgrade.AgreementWithButton.<anonymous> (OptionOnboardingDisclosureComposable.kt:90)");
            }
            if (OptionOnboardingDisclosureComposable.AgreementWithButton$lambda$3(this.$hasReviewedDisclosure$delegate)) {
                composer.startReplaceGroup(-1159707447);
                Unit unit = Unit.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changed(this.$scrollState);
                CoroutineScope coroutineScope = this.$scope;
                ScrollState scrollState = this.$scrollState;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OptionOnboardingDisclosureComposable3(coroutineScope, scrollState, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 6);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                OptionOnboardingDisclosureViewState optionOnboardingDisclosureViewState = this.$viewState;
                Function0<Unit> function0 = this.$onAgreeClicked;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
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
                String strStringResource = StringResources_androidKt.stringResource(C25121R.string.options_upgrade_disclosure_disclaimer, composer, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8120);
                BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_action_agree, composer, 0), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, null, false, optionOnboardingDisclosureViewState.getButtonLoading(), null, null, null, null, false, null, composer, 0, 0, 8120);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1158601894);
                String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_action_review, composer, 0);
                boolean buttonLoading = this.$viewState.getButtonLoading();
                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(this.$scope) | composer.changed(this.$scrollState);
                final CoroutineScope coroutineScope2 = this.$scope;
                final ScrollState scrollState2 = this.$scrollState;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt$AgreementWithButton$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionOnboardingDisclosureComposable.C249182.invoke$lambda$3$lambda$2(coroutineScope2, scrollState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, buttonLoading, null, null, null, null, false, null, composer, 0, 0, 8120);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CoroutineScope coroutineScope, ScrollState scrollState) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OptionOnboardingDisclosureComposable4(scrollState, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingErrorDialog(final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(708610488);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(708610488, i2, -1, "com.robinhood.android.optionsupgrade.LoadingErrorDialog (OptionOnboardingDisclosureComposable.kt:135)");
            }
            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C25121R.string.options_onboarding_error_loading_agreement_dialog_title, composerStartRestartGroup, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C25121R.string.options_onboarding_error_loading_agreement_dialog_body, composerStartRestartGroup, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_retry, composerStartRestartGroup, 0), function0), null, null, null, false, null, function02, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i2 << 21) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingDisclosureComposable.LoadingErrorDialog$lambda$7(function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SigningErrorDialog(Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(1923215629);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1923215629, i2, -1, "com.robinhood.android.optionsupgrade.SigningErrorDialog (OptionOnboardingDisclosureComposable.kt:152)");
            }
            function02 = function0;
            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C25121R.string.options_onboarding_error_signing_agreement_dialog_title, composerStartRestartGroup, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C25121R.string.options_onboarding_error_signing_agreement_dialog_body, composerStartRestartGroup, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_ok, composerStartRestartGroup, 0), function0), null, null, null, false, null, function02, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i2 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingDisclosureComposable.SigningErrorDialog$lambda$8(function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
