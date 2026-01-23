package com.robinhood.microgram.sdui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.microgramsdui.SharedMicrogramRouterFragmentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.microgram.sdui.MicrogramRouterFragment;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey2;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SharedMicrogramParentFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@RX\u0096.¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/microgram/sdui/SharedMicrogramParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/microgram/sdui/MicrogramRouterFragmentCallbacks;", "<init>", "()V", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "setMoshi", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "getMicrogramManager", "()Lcom/robinhood/android/microgramsdui/MicrogramManager;", "setMicrogramManager", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;)V", "value", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "instance", "getInstance", "()Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "dismissChild", "dismissEntireMicrogramFlow", "Companion", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SharedMicrogramParentFragment extends BaseFragment implements MicrogramRouterFragment2 {
    private static final String emptyStateSaveName = "emptyStateSaveName";
    private MicrogramManager2 instance;
    public MicrogramManager microgramManager;
    public LazyMoshi moshi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SharedMicrogramParentFragment() {
        super(C11048R.layout.parent_fragment_container);
    }

    public final LazyMoshi getMoshi() {
        LazyMoshi lazyMoshi = this.moshi;
        if (lazyMoshi != null) {
            return lazyMoshi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("moshi");
        return null;
    }

    public final void setMoshi(LazyMoshi lazyMoshi) {
        Intrinsics.checkNotNullParameter(lazyMoshi, "<set-?>");
        this.moshi = lazyMoshi;
    }

    public final MicrogramManager getMicrogramManager() {
        MicrogramManager microgramManager = this.microgramManager;
        if (microgramManager != null) {
            return microgramManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("microgramManager");
        return null;
    }

    public final void setMicrogramManager(MicrogramManager microgramManager) {
        Intrinsics.checkNotNullParameter(microgramManager, "<set-?>");
        this.microgramManager = microgramManager;
    }

    @Override // com.robinhood.microgram.sdui.MicrogramAppUtils
    public MicrogramManager2 getInstance() {
        MicrogramManager2 microgramManager2 = this.instance;
        if (microgramManager2 != null) {
            return microgramManager2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instance");
        return null;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.instance = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(getMicrogramManager(), getLifecycleScope(), ((SharedMicrogramRouterFragmentKey) INSTANCE.getArgs((Fragment) this)).getId(), null, 4, null);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("rh_fragment_is_hosted_in_compose")) {
            getInstance().getComponent().getHostCompatibilityFlags().setNeverTearDownAndroidUi(true);
        }
        requireActivity().getWindow().setSoftInputMode(16);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment instanceof MicrogramRouterFragment ? (MicrogramRouterFragment) currentFragment : null) == null) {
            getChildFragmentManager().saveBackStack(emptyStateSaveName);
            setFragment(C11048R.id.fragment_container, MicrogramRouterFragment.INSTANCE.newInstance((Parcelable) new MicrogramRouterFragment.Args(((SharedMicrogramRouterFragmentKey) INSTANCE.getArgs((Fragment) this)).getInitialScreenData(), MicrogramRouterFragmentKey2.BOXES, null, 4, null)));
        } else {
            replaceFragment(ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(ShimmerLoaderType.Boxes.INSTANCE, null, 2, null)));
            dismissChild();
        }
    }

    @Override // com.robinhood.microgram.sdui.ChildFragmentCallbacks
    public void dismissChild() {
        requireBaseActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    /* compiled from: SharedMicrogramParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.SharedMicrogramParentFragment$dismissEntireMicrogramFlow$1", m3645f = "SharedMicrogramParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.SharedMicrogramParentFragment$dismissEntireMicrogramFlow$1 */
    static final class C350441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C350441(Continuation<? super C350441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedMicrogramParentFragment.this.new C350441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C350441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SharedMicrogramParentFragment.this.getChildFragmentManager().clearBackStack(SharedMicrogramParentFragment.emptyStateSaveName);
            SharedMicrogramParentFragment.this.getChildFragmentManager().executePendingTransactions();
            SharedMicrogramParentFragment.this.dismissChild();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.microgram.sdui.ChildFragmentCallbacks
    public void dismissEntireMicrogramFlow() {
        getLifecycleScope().launchWhenResumed(new C350441(null));
    }

    /* compiled from: SharedMicrogramParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/SharedMicrogramParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/microgram/sdui/SharedMicrogramParentFragment;", "Lcom/robinhood/android/microgramsdui/SharedMicrogramRouterFragmentKey;", "<init>", "()V", SharedMicrogramParentFragment.emptyStateSaveName, "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SharedMicrogramParentFragment, SharedMicrogramRouterFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SharedMicrogramRouterFragmentKey sharedMicrogramRouterFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, sharedMicrogramRouterFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SharedMicrogramRouterFragmentKey getArgs(SharedMicrogramParentFragment sharedMicrogramParentFragment) {
            return (SharedMicrogramRouterFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, sharedMicrogramParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SharedMicrogramParentFragment newInstance(SharedMicrogramRouterFragmentKey sharedMicrogramRouterFragmentKey) {
            return (SharedMicrogramParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, sharedMicrogramRouterFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SharedMicrogramParentFragment sharedMicrogramParentFragment, SharedMicrogramRouterFragmentKey sharedMicrogramRouterFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, sharedMicrogramParentFragment, sharedMicrogramRouterFragmentKey);
        }
    }
}
