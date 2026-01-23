package com.robinhood.android.transfers.recurring.p270ui.experiment.hub;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.transfers.recurring.p270ui.experiment.RecurringDepositHubDestinations;
import com.robinhood.android.transfers.recurring.p270ui.experiment.hub.RecurringDepositHubComposable4;
import com.robinhood.android.transfers.recurring.p270ui.experiment.hub.RecurringDepositHubViewState;
import com.robinhood.android.transfers.recurring.p270ui.experiment.infobanner.SduiInfoBannerWithDeepLinkHandling;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.idl.RhDeeplinkSupportedUri;
import com.robinhood.models.api.cashier.DepositScheduleType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import deeplinks.money_movement.p453v1.UpdateBankAccountDeeplinkDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RecurringDepositHubComposable.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001aB\u0010\n\u001a\u00020\u0001*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0003H\u0000\u001aG\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u001a\u001aG\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, m3636d2 = {"RecurringDepositHubComposable", "", "onLegacyRecurringDepositRowClick", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDuxo;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDuxo;Landroidx/compose/runtime/Composer;II)V", "RecurringDepositSections", "Landroidx/compose/foundation/lazy/LazyListScope;", "sections", "", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState$Section;", "onRowClick", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState$Row;", "onRelinkClick", "RecurringDepositSetUpRow", "pogResource", "", "primaryText", "primaryTextLabelPillText", "secondaryText", "onClick", "Lkotlin/Function0;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RecurringDepositRow", "row", "(Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState$Row;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-recurring-deposits_externalDebug", "viewState", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringDepositHubComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringDepositHubComposable$lambda$1(Function1 function1, Modifier modifier, RecurringDepositHubDuxo recurringDepositHubDuxo, int i, int i2, Composer composer, int i3) {
        RecurringDepositHubComposable(function1, modifier, recurringDepositHubDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringDepositRow$lambda$15(RecurringDepositHubViewState.Row row, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecurringDepositRow(row, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringDepositSetUpRow$lambda$5(int i, String str, String str2, String str3, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        RecurringDepositSetUpRow(i, str, str2, str3, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringDepositHubComposable(final Function1<? super String, Unit> onLegacyRecurringDepositRowClick, Modifier modifier, RecurringDepositHubDuxo recurringDepositHubDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        RecurringDepositHubDuxo recurringDepositHubDuxo2;
        Modifier modifier3;
        RecurringDepositHubDuxo recurringDepositHubDuxo3;
        final Modifier modifier4;
        final RecurringDepositHubDuxo recurringDepositHubDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onLegacyRecurringDepositRowClick, "onLegacyRecurringDepositRowClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-340317767);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onLegacyRecurringDepositRowClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    recurringDepositHubDuxo2 = recurringDepositHubDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(recurringDepositHubDuxo2) ? 256 : 128;
                    i3 |= i5;
                } else {
                    recurringDepositHubDuxo2 = recurringDepositHubDuxo;
                }
                i3 |= i5;
            } else {
                recurringDepositHubDuxo2 = recurringDepositHubDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RecurringDepositHubDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositHubComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositHubComposable$$inlined$duxo$1.1
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
                        i3 &= -897;
                        recurringDepositHubDuxo3 = (RecurringDepositHubDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-340317767, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposable (RecurringDepositHubComposable.kt:59)");
                    }
                    Modifier modifier5 = modifier3;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RECURRING_TRANSFERS_HUB, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(754262820, true, new C305431(modifier5, FlowExtKt.collectAsStateWithLifecycle(recurringDepositHubDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7), (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator()), onLegacyRecurringDepositRowClick), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    recurringDepositHubDuxo4 = recurringDepositHubDuxo3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                recurringDepositHubDuxo3 = recurringDepositHubDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RECURRING_TRANSFERS_HUB, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(754262820, true, new C305431(modifier52, FlowExtKt.collectAsStateWithLifecycle(recurringDepositHubDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7), (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator()), onLegacyRecurringDepositRowClick), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
                recurringDepositHubDuxo4 = recurringDepositHubDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                recurringDepositHubDuxo4 = recurringDepositHubDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecurringDepositHubComposable4.RecurringDepositHubComposable$lambda$1(onLegacyRecurringDepositRowClick, modifier4, recurringDepositHubDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 4) == 0) {
                    recurringDepositHubDuxo3 = recurringDepositHubDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RECURRING_TRANSFERS_HUB, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(754262820, true, new C305431(modifier522, FlowExtKt.collectAsStateWithLifecycle(recurringDepositHubDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7), (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator()), onLegacyRecurringDepositRowClick), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier522;
                recurringDepositHubDuxo4 = recurringDepositHubDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: RecurringDepositHubComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositHubComposable$1 */
    static final class C305431 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ LifecycleAwareNavigator $composeNavigator;
        final /* synthetic */ Context $context;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function1<String, Unit> $onLegacyRecurringDepositRowClick;
        final /* synthetic */ SnapshotState4<RecurringDepositHubViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C305431(Modifier modifier, SnapshotState4<RecurringDepositHubViewState> snapshotState4, Navigator navigator, Context context, LifecycleAwareNavigator lifecycleAwareNavigator, Function1<? super String, Unit> function1) {
            this.$modifier = modifier;
            this.$viewState$delegate = snapshotState4;
            this.$navigator = navigator;
            this.$context = context;
            this.$composeNavigator = lifecycleAwareNavigator;
            this.$onLegacyRecurringDepositRowClick = function1;
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
                ComposerKt.traceEventStart(754262820, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposable.<anonymous> (RecurringDepositHubComposable.kt:73)");
            }
            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$composeNavigator) | composer.changed(this.$onLegacyRecurringDepositRowClick);
            final SnapshotState4<RecurringDepositHubViewState> snapshotState4 = this.$viewState$delegate;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final LifecycleAwareNavigator lifecycleAwareNavigator = this.$composeNavigator;
            final Function1<String, Unit> function1 = this.$onLegacyRecurringDepositRowClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositHubComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecurringDepositHubComposable4.C305431.invoke$lambda$4$lambda$3(snapshotState4, navigator, context, lifecycleAwareNavigator, function1, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierLogScreenTransitions$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(SnapshotState4 snapshotState4, final Navigator navigator, final Context context, final LifecycleAwareNavigator lifecycleAwareNavigator, final Function1 function1, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final InfoBanner<GenericAction> infoBanner = RecurringDepositHubComposable4.RecurringDepositHubComposable$lambda$0(snapshotState4).getInfoBanner();
            if (infoBanner != null) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(940170630, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositHubComposable$1$1$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(940170630, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringDepositHubComposable.kt:81)");
                        }
                        Component component = new Component(Component.ComponentType.INFO_BANNER, "reconnect_alert", null, 4, null);
                        InfoBanner<GenericAction> infoBanner2 = infoBanner;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        SduiInfoBannerWithDeepLinkHandling.SduiInfoBannerWithDeepLinkHandling(component, infoBanner2, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 2, null), composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            }
            RecurringDepositHubComposable recurringDepositHubComposable = RecurringDepositHubComposable.INSTANCE;
            LazyListScope.item$default(LazyColumn, null, null, recurringDepositHubComposable.getLambda$734090735$feature_recurring_deposits_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, recurringDepositHubComposable.getLambda$1357651352$feature_recurring_deposits_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(885653943, true, new RecurringDepositHubComposable6(navigator, context)), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(413656534, true, new RecurringDepositHubComposable7(lifecycleAwareNavigator, snapshotState4)), 3, null);
            RecurringDepositHubComposable4.RecurringDepositSections(LazyColumn, RecurringDepositHubComposable4.RecurringDepositHubComposable$lambda$0(snapshotState4).getSections(), new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositHubComposable$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringDepositHubComposable4.C305431.invoke$lambda$4$lambda$3$lambda$1(lifecycleAwareNavigator, function1, (RecurringDepositHubViewState.Row) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositHubComposable$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringDepositHubComposable4.C305431.invoke$lambda$4$lambda$3$lambda$2(navigator, context, (RecurringDepositHubViewState.Row) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$1(LifecycleAwareNavigator lifecycleAwareNavigator, Function1 function1, RecurringDepositHubViewState.Row row) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(row, "row");
            if (row.getType() == DepositScheduleType.EXTRA_CASH) {
                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(RecurringDepositHubDestinations.INSTANCE, new RecurringDepositHubDestinations.Args(row.getId()), null, null, 6, null), false, (Function1) null, 6, (Object) null);
            } else {
                function1.invoke(row.getId());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Navigator navigator, Context context, RecurringDepositHubViewState.Row row) {
            Intrinsics.checkNotNullParameter(row, "row");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, new UpdateBankAccountDeeplinkDto(row.getAchRelationshipId(), row.getId(), null, UpdateBankAccountDeeplinkDto.EntryPointDto.RECURRING_DEPOSITS_HUB, 4, null).encodeToUri(RhDeeplinkSupportedUri.ROBINHOOD), null, null, false, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringDepositHubViewState RecurringDepositHubComposable$lambda$0(SnapshotState4<RecurringDepositHubViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final void RecurringDepositSections(LazyListScope lazyListScope, List<RecurringDepositHubViewState.Section> sections, final Function1<? super RecurringDepositHubViewState.Row, Unit> onRowClick, final Function1<? super RecurringDepositHubViewState.Row, Unit> onRelinkClick) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(onRowClick, "onRowClick");
        Intrinsics.checkNotNullParameter(onRelinkClick, "onRelinkClick");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        for (final RecurringDepositHubViewState.Section section : sections) {
            LazyListScope lazyListScope2 = lazyListScope;
            LazyListScope.item$default(lazyListScope2, null, null, ComposableLambda3.composableLambdaInstance(-464607570, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt.RecurringDepositSections.1
                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-464607570, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositSections.<anonymous> (RecurringDepositHubComposable.kt:217)");
                    }
                    composer.startReplaceGroup(188731521);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    Ref.BooleanRef booleanRef2 = booleanRef;
                    if (booleanRef2.element) {
                        booleanRef2.element = false;
                        modifierM5144paddingVpY3zN4$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5144paddingVpY3zN4$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    }
                    composer.endReplaceGroup();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    RecurringDepositHubViewState.Section section2 = section;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoIcon2.m20644BentoIconFU0evQE(section2.getStartIcon24(), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable | 48, 56);
                    BentoText2.m20748BentoTextQnj7Zds(section2.getTitle(), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }
            }), 3, null);
            final ImmutableList<RecurringDepositHubViewState.Row> rows = section.getRows();
            final C30539xa874ac48 c30539xa874ac48 = new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositSections$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(RecurringDepositHubViewState.Row row) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((RecurringDepositHubViewState.Row) obj);
                }
            };
            lazyListScope2.items(rows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositSections$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c30539xa874ac48.invoke(rows.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$RecurringDepositSections$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    RecurringDepositHubViewState.Row row = (RecurringDepositHubViewState.Row) rows.get(i);
                    composer.startReplaceGroup(-492100713);
                    RecurringDepositHubComposable4.RecurringDepositRow(row, onRowClick, onRelinkClick, null, composer, 0, 8);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            lazyListScope = lazyListScope2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringDepositSetUpRow(final int i, final String primaryText, final String str, final String secondaryText, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1596908859);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(primaryText) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(secondaryText) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
        }
        int i5 = i3 & 32;
        if (i5 == 0) {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i4) != 74898 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1596908859, i4, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositSetUpRow (RecurringDepositHubComposable.kt:265)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (57344 & i4) != 16384;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecurringDepositHubComposable4.RecurringDepositSetUpRow$lambda$4$lambda$3(onClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, (Function0) objRememberedValue, 7, null), null, ComposableLambda3.rememberComposableLambda(803735799, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt.RecurringDepositSetUpRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(803735799, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositSetUpRow.<anonymous> (RecurringDepositHubComposable.kt:268)");
                        }
                        int i7 = i;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoPogKt.m20684BentoPictogramPogRhg8lNc(i7, null, false, null, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU()), composer3, 0, 30);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(235763576, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt.RecurringDepositSetUpRow.3
                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(235763576, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositSetUpRow.<anonymous> (RecurringDepositHubComposable.kt:275)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        String str2 = primaryText;
                        String str3 = str;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        FontWeight.Companion companion3 = FontWeight.INSTANCE;
                        FontWeight w700 = companion3.getW700();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str2, null, null, null, w700, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 24576, 0, 8174);
                        composer3.startReplaceGroup(130553686);
                        if (str3 != null) {
                            BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5144paddingVpY3zN4$default(Background3.m4871backgroundbw27NRU(PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), bentoTheme.getColors(composer3, i7).m21456getPositive0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(100)), C2002Dp.m7995constructorimpl(6), 0.0f, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), null, companion3.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 24576, 0, 8168);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-332208647, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt.RecurringDepositSetUpRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-332208647, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositSetUpRow.<anonymous> (RecurringDepositHubComposable.kt:305)");
                        }
                        String str2 = secondaryText;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextS(), composer3, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, true, false, false, null, composer2, 12610944, 0, 1890);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecurringDepositHubComposable4.RecurringDepositSetUpRow$lambda$5(i, primaryText, str, secondaryText, onClick, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 196608;
        modifier2 = modifier;
        if ((74899 & i4) != 74898) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((57344 & i4) != 16384) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RecurringDepositHubComposable4.RecurringDepositSetUpRow$lambda$4$lambda$3(onClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier42 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, (Function0) objRememberedValue, 7, null), null, ComposableLambda3.rememberComposableLambda(803735799, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt.RecurringDepositSetUpRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(803735799, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositSetUpRow.<anonymous> (RecurringDepositHubComposable.kt:268)");
                        }
                        int i7 = i;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoPogKt.m20684BentoPictogramPogRhg8lNc(i7, null, false, null, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU()), composer3, 0, 30);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(235763576, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt.RecurringDepositSetUpRow.3
                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(235763576, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositSetUpRow.<anonymous> (RecurringDepositHubComposable.kt:275)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        String str2 = primaryText;
                        String str3 = str;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        FontWeight.Companion companion3 = FontWeight.INSTANCE;
                        FontWeight w700 = companion3.getW700();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str2, null, null, null, w700, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 24576, 0, 8174);
                        composer3.startReplaceGroup(130553686);
                        if (str3 != null) {
                            BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5144paddingVpY3zN4$default(Background3.m4871backgroundbw27NRU(PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), bentoTheme.getColors(composer3, i7).m21456getPositive0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(100)), C2002Dp.m7995constructorimpl(6), 0.0f, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), null, companion3.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 24576, 0, 8168);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-332208647, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt.RecurringDepositSetUpRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-332208647, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositSetUpRow.<anonymous> (RecurringDepositHubComposable.kt:305)");
                        }
                        String str2 = secondaryText;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextS(), composer3, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, true, false, false, null, composer2, 12610944, 0, 1890);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringDepositSetUpRow$lambda$4$lambda$3(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0324  */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringDepositRow(final RecurringDepositHubViewState.Row row, final Function1<? super RecurringDepositHubViewState.Row, Unit> onClick, Function1<? super RecurringDepositHubViewState.Row, Unit> onRelinkClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        AnnotatedString titleSecondaryText;
        AnnotatedString secondSubtitle;
        final Function1<? super RecurringDepositHubViewState.Row, Unit> function1;
        Modifier.Companion companion;
        Modifier.Companion companionM4893clickableXHw0xAI$default;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onRelinkClick, "onRelinkClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-823436964);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(row) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRelinkClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                function1 = onRelinkClick;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-823436964, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositRow (RecurringDepositHubComposable.kt:323)");
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i5 = i3 & 14;
                z = ((i3 & 112) != 32) | (i5 != 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecurringDepositHubComposable4.RecurringDepositRow$lambda$7$lambda$6(onClick, row);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, (Function0) objRememberedValue, 7, null);
                modifier3 = modifier2;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM4893clickableXHw0xAI$default, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), null, false, 3, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                boolean z2 = false;
                BentoText2.m20748BentoTextQnj7Zds(row.getTitlePrimaryText(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                Composer composer3 = composerStartRestartGroup;
                titleSecondaryText = row.getTitleSecondaryText();
                composer3.startReplaceGroup(-751259355);
                if (titleSecondaryText != null) {
                    composer3.startReplaceGroup(-751258155);
                    IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_dot_16dp, composer3, 0), (String) null, SizeKt.m5169size3ABfNKs(companion4, ((Density) composer3.consume(CompositionLocalsKt.getLocalDensity())).mo5011toDpGaN1DYA(bentoTheme.getTypography(composer3, i6).getTextM().m7662getFontSizeXSAIIZE())), bentoTheme.getColors(composer3, i6).m21427getFg30d7_KjU(), composer3, 48, 0);
                    Unit unit = Unit.INSTANCE;
                    composer3.endReplaceGroup();
                    BentoText2.m20748BentoTextQnj7Zds(titleSecondaryText, null, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8190);
                    composer3 = composer3;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                Composer composer4 = composer3;
                BentoText2.m20748BentoTextQnj7Zds(row.getFirstSubtitle(), null, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer3, i6).getTextS(), composer4, 0, 0, 8190);
                Composer composer5 = composer4;
                secondSubtitle = row.getSecondSubtitle();
                composer5.startReplaceGroup(97083749);
                if (secondSubtitle != null) {
                    function1 = onRelinkClick;
                    companion = companion4;
                } else {
                    composer5.startReplaceGroup(97086857);
                    Color colorM6701boximpl = row.getSecondSubtitleAsUpdateCta() ? Color.m6701boximpl(bentoTheme.getColors(composer5, i6).m21452getNegative0d7_KjU()) : null;
                    composer5.endReplaceGroup();
                    TextStyle textS = bentoTheme.getTypography(composer5, i6).getTextS();
                    composer5.startReplaceGroup(97094357);
                    if (row.getSecondSubtitleAsUpdateCta()) {
                        composer5.startReplaceGroup(-1633490746);
                        boolean z3 = (i3 & 896) == 256;
                        if (i5 == 4) {
                            z2 = true;
                        }
                        boolean z4 = z3 | z2;
                        Object objRememberedValue2 = composer5.rememberedValue();
                        if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            function1 = onRelinkClick;
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RecurringDepositHubComposable4.RecurringDepositRow$lambda$14$lambda$13$lambda$12$lambda$11(function1, row);
                                }
                            };
                            composer5.updateRememberedValue(objRememberedValue2);
                        } else {
                            function1 = onRelinkClick;
                        }
                        composer5.endReplaceGroup();
                        companion = companion4;
                        companionM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue2, 7, null);
                    } else {
                        function1 = onRelinkClick;
                        companion = companion4;
                        companionM4893clickableXHw0xAI$default = companion;
                    }
                    composer5.endReplaceGroup();
                    BentoText2.m20748BentoTextQnj7Zds(secondSubtitle, companionM4893clickableXHw0xAI$default, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, null, textS, composer5, 0, 0, 8184);
                    composer5 = composer5;
                    Unit unit2 = Unit.INSTANCE;
                }
                composer5.endReplaceGroup();
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer5, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getColors(composer5, i6).m21373getBg30d7_KjU(), 0.0f, composer5, 0, 4);
                composer2 = composer5;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function1<? super RecurringDepositHubViewState.Row, Unit> function12 = function1;
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecurringDepositHubComposable4.RecurringDepositRow$lambda$15(row, onClick, function12, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i52 = i3 & 14;
            z = ((i3 & 112) != 32) | (i52 != 4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RecurringDepositHubComposable4.RecurringDepositRow$lambda$7$lambda$6(onClick, row);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, (Function0) objRememberedValue, 7, null);
                modifier3 = modifier2;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierM4893clickableXHw0xAI$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), null, false, 3, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default2);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        boolean z22 = false;
                        BentoText2.m20748BentoTextQnj7Zds(row.getTitlePrimaryText(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                        Composer composer32 = composerStartRestartGroup;
                        titleSecondaryText = row.getTitleSecondaryText();
                        composer32.startReplaceGroup(-751259355);
                        if (titleSecondaryText != null) {
                        }
                        composer32.endReplaceGroup();
                        composer32.endNode();
                        Composer composer42 = composer32;
                        BentoText2.m20748BentoTextQnj7Zds(row.getFirstSubtitle(), null, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composer32, i62).getTextS(), composer42, 0, 0, 8190);
                        Composer composer52 = composer42;
                        secondSubtitle = row.getSecondSubtitle();
                        composer52.startReplaceGroup(97083749);
                        if (secondSubtitle != null) {
                        }
                        composer52.endReplaceGroup();
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composer52, i62).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getColors(composer52, i62).m21373getBg30d7_KjU(), 0.0f, composer52, 0, 4);
                        composer2 = composer52;
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringDepositRow$lambda$7$lambda$6(Function1 function1, RecurringDepositHubViewState.Row row) {
        function1.invoke(row);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringDepositRow$lambda$14$lambda$13$lambda$12$lambda$11(Function1 function1, RecurringDepositHubViewState.Row row) {
        function1.invoke(row);
        return Unit.INSTANCE;
    }
}
