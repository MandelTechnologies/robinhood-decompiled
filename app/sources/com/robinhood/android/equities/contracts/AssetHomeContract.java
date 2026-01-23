package com.robinhood.android.equities.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.rosetta.eventlogging.PortfolioAccountType;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/AssetHomeContract;", "", "Key", "AssetType", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface AssetHomeContract {

    /* compiled from: AssetHomeContract.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eB7\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u000f\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J?\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/AssetHomeContract$Key;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "accountNumber", "", "portfolioAccountType", "Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;", "assetType", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;Lcom/robinhood/android/models/portfolio/api/AssetType;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/navigation/keys/FragmentTab;)V", "Lcom/robinhood/android/equities/contracts/AssetHomeContract$AssetType;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;Lcom/robinhood/android/equities/contracts/AssetHomeContract$AssetType;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/navigation/keys/FragmentTab;)V", "getAccountNumber", "()Ljava/lang/String;", "getPortfolioAccountType", "()Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;", "getAssetType", "()Lcom/robinhood/android/models/portfolio/api/AssetType;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements Parcelable, TabFragmentKey {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final String accountNumber;
        private final com.robinhood.android.models.portfolio.api.AssetType assetType;
        private final FragmentTab defaultTab;
        private final PortfolioAccountType portfolioAccountType;
        private final Screen sourceScreen;

        /* compiled from: AssetHomeContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key(parcel.readString(), PortfolioAccountType.valueOf(parcel.readString()), com.robinhood.android.models.portfolio.api.AssetType.valueOf(parcel.readString()), (Screen) parcel.readSerializable(), FragmentTab.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, String str, PortfolioAccountType portfolioAccountType, com.robinhood.android.models.portfolio.api.AssetType assetType, Screen screen, FragmentTab fragmentTab, int i, Object obj) {
            if ((i & 1) != 0) {
                str = key.accountNumber;
            }
            if ((i & 2) != 0) {
                portfolioAccountType = key.portfolioAccountType;
            }
            if ((i & 4) != 0) {
                assetType = key.assetType;
            }
            if ((i & 8) != 0) {
                screen = key.sourceScreen;
            }
            if ((i & 16) != 0) {
                fragmentTab = key.defaultTab;
            }
            FragmentTab fragmentTab2 = fragmentTab;
            com.robinhood.android.models.portfolio.api.AssetType assetType2 = assetType;
            return key.copy(str, portfolioAccountType, assetType2, screen, fragmentTab2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final PortfolioAccountType getPortfolioAccountType() {
            return this.portfolioAccountType;
        }

        /* renamed from: component3, reason: from getter */
        public final com.robinhood.android.models.portfolio.api.AssetType getAssetType() {
            return this.assetType;
        }

        /* renamed from: component4, reason: from getter */
        public final Screen getSourceScreen() {
            return this.sourceScreen;
        }

        /* renamed from: component5, reason: from getter */
        public final FragmentTab getDefaultTab() {
            return this.defaultTab;
        }

        public final Key copy(String accountNumber, PortfolioAccountType portfolioAccountType, com.robinhood.android.models.portfolio.api.AssetType assetType, Screen sourceScreen, FragmentTab defaultTab) {
            Intrinsics.checkNotNullParameter(portfolioAccountType, "portfolioAccountType");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
            return new Key(accountNumber, portfolioAccountType, assetType, sourceScreen, defaultTab);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.accountNumber, key.accountNumber) && this.portfolioAccountType == key.portfolioAccountType && this.assetType == key.assetType && Intrinsics.areEqual(this.sourceScreen, key.sourceScreen) && this.defaultTab == key.defaultTab;
        }

        public int hashCode() {
            String str = this.accountNumber;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.portfolioAccountType.hashCode()) * 31) + this.assetType.hashCode()) * 31;
            Screen screen = this.sourceScreen;
            return ((iHashCode + (screen != null ? screen.hashCode() : 0)) * 31) + this.defaultTab.hashCode();
        }

        public String toString() {
            return "Key(accountNumber=" + this.accountNumber + ", portfolioAccountType=" + this.portfolioAccountType + ", assetType=" + this.assetType + ", sourceScreen=" + this.sourceScreen + ", defaultTab=" + this.defaultTab + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.portfolioAccountType.name());
            dest.writeString(this.assetType.name());
            dest.writeSerializable(this.sourceScreen);
            dest.writeString(this.defaultTab.name());
        }

        public Key(String str, PortfolioAccountType portfolioAccountType, com.robinhood.android.models.portfolio.api.AssetType assetType, Screen screen, FragmentTab defaultTab) {
            Intrinsics.checkNotNullParameter(portfolioAccountType, "portfolioAccountType");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
            this.accountNumber = str;
            this.portfolioAccountType = portfolioAccountType;
            this.assetType = assetType;
            this.sourceScreen = screen;
            this.defaultTab = defaultTab;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final PortfolioAccountType getPortfolioAccountType() {
            return this.portfolioAccountType;
        }

        public final com.robinhood.android.models.portfolio.api.AssetType getAssetType() {
            return this.assetType;
        }

        public final Screen getSourceScreen() {
            return this.sourceScreen;
        }

        public /* synthetic */ Key(String str, PortfolioAccountType portfolioAccountType, com.robinhood.android.models.portfolio.api.AssetType assetType, Screen screen, FragmentTab fragmentTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, portfolioAccountType, assetType, screen, (i & 16) != 0 ? FragmentTab.HOME : fragmentTab);
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return this.defaultTab;
        }

        public /* synthetic */ Key(String str, PortfolioAccountType portfolioAccountType, AssetType assetType, Screen screen, FragmentTab fragmentTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, portfolioAccountType, assetType, screen, (i & 16) != 0 ? FragmentTab.HOME : fragmentTab);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Key(String str, PortfolioAccountType portfolioAccountType, AssetType assetType, Screen screen, FragmentTab defaultTab) {
            this(str, portfolioAccountType, AssetHomeContract2.getApiType(assetType), screen, defaultTab);
            Intrinsics.checkNotNullParameter(portfolioAccountType, "portfolioAccountType");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssetHomeContract.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/AssetHomeContract$AssetType;", "", "<init>", "(Ljava/lang/String;I)V", "EQUITY", "OPTIONS", "FUTURES", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AssetType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AssetType[] $VALUES;
        public static final AssetType EQUITY = new AssetType("EQUITY", 0);
        public static final AssetType OPTIONS = new AssetType("OPTIONS", 1);
        public static final AssetType FUTURES = new AssetType("FUTURES", 2);

        private static final /* synthetic */ AssetType[] $values() {
            return new AssetType[]{EQUITY, OPTIONS, FUTURES};
        }

        public static EnumEntries<AssetType> getEntries() {
            return $ENTRIES;
        }

        private AssetType(String str, int i) {
        }

        static {
            AssetType[] assetTypeArr$values = $values();
            $VALUES = assetTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(assetTypeArr$values);
        }

        public static AssetType valueOf(String str) {
            return (AssetType) Enum.valueOf(AssetType.class, str);
        }

        public static AssetType[] values() {
            return (AssetType[]) $VALUES.clone();
        }
    }
}
