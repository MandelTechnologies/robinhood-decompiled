package ventures.trailer.proto.p551v1;

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
import rh_server_driven_ui.p531v1.ChartGroup;

/* compiled from: PrivateCompanyFundingSection.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J6\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lventures/trailer/proto/v1/PrivateCompanyFundingSection;", "Lcom/squareup/wire/Message;", "", "title", "", "funding_round_chart", "Lrh_server_driven_ui/v1/ChartGroup;", "funding_rounds", "", "Lventures/trailer/proto/v1/PrivateCompanyFundingRound;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ChartGroup;Ljava/util/List;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getFunding_round_chart", "()Lrh_server_driven_ui/v1/ChartGroup;", "getFunding_rounds", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class PrivateCompanyFundingSection extends Message {

    @JvmField
    public static final ProtoAdapter<PrivateCompanyFundingSection> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartGroup#ADAPTER", jsonName = "fundingRoundChart", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ChartGroup funding_round_chart;

    @WireField(adapter = "ventures.trailer.proto.v1.PrivateCompanyFundingRound#ADAPTER", jsonName = "fundingRounds", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<PrivateCompanyFundingRound> funding_rounds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public PrivateCompanyFundingSection() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30044newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ PrivateCompanyFundingSection(String str, ChartGroup chartGroup, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : chartGroup, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ChartGroup getFunding_round_chart() {
        return this.funding_round_chart;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivateCompanyFundingSection(String title, ChartGroup chartGroup, List<PrivateCompanyFundingRound> funding_rounds, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(funding_rounds, "funding_rounds");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.funding_round_chart = chartGroup;
        this.funding_rounds = Internal.immutableCopyOf("funding_rounds", funding_rounds);
    }

    public final List<PrivateCompanyFundingRound> getFunding_rounds() {
        return this.funding_rounds;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30044newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PrivateCompanyFundingSection)) {
            return false;
        }
        PrivateCompanyFundingSection privateCompanyFundingSection = (PrivateCompanyFundingSection) other;
        return Intrinsics.areEqual(unknownFields(), privateCompanyFundingSection.unknownFields()) && Intrinsics.areEqual(this.title, privateCompanyFundingSection.title) && Intrinsics.areEqual(this.funding_round_chart, privateCompanyFundingSection.funding_round_chart) && Intrinsics.areEqual(this.funding_rounds, privateCompanyFundingSection.funding_rounds);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        ChartGroup chartGroup = this.funding_round_chart;
        int iHashCode2 = ((iHashCode + (chartGroup != null ? chartGroup.hashCode() : 0)) * 37) + this.funding_rounds.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        ChartGroup chartGroup = this.funding_round_chart;
        if (chartGroup != null) {
            arrayList.add("funding_round_chart=" + chartGroup);
        }
        if (!this.funding_rounds.isEmpty()) {
            arrayList.add("funding_rounds=" + this.funding_rounds);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrivateCompanyFundingSection{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivateCompanyFundingSection copy$default(PrivateCompanyFundingSection privateCompanyFundingSection, String str, ChartGroup chartGroup, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = privateCompanyFundingSection.title;
        }
        if ((i & 2) != 0) {
            chartGroup = privateCompanyFundingSection.funding_round_chart;
        }
        if ((i & 4) != 0) {
            list = privateCompanyFundingSection.funding_rounds;
        }
        if ((i & 8) != 0) {
            byteString = privateCompanyFundingSection.unknownFields();
        }
        return privateCompanyFundingSection.copy(str, chartGroup, list, byteString);
    }

    public final PrivateCompanyFundingSection copy(String title, ChartGroup funding_round_chart, List<PrivateCompanyFundingRound> funding_rounds, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(funding_rounds, "funding_rounds");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PrivateCompanyFundingSection(title, funding_round_chart, funding_rounds, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PrivateCompanyFundingSection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PrivateCompanyFundingSection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: ventures.trailer.proto.v1.PrivateCompanyFundingSection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PrivateCompanyFundingSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (value.getFunding_round_chart() != null) {
                    size += ChartGroup.ADAPTER.encodedSizeWithTag(2, value.getFunding_round_chart());
                }
                return size + PrivateCompanyFundingRound.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getFunding_rounds());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PrivateCompanyFundingSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (value.getFunding_round_chart() != null) {
                    ChartGroup.ADAPTER.encodeWithTag(writer, 2, (int) value.getFunding_round_chart());
                }
                PrivateCompanyFundingRound.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getFunding_rounds());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PrivateCompanyFundingSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PrivateCompanyFundingRound.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getFunding_rounds());
                if (value.getFunding_round_chart() != null) {
                    ChartGroup.ADAPTER.encodeWithTag(writer, 2, (int) value.getFunding_round_chart());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PrivateCompanyFundingSection decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ChartGroup chartGroupDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PrivateCompanyFundingSection(strDecode, chartGroupDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        chartGroupDecode = ChartGroup.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(PrivateCompanyFundingRound.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PrivateCompanyFundingSection redact(PrivateCompanyFundingSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ChartGroup funding_round_chart = value.getFunding_round_chart();
                return PrivateCompanyFundingSection.copy$default(value, null, funding_round_chart != null ? ChartGroup.ADAPTER.redact(funding_round_chart) : null, Internal.m26823redactElements(value.getFunding_rounds(), PrivateCompanyFundingRound.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
