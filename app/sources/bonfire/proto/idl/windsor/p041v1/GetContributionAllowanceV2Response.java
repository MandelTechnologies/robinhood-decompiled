package bonfire.proto.idl.windsor.p041v1;

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

/* compiled from: GetContributionAllowanceV2Response.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB5\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J4\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2Response;", "Lcom/squareup/wire/Message;", "", "items", "", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceItem;", "current_tax_year", "", "account_number", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;ILjava/lang/String;Lokio/ByteString;)V", "getCurrent_tax_year", "()I", "getAccount_number", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetContributionAllowanceV2Response extends Message {

    @JvmField
    public static final ProtoAdapter<GetContributionAllowanceV2Response> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "currentTaxYear", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int current_tax_year;

    @WireField(adapter = "bonfire.proto.idl.windsor.v1.GetContributionAllowanceItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<GetContributionAllowanceItem> items;

    public GetContributionAllowanceV2Response() {
        this(null, 0, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9058newBuilder();
    }

    public /* synthetic */ GetContributionAllowanceV2Response(List list, int i, String str, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getCurrent_tax_year() {
        return this.current_tax_year;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetContributionAllowanceV2Response(List<GetContributionAllowanceItem> items, int i, String account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.current_tax_year = i;
        this.account_number = account_number;
        this.items = Internal.immutableCopyOf("items", items);
    }

    public final List<GetContributionAllowanceItem> getItems() {
        return this.items;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9058newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetContributionAllowanceV2Response)) {
            return false;
        }
        GetContributionAllowanceV2Response getContributionAllowanceV2Response = (GetContributionAllowanceV2Response) other;
        return Intrinsics.areEqual(unknownFields(), getContributionAllowanceV2Response.unknownFields()) && Intrinsics.areEqual(this.items, getContributionAllowanceV2Response.items) && this.current_tax_year == getContributionAllowanceV2Response.current_tax_year && Intrinsics.areEqual(this.account_number, getContributionAllowanceV2Response.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.items.hashCode()) * 37) + Integer.hashCode(this.current_tax_year)) * 37) + this.account_number.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.items.isEmpty()) {
            arrayList.add("items=" + this.items);
        }
        arrayList.add("current_tax_year=" + this.current_tax_year);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetContributionAllowanceV2Response{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetContributionAllowanceV2Response copy$default(GetContributionAllowanceV2Response getContributionAllowanceV2Response, List list, int i, String str, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = getContributionAllowanceV2Response.items;
        }
        if ((i2 & 2) != 0) {
            i = getContributionAllowanceV2Response.current_tax_year;
        }
        if ((i2 & 4) != 0) {
            str = getContributionAllowanceV2Response.account_number;
        }
        if ((i2 & 8) != 0) {
            byteString = getContributionAllowanceV2Response.unknownFields();
        }
        return getContributionAllowanceV2Response.copy(list, i, str, byteString);
    }

    public final GetContributionAllowanceV2Response copy(List<GetContributionAllowanceItem> items, int current_tax_year, String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetContributionAllowanceV2Response(items, current_tax_year, account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetContributionAllowanceV2Response.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetContributionAllowanceV2Response>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.windsor.v1.GetContributionAllowanceV2Response$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetContributionAllowanceV2Response value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + GetContributionAllowanceItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getItems());
                if (value.getCurrent_tax_year() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getCurrent_tax_year()));
                }
                return !Intrinsics.areEqual(value.getAccount_number(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_number()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetContributionAllowanceV2Response value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                GetContributionAllowanceItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getItems());
                if (value.getCurrent_tax_year() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCurrent_tax_year()));
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetContributionAllowanceV2Response value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (value.getCurrent_tax_year() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCurrent_tax_year()));
                }
                GetContributionAllowanceItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getItems());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetContributionAllowanceV2Response decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetContributionAllowanceV2Response(arrayList, iIntValue, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(GetContributionAllowanceItem.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetContributionAllowanceV2Response redact(GetContributionAllowanceV2Response value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetContributionAllowanceV2Response.copy$default(value, Internal.m26823redactElements(value.getItems(), GetContributionAllowanceItem.ADAPTER), 0, null, ByteString.EMPTY, 6, null);
            }
        };
    }
}
