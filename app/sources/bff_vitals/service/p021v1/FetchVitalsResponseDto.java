package bff_vitals.service.p021v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_vitals.service.p021v1.FetchVitalsResponse;
import bff_vitals.service.p021v1.FetchVitalsResponseDto;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: FetchVitalsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_vitals/service/v1/FetchVitalsResponse;", "Landroid/os/Parcelable;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$Surrogate;", "surrogate", "<init>", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$Surrogate;)V", "", "clear_cache_created_before_timestamp", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;", "unsupported_version_content", "(ILbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;)V", "toProto", "()Lbff_vitals/service/v1/FetchVitalsResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_vitals/service/v1/FetchVitalsResponseDto$Surrogate;", "getClear_cache_created_before_timestamp", "getUnsupported_version_content", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;", "Companion", "Surrogate", "UnsupportedVersionContentDto", "Serializer", "MultibindingModule", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class FetchVitalsResponseDto implements Dto3<FetchVitalsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FetchVitalsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FetchVitalsResponseDto, FetchVitalsResponse>> binaryBase64Serializer$delegate;
    private static final FetchVitalsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FetchVitalsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FetchVitalsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getClear_cache_created_before_timestamp() {
        return this.surrogate.getClear_cache_created_before_timestamp();
    }

    public final UnsupportedVersionContentDto getUnsupported_version_content() {
        return this.surrogate.getUnsupported_version_content();
    }

    public FetchVitalsResponseDto(int i, UnsupportedVersionContentDto unsupportedVersionContentDto) {
        this(new Surrogate(i, unsupportedVersionContentDto));
    }

    public /* synthetic */ FetchVitalsResponseDto(int i, UnsupportedVersionContentDto unsupportedVersionContentDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : unsupportedVersionContentDto);
    }

    @Override // com.robinhood.idl.Dto
    public FetchVitalsResponse toProto() {
        int clear_cache_created_before_timestamp = this.surrogate.getClear_cache_created_before_timestamp();
        UnsupportedVersionContentDto unsupported_version_content = this.surrogate.getUnsupported_version_content();
        return new FetchVitalsResponse(clear_cache_created_before_timestamp, unsupported_version_content != null ? unsupported_version_content.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[FetchVitalsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FetchVitalsResponseDto) && Intrinsics.areEqual(((FetchVitalsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: FetchVitalsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B,\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB-\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'¨\u0006+"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "clear_cache_created_before_timestamp", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;", "unsupported_version_content", "<init>", "(ILbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_vitals_v1_externalRelease", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getClear_cache_created_before_timestamp", "getClear_cache_created_before_timestamp$annotations", "()V", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;", "getUnsupported_version_content", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;", "getUnsupported_version_content$annotations", "Companion", "$serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int clear_cache_created_before_timestamp;
        private final UnsupportedVersionContentDto unsupported_version_content;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this(0, (UnsupportedVersionContentDto) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.clear_cache_created_before_timestamp == surrogate.clear_cache_created_before_timestamp && Intrinsics.areEqual(this.unsupported_version_content, surrogate.unsupported_version_content);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.clear_cache_created_before_timestamp) * 31;
            UnsupportedVersionContentDto unsupportedVersionContentDto = this.unsupported_version_content;
            return iHashCode + (unsupportedVersionContentDto == null ? 0 : unsupportedVersionContentDto.hashCode());
        }

        public String toString() {
            return "Surrogate(clear_cache_created_before_timestamp=" + this.clear_cache_created_before_timestamp + ", unsupported_version_content=" + this.unsupported_version_content + ")";
        }

        /* compiled from: FetchVitalsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$Surrogate;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FetchVitalsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, UnsupportedVersionContentDto unsupportedVersionContentDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.clear_cache_created_before_timestamp = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.unsupported_version_content = null;
            } else {
                this.unsupported_version_content = unsupportedVersionContentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_vitals_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            int i = self.clear_cache_created_before_timestamp;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            UnsupportedVersionContentDto unsupportedVersionContentDto = self.unsupported_version_content;
            if (unsupportedVersionContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, UnsupportedVersionContentDto.Serializer.INSTANCE, unsupportedVersionContentDto);
            }
        }

        public Surrogate(int i, UnsupportedVersionContentDto unsupportedVersionContentDto) {
            this.clear_cache_created_before_timestamp = i;
            this.unsupported_version_content = unsupportedVersionContentDto;
        }

        public /* synthetic */ Surrogate(int i, UnsupportedVersionContentDto unsupportedVersionContentDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : unsupportedVersionContentDto);
        }

        public final int getClear_cache_created_before_timestamp() {
            return this.clear_cache_created_before_timestamp;
        }

        public final UnsupportedVersionContentDto getUnsupported_version_content() {
            return this.unsupported_version_content;
        }
    }

    /* compiled from: FetchVitalsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_vitals/service/v1/FetchVitalsResponseDto;", "Lbff_vitals/service/v1/FetchVitalsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_vitals/service/v1/FetchVitalsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FetchVitalsResponseDto, FetchVitalsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FetchVitalsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FetchVitalsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FetchVitalsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) FetchVitalsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FetchVitalsResponse> getProtoAdapter() {
            return FetchVitalsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FetchVitalsResponseDto getZeroValue() {
            return FetchVitalsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FetchVitalsResponseDto fromProto(FetchVitalsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int clear_cache_created_before_timestamp = proto.getClear_cache_created_before_timestamp();
            FetchVitalsResponse.UnsupportedVersionContent unsupported_version_content = proto.getUnsupported_version_content();
            return new FetchVitalsResponseDto(new Surrogate(clear_cache_created_before_timestamp, unsupported_version_content != null ? UnsupportedVersionContentDto.INSTANCE.fromProto(unsupported_version_content) : null), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_vitals.service.v1.FetchVitalsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FetchVitalsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FetchVitalsResponseDto(0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FetchVitalsResponseDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005(')*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006,"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent;", "Landroid/os/Parcelable;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$Surrogate;", "surrogate", "<init>", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$Surrogate;)V", "", "message_title", "message_body_markdown", "", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto;", CarResultComposable2.BUTTONS, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toProto", "()Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$Surrogate;", "getMessage_title", "getMessage_body_markdown", "getButtons", "()Ljava/util/List;", "Companion", "Surrogate", "ButtonDto", "Serializer", "MultibindingModule", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UnsupportedVersionContentDto implements Dto3<FetchVitalsResponse.UnsupportedVersionContent>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<UnsupportedVersionContentDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<UnsupportedVersionContentDto, FetchVitalsResponse.UnsupportedVersionContent>> binaryBase64Serializer$delegate;
        private static final UnsupportedVersionContentDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ UnsupportedVersionContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private UnsupportedVersionContentDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getMessage_title() {
            return this.surrogate.getMessage_title();
        }

        public final String getMessage_body_markdown() {
            return this.surrogate.getMessage_body_markdown();
        }

        public final List<ButtonDto> getButtons() {
            return this.surrogate.getButtons();
        }

        public /* synthetic */ UnsupportedVersionContentDto(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public UnsupportedVersionContentDto(String message_title, String message_body_markdown, List<ButtonDto> buttons) {
            this(new Surrogate(message_title, message_body_markdown, buttons));
            Intrinsics.checkNotNullParameter(message_title, "message_title");
            Intrinsics.checkNotNullParameter(message_body_markdown, "message_body_markdown");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
        }

        @Override // com.robinhood.idl.Dto
        public FetchVitalsResponse.UnsupportedVersionContent toProto() {
            String message_title = this.surrogate.getMessage_title();
            String message_body_markdown = this.surrogate.getMessage_body_markdown();
            List<ButtonDto> buttons = this.surrogate.getButtons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
            Iterator<T> it = buttons.iterator();
            while (it.hasNext()) {
                arrayList.add(((ButtonDto) it.next()).toProto());
            }
            return new FetchVitalsResponse.UnsupportedVersionContent(message_title, message_body_markdown, arrayList, null, 8, null);
        }

        public String toString() {
            return "[UnsupportedVersionContentDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof UnsupportedVersionContentDto) && Intrinsics.areEqual(((UnsupportedVersionContentDto) other).surrogate, this.surrogate);
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
        /* compiled from: FetchVitalsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0019R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b)\u0010#\u001a\u0004\b'\u0010(¨\u0006,"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$Surrogate;", "", "", "message_title", "message_body_markdown", "", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto;", CarResultComposable2.BUTTONS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_vitals_v1_externalRelease", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage_title", "getMessage_title$annotations", "()V", "getMessage_body_markdown", "getMessage_body_markdown$annotations", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "getButtons$annotations", "Companion", "$serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final List<ButtonDto> buttons;
            private final String message_body_markdown;
            private final String message_title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FetchVitalsResponseDto.UnsupportedVersionContentDto.Surrogate._childSerializers$_anonymous_();
                }
            })};

            public Surrogate() {
                this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(ButtonDto.Serializer.INSTANCE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.message_title, surrogate.message_title) && Intrinsics.areEqual(this.message_body_markdown, surrogate.message_body_markdown) && Intrinsics.areEqual(this.buttons, surrogate.buttons);
            }

            public int hashCode() {
                return (((this.message_title.hashCode() * 31) + this.message_body_markdown.hashCode()) * 31) + this.buttons.hashCode();
            }

            public String toString() {
                return "Surrogate(message_title=" + this.message_title + ", message_body_markdown=" + this.message_body_markdown + ", buttons=" + this.buttons + ")";
            }

            /* compiled from: FetchVitalsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$Surrogate;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return FetchVitalsResponseDto6.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.message_title = "";
                } else {
                    this.message_title = str;
                }
                if ((i & 2) == 0) {
                    this.message_body_markdown = "";
                } else {
                    this.message_body_markdown = str2;
                }
                if ((i & 4) == 0) {
                    this.buttons = CollectionsKt.emptyList();
                } else {
                    this.buttons = list;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$bff_vitals_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (!Intrinsics.areEqual(self.message_title, "")) {
                    output.encodeStringElement(serialDesc, 0, self.message_title);
                }
                if (!Intrinsics.areEqual(self.message_body_markdown, "")) {
                    output.encodeStringElement(serialDesc, 1, self.message_body_markdown);
                }
                if (Intrinsics.areEqual(self.buttons, CollectionsKt.emptyList())) {
                    return;
                }
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.buttons);
            }

            public Surrogate(String message_title, String message_body_markdown, List<ButtonDto> buttons) {
                Intrinsics.checkNotNullParameter(message_title, "message_title");
                Intrinsics.checkNotNullParameter(message_body_markdown, "message_body_markdown");
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                this.message_title = message_title;
                this.message_body_markdown = message_body_markdown;
                this.buttons = buttons;
            }

            public /* synthetic */ Surrogate(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
            }

            public final String getMessage_title() {
                return this.message_title;
            }

            public final String getMessage_body_markdown() {
                return this.message_body_markdown;
            }

            public final List<ButtonDto> getButtons() {
                return this.buttons;
            }
        }

        /* compiled from: FetchVitalsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<UnsupportedVersionContentDto, FetchVitalsResponse.UnsupportedVersionContent> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UnsupportedVersionContentDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UnsupportedVersionContentDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UnsupportedVersionContentDto> getBinaryBase64Serializer() {
                return (KSerializer) UnsupportedVersionContentDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FetchVitalsResponse.UnsupportedVersionContent> getProtoAdapter() {
                return FetchVitalsResponse.UnsupportedVersionContent.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UnsupportedVersionContentDto getZeroValue() {
                return UnsupportedVersionContentDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UnsupportedVersionContentDto fromProto(FetchVitalsResponse.UnsupportedVersionContent proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String message_title = proto.getMessage_title();
                String message_body_markdown = proto.getMessage_body_markdown();
                List<FetchVitalsResponse.UnsupportedVersionContent.Button> buttons = proto.getButtons();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
                Iterator<T> it = buttons.iterator();
                while (it.hasNext()) {
                    arrayList.add(ButtonDto.INSTANCE.fromProto((FetchVitalsResponse.UnsupportedVersionContent.Button) it.next()));
                }
                return new UnsupportedVersionContentDto(new Surrogate(message_title, message_body_markdown, arrayList), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FetchVitalsResponseDto.UnsupportedVersionContentDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new UnsupportedVersionContentDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FetchVitalsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b'&()*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006."}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button;", "Landroid/os/Parcelable;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$Surrogate;", "surrogate", "<init>", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$Surrogate;)V", "", AnnotatedPrivateKey.LABEL, "", "is_primary", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;", "action", "(Ljava/lang/String;ZLbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;)V", "toProto", "()Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$Surrogate;", "getLabel", "()Z", "getAction", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;", "Companion", "Surrogate", "ActionDto", "CancelActionDto", "OpenAppStoreActionDto", "DismissActionDto", "Serializer", "MultibindingModule", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class ButtonDto implements Dto3<FetchVitalsResponse.UnsupportedVersionContent.Button>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<ButtonDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<ButtonDto, FetchVitalsResponse.UnsupportedVersionContent.Button>> binaryBase64Serializer$delegate;
            private static final ButtonDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ ButtonDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private ButtonDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final String getLabel() {
                return this.surrogate.getLabel();
            }

            public final boolean is_primary() {
                return this.surrogate.getIs_primary();
            }

            public final ActionDto getAction() {
                return this.surrogate.getAction();
            }

            public /* synthetic */ ButtonDto(String str, boolean z, ActionDto actionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : actionDto);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public ButtonDto(String label, boolean z, ActionDto actionDto) {
                this(new Surrogate(label, z, actionDto));
                Intrinsics.checkNotNullParameter(label, "label");
            }

            @Override // com.robinhood.idl.Dto
            public FetchVitalsResponse.UnsupportedVersionContent.Button toProto() {
                String label = this.surrogate.getLabel();
                boolean is_primary = this.surrogate.getIs_primary();
                ActionDto action = this.surrogate.getAction();
                return new FetchVitalsResponse.UnsupportedVersionContent.Button(label, is_primary, action != null ? action.toProto() : null, null, 8, null);
            }

            public String toString() {
                return "[ButtonDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof ButtonDto) && Intrinsics.areEqual(((ButtonDto) other).surrogate, this.surrogate);
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
            /* compiled from: FetchVitalsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002+*B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b\u0005\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b)\u0010\"\u001a\u0004\b'\u0010(¨\u0006,"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$Surrogate;", "", "", AnnotatedPrivateKey.LABEL, "", "is_primary", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;", "action", "<init>", "(Ljava/lang/String;ZLbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_vitals_v1_externalRelease", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "()V", "Z", "()Z", "is_primary$annotations", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;", "getAction", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;", "getAction$annotations", "Companion", "$serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final ActionDto action;
                private final boolean is_primary;
                private final String label;

                public Surrogate() {
                    this((String) null, false, (ActionDto) null, 7, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.label, surrogate.label) && this.is_primary == surrogate.is_primary && Intrinsics.areEqual(this.action, surrogate.action);
                }

                public int hashCode() {
                    int iHashCode = ((this.label.hashCode() * 31) + Boolean.hashCode(this.is_primary)) * 31;
                    ActionDto actionDto = this.action;
                    return iHashCode + (actionDto == null ? 0 : actionDto.hashCode());
                }

                public String toString() {
                    return "Surrogate(label=" + this.label + ", is_primary=" + this.is_primary + ", action=" + this.action + ")";
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$Surrogate;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return FetchVitalsResponseDto5.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, boolean z, ActionDto actionDto, SerializationConstructorMarker serializationConstructorMarker) {
                    this.label = (i & 1) == 0 ? "" : str;
                    if ((i & 2) == 0) {
                        this.is_primary = false;
                    } else {
                        this.is_primary = z;
                    }
                    if ((i & 4) == 0) {
                        this.action = null;
                    } else {
                        this.action = actionDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$bff_vitals_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.label, "")) {
                        output.encodeStringElement(serialDesc, 0, self.label);
                    }
                    boolean z = self.is_primary;
                    if (z) {
                        output.encodeBooleanElement(serialDesc, 1, z);
                    }
                    ActionDto actionDto = self.action;
                    if (actionDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, ActionDto.Serializer.INSTANCE, actionDto);
                    }
                }

                public Surrogate(String label, boolean z, ActionDto actionDto) {
                    Intrinsics.checkNotNullParameter(label, "label");
                    this.label = label;
                    this.is_primary = z;
                    this.action = actionDto;
                }

                public final String getLabel() {
                    return this.label;
                }

                public /* synthetic */ Surrogate(String str, boolean z, ActionDto actionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : actionDto);
                }

                /* renamed from: is_primary, reason: from getter */
                public final boolean getIs_primary() {
                    return this.is_primary;
                }

                public final ActionDto getAction() {
                    return this.action;
                }
            }

            /* compiled from: FetchVitalsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<ButtonDto, FetchVitalsResponse.UnsupportedVersionContent.Button> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ButtonDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ButtonDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ButtonDto> getBinaryBase64Serializer() {
                    return (KSerializer) ButtonDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<FetchVitalsResponse.UnsupportedVersionContent.Button> getProtoAdapter() {
                    return FetchVitalsResponse.UnsupportedVersionContent.Button.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ButtonDto getZeroValue() {
                    return ButtonDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ButtonDto fromProto(FetchVitalsResponse.UnsupportedVersionContent.Button proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    String label = proto.getLabel();
                    boolean zIs_primary = proto.getIs_primary();
                    FetchVitalsResponse.UnsupportedVersionContent.Button.Action action = proto.getAction();
                    return new ButtonDto(new Surrogate(label, zIs_primary, action != null ? ActionDto.INSTANCE.fromProto(action) : null), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new ButtonDto(null, false, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: FetchVitalsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$Action;", "Landroid/os/Parcelable;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$Surrogate;", "surrogate", "<init>", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$Surrogate;)V", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto;", "concrete", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto;)V", "toProto", "()Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$Action;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$Surrogate;", "getConcrete", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto;", "Companion", "Surrogate", "ConcreteDto", "Serializer", "MultibindingModule", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class ActionDto implements Dto3<FetchVitalsResponse.UnsupportedVersionContent.Button.Action>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<ActionDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<ActionDto, FetchVitalsResponse.UnsupportedVersionContent.Button.Action>> binaryBase64Serializer$delegate;
                private static final ActionDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ ActionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private ActionDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final ConcreteDto getConcrete() {
                    if (this.surrogate.getUrl() != null) {
                        return new ConcreteDto.Url(this.surrogate.getUrl());
                    }
                    if (this.surrogate.getCancel_action() != null) {
                        return new ConcreteDto.CancelAction(this.surrogate.getCancel_action());
                    }
                    if (this.surrogate.getOpen_app_store_action() != null) {
                        return new ConcreteDto.OpenAppStoreAction(this.surrogate.getOpen_app_store_action());
                    }
                    if (this.surrogate.getDismiss_action() != null) {
                        return new ConcreteDto.DismissAction(this.surrogate.getDismiss_action());
                    }
                    return null;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public ActionDto(ConcreteDto concreteDto) {
                    ConcreteDto.Url url = concreteDto instanceof ConcreteDto.Url ? (ConcreteDto.Url) concreteDto : null;
                    String value = url != null ? url.getValue() : null;
                    ConcreteDto.CancelAction cancelAction = concreteDto instanceof ConcreteDto.CancelAction ? (ConcreteDto.CancelAction) concreteDto : null;
                    CancelActionDto value2 = cancelAction != null ? cancelAction.getValue() : null;
                    ConcreteDto.OpenAppStoreAction openAppStoreAction = concreteDto instanceof ConcreteDto.OpenAppStoreAction ? (ConcreteDto.OpenAppStoreAction) concreteDto : null;
                    OpenAppStoreActionDto value3 = openAppStoreAction != null ? openAppStoreAction.getValue() : null;
                    ConcreteDto.DismissAction dismissAction = concreteDto instanceof ConcreteDto.DismissAction ? (ConcreteDto.DismissAction) concreteDto : null;
                    this(new Surrogate(value, value2, value3, dismissAction != null ? dismissAction.getValue() : null));
                }

                public /* synthetic */ ActionDto(ConcreteDto concreteDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : concreteDto);
                }

                @Override // com.robinhood.idl.Dto
                public FetchVitalsResponse.UnsupportedVersionContent.Button.Action toProto() {
                    String url = this.surrogate.getUrl();
                    CancelActionDto cancel_action = this.surrogate.getCancel_action();
                    FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction proto = cancel_action != null ? cancel_action.toProto() : null;
                    OpenAppStoreActionDto open_app_store_action = this.surrogate.getOpen_app_store_action();
                    FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction proto2 = open_app_store_action != null ? open_app_store_action.toProto() : null;
                    DismissActionDto dismiss_action = this.surrogate.getDismiss_action();
                    return new FetchVitalsResponse.UnsupportedVersionContent.Button.Action(url, proto, proto2, dismiss_action != null ? dismiss_action.toProto() : null, null, 16, null);
                }

                public String toString() {
                    return "[ActionDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof ActionDto) && Intrinsics.areEqual(((ActionDto) other).surrogate, this.surrogate);
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
                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010%\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$Surrogate;", "", "", "url", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;", "cancel_action", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;", "open_app_store_action", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;", "dismiss_action", "<init>", "(Ljava/lang/String;Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_vitals_v1_externalRelease", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getUrl$annotations", "()V", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;", "getCancel_action", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;", "getCancel_action$annotations", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;", "getOpen_app_store_action", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;", "getOpen_app_store_action$annotations", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;", "getDismiss_action", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;", "getDismiss_action$annotations", "Companion", "$serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final CancelActionDto cancel_action;
                    private final DismissActionDto dismiss_action;
                    private final OpenAppStoreActionDto open_app_store_action;
                    private final String url;

                    public Surrogate() {
                        this((String) null, (CancelActionDto) null, (OpenAppStoreActionDto) null, (DismissActionDto) null, 15, (DefaultConstructorMarker) null);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Surrogate)) {
                            return false;
                        }
                        Surrogate surrogate = (Surrogate) other;
                        return Intrinsics.areEqual(this.url, surrogate.url) && Intrinsics.areEqual(this.cancel_action, surrogate.cancel_action) && Intrinsics.areEqual(this.open_app_store_action, surrogate.open_app_store_action) && Intrinsics.areEqual(this.dismiss_action, surrogate.dismiss_action);
                    }

                    public int hashCode() {
                        String str = this.url;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        CancelActionDto cancelActionDto = this.cancel_action;
                        int iHashCode2 = (iHashCode + (cancelActionDto == null ? 0 : cancelActionDto.hashCode())) * 31;
                        OpenAppStoreActionDto openAppStoreActionDto = this.open_app_store_action;
                        int iHashCode3 = (iHashCode2 + (openAppStoreActionDto == null ? 0 : openAppStoreActionDto.hashCode())) * 31;
                        DismissActionDto dismissActionDto = this.dismiss_action;
                        return iHashCode3 + (dismissActionDto != null ? dismissActionDto.hashCode() : 0);
                    }

                    public String toString() {
                        return "Surrogate(url=" + this.url + ", cancel_action=" + this.cancel_action + ", open_app_store_action=" + this.open_app_store_action + ", dismiss_action=" + this.dismiss_action + ")";
                    }

                    /* compiled from: FetchVitalsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$Surrogate;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return FetchVitalsResponseDto4.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, String str, CancelActionDto cancelActionDto, OpenAppStoreActionDto openAppStoreActionDto, DismissActionDto dismissActionDto, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.url = null;
                        } else {
                            this.url = str;
                        }
                        if ((i & 2) == 0) {
                            this.cancel_action = null;
                        } else {
                            this.cancel_action = cancelActionDto;
                        }
                        if ((i & 4) == 0) {
                            this.open_app_store_action = null;
                        } else {
                            this.open_app_store_action = openAppStoreActionDto;
                        }
                        if ((i & 8) == 0) {
                            this.dismiss_action = null;
                        } else {
                            this.dismiss_action = dismissActionDto;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$bff_vitals_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        String str = self.url;
                        if (str != null) {
                            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
                        }
                        CancelActionDto cancelActionDto = self.cancel_action;
                        if (cancelActionDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 1, CancelActionDto.Serializer.INSTANCE, cancelActionDto);
                        }
                        OpenAppStoreActionDto openAppStoreActionDto = self.open_app_store_action;
                        if (openAppStoreActionDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 2, OpenAppStoreActionDto.Serializer.INSTANCE, openAppStoreActionDto);
                        }
                        DismissActionDto dismissActionDto = self.dismiss_action;
                        if (dismissActionDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 3, DismissActionDto.Serializer.INSTANCE, dismissActionDto);
                        }
                    }

                    public Surrogate(String str, CancelActionDto cancelActionDto, OpenAppStoreActionDto openAppStoreActionDto, DismissActionDto dismissActionDto) {
                        this.url = str;
                        this.cancel_action = cancelActionDto;
                        this.open_app_store_action = openAppStoreActionDto;
                        this.dismiss_action = dismissActionDto;
                    }

                    public /* synthetic */ Surrogate(String str, CancelActionDto cancelActionDto, OpenAppStoreActionDto openAppStoreActionDto, DismissActionDto dismissActionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : cancelActionDto, (i & 4) != 0 ? null : openAppStoreActionDto, (i & 8) != 0 ? null : dismissActionDto);
                    }

                    public final String getUrl() {
                        return this.url;
                    }

                    public final CancelActionDto getCancel_action() {
                        return this.cancel_action;
                    }

                    public final OpenAppStoreActionDto getOpen_app_store_action() {
                        return this.open_app_store_action;
                    }

                    public final DismissActionDto getDismiss_action() {
                        return this.dismiss_action;
                    }
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$Action;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                public static final class Companion implements Dto3.Creator<ActionDto, FetchVitalsResponse.UnsupportedVersionContent.Button.Action> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<ActionDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<ActionDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<ActionDto> getBinaryBase64Serializer() {
                        return (KSerializer) ActionDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<FetchVitalsResponse.UnsupportedVersionContent.Button.Action> getProtoAdapter() {
                        return FetchVitalsResponse.UnsupportedVersionContent.Button.Action.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ActionDto getZeroValue() {
                        return ActionDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ActionDto fromProto(FetchVitalsResponse.UnsupportedVersionContent.Button.Action proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        String url = proto.getUrl();
                        FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction cancel_action = proto.getCancel_action();
                        DefaultConstructorMarker defaultConstructorMarker = null;
                        CancelActionDto cancelActionDtoFromProto = cancel_action != null ? CancelActionDto.INSTANCE.fromProto(cancel_action) : null;
                        FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction open_app_store_action = proto.getOpen_app_store_action();
                        OpenAppStoreActionDto openAppStoreActionDtoFromProto = open_app_store_action != null ? OpenAppStoreActionDto.INSTANCE.fromProto(open_app_store_action) : null;
                        FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction dismiss_action = proto.getDismiss_action();
                        return new ActionDto(new Surrogate(url, cancelActionDtoFromProto, openAppStoreActionDtoFromProto, dismiss_action != null ? DismissActionDto.INSTANCE.fromProto(dismiss_action) : null), defaultConstructorMarker);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.ActionDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new ActionDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Url", "CancelAction", "OpenAppStoreAction", "DismissAction", "Companion", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto$CancelAction;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto$DismissAction;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto$OpenAppStoreAction;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto$Url;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @RhGenerated
                public static abstract class ConcreteDto implements Dto4 {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);

                    public /* synthetic */ ConcreteDto(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private ConcreteDto() {
                    }

                    @Override // com.robinhood.idl.Dto
                    public Void toProto() {
                        return Dto4.DefaultImpls.toProto(this);
                    }

                    /* compiled from: FetchVitalsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto$Url;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class Url extends ConcreteDto {
                        private final String value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof Url) && Intrinsics.areEqual(this.value, ((Url) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "Url(value=" + this.value + ")";
                        }

                        public final String getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public Url(String value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: FetchVitalsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto$CancelAction;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;", "value", "<init>", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;", "getValue", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class CancelAction extends ConcreteDto {
                        private final CancelActionDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof CancelAction) && Intrinsics.areEqual(this.value, ((CancelAction) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "CancelAction(value=" + this.value + ")";
                        }

                        public final CancelActionDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public CancelAction(CancelActionDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: FetchVitalsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto$OpenAppStoreAction;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;", "value", "<init>", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;", "getValue", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class OpenAppStoreAction extends ConcreteDto {
                        private final OpenAppStoreActionDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof OpenAppStoreAction) && Intrinsics.areEqual(this.value, ((OpenAppStoreAction) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "OpenAppStoreAction(value=" + this.value + ")";
                        }

                        public final OpenAppStoreActionDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public OpenAppStoreAction(OpenAppStoreActionDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: FetchVitalsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto$DismissAction;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;", "value", "<init>", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;", "getValue", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class DismissAction extends ConcreteDto {
                        private final DismissActionDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof DismissAction) && Intrinsics.areEqual(this.value, ((DismissAction) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "DismissAction(value=" + this.value + ")";
                        }

                        public final DismissActionDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public DismissAction(DismissActionDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: FetchVitalsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$ConcreteDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$Action;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* loaded from: classes16.dex */
                    public static final class Companion implements Dto4.Creator<ConcreteDto, FetchVitalsResponse.UnsupportedVersionContent.Button.Action> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public Void getZeroValue() {
                            return Dto4.Creator.DefaultImpls.getZeroValue(this);
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<FetchVitalsResponse.UnsupportedVersionContent.Button.Action> getProtoAdapter() {
                            return FetchVitalsResponse.UnsupportedVersionContent.Button.Action.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ConcreteDto fromProto(FetchVitalsResponse.UnsupportedVersionContent.Button.Action proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            if (proto.getUrl() != null) {
                                return new Url(proto.getUrl());
                            }
                            if (proto.getCancel_action() != null) {
                                return new CancelAction(CancelActionDto.INSTANCE.fromProto(proto.getCancel_action()));
                            }
                            if (proto.getOpen_app_store_action() != null) {
                                return new OpenAppStoreAction(OpenAppStoreActionDto.INSTANCE.fromProto(proto.getOpen_app_store_action()));
                            }
                            if (proto.getDismiss_action() != null) {
                                return new DismissAction(DismissActionDto.INSTANCE.fromProto(proto.getDismiss_action()));
                            }
                            return null;
                        }
                    }
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto;", "<init>", "()V", "surrogateSerializer", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes16.dex */
                public static final class Serializer implements KSerializer<ActionDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_vitals.service.v1.FetchVitalsResponse.UnsupportedVersionContent.Button.Action", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, ActionDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public ActionDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new ActionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                    public final String provideIntoMap() {
                        return "bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$ActionDto";
                    }
                }
            }

            /* compiled from: FetchVitalsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$CancelAction;", "Landroid/os/Parcelable;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto$Surrogate;", "surrogate", "<init>", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto$Surrogate;)V", "()V", "toProto", "()Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$CancelAction;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class CancelActionDto implements Dto3<FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<CancelActionDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<CancelActionDto, FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction>> binaryBase64Serializer$delegate;
                private static final CancelActionDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ CancelActionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private CancelActionDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public CancelActionDto() {
                    this(Surrogate.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction toProto() {
                    return new FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction(null, 1, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "[CancelActionDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof CancelActionDto) && Intrinsics.areEqual(((CancelActionDto) other).surrogate, this.surrogate);
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
                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {
                    public static final Surrogate INSTANCE = new Surrogate();
                    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto$Surrogate$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.CancelActionDto.Surrogate._init_$_anonymous_();
                        }
                    });

                    public boolean equals(Object other) {
                        return this == other || (other instanceof Surrogate);
                    }

                    public int hashCode() {
                        return 1163060532;
                    }

                    public String toString() {
                        return "Surrogate";
                    }

                    private Surrogate() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                        return new ObjectSerializer("bff_vitals.service.v1.FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.CancelActionDto.Surrogate", INSTANCE, new Annotation[0]);
                    }

                    private final /* synthetic */ KSerializer get$cachedSerializer() {
                        return $cachedSerializer$delegate.getValue();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return get$cachedSerializer();
                    }
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$CancelAction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<CancelActionDto, FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<CancelActionDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<CancelActionDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<CancelActionDto> getBinaryBase64Serializer() {
                        return (KSerializer) CancelActionDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction> getProtoAdapter() {
                        return FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public CancelActionDto getZeroValue() {
                        return CancelActionDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public CancelActionDto fromProto(FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new CancelActionDto();
                    }
                }

                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.CancelActionDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new CancelActionDto();
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto;", "<init>", "()V", "surrogateSerializer", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes16.dex */
                public static final class Serializer implements KSerializer<CancelActionDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_vitals.service.v1.FetchVitalsResponse.UnsupportedVersionContent.Button.CancelAction", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, CancelActionDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public CancelActionDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new CancelActionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4191_7)
                    public final String provideIntoMap() {
                        return "bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$CancelActionDto";
                    }
                }
            }

            /* compiled from: FetchVitalsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$OpenAppStoreAction;", "Landroid/os/Parcelable;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto$Surrogate;", "surrogate", "<init>", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto$Surrogate;)V", "()V", "toProto", "()Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$OpenAppStoreAction;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class OpenAppStoreActionDto implements Dto3<FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<OpenAppStoreActionDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<OpenAppStoreActionDto, FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction>> binaryBase64Serializer$delegate;
                private static final OpenAppStoreActionDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ OpenAppStoreActionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private OpenAppStoreActionDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public OpenAppStoreActionDto() {
                    this(Surrogate.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction toProto() {
                    return new FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction(null, 1, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "[OpenAppStoreActionDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof OpenAppStoreActionDto) && Intrinsics.areEqual(((OpenAppStoreActionDto) other).surrogate, this.surrogate);
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
                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {
                    public static final Surrogate INSTANCE = new Surrogate();
                    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto$Surrogate$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.OpenAppStoreActionDto.Surrogate._init_$_anonymous_();
                        }
                    });

                    public boolean equals(Object other) {
                        return this == other || (other instanceof Surrogate);
                    }

                    public int hashCode() {
                        return 354562500;
                    }

                    public String toString() {
                        return "Surrogate";
                    }

                    private Surrogate() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                        return new ObjectSerializer("bff_vitals.service.v1.FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.OpenAppStoreActionDto.Surrogate", INSTANCE, new Annotation[0]);
                    }

                    private final /* synthetic */ KSerializer get$cachedSerializer() {
                        return $cachedSerializer$delegate.getValue();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return get$cachedSerializer();
                    }
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$OpenAppStoreAction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<OpenAppStoreActionDto, FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<OpenAppStoreActionDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<OpenAppStoreActionDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<OpenAppStoreActionDto> getBinaryBase64Serializer() {
                        return (KSerializer) OpenAppStoreActionDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction> getProtoAdapter() {
                        return FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public OpenAppStoreActionDto getZeroValue() {
                        return OpenAppStoreActionDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public OpenAppStoreActionDto fromProto(FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new OpenAppStoreActionDto();
                    }
                }

                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.OpenAppStoreActionDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new OpenAppStoreActionDto();
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto;", "<init>", "()V", "surrogateSerializer", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes16.dex */
                public static final class Serializer implements KSerializer<OpenAppStoreActionDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_vitals.service.v1.FetchVitalsResponse.UnsupportedVersionContent.Button.OpenAppStoreAction", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, OpenAppStoreActionDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public OpenAppStoreActionDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new OpenAppStoreActionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4191_7)
                    public final String provideIntoMap() {
                        return "bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$OpenAppStoreActionDto";
                    }
                }
            }

            /* compiled from: FetchVitalsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$DismissAction;", "Landroid/os/Parcelable;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto$Surrogate;", "surrogate", "<init>", "(Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto$Surrogate;)V", "()V", "toProto", "()Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$DismissAction;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class DismissActionDto implements Dto3<FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<DismissActionDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<DismissActionDto, FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction>> binaryBase64Serializer$delegate;
                private static final DismissActionDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ DismissActionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private DismissActionDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public DismissActionDto() {
                    this(Surrogate.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction toProto() {
                    return new FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction(null, 1, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "[DismissActionDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof DismissActionDto) && Intrinsics.areEqual(((DismissActionDto) other).surrogate, this.surrogate);
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
                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {
                    public static final Surrogate INSTANCE = new Surrogate();
                    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto$Surrogate$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.DismissActionDto.Surrogate._init_$_anonymous_();
                        }
                    });

                    public boolean equals(Object other) {
                        return this == other || (other instanceof Surrogate);
                    }

                    public int hashCode() {
                        return -1148770290;
                    }

                    public String toString() {
                        return "Surrogate";
                    }

                    private Surrogate() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                        return new ObjectSerializer("bff_vitals.service.v1.FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.DismissActionDto.Surrogate", INSTANCE, new Annotation[0]);
                    }

                    private final /* synthetic */ KSerializer get$cachedSerializer() {
                        return $cachedSerializer$delegate.getValue();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return get$cachedSerializer();
                    }
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;", "Lbff_vitals/service/v1/FetchVitalsResponse$UnsupportedVersionContent$Button$DismissAction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<DismissActionDto, FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<DismissActionDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<DismissActionDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<DismissActionDto> getBinaryBase64Serializer() {
                        return (KSerializer) DismissActionDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction> getProtoAdapter() {
                        return FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public DismissActionDto getZeroValue() {
                        return DismissActionDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public DismissActionDto fromProto(FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new DismissActionDto();
                    }
                }

                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.DismissActionDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new DismissActionDto();
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto;", "<init>", "()V", "surrogateSerializer", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes16.dex */
                public static final class Serializer implements KSerializer<DismissActionDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_vitals.service.v1.FetchVitalsResponse.UnsupportedVersionContent.Button.DismissAction", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, DismissActionDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public DismissActionDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new DismissActionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: FetchVitalsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4191_7)
                    public final String provideIntoMap() {
                        return "bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$DismissActionDto";
                    }
                }
            }

            /* compiled from: FetchVitalsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto;", "<init>", "()V", "surrogateSerializer", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<ButtonDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_vitals.service.v1.FetchVitalsResponse.UnsupportedVersionContent.Button", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, ButtonDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public ButtonDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new ButtonDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: FetchVitalsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4186_2)
                public final String provideIntoMap() {
                    return "bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto$ButtonDto";
                }
            }
        }

        /* compiled from: FetchVitalsResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto;", "<init>", "()V", "surrogateSerializer", "Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public static final class Serializer implements KSerializer<UnsupportedVersionContentDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_vitals.service.v1.FetchVitalsResponse.UnsupportedVersionContent", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, UnsupportedVersionContentDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public UnsupportedVersionContentDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new UnsupportedVersionContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: FetchVitalsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$UnsupportedVersionContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "bff_vitals.service.v1.FetchVitalsResponseDto$UnsupportedVersionContentDto";
            }
        }
    }

    /* compiled from: FetchVitalsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbff_vitals/service/v1/FetchVitalsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FetchVitalsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_vitals.service.v1.FetchVitalsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FetchVitalsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FetchVitalsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FetchVitalsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: FetchVitalsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "bff_vitals.service.v1.FetchVitalsResponseDto";
        }
    }
}
