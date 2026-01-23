package com.robinhood.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.ApolloEndpointDto;
import com.robinhood.idl.DockerEndpointDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.FixedEndpointDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: BackendsDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000eJ*\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/idl/BackendsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/idl/Backends;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/idl/BackendsDto$Surrogate;", "<init>", "(Lcom/robinhood/idl/BackendsDto$Surrogate;)V", "production", "Lcom/robinhood/idl/FixedEndpointDto;", "apollo", "Lcom/robinhood/idl/ApolloEndpointDto;", "docker", "Lcom/robinhood/idl/DockerEndpointDto;", "(Lcom/robinhood/idl/FixedEndpointDto;Lcom/robinhood/idl/ApolloEndpointDto;Lcom/robinhood/idl/DockerEndpointDto;)V", "getProduction", "()Lcom/robinhood/idl/FixedEndpointDto;", "getApollo", "()Lcom/robinhood/idl/ApolloEndpointDto;", "getDocker", "()Lcom/robinhood/idl/DockerEndpointDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class BackendsDto implements Dto3<Backends>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BackendsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BackendsDto, Backends>> binaryBase64Serializer$delegate;
    private static final BackendsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BackendsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BackendsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final FixedEndpointDto getProduction() {
        return this.surrogate.getProduction();
    }

    public final ApolloEndpointDto getApollo() {
        return this.surrogate.getApollo();
    }

    public final DockerEndpointDto getDocker() {
        return this.surrogate.getDocker();
    }

    public /* synthetic */ BackendsDto(FixedEndpointDto fixedEndpointDto, ApolloEndpointDto apolloEndpointDto, DockerEndpointDto dockerEndpointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fixedEndpointDto, (i & 2) != 0 ? null : apolloEndpointDto, (i & 4) != 0 ? null : dockerEndpointDto);
    }

    public BackendsDto(FixedEndpointDto fixedEndpointDto, ApolloEndpointDto apolloEndpointDto, DockerEndpointDto dockerEndpointDto) {
        this(new Surrogate(fixedEndpointDto, apolloEndpointDto, dockerEndpointDto));
    }

    public static /* synthetic */ BackendsDto copy$default(BackendsDto backendsDto, FixedEndpointDto fixedEndpointDto, ApolloEndpointDto apolloEndpointDto, DockerEndpointDto dockerEndpointDto, int i, Object obj) {
        if ((i & 1) != 0) {
            fixedEndpointDto = backendsDto.surrogate.getProduction();
        }
        if ((i & 2) != 0) {
            apolloEndpointDto = backendsDto.surrogate.getApollo();
        }
        if ((i & 4) != 0) {
            dockerEndpointDto = backendsDto.surrogate.getDocker();
        }
        return backendsDto.copy(fixedEndpointDto, apolloEndpointDto, dockerEndpointDto);
    }

    public final BackendsDto copy(FixedEndpointDto production, ApolloEndpointDto apollo, DockerEndpointDto docker) {
        return new BackendsDto(new Surrogate(production, apollo, docker));
    }

    @Override // com.robinhood.idl.Dto
    public Backends toProto() {
        FixedEndpointDto production = this.surrogate.getProduction();
        FixedEndpoint proto = production != null ? production.toProto() : null;
        ApolloEndpointDto apollo = this.surrogate.getApollo();
        ApolloEndpoint proto2 = apollo != null ? apollo.toProto() : null;
        DockerEndpointDto docker = this.surrogate.getDocker();
        return new Backends(proto, proto2, docker != null ? docker.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[BackendsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BackendsDto) && Intrinsics.areEqual(((BackendsDto) other).surrogate, this.surrogate);
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
    /* compiled from: BackendsDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/idl/BackendsDto$Surrogate;", "", "production", "Lcom/robinhood/idl/FixedEndpointDto;", "apollo", "Lcom/robinhood/idl/ApolloEndpointDto;", "docker", "Lcom/robinhood/idl/DockerEndpointDto;", "<init>", "(Lcom/robinhood/idl/FixedEndpointDto;Lcom/robinhood/idl/ApolloEndpointDto;Lcom/robinhood/idl/DockerEndpointDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/idl/FixedEndpointDto;Lcom/robinhood/idl/ApolloEndpointDto;Lcom/robinhood/idl/DockerEndpointDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getProduction$annotations", "()V", "getProduction", "()Lcom/robinhood/idl/FixedEndpointDto;", "getApollo$annotations", "getApollo", "()Lcom/robinhood/idl/ApolloEndpointDto;", "getDocker$annotations", "getDocker", "()Lcom/robinhood/idl/DockerEndpointDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$idl_api_v1_externalRelease", "$serializer", "Companion", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ApolloEndpointDto apollo;
        private final DockerEndpointDto docker;
        private final FixedEndpointDto production;

        public Surrogate() {
            this((FixedEndpointDto) null, (ApolloEndpointDto) null, (DockerEndpointDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, FixedEndpointDto fixedEndpointDto, ApolloEndpointDto apolloEndpointDto, DockerEndpointDto dockerEndpointDto, int i, Object obj) {
            if ((i & 1) != 0) {
                fixedEndpointDto = surrogate.production;
            }
            if ((i & 2) != 0) {
                apolloEndpointDto = surrogate.apollo;
            }
            if ((i & 4) != 0) {
                dockerEndpointDto = surrogate.docker;
            }
            return surrogate.copy(fixedEndpointDto, apolloEndpointDto, dockerEndpointDto);
        }

        @SerialName("apollo")
        @JsonAnnotations2(names = {"apollo"})
        public static /* synthetic */ void getApollo$annotations() {
        }

        @SerialName("docker")
        @JsonAnnotations2(names = {"docker"})
        public static /* synthetic */ void getDocker$annotations() {
        }

        @SerialName("production")
        @JsonAnnotations2(names = {"production"})
        public static /* synthetic */ void getProduction$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final FixedEndpointDto getProduction() {
            return this.production;
        }

        /* renamed from: component2, reason: from getter */
        public final ApolloEndpointDto getApollo() {
            return this.apollo;
        }

        /* renamed from: component3, reason: from getter */
        public final DockerEndpointDto getDocker() {
            return this.docker;
        }

        public final Surrogate copy(FixedEndpointDto production, ApolloEndpointDto apollo, DockerEndpointDto docker) {
            return new Surrogate(production, apollo, docker);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.production, surrogate.production) && Intrinsics.areEqual(this.apollo, surrogate.apollo) && Intrinsics.areEqual(this.docker, surrogate.docker);
        }

        public int hashCode() {
            FixedEndpointDto fixedEndpointDto = this.production;
            int iHashCode = (fixedEndpointDto == null ? 0 : fixedEndpointDto.hashCode()) * 31;
            ApolloEndpointDto apolloEndpointDto = this.apollo;
            int iHashCode2 = (iHashCode + (apolloEndpointDto == null ? 0 : apolloEndpointDto.hashCode())) * 31;
            DockerEndpointDto dockerEndpointDto = this.docker;
            return iHashCode2 + (dockerEndpointDto != null ? dockerEndpointDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(production=" + this.production + ", apollo=" + this.apollo + ", docker=" + this.docker + ")";
        }

        /* compiled from: BackendsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/idl/BackendsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/idl/BackendsDto$Surrogate;", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BackendsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FixedEndpointDto fixedEndpointDto, ApolloEndpointDto apolloEndpointDto, DockerEndpointDto dockerEndpointDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.production = null;
            } else {
                this.production = fixedEndpointDto;
            }
            if ((i & 2) == 0) {
                this.apollo = null;
            } else {
                this.apollo = apolloEndpointDto;
            }
            if ((i & 4) == 0) {
                this.docker = null;
            } else {
                this.docker = dockerEndpointDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$idl_api_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            FixedEndpointDto fixedEndpointDto = self.production;
            if (fixedEndpointDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, FixedEndpointDto.Serializer.INSTANCE, fixedEndpointDto);
            }
            ApolloEndpointDto apolloEndpointDto = self.apollo;
            if (apolloEndpointDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ApolloEndpointDto.Serializer.INSTANCE, apolloEndpointDto);
            }
            DockerEndpointDto dockerEndpointDto = self.docker;
            if (dockerEndpointDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DockerEndpointDto.Serializer.INSTANCE, dockerEndpointDto);
            }
        }

        public Surrogate(FixedEndpointDto fixedEndpointDto, ApolloEndpointDto apolloEndpointDto, DockerEndpointDto dockerEndpointDto) {
            this.production = fixedEndpointDto;
            this.apollo = apolloEndpointDto;
            this.docker = dockerEndpointDto;
        }

        public /* synthetic */ Surrogate(FixedEndpointDto fixedEndpointDto, ApolloEndpointDto apolloEndpointDto, DockerEndpointDto dockerEndpointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : fixedEndpointDto, (i & 2) != 0 ? null : apolloEndpointDto, (i & 4) != 0 ? null : dockerEndpointDto);
        }

        public final FixedEndpointDto getProduction() {
            return this.production;
        }

        public final ApolloEndpointDto getApollo() {
            return this.apollo;
        }

        public final DockerEndpointDto getDocker() {
            return this.docker;
        }
    }

    /* compiled from: BackendsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/idl/BackendsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/idl/BackendsDto;", "Lcom/robinhood/idl/Backends;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/idl/BackendsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BackendsDto, Backends> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BackendsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BackendsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BackendsDto> getBinaryBase64Serializer() {
            return (KSerializer) BackendsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Backends> getProtoAdapter() {
            return Backends.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BackendsDto getZeroValue() {
            return BackendsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BackendsDto fromProto(Backends proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            FixedEndpoint production = proto.getProduction();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FixedEndpointDto fixedEndpointDtoFromProto = production != null ? FixedEndpointDto.INSTANCE.fromProto(production) : null;
            ApolloEndpoint apollo = proto.getApollo();
            ApolloEndpointDto apolloEndpointDtoFromProto = apollo != null ? ApolloEndpointDto.INSTANCE.fromProto(apollo) : null;
            DockerEndpoint docker = proto.getDocker();
            return new BackendsDto(new Surrogate(fixedEndpointDtoFromProto, apolloEndpointDtoFromProto, docker != null ? DockerEndpointDto.INSTANCE.fromProto(docker) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.idl.BackendsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BackendsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BackendsDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BackendsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/idl/BackendsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/idl/BackendsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/idl/BackendsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BackendsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/idl.api.v1.Backends", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BackendsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BackendsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BackendsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BackendsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/idl/BackendsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.idl.BackendsDto";
        }
    }
}
