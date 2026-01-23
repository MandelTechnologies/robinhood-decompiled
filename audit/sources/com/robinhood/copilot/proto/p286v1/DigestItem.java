package com.robinhood.copilot.proto.p286v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: DigestItem.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestItem;", "Lcom/squareup/wire/Message;", "", "item_type", "Lcom/robinhood/copilot/proto/v1/DigestItemType;", "generic_item", "Lcom/robinhood/copilot/proto/v1/GenericDigestItem;", "return_driver_item", "Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItem;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/copilot/proto/v1/DigestItemType;Lcom/robinhood/copilot/proto/v1/GenericDigestItem;Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItem;Lokio/ByteString;)V", "getItem_type", "()Lcom/robinhood/copilot/proto/v1/DigestItemType;", "getGeneric_item", "()Lcom/robinhood/copilot/proto/v1/GenericDigestItem;", "getReturn_driver_item", "()Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItem;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class DigestItem extends Message {

    @JvmField
    public static final ProtoAdapter<DigestItem> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.GenericDigestItem#ADAPTER", jsonName = "genericItem", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final GenericDigestItem generic_item;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.DigestItemType#ADAPTER", jsonName = "itemType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final DigestItemType item_type;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.ReturnDriverDigestItem#ADAPTER", jsonName = "returnDriverItem", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ReturnDriverDigestItem return_driver_item;

    public DigestItem() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22090newBuilder();
    }

    public final DigestItemType getItem_type() {
        return this.item_type;
    }

    public /* synthetic */ DigestItem(DigestItemType digestItemType, GenericDigestItem genericDigestItem, ReturnDriverDigestItem returnDriverDigestItem, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DigestItemType.DIGEST_ITEM_TYPE_UNSPECIFIED : digestItemType, (i & 2) != 0 ? null : genericDigestItem, (i & 4) != 0 ? null : returnDriverDigestItem, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final GenericDigestItem getGeneric_item() {
        return this.generic_item;
    }

    public final ReturnDriverDigestItem getReturn_driver_item() {
        return this.return_driver_item;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigestItem(DigestItemType item_type, GenericDigestItem genericDigestItem, ReturnDriverDigestItem returnDriverDigestItem, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(item_type, "item_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.item_type = item_type;
        this.generic_item = genericDigestItem;
        this.return_driver_item = returnDriverDigestItem;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22090newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DigestItem)) {
            return false;
        }
        DigestItem digestItem = (DigestItem) other;
        return Intrinsics.areEqual(unknownFields(), digestItem.unknownFields()) && this.item_type == digestItem.item_type && Intrinsics.areEqual(this.generic_item, digestItem.generic_item) && Intrinsics.areEqual(this.return_driver_item, digestItem.return_driver_item);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.item_type.hashCode()) * 37;
        GenericDigestItem genericDigestItem = this.generic_item;
        int iHashCode2 = (iHashCode + (genericDigestItem != null ? genericDigestItem.hashCode() : 0)) * 37;
        ReturnDriverDigestItem returnDriverDigestItem = this.return_driver_item;
        int iHashCode3 = iHashCode2 + (returnDriverDigestItem != null ? returnDriverDigestItem.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("item_type=" + this.item_type);
        GenericDigestItem genericDigestItem = this.generic_item;
        if (genericDigestItem != null) {
            arrayList.add("generic_item=" + genericDigestItem);
        }
        ReturnDriverDigestItem returnDriverDigestItem = this.return_driver_item;
        if (returnDriverDigestItem != null) {
            arrayList.add("return_driver_item=" + returnDriverDigestItem);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DigestItem{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DigestItem copy$default(DigestItem digestItem, DigestItemType digestItemType, GenericDigestItem genericDigestItem, ReturnDriverDigestItem returnDriverDigestItem, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            digestItemType = digestItem.item_type;
        }
        if ((i & 2) != 0) {
            genericDigestItem = digestItem.generic_item;
        }
        if ((i & 4) != 0) {
            returnDriverDigestItem = digestItem.return_driver_item;
        }
        if ((i & 8) != 0) {
            byteString = digestItem.unknownFields();
        }
        return digestItem.copy(digestItemType, genericDigestItem, returnDriverDigestItem, byteString);
    }

    public final DigestItem copy(DigestItemType item_type, GenericDigestItem generic_item, ReturnDriverDigestItem return_driver_item, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(item_type, "item_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DigestItem(item_type, generic_item, return_driver_item, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DigestItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DigestItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.DigestItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DigestItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getItem_type() != DigestItemType.DIGEST_ITEM_TYPE_UNSPECIFIED) {
                    size += DigestItemType.ADAPTER.encodedSizeWithTag(1, value.getItem_type());
                }
                if (value.getGeneric_item() != null) {
                    size += GenericDigestItem.ADAPTER.encodedSizeWithTag(2, value.getGeneric_item());
                }
                return value.getReturn_driver_item() != null ? size + ReturnDriverDigestItem.ADAPTER.encodedSizeWithTag(3, value.getReturn_driver_item()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DigestItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getItem_type() != DigestItemType.DIGEST_ITEM_TYPE_UNSPECIFIED) {
                    DigestItemType.ADAPTER.encodeWithTag(writer, 1, (int) value.getItem_type());
                }
                if (value.getGeneric_item() != null) {
                    GenericDigestItem.ADAPTER.encodeWithTag(writer, 2, (int) value.getGeneric_item());
                }
                if (value.getReturn_driver_item() != null) {
                    ReturnDriverDigestItem.ADAPTER.encodeWithTag(writer, 3, (int) value.getReturn_driver_item());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DigestItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getReturn_driver_item() != null) {
                    ReturnDriverDigestItem.ADAPTER.encodeWithTag(writer, 3, (int) value.getReturn_driver_item());
                }
                if (value.getGeneric_item() != null) {
                    GenericDigestItem.ADAPTER.encodeWithTag(writer, 2, (int) value.getGeneric_item());
                }
                if (value.getItem_type() != DigestItemType.DIGEST_ITEM_TYPE_UNSPECIFIED) {
                    DigestItemType.ADAPTER.encodeWithTag(writer, 1, (int) value.getItem_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DigestItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DigestItemType digestItemTypeDecode = DigestItemType.DIGEST_ITEM_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                GenericDigestItem genericDigestItemDecode = null;
                ReturnDriverDigestItem returnDriverDigestItemDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DigestItem(digestItemTypeDecode, genericDigestItemDecode, returnDriverDigestItemDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            digestItemTypeDecode = DigestItemType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        genericDigestItemDecode = GenericDigestItem.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        returnDriverDigestItemDecode = ReturnDriverDigestItem.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DigestItem redact(DigestItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GenericDigestItem generic_item = value.getGeneric_item();
                GenericDigestItem genericDigestItemRedact = generic_item != null ? GenericDigestItem.ADAPTER.redact(generic_item) : null;
                ReturnDriverDigestItem return_driver_item = value.getReturn_driver_item();
                return DigestItem.copy$default(value, null, genericDigestItemRedact, return_driver_item != null ? ReturnDriverDigestItem.ADAPTER.redact(return_driver_item) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
