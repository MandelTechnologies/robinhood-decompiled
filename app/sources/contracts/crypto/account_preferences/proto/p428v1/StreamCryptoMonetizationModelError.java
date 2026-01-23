package contracts.crypto.account_preferences.proto.p428v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import contracts.crypto.account_preferences.proto.p428v1.StreamCryptoMonetizationModelError;
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

/* compiled from: StreamCryptoMonetizationModelError.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError;", "Lcom/squareup/wire/Message;", "", "error_unspecified", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$ErrorUnspecified;", "no_crypto_account", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$NoCryptoAccount;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$ErrorUnspecified;Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$NoCryptoAccount;Lokio/ByteString;)V", "getError_unspecified", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$ErrorUnspecified;", "getNo_crypto_account", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$NoCryptoAccount;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ErrorUnspecified", "NoCryptoAccount", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamCryptoMonetizationModelError extends Message {

    @JvmField
    public static final ProtoAdapter<StreamCryptoMonetizationModelError> ADAPTER;

    @WireField(adapter = "contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelError$ErrorUnspecified#ADAPTER", jsonName = "errorUnspecified", oneofName = "type", schemaIndex = 0, tag = 1)
    private final ErrorUnspecified error_unspecified;

    @WireField(adapter = "contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelError$NoCryptoAccount#ADAPTER", jsonName = "noCryptoAccount", oneofName = "type", schemaIndex = 1, tag = 2)
    private final NoCryptoAccount no_crypto_account;

    public StreamCryptoMonetizationModelError() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27621newBuilder();
    }

    public final ErrorUnspecified getError_unspecified() {
        return this.error_unspecified;
    }

    public final NoCryptoAccount getNo_crypto_account() {
        return this.no_crypto_account;
    }

    public /* synthetic */ StreamCryptoMonetizationModelError(ErrorUnspecified errorUnspecified, NoCryptoAccount noCryptoAccount, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : errorUnspecified, (i & 2) != 0 ? null : noCryptoAccount, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamCryptoMonetizationModelError(ErrorUnspecified errorUnspecified, NoCryptoAccount noCryptoAccount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.error_unspecified = errorUnspecified;
        this.no_crypto_account = noCryptoAccount;
        if (Internal.countNonNull(errorUnspecified, noCryptoAccount) > 1) {
            throw new IllegalArgumentException("At most one of error_unspecified, no_crypto_account may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27621newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamCryptoMonetizationModelError)) {
            return false;
        }
        StreamCryptoMonetizationModelError streamCryptoMonetizationModelError = (StreamCryptoMonetizationModelError) other;
        return Intrinsics.areEqual(unknownFields(), streamCryptoMonetizationModelError.unknownFields()) && Intrinsics.areEqual(this.error_unspecified, streamCryptoMonetizationModelError.error_unspecified) && Intrinsics.areEqual(this.no_crypto_account, streamCryptoMonetizationModelError.no_crypto_account);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ErrorUnspecified errorUnspecified = this.error_unspecified;
        int iHashCode2 = (iHashCode + (errorUnspecified != null ? errorUnspecified.hashCode() : 0)) * 37;
        NoCryptoAccount noCryptoAccount = this.no_crypto_account;
        int iHashCode3 = iHashCode2 + (noCryptoAccount != null ? noCryptoAccount.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ErrorUnspecified errorUnspecified = this.error_unspecified;
        if (errorUnspecified != null) {
            arrayList.add("error_unspecified=" + errorUnspecified);
        }
        NoCryptoAccount noCryptoAccount = this.no_crypto_account;
        if (noCryptoAccount != null) {
            arrayList.add("no_crypto_account=" + noCryptoAccount);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamCryptoMonetizationModelError{", "}", 0, null, null, 56, null);
    }

    public final StreamCryptoMonetizationModelError copy(ErrorUnspecified error_unspecified, NoCryptoAccount no_crypto_account, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamCryptoMonetizationModelError(error_unspecified, no_crypto_account, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamCryptoMonetizationModelError.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamCryptoMonetizationModelError>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelError$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamCryptoMonetizationModelError value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + StreamCryptoMonetizationModelError.ErrorUnspecified.ADAPTER.encodedSizeWithTag(1, value.getError_unspecified()) + StreamCryptoMonetizationModelError.NoCryptoAccount.ADAPTER.encodedSizeWithTag(2, value.getNo_crypto_account());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamCryptoMonetizationModelError value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                StreamCryptoMonetizationModelError.ErrorUnspecified.ADAPTER.encodeWithTag(writer, 1, (int) value.getError_unspecified());
                StreamCryptoMonetizationModelError.NoCryptoAccount.ADAPTER.encodeWithTag(writer, 2, (int) value.getNo_crypto_account());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamCryptoMonetizationModelError value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                StreamCryptoMonetizationModelError.NoCryptoAccount.ADAPTER.encodeWithTag(writer, 2, (int) value.getNo_crypto_account());
                StreamCryptoMonetizationModelError.ErrorUnspecified.ADAPTER.encodeWithTag(writer, 1, (int) value.getError_unspecified());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoMonetizationModelError redact(StreamCryptoMonetizationModelError value) {
                Intrinsics.checkNotNullParameter(value, "value");
                StreamCryptoMonetizationModelError.ErrorUnspecified error_unspecified = value.getError_unspecified();
                StreamCryptoMonetizationModelError.ErrorUnspecified errorUnspecifiedRedact = error_unspecified != null ? StreamCryptoMonetizationModelError.ErrorUnspecified.ADAPTER.redact(error_unspecified) : null;
                StreamCryptoMonetizationModelError.NoCryptoAccount no_crypto_account = value.getNo_crypto_account();
                return value.copy(errorUnspecifiedRedact, no_crypto_account != null ? StreamCryptoMonetizationModelError.NoCryptoAccount.ADAPTER.redact(no_crypto_account) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoMonetizationModelError decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                StreamCryptoMonetizationModelError.ErrorUnspecified errorUnspecifiedDecode = null;
                StreamCryptoMonetizationModelError.NoCryptoAccount noCryptoAccountDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamCryptoMonetizationModelError(errorUnspecifiedDecode, noCryptoAccountDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        errorUnspecifiedDecode = StreamCryptoMonetizationModelError.ErrorUnspecified.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        noCryptoAccountDecode = StreamCryptoMonetizationModelError.NoCryptoAccount.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: StreamCryptoMonetizationModelError.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$ErrorUnspecified;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorUnspecified extends Message {

        @JvmField
        public static final ProtoAdapter<ErrorUnspecified> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public ErrorUnspecified() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27622newBuilder();
        }

        public /* synthetic */ ErrorUnspecified(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorUnspecified(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27622newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof ErrorUnspecified) && Intrinsics.areEqual(unknownFields(), ((ErrorUnspecified) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "ErrorUnspecified{}";
        }

        public final ErrorUnspecified copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ErrorUnspecified(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ErrorUnspecified.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ErrorUnspecified>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelError$ErrorUnspecified$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(StreamCryptoMonetizationModelError.ErrorUnspecified value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, StreamCryptoMonetizationModelError.ErrorUnspecified value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, StreamCryptoMonetizationModelError.ErrorUnspecified value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamCryptoMonetizationModelError.ErrorUnspecified redact(StreamCryptoMonetizationModelError.ErrorUnspecified value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public StreamCryptoMonetizationModelError.ErrorUnspecified decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new StreamCryptoMonetizationModelError.ErrorUnspecified(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: StreamCryptoMonetizationModelError.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError$NoCryptoAccount;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NoCryptoAccount extends Message {

        @JvmField
        public static final ProtoAdapter<NoCryptoAccount> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public NoCryptoAccount() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27623newBuilder();
        }

        public /* synthetic */ NoCryptoAccount(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoCryptoAccount(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27623newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof NoCryptoAccount) && Intrinsics.areEqual(unknownFields(), ((NoCryptoAccount) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "NoCryptoAccount{}";
        }

        public final NoCryptoAccount copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new NoCryptoAccount(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NoCryptoAccount.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<NoCryptoAccount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelError$NoCryptoAccount$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(StreamCryptoMonetizationModelError.NoCryptoAccount value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, StreamCryptoMonetizationModelError.NoCryptoAccount value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, StreamCryptoMonetizationModelError.NoCryptoAccount value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamCryptoMonetizationModelError.NoCryptoAccount redact(StreamCryptoMonetizationModelError.NoCryptoAccount value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public StreamCryptoMonetizationModelError.NoCryptoAccount decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new StreamCryptoMonetizationModelError.NoCryptoAccount(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }
}
