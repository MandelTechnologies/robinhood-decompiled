package com.squareup.workflow1.p415ui.backstack;

import android.view.View;
import com.squareup.workflow1.p415ui.Named;
import com.squareup.workflow1.p415ui.WorkflowViewState;
import com.squareup.workflow1.p415ui.WorkflowViewState2;
import kotlin.Metadata;

/* compiled from: ViewStateCache.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Landroid/view/View;", "", "getNamedKey", "(Landroid/view/View;)Ljava/lang/String;", "getNamedKey$annotations", "(Landroid/view/View;)V", "namedKey", "wf1-container-android"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.backstack.ViewStateCacheKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ViewStateCache3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNamedKey(View view) {
        WorkflowViewState<?> workflowViewStateOrNull = WorkflowViewState2.getWorkflowViewStateOrNull(view);
        Object showing = workflowViewStateOrNull == null ? null : workflowViewStateOrNull.getShowing();
        Named named = showing == null ? null : (Named) showing;
        String compatibilityKey = named != null ? named.getCompatibilityKey() : null;
        if (compatibilityKey != null) {
            return compatibilityKey;
        }
        throw new IllegalStateException(("Expected " + view + " to be showing a " + ((Object) Named.class.getSimpleName()) + "<*> rendering, found " + named).toString());
    }
}
