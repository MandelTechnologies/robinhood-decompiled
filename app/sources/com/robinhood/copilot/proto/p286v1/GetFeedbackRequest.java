package com.robinhood.copilot.proto.p286v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
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
import p479j$.time.Instant;

/* compiled from: GetFeedbackRequest.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B]\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJc\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\"\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b(\u0010'R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b)\u0010\u001c¨\u0006+"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackRequest;", "Lcom/squareup/wire/Message;", "", "", "instrument_id", MatchaQrCodeDuxo6.USER_ID_KEY, "Lcom/robinhood/copilot/proto/v1/FeedbackType;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "generation_timestamp", "feedback_timestamp", "composite_feedback_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/FeedbackType;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/FeedbackType;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/GetFeedbackRequest;", "Ljava/lang/String;", "getInstrument_id", "getUser_id", "Lcom/robinhood/copilot/proto/v1/FeedbackType;", "getType", "()Lcom/robinhood/copilot/proto/v1/FeedbackType;", "Lj$/time/Instant;", "getGeneration_timestamp", "()Lj$/time/Instant;", "getFeedback_timestamp", "getComposite_feedback_id", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetFeedbackRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetFeedbackRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "compositeFeedbackId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String composite_feedback_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "feedbackTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant feedback_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "generationTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant generation_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.FeedbackType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final FeedbackType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String user_id;

    public GetFeedbackRequest() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ GetFeedbackRequest(String str, String str2, FeedbackType feedbackType, Instant instant, Instant instant2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? FeedbackType.FEEDBACK_TYPE_UNSPECIFIED : feedbackType, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22107newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final FeedbackType getType() {
        return this.type;
    }

    public final Instant getGeneration_timestamp() {
        return this.generation_timestamp;
    }

    public final Instant getFeedback_timestamp() {
        return this.feedback_timestamp;
    }

    public final String getComposite_feedback_id() {
        return this.composite_feedback_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFeedbackRequest(String instrument_id, String user_id, FeedbackType type2, Instant instant, Instant instant2, String composite_feedback_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.user_id = user_id;
        this.type = type2;
        this.generation_timestamp = instant;
        this.feedback_timestamp = instant2;
        this.composite_feedback_id = composite_feedback_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22107newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFeedbackRequest)) {
            return false;
        }
        GetFeedbackRequest getFeedbackRequest = (GetFeedbackRequest) other;
        return Intrinsics.areEqual(unknownFields(), getFeedbackRequest.unknownFields()) && Intrinsics.areEqual(this.instrument_id, getFeedbackRequest.instrument_id) && Intrinsics.areEqual(this.user_id, getFeedbackRequest.user_id) && this.type == getFeedbackRequest.type && Intrinsics.areEqual(this.generation_timestamp, getFeedbackRequest.generation_timestamp) && Intrinsics.areEqual(this.feedback_timestamp, getFeedbackRequest.feedback_timestamp) && Intrinsics.areEqual(this.composite_feedback_id, getFeedbackRequest.composite_feedback_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.user_id.hashCode()) * 37) + this.type.hashCode()) * 37;
        Instant instant = this.generation_timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.feedback_timestamp;
        int iHashCode3 = ((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.composite_feedback_id.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        arrayList.add("type=" + this.type);
        Instant instant = this.generation_timestamp;
        if (instant != null) {
            arrayList.add("generation_timestamp=" + instant);
        }
        Instant instant2 = this.feedback_timestamp;
        if (instant2 != null) {
            arrayList.add("feedback_timestamp=" + instant2);
        }
        arrayList.add("composite_feedback_id=" + Internal.sanitize(this.composite_feedback_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFeedbackRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFeedbackRequest copy$default(GetFeedbackRequest getFeedbackRequest, String str, String str2, FeedbackType feedbackType, Instant instant, Instant instant2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFeedbackRequest.instrument_id;
        }
        if ((i & 2) != 0) {
            str2 = getFeedbackRequest.user_id;
        }
        if ((i & 4) != 0) {
            feedbackType = getFeedbackRequest.type;
        }
        if ((i & 8) != 0) {
            instant = getFeedbackRequest.generation_timestamp;
        }
        if ((i & 16) != 0) {
            instant2 = getFeedbackRequest.feedback_timestamp;
        }
        if ((i & 32) != 0) {
            str3 = getFeedbackRequest.composite_feedback_id;
        }
        if ((i & 64) != 0) {
            byteString = getFeedbackRequest.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        Instant instant3 = instant2;
        FeedbackType feedbackType2 = feedbackType;
        return getFeedbackRequest.copy(str, str2, feedbackType2, instant, instant3, str4, byteString2);
    }

    public final GetFeedbackRequest copy(String instrument_id, String user_id, FeedbackType type2, Instant generation_timestamp, Instant feedback_timestamp, String composite_feedback_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFeedbackRequest(instrument_id, user_id, type2, generation_timestamp, feedback_timestamp, composite_feedback_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFeedbackRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFeedbackRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetFeedbackRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFeedbackRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUser_id());
                }
                if (value.getType() != FeedbackType.FEEDBACK_TYPE_UNSPECIFIED) {
                    size += FeedbackType.ADAPTER.encodedSizeWithTag(3, value.getType());
                }
                if (value.getGeneration_timestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getGeneration_timestamp());
                }
                if (value.getFeedback_timestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getFeedback_timestamp());
                }
                return !Intrinsics.areEqual(value.getComposite_feedback_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getComposite_feedback_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFeedbackRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                if (value.getType() != FeedbackType.FEEDBACK_TYPE_UNSPECIFIED) {
                    FeedbackType.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (value.getGeneration_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getGeneration_timestamp());
                }
                if (value.getFeedback_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getFeedback_timestamp());
                }
                if (!Intrinsics.areEqual(value.getComposite_feedback_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getComposite_feedback_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFeedbackRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getComposite_feedback_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getComposite_feedback_id());
                }
                if (value.getFeedback_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getFeedback_timestamp());
                }
                if (value.getGeneration_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getGeneration_timestamp());
                }
                if (value.getType() != FeedbackType.FEEDBACK_TYPE_UNSPECIFIED) {
                    FeedbackType.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFeedbackRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FeedbackType feedbackType = FeedbackType.FEEDBACK_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                FeedbackType feedbackTypeDecode = feedbackType;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                try {
                                    feedbackTypeDecode = FeedbackType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetFeedbackRequest(strDecode3, strDecode, feedbackTypeDecode, instantDecode, instantDecode2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFeedbackRequest redact(GetFeedbackRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant generation_timestamp = value.getGeneration_timestamp();
                Instant instantRedact = generation_timestamp != null ? ProtoAdapter.INSTANT.redact(generation_timestamp) : null;
                Instant feedback_timestamp = value.getFeedback_timestamp();
                return GetFeedbackRequest.copy$default(value, null, null, null, instantRedact, feedback_timestamp != null ? ProtoAdapter.INSTANT.redact(feedback_timestamp) : null, null, ByteString.EMPTY, 39, null);
            }
        };
    }
}
