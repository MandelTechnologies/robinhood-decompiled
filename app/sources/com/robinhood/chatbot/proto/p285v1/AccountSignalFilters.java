package com.robinhood.chatbot.proto.p285v1;

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

/* compiled from: AccountSignalFilters.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/AccountSignalFilters;", "Lcom/squareup/wire/Message;", "", "field_name", "Lcom/robinhood/chatbot/proto/v1/FilterableFields;", "filter_value", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/FilterableFields;Ljava/lang/String;Lokio/ByteString;)V", "getField_name", "()Lcom/robinhood/chatbot/proto/v1/FilterableFields;", "getFilter_value", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AccountSignalFilters extends Message {

    @JvmField
    public static final ProtoAdapter<AccountSignalFilters> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.FilterableFields#ADAPTER", jsonName = "fieldName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FilterableFields field_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "filterValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String filter_value;

    public AccountSignalFilters() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20461newBuilder();
    }

    public final FilterableFields getField_name() {
        return this.field_name;
    }

    public /* synthetic */ AccountSignalFilters(FilterableFields filterableFields, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FilterableFields.FILTERABLE_FIELDS_UNSPECIFIED : filterableFields, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getFilter_value() {
        return this.filter_value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSignalFilters(FilterableFields field_name, String filter_value, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(field_name, "field_name");
        Intrinsics.checkNotNullParameter(filter_value, "filter_value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.field_name = field_name;
        this.filter_value = filter_value;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20461newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountSignalFilters)) {
            return false;
        }
        AccountSignalFilters accountSignalFilters = (AccountSignalFilters) other;
        return Intrinsics.areEqual(unknownFields(), accountSignalFilters.unknownFields()) && this.field_name == accountSignalFilters.field_name && Intrinsics.areEqual(this.filter_value, accountSignalFilters.filter_value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.field_name.hashCode()) * 37) + this.filter_value.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("field_name=" + this.field_name);
        arrayList.add("filter_value=" + Internal.sanitize(this.filter_value));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountSignalFilters{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AccountSignalFilters copy$default(AccountSignalFilters accountSignalFilters, FilterableFields filterableFields, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            filterableFields = accountSignalFilters.field_name;
        }
        if ((i & 2) != 0) {
            str = accountSignalFilters.filter_value;
        }
        if ((i & 4) != 0) {
            byteString = accountSignalFilters.unknownFields();
        }
        return accountSignalFilters.copy(filterableFields, str, byteString);
    }

    public final AccountSignalFilters copy(FilterableFields field_name, String filter_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(field_name, "field_name");
        Intrinsics.checkNotNullParameter(filter_value, "filter_value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountSignalFilters(field_name, filter_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountSignalFilters.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountSignalFilters>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.AccountSignalFilters$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountSignalFilters value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getField_name() != FilterableFields.FILTERABLE_FIELDS_UNSPECIFIED) {
                    size += FilterableFields.ADAPTER.encodedSizeWithTag(1, value.getField_name());
                }
                return !Intrinsics.areEqual(value.getFilter_value(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFilter_value()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountSignalFilters value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getField_name() != FilterableFields.FILTERABLE_FIELDS_UNSPECIFIED) {
                    FilterableFields.ADAPTER.encodeWithTag(writer, 1, (int) value.getField_name());
                }
                if (!Intrinsics.areEqual(value.getFilter_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFilter_value());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountSignalFilters value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFilter_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFilter_value());
                }
                if (value.getField_name() != FilterableFields.FILTERABLE_FIELDS_UNSPECIFIED) {
                    FilterableFields.ADAPTER.encodeWithTag(writer, 1, (int) value.getField_name());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AccountSignalFilters decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FilterableFields filterableFieldsDecode = FilterableFields.FILTERABLE_FIELDS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AccountSignalFilters(filterableFieldsDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            filterableFieldsDecode = FilterableFields.ADAPTER.decode(reader);
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
            public AccountSignalFilters redact(AccountSignalFilters value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AccountSignalFilters.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
