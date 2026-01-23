package com.robinhood.shared.history.accounts;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.shared.history.accounts.databinding.FragmentAccountsHistoryFilterBottomsheetBinding;
import com.robinhood.shared.history.daterowview.RadioButtonCustomDateRowView;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: AccountsHistoryFilterBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0018\u0019\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/AccountsHistoryFilterBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/history/accounts/AccountsHistoryFilterBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/history/accounts/AccountsHistoryFilterBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/shared/history/accounts/databinding/FragmentAccountsHistoryFilterBottomsheetBinding;", "getBinding", "()Lcom/robinhood/shared/history/accounts/databinding/FragmentAccountsHistoryFilterBottomsheetBinding;", "binding$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Args", "Companion", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AccountsHistoryFilterBottomSheetFragment extends BaseBottomSheetDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountsHistoryFilterBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/history/accounts/AccountsHistoryFilterBottomSheetFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(AccountsHistoryFilterBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/shared/history/accounts/databinding/FragmentAccountsHistoryFilterBottomsheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AccountsHistoryFilterBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/AccountsHistoryFilterBottomSheetFragment$Callbacks;", "", "onFilterSelected", "", "selection", "Lcom/robinhood/shared/history/accounts/HistoryFilterSelection;", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFilterSelected(HistoryFilterSelection selection);
    }

    public AccountsHistoryFilterBottomSheetFragment() {
        super(C38979R.layout.fragment_accounts_history_filter_bottomsheet);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryFilterBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, AccountsHistoryFilterBottomSheetFragment2.INSTANCE);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentAccountsHistoryFilterBottomsheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAccountsHistoryFilterBottomsheetBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().accountsHistoryBottomsheetTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(getString(((Args) companion.getArgs((Fragment) this)).getTitleRes()));
        List<HistoryFilterSelection> selectableFilters = ((Args) companion.getArgs((Fragment) this)).getSelectableFilters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectableFilters, 10));
        for (final HistoryFilterSelection historyFilterSelection : selectableFilters) {
            RadioButtonCustomDateRowView.Companion companion2 = RadioButtonCustomDateRowView.INSTANCE;
            NewRdsRadioGroup accountsHistoryBottomsheetRadioGroup = getBinding().accountsHistoryBottomsheetRadioGroup;
            Intrinsics.checkNotNullExpressionValue(accountsHistoryBottomsheetRadioGroup, "accountsHistoryBottomsheetRadioGroup");
            RadioButtonCustomDateRowView radioButtonCustomDateRowViewInflate = companion2.inflate((ViewGroup) accountsHistoryBottomsheetRadioGroup);
            radioButtonCustomDateRowViewInflate.setId(View.generateViewId());
            StringResource label = historyFilterSelection.getLabel();
            Resources resources = radioButtonCustomDateRowViewInflate.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            radioButtonCustomDateRowViewInflate.setPrimaryText(label.getText(resources));
            radioButtonCustomDateRowViewInflate.setChecked(Intrinsics.areEqual(historyFilterSelection, ((Args) INSTANCE.getArgs((Fragment) this)).getSelectedFilter()));
            OnClickListeners.onClick(radioButtonCustomDateRowViewInflate, new Function0() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryFilterBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountsHistoryFilterBottomSheetFragment.onViewCreated$lambda$3$lambda$2$lambda$1(this.f$0, historyFilterSelection);
                }
            });
            getBinding().accountsHistoryBottomsheetRadioGroup.addView(radioButtonCustomDateRowViewInflate);
            arrayList.add(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2$lambda$1(AccountsHistoryFilterBottomSheetFragment accountsHistoryFilterBottomSheetFragment, HistoryFilterSelection historyFilterSelection) {
        accountsHistoryFilterBottomSheetFragment.dismiss();
        accountsHistoryFilterBottomSheetFragment.getCallbacks().onFilterSelected(historyFilterSelection);
        return Unit.INSTANCE;
    }

    /* compiled from: AccountsHistoryFilterBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/AccountsHistoryFilterBottomSheetFragment$Args;", "Landroid/os/Parcelable;", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "selectableFilters", "", "Lcom/robinhood/shared/history/accounts/HistoryFilterSelection;", "selectedFilter", "<init>", "(ILjava/util/List;Lcom/robinhood/shared/history/accounts/HistoryFilterSelection;)V", "getTitleRes", "()I", "getSelectableFilters", "()Ljava/util/List;", "getSelectedFilter", "()Lcom/robinhood/shared/history/accounts/HistoryFilterSelection;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<HistoryFilterSelection> selectableFilters;
        private final HistoryFilterSelection selectedFilter;
        private final int titleRes;

        /* compiled from: AccountsHistoryFilterBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(i, arrayList, (HistoryFilterSelection) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.titleRes);
            List<HistoryFilterSelection> list = this.selectableFilters;
            dest.writeInt(list.size());
            Iterator<HistoryFilterSelection> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.selectedFilter, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(int i, List<? extends HistoryFilterSelection> selectableFilters, HistoryFilterSelection selectedFilter) {
            Intrinsics.checkNotNullParameter(selectableFilters, "selectableFilters");
            Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
            this.titleRes = i;
            this.selectableFilters = selectableFilters;
            this.selectedFilter = selectedFilter;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final List<HistoryFilterSelection> getSelectableFilters() {
            return this.selectableFilters;
        }

        public final HistoryFilterSelection getSelectedFilter() {
            return this.selectedFilter;
        }
    }

    /* compiled from: AccountsHistoryFilterBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/AccountsHistoryFilterBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/shared/history/accounts/AccountsHistoryFilterBottomSheetFragment$Args;", "<init>", "()V", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BaseBottomSheetDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, baseBottomSheetDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BaseBottomSheetDialogFragment newInstance(Args args) {
            return (BaseBottomSheetDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, baseBottomSheetDialogFragment, args);
        }
    }
}
