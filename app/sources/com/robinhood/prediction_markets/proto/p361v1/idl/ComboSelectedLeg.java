package com.robinhood.prediction_markets.proto.p361v1.idl;

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

/* compiled from: ComboSelectedLeg.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComboSelectedLeg;", "Lcom/squareup/wire/Message;", "", "event_symbol", "", "event_contract_symbol", "side", "Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;", "event_contract_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;Ljava/lang/String;Lokio/ByteString;)V", "getEvent_symbol", "()Ljava/lang/String;", "getEvent_contract_symbol", "getSide", "()Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;", "getEvent_contract_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ComboSelectedLeg extends Message {

    @JvmField
    public static final ProtoAdapter<ComboSelectedLeg> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventContractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String event_contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventContractSymbol", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String event_contract_symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventSymbol", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String event_symbol;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.YesNo#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final YesNo side;

    public ComboSelectedLeg() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ ComboSelectedLeg(String str, String str2, YesNo yesNo, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? YesNo.YESNO_UNSPECIFIED : yesNo, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23769newBuilder();
    }

    public final String getEvent_symbol() {
        return this.event_symbol;
    }

    public final String getEvent_contract_symbol() {
        return this.event_contract_symbol;
    }

    public final YesNo getSide() {
        return this.side;
    }

    public final String getEvent_contract_id() {
        return this.event_contract_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboSelectedLeg(String event_symbol, String event_contract_symbol, YesNo side, String event_contract_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event_symbol, "event_symbol");
        Intrinsics.checkNotNullParameter(event_contract_symbol, "event_contract_symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(event_contract_id, "event_contract_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_symbol = event_symbol;
        this.event_contract_symbol = event_contract_symbol;
        this.side = side;
        this.event_contract_id = event_contract_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23769newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ComboSelectedLeg)) {
            return false;
        }
        ComboSelectedLeg comboSelectedLeg = (ComboSelectedLeg) other;
        return Intrinsics.areEqual(unknownFields(), comboSelectedLeg.unknownFields()) && Intrinsics.areEqual(this.event_symbol, comboSelectedLeg.event_symbol) && Intrinsics.areEqual(this.event_contract_symbol, comboSelectedLeg.event_contract_symbol) && this.side == comboSelectedLeg.side && Intrinsics.areEqual(this.event_contract_id, comboSelectedLeg.event_contract_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.event_symbol.hashCode()) * 37) + this.event_contract_symbol.hashCode()) * 37) + this.side.hashCode()) * 37) + this.event_contract_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_symbol=" + Internal.sanitize(this.event_symbol));
        arrayList.add("event_contract_symbol=" + Internal.sanitize(this.event_contract_symbol));
        arrayList.add("side=" + this.side);
        arrayList.add("event_contract_id=" + Internal.sanitize(this.event_contract_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ComboSelectedLeg{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ComboSelectedLeg copy$default(ComboSelectedLeg comboSelectedLeg, String str, String str2, YesNo yesNo, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comboSelectedLeg.event_symbol;
        }
        if ((i & 2) != 0) {
            str2 = comboSelectedLeg.event_contract_symbol;
        }
        if ((i & 4) != 0) {
            yesNo = comboSelectedLeg.side;
        }
        if ((i & 8) != 0) {
            str3 = comboSelectedLeg.event_contract_id;
        }
        if ((i & 16) != 0) {
            byteString = comboSelectedLeg.unknownFields();
        }
        ByteString byteString2 = byteString;
        YesNo yesNo2 = yesNo;
        return comboSelectedLeg.copy(str, str2, yesNo2, str3, byteString2);
    }

    public final ComboSelectedLeg copy(String event_symbol, String event_contract_symbol, YesNo side, String event_contract_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event_symbol, "event_symbol");
        Intrinsics.checkNotNullParameter(event_contract_symbol, "event_contract_symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(event_contract_id, "event_contract_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ComboSelectedLeg(event_symbol, event_contract_symbol, side, event_contract_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ComboSelectedLeg.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ComboSelectedLeg>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ComboSelectedLeg$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ComboSelectedLeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEvent_symbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEvent_symbol());
                }
                if (!Intrinsics.areEqual(value.getEvent_contract_symbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEvent_contract_symbol());
                }
                if (value.getSide() != YesNo.YESNO_UNSPECIFIED) {
                    size += YesNo.ADAPTER.encodedSizeWithTag(3, value.getSide());
                }
                return !Intrinsics.areEqual(value.getEvent_contract_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getEvent_contract_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ComboSelectedLeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEvent_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_symbol());
                }
                if (!Intrinsics.areEqual(value.getEvent_contract_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEvent_contract_symbol());
                }
                if (value.getSide() != YesNo.YESNO_UNSPECIFIED) {
                    YesNo.ADAPTER.encodeWithTag(writer, 3, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getEvent_contract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getEvent_contract_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ComboSelectedLeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getEvent_contract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getEvent_contract_id());
                }
                if (value.getSide() != YesNo.YESNO_UNSPECIFIED) {
                    YesNo.ADAPTER.encodeWithTag(writer, 3, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getEvent_contract_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEvent_contract_symbol());
                }
                if (Intrinsics.areEqual(value.getEvent_symbol(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_symbol());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ComboSelectedLeg decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                YesNo yesNoDecode = YesNo.YESNO_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    YesNo yesNo = yesNoDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ComboSelectedLeg(strDecode, strDecode2, yesNo, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                yesNoDecode = YesNo.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ComboSelectedLeg redact(ComboSelectedLeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ComboSelectedLeg.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
