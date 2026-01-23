package gold_flow.proto.p466v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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

/* compiled from: StreamConfirmationContentResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jp\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006'"}, m3636d2 = {"Lgold_flow/proto/v1/StreamConfirmationContentResponse;", "Lcom/squareup/wire/Message;", "", "asset_path", "", "title", "description", AccountOverviewOptionsSettingCard4.CTA, "Lgold_flow/proto/v1/Cta;", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "alert", "Lgold_flow/proto/v1/GoldConfirmationAlert;", "logging_identifier", "cta_disclosure", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/Cta;Lgold_flow/proto/v1/Cta;Lgold_flow/proto/v1/GoldConfirmationAlert;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAsset_path", "()Ljava/lang/String;", "getTitle", "getDescription", "getCta", "()Lgold_flow/proto/v1/Cta;", "getSecondary_cta", "getAlert", "()Lgold_flow/proto/v1/GoldConfirmationAlert;", "getLogging_identifier", "getCta_disclosure", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamConfirmationContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamConfirmationContentResponse> ADAPTER;

    @WireField(adapter = "gold_flow.proto.v1.GoldConfirmationAlert#ADAPTER", schemaIndex = 5, tag = 6)
    private final GoldConfirmationAlert alert;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetPath", schemaIndex = 0, tag = 1)
    private final String asset_path;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", schemaIndex = 3, tag = 4)
    private final Cta cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaDisclosure", schemaIndex = 7, tag = 8)
    private final String cta_disclosure;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 6, tag = 7)
    private final String logging_identifier;

    @WireField(adapter = "gold_flow.proto.v1.Cta#ADAPTER", jsonName = "secondaryCta", schemaIndex = 4, tag = 5)
    private final Cta secondary_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String title;

    public StreamConfirmationContentResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28189newBuilder();
    }

    public final String getAsset_path() {
        return this.asset_path;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final Cta getSecondary_cta() {
        return this.secondary_cta;
    }

    public final GoldConfirmationAlert getAlert() {
        return this.alert;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final String getCta_disclosure() {
        return this.cta_disclosure;
    }

    public /* synthetic */ StreamConfirmationContentResponse(String str, String str2, String str3, Cta cta, Cta cta2, GoldConfirmationAlert goldConfirmationAlert, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : cta, (i & 16) != 0 ? null : cta2, (i & 32) != 0 ? null : goldConfirmationAlert, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamConfirmationContentResponse(String str, String str2, String str3, Cta cta, Cta cta2, GoldConfirmationAlert goldConfirmationAlert, String str4, String str5, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_path = str;
        this.title = str2;
        this.description = str3;
        this.cta = cta;
        this.secondary_cta = cta2;
        this.alert = goldConfirmationAlert;
        this.logging_identifier = str4;
        this.cta_disclosure = str5;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28189newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamConfirmationContentResponse)) {
            return false;
        }
        StreamConfirmationContentResponse streamConfirmationContentResponse = (StreamConfirmationContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamConfirmationContentResponse.unknownFields()) && Intrinsics.areEqual(this.asset_path, streamConfirmationContentResponse.asset_path) && Intrinsics.areEqual(this.title, streamConfirmationContentResponse.title) && Intrinsics.areEqual(this.description, streamConfirmationContentResponse.description) && Intrinsics.areEqual(this.cta, streamConfirmationContentResponse.cta) && Intrinsics.areEqual(this.secondary_cta, streamConfirmationContentResponse.secondary_cta) && Intrinsics.areEqual(this.alert, streamConfirmationContentResponse.alert) && Intrinsics.areEqual(this.logging_identifier, streamConfirmationContentResponse.logging_identifier) && Intrinsics.areEqual(this.cta_disclosure, streamConfirmationContentResponse.cta_disclosure);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.asset_path;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Cta cta = this.cta;
        int iHashCode5 = (iHashCode4 + (cta != null ? cta.hashCode() : 0)) * 37;
        Cta cta2 = this.secondary_cta;
        int iHashCode6 = (iHashCode5 + (cta2 != null ? cta2.hashCode() : 0)) * 37;
        GoldConfirmationAlert goldConfirmationAlert = this.alert;
        int iHashCode7 = (iHashCode6 + (goldConfirmationAlert != null ? goldConfirmationAlert.hashCode() : 0)) * 37;
        String str4 = this.logging_identifier;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.cta_disclosure;
        int iHashCode9 = iHashCode8 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset_path;
        if (str != null) {
            arrayList.add("asset_path=" + Internal.sanitize(str));
        }
        String str2 = this.title;
        if (str2 != null) {
            arrayList.add("title=" + Internal.sanitize(str2));
        }
        String str3 = this.description;
        if (str3 != null) {
            arrayList.add("description=" + Internal.sanitize(str3));
        }
        Cta cta = this.cta;
        if (cta != null) {
            arrayList.add("cta=" + cta);
        }
        Cta cta2 = this.secondary_cta;
        if (cta2 != null) {
            arrayList.add("secondary_cta=" + cta2);
        }
        GoldConfirmationAlert goldConfirmationAlert = this.alert;
        if (goldConfirmationAlert != null) {
            arrayList.add("alert=" + goldConfirmationAlert);
        }
        String str4 = this.logging_identifier;
        if (str4 != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str4));
        }
        String str5 = this.cta_disclosure;
        if (str5 != null) {
            arrayList.add("cta_disclosure=" + Internal.sanitize(str5));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamConfirmationContentResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamConfirmationContentResponse copy$default(StreamConfirmationContentResponse streamConfirmationContentResponse, String str, String str2, String str3, Cta cta, Cta cta2, GoldConfirmationAlert goldConfirmationAlert, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamConfirmationContentResponse.asset_path;
        }
        if ((i & 2) != 0) {
            str2 = streamConfirmationContentResponse.title;
        }
        if ((i & 4) != 0) {
            str3 = streamConfirmationContentResponse.description;
        }
        if ((i & 8) != 0) {
            cta = streamConfirmationContentResponse.cta;
        }
        if ((i & 16) != 0) {
            cta2 = streamConfirmationContentResponse.secondary_cta;
        }
        if ((i & 32) != 0) {
            goldConfirmationAlert = streamConfirmationContentResponse.alert;
        }
        if ((i & 64) != 0) {
            str4 = streamConfirmationContentResponse.logging_identifier;
        }
        if ((i & 128) != 0) {
            str5 = streamConfirmationContentResponse.cta_disclosure;
        }
        if ((i & 256) != 0) {
            byteString = streamConfirmationContentResponse.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        GoldConfirmationAlert goldConfirmationAlert2 = goldConfirmationAlert;
        String str7 = str4;
        Cta cta3 = cta2;
        String str8 = str3;
        return streamConfirmationContentResponse.copy(str, str2, str8, cta, cta3, goldConfirmationAlert2, str7, str6, byteString2);
    }

    public final StreamConfirmationContentResponse copy(String asset_path, String title, String description, Cta cta, Cta secondary_cta, GoldConfirmationAlert alert, String logging_identifier, String cta_disclosure, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamConfirmationContentResponse(asset_path, title, description, cta, secondary_cta, alert, logging_identifier, cta_disclosure, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamConfirmationContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamConfirmationContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamConfirmationContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamConfirmationContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getAsset_path()) + protoAdapter.encodedSizeWithTag(2, value.getTitle()) + protoAdapter.encodedSizeWithTag(3, value.getDescription());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, value.getCta()) + protoAdapter2.encodedSizeWithTag(5, value.getSecondary_cta()) + GoldConfirmationAlert.ADAPTER.encodedSizeWithTag(6, value.getAlert()) + protoAdapter.encodedSizeWithTag(7, value.getLogging_identifier()) + protoAdapter.encodedSizeWithTag(8, value.getCta_disclosure());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamConfirmationContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAsset_path());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDescription());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getCta());
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getSecondary_cta());
                GoldConfirmationAlert.ADAPTER.encodeWithTag(writer, 6, (int) value.getAlert());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getCta_disclosure());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamConfirmationContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getCta_disclosure());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                GoldConfirmationAlert.ADAPTER.encodeWithTag(writer, 6, (int) value.getAlert());
                ProtoAdapter<Cta> protoAdapter2 = Cta.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getSecondary_cta());
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getCta());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDescription());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAsset_path());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamConfirmationContentResponse redact(StreamConfirmationContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Cta cta = value.getCta();
                Cta ctaRedact = cta != null ? Cta.ADAPTER.redact(cta) : null;
                Cta secondary_cta = value.getSecondary_cta();
                Cta ctaRedact2 = secondary_cta != null ? Cta.ADAPTER.redact(secondary_cta) : null;
                GoldConfirmationAlert alert = value.getAlert();
                return StreamConfirmationContentResponse.copy$default(value, null, null, null, ctaRedact, ctaRedact2, alert != null ? GoldConfirmationAlert.ADAPTER.redact(alert) : null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamConfirmationContentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                Cta ctaDecode = null;
                Cta ctaDecode2 = null;
                GoldConfirmationAlert goldConfirmationAlertDecode = null;
                String strDecode4 = null;
                String strDecode5 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                ctaDecode = Cta.ADAPTER.decode(reader);
                                break;
                            case 5:
                                ctaDecode2 = Cta.ADAPTER.decode(reader);
                                break;
                            case 6:
                                goldConfirmationAlertDecode = GoldConfirmationAlert.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new StreamConfirmationContentResponse(strDecode, strDecode2, strDecode3, ctaDecode, ctaDecode2, goldConfirmationAlertDecode, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
