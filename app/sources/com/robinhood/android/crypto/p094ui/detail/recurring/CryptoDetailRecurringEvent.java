package com.robinhood.android.crypto.p094ui.detail.recurring;

import com.robinhood.android.navigation.keys.NavigationKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailRecurringEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent;", "", "<init>", "()V", "ShowCryptoFeeUnsupportedRecurringAlert", "EnterRecurringFlow", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent$EnterRecurringFlow;", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent$ShowCryptoFeeUnsupportedRecurringAlert;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CryptoDetailRecurringEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoDetailRecurringEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoDetailRecurringEvent() {
    }

    /* compiled from: CryptoDetailRecurringEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent$ShowCryptoFeeUnsupportedRecurringAlert;", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent;", "assetCurrencyCode", "", "<init>", "(Ljava/lang/String;)V", "getAssetCurrencyCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowCryptoFeeUnsupportedRecurringAlert extends CryptoDetailRecurringEvent {
        public static final int $stable = 0;
        private final String assetCurrencyCode;

        public static /* synthetic */ ShowCryptoFeeUnsupportedRecurringAlert copy$default(ShowCryptoFeeUnsupportedRecurringAlert showCryptoFeeUnsupportedRecurringAlert, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showCryptoFeeUnsupportedRecurringAlert.assetCurrencyCode;
            }
            return showCryptoFeeUnsupportedRecurringAlert.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssetCurrencyCode() {
            return this.assetCurrencyCode;
        }

        public final ShowCryptoFeeUnsupportedRecurringAlert copy(String assetCurrencyCode) {
            Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
            return new ShowCryptoFeeUnsupportedRecurringAlert(assetCurrencyCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowCryptoFeeUnsupportedRecurringAlert) && Intrinsics.areEqual(this.assetCurrencyCode, ((ShowCryptoFeeUnsupportedRecurringAlert) other).assetCurrencyCode);
        }

        public int hashCode() {
            return this.assetCurrencyCode.hashCode();
        }

        public String toString() {
            return "ShowCryptoFeeUnsupportedRecurringAlert(assetCurrencyCode=" + this.assetCurrencyCode + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowCryptoFeeUnsupportedRecurringAlert(String assetCurrencyCode) {
            super(null);
            Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
            this.assetCurrencyCode = assetCurrencyCode;
        }

        public final String getAssetCurrencyCode() {
            return this.assetCurrencyCode;
        }
    }

    /* compiled from: CryptoDetailRecurringEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent$EnterRecurringFlow;", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent;", "navigationKey", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/NavigationKey;)V", "getNavigationKey", "()Lcom/robinhood/android/navigation/keys/NavigationKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EnterRecurringFlow extends CryptoDetailRecurringEvent {
        public static final int $stable = 8;
        private final NavigationKey navigationKey;

        public static /* synthetic */ EnterRecurringFlow copy$default(EnterRecurringFlow enterRecurringFlow, NavigationKey navigationKey, int i, Object obj) {
            if ((i & 1) != 0) {
                navigationKey = enterRecurringFlow.navigationKey;
            }
            return enterRecurringFlow.copy(navigationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final NavigationKey getNavigationKey() {
            return this.navigationKey;
        }

        public final EnterRecurringFlow copy(NavigationKey navigationKey) {
            Intrinsics.checkNotNullParameter(navigationKey, "navigationKey");
            return new EnterRecurringFlow(navigationKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnterRecurringFlow) && Intrinsics.areEqual(this.navigationKey, ((EnterRecurringFlow) other).navigationKey);
        }

        public int hashCode() {
            return this.navigationKey.hashCode();
        }

        public String toString() {
            return "EnterRecurringFlow(navigationKey=" + this.navigationKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnterRecurringFlow(NavigationKey navigationKey) {
            super(null);
            Intrinsics.checkNotNullParameter(navigationKey, "navigationKey");
            this.navigationKey = navigationKey;
        }

        public final NavigationKey getNavigationKey() {
            return this.navigationKey;
        }
    }
}
