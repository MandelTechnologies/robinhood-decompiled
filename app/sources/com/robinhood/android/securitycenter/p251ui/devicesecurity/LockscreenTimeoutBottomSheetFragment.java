package com.robinhood.android.securitycenter.p251ui.devicesecurity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.util.extensions.LockscreenTimeouts;
import com.robinhood.prefs.LockscreenTimeout;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
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

/* compiled from: LockscreenTimeoutBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devicesecurity/LockscreenTimeoutBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "Lkotlin/properties/ReadOnlyProperty;", LockscreenTimeoutBottomSheetFragment.ARG_SELECTED, "Lcom/robinhood/prefs/LockscreenTimeout;", "getSelected", "()Lcom/robinhood/prefs/LockscreenTimeout;", "selected$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "callbacks", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/LockscreenTimeoutBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/securitycenter/ui/devicesecurity/LockscreenTimeoutBottomSheetFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Callbacks", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class LockscreenTimeoutBottomSheetFragment extends BaseBottomSheetDialogFragment {
    private static final String ARG_SELECTED = "selected";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LockscreenTimeoutBottomSheetFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(LockscreenTimeoutBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/securitycenter/ui/devicesecurity/LockscreenTimeoutBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView = bindView(C28186R.id.lockscreen_timeout_recycler_view);

    /* renamed from: selected$delegate, reason: from kotlin metadata */
    private final Lazy selected = Fragments2.argument(this, ARG_SELECTED);
    private final GenericListAdapter<RdsRowView, LockscreenTimeout> adapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.LockscreenTimeoutBottomSheetFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return LockscreenTimeoutBottomSheetFragment.adapter$lambda$1(this.f$0, (RdsRowView) obj, (LockscreenTimeout) obj2);
        }
    });

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.LockscreenTimeoutBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
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

    /* compiled from: LockscreenTimeoutBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devicesecurity/LockscreenTimeoutBottomSheetFragment$Callbacks;", "", "onSelectionClicked", "", "lockscreenTimeout", "Lcom/robinhood/prefs/LockscreenTimeout;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSelectionClicked(LockscreenTimeout lockscreenTimeout);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[0]);
    }

    private final LockscreenTimeout getSelected() {
        return (LockscreenTimeout) this.selected.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(final LockscreenTimeoutBottomSheetFragment lockscreenTimeoutBottomSheetFragment, RdsRowView of, final LockscreenTimeout item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setPrimaryText(lockscreenTimeoutBottomSheetFragment.getString(LockscreenTimeouts.getStringRes(item)));
        of.setTrailingIconDrawable(item == lockscreenTimeoutBottomSheetFragment.getSelected() ? ViewsKt.getDrawable(of, C13997R.drawable.svg_ic_checkmark_24dp) : null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.LockscreenTimeoutBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LockscreenTimeoutBottomSheetFragment.adapter$lambda$1$lambda$0(this.f$0, item);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1$lambda$0(LockscreenTimeoutBottomSheetFragment lockscreenTimeoutBottomSheetFragment, LockscreenTimeout lockscreenTimeout) {
        lockscreenTimeoutBottomSheetFragment.getCallbacks().onSelectionClicked(lockscreenTimeout);
        lockscreenTimeoutBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.adapter.submitList(ArraysKt.toList(LockscreenTimeout.values()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C28186R.layout.fragment_lockscreen_timeout, container, false);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        bindAdapter(getRecyclerView(), this.adapter);
    }

    /* compiled from: LockscreenTimeoutBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0006\u001a\u00020\u0007\"\f\b\u0000\u0010\b*\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\b2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devicesecurity/LockscreenTimeoutBottomSheetFragment$Companion;", "", "<init>", "()V", "ARG_SELECTED", "", "newInstance", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/LockscreenTimeoutBottomSheetFragment;", "C", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/LockscreenTimeoutBottomSheetFragment$Callbacks;", "callbacks", LockscreenTimeoutBottomSheetFragment.ARG_SELECTED, "Lcom/robinhood/prefs/LockscreenTimeout;", "(Landroidx/fragment/app/Fragment;Lcom/robinhood/prefs/LockscreenTimeout;)Lcom/robinhood/android/securitycenter/ui/devicesecurity/LockscreenTimeoutBottomSheetFragment;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <C extends Fragment & Callbacks> LockscreenTimeoutBottomSheetFragment newInstance(C callbacks, LockscreenTimeout selected) {
            Intrinsics.checkNotNullParameter(callbacks, "callbacks");
            Intrinsics.checkNotNullParameter(selected, "selected");
            LockscreenTimeoutBottomSheetFragment lockscreenTimeoutBottomSheetFragment = new LockscreenTimeoutBottomSheetFragment();
            lockscreenTimeoutBottomSheetFragment.setTargetFragment(callbacks, 0);
            Bundle bundle = new Bundle();
            bundle.putSerializable(LockscreenTimeoutBottomSheetFragment.ARG_SELECTED, selected);
            lockscreenTimeoutBottomSheetFragment.setArguments(bundle);
            return lockscreenTimeoutBottomSheetFragment;
        }
    }
}
