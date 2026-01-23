package com.robinhood.android.gold.transfers;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingFunctions;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.StringsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldDepositBoostCelebrationComposable.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002\u001a?\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a)\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001b\u001a1\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\f\u0010 \u001a\u0004\u0018\u00010!X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020$X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020$X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020$X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020$X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u008e\u0002"}, m3636d2 = {"GoldDepositBoostCelebrationComposable", "", "goldDepositBoostCelebration", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$GoldDepositBoostCelebration;", "onClickPrimaryCta", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$GoldDepositBoostCelebration;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "framesToMillis", "", "", "AnimatedDepositBoostCharacter", "character", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "delayMillis", "initialOffsetValue", "targetOffsetValue", "easing", "Landroidx/compose/animation/core/Easing;", "(CLandroidx/compose/ui/text/TextStyle;IFFLandroidx/compose/animation/core/Easing;Landroidx/compose/runtime/Composer;II)V", "StaticDepositBoostText", "initialBoostAmount", "", "prefixSymbol", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AnimatedDepositBoostText", "updatedBoostAmount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-gold-transfers_externalRelease", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "titlePositionInWindow", "Landroidx/compose/ui/geometry/Offset;", "descriptionPositionInWindow", "initialAmountPositionInWindow", "amountTextStyle", "shouldDrawText", "", "updatedAmountPositionInWindow", "shouldInitialAmountExist"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldDepositBoostCelebrationComposable2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedDepositBoostCharacter$lambda$12(char c, TextStyle textStyle, int i, float f, float f2, Easing easing, int i2, int i3, Composer composer, int i4) {
        AnimatedDepositBoostCharacter(c, textStyle, i, f, f2, easing, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedDepositBoostText$lambda$68(String str, String str2, String str3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AnimatedDepositBoostText(str, str2, str3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldDepositBoostCelebrationComposable$lambda$9(UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldDepositBoostCelebrationComposable(goldDepositBoostCelebration, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaticDepositBoostText$lambda$32(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StaticDepositBoostText(str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ float access$GoldDepositBoostCelebrationComposable$lambda$8$lambda$1(LottieAnimationState lottieAnimationState) {
        return GoldDepositBoostCelebrationComposable$lambda$8$lambda$1(lottieAnimationState);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldDepositBoostCelebrationComposable(final UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration, final Function0<Unit> onClickPrimaryCta, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        long j;
        char c;
        Object objRememberedValue2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(goldDepositBoostCelebration, "goldDepositBoostCelebration");
        Intrinsics.checkNotNullParameter(onClickPrimaryCta, "onClickPrimaryCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(379668974);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(goldDepositBoostCelebration) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickPrimaryCta) ? 32 : 16;
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
                    ComposerKt.traceEventStart(379668974, i3, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposable (GoldDepositBoostCelebrationComposable.kt:79)");
                }
                final LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(goldDepositBoostCelebration.getAssetPath()).build().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(GoldDepositBoostCelebrationComposable$lambda$8$lambda$0(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, 1, null, false, false, composerStartRestartGroup, 1572864, 958);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    j = 4294967295L;
                    c = ' ';
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    j = 4294967295L;
                    c = ' ';
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << c) | (Float.floatToRawIntBits(0.0f) & j))), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(-119996619, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1

                    /* compiled from: GoldDepositBoostCelebrationComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState<Offset> $descriptionPositionInWindow$delegate;
                        final /* synthetic */ LottieCompositionResult $lottieComposition$delegate;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ LottieAnimationState $progress$delegate;
                        final /* synthetic */ UiPostTransferPage.GoldDepositBoostCelebration $this_with;
                        final /* synthetic */ SnapshotState<Offset> $titlePositionInWindow$delegate;

                        AnonymousClass2(Modifier modifier, UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration, LottieAnimationState lottieAnimationState, LottieCompositionResult lottieCompositionResult, SnapshotState<Offset> snapshotState, SnapshotState<Offset> snapshotState2) {
                            this.$modifier = modifier;
                            this.$this_with = goldDepositBoostCelebration;
                            this.$progress$delegate = lottieAnimationState;
                            this.$lottieComposition$delegate = lottieCompositionResult;
                            this.$titlePositionInWindow$delegate = snapshotState;
                            this.$descriptionPositionInWindow$delegate = snapshotState2;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
                            Unit unit;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1654916067, i, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposable.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostCelebrationComposable.kt:108)");
                            }
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                            Modifier modifier = this.$modifier;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
                            UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration = this.$this_with;
                            final LottieAnimationState lottieAnimationState = this.$progress$delegate;
                            LottieCompositionResult lottieCompositionResult = this.$lottieComposition$delegate;
                            final SnapshotState<Offset> snapshotState = this.$titlePositionInWindow$delegate;
                            final SnapshotState<Offset> snapshotState2 = this.$descriptionPositionInWindow$delegate;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM()), composer, 0);
                            Modifier modifierWeight$default = Column5.weight$default(column6, companion3, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierWeight$default);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor2);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(goldDepositBoostCelebration.getBackgroundImagePath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.fillMaxWidth$default(TestTag3.testTag(companion3, GoldDepositBoostCelebrationComposable.GOLD_DEPOSIT_BOOST_BG_IMAGE_TEST_TAG), 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer, 25008, 104);
                            Composer composer2 = composer;
                            Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer2, 6, 1);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer2, 48);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM()), composer2, 0);
                            String strNullIfEmpty = StringsKt.nullIfEmpty(goldDepositBoostCelebration.getUpdatedBoostAmount());
                            composer2.startReplaceGroup(1430625927);
                            if (strNullIfEmpty == null) {
                                unit = null;
                            } else {
                                GoldDepositBoostCelebrationComposable2.AnimatedDepositBoostText(goldDepositBoostCelebration.getInitialBoostAmount(), strNullIfEmpty, goldDepositBoostCelebration.getPrefixSymbol(), null, composer2, 0, 8);
                                unit = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1430625248);
                            if (unit == null) {
                                GoldDepositBoostCelebrationComposable2.StaticDepositBoostText(goldDepositBoostCelebration.getInitialBoostAmount(), goldDepositBoostCelebration.getPrefixSymbol(), null, composer, 0, 4);
                                composer2 = composer;
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            LottieComposition lottieCompositionGoldDepositBoostCelebrationComposable$lambda$8$lambda$0 = GoldDepositBoostCelebrationComposable2.GoldDepositBoostCelebrationComposable$lambda$8$lambda$0(lottieCompositionResult);
                            Alignment center = companion.getCenter();
                            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(TestTag3.testTag(companion3, GoldDepositBoostCelebrationComposable.GOLD_DEPOSIT_BOOST_LOTTIE_TEST_TAG), C2002Dp.m7995constructorimpl(680));
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged = composer2.changed(lottieAnimationState);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02cc: CONSTRUCTOR (r6v17 'objRememberedValue' java.lang.Object) = (r14v0 'lottieAnimationState' com.airbnb.lottie.compose.LottieAnimationState A[DONT_INLINE]) A[MD:(com.airbnb.lottie.compose.LottieAnimationState):void (m)] (LINE:147) call: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$2$$ExternalSyntheticLambda0.<init>(com.airbnb.lottie.compose.LottieAnimationState):void type: CONSTRUCTOR in method: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1.2.invoke(androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, int):void, file: classes10.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 25 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 1320
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposable5.AnonymousClass2.invoke(androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, int):void");
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                                invoke(boxScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$11$lambda$10$lambda$7$lambda$6(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
                                Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
                                GoldDepositBoostCelebrationComposable2.GoldDepositBoostCelebrationComposable$lambda$8$lambda$4(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
                                Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
                                GoldDepositBoostCelebrationComposable2.GoldDepositBoostCelebrationComposable$lambda$8$lambda$7(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: GoldDepositBoostCelebrationComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                            final /* synthetic */ SduiActionHandler<GenericAction> $actionHandler;
                            final /* synthetic */ Function0<Unit> $onClickPrimaryCta;
                            final /* synthetic */ UiPostTransferPage.GoldDepositBoostCelebration $this_with;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration, SduiActionHandler<? super GenericAction> sduiActionHandler, Function0<Unit> function0) {
                                this.$this_with = goldDepositBoostCelebration;
                                this.$actionHandler = sduiActionHandler;
                                this.$onClickPrimaryCta = function0;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                invoke(bentoButtonBar3, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1105113898, i, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposable.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostCelebrationComposable.kt:100)");
                                }
                                String primaryCtaText = this.$this_with.getPrimaryCtaText();
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer.changedInstance(this.$this_with) | composer.changedInstance(this.$actionHandler) | composer.changed(this.$onClickPrimaryCta);
                                final UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration = this.$this_with;
                                final Function0<Unit> function0 = this.$onClickPrimaryCta;
                                final SduiActionHandler<GenericAction> sduiActionHandler = this.$actionHandler;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005b: CONSTRUCTOR (r3v1 'objRememberedValue' java.lang.Object) = 
                                          (r10v5 'goldDepositBoostCelebration' com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration A[DONT_INLINE])
                                          (r1v0 'function0' kotlin.jvm.functions.Function0<kotlin.Unit> A[DONT_INLINE])
                                          (r2v0 'sduiActionHandler' com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.GenericAction> A[DONT_INLINE])
                                         A[MD:(com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration, kotlin.jvm.functions.Function0, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler):void (m)] (LINE:103) call: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration, kotlin.jvm.functions.Function0, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler):void type: CONSTRUCTOR in method: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1.1.invoke(com.robinhood.compose.bento.component.BentoButtonBarScope, androidx.compose.runtime.Composer, int):void, file: classes10.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 25 more
                                        */
                                    /*
                                        this = this;
                                        java.lang.String r0 = "$this$BentoButtonBarScreenLayout"
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                                        r8 = r10 & 17
                                        r0 = 16
                                        if (r8 != r0) goto L16
                                        boolean r8 = r9.getSkipping()
                                        if (r8 != 0) goto L12
                                        goto L16
                                    L12:
                                        r9.skipToGroupEnd()
                                        return
                                    L16:
                                        boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r8 == 0) goto L25
                                        r8 = -1
                                        java.lang.String r0 = "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposable.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostCelebrationComposable.kt:100)"
                                        r1 = 1105113898(0x41deb32a, float:27.837482)
                                        androidx.compose.runtime.ComposerKt.traceEventStart(r1, r10, r8, r0)
                                    L25:
                                        com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration r8 = r7.$this_with
                                        java.lang.String r0 = r8.getPrimaryCtaText()
                                        r8 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
                                        r9.startReplaceGroup(r8)
                                        com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration r8 = r7.$this_with
                                        boolean r8 = r9.changedInstance(r8)
                                        com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.GenericAction> r10 = r7.$actionHandler
                                        boolean r10 = r9.changedInstance(r10)
                                        r8 = r8 | r10
                                        kotlin.jvm.functions.Function0<kotlin.Unit> r10 = r7.$onClickPrimaryCta
                                        boolean r10 = r9.changed(r10)
                                        r8 = r8 | r10
                                        com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration r10 = r7.$this_with
                                        kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r7.$onClickPrimaryCta
                                        com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.GenericAction> r2 = r7.$actionHandler
                                        java.lang.Object r3 = r9.rememberedValue()
                                        if (r8 != 0) goto L59
                                        androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.INSTANCE
                                        java.lang.Object r8 = r8.getEmpty()
                                        if (r3 != r8) goto L61
                                    L59:
                                        com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$1$$ExternalSyntheticLambda0 r3 = new com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$1$$ExternalSyntheticLambda0
                                        r3.<init>(r10, r1, r2)
                                        r9.updateRememberedValue(r3)
                                    L61:
                                        r1 = r3
                                        kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                                        r9.endReplaceGroup()
                                        r5 = 0
                                        r6 = 12
                                        r2 = 0
                                        r3 = 0
                                        r4 = r9
                                        com.robinhood.android.gold.transfers.GoldDepositBoostBottomBarComposable.GoldDepositBoostBottomBarComposable(r0, r1, r2, r3, r4, r5, r6)
                                        boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r8 == 0) goto L79
                                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                                    L79:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposable5.AnonymousClass1.invoke(com.robinhood.compose.bento.component.BentoButtonBarScope, androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$2$lambda$1(UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration, Function0 function0, SduiActionHandler sduiActionHandler) {
                                    GenericAction primaryCtaAction = goldDepositBoostCelebration.getPrimaryCtaAction();
                                    if (primaryCtaAction != null) {
                                        sduiActionHandler.mo15941handle(primaryCtaAction);
                                    } else {
                                        function0.invoke();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(Composer composer3, int i5) {
                                if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-119996619, i5, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposable.<anonymous>.<anonymous> (GoldDepositBoostCelebrationComposable.kt:97)");
                                }
                                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1105113898, true, new AnonymousClass1(goldDepositBoostCelebration, SduiActionHandler3.currentActionHandler(composer3, 0), onClickPrimaryCta), composer3, 54), ComposableLambda3.rememberComposableLambda(-1654916067, true, new AnonymousClass2(modifier3, goldDepositBoostCelebration, lottieAnimationStateAnimateLottieCompositionAsState, lottieCompositionResultRememberLottieComposition, snapshotState, snapshotState2), composer3, 54), composer3, 3456, 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 15);
                        composer2 = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GoldDepositBoostCelebrationComposable2.GoldDepositBoostCelebrationComposable$lambda$9(goldDepositBoostCelebration, onClickPrimaryCta, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                    final LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(goldDepositBoostCelebration.getAssetPath()).build().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                    final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState2 = animateLottieCompositionAsState.animateLottieCompositionAsState(GoldDepositBoostCelebrationComposable$lambda$8$lambda$0(lottieCompositionResultRememberLottieComposition2), false, false, false, null, 0.0f, 1, null, false, false, composerStartRestartGroup, 1572864, 958);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue != companion.getEmpty()) {
                    }
                    final SnapshotState<Offset> snapshotState3 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    final SnapshotState<Offset> snapshotState22 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                    GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(-119996619, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1

                        /* compiled from: GoldDepositBoostCelebrationComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotState<Offset> $descriptionPositionInWindow$delegate;
                            final /* synthetic */ LottieCompositionResult $lottieComposition$delegate;
                            final /* synthetic */ Modifier $modifier;
                            final /* synthetic */ LottieAnimationState $progress$delegate;
                            final /* synthetic */ UiPostTransferPage.GoldDepositBoostCelebration $this_with;
                            final /* synthetic */ SnapshotState<Offset> $titlePositionInWindow$delegate;

                            AnonymousClass2(Modifier modifier, UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration, LottieAnimationState lottieAnimationState, LottieCompositionResult lottieCompositionResult, SnapshotState<Offset> snapshotState, SnapshotState<Offset> snapshotState2) {
                                this.$modifier = modifier;
                                this.$this_with = goldDepositBoostCelebration;
                                this.$progress$delegate = lottieAnimationState;
                                this.$lottieComposition$delegate = lottieCompositionResult;
                                this.$titlePositionInWindow$delegate = snapshotState;
                                this.$descriptionPositionInWindow$delegate = snapshotState2;
                            }

                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02cc: CONSTRUCTOR (r6v17 'objRememberedValue' java.lang.Object) = (r14v0 'lottieAnimationState' com.airbnb.lottie.compose.LottieAnimationState A[DONT_INLINE]) A[MD:(com.airbnb.lottie.compose.LottieAnimationState):void (m)] (LINE:147) call: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$2$$ExternalSyntheticLambda0.<init>(com.airbnb.lottie.compose.LottieAnimationState):void type: CONSTRUCTOR in method: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1.2.invoke(androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, int):void, file: classes10.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 20 more
                                */
                            public final void invoke(androidx.compose.foundation.layout.BoxScope r74, androidx.compose.runtime.Composer r75, int r76) {
                                /*
                                    Method dump skipped, instructions count: 1320
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposable5.AnonymousClass2.invoke(androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, int):void");
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                                invoke(boxScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$11$lambda$10$lambda$7$lambda$6(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
                                Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
                                GoldDepositBoostCelebrationComposable2.GoldDepositBoostCelebrationComposable$lambda$8$lambda$4(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
                                Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
                                GoldDepositBoostCelebrationComposable2.GoldDepositBoostCelebrationComposable$lambda$8$lambda$7(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: GoldDepositBoostCelebrationComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                            final /* synthetic */ SduiActionHandler<GenericAction> $actionHandler;
                            final /* synthetic */ Function0<Unit> $onClickPrimaryCta;
                            final /* synthetic */ UiPostTransferPage.GoldDepositBoostCelebration $this_with;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration, SduiActionHandler<? super GenericAction> sduiActionHandler, Function0<Unit> function0) {
                                this.$this_with = goldDepositBoostCelebration;
                                this.$actionHandler = sduiActionHandler;
                                this.$onClickPrimaryCta = function0;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                invoke(bentoButtonBar3, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005b: CONSTRUCTOR (r3v1 'objRememberedValue' java.lang.Object) = 
                                  (r10v5 'goldDepositBoostCelebration' com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration A[DONT_INLINE])
                                  (r1v0 'function0' kotlin.jvm.functions.Function0<kotlin.Unit> A[DONT_INLINE])
                                  (r2v0 'sduiActionHandler' com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.GenericAction> A[DONT_INLINE])
                                 A[MD:(com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration, kotlin.jvm.functions.Function0, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler):void (m)] (LINE:103) call: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration, kotlin.jvm.functions.Function0, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler):void type: CONSTRUCTOR in method: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1.1.invoke(com.robinhood.compose.bento.component.BentoButtonBarScope, androidx.compose.runtime.Composer, int):void, file: classes10.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 20 more
                                */
                            public final void invoke(com.robinhood.compose.bento.component.BentoButtonBar3 r8, androidx.compose.runtime.Composer r9, int r10) {
                                /*
                                    r7 = this;
                                    java.lang.String r0 = "$this$BentoButtonBarScreenLayout"
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                                    r8 = r10 & 17
                                    r0 = 16
                                    if (r8 != r0) goto L16
                                    boolean r8 = r9.getSkipping()
                                    if (r8 != 0) goto L12
                                    goto L16
                                L12:
                                    r9.skipToGroupEnd()
                                    return
                                L16:
                                    boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r8 == 0) goto L25
                                    r8 = -1
                                    java.lang.String r0 = "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposable.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostCelebrationComposable.kt:100)"
                                    r1 = 1105113898(0x41deb32a, float:27.837482)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r1, r10, r8, r0)
                                L25:
                                    com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration r8 = r7.$this_with
                                    java.lang.String r0 = r8.getPrimaryCtaText()
                                    r8 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
                                    r9.startReplaceGroup(r8)
                                    com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration r8 = r7.$this_with
                                    boolean r8 = r9.changedInstance(r8)
                                    com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.GenericAction> r10 = r7.$actionHandler
                                    boolean r10 = r9.changedInstance(r10)
                                    r8 = r8 | r10
                                    kotlin.jvm.functions.Function0<kotlin.Unit> r10 = r7.$onClickPrimaryCta
                                    boolean r10 = r9.changed(r10)
                                    r8 = r8 | r10
                                    com.robinhood.models.ui.bonfire.UiPostTransferPage$GoldDepositBoostCelebration r10 = r7.$this_with
                                    kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r7.$onClickPrimaryCta
                                    com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.GenericAction> r2 = r7.$actionHandler
                                    java.lang.Object r3 = r9.rememberedValue()
                                    if (r8 != 0) goto L59
                                    androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.INSTANCE
                                    java.lang.Object r8 = r8.getEmpty()
                                    if (r3 != r8) goto L61
                                L59:
                                    com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$1$$ExternalSyntheticLambda0 r3 = new com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$GoldDepositBoostCelebrationComposable$1$1$1$$ExternalSyntheticLambda0
                                    r3.<init>(r10, r1, r2)
                                    r9.updateRememberedValue(r3)
                                L61:
                                    r1 = r3
                                    kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                                    r9.endReplaceGroup()
                                    r5 = 0
                                    r6 = 12
                                    r2 = 0
                                    r3 = 0
                                    r4 = r9
                                    com.robinhood.android.gold.transfers.GoldDepositBoostBottomBarComposable.GoldDepositBoostBottomBarComposable(r0, r1, r2, r3, r4, r5, r6)
                                    boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r8 == 0) goto L79
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                L79:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposable5.AnonymousClass1.invoke(com.robinhood.compose.bento.component.BentoButtonBarScope, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration, Function0 function0, SduiActionHandler sduiActionHandler) {
                                GenericAction primaryCtaAction = goldDepositBoostCelebration.getPrimaryCtaAction();
                                if (primaryCtaAction != null) {
                                    sduiActionHandler.mo15941handle(primaryCtaAction);
                                } else {
                                    function0.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-119996619, i5, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposable.<anonymous>.<anonymous> (GoldDepositBoostCelebrationComposable.kt:97)");
                            }
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1105113898, true, new AnonymousClass1(goldDepositBoostCelebration, SduiActionHandler3.currentActionHandler(composer3, 0), onClickPrimaryCta), composer3, 54), ComposableLambda3.rememberComposableLambda(-1654916067, true, new AnonymousClass2(modifier3, goldDepositBoostCelebration, lottieAnimationStateAnimateLottieCompositionAsState2, lottieCompositionResultRememberLottieComposition2, snapshotState3, snapshotState22), composer3, 54), composer3, 3456, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 15);
                    composer2 = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }

            private static final long AnimatedDepositBoostText$lambda$34(SnapshotState<Offset> snapshotState) {
                return snapshotState.getValue().getPackedValue();
            }

            private static final TextStyle AnimatedDepositBoostText$lambda$37(SnapshotState<TextStyle> snapshotState) {
                return snapshotState.getValue();
            }

            private static final boolean AnimatedDepositBoostText$lambda$44(SnapshotState4<Boolean> snapshotState4) {
                return snapshotState4.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean AnimatedDepositBoostText$lambda$46(SnapshotState<Boolean> snapshotState) {
                return snapshotState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final LottieComposition GoldDepositBoostCelebrationComposable$lambda$8$lambda$0(LottieCompositionResult lottieCompositionResult) {
                return lottieCompositionResult.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float GoldDepositBoostCelebrationComposable$lambda$8$lambda$1(LottieAnimationState lottieAnimationState) {
                return lottieAnimationState.getValue().floatValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final long GoldDepositBoostCelebrationComposable$lambda$8$lambda$3(SnapshotState<Offset> snapshotState) {
                return snapshotState.getValue().getPackedValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final long GoldDepositBoostCelebrationComposable$lambda$8$lambda$6(SnapshotState<Offset> snapshotState) {
                return snapshotState.getValue().getPackedValue();
            }

            private static final long StaticDepositBoostText$lambda$14(SnapshotState<Offset> snapshotState) {
                return snapshotState.getValue().getPackedValue();
            }

            private static final TextStyle StaticDepositBoostText$lambda$17(SnapshotState<TextStyle> snapshotState) {
                return snapshotState.getValue();
            }

            private static final boolean StaticDepositBoostText$lambda$20(SnapshotState<Boolean> snapshotState) {
                return snapshotState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void GoldDepositBoostCelebrationComposable$lambda$8$lambda$4(SnapshotState<Offset> snapshotState, long j) {
                snapshotState.setValue(Offset.m6534boximpl(j));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void GoldDepositBoostCelebrationComposable$lambda$8$lambda$7(SnapshotState<Offset> snapshotState, long j) {
                snapshotState.setValue(Offset.m6534boximpl(j));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int framesToMillis(float f) {
                return MathKt.roundToInt((f / 60.0f) * 1000);
            }

            /* JADX WARN: Removed duplicated region for block: B:105:0x0162  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x016e  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x01d1  */
            /* JADX WARN: Removed duplicated region for block: B:116:0x01dc  */
            /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0135  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0140  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0142  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static final void AnimatedDepositBoostCharacter(char c, final TextStyle textStyle, final int i, final float f, final float f2, Easing easing, Composer composer, final int i2, final int i3) {
                char c2;
                int i4;
                TextStyle textStyle2;
                int i5;
                float f3;
                Easing easeInOut;
                Object objRememberedValue;
                Composer.Companion companion;
                Animatable animatable;
                boolean zChangedInstance;
                Object objRememberedValue2;
                Animatable animatable2;
                Object obj;
                Easing easing2;
                Composer composer2;
                final Easing easing3;
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
                Composer composerStartRestartGroup = composer.startRestartGroup(-2016400791);
                if ((i3 & 1) != 0) {
                    i4 = i2 | 6;
                    c2 = c;
                } else if ((i2 & 6) == 0) {
                    c2 = c;
                    i4 = (composerStartRestartGroup.changed(c2) ? 4 : 2) | i2;
                } else {
                    c2 = c;
                    i4 = i2;
                }
                if ((i3 & 2) == 0) {
                    if ((i2 & 48) == 0) {
                        textStyle2 = textStyle;
                        i4 |= composerStartRestartGroup.changed(textStyle2) ? 32 : 16;
                    }
                    if ((i3 & 4) == 0) {
                        i4 |= 384;
                        i5 = i;
                    } else {
                        i5 = i;
                        if ((i2 & 384) == 0) {
                            i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
                        }
                    }
                    if ((i3 & 8) == 0) {
                        i4 |= 3072;
                    } else if ((i2 & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                        f3 = f2;
                    } else {
                        f3 = f2;
                        if ((i2 & 24576) == 0) {
                            i4 |= composerStartRestartGroup.changed(f3) ? 16384 : 8192;
                        }
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32) == 0) {
                            easeInOut = easing;
                            int i6 = composerStartRestartGroup.changed(easeInOut) ? 131072 : 65536;
                            i4 |= i6;
                        } else {
                            easeInOut = easing;
                        }
                        i4 |= i6;
                    } else {
                        easeInOut = easing;
                    }
                    if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                        } else if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            easeInOut = EasingFunctions.getEaseInOut();
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2016400791, i4, -1, "com.robinhood.android.gold.transfers.AnimatedDepositBoostCharacter (GoldDepositBoostCelebrationComposable.kt:206)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = Animatable2.Animatable$default(f, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        animatable = (Animatable) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = ((i4 & 57344) != 16384) | composerStartRestartGroup.changedInstance(animatable) | ((i4 & 896) != 256) | ((((458752 & i4) ^ 196608) <= 131072 && composerStartRestartGroup.changed(easeInOut)) || (i4 & 196608) == 131072);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            Easing easing4 = easeInOut;
                            animatable2 = animatable;
                            obj = null;
                            GoldDepositBoostCelebrationComposable3 goldDepositBoostCelebrationComposable3 = new GoldDepositBoostCelebrationComposable3(animatable2, f3, i5, easing4, null);
                            easing2 = easing4;
                            composerStartRestartGroup.updateRememberedValue(goldDepositBoostCelebrationComposable3);
                            objRememberedValue2 = goldDepositBoostCelebrationComposable3;
                        } else {
                            easing2 = easeInOut;
                            animatable2 = animatable;
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                        composer2 = composerStartRestartGroup;
                        TextKt.m5665Text4IGK_g(String.valueOf(c2), OffsetKt.m5125offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(((Number) animatable2.getValue()).floatValue()), 1, obj), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle2, composer2, 0, (i4 << 15) & 3670016, 65532);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        easing3 = easing2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        easing3 = easeInOut;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final char c3 = c2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return GoldDepositBoostCelebrationComposable2.AnimatedDepositBoostCharacter$lambda$12(c3, textStyle, i, f, f2, easing3, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 48;
                textStyle2 = textStyle;
                if ((i3 & 4) == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                if ((i3 & 16) == 0) {
                }
                if ((i2 & 196608) != 0) {
                }
                if ((74899 & i4) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) == 0) {
                        if ((i3 & 32) != 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        animatable = (Animatable) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        if (((458752 & i4) ^ 196608) <= 131072) {
                            zChangedInstance = ((i4 & 57344) != 16384) | composerStartRestartGroup.changedInstance(animatable) | ((i4 & 896) != 256) | ((((458752 & i4) ^ 196608) <= 131072 && composerStartRestartGroup.changed(easeInOut)) || (i4 & 196608) == 131072);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                Easing easing42 = easeInOut;
                                animatable2 = animatable;
                                obj = null;
                                GoldDepositBoostCelebrationComposable3 goldDepositBoostCelebrationComposable32 = new GoldDepositBoostCelebrationComposable3(animatable2, f3, i5, easing42, null);
                                easing2 = easing42;
                                composerStartRestartGroup.updateRememberedValue(goldDepositBoostCelebrationComposable32);
                                objRememberedValue2 = goldDepositBoostCelebrationComposable32;
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                                composer2 = composerStartRestartGroup;
                                TextKt.m5665Text4IGK_g(String.valueOf(c2), OffsetKt.m5125offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(((Number) animatable2.getValue()).floatValue()), 1, obj), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle2, composer2, 0, (i4 << 15) & 3670016, 65532);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                easing3 = easing2;
                            }
                        } else {
                            zChangedInstance = ((i4 & 57344) != 16384) | composerStartRestartGroup.changedInstance(animatable) | ((i4 & 896) != 256) | ((((458752 & i4) ^ 196608) <= 131072 && composerStartRestartGroup.changed(easeInOut)) || (i4 & 196608) == 131072);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:101:0x0390  */
            /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x016c  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x01c3  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x01f0  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x020f  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x021b  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x031f  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x032a  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0345  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0385  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final void StaticDepositBoostText(final String str, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
                int i3;
                Modifier modifier2;
                Object objRememberedValue;
                Composer.Companion companion;
                int i4;
                Object objRememberedValue2;
                Object objRememberedValue3;
                Object objRememberedValue4;
                boolean z;
                Object objRememberedValue5;
                int currentCompositeKeyHash;
                Composer composerM6388constructorimpl;
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
                int i5;
                SnapshotState snapshotState;
                Modifier modifier3;
                SnapshotState snapshotState2;
                SnapshotState snapshotState3;
                Object objRememberedValue6;
                final SnapshotState snapshotState4;
                Object objRememberedValue7;
                final Modifier modifier4;
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
                Composer composerStartRestartGroup = composer.startRestartGroup(-1556847223);
                if ((i2 & 1) != 0) {
                    i3 = i | 6;
                } else if ((i & 6) == 0) {
                    i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i2 & 2) != 0) {
                    i3 |= 48;
                } else if ((i & 48) == 0) {
                    i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
                }
                int i6 = i2 & 4;
                if (i6 == 0) {
                    if ((i & 384) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                    }
                    if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1556847223, i3, -1, "com.robinhood.android.gold.transfers.StaticDepositBoostText (GoldDepositBoostCelebrationComposable.kt:229)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue != companion.getEmpty()) {
                            i4 = 32;
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            i4 = 32;
                        }
                        final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        TextStyle textStyleDefaultAmountTextStyle = GoldDepositBoostCelebrationComposable.INSTANCE.defaultAmountTextStyle(composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(textStyleDefaultAmountTextStyle, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotState snapshotState6 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        long jM7662getFontSizeXSAIIZE = StaticDepositBoostText$lambda$17(snapshotState6).m7662getFontSizeXSAIIZE();
                        TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE);
                        long jPack = TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE) * 0.33333334f);
                        long jM7662getFontSizeXSAIIZE2 = StaticDepositBoostText$lambda$17(snapshotState6).m7662getFontSizeXSAIIZE();
                        TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE2);
                        long jPack2 = TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE2), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE2) * 0.61f);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        SnapshotState snapshotState7 = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GoldDepositBoostCelebrationComposable2.StaticDepositBoostText$lambda$23$lambda$22(snapshotState5, (LayoutCoordinates) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifier5, (Function1) objRememberedValue4);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean z2 = (i3 & 112) != i4;
                        int i7 = i3 & 14;
                        z = z2 | (i7 != 4);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GoldDepositBoostCelebrationComposable2.StaticDepositBoostText$lambda$25$lambda$24(str2, str, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierSemantics = SemanticsModifier6.semantics(modifierOnGloballyPositioned, true, (Function1) objRememberedValue5);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics);
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
                        composerStartRestartGroup.startReplaceGroup(-1490648746);
                        if (str2 != null) {
                            snapshotState = snapshotState7;
                            i5 = i7;
                            modifier3 = modifier5;
                            snapshotState2 = snapshotState5;
                            snapshotState3 = snapshotState6;
                        } else {
                            i5 = i7;
                            snapshotState = snapshotState7;
                            modifier3 = modifier5;
                            snapshotState2 = snapshotState5;
                            snapshotState3 = snapshotState6;
                            TextKt.m5665Text4IGK_g(str2, null, 0L, jPack, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7654copyNs73l9s$default(StaticDepositBoostText$lambda$17(snapshotState6), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, StaticDepositBoostText$lambda$14(snapshotState5), null, composerStartRestartGroup, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, jPack2, null, null, null, 0, 0, null, 33292286, null), composerStartRestartGroup, 0, 0, 65526);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        TextStyle textStyleM7654copyNs73l9s$default = TextStyle.m7654copyNs73l9s$default(StaticDepositBoostText$lambda$17(snapshotState3), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, StaticDepositBoostText$lambda$14(snapshotState2), null, composerStartRestartGroup, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 != companion.getEmpty()) {
                            snapshotState4 = snapshotState;
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GoldDepositBoostCelebrationComposable2.StaticDepositBoostText$lambda$31$lambda$28$lambda$27(snapshotState4, (ContentDrawScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            snapshotState4 = snapshotState;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(companion3, (Function1) objRememberedValue6);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            final SnapshotState snapshotState8 = snapshotState3;
                            objRememberedValue7 = new Function1() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GoldDepositBoostCelebrationComposable2.StaticDepositBoostText$lambda$31$lambda$30$lambda$29(snapshotState8, snapshotState4, (TextLayoutResult) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer2 = composerStartRestartGroup;
                        TextKt.m5665Text4IGK_g(str, modifierDrawWithContent, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objRememberedValue7, textStyleM7654copyNs73l9s$default, composer2, i5, 196992, 28668);
                        composerStartRestartGroup = composer2;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GoldDepositBoostCelebrationComposable2.StaticDepositBoostText$lambda$32(str, str2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 384;
                modifier2 = modifier;
                if ((i3 & 147) == 146) {
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue != companion.getEmpty()) {
                    }
                    final SnapshotState snapshotState52 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    TextStyle textStyleDefaultAmountTextStyle2 = GoldDepositBoostCelebrationComposable.INSTANCE.defaultAmountTextStyle(composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState62 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    long jM7662getFontSizeXSAIIZE3 = StaticDepositBoostText$lambda$17(snapshotState62).m7662getFontSizeXSAIIZE();
                    TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE3);
                    long jPack3 = TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE3), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE3) * 0.33333334f);
                    long jM7662getFontSizeXSAIIZE22 = StaticDepositBoostText$lambda$17(snapshotState62).m7662getFontSizeXSAIIZE();
                    TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE22);
                    long jPack22 = TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE22), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE22) * 0.61f);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState72 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifier5, (Function1) objRememberedValue4);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i3 & 112) != i4) {
                    }
                    int i72 = i3 & 14;
                    z = z2 | (i72 != 4);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return GoldDepositBoostCelebrationComposable2.StaticDepositBoostText$lambda$25$lambda$24(str2, str, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierSemantics2 = SemanticsModifier6.semantics(modifierOnGloballyPositioned2, true, (Function1) objRememberedValue5);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics2);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1490648746);
                            if (str2 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            TextStyle textStyleM7654copyNs73l9s$default2 = TextStyle.m7654copyNs73l9s$default(StaticDepositBoostText$lambda$17(snapshotState3), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, StaticDepositBoostText$lambda$14(snapshotState2), null, composerStartRestartGroup, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                            Modifier.Companion companion32 = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 != companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierDrawWithContent2 = DrawModifierKt.drawWithContent(companion32, (Function1) objRememberedValue6);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Composer composer22 = composerStartRestartGroup;
                            TextKt.m5665Text4IGK_g(str, modifierDrawWithContent2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objRememberedValue7, textStyleM7654copyNs73l9s$default2, composer22, i5, 196992, 28668);
                            composerStartRestartGroup = composer22;
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }

            private static final void StaticDepositBoostText$lambda$15(SnapshotState<Offset> snapshotState, long j) {
                snapshotState.setValue(Offset.m6534boximpl(j));
            }

            private static final void StaticDepositBoostText$lambda$21(SnapshotState<Boolean> snapshotState, boolean z) {
                snapshotState.setValue(Boolean.valueOf(z));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit StaticDepositBoostText$lambda$23$lambda$22(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
                Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
                StaticDepositBoostText$lambda$15(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit StaticDepositBoostText$lambda$25$lambda$24(String str, String str2, SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (str == null) {
                    str = "";
                }
                SemanticsPropertiesKt.setContentDescription(semantics, str + str2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit StaticDepositBoostText$lambda$31$lambda$30$lambda$29(SnapshotState snapshotState, SnapshotState snapshotState2, TextLayoutResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getDidOverflowWidth() || result.getDidOverflowHeight()) {
                    TextStyle textStyleStaticDepositBoostText$lambda$17 = StaticDepositBoostText$lambda$17(snapshotState);
                    long jM7662getFontSizeXSAIIZE = StaticDepositBoostText$lambda$17(snapshotState).m7662getFontSizeXSAIIZE();
                    TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE);
                    snapshotState.setValue(TextStyle.m7655copyp1EtxEg$default(textStyleStaticDepositBoostText$lambda$17, 0L, TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE) * 0.9f), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
                } else {
                    StaticDepositBoostText$lambda$21(snapshotState2, true);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit StaticDepositBoostText$lambda$31$lambda$28$lambda$27(SnapshotState snapshotState, ContentDrawScope drawWithContent) {
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                if (StaticDepositBoostText$lambda$20(snapshotState)) {
                    drawWithContent.drawContent();
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:136:0x04d1  */
            /* JADX WARN: Removed duplicated region for block: B:139:0x04f1  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0526  */
            /* JADX WARN: Removed duplicated region for block: B:143:0x0528  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x052f  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x0531  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x053f  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x0579  */
            /* JADX WARN: Removed duplicated region for block: B:158:0x0585  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x0589  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x05b6  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x05d5  */
            /* JADX WARN: Removed duplicated region for block: B:168:0x05db  */
            /* JADX WARN: Removed duplicated region for block: B:176:0x0685 A[LOOP:1: B:174:0x067f->B:176:0x0685, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:179:0x072c  */
            /* JADX WARN: Removed duplicated region for block: B:201:0x08a4  */
            /* JADX WARN: Removed duplicated region for block: B:205:0x08af  */
            /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x01c8  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0213  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x0258  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0264  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0268  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0297  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x02be  */
            /* JADX WARN: Type inference failed for: r15v11 */
            /* JADX WARN: Type inference failed for: r15v2 */
            /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final void AnimatedDepositBoostText(final String str, final String str2, final String str3, Modifier modifier, Composer composer, final int i, final int i2) {
                int i3;
                Modifier modifier2;
                int i4;
                Object objRememberedValue;
                Composer.Companion companion;
                float f;
                Object objRememberedValue2;
                Object objRememberedValue3;
                float f2;
                final Animatable animatable;
                Object objRememberedValue4;
                Animatable animatable2;
                Object objRememberedValue5;
                SnapshotState4 snapshotState4;
                int iFramesToMillis;
                Object objRememberedValue6;
                SnapshotState snapshotState;
                boolean zChangedInstance;
                Object objRememberedValue7;
                Animatable animatable3;
                SnapshotState snapshotState2;
                int i5;
                Animatable animatable4;
                int currentCompositeKeyHash;
                Composer composerM6388constructorimpl;
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
                SnapshotState snapshotState3;
                Modifier modifier3;
                SnapshotState snapshotState5;
                int i6;
                ?? r15;
                Object objRememberedValue8;
                Composer.Companion companion2;
                boolean z;
                Object objRememberedValue9;
                int currentCompositeKeyHash2;
                Composer composerM6388constructorimpl2;
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
                int i7;
                int i8;
                final Modifier modifier4;
                SnapshotState snapshotState6;
                int i9;
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
                Composer composerStartRestartGroup = composer.startRestartGroup(1536635557);
                if ((i2 & 1) != 0) {
                    i3 = i | 6;
                } else if ((i & 6) == 0) {
                    i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i2 & 2) != 0) {
                    i3 |= 48;
                } else if ((i & 48) == 0) {
                    i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
                }
                if ((i2 & 4) != 0) {
                    i3 |= 384;
                } else if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
                }
                int i10 = i2 & 8;
                if (i10 == 0) {
                    if ((i & 3072) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                    }
                    i4 = i3;
                    if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1536635557, i4, -1, "com.robinhood.android.gold.transfers.AnimatedDepositBoostText (GoldDepositBoostCelebrationComposable.kt:302)");
                        }
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue != companion.getEmpty()) {
                            f = 0.0f;
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            f = 0.0f;
                        }
                        final SnapshotState snapshotState7 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        TextStyle textStyleDefaultAmountTextStyle = GoldDepositBoostCelebrationComposable.INSTANCE.defaultAmountTextStyle(composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(textStyleDefaultAmountTextStyle, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotState snapshotState8 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        float fMo5015toPxR2X_6o = density.mo5015toPxR2X_6o(AnimatedDepositBoostText$lambda$37(snapshotState8).m7662getFontSizeXSAIIZE());
                        long jM7662getFontSizeXSAIIZE = AnimatedDepositBoostText$lambda$37(snapshotState8).m7662getFontSizeXSAIIZE();
                        TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE);
                        long jPack = TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE) * 0.33333334f);
                        long jM7662getFontSizeXSAIIZE2 = AnimatedDepositBoostText$lambda$37(snapshotState8).m7662getFontSizeXSAIIZE();
                        TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE2);
                        long jPack2 = TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE2), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE2) * 0.61f);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 != companion.getEmpty()) {
                            f2 = f;
                            objRememberedValue3 = Animatable2.Animatable$default(1.0f, f2, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            f2 = f;
                        }
                        animatable = (Animatable) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = Animatable2.Animatable$default(f2, f2, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        animatable2 = (Animatable) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(GoldDepositBoostCelebrationComposable2.AnimatedDepositBoostText$lambda$43$lambda$42(animatable));
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        snapshotState4 = (SnapshotState4) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        iFramesToMillis = framesToMillis(78.0f);
                        int iFramesToMillis2 = framesToMillis(2.0f);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        snapshotState = (SnapshotState) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        Boolean boolValueOf = Boolean.valueOf(AnimatedDepositBoostText$lambda$46(snapshotState));
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(iFramesToMillis) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(iFramesToMillis);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                            animatable3 = animatable;
                            objRememberedValue7 = new GoldDepositBoostCelebrationComposable4(snapshotState, animatable3, iFramesToMillis, animatable2, iFramesToMillis, null);
                            snapshotState2 = snapshotState;
                            i5 = iFramesToMillis;
                            animatable4 = animatable2;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        } else {
                            animatable3 = animatable;
                            i5 = iFramesToMillis;
                            animatable4 = animatable2;
                            snapshotState2 = snapshotState;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 0);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopCenter(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-2120145016);
                        if (AnimatedDepositBoostText$lambda$44(snapshotState4)) {
                            snapshotState3 = snapshotState2;
                            modifier3 = modifier5;
                            snapshotState5 = snapshotState8;
                            i6 = i4;
                            r15 = 1;
                        } else {
                            Modifier modifierClip = Clip.clip(Alpha.alpha(Modifier.INSTANCE, ((Number) animatable3.getValue()).floatValue()), RectangleShape2.getRectangleShape());
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            int i11 = i4;
                            boolean z2 = ((i11 & 14) == 4) | ((i11 & 896) == 256);
                            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                            if (z2 || objRememberedValue10 == companion.getEmpty()) {
                                objRememberedValue10 = new Function1() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return GoldDepositBoostCelebrationComposable2.AnimatedDepositBoostText$lambda$67$lambda$50$lambda$49(str3, str, (SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierSemantics = SemanticsModifier6.semantics(modifierClip, true, (Function1) objRememberedValue10);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics);
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier2, companion4.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(1937223518);
                            if (str3 == null) {
                                i6 = i11;
                                snapshotState3 = snapshotState2;
                                modifier3 = modifier5;
                                snapshotState5 = snapshotState8;
                                i9 = 0;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(1937224752);
                                int i12 = 0;
                                while (i12 < str3.length()) {
                                    Composer composer2 = composerStartRestartGroup;
                                    AnimatedDepositBoostCharacter(str3.charAt(i12), TextStyle.m7654copyNs73l9s$default(AnimatedDepositBoostText$lambda$37(snapshotState8), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, AnimatedDepositBoostText$lambda$34(snapshotState7), null, composerStartRestartGroup, 6, 2), 0.0f, jPack, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, jPack2, null, null, null, 0, 0, null, 33292282, null), (str.length() * iFramesToMillis2) + i5, 0.0f, -fMo5015toPxR2X_6o, null, composer2, 3072, 32);
                                    composerStartRestartGroup = composer2;
                                    i12++;
                                    snapshotState2 = snapshotState2;
                                    modifier5 = modifier5;
                                    snapshotState8 = snapshotState8;
                                    i11 = i11;
                                }
                                i6 = i11;
                                snapshotState3 = snapshotState2;
                                modifier3 = modifier5;
                                snapshotState5 = snapshotState8;
                                i9 = 0;
                                composerStartRestartGroup.endReplaceGroup();
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                                Unit unit = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1937254032);
                            int i13 = i9;
                            int i14 = i13;
                            while (i13 < str.length()) {
                                Composer composer3 = composerStartRestartGroup;
                                AnimatedDepositBoostCharacter(str.charAt(i13), TextStyle.m7654copyNs73l9s$default(AnimatedDepositBoostText$lambda$37(snapshotState5), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, AnimatedDepositBoostText$lambda$34(snapshotState7), null, composerStartRestartGroup, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null), i5 + (((str.length() - 1) - i14) * iFramesToMillis2), 0.0f, -fMo5015toPxR2X_6o, null, composer3, 3072, 32);
                                composerStartRestartGroup = composer3;
                                i13++;
                                i14++;
                            }
                            r15 = 1;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        companion2 = Composer.INSTANCE;
                        if (objRememberedValue8 == companion2.getEmpty()) {
                            objRememberedValue8 = new Function1() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GoldDepositBoostCelebrationComposable2.AnimatedDepositBoostText$lambda$67$lambda$56$lambda$55(snapshotState7, (LayoutCoordinates) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierClip2 = Clip.clip(Alpha.alpha(OnGloballyPositionedModifier3.onGloballyPositioned(companion5, (Function1) objRememberedValue8), ((Number) animatable4.getValue()).floatValue()), RectangleShape2.getRectangleShape());
                        char c = 59590;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i15 = i6;
                        z = ((i15 & 896) != 256 ? r15 : false) | ((i15 & 112) != 32 ? r15 : false);
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue9 == companion2.getEmpty()) {
                            objRememberedValue9 = new Function1() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GoldDepositBoostCelebrationComposable2.AnimatedDepositBoostText$lambda$67$lambda$58$lambda$57(str3, str2, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierSemantics2 = SemanticsModifier6.semantics(modifierClip2, r15, (Function1) objRememberedValue9);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics2);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor3);
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier3, companion6.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(88639654);
                        if (str3 != null) {
                            i7 = i15;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(88640772);
                            int i16 = 0;
                            while (i16 < str3.length()) {
                                Composer composer4 = composerStartRestartGroup;
                                AnimatedDepositBoostCharacter(str3.charAt(i16), TextStyle.m7654copyNs73l9s$default(AnimatedDepositBoostText$lambda$37(snapshotState5), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, AnimatedDepositBoostText$lambda$34(snapshotState7), null, composerStartRestartGroup, 6, 2), 0.0f, jPack, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, jPack2, null, null, null, 0, 0, null, 33292282, null), i5 + (str2.length() * iFramesToMillis2), fMo5015toPxR2X_6o, 0.0f, EasingFunctions.getEaseOut(), composer4, 24576, 0);
                                composerStartRestartGroup = composer4;
                                i16++;
                                c = c;
                                i15 = i15;
                            }
                            i7 = i15;
                            composerStartRestartGroup.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(88668873);
                        i8 = 0;
                        int i17 = 0;
                        while (i8 < str2.length()) {
                            Composer composer5 = composerStartRestartGroup;
                            float f3 = fMo5015toPxR2X_6o;
                            AnimatedDepositBoostCharacter(str2.charAt(i8), TextStyle.m7654copyNs73l9s$default(AnimatedDepositBoostText$lambda$37(snapshotState5), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, Offset.m6547plusMKHz9U(AnimatedDepositBoostText$lambda$34(snapshotState7), Offset.m6535constructorimpl((Float.floatToRawIntBits((r13 * fMo5015toPxR2X_6o) * 0.5f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), null, composerStartRestartGroup, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null), i5 + (((str2.length() - r15) - i17) * iFramesToMillis2), f3, 0.0f, EasingFunctions.getEaseOut(), composer5, 24576, 0);
                            composerStartRestartGroup = composer5;
                            i8++;
                            i17++;
                            fMo5015toPxR2X_6o = f3;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(-2119989686);
                        if (!AnimatedDepositBoostText$lambda$46(snapshotState3)) {
                            Modifier.Companion companion7 = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Alpha.alpha(companion7, 0.0f), 0.0f, r15, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy3, companion8.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion8.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion8.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion8.getSetModifier());
                            Row6 row63 = Row6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(414584257);
                            if (str3 == null) {
                                snapshotState6 = snapshotState5;
                            } else {
                                Composer composer6 = composerStartRestartGroup;
                                snapshotState6 = snapshotState5;
                                TextKt.m5665Text4IGK_g(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7655copyp1EtxEg$default(AnimatedDepositBoostText$lambda$37(snapshotState5), 0L, jPack, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, jPack2, null, null, null, 0, 0, null, 16646141, null), composer6, 0, 0, 65534);
                                composerStartRestartGroup = composer6;
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion7, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                                Unit unit3 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            TextStyle textStyleAnimatedDepositBoostText$lambda$37 = AnimatedDepositBoostText$lambda$37(snapshotState6);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                final SnapshotState snapshotState9 = snapshotState3;
                                final SnapshotState snapshotState10 = snapshotState6;
                                objRememberedValue11 = new Function1() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return GoldDepositBoostCelebrationComposable2.AnimatedDepositBoostText$lambda$67$lambda$66$lambda$65$lambda$64(snapshotState10, snapshotState9, (TextLayoutResult) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Composer composer7 = composerStartRestartGroup;
                            TextKt.m5665Text4IGK_g(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objRememberedValue11, textStyleAnimatedDepositBoostText$lambda$37, composer7, (i7 >> 3) & 14, 196992, 28670);
                            composerStartRestartGroup = composer7;
                            composerStartRestartGroup.endNode();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GoldDepositBoostCelebrationComposable2.AnimatedDepositBoostText$lambda$68(str, str2, str3, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                modifier2 = modifier;
                i4 = i3;
                if ((i4 & 1171) == 1170) {
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue != companion.getEmpty()) {
                    }
                    final SnapshotState snapshotState72 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    TextStyle textStyleDefaultAmountTextStyle2 = GoldDepositBoostCelebrationComposable.INSTANCE.defaultAmountTextStyle(composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState82 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    float fMo5015toPxR2X_6o2 = density2.mo5015toPxR2X_6o(AnimatedDepositBoostText$lambda$37(snapshotState82).m7662getFontSizeXSAIIZE());
                    long jM7662getFontSizeXSAIIZE3 = AnimatedDepositBoostText$lambda$37(snapshotState82).m7662getFontSizeXSAIIZE();
                    TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE3);
                    long jPack3 = TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE3), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE3) * 0.33333334f);
                    long jM7662getFontSizeXSAIIZE22 = AnimatedDepositBoostText$lambda$37(snapshotState82).m7662getFontSizeXSAIIZE();
                    TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE22);
                    long jPack22 = TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE22), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE22) * 0.61f);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 != companion.getEmpty()) {
                    }
                    animatable = (Animatable) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    animatable2 = (Animatable) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    snapshotState4 = (SnapshotState4) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    iFramesToMillis = framesToMillis(78.0f);
                    int iFramesToMillis22 = framesToMillis(2.0f);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean boolValueOf2 = Boolean.valueOf(AnimatedDepositBoostText$lambda$46(snapshotState));
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(iFramesToMillis) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(iFramesToMillis);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        animatable3 = animatable;
                        objRememberedValue7 = new GoldDepositBoostCelebrationComposable4(snapshotState, animatable3, iFramesToMillis, animatable2, iFramesToMillis, null);
                        snapshotState2 = snapshotState;
                        i5 = iFramesToMillis;
                        animatable4 = animatable2;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 0);
                        Alignment.Companion companion32 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopCenter(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                        ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor5 = companion42.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion42.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-2120145016);
                            if (AnimatedDepositBoostText$lambda$44(snapshotState4)) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion52 = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            companion2 = Composer.INSTANCE;
                            if (objRememberedValue8 == companion2.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierClip22 = Clip.clip(Alpha.alpha(OnGloballyPositionedModifier3.onGloballyPositioned(companion52, (Function1) objRememberedValue8), ((Number) animatable4.getValue()).floatValue()), RectangleShape2.getRectangleShape());
                            char c2 = 59590;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            int i152 = i6;
                            z = ((i152 & 896) != 256 ? r15 : false) | ((i152 & 112) != 32 ? r15 : false);
                            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            if (!z) {
                                objRememberedValue9 = new Function1() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return GoldDepositBoostCelebrationComposable2.AnimatedDepositBoostText$lambda$67$lambda$58$lambda$57(str3, str2, (SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierSemantics22 = SemanticsModifier6.semantics(modifierClip22, r15, (Function1) objRememberedValue9);
                                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics22);
                                ComposeUiNode.Companion companion62 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor32 = companion62.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion62.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap32, companion62.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion62.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier32, companion62.getSetModifier());
                                    Row6 row622 = Row6.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(88639654);
                                    if (str3 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(88668873);
                                    i8 = 0;
                                    int i172 = 0;
                                    while (i8 < str2.length()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.startReplaceGroup(-2119989686);
                                    if (!AnimatedDepositBoostText$lambda$46(snapshotState3)) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier4 = modifier3;
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }

            private static final void AnimatedDepositBoostText$lambda$35(SnapshotState<Offset> snapshotState, long j) {
                snapshotState.setValue(Offset.m6534boximpl(j));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean AnimatedDepositBoostText$lambda$43$lambda$42(Animatable animatable) {
                return ((Number) animatable.getValue()).floatValue() > 0.0f;
            }

            private static final void AnimatedDepositBoostText$lambda$47(SnapshotState<Boolean> snapshotState, boolean z) {
                snapshotState.setValue(Boolean.valueOf(z));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit AnimatedDepositBoostText$lambda$67$lambda$50$lambda$49(String str, String str2, SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (str == null) {
                    str = "";
                }
                SemanticsPropertiesKt.setContentDescription(semantics, str + str2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit AnimatedDepositBoostText$lambda$67$lambda$56$lambda$55(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
                Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
                AnimatedDepositBoostText$lambda$35(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit AnimatedDepositBoostText$lambda$67$lambda$58$lambda$57(String str, String str2, SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (str == null) {
                    str = "";
                }
                SemanticsPropertiesKt.setContentDescription(semantics, str + str2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit AnimatedDepositBoostText$lambda$67$lambda$66$lambda$65$lambda$64(SnapshotState snapshotState, SnapshotState snapshotState2, TextLayoutResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getDidOverflowWidth() || result.getDidOverflowHeight()) {
                    TextStyle textStyleAnimatedDepositBoostText$lambda$37 = AnimatedDepositBoostText$lambda$37(snapshotState);
                    long jM7662getFontSizeXSAIIZE = AnimatedDepositBoostText$lambda$37(snapshotState).m7662getFontSizeXSAIIZE();
                    TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE);
                    snapshotState.setValue(TextStyle.m7655copyp1EtxEg$default(textStyleAnimatedDepositBoostText$lambda$37, 0L, TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE) * 0.9f), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
                } else {
                    AnimatedDepositBoostText$lambda$47(snapshotState2, true);
                }
                return Unit.INSTANCE;
            }
        }
