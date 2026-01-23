package com.robinhood.android.dashboard.lib.buyingpower;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PortfolioBuyingPowerRow.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u0017\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a)\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"BuyingPowerPlaceholderTag", "", "BuyingPowerPlaceholderPrimaryText", "BuyingPowerPlaceholderMetaText", "PlaceholderBuyingPowerRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PortfolioBuyingPowerRow", "accountNumber", "duxo", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-account-home_externalDebug", "viewState", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerRowKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioBuyingPowerRow3 {
    private static final String BuyingPowerPlaceholderMetaText = "$X,XXX.XX";
    private static final String BuyingPowerPlaceholderPrimaryText = "Buying power";
    public static final String BuyingPowerPlaceholderTag = "placeholder_buying_power";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaceholderBuyingPowerRow$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaceholderBuyingPowerRow(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioBuyingPowerRow$lambda$4(String str, Modifier modifier, PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo, int i, int i2, Composer composer, int i3) {
        PortfolioBuyingPowerRow(str, modifier, portfolioBuyingPowerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PlaceholderBuyingPowerRow(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-898709306);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-898709306, i3, -1, "com.robinhood.android.dashboard.lib.buyingpower.PlaceholderBuyingPowerRow (PortfolioBuyingPowerRow.kt:22)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(modifier, BuyingPowerPlaceholderTag), null, PortfolioBuyingPowerRow.INSTANCE.m13192getLambda$1818133930$lib_account_home_externalDebug(), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioBuyingPowerRow3.PlaceholderBuyingPowerRow$lambda$0(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioBuyingPowerRow(final String accountNumber, Modifier modifier, PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo2;
        Modifier modifier3;
        int i4;
        final PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo3;
        PortfolioBuyingPowerViewState portfolioBuyingPowerViewStatePortfolioBuyingPowerRow$lambda$1;
        Modifier modifier4;
        boolean zChangedInstance;
        Object objRememberedValue;
        final PortfolioBuyingPowerDuxo portfolioBuyingPowerDuxo4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(-109428273);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    portfolioBuyingPowerDuxo2 = portfolioBuyingPowerDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(portfolioBuyingPowerDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    portfolioBuyingPowerDuxo2 = portfolioBuyingPowerDuxo;
                }
                i3 |= i6;
            } else {
                portfolioBuyingPowerDuxo2 = portfolioBuyingPowerDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PortfolioBuyingPowerDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerRowKt$PortfolioBuyingPowerRow$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerRowKt$PortfolioBuyingPowerRow$$inlined$duxo$1.1
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
                        i4 = i3 & (-897);
                        portfolioBuyingPowerDuxo3 = (PortfolioBuyingPowerDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-109428273, i4, -1, "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerRow (PortfolioBuyingPowerRow.kt:38)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(portfolioBuyingPowerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup = composerStartRestartGroup;
                        portfolioBuyingPowerViewStatePortfolioBuyingPowerRow$lambda$1 = PortfolioBuyingPowerRow$lambda$1(snapshotState4CollectAsStateWithLifecycle);
                        if (portfolioBuyingPowerViewStatePortfolioBuyingPowerRow$lambda$1 instanceof PortfolioBuyingPowerViewState.Loaded) {
                            modifier4 = modifier3;
                            if (!(portfolioBuyingPowerViewStatePortfolioBuyingPowerRow$lambda$1 instanceof PortfolioBuyingPowerViewState.Loading)) {
                                composerStartRestartGroup.startReplaceGroup(-2081347507);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-96849270);
                            IdlingResourceCounters2.setBusy(IdlingResourceType.WATCHLIST_BUYING_POWER, true);
                            PlaceholderBuyingPowerRow(modifier4, composerStartRestartGroup, (i4 >> 3) & 14, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-97194455);
                            IdlingResourceCounters2.setBusy(IdlingResourceType.WATCHLIST_BUYING_POWER, false);
                            PortfolioBuyingPowerViewState.Loaded loaded = (PortfolioBuyingPowerViewState.Loaded) portfolioBuyingPowerViewStatePortfolioBuyingPowerRow$lambda$1;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(portfolioBuyingPowerDuxo3) | ((i4 & 14) == 4);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new PortfolioBuyingPower4() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerRowKt$PortfolioBuyingPowerRow$1$1
                                    @Override // com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower4
                                    public final void markTooltipSeen() {
                                        portfolioBuyingPowerDuxo3.markTooltipSeen(accountNumber);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            modifier4 = modifier3;
                            PortfolioBuyingPower5.PortfolioBuyingPower(modifier4, loaded, (PortfolioBuyingPower4) objRememberedValue3, composerStartRestartGroup, (i4 >> 3) & 14, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i7 = i4 & 14;
                        zChangedInstance = composerStartRestartGroup.changedInstance(portfolioBuyingPowerDuxo3) | (i7 == 4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PortfolioBuyingPowerRow5(portfolioBuyingPowerDuxo3, accountNumber, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        portfolioBuyingPowerDuxo4 = portfolioBuyingPowerDuxo3;
                        modifier5 = modifier4;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                portfolioBuyingPowerDuxo3 = portfolioBuyingPowerDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(portfolioBuyingPowerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                portfolioBuyingPowerViewStatePortfolioBuyingPowerRow$lambda$1 = PortfolioBuyingPowerRow$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (portfolioBuyingPowerViewStatePortfolioBuyingPowerRow$lambda$1 instanceof PortfolioBuyingPowerViewState.Loaded) {
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i72 = i4 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(portfolioBuyingPowerDuxo3) | (i72 == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new PortfolioBuyingPowerRow5(portfolioBuyingPowerDuxo3, accountNumber, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i72);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    portfolioBuyingPowerDuxo4 = portfolioBuyingPowerDuxo3;
                    modifier5 = modifier4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                portfolioBuyingPowerDuxo4 = portfolioBuyingPowerDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PortfolioBuyingPowerRow3.PortfolioBuyingPowerRow$lambda$4(accountNumber, modifier5, portfolioBuyingPowerDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final PortfolioBuyingPowerViewState PortfolioBuyingPowerRow$lambda$1(SnapshotState4<? extends PortfolioBuyingPowerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
