package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StandardScreen.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tHÆ\u0003J\u0015\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tHÆ\u0003J\u0015\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0003J¼\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010?J\u0006\u0010@\u001a\u00020\u0011J\u0013\u0010A\u001a\u00020\u00052\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\u0011HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\u0016\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006K"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/StandardScreen;", "Landroid/os/Parcelable;", "title", "", "hidesBackButton", "", "navConfig", "Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;", "header", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/microgram/sdui/MicrogramAction;", CarResultComposable2.BODY, Footer.f10637type, "theme", "Lcom/robinhood/microgram/sdui/Theme;", "rosettaScreenId", "", "identifier", "backgroundColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/microgram/sdui/LoggingContext;", "androidAttributes", "Lcom/robinhood/microgram/sdui/AndroidAttributes;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/microgram/sdui/Theme;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Lcom/robinhood/microgram/sdui/LoggingContext;Lcom/robinhood/microgram/sdui/AndroidAttributes;)V", "getTitle", "()Ljava/lang/String;", "getHidesBackButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNavConfig", "()Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;", "getHeader", "()Ljava/util/List;", "getBody", "getFooter", "getTheme", "()Lcom/robinhood/microgram/sdui/Theme;", "getRosettaScreenId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIdentifier", "getBackgroundColor", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "getLoggingContext", "()Lcom/robinhood/microgram/sdui/LoggingContext;", "getAndroidAttributes", "()Lcom/robinhood/microgram/sdui/AndroidAttributes;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/microgram/sdui/Theme;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Lcom/robinhood/microgram/sdui/LoggingContext;Lcom/robinhood/microgram/sdui/AndroidAttributes;)Lcom/robinhood/microgram/sdui/StandardScreen;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StandardScreen implements Parcelable {
    public static final Parcelable.Creator<StandardScreen> CREATOR = new Creator();
    private final AndroidAttributes androidAttributes;
    private final ThemedColor backgroundColor;
    private final List<UIComponent<MicrogramAction>> body;
    private final List<UIComponent<MicrogramAction>> footer;
    private final List<UIComponent<MicrogramAction>> header;
    private final Boolean hidesBackButton;
    private final String identifier;
    private final LoggingContext loggingContext;
    private final NavigationBarConfiguration navConfig;
    private final Integer rosettaScreenId;
    private final StandardScreen5 theme;
    private final String title;

    /* compiled from: StandardScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<StandardScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StandardScreen createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            NavigationBarConfiguration standardScreen3CreateFromParcel = parcel.readInt() == 0 ? null : NavigationBarConfiguration.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(StandardScreen.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(StandardScreen.class.getClassLoader()));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(parcel.readParcelable(StandardScreen.class.getClassLoader()));
            }
            return new StandardScreen(string2, boolValueOf, standardScreen3CreateFromParcel, arrayList, arrayList2, arrayList3, parcel.readInt() == 0 ? null : StandardScreen5.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (ThemedColor) parcel.readParcelable(StandardScreen.class.getClassLoader()), parcel.readInt() == 0 ? null : LoggingContext.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AndroidAttributes.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StandardScreen[] newArray(int i) {
            return new StandardScreen[i];
        }
    }

    public StandardScreen() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ StandardScreen copy$default(StandardScreen standardScreen, String str, Boolean bool, NavigationBarConfiguration standardScreen3, List list, List list2, List list3, StandardScreen5 standardScreen5, Integer num, String str2, ThemedColor themedColor, LoggingContext loggingContext, AndroidAttributes androidAttributes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = standardScreen.title;
        }
        if ((i & 2) != 0) {
            bool = standardScreen.hidesBackButton;
        }
        if ((i & 4) != 0) {
            standardScreen3 = standardScreen.navConfig;
        }
        if ((i & 8) != 0) {
            list = standardScreen.header;
        }
        if ((i & 16) != 0) {
            list2 = standardScreen.body;
        }
        if ((i & 32) != 0) {
            list3 = standardScreen.footer;
        }
        if ((i & 64) != 0) {
            standardScreen5 = standardScreen.theme;
        }
        if ((i & 128) != 0) {
            num = standardScreen.rosettaScreenId;
        }
        if ((i & 256) != 0) {
            str2 = standardScreen.identifier;
        }
        if ((i & 512) != 0) {
            themedColor = standardScreen.backgroundColor;
        }
        if ((i & 1024) != 0) {
            loggingContext = standardScreen.loggingContext;
        }
        if ((i & 2048) != 0) {
            androidAttributes = standardScreen.androidAttributes;
        }
        LoggingContext loggingContext2 = loggingContext;
        AndroidAttributes androidAttributes2 = androidAttributes;
        String str3 = str2;
        ThemedColor themedColor2 = themedColor;
        StandardScreen5 standardScreen52 = standardScreen5;
        Integer num2 = num;
        List list4 = list2;
        List list5 = list3;
        return standardScreen.copy(str, bool, standardScreen3, list, list4, list5, standardScreen52, num2, str3, themedColor2, loggingContext2, androidAttributes2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final ThemedColor getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component11, reason: from getter */
    public final LoggingContext getLoggingContext() {
        return this.loggingContext;
    }

    /* renamed from: component12, reason: from getter */
    public final AndroidAttributes getAndroidAttributes() {
        return this.androidAttributes;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHidesBackButton() {
        return this.hidesBackButton;
    }

    /* renamed from: component3, reason: from getter */
    public final NavigationBarConfiguration getNavConfig() {
        return this.navConfig;
    }

    public final List<UIComponent<MicrogramAction>> component4() {
        return this.header;
    }

    public final List<UIComponent<MicrogramAction>> component5() {
        return this.body;
    }

    public final List<UIComponent<MicrogramAction>> component6() {
        return this.footer;
    }

    /* renamed from: component7, reason: from getter */
    public final StandardScreen5 getTheme() {
        return this.theme;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getRosettaScreenId() {
        return this.rosettaScreenId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    public final StandardScreen copy(String title, Boolean hidesBackButton, NavigationBarConfiguration navConfig, List<? extends UIComponent<MicrogramAction>> header, List<? extends UIComponent<MicrogramAction>> body, List<? extends UIComponent<MicrogramAction>> footer, StandardScreen5 theme, Integer rosettaScreenId, String identifier, ThemedColor backgroundColor, LoggingContext loggingContext, AndroidAttributes androidAttributes) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new StandardScreen(title, hidesBackButton, navConfig, header, body, footer, theme, rosettaScreenId, identifier, backgroundColor, loggingContext, androidAttributes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandardScreen)) {
            return false;
        }
        StandardScreen standardScreen = (StandardScreen) other;
        return Intrinsics.areEqual(this.title, standardScreen.title) && Intrinsics.areEqual(this.hidesBackButton, standardScreen.hidesBackButton) && Intrinsics.areEqual(this.navConfig, standardScreen.navConfig) && Intrinsics.areEqual(this.header, standardScreen.header) && Intrinsics.areEqual(this.body, standardScreen.body) && Intrinsics.areEqual(this.footer, standardScreen.footer) && this.theme == standardScreen.theme && Intrinsics.areEqual(this.rosettaScreenId, standardScreen.rosettaScreenId) && Intrinsics.areEqual(this.identifier, standardScreen.identifier) && Intrinsics.areEqual(this.backgroundColor, standardScreen.backgroundColor) && Intrinsics.areEqual(this.loggingContext, standardScreen.loggingContext) && Intrinsics.areEqual(this.androidAttributes, standardScreen.androidAttributes);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hidesBackButton;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        NavigationBarConfiguration standardScreen3 = this.navConfig;
        int iHashCode3 = (((((((iHashCode2 + (standardScreen3 == null ? 0 : standardScreen3.hashCode())) * 31) + this.header.hashCode()) * 31) + this.body.hashCode()) * 31) + this.footer.hashCode()) * 31;
        StandardScreen5 standardScreen5 = this.theme;
        int iHashCode4 = (iHashCode3 + (standardScreen5 == null ? 0 : standardScreen5.hashCode())) * 31;
        Integer num = this.rosettaScreenId;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.identifier;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThemedColor themedColor = this.backgroundColor;
        int iHashCode7 = (iHashCode6 + (themedColor == null ? 0 : themedColor.hashCode())) * 31;
        LoggingContext loggingContext = this.loggingContext;
        int iHashCode8 = (iHashCode7 + (loggingContext == null ? 0 : loggingContext.hashCode())) * 31;
        AndroidAttributes androidAttributes = this.androidAttributes;
        return iHashCode8 + (androidAttributes != null ? androidAttributes.hashCode() : 0);
    }

    public String toString() {
        return "StandardScreen(title=" + this.title + ", hidesBackButton=" + this.hidesBackButton + ", navConfig=" + this.navConfig + ", header=" + this.header + ", body=" + this.body + ", footer=" + this.footer + ", theme=" + this.theme + ", rosettaScreenId=" + this.rosettaScreenId + ", identifier=" + this.identifier + ", backgroundColor=" + this.backgroundColor + ", loggingContext=" + this.loggingContext + ", androidAttributes=" + this.androidAttributes + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        Boolean bool = this.hidesBackButton;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        NavigationBarConfiguration standardScreen3 = this.navConfig;
        if (standardScreen3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            standardScreen3.writeToParcel(dest, flags);
        }
        List<UIComponent<MicrogramAction>> list = this.header;
        dest.writeInt(list.size());
        Iterator<UIComponent<MicrogramAction>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        List<UIComponent<MicrogramAction>> list2 = this.body;
        dest.writeInt(list2.size());
        Iterator<UIComponent<MicrogramAction>> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        List<UIComponent<MicrogramAction>> list3 = this.footer;
        dest.writeInt(list3.size());
        Iterator<UIComponent<MicrogramAction>> it3 = list3.iterator();
        while (it3.hasNext()) {
            dest.writeParcelable(it3.next(), flags);
        }
        StandardScreen5 standardScreen5 = this.theme;
        if (standardScreen5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(standardScreen5.name());
        }
        Integer num = this.rosettaScreenId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.identifier);
        dest.writeParcelable(this.backgroundColor, flags);
        LoggingContext loggingContext = this.loggingContext;
        if (loggingContext == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            loggingContext.writeToParcel(dest, flags);
        }
        AndroidAttributes androidAttributes = this.androidAttributes;
        if (androidAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            androidAttributes.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StandardScreen(String str, Boolean bool, NavigationBarConfiguration standardScreen3, List<? extends UIComponent<MicrogramAction>> header, List<? extends UIComponent<MicrogramAction>> body, List<? extends UIComponent<MicrogramAction>> footer, StandardScreen5 standardScreen5, Integer num, String str2, ThemedColor themedColor, LoggingContext loggingContext, AndroidAttributes androidAttributes) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.title = str;
        this.hidesBackButton = bool;
        this.navConfig = standardScreen3;
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.theme = standardScreen5;
        this.rosettaScreenId = num;
        this.identifier = str2;
        this.backgroundColor = themedColor;
        this.loggingContext = loggingContext;
        this.androidAttributes = androidAttributes;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean getHidesBackButton() {
        return this.hidesBackButton;
    }

    public final NavigationBarConfiguration getNavConfig() {
        return this.navConfig;
    }

    public /* synthetic */ StandardScreen(String str, Boolean bool, NavigationBarConfiguration standardScreen3, List list, List list2, List list3, StandardScreen5 standardScreen5, Integer num, String str2, ThemedColor themedColor, LoggingContext loggingContext, AndroidAttributes androidAttributes, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : standardScreen3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt.emptyList() : list2, (i & 32) != 0 ? CollectionsKt.emptyList() : list3, (i & 64) != 0 ? null : standardScreen5, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : themedColor, (i & 1024) != 0 ? null : loggingContext, (i & 2048) != 0 ? null : androidAttributes);
    }

    public final List<UIComponent<MicrogramAction>> getHeader() {
        return this.header;
    }

    public final List<UIComponent<MicrogramAction>> getBody() {
        return this.body;
    }

    public final List<UIComponent<MicrogramAction>> getFooter() {
        return this.footer;
    }

    public final StandardScreen5 getTheme() {
        return this.theme;
    }

    public final Integer getRosettaScreenId() {
        return this.rosettaScreenId;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final ThemedColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public final LoggingContext getLoggingContext() {
        return this.loggingContext;
    }

    public final AndroidAttributes getAndroidAttributes() {
        return this.androidAttributes;
    }
}
