package com.robinhood.android.cash.rhy.tab.p077v2.settings;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.databinding.BottomSheetRhyRoutingDetailsBinding;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.ClipboardUtil;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: RhyRoutingDetailsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0002J\t\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyRoutingDetailsBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "binding", "Lcom/robinhood/android/cash/rhy/tab/databinding/BottomSheetRhyRoutingDetailsBinding;", "getBinding", "()Lcom/robinhood/android/cash/rhy/tab/databinding/BottomSheetRhyRoutingDetailsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showSnackbar", "textRes", "", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyRoutingDetailsBottomSheet extends BaseBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyRoutingDetailsBottomSheet.class, "binding", "getBinding()Lcom/robinhood/android/cash/rhy/tab/databinding/BottomSheetRhyRoutingDetailsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RhyRoutingDetailsBottomSheet() {
        super(C10285R.layout.bottom_sheet_rhy_routing_details);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, RhyRoutingDetailsBottomSheet2.INSTANCE);
    }

    private final BottomSheetRhyRoutingDetailsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (BottomSheetRhyRoutingDetailsBinding) value;
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
        final RdsRowView rdsRowView = getBinding().rhyRoutingDetailsBottomSheetRoutingRow;
        Companion companion = INSTANCE;
        rdsRowView.setPrimaryText(((Args) companion.getArgs((Fragment) this)).getRoutingNumber());
        Intrinsics.checkNotNull(rdsRowView);
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyRoutingDetailsBottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyRoutingDetailsBottomSheet.onViewCreated$lambda$2$lambda$1(this.f$0, rdsRowView);
            }
        });
        final RdsRowView rdsRowView2 = getBinding().rhyRoutingDetailsBottomSheetAccountRow;
        rdsRowView2.setPrimaryText(((Args) companion.getArgs((Fragment) this)).getAccountNumber());
        Intrinsics.checkNotNull(rdsRowView2);
        OnClickListeners.onClick(rdsRowView2, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyRoutingDetailsBottomSheet$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyRoutingDetailsBottomSheet.onViewCreated$lambda$4$lambda$3(this.f$0, rdsRowView2);
            }
        });
        RhTextView rhTextView = getBinding().rhyRoutingDetailsBottomSheetDisclosure;
        String string2 = getString(C10285R.string.rhy_routing_details_bottom_sheet_disclosure, ((Args) companion.getArgs((Fragment) this)).getFullBankName());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        rhTextView.setText(StringsKt.replace$default(string2, "..", ".", false, 4, (Object) null));
        RdsButton rhyRoutingDetailsBottomSheetCloseButton = getBinding().rhyRoutingDetailsBottomSheetCloseButton;
        Intrinsics.checkNotNullExpressionValue(rhyRoutingDetailsBottomSheetCloseButton, "rhyRoutingDetailsBottomSheetCloseButton");
        OnClickListeners.onClick(rhyRoutingDetailsBottomSheetCloseButton, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyRoutingDetailsBottomSheet$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyRoutingDetailsBottomSheet.onViewCreated$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(RhyRoutingDetailsBottomSheet rhyRoutingDetailsBottomSheet, RdsRowView rdsRowView) throws Resources.NotFoundException {
        ClipboardUtil clipboardUtil = ClipboardUtil.INSTANCE;
        String routingNumber = ((Args) INSTANCE.getArgs((Fragment) rhyRoutingDetailsBottomSheet)).getRoutingNumber();
        String string2 = rhyRoutingDetailsBottomSheet.getString(C10285R.string.rhy_routing_details_bottom_sheet_routing_number);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Intrinsics.checkNotNull(rdsRowView);
        clipboardUtil.copyToClipboardWithHapticFeedback(routingNumber, string2, rdsRowView, false);
        rhyRoutingDetailsBottomSheet.showSnackbar(C10285R.string.rhy_routing_details_bottom_sheet_routing_number_copied);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(RhyRoutingDetailsBottomSheet rhyRoutingDetailsBottomSheet, RdsRowView rdsRowView) throws Resources.NotFoundException {
        ClipboardUtil clipboardUtil = ClipboardUtil.INSTANCE;
        String accountNumber = ((Args) INSTANCE.getArgs((Fragment) rhyRoutingDetailsBottomSheet)).getAccountNumber();
        String string2 = rhyRoutingDetailsBottomSheet.getString(C10285R.string.rhy_routing_details_bottom_sheet_account_number);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Intrinsics.checkNotNull(rdsRowView);
        clipboardUtil.copyToClipboardWithHapticFeedback(accountNumber, string2, rdsRowView, false);
        rhyRoutingDetailsBottomSheet.showSnackbar(C10285R.string.rhy_routing_details_bottom_sheet_account_number_copied);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(RhyRoutingDetailsBottomSheet rhyRoutingDetailsBottomSheet) {
        rhyRoutingDetailsBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    private final void showSnackbar(int textRes) {
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        CoordinatorLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        RdsSnackbar rdsSnackbarMake = companion.make(root, textRes, 0);
        rdsSnackbarMake.setLeadingIcon(C20690R.drawable.ic_rds_checkmark_24dp);
        rdsSnackbarMake.show();
    }

    /* compiled from: RhyRoutingDetailsBottomSheet.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyRoutingDetailsBottomSheet$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "routingNumber", "fullBankName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getRoutingNumber", "getFullBankName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String fullBankName;
        private final String routingNumber;

        /* compiled from: RhyRoutingDetailsBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = args.routingNumber;
            }
            if ((i & 4) != 0) {
                str3 = args.fullBankName;
            }
            return args.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFullBankName() {
            return this.fullBankName;
        }

        public final Args copy(String accountNumber, String routingNumber, String fullBankName) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            Intrinsics.checkNotNullParameter(fullBankName, "fullBankName");
            return new Args(accountNumber, routingNumber, fullBankName);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.routingNumber, args.routingNumber) && Intrinsics.areEqual(this.fullBankName, args.fullBankName);
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.routingNumber.hashCode()) * 31) + this.fullBankName.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", routingNumber=" + this.routingNumber + ", fullBankName=" + this.fullBankName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.routingNumber);
            dest.writeString(this.fullBankName);
        }

        public Args(String accountNumber, String routingNumber, String fullBankName) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            Intrinsics.checkNotNullParameter(fullBankName, "fullBankName");
            this.accountNumber = accountNumber;
            this.routingNumber = routingNumber;
            this.fullBankName = fullBankName;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        public final String getFullBankName() {
            return this.fullBankName;
        }
    }

    /* compiled from: RhyRoutingDetailsBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyRoutingDetailsBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyRoutingDetailsBottomSheet;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyRoutingDetailsBottomSheet$Args;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhyRoutingDetailsBottomSheet, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhyRoutingDetailsBottomSheet rhyRoutingDetailsBottomSheet) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyRoutingDetailsBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyRoutingDetailsBottomSheet newInstance(Args args) {
            return (RhyRoutingDetailsBottomSheet) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyRoutingDetailsBottomSheet rhyRoutingDetailsBottomSheet, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyRoutingDetailsBottomSheet, args);
        }
    }
}
