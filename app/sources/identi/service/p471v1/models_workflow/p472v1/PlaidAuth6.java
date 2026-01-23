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

/* compiled from: PlaidAuth.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B9\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001f\u0010\u0018¨\u0006!"}, m3636d2 = {"identi/service/v1/models_workflow/v1/PlaidAuth$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/PlaidAuth$ScreenParams;", "", "", "link_token", "fallback_cta_text", "fallback_heading", "fallback_subheading", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/PlaidAuth$ScreenParams;", "Ljava/lang/String;", "getLink_token", "getFallback_cta_text", "getFallback_heading", "getFallback_subheading", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: identi.service.v1.models_workflow.v1.PlaidAuth$ScreenParams, reason: use source file name */
/* loaded from: classes21.dex */
public final class PlaidAuth6 extends Message {

    @JvmField
    public static final ProtoAdapter<PlaidAuth6> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fallbackCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String fallback_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fallbackHeading", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String fallback_heading;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fallbackSubheading", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String fallback_subheading;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "linkToken", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String link_token;

    public PlaidAuth6() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ PlaidAuth6(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28370newBuilder();
    }

    public final String getLink_token() {
        return this.link_token;
    }

    public final String getFallback_cta_text() {
        return this.fallback_cta_text;
    }

    public final String getFallback_heading() {
        return this.fallback_heading;
    }

    public final String getFallback_subheading() {
        return this.fallback_subheading;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidAuth6(String link_token, String fallback_cta_text, String fallback_heading, String fallback_subheading, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(link_token, "link_token");
        Intrinsics.checkNotNullParameter(fallback_cta_text, "fallback_cta_text");
        Intrinsics.checkNotNullParameter(fallback_heading, "fallback_heading");
        Intrinsics.checkNotNullParameter(fallback_subheading, "fallback_subheading");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.link_token = link_token;
        this.fallback_cta_text = fallback_cta_text;
        this.fallback_heading = fallback_heading;
        this.fallback_subheading = fallback_subheading;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28370newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidAuth6)) {
            return false;
        }
        PlaidAuth6 plaidAuth6 = (PlaidAuth6) other;
        return Intrinsics.areEqual(unknownFields(), plaidAuth6.unknownFields()) && Intrinsics.areEqual(this.link_token, plaidAuth6.link_token) && Intrinsics.areEqual(this.fallback_cta_text, plaidAuth6.fallback_cta_text) && Intrinsics.areEqual(this.fallback_heading, plaidAuth6.fallback_heading) && Intrinsics.areEqual(this.fallback_subheading, plaidAuth6.fallback_subheading);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.link_token.hashCode()) * 37) + this.fallback_cta_text.hashCode()) * 37) + this.fallback_heading.hashCode()) * 37) + this.fallback_subheading.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("link_token=" + Internal.sanitize(this.link_token));
        arrayList.add("fallback_cta_text=" + Internal.sanitize(this.fallback_cta_text));
        arrayList.add("fallback_heading=" + Internal.sanitize(this.fallback_heading));
        arrayList.add("fallback_subheading=" + Internal.sanitize(this.fallback_subheading));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PlaidAuth6 copy$default(PlaidAuth6 plaidAuth6, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaidAuth6.link_token;
        }
        if ((i & 2) != 0) {
            str2 = plaidAuth6.fallback_cta_text;
        }
        if ((i & 4) != 0) {
            str3 = plaidAuth6.fallback_heading;
        }
        if ((i & 8) != 0) {
            str4 = plaidAuth6.fallback_subheading;
        }
        if ((i & 16) != 0) {
            byteString = plaidAuth6.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return plaidAuth6.copy(str, str2, str5, str4, byteString2);
    }

    public final PlaidAuth6 copy(String link_token, String fallback_cta_text, String fallback_heading, String fallback_subheading, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(link_token, "link_token");
        Intrinsics.checkNotNullParameter(fallback_cta_text, "fallback_cta_text");
        Intrinsics.checkNotNullParameter(fallback_heading, "fallback_heading");
        Intrinsics.checkNotNullParameter(fallback_subheading, "fallback_subheading");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidAuth6(link_token, fallback_cta_text, fallback_heading, fallback_subheading, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaidAuth6.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaidAuth6>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.PlaidAuth$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidAuth6 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLink_token(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLink_token());
                }
                if (!Intrinsics.areEqual(value.getFallback_cta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFallback_cta_text());
                }
                if (!Intrinsics.areEqual(value.getFallback_heading(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getFallback_heading());
                }
                return !Intrinsics.areEqual(value.getFallback_subheading(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getFallback_subheading()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidAuth6 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLink_token(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLink_token());
                }
                if (!Intrinsics.areEqual(value.getFallback_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFallback_cta_text());
                }
                if (!Intrinsics.areEqual(value.getFallback_heading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getFallback_heading());
                }
                if (!Intrinsics.areEqual(value.getFallback_subheading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getFallback_subheading());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidAuth6 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFallback_subheading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getFallback_subheading());
                }
                if (!Intrinsics.areEqual(value.getFallback_heading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getFallback_heading());
                }
                if (!Intrinsics.areEqual(value.getFallback_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFallback_cta_text());
                }
                if (Intrinsics.areEqual(value.getLink_token(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLink_token());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidAuth6 redact(PlaidAuth6 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PlaidAuth6.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidAuth6 decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PlaidAuth6(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
