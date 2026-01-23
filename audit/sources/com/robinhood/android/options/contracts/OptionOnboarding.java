package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboarding.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionOnboarding;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "accountInfo", "Lcom/robinhood/android/options/contracts/OptionOnboardingAccountInfo;", "source", "Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource;", "successDeeplink", "", "<init>", "(Lcom/robinhood/android/options/contracts/OptionOnboardingAccountInfo;Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource;Ljava/lang/String;)V", "getAccountInfo", "()Lcom/robinhood/android/options/contracts/OptionOnboardingAccountInfo;", "getSource", "()Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource;", "getSuccessDeeplink", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OptionOnboardingSource", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OptionOnboarding implements IntentKey, Parcelable {
    public static final Parcelable.Creator<OptionOnboarding> CREATOR = new Creator();
    private final OptionOnboarding2 accountInfo;
    private final OptionOnboardingSource source;
    private final String successDeeplink;

    /* compiled from: OptionOnboarding.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionOnboarding> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionOnboarding createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionOnboarding((OptionOnboarding2) parcel.readParcelable(OptionOnboarding.class.getClassLoader()), (OptionOnboardingSource) parcel.readParcelable(OptionOnboarding.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionOnboarding[] newArray(int i) {
            return new OptionOnboarding[i];
        }
    }

    public static /* synthetic */ OptionOnboarding copy$default(OptionOnboarding optionOnboarding, OptionOnboarding2 optionOnboarding2, OptionOnboardingSource optionOnboardingSource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            optionOnboarding2 = optionOnboarding.accountInfo;
        }
        if ((i & 2) != 0) {
            optionOnboardingSource = optionOnboarding.source;
        }
        if ((i & 4) != 0) {
            str = optionOnboarding.successDeeplink;
        }
        return optionOnboarding.copy(optionOnboarding2, optionOnboardingSource, str);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionOnboarding2 getAccountInfo() {
        return this.accountInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionOnboardingSource getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSuccessDeeplink() {
        return this.successDeeplink;
    }

    public final OptionOnboarding copy(OptionOnboarding2 accountInfo, OptionOnboardingSource source, String successDeeplink) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        Intrinsics.checkNotNullParameter(source, "source");
        return new OptionOnboarding(accountInfo, source, successDeeplink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboarding)) {
            return false;
        }
        OptionOnboarding optionOnboarding = (OptionOnboarding) other;
        return Intrinsics.areEqual(this.accountInfo, optionOnboarding.accountInfo) && Intrinsics.areEqual(this.source, optionOnboarding.source) && Intrinsics.areEqual(this.successDeeplink, optionOnboarding.successDeeplink);
    }

    public int hashCode() {
        int iHashCode = ((this.accountInfo.hashCode() * 31) + this.source.hashCode()) * 31;
        String str = this.successDeeplink;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OptionOnboarding(accountInfo=" + this.accountInfo + ", source=" + this.source + ", successDeeplink=" + this.successDeeplink + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.accountInfo, flags);
        dest.writeParcelable(this.source, flags);
        dest.writeString(this.successDeeplink);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public OptionOnboarding(OptionOnboarding2 accountInfo, OptionOnboardingSource source, String str) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        Intrinsics.checkNotNullParameter(source, "source");
        this.accountInfo = accountInfo;
        this.source = source;
        this.successDeeplink = str;
    }

    public /* synthetic */ OptionOnboarding(OptionOnboarding2 optionOnboarding2, OptionOnboardingSource optionOnboardingSource, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(optionOnboarding2, optionOnboardingSource, (i & 4) != 0 ? null : str);
    }

    public final OptionOnboarding2 getAccountInfo() {
        return this.accountInfo;
    }

    public final OptionOnboardingSource getSource() {
        return this.source;
    }

    public final String getSuccessDeeplink() {
        return this.successDeeplink;
    }

    /* compiled from: OptionOnboarding.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource;", "Landroid/os/Parcelable;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "isFromAcatsJointAccount", "", "()Z", "isFromSdp", "ServerDriven", "Legacy", "Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource$Legacy;", "Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource$ServerDriven;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static abstract class OptionOnboardingSource implements Parcelable {
        public /* synthetic */ OptionOnboardingSource(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getName();

        private OptionOnboardingSource() {
        }

        public final boolean isFromAcatsJointAccount() {
            return (this instanceof Legacy) && Intrinsics.areEqual(((Legacy) this).getName(), Legacy.SOURCE_ACATS_JOINT_ACCOUNT);
        }

        public final boolean isFromSdp() {
            return this instanceof ServerDriven;
        }

        /* compiled from: OptionOnboarding.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource$ServerDriven;", "Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource;", "name", "", "symbol", "uuid", "Ljava/util/UUID;", "chainUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;)V", "getName", "()Ljava/lang/String;", "getSymbol", "getUuid", "()Ljava/util/UUID;", "getChainUuid", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ServerDriven extends OptionOnboardingSource {
            public static final Parcelable.Creator<ServerDriven> CREATOR = new Creator();
            private final UUID chainUuid;
            private final String name;
            private final String symbol;
            private final UUID uuid;

            /* compiled from: OptionOnboarding.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ServerDriven> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ServerDriven createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ServerDriven(parcel.readString(), parcel.readString(), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ServerDriven[] newArray(int i) {
                    return new ServerDriven[i];
                }
            }

            public static /* synthetic */ ServerDriven copy$default(ServerDriven serverDriven, String str, String str2, UUID uuid, UUID uuid2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = serverDriven.name;
                }
                if ((i & 2) != 0) {
                    str2 = serverDriven.symbol;
                }
                if ((i & 4) != 0) {
                    uuid = serverDriven.uuid;
                }
                if ((i & 8) != 0) {
                    uuid2 = serverDriven.chainUuid;
                }
                return serverDriven.copy(str, str2, uuid, uuid2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            /* renamed from: component3, reason: from getter */
            public final UUID getUuid() {
                return this.uuid;
            }

            /* renamed from: component4, reason: from getter */
            public final UUID getChainUuid() {
                return this.chainUuid;
            }

            public final ServerDriven copy(String name, String symbol, UUID uuid, UUID chainUuid) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                return new ServerDriven(name, symbol, uuid, chainUuid);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServerDriven)) {
                    return false;
                }
                ServerDriven serverDriven = (ServerDriven) other;
                return Intrinsics.areEqual(this.name, serverDriven.name) && Intrinsics.areEqual(this.symbol, serverDriven.symbol) && Intrinsics.areEqual(this.uuid, serverDriven.uuid) && Intrinsics.areEqual(this.chainUuid, serverDriven.chainUuid);
            }

            public int hashCode() {
                int iHashCode = ((((this.name.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.uuid.hashCode()) * 31;
                UUID uuid = this.chainUuid;
                return iHashCode + (uuid == null ? 0 : uuid.hashCode());
            }

            public String toString() {
                return "ServerDriven(name=" + this.name + ", symbol=" + this.symbol + ", uuid=" + this.uuid + ", chainUuid=" + this.chainUuid + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.name);
                dest.writeString(this.symbol);
                dest.writeSerializable(this.uuid);
                dest.writeSerializable(this.chainUuid);
            }

            @Override // com.robinhood.android.options.contracts.OptionOnboarding.OptionOnboardingSource
            public String getName() {
                return this.name;
            }

            public final String getSymbol() {
                return this.symbol;
            }

            public final UUID getUuid() {
                return this.uuid;
            }

            public final UUID getChainUuid() {
                return this.chainUuid;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ServerDriven(String name, String symbol, UUID uuid, UUID uuid2) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                this.name = name;
                this.symbol = symbol;
                this.uuid = uuid;
                this.chainUuid = uuid2;
            }
        }

        /* compiled from: OptionOnboarding.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource$Legacy;", "Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "isFromPostTradeUpsell", "", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Legacy extends OptionOnboardingSource {
            public static final String SOURCE_ACATS = "acats-in";
            public static final String SOURCE_ACATS_JOINT_ACCOUNT = "acats-in-ja";
            public static final String SOURCE_POST_TRADE_UPSELL = "post_trade_upsell";
            private final String name;
            public static final Parcelable.Creator<Legacy> CREATOR = new Creator();

            /* compiled from: OptionOnboarding.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Legacy> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Legacy createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Legacy(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Legacy[] newArray(int i) {
                    return new Legacy[i];
                }
            }

            public static /* synthetic */ Legacy copy$default(Legacy legacy, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = legacy.name;
                }
                return legacy.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final Legacy copy(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return new Legacy(name);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Legacy) && Intrinsics.areEqual(this.name, ((Legacy) other).name);
            }

            public int hashCode() {
                return this.name.hashCode();
            }

            public String toString() {
                return "Legacy(name=" + this.name + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.name);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Legacy(String name) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                this.name = name;
            }

            @Override // com.robinhood.android.options.contracts.OptionOnboarding.OptionOnboardingSource
            public String getName() {
                return this.name;
            }

            public final boolean isFromPostTradeUpsell() {
                return Intrinsics.areEqual(getName(), SOURCE_POST_TRADE_UPSELL);
            }
        }
    }
}
