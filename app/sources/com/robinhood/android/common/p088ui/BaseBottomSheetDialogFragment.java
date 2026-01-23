package com.robinhood.android.common.p088ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCaller;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.scarlet.ScarletManager2;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BaseBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u00010B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020%H\u0002J\u0010\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020\u000bH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000f¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "layoutRes", "", "<init>", "(I)V", "()V", "getLayoutRes", "()I", "skipCollapsed", "", "getSkipCollapsed", "()Z", "setSkipCollapsed", "(Z)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onViewCreated", "", "view", "onDismiss", "activity", "Landroid/app/Activity;", "notifyFragmentOfDismiss", "value", "isDraggable", "setDraggable", "setNavigationBarStyle", "isLight", "OnDismissListener", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class BaseBottomSheetDialogFragment extends BaseDialogFragment implements UiCallbacks.ScreenViewAnalyticable {
    public static final int $stable = 8;
    private final int layoutRes;
    public Navigator navigator;
    private boolean skipCollapsed;

    /* compiled from: BaseBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment$OnDismissListener;", "", "onBottomSheetDismissed", "", "id", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface OnDismissListener {
        void onBottomSheetDismissed(int id);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getAndResetTransitionReason() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getAndResetTransitionReason(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getEntityId() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getEntityId(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getExcludeFromAnalyticsLogging(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromSourceLogging() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getExcludeFromSourceLogging(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public Integer getScreenDepth() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenDepth(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenDescription(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenMessageType() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenMessageType(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenSource(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenTag(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenType() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenType(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: isParentScreen */
    public boolean getIsParentScreen() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.isParentScreen(this);
    }

    public BaseBottomSheetDialogFragment(int i) {
        this.layoutRes = i;
    }

    public final int getLayoutRes() {
        return this.layoutRes;
    }

    public final boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public final void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public BaseBottomSheetDialogFragment() {
        this(0);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public String getScreenName() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i = this.layoutRes;
        if (i != 0) {
            return inflater.inflate(i, container, false);
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper == null) {
            scarletContextWrapper = requireContext();
        }
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(scarletContextWrapper, getThemeResId());
        bottomSheetDialog.getBehavior().setState(3);
        bottomSheetDialog.getBehavior().setSkipCollapsed(this.skipCollapsed);
        return bottomSheetDialog;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C118281(null));
    }

    /* compiled from: BaseBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.ui.BaseBottomSheetDialogFragment$onViewCreated$1", m3645f = "BaseBottomSheetDialogFragment.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.ui.BaseBottomSheetDialogFragment$onViewCreated$1 */
    static final class C118281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C118281(Continuation<? super C118281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseBottomSheetDialogFragment.this.new C118281(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C118281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BaseBottomSheetDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.ui.BaseBottomSheetDialogFragment$onViewCreated$1$1", m3645f = "BaseBottomSheetDialogFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.ui.BaseBottomSheetDialogFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ BaseBottomSheetDialogFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = baseBottomSheetDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.setNavigationBarStyle(this.Z$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Context contextRequireContext = BaseBottomSheetDialogFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Flow<Boolean> flowIsDayFlow = DayNightChanges.isDayFlow(ScarletManager2.getScarletManager(contextRequireContext));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BaseBottomSheetDialogFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowIsDayFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    protected void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        RhBottomSheetDialogFragment.OnClickListener baseActivity = Fragments2.getBaseActivity(this);
        notifyFragmentOfDismiss();
        if (baseActivity instanceof OnDismissListener) {
            ((OnDismissListener) baseActivity).onBottomSheetDismissed(getDialogId());
        }
    }

    private static final void notifyFragmentOfDismiss$addFragment(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, Fragment fragment, LinkedList<Fragment> linkedList) {
        if (Intrinsics.areEqual(fragment, baseBottomSheetDialogFragment)) {
            return;
        }
        linkedList.push(fragment);
        List<Fragment> fragments = fragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment2 : fragments) {
            Intrinsics.checkNotNull(fragment2);
            notifyFragmentOfDismiss$addFragment(baseBottomSheetDialogFragment, fragment2, linkedList);
        }
    }

    private final void notifyFragmentOfDismiss() {
        LinkedList<ActivityResultCaller> linkedList = new LinkedList();
        Fragment currentFragment = Fragments2.getBaseActivity(this).getCurrentFragment();
        if (currentFragment == null) {
            return;
        }
        notifyFragmentOfDismiss$addFragment(this, currentFragment, linkedList);
        for (ActivityResultCaller activityResultCaller : linkedList) {
            if (activityResultCaller instanceof OnDismissListener) {
                ((OnDismissListener) activityResultCaller).onBottomSheetDismissed(getDialogId());
                return;
            }
        }
    }

    public final boolean isDraggable() {
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        return ((BottomSheetDialog) dialog).getBehavior().isDraggable();
    }

    public final void setDraggable(boolean z) {
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        ((BottomSheetDialog) dialog).getBehavior().setDraggable(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNavigationBarStyle(boolean isLight) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
        insetsController.setAppearanceLightNavigationBars(isLight);
    }
}
