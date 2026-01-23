package com.robinhood.android.common.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.utils.Preconditions;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListKey.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0003\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/contracts/CuratedListKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "RhList", "UserList", "Companion", "Lcom/robinhood/android/common/contracts/CuratedListKey$RhList;", "Lcom/robinhood/android/common/contracts/CuratedListKey$UserList;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CuratedListKey implements FragmentKey, TabFragmentKey {
    private static final String CRYPTO_LIST_ID = "97b746a5-bc2f-4c64-a828-1af0fc399bf9";
    private static final String CRYPTO_NON_TRADABLE_LIST_ID = "5606034a-f49b-4dbc-89cc-e2ca163dbfbd";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String ETF_LIST_ID = "79651aa7-6744-41fb-af15-21545a18172c";
    private static final String FUTURES_LIST_ID = "12442aa7-2280-4d5a-86e4-1ee5353f3892";
    private static final String LATE_CLOSING_OPTIONS_LIST_ID = "85127738-b52d-404a-ad0a-d30288592543";
    private static final String ONE_HUNDRED_POPULAR_STOCKS_ID = "e8ef4c1f-244f-4db5-a582-c4c37f3c8e8e";
    private static final RhList cryptoListKey;
    private static final RhList cryptoNonTradableListKey;
    private static final RhList etfListKey;
    private static final RhList futuresListKey;
    private static final RhList ipoAccessListKey;
    private static final RhList lateClosingOptionsListKey;
    private static final RhList oneHundredPopularStocksKey;

    public /* synthetic */ CuratedListKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CuratedListKey() {
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.BROWSE;
    }

    /* compiled from: CuratedListKey.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/contracts/CuratedListKey$RhList;", "Lcom/robinhood/android/common/contracts/CuratedListKey;", "listId", "Ljava/util/UUID;", "popoverIpoAnnouncementInstrumentId", "accountNumber", "", "filterId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V", "getListId", "()Ljava/util/UUID;", "getPopoverIpoAnnouncementInstrumentId", "getAccountNumber", "()Ljava/lang/String;", "getFilterId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhList extends CuratedListKey {
        public static final Parcelable.Creator<RhList> CREATOR = new Creator();
        private final String accountNumber;
        private final String filterId;
        private final UUID listId;
        private final UUID popoverIpoAnnouncementInstrumentId;

        /* compiled from: CuratedListKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RhList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhList createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhList((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhList[] newArray(int i) {
                return new RhList[i];
            }
        }

        public static /* synthetic */ RhList copy$default(RhList rhList, UUID uuid, UUID uuid2, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = rhList.listId;
            }
            if ((i & 2) != 0) {
                uuid2 = rhList.popoverIpoAnnouncementInstrumentId;
            }
            if ((i & 4) != 0) {
                str = rhList.accountNumber;
            }
            if ((i & 8) != 0) {
                str2 = rhList.filterId;
            }
            return rhList.copy(uuid, uuid2, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getListId() {
            return this.listId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getPopoverIpoAnnouncementInstrumentId() {
            return this.popoverIpoAnnouncementInstrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFilterId() {
            return this.filterId;
        }

        public final RhList copy(UUID listId, UUID popoverIpoAnnouncementInstrumentId, String accountNumber, String filterId) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            return new RhList(listId, popoverIpoAnnouncementInstrumentId, accountNumber, filterId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RhList)) {
                return false;
            }
            RhList rhList = (RhList) other;
            return Intrinsics.areEqual(this.listId, rhList.listId) && Intrinsics.areEqual(this.popoverIpoAnnouncementInstrumentId, rhList.popoverIpoAnnouncementInstrumentId) && Intrinsics.areEqual(this.accountNumber, rhList.accountNumber) && Intrinsics.areEqual(this.filterId, rhList.filterId);
        }

        public int hashCode() {
            int iHashCode = this.listId.hashCode() * 31;
            UUID uuid = this.popoverIpoAnnouncementInstrumentId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            String str = this.accountNumber;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.filterId;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "RhList(listId=" + this.listId + ", popoverIpoAnnouncementInstrumentId=" + this.popoverIpoAnnouncementInstrumentId + ", accountNumber=" + this.accountNumber + ", filterId=" + this.filterId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.listId);
            dest.writeSerializable(this.popoverIpoAnnouncementInstrumentId);
            dest.writeString(this.accountNumber);
            dest.writeString(this.filterId);
        }

        public /* synthetic */ RhList(UUID uuid, UUID uuid2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : uuid2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
        }

        public final UUID getListId() {
            return this.listId;
        }

        public final UUID getPopoverIpoAnnouncementInstrumentId() {
            return this.popoverIpoAnnouncementInstrumentId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getFilterId() {
            return this.filterId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhList(UUID listId, UUID uuid, String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(listId, "listId");
            this.listId = listId;
            this.popoverIpoAnnouncementInstrumentId = uuid;
            this.accountNumber = str;
            this.filterId = str2;
        }
    }

    /* compiled from: CuratedListKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/contracts/CuratedListKey$UserList;", "Lcom/robinhood/android/common/contracts/CuratedListKey;", "listId", "Ljava/util/UUID;", "showSurvey", "", "accountNumber", "", "<init>", "(Ljava/util/UUID;ZLjava/lang/String;)V", "getListId", "()Ljava/util/UUID;", "getShowSurvey", "()Z", "getAccountNumber", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UserList extends CuratedListKey {
        public static final Parcelable.Creator<UserList> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID listId;
        private final boolean showSurvey;

        /* compiled from: CuratedListKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UserList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserList createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserList((UUID) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserList[] newArray(int i) {
                return new UserList[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.listId);
            dest.writeInt(this.showSurvey ? 1 : 0);
            dest.writeString(this.accountNumber);
        }

        public /* synthetic */ UserList(UUID uuid, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
        }

        public final UUID getListId() {
            return this.listId;
        }

        public final boolean getShowSurvey() {
            return this.showSurvey;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserList(UUID listId, boolean z, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(listId, "listId");
            this.listId = listId;
            this.showSurvey = z;
            this.accountNumber = str;
        }
    }

    /* compiled from: CuratedListKey.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/contracts/CuratedListKey$Companion;", "", "<init>", "()V", "CRYPTO_LIST_ID", "", "CRYPTO_NON_TRADABLE_LIST_ID", "ETF_LIST_ID", "ONE_HUNDRED_POPULAR_STOCKS_ID", "LATE_CLOSING_OPTIONS_LIST_ID", "FUTURES_LIST_ID", "cryptoListKey", "Lcom/robinhood/android/common/contracts/CuratedListKey$RhList;", "getCryptoListKey", "()Lcom/robinhood/android/common/contracts/CuratedListKey$RhList;", "cryptoNonTradableListKey", "getCryptoNonTradableListKey", "etfListKey", "getEtfListKey", "oneHundredPopularStocksKey", "getOneHundredPopularStocksKey", "lateClosingOptionsListKey", "getLateClosingOptionsListKey", "ipoAccessListKey", "getIpoAccessListKey", "futuresListKey", "getFuturesListKey", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/contracts/CuratedListKey;", "listId", "Ljava/util/UUID;", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "accountNumber", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: CuratedListKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiCuratedList.OwnerType.values().length];
                try {
                    iArr[ApiCuratedList.OwnerType.CUSTOM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiCuratedList.OwnerType.ROBINHOOD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RhList getCryptoListKey() {
            return CuratedListKey.cryptoListKey;
        }

        public final RhList getCryptoNonTradableListKey() {
            return CuratedListKey.cryptoNonTradableListKey;
        }

        public final RhList getEtfListKey() {
            return CuratedListKey.etfListKey;
        }

        public final RhList getOneHundredPopularStocksKey() {
            return CuratedListKey.oneHundredPopularStocksKey;
        }

        public final RhList getLateClosingOptionsListKey() {
            return CuratedListKey.lateClosingOptionsListKey;
        }

        public final RhList getIpoAccessListKey() {
            return CuratedListKey.ipoAccessListKey;
        }

        public final RhList getFuturesListKey() {
            return CuratedListKey.futuresListKey;
        }

        public static /* synthetic */ CuratedListKey create$default(Companion companion, UUID uuid, ApiCuratedList.OwnerType ownerType, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            return companion.create(uuid, ownerType, str);
        }

        public final CuratedListKey create(UUID listId, ApiCuratedList.OwnerType ownerType, String accountNumber) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(ownerType, "ownerType");
            int i = WhenMappings.$EnumSwitchMapping$0[ownerType.ordinal()];
            if (i == 1) {
                return new UserList(listId, false, accountNumber, 2, null);
            }
            if (i == 2) {
                return new RhList(listId, null, null, null, 14, null);
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(ownerType);
            throw new ExceptionsH();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        UUID uuidFromString = UUID.fromString("97b746a5-bc2f-4c64-a828-1af0fc399bf9");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        cryptoListKey = new RhList(uuidFromString, null, null, null, 14, null);
        UUID uuidFromString2 = UUID.fromString(CRYPTO_NON_TRADABLE_LIST_ID);
        Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(...)");
        cryptoNonTradableListKey = new RhList(uuidFromString2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 14, null);
        UUID uuidFromString3 = UUID.fromString(ETF_LIST_ID);
        Intrinsics.checkNotNullExpressionValue(uuidFromString3, "fromString(...)");
        etfListKey = new RhList(uuidFromString3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 14, null);
        UUID uuidFromString4 = UUID.fromString(ONE_HUNDRED_POPULAR_STOCKS_ID);
        Intrinsics.checkNotNullExpressionValue(uuidFromString4, "fromString(...)");
        oneHundredPopularStocksKey = new RhList(uuidFromString4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 14, null);
        UUID uuidFromString5 = UUID.fromString(LATE_CLOSING_OPTIONS_LIST_ID);
        Intrinsics.checkNotNullExpressionValue(uuidFromString5, "fromString(...)");
        lateClosingOptionsListKey = new RhList(uuidFromString5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 14, null);
        String str = null;
        ipoAccessListKey = new RhList(CuratedList.INSTANCE.getFUTURE_IPOS_LIST_ID(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 14, null);
        UUID uuidFromString6 = UUID.fromString(FUTURES_LIST_ID);
        Intrinsics.checkNotNullExpressionValue(uuidFromString6, "fromString(...)");
        futuresListKey = new RhList(uuidFromString6, 0 == true ? 1 : 0, str, null, 14, null);
    }
}
