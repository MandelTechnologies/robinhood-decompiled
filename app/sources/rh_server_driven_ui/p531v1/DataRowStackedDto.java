package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.IconWithActionDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: DataRowStackedDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0015¨\u00061"}, m3636d2 = {"Lrh_server_driven_ui/v1/DataRowStackedDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/DataRowStacked;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/DataRowStackedDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/DataRowStackedDto$Surrogate;)V", "", AnnotatedPrivateKey.LABEL, "Lrh_server_driven_ui/v1/IconWithActionDto;", "label_icon", "value", "Lrh_server_driven_ui/v1/ThemedColorDto;", "label_color", "value_color_override", "value_description", "(Ljava/lang/String;Lrh_server_driven_ui/v1/IconWithActionDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;)V", "toProto", "()Lrh_server_driven_ui/v1/DataRowStacked;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/DataRowStackedDto$Surrogate;", "getLabel", "getLabel_icon", "()Lrh_server_driven_ui/v1/IconWithActionDto;", "getValue", "getValue_color_override", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getValue_description", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class DataRowStackedDto implements Dto3<DataRowStacked>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DataRowStackedDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DataRowStackedDto, DataRowStacked>> binaryBase64Serializer$delegate;
    private static final DataRowStackedDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DataRowStackedDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DataRowStackedDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getLabel() {
        return this.surrogate.getLabel();
    }

    public final IconWithActionDto getLabel_icon() {
        return this.surrogate.getLabel_icon();
    }

    public final String getValue() {
        return this.surrogate.getValue();
    }

    public final ThemedColorDto getValue_color_override() {
        return this.surrogate.getValue_color_override();
    }

    public final String getValue_description() {
        return this.surrogate.getValue_description();
    }

    public /* synthetic */ DataRowStackedDto(String str, IconWithActionDto iconWithActionDto, String str2, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : iconWithActionDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : themedColorDto, (i & 16) != 0 ? null : themedColorDto2, (i & 32) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataRowStackedDto(String label, IconWithActionDto iconWithActionDto, String value, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, String str) {
        this(new Surrogate(label, iconWithActionDto, value, themedColorDto, themedColorDto2, str));
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.robinhood.idl.Dto
    public DataRowStacked toProto() {
        String label = this.surrogate.getLabel();
        IconWithActionDto label_icon = this.surrogate.getLabel_icon();
        IconWithAction proto = label_icon != null ? label_icon.toProto() : null;
        String value = this.surrogate.getValue();
        ThemedColorDto label_color = this.surrogate.getLabel_color();
        ThemedColor proto2 = label_color != null ? label_color.toProto() : null;
        ThemedColorDto value_color_override = this.surrogate.getValue_color_override();
        return new DataRowStacked(label, proto, value, proto2, value_color_override != null ? value_color_override.toProto() : null, this.surrogate.getValue_description(), null, 64, null);
    }

    public String toString() {
        return "[DataRowStackedDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DataRowStackedDto) && Intrinsics.areEqual(((DataRowStackedDto) other).surrogate, this.surrogate);
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
    /* compiled from: DataRowStackedDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b0\u0010&\u001a\u0004\b.\u0010/R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010/R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010#\u0012\u0004\b4\u0010&\u001a\u0004\b3\u0010\u001c¨\u00067"}, m3636d2 = {"Lrh_server_driven_ui/v1/DataRowStackedDto$Surrogate;", "", "", AnnotatedPrivateKey.LABEL, "Lrh_server_driven_ui/v1/IconWithActionDto;", "label_icon", "value", "Lrh_server_driven_ui/v1/ThemedColorDto;", "label_color", "value_color_override", "value_description", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/IconWithActionDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/IconWithActionDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/DataRowStackedDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "()V", "Lrh_server_driven_ui/v1/IconWithActionDto;", "getLabel_icon", "()Lrh_server_driven_ui/v1/IconWithActionDto;", "getLabel_icon$annotations", "getValue", "getValue$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getLabel_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getLabel_color$annotations", "getValue_color_override", "getValue_color_override$annotations", "getValue_description", "getValue_description$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String label;
        private final ThemedColorDto label_color;
        private final IconWithActionDto label_icon;
        private final String value;
        private final ThemedColorDto value_color_override;
        private final String value_description;

        public Surrogate() {
            this((String) null, (IconWithActionDto) null, (String) null, (ThemedColorDto) null, (ThemedColorDto) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.label, surrogate.label) && Intrinsics.areEqual(this.label_icon, surrogate.label_icon) && Intrinsics.areEqual(this.value, surrogate.value) && Intrinsics.areEqual(this.label_color, surrogate.label_color) && Intrinsics.areEqual(this.value_color_override, surrogate.value_color_override) && Intrinsics.areEqual(this.value_description, surrogate.value_description);
        }

        public int hashCode() {
            int iHashCode = this.label.hashCode() * 31;
            IconWithActionDto iconWithActionDto = this.label_icon;
            int iHashCode2 = (((iHashCode + (iconWithActionDto == null ? 0 : iconWithActionDto.hashCode())) * 31) + this.value.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.label_color;
            int iHashCode3 = (iHashCode2 + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            ThemedColorDto themedColorDto2 = this.value_color_override;
            int iHashCode4 = (iHashCode3 + (themedColorDto2 == null ? 0 : themedColorDto2.hashCode())) * 31;
            String str = this.value_description;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(label=" + this.label + ", label_icon=" + this.label_icon + ", value=" + this.value + ", label_color=" + this.label_color + ", value_color_override=" + this.value_color_override + ", value_description=" + this.value_description + ")";
        }

        /* compiled from: DataRowStackedDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/DataRowStackedDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DataRowStackedDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DataRowStackedDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, IconWithActionDto iconWithActionDto, String str2, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.label = "";
            } else {
                this.label = str;
            }
            if ((i & 2) == 0) {
                this.label_icon = null;
            } else {
                this.label_icon = iconWithActionDto;
            }
            if ((i & 4) == 0) {
                this.value = "";
            } else {
                this.value = str2;
            }
            if ((i & 8) == 0) {
                this.label_color = null;
            } else {
                this.label_color = themedColorDto;
            }
            if ((i & 16) == 0) {
                this.value_color_override = null;
            } else {
                this.value_color_override = themedColorDto2;
            }
            if ((i & 32) == 0) {
                this.value_description = null;
            } else {
                this.value_description = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.label, "")) {
                output.encodeStringElement(serialDesc, 0, self.label);
            }
            IconWithActionDto iconWithActionDto = self.label_icon;
            if (iconWithActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, IconWithActionDto.Serializer.INSTANCE, iconWithActionDto);
            }
            if (!Intrinsics.areEqual(self.value, "")) {
                output.encodeStringElement(serialDesc, 2, self.value);
            }
            ThemedColorDto themedColorDto = self.label_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ThemedColorDto themedColorDto2 = self.value_color_override;
            if (themedColorDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
            }
            String str = self.value_description;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String label, IconWithActionDto iconWithActionDto, String value, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, String str) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.label = label;
            this.label_icon = iconWithActionDto;
            this.value = value;
            this.label_color = themedColorDto;
            this.value_color_override = themedColorDto2;
            this.value_description = str;
        }

        public /* synthetic */ Surrogate(String str, IconWithActionDto iconWithActionDto, String str2, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : iconWithActionDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : themedColorDto, (i & 16) != 0 ? null : themedColorDto2, (i & 32) != 0 ? null : str3);
        }

        public final String getLabel() {
            return this.label;
        }

        public final IconWithActionDto getLabel_icon() {
            return this.label_icon;
        }

        public final String getValue() {
            return this.value;
        }

        public final ThemedColorDto getLabel_color() {
            return this.label_color;
        }

        public final ThemedColorDto getValue_color_override() {
            return this.value_color_override;
        }

        public final String getValue_description() {
            return this.value_description;
        }
    }

    /* compiled from: DataRowStackedDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DataRowStackedDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/DataRowStackedDto;", "Lrh_server_driven_ui/v1/DataRowStacked;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DataRowStackedDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<DataRowStackedDto, DataRowStacked> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DataRowStackedDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DataRowStackedDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DataRowStackedDto> getBinaryBase64Serializer() {
            return (KSerializer) DataRowStackedDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DataRowStacked> getProtoAdapter() {
            return DataRowStacked.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DataRowStackedDto getZeroValue() {
            return DataRowStackedDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DataRowStackedDto fromProto(DataRowStacked proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String label = proto.getLabel();
            IconWithAction label_icon = proto.getLabel_icon();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IconWithActionDto iconWithActionDtoFromProto = label_icon != null ? IconWithActionDto.INSTANCE.fromProto(label_icon) : null;
            String value = proto.getValue();
            ThemedColor label_color = proto.getLabel_color();
            ThemedColorDto themedColorDtoFromProto = label_color != null ? ThemedColorDto.INSTANCE.fromProto(label_color) : null;
            ThemedColor value_color_override = proto.getValue_color_override();
            return new DataRowStackedDto(new Surrogate(label, iconWithActionDtoFromProto, value, themedColorDtoFromProto, value_color_override != null ? ThemedColorDto.INSTANCE.fromProto(value_color_override) : null, proto.getValue_description()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DataRowStackedDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DataRowStackedDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DataRowStackedDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DataRowStackedDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/DataRowStackedDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DataRowStackedDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/DataRowStackedDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<DataRowStackedDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.DataRowStacked", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DataRowStackedDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DataRowStackedDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DataRowStackedDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DataRowStackedDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/DataRowStackedDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.DataRowStackedDto";
        }
    }
}
