package com.robinhood.android.crypto.tab.p093ui.lists;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.p093ui.lists.CryptoHomeWatchlistTitle;
import com.robinhood.android.crypto.tab.p093ui.lists.CryptoHomeWatchlistTitleViewState;
import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
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

/* compiled from: CryptoHomeWatchlistTitle.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {"CryptoHomeWatchlistTitle", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleDuxo;Landroidx/compose/runtime/Composer;II)V", "WatchlistBottomSheet", "bottomSheetContent", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleViewState$BottomSheetContent;", "dismissSelf", "Lkotlin/Function0;", "(Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleViewState$BottomSheetContent;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-crypto-tab_externalDebug", "viewState", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleViewState;", "showBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeWatchlistTitle {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeWatchlistTitle$lambda$9(Modifier modifier, CryptoHomeWatchlistTitleDuxo cryptoHomeWatchlistTitleDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeWatchlistTitle(modifier, cryptoHomeWatchlistTitleDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WatchlistBottomSheet$lambda$10(CryptoHomeWatchlistTitleViewState.BottomSheetContent bottomSheetContent, Function0 function0, int i, Composer composer, int i2) {
        WatchlistBottomSheet(bottomSheetContent, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CryptoHomeWatchlistTitle(Modifier modifier, CryptoHomeWatchlistTitleDuxo cryptoHomeWatchlistTitleDuxo, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final CryptoHomeWatchlistTitleDuxo cryptoHomeWatchlistTitleDuxo2;
        CryptoHomeWatchlistTitleDuxo cryptoHomeWatchlistTitleDuxo3;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1437057991);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                cryptoHomeWatchlistTitleDuxo2 = cryptoHomeWatchlistTitleDuxo;
                int i5 = composerStartRestartGroup.changedInstance(cryptoHomeWatchlistTitleDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                cryptoHomeWatchlistTitleDuxo2 = cryptoHomeWatchlistTitleDuxo;
            }
            i3 |= i5;
        } else {
            cryptoHomeWatchlistTitleDuxo2 = cryptoHomeWatchlistTitleDuxo;
        }
        int i6 = i3;
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeWatchlistTitleDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt$CryptoHomeWatchlistTitle$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt$CryptoHomeWatchlistTitle$$inlined$duxo$1.1
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
                    i6 &= -113;
                    cryptoHomeWatchlistTitleDuxo3 = (CryptoHomeWatchlistTitleDuxo) baseDuxo;
                } else {
                    cryptoHomeWatchlistTitleDuxo3 = cryptoHomeWatchlistTitleDuxo2;
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                modifier3 = modifier2;
                cryptoHomeWatchlistTitleDuxo3 = cryptoHomeWatchlistTitleDuxo2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1437057991, i6, -1, "com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitle (CryptoHomeWatchlistTitle.kt:44)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeWatchlistTitleDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, i6 & 14, 1), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null), null, null, new Component(Component.ComponentType.SECTION_HEADER, PortfolioBuyingPower5.IntentKeyEntryPoint, null, 4, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            Modifier modifier5 = modifier3;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13013R.string.crypto_home_watchlist_title, composerStartRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(-660295329);
            if (CryptoHomeWatchlistTitle$lambda$0(snapshotState4CollectAsStateWithLifecycle).getBottomSheetContent() != null) {
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeWatchlistTitle.CryptoHomeWatchlistTitle$lambda$6$lambda$5$lambda$4(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21426getFg20d7_KjU, null, (Function0) objRememberedValue3, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 24624, 40);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            CryptoHomeWatchlistTitleViewState.BottomSheetContent bottomSheetContent = CryptoHomeWatchlistTitle$lambda$0(snapshotState4CollectAsStateWithLifecycle).getBottomSheetContent();
            if (CryptoHomeWatchlistTitle$lambda$2(snapshotState) && bottomSheetContent != null) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeWatchlistTitle.CryptoHomeWatchlistTitle$lambda$8$lambda$7(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-53510779, true, new C131723(bottomSheetContent, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cryptoHomeWatchlistTitleDuxo2 = cryptoHomeWatchlistTitleDuxo3;
            modifier2 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeWatchlistTitle.CryptoHomeWatchlistTitle$lambda$9(modifier2, cryptoHomeWatchlistTitleDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoHomeWatchlistTitle$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeWatchlistTitle$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState) {
        CryptoHomeWatchlistTitle$lambda$3(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoHomeWatchlistTitle.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt$CryptoHomeWatchlistTitle$3 */
    static final class C131723 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ CryptoHomeWatchlistTitleViewState.BottomSheetContent $bottomSheetContent;
        final /* synthetic */ SnapshotState<Boolean> $showBottomSheet$delegate;

        C131723(CryptoHomeWatchlistTitleViewState.BottomSheetContent bottomSheetContent, SnapshotState<Boolean> snapshotState) {
            this.$bottomSheetContent = bottomSheetContent;
            this.$showBottomSheet$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-53510779, i, -1, "com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitle.<anonymous> (CryptoHomeWatchlistTitle.kt:82)");
            }
            CryptoHomeWatchlistTitleViewState.BottomSheetContent bottomSheetContent = this.$bottomSheetContent;
            composer.startReplaceGroup(5004770);
            final SnapshotState<Boolean> snapshotState = this.$showBottomSheet$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt$CryptoHomeWatchlistTitle$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoHomeWatchlistTitle.C131723.invoke$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CryptoHomeWatchlistTitle.WatchlistBottomSheet(bottomSheetContent, (Function0) objRememberedValue, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            CryptoHomeWatchlistTitle.CryptoHomeWatchlistTitle$lambda$3(snapshotState, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeWatchlistTitle$lambda$8$lambda$7(SnapshotState snapshotState) {
        CryptoHomeWatchlistTitle$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final CryptoHomeWatchlistTitleViewState CryptoHomeWatchlistTitle$lambda$0(SnapshotState4<CryptoHomeWatchlistTitleViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean CryptoHomeWatchlistTitle$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WatchlistBottomSheet(final CryptoHomeWatchlistTitleViewState.BottomSheetContent bottomSheetContent, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1495403804);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bottomSheetContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1495403804, i2, -1, "com.robinhood.android.crypto.tab.ui.lists.WatchlistBottomSheet (CryptoHomeWatchlistTitle.kt:94)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-377313617, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt.WatchlistBottomSheet.1

                /* compiled from: CryptoHomeWatchlistTitle.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt$WatchlistBottomSheet$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ CryptoHomeWatchlistTitleViewState.BottomSheetContent $bottomSheetContent;
                    final /* synthetic */ Context $context;
                    final /* synthetic */ Function0<Unit> $dismissSelf;
                    final /* synthetic */ Navigator $navigator;

                    AnonymousClass1(CryptoHomeWatchlistTitleViewState.BottomSheetContent bottomSheetContent, Function0<Unit> function0, Navigator navigator, Context context) {
                        this.$bottomSheetContent = bottomSheetContent;
                        this.$dismissSelf = function0;
                        this.$navigator = navigator;
                        this.$context = context;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Navigator navigator, Context context, String uri) {
                        Intrinsics.checkNotNullParameter(uri, "uri");
                        Uri uri2 = Uri.parse(uri);
                        if (navigator.isDeepLinkSupported(uri2)) {
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri2, null, null, false, null, 60, null);
                        }
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        Modifier.Companion companion;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1217435597, i, -1, "com.robinhood.android.crypto.tab.ui.lists.WatchlistBottomSheet.<anonymous>.<anonymous> (CryptoHomeWatchlistTitle.kt:100)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5143paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                        CryptoHomeWatchlistTitleViewState.BottomSheetContent bottomSheetContent = this.$bottomSheetContent;
                        Function0<Unit> function0 = this.$dismissSelf;
                        final Navigator navigator = this.$navigator;
                        final Context context = this.$context;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null);
                        TextAlign.Companion companion5 = TextAlign.INSTANCE;
                        int iM7919getCentere0LSkKk = companion5.m7919getCentere0LSkKk();
                        BentoText2.m20747BentoText38GnDrw(bottomSheetContent.getTitle(), modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8124);
                        composer.startReplaceGroup(347526655);
                        if (bottomSheetContent.getBody() != null) {
                            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 7, null);
                            companion = companion2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default2);
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            String raw = bottomSheetContent.getBody().getRaw();
                            MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer, BentoMarkdownText.$stable), null, null, null, null, null, null, null, 0L, null, companion5.m7919getCentere0LSkKk(), null, 1535, null);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt$WatchlistBottomSheet$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoHomeWatchlistTitle.C131731.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1$lambda$0(navigator, context, (String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoMarkdownText2.BentoMarkdownText(raw, (Modifier) null, markdownStyleM16260copyR0sFphs$default, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer, MarkdownStyle.$stable << 6, 10);
                            composer.endNode();
                        } else {
                            companion = companion2;
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, bottomSheetContent.getCta(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer, 384, 0, 8184);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
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
                        ComposerKt.traceEventStart(-377313617, i3, -1, "com.robinhood.android.crypto.tab.ui.lists.WatchlistBottomSheet.<anonymous> (CryptoHomeWatchlistTitle.kt:99)");
                    }
                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(1217435597, true, new AnonymousClass1(bottomSheetContent, function0, navigator, context), composer2, 54), composer2, 6);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeWatchlistTitle.WatchlistBottomSheet$lambda$10(bottomSheetContent, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
