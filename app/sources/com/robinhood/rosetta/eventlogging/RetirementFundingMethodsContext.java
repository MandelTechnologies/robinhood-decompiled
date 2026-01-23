package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.RetirementFundingMethodsContext;
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

/* compiled from: RetirementFundingMethodsContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext;", "Lcom/squareup/wire/Message;", "", "selected_funding_method", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod;", "selected_funding_method_identifier", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod;Ljava/lang/String;Lokio/ByteString;)V", "getSelected_funding_method$annotations", "()V", "getSelected_funding_method", "()Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod;", "getSelected_funding_method_identifier", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "RetirementFundingMethod", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class RetirementFundingMethodsContext extends Message {

    @JvmField
    public static final ProtoAdapter<RetirementFundingMethodsContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RetirementFundingMethodsContext$RetirementFundingMethod#ADAPTER", jsonName = "selectedFundingMethod", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final RetirementFundingMethod selected_funding_method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedFundingMethodIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String selected_funding_method_identifier;

    public RetirementFundingMethodsContext() {
        this(null, null, null, 7, null);
    }

    @Deprecated
    public static /* synthetic */ void getSelected_funding_method$annotations() {
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24537newBuilder();
    }

    public final RetirementFundingMethod getSelected_funding_method() {
        return this.selected_funding_method;
    }

    public /* synthetic */ RetirementFundingMethodsContext(RetirementFundingMethod retirementFundingMethod, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RetirementFundingMethod.CONTRIBUTION : retirementFundingMethod, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSelected_funding_method_identifier() {
        return this.selected_funding_method_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementFundingMethodsContext(RetirementFundingMethod selected_funding_method, String selected_funding_method_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(selected_funding_method, "selected_funding_method");
        Intrinsics.checkNotNullParameter(selected_funding_method_identifier, "selected_funding_method_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.selected_funding_method = selected_funding_method;
        this.selected_funding_method_identifier = selected_funding_method_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24537newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RetirementFundingMethodsContext)) {
            return false;
        }
        RetirementFundingMethodsContext retirementFundingMethodsContext = (RetirementFundingMethodsContext) other;
        return Intrinsics.areEqual(unknownFields(), retirementFundingMethodsContext.unknownFields()) && this.selected_funding_method == retirementFundingMethodsContext.selected_funding_method && Intrinsics.areEqual(this.selected_funding_method_identifier, retirementFundingMethodsContext.selected_funding_method_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.selected_funding_method.hashCode()) * 37) + this.selected_funding_method_identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("selected_funding_method=" + this.selected_funding_method);
        arrayList.add("selected_funding_method_identifier=" + Internal.sanitize(this.selected_funding_method_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "RetirementFundingMethodsContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RetirementFundingMethodsContext copy$default(RetirementFundingMethodsContext retirementFundingMethodsContext, RetirementFundingMethod retirementFundingMethod, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            retirementFundingMethod = retirementFundingMethodsContext.selected_funding_method;
        }
        if ((i & 2) != 0) {
            str = retirementFundingMethodsContext.selected_funding_method_identifier;
        }
        if ((i & 4) != 0) {
            byteString = retirementFundingMethodsContext.unknownFields();
        }
        return retirementFundingMethodsContext.copy(retirementFundingMethod, str, byteString);
    }

    public final RetirementFundingMethodsContext copy(RetirementFundingMethod selected_funding_method, String selected_funding_method_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(selected_funding_method, "selected_funding_method");
        Intrinsics.checkNotNullParameter(selected_funding_method_identifier, "selected_funding_method_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RetirementFundingMethodsContext(selected_funding_method, selected_funding_method_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RetirementFundingMethodsContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RetirementFundingMethodsContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.RetirementFundingMethodsContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RetirementFundingMethodsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSelected_funding_method() != RetirementFundingMethodsContext.RetirementFundingMethod.CONTRIBUTION) {
                    size += RetirementFundingMethodsContext.RetirementFundingMethod.ADAPTER.encodedSizeWithTag(1, value.getSelected_funding_method());
                }
                return !Intrinsics.areEqual(value.getSelected_funding_method_identifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSelected_funding_method_identifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RetirementFundingMethodsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSelected_funding_method() != RetirementFundingMethodsContext.RetirementFundingMethod.CONTRIBUTION) {
                    RetirementFundingMethodsContext.RetirementFundingMethod.ADAPTER.encodeWithTag(writer, 1, (int) value.getSelected_funding_method());
                }
                if (!Intrinsics.areEqual(value.getSelected_funding_method_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSelected_funding_method_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RetirementFundingMethodsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSelected_funding_method_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSelected_funding_method_identifier());
                }
                if (value.getSelected_funding_method() != RetirementFundingMethodsContext.RetirementFundingMethod.CONTRIBUTION) {
                    RetirementFundingMethodsContext.RetirementFundingMethod.ADAPTER.encodeWithTag(writer, 1, (int) value.getSelected_funding_method());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RetirementFundingMethodsContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                RetirementFundingMethodsContext.RetirementFundingMethod retirementFundingMethodDecode = RetirementFundingMethodsContext.RetirementFundingMethod.CONTRIBUTION;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RetirementFundingMethodsContext(retirementFundingMethodDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            retirementFundingMethodDecode = RetirementFundingMethodsContext.RetirementFundingMethod.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RetirementFundingMethodsContext redact(RetirementFundingMethodsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RetirementFundingMethodsContext.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RetirementFundingMethodsContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTRIBUTION", "DIRECT_ROLLOVER", "ACATS", "INDIRECT_ROLLOVER", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RetirementFundingMethod implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RetirementFundingMethod[] $VALUES;
        public static final RetirementFundingMethod ACATS;

        @JvmField
        public static final ProtoAdapter<RetirementFundingMethod> ADAPTER;
        public static final RetirementFundingMethod CONTRIBUTION;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final RetirementFundingMethod DIRECT_ROLLOVER;
        public static final RetirementFundingMethod INDIRECT_ROLLOVER;
        private final int value;

        private static final /* synthetic */ RetirementFundingMethod[] $values() {
            return new RetirementFundingMethod[]{CONTRIBUTION, DIRECT_ROLLOVER, ACATS, INDIRECT_ROLLOVER};
        }

        @JvmStatic
        public static final RetirementFundingMethod fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<RetirementFundingMethod> getEntries() {
            return $ENTRIES;
        }

        private RetirementFundingMethod(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final RetirementFundingMethod retirementFundingMethod = new RetirementFundingMethod("CONTRIBUTION", 0, 0);
            CONTRIBUTION = retirementFundingMethod;
            DIRECT_ROLLOVER = new RetirementFundingMethod("DIRECT_ROLLOVER", 1, 1);
            ACATS = new RetirementFundingMethod("ACATS", 2, 2);
            INDIRECT_ROLLOVER = new RetirementFundingMethod("INDIRECT_ROLLOVER", 3, 3);
            RetirementFundingMethod[] retirementFundingMethodArr$values = $values();
            $VALUES = retirementFundingMethodArr$values;
            $ENTRIES = EnumEntries2.enumEntries(retirementFundingMethodArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RetirementFundingMethod.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<RetirementFundingMethod>(orCreateKotlinClass, syntax, retirementFundingMethod) { // from class: com.robinhood.rosetta.eventlogging.RetirementFundingMethodsContext$RetirementFundingMethod$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RetirementFundingMethodsContext.RetirementFundingMethod fromValue(int value) {
                    return RetirementFundingMethodsContext.RetirementFundingMethod.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RetirementFundingMethodsContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final RetirementFundingMethod fromValue(int value) {
                if (value == 0) {
                    return RetirementFundingMethod.CONTRIBUTION;
                }
                if (value == 1) {
                    return RetirementFundingMethod.DIRECT_ROLLOVER;
                }
                if (value == 2) {
                    return RetirementFundingMethod.ACATS;
                }
                if (value != 3) {
                    return null;
                }
                return RetirementFundingMethod.INDIRECT_ROLLOVER;
            }
        }

        public static RetirementFundingMethod valueOf(String str) {
            return (RetirementFundingMethod) Enum.valueOf(RetirementFundingMethod.class, str);
        }

        public static RetirementFundingMethod[] values() {
            return (RetirementFundingMethod[]) $VALUES.clone();
        }
    }
}
