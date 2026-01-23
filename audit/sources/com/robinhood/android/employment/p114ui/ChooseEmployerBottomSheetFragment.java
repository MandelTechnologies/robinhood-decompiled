package com.robinhood.android.employment.p114ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.employment.C14481R;
import com.robinhood.android.employment.databinding.FragmentChooseEmployerBottomSheetBinding;
import com.robinhood.android.employment.p114ui.ChooseEmployerFragment;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.List;
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
import kotlin.reflect.KProperty;

/* compiled from: ChooseEmployerBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0003\u0019\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/employment/ui/ChooseEmployerBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/employment/ui/ChooseEmployerBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "", "binding", "Lcom/robinhood/android/employment/databinding/FragmentChooseEmployerBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/employment/databinding/FragmentChooseEmployerBottomSheetBinding;", "binding$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Args", "Companion", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChooseEmployerBottomSheetFragment extends BaseBottomSheetDialogFragment {
    private static final float BOTTOM_SHEET_MAX_HEIGHT_PERCENT = 0.8f;
    private final GenericListAdapter<RdsRowView, String> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChooseEmployerBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/employment/ui/ChooseEmployerBottomSheetFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(ChooseEmployerBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/employment/databinding/FragmentChooseEmployerBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChooseEmployerBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerBottomSheetFragment$Callbacks;", "", "onSelectionClick", "", "text", "", "dropdownType", "Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$DropdownType;", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSelectionClick(String text, ChooseEmployerFragment.DropdownType dropdownType);
    }

    public ChooseEmployerBottomSheetFragment() {
        super(C14481R.layout.fragment_choose_employer_bottom_sheet);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.employment.ui.ChooseEmployerBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.employment.ui.ChooseEmployerBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ChooseEmployerBottomSheetFragment.adapter$lambda$1(this.f$0, (RdsRowView) obj, (String) obj2);
            }
        });
        this.binding = ViewBinding5.viewBinding(this, ChooseEmployerBottomSheetFragment2.INSTANCE);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(final ChooseEmployerBottomSheetFragment chooseEmployerBottomSheetFragment, RdsRowView of, final String text) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(text, "text");
        RdsRowView.bind$default(of, text, null, null, null, null, 30, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.employment.ui.ChooseEmployerBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChooseEmployerBottomSheetFragment.adapter$lambda$1$lambda$0(this.f$0, text);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1$lambda$0(ChooseEmployerBottomSheetFragment chooseEmployerBottomSheetFragment, String str) {
        chooseEmployerBottomSheetFragment.getCallbacks().onSelectionClick(str, ((Args) INSTANCE.getArgs((Fragment) chooseEmployerBottomSheetFragment)).getDropdownType());
        chooseEmployerBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    private final FragmentChooseEmployerBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentChooseEmployerBottomSheetBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(requireActivity(), "requireActivity(...)");
        getBinding().chooseEmployerRecyclerView.getLayoutParams().height = (int) (Activity.getDisplayMetrics(r2).heightPixels * 0.8f);
        RecyclerView chooseEmployerRecyclerView = getBinding().chooseEmployerRecyclerView;
        Intrinsics.checkNotNullExpressionValue(chooseEmployerRecyclerView, "chooseEmployerRecyclerView");
        bindAdapter(chooseEmployerRecyclerView, this.adapter);
        this.adapter.submitList(((Args) INSTANCE.getArgs((Fragment) this)).getOptions());
    }

    /* compiled from: ChooseEmployerBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "dropdownType", "Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$DropdownType;", "options", "", "", "<init>", "(Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$DropdownType;Ljava/util/List;)V", "getDropdownType", "()Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$DropdownType;", "getOptions", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ChooseEmployerFragment.DropdownType dropdownType;
        private final List<String> options;

        /* compiled from: ChooseEmployerBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ChooseEmployerFragment.DropdownType.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, ChooseEmployerFragment.DropdownType dropdownType, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                dropdownType = args.dropdownType;
            }
            if ((i & 2) != 0) {
                list = args.options;
            }
            return args.copy(dropdownType, list);
        }

        /* renamed from: component1, reason: from getter */
        public final ChooseEmployerFragment.DropdownType getDropdownType() {
            return this.dropdownType;
        }

        public final List<String> component2() {
            return this.options;
        }

        public final Args copy(ChooseEmployerFragment.DropdownType dropdownType, List<String> options) {
            Intrinsics.checkNotNullParameter(dropdownType, "dropdownType");
            Intrinsics.checkNotNullParameter(options, "options");
            return new Args(dropdownType, options);
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
            return this.dropdownType == args.dropdownType && Intrinsics.areEqual(this.options, args.options);
        }

        public int hashCode() {
            return (this.dropdownType.hashCode() * 31) + this.options.hashCode();
        }

        public String toString() {
            return "Args(dropdownType=" + this.dropdownType + ", options=" + this.options + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.dropdownType.writeToParcel(dest, flags);
            dest.writeStringList(this.options);
        }

        public Args(ChooseEmployerFragment.DropdownType dropdownType, List<String> options) {
            Intrinsics.checkNotNullParameter(dropdownType, "dropdownType");
            Intrinsics.checkNotNullParameter(options, "options");
            this.dropdownType = dropdownType;
            this.options = options;
        }

        public final ChooseEmployerFragment.DropdownType getDropdownType() {
            return this.dropdownType;
        }

        public final List<String> getOptions() {
            return this.options;
        }
    }

    /* compiled from: ChooseEmployerBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/employment/ui/ChooseEmployerBottomSheetFragment;", "Lcom/robinhood/android/employment/ui/ChooseEmployerBottomSheetFragment$Args;", "<init>", "()V", "BOTTOM_SHEET_MAX_HEIGHT_PERCENT", "", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ChooseEmployerBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ChooseEmployerBottomSheetFragment chooseEmployerBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, chooseEmployerBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ChooseEmployerBottomSheetFragment newInstance(Args args) {
            return (ChooseEmployerBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ChooseEmployerBottomSheetFragment chooseEmployerBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, chooseEmployerBottomSheetFragment, args);
        }
    }
}
