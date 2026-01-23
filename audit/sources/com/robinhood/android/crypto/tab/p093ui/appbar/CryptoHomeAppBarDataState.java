package com.robinhood.android.crypto.tab.p093ui.appbar;

import android.content.res.Resources;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.util.CryptoAccounts;
import com.robinhood.android.crypto.tab.util.CryptoAccounts2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.models.api.home.CryptoHomeComponentType;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.home.CryptoHomeState;
import com.robinhood.models.p320db.InboxBadge;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.android.C41827R;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeAppBarDataState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010+\u001a\u00020\u0003HÂ\u0003J\t\u0010,\u001a\u00020\u0005HÂ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b.J\u0010\u0010/\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\b0J\u0010\u00101\u001a\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\b2J\u0010\u00103\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0002\b4J\u000e\u00105\u001a\u00020\u000fHÀ\u0003¢\u0006\u0002\b6J\u000e\u00107\u001a\u00020\u000fHÀ\u0003¢\u0006\u0002\b8Ja\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u0010:\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020 HÖ\u0001J\t\u0010=\u001a\u00020$HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001cR\u0011\u0010(\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001cR\u0011\u0010)\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0011\u0010*\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001c¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarDataState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "resources", "Landroid/content/res/Resources;", "cryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "chartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "inboxBadge", "Lcom/robinhood/models/db/InboxBadge;", "cryptoHomeState", "Lcom/robinhood/models/crypto/db/home/CryptoHomeState;", "hasPrivacy", "", "hasAccountSelectorActive", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Landroid/content/res/Resources;Lcom/robinhood/models/crypto/db/CryptoAccount;Lcom/robinhood/android/models/portfolio/PerformanceChartModel;Lcom/robinhood/models/db/InboxBadge;Lcom/robinhood/models/crypto/db/home/CryptoHomeState;ZZ)V", "getCryptoAccount$feature_crypto_tab_externalDebug", "()Lcom/robinhood/models/crypto/db/CryptoAccount;", "getChartModel$feature_crypto_tab_externalDebug", "()Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "getInboxBadge$feature_crypto_tab_externalDebug", "()Lcom/robinhood/models/db/InboxBadge;", "getCryptoHomeState$feature_crypto_tab_externalDebug", "()Lcom/robinhood/models/crypto/db/home/CryptoHomeState;", "getHasPrivacy$feature_crypto_tab_externalDebug", "()Z", "getHasAccountSelectorActive$feature_crypto_tab_externalDebug", "isRhcApp", "title", "", "getTitle", "()I", "accountValue", "", "getAccountValue", "()Ljava/lang/String;", "isInboxBadgeVisible", "isInboxBadgeCritical", "isInboxVisible", "isSearchVisible", "component1", "component2", "component3", "component3$feature_crypto_tab_externalDebug", "component4", "component4$feature_crypto_tab_externalDebug", "component5", "component5$feature_crypto_tab_externalDebug", "component6", "component6$feature_crypto_tab_externalDebug", "component7", "component7$feature_crypto_tab_externalDebug", "component8", "component8$feature_crypto_tab_externalDebug", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeAppBarDataState {
    public static final int $stable = 8;
    private final AppType appType;
    private final PerformanceChartModel chartModel;
    private final CryptoAccount cryptoAccount;
    private final CryptoHomeState cryptoHomeState;
    private final boolean hasAccountSelectorActive;
    private final boolean hasPrivacy;
    private final InboxBadge inboxBadge;
    private final boolean isRhcApp;
    private final Resources resources;

    /* compiled from: CryptoHomeAppBarDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoAccounts.values().length];
            try {
                iArr[CryptoAccounts.UNRESOLVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoAccounts.NO_CRYPTO_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoAccounts.HAS_CRYPTO_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    private final Resources getResources() {
        return this.resources;
    }

    public static /* synthetic */ CryptoHomeAppBarDataState copy$default(CryptoHomeAppBarDataState cryptoHomeAppBarDataState, AppType appType, Resources resources, CryptoAccount cryptoAccount, PerformanceChartModel performanceChartModel, InboxBadge inboxBadge, CryptoHomeState cryptoHomeState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = cryptoHomeAppBarDataState.appType;
        }
        if ((i & 2) != 0) {
            resources = cryptoHomeAppBarDataState.resources;
        }
        if ((i & 4) != 0) {
            cryptoAccount = cryptoHomeAppBarDataState.cryptoAccount;
        }
        if ((i & 8) != 0) {
            performanceChartModel = cryptoHomeAppBarDataState.chartModel;
        }
        if ((i & 16) != 0) {
            inboxBadge = cryptoHomeAppBarDataState.inboxBadge;
        }
        if ((i & 32) != 0) {
            cryptoHomeState = cryptoHomeAppBarDataState.cryptoHomeState;
        }
        if ((i & 64) != 0) {
            z = cryptoHomeAppBarDataState.hasPrivacy;
        }
        if ((i & 128) != 0) {
            z2 = cryptoHomeAppBarDataState.hasAccountSelectorActive;
        }
        boolean z3 = z;
        boolean z4 = z2;
        InboxBadge inboxBadge2 = inboxBadge;
        CryptoHomeState cryptoHomeState2 = cryptoHomeState;
        return cryptoHomeAppBarDataState.copy(appType, resources, cryptoAccount, performanceChartModel, inboxBadge2, cryptoHomeState2, z3, z4);
    }

    /* renamed from: component3$feature_crypto_tab_externalDebug, reason: from getter */
    public final CryptoAccount getCryptoAccount() {
        return this.cryptoAccount;
    }

    /* renamed from: component4$feature_crypto_tab_externalDebug, reason: from getter */
    public final PerformanceChartModel getChartModel() {
        return this.chartModel;
    }

    /* renamed from: component5$feature_crypto_tab_externalDebug, reason: from getter */
    public final InboxBadge getInboxBadge() {
        return this.inboxBadge;
    }

    /* renamed from: component6$feature_crypto_tab_externalDebug, reason: from getter */
    public final CryptoHomeState getCryptoHomeState() {
        return this.cryptoHomeState;
    }

    /* renamed from: component7$feature_crypto_tab_externalDebug, reason: from getter */
    public final boolean getHasPrivacy() {
        return this.hasPrivacy;
    }

    /* renamed from: component8$feature_crypto_tab_externalDebug, reason: from getter */
    public final boolean getHasAccountSelectorActive() {
        return this.hasAccountSelectorActive;
    }

    public final CryptoHomeAppBarDataState copy(AppType appType, Resources resources, CryptoAccount cryptoAccount, PerformanceChartModel chartModel, InboxBadge inboxBadge, CryptoHomeState cryptoHomeState, boolean hasPrivacy, boolean hasAccountSelectorActive) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new CryptoHomeAppBarDataState(appType, resources, cryptoAccount, chartModel, inboxBadge, cryptoHomeState, hasPrivacy, hasAccountSelectorActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeAppBarDataState)) {
            return false;
        }
        CryptoHomeAppBarDataState cryptoHomeAppBarDataState = (CryptoHomeAppBarDataState) other;
        return this.appType == cryptoHomeAppBarDataState.appType && Intrinsics.areEqual(this.resources, cryptoHomeAppBarDataState.resources) && Intrinsics.areEqual(this.cryptoAccount, cryptoHomeAppBarDataState.cryptoAccount) && Intrinsics.areEqual(this.chartModel, cryptoHomeAppBarDataState.chartModel) && Intrinsics.areEqual(this.inboxBadge, cryptoHomeAppBarDataState.inboxBadge) && Intrinsics.areEqual(this.cryptoHomeState, cryptoHomeAppBarDataState.cryptoHomeState) && this.hasPrivacy == cryptoHomeAppBarDataState.hasPrivacy && this.hasAccountSelectorActive == cryptoHomeAppBarDataState.hasAccountSelectorActive;
    }

    public int hashCode() {
        int iHashCode = ((this.appType.hashCode() * 31) + this.resources.hashCode()) * 31;
        CryptoAccount cryptoAccount = this.cryptoAccount;
        int iHashCode2 = (iHashCode + (cryptoAccount == null ? 0 : cryptoAccount.hashCode())) * 31;
        PerformanceChartModel performanceChartModel = this.chartModel;
        int iHashCode3 = (iHashCode2 + (performanceChartModel == null ? 0 : performanceChartModel.hashCode())) * 31;
        InboxBadge inboxBadge = this.inboxBadge;
        int iHashCode4 = (iHashCode3 + (inboxBadge == null ? 0 : inboxBadge.hashCode())) * 31;
        CryptoHomeState cryptoHomeState = this.cryptoHomeState;
        return ((((iHashCode4 + (cryptoHomeState != null ? cryptoHomeState.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasPrivacy)) * 31) + Boolean.hashCode(this.hasAccountSelectorActive);
    }

    public String toString() {
        return "CryptoHomeAppBarDataState(appType=" + this.appType + ", resources=" + this.resources + ", cryptoAccount=" + this.cryptoAccount + ", chartModel=" + this.chartModel + ", inboxBadge=" + this.inboxBadge + ", cryptoHomeState=" + this.cryptoHomeState + ", hasPrivacy=" + this.hasPrivacy + ", hasAccountSelectorActive=" + this.hasAccountSelectorActive + ")";
    }

    public CryptoHomeAppBarDataState(AppType appType, Resources resources, CryptoAccount cryptoAccount, PerformanceChartModel performanceChartModel, InboxBadge inboxBadge, CryptoHomeState cryptoHomeState, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.appType = appType;
        this.resources = resources;
        this.cryptoAccount = cryptoAccount;
        this.chartModel = performanceChartModel;
        this.inboxBadge = inboxBadge;
        this.cryptoHomeState = cryptoHomeState;
        this.hasPrivacy = z;
        this.hasAccountSelectorActive = z2;
        this.isRhcApp = appType == AppType.RHC;
    }

    public /* synthetic */ CryptoHomeAppBarDataState(AppType appType, Resources resources, CryptoAccount cryptoAccount, PerformanceChartModel performanceChartModel, InboxBadge inboxBadge, CryptoHomeState cryptoHomeState, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, resources, (i & 4) != 0 ? null : cryptoAccount, (i & 8) != 0 ? null : performanceChartModel, (i & 16) != 0 ? null : inboxBadge, (i & 32) != 0 ? null : cryptoHomeState, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2);
    }

    public final CryptoAccount getCryptoAccount$feature_crypto_tab_externalDebug() {
        return this.cryptoAccount;
    }

    public final PerformanceChartModel getChartModel$feature_crypto_tab_externalDebug() {
        return this.chartModel;
    }

    public final InboxBadge getInboxBadge$feature_crypto_tab_externalDebug() {
        return this.inboxBadge;
    }

    public final CryptoHomeState getCryptoHomeState$feature_crypto_tab_externalDebug() {
        return this.cryptoHomeState;
    }

    public final boolean getHasPrivacy$feature_crypto_tab_externalDebug() {
        return this.hasPrivacy;
    }

    public final boolean getHasAccountSelectorActive$feature_crypto_tab_externalDebug() {
        return this.hasAccountSelectorActive;
    }

    public final int getTitle() {
        if (this.isRhcApp) {
            return C13013R.string.crypto_home_header_rhc;
        }
        return C13013R.string.crypto_home_header;
    }

    public final String getAccountValue() {
        CursorData defaultDisplay;
        DisplayText primary_value;
        if (this.hasPrivacy) {
            return "****";
        }
        CryptoHomeState cryptoHomeState = this.cryptoHomeState;
        List<CryptoHomeComponentType> ordering = cryptoHomeState != null ? cryptoHomeState.getOrdering() : null;
        if (ordering == null) {
            ordering = CollectionsKt.emptyList();
        }
        if (ordering.contains(CryptoHomeComponentType.NUX)) {
            NumberFormatter currencyFormat = Formats.getCurrencyFormat();
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return currencyFormat.format(ZERO);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[CryptoAccounts2.getAccountState(this.cryptoAccount).ordinal()];
        if (i == 1) {
            return this.resources.getText(C41827R.string.general_label_n_a).toString();
        }
        if (i == 2) {
            NumberFormatter currencyFormat2 = Formats.getCurrencyFormat();
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            return currencyFormat2.format(ZERO2);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        PerformanceChartModel performanceChartModel = this.chartModel;
        if (performanceChartModel == null || (defaultDisplay = performanceChartModel.getDefaultDisplay()) == null || (primary_value = defaultDisplay.getPrimary_value()) == null) {
            return null;
        }
        return primary_value.getValue();
    }

    public final boolean isInboxBadgeVisible() {
        InboxBadge inboxBadge;
        return (this.isRhcApp || (inboxBadge = this.inboxBadge) == null || !inboxBadge.getResult()) ? false : true;
    }

    public final boolean isInboxBadgeCritical() {
        InboxBadge inboxBadge = this.inboxBadge;
        return inboxBadge != null && inboxBadge.getShouldCriticalBadge();
    }

    public final boolean isInboxVisible() {
        return (this.isRhcApp || this.hasAccountSelectorActive) ? false : true;
    }

    public final boolean isSearchVisible() {
        return (this.isRhcApp || this.hasAccountSelectorActive) ? false : true;
    }
}
