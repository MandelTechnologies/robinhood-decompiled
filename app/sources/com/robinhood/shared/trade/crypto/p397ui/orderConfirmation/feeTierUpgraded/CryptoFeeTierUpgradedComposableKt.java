package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.Easing3;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
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
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedViewState2;
import com.robinhood.utils.resource.StringResource;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoFeeTierUpgradedComposable.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001aS\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0013\u001a=\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0003¢\u0006\u0002\u0010#\u001a\r\u0010*\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010+\"\u000e\u0010$\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020'X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010-\u001a\u00020\u00168\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b.\u0010/¨\u00060²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\f\u00103\u001a\u0004\u0018\u000104X\u008a\u0084\u0002"}, m3636d2 = {"CryptoFeeTierUpgradedComposable", "", "feeTierInfo", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "canSkipNotificationPrompt", "", "finishPostOrderFlow", "Lkotlin/Function0;", "onContinueToNotificationPrimer", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo;", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo;Landroidx/compose/runtime/Composer;II)V", "CryptoFeeTierUpgraded", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedViewState;", "onTryAgainClick", "initialEnterAnimationPlayed", "(Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "FeeRate", "feeRateTitle", "", "feeRateText", "textColor", "Landroidx/compose/ui/graphics/Color;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "FeeRate-T042LqI", "(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "(Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "DurationEnterMillis", "", "DelayHeaderImageStartAnimationMillis", "", "easing", "Landroidx/compose/animation/core/Easing;", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "SCREEN_IDENTIFIER", CryptoFeeTierUpgradedComposableKt.FEE_RATES_SECTION_TEST_TAG, "getFEE_RATES_SECTION_TEST_TAG$annotations", "()V", "feature-trade-crypto_externalDebug", "enterAnimationPlayed", "startPlaying", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoFeeTierUpgradedComposableKt {
    private static final long DelayHeaderImageStartAnimationMillis = 650;
    private static final int DurationEnterMillis = 300;
    public static final String FEE_RATES_SECTION_TEST_TAG = "FEE_RATES_SECTION_TEST_TAG";
    private static final String SCREEN_IDENTIFIER = "FEE_TIER_UPGRADE_INAPP_NOTIF";
    private static final Easing easing = Easing3.getLinearOutSlowInEasing();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierUpgraded$lambda$16(CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        CryptoFeeTierUpgraded(cryptoFeeTierUpgradedViewState, function0, function02, function03, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierUpgradedComposable$lambda$1(CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool, Function0 function0, Function0 function02, Modifier modifier, CryptoFeeTierUpgradedDuxo cryptoFeeTierUpgradedDuxo, int i, int i2, Composer composer, int i3) {
        CryptoFeeTierUpgradedComposable(cryptoFeeTierInfo, bool, function0, function02, modifier, cryptoFeeTierUpgradedDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeeRate_T042LqI$lambda$18(String str, String str2, long j, Alignment.Horizontal horizontal, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m25892FeeRateT042LqI(str, str2, j, horizontal, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$20(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getFEE_RATES_SECTION_TEST_TAG$annotations() {
    }

    /* compiled from: CryptoFeeTierUpgradedComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3 */
    static final class C404033 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ Animatable<Float, AnimationVectors2> $bodyAndFooterFadeIn;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $bodyTranslationY;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $headerImageFadeIn;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $headerImageTranslationY;
        final /* synthetic */ CryptoFeeTierUpgradedViewState $viewState;

        C404033(Animatable<Float, AnimationVectors2> animatable, Animatable<Float, AnimationVectors2> animatable2, CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState, Animatable<Float, AnimationVectors2> animatable3, Animatable<Float, AnimationVectors2> animatable4) {
            this.$headerImageFadeIn = animatable;
            this.$headerImageTranslationY = animatable2;
            this.$viewState = cryptoFeeTierUpgradedViewState;
            this.$bodyAndFooterFadeIn = animatable3;
            this.$bodyTranslationY = animatable4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$17$lambda$2(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        private static final LottieComposition invoke$lambda$17$lambda$7(LottieCompositionResult lottieCompositionResult) {
            return lottieCompositionResult.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Modifier.Companion companion;
            CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState;
            Animatable<Float, AnimationVectors2> animatable;
            ?? r0;
            Animatable<Float, AnimationVectors2> animatable2;
            Composer composer2;
            int i2;
            boolean z;
            final ConstraintSetForInlineDsl constraintSetForInlineDsl;
            final SnapshotState snapshotState;
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-148850903, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgraded.<anonymous> (CryptoFeeTierUpgradedComposable.kt:198)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            final Animatable<Float, AnimationVectors2> animatable3 = this.$headerImageFadeIn;
            final Animatable<Float, AnimationVectors2> animatable4 = this.$headerImageTranslationY;
            CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState2 = this.$viewState;
            Animatable<Float, AnimationVectors2> animatable5 = this.$bodyAndFooterFadeIn;
            Animatable<Float, AnimationVectors2> animatable6 = this.$bodyTranslationY;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer, 0);
            Object[] objArr = new Object[0];
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue == companion5.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoFeeTierUpgradedComposableKt.C404033.invoke$lambda$17$lambda$1$lambda$0();
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer, 3072, 6);
            float f = 500;
            Modifier modifierScale = Scale2.scale(AspectRatio3.aspectRatio$default(SizeKt.m5176widthInVpY3zN4$default(companion2, 0.0f, C2002Dp.m7995constructorimpl(f), 1, null), 1.108f, false, 2, null), 1.2f);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(animatable3) | composer.changedInstance(animatable4);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion5.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoFeeTierUpgradedComposableKt.C404033.invoke$lambda$17$lambda$5$lambda$4(animatable3, animatable4, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierScale, (Function1) objRememberedValue2);
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(snapshotState2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion5.getEmpty()) {
                objRememberedValue3 = new CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$1$1(snapshotState2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 6);
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.CRYPTO_BOUNCING_BALL.getUrl().getUrl())), null, null, null, null, null, composer, 0, 62);
            if (cryptoFeeTierUpgradedViewState2.isContentLoading()) {
                composer.startReplaceGroup(-1733705571);
                BoxKt.Box(modifierGraphicsLayer, composer, 0);
                composer.endReplaceGroup();
                composer2 = composer;
                r0 = 0;
                animatable = animatable5;
                animatable2 = animatable6;
                companion = companion2;
                cryptoFeeTierUpgradedViewState = cryptoFeeTierUpgradedViewState2;
            } else {
                composer.startReplaceGroup(-1733496538);
                ContentScale fit = ContentScale.INSTANCE.getFit();
                LottieComposition lottieCompositionInvoke$lambda$17$lambda$7 = invoke$lambda$17$lambda$7(lottieCompositionResultRememberLottieComposition);
                boolean zInvoke$lambda$17$lambda$2 = invoke$lambda$17$lambda$2(snapshotState2);
                Integer num = LottieProperty.COLOR;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                companion = companion2;
                cryptoFeeTierUpgradedViewState = cryptoFeeTierUpgradedViewState2;
                animatable = animatable5;
                r0 = 0;
                animatable2 = animatable6;
                LottieAnimation2.LottieAnimation(lottieCompositionInvoke$lambda$17$lambda$7, modifierGraphicsLayer, zInvoke$lambda$17$lambda$2, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{LottieDynamicProperties2.rememberLottieDynamicProperty(num, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU())), new String[]{"**"}, composer, 6), LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.STROKE_COLOR, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU())), new String[]{"**"}, composer, 6)}, composer, LottieDynamicProperties3.$stable), null, fit, false, false, null, false, null, composer, 1572864, (LottieDynamicProperties.$stable << 9) | 196608, 0, 2056120);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            Modifier.Companion companion6 = companion;
            Spacer2.Spacer(Column5.weight$default(column6, companion6, 1.0f, false, 2, null), composer2, r0);
            composer2.startReplaceGroup(-1633490746);
            final Animatable<Float, AnimationVectors2> animatable7 = animatable;
            final Animatable<Float, AnimationVectors2> animatable8 = animatable2;
            boolean zChangedInstance2 = composer2.changedInstance(animatable7) | composer2.changedInstance(animatable8);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion5.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoFeeTierUpgradedComposableKt.C404033.invoke$lambda$17$lambda$9$lambda$8(animatable7, animatable8, (GraphicsLayerScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceGroup();
            Modifier modifierGraphicsLayer2 = GraphicsLayerModifier6.graphicsLayer(companion6, (Function1) objRememberedValue4);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, r0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierGraphicsLayer2);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            final CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState3 = cryptoFeeTierUpgradedViewState;
            LocalShowPlaceholder.Loadable(cryptoFeeTierUpgradedViewState.getTitleText() == null ? true : r0, null, null, ComposableLambda3.rememberComposableLambda(1720672301, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$3$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                    invoke(composer3, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720672301, i4, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgraded.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoFeeTierUpgradedComposable.kt:259)");
                    }
                    StringResource titleText = cryptoFeeTierUpgradedViewState3.getTitleText();
                    composer3.startReplaceGroup(3675288);
                    String string2 = titleText == null ? null : StringResource2.getString(titleText, composer3, StringResource.$stable);
                    composer3.endReplaceGroup();
                    if (string2 == null) {
                        string2 = StringsKt.repeat("---------", 2);
                    }
                    BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getDisplayCapsuleMedium(), composer3, 0, 0, 8126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer, 3072, 6);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme2.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), composer, r0);
            if (cryptoFeeTierUpgradedViewState3.getDescriptionText() == null) {
                i2 = i4;
                z = true;
            } else {
                i2 = i4;
                z = r0;
            }
            int i5 = i2;
            LocalShowPlaceholder.Loadable(z, null, null, ComposableLambda3.rememberComposableLambda(1634971158, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$3$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                    invoke(composer3, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1634971158, i6, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgraded.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoFeeTierUpgradedComposable.kt:267)");
                    }
                    StringResource descriptionText = cryptoFeeTierUpgradedViewState3.getDescriptionText();
                    composer3.startReplaceGroup(-750744319);
                    String string2 = descriptionText == null ? null : StringResource2.getString(descriptionText, composer3, StringResource.$stable);
                    composer3.endReplaceGroup();
                    if (string2 == null) {
                        string2 = StringsKt.repeat("---------", 6);
                    }
                    BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16318);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 3072, 6);
            composer.endNode();
            Spacer2.Spacer(Column5.weight$default(column6, companion6, 1.0f, false, 2, null), composer, r0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(animatable7) | composer.changedInstance(animatable8);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == companion5.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoFeeTierUpgradedComposableKt.C404033.invoke$lambda$17$lambda$12$lambda$11(animatable7, animatable8, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            Modifier modifierGraphicsLayer3 = GraphicsLayerModifier6.graphicsLayer(companion6, (Function1) objRememberedValue5);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, r0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierGraphicsLayer3);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme2.getSpacing(composer, i5).m21593getSmallD9Ej5fM()), composer, r0);
            final CryptoFeeTierUpgradedViewState2 feeRatesSection = cryptoFeeTierUpgradedViewState3.getFeeRatesSection();
            composer.startReplaceGroup(-443129778);
            if (feeRatesSection instanceof CryptoFeeTierUpgradedViewState2.Show) {
                Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m5176widthInVpY3zN4$default(companion6, 0.0f, C2002Dp.m7995constructorimpl(f), 1, null), 0.0f, 1, null), bentoTheme2.getSpacing(composer, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), CryptoFeeTierUpgradedComposableKt.FEE_RATES_SECTION_TEST_TAG);
                composer.startReplaceGroup(-1003410150);
                composer.startReplaceGroup(212064437);
                composer.endReplaceGroup();
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                Object objRememberedValue6 = composer.rememberedValue();
                if (objRememberedValue6 == companion5.getEmpty()) {
                    objRememberedValue6 = new Measurer2(density);
                    composer.updateRememberedValue(objRememberedValue6);
                }
                final Measurer2 measurer2 = (Measurer2) objRememberedValue6;
                Object objRememberedValue7 = composer.rememberedValue();
                if (objRememberedValue7 == companion5.getEmpty()) {
                    objRememberedValue7 = new ConstraintLayoutScope();
                    composer.updateRememberedValue(objRememberedValue7);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue7;
                Object objRememberedValue8 = composer.rememberedValue();
                if (objRememberedValue8 == companion5.getEmpty()) {
                    objRememberedValue8 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue8);
                }
                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue8;
                Object objRememberedValue9 = composer.rememberedValue();
                if (objRememberedValue9 == companion5.getEmpty()) {
                    objRememberedValue9 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composer.updateRememberedValue(objRememberedValue9);
                }
                final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue9;
                Object objRememberedValue10 = composer.rememberedValue();
                if (objRememberedValue10 == companion5.getEmpty()) {
                    objRememberedValue10 = SnapshotStateKt.mutableStateOf(unit, SnapshotStateKt.neverEqualPolicy());
                    composer.updateRememberedValue(objRememberedValue10);
                }
                final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue10;
                boolean zChangedInstance4 = composer.changedInstance(measurer2);
                final int i6 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                boolean zChanged2 = zChangedInstance4 | composer.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                Object objRememberedValue11 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue11 == companion5.getEmpty()) {
                    objRememberedValue11 = new MeasurePolicy() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$invoke$lambda$17$lambda$16$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i7);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            snapshotState4.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i6);
                            snapshotState3.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$invoke$lambda$17$lambda$16$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                }
                            }, 4, null);
                        }
                    };
                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                    snapshotState = snapshotState3;
                    composer.updateRememberedValue(objRememberedValue11);
                } else {
                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                    snapshotState = snapshotState3;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue11;
                Object objRememberedValue12 = composer.rememberedValue();
                if (objRememberedValue12 == companion5.getEmpty()) {
                    objRememberedValue12 = new Function0<Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$invoke$lambda$17$lambda$16$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl.setKnownDirty(true);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue12);
                }
                final Function0 function0 = (Function0) objRememberedValue12;
                boolean zChangedInstance5 = composer.changedInstance(measurer2);
                Object objRememberedValue13 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue13 == companion5.getEmpty()) {
                    objRememberedValue13 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$invoke$lambda$17$lambda$16$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue13);
                }
                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierTestTag, r0, (Function1) objRememberedValue13, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$invoke$lambda$17$lambda$16$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                        invoke(composer3, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i7, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState4.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                            constraintLayoutScope.reset();
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            composer3.startReplaceGroup(1917249285);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            Modifier.Companion companion7 = Modifier.INSTANCE;
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue14 = composer3.rememberedValue();
                            Composer.Companion companion8 = Composer.INSTANCE;
                            if (objRememberedValue14 == companion8.getEmpty()) {
                                objRememberedValue14 = C40404x983fb944.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue14);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion7, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue14);
                            CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay currentTierFeeRateDisplay = ((CryptoFeeTierUpgradedViewState2.Show) feeRatesSection).getCurrentTierFeeRateDisplay();
                            StringResource title = currentTierFeeRateDisplay != null ? currentTierFeeRateDisplay.getTitle() : null;
                            composer3.startReplaceGroup(-1046518302);
                            String string2 = title == null ? null : StringResource2.getString(title, composer3, StringResource.$stable);
                            composer3.endReplaceGroup();
                            CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay currentTierFeeRateDisplay2 = ((CryptoFeeTierUpgradedViewState2.Show) feeRatesSection).getCurrentTierFeeRateDisplay();
                            String feeRate = currentTierFeeRateDisplay2 != null ? currentTierFeeRateDisplay2.getFeeRate() : null;
                            Alignment.Companion companion9 = Alignment.INSTANCE;
                            Alignment.Horizontal start = companion9.getStart();
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            CryptoFeeTierUpgradedComposableKt.m25892FeeRateT042LqI(string2, feeRate, bentoTheme3.getColors(composer3, i8).m21425getFg0d7_KjU(), start, modifierConstrainAs, composer3, 3072, 0);
                            LocalShowPlaceholder.Loadable(cryptoFeeTierUpgradedViewState3.isContentLoading(), null, null, ComposableLambda3.rememberComposableLambda(-1610577433, true, new C40405x5b437678(constraintLayoutScope2, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component1), composer3, 54), composer3, 3072, 6);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue15 = composer3.rememberedValue();
                            if (objRememberedValue15 == companion8.getEmpty()) {
                                objRememberedValue15 = C40407x983fc0c6.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue15);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion7, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue15);
                            CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay nextTierFeeRateDisplay = ((CryptoFeeTierUpgradedViewState2.Show) feeRatesSection).getNextTierFeeRateDisplay();
                            StringResource title2 = nextTierFeeRateDisplay != null ? nextTierFeeRateDisplay.getTitle() : null;
                            composer3.startReplaceGroup(-1046471230);
                            String string3 = title2 == null ? null : StringResource2.getString(title2, composer3, StringResource.$stable);
                            composer3.endReplaceGroup();
                            CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay nextTierFeeRateDisplay2 = ((CryptoFeeTierUpgradedViewState2.Show) feeRatesSection).getNextTierFeeRateDisplay();
                            CryptoFeeTierUpgradedComposableKt.m25892FeeRateT042LqI(string3, nextTierFeeRateDisplay2 != null ? nextTierFeeRateDisplay2.getFeeRate() : null, bentoTheme3.getColors(composer3, i8).m21426getFg20d7_KjU(), companion9.getEnd(), modifierConstrainAs2, composer3, 3072, 0);
                            composer3.endReplaceGroup();
                            if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function0, composer3, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer, 54), measurePolicy, composer, 48, 0);
                composer.endReplaceGroup();
            } else if (!(feeRatesSection instanceof CryptoFeeTierUpgradedViewState2.Hidden)) {
                throw new NoWhenBranchMatchedException();
            }
            composer.endReplaceGroup();
            composer.endNode();
            Spacer2.Spacer(Column5.weight$default(column6, companion6, 1.0f, false, 2, null), composer, r0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SnapshotState invoke$lambda$17$lambda$1$lambda$0() {
            return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$17$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$17$lambda$5$lambda$4(Animatable animatable, Animatable animatable2, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(((Number) animatable.getValue()).floatValue());
            graphicsLayer.setTranslationY(((Number) animatable2.getValue()).floatValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$17$lambda$9$lambda$8(Animatable animatable, Animatable animatable2, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(((Number) animatable.getValue()).floatValue());
            graphicsLayer.setTranslationY(((Number) animatable2.getValue()).floatValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$17$lambda$12$lambda$11(Animatable animatable, Animatable animatable2, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(((Number) animatable.getValue()).floatValue());
            graphicsLayer.setTranslationY(((Number) animatable2.getValue()).floatValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoFeeTierUpgraded$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoFeeTierUpgradedViewState CryptoFeeTierUpgradedComposable$lambda$0(SnapshotState4<CryptoFeeTierUpgradedViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: CryptoFeeTierUpgradedComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$2 */
    static final class C404022 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ Animatable<Float, AnimationVectors2> $bodyAndFooterFadeIn;
        final /* synthetic */ Function0<Unit> $finishPostOrderFlow;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $footerTranslationY;
        final /* synthetic */ Function0<Unit> $onContinueToNotificationPrimer;
        final /* synthetic */ CryptoFeeTierUpgradedViewState $viewState;

        C404022(Animatable<Float, AnimationVectors2> animatable, Animatable<Float, AnimationVectors2> animatable2, CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState, Function0<Unit> function0, Function0<Unit> function02) {
            this.$bodyAndFooterFadeIn = animatable;
            this.$footerTranslationY = animatable2;
            this.$viewState = cryptoFeeTierUpgradedViewState;
            this.$finishPostOrderFlow = function0;
            this.$onContinueToNotificationPrimer = function02;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649550084, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgraded.<anonymous> (CryptoFeeTierUpgradedComposable.kt:335)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$bodyAndFooterFadeIn) | composer.changedInstance(this.$footerTranslationY);
            final Animatable<Float, AnimationVectors2> animatable = this.$bodyAndFooterFadeIn;
            final Animatable<Float, AnimationVectors2> animatable2 = this.$footerTranslationY;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoFeeTierUpgradedComposableKt.C404022.invoke$lambda$1$lambda$0(animatable, animatable2, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState = this.$viewState;
            Function0<Unit> function0 = this.$finishPostOrderFlow;
            Function0<Unit> function02 = this.$onContinueToNotificationPrimer;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierGraphicsLayer);
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
            LocalShowPlaceholder.Loadable(cryptoFeeTierUpgradedViewState.getHelperText() == null, null, null, ComposableLambda3.rememberComposableLambda(1514515842, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$2$2$1
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
                        ComposerKt.traceEventStart(1514515842, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgraded.<anonymous>.<anonymous>.<anonymous> (CryptoFeeTierUpgradedComposable.kt:345)");
                    }
                    StringResource helperText = cryptoFeeTierUpgradedViewState.getHelperText();
                    composer2.startReplaceGroup(-544186419);
                    String string2 = helperText == null ? null : StringResource2.getString(helperText, composer2, StringResource.$stable);
                    composer2.endReplaceGroup();
                    if (string2 == null) {
                        string2 = StringsKt.repeat("---------", 3);
                    }
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    String str = string2;
                    BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextS(), composer2, 0, 0, 8122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 3072, 6);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
            LocalShowPlaceholder.Loadable(cryptoFeeTierUpgradedViewState.getPrimaryButton() == null, null, null, ComposableLambda3.rememberComposableLambda(1956708729, true, new CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$2$2$2(cryptoFeeTierUpgradedViewState, function0, function02), composer, 54), composer, 3072, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Animatable animatable, Animatable animatable2, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(((Number) animatable.getValue()).floatValue());
            graphicsLayer.setTranslationY(((Number) animatable2.getValue()).floatValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoFeeTierUpgradedComposable(final CryptoFeeTierInfo cryptoFeeTierInfo, final Boolean bool, final Function0<Unit> finishPostOrderFlow, final Function0<Unit> onContinueToNotificationPrimer, Modifier modifier, CryptoFeeTierUpgradedDuxo cryptoFeeTierUpgradedDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoFeeTierUpgradedDuxo cryptoFeeTierUpgradedDuxo2;
        int i4;
        Modifier modifier3;
        int i5;
        Composer composer2;
        final CryptoFeeTierUpgradedDuxo cryptoFeeTierUpgradedDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final CryptoFeeTierUpgradedDuxo cryptoFeeTierUpgradedDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(finishPostOrderFlow, "finishPostOrderFlow");
        Intrinsics.checkNotNullParameter(onContinueToNotificationPrimer, "onContinueToNotificationPrimer");
        Composer composerStartRestartGroup = composer.startRestartGroup(236762937);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoFeeTierInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(bool) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(finishPostOrderFlow) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueToNotificationPrimer) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    cryptoFeeTierUpgradedDuxo2 = cryptoFeeTierUpgradedDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(cryptoFeeTierUpgradedDuxo2) ? 131072 : 65536;
                    i3 |= i7;
                } else {
                    cryptoFeeTierUpgradedDuxo2 = cryptoFeeTierUpgradedDuxo;
                }
                i3 |= i7;
            } else {
                cryptoFeeTierUpgradedDuxo2 = cryptoFeeTierUpgradedDuxo;
            }
            i4 = i3;
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    modifier3 = modifier2;
                    cryptoFeeTierUpgradedDuxo3 = cryptoFeeTierUpgradedDuxo2;
                    i5 = 0;
                    composer2 = composerStartRestartGroup;
                } else {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        CryptoFeeTierUpgradedDuxo.Args args = new CryptoFeeTierUpgradedDuxo.Args(cryptoFeeTierInfo, bool);
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
                        composer2 = composerStartRestartGroup;
                        i5 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoFeeTierUpgradedDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgradedComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgradedComposable$$inlined$duxo$1.1
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
                        i4 &= -458753;
                        cryptoFeeTierUpgradedDuxo3 = (CryptoFeeTierUpgradedDuxo) baseDuxo;
                    } else {
                        i5 = 0;
                        composer2 = composerStartRestartGroup;
                        cryptoFeeTierUpgradedDuxo3 = cryptoFeeTierUpgradedDuxo2;
                    }
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(236762937, i4, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposable (CryptoFeeTierUpgradedComposable.kt:93)");
                }
                Composer composer4 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierUpgradedDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                final Modifier modifier5 = modifier3;
                CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(eventDescriptor(CryptoFeeTierUpgradedComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEventContext(), composer3, i5)), ComposableLambda3.rememberComposableLambda(-330757511, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgradedComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i8) {
                        if ((i8 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-330757511, i8, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposable.<anonymous> (CryptoFeeTierUpgradedComposable.kt:99)");
                        }
                        CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewStateCryptoFeeTierUpgradedComposable$lambda$0 = CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgradedComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        CryptoFeeTierUpgradedDuxo cryptoFeeTierUpgradedDuxo5 = cryptoFeeTierUpgradedDuxo3;
                        composer5.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer5.changedInstance(cryptoFeeTierUpgradedDuxo5);
                        Object objRememberedValue2 = composer5.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new C40409xeb3f0784(cryptoFeeTierUpgradedDuxo5);
                            composer5.updateRememberedValue(objRememberedValue2);
                        }
                        composer5.endReplaceGroup();
                        CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgraded(cryptoFeeTierUpgradedViewStateCryptoFeeTierUpgradedComposable$lambda$0, finishPostOrderFlow, onContinueToNotificationPrimer, (Function0) ((KFunction) objRememberedValue2), modifier5, false, composer5, 0, 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoFeeTierUpgradedDuxo4 = cryptoFeeTierUpgradedDuxo3;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoFeeTierUpgradedDuxo4 = cryptoFeeTierUpgradedDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgradedComposable$lambda$1(cryptoFeeTierInfo, bool, finishPostOrderFlow, onContinueToNotificationPrimer, modifier4, cryptoFeeTierUpgradedDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        i4 = i3;
        if ((74899 & i4) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i6 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                final SnapshotState4<CryptoFeeTierUpgradedViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierUpgradedDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer3 = composer42;
                final Modifier modifier52 = modifier3;
                CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(eventDescriptor(CryptoFeeTierUpgradedComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getEventContext(), composer3, i5)), ComposableLambda3.rememberComposableLambda(-330757511, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgradedComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i8) {
                        if ((i8 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-330757511, i8, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposable.<anonymous> (CryptoFeeTierUpgradedComposable.kt:99)");
                        }
                        CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewStateCryptoFeeTierUpgradedComposable$lambda$0 = CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgradedComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                        CryptoFeeTierUpgradedDuxo cryptoFeeTierUpgradedDuxo5 = cryptoFeeTierUpgradedDuxo3;
                        composer5.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer5.changedInstance(cryptoFeeTierUpgradedDuxo5);
                        Object objRememberedValue2 = composer5.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new C40409xeb3f0784(cryptoFeeTierUpgradedDuxo5);
                            composer5.updateRememberedValue(objRememberedValue2);
                        }
                        composer5.endReplaceGroup();
                        CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgraded(cryptoFeeTierUpgradedViewStateCryptoFeeTierUpgradedComposable$lambda$0, finishPostOrderFlow, onContinueToNotificationPrimer, (Function0) ((KFunction) objRememberedValue2), modifier52, false, composer5, 0, 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoFeeTierUpgradedDuxo4 = cryptoFeeTierUpgradedDuxo3;
                modifier4 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoFeeTierUpgraded(final CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState, Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function04;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        final boolean z3;
        boolean z4;
        Object objRememberedValue;
        SnapshotState snapshotState;
        float fMo5016toPx0680j_4;
        float fMo5016toPx0680j_42;
        Object objRememberedValue2;
        Composer.Companion companion;
        Animatable animatable;
        Object objRememberedValue3;
        Animatable animatable2;
        Object objRememberedValue4;
        Animatable animatable3;
        Object objRememberedValue5;
        Animatable animatable4;
        Object objRememberedValue6;
        Animatable animatable5;
        boolean zChanged;
        Object objRememberedValue7;
        Animatable animatable6;
        Animatable animatable7;
        Animatable animatable8;
        Animatable animatable9;
        Animatable animatable10;
        final boolean z5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function0<Unit> function05 = function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(1407700241);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoFeeTierUpgradedViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function05) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function04 = function02;
                i3 |= composerStartRestartGroup.changedInstance(function04) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i5 == 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1407700241, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgraded (CryptoFeeTierUpgradedComposable.kt:117)");
                        }
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z4 = (i3 & 458752) != 131072;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgraded$lambda$3$lambda$2(z3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z6 = z3;
                        snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                        fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(72));
                        fMo5016toPx0680j_42 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(200));
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = Animatable2.Animatable$default(CryptoFeeTierUpgraded$lambda$4(snapshotState) ? 1.0f : 0.0f, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        animatable = (Animatable) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = Animatable2.Animatable$default(CryptoFeeTierUpgraded$lambda$4(snapshotState) ? 0.0f : fMo5016toPx0680j_4, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        animatable2 = (Animatable) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            Animatable animatableAnimatable$default = Animatable2.Animatable$default(CryptoFeeTierUpgraded$lambda$4(snapshotState) ? 1.0f : 0.0f, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(animatableAnimatable$default);
                            objRememberedValue4 = animatableAnimatable$default;
                        }
                        animatable3 = (Animatable) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = Animatable2.Animatable$default(CryptoFeeTierUpgraded$lambda$4(snapshotState) ? 0.0f : fMo5016toPx0680j_4, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        animatable4 = (Animatable) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = Animatable2.Animatable$default(CryptoFeeTierUpgraded$lambda$4(snapshotState) ? 0.0f : fMo5016toPx0680j_42, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        animatable5 = (Animatable) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changedInstance(animatable4) | composerStartRestartGroup.changedInstance(animatable5) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable3);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue7 == companion.getEmpty()) {
                            animatable6 = animatable5;
                            animatable7 = animatable4;
                            animatable8 = animatable3;
                            animatable9 = animatable;
                            animatable10 = animatable2;
                            objRememberedValue7 = new CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1(animatable10, fMo5016toPx0680j_4, animatable7, animatable6, fMo5016toPx0680j_42, snapshotState, animatable9, animatable8, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        } else {
                            animatable6 = animatable5;
                            animatable7 = animatable4;
                            animatable8 = animatable3;
                            animatable9 = animatable;
                            animatable10 = animatable2;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 6);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifier5 = modifier4;
                        function05 = function0;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifier5, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), false, ComposableLambda3.rememberComposableLambda(-649550084, true, new C404022(animatable8, animatable6, cryptoFeeTierUpgradedViewState, function0, function04), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-148850903, true, new C404033(animatable9, animatable10, cryptoFeeTierUpgradedViewState, animatable8, animatable7), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
                        if (cryptoFeeTierUpgradedViewState.getShowError()) {
                            String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_order_confirmation_your_fee_tier_upgraded_error_title, composerStartRestartGroup, 0);
                            BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(StringResources_androidKt.stringResource(C40095R.string.f6286x25e5761, composerStartRestartGroup, 0));
                            BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.f6285xa7129692, composerStartRestartGroup, 0), function03);
                            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.crypto_order_confirmation_your_fee_tier_upgraded_error_cta_exit, composerStartRestartGroup, 0), function05);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            Function0 function06 = (Function0) objRememberedValue8;
                            composerStartRestartGroup.endReplaceGroup();
                            int i7 = (BentoAlertDialog2.Body.MarkdownText.$stable << 3) | 100663296;
                            int i8 = BentoAlertButton.$stable;
                            BentoAlertDialog.BentoAlertDialog(strStringResource, markdownText, bentoAlertButton, null, bentoAlertButton2, null, false, null, function06, composerStartRestartGroup, i7 | (i8 << 6) | (i8 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                            composerStartRestartGroup = composerStartRestartGroup;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z6;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z5 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgraded$lambda$16(cryptoFeeTierUpgradedViewState, function05, function02, function03, modifier3, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z2 = z;
                if ((74899 & i3) == 74898) {
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    Object[] objArr2 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 458752) != 131072) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgraded$lambda$3$lambda$2(z3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z62 = z3;
                        snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                        fMo5016toPx0680j_4 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(72));
                        fMo5016toPx0680j_42 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(200));
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        animatable = (Animatable) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        animatable2 = (Animatable) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                        }
                        animatable3 = (Animatable) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                        }
                        animatable4 = (Animatable) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                        }
                        animatable5 = (Animatable) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changedInstance(animatable4) | composerStartRestartGroup.changedInstance(animatable5) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable3);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            animatable6 = animatable5;
                            animatable7 = animatable4;
                            animatable8 = animatable3;
                            animatable9 = animatable;
                            animatable10 = animatable2;
                            objRememberedValue7 = new CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$1$1(animatable10, fMo5016toPx0680j_4, animatable7, animatable6, fMo5016toPx0680j_42, snapshotState, animatable9, animatable8, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 6);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i62 = BentoTheme.$stable;
                            Modifier modifier52 = modifier4;
                            function05 = function0;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifier52, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM()), (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), false, ComposableLambda3.rememberComposableLambda(-649550084, true, new C404022(animatable8, animatable6, cryptoFeeTierUpgradedViewState, function0, function04), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-148850903, true, new C404033(animatable9, animatable10, cryptoFeeTierUpgradedViewState, animatable8, animatable7), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
                            if (cryptoFeeTierUpgradedViewState.getShowError()) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z5 = z62;
                            modifier3 = modifier52;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z2 = z;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function04 = function02;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoFeeTierUpgraded$lambda$3$lambda$2(boolean z) {
        return SnapshotState3.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoFeeTierUpgraded$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: FeeRate-T042LqI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25892FeeRateT042LqI(final String str, final String str2, final long j, final Alignment.Horizontal horizontal, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-85294368);
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
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontal) ? 2048 : 1024;
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
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-85294368, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.FeeRate (CryptoFeeTierUpgradedComposable.kt:411)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, composerStartRestartGroup, ((((i3 >> 12) & 14) | ((i3 >> 3) & 896)) >> 3) & 112);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                LocalShowPlaceholder.Loadable(str != null, null, null, ComposableLambda3.rememberComposableLambda(1181359206, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$FeeRate$1$1
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
                            ComposerKt.traceEventStart(1181359206, i5, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.FeeRate.<anonymous>.<anonymous> (CryptoFeeTierUpgradedComposable.kt:414)");
                        }
                        String strRepeat = str;
                        if (strRepeat == null) {
                            strRepeat = StringsKt.repeat(OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, 2);
                        }
                        BentoText2.m20747BentoText38GnDrw(strRepeat, null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                LocalShowPlaceholder.Loadable(str2 != null, null, null, ComposableLambda3.rememberComposableLambda(-1775078435, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$FeeRate$1$2
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
                            ComposerKt.traceEventStart(-1775078435, i5, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.FeeRate.<anonymous>.<anonymous> (CryptoFeeTierUpgradedComposable.kt:420)");
                        }
                        String str3 = str2;
                        if (str3 == null) {
                            str3 = "----";
                        }
                        BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoFeeTierUpgradedComposableKt.FeeRate_T042LqI$lambda$18(str, str2, j, horizontal, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, composerStartRestartGroup, ((((i3 >> 12) & 14) | ((i3 >> 3) & 896)) >> 3) & 112);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                LocalShowPlaceholder.Loadable(str != null, null, null, ComposableLambda3.rememberComposableLambda(1181359206, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$FeeRate$1$1
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
                            ComposerKt.traceEventStart(1181359206, i5, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.FeeRate.<anonymous>.<anonymous> (CryptoFeeTierUpgradedComposable.kt:414)");
                        }
                        String strRepeat = str;
                        if (strRepeat == null) {
                            strRepeat = StringsKt.repeat(OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, 2);
                        }
                        BentoText2.m20747BentoText38GnDrw(strRepeat, null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                LocalShowPlaceholder.Loadable(str2 != null, null, null, ComposableLambda3.rememberComposableLambda(-1775078435, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$FeeRate$1$2
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
                            ComposerKt.traceEventStart(-1775078435, i5, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.FeeRate.<anonymous>.<anonymous> (CryptoFeeTierUpgradedComposable.kt:420)");
                        }
                        String str3 = str2;
                        if (str3 == null) {
                            str3 = "----";
                        }
                        BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final UserInteractionEventDescriptor eventDescriptor(Context context, Composer composer, int i) {
        composer.startReplaceGroup(-770961922);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-770961922, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.eventDescriptor (CryptoFeeTierUpgradedComposable.kt:430)");
        }
        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
        Screen screen = userInteractionEventDescriptor.getScreen();
        UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, screen != null ? Screen.copy$default(screen, null, null, SCREEN_IDENTIFIER, null, 11, null) : null, null, context, null, null, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return userInteractionEventDescriptorCopy$default;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1138308312);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1138308312, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.Preview (CryptoFeeTierUpgradedComposable.kt:446)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, null, null, null, null, null, 63, null))}, ComposableSingletons$CryptoFeeTierUpgradedComposableKt.INSTANCE.m25889getLambda$1747886488$feature_trade_crypto_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeTierUpgradedComposableKt.Preview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
