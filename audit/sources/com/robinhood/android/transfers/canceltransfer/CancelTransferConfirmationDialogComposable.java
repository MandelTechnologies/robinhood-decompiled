package com.robinhood.android.transfers.canceltransfer;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposable;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
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

/* compiled from: CancelTransferConfirmationDialogComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"CancelTransferConfirmationDialogComposable", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "dismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDuxo;", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-transfer-hub_externalDebug", "viewState", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CancelTransferConfirmationDialogComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CancelTransferConfirmationDialogComposable$lambda$1(EventLogger eventLogger, Component component, Screen screen, Function0 function0, Modifier modifier, CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo, int i, int i2, Composer composer, int i3) {
        CancelTransferConfirmationDialogComposable(eventLogger, component, screen, function0, modifier, cancelTransferConfirmationDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CancelTransferConfirmationDialogComposable(final EventLogger eventLogger, final Component component, final Screen screen, final Function0<Unit> dismiss, Modifier modifier, CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo2;
        Composer composer2;
        int i4;
        CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1923655685);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventLogger) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(component) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dismiss) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    cancelTransferConfirmationDuxo2 = cancelTransferConfirmationDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cancelTransferConfirmationDuxo2) ? 131072 : 65536;
                    i3 |= i6;
                } else {
                    cancelTransferConfirmationDuxo2 = cancelTransferConfirmationDuxo;
                }
                i3 |= i6;
            } else {
                cancelTransferConfirmationDuxo2 = cancelTransferConfirmationDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 32) == 0) {
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CancelTransferConfirmationDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposableKt$CancelTransferConfirmationDialogComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposableKt$CancelTransferConfirmationDialogComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-458753);
                        cancelTransferConfirmationDuxo3 = (CancelTransferConfirmationDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = i3;
                        cancelTransferConfirmationDuxo3 = cancelTransferConfirmationDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i4 = i3;
                    cancelTransferConfirmationDuxo3 = cancelTransferConfirmationDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1923655685, i4, -1, "com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposable (CancelTransferConfirmationDialogComposable.kt:32)");
                }
                Composer composer4 = composer2;
                Modifier modifier4 = modifier2;
                composer3 = composer4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1053879590, true, new C301921(modifier4, eventLogger, screen, component, cancelTransferConfirmationDuxo3, dismiss, FlowExtKt.collectAsStateWithLifecycle(cancelTransferConfirmationDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7)), composer3, 54), composer3, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cancelTransferConfirmationDuxo4 = cancelTransferConfirmationDuxo3;
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                cancelTransferConfirmationDuxo4 = cancelTransferConfirmationDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CancelTransferConfirmationDialogComposable.CancelTransferConfirmationDialogComposable$lambda$1(eventLogger, component, screen, dismiss, modifier3, cancelTransferConfirmationDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                Modifier modifier42 = modifier2;
                composer3 = composer42;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1053879590, true, new C301921(modifier42, eventLogger, screen, component, cancelTransferConfirmationDuxo3, dismiss, FlowExtKt.collectAsStateWithLifecycle(cancelTransferConfirmationDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7)), composer3, 54), composer3, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                cancelTransferConfirmationDuxo4 = cancelTransferConfirmationDuxo3;
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CancelTransferConfirmationDialogComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposableKt$CancelTransferConfirmationDialogComposable$1 */
    static final class C301921 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Component $component;
        final /* synthetic */ Function0<Unit> $dismiss;
        final /* synthetic */ CancelTransferConfirmationDuxo $duxo;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Screen $screen;
        final /* synthetic */ SnapshotState4<CancelTransferConfirmationViewState> $viewState$delegate;

        C301921(Modifier modifier, EventLogger eventLogger, Screen screen, Component component, CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo, Function0<Unit> function0, SnapshotState4<CancelTransferConfirmationViewState> snapshotState4) {
            this.$modifier = modifier;
            this.$eventLogger = eventLogger;
            this.$screen = screen;
            this.$component = component;
            this.$duxo = cancelTransferConfirmationDuxo;
            this.$dismiss = function0;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(EventLogger eventLogger, Screen screen, Component component, CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CANCEL_TRANSFER, screen, component, null, null, false, 56, null);
            cancelTransferConfirmationDuxo.cancelTransfer();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(EventLogger eventLogger, Screen screen, Component component, Function0 function0) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DISMISS, screen, component, null, null, false, 56, null);
            function0.invoke();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1053879590, i, -1, "com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposable.<anonymous> (CancelTransferConfirmationDialogComposable.kt:35)");
            }
            Modifier modifier = this.$modifier;
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final EventLogger eventLogger = this.$eventLogger;
            final Screen screen = this.$screen;
            final Component component = this.$component;
            final CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo = this.$duxo;
            final Function0<Unit> function0 = this.$dismiss;
            final SnapshotState4<CancelTransferConfirmationViewState> snapshotState4 = this.$viewState$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
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
            String strStringResource = StringResources_androidKt.stringResource(C30556R.string.cancel_transfer, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
            LocalShowPlaceholder.Loadable(CancelTransferConfirmationDialogComposable.CancelTransferConfirmationDialogComposable$lambda$0(snapshotState4).isLoadingMessage(), null, null, ComposableLambda3.rememberComposableLambda(-1542287084, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposableKt$CancelTransferConfirmationDialogComposable$1$1$1
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
                        ComposerKt.traceEventStart(-1542287084, i3, -1, "com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposable.<anonymous>.<anonymous>.<anonymous> (CancelTransferConfirmationDialogComposable.kt:49)");
                    }
                    String textAsString = StringResources6.getTextAsString(CancelTransferConfirmationDialogComposable.CancelTransferConfirmationDialogComposable$lambda$0(snapshotState4).getMessage(), composer2, StringResource.$stable);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(textAsString, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextM(), composer2, 0, 0, 8124);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 3072, 6);
            String strStringResource2 = StringResources_androidKt.stringResource(C30556R.string.cancel_transfer, composer, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C30556R.string.never_mind, composer, 0);
            boolean zIsPrimaryButtonLoading = CancelTransferConfirmationDialogComposable.CancelTransferConfirmationDialogComposable$lambda$0(snapshotState4).isPrimaryButtonLoading();
            boolean zIsSecondaryButtonDisabled = CancelTransferConfirmationDialogComposable.CancelTransferConfirmationDialogComposable$lambda$0(snapshotState4).isSecondaryButtonDisabled();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(eventLogger) | composer.changedInstance(screen) | composer.changedInstance(component) | composer.changedInstance(cancelTransferConfirmationDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposableKt$CancelTransferConfirmationDialogComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CancelTransferConfirmationDialogComposable.C301921.invoke$lambda$4$lambda$1$lambda$0(eventLogger, screen, component, cancelTransferConfirmationDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composer.changedInstance(eventLogger) | composer.changedInstance(screen) | composer.changedInstance(component) | composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogComposableKt$CancelTransferConfirmationDialogComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CancelTransferConfirmationDialogComposable.C301921.invoke$lambda$4$lambda$3$lambda$2(eventLogger, screen, component, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function02, strStringResource2, zIsPrimaryButtonLoading, null, false, (Function0) objRememberedValue2, strStringResource3, false, null, zIsSecondaryButtonDisabled, composer, 0, 0, 26175);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CancelTransferConfirmationViewState CancelTransferConfirmationDialogComposable$lambda$0(SnapshotState4<CancelTransferConfirmationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
