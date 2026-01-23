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

/* compiled from: MarginTieredRatesContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContext;", "Lcom/squareup/wire/Message;", "", "margin_available_amount", "", "highlighted_amount_borrowed_range", "", "highlighted_interest_rate", "unknownFields", "Lokio/ByteString;", "<init>", "(DLjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getMargin_available_amount", "()D", "getHighlighted_amount_borrowed_range", "()Ljava/lang/String;", "getHighlighted_interest_rate", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class MarginTieredRatesContext extends Message {

    @JvmField
    public static final ProtoAdapter<MarginTieredRatesContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "highlightedAmountBorrowedRange", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String highlighted_amount_borrowed_range;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "highlightedInterestRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String highlighted_interest_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "marginAvailableAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double margin_available_amount;

    public MarginTieredRatesContext() {
        this(0.0d, null, null, null, 15, null);
    }

    public /* synthetic */ MarginTieredRatesContext(double d, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24379newBuilder();
    }

    public final double getMargin_available_amount() {
        return this.margin_available_amount;
    }

    public final String getHighlighted_amount_borrowed_range() {
        return this.highlighted_amount_borrowed_range;
    }

    public final String getHighlighted_interest_rate() {
        return this.highlighted_interest_rate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginTieredRatesContext(double d, String highlighted_amount_borrowed_range, String highlighted_interest_rate, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(highlighted_amount_borrowed_range, "highlighted_amount_borrowed_range");
        Intrinsics.checkNotNullParameter(highlighted_interest_rate, "highlighted_interest_rate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.margin_available_amount = d;
        this.highlighted_amount_borrowed_range = highlighted_amount_borrowed_range;
        this.highlighted_interest_rate = highlighted_interest_rate;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24379newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginTieredRatesContext)) {
            return false;
        }
        MarginTieredRatesContext marginTieredRatesContext = (MarginTieredRatesContext) other;
        return Intrinsics.areEqual(unknownFields(), marginTieredRatesContext.unknownFields()) && this.margin_available_amount == marginTieredRatesContext.margin_available_amount && Intrinsics.areEqual(this.highlighted_amount_borrowed_range, marginTieredRatesContext.highlighted_amount_borrowed_range) && Intrinsics.areEqual(this.highlighted_interest_rate, marginTieredRatesContext.highlighted_interest_rate);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Double.hashCode(this.margin_available_amount)) * 37) + this.highlighted_amount_borrowed_range.hashCode()) * 37) + this.highlighted_interest_rate.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("margin_available_amount=" + this.margin_available_amount);
        arrayList.add("highlighted_amount_borrowed_range=" + Internal.sanitize(this.highlighted_amount_borrowed_range));
        arrayList.add("highlighted_interest_rate=" + Internal.sanitize(this.highlighted_interest_rate));
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginTieredRatesContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginTieredRatesContext copy$default(MarginTieredRatesContext marginTieredRatesContext, double d, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = marginTieredRatesContext.margin_available_amount;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            str = marginTieredRatesContext.highlighted_amount_borrowed_range;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = marginTieredRatesContext.highlighted_interest_rate;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            byteString = marginTieredRatesContext.unknownFields();
        }
        return marginTieredRatesContext.copy(d2, str3, str4, byteString);
    }

    public final MarginTieredRatesContext copy(double margin_available_amount, String highlighted_amount_borrowed_range, String highlighted_interest_rate, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(highlighted_amount_borrowed_range, "highlighted_amount_borrowed_range");
        Intrinsics.checkNotNullParameter(highlighted_interest_rate, "highlighted_interest_rate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginTieredRatesContext(margin_available_amount, highlighted_amount_borrowed_range, highlighted_interest_rate, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginTieredRatesContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginTieredRatesContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MarginTieredRatesContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginTieredRatesContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Double.valueOf(value.getMargin_available_amount()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getMargin_available_amount()));
                }
                if (!Intrinsics.areEqual(value.getHighlighted_amount_borrowed_range(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getHighlighted_amount_borrowed_range());
                }
                return !Intrinsics.areEqual(value.getHighlighted_interest_rate(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getHighlighted_interest_rate()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginTieredRatesContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Double.valueOf(value.getMargin_available_amount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getMargin_available_amount()));
                }
                if (!Intrinsics.areEqual(value.getHighlighted_amount_borrowed_range(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHighlighted_amount_borrowed_range());
                }
                if (!Intrinsics.areEqual(value.getHighlighted_interest_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getHighlighted_interest_rate());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginTieredRatesContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getHighlighted_interest_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getHighlighted_interest_rate());
                }
                if (!Intrinsics.areEqual(value.getHighlighted_amount_borrowed_range(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHighlighted_amount_borrowed_range());
                }
                if (Double.valueOf(value.getMargin_available_amount()).equals(Double.valueOf(0.0d))) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getMargin_available_amount()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginTieredRatesContext redact(MarginTieredRatesContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MarginTieredRatesContext.copy$default(value, 0.0d, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginTieredRatesContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                double dDoubleValue = 0.0d;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarginTieredRatesContext(dDoubleValue, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
