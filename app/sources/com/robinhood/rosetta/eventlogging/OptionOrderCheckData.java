package com.robinhood.rosetta.eventlogging;

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

/* compiled from: OptionOrderCheckData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckData;", "Lcom/squareup/wire/Message;", "", "alert_type", "", "triggered_action_identifier", "abort_reason", "number_of_checks_seen", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAlert_type", "()Ljava/lang/String;", "getTriggered_action_identifier", "getAbort_reason", "getNumber_of_checks_seen", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionOrderCheckData extends Message {

    @JvmField
    public static final ProtoAdapter<OptionOrderCheckData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "abortReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String abort_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "alertType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String alert_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "numberOfChecksSeen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String number_of_checks_seen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "triggeredActionIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String triggered_action_identifier;

    public OptionOrderCheckData() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ OptionOrderCheckData(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24426newBuilder();
    }

    public final String getAlert_type() {
        return this.alert_type;
    }

    public final String getTriggered_action_identifier() {
        return this.triggered_action_identifier;
    }

    public final String getAbort_reason() {
        return this.abort_reason;
    }

    public final String getNumber_of_checks_seen() {
        return this.number_of_checks_seen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderCheckData(String alert_type, String triggered_action_identifier, String abort_reason, String number_of_checks_seen, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(alert_type, "alert_type");
        Intrinsics.checkNotNullParameter(triggered_action_identifier, "triggered_action_identifier");
        Intrinsics.checkNotNullParameter(abort_reason, "abort_reason");
        Intrinsics.checkNotNullParameter(number_of_checks_seen, "number_of_checks_seen");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.alert_type = alert_type;
        this.triggered_action_identifier = triggered_action_identifier;
        this.abort_reason = abort_reason;
        this.number_of_checks_seen = number_of_checks_seen;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24426newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionOrderCheckData)) {
            return false;
        }
        OptionOrderCheckData optionOrderCheckData = (OptionOrderCheckData) other;
        return Intrinsics.areEqual(unknownFields(), optionOrderCheckData.unknownFields()) && Intrinsics.areEqual(this.alert_type, optionOrderCheckData.alert_type) && Intrinsics.areEqual(this.triggered_action_identifier, optionOrderCheckData.triggered_action_identifier) && Intrinsics.areEqual(this.abort_reason, optionOrderCheckData.abort_reason) && Intrinsics.areEqual(this.number_of_checks_seen, optionOrderCheckData.number_of_checks_seen);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.alert_type.hashCode()) * 37) + this.triggered_action_identifier.hashCode()) * 37) + this.abort_reason.hashCode()) * 37) + this.number_of_checks_seen.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("alert_type=" + Internal.sanitize(this.alert_type));
        arrayList.add("triggered_action_identifier=" + Internal.sanitize(this.triggered_action_identifier));
        arrayList.add("abort_reason=" + Internal.sanitize(this.abort_reason));
        arrayList.add("number_of_checks_seen=" + Internal.sanitize(this.number_of_checks_seen));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionOrderCheckData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionOrderCheckData copy$default(OptionOrderCheckData optionOrderCheckData, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOrderCheckData.alert_type;
        }
        if ((i & 2) != 0) {
            str2 = optionOrderCheckData.triggered_action_identifier;
        }
        if ((i & 4) != 0) {
            str3 = optionOrderCheckData.abort_reason;
        }
        if ((i & 8) != 0) {
            str4 = optionOrderCheckData.number_of_checks_seen;
        }
        if ((i & 16) != 0) {
            byteString = optionOrderCheckData.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return optionOrderCheckData.copy(str, str2, str5, str4, byteString2);
    }

    public final OptionOrderCheckData copy(String alert_type, String triggered_action_identifier, String abort_reason, String number_of_checks_seen, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(alert_type, "alert_type");
        Intrinsics.checkNotNullParameter(triggered_action_identifier, "triggered_action_identifier");
        Intrinsics.checkNotNullParameter(abort_reason, "abort_reason");
        Intrinsics.checkNotNullParameter(number_of_checks_seen, "number_of_checks_seen");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionOrderCheckData(alert_type, triggered_action_identifier, abort_reason, number_of_checks_seen, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionOrderCheckData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionOrderCheckData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionOrderCheckData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionOrderCheckData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAlert_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAlert_type());
                }
                if (!Intrinsics.areEqual(value.getTriggered_action_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTriggered_action_identifier());
                }
                if (!Intrinsics.areEqual(value.getAbort_reason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAbort_reason());
                }
                return !Intrinsics.areEqual(value.getNumber_of_checks_seen(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getNumber_of_checks_seen()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionOrderCheckData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAlert_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAlert_type());
                }
                if (!Intrinsics.areEqual(value.getTriggered_action_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTriggered_action_identifier());
                }
                if (!Intrinsics.areEqual(value.getAbort_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAbort_reason());
                }
                if (!Intrinsics.areEqual(value.getNumber_of_checks_seen(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getNumber_of_checks_seen());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionOrderCheckData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getNumber_of_checks_seen(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getNumber_of_checks_seen());
                }
                if (!Intrinsics.areEqual(value.getAbort_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAbort_reason());
                }
                if (!Intrinsics.areEqual(value.getTriggered_action_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTriggered_action_identifier());
                }
                if (Intrinsics.areEqual(value.getAlert_type(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAlert_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderCheckData redact(OptionOrderCheckData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionOrderCheckData.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderCheckData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OptionOrderCheckData(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
