package microgram.contracts.money_movement.form_entry.proto.p500v1;

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

/* compiled from: FormInput.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInput;", "Lcom/squareup/wire/Message;", "", "header", "", "placeholder", "type", "value", "entry_type", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfo;Lokio/ByteString;)V", "getHeader", "()Ljava/lang/String;", "getPlaceholder", "getType", "getValue", "getEntry_type", "()Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfo;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class FormInput extends Message {

    @JvmField
    public static final ProtoAdapter<FormInput> ADAPTER;

    @WireField(adapter = "microgram.contracts.money_movement.form_entry.proto.v1.EntryTypeInfo#ADAPTER", jsonName = "entryType", schemaIndex = 4, tag = 5)
    private final EntryTypeInfo entry_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String placeholder;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String value;

    public FormInput() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ FormInput(String str, String str2, String str3, String str4, EntryTypeInfo entryTypeInfo, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : entryTypeInfo, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29179newBuilder();
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final EntryTypeInfo getEntry_type() {
        return this.entry_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormInput(String header, String placeholder, String type2, String value, EntryTypeInfo entryTypeInfo, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.header = header;
        this.placeholder = placeholder;
        this.type = type2;
        this.value = value;
        this.entry_type = entryTypeInfo;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29179newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FormInput)) {
            return false;
        }
        FormInput formInput = (FormInput) other;
        return Intrinsics.areEqual(unknownFields(), formInput.unknownFields()) && Intrinsics.areEqual(this.header, formInput.header) && Intrinsics.areEqual(this.placeholder, formInput.placeholder) && Intrinsics.areEqual(this.type, formInput.type) && Intrinsics.areEqual(this.value, formInput.value) && Intrinsics.areEqual(this.entry_type, formInput.entry_type);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.header.hashCode()) * 37) + this.placeholder.hashCode()) * 37) + this.type.hashCode()) * 37) + this.value.hashCode()) * 37;
        EntryTypeInfo entryTypeInfo = this.entry_type;
        int iHashCode2 = iHashCode + (entryTypeInfo != null ? entryTypeInfo.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("header=" + Internal.sanitize(this.header));
        arrayList.add("placeholder=" + Internal.sanitize(this.placeholder));
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("value=" + Internal.sanitize(this.value));
        EntryTypeInfo entryTypeInfo = this.entry_type;
        if (entryTypeInfo != null) {
            arrayList.add("entry_type=" + entryTypeInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FormInput{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FormInput copy$default(FormInput formInput, String str, String str2, String str3, String str4, EntryTypeInfo entryTypeInfo, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formInput.header;
        }
        if ((i & 2) != 0) {
            str2 = formInput.placeholder;
        }
        if ((i & 4) != 0) {
            str3 = formInput.type;
        }
        if ((i & 8) != 0) {
            str4 = formInput.value;
        }
        if ((i & 16) != 0) {
            entryTypeInfo = formInput.entry_type;
        }
        if ((i & 32) != 0) {
            byteString = formInput.unknownFields();
        }
        EntryTypeInfo entryTypeInfo2 = entryTypeInfo;
        ByteString byteString2 = byteString;
        return formInput.copy(str, str2, str3, str4, entryTypeInfo2, byteString2);
    }

    public final FormInput copy(String header, String placeholder, String type2, String value, EntryTypeInfo entry_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FormInput(header, placeholder, type2, value, entry_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FormInput.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FormInput>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.money_movement.form_entry.proto.v1.FormInput$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FormInput value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeader());
                }
                if (!Intrinsics.areEqual(value.getPlaceholder(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPlaceholder());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getType());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getValue());
                }
                return size + EntryTypeInfo.ADAPTER.encodedSizeWithTag(5, value.getEntry_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FormInput value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader());
                }
                if (!Intrinsics.areEqual(value.getPlaceholder(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPlaceholder());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getValue());
                }
                EntryTypeInfo.ADAPTER.encodeWithTag(writer, 5, (int) value.getEntry_type());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FormInput value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                EntryTypeInfo.ADAPTER.encodeWithTag(writer, 5, (int) value.getEntry_type());
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getValue());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getPlaceholder(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPlaceholder());
                }
                if (Intrinsics.areEqual(value.getHeader(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FormInput redact(FormInput value) {
                Intrinsics.checkNotNullParameter(value, "value");
                EntryTypeInfo entry_type = value.getEntry_type();
                return FormInput.copy$default(value, null, null, null, null, entry_type != null ? EntryTypeInfo.ADAPTER.redact(entry_type) : null, ByteString.EMPTY, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FormInput decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                EntryTypeInfo entryTypeInfoDecode = null;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FormInput(strDecode, strDecode4, strDecode2, strDecode3, entryTypeInfoDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        entryTypeInfoDecode = EntryTypeInfo.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
