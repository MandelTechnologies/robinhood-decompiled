package contracts.perpetuals.proto.p433v1;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetButtonsRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsRequest;", "Lcom/squareup/wire/Message;", "", "source_screen", "Lcontracts/perpetuals/proto/v1/SourceScreen;", "perpetual_contract_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/perpetuals/proto/v1/SourceScreen;Ljava/lang/String;Lokio/ByteString;)V", "getSource_screen", "()Lcontracts/perpetuals/proto/v1/SourceScreen;", "getPerpetual_contract_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetButtonsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetButtonsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "perpetualContractId", schemaIndex = 1, tag = 2)
    private final String perpetual_contract_id;

    @WireField(adapter = "contracts.perpetuals.proto.v1.SourceScreen#ADAPTER", jsonName = "sourceScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final SourceScreen source_screen;

    public GetButtonsRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27769newBuilder();
    }

    public final SourceScreen getSource_screen() {
        return this.source_screen;
    }

    public /* synthetic */ GetButtonsRequest(SourceScreen sourceScreen, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SourceScreen.SOURCE_SCREEN_UNSPECIFIED : sourceScreen, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPerpetual_contract_id() {
        return this.perpetual_contract_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetButtonsRequest(SourceScreen source_screen, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(source_screen, "source_screen");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.source_screen = source_screen;
        this.perpetual_contract_id = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27769newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetButtonsRequest)) {
            return false;
        }
        GetButtonsRequest getButtonsRequest = (GetButtonsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getButtonsRequest.unknownFields()) && this.source_screen == getButtonsRequest.source_screen && Intrinsics.areEqual(this.perpetual_contract_id, getButtonsRequest.perpetual_contract_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.source_screen.hashCode()) * 37;
        String str = this.perpetual_contract_id;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("source_screen=" + this.source_screen);
        String str = this.perpetual_contract_id;
        if (str != null) {
            arrayList.add("perpetual_contract_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetButtonsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetButtonsRequest copy$default(GetButtonsRequest getButtonsRequest, SourceScreen sourceScreen, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            sourceScreen = getButtonsRequest.source_screen;
        }
        if ((i & 2) != 0) {
            str = getButtonsRequest.perpetual_contract_id;
        }
        if ((i & 4) != 0) {
            byteString = getButtonsRequest.unknownFields();
        }
        return getButtonsRequest.copy(sourceScreen, str, byteString);
    }

    public final GetButtonsRequest copy(SourceScreen source_screen, String perpetual_contract_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(source_screen, "source_screen");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetButtonsRequest(source_screen, perpetual_contract_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetButtonsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetButtonsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.perpetuals.proto.v1.GetButtonsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetButtonsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSource_screen() != SourceScreen.SOURCE_SCREEN_UNSPECIFIED) {
                    size += SourceScreen.ADAPTER.encodedSizeWithTag(1, value.getSource_screen());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPerpetual_contract_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetButtonsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSource_screen() != SourceScreen.SOURCE_SCREEN_UNSPECIFIED) {
                    SourceScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource_screen());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPerpetual_contract_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetButtonsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPerpetual_contract_id());
                if (value.getSource_screen() != SourceScreen.SOURCE_SCREEN_UNSPECIFIED) {
                    SourceScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource_screen());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetButtonsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SourceScreen sourceScreenDecode = SourceScreen.SOURCE_SCREEN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetButtonsRequest(sourceScreenDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            sourceScreenDecode = SourceScreen.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetButtonsRequest redact(GetButtonsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetButtonsRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
