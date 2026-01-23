package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.models.transfer.shared.ThirdPartyOutgoingWiresInfo;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.WiresContext;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferConfiguration.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0012=>?@ABCDEFGHIJKLMNB³\u0001\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0014\u0010\u0016\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0014\u0010\u0017\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0014\u0010\u0018\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u0004\u0018\u000108X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b<\u0010\"\u0082\u0001\u0010OPQRSTUVWXYZ[\\]^¨\u0006_"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "showFrequencyBottomSheetOnLaunch", "", "from", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "to", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "minDepositAmount", "", "minDepositRate", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "promotionName", "promotionType", "hideFrequency", "useQueuedDepositMode", "skipPostTransferAction", "transferOverlayTheme", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferOverlayTheme;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/bonfire/TransferFrequency;ZLcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/robinhood/models/api/bonfire/IraContributionType;Ljava/lang/String;Ljava/lang/String;ZZZLcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferOverlayTheme;)V", "getAmount", "()Ljava/math/BigDecimal;", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getShowFrequencyBottomSheetOnLaunch", "()Z", "getFrom", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "getTo", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "()Ljava/lang/String;", "getMinDepositAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinDepositRate", "getIraContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "getPromotionName", "getPromotionType", "getHideFrequency", "getUseQueuedDepositMode", "getSkipPostTransferAction", "getTransferOverlayTheme", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferOverlayTheme;", "postTransferPageConfig", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiPostTransferPageConfig;", "getPostTransferPageConfig", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiPostTransferPageConfig;", "showConfirmationScreen", "getShowConfirmationScreen", "Standard", "MarginDeposit", "DayTradeCall", "MarginCallPrevention", "MarginResolution", "RadHook", "RadHookWithFrequency", "RecurringInsufficientBuyingPower", "PostDebitCardLinking", "Recommendations", "IraContribution", "RothConversion", "OutgoingWire", "PdtPrevention", "UpdateRecurringDeposit", "GoldApyBoostMinDeposit", "TransferAccountSelection", "TransferOverlayTheme", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$DayTradeCall;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$GoldApyBoostMinDeposit;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$IraContribution;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$MarginCallPrevention;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$MarginDeposit;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$MarginResolution;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$OutgoingWire;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$PdtPrevention;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$PostDebitCardLinking;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$RadHook;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$RadHookWithFrequency;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$Recommendations;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$RecurringInsufficientBuyingPower;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$RothConversion;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$Standard;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$UpdateRecurringDeposit;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class TransferConfiguration implements Parcelable {
    private final BigDecimal amount;
    private final MAXTransferContext.EntryPoint entryPoint;
    private final String entryPointLoggingIdentifier;
    private final ApiCreateTransferRequest2 frequency;
    private final TransferAccountSelection from;
    private final boolean hideFrequency;
    private final IraContributionType iraContributionType;
    private final Double minDepositAmount;
    private final Double minDepositRate;
    private final ApiCreateTransferRequest.ApiPostTransferPageConfig postTransferPageConfig;
    private final String promotionName;
    private final String promotionType;
    private final boolean showFrequencyBottomSheetOnLaunch;
    private final boolean skipPostTransferAction;
    private final TransferAccountSelection to;
    private final TransferOverlayTheme transferOverlayTheme;
    private final boolean useQueuedDepositMode;

    public /* synthetic */ TransferConfiguration(BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, boolean z, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, MAXTransferContext.EntryPoint entryPoint, String str, Double d, Double d2, IraContributionType iraContributionType, String str2, String str3, boolean z2, boolean z3, boolean z4, TransferOverlayTheme transferOverlayTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, apiCreateTransferRequest2, z, transferAccountSelection, transferAccountSelection2, entryPoint, str, d, d2, iraContributionType, str2, str3, z2, z3, z4, transferOverlayTheme);
    }

    private TransferConfiguration(BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, boolean z, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, MAXTransferContext.EntryPoint entryPoint, String str, Double d, Double d2, IraContributionType iraContributionType, String str2, String str3, boolean z2, boolean z3, boolean z4, TransferOverlayTheme transferOverlayTheme) {
        this.amount = bigDecimal;
        this.frequency = apiCreateTransferRequest2;
        this.showFrequencyBottomSheetOnLaunch = z;
        this.from = transferAccountSelection;
        this.to = transferAccountSelection2;
        this.entryPoint = entryPoint;
        this.entryPointLoggingIdentifier = str;
        this.minDepositAmount = d;
        this.minDepositRate = d2;
        this.iraContributionType = iraContributionType;
        this.promotionName = str2;
        this.promotionType = str3;
        this.hideFrequency = z2;
        this.useQueuedDepositMode = z3;
        this.skipPostTransferAction = z4;
        this.transferOverlayTheme = transferOverlayTheme;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public boolean getShowFrequencyBottomSheetOnLaunch() {
        return this.showFrequencyBottomSheetOnLaunch;
    }

    public TransferAccountSelection getFrom() {
        return this.from;
    }

    public TransferAccountSelection getTo() {
        return this.to;
    }

    public /* synthetic */ TransferConfiguration(BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, boolean z, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, MAXTransferContext.EntryPoint entryPoint, String str, Double d, Double d2, IraContributionType iraContributionType, String str2, String str3, boolean z2, boolean z3, boolean z4, TransferOverlayTheme transferOverlayTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, apiCreateTransferRequest2, z, transferAccountSelection, transferAccountSelection2, (i & 32) != 0 ? MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : d2, (i & 512) != 0 ? null : iraContributionType, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? false : z3, (i & 16384) != 0 ? false : z4, (i & 32768) != 0 ? TransferOverlayTheme.ACHROMATIC : transferOverlayTheme, null);
    }

    public MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public String getEntryPointLoggingIdentifier() {
        return this.entryPointLoggingIdentifier;
    }

    public Double getMinDepositAmount() {
        return this.minDepositAmount;
    }

    public Double getMinDepositRate() {
        return this.minDepositRate;
    }

    public IraContributionType getIraContributionType() {
        return this.iraContributionType;
    }

    public String getPromotionName() {
        return this.promotionName;
    }

    public String getPromotionType() {
        return this.promotionType;
    }

    public boolean getHideFrequency() {
        return this.hideFrequency;
    }

    public boolean getUseQueuedDepositMode() {
        return this.useQueuedDepositMode;
    }

    public boolean getSkipPostTransferAction() {
        return this.skipPostTransferAction;
    }

    public TransferOverlayTheme getTransferOverlayTheme() {
        return this.transferOverlayTheme;
    }

    public ApiCreateTransferRequest.ApiPostTransferPageConfig getPostTransferPageConfig() {
        return this.postTransferPageConfig;
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\u009b\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0007HÆ\u0001J\u0006\u0010:\u001a\u00020;J\u0013\u0010<\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020;HÖ\u0001J\t\u0010@\u001a\u00020\u0010HÖ\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020;R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0014\u0010\u0012\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0014\u0010\u0015\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001d¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$Standard;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "amount", "Ljava/math/BigDecimal;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "showFrequencyBottomSheetOnLaunch", "", "from", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "to", "postTransferPageConfig", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiPostTransferPageConfig;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "useQueuedDepositMode", "skipPostTransferAction", "promotionName", "promotionType", "hideFrequency", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/bonfire/TransferFrequency;ZLcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiPostTransferPageConfig;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Z)V", "getAmount", "()Ljava/math/BigDecimal;", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getShowFrequencyBottomSheetOnLaunch", "()Z", "getFrom", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "getTo", "getPostTransferPageConfig", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiPostTransferPageConfig;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "()Ljava/lang/String;", "getUseQueuedDepositMode", "getSkipPostTransferAction", "getPromotionName", "getPromotionType", "getHideFrequency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Standard extends TransferConfiguration {
        public static final Parcelable.Creator<Standard> CREATOR = new Creator();
        private final BigDecimal amount;
        private final MAXTransferContext.EntryPoint entryPoint;
        private final String entryPointLoggingIdentifier;
        private final ApiCreateTransferRequest2 frequency;
        private final TransferAccountSelection from;
        private final boolean hideFrequency;
        private final ApiCreateTransferRequest.ApiPostTransferPageConfig postTransferPageConfig;
        private final String promotionName;
        private final String promotionType;
        private final boolean showFrequencyBottomSheetOnLaunch;
        private final boolean skipPostTransferAction;
        private final TransferAccountSelection to;
        private final boolean useQueuedDepositMode;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Standard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Standard createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                ApiCreateTransferRequest2 apiCreateTransferRequest2ValueOf = parcel.readInt() == 0 ? null : ApiCreateTransferRequest2.valueOf(parcel.readString());
                boolean z3 = parcel.readInt() != 0;
                TransferAccountSelection transferAccountSelectionCreateFromParcel = parcel.readInt() == 0 ? null : TransferAccountSelection.CREATOR.createFromParcel(parcel);
                TransferAccountSelection transferAccountSelectionCreateFromParcel2 = parcel.readInt() != 0 ? TransferAccountSelection.CREATOR.createFromParcel(parcel) : null;
                ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig = (ApiCreateTransferRequest.ApiPostTransferPageConfig) parcel.readParcelable(Standard.class.getClassLoader());
                MAXTransferContext.EntryPoint entryPointValueOf = MAXTransferContext.EntryPoint.valueOf(parcel.readString());
                boolean z4 = false;
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = z;
                    z = true;
                } else {
                    z2 = z;
                }
                String string3 = parcel.readString();
                boolean z5 = z2;
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z5 = true;
                }
                return new Standard(bigDecimal, apiCreateTransferRequest2ValueOf, z3, transferAccountSelectionCreateFromParcel, transferAccountSelectionCreateFromParcel2, apiPostTransferPageConfig, entryPointValueOf, string2, z4, z, string3, string4, z5);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Standard[] newArray(int i) {
                return new Standard[i];
            }
        }

        public Standard() {
            this(null, null, false, null, null, null, null, null, false, false, null, null, false, 8191, null);
        }

        public static /* synthetic */ Standard copy$default(Standard standard, BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, boolean z, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig, MAXTransferContext.EntryPoint entryPoint, String str, boolean z2, boolean z3, String str2, String str3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = standard.amount;
            }
            return standard.copy(bigDecimal, (i & 2) != 0 ? standard.frequency : apiCreateTransferRequest2, (i & 4) != 0 ? standard.showFrequencyBottomSheetOnLaunch : z, (i & 8) != 0 ? standard.from : transferAccountSelection, (i & 16) != 0 ? standard.to : transferAccountSelection2, (i & 32) != 0 ? standard.postTransferPageConfig : apiPostTransferPageConfig, (i & 64) != 0 ? standard.entryPoint : entryPoint, (i & 128) != 0 ? standard.entryPointLoggingIdentifier : str, (i & 256) != 0 ? standard.useQueuedDepositMode : z2, (i & 512) != 0 ? standard.skipPostTransferAction : z3, (i & 1024) != 0 ? standard.promotionName : str2, (i & 2048) != 0 ? standard.promotionType : str3, (i & 4096) != 0 ? standard.hideFrequency : z4);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getSkipPostTransferAction() {
            return this.skipPostTransferAction;
        }

        /* renamed from: component11, reason: from getter */
        public final String getPromotionName() {
            return this.promotionName;
        }

        /* renamed from: component12, reason: from getter */
        public final String getPromotionType() {
            return this.promotionType;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getHideFrequency() {
            return this.hideFrequency;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCreateTransferRequest2 getFrequency() {
            return this.frequency;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowFrequencyBottomSheetOnLaunch() {
            return this.showFrequencyBottomSheetOnLaunch;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferAccountSelection getFrom() {
            return this.from;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferAccountSelection getTo() {
            return this.to;
        }

        /* renamed from: component6, reason: from getter */
        public final ApiCreateTransferRequest.ApiPostTransferPageConfig getPostTransferPageConfig() {
            return this.postTransferPageConfig;
        }

        /* renamed from: component7, reason: from getter */
        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component8, reason: from getter */
        public final String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getUseQueuedDepositMode() {
            return this.useQueuedDepositMode;
        }

        public final Standard copy(BigDecimal amount, ApiCreateTransferRequest2 frequency, boolean showFrequencyBottomSheetOnLaunch, TransferAccountSelection from, TransferAccountSelection to, ApiCreateTransferRequest.ApiPostTransferPageConfig postTransferPageConfig, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, boolean useQueuedDepositMode, boolean skipPostTransferAction, String promotionName, String promotionType, boolean hideFrequency) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new Standard(amount, frequency, showFrequencyBottomSheetOnLaunch, from, to, postTransferPageConfig, entryPoint, entryPointLoggingIdentifier, useQueuedDepositMode, skipPostTransferAction, promotionName, promotionType, hideFrequency);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Standard)) {
                return false;
            }
            Standard standard = (Standard) other;
            return Intrinsics.areEqual(this.amount, standard.amount) && this.frequency == standard.frequency && this.showFrequencyBottomSheetOnLaunch == standard.showFrequencyBottomSheetOnLaunch && Intrinsics.areEqual(this.from, standard.from) && Intrinsics.areEqual(this.to, standard.to) && Intrinsics.areEqual(this.postTransferPageConfig, standard.postTransferPageConfig) && this.entryPoint == standard.entryPoint && Intrinsics.areEqual(this.entryPointLoggingIdentifier, standard.entryPointLoggingIdentifier) && this.useQueuedDepositMode == standard.useQueuedDepositMode && this.skipPostTransferAction == standard.skipPostTransferAction && Intrinsics.areEqual(this.promotionName, standard.promotionName) && Intrinsics.areEqual(this.promotionType, standard.promotionType) && this.hideFrequency == standard.hideFrequency;
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.amount;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = this.frequency;
            int iHashCode2 = (((iHashCode + (apiCreateTransferRequest2 == null ? 0 : apiCreateTransferRequest2.hashCode())) * 31) + Boolean.hashCode(this.showFrequencyBottomSheetOnLaunch)) * 31;
            TransferAccountSelection transferAccountSelection = this.from;
            int iHashCode3 = (iHashCode2 + (transferAccountSelection == null ? 0 : transferAccountSelection.hashCode())) * 31;
            TransferAccountSelection transferAccountSelection2 = this.to;
            int iHashCode4 = (iHashCode3 + (transferAccountSelection2 == null ? 0 : transferAccountSelection2.hashCode())) * 31;
            ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig = this.postTransferPageConfig;
            int iHashCode5 = (((iHashCode4 + (apiPostTransferPageConfig == null ? 0 : apiPostTransferPageConfig.hashCode())) * 31) + this.entryPoint.hashCode()) * 31;
            String str = this.entryPointLoggingIdentifier;
            int iHashCode6 = (((((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.useQueuedDepositMode)) * 31) + Boolean.hashCode(this.skipPostTransferAction)) * 31;
            String str2 = this.promotionName;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.promotionType;
            return ((iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.hideFrequency);
        }

        public String toString() {
            return "Standard(amount=" + this.amount + ", frequency=" + this.frequency + ", showFrequencyBottomSheetOnLaunch=" + this.showFrequencyBottomSheetOnLaunch + ", from=" + this.from + ", to=" + this.to + ", postTransferPageConfig=" + this.postTransferPageConfig + ", entryPoint=" + this.entryPoint + ", entryPointLoggingIdentifier=" + this.entryPointLoggingIdentifier + ", useQueuedDepositMode=" + this.useQueuedDepositMode + ", skipPostTransferAction=" + this.skipPostTransferAction + ", promotionName=" + this.promotionName + ", promotionType=" + this.promotionType + ", hideFrequency=" + this.hideFrequency + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.amount);
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = this.frequency;
            if (apiCreateTransferRequest2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(apiCreateTransferRequest2.name());
            }
            dest.writeInt(this.showFrequencyBottomSheetOnLaunch ? 1 : 0);
            TransferAccountSelection transferAccountSelection = this.from;
            if (transferAccountSelection == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection.writeToParcel(dest, flags);
            }
            TransferAccountSelection transferAccountSelection2 = this.to;
            if (transferAccountSelection2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection2.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.postTransferPageConfig, flags);
            dest.writeString(this.entryPoint.name());
            dest.writeString(this.entryPointLoggingIdentifier);
            dest.writeInt(this.useQueuedDepositMode ? 1 : 0);
            dest.writeInt(this.skipPostTransferAction ? 1 : 0);
            dest.writeString(this.promotionName);
            dest.writeString(this.promotionType);
            dest.writeInt(this.hideFrequency ? 1 : 0);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public BigDecimal getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public ApiCreateTransferRequest2 getFrequency() {
            return this.frequency;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public boolean getShowFrequencyBottomSheetOnLaunch() {
            return this.showFrequencyBottomSheetOnLaunch;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getFrom() {
            return this.from;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getTo() {
            return this.to;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public ApiCreateTransferRequest.ApiPostTransferPageConfig getPostTransferPageConfig() {
            return this.postTransferPageConfig;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Standard(BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, boolean z, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig, MAXTransferContext.EntryPoint entryPoint, String str, boolean z2, boolean z3, String str2, String str3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String lowerCase;
            BigDecimal bigDecimal2 = (i & 1) != 0 ? null : bigDecimal;
            ApiCreateTransferRequest2 apiCreateTransferRequest22 = (i & 2) != 0 ? null : apiCreateTransferRequest2;
            boolean z5 = (i & 4) != 0 ? false : z;
            TransferAccountSelection transferAccountSelection3 = (i & 8) != 0 ? null : transferAccountSelection;
            TransferAccountSelection transferAccountSelection4 = (i & 16) != 0 ? null : transferAccountSelection2;
            ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig2 = (i & 32) != 0 ? null : apiPostTransferPageConfig;
            MAXTransferContext.EntryPoint entryPoint2 = (i & 64) != 0 ? MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint;
            if ((i & 128) != 0) {
                lowerCase = entryPoint2.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = str;
            }
            this(bigDecimal2, apiCreateTransferRequest22, z5, transferAccountSelection3, transferAccountSelection4, apiPostTransferPageConfig2, entryPoint2, lowerCase, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? null : str2, (i & 2048) == 0 ? str3 : null, (i & 4096) != 0 ? false : z4);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public boolean getUseQueuedDepositMode() {
            return this.useQueuedDepositMode;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public boolean getSkipPostTransferAction() {
            return this.skipPostTransferAction;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public String getPromotionName() {
            return this.promotionName;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public String getPromotionType() {
            return this.promotionType;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public boolean getHideFrequency() {
            return this.hideFrequency;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Standard(BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, boolean z, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig, MAXTransferContext.EntryPoint entryPoint, String str, boolean z2, boolean z3, String str2, String str3, boolean z4) {
            super(bigDecimal, apiCreateTransferRequest2, z, transferAccountSelection, transferAccountSelection2, entryPoint, str, null, null, null, null, null, false, z2, z3, null, 40832, null);
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.amount = bigDecimal;
            this.frequency = apiCreateTransferRequest2;
            this.showFrequencyBottomSheetOnLaunch = z;
            this.from = transferAccountSelection;
            this.to = transferAccountSelection2;
            this.postTransferPageConfig = apiPostTransferPageConfig;
            this.entryPoint = entryPoint;
            this.entryPointLoggingIdentifier = str;
            this.useQueuedDepositMode = z2;
            this.skipPostTransferAction = z3;
            this.promotionName = str2;
            this.promotionType = str3;
            this.hideFrequency = z4;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$MarginDeposit;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "recommendedAmount", "Ljava/math/BigDecimal;", "minAmount", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getMinAmount", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarginDeposit extends TransferConfiguration {
        public static final Parcelable.Creator<MarginDeposit> CREATOR = new Creator();
        private final MAXTransferContext.EntryPoint entryPoint;
        private final String entryPointLoggingIdentifier;
        private final BigDecimal minAmount;
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarginDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginDeposit((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), MAXTransferContext.EntryPoint.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginDeposit[] newArray(int i) {
                return new MarginDeposit[i];
            }
        }

        public static /* synthetic */ MarginDeposit copy$default(MarginDeposit marginDeposit, BigDecimal bigDecimal, BigDecimal bigDecimal2, MAXTransferContext.EntryPoint entryPoint, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = marginDeposit.recommendedAmount;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = marginDeposit.minAmount;
            }
            if ((i & 4) != 0) {
                entryPoint = marginDeposit.entryPoint;
            }
            if ((i & 8) != 0) {
                str = marginDeposit.entryPointLoggingIdentifier;
            }
            return marginDeposit.copy(bigDecimal, bigDecimal2, entryPoint, str);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getMinAmount() {
            return this.minAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        public final MarginDeposit copy(BigDecimal recommendedAmount, BigDecimal minAmount, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            Intrinsics.checkNotNullParameter(minAmount, "minAmount");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new MarginDeposit(recommendedAmount, minAmount, entryPoint, entryPointLoggingIdentifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginDeposit)) {
                return false;
            }
            MarginDeposit marginDeposit = (MarginDeposit) other;
            return Intrinsics.areEqual(this.recommendedAmount, marginDeposit.recommendedAmount) && Intrinsics.areEqual(this.minAmount, marginDeposit.minAmount) && this.entryPoint == marginDeposit.entryPoint && Intrinsics.areEqual(this.entryPointLoggingIdentifier, marginDeposit.entryPointLoggingIdentifier);
        }

        public int hashCode() {
            int iHashCode = ((((this.recommendedAmount.hashCode() * 31) + this.minAmount.hashCode()) * 31) + this.entryPoint.hashCode()) * 31;
            String str = this.entryPointLoggingIdentifier;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MarginDeposit(recommendedAmount=" + this.recommendedAmount + ", minAmount=" + this.minAmount + ", entryPoint=" + this.entryPoint + ", entryPointLoggingIdentifier=" + this.entryPointLoggingIdentifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
            dest.writeSerializable(this.minAmount);
            dest.writeString(this.entryPoint.name());
            dest.writeString(this.entryPointLoggingIdentifier);
        }

        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public final BigDecimal getMinAmount() {
            return this.minAmount;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ MarginDeposit(BigDecimal bigDecimal, BigDecimal bigDecimal2, MAXTransferContext.EntryPoint entryPoint, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 8) != 0) {
                str = entryPoint.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            this(bigDecimal, bigDecimal2, entryPoint, str);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public MarginDeposit(BigDecimal recommendedAmount, BigDecimal minAmount, MAXTransferContext.EntryPoint entryPoint, String str) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            Intrinsics.checkNotNullParameter(minAmount, "minAmount");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            boolean z = false;
            Double d = null;
            IraContributionType iraContributionType = null;
            String str2 = null;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            TransferOverlayTheme transferOverlayTheme = null;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            super(recommendedAmount, ApiCreateTransferRequest2.ONCE, z, new TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferAccountSelection(objArr2, true, ApiTransferAccount.TransferAccountType.RHS, 1, objArr), entryPoint, str, objArr4, d, iraContributionType, str2, objArr3, z2, z3, z4, transferOverlayTheme, 65408, null);
            this.recommendedAmount = recommendedAmount;
            this.minAmount = minAmount;
            this.entryPoint = entryPoint;
            this.entryPointLoggingIdentifier = str;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$DayTradeCall;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "recommendedAmount", "Ljava/math/BigDecimal;", "showConfirmation", "", "<init>", "(Ljava/math/BigDecimal;Z)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getShowConfirmation", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DayTradeCall extends TransferConfiguration {
        public static final Parcelable.Creator<DayTradeCall> CREATOR = new Creator();
        private final BigDecimal recommendedAmount;
        private final boolean showConfirmation;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DayTradeCall> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DayTradeCall createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DayTradeCall((BigDecimal) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DayTradeCall[] newArray(int i) {
                return new DayTradeCall[i];
            }
        }

        public static /* synthetic */ DayTradeCall copy$default(DayTradeCall dayTradeCall, BigDecimal bigDecimal, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = dayTradeCall.recommendedAmount;
            }
            if ((i & 2) != 0) {
                z = dayTradeCall.showConfirmation;
            }
            return dayTradeCall.copy(bigDecimal, z);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowConfirmation() {
            return this.showConfirmation;
        }

        public final DayTradeCall copy(BigDecimal recommendedAmount, boolean showConfirmation) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            return new DayTradeCall(recommendedAmount, showConfirmation);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DayTradeCall)) {
                return false;
            }
            DayTradeCall dayTradeCall = (DayTradeCall) other;
            return Intrinsics.areEqual(this.recommendedAmount, dayTradeCall.recommendedAmount) && this.showConfirmation == dayTradeCall.showConfirmation;
        }

        public int hashCode() {
            return (this.recommendedAmount.hashCode() * 31) + Boolean.hashCode(this.showConfirmation);
        }

        public String toString() {
            return "DayTradeCall(recommendedAmount=" + this.recommendedAmount + ", showConfirmation=" + this.showConfirmation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
            dest.writeInt(this.showConfirmation ? 1 : 0);
        }

        public /* synthetic */ DayTradeCall(BigDecimal bigDecimal, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigDecimal, (i & 2) != 0 ? false : z);
        }

        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public final boolean getShowConfirmation() {
            return this.showConfirmation;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DayTradeCall(BigDecimal recommendedAmount, boolean z) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = ApiCreateTransferRequest2.ONCE;
            TransferAccountSelection transferAccountSelection = new TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null);
            TransferAccountSelection transferAccountSelection2 = new TransferAccountSelection(null, true, ApiTransferAccount.TransferAccountType.RHS, 1, null);
            MAXTransferContext.EntryPoint entryPoint = MAXTransferContext.EntryPoint.DAY_TRADE_CALL;
            String lowerCase = "DAY_TRADE_CALL".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Object[] objArr = 0 == true ? 1 : 0;
            super(recommendedAmount, apiCreateTransferRequest2, false, transferAccountSelection, transferAccountSelection2, entryPoint, lowerCase, null, objArr, null, null, null, false, false, false, TransferOverlayTheme.NEGATIVE, 32640, null);
            this.recommendedAmount = recommendedAmount;
            this.showConfirmation = z;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003JK\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$MarginCallPrevention;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "recommendedAmount", "Ljava/math/BigDecimal;", "showConfirmation", "", "transferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "transferAccountId", "", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "<init>", "(Ljava/math/BigDecimal;ZLcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getShowConfirmation", "()Z", "getTransferAccountType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getTransferAccountId", "()Ljava/lang/String;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarginCallPrevention extends TransferConfiguration {
        public static final Parcelable.Creator<MarginCallPrevention> CREATOR = new Creator();
        private final MAXTransferContext.EntryPoint entryPoint;
        private final String entryPointLoggingIdentifier;
        private final BigDecimal recommendedAmount;
        private final boolean showConfirmation;
        private final String transferAccountId;
        private final ApiTransferAccount.TransferAccountType transferAccountType;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarginCallPrevention> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginCallPrevention createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginCallPrevention((BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, ApiTransferAccount.TransferAccountType.valueOf(parcel.readString()), parcel.readString(), MAXTransferContext.EntryPoint.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginCallPrevention[] newArray(int i) {
                return new MarginCallPrevention[i];
            }
        }

        public static /* synthetic */ MarginCallPrevention copy$default(MarginCallPrevention marginCallPrevention, BigDecimal bigDecimal, boolean z, ApiTransferAccount.TransferAccountType transferAccountType, String str, MAXTransferContext.EntryPoint entryPoint, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = marginCallPrevention.recommendedAmount;
            }
            if ((i & 2) != 0) {
                z = marginCallPrevention.showConfirmation;
            }
            if ((i & 4) != 0) {
                transferAccountType = marginCallPrevention.transferAccountType;
            }
            if ((i & 8) != 0) {
                str = marginCallPrevention.transferAccountId;
            }
            if ((i & 16) != 0) {
                entryPoint = marginCallPrevention.entryPoint;
            }
            if ((i & 32) != 0) {
                str2 = marginCallPrevention.entryPointLoggingIdentifier;
            }
            MAXTransferContext.EntryPoint entryPoint2 = entryPoint;
            String str3 = str2;
            return marginCallPrevention.copy(bigDecimal, z, transferAccountType, str, entryPoint2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowConfirmation() {
            return this.showConfirmation;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiTransferAccount.TransferAccountType getTransferAccountType() {
            return this.transferAccountType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTransferAccountId() {
            return this.transferAccountId;
        }

        /* renamed from: component5, reason: from getter */
        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component6, reason: from getter */
        public final String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        public final MarginCallPrevention copy(BigDecimal recommendedAmount, boolean showConfirmation, ApiTransferAccount.TransferAccountType transferAccountType, String transferAccountId, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier) {
            Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new MarginCallPrevention(recommendedAmount, showConfirmation, transferAccountType, transferAccountId, entryPoint, entryPointLoggingIdentifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginCallPrevention)) {
                return false;
            }
            MarginCallPrevention marginCallPrevention = (MarginCallPrevention) other;
            return Intrinsics.areEqual(this.recommendedAmount, marginCallPrevention.recommendedAmount) && this.showConfirmation == marginCallPrevention.showConfirmation && this.transferAccountType == marginCallPrevention.transferAccountType && Intrinsics.areEqual(this.transferAccountId, marginCallPrevention.transferAccountId) && this.entryPoint == marginCallPrevention.entryPoint && Intrinsics.areEqual(this.entryPointLoggingIdentifier, marginCallPrevention.entryPointLoggingIdentifier);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.recommendedAmount;
            int iHashCode = (((((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + Boolean.hashCode(this.showConfirmation)) * 31) + this.transferAccountType.hashCode()) * 31;
            String str = this.transferAccountId;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.entryPoint.hashCode()) * 31;
            String str2 = this.entryPointLoggingIdentifier;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "MarginCallPrevention(recommendedAmount=" + this.recommendedAmount + ", showConfirmation=" + this.showConfirmation + ", transferAccountType=" + this.transferAccountType + ", transferAccountId=" + this.transferAccountId + ", entryPoint=" + this.entryPoint + ", entryPointLoggingIdentifier=" + this.entryPointLoggingIdentifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
            dest.writeInt(this.showConfirmation ? 1 : 0);
            dest.writeString(this.transferAccountType.name());
            dest.writeString(this.transferAccountId);
            dest.writeString(this.entryPoint.name());
            dest.writeString(this.entryPointLoggingIdentifier);
        }

        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public final boolean getShowConfirmation() {
            return this.showConfirmation;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ MarginCallPrevention(BigDecimal bigDecimal, boolean z, ApiTransferAccount.TransferAccountType transferAccountType, String str, MAXTransferContext.EntryPoint entryPoint, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z2 = (i & 2) != 0 ? false : z;
            ApiTransferAccount.TransferAccountType transferAccountType2 = (i & 4) != 0 ? ApiTransferAccount.TransferAccountType.RHS : transferAccountType;
            String str3 = (i & 8) != 0 ? null : str;
            MAXTransferContext.EntryPoint entryPoint2 = (i & 16) != 0 ? MAXTransferContext.EntryPoint.MAINTENANCE_CALL_WARNING : entryPoint;
            if ((i & 32) != 0) {
                str2 = entryPoint2.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            }
            this(bigDecimal, z2, transferAccountType2, str3, entryPoint2, str2);
        }

        public final ApiTransferAccount.TransferAccountType getTransferAccountType() {
            return this.transferAccountType;
        }

        public final String getTransferAccountId() {
            return this.transferAccountId;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public MarginCallPrevention(BigDecimal bigDecimal, boolean z, ApiTransferAccount.TransferAccountType transferAccountType, String str, MAXTransferContext.EntryPoint entryPoint, String str2) {
            Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            boolean z2 = false;
            Double d = null;
            IraContributionType iraContributionType = null;
            String str3 = null;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            TransferOverlayTheme transferOverlayTheme = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            super(bigDecimal, ApiCreateTransferRequest2.ONCE, z2, new TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferAccountSelection(str, true, transferAccountType), entryPoint, str2, objArr2, d, iraContributionType, str3, objArr, z3, z4, z5, transferOverlayTheme, 65408, null);
            this.recommendedAmount = bigDecimal;
            this.showConfirmation = z;
            this.transferAccountType = transferAccountType;
            this.transferAccountId = str;
            this.entryPoint = entryPoint;
            this.entryPointLoggingIdentifier = str2;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\nHÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$MarginResolution;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "recommendedAmount", "Ljava/math/BigDecimal;", "minAmount", "showConfirmation", "", "transferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "transferAccountId", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Ljava/lang/String;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getMinAmount", "getShowConfirmation", "()Z", "getTransferAccountType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getTransferAccountId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarginResolution extends TransferConfiguration {
        public static final Parcelable.Creator<MarginResolution> CREATOR = new Creator();
        private final BigDecimal minAmount;
        private final BigDecimal recommendedAmount;
        private final boolean showConfirmation;
        private final String transferAccountId;
        private final ApiTransferAccount.TransferAccountType transferAccountType;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarginResolution> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginResolution createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginResolution((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, ApiTransferAccount.TransferAccountType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginResolution[] newArray(int i) {
                return new MarginResolution[i];
            }
        }

        public static /* synthetic */ MarginResolution copy$default(MarginResolution marginResolution, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, ApiTransferAccount.TransferAccountType transferAccountType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = marginResolution.recommendedAmount;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = marginResolution.minAmount;
            }
            if ((i & 4) != 0) {
                z = marginResolution.showConfirmation;
            }
            if ((i & 8) != 0) {
                transferAccountType = marginResolution.transferAccountType;
            }
            if ((i & 16) != 0) {
                str = marginResolution.transferAccountId;
            }
            String str2 = str;
            boolean z2 = z;
            return marginResolution.copy(bigDecimal, bigDecimal2, z2, transferAccountType, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getMinAmount() {
            return this.minAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowConfirmation() {
            return this.showConfirmation;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiTransferAccount.TransferAccountType getTransferAccountType() {
            return this.transferAccountType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTransferAccountId() {
            return this.transferAccountId;
        }

        public final MarginResolution copy(BigDecimal recommendedAmount, BigDecimal minAmount, boolean showConfirmation, ApiTransferAccount.TransferAccountType transferAccountType, String transferAccountId) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            Intrinsics.checkNotNullParameter(minAmount, "minAmount");
            Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
            return new MarginResolution(recommendedAmount, minAmount, showConfirmation, transferAccountType, transferAccountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginResolution)) {
                return false;
            }
            MarginResolution marginResolution = (MarginResolution) other;
            return Intrinsics.areEqual(this.recommendedAmount, marginResolution.recommendedAmount) && Intrinsics.areEqual(this.minAmount, marginResolution.minAmount) && this.showConfirmation == marginResolution.showConfirmation && this.transferAccountType == marginResolution.transferAccountType && Intrinsics.areEqual(this.transferAccountId, marginResolution.transferAccountId);
        }

        public int hashCode() {
            int iHashCode = ((((((this.recommendedAmount.hashCode() * 31) + this.minAmount.hashCode()) * 31) + Boolean.hashCode(this.showConfirmation)) * 31) + this.transferAccountType.hashCode()) * 31;
            String str = this.transferAccountId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MarginResolution(recommendedAmount=" + this.recommendedAmount + ", minAmount=" + this.minAmount + ", showConfirmation=" + this.showConfirmation + ", transferAccountType=" + this.transferAccountType + ", transferAccountId=" + this.transferAccountId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
            dest.writeSerializable(this.minAmount);
            dest.writeInt(this.showConfirmation ? 1 : 0);
            dest.writeString(this.transferAccountType.name());
            dest.writeString(this.transferAccountId);
        }

        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public final BigDecimal getMinAmount() {
            return this.minAmount;
        }

        public final boolean getShowConfirmation() {
            return this.showConfirmation;
        }

        public /* synthetic */ MarginResolution(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, ApiTransferAccount.TransferAccountType transferAccountType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigDecimal, bigDecimal2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ApiTransferAccount.TransferAccountType.RHS : transferAccountType, (i & 16) != 0 ? null : str);
        }

        public final ApiTransferAccount.TransferAccountType getTransferAccountType() {
            return this.transferAccountType;
        }

        public final String getTransferAccountId() {
            return this.transferAccountId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MarginResolution(BigDecimal recommendedAmount, BigDecimal minAmount, boolean z, ApiTransferAccount.TransferAccountType transferAccountType, String str) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            Intrinsics.checkNotNullParameter(minAmount, "minAmount");
            Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = ApiCreateTransferRequest2.ONCE;
            TransferAccountSelection transferAccountSelection = new TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null);
            TransferAccountSelection transferAccountSelection2 = new TransferAccountSelection(str, true, transferAccountType);
            MAXTransferContext.EntryPoint entryPoint = MAXTransferContext.EntryPoint.MAINTENANCE_CALL;
            String lowerCase = "MAINTENANCE_CALL".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Object[] objArr = 0 == true ? 1 : 0;
            super(recommendedAmount, apiCreateTransferRequest2, false, transferAccountSelection, transferAccountSelection2, entryPoint, lowerCase, null, null, objArr, null, null, false, false, false, null, 65408, null);
            this.recommendedAmount = recommendedAmount;
            this.minAmount = minAmount;
            this.showConfirmation = z;
            this.transferAccountType = transferAccountType;
            this.transferAccountId = str;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$RadHook;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "amount", "Ljava/math/BigDecimal;", "achRelationshipId", "Ljava/util/UUID;", "sinkAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "(Ljava/math/BigDecimal;Ljava/util/UUID;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", "getAmount", "()Ljava/math/BigDecimal;", "getAchRelationshipId", "()Ljava/util/UUID;", "getSinkAccountType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RadHook extends TransferConfiguration {
        public static final Parcelable.Creator<RadHook> CREATOR = new Creator();
        private final UUID achRelationshipId;
        private final BigDecimal amount;
        private final MAXTransferContext.EntryPoint entryPoint;
        private final ApiTransferAccount.TransferAccountType sinkAccountType;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RadHook> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RadHook createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RadHook((BigDecimal) parcel.readSerializable(), (UUID) parcel.readSerializable(), ApiTransferAccount.TransferAccountType.valueOf(parcel.readString()), MAXTransferContext.EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RadHook[] newArray(int i) {
                return new RadHook[i];
            }
        }

        public static /* synthetic */ RadHook copy$default(RadHook radHook, BigDecimal bigDecimal, UUID uuid, ApiTransferAccount.TransferAccountType transferAccountType, MAXTransferContext.EntryPoint entryPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = radHook.amount;
            }
            if ((i & 2) != 0) {
                uuid = radHook.achRelationshipId;
            }
            if ((i & 4) != 0) {
                transferAccountType = radHook.sinkAccountType;
            }
            if ((i & 8) != 0) {
                entryPoint = radHook.entryPoint;
            }
            return radHook.copy(bigDecimal, uuid, transferAccountType, entryPoint);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiTransferAccount.TransferAccountType getSinkAccountType() {
            return this.sinkAccountType;
        }

        /* renamed from: component4, reason: from getter */
        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final RadHook copy(BigDecimal amount, UUID achRelationshipId, ApiTransferAccount.TransferAccountType sinkAccountType, MAXTransferContext.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(sinkAccountType, "sinkAccountType");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new RadHook(amount, achRelationshipId, sinkAccountType, entryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadHook)) {
                return false;
            }
            RadHook radHook = (RadHook) other;
            return Intrinsics.areEqual(this.amount, radHook.amount) && Intrinsics.areEqual(this.achRelationshipId, radHook.achRelationshipId) && this.sinkAccountType == radHook.sinkAccountType && this.entryPoint == radHook.entryPoint;
        }

        public int hashCode() {
            return (((((this.amount.hashCode() * 31) + this.achRelationshipId.hashCode()) * 31) + this.sinkAccountType.hashCode()) * 31) + this.entryPoint.hashCode();
        }

        public String toString() {
            return "RadHook(amount=" + this.amount + ", achRelationshipId=" + this.achRelationshipId + ", sinkAccountType=" + this.sinkAccountType + ", entryPoint=" + this.entryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.amount);
            dest.writeSerializable(this.achRelationshipId);
            dest.writeString(this.sinkAccountType.name());
            dest.writeString(this.entryPoint.name());
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public BigDecimal getAmount() {
            return this.amount;
        }

        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        public final ApiTransferAccount.TransferAccountType getSinkAccountType() {
            return this.sinkAccountType;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public RadHook(BigDecimal amount, UUID achRelationshipId, ApiTransferAccount.TransferAccountType sinkAccountType, MAXTransferContext.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(sinkAccountType, "sinkAccountType");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = ApiCreateTransferRequest2.WEEKLY;
            TransferAccountSelection transferAccountSelection = new TransferAccountSelection(achRelationshipId.toString(), true, ApiTransferAccount.TransferAccountType.ACH);
            TransferAccountSelection transferAccountSelection2 = new TransferAccountSelection(null, true, sinkAccountType, 1, null);
            String lowerCase = entryPoint.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            super(amount, apiCreateTransferRequest2, true, transferAccountSelection, transferAccountSelection2, entryPoint, lowerCase, null, null, null, null, null, false, false, false, null, 65408, null);
            this.amount = amount;
            this.achRelationshipId = achRelationshipId;
            this.sinkAccountType = sinkAccountType;
            this.entryPoint = entryPoint;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JI\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$RadHookWithFrequency;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "amount", "Ljava/math/BigDecimal;", "achRelationshipId", "Ljava/util/UUID;", "rhsAccountNumber", "", "sinkAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "(Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", "getAmount", "()Ljava/math/BigDecimal;", "getAchRelationshipId", "()Ljava/util/UUID;", "getRhsAccountNumber", "()Ljava/lang/String;", "getSinkAccountType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RadHookWithFrequency extends TransferConfiguration {
        public static final Parcelable.Creator<RadHookWithFrequency> CREATOR = new Creator();
        private final UUID achRelationshipId;
        private final BigDecimal amount;
        private final MAXTransferContext.EntryPoint entryPoint;
        private final ApiCreateTransferRequest2 frequency;
        private final String rhsAccountNumber;
        private final ApiTransferAccount.TransferAccountType sinkAccountType;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RadHookWithFrequency> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RadHookWithFrequency createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RadHookWithFrequency((BigDecimal) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString(), ApiTransferAccount.TransferAccountType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ApiCreateTransferRequest2.valueOf(parcel.readString()), MAXTransferContext.EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RadHookWithFrequency[] newArray(int i) {
                return new RadHookWithFrequency[i];
            }
        }

        public static /* synthetic */ RadHookWithFrequency copy$default(RadHookWithFrequency radHookWithFrequency, BigDecimal bigDecimal, UUID uuid, String str, ApiTransferAccount.TransferAccountType transferAccountType, ApiCreateTransferRequest2 apiCreateTransferRequest2, MAXTransferContext.EntryPoint entryPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = radHookWithFrequency.amount;
            }
            if ((i & 2) != 0) {
                uuid = radHookWithFrequency.achRelationshipId;
            }
            if ((i & 4) != 0) {
                str = radHookWithFrequency.rhsAccountNumber;
            }
            if ((i & 8) != 0) {
                transferAccountType = radHookWithFrequency.sinkAccountType;
            }
            if ((i & 16) != 0) {
                apiCreateTransferRequest2 = radHookWithFrequency.frequency;
            }
            if ((i & 32) != 0) {
                entryPoint = radHookWithFrequency.entryPoint;
            }
            ApiCreateTransferRequest2 apiCreateTransferRequest22 = apiCreateTransferRequest2;
            MAXTransferContext.EntryPoint entryPoint2 = entryPoint;
            return radHookWithFrequency.copy(bigDecimal, uuid, str, transferAccountType, apiCreateTransferRequest22, entryPoint2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiTransferAccount.TransferAccountType getSinkAccountType() {
            return this.sinkAccountType;
        }

        /* renamed from: component5, reason: from getter */
        public final ApiCreateTransferRequest2 getFrequency() {
            return this.frequency;
        }

        /* renamed from: component6, reason: from getter */
        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final RadHookWithFrequency copy(BigDecimal amount, UUID achRelationshipId, String rhsAccountNumber, ApiTransferAccount.TransferAccountType sinkAccountType, ApiCreateTransferRequest2 frequency, MAXTransferContext.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(sinkAccountType, "sinkAccountType");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new RadHookWithFrequency(amount, achRelationshipId, rhsAccountNumber, sinkAccountType, frequency, entryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadHookWithFrequency)) {
                return false;
            }
            RadHookWithFrequency radHookWithFrequency = (RadHookWithFrequency) other;
            return Intrinsics.areEqual(this.amount, radHookWithFrequency.amount) && Intrinsics.areEqual(this.achRelationshipId, radHookWithFrequency.achRelationshipId) && Intrinsics.areEqual(this.rhsAccountNumber, radHookWithFrequency.rhsAccountNumber) && this.sinkAccountType == radHookWithFrequency.sinkAccountType && this.frequency == radHookWithFrequency.frequency && this.entryPoint == radHookWithFrequency.entryPoint;
        }

        public int hashCode() {
            int iHashCode = ((this.amount.hashCode() * 31) + this.achRelationshipId.hashCode()) * 31;
            String str = this.rhsAccountNumber;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sinkAccountType.hashCode()) * 31;
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = this.frequency;
            return ((iHashCode2 + (apiCreateTransferRequest2 != null ? apiCreateTransferRequest2.hashCode() : 0)) * 31) + this.entryPoint.hashCode();
        }

        public String toString() {
            return "RadHookWithFrequency(amount=" + this.amount + ", achRelationshipId=" + this.achRelationshipId + ", rhsAccountNumber=" + this.rhsAccountNumber + ", sinkAccountType=" + this.sinkAccountType + ", frequency=" + this.frequency + ", entryPoint=" + this.entryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.amount);
            dest.writeSerializable(this.achRelationshipId);
            dest.writeString(this.rhsAccountNumber);
            dest.writeString(this.sinkAccountType.name());
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = this.frequency;
            if (apiCreateTransferRequest2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(apiCreateTransferRequest2.name());
            }
            dest.writeString(this.entryPoint.name());
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public BigDecimal getAmount() {
            return this.amount;
        }

        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final ApiTransferAccount.TransferAccountType getSinkAccountType() {
            return this.sinkAccountType;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public ApiCreateTransferRequest2 getFrequency() {
            return this.frequency;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public RadHookWithFrequency(BigDecimal amount, UUID achRelationshipId, String str, ApiTransferAccount.TransferAccountType sinkAccountType, ApiCreateTransferRequest2 apiCreateTransferRequest2, MAXTransferContext.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(sinkAccountType, "sinkAccountType");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            TransferAccountSelection transferAccountSelection = new TransferAccountSelection(achRelationshipId.toString(), true, ApiTransferAccount.TransferAccountType.ACH);
            TransferAccountSelection transferAccountSelection2 = new TransferAccountSelection(str, true, sinkAccountType);
            String lowerCase = entryPoint.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            super(amount, apiCreateTransferRequest2, false, transferAccountSelection, transferAccountSelection2, entryPoint, lowerCase, null, null, null, null, null, false, false, false, null, 65408, null);
            this.amount = amount;
            this.achRelationshipId = achRelationshipId;
            this.rhsAccountNumber = str;
            this.sinkAccountType = sinkAccountType;
            this.frequency = apiCreateTransferRequest2;
            this.entryPoint = entryPoint;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$RecurringInsufficientBuyingPower;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "recommendedAmount", "Ljava/math/BigDecimal;", "investmentScheduleFrequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getInvestmentScheduleFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RecurringInsufficientBuyingPower extends TransferConfiguration {
        public static final Parcelable.Creator<RecurringInsufficientBuyingPower> CREATOR = new Creator();
        private final ApiInvestmentSchedule.Frequency investmentScheduleFrequency;
        private final BigDecimal recommendedAmount;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RecurringInsufficientBuyingPower> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringInsufficientBuyingPower createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringInsufficientBuyingPower((BigDecimal) parcel.readSerializable(), ApiInvestmentSchedule.Frequency.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringInsufficientBuyingPower[] newArray(int i) {
                return new RecurringInsufficientBuyingPower[i];
            }
        }

        public static /* synthetic */ RecurringInsufficientBuyingPower copy$default(RecurringInsufficientBuyingPower recurringInsufficientBuyingPower, BigDecimal bigDecimal, ApiInvestmentSchedule.Frequency frequency, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = recurringInsufficientBuyingPower.recommendedAmount;
            }
            if ((i & 2) != 0) {
                frequency = recurringInsufficientBuyingPower.investmentScheduleFrequency;
            }
            return recurringInsufficientBuyingPower.copy(bigDecimal, frequency);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getInvestmentScheduleFrequency() {
            return this.investmentScheduleFrequency;
        }

        public final RecurringInsufficientBuyingPower copy(BigDecimal recommendedAmount, ApiInvestmentSchedule.Frequency investmentScheduleFrequency) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            Intrinsics.checkNotNullParameter(investmentScheduleFrequency, "investmentScheduleFrequency");
            return new RecurringInsufficientBuyingPower(recommendedAmount, investmentScheduleFrequency);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecurringInsufficientBuyingPower)) {
                return false;
            }
            RecurringInsufficientBuyingPower recurringInsufficientBuyingPower = (RecurringInsufficientBuyingPower) other;
            return Intrinsics.areEqual(this.recommendedAmount, recurringInsufficientBuyingPower.recommendedAmount) && this.investmentScheduleFrequency == recurringInsufficientBuyingPower.investmentScheduleFrequency;
        }

        public int hashCode() {
            return (this.recommendedAmount.hashCode() * 31) + this.investmentScheduleFrequency.hashCode();
        }

        public String toString() {
            return "RecurringInsufficientBuyingPower(recommendedAmount=" + this.recommendedAmount + ", investmentScheduleFrequency=" + this.investmentScheduleFrequency + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendedAmount);
            dest.writeString(this.investmentScheduleFrequency.name());
        }

        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public final ApiInvestmentSchedule.Frequency getInvestmentScheduleFrequency() {
            return this.investmentScheduleFrequency;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public RecurringInsufficientBuyingPower(BigDecimal recommendedAmount, ApiInvestmentSchedule.Frequency investmentScheduleFrequency) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            Intrinsics.checkNotNullParameter(investmentScheduleFrequency, "investmentScheduleFrequency");
            boolean z = false;
            MAXTransferContext.EntryPoint entryPoint = null;
            String str = null;
            Double d = null;
            IraContributionType iraContributionType = null;
            String str2 = null;
            String str3 = null;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            TransferOverlayTheme transferOverlayTheme = null;
            Object[] objArr = 0 == true ? 1 : 0;
            super(recommendedAmount, ApiCreateTransferRequest2.ONCE, z, new TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferAccountSelection(null, true, ApiTransferAccount.TransferAccountType.RHS, 1, null), entryPoint, str, d, objArr, iraContributionType, str2, str3, z2, z3, z4, transferOverlayTheme, 65504, null);
            this.recommendedAmount = recommendedAmount;
            this.investmentScheduleFrequency = investmentScheduleFrequency;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$PostDebitCardLinking;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "from", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "to", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "useQueuedDepositMode", "", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Z)V", "getAmount", "()Ljava/math/BigDecimal;", "getFrom", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "getTo", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getUseQueuedDepositMode", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PostDebitCardLinking extends TransferConfiguration implements Parcelable {
        public static final Parcelable.Creator<PostDebitCardLinking> CREATOR = new Creator();
        private final BigDecimal amount;
        private final MAXTransferContext.EntryPoint entryPoint;
        private final TransferAccountSelection from;
        private final TransferAccountSelection to;
        private final boolean useQueuedDepositMode;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PostDebitCardLinking> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PostDebitCardLinking createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostDebitCardLinking((BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : TransferAccountSelection.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TransferAccountSelection.CREATOR.createFromParcel(parcel) : null, MAXTransferContext.EntryPoint.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PostDebitCardLinking[] newArray(int i) {
                return new PostDebitCardLinking[i];
            }
        }

        public static /* synthetic */ PostDebitCardLinking copy$default(PostDebitCardLinking postDebitCardLinking, BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, MAXTransferContext.EntryPoint entryPoint, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = postDebitCardLinking.amount;
            }
            if ((i & 2) != 0) {
                transferAccountSelection = postDebitCardLinking.from;
            }
            if ((i & 4) != 0) {
                transferAccountSelection2 = postDebitCardLinking.to;
            }
            if ((i & 8) != 0) {
                entryPoint = postDebitCardLinking.entryPoint;
            }
            if ((i & 16) != 0) {
                z = postDebitCardLinking.useQueuedDepositMode;
            }
            boolean z2 = z;
            TransferAccountSelection transferAccountSelection3 = transferAccountSelection2;
            return postDebitCardLinking.copy(bigDecimal, transferAccountSelection, transferAccountSelection3, entryPoint, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferAccountSelection getFrom() {
            return this.from;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferAccountSelection getTo() {
            return this.to;
        }

        /* renamed from: component4, reason: from getter */
        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getUseQueuedDepositMode() {
            return this.useQueuedDepositMode;
        }

        public final PostDebitCardLinking copy(BigDecimal amount, TransferAccountSelection from, TransferAccountSelection to, MAXTransferContext.EntryPoint entryPoint, boolean useQueuedDepositMode) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new PostDebitCardLinking(amount, from, to, entryPoint, useQueuedDepositMode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostDebitCardLinking)) {
                return false;
            }
            PostDebitCardLinking postDebitCardLinking = (PostDebitCardLinking) other;
            return Intrinsics.areEqual(this.amount, postDebitCardLinking.amount) && Intrinsics.areEqual(this.from, postDebitCardLinking.from) && Intrinsics.areEqual(this.to, postDebitCardLinking.to) && this.entryPoint == postDebitCardLinking.entryPoint && this.useQueuedDepositMode == postDebitCardLinking.useQueuedDepositMode;
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.amount;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            TransferAccountSelection transferAccountSelection = this.from;
            int iHashCode2 = (iHashCode + (transferAccountSelection == null ? 0 : transferAccountSelection.hashCode())) * 31;
            TransferAccountSelection transferAccountSelection2 = this.to;
            return ((((iHashCode2 + (transferAccountSelection2 != null ? transferAccountSelection2.hashCode() : 0)) * 31) + this.entryPoint.hashCode()) * 31) + Boolean.hashCode(this.useQueuedDepositMode);
        }

        public String toString() {
            return "PostDebitCardLinking(amount=" + this.amount + ", from=" + this.from + ", to=" + this.to + ", entryPoint=" + this.entryPoint + ", useQueuedDepositMode=" + this.useQueuedDepositMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.amount);
            TransferAccountSelection transferAccountSelection = this.from;
            if (transferAccountSelection == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection.writeToParcel(dest, flags);
            }
            TransferAccountSelection transferAccountSelection2 = this.to;
            if (transferAccountSelection2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection2.writeToParcel(dest, flags);
            }
            dest.writeString(this.entryPoint.name());
            dest.writeInt(this.useQueuedDepositMode ? 1 : 0);
        }

        public /* synthetic */ PostDebitCardLinking(BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, MAXTransferContext.EntryPoint entryPoint, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : transferAccountSelection, (i & 4) != 0 ? null : transferAccountSelection2, entryPoint, (i & 16) != 0 ? false : z);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public BigDecimal getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getFrom() {
            return this.from;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getTo() {
            return this.to;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public boolean getUseQueuedDepositMode() {
            return this.useQueuedDepositMode;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PostDebitCardLinking(BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, MAXTransferContext.EntryPoint entryPoint, boolean z) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            String lowerCase = entryPoint.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            super(bigDecimal, null, false, transferAccountSelection, transferAccountSelection2, entryPoint, lowerCase, null, null, null, null, null, false, false, false, null, 65408, null);
            this.amount = bigDecimal;
            this.from = transferAccountSelection;
            this.to = transferAccountSelection2;
            this.entryPoint = entryPoint;
            this.useQueuedDepositMode = z;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$Recommendations;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "from", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "to", "postTransferPageConfig", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiPostTransferPageConfig;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiPostTransferPageConfig;)V", "getAmount", "()Ljava/math/BigDecimal;", "getFrom", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "getTo", "getPostTransferPageConfig", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiPostTransferPageConfig;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Recommendations extends TransferConfiguration implements Parcelable {
        public static final Parcelable.Creator<Recommendations> CREATOR = new Creator();
        private final BigDecimal amount;
        private final TransferAccountSelection from;
        private final ApiCreateTransferRequest.ApiPostTransferPageConfig postTransferPageConfig;
        private final TransferAccountSelection to;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Recommendations> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recommendations createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Recommendations((BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : TransferAccountSelection.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TransferAccountSelection.CREATOR.createFromParcel(parcel) : null, (ApiCreateTransferRequest.ApiPostTransferPageConfig) parcel.readParcelable(Recommendations.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recommendations[] newArray(int i) {
                return new Recommendations[i];
            }
        }

        public Recommendations() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Recommendations copy$default(Recommendations recommendations, BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = recommendations.amount;
            }
            if ((i & 2) != 0) {
                transferAccountSelection = recommendations.from;
            }
            if ((i & 4) != 0) {
                transferAccountSelection2 = recommendations.to;
            }
            if ((i & 8) != 0) {
                apiPostTransferPageConfig = recommendations.postTransferPageConfig;
            }
            return recommendations.copy(bigDecimal, transferAccountSelection, transferAccountSelection2, apiPostTransferPageConfig);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferAccountSelection getFrom() {
            return this.from;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferAccountSelection getTo() {
            return this.to;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiCreateTransferRequest.ApiPostTransferPageConfig getPostTransferPageConfig() {
            return this.postTransferPageConfig;
        }

        public final Recommendations copy(BigDecimal amount, TransferAccountSelection from, TransferAccountSelection to, ApiCreateTransferRequest.ApiPostTransferPageConfig postTransferPageConfig) {
            return new Recommendations(amount, from, to, postTransferPageConfig);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Recommendations)) {
                return false;
            }
            Recommendations recommendations = (Recommendations) other;
            return Intrinsics.areEqual(this.amount, recommendations.amount) && Intrinsics.areEqual(this.from, recommendations.from) && Intrinsics.areEqual(this.to, recommendations.to) && Intrinsics.areEqual(this.postTransferPageConfig, recommendations.postTransferPageConfig);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.amount;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            TransferAccountSelection transferAccountSelection = this.from;
            int iHashCode2 = (iHashCode + (transferAccountSelection == null ? 0 : transferAccountSelection.hashCode())) * 31;
            TransferAccountSelection transferAccountSelection2 = this.to;
            int iHashCode3 = (iHashCode2 + (transferAccountSelection2 == null ? 0 : transferAccountSelection2.hashCode())) * 31;
            ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig = this.postTransferPageConfig;
            return iHashCode3 + (apiPostTransferPageConfig != null ? apiPostTransferPageConfig.hashCode() : 0);
        }

        public String toString() {
            return "Recommendations(amount=" + this.amount + ", from=" + this.from + ", to=" + this.to + ", postTransferPageConfig=" + this.postTransferPageConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.amount);
            TransferAccountSelection transferAccountSelection = this.from;
            if (transferAccountSelection == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection.writeToParcel(dest, flags);
            }
            TransferAccountSelection transferAccountSelection2 = this.to;
            if (transferAccountSelection2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection2.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.postTransferPageConfig, flags);
        }

        public /* synthetic */ Recommendations(BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : transferAccountSelection, (i & 4) != 0 ? null : transferAccountSelection2, (i & 8) != 0 ? null : apiPostTransferPageConfig);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public BigDecimal getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getFrom() {
            return this.from;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getTo() {
            return this.to;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public ApiCreateTransferRequest.ApiPostTransferPageConfig getPostTransferPageConfig() {
            return this.postTransferPageConfig;
        }

        public Recommendations(BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig) {
            super(bigDecimal, null, false, transferAccountSelection, transferAccountSelection2, MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, null, null, null, null, null, null, false, false, false, null, 65472, null);
            this.amount = bigDecimal;
            this.from = transferAccountSelection;
            this.to = transferAccountSelection2;
            this.postTransferPageConfig = apiPostTransferPageConfig;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jg\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0011HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$IraContribution;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "from", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "to", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "postTransferPageConfig", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiPostTransferPageConfig;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/models/api/bonfire/IraContributionType;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiPostTransferPageConfig;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getFrom", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "getTo", "getIraContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "getPostTransferPageConfig", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiPostTransferPageConfig;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IraContribution extends TransferConfiguration implements Parcelable {
        public static final Parcelable.Creator<IraContribution> CREATOR = new Creator();
        private final BigDecimal amount;
        private final MAXTransferContext.EntryPoint entryPoint;
        private final String entryPointLoggingIdentifier;
        private final ApiCreateTransferRequest2 frequency;
        private final TransferAccountSelection from;
        private final IraContributionType iraContributionType;
        private final ApiCreateTransferRequest.ApiPostTransferPageConfig postTransferPageConfig;
        private final TransferAccountSelection to;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<IraContribution> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IraContribution createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IraContribution((BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : ApiCreateTransferRequest2.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TransferAccountSelection.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TransferAccountSelection.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IraContributionType.valueOf(parcel.readString()) : null, (ApiCreateTransferRequest.ApiPostTransferPageConfig) parcel.readParcelable(IraContribution.class.getClassLoader()), MAXTransferContext.EntryPoint.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IraContribution[] newArray(int i) {
                return new IraContribution[i];
            }
        }

        public IraContribution() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public static /* synthetic */ IraContribution copy$default(IraContribution iraContribution, BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, IraContributionType iraContributionType, ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig, MAXTransferContext.EntryPoint entryPoint, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = iraContribution.amount;
            }
            if ((i & 2) != 0) {
                apiCreateTransferRequest2 = iraContribution.frequency;
            }
            if ((i & 4) != 0) {
                transferAccountSelection = iraContribution.from;
            }
            if ((i & 8) != 0) {
                transferAccountSelection2 = iraContribution.to;
            }
            if ((i & 16) != 0) {
                iraContributionType = iraContribution.iraContributionType;
            }
            if ((i & 32) != 0) {
                apiPostTransferPageConfig = iraContribution.postTransferPageConfig;
            }
            if ((i & 64) != 0) {
                entryPoint = iraContribution.entryPoint;
            }
            if ((i & 128) != 0) {
                str = iraContribution.entryPointLoggingIdentifier;
            }
            MAXTransferContext.EntryPoint entryPoint2 = entryPoint;
            String str2 = str;
            IraContributionType iraContributionType2 = iraContributionType;
            ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig2 = apiPostTransferPageConfig;
            return iraContribution.copy(bigDecimal, apiCreateTransferRequest2, transferAccountSelection, transferAccountSelection2, iraContributionType2, apiPostTransferPageConfig2, entryPoint2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCreateTransferRequest2 getFrequency() {
            return this.frequency;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferAccountSelection getFrom() {
            return this.from;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferAccountSelection getTo() {
            return this.to;
        }

        /* renamed from: component5, reason: from getter */
        public final IraContributionType getIraContributionType() {
            return this.iraContributionType;
        }

        /* renamed from: component6, reason: from getter */
        public final ApiCreateTransferRequest.ApiPostTransferPageConfig getPostTransferPageConfig() {
            return this.postTransferPageConfig;
        }

        /* renamed from: component7, reason: from getter */
        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component8, reason: from getter */
        public final String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        public final IraContribution copy(BigDecimal amount, ApiCreateTransferRequest2 frequency, TransferAccountSelection from, TransferAccountSelection to, IraContributionType iraContributionType, ApiCreateTransferRequest.ApiPostTransferPageConfig postTransferPageConfig, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new IraContribution(amount, frequency, from, to, iraContributionType, postTransferPageConfig, entryPoint, entryPointLoggingIdentifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IraContribution)) {
                return false;
            }
            IraContribution iraContribution = (IraContribution) other;
            return Intrinsics.areEqual(this.amount, iraContribution.amount) && this.frequency == iraContribution.frequency && Intrinsics.areEqual(this.from, iraContribution.from) && Intrinsics.areEqual(this.to, iraContribution.to) && this.iraContributionType == iraContribution.iraContributionType && Intrinsics.areEqual(this.postTransferPageConfig, iraContribution.postTransferPageConfig) && this.entryPoint == iraContribution.entryPoint && Intrinsics.areEqual(this.entryPointLoggingIdentifier, iraContribution.entryPointLoggingIdentifier);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.amount;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = this.frequency;
            int iHashCode2 = (iHashCode + (apiCreateTransferRequest2 == null ? 0 : apiCreateTransferRequest2.hashCode())) * 31;
            TransferAccountSelection transferAccountSelection = this.from;
            int iHashCode3 = (iHashCode2 + (transferAccountSelection == null ? 0 : transferAccountSelection.hashCode())) * 31;
            TransferAccountSelection transferAccountSelection2 = this.to;
            int iHashCode4 = (iHashCode3 + (transferAccountSelection2 == null ? 0 : transferAccountSelection2.hashCode())) * 31;
            IraContributionType iraContributionType = this.iraContributionType;
            int iHashCode5 = (iHashCode4 + (iraContributionType == null ? 0 : iraContributionType.hashCode())) * 31;
            ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig = this.postTransferPageConfig;
            int iHashCode6 = (((iHashCode5 + (apiPostTransferPageConfig == null ? 0 : apiPostTransferPageConfig.hashCode())) * 31) + this.entryPoint.hashCode()) * 31;
            String str = this.entryPointLoggingIdentifier;
            return iHashCode6 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "IraContribution(amount=" + this.amount + ", frequency=" + this.frequency + ", from=" + this.from + ", to=" + this.to + ", iraContributionType=" + this.iraContributionType + ", postTransferPageConfig=" + this.postTransferPageConfig + ", entryPoint=" + this.entryPoint + ", entryPointLoggingIdentifier=" + this.entryPointLoggingIdentifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.amount);
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = this.frequency;
            if (apiCreateTransferRequest2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(apiCreateTransferRequest2.name());
            }
            TransferAccountSelection transferAccountSelection = this.from;
            if (transferAccountSelection == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection.writeToParcel(dest, flags);
            }
            TransferAccountSelection transferAccountSelection2 = this.to;
            if (transferAccountSelection2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection2.writeToParcel(dest, flags);
            }
            IraContributionType iraContributionType = this.iraContributionType;
            if (iraContributionType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iraContributionType.name());
            }
            dest.writeParcelable(this.postTransferPageConfig, flags);
            dest.writeString(this.entryPoint.name());
            dest.writeString(this.entryPointLoggingIdentifier);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public BigDecimal getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public ApiCreateTransferRequest2 getFrequency() {
            return this.frequency;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getFrom() {
            return this.from;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getTo() {
            return this.to;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public IraContributionType getIraContributionType() {
            return this.iraContributionType;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public ApiCreateTransferRequest.ApiPostTransferPageConfig getPostTransferPageConfig() {
            return this.postTransferPageConfig;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IraContribution(BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, IraContributionType iraContributionType, ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig, MAXTransferContext.EntryPoint entryPoint, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            bigDecimal = (i & 1) != 0 ? null : bigDecimal;
            apiCreateTransferRequest2 = (i & 2) != 0 ? null : apiCreateTransferRequest2;
            transferAccountSelection = (i & 4) != 0 ? null : transferAccountSelection;
            transferAccountSelection2 = (i & 8) != 0 ? null : transferAccountSelection2;
            iraContributionType = (i & 16) != 0 ? null : iraContributionType;
            apiPostTransferPageConfig = (i & 32) != 0 ? null : apiPostTransferPageConfig;
            entryPoint = (i & 64) != 0 ? MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint;
            if ((i & 128) != 0) {
                str = entryPoint.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            this(bigDecimal, apiCreateTransferRequest2, transferAccountSelection, transferAccountSelection2, iraContributionType, apiPostTransferPageConfig, entryPoint, str);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IraContribution(BigDecimal bigDecimal, ApiCreateTransferRequest2 apiCreateTransferRequest2, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, IraContributionType iraContributionType, ApiCreateTransferRequest.ApiPostTransferPageConfig apiPostTransferPageConfig, MAXTransferContext.EntryPoint entryPoint, String str) {
            super(bigDecimal, apiCreateTransferRequest2, false, transferAccountSelection, transferAccountSelection2, entryPoint, str, null, null, iraContributionType, null, null, false, false, false, null, 64896, null);
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.amount = bigDecimal;
            this.frequency = apiCreateTransferRequest2;
            this.from = transferAccountSelection;
            this.to = transferAccountSelection2;
            this.iraContributionType = iraContributionType;
            this.postTransferPageConfig = apiPostTransferPageConfig;
            this.entryPoint = entryPoint;
            this.entryPointLoggingIdentifier = str;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$RothConversion;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "Landroid/os/Parcelable;", "fromAccountId", "", "toAccountId", "isFixed", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getFromAccountId", "()Ljava/lang/String;", "getToAccountId", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RothConversion extends TransferConfiguration implements Parcelable {
        public static final Parcelable.Creator<RothConversion> CREATOR = new Creator();
        private final String fromAccountId;
        private final boolean isFixed;
        private final String toAccountId;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RothConversion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RothConversion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RothConversion(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RothConversion[] newArray(int i) {
                return new RothConversion[i];
            }
        }

        public RothConversion() {
            this(null, null, false, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.fromAccountId);
            dest.writeString(this.toAccountId);
            dest.writeInt(this.isFixed ? 1 : 0);
        }

        public /* synthetic */ RothConversion(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
        }

        public final String getFromAccountId() {
            return this.fromAccountId;
        }

        public final String getToAccountId() {
            return this.toAccountId;
        }

        /* renamed from: isFixed, reason: from getter */
        public final boolean getIsFixed() {
            return this.isFixed;
        }

        public RothConversion(String str, String str2, boolean z) {
            super(null, ApiCreateTransferRequest2.ONCE, false, new TransferAccountSelection(str, z, ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL), new TransferAccountSelection(str2, z, ApiTransferAccount.TransferAccountType.IRA_ROTH), MAXTransferContext.EntryPoint.ROTH_CONVERSION, null, null, null, null, null, null, false, false, false, null, 65408, null);
            this.fromAccountId = str;
            this.toAccountId = str2;
            this.isFixed = z;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010 \u001a\u00020\u0007J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jg\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020+HÖ\u0001J\t\u00100\u001a\u00020\u000bHÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020+R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$OutgoingWire;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "Landroid/os/Parcelable;", "from", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "to", "isFirstParty", "", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/WiresContext;", "outgoingWireAccountNumber", "", "outgoingWireRoutingNumber", "initialRecipientType", "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "thirdPartyWiresInfo", "Lcom/robinhood/android/models/transfer/shared/ThirdPartyOutgoingWiresInfo;", "<init>", "(Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;ZLcom/robinhood/rosetta/eventlogging/WiresContext;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/wires/RecipientType;Lcom/robinhood/android/models/transfer/shared/ThirdPartyOutgoingWiresInfo;)V", "getFrom", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "getTo", "()Z", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/WiresContext;", "getOutgoingWireAccountNumber", "()Ljava/lang/String;", "getOutgoingWireRoutingNumber", "getInitialRecipientType", "()Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "getThirdPartyWiresInfo", "()Lcom/robinhood/android/models/transfer/shared/ThirdPartyOutgoingWiresInfo;", "isThirdPartyWireConfigured", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OutgoingWire extends TransferConfiguration implements Parcelable {
        public static final Parcelable.Creator<OutgoingWire> CREATOR = new Creator();
        private final TransferAccountSelection from;
        private final RecipientType initialRecipientType;
        private final boolean isFirstParty;
        private final WiresContext loggingContext;
        private final String outgoingWireAccountNumber;
        private final String outgoingWireRoutingNumber;
        private final ThirdPartyOutgoingWiresInfo thirdPartyWiresInfo;
        private final TransferAccountSelection to;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OutgoingWire> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OutgoingWire createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OutgoingWire(parcel.readInt() == 0 ? null : TransferAccountSelection.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TransferAccountSelection.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (WiresContext) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? RecipientType.valueOf(parcel.readString()) : null, (ThirdPartyOutgoingWiresInfo) parcel.readParcelable(OutgoingWire.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OutgoingWire[] newArray(int i) {
                return new OutgoingWire[i];
            }
        }

        public OutgoingWire() {
            this(null, null, false, null, null, null, null, null, 255, null);
        }

        public static /* synthetic */ OutgoingWire copy$default(OutgoingWire outgoingWire, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, boolean z, WiresContext wiresContext, String str, String str2, RecipientType recipientType, ThirdPartyOutgoingWiresInfo thirdPartyOutgoingWiresInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccountSelection = outgoingWire.from;
            }
            if ((i & 2) != 0) {
                transferAccountSelection2 = outgoingWire.to;
            }
            if ((i & 4) != 0) {
                z = outgoingWire.isFirstParty;
            }
            if ((i & 8) != 0) {
                wiresContext = outgoingWire.loggingContext;
            }
            if ((i & 16) != 0) {
                str = outgoingWire.outgoingWireAccountNumber;
            }
            if ((i & 32) != 0) {
                str2 = outgoingWire.outgoingWireRoutingNumber;
            }
            if ((i & 64) != 0) {
                recipientType = outgoingWire.initialRecipientType;
            }
            if ((i & 128) != 0) {
                thirdPartyOutgoingWiresInfo = outgoingWire.thirdPartyWiresInfo;
            }
            RecipientType recipientType2 = recipientType;
            ThirdPartyOutgoingWiresInfo thirdPartyOutgoingWiresInfo2 = thirdPartyOutgoingWiresInfo;
            String str3 = str;
            String str4 = str2;
            return outgoingWire.copy(transferAccountSelection, transferAccountSelection2, z, wiresContext, str3, str4, recipientType2, thirdPartyOutgoingWiresInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccountSelection getFrom() {
            return this.from;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferAccountSelection getTo() {
            return this.to;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsFirstParty() {
            return this.isFirstParty;
        }

        /* renamed from: component4, reason: from getter */
        public final WiresContext getLoggingContext() {
            return this.loggingContext;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOutgoingWireAccountNumber() {
            return this.outgoingWireAccountNumber;
        }

        /* renamed from: component6, reason: from getter */
        public final String getOutgoingWireRoutingNumber() {
            return this.outgoingWireRoutingNumber;
        }

        /* renamed from: component7, reason: from getter */
        public final RecipientType getInitialRecipientType() {
            return this.initialRecipientType;
        }

        /* renamed from: component8, reason: from getter */
        public final ThirdPartyOutgoingWiresInfo getThirdPartyWiresInfo() {
            return this.thirdPartyWiresInfo;
        }

        public final OutgoingWire copy(TransferAccountSelection from, TransferAccountSelection to, boolean isFirstParty, WiresContext loggingContext, String outgoingWireAccountNumber, String outgoingWireRoutingNumber, RecipientType initialRecipientType, ThirdPartyOutgoingWiresInfo thirdPartyWiresInfo) {
            return new OutgoingWire(from, to, isFirstParty, loggingContext, outgoingWireAccountNumber, outgoingWireRoutingNumber, initialRecipientType, thirdPartyWiresInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OutgoingWire)) {
                return false;
            }
            OutgoingWire outgoingWire = (OutgoingWire) other;
            return Intrinsics.areEqual(this.from, outgoingWire.from) && Intrinsics.areEqual(this.to, outgoingWire.to) && this.isFirstParty == outgoingWire.isFirstParty && Intrinsics.areEqual(this.loggingContext, outgoingWire.loggingContext) && Intrinsics.areEqual(this.outgoingWireAccountNumber, outgoingWire.outgoingWireAccountNumber) && Intrinsics.areEqual(this.outgoingWireRoutingNumber, outgoingWire.outgoingWireRoutingNumber) && this.initialRecipientType == outgoingWire.initialRecipientType && Intrinsics.areEqual(this.thirdPartyWiresInfo, outgoingWire.thirdPartyWiresInfo);
        }

        public int hashCode() {
            TransferAccountSelection transferAccountSelection = this.from;
            int iHashCode = (transferAccountSelection == null ? 0 : transferAccountSelection.hashCode()) * 31;
            TransferAccountSelection transferAccountSelection2 = this.to;
            int iHashCode2 = (((iHashCode + (transferAccountSelection2 == null ? 0 : transferAccountSelection2.hashCode())) * 31) + Boolean.hashCode(this.isFirstParty)) * 31;
            WiresContext wiresContext = this.loggingContext;
            int iHashCode3 = (iHashCode2 + (wiresContext == null ? 0 : wiresContext.hashCode())) * 31;
            String str = this.outgoingWireAccountNumber;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.outgoingWireRoutingNumber;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            RecipientType recipientType = this.initialRecipientType;
            int iHashCode6 = (iHashCode5 + (recipientType == null ? 0 : recipientType.hashCode())) * 31;
            ThirdPartyOutgoingWiresInfo thirdPartyOutgoingWiresInfo = this.thirdPartyWiresInfo;
            return iHashCode6 + (thirdPartyOutgoingWiresInfo != null ? thirdPartyOutgoingWiresInfo.hashCode() : 0);
        }

        public String toString() {
            return "OutgoingWire(from=" + this.from + ", to=" + this.to + ", isFirstParty=" + this.isFirstParty + ", loggingContext=" + this.loggingContext + ", outgoingWireAccountNumber=" + this.outgoingWireAccountNumber + ", outgoingWireRoutingNumber=" + this.outgoingWireRoutingNumber + ", initialRecipientType=" + this.initialRecipientType + ", thirdPartyWiresInfo=" + this.thirdPartyWiresInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            TransferAccountSelection transferAccountSelection = this.from;
            if (transferAccountSelection == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection.writeToParcel(dest, flags);
            }
            TransferAccountSelection transferAccountSelection2 = this.to;
            if (transferAccountSelection2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection2.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isFirstParty ? 1 : 0);
            dest.writeSerializable(this.loggingContext);
            dest.writeString(this.outgoingWireAccountNumber);
            dest.writeString(this.outgoingWireRoutingNumber);
            RecipientType recipientType = this.initialRecipientType;
            if (recipientType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(recipientType.name());
            }
            dest.writeParcelable(this.thirdPartyWiresInfo, flags);
        }

        public /* synthetic */ OutgoingWire(TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, boolean z, WiresContext wiresContext, String str, String str2, RecipientType recipientType, ThirdPartyOutgoingWiresInfo thirdPartyOutgoingWiresInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHS, 3, null) : transferAccountSelection, (i & 2) != 0 ? null : transferAccountSelection2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : wiresContext, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : recipientType, (i & 128) != 0 ? null : thirdPartyOutgoingWiresInfo);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getFrom() {
            return this.from;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getTo() {
            return this.to;
        }

        public final boolean isFirstParty() {
            return this.isFirstParty;
        }

        public final WiresContext getLoggingContext() {
            return this.loggingContext;
        }

        public final String getOutgoingWireAccountNumber() {
            return this.outgoingWireAccountNumber;
        }

        public final String getOutgoingWireRoutingNumber() {
            return this.outgoingWireRoutingNumber;
        }

        public final RecipientType getInitialRecipientType() {
            return this.initialRecipientType;
        }

        public final ThirdPartyOutgoingWiresInfo getThirdPartyWiresInfo() {
            return this.thirdPartyWiresInfo;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OutgoingWire(TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, boolean z, WiresContext wiresContext, String str, String str2, RecipientType recipientType, ThirdPartyOutgoingWiresInfo thirdPartyOutgoingWiresInfo) {
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = ApiCreateTransferRequest2.ONCE;
            MAXTransferContext.EntryPoint entryPoint = MAXTransferContext.EntryPoint.OUTGOING_WIRE;
            String lowerCase = "OUTGOING_WIRE".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            super(null, apiCreateTransferRequest2, false, transferAccountSelection, null, entryPoint, lowerCase, null, null, null, null, null, false, false, false, null, 65408, null);
            this.from = transferAccountSelection;
            this.to = transferAccountSelection2;
            this.isFirstParty = z;
            this.loggingContext = wiresContext;
            this.outgoingWireAccountNumber = str;
            this.outgoingWireRoutingNumber = str2;
            this.initialRecipientType = recipientType;
            this.thirdPartyWiresInfo = thirdPartyOutgoingWiresInfo;
        }

        public final boolean isThirdPartyWireConfigured() {
            return this.thirdPartyWiresInfo != null;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$PdtPrevention;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "from", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "to", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;)V", "getAmount", "()Ljava/math/BigDecimal;", "getFrom", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "getTo", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PdtPrevention extends TransferConfiguration implements Parcelable {
        public static final Parcelable.Creator<PdtPrevention> CREATOR = new Creator();
        private final BigDecimal amount;
        private final TransferAccountSelection from;
        private final TransferAccountSelection to;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PdtPrevention> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PdtPrevention createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PdtPrevention((BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : TransferAccountSelection.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TransferAccountSelection.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PdtPrevention[] newArray(int i) {
                return new PdtPrevention[i];
            }
        }

        public PdtPrevention() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ PdtPrevention copy$default(PdtPrevention pdtPrevention, BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = pdtPrevention.amount;
            }
            if ((i & 2) != 0) {
                transferAccountSelection = pdtPrevention.from;
            }
            if ((i & 4) != 0) {
                transferAccountSelection2 = pdtPrevention.to;
            }
            return pdtPrevention.copy(bigDecimal, transferAccountSelection, transferAccountSelection2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferAccountSelection getFrom() {
            return this.from;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferAccountSelection getTo() {
            return this.to;
        }

        public final PdtPrevention copy(BigDecimal amount, TransferAccountSelection from, TransferAccountSelection to) {
            return new PdtPrevention(amount, from, to);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PdtPrevention)) {
                return false;
            }
            PdtPrevention pdtPrevention = (PdtPrevention) other;
            return Intrinsics.areEqual(this.amount, pdtPrevention.amount) && Intrinsics.areEqual(this.from, pdtPrevention.from) && Intrinsics.areEqual(this.to, pdtPrevention.to);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.amount;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            TransferAccountSelection transferAccountSelection = this.from;
            int iHashCode2 = (iHashCode + (transferAccountSelection == null ? 0 : transferAccountSelection.hashCode())) * 31;
            TransferAccountSelection transferAccountSelection2 = this.to;
            return iHashCode2 + (transferAccountSelection2 != null ? transferAccountSelection2.hashCode() : 0);
        }

        public String toString() {
            return "PdtPrevention(amount=" + this.amount + ", from=" + this.from + ", to=" + this.to + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.amount);
            TransferAccountSelection transferAccountSelection = this.from;
            if (transferAccountSelection == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection.writeToParcel(dest, flags);
            }
            TransferAccountSelection transferAccountSelection2 = this.to;
            if (transferAccountSelection2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection2.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ PdtPrevention(BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : transferAccountSelection, (i & 4) != 0 ? null : transferAccountSelection2);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public BigDecimal getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getFrom() {
            return this.from;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getTo() {
            return this.to;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PdtPrevention(BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2) {
            ApiCreateTransferRequest2 apiCreateTransferRequest2 = ApiCreateTransferRequest2.ONCE;
            MAXTransferContext.EntryPoint entryPoint = MAXTransferContext.EntryPoint.POST_TRADE_FLOW_PDT;
            String lowerCase = "POST_TRADE_FLOW_PDT".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            super(bigDecimal, apiCreateTransferRequest2, false, transferAccountSelection, transferAccountSelection2, entryPoint, lowerCase, null, null, null, null, null, false, false, false, null, 65408, null);
            this.amount = bigDecimal;
            this.from = transferAccountSelection;
            this.to = transferAccountSelection2;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\rHÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001c¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$UpdateRecurringDeposit;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "Landroid/os/Parcelable;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "amount", "Ljava/math/BigDecimal;", "from", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "to", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "originalFrequency", "recurringDepositId", "<init>", "(Lcom/robinhood/models/api/bonfire/TransferFrequency;Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/TransferFrequency;Ljava/lang/String;)V", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getAmount", "()Ljava/math/BigDecimal;", "getFrom", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "getTo", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "()Ljava/lang/String;", "getOriginalFrequency", "getRecurringDepositId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateRecurringDeposit extends TransferConfiguration implements Parcelable {
        public static final Parcelable.Creator<UpdateRecurringDeposit> CREATOR = new Creator();
        private final BigDecimal amount;
        private final MAXTransferContext.EntryPoint entryPoint;
        private final String entryPointLoggingIdentifier;
        private final ApiCreateTransferRequest2 frequency;
        private final TransferAccountSelection from;
        private final ApiCreateTransferRequest2 originalFrequency;
        private final String recurringDepositId;
        private final TransferAccountSelection to;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UpdateRecurringDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateRecurringDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ApiCreateTransferRequest2 apiCreateTransferRequest2ValueOf = ApiCreateTransferRequest2.valueOf(parcel.readString());
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                Parcelable.Creator<TransferAccountSelection> creator = TransferAccountSelection.CREATOR;
                return new UpdateRecurringDeposit(apiCreateTransferRequest2ValueOf, bigDecimal, creator.createFromParcel(parcel), creator.createFromParcel(parcel), MAXTransferContext.EntryPoint.valueOf(parcel.readString()), parcel.readString(), ApiCreateTransferRequest2.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateRecurringDeposit[] newArray(int i) {
                return new UpdateRecurringDeposit[i];
            }
        }

        public static /* synthetic */ UpdateRecurringDeposit copy$default(UpdateRecurringDeposit updateRecurringDeposit, ApiCreateTransferRequest2 apiCreateTransferRequest2, BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, MAXTransferContext.EntryPoint entryPoint, String str, ApiCreateTransferRequest2 apiCreateTransferRequest22, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCreateTransferRequest2 = updateRecurringDeposit.frequency;
            }
            if ((i & 2) != 0) {
                bigDecimal = updateRecurringDeposit.amount;
            }
            if ((i & 4) != 0) {
                transferAccountSelection = updateRecurringDeposit.from;
            }
            if ((i & 8) != 0) {
                transferAccountSelection2 = updateRecurringDeposit.to;
            }
            if ((i & 16) != 0) {
                entryPoint = updateRecurringDeposit.entryPoint;
            }
            if ((i & 32) != 0) {
                str = updateRecurringDeposit.entryPointLoggingIdentifier;
            }
            if ((i & 64) != 0) {
                apiCreateTransferRequest22 = updateRecurringDeposit.originalFrequency;
            }
            if ((i & 128) != 0) {
                str2 = updateRecurringDeposit.recurringDepositId;
            }
            ApiCreateTransferRequest2 apiCreateTransferRequest23 = apiCreateTransferRequest22;
            String str3 = str2;
            MAXTransferContext.EntryPoint entryPoint2 = entryPoint;
            String str4 = str;
            return updateRecurringDeposit.copy(apiCreateTransferRequest2, bigDecimal, transferAccountSelection, transferAccountSelection2, entryPoint2, str4, apiCreateTransferRequest23, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCreateTransferRequest2 getFrequency() {
            return this.frequency;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferAccountSelection getFrom() {
            return this.from;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferAccountSelection getTo() {
            return this.to;
        }

        /* renamed from: component5, reason: from getter */
        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component6, reason: from getter */
        public final String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiCreateTransferRequest2 getOriginalFrequency() {
            return this.originalFrequency;
        }

        /* renamed from: component8, reason: from getter */
        public final String getRecurringDepositId() {
            return this.recurringDepositId;
        }

        public final UpdateRecurringDeposit copy(ApiCreateTransferRequest2 frequency, BigDecimal amount, TransferAccountSelection from, TransferAccountSelection to, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, ApiCreateTransferRequest2 originalFrequency, String recurringDepositId) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
            Intrinsics.checkNotNullParameter(originalFrequency, "originalFrequency");
            Intrinsics.checkNotNullParameter(recurringDepositId, "recurringDepositId");
            return new UpdateRecurringDeposit(frequency, amount, from, to, entryPoint, entryPointLoggingIdentifier, originalFrequency, recurringDepositId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateRecurringDeposit)) {
                return false;
            }
            UpdateRecurringDeposit updateRecurringDeposit = (UpdateRecurringDeposit) other;
            return this.frequency == updateRecurringDeposit.frequency && Intrinsics.areEqual(this.amount, updateRecurringDeposit.amount) && Intrinsics.areEqual(this.from, updateRecurringDeposit.from) && Intrinsics.areEqual(this.to, updateRecurringDeposit.to) && this.entryPoint == updateRecurringDeposit.entryPoint && Intrinsics.areEqual(this.entryPointLoggingIdentifier, updateRecurringDeposit.entryPointLoggingIdentifier) && this.originalFrequency == updateRecurringDeposit.originalFrequency && Intrinsics.areEqual(this.recurringDepositId, updateRecurringDeposit.recurringDepositId);
        }

        public int hashCode() {
            return (((((((((((((this.frequency.hashCode() * 31) + this.amount.hashCode()) * 31) + this.from.hashCode()) * 31) + this.to.hashCode()) * 31) + this.entryPoint.hashCode()) * 31) + this.entryPointLoggingIdentifier.hashCode()) * 31) + this.originalFrequency.hashCode()) * 31) + this.recurringDepositId.hashCode();
        }

        public String toString() {
            return "UpdateRecurringDeposit(frequency=" + this.frequency + ", amount=" + this.amount + ", from=" + this.from + ", to=" + this.to + ", entryPoint=" + this.entryPoint + ", entryPointLoggingIdentifier=" + this.entryPointLoggingIdentifier + ", originalFrequency=" + this.originalFrequency + ", recurringDepositId=" + this.recurringDepositId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.frequency.name());
            dest.writeSerializable(this.amount);
            this.from.writeToParcel(dest, flags);
            this.to.writeToParcel(dest, flags);
            dest.writeString(this.entryPoint.name());
            dest.writeString(this.entryPointLoggingIdentifier);
            dest.writeString(this.originalFrequency.name());
            dest.writeString(this.recurringDepositId);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public ApiCreateTransferRequest2 getFrequency() {
            return this.frequency;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public BigDecimal getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getFrom() {
            return this.from;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getTo() {
            return this.to;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ UpdateRecurringDeposit(ApiCreateTransferRequest2 apiCreateTransferRequest2, BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, MAXTransferContext.EntryPoint entryPoint, String str, ApiCreateTransferRequest2 apiCreateTransferRequest22, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str3;
            if ((i & 32) != 0) {
                String lowerCase = entryPoint.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                str3 = lowerCase;
            } else {
                str3 = str;
            }
            this(apiCreateTransferRequest2, bigDecimal, transferAccountSelection, transferAccountSelection2, entryPoint, str3, (i & 64) != 0 ? apiCreateTransferRequest2 : apiCreateTransferRequest22, str2);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        public final ApiCreateTransferRequest2 getOriginalFrequency() {
            return this.originalFrequency;
        }

        public final String getRecurringDepositId() {
            return this.recurringDepositId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateRecurringDeposit(ApiCreateTransferRequest2 frequency, BigDecimal amount, TransferAccountSelection from, TransferAccountSelection to, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, ApiCreateTransferRequest2 originalFrequency, String recurringDepositId) {
            super(amount, frequency, false, from, to, entryPoint, entryPointLoggingIdentifier, null, null, null, null, null, false, false, false, null, 65408, null);
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
            Intrinsics.checkNotNullParameter(originalFrequency, "originalFrequency");
            Intrinsics.checkNotNullParameter(recurringDepositId, "recurringDepositId");
            this.frequency = frequency;
            this.amount = amount;
            this.from = from;
            this.to = to;
            this.entryPoint = entryPoint;
            this.entryPointLoggingIdentifier = entryPointLoggingIdentifier;
            this.originalFrequency = originalFrequency;
            this.recurringDepositId = recurringDepositId;
        }
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J`\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020(HÖ\u0001J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$GoldApyBoostMinDeposit;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "from", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "to", "minDepositAmount", "", "minDepositRate", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Ljava/lang/Double;Ljava/lang/Double;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getFrom", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "getTo", "getMinDepositAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinDepositRate", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Ljava/lang/Double;Ljava/lang/Double;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;)Lcom/robinhood/android/transfers/contracts/TransferConfiguration$GoldApyBoostMinDeposit;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GoldApyBoostMinDeposit extends TransferConfiguration implements Parcelable {
        public static final Parcelable.Creator<GoldApyBoostMinDeposit> CREATOR = new Creator();
        private final BigDecimal amount;
        private final MAXTransferContext.EntryPoint entryPoint;
        private final String entryPointLoggingIdentifier;
        private final TransferAccountSelection from;
        private final Double minDepositAmount;
        private final Double minDepositRate;
        private final TransferAccountSelection to;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<GoldApyBoostMinDeposit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoldApyBoostMinDeposit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GoldApyBoostMinDeposit((BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : TransferAccountSelection.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TransferAccountSelection.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, MAXTransferContext.EntryPoint.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoldApyBoostMinDeposit[] newArray(int i) {
                return new GoldApyBoostMinDeposit[i];
            }
        }

        public GoldApyBoostMinDeposit() {
            this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }

        public static /* synthetic */ GoldApyBoostMinDeposit copy$default(GoldApyBoostMinDeposit goldApyBoostMinDeposit, BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, Double d, Double d2, MAXTransferContext.EntryPoint entryPoint, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = goldApyBoostMinDeposit.amount;
            }
            if ((i & 2) != 0) {
                transferAccountSelection = goldApyBoostMinDeposit.from;
            }
            if ((i & 4) != 0) {
                transferAccountSelection2 = goldApyBoostMinDeposit.to;
            }
            if ((i & 8) != 0) {
                d = goldApyBoostMinDeposit.minDepositAmount;
            }
            if ((i & 16) != 0) {
                d2 = goldApyBoostMinDeposit.minDepositRate;
            }
            if ((i & 32) != 0) {
                entryPoint = goldApyBoostMinDeposit.entryPoint;
            }
            if ((i & 64) != 0) {
                str = goldApyBoostMinDeposit.entryPointLoggingIdentifier;
            }
            MAXTransferContext.EntryPoint entryPoint2 = entryPoint;
            String str2 = str;
            Double d3 = d2;
            TransferAccountSelection transferAccountSelection3 = transferAccountSelection2;
            return goldApyBoostMinDeposit.copy(bigDecimal, transferAccountSelection, transferAccountSelection3, d, d3, entryPoint2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferAccountSelection getFrom() {
            return this.from;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferAccountSelection getTo() {
            return this.to;
        }

        /* renamed from: component4, reason: from getter */
        public final Double getMinDepositAmount() {
            return this.minDepositAmount;
        }

        /* renamed from: component5, reason: from getter */
        public final Double getMinDepositRate() {
            return this.minDepositRate;
        }

        /* renamed from: component6, reason: from getter */
        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component7, reason: from getter */
        public final String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        public final GoldApyBoostMinDeposit copy(BigDecimal amount, TransferAccountSelection from, TransferAccountSelection to, Double minDepositAmount, Double minDepositRate, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new GoldApyBoostMinDeposit(amount, from, to, minDepositAmount, minDepositRate, entryPoint, entryPointLoggingIdentifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GoldApyBoostMinDeposit)) {
                return false;
            }
            GoldApyBoostMinDeposit goldApyBoostMinDeposit = (GoldApyBoostMinDeposit) other;
            return Intrinsics.areEqual(this.amount, goldApyBoostMinDeposit.amount) && Intrinsics.areEqual(this.from, goldApyBoostMinDeposit.from) && Intrinsics.areEqual(this.to, goldApyBoostMinDeposit.to) && Intrinsics.areEqual((Object) this.minDepositAmount, (Object) goldApyBoostMinDeposit.minDepositAmount) && Intrinsics.areEqual((Object) this.minDepositRate, (Object) goldApyBoostMinDeposit.minDepositRate) && this.entryPoint == goldApyBoostMinDeposit.entryPoint && Intrinsics.areEqual(this.entryPointLoggingIdentifier, goldApyBoostMinDeposit.entryPointLoggingIdentifier);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.amount;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            TransferAccountSelection transferAccountSelection = this.from;
            int iHashCode2 = (iHashCode + (transferAccountSelection == null ? 0 : transferAccountSelection.hashCode())) * 31;
            TransferAccountSelection transferAccountSelection2 = this.to;
            int iHashCode3 = (iHashCode2 + (transferAccountSelection2 == null ? 0 : transferAccountSelection2.hashCode())) * 31;
            Double d = this.minDepositAmount;
            int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.minDepositRate;
            int iHashCode5 = (((iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31) + this.entryPoint.hashCode()) * 31;
            String str = this.entryPointLoggingIdentifier;
            return iHashCode5 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "GoldApyBoostMinDeposit(amount=" + this.amount + ", from=" + this.from + ", to=" + this.to + ", minDepositAmount=" + this.minDepositAmount + ", minDepositRate=" + this.minDepositRate + ", entryPoint=" + this.entryPoint + ", entryPointLoggingIdentifier=" + this.entryPointLoggingIdentifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.amount);
            TransferAccountSelection transferAccountSelection = this.from;
            if (transferAccountSelection == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection.writeToParcel(dest, flags);
            }
            TransferAccountSelection transferAccountSelection2 = this.to;
            if (transferAccountSelection2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferAccountSelection2.writeToParcel(dest, flags);
            }
            Double d = this.minDepositAmount;
            if (d == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d.doubleValue());
            }
            Double d2 = this.minDepositRate;
            if (d2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d2.doubleValue());
            }
            dest.writeString(this.entryPoint.name());
            dest.writeString(this.entryPointLoggingIdentifier);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public BigDecimal getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getFrom() {
            return this.from;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public TransferAccountSelection getTo() {
            return this.to;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public Double getMinDepositAmount() {
            return this.minDepositAmount;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public Double getMinDepositRate() {
            return this.minDepositRate;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ GoldApyBoostMinDeposit(BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, Double d, Double d2, MAXTransferContext.EntryPoint entryPoint, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            bigDecimal = (i & 1) != 0 ? null : bigDecimal;
            transferAccountSelection = (i & 2) != 0 ? null : transferAccountSelection;
            transferAccountSelection2 = (i & 4) != 0 ? null : transferAccountSelection2;
            d = (i & 8) != 0 ? null : d;
            d2 = (i & 16) != 0 ? null : d2;
            entryPoint = (i & 32) != 0 ? MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint;
            if ((i & 64) != 0) {
                str = entryPoint.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            this(bigDecimal, transferAccountSelection, transferAccountSelection2, d, d2, entryPoint, str);
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        @Override // com.robinhood.android.transfers.contracts.TransferConfiguration
        public String getEntryPointLoggingIdentifier() {
            return this.entryPointLoggingIdentifier;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoldApyBoostMinDeposit(BigDecimal bigDecimal, TransferAccountSelection transferAccountSelection, TransferAccountSelection transferAccountSelection2, Double d, Double d2, MAXTransferContext.EntryPoint entryPoint, String str) {
            super(bigDecimal, ApiCreateTransferRequest2.ONCE, false, transferAccountSelection, transferAccountSelection2, entryPoint, str, d, d2, null, null, null, false, false, false, null, 65024, null);
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.amount = bigDecimal;
            this.from = transferAccountSelection;
            this.to = transferAccountSelection2;
            this.minDepositAmount = d;
            this.minDepositRate = d2;
            this.entryPoint = entryPoint;
            this.entryPointLoggingIdentifier = str;
        }
    }

    public final boolean getShowConfirmationScreen() {
        if ((this instanceof Standard) || (this instanceof RadHook) || (this instanceof RecurringInsufficientBuyingPower) || (this instanceof PostDebitCardLinking) || (this instanceof Recommendations) || (this instanceof IraContribution) || (this instanceof RothConversion) || (this instanceof RadHookWithFrequency) || (this instanceof OutgoingWire) || (this instanceof PdtPrevention) || (this instanceof GoldApyBoostMinDeposit) || (this instanceof UpdateRecurringDeposit)) {
            return true;
        }
        if (this instanceof MarginDeposit) {
            return false;
        }
        if (this instanceof MarginCallPrevention) {
            return ((MarginCallPrevention) this).getShowConfirmation();
        }
        if (this instanceof MarginResolution) {
            return ((MarginResolution) this).getShowConfirmation();
        }
        if (!(this instanceof DayTradeCall)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((DayTradeCall) this).getShowConfirmation();
    }

    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "Landroid/os/Parcelable;", "id", "", "isFixed", "", "type", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;)V", "getId", "()Ljava/lang/String;", "()Z", "getType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransferAccountSelection implements Parcelable {
        public static final Parcelable.Creator<TransferAccountSelection> CREATOR = new Creator();
        private final String id;
        private final boolean isFixed;
        private final ApiTransferAccount.TransferAccountType type;

        /* compiled from: TransferConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<TransferAccountSelection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransferAccountSelection createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferAccountSelection(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : ApiTransferAccount.TransferAccountType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransferAccountSelection[] newArray(int i) {
                return new TransferAccountSelection[i];
            }
        }

        public TransferAccountSelection() {
            this(null, false, null, 7, null);
        }

        public static /* synthetic */ TransferAccountSelection copy$default(TransferAccountSelection transferAccountSelection, String str, boolean z, ApiTransferAccount.TransferAccountType transferAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transferAccountSelection.id;
            }
            if ((i & 2) != 0) {
                z = transferAccountSelection.isFixed;
            }
            if ((i & 4) != 0) {
                transferAccountType = transferAccountSelection.type;
            }
            return transferAccountSelection.copy(str, z, transferAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFixed() {
            return this.isFixed;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiTransferAccount.TransferAccountType getType() {
            return this.type;
        }

        public final TransferAccountSelection copy(String id, boolean isFixed, ApiTransferAccount.TransferAccountType type2) {
            return new TransferAccountSelection(id, isFixed, type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransferAccountSelection)) {
                return false;
            }
            TransferAccountSelection transferAccountSelection = (TransferAccountSelection) other;
            return Intrinsics.areEqual(this.id, transferAccountSelection.id) && this.isFixed == transferAccountSelection.isFixed && this.type == transferAccountSelection.type;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isFixed)) * 31;
            ApiTransferAccount.TransferAccountType transferAccountType = this.type;
            return iHashCode + (transferAccountType != null ? transferAccountType.hashCode() : 0);
        }

        public String toString() {
            return "TransferAccountSelection(id=" + this.id + ", isFixed=" + this.isFixed + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeInt(this.isFixed ? 1 : 0);
            ApiTransferAccount.TransferAccountType transferAccountType = this.type;
            if (transferAccountType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferAccountType.name());
            }
        }

        public TransferAccountSelection(String str, boolean z, ApiTransferAccount.TransferAccountType transferAccountType) {
            this.id = str;
            this.isFixed = z;
            this.type = transferAccountType;
        }

        public /* synthetic */ TransferAccountSelection(String str, boolean z, ApiTransferAccount.TransferAccountType transferAccountType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : transferAccountType);
        }

        public final String getId() {
            return this.id;
        }

        public final boolean isFixed() {
            return this.isFixed;
        }

        public final ApiTransferAccount.TransferAccountType getType() {
            return this.type;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferOverlayTheme;", "", "<init>", "(Ljava/lang/String;I)V", "ACHROMATIC", "NEGATIVE", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransferOverlayTheme {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferOverlayTheme[] $VALUES;
        public static final TransferOverlayTheme ACHROMATIC = new TransferOverlayTheme("ACHROMATIC", 0);
        public static final TransferOverlayTheme NEGATIVE = new TransferOverlayTheme("NEGATIVE", 1);

        private static final /* synthetic */ TransferOverlayTheme[] $values() {
            return new TransferOverlayTheme[]{ACHROMATIC, NEGATIVE};
        }

        public static EnumEntries<TransferOverlayTheme> getEntries() {
            return $ENTRIES;
        }

        private TransferOverlayTheme(String str, int i) {
        }

        static {
            TransferOverlayTheme[] transferOverlayThemeArr$values = $values();
            $VALUES = transferOverlayThemeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferOverlayThemeArr$values);
        }

        public static TransferOverlayTheme valueOf(String str) {
            return (TransferOverlayTheme) Enum.valueOf(TransferOverlayTheme.class, str);
        }

        public static TransferOverlayTheme[] values() {
            return (TransferOverlayTheme[]) $VALUES.clone();
        }
    }
}
