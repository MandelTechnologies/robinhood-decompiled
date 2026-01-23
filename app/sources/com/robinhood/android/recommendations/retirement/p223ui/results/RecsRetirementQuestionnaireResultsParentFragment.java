package com.robinhood.android.recommendations.retirement.p223ui.results;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.recommendations.retirement.p223ui.results.RecsRetirementQuestionnaireResultsParentFragment;
import com.robinhood.android.recommendations.retirement.p223ui.results.intro.RecsRetirementQuestionnaireResultsIntroFragment;
import com.robinhood.android.recommendations.retirement.p223ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesFragment;
import com.robinhood.android.regiongate.RecommendationsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.recommendations.retirement.models.p364ui.UiQuestionnaireResults;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecsRetirementQuestionnaireResultsParentFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\u001f !B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/RecsRetirementQuestionnaireResultsParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/recommendations/retirement/ui/results/intro/RecsRetirementQuestionnaireResultsIntroFragment$Callbacks;", "Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementQuestionnaireResultsSwipiesFragment$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/recommendations/retirement/ui/results/RecsRetirementQuestionnaireResultsParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/retirement/ui/results/RecsRetirementQuestionnaireResultsParentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCtaClicked", "results", "Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults;", "onLastPageContinue", "recommendationId", "Ljava/util/UUID;", "onExitSwipies", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecsRetirementQuestionnaireResultsParentFragment extends BaseFragment implements RegionGated, RecsRetirementQuestionnaireResultsIntroFragment.Callbacks, RecsRetirementQuestionnaireResultsSwipiesFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecsRetirementQuestionnaireResultsParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/retirement/ui/results/RecsRetirementQuestionnaireResultsParentFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecsRetirementQuestionnaireResultsParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/RecsRetirementQuestionnaireResultsParentFragment$Callbacks;", "", "onQuestionnaireResultsFinished", "", "recommendationId", "Ljava/util/UUID;", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onQuestionnaireResultsFinished(UUID recommendationId);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RecsRetirementQuestionnaireResultsParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(RecommendationsRegionGate.INSTANCE, RetirementRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.RecsRetirementQuestionnaireResultsParentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RecsRetirementQuestionnaireResultsParentFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = C11048R.id.fragment_container;
        RecsRetirementQuestionnaireResultsIntroFragment.Companion companion = RecsRetirementQuestionnaireResultsIntroFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        setFragment(i, companion.newInstance((Parcelable) new RecsRetirementQuestionnaireResultsIntroFragment.Args(((Args) companion2.getArgs((Fragment) this)).getSource(), ((Args) companion2.getArgs((Fragment) this)).getAccountType(), ((Args) companion2.getArgs((Fragment) this)).getAccountNumber())));
    }

    @Override // com.robinhood.android.recommendations.retirement.ui.results.intro.RecsRetirementQuestionnaireResultsIntroFragment.Callbacks
    public void onCtaClicked(UiQuestionnaireResults results) {
        Intrinsics.checkNotNullParameter(results, "results");
        RecsRetirementQuestionnaireResultsSwipiesFragment.Companion companion = RecsRetirementQuestionnaireResultsSwipiesFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new RecsRetirementQuestionnaireResultsSwipiesFragment.Args(results, ((Args) companion2.getArgs((Fragment) this)).getSource(), ((Args) companion2.getArgs((Fragment) this)).getAccountType())));
    }

    @Override // com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesFragment.Callbacks
    public void onLastPageContinue(UUID recommendationId) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        getCallbacks().onQuestionnaireResultsFinished(recommendationId);
    }

    @Override // com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesFragment.Callbacks
    public void onExitSwipies() {
        popLastFragment();
    }

    /* compiled from: RecsRetirementQuestionnaireResultsParentFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/RecsRetirementQuestionnaireResultsParentFragment$Args;", "Landroid/os/Parcelable;", "source", "", "accountNumber", "accountType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getAccountNumber", "getAccountType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String accountType;
        private final String source;

        /* compiled from: RecsRetirementQuestionnaireResultsParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.source;
            }
            if ((i & 2) != 0) {
                str2 = args.accountNumber;
            }
            if ((i & 4) != 0) {
                str3 = args.accountType;
            }
            return args.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountType() {
            return this.accountType;
        }

        public final Args copy(String source, String accountNumber, String accountType) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new Args(source, accountNumber, accountType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.accountType, args.accountType);
        }

        public int hashCode() {
            return (((this.source.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.accountType.hashCode();
        }

        public String toString() {
            return "Args(source=" + this.source + ", accountNumber=" + this.accountNumber + ", accountType=" + this.accountType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.accountNumber);
            dest.writeString(this.accountType);
        }

        public Args(String source, String accountNumber, String accountType) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.source = source;
            this.accountNumber = accountNumber;
            this.accountType = accountType;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getAccountType() {
            return this.accountType;
        }
    }

    /* compiled from: RecsRetirementQuestionnaireResultsParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/RecsRetirementQuestionnaireResultsParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/retirement/ui/results/RecsRetirementQuestionnaireResultsParentFragment;", "Lcom/robinhood/android/recommendations/retirement/ui/results/RecsRetirementQuestionnaireResultsParentFragment$Args;", "<init>", "()V", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecsRetirementQuestionnaireResultsParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecsRetirementQuestionnaireResultsParentFragment recsRetirementQuestionnaireResultsParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recsRetirementQuestionnaireResultsParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecsRetirementQuestionnaireResultsParentFragment newInstance(Args args) {
            return (RecsRetirementQuestionnaireResultsParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecsRetirementQuestionnaireResultsParentFragment recsRetirementQuestionnaireResultsParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recsRetirementQuestionnaireResultsParentFragment, args);
        }
    }
}
