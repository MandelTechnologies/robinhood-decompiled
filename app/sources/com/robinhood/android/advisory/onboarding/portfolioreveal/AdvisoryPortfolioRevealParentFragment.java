package com.robinhood.android.advisory.onboarding.portfolioreveal;

import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealResponseDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassBreakdownDto;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.advisory.contracts.AdvisoryUpdatePortfolioFragmentKey;
import com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationFragment;
import com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownFragment;
import com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesFragment;
import com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
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

/* compiled from: AdvisoryPortfolioRevealParentFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002'(B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020!H\u0096\u0001R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/AdvisoryPortfolioRevealParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/intro/AdvisoryPortfolioRevealIntroFragment$Callbacks;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/infopages/AdvisoryPortfolioRevealInfoPagesFragment$Callbacks;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/AdvisoryPortfolioRevealAllocationFragment$Callbacks;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AdvisoryPortfolioRevealAssetBreakdownFragment$Callbacks;", "Lcom/robinhood/android/advisory/contracts/AdvisoryUpdatePortfolioFragmentKey$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/AdvisoryPortfolioRevealCallbacks;", "getCallbacks", "()Lcom/robinhood/android/advisory/onboarding/portfolioreveal/AdvisoryPortfolioRevealCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "portfolioReveal", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onContinueIntro", "onContinueInfoPages", "onShowAssetClassBreakdown", "assetClassBreakdown", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "onCompletePortfolioReveal", "onShowInvestorProfileUpdate", "onInvestorProfileUpdateComplete", "nextScreenTitle", "", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryPortfolioRevealParentFragment extends BaseFragment implements RegionGated, AdvisoryPortfolioRevealIntroFragment.Callbacks, AdvisoryPortfolioRevealInfoPagesFragment.Callbacks, AdvisoryPortfolioRevealAllocationFragment.Callbacks, AdvisoryPortfolioRevealAssetBreakdownFragment.Callbacks, AdvisoryUpdatePortfolioFragmentKey.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private GetPortfolioRevealResponseDto portfolioReveal;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvisoryPortfolioRevealParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advisory/onboarding/portfolioreveal/AdvisoryPortfolioRevealCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public AdvisoryPortfolioRevealParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(AdvisoryRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AdvisoryPortfolioRevealCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.AdvisoryPortfolioRevealParentFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final AdvisoryPortfolioRevealCallbacks getCallbacks() {
        return (AdvisoryPortfolioRevealCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            AdvisoryPortfolioRevealIntroFragment.Companion companion = AdvisoryPortfolioRevealIntroFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            BrokerageAccountType brokerageAccountType = ((Args) companion2.getArgs((Fragment) this)).getBrokerageAccountType();
            UUID applicationId = ((Args) companion2.getArgs((Fragment) this)).getApplicationId();
            String source = ((Args) companion2.getArgs((Fragment) this)).getSource();
            if (source == null) {
                source = "";
            }
            setFragment(i, companion.newInstance((Parcelable) new AdvisoryPortfolioRevealIntroFragment.Args(brokerageAccountType, applicationId, source)));
        }
    }

    @Override // com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroFragment.Callbacks
    public void onContinueIntro(GetPortfolioRevealResponseDto portfolioReveal) {
        Intrinsics.checkNotNullParameter(portfolioReveal, "portfolioReveal");
        this.portfolioReveal = portfolioReveal;
        AdvisoryPortfolioRevealInfoPagesFragment.Companion companion = AdvisoryPortfolioRevealInfoPagesFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        BrokerageAccountType brokerageAccountType = ((Args) companion2.getArgs((Fragment) this)).getBrokerageAccountType();
        String source = ((Args) companion2.getArgs((Fragment) this)).getSource();
        if (source == null) {
            source = "";
        }
        replaceFragment(companion.newInstance((Parcelable) new AdvisoryPortfolioRevealInfoPagesFragment.Args(portfolioReveal, brokerageAccountType, source)));
    }

    @Override // com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.AdvisoryPortfolioRevealInfoPagesFragment.Callbacks
    public void onContinueInfoPages(GetPortfolioRevealResponseDto portfolioReveal) {
        Intrinsics.checkNotNullParameter(portfolioReveal, "portfolioReveal");
        this.portfolioReveal = portfolioReveal;
        AdvisoryPortfolioRevealAllocationFragment.Companion companion = AdvisoryPortfolioRevealAllocationFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        UUID applicationId = ((Args) companion2.getArgs((Fragment) this)).getApplicationId();
        BrokerageAccountType brokerageAccountType = ((Args) companion2.getArgs((Fragment) this)).getBrokerageAccountType();
        String source = ((Args) companion2.getArgs((Fragment) this)).getSource();
        if (source == null) {
            source = "";
        }
        replaceFragment(companion.newInstance((Parcelable) new AdvisoryPortfolioRevealAllocationFragment.Args(portfolioReveal, null, brokerageAccountType, source, applicationId)));
    }

    @Override // com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationFragment.Callbacks
    public void onShowAssetClassBreakdown(PortfolioRevealAssetClassBreakdownDto assetClassBreakdown) {
        Intrinsics.checkNotNullParameter(assetClassBreakdown, "assetClassBreakdown");
        AdvisoryPortfolioRevealAssetBreakdownFragment.Companion companion = AdvisoryPortfolioRevealAssetBreakdownFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        BrokerageAccountType brokerageAccountType = ((Args) companion2.getArgs((Fragment) this)).getBrokerageAccountType();
        String source = ((Args) companion2.getArgs((Fragment) this)).getSource();
        if (source == null) {
            source = "";
        }
        replaceFragment(companion.newInstance((Parcelable) new AdvisoryPortfolioRevealAssetBreakdownFragment.Args(assetClassBreakdown, brokerageAccountType, source)));
    }

    @Override // com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationFragment.Callbacks
    public void onCompletePortfolioReveal() {
        getCallbacks().onCompletePortfolioReveal(((Args) INSTANCE.getArgs((Fragment) this)).getApplicationId());
    }

    @Override // com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationFragment.Callbacks, com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownFragment.Callbacks
    public void onShowInvestorProfileUpdate() {
        Navigator navigator = getNavigator();
        Companion companion = INSTANCE;
        replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new AdvisoryUpdatePortfolioFragmentKey(null, ((Args) companion.getArgs((Fragment) this)).getApplicationId().toString(), ((Args) companion.getArgs((Fragment) this)).getBrokerageAccountType()), null, 2, null));
    }

    @Override // com.robinhood.android.advisory.contracts.AdvisoryUpdatePortfolioFragmentKey.Callbacks
    public void onInvestorProfileUpdateComplete(String nextScreenTitle) {
        Intrinsics.checkNotNullParameter(nextScreenTitle, "nextScreenTitle");
        GetPortfolioRevealResponseDto getPortfolioRevealResponseDto = this.portfolioReveal;
        if (getPortfolioRevealResponseDto != null) {
            popFragments(1);
            AdvisoryPortfolioRevealAllocationFragment.Companion companion = AdvisoryPortfolioRevealAllocationFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            UUID applicationId = ((Args) companion2.getArgs((Fragment) this)).getApplicationId();
            BrokerageAccountType brokerageAccountType = ((Args) companion2.getArgs((Fragment) this)).getBrokerageAccountType();
            String source = ((Args) companion2.getArgs((Fragment) this)).getSource();
            if (source == null) {
                source = "";
            }
            replaceFragmentWithoutBackStack(companion.newInstance((Parcelable) new AdvisoryPortfolioRevealAllocationFragment.Args(getPortfolioRevealResponseDto, nextScreenTitle, brokerageAccountType, source, applicationId)));
        }
    }

    /* compiled from: AdvisoryPortfolioRevealParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/AdvisoryPortfolioRevealParentFragment$Args;", "Landroid/os/Parcelable;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "applicationId", "Ljava/util/UUID;", "source", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/UUID;Ljava/lang/String;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getApplicationId", "()Ljava/util/UUID;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID applicationId;
        private final BrokerageAccountType brokerageAccountType;
        private final String source;

        /* compiled from: AdvisoryPortfolioRevealParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(BrokerageAccountType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, BrokerageAccountType brokerageAccountType, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = args.brokerageAccountType;
            }
            if ((i & 2) != 0) {
                uuid = args.applicationId;
            }
            if ((i & 4) != 0) {
                str = args.source;
            }
            return args.copy(brokerageAccountType, uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(BrokerageAccountType brokerageAccountType, UUID applicationId, String source) {
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            return new Args(brokerageAccountType, applicationId, source);
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
            return this.brokerageAccountType == args.brokerageAccountType && Intrinsics.areEqual(this.applicationId, args.applicationId) && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            int iHashCode = ((this.brokerageAccountType.hashCode() * 31) + this.applicationId.hashCode()) * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(brokerageAccountType=" + this.brokerageAccountType + ", applicationId=" + this.applicationId + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.brokerageAccountType.name());
            dest.writeSerializable(this.applicationId);
            dest.writeString(this.source);
        }

        public Args(BrokerageAccountType brokerageAccountType, UUID applicationId, String str) {
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            this.brokerageAccountType = brokerageAccountType;
            this.applicationId = applicationId;
            this.source = str;
        }

        public /* synthetic */ Args(BrokerageAccountType brokerageAccountType, UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(brokerageAccountType, uuid, (i & 4) != 0 ? null : str);
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final UUID getApplicationId() {
            return this.applicationId;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: AdvisoryPortfolioRevealParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/AdvisoryPortfolioRevealParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/AdvisoryPortfolioRevealParentFragment;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/AdvisoryPortfolioRevealParentFragment$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AdvisoryPortfolioRevealParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AdvisoryPortfolioRevealParentFragment advisoryPortfolioRevealParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, advisoryPortfolioRevealParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvisoryPortfolioRevealParentFragment newInstance(Args args) {
            return (AdvisoryPortfolioRevealParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvisoryPortfolioRevealParentFragment advisoryPortfolioRevealParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, advisoryPortfolioRevealParentFragment, args);
        }
    }
}
