package com.robinhood.android.crypto.p094ui.detail.p095v2;

import android.content.Context;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import bff_crypto_trading.service.p018v1.CryptoDetailPageState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.analystratings.CryptoAnalystRatingsComposable;
import com.robinhood.android.crypto.p094ui.detail.banner.CryptoBannerComposable;
import com.robinhood.android.crypto.p094ui.detail.banner.CryptoBannerType;
import com.robinhood.android.crypto.p094ui.detail.banner.UkRiskWarningBannerComposable;
import com.robinhood.android.crypto.p094ui.detail.description.CryptoDescriptionComposable;
import com.robinhood.android.crypto.p094ui.detail.description.CryptoDescriptionDuxo;
import com.robinhood.android.crypto.p094ui.detail.disclosure.CryptoDetailDisclosureComposable;
import com.robinhood.android.crypto.p094ui.detail.newsfeed.section.CryptoNewsfeedSectionComposable;
import com.robinhood.android.crypto.p094ui.detail.p095v2.CryptoDetailComposableKt;
import com.robinhood.android.crypto.p094ui.detail.p095v2.CryptoDetailDuxo;
import com.robinhood.android.crypto.p094ui.detail.p095v2.CryptoDetailViewState;
import com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarComposable7;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionSection;
import com.robinhood.android.crypto.p094ui.detail.recurring.CryptoDetailRecurringComposable3;
import com.robinhood.android.crypto.p094ui.detail.staking.section.CryptoStakingDetailSectionComposable;
import com.robinhood.android.crypto.p094ui.detail.stats.CryptoStatsComposable;
import com.robinhood.android.crypto.p094ui.historicalchart.CryptoHistoricalChartComposable;
import com.robinhood.android.crypto.p094ui.historicalchart.compat.CryptoHistoricalChartCompatComposable;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.newsfeed.breakingnews.p198ui.BreakingNewsCardWrapper3;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarArgs;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarComposable;
import com.robinhood.shared.crypto.history.section.CryptoHistorySection3;
import com.robinhood.shared.crypto.history.section.CryptoHistorySectionDuxo;
import com.robinhood.shared.crypto.history.section.CryptoHistorySectionState;
import com.robinhood.shared.crypto.p375ui.modifiers.ModifiersKt;
import com.robinhood.shared.crypto.pending.section.CryptoPendingSection;
import com.robinhood.shared.crypto.pending.section.CryptoPendingSectionConfig;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.shared.user.contracts.auth.UserCreationFlow;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
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

