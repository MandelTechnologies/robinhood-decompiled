package identi.service.p471v1.models_workflow.p472v1;

import com.robinhood.android.car.result.CarResultComposable2;
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

/* compiled from: UpdateApp.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"BC\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b \u0010\u0019R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b!\u0010\u0019¨\u0006#"}, m3636d2 = {"identi/service/v1/models_workflow/v1/UpdateApp$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/UpdateApp$ScreenParams;", "", "", "title", CarResultComposable2.BODY, "primary_cta_text", "primary_cta_deeplink", "secondary_cta_text", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/UpdateApp$ScreenParams;", "Ljava/lang/String;", "getTitle", "getBody", "getPrimary_cta_text", "getPrimary_cta_deeplink", "getSecondary_cta_text", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: identi.service.v1.models_workflow.v1.UpdateApp$ScreenParams, reason: use source file name */
/* loaded from: classes21.dex */
public final class UpdateApp5 extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateApp5> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCtaDeeplink", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String primary_cta_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String secondary_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public UpdateApp5() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ UpdateApp5(String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28417newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getPrimary_cta_text() {
        return this.primary_cta_text;
    }

    public final String getPrimary_cta_deeplink() {
        return this.primary_cta_deeplink;
    }

    public final String getSecondary_cta_text() {
        return this.secondary_cta_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateApp5(String title, String body, String primary_cta_text, String primary_cta_deeplink, String secondary_cta_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
        Intrinsics.checkNotNullParameter(primary_cta_deeplink, "primary_cta_deeplink");
        Intrinsics.checkNotNullParameter(secondary_cta_text, "secondary_cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.body = body;
        this.primary_cta_text = primary_cta_text;
        this.primary_cta_deeplink = primary_cta_deeplink;
        this.secondary_cta_text = secondary_cta_text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28417newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateApp5)) {
            return false;
        }
        UpdateApp5 updateApp5 = (UpdateApp5) other;
        return Intrinsics.areEqual(unknownFields(), updateApp5.unknownFields()) && Intrinsics.areEqual(this.title, updateApp5.title) && Intrinsics.areEqual(this.body, updateApp5.body) && Intrinsics.areEqual(this.primary_cta_text, updateApp5.primary_cta_text) && Intrinsics.areEqual(this.primary_cta_deeplink, updateApp5.primary_cta_deeplink) && Intrinsics.areEqual(this.secondary_cta_text, updateApp5.secondary_cta_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.body.hashCode()) * 37) + this.primary_cta_text.hashCode()) * 37) + this.primary_cta_deeplink.hashCode()) * 37) + this.secondary_cta_text.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("body=" + Internal.sanitize(this.body));
        arrayList.add("primary_cta_text=" + Internal.sanitize(this.primary_cta_text));
        arrayList.add("primary_cta_deeplink=" + Internal.sanitize(this.primary_cta_deeplink));
        arrayList.add("secondary_cta_text=" + Internal.sanitize(this.secondary_cta_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateApp5 copy$default(UpdateApp5 updateApp5, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateApp5.title;
        }
        if ((i & 2) != 0) {
            str2 = updateApp5.body;
        }
        if ((i & 4) != 0) {
            str3 = updateApp5.primary_cta_text;
        }
        if ((i & 8) != 0) {
            str4 = updateApp5.primary_cta_deeplink;
        }
        if ((i & 16) != 0) {
            str5 = updateApp5.secondary_cta_text;
        }
        if ((i & 32) != 0) {
            byteString = updateApp5.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        return updateApp5.copy(str, str2, str3, str4, str6, byteString2);
    }

    public final UpdateApp5 copy(String title, String body, String primary_cta_text, String primary_cta_deeplink, String secondary_cta_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
        Intrinsics.checkNotNullParameter(primary_cta_deeplink, "primary_cta_deeplink");
        Intrinsics.checkNotNullParameter(secondary_cta_text, "secondary_cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateApp5(title, body, primary_cta_text, primary_cta_deeplink, secondary_cta_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateApp5.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateApp5>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.UpdateApp$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateApp5 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBody());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrimary_cta_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_deeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPrimary_cta_deeplink());
                }
                return !Intrinsics.areEqual(value.getSecondary_cta_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSecondary_cta_text()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateApp5 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_cta_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrimary_cta_deeplink());
                }
                if (!Intrinsics.areEqual(value.getSecondary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSecondary_cta_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateApp5 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSecondary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSecondary_cta_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrimary_cta_deeplink());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_cta_text());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateApp5 redact(UpdateApp5 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateApp5.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateApp5 decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateApp5(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
