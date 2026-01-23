package bonfire.proto.idl.copilot.p032v1;

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

/* compiled from: GetFeedbackResponse.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006$"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetFeedbackResponse;", "Lcom/squareup/wire/Message;", "", "digest_id", "", "feedback_reaction", "Lbonfire/proto/idl/copilot/v1/FeedbackReaction;", "like_reasons", "", "Lbonfire/proto/idl/copilot/v1/FeedbackReason;", "dislike_reasons", "instrument_type", "Lbonfire/proto/idl/copilot/v1/InstrumentType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/copilot/v1/FeedbackReaction;Ljava/util/List;Ljava/util/List;Lbonfire/proto/idl/copilot/v1/InstrumentType;Lokio/ByteString;)V", "getDigest_id", "()Ljava/lang/String;", "getFeedback_reaction", "()Lbonfire/proto/idl/copilot/v1/FeedbackReaction;", "getInstrument_type", "()Lbonfire/proto/idl/copilot/v1/InstrumentType;", "getLike_reasons", "()Ljava/util/List;", "getDislike_reasons", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetFeedbackResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetFeedbackResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String digest_id;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.FeedbackReason#ADAPTER", jsonName = "dislikeReasons", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<FeedbackReason> dislike_reasons;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.FeedbackReaction#ADAPTER", jsonName = "feedbackReaction", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final FeedbackReaction feedback_reaction;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final InstrumentType instrument_type;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.FeedbackReason#ADAPTER", jsonName = "likeReasons", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<FeedbackReason> like_reasons;

    public GetFeedbackResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8859newBuilder();
    }

    public final String getDigest_id() {
        return this.digest_id;
    }

    public /* synthetic */ GetFeedbackResponse(String str, FeedbackReaction feedbackReaction, List list, List list2, InstrumentType instrumentType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? FeedbackReaction.REACTION_TYPE_UNSPECIFIED : feedbackReaction, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final FeedbackReaction getFeedback_reaction() {
        return this.feedback_reaction;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFeedbackResponse(String digest_id, FeedbackReaction feedback_reaction, List<FeedbackReason> like_reasons, List<FeedbackReason> dislike_reasons, InstrumentType instrument_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(feedback_reaction, "feedback_reaction");
        Intrinsics.checkNotNullParameter(like_reasons, "like_reasons");
        Intrinsics.checkNotNullParameter(dislike_reasons, "dislike_reasons");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.digest_id = digest_id;
        this.feedback_reaction = feedback_reaction;
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
    public /* synthetic */ Void m8859newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFeedbackResponse)) {
            return false;
        }
        GetFeedbackResponse getFeedbackResponse = (GetFeedbackResponse) other;
        return Intrinsics.areEqual(unknownFields(), getFeedbackResponse.unknownFields()) && Intrinsics.areEqual(this.digest_id, getFeedbackResponse.digest_id) && this.feedback_reaction == getFeedbackResponse.feedback_reaction && Intrinsics.areEqual(this.like_reasons, getFeedbackResponse.like_reasons) && Intrinsics.areEqual(this.dislike_reasons, getFeedbackResponse.dislike_reasons) && this.instrument_type == getFeedbackResponse.instrument_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.digest_id.hashCode()) * 37) + this.feedback_reaction.hashCode()) * 37) + this.like_reasons.hashCode()) * 37) + this.dislike_reasons.hashCode()) * 37) + this.instrument_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
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
        arrayList.add("instrument_type=" + this.instrument_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFeedbackResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFeedbackResponse copy$default(GetFeedbackResponse getFeedbackResponse, String str, FeedbackReaction feedbackReaction, List list, List list2, InstrumentType instrumentType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFeedbackResponse.digest_id;
        }
        if ((i & 2) != 0) {
            feedbackReaction = getFeedbackResponse.feedback_reaction;
        }
        if ((i & 4) != 0) {
            list = getFeedbackResponse.like_reasons;
        }
        if ((i & 8) != 0) {
            list2 = getFeedbackResponse.dislike_reasons;
        }
        if ((i & 16) != 0) {
            instrumentType = getFeedbackResponse.instrument_type;
        }
        if ((i & 32) != 0) {
            byteString = getFeedbackResponse.unknownFields();
        }
        InstrumentType instrumentType2 = instrumentType;
        ByteString byteString2 = byteString;
        return getFeedbackResponse.copy(str, feedbackReaction, list, list2, instrumentType2, byteString2);
    }

    public final GetFeedbackResponse copy(String digest_id, FeedbackReaction feedback_reaction, List<FeedbackReason> like_reasons, List<FeedbackReason> dislike_reasons, InstrumentType instrument_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(feedback_reaction, "feedback_reaction");
        Intrinsics.checkNotNullParameter(like_reasons, "like_reasons");
        Intrinsics.checkNotNullParameter(dislike_reasons, "dislike_reasons");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFeedbackResponse(digest_id, feedback_reaction, like_reasons, dislike_reasons, instrument_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFeedbackResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFeedbackResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.GetFeedbackResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFeedbackResponse value) {
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
                return value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED ? iEncodedSizeWithTag + InstrumentType.ADAPTER.encodedSizeWithTag(5, value.getInstrument_type()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFeedbackResponse value) throws IOException {
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
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 5, (int) value.getInstrument_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFeedbackResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 5, (int) value.getInstrument_type());
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
            public GetFeedbackResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FeedbackReaction feedbackReactionDecode = FeedbackReaction.REACTION_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                InstrumentType instrumentTypeDecode = instrumentType;
                while (true) {
                    FeedbackReaction feedbackReaction = feedbackReactionDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetFeedbackResponse(strDecode, feedbackReaction, arrayList, arrayList2, instrumentTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                feedbackReactionDecode = FeedbackReaction.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            arrayList.add(FeedbackReason.ADAPTER.decode(reader));
                        } else if (iNextTag == 4) {
                            arrayList2.add(FeedbackReason.ADAPTER.decode(reader));
                        } else if (iNextTag == 5) {
                            try {
                                instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFeedbackResponse redact(GetFeedbackResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<FeedbackReason> like_reasons = value.getLike_reasons();
                ProtoAdapter<FeedbackReason> protoAdapter = FeedbackReason.ADAPTER;
                return GetFeedbackResponse.copy$default(value, null, null, Internal.m26823redactElements(like_reasons, protoAdapter), Internal.m26823redactElements(value.getDislike_reasons(), protoAdapter), null, ByteString.EMPTY, 19, null);
            }
        };
    }
}
