package com.robinhood.hammer.android.fragment;

import androidx.fragment.app.Fragment;
import com.robinhood.hammer.android.activity.ActivityComponentManagerHolder;
import com.robinhood.hammer.android.fragment.FragmentComponent;
import com.robinhood.hammer.core.internal.AbstractComponentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentComponentManager.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/hammer/android/fragment/FragmentComponentManager;", "Lcom/robinhood/hammer/core/internal/AbstractComponentManager;", "Lcom/robinhood/hammer/android/fragment/FragmentComponent;", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "createComponent", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class FragmentComponentManager extends AbstractComponentManager<FragmentComponent> {
    private final Fragment fragment;

    public FragmentComponentManager(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.hammer.core.internal.AbstractComponentManager
    public FragmentComponent createComponent() {
        Object host = this.fragment.getHost();
        if (host == null) {
            throw new IllegalStateException("Fragment must be attached before creating its component");
        }
        if (!(host instanceof ActivityComponentManagerHolder)) {
            throw new IllegalStateException("Activity class must implement ActivityComponentManagerHolder");
        }
        return ((FragmentComponent.ParentComponent) ((ActivityComponentManagerHolder) host).getComponentManager().get()).createFragmentSubcomponentFactory().build(this.fragment);
    }
}
