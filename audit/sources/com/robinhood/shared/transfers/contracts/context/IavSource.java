package com.robinhood.shared.transfers.contracts.context;

import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower5;
import com.robinhood.android.educationtour.EducationTourElementIds;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IavSource.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001d\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "", "isQueued", "", "analyticsTag", "", "mayBeSkipped", "shouldContinueToTransfer", "<init>", "(Ljava/lang/String;IZLjava/lang/String;ZZ)V", "()Z", "getAnalyticsTag", "()Ljava/lang/String;", "getMayBeSkipped", "getShouldContinueToTransfer", "ONBOARDING", "ONBOARDING_V2", "WATCHLIST_QUEUED", EducationTourElementIds.ADD_TO_WATCHLIST_ELEMENT_ID, "TRANSFER", "CASH_MANAGEMENT_ONBOARDING", "DEEPLINK", "DEEPLINK_QUEUED", "MENU_OF_OPTIONS", "RECURRING", "RHY_REFERRAL_ONBOARDING", "OUTGOING_WIRE", "RECURRING_DEPOSIT_EXTRA_CASH", "NONE", "isFromOnboarding", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class IavSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IavSource[] $VALUES;
    private final String analyticsTag;
    private final boolean isQueued;
    private final boolean mayBeSkipped;
    private final boolean shouldContinueToTransfer;
    public static final IavSource ONBOARDING = new IavSource("ONBOARDING", 0, true, "Signup", true, true);
    public static final IavSource ONBOARDING_V2 = new IavSource("ONBOARDING_V2", 1, true, "Signup", true, false);
    public static final IavSource WATCHLIST_QUEUED = new IavSource("WATCHLIST_QUEUED", 2, true, "watchlistQueued", false, true);
    public static final IavSource WATCHLIST = new IavSource(EducationTourElementIds.ADD_TO_WATCHLIST_ELEMENT_ID, 3, false, PortfolioBuyingPower5.IntentKeyEntryPoint, false, true);
    public static final IavSource TRANSFER = new IavSource("TRANSFER", 4, false, "transfer", false, false);
    public static final IavSource CASH_MANAGEMENT_ONBOARDING = new IavSource("CASH_MANAGEMENT_ONBOARDING", 5, false, "cashManagementOnboarding", true, true);
    public static final IavSource DEEPLINK = new IavSource("DEEPLINK", 6, false, "deeplink", false, true);
    public static final IavSource DEEPLINK_QUEUED = new IavSource("DEEPLINK_QUEUED", 7, true, "deeplinkQueued", false, true);
    public static final IavSource MENU_OF_OPTIONS = new IavSource("MENU_OF_OPTIONS", 8, true, "deeplinkQueued", false, true);
    public static final IavSource RECURRING = new IavSource("RECURRING", 9, false, "recurring", false, false);
    public static final IavSource RHY_REFERRAL_ONBOARDING = new IavSource("RHY_REFERRAL_ONBOARDING", 10, false, "rhyReferralOnboarding", true, false);
    public static final IavSource OUTGOING_WIRE = new IavSource("OUTGOING_WIRE", 11, false, "outgoingWire", true, false);
    public static final IavSource RECURRING_DEPOSIT_EXTRA_CASH = new IavSource("RECURRING_DEPOSIT_EXTRA_CASH", 12, false, "recurringDepositExtraCash", true, false);
    public static final IavSource NONE = new IavSource("NONE", 13, false, "", false, false);

    private static final /* synthetic */ IavSource[] $values() {
        return new IavSource[]{ONBOARDING, ONBOARDING_V2, WATCHLIST_QUEUED, WATCHLIST, TRANSFER, CASH_MANAGEMENT_ONBOARDING, DEEPLINK, DEEPLINK_QUEUED, MENU_OF_OPTIONS, RECURRING, RHY_REFERRAL_ONBOARDING, OUTGOING_WIRE, RECURRING_DEPOSIT_EXTRA_CASH, NONE};
    }

    public static EnumEntries<IavSource> getEntries() {
        return $ENTRIES;
    }

    private IavSource(String str, int i, boolean z, String str2, boolean z2, boolean z3) {
        this.isQueued = z;
        this.analyticsTag = str2;
        this.mayBeSkipped = z2;
        this.shouldContinueToTransfer = z3;
    }

    /* renamed from: isQueued, reason: from getter */
    public final boolean getIsQueued() {
        return this.isQueued;
    }

    public final String getAnalyticsTag() {
        return this.analyticsTag;
    }

    public final boolean getMayBeSkipped() {
        return this.mayBeSkipped;
    }

    public final boolean getShouldContinueToTransfer() {
        return this.shouldContinueToTransfer;
    }

    static {
        IavSource[] iavSourceArr$values = $values();
        $VALUES = iavSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(iavSourceArr$values);
    }

    public final boolean isFromOnboarding() {
        return this == ONBOARDING || this == ONBOARDING_V2;
    }

    public static IavSource valueOf(String str) {
        return (IavSource) Enum.valueOf(IavSource.class, str);
    }

    public static IavSource[] values() {
        return (IavSource[]) $VALUES.clone();
    }
}
