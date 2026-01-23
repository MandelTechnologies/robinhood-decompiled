package com.robinhood.shared.portfolio.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.p320db.Security;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddToListsBottomSheetKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/contracts/AddToListsBottomSheetKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "security", "Lcom/robinhood/models/db/Security;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "forceNightTheme", "", "isSingleSelect", "<init>", "(Lcom/robinhood/models/db/Security;Lcom/robinhood/rosetta/eventlogging/Screen;ZZ)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getForceNightTheme", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class AddToListsBottomSheetKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<AddToListsBottomSheetKey> CREATOR = new Creator();
    private final Screen eventScreen;
    private final boolean forceNightTheme;
    private final boolean isSingleSelect;
    private final Security security;

    /* compiled from: AddToListsBottomSheetKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<AddToListsBottomSheetKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddToListsBottomSheetKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddToListsBottomSheetKey((Security) parcel.readParcelable(AddToListsBottomSheetKey.class.getClassLoader()), (Screen) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddToListsBottomSheetKey[] newArray(int i) {
            return new AddToListsBottomSheetKey[i];
        }
    }

    public static /* synthetic */ AddToListsBottomSheetKey copy$default(AddToListsBottomSheetKey addToListsBottomSheetKey, Security security, Screen screen, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            security = addToListsBottomSheetKey.security;
        }
        if ((i & 2) != 0) {
            screen = addToListsBottomSheetKey.eventScreen;
        }
        if ((i & 4) != 0) {
            z = addToListsBottomSheetKey.forceNightTheme;
        }
        if ((i & 8) != 0) {
            z2 = addToListsBottomSheetKey.isSingleSelect;
        }
        return addToListsBottomSheetKey.copy(security, screen, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final Security getSecurity() {
        return this.security;
    }

    /* renamed from: component2, reason: from getter */
    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getForceNightTheme() {
        return this.forceNightTheme;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSingleSelect() {
        return this.isSingleSelect;
    }

    public final AddToListsBottomSheetKey copy(Security security, Screen eventScreen, boolean forceNightTheme, boolean isSingleSelect) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        return new AddToListsBottomSheetKey(security, eventScreen, forceNightTheme, isSingleSelect);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToListsBottomSheetKey)) {
            return false;
        }
        AddToListsBottomSheetKey addToListsBottomSheetKey = (AddToListsBottomSheetKey) other;
        return Intrinsics.areEqual(this.security, addToListsBottomSheetKey.security) && Intrinsics.areEqual(this.eventScreen, addToListsBottomSheetKey.eventScreen) && this.forceNightTheme == addToListsBottomSheetKey.forceNightTheme && this.isSingleSelect == addToListsBottomSheetKey.isSingleSelect;
    }

    public int hashCode() {
        return (((((this.security.hashCode() * 31) + this.eventScreen.hashCode()) * 31) + Boolean.hashCode(this.forceNightTheme)) * 31) + Boolean.hashCode(this.isSingleSelect);
    }

    public String toString() {
        return "AddToListsBottomSheetKey(security=" + this.security + ", eventScreen=" + this.eventScreen + ", forceNightTheme=" + this.forceNightTheme + ", isSingleSelect=" + this.isSingleSelect + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.security, flags);
        dest.writeSerializable(this.eventScreen);
        dest.writeInt(this.forceNightTheme ? 1 : 0);
        dest.writeInt(this.isSingleSelect ? 1 : 0);
    }

    public AddToListsBottomSheetKey(Security security, Screen eventScreen, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        this.security = security;
        this.eventScreen = eventScreen;
        this.forceNightTheme = z;
        this.isSingleSelect = z2;
    }

    public /* synthetic */ AddToListsBottomSheetKey(Security security, Screen screen, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(security, screen, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final Security getSecurity() {
        return this.security;
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    public final boolean getForceNightTheme() {
        return this.forceNightTheme;
    }

    public final boolean isSingleSelect() {
        return this.isSingleSelect;
    }
}
