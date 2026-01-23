package com.robinhood.android.store.linking;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.utils.extensions.ResourceTypes;
import hippo.model.p469v1.InstrumentTypeDto;
import hippo.model.p469v1.LinkingGroupColorsDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkingGroup.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\\\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/store/linking/LinkingGroup;", "Landroid/os/Parcelable;", "id", "", "isLinked", "", ResourceTypes.COLOR, "Lhippo/model/v1/LinkingGroupColorsDto;", "instrumentId", "instrumentType", "Lhippo/model/v1/InstrumentTypeDto;", "instrumentSymbol", "widgetIds", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lhippo/model/v1/LinkingGroupColorsDto;Ljava/lang/String;Lhippo/model/v1/InstrumentTypeDto;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getColor", "()Lhippo/model/v1/LinkingGroupColorsDto;", "getInstrumentId", "getInstrumentType", "()Lhippo/model/v1/InstrumentTypeDto;", "getInstrumentSymbol", "getWidgetIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lhippo/model/v1/LinkingGroupColorsDto;Ljava/lang/String;Lhippo/model/v1/InstrumentTypeDto;Ljava/lang/String;Ljava/util/List;)Lcom/robinhood/android/store/linking/LinkingGroup;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-store-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkingGroup implements Parcelable {
    public static final Parcelable.Creator<LinkingGroup> CREATOR = new Creator();
    private final LinkingGroupColorsDto color;
    private final String id;
    private final String instrumentId;
    private final String instrumentSymbol;
    private final InstrumentTypeDto instrumentType;
    private final Boolean isLinked;
    private final List<String> widgetIds;

    /* compiled from: LinkingGroup.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkingGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkingGroup createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LinkingGroup(string2, boolValueOf, (LinkingGroupColorsDto) parcel.readParcelable(LinkingGroup.class.getClassLoader()), parcel.readString(), (InstrumentTypeDto) parcel.readParcelable(LinkingGroup.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkingGroup[] newArray(int i) {
            return new LinkingGroup[i];
        }
    }

    public static /* synthetic */ LinkingGroup copy$default(LinkingGroup linkingGroup, String str, Boolean bool, LinkingGroupColorsDto linkingGroupColorsDto, String str2, InstrumentTypeDto instrumentTypeDto, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkingGroup.id;
        }
        if ((i & 2) != 0) {
            bool = linkingGroup.isLinked;
        }
        if ((i & 4) != 0) {
            linkingGroupColorsDto = linkingGroup.color;
        }
        if ((i & 8) != 0) {
            str2 = linkingGroup.instrumentId;
        }
        if ((i & 16) != 0) {
            instrumentTypeDto = linkingGroup.instrumentType;
        }
        if ((i & 32) != 0) {
            str3 = linkingGroup.instrumentSymbol;
        }
        if ((i & 64) != 0) {
            list = linkingGroup.widgetIds;
        }
        String str4 = str3;
        List list2 = list;
        InstrumentTypeDto instrumentTypeDto2 = instrumentTypeDto;
        LinkingGroupColorsDto linkingGroupColorsDto2 = linkingGroupColorsDto;
        return linkingGroup.copy(str, bool, linkingGroupColorsDto2, str2, instrumentTypeDto2, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsLinked() {
        return this.isLinked;
    }

    /* renamed from: component3, reason: from getter */
    public final LinkingGroupColorsDto getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component5, reason: from getter */
    public final InstrumentTypeDto getInstrumentType() {
        return this.instrumentType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInstrumentSymbol() {
        return this.instrumentSymbol;
    }

    public final List<String> component7() {
        return this.widgetIds;
    }

    public final LinkingGroup copy(String id, Boolean isLinked, LinkingGroupColorsDto color, String instrumentId, InstrumentTypeDto instrumentType, String instrumentSymbol, List<String> widgetIds) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
        Intrinsics.checkNotNullParameter(widgetIds, "widgetIds");
        return new LinkingGroup(id, isLinked, color, instrumentId, instrumentType, instrumentSymbol, widgetIds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkingGroup)) {
            return false;
        }
        LinkingGroup linkingGroup = (LinkingGroup) other;
        return Intrinsics.areEqual(this.id, linkingGroup.id) && Intrinsics.areEqual(this.isLinked, linkingGroup.isLinked) && this.color == linkingGroup.color && Intrinsics.areEqual(this.instrumentId, linkingGroup.instrumentId) && this.instrumentType == linkingGroup.instrumentType && Intrinsics.areEqual(this.instrumentSymbol, linkingGroup.instrumentSymbol) && Intrinsics.areEqual(this.widgetIds, linkingGroup.widgetIds);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Boolean bool = this.isLinked;
        return ((((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.color.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + this.instrumentType.hashCode()) * 31) + this.instrumentSymbol.hashCode()) * 31) + this.widgetIds.hashCode();
    }

    public String toString() {
        return "LinkingGroup(id=" + this.id + ", isLinked=" + this.isLinked + ", color=" + this.color + ", instrumentId=" + this.instrumentId + ", instrumentType=" + this.instrumentType + ", instrumentSymbol=" + this.instrumentSymbol + ", widgetIds=" + this.widgetIds + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        Boolean bool = this.isLinked;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            dest.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        dest.writeInt(iBooleanValue);
        dest.writeParcelable(this.color, flags);
        dest.writeString(this.instrumentId);
        dest.writeParcelable(this.instrumentType, flags);
        dest.writeString(this.instrumentSymbol);
        dest.writeStringList(this.widgetIds);
    }

    public LinkingGroup(String id, Boolean bool, LinkingGroupColorsDto color, String instrumentId, InstrumentTypeDto instrumentType, String instrumentSymbol, List<String> widgetIds) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
        Intrinsics.checkNotNullParameter(widgetIds, "widgetIds");
        this.id = id;
        this.isLinked = bool;
        this.color = color;
        this.instrumentId = instrumentId;
        this.instrumentType = instrumentType;
        this.instrumentSymbol = instrumentSymbol;
        this.widgetIds = widgetIds;
    }

    public final String getId() {
        return this.id;
    }

    public final Boolean isLinked() {
        return this.isLinked;
    }

    public final LinkingGroupColorsDto getColor() {
        return this.color;
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final InstrumentTypeDto getInstrumentType() {
        return this.instrumentType;
    }

    public final String getInstrumentSymbol() {
        return this.instrumentSymbol;
    }

    public final List<String> getWidgetIds() {
        return this.widgetIds;
    }
}
