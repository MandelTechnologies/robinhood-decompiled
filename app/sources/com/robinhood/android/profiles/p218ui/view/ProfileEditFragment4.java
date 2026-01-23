package com.robinhood.android.profiles.p218ui.view;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ProfileEditFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.profiles.ui.view.ProfileEditFragment$onViewCreated$1$1$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class ProfileEditFragment4 implements Runnable {
    final /* synthetic */ RecyclerView $this_apply;
    final /* synthetic */ ProfileEditFragment this$0;

    ProfileEditFragment4(ProfileEditFragment profileEditFragment, RecyclerView recyclerView) {
        this.this$0 = profileEditFragment;
        this.$this_apply = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$this_apply.setLayoutManager(new GridLayoutManager(this.this$0.requireContext(), this.this$0.calculateProfileColorSpanCount()));
    }
}
