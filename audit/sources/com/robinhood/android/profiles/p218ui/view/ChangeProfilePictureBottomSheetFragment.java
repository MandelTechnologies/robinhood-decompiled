package com.robinhood.android.profiles.p218ui.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.profiles.p218ui.C25904R;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithCallbacksCompanion;
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

/* compiled from: ChangeProfilePictureBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ChangeProfilePictureBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "uploadImageRow", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "getUploadImageRow", "()Lcom/robinhood/android/designsystem/row/RdsRowView;", "uploadImageRow$delegate", "Lkotlin/properties/ReadOnlyProperty;", "removeImageRow", "getRemoveImageRow", "removeImageRow$delegate", "callbacks", "Lcom/robinhood/android/profiles/ui/view/ChangeProfilePictureBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/profiles/ui/view/ChangeProfilePictureBottomSheetFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Callbacks", "Companion", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ChangeProfilePictureBottomSheetFragment extends BaseBottomSheetDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChangeProfilePictureBottomSheetFragment.class, "uploadImageRow", "getUploadImageRow()Lcom/robinhood/android/designsystem/row/RdsRowView;", 0)), Reflection.property1(new PropertyReference1Impl(ChangeProfilePictureBottomSheetFragment.class, "removeImageRow", "getRemoveImageRow()Lcom/robinhood/android/designsystem/row/RdsRowView;", 0)), Reflection.property1(new PropertyReference1Impl(ChangeProfilePictureBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/profiles/ui/view/ChangeProfilePictureBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: uploadImageRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 uploadImageRow = bindView(C25904R.id.change_profile_picture_upload_image_row);

    /* renamed from: removeImageRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 removeImageRow = bindView(C25904R.id.change_profile_picture_remove_image_row);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.profiles.ui.view.ChangeProfilePictureBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
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

    /* compiled from: ChangeProfilePictureBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ChangeProfilePictureBottomSheetFragment$Callbacks;", "", "onUploadImageClick", "", "onRemoveImageClick", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRemoveImageClick();

        void onUploadImageClick();
    }

    private final RdsRowView getUploadImageRow() {
        return (RdsRowView) this.uploadImageRow.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsRowView getRemoveImageRow() {
        return (RdsRowView) this.removeImageRow.getValue(this, $$delegatedProperties[1]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C25904R.layout.dialog_change_profile_picture_bottom_sheet, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        OnClickListeners.onClick(getUploadImageRow(), new Function0() { // from class: com.robinhood.android.profiles.ui.view.ChangeProfilePictureBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChangeProfilePictureBottomSheetFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        OnClickListeners.onClick(getRemoveImageRow(), new Function0() { // from class: com.robinhood.android.profiles.ui.view.ChangeProfilePictureBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChangeProfilePictureBottomSheetFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ChangeProfilePictureBottomSheetFragment changeProfilePictureBottomSheetFragment) {
        changeProfilePictureBottomSheetFragment.getCallbacks().onUploadImageClick();
        changeProfilePictureBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(ChangeProfilePictureBottomSheetFragment changeProfilePictureBottomSheetFragment) {
        changeProfilePictureBottomSheetFragment.getCallbacks().onRemoveImageClick();
        changeProfilePictureBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: ChangeProfilePictureBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ChangeProfilePictureBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithCallbacksCompanion;", "Lcom/robinhood/android/profiles/ui/view/ChangeProfilePictureBottomSheetFragment;", "Lcom/robinhood/android/profiles/ui/view/ChangeProfilePictureBottomSheetFragment$Callbacks;", "<init>", "()V", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithCallbacksCompanion<ChangeProfilePictureBottomSheetFragment, Callbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((ChangeProfilePictureBottomSheetFragment) fragment);
        }

        public Void getArgs(ChangeProfilePictureBottomSheetFragment changeProfilePictureBottomSheetFragment) {
            return FragmentWithCallbacksCompanion.DefaultImpls.getArgs(this, changeProfilePictureBottomSheetFragment);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Void) parcelable, (Void) fragment, i);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Fragment fragment, int i) {
            return newInstance((Companion) fragment, i);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithCallbacksCompanion
        public <C extends Fragment & Callbacks> ChangeProfilePictureBottomSheetFragment newInstance(C c, int i) {
            return (ChangeProfilePictureBottomSheetFragment) FragmentWithCallbacksCompanion.DefaultImpls.newInstance(this, c, i);
        }

        public <C extends Fragment & Callbacks> ChangeProfilePictureBottomSheetFragment newInstance(Void r1, C c, int i) {
            return (ChangeProfilePictureBottomSheetFragment) FragmentWithCallbacksCompanion.DefaultImpls.newInstance(this, r1, c, i);
        }
    }
}
