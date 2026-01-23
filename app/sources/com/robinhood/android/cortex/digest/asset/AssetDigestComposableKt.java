package com.robinhood.android.cortex.digest.asset;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
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
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlaceholderVerticalAlign;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
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
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt;
import com.robinhood.android.cortex.digest.asset.AssetDigestEvent;
import com.robinhood.android.cortex.digest.asset.AssetDigestViewState;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItem;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackType;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.cortex.models.asset.AssetDigest6;
import com.robinhood.android.cortex.models.asset.AssetDigestDetailItem;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import java.text.NumberFormat;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.extensions2;
import okhttp3.HttpUrl;

/* compiled from: AssetDigestComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001ac\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001aM\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010!\u001a\u0015\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0003¢\u0006\u0002\u0010%\u001a\u001f\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010)\u001a3\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001a2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010,\u001a\r\u0010-\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006.²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002²\u0006\u0012\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102X\u008a\u0084\u0002²\u0006\f\u00104\u001a\u0004\u0018\u000105X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u000207X\u008a\u0084\u0002"}, m3636d2 = {"TAG_COPILOT_DIGEST_REFRESH", "", "AssetDigestComposable", "", "args", "Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "onSourceUrlClick", "Lkotlin/Function1;", "Lokhttp3/HttpUrl;", "onBackClick", "Lkotlin/Function0;", "onSubmitFeedbackSuccess", "onSubmitFeedbackError", "", "duxo", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestDuxo;", "(Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/cortex/digest/asset/AssetDigestDuxo;Landroidx/compose/runtime/Composer;II)V", "TAG_COPILOT_DIGEST_LIST", "ComposableDigestList", "loadedContent", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$LoadedContent;", "onFeedbackClick", "Lkotlin/Function2;", "Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "onSourceClick", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$LoadedContent;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AssetDigestAnimation", "(Landroidx/compose/runtime/Composer;I)V", "AssetDigestHeaderItem", "(Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$LoadedContent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AssetDigestBodyItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/cortex/models/asset/AssetDigestDetailItem;", "(Lcom/robinhood/android/cortex/models/asset/AssetDigestDetailItem;Landroidx/compose/runtime/Composer;I)V", "CopilotSourcesDivider", "count", "", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CopilotSourceItem", "source", "(Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AssetDigestComposablePreview", "feature-cortex-digest-asset_externalDebug", "viewState", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;", "events", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestEvent;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AssetDigestComposableKt {
    public static final String TAG_COPILOT_DIGEST_LIST = "copilot_digest_list";
    public static final String TAG_COPILOT_DIGEST_REFRESH = "copilot_digest_refresh";

    /* compiled from: AssetDigestComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetType3.values().length];
            try {
                iArr[AssetType3.STOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType3.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestAnimation$lambda$14(int i, Composer composer, int i2) {
        AssetDigestAnimation(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestBodyItem$lambda$21(AssetDigestDetailItem assetDigestDetailItem, int i, Composer composer, int i2) {
        AssetDigestBodyItem(assetDigestDetailItem, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestComposable$lambda$4(AssetDigest.HasSignedAgreement hasSignedAgreement, Function1 function1, Function0 function0, Function0 function02, Function1 function12, AssetDigestDuxo assetDigestDuxo, int i, int i2, Composer composer, int i3) {
        AssetDigestComposable(hasSignedAgreement, function1, function0, function02, function12, assetDigestDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestComposablePreview$lambda$31(int i, Composer composer, int i2) {
        AssetDigestComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestHeaderItem$lambda$16(AssetDigestViewState.LoadedContent loadedContent, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        AssetDigestHeaderItem(loadedContent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposableDigestList$lambda$9(AssetDigestViewState.LoadedContent loadedContent, Function2 function2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ComposableDigestList(loadedContent, function2, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CopilotSourceItem$lambda$30(AssetDigestViewState.ArticleSourceContent articleSourceContent, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CopilotSourceItem(articleSourceContent, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CopilotSourcesDivider$lambda$23(int i, Modifier modifier, int i2, int i3, Composer composer, int i4) throws Resources.NotFoundException {
        CopilotSourcesDivider(i, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final LottieComposition AssetDigestAnimation$lambda$10(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AssetDigestAnimation$lambda$11(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetDigestViewState AssetDigestComposable$lambda$0(SnapshotState4<AssetDigestViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AssetDigestEvent> AssetDigestComposable$lambda$1(SnapshotState4<Event<AssetDigestEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetDigestComposable(final AssetDigest.HasSignedAgreement args, final Function1<? super HttpUrl, Unit> onSourceUrlClick, final Function0<Unit> onBackClick, final Function0<Unit> onSubmitFeedbackSuccess, final Function1<? super Throwable, Unit> onSubmitFeedbackError, AssetDigestDuxo assetDigestDuxo, Composer composer, final int i, final int i2) {
        int i3;
        AssetDigestDuxo assetDigestDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        AssetDigestDuxo assetDigestDuxo3;
        final Event<AssetDigestEvent> eventAssetDigestComposable$lambda$1;
        final Event<AssetDigestEvent> eventAssetDigestComposable$lambda$12;
        int i4;
        Screen.Name name;
        EventConsumer<AssetDigestEvent> eventConsumerInvoke;
        EventConsumer<AssetDigestEvent> eventConsumerInvoke2;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(onSourceUrlClick, "onSourceUrlClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onSubmitFeedbackSuccess, "onSubmitFeedbackSuccess");
        Intrinsics.checkNotNullParameter(onSubmitFeedbackError, "onSubmitFeedbackError");
        Composer composerStartRestartGroup = composer.startRestartGroup(956597289);
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
            i3 |= composerStartRestartGroup.changedInstance(onSourceUrlClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSubmitFeedbackSuccess) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSubmitFeedbackError) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                assetDigestDuxo2 = assetDigestDuxo;
                int i5 = composerStartRestartGroup.changedInstance(assetDigestDuxo2) ? 131072 : 65536;
                i3 |= i5;
            } else {
                assetDigestDuxo2 = assetDigestDuxo;
            }
            i3 |= i5;
        } else {
            assetDigestDuxo2 = assetDigestDuxo;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 32) != 0) {
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AssetDigestDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$$inlined$duxo$1.1
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
                    assetDigestDuxo3 = (AssetDigestDuxo) baseDuxo;
                    i3 &= -458753;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(956597289, i3, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable (AssetDigestComposable.kt:111)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(assetDigestDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(assetDigestDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                eventAssetDigestComposable$lambda$1 = AssetDigestComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventAssetDigestComposable$lambda$1 != null && (eventAssetDigestComposable$lambda$1.getData() instanceof AssetDigestEvent.Error) && (eventConsumerInvoke2 = eventAssetDigestComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventAssetDigestComposable$lambda$1, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12549invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12549invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onSubmitFeedbackError.invoke(((AssetDigestEvent.Error) eventAssetDigestComposable$lambda$1.getData()).getThrowable());
                        }
                    });
                }
                eventAssetDigestComposable$lambda$12 = AssetDigestComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventAssetDigestComposable$lambda$12 != null && (eventAssetDigestComposable$lambda$12.getData() instanceof AssetDigestEvent.ShowFeedbackSuccessSnackbar) && (eventConsumerInvoke = eventAssetDigestComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventAssetDigestComposable$lambda$12, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12550invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12550invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onSubmitFeedbackSuccess.invoke();
                        }
                    });
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[args.getInstrumentType().ordinal()];
                if (i4 != 1) {
                    name = Screen.Name.CORTEX_SDP_DIGEST;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    name = Screen.Name.CORTEX_CDP_DIGEST;
                }
                Screen.Name name2 = name;
                String string2 = args.getInstrumentId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                final AssetDigestDuxo assetDigestDuxo4 = assetDigestDuxo3;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name2, args.getDigestId(), string2, null, 8, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-642261932, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt.AssetDigestComposable.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        BentoTheme4 direction;
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-642261932, i6, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous> (AssetDigestComposable.kt:135)");
                        }
                        AssetDigestViewState.ToolbarContent toolbarContent = AssetDigestComposableKt.AssetDigestComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getToolbarContent();
                        if (toolbarContent == null || (direction = toolbarContent.getDirection()) == null) {
                            direction = BentoTheme4.POSITIVE;
                        }
                        BentoThemeOverlays.DirectionThemeOverlay(direction, ComposableLambda3.rememberComposableLambda(475621370, true, new AnonymousClass1(assetDigestDuxo4, snapshotState4CollectAsStateWithLifecycle, onBackClick, onSourceUrlClick, args), composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AssetDigestComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ AssetDigest.HasSignedAgreement $args;
                        final /* synthetic */ AssetDigestDuxo $duxo;
                        final /* synthetic */ Function0<Unit> $onBackClick;
                        final /* synthetic */ Function1<HttpUrl, Unit> $onSourceUrlClick;
                        final /* synthetic */ SnapshotState4<AssetDigestViewState> $viewState$delegate;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(AssetDigestDuxo assetDigestDuxo, SnapshotState4<AssetDigestViewState> snapshotState4, Function0<Unit> function0, Function1<? super HttpUrl, Unit> function1, AssetDigest.HasSignedAgreement hasSignedAgreement) {
                            this.$duxo = assetDigestDuxo;
                            this.$viewState$delegate = snapshotState4;
                            this.$onBackClick = function0;
                            this.$onSourceUrlClick = function1;
                            this.$args = hasSignedAgreement;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                            return Unit.INSTANCE;
                        }

                        /* compiled from: AssetDigestComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$3, reason: invalid class name */
                        static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ AssetDigestDuxo $duxo;
                            final /* synthetic */ Function1<HttpUrl, Unit> $onSourceUrlClick;
                            final /* synthetic */ SnapshotState4<AssetDigestViewState> $viewState$delegate;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass3(AssetDigestDuxo assetDigestDuxo, Function1<? super HttpUrl, Unit> function1, SnapshotState4<AssetDigestViewState> snapshotState4) {
                                this.$duxo = assetDigestDuxo;
                                this.$onSourceUrlClick = function1;
                                this.$viewState$delegate = snapshotState4;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i & 6) == 0) {
                                    i |= composer.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-17742135, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:189)");
                                }
                                AssetDigestViewState.LoadedContent loadedContent = AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).getLoadedContent();
                                if (loadedContent == null) {
                                    composer.startReplaceGroup(-274839027);
                                    LoadingScreenComposablesKt.ListLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), true, false, 0, composer, 48, 12);
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(-274613192);
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                    final AssetDigestDuxo assetDigestDuxo = this.$duxo;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$3$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return AssetDigestComposableKt.C119973.AnonymousClass1.AnonymousClass3.invoke$lambda$1$lambda$0(assetDigestDuxo, (DigestFeedbackType) obj, (DigestFeedback) obj2);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function2 function2 = (Function2) objRememberedValue;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(this.$onSourceUrlClick) | composer.changedInstance(this.$duxo);
                                    final Function1<HttpUrl, Unit> function1 = this.$onSourceUrlClick;
                                    final AssetDigestDuxo assetDigestDuxo2 = this.$duxo;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$3$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AssetDigestComposableKt.C119973.AnonymousClass1.AnonymousClass3.invoke$lambda$3$lambda$2(function1, assetDigestDuxo2, (AssetDigestViewState.ArticleSourceContent) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    AssetDigestComposableKt.ComposableDigestList(loadedContent, function2, (Function1) objRememberedValue2, modifierPadding, composer, 0, 0);
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(AssetDigestDuxo assetDigestDuxo, DigestFeedbackType type2, DigestFeedback feedback) {
                                Intrinsics.checkNotNullParameter(type2, "type");
                                Intrinsics.checkNotNullParameter(feedback, "feedback");
                                assetDigestDuxo.showFeedbackBottomSheet(Tuples4.m3642to(type2, feedback));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(Function1 function1, AssetDigestDuxo assetDigestDuxo, AssetDigestViewState.ArticleSourceContent source) {
                                Intrinsics.checkNotNullParameter(source, "source");
                                HttpUrl url = source.getUrl();
                                if (url != null) {
                                    function1.invoke(url);
                                } else {
                                    assetDigestDuxo.showSelectedSourceBottomSheet(source);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(AssetDigestDuxo assetDigestDuxo) {
                            assetDigestDuxo.hideFeedbackBottomSheet();
                            return Unit.INSTANCE;
                        }

                        /* compiled from: AssetDigestComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$5, reason: invalid class name */
                        static final class AnonymousClass5 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                            final /* synthetic */ AssetDigest.HasSignedAgreement $args;
                            final /* synthetic */ AssetDigestDuxo $duxo;
                            final /* synthetic */ DigestFeedback $feedback;
                            final /* synthetic */ DigestFeedbackType $feedbackType;
                            final /* synthetic */ SnapshotState4<AssetDigestViewState> $viewState$delegate;

                            AnonymousClass5(AssetDigest.HasSignedAgreement hasSignedAgreement, DigestFeedbackType digestFeedbackType, DigestFeedback digestFeedback, AssetDigestDuxo assetDigestDuxo, SnapshotState4<AssetDigestViewState> snapshotState4) {
                                this.$args = hasSignedAgreement;
                                this.$feedbackType = digestFeedbackType;
                                this.$feedback = digestFeedback;
                                this.$duxo = assetDigestDuxo;
                                this.$viewState$delegate = snapshotState4;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                                invoke(rhModalBottomSheet5, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1562651090, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:222)");
                                }
                                AssetType3 instrumentType = this.$args.getInstrumentType();
                                UUID instrumentId = this.$args.getInstrumentId();
                                String digestId = this.$args.getDigestId();
                                DigestFeedbackType digestFeedbackType = this.$feedbackType;
                                DigestFeedback digestFeedback = this.$feedback;
                                boolean zIsSubmittingFeedback = AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).isSubmittingFeedback();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                final AssetDigestDuxo assetDigestDuxo = this.$duxo;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$5$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AssetDigestComposableKt.C119973.AnonymousClass1.AnonymousClass5.invoke$lambda$1$lambda$0(assetDigestDuxo, (DigestFeedback) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                AssetDigestFeedbackComposable.AssetDigestFeedbackComposable(RhModalBottomSheet, instrumentType, instrumentId, digestId, digestFeedbackType, digestFeedback, zIsSubmittingFeedback, (Function1) objRememberedValue, composer, RhModalBottomSheet5.$stable | (i & 14));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(AssetDigestDuxo assetDigestDuxo, DigestFeedback newFeedback) {
                                Intrinsics.checkNotNullParameter(newFeedback, "newFeedback");
                                assetDigestDuxo.submitFeedback(newFeedback);
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4(AssetDigestDuxo assetDigestDuxo) {
                            assetDigestDuxo.hideBreakingNewsBottomSheet();
                            return Unit.INSTANCE;
                        }

                        /* compiled from: AssetDigestComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$7, reason: invalid class name */
                        static final class AnonymousClass7 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                            final /* synthetic */ AssetDigest.HasSignedAgreement $args;
                            final /* synthetic */ AssetDigestDetailItem $currentBreakingNewsBottomSheet;
                            final /* synthetic */ AssetDigestDuxo $duxo;

                            AnonymousClass7(AssetDigest.HasSignedAgreement hasSignedAgreement, AssetDigestDetailItem assetDigestDetailItem, AssetDigestDuxo assetDigestDuxo) {
                                this.$args = hasSignedAgreement;
                                this.$currentBreakingNewsBottomSheet = assetDigestDetailItem;
                                this.$duxo = assetDigestDuxo;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                                invoke(rhModalBottomSheet5, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-926765019, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:243)");
                                }
                                AssetType3 instrumentType = this.$args.getInstrumentType();
                                UUID instrumentId = this.$args.getInstrumentId();
                                String digestId = this.$args.getDigestId();
                                AssetDigestDetailItem assetDigestDetailItem = this.$currentBreakingNewsBottomSheet;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                final AssetDigestDuxo assetDigestDuxo = this.$duxo;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$7$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AssetDigestComposableKt.C119973.AnonymousClass1.AnonymousClass7.invoke$lambda$1$lambda$0(assetDigestDuxo);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                AssetDigestBreakingNewsComposable.AssetDigestBreakingNewsComposable(RhModalBottomSheet, instrumentType, instrumentId, digestId, assetDigestDetailItem, (Function0) objRememberedValue, composer, RhModalBottomSheet5.$stable | (i & 14));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(AssetDigestDuxo assetDigestDuxo) {
                                assetDigestDuxo.refresh();
                                return Unit.INSTANCE;
                            }
                        }

                        public final void invoke(Composer composer, int i) {
                            int i2;
                            boolean z;
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(475621370, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous> (AssetDigestComposable.kt:138)");
                            }
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AssetDigestComposableKt.C119973.AnonymousClass1.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierLogScreenTransitions$default, false, (Function1) objRememberedValue, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
                            final SnapshotState4<AssetDigestViewState> snapshotState4 = this.$viewState$delegate;
                            final Function0<Unit> function0 = this.$onBackClick;
                            final AssetDigestDuxo assetDigestDuxo = this.$duxo;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSemantics$default, ComposableLambda3.rememberComposableLambda(1800622014, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt.AssetDigestComposable.3.1.2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i4) {
                                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1800622014, i4, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:145)");
                                    }
                                    final SnapshotState4<AssetDigestViewState> snapshotState42 = snapshotState4;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1728779541, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt.AssetDigestComposable.3.1.2.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i5) {
                                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1728779541, i5, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:147)");
                                            }
                                            AssetDigestViewState.ToolbarContent toolbarContent = AssetDigestComposableKt.AssetDigestComposable$lambda$0(snapshotState42).getToolbarContent();
                                            if (toolbarContent != null) {
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                                int i6 = BentoTheme.$stable;
                                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                Column6 column6 = Column6.INSTANCE;
                                                BentoText2.m20747BentoText38GnDrw(toolbarContent.getSymbol(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i6).getTextL(), composer3, 0, 0, 8190);
                                                BentoText2.m20747BentoText38GnDrw(Money.format$default(toolbarContent.getLastTradePrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i6).getTextS(), composer3, 0, 0, 8186);
                                                composer3.endNode();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54);
                                    final Function0<Unit> function02 = function0;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(-24862913, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt.AssetDigestComposable.3.1.2.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                            invoke(bentoAppBarScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i5 & 6) == 0) {
                                                i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-24862913, i5, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:166)");
                                            }
                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), ComposableLambda3.rememberComposableLambda(252311264, true, new AnonymousClass3(assetDigestDuxo, snapshotState4), composer2, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: AssetDigestComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$2$3, reason: invalid class name */
                                static final class AnonymousClass3 implements Function3<Row5, Composer, Integer, Unit> {
                                    final /* synthetic */ AssetDigestDuxo $duxo;
                                    final /* synthetic */ SnapshotState4<AssetDigestViewState> $viewState$delegate;

                                    AnonymousClass3(AssetDigestDuxo assetDigestDuxo, SnapshotState4<AssetDigestViewState> snapshotState4) {
                                        this.$duxo = assetDigestDuxo;
                                        this.$viewState$delegate = snapshotState4;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                                        invoke(row5, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(252311264, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:171)");
                                        }
                                        if (AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).getIsRefreshVisible()) {
                                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, AssetDigestComposableKt.TAG_COPILOT_DIGEST_REFRESH);
                                            BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.RESEND_24);
                                            Color.Companion companion = Color.INSTANCE;
                                            long jM6725getTransparent0d7_KjU = companion.m6725getTransparent0d7_KjU();
                                            long jM6725getTransparent0d7_KjU2 = companion.m6725getTransparent0d7_KjU();
                                            long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                            boolean z = !AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).isSubmittingFeedback();
                                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_refresh, composer, 0);
                                            composer.startReplaceGroup(5004770);
                                            boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                            final AssetDigestDuxo assetDigestDuxo = this.$duxo;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$2$3$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return AssetDigestComposableKt.C119973.AnonymousClass1.AnonymousClass2.AnonymousClass3.invoke$lambda$1$lambda$0(assetDigestDuxo);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue, heroSize24, strStringResource, modifierTestTag, null, z, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU2), null, false, composer, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 113249280, 0, 1552);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(AssetDigestDuxo assetDigestDuxo) {
                                        assetDigestDuxo.refresh();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-17742135, true, new AnonymousClass3(this.$duxo, this.$onSourceUrlClick, this.$viewState$delegate), composer, 54), composer, 805306416, 316);
                            Tuples2<DigestFeedbackType, DigestFeedback> feedbackBottomSheetParams = AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).getFeedbackBottomSheetParams();
                            composer.startReplaceGroup(1805726390);
                            if (feedbackBottomSheetParams != null) {
                                DigestFeedbackType digestFeedbackTypeComponent1 = feedbackBottomSheetParams.component1();
                                DigestFeedback digestFeedbackComponent2 = feedbackBottomSheetParams.component2();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                final AssetDigestDuxo assetDigestDuxo2 = this.$duxo;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AssetDigestComposableKt.C119973.AnonymousClass1.invoke$lambda$3$lambda$2(assetDigestDuxo2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                i2 = 54;
                                z = true;
                                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1562651090, true, new AnonymousClass5(this.$args, digestFeedbackTypeComponent1, digestFeedbackComponent2, this.$duxo, this.$viewState$delegate), composer, 54), composer, 1572864, 62);
                            } else {
                                i2 = 54;
                                z = true;
                            }
                            composer.endReplaceGroup();
                            AssetDigestDetailItem breakingNewsBottomSheetParams = AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).getBreakingNewsBottomSheetParams();
                            composer.startReplaceGroup(1805758022);
                            if (breakingNewsBottomSheetParams != null) {
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                                final AssetDigestDuxo assetDigestDuxo3 = this.$duxo;
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AssetDigestComposableKt.C119973.AnonymousClass1.invoke$lambda$5$lambda$4(assetDigestDuxo3);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue3, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-926765019, z, new AnonymousClass7(this.$args, breakingNewsBottomSheetParams, this.$duxo), composer, i2), composer, 1572864, 62);
                            }
                            composer.endReplaceGroup();
                            final AssetDigestViewState.ArticleSourceContent sourceBottomSheetParams = AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).getSourceBottomSheetParams();
                            if (sourceBottomSheetParams != null) {
                                SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(z, null, composer, 6, 2);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance3 = composer.changedInstance(this.$duxo);
                                final AssetDigestDuxo assetDigestDuxo4 = this.$duxo;
                                Object objRememberedValue4 = composer.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AssetDigestComposableKt.C119973.AnonymousClass1.invoke$lambda$7$lambda$6(assetDigestDuxo4);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue4);
                                }
                                composer.endReplaceGroup();
                                final AssetDigest.HasSignedAgreement hasSignedAgreement = this.$args;
                                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(1426093222, z, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt.AssetDigestComposable.3.1.9
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                                        invoke(rhModalBottomSheet5, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i4) {
                                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                        if ((i4 & 6) == 0) {
                                            i4 |= (i4 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                                        }
                                        if ((i4 & 19) == 18 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1426093222, i4, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:265)");
                                        }
                                        AssetDigestArticleSourceComposable.AssetDigestArticleSourceComposable(RhModalBottomSheet, hasSignedAgreement.getInstrumentType(), hasSignedAgreement.getInstrumentId(), hasSignedAgreement.getDigestId(), sourceBottomSheetParams, composer2, RhModalBottomSheet5.$stable | (i4 & 14));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, i2), composer, 1572864, 54);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$7$lambda$6(AssetDigestDuxo assetDigestDuxo) {
                            assetDigestDuxo.hideSelectedSourceBottomSheet();
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                assetDigestDuxo2 = assetDigestDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
            assetDigestDuxo3 = assetDigestDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4<AssetDigestViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(assetDigestDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(assetDigestDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            eventAssetDigestComposable$lambda$1 = AssetDigestComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventAssetDigestComposable$lambda$1 != null) {
                eventConsumerInvoke2.consume(eventAssetDigestComposable$lambda$1, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m12549invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m12549invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        onSubmitFeedbackError.invoke(((AssetDigestEvent.Error) eventAssetDigestComposable$lambda$1.getData()).getThrowable());
                    }
                });
            }
            eventAssetDigestComposable$lambda$12 = AssetDigestComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventAssetDigestComposable$lambda$12 != null) {
                eventConsumerInvoke.consume(eventAssetDigestComposable$lambda$12, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m12550invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m12550invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        onSubmitFeedbackSuccess.invoke();
                    }
                });
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[args.getInstrumentType().ordinal()];
            if (i4 != 1) {
            }
            Screen.Name name22 = name;
            String string22 = args.getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
            final AssetDigestDuxo assetDigestDuxo42 = assetDigestDuxo3;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name22, args.getDigestId(), string22, null, 8, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-642261932, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt.AssetDigestComposable.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    BentoTheme4 direction;
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-642261932, i6, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous> (AssetDigestComposable.kt:135)");
                    }
                    AssetDigestViewState.ToolbarContent toolbarContent = AssetDigestComposableKt.AssetDigestComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getToolbarContent();
                    if (toolbarContent == null || (direction = toolbarContent.getDirection()) == null) {
                        direction = BentoTheme4.POSITIVE;
                    }
                    BentoThemeOverlays.DirectionThemeOverlay(direction, ComposableLambda3.rememberComposableLambda(475621370, true, new AnonymousClass1(assetDigestDuxo42, snapshotState4CollectAsStateWithLifecycle3, onBackClick, onSourceUrlClick, args), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AssetDigestComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ AssetDigest.HasSignedAgreement $args;
                    final /* synthetic */ AssetDigestDuxo $duxo;
                    final /* synthetic */ Function0<Unit> $onBackClick;
                    final /* synthetic */ Function1<HttpUrl, Unit> $onSourceUrlClick;
                    final /* synthetic */ SnapshotState4<AssetDigestViewState> $viewState$delegate;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(AssetDigestDuxo assetDigestDuxo, SnapshotState4<AssetDigestViewState> snapshotState4, Function0<Unit> function0, Function1<? super HttpUrl, Unit> function1, AssetDigest.HasSignedAgreement hasSignedAgreement) {
                        this.$duxo = assetDigestDuxo;
                        this.$viewState$delegate = snapshotState4;
                        this.$onBackClick = function0;
                        this.$onSourceUrlClick = function1;
                        this.$args = hasSignedAgreement;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                        return Unit.INSTANCE;
                    }

                    /* compiled from: AssetDigestComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ AssetDigestDuxo $duxo;
                        final /* synthetic */ Function1<HttpUrl, Unit> $onSourceUrlClick;
                        final /* synthetic */ SnapshotState4<AssetDigestViewState> $viewState$delegate;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass3(AssetDigestDuxo assetDigestDuxo, Function1<? super HttpUrl, Unit> function1, SnapshotState4<AssetDigestViewState> snapshotState4) {
                            this.$duxo = assetDigestDuxo;
                            this.$onSourceUrlClick = function1;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i & 6) == 0) {
                                i |= composer.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-17742135, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:189)");
                            }
                            AssetDigestViewState.LoadedContent loadedContent = AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).getLoadedContent();
                            if (loadedContent == null) {
                                composer.startReplaceGroup(-274839027);
                                LoadingScreenComposablesKt.ListLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), true, false, 0, composer, 48, 12);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(-274613192);
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                final AssetDigestDuxo assetDigestDuxo = this.$duxo;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$3$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return AssetDigestComposableKt.C119973.AnonymousClass1.AnonymousClass3.invoke$lambda$1$lambda$0(assetDigestDuxo, (DigestFeedbackType) obj, (DigestFeedback) obj2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function2 function2 = (Function2) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(this.$onSourceUrlClick) | composer.changedInstance(this.$duxo);
                                final Function1 function1 = this.$onSourceUrlClick;
                                final AssetDigestDuxo assetDigestDuxo2 = this.$duxo;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$3$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AssetDigestComposableKt.C119973.AnonymousClass1.AnonymousClass3.invoke$lambda$3$lambda$2(function1, assetDigestDuxo2, (AssetDigestViewState.ArticleSourceContent) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                AssetDigestComposableKt.ComposableDigestList(loadedContent, function2, (Function1) objRememberedValue2, modifierPadding, composer, 0, 0);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(AssetDigestDuxo assetDigestDuxo, DigestFeedbackType type2, DigestFeedback feedback) {
                            Intrinsics.checkNotNullParameter(type2, "type");
                            Intrinsics.checkNotNullParameter(feedback, "feedback");
                            assetDigestDuxo.showFeedbackBottomSheet(Tuples4.m3642to(type2, feedback));
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(Function1 function1, AssetDigestDuxo assetDigestDuxo, AssetDigestViewState.ArticleSourceContent source) {
                            Intrinsics.checkNotNullParameter(source, "source");
                            HttpUrl url = source.getUrl();
                            if (url != null) {
                                function1.invoke(url);
                            } else {
                                assetDigestDuxo.showSelectedSourceBottomSheet(source);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(AssetDigestDuxo assetDigestDuxo) {
                        assetDigestDuxo.hideFeedbackBottomSheet();
                        return Unit.INSTANCE;
                    }

                    /* compiled from: AssetDigestComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$5, reason: invalid class name */
                    static final class AnonymousClass5 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                        final /* synthetic */ AssetDigest.HasSignedAgreement $args;
                        final /* synthetic */ AssetDigestDuxo $duxo;
                        final /* synthetic */ DigestFeedback $feedback;
                        final /* synthetic */ DigestFeedbackType $feedbackType;
                        final /* synthetic */ SnapshotState4<AssetDigestViewState> $viewState$delegate;

                        AnonymousClass5(AssetDigest.HasSignedAgreement hasSignedAgreement, DigestFeedbackType digestFeedbackType, DigestFeedback digestFeedback, AssetDigestDuxo assetDigestDuxo, SnapshotState4<AssetDigestViewState> snapshotState4) {
                            this.$args = hasSignedAgreement;
                            this.$feedbackType = digestFeedbackType;
                            this.$feedback = digestFeedback;
                            this.$duxo = assetDigestDuxo;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                            invoke(rhModalBottomSheet5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i & 6) == 0) {
                                i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1562651090, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:222)");
                            }
                            AssetType3 instrumentType = this.$args.getInstrumentType();
                            UUID instrumentId = this.$args.getInstrumentId();
                            String digestId = this.$args.getDigestId();
                            DigestFeedbackType digestFeedbackType = this.$feedbackType;
                            DigestFeedback digestFeedback = this.$feedback;
                            boolean zIsSubmittingFeedback = AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).isSubmittingFeedback();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$duxo);
                            final AssetDigestDuxo assetDigestDuxo = this.$duxo;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$5$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AssetDigestComposableKt.C119973.AnonymousClass1.AnonymousClass5.invoke$lambda$1$lambda$0(assetDigestDuxo, (DigestFeedback) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            AssetDigestFeedbackComposable.AssetDigestFeedbackComposable(RhModalBottomSheet, instrumentType, instrumentId, digestId, digestFeedbackType, digestFeedback, zIsSubmittingFeedback, (Function1) objRememberedValue, composer, RhModalBottomSheet5.$stable | (i & 14));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(AssetDigestDuxo assetDigestDuxo, DigestFeedback newFeedback) {
                            Intrinsics.checkNotNullParameter(newFeedback, "newFeedback");
                            assetDigestDuxo.submitFeedback(newFeedback);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(AssetDigestDuxo assetDigestDuxo) {
                        assetDigestDuxo.hideBreakingNewsBottomSheet();
                        return Unit.INSTANCE;
                    }

                    /* compiled from: AssetDigestComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$7, reason: invalid class name */
                    static final class AnonymousClass7 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                        final /* synthetic */ AssetDigest.HasSignedAgreement $args;
                        final /* synthetic */ AssetDigestDetailItem $currentBreakingNewsBottomSheet;
                        final /* synthetic */ AssetDigestDuxo $duxo;

                        AnonymousClass7(AssetDigest.HasSignedAgreement hasSignedAgreement, AssetDigestDetailItem assetDigestDetailItem, AssetDigestDuxo assetDigestDuxo) {
                            this.$args = hasSignedAgreement;
                            this.$currentBreakingNewsBottomSheet = assetDigestDetailItem;
                            this.$duxo = assetDigestDuxo;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                            invoke(rhModalBottomSheet5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i & 6) == 0) {
                                i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-926765019, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:243)");
                            }
                            AssetType3 instrumentType = this.$args.getInstrumentType();
                            UUID instrumentId = this.$args.getInstrumentId();
                            String digestId = this.$args.getDigestId();
                            AssetDigestDetailItem assetDigestDetailItem = this.$currentBreakingNewsBottomSheet;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$duxo);
                            final AssetDigestDuxo assetDigestDuxo = this.$duxo;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$7$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AssetDigestComposableKt.C119973.AnonymousClass1.AnonymousClass7.invoke$lambda$1$lambda$0(assetDigestDuxo);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            AssetDigestBreakingNewsComposable.AssetDigestBreakingNewsComposable(RhModalBottomSheet, instrumentType, instrumentId, digestId, assetDigestDetailItem, (Function0) objRememberedValue, composer, RhModalBottomSheet5.$stable | (i & 14));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(AssetDigestDuxo assetDigestDuxo) {
                            assetDigestDuxo.refresh();
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer, int i) {
                        int i2;
                        boolean z;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(475621370, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous> (AssetDigestComposable.kt:138)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AssetDigestComposableKt.C119973.AnonymousClass1.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierLogScreenTransitions$default, false, (Function1) objRememberedValue, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
                        final SnapshotState4<AssetDigestViewState> snapshotState4 = this.$viewState$delegate;
                        final Function0<Unit> function0 = this.$onBackClick;
                        final AssetDigestDuxo assetDigestDuxo = this.$duxo;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSemantics$default, ComposableLambda3.rememberComposableLambda(1800622014, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt.AssetDigestComposable.3.1.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i4) {
                                if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1800622014, i4, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:145)");
                                }
                                final SnapshotState4<AssetDigestViewState> snapshotState42 = snapshotState4;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1728779541, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt.AssetDigestComposable.3.1.2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i5) {
                                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1728779541, i5, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:147)");
                                        }
                                        AssetDigestViewState.ToolbarContent toolbarContent = AssetDigestComposableKt.AssetDigestComposable$lambda$0(snapshotState42).getToolbarContent();
                                        if (toolbarContent != null) {
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                            int i6 = BentoTheme.$stable;
                                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            BentoText2.m20747BentoText38GnDrw(toolbarContent.getSymbol(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i6).getTextL(), composer3, 0, 0, 8190);
                                            BentoText2.m20747BentoText38GnDrw(Money.format$default(toolbarContent.getLastTradePrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i6).getTextS(), composer3, 0, 0, 8186);
                                            composer3.endNode();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54);
                                final Function0<Unit> function02 = function0;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(-24862913, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt.AssetDigestComposable.3.1.2.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                        invoke(bentoAppBarScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i5 & 6) == 0) {
                                            i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-24862913, i5, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:166)");
                                        }
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), ComposableLambda3.rememberComposableLambda(252311264, true, new AnonymousClass3(assetDigestDuxo, snapshotState4), composer2, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: AssetDigestComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$2$3, reason: invalid class name */
                            static final class AnonymousClass3 implements Function3<Row5, Composer, Integer, Unit> {
                                final /* synthetic */ AssetDigestDuxo $duxo;
                                final /* synthetic */ SnapshotState4<AssetDigestViewState> $viewState$delegate;

                                AnonymousClass3(AssetDigestDuxo assetDigestDuxo, SnapshotState4<AssetDigestViewState> snapshotState4) {
                                    this.$duxo = assetDigestDuxo;
                                    this.$viewState$delegate = snapshotState4;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                                    invoke(row5, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(252311264, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:171)");
                                    }
                                    if (AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).getIsRefreshVisible()) {
                                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, AssetDigestComposableKt.TAG_COPILOT_DIGEST_REFRESH);
                                        BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.RESEND_24);
                                        Color.Companion companion = Color.INSTANCE;
                                        long jM6725getTransparent0d7_KjU = companion.m6725getTransparent0d7_KjU();
                                        long jM6725getTransparent0d7_KjU2 = companion.m6725getTransparent0d7_KjU();
                                        long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                        boolean z = !AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).isSubmittingFeedback();
                                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_refresh, composer, 0);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(this.$duxo);
                                        final AssetDigestDuxo assetDigestDuxo = this.$duxo;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$2$3$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return AssetDigestComposableKt.C119973.AnonymousClass1.AnonymousClass2.AnonymousClass3.invoke$lambda$1$lambda$0(assetDigestDuxo);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue, heroSize24, strStringResource, modifierTestTag, null, z, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU2), null, false, composer, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 113249280, 0, 1552);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(AssetDigestDuxo assetDigestDuxo) {
                                    assetDigestDuxo.refresh();
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-17742135, true, new AnonymousClass3(this.$duxo, this.$onSourceUrlClick, this.$viewState$delegate), composer, 54), composer, 805306416, 316);
                        Tuples2<DigestFeedbackType, DigestFeedback> feedbackBottomSheetParams = AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).getFeedbackBottomSheetParams();
                        composer.startReplaceGroup(1805726390);
                        if (feedbackBottomSheetParams != null) {
                            DigestFeedbackType digestFeedbackTypeComponent1 = feedbackBottomSheetParams.component1();
                            DigestFeedback digestFeedbackComponent2 = feedbackBottomSheetParams.component2();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$duxo);
                            final AssetDigestDuxo assetDigestDuxo2 = this.$duxo;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AssetDigestComposableKt.C119973.AnonymousClass1.invoke$lambda$3$lambda$2(assetDigestDuxo2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            i2 = 54;
                            z = true;
                            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1562651090, true, new AnonymousClass5(this.$args, digestFeedbackTypeComponent1, digestFeedbackComponent2, this.$duxo, this.$viewState$delegate), composer, 54), composer, 1572864, 62);
                        } else {
                            i2 = 54;
                            z = true;
                        }
                        composer.endReplaceGroup();
                        AssetDigestDetailItem breakingNewsBottomSheetParams = AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).getBreakingNewsBottomSheetParams();
                        composer.startReplaceGroup(1805758022);
                        if (breakingNewsBottomSheetParams != null) {
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                            final AssetDigestDuxo assetDigestDuxo3 = this.$duxo;
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AssetDigestComposableKt.C119973.AnonymousClass1.invoke$lambda$5$lambda$4(assetDigestDuxo3);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue3, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-926765019, z, new AnonymousClass7(this.$args, breakingNewsBottomSheetParams, this.$duxo), composer, i2), composer, 1572864, 62);
                        }
                        composer.endReplaceGroup();
                        final AssetDigestViewState.ArticleSourceContent sourceBottomSheetParams = AssetDigestComposableKt.AssetDigestComposable$lambda$0(this.$viewState$delegate).getSourceBottomSheetParams();
                        if (sourceBottomSheetParams != null) {
                            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(z, null, composer, 6, 2);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer.changedInstance(this.$duxo);
                            final AssetDigestDuxo assetDigestDuxo4 = this.$duxo;
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$AssetDigestComposable$3$1$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AssetDigestComposableKt.C119973.AnonymousClass1.invoke$lambda$7$lambda$6(assetDigestDuxo4);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            final AssetDigest.HasSignedAgreement hasSignedAgreement = this.$args;
                            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(1426093222, z, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt.AssetDigestComposable.3.1.9
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                                    invoke(rhModalBottomSheet5, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i4) {
                                    Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                    if ((i4 & 6) == 0) {
                                        i4 |= (i4 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                                    }
                                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1426093222, i4, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposable.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:265)");
                                    }
                                    AssetDigestArticleSourceComposable.AssetDigestArticleSourceComposable(RhModalBottomSheet, hasSignedAgreement.getInstrumentType(), hasSignedAgreement.getInstrumentId(), hasSignedAgreement.getDigestId(), sourceBottomSheetParams, composer2, RhModalBottomSheet5.$stable | (i4 & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, i2), composer, 1572864, 54);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(AssetDigestDuxo assetDigestDuxo) {
                        assetDigestDuxo.hideSelectedSourceBottomSheet();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            assetDigestDuxo2 = assetDigestDuxo42;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final AssetDigestDuxo assetDigestDuxo5 = assetDigestDuxo2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestComposableKt.AssetDigestComposable$lambda$4(args, onSourceUrlClick, onBackClick, onSubmitFeedbackSuccess, onSubmitFeedbackError, assetDigestDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ComposableDigestList(final AssetDigestViewState.LoadedContent loadedContent, final Function2<? super DigestFeedbackType, ? super DigestFeedback, Unit> function2, final Function1<? super AssetDigestViewState.ArticleSourceContent, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1112026741);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loadedContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1112026741, i3, -1, "com.robinhood.android.cortex.digest.asset.ComposableDigestList (AssetDigestComposable.kt:285)");
                }
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), TAG_COPILOT_DIGEST_LIST);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(loadedContent) | ((i3 & 896) == 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AssetDigestComposableKt.ComposableDigestList$lambda$8$lambda$7(loadedContent, function2, function1, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierTestTag, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AssetDigestComposableKt.ComposableDigestList$lambda$9(loadedContent, function2, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), TAG_COPILOT_DIGEST_LIST);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(loadedContent) | ((i3 & 896) == 256);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetDigestComposableKt.ComposableDigestList$lambda$8$lambda$7(loadedContent, function2, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierTestTag2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposableDigestList$lambda$8$lambda$7(final AssetDigestViewState.LoadedContent loadedContent, final Function2 function2, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AssetDigestComposableKt.INSTANCE.getLambda$1496114688$feature_cortex_digest_asset_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1776172521, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$ComposableDigestList$1$1$1
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
                    ComposerKt.traceEventStart(1776172521, i, -1, "com.robinhood.android.cortex.digest.asset.ComposableDigestList.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:296)");
                }
                AssetDigestComposableKt.AssetDigestHeaderItem(loadedContent, null, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        final List<AssetDigestDetailItem> body = loadedContent.getBody();
        final C11989xd9d4e709 c11989xd9d4e709 = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$ComposableDigestList$lambda$8$lambda$7$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(AssetDigestDetailItem assetDigestDetailItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((AssetDigestDetailItem) obj);
            }
        };
        LazyColumn.items(body.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$ComposableDigestList$lambda$8$lambda$7$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c11989xd9d4e709.invoke(body.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$ComposableDigestList$lambda$8$lambda$7$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                AssetDigestDetailItem assetDigestDetailItem = (AssetDigestDetailItem) body.get(i);
                composer.startReplaceGroup(1798669365);
                AssetDigestComposableKt.AssetDigestBodyItem(assetDigestDetailItem, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-808143928, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$ComposableDigestList$1$1$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-808143928, i, -1, "com.robinhood.android.cortex.digest.asset.ComposableDigestList.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:304)");
                }
                DigestFeedbackItem.DigestFeedbackItem(loadedContent.getFeedback(), function2, null, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        if (!loadedContent.getSources().isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1350277307, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$ComposableDigestList$1$1$4
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
                        ComposerKt.traceEventStart(-1350277307, i, -1, "com.robinhood.android.cortex.digest.asset.ComposableDigestList.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:312)");
                    }
                    AssetDigestComposableKt.CopilotSourcesDivider(loadedContent.getSources().size(), null, composer, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final List<AssetDigestViewState.ArticleSourceContent> sources = loadedContent.getSources();
            final C11993xd9d4e70d c11993xd9d4e70d = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$ComposableDigestList$lambda$8$lambda$7$$inlined$items$default$5
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(AssetDigestViewState.ArticleSourceContent articleSourceContent) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AssetDigestViewState.ArticleSourceContent) obj);
                }
            };
            LazyColumn.items(sources.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$ComposableDigestList$lambda$8$lambda$7$$inlined$items$default$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c11993xd9d4e70d.invoke(sources.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$ComposableDigestList$lambda$8$lambda$7$$inlined$items$default$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    AssetDigestViewState.ArticleSourceContent articleSourceContent = (AssetDigestViewState.ArticleSourceContent) sources.get(i);
                    composer.startReplaceGroup(-1388765929);
                    AssetDigestComposableKt.CopilotSourceItem(articleSourceContent, function1, null, composer, 0, 4);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        if (loadedContent.getDisclosureMarkdown().length() > 0) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-2007334418, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$ComposableDigestList$1$1$6
                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2007334418, i, -1, "com.robinhood.android.cortex.digest.asset.ComposableDigestList.<anonymous>.<anonymous>.<anonymous> (AssetDigestComposable.kt:322)");
                    }
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 5, null);
                    AssetDigestViewState.LoadedContent loadedContent2 = loadedContent;
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
                    BentoMarkdownText2.BentoMarkdownText(loadedContent2.getDisclosureMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), 0, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
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
    public static final void AssetDigestAnimation(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(564108650);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(564108650, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestAnimation (AssetDigestComposable.kt:345)");
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C12023R.raw.lottie_copilot_dot_pulse_header)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(AssetDigestAnimation$lambda$10(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
            Integer num = LottieProperty.STROKE_COLOR;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties = LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{LottieDynamicProperties2.rememberLottieDynamicProperty(num, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composerStartRestartGroup, i2).m21368getAccent0d7_KjU())), new String[]{"**", ".Editable_DOT-MAX_Active-Color", "**"}, composerStartRestartGroup, 6), LottieDynamicProperties2.rememberLottieDynamicProperty(num, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composerStartRestartGroup, i2).m21427getFg30d7_KjU())), new String[]{"**", ".Editable_DOT-ZERO_Active-Color", "**"}, composerStartRestartGroup, 6)}, composerStartRestartGroup, LottieDynamicProperties3.$stable);
            Modifier modifierFullWidthChartSize = com.robinhood.android.charts.ModifiersKt.fullWidthChartSize(Modifier.INSTANCE);
            LottieComposition lottieCompositionAssetDigestAnimation$lambda$10 = AssetDigestAnimation$lambda$10(lottieCompositionResultRememberLottieComposition);
            ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(AssetDigestComposableKt.AssetDigestAnimation$lambda$11(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup = composerStartRestartGroup;
            LottieAnimation2.LottieAnimation(lottieCompositionAssetDigestAnimation$lambda$10, (Function0) objRememberedValue, modifierFullWidthChartSize, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties, null, fillWidth, false, false, null, null, false, composerStartRestartGroup, LottieDynamicProperties.$stable << 24, 6, 64248);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestComposableKt.AssetDigestAnimation$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetDigestHeaderItem(final AssetDigestViewState.LoadedContent loadedContent, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1832177597);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loadedContent) ? 4 : 2) | i;
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
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1832177597, i3, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestHeaderItem (AssetDigestComposable.kt:379)");
                }
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, (i3 >> 3) & 14, 1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 5, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 7, null);
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12023R.string.copilot_digest_updated_at, new Object[]{loadedContent.getUpdatedAt()}, composerStartRestartGroup, 0), modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(loadedContent.getTitle(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21368getAccent0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getDisplayCapsuleSmall(), composer2, 0, 0, 8186);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AssetDigestComposableKt.AssetDigestHeaderItem$lambda$16(loadedContent, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, (i3 >> 3) & 14, 1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 5, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 7, null);
                composer2 = composerStartRestartGroup;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12023R.string.copilot_digest_updated_at, new Object[]{loadedContent.getUpdatedAt()}, composerStartRestartGroup, 0), modifierM5146paddingqDBjuR0$default22, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composer2, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(loadedContent.getTitle(), null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i52).m21368getAccent0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getDisplayCapsuleSmall(), composer2, 0, 0, 8186);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AssetDigestBodyItem(final AssetDigestDetailItem assetDigestDetailItem, Composer composer, final int i) {
        int i2;
        long jM21373getBg30d7_KjU;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(372896233);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(assetDigestDetailItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(372896233, i2, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestBodyItem (AssetDigestComposable.kt:409)");
            }
            boolean z = assetDigestDetailItem.getStyle() == AssetDigest6.BREAKING;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierHeight = Intrinsic3.height(companion, Intrinsic4.Min);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierHeight, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 0);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5174width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(4)), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM(), 1, null);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1239135285);
                jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21368getAccent0d7_KjU();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1239134328);
                jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU();
            }
            composerStartRestartGroup.endReplaceGroup();
            BoxKt.Box(Background3.m4871backgroundbw27NRU(modifierM5144paddingVpY3zN4$default, jM21373getBg30d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), composerStartRestartGroup, 0);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String title = assetDigestDetailItem.getTitle();
            composerStartRestartGroup.startReplaceGroup(1112735694);
            if (title == null) {
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM(), 7, null);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                if (z) {
                    InlineTextContent2.appendInlineContent$default(builder, "breaking_news_icon", null, 2, null);
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                }
                builder.append(title);
                composer2 = composerStartRestartGroup;
                BentoText2.m20748BentoTextQnj7Zds(builder.toAnnotatedString(), modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21368getAccent0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, extensions2.persistentMapOf(Tuples4.m3642to("breaking_news_icon", new InlineTextContent(new Placeholder(TextUnit2.getSp(12), TextUnit2.getSp(12), PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc(), null), ComposableSingletons$AssetDigestComposableKt.INSTANCE.getLambda$413392129$feature_cortex_digest_asset_externalDebug()))), null, null, composer2, 24576, 0, 14312);
            }
            composer2.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(assetDigestDetailItem.getDescription(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestComposableKt.AssetDigestBodyItem$lambda$21(assetDigestDetailItem, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CopilotSourcesDivider(final int i, Modifier modifier, Composer composer, final int i2, final int i3) throws Resources.NotFoundException {
        int i4;
        Modifier modifier2;
        int i5;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(61247863);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i4;
            if ((i5 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(61247863, i5, -1, "com.robinhood.android.cortex.digest.asset.CopilotSourcesDivider (AssetDigestComposable.kt:474)");
                }
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i5 >> 3) & 14, 1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 5, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21591getLargeD9Ej5fM(), 7, null), bentoTheme.getColors(composerStartRestartGroup, i7).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                String strPluralStringResource = StringResources_androidKt.pluralStringResource(C12023R.plurals.copilot_digest_source_count, i, new Object[]{NumberFormat.getIntegerInstance().format(Integer.valueOf(i))}, composerStartRestartGroup, (i5 << 3) & 112);
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS();
                FontWeight bold = FontWeight.INSTANCE.getBold();
                Color colorM6701boximpl = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU());
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strPluralStringResource, null, colorM6701boximpl, null, bold, null, null, 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8170);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AssetDigestComposableKt.CopilotSourcesDivider$lambda$23(i, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        modifier2 = modifier;
        i5 = i4;
        if ((i5 & 19) != 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i5 >> 3) & 14, 1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 5, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21591getLargeD9Ej5fM(), 7, null), bentoTheme2.getColors(composerStartRestartGroup, i72).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                String strPluralStringResource2 = StringResources_androidKt.pluralStringResource(C12023R.plurals.copilot_digest_source_count, i, new Object[]{NumberFormat.getIntegerInstance().format(Integer.valueOf(i))}, composerStartRestartGroup, (i5 << 3) & 112);
                TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextS();
                FontWeight bold2 = FontWeight.INSTANCE.getBold();
                Color colorM6701boximpl2 = Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i72).m21426getFg20d7_KjU());
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strPluralStringResource2, null, colorM6701boximpl2, null, bold2, null, null, 0, false, 0, 0, null, 0, textS2, composer2, 24576, 0, 8170);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CopilotSourceItem(final AssetDigestViewState.ArticleSourceContent articleSourceContent, final Function1<? super AssetDigestViewState.ArticleSourceContent, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String iconUrl;
        BentoTheme bentoTheme;
        int i4;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(387776866);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(articleSourceContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(387776866, i3, -1, "com.robinhood.android.cortex.digest.asset.CopilotSourceItem (AssetDigestComposable.kt:506)");
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(articleSourceContent);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AssetDigestComposableKt.CopilotSourceItem$lambda$25$lambda$24(function1, articleSourceContent);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null), 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                iconUrl = articleSourceContent.getIconUrl();
                composerStartRestartGroup.startReplaceGroup(-1290302324);
                if (iconUrl != null) {
                    bentoTheme = bentoTheme2;
                    i4 = i6;
                } else {
                    Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), C2002Dp.m7995constructorimpl(40));
                    bentoTheme = bentoTheme2;
                    i4 = i6;
                    AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(iconUrl, null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoImage.BentoImage(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, null, modifierM5169size3ABfNKs, null, null, 0.0f, null, composerStartRestartGroup, 48, 120);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(articleSourceContent.getTitle(), null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composer2, 817889280, 0, 15742);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer2, 48);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion3);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                String publisher = articleSourceContent.getPublisher();
                int i7 = i4;
                TextStyle textS = bentoTheme.getTypography(composer2, i7).getTextS();
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU();
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(publisher, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8170);
                composer2.startReplaceGroup(814633694);
                if (articleSourceContent.getUrl() != null) {
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_DIAGONAL_UP_16), null, bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU(), null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
                }
                composer2.endReplaceGroup();
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                String strStringResource = StringResources_androidKt.stringResource(C12023R.string.copilot_digest_source_dot, composer2, 0);
                TextStyle textS2 = bentoTheme.getTypography(composer2, i7).getTextS();
                long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU();
                composer3 = composer2;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(jM21426getFg20d7_KjU2), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textS2, composer3, 24576, 0, 8168);
                Resources resources = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                BentoText2.m20747BentoText38GnDrw(articleSourceContent.getPublishedAt(resources), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextS(), composer3, 24576, 0, 8170);
                composer3.endNode();
                composer3.endNode();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AssetDigestComposableKt.CopilotSourceItem$lambda$30(articleSourceContent, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(articleSourceContent);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetDigestComposableKt.CopilotSourceItem$lambda$25$lambda$24(function1, articleSourceContent);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null), 0.0f, 1, null);
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierFillMaxWidth$default2, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0);
                Alignment.Companion companion5 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    iconUrl = articleSourceContent.getIconUrl();
                    composerStartRestartGroup.startReplaceGroup(-1290302324);
                    if (iconUrl != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(articleSourceContent.getTitle(), null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composer2, 817889280, 0, 15742);
                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion5.getCenterVertically(), composer2, 48);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, companion32);
                        Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                            String publisher2 = articleSourceContent.getPublisher();
                            int i72 = i4;
                            TextStyle textS3 = bentoTheme.getTypography(composer2, i72).getTextS();
                            long jM21426getFg20d7_KjU3 = bentoTheme.getColors(composer2, i72).m21426getFg20d7_KjU();
                            FontWeight.Companion companion42 = FontWeight.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(publisher2, null, Color.m6701boximpl(jM21426getFg20d7_KjU3), null, companion42.getBold(), null, null, 0, false, 0, 0, null, 0, textS3, composer2, 24576, 0, 8170);
                            composer2.startReplaceGroup(814633694);
                            if (articleSourceContent.getUrl() != null) {
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme.getSpacing(composer2, i72).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                            String strStringResource2 = StringResources_androidKt.stringResource(C12023R.string.copilot_digest_source_dot, composer2, 0);
                            TextStyle textS22 = bentoTheme.getTypography(composer2, i72).getTextS();
                            long jM21426getFg20d7_KjU22 = bentoTheme.getColors(composer2, i72).m21426getFg20d7_KjU();
                            composer3 = composer2;
                            BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM5144paddingVpY3zN4$default2, Color.m6701boximpl(jM21426getFg20d7_KjU22), null, companion42.getBold(), null, null, 0, false, 0, 0, null, 0, textS22, composer3, 24576, 0, 8168);
                            Resources resources2 = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                            BentoText2.m20747BentoText38GnDrw(articleSourceContent.getPublishedAt(resources2), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i72).m21426getFg20d7_KjU()), null, companion42.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i72).getTextS(), composer3, 24576, 0, 8170);
                            composer3.endNode();
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CopilotSourceItem$lambda$25$lambda$24(Function1 function1, AssetDigestViewState.ArticleSourceContent articleSourceContent) {
        function1.invoke(articleSourceContent);
        return Unit.INSTANCE;
    }

    private static final void AssetDigestComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1979741663);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1979741663, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestComposablePreview (AssetDigestComposable.kt:573)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), ComposableSingletons$AssetDigestComposableKt.INSTANCE.m12558getLambda$144413343$feature_cortex_digest_asset_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestComposableKt.AssetDigestComposablePreview$lambda$31(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
