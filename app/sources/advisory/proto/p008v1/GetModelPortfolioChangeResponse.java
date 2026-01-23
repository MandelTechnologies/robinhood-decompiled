package advisory.proto.p008v1;

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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: GetModelPortfolioChangeResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JF\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Ladvisory/proto/v1/GetModelPortfolioChangeResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "title", "subtitle", "no_change_details", "Ladvisory/proto/v1/ModelPortfolioNoChangeDetails;", "change_details", "Ladvisory/proto/v1/ModelPortfolioChangeDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/ModelPortfolioNoChangeDetails;Ladvisory/proto/v1/ModelPortfolioChangeDetails;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getNo_change_details", "()Ladvisory/proto/v1/ModelPortfolioNoChangeDetails;", "getChange_details", "()Ladvisory/proto/v1/ModelPortfolioChangeDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetModelPortfolioChangeResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetModelPortfolioChangeResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "advisory.proto.v1.ModelPortfolioChangeDetails#ADAPTER", jsonName = "changeDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 4, tag = 5)
    private final ModelPortfolioChangeDetails change_details;

    @WireField(adapter = "advisory.proto.v1.ModelPortfolioNoChangeDetails#ADAPTER", jsonName = "noChangeDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 3, tag = 4)
    private final ModelPortfolioNoChangeDetails no_change_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public GetModelPortfolioChangeResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ GetModelPortfolioChangeResponse(String str, String str2, String str3, ModelPortfolioNoChangeDetails modelPortfolioNoChangeDetails, ModelPortfolioChangeDetails modelPortfolioChangeDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : modelPortfolioNoChangeDetails, (i & 16) != 0 ? null : modelPortfolioChangeDetails, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4464newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ModelPortfolioNoChangeDetails getNo_change_details() {
        return this.no_change_details;
    }

    public final ModelPortfolioChangeDetails getChange_details() {
        return this.change_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetModelPortfolioChangeResponse(String account_number, String title, String subtitle, ModelPortfolioNoChangeDetails modelPortfolioNoChangeDetails, ModelPortfolioChangeDetails modelPortfolioChangeDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.title = title;
        this.subtitle = subtitle;
        this.no_change_details = modelPortfolioNoChangeDetails;
        this.change_details = modelPortfolioChangeDetails;
        if (Internal.countNonNull(modelPortfolioNoChangeDetails, modelPortfolioChangeDetails) > 1) {
            throw new IllegalArgumentException("At most one of no_change_details, change_details may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4464newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetModelPortfolioChangeResponse)) {
            return false;
        }
        GetModelPortfolioChangeResponse getModelPortfolioChangeResponse = (GetModelPortfolioChangeResponse) other;
        return Intrinsics.areEqual(unknownFields(), getModelPortfolioChangeResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getModelPortfolioChangeResponse.account_number) && Intrinsics.areEqual(this.title, getModelPortfolioChangeResponse.title) && Intrinsics.areEqual(this.subtitle, getModelPortfolioChangeResponse.subtitle) && Intrinsics.areEqual(this.no_change_details, getModelPortfolioChangeResponse.no_change_details) && Intrinsics.areEqual(this.change_details, getModelPortfolioChangeResponse.change_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37;
        ModelPortfolioNoChangeDetails modelPortfolioNoChangeDetails = this.no_change_details;
        int iHashCode2 = (iHashCode + (modelPortfolioNoChangeDetails != null ? modelPortfolioNoChangeDetails.hashCode() : 0)) * 37;
        ModelPortfolioChangeDetails modelPortfolioChangeDetails = this.change_details;
        int iHashCode3 = iHashCode2 + (modelPortfolioChangeDetails != null ? modelPortfolioChangeDetails.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        ModelPortfolioNoChangeDetails modelPortfolioNoChangeDetails = this.no_change_details;
        if (modelPortfolioNoChangeDetails != null) {
            arrayList.add("no_change_details=" + modelPortfolioNoChangeDetails);
        }
        ModelPortfolioChangeDetails modelPortfolioChangeDetails = this.change_details;
        if (modelPortfolioChangeDetails != null) {
            arrayList.add("change_details=" + modelPortfolioChangeDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetModelPortfolioChangeResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetModelPortfolioChangeResponse copy$default(GetModelPortfolioChangeResponse getModelPortfolioChangeResponse, String str, String str2, String str3, ModelPortfolioNoChangeDetails modelPortfolioNoChangeDetails, ModelPortfolioChangeDetails modelPortfolioChangeDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getModelPortfolioChangeResponse.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getModelPortfolioChangeResponse.title;
        }
        if ((i & 4) != 0) {
            str3 = getModelPortfolioChangeResponse.subtitle;
        }
        if ((i & 8) != 0) {
            modelPortfolioNoChangeDetails = getModelPortfolioChangeResponse.no_change_details;
        }
        if ((i & 16) != 0) {
            modelPortfolioChangeDetails = getModelPortfolioChangeResponse.change_details;
        }
        if ((i & 32) != 0) {
            byteString = getModelPortfolioChangeResponse.unknownFields();
        }
        ModelPortfolioChangeDetails modelPortfolioChangeDetails2 = modelPortfolioChangeDetails;
        ByteString byteString2 = byteString;
        return getModelPortfolioChangeResponse.copy(str, str2, str3, modelPortfolioNoChangeDetails, modelPortfolioChangeDetails2, byteString2);
    }

    public final GetModelPortfolioChangeResponse copy(String account_number, String title, String subtitle, ModelPortfolioNoChangeDetails no_change_details, ModelPortfolioChangeDetails change_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetModelPortfolioChangeResponse(account_number, title, subtitle, no_change_details, change_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetModelPortfolioChangeResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetModelPortfolioChangeResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetModelPortfolioChangeResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetModelPortfolioChangeResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSubtitle());
                }
                return size + ModelPortfolioNoChangeDetails.ADAPTER.encodedSizeWithTag(4, value.getNo_change_details()) + ModelPortfolioChangeDetails.ADAPTER.encodedSizeWithTag(5, value.getChange_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetModelPortfolioChangeResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                ModelPortfolioNoChangeDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getNo_change_details());
                ModelPortfolioChangeDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getChange_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetModelPortfolioChangeResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ModelPortfolioChangeDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getChange_details());
                ModelPortfolioNoChangeDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getNo_change_details());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetModelPortfolioChangeResponse redact(GetModelPortfolioChangeResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ModelPortfolioNoChangeDetails no_change_details = value.getNo_change_details();
                ModelPortfolioNoChangeDetails modelPortfolioNoChangeDetailsRedact = no_change_details != null ? ModelPortfolioNoChangeDetails.ADAPTER.redact(no_change_details) : null;
                ModelPortfolioChangeDetails change_details = value.getChange_details();
                return GetModelPortfolioChangeResponse.copy$default(value, null, null, null, modelPortfolioNoChangeDetailsRedact, change_details != null ? ModelPortfolioChangeDetails.ADAPTER.redact(change_details) : null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetModelPortfolioChangeResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                ModelPortfolioNoChangeDetails modelPortfolioNoChangeDetailsDecode = null;
                ModelPortfolioChangeDetails modelPortfolioChangeDetailsDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetModelPortfolioChangeResponse(strDecode, strDecode3, strDecode2, modelPortfolioNoChangeDetailsDecode, modelPortfolioChangeDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        modelPortfolioNoChangeDetailsDecode = ModelPortfolioNoChangeDetails.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        modelPortfolioChangeDetailsDecode = ModelPortfolioChangeDetails.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
