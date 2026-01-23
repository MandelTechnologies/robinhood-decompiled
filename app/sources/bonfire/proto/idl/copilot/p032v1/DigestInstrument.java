package bonfire.proto.idl.copilot.p032v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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

/* compiled from: DigestInstrument.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/DigestInstrument;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "symbol", "instrument_type", "Lbonfire/proto/idl/copilot/v1/InstrumentType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/copilot/v1/InstrumentType;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getDisplay_name", "getSymbol", "getInstrument_type", "()Lbonfire/proto/idl/copilot/v1/InstrumentType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class DigestInstrument extends Message {

    @JvmField
    public static final ProtoAdapter<DigestInstrument> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String display_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String symbol;

    public DigestInstrument() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ DigestInstrument(String str, String str2, String str3, InstrumentType instrumentType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8847newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigestInstrument(String instrument_id, String display_name, String symbol, InstrumentType instrument_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.display_name = display_name;
        this.symbol = symbol;
        this.instrument_type = instrument_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8847newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DigestInstrument)) {
            return false;
        }
        DigestInstrument digestInstrument = (DigestInstrument) other;
        return Intrinsics.areEqual(unknownFields(), digestInstrument.unknownFields()) && Intrinsics.areEqual(this.instrument_id, digestInstrument.instrument_id) && Intrinsics.areEqual(this.display_name, digestInstrument.display_name) && Intrinsics.areEqual(this.symbol, digestInstrument.symbol) && this.instrument_type == digestInstrument.instrument_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.display_name.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.instrument_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("display_name=" + Internal.sanitize(this.display_name));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("instrument_type=" + this.instrument_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DigestInstrument{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DigestInstrument copy$default(DigestInstrument digestInstrument, String str, String str2, String str3, InstrumentType instrumentType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = digestInstrument.instrument_id;
        }
        if ((i & 2) != 0) {
            str2 = digestInstrument.display_name;
        }
        if ((i & 4) != 0) {
            str3 = digestInstrument.symbol;
        }
        if ((i & 8) != 0) {
            instrumentType = digestInstrument.instrument_type;
        }
        if ((i & 16) != 0) {
            byteString = digestInstrument.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return digestInstrument.copy(str, str2, str4, instrumentType, byteString2);
    }

    public final DigestInstrument copy(String instrument_id, String display_name, String symbol, InstrumentType instrument_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DigestInstrument(instrument_id, display_name, symbol, instrument_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DigestInstrument.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DigestInstrument>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.DigestInstrument$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DigestInstrument value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDisplay_name());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol());
                }
                return value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED ? size + InstrumentType.ADAPTER.encodedSizeWithTag(4, value.getInstrument_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DigestInstrument value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisplay_name());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 4, (int) value.getInstrument_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DigestInstrument value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 4, (int) value.getInstrument_type());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisplay_name());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DigestInstrument decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InstrumentType instrumentTypeDecode = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    InstrumentType instrumentType = instrumentTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DigestInstrument(strDecode, strDecode2, strDecode3, instrumentType, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DigestInstrument redact(DigestInstrument value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DigestInstrument.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
