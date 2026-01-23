package nummus.p512v1;

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
import p479j$.time.Instant;

/* compiled from: CostBasisLot.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u008f\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0095\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010 R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010 R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010 R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b*\u0010 R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b+\u0010 R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b,\u0010 R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b0\u0010 R\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b1\u0010/R\"\u0010\u0011\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b2\u0010)¨\u00064"}, m3636d2 = {"Lnummus/v1/CostBasisLot;", "Lcom/squareup/wire/Message;", "", "", "lot_id", "display_title", "display_subtitle", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "acquisition_date", "quantity", "total_cost_basis_fiat", "status", "", "lot_closed", "additional_info_markdown", "customer_attested", "created_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLj$/time/Instant;Lokio/ByteString;)Lnummus/v1/CostBasisLot;", "Ljava/lang/String;", "getLot_id", "getDisplay_title", "getDisplay_subtitle", "Lj$/time/Instant;", "getAcquisition_date", "()Lj$/time/Instant;", "getQuantity", "getTotal_cost_basis_fiat", "getStatus", "Z", "getLot_closed", "()Z", "getAdditional_info_markdown", "getCustomer_attested", "getCreated_at", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CostBasisLot extends Message {

    @JvmField
    public static final ProtoAdapter<CostBasisLot> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "acquisitionDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant acquisition_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "additionalInfoMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String additional_info_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "customerAttested", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean customer_attested;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displaySubtitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String display_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String display_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "lotClosed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean lot_closed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lotId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String lot_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalCostBasisFiat", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String total_cost_basis_fiat;

    public CostBasisLot() {
        this(null, null, null, null, null, null, null, false, null, false, null, null, 4095, null);
    }

    public /* synthetic */ CostBasisLot(String str, String str2, String str3, Instant instant, String str4, String str5, String str6, boolean z, String str7, boolean z2, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? false : z, (i & 256) == 0 ? str7 : "", (i & 512) == 0 ? z2 : false, (i & 1024) == 0 ? instant2 : null, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29410newBuilder();
    }

    public final String getLot_id() {
        return this.lot_id;
    }

    public final String getDisplay_title() {
        return this.display_title;
    }

    public final String getDisplay_subtitle() {
        return this.display_subtitle;
    }

    public final Instant getAcquisition_date() {
        return this.acquisition_date;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getTotal_cost_basis_fiat() {
        return this.total_cost_basis_fiat;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean getLot_closed() {
        return this.lot_closed;
    }

    public final String getAdditional_info_markdown() {
        return this.additional_info_markdown;
    }

    public final boolean getCustomer_attested() {
        return this.customer_attested;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CostBasisLot(String lot_id, String display_title, String display_subtitle, Instant instant, String quantity, String total_cost_basis_fiat, String status, boolean z, String additional_info_markdown, boolean z2, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(lot_id, "lot_id");
        Intrinsics.checkNotNullParameter(display_title, "display_title");
        Intrinsics.checkNotNullParameter(display_subtitle, "display_subtitle");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(total_cost_basis_fiat, "total_cost_basis_fiat");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(additional_info_markdown, "additional_info_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.lot_id = lot_id;
        this.display_title = display_title;
        this.display_subtitle = display_subtitle;
        this.acquisition_date = instant;
        this.quantity = quantity;
        this.total_cost_basis_fiat = total_cost_basis_fiat;
        this.status = status;
        this.lot_closed = z;
        this.additional_info_markdown = additional_info_markdown;
        this.customer_attested = z2;
        this.created_at = instant2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29410newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CostBasisLot)) {
            return false;
        }
        CostBasisLot costBasisLot = (CostBasisLot) other;
        return Intrinsics.areEqual(unknownFields(), costBasisLot.unknownFields()) && Intrinsics.areEqual(this.lot_id, costBasisLot.lot_id) && Intrinsics.areEqual(this.display_title, costBasisLot.display_title) && Intrinsics.areEqual(this.display_subtitle, costBasisLot.display_subtitle) && Intrinsics.areEqual(this.acquisition_date, costBasisLot.acquisition_date) && Intrinsics.areEqual(this.quantity, costBasisLot.quantity) && Intrinsics.areEqual(this.total_cost_basis_fiat, costBasisLot.total_cost_basis_fiat) && Intrinsics.areEqual(this.status, costBasisLot.status) && this.lot_closed == costBasisLot.lot_closed && Intrinsics.areEqual(this.additional_info_markdown, costBasisLot.additional_info_markdown) && this.customer_attested == costBasisLot.customer_attested && Intrinsics.areEqual(this.created_at, costBasisLot.created_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.lot_id.hashCode()) * 37) + this.display_title.hashCode()) * 37) + this.display_subtitle.hashCode()) * 37;
        Instant instant = this.acquisition_date;
        int iHashCode2 = (((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.quantity.hashCode()) * 37) + this.total_cost_basis_fiat.hashCode()) * 37) + this.status.hashCode()) * 37) + Boolean.hashCode(this.lot_closed)) * 37) + this.additional_info_markdown.hashCode()) * 37) + Boolean.hashCode(this.customer_attested)) * 37;
        Instant instant2 = this.created_at;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("lot_id=" + Internal.sanitize(this.lot_id));
        arrayList.add("display_title=" + Internal.sanitize(this.display_title));
        arrayList.add("display_subtitle=" + Internal.sanitize(this.display_subtitle));
        Instant instant = this.acquisition_date;
        if (instant != null) {
            arrayList.add("acquisition_date=" + instant);
        }
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("total_cost_basis_fiat=" + Internal.sanitize(this.total_cost_basis_fiat));
        arrayList.add("status=" + Internal.sanitize(this.status));
        arrayList.add("lot_closed=" + this.lot_closed);
        arrayList.add("additional_info_markdown=" + Internal.sanitize(this.additional_info_markdown));
        arrayList.add("customer_attested=" + this.customer_attested);
        Instant instant2 = this.created_at;
        if (instant2 != null) {
            arrayList.add("created_at=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CostBasisLot{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CostBasisLot copy$default(CostBasisLot costBasisLot, String str, String str2, String str3, Instant instant, String str4, String str5, String str6, boolean z, String str7, boolean z2, Instant instant2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = costBasisLot.lot_id;
        }
        if ((i & 2) != 0) {
            str2 = costBasisLot.display_title;
        }
        if ((i & 4) != 0) {
            str3 = costBasisLot.display_subtitle;
        }
        if ((i & 8) != 0) {
            instant = costBasisLot.acquisition_date;
        }
        if ((i & 16) != 0) {
            str4 = costBasisLot.quantity;
        }
        if ((i & 32) != 0) {
            str5 = costBasisLot.total_cost_basis_fiat;
        }
        if ((i & 64) != 0) {
            str6 = costBasisLot.status;
        }
        if ((i & 128) != 0) {
            z = costBasisLot.lot_closed;
        }
        if ((i & 256) != 0) {
            str7 = costBasisLot.additional_info_markdown;
        }
        if ((i & 512) != 0) {
            z2 = costBasisLot.customer_attested;
        }
        if ((i & 1024) != 0) {
            instant2 = costBasisLot.created_at;
        }
        if ((i & 2048) != 0) {
            byteString = costBasisLot.unknownFields();
        }
        Instant instant3 = instant2;
        ByteString byteString2 = byteString;
        String str8 = str7;
        boolean z3 = z2;
        String str9 = str6;
        boolean z4 = z;
        String str10 = str4;
        String str11 = str5;
        return costBasisLot.copy(str, str2, str3, instant, str10, str11, str9, z4, str8, z3, instant3, byteString2);
    }

    public final CostBasisLot copy(String lot_id, String display_title, String display_subtitle, Instant acquisition_date, String quantity, String total_cost_basis_fiat, String status, boolean lot_closed, String additional_info_markdown, boolean customer_attested, Instant created_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(lot_id, "lot_id");
        Intrinsics.checkNotNullParameter(display_title, "display_title");
        Intrinsics.checkNotNullParameter(display_subtitle, "display_subtitle");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(total_cost_basis_fiat, "total_cost_basis_fiat");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(additional_info_markdown, "additional_info_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CostBasisLot(lot_id, display_title, display_subtitle, acquisition_date, quantity, total_cost_basis_fiat, status, lot_closed, additional_info_markdown, customer_attested, created_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CostBasisLot.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CostBasisLot>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.CostBasisLot$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CostBasisLot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLot_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLot_id());
                }
                if (!Intrinsics.areEqual(value.getDisplay_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDisplay_title());
                }
                if (!Intrinsics.areEqual(value.getDisplay_subtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDisplay_subtitle());
                }
                if (value.getAcquisition_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getAcquisition_date());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getTotal_cost_basis_fiat(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getTotal_cost_basis_fiat());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getStatus());
                }
                if (value.getLot_closed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getLot_closed()));
                }
                if (!Intrinsics.areEqual(value.getAdditional_info_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getAdditional_info_markdown());
                }
                if (value.getCustomer_attested()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getCustomer_attested()));
                }
                return value.getCreated_at() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getCreated_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CostBasisLot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLot_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLot_id());
                }
                if (!Intrinsics.areEqual(value.getDisplay_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisplay_title());
                }
                if (!Intrinsics.areEqual(value.getDisplay_subtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisplay_subtitle());
                }
                if (value.getAcquisition_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getAcquisition_date());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getTotal_cost_basis_fiat(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTotal_cost_basis_fiat());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getStatus());
                }
                if (value.getLot_closed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getLot_closed()));
                }
                if (!Intrinsics.areEqual(value.getAdditional_info_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getAdditional_info_markdown());
                }
                if (value.getCustomer_attested()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getCustomer_attested()));
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CostBasisLot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                if (value.getCustomer_attested()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getCustomer_attested()));
                }
                if (!Intrinsics.areEqual(value.getAdditional_info_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getAdditional_info_markdown());
                }
                if (value.getLot_closed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getLot_closed()));
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getTotal_cost_basis_fiat(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTotal_cost_basis_fiat());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getQuantity());
                }
                if (value.getAcquisition_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getAcquisition_date());
                }
                if (!Intrinsics.areEqual(value.getDisplay_subtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisplay_subtitle());
                }
                if (!Intrinsics.areEqual(value.getDisplay_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisplay_title());
                }
                if (Intrinsics.areEqual(value.getLot_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLot_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CostBasisLot redact(CostBasisLot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant acquisition_date = value.getAcquisition_date();
                Instant instantRedact = acquisition_date != null ? ProtoAdapter.INSTANT.redact(acquisition_date) : null;
                Instant created_at = value.getCreated_at();
                return CostBasisLot.copy$default(value, null, null, null, instantRedact, null, null, null, false, null, false, created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, ByteString.EMPTY, 1015, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CostBasisLot decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 11:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CostBasisLot(strDecode, strDecode6, strDecode7, instantDecode, strDecode2, strDecode3, strDecode4, zBooleanValue, strDecode5, zBooleanValue2, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
