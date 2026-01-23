package com.robinhood.android.blackwidow.p068ui.upsell;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.collection.LongList2;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsSize4;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.Divider5;
import androidx.compose.material3.IconButton5;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.p014ui.PlayerView;
import coil.compose.SingletonAsyncImagePainter;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.blackwidow.C9859R;
import com.robinhood.android.blackwidow.LocalityStringResources;
import com.robinhood.android.blackwidow.p068ui.loading.ExploreLegendLoadingComposable3;
import com.robinhood.android.blackwidow.p068ui.upsell.ExploreLegendUpsellFragment;
import com.robinhood.android.blackwidow.p068ui.upsell.ExploreLegendUpsellViewState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.AnimationExoPlayer2;
import com.robinhood.compose.common.AnimationExoPlayerConfig;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: ExploreLegendUpsellComposable.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aK\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0013\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u001b\u001a\u00020\u0003*\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a5\u0010\u001d\u001a\u00020\u0003*\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001d\u0010\u001c\u001a+\u0010\u001e\u001a\u00020\u0003*\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010 \u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\u0003H\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\u0003H\u0003¢\u0006\u0004\b&\u0010%\u001a5\u0010*\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020(0'2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b*\u0010+\u001a)\u00100\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b0\u00101\u001aI\u0010<\u001a\u00020\u00032\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u00162\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u00182\b\b\u0002\u0010;\u001a\u000207H\u0003¢\u0006\u0004\b<\u0010=\u001a\u000f\u0010>\u001a\u00020\u0003H\u0003¢\u0006\u0004\b>\u0010%\u001a\u0019\u0010?\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b?\u0010!\u001a\u0019\u0010@\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b@\u0010!\u001a+\u0010B\u001a\u00020\u00032\u0006\u0010-\u001a\u00020(2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010A\u001a\u00020\u0018H\u0007¢\u0006\u0004\bB\u0010C\u001a1\u0010G\u001a\u00020\u00032\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010F\u001a\u00020EH\u0003¢\u0006\u0004\bG\u0010H\u001a/\u0010I\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\bI\u0010J\u001a-\u0010O\u001a\u00020\u00032\b\b\u0001\u00104\u001a\u0002072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010L\u001a\u00020KH\u0003¢\u0006\u0004\bM\u0010N\u001a#\u0010P\u001a\u00020\u00032\b\b\u0001\u00104\u001a\u0002072\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\bP\u0010Q\u001a-\u0010S\u001a\u00020\u00032\b\b\u0001\u00104\u001a\u0002072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010L\u001a\u00020KH\u0003¢\u0006\u0004\bR\u0010N\u001aA\u0010W\u001a\u00020\u00032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00160T2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010L\u001a\u00020K2\b\b\u0002\u0010F\u001a\u00020EH\u0003¢\u0006\u0004\bU\u0010V\u001a7\u0010Z\u001a\u00020\u00032\b\b\u0001\u00104\u001a\u0002072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010F\u001a\u00020E2\b\b\u0002\u0010L\u001a\u00020KH\u0003¢\u0006\u0004\bX\u0010Y\u001a'\u0010]\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\\\u001a\u00020[2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b]\u0010^\u001a\u000f\u0010_\u001a\u00020\u0003H\u0003¢\u0006\u0004\b_\u0010%\u001a\u000f\u0010`\u001a\u00020\u0003H\u0003¢\u0006\u0004\b`\u0010%\u001a\u000f\u0010a\u001a\u00020\u0003H\u0003¢\u0006\u0004\ba\u0010%\"\u0017\u0010c\u001a\u00020b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010f¨\u0006l²\u0006\u000e\u0010g\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010h\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\f\u0010j\u001a\u00020i8\nX\u008a\u0084\u0002²\u0006\u000e\u00108\u001a\u0002078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010k\u001a\u0002078\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellDuxo;", "duxo", "Lkotlin/Function0;", "", "onExitRequested", "onInfoClicked", "ExploreLegendUpsellComposable", "(Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellDuxo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState$Ready;", "state", "onCtaClicked", "Landroidx/compose/ui/Modifier;", "modifier", "ExploreLegendContent", "(Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState$Ready;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "eventDescriptor", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "MainLazilyLoadedContent", "(Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState$Ready;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "key", "", "sidePadding", "itemContent", "itemWithBlackBackground", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "itemWithGreyBackground", "itemWithGradientBackground", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "PulseMarketSection", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBarEmailCta", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBarLinkCta", "(Landroidx/compose/runtime/Composer;I)V", "TradingPlatformDynamicText", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/android/blackwidow/ui/upsell/VideoInfo;", "videoInfo", "Carousel", "(Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lkotlinx/collections/immutable/ImmutableMap;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/media3/exoplayer/source/MediaSource;", "video", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "CarouselVideoPlayer", "(Landroidx/media3/exoplayer/source/MediaSource;Landroidx/media3/exoplayer/ExoPlayer;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "iconAsset", "text", "Landroidx/compose/foundation/pager/PagerState;", "pagerState", "", "selectedPageIndex", "leftButtonEnabled", "rightButtonEnabled", "maxSize", "CarouselNavigation", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;Landroidx/compose/foundation/pager/PagerState;IZZILandroidx/compose/runtime/Composer;II)V", "HorizontalLine", "VerticalFadedLine", "LegendLogo", "repeat", "VideoContent", "(Lcom/robinhood/android/blackwidow/ui/upsell/VideoInfo;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "onClick", "", "alpha", "BottomDisclosureLink", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "AppBar", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "TitleStyledText-8iNrtrE", "(ILandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "TitleStyledText", "Headline2StyledText", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Headline3StyledText-8iNrtrE", "Headline3StyledText", "Lcom/robinhood/utils/Either;", "BodyStyledText-oTYcxuw", "(Lcom/robinhood/utils/Either;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V", "BodyStyledText", "SmallStyledText-xkNWiIY", "(ILandroidx/compose/ui/Modifier;FILandroidx/compose/runtime/Composer;II)V", "SmallStyledText", "Landroidx/compose/foundation/lazy/LazyListState;", "listState", "logFirstScroll", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)Landroidx/compose/ui/Modifier;", "ExploreLegendContentPreview", "CarouselNavigationButtonsPreview", "BottomBarPreview", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "continueToShowLoading", "useHeaderImage", "Landroidx/collection/MutableLongList;", "lastPosMap", "lastSeenIndex", "feature-black-widow-upsell_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ExploreLegendUpsellComposableKt {
    private static final Screen screen = new Screen(Screen.Name.BLACK_WIDOW_SPLASH_UPSELL, null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBar$lambda$65(Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        AppBar(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BodyStyledText_oTYcxuw$lambda$75(Either either, Modifier modifier, int i, float f, int i2, int i3, Composer composer, int i4) {
        m11452BodyStyledTextoTYcxuw(either, modifier, i, f, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarEmailCta$lambda$18(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomBarEmailCta(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarLinkCta$lambda$21(int i, Composer composer, int i2) {
        BottomBarLinkCta(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarPreview$lambda$80(int i, Composer composer, int i2) {
        BottomBarPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomDisclosureLink$lambda$60(Function0 function0, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        BottomDisclosureLink(function0, modifier, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Carousel$lambda$42(UserInteractionEventDescriptor userInteractionEventDescriptor, ImmutableMap immutableMap, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Carousel(userInteractionEventDescriptor, immutableMap, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CarouselNavigation$lambda$50(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, PagerState pagerState, int i, boolean z, boolean z2, int i2, int i3, int i4, Composer composer, int i5) {
        CarouselNavigation(serverToBentoAssetMapper2, str, pagerState, i, z, z2, i2, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CarouselNavigationButtonsPreview$lambda$79(int i, Composer composer, int i2) {
        CarouselNavigationButtonsPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView CarouselVideoPlayer$lambda$47$lambda$46(PlayerView playerView, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CarouselVideoPlayer$lambda$48(MediaSource mediaSource, ExoPlayer exoPlayer, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CarouselVideoPlayer(mediaSource, exoPlayer, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExploreLegendContent$lambda$7(ExploreLegendUpsellViewState.Ready ready, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ExploreLegendContent(ready, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExploreLegendContentPreview$lambda$78(int i, Composer composer, int i2) {
        ExploreLegendContentPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExploreLegendUpsellComposable$lambda$5(ExploreLegendUpsellDuxo exploreLegendUpsellDuxo, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ExploreLegendUpsellComposable(exploreLegendUpsellDuxo, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Headline2StyledText$lambda$69(int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        Headline2StyledText(i, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Headline3StyledText_8iNrtrE$lambda$71(int i, Modifier modifier, int i2, int i3, int i4, Composer composer, int i5) {
        m11453Headline3StyledText8iNrtrE(i, modifier, i2, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalLine$lambda$51(int i, Composer composer, int i2) {
        HorizontalLine(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegendLogo$lambda$54(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LegendLogo(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainLazilyLoadedContent$lambda$14(ExploreLegendUpsellViewState.Ready ready, UserInteractionEventDescriptor userInteractionEventDescriptor, PaddingValues paddingValues, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainLazilyLoadedContent(ready, userInteractionEventDescriptor, paddingValues, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PulseMarketSection$lambda$16(Modifier modifier, int i, int i2, Composer composer, int i3) {
        PulseMarketSection(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallStyledText_xkNWiIY$lambda$77(int i, Modifier modifier, float f, int i2, int i3, int i4, Composer composer, int i5) {
        m11454SmallStyledTextxkNWiIY(i, modifier, f, i2, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleStyledText_8iNrtrE$lambda$67(int i, Modifier modifier, int i2, int i3, int i4, Composer composer, int i5) {
        m11455TitleStyledText8iNrtrE(i, modifier, i2, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingPlatformDynamicText$lambda$22(int i, Composer composer, int i2) {
        TradingPlatformDynamicText(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFadedLine$lambda$52(Modifier modifier, int i, int i2, Composer composer, int i3) {
        VerticalFadedLine(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoContent$lambda$58(VideoInfo videoInfo, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        VideoContent(videoInfo, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult Carousel$lambda$40$lambda$39(final ImmutableList immutableList, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$Carousel$lambda$40$lambda$39$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Timber.INSTANCE.mo3350d("Disposing Carousel", new Object[0]);
                for (ExoPlayer exoPlayer : immutableList) {
                    exoPlayer.stop();
                    exoPlayer.release();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LongList2 Carousel$lambda$29(SnapshotState<LongList2> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ExploreLegendUpsellComposable$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MainLazilyLoadedContent$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    public static final void itemWithBlackBackground(LazyListScope lazyListScope, String str, boolean z, final Function2<? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        final float fM7995constructorimpl = C2002Dp.m7995constructorimpl(z ? 20 : 0);
        LazyListScope.item$default(lazyListScope, str, null, ComposableLambda3.composableLambdaInstance(270093315, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.itemWithBlackBackground.1
            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(270093315, i, -1, "com.robinhood.android.blackwidow.ui.upsell.itemWithBlackBackground.<anonymous> (ExploreLegendUpsellComposable.kt:505)");
                }
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                float f = fM7995constructorimpl;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM4872backgroundbw27NRU$default, f, 0.0f, f, 0.0f, 10, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                Function2<Composer, Integer, Unit> function2 = itemContent;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composer, 0);
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
        }), 2, null);
    }

    public static final void itemWithGreyBackground(LazyListScope lazyListScope, String str, boolean z, final Function2<? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        final float fM7995constructorimpl = C2002Dp.m7995constructorimpl(z ? 20 : 0);
        LazyListScope.item$default(lazyListScope, str, null, ComposableLambda3.composableLambdaInstance(784003967, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.itemWithGreyBackground.1
            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(784003967, i, -1, "com.robinhood.android.blackwidow.ui.upsell.itemWithGreyBackground.<anonymous> (ExploreLegendUpsellComposable.kt:525)");
                }
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoColor.INSTANCE.m21136getBlackWidowBG0d7_KjU(), null, 2, null);
                float f = fM7995constructorimpl;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM4872backgroundbw27NRU$default, f, 0.0f, f, 0.0f, 10, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                Function2<Composer, Integer, Unit> function2 = itemContent;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composer, 0);
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
        }), 2, null);
    }

    public static final Screen getScreen() {
        return screen;
    }

    public static final void ExploreLegendUpsellComposable(final ExploreLegendUpsellDuxo duxo, final Function0<Unit> onExitRequested, final Function0<Unit> onInfoClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onExitRequested, "onExitRequested");
        Intrinsics.checkNotNullParameter(onInfoClicked, "onInfoClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-765199973);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onExitRequested) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onInfoClicked) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-765199973, i2, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposable (ExploreLegendUpsellComposable.kt:131)");
            }
            final ExploreLegendUpsellViewState exploreLegendUpsellViewState = (ExploreLegendUpsellViewState) FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
            SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1), Color.INSTANCE.m6725getTransparent0d7_KjU(), false, null, 4, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = Long.valueOf(System.currentTimeMillis());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            long jLongValue = ((Number) objRememberedValue).longValue();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                C9902x95448f33 c9902x95448f33 = new C9902x95448f33(jLongValue, 3000L, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(c9902x95448f33);
                objRememberedValue3 = c9902x95448f33;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1805517651, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.ExploreLegendUpsellComposable.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1805517651, i3, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposable.<anonymous> (ExploreLegendUpsellComposable.kt:151)");
                    }
                    boolean z = !(exploreLegendUpsellViewState instanceof ExploreLegendUpsellViewState.Ready) || ExploreLegendUpsellComposableKt.ExploreLegendUpsellComposable$lambda$2(snapshotState);
                    if (z) {
                        composer2.startReplaceGroup(-1993964483);
                        ExploreLegendLoadingComposable3.LoadingAnimation(composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (z) {
                            composer2.startReplaceGroup(-64324200);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-1993885216);
                        ExploreLegendUpsellViewState.Ready ready = (ExploreLegendUpsellViewState.Ready) exploreLegendUpsellViewState;
                        Function0<Unit> function0 = onExitRequested;
                        Function0<Unit> function02 = onInfoClicked;
                        ExploreLegendUpsellDuxo exploreLegendUpsellDuxo = duxo;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(exploreLegendUpsellDuxo);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new C9904x566baa81(exploreLegendUpsellDuxo);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        ExploreLegendUpsellComposableKt.ExploreLegendContent(ready, function0, function02, (Function0) ((KFunction) objRememberedValue4), null, composer2, 0, 16);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExploreLegendUpsellComposableKt.ExploreLegendUpsellComposable$lambda$5(duxo, onExitRequested, onInfoClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExploreLegendUpsellComposable$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreLegendContent(final ExploreLegendUpsellViewState.Ready state, final Function0<Unit> onExitRequested, final Function0<Unit> onInfoClicked, final Function0<Unit> onCtaClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onExitRequested, "onExitRequested");
        Intrinsics.checkNotNullParameter(onInfoClicked, "onInfoClicked");
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(2066260071);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onExitRequested) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInfoClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCtaClicked) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2066260071, i3, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendContent (ExploreLegendUpsellComposable.kt:176)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, Screen.copy$default(screen, null, null, "black-widow-upsell-with-cta", null, 11, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, state.getLoggingSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null);
                    composerStartRestartGroup.updateRememberedValue(userInteractionEventDescriptor);
                    objRememberedValue = userInteractionEventDescriptor;
                }
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final Modifier modifier4 = modifier2;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor2, ComposableLambda3.rememberComposableLambda(-797676846, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.ExploreLegendContent.1
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
                            ComposerKt.traceEventStart(-797676846, i5, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendContent.<anonymous> (ExploreLegendUpsellComposable.kt:190)");
                        }
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, null, true, false, false, false, false, null, 125, null);
                        final Function0<Unit> function0 = onInfoClicked;
                        final Function0<Unit> function02 = onExitRequested;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(693441678, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.ExploreLegendContent.1.1
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
                                    ComposerKt.traceEventStart(693441678, i6, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendContent.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:196)");
                                }
                                ExploreLegendUpsellComposableKt.AppBar(function0, function02, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final Function0<Unit> function03 = onCtaClicked;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1987860525, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.ExploreLegendContent.1.2
                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1987860525, i6, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendContent.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:202)");
                                }
                                Function0<Unit> function04 = function03;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                ExploreLegendUpsellComposableKt.BottomBarEmailCta(function04, null, composer3, 0, 2);
                                Spacer2.Spacer(WindowInsetsSize4.windowInsetsBottomHeight(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer3, 6)), composer3, 0);
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
                        }, composer2, 54);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                        long jM21371getBg0d7_KjU2 = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                        final ExploreLegendUpsellViewState.Ready ready = state;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                        final Function0<Unit> function04 = onInfoClicked;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierAutoLogEvents$default, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, jM21371getBg0d7_KjU, jM21371getBg0d7_KjU2, null, ComposableLambda3.rememberComposableLambda(-1646350429, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.ExploreLegendContent.1.3
                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i7 & 6) == 0) {
                                    i7 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1646350429, i7, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendContent.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:214)");
                                }
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, paddingValues.getBottom(), 7, null);
                                ExploreLegendUpsellViewState.Ready ready2 = ready;
                                UserInteractionEventDescriptor userInteractionEventDescriptor4 = userInteractionEventDescriptor3;
                                Function0<Unit> function05 = function04;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                ExploreLegendUpsellComposableKt.MainLazilyLoadedContent(ready2, userInteractionEventDescriptor4, paddingValues, function05, null, composer3, (i7 << 6) & 896, 16);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ExploreLegendUpsellComposableKt.ExploreLegendContent$lambda$7(state, onExitRequested, onInfoClicked, onCtaClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Modifier modifier42 = modifier2;
            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor22, ComposableLambda3.rememberComposableLambda(-797676846, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.ExploreLegendContent.1
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
                        ComposerKt.traceEventStart(-797676846, i5, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendContent.<anonymous> (ExploreLegendUpsellComposable.kt:190)");
                    }
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier42, null, true, false, false, false, false, null, 125, null);
                    final Function0<Unit> function0 = onInfoClicked;
                    final Function0<Unit> function02 = onExitRequested;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(693441678, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.ExploreLegendContent.1.1
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
                                ComposerKt.traceEventStart(693441678, i6, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendContent.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:196)");
                            }
                            ExploreLegendUpsellComposableKt.AppBar(function0, function02, composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final Function0<Unit> function03 = onCtaClicked;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1987860525, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.ExploreLegendContent.1.2
                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1987860525, i6, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendContent.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:202)");
                            }
                            Function0<Unit> function04 = function03;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            ExploreLegendUpsellComposableKt.BottomBarEmailCta(function04, null, composer3, 0, 2);
                            Spacer2.Spacer(WindowInsetsSize4.windowInsetsBottomHeight(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer3, 6)), composer3, 0);
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
                    }, composer2, 54);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                    long jM21371getBg0d7_KjU2 = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                    final ExploreLegendUpsellViewState.Ready ready = state;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor22;
                    final Function0<Unit> function04 = onInfoClicked;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierAutoLogEvents$default, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, jM21371getBg0d7_KjU, jM21371getBg0d7_KjU2, null, ComposableLambda3.rememberComposableLambda(-1646350429, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.ExploreLegendContent.1.3
                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i7 & 6) == 0) {
                                i7 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1646350429, i7, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendContent.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:214)");
                            }
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, paddingValues.getBottom(), 7, null);
                            ExploreLegendUpsellViewState.Ready ready2 = ready;
                            UserInteractionEventDescriptor userInteractionEventDescriptor4 = userInteractionEventDescriptor3;
                            Function0<Unit> function05 = function04;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            ExploreLegendUpsellComposableKt.MainLazilyLoadedContent(ready2, userInteractionEventDescriptor4, paddingValues, function05, null, composer3, (i7 << 6) & 896, 16);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainLazilyLoadedContent(final ExploreLegendUpsellViewState.Ready ready, final UserInteractionEventDescriptor userInteractionEventDescriptor, final PaddingValues paddingValues, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        PaddingValues paddingValues2;
        final Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Context context;
        ComponentCallbacks2 componentCallbacks2;
        final LocalityStringResources localityStringResources;
        boolean zChanged;
        Object objRememberedValue2;
        LazyListState lazyListState;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-907108349);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(ready) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                paddingValues2 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-907108349, i3, -1, "com.robinhood.android.blackwidow.ui.upsell.MainLazilyLoadedContent (ExploreLegendUpsellComposable.kt:232)");
                        }
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        Modifier modifier5 = modifier4;
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ExploreLegendUpsellComposableKt.MainLazilyLoadedContent$lambda$9$lambda$8();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        if (!(context instanceof Application)) {
                            componentCallbacks2 = (Application) context;
                        } else {
                            Context applicationContext = context.getApplicationContext();
                            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                            componentCallbacks2 = (Application) applicationContext;
                        }
                        localityStringResources = ((ExploreLegendUpsellFragment.ExploreLegendUpsellEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).localityStringResources();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(logFirstScroll(modifier5, lazyListStateRememberLazyListState, userInteractionEventDescriptor), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = ((i3 & 896) != 256) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(ready) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(localityStringResources) | ((i3 & 7168) == 2048);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                            final PaddingValues paddingValues3 = paddingValues2;
                            lazyListState = lazyListStateRememberLazyListState;
                            Function1 function1 = new Function1() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ExploreLegendUpsellComposableKt.MainLazilyLoadedContent$lambda$13$lambda$12(ready, paddingValues3, snapshotState, userInteractionEventDescriptor, localityStringResources, function02, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function1);
                            objRememberedValue2 = function1;
                        } else {
                            lazyListState = lazyListStateRememberLazyListState;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierFillMaxWidth$default, lazyListState, null, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 196608, 476);
                        composerStartRestartGroup = composerStartRestartGroup;
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
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ExploreLegendUpsellComposableKt.MainLazilyLoadedContent$lambda$14(ready, userInteractionEventDescriptor, paddingValues, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                modifier2 = modifier;
                if ((i3 & 9363) == 9362) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    Modifier modifier52 = modifier4;
                    Object[] objArr2 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    if (!(context instanceof Application)) {
                    }
                    localityStringResources = ((ExploreLegendUpsellFragment.ExploreLegendUpsellEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).localityStringResources();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(logFirstScroll(modifier52, lazyListStateRememberLazyListState, userInteractionEventDescriptor), 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = ((i3 & 896) != 256) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(ready) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(localityStringResources) | ((i3 & 7168) == 2048);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        final PaddingValues paddingValues32 = paddingValues2;
                        lazyListState = lazyListStateRememberLazyListState;
                        Function1 function12 = new Function1() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ExploreLegendUpsellComposableKt.MainLazilyLoadedContent$lambda$13$lambda$12(ready, paddingValues32, snapshotState, userInteractionEventDescriptor, localityStringResources, function02, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function12);
                        objRememberedValue2 = function12;
                        composerStartRestartGroup.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierFillMaxWidth$default2, lazyListState, null, false, null, centerHorizontally2, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 196608, 476);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        if ((i2 & 8) == 0) {
        }
        function02 = function0;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainLazilyLoadedContent$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState MainLazilyLoadedContent$lambda$9$lambda$8() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainLazilyLoadedContent$lambda$13$lambda$12(final ExploreLegendUpsellViewState.Ready ready, final PaddingValues paddingValues, SnapshotState snapshotState, final UserInteractionEventDescriptor userInteractionEventDescriptor, final LocalityStringResources localityStringResources, final Function0 function0, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        itemWithBlackBackground(LazyColumn, "hero-headline", false, ComposableLambda3.composableLambdaInstance(-919400962, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$1
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
                    ComposerKt.traceEventStart(-919400962, i, -1, "com.robinhood.android.blackwidow.ui.upsell.MainLazilyLoadedContent.<anonymous>.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:249)");
                }
                ExploreLegendUpsellComposableKt.m11455TitleStyledText8iNrtrE(C9859R.string.explore_legend, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, paddingValues.getTop(), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 5, null), 0, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        itemWithBlackBackground(LazyColumn, "hero-video", false, ComposableLambda3.composableLambdaInstance(161394805, true, new ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$2(ready, snapshotState)));
        ComposableSingletons$ExploreLegendUpsellComposableKt composableSingletons$ExploreLegendUpsellComposableKt = ComposableSingletons$ExploreLegendUpsellComposableKt.INSTANCE;
        itemWithBlackBackground$default(LazyColumn, "logo-legend", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$219377078$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithBlackBackground$default(LazyColumn, "text-platform", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$277359351$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithBlackBackground$default(LazyColumn, "vertical-line-1", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$335341624$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithBlackBackground$default(LazyColumn, "text-guided-by", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$393323897$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithBlackBackground$default(LazyColumn, SduiFeatureDiscovery3.CAROUSEL_TAG, false, ComposableLambda3.composableLambdaInstance(451306170, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$3
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
                    ComposerKt.traceEventStart(451306170, i, -1, "com.robinhood.android.blackwidow.ui.upsell.MainLazilyLoadedContent.<anonymous>.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:316)");
                }
                ExploreLegendUpsellComposableKt.Carousel(userInteractionEventDescriptor, ready.getVideoInfo(), null, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        itemWithBlackBackground(LazyColumn, "video-silver-candle-sticks", false, ComposableLambda3.composableLambdaInstance(509288443, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$4
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
                    ComposerKt.traceEventStart(509288443, i, -1, "com.robinhood.android.blackwidow.ui.upsell.MainLazilyLoadedContent.<anonymous>.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:321)");
                }
                VideoInfo videoInfo = ready.getVideoInfo().get("03_metal_candlesticks");
                if (videoInfo != null) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    ExploreLegendUpsellComposableKt.VideoContent(videoInfo, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 5, null), false, composer, 0, 4);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        itemWithGradientBackground(LazyColumn, "section-pulse-market", composableSingletons$ExploreLegendUpsellComposableKt.getLambda$133558204$feature_black_widow_upsell_externalDebug());
        itemWithGreyBackground$default(LazyColumn, "vertical-line-2", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$1955364908$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithGreyBackground$default(LazyColumn, "text-ideal-setup", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$1147424547$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithGreyBackground$default(LazyColumn, "divider-custom-layout", false, ComposableLambda3.composableLambdaInstance(1205406820, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$5
            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1205406820, i, -1, "com.robinhood.android.blackwidow.ui.upsell.MainLazilyLoadedContent.<anonymous>.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:347)");
                }
                ExploreLegendUpsellViewState.Ready ready2 = ready;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                ExploreLegendUpsellComposableKt.HorizontalLine(composer, 0);
                int i2 = C9859R.string.custom_layouts;
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                ExploreLegendUpsellComposableKt.m11453Headline3StyledText8iNrtrE(i2, null, companion3.m7924getStarte0LSkKk(), composer, 0, 2);
                Either.Left leftAsLeft = Either2.asLeft(Integer.valueOf(C9859R.string.build_your_ideal_layout));
                int iM7924getStarte0LSkKk = companion3.m7924getStarte0LSkKk();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                ExploreLegendUpsellComposableKt.m11452BodyStyledTextoTYcxuw(leftAsLeft, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 7, null), iM7924getStarte0LSkKk, 0.0f, composer, 0, 8);
                VideoInfo videoInfo = ready2.getVideoInfo().get("04_custom_layouts");
                composer.startReplaceGroup(-582364726);
                if (videoInfo != null) {
                    ExploreLegendUpsellComposableKt.VideoContent(videoInfo, null, false, composer, 0, 6);
                }
                composer.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21594getXlargeD9Ej5fM()), composer, 0);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }
        }), 2, null);
        itemWithGreyBackground$default(LazyColumn, "section-preset-layout", false, ComposableLambda3.composableLambdaInstance(1263389093, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$6
            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1263389093, i, -1, "com.robinhood.android.blackwidow.ui.upsell.MainLazilyLoadedContent.<anonymous>.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:374)");
                }
                LocalityStringResources localityStringResources2 = localityStringResources;
                ExploreLegendUpsellViewState.Ready ready2 = ready;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                ExploreLegendUpsellComposableKt.HorizontalLine(composer, 0);
                int i2 = C9859R.string.preset_layouts;
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                ExploreLegendUpsellComposableKt.m11453Headline3StyledText8iNrtrE(i2, null, companion3.m7924getStarte0LSkKk(), composer, 0, 2);
                Either.Right rightAsRight = Either2.asRight(localityStringResources2.getGated_options_select_your_presets());
                int iM7924getStarte0LSkKk = companion3.m7924getStarte0LSkKk();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                ExploreLegendUpsellComposableKt.m11452BodyStyledTextoTYcxuw(rightAsRight, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 7, null), iM7924getStarte0LSkKk, 0.0f, composer, 0, 8);
                VideoInfo videoInfo = ready2.getVideoInfo().get("05_preset_layout_no_etf");
                composer.startReplaceGroup(-695974453);
                if (videoInfo != null) {
                    ExploreLegendUpsellComposableKt.VideoContent(videoInfo, null, false, composer, 0, 6);
                }
                composer.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21596getXxlargeD9Ej5fM()), composer, 0);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }
        }), 2, null);
        itemWithGreyBackground$default(LazyColumn, "text-ready-when-you-are", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$1321371366$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithGreyBackground$default(LazyColumn, "text-once-you-spot-trend", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$1379353639$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithGreyBackground(LazyColumn, "video-buy-sequence", false, ComposableLambda3.composableLambdaInstance(1437335912, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$7
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
                    ComposerKt.traceEventStart(1437335912, i, -1, "com.robinhood.android.blackwidow.ui.upsell.MainLazilyLoadedContent.<anonymous>.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:422)");
                }
                VideoInfo videoInfo = ready.getVideoInfo().get("06_buy_sequence");
                if (videoInfo != null) {
                    ExploreLegendUpsellComposableKt.VideoContent(videoInfo, null, false, composer, 0, 6);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        itemWithGreyBackground$default(LazyColumn, "vertical-line-3", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$1495318185$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithGreyBackground$default(LazyColumn, "text-dynamic-linking", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$1553300458$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithGreyBackground$default(LazyColumn, "text-link-widgets", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$1611282731$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithGreyBackground(LazyColumn, "video-dual-screen-linking", false, ComposableLambda3.composableLambdaInstance(613859133, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$8
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
                    ComposerKt.traceEventStart(613859133, i, -1, "com.robinhood.android.blackwidow.ui.upsell.MainLazilyLoadedContent.<anonymous>.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:449)");
                }
                VideoInfo videoInfo = ready.getVideoInfo().get("07_dual_screen_linking");
                if (videoInfo != null) {
                    ExploreLegendUpsellComposableKt.VideoContent(videoInfo, null, false, composer, 0, 6);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        itemWithGreyBackground$default(LazyColumn, "text-but-one-more-thing", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$671841406$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithGreyBackground$default(LazyColumn, "vertical-line-4", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$729823679$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithGreyBackground$default(LazyColumn, "text-its-free", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$787805952$feature_black_widow_upsell_externalDebug(), 2, null);
        itemWithGreyBackground$default(LazyColumn, "text-legend-available", false, composableSingletons$ExploreLegendUpsellComposableKt.getLambda$845788225$feature_black_widow_upsell_externalDebug(), 2, null);
        if (ready.getShowBottomDisclosure()) {
            itemWithGreyBackground$default(LazyColumn, "link-bottom-disclosure", false, ComposableLambda3.composableLambdaInstance(723796551, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$9
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
                        ComposerKt.traceEventStart(723796551, i, -1, "com.robinhood.android.blackwidow.ui.upsell.MainLazilyLoadedContent.<anonymous>.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:481)");
                    }
                    ExploreLegendUpsellComposableKt.BottomDisclosureLink(function0, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, composer, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
        }
        itemWithGreyBackground(LazyColumn, "video-wave", false, ComposableLambda3.composableLambdaInstance(903770498, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$10
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
                    ComposerKt.traceEventStart(903770498, i, -1, "com.robinhood.android.blackwidow.ui.upsell.MainLazilyLoadedContent.<anonymous>.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:489)");
                }
                VideoInfo videoInfo = ready.getVideoInfo().get("08_bottom_wave");
                if (videoInfo != null) {
                    ExploreLegendUpsellComposableKt.VideoContent(videoInfo, null, false, composer, 0, 6);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void itemWithBlackBackground$default(LazyListScope lazyListScope, String str, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        itemWithBlackBackground(lazyListScope, str, z, function2);
    }

    public static /* synthetic */ void itemWithGreyBackground$default(LazyListScope lazyListScope, String str, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        itemWithGreyBackground(lazyListScope, str, z, function2);
    }

    public static /* synthetic */ void itemWithGradientBackground$default(LazyListScope lazyListScope, String str, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        itemWithGradientBackground(lazyListScope, str, function2);
    }

    public static final void itemWithGradientBackground(LazyListScope lazyListScope, String str, final Function2<? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        LazyListScope.item$default(lazyListScope, str, null, ComposableLambda3.composableLambdaInstance(236810930, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.itemWithGradientBackground.1
            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(236810930, i, -1, "com.robinhood.android.blackwidow.ui.upsell.itemWithGradientBackground.<anonymous> (ExploreLegendUpsellComposable.kt:539)");
                }
                float f = 20;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Background3.background$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4278190080L)), Color.m6701boximpl(Color2.Color(4279572249L))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), C2002Dp.m7995constructorimpl(f), 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 10, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                Function2<Composer, Integer, Unit> function2 = itemContent;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composer, 0);
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
        }), 2, null);
    }

    public static final void PulseMarketSection(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2024946421);
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
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2024946421, i3, -1, "com.robinhood.android.blackwidow.ui.upsell.PulseMarketSection (ExploreLegendUpsellComposable.kt:558)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21596getXxlargeD9Ej5fM(), 7, null), 0.0f, 1, null);
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
            m11453Headline3StyledText8iNrtrE(C9859R.string.the_pulse_of_the_market, null, 0, composerStartRestartGroup, 0, 6);
            m11452BodyStyledTextoTYcxuw(Either2.asLeft(Integer.valueOf(C9859R.string.get_live_data_updating)), null, 0, 0.0f, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExploreLegendUpsellComposableKt.PulseMarketSection$lambda$16(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomBarEmailCta(final Function0<Unit> onCtaClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2095041873);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(onCtaClicked) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2095041873, i4, -1, "com.robinhood.android.blackwidow.ui.upsell.BottomBarEmailCta (ExploreLegendUpsellComposable.kt:573)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(modifier3, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "black-widow-upsell-email-cta", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
                BentoButtonKt.m20586BentoButtonEikTQX8(onCtaClicked, AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(C9859R.string.cta_text, bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, 0, 4).getText(), modifierFillMaxWidth$default, new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.MESSAGE_SEND_16, BentoButtons.Icon.Position.Trailing), null, false, false, Color.m6701boximpl(BentoColor.INSTANCE.m21137getBlackWidowNewTennis0d7_KjU()), null, null, new TextStyle(0L, 0L, FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getPhonicFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777179, (DefaultConstructorMarker) null), false, null, composerStartRestartGroup, (i4 & 14) | (BentoButtons.Icon.Size16.$stable << 9), 0, 7024);
                m11454SmallStyledTextxkNWiIY(C9859R.string.cta_subtitle, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.75f, 0, composerStartRestartGroup, 432, 8);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ExploreLegendUpsellComposableKt.BottomBarEmailCta$lambda$18(onCtaClicked, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifier42 = modifier3;
            Modifier modifierM5145paddingqDBjuR02 = PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(modifier3, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR02);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion22, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "black-widow-upsell-email-cta", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
                BentoButtonKt.m20586BentoButtonEikTQX8(onCtaClicked, AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(C9859R.string.cta_text, bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, 0, 4).getText(), modifierFillMaxWidth$default2, new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.MESSAGE_SEND_16, BentoButtons.Icon.Position.Trailing), null, false, false, Color.m6701boximpl(BentoColor.INSTANCE.m21137getBlackWidowNewTennis0d7_KjU()), null, null, new TextStyle(0L, 0L, FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getPhonicFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777179, (DefaultConstructorMarker) null), false, null, composerStartRestartGroup, (i4 & 14) | (BentoButtons.Icon.Size16.$stable << 9), 0, 7024);
                m11454SmallStyledTextxkNWiIY(C9859R.string.cta_subtitle, SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), 0.75f, 0, composerStartRestartGroup, 432, 8);
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
    public static final void BottomBarLinkCta(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-363623466);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-363623466, i, -1, "com.robinhood.android.blackwidow.ui.upsell.BottomBarLinkCta (ExploreLegendUpsellComposable.kt:619)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, i2).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
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
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TEXT_VIEW, "black-widow-upsell-link-cta", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            FontFamily phonicFontFamily = FontHelper.INSTANCE.getPhonicFontFamily();
            TextStyle textStyle = new TextStyle(0L, TextUnit2.getSp(18), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, phonicFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(20.8d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceGroup(1790548778);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            String strStringResource = StringResources_androidKt.stringResource(C9859R.string.bottom_bar_link_cta, composerStartRestartGroup, 0);
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strStringResource, "robinhood.com/legend", 0, false, 6, (Object) null);
            builder.append(strStringResource);
            builder.addStyle(new SpanStyle(BentoColor.INSTANCE.m21137getBlackWidowNewTennis0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null), iIndexOf$default, iIndexOf$default + 20);
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifierAutoLogEvents$default, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, null, textStyle, composer2, 0, 0, 8124);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExploreLegendUpsellComposableKt.BottomBarLinkCta$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TradingPlatformDynamicText(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(819376908);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(819376908, i, -1, "com.robinhood.android.blackwidow.ui.upsell.TradingPlatformDynamicText (ExploreLegendUpsellComposable.kt:664)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C9859R.string.trading_platform_in_browser_variant_2, composerStartRestartGroup, 0);
            Color colorM6701boximpl = Color.m6701boximpl(Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null));
            FontFamily phonicFontFamily = FontHelper.INSTANCE.getPhonicFontFamily();
            FontWeight normal = FontWeight.INSTANCE.getNormal();
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, new TextStyle(0L, TextUnit2.getSp(16), normal, (FontStyle) null, (FontSynthesis) null, phonicFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, TextUnit2.getSp(25.6d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613337, (DefaultConstructorMarker) null), composer2, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExploreLegendUpsellComposableKt.TradingPlatformDynamicText$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Carousel(final UserInteractionEventDescriptor eventDescriptor, final ImmutableMap<String, VideoInfo> videoInfo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Context context;
        ComponentCallbacks2 componentCallbacks2;
        final List listListOf;
        boolean zChangedInstance;
        Object objRememberedValue;
        PagerState pagerStateRememberPagerState;
        Object objRememberedValue2;
        final ImmutableList immutableList;
        Object objRememberedValue3;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue4;
        SnapshotIntState2 snapshotIntState2;
        EventLogger current;
        Object objRememberedValue5;
        SnapshotIntState2 snapshotIntState22;
        boolean zChanged;
        PagerState pagerState;
        final List list;
        Object exploreLegendUpsellComposableKt$Carousel$1$1;
        SnapshotIntState2 snapshotIntState23;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventDescriptor, "eventDescriptor");
        Intrinsics.checkNotNullParameter(videoInfo, "videoInfo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1425561789);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventDescriptor) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(videoInfo) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-1425561789, i3, -1, "com.robinhood.android.blackwidow.ui.upsell.Carousel (ExploreLegendUpsellComposable.kt:690)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if (context instanceof Application) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                    componentCallbacks2 = (Application) applicationContext;
                } else {
                    componentCallbacks2 = (Application) context;
                }
                LocalityStringResources localityStringResources = ((ExploreLegendUpsellFragment.ExploreLegendUpsellEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).localityStringResources();
                listListOf = CollectionsKt.listOf((Object[]) new CarouselContent[]{new CarouselContent((VideoInfo) MapsKt.getValue(videoInfo, "02_trading"), StringResources_androidKt.stringResource(C9859R.string.trade_on_the_chart_label, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.CHART_LINE_24, localityStringResources.getTrade_on_the_chart_desc()), new CarouselContent((VideoInfo) MapsKt.getValue(videoInfo, "02_indicators"), StringResources_androidKt.stringResource(C9859R.string.technical_indicators_label, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.NOTIFICATION_24, localityStringResources.getTechnical_indicators_desc()), new CarouselContent((VideoInfo) MapsKt.getValue(videoInfo, "02_drawing"), StringResources_androidKt.stringResource(C9859R.string.drawing_tools_label, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.EDIT_24, localityStringResources.getDrawing_tools_desc()), new CarouselContent((VideoInfo) MapsKt.getValue(videoInfo, "02_intervals"), StringResources_androidKt.stringResource(C9859R.string.custom_intervals_label, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.CLOCK_24, localityStringResources.getCustom_intervals_desc())});
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(listListOf);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(listListOf.size());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                float f = 0.0f;
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (i5 < 4) {
                        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
                        exoPlayerBuild.setRepeatMode(1);
                        exoPlayerBuild.setVideoScalingMode(1);
                        exoPlayerBuild.setVolume(f);
                        Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "apply(...)");
                        arrayList.add(exoPlayerBuild);
                        i5++;
                        f = 0.0f;
                    }
                    objRememberedValue2 = extensions2.toImmutableList(arrayList);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                immutableList = (ImmutableList) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    LongList2 longList2 = new LongList2(4);
                    longList2.addAll(longList2._size, new long[]{0, 0, 0, 0});
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(longList2, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotIntState3.mutableIntStateOf(-1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotIntState22 = (SnapshotIntState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(pagerStateRememberPagerState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(listListOf) | composerStartRestartGroup.changedInstance(eventDescriptor) | composerStartRestartGroup.changedInstance(immutableList);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue7 == companion.getEmpty()) {
                    pagerState = pagerStateRememberPagerState;
                    list = listListOf;
                    snapshotIntState23 = snapshotIntState2;
                    exploreLegendUpsellComposableKt$Carousel$1$1 = new ExploreLegendUpsellComposableKt$Carousel$1$1(pagerState, current, list, eventDescriptor, immutableList, snapshotIntState22, snapshotIntState23, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(exploreLegendUpsellComposableKt$Carousel$1$1);
                } else {
                    pagerState = pagerStateRememberPagerState;
                    exploreLegendUpsellComposableKt$Carousel$1$1 = objRememberedValue7;
                    list = listListOf;
                    snapshotIntState23 = snapshotIntState2;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(pagerState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) exploreLegendUpsellComposableKt$Carousel$1$1, composerStartRestartGroup, 0);
                String label = ((CarouselContent) list.get(snapshotIntState23.getIntValue())).getLabel();
                ServerToBentoAssetMapper2 icon = ((CarouselContent) list.get(snapshotIntState23.getIntValue())).getIcon();
                String description = ((CarouselContent) list.get(snapshotIntState23.getIntValue())).getDescription();
                boolean z = snapshotIntState23.getIntValue() <= 0;
                boolean z2 = snapshotIntState23.getIntValue() >= list.size() - 1;
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(immutableList);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ExploreLegendUpsellComposableKt.Carousel$lambda$40$lambda$39(immutableList, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composerStartRestartGroup, 6);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                PagerState pagerState2 = pagerState;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE)), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-681229574, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$Carousel$3$1
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                        invoke(pagerScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PagerScope HorizontalPager, int i6, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-681229574, i7, -1, "com.robinhood.android.blackwidow.ui.upsell.Carousel.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:825)");
                        }
                        ExploreLegendUpsellComposableKt.CarouselVideoPlayer(list.get(i6).getVideo().getMediaSource(), immutableList.get(i6), null, composer2, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                PagerKt.m5301HorizontalPager8jOkeI(pagerState2, modifierM5146paddingqDBjuR0$default, null, null, 4, 0.0f, null, null, false, false, null, null, null, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, 24576, 24576, 16364);
                CarouselNavigation(icon, label, pagerState2, snapshotIntState23.getIntValue(), z, z2, list.size(), composerStartRestartGroup, 0, 0);
                m11452BodyStyledTextoTYcxuw(Either2.asRight(description), null, TextAlign.INSTANCE.m7924getStarte0LSkKk(), 0.0f, composerStartRestartGroup, 0, 10);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ExploreLegendUpsellComposableKt.Carousel$lambda$42(eventDescriptor, videoInfo, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (context instanceof Application) {
            }
            LocalityStringResources localityStringResources2 = ((ExploreLegendUpsellFragment.ExploreLegendUpsellEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).localityStringResources();
            listListOf = CollectionsKt.listOf((Object[]) new CarouselContent[]{new CarouselContent((VideoInfo) MapsKt.getValue(videoInfo, "02_trading"), StringResources_androidKt.stringResource(C9859R.string.trade_on_the_chart_label, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.CHART_LINE_24, localityStringResources2.getTrade_on_the_chart_desc()), new CarouselContent((VideoInfo) MapsKt.getValue(videoInfo, "02_indicators"), StringResources_androidKt.stringResource(C9859R.string.technical_indicators_label, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.NOTIFICATION_24, localityStringResources2.getTechnical_indicators_desc()), new CarouselContent((VideoInfo) MapsKt.getValue(videoInfo, "02_drawing"), StringResources_androidKt.stringResource(C9859R.string.drawing_tools_label, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.EDIT_24, localityStringResources2.getDrawing_tools_desc()), new CarouselContent((VideoInfo) MapsKt.getValue(videoInfo, "02_intervals"), StringResources_androidKt.stringResource(C9859R.string.custom_intervals_label, composerStartRestartGroup, 0), ServerToBentoAssetMapper2.CLOCK_24, localityStringResources2.getCustom_intervals_desc())});
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(listListOf);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(listListOf.size());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                float f2 = 0.0f;
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                immutableList = (ImmutableList) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                snapshotIntState22 = (SnapshotIntState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(pagerStateRememberPagerState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(listListOf) | composerStartRestartGroup.changedInstance(eventDescriptor) | composerStartRestartGroup.changedInstance(immutableList);
                Object objRememberedValue72 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    pagerState = pagerStateRememberPagerState;
                    list = listListOf;
                    snapshotIntState23 = snapshotIntState2;
                    exploreLegendUpsellComposableKt$Carousel$1$1 = new ExploreLegendUpsellComposableKt$Carousel$1$1(pagerState, current, list, eventDescriptor, immutableList, snapshotIntState22, snapshotIntState23, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(exploreLegendUpsellComposableKt$Carousel$1$1);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(pagerState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) exploreLegendUpsellComposableKt$Carousel$1$1, composerStartRestartGroup, 0);
                    String label2 = ((CarouselContent) list.get(snapshotIntState23.getIntValue())).getLabel();
                    ServerToBentoAssetMapper2 icon2 = ((CarouselContent) list.get(snapshotIntState23.getIntValue())).getIcon();
                    String description2 = ((CarouselContent) list.get(snapshotIntState23.getIntValue())).getDescription();
                    if (snapshotIntState23.getIntValue() <= 0) {
                    }
                    if (snapshotIntState23.getIntValue() >= list.size() - 1) {
                    }
                    Unit unit2 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(immutableList);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda29
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ExploreLegendUpsellComposableKt.Carousel$lambda$40$lambda$39(immutableList, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composerStartRestartGroup, 6);
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion22);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        PagerState pagerState22 = pagerState;
                        Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE)), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null);
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-681229574, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$Carousel$3$1
                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                                    invoke(pagerScope, num.intValue(), composer2, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PagerScope HorizontalPager, int i6, Composer composer2, int i7) {
                                    Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-681229574, i7, -1, "com.robinhood.android.blackwidow.ui.upsell.Carousel.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:825)");
                                    }
                                    ExploreLegendUpsellComposableKt.CarouselVideoPlayer(list.get(i6).getVideo().getMediaSource(), immutableList.get(i6), null, composer2, 0, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Modifier modifier52 = modifier4;
                            PagerKt.m5301HorizontalPager8jOkeI(pagerState22, modifierM5146paddingqDBjuR0$default2, null, null, 4, 0.0f, null, null, false, false, null, null, null, null, composableLambdaRememberComposableLambda2, composerStartRestartGroup, 24576, 24576, 16364);
                            CarouselNavigation(icon2, label2, pagerState22, snapshotIntState23.getIntValue(), z, z2, list.size(), composerStartRestartGroup, 0, 0);
                            m11452BodyStyledTextoTYcxuw(Either2.asRight(description2), null, TextAlign.INSTANCE.m7924getStarte0LSkKk(), 0.0f, composerStartRestartGroup, 0, 10);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void CarouselVideoPlayer(final MediaSource video, final ExoPlayer exoPlayer, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Composer composerStartRestartGroup = composer.startRestartGroup(1323916791);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(video) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(exoPlayer) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1323916791, i3, -1, "com.robinhood.android.blackwidow.ui.upsell.CarouselVideoPlayer (ExploreLegendUpsellComposable.kt:857)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                exoPlayer.setMediaSource(video);
                exoPlayer.prepare();
                PlayerView playerView = new PlayerView(context);
                playerView.hideController();
                playerView.setUseController(false);
                playerView.setResizeMode(4);
                playerView.setShutterBackgroundColor(0);
                playerView.setPlayer(exoPlayer);
                composerStartRestartGroup.updateRememberedValue(playerView);
                obj = playerView;
            }
            final PlayerView playerView2 = (PlayerView) obj;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(playerView2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ExploreLegendUpsellComposableKt.CarouselVideoPlayer$lambda$47$lambda$46(playerView2, (Context) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifier3, null, composerStartRestartGroup, (i3 >> 3) & 112, 4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ExploreLegendUpsellComposableKt.CarouselVideoPlayer$lambda$48(video, exoPlayer, modifier2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CarouselNavigation(final ServerToBentoAssetMapper2 serverToBentoAssetMapper2, final String str, final PagerState pagerState, final int i, final boolean z, final boolean z2, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        boolean z3;
        int i6;
        int i7;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final int i8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1958260714);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(serverToBentoAssetMapper2.ordinal()) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            if ((i4 & 4) == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    i5 |= composerStartRestartGroup.changed(pagerState) ? 256 : 128;
                }
                if ((i4 & 8) != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
                    }
                    if ((i4 & 16) == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            z3 = z;
                            i5 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                        }
                        if ((i4 & 32) != 0) {
                            i5 |= 196608;
                        } else {
                            if ((i3 & 196608) == 0) {
                                i5 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                            i6 = i4 & 64;
                            if (i6 != 0) {
                                if ((1572864 & i3) == 0) {
                                    i7 = i2;
                                    i5 |= composerStartRestartGroup.changed(i7) ? 1048576 : 524288;
                                }
                                if ((599187 & i5) == 599186 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    composer2 = composerStartRestartGroup;
                                    i8 = i7;
                                } else {
                                    int i9 = i6 == 0 ? i7 : 4;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1958260714, i5, -1, "com.robinhood.android.blackwidow.ui.upsell.CarouselNavigation (ExploreLegendUpsellComposable.kt:893)");
                                    }
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i10 = BentoTheme.$stable;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierWrapContentHeight$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM(), 5, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                                    int i11 = i5;
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    int i12 = i9;
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2), null, bentoTheme.getColors(composerStartRestartGroup, i10).m21425getFg0d7_KjU(), PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM()), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
                                    BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.wrapContentWidth$default(companion, null, false, 3, null), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, null, composerStartRestartGroup, ((i11 >> 3) & 14) | 12582912, 0, 16252);
                                    composer2 = composerStartRestartGroup;
                                    Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composer2, 0);
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1245169209, true, new ExploreLegendUpsellComposableKt$CarouselNavigation$1$1(coroutineScope, pagerState, i, z3, i12, z2), composer2, 54), composer2, 6);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    i8 = i12;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return ExploreLegendUpsellComposableKt.CarouselNavigation$lambda$50(serverToBentoAssetMapper2, str, pagerState, i, z, z2, i8, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 1572864;
                            i7 = i2;
                            if ((599187 & i5) == 599186) {
                                if (i6 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, false, 3, null);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i102 = BentoTheme.$stable;
                                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierWrapContentHeight$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21590getDefaultD9Ej5fM(), 5, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                int i112 = i5;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    int i122 = i9;
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2), null, bentoTheme2.getColors(composerStartRestartGroup, i102).m21425getFg0d7_KjU(), PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21590getDefaultD9Ej5fM()), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
                                    BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.wrapContentWidth$default(companion3, null, false, 3, null), 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, null, composerStartRestartGroup, ((i112 >> 3) & 14) | 12582912, 0, 16252);
                                    composer2 = composerStartRestartGroup;
                                    Spacer2.Spacer(Row5.weight$default(row62, companion3, 1.0f, false, 2, null), composer2, 0);
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1245169209, true, new ExploreLegendUpsellComposableKt$CarouselNavigation$1$1(coroutineScope2, pagerState, i, z3, i122, z2), composer2, 54), composer2, 6);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i8 = i122;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i6 = i4 & 64;
                        if (i6 != 0) {
                        }
                        i7 = i2;
                        if ((599187 & i5) == 599186) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z3 = z;
                    if ((i4 & 32) != 0) {
                    }
                    i6 = i4 & 64;
                    if (i6 != 0) {
                    }
                    i7 = i2;
                    if ((599187 & i5) == 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i4 & 16) == 0) {
                }
                z3 = z;
                if ((i4 & 32) != 0) {
                }
                i6 = i4 & 64;
                if (i6 != 0) {
                }
                i7 = i2;
                if ((599187 & i5) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i4 & 8) != 0) {
            }
            if ((i4 & 16) == 0) {
            }
            z3 = z;
            if ((i4 & 32) != 0) {
            }
            i6 = i4 & 64;
            if (i6 != 0) {
            }
            i7 = i2;
            if ((599187 & i5) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i4 & 4) == 0) {
        }
        if ((i4 & 8) != 0) {
        }
        if ((i4 & 16) == 0) {
        }
        z3 = z;
        if ((i4 & 32) != 0) {
        }
        i6 = i4 & 64;
        if (i6 != 0) {
        }
        i7 = i2;
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HorizontalLine(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(129286284);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(129286284, i, -1, "com.robinhood.android.blackwidow.ui.upsell.HorizontalLine (ExploreLegendUpsellComposable.kt:969)");
            }
            Divider5.m5851HorizontalDivider9IZ8Weo(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(16), 1, null), C2002Dp.m7995constructorimpl(1), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExploreLegendUpsellComposableKt.HorizontalLine$lambda$51(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalFadedLine(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1065770959);
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
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1065770959, i3, -1, "com.robinhood.android.blackwidow.ui.upsell.VerticalFadedLine (ExploreLegendUpsellComposable.kt:980)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            modifier3 = modifier4;
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C9859R.raw.dash), null, null, null, 0, null, composerStartRestartGroup, 0, 62), (String) null, SizeKt.wrapContentWidth$default(SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 5, null), C2002Dp.m7995constructorimpl(200)), null, false, 3, null), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExploreLegendUpsellComposableKt.VerticalFadedLine$lambda$52(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LegendLogo(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-868103517);
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
                ComposerKt.traceEventStart(-868103517, i3, -1, "com.robinhood.android.blackwidow.ui.upsell.LegendLogo (ExploreLegendUpsellComposable.kt:992)");
            }
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(C9859R.drawable.robinhood_legend_vector, composerStartRestartGroup, 0), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), C2002Dp.m7995constructorimpl(110)), C2002Dp.m7995constructorimpl(26)), (Alignment) null, ContentScale.INSTANCE.getNone(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExploreLegendUpsellComposableKt.LegendLogo$lambda$54(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoContent(final VideoInfo video, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(video, "video");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1637032068);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(video) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
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
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    ?? r15 = i4 == 0 ? 1 : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1637032068, i3, -1, "com.robinhood.android.blackwidow.ui.upsell.VideoContent (ExploreLegendUpsellComposable.kt:1017)");
                    }
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, 3, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    AnimationExoPlayerConfig animationExoPlayerConfig = new AnimationExoPlayerConfig(r15, 1);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(video);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ExploreLegendUpsellComposableKt.VideoContent$lambda$57$lambda$56$lambda$55(video, (ExoPlayer) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AnimationExoPlayer2.AnimationExoPlayer(animationExoPlayerConfig, null, false, 0, null, null, (Function1) objRememberedValue, composerStartRestartGroup, AnimationExoPlayerConfig.$stable, 62);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z3 = r15;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ExploreLegendUpsellComposableKt.VideoContent$lambda$58(video, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i3 & 147) == 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, 3, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    AnimationExoPlayerConfig animationExoPlayerConfig2 = new AnimationExoPlayerConfig(r15, 1);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(video);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ExploreLegendUpsellComposableKt.VideoContent$lambda$57$lambda$56$lambda$55(video, (ExoPlayer) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        AnimationExoPlayer2.AnimationExoPlayer(animationExoPlayerConfig2, null, false, 0, null, null, (Function1) objRememberedValue, composerStartRestartGroup, AnimationExoPlayerConfig.$stable, 62);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        z3 = r15;
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
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoContent$lambda$57$lambda$56$lambda$55(VideoInfo videoInfo, ExoPlayer AnimationExoPlayer) {
        Intrinsics.checkNotNullParameter(AnimationExoPlayer, "$this$AnimationExoPlayer");
        AnimationExoPlayer.setMediaSource(videoInfo.getMediaSource());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomDisclosureLink(final Function0<Unit> function0, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f2;
        final float f3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2073006829);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    f2 = f;
                    i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    f3 = f2;
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    f3 = i4 == 0 ? 0.75f : f2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2073006829, i3, -1, "com.robinhood.android.blackwidow.ui.upsell.BottomDisclosureLink (ExploreLegendUpsellComposable.kt:1040)");
                    }
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, function0, 7, null);
                    Modifier modifier4 = modifier2;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), StringResources_androidKt.stringResource(C11048R.string.general_label_disclosure, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), Alpha.alpha(Modifier.INSTANCE, f3), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
                    m11454SmallStyledTextxkNWiIY(C9859R.string.bottom_disclosure_label, null, 0.75f, 0, composerStartRestartGroup, 384, 10);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ExploreLegendUpsellComposableKt.BottomDisclosureLink$lambda$60(function0, modifier3, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            f2 = f;
            if ((i3 & 147) == 146) {
                if (i5 != 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, function0, 7, null);
                Modifier modifier42 = modifier2;
                Arrangement arrangement2 = Arrangement.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), StringResources_androidKt.stringResource(C11048R.string.general_label_disclosure, composerStartRestartGroup, 0), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), Alpha.alpha(Modifier.INSTANCE, f3), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
                    m11454SmallStyledTextxkNWiIY(C9859R.string.bottom_disclosure_label, null, 0.75f, 0, composerStartRestartGroup, 384, 10);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
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
        f2 = f;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppBar(Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        Function0<Unit> function03;
        int i3;
        final Function0<Unit> function04;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        final Function0<Unit> function07;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(207067782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function03 = function0;
        } else if ((i & 6) == 0) {
            function03 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function03) ? 4 : 2) | i;
        } else {
            function03 = function0;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                function04 = function02;
                i3 |= composerStartRestartGroup.changedInstance(function04) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function05 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    function05 = function03;
                }
                if (i5 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function06 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    function06 = function04;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(207067782, i3, -1, "com.robinhood.android.blackwidow.ui.upsell.AppBar (ExploreLegendUpsellComposable.kt:1063)");
                }
                Function0<Unit> function08 = function06;
                function07 = function05;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$ExploreLegendUpsellComposableKt.INSTANCE.m11439getLambda$931290567$feature_black_widow_upsell_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-991324827, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.AppBar.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                        invoke(bentoAppBarScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i6 & 6) == 0) {
                            i6 |= (i6 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-991324827, i6, -1, "com.robinhood.android.blackwidow.ui.upsell.AppBar.<anonymous> (ExploreLegendUpsellComposable.kt:1066)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function06, composer2, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1741280292, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.AppBar.4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                        invoke(row5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i6 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1741280292, i6, -1, "com.robinhood.android.blackwidow.ui.upsell.AppBar.<anonymous> (ExploreLegendUpsellComposable.kt:1072)");
                        }
                        IconButton5.IconButton(function05, Modifier.INSTANCE, false, null, null, ComposableSingletons$ExploreLegendUpsellComposableKt.INSTANCE.getLambda$62447335$feature_black_widow_upsell_externalDebug(), composer2, 196656, 28);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, true, false, null, null, Color.INSTANCE.m6725getTransparent0d7_KjU(), null, composerStartRestartGroup, 805506438, 0, 1490);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function04 = function08;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function07 = function03;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ExploreLegendUpsellComposableKt.AppBar$lambda$65(function07, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        function04 = function02;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Function0<Unit> function082 = function06;
            function07 = function05;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$ExploreLegendUpsellComposableKt.INSTANCE.m11439getLambda$931290567$feature_black_widow_upsell_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-991324827, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.AppBar.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                    invoke(bentoAppBarScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i6 & 6) == 0) {
                        i6 |= (i6 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-991324827, i6, -1, "com.robinhood.android.blackwidow.ui.upsell.AppBar.<anonymous> (ExploreLegendUpsellComposable.kt:1066)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function06, composer2, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1741280292, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.AppBar.4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 BentoAppBar, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i6 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1741280292, i6, -1, "com.robinhood.android.blackwidow.ui.upsell.AppBar.<anonymous> (ExploreLegendUpsellComposable.kt:1072)");
                    }
                    IconButton5.IconButton(function05, Modifier.INSTANCE, false, null, null, ComposableSingletons$ExploreLegendUpsellComposableKt.INSTANCE.getLambda$62447335$feature_black_widow_upsell_externalDebug(), composer2, 196656, 28);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, true, false, null, null, Color.INSTANCE.m6725getTransparent0d7_KjU(), null, composerStartRestartGroup, 805506438, 0, 1490);
            if (ComposerKt.isTraceInProgress()) {
            }
            function04 = function082;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: TitleStyledText-8iNrtrE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11455TitleStyledText8iNrtrE(final int i, Modifier modifier, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        int i8;
        Modifier modifier3;
        int iM7919getCentere0LSkKk;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier4;
        final int i9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1828232824);
        if ((i4 & 1) != 0) {
            i6 = i3 | 6;
            i5 = i;
        } else if ((i3 & 6) == 0) {
            i5 = i;
            i6 = (composerStartRestartGroup.changed(i5) ? 4 : 2) | i3;
        } else {
            i5 = i;
            i6 = i3;
        }
        int i10 = i4 & 2;
        if (i10 == 0) {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 384) != 0) {
                if ((i4 & 4) == 0) {
                    i7 = i2;
                    int i11 = composerStartRestartGroup.changed(i7) ? 256 : 128;
                    i6 |= i11;
                } else {
                    i7 = i2;
                }
                i6 |= i11;
            } else {
                i7 = i2;
            }
            if ((i6 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                i9 = i7;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i4 & 4) == 0) {
                        i8 = i6 & (-897);
                        modifier3 = modifier5;
                        iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1828232824, i8, -1, "com.robinhood.android.blackwidow.ui.upsell.TitleStyledText (ExploreLegendUpsellComposable.kt:1091)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i12 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i12).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(i5, bentoTheme.getColors(composerStartRestartGroup, i12).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, i8 & 14, 4), BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, companion.getCenter()), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, null, new TextStyle(0L, TextUnit2.getSp(60), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getMartinaFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(63), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composerStartRestartGroup, (i8 << 12) & 3670016, 0, 8124);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        i9 = iM7919getCentere0LSkKk;
                    } else {
                        i8 = i6;
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i4 & 4) != 0) {
                        i6 &= -897;
                    }
                    i8 = i6;
                    modifier3 = modifier2;
                }
                iM7919getCentere0LSkKk = i7;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i122 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i122).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(i5, bentoTheme2.getColors(composerStartRestartGroup, i122).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, i8 & 14, 4), BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, companion3.getCenter()), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, null, new TextStyle(0L, TextUnit2.getSp(60), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getMartinaFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(63), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composerStartRestartGroup, (i8 << 12) & 3670016, 0, 8124);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    i9 = iM7919getCentere0LSkKk;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ExploreLegendUpsellComposableKt.TitleStyledText_8iNrtrE$lambda$67(i, modifier4, i9, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i6 |= 48;
        modifier2 = modifier;
        if ((i3 & 384) != 0) {
        }
        if ((i6 & 147) != 146) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i10 == 0) {
                }
                if ((i4 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Headline2StyledText(final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(915655478);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i4 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(915655478, i4, -1, "com.robinhood.android.blackwidow.ui.upsell.Headline2StyledText (ExploreLegendUpsellComposable.kt:1115)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21594getXlargeD9Ej5fM(), 2, null);
                modifier3 = modifier4;
                BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(i, bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, i4 & 14, 4), modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, new TextStyle(0L, TextUnit2.getSp(40), FontWeight.INSTANCE.getLight(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getPhonicFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(48), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composerStartRestartGroup, 0, 0, 8124);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ExploreLegendUpsellComposableKt.Headline2StyledText$lambda$69(i, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i4 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21594getXlargeD9Ej5fM(), 2, null);
                modifier3 = modifier4;
                BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(i, bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, i4 & 14, 4), modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, new TextStyle(0L, TextUnit2.getSp(40), FontWeight.INSTANCE.getLight(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getPhonicFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(48), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composerStartRestartGroup, 0, 0, 8124);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: Headline3StyledText-8iNrtrE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11453Headline3StyledText8iNrtrE(final int i, Modifier modifier, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        Modifier modifier3;
        int i8;
        int iM7919getCentere0LSkKk;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final int i9;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-315553887);
        if ((i4 & 1) != 0) {
            i6 = i3 | 6;
            i5 = i;
        } else if ((i3 & 6) == 0) {
            i5 = i;
            i6 = (composerStartRestartGroup.changed(i5) ? 4 : 2) | i3;
        } else {
            i5 = i;
            i6 = i3;
        }
        int i10 = i4 & 2;
        if (i10 == 0) {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 384) != 0) {
                if ((i4 & 4) == 0) {
                    i7 = i2;
                    int i11 = composerStartRestartGroup.changed(i7) ? 256 : 128;
                    i6 |= i11;
                } else {
                    i7 = i2;
                }
                i6 |= i11;
            } else {
                i7 = i2;
            }
            if ((i6 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                i9 = i7;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i4 & 4) == 0) {
                        i8 = i6 & (-897);
                        iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-315553887, i8, -1, "com.robinhood.android.blackwidow.ui.upsell.Headline3StyledText (ExploreLegendUpsellComposable.kt:1141)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i12 = BentoTheme.$stable;
                        BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(i5, bentoTheme.getColors(composerStartRestartGroup, i12).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, i8 & 14, 4), PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i12).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, null, new TextStyle(0L, TextUnit2.getSp(24), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getPhonicFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(25.92d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composerStartRestartGroup, (i8 << 12) & 3670016, 0, 8124);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Modifier modifier5 = modifier3;
                        i9 = iM7919getCentere0LSkKk;
                        modifier4 = modifier5;
                    } else {
                        i8 = i6;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i4 & 4) != 0) {
                        i6 &= -897;
                    }
                    i8 = i6;
                    modifier3 = modifier2;
                }
                iM7919getCentere0LSkKk = i7;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i122 = BentoTheme.$stable;
                    BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(i5, bentoTheme2.getColors(composerStartRestartGroup, i122).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, i8 & 14, 4), PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i122).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, null, new TextStyle(0L, TextUnit2.getSp(24), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getPhonicFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(25.92d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composerStartRestartGroup, (i8 << 12) & 3670016, 0, 8124);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier52 = modifier3;
                    i9 = iM7919getCentere0LSkKk;
                    modifier4 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ExploreLegendUpsellComposableKt.Headline3StyledText_8iNrtrE$lambda$71(i, modifier4, i9, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i6 |= 48;
        modifier2 = modifier;
        if ((i3 & 384) != 0) {
        }
        if ((i6 & 147) != 146) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i10 == 0) {
                }
                if ((i4 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023c  */
    /* renamed from: BodyStyledText-oTYcxuw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11452BodyStyledTextoTYcxuw(final Either<Integer, String> either, Modifier modifier, int i, float f, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        float f2;
        Modifier modifier3;
        int iM7919getCentere0LSkKk;
        int i7;
        int i8;
        float f3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        AnnotatedString annotatedStringM22061annotatedStringResourceRIQooxk;
        final int i9;
        final Modifier modifier4;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-164254612);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(either) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    i5 = i;
                    int i11 = composerStartRestartGroup.changed(i5) ? 256 : 128;
                    i4 |= i11;
                } else {
                    i5 = i;
                }
                i4 |= i11;
            } else {
                i5 = i;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    f2 = f;
                    i4 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                }
                if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    i9 = i5;
                    f4 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 4) == 0) {
                            iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                            i4 &= -897;
                        } else {
                            iM7919getCentere0LSkKk = i5;
                        }
                        if (i6 == 0) {
                            i7 = i4;
                            i8 = iM7919getCentere0LSkKk;
                            f3 = 0.75f;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-164254612, i7, -1, "com.robinhood.android.blackwidow.ui.upsell.BodyStyledText (ExploreLegendUpsellComposable.kt:1165)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Modifier modifierAlign = BoxScopeInstance.INSTANCE.align(Alpha.alpha(Modifier.INSTANCE, f3), companion.getCenter());
                            composerStartRestartGroup.startReplaceGroup(894889963);
                            if (either instanceof Either.Left) {
                                if (!(either instanceof Either.Right)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                annotatedStringM22061annotatedStringResourceRIQooxk = AnnotatedStringResource.m22061annotatedStringResourceRIQooxk((String) ((Either.Right) either).getValue(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, 0, 4);
                            } else {
                                annotatedStringM22061annotatedStringResourceRIQooxk = AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(((Number) ((Either.Left) either).getValue()).intValue(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, 0, 4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            float f5 = f3;
                            BentoText2.m20748BentoTextQnj7Zds(annotatedStringM22061annotatedStringResourceRIQooxk, modifierAlign, null, null, null, null, TextAlign.m7912boximpl(i8), 0, false, 0, 0, null, null, new TextStyle(0L, TextUnit2.getSp(16), FontWeight.INSTANCE.getLight(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getPhonicFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(20.8d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composerStartRestartGroup, (i7 << 12) & 3670016, 0, 8124);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Modifier modifier5 = modifier3;
                            i9 = i8;
                            modifier4 = modifier5;
                            f4 = f5;
                        } else {
                            i7 = i4;
                            i8 = iM7919getCentere0LSkKk;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        i7 = i4;
                        modifier3 = modifier2;
                        i8 = i5;
                    }
                    f3 = f2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        Modifier modifierAlign2 = BoxScopeInstance.INSTANCE.align(Alpha.alpha(Modifier.INSTANCE, f3), companion3.getCenter());
                        composerStartRestartGroup.startReplaceGroup(894889963);
                        if (either instanceof Either.Left) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        float f52 = f3;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedStringM22061annotatedStringResourceRIQooxk, modifierAlign2, null, null, null, null, TextAlign.m7912boximpl(i8), 0, false, 0, 0, null, null, new TextStyle(0L, TextUnit2.getSp(16), FontWeight.INSTANCE.getLight(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getPhonicFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(20.8d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composerStartRestartGroup, (i7 << 12) & 3670016, 0, 8124);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifier52 = modifier3;
                        i9 = i8;
                        modifier4 = modifier52;
                        f4 = f52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ExploreLegendUpsellComposableKt.BodyStyledText_oTYcxuw$lambda$75(either, modifier4, i9, f4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            f2 = f;
            if ((i4 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 == 0) {
                    }
                    if ((i3 & 4) == 0) {
                    }
                    if (i6 == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        f2 = f;
        if ((i4 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: SmallStyledText-xkNWiIY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m11454SmallStyledTextxkNWiIY(final int i, Modifier modifier, float f, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        float f2;
        int i7;
        Modifier modifier3;
        int i8;
        final float f3;
        int iM7919getCentere0LSkKk;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier4;
        final int i9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1899553591);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i10 = i4 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    f2 = f;
                    i5 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
                }
                if ((i3 & 3072) == 0) {
                    if ((i4 & 8) == 0) {
                        i7 = i2;
                        int i11 = composerStartRestartGroup.changed(i7) ? 2048 : 1024;
                        i5 |= i11;
                    } else {
                        i7 = i2;
                    }
                    i5 |= i11;
                } else {
                    i7 = i2;
                }
                if ((i5 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    f3 = f2;
                    i9 = i7;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        float f4 = i6 == 0 ? 1.0f : f2;
                        if ((i4 & 8) == 0) {
                            float f5 = f4;
                            i8 = i5 & (-7169);
                            f3 = f5;
                            iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        } else {
                            float f6 = f4;
                            i8 = i5;
                            f3 = f6;
                            iM7919getCentere0LSkKk = i7;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        modifier3 = modifier2;
                        iM7919getCentere0LSkKk = i7;
                        i8 = i5;
                        f3 = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1899553591, i8, -1, "com.robinhood.android.blackwidow.ui.upsell.SmallStyledText (ExploreLegendUpsellComposable.kt:1196)");
                    }
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i, composerStartRestartGroup, i8 & 14), Alpha.alpha(Modifier.INSTANCE, f3), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, new TextStyle(0L, TextUnit2.getSp(12), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getPhonicFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(14.4d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composer2, (i8 << 9) & 3670016, 0, 8124);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    i9 = iM7919getCentere0LSkKk;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ExploreLegendUpsellComposableKt.SmallStyledText_xkNWiIY$lambda$77(i, modifier4, f3, i9, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 384;
            f2 = f;
            if ((i3 & 3072) == 0) {
            }
            if ((i5 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i10 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i4 & 8) == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i, composerStartRestartGroup, i8 & 14), Alpha.alpha(Modifier.INSTANCE, f3), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, new TextStyle(0L, TextUnit2.getSp(12), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, FontHelper.INSTANCE.getPhonicFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(14.4d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composer2, (i8 << 9) & 3670016, 0, 8124);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        i9 = iM7919getCentere0LSkKk;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 != 0) {
        }
        f2 = f;
        if ((i3 & 3072) == 0) {
        }
        if ((i5 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    static /* synthetic */ Modifier logFirstScroll$default(Modifier modifier, LazyListState lazyListState, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj) {
        if ((i & 2) != 0) {
            userInteractionEventDescriptor = null;
        }
        return logFirstScroll(modifier, lazyListState, userInteractionEventDescriptor);
    }

    private static final Modifier logFirstScroll(Modifier modifier, final LazyListState lazyListState, final UserInteractionEventDescriptor userInteractionEventDescriptor) {
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt.logFirstScroll.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-463831500);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-463831500, i, -1, "com.robinhood.android.blackwidow.ui.upsell.logFirstScroll.<anonymous> (ExploreLegendUpsellComposable.kt:1216)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                composer.startReplaceGroup(934528082);
                if (userInteractionEventDescriptor2 == null) {
                    userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                }
                composer.endReplaceGroup();
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                Unit unit = Unit.INSTANCE;
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(lazyListState) | composer.changedInstance(current) | composer.changedInstance(userInteractionEventDescriptor2);
                LazyListState lazyListState2 = lazyListState;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ExploreLegendUpsellComposableKt$logFirstScroll$1$1$1(lazyListState2, current, userInteractionEventDescriptor2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return composed;
            }
        }, 1, null);
    }

    private static final void ExploreLegendContentPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(498609617);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(498609617, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendContentPreview (ExploreLegendUpsellComposable.kt:1239)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableSingletons$ExploreLegendUpsellComposableKt.INSTANCE.getLambda$1477957913$feature_black_widow_upsell_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExploreLegendUpsellComposableKt.ExploreLegendContentPreview$lambda$78(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CarouselNavigationButtonsPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1060414807);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1060414807, i, -1, "com.robinhood.android.blackwidow.ui.upsell.CarouselNavigationButtonsPreview (ExploreLegendUpsellComposable.kt:1257)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableSingletons$ExploreLegendUpsellComposableKt.INSTANCE.getLambda$1901821025$feature_black_widow_upsell_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExploreLegendUpsellComposableKt.CarouselNavigationButtonsPreview$lambda$79(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BottomBarPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-641475452);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-641475452, i, -1, "com.robinhood.android.blackwidow.ui.upsell.BottomBarPreview (ExploreLegendUpsellComposable.kt:1273)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableSingletons$ExploreLegendUpsellComposableKt.INSTANCE.getLambda$226389564$feature_black_widow_upsell_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExploreLegendUpsellComposableKt.BottomBarPreview$lambda$80(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
