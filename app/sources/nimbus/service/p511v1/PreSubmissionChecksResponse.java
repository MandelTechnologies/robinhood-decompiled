package nimbus.service.p511v1;

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

/* compiled from: PreSubmissionChecksResponse.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\nH\u0016JJ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksResponse;", "Lcom/squareup/wire/Message;", "", "eligible", "", "ineligible_reason", "Lnimbus/service/v1/IneligibilityReason;", "acats_clawback", "Lnimbus/service/v1/ClawbackDetails;", "moved_gold_boost_amount", "", "warnings", "", "Lnimbus/service/v1/PreSubmissionWarning;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLnimbus/service/v1/IneligibilityReason;Lnimbus/service/v1/ClawbackDetails;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getEligible", "()Z", "getIneligible_reason", "()Lnimbus/service/v1/IneligibilityReason;", "getAcats_clawback", "()Lnimbus/service/v1/ClawbackDetails;", "getMoved_gold_boost_amount", "()Ljava/lang/String;", "getWarnings", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PreSubmissionChecksResponse extends Message {

    @JvmField
    public static final ProtoAdapter<PreSubmissionChecksResponse> ADAPTER;

    @WireField(adapter = "nimbus.service.v1.ClawbackDetails#ADAPTER", jsonName = "acatsClawback", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ClawbackDetails acats_clawback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean eligible;

    @WireField(adapter = "nimbus.service.v1.IneligibilityReason#ADAPTER", jsonName = "ineligibleReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final IneligibilityReason ineligible_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "movedGoldBoostAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String moved_gold_boost_amount;

    @WireField(adapter = "nimbus.service.v1.PreSubmissionWarning#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<PreSubmissionWarning> warnings;

    public PreSubmissionChecksResponse() {
        this(false, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29375newBuilder();
    }

    public final boolean getEligible() {
        return this.eligible;
    }

    public final IneligibilityReason getIneligible_reason() {
        return this.ineligible_reason;
    }

    public /* synthetic */ PreSubmissionChecksResponse(boolean z, IneligibilityReason ineligibilityReason, ClawbackDetails clawbackDetails, String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED : ineligibilityReason, (i & 4) != 0 ? null : clawbackDetails, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ClawbackDetails getAcats_clawback() {
        return this.acats_clawback;
    }

    public final String getMoved_gold_boost_amount() {
        return this.moved_gold_boost_amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSubmissionChecksResponse(boolean z, IneligibilityReason ineligible_reason, ClawbackDetails clawbackDetails, String moved_gold_boost_amount, List<PreSubmissionWarning> warnings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ineligible_reason, "ineligible_reason");
        Intrinsics.checkNotNullParameter(moved_gold_boost_amount, "moved_gold_boost_amount");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.eligible = z;
        this.ineligible_reason = ineligible_reason;
        this.acats_clawback = clawbackDetails;
        this.moved_gold_boost_amount = moved_gold_boost_amount;
        this.warnings = Internal.immutableCopyOf("warnings", warnings);
    }

    public final List<PreSubmissionWarning> getWarnings() {
        return this.warnings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29375newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PreSubmissionChecksResponse)) {
            return false;
        }
        PreSubmissionChecksResponse preSubmissionChecksResponse = (PreSubmissionChecksResponse) other;
        return Intrinsics.areEqual(unknownFields(), preSubmissionChecksResponse.unknownFields()) && this.eligible == preSubmissionChecksResponse.eligible && this.ineligible_reason == preSubmissionChecksResponse.ineligible_reason && Intrinsics.areEqual(this.acats_clawback, preSubmissionChecksResponse.acats_clawback) && Intrinsics.areEqual(this.moved_gold_boost_amount, preSubmissionChecksResponse.moved_gold_boost_amount) && Intrinsics.areEqual(this.warnings, preSubmissionChecksResponse.warnings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.eligible)) * 37) + this.ineligible_reason.hashCode()) * 37;
        ClawbackDetails clawbackDetails = this.acats_clawback;
        int iHashCode2 = ((((iHashCode + (clawbackDetails != null ? clawbackDetails.hashCode() : 0)) * 37) + this.moved_gold_boost_amount.hashCode()) * 37) + this.warnings.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("eligible=" + this.eligible);
        arrayList.add("ineligible_reason=" + this.ineligible_reason);
        ClawbackDetails clawbackDetails = this.acats_clawback;
        if (clawbackDetails != null) {
            arrayList.add("acats_clawback=" + clawbackDetails);
        }
        arrayList.add("moved_gold_boost_amount=" + Internal.sanitize(this.moved_gold_boost_amount));
        if (!this.warnings.isEmpty()) {
            arrayList.add("warnings=" + this.warnings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PreSubmissionChecksResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PreSubmissionChecksResponse copy$default(PreSubmissionChecksResponse preSubmissionChecksResponse, boolean z, IneligibilityReason ineligibilityReason, ClawbackDetails clawbackDetails, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = preSubmissionChecksResponse.eligible;
        }
        if ((i & 2) != 0) {
            ineligibilityReason = preSubmissionChecksResponse.ineligible_reason;
        }
        if ((i & 4) != 0) {
            clawbackDetails = preSubmissionChecksResponse.acats_clawback;
        }
        if ((i & 8) != 0) {
            str = preSubmissionChecksResponse.moved_gold_boost_amount;
        }
        if ((i & 16) != 0) {
            list = preSubmissionChecksResponse.warnings;
        }
        if ((i & 32) != 0) {
            byteString = preSubmissionChecksResponse.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        return preSubmissionChecksResponse.copy(z, ineligibilityReason, clawbackDetails, str, list2, byteString2);
    }

    public final PreSubmissionChecksResponse copy(boolean eligible, IneligibilityReason ineligible_reason, ClawbackDetails acats_clawback, String moved_gold_boost_amount, List<PreSubmissionWarning> warnings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ineligible_reason, "ineligible_reason");
        Intrinsics.checkNotNullParameter(moved_gold_boost_amount, "moved_gold_boost_amount");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PreSubmissionChecksResponse(eligible, ineligible_reason, acats_clawback, moved_gold_boost_amount, warnings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreSubmissionChecksResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PreSubmissionChecksResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nimbus.service.v1.PreSubmissionChecksResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PreSubmissionChecksResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEligible()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getEligible()));
                }
                if (value.getIneligible_reason() != IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED) {
                    size += IneligibilityReason.ADAPTER.encodedSizeWithTag(2, value.getIneligible_reason());
                }
                if (value.getAcats_clawback() != null) {
                    size += ClawbackDetails.ADAPTER.encodedSizeWithTag(3, value.getAcats_clawback());
                }
                if (!Intrinsics.areEqual(value.getMoved_gold_boost_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getMoved_gold_boost_amount());
                }
                return size + PreSubmissionWarning.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getWarnings());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PreSubmissionChecksResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEligible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getEligible()));
                }
                if (value.getIneligible_reason() != IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED) {
                    IneligibilityReason.ADAPTER.encodeWithTag(writer, 2, (int) value.getIneligible_reason());
                }
                if (value.getAcats_clawback() != null) {
                    ClawbackDetails.ADAPTER.encodeWithTag(writer, 3, (int) value.getAcats_clawback());
                }
                if (!Intrinsics.areEqual(value.getMoved_gold_boost_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMoved_gold_boost_amount());
                }
                PreSubmissionWarning.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getWarnings());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PreSubmissionChecksResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PreSubmissionWarning.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getWarnings());
                if (!Intrinsics.areEqual(value.getMoved_gold_boost_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMoved_gold_boost_amount());
                }
                if (value.getAcats_clawback() != null) {
                    ClawbackDetails.ADAPTER.encodeWithTag(writer, 3, (int) value.getAcats_clawback());
                }
                if (value.getIneligible_reason() != IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED) {
                    IneligibilityReason.ADAPTER.encodeWithTag(writer, 2, (int) value.getIneligible_reason());
                }
                if (value.getEligible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getEligible()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PreSubmissionChecksResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                IneligibilityReason ineligibilityReasonDecode = IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                ClawbackDetails clawbackDetailsDecode = null;
                String strDecode = "";
                boolean zBooleanValue = false;
                while (true) {
                    IneligibilityReason ineligibilityReason = ineligibilityReasonDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PreSubmissionChecksResponse(zBooleanValue, ineligibilityReason, clawbackDetailsDecode, strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (iNextTag == 2) {
                            try {
                                ineligibilityReasonDecode = IneligibilityReason.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            clawbackDetailsDecode = ClawbackDetails.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            arrayList.add(PreSubmissionWarning.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PreSubmissionChecksResponse redact(PreSubmissionChecksResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ClawbackDetails acats_clawback = value.getAcats_clawback();
                return PreSubmissionChecksResponse.copy$default(value, false, null, acats_clawback != null ? ClawbackDetails.ADAPTER.redact(acats_clawback) : null, null, Internal.m26823redactElements(value.getWarnings(), PreSubmissionWarning.ADAPTER), ByteString.EMPTY, 11, null);
            }
        };
    }
}
