package com.robinhood.android.crypto.tab.p093ui;

import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverState;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverViewState;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment;
import com.robinhood.models.api.home.CryptoHomeComponentType;
import com.robinhood.models.crypto.p314db.home.CryptoHomeDiscover;
import com.robinhood.models.crypto.p314db.home.CryptoHomeState;
import com.robinhood.models.crypto.p314db.home.CryptoTopCrypto;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.models.serverdriven.experimental.api.InstrumentListItem;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.top.CryptoHomeTopViewState;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoHomeDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\bZJ\u0010\u0010[\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b\\J\u0010\u0010]\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\b^J\u0010\u0010_\u001a\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\b`J\u0010\u0010a\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0002\bbJ\t\u0010c\u001a\u00020\u000fHÂ\u0003J\t\u0010d\u001a\u00020\u0011HÆ\u0003J\u0015\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013HÆ\u0003J\u000e\u0010f\u001a\u00020\u0011HÀ\u0003¢\u0006\u0002\bgJ\t\u0010h\u001a\u00020\u0018HÆ\u0003J\u000e\u0010i\u001a\u00020\u0011HÀ\u0003¢\u0006\u0002\bjJ\u000e\u0010k\u001a\u00020\u0011HÀ\u0003¢\u0006\u0002\blJ£\u0001\u0010m\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0011HÆ\u0001J\u0013\u0010n\u001a\u00020\u00112\b\u0010o\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010p\u001a\u00020UHÖ\u0001J\t\u0010q\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0016\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u0010\u0019\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0014\u0010\u001a\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0013\u00102\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u00106\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b8\u00109R \u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\b<\u0010=\u001a\u0004\b>\u0010,R\u001a\u0010?\u001a\u00020\u00118@X\u0081\u0004¢\u0006\f\u0012\u0004\b@\u0010=\u001a\u0004\bA\u0010*R\u001a\u0010B\u001a\u00020\u00118@X\u0081\u0004¢\u0006\f\u0012\u0004\bC\u0010=\u001a\u0004\bD\u0010*R \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150F0\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010,R\u0014\u0010H\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010*R\u0014\u0010J\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010*R\u0014\u0010K\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010*R\u0014\u0010L\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010*R\u0011\u0010R\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bS\u0010*R\u0011\u0010T\u001a\u00020U8F¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006r"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDataState;", "", "accountNumber", "", "activeInstrumentDisplayType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "cryptoHomeState", "Lcom/robinhood/models/crypto/db/home/CryptoHomeState;", "discoverState", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverState;", "topCrypto", "Lcom/robinhood/models/crypto/db/home/CryptoTopCrypto;", "homeStateError", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoStakingEnabled", "", "ctaButtons", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isSduiChartEnabled", "cryptoCatchUpExperimentVariant", "Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "isExploreExperimentEnabled", "isCryptoMibExperimentEnabled", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;Lcom/robinhood/models/crypto/db/home/CryptoHomeState;Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverState;Lcom/robinhood/models/crypto/db/home/CryptoTopCrypto;Ljava/lang/Throwable;Lcom/robinhood/shared/app/type/AppType;ZLkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;ZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getActiveInstrumentDisplayType$feature_crypto_tab_externalDebug", "()Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "getCryptoHomeState$feature_crypto_tab_externalDebug", "()Lcom/robinhood/models/crypto/db/home/CryptoHomeState;", "getDiscoverState$feature_crypto_tab_externalDebug", "()Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverState;", "getTopCrypto$feature_crypto_tab_externalDebug", "()Lcom/robinhood/models/crypto/db/home/CryptoTopCrypto;", "getHomeStateError$feature_crypto_tab_externalDebug", "()Ljava/lang/Throwable;", "getCryptoStakingEnabled", "()Z", "getCtaButtons", "()Lkotlinx/collections/immutable/ImmutableList;", "isSduiChartEnabled$feature_crypto_tab_externalDebug", "getCryptoCatchUpExperimentVariant", "()Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "isExploreExperimentEnabled$feature_crypto_tab_externalDebug", "isCryptoMibExperimentEnabled$feature_crypto_tab_externalDebug", "discoverViewState", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverViewState;", "getDiscoverViewState", "()Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverViewState;", "topViewState", "Lcom/robinhood/shared/crypto/top/CryptoHomeTopViewState;", "getTopViewState", "()Lcom/robinhood/shared/crypto/top/CryptoHomeTopViewState;", "componentTypes", "Lcom/robinhood/models/api/home/CryptoHomeComponentType;", "getComponentTypes$feature_crypto_tab_externalDebug$annotations", "()V", "getComponentTypes$feature_crypto_tab_externalDebug", "showLoading", "getShowLoading$feature_crypto_tab_externalDebug$annotations", "getShowLoading$feature_crypto_tab_externalDebug", "showErrorState", "getShowErrorState$feature_crypto_tab_externalDebug$annotations", "getShowErrorState$feature_crypto_tab_externalDebug", "instruments", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentListItem;", "getInstruments", "chipsEnabled", "getChipsEnabled", "isTradableButtonSelected", "isNonTradableButtonSelected", "listKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getListKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "showAllEnabled", "getShowAllEnabled", "showBottomDisclosure", "getShowBottomDisclosure", "chartIndex", "", "getChartIndex", "()I", "component1", "component2", "component2$feature_crypto_tab_externalDebug", "component3", "component3$feature_crypto_tab_externalDebug", "component4", "component4$feature_crypto_tab_externalDebug", "component5", "component5$feature_crypto_tab_externalDebug", "component6", "component6$feature_crypto_tab_externalDebug", "component7", "component8", "component9", "component10", "component10$feature_crypto_tab_externalDebug", "component11", "component12", "component12$feature_crypto_tab_externalDebug", "component13", "component13$feature_crypto_tab_externalDebug", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final InstrumentDisplayType activeInstrumentDisplayType;
    private final AppType appType;
    private final CryptoUsPulseExperiment.Variant cryptoCatchUpExperimentVariant;
    private final CryptoHomeState cryptoHomeState;
    private final boolean cryptoStakingEnabled;
    private final ImmutableList<Button<GenericAction>> ctaButtons;
    private final CryptoHomeDiscoverState discoverState;
    private final Throwable homeStateError;
    private final boolean isCryptoMibExperimentEnabled;
    private final boolean isExploreExperimentEnabled;
    private final boolean isSduiChartEnabled;
    private final CryptoTopCrypto topCrypto;

    /* renamed from: component7, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    public static /* synthetic */ CryptoHomeDataState copy$default(CryptoHomeDataState cryptoHomeDataState, String str, InstrumentDisplayType instrumentDisplayType, CryptoHomeState cryptoHomeState, CryptoHomeDiscoverState cryptoHomeDiscoverState, CryptoTopCrypto cryptoTopCrypto, Throwable th, AppType appType, boolean z, ImmutableList immutableList, boolean z2, CryptoUsPulseExperiment.Variant variant, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoHomeDataState.accountNumber;
        }
        return cryptoHomeDataState.copy(str, (i & 2) != 0 ? cryptoHomeDataState.activeInstrumentDisplayType : instrumentDisplayType, (i & 4) != 0 ? cryptoHomeDataState.cryptoHomeState : cryptoHomeState, (i & 8) != 0 ? cryptoHomeDataState.discoverState : cryptoHomeDiscoverState, (i & 16) != 0 ? cryptoHomeDataState.topCrypto : cryptoTopCrypto, (i & 32) != 0 ? cryptoHomeDataState.homeStateError : th, (i & 64) != 0 ? cryptoHomeDataState.appType : appType, (i & 128) != 0 ? cryptoHomeDataState.cryptoStakingEnabled : z, (i & 256) != 0 ? cryptoHomeDataState.ctaButtons : immutableList, (i & 512) != 0 ? cryptoHomeDataState.isSduiChartEnabled : z2, (i & 1024) != 0 ? cryptoHomeDataState.cryptoCatchUpExperimentVariant : variant, (i & 2048) != 0 ? cryptoHomeDataState.isExploreExperimentEnabled : z3, (i & 4096) != 0 ? cryptoHomeDataState.isCryptoMibExperimentEnabled : z4);
    }

    public static /* synthetic */ void getComponentTypes$feature_crypto_tab_externalDebug$annotations() {
    }

    public static /* synthetic */ void getShowErrorState$feature_crypto_tab_externalDebug$annotations() {
    }

    public static /* synthetic */ void getShowLoading$feature_crypto_tab_externalDebug$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10$feature_crypto_tab_externalDebug, reason: from getter */
    public final boolean getIsSduiChartEnabled() {
        return this.isSduiChartEnabled;
    }

    /* renamed from: component11, reason: from getter */
    public final CryptoUsPulseExperiment.Variant getCryptoCatchUpExperimentVariant() {
        return this.cryptoCatchUpExperimentVariant;
    }

    /* renamed from: component12$feature_crypto_tab_externalDebug, reason: from getter */
    public final boolean getIsExploreExperimentEnabled() {
        return this.isExploreExperimentEnabled;
    }

    /* renamed from: component13$feature_crypto_tab_externalDebug, reason: from getter */
    public final boolean getIsCryptoMibExperimentEnabled() {
        return this.isCryptoMibExperimentEnabled;
    }

    /* renamed from: component2$feature_crypto_tab_externalDebug, reason: from getter */
    public final InstrumentDisplayType getActiveInstrumentDisplayType() {
        return this.activeInstrumentDisplayType;
    }

    /* renamed from: component3$feature_crypto_tab_externalDebug, reason: from getter */
    public final CryptoHomeState getCryptoHomeState() {
        return this.cryptoHomeState;
    }

    /* renamed from: component4$feature_crypto_tab_externalDebug, reason: from getter */
    public final CryptoHomeDiscoverState getDiscoverState() {
        return this.discoverState;
    }

    /* renamed from: component5$feature_crypto_tab_externalDebug, reason: from getter */
    public final CryptoTopCrypto getTopCrypto() {
        return this.topCrypto;
    }

    /* renamed from: component6$feature_crypto_tab_externalDebug, reason: from getter */
    public final Throwable getHomeStateError() {
        return this.homeStateError;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getCryptoStakingEnabled() {
        return this.cryptoStakingEnabled;
    }

    public final ImmutableList<Button<GenericAction>> component9() {
        return this.ctaButtons;
    }

    public final CryptoHomeDataState copy(String accountNumber, InstrumentDisplayType activeInstrumentDisplayType, CryptoHomeState cryptoHomeState, CryptoHomeDiscoverState discoverState, CryptoTopCrypto topCrypto, Throwable homeStateError, AppType appType, boolean cryptoStakingEnabled, ImmutableList<? extends Button<? extends GenericAction>> ctaButtons, boolean isSduiChartEnabled, CryptoUsPulseExperiment.Variant cryptoCatchUpExperimentVariant, boolean isExploreExperimentEnabled, boolean isCryptoMibExperimentEnabled) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(ctaButtons, "ctaButtons");
        Intrinsics.checkNotNullParameter(cryptoCatchUpExperimentVariant, "cryptoCatchUpExperimentVariant");
        return new CryptoHomeDataState(accountNumber, activeInstrumentDisplayType, cryptoHomeState, discoverState, topCrypto, homeStateError, appType, cryptoStakingEnabled, ctaButtons, isSduiChartEnabled, cryptoCatchUpExperimentVariant, isExploreExperimentEnabled, isCryptoMibExperimentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeDataState)) {
            return false;
        }
        CryptoHomeDataState cryptoHomeDataState = (CryptoHomeDataState) other;
        return Intrinsics.areEqual(this.accountNumber, cryptoHomeDataState.accountNumber) && this.activeInstrumentDisplayType == cryptoHomeDataState.activeInstrumentDisplayType && Intrinsics.areEqual(this.cryptoHomeState, cryptoHomeDataState.cryptoHomeState) && Intrinsics.areEqual(this.discoverState, cryptoHomeDataState.discoverState) && Intrinsics.areEqual(this.topCrypto, cryptoHomeDataState.topCrypto) && Intrinsics.areEqual(this.homeStateError, cryptoHomeDataState.homeStateError) && this.appType == cryptoHomeDataState.appType && this.cryptoStakingEnabled == cryptoHomeDataState.cryptoStakingEnabled && Intrinsics.areEqual(this.ctaButtons, cryptoHomeDataState.ctaButtons) && this.isSduiChartEnabled == cryptoHomeDataState.isSduiChartEnabled && this.cryptoCatchUpExperimentVariant == cryptoHomeDataState.cryptoCatchUpExperimentVariant && this.isExploreExperimentEnabled == cryptoHomeDataState.isExploreExperimentEnabled && this.isCryptoMibExperimentEnabled == cryptoHomeDataState.isCryptoMibExperimentEnabled;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InstrumentDisplayType instrumentDisplayType = this.activeInstrumentDisplayType;
        int iHashCode2 = (iHashCode + (instrumentDisplayType == null ? 0 : instrumentDisplayType.hashCode())) * 31;
        CryptoHomeState cryptoHomeState = this.cryptoHomeState;
        int iHashCode3 = (iHashCode2 + (cryptoHomeState == null ? 0 : cryptoHomeState.hashCode())) * 31;
        CryptoHomeDiscoverState cryptoHomeDiscoverState = this.discoverState;
        int iHashCode4 = (iHashCode3 + (cryptoHomeDiscoverState == null ? 0 : cryptoHomeDiscoverState.hashCode())) * 31;
        CryptoTopCrypto cryptoTopCrypto = this.topCrypto;
        int iHashCode5 = (iHashCode4 + (cryptoTopCrypto == null ? 0 : cryptoTopCrypto.hashCode())) * 31;
        Throwable th = this.homeStateError;
        return ((((((((((((((iHashCode5 + (th != null ? th.hashCode() : 0)) * 31) + this.appType.hashCode()) * 31) + Boolean.hashCode(this.cryptoStakingEnabled)) * 31) + this.ctaButtons.hashCode()) * 31) + Boolean.hashCode(this.isSduiChartEnabled)) * 31) + this.cryptoCatchUpExperimentVariant.hashCode()) * 31) + Boolean.hashCode(this.isExploreExperimentEnabled)) * 31) + Boolean.hashCode(this.isCryptoMibExperimentEnabled);
    }

    public String toString() {
        return "CryptoHomeDataState(accountNumber=" + this.accountNumber + ", activeInstrumentDisplayType=" + this.activeInstrumentDisplayType + ", cryptoHomeState=" + this.cryptoHomeState + ", discoverState=" + this.discoverState + ", topCrypto=" + this.topCrypto + ", homeStateError=" + this.homeStateError + ", appType=" + this.appType + ", cryptoStakingEnabled=" + this.cryptoStakingEnabled + ", ctaButtons=" + this.ctaButtons + ", isSduiChartEnabled=" + this.isSduiChartEnabled + ", cryptoCatchUpExperimentVariant=" + this.cryptoCatchUpExperimentVariant + ", isExploreExperimentEnabled=" + this.isExploreExperimentEnabled + ", isCryptoMibExperimentEnabled=" + this.isCryptoMibExperimentEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeDataState(String str, InstrumentDisplayType instrumentDisplayType, CryptoHomeState cryptoHomeState, CryptoHomeDiscoverState cryptoHomeDiscoverState, CryptoTopCrypto cryptoTopCrypto, Throwable th, AppType appType, boolean z, ImmutableList<? extends Button<? extends GenericAction>> ctaButtons, boolean z2, CryptoUsPulseExperiment.Variant cryptoCatchUpExperimentVariant, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(ctaButtons, "ctaButtons");
        Intrinsics.checkNotNullParameter(cryptoCatchUpExperimentVariant, "cryptoCatchUpExperimentVariant");
        this.accountNumber = str;
        this.activeInstrumentDisplayType = instrumentDisplayType;
        this.cryptoHomeState = cryptoHomeState;
        this.discoverState = cryptoHomeDiscoverState;
        this.topCrypto = cryptoTopCrypto;
        this.homeStateError = th;
        this.appType = appType;
        this.cryptoStakingEnabled = z;
        this.ctaButtons = ctaButtons;
        this.isSduiChartEnabled = z2;
        this.cryptoCatchUpExperimentVariant = cryptoCatchUpExperimentVariant;
        this.isExploreExperimentEnabled = z3;
        this.isCryptoMibExperimentEnabled = z4;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final InstrumentDisplayType getActiveInstrumentDisplayType$feature_crypto_tab_externalDebug() {
        return this.activeInstrumentDisplayType;
    }

    public final CryptoHomeState getCryptoHomeState$feature_crypto_tab_externalDebug() {
        return this.cryptoHomeState;
    }

    public final CryptoHomeDiscoverState getDiscoverState$feature_crypto_tab_externalDebug() {
        return this.discoverState;
    }

    public final CryptoTopCrypto getTopCrypto$feature_crypto_tab_externalDebug() {
        return this.topCrypto;
    }

    public final Throwable getHomeStateError$feature_crypto_tab_externalDebug() {
        return this.homeStateError;
    }

    public final boolean getCryptoStakingEnabled() {
        return this.cryptoStakingEnabled;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CryptoHomeDataState(java.lang.String r17, com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType r18, com.robinhood.models.crypto.p314db.home.CryptoHomeState r19, com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverState r20, com.robinhood.models.crypto.p314db.home.CryptoTopCrypto r21, java.lang.Throwable r22, com.robinhood.shared.app.type.AppType r23, boolean r24, kotlinx.collections.immutable.ImmutableList r25, boolean r26, com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment.Variant r27, boolean r28, boolean r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 32
            if (r1 == 0) goto L9
            r1 = 0
            r8 = r1
            goto Lb
        L9:
            r8 = r22
        Lb:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L12
            r10 = r2
            goto L14
        L12:
            r10 = r24
        L14:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L1e
            kotlinx.collections.immutable.PersistentList r1 = kotlinx.collections.immutable.extensions2.persistentListOf()
            r11 = r1
            goto L20
        L1e:
            r11 = r25
        L20:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L26
            r12 = r2
            goto L28
        L26:
            r12 = r26
        L28:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L30
            com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment$Variant r1 = com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment.Variant.CONTROL
            r13 = r1
            goto L32
        L30:
            r13 = r27
        L32:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L38
            r14 = r2
            goto L3a
        L38:
            r14 = r28
        L3a:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L4e
            r15 = r2
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r9 = r23
            r2 = r16
            goto L5e
        L4e:
            r15 = r29
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r9 = r23
        L5e:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.crypto.tab.p093ui.CryptoHomeDataState.<init>(java.lang.String, com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType, com.robinhood.models.crypto.db.home.CryptoHomeState, com.robinhood.android.crypto.tab.ui.discover.CryptoHomeDiscoverState, com.robinhood.models.crypto.db.home.CryptoTopCrypto, java.lang.Throwable, com.robinhood.shared.app.type.AppType, boolean, kotlinx.collections.immutable.ImmutableList, boolean, com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment$Variant, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ImmutableList<Button<GenericAction>> getCtaButtons() {
        return this.ctaButtons;
    }

    public final boolean isSduiChartEnabled$feature_crypto_tab_externalDebug() {
        return this.isSduiChartEnabled;
    }

    public final CryptoUsPulseExperiment.Variant getCryptoCatchUpExperimentVariant() {
        return this.cryptoCatchUpExperimentVariant;
    }

    public final boolean isExploreExperimentEnabled$feature_crypto_tab_externalDebug() {
        return this.isExploreExperimentEnabled;
    }

    public final boolean isCryptoMibExperimentEnabled$feature_crypto_tab_externalDebug() {
        return this.isCryptoMibExperimentEnabled;
    }

    public final CryptoHomeDiscoverViewState getDiscoverViewState() {
        List<CryptoHomeComponentType> ordering;
        CryptoHomeState cryptoHomeState = this.cryptoHomeState;
        if (cryptoHomeState == null || (ordering = cryptoHomeState.getOrdering()) == null || !ordering.contains(CryptoHomeComponentType.DISCOVER_COINS) || this.isExploreExperimentEnabled || this.discoverState == null) {
            return null;
        }
        InstrumentDisplayType instrumentDisplayTypeM1900x78ad5f4f = this.activeInstrumentDisplayType;
        if (instrumentDisplayTypeM1900x78ad5f4f == null) {
            instrumentDisplayTypeM1900x78ad5f4f = CryptoHomeDuxo.INSTANCE.m1900x78ad5f4f();
        }
        return new CryptoHomeDiscoverViewState(instrumentDisplayTypeM1900x78ad5f4f, getChipsEnabled(), getInstruments(), isNonTradableButtonSelected(), isTradableButtonSelected(), getListKey(), getShowAllEnabled(), !this.discoverState.getData().containsKey(Boolean.valueOf(isTradableButtonSelected())));
    }

    public final CryptoHomeTopViewState getTopViewState() {
        List<CryptoHomeComponentType> ordering;
        CryptoTopCrypto cryptoTopCrypto;
        ImmutableList<InstrumentListItem<GenericAction>> results;
        CryptoHomeState cryptoHomeState = this.cryptoHomeState;
        if (cryptoHomeState == null || (ordering = cryptoHomeState.getOrdering()) == null || !ordering.contains(CryptoHomeComponentType.TOP_CRYPTOS) || (cryptoTopCrypto = this.topCrypto) == null || (results = cryptoTopCrypto.getResults()) == null || !(!results.isEmpty())) {
            return null;
        }
        CryptoTopCrypto cryptoTopCrypto2 = this.topCrypto;
        InstrumentDisplayType instrumentDisplayTypeM1900x78ad5f4f = this.activeInstrumentDisplayType;
        if (instrumentDisplayTypeM1900x78ad5f4f == null) {
            instrumentDisplayTypeM1900x78ad5f4f = CryptoHomeDuxo.INSTANCE.m1900x78ad5f4f();
        }
        return new CryptoHomeTopViewState(cryptoTopCrypto2, instrumentDisplayTypeM1900x78ad5f4f);
    }

    public final ImmutableList<CryptoHomeComponentType> getComponentTypes$feature_crypto_tab_externalDebug() {
        List<CryptoHomeComponentType> ordering;
        CryptoHomeState cryptoHomeState = this.cryptoHomeState;
        ImmutableList<CryptoHomeComponentType> immutableList = (cryptoHomeState == null || (ordering = cryptoHomeState.getOrdering()) == null) ? null : extensions2.toImmutableList(ordering);
        if (immutableList != null && immutableList.isEmpty()) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("CryptoHomeState ordering is somehow empty"), false, null, 4, null);
        }
        return immutableList == null ? extensions2.persistentListOf() : immutableList;
    }

    public final boolean getShowLoading$feature_crypto_tab_externalDebug() {
        return this.cryptoHomeState == null && !getShowErrorState$feature_crypto_tab_externalDebug();
    }

    public final boolean getShowErrorState$feature_crypto_tab_externalDebug() {
        CryptoHomeState cryptoHomeState = this.cryptoHomeState;
        List<CryptoHomeComponentType> ordering = cryptoHomeState != null ? cryptoHomeState.getOrdering() : null;
        boolean z = this.appType == AppType.RHC && this.homeStateError != null && (ordering == null || ordering.isEmpty());
        if (z) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException(StringsKt.trimIndent("\n                                Showing error state on the CHT.\n                                homeStateError: " + this.homeStateError + ", \n                                componentTypes: " + getComponentTypes$feature_crypto_tab_externalDebug() + ",\n                            ")), false, null, 4, null);
        }
        return z;
    }

    private final ImmutableList<InstrumentListItem<GenericAction>> getInstruments() {
        CryptoHomeDiscover currentData;
        ImmutableList<InstrumentListItem<GenericAction>> results;
        CryptoHomeDiscoverState cryptoHomeDiscoverState = this.discoverState;
        return (cryptoHomeDiscoverState == null || (currentData = cryptoHomeDiscoverState.getCurrentData()) == null || (results = currentData.getResults()) == null) ? extensions2.persistentListOf() : results;
    }

    private final boolean getChipsEnabled() {
        return this.discoverState != null;
    }

    private final boolean isTradableButtonSelected() {
        CryptoHomeDiscoverState cryptoHomeDiscoverState = this.discoverState;
        return cryptoHomeDiscoverState != null && cryptoHomeDiscoverState.isCurrentlySelectedTradeable();
    }

    private final boolean isNonTradableButtonSelected() {
        CryptoHomeDiscoverState cryptoHomeDiscoverState = this.discoverState;
        return (cryptoHomeDiscoverState == null || cryptoHomeDiscoverState.isCurrentlySelectedTradeable()) ? false : true;
    }

    private final FragmentKey getListKey() {
        CryptoHomeDiscoverState cryptoHomeDiscoverState = this.discoverState;
        if (cryptoHomeDiscoverState != null && cryptoHomeDiscoverState.isCurrentlySelectedTradeable()) {
            return CuratedListKey.INSTANCE.getCryptoListKey();
        }
        return CuratedListKey.INSTANCE.getCryptoNonTradableListKey();
    }

    private final boolean getShowAllEnabled() {
        CryptoHomeDiscover currentData;
        ImmutableList<InstrumentListItem<GenericAction>> results;
        CryptoHomeDiscoverState cryptoHomeDiscoverState = this.discoverState;
        return (cryptoHomeDiscoverState == null || (currentData = cryptoHomeDiscoverState.getCurrentData()) == null || (results = currentData.getResults()) == null || !(results.isEmpty() ^ true)) ? false : true;
    }

    public final boolean getShowBottomDisclosure() {
        CryptoHomeState cryptoHomeState;
        List<CryptoHomeComponentType> ordering;
        return this.appType == AppType.RHC && (cryptoHomeState = this.cryptoHomeState) != null && (ordering = cryptoHomeState.getOrdering()) != null && (ordering.isEmpty() ^ true);
    }

    public final int getChartIndex() {
        List<CryptoHomeComponentType> ordering;
        CryptoHomeState cryptoHomeState = this.cryptoHomeState;
        if (cryptoHomeState == null || (ordering = cryptoHomeState.getOrdering()) == null) {
            return 0;
        }
        return ordering.indexOf(CryptoHomeComponentType.CHART);
    }
}
