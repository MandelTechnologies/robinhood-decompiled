package bonfire.proto.idl.advisor_marketplace.p029v1;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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

/* compiled from: AdvisorDashboardStatePostBooking.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBA\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016J@\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBooking;", "Lcom/squareup/wire/Message;", "", "cards", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardMiniCard;", "title", "", "description", AccountOverviewOptionsSettingCard4.CTA, "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCta;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCta;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getCta", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCta;", "getCards", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorDashboardStatePostBooking extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorDashboardStatePostBooking> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardMiniCard#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<AdvisorDashboardMiniCard> cards;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardCta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AdvisorDashboardCta cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public AdvisorDashboardStatePostBooking() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8752newBuilder();
    }

    public /* synthetic */ AdvisorDashboardStatePostBooking(List list, String str, String str2, AdvisorDashboardCta advisorDashboardCta, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : advisorDashboardCta, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final AdvisorDashboardCta getCta() {
        return this.cta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorDashboardStatePostBooking(List<AdvisorDashboardMiniCard> cards, String title, String description, AdvisorDashboardCta advisorDashboardCta, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.cta = advisorDashboardCta;
        this.cards = Internal.immutableCopyOf("cards", cards);
    }

    public final List<AdvisorDashboardMiniCard> getCards() {
        return this.cards;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8752newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorDashboardStatePostBooking)) {
            return false;
        }
        AdvisorDashboardStatePostBooking advisorDashboardStatePostBooking = (AdvisorDashboardStatePostBooking) other;
        return Intrinsics.areEqual(unknownFields(), advisorDashboardStatePostBooking.unknownFields()) && Intrinsics.areEqual(this.cards, advisorDashboardStatePostBooking.cards) && Intrinsics.areEqual(this.title, advisorDashboardStatePostBooking.title) && Intrinsics.areEqual(this.description, advisorDashboardStatePostBooking.description) && Intrinsics.areEqual(this.cta, advisorDashboardStatePostBooking.cta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.cards.hashCode()) * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37;
        AdvisorDashboardCta advisorDashboardCta = this.cta;
        int iHashCode2 = iHashCode + (advisorDashboardCta != null ? advisorDashboardCta.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.cards.isEmpty()) {
            arrayList.add("cards=" + this.cards);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        AdvisorDashboardCta advisorDashboardCta = this.cta;
        if (advisorDashboardCta != null) {
            arrayList.add("cta=" + advisorDashboardCta);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorDashboardStatePostBooking{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisorDashboardStatePostBooking copy$default(AdvisorDashboardStatePostBooking advisorDashboardStatePostBooking, List list, String str, String str2, AdvisorDashboardCta advisorDashboardCta, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = advisorDashboardStatePostBooking.cards;
        }
        if ((i & 2) != 0) {
            str = advisorDashboardStatePostBooking.title;
        }
        if ((i & 4) != 0) {
            str2 = advisorDashboardStatePostBooking.description;
        }
        if ((i & 8) != 0) {
            advisorDashboardCta = advisorDashboardStatePostBooking.cta;
        }
        if ((i & 16) != 0) {
            byteString = advisorDashboardStatePostBooking.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return advisorDashboardStatePostBooking.copy(list, str, str3, advisorDashboardCta, byteString2);
    }

    public final AdvisorDashboardStatePostBooking copy(List<AdvisorDashboardMiniCard> cards, String title, String description, AdvisorDashboardCta cta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorDashboardStatePostBooking(cards, title, description, cta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorDashboardStatePostBooking.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorDashboardStatePostBooking>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStatePostBooking$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorDashboardStatePostBooking value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + AdvisorDashboardMiniCard.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getCards());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDescription());
                }
                return value.getCta() != null ? size + AdvisorDashboardCta.ADAPTER.encodedSizeWithTag(4, value.getCta()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorDashboardStatePostBooking value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisorDashboardMiniCard.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getCards());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (value.getCta() != null) {
                    AdvisorDashboardCta.ADAPTER.encodeWithTag(writer, 4, (int) value.getCta());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorDashboardStatePostBooking value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCta() != null) {
                    AdvisorDashboardCta.ADAPTER.encodeWithTag(writer, 4, (int) value.getCta());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                AdvisorDashboardMiniCard.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getCards());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardStatePostBooking decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AdvisorDashboardCta advisorDashboardCtaDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisorDashboardStatePostBooking(arrayList, strDecode, strDecode2, advisorDashboardCtaDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(AdvisorDashboardMiniCard.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        advisorDashboardCtaDecode = AdvisorDashboardCta.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardStatePostBooking redact(AdvisorDashboardStatePostBooking value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getCards(), AdvisorDashboardMiniCard.ADAPTER);
                AdvisorDashboardCta cta = value.getCta();
                return AdvisorDashboardStatePostBooking.copy$default(value, listM26823redactElements, null, null, cta != null ? AdvisorDashboardCta.ADAPTER.redact(cta) : null, ByteString.EMPTY, 6, null);
            }
        };
    }
}
