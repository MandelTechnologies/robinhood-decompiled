package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation;

import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealResponseDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassBreakdownDto;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AdvisoryPortfolioRevealAllocationFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0003 !\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0017\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/AdvisoryPortfolioRevealAllocationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "callbacks", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/AdvisoryPortfolioRevealAllocationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/AdvisoryPortfolioRevealAllocationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationDuxo;", "getDuxo", "()Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onContinueClicked", "onAdjustPortfolioClicked", "onShowAssetClassBreakdown", "breakdown", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "onBackClicked", "Callbacks", "Args", "Companion", "feature-advisory-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryPortfolioRevealAllocationFragment extends GenericComposeFragment implements AdvsoryPortfolioRevealAllocationComposable7 {
    public static final int $stable = 0;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvisoryPortfolioRevealAllocationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/AdvisoryPortfolioRevealAllocationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PortfolioRevealAllocationDuxo.class);

    /* compiled from: AdvisoryPortfolioRevealAllocationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/AdvisoryPortfolioRevealAllocationFragment$Callbacks;", "", "onShowAssetClassBreakdown", "", "assetClassBreakdown", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "onCompletePortfolioReveal", "onShowInvestorProfileUpdate", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCompletePortfolioReveal();

        void onShowAssetClassBreakdown(PortfolioRevealAssetClassBreakdownDto assetClassBreakdown);

        void onShowInvestorProfileUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AdvisoryPortfolioRevealAllocationFragment advisoryPortfolioRevealAllocationFragment, int i, Composer composer, int i2) {
        advisoryPortfolioRevealAllocationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final PortfolioRevealAllocationDuxo getDuxo() {
        return (PortfolioRevealAllocationDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1395839386);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1395839386, i2, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationFragment.ComposeContent (AdvisoryPortfolioRevealAllocationFragment.kt:39)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(192672798, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(192672798, i3, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationFragment.ComposeContent.<anonymous> (AdvisoryPortfolioRevealAllocationFragment.kt:44)");
                    }
                    Companion companion = AdvisoryPortfolioRevealAllocationFragment.INSTANCE;
                    AdvsoryPortfolioRevealAllocationComposable.AdvisoryPortfolioRevealAllocationComposable(((Args) companion.getArgs((Fragment) AdvisoryPortfolioRevealAllocationFragment.this)).getScreenTitle(), AdvisoryPortfolioRevealAllocationFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getPortfolioReveal(), ((Args) companion.getArgs((Fragment) AdvisoryPortfolioRevealAllocationFragment.this)).getSource(), ((Args) companion.getArgs((Fragment) AdvisoryPortfolioRevealAllocationFragment.this)).getBrokerageAccountType(), AdvisoryPortfolioRevealAllocationFragment.this, null, composer2, 0, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryPortfolioRevealAllocationFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposable7
    public void onContinueClicked() {
        getCallbacks().onCompletePortfolioReveal();
    }

    @Override // com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposable7
    public void onAdjustPortfolioClicked() {
        getCallbacks().onShowInvestorProfileUpdate();
    }

    @Override // com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposable7
    public void onShowAssetClassBreakdown(PortfolioRevealAssetClassBreakdownDto breakdown) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        getCallbacks().onShowAssetClassBreakdown(breakdown);
    }

    @Override // com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposable7
    public void onBackClicked() {
        requireBaseActivity().onBackPressed();
    }

    /* compiled from: AdvisoryPortfolioRevealAllocationFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/AdvisoryPortfolioRevealAllocationFragment$Args;", "Landroid/os/Parcelable;", "portfolioReveal", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "screenTitle", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "applicationId", "Ljava/util/UUID;", "<init>", "(Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Ljava/util/UUID;)V", "getPortfolioReveal", "()Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "getScreenTitle", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSource", "getApplicationId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID applicationId;
        private final BrokerageAccountType brokerageAccountType;
        private final GetPortfolioRevealResponseDto portfolioReveal;
        private final String screenTitle;
        private final String source;

        /* compiled from: AdvisoryPortfolioRevealAllocationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((GetPortfolioRevealResponseDto) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString(), BrokerageAccountType.valueOf(parcel.readString()), parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, GetPortfolioRevealResponseDto getPortfolioRevealResponseDto, String str, BrokerageAccountType brokerageAccountType, String str2, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                getPortfolioRevealResponseDto = args.portfolioReveal;
            }
            if ((i & 2) != 0) {
                str = args.screenTitle;
            }
            if ((i & 4) != 0) {
                brokerageAccountType = args.brokerageAccountType;
            }
            if ((i & 8) != 0) {
                str2 = args.source;
            }
            if ((i & 16) != 0) {
                uuid = args.applicationId;
            }
            UUID uuid2 = uuid;
            BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
            return args.copy(getPortfolioRevealResponseDto, str, brokerageAccountType2, str2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final GetPortfolioRevealResponseDto getPortfolioReveal() {
            return this.portfolioReveal;
        }

        /* renamed from: component2, reason: from getter */
        public final String getScreenTitle() {
            return this.screenTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getApplicationId() {
            return this.applicationId;
        }

        public final Args copy(GetPortfolioRevealResponseDto portfolioReveal, String screenTitle, BrokerageAccountType brokerageAccountType, String source, UUID applicationId) {
            Intrinsics.checkNotNullParameter(portfolioReveal, "portfolioReveal");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(portfolioReveal, screenTitle, brokerageAccountType, source, applicationId);
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
            return Intrinsics.areEqual(this.portfolioReveal, args.portfolioReveal) && Intrinsics.areEqual(this.screenTitle, args.screenTitle) && this.brokerageAccountType == args.brokerageAccountType && Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.applicationId, args.applicationId);
        }

        public int hashCode() {
            int iHashCode = this.portfolioReveal.hashCode() * 31;
            String str = this.screenTitle;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.brokerageAccountType.hashCode()) * 31) + this.source.hashCode()) * 31;
            UUID uuid = this.applicationId;
            return iHashCode2 + (uuid != null ? uuid.hashCode() : 0);
        }

        public String toString() {
            return "Args(portfolioReveal=" + this.portfolioReveal + ", screenTitle=" + this.screenTitle + ", brokerageAccountType=" + this.brokerageAccountType + ", source=" + this.source + ", applicationId=" + this.applicationId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.portfolioReveal, flags);
            dest.writeString(this.screenTitle);
            dest.writeString(this.brokerageAccountType.name());
            dest.writeString(this.source);
            dest.writeSerializable(this.applicationId);
        }

        public Args(GetPortfolioRevealResponseDto portfolioReveal, String str, BrokerageAccountType brokerageAccountType, String source, UUID uuid) {
            Intrinsics.checkNotNullParameter(portfolioReveal, "portfolioReveal");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(source, "source");
            this.portfolioReveal = portfolioReveal;
            this.screenTitle = str;
            this.brokerageAccountType = brokerageAccountType;
            this.source = source;
            this.applicationId = uuid;
        }

        public final GetPortfolioRevealResponseDto getPortfolioReveal() {
            return this.portfolioReveal;
        }

        public final String getScreenTitle() {
            return this.screenTitle;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final String getSource() {
            return this.source;
        }

        public final UUID getApplicationId() {
            return this.applicationId;
        }
    }

    /* compiled from: AdvisoryPortfolioRevealAllocationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/AdvisoryPortfolioRevealAllocationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/AdvisoryPortfolioRevealAllocationFragment;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/AdvisoryPortfolioRevealAllocationFragment$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AdvisoryPortfolioRevealAllocationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AdvisoryPortfolioRevealAllocationFragment advisoryPortfolioRevealAllocationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, advisoryPortfolioRevealAllocationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvisoryPortfolioRevealAllocationFragment newInstance(Args args) {
            return (AdvisoryPortfolioRevealAllocationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvisoryPortfolioRevealAllocationFragment advisoryPortfolioRevealAllocationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, advisoryPortfolioRevealAllocationFragment, args);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortfolioRevealAllocationViewState ComposeContent$lambda$0(SnapshotState4<PortfolioRevealAllocationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
