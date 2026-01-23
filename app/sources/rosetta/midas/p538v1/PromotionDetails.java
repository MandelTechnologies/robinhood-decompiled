package rosetta.midas.p538v1;

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
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;
import rosetta.midas.p538v1.PromotionDetails;

/* compiled from: PromotionDetails.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,-BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u001cR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetails;", "Lcom/squareup/wire/Message;", "", "", "uuid", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "start_date", "end_date", "Lrosetta/midas/v1/PromotionDetails$PromotionEligibilityDetails;", "promotion_eligibility_details", "Lrosetta/midas/v1/PromotionDetails$PromotionParticipationDetails;", "promotion_participation_details", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lrosetta/midas/v1/PromotionDetails$PromotionEligibilityDetails;Lrosetta/midas/v1/PromotionDetails$PromotionParticipationDetails;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lrosetta/midas/v1/PromotionDetails$PromotionEligibilityDetails;Lrosetta/midas/v1/PromotionDetails$PromotionParticipationDetails;Lokio/ByteString;)Lrosetta/midas/v1/PromotionDetails;", "Ljava/lang/String;", "getUuid", "Lj$/time/Instant;", "getStart_date", "()Lj$/time/Instant;", "getEnd_date", "Lrosetta/midas/v1/PromotionDetails$PromotionEligibilityDetails;", "getPromotion_eligibility_details", "()Lrosetta/midas/v1/PromotionDetails$PromotionEligibilityDetails;", "Lrosetta/midas/v1/PromotionDetails$PromotionParticipationDetails;", "getPromotion_participation_details", "()Lrosetta/midas/v1/PromotionDetails$PromotionParticipationDetails;", "Companion", "PromotionEligibilityDetails", "PromotionParticipationDetails", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PromotionDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PromotionDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant end_date;

    @WireField(adapter = "rosetta.midas.v1.PromotionDetails$PromotionEligibilityDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PromotionEligibilityDetails promotion_eligibility_details;

    @WireField(adapter = "rosetta.midas.v1.PromotionDetails$PromotionParticipationDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final PromotionParticipationDetails promotion_participation_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant start_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String uuid;

    public PromotionDetails() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29902newBuilder();
    }

    public final String getUuid() {
        return this.uuid;
    }

    public /* synthetic */ PromotionDetails(String str, Instant instant, Instant instant2, PromotionEligibilityDetails promotionEligibilityDetails, PromotionParticipationDetails promotionParticipationDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? null : promotionEligibilityDetails, (i & 16) != 0 ? null : promotionParticipationDetails, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getStart_date() {
        return this.start_date;
    }

    public final Instant getEnd_date() {
        return this.end_date;
    }

    public final PromotionEligibilityDetails getPromotion_eligibility_details() {
        return this.promotion_eligibility_details;
    }

    public final PromotionParticipationDetails getPromotion_participation_details() {
        return this.promotion_participation_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionDetails(String uuid, Instant instant, Instant instant2, PromotionEligibilityDetails promotionEligibilityDetails, PromotionParticipationDetails promotionParticipationDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.uuid = uuid;
        this.start_date = instant;
        this.end_date = instant2;
        this.promotion_eligibility_details = promotionEligibilityDetails;
        this.promotion_participation_details = promotionParticipationDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29902newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PromotionDetails)) {
            return false;
        }
        PromotionDetails promotionDetails = (PromotionDetails) other;
        return Intrinsics.areEqual(unknownFields(), promotionDetails.unknownFields()) && Intrinsics.areEqual(this.uuid, promotionDetails.uuid) && Intrinsics.areEqual(this.start_date, promotionDetails.start_date) && Intrinsics.areEqual(this.end_date, promotionDetails.end_date) && Intrinsics.areEqual(this.promotion_eligibility_details, promotionDetails.promotion_eligibility_details) && Intrinsics.areEqual(this.promotion_participation_details, promotionDetails.promotion_participation_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.uuid.hashCode()) * 37;
        Instant instant = this.start_date;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.end_date;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        PromotionEligibilityDetails promotionEligibilityDetails = this.promotion_eligibility_details;
        int iHashCode4 = (iHashCode3 + (promotionEligibilityDetails != null ? promotionEligibilityDetails.hashCode() : 0)) * 37;
        PromotionParticipationDetails promotionParticipationDetails = this.promotion_participation_details;
        int iHashCode5 = iHashCode4 + (promotionParticipationDetails != null ? promotionParticipationDetails.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("uuid=" + Internal.sanitize(this.uuid));
        Instant instant = this.start_date;
        if (instant != null) {
            arrayList.add("start_date=" + instant);
        }
        Instant instant2 = this.end_date;
        if (instant2 != null) {
            arrayList.add("end_date=" + instant2);
        }
        PromotionEligibilityDetails promotionEligibilityDetails = this.promotion_eligibility_details;
        if (promotionEligibilityDetails != null) {
            arrayList.add("promotion_eligibility_details=" + promotionEligibilityDetails);
        }
        PromotionParticipationDetails promotionParticipationDetails = this.promotion_participation_details;
        if (promotionParticipationDetails != null) {
            arrayList.add("promotion_participation_details=" + promotionParticipationDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PromotionDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PromotionDetails copy$default(PromotionDetails promotionDetails, String str, Instant instant, Instant instant2, PromotionEligibilityDetails promotionEligibilityDetails, PromotionParticipationDetails promotionParticipationDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promotionDetails.uuid;
        }
        if ((i & 2) != 0) {
            instant = promotionDetails.start_date;
        }
        if ((i & 4) != 0) {
            instant2 = promotionDetails.end_date;
        }
        if ((i & 8) != 0) {
            promotionEligibilityDetails = promotionDetails.promotion_eligibility_details;
        }
        if ((i & 16) != 0) {
            promotionParticipationDetails = promotionDetails.promotion_participation_details;
        }
        if ((i & 32) != 0) {
            byteString = promotionDetails.unknownFields();
        }
        PromotionParticipationDetails promotionParticipationDetails2 = promotionParticipationDetails;
        ByteString byteString2 = byteString;
        return promotionDetails.copy(str, instant, instant2, promotionEligibilityDetails, promotionParticipationDetails2, byteString2);
    }

    public final PromotionDetails copy(String uuid, Instant start_date, Instant end_date, PromotionEligibilityDetails promotion_eligibility_details, PromotionParticipationDetails promotion_participation_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PromotionDetails(uuid, start_date, end_date, promotion_eligibility_details, promotion_participation_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PromotionDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PromotionDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.midas.v1.PromotionDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PromotionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUuid());
                }
                if (value.getStart_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getStart_date());
                }
                if (value.getEnd_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getEnd_date());
                }
                if (value.getPromotion_eligibility_details() != null) {
                    size += PromotionDetails.PromotionEligibilityDetails.ADAPTER.encodedSizeWithTag(4, value.getPromotion_eligibility_details());
                }
                return value.getPromotion_participation_details() != null ? size + PromotionDetails.PromotionParticipationDetails.ADAPTER.encodedSizeWithTag(5, value.getPromotion_participation_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PromotionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUuid());
                }
                if (value.getStart_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getStart_date());
                }
                if (value.getEnd_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getEnd_date());
                }
                if (value.getPromotion_eligibility_details() != null) {
                    PromotionDetails.PromotionEligibilityDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getPromotion_eligibility_details());
                }
                if (value.getPromotion_participation_details() != null) {
                    PromotionDetails.PromotionParticipationDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getPromotion_participation_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PromotionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPromotion_participation_details() != null) {
                    PromotionDetails.PromotionParticipationDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getPromotion_participation_details());
                }
                if (value.getPromotion_eligibility_details() != null) {
                    PromotionDetails.PromotionEligibilityDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getPromotion_eligibility_details());
                }
                if (value.getEnd_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getEnd_date());
                }
                if (value.getStart_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getStart_date());
                }
                if (Intrinsics.areEqual(value.getUuid(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUuid());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PromotionDetails redact(PromotionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant start_date = value.getStart_date();
                Instant instantRedact = start_date != null ? ProtoAdapter.INSTANT.redact(start_date) : null;
                Instant end_date = value.getEnd_date();
                Instant instantRedact2 = end_date != null ? ProtoAdapter.INSTANT.redact(end_date) : null;
                PromotionDetails.PromotionEligibilityDetails promotion_eligibility_details = value.getPromotion_eligibility_details();
                PromotionDetails.PromotionEligibilityDetails promotionEligibilityDetailsRedact = promotion_eligibility_details != null ? PromotionDetails.PromotionEligibilityDetails.ADAPTER.redact(promotion_eligibility_details) : null;
                PromotionDetails.PromotionParticipationDetails promotion_participation_details = value.getPromotion_participation_details();
                return PromotionDetails.copy$default(value, null, instantRedact, instantRedact2, promotionEligibilityDetailsRedact, promotion_participation_details != null ? PromotionDetails.PromotionParticipationDetails.ADAPTER.redact(promotion_participation_details) : null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PromotionDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                PromotionDetails.PromotionEligibilityDetails promotionEligibilityDetailsDecode = null;
                PromotionDetails.PromotionParticipationDetails promotionParticipationDetailsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PromotionDetails(strDecode, instantDecode, instantDecode2, promotionEligibilityDetailsDecode, promotionParticipationDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 4) {
                        promotionEligibilityDetailsDecode = PromotionDetails.PromotionEligibilityDetails.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        promotionParticipationDetailsDecode = PromotionDetails.PromotionParticipationDetails.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: PromotionDetails.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ[\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u001bR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\"R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b$\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetails$PromotionEligibilityDetails;", "Lcom/squareup/wire/Message;", "", "", "uuid", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "start_date", "end_date", "campaign_id", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncrease;", "incentive_cc_credit_limit_increase", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lrosetta/midas/v1/IncentiveCCCreditLimitIncrease;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lrosetta/midas/v1/IncentiveCCCreditLimitIncrease;Lokio/ByteString;)Lrosetta/midas/v1/PromotionDetails$PromotionEligibilityDetails;", "Ljava/lang/String;", "getUuid", "Lj$/time/Instant;", "getStart_date", "()Lj$/time/Instant;", "getEnd_date", "getCampaign_id", "Lrosetta/midas/v1/IncentiveCCCreditLimitIncrease;", "getIncentive_cc_credit_limit_increase", "()Lrosetta/midas/v1/IncentiveCCCreditLimitIncrease;", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PromotionEligibilityDetails extends Message {

        @JvmField
        public static final ProtoAdapter<PromotionEligibilityDetails> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String campaign_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final Instant end_date;

        @WireField(adapter = "rosetta.midas.v1.IncentiveCCCreditLimitIncrease#ADAPTER", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 4, tag = 5)
        private final IncentiveCCCreditLimitIncrease incentive_cc_credit_limit_increase;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Instant start_date;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String uuid;

        public PromotionEligibilityDetails() {
            this(null, null, null, null, null, null, 63, null);
        }

        public /* synthetic */ PromotionEligibilityDetails(String str, Instant instant, Instant instant2, String str2, IncentiveCCCreditLimitIncrease incentiveCCCreditLimitIncrease, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : incentiveCCCreditLimitIncrease, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29903newBuilder();
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final Instant getStart_date() {
            return this.start_date;
        }

        public final Instant getEnd_date() {
            return this.end_date;
        }

        public final String getCampaign_id() {
            return this.campaign_id;
        }

        public final IncentiveCCCreditLimitIncrease getIncentive_cc_credit_limit_increase() {
            return this.incentive_cc_credit_limit_increase;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PromotionEligibilityDetails(String uuid, Instant instant, Instant instant2, String campaign_id, IncentiveCCCreditLimitIncrease incentiveCCCreditLimitIncrease, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.uuid = uuid;
            this.start_date = instant;
            this.end_date = instant2;
            this.campaign_id = campaign_id;
            this.incentive_cc_credit_limit_increase = incentiveCCCreditLimitIncrease;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29903newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PromotionEligibilityDetails)) {
                return false;
            }
            PromotionEligibilityDetails promotionEligibilityDetails = (PromotionEligibilityDetails) other;
            return Intrinsics.areEqual(unknownFields(), promotionEligibilityDetails.unknownFields()) && Intrinsics.areEqual(this.uuid, promotionEligibilityDetails.uuid) && Intrinsics.areEqual(this.start_date, promotionEligibilityDetails.start_date) && Intrinsics.areEqual(this.end_date, promotionEligibilityDetails.end_date) && Intrinsics.areEqual(this.campaign_id, promotionEligibilityDetails.campaign_id) && Intrinsics.areEqual(this.incentive_cc_credit_limit_increase, promotionEligibilityDetails.incentive_cc_credit_limit_increase);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.uuid.hashCode()) * 37;
            Instant instant = this.start_date;
            int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
            Instant instant2 = this.end_date;
            int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.campaign_id.hashCode()) * 37;
            IncentiveCCCreditLimitIncrease incentiveCCCreditLimitIncrease = this.incentive_cc_credit_limit_increase;
            int iHashCode4 = iHashCode3 + (incentiveCCCreditLimitIncrease != null ? incentiveCCCreditLimitIncrease.hashCode() : 0);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("uuid=" + Internal.sanitize(this.uuid));
            Instant instant = this.start_date;
            if (instant != null) {
                arrayList.add("start_date=" + instant);
            }
            Instant instant2 = this.end_date;
            if (instant2 != null) {
                arrayList.add("end_date=" + instant2);
            }
            arrayList.add("campaign_id=" + Internal.sanitize(this.campaign_id));
            IncentiveCCCreditLimitIncrease incentiveCCCreditLimitIncrease = this.incentive_cc_credit_limit_increase;
            if (incentiveCCCreditLimitIncrease != null) {
                arrayList.add("incentive_cc_credit_limit_increase=" + incentiveCCCreditLimitIncrease);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PromotionEligibilityDetails{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ PromotionEligibilityDetails copy$default(PromotionEligibilityDetails promotionEligibilityDetails, String str, Instant instant, Instant instant2, String str2, IncentiveCCCreditLimitIncrease incentiveCCCreditLimitIncrease, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = promotionEligibilityDetails.uuid;
            }
            if ((i & 2) != 0) {
                instant = promotionEligibilityDetails.start_date;
            }
            if ((i & 4) != 0) {
                instant2 = promotionEligibilityDetails.end_date;
            }
            if ((i & 8) != 0) {
                str2 = promotionEligibilityDetails.campaign_id;
            }
            if ((i & 16) != 0) {
                incentiveCCCreditLimitIncrease = promotionEligibilityDetails.incentive_cc_credit_limit_increase;
            }
            if ((i & 32) != 0) {
                byteString = promotionEligibilityDetails.unknownFields();
            }
            IncentiveCCCreditLimitIncrease incentiveCCCreditLimitIncrease2 = incentiveCCCreditLimitIncrease;
            ByteString byteString2 = byteString;
            return promotionEligibilityDetails.copy(str, instant, instant2, str2, incentiveCCCreditLimitIncrease2, byteString2);
        }

        public final PromotionEligibilityDetails copy(String uuid, Instant start_date, Instant end_date, String campaign_id, IncentiveCCCreditLimitIncrease incentive_cc_credit_limit_increase, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PromotionEligibilityDetails(uuid, start_date, end_date, campaign_id, incentive_cc_credit_limit_increase, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PromotionEligibilityDetails.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PromotionEligibilityDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.midas.v1.PromotionDetails$PromotionEligibilityDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PromotionDetails.PromotionEligibilityDetails value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getUuid(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUuid());
                    }
                    if (value.getStart_date() != null) {
                        size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getStart_date());
                    }
                    if (value.getEnd_date() != null) {
                        size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getEnd_date());
                    }
                    if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCampaign_id());
                    }
                    return size + IncentiveCCCreditLimitIncrease.ADAPTER.encodedSizeWithTag(5, value.getIncentive_cc_credit_limit_increase());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PromotionDetails.PromotionEligibilityDetails value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getUuid(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUuid());
                    }
                    if (value.getStart_date() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getStart_date());
                    }
                    if (value.getEnd_date() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getEnd_date());
                    }
                    if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCampaign_id());
                    }
                    IncentiveCCCreditLimitIncrease.ADAPTER.encodeWithTag(writer, 5, (int) value.getIncentive_cc_credit_limit_increase());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PromotionDetails.PromotionEligibilityDetails value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    IncentiveCCCreditLimitIncrease.ADAPTER.encodeWithTag(writer, 5, (int) value.getIncentive_cc_credit_limit_increase());
                    if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCampaign_id());
                    }
                    if (value.getEnd_date() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getEnd_date());
                    }
                    if (value.getStart_date() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getStart_date());
                    }
                    if (Intrinsics.areEqual(value.getUuid(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUuid());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PromotionDetails.PromotionEligibilityDetails redact(PromotionDetails.PromotionEligibilityDetails value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Instant start_date = value.getStart_date();
                    Instant instantRedact = start_date != null ? ProtoAdapter.INSTANT.redact(start_date) : null;
                    Instant end_date = value.getEnd_date();
                    Instant instantRedact2 = end_date != null ? ProtoAdapter.INSTANT.redact(end_date) : null;
                    IncentiveCCCreditLimitIncrease incentive_cc_credit_limit_increase = value.getIncentive_cc_credit_limit_increase();
                    return PromotionDetails.PromotionEligibilityDetails.copy$default(value, null, instantRedact, instantRedact2, null, incentive_cc_credit_limit_increase != null ? IncentiveCCCreditLimitIncrease.ADAPTER.redact(incentive_cc_credit_limit_increase) : null, ByteString.EMPTY, 9, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PromotionDetails.PromotionEligibilityDetails decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    Instant instantDecode = null;
                    Instant instantDecode2 = null;
                    IncentiveCCCreditLimitIncrease incentiveCCCreditLimitIncreaseDecode = null;
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PromotionDetails.PromotionEligibilityDetails(strDecode, instantDecode, instantDecode2, strDecode2, incentiveCCCreditLimitIncreaseDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        } else if (iNextTag == 3) {
                            instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            incentiveCCCreditLimitIncreaseDecode = IncentiveCCCreditLimitIncrease.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: PromotionDetails.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006\""}, m3636d2 = {"Lrosetta/midas/v1/PromotionDetails$PromotionParticipationDetails;", "Lcom/squareup/wire/Message;", "", "", "uuid", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "start_date", "end_date", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lrosetta/midas/v1/PromotionDetails$PromotionParticipationDetails;", "Ljava/lang/String;", "getUuid", "Lj$/time/Instant;", "getStart_date", "()Lj$/time/Instant;", "getEnd_date", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PromotionParticipationDetails extends Message {

        @JvmField
        public static final ProtoAdapter<PromotionParticipationDetails> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final Instant end_date;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Instant start_date;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String uuid;

        public PromotionParticipationDetails() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29904newBuilder();
        }

        public final String getUuid() {
            return this.uuid;
        }

        public /* synthetic */ PromotionParticipationDetails(String str, Instant instant, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public final Instant getStart_date() {
            return this.start_date;
        }

        public final Instant getEnd_date() {
            return this.end_date;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PromotionParticipationDetails(String uuid, Instant instant, Instant instant2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.uuid = uuid;
            this.start_date = instant;
            this.end_date = instant2;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29904newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PromotionParticipationDetails)) {
                return false;
            }
            PromotionParticipationDetails promotionParticipationDetails = (PromotionParticipationDetails) other;
            return Intrinsics.areEqual(unknownFields(), promotionParticipationDetails.unknownFields()) && Intrinsics.areEqual(this.uuid, promotionParticipationDetails.uuid) && Intrinsics.areEqual(this.start_date, promotionParticipationDetails.start_date) && Intrinsics.areEqual(this.end_date, promotionParticipationDetails.end_date);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.uuid.hashCode()) * 37;
            Instant instant = this.start_date;
            int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
            Instant instant2 = this.end_date;
            int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("uuid=" + Internal.sanitize(this.uuid));
            Instant instant = this.start_date;
            if (instant != null) {
                arrayList.add("start_date=" + instant);
            }
            Instant instant2 = this.end_date;
            if (instant2 != null) {
                arrayList.add("end_date=" + instant2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PromotionParticipationDetails{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ PromotionParticipationDetails copy$default(PromotionParticipationDetails promotionParticipationDetails, String str, Instant instant, Instant instant2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = promotionParticipationDetails.uuid;
            }
            if ((i & 2) != 0) {
                instant = promotionParticipationDetails.start_date;
            }
            if ((i & 4) != 0) {
                instant2 = promotionParticipationDetails.end_date;
            }
            if ((i & 8) != 0) {
                byteString = promotionParticipationDetails.unknownFields();
            }
            return promotionParticipationDetails.copy(str, instant, instant2, byteString);
        }

        public final PromotionParticipationDetails copy(String uuid, Instant start_date, Instant end_date, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PromotionParticipationDetails(uuid, start_date, end_date, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PromotionParticipationDetails.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PromotionParticipationDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.midas.v1.PromotionDetails$PromotionParticipationDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PromotionDetails.PromotionParticipationDetails decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    Instant instantDecode = null;
                    Instant instantDecode2 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PromotionDetails.PromotionParticipationDetails(strDecode, instantDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        } else if (iNextTag == 3) {
                            instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PromotionDetails.PromotionParticipationDetails value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getUuid(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUuid());
                    }
                    if (value.getStart_date() != null) {
                        size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getStart_date());
                    }
                    return value.getEnd_date() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getEnd_date()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PromotionDetails.PromotionParticipationDetails value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getUuid(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUuid());
                    }
                    if (value.getStart_date() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getStart_date());
                    }
                    if (value.getEnd_date() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getEnd_date());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PromotionDetails.PromotionParticipationDetails value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getEnd_date() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getEnd_date());
                    }
                    if (value.getStart_date() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getStart_date());
                    }
                    if (Intrinsics.areEqual(value.getUuid(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUuid());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PromotionDetails.PromotionParticipationDetails redact(PromotionDetails.PromotionParticipationDetails value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Instant start_date = value.getStart_date();
                    Instant instantRedact = start_date != null ? ProtoAdapter.INSTANT.redact(start_date) : null;
                    Instant end_date = value.getEnd_date();
                    return PromotionDetails.PromotionParticipationDetails.copy$default(value, null, instantRedact, end_date != null ? ProtoAdapter.INSTANT.redact(end_date) : null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }
}
