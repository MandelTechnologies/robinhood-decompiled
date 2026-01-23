package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.api.ApiCryptoSduiMessageScreen;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoMessagingStore.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010H\u0002J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "viewCountPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "versionPref", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/StringToLongMapPreference;)V", "fetchMessagingEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore$MessagingRequestData;", "Lcom/robinhood/models/api/ApiCryptoSduiMessageScreen;", "forceFetchMessaging", "touchPoint", "Lcom/robinhood/models/api/ApiCryptoSduiMessageScreen$TouchPoint;", "currencyPairId", "Ljava/util/UUID;", "(Lcom/robinhood/models/api/ApiCryptoSduiMessageScreen$TouchPoint;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markScreenAsViewed", "", "checkVersion", "screen", "bumpVersion", "newVersion", "", "MessagingRequestData", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoMessagingStore extends Store {
    private static final long InitialVersionValue = 1;
    private static final long InitialViewCountValue = 0;
    private final AppType appType;
    private final CryptoBonfireApi cryptoBonfireApi;
    private final Endpoint<MessagingRequestData, ApiCryptoSduiMessageScreen> fetchMessagingEndpoint;
    private final StringToLongMapPreference versionPref;
    private final StringToLongMapPreference viewCountPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoMessagingStore(StoreBundle storeBundle, AppType appType, CryptoBonfireApi cryptoBonfireApi, @CryptoMessagingStore4 StringToLongMapPreference viewCountPref, @CryptoMessagingStore3 StringToLongMapPreference versionPref) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        Intrinsics.checkNotNullParameter(viewCountPref, "viewCountPref");
        Intrinsics.checkNotNullParameter(versionPref, "versionPref");
        this.appType = appType;
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.viewCountPref = viewCountPref;
        this.versionPref = versionPref;
        this.fetchMessagingEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoMessagingStore5(this, null), getLogoutKillswitch(), new CryptoMessagingStore6(null), storeBundle.getClock(), null, 16, null);
    }

    public final Object forceFetchMessaging(ApiCryptoSduiMessageScreen.TouchPoint touchPoint, UUID uuid, Continuation<? super ApiCryptoSduiMessageScreen> continuation) {
        if (this.appType != AppType.RHC) {
            return null;
        }
        Endpoint<MessagingRequestData, ApiCryptoSduiMessageScreen> endpoint = this.fetchMessagingEndpoint;
        Long l = this.viewCountPref.getValues().get(touchPoint.name());
        int iLongValue = (int) (l != null ? l.longValue() : 0L);
        Long l2 = this.versionPref.getValues().get(touchPoint.name());
        Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, new MessagingRequestData(touchPoint, (int) (l2 != null ? l2.longValue() : 1L), uuid, iLongValue), null, continuation, 2, null);
        return objForceFetch$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objForceFetch$default : (ApiCryptoSduiMessageScreen) objForceFetch$default;
    }

    public final void markScreenAsViewed(ApiCryptoSduiMessageScreen.TouchPoint touchPoint) {
        Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
        StringToLongMapPreference stringToLongMapPreference = this.viewCountPref;
        Map<String, Long> mutableMap = MapsKt.toMutableMap(stringToLongMapPreference.getValues());
        String strName = touchPoint.name();
        Long l = mutableMap.get(touchPoint.name());
        mutableMap.put(strName, Long.valueOf((l != null ? l.longValue() : 0L) + 1));
        stringToLongMapPreference.setValues(mutableMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkVersion(ApiCryptoSduiMessageScreen screen) {
        ApiCryptoSduiMessageScreen.TouchPoint touchPoint = screen.getTouchPointData().getTouchPoint();
        Long l = this.versionPref.getValues().get(touchPoint.name());
        if (screen.getTouchPointData().getVersion() > (l != null ? l.longValue() : 1L)) {
            bumpVersion(touchPoint, screen.getTouchPointData().getVersion());
        }
    }

    private final void bumpVersion(ApiCryptoSduiMessageScreen.TouchPoint touchPoint, int newVersion) {
        StringToLongMapPreference stringToLongMapPreference = this.viewCountPref;
        Map<String, Long> mutableMap = MapsKt.toMutableMap(stringToLongMapPreference.getValues());
        mutableMap.put(touchPoint.name(), 0L);
        stringToLongMapPreference.setValues(mutableMap);
        StringToLongMapPreference stringToLongMapPreference2 = this.versionPref;
        Map<String, Long> mutableMap2 = MapsKt.toMutableMap(stringToLongMapPreference2.getValues());
        mutableMap2.put(touchPoint.name(), Long.valueOf(newVersion));
        stringToLongMapPreference2.setValues(mutableMap2);
    }

    /* compiled from: CryptoMessagingStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore$MessagingRequestData;", "", "touchPoint", "Lcom/robinhood/models/api/ApiCryptoSduiMessageScreen$TouchPoint;", "version", "", "currencyPairId", "Ljava/util/UUID;", "viewCount", "<init>", "(Lcom/robinhood/models/api/ApiCryptoSduiMessageScreen$TouchPoint;ILjava/util/UUID;I)V", "getTouchPoint", "()Lcom/robinhood/models/api/ApiCryptoSduiMessageScreen$TouchPoint;", "getVersion", "()I", "getCurrencyPairId", "()Ljava/util/UUID;", "getViewCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MessagingRequestData {
        private final UUID currencyPairId;
        private final ApiCryptoSduiMessageScreen.TouchPoint touchPoint;
        private final int version;
        private final int viewCount;

        public static /* synthetic */ MessagingRequestData copy$default(MessagingRequestData messagingRequestData, ApiCryptoSduiMessageScreen.TouchPoint touchPoint, int i, UUID uuid, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                touchPoint = messagingRequestData.touchPoint;
            }
            if ((i3 & 2) != 0) {
                i = messagingRequestData.version;
            }
            if ((i3 & 4) != 0) {
                uuid = messagingRequestData.currencyPairId;
            }
            if ((i3 & 8) != 0) {
                i2 = messagingRequestData.viewCount;
            }
            return messagingRequestData.copy(touchPoint, i, uuid, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCryptoSduiMessageScreen.TouchPoint getTouchPoint() {
            return this.touchPoint;
        }

        /* renamed from: component2, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component4, reason: from getter */
        public final int getViewCount() {
            return this.viewCount;
        }

        public final MessagingRequestData copy(ApiCryptoSduiMessageScreen.TouchPoint touchPoint, int version, UUID currencyPairId, int viewCount) {
            Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new MessagingRequestData(touchPoint, version, currencyPairId, viewCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessagingRequestData)) {
                return false;
            }
            MessagingRequestData messagingRequestData = (MessagingRequestData) other;
            return this.touchPoint == messagingRequestData.touchPoint && this.version == messagingRequestData.version && Intrinsics.areEqual(this.currencyPairId, messagingRequestData.currencyPairId) && this.viewCount == messagingRequestData.viewCount;
        }

        public int hashCode() {
            return (((((this.touchPoint.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.currencyPairId.hashCode()) * 31) + Integer.hashCode(this.viewCount);
        }

        public String toString() {
            return "MessagingRequestData(touchPoint=" + this.touchPoint + ", version=" + this.version + ", currencyPairId=" + this.currencyPairId + ", viewCount=" + this.viewCount + ")";
        }

        public MessagingRequestData(ApiCryptoSduiMessageScreen.TouchPoint touchPoint, int i, UUID currencyPairId, int i2) {
            Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.touchPoint = touchPoint;
            this.version = i;
            this.currencyPairId = currencyPairId;
            this.viewCount = i2;
        }

        public final ApiCryptoSduiMessageScreen.TouchPoint getTouchPoint() {
            return this.touchPoint;
        }

        public final int getVersion() {
            return this.version;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final int getViewCount() {
            return this.viewCount;
        }
    }
}
