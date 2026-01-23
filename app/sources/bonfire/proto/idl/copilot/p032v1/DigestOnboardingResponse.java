package bonfire.proto.idl.copilot.p032v1;

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

/* compiled from: DigestOnboardingResponse.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JN\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponse;", "Lcom/squareup/wire/Message;", "", "splash_title", "", "splash_description", "splash_disclosure", "has_signed_agreement", "", "has_gold", "is_gold_required", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLokio/ByteString;)V", "getSplash_title", "()Ljava/lang/String;", "getSplash_description", "getSplash_disclosure", "getHas_signed_agreement", "()Z", "getHas_gold", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class DigestOnboardingResponse extends Message {

    @JvmField
    public static final ProtoAdapter<DigestOnboardingResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasGold", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean has_gold;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSignedAgreement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean has_signed_agreement;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isGoldRequired", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_gold_required;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "splashDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String splash_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "splashDisclosure", schemaIndex = 2, tag = 3)
    private final String splash_disclosure;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "splashTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String splash_title;

    public DigestOnboardingResponse() {
        this(null, null, null, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ DigestOnboardingResponse(String str, String str2, String str3, boolean z, boolean z2, boolean z3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8849newBuilder();
    }

    public final String getSplash_title() {
        return this.splash_title;
    }

    public final String getSplash_description() {
        return this.splash_description;
    }

    public final String getSplash_disclosure() {
        return this.splash_disclosure;
    }

    public final boolean getHas_signed_agreement() {
        return this.has_signed_agreement;
    }

    public final boolean getHas_gold() {
        return this.has_gold;
    }

    /* renamed from: is_gold_required, reason: from getter */
    public final boolean getIs_gold_required() {
        return this.is_gold_required;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigestOnboardingResponse(String splash_title, String splash_description, String str, boolean z, boolean z2, boolean z3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(splash_title, "splash_title");
        Intrinsics.checkNotNullParameter(splash_description, "splash_description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.splash_title = splash_title;
        this.splash_description = splash_description;
        this.splash_disclosure = str;
        this.has_signed_agreement = z;
        this.has_gold = z2;
        this.is_gold_required = z3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8849newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DigestOnboardingResponse)) {
            return false;
        }
        DigestOnboardingResponse digestOnboardingResponse = (DigestOnboardingResponse) other;
        return Intrinsics.areEqual(unknownFields(), digestOnboardingResponse.unknownFields()) && Intrinsics.areEqual(this.splash_title, digestOnboardingResponse.splash_title) && Intrinsics.areEqual(this.splash_description, digestOnboardingResponse.splash_description) && Intrinsics.areEqual(this.splash_disclosure, digestOnboardingResponse.splash_disclosure) && this.has_signed_agreement == digestOnboardingResponse.has_signed_agreement && this.has_gold == digestOnboardingResponse.has_gold && this.is_gold_required == digestOnboardingResponse.is_gold_required;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.splash_title.hashCode()) * 37) + this.splash_description.hashCode()) * 37;
        String str = this.splash_disclosure;
        int iHashCode2 = ((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.has_signed_agreement)) * 37) + Boolean.hashCode(this.has_gold)) * 37) + Boolean.hashCode(this.is_gold_required);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("splash_title=" + Internal.sanitize(this.splash_title));
        arrayList.add("splash_description=" + Internal.sanitize(this.splash_description));
        String str = this.splash_disclosure;
        if (str != null) {
            arrayList.add("splash_disclosure=" + Internal.sanitize(str));
        }
        arrayList.add("has_signed_agreement=" + this.has_signed_agreement);
        arrayList.add("has_gold=" + this.has_gold);
        arrayList.add("is_gold_required=" + this.is_gold_required);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DigestOnboardingResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DigestOnboardingResponse copy$default(DigestOnboardingResponse digestOnboardingResponse, String str, String str2, String str3, boolean z, boolean z2, boolean z3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = digestOnboardingResponse.splash_title;
        }
        if ((i & 2) != 0) {
            str2 = digestOnboardingResponse.splash_description;
        }
        if ((i & 4) != 0) {
            str3 = digestOnboardingResponse.splash_disclosure;
        }
        if ((i & 8) != 0) {
            z = digestOnboardingResponse.has_signed_agreement;
        }
        if ((i & 16) != 0) {
            z2 = digestOnboardingResponse.has_gold;
        }
        if ((i & 32) != 0) {
            z3 = digestOnboardingResponse.is_gold_required;
        }
        if ((i & 64) != 0) {
            byteString = digestOnboardingResponse.unknownFields();
        }
        boolean z4 = z3;
        ByteString byteString2 = byteString;
        boolean z5 = z2;
        String str4 = str3;
        return digestOnboardingResponse.copy(str, str2, str4, z, z5, z4, byteString2);
    }

    public final DigestOnboardingResponse copy(String splash_title, String splash_description, String splash_disclosure, boolean has_signed_agreement, boolean has_gold, boolean is_gold_required, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(splash_title, "splash_title");
        Intrinsics.checkNotNullParameter(splash_description, "splash_description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DigestOnboardingResponse(splash_title, splash_description, splash_disclosure, has_signed_agreement, has_gold, is_gold_required, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DigestOnboardingResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DigestOnboardingResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.DigestOnboardingResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DigestOnboardingResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSplash_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSplash_title());
                }
                if (!Intrinsics.areEqual(value.getSplash_description(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSplash_description());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSplash_disclosure());
                if (value.getHas_signed_agreement()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getHas_signed_agreement()));
                }
                if (value.getHas_gold()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getHas_gold()));
                }
                return value.getIs_gold_required() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_gold_required())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DigestOnboardingResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSplash_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSplash_title());
                }
                if (!Intrinsics.areEqual(value.getSplash_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSplash_description());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSplash_disclosure());
                if (value.getHas_signed_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getHas_signed_agreement()));
                }
                if (value.getHas_gold()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getHas_gold()));
                }
                if (value.getIs_gold_required()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_gold_required()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DigestOnboardingResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_gold_required()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_gold_required()));
                }
                if (value.getHas_gold()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getHas_gold()));
                }
                if (value.getHas_signed_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getHas_signed_agreement()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSplash_disclosure());
                if (!Intrinsics.areEqual(value.getSplash_description(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSplash_description());
                }
                if (Intrinsics.areEqual(value.getSplash_title(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getSplash_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DigestOnboardingResponse redact(DigestOnboardingResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DigestOnboardingResponse.copy$default(value, null, null, null, false, false, false, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DigestOnboardingResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                String strDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new DigestOnboardingResponse(strDecode, strDecode3, strDecode2, zBooleanValue, zBooleanValue2, zBooleanValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
