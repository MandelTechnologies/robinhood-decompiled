package moneytree.p510v1;

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
import p479j$.time.Instant;

/* compiled from: ListMonthlyInterestHistoryRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BI\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b#\u0010\"¨\u0006%"}, m3636d2 = {"Lmoneytree/v1/ListMonthlyInterestHistoryRequest;", "Lcom/squareup/wire/Message;", "", "", "cursor", "", "limit", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at_gte", "created_at_lte", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;ILj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;ILj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lmoneytree/v1/ListMonthlyInterestHistoryRequest;", "Ljava/lang/String;", "getCursor", "I", "getLimit", "Lj$/time/Instant;", "getCreated_at_gte", "()Lj$/time/Instant;", "getCreated_at_lte", "Companion", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ListMonthlyInterestHistoryRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ListMonthlyInterestHistoryRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAtGte", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant created_at_gte;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAtLte", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant created_at_lte;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int limit;

    public ListMonthlyInterestHistoryRequest() {
        this(null, 0, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29335newBuilder();
    }

    public final String getCursor() {
        return this.cursor;
    }

    public /* synthetic */ ListMonthlyInterestHistoryRequest(String str, int i, Instant instant, Instant instant2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : instant, (i2 & 8) != 0 ? null : instant2, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getLimit() {
        return this.limit;
    }

    public final Instant getCreated_at_gte() {
        return this.created_at_gte;
    }

    public final Instant getCreated_at_lte() {
        return this.created_at_lte;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMonthlyInterestHistoryRequest(String cursor, int i, Instant instant, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.cursor = cursor;
        this.limit = i;
        this.created_at_gte = instant;
        this.created_at_lte = instant2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29335newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListMonthlyInterestHistoryRequest)) {
            return false;
        }
        ListMonthlyInterestHistoryRequest listMonthlyInterestHistoryRequest = (ListMonthlyInterestHistoryRequest) other;
        return Intrinsics.areEqual(unknownFields(), listMonthlyInterestHistoryRequest.unknownFields()) && Intrinsics.areEqual(this.cursor, listMonthlyInterestHistoryRequest.cursor) && this.limit == listMonthlyInterestHistoryRequest.limit && Intrinsics.areEqual(this.created_at_gte, listMonthlyInterestHistoryRequest.created_at_gte) && Intrinsics.areEqual(this.created_at_lte, listMonthlyInterestHistoryRequest.created_at_lte);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.cursor.hashCode()) * 37) + Integer.hashCode(this.limit)) * 37;
        Instant instant = this.created_at_gte;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.created_at_lte;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("cursor=" + Internal.sanitize(this.cursor));
        arrayList.add("limit=" + this.limit);
        Instant instant = this.created_at_gte;
        if (instant != null) {
            arrayList.add("created_at_gte=" + instant);
        }
        Instant instant2 = this.created_at_lte;
        if (instant2 != null) {
            arrayList.add("created_at_lte=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListMonthlyInterestHistoryRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ListMonthlyInterestHistoryRequest copy$default(ListMonthlyInterestHistoryRequest listMonthlyInterestHistoryRequest, String str, int i, Instant instant, Instant instant2, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = listMonthlyInterestHistoryRequest.cursor;
        }
        if ((i2 & 2) != 0) {
            i = listMonthlyInterestHistoryRequest.limit;
        }
        if ((i2 & 4) != 0) {
            instant = listMonthlyInterestHistoryRequest.created_at_gte;
        }
        if ((i2 & 8) != 0) {
            instant2 = listMonthlyInterestHistoryRequest.created_at_lte;
        }
        if ((i2 & 16) != 0) {
            byteString = listMonthlyInterestHistoryRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        Instant instant3 = instant;
        return listMonthlyInterestHistoryRequest.copy(str, i, instant3, instant2, byteString2);
    }

    public final ListMonthlyInterestHistoryRequest copy(String cursor, int limit, Instant created_at_gte, Instant created_at_lte, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListMonthlyInterestHistoryRequest(cursor, limit, created_at_gte, created_at_lte, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListMonthlyInterestHistoryRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListMonthlyInterestHistoryRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: moneytree.v1.ListMonthlyInterestHistoryRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListMonthlyInterestHistoryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCursor());
                }
                if (value.getLimit() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getLimit()));
                }
                if (value.getCreated_at_gte() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getCreated_at_gte());
                }
                return value.getCreated_at_lte() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getCreated_at_lte()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListMonthlyInterestHistoryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCursor());
                }
                if (value.getLimit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLimit()));
                }
                if (value.getCreated_at_gte() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getCreated_at_gte());
                }
                if (value.getCreated_at_lte() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at_lte());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListMonthlyInterestHistoryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCreated_at_lte() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at_lte());
                }
                if (value.getCreated_at_gte() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getCreated_at_gte());
                }
                if (value.getLimit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLimit()));
                }
                if (Intrinsics.areEqual(value.getCursor(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCursor());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListMonthlyInterestHistoryRequest redact(ListMonthlyInterestHistoryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at_gte = value.getCreated_at_gte();
                Instant instantRedact = created_at_gte != null ? ProtoAdapter.INSTANT.redact(created_at_gte) : null;
                Instant created_at_lte = value.getCreated_at_lte();
                return ListMonthlyInterestHistoryRequest.copy$default(value, null, 0, instantRedact, created_at_lte != null ? ProtoAdapter.INSTANT.redact(created_at_lte) : null, ByteString.EMPTY, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListMonthlyInterestHistoryRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                int iIntValue = 0;
                Instant instantDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListMonthlyInterestHistoryRequest(strDecode, iIntValue, instantDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 3) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 4) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
