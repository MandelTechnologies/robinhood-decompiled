package com.robinhood.transfers.accounts.contracts.model;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.robinhood.lib.transfers.contracts.models.TransferDirection;
import kotlin.Metadata;
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
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002:;BZ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0019\u0010\u0004\u001a\u00150\u0005j\u0002`\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013Ba\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u001c\u0010&\u001a\u00150\u0005j\u0002`\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jh\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001b\b\u0002\u0010\u0004\u001a\u00150\u0005j\u0002`\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0015HÖ\u0001J\t\u00101\u001a\u00020\u000bHÖ\u0001J%\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\b9R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u00150\u0005j\u0002`\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006<"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/model/CreateTransferState;", "", "direction", "Lcom/robinhood/lib/transfers/contracts/models/TransferDirection;", "amount", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lkotlin/reflect/KClass;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "currency", "", "frequency", "Lcom/robinhood/transfers/accounts/contracts/model/TransferFrequency;", "sourceAccountId", "sinkAccountId", "iraContributionType", "Lcom/robinhood/transfers/accounts/contracts/model/IraContributionType;", "<init>", "(Lcom/robinhood/lib/transfers/contracts/models/TransferDirection;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Lcom/robinhood/transfers/accounts/contracts/model/TransferFrequency;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/transfers/accounts/contracts/model/IraContributionType;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/lib/transfers/contracts/models/TransferDirection;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Lcom/robinhood/transfers/accounts/contracts/model/TransferFrequency;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/transfers/accounts/contracts/model/IraContributionType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDirection", "()Lcom/robinhood/lib/transfers/contracts/models/TransferDirection;", "getAmount", "()Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "getCurrency", "()Ljava/lang/String;", "getFrequency", "()Lcom/robinhood/transfers/accounts/contracts/model/TransferFrequency;", "getSourceAccountId", "getSinkAccountId", "getIraContributionType", "()Lcom/robinhood/transfers/accounts/contracts/model/IraContributionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class CreateTransferState {
    private final BigDecimal amount;
    private final String currency;
    private final TransferDirection direction;
    private final TransferFrequency frequency;
    private final IraContributionType iraContributionType;
    private final String sinkAccountId;
    private final String sourceAccountId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {TransferDirection.INSTANCE.serializer(), null, null, TransferFrequency.INSTANCE.serializer(), null, null, IraContributionType.INSTANCE.serializer()};

    public static /* synthetic */ CreateTransferState copy$default(CreateTransferState createTransferState, TransferDirection transferDirection, BigDecimal bigDecimal, String str, TransferFrequency transferFrequency, String str2, String str3, IraContributionType iraContributionType, int i, Object obj) {
        if ((i & 1) != 0) {
            transferDirection = createTransferState.direction;
        }
        if ((i & 2) != 0) {
            bigDecimal = createTransferState.amount;
        }
        if ((i & 4) != 0) {
            str = createTransferState.currency;
        }
        if ((i & 8) != 0) {
            transferFrequency = createTransferState.frequency;
        }
        if ((i & 16) != 0) {
            str2 = createTransferState.sourceAccountId;
        }
        if ((i & 32) != 0) {
            str3 = createTransferState.sinkAccountId;
        }
        if ((i & 64) != 0) {
            iraContributionType = createTransferState.iraContributionType;
        }
        String str4 = str3;
        IraContributionType iraContributionType2 = iraContributionType;
        String str5 = str2;
        String str6 = str;
        return createTransferState.copy(transferDirection, bigDecimal, str6, transferFrequency, str5, str4, iraContributionType2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component4, reason: from getter */
    public final TransferFrequency getFrequency() {
        return this.frequency;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSourceAccountId() {
        return this.sourceAccountId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSinkAccountId() {
        return this.sinkAccountId;
    }

    /* renamed from: component7, reason: from getter */
    public final IraContributionType getIraContributionType() {
        return this.iraContributionType;
    }

    public final CreateTransferState copy(TransferDirection direction, BigDecimal amount, String currency, TransferFrequency frequency, String sourceAccountId, String sinkAccountId, IraContributionType iraContributionType) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return new CreateTransferState(direction, amount, currency, frequency, sourceAccountId, sinkAccountId, iraContributionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTransferState)) {
            return false;
        }
        CreateTransferState createTransferState = (CreateTransferState) other;
        return this.direction == createTransferState.direction && Intrinsics.areEqual(this.amount, createTransferState.amount) && Intrinsics.areEqual(this.currency, createTransferState.currency) && this.frequency == createTransferState.frequency && Intrinsics.areEqual(this.sourceAccountId, createTransferState.sourceAccountId) && Intrinsics.areEqual(this.sinkAccountId, createTransferState.sinkAccountId) && this.iraContributionType == createTransferState.iraContributionType;
    }

    public int hashCode() {
        int iHashCode = ((((((this.direction.hashCode() * 31) + this.amount.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.frequency.hashCode()) * 31;
        String str = this.sourceAccountId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sinkAccountId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IraContributionType iraContributionType = this.iraContributionType;
        return iHashCode3 + (iraContributionType != null ? iraContributionType.hashCode() : 0);
    }

    public String toString() {
        return "CreateTransferState(direction=" + this.direction + ", amount=" + this.amount + ", currency=" + this.currency + ", frequency=" + this.frequency + ", sourceAccountId=" + this.sourceAccountId + ", sinkAccountId=" + this.sinkAccountId + ", iraContributionType=" + this.iraContributionType + ")";
    }

    /* compiled from: CreateTransferState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/model/CreateTransferState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/accounts/contracts/model/CreateTransferState;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateTransferState> serializer() {
            return CreateTransferState2.INSTANCE;
        }
    }

    public /* synthetic */ CreateTransferState(int i, TransferDirection transferDirection, BigDecimal bigDecimal, String str, TransferFrequency transferFrequency, String str2, String str3, IraContributionType iraContributionType, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptions.throwMissingFieldException(i, 63, CreateTransferState2.INSTANCE.getDescriptor());
        }
        this.direction = transferDirection;
        this.amount = bigDecimal;
        this.currency = str;
        this.frequency = transferFrequency;
        this.sourceAccountId = str2;
        this.sinkAccountId = str3;
        if ((i & 64) == 0) {
            this.iraContributionType = null;
        } else {
            this.iraContributionType = iraContributionType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(CreateTransferState self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.direction);
        output.encodeSerializableElement(serialDesc, 1, BigDecimalSerializer.INSTANCE, self.amount);
        output.encodeStringElement(serialDesc, 2, self.currency);
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.frequency);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.sourceAccountId);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.sinkAccountId);
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.iraContributionType == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, kSerializerArr[6], self.iraContributionType);
    }

    public CreateTransferState(TransferDirection direction, BigDecimal amount, String currency, TransferFrequency frequency, String str, String str2, IraContributionType iraContributionType) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.direction = direction;
        this.amount = amount;
        this.currency = currency;
        this.frequency = frequency;
        this.sourceAccountId = str;
        this.sinkAccountId = str2;
        this.iraContributionType = iraContributionType;
    }

    public /* synthetic */ CreateTransferState(TransferDirection transferDirection, BigDecimal bigDecimal, String str, TransferFrequency transferFrequency, String str2, String str3, IraContributionType iraContributionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferDirection, bigDecimal, str, transferFrequency, str2, str3, (i & 64) != 0 ? null : iraContributionType);
    }

    public final TransferDirection getDirection() {
        return this.direction;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final TransferFrequency getFrequency() {
        return this.frequency;
    }

    public final String getSourceAccountId() {
        return this.sourceAccountId;
    }

    public final String getSinkAccountId() {
        return this.sinkAccountId;
    }

    public final IraContributionType getIraContributionType() {
        return this.iraContributionType;
    }
}
