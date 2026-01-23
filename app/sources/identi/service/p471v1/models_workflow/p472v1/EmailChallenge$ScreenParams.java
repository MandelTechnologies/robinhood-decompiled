package identi.service.p471v1.models_workflow.p472v1;

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

/* compiled from: EmailChallenge.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B3\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u0018¨\u0006\""}, m3636d2 = {"identi/service/v1/models_workflow/v1/EmailChallenge$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/EmailChallenge$ScreenParams;", "", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge;", "sheriff_challenge", "", "sheriff_flow_id", "fallback_cta_text", "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/SheriffChallenge;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/SheriffChallenge;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/EmailChallenge$ScreenParams;", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge;", "getSheriff_challenge", "()Lidenti/service/v1/models_workflow/v1/SheriffChallenge;", "Ljava/lang/String;", "getSheriff_flow_id", "getFallback_cta_text", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class EmailChallenge$ScreenParams extends Message {

    @JvmField
    public static final ProtoAdapter<EmailChallenge$ScreenParams> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fallbackCtaText", schemaIndex = 2, tag = 3)
    private final String fallback_cta_text;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SheriffChallenge#ADAPTER", jsonName = "sheriffChallenge", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final SheriffChallenge sheriff_challenge;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sheriffFlowId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String sheriff_flow_id;

    public EmailChallenge$ScreenParams() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28309newBuilder();
    }

    public final SheriffChallenge getSheriff_challenge() {
        return this.sheriff_challenge;
    }

    public final String getSheriff_flow_id() {
        return this.sheriff_flow_id;
    }

    public /* synthetic */ EmailChallenge$ScreenParams(SheriffChallenge sheriffChallenge, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sheriffChallenge, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getFallback_cta_text() {
        return this.fallback_cta_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailChallenge$ScreenParams(SheriffChallenge sheriffChallenge, String sheriff_flow_id, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(sheriff_flow_id, "sheriff_flow_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.sheriff_challenge = sheriffChallenge;
        this.sheriff_flow_id = sheriff_flow_id;
        this.fallback_cta_text = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28309newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EmailChallenge$ScreenParams)) {
            return false;
        }
        EmailChallenge$ScreenParams emailChallenge$ScreenParams = (EmailChallenge$ScreenParams) other;
        return Intrinsics.areEqual(unknownFields(), emailChallenge$ScreenParams.unknownFields()) && Intrinsics.areEqual(this.sheriff_challenge, emailChallenge$ScreenParams.sheriff_challenge) && Intrinsics.areEqual(this.sheriff_flow_id, emailChallenge$ScreenParams.sheriff_flow_id) && Intrinsics.areEqual(this.fallback_cta_text, emailChallenge$ScreenParams.fallback_cta_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        SheriffChallenge sheriffChallenge = this.sheriff_challenge;
        int iHashCode2 = (((iHashCode + (sheriffChallenge != null ? sheriffChallenge.hashCode() : 0)) * 37) + this.sheriff_flow_id.hashCode()) * 37;
        String str = this.fallback_cta_text;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        SheriffChallenge sheriffChallenge = this.sheriff_challenge;
        if (sheriffChallenge != null) {
            arrayList.add("sheriff_challenge=" + sheriffChallenge);
        }
        arrayList.add("sheriff_flow_id=" + Internal.sanitize(this.sheriff_flow_id));
        String str = this.fallback_cta_text;
        if (str != null) {
            arrayList.add("fallback_cta_text=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EmailChallenge$ScreenParams copy$default(EmailChallenge$ScreenParams emailChallenge$ScreenParams, SheriffChallenge sheriffChallenge, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            sheriffChallenge = emailChallenge$ScreenParams.sheriff_challenge;
        }
        if ((i & 2) != 0) {
            str = emailChallenge$ScreenParams.sheriff_flow_id;
        }
        if ((i & 4) != 0) {
            str2 = emailChallenge$ScreenParams.fallback_cta_text;
        }
        if ((i & 8) != 0) {
            byteString = emailChallenge$ScreenParams.unknownFields();
        }
        return emailChallenge$ScreenParams.copy(sheriffChallenge, str, str2, byteString);
    }

    public final EmailChallenge$ScreenParams copy(SheriffChallenge sheriff_challenge, String sheriff_flow_id, String fallback_cta_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(sheriff_flow_id, "sheriff_flow_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EmailChallenge$ScreenParams(sheriff_challenge, sheriff_flow_id, fallback_cta_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EmailChallenge$ScreenParams.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EmailChallenge$ScreenParams>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.EmailChallenge$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EmailChallenge$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSheriff_challenge() != null) {
                    size += SheriffChallenge.ADAPTER.encodedSizeWithTag(1, value.getSheriff_challenge());
                }
                if (!Intrinsics.areEqual(value.getSheriff_flow_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSheriff_flow_id());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getFallback_cta_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EmailChallenge$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSheriff_challenge() != null) {
                    SheriffChallenge.ADAPTER.encodeWithTag(writer, 1, (int) value.getSheriff_challenge());
                }
                if (!Intrinsics.areEqual(value.getSheriff_flow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSheriff_flow_id());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getFallback_cta_text());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EmailChallenge$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getFallback_cta_text());
                if (!Intrinsics.areEqual(value.getSheriff_flow_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSheriff_flow_id());
                }
                if (value.getSheriff_challenge() != null) {
                    SheriffChallenge.ADAPTER.encodeWithTag(writer, 1, (int) value.getSheriff_challenge());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EmailChallenge$ScreenParams redact(EmailChallenge$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SheriffChallenge sheriff_challenge = value.getSheriff_challenge();
                return EmailChallenge$ScreenParams.copy$default(value, sheriff_challenge != null ? SheriffChallenge.ADAPTER.redact(sheriff_challenge) : null, null, null, ByteString.EMPTY, 6, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EmailChallenge$ScreenParams decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SheriffChallenge sheriffChallengeDecode = null;
                String strDecode = "";
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EmailChallenge$ScreenParams(sheriffChallengeDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        sheriffChallengeDecode = SheriffChallenge.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
