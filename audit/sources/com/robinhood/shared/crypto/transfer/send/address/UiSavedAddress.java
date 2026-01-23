package com.robinhood.shared.crypto.transfer.send.address;

import android.content.res.Resources;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.api.transfer.ApiSavedAddresses2;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: UiSavedAddress.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001>BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ^\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b0\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b1\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001eR\u0011\u00105\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b4\u0010\u0017R\u0011\u00108\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u00109\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b9\u00107R\u0011\u0010:\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b:\u00107R\u0011\u0010;\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b;\u00107R\u0011\u0010=\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010\u0017¨\u0006?"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;", "", "Ljava/util/UUID;", "id", "", PlaceTypes.ADDRESS, "currencyCode", "j$/time/Instant", "lastTransactionCreatedAt", "nickname", "statusMessage", "Lcom/robinhood/models/api/transfer/AddressStatus;", "status", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/transfer/AddressStatus;)V", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "(Landroid/content/res/Resources;)Lcom/robinhood/utils/resource/StringResource;", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lj$/time/Instant;", "component5", "component6", "component7", "()Lcom/robinhood/models/api/transfer/AddressStatus;", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/transfer/AddressStatus;)Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "Ljava/lang/String;", "getAddress", "getCurrencyCode", "Lj$/time/Instant;", "getLastTransactionCreatedAt", "getNickname", "getStatusMessage", "Lcom/robinhood/models/api/transfer/AddressStatus;", "getStatus", "getPrimaryText", "primaryText", "getShouldShowSaveIcon", "()Z", "shouldShowSaveIcon", "isSavedAddressRow", "isValidAddress", "isValidSavedAddress", "getShortenedAddress", "shortenedAddress", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UiSavedAddress {
    private final String address;
    private final String currencyCode;
    private final UUID id;
    private final Instant lastTransactionCreatedAt;
    private final String nickname;
    private final ApiSavedAddresses2 status;
    private final String statusMessage;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ UiSavedAddress copy$default(UiSavedAddress uiSavedAddress, UUID uuid, String str, String str2, Instant instant, String str3, String str4, ApiSavedAddresses2 apiSavedAddresses2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = uiSavedAddress.id;
        }
        if ((i & 2) != 0) {
            str = uiSavedAddress.address;
        }
        if ((i & 4) != 0) {
            str2 = uiSavedAddress.currencyCode;
        }
        if ((i & 8) != 0) {
            instant = uiSavedAddress.lastTransactionCreatedAt;
        }
        if ((i & 16) != 0) {
            str3 = uiSavedAddress.nickname;
        }
        if ((i & 32) != 0) {
            str4 = uiSavedAddress.statusMessage;
        }
        if ((i & 64) != 0) {
            apiSavedAddresses2 = uiSavedAddress.status;
        }
        String str5 = str4;
        ApiSavedAddresses2 apiSavedAddresses22 = apiSavedAddresses2;
        String str6 = str3;
        String str7 = str2;
        return uiSavedAddress.copy(uuid, str, str7, instant, str6, str5, apiSavedAddresses22);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component4, reason: from getter */
    public final Instant getLastTransactionCreatedAt() {
        return this.lastTransactionCreatedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStatusMessage() {
        return this.statusMessage;
    }

    /* renamed from: component7, reason: from getter */
    public final ApiSavedAddresses2 getStatus() {
        return this.status;
    }

    public final UiSavedAddress copy(UUID id, String address, String currencyCode, Instant lastTransactionCreatedAt, String nickname, String statusMessage, ApiSavedAddresses2 status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new UiSavedAddress(id, address, currencyCode, lastTransactionCreatedAt, nickname, statusMessage, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiSavedAddress)) {
            return false;
        }
        UiSavedAddress uiSavedAddress = (UiSavedAddress) other;
        return Intrinsics.areEqual(this.id, uiSavedAddress.id) && Intrinsics.areEqual(this.address, uiSavedAddress.address) && Intrinsics.areEqual(this.currencyCode, uiSavedAddress.currencyCode) && Intrinsics.areEqual(this.lastTransactionCreatedAt, uiSavedAddress.lastTransactionCreatedAt) && Intrinsics.areEqual(this.nickname, uiSavedAddress.nickname) && Intrinsics.areEqual(this.statusMessage, uiSavedAddress.statusMessage) && this.status == uiSavedAddress.status;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.address.hashCode()) * 31) + this.currencyCode.hashCode()) * 31;
        Instant instant = this.lastTransactionCreatedAt;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        String str = this.nickname;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusMessage;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ApiSavedAddresses2 apiSavedAddresses2 = this.status;
        return iHashCode4 + (apiSavedAddresses2 != null ? apiSavedAddresses2.hashCode() : 0);
    }

    public String toString() {
        return "UiSavedAddress(id=" + this.id + ", address=" + this.address + ", currencyCode=" + this.currencyCode + ", lastTransactionCreatedAt=" + this.lastTransactionCreatedAt + ", nickname=" + this.nickname + ", statusMessage=" + this.statusMessage + ", status=" + this.status + ")";
    }

    public UiSavedAddress(UUID id, String address, String currencyCode, Instant instant, String str, String str2, ApiSavedAddresses2 apiSavedAddresses2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.id = id;
        this.address = address;
        this.currencyCode = currencyCode;
        this.lastTransactionCreatedAt = instant;
        this.nickname = str;
        this.statusMessage = str2;
        this.status = apiSavedAddresses2;
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final Instant getLastTransactionCreatedAt() {
        return this.lastTransactionCreatedAt;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final ApiSavedAddresses2 getStatus() {
        return this.status;
    }

    public final String getPrimaryText() {
        String str = this.nickname;
        return str == null ? getShortenedAddress() : str;
    }

    public final boolean getShouldShowSaveIcon() {
        return this.nickname == null;
    }

    public final boolean isSavedAddressRow() {
        return this.nickname != null;
    }

    public final boolean isValidAddress() {
        return this.status != ApiSavedAddresses2.PENDING;
    }

    public final boolean isValidSavedAddress() {
        return isSavedAddressRow() && isValidAddress();
    }

    public final String getShortenedAddress() {
        return INSTANCE.shortenedAddress(this.address);
    }

    public final StringResource getSecondaryText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String str = this.statusMessage;
        if (str != null) {
            return StringResource.INSTANCE.invoke(str);
        }
        Instant instant = this.lastTransactionCreatedAt;
        String narrow = instant != null ? DurationFormatter.formatNarrow(resources, Durations.since(instant), true) : null;
        if (narrow != null) {
            if (this.nickname != null) {
                return StringResource.INSTANCE.invoke(C37934R.string.crypto_add_saved_address_subtitle_short_address_and_timestamp, getShortenedAddress(), narrow);
            }
            return StringResource.INSTANCE.invoke(narrow);
        }
        return StringResource.INSTANCE.invoke(getShortenedAddress());
    }

    /* compiled from: UiSavedAddress.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress$Companion;", "", "<init>", "()V", "shortenedAddress", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String shortenedAddress(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                if (str.length() <= 14) {
                    return str;
                }
                return str.subSequence(0, 7) + "…" + str.subSequence(str.length() - 7, str.length());
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, new EventMetadata(SentryTeam.CRYPTO, null, null, 6, null), 2, null);
                return str;
            }
        }
    }
}
