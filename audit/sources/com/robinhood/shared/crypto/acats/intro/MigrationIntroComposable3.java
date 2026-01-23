package com.robinhood.shared.crypto.acats.intro;

import android.content.res.Resources;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.acats.C37511R;
import com.robinhood.shared.crypto.acats.MigrationExplainerDest;
import com.robinhood.shared.crypto.acats.intro.MigrationIntroComposable3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: MigrationIntroComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, m3636d2 = {"MigrationIntroComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-acats_externalRelease", "viewState", "Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.acats.intro.MigrationIntroComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MigrationIntroComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MigrationIntroComposable$lambda$1(Modifier modifier, MigrationIntroDuxo migrationIntroDuxo, int i, int i2, Composer composer, int i3) {
        MigrationIntroComposable(modifier, migrationIntroDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MigrationIntroComposable(Modifier modifier, MigrationIntroDuxo migrationIntroDuxo, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final MigrationIntroDuxo migrationIntroDuxo2;
        final Modifier modifier3;
        Composer composer2;
        MigrationIntroDuxo migrationIntroDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(347212214);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                migrationIntroDuxo2 = migrationIntroDuxo;
                int i5 = composerStartRestartGroup.changedInstance(migrationIntroDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                migrationIntroDuxo2 = migrationIntroDuxo;
            }
            i3 |= i5;
        } else {
            migrationIntroDuxo2 = migrationIntroDuxo;
        }
        int i6 = i3;
        if ((i6 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                modifier3 = modifier2;
                migrationIntroDuxo3 = migrationIntroDuxo2;
                composer2 = composerStartRestartGroup;
            } else {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(MigrationIntroDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.acats.intro.MigrationIntroComposableKt$MigrationIntroComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.acats.intro.MigrationIntroComposableKt$MigrationIntroComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                    composer2.endReplaceGroup();
                    i6 &= -113;
                    migrationIntroDuxo3 = (MigrationIntroDuxo) baseDuxo;
                } else {
                    composer2 = composerStartRestartGroup;
                    migrationIntroDuxo3 = migrationIntroDuxo2;
                }
            }
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(347212214, i6, -1, "com.robinhood.shared.crypto.acats.intro.MigrationIntroComposable (MigrationIntroComposable.kt:51)");
            }
            final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer2.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
            Composer composer4 = composer2;
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(migrationIntroDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
            composer3 = composer4;
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_INTRO, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-279170453, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.intro.MigrationIntroComposableKt.MigrationIntroComposable.1

                /* compiled from: MigrationIntroComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.acats.intro.MigrationIntroComposableKt$MigrationIntroComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ LifecycleAwareNavigator $navigator;
                    final /* synthetic */ SnapshotState4<MigrationIntroViewState> $viewState$delegate;

                    AnonymousClass1(Modifier modifier, LifecycleAwareNavigator lifecycleAwareNavigator, SnapshotState4<MigrationIntroViewState> snapshotState4) {
                        this.$modifier = modifier;
                        this.$navigator = lifecycleAwareNavigator;
                        this.$viewState$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: MigrationIntroComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.acats.intro.MigrationIntroComposableKt$MigrationIntroComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C506741 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ LifecycleAwareNavigator $navigator;
                        final /* synthetic */ SnapshotState4<MigrationIntroViewState> $viewState$delegate;

                        C506741(LifecycleAwareNavigator lifecycleAwareNavigator, SnapshotState4<MigrationIntroViewState> snapshotState4) {
                            this.$navigator = lifecycleAwareNavigator;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 6) == 0) {
                                i2 = ((i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2) | i;
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-663725727, i2, -1, "com.robinhood.shared.crypto.acats.intro.MigrationIntroComposable.<anonymous>.<anonymous>.<anonymous> (MigrationIntroComposable.kt:65)");
                            }
                            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(current) | composer.changed(this.$navigator);
                            final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.acats.intro.MigrationIntroComposableKt$MigrationIntroComposable$1$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return MigrationIntroComposable3.C375681.AnonymousClass1.C506741.invoke$lambda$1$lambda$0(current, lifecycleAwareNavigator);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBarScreenLayout.PrimaryButtonOnly(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C37511R.string.crypto_acats_label_continue, composer, 0), MigrationIntroComposable3.MigrationIntroComposable$lambda$0(this.$viewState$delegate).getLoading(), null, false, composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 98);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, LifecycleAwareNavigator lifecycleAwareNavigator) throws Resources.NotFoundException {
                            EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, null, false, 59, null);
                            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, MigrationExplainerDest.INSTANCE, null, null, false, null, 30, null);
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1295252426, i, -1, "com.robinhood.shared.crypto.acats.intro.MigrationIntroComposable.<anonymous>.<anonymous> (MigrationIntroComposable.kt:61)");
                        }
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null), false, ComposableLambda3.rememberComposableLambda(-663725727, true, new C506741(this.$navigator, this.$viewState$delegate), composer, 54), MigrationIntroComposable.INSTANCE.m24885getLambda$44591026$feature_acats_externalRelease(), composer, 3504, 0);
                        if (MigrationIntroComposable3.MigrationIntroComposable$lambda$0(this.$viewState$delegate).getShowDialog() && MigrationIntroComposable3.MigrationIntroComposable$lambda$0(this.$viewState$delegate).getDialogMessage() != null) {
                            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
                            final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
                            String strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_ineligible_title, composer, 0);
                            String dialogMessage = MigrationIntroComposable3.MigrationIntroComposable$lambda$0(this.$viewState$delegate).getDialogMessage();
                            if (dialogMessage == null) {
                                dialogMessage = "";
                            }
                            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(dialogMessage);
                            String strStringResource2 = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_label_ok, composer, 0);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(onBackPressedDispatcher);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.acats.intro.MigrationIntroComposableKt$MigrationIntroComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return MigrationIntroComposable3.C375681.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue);
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.acats.intro.MigrationIntroComposableKt$MigrationIntroComposable$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue2, composer, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.onBackPressed();
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i7) {
                    if ((i7 & 3) == 2 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-279170453, i7, -1, "com.robinhood.shared.crypto.acats.intro.MigrationIntroComposable.<anonymous> (MigrationIntroComposable.kt:60)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1295252426, true, new AnonymousClass1(modifier3, lifecycleAwareNavigator, snapshotState4CollectAsStateWithLifecycle), composer5, 54), composer5, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer3, 54), composer3, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            migrationIntroDuxo2 = migrationIntroDuxo3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.intro.MigrationIntroComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MigrationIntroComposable3.MigrationIntroComposable$lambda$1(modifier3, migrationIntroDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MigrationIntroViewState MigrationIntroComposable$lambda$0(SnapshotState4<MigrationIntroViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
