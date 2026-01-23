package com.robinhood.android.optionschain;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.options.optionsstring.common.OptionInstruments;
import com.robinhood.android.optionschain.OptionContractRowView;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
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

/* compiled from: OptionDetailNoMarketdataBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u000223B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020&H\u0014J\b\u0010*\u001a\u00020&H\u0014J\t\u0010+\u001a\u00020,H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionDetailNoMarketdataBottomSheet;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "dialogId", "", "getDialogId", "()I", "titleTextLabel", "", "getTitleTextLabel", "()Ljava/lang/String;", "descriptionTextLabel", "getDescriptionTextLabel", "primaryButtonLabel", "getPrimaryButtonLabel", "secondaryButtonLabel", "getSecondaryButtonLabel", "callbacks", "Lcom/robinhood/android/optionschain/OptionContractRowView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionschain/OptionContractRowView$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", OptionDetailNoMarketdataBottomSheet.KEY_ARGS, "Lcom/robinhood/android/optionschain/OptionDetailNoMarketdataBottomSheet$Args;", "getArgs", "()Lcom/robinhood/android/optionschain/OptionDetailNoMarketdataBottomSheet$Args;", "args$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionDetailNoMarketdataBottomSheet extends RhBottomSheetDialogFragment implements RegionGated {
    private static final String KEY_ARGS = "args";
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionDetailNoMarketdataBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionschain/OptionContractRowView$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    private final int dialogId = C24135R.id.dialog_id_option_detail_no_marketdata;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionContractRowView.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionschain.OptionDetailNoMarketdataBottomSheet$special$$inlined$parentFragmentCallbacks$1
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

    /* compiled from: OptionDetailNoMarketdataBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
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

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment
    public int getDialogId() {
        return this.dialogId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getTitleTextLabel() {
        String string2 = getString(C24135R.string.option_detail_no_marketdata_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getDescriptionTextLabel() {
        int i = C24135R.string.option_detail_no_marketdata_dialog_subtitle;
        OptionInstrument optionInstrument = getArgs().getOptionLegBundle().getOptionInstrument();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String string2 = getString(i, OptionInstruments.getTitleStringWithExpiration(optionInstrument, resources, getArgs().getOptionLegBundle().getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    public String getPrimaryButtonLabel() {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[getArgs().getOptionLegBundle().getOptionConfigurationBundle().getOptionSide().ordinal()];
        if (i2 == 1) {
            i = C32428R.string.general_label_buy;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C32428R.string.general_label_sell;
        }
        String string2 = getString(i);
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

    private final OptionContractRowView.Callbacks getCallbacks() {
        return (OptionContractRowView.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final Args getArgs() {
        return (Args) this.args.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null), new Component(Component.ComponentType.OPTION_NO_MARKETDATA_MESSAGE, null, null, 6, null), null, null, 25, null);
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onPrimaryButtonClicked() {
        getCallbacks().onLaunchSingleLegOrder(getArgs().getOptionLegBundle());
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onSecondaryButtonClicked() {
        dismiss();
    }

    /* compiled from: OptionDetailNoMarketdataBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionDetailNoMarketdataBottomSheet$Args;", "Landroid/os/Parcelable;", "optionLegBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "<init>", "(Lcom/robinhood/models/ui/OptionLegBundle;)V", "getOptionLegBundle", "()Lcom/robinhood/models/ui/OptionLegBundle;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionLegBundle optionLegBundle;

        /* compiled from: OptionDetailNoMarketdataBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((OptionLegBundle) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OptionLegBundle optionLegBundle, int i, Object obj) {
            if ((i & 1) != 0) {
                optionLegBundle = args.optionLegBundle;
            }
            return args.copy(optionLegBundle);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionLegBundle getOptionLegBundle() {
            return this.optionLegBundle;
        }

        public final Args copy(OptionLegBundle optionLegBundle) {
            Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
            return new Args(optionLegBundle);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.optionLegBundle, ((Args) other).optionLegBundle);
        }

        public int hashCode() {
            return this.optionLegBundle.hashCode();
        }

        public String toString() {
            return "Args(optionLegBundle=" + this.optionLegBundle + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.optionLegBundle, flags);
        }

        public Args(OptionLegBundle optionLegBundle) {
            Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
            this.optionLegBundle = optionLegBundle;
        }

        public final OptionLegBundle getOptionLegBundle() {
            return this.optionLegBundle;
        }
    }

    /* compiled from: OptionDetailNoMarketdataBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionDetailNoMarketdataBottomSheet$Companion;", "", "<init>", "()V", "KEY_ARGS", "", "newInstance", "Lcom/robinhood/android/optionschain/OptionDetailNoMarketdataBottomSheet;", OptionDetailNoMarketdataBottomSheet.KEY_ARGS, "Lcom/robinhood/android/optionschain/OptionDetailNoMarketdataBottomSheet$Args;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionDetailNoMarketdataBottomSheet newInstance(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            OptionDetailNoMarketdataBottomSheet optionDetailNoMarketdataBottomSheet = new OptionDetailNoMarketdataBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putParcelable(OptionDetailNoMarketdataBottomSheet.KEY_ARGS, args);
            optionDetailNoMarketdataBottomSheet.setArguments(bundle);
            return optionDetailNoMarketdataBottomSheet;
        }
    }
}
