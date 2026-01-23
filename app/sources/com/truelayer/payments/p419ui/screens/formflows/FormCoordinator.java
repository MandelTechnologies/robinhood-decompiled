package com.truelayer.payments.p419ui.screens.formflows;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.intl.Locale;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.BackHandler;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.p419ui.components.BackButton;
import com.truelayer.payments.p419ui.components.LoadingDialog4;
import com.truelayer.payments.p419ui.components.animators.NavigationAnimator;
import com.truelayer.payments.p419ui.components.inputs.form.FormViewModel;
import com.truelayer.payments.p419ui.components.inputs.form.FormViewModel3;
import com.truelayer.payments.p419ui.components.toolbars.AccessibleTopAppBar2;
import com.truelayer.payments.p419ui.components.toolbars.SearchBarKt;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.models.QueryState;
import com.truelayer.payments.p419ui.screens.components.NetworkErrorView;
import com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen;
import com.truelayer.payments.p419ui.screens.formflows.components.FormView3;
import com.truelayer.payments.p419ui.screens.formflows.components.RadioView;
import com.truelayer.payments.p419ui.screens.formflows.components.SelectView;
import com.truelayer.payments.p419ui.screens.processor.ProcessorContext;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import com.truelayer.payments.p419ui.utils.ModifierExtensions;
import com.truelayer.payments.p419ui.utils.Navigation3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FormCoordinator.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\\\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2#\b\u0002\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u000f\u001ai\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u000b2\u001e\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001ai\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u000b2\u001e\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\f\u0010!\u001a\u0004\u0018\u00010\"X\u008a\u0084\u0002"}, m3636d2 = {"FlowTopBar", "", "title", "", "query", "Lcom/truelayer/payments/ui/models/QueryState;", "formFlowScreen", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen;", "onBack", "Lkotlin/Function0;", "onChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newQuery", "(Ljava/lang/String;Lcom/truelayer/payments/ui/models/QueryState;Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "FormCoordinator", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", "formViewData", "Lcom/truelayer/payments/ui/screens/formflows/FormViewData;", "onAbort", "onFailure", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "onSubmit", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/truelayer/payments/ui/models/PaymentContext;Lcom/truelayer/payments/ui/screens/formflows/FormViewData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/compose/runtime/Composer;II)V", "context", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;", "(Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;Lcom/truelayer/payments/ui/screens/formflows/FormViewData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release", "error", "Lcom/truelayer/payments/core/domain/errors/CoreError;"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FormCoordinator {
    public static final void FormCoordinator(final ProcessorContext context, final FormViewData formViewData, final Function0<Unit> onAbort, final Function1<? super ProcessorResult.Failure, Unit> onFailure, final Function1<? super Map<String, String>, Unit> onSubmit, CoroutineDispatcher coroutineDispatcher, Composer composer, final int i, final int i2) {
        CoroutineDispatcher io2;
        int i3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formViewData, "formViewData");
        Intrinsics.checkNotNullParameter(onAbort, "onAbort");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Intrinsics.checkNotNullParameter(onSubmit, "onSubmit");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2094694494);
        if ((i2 & 32) != 0) {
            i3 = i & (-458753);
            io2 = Dispatchers.getIO();
        } else {
            io2 = coroutineDispatcher;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2094694494, i3, -1, "com.truelayer.payments.ui.screens.formflows.FormCoordinator (FormCoordinator.kt:48)");
        }
        FormCoordinator(ProcessorContext.intoPaymentContext$payments_ui_release$default(context, false, null, 3, null), formViewData, onAbort, onFailure, onSubmit, io2, composerStartRestartGroup, (i3 & 896) | 262208 | (i3 & 7168) | (i3 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final CoroutineDispatcher coroutineDispatcher2 = io2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FormCoordinator.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    FormCoordinator.FormCoordinator(context, formViewData, onAbort, onFailure, onSubmit, coroutineDispatcher2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    public static final void FormCoordinator(final PaymentContext paymentContext, final FormViewData formViewData, final Function0<Unit> onAbort, final Function1<? super ProcessorResult.Failure, Unit> onFailure, final Function1<? super Map<String, String>, Unit> onSubmit, CoroutineDispatcher coroutineDispatcher, Composer composer, final int i, final int i2) {
        CoroutineDispatcher io2;
        int i3;
        CreationExtras defaultViewModelCreationExtras;
        ?? r3;
        Function2 function2;
        Composer composer2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(formViewData, "formViewData");
        Intrinsics.checkNotNullParameter(onAbort, "onAbort");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Intrinsics.checkNotNullParameter(onSubmit, "onSubmit");
        Composer composerStartRestartGroup = composer.startRestartGroup(1915306030);
        if ((i2 & 32) != 0) {
            io2 = Dispatchers.getIO();
            i3 = i & (-458753);
        } else {
            io2 = coroutineDispatcher;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1915306030, i3, -1, "com.truelayer.payments.ui.screens.formflows.FormCoordinator (FormCoordinator.kt:67)");
        }
        ViewModelProvider.Factory factoryFormCoordinatorViewModel$default = FormCoordinatorViewModel4.formCoordinatorViewModel$default(paymentContext, formViewData, null, io2, 4, null);
        final CoroutineDispatcher coroutineDispatcher2 = io2;
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) FormCoordinatorViewModel.class, current, (String) null, factoryFormCoordinatorViewModel$default, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        final FormCoordinatorViewModel formCoordinatorViewModel = (FormCoordinatorViewModel) viewModel;
        final Navigation3<FormFlowScreen> navigator = formCoordinatorViewModel.getNavigator();
        FormFlowScreen currentRoute = formCoordinatorViewModel.getCurrentRoute();
        final QueryState query = formCoordinatorViewModel.getQuery();
        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Locale current2 = Locale.INSTANCE.getCurrent();
        SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(formCoordinatorViewModel.getError(), null, composerStartRestartGroup, 8, 1);
        final Map<String, LocalisedText> translations = formCoordinatorViewModel.getTranslations();
        EffectsKt.LaunchedEffect(current2, new C430832(formCoordinatorViewModel, null), composerStartRestartGroup, 64);
        EffectsKt.LaunchedEffect(formViewData, translations, new C430843(formCoordinatorViewModel, context, formViewData, translations, null), composerStartRestartGroup, 584);
        final CoreError coreErrorFormCoordinator$lambda$0 = FormCoordinator$lambda$0(snapshotState4CollectAsState);
        composerStartRestartGroup.startReplaceableGroup(1815418009);
        if (coreErrorFormCoordinator$lambda$0 == null) {
            composer2 = composerStartRestartGroup;
            function2 = null;
            r3 = 1;
        } else {
            EffectsKt.LaunchedEffect(FormCoordinator$lambda$0(snapshotState4CollectAsState), new FormCoordinator2(coreErrorFormCoordinator$lambda$0, paymentContext, null), composerStartRestartGroup, 72);
            r3 = 1;
            function2 = null;
            NetworkErrorView.NetworkErrorView(coreErrorFormCoordinator$lambda$0, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$4$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    onFailure.invoke(NetworkErrorView.intoProcessorResult(coreErrorFormCoordinator$lambda$0));
                }
            }, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$4$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    formCoordinatorViewModel.notifyChange(context, formViewData.getInputs(), translations);
                }
            }, composerStartRestartGroup, 8, 0);
            composer2 = composerStartRestartGroup;
            Unit unit = Unit.INSTANCE;
        }
        composer2.endReplaceableGroup();
        if (navigator == null || currentRoute == null) {
            composer3 = composer2;
            composer3.startReplaceableGroup(1815418528);
            LoadingDialog4.LoadingDialog(function2, composer3, 0, r3);
            composer3.endReplaceableGroup();
        } else {
            composer2.startReplaceableGroup(1815418565);
            Composer composer4 = composer2;
            NavigationAnimator.NavigationAnimator(currentRoute, navigator.getDirection(), null, null, ComposableLambda3.composableLambda(composer2, -950382756, r3, new Function3<FormFlowScreen, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FormCoordinator.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(FormFlowScreen formFlowScreen, Composer composer5, Integer num) {
                    invoke(formFlowScreen, composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final FormFlowScreen screen, Composer composer5, int i4) {
                    int i5;
                    Intrinsics.checkNotNullParameter(screen, "screen");
                    if ((i4 & 14) == 0) {
                        i5 = i4 | (composer5.changed(screen) ? 4 : 2);
                    } else {
                        i5 = i4;
                    }
                    if ((i5 & 91) != 18 || !composer5.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-950382756, i5, -1, "com.truelayer.payments.ui.screens.formflows.FormCoordinator.<anonymous> (FormCoordinator.kt:114)");
                        }
                        boolean zIsStart = navigator.isStart();
                        final Navigation3<FormFlowScreen> navigation3 = navigator;
                        final Function0<Unit> function0 = onAbort;
                        BackHandler.BackHandler(zIsStart, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FormCoordinator.5.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (((FormFlowScreen) navigation3.previous()) == null) {
                                    function0.invoke();
                                    Unit unit2 = Unit.INSTANCE;
                                }
                            }
                        }, composer5, 0, 0);
                        Modifier modifierSystemBarSafeAreaAndImePadding = ModifierExtensions.systemBarSafeAreaAndImePadding(Modifier.INSTANCE);
                        final QueryState queryState = query;
                        final Navigation3<FormFlowScreen> navigation32 = navigator;
                        final Function0<Unit> function02 = onAbort;
                        final FormCoordinatorViewModel formCoordinatorViewModel2 = formCoordinatorViewModel;
                        ComposableLambda composableLambda = ComposableLambda3.composableLambda(composer5, -1771762152, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FormCoordinator.5.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i6) {
                                if ((i6 & 11) != 2 || !composer6.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1771762152, i6, -1, "com.truelayer.payments.ui.screens.formflows.FormCoordinator.<anonymous>.<anonymous> (FormCoordinator.kt:122)");
                                    }
                                    String title = screen.getTitle();
                                    QueryState queryState2 = queryState;
                                    FormFlowScreen formFlowScreen = screen;
                                    final Navigation3<FormFlowScreen> navigation33 = navigation32;
                                    final Function0<Unit> function03 = function02;
                                    Function0<Unit> function04 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FormCoordinator.5.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (((FormFlowScreen) navigation33.previous()) == null) {
                                                function03.invoke();
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                        }
                                    };
                                    final FormCoordinatorViewModel formCoordinatorViewModel3 = formCoordinatorViewModel2;
                                    FormCoordinator.FlowTopBar(title, queryState2, formFlowScreen, function04, new Function1<QueryState, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FormCoordinator.5.2.2
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(QueryState queryState3) {
                                            invoke2(queryState3);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(QueryState it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            formCoordinatorViewModel3.setQuery(it);
                                        }
                                    }, composer6, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer6.skipToGroupEnd();
                            }
                        });
                        final QueryState queryState2 = query;
                        final FormCoordinatorViewModel formCoordinatorViewModel3 = formCoordinatorViewModel;
                        final Function1<Map<String, String>, Unit> function1 = onSubmit;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarSafeAreaAndImePadding, composableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambda3.composableLambda(composer5, -1139081491, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FormCoordinator.5.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer6, Integer num) {
                                invoke(paddingValues, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues it, Composer composer6, int i6) {
                                int i7;
                                CreationExtras defaultViewModelCreationExtras2;
                                Composer composer7 = composer6;
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((i6 & 14) == 0) {
                                    i7 = i6 | (composer7.changed(it) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 91) != 18 || !composer7.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1139081491, i7, -1, "com.truelayer.payments.ui.screens.formflows.FormCoordinator.<anonymous>.<anonymous> (FormCoordinator.kt:131)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierPadding = PaddingKt.padding(companion, it);
                                    FormFlowScreen formFlowScreen = screen;
                                    QueryState queryState3 = queryState2;
                                    final FormCoordinatorViewModel formCoordinatorViewModel4 = formCoordinatorViewModel3;
                                    final Function1<Map<String, String>, Unit> function12 = function1;
                                    composer7.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                    composer7.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                                    if (composer7.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer7.startReusableNode();
                                    if (composer7.getInserting()) {
                                        composer7.createNode(constructor);
                                    } else {
                                        composer7.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer7);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer7)), composer7, 0);
                                    composer7.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    if (formFlowScreen instanceof FormFlowScreen.Empty) {
                                        composer7.startReplaceableGroup(-450073554);
                                        EffectsKt.LaunchedEffect(formFlowScreen, new FormCoordinator5(formCoordinatorViewModel4, function12, null), composer7, 64);
                                        LoadingDialog4.LoadingDialog(null, composer7, 0, 1);
                                        composer7.endReplaceableGroup();
                                    } else if (formFlowScreen instanceof FormFlowScreen.Select) {
                                        composer7.startReplaceableGroup(-450073295);
                                        SelectView.SelectView(formFlowScreen.getTitle(), queryState3, ((FormFlowScreen.Select) formFlowScreen).getInput(), formFlowScreen.getFooter(), new Function1<Map<String, ? extends String>, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$5$3$1$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
                                                invoke2((Map<String, String>) map);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Map<String, String> selected) {
                                                Intrinsics.checkNotNullParameter(selected, "selected");
                                                formCoordinatorViewModel4.next(selected, function12);
                                            }
                                        }, composer7, 512);
                                        composer7.endReplaceableGroup();
                                    } else if (formFlowScreen instanceof FormFlowScreen.Form) {
                                        composer7.startReplaceableGroup(-450072887);
                                        FormFlowScreen.Form form = (FormFlowScreen.Form) formFlowScreen;
                                        String strValueOf = String.valueOf(form.getInputs().toString().hashCode());
                                        ViewModelProvider.Factory factoryFormViewModel = FormViewModel3.formViewModel(form.getInputs());
                                        composer7.startReplaceableGroup(1729797275);
                                        ViewModelStoreOwner current3 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer7, 6);
                                        if (current3 == null) {
                                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        }
                                        if (current3 instanceof HasDefaultViewModelProviderFactory) {
                                            defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras();
                                        } else {
                                            defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
                                        }
                                        ViewModel viewModel2 = ViewModelKt.viewModel((Class<ViewModel>) FormViewModel.class, current3, strValueOf, factoryFormViewModel, defaultViewModelCreationExtras2, composer7, 36936, 0);
                                        composer6.endReplaceableGroup();
                                        FormView3.FormView(formFlowScreen.getTitle(), SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (FormViewModel) viewModel2, formFlowScreen.getHeader(), formFlowScreen.getFooter(), new Function1<Map<String, ? extends String>, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$5$3$1$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
                                                invoke2((Map<String, String>) map);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Map<String, String> values) {
                                                Intrinsics.checkNotNullParameter(values, "values");
                                                formCoordinatorViewModel4.next(values, function12);
                                            }
                                        }, composer6, 48, 0);
                                        composer7 = composer6;
                                        composer7.endReplaceableGroup();
                                    } else if (formFlowScreen instanceof FormFlowScreen.RadioSelect) {
                                        composer7.startReplaceableGroup(-450072037);
                                        FormFlowScreen.RadioSelect radioSelect = (FormFlowScreen.RadioSelect) formFlowScreen;
                                        RadioView.RadioView(formFlowScreen.getTitle(), radioSelect.getInput(), formCoordinatorViewModel4.getValue(radioSelect.getInput().getId()), new Function1<Map<String, ? extends String>, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$5$3$1$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
                                                invoke2((Map<String, String>) map);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Map<String, String> selected) {
                                                Intrinsics.checkNotNullParameter(selected, "selected");
                                                formCoordinatorViewModel4.next(selected, function12);
                                            }
                                        }, formFlowScreen.getHeader(), formFlowScreen.getFooter(), composer7, 64, 0);
                                        composer7 = composer7;
                                        composer7.endReplaceableGroup();
                                    } else {
                                        composer7.startReplaceableGroup(-450071659);
                                        composer7.endReplaceableGroup();
                                    }
                                    composer7.endReplaceableGroup();
                                    composer7.endNode();
                                    composer7.endReplaceableGroup();
                                    composer7.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer7.skipToGroupEnd();
                            }
                        }), composer5, 805306416, 508);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer5.skipToGroupEnd();
                }
            }), composer4, 24576, 12);
            composer3 = composer4;
            composer3.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FormCoordinator.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i4) {
                    FormCoordinator.FormCoordinator(paymentContext, formViewData, onAbort, onFailure, onSubmit, coroutineDispatcher2, composer5, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* compiled from: FormCoordinator.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$2", m3645f = "FormCoordinator.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$2 */
    static final class C430832 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FormCoordinatorViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C430832(FormCoordinatorViewModel formCoordinatorViewModel, Continuation<? super C430832> continuation) {
            super(2, continuation);
            this.$viewModel = formCoordinatorViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C430832(this.$viewModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430832) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$viewModel.notifyLocaleChange();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FormCoordinator.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$3", m3645f = "FormCoordinator.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt$FormCoordinator$3 */
    static final class C430843 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ FormViewData $formViewData;
        final /* synthetic */ Map<String, LocalisedText> $translations;
        final /* synthetic */ FormCoordinatorViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C430843(FormCoordinatorViewModel formCoordinatorViewModel, Context context, FormViewData formViewData, Map<String, LocalisedText> map, Continuation<? super C430843> continuation) {
            super(2, continuation);
            this.$viewModel = formCoordinatorViewModel;
            this.$context = context;
            this.$formViewData = formViewData;
            this.$translations = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C430843(this.$viewModel, this.$context, this.$formViewData, this.$translations, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430843) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$viewModel.notifyChange(this.$context, this.$formViewData.getInputs(), this.$translations);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowTopBar(final String str, final QueryState queryState, final FormFlowScreen formFlowScreen, Function0<Unit> function0, Function1<? super QueryState, Unit> function1, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        QueryState queryState2;
        int i4;
        Function0<Unit> function02;
        int i5;
        Function1<? super QueryState, Unit> function12;
        Function0<Unit> function03;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1318395558);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 14) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                queryState2 = queryState;
                i3 |= composerStartRestartGroup.changed(queryState2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(formFlowScreen) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 57344) == 0) {
                        function12 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    }
                    if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        final Function0<Unit> function05 = i4 == 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FlowTopBar.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        } : function02;
                        Function1<? super QueryState, Unit> function13 = i5 == 0 ? new Function1<QueryState, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FlowTopBar.2
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(QueryState it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(QueryState queryState3) {
                                invoke2(queryState3);
                                return Unit.INSTANCE;
                            }
                        } : function12;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1318395558, i3, -1, "com.truelayer.payments.ui.screens.formflows.FlowTopBar (FormCoordinator.kt:185)");
                        }
                        if (!(!(formFlowScreen instanceof FormFlowScreen.RadioSelect) ? true : formFlowScreen instanceof FormFlowScreen.Form)) {
                            composerStartRestartGroup.startReplaceableGroup(-494069286);
                            AccessibleTopAppBar2.AccessibleTopAppBar(null, str2, ComposableLambda3.composableLambda(composerStartRestartGroup, -2097566518, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FlowTopBar.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i6) {
                                    if ((i6 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2097566518, i6, -1, "com.truelayer.payments.ui.screens.formflows.FlowTopBar.<anonymous> (FormCoordinator.kt:191)");
                                    }
                                    BackButton.BackButton(null, null, function05, composer2, 0, 3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), null, composerStartRestartGroup, ((i3 << 3) & 112) | 384, 9);
                            composerStartRestartGroup.endReplaceableGroup();
                            function03 = function05;
                            function12 = function13;
                        } else if (formFlowScreen instanceof FormFlowScreen.Select) {
                            composerStartRestartGroup.startReplaceableGroup(-494069130);
                            int i6 = i3 << 6;
                            function03 = function05;
                            Function1<? super QueryState, Unit> function14 = function13;
                            SearchBarKt.SearchBar(null, ((FormFlowScreen.Select) formFlowScreen).getHint(), false, queryState2, function14, function03, null, composerStartRestartGroup, (i3 & 57344) | (i6 & 7168) | 6 | (i6 & 458752), 68);
                            function12 = function14;
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            function03 = function05;
                            function12 = function13;
                            if (formFlowScreen instanceof FormFlowScreen.Empty) {
                                composerStartRestartGroup.startReplaceableGroup(-494068920);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-494068911);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function04 = function03;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function04 = function02;
                    }
                    final Function1<? super QueryState, Unit> function15 = function12;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorKt.FlowTopBar.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                FormCoordinator.FlowTopBar(str, queryState, formFlowScreen, function04, function15, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function12 = function1;
                if ((46811 & i3) == 9362) {
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!(!(formFlowScreen instanceof FormFlowScreen.RadioSelect) ? true : formFlowScreen instanceof FormFlowScreen.Form)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function04 = function03;
                }
                final Function1<? super QueryState, Unit> function152 = function12;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function12 = function1;
            if ((46811 & i3) == 9362) {
            }
            final Function1<? super QueryState, Unit> function1522 = function12;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        queryState2 = queryState;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function12 = function1;
        if ((46811 & i3) == 9362) {
        }
        final Function1<? super QueryState, Unit> function15222 = function12;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final CoreError FormCoordinator$lambda$0(SnapshotState4<? extends CoreError> snapshotState4) {
        return snapshotState4.getValue();
    }
}
