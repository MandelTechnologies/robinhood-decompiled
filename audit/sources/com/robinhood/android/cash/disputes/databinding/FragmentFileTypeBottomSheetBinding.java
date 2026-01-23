package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.row.RdsRowView;

/* loaded from: classes7.dex */
public final class FragmentFileTypeBottomSheetBinding implements ViewBinding {
    public final RdsRowView fileSelectionBottomSheetCamera;
    public final RdsRowView fileSelectionBottomSheetPdf;
    public final RdsRowView fileSelectionBottomSheetPhotos;
    private final LinearLayout rootView;

    private FragmentFileTypeBottomSheetBinding(LinearLayout linearLayout, RdsRowView rdsRowView, RdsRowView rdsRowView2, RdsRowView rdsRowView3) {
        this.rootView = linearLayout;
        this.fileSelectionBottomSheetCamera = rdsRowView;
        this.fileSelectionBottomSheetPdf = rdsRowView2;
        this.fileSelectionBottomSheetPhotos = rdsRowView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFileTypeBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFileTypeBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_file_type_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentFileTypeBottomSheetBinding bind(View view) {
        int i = C10007R.id.file_selection_bottom_sheet_camera;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C10007R.id.file_selection_bottom_sheet_pdf;
            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView2 != null) {
                i = C10007R.id.file_selection_bottom_sheet_photos;
                RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView3 != null) {
                    return new FragmentFileTypeBottomSheetBinding((LinearLayout) view, rdsRowView, rdsRowView2, rdsRowView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
