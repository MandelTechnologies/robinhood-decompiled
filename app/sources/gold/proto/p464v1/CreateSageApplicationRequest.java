package gold.proto.p464v1;

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

/* compiled from: CreateSageApplicationRequest.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J6\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lgold/proto/v1/CreateSageApplicationRequest;", "Lcom/squareup/wire/Message;", "", "mortgage_type", "Lgold/proto/v1/GoldSageMortgageType;", "agreements", "", "Lgold/proto/v1/GoldSageAgreement;", "sage_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lgold/proto/v1/GoldSageMortgageType;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getMortgage_type", "()Lgold/proto/v1/GoldSageMortgageType;", "getSage_id", "()Ljava/lang/String;", "getAgreements", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CreateSageApplicationRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateSageApplicationRequest> ADAPTER;

    @WireField(adapter = "gold.proto.v1.GoldSageAgreement#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<GoldSageAgreement> agreements;

    @WireField(adapter = "gold.proto.v1.GoldSageMortgageType#ADAPTER", jsonName = "mortgageType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final GoldSageMortgageType mortgage_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sageId", schemaIndex = 2, tag = 3)
    private final String sage_id;

    public CreateSageApplicationRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28118newBuilder();
    }

    public final GoldSageMortgageType getMortgage_type() {
        return this.mortgage_type;
    }

    public /* synthetic */ CreateSageApplicationRequest(GoldSageMortgageType goldSageMortgageType, List list, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GoldSageMortgageType.MORGTAGE_TYPE_UNSPECIFIED : goldSageMortgageType, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSage_id() {
        return this.sage_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSageApplicationRequest(GoldSageMortgageType mortgage_type, List<GoldSageAgreement> agreements, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(mortgage_type, "mortgage_type");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.mortgage_type = mortgage_type;
        this.sage_id = str;
        this.agreements = Internal.immutableCopyOf("agreements", agreements);
    }

    public final List<GoldSageAgreement> getAgreements() {
        return this.agreements;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28118newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateSageApplicationRequest)) {
            return false;
        }
        CreateSageApplicationRequest createSageApplicationRequest = (CreateSageApplicationRequest) other;
        return Intrinsics.areEqual(unknownFields(), createSageApplicationRequest.unknownFields()) && this.mortgage_type == createSageApplicationRequest.mortgage_type && Intrinsics.areEqual(this.agreements, createSageApplicationRequest.agreements) && Intrinsics.areEqual(this.sage_id, createSageApplicationRequest.sage_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.mortgage_type.hashCode()) * 37) + this.agreements.hashCode()) * 37;
        String str = this.sage_id;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("mortgage_type=" + this.mortgage_type);
        if (!this.agreements.isEmpty()) {
            arrayList.add("agreements=" + this.agreements);
        }
        String str = this.sage_id;
        if (str != null) {
            arrayList.add("sage_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateSageApplicationRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateSageApplicationRequest copy$default(CreateSageApplicationRequest createSageApplicationRequest, GoldSageMortgageType goldSageMortgageType, List list, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            goldSageMortgageType = createSageApplicationRequest.mortgage_type;
        }
        if ((i & 2) != 0) {
            list = createSageApplicationRequest.agreements;
        }
        if ((i & 4) != 0) {
            str = createSageApplicationRequest.sage_id;
        }
        if ((i & 8) != 0) {
            byteString = createSageApplicationRequest.unknownFields();
        }
        return createSageApplicationRequest.copy(goldSageMortgageType, list, str, byteString);
    }

    public final CreateSageApplicationRequest copy(GoldSageMortgageType mortgage_type, List<GoldSageAgreement> agreements, String sage_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(mortgage_type, "mortgage_type");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateSageApplicationRequest(mortgage_type, agreements, sage_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateSageApplicationRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateSageApplicationRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold.proto.v1.CreateSageApplicationRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateSageApplicationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMortgage_type() != GoldSageMortgageType.MORGTAGE_TYPE_UNSPECIFIED) {
                    size += GoldSageMortgageType.ADAPTER.encodedSizeWithTag(1, value.getMortgage_type());
                }
                return size + GoldSageAgreement.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getAgreements()) + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSage_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateSageApplicationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMortgage_type() != GoldSageMortgageType.MORGTAGE_TYPE_UNSPECIFIED) {
                    GoldSageMortgageType.ADAPTER.encodeWithTag(writer, 1, (int) value.getMortgage_type());
                }
                GoldSageAgreement.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getAgreements());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSage_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateSageApplicationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSage_id());
                GoldSageAgreement.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getAgreements());
                if (value.getMortgage_type() != GoldSageMortgageType.MORGTAGE_TYPE_UNSPECIFIED) {
                    GoldSageMortgageType.ADAPTER.encodeWithTag(writer, 1, (int) value.getMortgage_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateSageApplicationRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                GoldSageMortgageType goldSageMortgageTypeDecode = GoldSageMortgageType.MORGTAGE_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateSageApplicationRequest(goldSageMortgageTypeDecode, arrayList, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            goldSageMortgageTypeDecode = GoldSageMortgageType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        arrayList.add(GoldSageAgreement.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateSageApplicationRequest redact(CreateSageApplicationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CreateSageApplicationRequest.copy$default(value, null, Internal.m26823redactElements(value.getAgreements(), GoldSageAgreement.ADAPTER), null, ByteString.EMPTY, 5, null);
            }
        };
    }
}
