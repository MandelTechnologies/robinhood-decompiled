package bonfire.proto.idl.portfolio.p037v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.portfolio.p037v1.PositionTextDto;
import bonfire.proto.idl.portfolio.p037v1.PositionValueDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.StructSerializer;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
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

/* compiled from: PositionValueDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u0003\u0018\u00010\n\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u0003\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000eJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0012J\u0017\u0010\r\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u0003\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u0003\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b+\u0010*¨\u00060"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionValueDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/portfolio/v1/PositionValue;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/portfolio/v1/PositionValueDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/portfolio/v1/PositionValueDto$Surrogate;)V", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "text", "", "", "background_color", "border_color", "(Lbonfire/proto/idl/portfolio/v1/PositionTextDto;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "(Lcom/squareup/moshi/Moshi;)Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "toProto", "()Lbonfire/proto/idl/portfolio/v1/PositionValue;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/portfolio/v1/PositionValueDto$Surrogate;", "getText", "()Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "getBackground_color", "()Ljava/util/Map;", "getBorder_color", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class PositionValueDto implements Dto3<PositionValue>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PositionValueDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PositionValueDto, PositionValue>> binaryBase64Serializer$delegate;
    private static final PositionValueDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PositionValueDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PositionValueDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PositionTextDto getText() {
        return this.surrogate.getText();
    }

    public final Map<String, ?> getBackground_color() {
        return this.surrogate.getBackground_color();
    }

    public final Map<String, ?> getBorder_color() {
        return this.surrogate.getBorder_color();
    }

    public /* synthetic */ PositionValueDto(PositionTextDto positionTextDto, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : positionTextDto, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2);
    }

    public PositionValueDto(PositionTextDto positionTextDto, Map<String, ?> map, Map<String, ?> map2) {
        this(new Surrogate(positionTextDto, map, map2));
    }

    public final ThemedColor background_color(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Map<String, ?> background_color = getBackground_color();
        if (background_color != null) {
            return (ThemedColor) _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.nullableTypeOf(ThemedColor.class)).fromJsonValue(background_color);
        }
        return null;
    }

    public final ThemedColor border_color(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Map<String, ?> border_color = getBorder_color();
        if (border_color != null) {
            return (ThemedColor) _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.nullableTypeOf(ThemedColor.class)).fromJsonValue(border_color);
        }
        return null;
    }

    @Override // com.robinhood.idl.Dto
    public PositionValue toProto() {
        PositionTextDto text = this.surrogate.getText();
        return new PositionValue(text != null ? text.toProto() : null, this.surrogate.getBackground_color(), this.surrogate.getBorder_color(), null, 8, null);
    }

    public String toString() {
        return "[PositionValueDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PositionValueDto) && Intrinsics.areEqual(((PositionValueDto) other).surrogate, this.surrogate);
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
    /* compiled from: PositionValueDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012'\b\u0002\u0010\t\u001a!\u0012\u0004\u0012\u00020\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0018\u00010\u0004\u0012'\b\u0002\u0010\n\u001a!\u0012\u0004\u0012\u00020\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R?\u0010\t\u001a!\u0012\u0004\u0012\u00020\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R?\u0010\n\u001a!\u0012\u0004\u0012\u00020\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010(\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010*¨\u00060"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionValueDto$Surrogate;", "", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "text", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/StructSerializer;", "background_color", "border_color", "<init>", "(Lbonfire/proto/idl/portfolio/v1/PositionTextDto;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/portfolio/v1/PositionTextDto;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_portfolio_v1_externalRelease", "(Lbonfire/proto/idl/portfolio/v1/PositionValueDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "getText", "()Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "getText$annotations", "()V", "Ljava/util/Map;", "getBackground_color", "()Ljava/util/Map;", "getBackground_color$annotations", "getBorder_color", "getBorder_color$annotations", "Companion", "$serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, Object> background_color;
        private final Map<String, Object> border_color;
        private final PositionTextDto text;

        public Surrogate() {
            this((PositionTextDto) null, (Map) null, (Map) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializers.getNullable(StructSerializer.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
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
            return Intrinsics.areEqual(this.text, surrogate.text) && Intrinsics.areEqual(this.background_color, surrogate.background_color) && Intrinsics.areEqual(this.border_color, surrogate.border_color);
        }

        public int hashCode() {
            PositionTextDto positionTextDto = this.text;
            int iHashCode = (positionTextDto == null ? 0 : positionTextDto.hashCode()) * 31;
            Map<String, Object> map = this.background_color;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, Object> map2 = this.border_color;
            return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(text=" + this.text + ", background_color=" + this.background_color + ", border_color=" + this.border_color + ")";
        }

        /* compiled from: PositionValueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionValueDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/PositionValueDto$Surrogate;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PositionValueDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionValueDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionValueDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionValueDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionValueDto.Surrogate._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, PositionTextDto positionTextDto, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.text = null;
            } else {
                this.text = positionTextDto;
            }
            if ((i & 2) == 0) {
                this.background_color = null;
            } else {
                this.background_color = map;
            }
            if ((i & 4) == 0) {
                this.border_color = null;
            } else {
                this.border_color = map2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_portfolio_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            PositionTextDto positionTextDto = self.text;
            if (positionTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, PositionTextDto.Serializer.INSTANCE, positionTextDto);
            }
            if (self.background_color != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.background_color);
            }
            if (self.border_color != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.border_color);
            }
        }

        public Surrogate(PositionTextDto positionTextDto, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
            this.text = positionTextDto;
            this.background_color = map;
            this.border_color = map2;
        }

        public /* synthetic */ Surrogate(PositionTextDto positionTextDto, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : positionTextDto, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2);
        }

        public final PositionTextDto getText() {
            return this.text;
        }

        public final Map<String, Object> getBackground_color() {
            return this.background_color;
        }

        public final Map<String, Object> getBorder_color() {
            return this.border_color;
        }
    }

    /* compiled from: PositionValueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionValueDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/portfolio/v1/PositionValueDto;", "Lbonfire/proto/idl/portfolio/v1/PositionValue;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/portfolio/v1/PositionValueDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PositionValueDto, PositionValue> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PositionValueDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionValueDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionValueDto> getBinaryBase64Serializer() {
            return (KSerializer) PositionValueDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PositionValue> getProtoAdapter() {
            return PositionValue.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionValueDto getZeroValue() {
            return PositionValueDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionValueDto fromProto(PositionValue proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            PositionText text = proto.getText();
            return new PositionValueDto(new Surrogate(text != null ? PositionTextDto.INSTANCE.fromProto(text) : null, proto.getBackground_color(), proto.getBorder_color()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionValueDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionValueDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new PositionValueDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PositionValueDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionValueDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/PositionValueDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/portfolio/v1/PositionValueDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PositionValueDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.portfolio.v1.PositionValue", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PositionValueDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PositionValueDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PositionValueDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PositionValueDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionValueDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.portfolio.v1.PositionValueDto";
        }
    }
}
