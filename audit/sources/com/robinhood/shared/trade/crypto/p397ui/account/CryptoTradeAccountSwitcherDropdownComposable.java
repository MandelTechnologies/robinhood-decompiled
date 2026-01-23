package com.robinhood.shared.trade.crypto.p397ui.account;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
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
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheet;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.trade.crypto.p397ui.account.CryptoTradeAccountSwitcherDropdownComposable;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import rh_server_driven_ui.p531v1.IconDto;

/* compiled from: CryptoTradeAccountSwitcherDropdownComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"CryptoTradeAccountSwitcherDropdownComposable", "", "args", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDuxo;", "(Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-trade-crypto_externalDebug", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownViewState;", "showAccountSwitcherBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTradeAccountSwitcherDropdownComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTradeAccountSwitcherDropdownComposable$lambda$8(CryptoTradeAccountSwitcherDropdownArgs cryptoTradeAccountSwitcherDropdownArgs, Modifier modifier, CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTradeAccountSwitcherDropdownComposable(cryptoTradeAccountSwitcherDropdownArgs, modifier, cryptoTradeAccountSwitcherDropdownDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTradeAccountSwitcherDropdownComposable(final CryptoTradeAccountSwitcherDropdownArgs args, Modifier modifier, CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo2;
        Modifier modifier3;
        int i4;
        final CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final CryptoAccountSwitcherLocation.WithCurrencyPair location;
        AccountSwitcherData accountSwitcherData;
        final CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo4;
        final Modifier modifier4;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(386457008);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
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
                    cryptoTradeAccountSwitcherDropdownDuxo2 = cryptoTradeAccountSwitcherDropdownDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoTradeAccountSwitcherDropdownDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoTradeAccountSwitcherDropdownDuxo2 = cryptoTradeAccountSwitcherDropdownDuxo;
                }
                i3 |= i6;
            } else {
                cryptoTradeAccountSwitcherDropdownDuxo2 = cryptoTradeAccountSwitcherDropdownDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTradeAccountSwitcherDropdownDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownComposableKt$CryptoTradeAccountSwitcherDropdownComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownComposableKt$CryptoTradeAccountSwitcherDropdownComposable$$inlined$duxo$1.1
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
                        CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo5 = (CryptoTradeAccountSwitcherDropdownDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        cryptoTradeAccountSwitcherDropdownDuxo3 = cryptoTradeAccountSwitcherDropdownDuxo5;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(386457008, i4, -1, "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownComposable (CryptoTradeAccountSwitcherDropdownComposable.kt:36)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTradeAccountSwitcherDropdownDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        LocalShowPlaceholder.Loadable(CryptoTradeAccountSwitcherDropdownComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedAccount() != null, null, null, ComposableLambda3.rememberComposableLambda(516809248, true, new C401411(modifier3, snapshotState, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                        location = CryptoTradeAccountSwitcherDropdownComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLocation();
                        accountSwitcherData = CryptoTradeAccountSwitcherDropdownComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAccountSwitcherData();
                        if (CryptoTradeAccountSwitcherDropdownComposable$lambda$2(snapshotState) && accountSwitcherData != null && location != null) {
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance = composerStartRestartGroup.changedInstance(cryptoTradeAccountSwitcherDropdownDuxo3) | composerStartRestartGroup.changedInstance(location);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoTradeAccountSwitcherDropdownComposable.CryptoTradeAccountSwitcherDropdownComposable$lambda$5$lambda$4(cryptoTradeAccountSwitcherDropdownDuxo3, location, (AccountSwitcherBottomSheet5) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function1 = (Function1) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoTradeAccountSwitcherDropdownComposable.CryptoTradeAccountSwitcherDropdownComposable$lambda$7$lambda$6(snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            AccountSwitcherBottomSheet.AccountSwitcherModalBottomSheet(accountSwitcherData, function1, (Function0) objRememberedValue3, null, composerStartRestartGroup, 384, 8);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        cryptoTradeAccountSwitcherDropdownDuxo4 = cryptoTradeAccountSwitcherDropdownDuxo3;
                        modifier4 = modifier3;
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
                cryptoTradeAccountSwitcherDropdownDuxo3 = cryptoTradeAccountSwitcherDropdownDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoTradeAccountSwitcherDropdownDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                LocalShowPlaceholder.Loadable(CryptoTradeAccountSwitcherDropdownComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getSelectedAccount() != null, null, null, ComposableLambda3.rememberComposableLambda(516809248, true, new C401411(modifier3, snapshotState, snapshotState4CollectAsStateWithLifecycle2), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                location = CryptoTradeAccountSwitcherDropdownComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getLocation();
                accountSwitcherData = CryptoTradeAccountSwitcherDropdownComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getAccountSwitcherData();
                if (CryptoTradeAccountSwitcherDropdownComposable$lambda$2(snapshotState)) {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(cryptoTradeAccountSwitcherDropdownDuxo3) | composerStartRestartGroup.changedInstance(location);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoTradeAccountSwitcherDropdownComposable.CryptoTradeAccountSwitcherDropdownComposable$lambda$5$lambda$4(cryptoTradeAccountSwitcherDropdownDuxo3, location, (AccountSwitcherBottomSheet5) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        Function1 function12 = (Function1) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AccountSwitcherBottomSheet.AccountSwitcherModalBottomSheet(accountSwitcherData, function12, (Function0) objRememberedValue3, null, composerStartRestartGroup, 384, 8);
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoTradeAccountSwitcherDropdownDuxo4 = cryptoTradeAccountSwitcherDropdownDuxo3;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoTradeAccountSwitcherDropdownDuxo4 = cryptoTradeAccountSwitcherDropdownDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTradeAccountSwitcherDropdownComposable.CryptoTradeAccountSwitcherDropdownComposable$lambda$8(args, modifier4, cryptoTradeAccountSwitcherDropdownDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTradeAccountSwitcherDropdownComposable$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CryptoTradeAccountSwitcherDropdownComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownComposableKt$CryptoTradeAccountSwitcherDropdownComposable$1 */
    static final class C401411 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SnapshotState<Boolean> $showAccountSwitcherBottomSheet$delegate;
        final /* synthetic */ SnapshotState4<CryptoTradeAccountSwitcherDropdownViewState> $viewState$delegate;

        C401411(Modifier modifier, SnapshotState<Boolean> snapshotState, SnapshotState4<CryptoTradeAccountSwitcherDropdownViewState> snapshotState4) {
            this.$modifier = modifier;
            this.$showAccountSwitcherBottomSheet$delegate = snapshotState;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(SnapshotState snapshotState) {
            CryptoTradeAccountSwitcherDropdownComposable.CryptoTradeAccountSwitcherDropdownComposable$lambda$3(snapshotState, true);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0143  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) {
            BentoIcon4.Size24 size24;
            String entryTitle;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(516809248, i, -1, "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownComposable.<anonymous> (CryptoTradeAccountSwitcherDropdownComposable.kt:42)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSource2.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            final SnapshotState<Boolean> snapshotState = this.$showAccountSwitcherBottomSheet$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownComposableKt$CryptoTradeAccountSwitcherDropdownComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTradeAccountSwitcherDropdownComposable.C401411.invoke$lambda$2$lambda$1(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM4872backgroundbw27NRU$default, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Arrangement.Horizontal horizontalM5090spacedByD5KLDUw = arrangement.m5090spacedByD5KLDUw(fM21593getSmallD9Ej5fM, companion2.getCenterHorizontally());
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            SnapshotState4<CryptoTradeAccountSwitcherDropdownViewState> snapshotState4 = this.$viewState$delegate;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalM5090spacedByD5KLDUw, centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4891clickableO2vRcR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            CryptoAccountSwitcherAccount selectedAccount = CryptoTradeAccountSwitcherDropdownComposable.CryptoTradeAccountSwitcherDropdownComposable$lambda$0(snapshotState4).getSelectedAccount();
            if (selectedAccount == null) {
                size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.FINANCE_24);
            } else {
                ServerToBentoAssetMapper2 bentoAsset = SduiIcon2.toBentoAsset(IconDto.INSTANCE.fromProto(selectedAccount.getIcon()));
                if (bentoAsset == null) {
                    bentoAsset = ServerToBentoAssetMapper2.FINANCE_24;
                }
                if (bentoAsset != null) {
                    size24 = new BentoIcon4.Size24(bentoAsset);
                }
            }
            BentoIcon2.m20644BentoIconFU0evQE(size24, null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable | 48, 56);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
            CryptoAccountSwitcherAccount selectedAccount2 = CryptoTradeAccountSwitcherDropdownComposable.CryptoTradeAccountSwitcherDropdownComposable$lambda$0(snapshotState4).getSelectedAccount();
            if (selectedAccount2 == null || (entryTitle = selectedAccount2.getEntryTitle()) == null) {
                entryTitle = "----------";
            }
            BentoText2.m20747BentoText38GnDrw(entryTitle, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer, 0, 0, 8186);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size12.$stable | 48, 56);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTradeAccountSwitcherDropdownViewState CryptoTradeAccountSwitcherDropdownComposable$lambda$0(SnapshotState4<CryptoTradeAccountSwitcherDropdownViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean CryptoTradeAccountSwitcherDropdownComposable$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTradeAccountSwitcherDropdownComposable$lambda$5$lambda$4(CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo, CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, AccountSwitcherBottomSheet5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AccountSwitcherBottomSheet5.AccountSelected) {
            cryptoTradeAccountSwitcherDropdownDuxo.setSelectedAccount(((AccountSwitcherBottomSheet5.AccountSelected) it).getAccountNumber(), withCurrencyPair);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTradeAccountSwitcherDropdownComposable$lambda$7$lambda$6(SnapshotState snapshotState) {
        CryptoTradeAccountSwitcherDropdownComposable$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }
}
