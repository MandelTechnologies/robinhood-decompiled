package com.robinhood.android.crypto.tab.p093ui.recurring;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.fragment.app.FragmentManager;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.p093ui.recurring.CryptoRecurringComposable;
import com.robinhood.android.crypto.tab.p093ui.recurring.CryptoRecurringViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CryptoRecurringComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"CryptoRecurringComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringDuxo;Landroidx/compose/runtime/Composer;II)V", CryptoRecurringComposable.RecurringDescriptionBottomSheetTag, "", "feature-crypto-tab_externalDebug", "viewState", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoRecurringComposable {
    private static final String RecurringDescriptionBottomSheetTag = "RecurringDescriptionBottomSheetTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoRecurringComposable$lambda$1(Modifier modifier, CryptoRecurringDuxo cryptoRecurringDuxo, int i, int i2, Composer composer, int i3) {
        CryptoRecurringComposable(modifier, cryptoRecurringDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CryptoRecurringComposable(Modifier modifier, CryptoRecurringDuxo cryptoRecurringDuxo, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final CryptoRecurringDuxo cryptoRecurringDuxo2;
        final Modifier modifier3;
        Composer composer2;
        CryptoRecurringDuxo cryptoRecurringDuxo3;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-631936058);
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
                cryptoRecurringDuxo2 = cryptoRecurringDuxo;
                int i5 = composerStartRestartGroup.changedInstance(cryptoRecurringDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                cryptoRecurringDuxo2 = cryptoRecurringDuxo;
            }
            i3 |= i5;
        } else {
            cryptoRecurringDuxo2 = cryptoRecurringDuxo;
        }
        int i6 = i3;
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer3 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    composer2 = composerStartRestartGroup;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoRecurringDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposableKt$CryptoRecurringComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposableKt$CryptoRecurringComposable$$inlined$duxo$1.1
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
                    cryptoRecurringDuxo3 = (CryptoRecurringDuxo) baseDuxo;
                } else {
                    composer2 = composerStartRestartGroup;
                    cryptoRecurringDuxo3 = cryptoRecurringDuxo2;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                modifier3 = modifier2;
                cryptoRecurringDuxo3 = cryptoRecurringDuxo2;
                composer2 = composerStartRestartGroup;
            }
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-631936058, i6, -1, "com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposable (CryptoRecurringComposable.kt:38)");
            }
            Composer composer4 = composer2;
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoRecurringDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
            composer3 = composer4;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null), UserInteractionEventData.Action.EDIT_RECURRING_INVESTMENT, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RecurringContext(null, null, null, null, null, 0.0d, RecurringContext.AssetType.CRYPTO, null, 0.0d, null, null, 1983, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.ROW, null, null, 6, null), null, 33, null), ComposableLambda3.rememberComposableLambda(-1870315855, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposableKt.CryptoRecurringComposable.1
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
                        ComposerKt.traceEventStart(-1870315855, i7, -1, "com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposable.<anonymous> (CryptoRecurringComposable.kt:54)");
                    }
                    boolean loading = CryptoRecurringComposable.CryptoRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoading();
                    final Modifier modifier4 = modifier3;
                    final SnapshotState4<CryptoRecurringViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(2070864673, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposableKt.CryptoRecurringComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                            invoke(composer6, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer6, int i8) {
                            if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                composer6.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2070864673, i8, -1, "com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposable.<anonymous>.<anonymous> (CryptoRecurringComposable.kt:55)");
                            }
                            HistoryRowsKt.HistorySection(CryptoRecurringComposable.CryptoRecurringComposable$lambda$0(snapshotState4).getItems(), modifier4, ComposableLambda3.rememberComposableLambda(1047823841, true, new C497591(snapshotState4), composer6, 54), ComposableLambda3.rememberComposableLambda(1706206720, true, new AnonymousClass2(snapshotState4), composer6, 54), false, false, false, true, composer6, 12586368, 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CryptoRecurringComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposableKt$CryptoRecurringComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C497591 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotState4<CryptoRecurringViewState> $viewState$delegate;

                            C497591(SnapshotState4<CryptoRecurringViewState> snapshotState4) {
                                this.$viewState$delegate = snapshotState4;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$4$lambda$2$lambda$1(android.content.Context context) {
                                FragmentManager supportFragmentManager;
                                AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
                                if (appCompatActivityFindActivityBaseContext != null && (supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager()) != null) {
                                    new RecurringDescriptionBottomSheetFragment().show(supportFragmentManager, CryptoRecurringComposable.RecurringDescriptionBottomSheetTag);
                                }
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1047823841, i, -1, "com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposable.<anonymous>.<anonymous>.<anonymous> (CryptoRecurringComposable.kt:58)");
                                }
                                final android.content.Context context = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), composer, 6, 1);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                                SnapshotState4<CryptoRecurringViewState> snapshotState4 = this.$viewState$delegate;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21622defaultHorizontalPaddingWMci_g0);
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
                                BentoTextWithTrailingIconState bentoTextWithTrailingIconState = new BentoTextWithTrailingIconState(StringResources_androidKt.stringResource(CryptoRecurringComposable.CryptoRecurringComposable$lambda$0(snapshotState4).getTitle(), composer, 0), new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), StringResources_androidKt.stringResource(C13013R.string.cd_crypto_home_recurring_details_button, composer, 0), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), null, null, null, null, null, 0, false, 0, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), false, null, null, false, 253936, null);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(context);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposableKt$CryptoRecurringComposable$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoRecurringComposable.C132031.AnonymousClass1.C497591.invoke$lambda$4$lambda$2$lambda$1(context);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(bentoTextWithTrailingIconState, null, null, (Function0) objRememberedValue, composer, BentoTextWithTrailingIconState.$stable, 6);
                                Integer description = CryptoRecurringComposable.CryptoRecurringComposable$lambda$0(snapshotState4).getDescription();
                                composer.startReplaceGroup(-1762583927);
                                if (description != null) {
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(description.intValue(), composer, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16378);
                                }
                                composer.endReplaceGroup();
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        /* compiled from: CryptoRecurringComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposableKt$CryptoRecurringComposable$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotState4<CryptoRecurringViewState> $viewState$delegate;

                            AnonymousClass2(SnapshotState4<CryptoRecurringViewState> snapshotState4) {
                                this.$viewState$delegate = snapshotState4;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                float fM21590getDefaultD9Ej5fM;
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1706206720, i, -1, "com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposable.<anonymous>.<anonymous>.<anonymous> (CryptoRecurringComposable.kt:91)");
                                }
                                final android.content.Context context = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                if (CryptoRecurringComposable.CryptoRecurringComposable$lambda$0(this.$viewState$delegate).getItems().isEmpty()) {
                                    composer.startReplaceGroup(-1333201718);
                                    fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(-1333108408);
                                    fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                                    composer.endReplaceGroup();
                                }
                                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, fM21590getDefaultD9Ej5fM, 0.0f, composer, 6, 2);
                                String strStringResource = StringResources_androidKt.stringResource(CryptoRecurringComposable.CryptoRecurringComposable$lambda$0(this.$viewState$delegate).getCtaText(), composer, 0);
                                boolean z = CryptoRecurringComposable.CryptoRecurringComposable$lambda$0(this.$viewState$delegate).getNavigationAction() != null;
                                composer.startReplaceGroup(-1224400529);
                                boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(current);
                                final SnapshotState4<CryptoRecurringViewState> snapshotState4 = this.$viewState$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposableKt$CryptoRecurringComposable$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoRecurringComposable.C132031.AnonymousClass1.AnonymousClass2.invoke$lambda$2$lambda$1(snapshotState4, navigator, context, current);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, z, null, composer, 0, 88);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(SnapshotState4 snapshotState4, Navigator navigator, android.content.Context context, EventLogger eventLogger) {
                                CryptoRecurringViewState.RecurringNavigationAction navigationAction = CryptoRecurringComposable.CryptoRecurringComposable$lambda$0(snapshotState4).getNavigationAction();
                                if (navigationAction != null) {
                                    if (navigationAction instanceof CryptoRecurringViewState.RecurringNavigationAction.ShowFragment) {
                                        Navigator.DefaultImpls.showFragment$default(navigator, context, ((CryptoRecurringViewState.RecurringNavigationAction.ShowFragment) navigationAction).getKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
                                    } else {
                                        if (!(navigationAction instanceof CryptoRecurringViewState.RecurringNavigationAction.ShowFragmentInStandaloneRdsActivity)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, ((CryptoRecurringViewState.RecurringNavigationAction.ShowFragmentInStandaloneRdsActivity) navigationAction).getKey(), false, false, false, false, null, false, null, null, 1020, null);
                                    }
                                    EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_RECURRING_DETAILS, new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null), null, null, null, false, 60, null);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer5, 54), composer5, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer3, 54), composer3, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cryptoRecurringDuxo2 = cryptoRecurringDuxo3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoRecurringComposable.CryptoRecurringComposable$lambda$1(modifier3, cryptoRecurringDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoRecurringViewState CryptoRecurringComposable$lambda$0(SnapshotState4<CryptoRecurringViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
