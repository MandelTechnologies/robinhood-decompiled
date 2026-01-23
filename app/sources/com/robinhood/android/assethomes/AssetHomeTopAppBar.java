package com.robinhood.android.assethomes;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.IconButton5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
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
import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.assethomes.AssetHomeTopAppBar;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
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

/* compiled from: AssetHomeTopAppBar.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\"\u0010\u0010\u0016\u001a\u00020\u00038\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"AssetHomeTopAppBar", "", "assetTitle", "", "accountNumber", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "onBack", "Lkotlin/Function0;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "topBarScrollState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "showSearchIcon", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDuxo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/compose/bento/component/TopBarScrollState;Lcom/robinhood/models/api/BrokerageAccountType;ZLandroidx/compose/ui/Modifier;Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDuxo;Landroidx/compose/runtime/Composer;II)V", "SEARCH_IDENTIFIER", "feature-asset-homes_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.assethomes.AssetHomeTopAppBarKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHomeTopAppBar {
    public static final String SEARCH_IDENTIFIER = "top_nav-search";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeTopAppBar$lambda$1(String str, String str2, PerformanceChartType performanceChartType, Function0 function0, Navigator navigator, TopBarScrollState topBarScrollState, BrokerageAccountType brokerageAccountType, boolean z, Modifier modifier, AssetHomeTopAppBarDuxo assetHomeTopAppBarDuxo, int i, int i2, Composer composer, int i3) {
        AssetHomeTopAppBar(str, str2, performanceChartType, function0, navigator, topBarScrollState, brokerageAccountType, z, modifier, assetHomeTopAppBarDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetHomeTopAppBar(final String assetTitle, final String accountNumber, final PerformanceChartType chartType, final Function0<Unit> onBack, final Navigator navigator, final TopBarScrollState topBarScrollState, final BrokerageAccountType brokerageAccountType, final boolean z, Modifier modifier, AssetHomeTopAppBarDuxo assetHomeTopAppBarDuxo, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        AssetHomeTopAppBarDuxo assetHomeTopAppBarDuxo2;
        Composer composer2;
        Modifier modifier3;
        int i5;
        AssetHomeTopAppBarDuxo assetHomeTopAppBarDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer3;
        final AssetHomeTopAppBarDuxo assetHomeTopAppBarDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(assetTitle, "assetTitle");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Composer composerStartRestartGroup = composer.startRestartGroup(1669952235);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(assetTitle) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(accountNumber) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(chartType.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 1048576 : 524288;
        }
        if ((i2 & 128) == 0) {
            if ((i & 12582912) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
            }
            i4 = i2 & 256;
            if (i4 == 0) {
                i3 |= 100663296;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i & 100663296) == 0) {
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                }
            }
            if ((i & 805306368) != 0) {
                if ((i2 & 512) == 0) {
                    assetHomeTopAppBarDuxo2 = assetHomeTopAppBarDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(assetHomeTopAppBarDuxo2) ? 536870912 : 268435456;
                    i3 |= i6;
                } else {
                    assetHomeTopAppBarDuxo2 = assetHomeTopAppBarDuxo;
                }
                i3 |= i6;
            } else {
                assetHomeTopAppBarDuxo2 = assetHomeTopAppBarDuxo;
            }
            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 512) == 0) {
                        String str = accountNumber + chartType.getServerValue() + "TopAppBar";
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AssetHomeTopAppBarDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.assethomes.AssetHomeTopAppBarKt$AssetHomeTopAppBar$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.assethomes.AssetHomeTopAppBarKt$AssetHomeTopAppBar$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                        composer2.endReplaceGroup();
                        modifier3 = modifier4;
                        assetHomeTopAppBarDuxo3 = (AssetHomeTopAppBarDuxo) baseDuxo;
                        i5 = i3 & (-1879048193);
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1669952235, i5, -1, "com.robinhood.android.assethomes.AssetHomeTopAppBar (AssetHomeTopAppBar.kt:46)");
                        }
                        composer2.startReplaceGroup(-1746271574);
                        zChangedInstance = ((i5 & 112) != 32) | composer2.changedInstance(assetHomeTopAppBarDuxo3) | ((i5 & 896) != 256);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new AssetHomeTopAppBar2(assetHomeTopAppBarDuxo3, accountNumber, chartType, null);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(accountNumber, chartType, (Function2) objRememberedValue, composer2, (i5 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Composer composer4 = composer2;
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(assetHomeTopAppBarDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                        AssetHomeTopAppBarDuxo assetHomeTopAppBarDuxo5 = assetHomeTopAppBarDuxo3;
                        composer3 = composer4;
                        Modifier modifier5 = modifier3;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1235777384, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeTopAppBarKt.AssetHomeTopAppBar.2
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
                                    ComposerKt.traceEventStart(-1235777384, i7, -1, "com.robinhood.android.assethomes.AssetHomeTopAppBar.<anonymous> (AssetHomeTopAppBar.kt:63)");
                                }
                                Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                                BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
                                String str2 = assetTitle;
                                SnapshotState4<AssetHomeTopAppBarViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierAlpha);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                if (composer5.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer5.startReplaceGroup(1434958180);
                                if (brokerageAccountType2.isRetirement()) {
                                    str2 = StringResources_androidKt.stringResource(BrokerageAccountTypes2.getDisplayNameRes(brokerageAccountType2), composer5, 0) + " · " + str2;
                                }
                                String str3 = str2;
                                composer5.endReplaceGroup();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(str3, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i8).getTextL(), composer5, 0, 0, 8190);
                                String accountValue = snapshotState4.getValue().getAccountValue();
                                composer5.startReplaceGroup(1434969359);
                                if (accountValue != null) {
                                    BentoText2.m20747BentoText38GnDrw(accountValue, null, Color.m6701boximpl(bentoTheme.getColors(composer5, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i8).getTextS(), composer5, 0, 0, 8186);
                                }
                                composer5.endReplaceGroup();
                                composer5.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54), modifier5, ComposableLambda3.rememberComposableLambda(1283553004, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeTopAppBarKt.AssetHomeTopAppBar.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                invoke(bentoAppBarScope, composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1283553004, i7, -1, "com.robinhood.android.assethomes.AssetHomeTopAppBar.<anonymous> (AssetHomeTopAppBar.kt:58)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBack, composer5, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54), ComposableLambda3.rememberComposableLambda(1603277581, true, new C96064(z2, navigator, context, accountNumber, userInteractionEventDescriptor), composer4, 54), null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer3, ((i5 >> 21) & 112) | 3462, 0, 1968);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier5;
                        assetHomeTopAppBarDuxo4 = assetHomeTopAppBarDuxo5;
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier4;
                        i5 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 512) != 0) {
                        i3 &= -1879048193;
                    }
                    composer2 = composerStartRestartGroup;
                    i5 = i3;
                    modifier3 = modifier2;
                }
                assetHomeTopAppBarDuxo3 = assetHomeTopAppBarDuxo2;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2.startReplaceGroup(-1746271574);
                zChangedInstance = ((i5 & 112) != 32) | composer2.changedInstance(assetHomeTopAppBarDuxo3) | ((i5 & 896) != 256);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new AssetHomeTopAppBar2(assetHomeTopAppBarDuxo3, accountNumber, chartType, null);
                    composer2.updateRememberedValue(objRememberedValue);
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(accountNumber, chartType, (Function2) objRememberedValue, composer2, (i5 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    Context context2 = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Composer composer42 = composer2;
                    final SnapshotState4<AssetHomeTopAppBarViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(assetHomeTopAppBarDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                    AssetHomeTopAppBarDuxo assetHomeTopAppBarDuxo52 = assetHomeTopAppBarDuxo3;
                    composer3 = composer42;
                    Modifier modifier52 = modifier3;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1235777384, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeTopAppBarKt.AssetHomeTopAppBar.2
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
                                ComposerKt.traceEventStart(-1235777384, i7, -1, "com.robinhood.android.assethomes.AssetHomeTopAppBar.<anonymous> (AssetHomeTopAppBar.kt:63)");
                            }
                            Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                            BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
                            String str2 = assetTitle;
                            SnapshotState4<AssetHomeTopAppBarViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierAlpha);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer5.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor);
                            } else {
                                composer5.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer5.startReplaceGroup(1434958180);
                            if (brokerageAccountType2.isRetirement()) {
                                str2 = StringResources_androidKt.stringResource(BrokerageAccountTypes2.getDisplayNameRes(brokerageAccountType2), composer5, 0) + " · " + str2;
                            }
                            String str3 = str2;
                            composer5.endReplaceGroup();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(str3, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i8).getTextL(), composer5, 0, 0, 8190);
                            String accountValue = snapshotState4.getValue().getAccountValue();
                            composer5.startReplaceGroup(1434969359);
                            if (accountValue != null) {
                                BentoText2.m20747BentoText38GnDrw(accountValue, null, Color.m6701boximpl(bentoTheme.getColors(composer5, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i8).getTextS(), composer5, 0, 0, 8186);
                            }
                            composer5.endReplaceGroup();
                            composer5.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer42, 54), modifier52, ComposableLambda3.rememberComposableLambda(1283553004, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeTopAppBarKt.AssetHomeTopAppBar.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                            invoke(bentoAppBarScope, composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1283553004, i7, -1, "com.robinhood.android.assethomes.AssetHomeTopAppBar.<anonymous> (AssetHomeTopAppBar.kt:58)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBack, composer5, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer42, 54), ComposableLambda3.rememberComposableLambda(1603277581, true, new C96064(z2, navigator, context2, accountNumber, userInteractionEventDescriptor2), composer42, 54), null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer3, ((i5 >> 21) & 112) | 3462, 0, 1968);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier52;
                    assetHomeTopAppBarDuxo4 = assetHomeTopAppBarDuxo52;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
                assetHomeTopAppBarDuxo4 = assetHomeTopAppBarDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier6 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.assethomes.AssetHomeTopAppBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AssetHomeTopAppBar.AssetHomeTopAppBar$lambda$1(assetTitle, accountNumber, chartType, onBack, navigator, topBarScrollState, brokerageAccountType, z, modifier6, assetHomeTopAppBarDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        z2 = z;
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        if ((i & 805306368) != 0) {
        }
        if ((i3 & 306783379) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 512) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: AssetHomeTopAppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.assethomes.AssetHomeTopAppBarKt$AssetHomeTopAppBar$4 */
    static final class C96064 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ Context $context;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ boolean $showSearchIcon;

        C96064(boolean z, Navigator navigator, Context context, String str, UserInteractionEventDescriptor userInteractionEventDescriptor) {
            this.$showSearchIcon = z;
            this.$navigator = navigator;
            this.$context = context;
            this.$accountNumber = str;
            this.$eventDescriptor = userInteractionEventDescriptor;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1603277581, i, -1, "com.robinhood.android.assethomes.AssetHomeTopAppBar.<anonymous> (AssetHomeTopAppBar.kt:86)");
            }
            if (this.$showSearchIcon) {
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$accountNumber) | composer.changedInstance(this.$eventDescriptor);
                final Navigator navigator = this.$navigator;
                final Context context = this.$context;
                final String str = this.$accountNumber;
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.assethomes.AssetHomeTopAppBarKt$AssetHomeTopAppBar$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AssetHomeTopAppBar.C96064.invoke$lambda$1$lambda$0(navigator, context, str, userInteractionEventDescriptor);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier.Companion companion = Modifier.INSTANCE;
                Component component = new Component(Component.ComponentType.BUTTON, AssetHomeTopAppBar.SEARCH_IDENTIFIER, null, 4, null);
                IconButton5.IconButton((Function0) objRememberedValue, ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(this.$eventDescriptor, null, null, UserInteractionEventData.Action.VIEW_SEARCH, null, component, null, 43, null), false, false, false, true, false, null, 110, null), false, null, null, AssetHomeTopAppBar3.INSTANCE.getLambda$2103513349$feature_asset_homes_externalDebug(), composer, 196608, 28);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, String str, UserInteractionEventDescriptor userInteractionEventDescriptor) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new SearchFragmentKey(null, null, str, null, userInteractionEventDescriptor.getScreen(), null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }
    }
}
