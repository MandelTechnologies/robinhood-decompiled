package com.robinhood.copilot.proto.p286v1;

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
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JH\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetFeedbackResponse;", "Lcom/squareup/wire/Message;", "", "digest_id", "", "reaction", "reasons", "", "composite_feedback_id", "freeform_feedback", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getDigest_id", "()Ljava/lang/String;", "getReaction", "getComposite_feedback_id", "getFreeform_feedback", "getReasons", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetFeedbackResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetFeedbackResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "compositeFeedbackId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String composite_feedback_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String digest_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "freeformFeedback", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String freeform_feedback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String reaction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> reasons;

    public GetFeedbackResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ GetFeedbackResponse(String str, String str2, List list, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22109newBuilder();
    }

    public final String getDigest_id() {
        return this.digest_id;
    }

    public final String getReaction() {
        return this.reaction;
    }

    public final String getComposite_feedback_id() {
        return this.composite_feedback_id;
    }

    public final String getFreeform_feedback() {
        return this.freeform_feedback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFeedbackResponse(String digest_id, String reaction, List<String> reasons, String composite_feedback_id, String freeform_feedback, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.digest_id = digest_id;
        this.reaction = reaction;
        this.composite_feedback_id = composite_feedback_id;
        this.freeform_feedback = freeform_feedback;
        this.reasons = Internal.immutableCopyOf("reasons", reasons);
    }

    public final List<String> getReasons() {
        return this.reasons;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22109newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), getFeedbackResponse.unknownFields()) && Intrinsics.areEqual(this.digest_id, getFeedbackResponse.digest_id) && Intrinsics.areEqual(this.reaction, getFeedbackResponse.reaction) && Intrinsics.areEqual(this.reasons, getFeedbackResponse.reasons) && Intrinsics.areEqual(this.composite_feedback_id, getFeedbackResponse.composite_feedback_id) && Intrinsics.areEqual(this.freeform_feedback, getFeedbackResponse.freeform_feedback);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.digest_id.hashCode()) * 37) + this.reaction.hashCode()) * 37) + this.reasons.hashCode()) * 37) + this.composite_feedback_id.hashCode()) * 37) + this.freeform_feedback.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("digest_id=" + Internal.sanitize(this.digest_id));
        arrayList.add("reaction=" + Internal.sanitize(this.reaction));
        if (!this.reasons.isEmpty()) {
            arrayList.add("reasons=" + Internal.sanitize(this.reasons));
        }
        arrayList.add("composite_feedback_id=" + Internal.sanitize(this.composite_feedback_id));
        arrayList.add("freeform_feedback=" + Internal.sanitize(this.freeform_feedback));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFeedbackResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFeedbackResponse copy$default(GetFeedbackResponse getFeedbackResponse, String str, String str2, List list, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFeedbackResponse.digest_id;
        }
        if ((i & 2) != 0) {
            str2 = getFeedbackResponse.reaction;
        }
        if ((i & 4) != 0) {
            list = getFeedbackResponse.reasons;
        }
        if ((i & 8) != 0) {
            str3 = getFeedbackResponse.composite_feedback_id;
        }
        if ((i & 16) != 0) {
            str4 = getFeedbackResponse.freeform_feedback;
        }
        if ((i & 32) != 0) {
            byteString = getFeedbackResponse.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return getFeedbackResponse.copy(str, str2, list, str3, str5, byteString2);
    }

    public final GetFeedbackResponse copy(String digest_id, String reaction, List<String> reasons, String composite_feedback_id, String freeform_feedback, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(composite_feedback_id, "composite_feedback_id");
        Intrinsics.checkNotNullParameter(freeform_feedback, "freeform_feedback");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFeedbackResponse(digest_id, reaction, reasons, composite_feedback_id, freeform_feedback, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFeedbackResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFeedbackResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetFeedbackResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFeedbackResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDigest_id());
                }
                if (!Intrinsics.areEqual(value.getReaction(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getReaction());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getReasons());
                if (!Intrinsics.areEqual(value.getComposite_feedback_id(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getComposite_feedback_id());
                }
                return !Intrinsics.areEqual(value.getFreeform_feedback(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, value.getFreeform_feedback()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFeedbackResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
                }
                if (!Intrinsics.areEqual(value.getReaction(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getReaction());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getReasons());
                if (!Intrinsics.areEqual(value.getComposite_feedback_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getComposite_feedback_id());
                }
                if (!Intrinsics.areEqual(value.getFreeform_feedback(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getFreeform_feedback());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFeedbackResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFreeform_feedback(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getFreeform_feedback());
                }
                if (!Intrinsics.areEqual(value.getComposite_feedback_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getComposite_feedback_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getReasons());
                if (!Intrinsics.areEqual(value.getReaction(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getReaction());
                }
                if (Intrinsics.areEqual(value.getDigest_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDigest_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFeedbackResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetFeedbackResponse(strDecode, strDecode2, arrayList, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFeedbackResponse redact(GetFeedbackResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetFeedbackResponse.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
