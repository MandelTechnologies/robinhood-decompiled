package com.withpersona.sdk2.inquiry.steps.p423ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$id;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$layout;

/* loaded from: classes18.dex */
public final class Pi2InputSelectBottomSheetBinding implements ViewBinding {
    public final FrameLayout bottomSheet;
    public final LinearLayout listContent;
    public final View listContentSeparator;
    public final RecyclerView recyclerviewInquirySelectList;
    private final FrameLayout rootView;
    public final TextInputEditText searchBarEditText;
    public final TextInputLayout searchBarTextInput;
    public final View shadow;
    public final TextView textviewInputSelectSheetTitle;
    public final MaterialToolbar topAppBar;

    private Pi2InputSelectBottomSheetBinding(FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout, View view, RecyclerView recyclerView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, View view2, TextView textView, MaterialToolbar materialToolbar) {
        this.rootView = frameLayout;
        this.bottomSheet = frameLayout2;
        this.listContent = linearLayout;
        this.listContentSeparator = view;
        this.recyclerviewInquirySelectList = recyclerView;
        this.searchBarEditText = textInputEditText;
        this.searchBarTextInput = textInputLayout;
        this.shadow = view2;
        this.textviewInputSelectSheetTitle = textView;
        this.topAppBar = materialToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static Pi2InputSelectBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_input_select_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2InputSelectBottomSheetBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R$id.bottom_sheet;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R$id.list_content;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.list_content_separator))) != null) {
                i = R$id.recyclerview_inquiry_select_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R$id.search_bar_edit_text;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i);
                    if (textInputEditText != null) {
                        i = R$id.search_bar_text_input;
                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                        if (textInputLayout != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R$id.shadow))) != null) {
                            i = R$id.textview_input_select_sheet_title;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R$id.top_app_bar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, i);
                                if (materialToolbar != null) {
                                    return new Pi2InputSelectBottomSheetBinding((FrameLayout) view, frameLayout, linearLayout, viewFindChildViewById, recyclerView, textInputEditText, textInputLayout, viewFindChildViewById2, textView, materialToolbar);
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
