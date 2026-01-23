package com.robinhood.rosetta.eventlogging;

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

/* compiled from: Basket.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Basket;", "Lcom/squareup/wire/Message;", "", "item_num", "", "item_list", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ILjava/lang/String;Lokio/ByteString;)V", "getItem_num", "()I", "getItem_list", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Basket extends Message {

    @JvmField
    public static final ProtoAdapter<Basket> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "itemList", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String item_list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "itemNum", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int item_num;

    public Basket() {
        this(0, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24030newBuilder();
    }

    public final int getItem_num() {
        return this.item_num;
    }

    public final String getItem_list() {
        return this.item_list;
    }

    public /* synthetic */ Basket(int i, String str, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Basket(int i, String item_list, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(item_list, "item_list");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.item_num = i;
        this.item_list = item_list;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24030newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Basket)) {
            return false;
        }
        Basket basket = (Basket) other;
        return Intrinsics.areEqual(unknownFields(), basket.unknownFields()) && this.item_num == basket.item_num && Intrinsics.areEqual(this.item_list, basket.item_list);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.item_num)) * 37) + this.item_list.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("item_num=" + this.item_num);
        arrayList.add("item_list=" + Internal.sanitize(this.item_list));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Basket{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Basket copy$default(Basket basket, int i, String str, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = basket.item_num;
        }
        if ((i2 & 2) != 0) {
            str = basket.item_list;
        }
        if ((i2 & 4) != 0) {
            byteString = basket.unknownFields();
        }
        return basket.copy(i, str, byteString);
    }

    public final Basket copy(int item_num, String item_list, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(item_list, "item_list");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Basket(item_num, item_list, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Basket.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Basket>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Basket$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Basket value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getItem_num() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getItem_num()));
                }
                return !Intrinsics.areEqual(value.getItem_list(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getItem_list()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Basket value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getItem_num() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getItem_num()));
                }
                if (!Intrinsics.areEqual(value.getItem_list(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getItem_list());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Basket value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getItem_list(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getItem_list());
                }
                if (value.getItem_num() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getItem_num()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Basket redact(Basket value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Basket.copy$default(value, 0, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Basket decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Basket(iIntValue, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
