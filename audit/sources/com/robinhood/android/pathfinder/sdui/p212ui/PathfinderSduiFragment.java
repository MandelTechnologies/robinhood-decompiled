package com.robinhood.android.pathfinder.sdui.p212ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.lib.pathfinder.PathfinderFragmentCallbacks;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.pathfinder.sdui.p212ui.PathfinderSduiFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.experimental.api.PathfinderAction;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.noties.markwon.Markwon;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PathfinderSduiFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\r\u0010\u001d\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006#²\u0006\n\u0010$\u001a\u00020!X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "callbacks", "Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "getCallbacks", "()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiDuxo;", "getDuxo", "()Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "bind", "state", "Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiViewState;", "Companion", "feature-pathfinder-sdui_externalRelease", "viewState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PathfinderSduiFragment extends GenericComposeFragment {
    public static final String ARGS_MOCK_USER_VIEW_STATE = "mockUserViewState";

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(PathfinderFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, PathfinderSduiDuxo.class);
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PathfinderSduiFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(PathfinderSduiFragment pathfinderSduiFragment, int i, Composer composer, int i2) {
        pathfinderSduiFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderFragmentCallbacks getCallbacks() {
        return (PathfinderFragmentCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderSduiDuxo getDuxo() {
        return (PathfinderSduiDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C254331(this));
    }

    /* compiled from: PathfinderSduiFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiFragment$onStart$1 */
    /* synthetic */ class C254331 extends FunctionReferenceImpl implements Function1<PathfinderSduiViewState, Unit> {
        C254331(Object obj) {
            super(1, obj, PathfinderSduiFragment.class, "bind", "bind(Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PathfinderSduiViewState pathfinderSduiViewState) {
            invoke2(pathfinderSduiViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PathfinderSduiViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PathfinderSduiFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), false);
        requireActivity().getWindow().setSoftInputMode(16);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1915665663);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1915665663, i2, -1, "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiFragment.ComposeContent (PathfinderSduiFragment.kt:52)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2000686644, true, new C254321(RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new PathfinderSduiViewState(null, false, null, 7, null), composerStartRestartGroup, 0)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PathfinderSduiFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PathfinderSduiFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiFragment$ComposeContent$1 */
    static final class C254321 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<PathfinderSduiViewState> $viewState$delegate;

        C254321(SnapshotState4<PathfinderSduiViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2000686644, i, -1, "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiFragment.ComposeContent.<anonymous> (PathfinderSduiFragment.kt:58)");
            }
            PathfinderSduiViewState pathfinderSduiViewStateComposeContent$lambda$0 = PathfinderSduiFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            FragmentManager childFragmentManager = PathfinderSduiFragment.this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            Markwon markwon = PathfinderSduiFragment.this.getMarkwon();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(PathfinderSduiFragment.this);
            final PathfinderSduiFragment pathfinderSduiFragment = PathfinderSduiFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderSduiFragment.C254321.invoke$lambda$1$lambda$0(pathfinderSduiFragment, (Uri) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(PathfinderSduiFragment.this);
            final PathfinderSduiFragment pathfinderSduiFragment2 = PathfinderSduiFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PathfinderSduiFragment.C254321.invoke$lambda$3$lambda$2(pathfinderSduiFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(PathfinderSduiFragment.this);
            final PathfinderSduiFragment pathfinderSduiFragment3 = PathfinderSduiFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderSduiFragment.C254321.invoke$lambda$5$lambda$4(pathfinderSduiFragment3, (PathfinderAction.UpdateBackend) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function12 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(PathfinderSduiFragment.this);
            final PathfinderSduiFragment pathfinderSduiFragment4 = PathfinderSduiFragment.this;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function2() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiFragment$ComposeContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PathfinderSduiFragment.C254321.invoke$lambda$7$lambda$6(pathfinderSduiFragment4, (PathfinderAction.SubmitForm) obj, (Map) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function2 function2 = (Function2) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(PathfinderSduiFragment.this);
            final PathfinderSduiFragment pathfinderSduiFragment5 = PathfinderSduiFragment.this;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiFragment$ComposeContent$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderSduiFragment.C254321.invoke$lambda$9$lambda$8(pathfinderSduiFragment5, (RhBottomSheetDialogFragmentHost.SheetListener) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            PathfinderSduiComposable.PathfinderSduiComposable(pathfinderSduiViewStateComposeContent$lambda$0, childFragmentManager, markwon, function1, function0, function12, function2, (Function1) objRememberedValue5, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(PathfinderSduiFragment pathfinderSduiFragment, Uri it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Navigator navigator = pathfinderSduiFragment.getNavigator();
            Context contextRequireContext = pathfinderSduiFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, it, null, null, false, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(PathfinderSduiFragment pathfinderSduiFragment) {
            pathfinderSduiFragment.getCallbacks().dismissFlow();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(PathfinderSduiFragment pathfinderSduiFragment, PathfinderAction.UpdateBackend it) {
            Intrinsics.checkNotNullParameter(it, "it");
            pathfinderSduiFragment.getDuxo().sendInput(it.getValue2().getValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(PathfinderSduiFragment pathfinderSduiFragment, PathfinderAction.SubmitForm action, Map formData) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(formData, "formData");
            pathfinderSduiFragment.getDuxo().submitFormInput(action.getValue2().getValue(), formData);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(PathfinderSduiFragment pathfinderSduiFragment, RhBottomSheetDialogFragmentHost.SheetListener it) {
            Intrinsics.checkNotNullParameter(it, "it");
            pathfinderSduiFragment.setSheetListener(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(PathfinderSduiViewState state) {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setTitle(state.getTitle());
        }
        ErrorHandlers.handleErrorEvent(getActivityErrorHandler(), state.getSendInputErrorEvent());
    }

    /* compiled from: PathfinderSduiFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui;", "<init>", "()V", "ARGS_MOCK_USER_VIEW_STATE", "", "feature-pathfinder-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PathfinderSduiFragment, LegacyFragmentKey.PathfinderSdui> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PathfinderSdui pathfinderSdui) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderSdui);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PathfinderSdui getArgs(PathfinderSduiFragment pathfinderSduiFragment) {
            return (LegacyFragmentKey.PathfinderSdui) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, pathfinderSduiFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PathfinderSduiFragment newInstance(LegacyFragmentKey.PathfinderSdui pathfinderSdui) {
            return (PathfinderSduiFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderSdui);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PathfinderSduiFragment pathfinderSduiFragment, LegacyFragmentKey.PathfinderSdui pathfinderSdui) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, pathfinderSduiFragment, pathfinderSdui);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathfinderSduiViewState ComposeContent$lambda$0(SnapshotState4<PathfinderSduiViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
