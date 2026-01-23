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

/* compiled from: EntryTypeInfo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J,\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryTypeInfo;", "Lcom/squareup/wire/Message;", "", "type", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryType;", "dropdown_values", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryType;Ljava/util/List;Lokio/ByteString;)V", "getType", "()Lmicrogram/contracts/money_movement/form_entry/proto/v1/EntryType;", "getDropdown_values", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class EntryTypeInfo extends Message {

    @JvmField
    public static final ProtoAdapter<EntryTypeInfo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dropdownValues", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> dropdown_values;

    @WireField(adapter = "microgram.contracts.money_movement.form_entry.proto.v1.EntryType#ADAPTER", schemaIndex = 0, tag = 1)
    private final EntryType type;

    public EntryTypeInfo() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29177newBuilder();
    }

    public final EntryType getType() {
        return this.type;
    }

    public /* synthetic */ EntryTypeInfo(EntryType entryType, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : entryType, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryTypeInfo(EntryType entryType, List<String> dropdown_values, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(dropdown_values, "dropdown_values");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = entryType;
        this.dropdown_values = Internal.immutableCopyOf("dropdown_values", dropdown_values);
    }

    public final List<String> getDropdown_values() {
        return this.dropdown_values;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29177newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EntryTypeInfo)) {
            return false;
        }
        EntryTypeInfo entryTypeInfo = (EntryTypeInfo) other;
        return Intrinsics.areEqual(unknownFields(), entryTypeInfo.unknownFields()) && this.type == entryTypeInfo.type && Intrinsics.areEqual(this.dropdown_values, entryTypeInfo.dropdown_values);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EntryType entryType = this.type;
        int iHashCode2 = ((iHashCode + (entryType != null ? entryType.hashCode() : 0)) * 37) + this.dropdown_values.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        EntryType entryType = this.type;
        if (entryType != null) {
            arrayList.add("type=" + entryType);
        }
        if (!this.dropdown_values.isEmpty()) {
            arrayList.add("dropdown_values=" + Internal.sanitize(this.dropdown_values));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EntryTypeInfo{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntryTypeInfo copy$default(EntryTypeInfo entryTypeInfo, EntryType entryType, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            entryType = entryTypeInfo.type;
        }
        if ((i & 2) != 0) {
            list = entryTypeInfo.dropdown_values;
        }
        if ((i & 4) != 0) {
            byteString = entryTypeInfo.unknownFields();
        }
        return entryTypeInfo.copy(entryType, list, byteString);
    }

    public final EntryTypeInfo copy(EntryType type2, List<String> dropdown_values, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(dropdown_values, "dropdown_values");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EntryTypeInfo(type2, dropdown_values, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryTypeInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EntryTypeInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.money_movement.form_entry.proto.v1.EntryTypeInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EntryTypeInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + EntryType.ADAPTER.encodedSizeWithTag(1, value.getType()) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.getDropdown_values());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EntryTypeInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                EntryType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getDropdown_values());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EntryTypeInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getDropdown_values());
                EntryType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EntryTypeInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                EntryType entryTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EntryTypeInfo(entryTypeDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            entryTypeDecode = EntryType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EntryTypeInfo redact(EntryTypeInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EntryTypeInfo.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
