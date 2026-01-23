package com.robinhood.shared.iac.herocards.p383ui.heroCardWrapper;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
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
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCardComposable;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.shared.iac.herocards.p383ui.IacHeroCardComposable;
import com.robinhood.shared.iac.herocards.p383ui.heroCardWrapper.IacHeroCardWrapperComposable;
import com.robinhood.shared.iac.herocards.p383ui.heroCardWrapper.IacHeroCardWrapperDuxo;
import com.robinhood.shared.iac.herocards.p383ui.heroCardWrapper.IacHeroCardWrapperEvent;
import kotlin.Metadata;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: IacHeroCardWrapperComposable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001av\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052#\b\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\"\u0010\u0010\u0012\u001a\u00020\u00138\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\u0012\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u008a\u0084\u0002"}, m3636d2 = {IacHeroCardWrapperComposable.IAC_HERO_CARD_TEST_TAG, "", "args", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperDuxo$IacHeroCardWrapperArgs;", "modifier", "Landroidx/compose/ui/Modifier;", "onCardDismissed", "Lkotlin/Function1;", "Lcom/robinhood/models/db/herocard/IacHeroCard;", "Lkotlin/ParameterName;", "name", "card", "onCardDismissStart", "Lkotlin/Function0;", "onCardLoadingCompleted", "duxo", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperDuxo;", "(Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperDuxo$IacHeroCardWrapperArgs;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperDuxo;Landroidx/compose/runtime/Composer;II)V", CryptoDetailCardComposable.IAC_HERO_CARD_TEST_TAG, "", "lib-iac-hero-cards_externalDebug", "viewState", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class IacHeroCardWrapperComposable {
    public static final String IAC_HERO_CARD_TEST_TAG = "IacHeroCardWrapperComposable";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IacHeroCardWrapperComposable$lambda$11(IacHeroCardWrapperDuxo.IacHeroCardWrapperArgs iacHeroCardWrapperArgs, Modifier modifier, Function1 function1, Function0 function0, Function1 function12, IacHeroCardWrapperDuxo iacHeroCardWrapperDuxo, int i, int i2, Composer composer, int i3) {
        IacHeroCardWrapperComposable(iacHeroCardWrapperArgs, modifier, function1, function0, function12, iacHeroCardWrapperDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IacHeroCardWrapperComposable$lambda$1$lambda$0(IacHeroCard it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IacHeroCardWrapperComposable$lambda$5$lambda$4(IacHeroCard iacHeroCard) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IacHeroCardWrapperComposable(final IacHeroCardWrapperDuxo.IacHeroCardWrapperArgs args, Modifier modifier, Function1<? super IacHeroCard, Unit> function1, Function0<Unit> function0, Function1<? super IacHeroCard, Unit> function12, IacHeroCardWrapperDuxo iacHeroCardWrapperDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super IacHeroCard, Unit> function13;
        int i5;
        Function0<Unit> function02;
        int i6;
        Function1<? super IacHeroCard, Unit> function14;
        IacHeroCardWrapperDuxo iacHeroCardWrapperDuxo2;
        Modifier modifier3;
        Function1<? super IacHeroCard, Unit> function15;
        Function0<Unit> function03;
        final Function1<? super IacHeroCard, Unit> function16;
        int i7;
        Function1<? super IacHeroCard, Unit> function17;
        int i8;
        IacHeroCardWrapperDuxo iacHeroCardWrapperDuxo3;
        Event<IacHeroCardWrapperEvent> event;
        final Event<IacHeroCardWrapperEvent> eventIacHeroCardWrapperComposable$lambda$7;
        IacHeroCard iacHeroCard;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableTransitionState mutableTransitionState;
        int i9;
        Object objRememberedValue2;
        IacHeroCardWrapperDuxo iacHeroCardWrapperDuxo4;
        IacHeroCard iacHeroCard2;
        MutableTransitionState mutableTransitionState2;
        final Modifier modifier4;
        final Function0<Unit> function04;
        final Function1<? super IacHeroCard, Unit> function18;
        final IacHeroCardWrapperDuxo iacHeroCardWrapperDuxo5;
        final Function1<? super IacHeroCard, Unit> function19;
        EventConsumer<IacHeroCardWrapperEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1559126347);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            function14 = function12;
                            i3 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
                        }
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                iacHeroCardWrapperDuxo2 = iacHeroCardWrapperDuxo;
                                int i11 = composerStartRestartGroup.changedInstance(iacHeroCardWrapperDuxo2) ? 131072 : 65536;
                                i3 |= i11;
                            } else {
                                iacHeroCardWrapperDuxo2 = iacHeroCardWrapperDuxo;
                            }
                            i3 |= i11;
                        } else {
                            iacHeroCardWrapperDuxo2 = iacHeroCardWrapperDuxo;
                        }
                        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            function19 = function13;
                            function04 = function02;
                            function18 = function14;
                            iacHeroCardWrapperDuxo5 = iacHeroCardWrapperDuxo2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return IacHeroCardWrapperComposable.IacHeroCardWrapperComposable$lambda$1$lambda$0((IacHeroCard) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    function15 = (Function1) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function15 = function13;
                                }
                                if (i5 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    function03 = (Function0) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function03 = function02;
                                }
                                if (i6 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return IacHeroCardWrapperComposable.IacHeroCardWrapperComposable$lambda$5$lambda$4((IacHeroCard) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    function16 = (Function1) objRememberedValue5;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function16 = function14;
                                }
                                if ((i2 & 32) == 0) {
                                    composerStartRestartGroup.startReplaceGroup(2050738472);
                                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    }
                                    CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                                    creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                                    i7 = 0;
                                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IacHeroCardWrapperDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$duxo$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                lifecycle.addObserver(duxoLifecycleObserver);
                                                final Lifecycle lifecycle2 = lifecycle;
                                                return new DisposableEffectResult() { // from class: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$duxo$1.1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                                    }
                                                };
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                    function17 = function15;
                                    i8 = i3 & (-458753);
                                    iacHeroCardWrapperDuxo3 = (IacHeroCardWrapperDuxo) baseDuxo;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1559126347, i8, -1, "com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposable (IacHeroCardWrapperComposable.kt:38)");
                                    }
                                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(iacHeroCardWrapperDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                                    final StateFlow<Event<IacHeroCardWrapperEvent>> eventFlow = iacHeroCardWrapperDuxo3.getEventFlow();
                                    composerStartRestartGroup.startReplaceGroup(-523522313);
                                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                                    Lifecycle.State state = Lifecycle.State.STARTED;
                                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$collectEventAsStateWithLifecycle$1

                                        /* compiled from: Emitters.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        @SourceDebugExtension
                                        /* renamed from: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                                        public static final class AnonymousClass2<T> implements FlowCollector {
                                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                            @DebugMetadata(m3644c = "com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "IacHeroCardWrapperComposable.kt", m3646l = {50}, m3647m = "emit")
                                            /* renamed from: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                                    if ((event != null ? event.getData() : null) instanceof IacHeroCardWrapperEvent) {
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
                                    Event<IacHeroCardWrapperEvent> value = eventFlow.getValue();
                                    event = value;
                                    if (!((event == null ? event.getData() : null) instanceof IacHeroCardWrapperEvent)) {
                                        value = null;
                                    }
                                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                    eventIacHeroCardWrapperComposable$lambda$7 = IacHeroCardWrapperComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle2);
                                    if (eventIacHeroCardWrapperComposable$lambda$7 != null && (eventIacHeroCardWrapperComposable$lambda$7.getData() instanceof IacHeroCardWrapperEvent.OnCardLoadingCompleted) && (eventConsumerInvoke = eventIacHeroCardWrapperComposable$lambda$7.getGetEventConsumer().invoke()) != null) {
                                        eventConsumerInvoke.consume(eventIacHeroCardWrapperComposable$lambda$7, new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$consumeIfType$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                m25465invoke(obj);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m25465invoke(Object it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                function16.invoke(((IacHeroCardWrapperEvent.OnCardLoadingCompleted) eventIacHeroCardWrapperComposable$lambda$7.getData()).getIacHeroCard());
                                            }
                                        });
                                    }
                                    iacHeroCard = IacHeroCardWrapperComposable$lambda$6(snapshotState4CollectAsStateWithLifecycle).getIacHeroCard();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                    String cardIdentifier = iacHeroCard == null ? iacHeroCard.getCardIdentifier() : null;
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    i9 = ((i8 & 896) != 256 ? 1 : i7) | (composerStartRestartGroup.changedInstance(iacHeroCard) ? 1 : 0) | (composerStartRestartGroup.changedInstance(mutableTransitionState) ? 1 : 0) | (composerStartRestartGroup.changedInstance(iacHeroCardWrapperDuxo3) ? 1 : 0);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (i9 == 0 || objRememberedValue2 == companion.getEmpty()) {
                                        iacHeroCardWrapperDuxo4 = iacHeroCardWrapperDuxo3;
                                        iacHeroCard2 = iacHeroCard;
                                        objRememberedValue2 = new IacHeroCardWrapperComposable2(iacHeroCard2, mutableTransitionState, iacHeroCardWrapperDuxo4, function17, null);
                                        mutableTransitionState2 = mutableTransitionState;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    } else {
                                        iacHeroCardWrapperDuxo4 = iacHeroCardWrapperDuxo3;
                                        iacHeroCard2 = iacHeroCard;
                                        mutableTransitionState2 = mutableTransitionState;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(cardIdentifier, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i7);
                                    AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState2, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(1456536461, true, new C390586(iacHeroCard2, modifier3, iacHeroCardWrapperDuxo4, mutableTransitionState2, function03), composerStartRestartGroup, 54), composerStartRestartGroup, MutableTransitionState.$stable | 200064, 18);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    function04 = function03;
                                    function18 = function16;
                                    iacHeroCardWrapperDuxo5 = iacHeroCardWrapperDuxo4;
                                    function19 = function17;
                                } else {
                                    i7 = 0;
                                    function17 = function15;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                modifier3 = modifier2;
                                function17 = function13;
                                function03 = function02;
                                function16 = function14;
                                i7 = 0;
                            }
                            i8 = i3;
                            iacHeroCardWrapperDuxo3 = iacHeroCardWrapperDuxo2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(iacHeroCardWrapperDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                            final Flow eventFlow2 = iacHeroCardWrapperDuxo3.getEventFlow();
                            composerStartRestartGroup.startReplaceGroup(-523522313);
                            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                            Lifecycle.State state2 = Lifecycle.State.STARTED;
                            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$collectEventAsStateWithLifecycle$1

                                /* compiled from: Emitters.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                                public static final class AnonymousClass2<T> implements FlowCollector {
                                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "IacHeroCardWrapperComposable.kt", m3646l = {50}, m3647m = "emit")
                                    /* renamed from: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                            if ((event != null ? event.getData() : null) instanceof IacHeroCardWrapperEvent) {
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
                                    Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }
                            };
                            Event<IacHeroCardWrapperEvent> value2 = eventFlow2.getValue();
                            event = value2;
                            if (!((event == null ? event.getData() : null) instanceof IacHeroCardWrapperEvent)) {
                            }
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            eventIacHeroCardWrapperComposable$lambda$7 = IacHeroCardWrapperComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle22);
                            if (eventIacHeroCardWrapperComposable$lambda$7 != null) {
                                eventConsumerInvoke.consume(eventIacHeroCardWrapperComposable$lambda$7, new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m25465invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m25465invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        function16.invoke(((IacHeroCardWrapperEvent.OnCardLoadingCompleted) eventIacHeroCardWrapperComposable$lambda$7.getData()).getIacHeroCard());
                                    }
                                });
                            }
                            iacHeroCard = IacHeroCardWrapperComposable$lambda$6(snapshotState4CollectAsStateWithLifecycle3).getIacHeroCard();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            mutableTransitionState = (MutableTransitionState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            if (iacHeroCard == null) {
                            }
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            i9 = ((i8 & 896) != 256 ? 1 : i7) | (composerStartRestartGroup.changedInstance(iacHeroCard) ? 1 : 0) | (composerStartRestartGroup.changedInstance(mutableTransitionState) ? 1 : 0) | (composerStartRestartGroup.changedInstance(iacHeroCardWrapperDuxo3) ? 1 : 0);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (i9 == 0) {
                                iacHeroCardWrapperDuxo4 = iacHeroCardWrapperDuxo3;
                                iacHeroCard2 = iacHeroCard;
                                objRememberedValue2 = new IacHeroCardWrapperComposable2(iacHeroCard2, mutableTransitionState, iacHeroCardWrapperDuxo4, function17, null);
                                mutableTransitionState2 = mutableTransitionState;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(cardIdentifier, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i7);
                                AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState2, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(1456536461, true, new C390586(iacHeroCard2, modifier3, iacHeroCardWrapperDuxo4, mutableTransitionState2, function03), composerStartRestartGroup, 54), composerStartRestartGroup, MutableTransitionState.$stable | 200064, 18);
                                composerStartRestartGroup = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                                function04 = function03;
                                function18 = function16;
                                iacHeroCardWrapperDuxo5 = iacHeroCardWrapperDuxo4;
                                function19 = function17;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return IacHeroCardWrapperComposable.IacHeroCardWrapperComposable$lambda$11(args, modifier4, function19, function04, function18, iacHeroCardWrapperDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    function14 = function12;
                    if ((196608 & i) == 0) {
                    }
                    if ((74899 & i3) == 74898) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function02 = function0;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                function14 = function12;
                if ((196608 & i) == 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function13 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function14 = function12;
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function14 = function12;
        if ((196608 & i) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: IacHeroCardWrapperComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$6 */
    static final class C390586 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ MutableTransitionState<Boolean> $cardVisibleState;
        final /* synthetic */ IacHeroCardWrapperDuxo $duxo;
        final /* synthetic */ IacHeroCard $iacHeroCard;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onCardDismissStart;

        C390586(IacHeroCard iacHeroCard, Modifier modifier, IacHeroCardWrapperDuxo iacHeroCardWrapperDuxo, MutableTransitionState<Boolean> mutableTransitionState, Function0<Unit> function0) {
            this.$iacHeroCard = iacHeroCard;
            this.$modifier = modifier;
            this.$duxo = iacHeroCardWrapperDuxo;
            this.$cardVisibleState = mutableTransitionState;
            this.$onCardDismissStart = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1456536461, i, -1, "com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposable.<anonymous> (IacHeroCardWrapperComposable.kt:73)");
            }
            if (this.$iacHeroCard != null) {
                Modifier modifierTestTag = TestTag3.testTag(this.$modifier, IacHeroCardWrapperComposable.IAC_HERO_CARD_TEST_TAG);
                IacHeroCard iacHeroCard = this.$iacHeroCard;
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$iacHeroCard) | composer.changedInstance(this.$cardVisibleState) | composer.changed(this.$onCardDismissStart);
                final IacHeroCardWrapperDuxo iacHeroCardWrapperDuxo = this.$duxo;
                final IacHeroCard iacHeroCard2 = this.$iacHeroCard;
                final MutableTransitionState<Boolean> mutableTransitionState = this.$cardVisibleState;
                final Function0<Unit> function0 = this.$onCardDismissStart;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperComposableKt$IacHeroCardWrapperComposable$6$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IacHeroCardWrapperComposable.C390586.invoke$lambda$1$lambda$0(iacHeroCardWrapperDuxo, iacHeroCard2, mutableTransitionState, function0, (IacHeroCard) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                IacHeroCardComposable.IacHeroCardComposable(iacHeroCard, modifierTestTag, null, null, null, (Function1) objRememberedValue, null, composer, 0, 92);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(IacHeroCardWrapperDuxo iacHeroCardWrapperDuxo, IacHeroCard iacHeroCard, MutableTransitionState mutableTransitionState, Function0 function0, IacHeroCard iacHeroCard2) {
            Intrinsics.checkNotNullParameter(iacHeroCard2, "<unused var>");
            iacHeroCardWrapperDuxo.onCardDismissClicked(iacHeroCard);
            mutableTransitionState.setTargetState(Boolean.FALSE);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    private static final IacHeroCardWrapperViewState IacHeroCardWrapperComposable$lambda$6(SnapshotState4<IacHeroCardWrapperViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<IacHeroCardWrapperEvent> IacHeroCardWrapperComposable$lambda$7(SnapshotState4<Event<IacHeroCardWrapperEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
