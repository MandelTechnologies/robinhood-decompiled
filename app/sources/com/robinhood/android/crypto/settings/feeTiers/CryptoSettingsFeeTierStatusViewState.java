package com.robinhood.android.crypto.settings.feeTiers;

import com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummary;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoSettingsFeeTierStatusViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState;", "", "<init>", "()V", "Hide", "Enabled", "Disabled", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState$Disabled;", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState$Enabled;", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState$Hide;", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CryptoSettingsFeeTierStatusViewState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoSettingsFeeTierStatusViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoSettingsFeeTierStatusViewState() {
    }

    /* compiled from: CryptoSettingsFeeTierStatusViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState$Hide;", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Hide extends CryptoSettingsFeeTierStatusViewState {
        public static final int $stable = 0;
        public static final Hide INSTANCE = new Hide();

        public boolean equals(Object other) {
            return this == other || (other instanceof Hide);
        }

        public int hashCode() {
            return -1428614743;
        }

        public String toString() {
            return "Hide";
        }

        private Hide() {
            super(null);
        }
    }

    /* compiled from: CryptoSettingsFeeTierStatusViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState$Enabled;", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState;", "feeTierSummary", "Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;", "expirationWarningBannerText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;Lcom/robinhood/utils/resource/StringResource;)V", "getFeeTierSummary", "()Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;", "getExpirationWarningBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Enabled extends CryptoSettingsFeeTierStatusViewState {
        public static final int $stable = StringResource.$stable | CryptoFeeTierSummary.$stable;
        private final StringResource expirationWarningBannerText;
        private final CryptoFeeTierSummary feeTierSummary;

        public static /* synthetic */ Enabled copy$default(Enabled enabled, CryptoFeeTierSummary cryptoFeeTierSummary, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoFeeTierSummary = enabled.feeTierSummary;
            }
            if ((i & 2) != 0) {
                stringResource = enabled.expirationWarningBannerText;
            }
            return enabled.copy(cryptoFeeTierSummary, stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoFeeTierSummary getFeeTierSummary() {
            return this.feeTierSummary;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getExpirationWarningBannerText() {
            return this.expirationWarningBannerText;
        }

        public final Enabled copy(CryptoFeeTierSummary feeTierSummary, StringResource expirationWarningBannerText) {
            Intrinsics.checkNotNullParameter(feeTierSummary, "feeTierSummary");
            return new Enabled(feeTierSummary, expirationWarningBannerText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Enabled)) {
                return false;
            }
            Enabled enabled = (Enabled) other;
            return Intrinsics.areEqual(this.feeTierSummary, enabled.feeTierSummary) && Intrinsics.areEqual(this.expirationWarningBannerText, enabled.expirationWarningBannerText);
        }

        public int hashCode() {
            int iHashCode = this.feeTierSummary.hashCode() * 31;
            StringResource stringResource = this.expirationWarningBannerText;
            return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
        }

        public String toString() {
            return "Enabled(feeTierSummary=" + this.feeTierSummary + ", expirationWarningBannerText=" + this.expirationWarningBannerText + ")";
        }

        public final CryptoFeeTierSummary getFeeTierSummary() {
            return this.feeTierSummary;
        }

        public final StringResource getExpirationWarningBannerText() {
            return this.expirationWarningBannerText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enabled(CryptoFeeTierSummary feeTierSummary, StringResource stringResource) {
            super(null);
            Intrinsics.checkNotNullParameter(feeTierSummary, "feeTierSummary");
            this.feeTierSummary = feeTierSummary;
            this.expirationWarningBannerText = stringResource;
        }
    }

    /* compiled from: CryptoSettingsFeeTierStatusViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState$Disabled;", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Disabled extends CryptoSettingsFeeTierStatusViewState {
        public static final int $stable = 0;
        public static final Disabled INSTANCE = new Disabled();

        public boolean equals(Object other) {
            return this == other || (other instanceof Disabled);
        }

        public int hashCode() {
            return 155181923;
        }

        public String toString() {
            return "Disabled";
        }

        private Disabled() {
            super(null);
        }
    }
}
