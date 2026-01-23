package com.robinhood.android.common.recurring.schedule;

import android.content.res.Resources;
import android.text.Spanned;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.StringsKt;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment;
import com.robinhood.android.common.util.NumberUtils;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.converters.recurring.Recurring2;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import p479j$.time.LocalDate;

/* compiled from: RecurringOrderScheduleViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 u2\u00020\u0001:\u0005vwxyuB\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0015HÂ\u0003¢\u0006\u0004\b \u0010!J\u0015\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b'\u0010&J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u0010&J\u0015\u0010,\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b,\u0010&J\u0015\u0010-\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b-\u0010&J\u0017\u0010.\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b.\u0010&J\u0010\u0010/\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0096\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bA\u00108J\u0010\u0010C\u001a\u00020BHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010F\u001a\u00020\u00042\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010HR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010IR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bM\u00102R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010IR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010N\u001a\u0004\bO\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010P\u001a\u0004\bQ\u00106R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010R\u001a\u0004\bS\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010T\u001a\u0004\bU\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bW\u0010<R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010XR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010Y\u001a\u0004\bZ\u0010>R\u0017\u0010\\\u001a\u00020[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u001eR\u0013\u0010e\u001a\u0004\u0018\u00010b8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0013\u0010i\u001a\u0004\u0018\u00010f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0011\u0010m\u001a\u00020j8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0011\u0010p\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0011\u0010q\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bq\u0010\u001eR\u0011\u0010r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\br\u0010\u001eR\u0011\u0010s\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bs\u0010\u001eR\u0011\u0010t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bt\u0010\u001e¨\u0006z"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState;", "", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "assetType", "", "usingCustomStartDate", "j$/time/LocalDate", "nextInvestmentDate", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args;", "actionType", "hasDirectDepositRelationships", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult;", "result", "", "loggingReferrer", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "loggingEntryPoint", "Landroid/text/Spanned;", "cryptoOrderTimingDisclosure", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "rhyAccount", "Lokhttp3/HttpUrl;", "prospectusUrl", "<init>", "(Lcom/robinhood/recurring/models/api/ApiAssetType;ZLj$/time/LocalDate;Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args;ZLcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;Landroid/text/Spanned;Lcom/robinhood/models/db/bonfire/RhyAccount;Lokhttp3/HttpUrl;)V", "component1", "()Lcom/robinhood/recurring/models/api/ApiAssetType;", "component2", "()Z", "component5", "component11", "()Lcom/robinhood/models/db/bonfire/RhyAccount;", "Landroid/content/res/Resources;", "resources", "", "getDailyPrimaryText", "(Landroid/content/res/Resources;)Ljava/lang/CharSequence;", "getDailySecondaryText", "instrumentSymbol", "getProspectusTitle", "(Landroid/content/res/Resources;Ljava/lang/String;)Ljava/lang/String;", "getWeeklySecondaryText", "getBiweeklySecondaryText", "getMonthlySecondaryText", "getDisclaimerText", "component3", "()Lj$/time/LocalDate;", "component4", "()Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args;", "component6", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component7", "()Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult;", "component8", "()Ljava/lang/String;", "component9", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "component10", "()Landroid/text/Spanned;", "component12", "()Lokhttp3/HttpUrl;", "copy", "(Lcom/robinhood/recurring/models/api/ApiAssetType;ZLj$/time/LocalDate;Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args;ZLcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;Landroid/text/Spanned;Lcom/robinhood/models/db/bonfire/RhyAccount;Lokhttp3/HttpUrl;)Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "Z", "Lj$/time/LocalDate;", "getNextInvestmentDate", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args;", "getActionType", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult;", "getResult", "Ljava/lang/String;", "getLoggingReferrer", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "getLoggingEntryPoint", "Landroid/text/Spanned;", "getCryptoOrderTimingDisclosure", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "Lokhttp3/HttpUrl;", "getProspectusUrl", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "getUpdatePending", "updatePending", "Ljava/util/UUID;", "getInvestmentScheduleId", "()Ljava/util/UUID;", "investmentScheduleId", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateNextInvestmentDateForHook;", "getUpdateNextInvestmentDateForHook", "()Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateNextInvestmentDateForHook;", "updateNextInvestmentDateForHook", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState;", "getContinueButtonState", "()Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState;", "continueButtonState", "getFormattedNextInvestmentDate", "()Ljava/lang/CharSequence;", "formattedNextInvestmentDate", "isPaycheckNextOrderDateVisible", "isNextOrderDateVisible", "isPaycheckFrequencyRowVisible", "isProspectusActionVisible", "Companion", "UpdateNextInvestmentDateForHook", "InvestmentScheduleUpdate", "ContinueButtonState", "UpdateInvestmentScheduleResult", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class RecurringOrderScheduleViewState {
    private static final int DAY_OF_MONTH_31 = 31;
    private final RecurringOrderScheduleFragment.Args actionType;
    private final ApiAssetType assetType;
    private final Spanned cryptoOrderTimingDisclosure;
    private final ApiInvestmentSchedule.Frequency frequency;
    private final boolean hasDirectDepositRelationships;
    private final RecurringContext loggingContext;
    private final RecurringContext.EntryPoint loggingEntryPoint;
    private final String loggingReferrer;
    private final LocalDate nextInvestmentDate;
    private final HttpUrl prospectusUrl;
    private final UpdateInvestmentScheduleResult result;
    private final RhyAccount rhyAccount;
    private final boolean usingCustomStartDate;
    public static final int $stable = 8;

    /* compiled from: RecurringOrderScheduleViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final ApiAssetType getAssetType() {
        return this.assetType;
    }

    /* renamed from: component11, reason: from getter */
    private final RhyAccount getRhyAccount() {
        return this.rhyAccount;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getUsingCustomStartDate() {
        return this.usingCustomStartDate;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getHasDirectDepositRelationships() {
        return this.hasDirectDepositRelationships;
    }

    public static /* synthetic */ RecurringOrderScheduleViewState copy$default(RecurringOrderScheduleViewState recurringOrderScheduleViewState, ApiAssetType apiAssetType, boolean z, LocalDate localDate, RecurringOrderScheduleFragment.Args args, boolean z2, ApiInvestmentSchedule.Frequency frequency, UpdateInvestmentScheduleResult updateInvestmentScheduleResult, String str, RecurringContext.EntryPoint entryPoint, Spanned spanned, RhyAccount rhyAccount, HttpUrl httpUrl, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAssetType = recurringOrderScheduleViewState.assetType;
        }
        if ((i & 2) != 0) {
            z = recurringOrderScheduleViewState.usingCustomStartDate;
        }
        if ((i & 4) != 0) {
            localDate = recurringOrderScheduleViewState.nextInvestmentDate;
        }
        if ((i & 8) != 0) {
            args = recurringOrderScheduleViewState.actionType;
        }
        if ((i & 16) != 0) {
            z2 = recurringOrderScheduleViewState.hasDirectDepositRelationships;
        }
        if ((i & 32) != 0) {
            frequency = recurringOrderScheduleViewState.frequency;
        }
        if ((i & 64) != 0) {
            updateInvestmentScheduleResult = recurringOrderScheduleViewState.result;
        }
        if ((i & 128) != 0) {
            str = recurringOrderScheduleViewState.loggingReferrer;
        }
        if ((i & 256) != 0) {
            entryPoint = recurringOrderScheduleViewState.loggingEntryPoint;
        }
        if ((i & 512) != 0) {
            spanned = recurringOrderScheduleViewState.cryptoOrderTimingDisclosure;
        }
        if ((i & 1024) != 0) {
            rhyAccount = recurringOrderScheduleViewState.rhyAccount;
        }
        if ((i & 2048) != 0) {
            httpUrl = recurringOrderScheduleViewState.prospectusUrl;
        }
        RhyAccount rhyAccount2 = rhyAccount;
        HttpUrl httpUrl2 = httpUrl;
        RecurringContext.EntryPoint entryPoint2 = entryPoint;
        Spanned spanned2 = spanned;
        UpdateInvestmentScheduleResult updateInvestmentScheduleResult2 = updateInvestmentScheduleResult;
        String str2 = str;
        boolean z3 = z2;
        ApiInvestmentSchedule.Frequency frequency2 = frequency;
        return recurringOrderScheduleViewState.copy(apiAssetType, z, localDate, args, z3, frequency2, updateInvestmentScheduleResult2, str2, entryPoint2, spanned2, rhyAccount2, httpUrl2);
    }

    /* renamed from: component10, reason: from getter */
    public final Spanned getCryptoOrderTimingDisclosure() {
        return this.cryptoOrderTimingDisclosure;
    }

    /* renamed from: component12, reason: from getter */
    public final HttpUrl getProspectusUrl() {
        return this.prospectusUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final LocalDate getNextInvestmentDate() {
        return this.nextInvestmentDate;
    }

    /* renamed from: component4, reason: from getter */
    public final RecurringOrderScheduleFragment.Args getActionType() {
        return this.actionType;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    /* renamed from: component7, reason: from getter */
    public final UpdateInvestmentScheduleResult getResult() {
        return this.result;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLoggingReferrer() {
        return this.loggingReferrer;
    }

    /* renamed from: component9, reason: from getter */
    public final RecurringContext.EntryPoint getLoggingEntryPoint() {
        return this.loggingEntryPoint;
    }

    public final RecurringOrderScheduleViewState copy(ApiAssetType assetType, boolean usingCustomStartDate, LocalDate nextInvestmentDate, RecurringOrderScheduleFragment.Args actionType, boolean hasDirectDepositRelationships, ApiInvestmentSchedule.Frequency frequency, UpdateInvestmentScheduleResult result, String loggingReferrer, RecurringContext.EntryPoint loggingEntryPoint, Spanned cryptoOrderTimingDisclosure, RhyAccount rhyAccount, HttpUrl prospectusUrl) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        Intrinsics.checkNotNullParameter(loggingReferrer, "loggingReferrer");
        return new RecurringOrderScheduleViewState(assetType, usingCustomStartDate, nextInvestmentDate, actionType, hasDirectDepositRelationships, frequency, result, loggingReferrer, loggingEntryPoint, cryptoOrderTimingDisclosure, rhyAccount, prospectusUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderScheduleViewState)) {
            return false;
        }
        RecurringOrderScheduleViewState recurringOrderScheduleViewState = (RecurringOrderScheduleViewState) other;
        return this.assetType == recurringOrderScheduleViewState.assetType && this.usingCustomStartDate == recurringOrderScheduleViewState.usingCustomStartDate && Intrinsics.areEqual(this.nextInvestmentDate, recurringOrderScheduleViewState.nextInvestmentDate) && Intrinsics.areEqual(this.actionType, recurringOrderScheduleViewState.actionType) && this.hasDirectDepositRelationships == recurringOrderScheduleViewState.hasDirectDepositRelationships && this.frequency == recurringOrderScheduleViewState.frequency && Intrinsics.areEqual(this.result, recurringOrderScheduleViewState.result) && Intrinsics.areEqual(this.loggingReferrer, recurringOrderScheduleViewState.loggingReferrer) && this.loggingEntryPoint == recurringOrderScheduleViewState.loggingEntryPoint && Intrinsics.areEqual(this.cryptoOrderTimingDisclosure, recurringOrderScheduleViewState.cryptoOrderTimingDisclosure) && Intrinsics.areEqual(this.rhyAccount, recurringOrderScheduleViewState.rhyAccount) && Intrinsics.areEqual(this.prospectusUrl, recurringOrderScheduleViewState.prospectusUrl);
    }

    public int hashCode() {
        int iHashCode = ((((this.assetType.hashCode() * 31) + Boolean.hashCode(this.usingCustomStartDate)) * 31) + this.nextInvestmentDate.hashCode()) * 31;
        RecurringOrderScheduleFragment.Args args = this.actionType;
        int iHashCode2 = (((iHashCode + (args == null ? 0 : args.hashCode())) * 31) + Boolean.hashCode(this.hasDirectDepositRelationships)) * 31;
        ApiInvestmentSchedule.Frequency frequency = this.frequency;
        int iHashCode3 = (iHashCode2 + (frequency == null ? 0 : frequency.hashCode())) * 31;
        UpdateInvestmentScheduleResult updateInvestmentScheduleResult = this.result;
        int iHashCode4 = (((iHashCode3 + (updateInvestmentScheduleResult == null ? 0 : updateInvestmentScheduleResult.hashCode())) * 31) + this.loggingReferrer.hashCode()) * 31;
        RecurringContext.EntryPoint entryPoint = this.loggingEntryPoint;
        int iHashCode5 = (iHashCode4 + (entryPoint == null ? 0 : entryPoint.hashCode())) * 31;
        Spanned spanned = this.cryptoOrderTimingDisclosure;
        int iHashCode6 = (iHashCode5 + (spanned == null ? 0 : spanned.hashCode())) * 31;
        RhyAccount rhyAccount = this.rhyAccount;
        int iHashCode7 = (iHashCode6 + (rhyAccount == null ? 0 : rhyAccount.hashCode())) * 31;
        HttpUrl httpUrl = this.prospectusUrl;
        return iHashCode7 + (httpUrl != null ? httpUrl.hashCode() : 0);
    }

    public String toString() {
        ApiAssetType apiAssetType = this.assetType;
        boolean z = this.usingCustomStartDate;
        LocalDate localDate = this.nextInvestmentDate;
        RecurringOrderScheduleFragment.Args args = this.actionType;
        boolean z2 = this.hasDirectDepositRelationships;
        ApiInvestmentSchedule.Frequency frequency = this.frequency;
        UpdateInvestmentScheduleResult updateInvestmentScheduleResult = this.result;
        String str = this.loggingReferrer;
        RecurringContext.EntryPoint entryPoint = this.loggingEntryPoint;
        Spanned spanned = this.cryptoOrderTimingDisclosure;
        return "RecurringOrderScheduleViewState(assetType=" + apiAssetType + ", usingCustomStartDate=" + z + ", nextInvestmentDate=" + localDate + ", actionType=" + args + ", hasDirectDepositRelationships=" + z2 + ", frequency=" + frequency + ", result=" + updateInvestmentScheduleResult + ", loggingReferrer=" + str + ", loggingEntryPoint=" + entryPoint + ", cryptoOrderTimingDisclosure=" + ((Object) spanned) + ", rhyAccount=" + this.rhyAccount + ", prospectusUrl=" + this.prospectusUrl + ")";
    }

    public RecurringOrderScheduleViewState(ApiAssetType assetType, boolean z, LocalDate nextInvestmentDate, RecurringOrderScheduleFragment.Args args, boolean z2, ApiInvestmentSchedule.Frequency frequency, UpdateInvestmentScheduleResult updateInvestmentScheduleResult, String loggingReferrer, RecurringContext.EntryPoint entryPoint, Spanned spanned, RhyAccount rhyAccount, HttpUrl httpUrl) {
        RecurringContext.FlowType flowType;
        RecurringContext.EntryPoint entryPoint2 = entryPoint;
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        Intrinsics.checkNotNullParameter(loggingReferrer, "loggingReferrer");
        this.assetType = assetType;
        this.usingCustomStartDate = z;
        this.nextInvestmentDate = nextInvestmentDate;
        this.actionType = args;
        this.hasDirectDepositRelationships = z2;
        this.frequency = frequency;
        this.result = updateInvestmentScheduleResult;
        this.loggingReferrer = loggingReferrer;
        this.loggingEntryPoint = entryPoint2;
        this.cryptoOrderTimingDisclosure = spanned;
        this.rhyAccount = rhyAccount;
        this.prospectusUrl = httpUrl;
        if (args instanceof RecurringOrderScheduleFragment.Args.Edit) {
            flowType = RecurringContext.FlowType.EDIT;
        } else if (args instanceof RecurringOrderScheduleFragment.Args.Create) {
            flowType = RecurringContext.FlowType.CREATE;
        } else {
            if (args != null) {
                throw new NoWhenBranchMatchedException();
            }
            flowType = RecurringContext.FlowType.FLOW_TYPE_UNSPECIFIED;
        }
        this.loggingContext = new RecurringContext(flowType, entryPoint2 == null ? RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint2, loggingReferrer, Recurring2.toProtobuf(frequency), null, 0.0d, Recurring2.toProtobuf(assetType), null, 0.0d, null, null, 1968, null);
    }

    public /* synthetic */ RecurringOrderScheduleViewState(ApiAssetType apiAssetType, boolean z, LocalDate localDate, RecurringOrderScheduleFragment.Args args, boolean z2, ApiInvestmentSchedule.Frequency frequency, UpdateInvestmentScheduleResult updateInvestmentScheduleResult, String str, RecurringContext.EntryPoint entryPoint, Spanned spanned, RhyAccount rhyAccount, HttpUrl httpUrl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiAssetType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? InvestFlowFrequency.Companion.defaultInvestmentStartDate$default(InvestFlowFrequency.INSTANCE, null, 1, null) : localDate, (i & 8) != 0 ? null : args, (i & 16) == 0 ? z2 : false, (i & 32) != 0 ? null : frequency, (i & 64) != 0 ? null : updateInvestmentScheduleResult, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? null : entryPoint, (i & 512) != 0 ? null : spanned, (i & 1024) != 0 ? null : rhyAccount, (i & 2048) != 0 ? null : httpUrl);
    }

    public final LocalDate getNextInvestmentDate() {
        return this.nextInvestmentDate;
    }

    public final RecurringOrderScheduleFragment.Args getActionType() {
        return this.actionType;
    }

    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final UpdateInvestmentScheduleResult getResult() {
        return this.result;
    }

    public final String getLoggingReferrer() {
        return this.loggingReferrer;
    }

    public final RecurringContext.EntryPoint getLoggingEntryPoint() {
        return this.loggingEntryPoint;
    }

    public final Spanned getCryptoOrderTimingDisclosure() {
        return this.cryptoOrderTimingDisclosure;
    }

    public final HttpUrl getProspectusUrl() {
        return this.prospectusUrl;
    }

    public final UUID getInvestmentScheduleId() {
        RecurringOrderScheduleFragment.Args args = this.actionType;
        if (args instanceof RecurringOrderScheduleFragment.Args.Edit) {
            return ((RecurringOrderScheduleFragment.Args.Edit) args).getInvestmentScheduleId();
        }
        if ((args instanceof RecurringOrderScheduleFragment.Args.Create) || args == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final UpdateNextInvestmentDateForHook getUpdateNextInvestmentDateForHook() {
        RecurringOrderScheduleFragment.Args args = this.actionType;
        if (args instanceof RecurringOrderScheduleFragment.Args.Create) {
            if (!((RecurringOrderScheduleFragment.Args.Create) args).getIsFromHook() || this.frequency == null || this.usingCustomStartDate) {
                return null;
            }
            return new UpdateNextInvestmentDateForHook(this.frequency);
        }
        if ((args instanceof RecurringOrderScheduleFragment.Args.Edit) || args == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ContinueButtonState getContinueButtonState() {
        if (this.actionType != null && this.frequency != null) {
            if (getUpdatePending()) {
                return ContinueButtonState.Loading.INSTANCE;
            }
            RecurringOrderScheduleFragment.Args args = this.actionType;
            if (args instanceof RecurringOrderScheduleFragment.Args.Create) {
                return new ContinueButtonState.Complete(this.nextInvestmentDate, this.frequency);
            }
            if (!(args instanceof RecurringOrderScheduleFragment.Args.Edit)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z = this.frequency != ((RecurringOrderScheduleFragment.Args.Edit) args).getFrequency();
            boolean zAreEqual = Intrinsics.areEqual(this.nextInvestmentDate, ((RecurringOrderScheduleFragment.Args.Edit) this.actionType).getNextInvestmentDate());
            if (z || !zAreEqual) {
                return new ContinueButtonState.ShowEditConfirmationDialog(this.nextInvestmentDate, ((RecurringOrderScheduleFragment.Args.Edit) this.actionType).getFrequency(), this.frequency, this.assetType.isCrypto());
            }
            return new ContinueButtonState.Complete(this.nextInvestmentDate, this.frequency);
        }
        return ContinueButtonState.Disabled.INSTANCE;
    }

    public final CharSequence getDailyPrimaryText(Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this.assetType.isCrypto()) {
            i = C11595R.string.investment_schedule_frequency_daily_crypto;
        } else {
            i = C11595R.string.investment_schedule_frequency_daily;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final CharSequence getDailySecondaryText(Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this.assetType.isCrypto()) {
            i = C11595R.string.equity_recurring_schedule_daily_crypto_subtitle;
        } else {
            i = C11595R.string.equity_recurring_schedule_daily_subtitle;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final CharSequence getFormattedNextInvestmentDate() {
        return LocalDateFormatter.SHORT_WEEKDAY_WITH_YEAR.format((LocalDateFormatter) this.nextInvestmentDate);
    }

    public final RecurringContext getLoggingContext() {
        return this.loggingContext;
    }

    private final boolean getUpdatePending() {
        UpdateInvestmentScheduleResult updateInvestmentScheduleResult = this.result;
        if (Intrinsics.areEqual(updateInvestmentScheduleResult, UpdateInvestmentScheduleResult.Loading.INSTANCE)) {
            return true;
        }
        if ((updateInvestmentScheduleResult instanceof UpdateInvestmentScheduleResult.Success) || (updateInvestmentScheduleResult instanceof UpdateInvestmentScheduleResult.Failure) || updateInvestmentScheduleResult == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isPaycheckNextOrderDateVisible() {
        return this.frequency == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK;
    }

    public final boolean isNextOrderDateVisible() {
        return this.frequency != ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK;
    }

    public final boolean isPaycheckFrequencyRowVisible() {
        return getInvestmentScheduleId() == null && this.hasDirectDepositRelationships && this.rhyAccount != null;
    }

    public final boolean isProspectusActionVisible() {
        return (this.actionType instanceof RecurringOrderScheduleFragment.Args.Create) && this.loggingEntryPoint == RecurringContext.EntryPoint.RECURRING_HUB && this.prospectusUrl != null;
    }

    public final String getProspectusTitle(Resources resources, String instrumentSymbol) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C11595R.string.prospectus_btn, instrumentSymbol);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final CharSequence getWeeklySecondaryText(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C11595R.string.equity_recurring_schedule_weekly_subtitle, LocalDateFormatter.WEEKDAY_ONLY.format((LocalDateFormatter) this.nextInvestmentDate));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final CharSequence getBiweeklySecondaryText(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C11595R.string.equity_recurring_schedule_biweekly_subtitle, LocalDateFormatter.WEEKDAY_ONLY.format((LocalDateFormatter) this.nextInvestmentDate));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final CharSequence getMonthlySecondaryText(Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (LocalDate.now().getDayOfMonth() == 31) {
            i = C11595R.string.equity_recurring_schedule_monthly_subtitle_31_days;
        } else {
            i = C11595R.string.equity_recurring_schedule_monthly_subtitle;
        }
        String string2 = resources.getString(i, NumberUtils.getDayOfMonthOrdinalString(this.nextInvestmentDate));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final CharSequence getDisclaimerText(Resources resources) {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this.assetType.isCrypto()) {
            return this.cryptoOrderTimingDisclosure;
        }
        ApiInvestmentSchedule.Frequency frequency = this.frequency;
        if (frequency == null) {
            return null;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i2 == 1) {
            i = C11595R.string.equity_recurring_schedule_disclaimer_daily;
        } else {
            if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11595R.string.equity_recurring_schedule_disclaimer_other;
        }
        return resources.getString(i);
    }

    /* compiled from: RecurringOrderScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateNextInvestmentDateForHook;", "", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "<init>", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateNextInvestmentDateForHook {
        public static final int $stable = 0;
        private final ApiInvestmentSchedule.Frequency frequency;

        public static /* synthetic */ UpdateNextInvestmentDateForHook copy$default(UpdateNextInvestmentDateForHook updateNextInvestmentDateForHook, ApiInvestmentSchedule.Frequency frequency, int i, Object obj) {
            if ((i & 1) != 0) {
                frequency = updateNextInvestmentDateForHook.frequency;
            }
            return updateNextInvestmentDateForHook.copy(frequency);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public final UpdateNextInvestmentDateForHook copy(ApiInvestmentSchedule.Frequency frequency) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            return new UpdateNextInvestmentDateForHook(frequency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateNextInvestmentDateForHook) && this.frequency == ((UpdateNextInvestmentDateForHook) other).frequency;
        }

        public int hashCode() {
            return this.frequency.hashCode();
        }

        public String toString() {
            return "UpdateNextInvestmentDateForHook(frequency=" + this.frequency + ")";
        }

        public UpdateNextInvestmentDateForHook(ApiInvestmentSchedule.Frequency frequency) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            this.frequency = frequency;
        }

        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }
    }

    /* compiled from: RecurringOrderScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$InvestmentScheduleUpdate;", "", "j$/time/LocalDate", InquiryField.DateField.TYPE, "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "<init>", "(Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "component1", "()Lj$/time/LocalDate;", "component2", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "copy", "(Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$InvestmentScheduleUpdate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "getDate", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InvestmentScheduleUpdate {
        public static final int $stable = 8;
        private final LocalDate date;
        private final ApiInvestmentSchedule.Frequency frequency;

        public static /* synthetic */ InvestmentScheduleUpdate copy$default(InvestmentScheduleUpdate investmentScheduleUpdate, LocalDate localDate, ApiInvestmentSchedule.Frequency frequency, int i, Object obj) {
            if ((i & 1) != 0) {
                localDate = investmentScheduleUpdate.date;
            }
            if ((i & 2) != 0) {
                frequency = investmentScheduleUpdate.frequency;
            }
            return investmentScheduleUpdate.copy(localDate, frequency);
        }

        /* renamed from: component1, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public final InvestmentScheduleUpdate copy(LocalDate date, ApiInvestmentSchedule.Frequency frequency) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            return new InvestmentScheduleUpdate(date, frequency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvestmentScheduleUpdate)) {
                return false;
            }
            InvestmentScheduleUpdate investmentScheduleUpdate = (InvestmentScheduleUpdate) other;
            return Intrinsics.areEqual(this.date, investmentScheduleUpdate.date) && this.frequency == investmentScheduleUpdate.frequency;
        }

        public int hashCode() {
            return (this.date.hashCode() * 31) + this.frequency.hashCode();
        }

        public String toString() {
            return "InvestmentScheduleUpdate(date=" + this.date + ", frequency=" + this.frequency + ")";
        }

        public InvestmentScheduleUpdate(LocalDate date, ApiInvestmentSchedule.Frequency frequency) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            this.date = date;
            this.frequency = frequency;
        }

        public final LocalDate getDate() {
            return this.date;
        }

        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }
    }

    /* compiled from: RecurringOrderScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState;", "", "<init>", "()V", "isLoading", "", "()Z", "isEnabled", "Disabled", "Loading", "Complete", "ShowEditConfirmationDialog", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState$Complete;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState$Disabled;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState$Loading;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState$ShowEditConfirmationDialog;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ContinueButtonState {
        public static final int $stable = 0;

        public /* synthetic */ ContinueButtonState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ContinueButtonState() {
        }

        public final boolean isLoading() {
            if (Intrinsics.areEqual(this, Loading.INSTANCE)) {
                return true;
            }
            if (Intrinsics.areEqual(this, Disabled.INSTANCE) || (this instanceof Complete) || (this instanceof ShowEditConfirmationDialog)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean isEnabled() {
            if (Intrinsics.areEqual(this, Loading.INSTANCE) || Intrinsics.areEqual(this, Disabled.INSTANCE)) {
                return false;
            }
            if ((this instanceof Complete) || (this instanceof ShowEditConfirmationDialog)) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* compiled from: RecurringOrderScheduleViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState$Disabled;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Disabled extends ContinueButtonState {
            public static final int $stable = 0;
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super(null);
            }
        }

        /* compiled from: RecurringOrderScheduleViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState$Loading;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends ContinueButtonState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        /* compiled from: RecurringOrderScheduleViewState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState$Complete;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState;", "j$/time/LocalDate", InquiryField.DateField.TYPE, "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "<init>", "(Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "component1", "()Lj$/time/LocalDate;", "component2", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "copy", "(Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState$Complete;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "getDate", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Complete extends ContinueButtonState {
            public static final int $stable = 8;
            private final LocalDate date;
            private final ApiInvestmentSchedule.Frequency frequency;

            public static /* synthetic */ Complete copy$default(Complete complete, LocalDate localDate, ApiInvestmentSchedule.Frequency frequency, int i, Object obj) {
                if ((i & 1) != 0) {
                    localDate = complete.date;
                }
                if ((i & 2) != 0) {
                    frequency = complete.frequency;
                }
                return complete.copy(localDate, frequency);
            }

            /* renamed from: component1, reason: from getter */
            public final LocalDate getDate() {
                return this.date;
            }

            /* renamed from: component2, reason: from getter */
            public final ApiInvestmentSchedule.Frequency getFrequency() {
                return this.frequency;
            }

            public final Complete copy(LocalDate date, ApiInvestmentSchedule.Frequency frequency) {
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                return new Complete(date, frequency);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Complete)) {
                    return false;
                }
                Complete complete = (Complete) other;
                return Intrinsics.areEqual(this.date, complete.date) && this.frequency == complete.frequency;
            }

            public int hashCode() {
                return (this.date.hashCode() * 31) + this.frequency.hashCode();
            }

            public String toString() {
                return "Complete(date=" + this.date + ", frequency=" + this.frequency + ")";
            }

            public final LocalDate getDate() {
                return this.date;
            }

            public final ApiInvestmentSchedule.Frequency getFrequency() {
                return this.frequency;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Complete(LocalDate date, ApiInvestmentSchedule.Frequency frequency) {
                super(null);
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                this.date = date;
                this.frequency = frequency;
            }
        }

        /* compiled from: RecurringOrderScheduleViewState.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState$ShowEditConfirmationDialog;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState;", "j$/time/LocalDate", "nextInvestmentDate", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "initialFrequency", "frequency", "", "isCrypto", "<init>", "(Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Z)V", "component1", "()Lj$/time/LocalDate;", "component2", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component3", "component4", "()Z", "Landroid/content/res/Resources;", "resources", "", "getMessage", "(Landroid/content/res/Resources;)Ljava/lang/CharSequence;", "copy", "(Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Z)Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState$ShowEditConfirmationDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "Z", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowEditConfirmationDialog extends ContinueButtonState {
            public static final int $stable = 8;
            private final ApiInvestmentSchedule.Frequency frequency;
            private final ApiInvestmentSchedule.Frequency initialFrequency;
            private final boolean isCrypto;
            private final LocalDate nextInvestmentDate;

            /* renamed from: component1, reason: from getter */
            private final LocalDate getNextInvestmentDate() {
                return this.nextInvestmentDate;
            }

            /* renamed from: component2, reason: from getter */
            private final ApiInvestmentSchedule.Frequency getInitialFrequency() {
                return this.initialFrequency;
            }

            /* renamed from: component3, reason: from getter */
            private final ApiInvestmentSchedule.Frequency getFrequency() {
                return this.frequency;
            }

            /* renamed from: component4, reason: from getter */
            private final boolean getIsCrypto() {
                return this.isCrypto;
            }

            public static /* synthetic */ ShowEditConfirmationDialog copy$default(ShowEditConfirmationDialog showEditConfirmationDialog, LocalDate localDate, ApiInvestmentSchedule.Frequency frequency, ApiInvestmentSchedule.Frequency frequency2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    localDate = showEditConfirmationDialog.nextInvestmentDate;
                }
                if ((i & 2) != 0) {
                    frequency = showEditConfirmationDialog.initialFrequency;
                }
                if ((i & 4) != 0) {
                    frequency2 = showEditConfirmationDialog.frequency;
                }
                if ((i & 8) != 0) {
                    z = showEditConfirmationDialog.isCrypto;
                }
                return showEditConfirmationDialog.copy(localDate, frequency, frequency2, z);
            }

            public final ShowEditConfirmationDialog copy(LocalDate nextInvestmentDate, ApiInvestmentSchedule.Frequency initialFrequency, ApiInvestmentSchedule.Frequency frequency, boolean isCrypto) {
                Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
                Intrinsics.checkNotNullParameter(initialFrequency, "initialFrequency");
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                return new ShowEditConfirmationDialog(nextInvestmentDate, initialFrequency, frequency, isCrypto);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowEditConfirmationDialog)) {
                    return false;
                }
                ShowEditConfirmationDialog showEditConfirmationDialog = (ShowEditConfirmationDialog) other;
                return Intrinsics.areEqual(this.nextInvestmentDate, showEditConfirmationDialog.nextInvestmentDate) && this.initialFrequency == showEditConfirmationDialog.initialFrequency && this.frequency == showEditConfirmationDialog.frequency && this.isCrypto == showEditConfirmationDialog.isCrypto;
            }

            public int hashCode() {
                return (((((this.nextInvestmentDate.hashCode() * 31) + this.initialFrequency.hashCode()) * 31) + this.frequency.hashCode()) * 31) + Boolean.hashCode(this.isCrypto);
            }

            public String toString() {
                return "ShowEditConfirmationDialog(nextInvestmentDate=" + this.nextInvestmentDate + ", initialFrequency=" + this.initialFrequency + ", frequency=" + this.frequency + ", isCrypto=" + this.isCrypto + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowEditConfirmationDialog(LocalDate nextInvestmentDate, ApiInvestmentSchedule.Frequency initialFrequency, ApiInvestmentSchedule.Frequency frequency, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
                Intrinsics.checkNotNullParameter(initialFrequency, "initialFrequency");
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                this.nextInvestmentDate = nextInvestmentDate;
                this.initialFrequency = initialFrequency;
                this.frequency = frequency;
                this.isCrypto = z;
            }

            public final CharSequence getMessage(Resources resources) throws Resources.NotFoundException {
                int descriptionResId;
                Intrinsics.checkNotNullParameter(resources, "resources");
                String recent = LocalDates4.formatRecent(this.nextInvestmentDate, resources, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : Integer.valueOf(C11595R.string.recurring_schedule_edit_message_start_date_prefix), (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false);
                ApiInvestmentSchedule.Frequency frequency = this.initialFrequency;
                if (frequency != this.frequency) {
                    int i = C11595R.string.recurring_schedule_edit_frequency_changed_message;
                    if (this.isCrypto) {
                        descriptionResId = StringsKt.getDescriptionResIdCrypto(frequency);
                    } else {
                        descriptionResId = StringsKt.getDescriptionResId(frequency);
                    }
                    String string2 = resources.getString(i, resources.getString(descriptionResId), resources.getString(StringsKt.getLabelResIdLowercase(this.frequency)), recent);
                    Intrinsics.checkNotNull(string2);
                    return string2;
                }
                String string3 = resources.getString(C11595R.string.recurring_schedule_edit_message, recent);
                Intrinsics.checkNotNull(string3);
                return string3;
            }
        }
    }

    /* compiled from: RecurringOrderScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult;", "", "<init>", "()V", "Loading", "Success", "Failure", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult$Failure;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult$Loading;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult$Success;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class UpdateInvestmentScheduleResult {
        public static final int $stable = 0;

        public /* synthetic */ UpdateInvestmentScheduleResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UpdateInvestmentScheduleResult() {
        }

        /* compiled from: RecurringOrderScheduleViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult$Loading;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends UpdateInvestmentScheduleResult {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        /* compiled from: RecurringOrderScheduleViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult$Success;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$InvestmentScheduleUpdate;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends UpdateInvestmentScheduleResult {
            public static final int $stable = 8;
            private final UiEvent<InvestmentScheduleUpdate> event;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Success copy$default(Success success, UiEvent uiEvent, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiEvent = success.event;
                }
                return success.copy(uiEvent);
            }

            public final UiEvent<InvestmentScheduleUpdate> component1() {
                return this.event;
            }

            public final Success copy(UiEvent<InvestmentScheduleUpdate> event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return new Success(event);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.event, ((Success) other).event);
            }

            public int hashCode() {
                return this.event.hashCode();
            }

            public String toString() {
                return "Success(event=" + this.event + ")";
            }

            public final UiEvent<InvestmentScheduleUpdate> getEvent() {
                return this.event;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(UiEvent<InvestmentScheduleUpdate> event) {
                super(null);
                Intrinsics.checkNotNullParameter(event, "event");
                this.event = event;
            }
        }

        /* compiled from: RecurringOrderScheduleViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult$Failure;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$UpdateInvestmentScheduleResult;", "event", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends UpdateInvestmentScheduleResult {
            public static final int $stable = 8;
            private final UiEvent<Throwable> event;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Failure copy$default(Failure failure, UiEvent uiEvent, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiEvent = failure.event;
                }
                return failure.copy(uiEvent);
            }

            public final UiEvent<Throwable> component1() {
                return this.event;
            }

            public final Failure copy(UiEvent<Throwable> event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return new Failure(event);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.areEqual(this.event, ((Failure) other).event);
            }

            public int hashCode() {
                return this.event.hashCode();
            }

            public String toString() {
                return "Failure(event=" + this.event + ")";
            }

            public final UiEvent<Throwable> getEvent() {
                return this.event;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(UiEvent<Throwable> event) {
                super(null);
                Intrinsics.checkNotNullParameter(event, "event");
                this.event = event;
            }
        }
    }
}
