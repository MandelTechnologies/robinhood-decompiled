package com.withpersona.sdk2.inquiry.sandbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.workflow1.p415ui.WorkflowViewStub;
import com.withpersona.sdk2.inquiry.sandbox.R$id;
import com.withpersona.sdk2.inquiry.sandbox.R$layout;

/* loaded from: classes18.dex */
public final class Pi2SandboxOverlayBinding implements ViewBinding {
    public final WorkflowViewStub childStub;
    public final FloatingActionButton floatingActionButton;
    private final CoordinatorLayout rootView;

    private Pi2SandboxOverlayBinding(CoordinatorLayout coordinatorLayout, WorkflowViewStub workflowViewStub, FloatingActionButton floatingActionButton) {
        this.rootView = coordinatorLayout;
        this.childStub = workflowViewStub;
        this.floatingActionButton = floatingActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static Pi2SandboxOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_sandbox_overlay, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2SandboxOverlayBinding bind(View view) {
        int i = R$id.child_stub;
        WorkflowViewStub workflowViewStub = (WorkflowViewStub) ViewBindings.findChildViewById(view, i);
        if (workflowViewStub != null) {
            i = R$id.floating_action_button;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, i);
            if (floatingActionButton != null) {
                return new Pi2SandboxOverlayBinding((CoordinatorLayout) view, workflowViewStub, floatingActionButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
