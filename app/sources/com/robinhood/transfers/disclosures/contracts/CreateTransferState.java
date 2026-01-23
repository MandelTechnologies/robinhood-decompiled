package com.robinhood.transfers.disclosures.contracts;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.robinhood.lib.transfers.contracts.TransferEntryPoint;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.datasource.utils.BigDecimalSerializer;

/* compiled from: CreateTransferState.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0004KLMNB\u0080\u0001\u0012\u0019\u0010\u0002\u001a\u00150\u0003j\u0002`\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aB\u007f\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0019\u0010\u001fJ\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00106\u001a\u00020\u001cH\u0016J\u001c\u00107\u001a\u00150\u0003j\u0002`\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010>\u001a\u00020\u0014HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u008e\u0001\u0010A\u001a\u00020\u00002\u001b\b\u0002\u0010\u0002\u001a\u00150\u0003j\u0002`\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\t\u0010B\u001a\u00020\u0010HÖ\u0001J%\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0001¢\u0006\u0002\bJR$\u0010\u0002\u001a\u00150\u0003j\u0002`\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006O"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState;", "", "amount", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lkotlin/reflect/KClass;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "source", "Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount;", "sink", "frequency", "Lcom/robinhood/transfers/disclosures/contracts/TransferFrequency;", "additional_data", "Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAdditionalData;", "currency", "", "transfer_type", "Lcom/robinhood/transfers/disclosures/contracts/TransferType;", "mode", "Lcom/robinhood/transfers/disclosures/contracts/TransferMode;", "service_fee_params", "Lcom/robinhood/transfers/disclosures/contracts/ServiceFeeParams;", "entry_point", "Lcom/robinhood/lib/transfers/contracts/TransferEntryPoint;", "<init>", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount;Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount;Lcom/robinhood/transfers/disclosures/contracts/TransferFrequency;Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAdditionalData;Ljava/lang/String;Lcom/robinhood/transfers/disclosures/contracts/TransferType;Lcom/robinhood/transfers/disclosures/contracts/TransferMode;Lcom/robinhood/transfers/disclosures/contracts/ServiceFeeParams;Lcom/robinhood/lib/transfers/contracts/TransferEntryPoint;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount;Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount;Lcom/robinhood/transfers/disclosures/contracts/TransferFrequency;Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAdditionalData;Ljava/lang/String;Lcom/robinhood/transfers/disclosures/contracts/TransferType;Lcom/robinhood/transfers/disclosures/contracts/TransferMode;Lcom/robinhood/transfers/disclosures/contracts/ServiceFeeParams;Lcom/robinhood/lib/transfers/contracts/TransferEntryPoint;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAmount", "()Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "getSource", "()Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount;", "getSink", "getFrequency", "()Lcom/robinhood/transfers/disclosures/contracts/TransferFrequency;", "getAdditional_data", "()Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAdditionalData;", "getCurrency", "()Ljava/lang/String;", "getTransfer_type", "()Lcom/robinhood/transfers/disclosures/contracts/TransferType;", "getMode", "()Lcom/robinhood/transfers/disclosures/contracts/TransferMode;", "getService_fee_params", "()Lcom/robinhood/transfers/disclosures/contracts/ServiceFeeParams;", "getEntry_point", "()Lcom/robinhood/lib/transfers/contracts/TransferEntryPoint;", "equals", "", "other", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "ApiTransferAccount", "ApiTransferAdditionalData", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class CreateTransferState {
    private final ApiTransferAdditionalData additional_data;
    private final BigDecimal amount;
    private final String currency;
    private final TransferEntryPoint entry_point;
    private final CreateTransferState6 frequency;
    private final TransferMode mode;
    private final ServiceFeeParams service_fee_params;
    private final ApiTransferAccount sink;
    private final ApiTransferAccount source;
    private final TransferType transfer_type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, CreateTransferState6.INSTANCE.serializer(), null, null, TransferType.INSTANCE.serializer(), TransferMode.INSTANCE.serializer(), null, TransferEntryPoint.INSTANCE.serializer()};

    public static /* synthetic */ CreateTransferState copy$default(CreateTransferState createTransferState, BigDecimal bigDecimal, ApiTransferAccount apiTransferAccount, ApiTransferAccount apiTransferAccount2, CreateTransferState6 createTransferState6, ApiTransferAdditionalData apiTransferAdditionalData, String str, TransferType transferType, TransferMode transferMode, ServiceFeeParams serviceFeeParams, TransferEntryPoint transferEntryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = createTransferState.amount;
        }
        if ((i & 2) != 0) {
            apiTransferAccount = createTransferState.source;
        }
        if ((i & 4) != 0) {
            apiTransferAccount2 = createTransferState.sink;
        }
        if ((i & 8) != 0) {
            createTransferState6 = createTransferState.frequency;
        }
        if ((i & 16) != 0) {
            apiTransferAdditionalData = createTransferState.additional_data;
        }
        if ((i & 32) != 0) {
            str = createTransferState.currency;
        }
        if ((i & 64) != 0) {
            transferType = createTransferState.transfer_type;
        }
        if ((i & 128) != 0) {
            transferMode = createTransferState.mode;
        }
        if ((i & 256) != 0) {
            serviceFeeParams = createTransferState.service_fee_params;
        }
        if ((i & 512) != 0) {
            transferEntryPoint = createTransferState.entry_point;
        }
        ServiceFeeParams serviceFeeParams2 = serviceFeeParams;
        TransferEntryPoint transferEntryPoint2 = transferEntryPoint;
        TransferType transferType2 = transferType;
        TransferMode transferMode2 = transferMode;
        ApiTransferAdditionalData apiTransferAdditionalData2 = apiTransferAdditionalData;
        String str2 = str;
        return createTransferState.copy(bigDecimal, apiTransferAccount, apiTransferAccount2, createTransferState6, apiTransferAdditionalData2, str2, transferType2, transferMode2, serviceFeeParams2, transferEntryPoint2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component10, reason: from getter */
    public final TransferEntryPoint getEntry_point() {
        return this.entry_point;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiTransferAccount getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiTransferAccount getSink() {
        return this.sink;
    }

    /* renamed from: component4, reason: from getter */
    public final CreateTransferState6 getFrequency() {
        return this.frequency;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiTransferAdditionalData getAdditional_data() {
        return this.additional_data;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component7, reason: from getter */
    public final TransferType getTransfer_type() {
        return this.transfer_type;
    }

    /* renamed from: component8, reason: from getter */
    public final TransferMode getMode() {
        return this.mode;
    }

    /* renamed from: component9, reason: from getter */
    public final ServiceFeeParams getService_fee_params() {
        return this.service_fee_params;
    }

    public final CreateTransferState copy(BigDecimal amount, ApiTransferAccount source, ApiTransferAccount sink, CreateTransferState6 frequency, ApiTransferAdditionalData additional_data, String currency, TransferType transfer_type, TransferMode mode, ServiceFeeParams service_fee_params, TransferEntryPoint entry_point) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new CreateTransferState(amount, source, sink, frequency, additional_data, currency, transfer_type, mode, service_fee_params, entry_point);
    }

    public String toString() {
        return "CreateTransferState(amount=" + this.amount + ", source=" + this.source + ", sink=" + this.sink + ", frequency=" + this.frequency + ", additional_data=" + this.additional_data + ", currency=" + this.currency + ", transfer_type=" + this.transfer_type + ", mode=" + this.mode + ", service_fee_params=" + this.service_fee_params + ", entry_point=" + this.entry_point + ")";
    }

    /* compiled from: CreateTransferState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateTransferState> serializer() {
            return CreateTransferState3.INSTANCE;
        }
    }

    public /* synthetic */ CreateTransferState(int i, BigDecimal bigDecimal, ApiTransferAccount apiTransferAccount, ApiTransferAccount apiTransferAccount2, CreateTransferState6 createTransferState6, ApiTransferAdditionalData apiTransferAdditionalData, String str, TransferType transferType, TransferMode transferMode, ServiceFeeParams serviceFeeParams, TransferEntryPoint transferEntryPoint, SerializationConstructorMarker serializationConstructorMarker) {
        if (399 != (i & 399)) {
            PluginExceptions.throwMissingFieldException(i, 399, CreateTransferState3.INSTANCE.getDescriptor());
        }
        this.amount = bigDecimal;
        this.source = apiTransferAccount;
        this.sink = apiTransferAccount2;
        this.frequency = createTransferState6;
        if ((i & 16) == 0) {
            this.additional_data = null;
        } else {
            this.additional_data = apiTransferAdditionalData;
        }
        if ((i & 32) == 0) {
            this.currency = null;
        } else {
            this.currency = str;
        }
        if ((i & 64) == 0) {
            this.transfer_type = null;
        } else {
            this.transfer_type = transferType;
        }
        this.mode = transferMode;
        this.service_fee_params = serviceFeeParams;
        if ((i & 512) == 0) {
            this.entry_point = null;
        } else {
            this.entry_point = transferEntryPoint;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(CreateTransferState self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, BigDecimalSerializer.INSTANCE, self.amount);
        CreateTransferState4 createTransferState4 = CreateTransferState4.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, createTransferState4, self.source);
        output.encodeNullableSerializableElement(serialDesc, 2, createTransferState4, self.sink);
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.frequency);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.additional_data != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, CreateTransferState5.INSTANCE, self.additional_data);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.currency != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.currency);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.transfer_type != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, kSerializerArr[6], self.transfer_type);
        }
        output.encodeSerializableElement(serialDesc, 7, kSerializerArr[7], self.mode);
        output.encodeNullableSerializableElement(serialDesc, 8, ServiceFeeParams2.INSTANCE, self.service_fee_params);
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.entry_point == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, kSerializerArr[9], self.entry_point);
    }

    public CreateTransferState(BigDecimal amount, ApiTransferAccount apiTransferAccount, ApiTransferAccount apiTransferAccount2, CreateTransferState6 frequency, ApiTransferAdditionalData apiTransferAdditionalData, String str, TransferType transferType, TransferMode mode, ServiceFeeParams serviceFeeParams, TransferEntryPoint transferEntryPoint) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.amount = amount;
        this.source = apiTransferAccount;
        this.sink = apiTransferAccount2;
        this.frequency = frequency;
        this.additional_data = apiTransferAdditionalData;
        this.currency = str;
        this.transfer_type = transferType;
        this.mode = mode;
        this.service_fee_params = serviceFeeParams;
        this.entry_point = transferEntryPoint;
    }

    public /* synthetic */ CreateTransferState(BigDecimal bigDecimal, ApiTransferAccount apiTransferAccount, ApiTransferAccount apiTransferAccount2, CreateTransferState6 createTransferState6, ApiTransferAdditionalData apiTransferAdditionalData, String str, TransferType transferType, TransferMode transferMode, ServiceFeeParams serviceFeeParams, TransferEntryPoint transferEntryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, apiTransferAccount, apiTransferAccount2, createTransferState6, (i & 16) != 0 ? null : apiTransferAdditionalData, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : transferType, transferMode, serviceFeeParams, (i & 512) != 0 ? null : transferEntryPoint);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final ApiTransferAccount getSource() {
        return this.source;
    }

    public final ApiTransferAccount getSink() {
        return this.sink;
    }

    public final CreateTransferState6 getFrequency() {
        return this.frequency;
    }

    public final ApiTransferAdditionalData getAdditional_data() {
        return this.additional_data;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final TransferType getTransfer_type() {
        return this.transfer_type;
    }

    public final TransferMode getMode() {
        return this.mode;
    }

    public final ServiceFeeParams getService_fee_params() {
        return this.service_fee_params;
    }

    public final TransferEntryPoint getEntry_point() {
        return this.entry_point;
    }

    /* compiled from: CreateTransferState.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\fH\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006+"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount;", "", "managementInfo", "Lcom/robinhood/transfers/disclosures/contracts/ManagementInfo;", "type", "Lcom/robinhood/transfers/disclosures/contracts/TransferAccountType;", "accountNumber", "", "currency", "<init>", "(Lcom/robinhood/transfers/disclosures/contracts/ManagementInfo;Lcom/robinhood/transfers/disclosures/contracts/TransferAccountType;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/transfers/disclosures/contracts/ManagementInfo;Lcom/robinhood/transfers/disclosures/contracts/TransferAccountType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getManagementInfo", "()Lcom/robinhood/transfers/disclosures/contracts/ManagementInfo;", "getType", "()Lcom/robinhood/transfers/disclosures/contracts/TransferAccountType;", "getAccountNumber", "()Ljava/lang/String;", "getCurrency", "equals", "", "other", "hashCode", "component1", "component2", "component3", "component4", "copy", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class ApiTransferAccount {
        private final String accountNumber;
        private final String currency;
        private final ManagementInfo managementInfo;
        private final TransferAccountType type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, TransferAccountType.INSTANCE.serializer(), null, null};

        public static /* synthetic */ ApiTransferAccount copy$default(ApiTransferAccount apiTransferAccount, ManagementInfo managementInfo, TransferAccountType transferAccountType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                managementInfo = apiTransferAccount.managementInfo;
            }
            if ((i & 2) != 0) {
                transferAccountType = apiTransferAccount.type;
            }
            if ((i & 4) != 0) {
                str = apiTransferAccount.accountNumber;
            }
            if ((i & 8) != 0) {
                str2 = apiTransferAccount.currency;
            }
            return apiTransferAccount.copy(managementInfo, transferAccountType, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final ManagementInfo getManagementInfo() {
            return this.managementInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferAccountType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        public final ApiTransferAccount copy(ManagementInfo managementInfo, TransferAccountType type2, String accountNumber, String currency) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new ApiTransferAccount(managementInfo, type2, accountNumber, currency);
        }

        public String toString() {
            return "ApiTransferAccount(managementInfo=" + this.managementInfo + ", type=" + this.type + ", accountNumber=" + this.accountNumber + ", currency=" + this.currency + ")";
        }

        /* compiled from: CreateTransferState.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ApiTransferAccount> serializer() {
                return CreateTransferState4.INSTANCE;
            }
        }

        public /* synthetic */ ApiTransferAccount(int i, ManagementInfo managementInfo, TransferAccountType transferAccountType, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (2 != (i & 2)) {
                PluginExceptions.throwMissingFieldException(i, 2, CreateTransferState4.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.managementInfo = null;
            } else {
                this.managementInfo = managementInfo;
            }
            this.type = transferAccountType;
            if ((i & 4) == 0) {
                this.accountNumber = null;
            } else {
                this.accountNumber = str;
            }
            if ((i & 8) == 0) {
                this.currency = null;
            } else {
                this.currency = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(ApiTransferAccount self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.managementInfo != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ManagementInfo2.INSTANCE, self.managementInfo);
            }
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.type);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.accountNumber != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.accountNumber);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.currency == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.currency);
        }

        public ApiTransferAccount(ManagementInfo managementInfo, TransferAccountType type2, String str, String str2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.managementInfo = managementInfo;
            this.type = type2;
            this.accountNumber = str;
            this.currency = str2;
        }

        public /* synthetic */ ApiTransferAccount(ManagementInfo managementInfo, TransferAccountType transferAccountType, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : managementInfo, transferAccountType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
        }

        public final ManagementInfo getManagementInfo() {
            return this.managementInfo;
        }

        public final TransferAccountType getType() {
            return this.type;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public boolean equals(Object other) {
            return (other instanceof ApiTransferAccount) && this.type == ((ApiTransferAccount) other).type;
        }

        public int hashCode() {
            Iterator it = CollectionsKt.listOf(this.type).iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode *= 31 * (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* compiled from: CreateTransferState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\tJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAdditionalData;", "", "entry_point", "", "<init>", "(I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEntry_point", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class ApiTransferAdditionalData {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int entry_point;

        public ApiTransferAdditionalData() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ ApiTransferAdditionalData copy$default(ApiTransferAdditionalData apiTransferAdditionalData, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = apiTransferAdditionalData.entry_point;
            }
            return apiTransferAdditionalData.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getEntry_point() {
            return this.entry_point;
        }

        public final ApiTransferAdditionalData copy(int entry_point) {
            return new ApiTransferAdditionalData(entry_point);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApiTransferAdditionalData) && this.entry_point == ((ApiTransferAdditionalData) other).entry_point;
        }

        public int hashCode() {
            return Integer.hashCode(this.entry_point);
        }

        public String toString() {
            return "ApiTransferAdditionalData(entry_point=" + this.entry_point + ")";
        }

        /* compiled from: CreateTransferState.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAdditionalData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAdditionalData;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ApiTransferAdditionalData> serializer() {
                return CreateTransferState5.INSTANCE;
            }
        }

        public /* synthetic */ ApiTransferAdditionalData(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.entry_point = -1;
            } else {
                this.entry_point = i2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(ApiTransferAdditionalData self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.entry_point == -1) {
                return;
            }
            output.encodeIntElement(serialDesc, 0, self.entry_point);
        }

        public ApiTransferAdditionalData(int i) {
            this.entry_point = i;
        }

        public /* synthetic */ ApiTransferAdditionalData(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -1 : i);
        }

        public final int getEntry_point() {
            return this.entry_point;
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof CreateTransferState)) {
            return false;
        }
        CreateTransferState createTransferState = (CreateTransferState) other;
        return Intrinsics.areEqual(this.source, createTransferState.source) && Intrinsics.areEqual(this.sink, createTransferState.sink) && this.frequency == createTransferState.frequency && this.transfer_type == createTransferState.transfer_type && this.mode == createTransferState.mode;
    }

    public int hashCode() {
        Iterator it = CollectionsKt.listOf(this.sink, this.source, this.frequency, this.transfer_type, this.mode).iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode *= 31 * (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }
}
