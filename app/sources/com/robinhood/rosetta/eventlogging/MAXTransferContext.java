package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.TransferContext;
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

/* compiled from: MAXTransferContext.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 R2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000bRSTUVWXYZ[\\Bé\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020%¢\u0006\u0004\b&\u0010'J\b\u0010I\u001a\u00020\u0002H\u0017J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0096\u0002J\b\u0010N\u001a\u00020OH\u0016J\b\u0010P\u001a\u00020\u0004H\u0016Jè\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0016\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0016\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010+R\u0016\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010H¨\u0006]"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "Lcom/squareup/wire/Message;", "", "id", "", "amount", "Lcom/robinhood/rosetta/eventlogging/Money;", "source_account", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;", "sink_account", "frequency", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "ira_contribution_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRAContributionData;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "ira_distribution_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRADistributionData;", "session_id", "ach_transfer_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$ACHTransferData;", "deposit_suggestions", "", "ira_roth_conversion_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRARothConversionData;", "transfer_limit_validation_error", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError;", "currency_conversion_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$CurrencyConversionData;", "locality", "entry_point_logging_identifier", "transfer_v2_direction", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;", "selected_pill_amount", "transfer_method", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Money;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRAContributionData;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRADistributionData;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$ACHTransferData;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRARothConversionData;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$CurrencyConversionData;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;Lcom/robinhood/rosetta/eventlogging/Money;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getAmount", "()Lcom/robinhood/rosetta/eventlogging/Money;", "getSource_account", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;", "getSink_account", "getFrequency", "()Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "getIra_contribution_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRAContributionData;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getIra_distribution_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRADistributionData;", "getSession_id", "getAch_transfer_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$ACHTransferData;", "getIra_roth_conversion_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRARothConversionData;", "getTransfer_limit_validation_error", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError;", "getCurrency_conversion_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$CurrencyConversionData;", "getLocality", "getEntry_point_logging_identifier", "getTransfer_v2_direction", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;", "getSelected_pill_amount", "getTransfer_method", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;", "getDeposit_suggestions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "TransferAccount", "ACHTransferData", "IRAContributionData", "IRADistributionData", "IRARothConversionData", "TransferLimitValidationError", "CurrencyConversionData", "EntryPoint", "TransferV2Direction", "TransferMethod", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class MAXTransferContext extends Message {

    @JvmField
    public static final ProtoAdapter<MAXTransferContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$ACHTransferData#ADAPTER", jsonName = "achTransferData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final ACHTransferData ach_transfer_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money amount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$CurrencyConversionData#ADAPTER", jsonName = "currencyConversionData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final CurrencyConversionData currency_conversion_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Money#ADAPTER", jsonName = "depositSuggestions", label = WireField.Label.REPEATED, schemaIndex = 10, tag = 11)
    private final java.util.List<Money> deposit_suggestions;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$EntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final EntryPoint entry_point;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entryPointLoggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String entry_point_logging_identifier;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TransferContext$Frequency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final TransferContext.Frequency frequency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$IRAContributionData#ADAPTER", jsonName = "iraContributionData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final IRAContributionData ira_contribution_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$IRADistributionData#ADAPTER", jsonName = "iraDistributionData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final IRADistributionData ira_distribution_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$IRARothConversionData#ADAPTER", jsonName = "iraRothConversionData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final IRARothConversionData ira_roth_conversion_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String locality;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Money#ADAPTER", jsonName = "selectedPillAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final Money selected_pill_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String session_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferAccount#ADAPTER", jsonName = CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final TransferAccount sink_account;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferAccount#ADAPTER", jsonName = CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TransferAccount source_account;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferLimitValidationError#ADAPTER", jsonName = "transferLimitValidationError", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final TransferLimitValidationError transfer_limit_validation_error;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferMethod#ADAPTER", jsonName = "transferMethod", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final TransferMethod transfer_method;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferV2Direction#ADAPTER", jsonName = "transferV2Direction", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final TransferV2Direction transfer_v2_direction;

    public MAXTransferContext() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public /* synthetic */ MAXTransferContext(String str, Money money, TransferAccount transferAccount, TransferAccount transferAccount2, TransferContext.Frequency frequency, IRAContributionData iRAContributionData, EntryPoint entryPoint, IRADistributionData iRADistributionData, String str2, ACHTransferData aCHTransferData, java.util.List list, IRARothConversionData iRARothConversionData, TransferLimitValidationError transferLimitValidationError, CurrencyConversionData currencyConversionData, String str3, String str4, TransferV2Direction transferV2Direction, Money money2, TransferMethod transferMethod, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : transferAccount, (i & 8) != 0 ? null : transferAccount2, (i & 16) != 0 ? TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED : frequency, (i & 32) != 0 ? null : iRAContributionData, (i & 64) != 0 ? EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 128) != 0 ? null : iRADistributionData, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? null : aCHTransferData, (i & 1024) != 0 ? CollectionsKt.emptyList() : list, (i & 2048) != 0 ? null : iRARothConversionData, (i & 4096) != 0 ? null : transferLimitValidationError, (i & 8192) != 0 ? null : currencyConversionData, (i & 16384) != 0 ? "" : str3, (i & 32768) == 0 ? str4 : "", (i & 65536) != 0 ? TransferV2Direction.TRANSFER_V2_DIRECTION_UNSPECIFIED : transferV2Direction, (i & 131072) != 0 ? null : money2, (i & 262144) != 0 ? TransferMethod.TRANSFER_METHOD_UNSPECIFIED : transferMethod, (i & 524288) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24361newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final TransferAccount getSource_account() {
        return this.source_account;
    }

    public final TransferAccount getSink_account() {
        return this.sink_account;
    }

    public final TransferContext.Frequency getFrequency() {
        return this.frequency;
    }

    public final IRAContributionData getIra_contribution_data() {
        return this.ira_contribution_data;
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public final IRADistributionData getIra_distribution_data() {
        return this.ira_distribution_data;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final ACHTransferData getAch_transfer_data() {
        return this.ach_transfer_data;
    }

    public final IRARothConversionData getIra_roth_conversion_data() {
        return this.ira_roth_conversion_data;
    }

    public final TransferLimitValidationError getTransfer_limit_validation_error() {
        return this.transfer_limit_validation_error;
    }

    public final CurrencyConversionData getCurrency_conversion_data() {
        return this.currency_conversion_data;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final String getEntry_point_logging_identifier() {
        return this.entry_point_logging_identifier;
    }

    public final TransferV2Direction getTransfer_v2_direction() {
        return this.transfer_v2_direction;
    }

    public final Money getSelected_pill_amount() {
        return this.selected_pill_amount;
    }

    public final TransferMethod getTransfer_method() {
        return this.transfer_method;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAXTransferContext(String id, Money money, TransferAccount transferAccount, TransferAccount transferAccount2, TransferContext.Frequency frequency, IRAContributionData iRAContributionData, EntryPoint entry_point, IRADistributionData iRADistributionData, String session_id, ACHTransferData aCHTransferData, java.util.List<Money> deposit_suggestions, IRARothConversionData iRARothConversionData, TransferLimitValidationError transferLimitValidationError, CurrencyConversionData currencyConversionData, String locality, String entry_point_logging_identifier, TransferV2Direction transfer_v2_direction, Money money2, TransferMethod transfer_method, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(deposit_suggestions, "deposit_suggestions");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(entry_point_logging_identifier, "entry_point_logging_identifier");
        Intrinsics.checkNotNullParameter(transfer_v2_direction, "transfer_v2_direction");
        Intrinsics.checkNotNullParameter(transfer_method, "transfer_method");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.amount = money;
        this.source_account = transferAccount;
        this.sink_account = transferAccount2;
        this.frequency = frequency;
        this.ira_contribution_data = iRAContributionData;
        this.entry_point = entry_point;
        this.ira_distribution_data = iRADistributionData;
        this.session_id = session_id;
        this.ach_transfer_data = aCHTransferData;
        this.ira_roth_conversion_data = iRARothConversionData;
        this.transfer_limit_validation_error = transferLimitValidationError;
        this.currency_conversion_data = currencyConversionData;
        this.locality = locality;
        this.entry_point_logging_identifier = entry_point_logging_identifier;
        this.transfer_v2_direction = transfer_v2_direction;
        this.selected_pill_amount = money2;
        this.transfer_method = transfer_method;
        this.deposit_suggestions = Internal.immutableCopyOf("deposit_suggestions", deposit_suggestions);
    }

    public final java.util.List<Money> getDeposit_suggestions() {
        return this.deposit_suggestions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24361newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MAXTransferContext)) {
            return false;
        }
        MAXTransferContext mAXTransferContext = (MAXTransferContext) other;
        return Intrinsics.areEqual(unknownFields(), mAXTransferContext.unknownFields()) && Intrinsics.areEqual(this.id, mAXTransferContext.id) && Intrinsics.areEqual(this.amount, mAXTransferContext.amount) && Intrinsics.areEqual(this.source_account, mAXTransferContext.source_account) && Intrinsics.areEqual(this.sink_account, mAXTransferContext.sink_account) && this.frequency == mAXTransferContext.frequency && Intrinsics.areEqual(this.ira_contribution_data, mAXTransferContext.ira_contribution_data) && this.entry_point == mAXTransferContext.entry_point && Intrinsics.areEqual(this.ira_distribution_data, mAXTransferContext.ira_distribution_data) && Intrinsics.areEqual(this.session_id, mAXTransferContext.session_id) && Intrinsics.areEqual(this.ach_transfer_data, mAXTransferContext.ach_transfer_data) && Intrinsics.areEqual(this.deposit_suggestions, mAXTransferContext.deposit_suggestions) && Intrinsics.areEqual(this.ira_roth_conversion_data, mAXTransferContext.ira_roth_conversion_data) && Intrinsics.areEqual(this.transfer_limit_validation_error, mAXTransferContext.transfer_limit_validation_error) && Intrinsics.areEqual(this.currency_conversion_data, mAXTransferContext.currency_conversion_data) && Intrinsics.areEqual(this.locality, mAXTransferContext.locality) && Intrinsics.areEqual(this.entry_point_logging_identifier, mAXTransferContext.entry_point_logging_identifier) && this.transfer_v2_direction == mAXTransferContext.transfer_v2_direction && Intrinsics.areEqual(this.selected_pill_amount, mAXTransferContext.selected_pill_amount) && this.transfer_method == mAXTransferContext.transfer_method;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        TransferAccount transferAccount = this.source_account;
        int iHashCode3 = (iHashCode2 + (transferAccount != null ? transferAccount.hashCode() : 0)) * 37;
        TransferAccount transferAccount2 = this.sink_account;
        int iHashCode4 = (((iHashCode3 + (transferAccount2 != null ? transferAccount2.hashCode() : 0)) * 37) + this.frequency.hashCode()) * 37;
        IRAContributionData iRAContributionData = this.ira_contribution_data;
        int iHashCode5 = (((iHashCode4 + (iRAContributionData != null ? iRAContributionData.hashCode() : 0)) * 37) + this.entry_point.hashCode()) * 37;
        IRADistributionData iRADistributionData = this.ira_distribution_data;
        int iHashCode6 = (((iHashCode5 + (iRADistributionData != null ? iRADistributionData.hashCode() : 0)) * 37) + this.session_id.hashCode()) * 37;
        ACHTransferData aCHTransferData = this.ach_transfer_data;
        int iHashCode7 = (((iHashCode6 + (aCHTransferData != null ? aCHTransferData.hashCode() : 0)) * 37) + this.deposit_suggestions.hashCode()) * 37;
        IRARothConversionData iRARothConversionData = this.ira_roth_conversion_data;
        int iHashCode8 = (iHashCode7 + (iRARothConversionData != null ? iRARothConversionData.hashCode() : 0)) * 37;
        TransferLimitValidationError transferLimitValidationError = this.transfer_limit_validation_error;
        int iHashCode9 = (iHashCode8 + (transferLimitValidationError != null ? transferLimitValidationError.hashCode() : 0)) * 37;
        CurrencyConversionData currencyConversionData = this.currency_conversion_data;
        int iHashCode10 = (((((((iHashCode9 + (currencyConversionData != null ? currencyConversionData.hashCode() : 0)) * 37) + this.locality.hashCode()) * 37) + this.entry_point_logging_identifier.hashCode()) * 37) + this.transfer_v2_direction.hashCode()) * 37;
        Money money2 = this.selected_pill_amount;
        int iHashCode11 = ((iHashCode10 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.transfer_method.hashCode();
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        TransferAccount transferAccount = this.source_account;
        if (transferAccount != null) {
            arrayList.add("source_account=" + transferAccount);
        }
        TransferAccount transferAccount2 = this.sink_account;
        if (transferAccount2 != null) {
            arrayList.add("sink_account=" + transferAccount2);
        }
        arrayList.add("frequency=" + this.frequency);
        IRAContributionData iRAContributionData = this.ira_contribution_data;
        if (iRAContributionData != null) {
            arrayList.add("ira_contribution_data=" + iRAContributionData);
        }
        arrayList.add("entry_point=" + this.entry_point);
        IRADistributionData iRADistributionData = this.ira_distribution_data;
        if (iRADistributionData != null) {
            arrayList.add("ira_distribution_data=" + iRADistributionData);
        }
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        ACHTransferData aCHTransferData = this.ach_transfer_data;
        if (aCHTransferData != null) {
            arrayList.add("ach_transfer_data=" + aCHTransferData);
        }
        if (!this.deposit_suggestions.isEmpty()) {
            arrayList.add("deposit_suggestions=" + this.deposit_suggestions);
        }
        IRARothConversionData iRARothConversionData = this.ira_roth_conversion_data;
        if (iRARothConversionData != null) {
            arrayList.add("ira_roth_conversion_data=" + iRARothConversionData);
        }
        TransferLimitValidationError transferLimitValidationError = this.transfer_limit_validation_error;
        if (transferLimitValidationError != null) {
            arrayList.add("transfer_limit_validation_error=" + transferLimitValidationError);
        }
        CurrencyConversionData currencyConversionData = this.currency_conversion_data;
        if (currencyConversionData != null) {
            arrayList.add("currency_conversion_data=" + currencyConversionData);
        }
        arrayList.add("locality=" + Internal.sanitize(this.locality));
        arrayList.add("entry_point_logging_identifier=" + Internal.sanitize(this.entry_point_logging_identifier));
        arrayList.add("transfer_v2_direction=" + this.transfer_v2_direction);
        Money money2 = this.selected_pill_amount;
        if (money2 != null) {
            arrayList.add("selected_pill_amount=" + money2);
        }
        arrayList.add("transfer_method=" + this.transfer_method);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MAXTransferContext{", "}", 0, null, null, 56, null);
    }

    public final MAXTransferContext copy(String id, Money amount, TransferAccount source_account, TransferAccount sink_account, TransferContext.Frequency frequency, IRAContributionData ira_contribution_data, EntryPoint entry_point, IRADistributionData ira_distribution_data, String session_id, ACHTransferData ach_transfer_data, java.util.List<Money> deposit_suggestions, IRARothConversionData ira_roth_conversion_data, TransferLimitValidationError transfer_limit_validation_error, CurrencyConversionData currency_conversion_data, String locality, String entry_point_logging_identifier, TransferV2Direction transfer_v2_direction, Money selected_pill_amount, TransferMethod transfer_method, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(deposit_suggestions, "deposit_suggestions");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(entry_point_logging_identifier, "entry_point_logging_identifier");
        Intrinsics.checkNotNullParameter(transfer_v2_direction, "transfer_v2_direction");
        Intrinsics.checkNotNullParameter(transfer_method, "transfer_method");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MAXTransferContext(id, amount, source_account, sink_account, frequency, ira_contribution_data, entry_point, ira_distribution_data, session_id, ach_transfer_data, deposit_suggestions, ira_roth_conversion_data, transfer_limit_validation_error, currency_conversion_data, locality, entry_point_logging_identifier, transfer_v2_direction, selected_pill_amount, transfer_method, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MAXTransferContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MAXTransferContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MAXTransferContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getAmount());
                }
                if (value.getSource_account() != null) {
                    size += MAXTransferContext.TransferAccount.ADAPTER.encodedSizeWithTag(3, value.getSource_account());
                }
                if (value.getSink_account() != null) {
                    size += MAXTransferContext.TransferAccount.ADAPTER.encodedSizeWithTag(4, value.getSink_account());
                }
                if (value.getFrequency() != TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED) {
                    size += TransferContext.Frequency.ADAPTER.encodedSizeWithTag(5, value.getFrequency());
                }
                if (value.getIra_contribution_data() != null) {
                    size += MAXTransferContext.IRAContributionData.ADAPTER.encodedSizeWithTag(6, value.getIra_contribution_data());
                }
                if (value.getEntry_point() != MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    size += MAXTransferContext.EntryPoint.ADAPTER.encodedSizeWithTag(7, value.getEntry_point());
                }
                if (value.getIra_distribution_data() != null) {
                    size += MAXTransferContext.IRADistributionData.ADAPTER.encodedSizeWithTag(8, value.getIra_distribution_data());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getSession_id());
                }
                if (value.getAch_transfer_data() != null) {
                    size += MAXTransferContext.ACHTransferData.ADAPTER.encodedSizeWithTag(10, value.getAch_transfer_data());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(11, value.getDeposit_suggestions());
                if (value.getIra_roth_conversion_data() != null) {
                    iEncodedSizeWithTag += MAXTransferContext.IRARothConversionData.ADAPTER.encodedSizeWithTag(12, value.getIra_roth_conversion_data());
                }
                if (value.getTransfer_limit_validation_error() != null) {
                    iEncodedSizeWithTag += MAXTransferContext.TransferLimitValidationError.ADAPTER.encodedSizeWithTag(13, value.getTransfer_limit_validation_error());
                }
                if (value.getCurrency_conversion_data() != null) {
                    iEncodedSizeWithTag += MAXTransferContext.CurrencyConversionData.ADAPTER.encodedSizeWithTag(14, value.getCurrency_conversion_data());
                }
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getEntry_point_logging_identifier(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getEntry_point_logging_identifier());
                }
                if (value.getTransfer_v2_direction() != MAXTransferContext.TransferV2Direction.TRANSFER_V2_DIRECTION_UNSPECIFIED) {
                    iEncodedSizeWithTag += MAXTransferContext.TransferV2Direction.ADAPTER.encodedSizeWithTag(17, value.getTransfer_v2_direction());
                }
                if (value.getSelected_pill_amount() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(18, value.getSelected_pill_amount());
                }
                return value.getTransfer_method() != MAXTransferContext.TransferMethod.TRANSFER_METHOD_UNSPECIFIED ? iEncodedSizeWithTag + MAXTransferContext.TransferMethod.ADAPTER.encodedSizeWithTag(19, value.getTransfer_method()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MAXTransferContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (value.getSource_account() != null) {
                    MAXTransferContext.TransferAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getSource_account());
                }
                if (value.getSink_account() != null) {
                    MAXTransferContext.TransferAccount.ADAPTER.encodeWithTag(writer, 4, (int) value.getSink_account());
                }
                if (value.getFrequency() != TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED) {
                    TransferContext.Frequency.ADAPTER.encodeWithTag(writer, 5, (int) value.getFrequency());
                }
                if (value.getIra_contribution_data() != null) {
                    MAXTransferContext.IRAContributionData.ADAPTER.encodeWithTag(writer, 6, (int) value.getIra_contribution_data());
                }
                if (value.getEntry_point() != MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    MAXTransferContext.EntryPoint.ADAPTER.encodeWithTag(writer, 7, (int) value.getEntry_point());
                }
                if (value.getIra_distribution_data() != null) {
                    MAXTransferContext.IRADistributionData.ADAPTER.encodeWithTag(writer, 8, (int) value.getIra_distribution_data());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getSession_id());
                }
                if (value.getAch_transfer_data() != null) {
                    MAXTransferContext.ACHTransferData.ADAPTER.encodeWithTag(writer, 10, (int) value.getAch_transfer_data());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 11, (int) value.getDeposit_suggestions());
                if (value.getIra_roth_conversion_data() != null) {
                    MAXTransferContext.IRARothConversionData.ADAPTER.encodeWithTag(writer, 12, (int) value.getIra_roth_conversion_data());
                }
                if (value.getTransfer_limit_validation_error() != null) {
                    MAXTransferContext.TransferLimitValidationError.ADAPTER.encodeWithTag(writer, 13, (int) value.getTransfer_limit_validation_error());
                }
                if (value.getCurrency_conversion_data() != null) {
                    MAXTransferContext.CurrencyConversionData.ADAPTER.encodeWithTag(writer, 14, (int) value.getCurrency_conversion_data());
                }
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getEntry_point_logging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getEntry_point_logging_identifier());
                }
                if (value.getTransfer_v2_direction() != MAXTransferContext.TransferV2Direction.TRANSFER_V2_DIRECTION_UNSPECIFIED) {
                    MAXTransferContext.TransferV2Direction.ADAPTER.encodeWithTag(writer, 17, (int) value.getTransfer_v2_direction());
                }
                if (value.getSelected_pill_amount() != null) {
                    protoAdapter.encodeWithTag(writer, 18, (int) value.getSelected_pill_amount());
                }
                if (value.getTransfer_method() != MAXTransferContext.TransferMethod.TRANSFER_METHOD_UNSPECIFIED) {
                    MAXTransferContext.TransferMethod.ADAPTER.encodeWithTag(writer, 19, (int) value.getTransfer_method());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MAXTransferContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTransfer_method() != MAXTransferContext.TransferMethod.TRANSFER_METHOD_UNSPECIFIED) {
                    MAXTransferContext.TransferMethod.ADAPTER.encodeWithTag(writer, 19, (int) value.getTransfer_method());
                }
                if (value.getSelected_pill_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 18, (int) value.getSelected_pill_amount());
                }
                if (value.getTransfer_v2_direction() != MAXTransferContext.TransferV2Direction.TRANSFER_V2_DIRECTION_UNSPECIFIED) {
                    MAXTransferContext.TransferV2Direction.ADAPTER.encodeWithTag(writer, 17, (int) value.getTransfer_v2_direction());
                }
                if (!Intrinsics.areEqual(value.getEntry_point_logging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getEntry_point_logging_identifier());
                }
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getLocality());
                }
                if (value.getCurrency_conversion_data() != null) {
                    MAXTransferContext.CurrencyConversionData.ADAPTER.encodeWithTag(writer, 14, (int) value.getCurrency_conversion_data());
                }
                if (value.getTransfer_limit_validation_error() != null) {
                    MAXTransferContext.TransferLimitValidationError.ADAPTER.encodeWithTag(writer, 13, (int) value.getTransfer_limit_validation_error());
                }
                if (value.getIra_roth_conversion_data() != null) {
                    MAXTransferContext.IRARothConversionData.ADAPTER.encodeWithTag(writer, 12, (int) value.getIra_roth_conversion_data());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 11, (int) value.getDeposit_suggestions());
                if (value.getAch_transfer_data() != null) {
                    MAXTransferContext.ACHTransferData.ADAPTER.encodeWithTag(writer, 10, (int) value.getAch_transfer_data());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getSession_id());
                }
                if (value.getIra_distribution_data() != null) {
                    MAXTransferContext.IRADistributionData.ADAPTER.encodeWithTag(writer, 8, (int) value.getIra_distribution_data());
                }
                if (value.getEntry_point() != MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    MAXTransferContext.EntryPoint.ADAPTER.encodeWithTag(writer, 7, (int) value.getEntry_point());
                }
                if (value.getIra_contribution_data() != null) {
                    MAXTransferContext.IRAContributionData.ADAPTER.encodeWithTag(writer, 6, (int) value.getIra_contribution_data());
                }
                if (value.getFrequency() != TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED) {
                    TransferContext.Frequency.ADAPTER.encodeWithTag(writer, 5, (int) value.getFrequency());
                }
                if (value.getSink_account() != null) {
                    MAXTransferContext.TransferAccount.ADAPTER.encodeWithTag(writer, 4, (int) value.getSink_account());
                }
                if (value.getSource_account() != null) {
                    MAXTransferContext.TransferAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getSource_account());
                }
                if (value.getAmount() != null) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MAXTransferContext decode(ProtoReader reader) throws IOException {
                MAXTransferContext.EntryPoint entryPoint;
                MAXTransferContext.TransferMethod transferMethod;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                TransferContext.Frequency frequency = TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED;
                MAXTransferContext.EntryPoint entryPoint2 = MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                MAXTransferContext.TransferV2Direction transferV2Direction = MAXTransferContext.TransferV2Direction.TRANSFER_V2_DIRECTION_UNSPECIFIED;
                MAXTransferContext.TransferMethod transferMethod2 = MAXTransferContext.TransferMethod.TRANSFER_METHOD_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                TransferContext.Frequency frequencyDecode = frequency;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Money moneyDecode = null;
                MAXTransferContext.TransferAccount transferAccountDecode = null;
                MAXTransferContext.TransferAccount transferAccountDecode2 = null;
                MAXTransferContext.IRAContributionData iRAContributionDataDecode = null;
                MAXTransferContext.IRADistributionData iRADistributionDataDecode = null;
                MAXTransferContext.ACHTransferData aCHTransferDataDecode = null;
                MAXTransferContext.IRARothConversionData iRARothConversionDataDecode = null;
                MAXTransferContext.TransferLimitValidationError transferLimitValidationErrorDecode = null;
                MAXTransferContext.CurrencyConversionData currencyConversionDataDecode = null;
                Money moneyDecode2 = null;
                MAXTransferContext.TransferMethod transferMethodDecode = transferMethod2;
                String strDecode4 = strDecode3;
                MAXTransferContext.TransferV2Direction transferV2DirectionDecode = transferV2Direction;
                MAXTransferContext.EntryPoint entryPointDecode = entryPoint2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MAXTransferContext(strDecode4, moneyDecode, transferAccountDecode, transferAccountDecode2, frequencyDecode, iRAContributionDataDecode, entryPointDecode, iRADistributionDataDecode, strDecode, aCHTransferDataDecode, arrayList, iRARothConversionDataDecode, transferLimitValidationErrorDecode, currencyConversionDataDecode, strDecode2, strDecode3, transferV2DirectionDecode, moneyDecode2, transferMethodDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            moneyDecode = Money.ADAPTER.decode(reader);
                            break;
                        case 3:
                            transferAccountDecode = MAXTransferContext.TransferAccount.ADAPTER.decode(reader);
                            break;
                        case 4:
                            transferAccountDecode2 = MAXTransferContext.TransferAccount.ADAPTER.decode(reader);
                            break;
                        case 5:
                            entryPoint = entryPointDecode;
                            transferMethod = transferMethodDecode;
                            str = strDecode4;
                            try {
                                frequencyDecode = TransferContext.Frequency.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            entryPointDecode = entryPoint;
                            strDecode4 = str;
                            transferMethodDecode = transferMethod;
                            break;
                        case 6:
                            iRAContributionDataDecode = MAXTransferContext.IRAContributionData.ADAPTER.decode(reader);
                            break;
                        case 7:
                            entryPoint = entryPointDecode;
                            transferMethod = transferMethodDecode;
                            str = strDecode4;
                            try {
                                entryPointDecode = MAXTransferContext.EntryPoint.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            strDecode4 = str;
                            transferMethodDecode = transferMethod;
                            break;
                        case 8:
                            iRADistributionDataDecode = MAXTransferContext.IRADistributionData.ADAPTER.decode(reader);
                            break;
                        case 9:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 10:
                            aCHTransferDataDecode = MAXTransferContext.ACHTransferData.ADAPTER.decode(reader);
                            break;
                        case 11:
                            entryPoint = entryPointDecode;
                            transferMethod = transferMethodDecode;
                            str = strDecode4;
                            arrayList.add(Money.ADAPTER.decode(reader));
                            entryPointDecode = entryPoint;
                            strDecode4 = str;
                            transferMethodDecode = transferMethod;
                            break;
                        case 12:
                            iRARothConversionDataDecode = MAXTransferContext.IRARothConversionData.ADAPTER.decode(reader);
                            break;
                        case 13:
                            transferLimitValidationErrorDecode = MAXTransferContext.TransferLimitValidationError.ADAPTER.decode(reader);
                            break;
                        case 14:
                            currencyConversionDataDecode = MAXTransferContext.CurrencyConversionData.ADAPTER.decode(reader);
                            break;
                        case 15:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 16:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 17:
                            entryPoint = entryPointDecode;
                            transferMethod = transferMethodDecode;
                            str = strDecode4;
                            try {
                                transferV2DirectionDecode = MAXTransferContext.TransferV2Direction.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            entryPointDecode = entryPoint;
                            strDecode4 = str;
                            transferMethodDecode = transferMethod;
                            break;
                        case 18:
                            moneyDecode2 = Money.ADAPTER.decode(reader);
                            break;
                        case 19:
                            try {
                                transferMethodDecode = MAXTransferContext.TransferMethod.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                entryPoint = entryPointDecode;
                                transferMethod = transferMethodDecode;
                                str = strDecode4;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(iNextTag);
                            entryPoint = entryPointDecode;
                            transferMethod = transferMethodDecode;
                            str = strDecode4;
                            entryPointDecode = entryPoint;
                            strDecode4 = str;
                            transferMethodDecode = transferMethod;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MAXTransferContext redact(MAXTransferContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                MAXTransferContext.TransferAccount source_account = value.getSource_account();
                MAXTransferContext.TransferAccount transferAccountRedact = source_account != null ? MAXTransferContext.TransferAccount.ADAPTER.redact(source_account) : null;
                MAXTransferContext.TransferAccount sink_account = value.getSink_account();
                MAXTransferContext.TransferAccount transferAccountRedact2 = sink_account != null ? MAXTransferContext.TransferAccount.ADAPTER.redact(sink_account) : null;
                MAXTransferContext.IRAContributionData ira_contribution_data = value.getIra_contribution_data();
                MAXTransferContext.IRAContributionData iRAContributionDataRedact = ira_contribution_data != null ? MAXTransferContext.IRAContributionData.ADAPTER.redact(ira_contribution_data) : null;
                MAXTransferContext.IRADistributionData ira_distribution_data = value.getIra_distribution_data();
                MAXTransferContext.IRADistributionData iRADistributionDataRedact = ira_distribution_data != null ? MAXTransferContext.IRADistributionData.ADAPTER.redact(ira_distribution_data) : null;
                MAXTransferContext.ACHTransferData ach_transfer_data = value.getAch_transfer_data();
                MAXTransferContext.ACHTransferData aCHTransferDataRedact = ach_transfer_data != null ? MAXTransferContext.ACHTransferData.ADAPTER.redact(ach_transfer_data) : null;
                java.util.List<Money> deposit_suggestions = value.getDeposit_suggestions();
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                java.util.List listM26823redactElements = Internal.m26823redactElements(deposit_suggestions, protoAdapter);
                MAXTransferContext.IRARothConversionData ira_roth_conversion_data = value.getIra_roth_conversion_data();
                MAXTransferContext.IRARothConversionData iRARothConversionDataRedact = ira_roth_conversion_data != null ? MAXTransferContext.IRARothConversionData.ADAPTER.redact(ira_roth_conversion_data) : null;
                MAXTransferContext.TransferLimitValidationError transfer_limit_validation_error = value.getTransfer_limit_validation_error();
                MAXTransferContext.TransferLimitValidationError transferLimitValidationErrorRedact = transfer_limit_validation_error != null ? MAXTransferContext.TransferLimitValidationError.ADAPTER.redact(transfer_limit_validation_error) : null;
                MAXTransferContext.CurrencyConversionData currency_conversion_data = value.getCurrency_conversion_data();
                MAXTransferContext.CurrencyConversionData currencyConversionDataRedact = currency_conversion_data != null ? MAXTransferContext.CurrencyConversionData.ADAPTER.redact(currency_conversion_data) : null;
                Money selected_pill_amount = value.getSelected_pill_amount();
                return value.copy((377169 & 1) != 0 ? value.id : null, (377169 & 2) != 0 ? value.amount : moneyRedact, (377169 & 4) != 0 ? value.source_account : transferAccountRedact, (377169 & 8) != 0 ? value.sink_account : transferAccountRedact2, (377169 & 16) != 0 ? value.frequency : null, (377169 & 32) != 0 ? value.ira_contribution_data : iRAContributionDataRedact, (377169 & 64) != 0 ? value.entry_point : null, (377169 & 128) != 0 ? value.ira_distribution_data : iRADistributionDataRedact, (377169 & 256) != 0 ? value.session_id : null, (377169 & 512) != 0 ? value.ach_transfer_data : aCHTransferDataRedact, (377169 & 1024) != 0 ? value.deposit_suggestions : listM26823redactElements, (377169 & 2048) != 0 ? value.ira_roth_conversion_data : iRARothConversionDataRedact, (377169 & 4096) != 0 ? value.transfer_limit_validation_error : transferLimitValidationErrorRedact, (377169 & 8192) != 0 ? value.currency_conversion_data : currencyConversionDataRedact, (377169 & 16384) != 0 ? value.locality : null, (377169 & 32768) != 0 ? value.entry_point_logging_identifier : null, (377169 & 65536) != 0 ? value.transfer_v2_direction : null, (377169 & 131072) != 0 ? value.selected_pill_amount : selected_pill_amount != null ? protoAdapter.redact(selected_pill_amount) : null, (377169 & 262144) != 0 ? value.transfer_method : null, (377169 & 524288) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* compiled from: MAXTransferContext.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JD\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;", "Lcom/squareup/wire/Message;", "", "account_id", "", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "ach_transfer_account_metadata", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$ACHTransferAccountMetadata;", "currency", "Lcom/robinhood/rosetta/common/Currency;", "masked_account_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$ACHTransferAccountMetadata;Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getAccount_type", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "getAch_transfer_account_metadata", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$ACHTransferAccountMetadata;", "getCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "getMasked_account_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "TransferAccountType", "ACHTransferAccountMetadata", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransferAccount extends Message {

        @JvmField
        public static final ProtoAdapter<TransferAccount> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String account_id;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferAccount$TransferAccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final TransferAccountType account_type;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferAccount$ACHTransferAccountMetadata#ADAPTER", jsonName = "achTransferAccountMetadata", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final ACHTransferAccountMetadata ach_transfer_account_metadata;

        @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final Currency currency;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedAccountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 1001)
        private final String masked_account_id;

        public TransferAccount() {
            this(null, null, null, null, null, null, 63, null);
        }

        public /* synthetic */ TransferAccount(String str, TransferAccountType transferAccountType, ACHTransferAccountMetadata aCHTransferAccountMetadata, Currency currency, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED : transferAccountType, (i & 4) != 0 ? null : aCHTransferAccountMetadata, (i & 8) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24367newBuilder();
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final TransferAccountType getAccount_type() {
            return this.account_type;
        }

        public final ACHTransferAccountMetadata getAch_transfer_account_metadata() {
            return this.ach_transfer_account_metadata;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final String getMasked_account_id() {
            return this.masked_account_id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferAccount(String account_id, TransferAccountType account_type, ACHTransferAccountMetadata aCHTransferAccountMetadata, Currency currency, String masked_account_id, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(masked_account_id, "masked_account_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.account_id = account_id;
            this.account_type = account_type;
            this.ach_transfer_account_metadata = aCHTransferAccountMetadata;
            this.currency = currency;
            this.masked_account_id = masked_account_id;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24367newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TransferAccount)) {
                return false;
            }
            TransferAccount transferAccount = (TransferAccount) other;
            return Intrinsics.areEqual(unknownFields(), transferAccount.unknownFields()) && Intrinsics.areEqual(this.account_id, transferAccount.account_id) && this.account_type == transferAccount.account_type && Intrinsics.areEqual(this.ach_transfer_account_metadata, transferAccount.ach_transfer_account_metadata) && this.currency == transferAccount.currency && Intrinsics.areEqual(this.masked_account_id, transferAccount.masked_account_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.account_type.hashCode()) * 37;
            ACHTransferAccountMetadata aCHTransferAccountMetadata = this.ach_transfer_account_metadata;
            int iHashCode2 = ((((iHashCode + (aCHTransferAccountMetadata != null ? aCHTransferAccountMetadata.hashCode() : 0)) * 37) + this.currency.hashCode()) * 37) + this.masked_account_id.hashCode();
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("account_id=" + Internal.sanitize(this.account_id));
            arrayList.add("account_type=" + this.account_type);
            ACHTransferAccountMetadata aCHTransferAccountMetadata = this.ach_transfer_account_metadata;
            if (aCHTransferAccountMetadata != null) {
                arrayList.add("ach_transfer_account_metadata=" + aCHTransferAccountMetadata);
            }
            arrayList.add("currency=" + this.currency);
            arrayList.add("masked_account_id=" + Internal.sanitize(this.masked_account_id));
            return CollectionsKt.joinToString$default(arrayList, ", ", "TransferAccount{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ TransferAccount copy$default(TransferAccount transferAccount, String str, TransferAccountType transferAccountType, ACHTransferAccountMetadata aCHTransferAccountMetadata, Currency currency, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transferAccount.account_id;
            }
            if ((i & 2) != 0) {
                transferAccountType = transferAccount.account_type;
            }
            if ((i & 4) != 0) {
                aCHTransferAccountMetadata = transferAccount.ach_transfer_account_metadata;
            }
            if ((i & 8) != 0) {
                currency = transferAccount.currency;
            }
            if ((i & 16) != 0) {
                str2 = transferAccount.masked_account_id;
            }
            if ((i & 32) != 0) {
                byteString = transferAccount.unknownFields();
            }
            String str3 = str2;
            ByteString byteString2 = byteString;
            return transferAccount.copy(str, transferAccountType, aCHTransferAccountMetadata, currency, str3, byteString2);
        }

        public final TransferAccount copy(String account_id, TransferAccountType account_type, ACHTransferAccountMetadata ach_transfer_account_metadata, Currency currency, String masked_account_id, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(masked_account_id, "masked_account_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TransferAccount(account_id, account_type, ach_transfer_account_metadata, currency, masked_account_id, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferAccount.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TransferAccount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferAccount$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MAXTransferContext.TransferAccount value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                    }
                    if (value.getAccount_type() != MAXTransferContext.TransferAccount.TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED) {
                        size += MAXTransferContext.TransferAccount.TransferAccountType.ADAPTER.encodedSizeWithTag(2, value.getAccount_type());
                    }
                    if (value.getAch_transfer_account_metadata() != null) {
                        size += MAXTransferContext.TransferAccount.ACHTransferAccountMetadata.ADAPTER.encodedSizeWithTag(3, value.getAch_transfer_account_metadata());
                    }
                    if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                        size += Currency.ADAPTER.encodedSizeWithTag(4, value.getCurrency());
                    }
                    return !Intrinsics.areEqual(value.getMasked_account_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1001, value.getMasked_account_id()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MAXTransferContext.TransferAccount value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                    }
                    if (value.getAccount_type() != MAXTransferContext.TransferAccount.TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED) {
                        MAXTransferContext.TransferAccount.TransferAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount_type());
                    }
                    if (value.getAch_transfer_account_metadata() != null) {
                        MAXTransferContext.TransferAccount.ACHTransferAccountMetadata.ADAPTER.encodeWithTag(writer, 3, (int) value.getAch_transfer_account_metadata());
                    }
                    if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                        Currency.ADAPTER.encodeWithTag(writer, 4, (int) value.getCurrency());
                    }
                    if (!Intrinsics.areEqual(value.getMasked_account_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_account_id());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MAXTransferContext.TransferAccount value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getMasked_account_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_account_id());
                    }
                    if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                        Currency.ADAPTER.encodeWithTag(writer, 4, (int) value.getCurrency());
                    }
                    if (value.getAch_transfer_account_metadata() != null) {
                        MAXTransferContext.TransferAccount.ACHTransferAccountMetadata.ADAPTER.encodeWithTag(writer, 3, (int) value.getAch_transfer_account_metadata());
                    }
                    if (value.getAccount_type() != MAXTransferContext.TransferAccount.TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED) {
                        MAXTransferContext.TransferAccount.TransferAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount_type());
                    }
                    if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.TransferAccount decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    MAXTransferContext.TransferAccount.TransferAccountType transferAccountTypeDecode = MAXTransferContext.TransferAccount.TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
                    Currency currency = Currency.CURRENCY_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    MAXTransferContext.TransferAccount.ACHTransferAccountMetadata aCHTransferAccountMetadataDecode = null;
                    Currency currencyDecode = currency;
                    String strDecode2 = strDecode;
                    while (true) {
                        MAXTransferContext.TransferAccount.TransferAccountType transferAccountType = transferAccountTypeDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new MAXTransferContext.TransferAccount(strDecode2, transferAccountType, aCHTransferAccountMetadataDecode, currencyDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                try {
                                    transferAccountTypeDecode = MAXTransferContext.TransferAccount.TransferAccountType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 3) {
                                aCHTransferAccountMetadataDecode = MAXTransferContext.TransferAccount.ACHTransferAccountMetadata.ADAPTER.decode(reader);
                            } else if (iNextTag == 4) {
                                try {
                                    currencyDecode = Currency.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            } else if (iNextTag == 1001) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.TransferAccount redact(MAXTransferContext.TransferAccount value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    MAXTransferContext.TransferAccount.ACHTransferAccountMetadata ach_transfer_account_metadata = value.getAch_transfer_account_metadata();
                    return MAXTransferContext.TransferAccount.copy$default(value, null, null, ach_transfer_account_metadata != null ? MAXTransferContext.TransferAccount.ACHTransferAccountMetadata.ADAPTER.redact(ach_transfer_account_metadata) : null, null, null, ByteString.EMPTY, 27, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MAXTransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_ACCOUNT_TYPE_UNSPECIFIED", "ACH", "RHS", "RHY", "RHY_BANKING", "IRA_TRADITIONAL", "IRA_ROTH", "DCF", "UK_BANK_ACCOUNT", "APPLE_PAY_DCF", "JOINT_TENANCY_WITH_ROS", "OUTGOING_WIRE_ACCOUNT", "I18N_BANK_ACCOUNT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TransferAccountType implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TransferAccountType[] $VALUES;
            public static final TransferAccountType ACH;

            @JvmField
            public static final ProtoAdapter<TransferAccountType> ADAPTER;
            public static final TransferAccountType APPLE_PAY_DCF;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final TransferAccountType DCF;
            public static final TransferAccountType I18N_BANK_ACCOUNT;
            public static final TransferAccountType IRA_ROTH;
            public static final TransferAccountType IRA_TRADITIONAL;
            public static final TransferAccountType JOINT_TENANCY_WITH_ROS;
            public static final TransferAccountType OUTGOING_WIRE_ACCOUNT;
            public static final TransferAccountType RHS;
            public static final TransferAccountType RHY;
            public static final TransferAccountType RHY_BANKING;
            public static final TransferAccountType TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
            public static final TransferAccountType UK_BANK_ACCOUNT;
            private final int value;

            private static final /* synthetic */ TransferAccountType[] $values() {
                return new TransferAccountType[]{TRANSFER_ACCOUNT_TYPE_UNSPECIFIED, ACH, RHS, RHY, RHY_BANKING, IRA_TRADITIONAL, IRA_ROTH, DCF, UK_BANK_ACCOUNT, APPLE_PAY_DCF, JOINT_TENANCY_WITH_ROS, OUTGOING_WIRE_ACCOUNT, I18N_BANK_ACCOUNT};
            }

            @JvmStatic
            public static final TransferAccountType fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<TransferAccountType> getEntries() {
                return $ENTRIES;
            }

            private TransferAccountType(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final TransferAccountType transferAccountType = new TransferAccountType("TRANSFER_ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
                TRANSFER_ACCOUNT_TYPE_UNSPECIFIED = transferAccountType;
                ACH = new TransferAccountType("ACH", 1, 1);
                RHS = new TransferAccountType("RHS", 2, 2);
                RHY = new TransferAccountType("RHY", 3, 6);
                RHY_BANKING = new TransferAccountType("RHY_BANKING", 4, 12);
                IRA_TRADITIONAL = new TransferAccountType("IRA_TRADITIONAL", 5, 3);
                IRA_ROTH = new TransferAccountType("IRA_ROTH", 6, 4);
                DCF = new TransferAccountType("DCF", 7, 5);
                UK_BANK_ACCOUNT = new TransferAccountType("UK_BANK_ACCOUNT", 8, 7);
                APPLE_PAY_DCF = new TransferAccountType("APPLE_PAY_DCF", 9, 8);
                JOINT_TENANCY_WITH_ROS = new TransferAccountType("JOINT_TENANCY_WITH_ROS", 10, 9);
                OUTGOING_WIRE_ACCOUNT = new TransferAccountType("OUTGOING_WIRE_ACCOUNT", 11, 10);
                I18N_BANK_ACCOUNT = new TransferAccountType("I18N_BANK_ACCOUNT", 12, 11);
                TransferAccountType[] transferAccountTypeArr$values = $values();
                $VALUES = transferAccountTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(transferAccountTypeArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferAccountType.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<TransferAccountType>(orCreateKotlinClass, syntax, transferAccountType) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferAccount$TransferAccountType$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public MAXTransferContext.TransferAccount.TransferAccountType fromValue(int value) {
                        return MAXTransferContext.TransferAccount.TransferAccountType.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: MAXTransferContext.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final TransferAccountType fromValue(int value) {
                    switch (value) {
                        case 0:
                            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
                        case 1:
                            return TransferAccountType.ACH;
                        case 2:
                            return TransferAccountType.RHS;
                        case 3:
                            return TransferAccountType.IRA_TRADITIONAL;
                        case 4:
                            return TransferAccountType.IRA_ROTH;
                        case 5:
                            return TransferAccountType.DCF;
                        case 6:
                            return TransferAccountType.RHY;
                        case 7:
                            return TransferAccountType.UK_BANK_ACCOUNT;
                        case 8:
                            return TransferAccountType.APPLE_PAY_DCF;
                        case 9:
                            return TransferAccountType.JOINT_TENANCY_WITH_ROS;
                        case 10:
                            return TransferAccountType.OUTGOING_WIRE_ACCOUNT;
                        case 11:
                            return TransferAccountType.I18N_BANK_ACCOUNT;
                        case 12:
                            return TransferAccountType.RHY_BANKING;
                        default:
                            return null;
                    }
                }
            }

            public static TransferAccountType valueOf(String str) {
                return (TransferAccountType) Enum.valueOf(TransferAccountType.class, str);
            }

            public static TransferAccountType[] values() {
                return (TransferAccountType[]) $VALUES.clone();
            }
        }

        /* compiled from: MAXTransferContext.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\u0002H\u0017J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$ACHTransferAccountMetadata;", "Lcom/squareup/wire/Message;", "", "is_instant_eligible", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ACHTransferAccountMetadata extends Message {

            @JvmField
            public static final ProtoAdapter<ACHTransferAccountMetadata> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isInstantEligible", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final Boolean is_instant_eligible;

            /* JADX WARN: Multi-variable type inference failed */
            public ACHTransferAccountMetadata() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24368newBuilder();
            }

            /* renamed from: is_instant_eligible, reason: from getter */
            public final Boolean getIs_instant_eligible() {
                return this.is_instant_eligible;
            }

            public /* synthetic */ ACHTransferAccountMetadata(Boolean r1, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r1, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ACHTransferAccountMetadata(Boolean is_instant_eligible, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(is_instant_eligible, "is_instant_eligible");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.is_instant_eligible = is_instant_eligible;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24368newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ACHTransferAccountMetadata)) {
                    return false;
                }
                ACHTransferAccountMetadata aCHTransferAccountMetadata = (ACHTransferAccountMetadata) other;
                return Intrinsics.areEqual(unknownFields(), aCHTransferAccountMetadata.unknownFields()) && this.is_instant_eligible == aCHTransferAccountMetadata.is_instant_eligible;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.is_instant_eligible.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("is_instant_eligible=" + this.is_instant_eligible);
                return CollectionsKt.joinToString$default(arrayList, ", ", "ACHTransferAccountMetadata{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ ACHTransferAccountMetadata copy$default(ACHTransferAccountMetadata aCHTransferAccountMetadata, Boolean r1, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    r1 = aCHTransferAccountMetadata.is_instant_eligible;
                }
                if ((i & 2) != 0) {
                    byteString = aCHTransferAccountMetadata.unknownFields();
                }
                return aCHTransferAccountMetadata.copy(r1, byteString);
            }

            public final ACHTransferAccountMetadata copy(Boolean is_instant_eligible, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(is_instant_eligible, "is_instant_eligible");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new ACHTransferAccountMetadata(is_instant_eligible, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ACHTransferAccountMetadata.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<ACHTransferAccountMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferAccount$ACHTransferAccountMetadata$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(MAXTransferContext.TransferAccount.ACHTransferAccountMetadata value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return value.getIs_instant_eligible() != Boolean.BOOLEAN_UNSPECIFIED ? size + Boolean.ADAPTER.encodedSizeWithTag(1, value.getIs_instant_eligible()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, MAXTransferContext.TransferAccount.ACHTransferAccountMetadata value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getIs_instant_eligible() != Boolean.BOOLEAN_UNSPECIFIED) {
                            Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getIs_instant_eligible());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, MAXTransferContext.TransferAccount.ACHTransferAccountMetadata value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getIs_instant_eligible() != Boolean.BOOLEAN_UNSPECIFIED) {
                            Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getIs_instant_eligible());
                        }
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public MAXTransferContext.TransferAccount.ACHTransferAccountMetadata decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                        long jBeginMessage = reader.beginMessage();
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new MAXTransferContext.TransferAccount.ACHTransferAccountMetadata(booleanDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
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
                    public MAXTransferContext.TransferAccount.ACHTransferAccountMetadata redact(MAXTransferContext.TransferAccount.ACHTransferAccountMetadata value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return MAXTransferContext.TransferAccount.ACHTransferAccountMetadata.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }
    }

    /* compiled from: MAXTransferContext.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$ACHTransferData;", "Lcom/squareup/wire/Message;", "", "is_instant_transfer", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "is_instant_transfer_caused_by_default", "is_instant_transfer_caused_by_upsell", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ACHTransferData extends Message {

        @JvmField
        public static final ProtoAdapter<ACHTransferData> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isInstantTransfer", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Boolean is_instant_transfer;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isInstantTransferCausedByDefault", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Boolean is_instant_transfer_caused_by_default;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isInstantTransferCausedByUpsell", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final Boolean is_instant_transfer_caused_by_upsell;

        public ACHTransferData() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24362newBuilder();
        }

        /* renamed from: is_instant_transfer, reason: from getter */
        public final Boolean getIs_instant_transfer() {
            return this.is_instant_transfer;
        }

        public /* synthetic */ ACHTransferData(Boolean r1, Boolean r2, Boolean r3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r1, (i & 2) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r2, (i & 4) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* renamed from: is_instant_transfer_caused_by_default, reason: from getter */
        public final Boolean getIs_instant_transfer_caused_by_default() {
            return this.is_instant_transfer_caused_by_default;
        }

        /* renamed from: is_instant_transfer_caused_by_upsell, reason: from getter */
        public final Boolean getIs_instant_transfer_caused_by_upsell() {
            return this.is_instant_transfer_caused_by_upsell;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ACHTransferData(Boolean is_instant_transfer, Boolean is_instant_transfer_caused_by_default, Boolean is_instant_transfer_caused_by_upsell, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(is_instant_transfer, "is_instant_transfer");
            Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_default, "is_instant_transfer_caused_by_default");
            Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_upsell, "is_instant_transfer_caused_by_upsell");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.is_instant_transfer = is_instant_transfer;
            this.is_instant_transfer_caused_by_default = is_instant_transfer_caused_by_default;
            this.is_instant_transfer_caused_by_upsell = is_instant_transfer_caused_by_upsell;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24362newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ACHTransferData)) {
                return false;
            }
            ACHTransferData aCHTransferData = (ACHTransferData) other;
            return Intrinsics.areEqual(unknownFields(), aCHTransferData.unknownFields()) && this.is_instant_transfer == aCHTransferData.is_instant_transfer && this.is_instant_transfer_caused_by_default == aCHTransferData.is_instant_transfer_caused_by_default && this.is_instant_transfer_caused_by_upsell == aCHTransferData.is_instant_transfer_caused_by_upsell;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.is_instant_transfer.hashCode()) * 37) + this.is_instant_transfer_caused_by_default.hashCode()) * 37) + this.is_instant_transfer_caused_by_upsell.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("is_instant_transfer=" + this.is_instant_transfer);
            arrayList.add("is_instant_transfer_caused_by_default=" + this.is_instant_transfer_caused_by_default);
            arrayList.add("is_instant_transfer_caused_by_upsell=" + this.is_instant_transfer_caused_by_upsell);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ACHTransferData{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ACHTransferData copy$default(ACHTransferData aCHTransferData, Boolean r1, Boolean r2, Boolean r3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                r1 = aCHTransferData.is_instant_transfer;
            }
            if ((i & 2) != 0) {
                r2 = aCHTransferData.is_instant_transfer_caused_by_default;
            }
            if ((i & 4) != 0) {
                r3 = aCHTransferData.is_instant_transfer_caused_by_upsell;
            }
            if ((i & 8) != 0) {
                byteString = aCHTransferData.unknownFields();
            }
            return aCHTransferData.copy(r1, r2, r3, byteString);
        }

        public final ACHTransferData copy(Boolean is_instant_transfer, Boolean is_instant_transfer_caused_by_default, Boolean is_instant_transfer_caused_by_upsell, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(is_instant_transfer, "is_instant_transfer");
            Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_default, "is_instant_transfer_caused_by_default");
            Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_upsell, "is_instant_transfer_caused_by_upsell");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ACHTransferData(is_instant_transfer, is_instant_transfer_caused_by_default, is_instant_transfer_caused_by_upsell, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ACHTransferData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ACHTransferData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$ACHTransferData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MAXTransferContext.ACHTransferData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    Boolean is_instant_transfer = value.getIs_instant_transfer();
                    Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                    if (is_instant_transfer != r2) {
                        size += Boolean.ADAPTER.encodedSizeWithTag(1, value.getIs_instant_transfer());
                    }
                    if (value.getIs_instant_transfer_caused_by_default() != r2) {
                        size += Boolean.ADAPTER.encodedSizeWithTag(2, value.getIs_instant_transfer_caused_by_default());
                    }
                    return value.getIs_instant_transfer_caused_by_upsell() != r2 ? size + Boolean.ADAPTER.encodedSizeWithTag(3, value.getIs_instant_transfer_caused_by_upsell()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MAXTransferContext.ACHTransferData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Boolean is_instant_transfer = value.getIs_instant_transfer();
                    Boolean r1 = Boolean.BOOLEAN_UNSPECIFIED;
                    if (is_instant_transfer != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getIs_instant_transfer());
                    }
                    if (value.getIs_instant_transfer_caused_by_default() != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 2, (int) value.getIs_instant_transfer_caused_by_default());
                    }
                    if (value.getIs_instant_transfer_caused_by_upsell() != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getIs_instant_transfer_caused_by_upsell());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MAXTransferContext.ACHTransferData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Boolean is_instant_transfer_caused_by_upsell = value.getIs_instant_transfer_caused_by_upsell();
                    Boolean r1 = Boolean.BOOLEAN_UNSPECIFIED;
                    if (is_instant_transfer_caused_by_upsell != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getIs_instant_transfer_caused_by_upsell());
                    }
                    if (value.getIs_instant_transfer_caused_by_default() != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 2, (int) value.getIs_instant_transfer_caused_by_default());
                    }
                    if (value.getIs_instant_transfer() != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getIs_instant_transfer());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.ACHTransferData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    Boolean booleanDecode2 = booleanDecode;
                    Boolean booleanDecode3 = booleanDecode2;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new MAXTransferContext.ACHTransferData(booleanDecode, booleanDecode2, booleanDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                booleanDecode = Boolean.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                booleanDecode2 = Boolean.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                booleanDecode3 = Boolean.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.ACHTransferData redact(MAXTransferContext.ACHTransferData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return MAXTransferContext.ACHTransferData.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }
            };
        }
    }

    /* compiled from: MAXTransferContext.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRAContributionData;", "Lcom/squareup/wire/Message;", "", "contribution_type", "", "tax_year", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILokio/ByteString;)V", "getContribution_type", "()Ljava/lang/String;", "getTax_year", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IRAContributionData extends Message {

        @JvmField
        public static final ProtoAdapter<IRAContributionData> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contributionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String contribution_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "taxYear", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final int tax_year;

        public IRAContributionData() {
            this(null, 0, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24364newBuilder();
        }

        public final String getContribution_type() {
            return this.contribution_type;
        }

        public /* synthetic */ IRAContributionData(String str, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final int getTax_year() {
            return this.tax_year;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IRAContributionData(String contribution_type, int i, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(contribution_type, "contribution_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.contribution_type = contribution_type;
            this.tax_year = i;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24364newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof IRAContributionData)) {
                return false;
            }
            IRAContributionData iRAContributionData = (IRAContributionData) other;
            return Intrinsics.areEqual(unknownFields(), iRAContributionData.unknownFields()) && Intrinsics.areEqual(this.contribution_type, iRAContributionData.contribution_type) && this.tax_year == iRAContributionData.tax_year;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.contribution_type.hashCode()) * 37) + Integer.hashCode(this.tax_year);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("contribution_type=" + Internal.sanitize(this.contribution_type));
            arrayList.add("tax_year=" + this.tax_year);
            return CollectionsKt.joinToString$default(arrayList, ", ", "IRAContributionData{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ IRAContributionData copy$default(IRAContributionData iRAContributionData, String str, int i, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = iRAContributionData.contribution_type;
            }
            if ((i2 & 2) != 0) {
                i = iRAContributionData.tax_year;
            }
            if ((i2 & 4) != 0) {
                byteString = iRAContributionData.unknownFields();
            }
            return iRAContributionData.copy(str, i, byteString);
        }

        public final IRAContributionData copy(String contribution_type, int tax_year, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(contribution_type, "contribution_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new IRAContributionData(contribution_type, tax_year, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IRAContributionData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<IRAContributionData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$IRAContributionData$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.IRAContributionData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    int iIntValue = 0;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new MAXTransferContext.IRAContributionData(strDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MAXTransferContext.IRAContributionData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getContribution_type(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContribution_type());
                    }
                    return value.getTax_year() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getTax_year())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MAXTransferContext.IRAContributionData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getContribution_type(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContribution_type());
                    }
                    if (value.getTax_year() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTax_year()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MAXTransferContext.IRAContributionData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getTax_year() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTax_year()));
                    }
                    if (Intrinsics.areEqual(value.getContribution_type(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContribution_type());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.IRAContributionData redact(MAXTransferContext.IRAContributionData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return MAXTransferContext.IRAContributionData.copy$default(value, null, 0, ByteString.EMPTY, 3, null);
                }
            };
        }
    }

    /* compiled from: MAXTransferContext.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRADistributionData;", "Lcom/squareup/wire/Message;", "", "distribution_type", "", "state", "state_tax_rate", "", "federal_tax_rate", "masked_state", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Lokio/ByteString;)V", "getDistribution_type", "()Ljava/lang/String;", "getState", "getState_tax_rate", "()D", "getFederal_tax_rate", "getMasked_state", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IRADistributionData extends Message {

        @JvmField
        public static final ProtoAdapter<IRADistributionData> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "distributionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String distribution_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "federalTaxRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final double federal_tax_rate;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 1002)
        private final String masked_state;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String state;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "stateTaxRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final double state_tax_rate;

        public IRADistributionData() {
            this(null, null, 0.0d, 0.0d, null, null, 63, null);
        }

        public /* synthetic */ IRADistributionData(String str, String str2, double d, double d2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24365newBuilder();
        }

        public final String getDistribution_type() {
            return this.distribution_type;
        }

        public final String getState() {
            return this.state;
        }

        public final double getState_tax_rate() {
            return this.state_tax_rate;
        }

        public final double getFederal_tax_rate() {
            return this.federal_tax_rate;
        }

        public final String getMasked_state() {
            return this.masked_state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IRADistributionData(String distribution_type, String state, double d, double d2, String masked_state, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(masked_state, "masked_state");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.distribution_type = distribution_type;
            this.state = state;
            this.state_tax_rate = d;
            this.federal_tax_rate = d2;
            this.masked_state = masked_state;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24365newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof IRADistributionData)) {
                return false;
            }
            IRADistributionData iRADistributionData = (IRADistributionData) other;
            return Intrinsics.areEqual(unknownFields(), iRADistributionData.unknownFields()) && Intrinsics.areEqual(this.distribution_type, iRADistributionData.distribution_type) && Intrinsics.areEqual(this.state, iRADistributionData.state) && this.state_tax_rate == iRADistributionData.state_tax_rate && this.federal_tax_rate == iRADistributionData.federal_tax_rate && Intrinsics.areEqual(this.masked_state, iRADistributionData.masked_state);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.distribution_type.hashCode()) * 37) + this.state.hashCode()) * 37) + Double.hashCode(this.state_tax_rate)) * 37) + Double.hashCode(this.federal_tax_rate)) * 37) + this.masked_state.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("distribution_type=" + Internal.sanitize(this.distribution_type));
            arrayList.add("state=" + Internal.sanitize(this.state));
            arrayList.add("state_tax_rate=" + this.state_tax_rate);
            arrayList.add("federal_tax_rate=" + this.federal_tax_rate);
            arrayList.add("masked_state=" + Internal.sanitize(this.masked_state));
            return CollectionsKt.joinToString$default(arrayList, ", ", "IRADistributionData{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ IRADistributionData copy$default(IRADistributionData iRADistributionData, String str, String str2, double d, double d2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iRADistributionData.distribution_type;
            }
            if ((i & 2) != 0) {
                str2 = iRADistributionData.state;
            }
            if ((i & 4) != 0) {
                d = iRADistributionData.state_tax_rate;
            }
            if ((i & 8) != 0) {
                d2 = iRADistributionData.federal_tax_rate;
            }
            if ((i & 16) != 0) {
                str3 = iRADistributionData.masked_state;
            }
            if ((i & 32) != 0) {
                byteString = iRADistributionData.unknownFields();
            }
            double d3 = d2;
            double d4 = d;
            return iRADistributionData.copy(str, str2, d4, d3, str3, byteString);
        }

        public final IRADistributionData copy(String distribution_type, String state, double state_tax_rate, double federal_tax_rate, String masked_state, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(masked_state, "masked_state");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new IRADistributionData(distribution_type, state, state_tax_rate, federal_tax_rate, masked_state, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IRADistributionData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<IRADistributionData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$IRADistributionData$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.IRADistributionData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    double dDoubleValue = 0.0d;
                    double dDoubleValue2 = 0.0d;
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new MAXTransferContext.IRADistributionData(strDecode, strDecode2, dDoubleValue, dDoubleValue2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 4) {
                            dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 1002) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MAXTransferContext.IRADistributionData value) {
                    Double dValueOf = Double.valueOf(0.0d);
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getDistribution_type(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDistribution_type());
                    }
                    if (!Intrinsics.areEqual(value.getState(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getState());
                    }
                    if (!Double.valueOf(value.getState_tax_rate()).equals(dValueOf)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getState_tax_rate()));
                    }
                    if (!Double.valueOf(value.getFederal_tax_rate()).equals(dValueOf)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getFederal_tax_rate()));
                    }
                    return !Intrinsics.areEqual(value.getMasked_state(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1002, value.getMasked_state()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MAXTransferContext.IRADistributionData value) throws IOException {
                    Double dValueOf = Double.valueOf(0.0d);
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getDistribution_type(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDistribution_type());
                    }
                    if (!Intrinsics.areEqual(value.getState(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getState());
                    }
                    if (!Double.valueOf(value.getState_tax_rate()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getState_tax_rate()));
                    }
                    if (!Double.valueOf(value.getFederal_tax_rate()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getFederal_tax_rate()));
                    }
                    if (!Intrinsics.areEqual(value.getMasked_state(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1002, (int) value.getMasked_state());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MAXTransferContext.IRADistributionData value) throws IOException {
                    Double dValueOf = Double.valueOf(0.0d);
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getMasked_state(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1002, (int) value.getMasked_state());
                    }
                    if (!Double.valueOf(value.getFederal_tax_rate()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getFederal_tax_rate()));
                    }
                    if (!Double.valueOf(value.getState_tax_rate()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getState_tax_rate()));
                    }
                    if (!Intrinsics.areEqual(value.getState(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getState());
                    }
                    if (Intrinsics.areEqual(value.getDistribution_type(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDistribution_type());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.IRADistributionData redact(MAXTransferContext.IRADistributionData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return MAXTransferContext.IRADistributionData.copy$default(value, null, null, 0.0d, 0.0d, null, ByteString.EMPTY, 31, null);
                }
            };
        }
    }

    /* compiled from: MAXTransferContext.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRARothConversionData;", "Lcom/squareup/wire/Message;", "", "tax_year", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ILokio/ByteString;)V", "getTax_year", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IRARothConversionData extends Message {

        @JvmField
        public static final ProtoAdapter<IRARothConversionData> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "taxYear", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final int tax_year;

        /* JADX WARN: Multi-variable type inference failed */
        public IRARothConversionData() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24366newBuilder();
        }

        public final int getTax_year() {
            return this.tax_year;
        }

        public /* synthetic */ IRARothConversionData(int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IRARothConversionData(int i, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.tax_year = i;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24366newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof IRARothConversionData)) {
                return false;
            }
            IRARothConversionData iRARothConversionData = (IRARothConversionData) other;
            return Intrinsics.areEqual(unknownFields(), iRARothConversionData.unknownFields()) && this.tax_year == iRARothConversionData.tax_year;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + Integer.hashCode(this.tax_year);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("tax_year=" + this.tax_year);
            return CollectionsKt.joinToString$default(arrayList, ", ", "IRARothConversionData{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ IRARothConversionData copy$default(IRARothConversionData iRARothConversionData, int i, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = iRARothConversionData.tax_year;
            }
            if ((i2 & 2) != 0) {
                byteString = iRARothConversionData.unknownFields();
            }
            return iRARothConversionData.copy(i, byteString);
        }

        public final IRARothConversionData copy(int tax_year, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new IRARothConversionData(tax_year, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IRARothConversionData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<IRARothConversionData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$IRARothConversionData$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.IRARothConversionData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    int iIntValue = 0;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new MAXTransferContext.IRARothConversionData(iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MAXTransferContext.IRARothConversionData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getTax_year() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getTax_year())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MAXTransferContext.IRARothConversionData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getTax_year() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTax_year()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MAXTransferContext.IRARothConversionData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getTax_year() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTax_year()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.IRARothConversionData redact(MAXTransferContext.IRARothConversionData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return MAXTransferContext.IRARothConversionData.copy$default(value, 0, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: MAXTransferContext.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0006H\u0016JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError;", "Lcom/squareup/wire/Message;", "", "error_type", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;", "total_amount", "", "remaining_amount", "total_count", "remaining_count", "max_amount", "min_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;", "getTotal_amount", "()Ljava/lang/String;", "getRemaining_amount", "getTotal_count", "getRemaining_count", "getMax_amount", "getMin_amount", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "LimitErrorType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransferLimitValidationError extends Message {

        @JvmField
        public static final ProtoAdapter<TransferLimitValidationError> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferLimitValidationError$LimitErrorType#ADAPTER", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final LimitErrorType error_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final String max_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final String min_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "remainingAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String remaining_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "remainingCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final String remaining_count;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String total_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String total_count;

        public TransferLimitValidationError() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24369newBuilder();
        }

        public final LimitErrorType getError_type() {
            return this.error_type;
        }

        public /* synthetic */ TransferLimitValidationError(LimitErrorType limitErrorType, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? LimitErrorType.LIMIT_ERROR_TYPE_UNSPECIFIED : limitErrorType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getTotal_amount() {
            return this.total_amount;
        }

        public final String getRemaining_amount() {
            return this.remaining_amount;
        }

        public final String getTotal_count() {
            return this.total_count;
        }

        public final String getRemaining_count() {
            return this.remaining_count;
        }

        public final String getMax_amount() {
            return this.max_amount;
        }

        public final String getMin_amount() {
            return this.min_amount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferLimitValidationError(LimitErrorType error_type, String total_amount, String remaining_amount, String total_count, String remaining_count, String max_amount, String min_amount, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(total_amount, "total_amount");
            Intrinsics.checkNotNullParameter(remaining_amount, "remaining_amount");
            Intrinsics.checkNotNullParameter(total_count, "total_count");
            Intrinsics.checkNotNullParameter(remaining_count, "remaining_count");
            Intrinsics.checkNotNullParameter(max_amount, "max_amount");
            Intrinsics.checkNotNullParameter(min_amount, "min_amount");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.error_type = error_type;
            this.total_amount = total_amount;
            this.remaining_amount = remaining_amount;
            this.total_count = total_count;
            this.remaining_count = remaining_count;
            this.max_amount = max_amount;
            this.min_amount = min_amount;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24369newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TransferLimitValidationError)) {
                return false;
            }
            TransferLimitValidationError transferLimitValidationError = (TransferLimitValidationError) other;
            return Intrinsics.areEqual(unknownFields(), transferLimitValidationError.unknownFields()) && this.error_type == transferLimitValidationError.error_type && Intrinsics.areEqual(this.total_amount, transferLimitValidationError.total_amount) && Intrinsics.areEqual(this.remaining_amount, transferLimitValidationError.remaining_amount) && Intrinsics.areEqual(this.total_count, transferLimitValidationError.total_count) && Intrinsics.areEqual(this.remaining_count, transferLimitValidationError.remaining_count) && Intrinsics.areEqual(this.max_amount, transferLimitValidationError.max_amount) && Intrinsics.areEqual(this.min_amount, transferLimitValidationError.min_amount);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.error_type.hashCode()) * 37) + this.total_amount.hashCode()) * 37) + this.remaining_amount.hashCode()) * 37) + this.total_count.hashCode()) * 37) + this.remaining_count.hashCode()) * 37) + this.max_amount.hashCode()) * 37) + this.min_amount.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("error_type=" + this.error_type);
            arrayList.add("total_amount=" + Internal.sanitize(this.total_amount));
            arrayList.add("remaining_amount=" + Internal.sanitize(this.remaining_amount));
            arrayList.add("total_count=" + Internal.sanitize(this.total_count));
            arrayList.add("remaining_count=" + Internal.sanitize(this.remaining_count));
            arrayList.add("max_amount=" + Internal.sanitize(this.max_amount));
            arrayList.add("min_amount=" + Internal.sanitize(this.min_amount));
            return CollectionsKt.joinToString$default(arrayList, ", ", "TransferLimitValidationError{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ TransferLimitValidationError copy$default(TransferLimitValidationError transferLimitValidationError, LimitErrorType limitErrorType, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                limitErrorType = transferLimitValidationError.error_type;
            }
            if ((i & 2) != 0) {
                str = transferLimitValidationError.total_amount;
            }
            if ((i & 4) != 0) {
                str2 = transferLimitValidationError.remaining_amount;
            }
            if ((i & 8) != 0) {
                str3 = transferLimitValidationError.total_count;
            }
            if ((i & 16) != 0) {
                str4 = transferLimitValidationError.remaining_count;
            }
            if ((i & 32) != 0) {
                str5 = transferLimitValidationError.max_amount;
            }
            if ((i & 64) != 0) {
                str6 = transferLimitValidationError.min_amount;
            }
            if ((i & 128) != 0) {
                byteString = transferLimitValidationError.unknownFields();
            }
            String str7 = str6;
            ByteString byteString2 = byteString;
            String str8 = str4;
            String str9 = str5;
            return transferLimitValidationError.copy(limitErrorType, str, str2, str3, str8, str9, str7, byteString2);
        }

        public final TransferLimitValidationError copy(LimitErrorType error_type, String total_amount, String remaining_amount, String total_count, String remaining_count, String max_amount, String min_amount, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(total_amount, "total_amount");
            Intrinsics.checkNotNullParameter(remaining_amount, "remaining_amount");
            Intrinsics.checkNotNullParameter(total_count, "total_count");
            Intrinsics.checkNotNullParameter(remaining_count, "remaining_count");
            Intrinsics.checkNotNullParameter(max_amount, "max_amount");
            Intrinsics.checkNotNullParameter(min_amount, "min_amount");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TransferLimitValidationError(error_type, total_amount, remaining_amount, total_count, remaining_count, max_amount, min_amount, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferLimitValidationError.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TransferLimitValidationError>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferLimitValidationError$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MAXTransferContext.TransferLimitValidationError value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getError_type() != MAXTransferContext.TransferLimitValidationError.LimitErrorType.LIMIT_ERROR_TYPE_UNSPECIFIED) {
                        size += MAXTransferContext.TransferLimitValidationError.LimitErrorType.ADAPTER.encodedSizeWithTag(1, value.getError_type());
                    }
                    if (!Intrinsics.areEqual(value.getTotal_amount(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTotal_amount());
                    }
                    if (!Intrinsics.areEqual(value.getRemaining_amount(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRemaining_amount());
                    }
                    if (!Intrinsics.areEqual(value.getTotal_count(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTotal_count());
                    }
                    if (!Intrinsics.areEqual(value.getRemaining_count(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getRemaining_count());
                    }
                    if (!Intrinsics.areEqual(value.getMax_amount(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getMax_amount());
                    }
                    return !Intrinsics.areEqual(value.getMin_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMin_amount()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MAXTransferContext.TransferLimitValidationError value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getError_type() != MAXTransferContext.TransferLimitValidationError.LimitErrorType.LIMIT_ERROR_TYPE_UNSPECIFIED) {
                        MAXTransferContext.TransferLimitValidationError.LimitErrorType.ADAPTER.encodeWithTag(writer, 1, (int) value.getError_type());
                    }
                    if (!Intrinsics.areEqual(value.getTotal_amount(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTotal_amount());
                    }
                    if (!Intrinsics.areEqual(value.getRemaining_amount(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRemaining_amount());
                    }
                    if (!Intrinsics.areEqual(value.getTotal_count(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTotal_count());
                    }
                    if (!Intrinsics.areEqual(value.getRemaining_count(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRemaining_count());
                    }
                    if (!Intrinsics.areEqual(value.getMax_amount(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMax_amount());
                    }
                    if (!Intrinsics.areEqual(value.getMin_amount(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMin_amount());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MAXTransferContext.TransferLimitValidationError value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getMin_amount(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMin_amount());
                    }
                    if (!Intrinsics.areEqual(value.getMax_amount(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMax_amount());
                    }
                    if (!Intrinsics.areEqual(value.getRemaining_count(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRemaining_count());
                    }
                    if (!Intrinsics.areEqual(value.getTotal_count(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTotal_count());
                    }
                    if (!Intrinsics.areEqual(value.getRemaining_amount(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRemaining_amount());
                    }
                    if (!Intrinsics.areEqual(value.getTotal_amount(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTotal_amount());
                    }
                    if (value.getError_type() != MAXTransferContext.TransferLimitValidationError.LimitErrorType.LIMIT_ERROR_TYPE_UNSPECIFIED) {
                        MAXTransferContext.TransferLimitValidationError.LimitErrorType.ADAPTER.encodeWithTag(writer, 1, (int) value.getError_type());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.TransferLimitValidationError decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    MAXTransferContext.TransferLimitValidationError.LimitErrorType limitErrorTypeDecode = MAXTransferContext.TransferLimitValidationError.LimitErrorType.LIMIT_ERROR_TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = strDecode;
                    String strDecode3 = strDecode2;
                    String strDecode4 = strDecode3;
                    String strDecode5 = strDecode4;
                    String strDecode6 = strDecode5;
                    while (true) {
                        MAXTransferContext.TransferLimitValidationError.LimitErrorType limitErrorType = limitErrorTypeDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag != -1) {
                                switch (iNextTag) {
                                    case 1:
                                        try {
                                            limitErrorTypeDecode = MAXTransferContext.TransferLimitValidationError.LimitErrorType.ADAPTER.decode(reader);
                                            break;
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                            break;
                                        }
                                    case 2:
                                        strDecode = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 3:
                                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 4:
                                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 5:
                                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 6:
                                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 7:
                                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    default:
                                        reader.readUnknownField(iNextTag);
                                        break;
                                }
                            } else {
                                return new MAXTransferContext.TransferLimitValidationError(limitErrorType, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.TransferLimitValidationError redact(MAXTransferContext.TransferLimitValidationError value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return MAXTransferContext.TransferLimitValidationError.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MAXTransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LIMIT_ERROR_TYPE_UNSPECIFIED", "AMOUNT", "COUNT", "MAX_TRANSFER", "MIN_TRANSFER", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class LimitErrorType implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ LimitErrorType[] $VALUES;

            @JvmField
            public static final ProtoAdapter<LimitErrorType> ADAPTER;
            public static final LimitErrorType AMOUNT;
            public static final LimitErrorType COUNT;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final LimitErrorType LIMIT_ERROR_TYPE_UNSPECIFIED;
            public static final LimitErrorType MAX_TRANSFER;
            public static final LimitErrorType MIN_TRANSFER;
            private final int value;

            private static final /* synthetic */ LimitErrorType[] $values() {
                return new LimitErrorType[]{LIMIT_ERROR_TYPE_UNSPECIFIED, AMOUNT, COUNT, MAX_TRANSFER, MIN_TRANSFER};
            }

            @JvmStatic
            public static final LimitErrorType fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<LimitErrorType> getEntries() {
                return $ENTRIES;
            }

            private LimitErrorType(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final LimitErrorType limitErrorType = new LimitErrorType("LIMIT_ERROR_TYPE_UNSPECIFIED", 0, 0);
                LIMIT_ERROR_TYPE_UNSPECIFIED = limitErrorType;
                AMOUNT = new LimitErrorType("AMOUNT", 1, 1);
                COUNT = new LimitErrorType("COUNT", 2, 2);
                MAX_TRANSFER = new LimitErrorType("MAX_TRANSFER", 3, 3);
                MIN_TRANSFER = new LimitErrorType("MIN_TRANSFER", 4, 4);
                LimitErrorType[] limitErrorTypeArr$values = $values();
                $VALUES = limitErrorTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(limitErrorTypeArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LimitErrorType.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<LimitErrorType>(orCreateKotlinClass, syntax, limitErrorType) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferLimitValidationError$LimitErrorType$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public MAXTransferContext.TransferLimitValidationError.LimitErrorType fromValue(int value) {
                        return MAXTransferContext.TransferLimitValidationError.LimitErrorType.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: MAXTransferContext.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final LimitErrorType fromValue(int value) {
                    if (value == 0) {
                        return LimitErrorType.LIMIT_ERROR_TYPE_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return LimitErrorType.AMOUNT;
                    }
                    if (value == 2) {
                        return LimitErrorType.COUNT;
                    }
                    if (value == 3) {
                        return LimitErrorType.MAX_TRANSFER;
                    }
                    if (value != 4) {
                        return null;
                    }
                    return LimitErrorType.MIN_TRANSFER;
                }
            }

            public static LimitErrorType valueOf(String str) {
                return (LimitErrorType) Enum.valueOf(LimitErrorType.class, str);
            }

            public static LimitErrorType[] values() {
                return (LimitErrorType[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: MAXTransferContext.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$CurrencyConversionData;", "Lcom/squareup/wire/Message;", "", "target_amount", "", "target_currency_code", "Lcom/robinhood/rosetta/common/Currency;", "target_fx_rate", "target_fx_rate_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTarget_amount", "()Ljava/lang/String;", "getTarget_currency_code", "()Lcom/robinhood/rosetta/common/Currency;", "getTarget_fx_rate", "getTarget_fx_rate_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CurrencyConversionData extends Message {

        @JvmField
        public static final ProtoAdapter<CurrencyConversionData> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String target_amount;

        @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "targetCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Currency target_currency_code;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetFxRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String target_fx_rate;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetFxRateId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String target_fx_rate_id;

        public CurrencyConversionData() {
            this(null, null, null, null, null, 31, null);
        }

        public /* synthetic */ CurrencyConversionData(String str, Currency currency, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24363newBuilder();
        }

        public final String getTarget_amount() {
            return this.target_amount;
        }

        public final Currency getTarget_currency_code() {
            return this.target_currency_code;
        }

        public final String getTarget_fx_rate() {
            return this.target_fx_rate;
        }

        public final String getTarget_fx_rate_id() {
            return this.target_fx_rate_id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrencyConversionData(String target_amount, Currency target_currency_code, String target_fx_rate, String target_fx_rate_id, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(target_amount, "target_amount");
            Intrinsics.checkNotNullParameter(target_currency_code, "target_currency_code");
            Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
            Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.target_amount = target_amount;
            this.target_currency_code = target_currency_code;
            this.target_fx_rate = target_fx_rate;
            this.target_fx_rate_id = target_fx_rate_id;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24363newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CurrencyConversionData)) {
                return false;
            }
            CurrencyConversionData currencyConversionData = (CurrencyConversionData) other;
            return Intrinsics.areEqual(unknownFields(), currencyConversionData.unknownFields()) && Intrinsics.areEqual(this.target_amount, currencyConversionData.target_amount) && this.target_currency_code == currencyConversionData.target_currency_code && Intrinsics.areEqual(this.target_fx_rate, currencyConversionData.target_fx_rate) && Intrinsics.areEqual(this.target_fx_rate_id, currencyConversionData.target_fx_rate_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((unknownFields().hashCode() * 37) + this.target_amount.hashCode()) * 37) + this.target_currency_code.hashCode()) * 37) + this.target_fx_rate.hashCode()) * 37) + this.target_fx_rate_id.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("target_amount=" + Internal.sanitize(this.target_amount));
            arrayList.add("target_currency_code=" + this.target_currency_code);
            arrayList.add("target_fx_rate=" + Internal.sanitize(this.target_fx_rate));
            arrayList.add("target_fx_rate_id=" + Internal.sanitize(this.target_fx_rate_id));
            return CollectionsKt.joinToString$default(arrayList, ", ", "CurrencyConversionData{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CurrencyConversionData copy$default(CurrencyConversionData currencyConversionData, String str, Currency currency, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = currencyConversionData.target_amount;
            }
            if ((i & 2) != 0) {
                currency = currencyConversionData.target_currency_code;
            }
            if ((i & 4) != 0) {
                str2 = currencyConversionData.target_fx_rate;
            }
            if ((i & 8) != 0) {
                str3 = currencyConversionData.target_fx_rate_id;
            }
            if ((i & 16) != 0) {
                byteString = currencyConversionData.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str4 = str2;
            return currencyConversionData.copy(str, currency, str4, str3, byteString2);
        }

        public final CurrencyConversionData copy(String target_amount, Currency target_currency_code, String target_fx_rate, String target_fx_rate_id, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(target_amount, "target_amount");
            Intrinsics.checkNotNullParameter(target_currency_code, "target_currency_code");
            Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
            Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CurrencyConversionData(target_amount, target_currency_code, target_fx_rate, target_fx_rate_id, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyConversionData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CurrencyConversionData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$CurrencyConversionData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MAXTransferContext.CurrencyConversionData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getTarget_amount(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTarget_amount());
                    }
                    if (value.getTarget_currency_code() != Currency.CURRENCY_UNSPECIFIED) {
                        size += Currency.ADAPTER.encodedSizeWithTag(2, value.getTarget_currency_code());
                    }
                    if (!Intrinsics.areEqual(value.getTarget_fx_rate(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTarget_fx_rate());
                    }
                    return !Intrinsics.areEqual(value.getTarget_fx_rate_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTarget_fx_rate_id()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MAXTransferContext.CurrencyConversionData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getTarget_amount(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTarget_amount());
                    }
                    if (value.getTarget_currency_code() != Currency.CURRENCY_UNSPECIFIED) {
                        Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getTarget_currency_code());
                    }
                    if (!Intrinsics.areEqual(value.getTarget_fx_rate(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTarget_fx_rate());
                    }
                    if (!Intrinsics.areEqual(value.getTarget_fx_rate_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTarget_fx_rate_id());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MAXTransferContext.CurrencyConversionData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getTarget_fx_rate_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTarget_fx_rate_id());
                    }
                    if (!Intrinsics.areEqual(value.getTarget_fx_rate(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTarget_fx_rate());
                    }
                    if (value.getTarget_currency_code() != Currency.CURRENCY_UNSPECIFIED) {
                        Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getTarget_currency_code());
                    }
                    if (Intrinsics.areEqual(value.getTarget_amount(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTarget_amount());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.CurrencyConversionData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = strDecode;
                    String strDecode3 = strDecode2;
                    while (true) {
                        Currency currency = currencyDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new MAXTransferContext.CurrencyConversionData(strDecode, currency, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                try {
                                    currencyDecode = Currency.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 3) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 4) {
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MAXTransferContext.CurrencyConversionData redact(MAXTransferContext.CurrencyConversionData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return MAXTransferContext.CurrencyConversionData.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
                }
            };
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MAXTransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b\u0092\u0001\b\u0086\u0081\u0002\u0018\u0000 \u0095\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0095\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001¨\u0006\u0096\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_UNSPECIFIED", "FTR_DCF_LINKING", "MAINTENANCE_CALL", "MAINTENANCE_CALL_WARNING", "DAY_TRADE_CALL", "TRANSFER_HUB", "RECURRING_TRANSFER_HUB", "SPENDING_HOME", "SPENDING_HOME_WITH_ACTION_BAR", "RHY_RECURRING_MARKETING_PUSH", "RHY_RECURRING_MARKETING_EMAIL", "RHY_RECURRING_MARKETING_INBOX", "RHS_RECURRING_UPSELL", "RHY_RECURRING_UPSELL", "BUYING_POWER_BREAKDOWN", "MARGIN_HUB", "SPENDING_INCENTIVE", "OPTIONS_TRADING_FLOW", "EQUITIES_TRADING_FLOW", "INVEST_FLOW", "RETIREMENT_CONTRIBUTION_HUB", "RETIREMENT_UNFUNDED_DASHBOARD", "BUYING_POWER_DETAIL", "RETIREMENT_FUNDING_METHODS", "EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL", "CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL", "RETIREMENT_FUNDED_DASHBOARD", "P2P_PAY_FLOW", "LINK_DEBIT_CARD", "MENU_OF_OPTIONS", "GOLD_SETTINGS", "GOLD_WELCOME", "RETIREMENT_GOLD_MATCH_PROMO", "GOLD_RET_PROMO_BOTTOM_SHEET", "POST_TRADE_FLOW_PDT", "RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON", "RFP_DECLINED_INBOX", "RFP_DECLINED_EMAIL", "RFP_EXPIRED_INBOX", "RFP_EXPIRED_EMAIL", "RFP_FAILED_INBOX", "RFP_FAILED_EMAIL", "RECOMMENDATIONS_FOR_RETIREMENT", "OUTGOING_WIRE", "RECURRING_DEPOSIT_UPSELL", "FEATURE_DISCOVERY", "CARD", "GOLD_BOOSTED_APY_FEATURE_DISCOVERY", "GOLD_BOOSTED_APY_CARD", "GOLD_BOOSTED_APY_ACCOUNT_BANNER", "GOLD_BOOSTED_APY_BOTTOM_SHEET", "GOLD_BOOSTED_APY_CASH_SECTION", "GOLD_BOOSTED_APY_EMAIL", "GOLD_BOOSTED_APY_PUSH", "RESURRECTIONS_M2_UPSELL", "GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER", "M3A_CHURNED_ZERO_VARIANT1", "M3A_CHURNED_ZERO_VARIANT2", "M3B_INACTIVE_VARIANT1", "M3B_INACTIVE_VARIANT2", "GOLD_OPT_IN_UPGRADE_WELCOME", "AUC_APY_AUTO_BOOST_ALERT_SHEET", "NUX_CHECKLIST", "RETIREMENT_SETTINGS", "DISABLE_MARGIN_FAILURE", "INSTANT_DEPOSITS_CARD", "SWEEP_ONBOARDING", "GOLD_WELCOME_DEPOSIT_HOOK", "SWEEP_HUB", "WATCHLIST_SWEEP_SECTION", "GOLD_DEPOSIT_BOOST_EDUCATION", "PATHFINDER_RHY_DEACTIVATION", "PATHFINDER_RHS_DEACTIVATION", "GOLD_HUB_TRACKER_SWEEP", "GOLD_HUB_CARD_DEPOSIT_BOOST", "GOLD_HUB_CARD_SWEEP_ACTIVE", "GOLD_HUB_CARD_INSTANT", "GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE", "GOLD_HUB_FEATURE_DEPOSIT_BOOST", "DEPOSIT_BOOST_HUB_DEFICIT_BANNER", "DEPOSIT_BOOST_HUB_CTA", "DEPOSIT_BOOST_EDUCATION_MODAL", "PATHFINDER_ACCOUNT_CLOSURE_IRA", "PATHFINDER_ACCOUNT_CLOSURE", "PDT_DEPOSIT_FUNDS", "DEBIT_CARD_LINKING_SUCCESS", "TRANSFER_MONEY_FORM", "IRA_TRANSFER_FORM", "RETIREMENT_CONTRIBUTION_CARD", "MENU_OF_OPTIONS_JOINT_ACCOUNT", "GOLD_SWEEP_HUB", "NOT_ENOUGH_BUYING_POWER", "EQUITY_DAY_TRADE_REASON_PDT", "PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE", "MARGIN_SETTINGS", "JOINT_ACCOUNT_FUNDING_METHODS", "MAINTENANCE_CALL_WITH_FUTURES", "BLACK_WIDOW", "ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET", "GOLD_SWEEP_SPLASH_DEPOSIT_ROW", "CREDIT_CARD_APP", "CREDIT_CARD_APP_BOOSTED_CASH_BACK", "GOLD_BOOSTED_APY_TRANSFER_HUB", "GOLD_DOWNGRADE_PREVENTION", "CREDIT_CARD_APP_AUC_CLI", "INCENTIVE_PRE_DEPOSIT", "INCENTIVE_POST_DEPOSIT", "LEGEND_EQUITY_TRADING_FLOW", "LEGEND_OPTIONS_TRADING_FLOW", "LEGEND_CRYPTO_TRADING_FLOW", "LEGEND_SIDEBAR_DEPOSIT", "LEGEND_SIDEBAR_TRANSFERS", "LEGEND_ACCOUNT_WIDGET", "ADVISORY_DASHBOARD_DEPOSIT_BUTTON", "CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS", "ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON", "ROTH_CONVERSION", "GOLD_WELCOME_NATIVE", "CRYPTO_ORDER_CHECK", "EQUITY_ORDER_CHECK", "FUTURES_ORDER_CHECK", "OPTIONS_ORDER_CHECK", "GOLD_BOOSTED_APY_REWARD_CENTER_OFFER", "MANAGED_ACCOUNT_ONBOARDING_FLOW", "ADVISORY_FUTURE_PROJECTION", "BROKERAGE_ACCOUNT_OVERVIEW", "TRANSFER_HUB_DEPOSIT", "TRANSFER_HUB_WITHDRAW", "LEGEND_FUTURES_TRADING_FLOW", "INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW", "INDIVIDUAL_ACCOUNT_NUX_FLOW", "SHORT_SELL_ENABLEMENT", "CUSTODIAL_ACCOUNT_ONBOARDING_FLOW", "CUSTODIAL_ACCOUNT_NUX_FLOW", "MARGIN_ONBOARDING", "STRATEGIES_AUTO_SELECT", "ISA_CONTRIBUTION", "EVENT_CONTRACTS_ORDER_CHECK", "DIRECT_IPO_ORDER_CHECK", "INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;
        public static final EntryPoint ADVISORY_DASHBOARD_DEPOSIT_BUTTON;
        public static final EntryPoint ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON;
        public static final EntryPoint ADVISORY_FUTURE_PROJECTION;
        public static final EntryPoint AUC_APY_AUTO_BOOST_ALERT_SHEET;
        public static final EntryPoint BLACK_WIDOW;
        public static final EntryPoint BROKERAGE_ACCOUNT_OVERVIEW;
        public static final EntryPoint BUYING_POWER_BREAKDOWN;
        public static final EntryPoint BUYING_POWER_DETAIL;
        public static final EntryPoint CARD;
        public static final EntryPoint CREDIT_CARD_APP;
        public static final EntryPoint CREDIT_CARD_APP_AUC_CLI;
        public static final EntryPoint CREDIT_CARD_APP_BOOSTED_CASH_BACK;
        public static final EntryPoint CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS;
        public static final EntryPoint CRYPTO_ORDER_CHECK;
        public static final EntryPoint CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL;
        public static final EntryPoint CUSTODIAL_ACCOUNT_NUX_FLOW;
        public static final EntryPoint CUSTODIAL_ACCOUNT_ONBOARDING_FLOW;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint DAY_TRADE_CALL;
        public static final EntryPoint DEBIT_CARD_LINKING_SUCCESS;
        public static final EntryPoint DEPOSIT_BOOST_EDUCATION_MODAL;
        public static final EntryPoint DEPOSIT_BOOST_HUB_CTA;
        public static final EntryPoint DEPOSIT_BOOST_HUB_DEFICIT_BANNER;
        public static final EntryPoint DIRECT_IPO_ORDER_CHECK;
        public static final EntryPoint DISABLE_MARGIN_FAILURE;
        public static final EntryPoint ENTRY_POINT_UNSPECIFIED;
        public static final EntryPoint EQUITIES_TRADING_FLOW;
        public static final EntryPoint EQUITY_DAY_TRADE_REASON_PDT;
        public static final EntryPoint EQUITY_ORDER_CHECK;
        public static final EntryPoint EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL;
        public static final EntryPoint EVENT_CONTRACTS_ORDER_CHECK;
        public static final EntryPoint FEATURE_DISCOVERY;
        public static final EntryPoint FTR_DCF_LINKING;
        public static final EntryPoint FUTURES_ORDER_CHECK;
        public static final EntryPoint GOLD_BOOSTED_APY_ACCOUNT_BANNER;
        public static final EntryPoint GOLD_BOOSTED_APY_BOTTOM_SHEET;
        public static final EntryPoint GOLD_BOOSTED_APY_CARD;
        public static final EntryPoint GOLD_BOOSTED_APY_CASH_SECTION;
        public static final EntryPoint GOLD_BOOSTED_APY_EMAIL;
        public static final EntryPoint GOLD_BOOSTED_APY_FEATURE_DISCOVERY;
        public static final EntryPoint GOLD_BOOSTED_APY_PUSH;
        public static final EntryPoint GOLD_BOOSTED_APY_REWARD_CENTER_OFFER;
        public static final EntryPoint GOLD_BOOSTED_APY_TRANSFER_HUB;
        public static final EntryPoint GOLD_DEPOSIT_BOOST_EDUCATION;
        public static final EntryPoint GOLD_DOWNGRADE_PREVENTION;
        public static final EntryPoint GOLD_HUB_CARD_DEPOSIT_BOOST;
        public static final EntryPoint GOLD_HUB_CARD_INSTANT;
        public static final EntryPoint GOLD_HUB_CARD_SWEEP_ACTIVE;
        public static final EntryPoint GOLD_HUB_FEATURE_DEPOSIT_BOOST;
        public static final EntryPoint GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE;
        public static final EntryPoint GOLD_HUB_TRACKER_SWEEP;
        public static final EntryPoint GOLD_OPT_IN_UPGRADE_WELCOME;
        public static final EntryPoint GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER;
        public static final EntryPoint GOLD_RET_PROMO_BOTTOM_SHEET;
        public static final EntryPoint GOLD_SETTINGS;
        public static final EntryPoint GOLD_SWEEP_HUB;
        public static final EntryPoint GOLD_SWEEP_SPLASH_DEPOSIT_ROW;
        public static final EntryPoint GOLD_WELCOME;
        public static final EntryPoint GOLD_WELCOME_DEPOSIT_HOOK;
        public static final EntryPoint GOLD_WELCOME_NATIVE;
        public static final EntryPoint INCENTIVE_POST_DEPOSIT;
        public static final EntryPoint INCENTIVE_PRE_DEPOSIT;
        public static final EntryPoint INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER;
        public static final EntryPoint INDIVIDUAL_ACCOUNT_NUX_FLOW;
        public static final EntryPoint INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW;
        public static final EntryPoint INSTANT_DEPOSITS_CARD;
        public static final EntryPoint INVEST_FLOW;
        public static final EntryPoint IRA_TRANSFER_FORM;
        public static final EntryPoint ISA_CONTRIBUTION;
        public static final EntryPoint JOINT_ACCOUNT_FUNDING_METHODS;
        public static final EntryPoint LEGEND_ACCOUNT_WIDGET;
        public static final EntryPoint LEGEND_CRYPTO_TRADING_FLOW;
        public static final EntryPoint LEGEND_EQUITY_TRADING_FLOW;
        public static final EntryPoint LEGEND_FUTURES_TRADING_FLOW;
        public static final EntryPoint LEGEND_OPTIONS_TRADING_FLOW;
        public static final EntryPoint LEGEND_SIDEBAR_DEPOSIT;
        public static final EntryPoint LEGEND_SIDEBAR_TRANSFERS;
        public static final EntryPoint LINK_DEBIT_CARD;
        public static final EntryPoint M3A_CHURNED_ZERO_VARIANT1;
        public static final EntryPoint M3A_CHURNED_ZERO_VARIANT2;
        public static final EntryPoint M3B_INACTIVE_VARIANT1;
        public static final EntryPoint M3B_INACTIVE_VARIANT2;
        public static final EntryPoint MAINTENANCE_CALL;
        public static final EntryPoint MAINTENANCE_CALL_WARNING;
        public static final EntryPoint MAINTENANCE_CALL_WITH_FUTURES;
        public static final EntryPoint MANAGED_ACCOUNT_ONBOARDING_FLOW;
        public static final EntryPoint MARGIN_HUB;
        public static final EntryPoint MARGIN_ONBOARDING;
        public static final EntryPoint MARGIN_SETTINGS;
        public static final EntryPoint MENU_OF_OPTIONS;
        public static final EntryPoint MENU_OF_OPTIONS_JOINT_ACCOUNT;
        public static final EntryPoint NOT_ENOUGH_BUYING_POWER;
        public static final EntryPoint NUX_CHECKLIST;
        public static final EntryPoint ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET;
        public static final EntryPoint OPTIONS_ORDER_CHECK;
        public static final EntryPoint OPTIONS_TRADING_FLOW;
        public static final EntryPoint OUTGOING_WIRE;
        public static final EntryPoint P2P_PAY_FLOW;
        public static final EntryPoint PATHFINDER_ACCOUNT_CLOSURE;
        public static final EntryPoint PATHFINDER_ACCOUNT_CLOSURE_IRA;
        public static final EntryPoint PATHFINDER_RHS_DEACTIVATION;
        public static final EntryPoint PATHFINDER_RHY_DEACTIVATION;
        public static final EntryPoint PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE;
        public static final EntryPoint PDT_DEPOSIT_FUNDS;
        public static final EntryPoint POST_TRADE_FLOW_PDT;
        public static final EntryPoint RECOMMENDATIONS_FOR_RETIREMENT;
        public static final EntryPoint RECURRING_DEPOSIT_UPSELL;
        public static final EntryPoint RECURRING_TRANSFER_HUB;
        public static final EntryPoint RESURRECTIONS_M2_UPSELL;
        public static final EntryPoint RETIREMENT_CONTRIBUTION_CARD;
        public static final EntryPoint RETIREMENT_CONTRIBUTION_HUB;
        public static final EntryPoint RETIREMENT_FUNDED_DASHBOARD;
        public static final EntryPoint RETIREMENT_FUNDING_METHODS;
        public static final EntryPoint RETIREMENT_GOLD_MATCH_PROMO;
        public static final EntryPoint RETIREMENT_SETTINGS;
        public static final EntryPoint RETIREMENT_UNFUNDED_DASHBOARD;
        public static final EntryPoint RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON;
        public static final EntryPoint RFP_DECLINED_EMAIL;
        public static final EntryPoint RFP_DECLINED_INBOX;
        public static final EntryPoint RFP_EXPIRED_EMAIL;
        public static final EntryPoint RFP_EXPIRED_INBOX;
        public static final EntryPoint RFP_FAILED_EMAIL;
        public static final EntryPoint RFP_FAILED_INBOX;
        public static final EntryPoint RHS_RECURRING_UPSELL;
        public static final EntryPoint RHY_RECURRING_MARKETING_EMAIL;
        public static final EntryPoint RHY_RECURRING_MARKETING_INBOX;
        public static final EntryPoint RHY_RECURRING_MARKETING_PUSH;
        public static final EntryPoint RHY_RECURRING_UPSELL;
        public static final EntryPoint ROTH_CONVERSION;
        public static final EntryPoint SHORT_SELL_ENABLEMENT;
        public static final EntryPoint SPENDING_HOME;
        public static final EntryPoint SPENDING_HOME_WITH_ACTION_BAR;
        public static final EntryPoint SPENDING_INCENTIVE;
        public static final EntryPoint STRATEGIES_AUTO_SELECT;
        public static final EntryPoint SWEEP_HUB;
        public static final EntryPoint SWEEP_ONBOARDING;
        public static final EntryPoint TRANSFER_HUB;
        public static final EntryPoint TRANSFER_HUB_DEPOSIT;
        public static final EntryPoint TRANSFER_HUB_WITHDRAW;
        public static final EntryPoint TRANSFER_MONEY_FORM;
        public static final EntryPoint WATCHLIST_SWEEP_SECTION;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_UNSPECIFIED, FTR_DCF_LINKING, MAINTENANCE_CALL, MAINTENANCE_CALL_WARNING, DAY_TRADE_CALL, TRANSFER_HUB, RECURRING_TRANSFER_HUB, SPENDING_HOME, SPENDING_HOME_WITH_ACTION_BAR, RHY_RECURRING_MARKETING_PUSH, RHY_RECURRING_MARKETING_EMAIL, RHY_RECURRING_MARKETING_INBOX, RHS_RECURRING_UPSELL, RHY_RECURRING_UPSELL, BUYING_POWER_BREAKDOWN, MARGIN_HUB, SPENDING_INCENTIVE, OPTIONS_TRADING_FLOW, EQUITIES_TRADING_FLOW, INVEST_FLOW, RETIREMENT_CONTRIBUTION_HUB, RETIREMENT_UNFUNDED_DASHBOARD, BUYING_POWER_DETAIL, RETIREMENT_FUNDING_METHODS, EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL, CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL, RETIREMENT_FUNDED_DASHBOARD, P2P_PAY_FLOW, LINK_DEBIT_CARD, MENU_OF_OPTIONS, GOLD_SETTINGS, GOLD_WELCOME, RETIREMENT_GOLD_MATCH_PROMO, GOLD_RET_PROMO_BOTTOM_SHEET, POST_TRADE_FLOW_PDT, RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON, RFP_DECLINED_INBOX, RFP_DECLINED_EMAIL, RFP_EXPIRED_INBOX, RFP_EXPIRED_EMAIL, RFP_FAILED_INBOX, RFP_FAILED_EMAIL, RECOMMENDATIONS_FOR_RETIREMENT, OUTGOING_WIRE, RECURRING_DEPOSIT_UPSELL, FEATURE_DISCOVERY, CARD, GOLD_BOOSTED_APY_FEATURE_DISCOVERY, GOLD_BOOSTED_APY_CARD, GOLD_BOOSTED_APY_ACCOUNT_BANNER, GOLD_BOOSTED_APY_BOTTOM_SHEET, GOLD_BOOSTED_APY_CASH_SECTION, GOLD_BOOSTED_APY_EMAIL, GOLD_BOOSTED_APY_PUSH, RESURRECTIONS_M2_UPSELL, GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER, M3A_CHURNED_ZERO_VARIANT1, M3A_CHURNED_ZERO_VARIANT2, M3B_INACTIVE_VARIANT1, M3B_INACTIVE_VARIANT2, GOLD_OPT_IN_UPGRADE_WELCOME, AUC_APY_AUTO_BOOST_ALERT_SHEET, NUX_CHECKLIST, RETIREMENT_SETTINGS, DISABLE_MARGIN_FAILURE, INSTANT_DEPOSITS_CARD, SWEEP_ONBOARDING, GOLD_WELCOME_DEPOSIT_HOOK, SWEEP_HUB, WATCHLIST_SWEEP_SECTION, GOLD_DEPOSIT_BOOST_EDUCATION, PATHFINDER_RHY_DEACTIVATION, PATHFINDER_RHS_DEACTIVATION, GOLD_HUB_TRACKER_SWEEP, GOLD_HUB_CARD_DEPOSIT_BOOST, GOLD_HUB_CARD_SWEEP_ACTIVE, GOLD_HUB_CARD_INSTANT, GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE, GOLD_HUB_FEATURE_DEPOSIT_BOOST, DEPOSIT_BOOST_HUB_DEFICIT_BANNER, DEPOSIT_BOOST_HUB_CTA, DEPOSIT_BOOST_EDUCATION_MODAL, PATHFINDER_ACCOUNT_CLOSURE_IRA, PATHFINDER_ACCOUNT_CLOSURE, PDT_DEPOSIT_FUNDS, DEBIT_CARD_LINKING_SUCCESS, TRANSFER_MONEY_FORM, IRA_TRANSFER_FORM, RETIREMENT_CONTRIBUTION_CARD, MENU_OF_OPTIONS_JOINT_ACCOUNT, GOLD_SWEEP_HUB, NOT_ENOUGH_BUYING_POWER, EQUITY_DAY_TRADE_REASON_PDT, PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE, MARGIN_SETTINGS, JOINT_ACCOUNT_FUNDING_METHODS, MAINTENANCE_CALL_WITH_FUTURES, BLACK_WIDOW, ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET, GOLD_SWEEP_SPLASH_DEPOSIT_ROW, CREDIT_CARD_APP, CREDIT_CARD_APP_BOOSTED_CASH_BACK, GOLD_BOOSTED_APY_TRANSFER_HUB, GOLD_DOWNGRADE_PREVENTION, CREDIT_CARD_APP_AUC_CLI, INCENTIVE_PRE_DEPOSIT, INCENTIVE_POST_DEPOSIT, LEGEND_EQUITY_TRADING_FLOW, LEGEND_OPTIONS_TRADING_FLOW, LEGEND_CRYPTO_TRADING_FLOW, LEGEND_SIDEBAR_DEPOSIT, LEGEND_SIDEBAR_TRANSFERS, LEGEND_ACCOUNT_WIDGET, ADVISORY_DASHBOARD_DEPOSIT_BUTTON, CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS, ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON, ROTH_CONVERSION, GOLD_WELCOME_NATIVE, CRYPTO_ORDER_CHECK, EQUITY_ORDER_CHECK, FUTURES_ORDER_CHECK, OPTIONS_ORDER_CHECK, GOLD_BOOSTED_APY_REWARD_CENTER_OFFER, MANAGED_ACCOUNT_ONBOARDING_FLOW, ADVISORY_FUTURE_PROJECTION, BROKERAGE_ACCOUNT_OVERVIEW, TRANSFER_HUB_DEPOSIT, TRANSFER_HUB_WITHDRAW, LEGEND_FUTURES_TRADING_FLOW, INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW, INDIVIDUAL_ACCOUNT_NUX_FLOW, SHORT_SELL_ENABLEMENT, CUSTODIAL_ACCOUNT_ONBOARDING_FLOW, CUSTODIAL_ACCOUNT_NUX_FLOW, MARGIN_ONBOARDING, STRATEGIES_AUTO_SELECT, ISA_CONTRIBUTION, EVENT_CONTRACTS_ORDER_CHECK, DIRECT_IPO_ORDER_CHECK, INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER};
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
            FTR_DCF_LINKING = new EntryPoint("FTR_DCF_LINKING", 1, 1);
            MAINTENANCE_CALL = new EntryPoint("MAINTENANCE_CALL", 2, 2);
            MAINTENANCE_CALL_WARNING = new EntryPoint("MAINTENANCE_CALL_WARNING", 3, 3);
            DAY_TRADE_CALL = new EntryPoint("DAY_TRADE_CALL", 4, 4);
            TRANSFER_HUB = new EntryPoint("TRANSFER_HUB", 5, 5);
            RECURRING_TRANSFER_HUB = new EntryPoint("RECURRING_TRANSFER_HUB", 6, 6);
            SPENDING_HOME = new EntryPoint("SPENDING_HOME", 7, 7);
            SPENDING_HOME_WITH_ACTION_BAR = new EntryPoint("SPENDING_HOME_WITH_ACTION_BAR", 8, 8);
            RHY_RECURRING_MARKETING_PUSH = new EntryPoint("RHY_RECURRING_MARKETING_PUSH", 9, 9);
            RHY_RECURRING_MARKETING_EMAIL = new EntryPoint("RHY_RECURRING_MARKETING_EMAIL", 10, 10);
            RHY_RECURRING_MARKETING_INBOX = new EntryPoint("RHY_RECURRING_MARKETING_INBOX", 11, 11);
            RHS_RECURRING_UPSELL = new EntryPoint("RHS_RECURRING_UPSELL", 12, 12);
            RHY_RECURRING_UPSELL = new EntryPoint("RHY_RECURRING_UPSELL", 13, 13);
            BUYING_POWER_BREAKDOWN = new EntryPoint("BUYING_POWER_BREAKDOWN", 14, 14);
            MARGIN_HUB = new EntryPoint("MARGIN_HUB", 15, 15);
            SPENDING_INCENTIVE = new EntryPoint("SPENDING_INCENTIVE", 16, 16);
            OPTIONS_TRADING_FLOW = new EntryPoint("OPTIONS_TRADING_FLOW", 17, 17);
            EQUITIES_TRADING_FLOW = new EntryPoint("EQUITIES_TRADING_FLOW", 18, 18);
            INVEST_FLOW = new EntryPoint("INVEST_FLOW", 19, 19);
            RETIREMENT_CONTRIBUTION_HUB = new EntryPoint("RETIREMENT_CONTRIBUTION_HUB", 20, 20);
            RETIREMENT_UNFUNDED_DASHBOARD = new EntryPoint("RETIREMENT_UNFUNDED_DASHBOARD", 21, 21);
            BUYING_POWER_DETAIL = new EntryPoint("BUYING_POWER_DETAIL", 22, 22);
            RETIREMENT_FUNDING_METHODS = new EntryPoint("RETIREMENT_FUNDING_METHODS", 23, 23);
            EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL = new EntryPoint("EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL", 24, 24);
            CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL = new EntryPoint("CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL", 25, 25);
            RETIREMENT_FUNDED_DASHBOARD = new EntryPoint("RETIREMENT_FUNDED_DASHBOARD", 26, 26);
            P2P_PAY_FLOW = new EntryPoint("P2P_PAY_FLOW", 27, 27);
            LINK_DEBIT_CARD = new EntryPoint("LINK_DEBIT_CARD", 28, 28);
            MENU_OF_OPTIONS = new EntryPoint("MENU_OF_OPTIONS", 29, 29);
            GOLD_SETTINGS = new EntryPoint("GOLD_SETTINGS", 30, 30);
            GOLD_WELCOME = new EntryPoint("GOLD_WELCOME", 31, 31);
            RETIREMENT_GOLD_MATCH_PROMO = new EntryPoint("RETIREMENT_GOLD_MATCH_PROMO", 32, 32);
            GOLD_RET_PROMO_BOTTOM_SHEET = new EntryPoint("GOLD_RET_PROMO_BOTTOM_SHEET", 33, 33);
            POST_TRADE_FLOW_PDT = new EntryPoint("POST_TRADE_FLOW_PDT", 34, 34);
            RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON = new EntryPoint("RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON", 35, 35);
            RFP_DECLINED_INBOX = new EntryPoint("RFP_DECLINED_INBOX", 36, 36);
            RFP_DECLINED_EMAIL = new EntryPoint("RFP_DECLINED_EMAIL", 37, 37);
            RFP_EXPIRED_INBOX = new EntryPoint("RFP_EXPIRED_INBOX", 38, 38);
            RFP_EXPIRED_EMAIL = new EntryPoint("RFP_EXPIRED_EMAIL", 39, 39);
            RFP_FAILED_INBOX = new EntryPoint("RFP_FAILED_INBOX", 40, 40);
            RFP_FAILED_EMAIL = new EntryPoint("RFP_FAILED_EMAIL", 41, 41);
            RECOMMENDATIONS_FOR_RETIREMENT = new EntryPoint("RECOMMENDATIONS_FOR_RETIREMENT", 42, 42);
            OUTGOING_WIRE = new EntryPoint("OUTGOING_WIRE", 43, 43);
            RECURRING_DEPOSIT_UPSELL = new EntryPoint("RECURRING_DEPOSIT_UPSELL", 44, 44);
            FEATURE_DISCOVERY = new EntryPoint("FEATURE_DISCOVERY", 45, 45);
            CARD = new EntryPoint("CARD", 46, 46);
            GOLD_BOOSTED_APY_FEATURE_DISCOVERY = new EntryPoint("GOLD_BOOSTED_APY_FEATURE_DISCOVERY", 47, 47);
            GOLD_BOOSTED_APY_CARD = new EntryPoint("GOLD_BOOSTED_APY_CARD", 48, 48);
            GOLD_BOOSTED_APY_ACCOUNT_BANNER = new EntryPoint("GOLD_BOOSTED_APY_ACCOUNT_BANNER", 49, 49);
            GOLD_BOOSTED_APY_BOTTOM_SHEET = new EntryPoint("GOLD_BOOSTED_APY_BOTTOM_SHEET", 50, 50);
            GOLD_BOOSTED_APY_CASH_SECTION = new EntryPoint("GOLD_BOOSTED_APY_CASH_SECTION", 51, 51);
            GOLD_BOOSTED_APY_EMAIL = new EntryPoint("GOLD_BOOSTED_APY_EMAIL", 52, 52);
            GOLD_BOOSTED_APY_PUSH = new EntryPoint("GOLD_BOOSTED_APY_PUSH", 53, 53);
            RESURRECTIONS_M2_UPSELL = new EntryPoint("RESURRECTIONS_M2_UPSELL", 54, 54);
            GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER = new EntryPoint("GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER", 55, 55);
            M3A_CHURNED_ZERO_VARIANT1 = new EntryPoint("M3A_CHURNED_ZERO_VARIANT1", 56, 56);
            M3A_CHURNED_ZERO_VARIANT2 = new EntryPoint("M3A_CHURNED_ZERO_VARIANT2", 57, 57);
            M3B_INACTIVE_VARIANT1 = new EntryPoint("M3B_INACTIVE_VARIANT1", 58, 58);
            M3B_INACTIVE_VARIANT2 = new EntryPoint("M3B_INACTIVE_VARIANT2", 59, 59);
            GOLD_OPT_IN_UPGRADE_WELCOME = new EntryPoint("GOLD_OPT_IN_UPGRADE_WELCOME", 60, 60);
            AUC_APY_AUTO_BOOST_ALERT_SHEET = new EntryPoint("AUC_APY_AUTO_BOOST_ALERT_SHEET", 61, 61);
            NUX_CHECKLIST = new EntryPoint("NUX_CHECKLIST", 62, 62);
            RETIREMENT_SETTINGS = new EntryPoint("RETIREMENT_SETTINGS", 63, 63);
            DISABLE_MARGIN_FAILURE = new EntryPoint("DISABLE_MARGIN_FAILURE", 64, 64);
            INSTANT_DEPOSITS_CARD = new EntryPoint("INSTANT_DEPOSITS_CARD", 65, 65);
            SWEEP_ONBOARDING = new EntryPoint("SWEEP_ONBOARDING", 66, 66);
            GOLD_WELCOME_DEPOSIT_HOOK = new EntryPoint("GOLD_WELCOME_DEPOSIT_HOOK", 67, 67);
            SWEEP_HUB = new EntryPoint("SWEEP_HUB", 68, 68);
            WATCHLIST_SWEEP_SECTION = new EntryPoint("WATCHLIST_SWEEP_SECTION", 69, 69);
            GOLD_DEPOSIT_BOOST_EDUCATION = new EntryPoint("GOLD_DEPOSIT_BOOST_EDUCATION", 70, 70);
            PATHFINDER_RHY_DEACTIVATION = new EntryPoint("PATHFINDER_RHY_DEACTIVATION", 71, 71);
            PATHFINDER_RHS_DEACTIVATION = new EntryPoint("PATHFINDER_RHS_DEACTIVATION", 72, 72);
            GOLD_HUB_TRACKER_SWEEP = new EntryPoint("GOLD_HUB_TRACKER_SWEEP", 73, 73);
            GOLD_HUB_CARD_DEPOSIT_BOOST = new EntryPoint("GOLD_HUB_CARD_DEPOSIT_BOOST", 74, 74);
            GOLD_HUB_CARD_SWEEP_ACTIVE = new EntryPoint("GOLD_HUB_CARD_SWEEP_ACTIVE", 75, 75);
            GOLD_HUB_CARD_INSTANT = new EntryPoint("GOLD_HUB_CARD_INSTANT", 76, 76);
            GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE = new EntryPoint("GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE", 77, 77);
            GOLD_HUB_FEATURE_DEPOSIT_BOOST = new EntryPoint("GOLD_HUB_FEATURE_DEPOSIT_BOOST", 78, 78);
            DEPOSIT_BOOST_HUB_DEFICIT_BANNER = new EntryPoint("DEPOSIT_BOOST_HUB_DEFICIT_BANNER", 79, 79);
            DEPOSIT_BOOST_HUB_CTA = new EntryPoint("DEPOSIT_BOOST_HUB_CTA", 80, 80);
            DEPOSIT_BOOST_EDUCATION_MODAL = new EntryPoint("DEPOSIT_BOOST_EDUCATION_MODAL", 81, 81);
            PATHFINDER_ACCOUNT_CLOSURE_IRA = new EntryPoint("PATHFINDER_ACCOUNT_CLOSURE_IRA", 82, 82);
            PATHFINDER_ACCOUNT_CLOSURE = new EntryPoint("PATHFINDER_ACCOUNT_CLOSURE", 83, 83);
            PDT_DEPOSIT_FUNDS = new EntryPoint("PDT_DEPOSIT_FUNDS", 84, 84);
            DEBIT_CARD_LINKING_SUCCESS = new EntryPoint("DEBIT_CARD_LINKING_SUCCESS", 85, 85);
            TRANSFER_MONEY_FORM = new EntryPoint("TRANSFER_MONEY_FORM", 86, 86);
            IRA_TRANSFER_FORM = new EntryPoint("IRA_TRANSFER_FORM", 87, 87);
            RETIREMENT_CONTRIBUTION_CARD = new EntryPoint("RETIREMENT_CONTRIBUTION_CARD", 88, 88);
            MENU_OF_OPTIONS_JOINT_ACCOUNT = new EntryPoint("MENU_OF_OPTIONS_JOINT_ACCOUNT", 89, 89);
            GOLD_SWEEP_HUB = new EntryPoint("GOLD_SWEEP_HUB", 90, 90);
            NOT_ENOUGH_BUYING_POWER = new EntryPoint("NOT_ENOUGH_BUYING_POWER", 91, 91);
            EQUITY_DAY_TRADE_REASON_PDT = new EntryPoint("EQUITY_DAY_TRADE_REASON_PDT", 92, 92);
            PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE = new EntryPoint("PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE", 93, 93);
            MARGIN_SETTINGS = new EntryPoint("MARGIN_SETTINGS", 94, 94);
            JOINT_ACCOUNT_FUNDING_METHODS = new EntryPoint("JOINT_ACCOUNT_FUNDING_METHODS", 95, 95);
            MAINTENANCE_CALL_WITH_FUTURES = new EntryPoint("MAINTENANCE_CALL_WITH_FUTURES", 96, 96);
            BLACK_WIDOW = new EntryPoint("BLACK_WIDOW", 97, 97);
            ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET = new EntryPoint("ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET", 98, 98);
            GOLD_SWEEP_SPLASH_DEPOSIT_ROW = new EntryPoint("GOLD_SWEEP_SPLASH_DEPOSIT_ROW", 99, 99);
            CREDIT_CARD_APP = new EntryPoint("CREDIT_CARD_APP", 100, 100);
            CREDIT_CARD_APP_BOOSTED_CASH_BACK = new EntryPoint("CREDIT_CARD_APP_BOOSTED_CASH_BACK", 101, 101);
            GOLD_BOOSTED_APY_TRANSFER_HUB = new EntryPoint("GOLD_BOOSTED_APY_TRANSFER_HUB", 102, 102);
            GOLD_DOWNGRADE_PREVENTION = new EntryPoint("GOLD_DOWNGRADE_PREVENTION", 103, 103);
            CREDIT_CARD_APP_AUC_CLI = new EntryPoint("CREDIT_CARD_APP_AUC_CLI", 104, 104);
            INCENTIVE_PRE_DEPOSIT = new EntryPoint("INCENTIVE_PRE_DEPOSIT", 105, 105);
            INCENTIVE_POST_DEPOSIT = new EntryPoint("INCENTIVE_POST_DEPOSIT", 106, 106);
            LEGEND_EQUITY_TRADING_FLOW = new EntryPoint("LEGEND_EQUITY_TRADING_FLOW", 107, 107);
            LEGEND_OPTIONS_TRADING_FLOW = new EntryPoint("LEGEND_OPTIONS_TRADING_FLOW", 108, 108);
            LEGEND_CRYPTO_TRADING_FLOW = new EntryPoint("LEGEND_CRYPTO_TRADING_FLOW", 109, 109);
            LEGEND_SIDEBAR_DEPOSIT = new EntryPoint("LEGEND_SIDEBAR_DEPOSIT", 110, 110);
            LEGEND_SIDEBAR_TRANSFERS = new EntryPoint("LEGEND_SIDEBAR_TRANSFERS", 111, 111);
            LEGEND_ACCOUNT_WIDGET = new EntryPoint("LEGEND_ACCOUNT_WIDGET", 112, 112);
            ADVISORY_DASHBOARD_DEPOSIT_BUTTON = new EntryPoint("ADVISORY_DASHBOARD_DEPOSIT_BUTTON", 113, 113);
            CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS = new EntryPoint("CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS", 114, 114);
            ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON = new EntryPoint("ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON", 115, 115);
            ROTH_CONVERSION = new EntryPoint("ROTH_CONVERSION", 116, 116);
            GOLD_WELCOME_NATIVE = new EntryPoint("GOLD_WELCOME_NATIVE", 117, 117);
            CRYPTO_ORDER_CHECK = new EntryPoint("CRYPTO_ORDER_CHECK", 118, 118);
            EQUITY_ORDER_CHECK = new EntryPoint("EQUITY_ORDER_CHECK", 119, 119);
            FUTURES_ORDER_CHECK = new EntryPoint("FUTURES_ORDER_CHECK", 120, 120);
            OPTIONS_ORDER_CHECK = new EntryPoint("OPTIONS_ORDER_CHECK", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
            GOLD_BOOSTED_APY_REWARD_CENTER_OFFER = new EntryPoint("GOLD_BOOSTED_APY_REWARD_CENTER_OFFER", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            MANAGED_ACCOUNT_ONBOARDING_FLOW = new EntryPoint("MANAGED_ACCOUNT_ONBOARDING_FLOW", 123, 123);
            ADVISORY_FUTURE_PROJECTION = new EntryPoint("ADVISORY_FUTURE_PROJECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            BROKERAGE_ACCOUNT_OVERVIEW = new EntryPoint("BROKERAGE_ACCOUNT_OVERVIEW", 125, 125);
            TRANSFER_HUB_DEPOSIT = new EntryPoint("TRANSFER_HUB_DEPOSIT", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            TRANSFER_HUB_WITHDRAW = new EntryPoint("TRANSFER_HUB_WITHDRAW", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
            LEGEND_FUTURES_TRADING_FLOW = new EntryPoint("LEGEND_FUTURES_TRADING_FLOW", 128, 128);
            INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW = new EntryPoint("INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
            INDIVIDUAL_ACCOUNT_NUX_FLOW = new EntryPoint("INDIVIDUAL_ACCOUNT_NUX_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            SHORT_SELL_ENABLEMENT = new EntryPoint("SHORT_SELL_ENABLEMENT", 131, 131);
            CUSTODIAL_ACCOUNT_ONBOARDING_FLOW = new EntryPoint("CUSTODIAL_ACCOUNT_ONBOARDING_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
            CUSTODIAL_ACCOUNT_NUX_FLOW = new EntryPoint("CUSTODIAL_ACCOUNT_NUX_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
            MARGIN_ONBOARDING = new EntryPoint("MARGIN_ONBOARDING", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE);
            STRATEGIES_AUTO_SELECT = new EntryPoint("STRATEGIES_AUTO_SELECT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
            ISA_CONTRIBUTION = new EntryPoint("ISA_CONTRIBUTION", 136, 136);
            EVENT_CONTRACTS_ORDER_CHECK = new EntryPoint("EVENT_CONTRACTS_ORDER_CHECK", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE);
            DIRECT_IPO_ORDER_CHECK = new EntryPoint("DIRECT_IPO_ORDER_CHECK", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE);
            INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER = new EntryPoint("INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public MAXTransferContext.EntryPoint fromValue(int value) {
                    return MAXTransferContext.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: MAXTransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                        return EntryPoint.FTR_DCF_LINKING;
                    case 2:
                        return EntryPoint.MAINTENANCE_CALL;
                    case 3:
                        return EntryPoint.MAINTENANCE_CALL_WARNING;
                    case 4:
                        return EntryPoint.DAY_TRADE_CALL;
                    case 5:
                        return EntryPoint.TRANSFER_HUB;
                    case 6:
                        return EntryPoint.RECURRING_TRANSFER_HUB;
                    case 7:
                        return EntryPoint.SPENDING_HOME;
                    case 8:
                        return EntryPoint.SPENDING_HOME_WITH_ACTION_BAR;
                    case 9:
                        return EntryPoint.RHY_RECURRING_MARKETING_PUSH;
                    case 10:
                        return EntryPoint.RHY_RECURRING_MARKETING_EMAIL;
                    case 11:
                        return EntryPoint.RHY_RECURRING_MARKETING_INBOX;
                    case 12:
                        return EntryPoint.RHS_RECURRING_UPSELL;
                    case 13:
                        return EntryPoint.RHY_RECURRING_UPSELL;
                    case 14:
                        return EntryPoint.BUYING_POWER_BREAKDOWN;
                    case 15:
                        return EntryPoint.MARGIN_HUB;
                    case 16:
                        return EntryPoint.SPENDING_INCENTIVE;
                    case 17:
                        return EntryPoint.OPTIONS_TRADING_FLOW;
                    case 18:
                        return EntryPoint.EQUITIES_TRADING_FLOW;
                    case 19:
                        return EntryPoint.INVEST_FLOW;
                    case 20:
                        return EntryPoint.RETIREMENT_CONTRIBUTION_HUB;
                    case 21:
                        return EntryPoint.RETIREMENT_UNFUNDED_DASHBOARD;
                    case 22:
                        return EntryPoint.BUYING_POWER_DETAIL;
                    case 23:
                        return EntryPoint.RETIREMENT_FUNDING_METHODS;
                    case 24:
                        return EntryPoint.EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL;
                    case 25:
                        return EntryPoint.CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL;
                    case 26:
                        return EntryPoint.RETIREMENT_FUNDED_DASHBOARD;
                    case 27:
                        return EntryPoint.P2P_PAY_FLOW;
                    case 28:
                        return EntryPoint.LINK_DEBIT_CARD;
                    case 29:
                        return EntryPoint.MENU_OF_OPTIONS;
                    case 30:
                        return EntryPoint.GOLD_SETTINGS;
                    case 31:
                        return EntryPoint.GOLD_WELCOME;
                    case 32:
                        return EntryPoint.RETIREMENT_GOLD_MATCH_PROMO;
                    case 33:
                        return EntryPoint.GOLD_RET_PROMO_BOTTOM_SHEET;
                    case 34:
                        return EntryPoint.POST_TRADE_FLOW_PDT;
                    case 35:
                        return EntryPoint.RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON;
                    case 36:
                        return EntryPoint.RFP_DECLINED_INBOX;
                    case 37:
                        return EntryPoint.RFP_DECLINED_EMAIL;
                    case 38:
                        return EntryPoint.RFP_EXPIRED_INBOX;
                    case 39:
                        return EntryPoint.RFP_EXPIRED_EMAIL;
                    case 40:
                        return EntryPoint.RFP_FAILED_INBOX;
                    case 41:
                        return EntryPoint.RFP_FAILED_EMAIL;
                    case 42:
                        return EntryPoint.RECOMMENDATIONS_FOR_RETIREMENT;
                    case 43:
                        return EntryPoint.OUTGOING_WIRE;
                    case 44:
                        return EntryPoint.RECURRING_DEPOSIT_UPSELL;
                    case 45:
                        return EntryPoint.FEATURE_DISCOVERY;
                    case 46:
                        return EntryPoint.CARD;
                    case 47:
                        return EntryPoint.GOLD_BOOSTED_APY_FEATURE_DISCOVERY;
                    case 48:
                        return EntryPoint.GOLD_BOOSTED_APY_CARD;
                    case 49:
                        return EntryPoint.GOLD_BOOSTED_APY_ACCOUNT_BANNER;
                    case 50:
                        return EntryPoint.GOLD_BOOSTED_APY_BOTTOM_SHEET;
                    case 51:
                        return EntryPoint.GOLD_BOOSTED_APY_CASH_SECTION;
                    case 52:
                        return EntryPoint.GOLD_BOOSTED_APY_EMAIL;
                    case 53:
                        return EntryPoint.GOLD_BOOSTED_APY_PUSH;
                    case 54:
                        return EntryPoint.RESURRECTIONS_M2_UPSELL;
                    case 55:
                        return EntryPoint.GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER;
                    case 56:
                        return EntryPoint.M3A_CHURNED_ZERO_VARIANT1;
                    case 57:
                        return EntryPoint.M3A_CHURNED_ZERO_VARIANT2;
                    case 58:
                        return EntryPoint.M3B_INACTIVE_VARIANT1;
                    case 59:
                        return EntryPoint.M3B_INACTIVE_VARIANT2;
                    case 60:
                        return EntryPoint.GOLD_OPT_IN_UPGRADE_WELCOME;
                    case 61:
                        return EntryPoint.AUC_APY_AUTO_BOOST_ALERT_SHEET;
                    case 62:
                        return EntryPoint.NUX_CHECKLIST;
                    case 63:
                        return EntryPoint.RETIREMENT_SETTINGS;
                    case 64:
                        return EntryPoint.DISABLE_MARGIN_FAILURE;
                    case 65:
                        return EntryPoint.INSTANT_DEPOSITS_CARD;
                    case 66:
                        return EntryPoint.SWEEP_ONBOARDING;
                    case 67:
                        return EntryPoint.GOLD_WELCOME_DEPOSIT_HOOK;
                    case SDK_ASSET_ICON_HOME_VALUE:
                        return EntryPoint.SWEEP_HUB;
                    case 69:
                        return EntryPoint.WATCHLIST_SWEEP_SECTION;
                    case 70:
                        return EntryPoint.GOLD_DEPOSIT_BOOST_EDUCATION;
                    case SDK_ASSET_ICON_GUIDE_VALUE:
                        return EntryPoint.PATHFINDER_RHY_DEACTIVATION;
                    case SDK_ASSET_ICON_GLOBE_VALUE:
                        return EntryPoint.PATHFINDER_RHS_DEACTIVATION;
                    case 73:
                        return EntryPoint.GOLD_HUB_TRACKER_SWEEP;
                    case 74:
                        return EntryPoint.GOLD_HUB_CARD_DEPOSIT_BOOST;
                    case 75:
                        return EntryPoint.GOLD_HUB_CARD_SWEEP_ACTIVE;
                    case 76:
                        return EntryPoint.GOLD_HUB_CARD_INSTANT;
                    case 77:
                        return EntryPoint.GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE;
                    case 78:
                        return EntryPoint.GOLD_HUB_FEATURE_DEPOSIT_BOOST;
                    case 79:
                        return EntryPoint.DEPOSIT_BOOST_HUB_DEFICIT_BANNER;
                    case 80:
                        return EntryPoint.DEPOSIT_BOOST_HUB_CTA;
                    case 81:
                        return EntryPoint.DEPOSIT_BOOST_EDUCATION_MODAL;
                    case 82:
                        return EntryPoint.PATHFINDER_ACCOUNT_CLOSURE_IRA;
                    case 83:
                        return EntryPoint.PATHFINDER_ACCOUNT_CLOSURE;
                    case 84:
                        return EntryPoint.PDT_DEPOSIT_FUNDS;
                    case 85:
                        return EntryPoint.DEBIT_CARD_LINKING_SUCCESS;
                    case 86:
                        return EntryPoint.TRANSFER_MONEY_FORM;
                    case 87:
                        return EntryPoint.IRA_TRANSFER_FORM;
                    case 88:
                        return EntryPoint.RETIREMENT_CONTRIBUTION_CARD;
                    case 89:
                        return EntryPoint.MENU_OF_OPTIONS_JOINT_ACCOUNT;
                    case 90:
                        return EntryPoint.GOLD_SWEEP_HUB;
                    case 91:
                        return EntryPoint.NOT_ENOUGH_BUYING_POWER;
                    case 92:
                        return EntryPoint.EQUITY_DAY_TRADE_REASON_PDT;
                    case 93:
                        return EntryPoint.PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE;
                    case 94:
                        return EntryPoint.MARGIN_SETTINGS;
                    case 95:
                        return EntryPoint.JOINT_ACCOUNT_FUNDING_METHODS;
                    case 96:
                        return EntryPoint.MAINTENANCE_CALL_WITH_FUTURES;
                    case 97:
                        return EntryPoint.BLACK_WIDOW;
                    case 98:
                        return EntryPoint.ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET;
                    case 99:
                        return EntryPoint.GOLD_SWEEP_SPLASH_DEPOSIT_ROW;
                    case 100:
                        return EntryPoint.CREDIT_CARD_APP;
                    case 101:
                        return EntryPoint.CREDIT_CARD_APP_BOOSTED_CASH_BACK;
                    case 102:
                        return EntryPoint.GOLD_BOOSTED_APY_TRANSFER_HUB;
                    case 103:
                        return EntryPoint.GOLD_DOWNGRADE_PREVENTION;
                    case 104:
                        return EntryPoint.CREDIT_CARD_APP_AUC_CLI;
                    case 105:
                        return EntryPoint.INCENTIVE_PRE_DEPOSIT;
                    case 106:
                        return EntryPoint.INCENTIVE_POST_DEPOSIT;
                    case 107:
                        return EntryPoint.LEGEND_EQUITY_TRADING_FLOW;
                    case 108:
                        return EntryPoint.LEGEND_OPTIONS_TRADING_FLOW;
                    case 109:
                        return EntryPoint.LEGEND_CRYPTO_TRADING_FLOW;
                    case 110:
                        return EntryPoint.LEGEND_SIDEBAR_DEPOSIT;
                    case 111:
                        return EntryPoint.LEGEND_SIDEBAR_TRANSFERS;
                    case 112:
                        return EntryPoint.LEGEND_ACCOUNT_WIDGET;
                    case 113:
                        return EntryPoint.ADVISORY_DASHBOARD_DEPOSIT_BUTTON;
                    case 114:
                        return EntryPoint.CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS;
                    case 115:
                        return EntryPoint.ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON;
                    case 116:
                        return EntryPoint.ROTH_CONVERSION;
                    case 117:
                        return EntryPoint.GOLD_WELCOME_NATIVE;
                    case 118:
                        return EntryPoint.CRYPTO_ORDER_CHECK;
                    case 119:
                        return EntryPoint.EQUITY_ORDER_CHECK;
                    case 120:
                        return EntryPoint.FUTURES_ORDER_CHECK;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                        return EntryPoint.OPTIONS_ORDER_CHECK;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                        return EntryPoint.GOLD_BOOSTED_APY_REWARD_CENTER_OFFER;
                    case 123:
                        return EntryPoint.MANAGED_ACCOUNT_ONBOARDING_FLOW;
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        return EntryPoint.ADVISORY_FUTURE_PROJECTION;
                    case 125:
                        return EntryPoint.BROKERAGE_ACCOUNT_OVERVIEW;
                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                        return EntryPoint.TRANSFER_HUB_DEPOSIT;
                    case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                        return EntryPoint.TRANSFER_HUB_WITHDRAW;
                    case 128:
                        return EntryPoint.LEGEND_FUTURES_TRADING_FLOW;
                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                        return EntryPoint.INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                        return EntryPoint.INDIVIDUAL_ACCOUNT_NUX_FLOW;
                    case 131:
                        return EntryPoint.SHORT_SELL_ENABLEMENT;
                    case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                        return EntryPoint.CUSTODIAL_ACCOUNT_ONBOARDING_FLOW;
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                        return EntryPoint.CUSTODIAL_ACCOUNT_NUX_FLOW;
                    case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                        return EntryPoint.MARGIN_ONBOARDING;
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                        return EntryPoint.STRATEGIES_AUTO_SELECT;
                    case 136:
                        return EntryPoint.ISA_CONTRIBUTION;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                        return EntryPoint.EVENT_CONTRACTS_ORDER_CHECK;
                    case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                        return EntryPoint.DIRECT_IPO_ORDER_CHECK;
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                        return EntryPoint.INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER;
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
    /* compiled from: MAXTransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_V2_DIRECTION_UNSPECIFIED", "DEPOSIT", "WITHDRAWAL", "XENT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransferV2Direction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferV2Direction[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TransferV2Direction> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TransferV2Direction DEPOSIT;
        public static final TransferV2Direction TRANSFER_V2_DIRECTION_UNSPECIFIED;
        public static final TransferV2Direction WITHDRAWAL;
        public static final TransferV2Direction XENT;
        private final int value;

        private static final /* synthetic */ TransferV2Direction[] $values() {
            return new TransferV2Direction[]{TRANSFER_V2_DIRECTION_UNSPECIFIED, DEPOSIT, WITHDRAWAL, XENT};
        }

        @JvmStatic
        public static final TransferV2Direction fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TransferV2Direction> getEntries() {
            return $ENTRIES;
        }

        private TransferV2Direction(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TransferV2Direction transferV2Direction = new TransferV2Direction("TRANSFER_V2_DIRECTION_UNSPECIFIED", 0, 0);
            TRANSFER_V2_DIRECTION_UNSPECIFIED = transferV2Direction;
            DEPOSIT = new TransferV2Direction("DEPOSIT", 1, 1);
            WITHDRAWAL = new TransferV2Direction("WITHDRAWAL", 2, 2);
            XENT = new TransferV2Direction("XENT", 3, 3);
            TransferV2Direction[] transferV2DirectionArr$values = $values();
            $VALUES = transferV2DirectionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferV2DirectionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferV2Direction.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TransferV2Direction>(orCreateKotlinClass, syntax, transferV2Direction) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferV2Direction$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public MAXTransferContext.TransferV2Direction fromValue(int value) {
                    return MAXTransferContext.TransferV2Direction.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: MAXTransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TransferV2Direction fromValue(int value) {
                if (value == 0) {
                    return TransferV2Direction.TRANSFER_V2_DIRECTION_UNSPECIFIED;
                }
                if (value == 1) {
                    return TransferV2Direction.DEPOSIT;
                }
                if (value == 2) {
                    return TransferV2Direction.WITHDRAWAL;
                }
                if (value != 3) {
                    return null;
                }
                return TransferV2Direction.XENT;
            }
        }

        public static TransferV2Direction valueOf(String str) {
            return (TransferV2Direction) Enum.valueOf(TransferV2Direction.class, str);
        }

        public static TransferV2Direction[] values() {
            return (TransferV2Direction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MAXTransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_METHOD_UNSPECIFIED", "ACH", "WIRE", "FAST", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class TransferMethod implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferMethod[] $VALUES;
        public static final TransferMethod ACH;

        @JvmField
        public static final ProtoAdapter<TransferMethod> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TransferMethod FAST;
        public static final TransferMethod TRANSFER_METHOD_UNSPECIFIED;
        public static final TransferMethod WIRE;
        private final int value;

        private static final /* synthetic */ TransferMethod[] $values() {
            return new TransferMethod[]{TRANSFER_METHOD_UNSPECIFIED, ACH, WIRE, FAST};
        }

        @JvmStatic
        public static final TransferMethod fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TransferMethod> getEntries() {
            return $ENTRIES;
        }

        private TransferMethod(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TransferMethod transferMethod = new TransferMethod("TRANSFER_METHOD_UNSPECIFIED", 0, 0);
            TRANSFER_METHOD_UNSPECIFIED = transferMethod;
            ACH = new TransferMethod("ACH", 1, 1);
            WIRE = new TransferMethod("WIRE", 2, 2);
            FAST = new TransferMethod("FAST", 3, 3);
            TransferMethod[] transferMethodArr$values = $values();
            $VALUES = transferMethodArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferMethodArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferMethod.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TransferMethod>(orCreateKotlinClass, syntax, transferMethod) { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContext$TransferMethod$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public MAXTransferContext.TransferMethod fromValue(int value) {
                    return MAXTransferContext.TransferMethod.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: MAXTransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TransferMethod fromValue(int value) {
                if (value == 0) {
                    return TransferMethod.TRANSFER_METHOD_UNSPECIFIED;
                }
                if (value == 1) {
                    return TransferMethod.ACH;
                }
                if (value == 2) {
                    return TransferMethod.WIRE;
                }
                if (value != 3) {
                    return null;
                }
                return TransferMethod.FAST;
            }
        }

        public static TransferMethod valueOf(String str) {
            return (TransferMethod) Enum.valueOf(TransferMethod.class, str);
        }

        public static TransferMethod[] values() {
            return (TransferMethod[]) $VALUES.clone();
        }
    }
}
