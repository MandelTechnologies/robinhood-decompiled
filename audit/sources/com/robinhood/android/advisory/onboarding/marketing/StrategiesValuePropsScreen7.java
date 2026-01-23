package com.robinhood.android.advisory.onboarding.marketing;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.TextUnit2;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreen7;
import com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.responsive.WindowSize;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Composable3;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.AnimationExoPlayer2;
import com.robinhood.compose.common.AnimationExoPlayerConfig;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.advisory.p304db.onboarding.StrategiesValuePropsData;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StrategiesValuePropsScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001au\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a{\u0010\u001e\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0002\b\u00192\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0002\b\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001aY\u0010&\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0002\b\u00192\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0002\b\u0019H\u0003¢\u0006\u0004\b$\u0010%\u001aa\u0010)\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0002\b\u00192\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0002\b\u0019H\u0003¢\u0006\u0004\b'\u0010(\u001aW\u0010-\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b-\u0010.\u001a7\u0010/\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b/\u00100\u001a!\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b2\u00103\u001a/\u00106\u001a\u00020\u000b2\u0006\u0010+\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b6\u00107\u001a9\u00108\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b8\u00109\u001a]\u0010=\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b=\u0010>\"\u0017\u0010?\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0014\u0010C\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010@\"\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F\"\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010@\"\u0014\u0010J\u001a\u00020I8\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010F\"\u0014\u0010K\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006Q²\u0006\u000e\u0010M\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020D8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010P\u001a\u0004\u0018\u00010O8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "title", "subtitle", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "termsCtaText", "continueCtaText", "", "shouldShrinkTitleText", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "Lkotlin/Function0;", "", "onContinueClicked", "onTermsClicked", "isEmbedded", "Landroidx/compose/ui/Modifier;", "modifier", "StrategiesValuePropsBodyContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "accountSelectorTabArgs", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "videoContent", "bodyContent", "onCloseClicked", "fixedBottomContent", "StrategiesValuePropsContainer", "(Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Landroidx/compose/ui/graphics/Color;", "darkBg", "StandardValuePropsContent-cf5BqRc", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/ScrollState;JLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "StandardValuePropsContent", "EmbeddedScrollableValuePropsContent-uDo3WH8", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/ScrollState;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;JLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "EmbeddedScrollableValuePropsContent", "Lcom/robinhood/models/advisory/db/onboarding/StrategiesValuePropsData;", WebsocketGatewayConstants.DATA_KEY, "source", "LoadedStrategiesValuePropsScreen", "(Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Lcom/robinhood/models/advisory/db/onboarding/StrategiesValuePropsData;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", CreateTransferV2Composable3.ContinueButtonTag, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "videoUrl", "StrategiesVideoContent", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/advisory/db/onboarding/StrategiesValuePropsData$TermsSheet;", "onDismissRequest", "MarketingTermsBottomSheet", "(Lcom/robinhood/models/advisory/db/onboarding/StrategiesValuePropsData$TermsSheet;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingStrategiesValuePropsScreen", "(Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState;", "state", "onRetryClicked", "StrategiesValuePropsScreen", "(Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StrategiesValuePropsLightBackground", "J", "getStrategiesValuePropsLightBackground", "()J", "VideoBackgroundGrey", "Landroidx/compose/ui/unit/Dp;", "HeaderVerticalPadding", "F", "Landroidx/compose/ui/unit/TextUnit;", "SmallerTitleTextSize", "", "MaximumHeightPercentageToAlsoHaveLargeText", "LoadingValuePropsTestTag", "Ljava/lang/String;", "showingBottomSheet", "videoHeightDp", "Lcom/robinhood/compose/common/AnimationExoPlayerConfig;", "videoConfig", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class StrategiesValuePropsScreen7 {
    public static final String LoadingValuePropsTestTag = "strategies_value_props_loading";
    private static final float MaximumHeightPercentageToAlsoHaveLargeText = 0.41f;
    private static final long StrategiesValuePropsLightBackground = Color2.Color(4293717488L);
    private static final long VideoBackgroundGrey = Color2.Color(4283521397L);
    private static final float HeaderVerticalPadding = C2002Dp.m7995constructorimpl(12);
    private static final long SmallerTitleTextSize = TextUnit2.getSp(32);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContinueButton$lambda$17(String str, Function0 function0, Screen screen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContinueButton(str, function0, screen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmbeddedScrollableValuePropsContent_uDo3WH8$lambda$6(PaddingValues paddingValues, ScrollState scrollState, AccountSelectorTabArgs accountSelectorTabArgs, long j, Function3 function3, Function3 function32, int i, Composer composer, int i2) {
        m11077EmbeddedScrollableValuePropsContentuDo3WH8(paddingValues, scrollState, accountSelectorTabArgs, j, function3, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedStrategiesValuePropsScreen$lambda$16(AccountSelectorTabArgs accountSelectorTabArgs, StrategiesValuePropsData strategiesValuePropsData, String str, Function0 function0, Function0 function02, ScrollState scrollState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedStrategiesValuePropsScreen(accountSelectorTabArgs, strategiesValuePropsData, str, function0, function02, scrollState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingStrategiesValuePropsScreen$lambda$31(AccountSelectorTabArgs accountSelectorTabArgs, ScrollState scrollState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingStrategiesValuePropsScreen(accountSelectorTabArgs, scrollState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketingTermsBottomSheet$lambda$30(StrategiesValuePropsData.TermsSheet termsSheet, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MarketingTermsBottomSheet(termsSheet, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardValuePropsContent_cf5BqRc$lambda$4(PaddingValues paddingValues, ScrollState scrollState, long j, Function3 function3, Function3 function32, int i, Composer composer, int i2) {
        m11078StandardValuePropsContentcf5BqRc(paddingValues, scrollState, j, function3, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StrategiesValuePropsBodyContent$lambda$1(String str, String str2, String str3, String str4, String str5, boolean z, Screen screen, Function0 function0, Function0 function02, boolean z2, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        StrategiesValuePropsBodyContent(str, str2, str3, str4, str5, z, screen, function0, function02, z2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StrategiesValuePropsContainer$lambda$2(AccountSelectorTabArgs accountSelectorTabArgs, ScrollState scrollState, Function3 function3, Function3 function32, Function0 function0, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        StrategiesValuePropsContainer(accountSelectorTabArgs, scrollState, function3, function32, function0, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StrategiesValuePropsScreen$lambda$32(AccountSelectorTabArgs accountSelectorTabArgs, StrategiesValuePropsScreenViewState strategiesValuePropsScreenViewState, ScrollState scrollState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StrategiesValuePropsScreen(accountSelectorTabArgs, strategiesValuePropsScreenViewState, scrollState, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StrategiesVideoContent$lambda$26(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StrategiesVideoContent(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final long getStrategiesValuePropsLightBackground() {
        return StrategiesValuePropsLightBackground;
    }

    private static final float LoadedStrategiesValuePropsScreen$lambda$12(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    private static final boolean LoadedStrategiesValuePropsScreen$lambda$9(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final AnimationExoPlayerConfig StrategiesVideoContent$lambda$19(SnapshotState<AnimationExoPlayerConfig> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StrategiesValuePropsBodyContent(final String str, final String str2, final String str3, final String str4, final String str5, final boolean z, final Screen screen, final Function0<Unit> function0, final Function0<Unit> function02, final boolean z2, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        String str6;
        int i4;
        String str7;
        String str8;
        String str9;
        Screen screen2;
        Function0<Unit> function03;
        int i5;
        int i6;
        int i7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-768491525);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            str6 = str;
        } else {
            str6 = str;
            if ((i & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(str6) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str7 = str3;
                    i4 |= composerStartRestartGroup.changed(str7) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        str8 = str4;
                        i4 |= composerStartRestartGroup.changed(str8) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            str9 = str5;
                            i4 |= composerStartRestartGroup.changed(str9) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        if ((i3 & 64) != 0) {
                            i4 |= 1572864;
                        } else {
                            if ((i & 1572864) == 0) {
                                screen2 = screen;
                                i4 |= composerStartRestartGroup.changedInstance(screen2) ? 1048576 : 524288;
                            }
                            if ((i3 & 128) == 0) {
                                i4 |= 12582912;
                            } else {
                                if ((i & 12582912) == 0) {
                                    function03 = function0;
                                    i4 |= composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
                                }
                                if ((i3 & 256) == 0) {
                                    if ((i & 100663296) == 0) {
                                        i4 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
                                    }
                                    if ((i3 & 512) == 0) {
                                        i4 |= 805306368;
                                    } else if ((i & 805306368) == 0) {
                                        i4 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                                    }
                                    i5 = i3 & 1024;
                                    if (i5 == 0) {
                                        i6 = i5;
                                        i7 = i2 | 6;
                                    } else if ((i2 & 6) == 0) {
                                        i6 = i5;
                                        i7 = i2 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
                                    } else {
                                        i6 = i5;
                                        i7 = i2;
                                    }
                                    if ((i4 & 306783379) != 306783378 && (i7 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        composer2 = composerStartRestartGroup;
                                    } else {
                                        Modifier modifier2 = i6 == 0 ? Modifier.INSTANCE : modifier;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-768491525, i4, i7, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsBodyContent (StrategiesValuePropsScreen.kt:99)");
                                        }
                                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier2, 0.0f, 1, null);
                                        int i8 = i4;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        modifier = modifier2;
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
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        TextStyle bookCoverMartinaSmall = bentoTheme.getTypography(composerStartRestartGroup, i9).getBookCoverMartinaSmall();
                                        TextAlign.Companion companion2 = TextAlign.INSTANCE;
                                        int iM7919getCentere0LSkKk = companion2.m7919getCentere0LSkKk();
                                        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bookCoverMartinaSmall, 0L, !z ? SmallerTitleTextSize : bookCoverMartinaSmall.m7662getFontSizeXSAIIZE(), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        BentoText2.m20747BentoText38GnDrw(str6, androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(companion3, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), HeaderVerticalPadding), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textStyleM7655copyp1EtxEg$default, composerStartRestartGroup, i8 & 14, 0, 8124);
                                        BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i8 >> 3) & 14, 0, 16318);
                                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 5, null);
                                        TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i9).getTextS();
                                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU();
                                        int iM7919getCentere0LSkKk2 = companion2.m7919getCentere0LSkKk();
                                        int i10 = i8 >> 6;
                                        BentoText2.m20747BentoText38GnDrw(str7, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, i10 & 14, 0, 8120);
                                        BentoTextButton2.m20715BentoTextButtonPIknLig(function02, str8, null, null, null, false, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU()), composerStartRestartGroup, ((i8 >> 24) & 14) | (i10 & 112), 60);
                                        composerStartRestartGroup.startReplaceGroup(-1002761560);
                                        if (z2) {
                                            int i11 = i8 >> 12;
                                            ContinueButton(str9, function03, screen2, null, composerStartRestartGroup, (i11 & 14) | ((i8 >> 18) & 112) | (i11 & 896), 8);
                                            composer2 = composerStartRestartGroup;
                                        } else {
                                            composer2 = composerStartRestartGroup;
                                        }
                                        composer2.endReplaceGroup();
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                    final Modifier modifier3 = modifier;
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return StrategiesValuePropsScreen7.StrategiesValuePropsBodyContent$lambda$1(str, str2, str3, str4, str5, z, screen, function0, function02, z2, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i4 |= 100663296;
                                if ((i3 & 512) == 0) {
                                }
                                i5 = i3 & 1024;
                                if (i5 == 0) {
                                }
                                if ((i4 & 306783379) != 306783378) {
                                    if (i6 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier2, 0.0f, 1, null);
                                    int i82 = i4;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    modifier = modifier2;
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                                        Column6 column62 = Column6.INSTANCE;
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i92 = BentoTheme.$stable;
                                        TextStyle bookCoverMartinaSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i92).getBookCoverMartinaSmall();
                                        TextAlign.Companion companion22 = TextAlign.INSTANCE;
                                        int iM7919getCentere0LSkKk3 = companion22.m7919getCentere0LSkKk();
                                        TextStyle textStyleM7655copyp1EtxEg$default2 = TextStyle.m7655copyp1EtxEg$default(bookCoverMartinaSmall2, 0L, !z ? SmallerTitleTextSize : bookCoverMartinaSmall2.m7662getFontSizeXSAIIZE(), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
                                        Modifier.Companion companion32 = Modifier.INSTANCE;
                                        BentoText2.m20747BentoText38GnDrw(str6, androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(companion32, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), HeaderVerticalPadding), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk3), 0, false, 0, 0, null, 0, textStyleM7655copyp1EtxEg$default2, composerStartRestartGroup, i82 & 14, 0, 8124);
                                        BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, TextAlign.m7912boximpl(companion22.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i82 >> 3) & 14, 0, 16318);
                                        Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM(), 5, null);
                                        TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i92).getTextS();
                                        long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i92).m21426getFg20d7_KjU();
                                        int iM7919getCentere0LSkKk22 = companion22.m7919getCentere0LSkKk();
                                        int i102 = i82 >> 6;
                                        BentoText2.m20747BentoText38GnDrw(str7, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk22), 0, false, 0, 0, null, 0, textS2, composerStartRestartGroup, i102 & 14, 0, 8120);
                                        BentoTextButton2.m20715BentoTextButtonPIknLig(function02, str8, null, null, null, false, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i92).m21426getFg20d7_KjU()), composerStartRestartGroup, ((i82 >> 24) & 14) | (i102 & 112), 60);
                                        composerStartRestartGroup.startReplaceGroup(-1002761560);
                                        if (z2) {
                                        }
                                        composer2.endReplaceGroup();
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }
                                }
                                final Modifier modifier32 = modifier;
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            function03 = function0;
                            if ((i3 & 256) == 0) {
                            }
                            if ((i3 & 512) == 0) {
                            }
                            i5 = i3 & 1024;
                            if (i5 == 0) {
                            }
                            if ((i4 & 306783379) != 306783378) {
                            }
                            final Modifier modifier322 = modifier;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        screen2 = screen;
                        if ((i3 & 128) == 0) {
                        }
                        function03 = function0;
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        i5 = i3 & 1024;
                        if (i5 == 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                        }
                        final Modifier modifier3222 = modifier;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    str9 = str5;
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    screen2 = screen;
                    if ((i3 & 128) == 0) {
                    }
                    function03 = function0;
                    if ((i3 & 256) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    i5 = i3 & 1024;
                    if (i5 == 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    final Modifier modifier32222 = modifier;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                str8 = str4;
                if ((i3 & 16) == 0) {
                }
                str9 = str5;
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                screen2 = screen;
                if ((i3 & 128) == 0) {
                }
                function03 = function0;
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                i5 = i3 & 1024;
                if (i5 == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                final Modifier modifier322222 = modifier;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str7 = str3;
            if ((i3 & 8) != 0) {
            }
            str8 = str4;
            if ((i3 & 16) == 0) {
            }
            str9 = str5;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            screen2 = screen;
            if ((i3 & 128) == 0) {
            }
            function03 = function0;
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i5 = i3 & 1024;
            if (i5 == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            final Modifier modifier3222222 = modifier;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        str7 = str3;
        if ((i3 & 8) != 0) {
        }
        str8 = str4;
        if ((i3 & 16) == 0) {
        }
        str9 = str5;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        screen2 = screen;
        if ((i3 & 128) == 0) {
        }
        function03 = function0;
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i5 = i3 & 1024;
        if (i5 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        final Modifier modifier32222222 = modifier;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void StrategiesValuePropsContainer(final AccountSelectorTabArgs accountSelectorTabArgs, final ScrollState scrollState, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function32, final Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        ScrollState scrollState2;
        final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function33;
        final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function34;
        int i4;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1405667653);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(accountSelectorTabArgs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                scrollState2 = scrollState;
                i3 |= composerStartRestartGroup.changed(scrollState2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
                function33 = function3;
            } else {
                function33 = function3;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function33) ? 256 : 128;
                }
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                function34 = function32;
            } else {
                function34 = function32;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function34) ? 2048 : 1024;
                }
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        function22 = function2;
                        i3 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                    }
                    i6 = i3;
                    if ((599187 & i6) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function2M11069getLambda$845837181$feature_advisory_onboarding_externalDebug = i5 == 0 ? StrategiesValuePropsScreen.INSTANCE.m11069getLambda$845837181$feature_advisory_onboarding_externalDebug() : function22;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1405667653, i6, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsContainer (StrategiesValuePropsScreen.kt:155)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        final long jet = bentoTheme.getColors(composerStartRestartGroup, i7).getJet();
                        long nova = bentoTheme.getColors(composerStartRestartGroup, i7).getNova();
                        final ScrollState scrollState3 = scrollState2;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier4 = modifier2;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, ComposableLambda3.rememberComposableLambda(1634153087, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.StrategiesValuePropsContainer.1
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
                                    ComposerKt.traceEventStart(1634153087, i8, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsContainer.<anonymous> (StrategiesValuePropsScreen.kt:164)");
                                }
                                AccountSelectorTabArgs accountSelectorTabArgs2 = accountSelectorTabArgs;
                                if (accountSelectorTabArgs2 == null || !accountSelectorTabArgs2.isEmbedded()) {
                                    Boolean bool = Boolean.FALSE;
                                    Boolean bool2 = Boolean.TRUE;
                                    final Function0<Unit> function02 = function0;
                                    BentoTheme2.BentoTheme(bool, null, null, null, null, bool2, null, null, ComposableLambda3.rememberComposableLambda(-697764462, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.StrategiesValuePropsContainer.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i9) {
                                            if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-697764462, i9, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsContainer.<anonymous>.<anonymous> (StrategiesValuePropsScreen.kt:169)");
                                            }
                                            Function2<Composer, Integer, Unit> function2M11067getLambda$1154417153$feature_advisory_onboarding_externalDebug = StrategiesValuePropsScreen.INSTANCE.m11067getLambda$1154417153$feature_advisory_onboarding_externalDebug();
                                            final Function0<Unit> function03 = function02;
                                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11067getLambda$1154417153$feature_advisory_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(2100596563, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.StrategiesValuePropsContainer.1.1.1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                                    invoke(bentoAppBarScope, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i10) {
                                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                    if ((i10 & 6) == 0) {
                                                        i10 |= (i10 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                                                    }
                                                    if ((i10 & 19) == 18 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2100596563, i10, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsContainer.<anonymous>.<anonymous>.<anonymous> (StrategiesValuePropsScreen.kt:173)");
                                                    }
                                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function03, composer5, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer4, 54), null, null, true, false, null, null, 0L, null, composer4, 196998, 0, 2010);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), function2M11069getLambda$845837181$feature_advisory_onboarding_externalDebug, null, null, 0, jet, nova, null, ComposableLambda3.rememberComposableLambda(1058623626, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.StrategiesValuePropsContainer.2
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
                                    ComposerKt.traceEventStart(1058623626, i9, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsContainer.<anonymous> (StrategiesValuePropsScreen.kt:183)");
                                }
                                Boolean bool = Boolean.TRUE;
                                final AccountSelectorTabArgs accountSelectorTabArgs2 = accountSelectorTabArgs;
                                final ScrollState scrollState4 = scrollState3;
                                final long j = jet;
                                final Function3<Column5, Composer, Integer, Unit> function35 = function33;
                                final Function3<Column5, Composer, Integer, Unit> function36 = function34;
                                BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(-1425159214, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.StrategiesValuePropsContainer.2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i10) {
                                        Composer composer5 = composer4;
                                        if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1425159214, i10, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsContainer.<anonymous>.<anonymous> (StrategiesValuePropsScreen.kt:187)");
                                        }
                                        if (WindowSize.INSTANCE.getCurrentWidth(composer5, 6) == WindowSize.Compact) {
                                            composer5.startReplaceGroup(-1166337628);
                                            AccountSelectorTabArgs accountSelectorTabArgs3 = accountSelectorTabArgs2;
                                            if (accountSelectorTabArgs3 == null || !accountSelectorTabArgs3.isEmbedded()) {
                                                composer5.startReplaceGroup(-1165953662);
                                                StrategiesValuePropsScreen7.m11078StandardValuePropsContentcf5BqRc(paddingValues, scrollState4, j, function35, function36, composer5, 0);
                                                composer5.endReplaceGroup();
                                            } else {
                                                composer5.startReplaceGroup(-1166283192);
                                                StrategiesValuePropsScreen7.m11077EmbeddedScrollableValuePropsContentuDo3WH8(paddingValues, scrollState4, accountSelectorTabArgs2, j, function35, function36, composer4, 0);
                                                composer5 = composer4;
                                                composer5.endReplaceGroup();
                                            }
                                            composer5.endReplaceGroup();
                                        } else {
                                            composer5.startReplaceGroup(-1165618211);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
                                            long j2 = j;
                                            Function3<Column5, Composer, Integer, Unit> function37 = function35;
                                            Function3<Column5, Composer, Integer, Unit> function38 = function36;
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.Horizontal start = arrangement.getStart();
                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer5, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierFillMaxSize$default);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                            if (composer5.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                            Row6 row6 = Row6.INSTANCE;
                                            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, 1, null);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer5, 0);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, modifierFillMaxHeight$default);
                                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                            if (composer5.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor2);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            Spacer2.Spacer(Column5.weight$default(column6, Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j2, null, 2, null), 1.0f, false, 2, null), composer5, 0);
                                            function37.invoke(column6, composer5, 6);
                                            Spacer2.Spacer(Column5.weight$default(column6, Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), StrategiesValuePropsScreen7.getStrategiesValuePropsLightBackground(), null, 2, null), 1.0f, false, 2, null), composer5, 0);
                                            composer5.endNode();
                                            Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
                                            Brush.Companion companion4 = Brush.INSTANCE;
                                            Float fValueOf = Float.valueOf(0.0f);
                                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                            int i11 = BentoTheme.$stable;
                                            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(Background3.background$default(modifierWeight$default, Brush.Companion.m6683verticalGradient8A3gB4$default(companion4, new Tuples2[]{Tuples4.m3642to(fValueOf, Color.m6701boximpl(bentoTheme2.getColors(composer5, i11).getJet())), Tuples4.m3642to(Float.valueOf(0.28f), Color.m6701boximpl(bentoTheme2.getColors(composer5, i11).getJet())), Tuples4.m3642to(Float.valueOf(0.45f), Color.m6701boximpl(StrategiesValuePropsScreen7.VideoBackgroundGrey)), Tuples4.m3642to(Float.valueOf(0.73f), Color.m6701boximpl(StrategiesValuePropsScreen7.getStrategiesValuePropsLightBackground())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(StrategiesValuePropsScreen7.getStrategiesValuePropsLightBackground()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 0.0f, 1, null);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getBottom(), companion2.getStart(), composer5, 6);
                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer5, modifierFillMaxHeight$default2);
                                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                            if (composer5.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor3);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                            function38.invoke(column6, composer5, 6);
                                            composer5.endNode();
                                            composer5.endNode();
                                            composer5.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, ((i6 >> 15) & 14) | 805306416 | ((i6 >> 12) & 896), EnumC7081g.f2774x74902ae0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        function23 = function2M11069getLambda$845837181$feature_advisory_onboarding_externalDebug;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        function23 = function22;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return StrategiesValuePropsScreen7.StrategiesValuePropsContainer$lambda$2(accountSelectorTabArgs, scrollState, function3, function32, function0, modifier3, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                function22 = function2;
                i6 = i3;
                if ((599187 & i6) == 599186) {
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    final long jet2 = bentoTheme2.getColors(composerStartRestartGroup, i72).getJet();
                    long nova2 = bentoTheme2.getColors(composerStartRestartGroup, i72).getNova();
                    final ScrollState scrollState32 = scrollState2;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier42 = modifier2;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier42, ComposableLambda3.rememberComposableLambda(1634153087, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.StrategiesValuePropsContainer.1
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
                                ComposerKt.traceEventStart(1634153087, i8, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsContainer.<anonymous> (StrategiesValuePropsScreen.kt:164)");
                            }
                            AccountSelectorTabArgs accountSelectorTabArgs2 = accountSelectorTabArgs;
                            if (accountSelectorTabArgs2 == null || !accountSelectorTabArgs2.isEmbedded()) {
                                Boolean bool = Boolean.FALSE;
                                Boolean bool2 = Boolean.TRUE;
                                final Function0<Unit> function02 = function0;
                                BentoTheme2.BentoTheme(bool, null, null, null, null, bool2, null, null, ComposableLambda3.rememberComposableLambda(-697764462, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.StrategiesValuePropsContainer.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i9) {
                                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-697764462, i9, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsContainer.<anonymous>.<anonymous> (StrategiesValuePropsScreen.kt:169)");
                                        }
                                        Function2<Composer, Integer, Unit> function2M11067getLambda$1154417153$feature_advisory_onboarding_externalDebug = StrategiesValuePropsScreen.INSTANCE.m11067getLambda$1154417153$feature_advisory_onboarding_externalDebug();
                                        final Function0<Unit> function03 = function02;
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11067getLambda$1154417153$feature_advisory_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(2100596563, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.StrategiesValuePropsContainer.1.1.1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                                invoke(bentoAppBarScope, composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i10) {
                                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                if ((i10 & 6) == 0) {
                                                    i10 |= (i10 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                                                }
                                                if ((i10 & 19) == 18 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2100596563, i10, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsContainer.<anonymous>.<anonymous>.<anonymous> (StrategiesValuePropsScreen.kt:173)");
                                                }
                                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function03, composer5, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), null, null, true, false, null, null, 0L, null, composer4, 196998, 0, 2010);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), function2M11069getLambda$845837181$feature_advisory_onboarding_externalDebug, null, null, 0, jet2, nova2, null, ComposableLambda3.rememberComposableLambda(1058623626, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.StrategiesValuePropsContainer.2
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
                                ComposerKt.traceEventStart(1058623626, i9, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsContainer.<anonymous> (StrategiesValuePropsScreen.kt:183)");
                            }
                            Boolean bool = Boolean.TRUE;
                            final AccountSelectorTabArgs accountSelectorTabArgs2 = accountSelectorTabArgs;
                            final ScrollState scrollState4 = scrollState32;
                            final long j = jet2;
                            final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function35 = function33;
                            final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function36 = function34;
                            BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(-1425159214, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.StrategiesValuePropsContainer.2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i10) {
                                    Composer composer5 = composer4;
                                    if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1425159214, i10, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsContainer.<anonymous>.<anonymous> (StrategiesValuePropsScreen.kt:187)");
                                    }
                                    if (WindowSize.INSTANCE.getCurrentWidth(composer5, 6) == WindowSize.Compact) {
                                        composer5.startReplaceGroup(-1166337628);
                                        AccountSelectorTabArgs accountSelectorTabArgs3 = accountSelectorTabArgs2;
                                        if (accountSelectorTabArgs3 == null || !accountSelectorTabArgs3.isEmbedded()) {
                                            composer5.startReplaceGroup(-1165953662);
                                            StrategiesValuePropsScreen7.m11078StandardValuePropsContentcf5BqRc(paddingValues, scrollState4, j, function35, function36, composer5, 0);
                                            composer5.endReplaceGroup();
                                        } else {
                                            composer5.startReplaceGroup(-1166283192);
                                            StrategiesValuePropsScreen7.m11077EmbeddedScrollableValuePropsContentuDo3WH8(paddingValues, scrollState4, accountSelectorTabArgs2, j, function35, function36, composer4, 0);
                                            composer5 = composer4;
                                            composer5.endReplaceGroup();
                                        }
                                        composer5.endReplaceGroup();
                                    } else {
                                        composer5.startReplaceGroup(-1165618211);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
                                        long j2 = j;
                                        Function3<Column5, Composer, Integer, Unit> function37 = function35;
                                        Function3<Column5, Composer, Integer, Unit> function38 = function36;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Horizontal start = arrangement.getStart();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer5, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierFillMaxSize$default);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, 1, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer5, 0);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, modifierFillMaxHeight$default);
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor2);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        Spacer2.Spacer(Column5.weight$default(column6, Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j2, null, 2, null), 1.0f, false, 2, null), composer5, 0);
                                        function37.invoke(column6, composer5, 6);
                                        Spacer2.Spacer(Column5.weight$default(column6, Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), StrategiesValuePropsScreen7.getStrategiesValuePropsLightBackground(), null, 2, null), 1.0f, false, 2, null), composer5, 0);
                                        composer5.endNode();
                                        Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
                                        Brush.Companion companion4 = Brush.INSTANCE;
                                        Float fValueOf = Float.valueOf(0.0f);
                                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                        int i11 = BentoTheme.$stable;
                                        Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(Background3.background$default(modifierWeight$default, Brush.Companion.m6683verticalGradient8A3gB4$default(companion4, new Tuples2[]{Tuples4.m3642to(fValueOf, Color.m6701boximpl(bentoTheme22.getColors(composer5, i11).getJet())), Tuples4.m3642to(Float.valueOf(0.28f), Color.m6701boximpl(bentoTheme22.getColors(composer5, i11).getJet())), Tuples4.m3642to(Float.valueOf(0.45f), Color.m6701boximpl(StrategiesValuePropsScreen7.VideoBackgroundGrey)), Tuples4.m3642to(Float.valueOf(0.73f), Color.m6701boximpl(StrategiesValuePropsScreen7.getStrategiesValuePropsLightBackground())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(StrategiesValuePropsScreen7.getStrategiesValuePropsLightBackground()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 0.0f, 1, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getBottom(), companion2.getStart(), composer5, 6);
                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer5, modifierFillMaxHeight$default2);
                                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor3);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                        function38.invoke(column6, composer5, 6);
                                        composer5.endNode();
                                        composer5.endNode();
                                        composer5.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, ((i6 >> 15) & 14) | 805306416 | ((i6 >> 12) & 896), EnumC7081g.f2774x74902ae0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    function23 = function2M11069getLambda$845837181$feature_advisory_onboarding_externalDebug;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            function22 = function2;
            i6 = i3;
            if ((599187 & i6) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        scrollState2 = scrollState;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        function22 = function2;
        i6 = i3;
        if ((599187 & i6) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: StandardValuePropsContent-cf5BqRc, reason: not valid java name */
    public static final void m11078StandardValuePropsContentcf5BqRc(final PaddingValues paddingValues, final ScrollState scrollState, final long j, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1844522415);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(scrollState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function32) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1844522415, i2, -1, "com.robinhood.android.advisory.onboarding.marketing.StandardValuePropsContent (StrategiesValuePropsScreen.kt:263)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues), StrategiesValuePropsLightBackground, null, 2, null), 0.0f, 1, null), scrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion, j, null, 2, null), 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
            function3.invoke(column6, composerStartRestartGroup, Integer.valueOf(((i2 >> 6) & 112) | 6));
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            function32.invoke(column6, composerStartRestartGroup, Integer.valueOf(((i2 >> 9) & 112) | 6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StrategiesValuePropsScreen7.StandardValuePropsContent_cf5BqRc$lambda$4(paddingValues, scrollState, j, function3, function32, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EmbeddedScrollableValuePropsContent-uDo3WH8, reason: not valid java name */
    public static final void m11077EmbeddedScrollableValuePropsContentuDo3WH8(final PaddingValues paddingValues, final ScrollState scrollState, AccountSelectorTabArgs accountSelectorTabArgs, final long j, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i) {
        int i2;
        AccountSelectorTabArgs accountSelectorTabArgs2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-246118893);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(scrollState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            accountSelectorTabArgs2 = accountSelectorTabArgs;
            i2 |= composerStartRestartGroup.changedInstance(accountSelectorTabArgs2) ? 256 : 128;
        } else {
            accountSelectorTabArgs2 = accountSelectorTabArgs;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-246118893, i2, -1, "com.robinhood.android.advisory.onboarding.marketing.EmbeddedScrollableValuePropsContent (StrategiesValuePropsScreen.kt:295)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.padding(Background3.m4872backgroundbw27NRU$default(companion, StrategiesValuePropsLightBackground, null, 2, null), paddingValues), scrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion, j, null, 2, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM() + C2002Dp.m7995constructorimpl(accountSelectorTabArgs2.getInitialSpacerHeight()))), composerStartRestartGroup, 0);
            function3.invoke(column6, composerStartRestartGroup, Integer.valueOf(6 | ((i2 >> 9) & 112)));
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            function32.invoke(column6, composerStartRestartGroup, Integer.valueOf(6 | ((i2 >> 12) & 112)));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final AccountSelectorTabArgs accountSelectorTabArgs3 = accountSelectorTabArgs2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StrategiesValuePropsScreen7.EmbeddedScrollableValuePropsContent_uDo3WH8$lambda$6(paddingValues, scrollState, accountSelectorTabArgs3, j, function3, function32, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedStrategiesValuePropsScreen(final AccountSelectorTabArgs accountSelectorTabArgs, StrategiesValuePropsData data, final String source, final Function0<Unit> onCloseClicked, Function0<Unit> onContinueClicked, final ScrollState scrollState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Composer composer2;
        final StrategiesValuePropsData strategiesValuePropsData;
        final Function0<Unit> function0;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-657429883);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(accountSelectorTabArgs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(data) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(source) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClicked) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changed(scrollState) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-657429883, i3, -1, "com.robinhood.android.advisory.onboarding.marketing.LoadedStrategiesValuePropsScreen (StrategiesValuePropsScreen.kt:328)");
                }
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(-429911977);
                float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L));
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                final Screen screen = new Screen(Screen.Name.STRATEGIES_VALUE_PROPS, null, null, null, 14, null);
                int i5 = i3;
                Modifier modifier5 = modifier4;
                Context context = new Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null);
                boolean z = !C2002Dp.m7997equalsimpl0(LoadedStrategiesValuePropsScreen$lambda$12(snapshotState2), C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM()) && LoadedStrategiesValuePropsScreen$lambda$12(snapshotState2) / fMo5013toDpu2uoSUM > MaximumHeightPercentageToAlsoHaveLargeText;
                final boolean z2 = accountSelectorTabArgs == null && accountSelectorTabArgs.isEmbedded();
                Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(modifier5, new UserInteractionEventDescriptor(null, screen, null, context, null, null, 53, null));
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1051020369, true, new C88941(data, density, snapshotState2), composer2, 54);
                strategiesValuePropsData = data;
                function0 = onContinueClicked;
                StrategiesValuePropsContainer(accountSelectorTabArgs, scrollState, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-813196462, true, new C88952(data, onContinueClicked, z, screen, z2, snapshotState), composer2, 54), onCloseClicked, modifierLogScreenTransitions, ComposableLambda3.rememberComposableLambda(1890367685, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.LoadedStrategiesValuePropsScreen.3
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
                            ComposerKt.traceEventStart(1890367685, i6, -1, "com.robinhood.android.advisory.onboarding.marketing.LoadedStrategiesValuePropsScreen.<anonymous> (StrategiesValuePropsScreen.kt:386)");
                        }
                        if (z2) {
                            Boolean bool = Boolean.TRUE;
                            final StrategiesValuePropsData strategiesValuePropsData2 = strategiesValuePropsData;
                            final Function0<Unit> function02 = function0;
                            final Screen screen2 = screen;
                            BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(-1389977192, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.LoadedStrategiesValuePropsScreen.3.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1389977192, i7, -1, "com.robinhood.android.advisory.onboarding.marketing.LoadedStrategiesValuePropsScreen.<anonymous>.<anonymous> (StrategiesValuePropsScreen.kt:391)");
                                    }
                                    StrategiesValuePropsScreen7.ContinueButton(strategiesValuePropsData2.getContinueCtaText(), function02, screen2, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, (i5 & 14) | 1576320 | ((i5 >> 12) & 112) | ((i5 << 3) & 57344), 0);
                if (LoadedStrategiesValuePropsScreen$lambda$9(snapshotState)) {
                    StrategiesValuePropsData.TermsSheet termsSheet = strategiesValuePropsData.getTermsSheet();
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return StrategiesValuePropsScreen7.LoadedStrategiesValuePropsScreen$lambda$15$lambda$14(snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    MarketingTermsBottomSheet(termsSheet, (Function0) objRememberedValue3, null, composer2, 48, 4);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function0 = onContinueClicked;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                strategiesValuePropsData = data;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final StrategiesValuePropsData strategiesValuePropsData2 = strategiesValuePropsData;
                final Function0<Unit> function02 = function0;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StrategiesValuePropsScreen7.LoadedStrategiesValuePropsScreen$lambda$16(accountSelectorTabArgs, strategiesValuePropsData2, source, onCloseClicked, function02, scrollState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(-429911977);
            float fMo5013toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L));
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            final Screen screen2 = new Screen(Screen.Name.STRATEGIES_VALUE_PROPS, null, null, null, 14, null);
            int i52 = i3;
            Modifier modifier52 = modifier4;
            Context context2 = new Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null);
            if (C2002Dp.m7997equalsimpl0(LoadedStrategiesValuePropsScreen$lambda$12(snapshotState22), C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM())) {
                if (accountSelectorTabArgs == null) {
                    Modifier modifierLogScreenTransitions2 = ModifiersKt.logScreenTransitions(modifier52, new UserInteractionEventDescriptor(null, screen2, null, context2, null, null, 53, null));
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1051020369, true, new C88941(data, density2, snapshotState22), composer2, 54);
                    strategiesValuePropsData = data;
                    function0 = onContinueClicked;
                    StrategiesValuePropsContainer(accountSelectorTabArgs, scrollState, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(-813196462, true, new C88952(data, onContinueClicked, z, screen2, z2, snapshotState), composer2, 54), onCloseClicked, modifierLogScreenTransitions2, ComposableLambda3.rememberComposableLambda(1890367685, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.LoadedStrategiesValuePropsScreen.3
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
                                ComposerKt.traceEventStart(1890367685, i6, -1, "com.robinhood.android.advisory.onboarding.marketing.LoadedStrategiesValuePropsScreen.<anonymous> (StrategiesValuePropsScreen.kt:386)");
                            }
                            if (z2) {
                                Boolean bool = Boolean.TRUE;
                                final StrategiesValuePropsData strategiesValuePropsData22 = strategiesValuePropsData;
                                final Function0<Unit> function022 = function0;
                                final Screen screen22 = screen2;
                                BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(-1389977192, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.LoadedStrategiesValuePropsScreen.3.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1389977192, i7, -1, "com.robinhood.android.advisory.onboarding.marketing.LoadedStrategiesValuePropsScreen.<anonymous>.<anonymous> (StrategiesValuePropsScreen.kt:391)");
                                        }
                                        StrategiesValuePropsScreen7.ContinueButton(strategiesValuePropsData22.getContinueCtaText(), function022, screen22, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, (i52 & 14) | 1576320 | ((i52 >> 12) & 112) | ((i52 << 3) & 57344), 0);
                    if (LoadedStrategiesValuePropsScreen$lambda$9(snapshotState)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedStrategiesValuePropsScreen$lambda$10(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedStrategiesValuePropsScreen$lambda$13(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* compiled from: StrategiesValuePropsScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$LoadedStrategiesValuePropsScreen$1 */
    static final class C88941 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ StrategiesValuePropsData $data;
        final /* synthetic */ Density $density;
        final /* synthetic */ SnapshotState<C2002Dp> $videoHeightDp$delegate;

        C88941(StrategiesValuePropsData strategiesValuePropsData, Density density, SnapshotState<C2002Dp> snapshotState) {
            this.$data = strategiesValuePropsData;
            this.$density = density;
            this.$videoHeightDp$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Column5 StrategiesValuePropsContainer, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(StrategiesValuePropsContainer, "$this$StrategiesValuePropsContainer");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1051020369, i, -1, "com.robinhood.android.advisory.onboarding.marketing.LoadedStrategiesValuePropsScreen.<anonymous> (StrategiesValuePropsScreen.kt:361)");
            }
            String videoUrl = this.$data.getVideoUrl();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$density);
            final Density density = this.$density;
            final SnapshotState<C2002Dp> snapshotState = this.$videoHeightDp$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$LoadedStrategiesValuePropsScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StrategiesValuePropsScreen7.C88941.invoke$lambda$2$lambda$1(density, snapshotState, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            StrategiesValuePropsScreen7.StrategiesVideoContent(videoUrl, OnRemeasuredModifier2.onSizeChanged(companion, (Function1) objRememberedValue), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(Density density, SnapshotState snapshotState, IntSize intSize) {
            StrategiesValuePropsScreen7.LoadedStrategiesValuePropsScreen$lambda$13(snapshotState, density.mo5013toDpu2uoSUM((int) (intSize.getPackedValue() & 4294967295L)));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: StrategiesValuePropsScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$LoadedStrategiesValuePropsScreen$2 */
    static final class C88952 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ StrategiesValuePropsData $data;
        final /* synthetic */ boolean $isEmbedded;
        final /* synthetic */ Function0<Unit> $onContinueClicked;
        final /* synthetic */ Screen $screen;
        final /* synthetic */ boolean $shouldShrinkTitleText;
        final /* synthetic */ SnapshotState<Boolean> $showingBottomSheet$delegate;

        C88952(StrategiesValuePropsData strategiesValuePropsData, Function0<Unit> function0, boolean z, Screen screen, boolean z2, SnapshotState<Boolean> snapshotState) {
            this.$data = strategiesValuePropsData;
            this.$onContinueClicked = function0;
            this.$shouldShrinkTitleText = z;
            this.$screen = screen;
            this.$isEmbedded = z2;
            this.$showingBottomSheet$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Column5 StrategiesValuePropsContainer, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(StrategiesValuePropsContainer, "$this$StrategiesValuePropsContainer");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-813196462, i, -1, "com.robinhood.android.advisory.onboarding.marketing.LoadedStrategiesValuePropsScreen.<anonymous> (StrategiesValuePropsScreen.kt:370)");
            }
            String title = this.$data.getTitle();
            String subtitle = this.$data.getSubtitle();
            String disclosure = this.$data.getDisclosure();
            String termsCtaText = this.$data.getTermsCtaText();
            String continueCtaText = this.$data.getContinueCtaText();
            Function0<Unit> function0HapticClick = Haptics.hapticClick(this.$onContinueClicked, composer, 0);
            boolean z = this.$shouldShrinkTitleText;
            Screen screen = this.$screen;
            composer.startReplaceGroup(5004770);
            final SnapshotState<Boolean> snapshotState = this.$showingBottomSheet$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$LoadedStrategiesValuePropsScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StrategiesValuePropsScreen7.C88952.invoke$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            StrategiesValuePropsScreen7.StrategiesValuePropsBodyContent(title, subtitle, disclosure, termsCtaText, continueCtaText, z, screen, function0HapticClick, (Function0) objRememberedValue, this.$isEmbedded, null, composer, 100663296, 0, 1024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            StrategiesValuePropsScreen7.LoadedStrategiesValuePropsScreen$lambda$10(snapshotState, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedStrategiesValuePropsScreen$lambda$15$lambda$14(SnapshotState snapshotState) {
        LoadedStrategiesValuePropsScreen$lambda$10(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContinueButton(final String str, final Function0<Unit> function0, final Screen screen, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Function0<Unit> function02;
        Screen screen2;
        final Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1765253775);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            screen2 = screen;
        } else {
            screen2 = screen;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(screen2) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1765253775, i3, -1, "com.robinhood.android.advisory.onboarding.marketing.ContinueButton (StrategiesValuePropsScreen.kt:419)");
                }
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8(function02, str2, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifier3, new UserInteractionEventDescriptor(null, screen2, null, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 45, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), null, null, false, false, null, null, null, null, false, null, composer2, ((i3 >> 3) & 14) | ((i3 << 3) & 112), 0, 8184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StrategiesValuePropsScreen7.ContinueButton$lambda$17(str, function0, screen, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8(function02, str2, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifier3, new UserInteractionEventDescriptor(null, screen2, null, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 45, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), null, null, false, false, null, null, null, null, false, null, composer2, ((i3 >> 3) & 14) | ((i3 << 3) & 112), 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StrategiesVideoContent(final String videoUrl, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Modifier modifier3;
        final LifecycleOwner lifecycleOwner;
        final AnimationExoPlayerConfig animationExoPlayerConfig;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        int i4;
        Modifier modifier4;
        final SnapshotState snapshotState2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Composer composerStartRestartGroup = composer.startRestartGroup(1024726511);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(videoUrl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1024726511, i3, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesVideoContent (StrategiesValuePropsScreen.kt:446)");
                }
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                animationExoPlayerConfig = new AnimationExoPlayerConfig(0, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(animationExoPlayerConfig, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i6 = i3;
                AnimationExoPlayerConfig animationExoPlayerConfigStrategiesVideoContent$lambda$19 = StrategiesVideoContent$lambda$19(snapshotState);
                composerStartRestartGroup.startReplaceGroup(1214683394);
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue() || animationExoPlayerConfigStrategiesVideoContent$lambda$19 == null) {
                    i4 = 0;
                    modifier4 = modifier3;
                    snapshotState2 = snapshotState;
                } else {
                    Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 1.25f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z = (i6 & 14) == 4;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return StrategiesValuePropsScreen7.StrategiesVideoContent$lambda$22$lambda$21(videoUrl, (ExoPlayer) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifier4 = modifier3;
                    i4 = 0;
                    snapshotState2 = snapshotState;
                    AnimationExoPlayer2.AnimationExoPlayer(animationExoPlayerConfigStrategiesVideoContent$lambda$19, modifierAspectRatio$default, false, 0, null, null, (Function1) objRememberedValue3, composerStartRestartGroup, AnimationExoPlayerConfig.$stable, 60);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleOwner) | composerStartRestartGroup.changedInstance(animationExoPlayerConfig);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return StrategiesValuePropsScreen7.StrategiesVideoContent$lambda$25$lambda$24(lifecycleOwner, animationExoPlayerConfig, snapshotState2, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, i4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StrategiesValuePropsScreen7.StrategiesVideoContent$lambda$26(videoUrl, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            animationExoPlayerConfig = new AnimationExoPlayerConfig(0, 1);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i62 = i3;
            AnimationExoPlayerConfig animationExoPlayerConfigStrategiesVideoContent$lambda$192 = StrategiesVideoContent$lambda$19(snapshotState);
            composerStartRestartGroup.startReplaceGroup(1214683394);
            if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                i4 = 0;
                modifier4 = modifier3;
                snapshotState2 = snapshotState;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleOwner) | composerStartRestartGroup.changedInstance(animationExoPlayerConfig);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return StrategiesValuePropsScreen7.StrategiesVideoContent$lambda$25$lambda$24(lifecycleOwner, animationExoPlayerConfig, snapshotState2, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, i4);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StrategiesVideoContent$lambda$22$lambda$21(String str, ExoPlayer AnimationExoPlayer) {
        Intrinsics.checkNotNullParameter(AnimationExoPlayer, "$this$AnimationExoPlayer");
        AnimationExoPlayer.setMediaItem(MediaItem.fromUri(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult StrategiesVideoContent$lambda$25$lambda$24(LifecycleOwner lifecycleOwner, final AnimationExoPlayerConfig animationExoPlayerConfig, final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$StrategiesVideoContent$2$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner owner, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_PAUSE) {
                    snapshotState.setValue(null);
                } else if (event == Lifecycle.Event.ON_RESUME) {
                    snapshotState.setValue(animationExoPlayerConfig);
                }
            }
        };
        lifecycle.addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$StrategiesVideoContent$lambda$25$lambda$24$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycle.removeObserver(lifecycleEventObserver);
            }
        };
    }

    private static final void MarketingTermsBottomSheet(final StrategiesValuePropsData.TermsSheet termsSheet, final Function0<Unit> function0, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(241216932);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(termsSheet) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(241216932, i3, -1, "com.robinhood.android.advisory.onboarding.marketing.MarketingTermsBottomSheet (StrategiesValuePropsScreen.kt:495)");
            }
            final SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StrategiesValuePropsScreen7.MarketingTermsBottomSheet$lambda$29$lambda$28(coroutineScope, sheetStateRememberModalBottomSheetState, function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final Function0 function02 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1468390225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.MarketingTermsBottomSheet.1
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
                        ComposerKt.traceEventStart(-1468390225, i5, -1, "com.robinhood.android.advisory.onboarding.marketing.MarketingTermsBottomSheet.<anonymous> (StrategiesValuePropsScreen.kt:509)");
                    }
                    final Function0<Unit> function03 = function02;
                    final SheetState sheetState = sheetStateRememberModalBottomSheetState;
                    final Modifier modifier2 = modifier;
                    final StrategiesValuePropsData.TermsSheet termsSheet2 = termsSheet;
                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1102755251, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.MarketingTermsBottomSheet.1.1
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
                                ComposerKt.traceEventStart(-1102755251, i6, -1, "com.robinhood.android.advisory.onboarding.marketing.MarketingTermsBottomSheet.<anonymous>.<anonymous> (StrategiesValuePropsScreen.kt:510)");
                            }
                            final Function0<Unit> function04 = function03;
                            SheetState sheetState2 = sheetState;
                            Modifier modifier3 = modifier2;
                            final StrategiesValuePropsData.TermsSheet termsSheet3 = termsSheet2;
                            GenericActionHandlerKt.SduiModalBottomSheet(function04, sheetState2, modifier3, ComposableLambda3.rememberComposableLambda(-651346311, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt.MarketingTermsBottomSheet.1.1.1
                                public final void invoke(Column5 SduiModalBottomSheet, Composer composer4, int i7) {
                                    Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                                    if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-651346311, i7, -1, "com.robinhood.android.advisory.onboarding.marketing.MarketingTermsBottomSheet.<anonymous>.<anonymous>.<anonymous> (StrategiesValuePropsScreen.kt:515)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i8 = BentoTheme.$stable;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer4, i8).m21371getBg0d7_KjU(), null, 2, null);
                                    StrategiesValuePropsData.TermsSheet termsSheet4 = termsSheet3;
                                    Function0<Unit> function05 = function04;
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.Vertical top = arrangement.getTop();
                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer4, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM4872backgroundbw27NRU$default);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), bentoTheme.getSpacing(composer4, i8).m21592getMediumD9Ej5fM());
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer4, 0);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                    BentoText2.m20747BentoText38GnDrw(termsSheet4.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i8).getDisplayCapsuleSmall(), composer4, 0, 0, 8190);
                                    BentoText2.m20747BentoText38GnDrw(termsSheet4.getBody(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16382);
                                    composer4.endNode();
                                    BentoButtonKt.m20586BentoButtonEikTQX8(function05, termsSheet4.getDoneCtaText(), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer4, i8).m21592getMediumD9Ej5fM(), 1, null), null, null, false, false, null, null, null, null, false, null, composer4, 0, 0, 8184);
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer4, Integer num) {
                                    invoke(column5, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StrategiesValuePropsScreen7.MarketingTermsBottomSheet$lambda$30(termsSheet, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketingTermsBottomSheet$lambda$29$lambda$28(CoroutineScope coroutineScope, SheetState sheetState, final Function0 function0) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new StrategiesValuePropsScreen8(sheetState, null), 3, null).invokeOnCompletion(new Function1() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StrategiesValuePropsScreen7.MarketingTermsBottomSheet$lambda$29$lambda$28$lambda$27(function0, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketingTermsBottomSheet$lambda$29$lambda$28$lambda$27(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void LoadingStrategiesValuePropsScreen(final AccountSelectorTabArgs accountSelectorTabArgs, final ScrollState scrollState, final Function0<Unit> onCloseClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-426797981);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(accountSelectorTabArgs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(scrollState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClicked) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-426797981, i3, -1, "com.robinhood.android.advisory.onboarding.marketing.LoadingStrategiesValuePropsScreen (StrategiesValuePropsScreen.kt:554)");
            }
            StrategiesValuePropsScreen strategiesValuePropsScreen = StrategiesValuePropsScreen.INSTANCE;
            int i5 = (i3 & 14) | 3456 | (i3 & 112);
            int i6 = i3 << 6;
            StrategiesValuePropsContainer(accountSelectorTabArgs, scrollState, strategiesValuePropsScreen.getLambda$1328221463$feature_advisory_onboarding_externalDebug(), strategiesValuePropsScreen.m11068getLambda$275782410$feature_advisory_onboarding_externalDebug(), onCloseClicked, modifier3, null, composerStartRestartGroup, i5 | (57344 & i6) | (i6 & 458752), 64);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StrategiesValuePropsScreen7.LoadingStrategiesValuePropsScreen$lambda$31(accountSelectorTabArgs, scrollState, onCloseClicked, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StrategiesValuePropsScreen(final AccountSelectorTabArgs accountSelectorTabArgs, final StrategiesValuePropsScreenViewState state, final ScrollState scrollState, final Function0<Unit> onCloseClicked, final Function0<Unit> onContinueClicked, final Function0<Unit> onRetryClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(onRetryClicked, "onRetryClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-307542713);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(accountSelectorTabArgs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(scrollState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClicked) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRetryClicked) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) != 599186 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-307542713, i3, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreen (StrategiesValuePropsScreen.kt:605)");
                }
                if (!(state instanceof StrategiesValuePropsScreenViewState.Loaded)) {
                    composerStartRestartGroup.startReplaceGroup(-839320899);
                    OverrideSystemBarsStyle.OverrideStatusBarStyle(false, composerStartRestartGroup, 6);
                    StrategiesValuePropsScreenViewState.Loaded loaded = (StrategiesValuePropsScreenViewState.Loaded) state;
                    int i5 = i3;
                    LoadedStrategiesValuePropsScreen(accountSelectorTabArgs, loaded.getData(), loaded.getSource(), onCloseClicked, onContinueClicked, scrollState, modifier2, composerStartRestartGroup, (3670016 & i5) | (64526 & i5) | ((i5 << 9) & 458752), 0);
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    int i6 = i3;
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                    if (Intrinsics.areEqual(state, StrategiesValuePropsScreenViewState.Loading.INSTANCE)) {
                        composer2.startReplaceGroup(-838824837);
                        OverrideSystemBarsStyle.OverrideStatusBarStyle(false, composer2, 6);
                        int i7 = i6 >> 3;
                        LoadingStrategiesValuePropsScreen(accountSelectorTabArgs, scrollState, onCloseClicked, TestTag3.testTag(modifier3, LoadingValuePropsTestTag), composer2, (i6 & 14) | (i7 & 112) | (i7 & 896), 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!Intrinsics.areEqual(state, StrategiesValuePropsScreenViewState.Error.INSTANCE)) {
                            composer2.startReplaceGroup(804207473);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-838428595);
                        ErrorScreenComposable.ErrorScreenComposable(null, onRetryClicked, 0, null, null, null, null, false, composer2, (i6 >> 12) & 112, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                        composer2 = composer2;
                        composer2.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StrategiesValuePropsScreen7.StrategiesValuePropsScreen$lambda$32(accountSelectorTabArgs, state, scrollState, onCloseClicked, onContinueClicked, onRetryClicked, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) != 599186) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(state instanceof StrategiesValuePropsScreenViewState.Loaded)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
