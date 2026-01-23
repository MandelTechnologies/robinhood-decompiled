package com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.transfers.p271ui.max.posttransfer.TransferSuccessActivity;
import com.robinhood.android.transfers.p271ui.retirement.contributions.ContributionBundle;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionFragment;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.options.MatchOptionsFragment;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.shared.transfers.contracts.TransferSuccessIntentKey;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.p409ui.activity.ActivityCompanion3;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: MatchSelectionActivity.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementFragment$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMatchRateSelected", "type", "Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "showGoldRejoinFlow", "", "onContinue", "bundle", "Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "onSuccessfulContribution", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onNotEligible", "Extras", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class MatchSelectionActivity extends BaseActivity implements MatchOptionsFragment.Callbacks, CreateRetirementContributionFragment.Callbacks, ContributionAndAgreementFragment.Callbacks {
    public static final int RESULT_NOT_ELIGIBLE = 999;
    public static final String TRANSFER_ID_EXTRA = "transfer_id";
    public SurveyManager3 userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MatchSelectionActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Extras.LaunchMode launchMode = ((Extras) INSTANCE.getExtras((Activity) this)).getLaunchMode();
            if (launchMode instanceof Extras.LaunchMode.MatchRateSelection) {
                setFragment(C11048R.id.fragment_container, MatchOptionsFragment.INSTANCE.newInstance());
            } else {
                if (!(launchMode instanceof Extras.LaunchMode.ContributionAndAgreement)) {
                    throw new NoWhenBranchMatchedException();
                }
                setFragment(C11048R.id.fragment_container, ContributionAndAgreementFragment.INSTANCE.newInstance((Parcelable) new ContributionAndAgreementFragment.Args(((Extras.LaunchMode.ContributionAndAgreement) launchMode).getContributionBundle(), true, false, 4, null)));
            }
        }
    }

    @Override // com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment.Callbacks
    public void onMatchRateSelected(ApiRetirementMatchResponse3 type2, boolean showGoldRejoinFlow) {
        CreateRetirementContributionFragment createRetirementContributionFragment;
        Intrinsics.checkNotNullParameter(type2, "type");
        Extras.LaunchMode launchMode = ((Extras) INSTANCE.getExtras((Activity) this)).getLaunchMode();
        Intrinsics.checkNotNull(launchMode, "null cannot be cast to non-null type com.robinhood.android.transfers.ui.retirement.contributions.matchselection.MatchSelectionActivity.Extras.LaunchMode.MatchRateSelection");
        Extras.LaunchMode.MatchRateSelection matchRateSelection = (Extras.LaunchMode.MatchRateSelection) launchMode;
        if (type2 == ApiRetirementMatchResponse3.BASE) {
            createRetirementContributionFragment = (CreateRetirementContributionFragment) CreateRetirementContributionFragment.INSTANCE.newInstance((Parcelable) new CreateRetirementContributionFragment.Args(matchRateSelection.getAccountNumber(), matchRateSelection.getAmount(), matchRateSelection.getShowEnokiCelebration(), matchRateSelection.getShowFrequencyRow(), matchRateSelection.getEntryPoint(), type2, matchRateSelection.getSelectedTaxYear(), true, false, false, 768, null));
        } else {
            createRetirementContributionFragment = (CreateRetirementContributionFragment) CreateRetirementContributionFragment.INSTANCE.newInstance((Parcelable) new CreateRetirementContributionFragment.Args(matchRateSelection.getAccountNumber(), matchRateSelection.getAmount(), matchRateSelection.getShowEnokiCelebration(), matchRateSelection.getShowFrequencyRow(), matchRateSelection.getEntryPoint(), type2, matchRateSelection.getSelectedTaxYear(), true, true, showGoldRejoinFlow));
        }
        replaceFragment(createRetirementContributionFragment);
    }

    @Override // com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.Callbacks
    public void onContinue(ContributionBundle bundle, boolean showGoldRejoinFlow) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        replaceFragment((ContributionAndAgreementFragment) ContributionAndAgreementFragment.INSTANCE.newInstance((Parcelable) new ContributionAndAgreementFragment.Args(bundle, false, showGoldRejoinFlow)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.transfers.p271ui.retirement.contributions.ContributionSubmitterCallbacks
    public void onSuccessfulContribution(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        getUserLeapManager().track(TrackingEvent.FINISHED_CONTRIBUTION);
        if (!postTransferFlow.getPostTransferPages().isEmpty()) {
            startActivity(TransferSuccessActivity.INSTANCE.getIntentWithExtras((Context) this, (Parcelable) new TransferSuccessIntentKey(postTransferFlow, null, 2, 0 == true ? 1 : 0)));
            setResult(-1);
        } else {
            String transferId = postTransferFlow.getTransferId();
            Intent intent = new Intent();
            intent.putExtra(TRANSFER_ID_EXTRA, transferId);
            Unit unit = Unit.INSTANCE;
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.EligibilityDeterminerCallbacks
    public void onNotEligible() {
        setResult(999);
        finish();
    }

    /* compiled from: MatchSelectionActivity.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras;", "Landroid/os/Parcelable;", "launchMode", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras$LaunchMode;", "<init>", "(Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras$LaunchMode;)V", "getLaunchMode", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras$LaunchMode;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LaunchMode", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Extras implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        private final LaunchMode launchMode;

        /* compiled from: MatchSelectionActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Extras((LaunchMode) parcel.readParcelable(Extras.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public static /* synthetic */ Extras copy$default(Extras extras, LaunchMode launchMode, int i, Object obj) {
            if ((i & 1) != 0) {
                launchMode = extras.launchMode;
            }
            return extras.copy(launchMode);
        }

        /* renamed from: component1, reason: from getter */
        public final LaunchMode getLaunchMode() {
            return this.launchMode;
        }

        public final Extras copy(LaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            return new Extras(launchMode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Extras) && Intrinsics.areEqual(this.launchMode, ((Extras) other).launchMode);
        }

        public int hashCode() {
            return this.launchMode.hashCode();
        }

        public String toString() {
            return "Extras(launchMode=" + this.launchMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.launchMode, flags);
        }

        public Extras(LaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            this.launchMode = launchMode;
        }

        public final LaunchMode getLaunchMode() {
            return this.launchMode;
        }

        /* compiled from: MatchSelectionActivity.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras$LaunchMode;", "Landroid/os/Parcelable;", "MatchRateSelection", "ContributionAndAgreement", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras$LaunchMode$ContributionAndAgreement;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras$LaunchMode$MatchRateSelection;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface LaunchMode extends Parcelable {

            /* compiled from: MatchSelectionActivity.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b'\u0010&¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras$LaunchMode$MatchRateSelection;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras$LaunchMode;", "", "accountNumber", "Ljava/math/BigDecimal;", "amount", "j$/time/Year", "selectedTaxYear", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPoint", "", "showEnokiCelebration", "showFrequencyRow", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Lj$/time/Year;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getAccountNumber", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "Lj$/time/Year;", "getSelectedTaxYear", "()Lj$/time/Year;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "Z", "getShowEnokiCelebration", "()Z", "getShowFrequencyRow", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MatchRateSelection implements LaunchMode {
                public static final int $stable = 8;
                public static final Parcelable.Creator<MatchRateSelection> CREATOR = new Creator();
                private final String accountNumber;
                private final BigDecimal amount;
                private final MAXTransferContext.EntryPoint entryPoint;
                private final Year selectedTaxYear;
                private final boolean showEnokiCelebration;
                private final boolean showFrequencyRow;

                /* compiled from: MatchSelectionActivity.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<MatchRateSelection> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final MatchRateSelection createFromParcel(Parcel parcel) {
                        boolean z;
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        String string2 = parcel.readString();
                        BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                        Year year = (Year) parcel.readSerializable();
                        MAXTransferContext.EntryPoint entryPointValueOf = MAXTransferContext.EntryPoint.valueOf(parcel.readString());
                        boolean z2 = false;
                        if (parcel.readInt() != 0) {
                            z = false;
                            z2 = true;
                        } else {
                            z = false;
                        }
                        return new MatchRateSelection(string2, bigDecimal, year, entryPointValueOf, z2, parcel.readInt() == 0 ? z : true);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final MatchRateSelection[] newArray(int i) {
                        return new MatchRateSelection[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.accountNumber);
                    dest.writeSerializable(this.amount);
                    dest.writeSerializable(this.selectedTaxYear);
                    dest.writeString(this.entryPoint.name());
                    dest.writeInt(this.showEnokiCelebration ? 1 : 0);
                    dest.writeInt(this.showFrequencyRow ? 1 : 0);
                }

                public MatchRateSelection(String accountNumber, BigDecimal amount, Year year, MAXTransferContext.EntryPoint entryPoint, boolean z, boolean z2) {
                    Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                    this.accountNumber = accountNumber;
                    this.amount = amount;
                    this.selectedTaxYear = year;
                    this.entryPoint = entryPoint;
                    this.showEnokiCelebration = z;
                    this.showFrequencyRow = z2;
                }

                public final String getAccountNumber() {
                    return this.accountNumber;
                }

                public final BigDecimal getAmount() {
                    return this.amount;
                }

                public final Year getSelectedTaxYear() {
                    return this.selectedTaxYear;
                }

                public final MAXTransferContext.EntryPoint getEntryPoint() {
                    return this.entryPoint;
                }

                public final boolean getShowEnokiCelebration() {
                    return this.showEnokiCelebration;
                }

                public final boolean getShowFrequencyRow() {
                    return this.showFrequencyRow;
                }
            }

            /* compiled from: MatchSelectionActivity.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras$LaunchMode$ContributionAndAgreement;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras$LaunchMode;", "contributionBundle", "Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "<init>", "(Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;)V", "getContributionBundle", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class ContributionAndAgreement implements LaunchMode {
                public static final int $stable = 8;
                public static final Parcelable.Creator<ContributionAndAgreement> CREATOR = new Creator();
                private final ContributionBundle contributionBundle;

                /* compiled from: MatchSelectionActivity.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<ContributionAndAgreement> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ContributionAndAgreement createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ContributionAndAgreement(ContributionBundle.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ContributionAndAgreement[] newArray(int i) {
                        return new ContributionAndAgreement[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    this.contributionBundle.writeToParcel(dest, flags);
                }

                public ContributionAndAgreement(ContributionBundle contributionBundle) {
                    Intrinsics.checkNotNullParameter(contributionBundle, "contributionBundle");
                    this.contributionBundle = contributionBundle;
                }

                public final ContributionBundle getContributionBundle() {
                    return this.contributionBundle;
                }
            }
        }
    }

    /* compiled from: MatchSelectionActivity.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Companion;", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras;", "<init>", "()V", "RESULT_NOT_ELIGIBLE", "", "TRANSFER_ID_EXTRA", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements ActivityCompanion3<MatchSelectionActivity, Extras> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Extras getExtras(MatchSelectionActivity matchSelectionActivity) {
            return (Extras) ActivityCompanion3.DefaultImpls.getExtras(this, matchSelectionActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Extras extras) {
            return ActivityCompanion3.DefaultImpls.getIntentWithExtras(this, context, extras);
        }
    }
}
