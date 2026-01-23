package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.Timeline;
import rh_server_driven_ui.p531v1.TimelineDto;
import rh_server_driven_ui.p531v1.TimelineRowDto;

/* compiled from: TimelineDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006-,./01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00062"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Timeline;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TimelineDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TimelineDto$Surrogate;)V", "", "Lrh_server_driven_ui/v1/TimelineRowDto;", "rows", "Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;", "color_overrides", "Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "web_orientation", "", "max_lines", "(Ljava/util/List;Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;Ljava/lang/Integer;)V", "toProto", "()Lrh_server_driven_ui/v1/Timeline;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TimelineDto$Surrogate;", "getRows", "()Ljava/util/List;", "getColor_overrides", "()Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;", "getMax_lines", "()Ljava/lang/Integer;", "Companion", "Surrogate", "ColorOverrideDto", "WebOrientationDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class TimelineDto implements Dto3<Timeline>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TimelineDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TimelineDto, Timeline>> binaryBase64Serializer$delegate;
    private static final TimelineDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TimelineDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TimelineDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<TimelineRowDto> getRows() {
        return this.surrogate.getRows();
    }

    public final ColorOverrideDto getColor_overrides() {
        return this.surrogate.getColor_overrides();
    }

    public final Integer getMax_lines() {
        return this.surrogate.getMax_lines();
    }

    public /* synthetic */ TimelineDto(List list, ColorOverrideDto colorOverrideDto, WebOrientationDto webOrientationDto, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : colorOverrideDto, (i & 4) != 0 ? WebOrientationDto.INSTANCE.getZeroValue() : webOrientationDto, (i & 8) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimelineDto(List<TimelineRowDto> rows, ColorOverrideDto colorOverrideDto, WebOrientationDto web_orientation, Integer num) {
        this(new Surrogate(rows, colorOverrideDto, web_orientation, num));
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(web_orientation, "web_orientation");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Timeline toProto() {
        List<TimelineRowDto> rows = this.surrogate.getRows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
        Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            arrayList.add(((TimelineRowDto) it.next()).toProto());
        }
        ColorOverrideDto color_overrides = this.surrogate.getColor_overrides();
        return new Timeline(arrayList, color_overrides != null ? color_overrides.toProto() : null, (Timeline.WebOrientation) this.surrogate.getWeb_orientation().toProto(), this.surrogate.getMax_lines(), null, 16, null);
    }

    public String toString() {
        return "[TimelineDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TimelineDto) && Intrinsics.areEqual(((TimelineDto) other).surrogate, this.surrogate);
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
    /* compiled from: TimelineDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287BH\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0019\b\u0002\u0010\r\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\u0004\b\u000e\u0010\u000fBI\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R1\u0010\r\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00103\u0012\u0004\b6\u0010*\u001a\u0004\b4\u00105¨\u00069"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$Surrogate;", "", "", "Lrh_server_driven_ui/v1/TimelineRowDto;", "rows", "Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;", "color_overrides", "Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "web_orientation", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "max_lines", "<init>", "(Ljava/util/List;Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TimelineDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRows", "()Ljava/util/List;", "getRows$annotations", "()V", "Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;", "getColor_overrides", "()Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;", "getColor_overrides$annotations", "Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "getWeb_orientation", "()Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "getWeb_orientation$annotations", "Ljava/lang/Integer;", "getMax_lines", "()Ljava/lang/Integer;", "getMax_lines$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final ColorOverrideDto color_overrides;
        private final Integer max_lines;
        private final List<TimelineRowDto> rows;
        private final WebOrientationDto web_orientation;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: rh_server_driven_ui.v1.TimelineDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((List) null, (ColorOverrideDto) null, (WebOrientationDto) null, (Integer) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TimelineRowDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.rows, surrogate.rows) && Intrinsics.areEqual(this.color_overrides, surrogate.color_overrides) && this.web_orientation == surrogate.web_orientation && Intrinsics.areEqual(this.max_lines, surrogate.max_lines);
        }

        public int hashCode() {
            int iHashCode = this.rows.hashCode() * 31;
            ColorOverrideDto colorOverrideDto = this.color_overrides;
            int iHashCode2 = (((iHashCode + (colorOverrideDto == null ? 0 : colorOverrideDto.hashCode())) * 31) + this.web_orientation.hashCode()) * 31;
            Integer num = this.max_lines;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(rows=" + this.rows + ", color_overrides=" + this.color_overrides + ", web_orientation=" + this.web_orientation + ", max_lines=" + this.max_lines + ")";
        }

        /* compiled from: TimelineDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TimelineDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TimelineDto7.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, ColorOverrideDto colorOverrideDto, WebOrientationDto webOrientationDto, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            this.rows = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.color_overrides = null;
            } else {
                this.color_overrides = colorOverrideDto;
            }
            if ((i & 4) == 0) {
                this.web_orientation = WebOrientationDto.INSTANCE.getZeroValue();
            } else {
                this.web_orientation = webOrientationDto;
            }
            if ((i & 8) == 0) {
                this.max_lines = null;
            } else {
                this.max_lines = num;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.rows, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.rows);
            }
            ColorOverrideDto colorOverrideDto = self.color_overrides;
            if (colorOverrideDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ColorOverrideDto.Serializer.INSTANCE, colorOverrideDto);
            }
            if (self.web_orientation != WebOrientationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, WebOrientationDto.Serializer.INSTANCE, self.web_orientation);
            }
            Integer num = self.max_lines;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, num);
            }
        }

        public Surrogate(List<TimelineRowDto> rows, ColorOverrideDto colorOverrideDto, WebOrientationDto web_orientation, Integer num) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            Intrinsics.checkNotNullParameter(web_orientation, "web_orientation");
            this.rows = rows;
            this.color_overrides = colorOverrideDto;
            this.web_orientation = web_orientation;
            this.max_lines = num;
        }

        public final List<TimelineRowDto> getRows() {
            return this.rows;
        }

        public /* synthetic */ Surrogate(List list, ColorOverrideDto colorOverrideDto, WebOrientationDto webOrientationDto, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : colorOverrideDto, (i & 4) != 0 ? WebOrientationDto.INSTANCE.getZeroValue() : webOrientationDto, (i & 8) != 0 ? null : num);
        }

        public final ColorOverrideDto getColor_overrides() {
            return this.color_overrides;
        }

        public final WebOrientationDto getWeb_orientation() {
            return this.web_orientation;
        }

        public final Integer getMax_lines() {
            return this.max_lines;
        }
    }

    /* compiled from: TimelineDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TimelineDto;", "Lrh_server_driven_ui/v1/Timeline;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TimelineDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TimelineDto, Timeline> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TimelineDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimelineDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimelineDto> getBinaryBase64Serializer() {
            return (KSerializer) TimelineDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Timeline> getProtoAdapter() {
            return Timeline.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimelineDto getZeroValue() {
            return TimelineDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimelineDto fromProto(Timeline proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<TimelineRow> rows = proto.getRows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
            Iterator<T> it = rows.iterator();
            while (it.hasNext()) {
                arrayList.add(TimelineRowDto.INSTANCE.fromProto((TimelineRow) it.next()));
            }
            Timeline.ColorOverride color_overrides = proto.getColor_overrides();
            return new TimelineDto(new Surrogate(arrayList, color_overrides != null ? ColorOverrideDto.INSTANCE.fromProto(color_overrides) : null, WebOrientationDto.INSTANCE.fromProto(proto.getWeb_orientation()), proto.getMax_lines()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TimelineDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new TimelineDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TimelineDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b&\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b(\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b)\u0010%¨\u0006."}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Timeline$ColorOverride;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto$Surrogate;)V", "Lrh_server_driven_ui/v1/ThemedColorDto;", "incomplete", "complete", "error", "warning", "ongoing", "(Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "toProto", "()Lrh_server_driven_ui/v1/Timeline$ColorOverride;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto$Surrogate;", "getIncomplete", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getComplete", "getError", "getWarning", "getOngoing", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ColorOverrideDto implements Dto3<Timeline.ColorOverride>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ColorOverrideDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ColorOverrideDto, Timeline.ColorOverride>> binaryBase64Serializer$delegate;
        private static final ColorOverrideDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ColorOverrideDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ColorOverrideDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final ThemedColorDto getIncomplete() {
            return this.surrogate.getIncomplete();
        }

        public final ThemedColorDto getComplete() {
            return this.surrogate.getComplete();
        }

        public final ThemedColorDto getError() {
            return this.surrogate.getError();
        }

        public final ThemedColorDto getWarning() {
            return this.surrogate.getWarning();
        }

        public final ThemedColorDto getOngoing() {
            return this.surrogate.getOngoing();
        }

        public /* synthetic */ ColorOverrideDto(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, ThemedColorDto themedColorDto5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? null : themedColorDto2, (i & 4) != 0 ? null : themedColorDto3, (i & 8) != 0 ? null : themedColorDto4, (i & 16) != 0 ? null : themedColorDto5);
        }

        public ColorOverrideDto(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, ThemedColorDto themedColorDto5) {
            this(new Surrogate(themedColorDto, themedColorDto2, themedColorDto3, themedColorDto4, themedColorDto5));
        }

        @Override // com.robinhood.idl.Dto
        public Timeline.ColorOverride toProto() {
            ThemedColorDto incomplete = this.surrogate.getIncomplete();
            ThemedColor proto = incomplete != null ? incomplete.toProto() : null;
            ThemedColorDto complete = this.surrogate.getComplete();
            ThemedColor proto2 = complete != null ? complete.toProto() : null;
            ThemedColorDto error = this.surrogate.getError();
            ThemedColor proto3 = error != null ? error.toProto() : null;
            ThemedColorDto warning = this.surrogate.getWarning();
            ThemedColor proto4 = warning != null ? warning.toProto() : null;
            ThemedColorDto ongoing = this.surrogate.getOngoing();
            return new Timeline.ColorOverride(proto, proto2, proto3, proto4, ongoing != null ? ongoing.toProto() : null, null, 32, null);
        }

        public String toString() {
            return "[ColorOverrideDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ColorOverrideDto) && Intrinsics.areEqual(((ColorOverrideDto) other).surrogate, this.surrogate);
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
        /* compiled from: TimelineDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010#¨\u00060"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto$Surrogate;", "", "Lrh_server_driven_ui/v1/ThemedColorDto;", "incomplete", "complete", "error", "warning", "ongoing", "<init>", "(Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getIncomplete", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getIncomplete$annotations", "()V", "getComplete", "getComplete$annotations", "getError", "getError$annotations", "getWarning", "getWarning$annotations", "getOngoing", "getOngoing$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final ThemedColorDto complete;
            private final ThemedColorDto error;
            private final ThemedColorDto incomplete;
            private final ThemedColorDto ongoing;
            private final ThemedColorDto warning;

            public Surrogate() {
                this((ThemedColorDto) null, (ThemedColorDto) null, (ThemedColorDto) null, (ThemedColorDto) null, (ThemedColorDto) null, 31, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.incomplete, surrogate.incomplete) && Intrinsics.areEqual(this.complete, surrogate.complete) && Intrinsics.areEqual(this.error, surrogate.error) && Intrinsics.areEqual(this.warning, surrogate.warning) && Intrinsics.areEqual(this.ongoing, surrogate.ongoing);
            }

            public int hashCode() {
                ThemedColorDto themedColorDto = this.incomplete;
                int iHashCode = (themedColorDto == null ? 0 : themedColorDto.hashCode()) * 31;
                ThemedColorDto themedColorDto2 = this.complete;
                int iHashCode2 = (iHashCode + (themedColorDto2 == null ? 0 : themedColorDto2.hashCode())) * 31;
                ThemedColorDto themedColorDto3 = this.error;
                int iHashCode3 = (iHashCode2 + (themedColorDto3 == null ? 0 : themedColorDto3.hashCode())) * 31;
                ThemedColorDto themedColorDto4 = this.warning;
                int iHashCode4 = (iHashCode3 + (themedColorDto4 == null ? 0 : themedColorDto4.hashCode())) * 31;
                ThemedColorDto themedColorDto5 = this.ongoing;
                return iHashCode4 + (themedColorDto5 != null ? themedColorDto5.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(incomplete=" + this.incomplete + ", complete=" + this.complete + ", error=" + this.error + ", warning=" + this.warning + ", ongoing=" + this.ongoing + ")";
            }

            /* compiled from: TimelineDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return TimelineDto6.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, ThemedColorDto themedColorDto5, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.incomplete = null;
                } else {
                    this.incomplete = themedColorDto;
                }
                if ((i & 2) == 0) {
                    this.complete = null;
                } else {
                    this.complete = themedColorDto2;
                }
                if ((i & 4) == 0) {
                    this.error = null;
                } else {
                    this.error = themedColorDto3;
                }
                if ((i & 8) == 0) {
                    this.warning = null;
                } else {
                    this.warning = themedColorDto4;
                }
                if ((i & 16) == 0) {
                    this.ongoing = null;
                } else {
                    this.ongoing = themedColorDto5;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                ThemedColorDto themedColorDto = self.incomplete;
                if (themedColorDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
                }
                ThemedColorDto themedColorDto2 = self.complete;
                if (themedColorDto2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
                }
                ThemedColorDto themedColorDto3 = self.error;
                if (themedColorDto3 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, ThemedColorDto.Serializer.INSTANCE, themedColorDto3);
                }
                ThemedColorDto themedColorDto4 = self.warning;
                if (themedColorDto4 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, ThemedColorDto.Serializer.INSTANCE, themedColorDto4);
                }
                ThemedColorDto themedColorDto5 = self.ongoing;
                if (themedColorDto5 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, ThemedColorDto.Serializer.INSTANCE, themedColorDto5);
                }
            }

            public Surrogate(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, ThemedColorDto themedColorDto5) {
                this.incomplete = themedColorDto;
                this.complete = themedColorDto2;
                this.error = themedColorDto3;
                this.warning = themedColorDto4;
                this.ongoing = themedColorDto5;
            }

            public /* synthetic */ Surrogate(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, ThemedColorDto themedColorDto5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? null : themedColorDto2, (i & 4) != 0 ? null : themedColorDto3, (i & 8) != 0 ? null : themedColorDto4, (i & 16) != 0 ? null : themedColorDto5);
            }

            public final ThemedColorDto getIncomplete() {
                return this.incomplete;
            }

            public final ThemedColorDto getComplete() {
                return this.complete;
            }

            public final ThemedColorDto getError() {
                return this.error;
            }

            public final ThemedColorDto getWarning() {
                return this.warning;
            }

            public final ThemedColorDto getOngoing() {
                return this.ongoing;
            }
        }

        /* compiled from: TimelineDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;", "Lrh_server_driven_ui/v1/Timeline$ColorOverride;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ColorOverrideDto, Timeline.ColorOverride> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ColorOverrideDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ColorOverrideDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ColorOverrideDto> getBinaryBase64Serializer() {
                return (KSerializer) ColorOverrideDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Timeline.ColorOverride> getProtoAdapter() {
                return Timeline.ColorOverride.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ColorOverrideDto getZeroValue() {
                return ColorOverrideDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ColorOverrideDto fromProto(Timeline.ColorOverride proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                ThemedColor incomplete = proto.getIncomplete();
                DefaultConstructorMarker defaultConstructorMarker = null;
                ThemedColorDto themedColorDtoFromProto = incomplete != null ? ThemedColorDto.INSTANCE.fromProto(incomplete) : null;
                ThemedColor complete = proto.getComplete();
                ThemedColorDto themedColorDtoFromProto2 = complete != null ? ThemedColorDto.INSTANCE.fromProto(complete) : null;
                ThemedColor error = proto.getError();
                ThemedColorDto themedColorDtoFromProto3 = error != null ? ThemedColorDto.INSTANCE.fromProto(error) : null;
                ThemedColor warning = proto.getWarning();
                ThemedColorDto themedColorDtoFromProto4 = warning != null ? ThemedColorDto.INSTANCE.fromProto(warning) : null;
                ThemedColor ongoing = proto.getOngoing();
                return new ColorOverrideDto(new Surrogate(themedColorDtoFromProto, themedColorDtoFromProto2, themedColorDtoFromProto3, themedColorDtoFromProto4, ongoing != null ? ThemedColorDto.INSTANCE.fromProto(ongoing) : null), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TimelineDto$ColorOverrideDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TimelineDto.ColorOverrideDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ColorOverrideDto(null, null, null, null, null, 31, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TimelineDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<ColorOverrideDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Timeline.ColorOverride", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ColorOverrideDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ColorOverrideDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ColorOverrideDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: TimelineDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$ColorOverrideDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "rh_server_driven_ui.v1.TimelineDto$ColorOverrideDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimelineDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/Timeline$WebOrientation;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "WEB_ORIENTATION_UNSPECIFIED", "WEB_ORIENTATION_VERTICAL", "WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN", "WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class WebOrientationDto implements Dto2<Timeline.WebOrientation>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WebOrientationDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<WebOrientationDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<WebOrientationDto, Timeline.WebOrientation>> binaryBase64Serializer$delegate;
        public static final WebOrientationDto WEB_ORIENTATION_UNSPECIFIED = new WEB_ORIENTATION_UNSPECIFIED("WEB_ORIENTATION_UNSPECIFIED", 0);
        public static final WebOrientationDto WEB_ORIENTATION_VERTICAL = new WEB_ORIENTATION_VERTICAL("WEB_ORIENTATION_VERTICAL", 1);
        public static final WebOrientationDto WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN = new WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN("WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN", 2);
        public static final WebOrientationDto WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN = new WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN("WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN", 3);

        private static final /* synthetic */ WebOrientationDto[] $values() {
            return new WebOrientationDto[]{WEB_ORIENTATION_UNSPECIFIED, WEB_ORIENTATION_VERTICAL, WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN, WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN};
        }

        public /* synthetic */ WebOrientationDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<WebOrientationDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TimelineDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineDto.WebOrientationDto.WEB_ORIENTATION_UNSPECIFIED", "Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "toProto", "Lrh_server_driven_ui/v1/Timeline$WebOrientation;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEB_ORIENTATION_UNSPECIFIED extends WebOrientationDto {
            WEB_ORIENTATION_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Timeline.WebOrientation toProto() {
                return Timeline.WebOrientation.WEB_ORIENTATION_UNSPECIFIED;
            }
        }

        private WebOrientationDto(String str, int i) {
        }

        static {
            WebOrientationDto[] webOrientationDtoArr$values = $values();
            $VALUES = webOrientationDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(webOrientationDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TimelineDto$WebOrientationDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TimelineDto.WebOrientationDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TimelineDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineDto.WebOrientationDto.WEB_ORIENTATION_VERTICAL", "Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "toProto", "Lrh_server_driven_ui/v1/Timeline$WebOrientation;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEB_ORIENTATION_VERTICAL extends WebOrientationDto {
            WEB_ORIENTATION_VERTICAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Timeline.WebOrientation toProto() {
                return Timeline.WebOrientation.WEB_ORIENTATION_VERTICAL;
            }
        }

        /* compiled from: TimelineDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineDto.WebOrientationDto.WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN", "Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "toProto", "Lrh_server_driven_ui/v1/Timeline$WebOrientation;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN extends WebOrientationDto {
            WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Timeline.WebOrientation toProto() {
                return Timeline.WebOrientation.WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN;
            }
        }

        /* compiled from: TimelineDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineDto.WebOrientationDto.WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN", "Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "toProto", "Lrh_server_driven_ui/v1/Timeline$WebOrientation;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN extends WebOrientationDto {
            WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Timeline.WebOrientation toProto() {
                return Timeline.WebOrientation.WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TimelineDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "Lrh_server_driven_ui/v1/Timeline$WebOrientation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<WebOrientationDto, Timeline.WebOrientation> {

            /* compiled from: TimelineDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Timeline.WebOrientation.values().length];
                    try {
                        iArr[Timeline.WebOrientation.WEB_ORIENTATION_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Timeline.WebOrientation.WEB_ORIENTATION_VERTICAL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Timeline.WebOrientation.WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Timeline.WebOrientation.WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<WebOrientationDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<WebOrientationDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<WebOrientationDto> getBinaryBase64Serializer() {
                return (KSerializer) WebOrientationDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Timeline.WebOrientation> getProtoAdapter() {
                return Timeline.WebOrientation.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public WebOrientationDto getZeroValue() {
                return WebOrientationDto.WEB_ORIENTATION_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public WebOrientationDto fromProto(Timeline.WebOrientation proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return WebOrientationDto.WEB_ORIENTATION_UNSPECIFIED;
                }
                if (i == 2) {
                    return WebOrientationDto.WEB_ORIENTATION_VERTICAL;
                }
                if (i == 3) {
                    return WebOrientationDto.WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return WebOrientationDto.WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TimelineDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TimelineDto$WebOrientationDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<WebOrientationDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<WebOrientationDto, Timeline.WebOrientation> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.Timeline.WebOrientation", WebOrientationDto.getEntries(), WebOrientationDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public WebOrientationDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (WebOrientationDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, WebOrientationDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static WebOrientationDto valueOf(String str) {
            return (WebOrientationDto) Enum.valueOf(WebOrientationDto.class, str);
        }

        public static WebOrientationDto[] values() {
            return (WebOrientationDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TimelineDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TimelineDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TimelineDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<TimelineDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Timeline", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TimelineDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TimelineDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TimelineDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TimelineDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.TimelineDto";
        }
    }
}
