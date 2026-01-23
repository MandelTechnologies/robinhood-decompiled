package acats_aggregation.service.p001v1;

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

/* compiled from: FeeReimbursementsHistoryDetailsResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsResponse;", "Lcom/squareup/wire/Message;", "", "id", "", "account_number", "title", "subtitle", "rows", "", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailRow;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getAccount_number", "getTitle", "getSubtitle", "getRows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class FeeReimbursementsHistoryDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<FeeReimbursementsHistoryDetailsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "acats_aggregation.service.v1.FeeReimbursementsHistoryDetailRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<FeeReimbursementsHistoryDetailRow> rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String title;

    public FeeReimbursementsHistoryDetailsResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ FeeReimbursementsHistoryDetailsResponse(String str, String str2, String str3, String str4, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4313newBuilder();
    }

    public final String getId() {
        return this.id;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeReimbursementsHistoryDetailsResponse(String id, String account_number, String title, String subtitle, List<FeeReimbursementsHistoryDetailRow> rows, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_number = account_number;
        this.title = title;
        this.subtitle = subtitle;
        this.rows = Internal.immutableCopyOf("rows", rows);
    }

    public final List<FeeReimbursementsHistoryDetailRow> getRows() {
        return this.rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4313newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeReimbursementsHistoryDetailsResponse)) {
            return false;
        }
        FeeReimbursementsHistoryDetailsResponse feeReimbursementsHistoryDetailsResponse = (FeeReimbursementsHistoryDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), feeReimbursementsHistoryDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.id, feeReimbursementsHistoryDetailsResponse.id) && Intrinsics.areEqual(this.account_number, feeReimbursementsHistoryDetailsResponse.account_number) && Intrinsics.areEqual(this.title, feeReimbursementsHistoryDetailsResponse.title) && Intrinsics.areEqual(this.subtitle, feeReimbursementsHistoryDetailsResponse.subtitle) && Intrinsics.areEqual(this.rows, feeReimbursementsHistoryDetailsResponse.rows);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.rows.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        if (!this.rows.isEmpty()) {
            arrayList.add("rows=" + this.rows);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeReimbursementsHistoryDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FeeReimbursementsHistoryDetailsResponse copy$default(FeeReimbursementsHistoryDetailsResponse feeReimbursementsHistoryDetailsResponse, String str, String str2, String str3, String str4, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeReimbursementsHistoryDetailsResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = feeReimbursementsHistoryDetailsResponse.account_number;
        }
        if ((i & 4) != 0) {
            str3 = feeReimbursementsHistoryDetailsResponse.title;
        }
        if ((i & 8) != 0) {
            str4 = feeReimbursementsHistoryDetailsResponse.subtitle;
        }
        if ((i & 16) != 0) {
            list = feeReimbursementsHistoryDetailsResponse.rows;
        }
        if ((i & 32) != 0) {
            byteString = feeReimbursementsHistoryDetailsResponse.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        return feeReimbursementsHistoryDetailsResponse.copy(str, str2, str3, str4, list2, byteString2);
    }

    public final FeeReimbursementsHistoryDetailsResponse copy(String id, String account_number, String title, String subtitle, List<FeeReimbursementsHistoryDetailRow> rows, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeReimbursementsHistoryDetailsResponse(id, account_number, title, subtitle, rows, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeReimbursementsHistoryDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeReimbursementsHistoryDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: acats_aggregation.service.v1.FeeReimbursementsHistoryDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeReimbursementsHistoryDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSubtitle());
                }
                return size + FeeReimbursementsHistoryDetailRow.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getRows());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeReimbursementsHistoryDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                FeeReimbursementsHistoryDetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getRows());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeReimbursementsHistoryDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FeeReimbursementsHistoryDetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getRows());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FeeReimbursementsHistoryDetailsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FeeReimbursementsHistoryDetailsResponse(strDecode, strDecode2, strDecode3, strDecode4, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        arrayList.add(FeeReimbursementsHistoryDetailRow.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeReimbursementsHistoryDetailsResponse redact(FeeReimbursementsHistoryDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FeeReimbursementsHistoryDetailsResponse.copy$default(value, null, null, null, null, Internal.m26823redactElements(value.getRows(), FeeReimbursementsHistoryDetailRow.ADAPTER), ByteString.EMPTY, 15, null);
            }
        };
    }
}
