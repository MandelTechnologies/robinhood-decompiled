package com.robinhood.android.education.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeed.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/education/contracts/NewsFeed;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "hideSearch", "", "targetSection", "Lcom/robinhood/android/education/contracts/NewsFeed$TargetSection;", "<init>", "(ZLcom/robinhood/android/education/contracts/NewsFeed$TargetSection;)V", "getHideSearch", "()Z", "getTargetSection", "()Lcom/robinhood/android/education/contracts/NewsFeed$TargetSection;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TargetSection", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NewsFeed implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<NewsFeed> CREATOR = new Creator();
    private final boolean hideSearch;
    private final TargetSection targetSection;

    /* compiled from: NewsFeed.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<NewsFeed> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsFeed createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewsFeed(parcel.readInt() != 0, parcel.readInt() == 0 ? null : TargetSection.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsFeed[] newArray(int i) {
            return new NewsFeed[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsFeed() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NewsFeed copy$default(NewsFeed newsFeed, boolean z, TargetSection targetSection, int i, Object obj) {
        if ((i & 1) != 0) {
            z = newsFeed.hideSearch;
        }
        if ((i & 2) != 0) {
            targetSection = newsFeed.targetSection;
        }
        return newsFeed.copy(z, targetSection);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHideSearch() {
        return this.hideSearch;
    }

    /* renamed from: component2, reason: from getter */
    public final TargetSection getTargetSection() {
        return this.targetSection;
    }

    public final NewsFeed copy(boolean hideSearch, TargetSection targetSection) {
        return new NewsFeed(hideSearch, targetSection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsFeed)) {
            return false;
        }
        NewsFeed newsFeed = (NewsFeed) other;
        return this.hideSearch == newsFeed.hideSearch && this.targetSection == newsFeed.targetSection;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hideSearch) * 31;
        TargetSection targetSection = this.targetSection;
        return iHashCode + (targetSection == null ? 0 : targetSection.hashCode());
    }

    public String toString() {
        return "NewsFeed(hideSearch=" + this.hideSearch + ", targetSection=" + this.targetSection + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.hideSearch ? 1 : 0);
        TargetSection targetSection = this.targetSection;
        if (targetSection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(targetSection.name());
        }
    }

    public NewsFeed(boolean z, TargetSection targetSection) {
        this.hideSearch = z;
        this.targetSection = targetSection;
    }

    public /* synthetic */ NewsFeed(boolean z, TargetSection targetSection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : targetSection);
    }

    public final boolean getHideSearch() {
        return this.hideSearch;
    }

    public final TargetSection getTargetSection() {
        return this.targetSection;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.BROWSE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsFeed.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/education/contracts/NewsFeed$TargetSection;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "MARKET_INDICATORS", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class TargetSection implements RhEnum<TargetSection> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TargetSection[] $VALUES;
        public static final TargetSection MARKET_INDICATORS = new TargetSection("MARKET_INDICATORS", 0, "market_indicators");
        private final String serverValue;

        private static final /* synthetic */ TargetSection[] $values() {
            return new TargetSection[]{MARKET_INDICATORS};
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

        public static TargetSection valueOf(String str) {
            return (TargetSection) Enum.valueOf(TargetSection.class, str);
        }

        public static TargetSection[] values() {
            return (TargetSection[]) $VALUES.clone();
        }
    }
}
