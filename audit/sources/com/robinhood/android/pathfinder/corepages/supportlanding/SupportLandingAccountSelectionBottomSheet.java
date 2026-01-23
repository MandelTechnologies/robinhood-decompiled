package com.robinhood.android.pathfinder.corepages.supportlanding;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.pathfinder.corepages.C39352R;
import com.robinhood.shared.pathfinder.corepages.databinding.FragmentSupportLandingAccountSelectionBottomSheetBinding;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
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

/* compiled from: SupportLandingAccountSelectionBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001d\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingAccountSelectionBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/shared/pathfinder/corepages/databinding/FragmentSupportLandingAccountSelectionBottomSheetBinding;", "getBinding", "()Lcom/robinhood/shared/pathfinder/corepages/databinding/FragmentSupportLandingAccountSelectionBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingAccountSelectionBottomSheet$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingAccountSelectionBottomSheet$Callbacks;", "callbacks$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lkotlin/Pair;", "", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Args", "Companion", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SupportLandingAccountSelectionBottomSheet extends BaseBottomSheetDialogFragment {
    private final GenericListAdapter<RdsRowView, Tuples2<String, String>> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SupportLandingAccountSelectionBottomSheet.class, "binding", "getBinding()Lcom/robinhood/shared/pathfinder/corepages/databinding/FragmentSupportLandingAccountSelectionBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SupportLandingAccountSelectionBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingAccountSelectionBottomSheet$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SupportLandingAccountSelectionBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingAccountSelectionBottomSheet$Callbacks;", "", "onAccountSelected", "", "accountType", "", "subAccountNumber", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountSelected(String accountType, String subAccountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object adapter$lambda$0(Tuples2 byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality;
    }

    public SupportLandingAccountSelectionBottomSheet() {
        super(C39352R.layout.fragment_support_landing_account_selection_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, SupportLandingAccountSelectionBottomSheet2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingAccountSelectionBottomSheet$special$$inlined$targetFragmentCallbacks$1
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
        this.adapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingAccountSelectionBottomSheet$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportLandingAccountSelectionBottomSheet.adapter$lambda$0((Tuples2) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingAccountSelectionBottomSheet$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SupportLandingAccountSelectionBottomSheet.adapter$lambda$2(this.f$0, (RdsRowView) obj, (Tuples2) obj2);
            }
        });
    }

    private final FragmentSupportLandingAccountSelectionBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSupportLandingAccountSelectionBottomSheetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2(final SupportLandingAccountSelectionBottomSheet supportLandingAccountSelectionBottomSheet, RdsRowView of, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        String str = (String) tuples2.component1();
        final String str2 = (String) tuples2.component2();
        of.setPrimaryText(str);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingAccountSelectionBottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportLandingAccountSelectionBottomSheet.adapter$lambda$2$lambda$1(this.f$0, str2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2$lambda$1(SupportLandingAccountSelectionBottomSheet supportLandingAccountSelectionBottomSheet, String str) {
        supportLandingAccountSelectionBottomSheet.getCallbacks().onAccountSelected(((Args) INSTANCE.getArgs((Fragment) supportLandingAccountSelectionBottomSheet)).getAccountType(), str);
        supportLandingAccountSelectionBottomSheet.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView supportLandingAccountSelectionSheetList = getBinding().supportLandingAccountSelectionSheetList;
        Intrinsics.checkNotNullExpressionValue(supportLandingAccountSelectionSheetList, "supportLandingAccountSelectionSheetList");
        bindAdapter(supportLandingAccountSelectionSheetList, this.adapter);
        this.adapter.submitList(((Args) INSTANCE.getArgs((Fragment) this)).getAccountNameToAccountNumber());
        RdsButton supportLandingAccountSelectionSheetCloseBtn = getBinding().supportLandingAccountSelectionSheetCloseBtn;
        Intrinsics.checkNotNullExpressionValue(supportLandingAccountSelectionSheetCloseBtn, "supportLandingAccountSelectionSheetCloseBtn");
        OnClickListeners.onClick(supportLandingAccountSelectionSheetCloseBtn, new Function0() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingAccountSelectionBottomSheet$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportLandingAccountSelectionBottomSheet.onViewCreated$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(SupportLandingAccountSelectionBottomSheet supportLandingAccountSelectionBottomSheet) {
        supportLandingAccountSelectionBottomSheet.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* compiled from: SupportLandingAccountSelectionBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingAccountSelectionBottomSheet$Args;", "Landroid/os/Parcelable;", "accountType", "", "accountNameToAccountNumber", "", "Lkotlin/Pair;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getAccountType", "()Ljava/lang/String;", "getAccountNameToAccountNumber", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<Tuples2<String, String>> accountNameToAccountNumber;
        private final String accountType;

        /* compiled from: SupportLandingAccountSelectionBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new Args(string2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountType;
            }
            if ((i & 2) != 0) {
                list = args.accountNameToAccountNumber;
            }
            return args.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountType() {
            return this.accountType;
        }

        public final List<Tuples2<String, String>> component2() {
            return this.accountNameToAccountNumber;
        }

        public final Args copy(String accountType, List<Tuples2<String, String>> accountNameToAccountNumber) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(accountNameToAccountNumber, "accountNameToAccountNumber");
            return new Args(accountType, accountNameToAccountNumber);
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
            return Intrinsics.areEqual(this.accountType, args.accountType) && Intrinsics.areEqual(this.accountNameToAccountNumber, args.accountNameToAccountNumber);
        }

        public int hashCode() {
            return (this.accountType.hashCode() * 31) + this.accountNameToAccountNumber.hashCode();
        }

        public String toString() {
            return "Args(accountType=" + this.accountType + ", accountNameToAccountNumber=" + this.accountNameToAccountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountType);
            List<Tuples2<String, String>> list = this.accountNameToAccountNumber;
            dest.writeInt(list.size());
            Iterator<Tuples2<String, String>> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
        }

        public Args(String accountType, List<Tuples2<String, String>> accountNameToAccountNumber) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(accountNameToAccountNumber, "accountNameToAccountNumber");
            this.accountType = accountType;
            this.accountNameToAccountNumber = accountNameToAccountNumber;
        }

        public final String getAccountType() {
            return this.accountType;
        }

        public final List<Tuples2<String, String>> getAccountNameToAccountNumber() {
            return this.accountNameToAccountNumber;
        }
    }

    /* compiled from: SupportLandingAccountSelectionBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingAccountSelectionBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingAccountSelectionBottomSheet;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingAccountSelectionBottomSheet$Args;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingAccountSelectionBottomSheet$Callbacks;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<SupportLandingAccountSelectionBottomSheet, Args, Callbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SupportLandingAccountSelectionBottomSheet supportLandingAccountSelectionBottomSheet) {
            return (Args) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, supportLandingAccountSelectionBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Args) parcelable, (Args) fragment, i);
        }

        public <C extends Fragment & Callbacks> SupportLandingAccountSelectionBottomSheet newInstance(Args args, C c, int i) {
            return (SupportLandingAccountSelectionBottomSheet) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, args, c, i);
        }
    }
}
