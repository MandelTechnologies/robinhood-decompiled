package com.robinhood.android.transfers.p271ui.max.i18n.composable;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.SwitchableTickerInputView2;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.SwitchableTickerInputViewData;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferViewState;
import com.robinhood.android.transfers.p271ui.max.i18n.composable.CreateTransferScreen;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CreateTransferScreen.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, m3636d2 = {"CreateTransferScreen", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "showFxRateSheet", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo;", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/navigation/Navigator;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease", "state", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferScreen$lambda$1(Screen screen, Navigator navigator, Function0 function0, Modifier modifier, InternationalTransferDuxo internationalTransferDuxo, int i, int i2, Composer composer, int i3) {
        CreateTransferScreen(screen, navigator, function0, modifier, internationalTransferDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateTransferScreen(final Screen screen, final Navigator navigator, final Function0<Unit> showFxRateSheet, Modifier modifier, InternationalTransferDuxo internationalTransferDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final InternationalTransferDuxo internationalTransferDuxo2;
        Modifier modifier3;
        InternationalTransferDuxo internationalTransferDuxo3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(showFxRateSheet, "showFxRateSheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(-450402306);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(screen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showFxRateSheet) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    internationalTransferDuxo2 = internationalTransferDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(internationalTransferDuxo2) ? 16384 : 8192;
                    i3 |= i5;
                } else {
                    internationalTransferDuxo2 = internationalTransferDuxo;
                }
                i3 |= i5;
            } else {
                internationalTransferDuxo2 = internationalTransferDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InternationalTransferDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$$inlined$duxo$1.1
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
                        i3 &= -57345;
                        modifier3 = modifier4;
                        internationalTransferDuxo3 = (InternationalTransferDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450402306, i3, -1, "com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreen (CreateTransferScreen.kt:32)");
                        }
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(internationalTransferDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composer2 = composerStartRestartGroup;
                        final Modifier modifier5 = modifier3;
                        final InternationalTransferDuxo internationalTransferDuxo4 = internationalTransferDuxo3;
                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(CreateTransferScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).getUserInteractionEventDescriptor(), null, screen, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1667707159, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt.CreateTransferScreen.1

                            /* compiled from: CreateTransferScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ InternationalTransferDuxo $duxo;
                                final /* synthetic */ Modifier $modifier;
                                final /* synthetic */ Navigator $navigator;
                                final /* synthetic */ Function0<Unit> $showFxRateSheet;
                                final /* synthetic */ SnapshotState4<InternationalTransferViewState> $state$delegate;

                                AnonymousClass1(Modifier modifier, InternationalTransferDuxo internationalTransferDuxo, SnapshotState4<InternationalTransferViewState> snapshotState4, Navigator navigator, Function0<Unit> function0) {
                                    this.$modifier = modifier;
                                    this.$duxo = internationalTransferDuxo;
                                    this.$state$delegate = snapshotState4;
                                    this.$navigator = navigator;
                                    this.$showFxRateSheet = function0;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final int invoke$lambda$10$lambda$3$lambda$2(int i) {
                                    return -i;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final int invoke$lambda$10$lambda$5$lambda$4(int i) {
                                    return i;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final int invoke$lambda$10$lambda$7$lambda$6(int i) {
                                    return i;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final int invoke$lambda$10$lambda$9$lambda$8(int i) {
                                    return i;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$10$lambda$1$lambda$0(InternationalTransferDuxo internationalTransferDuxo) {
                                    internationalTransferDuxo.currencySwitcherSelected();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1079427714, i, -1, "com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreen.<anonymous>.<anonymous> (CreateTransferScreen.kt:40)");
                                    }
                                    Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(SizeKt.fillMaxHeight$default(this.$modifier, 0.0f, 1, null), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composer, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                                    final InternationalTransferDuxo internationalTransferDuxo = this.$duxo;
                                    SnapshotState4<InternationalTransferViewState> snapshotState4 = this.$state$delegate;
                                    Navigator navigator = this.$navigator;
                                    Function0<Unit> function0 = this.$showFxRateSheet;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierWindowInsetsPadding);
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer, 0);
                                    SwitchableTickerInputViewData switcherDisplayData = CreateTransferScreen.CreateTransferScreen$lambda$0(snapshotState4).getSwitcherDisplayData();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(internationalTransferDuxo);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CreateTransferScreen.C307691.AnonymousClass1.invoke$lambda$10$lambda$1$lambda$0(internationalTransferDuxo);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    SwitchableTickerInputView2.SwitchableTickerInputView(switcherDisplayData, (Function0) objRememberedValue, null, composer, SwitchableTickerInputViewData.$stable, 4);
                                    Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer, 0);
                                    boolean z = CreateTransferScreen.CreateTransferScreen$lambda$0(snapshotState4).getTransferEditScreenData() != null;
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    Composer.Companion companion3 = Composer.INSTANCE;
                                    if (objRememberedValue2 == companion3.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return Integer.valueOf(CreateTransferScreen.C307691.AnonymousClass1.invoke$lambda$10$lambda$3$lambda$2(((Integer) obj).intValue()));
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    EnterTransition enterTransitionSlideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue2, 1, null);
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (objRememberedValue3 == companion3.getEmpty()) {
                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return Integer.valueOf(CreateTransferScreen.C307691.AnonymousClass1.invoke$lambda$10$lambda$5$lambda$4(((Integer) obj).intValue()));
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer.endReplaceGroup();
                                    AnimatedVisibilityKt.AnimatedVisibility(column6, z, (Modifier) null, enterTransitionSlideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue3, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-1435587344, true, new CreateTransferScreen2(snapshotState4, internationalTransferDuxo, navigator), composer, 54), composer, 1600518, 18);
                                    boolean z2 = CreateTransferScreen.CreateTransferScreen$lambda$0(snapshotState4).getTransferReviewScreenData() != null;
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue4 = composer.rememberedValue();
                                    if (objRememberedValue4 == companion3.getEmpty()) {
                                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return Integer.valueOf(CreateTransferScreen.C307691.AnonymousClass1.invoke$lambda$10$lambda$7$lambda$6(((Integer) obj).intValue()));
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer.endReplaceGroup();
                                    EnterTransition enterTransitionSlideInHorizontally$default2 = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue4, 1, null);
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue5 = composer.rememberedValue();
                                    if (objRememberedValue5 == companion3.getEmpty()) {
                                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return Integer.valueOf(CreateTransferScreen.C307691.AnonymousClass1.invoke$lambda$10$lambda$9$lambda$8(((Integer) obj).intValue()));
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer.endReplaceGroup();
                                    AnimatedVisibilityKt.AnimatedVisibility(column6, z2, (Modifier) null, enterTransitionSlideInHorizontally$default2, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue5, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-1401921895, true, new CreateTransferScreen3(snapshotState4, internationalTransferDuxo, function0), composer, 54), composer, 1600518, 18);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }

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
                                    ComposerKt.traceEventStart(-1667707159, i6, -1, "com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreen.<anonymous> (CreateTransferScreen.kt:39)");
                                }
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1079427714, true, new AnonymousClass1(modifier5, internationalTransferDuxo4, snapshotState4CollectAsStateWithLifecycle, navigator, showFxRateSheet), composer3, 54), composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier5;
                        internationalTransferDuxo2 = internationalTransferDuxo4;
                    } else {
                        modifier3 = modifier4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                }
                internationalTransferDuxo3 = internationalTransferDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<InternationalTransferViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(internationalTransferDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composer2 = composerStartRestartGroup;
                final Modifier modifier52 = modifier3;
                final InternationalTransferDuxo internationalTransferDuxo42 = internationalTransferDuxo3;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(CreateTransferScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getUserInteractionEventDescriptor(), null, screen, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1667707159, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt.CreateTransferScreen.1

                    /* compiled from: CreateTransferScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ InternationalTransferDuxo $duxo;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ Function0<Unit> $showFxRateSheet;
                        final /* synthetic */ SnapshotState4<InternationalTransferViewState> $state$delegate;

                        AnonymousClass1(Modifier modifier, InternationalTransferDuxo internationalTransferDuxo, SnapshotState4<InternationalTransferViewState> snapshotState4, Navigator navigator, Function0<Unit> function0) {
                            this.$modifier = modifier;
                            this.$duxo = internationalTransferDuxo;
                            this.$state$delegate = snapshotState4;
                            this.$navigator = navigator;
                            this.$showFxRateSheet = function0;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$10$lambda$3$lambda$2(int i) {
                            return -i;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$10$lambda$5$lambda$4(int i) {
                            return i;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$10$lambda$7$lambda$6(int i) {
                            return i;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$10$lambda$9$lambda$8(int i) {
                            return i;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$10$lambda$1$lambda$0(InternationalTransferDuxo internationalTransferDuxo) {
                            internationalTransferDuxo.currencySwitcherSelected();
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1079427714, i, -1, "com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreen.<anonymous>.<anonymous> (CreateTransferScreen.kt:40)");
                            }
                            Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(SizeKt.fillMaxHeight$default(this.$modifier, 0.0f, 1, null), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composer, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                            final InternationalTransferDuxo internationalTransferDuxo = this.$duxo;
                            SnapshotState4<InternationalTransferViewState> snapshotState4 = this.$state$delegate;
                            Navigator navigator = this.$navigator;
                            Function0<Unit> function0 = this.$showFxRateSheet;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierWindowInsetsPadding);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer, 0);
                            SwitchableTickerInputViewData switcherDisplayData = CreateTransferScreen.CreateTransferScreen$lambda$0(snapshotState4).getSwitcherDisplayData();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(internationalTransferDuxo);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CreateTransferScreen.C307691.AnonymousClass1.invoke$lambda$10$lambda$1$lambda$0(internationalTransferDuxo);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            SwitchableTickerInputView2.SwitchableTickerInputView(switcherDisplayData, (Function0) objRememberedValue, null, composer, SwitchableTickerInputViewData.$stable, 4);
                            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer, 0);
                            boolean z = CreateTransferScreen.CreateTransferScreen$lambda$0(snapshotState4).getTransferEditScreenData() != null;
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue2 == companion3.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(CreateTransferScreen.C307691.AnonymousClass1.invoke$lambda$10$lambda$3$lambda$2(((Integer) obj).intValue()));
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            EnterTransition enterTransitionSlideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue2, 1, null);
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (objRememberedValue3 == companion3.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(CreateTransferScreen.C307691.AnonymousClass1.invoke$lambda$10$lambda$5$lambda$4(((Integer) obj).intValue()));
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            AnimatedVisibilityKt.AnimatedVisibility(column6, z, (Modifier) null, enterTransitionSlideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue3, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-1435587344, true, new CreateTransferScreen2(snapshotState4, internationalTransferDuxo, navigator), composer, 54), composer, 1600518, 18);
                            boolean z2 = CreateTransferScreen.CreateTransferScreen$lambda$0(snapshotState4).getTransferReviewScreenData() != null;
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (objRememberedValue4 == companion3.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(CreateTransferScreen.C307691.AnonymousClass1.invoke$lambda$10$lambda$7$lambda$6(((Integer) obj).intValue()));
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            EnterTransition enterTransitionSlideInHorizontally$default2 = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue4, 1, null);
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composer.rememberedValue();
                            if (objRememberedValue5 == companion3.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(CreateTransferScreen.C307691.AnonymousClass1.invoke$lambda$10$lambda$9$lambda$8(((Integer) obj).intValue()));
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue5);
                            }
                            composer.endReplaceGroup();
                            AnimatedVisibilityKt.AnimatedVisibility(column6, z2, (Modifier) null, enterTransitionSlideInHorizontally$default2, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue5, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-1401921895, true, new CreateTransferScreen3(snapshotState4, internationalTransferDuxo, function0), composer, 54), composer, 1600518, 18);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

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
                            ComposerKt.traceEventStart(-1667707159, i6, -1, "com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreen.<anonymous> (CreateTransferScreen.kt:39)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1079427714, true, new AnonymousClass1(modifier52, internationalTransferDuxo42, snapshotState4CollectAsStateWithLifecycle2, navigator, showFxRateSheet), composer3, 54), composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier52;
                internationalTransferDuxo2 = internationalTransferDuxo42;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateTransferScreen.CreateTransferScreen$lambda$1(screen, navigator, showFxRateSheet, modifier2, internationalTransferDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternationalTransferViewState CreateTransferScreen$lambda$0(SnapshotState4<InternationalTransferViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
