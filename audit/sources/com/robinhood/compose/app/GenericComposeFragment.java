package com.robinhood.compose.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.compose.app.C11918R;
import com.robinhood.android.compose.app.databinding.FragmentGenericComposeBinding;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Tabbed2;
import com.robinhood.android.plt.contract.PltManager2;
import com.robinhood.android.util.extensions.BannerVisibility;
import com.robinhood.compose.bento.component.BentoToast2;
import com.robinhood.compose.bento.component.BentoToast4;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.scarlet.LocalScarletManager;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import com.robinhood.utils.p409ui.edge2edge.LocalEdgeToEdgeHost;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: GenericComposeFragment.kt */
@Metadata(m3635d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0015\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\r\u0010!\u001a\u00020\u0018H'¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0018H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m3636d2 = {"Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "<init>", "()V", "popNearestParentBackStackOnBackPressed", "", "getPopNearestParentBackStackOnBackPressed", "()Z", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "getGenericComposeSingletons", "()Lcom/robinhood/compose/app/GenericComposeSingletons;", "setGenericComposeSingletons", "(Lcom/robinhood/compose/app/GenericComposeSingletons;)V", "binding", "Lcom/robinhood/android/compose/app/databinding/FragmentGenericComposeBinding;", "getBinding", "()Lcom/robinhood/android/compose/app/databinding/FragmentGenericComposeBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onBackPressedDispatcherOwner", "com/robinhood/compose/app/GenericComposeFragment$onBackPressedDispatcherOwner$1", "Lcom/robinhood/compose/app/GenericComposeFragment$onBackPressedDispatcherOwner$1;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "rootView", "Landroid/view/ViewGroup;", "getRootView", "()Landroid/view/ViewGroup;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressedFallback", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public abstract class GenericComposeFragment extends BaseRhBottomSheetDialogHostFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GenericComposeFragment.class, "binding", "getBinding()Lcom/robinhood/android/compose/app/databinding/FragmentGenericComposeBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public GenericComposeSingletons genericComposeSingletons;
    private final GenericComposeFragment3 onBackPressedDispatcherOwner;
    private final boolean popNearestParentBackStackOnBackPressed;

    public abstract void ComposeContent(Composer composer, int i);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.robinhood.compose.app.GenericComposeFragment$onBackPressedDispatcherOwner$1] */
    public GenericComposeFragment() {
        super(C11918R.layout.fragment_generic_compose);
        this.binding = ViewBinding5.viewBinding(this, GenericComposeFragment2.INSTANCE);
        this.onBackPressedDispatcherOwner = new OnBackPressedDispatcherOwner() { // from class: com.robinhood.compose.app.GenericComposeFragment$onBackPressedDispatcherOwner$1
            private final OnBackPressedDispatcher onBackPressedDispatcher;

            {
                this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: com.robinhood.compose.app.GenericComposeFragment$onBackPressedDispatcherOwner$1$onBackPressedDispatcher$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        genericComposeFragment.onBackPressedFallback();
                    }
                });
            }

            @Override // androidx.view.OnBackPressedDispatcherOwner
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            public Lifecycle getLifecycle() {
                Lifecycle lifecycle = this.this$0.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                return lifecycle;
            }
        };
    }

    public boolean getPopNearestParentBackStackOnBackPressed() {
        return this.popNearestParentBackStackOnBackPressed;
    }

    public final GenericComposeSingletons getGenericComposeSingletons() {
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons;
        if (genericComposeSingletons != null) {
            return genericComposeSingletons;
        }
        Intrinsics.throwUninitializedPropertyAccessException("genericComposeSingletons");
        return null;
    }

    public final void setGenericComposeSingletons(GenericComposeSingletons genericComposeSingletons) {
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "<set-?>");
        this.genericComposeSingletons = genericComposeSingletons;
    }

    private final FragmentGenericComposeBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentGenericComposeBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ScarletManager scarletManager;
        ScarletManager scarletManager2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            scarletManager = getScarletManager();
        }
        final ScarletManager scarletManager3 = scarletManager;
        final Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager3);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        final boolean zIsShownInTab = Tabbed2.isShownInTab(contextRequireContext);
        ComposeView composeView = (ComposeView) view;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        ScarletContextWrapper scarletContextWrapper2 = getScarletContextWrapper();
        if (scarletContextWrapper2 == null || (scarletManager2 = ScarletManager2.getScarletManager(scarletContextWrapper2)) == null) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            scarletManager2 = ScarletManager2.getScarletManager(contextRequireContext2);
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(LocalNavigator.getLocalNavigator().provides(getNavigator()));
        listCreateListBuilder.add(BentoToast4.getLocalBentoToastHost().provides(BentoToast2.INSTANCE.getBentoToastHost(this)));
        CompositionLocal6<EdgeToEdgeHost> localEdgeToEdgeHost = LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost();
        KeyEventDispatcher.Component activity = getActivity();
        listCreateListBuilder.add(localEdgeToEdgeHost.provides(activity instanceof EdgeToEdgeHost ? (EdgeToEdgeHost) activity : null));
        listCreateListBuilder.add(LocalScarletManager.getLocalScarletManager().provides(scarletManager2));
        listCreateListBuilder.add(PltManager2.getLocalPltManager().provides(getGenericComposeSingletons().getPltManager()));
        if (getPopNearestParentBackStackOnBackPressed()) {
            listCreateListBuilder.add(BackHandler5.INSTANCE.provides(this.onBackPressedDispatcherOwner));
        }
        final List listBuild = CollectionsKt.build(listCreateListBuilder);
        composeView.setContent(ComposableLambda3.composableLambdaInstance(1282362971, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.GenericComposeFragment$onViewCreated$1$1
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
                    ComposerKt.traceEventStart(1282362971, i, -1, "com.robinhood.compose.app.GenericComposeFragment.onViewCreated.<anonymous>.<anonymous> (GenericComposeFragment.kt:86)");
                }
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseActivity");
                Boolean bool = (Boolean) SnapshotStateKt.collectAsState(((BaseActivity) fragmentActivityRequireActivity).getBannerVisibleFlow(), Boolean.FALSE, null, composer, 48, 2).getValue();
                bool.booleanValue();
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.addSpread(listBuild.toArray(new ProvidedValue[0]));
                spreadBuilder.add(BannerVisibility.getLocalBannerVisible().provides(bool));
                ProvidedValue[] providedValueArr = (ProvidedValue[]) spreadBuilder.toArray(new ProvidedValue[spreadBuilder.size()]);
                final Observable<ThemesFromScarlet> observable = observableThemeChangesForCompose;
                final ScarletManager scarletManager4 = scarletManager3;
                final boolean z = zIsShownInTab;
                final GenericComposeFragment genericComposeFragment = this.this$0;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(644682523, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.GenericComposeFragment$onViewCreated$1$1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(644682523, i2, -1, "com.robinhood.compose.app.GenericComposeFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (GenericComposeFragment.kt:93)");
                        }
                        Observable<ThemesFromScarlet> observable2 = observable;
                        ThemesFromScarlet themesFromScarletThemesForCompose = ScarletComposeInterop.themesForCompose(scarletManager4);
                        final boolean z2 = z;
                        final GenericComposeFragment genericComposeFragment2 = genericComposeFragment;
                        BentoTheme2.BentoTheme(observable2, themesFromScarletThemesForCompose, ComposableLambda3.rememberComposableLambda(480776013, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.GenericComposeFragment.onViewCreated.1.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(480776013, i3, -1, "com.robinhood.compose.app.GenericComposeFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericComposeFragment.kt:97)");
                                }
                                final GenericComposeFragment genericComposeFragment3 = genericComposeFragment2;
                                GenericComposeFragment6.ConsumeBottomInsetIfShownUnderTabs(ComposableLambda3.rememberComposableLambda(-1069913678, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.GenericComposeFragment.onViewCreated.1.1.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i4) {
                                        if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1069913678, i4, -1, "com.robinhood.compose.app.GenericComposeFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericComposeFragment.kt:99)");
                                        }
                                        genericComposeFragment3.ComposeContent(composer4, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), z2, null, composer3, 6, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 384, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    public final ViewGroup getRootView() {
        ComposeView root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackPressedFallback() {
        if (popNearestParentBackStack()) {
            return;
        }
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }
}
