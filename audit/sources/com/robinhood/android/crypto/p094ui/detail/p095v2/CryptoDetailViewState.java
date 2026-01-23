package com.robinhood.android.crypto.p094ui.detail.p095v2;

import bff_crypto_trading.service.p018v1.CryptoDetailPageState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailViewState;", "", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lbff_crypto_trading/service/v1/CryptoDetailPageState;", "contentState", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailViewState$ContentState;", "loggedOutCtaVisible", "", "isCryptoSduiChartsEnabled", "showUkRiskWarningBanner", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailViewState$ContentState;ZZZ)V", "getComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "getContentState", "()Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailViewState$ContentState;", "getLoggedOutCtaVisible", "()Z", "getShowUkRiskWarningBanner", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "ContentState", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailViewState {
    public static final int $stable = 0;
    private final ImmutableList<CryptoDetailPageState> components;
    private final ContentState contentState;
    private final boolean isCryptoSduiChartsEnabled;
    private final boolean loggedOutCtaVisible;
    private final boolean showUkRiskWarningBanner;

    public static /* synthetic */ CryptoDetailViewState copy$default(CryptoDetailViewState cryptoDetailViewState, ImmutableList immutableList, ContentState contentState, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = cryptoDetailViewState.components;
        }
        if ((i & 2) != 0) {
            contentState = cryptoDetailViewState.contentState;
        }
        if ((i & 4) != 0) {
            z = cryptoDetailViewState.loggedOutCtaVisible;
        }
        if ((i & 8) != 0) {
            z2 = cryptoDetailViewState.isCryptoSduiChartsEnabled;
        }
        if ((i & 16) != 0) {
            z3 = cryptoDetailViewState.showUkRiskWarningBanner;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return cryptoDetailViewState.copy(immutableList, contentState, z5, z2, z4);
    }

    public final ImmutableList<CryptoDetailPageState> component1() {
        return this.components;
    }

    /* renamed from: component2, reason: from getter */
    public final ContentState getContentState() {
        return this.contentState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLoggedOutCtaVisible() {
        return this.loggedOutCtaVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCryptoSduiChartsEnabled() {
        return this.isCryptoSduiChartsEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowUkRiskWarningBanner() {
        return this.showUkRiskWarningBanner;
    }

    public final CryptoDetailViewState copy(ImmutableList<? extends CryptoDetailPageState> components, ContentState contentState, boolean loggedOutCtaVisible, boolean isCryptoSduiChartsEnabled, boolean showUkRiskWarningBanner) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        return new CryptoDetailViewState(components, contentState, loggedOutCtaVisible, isCryptoSduiChartsEnabled, showUkRiskWarningBanner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailViewState)) {
            return false;
        }
        CryptoDetailViewState cryptoDetailViewState = (CryptoDetailViewState) other;
        return Intrinsics.areEqual(this.components, cryptoDetailViewState.components) && this.contentState == cryptoDetailViewState.contentState && this.loggedOutCtaVisible == cryptoDetailViewState.loggedOutCtaVisible && this.isCryptoSduiChartsEnabled == cryptoDetailViewState.isCryptoSduiChartsEnabled && this.showUkRiskWarningBanner == cryptoDetailViewState.showUkRiskWarningBanner;
    }

    public int hashCode() {
        return (((((((this.components.hashCode() * 31) + this.contentState.hashCode()) * 31) + Boolean.hashCode(this.loggedOutCtaVisible)) * 31) + Boolean.hashCode(this.isCryptoSduiChartsEnabled)) * 31) + Boolean.hashCode(this.showUkRiskWarningBanner);
    }

    public String toString() {
        return "CryptoDetailViewState(components=" + this.components + ", contentState=" + this.contentState + ", loggedOutCtaVisible=" + this.loggedOutCtaVisible + ", isCryptoSduiChartsEnabled=" + this.isCryptoSduiChartsEnabled + ", showUkRiskWarningBanner=" + this.showUkRiskWarningBanner + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoDetailViewState(ImmutableList<? extends CryptoDetailPageState> components, ContentState contentState, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        this.components = components;
        this.contentState = contentState;
        this.loggedOutCtaVisible = z;
        this.isCryptoSduiChartsEnabled = z2;
        this.showUkRiskWarningBanner = z3;
    }

    public final ImmutableList<CryptoDetailPageState> getComponents() {
        return this.components;
    }

    public final ContentState getContentState() {
        return this.contentState;
    }

    public final boolean getLoggedOutCtaVisible() {
        return this.loggedOutCtaVisible;
    }

    public final boolean isCryptoSduiChartsEnabled() {
        return this.isCryptoSduiChartsEnabled;
    }

    public final boolean getShowUkRiskWarningBanner() {
        return this.showUkRiskWarningBanner;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailViewState$ContentState;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "CONTENT", "ERROR", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
