package com.robinhood.android.cortex.digest.portfolio.agreement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import androidx.navigation.NavOptionsBuilder;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations4;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations5;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations8;
import com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposable;
import com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementDuxo2;
import com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposable;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.DialogDestinationWithArgs;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.CortexPortfolioDigestContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementEvent;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreen4;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: PortfolioDigestAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\u0012\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u008a\u0084\u0002"}, m3636d2 = {"PortfolioDigestAgreementComposable", "", "args", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestAgreementDest$Args;", "duxo", "Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementDuxo;", "(Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestAgreementDest$Args;Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-cortex-digest-portfolio_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestAgreementComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestAgreementComposable$lambda$5(PortfolioDigestDestinations.Args args, PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo, int i, int i2, Composer composer, int i3) {
        PortfolioDigestAgreementComposable(args, portfolioDigestAgreementDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioDigestAgreementComposable(final PortfolioDigestDestinations.Args args, PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo, Composer composer, final int i, final int i2) {
        int i3;
        PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo2;
        Composer composer2;
        final PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo3;
        Composer composer3;
        final OnBackPressedDispatcher onBackPressedDispatcher;
        final Event<PortfolioDigestAgreementDuxo2> eventPortfolioDigestAgreementComposable$lambda$0;
        final Event<PortfolioDigestAgreementDuxo2> eventPortfolioDigestAgreementComposable$lambda$02;
        boolean zChangedInstance;
        Object objRememberedValue;
        String source;
        EventConsumer<PortfolioDigestAgreementDuxo2> eventConsumerInvoke;
        EventConsumer<PortfolioDigestAgreementDuxo2> eventConsumerInvoke2;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(1549165952);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                portfolioDigestAgreementDuxo2 = portfolioDigestAgreementDuxo;
                int i4 = composerStartRestartGroup.changedInstance(portfolioDigestAgreementDuxo2) ? 32 : 16;
                i3 |= i4;
            } else {
                portfolioDigestAgreementDuxo2 = portfolioDigestAgreementDuxo;
            }
            i3 |= i4;
        } else {
            portfolioDigestAgreementDuxo2 = portfolioDigestAgreementDuxo;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            portfolioDigestAgreementDuxo3 = portfolioDigestAgreementDuxo2;
            composer3 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(2050738472);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                    creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    composer2 = composerStartRestartGroup;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PortfolioDigestAgreementDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$PortfolioDigestAgreementComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$PortfolioDigestAgreementComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                    composer2.endReplaceGroup();
                    i5 &= -113;
                    portfolioDigestAgreementDuxo3 = (PortfolioDigestAgreementDuxo) baseDuxo;
                } else {
                    composer2 = composerStartRestartGroup;
                    portfolioDigestAgreementDuxo3 = portfolioDigestAgreementDuxo2;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1549165952, i5, -1, "com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposable (PortfolioDigestAgreementComposable.kt:33)");
                }
                Composer composer4 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestAgreementDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composer3, BackHandler5.$stable);
                onBackPressedDispatcher = current2 == null ? current2.getOnBackPressedDispatcher() : null;
                final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer3.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                eventPortfolioDigestAgreementComposable$lambda$0 = PortfolioDigestAgreementComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventPortfolioDigestAgreementComposable$lambda$0 != null) {
                    if ((eventPortfolioDigestAgreementComposable$lambda$0.getData() instanceof PortfolioDigestAgreementDuxo2.Loaded) && (eventConsumerInvoke2 = eventPortfolioDigestAgreementComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventPortfolioDigestAgreementComposable$lambda$0, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$PortfolioDigestAgreementComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                                m12591invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12591invoke(Object it) throws Resources.NotFoundException {
                                Intrinsics.checkNotNullParameter(it, "it");
                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, PortfolioDigestDestinations4.INSTANCE, new PortfolioDigestDestinations4.Args(((PortfolioDigestAgreementDuxo2.Loaded) eventPortfolioDigestAgreementComposable$lambda$0.getData()).getDigest(), args.getSource()), null, null, false, new Function1<NavOptionsBuilder, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$PortfolioDigestAgreementComposable$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
                                        invoke2(navOptionsBuilder);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(NavOptionsBuilder navigate) {
                                        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                                        NavOptionsBuilder.popUpTo$default(navigate, PortfolioDigestDestinations8.INSTANCE.getRoutePath(), null, 2, null);
                                    }
                                }, 28, null);
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                final Context context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                eventPortfolioDigestAgreementComposable$lambda$02 = PortfolioDigestAgreementComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventPortfolioDigestAgreementComposable$lambda$02 != null) {
                    if ((eventPortfolioDigestAgreementComposable$lambda$02.getData() instanceof PortfolioDigestAgreementDuxo2.Timeout) && (eventConsumerInvoke = eventPortfolioDigestAgreementComposable$lambda$02.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventPortfolioDigestAgreementComposable$lambda$02, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$PortfolioDigestAgreementComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                                m12592invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12592invoke(Object it) throws Resources.NotFoundException {
                                Intrinsics.checkNotNullParameter(it, "it");
                                LifecycleAwareNavigator lifecycleAwareNavigator2 = lifecycleAwareNavigator;
                                PortfolioDigestDestinations5 portfolioDigestDestinations5 = PortfolioDigestDestinations5.INSTANCE;
                                String string2 = context.getString(C11048R.string.general_error_summary);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator2, (DialogDestinationWithArgs) portfolioDigestDestinations5, (Parcelable) new PortfolioDigestDestinations5.Args.Message(0, string2, 1, null), false, (Function1) null, 12, (Object) null);
                            }
                        });
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                composer3.startReplaceGroup(5004770);
                zChangedInstance = composer3.changedInstance(onBackPressedDispatcher);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PortfolioDigestAgreementComposable.PortfolioDigestAgreementComposable$lambda$4$lambda$3(onBackPressedDispatcher, ((Integer) obj).intValue());
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                PortfolioDigestErrorDialogComposable.ObserveErrorResult((Function1) objRememberedValue, composer3, 0);
                Screen screen = new Screen(Screen.Name.PORTFOLIO_DIGEST_AGREEMENT, null, null, null, 14, null);
                String accountNumber = args.getDigest().getAccountNumber();
                String digestId = args.getDigest().getDigestId();
                source = args.getSource();
                if (source == null) {
                    source = "";
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CortexPortfolioDigestContext(accountNumber, digestId, source, null, 8, null), null, null, -1, -1, -1, -1, -1, -1, 14335, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1827546123, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt.PortfolioDigestAgreementComposable.4

                    /* compiled from: PortfolioDigestAgreementComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$PortfolioDigestAgreementComposable$4$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ PortfolioDigestDestinations.Args $args;
                        final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;
                        final /* synthetic */ PortfolioDigestAgreementDuxo $duxo;

                        AnonymousClass1(PortfolioDigestDestinations.Args args, OnBackPressedDispatcher onBackPressedDispatcher, PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo) {
                            this.$args = args;
                            this.$backPressedDispatcher = onBackPressedDispatcher;
                            this.$duxo = portfolioDigestAgreementDuxo;
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
                                ComposerKt.traceEventStart(-770752512, i, -1, "com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposable.<anonymous>.<anonymous> (PortfolioDigestAgreementComposable.kt:81)");
                            }
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                            String accountNumber = this.$args.getDigest().getAccountNumber();
                            IdentiAgreementType.ServerDriven serverDriven = new IdentiAgreementType.ServerDriven(this.$args.getDigest().getAgreementTitle(), this.$args.getDigest().getAgreementButtonDisclosure(), this.$args.getDigest().getAgreementName());
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$backPressedDispatcher);
                            final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$PortfolioDigestAgreementComposable$4$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PortfolioDigestAgreementComposable.C121124.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                            final PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo = this.$duxo;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$PortfolioDigestAgreementComposable$4$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return PortfolioDigestAgreementComposable.C121124.AnonymousClass1.invoke$lambda$3$lambda$2(portfolioDigestAgreementDuxo, (IdentiAgreementEvent) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            IdentiAgreementScreen4.IdentiAgreementScreen(serverDriven, accountNumber, function0, (Function1) objRememberedValue2, modifierLogScreenTransitions$default, null, null, null, composer, 0, 224);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                            if (onBackPressedDispatcher != null) {
                                onBackPressedDispatcher.onBackPressed();
                            }
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo, IdentiAgreementEvent event) {
                            Intrinsics.checkNotNullParameter(event, "event");
                            if (!(event instanceof IdentiAgreementEvent.Error) && !Intrinsics.areEqual(event, IdentiAgreementEvent.Submitting.INSTANCE)) {
                                if (!Intrinsics.areEqual(event, IdentiAgreementEvent.Submitted.INSTANCE)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                portfolioDigestAgreementDuxo.pollUntilOnboarded();
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i6) {
                        if ((i6 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1827546123, i6, -1, "com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposable.<anonymous> (PortfolioDigestAgreementComposable.kt:80)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-770752512, true, new AnonymousClass1(args, onBackPressedDispatcher, portfolioDigestAgreementDuxo3), composer5, 54), composer5, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                    portfolioDigestAgreementDuxo3 = portfolioDigestAgreementDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestAgreementDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer3 = composer42;
                OnBackPressedDispatcherOwner current22 = BackHandler5.INSTANCE.getCurrent(composer3, BackHandler5.$stable);
                if (current22 == null) {
                }
                final LifecycleAwareNavigator lifecycleAwareNavigator2 = (LifecycleAwareNavigator) composer3.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                eventPortfolioDigestAgreementComposable$lambda$0 = PortfolioDigestAgreementComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPortfolioDigestAgreementComposable$lambda$0 != null) {
                }
                final Context context2 = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                eventPortfolioDigestAgreementComposable$lambda$02 = PortfolioDigestAgreementComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPortfolioDigestAgreementComposable$lambda$02 != null) {
                }
                composer3.startReplaceGroup(5004770);
                zChangedInstance = composer3.changedInstance(onBackPressedDispatcher);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PortfolioDigestAgreementComposable.PortfolioDigestAgreementComposable$lambda$4$lambda$3(onBackPressedDispatcher, ((Integer) obj).intValue());
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                    composer3.endReplaceGroup();
                    PortfolioDigestErrorDialogComposable.ObserveErrorResult((Function1) objRememberedValue, composer3, 0);
                    Screen screen2 = new Screen(Screen.Name.PORTFOLIO_DIGEST_AGREEMENT, null, null, null, 14, null);
                    String accountNumber2 = args.getDigest().getAccountNumber();
                    String digestId2 = args.getDigest().getDigestId();
                    source = args.getSource();
                    if (source == null) {
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen2, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CortexPortfolioDigestContext(accountNumber2, digestId2, source, null, 8, null), null, null, -1, -1, -1, -1, -1, -1, 14335, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1827546123, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt.PortfolioDigestAgreementComposable.4

                        /* compiled from: PortfolioDigestAgreementComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$PortfolioDigestAgreementComposable$4$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ PortfolioDigestDestinations.Args $args;
                            final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;
                            final /* synthetic */ PortfolioDigestAgreementDuxo $duxo;

                            AnonymousClass1(PortfolioDigestDestinations.Args args, OnBackPressedDispatcher onBackPressedDispatcher, PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo) {
                                this.$args = args;
                                this.$backPressedDispatcher = onBackPressedDispatcher;
                                this.$duxo = portfolioDigestAgreementDuxo;
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
                                    ComposerKt.traceEventStart(-770752512, i, -1, "com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposable.<anonymous>.<anonymous> (PortfolioDigestAgreementComposable.kt:81)");
                                }
                                Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                                String accountNumber = this.$args.getDigest().getAccountNumber();
                                IdentiAgreementType.ServerDriven serverDriven = new IdentiAgreementType.ServerDriven(this.$args.getDigest().getAgreementTitle(), this.$args.getDigest().getAgreementButtonDisclosure(), this.$args.getDigest().getAgreementName());
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$backPressedDispatcher);
                                final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$PortfolioDigestAgreementComposable$4$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PortfolioDigestAgreementComposable.C121124.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                                final PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo = this.$duxo;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$PortfolioDigestAgreementComposable$4$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return PortfolioDigestAgreementComposable.C121124.AnonymousClass1.invoke$lambda$3$lambda$2(portfolioDigestAgreementDuxo, (IdentiAgreementEvent) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                IdentiAgreementScreen4.IdentiAgreementScreen(serverDriven, accountNumber, function0, (Function1) objRememberedValue2, modifierLogScreenTransitions$default, null, null, null, composer, 0, 224);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.onBackPressed();
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo, IdentiAgreementEvent event) {
                                Intrinsics.checkNotNullParameter(event, "event");
                                if (!(event instanceof IdentiAgreementEvent.Error) && !Intrinsics.areEqual(event, IdentiAgreementEvent.Submitting.INSTANCE)) {
                                    if (!Intrinsics.areEqual(event, IdentiAgreementEvent.Submitted.INSTANCE)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    portfolioDigestAgreementDuxo.pollUntilOnboarded();
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i6) {
                            if ((i6 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1827546123, i6, -1, "com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposable.<anonymous> (PortfolioDigestAgreementComposable.kt:80)");
                            }
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-770752512, true, new AnonymousClass1(args, onBackPressedDispatcher, portfolioDigestAgreementDuxo3), composer5, 54), composer5, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioDigestAgreementComposable.PortfolioDigestAgreementComposable$lambda$5(args, portfolioDigestAgreementDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestAgreementComposable$lambda$4$lambda$3(OnBackPressedDispatcher onBackPressedDispatcher, int i) {
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    private static final Event<PortfolioDigestAgreementDuxo2> PortfolioDigestAgreementComposable$lambda$0(SnapshotState4<Event<PortfolioDigestAgreementDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
