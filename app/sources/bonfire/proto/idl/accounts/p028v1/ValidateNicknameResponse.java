package bonfire.proto.idl.accounts.p028v1;

import bonfire.proto.idl.accounts.p028v1.ValidateNicknameResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ValidateNicknameResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'B9\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0019R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse;", "Lcom/squareup/wire/Message;", "", "", "Lbonfire/proto/idl/accounts/v1/WarningType;", "warnings", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning;", "message", "", "nickname", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/util/List;Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning;Ljava/lang/String;Lokio/ByteString;)Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning;", "getMessage", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning;", "Ljava/lang/String;", "getNickname", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "getWarnings$annotations", "()V", "Companion", "Warning", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ValidateNicknameResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ValidateNicknameResponse> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.accounts.v1.ValidateNicknameResponse$Warning#ADAPTER", schemaIndex = 1, tag = 2)
    private final Warning message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String nickname;

    @WireField(adapter = "bonfire.proto.idl.accounts.v1.WarningType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<WarningType> warnings;

    public ValidateNicknameResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8734newBuilder();
    }

    public /* synthetic */ ValidateNicknameResponse(List list, Warning warning, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : warning, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Warning getMessage() {
        return this.message;
    }

    public final String getNickname() {
        return this.nickname;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateNicknameResponse(List<? extends WarningType> warnings, Warning warning, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.message = warning;
        this.nickname = str;
        this.warnings = Internal.immutableCopyOf("warnings", warnings);
    }

    public final List<WarningType> getWarnings() {
        return this.warnings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8734newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidateNicknameResponse)) {
            return false;
        }
        ValidateNicknameResponse validateNicknameResponse = (ValidateNicknameResponse) other;
        return Intrinsics.areEqual(unknownFields(), validateNicknameResponse.unknownFields()) && Intrinsics.areEqual(this.warnings, validateNicknameResponse.warnings) && Intrinsics.areEqual(this.message, validateNicknameResponse.message) && Intrinsics.areEqual(this.nickname, validateNicknameResponse.nickname);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.warnings.hashCode()) * 37;
        Warning warning = this.message;
        int iHashCode2 = (iHashCode + (warning != null ? warning.hashCode() : 0)) * 37;
        String str = this.nickname;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.warnings.isEmpty()) {
            arrayList.add("warnings=" + this.warnings);
        }
        Warning warning = this.message;
        if (warning != null) {
            arrayList.add("message=" + warning);
        }
        String str = this.nickname;
        if (str != null) {
            arrayList.add("nickname=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateNicknameResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ValidateNicknameResponse copy$default(ValidateNicknameResponse validateNicknameResponse, List list, Warning warning, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = validateNicknameResponse.warnings;
        }
        if ((i & 2) != 0) {
            warning = validateNicknameResponse.message;
        }
        if ((i & 4) != 0) {
            str = validateNicknameResponse.nickname;
        }
        if ((i & 8) != 0) {
            byteString = validateNicknameResponse.unknownFields();
        }
        return validateNicknameResponse.copy(list, warning, str, byteString);
    }

    public final ValidateNicknameResponse copy(List<? extends WarningType> warnings, Warning message, String nickname, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidateNicknameResponse(warnings, message, nickname, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateNicknameResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidateNicknameResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.accounts.v1.ValidateNicknameResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidateNicknameResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + WarningType.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getWarnings()) + ValidateNicknameResponse.Warning.ADAPTER.encodedSizeWithTag(2, value.getMessage()) + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNickname());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidateNicknameResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                WarningType.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getWarnings());
                ValidateNicknameResponse.Warning.ADAPTER.encodeWithTag(writer, 2, (int) value.getMessage());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNickname());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidateNicknameResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNickname());
                ValidateNicknameResponse.Warning.ADAPTER.encodeWithTag(writer, 2, (int) value.getMessage());
                WarningType.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getWarnings());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ValidateNicknameResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                ValidateNicknameResponse.Warning warningDecode = null;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValidateNicknameResponse(arrayList, warningDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            WarningType.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        warningDecode = ValidateNicknameResponse.Warning.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateNicknameResponse redact(ValidateNicknameResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ValidateNicknameResponse.Warning message = value.getMessage();
                return ValidateNicknameResponse.copy$default(value, null, message != null ? ValidateNicknameResponse.Warning.ADAPTER.redact(message) : null, null, ByteString.EMPTY, 5, null);
            }
        };
    }

    /* compiled from: ValidateNicknameResponse.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning;", "Lcom/squareup/wire/Message;", "", "message", "", "severity", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity;Lokio/ByteString;)V", "getMessage", "()Ljava/lang/String;", "getSeverity", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Severity", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Warning extends Message {

        @JvmField
        public static final ProtoAdapter<Warning> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String message;

        @WireField(adapter = "bonfire.proto.idl.accounts.v1.ValidateNicknameResponse$Warning$Severity#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Severity severity;

        public Warning() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8735newBuilder();
        }

        public final String getMessage() {
            return this.message;
        }

        public /* synthetic */ Warning(String str, Severity severity, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Severity.SEVERITY_UNSPECIFIED : severity, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final Severity getSeverity() {
            return this.severity;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Warning(String message, Severity severity, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(severity, "severity");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.message = message;
            this.severity = severity;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8735newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Warning)) {
                return false;
            }
            Warning warning = (Warning) other;
            return Intrinsics.areEqual(unknownFields(), warning.unknownFields()) && Intrinsics.areEqual(this.message, warning.message) && this.severity == warning.severity;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.message.hashCode()) * 37) + this.severity.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("message=" + Internal.sanitize(this.message));
            arrayList.add("severity=" + this.severity);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Warning{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Warning copy$default(Warning warning, String str, Severity severity, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = warning.message;
            }
            if ((i & 2) != 0) {
                severity = warning.severity;
            }
            if ((i & 4) != 0) {
                byteString = warning.unknownFields();
            }
            return warning.copy(str, severity, byteString);
        }

        public final Warning copy(String message, Severity severity, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(severity, "severity");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Warning(message, severity, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Warning.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Warning>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.accounts.v1.ValidateNicknameResponse$Warning$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ValidateNicknameResponse.Warning value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getMessage(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMessage());
                    }
                    return value.getSeverity() != ValidateNicknameResponse.Warning.Severity.SEVERITY_UNSPECIFIED ? size + ValidateNicknameResponse.Warning.Severity.ADAPTER.encodedSizeWithTag(2, value.getSeverity()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ValidateNicknameResponse.Warning value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getMessage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage());
                    }
                    if (value.getSeverity() != ValidateNicknameResponse.Warning.Severity.SEVERITY_UNSPECIFIED) {
                        ValidateNicknameResponse.Warning.Severity.ADAPTER.encodeWithTag(writer, 2, (int) value.getSeverity());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ValidateNicknameResponse.Warning value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getSeverity() != ValidateNicknameResponse.Warning.Severity.SEVERITY_UNSPECIFIED) {
                        ValidateNicknameResponse.Warning.Severity.ADAPTER.encodeWithTag(writer, 2, (int) value.getSeverity());
                    }
                    if (Intrinsics.areEqual(value.getMessage(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public ValidateNicknameResponse.Warning decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ValidateNicknameResponse.Warning.Severity severityDecode = ValidateNicknameResponse.Warning.Severity.SEVERITY_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ValidateNicknameResponse.Warning(strDecode, severityDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                severityDecode = ValidateNicknameResponse.Warning.Severity.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ValidateNicknameResponse.Warning redact(ValidateNicknameResponse.Warning value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return ValidateNicknameResponse.Warning.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ValidateNicknameResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SEVERITY_UNSPECIFIED", "SEVERITY_ERROR", "SEVERITY_WARNING", "SEVERITY_INFO", "Companion", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Severity implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Severity[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Severity> ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Severity SEVERITY_ERROR;
            public static final Severity SEVERITY_INFO;
            public static final Severity SEVERITY_UNSPECIFIED;
            public static final Severity SEVERITY_WARNING;
            private final int value;

            private static final /* synthetic */ Severity[] $values() {
                return new Severity[]{SEVERITY_UNSPECIFIED, SEVERITY_ERROR, SEVERITY_WARNING, SEVERITY_INFO};
            }

            @JvmStatic
            public static final Severity fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Severity> getEntries() {
                return $ENTRIES;
            }

            private Severity(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Severity severity = new Severity("SEVERITY_UNSPECIFIED", 0, 0);
                SEVERITY_UNSPECIFIED = severity;
                SEVERITY_ERROR = new Severity("SEVERITY_ERROR", 1, 1);
                SEVERITY_WARNING = new Severity("SEVERITY_WARNING", 2, 2);
                SEVERITY_INFO = new Severity("SEVERITY_INFO", 3, 3);
                Severity[] severityArr$values = $values();
                $VALUES = severityArr$values;
                $ENTRIES = EnumEntries2.enumEntries(severityArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Severity.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Severity>(orCreateKotlinClass, syntax, severity) { // from class: bonfire.proto.idl.accounts.v1.ValidateNicknameResponse$Warning$Severity$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public ValidateNicknameResponse.Warning.Severity fromValue(int value) {
                        return ValidateNicknameResponse.Warning.Severity.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: ValidateNicknameResponse.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity;", "fromValue", "value", "", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Severity fromValue(int value) {
                    if (value == 0) {
                        return Severity.SEVERITY_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Severity.SEVERITY_ERROR;
                    }
                    if (value == 2) {
                        return Severity.SEVERITY_WARNING;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return Severity.SEVERITY_INFO;
                }
            }

            public static Severity valueOf(String str) {
                return (Severity) Enum.valueOf(Severity.class, str);
            }

            public static Severity[] values() {
                return (Severity[]) $VALUES.clone();
            }
        }
    }
}
