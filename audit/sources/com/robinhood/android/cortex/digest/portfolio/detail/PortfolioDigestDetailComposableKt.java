package com.robinhood.android.cortex.digest.portfolio.detail;

import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
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
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.common.sources.CortexArticleSources3;
import com.robinhood.android.cortex.digest.portfolio.C12105R;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations2;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations3;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations4;
import com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest3;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigestDetail;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.SheetDestinationWithArgs;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CortexPortfolioDigestContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.squareup.wire.AnyMessage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
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
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.HttpUrl;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.GenericAction;
import rh_server_driven_ui.p531v1.GenericActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: PortfolioDigestDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\"²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestDetailDest$Args;", "args", "Lcom/robinhood/android/cortex/digest/portfolio/detail/PortfolioDigestDetailDuxo;", "duxo", "", "PortfolioDigestDetailComposable", "(Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestDetailDest$Args;Lcom/robinhood/android/cortex/digest/portfolio/detail/PortfolioDigestDetailDuxo;Landroidx/compose/runtime/Composer;II)V", "j$/time/Instant", "updatedAt", "nextUpdatedAt", "Landroidx/compose/ui/Modifier;", "modifier", "PortfolioDigestTimestamp", "(Lj$/time/Instant;Lj$/time/Instant;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PortfolioDigestAnimation", "(Landroidx/compose/runtime/Composer;I)V", "Lrh_server_driven_ui/v1/ActionDto;", "actionDto", "Lrh_server_driven_ui/v1/GenericActionDto;", "parseAction", "(Lrh_server_driven_ui/v1/ActionDto;)Lrh_server_driven_ui/v1/GenericActionDto;", "", "TEST_TAG_PORTFOLIO_DIGEST_DETAIL", "Ljava/lang/String;", "TAG_PORTFOLIO_DIGEST_NEXT_TIMESTAMP", "TAG_LOTTIE_ANIMATION", "Lcom/robinhood/android/cortex/digest/portfolio/detail/PortfolioDigestDetailViewState;", "viewState", "", "displayPopup", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PortfolioDigestDetailComposableKt {
    public static final String TAG_LOTTIE_ANIMATION = "lottie_animation";
    public static final String TAG_PORTFOLIO_DIGEST_NEXT_TIMESTAMP = "portfolio_digest_next_timestamp";
    public static final String TEST_TAG_PORTFOLIO_DIGEST_DETAIL = "portfolio_digest_detail_list";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestAnimation$lambda$16(int i, Composer composer, int i2) {
        PortfolioDigestAnimation(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestDetailComposable$lambda$1(PortfolioDigestDestinations4.Args args, PortfolioDigestDetailDuxo portfolioDigestDetailDuxo, int i, int i2, Composer composer, int i3) {
        PortfolioDigestDetailComposable(args, portfolioDigestDetailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestTimestamp$lambda$11(Instant instant, Instant instant2, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        PortfolioDigestTimestamp(instant, instant2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioDigestDetailComposable(final PortfolioDigestDestinations4.Args args, PortfolioDigestDetailDuxo portfolioDigestDetailDuxo, Composer composer, final int i, final int i2) {
        int i3;
        PortfolioDigestDetailDuxo portfolioDigestDetailDuxo2;
        Composer composer2;
        final PortfolioDigestDetailDuxo portfolioDigestDetailDuxo3;
        Composer composer3;
        String source;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(2082783132);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                portfolioDigestDetailDuxo2 = portfolioDigestDetailDuxo;
                int i4 = composerStartRestartGroup.changedInstance(portfolioDigestDetailDuxo2) ? 32 : 16;
                i3 |= i4;
            } else {
                portfolioDigestDetailDuxo2 = portfolioDigestDetailDuxo;
            }
            i3 |= i4;
        } else {
            portfolioDigestDetailDuxo2 = portfolioDigestDetailDuxo;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            portfolioDigestDetailDuxo3 = portfolioDigestDetailDuxo2;
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PortfolioDigestDetailDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                    composer2.endReplaceGroup();
                    i5 &= -113;
                    portfolioDigestDetailDuxo3 = (PortfolioDigestDetailDuxo) baseDuxo;
                } else {
                    composer2 = composerStartRestartGroup;
                    portfolioDigestDetailDuxo3 = portfolioDigestDetailDuxo2;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2082783132, i5, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable (PortfolioDigestDetailComposable.kt:83)");
                }
                Composer composer4 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                final PortfolioDigestDetail detail = PortfolioDigestDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDigest().getDetail();
                final ImmutableList<ArticleSource> articleSources = PortfolioDigestDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getArticleSources();
                Screen screen = new Screen(Screen.Name.PORTFOLIO_DIGEST_DETAIL, null, null, null, 14, null);
                String accountNumber = args.getDigest().getAccountNumber();
                String digestId = args.getDigest().getDigestId();
                source = args.getSource();
                if (source == null) {
                    source = "";
                }
                Object[] objArr = 0 == true ? 1 : 0;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new Context(0, 0, 0, null, 0 == true ? 1 : 0, null, objArr, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CortexPortfolioDigestContext(accountNumber, digestId, source, null, 8, null), null, null, -1, -1, -1, -1, -1, -1, 14335, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-114393711, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable.1
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
                            ComposerKt.traceEventStart(-114393711, i6, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous> (PortfolioDigestDetailComposable.kt:103)");
                        }
                        BentoTheme4 bentoTheme4 = PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDigest().getDetail().isPositive() ? BentoTheme4.POSITIVE : BentoTheme4.NEGATIVE;
                        final PortfolioDigestDetail portfolioDigestDetail = detail;
                        final SnapshotState4<PortfolioDigestDetailViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        final PortfolioDigestDestinations4.Args args2 = args;
                        final ImmutableList<ArticleSource> immutableList = articleSources;
                        BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(284490795, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i7) {
                                if ((i7 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(284490795, i7, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:110)");
                                }
                                final PortfolioDigestDetail portfolioDigestDetail2 = portfolioDigestDetail;
                                final SnapshotState4<PortfolioDigestDetailViewState> snapshotState42 = snapshotState4;
                                final PortfolioDigestDestinations4.Args args3 = args2;
                                final ImmutableList<ArticleSource> immutableList2 = immutableList;
                                GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(2084545085, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                        invoke(composer7, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer7, int i8) {
                                        if ((i8 & 3) == 2 && composer7.getSkipping()) {
                                            composer7.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2084545085, i8, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:111)");
                                        }
                                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                                        final PortfolioDigestDetail portfolioDigestDetail3 = portfolioDigestDetail2;
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1781381383, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable.1.1.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                                                invoke(composer8, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer8, int i9) {
                                                if ((i9 & 3) == 2 && composer8.getSkipping()) {
                                                    composer8.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1781381383, i9, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:114)");
                                                }
                                                AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                                final PortfolioDigestDetail portfolioDigestDetail4 = portfolioDigestDetail3;
                                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(88433260, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable.1.1.1.1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer9, Integer num) {
                                                        invoke(composer9, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer9, int i10) {
                                                        if ((i10 & 3) == 2 && composer9.getSkipping()) {
                                                            composer9.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(88433260, i10, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:116)");
                                                        }
                                                        BentoText2.m20747BentoText38GnDrw(portfolioDigestDetail4.getNavigationTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer9, 0, 0, 16382);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer8, 54), null, ComposableSingletons$PortfolioDigestDetailComposableKt.INSTANCE.m1870x3c819979(), null, null, true, false, appBarType, null, 0L, null, composer8, 12779910, 0, 1882);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer7, 54);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, composableLambdaRememberComposableLambda, null, null, null, 0, bentoTheme.getColors(composer7, i9).m21371getBg0d7_KjU(), bentoTheme.getColors(composer7, i9).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-294684594, true, new AnonymousClass2(portfolioDigestDetail2, snapshotState42, args3, immutableList2), composer7, 54), composer7, 805306416, 316);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: PortfolioDigestDetailComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2, reason: invalid class name */
                                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                        final /* synthetic */ PortfolioDigestDestinations4.Args $args;
                                        final /* synthetic */ ImmutableList<ArticleSource> $articleSources;
                                        final /* synthetic */ PortfolioDigestDetail $detail;
                                        final /* synthetic */ SnapshotState4<PortfolioDigestDetailViewState> $viewState$delegate;

                                        AnonymousClass2(PortfolioDigestDetail portfolioDigestDetail, SnapshotState4<PortfolioDigestDetailViewState> snapshotState4, PortfolioDigestDestinations4.Args args, ImmutableList<ArticleSource> immutableList) {
                                            this.$detail = portfolioDigestDetail;
                                            this.$viewState$delegate = snapshotState4;
                                            this.$args = args;
                                            this.$articleSources = immutableList;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                            invoke(paddingValues, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PaddingValues it, Composer composer, int i) {
                                            int i2;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            if ((i & 6) == 0) {
                                                i2 = i | (composer.changed(it) ? 4 : 2);
                                            } else {
                                                i2 = i;
                                            }
                                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-294684594, i2, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:136)");
                                            }
                                            final android.content.Context context = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                            final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
                                            final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, it), PortfolioDigestDetailComposableKt.TEST_TAG_PORTFOLIO_DIGEST_DETAIL);
                                            composer.startReplaceGroup(-1224400529);
                                            boolean zChangedInstance = composer.changedInstance(this.$detail) | composer.changed(this.$viewState$delegate) | composer.changed(lifecycleAwareNavigator) | composer.changedInstance(context) | composer.changedInstance(view) | composer.changedInstance(this.$args) | composer.changedInstance(this.$articleSources);
                                            final PortfolioDigestDetail portfolioDigestDetail = this.$detail;
                                            final ImmutableList<ArticleSource> immutableList = this.$articleSources;
                                            final SnapshotState4<PortfolioDigestDetailViewState> snapshotState4 = this.$viewState$delegate;
                                            final PortfolioDigestDestinations4.Args args = this.$args;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return PortfolioDigestDetailComposableKt.C121261.AnonymousClass1.C497131.AnonymousClass2.invoke$lambda$6$lambda$5(portfolioDigestDetail, immutableList, snapshotState4, lifecycleAwareNavigator, context, view, args, (LazyListScope) obj);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            LazyDslKt.LazyColumn(modifierTestTag, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$6$lambda$5(final PortfolioDigestDetail portfolioDigestDetail, ImmutableList immutableList, final SnapshotState4 snapshotState4, final LifecycleAwareNavigator lifecycleAwareNavigator, final android.content.Context context, View view, final PortfolioDigestDestinations4.Args args, LazyListScope LazyColumn) {
                                            LazyListScope lazyListScope;
                                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                            ImmutableList<UIComponentDto> preHeaderContent = portfolioDigestDetail.getPreHeaderContent();
                                            if (preHeaderContent != null) {
                                                SduiColumnsIdl.sduiItems(LazyColumn, preHeaderContent, C12127xa236cfa2.INSTANCE, GenericActionDto.class, null, null, HorizontalPadding.Default);
                                            }
                                            PortfolioDigest3 headerContent = portfolioDigestDetail.getHeaderContent();
                                            if (Intrinsics.areEqual(headerContent, PortfolioDigest3.LottieAnimation.INSTANCE)) {
                                                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$PortfolioDigestDetailComposableKt.INSTANCE.m1871xdbfa4472(), 3, null);
                                            } else if (headerContent != null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(900412003, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$1$1$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(900412003, i, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:164)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                    int i2 = BentoTheme.$stable;
                                                    PortfolioDigestDetailComposableKt.PortfolioDigestTimestamp(PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable$lambda$0(snapshotState4).getDigest().getUpdatedAt(), PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable$lambda$0(snapshotState4).getDigest().getNextUpdatedAt(), com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            ImmutableList<UIComponentDto> titleContent = portfolioDigestDetail.getTitleContent();
                                            if (titleContent != null) {
                                                SduiColumnsIdl.sduiItems(LazyColumn, titleContent, C12129xa236d724.INSTANCE, GenericActionDto.class, null, null, HorizontalPadding.Default);
                                            }
                                            SduiColumnsIdl.sduiItems(LazyColumn, portfolioDigestDetail.getContent(), C12130x8a288c58.INSTANCE, GenericActionDto.class, null, null, HorizontalPadding.Default);
                                            DigestFeedback feedback = PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable$lambda$0(snapshotState4).getFeedback();
                                            if (feedback != null) {
                                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1121868052, true, new C12131xa236dea6(lifecycleAwareNavigator, context, view, feedback, args)), 3, null);
                                            }
                                            if (!immutableList.isEmpty() || portfolioDigestDetail.getDisclosureMarkdown().length() > 0) {
                                                lazyListScope = LazyColumn;
                                                LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$PortfolioDigestDetailComposableKt.INSTANCE.m1869x3b74985f(), 3, null);
                                            } else {
                                                lazyListScope = LazyColumn;
                                            }
                                            if (!immutableList.isEmpty()) {
                                                CortexArticleSources3.articleSourceItemHeader(LazyColumn);
                                                CortexArticleSources3.articleSourceItems(LazyColumn, immutableList, 3, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return PortfolioDigestDetailComposableKt.C121261.AnonymousClass1.C497131.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$3(lifecycleAwareNavigator, args, context, (ArticleSource) obj);
                                                    }
                                                }, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return PortfolioDigestDetailComposableKt.C121261.AnonymousClass1.C497131.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$4(lifecycleAwareNavigator, args, (ImmutableList) obj);
                                                    }
                                                });
                                            }
                                            if (portfolioDigestDetail.getDisclosureMarkdown().length() > 0) {
                                                LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(184392694, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$1$1$8
                                                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                                            composer.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(184392694, i, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:287)");
                                                        }
                                                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
                                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                        int i2 = BentoTheme.$stable;
                                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 5, null);
                                                        PortfolioDigestDetail portfolioDigestDetail2 = portfolioDigestDetail;
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                                        Column6 column6 = Column6.INSTANCE;
                                                        BentoMarkdownText2.BentoMarkdownText(portfolioDigestDetail2.getDisclosureMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), 0, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
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
                                            }
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$6$lambda$5$lambda$3(LifecycleAwareNavigator lifecycleAwareNavigator, PortfolioDigestDestinations4.Args args, android.content.Context context, ArticleSource articleSource) throws Resources.NotFoundException {
                                            Intrinsics.checkNotNullParameter(articleSource, "articleSource");
                                            HttpUrl url = articleSource.getUrl();
                                            if (url == null) {
                                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (SheetDestinationWithArgs) PortfolioDigestDestinations3.INSTANCE, (Parcelable) new PortfolioDigestDestinations3.Args(articleSource, Screen.Name.PORTFOLIO_DIGEST_DETAIL, args.getDigest().getAccountNumber(), args.getDigest().getDigestId(), args.getSource()), false, (Function1) null, 12, (Object) null);
                                            } else {
                                                WebUtils.viewUrl$default(WebUtils.INSTANCE, context, url, 0, 4, null);
                                            }
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$6$lambda$5$lambda$4(LifecycleAwareNavigator lifecycleAwareNavigator, PortfolioDigestDestinations4.Args args, ImmutableList articleSources) throws Resources.NotFoundException {
                                            Intrinsics.checkNotNullParameter(articleSources, "articleSources");
                                            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, PortfolioDigestDestinations2.INSTANCE, new PortfolioDigestDestinations2.Args(args.getDigest().getAccountNumber(), args.getDigest().getDigestId(), args.getSource()), null, null, false, null, 60, null);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer6, 54), composer6, 24576, 15);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), composer5, 48);
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
                    portfolioDigestDetailDuxo3 = portfolioDigestDetailDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                final SnapshotState4<PortfolioDigestDetailViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer3 = composer42;
                final PortfolioDigestDetail detail2 = PortfolioDigestDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getDigest().getDetail();
                final ImmutableList<ArticleSource> articleSources2 = PortfolioDigestDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getArticleSources();
                Screen screen2 = new Screen(Screen.Name.PORTFOLIO_DIGEST_DETAIL, null, null, null, 14, null);
                String accountNumber2 = args.getDigest().getAccountNumber();
                String digestId2 = args.getDigest().getDigestId();
                source = args.getSource();
                if (source == null) {
                }
                Object[] objArr2 = 0 == true ? 1 : 0;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen2, null, new Context(0, 0, 0, null, 0 == true ? 1 : 0, null, objArr2, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CortexPortfolioDigestContext(accountNumber2, digestId2, source, null, 8, null), null, null, -1, -1, -1, -1, -1, -1, 14335, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-114393711, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable.1
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
                            ComposerKt.traceEventStart(-114393711, i6, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous> (PortfolioDigestDetailComposable.kt:103)");
                        }
                        BentoTheme4 bentoTheme4 = PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getDigest().getDetail().isPositive() ? BentoTheme4.POSITIVE : BentoTheme4.NEGATIVE;
                        final PortfolioDigestDetail portfolioDigestDetail = detail2;
                        final SnapshotState4<PortfolioDigestDetailViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        final PortfolioDigestDestinations4.Args args2 = args;
                        final ImmutableList<ArticleSource> immutableList = articleSources2;
                        BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(284490795, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i7) {
                                if ((i7 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(284490795, i7, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:110)");
                                }
                                final PortfolioDigestDetail portfolioDigestDetail2 = portfolioDigestDetail;
                                final SnapshotState4<PortfolioDigestDetailViewState> snapshotState42 = snapshotState4;
                                final PortfolioDigestDestinations4.Args args3 = args2;
                                final ImmutableList<ArticleSource> immutableList2 = immutableList;
                                GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(2084545085, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                        invoke(composer7, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer7, int i8) {
                                        if ((i8 & 3) == 2 && composer7.getSkipping()) {
                                            composer7.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2084545085, i8, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:111)");
                                        }
                                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                                        final PortfolioDigestDetail portfolioDigestDetail3 = portfolioDigestDetail2;
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1781381383, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable.1.1.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                                                invoke(composer8, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer8, int i9) {
                                                if ((i9 & 3) == 2 && composer8.getSkipping()) {
                                                    composer8.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1781381383, i9, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:114)");
                                                }
                                                AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                                final PortfolioDigestDetail portfolioDigestDetail4 = portfolioDigestDetail3;
                                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(88433260, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable.1.1.1.1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer9, Integer num) {
                                                        invoke(composer9, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer9, int i10) {
                                                        if ((i10 & 3) == 2 && composer9.getSkipping()) {
                                                            composer9.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(88433260, i10, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:116)");
                                                        }
                                                        BentoText2.m20747BentoText38GnDrw(portfolioDigestDetail4.getNavigationTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer9, 0, 0, 16382);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer8, 54), null, ComposableSingletons$PortfolioDigestDetailComposableKt.INSTANCE.m1870x3c819979(), null, null, true, false, appBarType, null, 0L, null, composer8, 12779910, 0, 1882);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer7, 54);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, composableLambdaRememberComposableLambda, null, null, null, 0, bentoTheme.getColors(composer7, i9).m21371getBg0d7_KjU(), bentoTheme.getColors(composer7, i9).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-294684594, true, new AnonymousClass2(portfolioDigestDetail2, snapshotState42, args3, immutableList2), composer7, 54), composer7, 805306416, 316);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: PortfolioDigestDetailComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2, reason: invalid class name */
                                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                        final /* synthetic */ PortfolioDigestDestinations4.Args $args;
                                        final /* synthetic */ ImmutableList<ArticleSource> $articleSources;
                                        final /* synthetic */ PortfolioDigestDetail $detail;
                                        final /* synthetic */ SnapshotState4<PortfolioDigestDetailViewState> $viewState$delegate;

                                        AnonymousClass2(PortfolioDigestDetail portfolioDigestDetail, SnapshotState4<PortfolioDigestDetailViewState> snapshotState4, PortfolioDigestDestinations4.Args args, ImmutableList<ArticleSource> immutableList) {
                                            this.$detail = portfolioDigestDetail;
                                            this.$viewState$delegate = snapshotState4;
                                            this.$args = args;
                                            this.$articleSources = immutableList;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                            invoke(paddingValues, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PaddingValues it, Composer composer, int i) {
                                            int i2;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            if ((i & 6) == 0) {
                                                i2 = i | (composer.changed(it) ? 4 : 2);
                                            } else {
                                                i2 = i;
                                            }
                                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-294684594, i2, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:136)");
                                            }
                                            final android.content.Context context = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                            final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
                                            final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, it), PortfolioDigestDetailComposableKt.TEST_TAG_PORTFOLIO_DIGEST_DETAIL);
                                            composer.startReplaceGroup(-1224400529);
                                            boolean zChangedInstance = composer.changedInstance(this.$detail) | composer.changed(this.$viewState$delegate) | composer.changed(lifecycleAwareNavigator) | composer.changedInstance(context) | composer.changedInstance(view) | composer.changedInstance(this.$args) | composer.changedInstance(this.$articleSources);
                                            final PortfolioDigestDetail portfolioDigestDetail = this.$detail;
                                            final ImmutableList immutableList = this.$articleSources;
                                            final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                            final PortfolioDigestDestinations4.Args args = this.$args;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return PortfolioDigestDetailComposableKt.C121261.AnonymousClass1.C497131.AnonymousClass2.invoke$lambda$6$lambda$5(portfolioDigestDetail, immutableList, snapshotState4, lifecycleAwareNavigator, context, view, args, (LazyListScope) obj);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            LazyDslKt.LazyColumn(modifierTestTag, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$6$lambda$5(final PortfolioDigestDetail portfolioDigestDetail, ImmutableList immutableList, final SnapshotState4<PortfolioDigestDetailViewState> snapshotState4, final LifecycleAwareNavigator lifecycleAwareNavigator, final android.content.Context context, View view, final PortfolioDigestDestinations4.Args args, LazyListScope LazyColumn) {
                                            LazyListScope lazyListScope;
                                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                            ImmutableList<UIComponentDto> preHeaderContent = portfolioDigestDetail.getPreHeaderContent();
                                            if (preHeaderContent != null) {
                                                SduiColumnsIdl.sduiItems(LazyColumn, preHeaderContent, C12127xa236cfa2.INSTANCE, GenericActionDto.class, null, null, HorizontalPadding.Default);
                                            }
                                            PortfolioDigest3 headerContent = portfolioDigestDetail.getHeaderContent();
                                            if (Intrinsics.areEqual(headerContent, PortfolioDigest3.LottieAnimation.INSTANCE)) {
                                                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$PortfolioDigestDetailComposableKt.INSTANCE.m1871xdbfa4472(), 3, null);
                                            } else if (headerContent != null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(900412003, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$1$1$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(900412003, i, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:164)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                    int i2 = BentoTheme.$stable;
                                                    PortfolioDigestDetailComposableKt.PortfolioDigestTimestamp(PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable$lambda$0(snapshotState4).getDigest().getUpdatedAt(), PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable$lambda$0(snapshotState4).getDigest().getNextUpdatedAt(), com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            ImmutableList<UIComponentDto> titleContent = portfolioDigestDetail.getTitleContent();
                                            if (titleContent != null) {
                                                SduiColumnsIdl.sduiItems(LazyColumn, titleContent, C12129xa236d724.INSTANCE, GenericActionDto.class, null, null, HorizontalPadding.Default);
                                            }
                                            SduiColumnsIdl.sduiItems(LazyColumn, portfolioDigestDetail.getContent(), C12130x8a288c58.INSTANCE, GenericActionDto.class, null, null, HorizontalPadding.Default);
                                            DigestFeedback feedback = PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable$lambda$0(snapshotState4).getFeedback();
                                            if (feedback != null) {
                                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1121868052, true, new C12131xa236dea6(lifecycleAwareNavigator, context, view, feedback, args)), 3, null);
                                            }
                                            if (!immutableList.isEmpty() || portfolioDigestDetail.getDisclosureMarkdown().length() > 0) {
                                                lazyListScope = LazyColumn;
                                                LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$PortfolioDigestDetailComposableKt.INSTANCE.m1869x3b74985f(), 3, null);
                                            } else {
                                                lazyListScope = LazyColumn;
                                            }
                                            if (!immutableList.isEmpty()) {
                                                CortexArticleSources3.articleSourceItemHeader(LazyColumn);
                                                CortexArticleSources3.articleSourceItems(LazyColumn, immutableList, 3, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return PortfolioDigestDetailComposableKt.C121261.AnonymousClass1.C497131.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$3(lifecycleAwareNavigator, args, context, (ArticleSource) obj);
                                                    }
                                                }, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return PortfolioDigestDetailComposableKt.C121261.AnonymousClass1.C497131.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$4(lifecycleAwareNavigator, args, (ImmutableList) obj);
                                                    }
                                                });
                                            }
                                            if (portfolioDigestDetail.getDisclosureMarkdown().length() > 0) {
                                                LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(184392694, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$1$1$8
                                                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                                            composer.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(184392694, i, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:287)");
                                                        }
                                                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
                                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                        int i2 = BentoTheme.$stable;
                                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 5, null);
                                                        PortfolioDigestDetail portfolioDigestDetail2 = portfolioDigestDetail;
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                                        Column6 column6 = Column6.INSTANCE;
                                                        BentoMarkdownText2.BentoMarkdownText(portfolioDigestDetail2.getDisclosureMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), 0, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
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
                                            }
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$6$lambda$5$lambda$3(LifecycleAwareNavigator lifecycleAwareNavigator, PortfolioDigestDestinations4.Args args, android.content.Context context, ArticleSource articleSource) throws Resources.NotFoundException {
                                            Intrinsics.checkNotNullParameter(articleSource, "articleSource");
                                            HttpUrl url = articleSource.getUrl();
                                            if (url == null) {
                                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (SheetDestinationWithArgs) PortfolioDigestDestinations3.INSTANCE, (Parcelable) new PortfolioDigestDestinations3.Args(articleSource, Screen.Name.PORTFOLIO_DIGEST_DETAIL, args.getDigest().getAccountNumber(), args.getDigest().getDigestId(), args.getSource()), false, (Function1) null, 12, (Object) null);
                                            } else {
                                                WebUtils.viewUrl$default(WebUtils.INSTANCE, context, url, 0, 4, null);
                                            }
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$6$lambda$5$lambda$4(LifecycleAwareNavigator lifecycleAwareNavigator, PortfolioDigestDestinations4.Args args, ImmutableList articleSources) throws Resources.NotFoundException {
                                            Intrinsics.checkNotNullParameter(articleSources, "articleSources");
                                            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, PortfolioDigestDestinations2.INSTANCE, new PortfolioDigestDestinations2.Args(args.getDigest().getAccountNumber(), args.getDigest().getDigestId(), args.getSource()), null, null, false, null, 60, null);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer6, 54), composer6, 24576, 15);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), composer5, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable$lambda$1(args, portfolioDigestDetailDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final LottieComposition PortfolioDigestAnimation$lambda$12(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float PortfolioDigestAnimation$lambda$13(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortfolioDigestDetailViewState PortfolioDigestDetailComposable$lambda$0(SnapshotState4<PortfolioDigestDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean PortfolioDigestTimestamp$lambda$10$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioDigestTimestamp(final Instant instant, final Instant instant2, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Resources resources;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1753406615);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instant) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(instant2) ? 32 : 16;
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
                    ComposerKt.traceEventStart(1753406615, i3, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestTimestamp (PortfolioDigestDetailComposable.kt:320)");
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                resources = ((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(instant);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = resources.getString(C12105R.string.portfolio_digest_timestamp, InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format(instant));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                String str = (String) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Intrinsics.checkNotNull(str);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1779403311);
                if (instant2 != null) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue2 == companion3.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), TAG_PORTFOLIO_DIGEST_NEXT_TIMESTAMP);
                    boolean zPortfolioDigestTimestamp$lambda$10$lambda$4 = PortfolioDigestTimestamp$lambda$10$lambda$4(snapshotState);
                    PopupPositioning popupPositioning = PopupPositioning.BELOW;
                    float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM();
                    Boolean boolValueOf = Boolean.valueOf(zPortfolioDigestTimestamp$lambda$10$lambda$4);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion3.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PortfolioDigestDetailComposableKt.PortfolioDigestTimestamp$lambda$10$lambda$7$lambda$6(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(modifierTestTag, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    } : (Function0) objRememberedValue3, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    } : null, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : popupPositioning, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : fM21593getSmallD9Ej5fM, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.rememberComposableLambda(1730607493, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestTimestamp$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) throws Resources.NotFoundException {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1730607493, i6, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestTimestamp.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:352)");
                            }
                            String string2 = resources.getString(C12105R.string.portfolio_digest_next_timestamp, InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format(instant2));
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54));
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion3.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PortfolioDigestDetailComposableKt.PortfolioDigestTimestamp$lambda$10$lambda$9$lambda$8(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.HOURGLASS_16), null, bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), ClickableKt.m4891clickableO2vRcR0$default(modifierM26519popupTooltipBgaGok8, null, null, false, null, null, (Function0) objRememberedValue4, 28, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PortfolioDigestDetailComposableKt.PortfolioDigestTimestamp$lambda$11(instant, instant2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                resources = ((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(instant);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = resources.getString(C12105R.string.portfolio_digest_timestamp, InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format(instant));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    String str2 = (String) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Intrinsics.checkNotNull(str2);
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1779403311);
                    if (instant2 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
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

    private static final void PortfolioDigestTimestamp$lambda$10$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestTimestamp$lambda$10$lambda$7$lambda$6(SnapshotState snapshotState) {
        PortfolioDigestTimestamp$lambda$10$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestTimestamp$lambda$10$lambda$9$lambda$8(SnapshotState snapshotState) {
        PortfolioDigestTimestamp$lambda$10$lambda$5(snapshotState, !PortfolioDigestTimestamp$lambda$10$lambda$4(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioDigestAnimation(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(135108892);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(135108892, i, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestAnimation (PortfolioDigestDetailComposable.kt:372)");
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C12105R.raw.lottie_cortex_portfolio_digest_header)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(PortfolioDigestAnimation$lambda$12(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
            Integer num = LottieProperty.COLOR;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties = LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{LottieDynamicProperties2.rememberLottieDynamicProperty(num, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composerStartRestartGroup, i2).m21368getAccent0d7_KjU())), new String[]{"**", ".Editable_Dots-Min-MAX_Color_Fill_Active-Color", "**"}, composerStartRestartGroup, 6), LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.STROKE_COLOR, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composerStartRestartGroup, i2).m21425getFg0d7_KjU())), new String[]{"**", ".Editable_Dots-Neutral_Stroke_Active-Color", "**"}, composerStartRestartGroup, 6)}, composerStartRestartGroup, LottieDynamicProperties3.$stable);
            Modifier modifierFullWidthChartSize = com.robinhood.android.charts.ModifiersKt.fullWidthChartSize(TestTag3.testTag(Modifier.INSTANCE, TAG_LOTTIE_ANIMATION));
            LottieComposition lottieCompositionPortfolioDigestAnimation$lambda$12 = PortfolioDigestAnimation$lambda$12(lottieCompositionResultRememberLottieComposition);
            ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(PortfolioDigestDetailComposableKt.PortfolioDigestAnimation$lambda$13(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup = composerStartRestartGroup;
            LottieAnimation2.LottieAnimation(lottieCompositionPortfolioDigestAnimation$lambda$12, (Function0) objRememberedValue, modifierFullWidthChartSize, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties, null, fillWidth, false, false, null, null, false, composerStartRestartGroup, LottieDynamicProperties.$stable << 24, 6, 64248);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioDigestDetailComposableKt.PortfolioDigestAnimation$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericActionDto parseAction(ActionDto actionDto) {
        AnyMessage concrete;
        if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
            return null;
        }
        GenericActionDto.Companion companion = GenericActionDto.INSTANCE;
        GenericAction genericAction = (GenericAction) concrete.unpackOrNull(companion.getProtoAdapter());
        if (genericAction != null) {
            return companion.fromProto(genericAction);
        }
        return null;
    }
}
