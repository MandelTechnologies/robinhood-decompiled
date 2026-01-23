package com.robinhood.android.common.options.upsell.fridaytrading;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionDiscoverZeroDteBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u0003012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020&H\u0014J\b\u0010)\u001a\u00020&H\u0014J\t\u0010*\u001a\u00020\"H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00188TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\"X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", OptionDiscoverZeroDteBottomSheetFragment.KEY_ARGS, "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment$Args;", "getArgs", "()Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment$Args;", "args$delegate", "Lkotlin/Lazy;", "titleTextLabel", "", "getTitleTextLabel", "()Ljava/lang/String;", "descriptionTextLabel", "getDescriptionTextLabel", "primaryButtonLabel", "getPrimaryButtonLabel", "secondaryButtonLabel", "getSecondaryButtonLabel", "showLearnMore", "", "getShowLearnMore", "()Ljava/lang/Boolean;", "onStart", "", "onStop", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionDiscoverZeroDteBottomSheetFragment extends RhBottomSheetDialogFragment implements RegionGated {
    private static final String KEY_ARGS = "args";
    public EventLogger eventLogger;
    private final boolean showLearnMore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionDiscoverZeroDteBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Component BOTTOM_SHEET_COMPONENT = new Component(Component.ComponentType.BOTTOM_SHEET, "trade-exp-sheet", null, 4, null);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = Fragments2.argument(this, KEY_ARGS);

    /* compiled from: OptionDiscoverZeroDteBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment$Callbacks;", "", "turnOnTradeOnExpirationSetting", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void turnOnTradeOnExpirationSetting();
    }

    /* compiled from: OptionDiscoverZeroDteBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
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

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final Args getArgs() {
        return (Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getTitleTextLabel() {
        String string2 = getString(C11303R.string.discover_zero_dte_bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getDescriptionTextLabel() {
        String string2;
        OptionChain.UnderlyingType underlyingType = getArgs().getUnderlyingType();
        int i = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[underlyingType.ordinal()];
        if (i == -1) {
            string2 = getString(C11303R.string.discover_zero_dte_bottom_sheet_body, DateStrings2.formatTo24HourTime$default(15, 30, null, 4, null));
        } else if (i == 1) {
            if (getArgs().isEtfSupported()) {
                if (getArgs().getInSelloutImprovementExperiment()) {
                    string2 = getString(C11303R.string.gated_etf_discover_zero_dte_bottom_sheet_body_index_options_si, DateStrings2.formatTo24HourTime$default(15, 30, null, 4, null), DateStrings2.formatTo24HourTime$default(15, 45, null, 4, null), DateStrings2.formatTo24HourTime$default(16, 0, null, 4, null));
                } else {
                    string2 = getString(C11303R.string.gated_etf_discover_zero_dte_bottom_sheet_body_index_options, DateStrings2.formatTo24HourTime$default(15, 30, null, 4, null), DateStrings2.formatTo24HourTime$default(16, 0, null, 4, null));
                }
            } else {
                string2 = getString(C11303R.string.non_etf_discover_zero_dte_bottom_sheet_body_index_options, DateStrings2.formatTo24HourTime$default(15, 30, null, 4, null), DateStrings2.formatTo24HourTime$default(16, 0, null, 4, null));
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = getString(C11303R.string.discover_zero_dte_bottom_sheet_body, DateStrings2.formatTo24HourTime$default(15, 30, null, 4, null));
        }
        Intrinsics.checkNotNull(string2);
        if (getArgs().isMemberPdtRevampV1()) {
            return string2;
        }
        return string2 + PlaceholderUtils.XXShortPlaceholderText + getString(C11303R.string.discover_zero_dte_bottom_sheet_body_index_options_pdt_postscript);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getPrimaryButtonLabel() {
        String string2 = getString(C11303R.string.discover_zero_dte_bottom_primary_cta);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getSecondaryButtonLabel() {
        String string2 = getString(C11048R.string.general_label_dismiss);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected Boolean getShowLearnMore() {
        return Boolean.valueOf(this.showLearnMore);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.OPTION_CHAIN, null, null, null, 14, null), BOTTOM_SHEET_COMPONENT, null, null, 25, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, new Screen(Screen.Name.OPTION_CHAIN, null, null, null, 14, null), BOTTOM_SHEET_COMPONENT, null, null, 25, null);
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onPrimaryButtonClicked() {
        Screen screen = new Screen(Screen.Name.OPTION_CHAIN, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.BUTTON, "trade-exp-sheet-enable", null, 4, null);
        Component component2 = BOTTOM_SHEET_COMPONENT;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, screen, component, new ComponentHierarchy(component2, null, null, null, null, 30, null), null, false, 49, null);
        getCallbacks().turnOnTradeOnExpirationSetting();
        dismiss();
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onSecondaryButtonClicked() {
        Screen screen = new Screen(Screen.Name.OPTION_CHAIN, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.BUTTON, "trade-exp-sheet-dismiss", null, 4, null);
        Component component2 = BOTTOM_SHEET_COMPONENT;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, screen, component, new ComponentHierarchy(component2, null, null, null, null, 30, null), null, false, 48, null);
        dismiss();
    }

    /* compiled from: OptionDiscoverZeroDteBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "isEtfSupported", "", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "inSelloutImprovementExperiment", "isMemberPdtRevampV1", "<init>", "(ZLcom/robinhood/models/db/OptionChain$UnderlyingType;ZZ)V", "()Z", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getInSelloutImprovementExperiment", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean inSelloutImprovementExperiment;
        private final boolean isEtfSupported;
        private final boolean isMemberPdtRevampV1;
        private final OptionChain.UnderlyingType underlyingType;

        /* compiled from: OptionDiscoverZeroDteBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, parcel.readInt() == 0 ? null : OptionChain.UnderlyingType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, OptionChain.UnderlyingType underlyingType, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.isEtfSupported;
            }
            if ((i & 2) != 0) {
                underlyingType = args.underlyingType;
            }
            if ((i & 4) != 0) {
                z2 = args.inSelloutImprovementExperiment;
            }
            if ((i & 8) != 0) {
                z3 = args.isMemberPdtRevampV1;
            }
            return args.copy(z, underlyingType, z2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEtfSupported() {
            return this.isEtfSupported;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getInSelloutImprovementExperiment() {
            return this.inSelloutImprovementExperiment;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsMemberPdtRevampV1() {
            return this.isMemberPdtRevampV1;
        }

        public final Args copy(boolean isEtfSupported, OptionChain.UnderlyingType underlyingType, boolean inSelloutImprovementExperiment, boolean isMemberPdtRevampV1) {
            return new Args(isEtfSupported, underlyingType, inSelloutImprovementExperiment, isMemberPdtRevampV1);
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
            return this.isEtfSupported == args.isEtfSupported && this.underlyingType == args.underlyingType && this.inSelloutImprovementExperiment == args.inSelloutImprovementExperiment && this.isMemberPdtRevampV1 == args.isMemberPdtRevampV1;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isEtfSupported) * 31;
            OptionChain.UnderlyingType underlyingType = this.underlyingType;
            return ((((iHashCode + (underlyingType == null ? 0 : underlyingType.hashCode())) * 31) + Boolean.hashCode(this.inSelloutImprovementExperiment)) * 31) + Boolean.hashCode(this.isMemberPdtRevampV1);
        }

        public String toString() {
            return "Args(isEtfSupported=" + this.isEtfSupported + ", underlyingType=" + this.underlyingType + ", inSelloutImprovementExperiment=" + this.inSelloutImprovementExperiment + ", isMemberPdtRevampV1=" + this.isMemberPdtRevampV1 + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isEtfSupported ? 1 : 0);
            OptionChain.UnderlyingType underlyingType = this.underlyingType;
            if (underlyingType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(underlyingType.name());
            }
            dest.writeInt(this.inSelloutImprovementExperiment ? 1 : 0);
            dest.writeInt(this.isMemberPdtRevampV1 ? 1 : 0);
        }

        public Args(boolean z, OptionChain.UnderlyingType underlyingType, boolean z2, boolean z3) {
            this.isEtfSupported = z;
            this.underlyingType = underlyingType;
            this.inSelloutImprovementExperiment = z2;
            this.isMemberPdtRevampV1 = z3;
        }

        public final boolean isEtfSupported() {
            return this.isEtfSupported;
        }

        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        public final boolean getInSelloutImprovementExperiment() {
            return this.inSelloutImprovementExperiment;
        }

        public final boolean isMemberPdtRevampV1() {
            return this.isMemberPdtRevampV1;
        }
    }

    /* compiled from: OptionDiscoverZeroDteBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment$Companion;", "", "<init>", "()V", "KEY_ARGS", "", "BOTTOM_SHEET_COMPONENT", "Lcom/robinhood/rosetta/eventlogging/Component;", "newInstance", "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment;", OptionDiscoverZeroDteBottomSheetFragment.KEY_ARGS, "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment$Args;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionDiscoverZeroDteBottomSheetFragment newInstance(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            OptionDiscoverZeroDteBottomSheetFragment optionDiscoverZeroDteBottomSheetFragment = new OptionDiscoverZeroDteBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(OptionDiscoverZeroDteBottomSheetFragment.KEY_ARGS, args);
            optionDiscoverZeroDteBottomSheetFragment.setArguments(bundle);
            return optionDiscoverZeroDteBottomSheetFragment;
        }
    }
}
