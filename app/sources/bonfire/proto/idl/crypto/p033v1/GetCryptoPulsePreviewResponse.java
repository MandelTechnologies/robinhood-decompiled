package bonfire.proto.idl.crypto.p033v1;

import bonfire.proto.idl.copilot.p032v1.InstrumentDigestV2Response;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewResponse;
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

/* compiled from: GetCryptoPulsePreviewResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,-BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010\u001cR\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse;", "Lcom/squareup/wire/Message;", "", "", "title", "subtitle", "text", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction;", "tap_action", "", "has_signed_agreement", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction;ZLokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction;ZLokio/ByteString;)Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse;", "Ljava/lang/String;", "getTitle", "getSubtitle", "getText", "Lj$/time/Instant;", "getUpdated_at", "()Lj$/time/Instant;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction;", "getTap_action", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction;", "Z", "getHas_signed_agreement", "()Z", "Companion", "TapAction", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetCryptoPulsePreviewResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoPulsePreviewResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSignedAgreement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean has_signed_agreement;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponse$TapAction#ADAPTER", jsonName = "tapAction", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final TapAction tap_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant updated_at;

    public GetCryptoPulsePreviewResponse() {
        this(null, null, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ GetCryptoPulsePreviewResponse(String str, String str2, String str3, Instant instant, TapAction tapAction, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : tapAction, (i & 32) != 0 ? false : z, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8926newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getText() {
        return this.text;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final TapAction getTap_action() {
        return this.tap_action;
    }

    public final boolean getHas_signed_agreement() {
        return this.has_signed_agreement;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoPulsePreviewResponse(String title, String subtitle, String text, Instant instant, TapAction tapAction, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.text = text;
        this.updated_at = instant;
        this.tap_action = tapAction;
        this.has_signed_agreement = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8926newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoPulsePreviewResponse)) {
            return false;
        }
        GetCryptoPulsePreviewResponse getCryptoPulsePreviewResponse = (GetCryptoPulsePreviewResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoPulsePreviewResponse.unknownFields()) && Intrinsics.areEqual(this.title, getCryptoPulsePreviewResponse.title) && Intrinsics.areEqual(this.subtitle, getCryptoPulsePreviewResponse.subtitle) && Intrinsics.areEqual(this.text, getCryptoPulsePreviewResponse.text) && Intrinsics.areEqual(this.updated_at, getCryptoPulsePreviewResponse.updated_at) && Intrinsics.areEqual(this.tap_action, getCryptoPulsePreviewResponse.tap_action) && this.has_signed_agreement == getCryptoPulsePreviewResponse.has_signed_agreement;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.text.hashCode()) * 37;
        Instant instant = this.updated_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int iHashCode3 = ((iHashCode2 + (tapAction != null ? tapAction.hashCode() : 0)) * 37) + Boolean.hashCode(this.has_signed_agreement);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("text=" + Internal.sanitize(this.text));
        Instant instant = this.updated_at;
        if (instant != null) {
            arrayList.add("updated_at=" + instant);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            arrayList.add("tap_action=" + tapAction);
        }
        arrayList.add("has_signed_agreement=" + this.has_signed_agreement);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoPulsePreviewResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCryptoPulsePreviewResponse copy$default(GetCryptoPulsePreviewResponse getCryptoPulsePreviewResponse, String str, String str2, String str3, Instant instant, TapAction tapAction, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCryptoPulsePreviewResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = getCryptoPulsePreviewResponse.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = getCryptoPulsePreviewResponse.text;
        }
        if ((i & 8) != 0) {
            instant = getCryptoPulsePreviewResponse.updated_at;
        }
        if ((i & 16) != 0) {
            tapAction = getCryptoPulsePreviewResponse.tap_action;
        }
        if ((i & 32) != 0) {
            z = getCryptoPulsePreviewResponse.has_signed_agreement;
        }
        if ((i & 64) != 0) {
            byteString = getCryptoPulsePreviewResponse.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        TapAction tapAction2 = tapAction;
        String str4 = str3;
        return getCryptoPulsePreviewResponse.copy(str, str2, str4, instant, tapAction2, z2, byteString2);
    }

    public final GetCryptoPulsePreviewResponse copy(String title, String subtitle, String text, Instant updated_at, TapAction tap_action, boolean has_signed_agreement, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoPulsePreviewResponse(title, subtitle, text, updated_at, tap_action, has_signed_agreement, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoPulsePreviewResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoPulsePreviewResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoPulsePreviewResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getText());
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getUpdated_at());
                }
                if (value.getTap_action() != null) {
                    size += GetCryptoPulsePreviewResponse.TapAction.ADAPTER.encodedSizeWithTag(5, value.getTap_action());
                }
                return value.getHas_signed_agreement() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getHas_signed_agreement())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoPulsePreviewResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getText());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getUpdated_at());
                }
                if (value.getTap_action() != null) {
                    GetCryptoPulsePreviewResponse.TapAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getTap_action());
                }
                if (value.getHas_signed_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getHas_signed_agreement()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoPulsePreviewResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHas_signed_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getHas_signed_agreement()));
                }
                if (value.getTap_action() != null) {
                    GetCryptoPulsePreviewResponse.TapAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getTap_action());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getText());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoPulsePreviewResponse redact(GetCryptoPulsePreviewResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant updated_at = value.getUpdated_at();
                Instant instantRedact = updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null;
                GetCryptoPulsePreviewResponse.TapAction tap_action = value.getTap_action();
                return GetCryptoPulsePreviewResponse.copy$default(value, null, null, null, instantRedact, tap_action != null ? GetCryptoPulsePreviewResponse.TapAction.ADAPTER.redact(tap_action) : null, false, ByteString.EMPTY, 39, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoPulsePreviewResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                GetCryptoPulsePreviewResponse.TapAction tapActionDecode = null;
                boolean zBooleanValue = false;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                tapActionDecode = GetCryptoPulsePreviewResponse.TapAction.ADAPTER.decode(reader);
                                break;
                            case 6:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetCryptoPulsePreviewResponse(strDecode, strDecode2, strDecode3, instantDecode, tapActionDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }

    /* compiled from: GetCryptoPulsePreviewResponse.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction;", "Lcom/squareup/wire/Message;", "", "show_digest_details", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2Response;", "show_feed", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction$ShowFeed;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2Response;Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction$ShowFeed;Lokio/ByteString;)V", "getShow_digest_details", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2Response;", "getShow_feed", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction$ShowFeed;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ShowFeed", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TapAction extends Message {

        @JvmField
        public static final ProtoAdapter<TapAction> ADAPTER;

        @WireField(adapter = "bonfire.proto.idl.copilot.v1.InstrumentDigestV2Response#ADAPTER", jsonName = "showDigestDetails", oneofName = "type", schemaIndex = 0, tag = 1)
        private final InstrumentDigestV2Response show_digest_details;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponse$TapAction$ShowFeed#ADAPTER", jsonName = "showFeed", oneofName = "type", schemaIndex = 1, tag = 2)
        private final ShowFeed show_feed;

        public TapAction() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8927newBuilder();
        }

        public final InstrumentDigestV2Response getShow_digest_details() {
            return this.show_digest_details;
        }

        public final ShowFeed getShow_feed() {
            return this.show_feed;
        }

        public /* synthetic */ TapAction(InstrumentDigestV2Response instrumentDigestV2Response, ShowFeed showFeed, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : instrumentDigestV2Response, (i & 2) != 0 ? null : showFeed, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TapAction(InstrumentDigestV2Response instrumentDigestV2Response, ShowFeed showFeed, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.show_digest_details = instrumentDigestV2Response;
            this.show_feed = showFeed;
            if (Internal.countNonNull(instrumentDigestV2Response, showFeed) > 1) {
                throw new IllegalArgumentException("At most one of show_digest_details, show_feed may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8927newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TapAction)) {
                return false;
            }
            TapAction tapAction = (TapAction) other;
            return Intrinsics.areEqual(unknownFields(), tapAction.unknownFields()) && Intrinsics.areEqual(this.show_digest_details, tapAction.show_digest_details) && Intrinsics.areEqual(this.show_feed, tapAction.show_feed);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            InstrumentDigestV2Response instrumentDigestV2Response = this.show_digest_details;
            int iHashCode2 = (iHashCode + (instrumentDigestV2Response != null ? instrumentDigestV2Response.hashCode() : 0)) * 37;
            ShowFeed showFeed = this.show_feed;
            int iHashCode3 = iHashCode2 + (showFeed != null ? showFeed.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            InstrumentDigestV2Response instrumentDigestV2Response = this.show_digest_details;
            if (instrumentDigestV2Response != null) {
                arrayList.add("show_digest_details=" + instrumentDigestV2Response);
            }
            ShowFeed showFeed = this.show_feed;
            if (showFeed != null) {
                arrayList.add("show_feed=" + showFeed);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TapAction{", "}", 0, null, null, 56, null);
        }

        public final TapAction copy(InstrumentDigestV2Response show_digest_details, ShowFeed show_feed, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TapAction(show_digest_details, show_feed, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TapAction.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TapAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponse$TapAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetCryptoPulsePreviewResponse.TapAction value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + InstrumentDigestV2Response.ADAPTER.encodedSizeWithTag(1, value.getShow_digest_details()) + GetCryptoPulsePreviewResponse.TapAction.ShowFeed.ADAPTER.encodedSizeWithTag(2, value.getShow_feed());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetCryptoPulsePreviewResponse.TapAction value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    InstrumentDigestV2Response.ADAPTER.encodeWithTag(writer, 1, (int) value.getShow_digest_details());
                    GetCryptoPulsePreviewResponse.TapAction.ShowFeed.ADAPTER.encodeWithTag(writer, 2, (int) value.getShow_feed());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetCryptoPulsePreviewResponse.TapAction value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    GetCryptoPulsePreviewResponse.TapAction.ShowFeed.ADAPTER.encodeWithTag(writer, 2, (int) value.getShow_feed());
                    InstrumentDigestV2Response.ADAPTER.encodeWithTag(writer, 1, (int) value.getShow_digest_details());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetCryptoPulsePreviewResponse.TapAction redact(GetCryptoPulsePreviewResponse.TapAction value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    InstrumentDigestV2Response show_digest_details = value.getShow_digest_details();
                    InstrumentDigestV2Response instrumentDigestV2ResponseRedact = show_digest_details != null ? InstrumentDigestV2Response.ADAPTER.redact(show_digest_details) : null;
                    GetCryptoPulsePreviewResponse.TapAction.ShowFeed show_feed = value.getShow_feed();
                    return value.copy(instrumentDigestV2ResponseRedact, show_feed != null ? GetCryptoPulsePreviewResponse.TapAction.ShowFeed.ADAPTER.redact(show_feed) : null, ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetCryptoPulsePreviewResponse.TapAction decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    InstrumentDigestV2Response instrumentDigestV2ResponseDecode = null;
                    GetCryptoPulsePreviewResponse.TapAction.ShowFeed showFeedDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetCryptoPulsePreviewResponse.TapAction(instrumentDigestV2ResponseDecode, showFeedDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            instrumentDigestV2ResponseDecode = InstrumentDigestV2Response.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            showFeedDecode = GetCryptoPulsePreviewResponse.TapAction.ShowFeed.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* compiled from: GetCryptoPulsePreviewResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction$ShowFeed;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ShowFeed extends Message {

            @JvmField
            public static final ProtoAdapter<ShowFeed> ADAPTER;

            /* JADX WARN: Multi-variable type inference failed */
            public ShowFeed() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m8928newBuilder();
            }

            public /* synthetic */ ShowFeed(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowFeed(ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m8928newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof ShowFeed) && Intrinsics.areEqual(unknownFields(), ((ShowFeed) other).unknownFields());
            }

            public int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                return "ShowFeed{}";
            }

            public final ShowFeed copy(ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new ShowFeed(unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ShowFeed.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<ShowFeed>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponse$TapAction$ShowFeed$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(GetCryptoPulsePreviewResponse.TapAction.ShowFeed value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, GetCryptoPulsePreviewResponse.TapAction.ShowFeed value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, GetCryptoPulsePreviewResponse.TapAction.ShowFeed value) {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoPulsePreviewResponse.TapAction.ShowFeed redact(GetCryptoPulsePreviewResponse.TapAction.ShowFeed value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.copy(ByteString.EMPTY);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoPulsePreviewResponse.TapAction.ShowFeed decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag != -1) {
                                reader.readUnknownField(iNextTag);
                            } else {
                                return new GetCryptoPulsePreviewResponse.TapAction.ShowFeed(reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                        }
                    }
                };
            }
        }
    }
}
