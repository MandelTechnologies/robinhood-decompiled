package com.robinhood.shared.crypto.staking.staking.onboarding;

import android.app.Activity;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
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
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import androidx.view.compose.LocalActivity;
import coil.compose.SingletonAsyncImagePainter;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.p375ui.primer.PrimerHeaderAssetContainer4;
import com.robinhood.shared.crypto.staking.staking.C37760R;
import com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable7;
import com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo;
import com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingEvent;
import com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingViewState;
import com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubComposable4;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
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
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.HttpUrl;

/* compiled from: CryptoStakingOnboardingComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a7\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0018\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0019\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u001b\u001a+\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0003¢\u0006\u0002\u0010\u001d\u001a\u0015\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u001f\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006 ²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\u0012\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u0004\u0018\u00010%X\u008a\u0084\u0002"}, m3636d2 = {"TestTagLoadingReviewContentTag", "", "TestTagErrorContentTag", CryptoStakingHubComposable4.TestTagContentTag, "CryptoStakingOnboardingComposable", "", "args", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDuxo$InitArgs;", "onContinue", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDuxo;", "(Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDuxo$InitArgs;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDuxo;Landroidx/compose/runtime/Composer;II)V", "TopBar", "(Landroidx/compose/runtime/Composer;I)V", "Body", "viewState", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState;", "onboardingPage", "Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;", "(Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState;Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ErrorContent", "LoadingReviewContent", "PreviewLoadingReviewContent", "MainContent", "(Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBar", "(Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingViewState;Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HeaderImage", "(Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;Landroidx/compose/runtime/Composer;I)V", "feature-crypto-staking_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingEvent;", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingOnboardingComposable7 {
    public static final String TestTagContentTag = "TestTagErrorContentTag";
    public static final String TestTagErrorContentTag = "TestTagErrorContentTag";
    public static final String TestTagLoadingReviewContentTag = "TestTagLoadingReviewContentTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Body$lambda$8(CryptoStakingOnboardingViewState cryptoStakingOnboardingViewState, StakingConfig.OnboardingPage onboardingPage, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Body(cryptoStakingOnboardingViewState, onboardingPage, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$20(CryptoStakingOnboardingViewState cryptoStakingOnboardingViewState, StakingConfig.OnboardingPage onboardingPage, Function0 function0, int i, Composer composer, int i2) {
        BottomBar(cryptoStakingOnboardingViewState, onboardingPage, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoStakingOnboardingComposable$lambda$6(CryptoStakingOnboardingDuxo.InitArgs initArgs, Function0 function0, Modifier modifier, CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo, int i, int i2, Composer composer, int i3) {
        CryptoStakingOnboardingComposable(initArgs, function0, modifier, cryptoStakingOnboardingDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorContent$lambda$10(int i, Composer composer, int i2) {
        ErrorContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderImage$lambda$21(StakingConfig.OnboardingPage onboardingPage, int i, Composer composer, int i2) {
        HeaderImage(onboardingPage, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingReviewContent$lambda$11(int i, Composer composer, int i2) {
        LoadingReviewContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$15(StakingConfig.OnboardingPage onboardingPage, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(onboardingPage, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingReviewContent$lambda$12(int i, Composer composer, int i2) {
        PreviewLoadingReviewContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBar$lambda$7(int i, Composer composer, int i2) {
        TopBar(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoStakingOnboardingViewState CryptoStakingOnboardingComposable$lambda$0(SnapshotState4<? extends CryptoStakingOnboardingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoStakingOnboardingEvent> CryptoStakingOnboardingComposable$lambda$1(SnapshotState4<Event<CryptoStakingOnboardingEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoStakingOnboardingComposable(final CryptoStakingOnboardingDuxo.InitArgs args, final Function0<Unit> onContinue, Modifier modifier, CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo2;
        final Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        int i4;
        final CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo3;
        Event<CryptoStakingOnboardingEvent> event;
        final Event<CryptoStakingOnboardingEvent> eventCryptoStakingOnboardingComposable$lambda$1;
        final Event<CryptoStakingOnboardingEvent> eventCryptoStakingOnboardingComposable$lambda$12;
        final CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo4;
        final Modifier modifier4;
        EventConsumer<CryptoStakingOnboardingEvent> eventConsumerInvoke;
        EventConsumer<CryptoStakingOnboardingEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(2119398463);
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
            i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoStakingOnboardingDuxo2 = cryptoStakingOnboardingDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoStakingOnboardingDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    cryptoStakingOnboardingDuxo2 = cryptoStakingOnboardingDuxo;
                }
                i3 |= i6;
            } else {
                cryptoStakingOnboardingDuxo2 = cryptoStakingOnboardingDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoStakingOnboardingDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$duxo$1.1
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
                        CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo5 = (CryptoStakingOnboardingDuxo) baseDuxo;
                        i4 = i3 & (-7169);
                        cryptoStakingOnboardingDuxo3 = cryptoStakingOnboardingDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2119398463, i4, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable (CryptoStakingOnboardingComposable.kt:87)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingOnboardingDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    final StateFlow<Event<CryptoStakingOnboardingEvent>> eventFlow = cryptoStakingOnboardingDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoStakingOnboardingComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoStakingOnboardingEvent) {
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
                    Event<CryptoStakingOnboardingEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event != null ? event.getData() : null) instanceof CryptoStakingOnboardingEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    final Activity activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    eventCryptoStakingOnboardingComposable$lambda$1 = CryptoStakingOnboardingComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoStakingOnboardingComposable$lambda$1 != null) {
                        if ((eventCryptoStakingOnboardingComposable$lambda$1.getData() instanceof CryptoStakingOnboardingEvent.Continue) && (eventConsumerInvoke2 = eventCryptoStakingOnboardingComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventCryptoStakingOnboardingComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m24963invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m24963invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onContinue.invoke();
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    eventCryptoStakingOnboardingComposable$lambda$12 = CryptoStakingOnboardingComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoStakingOnboardingComposable$lambda$12 != null) {
                        if ((eventCryptoStakingOnboardingComposable$lambda$12.getData() instanceof CryptoStakingOnboardingEvent.Error) && (eventConsumerInvoke = eventCryptoStakingOnboardingComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventCryptoStakingOnboardingComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                                    m24964invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m24964invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CryptoStakingOnboardingEvent.Error error = (CryptoStakingOnboardingEvent.Error) eventCryptoStakingOnboardingComposable$lambda$12.getData();
                                    Activity activity2 = activity;
                                    if (activity2 != null) {
                                        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity2, error.getThrowable(), false, false, 0, null, 60, null);
                                    }
                                }
                            });
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    Screen.Name name = Screen.Name.CRYPTO_STAKING_INTRO;
                    String string2 = args.getCurrencyPairId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Screen screen = new Screen(name, null, string2, null, 10, null);
                    String entryPointIdentifier = args.getEntryPointIdentifier();
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, entryPointIdentifier != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1786824790, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt.CryptoStakingOnboardingComposable.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1786824790, i7, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous> (CryptoStakingOnboardingComposable.kt:108)");
                            }
                            final Modifier modifier5 = modifier3;
                            final CryptoStakingOnboardingDuxo.InitArgs initArgs = args;
                            final CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo6 = cryptoStakingOnboardingDuxo3;
                            final SnapshotState4<CryptoStakingOnboardingViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1626109505, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt.CryptoStakingOnboardingComposable.4.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1626109505, i8, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous>.<anonymous> (CryptoStakingOnboardingComposable.kt:109)");
                                    }
                                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null));
                                    Function2<Composer, Integer, Unit> lambda$1943167867$feature_crypto_staking_externalDebug = CryptoStakingOnboardingComposable.INSTANCE.getLambda$1943167867$feature_crypto_staking_externalDebug();
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1113518874, true, new C506881(initArgs, cryptoStakingOnboardingDuxo6, snapshotState4), composer3, 54);
                                    final CryptoStakingOnboardingDuxo.InitArgs initArgs2 = initArgs;
                                    final SnapshotState4<CryptoStakingOnboardingViewState> snapshotState42 = snapshotState4;
                                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, lambda$1943167867$feature_crypto_staking_externalDebug, composableLambdaRememberComposableLambda, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1830862192, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt.CryptoStakingOnboardingComposable.4.1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                            invoke(paddingValues, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PaddingValues contentPadding, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                            if ((i9 & 6) == 0) {
                                                i9 |= composer4.changed(contentPadding) ? 4 : 2;
                                            }
                                            if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1830862192, i9, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingOnboardingComposable.kt:126)");
                                            }
                                            CryptoStakingOnboardingComposable7.Body(CryptoStakingOnboardingComposable7.CryptoStakingOnboardingComposable$lambda$0(snapshotState42), initArgs2.getOnboardingPage(), PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer4, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 805306800, 504);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: CryptoStakingOnboardingComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$4$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C506881 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ CryptoStakingOnboardingDuxo.InitArgs $args;
                                    final /* synthetic */ CryptoStakingOnboardingDuxo $duxo;
                                    final /* synthetic */ SnapshotState4<CryptoStakingOnboardingViewState> $viewState$delegate;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    C506881(CryptoStakingOnboardingDuxo.InitArgs initArgs, CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo, SnapshotState4<? extends CryptoStakingOnboardingViewState> snapshotState4) {
                                        this.$args = initArgs;
                                        this.$duxo = cryptoStakingOnboardingDuxo;
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
                                            ComposerKt.traceEventStart(1113518874, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingOnboardingComposable.kt:117)");
                                        }
                                        CryptoStakingOnboardingViewState cryptoStakingOnboardingViewStateCryptoStakingOnboardingComposable$lambda$0 = CryptoStakingOnboardingComposable7.CryptoStakingOnboardingComposable$lambda$0(this.$viewState$delegate);
                                        StakingConfig.OnboardingPage onboardingPage = this.$args.getOnboardingPage();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                        final CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo = this.$duxo;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$4$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoStakingOnboardingComposable7.C378484.AnonymousClass1.C506881.invoke$lambda$1$lambda$0(cryptoStakingOnboardingDuxo);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        CryptoStakingOnboardingComposable7.BottomBar(cryptoStakingOnboardingViewStateCryptoStakingOnboardingComposable$lambda$0, onboardingPage, (Function0) objRememberedValue, composer, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo) {
                                        cryptoStakingOnboardingDuxo.acceptStakingEnrollment();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    cryptoStakingOnboardingDuxo4 = cryptoStakingOnboardingDuxo3;
                    modifier4 = modifier5;
                }
                i4 = i3;
                cryptoStakingOnboardingDuxo3 = cryptoStakingOnboardingDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends CryptoStakingOnboardingViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingOnboardingDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow2 = cryptoStakingOnboardingDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoStakingOnboardingComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoStakingOnboardingEvent) {
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
                Event<CryptoStakingOnboardingEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event != null ? event.getData() : null) instanceof CryptoStakingOnboardingEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                final Activity activity2 = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                eventCryptoStakingOnboardingComposable$lambda$1 = CryptoStakingOnboardingComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoStakingOnboardingComposable$lambda$1 != null) {
                }
                eventCryptoStakingOnboardingComposable$lambda$12 = CryptoStakingOnboardingComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoStakingOnboardingComposable$lambda$12 != null) {
                }
                Screen.Name name2 = Screen.Name.CRYPTO_STAKING_INTRO;
                String string22 = args.getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
                Screen screen2 = new Screen(name2, null, string22, null, 10, null);
                String entryPointIdentifier2 = args.getEntryPointIdentifier();
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen2, null, entryPointIdentifier2 != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1786824790, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt.CryptoStakingOnboardingComposable.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1786824790, i7, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous> (CryptoStakingOnboardingComposable.kt:108)");
                        }
                        final Modifier modifier52 = modifier3;
                        final CryptoStakingOnboardingDuxo.InitArgs initArgs = args;
                        final CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo6 = cryptoStakingOnboardingDuxo3;
                        final SnapshotState4<? extends CryptoStakingOnboardingViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1626109505, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt.CryptoStakingOnboardingComposable.4.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1626109505, i8, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous>.<anonymous> (CryptoStakingOnboardingComposable.kt:109)");
                                }
                                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(ModifiersKt.logScreenTransitions$default(modifier52, null, 1, null));
                                Function2<Composer, Integer, Unit> lambda$1943167867$feature_crypto_staking_externalDebug = CryptoStakingOnboardingComposable.INSTANCE.getLambda$1943167867$feature_crypto_staking_externalDebug();
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1113518874, true, new C506881(initArgs, cryptoStakingOnboardingDuxo6, snapshotState4), composer3, 54);
                                final CryptoStakingOnboardingDuxo.InitArgs initArgs2 = initArgs;
                                final SnapshotState4<? extends CryptoStakingOnboardingViewState> snapshotState42 = snapshotState4;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, lambda$1943167867$feature_crypto_staking_externalDebug, composableLambdaRememberComposableLambda, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1830862192, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt.CryptoStakingOnboardingComposable.4.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                        invoke(paddingValues, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues contentPadding, Composer composer4, int i9) {
                                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                        if ((i9 & 6) == 0) {
                                            i9 |= composer4.changed(contentPadding) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1830862192, i9, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingOnboardingComposable.kt:126)");
                                        }
                                        CryptoStakingOnboardingComposable7.Body(CryptoStakingOnboardingComposable7.CryptoStakingOnboardingComposable$lambda$0(snapshotState42), initArgs2.getOnboardingPage(), PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 805306800, 504);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoStakingOnboardingComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$4$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C506881 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ CryptoStakingOnboardingDuxo.InitArgs $args;
                                final /* synthetic */ CryptoStakingOnboardingDuxo $duxo;
                                final /* synthetic */ SnapshotState4<CryptoStakingOnboardingViewState> $viewState$delegate;

                                /* JADX WARN: Multi-variable type inference failed */
                                C506881(CryptoStakingOnboardingDuxo.InitArgs initArgs, CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo, SnapshotState4<? extends CryptoStakingOnboardingViewState> snapshotState4) {
                                    this.$args = initArgs;
                                    this.$duxo = cryptoStakingOnboardingDuxo;
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
                                        ComposerKt.traceEventStart(1113518874, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingOnboardingComposable.kt:117)");
                                    }
                                    CryptoStakingOnboardingViewState cryptoStakingOnboardingViewStateCryptoStakingOnboardingComposable$lambda$0 = CryptoStakingOnboardingComposable7.CryptoStakingOnboardingComposable$lambda$0(this.$viewState$delegate);
                                    StakingConfig.OnboardingPage onboardingPage = this.$args.getOnboardingPage();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                    final CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo = this.$duxo;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$4$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoStakingOnboardingComposable7.C378484.AnonymousClass1.C506881.invoke$lambda$1$lambda$0(cryptoStakingOnboardingDuxo);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    CryptoStakingOnboardingComposable7.BottomBar(cryptoStakingOnboardingViewStateCryptoStakingOnboardingComposable$lambda$0, onboardingPage, (Function0) objRememberedValue, composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo) {
                                    cryptoStakingOnboardingDuxo.acceptStakingEnrollment();
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                cryptoStakingOnboardingDuxo4 = cryptoStakingOnboardingDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoStakingOnboardingDuxo4 = cryptoStakingOnboardingDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingOnboardingComposable7.CryptoStakingOnboardingComposable$lambda$6(args, onContinue, modifier4, cryptoStakingOnboardingDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if ((i & 1) == 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                    i4 = i3;
                    cryptoStakingOnboardingDuxo3 = cryptoStakingOnboardingDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends CryptoStakingOnboardingViewState> snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingOnboardingDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow22 = cryptoStakingOnboardingDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoStakingOnboardingComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoStakingOnboardingEvent) {
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
                        Object objCollect = eventFlow22.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<CryptoStakingOnboardingEvent> value22 = eventFlow22.getValue();
                event = value22;
                if (!((event != null ? event.getData() : null) instanceof CryptoStakingOnboardingEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state22, coroutineContextImpl622, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                final Activity activity22 = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                eventCryptoStakingOnboardingComposable$lambda$1 = CryptoStakingOnboardingComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventCryptoStakingOnboardingComposable$lambda$1 != null) {
                }
                eventCryptoStakingOnboardingComposable$lambda$12 = CryptoStakingOnboardingComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventCryptoStakingOnboardingComposable$lambda$12 != null) {
                }
                Screen.Name name22 = Screen.Name.CRYPTO_STAKING_INTRO;
                String string222 = args.getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string222, "toString(...)");
                Screen screen22 = new Screen(name22, null, string222, null, 10, null);
                String entryPointIdentifier22 = args.getEntryPointIdentifier();
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen22, null, entryPointIdentifier22 != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier22, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1786824790, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt.CryptoStakingOnboardingComposable.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1786824790, i7, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous> (CryptoStakingOnboardingComposable.kt:108)");
                        }
                        final Modifier modifier522 = modifier3;
                        final CryptoStakingOnboardingDuxo.InitArgs initArgs = args;
                        final CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo6 = cryptoStakingOnboardingDuxo3;
                        final SnapshotState4<? extends CryptoStakingOnboardingViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle32;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1626109505, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt.CryptoStakingOnboardingComposable.4.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1626109505, i8, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous>.<anonymous> (CryptoStakingOnboardingComposable.kt:109)");
                                }
                                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(ModifiersKt.logScreenTransitions$default(modifier522, null, 1, null));
                                Function2<Composer, Integer, Unit> lambda$1943167867$feature_crypto_staking_externalDebug = CryptoStakingOnboardingComposable.INSTANCE.getLambda$1943167867$feature_crypto_staking_externalDebug();
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1113518874, true, new C506881(initArgs, cryptoStakingOnboardingDuxo6, snapshotState4), composer3, 54);
                                final CryptoStakingOnboardingDuxo.InitArgs initArgs2 = initArgs;
                                final SnapshotState4<? extends CryptoStakingOnboardingViewState> snapshotState42 = snapshotState4;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, lambda$1943167867$feature_crypto_staking_externalDebug, composableLambdaRememberComposableLambda, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1830862192, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt.CryptoStakingOnboardingComposable.4.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                        invoke(paddingValues, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues contentPadding, Composer composer4, int i9) {
                                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                        if ((i9 & 6) == 0) {
                                            i9 |= composer4.changed(contentPadding) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1830862192, i9, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingOnboardingComposable.kt:126)");
                                        }
                                        CryptoStakingOnboardingComposable7.Body(CryptoStakingOnboardingComposable7.CryptoStakingOnboardingComposable$lambda$0(snapshotState42), initArgs2.getOnboardingPage(), PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 805306800, 504);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoStakingOnboardingComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$4$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C506881 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ CryptoStakingOnboardingDuxo.InitArgs $args;
                                final /* synthetic */ CryptoStakingOnboardingDuxo $duxo;
                                final /* synthetic */ SnapshotState4<CryptoStakingOnboardingViewState> $viewState$delegate;

                                /* JADX WARN: Multi-variable type inference failed */
                                C506881(CryptoStakingOnboardingDuxo.InitArgs initArgs, CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo, SnapshotState4<? extends CryptoStakingOnboardingViewState> snapshotState4) {
                                    this.$args = initArgs;
                                    this.$duxo = cryptoStakingOnboardingDuxo;
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
                                        ComposerKt.traceEventStart(1113518874, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingOnboardingComposable.kt:117)");
                                    }
                                    CryptoStakingOnboardingViewState cryptoStakingOnboardingViewStateCryptoStakingOnboardingComposable$lambda$0 = CryptoStakingOnboardingComposable7.CryptoStakingOnboardingComposable$lambda$0(this.$viewState$delegate);
                                    StakingConfig.OnboardingPage onboardingPage = this.$args.getOnboardingPage();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                    final CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo = this.$duxo;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$CryptoStakingOnboardingComposable$4$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoStakingOnboardingComposable7.C378484.AnonymousClass1.C506881.invoke$lambda$1$lambda$0(cryptoStakingOnboardingDuxo);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    CryptoStakingOnboardingComposable7.BottomBar(cryptoStakingOnboardingViewStateCryptoStakingOnboardingComposable$lambda$0, onboardingPage, (Function0) objRememberedValue, composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(CryptoStakingOnboardingDuxo cryptoStakingOnboardingDuxo) {
                                    cryptoStakingOnboardingDuxo.acceptStakingEnrollment();
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                cryptoStakingOnboardingDuxo4 = cryptoStakingOnboardingDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TopBar(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2078759772);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2078759772, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.TopBar (CryptoStakingOnboardingComposable.kt:137)");
            }
            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(CryptoStakingOnboardingComposable.INSTANCE.m24957getLambda$461985655$feature_crypto_staking_externalDebug(), null, ComposableLambda3.rememberComposableLambda(799499485, true, new C378501(current != null ? current.getOnBackPressedDispatcher() : null), composerStartRestartGroup, 54), null, null, true, false, null, null, 0L, null, composerStartRestartGroup, 1769862, 0, 1946);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingOnboardingComposable7.TopBar$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoStakingOnboardingComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$TopBar$1 */
    static final class C378501 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
        final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;

        C378501(OnBackPressedDispatcher onBackPressedDispatcher) {
            this.$backPressedDispatcher = onBackPressedDispatcher;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(799499485, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.TopBar.<anonymous> (CryptoStakingOnboardingComposable.kt:144)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$backPressedDispatcher);
            final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$TopBar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoStakingOnboardingComposable7.C378501.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Body(final CryptoStakingOnboardingViewState cryptoStakingOnboardingViewState, final StakingConfig.OnboardingPage onboardingPage, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(775641120);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(cryptoStakingOnboardingViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onboardingPage) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(775641120, i3, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.Body (CryptoStakingOnboardingComposable.kt:156)");
            }
            if (Intrinsics.areEqual(cryptoStakingOnboardingViewState, CryptoStakingOnboardingViewState.ErrorState.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(-1933185298);
                ErrorContent(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.areEqual(cryptoStakingOnboardingViewState, CryptoStakingOnboardingViewState.LoadingState.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(-1933182986);
                LoadingReviewContent(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(cryptoStakingOnboardingViewState instanceof CryptoStakingOnboardingViewState.SuccessState)) {
                    composerStartRestartGroup.startReplaceGroup(-1933187345);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1933180252);
                MainContent(onboardingPage, modifier, composerStartRestartGroup, (i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingOnboardingComposable7.Body$lambda$8(cryptoStakingOnboardingViewState, onboardingPage, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ErrorContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1321803049);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1321803049, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.ErrorContent (CryptoStakingOnboardingComposable.kt:168)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(WindowInsetsPadding_androidKt.statusBarsPadding(companion), "TestTagErrorContentTag"), null, 0, null, null, null, null, false, composerStartRestartGroup, 12582912, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingOnboardingComposable7.ErrorContent$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingReviewContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2031493675);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2031493675, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.LoadingReviewContent (CryptoStakingOnboardingComposable.kt:184)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(Modifier.INSTANCE, "TestTagLoadingReviewContentTag"), null, CryptoStakingOnboardingComposable.INSTANCE.getLambda$759777125$feature_crypto_staking_externalDebug(), composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingOnboardingComposable7.LoadingReviewContent$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLoadingReviewContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1919957385);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1919957385, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.PreviewLoadingReviewContent (CryptoStakingOnboardingComposable.kt:194)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoStakingOnboardingComposable.INSTANCE.getLambda$903894225$feature_crypto_staking_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingOnboardingComposable7.PreviewLoadingReviewContent$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(final StakingConfig.OnboardingPage onboardingPage, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companion;
        String inLineDisclosure;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1473093501);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(onboardingPage) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473093501, i3, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.MainContent (CryptoStakingOnboardingComposable.kt:206)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(TestTag3.testTag(modifier3, "TestTagErrorContentTag"), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1205274754);
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    HeaderImage(onboardingPage, composerStartRestartGroup, i3 & 14);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(onboardingPage.getTitle(), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, null, FontWeight.INSTANCE.getMedium(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleLarge(), composerStartRestartGroup, 24576, 0, 8172);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1205260932);
                if (StringsKt.isBlank(onboardingPage.getDescription())) {
                    companion = companion3;
                    BentoText2.m20747BentoText38GnDrw(onboardingPage.getDescription(), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    companion = companion3;
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1205248908);
                for (StakingConfig.OnboardingPage.Content content : extensions2.toImmutableList(onboardingPage.getContent())) {
                    String title = content.getTitle();
                    String description = content.getDescription();
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(content.getIcon());
                    if (serverToBentoAssetMapper2FromServerValue == null) {
                        serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.SPARKLE_BULLET_24;
                    }
                    Composer composer2 = composerStartRestartGroup;
                    BentoValuePropRow3.BentoValuePropRow(title, description, new BentoValuePropRow2.Icon(serverToBentoAssetMapper2FromServerValue, null, 2, null), BentoValuePropRow.Top, (Modifier) null, composer2, (BentoValuePropRow2.Icon.$stable << 6) | 3072, 16);
                    composerStartRestartGroup = composer2;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                inLineDisclosure = onboardingPage.getInLineDisclosure();
                composerStartRestartGroup.startReplaceGroup(-1205231026);
                if (inLineDisclosure != null) {
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1);
                    BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                    int i7 = BentoMarkdownText.$stable;
                    Composer composer3 = composerStartRestartGroup;
                    BentoMarkdownText2.BentoMarkdownText(inLineDisclosure, modifierM21623defaultHorizontalPaddingrAjV9yQ, MarkdownStyle.m16260copyR0sFphs$default(bentoMarkdownText.getStyle(composerStartRestartGroup, i7), null, null, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextS(), null, MarkdownStyle.Link.m16274copyek8zF_U$default(bentoMarkdownText.getStyle(composerStartRestartGroup, i7).getLink(), bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), false, false, 6, null), bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), null, 0, null, 1839, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 24);
                    composerStartRestartGroup = composer3;
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingOnboardingComposable7.MainContent$lambda$15(onboardingPage, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(TestTag3.testTag(modifier3, "TestTagErrorContentTag"), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1205274754);
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(onboardingPage.getTitle(), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion32, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, null, FontWeight.INSTANCE.getMedium(), null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleLarge(), composerStartRestartGroup, 24576, 0, 8172);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1205260932);
                if (StringsKt.isBlank(onboardingPage.getDescription())) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1205248908);
                while (r0.hasNext()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                inLineDisclosure = onboardingPage.getInLineDisclosure();
                composerStartRestartGroup.startReplaceGroup(-1205231026);
                if (inLineDisclosure != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomBar(final CryptoStakingOnboardingViewState cryptoStakingOnboardingViewState, final StakingConfig.OnboardingPage onboardingPage, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1348487207);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(cryptoStakingOnboardingViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onboardingPage) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1348487207, i2, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.BottomBar (CryptoStakingOnboardingComposable.kt:265)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final HttpUrl httpUrl = HttpUrl.INSTANCE.get(StringResources_androidKt.stringResource(C37760R.string.staking_learn_more_url, composerStartRestartGroup, 0));
            if (Intrinsics.areEqual(cryptoStakingOnboardingViewState, CryptoStakingOnboardingViewState.ErrorState.INSTANCE) || Intrinsics.areEqual(cryptoStakingOnboardingViewState, CryptoStakingOnboardingViewState.LoadingState.INSTANCE)) {
                composer2 = composerStartRestartGroup;
            } else {
                if (!(cryptoStakingOnboardingViewState instanceof CryptoStakingOnboardingViewState.SuccessState)) {
                    throw new NoWhenBranchMatchedException();
                }
                final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                String strNullIfEmpty = com.robinhood.utils.extensions.StringsKt.nullIfEmpty(onboardingPage.getStickyDisclosure());
                CryptoStakingOnboardingViewState.SuccessState successState = (CryptoStakingOnboardingViewState.SuccessState) cryptoStakingOnboardingViewState;
                StringResource primaryButtonText = successState.getPrimaryButtonText();
                int i3 = StringResource.$stable;
                String textAsString = StringResources6.getTextAsString(primaryButtonText, composerStartRestartGroup, i3);
                boolean zIsUpdatingAgreement = successState.isUpdatingAgreement();
                String textAsString2 = StringResources6.getTextAsString(successState.getSecondaryButtonText(), composerStartRestartGroup, i3);
                boolean z = !successState.isUpdatingAgreement();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i2 & 896) == 256);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoStakingOnboardingComposable7.BottomBar$lambda$17$lambda$16(current, userInteractionEventDescriptor, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function02 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(httpUrl);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoStakingOnboardingComposable7.BottomBar$lambda$19$lambda$18(current, userInteractionEventDescriptor, context, httpUrl);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, strNullIfEmpty, null, false, null, null, function02, textAsString, zIsUpdatingAgreement, null, false, (Function0) objRememberedValue2, textAsString2, false, null, z, composer2, 0, 0, 26172);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingOnboardingComposable7.BottomBar$lambda$20(cryptoStakingOnboardingViewState, onboardingPage, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$17$lambda$16(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "stake", null, 4, null), null, 47, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$19$lambda$18(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, android.content.Context context, HttpUrl httpUrl) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_LEARN_MORE, null, 4, null), null, 47, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        WebUtils webUtils = WebUtils.INSTANCE;
        WebUtils.viewUrl$default(webUtils, context, webUtils.toLocalizedUrl(httpUrl, context), 0, 4, null);
        return Unit.INSTANCE;
    }

    private static final void HeaderImage(final StakingConfig.OnboardingPage onboardingPage, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1454932206);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onboardingPage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1454932206, i2, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.HeaderImage (CryptoStakingOnboardingComposable.kt:318)");
            }
            PrimerHeaderAssetContainer4.PrimerHeaderAssetContainer(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, ComposableLambda3.rememberComposableLambda(1935011131, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt.HeaderImage.1
                private static final LottieComposition invoke$lambda$0(LottieCompositionResult lottieCompositionResult) {
                    return lottieCompositionResult.getValue();
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope PrimerHeaderAssetContainer, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(PrimerHeaderAssetContainer, "$this$PrimerHeaderAssetContainer");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1935011131, i3, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.HeaderImage.<anonymous> (CryptoStakingOnboardingComposable.kt:322)");
                    }
                    StakingConfig.OnboardingPage.ThemedLottieUrl headerLottieUrl = onboardingPage.getHeaderLottieUrl();
                    if (headerLottieUrl != null) {
                        composer2.startReplaceGroup(-1134337734);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        LottieAnimation2.LottieAnimation(invoke$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(bentoTheme.getColors(composer2, i4).getIsDay() ? headerLottieUrl.getLight() : headerLottieUrl.getDark())), null, null, null, null, null, composer2, 0, 62)), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)), 0.0f, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 1, null), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer2, 0, 0, 0, 2097148);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1133748486);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(bentoTheme2.getColors(composer2, i5).getIsDay() ? onboardingPage.getHeaderUrlLight() : onboardingPage.getHeaderUrl(), null, null, null, 0, null, composer2, 0, 62), StringResources_androidKt.stringResource(C37760R.string.staking_header_image_description, composer2, 0), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)), bentoTheme2.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 0, 120);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingOnboardingComposable7.HeaderImage$lambda$21(onboardingPage, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
