package com.robinhood.android.matcha.p177ui.profile;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.databinding.FragmentMatchaProfileMenuBinding;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MatchaProfileMenuBottomSheet.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0018\u0019\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/matcha/databinding/FragmentMatchaProfileMenuBinding;", "getBinding", "()Lcom/robinhood/android/matcha/databinding/FragmentMatchaProfileMenuBinding;", "binding$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Args", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaProfileMenuBottomSheet extends BaseBottomSheetDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchaProfileMenuBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(MatchaProfileMenuBottomSheet.class, "binding", "getBinding()Lcom/robinhood/android/matcha/databinding/FragmentMatchaProfileMenuBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaProfileMenuBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Callbacks;", "", "onBlockUserRequested", "", "onReportUserRequested", "viewProfile", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBlockUserRequested();

        void onReportUserRequested();

        void viewProfile();
    }

    public MatchaProfileMenuBottomSheet() {
        super(C21284R.layout.fragment_matcha_profile_menu);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, MatchaProfileMenuBottomSheet2.INSTANCE);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentMatchaProfileMenuBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMatchaProfileMenuBinding) value;
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
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentMatchaProfileMenuBinding binding = getBinding();
        RdsButton closeButton = binding.closeButton;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        OnClickListeners.onClick(closeButton, new MatchaProfileMenuBottomSheet3(this));
        RdsRowView rdsRowView = binding.viewProfileRow;
        Intrinsics.checkNotNull(rdsRowView);
        Companion companion = INSTANCE;
        rdsRowView.setVisibility(((Args) companion.getArgs((Fragment) this)).getShowViewProfile() ? 0 : 8);
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaProfileMenuBottomSheet.onViewCreated$lambda$7$lambda$2$lambda$1(this.f$0);
            }
        });
        RdsRowView rdsRowView2 = binding.blockRow;
        Intrinsics.checkNotNull(rdsRowView2);
        rdsRowView2.setVisibility(((Args) companion.getArgs((Fragment) this)).getShowBlock() ? 0 : 8);
        if (((Args) companion.getArgs((Fragment) this)).isBlocked()) {
            i = C21284R.string.matcha_profile_unblock_action;
        } else {
            i = C21284R.string.matcha_profile_block_action;
        }
        rdsRowView2.setPrimaryText(getString(i));
        OnClickListeners.onClick(rdsRowView2, new Function0() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaProfileMenuBottomSheet.onViewCreated$lambda$7$lambda$4$lambda$3(this.f$0);
            }
        });
        RdsRowView rdsRowView3 = binding.reportRow;
        Intrinsics.checkNotNull(rdsRowView3);
        rdsRowView3.setVisibility(((Args) companion.getArgs((Fragment) this)).getShowReport() ? 0 : 8);
        OnClickListeners.onClick(rdsRowView3, new Function0() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaProfileMenuBottomSheet.onViewCreated$lambda$7$lambda$6$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$2$lambda$1(MatchaProfileMenuBottomSheet matchaProfileMenuBottomSheet) {
        matchaProfileMenuBottomSheet.getCallbacks().viewProfile();
        matchaProfileMenuBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$4$lambda$3(MatchaProfileMenuBottomSheet matchaProfileMenuBottomSheet) {
        matchaProfileMenuBottomSheet.getCallbacks().onBlockUserRequested();
        matchaProfileMenuBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$5(MatchaProfileMenuBottomSheet matchaProfileMenuBottomSheet) {
        matchaProfileMenuBottomSheet.getCallbacks().onReportUserRequested();
        matchaProfileMenuBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaProfileMenuBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Args;", "Landroid/os/Parcelable;", "showViewProfile", "", "getShowViewProfile", "()Z", "showReport", "getShowReport", "showBlock", "getShowBlock", "isBlocked", "FromProfile", "FromTransferDetail", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Args$FromProfile;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Args$FromTransferDetail;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Args extends Parcelable {
        boolean getShowBlock();

        boolean getShowReport();

        boolean getShowViewProfile();

        boolean isBlocked();

        /* compiled from: MatchaProfileMenuBottomSheet.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u001a\u0010\t\u001a\u00020\u0003X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u0003X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\b¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Args$FromProfile;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Args;", "showReport", "", "isBlocked", "<init>", "(ZZ)V", "getShowReport", "()Z", "showViewProfile", "getShowViewProfile$annotations", "()V", "getShowViewProfile", "showBlock", "getShowBlock$annotations", "getShowBlock", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FromProfile implements Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<FromProfile> CREATOR = new Creator();
            private final boolean isBlocked;
            private final boolean showBlock = true;
            private final boolean showReport;
            private final boolean showViewProfile;

            /* compiled from: MatchaProfileMenuBottomSheet.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<FromProfile> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FromProfile createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FromProfile(parcel.readInt() != 0, parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FromProfile[] newArray(int i) {
                    return new FromProfile[i];
                }
            }

            public static /* synthetic */ FromProfile copy$default(FromProfile fromProfile, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = fromProfile.showReport;
                }
                if ((i & 2) != 0) {
                    z2 = fromProfile.isBlocked;
                }
                return fromProfile.copy(z, z2);
            }

            public static /* synthetic */ void getShowBlock$annotations() {
            }

            public static /* synthetic */ void getShowViewProfile$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowReport() {
                return this.showReport;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsBlocked() {
                return this.isBlocked;
            }

            public final FromProfile copy(boolean showReport, boolean isBlocked) {
                return new FromProfile(showReport, isBlocked);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FromProfile)) {
                    return false;
                }
                FromProfile fromProfile = (FromProfile) other;
                return this.showReport == fromProfile.showReport && this.isBlocked == fromProfile.isBlocked;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.showReport) * 31) + Boolean.hashCode(this.isBlocked);
            }

            public String toString() {
                return "FromProfile(showReport=" + this.showReport + ", isBlocked=" + this.isBlocked + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.showReport ? 1 : 0);
                dest.writeInt(this.isBlocked ? 1 : 0);
            }

            public FromProfile(boolean z, boolean z2) {
                this.showReport = z;
                this.isBlocked = z2;
            }

            @Override // com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet.Args
            public boolean getShowReport() {
                return this.showReport;
            }

            @Override // com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet.Args
            public boolean isBlocked() {
                return this.isBlocked;
            }

            @Override // com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet.Args
            public boolean getShowViewProfile() {
                return this.showViewProfile;
            }

            @Override // com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet.Args
            public boolean getShowBlock() {
                return this.showBlock;
            }
        }

        /* compiled from: MatchaProfileMenuBottomSheet.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\t¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Args$FromTransferDetail;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Args;", "showReport", "", "isBlocked", "showBlock", "<init>", "(ZZZ)V", "getShowReport", "()Z", "getShowBlock", "showViewProfile", "getShowViewProfile$annotations", "()V", "getShowViewProfile", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FromTransferDetail implements Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<FromTransferDetail> CREATOR = new Creator();
            private final boolean isBlocked;
            private final boolean showBlock;
            private final boolean showReport;
            private final boolean showViewProfile = !isBlocked();

            /* compiled from: MatchaProfileMenuBottomSheet.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<FromTransferDetail> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FromTransferDetail createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FromTransferDetail(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FromTransferDetail[] newArray(int i) {
                    return new FromTransferDetail[i];
                }
            }

            public static /* synthetic */ FromTransferDetail copy$default(FromTransferDetail fromTransferDetail, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = fromTransferDetail.showReport;
                }
                if ((i & 2) != 0) {
                    z2 = fromTransferDetail.isBlocked;
                }
                if ((i & 4) != 0) {
                    z3 = fromTransferDetail.showBlock;
                }
                return fromTransferDetail.copy(z, z2, z3);
            }

            public static /* synthetic */ void getShowViewProfile$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowReport() {
                return this.showReport;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsBlocked() {
                return this.isBlocked;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowBlock() {
                return this.showBlock;
            }

            public final FromTransferDetail copy(boolean showReport, boolean isBlocked, boolean showBlock) {
                return new FromTransferDetail(showReport, isBlocked, showBlock);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FromTransferDetail)) {
                    return false;
                }
                FromTransferDetail fromTransferDetail = (FromTransferDetail) other;
                return this.showReport == fromTransferDetail.showReport && this.isBlocked == fromTransferDetail.isBlocked && this.showBlock == fromTransferDetail.showBlock;
            }

            public int hashCode() {
                return (((Boolean.hashCode(this.showReport) * 31) + Boolean.hashCode(this.isBlocked)) * 31) + Boolean.hashCode(this.showBlock);
            }

            public String toString() {
                return "FromTransferDetail(showReport=" + this.showReport + ", isBlocked=" + this.isBlocked + ", showBlock=" + this.showBlock + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.showReport ? 1 : 0);
                dest.writeInt(this.isBlocked ? 1 : 0);
                dest.writeInt(this.showBlock ? 1 : 0);
            }

            public FromTransferDetail(boolean z, boolean z2, boolean z3) {
                this.showReport = z;
                this.isBlocked = z2;
                this.showBlock = z3;
            }

            @Override // com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet.Args
            public boolean getShowReport() {
                return this.showReport;
            }

            @Override // com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet.Args
            public boolean isBlocked() {
                return this.isBlocked;
            }

            @Override // com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet.Args
            public boolean getShowBlock() {
                return this.showBlock;
            }

            @Override // com.robinhood.android.matcha.ui.profile.MatchaProfileMenuBottomSheet.Args
            public boolean getShowViewProfile() {
                return this.showViewProfile;
            }
        }
    }

    /* compiled from: MatchaProfileMenuBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MatchaProfileMenuBottomSheet, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MatchaProfileMenuBottomSheet matchaProfileMenuBottomSheet) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, matchaProfileMenuBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaProfileMenuBottomSheet newInstance(Args args) {
            return (MatchaProfileMenuBottomSheet) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaProfileMenuBottomSheet matchaProfileMenuBottomSheet, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, matchaProfileMenuBottomSheet, args);
        }
    }
}
