package bonfire.proto.idl.acats.p027v1;

import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
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

/* compiled from: AcatsTransferHubBottomSheetDetails.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JZ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetails;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCta;", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "source_brokerage_icon_url", "destination_brokerage_icon_url", MatchSelectionActivity.TRANSFER_ID_EXTRA, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCta;Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCta;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimary_cta", "()Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCta;", "getSecondary_cta", "getSource_brokerage_icon_url", "getDestination_brokerage_icon_url", "getTransfer_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AcatsTransferHubBottomSheetDetails extends Message {

    @JvmField
    public static final ProtoAdapter<AcatsTransferHubBottomSheetDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "destinationBrokerageIconUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String destination_brokerage_icon_url;

    @WireField(adapter = "bonfire.proto.idl.acats.v1.AcatsTransferHubBottomSheetCta#ADAPTER", jsonName = "primaryCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AcatsTransferHubBottomSheetCta primary_cta;

    @WireField(adapter = "bonfire.proto.idl.acats.v1.AcatsTransferHubBottomSheetCta#ADAPTER", jsonName = "secondaryCta", schemaIndex = 3, tag = 4)
    private final AcatsTransferHubBottomSheetCta secondary_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceBrokerageIconUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String source_brokerage_icon_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String transfer_id;

    public AcatsTransferHubBottomSheetDetails() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ AcatsTransferHubBottomSheetDetails(String str, String str2, AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCta, AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCta2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : acatsTransferHubBottomSheetCta, (i & 8) != 0 ? null : acatsTransferHubBottomSheetCta2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8696newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final AcatsTransferHubBottomSheetCta getPrimary_cta() {
        return this.primary_cta;
    }

    public final AcatsTransferHubBottomSheetCta getSecondary_cta() {
        return this.secondary_cta;
    }

    public final String getSource_brokerage_icon_url() {
        return this.source_brokerage_icon_url;
    }

    public final String getDestination_brokerage_icon_url() {
        return this.destination_brokerage_icon_url;
    }

    public final String getTransfer_id() {
        return this.transfer_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsTransferHubBottomSheetDetails(String title, String subtitle, AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCta, AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCta2, String source_brokerage_icon_url, String destination_brokerage_icon_url, String transfer_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(source_brokerage_icon_url, "source_brokerage_icon_url");
        Intrinsics.checkNotNullParameter(destination_brokerage_icon_url, "destination_brokerage_icon_url");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.primary_cta = acatsTransferHubBottomSheetCta;
        this.secondary_cta = acatsTransferHubBottomSheetCta2;
        this.source_brokerage_icon_url = source_brokerage_icon_url;
        this.destination_brokerage_icon_url = destination_brokerage_icon_url;
        this.transfer_id = transfer_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8696newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AcatsTransferHubBottomSheetDetails)) {
            return false;
        }
        AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails = (AcatsTransferHubBottomSheetDetails) other;
        return Intrinsics.areEqual(unknownFields(), acatsTransferHubBottomSheetDetails.unknownFields()) && Intrinsics.areEqual(this.title, acatsTransferHubBottomSheetDetails.title) && Intrinsics.areEqual(this.subtitle, acatsTransferHubBottomSheetDetails.subtitle) && Intrinsics.areEqual(this.primary_cta, acatsTransferHubBottomSheetDetails.primary_cta) && Intrinsics.areEqual(this.secondary_cta, acatsTransferHubBottomSheetDetails.secondary_cta) && Intrinsics.areEqual(this.source_brokerage_icon_url, acatsTransferHubBottomSheetDetails.source_brokerage_icon_url) && Intrinsics.areEqual(this.destination_brokerage_icon_url, acatsTransferHubBottomSheetDetails.destination_brokerage_icon_url) && Intrinsics.areEqual(this.transfer_id, acatsTransferHubBottomSheetDetails.transfer_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37;
        AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCta = this.primary_cta;
        int iHashCode2 = (iHashCode + (acatsTransferHubBottomSheetCta != null ? acatsTransferHubBottomSheetCta.hashCode() : 0)) * 37;
        AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCta2 = this.secondary_cta;
        int iHashCode3 = ((((((iHashCode2 + (acatsTransferHubBottomSheetCta2 != null ? acatsTransferHubBottomSheetCta2.hashCode() : 0)) * 37) + this.source_brokerage_icon_url.hashCode()) * 37) + this.destination_brokerage_icon_url.hashCode()) * 37) + this.transfer_id.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCta = this.primary_cta;
        if (acatsTransferHubBottomSheetCta != null) {
            arrayList.add("primary_cta=" + acatsTransferHubBottomSheetCta);
        }
        AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCta2 = this.secondary_cta;
        if (acatsTransferHubBottomSheetCta2 != null) {
            arrayList.add("secondary_cta=" + acatsTransferHubBottomSheetCta2);
        }
        arrayList.add("source_brokerage_icon_url=" + Internal.sanitize(this.source_brokerage_icon_url));
        arrayList.add("destination_brokerage_icon_url=" + Internal.sanitize(this.destination_brokerage_icon_url));
        arrayList.add("transfer_id=" + Internal.sanitize(this.transfer_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AcatsTransferHubBottomSheetDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AcatsTransferHubBottomSheetDetails copy$default(AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails, String str, String str2, AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCta, AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCta2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acatsTransferHubBottomSheetDetails.title;
        }
        if ((i & 2) != 0) {
            str2 = acatsTransferHubBottomSheetDetails.subtitle;
        }
        if ((i & 4) != 0) {
            acatsTransferHubBottomSheetCta = acatsTransferHubBottomSheetDetails.primary_cta;
        }
        if ((i & 8) != 0) {
            acatsTransferHubBottomSheetCta2 = acatsTransferHubBottomSheetDetails.secondary_cta;
        }
        if ((i & 16) != 0) {
            str3 = acatsTransferHubBottomSheetDetails.source_brokerage_icon_url;
        }
        if ((i & 32) != 0) {
            str4 = acatsTransferHubBottomSheetDetails.destination_brokerage_icon_url;
        }
        if ((i & 64) != 0) {
            str5 = acatsTransferHubBottomSheetDetails.transfer_id;
        }
        if ((i & 128) != 0) {
            byteString = acatsTransferHubBottomSheetDetails.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str3;
        String str8 = str4;
        return acatsTransferHubBottomSheetDetails.copy(str, str2, acatsTransferHubBottomSheetCta, acatsTransferHubBottomSheetCta2, str7, str8, str6, byteString2);
    }

    public final AcatsTransferHubBottomSheetDetails copy(String title, String subtitle, AcatsTransferHubBottomSheetCta primary_cta, AcatsTransferHubBottomSheetCta secondary_cta, String source_brokerage_icon_url, String destination_brokerage_icon_url, String transfer_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(source_brokerage_icon_url, "source_brokerage_icon_url");
        Intrinsics.checkNotNullParameter(destination_brokerage_icon_url, "destination_brokerage_icon_url");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AcatsTransferHubBottomSheetDetails(title, subtitle, primary_cta, secondary_cta, source_brokerage_icon_url, destination_brokerage_icon_url, transfer_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AcatsTransferHubBottomSheetDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AcatsTransferHubBottomSheetDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.acats.v1.AcatsTransferHubBottomSheetDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AcatsTransferHubBottomSheetDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (value.getPrimary_cta() != null) {
                    size += AcatsTransferHubBottomSheetCta.ADAPTER.encodedSizeWithTag(3, value.getPrimary_cta());
                }
                int iEncodedSizeWithTag = size + AcatsTransferHubBottomSheetCta.ADAPTER.encodedSizeWithTag(4, value.getSecondary_cta());
                if (!Intrinsics.areEqual(value.getSource_brokerage_icon_url(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSource_brokerage_icon_url());
                }
                if (!Intrinsics.areEqual(value.getDestination_brokerage_icon_url(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDestination_brokerage_icon_url());
                }
                return !Intrinsics.areEqual(value.getTransfer_id(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getTransfer_id()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AcatsTransferHubBottomSheetDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (value.getPrimary_cta() != null) {
                    AcatsTransferHubBottomSheetCta.ADAPTER.encodeWithTag(writer, 3, (int) value.getPrimary_cta());
                }
                AcatsTransferHubBottomSheetCta.ADAPTER.encodeWithTag(writer, 4, (int) value.getSecondary_cta());
                if (!Intrinsics.areEqual(value.getSource_brokerage_icon_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSource_brokerage_icon_url());
                }
                if (!Intrinsics.areEqual(value.getDestination_brokerage_icon_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDestination_brokerage_icon_url());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getTransfer_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AcatsTransferHubBottomSheetDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getTransfer_id());
                }
                if (!Intrinsics.areEqual(value.getDestination_brokerage_icon_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDestination_brokerage_icon_url());
                }
                if (!Intrinsics.areEqual(value.getSource_brokerage_icon_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSource_brokerage_icon_url());
                }
                ProtoAdapter<AcatsTransferHubBottomSheetCta> protoAdapter = AcatsTransferHubBottomSheetCta.ADAPTER;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getSecondary_cta());
                if (value.getPrimary_cta() != null) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPrimary_cta());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AcatsTransferHubBottomSheetDetails redact(AcatsTransferHubBottomSheetDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AcatsTransferHubBottomSheetCta primary_cta = value.getPrimary_cta();
                AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCtaRedact = primary_cta != null ? AcatsTransferHubBottomSheetCta.ADAPTER.redact(primary_cta) : null;
                AcatsTransferHubBottomSheetCta secondary_cta = value.getSecondary_cta();
                return AcatsTransferHubBottomSheetDetails.copy$default(value, null, null, acatsTransferHubBottomSheetCtaRedact, secondary_cta != null ? AcatsTransferHubBottomSheetCta.ADAPTER.redact(secondary_cta) : null, null, null, null, ByteString.EMPTY, 115, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AcatsTransferHubBottomSheetDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCtaDecode = null;
                AcatsTransferHubBottomSheetCta acatsTransferHubBottomSheetCtaDecode2 = null;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                acatsTransferHubBottomSheetCtaDecode = AcatsTransferHubBottomSheetCta.ADAPTER.decode(reader);
                                break;
                            case 4:
                                acatsTransferHubBottomSheetCtaDecode2 = AcatsTransferHubBottomSheetCta.ADAPTER.decode(reader);
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
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AcatsTransferHubBottomSheetDetails(strDecode, strDecode5, acatsTransferHubBottomSheetCtaDecode, acatsTransferHubBottomSheetCtaDecode2, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
