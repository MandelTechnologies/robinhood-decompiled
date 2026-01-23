package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: HtmlCanvasScreen.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u009c\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010<J\u0006\u0010=\u001a\u00020\u0010J\u0013\u0010>\u001a\u00020\u00052\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0010HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006H"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/HtmlCanvasScreen;", "Landroid/os/Parcelable;", "title", "", "hidesBackButton", "", "navConfig", "Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;", "canvasUrl", Footer.f10637type, "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "theme", "Lcom/robinhood/microgram/sdui/Theme;", "rosettaScreenId", "", "identifier", "backgroundColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/microgram/sdui/LoggingContext;", "androidAttributes", "Lcom/robinhood/microgram/sdui/AndroidAttributes;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/microgram/sdui/Theme;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Lcom/robinhood/microgram/sdui/LoggingContext;Lcom/robinhood/microgram/sdui/AndroidAttributes;)V", "getTitle", "()Ljava/lang/String;", "getHidesBackButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNavConfig", "()Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;", "getCanvasUrl", "getFooter", "()Ljava/util/List;", "getTheme", "()Lcom/robinhood/microgram/sdui/Theme;", "getRosettaScreenId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIdentifier", "getBackgroundColor", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "getLoggingContext", "()Lcom/robinhood/microgram/sdui/LoggingContext;", "getAndroidAttributes", "()Lcom/robinhood/microgram/sdui/AndroidAttributes;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/microgram/sdui/Theme;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Lcom/robinhood/microgram/sdui/LoggingContext;Lcom/robinhood/microgram/sdui/AndroidAttributes;)Lcom/robinhood/microgram/sdui/HtmlCanvasScreen;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HtmlCanvasScreen implements Parcelable {
    public static final Parcelable.Creator<HtmlCanvasScreen> CREATOR = new Creator();
    private final AndroidAttributes androidAttributes;
    private final ThemedColor backgroundColor;
    private final String canvasUrl;
    private final List<UIComponent<MicrogramAction>> footer;
    private final Boolean hidesBackButton;
    private final String identifier;
    private final LoggingContext loggingContext;
    private final NavigationBarConfiguration navConfig;
    private final Integer rosettaScreenId;
    private final StandardScreen5 theme;
    private final String title;

    /* compiled from: HtmlCanvasScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<HtmlCanvasScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HtmlCanvasScreen createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            NavigationBarConfiguration standardScreen3CreateFromParcel = parcel.readInt() == 0 ? null : NavigationBarConfiguration.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(HtmlCanvasScreen.class.getClassLoader()));
            }
            return new HtmlCanvasScreen(string2, boolValueOf, standardScreen3CreateFromParcel, string3, arrayList, parcel.readInt() == 0 ? null : StandardScreen5.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (ThemedColor) parcel.readParcelable(HtmlCanvasScreen.class.getClassLoader()), parcel.readInt() == 0 ? null : LoggingContext.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AndroidAttributes.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HtmlCanvasScreen[] newArray(int i) {
            return new HtmlCanvasScreen[i];
        }
    }

    public HtmlCanvasScreen() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ HtmlCanvasScreen copy$default(HtmlCanvasScreen htmlCanvasScreen, String str, Boolean bool, NavigationBarConfiguration standardScreen3, String str2, List list, StandardScreen5 standardScreen5, Integer num, String str3, ThemedColor themedColor, LoggingContext loggingContext, AndroidAttributes androidAttributes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = htmlCanvasScreen.title;
        }
        if ((i & 2) != 0) {
            bool = htmlCanvasScreen.hidesBackButton;
        }
        if ((i & 4) != 0) {
            standardScreen3 = htmlCanvasScreen.navConfig;
        }
        if ((i & 8) != 0) {
            str2 = htmlCanvasScreen.canvasUrl;
        }
        if ((i & 16) != 0) {
            list = htmlCanvasScreen.footer;
        }
        if ((i & 32) != 0) {
            standardScreen5 = htmlCanvasScreen.theme;
        }
        if ((i & 64) != 0) {
            num = htmlCanvasScreen.rosettaScreenId;
        }
        if ((i & 128) != 0) {
            str3 = htmlCanvasScreen.identifier;
        }
        if ((i & 256) != 0) {
            themedColor = htmlCanvasScreen.backgroundColor;
        }
        if ((i & 512) != 0) {
            loggingContext = htmlCanvasScreen.loggingContext;
        }
        if ((i & 1024) != 0) {
            androidAttributes = htmlCanvasScreen.androidAttributes;
        }
        LoggingContext loggingContext2 = loggingContext;
        AndroidAttributes androidAttributes2 = androidAttributes;
        String str4 = str3;
        ThemedColor themedColor2 = themedColor;
        StandardScreen5 standardScreen52 = standardScreen5;
        Integer num2 = num;
        List list2 = list;
        NavigationBarConfiguration standardScreen32 = standardScreen3;
        return htmlCanvasScreen.copy(str, bool, standardScreen32, str2, list2, standardScreen52, num2, str4, themedColor2, loggingContext2, androidAttributes2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final LoggingContext getLoggingContext() {
        return this.loggingContext;
    }

    /* renamed from: component11, reason: from getter */
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

    /* renamed from: component4, reason: from getter */
    public final String getCanvasUrl() {
        return this.canvasUrl;
    }

    public final List<UIComponent<MicrogramAction>> component5() {
        return this.footer;
    }

    /* renamed from: component6, reason: from getter */
    public final StandardScreen5 getTheme() {
        return this.theme;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getRosettaScreenId() {
        return this.rosettaScreenId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component9, reason: from getter */
    public final ThemedColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public final HtmlCanvasScreen copy(String title, Boolean hidesBackButton, NavigationBarConfiguration navConfig, String canvasUrl, List<? extends UIComponent<MicrogramAction>> footer, StandardScreen5 theme, Integer rosettaScreenId, String identifier, ThemedColor backgroundColor, LoggingContext loggingContext, AndroidAttributes androidAttributes) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new HtmlCanvasScreen(title, hidesBackButton, navConfig, canvasUrl, footer, theme, rosettaScreenId, identifier, backgroundColor, loggingContext, androidAttributes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HtmlCanvasScreen)) {
            return false;
        }
        HtmlCanvasScreen htmlCanvasScreen = (HtmlCanvasScreen) other;
        return Intrinsics.areEqual(this.title, htmlCanvasScreen.title) && Intrinsics.areEqual(this.hidesBackButton, htmlCanvasScreen.hidesBackButton) && Intrinsics.areEqual(this.navConfig, htmlCanvasScreen.navConfig) && Intrinsics.areEqual(this.canvasUrl, htmlCanvasScreen.canvasUrl) && Intrinsics.areEqual(this.footer, htmlCanvasScreen.footer) && this.theme == htmlCanvasScreen.theme && Intrinsics.areEqual(this.rosettaScreenId, htmlCanvasScreen.rosettaScreenId) && Intrinsics.areEqual(this.identifier, htmlCanvasScreen.identifier) && Intrinsics.areEqual(this.backgroundColor, htmlCanvasScreen.backgroundColor) && Intrinsics.areEqual(this.loggingContext, htmlCanvasScreen.loggingContext) && Intrinsics.areEqual(this.androidAttributes, htmlCanvasScreen.androidAttributes);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hidesBackButton;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        NavigationBarConfiguration standardScreen3 = this.navConfig;
        int iHashCode3 = (iHashCode2 + (standardScreen3 == null ? 0 : standardScreen3.hashCode())) * 31;
        String str2 = this.canvasUrl;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.footer.hashCode()) * 31;
        StandardScreen5 standardScreen5 = this.theme;
        int iHashCode5 = (iHashCode4 + (standardScreen5 == null ? 0 : standardScreen5.hashCode())) * 31;
        Integer num = this.rosettaScreenId;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.identifier;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThemedColor themedColor = this.backgroundColor;
        int iHashCode8 = (iHashCode7 + (themedColor == null ? 0 : themedColor.hashCode())) * 31;
        LoggingContext loggingContext = this.loggingContext;
        int iHashCode9 = (iHashCode8 + (loggingContext == null ? 0 : loggingContext.hashCode())) * 31;
        AndroidAttributes androidAttributes = this.androidAttributes;
        return iHashCode9 + (androidAttributes != null ? androidAttributes.hashCode() : 0);
    }

    public String toString() {
        return "HtmlCanvasScreen(title=" + this.title + ", hidesBackButton=" + this.hidesBackButton + ", navConfig=" + this.navConfig + ", canvasUrl=" + this.canvasUrl + ", footer=" + this.footer + ", theme=" + this.theme + ", rosettaScreenId=" + this.rosettaScreenId + ", identifier=" + this.identifier + ", backgroundColor=" + this.backgroundColor + ", loggingContext=" + this.loggingContext + ", androidAttributes=" + this.androidAttributes + ")";
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
        dest.writeString(this.canvasUrl);
        List<UIComponent<MicrogramAction>> list = this.footer;
        dest.writeInt(list.size());
        Iterator<UIComponent<MicrogramAction>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
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
    public HtmlCanvasScreen(String str, Boolean bool, NavigationBarConfiguration standardScreen3, String str2, List<? extends UIComponent<MicrogramAction>> footer, StandardScreen5 standardScreen5, Integer num, String str3, ThemedColor themedColor, LoggingContext loggingContext, AndroidAttributes androidAttributes) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.title = str;
        this.hidesBackButton = bool;
        this.navConfig = standardScreen3;
        this.canvasUrl = str2;
        this.footer = footer;
        this.theme = standardScreen5;
        this.rosettaScreenId = num;
        this.identifier = str3;
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

    public final String getCanvasUrl() {
        return this.canvasUrl;
    }

    public /* synthetic */ HtmlCanvasScreen(String str, Boolean bool, NavigationBarConfiguration standardScreen3, String str2, List list, StandardScreen5 standardScreen5, Integer num, String str3, ThemedColor themedColor, LoggingContext loggingContext, AndroidAttributes androidAttributes, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : standardScreen3, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : standardScreen5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : themedColor, (i & 512) != 0 ? null : loggingContext, (i & 1024) != 0 ? null : androidAttributes);
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
