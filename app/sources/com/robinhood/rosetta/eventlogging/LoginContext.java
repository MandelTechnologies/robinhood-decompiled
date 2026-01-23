package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: LoginContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoginContext;", "Lcom/squareup/wire/Message;", "", "arkose_lab_enforcement_event", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEvent;", "saved_password", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEvent;Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "getArkose_lab_enforcement_event", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEvent;", "getSaved_password", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class LoginContext extends Message {

    @JvmField
    public static final ProtoAdapter<LoginContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ArkoseLabEnforcementEvent#ADAPTER", jsonName = "arkoseLabEnforcementEvent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ArkoseLabEnforcementEvent arkose_lab_enforcement_event;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "savedPassword", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Boolean saved_password;

    public LoginContext() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24355newBuilder();
    }

    public final ArkoseLabEnforcementEvent getArkose_lab_enforcement_event() {
        return this.arkose_lab_enforcement_event;
    }

    public final Boolean getSaved_password() {
        return this.saved_password;
    }

    public /* synthetic */ LoginContext(ArkoseLabEnforcementEvent arkoseLabEnforcementEvent, Boolean r2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arkoseLabEnforcementEvent, (i & 2) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginContext(ArkoseLabEnforcementEvent arkoseLabEnforcementEvent, Boolean saved_password, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(saved_password, "saved_password");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.arkose_lab_enforcement_event = arkoseLabEnforcementEvent;
        this.saved_password = saved_password;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24355newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LoginContext)) {
            return false;
        }
        LoginContext loginContext = (LoginContext) other;
        return Intrinsics.areEqual(unknownFields(), loginContext.unknownFields()) && Intrinsics.areEqual(this.arkose_lab_enforcement_event, loginContext.arkose_lab_enforcement_event) && this.saved_password == loginContext.saved_password;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ArkoseLabEnforcementEvent arkoseLabEnforcementEvent = this.arkose_lab_enforcement_event;
        int iHashCode2 = ((iHashCode + (arkoseLabEnforcementEvent != null ? arkoseLabEnforcementEvent.hashCode() : 0)) * 37) + this.saved_password.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArkoseLabEnforcementEvent arkoseLabEnforcementEvent = this.arkose_lab_enforcement_event;
        if (arkoseLabEnforcementEvent != null) {
            arrayList.add("arkose_lab_enforcement_event=" + arkoseLabEnforcementEvent);
        }
        arrayList.add("saved_password=" + this.saved_password);
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoginContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LoginContext copy$default(LoginContext loginContext, ArkoseLabEnforcementEvent arkoseLabEnforcementEvent, Boolean r2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            arkoseLabEnforcementEvent = loginContext.arkose_lab_enforcement_event;
        }
        if ((i & 2) != 0) {
            r2 = loginContext.saved_password;
        }
        if ((i & 4) != 0) {
            byteString = loginContext.unknownFields();
        }
        return loginContext.copy(arkoseLabEnforcementEvent, r2, byteString);
    }

    public final LoginContext copy(ArkoseLabEnforcementEvent arkose_lab_enforcement_event, Boolean saved_password, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(saved_password, "saved_password");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LoginContext(arkose_lab_enforcement_event, saved_password, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LoginContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LoginContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.LoginContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LoginContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getArkose_lab_enforcement_event() != null) {
                    size += ArkoseLabEnforcementEvent.ADAPTER.encodedSizeWithTag(1, value.getArkose_lab_enforcement_event());
                }
                return value.getSaved_password() != Boolean.BOOLEAN_UNSPECIFIED ? size + Boolean.ADAPTER.encodedSizeWithTag(2, value.getSaved_password()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LoginContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getArkose_lab_enforcement_event() != null) {
                    ArkoseLabEnforcementEvent.ADAPTER.encodeWithTag(writer, 1, (int) value.getArkose_lab_enforcement_event());
                }
                if (value.getSaved_password() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 2, (int) value.getSaved_password());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LoginContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSaved_password() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 2, (int) value.getSaved_password());
                }
                if (value.getArkose_lab_enforcement_event() != null) {
                    ArkoseLabEnforcementEvent.ADAPTER.encodeWithTag(writer, 1, (int) value.getArkose_lab_enforcement_event());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LoginContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ArkoseLabEnforcementEvent arkoseLabEnforcementEventDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LoginContext(arkoseLabEnforcementEventDecode, booleanDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arkoseLabEnforcementEventDecode = ArkoseLabEnforcementEvent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            booleanDecode = Boolean.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LoginContext redact(LoginContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ArkoseLabEnforcementEvent arkose_lab_enforcement_event = value.getArkose_lab_enforcement_event();
                return LoginContext.copy$default(value, arkose_lab_enforcement_event != null ? ArkoseLabEnforcementEvent.ADAPTER.redact(arkose_lab_enforcement_event) : null, null, ByteString.EMPTY, 2, null);
            }
        };
    }
}
