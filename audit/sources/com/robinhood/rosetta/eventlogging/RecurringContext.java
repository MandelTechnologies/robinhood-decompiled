package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.Constants;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.rosetta.eventlogging.RecurringContext;
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

/* compiled from: RecurringContext.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0007456789:Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\bH\u0016Jt\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0016\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001e¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "Lcom/squareup/wire/Message;", "", "flow_type", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", Constants.REFERRER, "", "frequency", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "source_of_funds", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;", "amount", "", "asset_type", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;", "upsell_type", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$UpsellType;", "percentage_of_direct_deposit", "direct_deposit_relationship_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;DLcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;Lcom/robinhood/rosetta/eventlogging/RecurringContext$UpsellType;DLjava/lang/String;Lokio/ByteString;)V", "getFlow_type", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "getReferrer", "()Ljava/lang/String;", "getFrequency", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "getSource_of_funds", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;", "getAmount", "()D", "getAsset_type", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;", "getUpsell_type", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$UpsellType;", "getPercentage_of_direct_deposit", "getDirect_deposit_relationship_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "FlowType", "EntryPoint", "ScheduleFrequency", "RecurringFundsSource", "AssetType", "UpsellType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class RecurringContext extends Message {

    @JvmField
    public static final ProtoAdapter<RecurringContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double amount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RecurringContext$AssetType#ADAPTER", jsonName = "assetType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final AssetType asset_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "directDepositRelationshipId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String direct_deposit_relationship_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RecurringContext$EntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EntryPoint entry_point;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RecurringContext$FlowType#ADAPTER", jsonName = "flowType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FlowType flow_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RecurringContext$ScheduleFrequency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ScheduleFrequency frequency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "percentageOfDirectDeposit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final double percentage_of_direct_deposit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String referrer;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RecurringContext$RecurringFundsSource#ADAPTER", jsonName = "sourceOfFunds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final RecurringFundsSource source_of_funds;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RecurringContext$UpsellType#ADAPTER", jsonName = "upsellType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final UpsellType upsell_type;

    public RecurringContext() {
        this(null, null, null, null, null, 0.0d, null, null, 0.0d, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24530newBuilder();
    }

    public final FlowType getFlow_type() {
        return this.flow_type;
    }

    public /* synthetic */ RecurringContext(FlowType flowType, EntryPoint entryPoint, String str, ScheduleFrequency scheduleFrequency, RecurringFundsSource recurringFundsSource, double d, AssetType assetType, UpsellType upsellType, double d2, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FlowType.FLOW_TYPE_UNSPECIFIED : flowType, (i & 2) != 0 ? EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ScheduleFrequency.SCHEDULE_FREQUENCY_UNSPECIFIED : scheduleFrequency, (i & 16) != 0 ? RecurringFundsSource.RECURRING_FUNDS_SOURCE_UNSPECIFIED : recurringFundsSource, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? AssetType.ASSET_TYPE_UNSPECIFIED : assetType, (i & 128) != 0 ? UpsellType.UPSELL_TYPE_UNSPECIFIED : upsellType, (i & 256) == 0 ? d2 : 0.0d, (i & 512) == 0 ? str2 : "", (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final ScheduleFrequency getFrequency() {
        return this.frequency;
    }

    public final RecurringFundsSource getSource_of_funds() {
        return this.source_of_funds;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final AssetType getAsset_type() {
        return this.asset_type;
    }

    public final UpsellType getUpsell_type() {
        return this.upsell_type;
    }

    public final double getPercentage_of_direct_deposit() {
        return this.percentage_of_direct_deposit;
    }

    public final String getDirect_deposit_relationship_id() {
        return this.direct_deposit_relationship_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringContext(FlowType flow_type, EntryPoint entry_point, String referrer, ScheduleFrequency frequency, RecurringFundsSource source_of_funds, double d, AssetType asset_type, UpsellType upsell_type, double d2, String direct_deposit_relationship_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(flow_type, "flow_type");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(source_of_funds, "source_of_funds");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(upsell_type, "upsell_type");
        Intrinsics.checkNotNullParameter(direct_deposit_relationship_id, "direct_deposit_relationship_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.flow_type = flow_type;
        this.entry_point = entry_point;
        this.referrer = referrer;
        this.frequency = frequency;
        this.source_of_funds = source_of_funds;
        this.amount = d;
        this.asset_type = asset_type;
        this.upsell_type = upsell_type;
        this.percentage_of_direct_deposit = d2;
        this.direct_deposit_relationship_id = direct_deposit_relationship_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24530newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RecurringContext)) {
            return false;
        }
        RecurringContext recurringContext = (RecurringContext) other;
        return Intrinsics.areEqual(unknownFields(), recurringContext.unknownFields()) && this.flow_type == recurringContext.flow_type && this.entry_point == recurringContext.entry_point && Intrinsics.areEqual(this.referrer, recurringContext.referrer) && this.frequency == recurringContext.frequency && this.source_of_funds == recurringContext.source_of_funds && this.amount == recurringContext.amount && this.asset_type == recurringContext.asset_type && this.upsell_type == recurringContext.upsell_type && this.percentage_of_direct_deposit == recurringContext.percentage_of_direct_deposit && Intrinsics.areEqual(this.direct_deposit_relationship_id, recurringContext.direct_deposit_relationship_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((unknownFields().hashCode() * 37) + this.flow_type.hashCode()) * 37) + this.entry_point.hashCode()) * 37) + this.referrer.hashCode()) * 37) + this.frequency.hashCode()) * 37) + this.source_of_funds.hashCode()) * 37) + Double.hashCode(this.amount)) * 37) + this.asset_type.hashCode()) * 37) + this.upsell_type.hashCode()) * 37) + Double.hashCode(this.percentage_of_direct_deposit)) * 37) + this.direct_deposit_relationship_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("flow_type=" + this.flow_type);
        arrayList.add("entry_point=" + this.entry_point);
        arrayList.add("referrer=" + Internal.sanitize(this.referrer));
        arrayList.add("frequency=" + this.frequency);
        arrayList.add("source_of_funds=" + this.source_of_funds);
        arrayList.add("amount=" + this.amount);
        arrayList.add("asset_type=" + this.asset_type);
        arrayList.add("upsell_type=" + this.upsell_type);
        arrayList.add("percentage_of_direct_deposit=" + this.percentage_of_direct_deposit);
        arrayList.add("direct_deposit_relationship_id=" + Internal.sanitize(this.direct_deposit_relationship_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RecurringContext copy$default(RecurringContext recurringContext, FlowType flowType, EntryPoint entryPoint, String str, ScheduleFrequency scheduleFrequency, RecurringFundsSource recurringFundsSource, double d, AssetType assetType, UpsellType upsellType, double d2, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            flowType = recurringContext.flow_type;
        }
        return recurringContext.copy(flowType, (i & 2) != 0 ? recurringContext.entry_point : entryPoint, (i & 4) != 0 ? recurringContext.referrer : str, (i & 8) != 0 ? recurringContext.frequency : scheduleFrequency, (i & 16) != 0 ? recurringContext.source_of_funds : recurringFundsSource, (i & 32) != 0 ? recurringContext.amount : d, (i & 64) != 0 ? recurringContext.asset_type : assetType, (i & 128) != 0 ? recurringContext.upsell_type : upsellType, (i & 256) != 0 ? recurringContext.percentage_of_direct_deposit : d2, (i & 512) != 0 ? recurringContext.direct_deposit_relationship_id : str2, (i & 1024) != 0 ? recurringContext.unknownFields() : byteString);
    }

    public final RecurringContext copy(FlowType flow_type, EntryPoint entry_point, String referrer, ScheduleFrequency frequency, RecurringFundsSource source_of_funds, double amount, AssetType asset_type, UpsellType upsell_type, double percentage_of_direct_deposit, String direct_deposit_relationship_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(flow_type, "flow_type");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(source_of_funds, "source_of_funds");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(upsell_type, "upsell_type");
        Intrinsics.checkNotNullParameter(direct_deposit_relationship_id, "direct_deposit_relationship_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RecurringContext(flow_type, entry_point, referrer, frequency, source_of_funds, amount, asset_type, upsell_type, percentage_of_direct_deposit, direct_deposit_relationship_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecurringContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RecurringContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.RecurringContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RecurringContext value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getFlow_type() != RecurringContext.FlowType.FLOW_TYPE_UNSPECIFIED) {
                    size += RecurringContext.FlowType.ADAPTER.encodedSizeWithTag(1, value.getFlow_type());
                }
                if (value.getEntry_point() != RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    size += RecurringContext.EntryPoint.ADAPTER.encodedSizeWithTag(2, value.getEntry_point());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getReferrer());
                }
                if (value.getFrequency() != RecurringContext.ScheduleFrequency.SCHEDULE_FREQUENCY_UNSPECIFIED) {
                    size += RecurringContext.ScheduleFrequency.ADAPTER.encodedSizeWithTag(4, value.getFrequency());
                }
                if (value.getSource_of_funds() != RecurringContext.RecurringFundsSource.RECURRING_FUNDS_SOURCE_UNSPECIFIED) {
                    size += RecurringContext.RecurringFundsSource.ADAPTER.encodedSizeWithTag(5, value.getSource_of_funds());
                }
                if (!Double.valueOf(value.getAmount()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getAmount()));
                }
                if (value.getAsset_type() != RecurringContext.AssetType.ASSET_TYPE_UNSPECIFIED) {
                    size += RecurringContext.AssetType.ADAPTER.encodedSizeWithTag(7, value.getAsset_type());
                }
                if (value.getUpsell_type() != RecurringContext.UpsellType.UPSELL_TYPE_UNSPECIFIED) {
                    size += RecurringContext.UpsellType.ADAPTER.encodedSizeWithTag(8, value.getUpsell_type());
                }
                if (!Double.valueOf(value.getPercentage_of_direct_deposit()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(9, Double.valueOf(value.getPercentage_of_direct_deposit()));
                }
                return !Intrinsics.areEqual(value.getDirect_deposit_relationship_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(10, value.getDirect_deposit_relationship_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RecurringContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getFlow_type() != RecurringContext.FlowType.FLOW_TYPE_UNSPECIFIED) {
                    RecurringContext.FlowType.ADAPTER.encodeWithTag(writer, 1, (int) value.getFlow_type());
                }
                if (value.getEntry_point() != RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    RecurringContext.EntryPoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntry_point());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getReferrer());
                }
                if (value.getFrequency() != RecurringContext.ScheduleFrequency.SCHEDULE_FREQUENCY_UNSPECIFIED) {
                    RecurringContext.ScheduleFrequency.ADAPTER.encodeWithTag(writer, 4, (int) value.getFrequency());
                }
                if (value.getSource_of_funds() != RecurringContext.RecurringFundsSource.RECURRING_FUNDS_SOURCE_UNSPECIFIED) {
                    RecurringContext.RecurringFundsSource.ADAPTER.encodeWithTag(writer, 5, (int) value.getSource_of_funds());
                }
                if (!Double.valueOf(value.getAmount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getAmount()));
                }
                if (value.getAsset_type() != RecurringContext.AssetType.ASSET_TYPE_UNSPECIFIED) {
                    RecurringContext.AssetType.ADAPTER.encodeWithTag(writer, 7, (int) value.getAsset_type());
                }
                if (value.getUpsell_type() != RecurringContext.UpsellType.UPSELL_TYPE_UNSPECIFIED) {
                    RecurringContext.UpsellType.ADAPTER.encodeWithTag(writer, 8, (int) value.getUpsell_type());
                }
                if (!Double.valueOf(value.getPercentage_of_direct_deposit()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getPercentage_of_direct_deposit()));
                }
                if (!Intrinsics.areEqual(value.getDirect_deposit_relationship_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDirect_deposit_relationship_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RecurringContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDirect_deposit_relationship_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDirect_deposit_relationship_id());
                }
                if (!Double.valueOf(value.getPercentage_of_direct_deposit()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getPercentage_of_direct_deposit()));
                }
                if (value.getUpsell_type() != RecurringContext.UpsellType.UPSELL_TYPE_UNSPECIFIED) {
                    RecurringContext.UpsellType.ADAPTER.encodeWithTag(writer, 8, (int) value.getUpsell_type());
                }
                if (value.getAsset_type() != RecurringContext.AssetType.ASSET_TYPE_UNSPECIFIED) {
                    RecurringContext.AssetType.ADAPTER.encodeWithTag(writer, 7, (int) value.getAsset_type());
                }
                if (!Double.valueOf(value.getAmount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getAmount()));
                }
                if (value.getSource_of_funds() != RecurringContext.RecurringFundsSource.RECURRING_FUNDS_SOURCE_UNSPECIFIED) {
                    RecurringContext.RecurringFundsSource.ADAPTER.encodeWithTag(writer, 5, (int) value.getSource_of_funds());
                }
                if (value.getFrequency() != RecurringContext.ScheduleFrequency.SCHEDULE_FREQUENCY_UNSPECIFIED) {
                    RecurringContext.ScheduleFrequency.ADAPTER.encodeWithTag(writer, 4, (int) value.getFrequency());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getReferrer());
                }
                if (value.getEntry_point() != RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    RecurringContext.EntryPoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntry_point());
                }
                if (value.getFlow_type() != RecurringContext.FlowType.FLOW_TYPE_UNSPECIFIED) {
                    RecurringContext.FlowType.ADAPTER.encodeWithTag(writer, 1, (int) value.getFlow_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RecurringContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                RecurringContext.FlowType flowTypeDecode = RecurringContext.FlowType.FLOW_TYPE_UNSPECIFIED;
                RecurringContext.EntryPoint entryPoint = RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                RecurringContext.ScheduleFrequency scheduleFrequency = RecurringContext.ScheduleFrequency.SCHEDULE_FREQUENCY_UNSPECIFIED;
                RecurringContext.RecurringFundsSource recurringFundsSource = RecurringContext.RecurringFundsSource.RECURRING_FUNDS_SOURCE_UNSPECIFIED;
                RecurringContext.AssetType assetType = RecurringContext.AssetType.ASSET_TYPE_UNSPECIFIED;
                RecurringContext.UpsellType upsellType = RecurringContext.UpsellType.UPSELL_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                String strDecode = "";
                String strDecode2 = strDecode;
                RecurringContext.UpsellType upsellTypeDecode = upsellType;
                RecurringContext.AssetType assetTypeDecode = assetType;
                RecurringContext.RecurringFundsSource recurringFundsSourceDecode = recurringFundsSource;
                RecurringContext.ScheduleFrequency scheduleFrequencyDecode = scheduleFrequency;
                RecurringContext.EntryPoint entryPointDecode = entryPoint;
                while (true) {
                    RecurringContext.FlowType flowType = flowTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        flowTypeDecode = RecurringContext.FlowType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    try {
                                        entryPointDecode = RecurringContext.EntryPoint.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 3:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    try {
                                        scheduleFrequencyDecode = RecurringContext.ScheduleFrequency.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        recurringFundsSourceDecode = RecurringContext.RecurringFundsSource.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                case 6:
                                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 7:
                                    try {
                                        assetTypeDecode = RecurringContext.AssetType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                        break;
                                    }
                                case 8:
                                    try {
                                        upsellTypeDecode = RecurringContext.UpsellType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                        break;
                                    }
                                case 9:
                                    dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 10:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new RecurringContext(flowType, entryPointDecode, strDecode, scheduleFrequencyDecode, recurringFundsSourceDecode, dDoubleValue, assetTypeDecode, upsellTypeDecode, dDoubleValue2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RecurringContext redact(RecurringContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RecurringContext.copy$default(value, null, null, null, null, null, 0.0d, null, null, 0.0d, null, ByteString.EMPTY, 1023, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FLOW_TYPE_UNSPECIFIED", "CREATE", "EDIT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FlowType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FlowType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<FlowType> ADAPTER;
        public static final FlowType CREATE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FlowType EDIT;
        public static final FlowType FLOW_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ FlowType[] $values() {
            return new FlowType[]{FLOW_TYPE_UNSPECIFIED, CREATE, EDIT};
        }

        @JvmStatic
        public static final FlowType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<FlowType> getEntries() {
            return $ENTRIES;
        }

        private FlowType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final FlowType flowType = new FlowType("FLOW_TYPE_UNSPECIFIED", 0, 0);
            FLOW_TYPE_UNSPECIFIED = flowType;
            CREATE = new FlowType("CREATE", 1, 1);
            EDIT = new FlowType("EDIT", 2, 2);
            FlowType[] flowTypeArr$values = $values();
            $VALUES = flowTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(flowTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FlowType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<FlowType>(orCreateKotlinClass, syntax, flowType) { // from class: com.robinhood.rosetta.eventlogging.RecurringContext$FlowType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RecurringContext.FlowType fromValue(int value) {
                    return RecurringContext.FlowType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RecurringContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final FlowType fromValue(int value) {
                if (value == 0) {
                    return FlowType.FLOW_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return FlowType.CREATE;
                }
                if (value != 2) {
                    return null;
                }
                return FlowType.EDIT;
            }
        }

        public static FlowType valueOf(String str) {
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }

        public static FlowType[] values() {
            return (FlowType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_UNSPECIFIED", "RECURRING_HUB", "RECURRING_RECEIPT_UPSELL", "COMMS", "EQUITY_SELECT_ORDER_KIND_PAGE", "EQUITY_ORDER_RECEIPT", EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, "DOLLAR_BASED_ORDER_ENTRY", "CRYPTO_DETAIL_PAGE", "CRYPTO_SELECT_ORDER_KIND_PAGE", "CRYPTO_ORDER_RECEIPT", "PAYCHECK_INVESTMENT_HUB", "PAYCHECK_INVESTMENT_NO_DD", "ORDER_RECEIPT", "SELECT_ORDER_KIND_PAGE", "CARD", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;
        public static final EntryPoint CARD;
        public static final EntryPoint COMMS;
        public static final EntryPoint CRYPTO_DETAIL_PAGE;
        public static final EntryPoint CRYPTO_ORDER_RECEIPT;
        public static final EntryPoint CRYPTO_SELECT_ORDER_KIND_PAGE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint DOLLAR_BASED_ORDER_ENTRY;
        public static final EntryPoint ENTRY_POINT_UNSPECIFIED;
        public static final EntryPoint EQUITY_ORDER_RECEIPT;
        public static final EntryPoint EQUITY_SELECT_ORDER_KIND_PAGE;
        public static final EntryPoint ORDER_RECEIPT;
        public static final EntryPoint PAYCHECK_INVESTMENT_HUB;
        public static final EntryPoint PAYCHECK_INVESTMENT_NO_DD;
        public static final EntryPoint RECURRING_HUB;
        public static final EntryPoint RECURRING_RECEIPT_UPSELL;
        public static final EntryPoint SELECT_ORDER_KIND_PAGE;
        public static final EntryPoint STOCK_DETAIL_PAGE;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_UNSPECIFIED, RECURRING_HUB, RECURRING_RECEIPT_UPSELL, COMMS, EQUITY_SELECT_ORDER_KIND_PAGE, EQUITY_ORDER_RECEIPT, STOCK_DETAIL_PAGE, DOLLAR_BASED_ORDER_ENTRY, CRYPTO_DETAIL_PAGE, CRYPTO_SELECT_ORDER_KIND_PAGE, CRYPTO_ORDER_RECEIPT, PAYCHECK_INVESTMENT_HUB, PAYCHECK_INVESTMENT_NO_DD, ORDER_RECEIPT, SELECT_ORDER_KIND_PAGE, CARD};
        }

        @JvmStatic
        public static final EntryPoint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EntryPoint entryPoint = new EntryPoint("ENTRY_POINT_UNSPECIFIED", 0, 0);
            ENTRY_POINT_UNSPECIFIED = entryPoint;
            RECURRING_HUB = new EntryPoint("RECURRING_HUB", 1, 1);
            RECURRING_RECEIPT_UPSELL = new EntryPoint("RECURRING_RECEIPT_UPSELL", 2, 2);
            COMMS = new EntryPoint("COMMS", 3, 6);
            EQUITY_SELECT_ORDER_KIND_PAGE = new EntryPoint("EQUITY_SELECT_ORDER_KIND_PAGE", 4, 7);
            EQUITY_ORDER_RECEIPT = new EntryPoint("EQUITY_ORDER_RECEIPT", 5, 8);
            STOCK_DETAIL_PAGE = new EntryPoint(EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, 6, 9);
            DOLLAR_BASED_ORDER_ENTRY = new EntryPoint("DOLLAR_BASED_ORDER_ENTRY", 7, 10);
            CRYPTO_DETAIL_PAGE = new EntryPoint("CRYPTO_DETAIL_PAGE", 8, 11);
            CRYPTO_SELECT_ORDER_KIND_PAGE = new EntryPoint("CRYPTO_SELECT_ORDER_KIND_PAGE", 9, 12);
            CRYPTO_ORDER_RECEIPT = new EntryPoint("CRYPTO_ORDER_RECEIPT", 10, 13);
            PAYCHECK_INVESTMENT_HUB = new EntryPoint("PAYCHECK_INVESTMENT_HUB", 11, 14);
            PAYCHECK_INVESTMENT_NO_DD = new EntryPoint("PAYCHECK_INVESTMENT_NO_DD", 12, 15);
            ORDER_RECEIPT = new EntryPoint("ORDER_RECEIPT", 13, 3);
            SELECT_ORDER_KIND_PAGE = new EntryPoint("SELECT_ORDER_KIND_PAGE", 14, 4);
            CARD = new EntryPoint("CARD", 15, 5);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: com.robinhood.rosetta.eventlogging.RecurringContext$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RecurringContext.EntryPoint fromValue(int value) {
                    return RecurringContext.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RecurringContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryPoint fromValue(int value) {
                switch (value) {
                    case 0:
                        return EntryPoint.ENTRY_POINT_UNSPECIFIED;
                    case 1:
                        return EntryPoint.RECURRING_HUB;
                    case 2:
                        return EntryPoint.RECURRING_RECEIPT_UPSELL;
                    case 3:
                        return EntryPoint.ORDER_RECEIPT;
                    case 4:
                        return EntryPoint.SELECT_ORDER_KIND_PAGE;
                    case 5:
                        return EntryPoint.CARD;
                    case 6:
                        return EntryPoint.COMMS;
                    case 7:
                        return EntryPoint.EQUITY_SELECT_ORDER_KIND_PAGE;
                    case 8:
                        return EntryPoint.EQUITY_ORDER_RECEIPT;
                    case 9:
                        return EntryPoint.STOCK_DETAIL_PAGE;
                    case 10:
                        return EntryPoint.DOLLAR_BASED_ORDER_ENTRY;
                    case 11:
                        return EntryPoint.CRYPTO_DETAIL_PAGE;
                    case 12:
                        return EntryPoint.CRYPTO_SELECT_ORDER_KIND_PAGE;
                    case 13:
                        return EntryPoint.CRYPTO_ORDER_RECEIPT;
                    case 14:
                        return EntryPoint.PAYCHECK_INVESTMENT_HUB;
                    case 15:
                        return EntryPoint.PAYCHECK_INVESTMENT_NO_DD;
                    default:
                        return null;
                }
            }
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SCHEDULE_FREQUENCY_UNSPECIFIED", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY", "PAYCHECK", "ONCE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ScheduleFrequency implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ScheduleFrequency[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ScheduleFrequency> ADAPTER;
        public static final ScheduleFrequency BIWEEKLY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ScheduleFrequency DAILY;
        public static final ScheduleFrequency MONTHLY;
        public static final ScheduleFrequency ONCE;
        public static final ScheduleFrequency PAYCHECK;
        public static final ScheduleFrequency SCHEDULE_FREQUENCY_UNSPECIFIED;
        public static final ScheduleFrequency WEEKLY;
        private final int value;

        private static final /* synthetic */ ScheduleFrequency[] $values() {
            return new ScheduleFrequency[]{SCHEDULE_FREQUENCY_UNSPECIFIED, DAILY, WEEKLY, BIWEEKLY, MONTHLY, PAYCHECK, ONCE};
        }

        @JvmStatic
        public static final ScheduleFrequency fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ScheduleFrequency> getEntries() {
            return $ENTRIES;
        }

        private ScheduleFrequency(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ScheduleFrequency scheduleFrequency = new ScheduleFrequency("SCHEDULE_FREQUENCY_UNSPECIFIED", 0, 0);
            SCHEDULE_FREQUENCY_UNSPECIFIED = scheduleFrequency;
            DAILY = new ScheduleFrequency("DAILY", 1, 1);
            WEEKLY = new ScheduleFrequency("WEEKLY", 2, 2);
            BIWEEKLY = new ScheduleFrequency("BIWEEKLY", 3, 3);
            MONTHLY = new ScheduleFrequency("MONTHLY", 4, 4);
            PAYCHECK = new ScheduleFrequency("PAYCHECK", 5, 5);
            ONCE = new ScheduleFrequency("ONCE", 6, 6);
            ScheduleFrequency[] scheduleFrequencyArr$values = $values();
            $VALUES = scheduleFrequencyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(scheduleFrequencyArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ScheduleFrequency.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ScheduleFrequency>(orCreateKotlinClass, syntax, scheduleFrequency) { // from class: com.robinhood.rosetta.eventlogging.RecurringContext$ScheduleFrequency$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RecurringContext.ScheduleFrequency fromValue(int value) {
                    return RecurringContext.ScheduleFrequency.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RecurringContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ScheduleFrequency fromValue(int value) {
                switch (value) {
                    case 0:
                        return ScheduleFrequency.SCHEDULE_FREQUENCY_UNSPECIFIED;
                    case 1:
                        return ScheduleFrequency.DAILY;
                    case 2:
                        return ScheduleFrequency.WEEKLY;
                    case 3:
                        return ScheduleFrequency.BIWEEKLY;
                    case 4:
                        return ScheduleFrequency.MONTHLY;
                    case 5:
                        return ScheduleFrequency.PAYCHECK;
                    case 6:
                        return ScheduleFrequency.ONCE;
                    default:
                        return null;
                }
            }
        }

        public static ScheduleFrequency valueOf(String str) {
            return (ScheduleFrequency) Enum.valueOf(ScheduleFrequency.class, str);
        }

        public static ScheduleFrequency[] values() {
            return (ScheduleFrequency[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RECURRING_FUNDS_SOURCE_UNSPECIFIED", "BUYING_POWER", "ACH", "DIRECT_DEPOSIT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecurringFundsSource implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RecurringFundsSource[] $VALUES;
        public static final RecurringFundsSource ACH;

        @JvmField
        public static final ProtoAdapter<RecurringFundsSource> ADAPTER;
        public static final RecurringFundsSource BUYING_POWER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final RecurringFundsSource DIRECT_DEPOSIT;
        public static final RecurringFundsSource RECURRING_FUNDS_SOURCE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ RecurringFundsSource[] $values() {
            return new RecurringFundsSource[]{RECURRING_FUNDS_SOURCE_UNSPECIFIED, BUYING_POWER, ACH, DIRECT_DEPOSIT};
        }

        @JvmStatic
        public static final RecurringFundsSource fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<RecurringFundsSource> getEntries() {
            return $ENTRIES;
        }

        private RecurringFundsSource(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final RecurringFundsSource recurringFundsSource = new RecurringFundsSource("RECURRING_FUNDS_SOURCE_UNSPECIFIED", 0, 0);
            RECURRING_FUNDS_SOURCE_UNSPECIFIED = recurringFundsSource;
            BUYING_POWER = new RecurringFundsSource("BUYING_POWER", 1, 1);
            ACH = new RecurringFundsSource("ACH", 2, 2);
            DIRECT_DEPOSIT = new RecurringFundsSource("DIRECT_DEPOSIT", 3, 3);
            RecurringFundsSource[] recurringFundsSourceArr$values = $values();
            $VALUES = recurringFundsSourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(recurringFundsSourceArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecurringFundsSource.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<RecurringFundsSource>(orCreateKotlinClass, syntax, recurringFundsSource) { // from class: com.robinhood.rosetta.eventlogging.RecurringContext$RecurringFundsSource$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RecurringContext.RecurringFundsSource fromValue(int value) {
                    return RecurringContext.RecurringFundsSource.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RecurringContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final RecurringFundsSource fromValue(int value) {
                if (value == 0) {
                    return RecurringFundsSource.RECURRING_FUNDS_SOURCE_UNSPECIFIED;
                }
                if (value == 1) {
                    return RecurringFundsSource.BUYING_POWER;
                }
                if (value == 2) {
                    return RecurringFundsSource.ACH;
                }
                if (value != 3) {
                    return null;
                }
                return RecurringFundsSource.DIRECT_DEPOSIT;
            }
        }

        public static RecurringFundsSource valueOf(String str) {
            return (RecurringFundsSource) Enum.valueOf(RecurringFundsSource.class, str);
        }

        public static RecurringFundsSource[] values() {
            return (RecurringFundsSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ASSET_TYPE_UNSPECIFIED", "EQUITY", "CRYPTO", "BROKERAGE_CASH", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AssetType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AssetType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AssetType> ADAPTER;
        public static final AssetType ASSET_TYPE_UNSPECIFIED;
        public static final AssetType BROKERAGE_CASH;
        public static final AssetType CRYPTO;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AssetType EQUITY;
        private final int value;

        private static final /* synthetic */ AssetType[] $values() {
            return new AssetType[]{ASSET_TYPE_UNSPECIFIED, EQUITY, CRYPTO, BROKERAGE_CASH};
        }

        @JvmStatic
        public static final AssetType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AssetType> getEntries() {
            return $ENTRIES;
        }

        private AssetType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AssetType assetType = new AssetType("ASSET_TYPE_UNSPECIFIED", 0, 0);
            ASSET_TYPE_UNSPECIFIED = assetType;
            EQUITY = new AssetType("EQUITY", 1, 1);
            CRYPTO = new AssetType("CRYPTO", 2, 2);
            BROKERAGE_CASH = new AssetType("BROKERAGE_CASH", 3, 3);
            AssetType[] assetTypeArr$values = $values();
            $VALUES = assetTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(assetTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AssetType>(orCreateKotlinClass, syntax, assetType) { // from class: com.robinhood.rosetta.eventlogging.RecurringContext$AssetType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RecurringContext.AssetType fromValue(int value) {
                    return RecurringContext.AssetType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RecurringContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AssetType fromValue(int value) {
                if (value == 0) {
                    return AssetType.ASSET_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AssetType.EQUITY;
                }
                if (value == 2) {
                    return AssetType.CRYPTO;
                }
                if (value != 3) {
                    return null;
                }
                return AssetType.BROKERAGE_CASH;
            }
        }

        public static AssetType valueOf(String str) {
            return (AssetType) Enum.valueOf(AssetType.class, str);
        }

        public static AssetType[] values() {
            return (AssetType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$UpsellType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UPSELL_TYPE_UNSPECIFIED", "AGGRESSIVE", "QUIET", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpsellType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UpsellType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<UpsellType> ADAPTER;
        public static final UpsellType AGGRESSIVE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final UpsellType QUIET;
        public static final UpsellType UPSELL_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ UpsellType[] $values() {
            return new UpsellType[]{UPSELL_TYPE_UNSPECIFIED, AGGRESSIVE, QUIET};
        }

        @JvmStatic
        public static final UpsellType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<UpsellType> getEntries() {
            return $ENTRIES;
        }

        private UpsellType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final UpsellType upsellType = new UpsellType("UPSELL_TYPE_UNSPECIFIED", 0, 0);
            UPSELL_TYPE_UNSPECIFIED = upsellType;
            AGGRESSIVE = new UpsellType("AGGRESSIVE", 1, 1);
            QUIET = new UpsellType("QUIET", 2, 2);
            UpsellType[] upsellTypeArr$values = $values();
            $VALUES = upsellTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(upsellTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpsellType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<UpsellType>(orCreateKotlinClass, syntax, upsellType) { // from class: com.robinhood.rosetta.eventlogging.RecurringContext$UpsellType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public RecurringContext.UpsellType fromValue(int value) {
                    return RecurringContext.UpsellType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: RecurringContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContext$UpsellType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$UpsellType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final UpsellType fromValue(int value) {
                if (value == 0) {
                    return UpsellType.UPSELL_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return UpsellType.AGGRESSIVE;
                }
                if (value != 2) {
                    return null;
                }
                return UpsellType.QUIET;
            }
        }

        public static UpsellType valueOf(String str) {
            return (UpsellType) Enum.valueOf(UpsellType.class, str);
        }

        public static UpsellType[] values() {
            return (UpsellType[]) $VALUES.clone();
        }
    }
}
