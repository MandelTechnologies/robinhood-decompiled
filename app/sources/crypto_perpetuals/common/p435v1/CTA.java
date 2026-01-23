package crypto_perpetuals.common.p435v1;

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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CTA.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016JN\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/CTA;", "Lcom/squareup/wire/Message;", "", "action", "Lcrypto_perpetuals/common/v1/CTAAction;", "is_enabled", "", AnnotatedPrivateKey.LABEL, "", "logging_identifier", "sdui_component_type", "type", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/common/v1/CTAAction;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAction", "()Lcrypto_perpetuals/common/v1/CTAAction;", "()Z", "getLabel", "()Ljava/lang/String;", "getLogging_identifier", "getSdui_component_type", "getType", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CTA extends Message {

    @JvmField
    public static final ProtoAdapter<CTA> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.common.v1.CTAAction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CTAAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String sdui_component_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String type;

    public CTA() {
        this(null, false, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ CTA(CTAAction cTAAction, boolean z, String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cTAAction, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27808newBuilder();
    }

    public final CTAAction getAction() {
        return this.action;
    }

    /* renamed from: is_enabled, reason: from getter */
    public final boolean getIs_enabled() {
        return this.is_enabled;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final String getSdui_component_type() {
        return this.sdui_component_type;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTA(CTAAction cTAAction, boolean z, String label, String logging_identifier, String sdui_component_type, String type2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(sdui_component_type, "sdui_component_type");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.action = cTAAction;
        this.is_enabled = z;
        this.label = label;
        this.logging_identifier = logging_identifier;
        this.sdui_component_type = sdui_component_type;
        this.type = type2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27808newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CTA)) {
            return false;
        }
        CTA cta = (CTA) other;
        return Intrinsics.areEqual(unknownFields(), cta.unknownFields()) && Intrinsics.areEqual(this.action, cta.action) && this.is_enabled == cta.is_enabled && Intrinsics.areEqual(this.label, cta.label) && Intrinsics.areEqual(this.logging_identifier, cta.logging_identifier) && Intrinsics.areEqual(this.sdui_component_type, cta.sdui_component_type) && Intrinsics.areEqual(this.type, cta.type);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CTAAction cTAAction = this.action;
        int iHashCode2 = ((((((((((iHashCode + (cTAAction != null ? cTAAction.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_enabled)) * 37) + this.label.hashCode()) * 37) + this.logging_identifier.hashCode()) * 37) + this.sdui_component_type.hashCode()) * 37) + this.type.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CTAAction cTAAction = this.action;
        if (cTAAction != null) {
            arrayList.add("action=" + cTAAction);
        }
        arrayList.add("is_enabled=" + this.is_enabled);
        arrayList.add("label=" + Internal.sanitize(this.label));
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        arrayList.add("sdui_component_type=" + Internal.sanitize(this.sdui_component_type));
        arrayList.add("type=" + Internal.sanitize(this.type));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CTA{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CTA copy$default(CTA cta, CTAAction cTAAction, boolean z, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            cTAAction = cta.action;
        }
        if ((i & 2) != 0) {
            z = cta.is_enabled;
        }
        if ((i & 4) != 0) {
            str = cta.label;
        }
        if ((i & 8) != 0) {
            str2 = cta.logging_identifier;
        }
        if ((i & 16) != 0) {
            str3 = cta.sdui_component_type;
        }
        if ((i & 32) != 0) {
            str4 = cta.type;
        }
        if ((i & 64) != 0) {
            byteString = cta.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        String str6 = str3;
        String str7 = str;
        return cta.copy(cTAAction, z, str7, str2, str6, str5, byteString2);
    }

    public final CTA copy(CTAAction action, boolean is_enabled, String label, String logging_identifier, String sdui_component_type, String type2, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(sdui_component_type, "sdui_component_type");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CTA(action, is_enabled, label, logging_identifier, sdui_component_type, type2, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CTA.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CTA>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.common.v1.CTA$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CTA value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAction() != null) {
                    size += CTAAction.ADAPTER.encodedSizeWithTag(1, value.getAction());
                }
                if (value.getIs_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_enabled()));
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLabel());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getSdui_component_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSdui_component_type());
                }
                return !Intrinsics.areEqual(value.getType(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getType()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CTA value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAction() != null) {
                    CTAAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getAction());
                }
                if (value.getIs_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_enabled()));
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLabel());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getSdui_component_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSdui_component_type());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getType());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CTA value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getSdui_component_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSdui_component_type());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLabel());
                }
                if (value.getIs_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_enabled()));
                }
                if (value.getAction() != null) {
                    CTAAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getAction());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CTA redact(CTA value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CTAAction action = value.getAction();
                return CTA.copy$default(value, action != null ? CTAAction.ADAPTER.redact(action) : null, false, null, null, null, null, ByteString.EMPTY, 62, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CTA decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                CTAAction cTAActionDecode = null;
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                cTAActionDecode = CTAAction.ADAPTER.decode(reader);
                                break;
                            case 2:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CTA(cTAActionDecode, zBooleanValue, strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
