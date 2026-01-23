package com.robinhood.android.crypto.p094ui;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.crypto.lib.CryptoDetailCallbacks;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoDetailWithSymbolLauncherFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0017\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020\u001bH\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/CryptoDetailWithSymbolLauncherFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "getCurrencyPairStore", "()Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "setCurrencyPairStore", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;)V", CryptoDetailWithSymbolLauncherFragment.EXTRA_CURRENCY_SYMBOL, "getCurrencySymbol", "currencySymbol$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/crypto/lib/CryptoDetailCallbacks;", "getCallbacks", "()Lcom/robinhood/android/crypto/lib/CryptoDetailCallbacks;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "isCrypto", "", "()Z", "onAttach", "context", "Landroid/content/Context;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoDetailWithSymbolLauncherFragment extends GenericComposeFragment implements RegionGated {
    private static final String EXTRA_CURRENCY_SYMBOL = "currencySymbol";
    public CurrencyPairStore currencyPairStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: currencySymbol$delegate, reason: from kotlin metadata */
    private final Lazy currencySymbol = Fragments2.argument(this, EXTRA_CURRENCY_SYMBOL);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoDetailWithSymbolLauncherFragment cryptoDetailWithSymbolLauncherFragment, int i, Composer composer, int i2) {
        cryptoDetailWithSymbolLauncherFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean getIsCrypto() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "ForexDetailWithSymbolLauncherFragment";
    }

    public final CurrencyPairStore getCurrencyPairStore() {
        CurrencyPairStore currencyPairStore = this.currencyPairStore;
        if (currencyPairStore != null) {
            return currencyPairStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currencyPairStore");
        return null;
    }

    public final void setCurrencyPairStore(CurrencyPairStore currencyPairStore) {
        Intrinsics.checkNotNullParameter(currencyPairStore, "<set-?>");
        this.currencyPairStore = currencyPairStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCurrencySymbol() {
        return (String) this.currencySymbol.getValue();
    }

    private final CryptoDetailCallbacks getCallbacks() {
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof CryptoDetailCallbacks) {
            return (CryptoDetailCallbacks) activity;
        }
        return null;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1326886642);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1326886642, i, -1, "com.robinhood.android.crypto.ui.CryptoDetailWithSymbolLauncherFragment.ComposeContent (CryptoDetailWithSymbolLauncherFragment.kt:40)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 1, composerStartRestartGroup, 3504, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.CryptoDetailWithSymbolLauncherFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoDetailWithSymbolLauncherFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        getCurrencyPairStore().refreshAll(false);
        Observable<R> map = getCurrencyPairStore().streamCurrencyPairs().map(new Function() { // from class: com.robinhood.android.crypto.ui.CryptoDetailWithSymbolLauncherFragment.onAttach.1
            @Override // io.reactivex.functions.Function
            public final Optional<UiCurrencyPair> apply(List<UiCurrencyPair> currencyPairs) {
                UiCurrencyPair uiCurrencyPair;
                T next;
                Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
                List<UiCurrencyPair> list = currencyPairs;
                CryptoDetailWithSymbolLauncherFragment cryptoDetailWithSymbolLauncherFragment = CryptoDetailWithSymbolLauncherFragment.this;
                Iterator<T> it = list.iterator();
                while (true) {
                    uiCurrencyPair = null;
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((UiCurrencyPair) next).getAssetCurrency().getApiCode(), cryptoDetailWithSymbolLauncherFragment.getCurrencySymbol())) {
                        break;
                    }
                }
                UiCurrencyPair uiCurrencyPair2 = next;
                if (uiCurrencyPair2 == null) {
                    CryptoDetailWithSymbolLauncherFragment cryptoDetailWithSymbolLauncherFragment2 = CryptoDetailWithSymbolLauncherFragment.this;
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next2 = it2.next();
                        if (Intrinsics.areEqual(((UiCurrencyPair) next2).getAssetCurrency().getCode(), cryptoDetailWithSymbolLauncherFragment2.getCurrencySymbol())) {
                            uiCurrencyPair = next2;
                            break;
                        }
                    }
                    uiCurrencyPair2 = uiCurrencyPair;
                }
                return Optional3.asOptional(uiCurrencyPair2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.CryptoDetailWithSymbolLauncherFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailWithSymbolLauncherFragment.onAttach$lambda$1(this.f$0, context, (UiCurrencyPair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$1(CryptoDetailWithSymbolLauncherFragment cryptoDetailWithSymbolLauncherFragment, Context context, UiCurrencyPair uiCurrencyPair) {
        if (cryptoDetailWithSymbolLauncherFragment.getCallbacks() != null) {
            CryptoDetailCallbacks callbacks = cryptoDetailWithSymbolLauncherFragment.getCallbacks();
            if (callbacks != null) {
                callbacks.showCryptoDetail(uiCurrencyPair.getId());
            }
        } else {
            cryptoDetailWithSymbolLauncherFragment.requireActivity().finish();
            Navigator.DefaultImpls.showFragment$default(cryptoDetailWithSymbolLauncherFragment.getNavigator(), context, new CryptoDetailFragmentKey(uiCurrencyPair.getId(), null, true, null, null, null, 58, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4052, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoDetailWithSymbolLauncherFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/CryptoDetailWithSymbolLauncherFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CryptoWithSymbol;", "<init>", "()V", "EXTRA_CURRENCY_SYMBOL", "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.CryptoWithSymbol> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.CryptoWithSymbol key) {
            Intrinsics.checkNotNullParameter(key, "key");
            CryptoDetailWithSymbolLauncherFragment cryptoDetailWithSymbolLauncherFragment = new CryptoDetailWithSymbolLauncherFragment();
            Bundle bundle = new Bundle();
            bundle.putString(CryptoDetailWithSymbolLauncherFragment.EXTRA_CURRENCY_SYMBOL, key.getSymbol());
            cryptoDetailWithSymbolLauncherFragment.setArguments(bundle);
            return cryptoDetailWithSymbolLauncherFragment;
        }
    }
}
