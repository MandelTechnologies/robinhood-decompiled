package com.robinhood.android.equities.taxlots.viewLots;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBar;
import com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarNestedScrollConnection;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpers4;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableKt;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableViewState;
import com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposable;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import equity_trading_tax_lots.proto.p460v1.TaxLotStatus;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.Job;

/* compiled from: ViewLotsComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a®\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2K\u0010\u0010\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00012\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"ViewLotsComposable", "", "accountNumber", "", "orderId", "Ljava/util/UUID;", "instrumentId", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsDuxo;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsDuxo;Landroidx/compose/runtime/Composer;II)V", "viewState", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsViewState;", "bind", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/Job;", "logBackClick", "requestNextPage", "(Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsViewState;Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewViewLotsComposable", "(Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsViewState;Landroidx/compose/runtime/Composer;I)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ViewLotsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewViewLotsComposable$lambda$9(ViewLotsViewState viewLotsViewState, int i, Composer composer, int i2) {
        PreviewViewLotsComposable(viewLotsViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViewLotsComposable$lambda$3(String str, UUID uuid, UUID uuid2, Function0 function0, Modifier modifier, ViewLotsDuxo viewLotsDuxo, int i, int i2, Composer composer, int i3) {
        ViewLotsComposable(str, uuid, uuid2, function0, modifier, viewLotsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViewLotsComposable$lambda$8(ViewLotsViewState viewLotsViewState, String str, UUID uuid, UUID uuid2, Function0 function0, Function3 function3, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ViewLotsComposable(viewLotsViewState, str, uuid, uuid2, function0, function3, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ViewLotsComposable(final String accountNumber, final UUID orderId, final UUID instrumentId, final Function0<Unit> onBackClick, Modifier modifier, ViewLotsDuxo viewLotsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ViewLotsDuxo viewLotsDuxo2;
        int i4;
        ViewLotsDuxo viewLotsDuxo3;
        Modifier modifier3;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        final Modifier modifier4;
        final ViewLotsDuxo viewLotsDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1275941312);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(orderId) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(instrumentId) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    viewLotsDuxo2 = viewLotsDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(viewLotsDuxo2) ? 131072 : 65536;
                    i3 |= i6;
                } else {
                    viewLotsDuxo2 = viewLotsDuxo;
                }
                i3 |= i6;
            } else {
                viewLotsDuxo2 = viewLotsDuxo;
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ViewLotsDuxo.class), current, "viewLots", factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 384, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$ViewLotsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$ViewLotsComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3 & (-458753);
                        viewLotsDuxo3 = (ViewLotsDuxo) baseDuxo;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1275941312, i4, -1, "com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposable (ViewLotsComposable.kt:48)");
                    }
                    ViewLotsViewState viewLotsViewState = (ViewLotsViewState) FlowExtKt.collectAsStateWithLifecycle(viewLotsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(viewLotsDuxo3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ViewLotsComposable2(viewLotsDuxo3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function3 function3 = (Function3) ((KFunction) objRememberedValue);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(viewLotsDuxo3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ViewLotsComposable3(viewLotsDuxo3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(viewLotsDuxo3);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new ViewLotsComposable4(viewLotsDuxo3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier3;
                    ViewLotsComposable(viewLotsViewState, accountNumber, orderId, instrumentId, onBackClick, function3, function0, (Function0) ((KFunction) objRememberedValue3), modifier5, composerStartRestartGroup, ((i4 << 12) & 234881024) | ((i4 << 3) & 65520), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    viewLotsDuxo4 = viewLotsDuxo3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                }
                i4 = i3;
                modifier3 = modifier2;
                viewLotsDuxo3 = viewLotsDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ViewLotsViewState viewLotsViewState2 = (ViewLotsViewState) FlowExtKt.collectAsStateWithLifecycle(viewLotsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(viewLotsDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new ViewLotsComposable2(viewLotsDuxo3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Function3 function32 = (Function3) ((KFunction) objRememberedValue);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(viewLotsDuxo3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new ViewLotsComposable3(viewLotsDuxo3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Function0 function02 = (Function0) ((KFunction) objRememberedValue2);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(viewLotsDuxo3);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance3) {
                            objRememberedValue3 = new ViewLotsComposable4(viewLotsDuxo3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier3;
                            ViewLotsComposable(viewLotsViewState2, accountNumber, orderId, instrumentId, onBackClick, function32, function02, (Function0) ((KFunction) objRememberedValue3), modifier52, composerStartRestartGroup, ((i4 << 12) & 234881024) | ((i4 << 3) & 65520), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier52;
                            viewLotsDuxo4 = viewLotsDuxo3;
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                viewLotsDuxo4 = viewLotsDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ViewLotsComposable.ViewLotsComposable$lambda$3(accountNumber, orderId, instrumentId, onBackClick, modifier4, viewLotsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                    i4 = i3;
                    modifier3 = modifier2;
                    viewLotsDuxo3 = viewLotsDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ViewLotsViewState viewLotsViewState22 = (ViewLotsViewState) FlowExtKt.collectAsStateWithLifecycle(viewLotsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(viewLotsDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void ViewLotsComposable(ViewLotsViewState viewLotsViewState, final String accountNumber, final UUID orderId, final UUID instrumentId, Function0<Unit> onBackClick, final Function3<? super String, ? super UUID, ? super UUID, ? extends Job> bind, final Function0<Unit> logBackClick, final Function0<Unit> requestNextPage, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Function0<Unit> function0;
        final ViewLotsViewState viewState = viewLotsViewState;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(bind, "bind");
        Intrinsics.checkNotNullParameter(logBackClick, "logBackClick");
        Intrinsics.checkNotNullParameter(requestNextPage, "requestNextPage");
        Composer composerStartRestartGroup = composer.startRestartGroup(74531799);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(orderId) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(instrumentId) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(bind) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(logBackClick) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(requestNextPage) ? 8388608 : 4194304;
        }
        int i4 = i2 & 256;
        if (i4 != 0) {
            i3 |= 100663296;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 100663296) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            }
        }
        if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onBackClick;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(74531799, i3, -1, "com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposable (ViewLotsComposable.kt:73)");
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i3 & 112) == 32) | ((458752 & i3) == 131072) | composerStartRestartGroup.changedInstance(orderId) | composerStartRestartGroup.changedInstance(instrumentId);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ViewLotsComposable.ViewLotsComposable$lambda$6$lambda$5(bind, accountNumber, orderId, instrumentId, (LifecycleResumePauseEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LifecycleEffectKt.LifecycleResumeEffect(accountNumber, orderId, instrumentId, lifecycleOwner, (Function1) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 1022, 0);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new TaxLotsTopAppBarNestedScrollConnection(lazyListStateRememberLazyListState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection = (TaxLotsTopAppBarNestedScrollConnection) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
            viewState = viewLotsViewState;
            function0 = onBackClick;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1309350509, true, new C149826(viewState, accountNumber, orderId, instrumentId, logBackClick, onBackClick, taxLotsTopAppBarNestedScrollConnection), composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1736620238, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt.ViewLotsComposable.7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1736620238, i6, -1, "com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposable.<anonymous> (ViewLotsComposable.kt:101)");
                    }
                    BentoButtonBar2.BentoButtonBar(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), StringResources_androidKt.stringResource(C14807R.string.tax_lots_view_lots_button_bar_helper, composer2, 0), null, false, null, null, function0, "Done", false, null, true, null, null, false, null, false, composer2, 12582912, 6, 64316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(200886952, true, new C149848(viewState, requestNextPage, lazyListStateRememberLazyListState), composerStartRestartGroup, 54);
            modifier2 = modifier3;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, composableLambdaRememberComposableLambda3, composerStartRestartGroup, 805306800, EnumC7081g.f2774x74902ae0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ViewLotsComposable.ViewLotsComposable$lambda$8(viewState, accountNumber, orderId, instrumentId, function0, bind, logBackClick, requestNextPage, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult ViewLotsComposable$lambda$6$lambda$5(Function3 function3, String str, UUID uuid, UUID uuid2, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job job = (Job) function3.invoke(str, uuid, uuid2);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$ViewLotsComposable$lambda$6$lambda$5$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
        };
    }

    /* compiled from: ViewLotsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$ViewLotsComposable$6 */
    static final class C149826 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ Function0<Unit> $logBackClick;
        final /* synthetic */ Function0<Unit> $onBackClick;
        final /* synthetic */ UUID $orderId;
        final /* synthetic */ TaxLotsTopAppBarNestedScrollConnection $topAppBarNestedScrollConnection;
        final /* synthetic */ ViewLotsViewState $viewState;

        C149826(ViewLotsViewState viewLotsViewState, String str, UUID uuid, UUID uuid2, Function0<Unit> function0, Function0<Unit> function02, TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection) {
            this.$viewState = viewLotsViewState;
            this.$accountNumber = str;
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$logBackClick = function0;
            this.$onBackClick = function02;
            this.$topAppBarNestedScrollConnection = taxLotsTopAppBarNestedScrollConnection;
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
                ComposerKt.traceEventStart(-1309350509, i, -1, "com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposable.<anonymous> (ViewLotsComposable.kt:87)");
            }
            TaxLotStatus taxLotStatus = TaxLotStatus.HISTORY;
            TaxLotsContext taxLotsLoggingContext = this.$viewState.getTaxLotsLoggingContext();
            String str = this.$accountNumber;
            UUID uuid = this.$orderId;
            UUID uuid2 = this.$instrumentId;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$logBackClick) | composer.changed(this.$onBackClick);
            final Function0<Unit> function0 = this.$logBackClick;
            final Function0<Unit> function02 = this.$onBackClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$ViewLotsComposable$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ViewLotsComposable.C149826.invoke$lambda$1$lambda$0(function0, function02);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            TaxLotsTopAppBar.TaxLotsTopAppBar(str, uuid, uuid2, taxLotStatus, taxLotsLoggingContext, (Function0) objRememberedValue, this.$topAppBarNestedScrollConnection, null, null, composer, 3072, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0, Function0 function02) {
            function0.invoke();
            function02.invoke();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ViewLotsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$ViewLotsComposable$8 */
    static final class C149848 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $requestNextPage;
        final /* synthetic */ LazyListState $scrollState;
        final /* synthetic */ ViewLotsViewState $viewState;

        C149848(ViewLotsViewState viewLotsViewState, Function0<Unit> function0, LazyListState lazyListState) {
            this.$viewState = viewLotsViewState;
            this.$requestNextPage = function0;
            this.$scrollState = lazyListState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues padding, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(padding, "padding");
            if ((i & 6) == 0) {
                i2 = (composer.changed(padding) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(200886952, i2, -1, "com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposable.<anonymous> (ViewLotsComposable.kt:110)");
            }
            TaxLotsTableViewState tableState = this.$viewState.getTableState();
            if (Intrinsics.areEqual(tableState, TaxLotsTableViewState.Loading.INSTANCE)) {
                composer.startReplaceGroup(-221163878);
                LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, false, 3, composer, 3120, 5);
                composer.endReplaceGroup();
            } else {
                if (!(tableState instanceof TaxLotsTableViewState.Loaded)) {
                    composer.startReplaceGroup(-221165831);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1734033773);
                Modifier modifierZIndex = ZIndexModifier2.zIndex(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), padding), -1.0f);
                TaxLotsTableViewState.Loaded loaded = (TaxLotsTableViewState.Loaded) tableState;
                GenericTableData<TaxLotsTableHelpers4> tableData = loaded.getTableData();
                boolean canRequestNextPage = loaded.getCanRequestNextPage();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$ViewLotsComposable$8$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ViewLotsComposable.C149848.invoke$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                Function0<Unit> function0 = this.$requestNextPage;
                LazyListState lazyListState = this.$scrollState;
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$ViewLotsComposable$8$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ViewLotsComposable.C149848.invoke$lambda$3$lambda$2((BigDecimal) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                TaxLotsTableKt.TaxLotsTable(tableData, canRequestNextPage, function1, function0, null, modifierZIndex, lazyListState, (Function1) objRememberedValue2, composer, GenericTableData.$stable | 12607872, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(boolean z) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(BigDecimal bigDecimal) {
            return Unit.INSTANCE;
        }
    }

    private static final void PreviewViewLotsComposable(final ViewLotsViewState viewLotsViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1381453840);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewLotsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1381453840, i2, -1, "com.robinhood.android.equities.taxlots.viewLots.PreviewViewLotsComposable (ViewLotsComposable.kt:139)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), ComposableLambda3.rememberComposableLambda(-1262570320, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt.PreviewViewLotsComposable.1

                /* compiled from: ViewLotsComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$PreviewViewLotsComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ ViewLotsViewState $viewState;

                    AnonymousClass1(ViewLotsViewState viewLotsViewState) {
                        this.$viewState = viewLotsViewState;
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
                            ComposerKt.traceEventStart(1484924008, i, -1, "com.robinhood.android.equities.taxlots.viewLots.PreviewViewLotsComposable.<anonymous>.<anonymous> (ViewLotsComposable.kt:144)");
                        }
                        ViewLotsViewState viewLotsViewState = this.$viewState;
                        UUID uuid = new UUID(0L, 20L);
                        UUID uuid2 = new UUID(10L, 0L);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$PreviewViewLotsComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function3() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$PreviewViewLotsComposable$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    return ViewLotsComposable.C149811.AnonymousClass1.invoke$lambda$3$lambda$2((String) obj, (UUID) obj2, (UUID) obj3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function3 function3 = (Function3) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$PreviewViewLotsComposable$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function02 = (Function0) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$PreviewViewLotsComposable$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        ViewLotsComposable.ViewLotsComposable(viewLotsViewState, "123456789", uuid, uuid2, function0, function3, function02, (Function0) objRememberedValue4, null, composer, 14377008, 256);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Job invoke$lambda$3$lambda$2(String str, UUID uuid, UUID uuid2) {
                        Intrinsics.checkNotNullParameter(str, "<unused var>");
                        Intrinsics.checkNotNullParameter(uuid, "<unused var>");
                        Intrinsics.checkNotNullParameter(uuid2, "<unused var>");
                        return CompletableDeferred3.CompletableDeferred((Job) null);
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
                        ComposerKt.traceEventStart(-1262570320, i3, -1, "com.robinhood.android.equities.taxlots.viewLots.PreviewViewLotsComposable.<anonymous> (ViewLotsComposable.kt:143)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1484924008, true, new AnonymousClass1(viewLotsViewState), composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ViewLotsComposable.PreviewViewLotsComposable$lambda$9(viewLotsViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
