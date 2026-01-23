package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown;

import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassBreakdownDto;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: AdvisoryPortfolioRevealAssetBreakdownFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AdvisoryPortfolioRevealAssetBreakdownFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "callbacks", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AdvisoryPortfolioRevealAssetBreakdownFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AdvisoryPortfolioRevealAssetBreakdownFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryPortfolioRevealAssetBreakdownFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvisoryPortfolioRevealAssetBreakdownFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AdvisoryPortfolioRevealAssetBreakdownFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: AdvisoryPortfolioRevealAssetBreakdownFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AdvisoryPortfolioRevealAssetBreakdownFragment$Callbacks;", "", "onShowInvestorProfileUpdate", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onShowInvestorProfileUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(AdvisoryPortfolioRevealAssetBreakdownFragment advisoryPortfolioRevealAssetBreakdownFragment, int i, Composer composer, int i2) {
        advisoryPortfolioRevealAssetBreakdownFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1764462281);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1764462281, i2, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownFragment.ComposeContent (AdvisoryPortfolioRevealAssetBreakdownFragment.kt:28)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-709740305, true, new C89871(), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryPortfolioRevealAssetBreakdownFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AdvisoryPortfolioRevealAssetBreakdownFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownFragment$ComposeContent$1 */
    static final class C89871 implements Function2<Composer, Integer, Unit> {
        C89871() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-709740305, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownFragment.ComposeContent.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownFragment.kt:32)");
            }
            Companion companion = AdvisoryPortfolioRevealAssetBreakdownFragment.INSTANCE;
            AssetClassBreakdownData uiModel = AdvisoryPortfolioRevealAssetBreakdownComposable.toUiModel(((Args) companion.getArgs((Fragment) AdvisoryPortfolioRevealAssetBreakdownFragment.this)).getDto());
            BrokerageAccountType brokerageAccountType = ((Args) companion.getArgs((Fragment) AdvisoryPortfolioRevealAssetBreakdownFragment.this)).getBrokerageAccountType();
            String source = ((Args) companion.getArgs((Fragment) AdvisoryPortfolioRevealAssetBreakdownFragment.this)).getSource();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(AdvisoryPortfolioRevealAssetBreakdownFragment.this);
            final AdvisoryPortfolioRevealAssetBreakdownFragment advisoryPortfolioRevealAssetBreakdownFragment = AdvisoryPortfolioRevealAssetBreakdownFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvisoryPortfolioRevealAssetBreakdownFragment.C89871.invoke$lambda$1$lambda$0(advisoryPortfolioRevealAssetBreakdownFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            Callbacks callbacks = AdvisoryPortfolioRevealAssetBreakdownFragment.this.getCallbacks();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(callbacks);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new AdvisoryPortfolioRevealAssetBreakdownFragment2(callbacks);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AdvisoryPortfolioRevealAssetBreakdownComposable.AdvisoryPortfolioRevealAssetBreakdownComposable(uiModel, brokerageAccountType, source, function0, (Function0) ((KFunction) objRememberedValue2), null, composer, 0, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AdvisoryPortfolioRevealAssetBreakdownFragment advisoryPortfolioRevealAssetBreakdownFragment) {
            advisoryPortfolioRevealAssetBreakdownFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AdvisoryPortfolioRevealAssetBreakdownFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AdvisoryPortfolioRevealAssetBreakdownFragment$Args;", "Landroid/os/Parcelable;", "dto", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "", "<init>", "(Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;)V", "getDto", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BrokerageAccountType brokerageAccountType;
        private final PortfolioRevealAssetClassBreakdownDto dto;
        private final String source;

        /* compiled from: AdvisoryPortfolioRevealAssetBreakdownFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((PortfolioRevealAssetClassBreakdownDto) parcel.readParcelable(Args.class.getClassLoader()), BrokerageAccountType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, PortfolioRevealAssetClassBreakdownDto portfolioRevealAssetClassBreakdownDto, BrokerageAccountType brokerageAccountType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                portfolioRevealAssetClassBreakdownDto = args.dto;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = args.brokerageAccountType;
            }
            if ((i & 4) != 0) {
                str = args.source;
            }
            return args.copy(portfolioRevealAssetClassBreakdownDto, brokerageAccountType, str);
        }

        /* renamed from: component1, reason: from getter */
        public final PortfolioRevealAssetClassBreakdownDto getDto() {
            return this.dto;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(PortfolioRevealAssetClassBreakdownDto dto, BrokerageAccountType brokerageAccountType, String source) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(dto, brokerageAccountType, source);
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
            return Intrinsics.areEqual(this.dto, args.dto) && this.brokerageAccountType == args.brokerageAccountType && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            return (((this.dto.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Args(dto=" + this.dto + ", brokerageAccountType=" + this.brokerageAccountType + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.dto, flags);
            dest.writeString(this.brokerageAccountType.name());
            dest.writeString(this.source);
        }

        public Args(PortfolioRevealAssetClassBreakdownDto dto, BrokerageAccountType brokerageAccountType, String source) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(source, "source");
            this.dto = dto;
            this.brokerageAccountType = brokerageAccountType;
            this.source = source;
        }

        public final PortfolioRevealAssetClassBreakdownDto getDto() {
            return this.dto;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: AdvisoryPortfolioRevealAssetBreakdownFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AdvisoryPortfolioRevealAssetBreakdownFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AdvisoryPortfolioRevealAssetBreakdownFragment;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/breakdown/AdvisoryPortfolioRevealAssetBreakdownFragment$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AdvisoryPortfolioRevealAssetBreakdownFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AdvisoryPortfolioRevealAssetBreakdownFragment advisoryPortfolioRevealAssetBreakdownFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, advisoryPortfolioRevealAssetBreakdownFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvisoryPortfolioRevealAssetBreakdownFragment newInstance(Args args) {
            return (AdvisoryPortfolioRevealAssetBreakdownFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvisoryPortfolioRevealAssetBreakdownFragment advisoryPortfolioRevealAssetBreakdownFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, advisoryPortfolioRevealAssetBreakdownFragment, args);
        }
    }
}
