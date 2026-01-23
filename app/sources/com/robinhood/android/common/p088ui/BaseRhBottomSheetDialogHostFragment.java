package com.robinhood.android.common.p088ui;

import android.os.Bundle;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseRhBottomSheetDialogHostFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost;", "layoutRes", "", "<init>", "(I)V", "sheetListener", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "getSheetListener", "()Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "setSheetListener", "(Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;)V", "onPrimaryButtonClicked", "", "dialogId", "passthroughArgs", "Landroid/os/Bundle;", "onSecondaryButtonClicked", "onBottomSheetDismissed", "", "id", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public class BaseRhBottomSheetDialogHostFragment extends BaseFragment implements RhBottomSheetDialogFragmentHost {
    public static final int $stable = 8;
    private RhBottomSheetDialogFragmentHost.SheetListener sheetListener;

    public BaseRhBottomSheetDialogHostFragment(int i) {
        super(i);
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost
    public RhBottomSheetDialogFragmentHost.SheetListener getSheetListener() {
        return this.sheetListener;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost
    public void setSheetListener(RhBottomSheetDialogFragmentHost.SheetListener sheetListener) {
        this.sheetListener = sheetListener;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        RhBottomSheetDialogFragmentHost.SheetListener sheetListener = getSheetListener();
        Boolean boolValueOf = sheetListener != null ? Boolean.valueOf(sheetListener.onPrimaryButtonClicked(dialogId, passthroughArgs)) : null;
        setSheetListener(null);
        return boolValueOf != null ? boolValueOf.booleanValue() : super.onPrimaryButtonClicked(dialogId, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        RhBottomSheetDialogFragmentHost.SheetListener sheetListener = getSheetListener();
        Boolean boolValueOf = sheetListener != null ? Boolean.valueOf(sheetListener.onSecondaryButtonClicked(dialogId, passthroughArgs)) : null;
        setSheetListener(null);
        return boolValueOf != null ? boolValueOf.booleanValue() : super.onSecondaryButtonClicked(dialogId, passthroughArgs);
    }

    public void onBottomSheetDismissed(int id) {
        RhBottomSheetDialogFragmentHost.SheetListener sheetListener = getSheetListener();
        if (sheetListener != null) {
            sheetListener.onBottomSheetDismissed(id);
        }
    }
}
