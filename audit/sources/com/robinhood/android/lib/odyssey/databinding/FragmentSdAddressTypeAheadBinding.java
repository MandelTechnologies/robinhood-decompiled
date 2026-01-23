package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdAddressInputRow;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class FragmentSdAddressTypeAheadBinding implements ViewBinding {
    public final Space extraSpace1;
    public final Space extraSpace2;
    private final LinearLayout rootView;
    public final SdTextView sdAddressDisclaimer;
    public final RdsTextInputEditText sdAddressEdt;
    public final SdAddressInputRow sdAddressInputContainer;
    public final RdsProgressBar sdAddressProgressBar;
    public final RecyclerView sdAddressSelectorList;
    public final SdTextView sdAddressSubtitle;
    public final SdTextView sdAddressTitle;
    public final LinearLayout sdAddressTitleContainer;

    private FragmentSdAddressTypeAheadBinding(LinearLayout linearLayout, Space space, Space space2, SdTextView sdTextView, RdsTextInputEditText rdsTextInputEditText, SdAddressInputRow sdAddressInputRow, RdsProgressBar rdsProgressBar, RecyclerView recyclerView, SdTextView sdTextView2, SdTextView sdTextView3, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.extraSpace1 = space;
        this.extraSpace2 = space2;
        this.sdAddressDisclaimer = sdTextView;
        this.sdAddressEdt = rdsTextInputEditText;
        this.sdAddressInputContainer = sdAddressInputRow;
        this.sdAddressProgressBar = rdsProgressBar;
        this.sdAddressSelectorList = recyclerView;
        this.sdAddressSubtitle = sdTextView2;
        this.sdAddressTitle = sdTextView3;
        this.sdAddressTitleContainer = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdAddressTypeAheadBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdAddressTypeAheadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_address_type_ahead, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdAddressTypeAheadBinding bind(View view) {
        int i = C20335R.id.extra_space_1;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = C20335R.id.extra_space_2;
            Space space2 = (Space) ViewBindings.findChildViewById(view, i);
            if (space2 != null) {
                i = C20335R.id.sd_address_disclaimer;
                SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
                if (sdTextView != null) {
                    i = C20335R.id.sd_address_edt;
                    RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputEditText != null) {
                        i = C20335R.id.sd_address_input_container;
                        SdAddressInputRow sdAddressInputRow = (SdAddressInputRow) ViewBindings.findChildViewById(view, i);
                        if (sdAddressInputRow != null) {
                            i = C20335R.id.sd_address_progress_bar;
                            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                            if (rdsProgressBar != null) {
                                i = C20335R.id.sd_address_selector_list;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C20335R.id.sd_address_subtitle;
                                    SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                    if (sdTextView2 != null) {
                                        i = C20335R.id.sd_address_title;
                                        SdTextView sdTextView3 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                        if (sdTextView3 != null) {
                                            i = C20335R.id.sd_address_title_container;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                return new FragmentSdAddressTypeAheadBinding((LinearLayout) view, space, space2, sdTextView, rdsTextInputEditText, sdAddressInputRow, rdsProgressBar, recyclerView, sdTextView2, sdTextView3, linearLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
