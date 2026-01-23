package com.robinhood.android.crypto.tab.p093ui.staking;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoStakingOverviewSectionComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"CryptoStakingOverviewSectionComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/staking/CryptoStakingOverviewSectionDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/staking/CryptoStakingOverviewSectionDuxo;Landroidx/compose/runtime/Composer;II)V", "Loading", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-tab_externalDebug", "viewState", "Lcom/robinhood/android/crypto/tab/ui/staking/CryptoStakingOverviewViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoStakingOverviewSectionComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoStakingOverviewSectionComposable$lambda$1(Modifier modifier, CryptoStakingOverviewSectionDuxo cryptoStakingOverviewSectionDuxo, int i, int i2, Composer composer, int i3) {
        CryptoStakingOverviewSectionComposable(modifier, cryptoStakingOverviewSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$2(int i, Composer composer, int i2) {
        Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoStakingOverviewSectionComposable(final Modifier modifier, final CryptoStakingOverviewSectionDuxo cryptoStakingOverviewSectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        CreationExtras defaultViewModelCreationExtras;
        final ImmutableList<UIComponent<GenericAction>> components;
        Composer composerStartRestartGroup = composer.startRestartGroup(554349410);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(cryptoStakingOverviewSectionDuxo)) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoStakingOverviewSectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionComposableKt$CryptoStakingOverviewSectionComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionComposableKt$CryptoStakingOverviewSectionComposable$$inlined$duxo$1.1
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
                    cryptoStakingOverviewSectionDuxo = (CryptoStakingOverviewSectionDuxo) baseDuxo;
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(554349410, i5, -1, "com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionComposable (CryptoStakingOverviewSectionComposable.kt:29)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingOverviewSectionDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                components = CryptoStakingOverviewSectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getComponents();
                if (components != null) {
                    composerStartRestartGroup.startReplaceGroup(474303687);
                    Loading(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(474353349);
                    GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(848841168, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionComposableKt.CryptoStakingOverviewSectionComposable.1
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
                                ComposerKt.traceEventStart(848841168, i6, -1, "com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionComposable.<anonymous> (CryptoStakingOverviewSectionComposable.kt:37)");
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.STAKING_SECTION, null, null, 6, null), null, 47, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                            ImmutableList<UIComponent<GenericAction>> immutableList = components;
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(immutableList, GenericAction.class, modifierAutoLogEvents$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer2, 100663296, 0);
                            composer2.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 15);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingOverviewSectionDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                components = CryptoStakingOverviewSectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getComponents();
                if (components != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingOverviewSectionComposable3.CryptoStakingOverviewSectionComposable$lambda$1(modifier, cryptoStakingOverviewSectionDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1973935168);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1973935168, i, -1, "com.robinhood.android.crypto.tab.ui.staking.Loading (CryptoStakingOverviewSectionComposable.kt:55)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, CryptoStakingOverviewSectionComposable.INSTANCE.getLambda$960117936$feature_crypto_tab_externalDebug(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingOverviewSectionComposable3.Loading$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final CryptoStakingOverviewViewState CryptoStakingOverviewSectionComposable$lambda$0(SnapshotState4<CryptoStakingOverviewViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
