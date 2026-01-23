package bonfire.proto.idl.margin.p036v1;

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

/* compiled from: ViewInstrumentAction.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/ViewInstrumentAction;", "Lcom/squareup/wire/Message;", "", "id", "", "instrument_type", "Lbonfire/proto/idl/margin/v1/InstrumentType;", "symbol", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/margin/v1/InstrumentType;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getInstrument_type", "()Lbonfire/proto/idl/margin/v1/InstrumentType;", "getSymbol", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ViewInstrumentAction extends Message {

    @JvmField
    public static final ProtoAdapter<ViewInstrumentAction> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String symbol;

    public ViewInstrumentAction() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9019newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ ViewInstrumentAction(String str, InstrumentType instrumentType, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? InstrumentType.EQUITY_UNSPECIFIED : instrumentType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewInstrumentAction(String id, InstrumentType instrument_type, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.instrument_type = instrument_type;
        this.symbol = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9019newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ViewInstrumentAction)) {
            return false;
        }
        ViewInstrumentAction viewInstrumentAction = (ViewInstrumentAction) other;
        return Intrinsics.areEqual(unknownFields(), viewInstrumentAction.unknownFields()) && Intrinsics.areEqual(this.id, viewInstrumentAction.id) && this.instrument_type == viewInstrumentAction.instrument_type && Intrinsics.areEqual(this.symbol, viewInstrumentAction.symbol);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.instrument_type.hashCode()) * 37;
        String str = this.symbol;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("instrument_type=" + this.instrument_type);
        String str = this.symbol;
        if (str != null) {
            arrayList.add("symbol=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ViewInstrumentAction{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ViewInstrumentAction copy$default(ViewInstrumentAction viewInstrumentAction, String str, InstrumentType instrumentType, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewInstrumentAction.id;
        }
        if ((i & 2) != 0) {
            instrumentType = viewInstrumentAction.instrument_type;
        }
        if ((i & 4) != 0) {
            str2 = viewInstrumentAction.symbol;
        }
        if ((i & 8) != 0) {
            byteString = viewInstrumentAction.unknownFields();
        }
        return viewInstrumentAction.copy(str, instrumentType, str2, byteString);
    }

    public final ViewInstrumentAction copy(String id, InstrumentType instrument_type, String symbol, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ViewInstrumentAction(id, instrument_type, symbol, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewInstrumentAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ViewInstrumentAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.margin.v1.ViewInstrumentAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ViewInstrumentAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getInstrument_type() != InstrumentType.EQUITY_UNSPECIFIED) {
                    size += InstrumentType.ADAPTER.encodedSizeWithTag(2, value.getInstrument_type());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ViewInstrumentAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getInstrument_type() != InstrumentType.EQUITY_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 2, (int) value.getInstrument_type());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ViewInstrumentAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSymbol());
                if (value.getInstrument_type() != InstrumentType.EQUITY_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 2, (int) value.getInstrument_type());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ViewInstrumentAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InstrumentType instrumentTypeDecode = InstrumentType.EQUITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ViewInstrumentAction(strDecode, instrumentTypeDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ViewInstrumentAction redact(ViewInstrumentAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ViewInstrumentAction.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
