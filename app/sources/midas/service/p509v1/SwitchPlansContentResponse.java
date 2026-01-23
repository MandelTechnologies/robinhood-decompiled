package midas.service.p509v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: SwitchPlansContentResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lmidas/service/v1/SwitchPlansContentResponse;", "Lcom/squareup/wire/Message;", "", "plan_selection", "Lmidas/service/v1/PlanSelectionPageContent;", "confirmation_page", "Lmidas/service/v1/SwitchPlansConfirmationContent;", "upsell_screen", "Lmidas/service/v1/UpsellScreenContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmidas/service/v1/PlanSelectionPageContent;Lmidas/service/v1/SwitchPlansConfirmationContent;Lmidas/service/v1/UpsellScreenContent;Lokio/ByteString;)V", "getPlan_selection", "()Lmidas/service/v1/PlanSelectionPageContent;", "getConfirmation_page", "()Lmidas/service/v1/SwitchPlansConfirmationContent;", "getUpsell_screen", "()Lmidas/service/v1/UpsellScreenContent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SwitchPlansContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<SwitchPlansContentResponse> ADAPTER;

    @WireField(adapter = "midas.service.v1.SwitchPlansConfirmationContent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SwitchPlansConfirmationContent confirmation_page;

    @WireField(adapter = "midas.service.v1.PlanSelectionPageContent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PlanSelectionPageContent plan_selection;

    @WireField(adapter = "midas.service.v1.UpsellScreenContent#ADAPTER", schemaIndex = 2, tag = 3)
    private final UpsellScreenContent upsell_screen;

    public SwitchPlansContentResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29327newBuilder();
    }

    public final PlanSelectionPageContent getPlan_selection() {
        return this.plan_selection;
    }

    public final SwitchPlansConfirmationContent getConfirmation_page() {
        return this.confirmation_page;
    }

    public final UpsellScreenContent getUpsell_screen() {
        return this.upsell_screen;
    }

    public /* synthetic */ SwitchPlansContentResponse(PlanSelectionPageContent planSelectionPageContent, SwitchPlansConfirmationContent switchPlansConfirmationContent, UpsellScreenContent upsellScreenContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : planSelectionPageContent, (i & 2) != 0 ? null : switchPlansConfirmationContent, (i & 4) != 0 ? null : upsellScreenContent, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchPlansContentResponse(PlanSelectionPageContent planSelectionPageContent, SwitchPlansConfirmationContent switchPlansConfirmationContent, UpsellScreenContent upsellScreenContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.plan_selection = planSelectionPageContent;
        this.confirmation_page = switchPlansConfirmationContent;
        this.upsell_screen = upsellScreenContent;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29327newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SwitchPlansContentResponse)) {
            return false;
        }
        SwitchPlansContentResponse switchPlansContentResponse = (SwitchPlansContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), switchPlansContentResponse.unknownFields()) && Intrinsics.areEqual(this.plan_selection, switchPlansContentResponse.plan_selection) && Intrinsics.areEqual(this.confirmation_page, switchPlansContentResponse.confirmation_page) && Intrinsics.areEqual(this.upsell_screen, switchPlansContentResponse.upsell_screen);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PlanSelectionPageContent planSelectionPageContent = this.plan_selection;
        int iHashCode2 = (iHashCode + (planSelectionPageContent != null ? planSelectionPageContent.hashCode() : 0)) * 37;
        SwitchPlansConfirmationContent switchPlansConfirmationContent = this.confirmation_page;
        int iHashCode3 = (iHashCode2 + (switchPlansConfirmationContent != null ? switchPlansConfirmationContent.hashCode() : 0)) * 37;
        UpsellScreenContent upsellScreenContent = this.upsell_screen;
        int iHashCode4 = iHashCode3 + (upsellScreenContent != null ? upsellScreenContent.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PlanSelectionPageContent planSelectionPageContent = this.plan_selection;
        if (planSelectionPageContent != null) {
            arrayList.add("plan_selection=" + planSelectionPageContent);
        }
        SwitchPlansConfirmationContent switchPlansConfirmationContent = this.confirmation_page;
        if (switchPlansConfirmationContent != null) {
            arrayList.add("confirmation_page=" + switchPlansConfirmationContent);
        }
        UpsellScreenContent upsellScreenContent = this.upsell_screen;
        if (upsellScreenContent != null) {
            arrayList.add("upsell_screen=" + upsellScreenContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SwitchPlansContentResponse{", "}", 0, null, null, 56, null);
    }

    public final SwitchPlansContentResponse copy(PlanSelectionPageContent plan_selection, SwitchPlansConfirmationContent confirmation_page, UpsellScreenContent upsell_screen, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SwitchPlansContentResponse(plan_selection, confirmation_page, upsell_screen, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SwitchPlansContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SwitchPlansContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: midas.service.v1.SwitchPlansContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SwitchPlansContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlan_selection() != null) {
                    size += PlanSelectionPageContent.ADAPTER.encodedSizeWithTag(1, value.getPlan_selection());
                }
                if (value.getConfirmation_page() != null) {
                    size += SwitchPlansConfirmationContent.ADAPTER.encodedSizeWithTag(2, value.getConfirmation_page());
                }
                return size + UpsellScreenContent.ADAPTER.encodedSizeWithTag(3, value.getUpsell_screen());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SwitchPlansContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlan_selection() != null) {
                    PlanSelectionPageContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlan_selection());
                }
                if (value.getConfirmation_page() != null) {
                    SwitchPlansConfirmationContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getConfirmation_page());
                }
                UpsellScreenContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getUpsell_screen());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SwitchPlansContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                UpsellScreenContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getUpsell_screen());
                if (value.getConfirmation_page() != null) {
                    SwitchPlansConfirmationContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getConfirmation_page());
                }
                if (value.getPlan_selection() != null) {
                    PlanSelectionPageContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlan_selection());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SwitchPlansContentResponse redact(SwitchPlansContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PlanSelectionPageContent plan_selection = value.getPlan_selection();
                PlanSelectionPageContent planSelectionPageContentRedact = plan_selection != null ? PlanSelectionPageContent.ADAPTER.redact(plan_selection) : null;
                SwitchPlansConfirmationContent confirmation_page = value.getConfirmation_page();
                SwitchPlansConfirmationContent switchPlansConfirmationContentRedact = confirmation_page != null ? SwitchPlansConfirmationContent.ADAPTER.redact(confirmation_page) : null;
                UpsellScreenContent upsell_screen = value.getUpsell_screen();
                return value.copy(planSelectionPageContentRedact, switchPlansConfirmationContentRedact, upsell_screen != null ? UpsellScreenContent.ADAPTER.redact(upsell_screen) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SwitchPlansContentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                PlanSelectionPageContent planSelectionPageContentDecode = null;
                SwitchPlansConfirmationContent switchPlansConfirmationContentDecode = null;
                UpsellScreenContent upsellScreenContentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SwitchPlansContentResponse(planSelectionPageContentDecode, switchPlansConfirmationContentDecode, upsellScreenContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        planSelectionPageContentDecode = PlanSelectionPageContent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        switchPlansConfirmationContentDecode = SwitchPlansConfirmationContent.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        upsellScreenContentDecode = UpsellScreenContent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
