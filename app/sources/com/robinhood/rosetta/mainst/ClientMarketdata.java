package com.robinhood.rosetta.mainst;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ClientMarketdata.kt */
@kotlin.Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ClientMarketdata;", "Lcom/squareup/wire/Message;", "", "platform", "", "bid", "Lcom/robinhood/rosetta/mainst/Decimal;", "ask", "timestamp", "Lcom/robinhood/rosetta/mainst/Time;", "marketable", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Time;ZLokio/ByteString;)V", "getPlatform", "()Ljava/lang/String;", "getBid", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getAsk", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/Time;", "getMarketable", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ClientMarketdata extends Message {

    @JvmField
    public static final ProtoAdapter<ClientMarketdata> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Decimal ask;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Decimal bid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean marketable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String platform;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Time timestamp;

    public ClientMarketdata() {
        this(null, null, null, null, false, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24645newBuilder();
    }

    public final String getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientMarketdata(String str, Decimal decimal, Decimal decimal2, Time time, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : decimal, (i & 4) != 0 ? null : decimal2, (i & 8) != 0 ? null : time, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Decimal getBid() {
        return this.bid;
    }

    public final Decimal getAsk() {
        return this.ask;
    }

    public final Time getTimestamp() {
        return this.timestamp;
    }

    public final boolean getMarketable() {
        return this.marketable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientMarketdata(String platform, Decimal decimal, Decimal decimal2, Time time, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.bid = decimal;
        this.ask = decimal2;
        this.timestamp = time;
        this.marketable = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24645newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientMarketdata)) {
            return false;
        }
        ClientMarketdata clientMarketdata = (ClientMarketdata) other;
        return Intrinsics.areEqual(unknownFields(), clientMarketdata.unknownFields()) && Intrinsics.areEqual(this.platform, clientMarketdata.platform) && Intrinsics.areEqual(this.bid, clientMarketdata.bid) && Intrinsics.areEqual(this.ask, clientMarketdata.ask) && Intrinsics.areEqual(this.timestamp, clientMarketdata.timestamp) && this.marketable == clientMarketdata.marketable;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Decimal decimal = this.bid;
        int iHashCode2 = (iHashCode + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Decimal decimal2 = this.ask;
        int iHashCode3 = (iHashCode2 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Time time = this.timestamp;
        int iHashCode4 = ((iHashCode3 + (time != null ? time.hashCode() : 0)) * 37) + Boolean.hashCode(this.marketable);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + Internal.sanitize(this.platform));
        Decimal decimal = this.bid;
        if (decimal != null) {
            arrayList.add("bid=" + decimal);
        }
        Decimal decimal2 = this.ask;
        if (decimal2 != null) {
            arrayList.add("ask=" + decimal2);
        }
        Time time = this.timestamp;
        if (time != null) {
            arrayList.add("timestamp=" + time);
        }
        arrayList.add("marketable=" + this.marketable);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientMarketdata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientMarketdata copy$default(ClientMarketdata clientMarketdata, String str, Decimal decimal, Decimal decimal2, Time time, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientMarketdata.platform;
        }
        if ((i & 2) != 0) {
            decimal = clientMarketdata.bid;
        }
        if ((i & 4) != 0) {
            decimal2 = clientMarketdata.ask;
        }
        if ((i & 8) != 0) {
            time = clientMarketdata.timestamp;
        }
        if ((i & 16) != 0) {
            z = clientMarketdata.marketable;
        }
        if ((i & 32) != 0) {
            byteString = clientMarketdata.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        return clientMarketdata.copy(str, decimal, decimal2, time, z2, byteString2);
    }

    public final ClientMarketdata copy(String platform, Decimal bid, Decimal ask, Time timestamp, boolean marketable, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientMarketdata(platform, bid, ask, timestamp, marketable, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientMarketdata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientMarketdata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.ClientMarketdata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientMarketdata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getBid() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(2, value.getBid());
                }
                if (value.getAsk() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(3, value.getAsk());
                }
                if (value.getTimestamp() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(4, value.getTimestamp());
                }
                return value.getMarketable() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getMarketable())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientMarketdata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getBid() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 2, (int) value.getBid());
                }
                if (value.getAsk() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getAsk());
                }
                if (value.getTimestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (value.getMarketable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getMarketable()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientMarketdata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMarketable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getMarketable()));
                }
                if (value.getTimestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (value.getAsk() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getAsk());
                }
                if (value.getBid() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 2, (int) value.getBid());
                }
                if (Intrinsics.areEqual(value.getPlatform(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPlatform());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientMarketdata redact(ClientMarketdata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Decimal bid = value.getBid();
                Decimal decimalRedact = bid != null ? Decimal.ADAPTER.redact(bid) : null;
                Decimal ask = value.getAsk();
                Decimal decimalRedact2 = ask != null ? Decimal.ADAPTER.redact(ask) : null;
                Time timestamp = value.getTimestamp();
                return ClientMarketdata.copy$default(value, null, decimalRedact, decimalRedact2, timestamp != null ? Time.ADAPTER.redact(timestamp) : null, false, ByteString.EMPTY, 17, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClientMarketdata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Decimal decimalDecode = null;
                Time timeDecode = null;
                boolean zBooleanValue = false;
                Decimal decimalDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ClientMarketdata(strDecode, decimalDecode, decimalDecode2, timeDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        decimalDecode = Decimal.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        decimalDecode2 = Decimal.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        timeDecode = Time.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
