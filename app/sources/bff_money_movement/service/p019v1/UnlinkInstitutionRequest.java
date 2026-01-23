package bff_money_movement.service.p019v1;

import accio.service.p003v1.Provider;
import accio.service.p003v1.Purpose;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: UnlinkInstitutionRequest.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J4\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lbff_money_movement/service/v1/UnlinkInstitutionRequest;", "Lcom/squareup/wire/Message;", "", "institution_id", "", "provider", "Laccio/service/v1/Provider;", "purposes", "", "Laccio/service/v1/Purpose;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Laccio/service/v1/Provider;Ljava/util/List;Lokio/ByteString;)V", "getInstitution_id", "()Ljava/lang/String;", "getProvider", "()Laccio/service/v1/Provider;", "getPurposes", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class UnlinkInstitutionRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UnlinkInstitutionRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String institution_id;

    @WireField(adapter = "accio.service.v1.Provider#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Provider provider;

    @WireField(adapter = "accio.service.v1.Purpose#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Purpose> purposes;

    public UnlinkInstitutionRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8526newBuilder();
    }

    public final String getInstitution_id() {
        return this.institution_id;
    }

    public /* synthetic */ UnlinkInstitutionRequest(String str, Provider provider, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Provider.PROVIDER_UNSPECIFIED : provider, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Provider getProvider() {
        return this.provider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlinkInstitutionRequest(String institution_id, Provider provider, List<? extends Purpose> purposes, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.institution_id = institution_id;
        this.provider = provider;
        this.purposes = Internal.immutableCopyOf("purposes", purposes);
    }

    public final List<Purpose> getPurposes() {
        return this.purposes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8526newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UnlinkInstitutionRequest)) {
            return false;
        }
        UnlinkInstitutionRequest unlinkInstitutionRequest = (UnlinkInstitutionRequest) other;
        return Intrinsics.areEqual(unknownFields(), unlinkInstitutionRequest.unknownFields()) && Intrinsics.areEqual(this.institution_id, unlinkInstitutionRequest.institution_id) && this.provider == unlinkInstitutionRequest.provider && Intrinsics.areEqual(this.purposes, unlinkInstitutionRequest.purposes);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.institution_id.hashCode()) * 37) + this.provider.hashCode()) * 37) + this.purposes.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("institution_id=" + Internal.sanitize(this.institution_id));
        arrayList.add("provider=" + this.provider);
        if (!this.purposes.isEmpty()) {
            arrayList.add("purposes=" + this.purposes);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnlinkInstitutionRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnlinkInstitutionRequest copy$default(UnlinkInstitutionRequest unlinkInstitutionRequest, String str, Provider provider, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unlinkInstitutionRequest.institution_id;
        }
        if ((i & 2) != 0) {
            provider = unlinkInstitutionRequest.provider;
        }
        if ((i & 4) != 0) {
            list = unlinkInstitutionRequest.purposes;
        }
        if ((i & 8) != 0) {
            byteString = unlinkInstitutionRequest.unknownFields();
        }
        return unlinkInstitutionRequest.copy(str, provider, list, byteString);
    }

    public final UnlinkInstitutionRequest copy(String institution_id, Provider provider, List<? extends Purpose> purposes, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UnlinkInstitutionRequest(institution_id, provider, purposes, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UnlinkInstitutionRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UnlinkInstitutionRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.UnlinkInstitutionRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UnlinkInstitutionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstitution_id());
                }
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    size += Provider.ADAPTER.encodedSizeWithTag(2, value.getProvider());
                }
                return size + Purpose.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getPurposes());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UnlinkInstitutionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstitution_id());
                }
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    Provider.ADAPTER.encodeWithTag(writer, 2, (int) value.getProvider());
                }
                Purpose.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getPurposes());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UnlinkInstitutionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Purpose.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getPurposes());
                if (value.getProvider() != Provider.PROVIDER_UNSPECIFIED) {
                    Provider.ADAPTER.encodeWithTag(writer, 2, (int) value.getProvider());
                }
                if (Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstitution_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UnlinkInstitutionRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Provider providerDecode = Provider.PROVIDER_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UnlinkInstitutionRequest(strDecode, providerDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            providerDecode = Provider.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            Purpose.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UnlinkInstitutionRequest redact(UnlinkInstitutionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UnlinkInstitutionRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
