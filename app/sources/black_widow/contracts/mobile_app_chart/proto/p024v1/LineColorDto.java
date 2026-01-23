package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.extensions.ResourceTypes;
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
import rh_server_driven_ui.p531v1.ThemedColor;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: LineColorDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0014¨\u0006/"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColor;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto$Surrogate;)V", "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "opacity", "", AnnotatedPrivateKey.LABEL, "(Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)V", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColor;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto$Surrogate;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getIndex", "()Ljava/lang/Integer;", "getOpacity", "()Ljava/lang/Double;", "getLabel", "Companion", "Surrogate", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class LineColorDto implements Dto3<LineColor>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LineColorDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LineColorDto, LineColor>> binaryBase64Serializer$delegate;
    private static final LineColorDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LineColorDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LineColorDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ThemedColorDto getColor() {
        return this.surrogate.getColor();
    }

    public final Integer getIndex() {
        return this.surrogate.getIndex();
    }

    public final Double getOpacity() {
        return this.surrogate.getOpacity();
    }

    public final String getLabel() {
        return this.surrogate.getLabel();
    }

    public /* synthetic */ LineColorDto(ThemedColorDto themedColorDto, Integer num, Double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : str);
    }

    public LineColorDto(ThemedColorDto themedColorDto, Integer num, Double d, String str) {
        this(new Surrogate(themedColorDto, num, d, str));
    }

    @Override // com.robinhood.idl.Dto
    public LineColor toProto() {
        ThemedColorDto color = this.surrogate.getColor();
        return new LineColor(color != null ? color.toProto() : null, this.surrogate.getIndex(), this.surrogate.getOpacity(), this.surrogate.getLabel(), null, 16, null);
    }

    public String toString() {
        return "[LineColorDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LineColorDto) && Intrinsics.areEqual(((LineColorDto) other).surrogate, this.surrogate);
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
    /* compiled from: LineColorDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0019\b\u0002\u0010\b\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0019\b\u0002\u0010\u000b\u001a\u0013\u0018\u00010\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBC\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R1\u0010\b\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R1\u0010\u000b\u001a\u0013\u0018\u00010\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\b4\u0010)\u001a\u0004\b3\u0010\u001e¨\u00067"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto$Surrogate;", "", "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "opacity", "", AnnotatedPrivateKey.LABEL, "<init>", "(Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor$annotations", "()V", "Ljava/lang/Integer;", "getIndex", "()Ljava/lang/Integer;", "getIndex$annotations", "Ljava/lang/Double;", "getOpacity", "()Ljava/lang/Double;", "getOpacity$annotations", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemedColorDto color;
        private final Integer index;
        private final String label;
        private final Double opacity;

        public Surrogate() {
            this((ThemedColorDto) null, (Integer) null, (Double) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.color, surrogate.color) && Intrinsics.areEqual(this.index, surrogate.index) && Intrinsics.areEqual((Object) this.opacity, (Object) surrogate.opacity) && Intrinsics.areEqual(this.label, surrogate.label);
        }

        public int hashCode() {
            ThemedColorDto themedColorDto = this.color;
            int iHashCode = (themedColorDto == null ? 0 : themedColorDto.hashCode()) * 31;
            Integer num = this.index;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Double d = this.opacity;
            int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.label;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(color=" + this.color + ", index=" + this.index + ", opacity=" + this.opacity + ", label=" + this.label + ")";
        }

        /* compiled from: LineColorDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LineColorDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ThemedColorDto themedColorDto, Integer num, Double d, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.color = null;
            } else {
                this.color = themedColorDto;
            }
            if ((i & 2) == 0) {
                this.index = null;
            } else {
                this.index = num;
            }
            if ((i & 4) == 0) {
                this.opacity = null;
            } else {
                this.opacity = d;
            }
            if ((i & 8) == 0) {
                this.label = null;
            } else {
                this.label = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ThemedColorDto themedColorDto = self.color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            Integer num = self.index;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            Double d = self.opacity;
            if (d != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, d);
            }
            String str = self.label;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(ThemedColorDto themedColorDto, Integer num, Double d, String str) {
            this.color = themedColorDto;
            this.index = num;
            this.opacity = d;
            this.label = str;
        }

        public /* synthetic */ Surrogate(ThemedColorDto themedColorDto, Integer num, Double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : str);
        }

        public final ThemedColorDto getColor() {
            return this.color;
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final Double getOpacity() {
            return this.opacity;
        }

        public final String getLabel() {
            return this.label;
        }
    }

    /* compiled from: LineColorDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColor;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LineColorDto, LineColor> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LineColorDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LineColorDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LineColorDto> getBinaryBase64Serializer() {
            return (KSerializer) LineColorDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LineColor> getProtoAdapter() {
            return LineColor.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LineColorDto getZeroValue() {
            return LineColorDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LineColorDto fromProto(LineColor proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ThemedColor color = proto.getColor();
            return new LineColorDto(new Surrogate(color != null ? ThemedColorDto.INSTANCE.fromProto(color) : null, proto.getIndex(), proto.getOpacity(), proto.getLabel()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.LineColorDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LineColorDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new LineColorDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LineColorDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LineColorDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.LineColor", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LineColorDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LineColorDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LineColorDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LineColorDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.LineColorDto";
        }
    }
}
