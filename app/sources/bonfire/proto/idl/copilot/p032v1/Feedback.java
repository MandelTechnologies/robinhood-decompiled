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

/* compiled from: Feedback.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/Feedback;", "Lcom/squareup/wire/Message;", "", "feedback_reaction", "Lbonfire/proto/idl/copilot/v1/FeedbackReaction;", "like_reasons", "", "Lbonfire/proto/idl/copilot/v1/FeedbackReason;", "dislike_reasons", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/copilot/v1/FeedbackReaction;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getFeedback_reaction", "()Lbonfire/proto/idl/copilot/v1/FeedbackReaction;", "getLike_reasons", "()Ljava/util/List;", "getDislike_reasons", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Feedback extends Message {

    @JvmField
    public static final ProtoAdapter<Feedback> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.FeedbackReason#ADAPTER", jsonName = "dislikeReasons", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<FeedbackReason> dislike_reasons;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.FeedbackReaction#ADAPTER", jsonName = "feedbackReaction", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FeedbackReaction feedback_reaction;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.FeedbackReason#ADAPTER", jsonName = "likeReasons", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<FeedbackReason> like_reasons;

    public Feedback() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8856newBuilder();
    }

    public final FeedbackReaction getFeedback_reaction() {
        return this.feedback_reaction;
    }

    public /* synthetic */ Feedback(FeedbackReaction feedbackReaction, List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FeedbackReaction.REACTION_TYPE_UNSPECIFIED : feedbackReaction, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Feedback(FeedbackReaction feedback_reaction, List<FeedbackReason> like_reasons, List<FeedbackReason> dislike_reasons, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(feedback_reaction, "feedback_reaction");
        Intrinsics.checkNotNullParameter(like_reasons, "like_reasons");
        Intrinsics.checkNotNullParameter(dislike_reasons, "dislike_reasons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.feedback_reaction = feedback_reaction;
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
    public /* synthetic */ Void m8856newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Feedback)) {
            return false;
        }
        Feedback feedback = (Feedback) other;
        return Intrinsics.areEqual(unknownFields(), feedback.unknownFields()) && this.feedback_reaction == feedback.feedback_reaction && Intrinsics.areEqual(this.like_reasons, feedback.like_reasons) && Intrinsics.areEqual(this.dislike_reasons, feedback.dislike_reasons);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.feedback_reaction.hashCode()) * 37) + this.like_reasons.hashCode()) * 37) + this.dislike_reasons.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("feedback_reaction=" + this.feedback_reaction);
        if (!this.like_reasons.isEmpty()) {
            arrayList.add("like_reasons=" + this.like_reasons);
        }
        if (!this.dislike_reasons.isEmpty()) {
            arrayList.add("dislike_reasons=" + this.dislike_reasons);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Feedback{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Feedback copy$default(Feedback feedback, FeedbackReaction feedbackReaction, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            feedbackReaction = feedback.feedback_reaction;
        }
        if ((i & 2) != 0) {
            list = feedback.like_reasons;
        }
        if ((i & 4) != 0) {
            list2 = feedback.dislike_reasons;
        }
        if ((i & 8) != 0) {
            byteString = feedback.unknownFields();
        }
        return feedback.copy(feedbackReaction, list, list2, byteString);
    }

    public final Feedback copy(FeedbackReaction feedback_reaction, List<FeedbackReason> like_reasons, List<FeedbackReason> dislike_reasons, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(feedback_reaction, "feedback_reaction");
        Intrinsics.checkNotNullParameter(like_reasons, "like_reasons");
        Intrinsics.checkNotNullParameter(dislike_reasons, "dislike_reasons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Feedback(feedback_reaction, like_reasons, dislike_reasons, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Feedback.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Feedback>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.Feedback$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Feedback value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getFeedback_reaction() != FeedbackReaction.REACTION_TYPE_UNSPECIFIED) {
                    size += FeedbackReaction.ADAPTER.encodedSizeWithTag(1, value.getFeedback_reaction());
                }
                ProtoAdapter<FeedbackReason> protoAdapter = FeedbackReason.ADAPTER;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getLike_reasons()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getDislike_reasons());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Feedback value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getFeedback_reaction() != FeedbackReaction.REACTION_TYPE_UNSPECIFIED) {
                    FeedbackReaction.ADAPTER.encodeWithTag(writer, 1, (int) value.getFeedback_reaction());
                }
                ProtoAdapter<FeedbackReason> protoAdapter = FeedbackReason.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getLike_reasons());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getDislike_reasons());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Feedback value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<FeedbackReason> protoAdapter = FeedbackReason.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getDislike_reasons());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getLike_reasons());
                if (value.getFeedback_reaction() != FeedbackReaction.REACTION_TYPE_UNSPECIFIED) {
                    FeedbackReaction.ADAPTER.encodeWithTag(writer, 1, (int) value.getFeedback_reaction());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Feedback decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FeedbackReaction feedbackReactionDecode = FeedbackReaction.REACTION_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Feedback(feedbackReactionDecode, arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            feedbackReactionDecode = FeedbackReaction.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        arrayList.add(FeedbackReason.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList2.add(FeedbackReason.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Feedback redact(Feedback value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<FeedbackReason> like_reasons = value.getLike_reasons();
                ProtoAdapter<FeedbackReason> protoAdapter = FeedbackReason.ADAPTER;
                return Feedback.copy$default(value, null, Internal.m26823redactElements(like_reasons, protoAdapter), Internal.m26823redactElements(value.getDislike_reasons(), protoAdapter), ByteString.EMPTY, 1, null);
            }
        };
    }
}
