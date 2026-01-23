package com.robinhood.idl;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Backends.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/idl/Backends;", "Lcom/squareup/wire/Message;", "", "production", "Lcom/robinhood/idl/FixedEndpoint;", "apollo", "Lcom/robinhood/idl/ApolloEndpoint;", "docker", "Lcom/robinhood/idl/DockerEndpoint;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/idl/FixedEndpoint;Lcom/robinhood/idl/ApolloEndpoint;Lcom/robinhood/idl/DockerEndpoint;Lokio/ByteString;)V", "getProduction", "()Lcom/robinhood/idl/FixedEndpoint;", "getApollo", "()Lcom/robinhood/idl/ApolloEndpoint;", "getDocker", "()Lcom/robinhood/idl/DockerEndpoint;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class Backends extends Message {

    @JvmField
    public static final ProtoAdapter<Backends> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.idl.ApolloEndpoint#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ApolloEndpoint apollo;

    @WireField(adapter = "com.robinhood.idl.DockerEndpoint#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final DockerEndpoint docker;

    @WireField(adapter = "com.robinhood.idl.FixedEndpoint#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FixedEndpoint production;

    public Backends() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22520newBuilder();
    }

    public final FixedEndpoint getProduction() {
        return this.production;
    }

    public final ApolloEndpoint getApollo() {
        return this.apollo;
    }

    public final DockerEndpoint getDocker() {
        return this.docker;
    }

    public /* synthetic */ Backends(FixedEndpoint fixedEndpoint, ApolloEndpoint apolloEndpoint, DockerEndpoint dockerEndpoint, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fixedEndpoint, (i & 2) != 0 ? null : apolloEndpoint, (i & 4) != 0 ? null : dockerEndpoint, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Backends(FixedEndpoint fixedEndpoint, ApolloEndpoint apolloEndpoint, DockerEndpoint dockerEndpoint, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.production = fixedEndpoint;
        this.apollo = apolloEndpoint;
        this.docker = dockerEndpoint;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22520newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Backends)) {
            return false;
        }
        Backends backends = (Backends) other;
        return Intrinsics.areEqual(unknownFields(), backends.unknownFields()) && Intrinsics.areEqual(this.production, backends.production) && Intrinsics.areEqual(this.apollo, backends.apollo) && Intrinsics.areEqual(this.docker, backends.docker);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FixedEndpoint fixedEndpoint = this.production;
        int iHashCode2 = (iHashCode + (fixedEndpoint != null ? fixedEndpoint.hashCode() : 0)) * 37;
        ApolloEndpoint apolloEndpoint = this.apollo;
        int iHashCode3 = (iHashCode2 + (apolloEndpoint != null ? apolloEndpoint.hashCode() : 0)) * 37;
        DockerEndpoint dockerEndpoint = this.docker;
        int iHashCode4 = iHashCode3 + (dockerEndpoint != null ? dockerEndpoint.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FixedEndpoint fixedEndpoint = this.production;
        if (fixedEndpoint != null) {
            arrayList.add("production=" + fixedEndpoint);
        }
        ApolloEndpoint apolloEndpoint = this.apollo;
        if (apolloEndpoint != null) {
            arrayList.add("apollo=" + apolloEndpoint);
        }
        DockerEndpoint dockerEndpoint = this.docker;
        if (dockerEndpoint != null) {
            arrayList.add("docker=" + dockerEndpoint);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Backends{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Backends copy$default(Backends backends, FixedEndpoint fixedEndpoint, ApolloEndpoint apolloEndpoint, DockerEndpoint dockerEndpoint, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            fixedEndpoint = backends.production;
        }
        if ((i & 2) != 0) {
            apolloEndpoint = backends.apollo;
        }
        if ((i & 4) != 0) {
            dockerEndpoint = backends.docker;
        }
        if ((i & 8) != 0) {
            byteString = backends.unknownFields();
        }
        return backends.copy(fixedEndpoint, apolloEndpoint, dockerEndpoint, byteString);
    }

    public final Backends copy(FixedEndpoint production, ApolloEndpoint apollo, DockerEndpoint docker, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Backends(production, apollo, docker, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Backends.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Backends>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.idl.Backends$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Backends value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getProduction() != null) {
                    size += FixedEndpoint.ADAPTER.encodedSizeWithTag(1, value.getProduction());
                }
                if (value.getApollo() != null) {
                    size += ApolloEndpoint.ADAPTER.encodedSizeWithTag(2, value.getApollo());
                }
                return value.getDocker() != null ? size + DockerEndpoint.ADAPTER.encodedSizeWithTag(3, value.getDocker()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Backends value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getProduction() != null) {
                    FixedEndpoint.ADAPTER.encodeWithTag(writer, 1, (int) value.getProduction());
                }
                if (value.getApollo() != null) {
                    ApolloEndpoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getApollo());
                }
                if (value.getDocker() != null) {
                    DockerEndpoint.ADAPTER.encodeWithTag(writer, 3, (int) value.getDocker());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Backends value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDocker() != null) {
                    DockerEndpoint.ADAPTER.encodeWithTag(writer, 3, (int) value.getDocker());
                }
                if (value.getApollo() != null) {
                    ApolloEndpoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getApollo());
                }
                if (value.getProduction() != null) {
                    FixedEndpoint.ADAPTER.encodeWithTag(writer, 1, (int) value.getProduction());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Backends redact(Backends value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FixedEndpoint production = value.getProduction();
                FixedEndpoint fixedEndpointRedact = production != null ? FixedEndpoint.ADAPTER.redact(production) : null;
                ApolloEndpoint apollo = value.getApollo();
                ApolloEndpoint apolloEndpointRedact = apollo != null ? ApolloEndpoint.ADAPTER.redact(apollo) : null;
                DockerEndpoint docker = value.getDocker();
                return value.copy(fixedEndpointRedact, apolloEndpointRedact, docker != null ? DockerEndpoint.ADAPTER.redact(docker) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Backends decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FixedEndpoint fixedEndpointDecode = null;
                ApolloEndpoint apolloEndpointDecode = null;
                DockerEndpoint dockerEndpointDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Backends(fixedEndpointDecode, apolloEndpointDecode, dockerEndpointDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fixedEndpointDecode = FixedEndpoint.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        apolloEndpointDecode = ApolloEndpoint.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        dockerEndpointDecode = DockerEndpoint.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
