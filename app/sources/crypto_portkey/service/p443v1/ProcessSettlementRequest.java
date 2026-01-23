package crypto_portkey.service.p443v1;

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
import p479j$.time.Instant;

/* compiled from: ProcessSettlementRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcrypto_portkey/service/v1/ProcessSettlementRequest;", "Lcom/squareup/wire/Message;", "", "", "partner", "custodian_name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "settlement_target_time", "", "force_run", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;ZLokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;ZLokio/ByteString;)Lcrypto_portkey/service/v1/ProcessSettlementRequest;", "Ljava/lang/String;", "getPartner", "getCustodian_name", "Lj$/time/Instant;", "getSettlement_target_time", "()Lj$/time/Instant;", "Z", "getForce_run", "()Z", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ProcessSettlementRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ProcessSettlementRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "custodianName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String custodian_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "forceRun", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean force_run;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String partner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "settlementTargetTime", schemaIndex = 2, tag = 3)
    private final Instant settlement_target_time;

    public ProcessSettlementRequest() {
        this(null, null, null, false, null, 31, null);
    }

    public /* synthetic */ ProcessSettlementRequest(String str, String str2, Instant instant, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? false : z, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27921newBuilder();
    }

    public final String getPartner() {
        return this.partner;
    }

    public final String getCustodian_name() {
        return this.custodian_name;
    }

    public final Instant getSettlement_target_time() {
        return this.settlement_target_time;
    }

    public final boolean getForce_run() {
        return this.force_run;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessSettlementRequest(String partner, String custodian_name, Instant instant, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(partner, "partner");
        Intrinsics.checkNotNullParameter(custodian_name, "custodian_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.partner = partner;
        this.custodian_name = custodian_name;
        this.settlement_target_time = instant;
        this.force_run = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27921newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ProcessSettlementRequest)) {
            return false;
        }
        ProcessSettlementRequest processSettlementRequest = (ProcessSettlementRequest) other;
        return Intrinsics.areEqual(unknownFields(), processSettlementRequest.unknownFields()) && Intrinsics.areEqual(this.partner, processSettlementRequest.partner) && Intrinsics.areEqual(this.custodian_name, processSettlementRequest.custodian_name) && Intrinsics.areEqual(this.settlement_target_time, processSettlementRequest.settlement_target_time) && this.force_run == processSettlementRequest.force_run;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.partner.hashCode()) * 37) + this.custodian_name.hashCode()) * 37;
        Instant instant = this.settlement_target_time;
        int iHashCode2 = ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + Boolean.hashCode(this.force_run);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("partner=" + Internal.sanitize(this.partner));
        arrayList.add("custodian_name=" + Internal.sanitize(this.custodian_name));
        Instant instant = this.settlement_target_time;
        if (instant != null) {
            arrayList.add("settlement_target_time=" + instant);
        }
        arrayList.add("force_run=" + this.force_run);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProcessSettlementRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ProcessSettlementRequest copy$default(ProcessSettlementRequest processSettlementRequest, String str, String str2, Instant instant, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = processSettlementRequest.partner;
        }
        if ((i & 2) != 0) {
            str2 = processSettlementRequest.custodian_name;
        }
        if ((i & 4) != 0) {
            instant = processSettlementRequest.settlement_target_time;
        }
        if ((i & 8) != 0) {
            z = processSettlementRequest.force_run;
        }
        if ((i & 16) != 0) {
            byteString = processSettlementRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        Instant instant2 = instant;
        return processSettlementRequest.copy(str, str2, instant2, z, byteString2);
    }

    public final ProcessSettlementRequest copy(String partner, String custodian_name, Instant settlement_target_time, boolean force_run, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(partner, "partner");
        Intrinsics.checkNotNullParameter(custodian_name, "custodian_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ProcessSettlementRequest(partner, custodian_name, settlement_target_time, force_run, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ProcessSettlementRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ProcessSettlementRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.ProcessSettlementRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ProcessSettlementRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPartner(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPartner());
                }
                if (!Intrinsics.areEqual(value.getCustodian_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCustodian_name());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getSettlement_target_time());
                return value.getForce_run() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getForce_run())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ProcessSettlementRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPartner(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner());
                }
                if (!Intrinsics.areEqual(value.getCustodian_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCustodian_name());
                }
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getSettlement_target_time());
                if (value.getForce_run()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getForce_run()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ProcessSettlementRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getForce_run()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getForce_run()));
                }
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getSettlement_target_time());
                if (!Intrinsics.areEqual(value.getCustodian_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCustodian_name());
                }
                if (Intrinsics.areEqual(value.getPartner(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ProcessSettlementRequest redact(ProcessSettlementRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant settlement_target_time = value.getSettlement_target_time();
                return ProcessSettlementRequest.copy$default(value, null, null, settlement_target_time != null ? ProtoAdapter.INSTANT.redact(settlement_target_time) : null, false, ByteString.EMPTY, 11, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ProcessSettlementRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                Instant instantDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ProcessSettlementRequest(strDecode, strDecode2, instantDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 4) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