/* compiled from: CryptoDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u001c\"\u0016\u0010\u001d\u001a\u00020\u00198\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001f¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, m3636d2 = {"CryptoDetailComposable", "", "arg", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo$InitArgs;", "addToList", "Lkotlin/Function1;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "removeFromList", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo;", "onNavigationIconClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo$InitArgs;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CryptoDetailComponents", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lbff_crypto_trading/service/v1/CryptoDetailPageState;", "isCryptoSduiChartsEnabled", "", "onDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "onQuoteVisibilityChanged", "onSduiChartPrice", "", "showUkRiskWarningBanner", "direction", "(Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo$InitArgs;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLcom/robinhood/compose/bento/theme/Direction;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MicrogramAppName", "getMicrogramAppName$annotations", "()V", "feature-crypto_externalDebug", "viewState", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailViewState;", "isTradeBarExpanded", "showTopBarTitle", "sduiPriceString", "isVisible", "bottomPadding", "Landroidx/compose/ui/unit/Dp;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoDetailComposableKt {
    public static final String MicrogramAppName = "app-rhc-rewards-promo";

    /* compiled from: CryptoDetailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoDetailPageState.values().length];
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_CHART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_POSITION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_MICROGRAM_PROMOTIONAL_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_CURRENCY_PAIR_DESCRIPTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_HISTORY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_DISCLOSURES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_STAKING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_PERPETUALS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_UNSPECIFIED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_STATS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_EQUITY_ANALYST_RATINGS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_EQUITY_EARNINGS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_PENDING_ORDERS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_IAC_CARD_BELOW_CHART.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_BREAKING_NEWS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_NEWSFEED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_RECURRING.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailComponents$lambda$23(ImmutableList immutableList, boolean z, CryptoDetailDuxo.InitArgs initArgs, Function1 function1, Function1 function12, Function1 function13, boolean z2, BentoTheme4 bentoTheme4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoDetailComponents(immutableList, z, initArgs, function1, function12, function13, z2, bentoTheme4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailComposable$lambda$17(CryptoDetailDuxo.InitArgs initArgs, Function1 function1, Function1 function12, Modifier modifier, CryptoDetailDuxo cryptoDetailDuxo, Function0 function0, int i, int i2, Composer composer, int i3) {
        CryptoDetailComposable(initArgs, function1, function12, modifier, cryptoDetailDuxo, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getMicrogramAppName$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState CryptoDetailComposable$lambda$0(SnapshotState4<CryptoDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoDetailComposable$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CryptoDetailComposable$lambda$15(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BentoTheme4 CryptoDetailComposable$lambda$3(SnapshotState<BentoTheme4> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoDetailComposable$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoDetailComposable(final CryptoDetailDuxo.InitArgs arg, final Function1<? super UiCurrencyPair, Unit> addToList, final Function1<? super UiCurrencyPair, Unit> removeFromList, Modifier modifier, CryptoDetailDuxo cryptoDetailDuxo, final Function0<Unit> onNavigationIconClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoDetailDuxo cryptoDetailDuxo2;
        Modifier modifier3;
        Composer composer2;
        int i4;
        CryptoDetailDuxo cryptoDetailDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Composer composer3;
        final Modifier modifier4;
        final CryptoDetailDuxo cryptoDetailDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(addToList, "addToList");
        Intrinsics.checkNotNullParameter(removeFromList, "removeFromList");
        Intrinsics.checkNotNullParameter(onNavigationIconClick, "onNavigationIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(621469586);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(arg) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(addToList) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(removeFromList) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    cryptoDetailDuxo2 = cryptoDetailDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoDetailDuxo2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    cryptoDetailDuxo2 = cryptoDetailDuxo;
                }
                i3 |= i6;
            } else {
                cryptoDetailDuxo2 = cryptoDetailDuxo;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onNavigationIconClick) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        String string2 = arg.getCurrencyPairId().toString();
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, arg)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoDetailDuxo.class), current, string2, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer2, 0);
                        composer2.endReplaceGroup();
                        i3 &= -57345;
                        cryptoDetailDuxo3 = (CryptoDetailDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = 0;
                        cryptoDetailDuxo3 = cryptoDetailDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                    cryptoDetailDuxo3 = cryptoDetailDuxo2;
                    i4 = 0;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(621469586, i3, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable (CryptoDetailComposable.kt:101)");
                }
                final Modifier modifier5 = modifier3;
                final UUID currencyPairId = arg.getCurrencyPairId();
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                Object[] objArr = {currencyPairId};
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoDetailComposableKt.CryptoDetailComposable$lambda$2$lambda$1();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer2, 3072, 6);
                Object[] objArr2 = new Object[i4];
                composer2.startReplaceGroup(1849434622);
                objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoDetailComposableKt.CryptoDetailComposable$lambda$6$lambda$5();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composer2, 3072, 6);
                Object[] objArr3 = new Object[i4];
                composer2.startReplaceGroup(1849434622);
                objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoDetailComposableKt.CryptoDetailComposable$lambda$10$lambda$9();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                Composer composer4 = composer2;
                final SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue3, composer4, 3072, 6);
                Object[] objArr4 = new Object[i4];
                composer4.startReplaceGroup(1849434622);
                objRememberedValue4 = composer4.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoDetailComposableKt.CryptoDetailComposable$lambda$14$lambda$13();
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                composer4.endReplaceGroup();
                final SnapshotState snapshotState4 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) objRememberedValue4, composer4, 3072, 6);
                GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(2012796736, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt.CryptoDetailComposable.1
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
                            ComposerKt.traceEventStart(2012796736, i7, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous> (CryptoDetailComposable.kt:110)");
                        }
                        Boolean bool = Boolean.FALSE;
                        BentoTheme4 bentoTheme4CryptoDetailComposable$lambda$3 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$3(snapshotState);
                        final Modifier modifier6 = modifier5;
                        final SnapshotState<Boolean> snapshotState5 = snapshotState2;
                        final UUID uuid = currencyPairId;
                        final Function1<UiCurrencyPair, Unit> function1 = addToList;
                        final Function1<UiCurrencyPair, Unit> function12 = removeFromList;
                        final Function0<Unit> function0 = onNavigationIconClick;
                        final SnapshotState<String> snapshotState6 = snapshotState4;
                        final SnapshotState<Boolean> snapshotState7 = snapshotState3;
                        final SnapshotState4<CryptoDetailViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                        final CryptoDetailDuxo.InitArgs initArgs = arg;
                        final SnapshotState<BentoTheme4> snapshotState8 = snapshotState;
                        BentoTheme2.BentoTheme(null, null, null, null, null, bool, null, bentoTheme4CryptoDetailComposable$lambda$3, ComposableLambda3.rememberComposableLambda(358792440, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt.CryptoDetailComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i8) {
                                if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(358792440, i8, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous>.<anonymous> (CryptoDetailComposable.kt:118)");
                                }
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, ComposableLambda3.rememberComposableLambda(877079228, true, new C497951(snapshotState5, uuid, function1, function12, function0, snapshotState6, snapshotState7), composer6, 54), ComposableLambda3.rememberComposableLambda(-1473916163, true, new AnonymousClass2(uuid, snapshotState5, snapshotState42), composer6, 54), null, null, 0, 0L, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(-1775297977, true, new AnonymousClass3(snapshotState5, snapshotState42, initArgs, snapshotState8, snapshotState7, snapshotState6), composer6, 54), composer6, 805306800, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoDetailComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C497951 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ Function1<UiCurrencyPair, Unit> $addToList;
                                final /* synthetic */ UUID $currencyPairId;
                                final /* synthetic */ SnapshotState<Boolean> $isTradeBarExpanded$delegate;
                                final /* synthetic */ Function0<Unit> $onNavigationIconClick;
                                final /* synthetic */ Function1<UiCurrencyPair, Unit> $removeFromList;
                                final /* synthetic */ SnapshotState<String> $sduiPriceString$delegate;
                                final /* synthetic */ SnapshotState<Boolean> $showTopBarTitle$delegate;

                                /* JADX WARN: Multi-variable type inference failed */
                                C497951(SnapshotState<Boolean> snapshotState, UUID uuid, Function1<? super UiCurrencyPair, Unit> function1, Function1<? super UiCurrencyPair, Unit> function12, Function0<Unit> function0, SnapshotState<String> snapshotState2, SnapshotState<Boolean> snapshotState3) {
                                    this.$isTradeBarExpanded$delegate = snapshotState;
                                    this.$currencyPairId = uuid;
                                    this.$addToList = function1;
                                    this.$removeFromList = function12;
                                    this.$onNavigationIconClick = function0;
                                    this.$sduiPriceString$delegate = snapshotState2;
                                    this.$showTopBarTitle$delegate = snapshotState3;
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
                                        ComposerKt.traceEventStart(877079228, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:121)");
                                    }
                                    String strCryptoDetailComposable$lambda$15 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$15(this.$sduiPriceString$delegate);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    boolean zCryptoDetailComposable$lambda$7 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$7(this.$isTradeBarExpanded$delegate);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$isTradeBarExpanded$delegate);
                                    final SnapshotState<Boolean> snapshotState = this.$isTradeBarExpanded$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoDetailComposableKt.C134861.AnonymousClass1.C497951.invoke$lambda$1$lambda$0(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Modifier modifierM25230scrimGUYwDQI$default = ModifiersKt.m25230scrimGUYwDQI$default(companion, zCryptoDetailComposable$lambda$7, null, (Function0) objRememberedValue, 2, null);
                                    CryptoDetailTopBarComposable7.CryptoDetailTopBarComposable(this.$currencyPairId, CryptoDetailComposableKt.CryptoDetailComposable$lambda$11(this.$showTopBarTitle$delegate), strCryptoDetailComposable$lambda$15, this.$addToList, this.$removeFromList, modifierM25230scrimGUYwDQI$default, null, this.$onNavigationIconClick, composer, 0, 64);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                                    CryptoDetailComposableKt.CryptoDetailComposable$lambda$8(snapshotState, false);
                                    return Unit.INSTANCE;
                                }
                            }

                            /* compiled from: CryptoDetailComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ UUID $currencyPairId;
                                final /* synthetic */ SnapshotState<Boolean> $isTradeBarExpanded$delegate;
                                final /* synthetic */ SnapshotState4<CryptoDetailViewState> $viewState$delegate;

                                AnonymousClass2(UUID uuid, SnapshotState<Boolean> snapshotState, SnapshotState4<CryptoDetailViewState> snapshotState4) {
                                    this.$currencyPairId = uuid;
                                    this.$isTradeBarExpanded$delegate = snapshotState;
                                    this.$viewState$delegate = snapshotState4;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
                                    Navigator.DefaultImpls.startActivity$default(navigator, context, new UserCreation(null, null, null, UserCreationFlow.RHC, null, false, 55, null), null, false, null, null, 60, null);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
                                    CryptoDetailComposableKt.CryptoDetailComposable$lambda$8(snapshotState, true);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState) {
                                    CryptoDetailComposableKt.CryptoDetailComposable$lambda$8(snapshotState, false);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1473916163, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:136)");
                                    }
                                    final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                                    final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    if (CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).getLoggedOutCtaVisible()) {
                                        composer.startReplaceGroup(-1985544601);
                                        BentoButtonBar3 bentoButtonBar3 = BentoButtonBar3.INSTANCE;
                                        Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), "BUY_ACCOUNT", null, UserInteractionEventData.Action.SIGN_UP, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 42, null), false, false, false, true, false, null, 110, null);
                                        String strStringResource = StringResources_androidKt.stringResource(C12757R.string.crypto_detail_cta_buy, composer, 0);
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(navigator, context);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        bentoButtonBar3.PrimaryButtonOnly(modifierAutoLogEvents$default, null, (Function0) objRememberedValue, strStringResource, false, null, false, composer, BentoButtonBar3.$stable << 21, 114);
                                        composer.endReplaceGroup();
                                    } else if (CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).getContentState() == CryptoDetailViewState.ContentState.CONTENT) {
                                        composer.startReplaceGroup(-1984501978);
                                        boolean zCryptoDetailComposable$lambda$7 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$7(this.$isTradeBarExpanded$delegate);
                                        CryptoButtonBarArgs.Crypto crypto2 = new CryptoButtonBarArgs.Crypto(this.$currencyPairId);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged = composer.changed(this.$isTradeBarExpanded$delegate);
                                        final SnapshotState<Boolean> snapshotState = this.$isTradeBarExpanded$delegate;
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$2$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(snapshotState);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        Function0 function0 = (Function0) objRememberedValue2;
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged2 = composer.changed(this.$isTradeBarExpanded$delegate);
                                        final SnapshotState<Boolean> snapshotState2 = this.$isTradeBarExpanded$delegate;
                                        Object objRememberedValue3 = composer.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$2$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass2.invoke$lambda$5$lambda$4(snapshotState2);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer.endReplaceGroup();
                                        CryptoButtonBarComposable.CryptoButtonBarComposable(crypto2, zCryptoDetailComposable$lambda$7, function0, (Function0) objRememberedValue3, null, null, composer, CryptoButtonBarArgs.Crypto.$stable, 48);
                                        composer.endReplaceGroup();
                                    } else {
                                        composer.startReplaceGroup(-1984133915);
                                        composer.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }

                            /* compiled from: CryptoDetailComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3, reason: invalid class name */
                            static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                final /* synthetic */ CryptoDetailDuxo.InitArgs $arg;
                                final /* synthetic */ SnapshotState<BentoTheme4> $direction$delegate;
                                final /* synthetic */ SnapshotState<Boolean> $isTradeBarExpanded$delegate;
                                final /* synthetic */ SnapshotState<String> $sduiPriceString$delegate;
                                final /* synthetic */ SnapshotState<Boolean> $showTopBarTitle$delegate;
                                final /* synthetic */ SnapshotState4<CryptoDetailViewState> $viewState$delegate;

                                AnonymousClass3(SnapshotState<Boolean> snapshotState, SnapshotState4<CryptoDetailViewState> snapshotState4, CryptoDetailDuxo.InitArgs initArgs, SnapshotState<BentoTheme4> snapshotState2, SnapshotState<Boolean> snapshotState3, SnapshotState<String> snapshotState5) {
                                    this.$isTradeBarExpanded$delegate = snapshotState;
                                    this.$viewState$delegate = snapshotState4;
                                    this.$arg = initArgs;
                                    this.$direction$delegate = snapshotState2;
                                    this.$showTopBarTitle$delegate = snapshotState3;
                                    this.$sduiPriceString$delegate = snapshotState5;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                    invoke(paddingValues, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                    int i2;
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i & 6) == 0) {
                                        i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1775297977, i2, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:166)");
                                    }
                                    Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                    boolean zCryptoDetailComposable$lambda$7 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$7(this.$isTradeBarExpanded$delegate);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$isTradeBarExpanded$delegate);
                                    final SnapshotState<Boolean> snapshotState = this.$isTradeBarExpanded$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass3.invoke$lambda$1$lambda$0(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Crossfade.Crossfade(CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).getContentState(), ModifiersKt.m25230scrimGUYwDQI$default(modifierPadding, zCryptoDetailComposable$lambda$7, null, (Function0) objRememberedValue, 2, null), (FiniteAnimationSpec<Float>) null, "cryptoDetailCrossFade", ComposableLambda3.rememberComposableLambda(1239838562, true, new AnonymousClass2(this.$arg, this.$direction$delegate, this.$showTopBarTitle$delegate, this.$sduiPriceString$delegate, this.$viewState$delegate), composer, 54), composer, 27648, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                                    CryptoDetailComposableKt.CryptoDetailComposable$lambda$8(snapshotState, false);
                                    return Unit.INSTANCE;
                                }

                                /* compiled from: CryptoDetailComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function3<CryptoDetailViewState.ContentState, Composer, Integer, Unit> {
                                    final /* synthetic */ CryptoDetailDuxo.InitArgs $arg;
                                    final /* synthetic */ SnapshotState<BentoTheme4> $direction$delegate;
                                    final /* synthetic */ SnapshotState<String> $sduiPriceString$delegate;
                                    final /* synthetic */ SnapshotState<Boolean> $showTopBarTitle$delegate;
                                    final /* synthetic */ SnapshotState4<CryptoDetailViewState> $viewState$delegate;

                                    /* compiled from: CryptoDetailComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$2$WhenMappings */
                                    public /* synthetic */ class WhenMappings {
                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                        static {
                                            int[] iArr = new int[CryptoDetailViewState.ContentState.values().length];
                                            try {
                                                iArr[CryptoDetailViewState.ContentState.LOADING.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            try {
                                                iArr[CryptoDetailViewState.ContentState.ERROR.ordinal()] = 2;
                                            } catch (NoSuchFieldError unused2) {
                                            }
                                            try {
                                                iArr[CryptoDetailViewState.ContentState.CONTENT.ordinal()] = 3;
                                            } catch (NoSuchFieldError unused3) {
                                            }
                                            $EnumSwitchMapping$0 = iArr;
                                        }
                                    }

                                    AnonymousClass2(CryptoDetailDuxo.InitArgs initArgs, SnapshotState<BentoTheme4> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<String> snapshotState3, SnapshotState4<CryptoDetailViewState> snapshotState4) {
                                        this.$arg = initArgs;
                                        this.$direction$delegate = snapshotState;
                                        this.$showTopBarTitle$delegate = snapshotState2;
                                        this.$sduiPriceString$delegate = snapshotState3;
                                        this.$viewState$delegate = snapshotState4;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(CryptoDetailViewState.ContentState contentState, Composer composer, Integer num) {
                                        invoke(contentState, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(CryptoDetailViewState.ContentState contentState, Composer composer, int i) {
                                        int i2;
                                        Intrinsics.checkNotNullParameter(contentState, "contentState");
                                        if ((i & 6) == 0) {
                                            i2 = (composer.changed(contentState.ordinal()) ? 4 : 2) | i;
                                        } else {
                                            i2 = i;
                                        }
                                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1239838562, i2, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:176)");
                                        }
                                        int i3 = WhenMappings.$EnumSwitchMapping$0[contentState.ordinal()];
                                        if (i3 == 1) {
                                            composer.startReplaceGroup(-688012686);
                                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, true, false, composer, 384, 11);
                                            composer.endReplaceGroup();
                                        } else if (i3 == 2) {
                                            composer.startReplaceGroup(-687835087);
                                            ErrorScreenComposable.ErrorScreenComposable(null, null, 0, null, null, null, null, false, composer, 0, 255);
                                            composer.endReplaceGroup();
                                        } else {
                                            if (i3 != 3) {
                                                composer.startReplaceGroup(1778919646);
                                                composer.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer.startReplaceGroup(-687659999);
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            ImmutableList<CryptoDetailPageState> components = CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).getComponents();
                                            boolean zIsCryptoSduiChartsEnabled = CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).isCryptoSduiChartsEnabled();
                                            boolean showUkRiskWarningBanner = CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).getShowUkRiskWarningBanner();
                                            BentoTheme4 bentoTheme4CryptoDetailComposable$lambda$3 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$3(this.$direction$delegate);
                                            CryptoDetailDuxo.InitArgs initArgs = this.$arg;
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged = composer.changed(this.$direction$delegate);
                                            final SnapshotState<BentoTheme4> snapshotState = this.$direction$delegate;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState, (BentoTheme4) obj);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            Function1 function1 = (Function1) objRememberedValue;
                                            composer.endReplaceGroup();
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged2 = composer.changed(this.$showTopBarTitle$delegate);
                                            final SnapshotState<Boolean> snapshotState2 = this.$showTopBarTitle$delegate;
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$2$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$3$lambda$2(snapshotState2, ((Boolean) obj).booleanValue());
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            Function1 function12 = (Function1) objRememberedValue2;
                                            composer.endReplaceGroup();
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged3 = composer.changed(this.$sduiPriceString$delegate);
                                            final SnapshotState<String> snapshotState3 = this.$sduiPriceString$delegate;
                                            Object objRememberedValue3 = composer.rememberedValue();
                                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$2$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$5$lambda$4(snapshotState3, (String) obj);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer.endReplaceGroup();
                                            CryptoDetailComposableKt.CryptoDetailComponents(components, zIsCryptoSduiChartsEnabled, initArgs, function1, function12, (Function1) objRememberedValue3, showUkRiskWarningBanner, bentoTheme4CryptoDetailComposable$lambda$3, modifierFillMaxSize$default, composer, 100663296, 0);
                                            composer.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, BentoTheme4 it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        CryptoDetailComposableKt.CryptoDetailComposable$lambda$4(snapshotState, it);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, boolean z) {
                                        CryptoDetailComposableKt.CryptoDetailComposable$lambda$12(snapshotState, z);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState, String it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        CryptoDetailComposableKt.CryptoDetailComposable$lambda$16(snapshotState, it);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }, composer5, 54), composer5, 100859904, 95);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer4, 54), composer4, 24576, 15);
                composer3 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
                cryptoDetailDuxo4 = cryptoDetailDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer3 = composerStartRestartGroup;
                cryptoDetailDuxo4 = cryptoDetailDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoDetailComposableKt.CryptoDetailComposable$lambda$17(arg, addToList, removeFromList, modifier4, cryptoDetailDuxo4, onNavigationIconClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Modifier modifier52 = modifier3;
                final UUID currencyPairId2 = arg.getCurrencyPairId();
                final SnapshotState4<CryptoDetailViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                Object[] objArr5 = {currencyPairId2};
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composer2.endReplaceGroup();
                final SnapshotState<BentoTheme4> snapshotState5 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) objRememberedValue, composer2, 3072, 6);
                Object[] objArr22 = new Object[i4];
                composer2.startReplaceGroup(1849434622);
                objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composer2.endReplaceGroup();
                final SnapshotState<Boolean> snapshotState22 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composer2, 3072, 6);
                Object[] objArr32 = new Object[i4];
                composer2.startReplaceGroup(1849434622);
                objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composer2.endReplaceGroup();
                Composer composer42 = composer2;
                final SnapshotState<Boolean> snapshotState32 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr32, (Saver) null, (String) null, (Function0) objRememberedValue3, composer42, 3072, 6);
                Object[] objArr42 = new Object[i4];
                composer42.startReplaceGroup(1849434622);
                objRememberedValue4 = composer42.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                composer42.endReplaceGroup();
                final SnapshotState<String> snapshotState42 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr42, (Saver) null, (String) null, (Function0) objRememberedValue4, composer42, 3072, 6);
                GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(2012796736, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt.CryptoDetailComposable.1
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
                            ComposerKt.traceEventStart(2012796736, i7, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous> (CryptoDetailComposable.kt:110)");
                        }
                        Boolean bool = Boolean.FALSE;
                        BentoTheme4 bentoTheme4CryptoDetailComposable$lambda$3 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$3(snapshotState5);
                        final Modifier modifier6 = modifier52;
                        final SnapshotState<Boolean> snapshotState52 = snapshotState22;
                        final UUID uuid = currencyPairId2;
                        final Function1<? super UiCurrencyPair, Unit> function1 = addToList;
                        final Function1<? super UiCurrencyPair, Unit> function12 = removeFromList;
                        final Function0<Unit> function0 = onNavigationIconClick;
                        final SnapshotState<String> snapshotState6 = snapshotState42;
                        final SnapshotState<Boolean> snapshotState7 = snapshotState32;
                        final SnapshotState4<CryptoDetailViewState> snapshotState422 = snapshotState4CollectAsStateWithLifecycle2;
                        final CryptoDetailDuxo.InitArgs initArgs = arg;
                        final SnapshotState<BentoTheme4> snapshotState8 = snapshotState5;
                        BentoTheme2.BentoTheme(null, null, null, null, null, bool, null, bentoTheme4CryptoDetailComposable$lambda$3, ComposableLambda3.rememberComposableLambda(358792440, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt.CryptoDetailComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i8) {
                                if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(358792440, i8, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous>.<anonymous> (CryptoDetailComposable.kt:118)");
                                }
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, ComposableLambda3.rememberComposableLambda(877079228, true, new C497951(snapshotState52, uuid, function1, function12, function0, snapshotState6, snapshotState7), composer6, 54), ComposableLambda3.rememberComposableLambda(-1473916163, true, new AnonymousClass2(uuid, snapshotState52, snapshotState422), composer6, 54), null, null, 0, 0L, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(-1775297977, true, new AnonymousClass3(snapshotState52, snapshotState422, initArgs, snapshotState8, snapshotState7, snapshotState6), composer6, 54), composer6, 805306800, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoDetailComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C497951 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ Function1<UiCurrencyPair, Unit> $addToList;
                                final /* synthetic */ UUID $currencyPairId;
                                final /* synthetic */ SnapshotState<Boolean> $isTradeBarExpanded$delegate;
                                final /* synthetic */ Function0<Unit> $onNavigationIconClick;
                                final /* synthetic */ Function1<UiCurrencyPair, Unit> $removeFromList;
                                final /* synthetic */ SnapshotState<String> $sduiPriceString$delegate;
                                final /* synthetic */ SnapshotState<Boolean> $showTopBarTitle$delegate;

                                /* JADX WARN: Multi-variable type inference failed */
                                C497951(SnapshotState<Boolean> snapshotState, UUID uuid, Function1<? super UiCurrencyPair, Unit> function1, Function1<? super UiCurrencyPair, Unit> function12, Function0<Unit> function0, SnapshotState<String> snapshotState2, SnapshotState<Boolean> snapshotState3) {
                                    this.$isTradeBarExpanded$delegate = snapshotState;
                                    this.$currencyPairId = uuid;
                                    this.$addToList = function1;
                                    this.$removeFromList = function12;
                                    this.$onNavigationIconClick = function0;
                                    this.$sduiPriceString$delegate = snapshotState2;
                                    this.$showTopBarTitle$delegate = snapshotState3;
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
                                        ComposerKt.traceEventStart(877079228, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:121)");
                                    }
                                    String strCryptoDetailComposable$lambda$15 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$15(this.$sduiPriceString$delegate);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    boolean zCryptoDetailComposable$lambda$7 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$7(this.$isTradeBarExpanded$delegate);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$isTradeBarExpanded$delegate);
                                    final SnapshotState snapshotState = this.$isTradeBarExpanded$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoDetailComposableKt.C134861.AnonymousClass1.C497951.invoke$lambda$1$lambda$0(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Modifier modifierM25230scrimGUYwDQI$default = ModifiersKt.m25230scrimGUYwDQI$default(companion, zCryptoDetailComposable$lambda$7, null, (Function0) objRememberedValue, 2, null);
                                    CryptoDetailTopBarComposable7.CryptoDetailTopBarComposable(this.$currencyPairId, CryptoDetailComposableKt.CryptoDetailComposable$lambda$11(this.$showTopBarTitle$delegate), strCryptoDetailComposable$lambda$15, this.$addToList, this.$removeFromList, modifierM25230scrimGUYwDQI$default, null, this.$onNavigationIconClick, composer, 0, 64);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                                    CryptoDetailComposableKt.CryptoDetailComposable$lambda$8(snapshotState, false);
                                    return Unit.INSTANCE;
                                }
                            }

                            /* compiled from: CryptoDetailComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ UUID $currencyPairId;
                                final /* synthetic */ SnapshotState<Boolean> $isTradeBarExpanded$delegate;
                                final /* synthetic */ SnapshotState4<CryptoDetailViewState> $viewState$delegate;

                                AnonymousClass2(UUID uuid, SnapshotState<Boolean> snapshotState, SnapshotState4<CryptoDetailViewState> snapshotState4) {
                                    this.$currencyPairId = uuid;
                                    this.$isTradeBarExpanded$delegate = snapshotState;
                                    this.$viewState$delegate = snapshotState4;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
                                    Navigator.DefaultImpls.startActivity$default(navigator, context, new UserCreation(null, null, null, UserCreationFlow.RHC, null, false, 55, null), null, false, null, null, 60, null);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
                                    CryptoDetailComposableKt.CryptoDetailComposable$lambda$8(snapshotState, true);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState) {
                                    CryptoDetailComposableKt.CryptoDetailComposable$lambda$8(snapshotState, false);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1473916163, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:136)");
                                    }
                                    final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                                    final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    if (CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).getLoggedOutCtaVisible()) {
                                        composer.startReplaceGroup(-1985544601);
                                        BentoButtonBar3 bentoButtonBar3 = BentoButtonBar3.INSTANCE;
                                        Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), "BUY_ACCOUNT", null, UserInteractionEventData.Action.SIGN_UP, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 42, null), false, false, false, true, false, null, 110, null);
                                        String strStringResource = StringResources_androidKt.stringResource(C12757R.string.crypto_detail_cta_buy, composer, 0);
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(navigator, context);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        bentoButtonBar3.PrimaryButtonOnly(modifierAutoLogEvents$default, null, (Function0) objRememberedValue, strStringResource, false, null, false, composer, BentoButtonBar3.$stable << 21, 114);
                                        composer.endReplaceGroup();
                                    } else if (CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).getContentState() == CryptoDetailViewState.ContentState.CONTENT) {
                                        composer.startReplaceGroup(-1984501978);
                                        boolean zCryptoDetailComposable$lambda$7 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$7(this.$isTradeBarExpanded$delegate);
                                        CryptoButtonBarArgs.Crypto crypto2 = new CryptoButtonBarArgs.Crypto(this.$currencyPairId);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged = composer.changed(this.$isTradeBarExpanded$delegate);
                                        final SnapshotState snapshotState = this.$isTradeBarExpanded$delegate;
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$2$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(snapshotState);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        Function0 function0 = (Function0) objRememberedValue2;
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged2 = composer.changed(this.$isTradeBarExpanded$delegate);
                                        final SnapshotState snapshotState2 = this.$isTradeBarExpanded$delegate;
                                        Object objRememberedValue3 = composer.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$2$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass2.invoke$lambda$5$lambda$4(snapshotState2);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer.endReplaceGroup();
                                        CryptoButtonBarComposable.CryptoButtonBarComposable(crypto2, zCryptoDetailComposable$lambda$7, function0, (Function0) objRememberedValue3, null, null, composer, CryptoButtonBarArgs.Crypto.$stable, 48);
                                        composer.endReplaceGroup();
                                    } else {
                                        composer.startReplaceGroup(-1984133915);
                                        composer.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }

                            /* compiled from: CryptoDetailComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3, reason: invalid class name */
                            static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                final /* synthetic */ CryptoDetailDuxo.InitArgs $arg;
                                final /* synthetic */ SnapshotState<BentoTheme4> $direction$delegate;
                                final /* synthetic */ SnapshotState<Boolean> $isTradeBarExpanded$delegate;
                                final /* synthetic */ SnapshotState<String> $sduiPriceString$delegate;
                                final /* synthetic */ SnapshotState<Boolean> $showTopBarTitle$delegate;
                                final /* synthetic */ SnapshotState4<CryptoDetailViewState> $viewState$delegate;

                                AnonymousClass3(SnapshotState<Boolean> snapshotState, SnapshotState4<CryptoDetailViewState> snapshotState4, CryptoDetailDuxo.InitArgs initArgs, SnapshotState<BentoTheme4> snapshotState2, SnapshotState<Boolean> snapshotState3, SnapshotState<String> snapshotState5) {
                                    this.$isTradeBarExpanded$delegate = snapshotState;
                                    this.$viewState$delegate = snapshotState4;
                                    this.$arg = initArgs;
                                    this.$direction$delegate = snapshotState2;
                                    this.$showTopBarTitle$delegate = snapshotState3;
                                    this.$sduiPriceString$delegate = snapshotState5;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                    invoke(paddingValues, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                    int i2;
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i & 6) == 0) {
                                        i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1775297977, i2, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:166)");
                                    }
                                    Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                    boolean zCryptoDetailComposable$lambda$7 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$7(this.$isTradeBarExpanded$delegate);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$isTradeBarExpanded$delegate);
                                    final SnapshotState snapshotState = this.$isTradeBarExpanded$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass3.invoke$lambda$1$lambda$0(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Crossfade.Crossfade(CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).getContentState(), ModifiersKt.m25230scrimGUYwDQI$default(modifierPadding, zCryptoDetailComposable$lambda$7, null, (Function0) objRememberedValue, 2, null), (FiniteAnimationSpec<Float>) null, "cryptoDetailCrossFade", ComposableLambda3.rememberComposableLambda(1239838562, true, new AnonymousClass2(this.$arg, this.$direction$delegate, this.$showTopBarTitle$delegate, this.$sduiPriceString$delegate, this.$viewState$delegate), composer, 54), composer, 27648, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                                    CryptoDetailComposableKt.CryptoDetailComposable$lambda$8(snapshotState, false);
                                    return Unit.INSTANCE;
                                }

                                /* compiled from: CryptoDetailComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function3<CryptoDetailViewState.ContentState, Composer, Integer, Unit> {
                                    final /* synthetic */ CryptoDetailDuxo.InitArgs $arg;
                                    final /* synthetic */ SnapshotState<BentoTheme4> $direction$delegate;
                                    final /* synthetic */ SnapshotState<String> $sduiPriceString$delegate;
                                    final /* synthetic */ SnapshotState<Boolean> $showTopBarTitle$delegate;
                                    final /* synthetic */ SnapshotState4<CryptoDetailViewState> $viewState$delegate;

                                    /* compiled from: CryptoDetailComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$2$WhenMappings */
                                    public /* synthetic */ class WhenMappings {
                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                        static {
                                            int[] iArr = new int[CryptoDetailViewState.ContentState.values().length];
                                            try {
                                                iArr[CryptoDetailViewState.ContentState.LOADING.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            try {
                                                iArr[CryptoDetailViewState.ContentState.ERROR.ordinal()] = 2;
                                            } catch (NoSuchFieldError unused2) {
                                            }
                                            try {
                                                iArr[CryptoDetailViewState.ContentState.CONTENT.ordinal()] = 3;
                                            } catch (NoSuchFieldError unused3) {
                                            }
                                            $EnumSwitchMapping$0 = iArr;
                                        }
                                    }

                                    AnonymousClass2(CryptoDetailDuxo.InitArgs initArgs, SnapshotState<BentoTheme4> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<String> snapshotState3, SnapshotState4<CryptoDetailViewState> snapshotState4) {
                                        this.$arg = initArgs;
                                        this.$direction$delegate = snapshotState;
                                        this.$showTopBarTitle$delegate = snapshotState2;
                                        this.$sduiPriceString$delegate = snapshotState3;
                                        this.$viewState$delegate = snapshotState4;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(CryptoDetailViewState.ContentState contentState, Composer composer, Integer num) {
                                        invoke(contentState, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(CryptoDetailViewState.ContentState contentState, Composer composer, int i) {
                                        int i2;
                                        Intrinsics.checkNotNullParameter(contentState, "contentState");
                                        if ((i & 6) == 0) {
                                            i2 = (composer.changed(contentState.ordinal()) ? 4 : 2) | i;
                                        } else {
                                            i2 = i;
                                        }
                                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1239838562, i2, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:176)");
                                        }
                                        int i3 = WhenMappings.$EnumSwitchMapping$0[contentState.ordinal()];
                                        if (i3 == 1) {
                                            composer.startReplaceGroup(-688012686);
                                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, true, false, composer, 384, 11);
                                            composer.endReplaceGroup();
                                        } else if (i3 == 2) {
                                            composer.startReplaceGroup(-687835087);
                                            ErrorScreenComposable.ErrorScreenComposable(null, null, 0, null, null, null, null, false, composer, 0, 255);
                                            composer.endReplaceGroup();
                                        } else {
                                            if (i3 != 3) {
                                                composer.startReplaceGroup(1778919646);
                                                composer.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer.startReplaceGroup(-687659999);
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            ImmutableList<CryptoDetailPageState> components = CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).getComponents();
                                            boolean zIsCryptoSduiChartsEnabled = CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).isCryptoSduiChartsEnabled();
                                            boolean showUkRiskWarningBanner = CryptoDetailComposableKt.CryptoDetailComposable$lambda$0(this.$viewState$delegate).getShowUkRiskWarningBanner();
                                            BentoTheme4 bentoTheme4CryptoDetailComposable$lambda$3 = CryptoDetailComposableKt.CryptoDetailComposable$lambda$3(this.$direction$delegate);
                                            CryptoDetailDuxo.InitArgs initArgs = this.$arg;
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged = composer.changed(this.$direction$delegate);
                                            final SnapshotState snapshotState = this.$direction$delegate;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState, (BentoTheme4) obj);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            Function1 function1 = (Function1) objRememberedValue;
                                            composer.endReplaceGroup();
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged2 = composer.changed(this.$showTopBarTitle$delegate);
                                            final SnapshotState snapshotState2 = this.$showTopBarTitle$delegate;
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$2$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$3$lambda$2(snapshotState2, ((Boolean) obj).booleanValue());
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            Function1 function12 = (Function1) objRememberedValue2;
                                            composer.endReplaceGroup();
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged3 = composer.changed(this.$sduiPriceString$delegate);
                                            final SnapshotState snapshotState3 = this.$sduiPriceString$delegate;
                                            Object objRememberedValue3 = composer.rememberedValue();
                                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComposable$1$1$3$2$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return CryptoDetailComposableKt.C134861.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$5$lambda$4(snapshotState3, (String) obj);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer.endReplaceGroup();
                                            CryptoDetailComposableKt.CryptoDetailComponents(components, zIsCryptoSduiChartsEnabled, initArgs, function1, function12, (Function1) objRememberedValue3, showUkRiskWarningBanner, bentoTheme4CryptoDetailComposable$lambda$3, modifierFillMaxSize$default, composer, 100663296, 0);
                                            composer.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, BentoTheme4 it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        CryptoDetailComposableKt.CryptoDetailComposable$lambda$4(snapshotState, it);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, boolean z) {
                                        CryptoDetailComposableKt.CryptoDetailComposable$lambda$12(snapshotState, z);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState, String it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        CryptoDetailComposableKt.CryptoDetailComposable$lambda$16(snapshotState, it);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }, composer5, 54), composer5, 100859904, 95);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer42, 54), composer42, 24576, 15);
                composer3 = composer42;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
                cryptoDetailDuxo4 = cryptoDetailDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoDetailComposable$lambda$2$lambda$1() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoDetailComposable$lambda$6$lambda$5() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoDetailComposable$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoDetailComposable$lambda$10$lambda$9() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoDetailComposable$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoDetailComposable$lambda$14$lambda$13() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoDetailComposable$lambda$16(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoDetailComposable$lambda$4(SnapshotState<BentoTheme4> snapshotState, BentoTheme4 bentoTheme4) {
        snapshotState.setValue(bentoTheme4);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoDetailComponents(final ImmutableList<? extends CryptoDetailPageState> components, final boolean z, final CryptoDetailDuxo.InitArgs arg, final Function1<? super BentoTheme4, Unit> onDirection, final Function1<? super Boolean, Unit> onQuoteVisibilityChanged, final Function1<? super String, Unit> onSduiChartPrice, final boolean z2, final BentoTheme4 bentoTheme4, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        Modifier modifier2;
        final Context context;
        final Density density;
        final UUID currencyPairId;
        final float fM21591getLargeD9Ej5fM;
        boolean zChangedInstance;
        Object objRememberedValue;
        int i5;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(onDirection, "onDirection");
        Intrinsics.checkNotNullParameter(onQuoteVisibilityChanged, "onQuoteVisibilityChanged");
        Intrinsics.checkNotNullParameter(onSduiChartPrice, "onSduiChartPrice");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1833365825);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(components) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(arg) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDirection) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onQuoteVisibilityChanged) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSduiChartPrice) ? 131072 : 65536;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changed(bentoTheme4 == null ? -1 : bentoTheme4.ordinal()) ? 8388608 : 4194304;
                }
                i4 = i2 & 256;
                if (i4 != 0) {
                    i3 |= 100663296;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                    }
                }
                if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1833365825, i3, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents (CryptoDetailComposable.kt:221)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    currencyPairId = arg.getCurrencyPairId();
                    LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    fM21591getLargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i3 & 7168) != 2048) | ((3670016 & i3) != 1048576) | composerStartRestartGroup.changedInstance(currencyPairId) | ((i3 & 14) != 4) | ((i3 & 112) != 32) | composerStartRestartGroup.changed(density) | ((57344 & i3) != 16384) | composerStartRestartGroup.changed(fM21591getLargeD9Ej5fM) | ((458752 & i3) != 131072) | composerStartRestartGroup.changedInstance(context) | ((i3 & 896) != 256) | ((29360128 & i3) != 8388608);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        i5 = i3;
                        final boolean z5 = z4;
                        final boolean z6 = z3;
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoDetailComposableKt.CryptoDetailComponents$lambda$22$lambda$21(z5, components, currencyPairId, z6, onDirection, onSduiChartPrice, fM21591getLargeD9Ej5fM, density, onQuoteVisibilityChanged, context, arg, bentoTheme4, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function1);
                        objRememberedValue = function1;
                    } else {
                        i5 = i3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier5 = modifier4;
                    LazyDslKt.LazyColumn(modifier5, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, (i5 >> 24) & 14, 508);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoDetailComposableKt.CryptoDetailComponents$lambda$23(components, z, arg, onDirection, onQuoteVisibilityChanged, onSduiChartPrice, z2, bentoTheme4, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            z4 = z2;
            if ((i2 & 128) != 0) {
            }
            i4 = i2 & 256;
            if (i4 != 0) {
            }
            if ((i3 & 38347923) != 38347922) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                currencyPairId = arg.getCurrencyPairId();
                LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                fM21591getLargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 7168) != 2048) | ((3670016 & i3) != 1048576) | composerStartRestartGroup.changedInstance(currencyPairId) | ((i3 & 14) != 4) | ((i3 & 112) != 32) | composerStartRestartGroup.changed(density) | ((57344 & i3) != 16384) | composerStartRestartGroup.changed(fM21591getLargeD9Ej5fM) | ((458752 & i3) != 131072) | composerStartRestartGroup.changedInstance(context) | ((i3 & 896) != 256) | ((29360128 & i3) != 8388608);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    i5 = i3;
                    final boolean z52 = z4;
                    final boolean z62 = z3;
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoDetailComposableKt.CryptoDetailComponents$lambda$22$lambda$21(z52, components, currencyPairId, z62, onDirection, onSduiChartPrice, fM21591getLargeD9Ej5fM, density, onQuoteVisibilityChanged, context, arg, bentoTheme4, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function12);
                    objRememberedValue = function12;
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier52 = modifier4;
                    LazyDslKt.LazyColumn(modifier52, lazyListStateRememberLazyListState2, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, (i5 >> 24) & 14, 508);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        z4 = z2;
        if ((i2 & 128) != 0) {
        }
        i4 = i2 & 256;
        if (i4 != 0) {
        }
        if ((i3 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier CryptoDetailComponents$visibleComponentPadding(Modifier modifier, float f) {
        return androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, f, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier CryptoDetailComponents$watchScrolledBelow(Modifier modifier, final Density density, final Function1<? super Boolean, Unit> function1) {
        return OnGloballyPositionedModifier3.onGloballyPositioned(modifier, new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailComposableKt.CryptoDetailComponents$watchScrolledBelow$lambda$19(density, function1, (LayoutCoordinates) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailComponents$watchScrolledBelow$lambda$19(Density density, Function1 function1, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        function1.invoke(Boolean.valueOf(!(layoutCoordinates.isAttached() && C2002Dp.m7994compareTo0680j_4(density.mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (LayoutCoordinates2.positionInWindow(layoutCoordinates) & 4294967295L))), C2002Dp.m7995constructorimpl((float) (-24))) >= 0)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailComponents$lambda$22$lambda$21(boolean z, final ImmutableList immutableList, UUID uuid, final boolean z2, final Function1 function1, final Function1 function12, float f, final Density density, final Function1 function13, Context context, final CryptoDetailDuxo.InitArgs initArgs, BentoTheme4 bentoTheme4, LazyListScope LazyColumn) {
        final UUID uuid2;
        final UUID uuid3 = uuid;
        final float f2 = f;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (z) {
            LazyListScope.stickyHeader$default(LazyColumn, "uk_risk_warning_banner", null, ComposableLambda3.composableLambdaInstance(-744785661, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$1
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
                        ComposerKt.traceEventStart(-744785661, i2, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:245)");
                    }
                    String string2 = uuid3.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    UkRiskWarningBannerComposable.UkRiskWarningBannerComposable(string2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
        }
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            switch (WhenMappings.$EnumSwitchMapping$0[((CryptoDetailPageState) it.next()).ordinal()]) {
                case 1:
                    uuid2 = uuid3;
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(849036825, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$1
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
                                ComposerKt.traceEventStart(849036825, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:255)");
                            }
                            if (!immutableList.contains(CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_TRADE_BANNER)) {
                                final UUID uuid4 = uuid2;
                                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-757409024, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i2) {
                                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-757409024, i2, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:257)");
                                        }
                                        InfoBannerComponent.InfoBannerComponent(null, IacInfoBannerLocation.INFO_BANNER_CRYPTO_DETAIL_PAGE_MOBILE_TOP_LEVEL, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, uuid4, null, null, null, null, null, null, null, null, composer2, 438, 0, 8168);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), composer, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    f2 = f;
                    uuid3 = uuid2;
                case 2:
                    uuid2 = uuid3;
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1225662640, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$2
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
                                ComposerKt.traceEventStart(-1225662640, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:268)");
                            }
                            CryptoBannerComposable.CryptoBannerComposable(uuid2, CryptoBannerType.TRADE, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.PaddingKt.m5139PaddingValuesa9UjIt4$default(((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 2, null), null, composer, 432, 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    f2 = f;
                    uuid3 = uuid2;
                case 3:
                    uuid2 = uuid3;
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(876165905, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$3
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
                                ComposerKt.traceEventStart(876165905, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:281)");
                            }
                            if (z2) {
                                composer.startReplaceGroup(1342284591);
                                CryptoHistoricalChartComposable.CryptoHistoricalChartComposable(uuid3, CryptoDetailComposableKt.CryptoDetailComponents$watchScrolledBelow(CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), density, function13), function1, function12, null, composer, 0, 16);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(1342735207);
                                CryptoHistoricalChartCompatComposable.CryptoHistoricalChartCompatComposable(uuid3, CryptoDetailComposableKt.CryptoDetailComponents$watchScrolledBelow(CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), density, function13), function1, null, composer, 0, 8);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    f2 = f;
                    uuid3 = uuid2;
                case 4:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1316972846, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$4
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
                                ComposerKt.traceEventStart(-1316972846, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:302)");
                            }
                            CryptoPositionSection.CryptoPositionSection(uuid3, CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), null, null, composer, 0, 12);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 5:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(784855699, true, new CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$5(uuid3, context)), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 6:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1408283052, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$6
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            CryptoDescriptionDuxo.InitArgs tokenized;
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1408283052, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:332)");
                            }
                            CryptoDetailDuxo.InitArgs initArgs2 = initArgs;
                            if (initArgs2 instanceof CryptoDetailDuxo.InitArgs.Crypto) {
                                tokenized = new CryptoDescriptionDuxo.InitArgs.Crypto(((CryptoDetailDuxo.InitArgs.Crypto) initArgs).getCurrencyPairId());
                            } else {
                                if (!(initArgs2 instanceof CryptoDetailDuxo.InitArgs.Tokenized)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tokenized = new CryptoDescriptionDuxo.InitArgs.Tokenized(((CryptoDetailDuxo.InitArgs.Tokenized) initArgs).getCurrencyPairId());
                            }
                            CryptoDescriptionComposable.CryptoDescriptionComposable(tokenized, com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ABOUT_SECTION, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 7:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(693545493, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$7
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
                                ComposerKt.traceEventStart(693545493, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:353)");
                            }
                            CryptoHistorySection3.CryptoHistorySection(new CryptoHistorySectionDuxo.Args(new CryptoHistorySectionState.Crypto(uuid3, null, 2, null), new CryptoAccountSwitcherLocation.Detail(uuid3)), com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.HISTORY_SECTION, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), true, null, composer, CryptoHistorySectionDuxo.Args.$stable | 384, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 8:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1499593258, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$8
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
                                ComposerKt.traceEventStart(-1499593258, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:371)");
                            }
                            CryptoDetailDisclosureComposable.CryptoDetailDisclosureComposable(uuid3, CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), f2), null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 9:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(602235287, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$9
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
                                ComposerKt.traceEventStart(602235287, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:381)");
                            }
                            CryptoStakingDetailSectionComposable.CryptoStakingDetailSectionComposable(uuid3, CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 10:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1590903464, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$10
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
                                ComposerKt.traceEventStart(-1590903464, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:388)");
                            }
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), 0.0f, 1, null);
                            CryptoBannerComposable.CryptoBannerComposable(uuid3, CryptoBannerType.PERPETUALS, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, androidx.compose.foundation.layout.PaddingKt.m5139PaddingValuesa9UjIt4$default(((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 2, null), null, composer, 48, 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 11:
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 12:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-789290863, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$11
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
                                ComposerKt.traceEventStart(-789290863, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:407)");
                            }
                            CryptoStatsComposable.CryptoStatsComposable(uuid3, com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.EARNINGS_SECTION, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 13:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1312537682, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$12
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
                                ComposerKt.traceEventStart(1312537682, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:421)");
                            }
                            CryptoAnalystRatingsComposable.CryptoAnalystRatingsComposable(CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), null, composer, 0, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 14:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-880601069, true, new CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$13(uuid3, context, f2)), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 15:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1221227476, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$14
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
                                ComposerKt.traceEventStart(1221227476, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:440)");
                            }
                            CryptoPendingSection.CryptoPendingSection(new CryptoPendingSectionConfig.CurrencyPairId(uuid3), CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), null, composer, CryptoPendingSectionConfig.CurrencyPairId.$stable, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 16:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-971911275, true, new CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$15(uuid3, bentoTheme4, f2)), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 17:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1129917270, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$16
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
                                ComposerKt.traceEventStart(1129917270, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:459)");
                            }
                            BreakingNewsCardWrapper3.BreakingNewsCardWrapper(uuid3, null, ApiAssetType.CRYPTO, CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), null, null, composer, 432, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 18:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1063221481, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$17
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
                                ComposerKt.traceEventStart(-1063221481, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:468)");
                            }
                            CryptoNewsfeedSectionComposable.CryptoNewsfeedSectionComposable(uuid3, CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                case 19:
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1038607064, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$18
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
                                ComposerKt.traceEventStart(1038607064, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:475)");
                            }
                            CryptoDetailRecurringComposable3.CryptoDetailRecurringComposable(uuid3, CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, f2), null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    uuid2 = uuid3;
                    f2 = f;
                    uuid3 = uuid2;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
