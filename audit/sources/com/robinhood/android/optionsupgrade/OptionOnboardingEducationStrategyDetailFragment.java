package com.robinhood.android.optionsupgrade;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.optionsupgrade.databinding.FragmentOptionsUpgradeStrategyDetailBinding;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionOnboardingEducationStrategyDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0003\u001c\u001d\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\fH\u0002J\t\u0010\u0015\u001a\u00020\u0016H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationStrategyDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "binding", "Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionsUpgradeStrategyDetailBinding;", "getBinding", "()Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionsUpgradeStrategyDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bindL3BullishStrategyViews", "bindL3BearishStrategyViews", "bindL3LowVolatilityStrategyViews", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Mode", "Args", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingEducationStrategyDetailFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingEducationStrategyDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionsUpgradeStrategyDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionOnboardingEducationStrategyDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.L3_BULLISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.L3_BEARISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.L3_LOW_VOLATILITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionOnboardingEducationStrategyDetailFragment() {
        super(C25121R.layout.fragment_options_upgrade_strategy_detail);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, OptionOnboardingEducationStrategyDetailFragment2.INSTANCE);
    }

    private final FragmentOptionsUpgradeStrategyDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionsUpgradeStrategyDetailBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getMode().ordinal()];
        if (i == 1) {
            bindL3BullishStrategyViews();
        } else if (i == 2) {
            bindL3BearishStrategyViews();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bindL3LowVolatilityStrategyViews();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, requireBaseActivity().getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingEducationStrategyDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOnboardingEducationStrategyDetailFragment.onStart$lambda$0(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(OptionOnboardingEducationStrategyDetailFragment optionOnboardingEducationStrategyDetailFragment, DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        boolean z = overlay == DayNightOverlay.NIGHT;
        optionOnboardingEducationStrategyDetailFragment.getBinding().optionsUpgradeStrategyDetailFirstRow.setUseNightLottie(z);
        optionOnboardingEducationStrategyDetailFragment.getBinding().optionsUpgradeStrategyDetailSecondRow.setUseNightLottie(z);
        optionOnboardingEducationStrategyDetailFragment.getBinding().optionsUpgradeStrategyDetailThirdRow.setUseNightLottie(z);
        return Unit.INSTANCE;
    }

    private final void bindL3BullishStrategyViews() throws Resources.NotFoundException {
        getBinding().optionsUpgradeStrategyDetailTitle.setText(C25121R.string.options_upgrade_strategy_bullish_title);
        StrategyDetailRowView strategyDetailRowView = getBinding().optionsUpgradeStrategyDetailFirstRow;
        StrategyDetailResource strategyDetailResource = StrategyDetailResource.CALL_DEBIT;
        Companion companion = INSTANCE;
        strategyDetailRowView.bind(strategyDetailResource, ((Args) companion.getArgs((Fragment) this)).getLocality());
        getBinding().optionsUpgradeStrategyDetailSecondRow.bind(StrategyDetailResource.PUT_CREDIT, ((Args) companion.getArgs((Fragment) this)).getLocality());
    }

    private final void bindL3BearishStrategyViews() throws Resources.NotFoundException {
        getBinding().optionsUpgradeStrategyDetailTitle.setText(C25121R.string.options_upgrade_strategy_bearish_title);
        StrategyDetailRowView strategyDetailRowView = getBinding().optionsUpgradeStrategyDetailFirstRow;
        StrategyDetailResource strategyDetailResource = StrategyDetailResource.PUT_DEBIT;
        Companion companion = INSTANCE;
        strategyDetailRowView.bind(strategyDetailResource, ((Args) companion.getArgs((Fragment) this)).getLocality());
        getBinding().optionsUpgradeStrategyDetailSecondRow.bind(StrategyDetailResource.CALL_CREDIT, ((Args) companion.getArgs((Fragment) this)).getLocality());
    }

    private final void bindL3LowVolatilityStrategyViews() throws Resources.NotFoundException {
        getBinding().optionsUpgradeStrategyDetailTitle.setText(C25121R.string.options_upgrade_strategy_low_volatility_title);
        StrategyDetailRowView strategyDetailRowView = getBinding().optionsUpgradeStrategyDetailFirstRow;
        StrategyDetailResource strategyDetailResource = StrategyDetailResource.IRON_CONDOR;
        Companion companion = INSTANCE;
        strategyDetailRowView.bind(strategyDetailResource, ((Args) companion.getArgs((Fragment) this)).getLocality());
        getBinding().optionsUpgradeStrategyDetailSecondRow.bind(StrategyDetailResource.IRON_BUTTERFLY, ((Args) companion.getArgs((Fragment) this)).getLocality());
        getBinding().optionsUpgradeStrategyDetailThirdRow.bind(StrategyDetailResource.CALENDAR, ((Args) companion.getArgs((Fragment) this)).getLocality());
        StrategyDetailRowView optionsUpgradeStrategyDetailThirdRow = getBinding().optionsUpgradeStrategyDetailThirdRow;
        Intrinsics.checkNotNullExpressionValue(optionsUpgradeStrategyDetailThirdRow, "optionsUpgradeStrategyDetailThirdRow");
        optionsUpgradeStrategyDetailThirdRow.setVisibility(0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionOnboardingEducationStrategyDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationStrategyDetailFragment$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "L3_BULLISH", "L3_BEARISH", "L3_LOW_VOLATILITY", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Mode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode L3_BULLISH = new Mode("L3_BULLISH", 0);
        public static final Mode L3_BEARISH = new Mode("L3_BEARISH", 1);
        public static final Mode L3_LOW_VOLATILITY = new Mode("L3_LOW_VOLATILITY", 2);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{L3_BULLISH, L3_BEARISH, L3_LOW_VOLATILITY};
        }

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        private Mode(String str, int i) {
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(modeArr$values);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionOnboardingEducationStrategyDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationStrategyDetailFragment$Args;", "Landroid/os/Parcelable;", "mode", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationStrategyDetailFragment$Mode;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationStrategyDetailFragment$Mode;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getMode", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationStrategyDetailFragment$Mode;", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CountryCode.Supported locality;
        private final Mode mode;

        /* compiled from: OptionOnboardingEducationStrategyDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(Mode.valueOf(parcel.readString()), (CountryCode.Supported) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Mode mode, CountryCode.Supported supported, int i, Object obj) {
            if ((i & 1) != 0) {
                mode = args.mode;
            }
            if ((i & 2) != 0) {
                supported = args.locality;
            }
            return args.copy(mode, supported);
        }

        /* renamed from: component1, reason: from getter */
        public final Mode getMode() {
            return this.mode;
        }

        /* renamed from: component2, reason: from getter */
        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        public final Args copy(Mode mode, CountryCode.Supported locality) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(locality, "locality");
            return new Args(mode, locality);
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
            return this.mode == args.mode && Intrinsics.areEqual(this.locality, args.locality);
        }

        public int hashCode() {
            return (this.mode.hashCode() * 31) + this.locality.hashCode();
        }

        public String toString() {
            return "Args(mode=" + this.mode + ", locality=" + this.locality + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.mode.name());
            dest.writeSerializable(this.locality);
        }

        public Args(Mode mode, CountryCode.Supported locality) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(locality, "locality");
            this.mode = mode;
            this.locality = locality;
        }

        public final Mode getMode() {
            return this.mode;
        }

        public final CountryCode.Supported getLocality() {
            return this.locality;
        }
    }

    /* compiled from: OptionOnboardingEducationStrategyDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationStrategyDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationStrategyDetailFragment;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationStrategyDetailFragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOnboardingEducationStrategyDetailFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionOnboardingEducationStrategyDetailFragment optionOnboardingEducationStrategyDetailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingEducationStrategyDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingEducationStrategyDetailFragment newInstance(Args args) {
            return (OptionOnboardingEducationStrategyDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingEducationStrategyDetailFragment optionOnboardingEducationStrategyDetailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingEducationStrategyDetailFragment, args);
        }
    }
}
