package options_product.service;

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
import java.io.IOException;
import java.util.ArrayList;
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
import options_product.service.FailureRequestMetadata;

/* compiled from: FailureRequestMetadata.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Loptions_product/service/FailureRequestMetadata;", "Lcom/squareup/wire/Message;", "", "failure_context", "Loptions_product/service/FailureRequestMetadata$FailureContext;", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/FailureRequestMetadata$FailureContext;Lokio/ByteString;)V", "getFailure_context", "()Loptions_product/service/FailureRequestMetadata$FailureContext;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "FailureContext", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class FailureRequestMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<FailureRequestMetadata> ADAPTER;

    @WireField(adapter = "options_product.service.FailureRequestMetadata$FailureContext#ADAPTER", jsonName = "failureContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FailureContext failure_context;

    /* JADX WARN: Multi-variable type inference failed */
    public FailureRequestMetadata() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29482newBuilder();
    }

    public final FailureContext getFailure_context() {
        return this.failure_context;
    }

    public /* synthetic */ FailureRequestMetadata(FailureContext failureContext, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FailureContext.FAILURE_CONTEXT_UNSPECIFIED : failureContext, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailureRequestMetadata(FailureContext failure_context, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(failure_context, "failure_context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.failure_context = failure_context;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29482newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FailureRequestMetadata)) {
            return false;
        }
        FailureRequestMetadata failureRequestMetadata = (FailureRequestMetadata) other;
        return Intrinsics.areEqual(unknownFields(), failureRequestMetadata.unknownFields()) && this.failure_context == failureRequestMetadata.failure_context;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.failure_context.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("failure_context=" + this.failure_context);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FailureRequestMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FailureRequestMetadata copy$default(FailureRequestMetadata failureRequestMetadata, FailureContext failureContext, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            failureContext = failureRequestMetadata.failure_context;
        }
        if ((i & 2) != 0) {
            byteString = failureRequestMetadata.unknownFields();
        }
        return failureRequestMetadata.copy(failureContext, byteString);
    }

    public final FailureRequestMetadata copy(FailureContext failure_context, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(failure_context, "failure_context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FailureRequestMetadata(failure_context, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FailureRequestMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FailureRequestMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.FailureRequestMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FailureRequestMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getFailure_context() != FailureRequestMetadata.FailureContext.FAILURE_CONTEXT_UNSPECIFIED ? size + FailureRequestMetadata.FailureContext.ADAPTER.encodedSizeWithTag(1, value.getFailure_context()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FailureRequestMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getFailure_context() != FailureRequestMetadata.FailureContext.FAILURE_CONTEXT_UNSPECIFIED) {
                    FailureRequestMetadata.FailureContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getFailure_context());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FailureRequestMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFailure_context() != FailureRequestMetadata.FailureContext.FAILURE_CONTEXT_UNSPECIFIED) {
                    FailureRequestMetadata.FailureContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getFailure_context());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FailureRequestMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FailureRequestMetadata.FailureContext failureContextDecode = FailureRequestMetadata.FailureContext.FAILURE_CONTEXT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FailureRequestMetadata(failureContextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            failureContextDecode = FailureRequestMetadata.FailureContext.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FailureRequestMetadata redact(FailureRequestMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FailureRequestMetadata.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FailureRequestMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Loptions_product/service/FailureRequestMetadata$FailureContext;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FAILURE_CONTEXT_UNSPECIFIED", "FAILURE_CONTEXT_UK_KNOWLEDGE_TEST_RETRY", "FAILURE_CONTEXT_NOT_SUITABLE_IP", "FAILURE_CONTEXT_RHSG_CAR_RETRY", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class FailureContext implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FailureContext[] $VALUES;

        @JvmField
        public static final ProtoAdapter<FailureContext> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FailureContext FAILURE_CONTEXT_NOT_SUITABLE_IP;
        public static final FailureContext FAILURE_CONTEXT_RHSG_CAR_RETRY;
        public static final FailureContext FAILURE_CONTEXT_UK_KNOWLEDGE_TEST_RETRY;
        public static final FailureContext FAILURE_CONTEXT_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ FailureContext[] $values() {
            return new FailureContext[]{FAILURE_CONTEXT_UNSPECIFIED, FAILURE_CONTEXT_UK_KNOWLEDGE_TEST_RETRY, FAILURE_CONTEXT_NOT_SUITABLE_IP, FAILURE_CONTEXT_RHSG_CAR_RETRY};
        }

        @JvmStatic
        public static final FailureContext fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<FailureContext> getEntries() {
            return $ENTRIES;
        }

        private FailureContext(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final FailureContext failureContext = new FailureContext("FAILURE_CONTEXT_UNSPECIFIED", 0, 0);
            FAILURE_CONTEXT_UNSPECIFIED = failureContext;
            FAILURE_CONTEXT_UK_KNOWLEDGE_TEST_RETRY = new FailureContext("FAILURE_CONTEXT_UK_KNOWLEDGE_TEST_RETRY", 1, 1);
            FAILURE_CONTEXT_NOT_SUITABLE_IP = new FailureContext("FAILURE_CONTEXT_NOT_SUITABLE_IP", 2, 2);
            FAILURE_CONTEXT_RHSG_CAR_RETRY = new FailureContext("FAILURE_CONTEXT_RHSG_CAR_RETRY", 3, 3);
            FailureContext[] failureContextArr$values = $values();
            $VALUES = failureContextArr$values;
            $ENTRIES = EnumEntries2.enumEntries(failureContextArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FailureContext.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<FailureContext>(orCreateKotlinClass, syntax, failureContext) { // from class: options_product.service.FailureRequestMetadata$FailureContext$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FailureRequestMetadata.FailureContext fromValue(int value) {
                    return FailureRequestMetadata.FailureContext.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FailureRequestMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/FailureRequestMetadata$FailureContext$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/FailureRequestMetadata$FailureContext;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final FailureContext fromValue(int value) {
                if (value == 0) {
                    return FailureContext.FAILURE_CONTEXT_UNSPECIFIED;
                }
                if (value == 1) {
                    return FailureContext.FAILURE_CONTEXT_UK_KNOWLEDGE_TEST_RETRY;
                }
                if (value == 2) {
                    return FailureContext.FAILURE_CONTEXT_NOT_SUITABLE_IP;
                }
                if (value != 3) {
                    return null;
                }
                return FailureContext.FAILURE_CONTEXT_RHSG_CAR_RETRY;
            }
        }

        public static FailureContext valueOf(String str) {
            return (FailureContext) Enum.valueOf(FailureContext.class, str);
        }

        public static FailureContext[] values() {
            return (FailureContext[]) $VALUES.clone();
        }
    }
}
