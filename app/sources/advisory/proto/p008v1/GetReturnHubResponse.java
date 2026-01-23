package advisory.proto.p008v1;

import com.plaid.internal.EnumC7081g;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetReturnHubResponse.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016JT\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m3636d2 = {"Ladvisory/proto/v1/GetReturnHubResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "title", "subtitle", "comparison_rows", "", "Ladvisory/proto/v1/ReturnComparisonRow;", "disclosure_markdown", "benchmark_info", "Ladvisory/proto/v1/ReturnHubBenchmarkInfoViewModel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ladvisory/proto/v1/ReturnHubBenchmarkInfoViewModel;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDisclosure_markdown", "getBenchmark_info", "()Ladvisory/proto/v1/ReturnHubBenchmarkInfoViewModel;", "getComparison_rows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetReturnHubResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetReturnHubResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "advisory.proto.v1.ReturnHubBenchmarkInfoViewModel#ADAPTER", jsonName = "benchmarkInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final ReturnHubBenchmarkInfoViewModel benchmark_info;

    @WireField(adapter = "advisory.proto.v1.ReturnComparisonRow#ADAPTER", jsonName = "comparisonRows", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<ReturnComparisonRow> comparison_rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String disclosure_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public GetReturnHubResponse() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ GetReturnHubResponse(String str, String str2, String str3, List list, String str4, ReturnHubBenchmarkInfoViewModel returnHubBenchmarkInfoViewModel, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : returnHubBenchmarkInfoViewModel, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4474newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final ReturnHubBenchmarkInfoViewModel getBenchmark_info() {
        return this.benchmark_info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetReturnHubResponse(String account_number, String title, String subtitle, List<ReturnComparisonRow> comparison_rows, String disclosure_markdown, ReturnHubBenchmarkInfoViewModel returnHubBenchmarkInfoViewModel, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(comparison_rows, "comparison_rows");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.title = title;
        this.subtitle = subtitle;
        this.disclosure_markdown = disclosure_markdown;
        this.benchmark_info = returnHubBenchmarkInfoViewModel;
        this.comparison_rows = Internal.immutableCopyOf("comparison_rows", comparison_rows);
    }

    public final List<ReturnComparisonRow> getComparison_rows() {
        return this.comparison_rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4474newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetReturnHubResponse)) {
            return false;
        }
        GetReturnHubResponse getReturnHubResponse = (GetReturnHubResponse) other;
        return Intrinsics.areEqual(unknownFields(), getReturnHubResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getReturnHubResponse.account_number) && Intrinsics.areEqual(this.title, getReturnHubResponse.title) && Intrinsics.areEqual(this.subtitle, getReturnHubResponse.subtitle) && Intrinsics.areEqual(this.comparison_rows, getReturnHubResponse.comparison_rows) && Intrinsics.areEqual(this.disclosure_markdown, getReturnHubResponse.disclosure_markdown) && Intrinsics.areEqual(this.benchmark_info, getReturnHubResponse.benchmark_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.comparison_rows.hashCode()) * 37) + this.disclosure_markdown.hashCode()) * 37;
        ReturnHubBenchmarkInfoViewModel returnHubBenchmarkInfoViewModel = this.benchmark_info;
        int iHashCode2 = iHashCode + (returnHubBenchmarkInfoViewModel != null ? returnHubBenchmarkInfoViewModel.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        if (!this.comparison_rows.isEmpty()) {
            arrayList.add("comparison_rows=" + this.comparison_rows);
        }
        arrayList.add("disclosure_markdown=" + Internal.sanitize(this.disclosure_markdown));
        ReturnHubBenchmarkInfoViewModel returnHubBenchmarkInfoViewModel = this.benchmark_info;
        if (returnHubBenchmarkInfoViewModel != null) {
            arrayList.add("benchmark_info=" + returnHubBenchmarkInfoViewModel);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetReturnHubResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetReturnHubResponse copy$default(GetReturnHubResponse getReturnHubResponse, String str, String str2, String str3, List list, String str4, ReturnHubBenchmarkInfoViewModel returnHubBenchmarkInfoViewModel, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getReturnHubResponse.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getReturnHubResponse.title;
        }
        if ((i & 4) != 0) {
            str3 = getReturnHubResponse.subtitle;
        }
        if ((i & 8) != 0) {
            list = getReturnHubResponse.comparison_rows;
        }
        if ((i & 16) != 0) {
            str4 = getReturnHubResponse.disclosure_markdown;
        }
        if ((i & 32) != 0) {
            returnHubBenchmarkInfoViewModel = getReturnHubResponse.benchmark_info;
        }
        if ((i & 64) != 0) {
            byteString = getReturnHubResponse.unknownFields();
        }
        ReturnHubBenchmarkInfoViewModel returnHubBenchmarkInfoViewModel2 = returnHubBenchmarkInfoViewModel;
        ByteString byteString2 = byteString;
        String str5 = str4;
        String str6 = str3;
        return getReturnHubResponse.copy(str, str2, str6, list, str5, returnHubBenchmarkInfoViewModel2, byteString2);
    }

    public final GetReturnHubResponse copy(String account_number, String title, String subtitle, List<ReturnComparisonRow> comparison_rows, String disclosure_markdown, ReturnHubBenchmarkInfoViewModel benchmark_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(comparison_rows, "comparison_rows");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetReturnHubResponse(account_number, title, subtitle, comparison_rows, disclosure_markdown, benchmark_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetReturnHubResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetReturnHubResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetReturnHubResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetReturnHubResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSubtitle());
                }
                int iEncodedSizeWithTag = size + ReturnComparisonRow.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getComparison_rows());
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDisclosure_markdown());
                }
                return value.getBenchmark_info() != null ? iEncodedSizeWithTag + ReturnHubBenchmarkInfoViewModel.ADAPTER.encodedSizeWithTag(6, value.getBenchmark_info()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetReturnHubResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                ReturnComparisonRow.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getComparison_rows());
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure_markdown());
                }
                if (value.getBenchmark_info() != null) {
                    ReturnHubBenchmarkInfoViewModel.ADAPTER.encodeWithTag(writer, 6, (int) value.getBenchmark_info());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetReturnHubResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBenchmark_info() != null) {
                    ReturnHubBenchmarkInfoViewModel.ADAPTER.encodeWithTag(writer, 6, (int) value.getBenchmark_info());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure_markdown());
                }
                ReturnComparisonRow.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getComparison_rows());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetReturnHubResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                ReturnHubBenchmarkInfoViewModel returnHubBenchmarkInfoViewModelDecode = null;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                arrayList.add(ReturnComparisonRow.ADAPTER.decode(reader));
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                returnHubBenchmarkInfoViewModelDecode = ReturnHubBenchmarkInfoViewModel.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetReturnHubResponse(strDecode, strDecode4, strDecode2, arrayList, strDecode3, returnHubBenchmarkInfoViewModelDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetReturnHubResponse redact(GetReturnHubResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getComparison_rows(), ReturnComparisonRow.ADAPTER);
                ReturnHubBenchmarkInfoViewModel benchmark_info = value.getBenchmark_info();
                return GetReturnHubResponse.copy$default(value, null, null, null, listM26823redactElements, null, benchmark_info != null ? ReturnHubBenchmarkInfoViewModel.ADAPTER.redact(benchmark_info) : null, ByteString.EMPTY, 23, null);
            }
        };
    }
}
