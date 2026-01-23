package com.robinhood.android.recommendations.lib.p221ui.recurringhook;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.recommendations.contracts.RecommendationsRecurringHook;
import com.robinhood.android.recommendations.lib.p221ui.recurringhook.intro.RecommendationsRecurringHookIntroFragment;
import com.robinhood.android.recommendations.lib.p221ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionFragment;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecommendationsRecurringHookParentFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/recommendations/lib/ui/recurringhook/RecommendationsRecurringHookParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/recommendations/lib/ui/recurringhook/intro/RecommendationsRecurringHookIntroFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOrderTypeSelection", "Companion", "feature-lib-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsRecurringHookParentFragment extends BaseFragment implements RecommendationsRecurringHookIntroFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseFragment.$stable;

    public RecommendationsRecurringHookParentFragment() {
        super(C11048R.layout.parent_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        if (((RecommendationsRecurringHook) companion.getArgs((Fragment) this)).getAccountNumber().length() <= 0) {
            throw new IllegalStateException("must provide valid account number");
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, RecommendationsRecurringHookIntroFragment.INSTANCE.newInstance((Parcelable) new RecommendationsRecurringHookIntroFragment.Args(((RecommendationsRecurringHook) companion.getArgs((Fragment) this)).getSource(), ((RecommendationsRecurringHook) companion.getArgs((Fragment) this)).getAccountType(), ((RecommendationsRecurringHook) companion.getArgs((Fragment) this)).getRecommendationId())));
        }
    }

    @Override // com.robinhood.android.recommendations.lib.ui.recurringhook.intro.RecommendationsRecurringHookIntroFragment.Callbacks
    public void onOrderTypeSelection() {
        RecommendationsRecurringHookOrderTypeSelectionFragment.Companion companion = RecommendationsRecurringHookOrderTypeSelectionFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new RecommendationsRecurringHookOrderTypeSelectionFragment.Args(((RecommendationsRecurringHook) companion2.getArgs((Fragment) this)).getSource(), ((RecommendationsRecurringHook) companion2.getArgs((Fragment) this)).getAccountNumber(), ((RecommendationsRecurringHook) companion2.getArgs((Fragment) this)).getAccountType(), ((RecommendationsRecurringHook) companion2.getArgs((Fragment) this)).getRecommendationId())));
    }

    /* compiled from: RecommendationsRecurringHookParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/recommendations/lib/ui/recurringhook/RecommendationsRecurringHookParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/recommendations/contracts/RecommendationsRecurringHook;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/lib/ui/recurringhook/RecommendationsRecurringHookParentFragment;", "<init>", "()V", "createFragment", "key", "feature-lib-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<RecommendationsRecurringHook>, FragmentWithArgsCompanion<RecommendationsRecurringHookParentFragment, RecommendationsRecurringHook> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RecommendationsRecurringHook getArgs(RecommendationsRecurringHookParentFragment recommendationsRecurringHookParentFragment) {
            return (RecommendationsRecurringHook) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsRecurringHookParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsRecurringHookParentFragment newInstance(RecommendationsRecurringHook recommendationsRecurringHook) {
            return (RecommendationsRecurringHookParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, recommendationsRecurringHook);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsRecurringHookParentFragment recommendationsRecurringHookParentFragment, RecommendationsRecurringHook recommendationsRecurringHook) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsRecurringHookParentFragment, recommendationsRecurringHook);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public RecommendationsRecurringHookParentFragment createFragment(RecommendationsRecurringHook key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (RecommendationsRecurringHookParentFragment) newInstance((Parcelable) key);
        }
    }
}
