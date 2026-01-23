package com.robinhood.android.transfers.recurring.p270ui;

import android.content.res.Resources;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.bonfire.ApiRecurringIraContributionInfo;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p355ui.UiAutomaticDeposit;
import com.robinhood.models.serverdriven.experimental.api.DataRowStacked;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.LocalDate;

/* compiled from: AutomaticDepositDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001=B{\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\b\u0012\u00060\tj\u0002`\n\u0018\u00010\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0012HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\b\u0012\u00060\tj\u0002`\n\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u001e\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0086\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\b\u0012\u00060\tj\u0002`\n\u0018\u00010\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b\u0007\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\b\u0012\u00060\tj\u0002`\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001fR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b\u000e\u0010\u001dR%\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b6\u0010\u001fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0017\u00108\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b8\u0010\u001dR\u0013\u0010<\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState;", "", "Lcom/robinhood/models/ui/UiAutomaticDeposit;", "uiAutomaticDeposit", "Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;", "iraContributionInfo", "", "isCancelPending", "Lcom/robinhood/udf/UiEvent;", "", "Lcom/robinhood/android/transfers/recurring/ui/CancelAutomaticDepositEvent;", "cancelEvent", "", "cancelErrorEvent", "isSkipPending", "Lkotlin/Result;", "Lcom/robinhood/models/db/AutomaticDeposit;", "skipRecurringDepositResultEvent", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/models/ui/UiAutomaticDeposit;Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/udf/UiEvent;Lj$/time/Clock;)V", "component8", "()Lj$/time/Clock;", "component1", "()Lcom/robinhood/models/ui/UiAutomaticDeposit;", "component2", "()Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;", "component3", "()Z", "component4", "()Lcom/robinhood/udf/UiEvent;", "component5", "component6", "component7", "copy", "(Lcom/robinhood/models/ui/UiAutomaticDeposit;Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/udf/UiEvent;Lj$/time/Clock;)Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/ui/UiAutomaticDeposit;", "getUiAutomaticDeposit", "Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;", "getIraContributionInfo", "Z", "Lcom/robinhood/udf/UiEvent;", "getCancelEvent", "getCancelErrorEvent", "getSkipRecurringDepositResultEvent", "Lj$/time/Clock;", "isLoading", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState$Content;", "getContent", "()Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState$Content;", "content", "Content", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AutomaticDepositDetailViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> cancelErrorEvent;
    private final UiEvent<Unit> cancelEvent;
    private final Clock clock;
    private final ApiRecurringIraContributionInfo iraContributionInfo;
    private final boolean isCancelPending;
    private final boolean isLoading;
    private final boolean isSkipPending;
    private final UiEvent<Result<AutomaticDeposit>> skipRecurringDepositResultEvent;
    private final UiAutomaticDeposit uiAutomaticDeposit;

    /* compiled from: AutomaticDepositDetailViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAutomaticDeposit.DestinationAccountType.values().length];
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_ROTH_INHERITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_TRADITIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_TRADITIONAL_INHERITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_ACCOUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHY_ACCOUNT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component8, reason: from getter */
    private final Clock getClock() {
        return this.clock;
    }

    public static /* synthetic */ AutomaticDepositDetailViewState copy$default(AutomaticDepositDetailViewState automaticDepositDetailViewState, UiAutomaticDeposit uiAutomaticDeposit, ApiRecurringIraContributionInfo apiRecurringIraContributionInfo, boolean z, UiEvent uiEvent, UiEvent uiEvent2, boolean z2, UiEvent uiEvent3, Clock clock, int i, Object obj) {
        if ((i & 1) != 0) {
            uiAutomaticDeposit = automaticDepositDetailViewState.uiAutomaticDeposit;
        }
        if ((i & 2) != 0) {
            apiRecurringIraContributionInfo = automaticDepositDetailViewState.iraContributionInfo;
        }
        if ((i & 4) != 0) {
            z = automaticDepositDetailViewState.isCancelPending;
        }
        if ((i & 8) != 0) {
            uiEvent = automaticDepositDetailViewState.cancelEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = automaticDepositDetailViewState.cancelErrorEvent;
        }
        if ((i & 32) != 0) {
            z2 = automaticDepositDetailViewState.isSkipPending;
        }
        if ((i & 64) != 0) {
            uiEvent3 = automaticDepositDetailViewState.skipRecurringDepositResultEvent;
        }
        if ((i & 128) != 0) {
            clock = automaticDepositDetailViewState.clock;
        }
        UiEvent uiEvent4 = uiEvent3;
        Clock clock2 = clock;
        UiEvent uiEvent5 = uiEvent2;
        boolean z3 = z2;
        return automaticDepositDetailViewState.copy(uiAutomaticDeposit, apiRecurringIraContributionInfo, z, uiEvent, uiEvent5, z3, uiEvent4, clock2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiAutomaticDeposit getUiAutomaticDeposit() {
        return this.uiAutomaticDeposit;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiRecurringIraContributionInfo getIraContributionInfo() {
        return this.iraContributionInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCancelPending() {
        return this.isCancelPending;
    }

    public final UiEvent<Unit> component4() {
        return this.cancelEvent;
    }

    public final UiEvent<Throwable> component5() {
        return this.cancelErrorEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSkipPending() {
        return this.isSkipPending;
    }

    public final UiEvent<Result<AutomaticDeposit>> component7() {
        return this.skipRecurringDepositResultEvent;
    }

    public final AutomaticDepositDetailViewState copy(UiAutomaticDeposit uiAutomaticDeposit, ApiRecurringIraContributionInfo iraContributionInfo, boolean isCancelPending, UiEvent<Unit> cancelEvent, UiEvent<Throwable> cancelErrorEvent, boolean isSkipPending, UiEvent<Result<AutomaticDeposit>> skipRecurringDepositResultEvent, Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        return new AutomaticDepositDetailViewState(uiAutomaticDeposit, iraContributionInfo, isCancelPending, cancelEvent, cancelErrorEvent, isSkipPending, skipRecurringDepositResultEvent, clock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutomaticDepositDetailViewState)) {
            return false;
        }
        AutomaticDepositDetailViewState automaticDepositDetailViewState = (AutomaticDepositDetailViewState) other;
        return Intrinsics.areEqual(this.uiAutomaticDeposit, automaticDepositDetailViewState.uiAutomaticDeposit) && Intrinsics.areEqual(this.iraContributionInfo, automaticDepositDetailViewState.iraContributionInfo) && this.isCancelPending == automaticDepositDetailViewState.isCancelPending && Intrinsics.areEqual(this.cancelEvent, automaticDepositDetailViewState.cancelEvent) && Intrinsics.areEqual(this.cancelErrorEvent, automaticDepositDetailViewState.cancelErrorEvent) && this.isSkipPending == automaticDepositDetailViewState.isSkipPending && Intrinsics.areEqual(this.skipRecurringDepositResultEvent, automaticDepositDetailViewState.skipRecurringDepositResultEvent) && Intrinsics.areEqual(this.clock, automaticDepositDetailViewState.clock);
    }

    public int hashCode() {
        UiAutomaticDeposit uiAutomaticDeposit = this.uiAutomaticDeposit;
        int iHashCode = (uiAutomaticDeposit == null ? 0 : uiAutomaticDeposit.hashCode()) * 31;
        ApiRecurringIraContributionInfo apiRecurringIraContributionInfo = this.iraContributionInfo;
        int iHashCode2 = (((iHashCode + (apiRecurringIraContributionInfo == null ? 0 : apiRecurringIraContributionInfo.hashCode())) * 31) + Boolean.hashCode(this.isCancelPending)) * 31;
        UiEvent<Unit> uiEvent = this.cancelEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.cancelErrorEvent;
        int iHashCode4 = (((iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + Boolean.hashCode(this.isSkipPending)) * 31;
        UiEvent<Result<AutomaticDeposit>> uiEvent3 = this.skipRecurringDepositResultEvent;
        return ((iHashCode4 + (uiEvent3 != null ? uiEvent3.hashCode() : 0)) * 31) + this.clock.hashCode();
    }

    public String toString() {
        return "AutomaticDepositDetailViewState(uiAutomaticDeposit=" + this.uiAutomaticDeposit + ", iraContributionInfo=" + this.iraContributionInfo + ", isCancelPending=" + this.isCancelPending + ", cancelEvent=" + this.cancelEvent + ", cancelErrorEvent=" + this.cancelErrorEvent + ", isSkipPending=" + this.isSkipPending + ", skipRecurringDepositResultEvent=" + this.skipRecurringDepositResultEvent + ", clock=" + this.clock + ")";
    }

    public AutomaticDepositDetailViewState(UiAutomaticDeposit uiAutomaticDeposit, ApiRecurringIraContributionInfo apiRecurringIraContributionInfo, boolean z, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2, boolean z2, UiEvent<Result<AutomaticDeposit>> uiEvent3, Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.uiAutomaticDeposit = uiAutomaticDeposit;
        this.iraContributionInfo = apiRecurringIraContributionInfo;
        this.isCancelPending = z;
        this.cancelEvent = uiEvent;
        this.cancelErrorEvent = uiEvent2;
        this.isSkipPending = z2;
        this.skipRecurringDepositResultEvent = uiEvent3;
        this.clock = clock;
        this.isLoading = getContent() == null || z || z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutomaticDepositDetailViewState(UiAutomaticDeposit uiAutomaticDeposit, ApiRecurringIraContributionInfo apiRecurringIraContributionInfo, boolean z, UiEvent uiEvent, UiEvent uiEvent2, boolean z2, UiEvent uiEvent3, Clock clock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Clock clock2;
        UiEvent uiEvent4;
        uiAutomaticDeposit = (i & 1) != 0 ? null : uiAutomaticDeposit;
        apiRecurringIraContributionInfo = (i & 2) != 0 ? null : apiRecurringIraContributionInfo;
        z = (i & 4) != 0 ? false : z;
        uiEvent = (i & 8) != 0 ? null : uiEvent;
        uiEvent2 = (i & 16) != 0 ? null : uiEvent2;
        z2 = (i & 32) != 0 ? false : z2;
        if ((i & 64) != 0) {
            clock2 = clock;
            uiEvent4 = null;
        } else {
            clock2 = clock;
            uiEvent4 = uiEvent3;
        }
        this(uiAutomaticDeposit, apiRecurringIraContributionInfo, z, uiEvent, uiEvent2, z2, uiEvent4, clock2);
    }

    public final UiAutomaticDeposit getUiAutomaticDeposit() {
        return this.uiAutomaticDeposit;
    }

    public final ApiRecurringIraContributionInfo getIraContributionInfo() {
        return this.iraContributionInfo;
    }

    public final boolean isCancelPending() {
        return this.isCancelPending;
    }

    public final UiEvent<Unit> getCancelEvent() {
        return this.cancelEvent;
    }

    public final UiEvent<Throwable> getCancelErrorEvent() {
        return this.cancelErrorEvent;
    }

    public final boolean isSkipPending() {
        return this.isSkipPending;
    }

    public final UiEvent<Result<AutomaticDeposit>> getSkipRecurringDepositResultEvent() {
        return this.skipRecurringDepositResultEvent;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final Content getContent() {
        UiAutomaticDeposit uiAutomaticDeposit = this.uiAutomaticDeposit;
        if (uiAutomaticDeposit == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[uiAutomaticDeposit.getAutomaticDeposit().getDestinationAccount().getAccountType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                if (this.iraContributionInfo == null) {
                    return null;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                Unit unit = Unit.INSTANCE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new Content(this.uiAutomaticDeposit, this.iraContributionInfo, this.isSkipPending, this.isCancelPending, this.clock);
    }

    /* compiled from: AutomaticDepositDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\tHÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0018J!\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b \u0010\u0018J\u0017\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#JD\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010#R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0017\u00104\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b4\u0010\u0010R\u0017\u00105\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b5\u0010\u0010R\u0011\u00107\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b6\u0010'R\u0013\u0010;\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState$Content;", "", "Lcom/robinhood/models/ui/UiAutomaticDeposit;", "uiAutomaticDeposit", "Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;", "iraContributionInfo", "", "isSkipPending", "isCancelPending", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/models/ui/UiAutomaticDeposit;Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;ZZLj$/time/Clock;)V", "component2", "()Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;", "component3", "()Z", "component4", "component5", "()Lj$/time/Clock;", "Landroid/content/res/Resources;", "resources", "", "getTitleTextValue", "(Landroid/content/res/Resources;)Ljava/lang/String;", "getSubtitleTextValue", "getBankAccountTextValue", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getAdditionalDataRows", "(Landroid/content/res/Resources;)Ljava/util/List;", "getSkipConfirmationDialogMessage", "getAccountName", "component1", "()Lcom/robinhood/models/ui/UiAutomaticDeposit;", "copy", "(Lcom/robinhood/models/ui/UiAutomaticDeposit;Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;ZZLj$/time/Clock;)Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState$Content;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/ui/UiAutomaticDeposit;", "getUiAutomaticDeposit", "Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;", "Z", "Lj$/time/Clock;", "skippable", "isSkipButtonEnabled", "isCancelEnabled", "getAmountTextValue", "amountTextValue", "Lcom/robinhood/utils/resource/StringResource;", "getFooterStringResource", "()Lcom/robinhood/utils/resource/StringResource;", "footerStringResource", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content {
        public static final int $stable = 8;
        private final Clock clock;
        private final ApiRecurringIraContributionInfo iraContributionInfo;
        private final boolean isCancelEnabled;
        private final boolean isCancelPending;
        private final boolean isSkipButtonEnabled;
        private final boolean isSkipPending;
        private final boolean skippable;
        private final UiAutomaticDeposit uiAutomaticDeposit;

        /* renamed from: component2, reason: from getter */
        private final ApiRecurringIraContributionInfo getIraContributionInfo() {
            return this.iraContributionInfo;
        }

        /* renamed from: component3, reason: from getter */
        private final boolean getIsSkipPending() {
            return this.isSkipPending;
        }

        /* renamed from: component4, reason: from getter */
        private final boolean getIsCancelPending() {
            return this.isCancelPending;
        }

        /* renamed from: component5, reason: from getter */
        private final Clock getClock() {
            return this.clock;
        }

        public static /* synthetic */ Content copy$default(Content content, UiAutomaticDeposit uiAutomaticDeposit, ApiRecurringIraContributionInfo apiRecurringIraContributionInfo, boolean z, boolean z2, Clock clock, int i, Object obj) {
            if ((i & 1) != 0) {
                uiAutomaticDeposit = content.uiAutomaticDeposit;
            }
            if ((i & 2) != 0) {
                apiRecurringIraContributionInfo = content.iraContributionInfo;
            }
            if ((i & 4) != 0) {
                z = content.isSkipPending;
            }
            if ((i & 8) != 0) {
                z2 = content.isCancelPending;
            }
            if ((i & 16) != 0) {
                clock = content.clock;
            }
            Clock clock2 = clock;
            boolean z3 = z;
            return content.copy(uiAutomaticDeposit, apiRecurringIraContributionInfo, z3, z2, clock2);
        }

        /* renamed from: component1, reason: from getter */
        public final UiAutomaticDeposit getUiAutomaticDeposit() {
            return this.uiAutomaticDeposit;
        }

        public final Content copy(UiAutomaticDeposit uiAutomaticDeposit, ApiRecurringIraContributionInfo iraContributionInfo, boolean isSkipPending, boolean isCancelPending, Clock clock) {
            Intrinsics.checkNotNullParameter(uiAutomaticDeposit, "uiAutomaticDeposit");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new Content(uiAutomaticDeposit, iraContributionInfo, isSkipPending, isCancelPending, clock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.uiAutomaticDeposit, content.uiAutomaticDeposit) && Intrinsics.areEqual(this.iraContributionInfo, content.iraContributionInfo) && this.isSkipPending == content.isSkipPending && this.isCancelPending == content.isCancelPending && Intrinsics.areEqual(this.clock, content.clock);
        }

        public int hashCode() {
            int iHashCode = this.uiAutomaticDeposit.hashCode() * 31;
            ApiRecurringIraContributionInfo apiRecurringIraContributionInfo = this.iraContributionInfo;
            return ((((((iHashCode + (apiRecurringIraContributionInfo == null ? 0 : apiRecurringIraContributionInfo.hashCode())) * 31) + Boolean.hashCode(this.isSkipPending)) * 31) + Boolean.hashCode(this.isCancelPending)) * 31) + this.clock.hashCode();
        }

        public String toString() {
            return "Content(uiAutomaticDeposit=" + this.uiAutomaticDeposit + ", iraContributionInfo=" + this.iraContributionInfo + ", isSkipPending=" + this.isSkipPending + ", isCancelPending=" + this.isCancelPending + ", clock=" + this.clock + ")";
        }

        public Content(UiAutomaticDeposit uiAutomaticDeposit, ApiRecurringIraContributionInfo apiRecurringIraContributionInfo, boolean z, boolean z2, Clock clock) {
            Intrinsics.checkNotNullParameter(uiAutomaticDeposit, "uiAutomaticDeposit");
            Intrinsics.checkNotNullParameter(clock, "clock");
            this.uiAutomaticDeposit = uiAutomaticDeposit;
            this.iraContributionInfo = apiRecurringIraContributionInfo;
            this.isSkipPending = z;
            this.isCancelPending = z2;
            this.clock = clock;
            boolean zCanBeSkipped = UiAutomaticDeposits.canBeSkipped(uiAutomaticDeposit, clock);
            this.skippable = zCanBeSkipped;
            this.isSkipButtonEnabled = (z2 || z) ? false : zCanBeSkipped;
            this.isCancelEnabled = !z2;
        }

        public final UiAutomaticDeposit getUiAutomaticDeposit() {
            return this.uiAutomaticDeposit;
        }

        /* renamed from: isSkipButtonEnabled, reason: from getter */
        public final boolean getIsSkipButtonEnabled() {
            return this.isSkipButtonEnabled;
        }

        /* renamed from: isCancelEnabled, reason: from getter */
        public final boolean getIsCancelEnabled() {
            return this.isCancelEnabled;
        }

        public final String getAmountTextValue() {
            return Money.format$default(this.uiAutomaticDeposit.getAutomaticDeposit().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }

        public final String getTitleTextValue(Resources resources) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            String string2 = resources.getString(C30439R.string.ach_transfer_recurring_deposit_detail_title, UiAutomaticDeposits.getFrequencyDisplayString(this.uiAutomaticDeposit, resources));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        public final String getSubtitleTextValue(Resources resources) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            String string2 = resources.getString(C30439R.string.ach_transfer_recurring_deposit_detail_subtitle, getAccountName(resources), InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(this.uiAutomaticDeposit.getAutomaticDeposit().getCreatedAt()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        public final String getBankAccountTextValue(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            return UiAutomaticDeposits.getAchRelationshipDisplayName(this.uiAutomaticDeposit, resources);
        }

        public final StringResource getFooterStringResource() {
            LocalDate skipUntilDate = this.uiAutomaticDeposit.getAutomaticDeposit().getSkipUntilDate();
            if (this.skippable || skipUntilDate == null) {
                return null;
            }
            return StringResource.INSTANCE.invoke(C30439R.string.ach_transfer_automatic_deposit_skipped_footer, LocalDateFormatter.LONG.format(skipUntilDate));
        }

        public final List<UIComponent<GenericAction>> getAdditionalDataRows(Resources resources) throws Resources.NotFoundException {
            List<UIComponent<GenericAction>> rows;
            Intrinsics.checkNotNullParameter(resources, "resources");
            ApiRecurringIraContributionInfo apiRecurringIraContributionInfo = this.iraContributionInfo;
            if (apiRecurringIraContributionInfo != null && (rows = apiRecurringIraContributionInfo.getRows()) != null) {
                return rows;
            }
            String string2 = resources.getString(C30439R.string.ach_transfer_automatic_deposit_detail_next_transfer_header);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return CollectionsKt.listOf(new DataRowStacked(string2, null, null, LocalDateFormatter.MEDIUM.format(this.uiAutomaticDeposit.getAutomaticDeposit().getNextDepositDate()), null, null, 54, null));
        }

        public final String getSkipConfirmationDialogMessage(Resources resources) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            String string2 = resources.getString(C30439R.string.ach_transfer_recurring_deposit_skip_confirmation_dialog_message, getAccountName(resources), LocalDateFormatter.LONG.format(this.uiAutomaticDeposit.getAutomaticDeposit().getNextDepositDate()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        public final String getAccountName(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Account associatedBrokerageAccount = this.uiAutomaticDeposit.getAssociatedBrokerageAccount();
            if (associatedBrokerageAccount == null) {
                return UiAutomaticDeposits.getDestinationAccountDisplayString(this.uiAutomaticDeposit, resources);
            }
            String nickname = associatedBrokerageAccount.getNickname();
            if (nickname == null || nickname.length() == 0) {
                return AccountDisplayNames.getDisplayName(associatedBrokerageAccount).getShort().getTitle().getText(resources).toString();
            }
            return associatedBrokerageAccount.getNickname();
        }
    }
}
