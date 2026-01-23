package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.PasskeyEnrollmentContext;
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

/* compiled from: PasskeyEnrollmentContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext;", "Lcom/squareup/wire/Message;", "", "trigger", "Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Trigger;", "result", "Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Result;", "error", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Trigger;Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Result;Ljava/lang/String;Lokio/ByteString;)V", "getTrigger", "()Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Trigger;", "getResult", "()Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Result;", "getError", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Trigger", "Result", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PasskeyEnrollmentContext extends Message {

    @JvmField
    public static final ProtoAdapter<PasskeyEnrollmentContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String error;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PasskeyEnrollmentContext$Result#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Result result;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PasskeyEnrollmentContext$Trigger#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Trigger trigger;

    public PasskeyEnrollmentContext() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24457newBuilder();
    }

    public final Trigger getTrigger() {
        return this.trigger;
    }

    public /* synthetic */ PasskeyEnrollmentContext(Trigger trigger, Result result, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Trigger.TRIGGER_UNSPECIFIED : trigger, (i & 2) != 0 ? Result.RESULT_UNSPECIFIED : result, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Result getResult() {
        return this.result;
    }

    public final String getError() {
        return this.error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyEnrollmentContext(Trigger trigger, Result result, String error, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.trigger = trigger;
        this.result = result;
        this.error = error;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24457newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PasskeyEnrollmentContext)) {
            return false;
        }
        PasskeyEnrollmentContext passkeyEnrollmentContext = (PasskeyEnrollmentContext) other;
        return Intrinsics.areEqual(unknownFields(), passkeyEnrollmentContext.unknownFields()) && this.trigger == passkeyEnrollmentContext.trigger && this.result == passkeyEnrollmentContext.result && Intrinsics.areEqual(this.error, passkeyEnrollmentContext.error);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.trigger.hashCode()) * 37) + this.result.hashCode()) * 37) + this.error.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("trigger=" + this.trigger);
        arrayList.add("result=" + this.result);
        arrayList.add("error=" + Internal.sanitize(this.error));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PasskeyEnrollmentContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PasskeyEnrollmentContext copy$default(PasskeyEnrollmentContext passkeyEnrollmentContext, Trigger trigger, Result result, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            trigger = passkeyEnrollmentContext.trigger;
        }
        if ((i & 2) != 0) {
            result = passkeyEnrollmentContext.result;
        }
        if ((i & 4) != 0) {
            str = passkeyEnrollmentContext.error;
        }
        if ((i & 8) != 0) {
            byteString = passkeyEnrollmentContext.unknownFields();
        }
        return passkeyEnrollmentContext.copy(trigger, result, str, byteString);
    }

    public final PasskeyEnrollmentContext copy(Trigger trigger, Result result, String error, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PasskeyEnrollmentContext(trigger, result, error, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PasskeyEnrollmentContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PasskeyEnrollmentContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PasskeyEnrollmentContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PasskeyEnrollmentContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTrigger() != PasskeyEnrollmentContext.Trigger.TRIGGER_UNSPECIFIED) {
                    size += PasskeyEnrollmentContext.Trigger.ADAPTER.encodedSizeWithTag(1, value.getTrigger());
                }
                if (value.getResult() != PasskeyEnrollmentContext.Result.RESULT_UNSPECIFIED) {
                    size += PasskeyEnrollmentContext.Result.ADAPTER.encodedSizeWithTag(2, value.getResult());
                }
                return !Intrinsics.areEqual(value.getError(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getError()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PasskeyEnrollmentContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTrigger() != PasskeyEnrollmentContext.Trigger.TRIGGER_UNSPECIFIED) {
                    PasskeyEnrollmentContext.Trigger.ADAPTER.encodeWithTag(writer, 1, (int) value.getTrigger());
                }
                if (value.getResult() != PasskeyEnrollmentContext.Result.RESULT_UNSPECIFIED) {
                    PasskeyEnrollmentContext.Result.ADAPTER.encodeWithTag(writer, 2, (int) value.getResult());
                }
                if (!Intrinsics.areEqual(value.getError(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PasskeyEnrollmentContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getError(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError());
                }
                if (value.getResult() != PasskeyEnrollmentContext.Result.RESULT_UNSPECIFIED) {
                    PasskeyEnrollmentContext.Result.ADAPTER.encodeWithTag(writer, 2, (int) value.getResult());
                }
                if (value.getTrigger() != PasskeyEnrollmentContext.Trigger.TRIGGER_UNSPECIFIED) {
                    PasskeyEnrollmentContext.Trigger.ADAPTER.encodeWithTag(writer, 1, (int) value.getTrigger());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PasskeyEnrollmentContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PasskeyEnrollmentContext.Trigger triggerDecode = PasskeyEnrollmentContext.Trigger.TRIGGER_UNSPECIFIED;
                PasskeyEnrollmentContext.Result resultDecode = PasskeyEnrollmentContext.Result.RESULT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PasskeyEnrollmentContext(triggerDecode, resultDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            triggerDecode = PasskeyEnrollmentContext.Trigger.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            resultDecode = PasskeyEnrollmentContext.Result.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PasskeyEnrollmentContext redact(PasskeyEnrollmentContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PasskeyEnrollmentContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PasskeyEnrollmentContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Trigger;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRIGGER_UNSPECIFIED", "MANUAL", "AUTO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Trigger implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Trigger[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Trigger> ADAPTER;
        public static final Trigger AUTO;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Trigger MANUAL;
        public static final Trigger TRIGGER_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Trigger[] $values() {
            return new Trigger[]{TRIGGER_UNSPECIFIED, MANUAL, AUTO};
        }

        @JvmStatic
        public static final Trigger fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Trigger> getEntries() {
            return $ENTRIES;
        }

        private Trigger(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Trigger trigger = new Trigger("TRIGGER_UNSPECIFIED", 0, 0);
            TRIGGER_UNSPECIFIED = trigger;
            MANUAL = new Trigger("MANUAL", 1, 1);
            AUTO = new Trigger("AUTO", 2, 2);
            Trigger[] triggerArr$values = $values();
            $VALUES = triggerArr$values;
            $ENTRIES = EnumEntries2.enumEntries(triggerArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Trigger.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Trigger>(orCreateKotlinClass, syntax, trigger) { // from class: com.robinhood.rosetta.eventlogging.PasskeyEnrollmentContext$Trigger$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PasskeyEnrollmentContext.Trigger fromValue(int value) {
                    return PasskeyEnrollmentContext.Trigger.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PasskeyEnrollmentContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Trigger$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Trigger;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Trigger fromValue(int value) {
                if (value == 0) {
                    return Trigger.TRIGGER_UNSPECIFIED;
                }
                if (value == 1) {
                    return Trigger.MANUAL;
                }
                if (value != 2) {
                    return null;
                }
                return Trigger.AUTO;
            }
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PasskeyEnrollmentContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Result;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RESULT_UNSPECIFIED", "SUCCESS", "CANCELED_BY_USER", "ERROR", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Result implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Result> ADAPTER;
        public static final Result CANCELED_BY_USER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Result ERROR;
        public static final Result RESULT_UNSPECIFIED;
        public static final Result SUCCESS;
        private final int value;

        private static final /* synthetic */ Result[] $values() {
            return new Result[]{RESULT_UNSPECIFIED, SUCCESS, CANCELED_BY_USER, ERROR};
        }

        @JvmStatic
        public static final Result fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Result> getEntries() {
            return $ENTRIES;
        }

        private Result(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Result result = new Result("RESULT_UNSPECIFIED", 0, 0);
            RESULT_UNSPECIFIED = result;
            SUCCESS = new Result("SUCCESS", 1, 1);
            CANCELED_BY_USER = new Result("CANCELED_BY_USER", 2, 2);
            ERROR = new Result("ERROR", 3, 3);
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = EnumEntries2.enumEntries(resultArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Result.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Result>(orCreateKotlinClass, syntax, result) { // from class: com.robinhood.rosetta.eventlogging.PasskeyEnrollmentContext$Result$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PasskeyEnrollmentContext.Result fromValue(int value) {
                    return PasskeyEnrollmentContext.Result.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PasskeyEnrollmentContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Result$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PasskeyEnrollmentContext$Result;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Result fromValue(int value) {
                if (value == 0) {
                    return Result.RESULT_UNSPECIFIED;
                }
                if (value == 1) {
                    return Result.SUCCESS;
                }
                if (value == 2) {
                    return Result.CANCELED_BY_USER;
                }
                if (value != 3) {
                    return null;
                }
                return Result.ERROR;
            }
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }
}
