package com.robinhood.android.feature.margin.hub.sdui;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
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
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.airbnb.lottie.value.ScaleXY;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.feature.margin.hub.C16839R;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.InlineAnnotatedString2;
import com.robinhood.compose.theme.SduiColors;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.models.serverdriven.experimental.api.MarginStatusCardContent;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiMarginStatusCardContent.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a/\u0010\u0013\u001a\u00020\u0014\"\b\b\u0000\u0010\u0015*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a(\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0000\u001a'\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010(\u001a\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\"\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006+²\u0006\n\u0010,\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020\"X\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\f\u00100\u001a\u0004\u0018\u000101X\u008a\u0084\u0002"}, m3636d2 = {"MARGIN_HUB_ANIMATION_DURATION_MILLIS", "", "RISKY_THRESHOLD", "", "INLINE_CONTENT_ARROW_ID", "", "MarginHubEasing", "Landroidx/compose/animation/core/Easing;", "getMarginHubEasing", "()Landroidx/compose/animation/core/Easing;", "marginHubAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getMarginHubAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "WARNING_ICON_KEYPATH", "", "getWARNING_ICON_KEYPATH", "()[Ljava/lang/String;", "[Ljava/lang/String;", "SduiMarginStatusCardContent", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/MarginStatusCardContent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/MarginStatusCardContent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "makeDescription", "Landroidx/compose/ui/text/AnnotatedString;", InstantRetirementAgreementComponents.MarkdownTag, "context", "Landroid/content/Context;", "showCtaText", "", "showCtaArrow", "SmallMarginBufferLottie", "lottiePercentageAnimated", "warningIconScaleAnimated", "Lcom/airbnb/lottie/value/ScaleXY;", "(FLcom/airbnb/lottie/value/ScaleXY;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "makeLottiePercentage", "rawBuffer", "feature-margin-hub_externalDebug", "introAnimationStage", "bufferPercentage", "showWarningIcon", "warningIconScaleXAnimated", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SduiMarginStatusCardContent2 {
    public static final String INLINE_CONTENT_ARROW_ID = "arrow";
    public static final int MARGIN_HUB_ANIMATION_DURATION_MILLIS = 500;
    private static final Easing MarginHubEasing;
    public static final float RISKY_THRESHOLD = 0.05f;
    private static final String[] WARNING_ICON_KEYPATH;
    private static final AnimationSpec<Float> marginHubAnimationSpec;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiMarginStatusCardContent$lambda$17(MarginStatusCardContent marginStatusCardContent, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiMarginStatusCardContent(marginStatusCardContent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SmallMarginBufferLottie$lambda$25$lambda$24$lambda$23(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallMarginBufferLottie$lambda$26(float f, ScaleXY scaleXY, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SmallMarginBufferLottie(f, scaleXY, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.33f, 0.0f, 0.11f, 1.0f);
        MarginHubEasing = cubicBezierEasing;
        marginHubAnimationSpec = AnimationSpecKt.tween$default(500, 0, cubicBezierEasing, 2, null);
        WARNING_ICON_KEYPATH = new String[]{"**", ".warning"};
    }

    public static final Easing getMarginHubEasing() {
        return MarginHubEasing;
    }

    public static final AnimationSpec<Float> getMarginHubAnimationSpec() {
        return marginHubAnimationSpec;
    }

    public static final String[] getWARNING_ICON_KEYPATH() {
        return WARNING_ICON_KEYPATH;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034b  */
    @SduiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiMarginStatusCardContent(final MarginStatusCardContent<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        final SnapshotState4 snapshotState4;
        boolean zChanged2;
        Object objRememberedValue3;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState;
        boolean zChanged3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1555535176);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(component) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555535176, i3, -1, "com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContent (SduiMarginStatusCardContent.kt:80)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(1, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                BigDecimal margin_buffer_percentage = component.getMargin_buffer_percentage();
                int iSduiMarginStatusCardContent$lambda$1 = SduiMarginStatusCardContent$lambda$1(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(margin_buffer_percentage) | composerStartRestartGroup.changed(iSduiMarginStatusCardContent$lambda$1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(SduiMarginStatusCardContent2.SduiMarginStatusCardContent$lambda$4$lambda$3(component, snapshotState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(makeLottiePercentage(SduiMarginStatusCardContent$lambda$5(snapshotState4)), marginHubAnimationSpec, 0.0f, null, null, composerStartRestartGroup, 0, 28);
                float fSduiMarginStatusCardContent$lambda$5 = SduiMarginStatusCardContent$lambda$5(snapshotState4);
                int iSduiMarginStatusCardContent$lambda$12 = SduiMarginStatusCardContent$lambda$1(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(fSduiMarginStatusCardContent$lambda$5) | composerStartRestartGroup.changed(iSduiMarginStatusCardContent$lambda$12);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(SduiMarginStatusCardContent2.SduiMarginStatusCardContent$lambda$8$lambda$7(snapshotState, snapshotState4));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!SduiMarginStatusCardContent$lambda$9((SnapshotState4) objRememberedValue3) ? 1.0f : 0.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                float fSduiMarginStatusCardContent$lambda$10 = SduiMarginStatusCardContent$lambda$10(snapshotState4AnimateFloatAsState);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged3 = composerStartRestartGroup.changed(fSduiMarginStatusCardContent$lambda$10);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SduiMarginStatusCardContent2.SduiMarginStatusCardContent$lambda$12$lambda$11(snapshotState4AnimateFloatAsState);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new SduiMarginStatusCardContent3(snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 6);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifierHeight = Intrinsic3.height(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Intrinsic4.Min);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Horizontal start = arrangement.getStart();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                String title = component.getTitle();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(title, null, null, null, component.is_margin_active() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8174);
                Composer composer3 = composerStartRestartGroup;
                composer3.startReplaceGroup(-892785459);
                if (component.getSubtitle().length() > 0) {
                    BentoText2.m20747BentoText38GnDrw(component.getSubtitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i5).getTextL(), composer3, 24576, 0, 8174);
                    composer3 = composer3;
                }
                composer3.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composer3, i5).m21593getSmallD9Ej5fM()), composer3, 0);
                composer2 = composer3;
                BentoText2.m20748BentoTextQnj7Zds(makeDescription(component.getDescription(), context, !component.getShow_cta() && component.is_margin_active(), component.getShow_cta()), null, null, null, null, null, null, 0, false, 0, 0, extensions2.persistentMapOf(InlineAnnotatedString2.m21615inlineContentPairg2O1Hgs(INLINE_CONTENT_ARROW_ID, new BentoIcon4.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12), "", bentoTheme.getColors(composer3, i5).m21425getFg0d7_KjU())), null, bentoTheme.getTypography(composer3, i5).getTextS(), composer2, 0, 0, 6142);
                composer2.endNode();
                SmallMarginBufferLottie(SduiMarginStatusCardContent$lambda$6(snapshotState4AnimateFloatAsState2), SduiMarginStatusCardContent$lambda$13(snapshotState42), null, composer2, 0, 4);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiMarginStatusCardContent2.SduiMarginStatusCardContent$lambda$17(component, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BigDecimal margin_buffer_percentage2 = component.getMargin_buffer_percentage();
            int iSduiMarginStatusCardContent$lambda$13 = SduiMarginStatusCardContent$lambda$1(snapshotState);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(margin_buffer_percentage2) | composerStartRestartGroup.changed(iSduiMarginStatusCardContent$lambda$13);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(SduiMarginStatusCardContent2.SduiMarginStatusCardContent$lambda$4$lambda$3(component, snapshotState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState22 = AnimateAsState.animateFloatAsState(makeLottiePercentage(SduiMarginStatusCardContent$lambda$5(snapshotState4)), marginHubAnimationSpec, 0.0f, null, null, composerStartRestartGroup, 0, 28);
                float fSduiMarginStatusCardContent$lambda$52 = SduiMarginStatusCardContent$lambda$5(snapshotState4);
                int iSduiMarginStatusCardContent$lambda$122 = SduiMarginStatusCardContent$lambda$1(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(fSduiMarginStatusCardContent$lambda$52) | composerStartRestartGroup.changed(iSduiMarginStatusCardContent$lambda$122);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(SduiMarginStatusCardContent2.SduiMarginStatusCardContent$lambda$8$lambda$7(snapshotState, snapshotState4));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!SduiMarginStatusCardContent$lambda$9((SnapshotState4) objRememberedValue3) ? 1.0f : 0.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                    float fSduiMarginStatusCardContent$lambda$102 = SduiMarginStatusCardContent$lambda$10(snapshotState4AnimateFloatAsState);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged3 = composerStartRestartGroup.changed(fSduiMarginStatusCardContent$lambda$102);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged3) {
                        objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContentKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SduiMarginStatusCardContent2.SduiMarginStatusCardContent$lambda$12$lambda$11(snapshotState4AnimateFloatAsState);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        SnapshotState4 snapshotState422 = (SnapshotState4) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 6);
                        Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Modifier modifierHeight2 = Intrinsic3.height(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Intrinsic4.Min);
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Horizontal start2 = arrangement2.getStart();
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(start2, companion22.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight2);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            Modifier modifierWeight$default2 = Row5.weight$default(row62, companion42, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
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
                                String title2 = component.getTitle();
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i52 = BentoTheme.$stable;
                                Modifier modifier42 = modifier3;
                                BentoText2.m20747BentoText38GnDrw(title2, null, null, null, component.is_margin_active() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8174);
                                Composer composer32 = composerStartRestartGroup;
                                composer32.startReplaceGroup(-892785459);
                                if (component.getSubtitle().length() > 0) {
                                }
                                composer32.endReplaceGroup();
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, bentoTheme2.getSpacing(composer32, i52).m21593getSmallD9Ej5fM()), composer32, 0);
                                if (component.getShow_cta()) {
                                    composer2 = composer32;
                                    BentoText2.m20748BentoTextQnj7Zds(makeDescription(component.getDescription(), context2, !component.getShow_cta() && component.is_margin_active(), component.getShow_cta()), null, null, null, null, null, null, 0, false, 0, 0, extensions2.persistentMapOf(InlineAnnotatedString2.m21615inlineContentPairg2O1Hgs(INLINE_CONTENT_ARROW_ID, new BentoIcon4.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12), "", bentoTheme2.getColors(composer32, i52).m21425getFg0d7_KjU())), null, bentoTheme2.getTypography(composer32, i52).getTextS(), composer2, 0, 0, 6142);
                                    composer2.endNode();
                                    SmallMarginBufferLottie(SduiMarginStatusCardContent$lambda$6(snapshotState4AnimateFloatAsState22), SduiMarginStatusCardContent$lambda$13(snapshotState422), null, composer2, 0, 4);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier2 = modifier42;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final int SduiMarginStatusCardContent$lambda$1(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue().intValue();
    }

    private static final float SduiMarginStatusCardContent$lambda$10(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final ScaleXY SduiMarginStatusCardContent$lambda$13(SnapshotState4<? extends ScaleXY> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final float SduiMarginStatusCardContent$lambda$5(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float SduiMarginStatusCardContent$lambda$6(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final boolean SduiMarginStatusCardContent$lambda$9(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final LottieComposition SmallMarginBufferLottie$lambda$22(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SduiMarginStatusCardContent$lambda$2(SnapshotState<Integer> snapshotState, int i) {
        snapshotState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SduiMarginStatusCardContent$lambda$4$lambda$3(MarginStatusCardContent marginStatusCardContent, SnapshotState snapshotState) {
        if (SduiMarginStatusCardContent$lambda$1(snapshotState) <= 1) {
            return 0.0f;
        }
        return marginStatusCardContent.getMargin_buffer_percentage().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiMarginStatusCardContent$lambda$8$lambda$7(SnapshotState snapshotState, SnapshotState4 snapshotState4) {
        return SduiMarginStatusCardContent$lambda$1(snapshotState) >= 3 && SduiMarginStatusCardContent$lambda$5(snapshotState4) <= 0.05f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScaleXY SduiMarginStatusCardContent$lambda$12$lambda$11(SnapshotState4 snapshotState4) {
        return new ScaleXY(SduiMarginStatusCardContent$lambda$10(snapshotState4), SduiMarginStatusCardContent$lambda$10(snapshotState4));
    }

    public static final AnnotatedString makeDescription(String markdown, Context context, boolean z, boolean z2) {
        int iPushStyle;
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        Intrinsics.checkNotNullParameter(context, "context");
        List listSplit$default = StringsKt.split$default((CharSequence) markdown, new String[]{"**"}, false, 0, 6, (Object) null);
        int i = 0;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(i, 1, null);
        for (Object obj : listSplit$default) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, i % 2 == 0 ? FontWeight.INSTANCE.getNormal() : FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
            try {
                builder.append(str);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                i = i2;
            } finally {
            }
        }
        if (z) {
            builder.append(PlaceholderUtils.XXShortPlaceholderText);
            iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61435, (DefaultConstructorMarker) null));
            try {
                String string2 = context.getString(C16839R.string.margin_status_card_view_details);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                builder.append(string2);
                Unit unit2 = Unit.INSTANCE;
            } finally {
            }
        }
        if (z2) {
            builder.append(PlaceholderUtils.XXShortPlaceholderText);
            InlineTextContent2.appendInlineContent$default(builder, INLINE_CONTENT_ARROW_ID, null, 2, null);
        }
        return builder.toAnnotatedString();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SmallMarginBufferLottie(final float f, final ScaleXY warningIconScaleAnimated, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(warningIconScaleAnimated, "warningIconScaleAnimated");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1831997606);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(warningIconScaleAnimated) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1831997606, i3, -1, "com.robinhood.android.feature.margin.hub.sdui.SmallMarginBufferLottie (SduiMarginStatusCardContent.kt:207)");
                }
                if (!((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
                    i4 = C16839R.raw.lottie_margin_hub_status_card_content_day;
                } else {
                    i4 = C16839R.raw.lottie_margin_hub_status_card_content_night;
                }
                LottieCompositionSpec.RawRes rawResM9170boximpl = LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i4));
                Modifier modifier5 = modifier4;
                z = false;
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(rawResM9170boximpl, null, null, null, null, null, composerStartRestartGroup, 0, 62);
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(100));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
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
                Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), 1.0f, false, 2, null);
                LottieComposition lottieCompositionSmallMarginBufferLottie$lambda$22 = SmallMarginBufferLottie$lambda$22(lottieCompositionResultRememberLottieComposition);
                ScaleXY scaleXY = LottieProperty.TRANSFORM_SCALE;
                String[] strArr = WARNING_ICON_KEYPATH;
                LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties = LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{LottieDynamicProperties2.rememberLottieDynamicProperty(scaleXY, warningIconScaleAnimated, (String[]) Arrays.copyOf(strArr, strArr.length), composerStartRestartGroup, (i3 & 112) | 6)}, composerStartRestartGroup, LottieDynamicProperties3.$stable);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 14) == 4) {
                    z = true;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(SduiMarginStatusCardContent2.SmallMarginBufferLottie$lambda$25$lambda$24$lambda$23(f));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionSmallMarginBufferLottie$lambda$22, (Function0) objRememberedValue, modifierAspectRatio$default, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties, null, null, false, false, null, null, false, composerStartRestartGroup, LottieDynamicProperties.$stable << 24, 0, 65272);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiMarginStatusCardContent2.SmallMarginBufferLottie$lambda$26(f, warningIconScaleAnimated, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
            }
            LottieCompositionSpec.RawRes rawResM9170boximpl2 = LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i4));
            Modifier modifier52 = modifier4;
            z = false;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(rawResM9170boximpl2, null, null, null, null, null, composerStartRestartGroup, 0, 62);
            Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(100));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs2);
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
                Modifier modifierAspectRatio$default2 = AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier52, 0.0f, 1, null), 1.0f, false, 2, null);
                LottieComposition lottieCompositionSmallMarginBufferLottie$lambda$222 = SmallMarginBufferLottie$lambda$22(lottieCompositionResultRememberLottieComposition2);
                ScaleXY scaleXY2 = LottieProperty.TRANSFORM_SCALE;
                String[] strArr2 = WARNING_ICON_KEYPATH;
                LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties2 = LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{LottieDynamicProperties2.rememberLottieDynamicProperty(scaleXY2, warningIconScaleAnimated, (String[]) Arrays.copyOf(strArr2, strArr2.length), composerStartRestartGroup, (i3 & 112) | 6)}, composerStartRestartGroup, LottieDynamicProperties3.$stable);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 14) == 4) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(SduiMarginStatusCardContent2.SmallMarginBufferLottie$lambda$25$lambda$24$lambda$23(f));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    LottieAnimation2.LottieAnimation(lottieCompositionSmallMarginBufferLottie$lambda$222, (Function0) objRememberedValue, modifierAspectRatio$default2, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties2, null, null, false, false, null, null, false, composerStartRestartGroup, LottieDynamicProperties.$stable << 24, 0, 65272);
                    composerStartRestartGroup = composerStartRestartGroup;
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

    public static final float makeLottiePercentage(float f) {
        return (((float) Math.ceil(f * 100.0f)) / 100.0f) + 0.01f;
    }
}
