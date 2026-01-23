package bonfire.proto.idl.copilot.p032v1;

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
import p479j$.time.Instant;

/* compiled from: SubmitFeedbackResponse.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011Ba\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJg\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\"\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b0\u0010/¨\u00062"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponse;", "Lcom/squareup/wire/Message;", "", "", "digest_id", "Lbonfire/proto/idl/copilot/v1/FeedbackReaction;", "feedback_reaction", "", "Lbonfire/proto/idl/copilot/v1/FeedbackReason;", "like_reasons", "dislike_reasons", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "feedback_timestamp", "Lbonfire/proto/idl/copilot/v1/InstrumentType;", "instrument_type", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/copilot/v1/FeedbackReaction;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentType;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lbonfire/proto/idl/copilot/v1/FeedbackReaction;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentType;Lokio/ByteString;)Lbonfire/proto/idl/copilot/v1/SubmitFeedbackResponse;", "Ljava/lang/String;", "getDigest_id", "Lbonfire/proto/idl/copilot/v1/FeedbackReaction;", "getFeedback_reaction", "()Lbonfire/proto/idl/copilot/v1/FeedbackReaction;", "Lj$/time/Instant;", "getFeedback_timestamp", "()Lj$/time/Instant;", "Lbonfire/proto/idl/copilot/v1/InstrumentType;", "getInstrument_type", "()Lbonfire/proto/idl/copilot/v1/InstrumentType;", "Ljava/util/List;", "getLike_reasons", "()Ljava/util/List;", "getDislike_reasons", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SubmitFeedbackResponse extends Message {

    @JvmField
    public static final ProtoAdapter<SubmitFeedbackResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String digest_id;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.FeedbackReason#ADAPTER", jsonName = "dislikeReasons", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<FeedbackReason> dislike_reasons;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.FeedbackReaction#ADAPTER", jsonName = "feedbackReaction", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final FeedbackReaction feedback_reaction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "feedbackTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant feedback_timestamp;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final InstrumentType instrument_type;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.FeedbackReason#ADAPTER", jsonName = "likeReasons", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<FeedbackReason> like_reasons;

    public SubmitFeedbackResponse() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8894newBuilder();
    }

    public final String getDigest_id() {
        return this.digest_id;
    }

    public /* synthetic */ SubmitFeedbackResponse(String str, FeedbackReaction feedbackReaction, List list, List list2, Instant instant, InstrumentType instrumentType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? FeedbackReaction.REACTION_TYPE_UNSPECIFIED : feedbackReaction, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final FeedbackReaction getFeedback_reaction() {
        return this.feedback_reaction;
    }

    public final Instant getFeedback_timestamp() {
        return this.feedback_timestamp;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitFeedbackResponse(String digest_id, FeedbackReaction feedback_reaction, List<FeedbackReason> like_reasons, List<FeedbackReason> dislike_reasons, Instant instant, InstrumentType instrument_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(feedback_reaction, "feedback_reaction");
        Intrinsics.checkNotNullParameter(like_reasons, "like_reasons");
        Intrinsics.checkNotNullParameter(dislike_reasons, "dislike_reasons");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.digest_id = digest_id;
        this.feedback_reaction = feedback_reaction;
        this.feedback_timestamp = instant;
        this.instrument_type = instrument_type;
        this.like_reasons = Internal.immutableCopyOf("like_reasons", like_reasons);
        this.dislike_reasons = Internal.immutableCopyOf("dislike_reasons", dislike_reasons);
    }

    public final List<FeedbackReason> getLike_reasons() {
        return this.like_reasons;
    }

    public final List<FeedbackReason> getDislike_reasons() {
        return this.dislike_reasons;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8894newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubmitFeedbackResponse)) {
            return false;
        }
        SubmitFeedbackResponse submitFeedbackResponse = (SubmitFeedbackResponse) other;
        return Intrinsics.areEqual(unknownFields(), submitFeedbackResponse.unknownFields()) && Intrinsics.areEqual(this.digest_id, submitFeedbackResponse.digest_id) && this.feedback_reaction == submitFeedbackResponse.feedback_reaction && Intrinsics.areEqual(this.like_reasons, submitFeedbackResponse.like_reasons) && Intrinsics.areEqual(this.dislike_reasons, submitFeedbackResponse.dislike_reasons) && Intrinsics.areEqual(this.feedback_timestamp, submitFeedbackResponse.feedback_timestamp) && this.instrument_type == submitFeedbackResponse.instrument_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.digest_id.hashCode()) * 37) + this.feedback_reaction.hashCode()) * 37) + this.like_reasons.hashCode()) * 37) + this.dislike_reasons.hashCode()) * 37;
        Instant instant = this.feedback_timestamp;
        int iHashCode2 = ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.instrument_type.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("digest_id=" + Internal.sanitize(this.digest_id));
        arrayList.add("feedback_reaction=" + this.feedback_reaction);
        if (!this.like_reasons.isEmpty()) {
            arrayList.add("like_reasons=" + this.like_reasons);
        }
        if (!this.dislike_reasons.isEmpty()) {
            arrayList.add("dislike_reasons=" + this.dislike_reasons);
        }
        Instant instant = this.feedback_timestamp;
        if (instant != null) {
            arrayList.add("feedback_timestamp=" + instant);
        }
        arrayList.add("instrument_type=" + this.instrument_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitFeedbackResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SubmitFeedbackResponse copy$default(SubmitFeedbackResponse submitFeedbackResponse, String str, FeedbackReaction feedbackReaction, List list, List list2, Instant instant, InstrumentType instrumentType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitFeedbackResponse.digest_id;
        }
        if ((i & 2) != 0) {
            feedbackReaction = submitFeedbackResponse.feedback_reaction;
        }
        if ((i & 4) != 0) {
            list = submitFeedbackResponse.like_reasons;
        }
        if ((i & 8) != 0) {
            list2 = submitFeedbackResponse.dislike_reasons;
        }
        if ((i & 16) != 0) {
            instant = submitFeedbackResponse.feedback_timestamp;
        }
        if ((i & 32) != 0) {
            instrumentType = submitFeedbackResponse.instrument_type;
        }
        if ((i & 64) != 0) {
            byteString = submitFeedbackResponse.unknownFields();
        }
        InstrumentType instrumentType2 = instrumentType;
        ByteString byteString2 = byteString;
        Instant instant2 = instant;
        List list3 = list;
        return submitFeedbackResponse.copy(str, feedbackReaction, list3, list2, instant2, instrumentType2, byteString2);
    }

    public final SubmitFeedbackResponse copy(String digest_id, FeedbackReaction feedback_reaction, List<FeedbackReason> like_reasons, List<FeedbackReason> dislike_reasons, Instant feedback_timestamp, InstrumentType instrument_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(feedback_reaction, "feedback_reaction");
        Intrinsics.checkNotNullParameter(like_reasons, "like_reasons");
        Intrinsics.checkNotNullParameter(dislike_reasons, "dislike_reasons");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubmitFeedbackResponse(digest_id, feedback_reaction, like_reasons, dislike_reasons, feedback_timestamp, instrument_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubmitFeedbackResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubmitFeedbackResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.SubmitFeedbackResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubmitFeedbackResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDigest_id());
                }
                if (value.getFeedback_reaction() != FeedbackReaction.REACTION_TYPE_UNSPECIFIED) {
                    size += FeedbackReaction.ADAPTER.encodedSizeWithTag(2, value.getFeedback_reaction());
                }
                ProtoAdapter<FeedbackReason> protoAdapter = FeedbackReason.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getLike_reasons()) + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getDislike_reasons());
                if (value.getFeedback_timestamp() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getFeedback_timestamp());
                }
                return value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED ? iEncodedSizeWithTag + InstrumentType.ADAPTER.encodedSizeWithTag(6, value.getInstrument_type()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubmitFeedbackResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
                }
                if (value.getFeedback_reaction() != FeedbackReaction.REACTION_TYPE_UNSPECIFIED) {
                    FeedbackReaction.ADAPTER.encodeWithTag(writer, 2, (int) value.getFeedback_reaction());
                }
                ProtoAdapter<FeedbackReason> protoAdapter = FeedbackReason.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getLike_reasons());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getDislike_reasons());
                if (value.getFeedback_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getFeedback_timestamp());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 6, (int) value.getInstrument_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubmitFeedbackResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 6, (int) value.getInstrument_type());
                }
                if (value.getFeedback_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getFeedback_timestamp());
                }
                ProtoAdapter<FeedbackReason> protoAdapter = FeedbackReason.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getDislike_reasons());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getLike_reasons());
                if (value.getFeedback_reaction() != FeedbackReaction.REACTION_TYPE_UNSPECIFIED) {
                    FeedbackReaction.ADAPTER.encodeWithTag(writer, 2, (int) value.getFeedback_reaction());
                }
                if (Intrinsics.areEqual(value.getDigest_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SubmitFeedbackResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FeedbackReaction feedbackReactionDecode = FeedbackReaction.REACTION_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                String strDecode = "";
                InstrumentType instrumentTypeDecode = instrumentType;
                while (true) {
                    FeedbackReaction feedbackReaction = feedbackReactionDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        feedbackReactionDecode = FeedbackReaction.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    arrayList.add(FeedbackReason.ADAPTER.decode(reader));
                                    break;
                                case 4:
                                    arrayList2.add(FeedbackReason.ADAPTER.decode(reader));
                                    break;
                                case 5:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 6:
                                    try {
                                        instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new SubmitFeedbackResponse(strDecode, feedbackReaction, arrayList, arrayList2, instantDecode, instrumentTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubmitFeedbackResponse redact(SubmitFeedbackResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<FeedbackReason> like_reasons = value.getLike_reasons();
                ProtoAdapter<FeedbackReason> protoAdapter = FeedbackReason.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(like_reasons, protoAdapter);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getDislike_reasons(), protoAdapter);
                Instant feedback_timestamp = value.getFeedback_timestamp();
                return SubmitFeedbackResponse.copy$default(value, null, null, listM26823redactElements, listM26823redactElements2, feedback_timestamp != null ? ProtoAdapter.INSTANT.redact(feedback_timestamp) : null, null, ByteString.EMPTY, 35, null);
            }
        };
    }
}
