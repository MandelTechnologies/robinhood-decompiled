package com.robinhood.android.crypto.p094ui.detail.cards;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCard;
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCardComposable;
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCardDuxo;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.newsfeed.breakingnews.p198ui.BreakingNewsCard;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.shared.iac.herocards.p383ui.IacHeroCardComposable;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoDetailCardComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\"\u0010\u0010\u000e\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0010\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0011\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0012\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0013\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, m3636d2 = {"CryptoDetailCardComposable", "", "args", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo$Args;", "onLoaded", "Lkotlin/Function0;", "onDismissStart", "direction", "Lcom/robinhood/compose/bento/theme/Direction;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo;", "(Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo$Args;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/compose/bento/theme/Direction;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDuxo;Landroidx/compose/runtime/Composer;II)V", CryptoDetailCardComposable.BREAKING_NEWS_TEST_TAG, "", CryptoDetailCardComposable.IAC_HERO_CARD_TEST_TAG, CryptoDetailCardComposable.LEARN_AND_EARN_CARD_TEST_TAG, CryptoDetailCardComposable.ADVANCED_ALERT_CARD_TEST_TAG, CryptoDetailCardComposable.CARD_TEST_TAG, "feature-crypto_externalDebug", "viewState", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoDetailCardComposable {
    public static final String ADVANCED_ALERT_CARD_TEST_TAG = "ADVANCED_ALERT_CARD_TEST_TAG";
    public static final String BREAKING_NEWS_TEST_TAG = "BREAKING_NEWS_TEST_TAG";
    public static final String CARD_TEST_TAG = "CARD_TEST_TAG";
    public static final String IAC_HERO_CARD_TEST_TAG = "IAC_HERO_CARD_TEST_TAG";
    public static final String LEARN_AND_EARN_CARD_TEST_TAG = "LEARN_AND_EARN_CARD_TEST_TAG";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailCardComposable$lambda$3(CryptoDetailCardDuxo.Args args, Function0 function0, Function0 function02, BentoTheme4 bentoTheme4, Modifier modifier, CryptoDetailCardDuxo cryptoDetailCardDuxo, int i, int i2, Composer composer, int i3) {
        CryptoDetailCardComposable(args, function0, function02, bentoTheme4, modifier, cryptoDetailCardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoDetailCardComposable(final CryptoDetailCardDuxo.Args args, final Function0<Unit> onLoaded, final Function0<Unit> onDismissStart, final BentoTheme4 bentoTheme4, Modifier modifier, CryptoDetailCardDuxo cryptoDetailCardDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoDetailCardDuxo cryptoDetailCardDuxo2;
        Composer composer2;
        Modifier modifier3;
        int i4;
        CryptoDetailCardDuxo cryptoDetailCardDuxo3;
        CryptoDetailCard card;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableTransitionState mutableTransitionState;
        boolean zChanged;
        Object objRememberedValue2;
        MutableTransitionState mutableTransitionState2;
        CryptoDetailCardDuxo cryptoDetailCardDuxo4;
        final Modifier modifier4;
        final CryptoDetailCardDuxo cryptoDetailCardDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(onLoaded, "onLoaded");
        Intrinsics.checkNotNullParameter(onDismissStart, "onDismissStart");
        Composer composerStartRestartGroup = composer.startRestartGroup(-254058858);
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
            i3 |= composerStartRestartGroup.changedInstance(onLoaded) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissStart) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(bentoTheme4 == null ? -1 : bentoTheme4.ordinal()) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    cryptoDetailCardDuxo2 = cryptoDetailCardDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoDetailCardDuxo2) ? 131072 : 65536;
                    i3 |= i6;
                } else {
                    cryptoDetailCardDuxo2 = cryptoDetailCardDuxo;
                }
                i3 |= i6;
            } else {
                cryptoDetailCardDuxo2 = cryptoDetailCardDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoDetailCardDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                        modifier3 = modifier5;
                        i4 = i3 & (-458753);
                        cryptoDetailCardDuxo3 = (CryptoDetailCardDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier5;
                        i4 = i3;
                        cryptoDetailCardDuxo3 = cryptoDetailCardDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    cryptoDetailCardDuxo3 = cryptoDetailCardDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-254058858, i4, -1, "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposable (CryptoDetailCardComposable.kt:42)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoDetailCardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                card = CryptoDetailCardComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCard();
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                composer2.endReplaceGroup();
                String id = card == null ? card.getId() : null;
                composer2.startReplaceGroup(-1224400529);
                zChanged = ((i4 & 112) != 32) | composer2.changed(card) | composer2.changedInstance(mutableTransitionState) | composer2.changedInstance(cryptoDetailCardDuxo3);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    CryptoDetailCardDuxo cryptoDetailCardDuxo6 = cryptoDetailCardDuxo3;
                    mutableTransitionState2 = mutableTransitionState;
                    CryptoDetailCardComposable2 cryptoDetailCardComposable2 = new CryptoDetailCardComposable2(card, mutableTransitionState2, onLoaded, cryptoDetailCardDuxo6, null);
                    cryptoDetailCardDuxo4 = cryptoDetailCardDuxo6;
                    composer2.updateRememberedValue(cryptoDetailCardComposable2);
                    objRememberedValue2 = cryptoDetailCardComposable2;
                } else {
                    cryptoDetailCardDuxo4 = cryptoDetailCardDuxo3;
                    mutableTransitionState2 = mutableTransitionState;
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(id, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                MutableTransitionState mutableTransitionState3 = mutableTransitionState2;
                Modifier modifier6 = modifier3;
                AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState3, TestTag3.testTag(Modifier.INSTANCE, CARD_TEST_TAG), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambda3.rememberComposableLambda(-985946434, true, new C133132(card, modifier6, bentoTheme4, navigator, context, mutableTransitionState3, onDismissStart), composer2, 54), composer2, MutableTransitionState.$stable | 200112, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
                cryptoDetailCardDuxo5 = cryptoDetailCardDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                cryptoDetailCardDuxo5 = cryptoDetailCardDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoDetailCardComposable.CryptoDetailCardComposable$lambda$3(args, onLoaded, onDismissStart, bentoTheme4, modifier4, cryptoDetailCardDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoDetailCardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                Navigator navigator2 = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                Context context2 = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                card = CryptoDetailCardComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getCard();
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                composer2.endReplaceGroup();
                if (card == null) {
                }
                composer2.startReplaceGroup(-1224400529);
                zChanged = ((i4 & 112) != 32) | composer2.changed(card) | composer2.changedInstance(mutableTransitionState) | composer2.changedInstance(cryptoDetailCardDuxo3);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    CryptoDetailCardDuxo cryptoDetailCardDuxo62 = cryptoDetailCardDuxo3;
                    mutableTransitionState2 = mutableTransitionState;
                    CryptoDetailCardComposable2 cryptoDetailCardComposable22 = new CryptoDetailCardComposable2(card, mutableTransitionState2, onLoaded, cryptoDetailCardDuxo62, null);
                    cryptoDetailCardDuxo4 = cryptoDetailCardDuxo62;
                    composer2.updateRememberedValue(cryptoDetailCardComposable22);
                    objRememberedValue2 = cryptoDetailCardComposable22;
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(id, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                    MutableTransitionState mutableTransitionState32 = mutableTransitionState2;
                    Modifier modifier62 = modifier3;
                    AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState32, TestTag3.testTag(Modifier.INSTANCE, CARD_TEST_TAG), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambda3.rememberComposableLambda(-985946434, true, new C133132(card, modifier62, bentoTheme4, navigator2, context2, mutableTransitionState32, onDismissStart), composer2, 54), composer2, MutableTransitionState.$stable | 200112, 16);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier62;
                    cryptoDetailCardDuxo5 = cryptoDetailCardDuxo4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoDetailCardComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$2 */
    static final class C133132 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ CryptoDetailCard $card;
        final /* synthetic */ MutableTransitionState<Boolean> $cardVisibleState;
        final /* synthetic */ Context $context;
        final /* synthetic */ BentoTheme4 $direction;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function0<Unit> $onDismissStart;

        C133132(CryptoDetailCard cryptoDetailCard, Modifier modifier, BentoTheme4 bentoTheme4, Navigator navigator, Context context, MutableTransitionState<Boolean> mutableTransitionState, Function0<Unit> function0) {
            this.$card = cryptoDetailCard;
            this.$modifier = modifier;
            this.$direction = bentoTheme4;
            this.$navigator = navigator;
            this.$context = context;
            this.$cardVisibleState = mutableTransitionState;
            this.$onDismissStart = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-985946434, i, -1, "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposable.<anonymous> (CryptoDetailCardComposable.kt:75)");
            }
            CryptoDetailCard cryptoDetailCard = this.$card;
            if (cryptoDetailCard instanceof CryptoDetailCard.BreakingNews) {
                composer.startReplaceGroup(951217408);
                BreakingNewsCard.BreakingNewsCard(((CryptoDetailCard.BreakingNews) this.$card).getBreakingNews(), TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(this.$modifier, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), CryptoDetailCardComposable.BREAKING_NEWS_TEST_TAG), composer, 0, 0);
                composer.endReplaceGroup();
            } else if (cryptoDetailCard instanceof CryptoDetailCard.IacHero) {
                composer.startReplaceGroup(1693262860);
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, this.$direction, ComposableLambda3.rememberComposableLambda(-1985255035, true, new AnonymousClass1(this.$modifier, this.$card, this.$cardVisibleState, this.$onDismissStart), composer, 54), composer, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                composer.endReplaceGroup();
            } else if (cryptoDetailCard instanceof CryptoDetailCard.LearnAndEarn) {
                composer.startReplaceGroup(952051339);
                Modifier modifierTestTag = TestTag3.testTag(this.$modifier, CryptoDetailCardComposable.LEARN_AND_EARN_CARD_TEST_TAG);
                String bannerText = ((CryptoDetailCard.LearnAndEarn) this.$card).getBannerText();
                Integer imageResource = ((CryptoDetailCard.LearnAndEarn) this.$card).getImageResource();
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$card);
                final Navigator navigator = this.$navigator;
                final Context context = this.$context;
                final CryptoDetailCard cryptoDetailCard2 = this.$card;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoDetailCardComposable.C133132.invoke$lambda$1$lambda$0(navigator, context, cryptoDetailCard2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(this.$cardVisibleState) | composer.changed(this.$onDismissStart);
                final MutableTransitionState<Boolean> mutableTransitionState = this.$cardVisibleState;
                final Function0<Unit> function02 = this.$onDismissStart;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoDetailCardComposable.C133132.invoke$lambda$3$lambda$2(mutableTransitionState, function02);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                CryptoLearnAndEarnPromoCardComposable.CryptoLearnAndEarnPromoCardComposable(bannerText, imageResource, function0, (Function0) objRememberedValue2, modifierTestTag, composer, 0, 0);
                composer.endReplaceGroup();
            } else if (cryptoDetailCard instanceof CryptoDetailCard.AdvancedAlert) {
                composer.startReplaceGroup(953105866);
                Modifier modifierTestTag2 = TestTag3.testTag(this.$modifier, CryptoDetailCardComposable.ADVANCED_ALERT_CARD_TEST_TAG);
                UiCurrencyPair currencyPair = ((CryptoDetailCard.AdvancedAlert) this.$card).getCurrencyPair();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer.changedInstance(this.$cardVisibleState) | composer.changed(this.$onDismissStart);
                final MutableTransitionState<Boolean> mutableTransitionState2 = this.$cardVisibleState;
                final Function0<Unit> function03 = this.$onDismissStart;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoDetailCardComposable.C133132.invoke$lambda$5$lambda$4(mutableTransitionState2, function03);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                CryptoAdvancedAlertCardComposable.CryptoAdvancedAlertCardComposable(currencyPair, (Function0) objRememberedValue3, modifierTestTag2, null, composer, 0, 8);
                composer.endReplaceGroup();
            } else {
                if (cryptoDetailCard != null) {
                    composer.startReplaceGroup(1693252021);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(953460258);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: CryptoDetailCardComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$2$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ CryptoDetailCard $card;
            final /* synthetic */ MutableTransitionState<Boolean> $cardVisibleState;
            final /* synthetic */ Modifier $modifier;
            final /* synthetic */ Function0<Unit> $onDismissStart;

            AnonymousClass1(Modifier modifier, CryptoDetailCard cryptoDetailCard, MutableTransitionState<Boolean> mutableTransitionState, Function0<Unit> function0) {
                this.$modifier = modifier;
                this.$card = cryptoDetailCard;
                this.$cardVisibleState = mutableTransitionState;
                this.$onDismissStart = function0;
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
                    ComposerKt.traceEventStart(-1985255035, i, -1, "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposable.<anonymous>.<anonymous> (CryptoDetailCardComposable.kt:86)");
                }
                Modifier modifierTestTag = TestTag3.testTag(this.$modifier, CryptoDetailCardComposable.IAC_HERO_CARD_TEST_TAG);
                IacHeroCard iacHeroCard = ((CryptoDetailCard.IacHero) this.$card).getIacHeroCard();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(this.$cardVisibleState) | composer.changed(this.$onDismissStart);
                final MutableTransitionState<Boolean> mutableTransitionState = this.$cardVisibleState;
                final Function0<Unit> function0 = this.$onDismissStart;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoDetailCardComposable.C133132.AnonymousClass1.invoke$lambda$1$lambda$0(mutableTransitionState, function0, (IacHeroCard) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                IacHeroCardComposable.IacHeroCardComposable(iacHeroCard, modifierTestTag, null, null, null, (Function1) objRememberedValue, null, composer, 0, 92);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(MutableTransitionState mutableTransitionState, Function0 function0, IacHeroCard iacHeroCard) {
                Intrinsics.checkNotNullParameter(iacHeroCard, "<unused var>");
                mutableTransitionState.setTargetState(Boolean.FALSE);
                function0.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, CryptoDetailCard cryptoDetailCard) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new EducationLessonFragmentKeys2(((CryptoDetailCard.LearnAndEarn) cryptoDetailCard).getLessonId(), "CryptoDetailFragment"), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, null, NavigationType.PRESENT, 28, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(MutableTransitionState mutableTransitionState, Function0 function0) {
            mutableTransitionState.setTargetState(Boolean.FALSE);
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(MutableTransitionState mutableTransitionState, Function0 function0) {
            mutableTransitionState.setTargetState(Boolean.FALSE);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    private static final CryptoDetailCardViewState CryptoDetailCardComposable$lambda$0(SnapshotState4<CryptoDetailCardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
