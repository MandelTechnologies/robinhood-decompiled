package equity_trading_tax_lots.proto.p460v1;

import com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderFragment;
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

/* compiled from: TaxLotSelection.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "Lcom/squareup/wire/Message;", "", "id", "", EquityShareOrderFragment.ARG_SHARES, "term", "Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTerm;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getShares", "getTerm", "()Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TaxLotSelection extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLotSelection> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String shares;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotTerm#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TaxLotTerm term;

    public TaxLotSelection() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28075newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ TaxLotSelection(String str, String str2, TaxLotTerm taxLotTerm, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED : taxLotTerm, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getShares() {
        return this.shares;
    }

    public final TaxLotTerm getTerm() {
        return this.term;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLotSelection(String id, String str, TaxLotTerm term, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.shares = str;
        this.term = term;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28075newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLotSelection)) {
            return false;
        }
        TaxLotSelection taxLotSelection = (TaxLotSelection) other;
        return Intrinsics.areEqual(unknownFields(), taxLotSelection.unknownFields()) && Intrinsics.areEqual(this.id, taxLotSelection.id) && Intrinsics.areEqual(this.shares, taxLotSelection.shares) && this.term == taxLotSelection.term;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        String str = this.shares;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.term.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        String str = this.shares;
        if (str != null) {
            arrayList.add("shares=" + Internal.sanitize(str));
        }
        arrayList.add("term=" + this.term);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLotSelection{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLotSelection copy$default(TaxLotSelection taxLotSelection, String str, String str2, TaxLotTerm taxLotTerm, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotSelection.id;
        }
        if ((i & 2) != 0) {
            str2 = taxLotSelection.shares;
        }
        if ((i & 4) != 0) {
            taxLotTerm = taxLotSelection.term;
        }
        if ((i & 8) != 0) {
            byteString = taxLotSelection.unknownFields();
        }
        return taxLotSelection.copy(str, str2, taxLotTerm, byteString);
    }

    public final TaxLotSelection copy(String id, String shares, TaxLotTerm term, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLotSelection(id, shares, term, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotSelection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLotSelection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.TaxLotSelection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLotSelection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getShares());
                return value.getTerm() != TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED ? iEncodedSizeWithTag + TaxLotTerm.ADAPTER.encodedSizeWithTag(3, value.getTerm()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLotSelection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getShares());
                if (value.getTerm() != TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED) {
                    TaxLotTerm.ADAPTER.encodeWithTag(writer, 3, (int) value.getTerm());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLotSelection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTerm() != TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED) {
                    TaxLotTerm.ADAPTER.encodeWithTag(writer, 3, (int) value.getTerm());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getShares());
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotSelection decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaxLotTerm taxLotTermDecode = TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TaxLotSelection(strDecode, strDecode2, taxLotTermDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            taxLotTermDecode = TaxLotTerm.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotSelection redact(TaxLotSelection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TaxLotSelection.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
