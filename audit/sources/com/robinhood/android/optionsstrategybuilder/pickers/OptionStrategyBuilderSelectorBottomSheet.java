package com.robinhood.android.optionsstrategybuilder.pickers;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.databinding.FragmentBottomSheetSelectorBinding;
import com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplates;
import com.robinhood.android.optionsstrategybuilder.pills.PillView;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionStrategyBuilderSelectorBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0003\u001d\u001e\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0017H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/OptionStrategyBuilderSelectorBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "binding", "Lcom/robinhood/android/optionsstrategybuilder/databinding/FragmentBottomSheetSelectorBinding;", "getBinding", "()Lcom/robinhood/android/optionsstrategybuilder/databinding/FragmentBottomSheetSelectorBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/optionsstrategybuilder/pickers/OptionStrategyBuilderSelectorBottomSheet$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionsstrategybuilder/pickers/OptionStrategyBuilderSelectorBottomSheet$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStrategyBuilderSelectorBottomSheet extends BaseBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionStrategyBuilderSelectorBottomSheet.class, "binding", "getBinding()Lcom/robinhood/android/optionsstrategybuilder/databinding/FragmentBottomSheetSelectorBinding;", 0)), Reflection.property1(new PropertyReference1Impl(OptionStrategyBuilderSelectorBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsstrategybuilder/pickers/OptionStrategyBuilderSelectorBottomSheet$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionStrategyBuilderSelectorBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/OptionStrategyBuilderSelectorBottomSheet$Callbacks;", "", "onChoiceSelected", "", "selectorArgs", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "selectedIndex", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onChoiceSelected(PillView.SelectorArgs selectorArgs, int selectedIndex);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionStrategyBuilderSelectorBottomSheet() {
        super(C24876R.layout.fragment_bottom_sheet_selector);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, OptionStrategyBuilderSelectorBottomSheet2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.OptionStrategyBuilderSelectorBottomSheet$special$$inlined$targetFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment targetFragment = CallbacksProperty.getTargetFragment();
                if (targetFragment != null) {
                    return targetFragment;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
    }

    private final FragmentBottomSheetSelectorBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBottomSheetSelectorBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().bottomSheetTitleTxt;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getSelectorArgs().getFilter().getSelectorName());
        getBinding().bottomSheetDescriptionTxt.setText(((Args) companion.getArgs((Fragment) this)).getSelectorArgs().getFilter().getSelectorDescription());
        RhNumberPicker rhNumberPicker = getBinding().numberPicker;
        rhNumberPicker.setWrapSelectorWheelPreferred(false);
        rhNumberPicker.setMaxValue(CollectionsKt.getLastIndex(((Args) companion.getArgs((Fragment) this)).getSelectorArgs().getChoices()));
        List<OptionStrategyBuilderViewState.Choice> choices = ((Args) companion.getArgs((Fragment) this)).getSelectorArgs().getChoices();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(choices, 10));
        for (OptionStrategyBuilderViewState.Choice choice : choices) {
            Resources resources = rhNumberPicker.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            arrayList.add(OptionStrategyBuilderViewState.Choice.toString$default(choice, resources, false, 2, null));
        }
        rhNumberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
        Companion companion2 = INSTANCE;
        OptionStrategyBuilderViewState.Choice selectedChoice = ((Args) companion2.getArgs((Fragment) this)).getSelectorArgs().getSelectedChoice();
        if (selectedChoice != null) {
            int iIndexOf = ((Args) companion2.getArgs((Fragment) this)).getSelectorArgs().getChoices().indexOf(selectedChoice);
            if (iIndexOf > 0) {
                rhNumberPicker.setValue(iIndexOf);
            }
        } else {
            rhNumberPicker.setValue(OptionStrategyChainTemplates.getDefaultIndex(((Args) companion2.getArgs((Fragment) this)).getSelectorArgs().getFilter(), ((Args) companion2.getArgs((Fragment) this)).getUnderlyingQuote(), ((Args) companion2.getArgs((Fragment) this)).getSelectorArgs().getChoices()));
        }
        RdsButton bottomSheetPrimaryBtn = getBinding().bottomSheetPrimaryBtn;
        Intrinsics.checkNotNullExpressionValue(bottomSheetPrimaryBtn, "bottomSheetPrimaryBtn");
        OnClickListeners.onClick(bottomSheetPrimaryBtn, new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.pickers.OptionStrategyBuilderSelectorBottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionStrategyBuilderSelectorBottomSheet.onViewCreated$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(OptionStrategyBuilderSelectorBottomSheet optionStrategyBuilderSelectorBottomSheet) {
        optionStrategyBuilderSelectorBottomSheet.getCallbacks().onChoiceSelected(((Args) INSTANCE.getArgs((Fragment) optionStrategyBuilderSelectorBottomSheet)).getSelectorArgs(), optionStrategyBuilderSelectorBottomSheet.getBinding().numberPicker.getInternalValue());
        optionStrategyBuilderSelectorBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: OptionStrategyBuilderSelectorBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/OptionStrategyBuilderSelectorBottomSheet$Args;", "Landroid/os/Parcelable;", "selectorArgs", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "<init>", "(Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;Lcom/robinhood/models/ui/UnderlyingQuote;)V", "getSelectorArgs", "()Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final PillView.SelectorArgs selectorArgs;
        private final UnderlyingQuote underlyingQuote;

        /* compiled from: OptionStrategyBuilderSelectorBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(PillView.SelectorArgs.CREATOR.createFromParcel(parcel), (UnderlyingQuote) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, PillView.SelectorArgs selectorArgs, UnderlyingQuote underlyingQuote, int i, Object obj) {
            if ((i & 1) != 0) {
                selectorArgs = args.selectorArgs;
            }
            if ((i & 2) != 0) {
                underlyingQuote = args.underlyingQuote;
            }
            return args.copy(selectorArgs, underlyingQuote);
        }

        /* renamed from: component1, reason: from getter */
        public final PillView.SelectorArgs getSelectorArgs() {
            return this.selectorArgs;
        }

        /* renamed from: component2, reason: from getter */
        public final UnderlyingQuote getUnderlyingQuote() {
            return this.underlyingQuote;
        }

        public final Args copy(PillView.SelectorArgs selectorArgs, UnderlyingQuote underlyingQuote) {
            Intrinsics.checkNotNullParameter(selectorArgs, "selectorArgs");
            return new Args(selectorArgs, underlyingQuote);
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
            return Intrinsics.areEqual(this.selectorArgs, args.selectorArgs) && Intrinsics.areEqual(this.underlyingQuote, args.underlyingQuote);
        }

        public int hashCode() {
            int iHashCode = this.selectorArgs.hashCode() * 31;
            UnderlyingQuote underlyingQuote = this.underlyingQuote;
            return iHashCode + (underlyingQuote == null ? 0 : underlyingQuote.hashCode());
        }

        public String toString() {
            return "Args(selectorArgs=" + this.selectorArgs + ", underlyingQuote=" + this.underlyingQuote + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.selectorArgs.writeToParcel(dest, flags);
            dest.writeParcelable(this.underlyingQuote, flags);
        }

        public Args(PillView.SelectorArgs selectorArgs, UnderlyingQuote underlyingQuote) {
            Intrinsics.checkNotNullParameter(selectorArgs, "selectorArgs");
            this.selectorArgs = selectorArgs;
            this.underlyingQuote = underlyingQuote;
        }

        public final PillView.SelectorArgs getSelectorArgs() {
            return this.selectorArgs;
        }

        public final UnderlyingQuote getUnderlyingQuote() {
            return this.underlyingQuote;
        }
    }

    /* compiled from: OptionStrategyBuilderSelectorBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pickers/OptionStrategyBuilderSelectorBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/optionsstrategybuilder/pickers/OptionStrategyBuilderSelectorBottomSheet;", "Lcom/robinhood/android/optionsstrategybuilder/pickers/OptionStrategyBuilderSelectorBottomSheet$Args;", "Lcom/robinhood/android/optionsstrategybuilder/pickers/OptionStrategyBuilderSelectorBottomSheet$Callbacks;", "<init>", "()V", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<OptionStrategyBuilderSelectorBottomSheet, Args, Callbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionStrategyBuilderSelectorBottomSheet optionStrategyBuilderSelectorBottomSheet) {
            return (Args) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, optionStrategyBuilderSelectorBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Args) parcelable, (Args) fragment, i);
        }

        public <C extends Fragment & Callbacks> OptionStrategyBuilderSelectorBottomSheet newInstance(Args args, C c, int i) {
            return (OptionStrategyBuilderSelectorBottomSheet) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, args, c, i);
        }
    }
}
