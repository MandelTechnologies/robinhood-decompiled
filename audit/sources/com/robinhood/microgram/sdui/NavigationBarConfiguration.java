package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.enums.RhEnum;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StandardScreen.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/NavigationBarConfiguration;", "Landroid/os/Parcelable;", ResourceTypes.STYLE, "Lcom/robinhood/microgram/sdui/NavigationBarConfiguration$Style;", "tintColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "leftButtons", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "rightButtons", "progressBar", "Lcom/robinhood/microgram/sdui/ProgressBar;", "<init>", "(Lcom/robinhood/microgram/sdui/NavigationBarConfiguration$Style;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Ljava/util/List;Ljava/util/List;Lcom/robinhood/microgram/sdui/ProgressBar;)V", "getStyle", "()Lcom/robinhood/microgram/sdui/NavigationBarConfiguration$Style;", "getTintColor", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "getLeftButtons", "()Ljava/util/List;", "getRightButtons", "getProgressBar", "()Lcom/robinhood/microgram/sdui/ProgressBar;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Style", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NavigationBarConfiguration implements Parcelable {
    public static final Parcelable.Creator<NavigationBarConfiguration> CREATOR = new Creator();
    private final List<UIComponent<MicrogramAction>> leftButtons;
    private final ProgressBar progressBar;
    private final List<UIComponent<MicrogramAction>> rightButtons;
    private final Style style;
    private final ThemedColor tintColor;

    /* compiled from: StandardScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<NavigationBarConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NavigationBarConfiguration createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Style styleValueOf = Style.valueOf(parcel.readString());
            ThemedColor themedColor = (ThemedColor) parcel.readParcelable(NavigationBarConfiguration.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(NavigationBarConfiguration.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(NavigationBarConfiguration.class.getClassLoader()));
            }
            return new NavigationBarConfiguration(styleValueOf, themedColor, arrayList, arrayList2, parcel.readInt() == 0 ? null : ProgressBar.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NavigationBarConfiguration[] newArray(int i) {
            return new NavigationBarConfiguration[i];
        }
    }

    public static /* synthetic */ NavigationBarConfiguration copy$default(NavigationBarConfiguration navigationBarConfiguration, Style style, ThemedColor themedColor, List list, List list2, ProgressBar progressBar, int i, Object obj) {
        if ((i & 1) != 0) {
            style = navigationBarConfiguration.style;
        }
        if ((i & 2) != 0) {
            themedColor = navigationBarConfiguration.tintColor;
        }
        if ((i & 4) != 0) {
            list = navigationBarConfiguration.leftButtons;
        }
        if ((i & 8) != 0) {
            list2 = navigationBarConfiguration.rightButtons;
        }
        if ((i & 16) != 0) {
            progressBar = navigationBarConfiguration.progressBar;
        }
        ProgressBar progressBar2 = progressBar;
        List list3 = list;
        return navigationBarConfiguration.copy(style, themedColor, list3, list2, progressBar2);
    }

    /* renamed from: component1, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemedColor getTintColor() {
        return this.tintColor;
    }

    public final List<UIComponent<MicrogramAction>> component3() {
        return this.leftButtons;
    }

    public final List<UIComponent<MicrogramAction>> component4() {
        return this.rightButtons;
    }

    /* renamed from: component5, reason: from getter */
    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    public final NavigationBarConfiguration copy(Style style, ThemedColor tintColor, List<? extends UIComponent<MicrogramAction>> leftButtons, List<? extends UIComponent<MicrogramAction>> rightButtons, ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(leftButtons, "leftButtons");
        Intrinsics.checkNotNullParameter(rightButtons, "rightButtons");
        return new NavigationBarConfiguration(style, tintColor, leftButtons, rightButtons, progressBar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationBarConfiguration)) {
            return false;
        }
        NavigationBarConfiguration navigationBarConfiguration = (NavigationBarConfiguration) other;
        return this.style == navigationBarConfiguration.style && Intrinsics.areEqual(this.tintColor, navigationBarConfiguration.tintColor) && Intrinsics.areEqual(this.leftButtons, navigationBarConfiguration.leftButtons) && Intrinsics.areEqual(this.rightButtons, navigationBarConfiguration.rightButtons) && Intrinsics.areEqual(this.progressBar, navigationBarConfiguration.progressBar);
    }

    public int hashCode() {
        int iHashCode = this.style.hashCode() * 31;
        ThemedColor themedColor = this.tintColor;
        int iHashCode2 = (((((iHashCode + (themedColor == null ? 0 : themedColor.hashCode())) * 31) + this.leftButtons.hashCode()) * 31) + this.rightButtons.hashCode()) * 31;
        ProgressBar progressBar = this.progressBar;
        return iHashCode2 + (progressBar != null ? progressBar.hashCode() : 0);
    }

    public String toString() {
        return "NavigationBarConfiguration(style=" + this.style + ", tintColor=" + this.tintColor + ", leftButtons=" + this.leftButtons + ", rightButtons=" + this.rightButtons + ", progressBar=" + this.progressBar + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.style.name());
        dest.writeParcelable(this.tintColor, flags);
        List<UIComponent<MicrogramAction>> list = this.leftButtons;
        dest.writeInt(list.size());
        Iterator<UIComponent<MicrogramAction>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        List<UIComponent<MicrogramAction>> list2 = this.rightButtons;
        dest.writeInt(list2.size());
        Iterator<UIComponent<MicrogramAction>> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            progressBar.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationBarConfiguration(Style style, ThemedColor themedColor, List<? extends UIComponent<MicrogramAction>> leftButtons, List<? extends UIComponent<MicrogramAction>> rightButtons, ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(leftButtons, "leftButtons");
        Intrinsics.checkNotNullParameter(rightButtons, "rightButtons");
        this.style = style;
        this.tintColor = themedColor;
        this.leftButtons = leftButtons;
        this.rightButtons = rightButtons;
        this.progressBar = progressBar;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final ThemedColor getTintColor() {
        return this.tintColor;
    }

    public /* synthetic */ NavigationBarConfiguration(Style style, ThemedColor themedColor, List list, List list2, ProgressBar progressBar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(style, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : progressBar);
    }

    public final List<UIComponent<MicrogramAction>> getLeftButtons() {
        return this.leftButtons;
    }

    public final List<UIComponent<MicrogramAction>> getRightButtons() {
        return this.rightButtons;
    }

    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StandardScreen.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/NavigationBarConfiguration$Style;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "STANDARD", "TRANSPARENT", "Companion", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Style implements RhEnum<Style> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style STANDARD = new Style("STANDARD", 0, "STANDARD");
        public static final Style TRANSPARENT = new Style("TRANSPARENT", 1, "TRANSPARENT");
        private final String serverValue;

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{STANDARD, TRANSPARENT};
        }

        public static EnumEntries<Style> getEntries() {
            return $ENTRIES;
        }

        private Style(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(styleArr$values);
            INSTANCE = new Companion(null);
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }
}
