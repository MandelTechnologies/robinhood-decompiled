package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.TabGroupEventDataAdditionalInfoDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: TabGroupEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0010J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\fH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\fH\u0016J\b\u0010&\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto$Surrogate;)V", "tab_group_name", "", "tab_name", "time_spent", "", "tag", "additional_info", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataAdditionalInfoDto;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataAdditionalInfoDto;)V", "getTab_group_name", "()Ljava/lang/String;", "getTab_name", "getTime_spent", "()I", "getTag", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataAdditionalInfoDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class TabGroupEventDataDto implements Dto3<TabGroupEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TabGroupEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TabGroupEventDataDto, TabGroupEventData>> binaryBase64Serializer$delegate;
    private static final TabGroupEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TabGroupEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TabGroupEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTab_group_name() {
        return this.surrogate.getTab_group_name();
    }

    public final String getTab_name() {
        return this.surrogate.getTab_name();
    }

    public final int getTime_spent() {
        return this.surrogate.getTime_spent();
    }

    public final String getTag() {
        return this.surrogate.getTag();
    }

    public final TabGroupEventDataAdditionalInfoDto getAdditional_info() {
        return this.surrogate.getAdditional_info();
    }

    public /* synthetic */ TabGroupEventDataDto(String str, String str2, int i, String str3, TabGroupEventDataAdditionalInfoDto tabGroupEventDataAdditionalInfoDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : tabGroupEventDataAdditionalInfoDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabGroupEventDataDto(String tab_group_name, String tab_name, int i, String tag, TabGroupEventDataAdditionalInfoDto tabGroupEventDataAdditionalInfoDto) {
        this(new Surrogate(tab_group_name, tab_name, i, tag, tabGroupEventDataAdditionalInfoDto));
        Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
        Intrinsics.checkNotNullParameter(tab_name, "tab_name");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    public static /* synthetic */ TabGroupEventDataDto copy$default(TabGroupEventDataDto tabGroupEventDataDto, String str, String str2, int i, String str3, TabGroupEventDataAdditionalInfoDto tabGroupEventDataAdditionalInfoDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tabGroupEventDataDto.surrogate.getTab_group_name();
        }
        if ((i2 & 2) != 0) {
            str2 = tabGroupEventDataDto.surrogate.getTab_name();
        }
        if ((i2 & 4) != 0) {
            i = tabGroupEventDataDto.surrogate.getTime_spent();
        }
        if ((i2 & 8) != 0) {
            str3 = tabGroupEventDataDto.surrogate.getTag();
        }
        if ((i2 & 16) != 0) {
            tabGroupEventDataAdditionalInfoDto = tabGroupEventDataDto.surrogate.getAdditional_info();
        }
        TabGroupEventDataAdditionalInfoDto tabGroupEventDataAdditionalInfoDto2 = tabGroupEventDataAdditionalInfoDto;
        int i3 = i;
        return tabGroupEventDataDto.copy(str, str2, i3, str3, tabGroupEventDataAdditionalInfoDto2);
    }

    public final TabGroupEventDataDto copy(String tab_group_name, String tab_name, int time_spent, String tag, TabGroupEventDataAdditionalInfoDto additional_info) {
        Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
        Intrinsics.checkNotNullParameter(tab_name, "tab_name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new TabGroupEventDataDto(new Surrogate(tab_group_name, tab_name, time_spent, tag, additional_info));
    }

    @Override // com.robinhood.idl.Dto
    public TabGroupEventData toProto() {
        String tab_group_name = this.surrogate.getTab_group_name();
        String tab_name = this.surrogate.getTab_name();
        int time_spent = this.surrogate.getTime_spent();
        String tag = this.surrogate.getTag();
        TabGroupEventDataAdditionalInfoDto additional_info = this.surrogate.getAdditional_info();
        return new TabGroupEventData(tab_group_name, tab_name, time_spent, tag, additional_info != null ? additional_info.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[TabGroupEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TabGroupEventDataDto) && Intrinsics.areEqual(((TabGroupEventDataDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TabGroupEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000245BJ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eBK\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0018\u0010#\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003JL\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 ¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto$Surrogate;", "", "tab_group_name", "", "tab_name", "time_spent", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "tag", "additional_info", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataAdditionalInfoDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataAdditionalInfoDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataAdditionalInfoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTab_group_name$annotations", "()V", "getTab_group_name", "()Ljava/lang/String;", "getTab_name$annotations", "getTab_name", "getTime_spent$annotations", "getTime_spent", "()I", "getTag$annotations", "getTag", "getAdditional_info$annotations", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataAdditionalInfoDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TabGroupEventDataAdditionalInfoDto additional_info;
        private final String tab_group_name;
        private final String tab_name;
        private final String tag;
        private final int time_spent;

        public Surrogate() {
            this((String) null, (String) null, 0, (String) null, (TabGroupEventDataAdditionalInfoDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, int i, String str3, TabGroupEventDataAdditionalInfoDto tabGroupEventDataAdditionalInfoDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.tab_group_name;
            }
            if ((i2 & 2) != 0) {
                str2 = surrogate.tab_name;
            }
            if ((i2 & 4) != 0) {
                i = surrogate.time_spent;
            }
            if ((i2 & 8) != 0) {
                str3 = surrogate.tag;
            }
            if ((i2 & 16) != 0) {
                tabGroupEventDataAdditionalInfoDto = surrogate.additional_info;
            }
            TabGroupEventDataAdditionalInfoDto tabGroupEventDataAdditionalInfoDto2 = tabGroupEventDataAdditionalInfoDto;
            int i3 = i;
            return surrogate.copy(str, str2, i3, str3, tabGroupEventDataAdditionalInfoDto2);
        }

        @SerialName("additionalInfo")
        @JsonAnnotations2(names = {"additional_info"})
        public static /* synthetic */ void getAdditional_info$annotations() {
        }

        @SerialName("tabGroupName")
        @JsonAnnotations2(names = {"tab_group_name"})
        public static /* synthetic */ void getTab_group_name$annotations() {
        }

        @SerialName("tabName")
        @JsonAnnotations2(names = {"tab_name"})
        public static /* synthetic */ void getTab_name$annotations() {
        }

        @SerialName("tag")
        @JsonAnnotations2(names = {"tag"})
        public static /* synthetic */ void getTag$annotations() {
        }

        @SerialName("timeSpent")
        @JsonAnnotations2(names = {"time_spent"})
        public static /* synthetic */ void getTime_spent$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTab_group_name() {
            return this.tab_group_name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTab_name() {
            return this.tab_name;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTime_spent() {
            return this.time_spent;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* renamed from: component5, reason: from getter */
        public final TabGroupEventDataAdditionalInfoDto getAdditional_info() {
            return this.additional_info;
        }

        public final Surrogate copy(String tab_group_name, String tab_name, int time_spent, String tag, TabGroupEventDataAdditionalInfoDto additional_info) {
            Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
            Intrinsics.checkNotNullParameter(tab_name, "tab_name");
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new Surrogate(tab_group_name, tab_name, time_spent, tag, additional_info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.tab_group_name, surrogate.tab_group_name) && Intrinsics.areEqual(this.tab_name, surrogate.tab_name) && this.time_spent == surrogate.time_spent && Intrinsics.areEqual(this.tag, surrogate.tag) && Intrinsics.areEqual(this.additional_info, surrogate.additional_info);
        }

        public int hashCode() {
            int iHashCode = ((((((this.tab_group_name.hashCode() * 31) + this.tab_name.hashCode()) * 31) + Integer.hashCode(this.time_spent)) * 31) + this.tag.hashCode()) * 31;
            TabGroupEventDataAdditionalInfoDto tabGroupEventDataAdditionalInfoDto = this.additional_info;
            return iHashCode + (tabGroupEventDataAdditionalInfoDto == null ? 0 : tabGroupEventDataAdditionalInfoDto.hashCode());
        }

        public String toString() {
            return "Surrogate(tab_group_name=" + this.tab_group_name + ", tab_name=" + this.tab_name + ", time_spent=" + this.time_spent + ", tag=" + this.tag + ", additional_info=" + this.additional_info + ")";
        }

        /* compiled from: TabGroupEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TabGroupEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, int i2, String str3, TabGroupEventDataAdditionalInfoDto tabGroupEventDataAdditionalInfoDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.tab_group_name = "";
            } else {
                this.tab_group_name = str;
            }
            if ((i & 2) == 0) {
                this.tab_name = "";
            } else {
                this.tab_name = str2;
            }
            if ((i & 4) == 0) {
                this.time_spent = 0;
            } else {
                this.time_spent = i2;
            }
            if ((i & 8) == 0) {
                this.tag = "";
            } else {
                this.tag = str3;
            }
            if ((i & 16) == 0) {
                this.additional_info = null;
            } else {
                this.additional_info = tabGroupEventDataAdditionalInfoDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.tab_group_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.tab_group_name);
            }
            if (!Intrinsics.areEqual(self.tab_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.tab_name);
            }
            int i = self.time_spent;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.tag, "")) {
                output.encodeStringElement(serialDesc, 3, self.tag);
            }
            TabGroupEventDataAdditionalInfoDto tabGroupEventDataAdditionalInfoDto = self.additional_info;
            if (tabGroupEventDataAdditionalInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TabGroupEventDataAdditionalInfoDto.Serializer.INSTANCE, tabGroupEventDataAdditionalInfoDto);
            }
        }

        public Surrogate(String tab_group_name, String tab_name, int i, String tag, TabGroupEventDataAdditionalInfoDto tabGroupEventDataAdditionalInfoDto) {
            Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
            Intrinsics.checkNotNullParameter(tab_name, "tab_name");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.tab_group_name = tab_group_name;
            this.tab_name = tab_name;
            this.time_spent = i;
            this.tag = tag;
            this.additional_info = tabGroupEventDataAdditionalInfoDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, int i, String str3, TabGroupEventDataAdditionalInfoDto tabGroupEventDataAdditionalInfoDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : tabGroupEventDataAdditionalInfoDto);
        }

        public final String getTab_group_name() {
            return this.tab_group_name;
        }

        public final String getTab_name() {
            return this.tab_name;
        }

        public final int getTime_spent() {
            return this.time_spent;
        }

        public final String getTag() {
            return this.tag;
        }

        public final TabGroupEventDataAdditionalInfoDto getAdditional_info() {
            return this.additional_info;
        }
    }

    /* compiled from: TabGroupEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TabGroupEventDataDto, TabGroupEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TabGroupEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TabGroupEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TabGroupEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) TabGroupEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TabGroupEventData> getProtoAdapter() {
            return TabGroupEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TabGroupEventDataDto getZeroValue() {
            return TabGroupEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TabGroupEventDataDto fromProto(TabGroupEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String tab_group_name = proto.getTab_group_name();
            String tab_name = proto.getTab_name();
            int time_spent = proto.getTime_spent();
            String tag = proto.getTag();
            TabGroupEventDataAdditionalInfo additional_info = proto.getAdditional_info();
            return new TabGroupEventDataDto(new Surrogate(tab_group_name, tab_name, time_spent, tag, additional_info != null ? TabGroupEventDataAdditionalInfoDto.INSTANCE.fromProto(additional_info) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TabGroupEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TabGroupEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TabGroupEventDataDto(null, null, 0, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TabGroupEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<TabGroupEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.TabGroupEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TabGroupEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TabGroupEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TabGroupEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TabGroupEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.TabGroupEventDataDto";
        }
    }
}
