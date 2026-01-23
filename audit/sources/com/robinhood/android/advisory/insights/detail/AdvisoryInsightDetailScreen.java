package com.robinhood.android.advisory.insights.detail;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.contracts.AdvisoryInsightsHubKey;
import com.robinhood.android.advisory.insights.C8770R;
import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen;
import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailViewState;
import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailViewState3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.common.AnimationExoPlayer2;
import com.robinhood.compose.common.AnimationExoPlayerConfig;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightCta;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightPostContentCta;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.PerformanceChartAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryInsightDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001ap\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\t0\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u001a\u001a)\u0010\u001b\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u001e\u001ak\u0010\u001f\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010!2\u0006\u0010\"\u001a\u00020\u00012\b\u0010#\u001a\u0004\u0018\u00010\u00012\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010-\u001ah\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u0002002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\t0\u00102\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u0002032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u00104\u001a\u0004\u0018\u000105H\u0007¢\u0006\u0002\u00106\u001aA\u00107\u001a\u00020\t2\u0006\u00108\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010;\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010<\u001a\u00020=H\u0007¢\u0006\u0004\b>\u0010?\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006@²\u0006\n\u0010A\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020=X\u008a\u0084\u0002²\u0006\n\u0010D\u001a\u00020EX\u008a\u0084\u0002²\u0006\n\u0010F\u001a\u00020EX\u008a\u0084\u0002"}, m3636d2 = {"TAG_LOADING", "", "TAG_ASSET_SECTION", "TAG_AUDIO_CONTENT", "TAG_AUDIO_CONTROLLER", "TAG_PLAY_BUTTON", "IDENTIFIER_TOP_BAR_AUDIO_BUTTON", "IDENTIFIER_BOTTOM_AUDIO_BUTTON", "AdvisoryInsightDetailScreen", "", "accountNumber", "viewState", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState;", "onBackClicked", "Lkotlin/Function0;", "onInsightNavUpdate", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "toNext", "modifier", "Landroidx/compose/ui/Modifier;", "audioPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "videoPlayer", "(Ljava/lang/String;Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/media3/exoplayer/ExoPlayer;Landroidx/media3/exoplayer/ExoPlayer;Landroidx/compose/runtime/Composer;II)V", "InsightAssetSection", "asset", "Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;", "(Landroidx/media3/exoplayer/ExoPlayer;Lcom/robinhood/android/advisory/insights/detail/InsightAssetUiModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TextContentSection", "markdownContent", "Lkotlinx/collections/immutable/ImmutableList;", "formattedDate", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "postContentCta", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightPostContentCta;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "audioController", "Lcom/robinhood/android/advisory/insights/detail/AudioControllerState;", "audioDurationMs", "", "topLineText", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightPostContentCta;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/insights/detail/AudioControllerState;JLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ControllerSection", "navButtonsVisibility", "Lcom/robinhood/android/advisory/insights/detail/NavButtonsVisibility;", "showAudioButton", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "primaryCta", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightCta;", "(Lcom/robinhood/android/advisory/insights/detail/NavButtonsVisibility;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/advisory/insights/detail/AudioControllerState;ZLcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightCta;Landroidx/compose/runtime/Composer;II)V", "AudioPlayButton", "audioStatus", "Lcom/robinhood/android/advisory/insights/detail/InsightAudioPlayStatus;", "onToggle", "isAudioReady", "size", "Landroidx/compose/ui/unit/Dp;", "AudioPlayButton-FJfuzF0", "(Lcom/robinhood/android/advisory/insights/detail/InsightAudioPlayStatus;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "feature-advisory-insights_externalDebug", "hideAsset", "isAtTop", "horizontalPadding", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryInsightDetailScreen {
    private static final String IDENTIFIER_BOTTOM_AUDIO_BUTTON = "advisory-insight-listen-cta";
    private static final String IDENTIFIER_TOP_BAR_AUDIO_BUTTON = "advisory-insight-listen-bar-button";
    public static final String TAG_ASSET_SECTION = "AdvisoryInsightDetail_InsightAssetSection";
    public static final String TAG_AUDIO_CONTENT = "AdvisoryInsightDetail_AudioContentSection";
    public static final String TAG_AUDIO_CONTROLLER = "AdvisoryInsightDetail_AudioControllerSection";
    public static final String TAG_LOADING = "AdvisoryInsightDetail_Loading";
    public static final String TAG_PLAY_BUTTON = "AdvisoryInsightDetail_PlayButton";

    /* compiled from: AdvisoryInsightDetailScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsightAudioComponents6.values().length];
            try {
                iArr[InsightAudioComponents6.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryInsightDetailScreen$lambda$5(String str, AdvisoryInsightDetailViewState advisoryInsightDetailViewState, Function0 function0, Function1 function1, Modifier modifier, ExoPlayer exoPlayer, ExoPlayer exoPlayer2, int i, int i2, Composer composer, int i3) {
        AdvisoryInsightDetailScreen(str, advisoryInsightDetailViewState, function0, function1, modifier, exoPlayer, exoPlayer2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioPlayButton_FJfuzF0$lambda$32(InsightAudioComponents6 insightAudioComponents6, Function0 function0, boolean z, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        m11042AudioPlayButtonFJfuzF0(insightAudioComponents6, function0, z, modifier, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ControllerSection$lambda$28(NavButtonsVisibility navButtonsVisibility, Function1 function1, AudioControllerState audioControllerState, boolean z, UserInteractionEventDescriptor userInteractionEventDescriptor, Modifier modifier, AdvisoryInsightCta advisoryInsightCta, int i, int i2, Composer composer, int i3) {
        ControllerSection(navButtonsVisibility, function1, audioControllerState, z, userInteractionEventDescriptor, modifier, advisoryInsightCta, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InsightAssetSection$lambda$8(ExoPlayer exoPlayer, AdvisoryInsightDetailViewState3 advisoryInsightDetailViewState3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InsightAssetSection(exoPlayer, advisoryInsightDetailViewState3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextContentSection$lambda$18(ImmutableList immutableList, String str, String str2, AdvisoryInsightPostContentCta advisoryInsightPostContentCta, ScrollState scrollState, Modifier modifier, AudioControllerState audioControllerState, long j, String str3, int i, int i2, Composer composer, int i3) {
        TextContentSection(immutableList, str, str2, advisoryInsightPostContentCta, scrollState, modifier, audioControllerState, j, str3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AdvisoryInsightDetailScreen$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float AudioPlayButton_FJfuzF0$lambda$29(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final long AudioPlayButton_FJfuzF0$lambda$30(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioPlayButton_FJfuzF0$lambda$31(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0152  */
    @SuppressLint({"UnusedContentLambdaTargetStateParameter"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryInsightDetailScreen(final String accountNumber, final AdvisoryInsightDetailViewState viewState, final Function0<Unit> onBackClicked, final Function1<? super Boolean, Unit> onInsightNavUpdate, Modifier modifier, ExoPlayer exoPlayer, ExoPlayer exoPlayer2, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        ExoPlayer exoPlayer3;
        int i5;
        ExoPlayer exoPlayer4;
        final EventLogger current;
        Object objRememberedValue;
        Composer.Companion companion;
        AdvisoryInsightDetailViewState.Loaded loaded;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final ExoPlayer exoPlayer5;
        final ExoPlayer exoPlayer6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onInsightNavUpdate, "onInsightNavUpdate");
        Composer composerStartRestartGroup = composer.startRestartGroup(1825474482);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInsightNavUpdate) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    exoPlayer3 = exoPlayer;
                    i3 |= composerStartRestartGroup.changedInstance(exoPlayer3) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        exoPlayer4 = exoPlayer2;
                        i3 |= composerStartRestartGroup.changedInstance(exoPlayer4) ? 1048576 : 524288;
                    }
                    if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            exoPlayer3 = null;
                        }
                        ExoPlayer exoPlayer7 = i5 == 0 ? null : exoPlayer4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1825474482, i3, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen (AdvisoryInsightDetailScreen.kt:137)");
                        }
                        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        loaded = !(viewState instanceof AdvisoryInsightDetailViewState.Loaded) ? (AdvisoryInsightDetailViewState.Loaded) viewState : null;
                        Screen.Name name = Screen.Name.ADVISORY_INSIGHT;
                        if (loaded != null || (contentfulId = loaded.getContentfulId()) == null) {
                            String contentfulId = "";
                        }
                        final UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, new Screen(name, null, contentfulId, null, 10, null), null, null, null, null, 61, null));
                        String audioUrl = loaded != null ? loaded.getAudioUrl() : null;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(current);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AdvisoryInsightDetailScreen.AdvisoryInsightDetailScreen$lambda$4$lambda$3(current, (InsightAudioComponents6) obj, (UserInteractionEventDescriptor) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i7 = i3 >> 12;
                        final AdvisoryInsightDetailViewState.Loaded loaded2 = loaded;
                        ExoPlayer exoPlayer8 = exoPlayer3;
                        Tuples2<AudioControllerState, Long> tuples2RememberAudioController = InsightAudioComponents2.rememberAudioController(audioUrl, exoPlayer8, loaded2, (Function2) objRememberedValue2, composerStartRestartGroup, i7 & 112, 0);
                        final AudioControllerState audioControllerStateComponent1 = tuples2RememberAudioController.component1();
                        final long jLongValue = tuples2RememberAudioController.component2().longValue();
                        final ExoPlayer exoPlayer9 = exoPlayer7;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier4 = modifier3;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, ComposableLambda3.rememberComposableLambda(-1383337106, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt.AdvisoryInsightDetailScreen.2
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
                                    ComposerKt.traceEventStart(-1383337106, i8, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous> (AdvisoryInsightDetailScreen.kt:176)");
                                }
                                Function2<Composer, Integer, Unit> function2M11054getLambda$321209951$feature_advisory_insights_externalDebug = AdvisoryInsightDetailScreen8.INSTANCE.m11054getLambda$321209951$feature_advisory_insights_externalDebug();
                                final Function0<Unit> function0 = onBackClicked;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(511866573, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt.AdvisoryInsightDetailScreen.2.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 6) == 0) {
                                            i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(511866573, i9, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:178)");
                                        }
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-31175156, true, new AnonymousClass2(loaded2, userInteractionEventDescriptorUpdateWith, audioControllerStateComponent1, navigator, context, accountNumber), composer3, 54);
                                final AdvisoryInsightDetailViewState.Loaded loaded3 = loaded2;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11054getLambda$321209951$feature_advisory_insights_externalDebug, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(148719548, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt.AdvisoryInsightDetailScreen.2.3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                        invoke(boxScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxScope BentoAppBar, Composer composer4, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(148719548, i9, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:232)");
                                        }
                                        AdvisoryInsightDetailViewState.Loaded loaded4 = loaded3;
                                        if ((loaded4 != null ? loaded4.getMultiPageNavigationState() : null) != null) {
                                            BentoProgressBar2.m20699BentoProgressBarnBX6wN0(loaded3.getMultiPageNavigationState().getCurrentChildIndex(), 1.0f, loaded3.getMultiPageNavigationState().getCurrentChildCount(), null, 0L, 0L, false, composer4, 48, 120);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), false, false, null, null, 0L, null, composer3, 28038, 0, 2018);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: AdvisoryInsightDetailScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$2$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                                final /* synthetic */ String $accountNumber;
                                final /* synthetic */ AudioControllerState $audioController;
                                final /* synthetic */ Context $context;
                                final /* synthetic */ UserInteractionEventDescriptor $descriptor;
                                final /* synthetic */ AdvisoryInsightDetailViewState.Loaded $loadedVs;
                                final /* synthetic */ Navigator $navigator;

                                AnonymousClass2(AdvisoryInsightDetailViewState.Loaded loaded, UserInteractionEventDescriptor userInteractionEventDescriptor, AudioControllerState audioControllerState, Navigator navigator, Context context, String str) {
                                    this.$loadedVs = loaded;
                                    this.$descriptor = userInteractionEventDescriptor;
                                    this.$audioController = audioControllerState;
                                    this.$navigator = navigator;
                                    this.$context = context;
                                    this.$accountNumber = str;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                                    invoke(row5, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(AudioControllerState audioControllerState, UserInteractionEventDescriptor userInteractionEventDescriptor) {
                                    if (audioControllerState != null) {
                                        audioControllerState.getToggle().invoke(userInteractionEventDescriptor);
                                    }
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(Navigator navigator, Context context, String str) {
                                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AdvisoryInsightsHubKey(str, null, 2, null), false, false, false, false, null, true, null, null, 892, null);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-31175156, i, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:184)");
                                    }
                                    AdvisoryInsightDetailViewState.Loaded loaded = this.$loadedVs;
                                    if ((loaded != null ? loaded.getAudioButtonPosition() : null) == AdvisoryInsightDetailViewState2.TOP_BAR) {
                                        composer.startReplaceGroup(-1025978575);
                                        final UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith(this.$descriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, AdvisoryInsightDetailScreen.IDENTIFIER_TOP_BAR_AUDIO_BUTTON, null, 4, null), null, 47, null));
                                        AudioControllerState audioControllerState = this.$audioController;
                                        boolean z = audioControllerState != null && audioControllerState.isReady() && this.$audioController.getStatus() == InsightAudioComponents6.PLAYING;
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChanged = composer.changed(this.$audioController) | composer.changedInstance(userInteractionEventDescriptorUpdateWith);
                                        final AudioControllerState audioControllerState2 = this.$audioController;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$2$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return AdvisoryInsightDetailScreen.C87912.AnonymousClass2.invoke$lambda$1$lambda$0(audioControllerState2, userInteractionEventDescriptorUpdateWith);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        AnimatedPlayIcon.m11053AnimatedPlayIconj_RGq7M(z, ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), userInteractionEventDescriptorUpdateWith, true, false, false, false, false, null, 108, null), 0.0f, 0L, 0.0f, 0.0f, null, null, 0, composer, 0, 508);
                                        composer.endReplaceGroup();
                                    } else {
                                        AdvisoryInsightDetailViewState.Loaded loaded2 = this.$loadedVs;
                                        if (loaded2 == null || !loaded2.getShowListButton()) {
                                            composer.startReplaceGroup(-1023676236);
                                            composer.endReplaceGroup();
                                        } else {
                                            composer.startReplaceGroup(-1024592224);
                                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.LIST_24);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i2 = BentoTheme.$stable;
                                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
                                            composer.startReplaceGroup(-1746271574);
                                            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$accountNumber);
                                            final Navigator navigator = this.$navigator;
                                            final Context context = this.$context;
                                            final String str = this.$accountNumber;
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$2$2$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return AdvisoryInsightDetailScreen.C87912.AnonymousClass2.invoke$lambda$3$lambda$2(navigator, context, str);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer.endReplaceGroup();
                                            BentoIcon2.m20644BentoIconFU0evQE(size24, "navigate to insights hub", jM21425getFg0d7_KjU, modifierM5146paddingqDBjuR0$default2, (Function0) objRememberedValue2, false, composer, BentoIcon4.Size24.$stable | 48, 32);
                                            composer.endReplaceGroup();
                                        }
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1056439299, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt.AdvisoryInsightDetailScreen.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(final PaddingValues paddingValues, Composer composer3, int i8) {
                                int i9;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i8 & 6) == 0) {
                                    i9 = i8 | (composer3.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i9 = i8;
                                }
                                if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1056439299, i9, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous> (AdvisoryInsightDetailScreen.kt:246)");
                                }
                                boolean z = viewState instanceof AdvisoryInsightDetailViewState.Loading;
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                                final AdvisoryInsightDetailViewState advisoryInsightDetailViewState = viewState;
                                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptorUpdateWith;
                                final Function1<Boolean, Unit> function1 = onInsightNavUpdate;
                                final AudioControllerState audioControllerState = audioControllerStateComponent1;
                                final SnapshotState<Boolean> snapshotState2 = snapshotState;
                                final long j = jLongValue;
                                final ExoPlayer exoPlayer10 = exoPlayer9;
                                LocalShowPlaceholder.Loadable(z, modifierPadding, null, ComposableLambda3.rememberComposableLambda(-1870857837, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt.AdvisoryInsightDetailScreen.3.1

                                    /* compiled from: AdvisoryInsightDetailScreen.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1, reason: invalid class name and collision with other inner class name */
                                    static final class C495721 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ AudioControllerState $audioController;
                                        final /* synthetic */ long $audioDurationMs;
                                        final /* synthetic */ UserInteractionEventDescriptor $descriptor;
                                        final /* synthetic */ SnapshotState<Boolean> $hideAsset$delegate;
                                        final /* synthetic */ Function1<Boolean, Unit> $onInsightNavUpdate;
                                        final /* synthetic */ PaddingValues $paddingValues;
                                        final /* synthetic */ ExoPlayer $videoPlayer;
                                        final /* synthetic */ AdvisoryInsightDetailViewState $viewState;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        C495721(PaddingValues paddingValues, AdvisoryInsightDetailViewState advisoryInsightDetailViewState, Function1<? super Boolean, Unit> function1, AudioControllerState audioControllerState, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState<Boolean> snapshotState, long j, ExoPlayer exoPlayer) {
                                            this.$paddingValues = paddingValues;
                                            this.$viewState = advisoryInsightDetailViewState;
                                            this.$onInsightNavUpdate = function1;
                                            this.$audioController = audioControllerState;
                                            this.$descriptor = userInteractionEventDescriptor;
                                            this.$hideAsset$delegate = snapshotState;
                                            this.$audioDurationMs = j;
                                            this.$videoPlayer = exoPlayer;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final int invoke$lambda$6$lambda$5$lambda$4$lambda$0(int i) {
                                            return i;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final int invoke$lambda$6$lambda$5$lambda$4$lambda$1(int i) {
                                            return -i;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final int invoke$lambda$6$lambda$5$lambda$4$lambda$2(int i) {
                                            return -i;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final int invoke$lambda$6$lambda$5$lambda$4$lambda$3(int i) {
                                            return i;
                                        }

                                        public final void invoke(Composer composer, int i) {
                                            if ((i & 3) == 2 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1766644362, i, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:256)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), this.$paddingValues);
                                            AdvisoryInsightDetailViewState advisoryInsightDetailViewState = this.$viewState;
                                            Function1<Boolean, Unit> function1 = this.$onInsightNavUpdate;
                                            AudioControllerState audioControllerState = this.$audioController;
                                            UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
                                            SnapshotState<Boolean> snapshotState = this.$hideAsset$delegate;
                                            long j = this.$audioDurationMs;
                                            ExoPlayer exoPlayer = this.$videoPlayer;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
                                            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null);
                                            AdvisoryInsightDetailViewState.Loaded loaded = (AdvisoryInsightDetailViewState.Loaded) advisoryInsightDetailViewState;
                                            Integer numValueOf = Integer.valueOf(loaded.getCurrentInsightIndex());
                                            composer.startReplaceGroup(1849434622);
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return AdvisoryInsightDetailScreen.C87923.AnonymousClass1.C495721.invoke$lambda$6$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            AnimatedContentKt.AnimatedContent(numValueOf, modifierWeight$default, (Function1) objRememberedValue, null, "insightSlide", null, ComposableLambda3.rememberComposableLambda(393594422, true, new AdvisoryInsightDetailScreen2(snapshotState, advisoryInsightDetailViewState, audioControllerState, j, exoPlayer), composer, 54), composer, 1597824, 40);
                                            AdvisoryInsightDetailScreen.ControllerSection(loaded.getNavButtonsVisibility(), function1, audioControllerState, loaded.getAudioButtonPosition() == AdvisoryInsightDetailViewState2.BOTTOM_CTA, userInteractionEventDescriptor, TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), AdvisoryInsightDetailScreen.TAG_AUDIO_CONTROLLER), loaded.getPrimaryCta(), composer, 0, 0);
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

                                        /* JADX INFO: Access modifiers changed from: private */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        public static final ContentTransform invoke$lambda$6$lambda$5$lambda$4(AnimatedContentTransitionScope AnimatedContent) {
                                            ContentTransform contentTransform;
                                            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                            if (((Number) AnimatedContent.getTargetState()).intValue() > ((Number) AnimatedContent.getInitialState()).intValue()) {
                                                contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return Integer.valueOf(AdvisoryInsightDetailScreen.C87923.AnonymousClass1.C495721.invoke$lambda$6$lambda$5$lambda$4$lambda$0(((Integer) obj).intValue()));
                                                    }
                                                }), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return Integer.valueOf(AdvisoryInsightDetailScreen.C87923.AnonymousClass1.C495721.invoke$lambda$6$lambda$5$lambda$4$lambda$1(((Integer) obj).intValue()));
                                                    }
                                                }));
                                            } else {
                                                contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return Integer.valueOf(AdvisoryInsightDetailScreen.C87923.AnonymousClass1.C495721.invoke$lambda$6$lambda$5$lambda$4$lambda$2(((Integer) obj).intValue()));
                                                    }
                                                }), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return Integer.valueOf(AdvisoryInsightDetailScreen.C87923.AnonymousClass1.C495721.invoke$lambda$6$lambda$5$lambda$4$lambda$3(((Integer) obj).intValue()));
                                                    }
                                                }));
                                            }
                                            return AnimatedContent.using(contentTransform, AnimatedContentKt.SizeTransform$default(true, null, 2, null));
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i10) {
                                        if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1870857837, i10, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:252)");
                                        }
                                        AdvisoryInsightDetailViewState advisoryInsightDetailViewState2 = advisoryInsightDetailViewState;
                                        if (advisoryInsightDetailViewState2 instanceof AdvisoryInsightDetailViewState.Loaded) {
                                            composer4.startReplaceGroup(1065094420);
                                            UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor3, ComposableLambda3.rememberComposableLambda(-1766644362, true, new C495721(paddingValues, advisoryInsightDetailViewState, function1, audioControllerState, userInteractionEventDescriptor3, snapshotState2, j, exoPlayer10), composer4, 54), composer4, 48);
                                            composer4.endReplaceGroup();
                                        } else {
                                            if (!(advisoryInsightDetailViewState2 instanceof AdvisoryInsightDetailViewState.Loading)) {
                                                composer4.startReplaceGroup(1696923832);
                                                composer4.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer4.startReplaceGroup(1072112417);
                                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, AdvisoryInsightDetailScreen.TAG_LOADING), new ShimmerLoaderType.Hero.Size.Relative(0.0f, 1, null), true, true, composer4, (ShimmerLoaderType.Hero.Size.Relative.$stable << 3) | 3462, 0);
                                            composer4.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 3072, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, (i7 & 14) | 805306416, 508);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        exoPlayer5 = exoPlayer9;
                        modifier2 = modifier4;
                        exoPlayer6 = exoPlayer8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        exoPlayer6 = exoPlayer3;
                        exoPlayer5 = exoPlayer4;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AdvisoryInsightDetailScreen.AdvisoryInsightDetailScreen$lambda$5(accountNumber, viewState, onBackClicked, onInsightNavUpdate, modifier2, exoPlayer6, exoPlayer5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                exoPlayer4 = exoPlayer2;
                if ((599187 & i3) == 599186) {
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    if (!(viewState instanceof AdvisoryInsightDetailViewState.Loaded)) {
                    }
                    Screen.Name name2 = Screen.Name.ADVISORY_INSIGHT;
                    if (loaded != null) {
                        String contentfulId2 = "";
                        final UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith2 = UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, new Screen(name2, null, contentfulId2, null, 10, null), null, null, null, null, 61, null));
                        if (loaded != null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(current);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AdvisoryInsightDetailScreen.AdvisoryInsightDetailScreen$lambda$4$lambda$3(current, (InsightAudioComponents6) obj, (UserInteractionEventDescriptor) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            int i72 = i3 >> 12;
                            final AdvisoryInsightDetailViewState.Loaded loaded22 = loaded;
                            ExoPlayer exoPlayer82 = exoPlayer3;
                            Tuples2<AudioControllerState, Long> tuples2RememberAudioController2 = InsightAudioComponents2.rememberAudioController(audioUrl, exoPlayer82, loaded22, (Function2) objRememberedValue2, composerStartRestartGroup, i72 & 112, 0);
                            final AudioControllerState audioControllerStateComponent12 = tuples2RememberAudioController2.component1();
                            final long jLongValue2 = tuples2RememberAudioController2.component2().longValue();
                            final ExoPlayer exoPlayer92 = exoPlayer7;
                            composer2 = composerStartRestartGroup;
                            Modifier modifier42 = modifier3;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier42, ComposableLambda3.rememberComposableLambda(-1383337106, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt.AdvisoryInsightDetailScreen.2
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
                                        ComposerKt.traceEventStart(-1383337106, i8, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous> (AdvisoryInsightDetailScreen.kt:176)");
                                    }
                                    Function2<Composer, Integer, Unit> function2M11054getLambda$321209951$feature_advisory_insights_externalDebug = AdvisoryInsightDetailScreen8.INSTANCE.m11054getLambda$321209951$feature_advisory_insights_externalDebug();
                                    final Function0<Unit> function0 = onBackClicked;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(511866573, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt.AdvisoryInsightDetailScreen.2.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                            invoke(bentoAppBarScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i9 & 6) == 0) {
                                                i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(511866573, i9, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:178)");
                                            }
                                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-31175156, true, new AnonymousClass2(loaded22, userInteractionEventDescriptorUpdateWith2, audioControllerStateComponent12, navigator2, context2, accountNumber), composer3, 54);
                                    final AdvisoryInsightDetailViewState.Loaded loaded3 = loaded22;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11054getLambda$321209951$feature_advisory_insights_externalDebug, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(148719548, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt.AdvisoryInsightDetailScreen.2.3
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                            invoke(boxScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope BentoAppBar, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(148719548, i9, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:232)");
                                            }
                                            AdvisoryInsightDetailViewState.Loaded loaded4 = loaded3;
                                            if ((loaded4 != null ? loaded4.getMultiPageNavigationState() : null) != null) {
                                                BentoProgressBar2.m20699BentoProgressBarnBX6wN0(loaded3.getMultiPageNavigationState().getCurrentChildIndex(), 1.0f, loaded3.getMultiPageNavigationState().getCurrentChildCount(), null, 0L, 0L, false, composer4, 48, 120);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), false, false, null, null, 0L, null, composer3, 28038, 0, 2018);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: AdvisoryInsightDetailScreen.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$2$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                                    final /* synthetic */ String $accountNumber;
                                    final /* synthetic */ AudioControllerState $audioController;
                                    final /* synthetic */ Context $context;
                                    final /* synthetic */ UserInteractionEventDescriptor $descriptor;
                                    final /* synthetic */ AdvisoryInsightDetailViewState.Loaded $loadedVs;
                                    final /* synthetic */ Navigator $navigator;

                                    AnonymousClass2(AdvisoryInsightDetailViewState.Loaded loaded, UserInteractionEventDescriptor userInteractionEventDescriptor, AudioControllerState audioControllerState, Navigator navigator, Context context, String str) {
                                        this.$loadedVs = loaded;
                                        this.$descriptor = userInteractionEventDescriptor;
                                        this.$audioController = audioControllerState;
                                        this.$navigator = navigator;
                                        this.$context = context;
                                        this.$accountNumber = str;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                                        invoke(row5, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(AudioControllerState audioControllerState, UserInteractionEventDescriptor userInteractionEventDescriptor) {
                                        if (audioControllerState != null) {
                                            audioControllerState.getToggle().invoke(userInteractionEventDescriptor);
                                        }
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(Navigator navigator, Context context, String str) {
                                        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AdvisoryInsightsHubKey(str, null, 2, null), false, false, false, false, null, true, null, null, 892, null);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-31175156, i, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:184)");
                                        }
                                        AdvisoryInsightDetailViewState.Loaded loaded = this.$loadedVs;
                                        if ((loaded != null ? loaded.getAudioButtonPosition() : null) == AdvisoryInsightDetailViewState2.TOP_BAR) {
                                            composer.startReplaceGroup(-1025978575);
                                            final UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith(this.$descriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, AdvisoryInsightDetailScreen.IDENTIFIER_TOP_BAR_AUDIO_BUTTON, null, 4, null), null, 47, null));
                                            AudioControllerState audioControllerState = this.$audioController;
                                            boolean z = audioControllerState != null && audioControllerState.isReady() && this.$audioController.getStatus() == InsightAudioComponents6.PLAYING;
                                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
                                            composer.startReplaceGroup(-1633490746);
                                            boolean zChanged = composer.changed(this.$audioController) | composer.changedInstance(userInteractionEventDescriptorUpdateWith);
                                            final AudioControllerState audioControllerState2 = this.$audioController;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$2$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return AdvisoryInsightDetailScreen.C87912.AnonymousClass2.invoke$lambda$1$lambda$0(audioControllerState2, userInteractionEventDescriptorUpdateWith);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            AnimatedPlayIcon.m11053AnimatedPlayIconj_RGq7M(z, ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), userInteractionEventDescriptorUpdateWith, true, false, false, false, false, null, 108, null), 0.0f, 0L, 0.0f, 0.0f, null, null, 0, composer, 0, 508);
                                            composer.endReplaceGroup();
                                        } else {
                                            AdvisoryInsightDetailViewState.Loaded loaded2 = this.$loadedVs;
                                            if (loaded2 == null || !loaded2.getShowListButton()) {
                                                composer.startReplaceGroup(-1023676236);
                                                composer.endReplaceGroup();
                                            } else {
                                                composer.startReplaceGroup(-1024592224);
                                                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.LIST_24);
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i2 = BentoTheme.$stable;
                                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                                                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
                                                composer.startReplaceGroup(-1746271574);
                                                boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$accountNumber);
                                                final Navigator navigator = this.$navigator;
                                                final Context context = this.$context;
                                                final String str = this.$accountNumber;
                                                Object objRememberedValue2 = composer.rememberedValue();
                                                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$2$2$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return AdvisoryInsightDetailScreen.C87912.AnonymousClass2.invoke$lambda$3$lambda$2(navigator, context, str);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer.endReplaceGroup();
                                                BentoIcon2.m20644BentoIconFU0evQE(size24, "navigate to insights hub", jM21425getFg0d7_KjU, modifierM5146paddingqDBjuR0$default2, (Function0) objRememberedValue2, false, composer, BentoIcon4.Size24.$stable | 48, 32);
                                                composer.endReplaceGroup();
                                            }
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1056439299, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt.AdvisoryInsightDetailScreen.3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                    invoke(paddingValues, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(final PaddingValues paddingValues, Composer composer3, int i8) {
                                    int i9;
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i8 & 6) == 0) {
                                        i9 = i8 | (composer3.changed(paddingValues) ? 4 : 2);
                                    } else {
                                        i9 = i8;
                                    }
                                    if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1056439299, i9, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous> (AdvisoryInsightDetailScreen.kt:246)");
                                    }
                                    boolean z = viewState instanceof AdvisoryInsightDetailViewState.Loading;
                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                                    final AdvisoryInsightDetailViewState advisoryInsightDetailViewState = viewState;
                                    final UserInteractionEventDescriptor userInteractionEventDescriptor22 = userInteractionEventDescriptorUpdateWith2;
                                    final Function1<? super Boolean, Unit> function1 = onInsightNavUpdate;
                                    final AudioControllerState audioControllerState = audioControllerStateComponent12;
                                    final SnapshotState<Boolean> snapshotState22 = snapshotState2;
                                    final long j = jLongValue2;
                                    final ExoPlayer exoPlayer10 = exoPlayer92;
                                    LocalShowPlaceholder.Loadable(z, modifierPadding, null, ComposableLambda3.rememberComposableLambda(-1870857837, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt.AdvisoryInsightDetailScreen.3.1

                                        /* compiled from: AdvisoryInsightDetailScreen.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        @SourceDebugExtension
                                        /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1, reason: invalid class name and collision with other inner class name */
                                        static final class C495721 implements Function2<Composer, Integer, Unit> {
                                            final /* synthetic */ AudioControllerState $audioController;
                                            final /* synthetic */ long $audioDurationMs;
                                            final /* synthetic */ UserInteractionEventDescriptor $descriptor;
                                            final /* synthetic */ SnapshotState<Boolean> $hideAsset$delegate;
                                            final /* synthetic */ Function1<Boolean, Unit> $onInsightNavUpdate;
                                            final /* synthetic */ PaddingValues $paddingValues;
                                            final /* synthetic */ ExoPlayer $videoPlayer;
                                            final /* synthetic */ AdvisoryInsightDetailViewState $viewState;

                                            /* JADX WARN: Multi-variable type inference failed */
                                            C495721(PaddingValues paddingValues, AdvisoryInsightDetailViewState advisoryInsightDetailViewState, Function1<? super Boolean, Unit> function1, AudioControllerState audioControllerState, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState<Boolean> snapshotState, long j, ExoPlayer exoPlayer) {
                                                this.$paddingValues = paddingValues;
                                                this.$viewState = advisoryInsightDetailViewState;
                                                this.$onInsightNavUpdate = function1;
                                                this.$audioController = audioControllerState;
                                                this.$descriptor = userInteractionEventDescriptor;
                                                this.$hideAsset$delegate = snapshotState;
                                                this.$audioDurationMs = j;
                                                this.$videoPlayer = exoPlayer;
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final int invoke$lambda$6$lambda$5$lambda$4$lambda$0(int i) {
                                                return i;
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final int invoke$lambda$6$lambda$5$lambda$4$lambda$1(int i) {
                                                return -i;
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final int invoke$lambda$6$lambda$5$lambda$4$lambda$2(int i) {
                                                return -i;
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final int invoke$lambda$6$lambda$5$lambda$4$lambda$3(int i) {
                                                return i;
                                            }

                                            public final void invoke(Composer composer, int i) {
                                                if ((i & 3) == 2 && composer.getSkipping()) {
                                                    composer.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1766644362, i, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:256)");
                                                }
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), this.$paddingValues);
                                                AdvisoryInsightDetailViewState advisoryInsightDetailViewState = this.$viewState;
                                                Function1<Boolean, Unit> function1 = this.$onInsightNavUpdate;
                                                AudioControllerState audioControllerState = this.$audioController;
                                                UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
                                                SnapshotState<Boolean> snapshotState = this.$hideAsset$delegate;
                                                long j = this.$audioDurationMs;
                                                ExoPlayer exoPlayer = this.$videoPlayer;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
                                                Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null);
                                                AdvisoryInsightDetailViewState.Loaded loaded = (AdvisoryInsightDetailViewState.Loaded) advisoryInsightDetailViewState;
                                                Integer numValueOf = Integer.valueOf(loaded.getCurrentInsightIndex());
                                                composer.startReplaceGroup(1849434622);
                                                Object objRememberedValue = composer.rememberedValue();
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$$ExternalSyntheticLambda4
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return AdvisoryInsightDetailScreen.C87923.AnonymousClass1.C495721.invoke$lambda$6$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue);
                                                }
                                                composer.endReplaceGroup();
                                                AnimatedContentKt.AnimatedContent(numValueOf, modifierWeight$default, (Function1) objRememberedValue, null, "insightSlide", null, ComposableLambda3.rememberComposableLambda(393594422, true, new AdvisoryInsightDetailScreen2(snapshotState, advisoryInsightDetailViewState, audioControllerState, j, exoPlayer), composer, 54), composer, 1597824, 40);
                                                AdvisoryInsightDetailScreen.ControllerSection(loaded.getNavButtonsVisibility(), function1, audioControllerState, loaded.getAudioButtonPosition() == AdvisoryInsightDetailViewState2.BOTTOM_CTA, userInteractionEventDescriptor, TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), AdvisoryInsightDetailScreen.TAG_AUDIO_CONTROLLER), loaded.getPrimaryCta(), composer, 0, 0);
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

                                            /* JADX INFO: Access modifiers changed from: private */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            public static final ContentTransform invoke$lambda$6$lambda$5$lambda$4(AnimatedContentTransitionScope AnimatedContent) {
                                                ContentTransform contentTransform;
                                                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                                if (((Number) AnimatedContent.getTargetState()).intValue() > ((Number) AnimatedContent.getInitialState()).intValue()) {
                                                    contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return Integer.valueOf(AdvisoryInsightDetailScreen.C87923.AnonymousClass1.C495721.invoke$lambda$6$lambda$5$lambda$4$lambda$0(((Integer) obj).intValue()));
                                                        }
                                                    }), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return Integer.valueOf(AdvisoryInsightDetailScreen.C87923.AnonymousClass1.C495721.invoke$lambda$6$lambda$5$lambda$4$lambda$1(((Integer) obj).intValue()));
                                                        }
                                                    }));
                                                } else {
                                                    contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$$ExternalSyntheticLambda2
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return Integer.valueOf(AdvisoryInsightDetailScreen.C87923.AnonymousClass1.C495721.invoke$lambda$6$lambda$5$lambda$4$lambda$2(((Integer) obj).intValue()));
                                                        }
                                                    }), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AdvisoryInsightDetailScreen$3$1$1$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return Integer.valueOf(AdvisoryInsightDetailScreen.C87923.AnonymousClass1.C495721.invoke$lambda$6$lambda$5$lambda$4$lambda$3(((Integer) obj).intValue()));
                                                        }
                                                    }));
                                                }
                                                return AnimatedContent.using(contentTransform, AnimatedContentKt.SizeTransform$default(true, null, 2, null));
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i10) {
                                            if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1870857837, i10, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreen.<anonymous>.<anonymous> (AdvisoryInsightDetailScreen.kt:252)");
                                            }
                                            AdvisoryInsightDetailViewState advisoryInsightDetailViewState2 = advisoryInsightDetailViewState;
                                            if (advisoryInsightDetailViewState2 instanceof AdvisoryInsightDetailViewState.Loaded) {
                                                composer4.startReplaceGroup(1065094420);
                                                UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor22;
                                                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor3, ComposableLambda3.rememberComposableLambda(-1766644362, true, new C495721(paddingValues, advisoryInsightDetailViewState, function1, audioControllerState, userInteractionEventDescriptor3, snapshotState22, j, exoPlayer10), composer4, 54), composer4, 48);
                                                composer4.endReplaceGroup();
                                            } else {
                                                if (!(advisoryInsightDetailViewState2 instanceof AdvisoryInsightDetailViewState.Loading)) {
                                                    composer4.startReplaceGroup(1696923832);
                                                    composer4.endReplaceGroup();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                composer4.startReplaceGroup(1072112417);
                                                LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, AdvisoryInsightDetailScreen.TAG_LOADING), new ShimmerLoaderType.Hero.Size.Relative(0.0f, 1, null), true, true, composer4, (ShimmerLoaderType.Hero.Size.Relative.$stable << 3) | 3462, 0);
                                                composer4.endReplaceGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 3072, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composer2, (i72 & 14) | 805306416, 508);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            exoPlayer5 = exoPlayer92;
                            modifier2 = modifier42;
                            exoPlayer6 = exoPlayer82;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            exoPlayer3 = exoPlayer;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            exoPlayer4 = exoPlayer2;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        exoPlayer3 = exoPlayer;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        exoPlayer4 = exoPlayer2;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvisoryInsightDetailScreen$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryInsightDetailScreen$lambda$4$lambda$3(EventLogger eventLogger, InsightAudioComponents6 newStatus, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(newStatus, "newStatus");
        if (userInteractionEventDescriptor != null) {
            if (WhenMappings.$EnumSwitchMapping$0[newStatus.ordinal()] == 1) {
                action = UserInteractionEventData.Action.PAUSE;
            } else {
                action = UserInteractionEventData.Action.PLAY;
            }
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, action, null, null, null, 59, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InsightAssetSection(final ExoPlayer exoPlayer, final AdvisoryInsightDetailViewState3 asset, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        Modifier modifier3;
        Modifier modifier4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Composer composerStartRestartGroup = composer.startRestartGroup(1904401409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(exoPlayer) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(asset) : composerStartRestartGroup.changedInstance(asset) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier6 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1904401409, i3, -1, "com.robinhood.android.advisory.insights.detail.InsightAssetSection (AdvisoryInsightDetailScreen.kt:390)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                final boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay();
                if (asset instanceof AdvisoryInsightDetailViewState3.Image) {
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier6;
                    boolean z = false;
                    if (asset instanceof AdvisoryInsightDetailViewState3.Video) {
                        composer2.startReplaceGroup(1799980394);
                        if (exoPlayer == null) {
                            AnimationExoPlayerConfig animationExoPlayerConfig = new AnimationExoPlayerConfig(0, 0);
                            int iM6735toArgb8_81llA = Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer2, i5).m21371getBg0d7_KjU());
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChanged = composer2.changed(isDay);
                            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && composer2.changedInstance(asset))) {
                                z = true;
                            }
                            boolean z2 = zChanged | z;
                            Object objRememberedValue = composer2.rememberedValue();
                            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AdvisoryInsightDetailScreen.InsightAssetSection$lambda$7$lambda$6(isDay, asset, (ExoPlayer) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            AnimationExoPlayer2.AnimationExoPlayer(animationExoPlayerConfig, modifier3, false, iM6735toArgb8_81llA, null, null, (Function1) objRememberedValue, composer2, ((i3 >> 3) & 112) | AnimationExoPlayerConfig.$stable, 52);
                            modifier3 = modifier3;
                            composer2 = composer2;
                        }
                        composer2.endReplaceGroup();
                    } else {
                        if (asset instanceof AdvisoryInsightDetailViewState3.PerformanceChart) {
                            composer2.startReplaceGroup(1800744141);
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            modifier4 = modifier3;
                            AdvisoryInsightDetailViewState3.PerformanceChart performanceChart = (AdvisoryInsightDetailViewState3.PerformanceChart) asset;
                            List<ChartFill> fills = performanceChart.getChartModel().getFills();
                            List<Line> lines = performanceChart.getChartModel().getLines();
                            List<UIComponent<PerformanceChartAction>> overlays = performanceChart.getChartModel().getOverlays();
                            SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer2, 0);
                            composer2.startReplaceGroup(977840936);
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function1<Point, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$InsightAssetSection$$inlined$SduiSegmentedLineChart$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Point it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Point point) {
                                        invoke2(point);
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function1 = (Function1) objRememberedValue2;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1<List<? extends com.robinhood.models.serverdriven.experimental.api.Point>, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$InsightAssetSection$$inlined$SduiSegmentedLineChart$2
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(List<com.robinhood.models.serverdriven.experimental.api.Point> it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends com.robinhood.models.serverdriven.experimental.api.Point> list) {
                                        invoke2((List<com.robinhood.models.serverdriven.experimental.api.Point>) list);
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            Function1 function12 = (Function1) objRememberedValue3;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function0<Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$InsightAssetSection$$inlined$SduiSegmentedLineChart$3
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceGroup();
                            SduiChartMappersKt.SduiSegmentedLineChart(modifierM5146paddingqDBjuR0$default, fills, lines, overlays, sduiActionHandlerCurrentActionHandler, function1, function12, (Function0) objRememberedValue4, false, false, null, 0.0f, PerformanceChartAction.class, composer2, 805306368, 0, 0);
                            composer2 = composer2;
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                        } else {
                            modifier4 = modifier3;
                            if (asset instanceof AdvisoryInsightDetailViewState3.TwoBarChart) {
                                composer2.startReplaceGroup(1801184620);
                                AdvisoryInsightTwoBarChart.AdvisoryInsightTwoBarChart(((AdvisoryInsightDetailViewState3.TwoBarChart) asset).getChartModel(), modifier4, composer2, (i3 >> 3) & 112, 0);
                                composer2.endReplaceGroup();
                            } else {
                                if (!(asset instanceof AdvisoryInsightDetailViewState3.ReturnsChart)) {
                                    composer2.startReplaceGroup(473694773);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(1801381067);
                                AdvisoryInsightReturnsChart.AdvisoryInsightReturnsChart(((AdvisoryInsightDetailViewState3.ReturnsChart) asset).getChartModel(), modifier4, composer2, (i3 >> 3) & 112, 0);
                                composer2.endReplaceGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(1799638464);
                    Modifier modifier7 = modifier6;
                    BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(((AdvisoryInsightDetailViewState3.Image) asset).getUrl(), null, null, null, 0, null, composerStartRestartGroup, 0, 62), null, modifier7, null, ContentScale.INSTANCE.getFit(), 0.0f, null, composerStartRestartGroup, (i3 & 896) | 24624, 104);
                    modifier3 = modifier7;
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                modifier4 = modifier3;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryInsightDetailScreen.InsightAssetSection$lambda$8(exoPlayer, asset, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            final boolean isDay2 = bentoTheme2.getColors(composerStartRestartGroup, i52).getIsDay();
            if (asset instanceof AdvisoryInsightDetailViewState3.Image) {
            }
            modifier4 = modifier3;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier5 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InsightAssetSection$lambda$7$lambda$6(boolean z, AdvisoryInsightDetailViewState3 advisoryInsightDetailViewState3, ExoPlayer AnimationExoPlayer) {
        Intrinsics.checkNotNullParameter(AnimationExoPlayer, "$this$AnimationExoPlayer");
        if (z) {
            String lightModeMp4Url = ((AdvisoryInsightDetailViewState3.Video) advisoryInsightDetailViewState3).getLightModeMp4Url();
            if (lightModeMp4Url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AnimationExoPlayer.setMediaItem(MediaItem.fromUri(lightModeMp4Url));
        } else {
            String darkModeMp4Url = ((AdvisoryInsightDetailViewState3.Video) advisoryInsightDetailViewState3).getDarkModeMp4Url();
            if (darkModeMp4Url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AnimationExoPlayer.setMediaItem(MediaItem.fromUri(darkModeMp4Url));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x040a A[LOOP:0: B:196:0x0404->B:198:0x040a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextContentSection(final ImmutableList<String> markdownContent, final String formattedDate, final String str, final AdvisoryInsightPostContentCta advisoryInsightPostContentCta, final ScrollState scrollState, Modifier modifier, AudioControllerState audioControllerState, long j, String str2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        AudioControllerState audioControllerState2;
        int i5;
        long j2;
        int i6;
        long j3;
        Object objRememberedValue;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        Object objRememberedValue2;
        final ScrollState scrollState2;
        SnapshotState4 snapshotState4;
        Context context;
        InsightAudioComponents6 desiredStatus;
        UriHandler uriHandler;
        InsightAudioComponents6 status;
        int i7;
        boolean z;
        Object objRememberedValue3;
        InsightAudioComponents6 status2;
        boolean zChangedInstance;
        Object objRememberedValue4;
        UriHandler uriHandler2;
        InsightAudioComponents6 insightAudioComponents6;
        int i8;
        int i9;
        final Context context2;
        long j4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        Composer composer2;
        final String str3;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(markdownContent, "markdownContent");
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1322452351);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(markdownContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(formattedDate) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(advisoryInsightPostContentCta) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(scrollState) ? 16384 : 8192;
        }
        int i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    audioControllerState2 = audioControllerState;
                    i3 |= composerStartRestartGroup.changed(audioControllerState2) ? 1048576 : 524288;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    j2 = j;
                } else {
                    j2 = j;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(j2) ? 8388608 : 4194304;
                    }
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= composerStartRestartGroup.changed(str2) ? 67108864 : 33554432;
                }
                if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    str3 = str2;
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                    j5 = j2;
                } else {
                    Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        audioControllerState2 = null;
                    }
                    if (i5 != 0) {
                        j2 = 1000;
                    }
                    j3 = j2;
                    String str4 = i6 == 0 ? null : str2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1322452351, i3, -1, "com.robinhood.android.advisory.insights.detail.TextContentSection (AdvisoryInsightDetailScreen.kt:461)");
                    }
                    final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    Context context3 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    UriHandler uriHandler3 = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 != companion.getEmpty()) {
                        scrollState2 = scrollState;
                        objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(AdvisoryInsightDetailScreen.TextContentSection$lambda$10$lambda$9(scrollState2));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        scrollState2 = scrollState;
                    }
                    snapshotState4 = (SnapshotState4) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i11 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i11).m21371getBg0d7_KjU();
                    if (audioControllerState2 == null) {
                        context = context3;
                        desiredStatus = audioControllerState2.getDesiredStatus();
                    } else {
                        context = context3;
                        desiredStatus = null;
                    }
                    if (audioControllerState2 == null) {
                        uriHandler = uriHandler3;
                        status = audioControllerState2.getStatus();
                    } else {
                        uriHandler = uriHandler3;
                        status = null;
                    }
                    i7 = i3;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i12 = i7 & 3670016;
                    int i13 = i7 & 57344;
                    z = (i13 != 16384) | (i12 != 1048576);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new AdvisoryInsightDetailScreen6(audioControllerState2, scrollState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(desiredStatus, status, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
                    status2 = audioControllerState2 == null ? audioControllerState2.getStatus() : null;
                    Long lValueOf = Long.valueOf(j3);
                    Object value = snapshotState4.getValue();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = (i12 != 1048576) | composerStartRestartGroup.changedInstance(coroutineScope) | (i13 != 16384) | ((i7 & 29360128) != 8388608);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        AudioControllerState audioControllerState3 = audioControllerState2;
                        uriHandler2 = uriHandler;
                        insightAudioComponents6 = status2;
                        i8 = i7;
                        i9 = -1224400529;
                        ScrollState scrollState3 = scrollState2;
                        context2 = context;
                        AdvisoryInsightDetailScreen7 advisoryInsightDetailScreen7 = new AdvisoryInsightDetailScreen7(audioControllerState3, coroutineScope, scrollState3, snapshotState4, j3, null);
                        audioControllerState2 = audioControllerState3;
                        j4 = j3;
                        composerStartRestartGroup.updateRememberedValue(advisoryInsightDetailScreen7);
                        objRememberedValue4 = advisoryInsightDetailScreen7;
                    } else {
                        context2 = context;
                        uriHandler2 = uriHandler;
                        insightAudioComponents6 = status2;
                        i8 = i7;
                        j4 = j3;
                        i9 = -1224400529;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(insightAudioComponents6, lValueOf, value, (Function2) objRememberedValue4, composerStartRestartGroup, (i8 >> 18) & 112);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion4, scrollState, false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(str4 != null ? formattedDate : str4, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i11).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i11).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                    composerStartRestartGroup.startReplaceGroup(1767036193);
                    for (String str5 : markdownContent) {
                        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i14 = BentoTheme.$stable;
                        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i14).getTextL(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, new TextIndent(0L, 0L, 3, null), null, null, 0, 0, null, 16515071, null);
                        int i15 = BentoMarkdownText.$stable;
                        BentoMarkdownText2.BentoMarkdownText(str5, (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(bentoMarkdownText.m21100withTextStylesYhh7B2I(textStyleM7655copyp1EtxEg$default, 0, 0L, 0L, false, composerStartRestartGroup, i15 << 15, 30), null, null, MarkdownStyle.BulletList.copy$default(bentoMarkdownText.getStyle(composerStartRestartGroup, i15).getBulletList(), (char) 0, (char) 0, (char) 0, "  ", 7, null), null, null, null, null, 0L, null, 0, new MarkdownStyle.Paragraph(false), 1019, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme2.getSpacing(composerStartRestartGroup, i14).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1767061565);
                    if (advisoryInsightPostContentCta != null) {
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(advisoryInsightPostContentCta.getIconName());
                        String text = advisoryInsightPostContentCta.getText();
                        BentoTextButton3.Icon.Size12 size12 = serverToBentoAssetMapper2FromServerValue == null ? null : new BentoTextButton3.Icon.Size12(serverToBentoAssetMapper2FromServerValue, BentoTextButton3.Icon.Position.Trailing);
                        composerStartRestartGroup.startReplaceGroup(i9);
                        final UriHandler uriHandler4 = uriHandler2;
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(advisoryInsightPostContentCta) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context2) | composerStartRestartGroup.changedInstance(uriHandler4);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AdvisoryInsightDetailScreen.TextContentSection$lambda$17$lambda$16$lambda$15$lambda$14(advisoryInsightPostContentCta, navigator, context2, uriHandler4);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue5, text, null, size12, null, false, null, composerStartRestartGroup, BentoTextButton3.Icon.Size12.$stable << 9, 116);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1767100895);
                    if (str != null && !StringsKt.isBlank(str)) {
                        BentoMarkdownText bentoMarkdownText2 = BentoMarkdownText.INSTANCE;
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i16 = BentoTheme.$stable;
                        BentoMarkdownText2.BentoMarkdownText(str, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i16).m21592getMediumD9Ej5fM(), 7, null), bentoMarkdownText2.m21100withTextStylesYhh7B2I(bentoTheme3.getTypography(composerStartRestartGroup, i16).getTextS(), 0, bentoTheme3.getColors(composerStartRestartGroup, i16).m21426getFg20d7_KjU(), 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, ((i8 >> 6) & 14) | (MarkdownStyle.$stable << 6), 24);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                    int i17 = BentoTheme.$stable;
                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default, bentoTheme4.getSpacing(composerStartRestartGroup, i17).m21592getMediumD9Ej5fM());
                    Brush.Companion companion6 = Brush.INSTANCE;
                    Color colorM6701boximpl = Color.m6701boximpl(jM21371getBg0d7_KjU);
                    Color.Companion companion7 = Color.INSTANCE;
                    Modifier modifierBackground$default = Background3.background$default(modifierM5156height3ABfNKs, Brush.Companion.m6682verticalGradient8A3gB4$default(companion6, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, Color.m6701boximpl(companion7.m6725getTransparent0d7_KjU())}), 0.0f, Float.POSITIVE_INFINITY, 0, 8, (Object) null), null, 0.0f, 6, null);
                    Alignment.Companion companion8 = Alignment.INSTANCE;
                    BoxKt.Box(boxScopeInstance.align(modifierBackground$default, companion8.getTopCenter()), composerStartRestartGroup, 0);
                    BoxKt.Box(boxScopeInstance.align(Background3.background$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), bentoTheme4.getSpacing(composerStartRestartGroup, i17).m21592getMediumD9Ej5fM()), Brush.Companion.m6682verticalGradient8A3gB4$default(companion6, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion7.m6725getTransparent0d7_KjU()), Color.m6701boximpl(jM21371getBg0d7_KjU)}), 0.0f, Float.POSITIVE_INFINITY, 0, 8, (Object) null), null, 0.0f, 6, null), companion8.getBottomCenter()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    composer2 = composerStartRestartGroup;
                    str3 = str4;
                    j5 = j4;
                }
                final AudioControllerState audioControllerState4 = audioControllerState2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AdvisoryInsightDetailScreen.TextContentSection$lambda$18(markdownContent, formattedDate, str, advisoryInsightPostContentCta, scrollState, modifier3, audioControllerState4, j5, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            audioControllerState2 = audioControllerState;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            i6 = i2 & 256;
            if (i6 != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
                if (i10 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                j3 = j2;
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context32 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                UriHandler uriHandler32 = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 != companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme5 = BentoTheme.INSTANCE;
                int i112 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU2 = bentoTheme5.getColors(composerStartRestartGroup, i112).m21371getBg0d7_KjU();
                if (audioControllerState2 == null) {
                }
                if (audioControllerState2 == null) {
                }
                i7 = i3;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i122 = i7 & 3670016;
                if (i122 != 1048576) {
                }
                int i132 = i7 & 57344;
                z = (i132 != 16384) | (i122 != 1048576);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue3 = new AdvisoryInsightDetailScreen6(audioControllerState2, scrollState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(desiredStatus, status, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
                    if (audioControllerState2 == null) {
                    }
                    Long lValueOf2 = Long.valueOf(j3);
                    Object value2 = snapshotState4.getValue();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = (i122 != 1048576) | composerStartRestartGroup.changedInstance(coroutineScope) | (i132 != 16384) | ((i7 & 29360128) != 8388608);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        AudioControllerState audioControllerState32 = audioControllerState2;
                        uriHandler2 = uriHandler;
                        insightAudioComponents6 = status2;
                        i8 = i7;
                        i9 = -1224400529;
                        ScrollState scrollState32 = scrollState2;
                        context2 = context;
                        AdvisoryInsightDetailScreen7 advisoryInsightDetailScreen72 = new AdvisoryInsightDetailScreen7(audioControllerState32, coroutineScope, scrollState32, snapshotState4, j3, null);
                        audioControllerState2 = audioControllerState32;
                        j4 = j3;
                        composerStartRestartGroup.updateRememberedValue(advisoryInsightDetailScreen72);
                        objRememberedValue4 = advisoryInsightDetailScreen72;
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(insightAudioComponents6, lValueOf2, value2, (Function2) objRememberedValue4, composerStartRestartGroup, (i8 >> 18) & 112);
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(companion42, scrollState, false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                if (str4 != null) {
                                }
                                BentoText2.m20747BentoText38GnDrw(str4 != null ? formattedDate : str4, PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme5.getSpacing(composerStartRestartGroup, i112).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme5.getSpacing(composerStartRestartGroup, i112).m21590getDefaultD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme5.getColors(composerStartRestartGroup, i112).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme5.getTypography(composerStartRestartGroup, i112).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                                composerStartRestartGroup.startReplaceGroup(1767036193);
                                while (r2.hasNext()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1767061565);
                                if (advisoryInsightPostContentCta != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1767100895);
                                if (str != null) {
                                    BentoMarkdownText bentoMarkdownText22 = BentoMarkdownText.INSTANCE;
                                    BentoTheme bentoTheme32 = BentoTheme.INSTANCE;
                                    int i162 = BentoTheme.$stable;
                                    BentoMarkdownText2.BentoMarkdownText(str, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme32.getSpacing(composerStartRestartGroup, i162).m21592getMediumD9Ej5fM(), 7, null), bentoMarkdownText22.m21100withTextStylesYhh7B2I(bentoTheme32.getTypography(composerStartRestartGroup, i162).getTextS(), 0, bentoTheme32.getColors(composerStartRestartGroup, i162).m21426getFg20d7_KjU(), 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, ((i8 >> 6) & 14) | (MarkdownStyle.$stable << 6), 24);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                Modifier.Companion companion52 = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion52, 0.0f, 1, null);
                                BentoTheme bentoTheme42 = BentoTheme.INSTANCE;
                                int i172 = BentoTheme.$stable;
                                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default2, bentoTheme42.getSpacing(composerStartRestartGroup, i172).m21592getMediumD9Ej5fM());
                                Brush.Companion companion62 = Brush.INSTANCE;
                                Color colorM6701boximpl2 = Color.m6701boximpl(jM21371getBg0d7_KjU2);
                                Color.Companion companion72 = Color.INSTANCE;
                                Modifier modifierBackground$default2 = Background3.background$default(modifierM5156height3ABfNKs2, Brush.Companion.m6682verticalGradient8A3gB4$default(companion62, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl2, Color.m6701boximpl(companion72.m6725getTransparent0d7_KjU())}), 0.0f, Float.POSITIVE_INFINITY, 0, 8, (Object) null), null, 0.0f, 6, null);
                                Alignment.Companion companion82 = Alignment.INSTANCE;
                                BoxKt.Box(boxScopeInstance2.align(modifierBackground$default2, companion82.getTopCenter()), composerStartRestartGroup, 0);
                                BoxKt.Box(boxScopeInstance2.align(Background3.background$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion52, 0.0f, 1, null), bentoTheme42.getSpacing(composerStartRestartGroup, i172).m21592getMediumD9Ej5fM()), Brush.Companion.m6682verticalGradient8A3gB4$default(companion62, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion72.m6725getTransparent0d7_KjU()), Color.m6701boximpl(jM21371getBg0d7_KjU2)}), 0.0f, Float.POSITIVE_INFINITY, 0, 8, (Object) null), null, 0.0f, 6, null), companion82.getBottomCenter()), composerStartRestartGroup, 0);
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                                composer2 = composerStartRestartGroup;
                                str3 = str4;
                                j5 = j4;
                            }
                        }
                    }
                }
            }
            final AudioControllerState audioControllerState42 = audioControllerState2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        audioControllerState2 = audioControllerState;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        i6 = i2 & 256;
        if (i6 != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        final AudioControllerState audioControllerState422 = audioControllerState2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TextContentSection$lambda$10$lambda$9(ScrollState scrollState) {
        return scrollState.getMaxValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextContentSection$lambda$17$lambda$16$lambda$15$lambda$14(AdvisoryInsightPostContentCta advisoryInsightPostContentCta, Navigator navigator, Context context, UriHandler uriHandler) {
        if (StringsKt.startsWith$default(advisoryInsightPostContentCta.getLink(), DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD(), false, 2, (Object) null)) {
            Uri uri = Uri.parse(advisoryInsightPostContentCta.getLink());
            if (navigator.isDeepLinkSupported(uri)) {
                Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
            }
        } else {
            uriHandler.openUri(advisoryInsightPostContentCta.getLink());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ControllerSection(final NavButtonsVisibility navButtonsVisibility, final Function1<? super Boolean, Unit> onInsightNavUpdate, final AudioControllerState audioControllerState, final boolean z, final UserInteractionEventDescriptor eventDescriptor, Modifier modifier, AdvisoryInsightCta advisoryInsightCta, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        AdvisoryInsightCta advisoryInsightCta2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final AdvisoryInsightCta advisoryInsightCta3;
        int i5;
        final Modifier modifier3;
        final AdvisoryInsightCta advisoryInsightCta4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(navButtonsVisibility, "navButtonsVisibility");
        Intrinsics.checkNotNullParameter(onInsightNavUpdate, "onInsightNavUpdate");
        Intrinsics.checkNotNullParameter(eventDescriptor, "eventDescriptor");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1145386162);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(navButtonsVisibility) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInsightNavUpdate) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(audioControllerState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventDescriptor) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    advisoryInsightCta2 = advisoryInsightCta;
                    i3 |= composerStartRestartGroup.changedInstance(advisoryInsightCta2) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    advisoryInsightCta4 = advisoryInsightCta2;
                } else {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        advisoryInsightCta2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1145386162, i3, -1, "com.robinhood.android.advisory.insights.detail.ControllerSection (AdvisoryInsightDetailScreen.kt:610)");
                    }
                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(48));
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                    composerStartRestartGroup.startReplaceGroup(-415890716);
                    if (navButtonsVisibility.getShowPrevNavButton()) {
                        advisoryInsightCta3 = advisoryInsightCta2;
                        i5 = 256;
                    } else {
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CARET_LEFT_24);
                        String strStringResource = StringResources_androidKt.stringResource(C8770R.string.prev_insight_icon_description, composerStartRestartGroup, 0);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(Modifier.INSTANCE, companion.getCenterStart()), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean z2 = (i3 & 112) == 32;
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AdvisoryInsightDetailScreen.ControllerSection$lambda$27$lambda$20$lambda$19(onInsightNavUpdate);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        advisoryInsightCta3 = advisoryInsightCta2;
                        i5 = 256;
                        BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21425getFg0d7_KjU, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 32);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (advisoryInsightCta3 == null) {
                        composerStartRestartGroup.startReplaceGroup(-7089004);
                        final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(boxScopeInstance.align(Modifier.INSTANCE, companion.getCenter()), UserInteractionEventDescriptors.updateWith(eventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.PRIMARY_CTA, null, new Component(Component.ComponentType.BUTTON, advisoryInsightCta3.getLoggingIdentifier(), null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null);
                        String text = advisoryInsightCta3.getText();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(advisoryInsightCta3) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(uriHandler);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AdvisoryInsightDetailScreen.ControllerSection$lambda$27$lambda$22$lambda$21(advisoryInsightCta3, navigator, context, uriHandler);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer2 = composerStartRestartGroup;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, text, modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        composerStartRestartGroup = composer2;
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (!z || audioControllerState == null) {
                        composerStartRestartGroup.startReplaceGroup(-4357160);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-5362149);
                        final UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith(eventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, IDENTIFIER_BOTTOM_AUDIO_BUTTON, null, 4, null), null, 47, null));
                        InsightAudioComponents6 status = audioControllerState.getStatus();
                        boolean zIsReady = audioControllerState.isReady();
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(boxScopeInstance.align(Modifier.INSTANCE, companion.getCenter()), userInteractionEventDescriptorUpdateWith, true, false, false, false, false, null, 108, null);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = ((i3 & 896) == i5) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorUpdateWith);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AdvisoryInsightDetailScreen.ControllerSection$lambda$27$lambda$24$lambda$23(audioControllerState, userInteractionEventDescriptorUpdateWith);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        m11042AudioPlayButtonFJfuzF0(status, (Function0) objRememberedValue3, zIsReady, modifierAutoLogEvents$default2, 0.0f, composerStartRestartGroup, 0, 16);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.startReplaceGroup(-415781312);
                    if (navButtonsVisibility.getShowNextNavButton()) {
                        BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CARET_RIGHT_24);
                        String strStringResource2 = StringResources_androidKt.stringResource(C8770R.string.next_insight_icon_description, composerStartRestartGroup, 0);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU();
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(Modifier.INSTANCE, companion.getCenterEnd()), 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean z3 = (i3 & 112) == 32;
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AdvisoryInsightDetailScreen.ControllerSection$lambda$27$lambda$26$lambda$25(onInsightNavUpdate);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer3 = composerStartRestartGroup;
                        BentoIcon2.m20644BentoIconFU0evQE(size242, strStringResource2, jM21425getFg0d7_KjU2, modifierM5146paddingqDBjuR0$default2, (Function0) objRememberedValue4, false, composer3, BentoIcon4.Size24.$stable, 32);
                        composerStartRestartGroup = composer3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    advisoryInsightCta4 = advisoryInsightCta3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AdvisoryInsightDetailScreen.ControllerSection$lambda$28(navButtonsVisibility, onInsightNavUpdate, audioControllerState, z, eventDescriptor, modifier3, advisoryInsightCta4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            advisoryInsightCta2 = advisoryInsightCta;
            if ((599187 & i3) == 599186) {
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(48));
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
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
                    composerStartRestartGroup.startReplaceGroup(-415890716);
                    if (navButtonsVisibility.getShowPrevNavButton()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (advisoryInsightCta3 == null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-415781312);
                    if (navButtonsVisibility.getShowNextNavButton()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    advisoryInsightCta4 = advisoryInsightCta3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        advisoryInsightCta2 = advisoryInsightCta;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ControllerSection$lambda$27$lambda$20$lambda$19(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ControllerSection$lambda$27$lambda$22$lambda$21(AdvisoryInsightCta advisoryInsightCta, Navigator navigator, Context context, UriHandler uriHandler) {
        if (StringsKt.startsWith$default(advisoryInsightCta.getDeeplink(), DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD(), false, 2, (Object) null)) {
            Uri uri = Uri.parse(advisoryInsightCta.getDeeplink());
            if (navigator.isDeepLinkSupported(uri)) {
                Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
            }
        } else {
            uriHandler.openUri(advisoryInsightCta.getDeeplink());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ControllerSection$lambda$27$lambda$24$lambda$23(AudioControllerState audioControllerState, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        audioControllerState.getToggle().invoke(userInteractionEventDescriptor);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ControllerSection$lambda$27$lambda$26$lambda$25(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* renamed from: AudioPlayButton-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11042AudioPlayButtonFJfuzF0(final InsightAudioComponents6 audioStatus, final Function0<Unit> onToggle, final boolean z, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f2;
        int i5;
        InsightAudioComponents6 insightAudioComponents6;
        long jM21371getBg0d7_KjU;
        Composer composer2;
        final Modifier modifier3;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(audioStatus, "audioStatus");
        Intrinsics.checkNotNullParameter(onToggle, "onToggle");
        Composer composerStartRestartGroup = composer.startRestartGroup(765615358);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(audioStatus.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onToggle) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    i3 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                }
                i5 = i3;
                if ((i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    float fM7995constructorimpl = i4 == 0 ? C2002Dp.m7995constructorimpl(48) : f2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(765615358, i5, -1, "com.robinhood.android.advisory.insights.detail.AudioPlayButton (AdvisoryInsightDetailScreen.kt:718)");
                    }
                    ButtonStyle.Style primary = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getPrimary();
                    boolean z2 = audioStatus != InsightAudioComponents6.INITIAL;
                    SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(C2002Dp.m7995constructorimpl(!z2 ? 16 : 0), null, null, null, composerStartRestartGroup, 0, 14);
                    composerStartRestartGroup.startReplaceGroup(1316967260);
                    insightAudioComponents6 = InsightAudioComponents6.PLAYING;
                    long jM6725getTransparent0d7_KjU = audioStatus != insightAudioComponents6 ? Color.INSTANCE.m6725getTransparent0d7_KjU() : BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                    final boolean z3 = z2;
                    SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(jM6725getTransparent0d7_KjU, null, null, null, composerStartRestartGroup, 0, 14);
                    if (audioStatus != insightAudioComponents6) {
                        composerStartRestartGroup.startReplaceGroup(1316974752);
                        jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1316975584);
                        jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac2 = SingleValueAnimation.m4805animateColorAsStateeuL9pac(jM21371getBg0d7_KjU, null, null, null, composerStartRestartGroup, 0, 14);
                    RoundedCornerShape circleShape = RoundedCornerShape2.getCircleShape();
                    Modifier modifier5 = modifier4;
                    ButtonColors buttonColorsM5719buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m5719buttonColorsro_MJ88(AudioPlayButton_FJfuzF0$lambda$30(snapshotState4M4805animateColorAsStateeuL9pac), AudioPlayButton_FJfuzF0$lambda$31(snapshotState4M4805animateColorAsStateeuL9pac2), primary.getColors().getBackgroundColor().m21712getDisabledColor0d7_KjU(), primary.getColors().getForegroundColor().m21712getDisabledColor0d7_KjU(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0);
                    float f4 = fM7995constructorimpl;
                    ButtonKt.Button(onToggle, AnimationModifier.animateContentSize$default(SizeKt.m5173sizeInqDBjuR0$default(TestTag3.testTag(modifier5, TAG_PLAY_BUTTON), f4, fM7995constructorimpl, 0.0f, 0.0f, 12, null), null, null, 3, null), z, circleShape, buttonColorsM5719buttonColorsro_MJ88, null, null, PaddingKt.m5136PaddingValuesYgX7TsA(AudioPlayButton_FJfuzF0$lambda$29(snapshotState4M4812animateDpAsStateAjpBEmI), C2002Dp.m7995constructorimpl(12)), null, ComposableLambda3.rememberComposableLambda(595459854, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AudioPlayButton$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                            invoke(row5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 Button, Composer composer3, int i7) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(595459854, i7, -1, "com.robinhood.android.advisory.insights.detail.AudioPlayButton.<anonymous> (AdvisoryInsightDetailScreen.kt:749)");
                            }
                            AnimatedPlayIcon.m11053AnimatedPlayIconj_RGq7M(z && audioStatus == InsightAudioComponents6.PLAYING, null, 0.0f, AdvisoryInsightDetailScreen.AudioPlayButton_FJfuzF0$lambda$31(snapshotState4M4805animateColorAsStateeuL9pac2), 0.0f, 0.0f, null, null, 0, composer3, 0, HttpStatusCode.BAD_GATEWAY_502);
                            if (z3) {
                                BentoText2.m20747BentoText38GnDrw("Listen", PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(10), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(AdvisoryInsightDetailScreen.AudioPlayButton_FJfuzF0$lambda$31(snapshotState4M4805animateColorAsStateeuL9pac2)), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 24630, 0, 8168);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 3) & 14) | 805306368 | (i5 & 896), 352);
                    composer2 = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    f3 = f4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AdvisoryInsightDetailScreen.AudioPlayButton_FJfuzF0$lambda$32(audioStatus, onToggle, z, modifier3, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            f2 = f;
            i5 = i3;
            if ((i5 & 9363) != 9362) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ButtonStyle.Style primary2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getPrimary();
                if (audioStatus != InsightAudioComponents6.INITIAL) {
                }
                SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI2 = AnimateAsState.m4812animateDpAsStateAjpBEmI(C2002Dp.m7995constructorimpl(!z2 ? 16 : 0), null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.startReplaceGroup(1316967260);
                insightAudioComponents6 = InsightAudioComponents6.PLAYING;
                if (audioStatus != insightAudioComponents6) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final boolean z32 = z2;
                SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac3 = SingleValueAnimation.m4805animateColorAsStateeuL9pac(jM6725getTransparent0d7_KjU, null, null, null, composerStartRestartGroup, 0, 14);
                if (audioStatus != insightAudioComponents6) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac22 = SingleValueAnimation.m4805animateColorAsStateeuL9pac(jM21371getBg0d7_KjU, null, null, null, composerStartRestartGroup, 0, 14);
                RoundedCornerShape circleShape2 = RoundedCornerShape2.getCircleShape();
                Modifier modifier52 = modifier4;
                ButtonColors buttonColorsM5719buttonColorsro_MJ882 = ButtonDefaults.INSTANCE.m5719buttonColorsro_MJ88(AudioPlayButton_FJfuzF0$lambda$30(snapshotState4M4805animateColorAsStateeuL9pac3), AudioPlayButton_FJfuzF0$lambda$31(snapshotState4M4805animateColorAsStateeuL9pac22), primary2.getColors().getBackgroundColor().m21712getDisabledColor0d7_KjU(), primary2.getColors().getForegroundColor().m21712getDisabledColor0d7_KjU(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0);
                float f42 = fM7995constructorimpl;
                ButtonKt.Button(onToggle, AnimationModifier.animateContentSize$default(SizeKt.m5173sizeInqDBjuR0$default(TestTag3.testTag(modifier52, TAG_PLAY_BUTTON), f42, fM7995constructorimpl, 0.0f, 0.0f, 12, null), null, null, 3, null), z, circleShape2, buttonColorsM5719buttonColorsro_MJ882, null, null, PaddingKt.m5136PaddingValuesYgX7TsA(AudioPlayButton_FJfuzF0$lambda$29(snapshotState4M4812animateDpAsStateAjpBEmI2), C2002Dp.m7995constructorimpl(12)), null, ComposableLambda3.rememberComposableLambda(595459854, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailScreenKt$AudioPlayButton$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 Button, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i7 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(595459854, i7, -1, "com.robinhood.android.advisory.insights.detail.AudioPlayButton.<anonymous> (AdvisoryInsightDetailScreen.kt:749)");
                        }
                        AnimatedPlayIcon.m11053AnimatedPlayIconj_RGq7M(z && audioStatus == InsightAudioComponents6.PLAYING, null, 0.0f, AdvisoryInsightDetailScreen.AudioPlayButton_FJfuzF0$lambda$31(snapshotState4M4805animateColorAsStateeuL9pac22), 0.0f, 0.0f, null, null, 0, composer3, 0, HttpStatusCode.BAD_GATEWAY_502);
                        if (z32) {
                            BentoText2.m20747BentoText38GnDrw("Listen", PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(10), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(AdvisoryInsightDetailScreen.AudioPlayButton_FJfuzF0$lambda$31(snapshotState4M4805animateColorAsStateeuL9pac22)), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 24630, 0, 8168);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 3) & 14) | 805306368 | (i5 & 896), 352);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                f3 = f42;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        f2 = f;
        i5 = i3;
        if ((i5 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
