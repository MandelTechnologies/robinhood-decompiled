package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashDestinations4;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashDestinations7;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringExtraCashData;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposable;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: RecurringDepositExtraCashAccountSelectionComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"RecurringDepositExtraCashAccountSelectionComposable", "", "args", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/RecurringExtraCashData;", "accountType", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/AccountType;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo;", "(Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/RecurringExtraCashData;Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/AccountType;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo;Landroidx/compose/runtime/Composer;II)V", "AccountSelectionRadioRow", "row", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionViewState$Row;", "onClick", "Lkotlin/Function1;", "(Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionViewState$Row;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-recurring-deposits_externalDebug", "viewState", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashAccountSelectionComposable {

    /* compiled from: RecurringDepositExtraCashAccountSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.INTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionRadioRow$lambda$4(RecurringDepositExtraCashAccountSelectionViewState.Row row, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSelectionRadioRow(row, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringDepositExtraCashAccountSelectionComposable$lambda$1(RecurringExtraCashData recurringExtraCashData, AccountType accountType, Modifier modifier, RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo, int i, int i2, Composer composer, int i3) {
        RecurringDepositExtraCashAccountSelectionComposable(recurringExtraCashData, accountType, modifier, recurringDepositExtraCashAccountSelectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringDepositExtraCashAccountSelectionComposable(final RecurringExtraCashData args, final AccountType accountType, Modifier modifier, RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo2;
        Modifier modifier3;
        int i4;
        String str;
        final Modifier modifier4;
        final RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Composer composerStartRestartGroup = composer.startRestartGroup(1329202119);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(accountType.ordinal()) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    recurringDepositExtraCashAccountSelectionDuxo2 = recurringDepositExtraCashAccountSelectionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(recurringDepositExtraCashAccountSelectionDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    recurringDepositExtraCashAccountSelectionDuxo2 = recurringDepositExtraCashAccountSelectionDuxo;
                }
                i3 |= i6;
            } else {
                recurringDepositExtraCashAccountSelectionDuxo2 = recurringDepositExtraCashAccountSelectionDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, accountType)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RecurringDepositExtraCashAccountSelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$$inlined$duxo$1.1
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
                        recurringDepositExtraCashAccountSelectionDuxo2 = (RecurringDepositExtraCashAccountSelectionDuxo) baseDuxo;
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
                    ComposerKt.traceEventStart(1329202119, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposable (RecurringDepositExtraCashAccountSelectionComposable.kt:56)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(recurringDepositExtraCashAccountSelectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Screen.Name name = Screen.Name.EXTRA_CASH_SETUP_ACCOUNT_SELECTION;
                i4 = WhenMappings.$EnumSwitchMapping$0[accountType.ordinal()];
                if (i4 != 1) {
                    str = "source";
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "sink";
                }
                final Modifier modifier5 = modifier3;
                final RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo4 = recurringDepositExtraCashAccountSelectionDuxo2;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name, null, str, null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1275964302, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt.RecurringDepositExtraCashAccountSelectionComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: RecurringDepositExtraCashAccountSelectionComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ AccountType $accountType;
                        final /* synthetic */ RecurringExtraCashData $args;
                        final /* synthetic */ UserInteractionEventDescriptor $eventData;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> $viewState$delegate;

                        /* compiled from: RecurringDepositExtraCashAccountSelectionComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[AccountType.values().length];
                                try {
                                    iArr[AccountType.INTERNAL.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[AccountType.EXTERNAL.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        AnonymousClass1(AccountType accountType, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, RecurringExtraCashData recurringExtraCashData, SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> snapshotState4) {
                            this.$accountType = accountType;
                            this.$eventLogger = eventLogger;
                            this.$eventData = userInteractionEventDescriptor;
                            this.$args = recurringExtraCashData;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            String strStringResource;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1387156249, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposable.<anonymous>.<anonymous> (RecurringDepositExtraCashAccountSelectionComposable.kt:78)");
                            }
                            final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                            AccountType accountType = this.$accountType;
                            composer.startReplaceGroup(-1617288943);
                            if (accountType == AccountType.INTERNAL) {
                                strStringResource = null;
                            } else {
                                if (accountType != AccountType.EXTERNAL) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                strStringResource = StringResources_androidKt.stringResource(C30439R.string.external_account_selection_footer, composer, 0);
                            }
                            composer.endReplaceGroup();
                            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                            boolean zIsContinueButtonEnabled = RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(this.$viewState$delegate).isContinueButtonEnabled();
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventData) | composer.changed(lifecycleAwareNavigator) | composer.changed(this.$accountType.ordinal()) | composer.changedInstance(this.$args) | composer.changed(this.$viewState$delegate);
                            final EventLogger eventLogger = this.$eventLogger;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventData;
                            final AccountType accountType2 = this.$accountType;
                            final RecurringExtraCashData recurringExtraCashData = this.$args;
                            final SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> snapshotState4 = this.$viewState$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                Object obj = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RecurringDepositExtraCashAccountSelectionComposable.C305021.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, lifecycleAwareNavigator, accountType2, recurringExtraCashData, snapshotState4);
                                    }
                                };
                                composer.updateRememberedValue(obj);
                                objRememberedValue = obj;
                            }
                            composer.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, strStringResource, null, false, null, null, (Function0) objRememberedValue, strStringResource2, false, null, zIsContinueButtonEnabled, null, null, false, null, false, composer, 0, 0, 64316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, LifecycleAwareNavigator lifecycleAwareNavigator, AccountType accountType, RecurringExtraCashData recurringExtraCashData, SnapshotState4 snapshotState4) throws Resources.NotFoundException {
                            ComposeNav.DestWithArgs destWithArgsComposeNav$default;
                            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                            int i = WhenMappings.$EnumSwitchMapping$0[accountType.ordinal()];
                            if (i == 1) {
                                destWithArgsComposeNav$default = ComposableDestinationWithArgs.composeNav$default(RecurringDepositExtraCashDestinations7.INSTANCE, RecurringExtraCashData.copy$default(recurringExtraCashData, null, null, RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(snapshotState4).getSelectedRobinhoodAccount(), 3, null), null, null, 6, null);
                            } else {
                                if (i != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                destWithArgsComposeNav$default = ComposableDestinationWithArgs.composeNav$default(RecurringDepositExtraCashDestinations4.INSTANCE, RecurringExtraCashData.copy$default(recurringExtraCashData, RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(snapshotState4).getSelectedBankAccount(), null, null, 6, null), null, null, 6, null);
                            }
                            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) destWithArgsComposeNav$default, false, (Function1) null, 6, (Object) null);
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1275964302, i7, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposable.<anonymous> (RecurringDepositExtraCashAccountSelectionComposable.kt:73)");
                        }
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null), false, ComposableLambda3.rememberComposableLambda(-1387156249, true, new AnonymousClass1(accountType, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable), userInteractionEventDescriptor, args, snapshotState4CollectAsStateWithLifecycle), composer2, 54), ComposableLambda3.rememberComposableLambda(2124125530, true, new AnonymousClass2(accountType, recurringDepositExtraCashAccountSelectionDuxo4, navigator, context, userInteractionEventDescriptor, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: RecurringDepositExtraCashAccountSelectionComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                        final /* synthetic */ AccountType $accountType;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ RecurringDepositExtraCashAccountSelectionDuxo $duxo;
                        final /* synthetic */ UserInteractionEventDescriptor $eventData;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> $viewState$delegate;

                        /* compiled from: RecurringDepositExtraCashAccountSelectionComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$2$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[AccountType.values().length];
                                try {
                                    iArr[AccountType.INTERNAL.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[AccountType.EXTERNAL.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        AnonymousClass2(AccountType accountType, RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo, Navigator navigator, Context context, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> snapshotState4) {
                            this.$accountType = accountType;
                            this.$duxo = recurringDepositExtraCashAccountSelectionDuxo;
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$eventData = userInteractionEventDescriptor;
                            this.$viewState$delegate = snapshotState4;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
                            int i2;
                            int i3;
                            Composer composer2 = composer;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2124125530, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposable.<anonymous>.<anonymous> (RecurringDepositExtraCashAccountSelectionComposable.kt:128)");
                            }
                            AccountType accountType = this.$accountType;
                            RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo = this.$duxo;
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventData;
                            SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> snapshotState4 = this.$viewState$delegate;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                            int i4 = iArr[accountType.ordinal()];
                            if (i4 == 1) {
                                i2 = C30439R.string.internal_account_selection_title;
                            } else {
                                if (i4 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i2 = C30439R.string.external_account_selection_title;
                            }
                            String strStringResource = StringResources_androidKt.stringResource(i2, composer2, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo2 = recurringDepositExtraCashAccountSelectionDuxo;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 10, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getDisplayCapsuleSmall(), composer2, 0, 0, 8188);
                            int i6 = iArr[accountType.ordinal()];
                            if (i6 == 1) {
                                i3 = C30439R.string.internal_account_selection_subtitle;
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i3 = C30439R.string.external_account_selection_subtitle;
                            }
                            String strStringResource2 = StringResources_androidKt.stringResource(i3, composer2, 0);
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU();
                            BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8184);
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            composer2.startReplaceGroup(-1957196273);
                            for (RecurringDepositExtraCashAccountSelectionViewState.Row row : RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(snapshotState4).getRows()) {
                                composer2.startReplaceGroup(5004770);
                                final RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo3 = recurringDepositExtraCashAccountSelectionDuxo2;
                                boolean zChangedInstance = composer2.changedInstance(recurringDepositExtraCashAccountSelectionDuxo3);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return RecurringDepositExtraCashAccountSelectionComposable.C305021.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$1$lambda$0(recurringDepositExtraCashAccountSelectionDuxo3, (RecurringDepositExtraCashAccountSelectionViewState.Row) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                RecurringDepositExtraCashAccountSelectionComposable.AccountSelectionRadioRow(row, (Function1) objRememberedValue, null, composer2, 0, 4);
                                recurringDepositExtraCashAccountSelectionDuxo2 = recurringDepositExtraCashAccountSelectionDuxo3;
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(-1957181762);
                            if (RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(snapshotState4).isAddAccountButtonVisible()) {
                                BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BUBBLE_PLUS_24, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU()), 2, null);
                                String strStringResource3 = StringResources_androidKt.stringResource(C30439R.string.add_account, composer2, 0);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer2.changedInstance(navigator) | composer2.changedInstance(context);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RecurringDepositExtraCashAccountSelectionComposable.C305021.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$3$lambda$2(navigator, context);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion4, false, null, null, (Function0) objRememberedValue2, 7, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "add_account", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), icon, strStringResource3, null, null, null, null, true, false, false, 0L, null, composer2, (BentoBaseRowState.Start.Icon.$stable << 3) | 12582912, 0, 3960);
                                composer2 = composer2;
                            }
                            composer2.endReplaceGroup();
                            AnnotatedString infoBannerMessage = RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(snapshotState4).getInfoBannerMessage();
                            composer2.startReplaceGroup(-1957127287);
                            if (infoBannerMessage != null) {
                                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Composer composer3 = composer2;
                                BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(infoBannerMessage, null, bentoTheme2.getColors(composer2, i7).m21425getFg0d7_KjU(), bentoTheme2.getColors(composer2, i7).m21372getBg20d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme2.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), size24, null, null, composer3, (BentoIcon4.Size24.$stable << 15) | 48, 192);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                            invoke(boxScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$1$lambda$0(RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo, RecurringDepositExtraCashAccountSelectionViewState.Row row) {
                            Intrinsics.checkNotNullParameter(row, "row");
                            recurringDepositExtraCashAccountSelectionDuxo.onAccountSelected(row.getAccount());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$3$lambda$2(Navigator navigator, Context context) {
                            Navigator.DefaultImpls.startActivity$default(navigator, context, new CreateIavRelationshipIntentKey(IavSource.RECURRING_DEPOSIT_EXTRA_CASH, null, null, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), null, false, null, null, 60, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
                recurringDepositExtraCashAccountSelectionDuxo3 = recurringDepositExtraCashAccountSelectionDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                recurringDepositExtraCashAccountSelectionDuxo3 = recurringDepositExtraCashAccountSelectionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$1(args, accountType, modifier4, recurringDepositExtraCashAccountSelectionDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 8) != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(recurringDepositExtraCashAccountSelectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Screen.Name name2 = Screen.Name.EXTRA_CASH_SETUP_ACCOUNT_SELECTION;
                i4 = WhenMappings.$EnumSwitchMapping$0[accountType.ordinal()];
                if (i4 != 1) {
                }
                final Modifier modifier52 = modifier3;
                final RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo42 = recurringDepositExtraCashAccountSelectionDuxo2;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name2, null, str, null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1275964302, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt.RecurringDepositExtraCashAccountSelectionComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: RecurringDepositExtraCashAccountSelectionComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ AccountType $accountType;
                        final /* synthetic */ RecurringExtraCashData $args;
                        final /* synthetic */ UserInteractionEventDescriptor $eventData;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> $viewState$delegate;

                        /* compiled from: RecurringDepositExtraCashAccountSelectionComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[AccountType.values().length];
                                try {
                                    iArr[AccountType.INTERNAL.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[AccountType.EXTERNAL.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        AnonymousClass1(AccountType accountType, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, RecurringExtraCashData recurringExtraCashData, SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> snapshotState4) {
                            this.$accountType = accountType;
                            this.$eventLogger = eventLogger;
                            this.$eventData = userInteractionEventDescriptor;
                            this.$args = recurringExtraCashData;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            String strStringResource;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1387156249, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposable.<anonymous>.<anonymous> (RecurringDepositExtraCashAccountSelectionComposable.kt:78)");
                            }
                            final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                            AccountType accountType = this.$accountType;
                            composer.startReplaceGroup(-1617288943);
                            if (accountType == AccountType.INTERNAL) {
                                strStringResource = null;
                            } else {
                                if (accountType != AccountType.EXTERNAL) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                strStringResource = StringResources_androidKt.stringResource(C30439R.string.external_account_selection_footer, composer, 0);
                            }
                            composer.endReplaceGroup();
                            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                            boolean zIsContinueButtonEnabled = RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(this.$viewState$delegate).isContinueButtonEnabled();
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventData) | composer.changed(lifecycleAwareNavigator) | composer.changed(this.$accountType.ordinal()) | composer.changedInstance(this.$args) | composer.changed(this.$viewState$delegate);
                            final EventLogger eventLogger = this.$eventLogger;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventData;
                            final AccountType accountType2 = this.$accountType;
                            final RecurringExtraCashData recurringExtraCashData = this.$args;
                            final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                Object obj = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RecurringDepositExtraCashAccountSelectionComposable.C305021.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, lifecycleAwareNavigator, accountType2, recurringExtraCashData, snapshotState4);
                                    }
                                };
                                composer.updateRememberedValue(obj);
                                objRememberedValue = obj;
                            }
                            composer.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, strStringResource, null, false, null, null, (Function0) objRememberedValue, strStringResource2, false, null, zIsContinueButtonEnabled, null, null, false, null, false, composer, 0, 0, 64316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, LifecycleAwareNavigator lifecycleAwareNavigator, AccountType accountType, RecurringExtraCashData recurringExtraCashData, SnapshotState4 snapshotState4) throws Resources.NotFoundException {
                            ComposeNav.DestWithArgs destWithArgsComposeNav$default;
                            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                            int i = WhenMappings.$EnumSwitchMapping$0[accountType.ordinal()];
                            if (i == 1) {
                                destWithArgsComposeNav$default = ComposableDestinationWithArgs.composeNav$default(RecurringDepositExtraCashDestinations7.INSTANCE, RecurringExtraCashData.copy$default(recurringExtraCashData, null, null, RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(snapshotState4).getSelectedRobinhoodAccount(), 3, null), null, null, 6, null);
                            } else {
                                if (i != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                destWithArgsComposeNav$default = ComposableDestinationWithArgs.composeNav$default(RecurringDepositExtraCashDestinations4.INSTANCE, RecurringExtraCashData.copy$default(recurringExtraCashData, RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(snapshotState4).getSelectedBankAccount(), null, null, 6, null), null, null, 6, null);
                            }
                            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) destWithArgsComposeNav$default, false, (Function1) null, 6, (Object) null);
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1275964302, i7, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposable.<anonymous> (RecurringDepositExtraCashAccountSelectionComposable.kt:73)");
                        }
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(modifier52, null, 1, null), false, ComposableLambda3.rememberComposableLambda(-1387156249, true, new AnonymousClass1(accountType, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable), userInteractionEventDescriptor, args, snapshotState4CollectAsStateWithLifecycle2), composer2, 54), ComposableLambda3.rememberComposableLambda(2124125530, true, new AnonymousClass2(accountType, recurringDepositExtraCashAccountSelectionDuxo42, navigator2, context2, userInteractionEventDescriptor, snapshotState4CollectAsStateWithLifecycle2), composer2, 54), composer2, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: RecurringDepositExtraCashAccountSelectionComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                        final /* synthetic */ AccountType $accountType;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ RecurringDepositExtraCashAccountSelectionDuxo $duxo;
                        final /* synthetic */ UserInteractionEventDescriptor $eventData;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> $viewState$delegate;

                        /* compiled from: RecurringDepositExtraCashAccountSelectionComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$2$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[AccountType.values().length];
                                try {
                                    iArr[AccountType.INTERNAL.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[AccountType.EXTERNAL.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        AnonymousClass2(AccountType accountType, RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo, Navigator navigator, Context context, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> snapshotState4) {
                            this.$accountType = accountType;
                            this.$duxo = recurringDepositExtraCashAccountSelectionDuxo;
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$eventData = userInteractionEventDescriptor;
                            this.$viewState$delegate = snapshotState4;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
                            int i2;
                            int i3;
                            Composer composer2 = composer;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2124125530, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposable.<anonymous>.<anonymous> (RecurringDepositExtraCashAccountSelectionComposable.kt:128)");
                            }
                            AccountType accountType = this.$accountType;
                            RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo = this.$duxo;
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventData;
                            SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> snapshotState4 = this.$viewState$delegate;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                            int i4 = iArr[accountType.ordinal()];
                            if (i4 == 1) {
                                i2 = C30439R.string.internal_account_selection_title;
                            } else {
                                if (i4 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i2 = C30439R.string.external_account_selection_title;
                            }
                            String strStringResource = StringResources_androidKt.stringResource(i2, composer2, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo2 = recurringDepositExtraCashAccountSelectionDuxo;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 10, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getDisplayCapsuleSmall(), composer2, 0, 0, 8188);
                            int i6 = iArr[accountType.ordinal()];
                            if (i6 == 1) {
                                i3 = C30439R.string.internal_account_selection_subtitle;
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i3 = C30439R.string.external_account_selection_subtitle;
                            }
                            String strStringResource2 = StringResources_androidKt.stringResource(i3, composer2, 0);
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU();
                            BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8184);
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            composer2.startReplaceGroup(-1957196273);
                            for (RecurringDepositExtraCashAccountSelectionViewState.Row row : RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(snapshotState4).getRows()) {
                                composer2.startReplaceGroup(5004770);
                                final RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo3 = recurringDepositExtraCashAccountSelectionDuxo2;
                                boolean zChangedInstance = composer2.changedInstance(recurringDepositExtraCashAccountSelectionDuxo3);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return RecurringDepositExtraCashAccountSelectionComposable.C305021.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$1$lambda$0(recurringDepositExtraCashAccountSelectionDuxo3, (RecurringDepositExtraCashAccountSelectionViewState.Row) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                RecurringDepositExtraCashAccountSelectionComposable.AccountSelectionRadioRow(row, (Function1) objRememberedValue, null, composer2, 0, 4);
                                recurringDepositExtraCashAccountSelectionDuxo2 = recurringDepositExtraCashAccountSelectionDuxo3;
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(-1957181762);
                            if (RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(snapshotState4).isAddAccountButtonVisible()) {
                                BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BUBBLE_PLUS_24, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU()), 2, null);
                                String strStringResource3 = StringResources_androidKt.stringResource(C30439R.string.add_account, composer2, 0);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer2.changedInstance(navigator) | composer2.changedInstance(context);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$RecurringDepositExtraCashAccountSelectionComposable$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RecurringDepositExtraCashAccountSelectionComposable.C305021.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$3$lambda$2(navigator, context);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion4, false, null, null, (Function0) objRememberedValue2, 7, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "add_account", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), icon, strStringResource3, null, null, null, null, true, false, false, 0L, null, composer2, (BentoBaseRowState.Start.Icon.$stable << 3) | 12582912, 0, 3960);
                                composer2 = composer2;
                            }
                            composer2.endReplaceGroup();
                            AnnotatedString infoBannerMessage = RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable$lambda$0(snapshotState4).getInfoBannerMessage();
                            composer2.startReplaceGroup(-1957127287);
                            if (infoBannerMessage != null) {
                                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Composer composer3 = composer2;
                                BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(infoBannerMessage, null, bentoTheme2.getColors(composer2, i7).m21425getFg0d7_KjU(), bentoTheme2.getColors(composer2, i7).m21372getBg20d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme2.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), size24, null, null, composer3, (BentoIcon4.Size24.$stable << 15) | 48, 192);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                            invoke(boxScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$1$lambda$0(RecurringDepositExtraCashAccountSelectionDuxo recurringDepositExtraCashAccountSelectionDuxo, RecurringDepositExtraCashAccountSelectionViewState.Row row) {
                            Intrinsics.checkNotNullParameter(row, "row");
                            recurringDepositExtraCashAccountSelectionDuxo.onAccountSelected(row.getAccount());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$3$lambda$2(Navigator navigator, Context context) {
                            Navigator.DefaultImpls.startActivity$default(navigator, context, new CreateIavRelationshipIntentKey(IavSource.RECURRING_DEPOSIT_EXTRA_CASH, null, null, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), null, false, null, null, 60, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
                recurringDepositExtraCashAccountSelectionDuxo3 = recurringDepositExtraCashAccountSelectionDuxo42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringDepositExtraCashAccountSelectionViewState RecurringDepositExtraCashAccountSelectionComposable$lambda$0(SnapshotState4<RecurringDepositExtraCashAccountSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectionRadioRow(final RecurringDepositExtraCashAccountSelectionViewState.Row row, final Function1<? super RecurringDepositExtraCashAccountSelectionViewState.Row, Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-11795310);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(row) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-11795310, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.AccountSelectionRadioRow (RecurringDepositExtraCashAccountSelectionComposable.kt:239)");
                }
                BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, row.getPrimaryText(), row.getSelected(), (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(row.getSecondaryText()), row.getEnabled(), false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2016, (DefaultConstructorMarker) null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(row);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecurringDepositExtraCashAccountSelectionComposable.AccountSelectionRadioRow$lambda$3$lambda$2(onClick, row);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(modifier4, bentoSelectionRowState, (Function0) objRememberedValue, composerStartRestartGroup, ((i3 >> 6) & 14) | (BentoSelectionRowState.$stable << 3), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecurringDepositExtraCashAccountSelectionComposable.AccountSelectionRadioRow$lambda$4(row, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, row.getPrimaryText(), row.getSelected(), (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(row.getSecondaryText()), row.getEnabled(), false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2016, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(row);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RecurringDepositExtraCashAccountSelectionComposable.AccountSelectionRadioRow$lambda$3$lambda$2(onClick, row);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(modifier4, bentoSelectionRowState2, (Function0) objRememberedValue, composerStartRestartGroup, ((i3 >> 6) & 14) | (BentoSelectionRowState.$stable << 3), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionRadioRow$lambda$3$lambda$2(Function1 function1, RecurringDepositExtraCashAccountSelectionViewState.Row row) {
        function1.invoke(row);
        return Unit.INSTANCE;
    }
}
