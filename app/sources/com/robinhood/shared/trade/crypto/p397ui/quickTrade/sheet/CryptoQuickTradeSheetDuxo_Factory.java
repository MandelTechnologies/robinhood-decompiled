package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuickTradeSheetDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BJ\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoQuickTradeSheetDuxo_Factory implements Factory<CryptoQuickTradeSheetDuxo> {
    private final Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoQuickTradeSheetStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoQuickTradeSheetDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoQuickTradeSheetStateProvider> provider2, Provider<SavedStateHandle> provider3, Provider<EnumPreference<CryptoInputMode>> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoQuickTradeSheetDuxo newInstance(DuxoBundle duxoBundle, CryptoQuickTradeSheetStateProvider cryptoQuickTradeSheetStateProvider, SavedStateHandle savedStateHandle, EnumPreference<CryptoInputMode> enumPreference) {
        return INSTANCE.newInstance(duxoBundle, cryptoQuickTradeSheetStateProvider, savedStateHandle, enumPreference);
    }

    public CryptoQuickTradeSheetDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoQuickTradeSheetStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.cryptoInputModePref = cryptoInputModePref;
    }

    @Override // javax.inject.Provider
    public CryptoQuickTradeSheetDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoQuickTradeSheetStateProvider cryptoQuickTradeSheetStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuickTradeSheetStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        EnumPreference<CryptoInputMode> enumPreference = this.cryptoInputModePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        return companion.newInstance(duxoBundle, cryptoQuickTradeSheetStateProvider, savedStateHandle, enumPreference);
    }

    /* compiled from: CryptoQuickTradeSheetDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00100\u0007H\u0007J3\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "newInstance", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoQuickTradeSheetDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoQuickTradeSheetStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
            return new CryptoQuickTradeSheetDuxo_Factory(duxoBundle, stateProvider, savedStateHandle, cryptoInputModePref);
        }

        @JvmStatic
        public final CryptoQuickTradeSheetDuxo newInstance(DuxoBundle duxoBundle, CryptoQuickTradeSheetStateProvider stateProvider, SavedStateHandle savedStateHandle, EnumPreference<CryptoInputMode> cryptoInputModePref) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
            return new CryptoQuickTradeSheetDuxo(duxoBundle, stateProvider, savedStateHandle, cryptoInputModePref);
        }
    }
}
