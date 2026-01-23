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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: MigrationData.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-Bm\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0016Jl\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!¨\u0006."}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationData;", "Lcom/squareup/wire/Message;", "", "migration_pre_info", "", "Lcrypto_portkey/service/v1/MigrationPreInfo;", "migration_initiate_ack", "Lcrypto_portkey/service/v1/MigrationInitiateAckData;", "migration_request", "Lcrypto_portkey/service/v1/MigrationRequestData;", "balance_request", "Lcrypto_portkey/service/v1/BalanceRequestData;", "migration_kickoff_ack", "Lcrypto_portkey/service/v1/MigrationKickoffAckData;", "check_eligibility", "Lcrypto_portkey/service/v1/CheckEligibilityData;", "migration_finalize_ack", "Lcrypto_portkey/service/v1/MigrationFinalizeAckData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lcrypto_portkey/service/v1/MigrationInitiateAckData;Lcrypto_portkey/service/v1/MigrationRequestData;Lcrypto_portkey/service/v1/BalanceRequestData;Ljava/util/List;Lcrypto_portkey/service/v1/CheckEligibilityData;Lcrypto_portkey/service/v1/MigrationFinalizeAckData;Lokio/ByteString;)V", "getMigration_initiate_ack", "()Lcrypto_portkey/service/v1/MigrationInitiateAckData;", "getMigration_request", "()Lcrypto_portkey/service/v1/MigrationRequestData;", "getBalance_request", "()Lcrypto_portkey/service/v1/BalanceRequestData;", "getCheck_eligibility", "()Lcrypto_portkey/service/v1/CheckEligibilityData;", "getMigration_finalize_ack", "()Lcrypto_portkey/service/v1/MigrationFinalizeAckData;", "getMigration_pre_info", "()Ljava/util/List;", "getMigration_kickoff_ack", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class MigrationData extends Message {

    @JvmField
    public static final ProtoAdapter<MigrationData> ADAPTER;

    @WireField(adapter = "crypto_portkey.service.v1.BalanceRequestData#ADAPTER", jsonName = "balanceRequest", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final BalanceRequestData balance_request;

    @WireField(adapter = "crypto_portkey.service.v1.CheckEligibilityData#ADAPTER", jsonName = "checkEligibility", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final CheckEligibilityData check_eligibility;

    @WireField(adapter = "crypto_portkey.service.v1.MigrationFinalizeAckData#ADAPTER", jsonName = "migrationFinalizeAck", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final MigrationFinalizeAckData migration_finalize_ack;

    @WireField(adapter = "crypto_portkey.service.v1.MigrationInitiateAckData#ADAPTER", jsonName = "migrationInitiateAck", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final MigrationInitiateAckData migration_initiate_ack;

    @WireField(adapter = "crypto_portkey.service.v1.MigrationKickoffAckData#ADAPTER", jsonName = "migrationKickoffAck", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<MigrationKickoffAckData> migration_kickoff_ack;

    @WireField(adapter = "crypto_portkey.service.v1.MigrationPreInfo#ADAPTER", jsonName = "migrationPreInfo", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<MigrationPreInfo> migration_pre_info;

    @WireField(adapter = "crypto_portkey.service.v1.MigrationRequestData#ADAPTER", jsonName = "migrationRequest", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final MigrationRequestData migration_request;

    public MigrationData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27900newBuilder();
    }

    public /* synthetic */ MigrationData(List list, MigrationInitiateAckData migrationInitiateAckData, MigrationRequestData migrationRequestData, BalanceRequestData balanceRequestData, List list2, CheckEligibilityData checkEligibilityData, MigrationFinalizeAckData migrationFinalizeAckData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : migrationInitiateAckData, (i & 4) != 0 ? null : migrationRequestData, (i & 8) != 0 ? null : balanceRequestData, (i & 16) != 0 ? CollectionsKt.emptyList() : list2, (i & 32) != 0 ? null : checkEligibilityData, (i & 64) != 0 ? null : migrationFinalizeAckData, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final MigrationInitiateAckData getMigration_initiate_ack() {
        return this.migration_initiate_ack;
    }

    public final MigrationRequestData getMigration_request() {
        return this.migration_request;
    }

    public final BalanceRequestData getBalance_request() {
        return this.balance_request;
    }

    public final CheckEligibilityData getCheck_eligibility() {
        return this.check_eligibility;
    }

    public final MigrationFinalizeAckData getMigration_finalize_ack() {
        return this.migration_finalize_ack;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationData(List<MigrationPreInfo> migration_pre_info, MigrationInitiateAckData migrationInitiateAckData, MigrationRequestData migrationRequestData, BalanceRequestData balanceRequestData, List<MigrationKickoffAckData> migration_kickoff_ack, CheckEligibilityData checkEligibilityData, MigrationFinalizeAckData migrationFinalizeAckData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(migration_pre_info, "migration_pre_info");
        Intrinsics.checkNotNullParameter(migration_kickoff_ack, "migration_kickoff_ack");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.migration_initiate_ack = migrationInitiateAckData;
        this.migration_request = migrationRequestData;
        this.balance_request = balanceRequestData;
        this.check_eligibility = checkEligibilityData;
        this.migration_finalize_ack = migrationFinalizeAckData;
        this.migration_pre_info = Internal.immutableCopyOf("migration_pre_info", migration_pre_info);
        this.migration_kickoff_ack = Internal.immutableCopyOf("migration_kickoff_ack", migration_kickoff_ack);
    }

    public final List<MigrationPreInfo> getMigration_pre_info() {
        return this.migration_pre_info;
    }

    public final List<MigrationKickoffAckData> getMigration_kickoff_ack() {
        return this.migration_kickoff_ack;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27900newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MigrationData)) {
            return false;
        }
        MigrationData migrationData = (MigrationData) other;
        return Intrinsics.areEqual(unknownFields(), migrationData.unknownFields()) && Intrinsics.areEqual(this.migration_pre_info, migrationData.migration_pre_info) && Intrinsics.areEqual(this.migration_initiate_ack, migrationData.migration_initiate_ack) && Intrinsics.areEqual(this.migration_request, migrationData.migration_request) && Intrinsics.areEqual(this.balance_request, migrationData.balance_request) && Intrinsics.areEqual(this.migration_kickoff_ack, migrationData.migration_kickoff_ack) && Intrinsics.areEqual(this.check_eligibility, migrationData.check_eligibility) && Intrinsics.areEqual(this.migration_finalize_ack, migrationData.migration_finalize_ack);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.migration_pre_info.hashCode()) * 37;
        MigrationInitiateAckData migrationInitiateAckData = this.migration_initiate_ack;
        int iHashCode2 = (iHashCode + (migrationInitiateAckData != null ? migrationInitiateAckData.hashCode() : 0)) * 37;
        MigrationRequestData migrationRequestData = this.migration_request;
        int iHashCode3 = (iHashCode2 + (migrationRequestData != null ? migrationRequestData.hashCode() : 0)) * 37;
        BalanceRequestData balanceRequestData = this.balance_request;
        int iHashCode4 = (((iHashCode3 + (balanceRequestData != null ? balanceRequestData.hashCode() : 0)) * 37) + this.migration_kickoff_ack.hashCode()) * 37;
        CheckEligibilityData checkEligibilityData = this.check_eligibility;
        int iHashCode5 = (iHashCode4 + (checkEligibilityData != null ? checkEligibilityData.hashCode() : 0)) * 37;
        MigrationFinalizeAckData migrationFinalizeAckData = this.migration_finalize_ack;
        int iHashCode6 = iHashCode5 + (migrationFinalizeAckData != null ? migrationFinalizeAckData.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.migration_pre_info.isEmpty()) {
            arrayList.add("migration_pre_info=" + this.migration_pre_info);
        }
        MigrationInitiateAckData migrationInitiateAckData = this.migration_initiate_ack;
        if (migrationInitiateAckData != null) {
            arrayList.add("migration_initiate_ack=" + migrationInitiateAckData);
        }
        MigrationRequestData migrationRequestData = this.migration_request;
        if (migrationRequestData != null) {
            arrayList.add("migration_request=" + migrationRequestData);
        }
        BalanceRequestData balanceRequestData = this.balance_request;
        if (balanceRequestData != null) {
            arrayList.add("balance_request=" + balanceRequestData);
        }
        if (!this.migration_kickoff_ack.isEmpty()) {
            arrayList.add("migration_kickoff_ack=" + this.migration_kickoff_ack);
        }
        CheckEligibilityData checkEligibilityData = this.check_eligibility;
        if (checkEligibilityData != null) {
            arrayList.add("check_eligibility=" + checkEligibilityData);
        }
        MigrationFinalizeAckData migrationFinalizeAckData = this.migration_finalize_ack;
        if (migrationFinalizeAckData != null) {
            arrayList.add("migration_finalize_ack=" + migrationFinalizeAckData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MigrationData{", "}", 0, null, null, 56, null);
    }

    public final MigrationData copy(List<MigrationPreInfo> migration_pre_info, MigrationInitiateAckData migration_initiate_ack, MigrationRequestData migration_request, BalanceRequestData balance_request, List<MigrationKickoffAckData> migration_kickoff_ack, CheckEligibilityData check_eligibility, MigrationFinalizeAckData migration_finalize_ack, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(migration_pre_info, "migration_pre_info");
        Intrinsics.checkNotNullParameter(migration_kickoff_ack, "migration_kickoff_ack");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MigrationData(migration_pre_info, migration_initiate_ack, migration_request, balance_request, migration_kickoff_ack, check_eligibility, migration_finalize_ack, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MigrationData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MigrationData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.MigrationData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MigrationData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + MigrationPreInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getMigration_pre_info());
                if (value.getMigration_initiate_ack() != null) {
                    size += MigrationInitiateAckData.ADAPTER.encodedSizeWithTag(2, value.getMigration_initiate_ack());
                }
                if (value.getMigration_request() != null) {
                    size += MigrationRequestData.ADAPTER.encodedSizeWithTag(3, value.getMigration_request());
                }
                if (value.getBalance_request() != null) {
                    size += BalanceRequestData.ADAPTER.encodedSizeWithTag(4, value.getBalance_request());
                }
                int iEncodedSizeWithTag = size + MigrationKickoffAckData.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getMigration_kickoff_ack());
                if (value.getCheck_eligibility() != null) {
                    iEncodedSizeWithTag += CheckEligibilityData.ADAPTER.encodedSizeWithTag(6, value.getCheck_eligibility());
                }
                return value.getMigration_finalize_ack() != null ? iEncodedSizeWithTag + MigrationFinalizeAckData.ADAPTER.encodedSizeWithTag(7, value.getMigration_finalize_ack()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MigrationData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                MigrationPreInfo.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getMigration_pre_info());
                if (value.getMigration_initiate_ack() != null) {
                    MigrationInitiateAckData.ADAPTER.encodeWithTag(writer, 2, (int) value.getMigration_initiate_ack());
                }
                if (value.getMigration_request() != null) {
                    MigrationRequestData.ADAPTER.encodeWithTag(writer, 3, (int) value.getMigration_request());
                }
                if (value.getBalance_request() != null) {
                    BalanceRequestData.ADAPTER.encodeWithTag(writer, 4, (int) value.getBalance_request());
                }
                MigrationKickoffAckData.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getMigration_kickoff_ack());
                if (value.getCheck_eligibility() != null) {
                    CheckEligibilityData.ADAPTER.encodeWithTag(writer, 6, (int) value.getCheck_eligibility());
                }
                if (value.getMigration_finalize_ack() != null) {
                    MigrationFinalizeAckData.ADAPTER.encodeWithTag(writer, 7, (int) value.getMigration_finalize_ack());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MigrationData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMigration_finalize_ack() != null) {
                    MigrationFinalizeAckData.ADAPTER.encodeWithTag(writer, 7, (int) value.getMigration_finalize_ack());
                }
                if (value.getCheck_eligibility() != null) {
                    CheckEligibilityData.ADAPTER.encodeWithTag(writer, 6, (int) value.getCheck_eligibility());
                }
                MigrationKickoffAckData.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getMigration_kickoff_ack());
                if (value.getBalance_request() != null) {
                    BalanceRequestData.ADAPTER.encodeWithTag(writer, 4, (int) value.getBalance_request());
                }
                if (value.getMigration_request() != null) {
                    MigrationRequestData.ADAPTER.encodeWithTag(writer, 3, (int) value.getMigration_request());
                }
                if (value.getMigration_initiate_ack() != null) {
                    MigrationInitiateAckData.ADAPTER.encodeWithTag(writer, 2, (int) value.getMigration_initiate_ack());
                }
                MigrationPreInfo.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getMigration_pre_info());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MigrationData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                MigrationInitiateAckData migrationInitiateAckDataDecode = null;
                MigrationRequestData migrationRequestDataDecode = null;
                BalanceRequestData balanceRequestDataDecode = null;
                CheckEligibilityData checkEligibilityDataDecode = null;
                MigrationFinalizeAckData migrationFinalizeAckDataDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                arrayList.add(MigrationPreInfo.ADAPTER.decode(reader));
                                break;
                            case 2:
                                migrationInitiateAckDataDecode = MigrationInitiateAckData.ADAPTER.decode(reader);
                                break;
                            case 3:
                                migrationRequestDataDecode = MigrationRequestData.ADAPTER.decode(reader);
                                break;
                            case 4:
                                balanceRequestDataDecode = BalanceRequestData.ADAPTER.decode(reader);
                                break;
                            case 5:
                                arrayList2.add(MigrationKickoffAckData.ADAPTER.decode(reader));
                                break;
                            case 6:
                                checkEligibilityDataDecode = CheckEligibilityData.ADAPTER.decode(reader);
                                break;
                            case 7:
                                migrationFinalizeAckDataDecode = MigrationFinalizeAckData.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new MigrationData(arrayList, migrationInitiateAckDataDecode, migrationRequestDataDecode, balanceRequestDataDecode, arrayList2, checkEligibilityDataDecode, migrationFinalizeAckDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MigrationData redact(MigrationData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<MigrationPreInfo> listM26823redactElements = Internal.m26823redactElements(value.getMigration_pre_info(), MigrationPreInfo.ADAPTER);
                MigrationInitiateAckData migration_initiate_ack = value.getMigration_initiate_ack();
                MigrationInitiateAckData migrationInitiateAckDataRedact = migration_initiate_ack != null ? MigrationInitiateAckData.ADAPTER.redact(migration_initiate_ack) : null;
                MigrationRequestData migration_request = value.getMigration_request();
                MigrationRequestData migrationRequestDataRedact = migration_request != null ? MigrationRequestData.ADAPTER.redact(migration_request) : null;
                BalanceRequestData balance_request = value.getBalance_request();
                BalanceRequestData balanceRequestDataRedact = balance_request != null ? BalanceRequestData.ADAPTER.redact(balance_request) : null;
                List<MigrationKickoffAckData> listM26823redactElements2 = Internal.m26823redactElements(value.getMigration_kickoff_ack(), MigrationKickoffAckData.ADAPTER);
                CheckEligibilityData check_eligibility = value.getCheck_eligibility();
                CheckEligibilityData checkEligibilityDataRedact = check_eligibility != null ? CheckEligibilityData.ADAPTER.redact(check_eligibility) : null;
                MigrationFinalizeAckData migration_finalize_ack = value.getMigration_finalize_ack();
                return value.copy(listM26823redactElements, migrationInitiateAckDataRedact, migrationRequestDataRedact, balanceRequestDataRedact, listM26823redactElements2, checkEligibilityDataRedact, migration_finalize_ack != null ? MigrationFinalizeAckData.ADAPTER.redact(migration_finalize_ack) : null, ByteString.EMPTY);
            }
        };
    }
}
