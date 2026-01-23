package com.robinhood.android.trade.options;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionOrderTimeInForcePickerDialogFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0003\u0015\u0016\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTimeInForcePickerDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/trade/options/OptionOrderTimeInForcePickerDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/options/OptionOrderTimeInForcePickerDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionOrderTimeInForcePickerDialogFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.options.OptionOrderTimeInForcePickerDialogFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOrderTimeInForcePickerDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/options/OptionOrderTimeInForcePickerDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionOrderTimeInForcePickerDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTimeInForcePickerDialogFragment$Callbacks;", "", "onTimeInForcePicked", "", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTimeInForcePicked(OrderTimeInForce timeInForce);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(OptionOrderTimeInForcePickerDialogFragment optionOrderTimeInForcePickerDialogFragment, int i, Composer composer, int i2) {
        optionOrderTimeInForcePickerDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(638807343);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(638807343, i2, -1, "com.robinhood.android.trade.options.OptionOrderTimeInForcePickerDialogFragment.ComposeContent (OptionOrderTimeInForcePickerDialogFragment.kt:27)");
            }
            Companion companion = INSTANCE;
            OrderTimeInForce timeInForce = ((Args) companion.getArgs((Fragment) this)).getTimeInForce();
            boolean inIndexOptionsCurbHoursExperiment = ((Args) companion.getArgs((Fragment) this)).getInIndexOptionsCurbHoursExperiment();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderTimeInForcePickerDialogFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionOrderTimeInForcePickerDialogFragment.ComposeContent$lambda$1$lambda$0(this.f$0, (OrderTimeInForce) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            OptionOrderTimeInForcePickerComposable.OptionOrderTimeInForcePickerComposable(timeInForce, inIndexOptionsCurbHoursExperiment, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.OptionOrderTimeInForcePickerDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOrderTimeInForcePickerDialogFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(OptionOrderTimeInForcePickerDialogFragment optionOrderTimeInForcePickerDialogFragment, OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        optionOrderTimeInForcePickerDialogFragment.getCallbacks().onTimeInForcePicked(timeInForce);
        optionOrderTimeInForcePickerDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOrderTimeInForcePickerDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTimeInForcePickerDialogFragment$Args;", "Landroid/os/Parcelable;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "inIndexOptionsCurbHoursExperiment", "", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;Z)V", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getInIndexOptionsCurbHoursExperiment", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean inIndexOptionsCurbHoursExperiment;
        private final OrderTimeInForce timeInForce;

        /* compiled from: OptionOrderTimeInForcePickerDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((OrderTimeInForce) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OrderTimeInForce orderTimeInForce, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                orderTimeInForce = args.timeInForce;
            }
            if ((i & 2) != 0) {
                z = args.inIndexOptionsCurbHoursExperiment;
            }
            return args.copy(orderTimeInForce, z);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getInIndexOptionsCurbHoursExperiment() {
            return this.inIndexOptionsCurbHoursExperiment;
        }

        public final Args copy(OrderTimeInForce timeInForce, boolean inIndexOptionsCurbHoursExperiment) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            return new Args(timeInForce, inIndexOptionsCurbHoursExperiment);
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
            return this.timeInForce == args.timeInForce && this.inIndexOptionsCurbHoursExperiment == args.inIndexOptionsCurbHoursExperiment;
        }

        public int hashCode() {
            return (this.timeInForce.hashCode() * 31) + Boolean.hashCode(this.inIndexOptionsCurbHoursExperiment);
        }

        public String toString() {
            return "Args(timeInForce=" + this.timeInForce + ", inIndexOptionsCurbHoursExperiment=" + this.inIndexOptionsCurbHoursExperiment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.timeInForce, flags);
            dest.writeInt(this.inIndexOptionsCurbHoursExperiment ? 1 : 0);
        }

        public Args(OrderTimeInForce timeInForce, boolean z) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            this.timeInForce = timeInForce;
            this.inIndexOptionsCurbHoursExperiment = z;
        }

        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final boolean getInIndexOptionsCurbHoursExperiment() {
            return this.inIndexOptionsCurbHoursExperiment;
        }
    }

    /* compiled from: OptionOrderTimeInForcePickerDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTimeInForcePickerDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/options/OptionOrderTimeInForcePickerDialogFragment;", "Lcom/robinhood/android/trade/options/OptionOrderTimeInForcePickerDialogFragment$Args;", "<init>", "()V", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOrderTimeInForcePickerDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionOrderTimeInForcePickerDialogFragment optionOrderTimeInForcePickerDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOrderTimeInForcePickerDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOrderTimeInForcePickerDialogFragment newInstance(Args args) {
            return (OptionOrderTimeInForcePickerDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOrderTimeInForcePickerDialogFragment optionOrderTimeInForcePickerDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOrderTimeInForcePickerDialogFragment, args);
        }
    }
}
