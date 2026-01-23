package com.robinhood.android.transfers.p271ui;

import com.robinhood.android.banking.util.RefIdFactory;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract2;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.TransferData;
import com.robinhood.android.transfers.util.ToApiAccount;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.transfers.api.TransferType;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransfersRequestCreator.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001NBë\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002J(\u0010)\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0006\u0012\u0004\u0018\u00010\u00130*2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010\u0002\u001a\u00020'H\u0002J\u0006\u00102\u001a\u000203J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\nHÂ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÂ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010HÂ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÂ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0015HÂ\u0003¢\u0006\u0002\u0010>J\u000b\u0010?\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0019HÂ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u001bHÂ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u001eHÂ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0015HÂ\u0003¢\u0006\u0002\u0010>J\u000b\u0010F\u001a\u0004\u0018\u00010\u0017HÂ\u0003Jò\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00152\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\u0017HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010$R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010$R\u0010\u0010!\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\u0004\u0018\u00010/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/TransfersRequestCreator;", "", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "amount", "Ljava/math/BigDecimal;", "adjustedFrequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "iraDistributionData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;", "achTransferOption", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "depositSuggestions", "", "refIdFactory", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/ui/max/TransferData;", "isInInstantInfoExperiment", "", "radarSessionId", "", "iraConversionData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraConversionData;", "transferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "serviceFee", "outgoingWireRoutingDetails", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "recurringDepositId", "inRecurringIncludeDepositExperiment", "outgoingWireMemo", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Ljava/math/BigDecimal;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;Lcom/robinhood/android/lib/transfers/AchTransferOption;Ljava/util/List;Lcom/robinhood/android/banking/util/RefIdFactory;Ljava/lang/Boolean;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraConversionData;Lcom/robinhood/android/transfers/contracts/TransferConfiguration;Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getTransferData", "source", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "sink", "getRefIdAndTransferData", "Lkotlin/Pair;", "Ljava/util/UUID;", "getAdditionalData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData;", "transferType", "Lcom/robinhood/transfers/api/TransferType;", "getTransferType", "()Lcom/robinhood/transfers/api/TransferType;", "toTransferRequest", "Lcom/robinhood/android/transfers/ui/TransfersRequestCreator$Result;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Ljava/math/BigDecimal;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;Lcom/robinhood/android/lib/transfers/AchTransferOption;Ljava/util/List;Lcom/robinhood/android/banking/util/RefIdFactory;Ljava/lang/Boolean;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraConversionData;Lcom/robinhood/android/transfers/contracts/TransferConfiguration;Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/robinhood/android/transfers/ui/TransfersRequestCreator;", "equals", "other", "hashCode", "", "toString", "Result", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class TransfersRequestCreator {
    public static final int $stable = 8;
    private final AchTransferOption achTransferOption;
    private final ApiCreateTransferRequest2 adjustedFrequency;
    private final BigDecimal amount;
    private final List<BigDecimal> depositSuggestions;
    private final Boolean inRecurringIncludeDepositExperiment;
    private final IraContributionQuestionnaireResult.IraContribution iraContribution;
    private final ApiCreateTransferRequest.ApiTransferAdditionalData.IraConversionData iraConversionData;
    private final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData;
    private final Boolean isInInstantInfoExperiment;
    private final String outgoingWireMemo;
    private final WireRoutingDetailsInputActivityResultContract3.Success outgoingWireRoutingDetails;
    private final String radarSessionId;
    private final String recurringDepositId;
    private final RefIdFactory<TransferData> refIdFactory;
    private final BigDecimal serviceFee;
    private final TransferAccount sinkAccount;
    private final TransferAccount sourceAccount;
    private final TransferConfiguration transferConfiguration;

    public TransfersRequestCreator() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    /* renamed from: component1, reason: from getter */
    private final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component10, reason: from getter */
    private final Boolean getIsInInstantInfoExperiment() {
        return this.isInInstantInfoExperiment;
    }

    /* renamed from: component11, reason: from getter */
    private final String getRadarSessionId() {
        return this.radarSessionId;
    }

    /* renamed from: component12, reason: from getter */
    private final ApiCreateTransferRequest.ApiTransferAdditionalData.IraConversionData getIraConversionData() {
        return this.iraConversionData;
    }

    /* renamed from: component13, reason: from getter */
    private final TransferConfiguration getTransferConfiguration() {
        return this.transferConfiguration;
    }

    /* renamed from: component14, reason: from getter */
    private final BigDecimal getServiceFee() {
        return this.serviceFee;
    }

    /* renamed from: component15, reason: from getter */
    private final WireRoutingDetailsInputActivityResultContract3.Success getOutgoingWireRoutingDetails() {
        return this.outgoingWireRoutingDetails;
    }

    /* renamed from: component16, reason: from getter */
    private final String getRecurringDepositId() {
        return this.recurringDepositId;
    }

    /* renamed from: component17, reason: from getter */
    private final Boolean getInRecurringIncludeDepositExperiment() {
        return this.inRecurringIncludeDepositExperiment;
    }

    /* renamed from: component18, reason: from getter */
    private final String getOutgoingWireMemo() {
        return this.outgoingWireMemo;
    }

    /* renamed from: component2, reason: from getter */
    private final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component3, reason: from getter */
    private final IraContributionQuestionnaireResult.IraContribution getIraContribution() {
        return this.iraContribution;
    }

    /* renamed from: component4, reason: from getter */
    private final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    private final ApiCreateTransferRequest2 getAdjustedFrequency() {
        return this.adjustedFrequency;
    }

    /* renamed from: component6, reason: from getter */
    private final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData getIraDistributionData() {
        return this.iraDistributionData;
    }

    /* renamed from: component7, reason: from getter */
    private final AchTransferOption getAchTransferOption() {
        return this.achTransferOption;
    }

    private final List<BigDecimal> component8() {
        return this.depositSuggestions;
    }

    private final RefIdFactory<TransferData> component9() {
        return this.refIdFactory;
    }

    public static /* synthetic */ TransfersRequestCreator copy$default(TransfersRequestCreator transfersRequestCreator, TransferAccount transferAccount, TransferAccount transferAccount2, IraContributionQuestionnaireResult.IraContribution iraContribution, BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, AchTransferOption achTransferOption, List list, RefIdFactory refIdFactory, Boolean bool, String str, ApiCreateTransferRequest.ApiTransferAdditionalData.IraConversionData iraConversionData, TransferConfiguration transferConfiguration, BigDecimal bigDecimal2, WireRoutingDetailsInputActivityResultContract3.Success success, String str2, Boolean bool2, String str3, int i, Object obj) {
        String str4;
        Boolean bool3;
        TransferAccount transferAccount3 = (i & 1) != 0 ? transfersRequestCreator.sourceAccount : transferAccount;
        TransferAccount transferAccount4 = (i & 2) != 0 ? transfersRequestCreator.sinkAccount : transferAccount2;
        IraContributionQuestionnaireResult.IraContribution iraContribution2 = (i & 4) != 0 ? transfersRequestCreator.iraContribution : iraContribution;
        BigDecimal bigDecimal3 = (i & 8) != 0 ? transfersRequestCreator.amount : bigDecimal;
        ApiCreateTransferRequest2 apiCreateTransferRequest22 = (i & 16) != 0 ? transfersRequestCreator.adjustedFrequency : apiCreateTransferRequest2;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData2 = (i & 32) != 0 ? transfersRequestCreator.iraDistributionData : iraDistributionData;
        AchTransferOption achTransferOption2 = (i & 64) != 0 ? transfersRequestCreator.achTransferOption : achTransferOption;
        List list2 = (i & 128) != 0 ? transfersRequestCreator.depositSuggestions : list;
        RefIdFactory refIdFactory2 = (i & 256) != 0 ? transfersRequestCreator.refIdFactory : refIdFactory;
        Boolean bool4 = (i & 512) != 0 ? transfersRequestCreator.isInInstantInfoExperiment : bool;
        String str5 = (i & 1024) != 0 ? transfersRequestCreator.radarSessionId : str;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraConversionData iraConversionData2 = (i & 2048) != 0 ? transfersRequestCreator.iraConversionData : iraConversionData;
        TransferConfiguration transferConfiguration2 = (i & 4096) != 0 ? transfersRequestCreator.transferConfiguration : transferConfiguration;
        BigDecimal bigDecimal4 = (i & 8192) != 0 ? transfersRequestCreator.serviceFee : bigDecimal2;
        TransferAccount transferAccount5 = transferAccount3;
        WireRoutingDetailsInputActivityResultContract3.Success success2 = (i & 16384) != 0 ? transfersRequestCreator.outgoingWireRoutingDetails : success;
        String str6 = (i & 32768) != 0 ? transfersRequestCreator.recurringDepositId : str2;
        Boolean bool5 = (i & 65536) != 0 ? transfersRequestCreator.inRecurringIncludeDepositExperiment : bool2;
        if ((i & 131072) != 0) {
            bool3 = bool5;
            str4 = transfersRequestCreator.outgoingWireMemo;
        } else {
            str4 = str3;
            bool3 = bool5;
        }
        return transfersRequestCreator.copy(transferAccount5, transferAccount4, iraContribution2, bigDecimal3, apiCreateTransferRequest22, iraDistributionData2, achTransferOption2, list2, refIdFactory2, bool4, str5, iraConversionData2, transferConfiguration2, bigDecimal4, success2, str6, bool3, str4);
    }

    public final TransfersRequestCreator copy(TransferAccount sourceAccount, TransferAccount sinkAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, BigDecimal amount, ApiCreateTransferRequest2 adjustedFrequency, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, AchTransferOption achTransferOption, List<? extends BigDecimal> depositSuggestions, RefIdFactory<TransferData> refIdFactory, Boolean isInInstantInfoExperiment, String radarSessionId, ApiCreateTransferRequest.ApiTransferAdditionalData.IraConversionData iraConversionData, TransferConfiguration transferConfiguration, BigDecimal serviceFee, WireRoutingDetailsInputActivityResultContract3.Success outgoingWireRoutingDetails, String recurringDepositId, Boolean inRecurringIncludeDepositExperiment, String outgoingWireMemo) {
        return new TransfersRequestCreator(sourceAccount, sinkAccount, iraContribution, amount, adjustedFrequency, iraDistributionData, achTransferOption, depositSuggestions, refIdFactory, isInInstantInfoExperiment, radarSessionId, iraConversionData, transferConfiguration, serviceFee, outgoingWireRoutingDetails, recurringDepositId, inRecurringIncludeDepositExperiment, outgoingWireMemo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransfersRequestCreator)) {
            return false;
        }
        TransfersRequestCreator transfersRequestCreator = (TransfersRequestCreator) other;
        return Intrinsics.areEqual(this.sourceAccount, transfersRequestCreator.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, transfersRequestCreator.sinkAccount) && Intrinsics.areEqual(this.iraContribution, transfersRequestCreator.iraContribution) && Intrinsics.areEqual(this.amount, transfersRequestCreator.amount) && this.adjustedFrequency == transfersRequestCreator.adjustedFrequency && Intrinsics.areEqual(this.iraDistributionData, transfersRequestCreator.iraDistributionData) && this.achTransferOption == transfersRequestCreator.achTransferOption && Intrinsics.areEqual(this.depositSuggestions, transfersRequestCreator.depositSuggestions) && Intrinsics.areEqual(this.refIdFactory, transfersRequestCreator.refIdFactory) && Intrinsics.areEqual(this.isInInstantInfoExperiment, transfersRequestCreator.isInInstantInfoExperiment) && Intrinsics.areEqual(this.radarSessionId, transfersRequestCreator.radarSessionId) && Intrinsics.areEqual(this.iraConversionData, transfersRequestCreator.iraConversionData) && Intrinsics.areEqual(this.transferConfiguration, transfersRequestCreator.transferConfiguration) && Intrinsics.areEqual(this.serviceFee, transfersRequestCreator.serviceFee) && Intrinsics.areEqual(this.outgoingWireRoutingDetails, transfersRequestCreator.outgoingWireRoutingDetails) && Intrinsics.areEqual(this.recurringDepositId, transfersRequestCreator.recurringDepositId) && Intrinsics.areEqual(this.inRecurringIncludeDepositExperiment, transfersRequestCreator.inRecurringIncludeDepositExperiment) && Intrinsics.areEqual(this.outgoingWireMemo, transfersRequestCreator.outgoingWireMemo);
    }

    public int hashCode() {
        TransferAccount transferAccount = this.sourceAccount;
        int iHashCode = (transferAccount == null ? 0 : transferAccount.hashCode()) * 31;
        TransferAccount transferAccount2 = this.sinkAccount;
        int iHashCode2 = (iHashCode + (transferAccount2 == null ? 0 : transferAccount2.hashCode())) * 31;
        IraContributionQuestionnaireResult.IraContribution iraContribution = this.iraContribution;
        int iHashCode3 = (iHashCode2 + (iraContribution == null ? 0 : iraContribution.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        ApiCreateTransferRequest2 apiCreateTransferRequest2 = this.adjustedFrequency;
        int iHashCode5 = (iHashCode4 + (apiCreateTransferRequest2 == null ? 0 : apiCreateTransferRequest2.hashCode())) * 31;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = this.iraDistributionData;
        int iHashCode6 = (iHashCode5 + (iraDistributionData == null ? 0 : iraDistributionData.hashCode())) * 31;
        AchTransferOption achTransferOption = this.achTransferOption;
        int iHashCode7 = (iHashCode6 + (achTransferOption == null ? 0 : achTransferOption.hashCode())) * 31;
        List<BigDecimal> list = this.depositSuggestions;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        RefIdFactory<TransferData> refIdFactory = this.refIdFactory;
        int iHashCode9 = (iHashCode8 + (refIdFactory == null ? 0 : refIdFactory.hashCode())) * 31;
        Boolean bool = this.isInInstantInfoExperiment;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.radarSessionId;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraConversionData iraConversionData = this.iraConversionData;
        int iHashCode12 = (iHashCode11 + (iraConversionData == null ? 0 : iraConversionData.hashCode())) * 31;
        TransferConfiguration transferConfiguration = this.transferConfiguration;
        int iHashCode13 = (iHashCode12 + (transferConfiguration == null ? 0 : transferConfiguration.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.serviceFee;
        int iHashCode14 = (iHashCode13 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        WireRoutingDetailsInputActivityResultContract3.Success success = this.outgoingWireRoutingDetails;
        int iHashCode15 = (iHashCode14 + (success == null ? 0 : success.hashCode())) * 31;
        String str2 = this.recurringDepositId;
        int iHashCode16 = (iHashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.inRecurringIncludeDepositExperiment;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.outgoingWireMemo;
        return iHashCode17 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "TransfersRequestCreator(sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", iraContribution=" + this.iraContribution + ", amount=" + this.amount + ", adjustedFrequency=" + this.adjustedFrequency + ", iraDistributionData=" + this.iraDistributionData + ", achTransferOption=" + this.achTransferOption + ", depositSuggestions=" + this.depositSuggestions + ", refIdFactory=" + this.refIdFactory + ", isInInstantInfoExperiment=" + this.isInInstantInfoExperiment + ", radarSessionId=" + this.radarSessionId + ", iraConversionData=" + this.iraConversionData + ", transferConfiguration=" + this.transferConfiguration + ", serviceFee=" + this.serviceFee + ", outgoingWireRoutingDetails=" + this.outgoingWireRoutingDetails + ", recurringDepositId=" + this.recurringDepositId + ", inRecurringIncludeDepositExperiment=" + this.inRecurringIncludeDepositExperiment + ", outgoingWireMemo=" + this.outgoingWireMemo + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransfersRequestCreator(TransferAccount transferAccount, TransferAccount transferAccount2, IraContributionQuestionnaireResult.IraContribution iraContribution, BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, AchTransferOption achTransferOption, List<? extends BigDecimal> list, RefIdFactory<TransferData> refIdFactory, Boolean bool, String str, ApiCreateTransferRequest.ApiTransferAdditionalData.IraConversionData iraConversionData, TransferConfiguration transferConfiguration, BigDecimal bigDecimal2, WireRoutingDetailsInputActivityResultContract3.Success success, String str2, Boolean bool2, String str3) {
        this.sourceAccount = transferAccount;
        this.sinkAccount = transferAccount2;
        this.iraContribution = iraContribution;
        this.amount = bigDecimal;
        this.adjustedFrequency = apiCreateTransferRequest2;
        this.iraDistributionData = iraDistributionData;
        this.achTransferOption = achTransferOption;
        this.depositSuggestions = list;
        this.refIdFactory = refIdFactory;
        this.isInInstantInfoExperiment = bool;
        this.radarSessionId = str;
        this.iraConversionData = iraConversionData;
        this.transferConfiguration = transferConfiguration;
        this.serviceFee = bigDecimal2;
        this.outgoingWireRoutingDetails = success;
        this.recurringDepositId = str2;
        this.inRecurringIncludeDepositExperiment = bool2;
        this.outgoingWireMemo = str3;
    }

    public /* synthetic */ TransfersRequestCreator(TransferAccount transferAccount, TransferAccount transferAccount2, IraContributionQuestionnaireResult.IraContribution iraContribution, BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, AchTransferOption achTransferOption, List list, RefIdFactory refIdFactory, Boolean bool, String str, ApiCreateTransferRequest.ApiTransferAdditionalData.IraConversionData iraConversionData, TransferConfiguration transferConfiguration, BigDecimal bigDecimal2, WireRoutingDetailsInputActivityResultContract3.Success success, String str2, Boolean bool2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transferAccount, (i & 2) != 0 ? null : transferAccount2, (i & 4) != 0 ? null : iraContribution, (i & 8) != 0 ? null : bigDecimal, (i & 16) != 0 ? null : apiCreateTransferRequest2, (i & 32) != 0 ? null : iraDistributionData, (i & 64) != 0 ? null : achTransferOption, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : refIdFactory, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? null : iraConversionData, (i & 4096) != 0 ? null : transferConfiguration, (i & 8192) != 0 ? null : bigDecimal2, (i & 16384) != 0 ? null : success, (i & 32768) != 0 ? null : str2, (i & 65536) != 0 ? null : bool2, (i & 131072) != 0 ? null : str3);
    }

    private final TransferData getTransferData(ApiCreateTransferRequest.ApiTransferAccount source, ApiCreateTransferRequest.ApiTransferAccount sink) {
        IraContributionQuestionnaireResult.IraContribution iraContribution = this.iraContribution;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData = iraContribution != null ? iraContribution.toIraContributionData() : null;
        if (this.amount == null) {
            throw new IllegalStateException("Amount was null");
        }
        if (this.adjustedFrequency == null) {
            throw new IllegalStateException("Adjusted frequency was null");
        }
        return new TransferData(this.amount, this.adjustedFrequency, source, sink, iraContributionData, this.iraDistributionData, this.achTransferOption, this.depositSuggestions);
    }

    private final Tuples2<UUID, TransferData> getRefIdAndTransferData(ApiCreateTransferRequest.ApiTransferAccount source, ApiCreateTransferRequest.ApiTransferAccount sink) {
        TransferData transferData = getTransferData(source, sink);
        RefIdFactory<TransferData> refIdFactory = this.refIdFactory;
        return Tuples4.m3642to(refIdFactory != null ? refIdFactory.generateRefId(transferData) : null, transferData);
    }

    private final ApiCreateTransferRequest.ApiTransferAdditionalData getAdditionalData(ApiCreateTransferRequest.ApiTransferAccount sourceAccount) {
        ApiCreateTransferRequest.ApiTransferAdditionalData.ApiOutgoingWireData apiOutgoingWireData;
        ApiCreateTransferRequest.ApiTransferAdditionalData.ApiOutgoingWireData apiOutgoingWireData2 = null;
        if (this.transferConfiguration == null) {
            return null;
        }
        String str = sourceAccount.getType() == ApiTransferAccount.TransferAccountType.DEBIT_CARD ? this.radarSessionId : null;
        IraContributionQuestionnaireResult.IraContribution iraContribution = this.iraContribution;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData = iraContribution != null ? iraContribution.toIraContributionData() : null;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = this.iraDistributionData;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraConversionData iraConversionData = this.iraConversionData;
        MAXTransferContext.EntryPoint entryPoint = this.transferConfiguration.getEntryPoint();
        String str2 = this.recurringDepositId;
        Boolean boolValueOf = Boolean.valueOf(this.achTransferOption == AchTransferOption.INSTANT);
        boolean zBooleanValue = false;
        Boolean bool = Boolean.FALSE;
        TransferConfiguration transferConfiguration = this.transferConfiguration;
        if (!(transferConfiguration instanceof TransferConfiguration.OutgoingWire)) {
            apiOutgoingWireData = apiOutgoingWireData2;
        } else if (((TransferConfiguration.OutgoingWire) transferConfiguration).getThirdPartyWiresInfo() != null || ((TransferConfiguration.OutgoingWire) this.transferConfiguration).getInitialRecipientType() != null) {
            apiOutgoingWireData = new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiOutgoingWireData(null, null, this.outgoingWireMemo, ((TransferConfiguration.OutgoingWire) this.transferConfiguration).getInitialRecipientType(), 3, null);
        } else {
            WireRoutingDetailsInputActivityResultContract3.Success success = this.outgoingWireRoutingDetails;
            if (success != null) {
                apiOutgoingWireData2 = WireRoutingDetailsInputActivityResultContract2.toApiOutgoingWireData(success, this.outgoingWireMemo, ((TransferConfiguration.OutgoingWire) this.transferConfiguration).getInitialRecipientType());
            }
            apiOutgoingWireData = apiOutgoingWireData2;
        }
        ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData apiIncentivesTransferData = new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData(this.transferConfiguration.getPromotionName(), this.transferConfiguration.getPromotionType());
        Boolean bool2 = this.inRecurringIncludeDepositExperiment;
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        return new ApiCreateTransferRequest.ApiTransferAdditionalData(str, iraContributionData, iraDistributionData, iraConversionData, entryPoint, str2, boolValueOf, bool, null, apiOutgoingWireData, null, apiIncentivesTransferData, "v1", zBooleanValue, null, null, 50432, null);
    }

    private final TransferType getTransferType() {
        if (this.transferConfiguration instanceof TransferConfiguration.OutgoingWire) {
            return TransferType.OUTGOING_WIRE;
        }
        return null;
    }

    public final Result toTransferRequest() {
        TransferAccount transferAccount = this.sourceAccount;
        ApiCreateTransferRequest.ApiTransferAccount apiAccount = transferAccount != null ? ToApiAccount.toApiAccount(transferAccount) : null;
        TransferAccount transferAccount2 = this.sinkAccount;
        ApiCreateTransferRequest.ApiTransferAccount apiAccount2 = transferAccount2 != null ? ToApiAccount.toApiAccount(transferAccount2) : null;
        if (this.amount == null) {
            throw new IllegalStateException("Amount was null");
        }
        if (apiAccount == null) {
            throw new IllegalStateException("Request source account null");
        }
        if (apiAccount2 == null) {
            throw new IllegalStateException("Request Sink account null");
        }
        Tuples2<UUID, TransferData> refIdAndTransferData = getRefIdAndTransferData(apiAccount, apiAccount2);
        UUID uuidComponent1 = refIdAndTransferData.component1();
        TransferData transferDataComponent2 = refIdAndTransferData.component2();
        if (uuidComponent1 == null) {
            throw new IllegalStateException("Ref ID was null");
        }
        ApiCreateTransferRequest.ApiTransferAdditionalData additionalData = getAdditionalData(apiAccount);
        if (this.adjustedFrequency == null) {
            throw new IllegalStateException("Adjusted frequency null");
        }
        if (this.isInInstantInfoExperiment == null) {
            throw new IllegalStateException("Is in instant info experiment null");
        }
        if (additionalData == null) {
            throw new IllegalStateException("Additional data is null");
        }
        if (this.transferConfiguration == null) {
            throw new IllegalStateException("Transfer Configuration is null");
        }
        if (transferDataComponent2 == null) {
            throw new IllegalStateException("Transfer data is null");
        }
        return new Result(uuidComponent1, new ApiCreateTransferRequest(uuidComponent1, this.amount, apiAccount, apiAccount2, this.adjustedFrequency, this.isInInstantInfoExperiment, additionalData, this.transferConfiguration.getPostTransferPageConfig(), this.serviceFee, null, getTransferType(), false, null, 6656, null), transferDataComponent2);
    }

    /* compiled from: TransfersRequestCreator.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/TransfersRequestCreator$Result;", "", "refId", "Ljava/util/UUID;", "apiCreateTransferRequest", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "transferData", "Lcom/robinhood/android/transfers/ui/max/TransferData;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;Lcom/robinhood/android/transfers/ui/max/TransferData;)V", "getRefId", "()Ljava/util/UUID;", "getApiCreateTransferRequest", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "getTransferData", "()Lcom/robinhood/android/transfers/ui/max/TransferData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Result {
        public static final int $stable = 8;
        private final ApiCreateTransferRequest apiCreateTransferRequest;
        private final UUID refId;
        private final TransferData transferData;

        public static /* synthetic */ Result copy$default(Result result, UUID uuid, ApiCreateTransferRequest apiCreateTransferRequest, TransferData transferData, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = result.refId;
            }
            if ((i & 2) != 0) {
                apiCreateTransferRequest = result.apiCreateTransferRequest;
            }
            if ((i & 4) != 0) {
                transferData = result.transferData;
            }
            return result.copy(uuid, apiCreateTransferRequest, transferData);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCreateTransferRequest getApiCreateTransferRequest() {
            return this.apiCreateTransferRequest;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferData getTransferData() {
            return this.transferData;
        }

        public final Result copy(UUID refId, ApiCreateTransferRequest apiCreateTransferRequest, TransferData transferData) {
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(apiCreateTransferRequest, "apiCreateTransferRequest");
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            return new Result(refId, apiCreateTransferRequest, transferData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.refId, result.refId) && Intrinsics.areEqual(this.apiCreateTransferRequest, result.apiCreateTransferRequest) && Intrinsics.areEqual(this.transferData, result.transferData);
        }

        public int hashCode() {
            return (((this.refId.hashCode() * 31) + this.apiCreateTransferRequest.hashCode()) * 31) + this.transferData.hashCode();
        }

        public String toString() {
            return "Result(refId=" + this.refId + ", apiCreateTransferRequest=" + this.apiCreateTransferRequest + ", transferData=" + this.transferData + ")";
        }

        public Result(UUID refId, ApiCreateTransferRequest apiCreateTransferRequest, TransferData transferData) {
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(apiCreateTransferRequest, "apiCreateTransferRequest");
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            this.refId = refId;
            this.apiCreateTransferRequest = apiCreateTransferRequest;
            this.transferData = transferData;
        }

        public final UUID getRefId() {
            return this.refId;
        }

        public final ApiCreateTransferRequest getApiCreateTransferRequest() {
            return this.apiCreateTransferRequest;
        }

        public final TransferData getTransferData() {
            return this.transferData;
        }
    }
}
