package com.robinhood.microgram.sdui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import microgram.android.MicrogramLaunchId;
import microgram.p507ui.p508v1.InitialScreenDataDto;
import timber.log.Timber;

/* compiled from: MicrogramParentFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0015\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0004\u0018\u0001`\u001a0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramAppUtilsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/robinhood/android/udf/HasSavedState;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "key", "Lcom/robinhood/shared/common/contracts/MicrogramRouterFragmentKey;", "isFragmentHostedInCompose", "", "wasRecreated", "getAndResetRecreationFlag", "instance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "getInstance", "()Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "initialScreenDataAsync", "Lkotlinx/coroutines/Deferred;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/InitialScreenData;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "Lcom/robinhood/microgram/sdui/AnyInitialScreenData;", "getInitialScreenDataAsync", "()Lkotlinx/coroutines/Deferred;", "Companion", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.MicrogramAppUtilsViewModel, reason: use source file name */
/* loaded from: classes13.dex */
public final class MicrogramParentFragment2 extends ViewModel implements HasSavedState {
    private static final String STATE_WAS_RECREATED = "microgram.wasRecreated";
    private final Deferred<UiObject<InitialScreenData, InitialScreenDataDto>> initialScreenDataAsync;
    private final MicrogramManager2 instance;
    private final boolean isFragmentHostedInCompose;
    private final MicrogramRouterFragmentKey key;
    private final SavedStateHandle savedStateHandle;
    private boolean wasRecreated;
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public MicrogramParentFragment2(MicrogramManager microgramManager, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        Object obj = getSavedStateHandle().get("rh_navigation_args");
        Intrinsics.checkNotNull(obj);
        MicrogramRouterFragmentKey microgramRouterFragmentKey = (MicrogramRouterFragmentKey) obj;
        this.key = microgramRouterFragmentKey;
        Object obj2 = getSavedStateHandle().get("rh_fragment_is_hosted_in_compose");
        Boolean bool = Boolean.TRUE;
        boolean zAreEqual = Intrinsics.areEqual(obj2, bool);
        this.isFragmentHostedInCompose = zAreEqual;
        this.wasRecreated = Intrinsics.areEqual(getSavedStateHandle().get(STATE_WAS_RECREATED), bool);
        Timber.INSTANCE.mo3356i("Source: %s", microgramRouterFragmentKey.getSource());
        getSavedStateHandle().set(STATE_WAS_RECREATED, bool);
        MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, ViewModel2.getViewModelScope(this), new MicrogramLaunchId(microgramRouterFragmentKey.getSource(), microgramRouterFragmentKey.getDiscriminator()), null, 4, null);
        this.instance = microgramManager2M16549getInstancemoChb0s$default;
        if (zAreEqual) {
            microgramManager2M16549getInstancemoChb0s$default.getComponent().getHostCompatibilityFlags().setNeverTearDownAndroidUi(true);
        }
        this.initialScreenDataAsync = BuildersKt__Builders_commonKt.async$default(ViewModel2.getViewModelScope(this), null, null, new MicrogramParentFragment3(this, null), 3, null);
    }

    public final boolean getAndResetRecreationFlag() {
        boolean z = this.wasRecreated;
        this.wasRecreated = false;
        return z;
    }

    public final MicrogramManager2 getInstance() {
        return this.instance;
    }

    public final Deferred<UiObject<InitialScreenData, InitialScreenDataDto>> getInitialScreenDataAsync() {
        return this.initialScreenDataAsync;
    }
}
