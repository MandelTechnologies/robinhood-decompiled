package bonfire.proto.idl.advisor_marketplace.p029v1;

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

/* compiled from: GetAdvisorMatchesResponse.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BE\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016JD\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponse;", "Lcom/squareup/wire/Message;", "", "cards", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchCard;", "initial_footer", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCta;", "final_footer", "feedback_form", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackForm;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCta;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCta;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackForm;Lokio/ByteString;)V", "getInitial_footer", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCta;", "getFinal_footer", "getFeedback_form", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackForm;", "getCards", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetAdvisorMatchesResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAdvisorMatchesResponse> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorMatchCard#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<AdvisorMatchCard> cards;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorMatchFeedbackForm#ADAPTER", jsonName = "feedbackForm", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AdvisorMatchFeedbackForm feedback_form;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorMatchFooterCta#ADAPTER", jsonName = "finalFooter", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AdvisorMatchFooterCta final_footer;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorMatchFooterCta#ADAPTER", jsonName = "initialFooter", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AdvisorMatchFooterCta initial_footer;

    public GetAdvisorMatchesResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8779newBuilder();
    }

    public /* synthetic */ GetAdvisorMatchesResponse(List list, AdvisorMatchFooterCta advisorMatchFooterCta, AdvisorMatchFooterCta advisorMatchFooterCta2, AdvisorMatchFeedbackForm advisorMatchFeedbackForm, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : advisorMatchFooterCta, (i & 4) != 0 ? null : advisorMatchFooterCta2, (i & 8) != 0 ? null : advisorMatchFeedbackForm, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AdvisorMatchFooterCta getInitial_footer() {
        return this.initial_footer;
    }

    public final AdvisorMatchFooterCta getFinal_footer() {
        return this.final_footer;
    }

    public final AdvisorMatchFeedbackForm getFeedback_form() {
        return this.feedback_form;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAdvisorMatchesResponse(List<AdvisorMatchCard> cards, AdvisorMatchFooterCta advisorMatchFooterCta, AdvisorMatchFooterCta advisorMatchFooterCta2, AdvisorMatchFeedbackForm advisorMatchFeedbackForm, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.initial_footer = advisorMatchFooterCta;
        this.final_footer = advisorMatchFooterCta2;
        this.feedback_form = advisorMatchFeedbackForm;
        this.cards = Internal.immutableCopyOf("cards", cards);
    }

    public final List<AdvisorMatchCard> getCards() {
        return this.cards;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8779newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAdvisorMatchesResponse)) {
            return false;
        }
        GetAdvisorMatchesResponse getAdvisorMatchesResponse = (GetAdvisorMatchesResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAdvisorMatchesResponse.unknownFields()) && Intrinsics.areEqual(this.cards, getAdvisorMatchesResponse.cards) && Intrinsics.areEqual(this.initial_footer, getAdvisorMatchesResponse.initial_footer) && Intrinsics.areEqual(this.final_footer, getAdvisorMatchesResponse.final_footer) && Intrinsics.areEqual(this.feedback_form, getAdvisorMatchesResponse.feedback_form);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.cards.hashCode()) * 37;
        AdvisorMatchFooterCta advisorMatchFooterCta = this.initial_footer;
        int iHashCode2 = (iHashCode + (advisorMatchFooterCta != null ? advisorMatchFooterCta.hashCode() : 0)) * 37;
        AdvisorMatchFooterCta advisorMatchFooterCta2 = this.final_footer;
        int iHashCode3 = (iHashCode2 + (advisorMatchFooterCta2 != null ? advisorMatchFooterCta2.hashCode() : 0)) * 37;
        AdvisorMatchFeedbackForm advisorMatchFeedbackForm = this.feedback_form;
        int iHashCode4 = iHashCode3 + (advisorMatchFeedbackForm != null ? advisorMatchFeedbackForm.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.cards.isEmpty()) {
            arrayList.add("cards=" + this.cards);
        }
        AdvisorMatchFooterCta advisorMatchFooterCta = this.initial_footer;
        if (advisorMatchFooterCta != null) {
            arrayList.add("initial_footer=" + advisorMatchFooterCta);
        }
        AdvisorMatchFooterCta advisorMatchFooterCta2 = this.final_footer;
        if (advisorMatchFooterCta2 != null) {
            arrayList.add("final_footer=" + advisorMatchFooterCta2);
        }
        AdvisorMatchFeedbackForm advisorMatchFeedbackForm = this.feedback_form;
        if (advisorMatchFeedbackForm != null) {
            arrayList.add("feedback_form=" + advisorMatchFeedbackForm);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAdvisorMatchesResponse{", "}", 0, null, null, 56, null);
    }

    public final GetAdvisorMatchesResponse copy(List<AdvisorMatchCard> cards, AdvisorMatchFooterCta initial_footer, AdvisorMatchFooterCta final_footer, AdvisorMatchFeedbackForm feedback_form, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAdvisorMatchesResponse(cards, initial_footer, final_footer, feedback_form, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAdvisorMatchesResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAdvisorMatchesResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.GetAdvisorMatchesResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAdvisorMatchesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + AdvisorMatchCard.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getCards());
                if (value.getInitial_footer() != null) {
                    size += AdvisorMatchFooterCta.ADAPTER.encodedSizeWithTag(2, value.getInitial_footer());
                }
                if (value.getFinal_footer() != null) {
                    size += AdvisorMatchFooterCta.ADAPTER.encodedSizeWithTag(3, value.getFinal_footer());
                }
                return value.getFeedback_form() != null ? size + AdvisorMatchFeedbackForm.ADAPTER.encodedSizeWithTag(4, value.getFeedback_form()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAdvisorMatchesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisorMatchCard.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getCards());
                if (value.getInitial_footer() != null) {
                    AdvisorMatchFooterCta.ADAPTER.encodeWithTag(writer, 2, (int) value.getInitial_footer());
                }
                if (value.getFinal_footer() != null) {
                    AdvisorMatchFooterCta.ADAPTER.encodeWithTag(writer, 3, (int) value.getFinal_footer());
                }
                if (value.getFeedback_form() != null) {
                    AdvisorMatchFeedbackForm.ADAPTER.encodeWithTag(writer, 4, (int) value.getFeedback_form());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAdvisorMatchesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFeedback_form() != null) {
                    AdvisorMatchFeedbackForm.ADAPTER.encodeWithTag(writer, 4, (int) value.getFeedback_form());
                }
                if (value.getFinal_footer() != null) {
                    AdvisorMatchFooterCta.ADAPTER.encodeWithTag(writer, 3, (int) value.getFinal_footer());
                }
                if (value.getInitial_footer() != null) {
                    AdvisorMatchFooterCta.ADAPTER.encodeWithTag(writer, 2, (int) value.getInitial_footer());
                }
                AdvisorMatchCard.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getCards());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAdvisorMatchesResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                AdvisorMatchFooterCta advisorMatchFooterCtaDecode = null;
                AdvisorMatchFooterCta advisorMatchFooterCtaDecode2 = null;
                AdvisorMatchFeedbackForm advisorMatchFeedbackFormDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAdvisorMatchesResponse(arrayList, advisorMatchFooterCtaDecode, advisorMatchFooterCtaDecode2, advisorMatchFeedbackFormDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(AdvisorMatchCard.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        advisorMatchFooterCtaDecode = AdvisorMatchFooterCta.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        advisorMatchFooterCtaDecode2 = AdvisorMatchFooterCta.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        advisorMatchFeedbackFormDecode = AdvisorMatchFeedbackForm.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAdvisorMatchesResponse redact(GetAdvisorMatchesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<AdvisorMatchCard> listM26823redactElements = Internal.m26823redactElements(value.getCards(), AdvisorMatchCard.ADAPTER);
                AdvisorMatchFooterCta initial_footer = value.getInitial_footer();
                AdvisorMatchFooterCta advisorMatchFooterCtaRedact = initial_footer != null ? AdvisorMatchFooterCta.ADAPTER.redact(initial_footer) : null;
                AdvisorMatchFooterCta final_footer = value.getFinal_footer();
                AdvisorMatchFooterCta advisorMatchFooterCtaRedact2 = final_footer != null ? AdvisorMatchFooterCta.ADAPTER.redact(final_footer) : null;
                AdvisorMatchFeedbackForm feedback_form = value.getFeedback_form();
                return value.copy(listM26823redactElements, advisorMatchFooterCtaRedact, advisorMatchFooterCtaRedact2, feedback_form != null ? AdvisorMatchFeedbackForm.ADAPTER.redact(feedback_form) : null, ByteString.EMPTY);
            }
        };
    }
}
