package com.robinhood.android.advisory.tlh.flow.accounts;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import com.robinhood.android.advisory.tlh.C9369R;
import com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreen3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestChooseAccounts;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestChooseAccountsRow;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: HarvestFlowAccountSelectionScreen.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\u001a;\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015X\u008a\u008e\u0002"}, m3636d2 = {"HarvestFlowAccountSelectionScreen", "", "onContinue", "Lkotlin/Function1;", "", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/advisory/tlh/flow/accounts/HarvestFlowAccountSelectionDuxo;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/tlh/flow/accounts/HarvestFlowAccountSelectionDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadedHarvestFlowAccountSelectionScreen", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestChooseAccounts;", "(Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestChooseAccounts;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadedAccountSelectionScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-tax-loss-harvesting_externalDebug", "viewState", "Lcom/robinhood/android/advisory/tlh/flow/accounts/HarvestFlowAccountSelectionViewState;", "selected", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class HarvestFlowAccountSelectionScreen3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestFlowAccountSelectionScreen$lambda$1(Function1 function1, Modifier modifier, HarvestFlowAccountSelectionDuxo harvestFlowAccountSelectionDuxo, int i, int i2, Composer composer, int i3) {
        HarvestFlowAccountSelectionScreen(function1, modifier, harvestFlowAccountSelectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedAccountSelectionScreenPreview$lambda$9(int i, Composer composer, int i2) {
        LoadedAccountSelectionScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedHarvestFlowAccountSelectionScreen$lambda$8(TaxLossHarvestChooseAccounts taxLossHarvestChooseAccounts, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedHarvestFlowAccountSelectionScreen(taxLossHarvestChooseAccounts, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void HarvestFlowAccountSelectionScreen(final Function1<? super List<String>, Unit> onContinue, Modifier modifier, HarvestFlowAccountSelectionDuxo harvestFlowAccountSelectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final HarvestFlowAccountSelectionDuxo harvestFlowAccountSelectionDuxo2;
        Modifier modifier3;
        Composer composer3;
        final Modifier modifier4;
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(56384689);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onContinue) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changedInstance(harvestFlowAccountSelectionDuxo)) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier;
            harvestFlowAccountSelectionDuxo2 = harvestFlowAccountSelectionDuxo;
            composer3 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier2 = i4 != 0 ? Modifier.INSTANCE : modifier;
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    composer2 = composerStartRestartGroup;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HarvestFlowAccountSelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$HarvestFlowAccountSelectionScreen$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$HarvestFlowAccountSelectionScreen$$inlined$duxo$1.1
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
                    harvestFlowAccountSelectionDuxo2 = (HarvestFlowAccountSelectionDuxo) baseDuxo;
                    i3 &= -897;
                } else {
                    composer2 = composerStartRestartGroup;
                    harvestFlowAccountSelectionDuxo2 = harvestFlowAccountSelectionDuxo;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier2 = modifier;
                harvestFlowAccountSelectionDuxo2 = harvestFlowAccountSelectionDuxo;
                composer2 = composerStartRestartGroup;
            }
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(56384689, i3, -1, "com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreen (HarvestFlowAccountSelectionScreen.kt:46)");
            }
            Composer composer4 = composer2;
            TaxLossHarvestChooseAccounts data = HarvestFlowAccountSelectionScreen$lambda$0(FlowExtKt.collectAsStateWithLifecycle(harvestFlowAccountSelectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7)).getData();
            if (data == null) {
                composer4.startReplaceGroup(424364475);
                LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 3, composer4, 3504, 1);
                composer3 = composer4;
                composer3.endReplaceGroup();
                modifier3 = modifier2;
            } else {
                composer4.startReplaceGroup(424562968);
                modifier3 = modifier2;
                LoadedHarvestFlowAccountSelectionScreen(data, onContinue, modifier3, composer4, (i3 << 3) & 1008, 0);
                composer3 = composer4;
                composer3.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HarvestFlowAccountSelectionScreen3.HarvestFlowAccountSelectionScreen$lambda$1(onContinue, modifier4, harvestFlowAccountSelectionDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedHarvestFlowAccountSelectionScreen(final TaxLossHarvestChooseAccounts data, final Function1<? super List<String>, Unit> onContinue, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(639384614);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(639384614, i3, -1, "com.robinhood.android.advisory.tlh.flow.accounts.LoadedHarvestFlowAccountSelectionScreen (HarvestFlowAccountSelectionScreen.kt:73)");
                }
                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(data);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HarvestFlowAccountSelectionScreen3.LoadedHarvestFlowAccountSelectionScreen$lambda$5$lambda$4(data);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_CHOOSE_ACCOUNTS, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1659607697, true, new C94051(modifier5, scrollStateRememberScrollState, onContinue, (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6), data), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HarvestFlowAccountSelectionScreen3.LoadedHarvestFlowAccountSelectionScreen$lambda$8(data, onContinue, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(data);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HarvestFlowAccountSelectionScreen3.LoadedHarvestFlowAccountSelectionScreen$lambda$5$lambda$4(data);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_CHOOSE_ACCOUNTS, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1659607697, true, new C94051(modifier52, scrollStateRememberScrollState2, onContinue, (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6), data), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState LoadedHarvestFlowAccountSelectionScreen$lambda$5$lambda$4(TaxLossHarvestChooseAccounts taxLossHarvestChooseAccounts) {
        List<TaxLossHarvestChooseAccountsRow> rows = taxLossHarvestChooseAccounts.getRows();
        ArrayList arrayList = new ArrayList();
        for (Object obj : rows) {
            if (((TaxLossHarvestChooseAccountsRow) obj).isChecked()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TaxLossHarvestChooseAccountsRow) it.next()).getAccountNumber());
        }
        return SnapshotState3.mutableStateOf$default(CollectionsKt.toSet(arrayList2), null, 2, null);
    }

    private static final HarvestFlowAccountSelectionViewState HarvestFlowAccountSelectionScreen$lambda$0(SnapshotState4<HarvestFlowAccountSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<String> LoadedHarvestFlowAccountSelectionScreen$lambda$6(SnapshotState<Set<String>> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: HarvestFlowAccountSelectionScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$LoadedHarvestFlowAccountSelectionScreen$1 */
    static final class C94051 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TaxLossHarvestChooseAccounts $data;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<List<String>, Unit> $onContinue;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ SnapshotState<Set<String>> $selected$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C94051(Modifier modifier, ScrollState scrollState, Function1<? super List<String>, Unit> function1, SnapshotState<Set<String>> snapshotState, TaxLossHarvestChooseAccounts taxLossHarvestChooseAccounts) {
            this.$modifier = modifier;
            this.$scrollState = scrollState;
            this.$onContinue = function1;
            this.$selected$delegate = snapshotState;
            this.$data = taxLossHarvestChooseAccounts;
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
                ComposerKt.traceEventStart(1659607697, i, -1, "com.robinhood.android.advisory.tlh.flow.accounts.LoadedHarvestFlowAccountSelectionScreen.<anonymous> (HarvestFlowAccountSelectionScreen.kt:90)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null);
            ScrollState scrollState = this.$scrollState;
            final Function1<List<String>, Unit> function1 = this.$onContinue;
            SnapshotState<Set<String>> snapshotState = this.$selected$delegate;
            final TaxLossHarvestChooseAccounts taxLossHarvestChooseAccounts = this.$data;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            SnapshotState<Set<String>> snapshotState2 = snapshotState;
            BentoText2.m20747BentoText38GnDrw(taxLossHarvestChooseAccounts.getTitle(), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8184);
            BentoMarkdownText2.BentoMarkdownText(taxLossHarvestChooseAccounts.getSubtitleMarkdown(), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion3, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextM(), 0, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
            composer.startReplaceGroup(87846632);
            for (final TaxLossHarvestChooseAccountsRow taxLossHarvestChooseAccountsRow : taxLossHarvestChooseAccounts.getRows()) {
                final String accountNumber = taxLossHarvestChooseAccountsRow.getAccountNumber();
                final boolean zIsChecked = taxLossHarvestChooseAccountsRow.isChecked();
                boolean z = zIsChecked || HarvestFlowAccountSelectionScreen3.LoadedHarvestFlowAccountSelectionScreen$lambda$6(snapshotState2).contains(accountNumber);
                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.Checkbox;
                String title = taxLossHarvestChooseAccountsRow.getTitle();
                String subtitle = taxLossHarvestChooseAccountsRow.getSubtitle();
                BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, title, z, (BentoBaseRowState.Text) (subtitle != null ? new BentoBaseRowState.Text.Plain(subtitle) : null), taxLossHarvestChooseAccountsRow.isEditable(), false, (BentoSelectionRowState.IconPosition) new BentoSelectionRowState.IconPosition.Leading(ComposableLambda3.rememberComposableLambda(84551156, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$LoadedHarvestFlowAccountSelectionScreen$1$1$1$1$2
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
                            ComposerKt.traceEventStart(84551156, i3, -1, "com.robinhood.android.advisory.tlh.flow.accounts.LoadedHarvestFlowAccountSelectionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HarvestFlowAccountSelectionScreen.kt:135)");
                        }
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(taxLossHarvestChooseAccountsRow.getIcon());
                        if (serverToBentoAssetMapper2FromServerValue == null) {
                            serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.ROBINHOOD_24;
                        }
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2FromServerValue), null, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54)), false, false, (ImmutableMap) null, (Function0) null, 1952, (DefaultConstructorMarker) null);
                composer.startReplaceGroup(-1746271574);
                final SnapshotState<Set<String>> snapshotState3 = snapshotState2;
                boolean zChanged = composer.changed(zIsChecked) | composer.changed(snapshotState3) | composer.changed(accountNumber);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$LoadedHarvestFlowAccountSelectionScreen$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HarvestFlowAccountSelectionScreen3.C94051.invoke$lambda$10$lambda$7$lambda$3$lambda$2$lambda$1(zIsChecked, accountNumber, snapshotState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer, BentoSelectionRowState.$stable << 3, 1);
                snapshotState2 = snapshotState3;
            }
            final SnapshotState<Set<String>> snapshotState4 = snapshotState2;
            composer.endReplaceGroup();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(companion4, bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            String strStringResource = StringResources_androidKt.stringResource(C9369R.string.harvest_account_selection_select_all, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(snapshotState4) | composer.changedInstance(taxLossHarvestChooseAccounts);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$LoadedHarvestFlowAccountSelectionScreen$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HarvestFlowAccountSelectionScreen3.C94051.invoke$lambda$10$lambda$7$lambda$6$lambda$5(taxLossHarvestChooseAccounts, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, strStringResource, modifierM5143paddingVpY3zN4, null, null, false, null, composer, 0, 120);
            composer.endNode();
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion4, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            String strStringResource2 = StringResources_androidKt.stringResource(C9369R.string.harvest_account_selection_cta, composer, 0);
            BentoButtons.Type type3 = BentoButtons.Type.Primary;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged3 = composer.changed(function1) | composer.changed(snapshotState4);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$LoadedHarvestFlowAccountSelectionScreen$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HarvestFlowAccountSelectionScreen3.C94051.invoke$lambda$10$lambda$9$lambda$8(function1, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource2, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, type3, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$7$lambda$3$lambda$2$lambda$1(boolean z, String str, SnapshotState snapshotState) {
            if (!z) {
                HarvestFlowAccountSelectionScreen3.LoadedHarvestFlowAccountSelectionScreen$lambda$7(snapshotState, HarvestFlowAccountSelectionScreen3.LoadedHarvestFlowAccountSelectionScreen$lambda$6(snapshotState).contains(str) ? SetsKt.minus((Set<? extends String>) HarvestFlowAccountSelectionScreen3.LoadedHarvestFlowAccountSelectionScreen$lambda$6(snapshotState), str) : SetsKt.plus((Set<? extends String>) HarvestFlowAccountSelectionScreen3.LoadedHarvestFlowAccountSelectionScreen$lambda$6(snapshotState), str));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$7$lambda$6$lambda$5(TaxLossHarvestChooseAccounts taxLossHarvestChooseAccounts, SnapshotState snapshotState) {
            List<TaxLossHarvestChooseAccountsRow> rows = taxLossHarvestChooseAccounts.getRows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
            Iterator<T> it = rows.iterator();
            while (it.hasNext()) {
                arrayList.add(((TaxLossHarvestChooseAccountsRow) it.next()).getAccountNumber());
            }
            HarvestFlowAccountSelectionScreen3.LoadedHarvestFlowAccountSelectionScreen$lambda$7(snapshotState, CollectionsKt.toSet(arrayList));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$8(Function1 function1, SnapshotState snapshotState) {
            function1.invoke(CollectionsKt.toList(HarvestFlowAccountSelectionScreen3.LoadedHarvestFlowAccountSelectionScreen$lambda$6(snapshotState)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedHarvestFlowAccountSelectionScreen$lambda$7(SnapshotState<Set<String>> snapshotState, Set<String> set) {
        snapshotState.setValue(set);
    }

    private static final void LoadedAccountSelectionScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1554083647);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1554083647, i, -1, "com.robinhood.android.advisory.tlh.flow.accounts.LoadedAccountSelectionScreenPreview (HarvestFlowAccountSelectionScreen.kt:182)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, HarvestFlowAccountSelectionScreen.INSTANCE.getLambda$74963079$feature_tax_loss_harvesting_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HarvestFlowAccountSelectionScreen3.LoadedAccountSelectionScreenPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
