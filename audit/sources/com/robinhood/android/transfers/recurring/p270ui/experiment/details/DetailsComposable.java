package com.robinhood.android.transfers.recurring.p270ui.experiment.details;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.p270ui.LoadableString;
import com.robinhood.android.transfers.recurring.p270ui.experiment.RecurringDepositHubDestinations;
import com.robinhood.android.transfers.recurring.p270ui.experiment.details.DetailsComposable;
import com.robinhood.android.transfers.recurring.p270ui.experiment.details.DetailsEvent;
import com.robinhood.android.transfers.recurring.p270ui.experiment.details.DetailsViewState;
import com.robinhood.android.transfers.recurring.p270ui.experiment.infobanner.SduiInfoBannerWithDeepLinkHandling;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.userleap.survey.Survey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DetailsComposable.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u000f\u001a;\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0016\u001a%\u0010\u0017\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0018\u001a3\u0010\u0019\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001a\u001a%\u0010\u001b\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0018\u001a3\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010!¨\u0006\"²\u0006\u0012\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002"}, m3636d2 = {"DetailsComposable", "", "args", "Lcom/robinhood/android/transfers/recurring/ui/experiment/Details$Args;", "showSurvey", "Lkotlin/Function1;", "Lcom/robinhood/userleap/survey/Survey;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDuxo;", "(Lcom/robinhood/android/transfers/recurring/ui/experiment/Details$Args;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadableBentoDataRow", "loadableString", "Lcom/robinhood/android/transfers/recurring/ui/LoadableString;", "(Lcom/robinhood/android/transfers/recurring/ui/LoadableString;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CancelDialog", "id", "", "onPrimaryButtonClick", "Lkotlin/Function0;", "onDismissRequest", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CancelConfirmationDialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PauseDialog", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ResumeConfirmationDialog", "Button", "button", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button;", "onClick", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button$Action;", "(Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState$Button;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-recurring-deposits_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsEvent;", "viewState", "Lcom/robinhood/android/transfers/recurring/ui/experiment/details/DetailsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class DetailsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$18(DetailsViewState.Button button, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Button(button, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CancelConfirmationDialog$lambda$6(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CancelConfirmationDialog(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CancelDialog$lambda$5(String str, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CancelDialog(str, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailsComposable$lambda$0(RecurringDepositHubDestinations.Args args, Function1 function1, Modifier modifier, DetailsDuxo detailsDuxo, int i, int i2, Composer composer, int i3) {
        DetailsComposable(args, function1, modifier, detailsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadableBentoDataRow$lambda$2(LoadableString loadableString, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadableBentoDataRow(loadableString, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PauseDialog$lambda$11(Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PauseDialog(function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResumeConfirmationDialog$lambda$14(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ResumeConfirmationDialog(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DetailsComposable(final RecurringDepositHubDestinations.Args args, final Function1<? super Survey, Unit> showSurvey, Modifier modifier, DetailsDuxo detailsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DetailsDuxo detailsDuxo2;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(showSurvey, "showSurvey");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1473850569);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showSurvey) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    detailsDuxo2 = detailsDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(detailsDuxo2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    detailsDuxo2 = detailsDuxo;
                }
                i3 |= i5;
            } else {
                detailsDuxo2 = detailsDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DetailsDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 &= -7169;
                        detailsDuxo2 = (DetailsDuxo) baseDuxo;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473850569, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposable (DetailsComposable.kt:55)");
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RECURRING_DEPOSIT_DETAIL, null, args.getId(), null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-183625556, true, new C304751(detailsDuxo2, args, modifier3, showSurvey), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            final DetailsDuxo detailsDuxo3 = detailsDuxo2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DetailsComposable.DetailsComposable$lambda$0(args, showSurvey, modifier4, detailsDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 8) != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RECURRING_DEPOSIT_DETAIL, null, args.getId(), null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-183625556, true, new C304751(detailsDuxo2, args, modifier3, showSurvey), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        final DetailsDuxo detailsDuxo32 = detailsDuxo2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: DetailsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1 */
    static final class C304751 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ RecurringDepositHubDestinations.Args $args;
        final /* synthetic */ DetailsDuxo $duxo;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Survey, Unit> $showSurvey;

        /* JADX WARN: Multi-variable type inference failed */
        C304751(DetailsDuxo detailsDuxo, RecurringDepositHubDestinations.Args args, Modifier modifier, Function1<? super Survey, Unit> function1) {
            this.$duxo = detailsDuxo;
            this.$args = args;
            this.$modifier = modifier;
            this.$showSurvey = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final Event<DetailsEvent> invoke$lambda$0(SnapshotState4<Event<DetailsEvent>> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DetailsViewState invoke$lambda$2(SnapshotState4<DetailsViewState> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* compiled from: DetailsComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$8, reason: invalid class name */
        static final class AnonymousClass8 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
            final /* synthetic */ DetailsDuxo $duxo;
            final /* synthetic */ UserInteractionEventDescriptor $eventData;
            final /* synthetic */ EventLogger $eventLogger;
            final /* synthetic */ SnapshotState4<DetailsViewState> $viewState$delegate;

            /* compiled from: DetailsComposable.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$8$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DetailsViewState.Button.Action.values().length];
                    try {
                        iArr[DetailsViewState.Button.Action.CANCEL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DetailsViewState.Button.Action.PAUSE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DetailsViewState.Button.Action.RESUME.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            AnonymousClass8(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, DetailsDuxo detailsDuxo, SnapshotState4<DetailsViewState> snapshotState4) {
                this.$eventLogger = eventLogger;
                this.$eventData = userInteractionEventDescriptor;
                this.$duxo = detailsDuxo;
                this.$viewState$delegate = snapshotState4;
            }

            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                Composer composer2 = composer;
                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                if ((i & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-700393961, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposable.<anonymous>.<anonymous> (DetailsComposable.kt:104)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                final EventLogger eventLogger = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventData;
                final DetailsDuxo detailsDuxo = this.$duxo;
                SnapshotState4<DetailsViewState> snapshotState4 = this.$viewState$delegate;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                final Column6 column6 = Column6.INSTANCE;
                final LoadableString footer = C304751.invoke$lambda$2(snapshotState4).getFooter();
                composer2.startReplaceGroup(-2074639873);
                if (footer != null) {
                    LocalShowPlaceholder.Loadable(footer.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(-388588449, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$8$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i2) {
                            if ((i2 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-388588449, i2, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailsComposable.kt:115)");
                            }
                            String text = footer.getText();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i3).m21426getFg20d7_KjU();
                            BentoText2.m20747BentoText38GnDrw(text, column6.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i3).getTextM(), composer3, 0, 0, 8184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer, 3072, 6);
                    composer2 = composer;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer2.changedInstance(eventLogger) | composer2.changedInstance(userInteractionEventDescriptor) | composer2.changedInstance(detailsDuxo);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$8$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DetailsComposable.C304751.AnonymousClass8.invoke$lambda$3$lambda$2$lambda$1(eventLogger, userInteractionEventDescriptor, detailsDuxo, (DetailsViewState.Button.Action) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer2.endReplaceGroup();
                DetailsComposable.Button(C304751.invoke$lambda$2(snapshotState4).getPrimaryButton(), function1, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer2, 384, 0);
                DetailsComposable.Button(C304751.invoke$lambda$2(snapshotState4).getSecondaryButton(), function1, SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, C2002Dp.m7995constructorimpl(10), 0.0f, 0.0f, 13, null), 0.0f, 1, null), composer, 384, 0);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                invoke(bentoButtonBar3, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2$lambda$1(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, DetailsDuxo detailsDuxo, DetailsViewState.Button.Action action) {
                String str;
                Intrinsics.checkNotNullParameter(action, "action");
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int i = iArr[action.ordinal()];
                if (i == 1) {
                    str = "cancel";
                } else if (i == 2) {
                    str = "pause";
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "unpause";
                }
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, str, null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                int i2 = iArr[action.ordinal()];
                if (i2 == 1) {
                    detailsDuxo.showCancelDialog();
                } else if (i2 == 2) {
                    detailsDuxo.showPauseDialog();
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    detailsDuxo.resume();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(DetailsDuxo detailsDuxo, RecurringDepositHubDestinations.Args args) {
            detailsDuxo.pause(args.getId());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            EventConsumer<DetailsEvent> eventConsumerInvoke;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-183625556, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposable.<anonymous> (DetailsComposable.kt:64)");
            }
            final StateFlow<Event<DetailsEvent>> eventFlow = this.$duxo.getEventFlow();
            composer.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$invoke$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$invoke$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$invoke$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "DetailsComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$invoke$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof DetailsEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<DetailsEvent> value = eventFlow.getValue();
            Event<DetailsEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof DetailsEvent)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer, 0, 0);
            Composer composer2 = composer;
            composer2.endReplaceGroup();
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
            final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer2.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
            final Event<DetailsEvent> eventInvoke$lambda$0 = invoke$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventInvoke$lambda$0 != null) {
                final Function1<Survey, Unit> function1 = this.$showSurvey;
                if ((eventInvoke$lambda$0.getData() instanceof DetailsEvent.CancelConfirmationDismissed) && (eventConsumerInvoke = eventInvoke$lambda$0.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventInvoke$lambda$0, new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$invoke$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19702invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19702invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LifecycleAwareNavigator.popBackStack$default(lifecycleAwareNavigator, false, 1, null);
                            function1.invoke(Survey.START_EXTRA_CASH_CANCELLATION_SURVEY);
                        }
                    });
                }
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(this.$duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
            composer2.startReplaceGroup(-370483243);
            if (invoke$lambda$2(snapshotState4CollectAsStateWithLifecycle2).isCancelDialogVisible()) {
                String id = this.$args.getId();
                DetailsDuxo detailsDuxo = this.$duxo;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance = composer2.changedInstance(detailsDuxo);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new DetailsComposable2(detailsDuxo);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                DetailsDuxo detailsDuxo2 = this.$duxo;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer2.changedInstance(detailsDuxo2);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new DetailsComposable3(detailsDuxo2);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                DetailsComposable.CancelDialog(id, function0, (Function0) ((KFunction) objRememberedValue2), null, composer2, 0, 8);
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-370475514);
            if (invoke$lambda$2(snapshotState4CollectAsStateWithLifecycle2).isCancelConfirmationDialogVisible()) {
                DetailsDuxo detailsDuxo3 = this.$duxo;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer2.changedInstance(detailsDuxo3);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new DetailsComposable4(detailsDuxo3);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                DetailsComposable.CancelConfirmationDialog((Function0) ((KFunction) objRememberedValue3), null, composer2, 0, 2);
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-370469217);
            if (invoke$lambda$2(snapshotState4CollectAsStateWithLifecycle2).isPauseDialogVisible()) {
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance4 = composer2.changedInstance(this.$duxo) | composer2.changed(this.$args);
                final DetailsDuxo detailsDuxo4 = this.$duxo;
                final RecurringDepositHubDestinations.Args args = this.$args;
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailsComposable.C304751.invoke$lambda$7$lambda$6(detailsDuxo4, args);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                Function0 function02 = (Function0) objRememberedValue4;
                composer2.endReplaceGroup();
                DetailsDuxo detailsDuxo5 = this.$duxo;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance5 = composer2.changedInstance(detailsDuxo5);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new DetailsComposable5(detailsDuxo5);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                DetailsComposable.PauseDialog(function02, (Function0) ((KFunction) objRememberedValue5), null, composer2, 0, 4);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-370462170);
            if (invoke$lambda$2(snapshotState4CollectAsStateWithLifecycle2).isResumeConfirmationDialogVisible()) {
                DetailsDuxo detailsDuxo6 = this.$duxo;
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance6 = composer2.changedInstance(detailsDuxo6);
                Object objRememberedValue6 = composer2.rememberedValue();
                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new DetailsComposable6(detailsDuxo6);
                    composer2.updateRememberedValue(objRememberedValue6);
                }
                composer2.endReplaceGroup();
                DetailsComposable.ResumeConfirmationDialog((Function0) ((KFunction) objRememberedValue6), null, composer2, 0, 2);
            }
            composer2.endReplaceGroup();
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null), false, ComposableLambda3.rememberComposableLambda(-700393961, true, new AnonymousClass8(current, userInteractionEventDescriptor, this.$duxo, snapshotState4CollectAsStateWithLifecycle2), composer2, 54), ComposableLambda3.rememberComposableLambda(1163853508, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt.DetailsComposable.1.9
                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i2) {
                    SnapshotState4<DetailsViewState> snapshotState4;
                    Modifier.Companion companion;
                    int i3;
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i2 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1163853508, i2, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposable.<anonymous>.<anonymous> (DetailsComposable.kt:173)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    SnapshotState4<DetailsViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle2;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    InfoBanner<GenericAction> infoBanner = C304751.invoke$lambda$2(snapshotState42).getInfoBanner();
                    composer3.startReplaceGroup(1144457786);
                    if (infoBanner != null) {
                        Component component = new Component(Component.ComponentType.INFO_BANNER, "reconnect_alert", null, 4, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        companion = companion2;
                        snapshotState4 = snapshotState42;
                        i3 = 0;
                        SduiInfoBannerWithDeepLinkHandling.SduiInfoBannerWithDeepLinkHandling(component, infoBanner, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer3, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i4).m21592getMediumD9Ej5fM(), 2, null), composer3, 0, 0);
                    } else {
                        snapshotState4 = snapshotState42;
                        companion = companion2;
                        i3 = 0;
                    }
                    composer3.endReplaceGroup();
                    String strStringResource = StringResources_androidKt.stringResource(C30439R.string.extra_cash_deposit, composer3, i3);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier.Companion companion4 = companion;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme2.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i5).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                    composer3.startReplaceGroup(1144495105);
                    final LoadableString subtitle = C304751.invoke$lambda$2(snapshotState4).getSubtitle();
                    LocalShowPlaceholder.Loadable(subtitle.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(1839353035, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$9$1$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1839353035, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailsComposable.kt:209)");
                            }
                            String text = subtitle.getText();
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            long jM21426getFg20d7_KjU = bentoTheme3.getColors(composer4, i7).m21426getFg20d7_KjU();
                            BentoText2.m20747BentoText38GnDrw(text, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme3.getSpacing(composer4, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme3.getSpacing(composer4, i7).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer4, i7).getTextM(), composer4, 0, 0, 8184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 3072, 6);
                    composer3.endReplaceGroup();
                    DetailsComposable.LoadableBentoDataRow(C304751.invoke$lambda$2(snapshotState4).getBankAccountName(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composer3, i5).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), composer3, 0, 0);
                    DetailsComposable.LoadableBentoDataRow(C304751.invoke$lambda$2(snapshotState4).getMaximumBalance(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), composer3, 0, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                    invoke(boxScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadableBentoDataRow(final LoadableString loadableString, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(691932549);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(loadableString) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(691932549, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.LoadableBentoDataRow (DetailsComposable.kt:251)");
            }
            LocalShowPlaceholder.Loadable(loadableString.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(-1453338712, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$LoadableBentoDataRow$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1453338712, i5, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.LoadableBentoDataRow.<anonymous>.<anonymous> (DetailsComposable.kt:256)");
                    }
                    int i6 = C9631R.string.bank_account;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(i6, bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU(), 0L, composer2, 0, 4), null, null, null, AnnotatedStringResource.m22061annotatedStringResourceRIQooxk(loadableString.getText(), bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU(), 0L, composer2, 0, 4), null, null, null, null, false, false, 4061, null), modifier, null, composer2, BentoDataRowState.$stable, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DetailsComposable.LoadableBentoDataRow$lambda$2(loadableString, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CancelDialog(final String str, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function03;
        int i4;
        Modifier modifier2;
        int i5;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        final EventLogger current;
        String strStringResource;
        boolean zChangedInstance;
        Object obj;
        String str2;
        Function0<Unit> function04;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-245807515);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function03 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i5 = i3;
                if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-245807515, i5, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.CancelDialog (DetailsComposable.kt:279)");
                    }
                    userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    String strStringResource2 = StringResources_androidKt.stringResource(C30439R.string.cancel_extra_cash_dialog_title, composerStartRestartGroup, 0);
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C30439R.string.cancel_extra_cash_dialog_body_text, composerStartRestartGroup, 0));
                    strStringResource = StringResources_androidKt.stringResource(C30439R.string.cancel_extra_cash_cancel_button_text, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i5 & 14) != 4) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i5 & 896) != 256) | ((i5 & 112) == 32);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        str2 = strStringResource;
                        obj = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DetailsComposable.CancelDialog$lambda$4$lambda$3(current, userInteractionEventDescriptor, str, function02, function03);
                            }
                        };
                        function04 = function02;
                        composerStartRestartGroup.updateRememberedValue(obj);
                    } else {
                        function04 = function02;
                        obj = objRememberedValue;
                        str2 = strStringResource;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(str2, (Function0) obj);
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C30439R.string.never_mind, composerStartRestartGroup, 0), function04);
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.CANCEL_CONFIRMATION_ALERT, str, null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    int i6 = BentoAlertDialog2.Body.Text.$stable << 3;
                    int i7 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog(strStringResource2, text, bentoAlertButton, modifierAutoLogEvents$default, bentoAlertButton2, null, false, null, function02, composerStartRestartGroup, i6 | (i7 << 6) | (i7 << 12) | ((i5 << 18) & 234881024), 224);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return DetailsComposable.CancelDialog$lambda$5(str, function0, function02, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            i5 = i3;
            if ((i5 & 1171) != 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                String strStringResource22 = StringResources_androidKt.stringResource(C30439R.string.cancel_extra_cash_dialog_title, composerStartRestartGroup, 0);
                BentoAlertDialog2.Body.Text text2 = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C30439R.string.cancel_extra_cash_dialog_body_text, composerStartRestartGroup, 0));
                strStringResource = StringResources_androidKt.stringResource(C30439R.string.cancel_extra_cash_cancel_button_text, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i5 & 14) != 4) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i5 & 896) != 256) | ((i5 & 112) == 32);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    str2 = strStringResource;
                    obj = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailsComposable.CancelDialog$lambda$4$lambda$3(current, userInteractionEventDescriptor, str, function02, function03);
                        }
                    };
                    function04 = function02;
                    composerStartRestartGroup.updateRememberedValue(obj);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton3 = new BentoAlertButton(str2, (Function0) obj);
                    BentoAlertButton bentoAlertButton22 = new BentoAlertButton(StringResources_androidKt.stringResource(C30439R.string.never_mind, composerStartRestartGroup, 0), function04);
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.CANCEL_CONFIRMATION_ALERT, str, null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    int i62 = BentoAlertDialog2.Body.Text.$stable << 3;
                    int i72 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog(strStringResource22, text2, bentoAlertButton3, modifierAutoLogEvents$default2, bentoAlertButton22, null, false, null, function02, composerStartRestartGroup, i62 | (i72 << 6) | (i72 << 12) | ((i5 << 18) & 234881024), 224);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function03 = function0;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((i5 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CancelDialog$lambda$4$lambda$3(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, String str, Function0 function0, Function0 function02) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.CANCEL_CONFIRMATION_ALERT, str, null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CancelConfirmationDialog(final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-193679623);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            modifier2 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-193679623, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.CancelConfirmationDialog (DetailsComposable.kt:330)");
            }
            int i5 = i3;
            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C30439R.string.cancel_confirmation_extra_cash_dialog_title, composerStartRestartGroup, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C30439R.string.cancel_confirmation_extra_cash_dialog_body_text, composerStartRestartGroup, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_okay, composerStartRestartGroup, 0), function0), modifier2, null, null, false, null, function0, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i5 << 6) & 7168) | ((i5 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DetailsComposable.CancelConfirmationDialog$lambda$6(function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PauseDialog(final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        final EventLogger current;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1657196528);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1657196528, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.PauseDialog (DetailsComposable.kt:350)");
                }
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                String strStringResource = StringResources_androidKt.stringResource(C30439R.string.pause_extra_cash_dialog_title, composerStartRestartGroup, 0);
                int i5 = i3;
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C30439R.string.pause_extra_cash_dialog_body_text, composerStartRestartGroup, 0));
                String strStringResource2 = StringResources_androidKt.stringResource(C30439R.string.pause_extra_cash_cancel_button_text, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                int i6 = i5 & 112;
                zChangedInstance = ((i5 & 14) != 4) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | (i6 != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailsComposable.PauseDialog$lambda$8$lambda$7(current, userInteractionEventDescriptor, function02, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue);
                String strStringResource3 = StringResources_androidKt.stringResource(C30439R.string.never_mind, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = (i6 == 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailsComposable.PauseDialog$lambda$10$lambda$9(current, userInteractionEventDescriptor, function02);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue2);
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.ALERT, "pause_confirmation_alert", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Modifier modifier5 = modifier4;
                int i7 = BentoAlertDialog2.Body.Text.$stable << 3;
                int i8 = BentoAlertButton.$stable;
                BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, modifierAutoLogEvents$default, bentoAlertButton2, null, false, null, function02, composerStartRestartGroup, i7 | (i8 << 6) | (i8 << 12) | ((i5 << 21) & 234881024), 224);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DetailsComposable.PauseDialog$lambda$11(function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            String strStringResource4 = StringResources_androidKt.stringResource(C30439R.string.pause_extra_cash_dialog_title, composerStartRestartGroup, 0);
            int i52 = i3;
            BentoAlertDialog2.Body.Text text2 = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C30439R.string.pause_extra_cash_dialog_body_text, composerStartRestartGroup, 0));
            String strStringResource22 = StringResources_androidKt.stringResource(C30439R.string.pause_extra_cash_cancel_button_text, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i62 = i52 & 112;
            zChangedInstance = ((i52 & 14) != 4) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | (i62 != 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DetailsComposable.PauseDialog$lambda$8$lambda$7(current, userInteractionEventDescriptor, function02, function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton3 = new BentoAlertButton(strStringResource22, (Function0) objRememberedValue);
                String strStringResource32 = StringResources_androidKt.stringResource(C30439R.string.never_mind, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = (i62 == 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailsComposable.PauseDialog$lambda$10$lambda$9(current, userInteractionEventDescriptor, function02);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton22 = new BentoAlertButton(strStringResource32, (Function0) objRememberedValue2);
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.ALERT, "pause_confirmation_alert", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    Modifier modifier52 = modifier4;
                    int i72 = BentoAlertDialog2.Body.Text.$stable << 3;
                    int i82 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog(strStringResource4, text2, bentoAlertButton3, modifierAutoLogEvents$default2, bentoAlertButton22, null, false, null, function02, composerStartRestartGroup, i72 | (i82 << 6) | (i82 << 12) | ((i52 << 21) & 234881024), 224);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PauseDialog$lambda$8$lambda$7(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0, Function0 function02) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "pause_confirmation_continue", null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PauseDialog$lambda$10$lambda$9(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "pause_confirmation_dismiss", null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ResumeConfirmationDialog(final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        final EventLogger current;
        boolean zChangedInstance;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1654306220);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1654306220, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.ResumeConfirmationDialog (DetailsComposable.kt:415)");
                }
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                String strStringResource = StringResources_androidKt.stringResource(C30439R.string.resume_confirmation_extra_cash_dialog_title, composerStartRestartGroup, 0);
                int i5 = i3;
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C30439R.string.resume_confirmation_extra_cash_dialog_body_text, composerStartRestartGroup, 0));
                String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_okay, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i5 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailsComposable.ResumeConfirmationDialog$lambda$13$lambda$12(current, userInteractionEventDescriptor, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertDialog.BentoAlertDialog(strStringResource, text, new BentoAlertButton(strStringResource2, (Function0) objRememberedValue), ModifiersKt.autoLogEvents$default(modifier3, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.ALERT, "unpause_confirmation_alert", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, null, false, null, function0, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i5 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DetailsComposable.ResumeConfirmationDialog$lambda$14(function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            String strStringResource3 = StringResources_androidKt.stringResource(C30439R.string.resume_confirmation_extra_cash_dialog_title, composerStartRestartGroup, 0);
            int i52 = i3;
            BentoAlertDialog2.Body.Text text2 = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C30439R.string.resume_confirmation_extra_cash_dialog_body_text, composerStartRestartGroup, 0));
            String strStringResource22 = StringResources_androidKt.stringResource(C11048R.string.general_label_okay, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i52 & 14) == 4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DetailsComposable.ResumeConfirmationDialog$lambda$13$lambda$12(current, userInteractionEventDescriptor, function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertDialog.BentoAlertDialog(strStringResource3, text2, new BentoAlertButton(strStringResource22, (Function0) objRememberedValue), ModifiersKt.autoLogEvents$default(modifier3, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.ALERT, "unpause_confirmation_alert", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, null, false, null, function0, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i52 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResumeConfirmationDialog$lambda$13$lambda$12(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "unpause_confirmation_continue", null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final DetailsViewState.Button button, final Function1<? super DetailsViewState.Button.Action, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1880944213);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(button) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1880944213, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.details.Button (DetailsComposable.kt:462)");
                }
                composerStartRestartGroup.startReplaceGroup(593848661);
                Color colorM6701boximpl = !button.getUseNegativeStyle() ? Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU()) : null;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                String text = button.getText();
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                boolean zIsEnabled = button.isEnabled();
                boolean zIsLoading = button.isLoading();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = ((i3 & 112) != 32) | composerStartRestartGroup.changed(button);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailsComposable.Button$lambda$17$lambda$16$lambda$15(function1, button);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, text, modifier5, null, type2, zIsEnabled, zIsLoading, null, colorM6701boximpl, colorM6701boximpl, null, false, null, composer2, (i3 & 896) | 24576, 0, 7304);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DetailsComposable.Button$lambda$18(button, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(593848661);
            Color colorM6701boximpl2 = !button.getUseNegativeStyle() ? Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU()) : null;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier52 = modifier4;
            String text2 = button.getText();
            BentoButtons.Type type22 = BentoButtons.Type.Secondary;
            boolean zIsEnabled2 = button.isEnabled();
            boolean zIsLoading2 = button.isLoading();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = ((i3 & 112) != 32) | composerStartRestartGroup.changed(button);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DetailsComposable.Button$lambda$17$lambda$16$lambda$15(function1, button);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, text2, modifier52, null, type22, zIsEnabled2, zIsLoading2, null, colorM6701boximpl2, colorM6701boximpl2, null, false, null, composer2, (i3 & 896) | 24576, 0, 7304);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$17$lambda$16$lambda$15(Function1 function1, DetailsViewState.Button button) {
        function1.invoke(button.getAction());
        return Unit.INSTANCE;
    }
}
