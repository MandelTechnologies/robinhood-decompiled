package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieAnimationView;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerIndicator;
import com.google.accompanist.pager.PagerScope;
import com.google.accompanist.pager.PagerState;
import com.google.accompanist.pager.PagerStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.logging.RhyEventLoggingUtils;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel.RhyOverviewCarouselComposable;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel.RhyOverviewCarouselViewState;
import com.robinhood.android.common.util.extensions.ImageViews2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTabCarouselItem;
import com.robinhood.models.p320db.rhy.RhyTabCarouselItem;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RhyOverviewCarouselComposable.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u000f\u001ae\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001a\u001a_\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u001e\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0002\u001a$\u0010\"\u001a\u00020\u0001*\u00020#2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a$\u0010$\u001a\u00020\u0001*\u00020#2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u001c\u0010%\u001a\u00020\u0001*\u00020&2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0002\u001a0\u0010'\u001a\u00020\u0001*\u00020(2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0002¨\u0006)"}, m3636d2 = {"RhyOverviewCarousel", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewState", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState;", "markwon", "Lio/noties/markwon/Markwon;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "dismissCarouselItem", "Lkotlin/Function1;", "Lcom/robinhood/models/db/rhy/RhyTabCarouselItem;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState;Lio/noties/markwon/Markwon;Lcom/robinhood/android/rhimage/ImageLoader;Lcom/robinhood/android/navigation/Navigator;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RhyOverviewCarouselComposable", "carouselItems", "Lkotlinx/collections/immutable/ImmutableList;", "creditCardWaitlistFlowSimplified", "", "onClick", "", "onDismiss", "(Landroidx/compose/ui/Modifier;Lkotlinx/collections/immutable/ImmutableList;Lio/noties/markwon/Markwon;Lcom/robinhood/android/rhimage/ImageLoader;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RhyOverviewCarsouselLoading", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RhyOverviewCarouselCard", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/db/rhy/RhyTabCarouselItem;Lio/noties/markwon/Markwon;Lcom/robinhood/android/rhimage/ImageLoader;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "updateTitle", "Lcom/robinhood/android/designsystem/infotag/RdsInfoTag;", ResourceTypes.STYLE, "Lcom/robinhood/models/db/rhy/RhyTabCarouselItem$Style;", "updateMessageTitle", "Lcom/robinhood/android/designsystem/text/RhTextView;", "updateMessage", "updateActionButton", "Lcom/robinhood/android/designsystem/button/RdsTextButton;", "updateDismissButton", "Lcom/robinhood/android/designsystem/button/RdsIconButton;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyOverviewCarouselComposable {

    /* compiled from: RhyOverviewCarouselComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiRhyTabCarouselItem.AssetType.values().length];
            try {
                iArr[ApiRhyTabCarouselItem.AssetType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiRhyTabCarouselItem.AssetType.ANIMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewCarousel$lambda$0(Modifier modifier, RhyOverviewCarouselViewState rhyOverviewCarouselViewState, Markwon markwon, ImageLoader imageLoader, Navigator navigator, Function1 function1, int i, int i2, Composer composer, int i3) {
        RhyOverviewCarousel(modifier, rhyOverviewCarouselViewState, markwon, imageLoader, navigator, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewCarouselCard$lambda$20(Modifier modifier, RhyTabCarouselItem rhyTabCarouselItem, Markwon markwon, ImageLoader imageLoader, boolean z, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        RhyOverviewCarouselCard(modifier, rhyTabCarouselItem, markwon, imageLoader, z, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewCarouselComposable$lambda$1(Modifier modifier, ImmutableList immutableList, Markwon markwon, ImageLoader imageLoader, boolean z, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        RhyOverviewCarouselComposable(modifier, immutableList, markwon, imageLoader, z, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewCarouselComposable$lambda$3(Modifier modifier, ImmutableList immutableList, Markwon markwon, ImageLoader imageLoader, boolean z, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        RhyOverviewCarouselComposable(modifier, immutableList, markwon, imageLoader, z, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewCarsouselLoading$lambda$5(Modifier modifier, int i, int i2, Composer composer, int i3) {
        RhyOverviewCarsouselLoading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void RhyOverviewCarousel(Modifier modifier, final RhyOverviewCarouselViewState viewState, final Markwon markwon, final ImageLoader imageLoader, final Navigator navigator, final Function1<? super RhyTabCarouselItem, Unit> dismissCarouselItem, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(dismissCarouselItem, "dismissCarouselItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(720949726);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(markwon) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(imageLoader) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dismissCarouselItem) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(720949726, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarousel (RhyOverviewCarouselComposable.kt:71)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final Modifier modifier3 = modifier;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-530349581, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt.RhyOverviewCarousel.1

                /* compiled from: RhyOverviewCarouselComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$RhyOverviewCarousel$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<RhyOverviewCarouselViewState, Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ Function1<RhyTabCarouselItem, Unit> $dismissCarouselItem;
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ ImageLoader $imageLoader;
                    final /* synthetic */ Markwon $markwon;
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ Navigator $navigator;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Modifier modifier, Markwon markwon, ImageLoader imageLoader, Navigator navigator, Context context, EventLogger eventLogger, Function1<? super RhyTabCarouselItem, Unit> function1) {
                        this.$modifier = modifier;
                        this.$markwon = markwon;
                        this.$imageLoader = imageLoader;
                        this.$navigator = navigator;
                        this.$context = context;
                        this.$eventLogger = eventLogger;
                        this.$dismissCarouselItem = function1;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhyOverviewCarouselViewState rhyOverviewCarouselViewState, Composer composer, Integer num) {
                        invoke(rhyOverviewCarouselViewState, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhyOverviewCarouselViewState state, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(state, "state");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(state) : composer.changedInstance(state) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(526808950, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarousel.<anonymous>.<anonymous> (RhyOverviewCarouselComposable.kt:76)");
                        }
                        if (Intrinsics.areEqual(state, RhyOverviewCarouselViewState.Hidden.INSTANCE)) {
                            composer.startReplaceGroup(355023705);
                            composer.endReplaceGroup();
                        } else if (Intrinsics.areEqual(state, RhyOverviewCarouselViewState.Loading.INSTANCE)) {
                            composer.startReplaceGroup(-542733466);
                            RhyOverviewCarouselComposable.RhyOverviewCarsouselLoading(this.$modifier, composer, 0, 0);
                            composer.endReplaceGroup();
                        } else {
                            if (!(state instanceof RhyOverviewCarouselViewState.Loaded)) {
                                composer.startReplaceGroup(-542737741);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(355273627);
                            RhyOverviewCarouselViewState.Loaded loaded = (RhyOverviewCarouselViewState.Loaded) state;
                            ImmutableList<RhyTabCarouselItem> carouselItems = loaded.getCarouselItems();
                            boolean creditCardWaitlistFlowSimplified = loaded.getCreditCardWaitlistFlowSimplified();
                            Modifier modifier = this.$modifier;
                            Markwon markwon = this.$markwon;
                            ImageLoader imageLoader = this.$imageLoader;
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$RhyOverviewCarousel$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return RhyOverviewCarouselComposable.C103901.AnonymousClass1.invoke$lambda$1$lambda$0(navigator, context, (String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function1 = (Function1) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changed(this.$dismissCarouselItem);
                            final EventLogger eventLogger = this.$eventLogger;
                            final Function1<RhyTabCarouselItem, Unit> function12 = this.$dismissCarouselItem;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$RhyOverviewCarousel$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return RhyOverviewCarouselComposable.C103901.AnonymousClass1.invoke$lambda$3$lambda$2(eventLogger, function12, (RhyTabCarouselItem) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            RhyOverviewCarouselComposable.RhyOverviewCarouselComposable(modifier, carouselItems, markwon, imageLoader, creditCardWaitlistFlowSimplified, function1, (Function1) objRememberedValue2, composer, 0, 0);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, String url) {
                        Intrinsics.checkNotNullParameter(url, "url");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(url), null, null, false, null, 60, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Function1 function1, RhyTabCarouselItem item) {
                        Intrinsics.checkNotNullParameter(item, "item");
                        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
                        RhyEventLoggingUtils rhyEventLoggingUtils = RhyEventLoggingUtils.INSTANCE;
                        EventLogger.DefaultImpls.logTap$default(eventLogger, action, rhyEventLoggingUtils.getRhyTabScreen(), new Component(Component.ComponentType.RHY_CAROUSEL, item.getBannerId(), null, 4, null), null, rhyEventLoggingUtils.getRhyTabContext(), false, 40, null);
                        function1.invoke(item);
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(-530349581, i5, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarousel.<anonymous> (RhyOverviewCarouselComposable.kt:75)");
                    }
                    Crossfade.Crossfade(viewState, (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambda3.rememberComposableLambda(526808950, true, new AnonymousClass1(modifier3, markwon, imageLoader, navigator, context, current, dismissCarouselItem), composer2, 54), composer2, 24576, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewCarouselComposable.RhyOverviewCarousel$lambda$0(modifier2, viewState, markwon, imageLoader, navigator, dismissCarouselItem, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhyOverviewCarouselComposable(Modifier modifier, final ImmutableList<RhyTabCarouselItem> carouselItems, final Markwon markwon, final ImageLoader imageLoader, final boolean z, final Function1<? super String, Unit> onClick, final Function1<? super RhyTabCarouselItem, Unit> onDismiss, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(carouselItems, "carouselItems");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1777198925);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(carouselItems) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(markwon) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(imageLoader) ? 2048 : 1024;
        }
        if ((i2 & 16) == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 1048576 : 524288;
            }
            if ((599187 & i3) != 599186 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1777198925, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposable (RhyOverviewCarouselComposable.kt:121)");
                }
                if (!carouselItems.isEmpty()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final boolean z3 = z2;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return RhyOverviewCarouselComposable.RhyOverviewCarouselComposable$lambda$1(modifier4, carouselItems, markwon, imageLoader, z3, onClick, onDismiss, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier5 = modifier4;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierFillMaxWidth$default2, bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 6, 4);
                PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, composerStartRestartGroup, 0, 1);
                composer2 = composerStartRestartGroup;
                Pager.m9191HorizontalPager7SJwSw(carouselItems.size(), null, pagerStateRememberPagerState, false, 0.0f, null, null, null, null, false, ComposableLambda3.rememberComposableLambda(2026500782, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$RhyOverviewCarouselComposable$2$1
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                        invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PagerScope HorizontalPager, int i6, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                        if ((i7 & 48) == 0) {
                            i7 |= composer3.changed(i6) ? 32 : 16;
                        }
                        if ((i7 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2026500782, i7, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposable.<anonymous>.<anonymous> (RhyOverviewCarouselComposable.kt:136)");
                        }
                        RhyOverviewCarouselComposable.RhyOverviewCarouselCard(null, carouselItems.get(i6), markwon, imageLoader, z, onClick, onDismiss, composer3, 0, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 0, 6, 1018);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getColors(composer2, i5).m21373getBg30d7_KjU(), 0.0f, composer2, 6, 4);
                composer2.startReplaceGroup(-282236053);
                if (carouselItems.size() > 1) {
                    float f = 6;
                    PagerIndicator.m9199HorizontalPagerIndicatorK_mkGiw(pagerStateRememberPagerState, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0, (Function1<? super Integer, Integer>) null, bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i5).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), 0.0f, (Shape) null, composer2, 14155776, 780);
                    composer2 = composer2;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhyOverviewCarouselComposable.RhyOverviewCarouselComposable$lambda$3(modifier3, carouselItems, markwon, imageLoader, z, onClick, onDismiss, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        z2 = z;
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((599187 & i3) != 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!carouselItems.isEmpty()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RhyOverviewCarsouselLoading(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(699556758);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(699556758, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarsouselLoading (RhyOverviewCarouselComposable.kt:164)");
            }
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), C2002Dp.m7995constructorimpl(250));
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), null, 2, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
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
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), companion.getCenter()), BentoProgressIndicator3.f5153XS, bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewCarouselComposable.RhyOverviewCarsouselLoading$lambda$5(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0193  */
    @SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhyOverviewCarouselCard(Modifier modifier, final RhyTabCarouselItem rhyTabCarouselItem, final Markwon markwon, final ImageLoader imageLoader, final boolean z, final Function1<? super String, Unit> function1, final Function1<? super RhyTabCarouselItem, Unit> function12, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Function1<? super String, Unit> function13;
        Function1<? super RhyTabCarouselItem, Unit> function14;
        final boolean isDay;
        int i4;
        final boolean z2;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChanged;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-857831589);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(rhyTabCarouselItem) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(markwon) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(imageLoader) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else {
            if ((i & 196608) == 0) {
                function13 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    function14 = function12;
                    i3 |= composerStartRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-857831589, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselCard (RhyOverviewCarouselComposable.kt:191)");
                    }
                    isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                    if (Intrinsics.areEqual(rhyTabCarouselItem.getBannerId(), RhyTabCarouselItem.CREDIT_CARD_GOLD_INVITE_BANNER_ID) || !z) {
                        i4 = i3;
                        z2 = false;
                    } else {
                        i4 = i3;
                        z2 = true;
                    }
                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifier4, RhyEventLoggingUtils.INSTANCE.toRhyTabEventData(Component.ComponentType.RHY_CAROUSEL, UserInteractionEventData.Action.PRIMARY_CTA, rhyTabCarouselItem.getBannerId()), true, false, false, true, false, null, 108, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(250));
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(rhyTabCarouselItem);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhyOverviewCarouselComposable.RhyOverviewCarouselCard$lambda$10$lambda$9(rhyTabCarouselItem, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function15 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = ((i4 & 3670016) != 1048576) | composerStartRestartGroup.changed(isDay) | composerStartRestartGroup.changedInstance(rhyTabCarouselItem) | composerStartRestartGroup.changedInstance(markwon) | composerStartRestartGroup.changed(z2) | composerStartRestartGroup.changedInstance(imageLoader) | ((i4 & 458752) != 131072);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Function1<? super RhyTabCarouselItem, Unit> function16 = function14;
                        Function1 function17 = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhyOverviewCarouselComposable.RhyOverviewCarouselCard$lambda$19$lambda$18(isDay, rhyTabCarouselItem, markwon, function16, z2, imageLoader, function13, (View) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function17);
                        objRememberedValue2 = function17;
                    }
                    Function1 function18 = (Function1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    AndroidView_androidKt.AndroidView(function15, modifierM5156height3ABfNKs, function18, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RhyOverviewCarouselComposable.RhyOverviewCarouselCard$lambda$20(modifier3, rhyTabCarouselItem, markwon, imageLoader, z, function1, function12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            function14 = function12;
            if ((599187 & i3) != 599186) {
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                if (Intrinsics.areEqual(rhyTabCarouselItem.getBannerId(), RhyTabCarouselItem.CREDIT_CARD_GOLD_INVITE_BANNER_ID)) {
                    i4 = i3;
                    z2 = false;
                    Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifier4, RhyEventLoggingUtils.INSTANCE.toRhyTabEventData(Component.ComponentType.RHY_CAROUSEL, UserInteractionEventData.Action.PRIMARY_CTA, rhyTabCarouselItem.getBannerId()), true, false, false, true, false, null, 108, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(250));
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(rhyTabCarouselItem);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhyOverviewCarouselComposable.RhyOverviewCarouselCard$lambda$10$lambda$9(rhyTabCarouselItem, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        Function1 function152 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = ((i4 & 3670016) != 1048576) | composerStartRestartGroup.changed(isDay) | composerStartRestartGroup.changedInstance(rhyTabCarouselItem) | composerStartRestartGroup.changedInstance(markwon) | composerStartRestartGroup.changed(z2) | composerStartRestartGroup.changedInstance(imageLoader) | ((i4 & 458752) != 131072);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            final Function1 function162 = function14;
                            Function1 function172 = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return RhyOverviewCarouselComposable.RhyOverviewCarouselCard$lambda$19$lambda$18(isDay, rhyTabCarouselItem, markwon, function162, z2, imageLoader, function13, (View) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function172);
                            objRememberedValue2 = function172;
                            Function1 function182 = (Function1) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            AndroidView_androidKt.AndroidView(function152, modifierM5156height3ABfNKs2, function182, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function13 = function1;
        if ((i2 & 64) != 0) {
        }
        function14 = function12;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View RhyOverviewCarouselCard$lambda$10$lambda$9(RhyTabCarouselItem rhyTabCarouselItem, Context it) {
        int i;
        final Paint.Align align;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean zAreEqual = Intrinsics.areEqual(rhyTabCarouselItem.getAsset().isLeftAligned(), Boolean.TRUE);
        if (zAreEqual) {
            i = C10285R.layout.include_rhy_overview_carousel_item_left_aligned;
        } else {
            i = C10285R.layout.include_rhy_overview_carousel_item;
        }
        if (zAreEqual) {
            align = Paint.Align.RIGHT;
        } else {
            align = Paint.Align.LEFT;
        }
        View viewInflate = LayoutInflater.from(it).inflate(i, (ViewGroup) null, false);
        final ImageView imageView = (ImageView) viewInflate.findViewById(C10285R.id.rhy_overview_carousel_image);
        imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$RhyOverviewCarouselCard$1$1$1$1$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                ImageView imageView2 = imageView;
                Intrinsics.checkNotNull(imageView2);
                ImageViews2.fitHeightAndAlignCrop(imageView2, align);
            }
        });
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) viewInflate.findViewById(C10285R.id.rhy_overview_carousel_animation);
        lottieAnimationView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$RhyOverviewCarouselCard$1$1$1$2$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                Intrinsics.checkNotNull(lottieAnimationView2);
                ImageViews2.fitHeightAndAlignCrop(lottieAnimationView2, align);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewCarouselCard$lambda$19$lambda$18(boolean z, final RhyTabCarouselItem rhyTabCarouselItem, Markwon markwon, Function1 function1, boolean z2, ImageLoader imageLoader, final Function1 function12, View view) {
        RhyTabCarouselItem.Style lightStyle = z ? rhyTabCarouselItem.getLightStyle() : rhyTabCarouselItem.getDarkStyle();
        view.setBackgroundColor(Color.parseColor(lightStyle.getBackgroundColor()));
        View viewFindViewById = view.findViewById(C10285R.id.rhy_overview_carousel_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        updateTitle((RdsInfoTag) viewFindViewById, rhyTabCarouselItem, lightStyle);
        View viewFindViewById2 = view.findViewById(C10285R.id.rhy_overview_carousel_message_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        updateMessageTitle((RhTextView) viewFindViewById2, rhyTabCarouselItem, lightStyle, markwon);
        View viewFindViewById3 = view.findViewById(C10285R.id.rhy_overview_carousel_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        updateMessage((RhTextView) viewFindViewById3, rhyTabCarouselItem, lightStyle, markwon);
        RdsTextButton rdsTextButton = (RdsTextButton) view.findViewById(C10285R.id.rhy_overview_carousel_action);
        if (z2) {
            rdsTextButton.setVisibility(8);
        } else {
            rdsTextButton.setVisibility(0);
            Intrinsics.checkNotNull(rdsTextButton);
            updateActionButton(rdsTextButton, rhyTabCarouselItem, lightStyle);
        }
        ImageView imageView = (ImageView) view.findViewById(C10285R.id.rhy_overview_carousel_image);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(C10285R.id.rhy_overview_carousel_animation);
        int i = WhenMappings.$EnumSwitchMapping$0[rhyTabCarouselItem.getAsset().getAssetType().ordinal()];
        if (i == 1) {
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(0);
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageLoader.ImageRequest.DefaultImpls.into$default(imageLoader.load(rhyTabCarouselItem.getUrl(ContextsUiExtensions.getDensitySpec(context), z)), imageView, null, null, 6, null);
            Intrinsics.checkNotNull(lottieAnimationView);
            lottieAnimationView.setVisibility(8);
            lottieAnimationView.clearAnimation();
        } else if (i == 2) {
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(8);
            imageLoader.cancelRequest(imageView);
            Intrinsics.checkNotNull(lottieAnimationView);
            lottieAnimationView.setVisibility(0);
            Context context2 = lottieAnimationView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            lottieAnimationView.setAnimationFromUrl(rhyTabCarouselItem.getUrl(ContextsUiExtensions.getDensitySpec(context2), z).getUrl());
            lottieAnimationView.playAnimation();
        }
        View viewFindViewById4 = view.findViewById(C10285R.id.rhy_overview_carousel_dismiss_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        updateDismissButton((RdsIconButton) viewFindViewById4, rhyTabCarouselItem, lightStyle, function1);
        if (!z2) {
            Intrinsics.checkNotNull(view);
            OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyOverviewCarouselComposable.RhyOverviewCarouselCard$lambda$19$lambda$18$lambda$17(rhyTabCarouselItem, function12);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewCarouselCard$lambda$19$lambda$18$lambda$17(RhyTabCarouselItem rhyTabCarouselItem, Function1 function1) {
        String ctaDeeplink = rhyTabCarouselItem.getCtaDeeplink();
        if (ctaDeeplink != null) {
            function1.invoke(ctaDeeplink);
        }
        return Unit.INSTANCE;
    }

    private static final void updateTitle(RdsInfoTag rdsInfoTag, RhyTabCarouselItem rhyTabCarouselItem, RhyTabCarouselItem.Style style) {
        rdsInfoTag.setText(rhyTabCarouselItem.getChipText());
        rdsInfoTag.setIconDrawable(null);
        rdsInfoTag.setTextColor(Color.parseColor(style.getBadgeTextColor()));
        rdsInfoTag.overrideBackgroundColor(Color.parseColor(style.getBadgeColor()));
    }

    private static final void updateMessageTitle(RhTextView rhTextView, RhyTabCarouselItem rhyTabCarouselItem, RhyTabCarouselItem.Style style, Markwon markwon) {
        MarkdownContent title = rhyTabCarouselItem.getTitle();
        if (title == null) {
            title = new MarkdownContent("");
        }
        rhTextView.setText(Markwons.toSpanned$default(markwon, title, null, 2, null));
        if (style.getTitleColor() != null) {
            ScarletManager2.overrideAttribute(rhTextView, R.attr.textColor, new ResourceValue(ResourceType.COLOR.INSTANCE, Integer.valueOf(Color.parseColor(style.getTitleColor()))));
        }
    }

    private static final void updateMessage(RhTextView rhTextView, RhyTabCarouselItem rhyTabCarouselItem, RhyTabCarouselItem.Style style, Markwon markwon) {
        rhTextView.setText(Markwons.toSpanned$default(markwon, rhyTabCarouselItem.getText(), null, 2, null));
        ScarletManager2.overrideAttribute(rhTextView, R.attr.textColor, new ResourceValue(ResourceType.COLOR.INSTANCE, Integer.valueOf(Color.parseColor(style.getTextColor()))));
    }

    private static final void updateActionButton(RdsTextButton rdsTextButton, RhyTabCarouselItem rhyTabCarouselItem, RhyTabCarouselItem.Style style) {
        BentoIcon4 bentoIcon;
        rdsTextButton.setText(rhyTabCarouselItem.getCtaText());
        Icon ctaIcon = rhyTabCarouselItem.getCtaIcon();
        if (ctaIcon != null && (bentoIcon = SduiIcon2.toBentoIcon(ctaIcon)) != null) {
            TextViewsKt.setDrawableEnd(rdsTextButton, rdsTextButton.getResources().getDrawable(bentoIcon.getAsset().getResourceId(), rdsTextButton.getContext().getTheme()));
        }
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        ScarletManager2.overrideAttribute(rdsTextButton, R.attr.textColor, new ResourceValue(color, Integer.valueOf(Color.parseColor(style.getTextColor()))));
        ScarletManager2.overrideAttribute(rdsTextButton, R.attr.drawableTint, new ResourceValue(color, Integer.valueOf(Color.parseColor(style.getTextColor()))));
    }

    private static final void updateDismissButton(RdsIconButton rdsIconButton, final RhyTabCarouselItem rhyTabCarouselItem, RhyTabCarouselItem.Style style, final Function1<? super RhyTabCarouselItem, Unit> function1) {
        rdsIconButton.setVisibility(rhyTabCarouselItem.getDismissible() ? 0 : 8);
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        ScarletManager2.overrideAttribute(rdsIconButton, R.attr.tint, new ResourceValue(color, Integer.valueOf(Color.parseColor(style.getTextColor()))));
        ScarletManager2.overrideAttribute(rdsIconButton, R.attr.foregroundTint, ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_3());
        ScarletManager2.overrideAttribute(rdsIconButton, R.attr.backgroundTint, new ResourceValue(color, Integer.valueOf(Color.parseColor(style.getBackgroundColor()))));
        OnClickListeners.onClick(rdsIconButton, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.carousel.RhyOverviewCarouselComposableKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOverviewCarouselComposable.updateDismissButton$lambda$22(function1, rhyTabCarouselItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDismissButton$lambda$22(Function1 function1, RhyTabCarouselItem rhyTabCarouselItem) {
        function1.invoke(rhyTabCarouselItem);
        return Unit.INSTANCE;
    }
}
