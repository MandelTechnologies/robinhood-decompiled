package advisory.proto.p008v1;

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

/* compiled from: GetTaxGainsAndLossesResponse.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BG\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016JF\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006!"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesResponse;", "Lcom/squareup/wire/Message;", "", "account_snapshots", "", "Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshot;", "aggregated_accounts_sections", "Ladvisory/proto/v1/GetTaxGainsAndLossesSection;", "full_screen_data", "Ladvisory/proto/v1/GainsAndLossesFullScreenData;", "year", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Ladvisory/proto/v1/GainsAndLossesFullScreenData;Ljava/lang/String;Lokio/ByteString;)V", "getFull_screen_data", "()Ladvisory/proto/v1/GainsAndLossesFullScreenData;", "getYear", "()Ljava/lang/String;", "getAccount_snapshots", "()Ljava/util/List;", "getAggregated_accounts_sections", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetTaxGainsAndLossesResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetTaxGainsAndLossesResponse> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.GetTaxGainsAndLossesAccountSnapshot#ADAPTER", jsonName = "accountSnapshots", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<GetTaxGainsAndLossesAccountSnapshot> account_snapshots;

    @WireField(adapter = "advisory.proto.v1.GetTaxGainsAndLossesSection#ADAPTER", jsonName = "aggregatedAccountsSections", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<GetTaxGainsAndLossesSection> aggregated_accounts_sections;

    @WireField(adapter = "advisory.proto.v1.GainsAndLossesFullScreenData#ADAPTER", jsonName = "fullScreenData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final GainsAndLossesFullScreenData full_screen_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String year;

    public GetTaxGainsAndLossesResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4484newBuilder();
    }

    public /* synthetic */ GetTaxGainsAndLossesResponse(List list, List list2, GainsAndLossesFullScreenData gainsAndLossesFullScreenData, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : gainsAndLossesFullScreenData, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final GainsAndLossesFullScreenData getFull_screen_data() {
        return this.full_screen_data;
    }

    public final String getYear() {
        return this.year;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTaxGainsAndLossesResponse(List<GetTaxGainsAndLossesAccountSnapshot> account_snapshots, List<GetTaxGainsAndLossesSection> aggregated_accounts_sections, GainsAndLossesFullScreenData gainsAndLossesFullScreenData, String year, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_snapshots, "account_snapshots");
        Intrinsics.checkNotNullParameter(aggregated_accounts_sections, "aggregated_accounts_sections");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.full_screen_data = gainsAndLossesFullScreenData;
        this.year = year;
        this.account_snapshots = Internal.immutableCopyOf("account_snapshots", account_snapshots);
        this.aggregated_accounts_sections = Internal.immutableCopyOf("aggregated_accounts_sections", aggregated_accounts_sections);
    }

    public final List<GetTaxGainsAndLossesAccountSnapshot> getAccount_snapshots() {
        return this.account_snapshots;
    }

    public final List<GetTaxGainsAndLossesSection> getAggregated_accounts_sections() {
        return this.aggregated_accounts_sections;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4484newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTaxGainsAndLossesResponse)) {
            return false;
        }
        GetTaxGainsAndLossesResponse getTaxGainsAndLossesResponse = (GetTaxGainsAndLossesResponse) other;
        return Intrinsics.areEqual(unknownFields(), getTaxGainsAndLossesResponse.unknownFields()) && Intrinsics.areEqual(this.account_snapshots, getTaxGainsAndLossesResponse.account_snapshots) && Intrinsics.areEqual(this.aggregated_accounts_sections, getTaxGainsAndLossesResponse.aggregated_accounts_sections) && Intrinsics.areEqual(this.full_screen_data, getTaxGainsAndLossesResponse.full_screen_data) && Intrinsics.areEqual(this.year, getTaxGainsAndLossesResponse.year);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_snapshots.hashCode()) * 37) + this.aggregated_accounts_sections.hashCode()) * 37;
        GainsAndLossesFullScreenData gainsAndLossesFullScreenData = this.full_screen_data;
        int iHashCode2 = ((iHashCode + (gainsAndLossesFullScreenData != null ? gainsAndLossesFullScreenData.hashCode() : 0)) * 37) + this.year.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.account_snapshots.isEmpty()) {
            arrayList.add("account_snapshots=" + this.account_snapshots);
        }
        if (!this.aggregated_accounts_sections.isEmpty()) {
            arrayList.add("aggregated_accounts_sections=" + this.aggregated_accounts_sections);
        }
        GainsAndLossesFullScreenData gainsAndLossesFullScreenData = this.full_screen_data;
        if (gainsAndLossesFullScreenData != null) {
            arrayList.add("full_screen_data=" + gainsAndLossesFullScreenData);
        }
        arrayList.add("year=" + Internal.sanitize(this.year));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTaxGainsAndLossesResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetTaxGainsAndLossesResponse copy$default(GetTaxGainsAndLossesResponse getTaxGainsAndLossesResponse, List list, List list2, GainsAndLossesFullScreenData gainsAndLossesFullScreenData, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getTaxGainsAndLossesResponse.account_snapshots;
        }
        if ((i & 2) != 0) {
            list2 = getTaxGainsAndLossesResponse.aggregated_accounts_sections;
        }
        if ((i & 4) != 0) {
            gainsAndLossesFullScreenData = getTaxGainsAndLossesResponse.full_screen_data;
        }
        if ((i & 8) != 0) {
            str = getTaxGainsAndLossesResponse.year;
        }
        if ((i & 16) != 0) {
            byteString = getTaxGainsAndLossesResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        GainsAndLossesFullScreenData gainsAndLossesFullScreenData2 = gainsAndLossesFullScreenData;
        return getTaxGainsAndLossesResponse.copy(list, list2, gainsAndLossesFullScreenData2, str, byteString2);
    }

    public final GetTaxGainsAndLossesResponse copy(List<GetTaxGainsAndLossesAccountSnapshot> account_snapshots, List<GetTaxGainsAndLossesSection> aggregated_accounts_sections, GainsAndLossesFullScreenData full_screen_data, String year, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_snapshots, "account_snapshots");
        Intrinsics.checkNotNullParameter(aggregated_accounts_sections, "aggregated_accounts_sections");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTaxGainsAndLossesResponse(account_snapshots, aggregated_accounts_sections, full_screen_data, year, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTaxGainsAndLossesResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTaxGainsAndLossesResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetTaxGainsAndLossesResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTaxGainsAndLossesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + GetTaxGainsAndLossesAccountSnapshot.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getAccount_snapshots()) + GetTaxGainsAndLossesSection.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getAggregated_accounts_sections());
                if (value.getFull_screen_data() != null) {
                    size += GainsAndLossesFullScreenData.ADAPTER.encodedSizeWithTag(3, value.getFull_screen_data());
                }
                return !Intrinsics.areEqual(value.getYear(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getYear()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTaxGainsAndLossesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                GetTaxGainsAndLossesAccountSnapshot.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getAccount_snapshots());
                GetTaxGainsAndLossesSection.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getAggregated_accounts_sections());
                if (value.getFull_screen_data() != null) {
                    GainsAndLossesFullScreenData.ADAPTER.encodeWithTag(writer, 3, (int) value.getFull_screen_data());
                }
                if (!Intrinsics.areEqual(value.getYear(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getYear());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTaxGainsAndLossesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getYear(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getYear());
                }
                if (value.getFull_screen_data() != null) {
                    GainsAndLossesFullScreenData.ADAPTER.encodeWithTag(writer, 3, (int) value.getFull_screen_data());
                }
                GetTaxGainsAndLossesSection.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getAggregated_accounts_sections());
                GetTaxGainsAndLossesAccountSnapshot.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getAccount_snapshots());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxGainsAndLossesResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                GainsAndLossesFullScreenData gainsAndLossesFullScreenDataDecode = null;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTaxGainsAndLossesResponse(arrayList, arrayList2, gainsAndLossesFullScreenDataDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(GetTaxGainsAndLossesAccountSnapshot.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        arrayList2.add(GetTaxGainsAndLossesSection.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        gainsAndLossesFullScreenDataDecode = GainsAndLossesFullScreenData.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxGainsAndLossesResponse redact(GetTaxGainsAndLossesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getAccount_snapshots(), GetTaxGainsAndLossesAccountSnapshot.ADAPTER);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getAggregated_accounts_sections(), GetTaxGainsAndLossesSection.ADAPTER);
                GainsAndLossesFullScreenData full_screen_data = value.getFull_screen_data();
                return GetTaxGainsAndLossesResponse.copy$default(value, listM26823redactElements, listM26823redactElements2, full_screen_data != null ? GainsAndLossesFullScreenData.ADAPTER.redact(full_screen_data) : null, null, ByteString.EMPTY, 8, null);
            }
        };
    }
}
