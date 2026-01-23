package com.robinhood.android.crypto.tab.p093ui.discover;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
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
import androidx.compose.runtime.internal.ComposableLambda;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposable;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverExperimentComposableKt;
import com.robinhood.android.instrumentrow.InstrumentRow5;
import com.robinhood.android.instrumentrow.InstrumentRowState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.comboorders.detail.TestTags;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: CryptoHomeDiscoverExperimentComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aH\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012\u001a@\u0010\u0014\u001a\u00020\u0001*\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\nH\u0002\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, m3636d2 = {"CryptoHomeDiscoverExperimentComposable", "", "titleVisible", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDuxo;", "(ZLandroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDuxo;Landroidx/compose/runtime/Composer;II)V", "cryptoHomeDiscoverExperimentItems", "Landroidx/compose/foundation/lazy/LazyListScope;", "viewState", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentViewState;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "onCategoryIndexSelected", "Lkotlin/Function1;", "", TestTags.LOADED, "loading", "CryptoHomeDiscoverExperimentComposableLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoHomeDiscoverExperimentComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeDiscoverExperimentComposable$lambda$3(boolean z, Modifier modifier, CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeDiscoverExperimentComposable(z, modifier, cryptoHomeDiscoverExperimentDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeDiscoverExperimentComposableLoadingPreview$lambda$10(int i, Composer composer, int i2) {
        CryptoHomeDiscoverExperimentComposableLoadingPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHomeDiscoverExperimentComposable(final boolean z, Modifier modifier, CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        Modifier modifier2;
        CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo2;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        final CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final Context context;
        final Navigator navigator;
        boolean zChanged;
        Object objRememberedValue;
        CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo4;
        final CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(724361654);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoHomeDiscoverExperimentDuxo2 = cryptoHomeDiscoverExperimentDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(cryptoHomeDiscoverExperimentDuxo2) ? 256 : 128;
                    i3 |= i5;
                } else {
                    cryptoHomeDiscoverExperimentDuxo2 = cryptoHomeDiscoverExperimentDuxo;
                }
                i3 |= i5;
            } else {
                cryptoHomeDiscoverExperimentDuxo2 = cryptoHomeDiscoverExperimentDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeDiscoverExperimentDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$CryptoHomeDiscoverExperimentComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$CryptoHomeDiscoverExperimentComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 &= -897;
                        cryptoHomeDiscoverExperimentDuxo3 = (CryptoHomeDiscoverExperimentDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(724361654, i3, -1, "com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposable (CryptoHomeDiscoverExperimentComposable.kt:79)");
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeDiscoverExperimentDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(navigator) | ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(cryptoHomeDiscoverExperimentDuxo3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoHomeDiscoverExperimentComposableKt.CryptoHomeDiscoverExperimentComposable$lambda$2$lambda$1(context, navigator, z2, cryptoHomeDiscoverExperimentDuxo3, snapshotState4CollectAsStateWithLifecycle, (LazyListScope) obj);
                            }
                        };
                        cryptoHomeDiscoverExperimentDuxo4 = cryptoHomeDiscoverExperimentDuxo3;
                        composerStartRestartGroup.updateRememberedValue(function1);
                        objRememberedValue = function1;
                    } else {
                        cryptoHomeDiscoverExperimentDuxo4 = cryptoHomeDiscoverExperimentDuxo3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifier2 = modifier3;
                    LazyDslKt.LazyColumn(modifier2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 510);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    cryptoHomeDiscoverExperimentDuxo5 = cryptoHomeDiscoverExperimentDuxo4;
                }
                cryptoHomeDiscoverExperimentDuxo3 = cryptoHomeDiscoverExperimentDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeDiscoverExperimentDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(navigator) | ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(cryptoHomeDiscoverExperimentDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoHomeDiscoverExperimentComposableKt.CryptoHomeDiscoverExperimentComposable$lambda$2$lambda$1(context, navigator, z2, cryptoHomeDiscoverExperimentDuxo3, snapshotState4CollectAsStateWithLifecycle, (LazyListScope) obj);
                        }
                    };
                    cryptoHomeDiscoverExperimentDuxo4 = cryptoHomeDiscoverExperimentDuxo3;
                    composerStartRestartGroup.updateRememberedValue(function12);
                    objRememberedValue = function12;
                    composerStartRestartGroup.endReplaceGroup();
                    modifier2 = modifier3;
                    LazyDslKt.LazyColumn(modifier2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 510);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    cryptoHomeDiscoverExperimentDuxo5 = cryptoHomeDiscoverExperimentDuxo4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                cryptoHomeDiscoverExperimentDuxo5 = cryptoHomeDiscoverExperimentDuxo2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoHomeDiscoverExperimentComposableKt.CryptoHomeDiscoverExperimentComposable$lambda$3(z, modifier4, cryptoHomeDiscoverExperimentDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i4 == 0) {
                }
                if ((i2 & 4) == 0) {
                    cryptoHomeDiscoverExperimentDuxo3 = cryptoHomeDiscoverExperimentDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeDiscoverExperimentDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(navigator) | ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(cryptoHomeDiscoverExperimentDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final CryptoHomeDiscoverExperimentViewState CryptoHomeDiscoverExperimentComposable$lambda$0(SnapshotState4<CryptoHomeDiscoverExperimentViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeDiscoverExperimentComposable$lambda$2$lambda$1(Context context, Navigator navigator, boolean z, CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, SnapshotState4 snapshotState4, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        cryptoHomeDiscoverExperimentItems$default(LazyColumn, CryptoHomeDiscoverExperimentComposable$lambda$0(snapshotState4), context, navigator, z, cryptoHomeDiscoverExperimentDuxo, null, 32, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoHomeDiscoverExperimentComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$1 */
    static final class C130991 implements Function3<LazyItemScope, Composer, Integer, Unit> {
        final /* synthetic */ CryptoHomeDiscoverExperimentViewState $viewState;

        C130991(CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState) {
            this.$viewState = cryptoHomeDiscoverExperimentViewState;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-936620586, i, -1, "com.robinhood.android.crypto.tab.ui.discover.loaded.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:134)");
            }
            final DtoActionHandler dtoActionHandler = (DtoActionHandler) composer.consume(DtoActionHandler2.getLocalDtoActionHandler());
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            final CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState = this.$viewState;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(cryptoHomeDiscoverExperimentViewState.getTitle(), AutomationTestTagModifierExt.automationTestTag(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 4, null), ExperimentTestTags.EXPLORE_SECTION_TITLE), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(AutomationTestTagModifierExt.automationTestTag(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(24)), ExperimentTestTags.EXPLORE_SECTION_INFO_BUTTON), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.EXPLORE_SECTION, "explore_info_button", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(cryptoHomeDiscoverExperimentViewState) | composer.changedInstance(dtoActionHandler);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoHomeDiscoverExperimentComposableKt.C130991.invoke$lambda$3$lambda$2$lambda$1(cryptoHomeDiscoverExperimentViewState, dtoActionHandler);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size24, "", jM21426getFg20d7_KjU, modifierAutoLogEvents$default, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 48, 32);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, DtoActionHandler dtoActionHandler) {
            AlertDto sheetDto = cryptoHomeDiscoverExperimentViewState.getSheetDto();
            if (sheetDto != null) {
                DtoActionHandler2.m15939show1Vfn_Dk(dtoActionHandler, sheetDto, GenericAlertMobilePresentationStyle.BOTTOM_SHEET, TextAlign.INSTANCE.m7924getStarte0LSkKk());
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void cryptoHomeDiscoverExperimentItems$default(LazyListScope lazyListScope, CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, Context context, Navigator navigator, boolean z, CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, Function1 function1, int i, Object obj) {
        if ((i & 32) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CryptoHomeDiscoverExperimentComposableKt.cryptoHomeDiscoverExperimentItems$lambda$4(((Integer) obj2).intValue());
                }
            };
        }
        cryptoHomeDiscoverExperimentItems(lazyListScope, cryptoHomeDiscoverExperimentViewState, context, navigator, z, cryptoHomeDiscoverExperimentDuxo, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoHomeDiscoverExperimentItems$lambda$4(int i) {
        return Unit.INSTANCE;
    }

    public static final void cryptoHomeDiscoverExperimentItems(LazyListScope lazyListScope, CryptoHomeDiscoverExperimentViewState viewState, Context context, Navigator navigator, boolean z, final CryptoHomeDiscoverExperimentDuxo duxo, final Function1<? super Integer, Unit> onCategoryIndexSelected) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onCategoryIndexSelected, "onCategoryIndexSelected");
        if (viewState.isLoading()) {
            loading(lazyListScope);
        } else {
            loaded(lazyListScope, context, viewState, navigator, new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoHomeDiscoverExperimentComposableKt.cryptoHomeDiscoverExperimentItems$lambda$5(duxo, onCategoryIndexSelected, ((Integer) obj).intValue());
                }
            }, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoHomeDiscoverExperimentItems$lambda$5(CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, Function1 function1, int i) {
        cryptoHomeDiscoverExperimentDuxo.selectCategory(i);
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    private static final void loaded(LazyListScope lazyListScope, final Context context, final CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, final Navigator navigator, final Function1<? super Integer, Unit> function1, boolean z) {
        if (z) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-936620586, true, new C130991(cryptoHomeDiscoverExperimentViewState)), 3, null);
        }
        final ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambda3.composableLambdaInstance(965362721, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1
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
                    ComposerKt.traceEventStart(965362721, i, -1, "com.robinhood.android.crypto.tab.ui.discover.loaded.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:184)");
                }
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                    composer.updateRememberedValue(objRememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
                Unit unit = Unit.INSTANCE;
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(cryptoHomeDiscoverExperimentViewState) | composer.changed(lazyListStateRememberLazyListState);
                CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState2 = cryptoHomeDiscoverExperimentViewState;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$1$1(coroutineScope, cryptoHomeDiscoverExperimentViewState2, lazyListStateRememberLazyListState, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1786564247, true, new C131042(lazyListStateRememberLazyListState, cryptoHomeDiscoverExperimentViewState, coroutineScope, function1), composer, 54), composer, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* compiled from: CryptoHomeDiscoverExperimentComposable.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2 */
            static final class C131042 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ LazyListState $chipRowState;
                final /* synthetic */ CoroutineScope $coroutineScope;
                final /* synthetic */ Function1<Integer, Unit> $onCategoryIndexSelected;
                final /* synthetic */ CryptoHomeDiscoverExperimentViewState $viewState;

                /* JADX WARN: Multi-variable type inference failed */
                C131042(LazyListState lazyListState, CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, CoroutineScope coroutineScope, Function1<? super Integer, Unit> function1) {
                    this.$chipRowState = lazyListState;
                    this.$viewState = cryptoHomeDiscoverExperimentViewState;
                    this.$coroutineScope = coroutineScope;
                    this.$onCategoryIndexSelected = function1;
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
                        ComposerKt.traceEventStart(-1786564247, i, -1, "com.robinhood.android.crypto.tab.ui.discover.loaded.<anonymous>.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:198)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierTestTag = TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), "TEST_TAG_DISCOVER_ITEM_LOADED");
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5092spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                    PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    LazyListState lazyListState = this.$chipRowState;
                    composer.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$coroutineScope) | composer.changed(this.$onCategoryIndexSelected) | composer.changed(this.$chipRowState);
                    final CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState = this.$viewState;
                    final CoroutineScope coroutineScope = this.$coroutineScope;
                    final Function1<Integer, Unit> function1 = this.$onCategoryIndexSelected;
                    final LazyListState lazyListState2 = this.$chipRowState;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009e: CONSTRUCTOR (r10v1 'objRememberedValue' java.lang.Object) = 
                              (r4v7 'cryptoHomeDiscoverExperimentViewState' com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentViewState A[DONT_INLINE])
                              (r5v1 'coroutineScope' kotlinx.coroutines.CoroutineScope A[DONT_INLINE])
                              (r8v2 'function1' kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> A[DONT_INLINE])
                              (r9v0 'lazyListState2' androidx.compose.foundation.lazy.LazyListState A[DONT_INLINE])
                             A[MD:(com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentViewState, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function1, androidx.compose.foundation.lazy.LazyListState):void (m)] (LINE:207) call: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2$$ExternalSyntheticLambda0.<init>(com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentViewState, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function1, androidx.compose.foundation.lazy.LazyListState):void type: CONSTRUCTOR in method: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1.2.invoke(androidx.compose.runtime.Composer, int):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r18
                            r11 = r19
                            r1 = r20
                            r2 = r1 & 3
                            r3 = 2
                            if (r2 != r3) goto L16
                            boolean r2 = r11.getSkipping()
                            if (r2 != 0) goto L12
                            goto L16
                        L12:
                            r11.skipToGroupEnd()
                            return
                        L16:
                            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r2 == 0) goto L25
                            r2 = -1
                            java.lang.String r4 = "com.robinhood.android.crypto.tab.ui.discover.loaded.<anonymous>.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:198)"
                            r5 = -1786564247(0xffffffff95833169, float:-5.2988434E-26)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r1, r2, r4)
                        L25:
                            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p011ui.Modifier.INSTANCE
                            r2 = 1
                            r4 = 0
                            r5 = 0
                            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r1, r4, r2, r5)
                            com.robinhood.compose.bento.theme.BentoTheme r1 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                            int r2 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                            com.robinhood.compose.bento.theme.BentoColors r6 = r1.getColors(r11, r2)
                            long r13 = r6.m21371getBg0d7_KjU()
                            r16 = 2
                            r17 = 0
                            r15 = 0
                            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.Background3.m4872backgroundbw27NRU$default(r12, r13, r15, r16, r17)
                            java.lang.String r7 = "TEST_TAG_DISCOVER_ITEM_LOADED"
                            androidx.compose.ui.Modifier r6 = androidx.compose.p011ui.platform.TestTag3.testTag(r6, r7)
                            androidx.compose.foundation.layout.Arrangement$Absolute r7 = androidx.compose.foundation.layout.Arrangement.Absolute.INSTANCE
                            com.robinhood.compose.bento.theme.BentoSpacing r8 = r1.getSpacing(r11, r2)
                            float r8 = r8.m21593getSmallD9Ej5fM()
                            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r7 = r7.m5092spacedBy0680j_4(r8)
                            com.robinhood.compose.bento.theme.BentoSpacing r1 = r1.getSpacing(r11, r2)
                            float r1 = r1.m21592getMediumD9Ej5fM()
                            androidx.compose.foundation.layout.PaddingValues r3 = androidx.compose.foundation.layout.PaddingKt.m5137PaddingValuesYgX7TsA$default(r1, r4, r3, r5)
                            androidx.compose.foundation.lazy.LazyListState r2 = r0.$chipRowState
                            r1 = -1224400529(0xffffffffb705216f, float:-7.935202E-6)
                            r11.startReplaceGroup(r1)
                            com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentViewState r1 = r0.$viewState
                            boolean r1 = r11.changedInstance(r1)
                            kotlinx.coroutines.CoroutineScope r4 = r0.$coroutineScope
                            boolean r4 = r11.changedInstance(r4)
                            r1 = r1 | r4
                            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r4 = r0.$onCategoryIndexSelected
                            boolean r4 = r11.changed(r4)
                            r1 = r1 | r4
                            androidx.compose.foundation.lazy.LazyListState r4 = r0.$chipRowState
                            boolean r4 = r11.changed(r4)
                            r1 = r1 | r4
                            com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentViewState r4 = r0.$viewState
                            kotlinx.coroutines.CoroutineScope r5 = r0.$coroutineScope
                            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r8 = r0.$onCategoryIndexSelected
                            androidx.compose.foundation.lazy.LazyListState r9 = r0.$chipRowState
                            java.lang.Object r10 = r11.rememberedValue()
                            if (r1 != 0) goto L9c
                            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r1 = r1.getEmpty()
                            if (r10 != r1) goto La4
                        L9c:
                            com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2$$ExternalSyntheticLambda0 r10 = new com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2$$ExternalSyntheticLambda0
                            r10.<init>(r4, r5, r8, r9)
                            r11.updateRememberedValue(r10)
                        La4:
                            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
                            r11.endReplaceGroup()
                            r12 = 0
                            r13 = 488(0x1e8, float:6.84E-43)
                            r4 = 0
                            r1 = r6
                            r6 = 0
                            r5 = r7
                            r7 = 0
                            r8 = 0
                            r9 = 0
                            androidx.compose.foundation.lazy.LazyDslKt.LazyRow(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r1 == 0) goto Lbf
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        Lbf:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1.C131042.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(final CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, final CoroutineScope coroutineScope, final Function1 function1, final LazyListState lazyListState, LazyListScope LazyRow) {
                        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                        final ImmutableList<String> categoryNames = cryptoHomeDiscoverExperimentViewState.getCategoryNames();
                        LazyRow.items(categoryNames.size(), null, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: INVOKE 
                              (r12v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                              (wrap:int:0x0009: INVOKE (r2v0 'categoryNames' kotlinx.collections.immutable.ImmutableList<java.lang.String>) INTERFACE call: java.util.List.size():int A[MD:():int (c), WRAPPED] (LINE:211))
                              (null kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object>)
                              (wrap:kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>:0x000f: CONSTRUCTOR (r2v0 'categoryNames' kotlinx.collections.immutable.ImmutableList<java.lang.String> A[DONT_INLINE]) A[MD:(java.util.List):void (m), WRAPPED] (LINE:210) call: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$2.<init>(java.util.List):void type: CONSTRUCTOR)
                              (wrap:androidx.compose.runtime.internal.ComposableLambda:0x001f: INVOKE 
                              (-1091073711 int)
                              true
                              (wrap:kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x0018: CONSTRUCTOR 
                              (r2v0 'categoryNames' kotlinx.collections.immutable.ImmutableList<java.lang.String> A[DONT_INLINE])
                              (r8v0 'cryptoHomeDiscoverExperimentViewState' com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentViewState A[DONT_INLINE])
                              (r9v0 'coroutineScope' kotlinx.coroutines.CoroutineScope A[DONT_INLINE])
                              (r10v0 'function1' kotlin.jvm.functions.Function1 A[DONT_INLINE])
                              (r11v0 'lazyListState' androidx.compose.foundation.lazy.LazyListState A[DONT_INLINE])
                             A[MD:(java.util.List, com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentViewState, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function1, androidx.compose.foundation.lazy.LazyListState):void (m), WRAPPED] (LINE:214) call: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3.<init>(java.util.List, com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentViewState, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function1, androidx.compose.foundation.lazy.LazyListState):void type: CONSTRUCTOR)
                             STATIC call: androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda A[MD:(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda (m), WRAPPED] (LINE:214))
                             INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.items(int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4):void A[MD:(int, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object>, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object>, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.LazyItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>):void (m)] (LINE:210) in method: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1.2.invoke$lambda$3$lambda$2(com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentViewState, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function1, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.lazy.LazyListScope):kotlin.Unit, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$2, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 15 more
                            */
                        /*
                            java.lang.String r0 = "$this$LazyRow"
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                            kotlinx.collections.immutable.ImmutableList r2 = r8.getCategoryNames()
                            int r0 = r2.size()
                            com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$2 r7 = new com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$2
                            r7.<init>(r2)
                            com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3 r1 = new com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3
                            r3 = r8
                            r4 = r9
                            r5 = r10
                            r6 = r11
                            r1.<init>(r2, r3, r4, r5, r6)
                            r8 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                            r9 = 1
                            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambda3.composableLambdaInstance(r8, r9, r1)
                            r9 = 0
                            r12.items(r0, r9, r7, r8)
                            kotlin.Unit r8 = kotlin.Unit.INSTANCE
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$header$1.C131042.invoke$lambda$3$lambda$2(com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentViewState, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function1, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.lazy.LazyListScope):kotlin.Unit");
                    }
                }
            });
            if (!cryptoHomeDiscoverExperimentViewState.getOnlyShowPreviewItems()) {
                LazyListScope.stickyHeader$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1407021735, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt.loaded.2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
                        Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1407021735, i2, -1, "com.robinhood.android.crypto.tab.ui.discover.loaded.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:237)");
                        }
                        composableLambdaComposableLambdaInstance.invoke(composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            } else {
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-665054890, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt.loaded.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-665054890, i, -1, "com.robinhood.android.crypto.tab.ui.discover.loaded.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:241)");
                        }
                        composableLambdaComposableLambdaInstance.invoke(composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            }
            if (cryptoHomeDiscoverExperimentViewState.getTradingOptionsItems() == null) {
                InstrumentListItemComposable.loadingLazyInstruments$default(lazyListScope, null, cryptoHomeDiscoverExperimentViewState.getOnlyShowPreviewItems() ? 5 : 10, 1, null);
            } else {
                final ImmutableList<CryptoTradingOptions.TradingOptionItem> tradingOptionsItems = cryptoHomeDiscoverExperimentViewState.getTradingOptionsItems();
                final C13089x68e3c424 c13089x68e3c424 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(CryptoTradingOptions.TradingOptionItem tradingOptionItem) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((CryptoTradingOptions.TradingOptionItem) obj);
                    }
                };
                lazyListScope.items(tradingOptionsItems.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c13089x68e3c424.invoke(tradingOptionsItems.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                        int i3;
                        if ((i2 & 6) == 0) {
                            i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        final CryptoTradingOptions.TradingOptionItem tradingOptionItem = (CryptoTradingOptions.TradingOptionItem) tradingOptionsItems.get(i);
                        composer.startReplaceGroup(606526541);
                        final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                        final Screen screen = ((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion2 = Composer.INSTANCE;
                        if (objRememberedValue == companion2.getEmpty()) {
                            objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$4$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.selectableGroup(semantics);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer.changedInstance(tradingOptionItem) | composer.changedInstance(cryptoHomeDiscoverExperimentViewState) | composer.changedInstance(current) | composer.changedInstance(screen) | composer.changedInstance(navigator) | composer.changedInstance(context);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                            final CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState2 = cryptoHomeDiscoverExperimentViewState;
                            final Navigator navigator2 = navigator;
                            final Context context2 = context;
                            Object obj = new Function0<Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$4$2$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    EventLogger.DefaultImpls.logTap$default(current, null, screen, new Component(Component.ComponentType.EXPLORE_SECTION, "instrument_row_" + tradingOptionItem.getSubtitle(), null, 4, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, cryptoHomeDiscoverExperimentViewState2.getSelectedCategoryServerName(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), false, 41, null);
                                    Navigator.DefaultImpls.handleDeepLink$default(navigator2, context2, Uri.parse(tradingOptionItem.getDeeplink()), null, null, false, null, 60, null);
                                }
                            };
                            composer.updateRememberedValue(obj);
                            objRememberedValue2 = obj;
                        }
                        composer.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierSemantics$default, false, null, null, (Function0) objRememberedValue2, 7, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4893clickableXHw0xAI$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        InstrumentRow5.InstrumentRow(ModifiersKt.autoLogEvents$default(AutomationTestTagModifierExt.automationTestTag(companion, "ResultInstrumentRow"), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, cryptoHomeDiscoverExperimentViewState.getSelectedCategoryServerName(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.EXPLORE_SECTION, "instrument_row_" + tradingOptionItem.getSubtitle(), null, 4, null), null, 39, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), CryptoTradingOptionsInstrumentRowState3.toInstrumentRowState(tradingOptionItem, true, false, composer, 48, 2), null, null, composer, InstrumentRowState.$stable << 3, 12);
                        composer.endNode();
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            if (cryptoHomeDiscoverExperimentViewState.getOnlyShowPreviewItems()) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-852452017, true, new C131025(cryptoHomeDiscoverExperimentViewState, navigator, context)), 3, null);
            }
        }

        /* compiled from: CryptoHomeDiscoverExperimentComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$5 */
        static final class C131025 implements Function3<LazyItemScope, Composer, Integer, Unit> {
            final /* synthetic */ Context $context;
            final /* synthetic */ Navigator $navigator;
            final /* synthetic */ CryptoHomeDiscoverExperimentViewState $viewState;

            C131025(CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, Navigator navigator, Context context) {
                this.$viewState = cryptoHomeDiscoverExperimentViewState;
                this.$navigator = navigator;
                this.$context = context;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-852452017, i, -1, "com.robinhood.android.crypto.tab.ui.discover.loaded.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:299)");
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(AutomationTestTagModifierExt.automationTestTag(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), composer, 6, 0), ExperimentTestTags.SHOW_MORE_BUTTON), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.VIEW_ALL, null, new Component(Component.ComponentType.EXPLORE_SECTION, "show_more_button", null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null);
                String strStringResource = StringResources_androidKt.stringResource(C13013R.string.explore_cta_show_more, composer, 0);
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                final CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState = this.$viewState;
                final Navigator navigator = this.$navigator;
                final Context context = this.$context;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$loaded$5$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeDiscoverExperimentComposableKt.C131025.invoke$lambda$1$lambda$0(cryptoHomeDiscoverExperimentViewState, navigator, context);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierAutoLogEvents$default, null, null, false, null, composer, 0, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, Navigator navigator, Context context) {
                Navigator.DefaultImpls.showFragment$default(navigator, context, cryptoHomeDiscoverExperimentViewState.getFragmentKey(), false, false, false, null, false, null, true, false, null, NavigationType.PUSH, 1788, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void loading(LazyListScope lazyListScope) {
            ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt composableSingletons$CryptoHomeDiscoverExperimentComposableKt = ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt.INSTANCE;
            LazyListScope.item$default(lazyListScope, null, null, composableSingletons$CryptoHomeDiscoverExperimentComposableKt.m13002getLambda$164465143$feature_crypto_tab_externalDebug(), 3, null);
            LazyListScope.item$default(lazyListScope, null, null, composableSingletons$CryptoHomeDiscoverExperimentComposableKt.m13000getLambda$1138187968$feature_crypto_tab_externalDebug(), 3, null);
            InstrumentListItemComposable.loadingLazyInstruments$default(lazyListScope, null, 4, 1, null);
            LazyListScope.item$default(lazyListScope, null, null, composableSingletons$CryptoHomeDiscoverExperimentComposableKt.m13001getLambda$1612213951$feature_crypto_tab_externalDebug(), 3, null);
        }

        private static final void CryptoHomeDiscoverExperimentComposableLoadingPreview(Composer composer, final int i) {
            Composer composerStartRestartGroup = composer.startRestartGroup(-975801389);
            if (i != 0 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-975801389, i, -1, "com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableLoadingPreview (CryptoHomeDiscoverExperimentComposable.kt:397)");
                }
                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt.INSTANCE.getLambda$506469147$feature_crypto_tab_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverExperimentComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoHomeDiscoverExperimentComposableKt.CryptoHomeDiscoverExperimentComposableLoadingPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }
