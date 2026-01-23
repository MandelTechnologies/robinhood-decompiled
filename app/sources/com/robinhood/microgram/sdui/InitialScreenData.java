package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitialScreenData.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/InitialScreenData;", "Landroid/os/Parcelable;", "routerIdentifier", "", "screenIdentifier", "screenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "encodedInitialContent", "theme", "Lcom/robinhood/microgram/sdui/Theme;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/microgram/sdui/ScreenType;Ljava/lang/String;Lcom/robinhood/microgram/sdui/Theme;)V", "getRouterIdentifier", "()Ljava/lang/String;", "getScreenIdentifier", "getScreenType", "()Lcom/robinhood/microgram/sdui/ScreenType;", "getEncodedInitialContent", "getTheme", "()Lcom/robinhood/microgram/sdui/Theme;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InitialScreenData implements Parcelable {
    public static final Parcelable.Creator<InitialScreenData> CREATOR = new Creator();
    private final String encodedInitialContent;
    private final String routerIdentifier;
    private final String screenIdentifier;
    private final RouterMessage5 screenType;
    private final StandardScreen5 theme;

    /* compiled from: InitialScreenData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InitialScreenData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InitialScreenData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InitialScreenData(parcel.readString(), parcel.readString(), RouterMessage5.valueOf(parcel.readString()), parcel.readString(), StandardScreen5.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InitialScreenData[] newArray(int i) {
            return new InitialScreenData[i];
        }
    }

    public static /* synthetic */ InitialScreenData copy$default(InitialScreenData initialScreenData, String str, String str2, RouterMessage5 routerMessage5, String str3, StandardScreen5 standardScreen5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initialScreenData.routerIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = initialScreenData.screenIdentifier;
        }
        if ((i & 4) != 0) {
            routerMessage5 = initialScreenData.screenType;
        }
        if ((i & 8) != 0) {
            str3 = initialScreenData.encodedInitialContent;
        }
        if ((i & 16) != 0) {
            standardScreen5 = initialScreenData.theme;
        }
        StandardScreen5 standardScreen52 = standardScreen5;
        RouterMessage5 routerMessage52 = routerMessage5;
        return initialScreenData.copy(str, str2, routerMessage52, str3, standardScreen52);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRouterIdentifier() {
        return this.routerIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScreenIdentifier() {
        return this.screenIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final RouterMessage5 getScreenType() {
        return this.screenType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEncodedInitialContent() {
        return this.encodedInitialContent;
    }

    /* renamed from: component5, reason: from getter */
    public final StandardScreen5 getTheme() {
        return this.theme;
    }

    public final InitialScreenData copy(String routerIdentifier, String screenIdentifier, RouterMessage5 screenType, String encodedInitialContent, StandardScreen5 theme) {
        Intrinsics.checkNotNullParameter(routerIdentifier, "routerIdentifier");
        Intrinsics.checkNotNullParameter(screenIdentifier, "screenIdentifier");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new InitialScreenData(routerIdentifier, screenIdentifier, screenType, encodedInitialContent, theme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitialScreenData)) {
            return false;
        }
        InitialScreenData initialScreenData = (InitialScreenData) other;
        return Intrinsics.areEqual(this.routerIdentifier, initialScreenData.routerIdentifier) && Intrinsics.areEqual(this.screenIdentifier, initialScreenData.screenIdentifier) && this.screenType == initialScreenData.screenType && Intrinsics.areEqual(this.encodedInitialContent, initialScreenData.encodedInitialContent) && this.theme == initialScreenData.theme;
    }

    public int hashCode() {
        return (((((((this.routerIdentifier.hashCode() * 31) + this.screenIdentifier.hashCode()) * 31) + this.screenType.hashCode()) * 31) + this.encodedInitialContent.hashCode()) * 31) + this.theme.hashCode();
    }

    public String toString() {
        return "InitialScreenData(routerIdentifier=" + this.routerIdentifier + ", screenIdentifier=" + this.screenIdentifier + ", screenType=" + this.screenType + ", encodedInitialContent=" + this.encodedInitialContent + ", theme=" + this.theme + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.routerIdentifier);
        dest.writeString(this.screenIdentifier);
        dest.writeString(this.screenType.name());
        dest.writeString(this.encodedInitialContent);
        dest.writeString(this.theme.name());
    }

    public InitialScreenData(String routerIdentifier, String screenIdentifier, RouterMessage5 screenType, String encodedInitialContent, StandardScreen5 theme) {
        Intrinsics.checkNotNullParameter(routerIdentifier, "routerIdentifier");
        Intrinsics.checkNotNullParameter(screenIdentifier, "screenIdentifier");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.routerIdentifier = routerIdentifier;
        this.screenIdentifier = screenIdentifier;
        this.screenType = screenType;
        this.encodedInitialContent = encodedInitialContent;
        this.theme = theme;
    }

    public final String getRouterIdentifier() {
        return this.routerIdentifier;
    }

    public final String getScreenIdentifier() {
        return this.screenIdentifier;
    }

    public final RouterMessage5 getScreenType() {
        return this.screenType;
    }

    public final String getEncodedInitialContent() {
        return this.encodedInitialContent;
    }

    public final StandardScreen5 getTheme() {
        return this.theme;
    }
}
