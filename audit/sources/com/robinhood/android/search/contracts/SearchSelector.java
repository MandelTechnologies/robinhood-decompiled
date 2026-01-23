package com.robinhood.android.search.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchSelectorKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/SearchSelector;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "searchSelectorLaunchMode", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "entryPointIdentifier", "", "<init>", "(Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;)V", "getSearchSelectorLaunchMode", "()Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getEntryPointIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchSelector implements FragmentKey {
    public static final Parcelable.Creator<SearchSelector> CREATOR = new Creator();
    private final String entryPointIdentifier;
    private final Screen screen;
    private final SearchSelectorLaunchMode searchSelectorLaunchMode;

    /* compiled from: SearchSelectorKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SearchSelector> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchSelector createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SearchSelector((SearchSelectorLaunchMode) parcel.readParcelable(SearchSelector.class.getClassLoader()), (Screen) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchSelector[] newArray(int i) {
            return new SearchSelector[i];
        }
    }

    public static /* synthetic */ SearchSelector copy$default(SearchSelector searchSelector, SearchSelectorLaunchMode searchSelectorLaunchMode, Screen screen, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            searchSelectorLaunchMode = searchSelector.searchSelectorLaunchMode;
        }
        if ((i & 2) != 0) {
            screen = searchSelector.screen;
        }
        if ((i & 4) != 0) {
            str = searchSelector.entryPointIdentifier;
        }
        return searchSelector.copy(searchSelectorLaunchMode, screen, str);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchSelectorLaunchMode getSearchSelectorLaunchMode() {
        return this.searchSelectorLaunchMode;
    }

    /* renamed from: component2, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public final SearchSelector copy(SearchSelectorLaunchMode searchSelectorLaunchMode, Screen screen, String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(searchSelectorLaunchMode, "searchSelectorLaunchMode");
        return new SearchSelector(searchSelectorLaunchMode, screen, entryPointIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchSelector)) {
            return false;
        }
        SearchSelector searchSelector = (SearchSelector) other;
        return Intrinsics.areEqual(this.searchSelectorLaunchMode, searchSelector.searchSelectorLaunchMode) && Intrinsics.areEqual(this.screen, searchSelector.screen) && Intrinsics.areEqual(this.entryPointIdentifier, searchSelector.entryPointIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.searchSelectorLaunchMode.hashCode() * 31;
        Screen screen = this.screen;
        int iHashCode2 = (iHashCode + (screen == null ? 0 : screen.hashCode())) * 31;
        String str = this.entryPointIdentifier;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SearchSelector(searchSelectorLaunchMode=" + this.searchSelectorLaunchMode + ", screen=" + this.screen + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.searchSelectorLaunchMode, flags);
        dest.writeSerializable(this.screen);
        dest.writeString(this.entryPointIdentifier);
    }

    public SearchSelector(SearchSelectorLaunchMode searchSelectorLaunchMode, Screen screen, String str) {
        Intrinsics.checkNotNullParameter(searchSelectorLaunchMode, "searchSelectorLaunchMode");
        this.searchSelectorLaunchMode = searchSelectorLaunchMode;
        this.screen = screen;
        this.entryPointIdentifier = str;
    }

    public /* synthetic */ SearchSelector(SearchSelectorLaunchMode searchSelectorLaunchMode, Screen screen, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(searchSelectorLaunchMode, (i & 2) != 0 ? null : screen, (i & 4) != 0 ? null : str);
    }

    public final SearchSelectorLaunchMode getSearchSelectorLaunchMode() {
        return this.searchSelectorLaunchMode;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }
}
