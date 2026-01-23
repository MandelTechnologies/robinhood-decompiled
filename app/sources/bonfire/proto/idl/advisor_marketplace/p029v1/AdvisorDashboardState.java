package bonfire.proto.idl.advisor_marketplace.p029v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: AdvisorDashboardState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016JX\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardState;", "Lcom/squareup/wire/Message;", "", "not_enrolled", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolled;", "enrolled_no_booking", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBooking;", "first_booking", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBooking;", "post_booking", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBooking;", "relationship_initiated", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiated;", "relationship_active", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActive;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolled;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBooking;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBooking;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBooking;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiated;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActive;Lokio/ByteString;)V", "getNot_enrolled", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolled;", "getEnrolled_no_booking", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBooking;", "getFirst_booking", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBooking;", "getPost_booking", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBooking;", "getRelationship_initiated", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiated;", "getRelationship_active", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActive;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorDashboardState extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorDashboardState> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateEnrolledNoBooking#ADAPTER", jsonName = "enrolledNoBooking", oneofName = "state", schemaIndex = 1, tag = 2)
    private final AdvisorDashboardStateEnrolledNoBooking enrolled_no_booking;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateFirstBooking#ADAPTER", jsonName = "firstBooking", oneofName = "state", schemaIndex = 2, tag = 3)
    private final AdvisorDashboardStateFirstBooking first_booking;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateNotEnrolled#ADAPTER", jsonName = "notEnrolled", oneofName = "state", schemaIndex = 0, tag = 1)
    private final AdvisorDashboardStateNotEnrolled not_enrolled;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStatePostBooking#ADAPTER", jsonName = "postBooking", oneofName = "state", schemaIndex = 3, tag = 4)
    private final AdvisorDashboardStatePostBooking post_booking;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateRelationshipActive#ADAPTER", jsonName = "relationshipActive", oneofName = "state", schemaIndex = 5, tag = 6)
    private final AdvisorDashboardStateRelationshipActive relationship_active;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateRelationshipInitiated#ADAPTER", jsonName = "relationshipInitiated", oneofName = "state", schemaIndex = 4, tag = 5)
    private final AdvisorDashboardStateRelationshipInitiated relationship_initiated;

    public AdvisorDashboardState() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8747newBuilder();
    }

    public final AdvisorDashboardStateNotEnrolled getNot_enrolled() {
        return this.not_enrolled;
    }

    public final AdvisorDashboardStateEnrolledNoBooking getEnrolled_no_booking() {
        return this.enrolled_no_booking;
    }

    public final AdvisorDashboardStateFirstBooking getFirst_booking() {
        return this.first_booking;
    }

    public final AdvisorDashboardStatePostBooking getPost_booking() {
        return this.post_booking;
    }

    public final AdvisorDashboardStateRelationshipInitiated getRelationship_initiated() {
        return this.relationship_initiated;
    }

    public final AdvisorDashboardStateRelationshipActive getRelationship_active() {
        return this.relationship_active;
    }

    public /* synthetic */ AdvisorDashboardState(AdvisorDashboardStateNotEnrolled advisorDashboardStateNotEnrolled, AdvisorDashboardStateEnrolledNoBooking advisorDashboardStateEnrolledNoBooking, AdvisorDashboardStateFirstBooking advisorDashboardStateFirstBooking, AdvisorDashboardStatePostBooking advisorDashboardStatePostBooking, AdvisorDashboardStateRelationshipInitiated advisorDashboardStateRelationshipInitiated, AdvisorDashboardStateRelationshipActive advisorDashboardStateRelationshipActive, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advisorDashboardStateNotEnrolled, (i & 2) != 0 ? null : advisorDashboardStateEnrolledNoBooking, (i & 4) != 0 ? null : advisorDashboardStateFirstBooking, (i & 8) != 0 ? null : advisorDashboardStatePostBooking, (i & 16) != 0 ? null : advisorDashboardStateRelationshipInitiated, (i & 32) != 0 ? null : advisorDashboardStateRelationshipActive, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorDashboardState(AdvisorDashboardStateNotEnrolled advisorDashboardStateNotEnrolled, AdvisorDashboardStateEnrolledNoBooking advisorDashboardStateEnrolledNoBooking, AdvisorDashboardStateFirstBooking advisorDashboardStateFirstBooking, AdvisorDashboardStatePostBooking advisorDashboardStatePostBooking, AdvisorDashboardStateRelationshipInitiated advisorDashboardStateRelationshipInitiated, AdvisorDashboardStateRelationshipActive advisorDashboardStateRelationshipActive, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.not_enrolled = advisorDashboardStateNotEnrolled;
        this.enrolled_no_booking = advisorDashboardStateEnrolledNoBooking;
        this.first_booking = advisorDashboardStateFirstBooking;
        this.post_booking = advisorDashboardStatePostBooking;
        this.relationship_initiated = advisorDashboardStateRelationshipInitiated;
        this.relationship_active = advisorDashboardStateRelationshipActive;
        if (Internal.countNonNull(advisorDashboardStateNotEnrolled, advisorDashboardStateEnrolledNoBooking, advisorDashboardStateFirstBooking, advisorDashboardStatePostBooking, advisorDashboardStateRelationshipInitiated, advisorDashboardStateRelationshipActive) > 1) {
            throw new IllegalArgumentException("At most one of not_enrolled, enrolled_no_booking, first_booking, post_booking, relationship_initiated, relationship_active may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8747newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorDashboardState)) {
            return false;
        }
        AdvisorDashboardState advisorDashboardState = (AdvisorDashboardState) other;
        return Intrinsics.areEqual(unknownFields(), advisorDashboardState.unknownFields()) && Intrinsics.areEqual(this.not_enrolled, advisorDashboardState.not_enrolled) && Intrinsics.areEqual(this.enrolled_no_booking, advisorDashboardState.enrolled_no_booking) && Intrinsics.areEqual(this.first_booking, advisorDashboardState.first_booking) && Intrinsics.areEqual(this.post_booking, advisorDashboardState.post_booking) && Intrinsics.areEqual(this.relationship_initiated, advisorDashboardState.relationship_initiated) && Intrinsics.areEqual(this.relationship_active, advisorDashboardState.relationship_active);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AdvisorDashboardStateNotEnrolled advisorDashboardStateNotEnrolled = this.not_enrolled;
        int iHashCode2 = (iHashCode + (advisorDashboardStateNotEnrolled != null ? advisorDashboardStateNotEnrolled.hashCode() : 0)) * 37;
        AdvisorDashboardStateEnrolledNoBooking advisorDashboardStateEnrolledNoBooking = this.enrolled_no_booking;
        int iHashCode3 = (iHashCode2 + (advisorDashboardStateEnrolledNoBooking != null ? advisorDashboardStateEnrolledNoBooking.hashCode() : 0)) * 37;
        AdvisorDashboardStateFirstBooking advisorDashboardStateFirstBooking = this.first_booking;
        int iHashCode4 = (iHashCode3 + (advisorDashboardStateFirstBooking != null ? advisorDashboardStateFirstBooking.hashCode() : 0)) * 37;
        AdvisorDashboardStatePostBooking advisorDashboardStatePostBooking = this.post_booking;
        int iHashCode5 = (iHashCode4 + (advisorDashboardStatePostBooking != null ? advisorDashboardStatePostBooking.hashCode() : 0)) * 37;
        AdvisorDashboardStateRelationshipInitiated advisorDashboardStateRelationshipInitiated = this.relationship_initiated;
        int iHashCode6 = (iHashCode5 + (advisorDashboardStateRelationshipInitiated != null ? advisorDashboardStateRelationshipInitiated.hashCode() : 0)) * 37;
        AdvisorDashboardStateRelationshipActive advisorDashboardStateRelationshipActive = this.relationship_active;
        int iHashCode7 = iHashCode6 + (advisorDashboardStateRelationshipActive != null ? advisorDashboardStateRelationshipActive.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AdvisorDashboardStateNotEnrolled advisorDashboardStateNotEnrolled = this.not_enrolled;
        if (advisorDashboardStateNotEnrolled != null) {
            arrayList.add("not_enrolled=" + advisorDashboardStateNotEnrolled);
        }
        AdvisorDashboardStateEnrolledNoBooking advisorDashboardStateEnrolledNoBooking = this.enrolled_no_booking;
        if (advisorDashboardStateEnrolledNoBooking != null) {
            arrayList.add("enrolled_no_booking=" + advisorDashboardStateEnrolledNoBooking);
        }
        AdvisorDashboardStateFirstBooking advisorDashboardStateFirstBooking = this.first_booking;
        if (advisorDashboardStateFirstBooking != null) {
            arrayList.add("first_booking=" + advisorDashboardStateFirstBooking);
        }
        AdvisorDashboardStatePostBooking advisorDashboardStatePostBooking = this.post_booking;
        if (advisorDashboardStatePostBooking != null) {
            arrayList.add("post_booking=" + advisorDashboardStatePostBooking);
        }
        AdvisorDashboardStateRelationshipInitiated advisorDashboardStateRelationshipInitiated = this.relationship_initiated;
        if (advisorDashboardStateRelationshipInitiated != null) {
            arrayList.add("relationship_initiated=" + advisorDashboardStateRelationshipInitiated);
        }
        AdvisorDashboardStateRelationshipActive advisorDashboardStateRelationshipActive = this.relationship_active;
        if (advisorDashboardStateRelationshipActive != null) {
            arrayList.add("relationship_active=" + advisorDashboardStateRelationshipActive);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorDashboardState{", "}", 0, null, null, 56, null);
    }

    public final AdvisorDashboardState copy(AdvisorDashboardStateNotEnrolled not_enrolled, AdvisorDashboardStateEnrolledNoBooking enrolled_no_booking, AdvisorDashboardStateFirstBooking first_booking, AdvisorDashboardStatePostBooking post_booking, AdvisorDashboardStateRelationshipInitiated relationship_initiated, AdvisorDashboardStateRelationshipActive relationship_active, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorDashboardState(not_enrolled, enrolled_no_booking, first_booking, post_booking, relationship_initiated, relationship_active, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorDashboardState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorDashboardState>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardState$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorDashboardState value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + AdvisorDashboardStateNotEnrolled.ADAPTER.encodedSizeWithTag(1, value.getNot_enrolled()) + AdvisorDashboardStateEnrolledNoBooking.ADAPTER.encodedSizeWithTag(2, value.getEnrolled_no_booking()) + AdvisorDashboardStateFirstBooking.ADAPTER.encodedSizeWithTag(3, value.getFirst_booking()) + AdvisorDashboardStatePostBooking.ADAPTER.encodedSizeWithTag(4, value.getPost_booking()) + AdvisorDashboardStateRelationshipInitiated.ADAPTER.encodedSizeWithTag(5, value.getRelationship_initiated()) + AdvisorDashboardStateRelationshipActive.ADAPTER.encodedSizeWithTag(6, value.getRelationship_active());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorDashboardState value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisorDashboardStateNotEnrolled.ADAPTER.encodeWithTag(writer, 1, (int) value.getNot_enrolled());
                AdvisorDashboardStateEnrolledNoBooking.ADAPTER.encodeWithTag(writer, 2, (int) value.getEnrolled_no_booking());
                AdvisorDashboardStateFirstBooking.ADAPTER.encodeWithTag(writer, 3, (int) value.getFirst_booking());
                AdvisorDashboardStatePostBooking.ADAPTER.encodeWithTag(writer, 4, (int) value.getPost_booking());
                AdvisorDashboardStateRelationshipInitiated.ADAPTER.encodeWithTag(writer, 5, (int) value.getRelationship_initiated());
                AdvisorDashboardStateRelationshipActive.ADAPTER.encodeWithTag(writer, 6, (int) value.getRelationship_active());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorDashboardState value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AdvisorDashboardStateRelationshipActive.ADAPTER.encodeWithTag(writer, 6, (int) value.getRelationship_active());
                AdvisorDashboardStateRelationshipInitiated.ADAPTER.encodeWithTag(writer, 5, (int) value.getRelationship_initiated());
                AdvisorDashboardStatePostBooking.ADAPTER.encodeWithTag(writer, 4, (int) value.getPost_booking());
                AdvisorDashboardStateFirstBooking.ADAPTER.encodeWithTag(writer, 3, (int) value.getFirst_booking());
                AdvisorDashboardStateEnrolledNoBooking.ADAPTER.encodeWithTag(writer, 2, (int) value.getEnrolled_no_booking());
                AdvisorDashboardStateNotEnrolled.ADAPTER.encodeWithTag(writer, 1, (int) value.getNot_enrolled());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardState redact(AdvisorDashboardState value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisorDashboardStateNotEnrolled not_enrolled = value.getNot_enrolled();
                AdvisorDashboardStateNotEnrolled advisorDashboardStateNotEnrolledRedact = not_enrolled != null ? AdvisorDashboardStateNotEnrolled.ADAPTER.redact(not_enrolled) : null;
                AdvisorDashboardStateEnrolledNoBooking enrolled_no_booking = value.getEnrolled_no_booking();
                AdvisorDashboardStateEnrolledNoBooking advisorDashboardStateEnrolledNoBookingRedact = enrolled_no_booking != null ? AdvisorDashboardStateEnrolledNoBooking.ADAPTER.redact(enrolled_no_booking) : null;
                AdvisorDashboardStateFirstBooking first_booking = value.getFirst_booking();
                AdvisorDashboardStateFirstBooking advisorDashboardStateFirstBookingRedact = first_booking != null ? AdvisorDashboardStateFirstBooking.ADAPTER.redact(first_booking) : null;
                AdvisorDashboardStatePostBooking post_booking = value.getPost_booking();
                AdvisorDashboardStatePostBooking advisorDashboardStatePostBookingRedact = post_booking != null ? AdvisorDashboardStatePostBooking.ADAPTER.redact(post_booking) : null;
                AdvisorDashboardStateRelationshipInitiated relationship_initiated = value.getRelationship_initiated();
                AdvisorDashboardStateRelationshipInitiated advisorDashboardStateRelationshipInitiatedRedact = relationship_initiated != null ? AdvisorDashboardStateRelationshipInitiated.ADAPTER.redact(relationship_initiated) : null;
                AdvisorDashboardStateRelationshipActive relationship_active = value.getRelationship_active();
                return value.copy(advisorDashboardStateNotEnrolledRedact, advisorDashboardStateEnrolledNoBookingRedact, advisorDashboardStateFirstBookingRedact, advisorDashboardStatePostBookingRedact, advisorDashboardStateRelationshipInitiatedRedact, relationship_active != null ? AdvisorDashboardStateRelationshipActive.ADAPTER.redact(relationship_active) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDashboardState decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AdvisorDashboardStateNotEnrolled advisorDashboardStateNotEnrolledDecode = null;
                AdvisorDashboardStateEnrolledNoBooking advisorDashboardStateEnrolledNoBookingDecode = null;
                AdvisorDashboardStateFirstBooking advisorDashboardStateFirstBookingDecode = null;
                AdvisorDashboardStatePostBooking advisorDashboardStatePostBookingDecode = null;
                AdvisorDashboardStateRelationshipInitiated advisorDashboardStateRelationshipInitiatedDecode = null;
                AdvisorDashboardStateRelationshipActive advisorDashboardStateRelationshipActiveDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                advisorDashboardStateNotEnrolledDecode = AdvisorDashboardStateNotEnrolled.ADAPTER.decode(reader);
                                break;
                            case 2:
                                advisorDashboardStateEnrolledNoBookingDecode = AdvisorDashboardStateEnrolledNoBooking.ADAPTER.decode(reader);
                                break;
                            case 3:
                                advisorDashboardStateFirstBookingDecode = AdvisorDashboardStateFirstBooking.ADAPTER.decode(reader);
                                break;
                            case 4:
                                advisorDashboardStatePostBookingDecode = AdvisorDashboardStatePostBooking.ADAPTER.decode(reader);
                                break;
                            case 5:
                                advisorDashboardStateRelationshipInitiatedDecode = AdvisorDashboardStateRelationshipInitiated.ADAPTER.decode(reader);
                                break;
                            case 6:
                                advisorDashboardStateRelationshipActiveDecode = AdvisorDashboardStateRelationshipActive.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AdvisorDashboardState(advisorDashboardStateNotEnrolledDecode, advisorDashboardStateEnrolledNoBookingDecode, advisorDashboardStateFirstBookingDecode, advisorDashboardStatePostBookingDecode, advisorDashboardStateRelationshipInitiatedDecode, advisorDashboardStateRelationshipActiveDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
