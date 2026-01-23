package acats_aggregation.service.p001v1;

import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage;
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
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: PlaidIntroResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00012Bi\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJo\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\"R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001dR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u001dR \u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010$\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b1\u00100¨\u00063"}, m3636d2 = {"Lacats_aggregation/service/v1/PlaidIntroResponse;", "Lcom/squareup/wire/Message;", "", "Lrh_server_driven_ui/v1/UIComponent;", "body_content", "footer_content", "", "plaid_cta_label", "manual_cta_label", "plaid_cta_logging_id", "manual_cta_logging_id", "Lacats_aggregation/service/v1/PlaidIntroSelection;", "plaid_selection", "manual_selection", "Lokio/ByteString;", "unknownFields", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Lrh_server_driven_ui/v1/UIComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lacats_aggregation/service/v1/PlaidIntroSelection;Lacats_aggregation/service/v1/PlaidIntroSelection;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lrh_server_driven_ui/v1/UIComponent;Lrh_server_driven_ui/v1/UIComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lacats_aggregation/service/v1/PlaidIntroSelection;Lacats_aggregation/service/v1/PlaidIntroSelection;Lokio/ByteString;)Lacats_aggregation/service/v1/PlaidIntroResponse;", "Lrh_server_driven_ui/v1/UIComponent;", "getBody_content", "()Lrh_server_driven_ui/v1/UIComponent;", "getFooter_content", "Ljava/lang/String;", "getPlaid_cta_label", "getPlaid_cta_label$annotations", "()V", "getManual_cta_label", "getManual_cta_label$annotations", "getPlaid_cta_logging_id", "getPlaid_cta_logging_id$annotations", "getManual_cta_logging_id", "getManual_cta_logging_id$annotations", "Lacats_aggregation/service/v1/PlaidIntroSelection;", "getPlaid_selection", "()Lacats_aggregation/service/v1/PlaidIntroSelection;", "getManual_selection", "Companion", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class PlaidIntroResponse extends Message {

    @JvmField
    public static final ProtoAdapter<PlaidIntroResponse> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = "bodyContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UIComponent body_content;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = DirectDepositBrokerageExperimentPage.FOOTER_CONTENT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UIComponent footer_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "manualCtaLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String manual_cta_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "manualCtaLoggingId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String manual_cta_logging_id;

    @WireField(adapter = "acats_aggregation.service.v1.PlaidIntroSelection#ADAPTER", jsonName = "manualSelection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final PlaidIntroSelection manual_selection;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "plaidCtaLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String plaid_cta_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "plaidCtaLoggingId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String plaid_cta_logging_id;

    @WireField(adapter = "acats_aggregation.service.v1.PlaidIntroSelection#ADAPTER", jsonName = "plaidSelection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final PlaidIntroSelection plaid_selection;

    public PlaidIntroResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ PlaidIntroResponse(UIComponent uIComponent, UIComponent uIComponent2, String str, String str2, String str3, String str4, PlaidIntroSelection plaidIntroSelection, PlaidIntroSelection plaidIntroSelection2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? null : uIComponent2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : plaidIntroSelection, (i & 128) != 0 ? null : plaidIntroSelection2, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4321newBuilder();
    }

    public final UIComponent getBody_content() {
        return this.body_content;
    }

    public final UIComponent getFooter_content() {
        return this.footer_content;
    }

    public final String getPlaid_cta_label() {
        return this.plaid_cta_label;
    }

    public final String getManual_cta_label() {
        return this.manual_cta_label;
    }

    public final String getPlaid_cta_logging_id() {
        return this.plaid_cta_logging_id;
    }

    public final String getManual_cta_logging_id() {
        return this.manual_cta_logging_id;
    }

    public final PlaidIntroSelection getPlaid_selection() {
        return this.plaid_selection;
    }

    public final PlaidIntroSelection getManual_selection() {
        return this.manual_selection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidIntroResponse(UIComponent uIComponent, UIComponent uIComponent2, String plaid_cta_label, String manual_cta_label, String plaid_cta_logging_id, String manual_cta_logging_id, PlaidIntroSelection plaidIntroSelection, PlaidIntroSelection plaidIntroSelection2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(plaid_cta_label, "plaid_cta_label");
        Intrinsics.checkNotNullParameter(manual_cta_label, "manual_cta_label");
        Intrinsics.checkNotNullParameter(plaid_cta_logging_id, "plaid_cta_logging_id");
        Intrinsics.checkNotNullParameter(manual_cta_logging_id, "manual_cta_logging_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.body_content = uIComponent;
        this.footer_content = uIComponent2;
        this.plaid_cta_label = plaid_cta_label;
        this.manual_cta_label = manual_cta_label;
        this.plaid_cta_logging_id = plaid_cta_logging_id;
        this.manual_cta_logging_id = manual_cta_logging_id;
        this.plaid_selection = plaidIntroSelection;
        this.manual_selection = plaidIntroSelection2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4321newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidIntroResponse)) {
            return false;
        }
        PlaidIntroResponse plaidIntroResponse = (PlaidIntroResponse) other;
        return Intrinsics.areEqual(unknownFields(), plaidIntroResponse.unknownFields()) && Intrinsics.areEqual(this.body_content, plaidIntroResponse.body_content) && Intrinsics.areEqual(this.footer_content, plaidIntroResponse.footer_content) && Intrinsics.areEqual(this.plaid_cta_label, plaidIntroResponse.plaid_cta_label) && Intrinsics.areEqual(this.manual_cta_label, plaidIntroResponse.manual_cta_label) && Intrinsics.areEqual(this.plaid_cta_logging_id, plaidIntroResponse.plaid_cta_logging_id) && Intrinsics.areEqual(this.manual_cta_logging_id, plaidIntroResponse.manual_cta_logging_id) && Intrinsics.areEqual(this.plaid_selection, plaidIntroResponse.plaid_selection) && Intrinsics.areEqual(this.manual_selection, plaidIntroResponse.manual_selection);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UIComponent uIComponent = this.body_content;
        int iHashCode2 = (iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37;
        UIComponent uIComponent2 = this.footer_content;
        int iHashCode3 = (((((((((iHashCode2 + (uIComponent2 != null ? uIComponent2.hashCode() : 0)) * 37) + this.plaid_cta_label.hashCode()) * 37) + this.manual_cta_label.hashCode()) * 37) + this.plaid_cta_logging_id.hashCode()) * 37) + this.manual_cta_logging_id.hashCode()) * 37;
        PlaidIntroSelection plaidIntroSelection = this.plaid_selection;
        int iHashCode4 = (iHashCode3 + (plaidIntroSelection != null ? plaidIntroSelection.hashCode() : 0)) * 37;
        PlaidIntroSelection plaidIntroSelection2 = this.manual_selection;
        int iHashCode5 = iHashCode4 + (plaidIntroSelection2 != null ? plaidIntroSelection2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UIComponent uIComponent = this.body_content;
        if (uIComponent != null) {
            arrayList.add("body_content=" + uIComponent);
        }
        UIComponent uIComponent2 = this.footer_content;
        if (uIComponent2 != null) {
            arrayList.add("footer_content=" + uIComponent2);
        }
        arrayList.add("plaid_cta_label=" + Internal.sanitize(this.plaid_cta_label));
        arrayList.add("manual_cta_label=" + Internal.sanitize(this.manual_cta_label));
        arrayList.add("plaid_cta_logging_id=" + Internal.sanitize(this.plaid_cta_logging_id));
        arrayList.add("manual_cta_logging_id=" + Internal.sanitize(this.manual_cta_logging_id));
        PlaidIntroSelection plaidIntroSelection = this.plaid_selection;
        if (plaidIntroSelection != null) {
            arrayList.add("plaid_selection=" + plaidIntroSelection);
        }
        PlaidIntroSelection plaidIntroSelection2 = this.manual_selection;
        if (plaidIntroSelection2 != null) {
            arrayList.add("manual_selection=" + plaidIntroSelection2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaidIntroResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PlaidIntroResponse copy$default(PlaidIntroResponse plaidIntroResponse, UIComponent uIComponent, UIComponent uIComponent2, String str, String str2, String str3, String str4, PlaidIntroSelection plaidIntroSelection, PlaidIntroSelection plaidIntroSelection2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            uIComponent = plaidIntroResponse.body_content;
        }
        if ((i & 2) != 0) {
            uIComponent2 = plaidIntroResponse.footer_content;
        }
        if ((i & 4) != 0) {
            str = plaidIntroResponse.plaid_cta_label;
        }
        if ((i & 8) != 0) {
            str2 = plaidIntroResponse.manual_cta_label;
        }
        if ((i & 16) != 0) {
            str3 = plaidIntroResponse.plaid_cta_logging_id;
        }
        if ((i & 32) != 0) {
            str4 = plaidIntroResponse.manual_cta_logging_id;
        }
        if ((i & 64) != 0) {
            plaidIntroSelection = plaidIntroResponse.plaid_selection;
        }
        if ((i & 128) != 0) {
            plaidIntroSelection2 = plaidIntroResponse.manual_selection;
        }
        if ((i & 256) != 0) {
            byteString = plaidIntroResponse.unknownFields();
        }
        PlaidIntroSelection plaidIntroSelection3 = plaidIntroSelection2;
        ByteString byteString2 = byteString;
        String str5 = str4;
        PlaidIntroSelection plaidIntroSelection4 = plaidIntroSelection;
        String str6 = str3;
        String str7 = str;
        return plaidIntroResponse.copy(uIComponent, uIComponent2, str7, str2, str6, str5, plaidIntroSelection4, plaidIntroSelection3, byteString2);
    }

    public final PlaidIntroResponse copy(UIComponent body_content, UIComponent footer_content, String plaid_cta_label, String manual_cta_label, String plaid_cta_logging_id, String manual_cta_logging_id, PlaidIntroSelection plaid_selection, PlaidIntroSelection manual_selection, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(plaid_cta_label, "plaid_cta_label");
        Intrinsics.checkNotNullParameter(manual_cta_label, "manual_cta_label");
        Intrinsics.checkNotNullParameter(plaid_cta_logging_id, "plaid_cta_logging_id");
        Intrinsics.checkNotNullParameter(manual_cta_logging_id, "manual_cta_logging_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidIntroResponse(body_content, footer_content, plaid_cta_label, manual_cta_label, plaid_cta_logging_id, manual_cta_logging_id, plaid_selection, manual_selection, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaidIntroResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaidIntroResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: acats_aggregation.service.v1.PlaidIntroResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidIntroResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBody_content() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(1, value.getBody_content());
                }
                if (value.getFooter_content() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(2, value.getFooter_content());
                }
                if (!Intrinsics.areEqual(value.getPlaid_cta_label(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPlaid_cta_label());
                }
                if (!Intrinsics.areEqual(value.getManual_cta_label(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getManual_cta_label());
                }
                if (!Intrinsics.areEqual(value.getPlaid_cta_logging_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getPlaid_cta_logging_id());
                }
                if (!Intrinsics.areEqual(value.getManual_cta_logging_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getManual_cta_logging_id());
                }
                if (value.getPlaid_selection() != null) {
                    size += PlaidIntroSelection.ADAPTER.encodedSizeWithTag(7, value.getPlaid_selection());
                }
                return value.getManual_selection() != null ? size + PlaidIntroSelection.ADAPTER.encodedSizeWithTag(8, value.getManual_selection()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidIntroResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBody_content() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getBody_content());
                }
                if (value.getFooter_content() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getFooter_content());
                }
                if (!Intrinsics.areEqual(value.getPlaid_cta_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPlaid_cta_label());
                }
                if (!Intrinsics.areEqual(value.getManual_cta_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getManual_cta_label());
                }
                if (!Intrinsics.areEqual(value.getPlaid_cta_logging_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPlaid_cta_logging_id());
                }
                if (!Intrinsics.areEqual(value.getManual_cta_logging_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getManual_cta_logging_id());
                }
                if (value.getPlaid_selection() != null) {
                    PlaidIntroSelection.ADAPTER.encodeWithTag(writer, 7, (int) value.getPlaid_selection());
                }
                if (value.getManual_selection() != null) {
                    PlaidIntroSelection.ADAPTER.encodeWithTag(writer, 8, (int) value.getManual_selection());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidIntroResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getManual_selection() != null) {
                    PlaidIntroSelection.ADAPTER.encodeWithTag(writer, 8, (int) value.getManual_selection());
                }
                if (value.getPlaid_selection() != null) {
                    PlaidIntroSelection.ADAPTER.encodeWithTag(writer, 7, (int) value.getPlaid_selection());
                }
                if (!Intrinsics.areEqual(value.getManual_cta_logging_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getManual_cta_logging_id());
                }
                if (!Intrinsics.areEqual(value.getPlaid_cta_logging_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPlaid_cta_logging_id());
                }
                if (!Intrinsics.areEqual(value.getManual_cta_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getManual_cta_label());
                }
                if (!Intrinsics.areEqual(value.getPlaid_cta_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPlaid_cta_label());
                }
                if (value.getFooter_content() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 2, (int) value.getFooter_content());
                }
                if (value.getBody_content() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getBody_content());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidIntroResponse redact(PlaidIntroResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent body_content = value.getBody_content();
                UIComponent uIComponentRedact = body_content != null ? UIComponent.ADAPTER.redact(body_content) : null;
                UIComponent footer_content = value.getFooter_content();
                UIComponent uIComponentRedact2 = footer_content != null ? UIComponent.ADAPTER.redact(footer_content) : null;
                PlaidIntroSelection plaid_selection = value.getPlaid_selection();
                PlaidIntroSelection plaidIntroSelectionRedact = plaid_selection != null ? PlaidIntroSelection.ADAPTER.redact(plaid_selection) : null;
                PlaidIntroSelection manual_selection = value.getManual_selection();
                return PlaidIntroResponse.copy$default(value, uIComponentRedact, uIComponentRedact2, null, null, null, null, plaidIntroSelectionRedact, manual_selection != null ? PlaidIntroSelection.ADAPTER.redact(manual_selection) : null, ByteString.EMPTY, 60, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidIntroResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UIComponent uIComponentDecode = null;
                PlaidIntroSelection plaidIntroSelectionDecode = null;
                PlaidIntroSelection plaidIntroSelectionDecode2 = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                UIComponent uIComponentDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                                break;
                            case 2:
                                uIComponentDecode2 = UIComponent.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                plaidIntroSelectionDecode = PlaidIntroSelection.ADAPTER.decode(reader);
                                break;
                            case 8:
                                plaidIntroSelectionDecode2 = PlaidIntroSelection.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PlaidIntroResponse(uIComponentDecode, uIComponentDecode2, strDecode, strDecode2, strDecode3, strDecode4, plaidIntroSelectionDecode, plaidIntroSelectionDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
