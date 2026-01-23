package bonfire.proto.idl.portfolio.p037v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.portfolio.p037v1.PositionTextDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.StructSerializer;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PositionTextDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/portfolio/v1/PositionText;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/portfolio/v1/PositionTextDto$Surrogate;)V", "", "", ResourceTypes.COLOR, "value", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "(Lcom/squareup/moshi/Moshi;)Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "toProto", "()Lbonfire/proto/idl/portfolio/v1/PositionText;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto$Surrogate;", "getColor", "()Ljava/util/Map;", "getValue", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class PositionTextDto implements Dto3<PositionText>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PositionTextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PositionTextDto, PositionText>> binaryBase64Serializer$delegate;
    private static final PositionTextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PositionTextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PositionTextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final Map<String, ?> getColor() {
        return this.surrogate.getColor();
    }

    public final String getValue() {
        return this.surrogate.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PositionTextDto(Map<String, ?> map, String value) {
        this(new Surrogate(map, value));
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public /* synthetic */ PositionTextDto(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Map<String, ?>) ((i & 1) != 0 ? null : map), (i & 2) != 0 ? "" : str);
    }

    public final ThemedColor color(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Map<String, ?> color = getColor();
        if (color != null) {
            return (ThemedColor) _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.nullableTypeOf(ThemedColor.class)).fromJsonValue(color);
        }
        return null;
    }

    @Override // com.robinhood.idl.Dto
    public PositionText toProto() {
        return new PositionText(this.surrogate.getColor(), this.surrogate.getValue(), null, 4, null);
    }

    public String toString() {
        return "[PositionTextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PositionTextDto) && Intrinsics.areEqual(((PositionTextDto) other).surrogate, this.surrogate);
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
    /* compiled from: PositionTextDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B:\u0012'\b\u0002\u0010\u0007\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R?\u0010\u0007\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001a¨\u0006+"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionTextDto$Surrogate;", "", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/StructSerializer;", ResourceTypes.COLOR, "value", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_portfolio_v1_externalRelease", "(Lbonfire/proto/idl/portfolio/v1/PositionTextDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getColor", "()Ljava/util/Map;", "getColor$annotations", "()V", "Ljava/lang/String;", "getValue", "getValue$annotations", "Companion", "$serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final Map<String, Object> color;
        private final String value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionTextDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionTextDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((Map) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.color, surrogate.color) && Intrinsics.areEqual(this.value, surrogate.value);
        }

        public int hashCode() {
            Map<String, Object> map = this.color;
            return ((map == null ? 0 : map.hashCode()) * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Surrogate(color=" + this.color + ", value=" + this.value + ")";
        }

        /* compiled from: PositionTextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionTextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto$Surrogate;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PositionTextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, Map map, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.color = (i & 1) == 0 ? null : map;
            if ((i & 2) == 0) {
                this.value = "";
            } else {
                this.value = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_portfolio_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.color != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.color);
            }
            if (Intrinsics.areEqual(self.value, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.value);
        }

        public Surrogate(Map<String, ? extends Object> map, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.color = map;
            this.value = value;
        }

        public final Map<String, Object> getColor() {
            return this.color;
        }

        public final String getValue() {
            return this.value;
        }

        public /* synthetic */ Surrogate(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? "" : str);
        }
    }

    /* compiled from: PositionTextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionTextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "Lbonfire/proto/idl/portfolio/v1/PositionText;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PositionTextDto, PositionText> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PositionTextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionTextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionTextDto> getBinaryBase64Serializer() {
            return (KSerializer) PositionTextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PositionText> getProtoAdapter() {
            return PositionText.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionTextDto getZeroValue() {
            return PositionTextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionTextDto fromProto(PositionText proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PositionTextDto(new Surrogate(proto.getColor(), proto.getValue()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionTextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionTextDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PositionTextDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PositionTextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionTextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PositionTextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.portfolio.v1.PositionText", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PositionTextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PositionTextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PositionTextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PositionTextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionTextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.portfolio.v1.PositionTextDto";
        }
    }
}
