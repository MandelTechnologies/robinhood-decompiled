package com.robinhood.android.search.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.enums.RhEnum;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SearchFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002:;Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003Je\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020/HÖ\u0001J\t\u00104\u001a\u00020\u0006HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020/R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "listId", "Ljava/util/UUID;", "listDisplayName", "", "accountNumber", "source", "Lcom/robinhood/android/search/contracts/SearchFragmentKey$Source;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "targetSection", "Lcom/robinhood/android/search/contracts/SearchFragmentKey$TargetSection;", "shownInMainTab", "", "subpageId", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/search/contracts/SearchFragmentKey$Source;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/search/contracts/SearchFragmentKey$TargetSection;ZLjava/lang/String;)V", "getListId", "()Ljava/util/UUID;", "getListDisplayName", "()Ljava/lang/String;", "getAccountNumber", "getSource", "()Lcom/robinhood/android/search/contracts/SearchFragmentKey$Source;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getTargetSection", "()Lcom/robinhood/android/search/contracts/SearchFragmentKey$TargetSection;", "getShownInMainTab", "()Z", "getSubpageId", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Source", "TargetSection", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class SearchFragmentKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<SearchFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final String listDisplayName;
    private final UUID listId;
    private final boolean shownInMainTab;
    private final Source source;
    private final Screen sourceScreen;
    private final String subpageId;
    private final TargetSection targetSection;

    /* compiled from: SearchFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<SearchFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SearchFragmentKey((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), Source.valueOf(parcel.readString()), (Screen) parcel.readSerializable(), parcel.readInt() == 0 ? null : TargetSection.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchFragmentKey[] newArray(int i) {
            return new SearchFragmentKey[i];
        }
    }

    public SearchFragmentKey() {
        this(null, null, null, null, null, null, false, null, 255, null);
    }

    public static /* synthetic */ SearchFragmentKey copy$default(SearchFragmentKey searchFragmentKey, UUID uuid, String str, String str2, Source source, Screen screen, TargetSection targetSection, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = searchFragmentKey.listId;
        }
        if ((i & 2) != 0) {
            str = searchFragmentKey.listDisplayName;
        }
        if ((i & 4) != 0) {
            str2 = searchFragmentKey.accountNumber;
        }
        if ((i & 8) != 0) {
            source = searchFragmentKey.source;
        }
        if ((i & 16) != 0) {
            screen = searchFragmentKey.sourceScreen;
        }
        if ((i & 32) != 0) {
            targetSection = searchFragmentKey.targetSection;
        }
        if ((i & 64) != 0) {
            z = searchFragmentKey.shownInMainTab;
        }
        if ((i & 128) != 0) {
            str3 = searchFragmentKey.subpageId;
        }
        boolean z2 = z;
        String str4 = str3;
        Screen screen2 = screen;
        TargetSection targetSection2 = targetSection;
        return searchFragmentKey.copy(uuid, str, str2, source, screen2, targetSection2, z2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getListId() {
        return this.listId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getListDisplayName() {
        return this.listDisplayName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    /* renamed from: component5, reason: from getter */
    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    /* renamed from: component6, reason: from getter */
    public final TargetSection getTargetSection() {
        return this.targetSection;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShownInMainTab() {
        return this.shownInMainTab;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSubpageId() {
        return this.subpageId;
    }

    public final SearchFragmentKey copy(UUID listId, String listDisplayName, String accountNumber, Source source, Screen sourceScreen, TargetSection targetSection, boolean shownInMainTab, String subpageId) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new SearchFragmentKey(listId, listDisplayName, accountNumber, source, sourceScreen, targetSection, shownInMainTab, subpageId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchFragmentKey)) {
            return false;
        }
        SearchFragmentKey searchFragmentKey = (SearchFragmentKey) other;
        return Intrinsics.areEqual(this.listId, searchFragmentKey.listId) && Intrinsics.areEqual(this.listDisplayName, searchFragmentKey.listDisplayName) && Intrinsics.areEqual(this.accountNumber, searchFragmentKey.accountNumber) && this.source == searchFragmentKey.source && Intrinsics.areEqual(this.sourceScreen, searchFragmentKey.sourceScreen) && this.targetSection == searchFragmentKey.targetSection && this.shownInMainTab == searchFragmentKey.shownInMainTab && Intrinsics.areEqual(this.subpageId, searchFragmentKey.subpageId);
    }

    public int hashCode() {
        UUID uuid = this.listId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.listDisplayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accountNumber;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.source.hashCode()) * 31;
        Screen screen = this.sourceScreen;
        int iHashCode4 = (iHashCode3 + (screen == null ? 0 : screen.hashCode())) * 31;
        TargetSection targetSection = this.targetSection;
        int iHashCode5 = (((iHashCode4 + (targetSection == null ? 0 : targetSection.hashCode())) * 31) + Boolean.hashCode(this.shownInMainTab)) * 31;
        String str3 = this.subpageId;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SearchFragmentKey(listId=" + this.listId + ", listDisplayName=" + this.listDisplayName + ", accountNumber=" + this.accountNumber + ", source=" + this.source + ", sourceScreen=" + this.sourceScreen + ", targetSection=" + this.targetSection + ", shownInMainTab=" + this.shownInMainTab + ", subpageId=" + this.subpageId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.listId);
        dest.writeString(this.listDisplayName);
        dest.writeString(this.accountNumber);
        dest.writeString(this.source.name());
        dest.writeSerializable(this.sourceScreen);
        TargetSection targetSection = this.targetSection;
        if (targetSection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(targetSection.name());
        }
        dest.writeInt(this.shownInMainTab ? 1 : 0);
        dest.writeString(this.subpageId);
    }

    public SearchFragmentKey(UUID uuid, String str, String str2, Source source, Screen screen, TargetSection targetSection, boolean z, String str3) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.listId = uuid;
        this.listDisplayName = str;
        this.accountNumber = str2;
        this.source = source;
        this.sourceScreen = screen;
        this.targetSection = targetSection;
        this.shownInMainTab = z;
        this.subpageId = str3;
    }

    public final UUID getListId() {
        return this.listId;
    }

    public final String getListDisplayName() {
        return this.listDisplayName;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public /* synthetic */ SearchFragmentKey(UUID uuid, String str, String str2, Source source, Screen screen, TargetSection targetSection, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Source.UNIVERSAL : source, (i & 16) != 0 ? null : screen, (i & 32) != 0 ? null : targetSection, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str3);
    }

    public final Source getSource() {
        return this.source;
    }

    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    public final TargetSection getTargetSection() {
        return this.targetSection;
    }

    public final boolean getShownInMainTab() {
        return this.shownInMainTab;
    }

    public final String getSubpageId() {
        return this.subpageId;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.HOME;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchFragmentKey$Source;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNIVERSAL", "RETIREMENT", "JOINT_ACCOUNTS", "CRYPTO", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Source implements RhEnum<Source> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String serverValue;
        public static final Source UNIVERSAL = new Source("UNIVERSAL", 0, AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT);
        public static final Source RETIREMENT = new Source("RETIREMENT", 1, "retirement");
        public static final Source JOINT_ACCOUNTS = new Source("JOINT_ACCOUNTS", 2, "joint_accounts");
        public static final Source CRYPTO = new Source("CRYPTO", 3, "cypto");

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{UNIVERSAL, RETIREMENT, JOINT_ACCOUNTS, CRYPTO};
        }

        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        private Source(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: SearchFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchFragmentKey$Source$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Optional;", "Lcom/robinhood/android/search/contracts/SearchFragmentKey$Source;", "<init>", "()V", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion extends RhEnum.Converter.Optional<Source> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
                super((Enum[]) Source.getEntries().toArray(new Source[0]), false, 2, null);
            }
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchFragmentKey$TargetSection;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "MARKET_INDICATORS", "LISTS_CHIP_GRID", "EDUCATION_CAROUSEL", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class TargetSection implements RhEnum<TargetSection> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TargetSection[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String serverValue;
        public static final TargetSection MARKET_INDICATORS = new TargetSection("MARKET_INDICATORS", 0, "market_indicators");
        public static final TargetSection LISTS_CHIP_GRID = new TargetSection("LISTS_CHIP_GRID", 1, "lists_chip_grid");
        public static final TargetSection EDUCATION_CAROUSEL = new TargetSection("EDUCATION_CAROUSEL", 2, "education_carousel");

        private static final /* synthetic */ TargetSection[] $values() {
            return new TargetSection[]{MARKET_INDICATORS, LISTS_CHIP_GRID, EDUCATION_CAROUSEL};
        }

        public static EnumEntries<TargetSection> getEntries() {
            return $ENTRIES;
        }

        private TargetSection(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            TargetSection[] targetSectionArr$values = $values();
            $VALUES = targetSectionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(targetSectionArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: SearchFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchFragmentKey$TargetSection$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Optional;", "Lcom/robinhood/android/search/contracts/SearchFragmentKey$TargetSection;", "<init>", "()V", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion extends RhEnum.Converter.Optional<TargetSection> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
                super(TargetSection.values(), false, 2, null);
            }
        }

        public static TargetSection valueOf(String str) {
            return (TargetSection) Enum.valueOf(TargetSection.class, str);
        }

        public static TargetSection[] values() {
            return (TargetSection[]) $VALUES.clone();
        }
    }
}
