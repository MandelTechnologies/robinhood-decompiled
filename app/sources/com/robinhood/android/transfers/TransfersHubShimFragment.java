package com.robinhood.android.transfers;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.transfers.i18n.InternationalTransferHubRegionGate;
import com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment;
import com.robinhood.android.util.style.DesignSystemLegacyShim;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.shared.transfers.contracts.TransfersHub;
import io.reactivex.Observable;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: TransfersHubShimFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/TransfersHubShimFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "getRegionGateProvider", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "setRegionGateProvider", "(Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransfersHubShimFragment extends BaseFragment {
    public RegionGateProvider regionGateProvider;
    private final boolean useDesignSystemToolbar;
    public UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public TransfersHubShimFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
    }

    public final UserStore getUserStore() {
        UserStore userStore = this.userStore;
        if (userStore != null) {
            return userStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStore");
        return null;
    }

    public final void setUserStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "<set-?>");
        this.userStore = userStore;
    }

    public final RegionGateProvider getRegionGateProvider() {
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        if (regionGateProvider != null) {
            return regionGateProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regionGateProvider");
        return null;
    }

    public final void setRegionGateProvider(RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "<set-?>");
        this.regionGateProvider = regionGateProvider;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager2.getScarletManager(scarletContextWrapper).putOverlay(DesignSystemLegacyShim.INSTANCE, Boolean.FALSE);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getCurrentFragment() == null) {
            getLifecycleScope().launchWhenCreated(new C300811(null));
        }
    }

    /* compiled from: TransfersHubShimFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubShimFragment$onViewCreated$1", m3645f = "TransfersHubShimFragment.kt", m3646l = {45, 62}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.TransfersHubShimFragment$onViewCreated$1 */
    static final class C300811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        C300811(Continuation<? super C300811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransfersHubShimFragment.this.new C300811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C300811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            int i;
            C300811 c300811;
            TransfersHubShimFragment transfersHubShimFragment;
            Fragment fragmentNewInstance;
            int i2;
            InternationalTransfersHubFragment.Companion companion;
            TransfersHubShimFragment transfersHubShimFragment2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                TransfersHubShimFragment transfersHubShimFragment3 = TransfersHubShimFragment.this;
                i = C11048R.id.fragment_container;
                RegionGateProvider regionGateProvider = transfersHubShimFragment3.getRegionGateProvider();
                InternationalTransferHubRegionGate internationalTransferHubRegionGate = InternationalTransferHubRegionGate.INSTANCE;
                this.L$0 = transfersHubShimFragment3;
                this.I$0 = i;
                this.label = 1;
                c300811 = this;
                Object regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, internationalTransferHubRegionGate, false, c300811, 2, null);
                if (regionGateState$default != coroutine_suspended) {
                    transfersHubShimFragment = transfersHubShimFragment3;
                    obj = regionGateState$default;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$0;
                companion = (InternationalTransfersHubFragment.Companion) this.L$1;
                transfersHubShimFragment2 = (TransfersHubShimFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
                fragmentNewInstance = companion.newInstance((Parcelable) new InternationalTransfersHubFragment.Args(((User) obj).getOrigin().getLocality()));
                i = i2;
                transfersHubShimFragment = transfersHubShimFragment2;
                transfersHubShimFragment.setFragment(i, fragmentNewInstance);
                return Unit.INSTANCE;
            }
            i = this.I$0;
            transfersHubShimFragment = (TransfersHubShimFragment) this.L$0;
            ResultKt.throwOnFailure(obj);
            c300811 = this;
            if (((Boolean) obj).booleanValue()) {
                InternationalTransfersHubFragment.Companion companion2 = InternationalTransfersHubFragment.INSTANCE;
                Observable<User> user = TransfersHubShimFragment.this.getUserStore().getUser();
                c300811.L$0 = transfersHubShimFragment;
                c300811.L$1 = companion2;
                c300811.I$0 = i;
                c300811.label = 2;
                Object objAwaitFirst = RxAwait3.awaitFirst(user, this);
                if (objAwaitFirst != coroutine_suspended) {
                    i2 = i;
                    companion = companion2;
                    obj = objAwaitFirst;
                    transfersHubShimFragment2 = transfersHubShimFragment;
                    fragmentNewInstance = companion.newInstance((Parcelable) new InternationalTransfersHubFragment.Args(((User) obj).getOrigin().getLocality()));
                    i = i2;
                    transfersHubShimFragment = transfersHubShimFragment2;
                    transfersHubShimFragment.setFragment(i, fragmentNewInstance);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            fragmentNewInstance = TransfersHubFragment.INSTANCE.newInstance();
            transfersHubShimFragment.setFragment(i, fragmentNewInstance);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: TransfersHubShimFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/TransfersHubShimFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/TransfersHubShimFragment;", "Lcom/robinhood/shared/transfers/contracts/TransfersHub;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<TransfersHubShimFragment, TransfersHub> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(TransfersHub transfersHub) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, transfersHub);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public TransfersHub getArgs(TransfersHubShimFragment transfersHubShimFragment) {
            return (TransfersHub) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, transfersHubShimFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransfersHubShimFragment newInstance(TransfersHub transfersHub) {
            return (TransfersHubShimFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, transfersHub);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransfersHubShimFragment transfersHubShimFragment, TransfersHub transfersHub) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, transfersHubShimFragment, transfersHub);
        }
    }
}
