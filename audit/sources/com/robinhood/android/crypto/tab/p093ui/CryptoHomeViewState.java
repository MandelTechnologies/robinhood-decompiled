package com.robinhood.android.crypto.tab.p093ui;

import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverViewState;
import com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment;
import com.robinhood.models.api.home.CryptoHomeComponentType;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.shared.crypto.top.CryptoHomeTopViewState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoHomeViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001GB\u008f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0005\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\u0015\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0005HÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\u0015HÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\t\u0010A\u001a\u00020\u0019HÆ\u0003J\u00ad\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00052\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001J\u0013\u0010C\u001a\u00020\f2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0015HÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010%R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0016\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010%R\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010%R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b3\u0010%¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/CryptoHomeViewState;", "", "accountNumber", "", "componentTypes", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/home/CryptoHomeComponentType;", "discoverViewState", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverViewState;", "topCryptosViewState", "Lcom/robinhood/shared/crypto/top/CryptoHomeTopViewState;", "showBottomDisclosure", "", "showErrorState", "showLoading", "cryptoStakingEnabled", "ctaButtons", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isSduiChartEnabled", "chartIndex", "", "isExploreExperimentEnabled", "isCryptoMibExperimentEnabled", "cryptoCatchUpExperimentVariant", "Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverViewState;Lcom/robinhood/shared/crypto/top/CryptoHomeTopViewState;ZZZZLkotlinx/collections/immutable/ImmutableList;ZIZZLcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;)V", "getAccountNumber", "()Ljava/lang/String;", "getComponentTypes", "()Lkotlinx/collections/immutable/ImmutableList;", "getDiscoverViewState", "()Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverViewState;", "getTopCryptosViewState", "()Lcom/robinhood/shared/crypto/top/CryptoHomeTopViewState;", "getShowBottomDisclosure", "()Z", "getShowErrorState", "getShowLoading", "getCryptoStakingEnabled", "getCtaButtons", "getChartIndex", "()I", "getCryptoCatchUpExperimentVariant", "()Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "contentState", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeViewState$ContentState;", "getContentState", "()Lcom/robinhood/android/crypto/tab/ui/CryptoHomeViewState$ContentState;", "hideBuyingPowerDivider", "getHideBuyingPowerDivider", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "ContentState", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final int chartIndex;
    private final ImmutableList<CryptoHomeComponentType> componentTypes;
    private final CryptoUsPulseExperiment.Variant cryptoCatchUpExperimentVariant;
    private final boolean cryptoStakingEnabled;
    private final ImmutableList<Button<GenericAction>> ctaButtons;
    private final CryptoHomeDiscoverViewState discoverViewState;
    private final boolean isCryptoMibExperimentEnabled;
    private final boolean isExploreExperimentEnabled;
    private final boolean isSduiChartEnabled;
    private final boolean showBottomDisclosure;
    private final boolean showErrorState;
    private final boolean showLoading;
    private final CryptoHomeTopViewState topCryptosViewState;

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsSduiChartEnabled() {
        return this.isSduiChartEnabled;
    }

    /* renamed from: component11, reason: from getter */
    public final int getChartIndex() {
        return this.chartIndex;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsExploreExperimentEnabled() {
        return this.isExploreExperimentEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsCryptoMibExperimentEnabled() {
        return this.isCryptoMibExperimentEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final CryptoUsPulseExperiment.Variant getCryptoCatchUpExperimentVariant() {
        return this.cryptoCatchUpExperimentVariant;
    }

    public final ImmutableList<CryptoHomeComponentType> component2() {
        return this.componentTypes;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoHomeDiscoverViewState getDiscoverViewState() {
        return this.discoverViewState;
    }

    /* renamed from: component4, reason: from getter */
    public final CryptoHomeTopViewState getTopCryptosViewState() {
        return this.topCryptosViewState;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowBottomDisclosure() {
        return this.showBottomDisclosure;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowErrorState() {
        return this.showErrorState;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getCryptoStakingEnabled() {
        return this.cryptoStakingEnabled;
    }

    public final ImmutableList<Button<GenericAction>> component9() {
        return this.ctaButtons;
    }

    public final CryptoHomeViewState copy(String accountNumber, ImmutableList<? extends CryptoHomeComponentType> componentTypes, CryptoHomeDiscoverViewState discoverViewState, CryptoHomeTopViewState topCryptosViewState, boolean showBottomDisclosure, boolean showErrorState, boolean showLoading, boolean cryptoStakingEnabled, ImmutableList<? extends Button<? extends GenericAction>> ctaButtons, boolean isSduiChartEnabled, int chartIndex, boolean isExploreExperimentEnabled, boolean isCryptoMibExperimentEnabled, CryptoUsPulseExperiment.Variant cryptoCatchUpExperimentVariant) {
        Intrinsics.checkNotNullParameter(componentTypes, "componentTypes");
        Intrinsics.checkNotNullParameter(ctaButtons, "ctaButtons");
        Intrinsics.checkNotNullParameter(cryptoCatchUpExperimentVariant, "cryptoCatchUpExperimentVariant");
        return new CryptoHomeViewState(accountNumber, componentTypes, discoverViewState, topCryptosViewState, showBottomDisclosure, showErrorState, showLoading, cryptoStakingEnabled, ctaButtons, isSduiChartEnabled, chartIndex, isExploreExperimentEnabled, isCryptoMibExperimentEnabled, cryptoCatchUpExperimentVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeViewState)) {
            return false;
        }
        CryptoHomeViewState cryptoHomeViewState = (CryptoHomeViewState) other;
        return Intrinsics.areEqual(this.accountNumber, cryptoHomeViewState.accountNumber) && Intrinsics.areEqual(this.componentTypes, cryptoHomeViewState.componentTypes) && Intrinsics.areEqual(this.discoverViewState, cryptoHomeViewState.discoverViewState) && Intrinsics.areEqual(this.topCryptosViewState, cryptoHomeViewState.topCryptosViewState) && this.showBottomDisclosure == cryptoHomeViewState.showBottomDisclosure && this.showErrorState == cryptoHomeViewState.showErrorState && this.showLoading == cryptoHomeViewState.showLoading && this.cryptoStakingEnabled == cryptoHomeViewState.cryptoStakingEnabled && Intrinsics.areEqual(this.ctaButtons, cryptoHomeViewState.ctaButtons) && this.isSduiChartEnabled == cryptoHomeViewState.isSduiChartEnabled && this.chartIndex == cryptoHomeViewState.chartIndex && this.isExploreExperimentEnabled == cryptoHomeViewState.isExploreExperimentEnabled && this.isCryptoMibExperimentEnabled == cryptoHomeViewState.isCryptoMibExperimentEnabled && this.cryptoCatchUpExperimentVariant == cryptoHomeViewState.cryptoCatchUpExperimentVariant;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.componentTypes.hashCode()) * 31;
        CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState = this.discoverViewState;
        int iHashCode2 = (iHashCode + (cryptoHomeDiscoverViewState == null ? 0 : cryptoHomeDiscoverViewState.hashCode())) * 31;
        CryptoHomeTopViewState cryptoHomeTopViewState = this.topCryptosViewState;
        return ((((((((((((((((((((iHashCode2 + (cryptoHomeTopViewState != null ? cryptoHomeTopViewState.hashCode() : 0)) * 31) + Boolean.hashCode(this.showBottomDisclosure)) * 31) + Boolean.hashCode(this.showErrorState)) * 31) + Boolean.hashCode(this.showLoading)) * 31) + Boolean.hashCode(this.cryptoStakingEnabled)) * 31) + this.ctaButtons.hashCode()) * 31) + Boolean.hashCode(this.isSduiChartEnabled)) * 31) + Integer.hashCode(this.chartIndex)) * 31) + Boolean.hashCode(this.isExploreExperimentEnabled)) * 31) + Boolean.hashCode(this.isCryptoMibExperimentEnabled)) * 31) + this.cryptoCatchUpExperimentVariant.hashCode();
    }

    public String toString() {
        return "CryptoHomeViewState(accountNumber=" + this.accountNumber + ", componentTypes=" + this.componentTypes + ", discoverViewState=" + this.discoverViewState + ", topCryptosViewState=" + this.topCryptosViewState + ", showBottomDisclosure=" + this.showBottomDisclosure + ", showErrorState=" + this.showErrorState + ", showLoading=" + this.showLoading + ", cryptoStakingEnabled=" + this.cryptoStakingEnabled + ", ctaButtons=" + this.ctaButtons + ", isSduiChartEnabled=" + this.isSduiChartEnabled + ", chartIndex=" + this.chartIndex + ", isExploreExperimentEnabled=" + this.isExploreExperimentEnabled + ", isCryptoMibExperimentEnabled=" + this.isCryptoMibExperimentEnabled + ", cryptoCatchUpExperimentVariant=" + this.cryptoCatchUpExperimentVariant + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeViewState(String str, ImmutableList<? extends CryptoHomeComponentType> componentTypes, CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState, CryptoHomeTopViewState cryptoHomeTopViewState, boolean z, boolean z2, boolean z3, boolean z4, ImmutableList<? extends Button<? extends GenericAction>> ctaButtons, boolean z5, int i, boolean z6, boolean z7, CryptoUsPulseExperiment.Variant cryptoCatchUpExperimentVariant) {
        Intrinsics.checkNotNullParameter(componentTypes, "componentTypes");
        Intrinsics.checkNotNullParameter(ctaButtons, "ctaButtons");
        Intrinsics.checkNotNullParameter(cryptoCatchUpExperimentVariant, "cryptoCatchUpExperimentVariant");
        this.accountNumber = str;
        this.componentTypes = componentTypes;
        this.discoverViewState = cryptoHomeDiscoverViewState;
        this.topCryptosViewState = cryptoHomeTopViewState;
        this.showBottomDisclosure = z;
        this.showErrorState = z2;
        this.showLoading = z3;
        this.cryptoStakingEnabled = z4;
        this.ctaButtons = ctaButtons;
        this.isSduiChartEnabled = z5;
        this.chartIndex = i;
        this.isExploreExperimentEnabled = z6;
        this.isCryptoMibExperimentEnabled = z7;
        this.cryptoCatchUpExperimentVariant = cryptoCatchUpExperimentVariant;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ImmutableList<CryptoHomeComponentType> getComponentTypes() {
        return this.componentTypes;
    }

    public final CryptoHomeDiscoverViewState getDiscoverViewState() {
        return this.discoverViewState;
    }

    public final CryptoHomeTopViewState getTopCryptosViewState() {
        return this.topCryptosViewState;
    }

    public final boolean getShowBottomDisclosure() {
        return this.showBottomDisclosure;
    }

    public final boolean getShowErrorState() {
        return this.showErrorState;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getCryptoStakingEnabled() {
        return this.cryptoStakingEnabled;
    }

    public final ImmutableList<Button<GenericAction>> getCtaButtons() {
        return this.ctaButtons;
    }

    public final boolean isSduiChartEnabled() {
        return this.isSduiChartEnabled;
    }

    public final int getChartIndex() {
        return this.chartIndex;
    }

    public final boolean isExploreExperimentEnabled() {
        return this.isExploreExperimentEnabled;
    }

    public final boolean isCryptoMibExperimentEnabled() {
        return this.isCryptoMibExperimentEnabled;
    }

    public final CryptoUsPulseExperiment.Variant getCryptoCatchUpExperimentVariant() {
        return this.cryptoCatchUpExperimentVariant;
    }

    public final ContentState getContentState() {
        if (this.showErrorState) {
            return ContentState.ERROR;
        }
        if (this.showLoading) {
            return ContentState.LOADING;
        }
        return ContentState.CONTENT;
    }

    public final boolean getHideBuyingPowerDivider() {
        return this.componentTypes.indexOf(CryptoHomeComponentType.NOTIFICATION_CARDS) == this.componentTypes.indexOf(CryptoHomeComponentType.BUYING_POWER) + 1;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoHomeViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/CryptoHomeViewState$ContentState;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "CONTENT", "ERROR", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContentState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentState[] $VALUES;
        public static final ContentState LOADING = new ContentState("LOADING", 0);
        public static final ContentState CONTENT = new ContentState("CONTENT", 1);
        public static final ContentState ERROR = new ContentState("ERROR", 2);

        private static final /* synthetic */ ContentState[] $values() {
            return new ContentState[]{LOADING, CONTENT, ERROR};
        }

        public static EnumEntries<ContentState> getEntries() {
            return $ENTRIES;
        }

        private ContentState(String str, int i) {
        }

        static {
            ContentState[] contentStateArr$values = $values();
            $VALUES = contentStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contentStateArr$values);
        }

        public static ContentState valueOf(String str) {
            return (ContentState) Enum.valueOf(ContentState.class, str);
        }

        public static ContentState[] values() {
            return (ContentState[]) $VALUES.clone();
        }
    }
}
