package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.EventTopicLocationDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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

/* compiled from: ListEventTopicsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)*+,B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u0011JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017¨\u0006-"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto$Surrogate;)V", "ids", "", "location", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicLocationDto;", "bracket_enabled", "", "hub_redesign_enabled", "forecastex_enabled", "exclude_sports", "(Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventTopicLocationDto;ZZZZ)V", "getIds", "()Ljava/lang/String;", "getLocation", "()Lcom/robinhood/arsenal/proto/v1/idl/EventTopicLocationDto;", "getBracket_enabled", "()Z", "getHub_redesign_enabled", "getForecastex_enabled", "getExclude_sports", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes5.dex */
public final class ListEventTopicsRequestDto implements Dto3<ListEventTopicsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ListEventTopicsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ListEventTopicsRequestDto, ListEventTopicsRequest>> binaryBase64Serializer$delegate;
    private static final ListEventTopicsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ListEventTopicsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ListEventTopicsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getIds() {
        return this.surrogate.getIds();
    }

    public final EventTopicLocationDto getLocation() {
        return this.surrogate.getLocation();
    }

    public final boolean getBracket_enabled() {
        return this.surrogate.getBracket_enabled();
    }

    public final boolean getHub_redesign_enabled() {
        return this.surrogate.getHub_redesign_enabled();
    }

    public final boolean getForecastex_enabled() {
        return this.surrogate.getForecastex_enabled();
    }

    public final boolean getExclude_sports() {
        return this.surrogate.getExclude_sports();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ListEventTopicsRequestDto(java.lang.String r2, com.robinhood.arsenal.proto.p281v1.idl.EventTopicLocationDto r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto L10
            com.robinhood.arsenal.proto.v1.idl.EventTopicLocationDto$Companion r3 = com.robinhood.arsenal.proto.p281v1.idl.EventTopicLocationDto.INSTANCE
            com.robinhood.arsenal.proto.v1.idl.EventTopicLocationDto r3 = r3.getZeroValue()
        L10:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L16
            r4 = r0
        L16:
            r9 = r8 & 8
            if (r9 == 0) goto L1b
            r5 = r0
        L1b:
            r9 = r8 & 16
            if (r9 == 0) goto L20
            r6 = r0
        L20:
            r8 = r8 & 32
            if (r8 == 0) goto L2c
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L33
        L2c:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L33:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.arsenal.proto.p281v1.idl.ListEventTopicsRequestDto.<init>(java.lang.String, com.robinhood.arsenal.proto.v1.idl.EventTopicLocationDto, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListEventTopicsRequestDto(String ids, EventTopicLocationDto location, boolean z, boolean z2, boolean z3, boolean z4) {
        this(new Surrogate(ids, location, z, z2, z3, z4));
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(location, "location");
    }

    public static /* synthetic */ ListEventTopicsRequestDto copy$default(ListEventTopicsRequestDto listEventTopicsRequestDto, String str, EventTopicLocationDto eventTopicLocationDto, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listEventTopicsRequestDto.surrogate.getIds();
        }
        if ((i & 2) != 0) {
            eventTopicLocationDto = listEventTopicsRequestDto.surrogate.getLocation();
        }
        if ((i & 4) != 0) {
            z = listEventTopicsRequestDto.surrogate.getBracket_enabled();
        }
        if ((i & 8) != 0) {
            z2 = listEventTopicsRequestDto.surrogate.getHub_redesign_enabled();
        }
        if ((i & 16) != 0) {
            z3 = listEventTopicsRequestDto.surrogate.getForecastex_enabled();
        }
        if ((i & 32) != 0) {
            z4 = listEventTopicsRequestDto.surrogate.getExclude_sports();
        }
        boolean z5 = z3;
        boolean z6 = z4;
        return listEventTopicsRequestDto.copy(str, eventTopicLocationDto, z, z2, z5, z6);
    }

    public final ListEventTopicsRequestDto copy(String ids, EventTopicLocationDto location, boolean bracket_enabled, boolean hub_redesign_enabled, boolean forecastex_enabled, boolean exclude_sports) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(location, "location");
        return new ListEventTopicsRequestDto(new Surrogate(ids, location, bracket_enabled, hub_redesign_enabled, forecastex_enabled, exclude_sports));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ListEventTopicsRequest toProto() {
        return new ListEventTopicsRequest(this.surrogate.getIds(), (EventTopicLocation) this.surrogate.getLocation().toProto(), this.surrogate.getBracket_enabled(), this.surrogate.getHub_redesign_enabled(), this.surrogate.getForecastex_enabled(), this.surrogate.getExclude_sports(), null, 64, null);
    }

    public String toString() {
        return "[ListEventTopicsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ListEventTopicsRequestDto) && Intrinsics.areEqual(((ListEventTopicsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: ListEventTopicsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000256BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003JE\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000eHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J%\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u001b¨\u00067"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto$Surrogate;", "", "ids", "", "location", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicLocationDto;", "bracket_enabled", "", "hub_redesign_enabled", "forecastex_enabled", "exclude_sports", "<init>", "(Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventTopicLocationDto;ZZZZ)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventTopicLocationDto;ZZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIds$annotations", "()V", "getIds", "()Ljava/lang/String;", "getLocation$annotations", "getLocation", "()Lcom/robinhood/arsenal/proto/v1/idl/EventTopicLocationDto;", "getBracket_enabled$annotations", "getBracket_enabled", "()Z", "getHub_redesign_enabled$annotations", "getHub_redesign_enabled", "getForecastex_enabled$annotations", "getForecastex_enabled", "getExclude_sports$annotations", "getExclude_sports", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean bracket_enabled;
        private final boolean exclude_sports;
        private final boolean forecastex_enabled;
        private final boolean hub_redesign_enabled;
        private final String ids;
        private final EventTopicLocationDto location;

        public Surrogate() {
            this((String) null, (EventTopicLocationDto) null, false, false, false, false, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, EventTopicLocationDto eventTopicLocationDto, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.ids;
            }
            if ((i & 2) != 0) {
                eventTopicLocationDto = surrogate.location;
            }
            if ((i & 4) != 0) {
                z = surrogate.bracket_enabled;
            }
            if ((i & 8) != 0) {
                z2 = surrogate.hub_redesign_enabled;
            }
            if ((i & 16) != 0) {
                z3 = surrogate.forecastex_enabled;
            }
            if ((i & 32) != 0) {
                z4 = surrogate.exclude_sports;
            }
            boolean z5 = z3;
            boolean z6 = z4;
            return surrogate.copy(str, eventTopicLocationDto, z, z2, z5, z6);
        }

        @SerialName("bracketEnabled")
        @JsonAnnotations2(names = {"bracket_enabled"})
        public static /* synthetic */ void getBracket_enabled$annotations() {
        }

        @SerialName("excludeSports")
        @JsonAnnotations2(names = {"exclude_sports"})
        public static /* synthetic */ void getExclude_sports$annotations() {
        }

        @SerialName("forecastexEnabled")
        @JsonAnnotations2(names = {"forecastex_enabled"})
        public static /* synthetic */ void getForecastex_enabled$annotations() {
        }

        @SerialName("hubRedesignEnabled")
        @JsonAnnotations2(names = {"hub_redesign_enabled"})
        public static /* synthetic */ void getHub_redesign_enabled$annotations() {
        }

        @SerialName("ids")
        @JsonAnnotations2(names = {"ids"})
        public static /* synthetic */ void getIds$annotations() {
        }

        @SerialName("location")
        @JsonAnnotations2(names = {"location"})
        public static /* synthetic */ void getLocation$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getIds() {
            return this.ids;
        }

        /* renamed from: component2, reason: from getter */
        public final EventTopicLocationDto getLocation() {
            return this.location;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getBracket_enabled() {
            return this.bracket_enabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHub_redesign_enabled() {
            return this.hub_redesign_enabled;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getForecastex_enabled() {
            return this.forecastex_enabled;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getExclude_sports() {
            return this.exclude_sports;
        }

        public final Surrogate copy(String ids, EventTopicLocationDto location, boolean bracket_enabled, boolean hub_redesign_enabled, boolean forecastex_enabled, boolean exclude_sports) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            Intrinsics.checkNotNullParameter(location, "location");
            return new Surrogate(ids, location, bracket_enabled, hub_redesign_enabled, forecastex_enabled, exclude_sports);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ids, surrogate.ids) && this.location == surrogate.location && this.bracket_enabled == surrogate.bracket_enabled && this.hub_redesign_enabled == surrogate.hub_redesign_enabled && this.forecastex_enabled == surrogate.forecastex_enabled && this.exclude_sports == surrogate.exclude_sports;
        }

        public int hashCode() {
            return (((((((((this.ids.hashCode() * 31) + this.location.hashCode()) * 31) + Boolean.hashCode(this.bracket_enabled)) * 31) + Boolean.hashCode(this.hub_redesign_enabled)) * 31) + Boolean.hashCode(this.forecastex_enabled)) * 31) + Boolean.hashCode(this.exclude_sports);
        }

        public String toString() {
            return "Surrogate(ids=" + this.ids + ", location=" + this.location + ", bracket_enabled=" + this.bracket_enabled + ", hub_redesign_enabled=" + this.hub_redesign_enabled + ", forecastex_enabled=" + this.forecastex_enabled + ", exclude_sports=" + this.exclude_sports + ")";
        }

        /* compiled from: ListEventTopicsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ListEventTopicsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, EventTopicLocationDto eventTopicLocationDto, boolean z, boolean z2, boolean z3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
            this.ids = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.location = EventTopicLocationDto.INSTANCE.getZeroValue();
            } else {
                this.location = eventTopicLocationDto;
            }
            if ((i & 4) == 0) {
                this.bracket_enabled = false;
            } else {
                this.bracket_enabled = z;
            }
            if ((i & 8) == 0) {
                this.hub_redesign_enabled = false;
            } else {
                this.hub_redesign_enabled = z2;
            }
            if ((i & 16) == 0) {
                this.forecastex_enabled = false;
            } else {
                this.forecastex_enabled = z3;
            }
            if ((i & 32) == 0) {
                this.exclude_sports = false;
            } else {
                this.exclude_sports = z4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ids, "")) {
                output.encodeStringElement(serialDesc, 0, self.ids);
            }
            if (self.location != EventTopicLocationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, EventTopicLocationDto.Serializer.INSTANCE, self.location);
            }
            boolean z = self.bracket_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            boolean z2 = self.hub_redesign_enabled;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 3, z2);
            }
            boolean z3 = self.forecastex_enabled;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 4, z3);
            }
            boolean z4 = self.exclude_sports;
            if (z4) {
                output.encodeBooleanElement(serialDesc, 5, z4);
            }
        }

        public Surrogate(String ids, EventTopicLocationDto location, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            Intrinsics.checkNotNullParameter(location, "location");
            this.ids = ids;
            this.location = location;
            this.bracket_enabled = z;
            this.hub_redesign_enabled = z2;
            this.forecastex_enabled = z3;
            this.exclude_sports = z4;
        }

        public final String getIds() {
            return this.ids;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, com.robinhood.arsenal.proto.p281v1.idl.EventTopicLocationDto r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r9 = r8 & 2
                if (r9 == 0) goto L10
                com.robinhood.arsenal.proto.v1.idl.EventTopicLocationDto$Companion r3 = com.robinhood.arsenal.proto.p281v1.idl.EventTopicLocationDto.INSTANCE
                com.robinhood.arsenal.proto.v1.idl.EventTopicLocationDto r3 = r3.getZeroValue()
            L10:
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L16
                r4 = r0
            L16:
                r9 = r8 & 8
                if (r9 == 0) goto L1b
                r5 = r0
            L1b:
                r9 = r8 & 16
                if (r9 == 0) goto L20
                r6 = r0
            L20:
                r8 = r8 & 32
                if (r8 == 0) goto L2c
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L33
            L2c:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L33:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.arsenal.proto.p281v1.idl.ListEventTopicsRequestDto.Surrogate.<init>(java.lang.String, com.robinhood.arsenal.proto.v1.idl.EventTopicLocationDto, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final EventTopicLocationDto getLocation() {
            return this.location;
        }

        public final boolean getBracket_enabled() {
            return this.bracket_enabled;
        }

        public final boolean getHub_redesign_enabled() {
            return this.hub_redesign_enabled;
        }

        public final boolean getForecastex_enabled() {
            return this.forecastex_enabled;
        }

        public final boolean getExclude_sports() {
            return this.exclude_sports;
        }
    }

    /* compiled from: ListEventTopicsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ListEventTopicsRequestDto, ListEventTopicsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ListEventTopicsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListEventTopicsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListEventTopicsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) ListEventTopicsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ListEventTopicsRequest> getProtoAdapter() {
            return ListEventTopicsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListEventTopicsRequestDto getZeroValue() {
            return ListEventTopicsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListEventTopicsRequestDto fromProto(ListEventTopicsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ListEventTopicsRequestDto(new Surrogate(proto.getIds(), EventTopicLocationDto.INSTANCE.fromProto(proto.getLocation()), proto.getBracket_enabled(), proto.getHub_redesign_enabled(), proto.getForecastex_enabled(), proto.getExclude_sports()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.ListEventTopicsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListEventTopicsRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ListEventTopicsRequestDto(null, null, false, false, false, false, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ListEventTopicsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ListEventTopicsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.ListEventTopicsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ListEventTopicsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ListEventTopicsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ListEventTopicsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ListEventTopicsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.ListEventTopicsRequestDto";
        }
    }
}
