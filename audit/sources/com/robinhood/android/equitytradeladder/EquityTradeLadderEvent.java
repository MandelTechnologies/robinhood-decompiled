package com.robinhood.android.equitytradeladder;

import android.net.Uri;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.ClientComponentAlert;
import com.robinhood.models.p320db.EquityOrderChecksAlert;
import com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderEvent.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderEvent;", "Exit", "ApiOrNetworkError", "CenterAtIndex", "HapticFeedbacks", "LaunchActivity", "LaunchDeepLink", "LaunchFragment", "ShowDialog", "OrderCheckBottomSheet", "OrderCheckAlert", "Snackbar", "ServerDrivenAlert", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$ApiOrNetworkError;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$CenterAtIndex;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$Exit;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$HapticFeedbacks;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$LaunchActivity;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$LaunchDeepLink;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$LaunchFragment;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$OrderCheckAlert;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$OrderCheckBottomSheet;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$ServerDrivenAlert;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$ShowDialog;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$Snackbar;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EquityTradeLadderEvent extends BaseLadderDuxo4 {

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$Exit;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Exit implements EquityTradeLadderEvent {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        public boolean equals(Object other) {
            return this == other || (other instanceof Exit);
        }

        public int hashCode() {
            return 1328979922;
        }

        public String toString() {
            return "Exit";
        }

        private Exit() {
        }
    }

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$ApiOrNetworkError;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiOrNetworkError implements EquityTradeLadderEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ ApiOrNetworkError copy$default(ApiOrNetworkError apiOrNetworkError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = apiOrNetworkError.throwable;
            }
            return apiOrNetworkError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final ApiOrNetworkError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new ApiOrNetworkError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApiOrNetworkError) && Intrinsics.areEqual(this.throwable, ((ApiOrNetworkError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "ApiOrNetworkError(throwable=" + this.throwable + ")";
        }

        public ApiOrNetworkError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$CenterAtIndex;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "animate", "", "<init>", "(IZ)V", "getIndex", "()I", "getAnimate", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CenterAtIndex implements EquityTradeLadderEvent {
        public static final int $stable = 0;
        private final boolean animate;
        private final int index;

        public static /* synthetic */ CenterAtIndex copy$default(CenterAtIndex centerAtIndex, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = centerAtIndex.index;
            }
            if ((i2 & 2) != 0) {
                z = centerAtIndex.animate;
            }
            return centerAtIndex.copy(i, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAnimate() {
            return this.animate;
        }

        public final CenterAtIndex copy(int index, boolean animate) {
            return new CenterAtIndex(index, animate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CenterAtIndex)) {
                return false;
            }
            CenterAtIndex centerAtIndex = (CenterAtIndex) other;
            return this.index == centerAtIndex.index && this.animate == centerAtIndex.animate;
        }

        public int hashCode() {
            return (Integer.hashCode(this.index) * 31) + Boolean.hashCode(this.animate);
        }

        public String toString() {
            return "CenterAtIndex(index=" + this.index + ", animate=" + this.animate + ")";
        }

        public CenterAtIndex(int i, boolean z) {
            this.index = i;
            this.animate = z;
        }

        public final boolean getAnimate() {
            return this.animate;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$HapticFeedbacks;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "constant", "", "<init>", "(I)V", "getConstant", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HapticFeedbacks implements EquityTradeLadderEvent {
        public static final int $stable = 0;
        private final int constant;

        public static /* synthetic */ HapticFeedbacks copy$default(HapticFeedbacks hapticFeedbacks, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = hapticFeedbacks.constant;
            }
            return hapticFeedbacks.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getConstant() {
            return this.constant;
        }

        public final HapticFeedbacks copy(int constant) {
            return new HapticFeedbacks(constant);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HapticFeedbacks) && this.constant == ((HapticFeedbacks) other).constant;
        }

        public int hashCode() {
            return Integer.hashCode(this.constant);
        }

        public String toString() {
            return "HapticFeedbacks(constant=" + this.constant + ")";
        }

        public HapticFeedbacks(int i) {
            this.constant = i;
        }

        public final int getConstant() {
            return this.constant;
        }
    }

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$LaunchActivity;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "key", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchActivity implements EquityTradeLadderEvent {
        public static final int $stable = 8;
        private final IntentKey key;

        public static /* synthetic */ LaunchActivity copy$default(LaunchActivity launchActivity, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = launchActivity.key;
            }
            return launchActivity.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getKey() {
            return this.key;
        }

        public final LaunchActivity copy(IntentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new LaunchActivity(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchActivity) && Intrinsics.areEqual(this.key, ((LaunchActivity) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "LaunchActivity(key=" + this.key + ")";
        }

        public LaunchActivity(IntentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final IntentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$LaunchDeepLink;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchDeepLink implements EquityTradeLadderEvent {
        public static final int $stable = 8;
        private final Uri uri;

        public static /* synthetic */ LaunchDeepLink copy$default(LaunchDeepLink launchDeepLink, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = launchDeepLink.uri;
            }
            return launchDeepLink.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final LaunchDeepLink copy(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new LaunchDeepLink(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchDeepLink) && Intrinsics.areEqual(this.uri, ((LaunchDeepLink) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "LaunchDeepLink(uri=" + this.uri + ")";
        }

        public LaunchDeepLink(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$LaunchFragment;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchFragment implements EquityTradeLadderEvent {
        public static final int $stable = 8;
        private final FragmentKey key;

        public static /* synthetic */ LaunchFragment copy$default(LaunchFragment launchFragment, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = launchFragment.key;
            }
            return launchFragment.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getKey() {
            return this.key;
        }

        public final LaunchFragment copy(FragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new LaunchFragment(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchFragment) && Intrinsics.areEqual(this.key, ((LaunchFragment) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "LaunchFragment(key=" + this.key + ")";
        }

        public LaunchFragment(FragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final FragmentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$ShowDialog;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "title", "Lcom/robinhood/utils/resource/StringResource;", "message", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDialog implements EquityTradeLadderEvent {
        public static final int $stable = StringResource.$stable;
        private final StringResource message;
        private final StringResource title;

        public static /* synthetic */ ShowDialog copy$default(ShowDialog showDialog, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = showDialog.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = showDialog.message;
            }
            return showDialog.copy(stringResource, stringResource2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getMessage() {
            return this.message;
        }

        public final ShowDialog copy(StringResource title, StringResource message) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new ShowDialog(title, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowDialog)) {
                return false;
            }
            ShowDialog showDialog = (ShowDialog) other;
            return Intrinsics.areEqual(this.title, showDialog.title) && Intrinsics.areEqual(this.message, showDialog.message);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            StringResource stringResource = this.message;
            return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
        }

        public String toString() {
            return "ShowDialog(title=" + this.title + ", message=" + this.message + ")";
        }

        public ShowDialog(StringResource title, StringResource stringResource) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.message = stringResource;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getMessage() {
            return this.message;
        }
    }

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$OrderCheckBottomSheet;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "equityOrderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "key", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "tag", "", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Lcom/robinhood/android/navigation/keys/DialogFragmentKey;Ljava/lang/String;)V", "getEquityOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "getKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderCheckBottomSheet implements EquityTradeLadderEvent {
        public static final int $stable = 8;
        private final EquityOrderIntent equityOrderIntent;
        private final DialogFragmentKey key;
        private final String tag;

        public static /* synthetic */ OrderCheckBottomSheet copy$default(OrderCheckBottomSheet orderCheckBottomSheet, EquityOrderIntent equityOrderIntent, DialogFragmentKey dialogFragmentKey, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = orderCheckBottomSheet.equityOrderIntent;
            }
            if ((i & 2) != 0) {
                dialogFragmentKey = orderCheckBottomSheet.key;
            }
            if ((i & 4) != 0) {
                str = orderCheckBottomSheet.tag;
            }
            return orderCheckBottomSheet.copy(equityOrderIntent, dialogFragmentKey, str);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getEquityOrderIntent() {
            return this.equityOrderIntent;
        }

        /* renamed from: component2, reason: from getter */
        public final DialogFragmentKey getKey() {
            return this.key;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public final OrderCheckBottomSheet copy(EquityOrderIntent equityOrderIntent, DialogFragmentKey key, String tag) {
            Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
            Intrinsics.checkNotNullParameter(key, "key");
            return new OrderCheckBottomSheet(equityOrderIntent, key, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderCheckBottomSheet)) {
                return false;
            }
            OrderCheckBottomSheet orderCheckBottomSheet = (OrderCheckBottomSheet) other;
            return Intrinsics.areEqual(this.equityOrderIntent, orderCheckBottomSheet.equityOrderIntent) && Intrinsics.areEqual(this.key, orderCheckBottomSheet.key) && Intrinsics.areEqual(this.tag, orderCheckBottomSheet.tag);
        }

        public int hashCode() {
            int iHashCode = ((this.equityOrderIntent.hashCode() * 31) + this.key.hashCode()) * 31;
            String str = this.tag;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OrderCheckBottomSheet(equityOrderIntent=" + this.equityOrderIntent + ", key=" + this.key + ", tag=" + this.tag + ")";
        }

        public OrderCheckBottomSheet(EquityOrderIntent equityOrderIntent, DialogFragmentKey key, String str) {
            Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
            Intrinsics.checkNotNullParameter(key, "key");
            this.equityOrderIntent = equityOrderIntent;
            this.key = key;
            this.tag = str;
        }

        public /* synthetic */ OrderCheckBottomSheet(EquityOrderIntent equityOrderIntent, DialogFragmentKey dialogFragmentKey, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(equityOrderIntent, dialogFragmentKey, (i & 4) != 0 ? null : str);
        }

        public final EquityOrderIntent getEquityOrderIntent() {
            return this.equityOrderIntent;
        }

        public final DialogFragmentKey getKey() {
            return this.key;
        }

        public final String getTag() {
            return this.tag;
        }
    }

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$OrderCheckAlert;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "orderCheckAlert", "Lcom/robinhood/models/db/EquityOrderChecksAlert;", "equityOrderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/models/db/EquityOrderChecksAlert;Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getOrderCheckAlert", "()Lcom/robinhood/models/db/EquityOrderChecksAlert;", "getEquityOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderCheckAlert implements EquityTradeLadderEvent {
        public static final int $stable = 8;
        private final EquityOrderIntent equityOrderIntent;
        private final EquityOrderChecksAlert orderCheckAlert;

        public static /* synthetic */ OrderCheckAlert copy$default(OrderCheckAlert orderCheckAlert, EquityOrderChecksAlert equityOrderChecksAlert, EquityOrderIntent equityOrderIntent, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderChecksAlert = orderCheckAlert.orderCheckAlert;
            }
            if ((i & 2) != 0) {
                equityOrderIntent = orderCheckAlert.equityOrderIntent;
            }
            return orderCheckAlert.copy(equityOrderChecksAlert, equityOrderIntent);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderChecksAlert getOrderCheckAlert() {
            return this.orderCheckAlert;
        }

        /* renamed from: component2, reason: from getter */
        public final EquityOrderIntent getEquityOrderIntent() {
            return this.equityOrderIntent;
        }

        public final OrderCheckAlert copy(EquityOrderChecksAlert orderCheckAlert, EquityOrderIntent equityOrderIntent) {
            Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
            return new OrderCheckAlert(orderCheckAlert, equityOrderIntent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderCheckAlert)) {
                return false;
            }
            OrderCheckAlert orderCheckAlert = (OrderCheckAlert) other;
            return Intrinsics.areEqual(this.orderCheckAlert, orderCheckAlert.orderCheckAlert) && Intrinsics.areEqual(this.equityOrderIntent, orderCheckAlert.equityOrderIntent);
        }

        public int hashCode() {
            EquityOrderChecksAlert equityOrderChecksAlert = this.orderCheckAlert;
            return ((equityOrderChecksAlert == null ? 0 : equityOrderChecksAlert.hashCode()) * 31) + this.equityOrderIntent.hashCode();
        }

        public String toString() {
            return "OrderCheckAlert(orderCheckAlert=" + this.orderCheckAlert + ", equityOrderIntent=" + this.equityOrderIntent + ")";
        }

        public OrderCheckAlert(EquityOrderChecksAlert equityOrderChecksAlert, EquityOrderIntent equityOrderIntent) {
            Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
            this.orderCheckAlert = equityOrderChecksAlert;
            this.equityOrderIntent = equityOrderIntent;
        }

        public final EquityOrderChecksAlert getOrderCheckAlert() {
            return this.orderCheckAlert;
        }

        public final EquityOrderIntent getEquityOrderIntent() {
            return this.equityOrderIntent;
        }
    }

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$Snackbar;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "msg", "Lcom/robinhood/utils/resource/StringResource;", "actionText", "onActionClicked", "Lkotlin/Function0;", "", "withDismissAction", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Z)V", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getMsg", "()Lcom/robinhood/utils/resource/StringResource;", "getActionText", "getOnActionClicked", "()Lkotlin/jvm/functions/Function0;", "getWithDismissAction", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Snackbar implements EquityTradeLadderEvent {
        public static final int $stable = StringResource.$stable;
        private final StringResource actionText;
        private final ServerToBentoAssetMapper2 icon;
        private final StringResource msg;
        private final Function0<Unit> onActionClicked;
        private final boolean withDismissAction;

        public static /* synthetic */ Snackbar copy$default(Snackbar snackbar, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, StringResource stringResource2, Function0 function0, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                serverToBentoAssetMapper2 = snackbar.icon;
            }
            if ((i & 2) != 0) {
                stringResource = snackbar.msg;
            }
            if ((i & 4) != 0) {
                stringResource2 = snackbar.actionText;
            }
            if ((i & 8) != 0) {
                function0 = snackbar.onActionClicked;
            }
            if ((i & 16) != 0) {
                z = snackbar.withDismissAction;
            }
            boolean z2 = z;
            StringResource stringResource3 = stringResource2;
            return snackbar.copy(serverToBentoAssetMapper2, stringResource, stringResource3, function0, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getMsg() {
            return this.msg;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getActionText() {
            return this.actionText;
        }

        public final Function0<Unit> component4() {
            return this.onActionClicked;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public final Snackbar copy(ServerToBentoAssetMapper2 icon, StringResource msg, StringResource actionText, Function0<Unit> onActionClicked, boolean withDismissAction) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new Snackbar(icon, msg, actionText, onActionClicked, withDismissAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snackbar)) {
                return false;
            }
            Snackbar snackbar = (Snackbar) other;
            return this.icon == snackbar.icon && Intrinsics.areEqual(this.msg, snackbar.msg) && Intrinsics.areEqual(this.actionText, snackbar.actionText) && Intrinsics.areEqual(this.onActionClicked, snackbar.onActionClicked) && this.withDismissAction == snackbar.withDismissAction;
        }

        public int hashCode() {
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
            int iHashCode = (((serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode()) * 31) + this.msg.hashCode()) * 31;
            StringResource stringResource = this.actionText;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            Function0<Unit> function0 = this.onActionClicked;
            return ((iHashCode2 + (function0 != null ? function0.hashCode() : 0)) * 31) + Boolean.hashCode(this.withDismissAction);
        }

        public String toString() {
            return "Snackbar(icon=" + this.icon + ", msg=" + this.msg + ", actionText=" + this.actionText + ", onActionClicked=" + this.onActionClicked + ", withDismissAction=" + this.withDismissAction + ")";
        }

        public Snackbar(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource msg, StringResource stringResource, Function0<Unit> function0, boolean z) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.icon = serverToBentoAssetMapper2;
            this.msg = msg;
            this.actionText = stringResource;
            this.onActionClicked = function0;
            this.withDismissAction = z;
        }

        public /* synthetic */ Snackbar(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource, StringResource stringResource2, Function0 function0, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : serverToBentoAssetMapper2, stringResource, (i & 4) != 0 ? null : stringResource2, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? false : z);
        }

        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        public final StringResource getMsg() {
            return this.msg;
        }

        public final StringResource getActionText() {
            return this.actionText;
        }

        public final Function0<Unit> getOnActionClicked() {
            return this.onActionClicked;
        }

        public final boolean getWithDismissAction() {
            return this.withDismissAction;
        }
    }

    /* compiled from: EquityTradeLadderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$ServerDrivenAlert;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "alert", "Lcom/robinhood/models/db/ClientComponentAlert;", "<init>", "(Lcom/robinhood/models/db/ClientComponentAlert;)V", "getAlert", "()Lcom/robinhood/models/db/ClientComponentAlert;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ServerDrivenAlert implements EquityTradeLadderEvent {
        public static final int $stable = 8;
        private final ClientComponentAlert alert;

        public static /* synthetic */ ServerDrivenAlert copy$default(ServerDrivenAlert serverDrivenAlert, ClientComponentAlert clientComponentAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                clientComponentAlert = serverDrivenAlert.alert;
            }
            return serverDrivenAlert.copy(clientComponentAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final ClientComponentAlert getAlert() {
            return this.alert;
        }

        public final ServerDrivenAlert copy(ClientComponentAlert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new ServerDrivenAlert(alert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ServerDrivenAlert) && Intrinsics.areEqual(this.alert, ((ServerDrivenAlert) other).alert);
        }

        public int hashCode() {
            return this.alert.hashCode();
        }

        public String toString() {
            return "ServerDrivenAlert(alert=" + this.alert + ")";
        }

        public ServerDrivenAlert(ClientComponentAlert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final ClientComponentAlert getAlert() {
            return this.alert;
        }
    }
}
