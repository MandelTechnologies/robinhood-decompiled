package com.robinhood.rosetta.nummus;

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

/* compiled from: CurrencyMovement.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0019R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b$\u0010\u001e¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyMovement;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", "currency_id", "", "amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "source_id", "unknownFields", "<init>", "(Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lokio/ByteString;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lokio/ByteString;Lokio/ByteString;)Lcom/robinhood/rosetta/nummus/CurrencyMovement;", "Lokio/ByteString;", "getCurrency_id", "()Lokio/ByteString;", "Ljava/lang/String;", "getAmount", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getSource_id", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CurrencyMovement extends Message {

    @JvmField
    public static final ProtoAdapter<CurrencyMovement> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "currencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString currency_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "sourceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ByteString source_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant timestamp;

    public CurrencyMovement() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24730newBuilder();
    }

    public final ByteString getCurrency_id() {
        return this.currency_id;
    }

    public /* synthetic */ CurrencyMovement(ByteString byteString, String str, Instant instant, ByteString byteString2, ByteString byteString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? ByteString.EMPTY : byteString2, (i & 16) != 0 ? ByteString.EMPTY : byteString3);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final ByteString getSource_id() {
        return this.source_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyMovement(ByteString currency_id, String amount, Instant instant, ByteString source_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_id = currency_id;
        this.amount = amount;
        this.timestamp = instant;
        this.source_id = source_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24730newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CurrencyMovement)) {
            return false;
        }
        CurrencyMovement currencyMovement = (CurrencyMovement) other;
        return Intrinsics.areEqual(unknownFields(), currencyMovement.unknownFields()) && Intrinsics.areEqual(this.currency_id, currencyMovement.currency_id) && Intrinsics.areEqual(this.amount, currencyMovement.amount) && Intrinsics.areEqual(this.timestamp, currencyMovement.timestamp) && Intrinsics.areEqual(this.source_id, currencyMovement.source_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.currency_id.hashCode()) * 37) + this.amount.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.source_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_id=" + this.currency_id);
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("source_id=" + this.source_id);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CurrencyMovement{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CurrencyMovement copy$default(CurrencyMovement currencyMovement, ByteString byteString, String str, Instant instant, ByteString byteString2, ByteString byteString3, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = currencyMovement.currency_id;
        }
        if ((i & 2) != 0) {
            str = currencyMovement.amount;
        }
        if ((i & 4) != 0) {
            instant = currencyMovement.timestamp;
        }
        if ((i & 8) != 0) {
            byteString2 = currencyMovement.source_id;
        }
        if ((i & 16) != 0) {
            byteString3 = currencyMovement.unknownFields();
        }
        ByteString byteString4 = byteString3;
        Instant instant2 = instant;
        return currencyMovement.copy(byteString, str, instant2, byteString2, byteString4);
    }

    public final CurrencyMovement copy(ByteString currency_id, String amount, Instant timestamp, ByteString source_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CurrencyMovement(currency_id, amount, timestamp, source_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyMovement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CurrencyMovement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.nummus.CurrencyMovement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CurrencyMovement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ByteString currency_id = value.getCurrency_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(currency_id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getCurrency_id());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAmount());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getTimestamp());
                }
                return !Intrinsics.areEqual(value.getSource_id(), byteString) ? size + ProtoAdapter.BYTES.encodedSizeWithTag(4, value.getSource_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CurrencyMovement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ByteString currency_id = value.getCurrency_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(currency_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getCurrency_id());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getSource_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 4, (int) value.getSource_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CurrencyMovement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ByteString source_id = value.getSource_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(source_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 4, (int) value.getSource_id());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (Intrinsics.areEqual(value.getCurrency_id(), byteString)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getCurrency_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CurrencyMovement decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                String strDecode = "";
                ByteString byteStringDecode2 = byteStringDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CurrencyMovement(byteStringDecode, strDecode, instantDecode, byteStringDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 4) {
                        byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CurrencyMovement redact(CurrencyMovement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return CurrencyMovement.copy$default(value, null, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, ByteString.EMPTY, 11, null);
            }
        };
    }
}
