package com.robinhood.shared.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreCategories;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoExploreFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0005J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoExploreFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "categoriesResponse", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "selectedCategoryIndex", "", "title", "", "<init>", "(Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;ILjava/lang/String;)V", "getCategoriesResponse", "()Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "getSelectedCategoryIndex", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoExploreFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<CryptoExploreFragmentKey> CREATOR = new Creator();
    private final CryptoExploreCategories categoriesResponse;
    private final int selectedCategoryIndex;
    private final String title;

    /* compiled from: CryptoExploreFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoExploreFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoExploreFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoExploreFragmentKey((CryptoExploreCategories) parcel.readParcelable(CryptoExploreFragmentKey.class.getClassLoader()), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoExploreFragmentKey[] newArray(int i) {
            return new CryptoExploreFragmentKey[i];
        }
    }

    public static /* synthetic */ CryptoExploreFragmentKey copy$default(CryptoExploreFragmentKey cryptoExploreFragmentKey, CryptoExploreCategories cryptoExploreCategories, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cryptoExploreCategories = cryptoExploreFragmentKey.categoriesResponse;
        }
        if ((i2 & 2) != 0) {
            i = cryptoExploreFragmentKey.selectedCategoryIndex;
        }
        if ((i2 & 4) != 0) {
            str = cryptoExploreFragmentKey.title;
        }
        return cryptoExploreFragmentKey.copy(cryptoExploreCategories, i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoExploreCategories getCategoriesResponse() {
        return this.categoriesResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final CryptoExploreFragmentKey copy(CryptoExploreCategories categoriesResponse, int selectedCategoryIndex, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new CryptoExploreFragmentKey(categoriesResponse, selectedCategoryIndex, title);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoExploreFragmentKey)) {
            return false;
        }
        CryptoExploreFragmentKey cryptoExploreFragmentKey = (CryptoExploreFragmentKey) other;
        return Intrinsics.areEqual(this.categoriesResponse, cryptoExploreFragmentKey.categoriesResponse) && this.selectedCategoryIndex == cryptoExploreFragmentKey.selectedCategoryIndex && Intrinsics.areEqual(this.title, cryptoExploreFragmentKey.title);
    }

    public int hashCode() {
        CryptoExploreCategories cryptoExploreCategories = this.categoriesResponse;
        return ((((cryptoExploreCategories == null ? 0 : cryptoExploreCategories.hashCode()) * 31) + Integer.hashCode(this.selectedCategoryIndex)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "CryptoExploreFragmentKey(categoriesResponse=" + this.categoriesResponse + ", selectedCategoryIndex=" + this.selectedCategoryIndex + ", title=" + this.title + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.categoriesResponse, flags);
        dest.writeInt(this.selectedCategoryIndex);
        dest.writeString(this.title);
    }

    public CryptoExploreFragmentKey(CryptoExploreCategories cryptoExploreCategories, int i, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.categoriesResponse = cryptoExploreCategories;
        this.selectedCategoryIndex = i;
        this.title = title;
    }

    public final CryptoExploreCategories getCategoriesResponse() {
        return this.categoriesResponse;
    }

    public final int getSelectedCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    public final String getTitle() {
        return this.title;
    }
}
