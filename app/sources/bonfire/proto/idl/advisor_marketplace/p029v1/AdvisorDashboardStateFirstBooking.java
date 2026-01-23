package bonfire.proto.idl.advisor_marketplace.p029v1;

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

/* compiled from: AdvisorDashboardStateFirstBooking.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016JH\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006!"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBooking;", "Lcom/squareup/wire/Message;", "", "card", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCard;", "title", "", "description", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCta;", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCard;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCta;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCta;Lokio/ByteString;)V", "getCard", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCard;", "getTitle", "()Ljava/lang/String;", "getDescription", "getPrimary_cta", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCta;", "getSecondary_cta", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorDashboardStateFirstBooking extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorDashboardStateFirstBooking> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardCard#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AdvisorDashboardCard card;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String description;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardCta#ADAPTER", jsonName = "primaryCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AdvisorDashboardCta primary_cta;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardCta#ADAPTER", jsonName = "secondaryCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final AdvisorDashboardCta secondary_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public AdvisorDashboardStateFirstBooking() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ AdvisorDashboardStateFirstBooking(AdvisorDashboardCard advisorDashboardCard, String str, String str2, AdvisorDashboardCta advisorDashboardCta, AdvisorDashboardCta advisorDashboardCta2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advisorDashboardCard, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : advisorDashboardCta, (i & 16) != 0 ? null : advisorDashboardCta2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8750newBuilder();
    }

    public final AdvisorDashboardCard getCard() {
        return this.card;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final AdvisorDashboardCta getPrimary_cta() {
        return this.primary_cta;
    }

    public final AdvisorDashboardCta getSecondary_cta() {
        return this.secondary_cta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorDashboardStateFirstBooking(AdvisorDashboardCard advisorDashboardCard, String title, String description, AdvisorDashboardCta advisorDashboardCta, AdvisorDashboardCta advisorDashboardCta2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.card = advisorDashboardCard;
        this.title = title;
        this.description = description;
        this.primary_cta = advisorDashboardCta;
        this.secondary_cta = advisorDashboardCta2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8750newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorDashboardStateFirstBooking)) {
            return false;
        }
        AdvisorDashboardStateFirstBooking advisorDashboardStateFirstBooking = (AdvisorDashboardStateFirstBooking) other;
        return Intrinsics.areEqual(unknownFields(), advisorDashboardStateFirstBooking.unknownFields()) && Intrinsics.areEqual(this.card, advisorDashboardStateFirstBooking.card) && Intrinsics.areEqual(this.title, advisorDashboardStateFirstBooking.title) && Intrinsics.areEqual(this.description, advisorDashboardStateFirstBooking.description) && Intrinsics.areEqual(this.primary_cta, advisorDashboardStateFirstBooking.primary_cta) && Intrinsics.areEqual(this.secondary_cta, advisorDashboardStateFirstBooking.secondary_cta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AdvisorDashboardCard advisorDashboardCard = this.card;
        int iHashCode2 = (((((iHashCode + (advisorDashboardCard != null ? advisorDashboardCard.hashCode() : 0)) * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37;
        AdvisorDashboardCta advisorDashboardCta = this.primary_cta;
        int iHashCode3 = (iHashCode2 + (advisorDashboardCta != null ? advisorDashboardCta.hashCode() : 0)) * 37;
        AdvisorDashboardCta advisorDashboardCta2 = this.secondary_cta;
        int iHashCode4 = iHashCode3 + (advisorDashboardCta2 != null ? advisorDashboardCta2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AdvisorDashboardCard advisorDashboardCard = this.card;
        if (advisorDashboardCard != null) {
            arrayList.add("card=" + advisorDashboardCard);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        AdvisorDashboardCta advisorDashboardCta = this.primary_cta;
        if (advisorDashboardCta != null) {
            arrayList.add("primary_cta=" + advisorDashboardCta);
        }
        AdvisorDashboardCta advisorDashboardCta2 = this.secondary_cta;
        if (advisorDashboardCta2 != null) {
            arrayList.add("secondary_cta=" + advisorDashboardCta2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorDashboardStateFirstBooking{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisorDashboardStateFirstBooking copy$default(AdvisorDashboardStateFirstBooking advisorDashboardStateFirstBooking, AdvisorDashboardCard advisorDashboardCard, String str, String str2, AdvisorDashboardCta advisorDashboardCta, AdvisorDashboardCta advisorDashboardCta2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            advisorDashboardCard = advisorDashboardStateFirstBooking.card;
        }
        if ((i & 2) != 0) {
            str = advisorDashboardStateFirstBooking.title;
        }
        if ((i & 4) != 0) {
            str2 = advisorDashboardStateFirstBooking.description;
        }
        if ((i & 8) != 0) {
            advisorDashboardCta = advisorDashboardStateFirstBooking.primary_cta;
        }
        if ((i & 16) != 0) {
            advisorDashboardCta2 = advisorDashboardStateFirstBooking.secondary_cta;
        }
        if ((i & 32) != 0) {
            byteString = advisorDashboardStateFirstBooking.unknownFields();
        }
        AdvisorDashboardCta advisorDashboardCta3 = advisorDashboardCta2;
        ByteString byteString2 = byteString;
        return advisorDashboardStateFirstBooking.copy(advisorDashboardCard, str, str2, advisorDashboardCta, advisorDashboardCta3, byteString2);
    }

    public final AdvisorDashboardStateFirstBooking copy(AdvisorDashboardCard card, String title, String description, AdvisorDashboardCta primary_cta, AdvisorDashboardCta secondary_cta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorDashboardStateFirstBooking(card, title, description, primary_cta, secondary_cta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorDashboardStateFirstBooking.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorDashboardStateFirstBooking>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateFirstBooking$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorDashboardStateFirstBooking value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCard() != null) {
                    size += AdvisorDashboardCard.ADAPTER.encodedSizeWithTag(1, value.getCard());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDescription());
                }
                if (value.getPrimary_cta() != null) {
                    size += AdvisorDashboardCta.ADAPTER.encodedSizeWithTag(4, value.getPrimary_cta());
                }
                return value.getSecondary_cta() != null ? size + AdvisorDashboardCta.ADAPTER.encodedSizeWithTag(5, value.getSecondary_cta()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorDashboardStateFirstBooking value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCard() != null) {
                    AdvisorDashboardCard.ADAPTER.encodeWithTag(writer, 1, (int) value.getCard());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (value.getPrimary_cta() != null) {
                    AdvisorDashboardCta.ADAPTER.encodeWithTag(writer, 4, (int) value.getPrimary_cta());
                }
                if (value.getSecondary_cta() != null) {
                    AdvisorDashboardCta.ADAPTER.encodeWithTag(writer, 5, (int) value.getSecondary_cta());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorDashboardStateFirstBooking value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSecondary_cta() != null) {
                    AdvisorDashboardCta.ADAPTER.encodeWithTag(writer, 5, (int) value.getSecondary_cta());
                }
                if (value.getPrimary_cta() != null) {
                    AdvisorDashboardCta.ADAPTER.encodeWithTag(writer, 4, (int) value.getPrimary_cta());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (value.getCard() != null) {
                    AdvisorDashboardCard.ADAPTER.encodeWithTag(writer, 1, (int) value.getCard());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardStateFirstBooking redact(AdvisorDashboardStateFirstBooking value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisorDashboardCard card = value.getCard();
                AdvisorDashboardCard advisorDashboardCardRedact = card != null ? AdvisorDashboardCard.ADAPTER.redact(card) : null;
                AdvisorDashboardCta primary_cta = value.getPrimary_cta();
                AdvisorDashboardCta advisorDashboardCtaRedact = primary_cta != null ? AdvisorDashboardCta.ADAPTER.redact(primary_cta) : null;
                AdvisorDashboardCta secondary_cta = value.getSecondary_cta();
                return AdvisorDashboardStateFirstBooking.copy$default(value, advisorDashboardCardRedact, null, null, advisorDashboardCtaRedact, secondary_cta != null ? AdvisorDashboardCta.ADAPTER.redact(secondary_cta) : null, ByteString.EMPTY, 6, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardStateFirstBooking decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AdvisorDashboardCard advisorDashboardCardDecode = null;
                AdvisorDashboardCta advisorDashboardCtaDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                AdvisorDashboardCta advisorDashboardCtaDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisorDashboardStateFirstBooking(advisorDashboardCardDecode, strDecode, strDecode2, advisorDashboardCtaDecode2, advisorDashboardCtaDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        advisorDashboardCardDecode = AdvisorDashboardCard.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        advisorDashboardCtaDecode2 = AdvisorDashboardCta.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        advisorDashboardCtaDecode = AdvisorDashboardCta.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
