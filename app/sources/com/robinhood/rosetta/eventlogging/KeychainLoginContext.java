package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.KeychainLoginContext;
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

/* compiled from: KeychainLoginContext.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004 !\"#B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext;", "Lcom/squareup/wire/Message;", "", "trigger", "Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Trigger;", "selected_credential", "Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Credential;", "result", "Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Result;", "error", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Trigger;Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Credential;Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Result;Ljava/lang/String;Lokio/ByteString;)V", "getTrigger", "()Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Trigger;", "getSelected_credential", "()Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Credential;", "getResult", "()Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Result;", "getError", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Trigger", "Credential", "Result", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class KeychainLoginContext extends Message {

    @JvmField
    public static final ProtoAdapter<KeychainLoginContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String error;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.KeychainLoginContext$Result#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Result result;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.KeychainLoginContext$Credential#ADAPTER", jsonName = "selectedCredential", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Credential selected_credential;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.KeychainLoginContext$Trigger#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Trigger trigger;

    public KeychainLoginContext() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24328newBuilder();
    }

    public final Trigger getTrigger() {
        return this.trigger;
    }

    public /* synthetic */ KeychainLoginContext(Trigger trigger, Credential credential, Result result, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Trigger.TRIGGER_UNSPECIFIED : trigger, (i & 2) != 0 ? Credential.CREDENTIAL_UNSPECIFIED : credential, (i & 4) != 0 ? Result.RESULT_UNSPECIFIED : result, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Credential getSelected_credential() {
        return this.selected_credential;
    }

    public final Result getResult() {
        return this.result;
    }

    public final String getError() {
        return this.error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeychainLoginContext(Trigger trigger, Credential selected_credential, Result result, String error, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(selected_credential, "selected_credential");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.trigger = trigger;
        this.selected_credential = selected_credential;
        this.result = result;
        this.error = error;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24328newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof KeychainLoginContext)) {
            return false;
        }
        KeychainLoginContext keychainLoginContext = (KeychainLoginContext) other;
        return Intrinsics.areEqual(unknownFields(), keychainLoginContext.unknownFields()) && this.trigger == keychainLoginContext.trigger && this.selected_credential == keychainLoginContext.selected_credential && this.result == keychainLoginContext.result && Intrinsics.areEqual(this.error, keychainLoginContext.error);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.trigger.hashCode()) * 37) + this.selected_credential.hashCode()) * 37) + this.result.hashCode()) * 37) + this.error.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("trigger=" + this.trigger);
        arrayList.add("selected_credential=" + this.selected_credential);
        arrayList.add("result=" + this.result);
        arrayList.add("error=" + Internal.sanitize(this.error));
        return CollectionsKt.joinToString$default(arrayList, ", ", "KeychainLoginContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ KeychainLoginContext copy$default(KeychainLoginContext keychainLoginContext, Trigger trigger, Credential credential, Result result, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            trigger = keychainLoginContext.trigger;
        }
        if ((i & 2) != 0) {
            credential = keychainLoginContext.selected_credential;
        }
        if ((i & 4) != 0) {
            result = keychainLoginContext.result;
        }
        if ((i & 8) != 0) {
            str = keychainLoginContext.error;
        }
        if ((i & 16) != 0) {
            byteString = keychainLoginContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        Result result2 = result;
        return keychainLoginContext.copy(trigger, credential, result2, str, byteString2);
    }

    public final KeychainLoginContext copy(Trigger trigger, Credential selected_credential, Result result, String error, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(selected_credential, "selected_credential");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new KeychainLoginContext(trigger, selected_credential, result, error, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(KeychainLoginContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<KeychainLoginContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.KeychainLoginContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(KeychainLoginContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTrigger() != KeychainLoginContext.Trigger.TRIGGER_UNSPECIFIED) {
                    size += KeychainLoginContext.Trigger.ADAPTER.encodedSizeWithTag(1, value.getTrigger());
                }
                if (value.getSelected_credential() != KeychainLoginContext.Credential.CREDENTIAL_UNSPECIFIED) {
                    size += KeychainLoginContext.Credential.ADAPTER.encodedSizeWithTag(2, value.getSelected_credential());
                }
                if (value.getResult() != KeychainLoginContext.Result.RESULT_UNSPECIFIED) {
                    size += KeychainLoginContext.Result.ADAPTER.encodedSizeWithTag(3, value.getResult());
                }
                return !Intrinsics.areEqual(value.getError(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getError()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, KeychainLoginContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTrigger() != KeychainLoginContext.Trigger.TRIGGER_UNSPECIFIED) {
                    KeychainLoginContext.Trigger.ADAPTER.encodeWithTag(writer, 1, (int) value.getTrigger());
                }
                if (value.getSelected_credential() != KeychainLoginContext.Credential.CREDENTIAL_UNSPECIFIED) {
                    KeychainLoginContext.Credential.ADAPTER.encodeWithTag(writer, 2, (int) value.getSelected_credential());
                }
                if (value.getResult() != KeychainLoginContext.Result.RESULT_UNSPECIFIED) {
                    KeychainLoginContext.Result.ADAPTER.encodeWithTag(writer, 3, (int) value.getResult());
                }
                if (!Intrinsics.areEqual(value.getError(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, KeychainLoginContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getError(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError());
                }
                if (value.getResult() != KeychainLoginContext.Result.RESULT_UNSPECIFIED) {
                    KeychainLoginContext.Result.ADAPTER.encodeWithTag(writer, 3, (int) value.getResult());
                }
                if (value.getSelected_credential() != KeychainLoginContext.Credential.CREDENTIAL_UNSPECIFIED) {
                    KeychainLoginContext.Credential.ADAPTER.encodeWithTag(writer, 2, (int) value.getSelected_credential());
                }
                if (value.getTrigger() != KeychainLoginContext.Trigger.TRIGGER_UNSPECIFIED) {
                    KeychainLoginContext.Trigger.ADAPTER.encodeWithTag(writer, 1, (int) value.getTrigger());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public KeychainLoginContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                KeychainLoginContext.Trigger triggerDecode = KeychainLoginContext.Trigger.TRIGGER_UNSPECIFIED;
                KeychainLoginContext.Credential credential = KeychainLoginContext.Credential.CREDENTIAL_UNSPECIFIED;
                KeychainLoginContext.Result result = KeychainLoginContext.Result.RESULT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                KeychainLoginContext.Result resultDecode = result;
                KeychainLoginContext.Credential credentialDecode = credential;
                while (true) {
                    KeychainLoginContext.Trigger trigger = triggerDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new KeychainLoginContext(trigger, credentialDecode, resultDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                triggerDecode = KeychainLoginContext.Trigger.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                credentialDecode = KeychainLoginContext.Credential.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                resultDecode = KeychainLoginContext.Result.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public KeychainLoginContext redact(KeychainLoginContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return KeychainLoginContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KeychainLoginContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Trigger;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRIGGER_UNSPECIFIED", "MANUAL", "AUTO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            ADAPTER = new EnumAdapter<Trigger>(orCreateKotlinClass, syntax, trigger) { // from class: com.robinhood.rosetta.eventlogging.KeychainLoginContext$Trigger$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public KeychainLoginContext.Trigger fromValue(int value) {
                    return KeychainLoginContext.Trigger.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: KeychainLoginContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Trigger$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Trigger;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
    /* compiled from: KeychainLoginContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Credential;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CREDENTIAL_UNSPECIFIED", "PASSKEY", "PASSWORD", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Credential implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Credential[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Credential> ADAPTER;
        public static final Credential CREDENTIAL_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Credential PASSKEY;
        public static final Credential PASSWORD;
        private final int value;

        private static final /* synthetic */ Credential[] $values() {
            return new Credential[]{CREDENTIAL_UNSPECIFIED, PASSKEY, PASSWORD};
        }

        @JvmStatic
        public static final Credential fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Credential> getEntries() {
            return $ENTRIES;
        }

        private Credential(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Credential credential = new Credential("CREDENTIAL_UNSPECIFIED", 0, 0);
            CREDENTIAL_UNSPECIFIED = credential;
            PASSKEY = new Credential("PASSKEY", 1, 1);
            PASSWORD = new Credential("PASSWORD", 2, 2);
            Credential[] credentialArr$values = $values();
            $VALUES = credentialArr$values;
            $ENTRIES = EnumEntries2.enumEntries(credentialArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Credential.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Credential>(orCreateKotlinClass, syntax, credential) { // from class: com.robinhood.rosetta.eventlogging.KeychainLoginContext$Credential$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public KeychainLoginContext.Credential fromValue(int value) {
                    return KeychainLoginContext.Credential.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: KeychainLoginContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Credential$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Credential;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Credential fromValue(int value) {
                if (value == 0) {
                    return Credential.CREDENTIAL_UNSPECIFIED;
                }
                if (value == 1) {
                    return Credential.PASSKEY;
                }
                if (value != 2) {
                    return null;
                }
                return Credential.PASSWORD;
            }
        }

        public static Credential valueOf(String str) {
            return (Credential) Enum.valueOf(Credential.class, str);
        }

        public static Credential[] values() {
            return (Credential[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KeychainLoginContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Result;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RESULT_UNSPECIFIED", "SUCCESS", "NO_CREDENTIALS", "CANCELED_BY_USER", "ERROR", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Result implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Result> ADAPTER;
        public static final Result CANCELED_BY_USER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Result ERROR;
        public static final Result NO_CREDENTIALS;
        public static final Result RESULT_UNSPECIFIED;
        public static final Result SUCCESS;
        private final int value;

        private static final /* synthetic */ Result[] $values() {
            return new Result[]{RESULT_UNSPECIFIED, SUCCESS, NO_CREDENTIALS, CANCELED_BY_USER, ERROR};
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
            NO_CREDENTIALS = new Result("NO_CREDENTIALS", 2, 2);
            CANCELED_BY_USER = new Result("CANCELED_BY_USER", 3, 3);
            ERROR = new Result("ERROR", 4, 4);
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = EnumEntries2.enumEntries(resultArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Result.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Result>(orCreateKotlinClass, syntax, result) { // from class: com.robinhood.rosetta.eventlogging.KeychainLoginContext$Result$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public KeychainLoginContext.Result fromValue(int value) {
                    return KeychainLoginContext.Result.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: KeychainLoginContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Result$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/KeychainLoginContext$Result;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    return Result.NO_CREDENTIALS;
                }
                if (value == 3) {
                    return Result.CANCELED_BY_USER;
                }
                if (value != 4) {
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
