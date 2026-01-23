package com.robinhood.shared.cards.p371v3;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.cards.compose.NotificationCardComposable4;
import com.robinhood.shared.cards.compose.SwipeableStackState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CardStackComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0019²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/Direction;", "direction", "Landroidx/compose/ui/Modifier;", "modifier", "", "showLoadingState", "Lcom/robinhood/shared/cards/v3/CardStackDuxo;", "duxo", "", "CardStackComposable", "(Lcom/robinhood/compose/bento/theme/Direction;Landroidx/compose/ui/Modifier;ZLcom/robinhood/shared/cards/v3/CardStackDuxo;Landroidx/compose/runtime/Composer;II)V", "useRhcStyling", "Lkotlin/Function0;", "content", "BottomCardThemeOverlay", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isCreditCard", "isRhdMarginCard", "RegularCardThemeOverlay", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "CreditCardTheme", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "RhdMarginCardTheme", "Lcom/robinhood/shared/cards/v3/CardStackViewState;", "viewState", "lib-cards_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.cards.v3.CardStackComposableKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class CardStackComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomCardThemeOverlay$lambda$6(boolean z, Function2 function2, int i, Composer composer, int i2) {
        BottomCardThemeOverlay(z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardStackComposable$lambda$5(BentoTheme4 bentoTheme4, Modifier modifier, boolean z, CardStackDuxo cardStackDuxo, int i, int i2, Composer composer, int i3) {
        CardStackComposable(bentoTheme4, modifier, z, cardStackDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreditCardTheme$lambda$9(Function2 function2, int i, Composer composer, int i2) {
        CreditCardTheme(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RegularCardThemeOverlay$lambda$7(boolean z, boolean z2, Function2 function2, int i, Composer composer, int i2) {
        RegularCardThemeOverlay(z, z2, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhdMarginCardTheme$lambda$10(Function2 function2, int i, Composer composer, int i2) {
        RhdMarginCardTheme(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardStackComposable(final BentoTheme4 direction, Modifier modifier, boolean z, CardStackDuxo cardStackDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        CardStackDuxo cardStackDuxo2;
        boolean z3;
        int i5;
        final CardStackDuxo cardStackDuxo3;
        Modifier modifier3;
        boolean isDay;
        final Navigator navigator;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z4;
        CardStackDuxo cardStackDuxo4;
        int i6;
        boolean zChanged;
        Object objRememberedValue2;
        final Modifier modifier4;
        final CardStackDuxo cardStackDuxo5;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Composer composerStartRestartGroup = composer.startRestartGroup(2117415272);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(direction.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        cardStackDuxo2 = cardStackDuxo;
                        int i8 = composerStartRestartGroup.changedInstance(cardStackDuxo2) ? 2048 : 1024;
                        i3 |= i8;
                    } else {
                        cardStackDuxo2 = cardStackDuxo;
                    }
                    i3 |= i8;
                } else {
                    cardStackDuxo2 = cardStackDuxo;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    z5 = z2;
                    cardStackDuxo5 = cardStackDuxo2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i4 == 0 ? false : z2;
                        if ((i2 & 8) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CardStackDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            cardStackDuxo3 = (CardStackDuxo) baseDuxo;
                            i5 = i3 & (-7169);
                        } else {
                            i5 = i3;
                            cardStackDuxo3 = cardStackDuxo2;
                        }
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        i5 = i3;
                        modifier3 = modifier2;
                        z3 = z2;
                        cardStackDuxo3 = cardStackDuxo2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2117415272, i5, -1, "com.robinhood.shared.cards.v3.CardStackComposable (CardStackComposable.kt:53)");
                    }
                    int i9 = i5;
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cardStackDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final SwipeableStackState<NotificationCardComposable4> swipeableStackState = CardStackComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSwipeableStackState();
                    boolean dismissedAll = swipeableStackState.getDismissedAll();
                    boolean zIsLoading = swipeableStackState.isLoading();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    isDay = bentoTheme.getColors(composerStartRestartGroup, i10).getIsDay();
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.cards.v3.CardStackComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CardStackComposable.CardStackComposable$lambda$2$lambda$1(navigator, context, (Uri) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final Function1 function1 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Modifier modifier6 = modifier3;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(566887987);
                    if (z3 || !zIsLoading) {
                        z4 = false;
                    } else {
                        z4 = false;
                        BoxKt.Box(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(200)), bentoTheme.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM(), 0.0f, 2, null), true, null, 2, null), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ExitTransition exitTransitionShrinkVertically$default = EnterExitTransitionKt.shrinkVertically$default(null, companion.getTop(), false, null, 13, null);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1041294394, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1

                        /* compiled from: CardStackComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1$1 */
                        static final class C373791 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ CardStackDuxo $duxo;
                            final /* synthetic */ Function1<Uri, Unit> $onCardClick;
                            final /* synthetic */ SwipeableStackState<NotificationCardComposable4> $swipeableStackState;
                            final /* synthetic */ SnapshotState4<CardStackViewState> $viewState$delegate;

                            /* JADX WARN: Multi-variable type inference failed */
                            C373791(SwipeableStackState<NotificationCardComposable4> swipeableStackState, CardStackDuxo cardStackDuxo, Function1<? super Uri, Unit> function1, SnapshotState4<CardStackViewState> snapshotState4) {
                                this.$swipeableStackState = swipeableStackState;
                                this.$duxo = cardStackDuxo;
                                this.$onCardClick = function1;
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
                                    ComposerKt.traceEventStart(1846165745, i, -1, "com.robinhood.shared.cards.v3.CardStackComposable.<anonymous>.<anonymous>.<anonymous> (CardStackComposable.kt:87)");
                                }
                                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                                composer.startReplaceGroup(343794917);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                boolean zIsLoading = this.$swipeableStackState.isLoading();
                                SwipeableStackState<NotificationCardComposable4> swipeableStackState = this.$swipeableStackState;
                                if (!zIsLoading) {
                                    modifierFillMaxWidth$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, swipeableStackState.getItems().size(), 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.NOTIFICATION_CARD_STACK, null, null, 6, null), null, 39, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                }
                                Modifier modifier = modifierFillMaxWidth$default;
                                composer.endReplaceGroup();
                                SwipeableStackState<NotificationCardComposable4> swipeableStackState2 = this.$swipeableStackState;
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$swipeableStackState) | composer.changedInstance(current);
                                final CardStackDuxo cardStackDuxo = this.$duxo;
                                final SwipeableStackState<NotificationCardComposable4> swipeableStackState3 = this.$swipeableStackState;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x025b: CONSTRUCTOR (r9v1 'objRememberedValue' java.lang.Object) = 
                                          (r7v4 'cardStackDuxo' com.robinhood.shared.cards.v3.CardStackDuxo A[DONT_INLINE])
                                          (r8v0 'swipeableStackState3' com.robinhood.shared.cards.compose.SwipeableStackState<com.robinhood.shared.cards.compose.NotificationCardState> A[DONT_INLINE])
                                          (r1v2 'current' com.robinhood.analytics.EventLogger A[DONT_INLINE])
                                         A[MD:(com.robinhood.shared.cards.v3.CardStackDuxo, com.robinhood.shared.cards.compose.SwipeableStackState, com.robinhood.analytics.EventLogger):void (m)] (LINE:102) call: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.shared.cards.v3.CardStackDuxo, com.robinhood.shared.cards.compose.SwipeableStackState, com.robinhood.analytics.EventLogger):void type: CONSTRUCTOR in method: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes26.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 25 more
                                        */
                                    /*
                                        Method dump skipped, instructions count: 654
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.cards.p371v3.CardStackComposable2.C373791.invoke(androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$2$lambda$1(CardStackDuxo cardStackDuxo, SwipeableStackState swipeableStackState, EventLogger eventLogger, NotificationCardComposable4 notificationCard) {
                                    Intrinsics.checkNotNullParameter(notificationCard, "notificationCard");
                                    if (!(notificationCard instanceof NotificationCardComposable4.End)) {
                                        if (!(notificationCard instanceof NotificationCardComposable4.Regular)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cardStackDuxo.dismissCardAndNotifyServer(notificationCard, swipeableStackState.getDismissedItems());
                                        EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, null, new Component(Component.ComponentType.NOTIFICATION_CARD, ((NotificationCardComposable4.Regular) notificationCard).getCard().getType(), null, 4, null), null, null, 27, null);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i11) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1041294394, i11, -1, "com.robinhood.shared.cards.v3.CardStackComposable.<anonymous>.<anonymous> (CardStackComposable.kt:86)");
                                }
                                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.HOME, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1846165745, true, new C373791(swipeableStackState, cardStackDuxo3, function1, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        cardStackDuxo4 = cardStackDuxo3;
                        Composer composer2 = composerStartRestartGroup;
                        AnimatedVisibilityKt.AnimatedVisibility(!dismissedAll, (Modifier) null, (EnterTransition) null, exitTransitionShrinkVertically$default, "cardStackAnimatedContentLabel", composableLambdaRememberComposableLambda, composer2, 224256, 6);
                        composerStartRestartGroup = composer2;
                        composerStartRestartGroup.endNode();
                        Boolean boolValueOf = Boolean.valueOf(isDay);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(cardStackDuxo4);
                        i6 = i9 & 14;
                        if (i6 == 4) {
                            z4 = true;
                        }
                        zChanged = zChangedInstance3 | z4 | composerStartRestartGroup.changed(isDay);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new CardStackComposable4(cardStackDuxo4, direction, isDay, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(direction, boolValueOf, (Function2) objRememberedValue2, composerStartRestartGroup, i6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier6;
                        cardStackDuxo5 = cardStackDuxo4;
                        z5 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.v3.CardStackComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CardStackComposable.CardStackComposable$lambda$5(direction, modifier4, z5, cardStackDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 384;
                z2 = z;
                if ((i & 3072) == 0) {
                }
                if ((i3 & 1171) == 1170) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 8) == 0) {
                        }
                        modifier3 = modifier5;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i92 = i5;
                        final SnapshotState4<CardStackViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cardStackDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        final SwipeableStackState<NotificationCardComposable4> swipeableStackState2 = CardStackComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getSwipeableStackState();
                        boolean dismissedAll2 = swipeableStackState2.getDismissedAll();
                        boolean zIsLoading2 = swipeableStackState2.isLoading();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i102 = BentoTheme.$stable;
                        isDay = bentoTheme2.getColors(composerStartRestartGroup, i102).getIsDay();
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.cards.v3.CardStackComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CardStackComposable.CardStackComposable$lambda$2$lambda$1(navigator, context, (Uri) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            final Function1<? super Uri, Unit> function12 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Modifier modifier62 = modifier3;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(566887987);
                                if (z3) {
                                    z4 = false;
                                    composerStartRestartGroup.endReplaceGroup();
                                    ExitTransition exitTransitionShrinkVertically$default2 = EnterExitTransitionKt.shrinkVertically$default(null, companion3.getTop(), false, null, 13, null);
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1041294394, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1

                                        /* compiled from: CardStackComposable.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        @SourceDebugExtension
                                        /* renamed from: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1$1 */
                                        static final class C373791 implements Function2<Composer, Integer, Unit> {
                                            final /* synthetic */ CardStackDuxo $duxo;
                                            final /* synthetic */ Function1<Uri, Unit> $onCardClick;
                                            final /* synthetic */ SwipeableStackState<NotificationCardComposable4> $swipeableStackState;
                                            final /* synthetic */ SnapshotState4<CardStackViewState> $viewState$delegate;

                                            /* JADX WARN: Multi-variable type inference failed */
                                            C373791(SwipeableStackState<NotificationCardComposable4> swipeableStackState, CardStackDuxo cardStackDuxo, Function1<? super Uri, Unit> function1, SnapshotState4<CardStackViewState> snapshotState4) {
                                                this.$swipeableStackState = swipeableStackState;
                                                this.$duxo = cardStackDuxo;
                                                this.$onCardClick = function1;
                                                this.$viewState$delegate = snapshotState4;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                                invoke(composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x025b: CONSTRUCTOR (r9v1 'objRememberedValue' java.lang.Object) = 
                                                  (r7v4 'cardStackDuxo' com.robinhood.shared.cards.v3.CardStackDuxo A[DONT_INLINE])
                                                  (r8v0 'swipeableStackState3' com.robinhood.shared.cards.compose.SwipeableStackState<com.robinhood.shared.cards.compose.NotificationCardState> A[DONT_INLINE])
                                                  (r1v2 'current' com.robinhood.analytics.EventLogger A[DONT_INLINE])
                                                 A[MD:(com.robinhood.shared.cards.v3.CardStackDuxo, com.robinhood.shared.cards.compose.SwipeableStackState, com.robinhood.analytics.EventLogger):void (m)] (LINE:102) call: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.shared.cards.v3.CardStackDuxo, com.robinhood.shared.cards.compose.SwipeableStackState, com.robinhood.analytics.EventLogger):void type: CONSTRUCTOR in method: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes26.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.cards.v3.CardStackComposableKt$CardStackComposable$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 20 more
                                                */
                                            public final void invoke(androidx.compose.runtime.Composer r226, int r227) {
                                                /*
                                                    Method dump skipped, instructions count: 654
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.cards.p371v3.CardStackComposable2.C373791.invoke(androidx.compose.runtime.Composer, int):void");
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$2$lambda$1(CardStackDuxo cardStackDuxo, SwipeableStackState swipeableStackState, EventLogger eventLogger, NotificationCardComposable4 notificationCard) {
                                                Intrinsics.checkNotNullParameter(notificationCard, "notificationCard");
                                                if (!(notificationCard instanceof NotificationCardComposable4.End)) {
                                                    if (!(notificationCard instanceof NotificationCardComposable4.Regular)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    cardStackDuxo.dismissCardAndNotifyServer(notificationCard, swipeableStackState.getDismissedItems());
                                                    EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, null, new Component(Component.ComponentType.NOTIFICATION_CARD, ((NotificationCardComposable4.Regular) notificationCard).getCard().getType(), null, 4, null), null, null, 27, null);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer22, Integer num) {
                                            invoke(animatedVisibilityScope, composer22, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer22, int i11) {
                                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1041294394, i11, -1, "com.robinhood.shared.cards.v3.CardStackComposable.<anonymous>.<anonymous> (CardStackComposable.kt:86)");
                                            }
                                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.HOME, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1846165745, true, new C373791(swipeableStackState2, cardStackDuxo3, function12, snapshotState4CollectAsStateWithLifecycle2), composer22, 54), composer22, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54);
                                    cardStackDuxo4 = cardStackDuxo3;
                                    Composer composer22 = composerStartRestartGroup;
                                    AnimatedVisibilityKt.AnimatedVisibility(!dismissedAll2, (Modifier) null, (EnterTransition) null, exitTransitionShrinkVertically$default2, "cardStackAnimatedContentLabel", composableLambdaRememberComposableLambda2, composer22, 224256, 6);
                                    composerStartRestartGroup = composer22;
                                    composerStartRestartGroup.endNode();
                                    Boolean boolValueOf2 = Boolean.valueOf(isDay);
                                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance32 = composerStartRestartGroup.changedInstance(cardStackDuxo4);
                                    i6 = i92 & 14;
                                    if (i6 == 4) {
                                    }
                                    zChanged = zChangedInstance32 | z4 | composerStartRestartGroup.changed(isDay);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged) {
                                        objRememberedValue2 = new CardStackComposable4(cardStackDuxo4, direction, isDay, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(direction, boolValueOf2, (Function2) objRememberedValue2, composerStartRestartGroup, i6);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier4 = modifier62;
                                        cardStackDuxo5 = cardStackDuxo4;
                                        z5 = z3;
                                    }
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i4 = i2 & 4;
            if (i4 != 0) {
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit CardStackComposable$lambda$2$lambda$1(Navigator navigator, Context context, Uri uri) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, Boolean.TRUE, null, false, null, 56, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardStackViewState CardStackComposable$lambda$0(SnapshotState4<CardStackViewState> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void BottomCardThemeOverlay(final boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
            int i2;
            Composer composer2;
            final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
            Composer composerStartRestartGroup = composer.startRestartGroup(-79512770);
            if ((i & 6) == 0) {
                i2 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
            }
            if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-79512770, i2, -1, "com.robinhood.shared.cards.v3.BottomCardThemeOverlay (CardStackComposable.kt:180)");
                }
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(2057172750);
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getCosmonautDark(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, function2, composerStartRestartGroup, (i2 << 24) & 1879048192, 510);
                    function22 = function2;
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(897649639);
                    function22.invoke(composer2, Integer.valueOf((i2 >> 3) & 14));
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.v3.CardStackComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CardStackComposable.BottomCardThemeOverlay$lambda$6(z, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RegularCardThemeOverlay(final boolean z, final boolean z2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
            int i2;
            Composer composerStartRestartGroup = composer.startRestartGroup(-1712491795);
            if ((i & 6) == 0) {
                i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1712491795, i2, -1, "com.robinhood.shared.cards.v3.RegularCardThemeOverlay (CardStackComposable.kt:198)");
                }
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-732134769);
                    CreditCardTheme(function2, composerStartRestartGroup, (i2 >> 6) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (z2) {
                    composerStartRestartGroup.startReplaceGroup(-732132750);
                    RhdMarginCardTheme(function2, composerStartRestartGroup, (i2 >> 6) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-732131018);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 6) & 14));
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.v3.CardStackComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CardStackComposable.RegularCardThemeOverlay$lambda$7(z, z2, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        public static final void CreditCardTheme(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
            int i2;
            Composer composer2;
            final Function2<? super Composer, ? super Integer, Unit> content = function2;
            Intrinsics.checkNotNullParameter(content, "content");
            Composer composerStartRestartGroup = composer.startRestartGroup(1533077400);
            if ((i & 6) == 0) {
                i2 = i | (composerStartRestartGroup.changedInstance(content) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1533077400, i2, -1, "com.robinhood.shared.cards.v3.CreditCardTheme (CardStackComposable.kt:211)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = BentoColors2.creditCardGoldColors();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                BentoColors bentoColors = (BentoColors) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoColors.m21368getAccent0d7_KjU(), bentoColors.m21425getFg0d7_KjU(), bentoColors.m21426getFg20d7_KjU(), 0L, bentoColors.m21371getBg0d7_KjU(), bentoColors.m21372getBg20d7_KjU(), 0L, 0L, 0L, function2, composer2, (i2 << 27) & 1879048192, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
                content = function2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.v3.CardStackComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CardStackComposable.CreditCardTheme$lambda$9(content, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        public static final void RhdMarginCardTheme(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
            int i2;
            Composer composer2;
            final Function2<? super Composer, ? super Integer, Unit> content = function2;
            Intrinsics.checkNotNullParameter(content, "content");
            Composer composerStartRestartGroup = composer.startRestartGroup(-380831297);
            if ((i & 6) == 0) {
                i2 = i | (composerStartRestartGroup.changedInstance(content) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-380831297, i2, -1, "com.robinhood.shared.cards.v3.RhdMarginCardTheme (CardStackComposable.kt:226)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composerStartRestartGroup, i3).getNova(), bentoTheme.getColors(composerStartRestartGroup, i3).getNova(), bentoTheme.getColors(composerStartRestartGroup, i3).getNova(), 0L, bentoTheme.getColors(composerStartRestartGroup, i3).getJoule(), bentoTheme.getColors(composerStartRestartGroup, i3).getJoule(), 0L, 0L, 0L, function2, composer2, (i2 << 27) & 1879048192, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
                content = function2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.v3.CardStackComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CardStackComposable.RhdMarginCardTheme$lambda$10(content, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }
