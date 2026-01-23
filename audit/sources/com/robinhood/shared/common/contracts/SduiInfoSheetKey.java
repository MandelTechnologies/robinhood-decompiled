package com.robinhood.shared.common.contracts;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiInfoSheetKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/SduiInfoSheetKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "componentLoggingIdentifier", "", "sheetId", "params", "Landroid/net/Uri;", "sheetLoggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getComponentLoggingIdentifier", "()Ljava/lang/String;", "getSheetId", "getParams", "()Landroid/net/Uri;", "getSheetLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class SduiInfoSheetKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<SduiInfoSheetKey> CREATOR = new Creator();
    private final String componentLoggingIdentifier;
    private final Uri params;
    private final String sheetId;
    private final Screen sheetLoggingScreen;

    /* compiled from: SduiInfoSheetKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<SduiInfoSheetKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SduiInfoSheetKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SduiInfoSheetKey(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(SduiInfoSheetKey.class.getClassLoader()), (Screen) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SduiInfoSheetKey[] newArray(int i) {
            return new SduiInfoSheetKey[i];
        }
    }

    public static /* synthetic */ SduiInfoSheetKey copy$default(SduiInfoSheetKey sduiInfoSheetKey, String str, String str2, Uri uri, Screen screen, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sduiInfoSheetKey.componentLoggingIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = sduiInfoSheetKey.sheetId;
        }
        if ((i & 4) != 0) {
            uri = sduiInfoSheetKey.params;
        }
        if ((i & 8) != 0) {
            screen = sduiInfoSheetKey.sheetLoggingScreen;
        }
        return sduiInfoSheetKey.copy(str, str2, uri, screen);
    }

    /* renamed from: component1, reason: from getter */
    public final String getComponentLoggingIdentifier() {
        return this.componentLoggingIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSheetId() {
        return this.sheetId;
    }

    /* renamed from: component3, reason: from getter */
    public final Uri getParams() {
        return this.params;
    }

    /* renamed from: component4, reason: from getter */
    public final Screen getSheetLoggingScreen() {
        return this.sheetLoggingScreen;
    }

    public final SduiInfoSheetKey copy(String componentLoggingIdentifier, String sheetId, Uri params, Screen sheetLoggingScreen) {
        Intrinsics.checkNotNullParameter(componentLoggingIdentifier, "componentLoggingIdentifier");
        Intrinsics.checkNotNullParameter(sheetId, "sheetId");
        Intrinsics.checkNotNullParameter(params, "params");
        return new SduiInfoSheetKey(componentLoggingIdentifier, sheetId, params, sheetLoggingScreen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInfoSheetKey)) {
            return false;
        }
        SduiInfoSheetKey sduiInfoSheetKey = (SduiInfoSheetKey) other;
        return Intrinsics.areEqual(this.componentLoggingIdentifier, sduiInfoSheetKey.componentLoggingIdentifier) && Intrinsics.areEqual(this.sheetId, sduiInfoSheetKey.sheetId) && Intrinsics.areEqual(this.params, sduiInfoSheetKey.params) && Intrinsics.areEqual(this.sheetLoggingScreen, sduiInfoSheetKey.sheetLoggingScreen);
    }

    public int hashCode() {
        int iHashCode = ((((this.componentLoggingIdentifier.hashCode() * 31) + this.sheetId.hashCode()) * 31) + this.params.hashCode()) * 31;
        Screen screen = this.sheetLoggingScreen;
        return iHashCode + (screen == null ? 0 : screen.hashCode());
    }

    public String toString() {
        return "SduiInfoSheetKey(componentLoggingIdentifier=" + this.componentLoggingIdentifier + ", sheetId=" + this.sheetId + ", params=" + this.params + ", sheetLoggingScreen=" + this.sheetLoggingScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.componentLoggingIdentifier);
        dest.writeString(this.sheetId);
        dest.writeParcelable(this.params, flags);
        dest.writeSerializable(this.sheetLoggingScreen);
    }

    public SduiInfoSheetKey(String componentLoggingIdentifier, String sheetId, Uri params, Screen screen) {
        Intrinsics.checkNotNullParameter(componentLoggingIdentifier, "componentLoggingIdentifier");
        Intrinsics.checkNotNullParameter(sheetId, "sheetId");
        Intrinsics.checkNotNullParameter(params, "params");
        this.componentLoggingIdentifier = componentLoggingIdentifier;
        this.sheetId = sheetId;
        this.params = params;
        this.sheetLoggingScreen = screen;
    }

    public final String getComponentLoggingIdentifier() {
        return this.componentLoggingIdentifier;
    }

    public final String getSheetId() {
        return this.sheetId;
    }

    public /* synthetic */ SduiInfoSheetKey(String str, String str2, Uri uri, Screen screen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? Uri.EMPTY : uri, (i & 8) != 0 ? null : screen);
    }

    public final Uri getParams() {
        return this.params;
    }

    public final Screen getSheetLoggingScreen() {
        return this.sheetLoggingScreen;
    }
}
