package com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trade.equity.prefs.HasShownAdtOrderTypeMenuOnboardingTooltipPref;
import com.robinhood.android.trade.equity.prefs.HasShownBuySellOrderTypeMenuOnboardingTooltipPref;
import com.robinhood.android.trade.equity.prefs.HasShownMarketBuysOnboardingTooltipPref;
import com.robinhood.android.trade.equity.prefs.HasShownTaxLotsOnboardingTooltipPref;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderTypeTooltipDuxo_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo;", "dispatcherProvider", "Ljavax/inject/Provider;", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "hasShownBuySellOrderTypeOnboardingTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownAdtOrderTypeOnboardingTooltipPref", "hasShownMarketBuysOnboardingTooltipPref", "hasShownTaxLotsOnboardingTooltipPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EquityOrderTypeTooltipDuxo_MembersInjector implements MembersInjector<EquityOrderTypeTooltipDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<BooleanPreference> hasShownAdtOrderTypeOnboardingTooltipPref;
    private final Provider<BooleanPreference> hasShownBuySellOrderTypeOnboardingTooltipPref;
    private final Provider<BooleanPreference> hasShownMarketBuysOnboardingTooltipPref;
    private final Provider<BooleanPreference> hasShownTaxLotsOnboardingTooltipPref;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<EquityOrderTypeTooltipDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3, Provider<BooleanPreference> provider4, Provider<BooleanPreference> provider5, Provider<BooleanPreference> provider6, Provider<BooleanPreference> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    @HasShownAdtOrderTypeMenuOnboardingTooltipPref
    public static final void injectHasShownAdtOrderTypeOnboardingTooltipPref(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, BooleanPreference booleanPreference) {
        INSTANCE.injectHasShownAdtOrderTypeOnboardingTooltipPref(equityOrderTypeTooltipDuxo, booleanPreference);
    }

    @JvmStatic
    @HasShownBuySellOrderTypeMenuOnboardingTooltipPref
    public static final void injectHasShownBuySellOrderTypeOnboardingTooltipPref(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, BooleanPreference booleanPreference) {
        INSTANCE.injectHasShownBuySellOrderTypeOnboardingTooltipPref(equityOrderTypeTooltipDuxo, booleanPreference);
    }

    @JvmStatic
    @HasShownMarketBuysOnboardingTooltipPref
    public static final void injectHasShownMarketBuysOnboardingTooltipPref(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, BooleanPreference booleanPreference) {
        INSTANCE.injectHasShownMarketBuysOnboardingTooltipPref(equityOrderTypeTooltipDuxo, booleanPreference);
    }

    @JvmStatic
    @HasShownTaxLotsOnboardingTooltipPref
    public static final void injectHasShownTaxLotsOnboardingTooltipPref(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, BooleanPreference booleanPreference) {
        INSTANCE.injectHasShownTaxLotsOnboardingTooltipPref(equityOrderTypeTooltipDuxo, booleanPreference);
    }

    public EquityOrderTypeTooltipDuxo_MembersInjector(Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler, Provider<BooleanPreference> hasShownBuySellOrderTypeOnboardingTooltipPref, Provider<BooleanPreference> hasShownAdtOrderTypeOnboardingTooltipPref, Provider<BooleanPreference> hasShownMarketBuysOnboardingTooltipPref, Provider<BooleanPreference> hasShownTaxLotsOnboardingTooltipPref) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        Intrinsics.checkNotNullParameter(hasShownBuySellOrderTypeOnboardingTooltipPref, "hasShownBuySellOrderTypeOnboardingTooltipPref");
        Intrinsics.checkNotNullParameter(hasShownAdtOrderTypeOnboardingTooltipPref, "hasShownAdtOrderTypeOnboardingTooltipPref");
        Intrinsics.checkNotNullParameter(hasShownMarketBuysOnboardingTooltipPref, "hasShownMarketBuysOnboardingTooltipPref");
        Intrinsics.checkNotNullParameter(hasShownTaxLotsOnboardingTooltipPref, "hasShownTaxLotsOnboardingTooltipPref");
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
        this.hasShownBuySellOrderTypeOnboardingTooltipPref = hasShownBuySellOrderTypeOnboardingTooltipPref;
        this.hasShownAdtOrderTypeOnboardingTooltipPref = hasShownAdtOrderTypeOnboardingTooltipPref;
        this.hasShownMarketBuysOnboardingTooltipPref = hasShownMarketBuysOnboardingTooltipPref;
        this.hasShownTaxLotsOnboardingTooltipPref = hasShownTaxLotsOnboardingTooltipPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EquityOrderTypeTooltipDuxo instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        OldBaseDuxo_MembersInjector.Companion companion = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion.injectDispatcherProvider(instance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion.injectRxFactory(instance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion.injectRxGlobalErrorHandler(instance, rxGlobalErrorHandler);
        Companion companion2 = INSTANCE;
        BooleanPreference booleanPreference = this.hasShownBuySellOrderTypeOnboardingTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectHasShownBuySellOrderTypeOnboardingTooltipPref(instance, booleanPreference);
        BooleanPreference booleanPreference2 = this.hasShownAdtOrderTypeOnboardingTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        companion2.injectHasShownAdtOrderTypeOnboardingTooltipPref(instance, booleanPreference2);
        BooleanPreference booleanPreference3 = this.hasShownMarketBuysOnboardingTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        companion2.injectHasShownMarketBuysOnboardingTooltipPref(instance, booleanPreference3);
        BooleanPreference booleanPreference4 = this.hasShownTaxLotsOnboardingTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference4, "get(...)");
        companion2.injectHasShownTaxLotsOnboardingTooltipPref(instance, booleanPreference4);
    }

    /* compiled from: EquityOrderTypeTooltipDuxo_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000fH\u0007J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo;", "dispatcherProvider", "Ljavax/inject/Provider;", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "hasShownBuySellOrderTypeOnboardingTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownAdtOrderTypeOnboardingTooltipPref", "hasShownMarketBuysOnboardingTooltipPref", "hasShownTaxLotsOnboardingTooltipPref", "injectHasShownBuySellOrderTypeOnboardingTooltipPref", "", "instance", "injectHasShownAdtOrderTypeOnboardingTooltipPref", "injectHasShownMarketBuysOnboardingTooltipPref", "injectHasShownTaxLotsOnboardingTooltipPref", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<EquityOrderTypeTooltipDuxo> create(Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler, Provider<BooleanPreference> hasShownBuySellOrderTypeOnboardingTooltipPref, Provider<BooleanPreference> hasShownAdtOrderTypeOnboardingTooltipPref, Provider<BooleanPreference> hasShownMarketBuysOnboardingTooltipPref, Provider<BooleanPreference> hasShownTaxLotsOnboardingTooltipPref) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            Intrinsics.checkNotNullParameter(hasShownBuySellOrderTypeOnboardingTooltipPref, "hasShownBuySellOrderTypeOnboardingTooltipPref");
            Intrinsics.checkNotNullParameter(hasShownAdtOrderTypeOnboardingTooltipPref, "hasShownAdtOrderTypeOnboardingTooltipPref");
            Intrinsics.checkNotNullParameter(hasShownMarketBuysOnboardingTooltipPref, "hasShownMarketBuysOnboardingTooltipPref");
            Intrinsics.checkNotNullParameter(hasShownTaxLotsOnboardingTooltipPref, "hasShownTaxLotsOnboardingTooltipPref");
            return new EquityOrderTypeTooltipDuxo_MembersInjector(dispatcherProvider, rxFactory, rxGlobalErrorHandler, hasShownBuySellOrderTypeOnboardingTooltipPref, hasShownAdtOrderTypeOnboardingTooltipPref, hasShownMarketBuysOnboardingTooltipPref, hasShownTaxLotsOnboardingTooltipPref);
        }

        @JvmStatic
        @HasShownBuySellOrderTypeMenuOnboardingTooltipPref
        public final void injectHasShownBuySellOrderTypeOnboardingTooltipPref(EquityOrderTypeTooltipDuxo instance, BooleanPreference hasShownBuySellOrderTypeOnboardingTooltipPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasShownBuySellOrderTypeOnboardingTooltipPref, "hasShownBuySellOrderTypeOnboardingTooltipPref");
            instance.setHasShownBuySellOrderTypeOnboardingTooltipPref(hasShownBuySellOrderTypeOnboardingTooltipPref);
        }

        @JvmStatic
        @HasShownAdtOrderTypeMenuOnboardingTooltipPref
        public final void injectHasShownAdtOrderTypeOnboardingTooltipPref(EquityOrderTypeTooltipDuxo instance, BooleanPreference hasShownAdtOrderTypeOnboardingTooltipPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasShownAdtOrderTypeOnboardingTooltipPref, "hasShownAdtOrderTypeOnboardingTooltipPref");
            instance.setHasShownAdtOrderTypeOnboardingTooltipPref(hasShownAdtOrderTypeOnboardingTooltipPref);
        }

        @JvmStatic
        @HasShownMarketBuysOnboardingTooltipPref
        public final void injectHasShownMarketBuysOnboardingTooltipPref(EquityOrderTypeTooltipDuxo instance, BooleanPreference hasShownMarketBuysOnboardingTooltipPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasShownMarketBuysOnboardingTooltipPref, "hasShownMarketBuysOnboardingTooltipPref");
            instance.setHasShownMarketBuysOnboardingTooltipPref(hasShownMarketBuysOnboardingTooltipPref);
        }

        @JvmStatic
        @HasShownTaxLotsOnboardingTooltipPref
        public final void injectHasShownTaxLotsOnboardingTooltipPref(EquityOrderTypeTooltipDuxo instance, BooleanPreference hasShownTaxLotsOnboardingTooltipPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasShownTaxLotsOnboardingTooltipPref, "hasShownTaxLotsOnboardingTooltipPref");
            instance.setHasShownTaxLotsOnboardingTooltipPref(hasShownTaxLotsOnboardingTooltipPref);
        }
    }
}
