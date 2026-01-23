package advisory.proto.p008v1;

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

/* compiled from: ReturnComparisonRow.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Ladvisory/proto/v1/ReturnComparisonRow;", "Lcom/squareup/wire/Message;", "", "span", "", "portfolio_return", "benchmark_return", AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_LEARN_MORE, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getSpan", "()Ljava/lang/String;", "getPortfolio_return", "getBenchmark_return", "getLearn_more", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ReturnComparisonRow extends Message {

    @JvmField
    public static final ProtoAdapter<ReturnComparisonRow> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "benchmarkReturn", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String benchmark_return;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "learnMore", schemaIndex = 3, tag = 4)
    private final String learn_more;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "portfolioReturn", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String portfolio_return;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String span;

    public ReturnComparisonRow() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ ReturnComparisonRow(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4534newBuilder();
    }

    public final String getSpan() {
        return this.span;
    }

    public final String getPortfolio_return() {
        return this.portfolio_return;
    }

    public final String getBenchmark_return() {
        return this.benchmark_return;
    }

    public final String getLearn_more() {
        return this.learn_more;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnComparisonRow(String span, String portfolio_return, String benchmark_return, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(portfolio_return, "portfolio_return");
        Intrinsics.checkNotNullParameter(benchmark_return, "benchmark_return");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.span = span;
        this.portfolio_return = portfolio_return;
        this.benchmark_return = benchmark_return;
        this.learn_more = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4534newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReturnComparisonRow)) {
            return false;
        }
        ReturnComparisonRow returnComparisonRow = (ReturnComparisonRow) other;
        return Intrinsics.areEqual(unknownFields(), returnComparisonRow.unknownFields()) && Intrinsics.areEqual(this.span, returnComparisonRow.span) && Intrinsics.areEqual(this.portfolio_return, returnComparisonRow.portfolio_return) && Intrinsics.areEqual(this.benchmark_return, returnComparisonRow.benchmark_return) && Intrinsics.areEqual(this.learn_more, returnComparisonRow.learn_more);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.span.hashCode()) * 37) + this.portfolio_return.hashCode()) * 37) + this.benchmark_return.hashCode()) * 37;
        String str = this.learn_more;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("span=" + Internal.sanitize(this.span));
        arrayList.add("portfolio_return=" + Internal.sanitize(this.portfolio_return));
        arrayList.add("benchmark_return=" + Internal.sanitize(this.benchmark_return));
        String str = this.learn_more;
        if (str != null) {
            arrayList.add("learn_more=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReturnComparisonRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ReturnComparisonRow copy$default(ReturnComparisonRow returnComparisonRow, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = returnComparisonRow.span;
        }
        if ((i & 2) != 0) {
            str2 = returnComparisonRow.portfolio_return;
        }
        if ((i & 4) != 0) {
            str3 = returnComparisonRow.benchmark_return;
        }
        if ((i & 8) != 0) {
            str4 = returnComparisonRow.learn_more;
        }
        if ((i & 16) != 0) {
            byteString = returnComparisonRow.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return returnComparisonRow.copy(str, str2, str5, str4, byteString2);
    }

    public final ReturnComparisonRow copy(String span, String portfolio_return, String benchmark_return, String learn_more, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(portfolio_return, "portfolio_return");
        Intrinsics.checkNotNullParameter(benchmark_return, "benchmark_return");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ReturnComparisonRow(span, portfolio_return, benchmark_return, learn_more, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReturnComparisonRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReturnComparisonRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.ReturnComparisonRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReturnComparisonRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSpan(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSpan());
                }
                if (!Intrinsics.areEqual(value.getPortfolio_return(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPortfolio_return());
                }
                if (!Intrinsics.areEqual(value.getBenchmark_return(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBenchmark_return());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLearn_more());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReturnComparisonRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSpan(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSpan());
                }
                if (!Intrinsics.areEqual(value.getPortfolio_return(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPortfolio_return());
                }
                if (!Intrinsics.areEqual(value.getBenchmark_return(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBenchmark_return());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLearn_more());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReturnComparisonRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLearn_more());
                if (!Intrinsics.areEqual(value.getBenchmark_return(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getBenchmark_return());
                }
                if (!Intrinsics.areEqual(value.getPortfolio_return(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPortfolio_return());
                }
                if (Intrinsics.areEqual(value.getSpan(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getSpan());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReturnComparisonRow redact(ReturnComparisonRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ReturnComparisonRow.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReturnComparisonRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = null;
                String strDecode4 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ReturnComparisonRow(strDecode, strDecode4, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
