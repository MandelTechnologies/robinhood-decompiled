package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhBottomSheetDialogFragmentHost.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment$OnDismissListener;", "requireContext", "Landroid/content/Context;", "sheetListener", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "getSheetListener", "()Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "setSheetListener", "(Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;)V", "getChildFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onBottomSheetDismissed", "", "id", "", "SheetListener", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface RhBottomSheetDialogFragmentHost extends RhBottomSheetDialogFragment.OnClickListener, BaseBottomSheetDialogFragment.OnDismissListener {
    FragmentManager getChildFragmentManager();

    SheetListener getSheetListener();

    @Override // com.robinhood.android.common.ui.BaseBottomSheetDialogFragment.OnDismissListener
    void onBottomSheetDismissed(int id);

    Context requireContext();

    void setSheetListener(SheetListener sheetListener);

    /* compiled from: RhBottomSheetDialogFragmentHost.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static boolean onLearnMoreActionClicked(RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, int i, Bundle bundle) {
            return RhBottomSheetDialogFragment.OnClickListener.DefaultImpls.onLearnMoreActionClicked(rhBottomSheetDialogFragmentHost, i, bundle);
        }
    }

    /* compiled from: RhBottomSheetDialogFragmentHost.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment$OnDismissListener;", "id", "", "onPrimaryClick", "Lkotlin/Function0;", "", "onSecondaryClick", "onDismiss", "<init>", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onEvent", "", "dialogId", "fn", "onPrimaryButtonClicked", "passthroughArgs", "Landroid/os/Bundle;", "onSecondaryButtonClicked", "onBottomSheetDismissed", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class SheetListener implements RhBottomSheetDialogFragment.OnClickListener, BaseBottomSheetDialogFragment.OnDismissListener {
        public static final int $stable = 0;
        private final int id;
        private final Function0<Unit> onDismiss;
        private final Function0<Unit> onPrimaryClick;
        private final Function0<Unit> onSecondaryClick;

        public SheetListener(int i, Function0<Unit> onPrimaryClick, Function0<Unit> function0, Function0<Unit> onDismiss) {
            Intrinsics.checkNotNullParameter(onPrimaryClick, "onPrimaryClick");
            Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
            this.id = i;
            this.onPrimaryClick = onPrimaryClick;
            this.onSecondaryClick = function0;
            this.onDismiss = onDismiss;
        }

        @Override // com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
        public boolean onLearnMoreActionClicked(int i, Bundle bundle) {
            return RhBottomSheetDialogFragment.OnClickListener.DefaultImpls.onLearnMoreActionClicked(this, i, bundle);
        }

        private final boolean onEvent(int dialogId, Function0<Unit> fn) {
            if (dialogId != this.id || fn == null) {
                return false;
            }
            fn.invoke();
            return true;
        }

        @Override // com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
        public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
            return onEvent(dialogId, this.onPrimaryClick);
        }

        @Override // com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
        public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
            return onEvent(dialogId, this.onSecondaryClick);
        }

        @Override // com.robinhood.android.common.ui.BaseBottomSheetDialogFragment.OnDismissListener
        public void onBottomSheetDismissed(int id) {
            onEvent(id, this.onDismiss);
        }
    }
}
