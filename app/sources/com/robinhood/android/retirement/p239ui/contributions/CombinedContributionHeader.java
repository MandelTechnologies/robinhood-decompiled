package com.robinhood.android.retirement.p239ui.contributions;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.BiasAlignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
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
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionSummary;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionViewModel;
import com.robinhood.android.retirement.C26959R;
import com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCard;
import com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCard2;
import com.robinhood.android.retirement.lib.ContributionRings;
import com.robinhood.android.retirement.lib.ContributionRings2;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: CombinedContributionHeader.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u000f\u001a=\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001aA\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f\u001a/\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010$\u001aA\u0010(\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120*2\u0006\u0010+\u001a\u00020,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00060.H\u0003¢\u0006\u0002\u0010/\u001a5\u00100\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00162\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0001¢\u0006\u0002\u00105\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010%\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000¨\u00066²\u0006\n\u00107\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\f\u00108\u001a\u0004\u0018\u000109X\u008a\u0084\u0002²\u0006\n\u0010:\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010;\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\f\u0010<\u001a\u0004\u0018\u000109X\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010>\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010A\u001a\u00020BX\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010D\u001a\u00020,X\u008a\u008e\u0002"}, m3636d2 = {"ArcedTextAngle", "", "ArcedTextSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "ContributionRingArcedText", "", "modifier", "Landroidx/compose/ui/Modifier;", "topText", "", "bottomText", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ContributionRingBottomText", "text", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InnerRing", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionSummary;", ResourceTypes.STYLE, "Lcom/robinhood/android/retirement/ui/contributions/ContributionRingStyle;", "isFirstAppearance", "", "onInitialAnimationComplete", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionSummary;Lcom/robinhood/android/retirement/ui/contributions/ContributionRingStyle;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ContributionRing", "ringPlacement", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;", "callbacks", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsRingCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionSummary;ZLcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;Lcom/robinhood/android/retirement/ui/contributions/ContributionRingStyle;Lcom/robinhood/android/retirement/ui/contributions/ContributionsRingCallbacks;Landroidx/compose/runtime/Composer;II)V", "CombinedContributionHeader", "viewState", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsViewState;", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsHeaderCallbacks;", "(Lcom/robinhood/android/retirement/ui/contributions/ContributionsViewState;Lcom/robinhood/android/retirement/ui/contributions/ContributionsHeaderCallbacks;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SummarySelectForwardTag", "SummarySelectBackwardTag", "SummarySelectYearIndicatorTag", "SummarySelector", "summaries", "", "activeIndex", "", "onSummarySelected", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SummarySelectorButton", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "enabled", "onClick", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-tab_externalDebug", "targetPercent", "innerRingComposition", "Lcom/airbnb/lottie/LottieComposition;", "innerRingProgress", "enokiIsVisible", "enokiComposition", "enokiVisibilityState", "outerRingIsVisible", "outerRingIsSet", "outerRingEntryState", "outerRingBias", "Landroidx/compose/ui/BiasAlignment;", "outerRingMinScale", "activeSummaryIndex"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class CombinedContributionHeader {
    private static final float ArcedTextAngle = 180.0f;
    private static final long ArcedTextSize = TextUnit2.getSp(15);
    public static final String SummarySelectBackwardTag = "summary_select_backward";
    public static final String SummarySelectForwardTag = "summary_select_forward";
    public static final String SummarySelectYearIndicatorTag = "summary_select_year_indicator";

    /* compiled from: CombinedContributionHeader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CombinedContributionHeader3.values().length];
            try {
                iArr[CombinedContributionHeader3.MATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CombinedContributionHeader3.FEDERAL_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ContributionsSummaryCard.values().length];
            try {
                iArr2[ContributionsSummaryCard.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ContributionsSummaryCard.Middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ContributionsSummaryCard.Bottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CombinedContributionHeader$lambda$57(ContributionsViewState contributionsViewState, CombinedContributionHeader4 combinedContributionHeader4, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CombinedContributionHeader(contributionsViewState, combinedContributionHeader4, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionRing$lambda$49(Modifier modifier, RetirementCombinedContributionSummary retirementCombinedContributionSummary, boolean z, ContributionsSummaryCard contributionsSummaryCard, CombinedContributionHeader3 combinedContributionHeader3, CombinedContributionHeader5 combinedContributionHeader5, int i, int i2, Composer composer, int i3) {
        ContributionRing(modifier, retirementCombinedContributionSummary, z, contributionsSummaryCard, combinedContributionHeader3, combinedContributionHeader5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionRingArcedText$lambda$6(Modifier modifier, String str, String str2, int i, int i2, Composer composer, int i3) {
        ContributionRingArcedText(modifier, str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionRingBottomText$lambda$9(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContributionRingBottomText(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float InnerRing$lambda$25$lambda$24$lambda$23(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InnerRing$lambda$28(Modifier modifier, RetirementCombinedContributionSummary retirementCombinedContributionSummary, CombinedContributionHeader3 combinedContributionHeader3, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        InnerRing(modifier, retirementCombinedContributionSummary, combinedContributionHeader3, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SummarySelector$lambda$63(Modifier modifier, List list, int i, Function1 function1, int i2, int i3, Composer composer, int i4) {
        SummarySelector(modifier, list, i, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SummarySelectorButton$lambda$64(Modifier modifier, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        SummarySelectorButton(modifier, serverToBentoAssetMapper2, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final boolean ContributionRing$lambda$30(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean ContributionRing$lambda$33(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float ContributionRing$lambda$35(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final BiasAlignment ContributionRing$lambda$38(SnapshotState4<BiasAlignment> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final LottieComposition InnerRing$lambda$13(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float InnerRing$lambda$14(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final boolean InnerRing$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final LottieComposition InnerRing$lambda$18(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final float InnerRing$lambda$19(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final void ContributionRingArcedText(Modifier modifier, final String str, final String str2, Composer composer, final int i, final int i2) {
        int i3;
        final String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(966939835);
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
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            str3 = str2;
        } else {
            str3 = str2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
            }
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(966939835, i3, -1, "com.robinhood.android.retirement.ui.contributions.ContributionRingArcedText (CombinedContributionHeader.kt:108)");
            }
            final long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged = composerStartRestartGroup.changed(jM21425getFg0d7_KjU) | composerStartRestartGroup.changedInstance(context) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CombinedContributionHeader.ContributionRingArcedText$lambda$5$lambda$4(str3, str, jM21425getFg0d7_KjU, context, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifier, (Function1) objRememberedValue, composerStartRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = modifier;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CombinedContributionHeader.ContributionRingArcedText$lambda$6(modifier2, str, str2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionRingArcedText$lambda$5$lambda$4(String str, String str2, long j, Context context, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f = 2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) / f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) / f;
        float f2 = fIntBitsToFloat / f;
        float f3 = fIntBitsToFloat2 / f;
        float f4 = fIntBitsToFloat + f2;
        float f5 = fIntBitsToFloat2 + f3;
        Canvas canvas = Canvas.getDrawContext().getCanvas();
        Paint paint = new Paint();
        paint.setTextSize(Canvas.mo5015toPxR2X_6o(ArcedTextSize));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(Color2.m6735toArgb8_81llA(j));
        paint.setTypeface(RhTypeface.MEDIUM.load(context));
        paint.setAntiAlias(true);
        Path path = new Path();
        path.addArc(f2, f3, f4, f5, 180.0f, 180.0f);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        int i = rect.bottom - rect.top;
        Path path2 = new Path();
        float f6 = i;
        path2.addArc(f2, f3 + f6, f4, f5 + f6, 180.0f, -180.0f);
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawTextOnPath(str2, path, 0.0f, 0.0f, paint);
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawTextOnPath(str, path2, 0.0f, 0.0f, paint);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ContributionRingBottomText(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(291093788);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
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
                    ComposerKt.traceEventStart(291093788, i3, -1, "com.robinhood.android.retirement.ui.contributions.ContributionRingBottomText (CombinedContributionHeader.kt:162)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column6, companion3, 0.725f, false, 2, null), composerStartRestartGroup, 0);
                Modifier modifierWeight$default = Column5.weight$default(column6, companion3, 0.1f, false, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i3 & 14, 0, 16382);
                composerStartRestartGroup.endNode();
                Spacer2.Spacer(Column5.weight$default(column6, companion3, 0.175f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CombinedContributionHeader.ContributionRingBottomText$lambda$9(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion4.getCenterHorizontally();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column62, companion32, 0.725f, false, 2, null), composerStartRestartGroup, 0);
                Modifier modifierWeight$default2 = Column5.weight$default(column62, companion32, 0.1f, false, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier modifier42 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i3 & 14, 0, 16382);
                    composerStartRestartGroup.endNode();
                    Spacer2.Spacer(Column5.weight$default(column62, companion32, 0.175f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void InnerRing(Modifier modifier, final RetirementCombinedContributionSummary retirementCombinedContributionSummary, final CombinedContributionHeader3 combinedContributionHeader3, final boolean z, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        RetirementCombinedContributionSummary retirementCombinedContributionSummary2;
        final Modifier modifier3;
        final float fCoerceForLottie$default;
        boolean zChanged;
        Object objRememberedValue;
        final SnapshotFloatState2 snapshotFloatState2;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState;
        Object objRememberedValue2;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        LottieCompositionResult lottieCompositionResultRememberLottieComposition;
        Composer composer2;
        float progress;
        Composer composer3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged2;
        Object objRememberedValue3;
        int i4;
        boolean z2;
        boolean zChanged3;
        Object objRememberedValue4;
        String str;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-724077972);
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
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                retirementCombinedContributionSummary2 = retirementCombinedContributionSummary;
                i3 |= composerStartRestartGroup.changedInstance(retirementCombinedContributionSummary2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(combinedContributionHeader3.ordinal()) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-724077972, i3, -1, "com.robinhood.android.retirement.ui.contributions.InnerRing (CombinedContributionHeader.kt:191)");
                }
                fCoerceForLottie$default = ContributionsSummaryCard2.coerceForLottie$default(retirementCombinedContributionSummary2.getCurrentPercent(), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(fCoerceForLottie$default);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(!z ? 0.0f : fCoerceForLottie$default);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                ContributionRings contributionRings = ContributionRings.INSTANCE;
                int i6 = i3;
                LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(contributionRings.getProgressRingSpec(), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(snapshotFloatState2.getFloatValue(), contributionRings.getInnerRingTweenSpec(), 0.0f, null, null, composerStartRestartGroup, 0, 28);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(!z), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C26959R.raw.contribution_enoki_pulse)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup.startReplaceGroup(-54198047);
                if (z) {
                    composer2 = composerStartRestartGroup;
                    progress = 1.0f;
                } else if (InnerRing$lambda$16(snapshotState)) {
                    composer2 = composerStartRestartGroup;
                    progress = animateLottieCompositionAsState.animateLottieCompositionAsState(InnerRing$lambda$18(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, 0, null, false, false, composer2, 0, 1022).getProgress();
                } else {
                    composer2 = composerStartRestartGroup;
                    progress = 0.0f;
                }
                composer2.endReplaceGroup();
                composer3 = composer2;
                SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(!InnerRing$lambda$16(snapshotState) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(500, 0, contributionRings.getInnerRingEasing(), 2, null), 0.0f, null, null, composer3, 0, 28);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.useNode();
                } else {
                    composer3.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                LottieComposition lottieCompositionInnerRing$lambda$13 = InnerRing$lambda$13(lottieCompositionResultRememberLottieComposition2);
                composer3.startReplaceGroup(5004770);
                zChanged2 = composer3.changed(snapshotState4AnimateFloatAsState);
                objRememberedValue3 = composer3.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(CombinedContributionHeader.InnerRing$lambda$14(snapshotState4AnimateFloatAsState));
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                composer3.endReplaceGroup();
                final float f = progress;
                LottieAnimation2.LottieAnimation(lottieCompositionInnerRing$lambda$13, (Function0) objRememberedValue3, modifierFillMaxSize$default, false, false, false, null, false, null, null, null, false, false, null, null, false, composer3, 384, 0, 65528);
                composerStartRestartGroup = composer3;
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                i4 = iArr[combinedContributionHeader3.ordinal()];
                if (i4 != 1) {
                    composerStartRestartGroup.startReplaceGroup(671674640);
                    ContributionRingArcedText(Alpha.alpha(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), InnerRing$lambda$19(snapshotState4AnimateFloatAsState2)), retirementCombinedContributionSummary.getCenterLabel(), StringResources_androidKt.stringResource(C26959R.string.retirement_contribution_year_center_bottom_label, new Object[]{Formats.getPercentFormat().format(Float.valueOf(retirementCombinedContributionSummary.getCenterPercent()))}, composerStartRestartGroup, 0), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (i4 != 2) {
                        composerStartRestartGroup.startReplaceGroup(-1917997242);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(672206817);
                    ContributionRingBottomText(retirementCombinedContributionSummary.getDisplayYear(), Alpha.alpha(companion3, InnerRing$lambda$19(snapshotState4AnimateFloatAsState2)), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.startReplaceGroup(-1917944794);
                if (InnerRing$lambda$18(lottieCompositionResultRememberLottieComposition) != null) {
                    LottieComposition lottieCompositionInnerRing$lambda$18 = InnerRing$lambda$18(lottieCompositionResultRememberLottieComposition);
                    if (!Intrinsics.areEqual(lottieCompositionInnerRing$lambda$18 != null ? Float.valueOf(lottieCompositionInnerRing$lambda$18.getDuration()) : null, 0.0f)) {
                        composerStartRestartGroup.startReplaceGroup(-1917939859);
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                        CombinedContributionHeader3 combinedContributionHeader32 = CombinedContributionHeader3.MATCH;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default2, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21594getXlargeD9Ej5fM());
                        if (modifierM5142padding3ABfNKs != null) {
                            modifierFillMaxSize$default2 = modifierM5142padding3ABfNKs;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierAlpha = Alpha.alpha(Scale2.scale(modifierFillMaxSize$default2, InnerRing$lambda$19(snapshotState4AnimateFloatAsState2)), InnerRing$lambda$19(snapshotState4AnimateFloatAsState2));
                        LottieComposition lottieCompositionInnerRing$lambda$182 = InnerRing$lambda$18(lottieCompositionResultRememberLottieComposition);
                        CharSequence charSequence = LottieProperty.TEXT;
                        int i8 = iArr[combinedContributionHeader3.ordinal()];
                        if (i8 == 1) {
                            str = Format2.format(retirementCombinedContributionSummary.getCenterContribution());
                        } else {
                            if (i8 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = Format2.format(retirementCombinedContributionSummary.getCurrentContribution());
                        }
                        LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties = LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{LottieDynamicProperties2.rememberLottieDynamicProperty(charSequence, str, new String[]{"**"}, composerStartRestartGroup, 6), LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.COLOR, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU())), new String[]{"**"}, composerStartRestartGroup, 6)}, composerStartRestartGroup, LottieDynamicProperties3.$stable);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChanged4 = composerStartRestartGroup.changed(f);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(CombinedContributionHeader.InnerRing$lambda$25$lambda$24$lambda$23(f));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer4 = composerStartRestartGroup;
                        f = f;
                        LottieAnimation2.LottieAnimation(lottieCompositionInnerRing$lambda$182, (Function0) objRememberedValue5, modifierAlpha, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties, null, null, false, false, null, null, false, composer4, LottieDynamicProperties.$stable << 24, 0, 65272);
                        composerStartRestartGroup = composer4;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                z2 = f != 1.0f;
                boolean z3 = InnerRing$lambda$14(snapshotState4AnimateFloatAsState) < fCoerceForLottie$default;
                if (z2 && z3) {
                    function0.invoke();
                }
                Float fValueOf = Float.valueOf(fCoerceForLottie$default);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged3 = composerStartRestartGroup.changed(snapshotFloatState2) | composerStartRestartGroup.changed(fCoerceForLottie$default) | ((i6 & 57344) != 16384);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CombinedContributionHeader.InnerRing$lambda$27$lambda$26(fCoerceForLottie$default, function0, snapshotState, snapshotFloatState2, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(fValueOf, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CombinedContributionHeader.InnerRing$lambda$28(modifier3, retirementCombinedContributionSummary, combinedContributionHeader3, z, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        retirementCombinedContributionSummary2 = retirementCombinedContributionSummary;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            fCoerceForLottie$default = ContributionsSummaryCard2.coerceForLottie$default(retirementCombinedContributionSummary2.getCurrentPercent(), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(fCoerceForLottie$default);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(!z ? 0.0f : fCoerceForLottie$default);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                ContributionRings contributionRings2 = ContributionRings.INSTANCE;
                int i62 = i3;
                LottieCompositionResult lottieCompositionResultRememberLottieComposition22 = rememberLottieComposition.rememberLottieComposition(contributionRings2.getProgressRingSpec(), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(snapshotFloatState2.getFloatValue(), contributionRings2.getInnerRingTweenSpec(), 0.0f, null, null, composerStartRestartGroup, 0, 28);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C26959R.raw.contribution_enoki_pulse)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup.startReplaceGroup(-54198047);
                if (z) {
                }
                composer2.endReplaceGroup();
                composer3 = composer2;
                SnapshotState4<Float> snapshotState4AnimateFloatAsState22 = AnimateAsState.animateFloatAsState(!InnerRing$lambda$16(snapshotState) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(500, 0, contributionRings2.getInnerRingEasing(), 2, null), 0.0f, null, null, composer3, 0, 28);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifier3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composer3.getApplier() == null) {
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null);
                    LottieComposition lottieCompositionInnerRing$lambda$132 = InnerRing$lambda$13(lottieCompositionResultRememberLottieComposition22);
                    composer3.startReplaceGroup(5004770);
                    zChanged2 = composer3.changed(snapshotState4AnimateFloatAsState);
                    objRememberedValue3 = composer3.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(CombinedContributionHeader.InnerRing$lambda$14(snapshotState4AnimateFloatAsState));
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                        composer3.endReplaceGroup();
                        final float f2 = progress;
                        LottieAnimation2.LottieAnimation(lottieCompositionInnerRing$lambda$132, (Function0) objRememberedValue3, modifierFillMaxSize$default3, false, false, false, null, false, null, null, null, false, false, null, null, false, composer3, 384, 0, 65528);
                        composerStartRestartGroup = composer3;
                        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
                        i4 = iArr2[combinedContributionHeader3.ordinal()];
                        if (i4 != 1) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-1917944794);
                        if (InnerRing$lambda$18(lottieCompositionResultRememberLottieComposition) != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (f2 != 1.0f) {
                        }
                        if (InnerRing$lambda$14(snapshotState4AnimateFloatAsState) < fCoerceForLottie$default) {
                        }
                        if (z2) {
                            function0.invoke();
                        }
                        Float fValueOf2 = Float.valueOf(fCoerceForLottie$default);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged3 = composerStartRestartGroup.changed(snapshotFloatState2) | composerStartRestartGroup.changed(fCoerceForLottie$default) | ((i62 & 57344) != 16384);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged3) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CombinedContributionHeader.InnerRing$lambda$27$lambda$26(fCoerceForLottie$default, function0, snapshotState, snapshotFloatState2, (DisposableEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(fValueOf2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void InnerRing$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult InnerRing$lambda$27$lambda$26(float f, final Function0 function0, SnapshotState snapshotState, SnapshotFloatState2 snapshotFloatState2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        InnerRing$lambda$17(snapshotState, true);
        snapshotFloatState2.setFloatValue(f);
        return new DisposableEffectResult() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$InnerRing$lambda$27$lambda$26$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                function0.invoke();
            }
        };
    }

    private static final void ContributionRing(Modifier modifier, final RetirementCombinedContributionSummary retirementCombinedContributionSummary, final boolean z, ContributionsSummaryCard contributionsSummaryCard, final CombinedContributionHeader3 combinedContributionHeader3, final CombinedContributionHeader5 combinedContributionHeader5, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        SnapshotState snapshotState;
        float f;
        Composer composer2;
        final ContributionsSummaryCard contributionsSummaryCard2;
        Object objDerivedStateOf;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1240019804);
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
            i3 |= composerStartRestartGroup.changedInstance(retirementCombinedContributionSummary) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(contributionsSummaryCard.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(combinedContributionHeader3.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= (i & 262144) == 0 ? composerStartRestartGroup.changed(combinedContributionHeader5) : composerStartRestartGroup.changedInstance(combinedContributionHeader5) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            contributionsSummaryCard2 = contributionsSummaryCard;
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1240019804, i3, -1, "com.robinhood.android.retirement.ui.contributions.ContributionRing (CombinedContributionHeader.kt:339)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(!z), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            if (ContributionRing$lambda$30(snapshotState2)) {
                snapshotState = snapshotState3;
                f = 1.0f;
            } else {
                snapshotState = snapshotState3;
                f = 0.0f;
            }
            final SnapshotState snapshotState4 = snapshotState;
            composer2 = composerStartRestartGroup;
            final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(f, AnimationSpecKt.tween$default(MathKt.roundToInt(450.0f), 0, null, 6, null), 0.0f, null, null, composer2, 0, 28);
            composer2.startReplaceGroup(5004770);
            boolean z2 = (i3 & 7168) == 2048;
            Object objRememberedValue3 = composer2.rememberedValue();
            if (z2 || objRememberedValue3 == companion.getEmpty()) {
                contributionsSummaryCard2 = contributionsSummaryCard;
                objDerivedStateOf = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CombinedContributionHeader.ContributionRing$lambda$37$lambda$36(contributionsSummaryCard2, snapshotState4AnimateFloatAsState);
                    }
                });
                composer2.updateRememberedValue(objDerivedStateOf);
            } else {
                objDerivedStateOf = objRememberedValue3;
                contributionsSummaryCard2 = contributionsSummaryCard;
            }
            SnapshotState4 snapshotState42 = (SnapshotState4) objDerivedStateOf;
            composer2.endReplaceGroup();
            final float fMo5016toPx0680j_4 = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(ContributionsSummaryCard2.getContributionCardRingMaxSize());
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue4;
            composer2.endReplaceGroup();
            int i5 = i3;
            Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(modifier4, 1.0f, false, 2, null);
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged = composer2.changed(fMo5016toPx0680j_4);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CombinedContributionHeader.ContributionRing$lambda$44$lambda$43(fMo5016toPx0680j_4, snapshotFloatState2, (IntSize) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierAspectRatio$default, (Function1) objRememberedValue5);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierOnSizeChanged);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize = SizeKt.fillMaxSize(boxScopeInstance.align(companion3, ContributionRing$lambda$38(snapshotState42)), RangesKt.coerceAtLeast(ContributionRing$lambda$35(snapshotState4AnimateFloatAsState), snapshotFloatState2.getFloatValue()));
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CombinedContributionHeader.ContributionRing$lambda$48$lambda$46$lambda$45(snapshotState4);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue6);
            }
            composer2.endReplaceGroup();
            Modifier modifier5 = modifier4;
            ContributionRings2.ContributionOuterRing(modifierFillMaxSize, z, (Function0) objRememberedValue6, composer2, ((i5 >> 3) & 112) | 384, 0);
            composer2.startReplaceGroup(223774801);
            if (ContributionRing$lambda$33(snapshotState4) && retirementCombinedContributionSummary != null) {
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                composer2.startReplaceGroup(5004770);
                boolean z3 = (i5 & 458752) == 131072 || ((i5 & 262144) != 0 && composer2.changedInstance(combinedContributionHeader5));
                Object objRememberedValue7 = composer2.rememberedValue();
                if (z3 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new CombinedContributionHeader2(combinedContributionHeader5);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceGroup();
                InnerRing(modifierFillMaxSize$default, retirementCombinedContributionSummary, combinedContributionHeader3, z, (Function0) ((KFunction) objRememberedValue7), composer2, (i5 & 112) | 6 | ((i5 >> 6) & 896) | ((i5 << 3) & 7168), 0);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            ContributionRing$lambda$31(snapshotState2, true);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ContributionsSummaryCard contributionsSummaryCard3 = contributionsSummaryCard2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CombinedContributionHeader.ContributionRing$lambda$49(modifier3, retirementCombinedContributionSummary, z, contributionsSummaryCard3, combinedContributionHeader3, combinedContributionHeader5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ContributionRing$lambda$31(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void ContributionRing$lambda$34(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BiasAlignment ContributionRing$lambda$37$lambda$36(ContributionsSummaryCard contributionsSummaryCard, SnapshotState4 snapshotState4) {
        float fContributionRing$lambda$35;
        int i = WhenMappings.$EnumSwitchMapping$1[contributionsSummaryCard.ordinal()];
        if (i == 1) {
            fContributionRing$lambda$35 = ContributionRing$lambda$35(snapshotState4) - 1.0f;
        } else if (i == 2) {
            fContributionRing$lambda$35 = 0.0f;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fContributionRing$lambda$35 = 1.0f - ContributionRing$lambda$35(snapshotState4);
        }
        return new BiasAlignment(ContributionRing$lambda$35(snapshotState4) - 1.0f, fContributionRing$lambda$35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionRing$lambda$44$lambda$43(float f, SnapshotFloatState2 snapshotFloatState2, IntSize intSize) {
        snapshotFloatState2.setFloatValue(f / ((int) (intSize.getPackedValue() >> 32)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionRing$lambda$48$lambda$46$lambda$45(SnapshotState snapshotState) {
        ContributionRing$lambda$34(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CombinedContributionHeader(final ContributionsViewState viewState, final CombinedContributionHeader4 callbacks, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        int i4;
        RetirementCombinedContributionViewModel viewModel;
        final List<RetirementCombinedContributionSummary> listEmptyList;
        boolean zChangedInstance;
        Object objRememberedValue;
        RetirementCombinedContributionSummary retirementCombinedContributionSummary;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(532545002);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(532545002, i4, -1, "com.robinhood.android.retirement.ui.contributions.CombinedContributionHeader (CombinedContributionHeader.kt:403)");
                }
                viewModel = viewState.getViewModel();
                if (viewModel != null || (listEmptyList = viewModel.getSummaries()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                Object[] objArr = {Integer.valueOf(listEmptyList.size())};
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(listEmptyList);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CombinedContributionHeader.CombinedContributionHeader$lambda$51$lambda$50(listEmptyList);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                retirementCombinedContributionSummary = (RetirementCombinedContributionSummary) CollectionsKt.getOrNull(listEmptyList, snapshotIntState2.getIntValue());
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                List<RetirementCombinedContributionSummary> list = listEmptyList;
                ContributionsHeaderText2.ContributionsHeaderText(viewState, retirementCombinedContributionSummary, callbacks, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 7, null), composerStartRestartGroup, ((i4 << 3) & 896) | (i4 & 14), 0);
                composerStartRestartGroup = composerStartRestartGroup;
                ContributionRing(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(column6.align(companion3, companion.getCenterHorizontally()), 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1), retirementCombinedContributionSummary, z2, viewState.getRingPlacement(), viewState.getStyle(), callbacks, composerStartRestartGroup, (i4 & 896) | ((i4 << 12) & 458752), 0);
                if (retirementCombinedContributionSummary == null) {
                    composerStartRestartGroup.startReplaceGroup(-323049615);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 5, null);
                    int intValue = snapshotIntState2.getIntValue();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChanged = composerStartRestartGroup.changed(snapshotIntState2);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CombinedContributionHeader.CombinedContributionHeader$lambda$56$lambda$55$lambda$54(snapshotIntState2, ((Integer) obj).intValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SummarySelector(modifierM5146paddingqDBjuR0$default, list, intValue, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-322532721);
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CombinedContributionHeader.CombinedContributionHeader$lambda$57(viewState, callbacks, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) != 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            viewModel = viewState.getViewModel();
            if (viewModel != null) {
                listEmptyList = CollectionsKt.emptyList();
                Object[] objArr2 = {Integer.valueOf(listEmptyList.size())};
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(listEmptyList);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CombinedContributionHeader.CombinedContributionHeader$lambda$51$lambda$50(listEmptyList);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                    retirementCombinedContributionSummary = (RetirementCombinedContributionSummary) CollectionsKt.getOrNull(listEmptyList, snapshotIntState22.getIntValue());
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i62 = BentoTheme.$stable;
                        Modifier modifier52 = modifier4;
                        List<RetirementCombinedContributionSummary> list2 = listEmptyList;
                        ContributionsHeaderText2.ContributionsHeaderText(viewState, retirementCombinedContributionSummary, callbacks, PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 7, null), composerStartRestartGroup, ((i4 << 3) & 896) | (i4 & 14), 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        ContributionRing(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(column62.align(companion32, companion4.getCenterHorizontally()), 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1), retirementCombinedContributionSummary, z2, viewState.getRingPlacement(), viewState.getStyle(), callbacks, composerStartRestartGroup, (i4 & 896) | ((i4 << 12) & 458752), 0);
                        if (retirementCombinedContributionSummary == null) {
                        }
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 CombinedContributionHeader$lambda$51$lambda$50(List list) {
        return SnapshotIntState3.mutableIntStateOf(list.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CombinedContributionHeader$lambda$56$lambda$55$lambda$54(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
        return Unit.INSTANCE;
    }

    private static final void SummarySelector(Modifier modifier, final List<RetirementCombinedContributionSummary> list, final int i, final Function1<? super Integer, Unit> function1, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        List<RetirementCombinedContributionSummary> list2;
        int i5;
        float f;
        boolean z;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1209032546);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            list2 = list;
        } else {
            list2 = list;
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1209032546, i4, -1, "com.robinhood.android.retirement.ui.contributions.SummarySelector (CombinedContributionHeader.kt:463)");
            }
            boolean z2 = list2.size() > 1;
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_LEFT_16;
            float fMo20642getButtonSizeD9Ej5fM = new BentoIconButton4.Icon.StandardSize16(serverToBentoAssetMapper2).mo20642getButtonSizeD9Ej5fM();
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-974505828);
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, SummarySelectBackwardTag);
                boolean z3 = i > 0;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z4 = ((i4 & 7168) == 2048) | ((i4 & 896) == 256);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CombinedContributionHeader.SummarySelector$lambda$62$lambda$59$lambda$58(function1, i);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                i5 = i4;
                f = fMo20642getButtonSizeD9Ej5fM;
                z = true;
                SummarySelectorButton(modifierTestTag, serverToBentoAssetMapper2, z3, function0, composerStartRestartGroup, 54, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i5 = i4;
                f = fMo20642getButtonSizeD9Ej5fM;
                z = true;
                composerStartRestartGroup.startReplaceGroup(-974186745);
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, f), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierTestTag2 = TestTag3.testTag(companion2, SummarySelectYearIndicatorTag);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            int i8 = i5;
            Modifier modifier5 = modifier4;
            boolean z5 = z2;
            BentoText2.m20747BentoText38GnDrw(list.get(i).getDisplayYear(), PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(modifierTestTag2, bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(50)), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, 24576, 0, 8168);
            composerStartRestartGroup = composerStartRestartGroup;
            if (z5) {
                composerStartRestartGroup.startReplaceGroup(-973462709);
                Modifier modifierTestTag3 = TestTag3.testTag(companion2, SummarySelectForwardTag);
                ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.CARET_RIGHT_16;
                boolean z6 = i < list.size() + (-1) ? z : false;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z7 = ((i8 & 7168) == 2048 ? z : false) | ((i8 & 896) == 256 ? z : false);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z7 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CombinedContributionHeader.SummarySelector$lambda$62$lambda$61$lambda$60(function1, i);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                SummarySelectorButton(modifierTestTag3, serverToBentoAssetMapper22, z6, (Function0) objRememberedValue2, composerStartRestartGroup, 54, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-973127289);
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion2, f), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CombinedContributionHeader.SummarySelector$lambda$63(modifier3, list, i, function1, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SummarySelector$lambda$62$lambda$59$lambda$58(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i - 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SummarySelector$lambda$62$lambda$61$lambda$60(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i + 1));
        return Unit.INSTANCE;
    }

    public static final void SummarySelectorButton(Modifier modifier, final ServerToBentoAssetMapper2 icon, final boolean z, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(66747413);
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
            i3 |= composerStartRestartGroup.changed(icon.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(66747413, i3, -1, "com.robinhood.android.retirement.ui.contributions.SummarySelectorButton (CombinedContributionHeader.kt:523)");
            }
            int i5 = i3 << 9;
            composer2 = composerStartRestartGroup;
            BentoIconButton2.m20641BentoIconButtoncqYvz4g(Haptics.hapticClick(onClick, composerStartRestartGroup, (i3 >> 9) & 14), new BentoIconButton4.Icon.StandardSize16(icon), "", modifier4, BentoIconButton4.Type.Secondary, z2, null, null, null, null, false, composer2, (BentoIconButton4.Icon.StandardSize16.$stable << 3) | 24960 | (i5 & 7168) | (i5 & 458752), 0, 1984);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CombinedContributionHeader.SummarySelectorButton$lambda$64(modifier3, icon, z, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
