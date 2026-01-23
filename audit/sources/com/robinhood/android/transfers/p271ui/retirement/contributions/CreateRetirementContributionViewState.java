package com.robinhood.android.transfers.p271ui.retirement.contributions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.retirement.contributions.ContributionEditModeState;
import com.robinhood.android.retirement.contributions.ContributionFooterState;
import com.robinhood.android.retirement.contributions.ContributionProgressRingState;
import com.robinhood.android.retirement.contributions.ContributionReviewModeState;
import com.robinhood.android.retirement.contributions.RetirementContributionScreen5;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.TransferData;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: CreateRetirementContributionViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState;", "", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "Loading", "Error", "Loaded", "ContributionCtaAction", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Error;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Loaded;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Loading;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class CreateRetirementContributionViewState {
    public static final int $stable = 0;
    private final String title;

    public /* synthetic */ CreateRetirementContributionViewState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private CreateRetirementContributionViewState(String str) {
        this.title = str;
    }

    public /* synthetic */ CreateRetirementContributionViewState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, null);
    }

    public String getTitle() {
        return this.title;
    }

    /* compiled from: CreateRetirementContributionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Loading;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CreateRetirementContributionViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 911354933;
        }

        public String toString() {
            return "Loading";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Loading() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: CreateRetirementContributionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Error;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends CreateRetirementContributionViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 933136193;
        }

        public String toString() {
            return "Error";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Error() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: CreateRetirementContributionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bé\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\u0006\u0010-\u001a\u00020!\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b6\u00103J\u0010\u00107\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b7\u00103J\u0010\u00108\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bB\u00105J\u001c\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\bG\u0010FJ\u0010\u0010H\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020!HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020#HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bV\u00105J\u0010\u0010W\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bW\u00105J\u0010\u0010X\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bX\u00105J\u0010\u0010Y\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bY\u00105J\u0010\u0010Z\u001a\u00020!HÆ\u0003¢\u0006\u0004\bZ\u0010OJ\u0010\u0010[\u001a\u00020.HÆ\u0003¢\u0006\u0004\b[\u0010\\J¦\u0002\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020.HÆ\u0001¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b_\u00103J\u0010\u0010a\u001a\u00020`HÖ\u0001¢\u0006\u0004\ba\u0010bJ\u001a\u0010e\u001a\u00020\u00052\b\u0010d\u001a\u0004\u0018\u00010cHÖ\u0003¢\u0006\u0004\be\u0010fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010g\u001a\u0004\bh\u00103R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010i\u001a\u0004\b\u0006\u00105R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010g\u001a\u0004\bj\u00103R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010g\u001a\u0004\bk\u00103R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010l\u001a\u0004\bm\u00109R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010n\u001a\u0004\bo\u0010;R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010p\u001a\u0004\bq\u0010=R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010r\u001a\u0004\bs\u0010?R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010t\u001a\u0004\bu\u0010AR\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010i\u001a\u0004\b\u0013\u00105R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010v\u001a\u0004\bw\u0010DR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010x\u001a\u0004\by\u0010FR\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010x\u001a\u0004\bz\u0010FR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010{\u001a\u0004\b|\u0010IR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010}\u001a\u0004\b~\u0010KR\u0018\u0010 \u001a\u00020\u001f8\u0006¢\u0006\r\n\u0004\b \u0010\u007f\u001a\u0005\b\u0080\u0001\u0010MR\u0019\u0010\"\u001a\u00020!8\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010OR\u0019\u0010$\u001a\u00020#8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010QR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010SR\u001b\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010UR\u0018\u0010)\u001a\u00020\u00058\u0006¢\u0006\r\n\u0004\b)\u0010i\u001a\u0005\b\u0089\u0001\u00105R\u0018\u0010*\u001a\u00020\u00058\u0006¢\u0006\r\n\u0004\b*\u0010i\u001a\u0005\b\u008a\u0001\u00105R\u0017\u0010+\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010i\u001a\u0004\b+\u00105R\u0018\u0010,\u001a\u00020\u00058\u0006¢\u0006\r\n\u0004\b,\u0010i\u001a\u0005\b\u008b\u0001\u00105R\u0019\u0010-\u001a\u00020!8\u0006¢\u0006\u000e\n\u0005\b-\u0010\u0081\u0001\u001a\u0005\b\u008c\u0001\u0010OR\u0019\u0010/\u001a\u00020.8\u0006¢\u0006\u000e\n\u0005\b/\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010\\¨\u0006\u008f\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Loaded;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState;", "Lcom/robinhood/android/retirement/contributions/RetirementContributionScreenState;", "", "title", "", "isInEditMode", "userInputString", "sinkAccountNumber", "j$/time/Year", "taxYear", "Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;", "progressRingState", "Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;", "reviewModeState", "Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;", "editModeState", "Lcom/robinhood/android/retirement/contributions/ContributionFooterState;", "reviewFooterState", "isContributionRequestLoading", "", "Lcom/robinhood/android/transfers/ui/max/TransferData;", "Ljava/util/UUID;", "transferDataToRefId", "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "frequency", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPoint", "Ljava/math/BigDecimal;", "contributionAmount", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "transferConfiguration", "Lcom/robinhood/models/db/Portfolio;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "unifiedBalances", "areMarketsOpenExtended", "overrideNoEnokiAlert", "isInInterEntityMatchExperiment", "showEnokiCelebration", "amountRemainingUntilLimit", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$ContributionCtaAction;", "ctaAction", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lj$/time/Year;Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;Lcom/robinhood/android/retirement/contributions/ContributionFooterState;ZLjava/util/Map;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/TransferConfiguration;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/models/crypto/db/UnifiedBalances;ZZZZLjava/math/BigDecimal;Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$ContributionCtaAction;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "()Lj$/time/Year;", "component6", "()Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;", "component7", "()Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;", "component8", "()Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;", "component9", "()Lcom/robinhood/android/retirement/contributions/ContributionFooterState;", "component10", "component11", "()Ljava/util/Map;", "component12", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component13", "component14", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "component15", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "component16", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component17", "()Ljava/math/BigDecimal;", "component18", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "component19", "()Lcom/robinhood/models/db/Portfolio;", "component20", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "component21", "component22", "component23", "component24", "component25", "component26", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$ContributionCtaAction;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lj$/time/Year;Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;Lcom/robinhood/android/retirement/contributions/ContributionFooterState;ZLjava/util/Map;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/TransferConfiguration;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/models/crypto/db/UnifiedBalances;ZZZZLjava/math/BigDecimal;Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$ContributionCtaAction;)Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Loaded;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Z", "getUserInputString", "getSinkAccountNumber", "Lj$/time/Year;", "getTaxYear", "Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;", "getProgressRingState", "Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;", "getReviewModeState", "Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;", "getEditModeState", "Lcom/robinhood/android/retirement/contributions/ContributionFooterState;", "getReviewFooterState", "Ljava/util/Map;", "getTransferDataToRefId", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSourceAccount", "getSinkAccount", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getFrequency", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "getIraContribution", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPoint", "Ljava/math/BigDecimal;", "getContributionAmount", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "getTransferConfiguration", "Lcom/robinhood/models/db/Portfolio;", "getPortfolio", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "getUnifiedBalances", "getAreMarketsOpenExtended", "getOverrideNoEnokiAlert", "getShowEnokiCelebration", "getAmountRemainingUntilLimit", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$ContributionCtaAction;", "getCtaAction", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends CreateRetirementContributionViewState implements RetirementContributionScreen5 {
        public static final int $stable = 8;
        private final BigDecimal amountRemainingUntilLimit;
        private final boolean areMarketsOpenExtended;
        private final BigDecimal contributionAmount;
        private final ContributionCtaAction ctaAction;
        private final ContributionEditModeState editModeState;
        private final MAXTransferContext.EntryPoint entryPoint;
        private final ApiCreateTransferRequest2 frequency;
        private final IraContributionQuestionnaireResult.IraContribution iraContribution;
        private final boolean isContributionRequestLoading;
        private final boolean isInEditMode;
        private final boolean isInInterEntityMatchExperiment;
        private final boolean overrideNoEnokiAlert;
        private final Portfolio portfolio;
        private final ContributionProgressRingState progressRingState;
        private final ContributionFooterState reviewFooterState;
        private final ContributionReviewModeState reviewModeState;
        private final boolean showEnokiCelebration;
        private final TransferAccount sinkAccount;
        private final String sinkAccountNumber;
        private final TransferAccount sourceAccount;
        private final Year taxYear;
        private final String title;
        private final TransferConfiguration transferConfiguration;
        private final Map<TransferData, UUID> transferDataToRefId;
        private final UnifiedBalances unifiedBalances;
        private final String userInputString;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, boolean z, String str2, String str3, Year year, ContributionProgressRingState contributionProgressRingState, ContributionReviewModeState contributionReviewModeState, ContributionEditModeState contributionEditModeState, ContributionFooterState contributionFooterState, boolean z2, Map map, TransferAccount transferAccount, TransferAccount transferAccount2, ApiCreateTransferRequest2 apiCreateTransferRequest2, IraContributionQuestionnaireResult.IraContribution iraContribution, MAXTransferContext.EntryPoint entryPoint, BigDecimal bigDecimal, TransferConfiguration transferConfiguration, Portfolio portfolio, UnifiedBalances unifiedBalances, boolean z3, boolean z4, boolean z5, boolean z6, BigDecimal bigDecimal2, ContributionCtaAction contributionCtaAction, int i, Object obj) {
            ContributionCtaAction contributionCtaAction2;
            BigDecimal bigDecimal3;
            String str4 = (i & 1) != 0 ? loaded.title : str;
            boolean z7 = (i & 2) != 0 ? loaded.isInEditMode : z;
            String str5 = (i & 4) != 0 ? loaded.userInputString : str2;
            String str6 = (i & 8) != 0 ? loaded.sinkAccountNumber : str3;
            Year year2 = (i & 16) != 0 ? loaded.taxYear : year;
            ContributionProgressRingState contributionProgressRingState2 = (i & 32) != 0 ? loaded.progressRingState : contributionProgressRingState;
            ContributionReviewModeState contributionReviewModeState2 = (i & 64) != 0 ? loaded.reviewModeState : contributionReviewModeState;
            ContributionEditModeState contributionEditModeState2 = (i & 128) != 0 ? loaded.editModeState : contributionEditModeState;
            ContributionFooterState contributionFooterState2 = (i & 256) != 0 ? loaded.reviewFooterState : contributionFooterState;
            boolean z8 = (i & 512) != 0 ? loaded.isContributionRequestLoading : z2;
            Map map2 = (i & 1024) != 0 ? loaded.transferDataToRefId : map;
            TransferAccount transferAccount3 = (i & 2048) != 0 ? loaded.sourceAccount : transferAccount;
            TransferAccount transferAccount4 = (i & 4096) != 0 ? loaded.sinkAccount : transferAccount2;
            ApiCreateTransferRequest2 apiCreateTransferRequest22 = (i & 8192) != 0 ? loaded.frequency : apiCreateTransferRequest2;
            String str7 = str4;
            IraContributionQuestionnaireResult.IraContribution iraContribution2 = (i & 16384) != 0 ? loaded.iraContribution : iraContribution;
            MAXTransferContext.EntryPoint entryPoint2 = (i & 32768) != 0 ? loaded.entryPoint : entryPoint;
            BigDecimal bigDecimal4 = (i & 65536) != 0 ? loaded.contributionAmount : bigDecimal;
            TransferConfiguration transferConfiguration2 = (i & 131072) != 0 ? loaded.transferConfiguration : transferConfiguration;
            Portfolio portfolio2 = (i & 262144) != 0 ? loaded.portfolio : portfolio;
            UnifiedBalances unifiedBalances2 = (i & 524288) != 0 ? loaded.unifiedBalances : unifiedBalances;
            boolean z9 = (i & 1048576) != 0 ? loaded.areMarketsOpenExtended : z3;
            boolean z10 = (i & 2097152) != 0 ? loaded.overrideNoEnokiAlert : z4;
            boolean z11 = (i & 4194304) != 0 ? loaded.isInInterEntityMatchExperiment : z5;
            boolean z12 = (i & 8388608) != 0 ? loaded.showEnokiCelebration : z6;
            BigDecimal bigDecimal5 = (i & 16777216) != 0 ? loaded.amountRemainingUntilLimit : bigDecimal2;
            if ((i & 33554432) != 0) {
                bigDecimal3 = bigDecimal5;
                contributionCtaAction2 = loaded.ctaAction;
            } else {
                contributionCtaAction2 = contributionCtaAction;
                bigDecimal3 = bigDecimal5;
            }
            return loaded.copy(str7, z7, str5, str6, year2, contributionProgressRingState2, contributionReviewModeState2, contributionEditModeState2, contributionFooterState2, z8, map2, transferAccount3, transferAccount4, apiCreateTransferRequest22, iraContribution2, entryPoint2, bigDecimal4, transferConfiguration2, portfolio2, unifiedBalances2, z9, z10, z11, z12, bigDecimal3, contributionCtaAction2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsContributionRequestLoading() {
            return this.isContributionRequestLoading;
        }

        public final Map<TransferData, UUID> component11() {
            return this.transferDataToRefId;
        }

        /* renamed from: component12, reason: from getter */
        public final TransferAccount getSourceAccount() {
            return this.sourceAccount;
        }

        /* renamed from: component13, reason: from getter */
        public final TransferAccount getSinkAccount() {
            return this.sinkAccount;
        }

        /* renamed from: component14, reason: from getter */
        public final ApiCreateTransferRequest2 getFrequency() {
            return this.frequency;
        }

        /* renamed from: component15, reason: from getter */
        public final IraContributionQuestionnaireResult.IraContribution getIraContribution() {
            return this.iraContribution;
        }

        /* renamed from: component16, reason: from getter */
        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component17, reason: from getter */
        public final BigDecimal getContributionAmount() {
            return this.contributionAmount;
        }

        /* renamed from: component18, reason: from getter */
        public final TransferConfiguration getTransferConfiguration() {
            return this.transferConfiguration;
        }

        /* renamed from: component19, reason: from getter */
        public final Portfolio getPortfolio() {
            return this.portfolio;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsInEditMode() {
            return this.isInEditMode;
        }

        /* renamed from: component20, reason: from getter */
        public final UnifiedBalances getUnifiedBalances() {
            return this.unifiedBalances;
        }

        /* renamed from: component21, reason: from getter */
        public final boolean getAreMarketsOpenExtended() {
            return this.areMarketsOpenExtended;
        }

        /* renamed from: component22, reason: from getter */
        public final boolean getOverrideNoEnokiAlert() {
            return this.overrideNoEnokiAlert;
        }

        /* renamed from: component23, reason: from getter */
        public final boolean getIsInInterEntityMatchExperiment() {
            return this.isInInterEntityMatchExperiment;
        }

        /* renamed from: component24, reason: from getter */
        public final boolean getShowEnokiCelebration() {
            return this.showEnokiCelebration;
        }

        /* renamed from: component25, reason: from getter */
        public final BigDecimal getAmountRemainingUntilLimit() {
            return this.amountRemainingUntilLimit;
        }

        /* renamed from: component26, reason: from getter */
        public final ContributionCtaAction getCtaAction() {
            return this.ctaAction;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUserInputString() {
            return this.userInputString;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSinkAccountNumber() {
            return this.sinkAccountNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final Year getTaxYear() {
            return this.taxYear;
        }

        /* renamed from: component6, reason: from getter */
        public final ContributionProgressRingState getProgressRingState() {
            return this.progressRingState;
        }

        /* renamed from: component7, reason: from getter */
        public final ContributionReviewModeState getReviewModeState() {
            return this.reviewModeState;
        }

        /* renamed from: component8, reason: from getter */
        public final ContributionEditModeState getEditModeState() {
            return this.editModeState;
        }

        /* renamed from: component9, reason: from getter */
        public final ContributionFooterState getReviewFooterState() {
            return this.reviewFooterState;
        }

        public final Loaded copy(String title, boolean isInEditMode, String userInputString, String sinkAccountNumber, Year taxYear, ContributionProgressRingState progressRingState, ContributionReviewModeState reviewModeState, ContributionEditModeState editModeState, ContributionFooterState reviewFooterState, boolean isContributionRequestLoading, Map<TransferData, UUID> transferDataToRefId, TransferAccount sourceAccount, TransferAccount sinkAccount, ApiCreateTransferRequest2 frequency, IraContributionQuestionnaireResult.IraContribution iraContribution, MAXTransferContext.EntryPoint entryPoint, BigDecimal contributionAmount, TransferConfiguration transferConfiguration, Portfolio portfolio, UnifiedBalances unifiedBalances, boolean areMarketsOpenExtended, boolean overrideNoEnokiAlert, boolean isInInterEntityMatchExperiment, boolean showEnokiCelebration, BigDecimal amountRemainingUntilLimit, ContributionCtaAction ctaAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(userInputString, "userInputString");
            Intrinsics.checkNotNullParameter(sinkAccountNumber, "sinkAccountNumber");
            Intrinsics.checkNotNullParameter(taxYear, "taxYear");
            Intrinsics.checkNotNullParameter(progressRingState, "progressRingState");
            Intrinsics.checkNotNullParameter(reviewModeState, "reviewModeState");
            Intrinsics.checkNotNullParameter(editModeState, "editModeState");
            Intrinsics.checkNotNullParameter(reviewFooterState, "reviewFooterState");
            Intrinsics.checkNotNullParameter(transferDataToRefId, "transferDataToRefId");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(iraContribution, "iraContribution");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(contributionAmount, "contributionAmount");
            Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
            Intrinsics.checkNotNullParameter(amountRemainingUntilLimit, "amountRemainingUntilLimit");
            Intrinsics.checkNotNullParameter(ctaAction, "ctaAction");
            return new Loaded(title, isInEditMode, userInputString, sinkAccountNumber, taxYear, progressRingState, reviewModeState, editModeState, reviewFooterState, isContributionRequestLoading, transferDataToRefId, sourceAccount, sinkAccount, frequency, iraContribution, entryPoint, contributionAmount, transferConfiguration, portfolio, unifiedBalances, areMarketsOpenExtended, overrideNoEnokiAlert, isInInterEntityMatchExperiment, showEnokiCelebration, amountRemainingUntilLimit, ctaAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && this.isInEditMode == loaded.isInEditMode && Intrinsics.areEqual(this.userInputString, loaded.userInputString) && Intrinsics.areEqual(this.sinkAccountNumber, loaded.sinkAccountNumber) && Intrinsics.areEqual(this.taxYear, loaded.taxYear) && Intrinsics.areEqual(this.progressRingState, loaded.progressRingState) && Intrinsics.areEqual(this.reviewModeState, loaded.reviewModeState) && Intrinsics.areEqual(this.editModeState, loaded.editModeState) && Intrinsics.areEqual(this.reviewFooterState, loaded.reviewFooterState) && this.isContributionRequestLoading == loaded.isContributionRequestLoading && Intrinsics.areEqual(this.transferDataToRefId, loaded.transferDataToRefId) && Intrinsics.areEqual(this.sourceAccount, loaded.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, loaded.sinkAccount) && this.frequency == loaded.frequency && Intrinsics.areEqual(this.iraContribution, loaded.iraContribution) && this.entryPoint == loaded.entryPoint && Intrinsics.areEqual(this.contributionAmount, loaded.contributionAmount) && Intrinsics.areEqual(this.transferConfiguration, loaded.transferConfiguration) && Intrinsics.areEqual(this.portfolio, loaded.portfolio) && Intrinsics.areEqual(this.unifiedBalances, loaded.unifiedBalances) && this.areMarketsOpenExtended == loaded.areMarketsOpenExtended && this.overrideNoEnokiAlert == loaded.overrideNoEnokiAlert && this.isInInterEntityMatchExperiment == loaded.isInInterEntityMatchExperiment && this.showEnokiCelebration == loaded.showEnokiCelebration && Intrinsics.areEqual(this.amountRemainingUntilLimit, loaded.amountRemainingUntilLimit) && this.ctaAction == loaded.ctaAction;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((this.title.hashCode() * 31) + Boolean.hashCode(this.isInEditMode)) * 31) + this.userInputString.hashCode()) * 31) + this.sinkAccountNumber.hashCode()) * 31) + this.taxYear.hashCode()) * 31) + this.progressRingState.hashCode()) * 31) + this.reviewModeState.hashCode()) * 31) + this.editModeState.hashCode()) * 31) + this.reviewFooterState.hashCode()) * 31) + Boolean.hashCode(this.isContributionRequestLoading)) * 31) + this.transferDataToRefId.hashCode()) * 31;
            TransferAccount transferAccount = this.sourceAccount;
            int iHashCode2 = (((((((((((((iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31) + this.sinkAccount.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.iraContribution.hashCode()) * 31) + this.entryPoint.hashCode()) * 31) + this.contributionAmount.hashCode()) * 31) + this.transferConfiguration.hashCode()) * 31;
            Portfolio portfolio = this.portfolio;
            int iHashCode3 = (iHashCode2 + (portfolio == null ? 0 : portfolio.hashCode())) * 31;
            UnifiedBalances unifiedBalances = this.unifiedBalances;
            return ((((((((((((iHashCode3 + (unifiedBalances != null ? unifiedBalances.hashCode() : 0)) * 31) + Boolean.hashCode(this.areMarketsOpenExtended)) * 31) + Boolean.hashCode(this.overrideNoEnokiAlert)) * 31) + Boolean.hashCode(this.isInInterEntityMatchExperiment)) * 31) + Boolean.hashCode(this.showEnokiCelebration)) * 31) + this.amountRemainingUntilLimit.hashCode()) * 31) + this.ctaAction.hashCode();
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", isInEditMode=" + this.isInEditMode + ", userInputString=" + this.userInputString + ", sinkAccountNumber=" + this.sinkAccountNumber + ", taxYear=" + this.taxYear + ", progressRingState=" + this.progressRingState + ", reviewModeState=" + this.reviewModeState + ", editModeState=" + this.editModeState + ", reviewFooterState=" + this.reviewFooterState + ", isContributionRequestLoading=" + this.isContributionRequestLoading + ", transferDataToRefId=" + this.transferDataToRefId + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", frequency=" + this.frequency + ", iraContribution=" + this.iraContribution + ", entryPoint=" + this.entryPoint + ", contributionAmount=" + this.contributionAmount + ", transferConfiguration=" + this.transferConfiguration + ", portfolio=" + this.portfolio + ", unifiedBalances=" + this.unifiedBalances + ", areMarketsOpenExtended=" + this.areMarketsOpenExtended + ", overrideNoEnokiAlert=" + this.overrideNoEnokiAlert + ", isInInterEntityMatchExperiment=" + this.isInInterEntityMatchExperiment + ", showEnokiCelebration=" + this.showEnokiCelebration + ", amountRemainingUntilLimit=" + this.amountRemainingUntilLimit + ", ctaAction=" + this.ctaAction + ")";
        }

        @Override // com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionViewState
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.retirement.contributions.RetirementContributionScreen5
        public boolean isInEditMode() {
            return this.isInEditMode;
        }

        public final String getUserInputString() {
            return this.userInputString;
        }

        public final String getSinkAccountNumber() {
            return this.sinkAccountNumber;
        }

        public final Year getTaxYear() {
            return this.taxYear;
        }

        @Override // com.robinhood.android.retirement.contributions.RetirementContributionScreen5
        public ContributionProgressRingState getProgressRingState() {
            return this.progressRingState;
        }

        @Override // com.robinhood.android.retirement.contributions.RetirementContributionScreen5
        public ContributionReviewModeState getReviewModeState() {
            return this.reviewModeState;
        }

        @Override // com.robinhood.android.retirement.contributions.RetirementContributionScreen5
        public ContributionEditModeState getEditModeState() {
            return this.editModeState;
        }

        @Override // com.robinhood.android.retirement.contributions.RetirementContributionScreen5
        public ContributionFooterState getReviewFooterState() {
            return this.reviewFooterState;
        }

        public final boolean isContributionRequestLoading() {
            return this.isContributionRequestLoading;
        }

        public final Map<TransferData, UUID> getTransferDataToRefId() {
            return this.transferDataToRefId;
        }

        public final TransferAccount getSourceAccount() {
            return this.sourceAccount;
        }

        public final TransferAccount getSinkAccount() {
            return this.sinkAccount;
        }

        public final ApiCreateTransferRequest2 getFrequency() {
            return this.frequency;
        }

        public final IraContributionQuestionnaireResult.IraContribution getIraContribution() {
            return this.iraContribution;
        }

        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final BigDecimal getContributionAmount() {
            return this.contributionAmount;
        }

        public final TransferConfiguration getTransferConfiguration() {
            return this.transferConfiguration;
        }

        public final Portfolio getPortfolio() {
            return this.portfolio;
        }

        public final UnifiedBalances getUnifiedBalances() {
            return this.unifiedBalances;
        }

        public final boolean getAreMarketsOpenExtended() {
            return this.areMarketsOpenExtended;
        }

        public final boolean getOverrideNoEnokiAlert() {
            return this.overrideNoEnokiAlert;
        }

        public final boolean isInInterEntityMatchExperiment() {
            return this.isInInterEntityMatchExperiment;
        }

        public final boolean getShowEnokiCelebration() {
            return this.showEnokiCelebration;
        }

        public final BigDecimal getAmountRemainingUntilLimit() {
            return this.amountRemainingUntilLimit;
        }

        public final ContributionCtaAction getCtaAction() {
            return this.ctaAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(String title, boolean z, String userInputString, String sinkAccountNumber, Year taxYear, ContributionProgressRingState progressRingState, ContributionReviewModeState reviewModeState, ContributionEditModeState editModeState, ContributionFooterState reviewFooterState, boolean z2, Map<TransferData, UUID> transferDataToRefId, TransferAccount transferAccount, TransferAccount sinkAccount, ApiCreateTransferRequest2 frequency, IraContributionQuestionnaireResult.IraContribution iraContribution, MAXTransferContext.EntryPoint entryPoint, BigDecimal contributionAmount, TransferConfiguration transferConfiguration, Portfolio portfolio, UnifiedBalances unifiedBalances, boolean z3, boolean z4, boolean z5, boolean z6, BigDecimal amountRemainingUntilLimit, ContributionCtaAction ctaAction) {
            super(title, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(userInputString, "userInputString");
            Intrinsics.checkNotNullParameter(sinkAccountNumber, "sinkAccountNumber");
            Intrinsics.checkNotNullParameter(taxYear, "taxYear");
            Intrinsics.checkNotNullParameter(progressRingState, "progressRingState");
            Intrinsics.checkNotNullParameter(reviewModeState, "reviewModeState");
            Intrinsics.checkNotNullParameter(editModeState, "editModeState");
            Intrinsics.checkNotNullParameter(reviewFooterState, "reviewFooterState");
            Intrinsics.checkNotNullParameter(transferDataToRefId, "transferDataToRefId");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(iraContribution, "iraContribution");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(contributionAmount, "contributionAmount");
            Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
            Intrinsics.checkNotNullParameter(amountRemainingUntilLimit, "amountRemainingUntilLimit");
            Intrinsics.checkNotNullParameter(ctaAction, "ctaAction");
            this.title = title;
            this.isInEditMode = z;
            this.userInputString = userInputString;
            this.sinkAccountNumber = sinkAccountNumber;
            this.taxYear = taxYear;
            this.progressRingState = progressRingState;
            this.reviewModeState = reviewModeState;
            this.editModeState = editModeState;
            this.reviewFooterState = reviewFooterState;
            this.isContributionRequestLoading = z2;
            this.transferDataToRefId = transferDataToRefId;
            this.sourceAccount = transferAccount;
            this.sinkAccount = sinkAccount;
            this.frequency = frequency;
            this.iraContribution = iraContribution;
            this.entryPoint = entryPoint;
            this.contributionAmount = contributionAmount;
            this.transferConfiguration = transferConfiguration;
            this.portfolio = portfolio;
            this.unifiedBalances = unifiedBalances;
            this.areMarketsOpenExtended = z3;
            this.overrideNoEnokiAlert = z4;
            this.isInInterEntityMatchExperiment = z5;
            this.showEnokiCelebration = z6;
            this.amountRemainingUntilLimit = amountRemainingUntilLimit;
            this.ctaAction = ctaAction;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateRetirementContributionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$ContributionCtaAction;", "", "<init>", "(Ljava/lang/String;I)V", "SUBMIT_CONTRIBUTION", "CONTINUE_IN_FULLSCREEN_MATCH_SELECTION", "CONTINUE_TO_CONTRIBUTION_AND_GOLD_AGREEMENTS", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContributionCtaAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContributionCtaAction[] $VALUES;
        public static final ContributionCtaAction SUBMIT_CONTRIBUTION = new ContributionCtaAction("SUBMIT_CONTRIBUTION", 0);
        public static final ContributionCtaAction CONTINUE_IN_FULLSCREEN_MATCH_SELECTION = new ContributionCtaAction("CONTINUE_IN_FULLSCREEN_MATCH_SELECTION", 1);
        public static final ContributionCtaAction CONTINUE_TO_CONTRIBUTION_AND_GOLD_AGREEMENTS = new ContributionCtaAction("CONTINUE_TO_CONTRIBUTION_AND_GOLD_AGREEMENTS", 2);

        private static final /* synthetic */ ContributionCtaAction[] $values() {
            return new ContributionCtaAction[]{SUBMIT_CONTRIBUTION, CONTINUE_IN_FULLSCREEN_MATCH_SELECTION, CONTINUE_TO_CONTRIBUTION_AND_GOLD_AGREEMENTS};
        }

        public static EnumEntries<ContributionCtaAction> getEntries() {
            return $ENTRIES;
        }

        private ContributionCtaAction(String str, int i) {
        }

        static {
            ContributionCtaAction[] contributionCtaActionArr$values = $values();
            $VALUES = contributionCtaActionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contributionCtaActionArr$values);
        }

        public static ContributionCtaAction valueOf(String str) {
            return (ContributionCtaAction) Enum.valueOf(ContributionCtaAction.class, str);
        }

        public static ContributionCtaAction[] values() {
            return (ContributionCtaAction[]) $VALUES.clone();
        }
    }
}
