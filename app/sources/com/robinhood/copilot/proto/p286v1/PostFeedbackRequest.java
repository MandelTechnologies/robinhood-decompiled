package com.robinhood.copilot.proto.p286v1;

import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.rosetta.i18n.Locality;
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

/* compiled from: PostFeedbackRequest.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0083\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u0089\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b(\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b)\u0010\"R\"\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b3\u0010\"R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b4\u0010\"R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u00107¨\u00069"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PostFeedbackRequest;", "Lcom/squareup/wire/Message;", "", "", "instrument_id", "type", MatchaQrCodeDuxo6.USER_ID_KEY, "reaction", "", "reasons", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "generation_timestamp", "Lcom/robinhood/copilot/proto/v1/InstrumentType;", "instrument_type", "Lcom/robinhood/rosetta/i18n/Locality;", "locality", "composite_feedback_id", "freeform_feedback", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/InstrumentType;Lcom/robinhood/rosetta/i18n/Locality;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/InstrumentType;Lcom/robinhood/rosetta/i18n/Locality;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/PostFeedbackRequest;", "Ljava/lang/String;", "getInstrument_id", "getType", "getUser_id", "getReaction", "Lj$/time/Instant;", "getGeneration_timestamp", "()Lj$/time/Instant;", "Lcom/robinhood/copilot/proto/v1/InstrumentType;", "getInstrument_type", "()Lcom/robinhood/copilot/proto/v1/InstrumentType;", "Lcom/robinhood/rosetta/i18n/Locality;", "getLocality", "()Lcom/robinhood/rosetta/i18n/Locality;", "getComposite_feedback_id", "getFreeform_feedback", "Ljava/util/List;", "getReasons", "()Ljava/util/List;", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PostFeedbackRequest extends Message {

    @JvmField
    public static final ProtoAdapter<PostFeedbackRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "compositeFeedbackId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String composite_feedback_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "freeformFeedback", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String freeform_feedback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "generationTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant generation_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Locality locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String reaction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<String> reasons;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String user_id;

    public PostFeedbackRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ PostFeedbackRequest(String str, String str2, String str3, String str4, List list, Instant instant, InstrumentType instrumentType, Locality locality, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 128) != 0 ? Locality.LOCALITY_UNSPECIFIED : locality, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22159newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getReaction() {
        return this.reaction;
    }

    public final Instant getGeneration_timestamp() {
        return this.generation_timestamp;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    public final Locality getLocality() {
        return this.locality;
    }

    public final String getComposite_feedback_id() {
        return this.composite_feedback_id;
    }

    public final String getFreeform_feedback() {
        return this.freeform_feedback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostFeedbackRequest(String instrument_id, String type2, String user_id, String reaction, List<String> reasons, Instant instant, InstrumentType instrument_type, Locality locality, String composite_feedback_id, String freeform_feedback, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.type = type2;
        this.user_id = user_id;
        this.reaction = reaction;
        this.generation_timestamp = instant;
        this.instrument_type = instrument_type;
        this.locality = locality;
        this.composite_feedback_id = composite_feedback_id;
        this.freeform_feedback = freeform_feedback;
        this.reasons = Internal.immutableCopyOf("reasons", reasons);
    }

    public final List<String> getReasons() {
        return this.reasons;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22159newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PostFeedbackRequest)) {
            return false;
        }
        PostFeedbackRequest postFeedbackRequest = (PostFeedbackRequest) other;
        return Intrinsics.areEqual(unknownFields(), postFeedbackRequest.unknownFields()) && Intrinsics.areEqual(this.instrument_id, postFeedbackRequest.instrument_id) && Intrinsics.areEqual(this.type, postFeedbackRequest.type) && Intrinsics.areEqual(this.user_id, postFeedbackRequest.user_id) && Intrinsics.areEqual(this.reaction, postFeedbackRequest.reaction) && Intrinsics.areEqual(this.reasons, postFeedbackRequest.reasons) && Intrinsics.areEqual(this.generation_timestamp, postFeedbackRequest.generation_timestamp) && this.instrument_type == postFeedbackRequest.instrument_type && this.locality == postFeedbackRequest.locality && Intrinsics.areEqual(this.composite_feedback_id, postFeedbackRequest.composite_feedback_id) && Intrinsics.areEqual(this.freeform_feedback, postFeedbackRequest.freeform_feedback);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.type.hashCode()) * 37) + this.user_id.hashCode()) * 37) + this.reaction.hashCode()) * 37) + this.reasons.hashCode()) * 37;
        Instant instant = this.generation_timestamp;
        int iHashCode2 = ((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.instrument_type.hashCode()) * 37) + this.locality.hashCode()) * 37) + this.composite_feedback_id.hashCode()) * 37) + this.freeform_feedback.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        arrayList.add("reaction=" + Internal.sanitize(this.reaction));
        if (!this.reasons.isEmpty()) {
            arrayList.add("reasons=" + Internal.sanitize(this.reasons));
        }
        Instant instant = this.generation_timestamp;
        if (instant != null) {
            arrayList.add("generation_timestamp=" + instant);
        }
        arrayList.add("instrument_type=" + this.instrument_type);
        arrayList.add("locality=" + this.locality);
        arrayList.add("composite_feedback_id=" + Internal.sanitize(this.composite_feedback_id));
        arrayList.add("freeform_feedback=" + Internal.sanitize(this.freeform_feedback));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PostFeedbackRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PostFeedbackRequest copy$default(PostFeedbackRequest postFeedbackRequest, String str, String str2, String str3, String str4, List list, Instant instant, InstrumentType instrumentType, Locality locality, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postFeedbackRequest.instrument_id;
        }
        if ((i & 2) != 0) {
            str2 = postFeedbackRequest.type;
        }
        if ((i & 4) != 0) {
            str3 = postFeedbackRequest.user_id;
        }
        if ((i & 8) != 0) {
            str4 = postFeedbackRequest.reaction;
        }
        if ((i & 16) != 0) {
            list = postFeedbackRequest.reasons;
        }
        if ((i & 32) != 0) {
            instant = postFeedbackRequest.generation_timestamp;
        }
        if ((i & 64) != 0) {
            instrumentType = postFeedbackRequest.instrument_type;
        }
        if ((i & 128) != 0) {
            locality = postFeedbackRequest.locality;
        }
        if ((i & 256) != 0) {
            str5 = postFeedbackRequest.composite_feedback_id;
        }
        if ((i & 512) != 0) {
            str6 = postFeedbackRequest.freeform_feedback;
        }
        if ((i & 1024) != 0) {
            byteString = postFeedbackRequest.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        Locality locality2 = locality;
        String str8 = str5;
        Instant instant2 = instant;
        InstrumentType instrumentType2 = instrumentType;
        List list2 = list;
        String str9 = str3;
        return postFeedbackRequest.copy(str, str2, str9, str4, list2, instant2, instrumentType2, locality2, str8, str7, byteString2);
    }

    public final PostFeedbackRequest copy(String instrument_id, String type2, String user_id, String reaction, List<String> reasons, Instant generation_timestamp, InstrumentType instrument_type, Locality locality, String composite_feedback_id, String freeform_feedback, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PostFeedbackRequest(instrument_id, type2, user_id, reaction, reasons, generation_timestamp, instrument_type, locality, composite_feedback_id, freeform_feedback, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PostFeedbackRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PostFeedbackRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.PostFeedbackRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PostFeedbackRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getType());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getReaction(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getReaction());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(5, value.getReasons());
                if (value.getGeneration_timestamp() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getGeneration_timestamp());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += InstrumentType.ADAPTER.encodedSizeWithTag(7, value.getInstrument_type());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    iEncodedSizeWithTag += Locality.ADAPTER.encodedSizeWithTag(8, value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getComposite_feedback_id(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(9, value.getComposite_feedback_id());
                }
                return !Intrinsics.areEqual(value.getFreeform_feedback(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(10, value.getFreeform_feedback()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PostFeedbackRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getReaction(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getReaction());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getReasons());
                if (value.getGeneration_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getGeneration_timestamp());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 7, (int) value.getInstrument_type());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 8, (int) value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getComposite_feedback_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getComposite_feedback_id());
                }
                if (!Intrinsics.areEqual(value.getFreeform_feedback(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getFreeform_feedback());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PostFeedbackRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFreeform_feedback(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getFreeform_feedback());
                }
                if (!Intrinsics.areEqual(value.getComposite_feedback_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getComposite_feedback_id());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 8, (int) value.getLocality());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 7, (int) value.getInstrument_type());
                }
                if (value.getGeneration_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getGeneration_timestamp());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getReasons());
                if (!Intrinsics.areEqual(value.getReaction(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getReaction());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PostFeedbackRequest decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                Locality locality = Locality.LOCALITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                Instant instantDecode = null;
                Locality localityDecode = locality;
                String strDecode6 = strDecode5;
                InstrumentType instrumentTypeDecode = instrumentType;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                str = strDecode6;
                                str2 = strDecode;
                                str3 = strDecode2;
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                strDecode2 = str3;
                                strDecode6 = str;
                                strDecode = str2;
                                break;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 7:
                                str = strDecode6;
                                str2 = strDecode;
                                try {
                                    instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str3 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                strDecode6 = str;
                                strDecode = str2;
                                break;
                            case 8:
                                try {
                                    localityDecode = Locality.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    str = strDecode6;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 9:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode6;
                                str2 = strDecode;
                                str3 = strDecode2;
                                strDecode2 = str3;
                                strDecode6 = str;
                                strDecode = str2;
                                break;
                        }
                    } else {
                        return new PostFeedbackRequest(strDecode6, strDecode, strDecode2, strDecode3, arrayList, instantDecode, instrumentTypeDecode, localityDecode, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PostFeedbackRequest redact(PostFeedbackRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant generation_timestamp = value.getGeneration_timestamp();
                return PostFeedbackRequest.copy$default(value, null, null, null, null, null, generation_timestamp != null ? ProtoAdapter.INSTANT.redact(generation_timestamp) : null, null, null, null, null, ByteString.EMPTY, 991, null);
            }
        };
    }
}
